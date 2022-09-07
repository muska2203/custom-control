package org.dkovalenko.customcontrol.v2;

import java.util.ArrayList;
import java.util.List;

/**
 * Глобальный валидатор, который может валидировать любой объект. Для определения подходящих контролей использует {@link ControlManager}
 * @param <K> Реализация уровня контролей.
 */
public class ControlValidator<K extends ControlLevel> {

    private final ControlManager<K> controlManager;

    public ControlValidator(ControlManager<K> controlManager) {
        this.controlManager = controlManager;
    }

    @SuppressWarnings("unchecked")
    public <T> List<ValidationError<K>> validate(T entity, ValidationContext validationContext) {
        Iterable<Control<T, K>> controls = controlManager.getControlsFor((Class<T>) entity.getClass());
        List<ValidationError<K>> validationErrors = new ArrayList<>();
        for (Control<T, K> control : controls) {
            LocalValidationContext localValidationContext = new LocalValidationContext(validationContext);
            ControlResult<K> controlResult = control.validate(entity, localValidationContext);
            if (!controlResult.isValid()) {
                validationErrors.add(new ValidationError<>(controlResult.getControlType(), controlResult.getMessage()));
            }
        }
        return validationErrors;
    }
}
