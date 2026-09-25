package bleshadow.dagger;

/* JADX INFO: loaded from: classes.dex */
@java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
public @interface Module {
    java.lang.Class<?>[] includes() default {};

    java.lang.Class<?>[] subcomponents() default {};
}
