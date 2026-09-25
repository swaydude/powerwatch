package kotlin;

/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"kotlin/LazyKt__LazyJVMKt", "kotlin/LazyKt__LazyKt"}, k = 4, mv = {1, 5, 1}, xi = 1)
public final class LazyKt extends kotlin.LazyKt__LazyKt {

    @kotlin.Metadata(k = 3, mv = {1, 5, 1})
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[kotlin.LazyThreadSafetyMode.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[kotlin.LazyThreadSafetyMode.SYNCHRONIZED.ordinal()] = 1;
            iArr[kotlin.LazyThreadSafetyMode.PUBLICATION.ordinal()] = 2;
            iArr[kotlin.LazyThreadSafetyMode.NONE.ordinal()] = 3;
        }
    }

    private LazyKt() {
    }
}
