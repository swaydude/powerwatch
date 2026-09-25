package kotlin.reflect.jvm.internal.impl.descriptors;

/* JADX INFO: loaded from: classes2.dex */
public interface TypeParameterDescriptor extends kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor, kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker {
    int getIndex();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor getOriginal();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    kotlin.reflect.jvm.internal.impl.types.TypeConstructor getTypeConstructor();

    java.util.List<kotlin.reflect.jvm.internal.impl.types.KotlinType> getUpperBounds();

    kotlin.reflect.jvm.internal.impl.types.Variance getVariance();

    boolean isCapturedFromOuterDeclaration();

    boolean isReified();
}
