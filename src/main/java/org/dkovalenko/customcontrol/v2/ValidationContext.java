package org.dkovalenko.customcontrol.v2;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ValidationContext {

    Map<String, Object> context = new ConcurrentHashMap<>();

    @SuppressWarnings("unchecked")
    <T> T getValue(String code) {
        return (T) context.get(code);
    }

    <T> void setValue(String code, T value) {
        context.put(code, value);
    }
}
