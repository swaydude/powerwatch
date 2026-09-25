package kotlin.reflect.jvm.internal.impl.descriptors;

/* JADX INFO: compiled from: TypeAliasDescriptor.kt */
/* JADX INFO: loaded from: classes2.dex */
public interface TypeAliasDescriptor extends kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters {
    kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor getClassDescriptor();

    kotlin.reflect.jvm.internal.impl.types.SimpleType getExpandedType();

    kotlin.reflect.jvm.internal.impl.types.SimpleType getUnderlyingType();
}
