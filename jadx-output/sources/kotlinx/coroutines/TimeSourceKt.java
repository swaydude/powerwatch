package kotlinx.coroutines;

/* JADX INFO: compiled from: TimeSource.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u001a\u0010\u0000\u001a\u00020\u0001X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"timeSource", "Lkotlinx/coroutines/TimeSource;", "getTimeSource", "()Lkotlinx/coroutines/TimeSource;", "setTimeSource", "(Lkotlinx/coroutines/TimeSource;)V", "kotlinx-coroutines-core"}, k = 2, mv = {1, 1, 13})
public final class TimeSourceKt {
    private static kotlinx.coroutines.TimeSource timeSource = kotlinx.coroutines.DefaultTimeSource.INSTANCE;

    public static final kotlinx.coroutines.TimeSource getTimeSource() {
        return timeSource;
    }

    public static final void setTimeSource(kotlinx.coroutines.TimeSource timeSource2) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(timeSource2, "<set-?>");
        timeSource = timeSource2;
    }
}
