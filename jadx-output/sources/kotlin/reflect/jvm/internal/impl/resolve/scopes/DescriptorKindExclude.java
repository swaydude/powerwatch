package kotlin.reflect.jvm.internal.impl.resolve.scopes;

/* JADX INFO: compiled from: MemberScope.kt */
/* JADX INFO: loaded from: classes2.dex */
public abstract class DescriptorKindExclude {
    public abstract int getFullyExcludedDescriptorKinds();

    public java.lang.String toString() {
        return getClass().getSimpleName();
    }

    /* JADX INFO: compiled from: MemberScope.kt */
    public static final class NonExtensions extends kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindExclude {
        public static final kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindExclude.NonExtensions INSTANCE = new kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindExclude.NonExtensions();
        private static final int fullyExcludedDescriptorKinds = kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter.Companion.getALL_KINDS_MASK() & (~(kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter.Companion.getFUNCTIONS_MASK() | kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter.Companion.getVARIABLES_MASK()));

        private NonExtensions() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindExclude
        public int getFullyExcludedDescriptorKinds() {
            return fullyExcludedDescriptorKinds;
        }
    }

    /* JADX INFO: compiled from: MemberScope.kt */
    public static final class TopLevelPackages extends kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindExclude {
        public static final kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindExclude.TopLevelPackages INSTANCE = new kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindExclude.TopLevelPackages();

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindExclude
        public int getFullyExcludedDescriptorKinds() {
            return 0;
        }

        private TopLevelPackages() {
        }
    }
}
