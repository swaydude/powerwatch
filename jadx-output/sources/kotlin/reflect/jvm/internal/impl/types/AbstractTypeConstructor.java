package kotlin.reflect.jvm.internal.impl.types;

/* JADX INFO: compiled from: AbstractTypeConstructor.kt */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractTypeConstructor implements kotlin.reflect.jvm.internal.impl.types.TypeConstructor {
    private final kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue<kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor.Supertypes> supertypes;

    protected abstract java.util.Collection<kotlin.reflect.jvm.internal.impl.types.KotlinType> computeSupertypes();

    protected kotlin.reflect.jvm.internal.impl.types.KotlinType defaultSupertypeIfEmpty() {
        return null;
    }

    protected abstract kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker getSupertypeLoopChecker();

    protected void reportScopesLoopError(kotlin.reflect.jvm.internal.impl.types.KotlinType type) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(type, "type");
    }

    protected void reportSupertypeLoopError(kotlin.reflect.jvm.internal.impl.types.KotlinType type) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(type, "type");
    }

    public AbstractTypeConstructor(kotlin.reflect.jvm.internal.impl.storage.StorageManager storageManager) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(storageManager, "storageManager");
        this.supertypes = storageManager.createLazyValueWithPostCompute(new kotlin.jvm.functions.Function0<kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor.Supertypes>() { // from class: kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor$supertypes$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor.Supertypes invoke() {
                return new kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor.Supertypes(this.this$0.computeSupertypes());
            }
        }, new kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor.Supertypes>() { // from class: kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor$supertypes$2
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor.Supertypes invoke(java.lang.Boolean bool) {
                return invoke(bool.booleanValue());
            }

            public final kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor.Supertypes invoke(boolean z) {
                return new kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor.Supertypes(kotlin.collections.CollectionsKt.listOf(kotlin.reflect.jvm.internal.impl.types.ErrorUtils.ERROR_TYPE_FOR_LOOP_IN_SUPERTYPES));
            }
        }, new kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor$supertypes$3(this));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    /* JADX INFO: renamed from: getSupertypes */
    public java.util.List<kotlin.reflect.jvm.internal.impl.types.KotlinType> mo1269getSupertypes() {
        return this.supertypes.invoke().getSupertypesWithoutCycles();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: AbstractTypeConstructor.kt */
    static final class Supertypes {
        private final java.util.Collection<kotlin.reflect.jvm.internal.impl.types.KotlinType> allSupertypes;
        private java.util.List<? extends kotlin.reflect.jvm.internal.impl.types.KotlinType> supertypesWithoutCycles;

        /* JADX WARN: Multi-variable type inference failed */
        public Supertypes(java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.types.KotlinType> allSupertypes) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(allSupertypes, "allSupertypes");
            this.allSupertypes = allSupertypes;
            this.supertypesWithoutCycles = kotlin.collections.CollectionsKt.listOf(kotlin.reflect.jvm.internal.impl.types.ErrorUtils.ERROR_TYPE_FOR_LOOP_IN_SUPERTYPES);
        }

        public final java.util.Collection<kotlin.reflect.jvm.internal.impl.types.KotlinType> getAllSupertypes() {
            return this.allSupertypes;
        }

        public final java.util.List<kotlin.reflect.jvm.internal.impl.types.KotlinType> getSupertypesWithoutCycles() {
            return this.supertypesWithoutCycles;
        }

        public final void setSupertypesWithoutCycles(java.util.List<? extends kotlin.reflect.jvm.internal.impl.types.KotlinType> list) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(list, "<set-?>");
            this.supertypesWithoutCycles = list;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.util.Collection<kotlin.reflect.jvm.internal.impl.types.KotlinType> computeNeighbours(kotlin.reflect.jvm.internal.impl.types.TypeConstructor typeConstructor, boolean z) {
        java.util.List listPlus;
        kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor abstractTypeConstructor = (kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor) (!(typeConstructor instanceof kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor) ? null : typeConstructor);
        if (abstractTypeConstructor != null && (listPlus = kotlin.collections.CollectionsKt.plus((java.util.Collection) abstractTypeConstructor.supertypes.invoke().getAllSupertypes(), (java.lang.Iterable) abstractTypeConstructor.getAdditionalNeighboursInSupertypeGraph(z))) != null) {
            return listPlus;
        }
        java.util.Collection<kotlin.reflect.jvm.internal.impl.types.KotlinType> supertypes = typeConstructor.mo1269getSupertypes();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(supertypes, "supertypes");
        return supertypes;
    }

    protected java.util.Collection<kotlin.reflect.jvm.internal.impl.types.KotlinType> getAdditionalNeighboursInSupertypeGraph(boolean z) {
        return kotlin.collections.CollectionsKt.emptyList();
    }
}
