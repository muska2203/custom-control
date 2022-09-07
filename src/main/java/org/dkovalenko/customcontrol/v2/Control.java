package org.dkovalenko.customcontrol.v2;

/**
 * Представляет общий интерфейс контролей, которые могут проверять объекты указаннгого типа.
 */
public interface Control<T, K extends ControlLevel> {

    ControlResult<K> validate(T entity, LocalValidationContext validationContext);

    ControlType<K> getType();

    Class<T> getEntityType();
}
