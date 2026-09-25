package kotlin.reflect.jvm.internal.impl.descriptors;

/* JADX INFO: compiled from: typeParameterUtils.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class PossiblyInnerType {
    private final java.util.List<kotlin.reflect.jvm.internal.impl.types.TypeProjection> arguments;
    private final kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters classifierDescriptor;
    private final kotlin.reflect.jvm.internal.impl.descriptors.PossiblyInnerType outerType;

    /* JADX WARN: Multi-variable type inference failed */
    public PossiblyInnerType(kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters classifierDescriptor, java.util.List<? extends kotlin.reflect.jvm.internal.impl.types.TypeProjection> arguments, kotlin.reflect.jvm.internal.impl.descriptors.PossiblyInnerType possiblyInnerType) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(classifierDescriptor, "classifierDescriptor");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(arguments, "arguments");
        this.classifierDescriptor = classifierDescriptor;
        this.arguments = arguments;
        this.outerType = possiblyInnerType;
    }

    public final kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters getClassifierDescriptor() {
        return this.classifierDescriptor;
    }

    public final java.util.List<kotlin.reflect.jvm.internal.impl.types.TypeProjection> getArguments() {
        return this.arguments;
    }

    public final kotlin.reflect.jvm.internal.impl.descriptors.PossiblyInnerType getOuterType() {
        return this.outerType;
    }
}
