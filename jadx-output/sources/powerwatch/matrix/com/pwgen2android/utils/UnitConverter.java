package powerwatch.matrix.com.pwgen2android.utils;

/* JADX INFO: compiled from: UserPrefsUtils.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0004\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\u001c\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010\t\u001a\u00020\u0007H&¨\u0006\n"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/utils/UnitConverter;", "", "convertImperialToMetric", "Lkotlin/Pair;", "", "", "imperialValue", "", "convertMetricToImperial", "metricsValue", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public interface UnitConverter {
    kotlin.Pair<java.lang.Float, java.lang.String> convertImperialToMetric(java.lang.Number imperialValue);

    kotlin.Pair<java.lang.Float, java.lang.String> convertMetricToImperial(java.lang.Number metricsValue);
}
