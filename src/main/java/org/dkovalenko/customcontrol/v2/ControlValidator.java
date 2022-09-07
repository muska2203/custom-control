package org.dkovalenko.customcontrol.v2;

import java.util.ArrayList;
import java.util.List;

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
            ControlResult<K> controlResult = control.validate(entity, validationContext);
            if (!controlResult.isValid()) {
                validationErrors.add(new ValidationError<>(controlResult.getControlType(), controlResult.getMessage()));
            }
        }
        return validationErrors;
    }
}
