package androidx.databinding;

/* JADX INFO: loaded from: classes.dex */
@java.lang.annotation.Target({java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.ANNOTATION_TYPE})
public @interface InverseBindingAdapter {
    java.lang.String attribute();

    java.lang.String event() default "";
}
