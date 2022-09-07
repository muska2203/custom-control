package org.dkovalenko.customcontrol.v2;

public class ValidationError<T extends ControlLevel> {

    private final ControlType<T> controlType;

    private final String message;

    public ValidationError(ControlType<T> controlType, String message) {
        this.controlType = controlType;
        this.message = message;
    }

    public ControlType<T> getControlType() {
        return controlType;
    }

    public String getMessage() {
        return message;
    }
}
