package org.dkovalenko.customcontrol;

import org.dkovalenko.customcontrol.api.ControlLevel;

public enum DefaultControlLevels implements ControlLevel {

    INFO("info", "Information level", true),
    WARNING("warning", "Warning level", true),
    ERROR("error", "Error level", false)
    ;

    private final String code;

    private final String description;

    private final boolean allowable;

    DefaultControlLevels(String code, String description, boolean allowable) {
        this.code = code;
        this.description = description;
        this.allowable = allowable;
    }

    @Override
    public String getCode() {
        return code;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public boolean isAllowable() {
        return allowable;
    }
}
