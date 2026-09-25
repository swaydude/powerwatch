package kotlin.reflect.jvm.internal.impl.load.java;

/* JADX INFO: compiled from: JavaClassesTracker.kt */
/* JADX INFO: loaded from: classes2.dex */
public interface JavaClassesTracker {
    void reportClass(kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaClassDescriptor javaClassDescriptor);

    /* JADX INFO: compiled from: JavaClassesTracker.kt */
    public static final class Default implements kotlin.reflect.jvm.internal.impl.load.java.JavaClassesTracker {
        public static final kotlin.reflect.jvm.internal.impl.load.java.JavaClassesTracker.Default INSTANCE = new kotlin.reflect.jvm.internal.impl.load.java.JavaClassesTracker.Default();

        @Override // kotlin.reflect.jvm.internal.impl.load.java.JavaClassesTracker
        public void reportClass(kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaClassDescriptor classDescriptor) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(classDescriptor, "classDescriptor");
        }

        private Default() {
        }
    }
}
