package org.dkovalenko.customcontrol.v2;

public interface Control<T, K extends ControlLevel> {

    ControlResult<K> validate(T entity, LocalValidationContext validationContext);

    ControlType<K> getType();

    Class<T> getEntityType();
}
