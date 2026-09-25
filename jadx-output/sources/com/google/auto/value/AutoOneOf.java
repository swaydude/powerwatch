package com.google.auto.value;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
public @interface AutoOneOf {
    java.lang.Class<? extends java.lang.Enum<?>> value();
}
