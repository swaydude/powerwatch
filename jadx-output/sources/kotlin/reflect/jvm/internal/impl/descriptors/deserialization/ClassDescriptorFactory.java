package kotlin.reflect.jvm.internal.impl.descriptors.deserialization;

/* JADX INFO: compiled from: ClassDescriptorFactory.kt */
/* JADX INFO: loaded from: classes2.dex */
public interface ClassDescriptorFactory {
    kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor createClass(kotlin.reflect.jvm.internal.impl.name.ClassId classId);

    java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor> getAllContributedClassesIfPossible(kotlin.reflect.jvm.internal.impl.name.FqName fqName);

    boolean shouldCreateClass(kotlin.reflect.jvm.internal.impl.name.FqName fqName, kotlin.reflect.jvm.internal.impl.name.Name name);
}
