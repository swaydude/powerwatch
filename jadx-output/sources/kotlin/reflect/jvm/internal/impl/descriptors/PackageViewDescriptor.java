package kotlin.reflect.jvm.internal.impl.descriptors;

/* JADX INFO: compiled from: PackageViewDescriptor.kt */
/* JADX INFO: loaded from: classes2.dex */
public interface PackageViewDescriptor extends kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor {
    kotlin.reflect.jvm.internal.impl.name.FqName getFqName();

    java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor> getFragments();

    kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope getMemberScope();

    kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor getModule();

    boolean isEmpty();

    /* JADX INFO: compiled from: PackageViewDescriptor.kt */
    public static final class DefaultImpls {
        public static boolean isEmpty(kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor packageViewDescriptor) {
            return packageViewDescriptor.getFragments().isEmpty();
        }
    }
}
