package org.dkovalenko.customcontrol.v2;

/**
 * Результат выполнения контроля. Возможно стоит объединить с {@link ValidationError}
 */
public interface ControlResult<T extends ControlLevel> {

    boolean isValid();

    ControlType<T> getControlType();

    String getMessage();

    static <K extends ControlLevel> ControlResult<K> valid(ControlType<K> controlType) {
        return new ControlResultImpl<>(true, controlType, null);
    }

    static <K extends ControlLevel> ControlResult<K> invalid(ControlType<K> controlType, String message) {
        return new ControlResultImpl<>(false, controlType, message);
    }
}
