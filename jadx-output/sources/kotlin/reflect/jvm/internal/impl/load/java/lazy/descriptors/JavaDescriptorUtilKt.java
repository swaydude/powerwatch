package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

/* JADX INFO: compiled from: JavaDescriptorUtil.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class JavaDescriptorUtilKt {
    public static final boolean isJavaField(kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor isJavaField) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(isJavaField, "$this$isJavaField");
        return isJavaField.getGetter() == null;
    }
}
