package powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters;

/* JADX INFO: compiled from: PeriodFormatter.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0002*\u00020\u00032\u00020\u0004B\u001d\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006J\u001c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006H\u0014R\u0012\u0010\n\u001a\u00028\u0000X¤\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/AbstractPeriodFormatter;", "OUTPUT", "INPUT", "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/BaseLog;", "", "periods", "", "shouldGoDeep", "", "(Ljava/util/List;Z)V", "emptyPeriod", "getEmptyPeriod", "()Ljava/lang/Object;", "format", "formatFromRecords", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public abstract class AbstractPeriodFormatter<OUTPUT, INPUT extends powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.BaseLog> {
    private final java.util.List<INPUT> periods;
    private final boolean shouldGoDeep;

    protected abstract OUTPUT getEmptyPeriod();

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractPeriodFormatter(java.util.List<? extends INPUT> periods, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(periods, "periods");
        this.periods = periods;
        this.shouldGoDeep = z;
    }

    public /* synthetic */ AbstractPeriodFormatter(java.util.List list, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i & 2) != 0 ? false : z);
    }

    public final java.util.List<OUTPUT> format() {
        return formatFromRecords(this.periods);
    }

    protected java.util.List<OUTPUT> formatFromRecords(java.util.List<? extends INPUT> periods) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(periods, "periods");
        return kotlin.collections.CollectionsKt.emptyList();
    }
}
