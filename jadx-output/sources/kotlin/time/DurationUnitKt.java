package kotlin.time;

/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"kotlin/time/DurationUnitKt__DurationUnitJvmKt", "kotlin/time/DurationUnitKt__DurationUnitKt"}, k = 4, mv = {1, 5, 1}, xi = 1)
public final class DurationUnitKt extends kotlin.time.DurationUnitKt__DurationUnitKt {

    @kotlin.Metadata(k = 3, mv = {1, 5, 1})
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[java.util.concurrent.TimeUnit.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[java.util.concurrent.TimeUnit.NANOSECONDS.ordinal()] = 1;
            iArr[java.util.concurrent.TimeUnit.MICROSECONDS.ordinal()] = 2;
            iArr[java.util.concurrent.TimeUnit.MILLISECONDS.ordinal()] = 3;
            iArr[java.util.concurrent.TimeUnit.SECONDS.ordinal()] = 4;
            iArr[java.util.concurrent.TimeUnit.MINUTES.ordinal()] = 5;
            iArr[java.util.concurrent.TimeUnit.HOURS.ordinal()] = 6;
            iArr[java.util.concurrent.TimeUnit.DAYS.ordinal()] = 7;
        }
    }

    private DurationUnitKt() {
    }
}
