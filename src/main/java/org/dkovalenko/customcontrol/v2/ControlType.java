package org.dkovalenko.customcontrol.v2;

public interface ControlType<T extends ControlLevel> {

    String getCode();

    T getControlLevel();

    String getMessageTemplate();
}
