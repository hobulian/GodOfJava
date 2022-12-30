package Generic.WhatIsGeneric;

import java.io.Serializable;

public class CastingDTO_Generic<T> implements Serializable {
    private T object;
    public void setObject(T object) {
        this.object = object;
    }
    public T getObject() {
        return object;
    }
}
