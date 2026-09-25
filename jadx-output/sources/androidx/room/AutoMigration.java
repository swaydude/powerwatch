package androidx.room;

/* JADX INFO: loaded from: classes.dex */
@java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
public @interface AutoMigration {
    int from();

    java.lang.Class<?> spec() default java.lang.Object.class;

    int to();
}
