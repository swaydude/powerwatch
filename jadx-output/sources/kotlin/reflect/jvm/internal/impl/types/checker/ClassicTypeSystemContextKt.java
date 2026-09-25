package kotlin.reflect.jvm.internal.impl.types.checker;

/* JADX INFO: compiled from: ClassicTypeSystemContext.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class ClassicTypeSystemContextKt {

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

    public static final kotlin.reflect.jvm.internal.impl.types.model.TypeVariance convertVariance(kotlin.reflect.jvm.internal.impl.types.Variance convertVariance) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(convertVariance, "$this$convertVariance");
        int i = kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContextKt.WhenMappings.$EnumSwitchMapping$0[convertVariance.ordinal()];
        if (i == 1) {
            return kotlin.reflect.jvm.internal.impl.types.model.TypeVariance.INV;
        }
        if (i == 2) {
            return kotlin.reflect.jvm.internal.impl.types.model.TypeVariance.IN;
        }
        if (i == 3) {
            return kotlin.reflect.jvm.internal.impl.types.model.TypeVariance.OUT;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }
}
