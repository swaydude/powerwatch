package kotlin.reflect.jvm.internal;

/* JADX INFO: compiled from: KTypeParameterImpl.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0013\u0010\u001a\u001a\u00020\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0096\u0002J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020\fH\u0016R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\nR\u0014\u0010\u000b\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR!\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006 "}, d2 = {"Lkotlin/reflect/jvm/internal/KTypeParameterImpl;", "Lkotlin/reflect/KTypeParameter;", "Lkotlin/reflect/jvm/internal/KClassifierImpl;", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/TypeParameterDescriptor;", "(Lorg/jetbrains/kotlin/descriptors/TypeParameterDescriptor;)V", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/TypeParameterDescriptor;", "isReified", "", "()Z", com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME, "", "getName", "()Ljava/lang/String;", "upperBounds", "", "Lkotlin/reflect/KType;", "getUpperBounds", "()Ljava/util/List;", "upperBounds$delegate", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", "variance", "Lkotlin/reflect/KVariance;", "getVariance", "()Lkotlin/reflect/KVariance;", "equals", com.google.android.gms.fitness.FitnessActivities.OTHER, "", "hashCode", "", "toString", "kotlin-reflection"}, k = 1, mv = {1, 1, 15})
public final class KTypeParameterImpl implements kotlin.reflect.KTypeParameter, kotlin.reflect.jvm.internal.KClassifierImpl {
    static final /* synthetic */ kotlin.reflect.KProperty[] $$delegatedProperties = {kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlin.reflect.jvm.internal.KTypeParameterImpl.class), "upperBounds", "getUpperBounds()Ljava/util/List;"))};
    private final kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor descriptor;

    /* JADX INFO: renamed from: upperBounds$delegate, reason: from kotlin metadata */
    private final kotlin.reflect.jvm.internal.ReflectProperties.LazySoftVal upperBounds;

    @kotlin.Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 15})
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[kotlin.reflect.jvm.internal.impl.types.Variance.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT.ordinal()] = 1;
            iArr[kotlin.reflect.jvm.internal.impl.types.Variance.IN_VARIANCE.ordinal()] = 2;
            iArr[kotlin.reflect.jvm.internal.impl.types.Variance.OUT_VARIANCE.ordinal()] = 3;
        }
    }

    @Override // kotlin.reflect.KTypeParameter
    public java.util.List<kotlin.reflect.KType> getUpperBounds() {
        return (java.util.List) this.upperBounds.getValue(this, $$delegatedProperties[0]);
    }

    public KTypeParameterImpl(kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor descriptor) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(descriptor, "descriptor");
        this.descriptor = descriptor;
        this.upperBounds = kotlin.reflect.jvm.internal.ReflectProperties.lazySoft(new kotlin.reflect.jvm.internal.KTypeParameterImpl$upperBounds$2(this));
    }

    @Override // kotlin.reflect.jvm.internal.KClassifierImpl
    public kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor getDescriptor() {
        return this.descriptor;
    }

    @Override // kotlin.reflect.KTypeParameter
    public java.lang.String getName() {
        java.lang.String strAsString = getDescriptor().getName().asString();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(strAsString, "descriptor.name.asString()");
        return strAsString;
    }

    @Override // kotlin.reflect.KTypeParameter
    public kotlin.reflect.KVariance getVariance() {
        int i = kotlin.reflect.jvm.internal.KTypeParameterImpl.WhenMappings.$EnumSwitchMapping$0[getDescriptor().getVariance().ordinal()];
        if (i == 1) {
            return kotlin.reflect.KVariance.INVARIANT;
        }
        if (i == 2) {
            return kotlin.reflect.KVariance.IN;
        }
        if (i == 3) {
            return kotlin.reflect.KVariance.OUT;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    @Override // kotlin.reflect.KTypeParameter
    /* JADX INFO: renamed from: isReified */
    public boolean getIsReified() {
        return getDescriptor().isReified();
    }

    public boolean equals(java.lang.Object other) {
        return (other instanceof kotlin.reflect.jvm.internal.KTypeParameterImpl) && kotlin.jvm.internal.Intrinsics.areEqual(getDescriptor(), ((kotlin.reflect.jvm.internal.KTypeParameterImpl) other).getDescriptor());
    }

    public int hashCode() {
        return getDescriptor().hashCode();
    }

    public java.lang.String toString() {
        return kotlin.reflect.jvm.internal.ReflectionObjectRenderer.INSTANCE.renderTypeParameter(getDescriptor());
    }
}
