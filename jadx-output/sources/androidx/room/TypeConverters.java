package androidx.room;

/* JADX INFO: loaded from: classes.dex */
@java.lang.annotation.Target({java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.TYPE, java.lang.annotation.ElementType.FIELD})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
public @interface TypeConverters {
    androidx.room.BuiltInTypeConverters builtInTypeConverters() default @androidx.room.BuiltInTypeConverters;

    java.lang.Class<?>[] value() default {};
}
