package org.dkovalenko.customcontrol.api;

import java.util.List;

public interface ControlResult<T extends ControlViolation<K>, K extends ControlLevel> {

    boolean isValid();

    List<T> getViolations();
}
