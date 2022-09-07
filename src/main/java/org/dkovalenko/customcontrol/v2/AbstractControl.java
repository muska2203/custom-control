package org.dkovalenko.customcontrol.v2;

/**
 * Дефолтная реализация контроля
 */
public abstract class AbstractControl<T, K extends ControlLevel> implements Control<T, K> {

    private ControlMessageFiller controlMessageFiller;

    @Override
    public ControlResult<K> validate(T entity, LocalValidationContext validationContext) {
        ControlType<K> controlType = getType();
        if (!isApplicable(entity, validationContext) || isValid(entity, validationContext)) {
            return ControlResult.valid(controlType);
        }
        String messageTemplate = controlType.getMessageTemplate();
        String message = controlMessageFiller == null ? messageTemplate : controlMessageFiller.fillMessage(messageTemplate, getMessageArgs(entity, validationContext));
        return ControlResult.invalid(controlType, message);
    }

    protected abstract boolean isValid(T entity, LocalValidationContext validationContext);

    protected String[] getMessageArgs(T entity, LocalValidationContext validationContext) {
        return new String[] {};
    }

    protected abstract boolean isApplicable(T entity, LocalValidationContext validationContext);

    public void setControlMessageFiller(ControlMessageFiller filler) {
        this.controlMessageFiller = filler;
    }
}
