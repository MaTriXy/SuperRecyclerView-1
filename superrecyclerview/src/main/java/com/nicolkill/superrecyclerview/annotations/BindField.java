package com.nicolkill.superrecyclerview.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by Nicol Acosta on 10/27/16.
 * nicol@parkiller.com
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
public @interface BindField {

    enum Type {
        TEXT,
        CHECKED,
        ENABLED,
        VISIBLE,
        GONE,
        IMAGE,
        BACKGROUND;
    }

    Type type() default Type.TEXT;

    int id();

}
