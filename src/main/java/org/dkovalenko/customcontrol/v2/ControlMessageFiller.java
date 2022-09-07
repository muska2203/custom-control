package org.dkovalenko.customcontrol.v2;

/**
 * Реализация данного интерфейса умеет заполнять шаблон сообщений контролей.
 * Например добавлять в строку "test message {}" указанную строку "inject" следующим образом - "test message inject".
 * Формат шаблона и условия заполнения зависят от реализации данного интерфейса.
 */
public interface ControlMessageFiller {

    String fillMessage(String message, String... args);
}
