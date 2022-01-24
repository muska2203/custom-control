package org.dkovalenko.customcontrol;

import org.dkovalenko.customcontrol.api.ControlLevel;
import org.dkovalenko.customcontrol.api.ControlViolation;

public class ControlViolationImpl<T extends ControlLevel> implements ControlViolation<T> {

    private final String code;

    private final String description;

    private final T level;

    public ControlViolationImpl(String code, String description, T level) {
        this.code = code;
        this.description = description;
        this.level = level;
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
    public T getLevel() {
        return level;
    }
}
