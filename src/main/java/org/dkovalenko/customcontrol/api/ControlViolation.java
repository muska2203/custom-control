package org.dkovalenko.customcontrol.api;

public interface ControlViolation<T extends ControlLevel> {

    String getCode();

    String getDescription();

    T getLevel();
}
