package powerwatch.matrix.com.pwgen2android.shared.data.models;

/* JADX INFO: compiled from: ActivityPeriodsModels.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\bf\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003R\u0018\u0010\u0004\u001a\u00020\u0005X¦\u000e¢\u0006\f\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/data/models/BaseActivityPeriod;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/BaseTimePeriod;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/CacheTimePeriod;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/BaseLog;", "peakTemp", "", "getPeakTemp", "()F", "setPeakTemp", "(F)V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public interface BaseActivityPeriod extends powerwatch.matrix.com.pwgen2android.shared.data.models.BaseTimePeriod, powerwatch.matrix.com.pwgen2android.shared.data.models.CacheTimePeriod, powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.BaseLog {
    float getPeakTemp();

    void setPeakTemp(float f);
}
