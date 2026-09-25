package kotlin.reflect.jvm.internal.impl.descriptors.deserialization;

/* JADX INFO: compiled from: AdditionalClassPartsProvider.kt */
/* JADX INFO: loaded from: classes2.dex */
public interface AdditionalClassPartsProvider {
    java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor> getConstructors(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor);

    java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> getFunctions(kotlin.reflect.jvm.internal.impl.name.Name name, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor);

    java.util.Collection<kotlin.reflect.jvm.internal.impl.name.Name> getFunctionsNames(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor);

    java.util.Collection<kotlin.reflect.jvm.internal.impl.types.KotlinType> getSupertypes(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor);

    /* JADX INFO: compiled from: AdditionalClassPartsProvider.kt */
    public static final class None implements kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider {
        public static final kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider.None INSTANCE = new kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider.None();

        private None() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider
        public java.util.Collection<kotlin.reflect.jvm.internal.impl.types.KotlinType> getSupertypes(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(classDescriptor, "classDescriptor");
            return kotlin.collections.CollectionsKt.emptyList();
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider
        public java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> getFunctions(kotlin.reflect.jvm.internal.impl.name.Name name, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(name, "name");
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(classDescriptor, "classDescriptor");
            return kotlin.collections.CollectionsKt.emptyList();
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider
        public java.util.Collection<kotlin.reflect.jvm.internal.impl.name.Name> getFunctionsNames(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(classDescriptor, "classDescriptor");
            return kotlin.collections.CollectionsKt.emptyList();
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider
        public java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor> getConstructors(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(classDescriptor, "classDescriptor");
            return kotlin.collections.CollectionsKt.emptyList();
        }
    }
}
