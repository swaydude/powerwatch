package kotlin.reflect.jvm.internal.impl.types;

/* JADX INFO: compiled from: IntersectionTypeConstructor.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class IntersectionTypeConstructor implements kotlin.reflect.jvm.internal.impl.types.TypeConstructor {
    private final int hashCode;
    private final java.util.LinkedHashSet<kotlin.reflect.jvm.internal.impl.types.KotlinType> intersectedTypes;

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    /* JADX INFO: renamed from: getDeclarationDescriptor */
    public kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor mo1268getDeclarationDescriptor() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public boolean isDenotable() {
        return false;
    }

    public IntersectionTypeConstructor(java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.types.KotlinType> typesToIntersect) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(typesToIntersect, "typesToIntersect");
        typesToIntersect.isEmpty();
        java.util.LinkedHashSet<kotlin.reflect.jvm.internal.impl.types.KotlinType> linkedHashSet = new java.util.LinkedHashSet<>(typesToIntersect);
        this.intersectedTypes = linkedHashSet;
        this.hashCode = linkedHashSet.hashCode();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> getParameters() {
        return kotlin.collections.CollectionsKt.emptyList();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    /* JADX INFO: renamed from: getSupertypes */
    public java.util.Collection<kotlin.reflect.jvm.internal.impl.types.KotlinType> mo1269getSupertypes() {
        return this.intersectedTypes;
    }

    public final kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope createScopeForKotlinType() {
        return kotlin.reflect.jvm.internal.impl.resolve.scopes.TypeIntersectionScope.Companion.create("member scope for intersection type " + this, this.intersectedTypes);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns getBuiltIns() {
        kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns builtIns = this.intersectedTypes.iterator().next().getConstructor().getBuiltIns();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(builtIns, "intersectedTypes.iterato…xt().constructor.builtIns");
        return builtIns;
    }

    public java.lang.String toString() {
        return makeDebugNameForIntersectionType(this.intersectedTypes);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor) {
            return kotlin.jvm.internal.Intrinsics.areEqual(this.intersectedTypes, ((kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor) obj).intersectedTypes);
        }
        return false;
    }

    public int hashCode() {
        return this.hashCode;
    }

    private final java.lang.String makeDebugNameForIntersectionType(java.lang.Iterable<? extends kotlin.reflect.jvm.internal.impl.types.KotlinType> iterable) {
        return kotlin.collections.CollectionsKt.joinToString$default(kotlin.collections.CollectionsKt.sortedWith(iterable, new java.util.Comparator<T>() { // from class: kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor$makeDebugNameForIntersectionType$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return kotlin.comparisons.ComparisonsKt.compareValues(((kotlin.reflect.jvm.internal.impl.types.KotlinType) t).toString(), ((kotlin.reflect.jvm.internal.impl.types.KotlinType) t2).toString());
            }
        }), " & ", "{", "}", 0, null, null, 56, null);
    }
}
