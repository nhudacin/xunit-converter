package com.tw.xunit.model;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Text;

public class Failure {
    @Attribute(required = false)
    private String type;

    @Attribute(required = false)
    private String message;

    @Text(required = false)
    public String value;

    public Failure() {
    }

    public Failure(String type, String message, String value) {
        this.type = type;
        this.message = message;
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Failure)) return false;

        Failure failure = (Failure) o;

        if (message != null ? !message.equals(failure.message) : failure.message != null) return false;
        if (type != null ? !type.equals(failure.type) : failure.type != null) return false;
        if (value != null ? !value.equals(failure.value) : failure.value != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = type != null ? type.hashCode() : 0;
        result = 31 * result + (message != null ? message.hashCode() : 0);
        result = 31 * result + (value != null ? value.hashCode() : 0);
        return result;
    }
}
