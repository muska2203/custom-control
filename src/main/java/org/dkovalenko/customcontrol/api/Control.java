package org.dkovalenko.customcontrol.api;

public interface Control<K, T extends ControlLevel> {

    boolean test(K entity, ValidationContext validationContext);

    T getLevel();
}
