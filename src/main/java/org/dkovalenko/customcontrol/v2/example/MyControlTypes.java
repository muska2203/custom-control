package org.dkovalenko.customcontrol.v2.example;

import org.dkovalenko.customcontrol.v2.ControlType;

public enum MyControlTypes implements ControlType<MyControlLevels> {
    MY_CLASS_CONTROL_1("MY_CLASS_CONTROL_1", MyControlLevels.ERROR, "my message1: name should be not null"),
    MY_CLASS_CONTROL_2("MY_CLASS_CONTROL_2", MyControlLevels.WARN, "my message2: year should be more then 1"),
    ;

    private final String code;
    private final MyControlLevels level;
    private final String messageTemplate;

    MyControlTypes(String code, MyControlLevels level, String messageTemplate) {
        this.code = code;
        this.level = level;
        this.messageTemplate = messageTemplate;
    }

    @Override
    public String getCode() {
        return code;
    }

    @Override
    public MyControlLevels getControlLevel() {
        return level;
    }

    @Override
    public String getMessageTemplate() {
        return messageTemplate;
    }
}
