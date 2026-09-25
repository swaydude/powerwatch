package powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters;

/* JADX INFO: compiled from: WatchLogModels.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b)\bf\u0018\u00002\u00020\u0001R\u0018\u0010\u0002\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\t\u0010\u0005\"\u0004\b\n\u0010\u0007R\u0018\u0010\u000b\u001a\u00020\fX¦\u000e¢\u0006\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0011\u001a\u00020\fX¦\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\u0018\u0010\u0014\u001a\u00020\fX¦\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010R\u0018\u0010\u0017\u001a\u00020\fX¦\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u000e\"\u0004\b\u0019\u0010\u0010R\u0018\u0010\u001a\u001a\u00020\fX¦\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u000e\"\u0004\b\u001c\u0010\u0010R\u0018\u0010\u001d\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u001e\u0010\u0005\"\u0004\b\u001f\u0010\u0007R\u0018\u0010 \u001a\u00020\fX¦\u000e¢\u0006\f\u001a\u0004\b!\u0010\u000e\"\u0004\b\"\u0010\u0010R\u0018\u0010#\u001a\u00020\fX¦\u000e¢\u0006\f\u001a\u0004\b$\u0010\u000e\"\u0004\b%\u0010\u0010R\u0018\u0010&\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b'\u0010\u0005\"\u0004\b(\u0010\u0007R\u0018\u0010)\u001a\u00020\fX¦\u000e¢\u0006\f\u001a\u0004\b*\u0010\u000e\"\u0004\b+\u0010\u0010R\u0018\u0010,\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b-\u0010\u0005\"\u0004\b.\u0010\u0007R\u0018\u0010/\u001a\u00020\fX¦\u000e¢\u0006\f\u001a\u0004\b0\u0010\u000e\"\u0004\b1\u0010\u0010R\u0018\u00102\u001a\u00020\fX¦\u000e¢\u0006\f\u001a\u0004\b3\u0010\u000e\"\u0004\b4\u0010\u0010¨\u00065"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/BaseLog;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/BaseTimePeriod;", "activeCalories", "", "getActiveCalories", "()I", "setActiveCalories", "(I)V", "bmrCalories", "getBmrCalories", "setBmrCalories", "bodyPower", "", "getBodyPower", "()F", "setBodyPower", "(F)V", "caseTemp", "getCaseTemp", "setCaseTemp", "heartRate", "getHeartRate", "setHeartRate", "hrv", "getHrv", "setHrv", "maxCaseTemp", "getMaxCaseTemp", "setMaxCaseTemp", "maxHeartRate", "getMaxHeartRate", "setMaxHeartRate", "maxSkinTemp", "getMaxSkinTemp", "setMaxSkinTemp", "minCaseTemp", "getMinCaseTemp", "setMinCaseTemp", "minHeartRate", "getMinHeartRate", "setMinHeartRate", "minSkinTemp", "getMinSkinTemp", "setMinSkinTemp", "minsInPeriod", "getMinsInPeriod", "setMinsInPeriod", "skinTemp", "getSkinTemp", "setSkinTemp", "solarPower", "getSolarPower", "setSolarPower", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public interface BaseLog extends powerwatch.matrix.com.pwgen2android.shared.data.models.BaseTimePeriod {
    int getActiveCalories();

    int getBmrCalories();

    float getBodyPower();

    float getCaseTemp();

    float getHeartRate();

    float getHrv();

    float getMaxCaseTemp();

    int getMaxHeartRate();

    float getMaxSkinTemp();

    float getMinCaseTemp();

    int getMinHeartRate();

    float getMinSkinTemp();

    int getMinsInPeriod();

    float getSkinTemp();

    float getSolarPower();

    void setActiveCalories(int i);

    void setBmrCalories(int i);

    void setBodyPower(float f);

    void setCaseTemp(float f);

    void setHeartRate(float f);

    void setHrv(float f);

    void setMaxCaseTemp(float f);

    void setMaxHeartRate(int i);

    void setMaxSkinTemp(float f);

    void setMinCaseTemp(float f);

    void setMinHeartRate(int i);

    void setMinSkinTemp(float f);

    void setMinsInPeriod(int i);

    void setSkinTemp(float f);

    void setSolarPower(float f);
}
