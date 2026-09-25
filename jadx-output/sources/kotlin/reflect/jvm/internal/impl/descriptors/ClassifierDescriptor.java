package kotlin.reflect.jvm.internal.impl.descriptors;

/* JADX INFO: loaded from: classes2.dex */
public interface ClassifierDescriptor extends kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorNonRoot {
    kotlin.reflect.jvm.internal.impl.types.SimpleType getDefaultType();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor getOriginal();

    kotlin.reflect.jvm.internal.impl.types.TypeConstructor getTypeConstructor();
}
