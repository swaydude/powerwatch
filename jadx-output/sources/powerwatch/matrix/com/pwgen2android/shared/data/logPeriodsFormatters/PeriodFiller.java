package powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters;

/* JADX INFO: compiled from: PeriodFiller.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\bf\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003J#\u0010\u0004\u001a\u00028\u00012\u0006\u0010\u0005\u001a\u00028\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H&¢\u0006\u0002\u0010\bJ\u001d\u0010\t\u001a\u00028\u00012\u0006\u0010\u0005\u001a\u00028\u00012\u0006\u0010\n\u001a\u00028\u0001H&¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/PeriodFiller;", "INPUT", "OUTPUT", "", "fill", "output", "inputs", "", "(Ljava/lang/Object;Ljava/util/List;)Ljava/lang/Object;", "mergePeriod", "periodToMerge", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public interface PeriodFiller<INPUT, OUTPUT> {
    OUTPUT fill(OUTPUT output, java.util.List<? extends INPUT> inputs);

    OUTPUT mergePeriod(OUTPUT output, OUTPUT periodToMerge);
}
