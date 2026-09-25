package androidx.room;

/* JADX INFO: loaded from: classes.dex */
@java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
public @interface Database {
    androidx.room.AutoMigration[] autoMigrations() default {};

    java.lang.Class<?>[] entities();

    boolean exportSchema() default true;

    int version();

    java.lang.Class<?>[] views() default {};
}
