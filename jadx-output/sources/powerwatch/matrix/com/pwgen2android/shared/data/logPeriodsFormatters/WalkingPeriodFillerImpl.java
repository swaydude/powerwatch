package powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters;

/* JADX INFO: compiled from: PeriodFiller.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0005\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0005B\u0005¢\u0006\u0002\u0010\u0006J#\u0010\u0007\u001a\u00028\u00012\u0006\u0010\b\u001a\u00028\u00012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0016¢\u0006\u0002\u0010\u000bJ\u001d\u0010\f\u001a\u00028\u00012\u0006\u0010\b\u001a\u00028\u00012\u0006\u0010\r\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u000e¨\u0006\u000f"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingPeriodFillerImpl;", "INPUT", "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingBaseLog;", "OUTPUT", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingBasePeriod;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/PeriodFillerImpl;", "()V", "fill", "output", "inputs", "", "(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingBasePeriod;Ljava/util/List;)Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingBasePeriod;", "mergePeriod", "periodToMerge", "(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingBasePeriod;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingBasePeriod;)Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingBasePeriod;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class WalkingPeriodFillerImpl<INPUT extends powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.WalkingBaseLog, OUTPUT extends powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingBasePeriod> extends powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.PeriodFillerImpl<INPUT, OUTPUT> {
    @Override // powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.PeriodFillerImpl
    public OUTPUT fill(OUTPUT output, java.util.List<? extends INPUT> inputs) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(output, "output");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inputs, "inputs");
        powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingBasePeriod walkingBasePeriod = (powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingBasePeriod) super.fill(output, (java.util.List) inputs);
        java.util.List<? extends INPUT> list = inputs;
        java.util.Iterator<T> it = list.iterator();
        int steps = 0;
        while (it.hasNext()) {
            steps += ((powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.WalkingBaseLog) it.next()).getSteps();
        }
        double distance = 0.0d;
        java.util.Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            distance += ((powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.WalkingBaseLog) it2.next()).getDistance();
        }
        walkingBasePeriod.setSteps(steps);
        walkingBasePeriod.setDistance(distance);
        return output;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.PeriodFillerImpl
    public OUTPUT mergePeriod(OUTPUT output, OUTPUT periodToMerge) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(output, "output");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(periodToMerge, "periodToMerge");
        OUTPUT output2 = (OUTPUT) super.mergePeriod(output, periodToMerge);
        output2.setSteps(output2.getSteps() + periodToMerge.getSteps());
        output2.setDistance(output2.getDistance() + periodToMerge.getDistance());
        return output2;
    }
}
