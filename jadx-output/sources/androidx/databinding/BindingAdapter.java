package androidx.databinding;

/* JADX INFO: loaded from: classes.dex */
@java.lang.annotation.Target({java.lang.annotation.ElementType.METHOD})
public @interface BindingAdapter {
    boolean requireAll() default true;

    java.lang.String[] value();
}
