package kotlin.reflect.jvm.internal;

/* JADX INFO: compiled from: KTypeParameterImpl.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lkotlin/reflect/jvm/internal/KTypeImpl;", "invoke"}, k = 3, mv = {1, 1, 15})
final class KTypeParameterImpl$upperBounds$2 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<java.util.List<? extends kotlin.reflect.jvm.internal.KTypeImpl>> {
    final /* synthetic */ kotlin.reflect.jvm.internal.KTypeParameterImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    KTypeParameterImpl$upperBounds$2(kotlin.reflect.jvm.internal.KTypeParameterImpl kTypeParameterImpl) {
        super(0);
        this.this$0 = kTypeParameterImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public final java.util.List<? extends kotlin.reflect.jvm.internal.KTypeImpl> invoke() {
        java.util.List<kotlin.reflect.jvm.internal.impl.types.KotlinType> upperBounds = this.this$0.getDescriptor().getUpperBounds();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(upperBounds, "descriptor.upperBounds");
        java.util.List<kotlin.reflect.jvm.internal.impl.types.KotlinType> list = upperBounds;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
        for (kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType : list) {
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(kotlinType, "kotlinType");
            arrayList.add(new kotlin.reflect.jvm.internal.KTypeImpl(kotlinType, new kotlin.jvm.functions.Function0() { // from class: kotlin.reflect.jvm.internal.KTypeParameterImpl$upperBounds$2$$special$$inlined$map$lambda$1
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Void invoke() {
                    throw new kotlin.NotImplementedError("An operation is not implemented: " + ("Java type is not yet supported for type parameters: " + this.this$0.this$0.getDescriptor()));
                }
            }));
        }
        return arrayList;
    }
}
