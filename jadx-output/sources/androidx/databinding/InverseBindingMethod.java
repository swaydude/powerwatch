package androidx.databinding;

/* JADX INFO: loaded from: classes.dex */
@java.lang.annotation.Target({java.lang.annotation.ElementType.ANNOTATION_TYPE})
public @interface InverseBindingMethod {
    java.lang.String attribute();

    java.lang.String event() default "";

    java.lang.String method() default "";

    java.lang.Class type();
}
