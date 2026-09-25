package kotlin.reflect.jvm.internal.impl.types;

/* JADX INFO: compiled from: StarProjectionImpl.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class StarProjectionImpl extends kotlin.reflect.jvm.internal.impl.types.TypeProjectionBase {
    static final /* synthetic */ kotlin.reflect.KProperty[] $$delegatedProperties = {kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlin.reflect.jvm.internal.impl.types.StarProjectionImpl.class), "_type", "get_type()Lorg/jetbrains/kotlin/types/KotlinType;"))};
    private final kotlin.Lazy _type$delegate;
    private final kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor typeParameter;

    private final kotlin.reflect.jvm.internal.impl.types.KotlinType get_type() {
        kotlin.Lazy lazy = this._type$delegate;
        kotlin.reflect.KProperty kProperty = $$delegatedProperties[0];
        return (kotlin.reflect.jvm.internal.impl.types.KotlinType) lazy.getValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeProjection
    public boolean isStarProjection() {
        return true;
    }

    public StarProjectionImpl(kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor typeParameter) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(typeParameter, "typeParameter");
        this.typeParameter = typeParameter;
        this._type$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<kotlin.reflect.jvm.internal.impl.types.KotlinType>() { // from class: kotlin.reflect.jvm.internal.impl.types.StarProjectionImpl$_type$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final kotlin.reflect.jvm.internal.impl.types.KotlinType invoke() {
                return kotlin.reflect.jvm.internal.impl.types.StarProjectionImplKt.starProjectionType(this.this$0.typeParameter);
            }
        });
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeProjection
    public kotlin.reflect.jvm.internal.impl.types.Variance getProjectionKind() {
        return kotlin.reflect.jvm.internal.impl.types.Variance.OUT_VARIANCE;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeProjection
    public kotlin.reflect.jvm.internal.impl.types.KotlinType getType() {
        return get_type();
    }
}
