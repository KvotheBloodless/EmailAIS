
package au.com.venilia.emailais.signalk.model;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum AlertMethod {

    VISUAL("visual"),
    SOUND("sound");
    private final String value;
    private final static Map<String, AlertMethod> CONSTANTS = new HashMap<String, AlertMethod>();

    static {
        for (AlertMethod c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private AlertMethod(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static AlertMethod fromValue(String value) {
        AlertMethod constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
