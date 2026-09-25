package androidx.room;

/* JADX INFO: loaded from: classes.dex */
@java.lang.annotation.Target({})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
public @interface BuiltInTypeConverters {

    public enum State {
        ENABLED,
        DISABLED,
        INHERITED
    }

    androidx.room.BuiltInTypeConverters.State enums() default androidx.room.BuiltInTypeConverters.State.INHERITED;

    androidx.room.BuiltInTypeConverters.State uuid() default androidx.room.BuiltInTypeConverters.State.INHERITED;
}
