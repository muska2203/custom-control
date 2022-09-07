package org.dkovalenko.customcontrol.v2;

public class ControlResultImpl<T extends ControlLevel> implements ControlResult<T> {

    private final boolean valid;

    private final ControlType<T> controlType;

    private final String message;

    public ControlResultImpl(boolean valid, ControlType<T> controlType, String message) {
        this.valid = valid;
        this.controlType = controlType;
        this.message = message;
    }

    @Override
    public boolean isValid() {
        return valid;
    }

    @Override
    public ControlType<T> getControlType() {
        return controlType;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
