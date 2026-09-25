package kotlin.reflect.jvm.internal.impl.types.checker;

/* JADX INFO: compiled from: NewCapturedType.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class NewCapturedTypeConstructor implements kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructor {
    private final kotlin.reflect.jvm.internal.impl.types.TypeProjection projection;
    private java.util.List<? extends kotlin.reflect.jvm.internal.impl.types.UnwrappedType> supertypes;

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    /* JADX INFO: renamed from: getDeclarationDescriptor */
    public kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor mo1268getDeclarationDescriptor() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public boolean isDenotable() {
        return false;
    }

    public NewCapturedTypeConstructor(kotlin.reflect.jvm.internal.impl.types.TypeProjection projection, java.util.List<? extends kotlin.reflect.jvm.internal.impl.types.UnwrappedType> list) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(projection, "projection");
        this.projection = projection;
        this.supertypes = list;
    }

    public /* synthetic */ NewCapturedTypeConstructor(kotlin.reflect.jvm.internal.impl.types.TypeProjection typeProjection, java.util.List list, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(typeProjection, (i & 2) != 0 ? (java.util.List) null : list);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructor
    public kotlin.reflect.jvm.internal.impl.types.TypeProjection getProjection() {
        return this.projection;
    }

    public final void initializeSupertypes(java.util.List<? extends kotlin.reflect.jvm.internal.impl.types.UnwrappedType> supertypes) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(supertypes, "supertypes");
        java.util.List<? extends kotlin.reflect.jvm.internal.impl.types.UnwrappedType> list = this.supertypes;
        this.supertypes = supertypes;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    /* JADX INFO: renamed from: getSupertypes */
    public java.util.List<kotlin.reflect.jvm.internal.impl.types.UnwrappedType> mo1269getSupertypes() {
        java.util.List list = this.supertypes;
        return list != null ? list : kotlin.collections.CollectionsKt.emptyList();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> getParameters() {
        return kotlin.collections.CollectionsKt.emptyList();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns getBuiltIns() {
        kotlin.reflect.jvm.internal.impl.types.KotlinType type = getProjection().getType();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(type, "projection.type");
        return kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.getBuiltIns(type);
    }

    public java.lang.String toString() {
        return "CapturedType(" + getProjection() + ')';
    }
}
