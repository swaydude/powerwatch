package kotlin.reflect.jvm.internal.impl.load.java.components;

/* JADX INFO: compiled from: JavaPropertyInitializerEvaluator.kt */
/* JADX INFO: loaded from: classes2.dex */
public interface JavaPropertyInitializerEvaluator {
    kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue<?> getInitializerConstant(kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField javaField, kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor propertyDescriptor);

    /* JADX INFO: compiled from: JavaPropertyInitializerEvaluator.kt */
    public static final class DoNothing implements kotlin.reflect.jvm.internal.impl.load.java.components.JavaPropertyInitializerEvaluator {
        public static final kotlin.reflect.jvm.internal.impl.load.java.components.JavaPropertyInitializerEvaluator.DoNothing INSTANCE = new kotlin.reflect.jvm.internal.impl.load.java.components.JavaPropertyInitializerEvaluator.DoNothing();

        @Override // kotlin.reflect.jvm.internal.impl.load.java.components.JavaPropertyInitializerEvaluator
        public kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue<?> getInitializerConstant(kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField field, kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor descriptor) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(field, "field");
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(descriptor, "descriptor");
            return null;
        }

        private DoNothing() {
        }
    }
}
