package org.dkovalenko.customcontrol;

import org.dkovalenko.customcontrol.api.ControlLevel;
import org.dkovalenko.customcontrol.api.ControlResult;

import java.util.ArrayList;
import java.util.List;

public class ControlResultImpl<T extends ControlViolationImpl<K>, K extends ControlLevel> implements ControlResult<T, K> {

    private boolean valid;

    private final List<T> violations = new ArrayList<>();

    private void registerViolation() {

    }


    @Override
    public boolean isValid() {
        return valid;
    }

    @Override
    public List<T> getViolations() {
        return new ArrayList<>(violations);
    }
}
