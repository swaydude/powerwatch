package androidx.room;

/* JADX INFO: loaded from: classes.dex */
@java.lang.annotation.Target({})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
public @interface Index {

    public enum Order {
        ASC,
        DESC
    }

    java.lang.String name() default "";

    androidx.room.Index.Order[] orders() default {};

    boolean unique() default false;

    java.lang.String[] value();
}
