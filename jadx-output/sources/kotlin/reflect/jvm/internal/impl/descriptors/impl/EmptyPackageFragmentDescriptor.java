package kotlin.reflect.jvm.internal.impl.descriptors.impl;

/* JADX INFO: compiled from: EmptyPackageFragmentDesciptor.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class EmptyPackageFragmentDescriptor extends kotlin.reflect.jvm.internal.impl.descriptors.impl.PackageFragmentDescriptorImpl {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmptyPackageFragmentDescriptor(kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor module, kotlin.reflect.jvm.internal.impl.name.FqName fqName) {
        super(module, fqName);
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(module, "module");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(fqName, "fqName");
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor
    public kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope.Empty getMemberScope() {
        return kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope.Empty.INSTANCE;
    }
}
