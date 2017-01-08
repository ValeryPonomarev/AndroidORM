package com.easysales.androidorm.Entity;

/**
 * Created by drmiller on 05.07.2016.
 */
public abstract class Entity implements IEntity {
    public Entity(Object key)
    {
        this.key = key;
    }

    private Object key;

    public Object getKey() {
        return key;
    }
}
