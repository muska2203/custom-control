package org.dkovalenko.customcontrol.v2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Объект данного класса ведет учет контролей, которые были к нему подключены.
 * Также может найти нужные контроли по типу обрабатываемого объекта
 */
public class ControlManager<K extends ControlLevel> {

    Map<Class<?>, List<Control<?, K>>> controlMap = new HashMap<>();

    public void register(Control<?, K> control) {
        List<Control<?, K>> controls = controlMap.computeIfAbsent(control.getEntityType(), k -> new ArrayList<>());
        controls.add(control);
    }

    @SuppressWarnings("unchecked")
    public <T> Iterable<Control<T, K>> getControlsFor(Class<T> type) {
        return controlMap.get(type).stream()
                .map(control -> (Control<T, K>) control)
                .collect(Collectors.toList());
    }
}
