package kotlin.reflect.jvm.internal.impl.descriptors;

/* JADX INFO: compiled from: ModuleDescriptor.kt */
/* JADX INFO: loaded from: classes2.dex */
public interface ModuleDescriptor extends kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor {
    kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns getBuiltIns();

    kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor getPackage(kotlin.reflect.jvm.internal.impl.name.FqName fqName);

    java.util.Collection<kotlin.reflect.jvm.internal.impl.name.FqName> getSubPackagesOf(kotlin.reflect.jvm.internal.impl.name.FqName fqName, kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.Name, java.lang.Boolean> function1);

    boolean shouldSeeInternalsOf(kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor moduleDescriptor);

    /* JADX INFO: compiled from: ModuleDescriptor.kt */
    public static final class DefaultImpls {
        public static kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor getContainingDeclaration(kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor moduleDescriptor) {
            return null;
        }

        public static <R, D> R accept(kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor moduleDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor<R, D> visitor, D d) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(visitor, "visitor");
            return visitor.visitModuleDeclaration(moduleDescriptor, d);
        }
    }

    /* JADX INFO: compiled from: ModuleDescriptor.kt */
    public static final class Capability<T> {
        private final java.lang.String name;

        public Capability(java.lang.String name) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(name, "name");
            this.name = name;
        }

        public java.lang.String toString() {
            return this.name;
        }
    }
}
