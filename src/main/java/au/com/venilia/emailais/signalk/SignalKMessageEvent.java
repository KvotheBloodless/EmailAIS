package au.com.venilia.emailais.signalk;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.springframework.context.ApplicationEvent;

import au.com.venilia.emailais.signalk.SignalKClient.SignalKPath;

public class SignalKMessageEvent extends ApplicationEvent {

    private final SignalKPath path;
    private final Object value;

    public SignalKMessageEvent(final String source, final SignalKPath path, final Object value) {

        super(source);
        this.path = path;
        this.value = value;
    }

    public String getPath() {

        return path.path();
    }

    public Object getValue() {

        return value;
    }

    @Override
    public String toString() {

        return ToStringBuilder.reflectionToString(this);
    }
}
