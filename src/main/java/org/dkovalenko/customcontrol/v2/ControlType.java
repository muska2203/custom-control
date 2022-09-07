package org.dkovalenko.customcontrol.v2;

/**
 * Тип контроля, используется для предоставления справочной информации о контроле.
 */
public interface ControlType<T extends ControlLevel> {

    String getCode();

    T getControlLevel();

    String getMessageTemplate();
}
