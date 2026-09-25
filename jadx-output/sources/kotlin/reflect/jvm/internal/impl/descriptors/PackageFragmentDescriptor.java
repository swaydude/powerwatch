package kotlin.reflect.jvm.internal.impl.descriptors;

/* JADX INFO: compiled from: PackageFragmentDescriptor.kt */
/* JADX INFO: loaded from: classes2.dex */
public interface PackageFragmentDescriptor extends kotlin.reflect.jvm.internal.impl.descriptors.ClassOrPackageFragmentDescriptor {
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorNonRoot, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor getContainingDeclaration();

    kotlin.reflect.jvm.internal.impl.name.FqName getFqName();

    kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope getMemberScope();
}
