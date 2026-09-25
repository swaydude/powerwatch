package powerwatch.matrix.com.pwgen2android.utils;

/* JADX INFO: compiled from: UserPrefsUtils.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0004\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u001c\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\n\u001a\u00020\bH\u0016¨\u0006\u000b"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/utils/DistanceConverter;", "Lpowerwatch/matrix/com/pwgen2android/utils/UnitConverter;", "()V", "convertImperialToMetric", "Lkotlin/Pair;", "", "", "imperialValue", "", "convertMetricToImperial", "metricsValue", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class DistanceConverter implements powerwatch.matrix.com.pwgen2android.utils.UnitConverter {
    @Override // powerwatch.matrix.com.pwgen2android.utils.UnitConverter
    public kotlin.Pair<java.lang.Float, java.lang.String> convertImperialToMetric(java.lang.Number imperialValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(imperialValue, "imperialValue");
        return new kotlin.Pair<>(java.lang.Float.valueOf((float) (((double) imperialValue.floatValue()) / 0.621371d)), powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtilsKt.metricDistanceUnit);
    }

    @Override // powerwatch.matrix.com.pwgen2android.utils.UnitConverter
    public kotlin.Pair<java.lang.Float, java.lang.String> convertMetricToImperial(java.lang.Number metricsValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(metricsValue, "metricsValue");
        return new kotlin.Pair<>(java.lang.Float.valueOf((float) (((double) metricsValue.floatValue()) * 0.621371d)), powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtilsKt.imperialDistanceUnit);
    }
}
