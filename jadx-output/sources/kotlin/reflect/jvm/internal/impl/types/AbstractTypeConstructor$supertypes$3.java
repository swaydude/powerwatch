package kotlin.reflect.jvm.internal.impl.types;

/* JADX INFO: compiled from: AbstractTypeConstructor.kt */
/* JADX INFO: loaded from: classes2.dex */
final class AbstractTypeConstructor$supertypes$3 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor.Supertypes, kotlin.Unit> {
    final /* synthetic */ kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AbstractTypeConstructor$supertypes$3(kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor abstractTypeConstructor) {
        super(1);
        this.this$0 = abstractTypeConstructor;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ kotlin.Unit invoke(kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor.Supertypes supertypes) {
        invoke2(supertypes);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor.Supertypes supertypes) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(supertypes, "supertypes");
        java.util.List listFindLoopsInSupertypesAndDisconnect = this.this$0.getSupertypeLoopChecker().findLoopsInSupertypesAndDisconnect(this.this$0, supertypes.getAllSupertypes(), new kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.types.TypeConstructor, java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.types.KotlinType>>() { // from class: kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor$supertypes$3$resultWithoutCycles$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final java.util.Collection<kotlin.reflect.jvm.internal.impl.types.KotlinType> invoke(kotlin.reflect.jvm.internal.impl.types.TypeConstructor it) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(it, "it");
                return this.this$0.this$0.computeNeighbours(it, false);
            }
        }, new kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.types.KotlinType, kotlin.Unit>() { // from class: kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor$supertypes$3$resultWithoutCycles$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
                invoke2(kotlinType);
                return kotlin.Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(kotlin.reflect.jvm.internal.impl.types.KotlinType it) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(it, "it");
                this.this$0.this$0.reportSupertypeLoopError(it);
            }
        });
        if (listFindLoopsInSupertypesAndDisconnect.isEmpty()) {
            kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinTypeDefaultSupertypeIfEmpty = this.this$0.defaultSupertypeIfEmpty();
            java.util.List listListOf = kotlinTypeDefaultSupertypeIfEmpty != null ? kotlin.collections.CollectionsKt.listOf(kotlinTypeDefaultSupertypeIfEmpty) : null;
            if (listListOf == null) {
                listListOf = kotlin.collections.CollectionsKt.emptyList();
            }
            listFindLoopsInSupertypesAndDisconnect = listListOf;
        }
        this.this$0.getSupertypeLoopChecker().findLoopsInSupertypesAndDisconnect(this.this$0, listFindLoopsInSupertypesAndDisconnect, new kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.types.TypeConstructor, java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.types.KotlinType>>() { // from class: kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor$supertypes$3.2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final java.util.Collection<kotlin.reflect.jvm.internal.impl.types.KotlinType> invoke(kotlin.reflect.jvm.internal.impl.types.TypeConstructor it) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(it, "it");
                return kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor$supertypes$3.this.this$0.computeNeighbours(it, true);
            }
        }, new kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.types.KotlinType, kotlin.Unit>() { // from class: kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor$supertypes$3.3
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
                invoke2(kotlinType);
                return kotlin.Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(kotlin.reflect.jvm.internal.impl.types.KotlinType it) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(it, "it");
                kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor$supertypes$3.this.this$0.reportScopesLoopError(it);
            }
        });
        java.util.List<? extends kotlin.reflect.jvm.internal.impl.types.KotlinType> list = (java.util.List) (listFindLoopsInSupertypesAndDisconnect instanceof java.util.List ? listFindLoopsInSupertypesAndDisconnect : null);
        if (list == null) {
            list = kotlin.collections.CollectionsKt.toList(listFindLoopsInSupertypesAndDisconnect);
        }
        supertypes.setSupertypesWithoutCycles(list);
    }
}
