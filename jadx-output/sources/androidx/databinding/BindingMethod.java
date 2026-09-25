package androidx.databinding;

/* JADX INFO: loaded from: classes.dex */
@java.lang.annotation.Target({java.lang.annotation.ElementType.ANNOTATION_TYPE})
public @interface BindingMethod {
    java.lang.String attribute();

    java.lang.String method();

    java.lang.Class type();
}
