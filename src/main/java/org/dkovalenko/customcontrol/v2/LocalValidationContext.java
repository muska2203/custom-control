package org.dkovalenko.customcontrol.v2;

import java.util.HashMap;
import java.util.Map;

public class LocalValidationContext {

    private final ValidationContext globalContext;

    private final Map<String, Object> localContext = new HashMap<>();

    public LocalValidationContext(ValidationContext globalContext) {
        this.globalContext = globalContext;
    }

    public ValidationContext getGlobalContext() {
        return globalContext;
    }

    @SuppressWarnings("unchecked")
    <T> T getValue(String code) {
        return (T) localContext.get(code);
    }

    <T> void setValue(String code, T value) {
        localContext.put(code, value);
    }
}
