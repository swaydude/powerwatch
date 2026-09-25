package kotlin.reflect.jvm.internal.impl.resolve.scopes;

/* JADX INFO: compiled from: MemberScope.kt */
/* JADX INFO: loaded from: classes2.dex */
public interface MemberScope extends kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope {
    public static final kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope.Companion Companion = kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope.Companion.$$INSTANCE;

    /* JADX INFO: compiled from: MemberScope.kt */
    public static final class DefaultImpls {
        public static void recordLookup(kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope memberScope, kotlin.reflect.jvm.internal.impl.name.Name name, kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation location) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(name, "name");
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(location, "location");
            kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope.DefaultImpls.recordLookup(memberScope, name, location);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> getContributedFunctions(kotlin.reflect.jvm.internal.impl.name.Name name, kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation lookupLocation);

    java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor> getContributedVariables(kotlin.reflect.jvm.internal.impl.name.Name name, kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation lookupLocation);

    java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name> getFunctionNames();

    java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name> getVariableNames();

    /* JADX INFO: compiled from: MemberScope.kt */
    public static final class Empty extends kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl {
        public static final kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope.Empty INSTANCE = new kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope.Empty();

        private Empty() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
        public java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name> getFunctionNames() {
            return kotlin.collections.SetsKt.emptySet();
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
        public java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name> getVariableNames() {
            return kotlin.collections.SetsKt.emptySet();
        }
    }

    /* JADX INFO: compiled from: MemberScope.kt */
    public static final class Companion {
        static final /* synthetic */ kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope.Companion $$INSTANCE = new kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope.Companion();
        private static final kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.name.Name, java.lang.Boolean> ALL_NAME_FILTER = new kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.name.Name, java.lang.Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope$Companion$ALL_NAME_FILTER$1
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final boolean invoke2(kotlin.reflect.jvm.internal.impl.name.Name it) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(it, "it");
                return true;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ java.lang.Boolean invoke(kotlin.reflect.jvm.internal.impl.name.Name name) {
                return java.lang.Boolean.valueOf(invoke2(name));
            }
        };

        private Companion() {
        }

        public final kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.name.Name, java.lang.Boolean> getALL_NAME_FILTER() {
            return ALL_NAME_FILTER;
        }
    }
}
