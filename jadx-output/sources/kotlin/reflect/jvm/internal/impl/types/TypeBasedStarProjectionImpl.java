package kotlin.reflect.jvm.internal.impl.types;

/* JADX INFO: compiled from: StarProjectionImpl.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class TypeBasedStarProjectionImpl extends kotlin.reflect.jvm.internal.impl.types.TypeProjectionBase {
    private final kotlin.reflect.jvm.internal.impl.types.KotlinType _type;

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeProjection
    public boolean isStarProjection() {
        return true;
    }

    public TypeBasedStarProjectionImpl(kotlin.reflect.jvm.internal.impl.types.KotlinType _type) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(_type, "_type");
        this._type = _type;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeProjection
    public kotlin.reflect.jvm.internal.impl.types.Variance getProjectionKind() {
        return kotlin.reflect.jvm.internal.impl.types.Variance.OUT_VARIANCE;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeProjection
    public kotlin.reflect.jvm.internal.impl.types.KotlinType getType() {
        return this._type;
    }
}
