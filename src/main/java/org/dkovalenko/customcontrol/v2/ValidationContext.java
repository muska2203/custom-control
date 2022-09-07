package org.dkovalenko.customcontrol.v2;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Данный контексто будет применятся в нескольких контролях, возможно пвыполняющихся параллельно,
 * так что все операции должны поддерживать использование в многопоточном коде.
 */
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
