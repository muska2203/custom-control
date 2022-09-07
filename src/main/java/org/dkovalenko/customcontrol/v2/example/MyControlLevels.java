package org.dkovalenko.customcontrol.v2.example;

import org.dkovalenko.customcontrol.v2.ControlLevel;

public enum MyControlLevels implements ControlLevel {

    WARN(0),
    ERROR(1)
    ;

    private Integer code;

    MyControlLevels(Integer code) {
        this.code = code;
    }

    @Override
    public Integer getCode() {
        return code;
    }
}
