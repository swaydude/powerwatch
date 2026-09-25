package powerwatch.matrix.com.pwgen2android.sdk;

/* JADX INFO: compiled from: SettingsDataParser.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\bX\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B×\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0003¢\u0006\u0002\u0010\u0018J\t\u0010E\u001a\u00020\u0003HÆ\u0003J\t\u0010F\u001a\u00020\u0003HÆ\u0003J\t\u0010G\u001a\u00020\u0003HÆ\u0003J\t\u0010H\u001a\u00020\u0003HÆ\u0003J\t\u0010I\u001a\u00020\u0003HÆ\u0003J\t\u0010J\u001a\u00020\u0003HÆ\u0003J\t\u0010K\u001a\u00020\u0003HÆ\u0003J\t\u0010L\u001a\u00020\u0003HÆ\u0003J\t\u0010M\u001a\u00020\u0003HÆ\u0003J\t\u0010N\u001a\u00020\u0003HÆ\u0003J\t\u0010O\u001a\u00020\u0003HÆ\u0003J\t\u0010P\u001a\u00020\u0003HÆ\u0003J\t\u0010Q\u001a\u00020\u0003HÆ\u0003J\t\u0010R\u001a\u00020\u0003HÆ\u0003J\t\u0010S\u001a\u00020\u0003HÆ\u0003J\t\u0010T\u001a\u00020\u0003HÆ\u0003J\t\u0010U\u001a\u00020\u0003HÆ\u0003J\t\u0010V\u001a\u00020\u0003HÆ\u0003J\t\u0010W\u001a\u00020\u0003HÆ\u0003J\t\u0010X\u001a\u00020\u0003HÆ\u0003J\t\u0010Y\u001a\u00020\u0003HÆ\u0003JÛ\u0001\u0010Z\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u0003HÆ\u0001J\u0013\u0010[\u001a\u00020\\2\b\u0010]\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010^\u001a\u00020\u0003HÖ\u0001J\t\u0010_\u001a\u00020`HÖ\u0001R\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0017\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001a\"\u0004\b\u001e\u0010\u001cR\u001a\u0010\u0010\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u001a\"\u0004\b \u0010\u001cR\u001a\u0010\u0011\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001a\"\u0004\b\"\u0010\u001cR\u001a\u0010\u0015\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u001a\"\u0004\b$\u0010\u001cR\u001a\u0010\r\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u001a\"\u0004\b&\u0010\u001cR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u001a\"\u0004\b(\u0010\u001cR\u001a\u0010\f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u001a\"\u0004\b*\u0010\u001cR\u001a\u0010\u000f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u001a\"\u0004\b,\u0010\u001cR\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u001a\"\u0004\b.\u0010\u001cR\u001a\u0010\u0013\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u001a\"\u0004\b0\u0010\u001cR\u001a\u0010\n\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u001a\"\u0004\b2\u0010\u001cR\u001a\u0010\u0014\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u001a\"\u0004\b4\u0010\u001cR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\u001a\"\u0004\b6\u0010\u001cR\u001a\u0010\u0012\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u001a\"\u0004\b8\u0010\u001cR\u001a\u0010\u0016\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010\u001a\"\u0004\b:\u0010\u001cR\u001a\u0010\u000e\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010\u001a\"\u0004\b<\u0010\u001cR\u001a\u0010\u000b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\u001a\"\u0004\b>\u0010\u001cR\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010\u001a\"\u0004\b@\u0010\u001cR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010\u001a\"\u0004\bB\u0010\u001cR\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010\u001a\"\u0004\bD\u0010\u001c¨\u0006a"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;", "", "clockFormatSelection", "", "unitSelection", "languageSelection", "timeZone", "gender", "age", "weight", io.fabric.sdk.android.services.settings.SettingsJsonConstants.ICON_HEIGHT_KEY, "stepGoal", "distanceGoal", "caloriesGoal", "sleepGoal", "dnd", "backLight", "backLightDuration", "popupDuration", "gpsUpdateRate", "homeScreen", "bleDisconnect", "ringtone", "alert", "(IIIIIIIIIIIIIIIIIIIII)V", "getAge", "()I", "setAge", "(I)V", "getAlert", "setAlert", "getBackLight", "setBackLight", "getBackLightDuration", "setBackLightDuration", "getBleDisconnect", "setBleDisconnect", "getCaloriesGoal", "setCaloriesGoal", "getClockFormatSelection", "setClockFormatSelection", "getDistanceGoal", "setDistanceGoal", "getDnd", "setDnd", "getGender", "setGender", "getGpsUpdateRate", "setGpsUpdateRate", "getHeight", "setHeight", "getHomeScreen", "setHomeScreen", "getLanguageSelection", "setLanguageSelection", "getPopupDuration", "setPopupDuration", "getRingtone", "setRingtone", "getSleepGoal", "setSleepGoal", "getStepGoal", "setStepGoal", "getTimeZone", "setTimeZone", "getUnitSelection", "setUnitSelection", "getWeight", "setWeight", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "toString", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class SettingsData {
    private int age;
    private int alert;
    private int backLight;
    private int backLightDuration;
    private int bleDisconnect;
    private int caloriesGoal;
    private int clockFormatSelection;
    private int distanceGoal;
    private int dnd;
    private int gender;
    private int gpsUpdateRate;
    private int height;
    private int homeScreen;
    private int languageSelection;
    private int popupDuration;
    private int ringtone;
    private int sleepGoal;
    private int stepGoal;
    private int timeZone;
    private int unitSelection;
    private int weight;

    public SettingsData() {
        this(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2097151, null);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getClockFormatSelection() {
        return this.clockFormatSelection;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getDistanceGoal() {
        return this.distanceGoal;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final int getCaloriesGoal() {
        return this.caloriesGoal;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final int getSleepGoal() {
        return this.sleepGoal;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final int getDnd() {
        return this.dnd;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final int getBackLight() {
        return this.backLight;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final int getBackLightDuration() {
        return this.backLightDuration;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final int getPopupDuration() {
        return this.popupDuration;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final int getGpsUpdateRate() {
        return this.gpsUpdateRate;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final int getHomeScreen() {
        return this.homeScreen;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final int getBleDisconnect() {
        return this.bleDisconnect;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getUnitSelection() {
        return this.unitSelection;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final int getRingtone() {
        return this.ringtone;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final int getAlert() {
        return this.alert;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getLanguageSelection() {
        return this.languageSelection;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getTimeZone() {
        return this.timeZone;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getGender() {
        return this.gender;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getAge() {
        return this.age;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getWeight() {
        return this.weight;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getStepGoal() {
        return this.stepGoal;
    }

    public final powerwatch.matrix.com.pwgen2android.sdk.SettingsData copy(int clockFormatSelection, int unitSelection, int languageSelection, int timeZone, int gender, int age, int weight, int height, int stepGoal, int distanceGoal, int caloriesGoal, int sleepGoal, int dnd, int backLight, int backLightDuration, int popupDuration, int gpsUpdateRate, int homeScreen, int bleDisconnect, int ringtone, int alert) {
        return new powerwatch.matrix.com.pwgen2android.sdk.SettingsData(clockFormatSelection, unitSelection, languageSelection, timeZone, gender, age, weight, height, stepGoal, distanceGoal, caloriesGoal, sleepGoal, dnd, backLight, backLightDuration, popupDuration, gpsUpdateRate, homeScreen, bleDisconnect, ringtone, alert);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof powerwatch.matrix.com.pwgen2android.sdk.SettingsData)) {
            return false;
        }
        powerwatch.matrix.com.pwgen2android.sdk.SettingsData settingsData = (powerwatch.matrix.com.pwgen2android.sdk.SettingsData) other;
        return this.clockFormatSelection == settingsData.clockFormatSelection && this.unitSelection == settingsData.unitSelection && this.languageSelection == settingsData.languageSelection && this.timeZone == settingsData.timeZone && this.gender == settingsData.gender && this.age == settingsData.age && this.weight == settingsData.weight && this.height == settingsData.height && this.stepGoal == settingsData.stepGoal && this.distanceGoal == settingsData.distanceGoal && this.caloriesGoal == settingsData.caloriesGoal && this.sleepGoal == settingsData.sleepGoal && this.dnd == settingsData.dnd && this.backLight == settingsData.backLight && this.backLightDuration == settingsData.backLightDuration && this.popupDuration == settingsData.popupDuration && this.gpsUpdateRate == settingsData.gpsUpdateRate && this.homeScreen == settingsData.homeScreen && this.bleDisconnect == settingsData.bleDisconnect && this.ringtone == settingsData.ringtone && this.alert == settingsData.alert;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((this.clockFormatSelection * 31) + this.unitSelection) * 31) + this.languageSelection) * 31) + this.timeZone) * 31) + this.gender) * 31) + this.age) * 31) + this.weight) * 31) + this.height) * 31) + this.stepGoal) * 31) + this.distanceGoal) * 31) + this.caloriesGoal) * 31) + this.sleepGoal) * 31) + this.dnd) * 31) + this.backLight) * 31) + this.backLightDuration) * 31) + this.popupDuration) * 31) + this.gpsUpdateRate) * 31) + this.homeScreen) * 31) + this.bleDisconnect) * 31) + this.ringtone) * 31) + this.alert;
    }

    public java.lang.String toString() {
        return "SettingsData(clockFormatSelection=" + this.clockFormatSelection + ", unitSelection=" + this.unitSelection + ", languageSelection=" + this.languageSelection + ", timeZone=" + this.timeZone + ", gender=" + this.gender + ", age=" + this.age + ", weight=" + this.weight + ", height=" + this.height + ", stepGoal=" + this.stepGoal + ", distanceGoal=" + this.distanceGoal + ", caloriesGoal=" + this.caloriesGoal + ", sleepGoal=" + this.sleepGoal + ", dnd=" + this.dnd + ", backLight=" + this.backLight + ", backLightDuration=" + this.backLightDuration + ", popupDuration=" + this.popupDuration + ", gpsUpdateRate=" + this.gpsUpdateRate + ", homeScreen=" + this.homeScreen + ", bleDisconnect=" + this.bleDisconnect + ", ringtone=" + this.ringtone + ", alert=" + this.alert + ')';
    }

    public SettingsData(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21) {
        this.clockFormatSelection = i;
        this.unitSelection = i2;
        this.languageSelection = i3;
        this.timeZone = i4;
        this.gender = i5;
        this.age = i6;
        this.weight = i7;
        this.height = i8;
        this.stepGoal = i9;
        this.distanceGoal = i10;
        this.caloriesGoal = i11;
        this.sleepGoal = i12;
        this.dnd = i13;
        this.backLight = i14;
        this.backLightDuration = i15;
        this.popupDuration = i16;
        this.gpsUpdateRate = i17;
        this.homeScreen = i18;
        this.bleDisconnect = i19;
        this.ringtone = i20;
        this.alert = i21;
    }

    public /* synthetic */ SettingsData(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i22 & 1) != 0 ? 0 : i, (i22 & 2) != 0 ? 0 : i2, (i22 & 4) != 0 ? 0 : i3, (i22 & 8) != 0 ? 0 : i4, (i22 & 16) != 0 ? 0 : i5, (i22 & 32) != 0 ? 0 : i6, (i22 & 64) != 0 ? 0 : i7, (i22 & 128) != 0 ? 0 : i8, (i22 & 256) != 0 ? 0 : i9, (i22 & 512) != 0 ? 0 : i10, (i22 & 1024) != 0 ? 0 : i11, (i22 & 2048) != 0 ? 0 : i12, (i22 & 4096) != 0 ? 0 : i13, (i22 & 8192) != 0 ? 0 : i14, (i22 & 16384) != 0 ? 0 : i15, (i22 & 32768) != 0 ? 0 : i16, (i22 & 65536) != 0 ? 0 : i17, (i22 & 131072) != 0 ? 0 : i18, (i22 & 262144) != 0 ? 0 : i19, (i22 & 524288) != 0 ? 0 : i20, (i22 & 1048576) != 0 ? 0 : i21);
    }

    public final int getClockFormatSelection() {
        return this.clockFormatSelection;
    }

    public final void setClockFormatSelection(int i) {
        this.clockFormatSelection = i;
    }

    public final int getUnitSelection() {
        return this.unitSelection;
    }

    public final void setUnitSelection(int i) {
        this.unitSelection = i;
    }

    public final int getLanguageSelection() {
        return this.languageSelection;
    }

    public final void setLanguageSelection(int i) {
        this.languageSelection = i;
    }

    public final int getTimeZone() {
        return this.timeZone;
    }

    public final void setTimeZone(int i) {
        this.timeZone = i;
    }

    public final int getGender() {
        return this.gender;
    }

    public final void setGender(int i) {
        this.gender = i;
    }

    public final int getAge() {
        return this.age;
    }

    public final void setAge(int i) {
        this.age = i;
    }

    public final int getWeight() {
        return this.weight;
    }

    public final void setWeight(int i) {
        this.weight = i;
    }

    public final int getHeight() {
        return this.height;
    }

    public final void setHeight(int i) {
        this.height = i;
    }

    public final int getStepGoal() {
        return this.stepGoal;
    }

    public final void setStepGoal(int i) {
        this.stepGoal = i;
    }

    public final int getDistanceGoal() {
        return this.distanceGoal;
    }

    public final void setDistanceGoal(int i) {
        this.distanceGoal = i;
    }

    public final int getCaloriesGoal() {
        return this.caloriesGoal;
    }

    public final void setCaloriesGoal(int i) {
        this.caloriesGoal = i;
    }

    public final int getSleepGoal() {
        return this.sleepGoal;
    }

    public final void setSleepGoal(int i) {
        this.sleepGoal = i;
    }

    public final int getDnd() {
        return this.dnd;
    }

    public final void setDnd(int i) {
        this.dnd = i;
    }

    public final int getBackLight() {
        return this.backLight;
    }

    public final void setBackLight(int i) {
        this.backLight = i;
    }

    public final int getBackLightDuration() {
        return this.backLightDuration;
    }

    public final void setBackLightDuration(int i) {
        this.backLightDuration = i;
    }

    public final int getPopupDuration() {
        return this.popupDuration;
    }

    public final void setPopupDuration(int i) {
        this.popupDuration = i;
    }

    public final int getGpsUpdateRate() {
        return this.gpsUpdateRate;
    }

    public final void setGpsUpdateRate(int i) {
        this.gpsUpdateRate = i;
    }

    public final int getHomeScreen() {
        return this.homeScreen;
    }

    public final void setHomeScreen(int i) {
        this.homeScreen = i;
    }

    public final int getBleDisconnect() {
        return this.bleDisconnect;
    }

    public final void setBleDisconnect(int i) {
        this.bleDisconnect = i;
    }

    public final int getRingtone() {
        return this.ringtone;
    }

    public final void setRingtone(int i) {
        this.ringtone = i;
    }

    public final int getAlert() {
        return this.alert;
    }

    public final void setAlert(int i) {
        this.alert = i;
    }
}
