package powerwatch.matrix.com.pwgen2android.utils;

/* JADX INFO: compiled from: UserPrefsUtils.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\u001a\u000e\u0010*\u001a\u00020\u00052\u0006\u0010+\u001a\u00020\u0005\u001a\u000e\u0010,\u001a\u00020\u00052\u0006\u0010+\u001a\u00020\u0005\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0011\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0012\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0013\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0014\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000\"-\u0010\u0015\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0016j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005`\u0017¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u000e\u0010\u001a\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001c\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001d\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001e\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010 \u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010!\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\"\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010#\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010$\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010%\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010&\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000\"-\u0010'\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0016j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005`\u0017¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0019\"\u000e\u0010)\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006-"}, d2 = {"ageDefault", "", "ageMax", "ageMin", "defaultNoDataText", "", "heartRateUnit", "hourUnit", "imperialCaloriesUnit", "imperialDistanceUnit", "imperialFeetUnit", "imperialHeightDefault", "imperialHeightMax", "imperialHeightMin", "imperialHeightUnit", "imperialSpeedUnit", "imperialTemperatureUnit", "imperialWeightDefault", "imperialWeightMax", "imperialWeightMin", "imperialWeightUnit", "incomingCallMap", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "getIncomingCallMap", "()Ljava/util/HashMap;", "metricCaloriesUnit", "metricDistanceUnit", "metricHeightDefault", "metricHeightMax", "metricHeightMin", "metricHeightUnit", "metricWeightDefault", "metricWeightMax", "metricWeightMin", "metricWeightUnit", "metricsMetersUnit", "metricsSpeedUnit", "metricsTemperatureUnit", "missedCallMap", "getMissedCallMap", "powerUnit", "getIncomingCallString", "languageKey", "getMissedCallString", "app_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
public final class UserPrefsUtilsKt {
    public static final int ageDefault = 25;
    public static final int ageMax = 120;
    public static final int ageMin = 13;
    public static final java.lang.String defaultNoDataText = "--";
    public static final java.lang.String heartRateUnit = " bpm";
    public static final java.lang.String hourUnit = "h";
    public static final java.lang.String imperialCaloriesUnit = " Cal";
    public static final java.lang.String imperialDistanceUnit = " mi";
    public static final java.lang.String imperialFeetUnit = " ft";
    public static final int imperialHeightDefault = 200;
    public static final int imperialHeightMax = 330;
    public static final int imperialHeightMin = 40;
    public static final java.lang.String imperialHeightUnit = " in";
    public static final java.lang.String imperialSpeedUnit = "miph";
    public static final java.lang.String imperialTemperatureUnit = "°F";
    public static final int imperialWeightDefault = 70;
    public static final int imperialWeightMax = 330;
    public static final int imperialWeightMin = 65;
    public static final java.lang.String imperialWeightUnit = " lb";
    private static final java.util.HashMap<java.lang.String, java.lang.String> incomingCallMap;
    public static final java.lang.String metricCaloriesUnit = " kcal";
    public static final java.lang.String metricDistanceUnit = " km";
    public static final int metricHeightDefault = 180;
    public static final int metricHeightMax = 270;
    public static final int metricHeightMin = 100;
    public static final java.lang.String metricHeightUnit = " cm";
    public static final int metricWeightDefault = 80;
    public static final int metricWeightMax = 150;
    public static final int metricWeightMin = 29;
    public static final java.lang.String metricWeightUnit = " kg";
    public static final java.lang.String metricsMetersUnit = " m";
    public static final java.lang.String metricsSpeedUnit = "km/h";
    public static final java.lang.String metricsTemperatureUnit = "°C";
    private static final java.util.HashMap<java.lang.String, java.lang.String> missedCallMap;
    public static final java.lang.String powerUnit = " µWh";

    public static final java.lang.String getIncomingCallString(java.lang.String languageKey) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(languageKey, "languageKey");
        java.util.HashMap<java.lang.String, java.lang.String> map = incomingCallMap;
        java.lang.String str = map.containsKey(languageKey) ? map.get(languageKey) : null;
        if (str != null) {
            return str;
        }
        java.lang.String str2 = map.get("en");
        kotlin.jvm.internal.Intrinsics.checkNotNull(str2);
        return str2;
    }

    public static final java.lang.String getMissedCallString(java.lang.String languageKey) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(languageKey, "languageKey");
        java.util.HashMap<java.lang.String, java.lang.String> map = missedCallMap;
        java.lang.String str = map.containsKey(languageKey) ? map.get(languageKey) : null;
        if (str != null) {
            return str;
        }
        java.lang.String str2 = map.get("en");
        kotlin.jvm.internal.Intrinsics.checkNotNull(str2);
        return str2;
    }

    static {
        java.util.HashMap<java.lang.String, java.lang.String> map = new java.util.HashMap<>();
        java.util.HashMap<java.lang.String, java.lang.String> map2 = map;
        map2.put("en", "Incoming call");
        map2.put("ru", "Входящий вызов");
        map2.put("cs", "Příchozí hovor");
        map2.put("pl", "Połączenie Przychodzące");
        map2.put("fr", "Appel Entrant");
        map2.put("de", "Eingehender Anruf");
        map2.put("ja", "着信通知");
        map2.put("it", "Chiamata in arrivo");
        incomingCallMap = map;
        java.util.HashMap<java.lang.String, java.lang.String> map3 = new java.util.HashMap<>();
        java.util.HashMap<java.lang.String, java.lang.String> map4 = map3;
        map4.put("en", "Missed call");
        map4.put("ru", "Пропущенный вызов");
        map4.put("cs", "Zmeškaný hovor");
        map4.put("pl", "Połączenie Nieodebrane");
        map4.put("fr", "Appel Manqué");
        map4.put("de", "Verpasster Anruf");
        map4.put("ja", "不在着信");
        map4.put("it", "Chiamata persa");
        missedCallMap = map3;
    }

    public static final java.util.HashMap<java.lang.String, java.lang.String> getIncomingCallMap() {
        return incomingCallMap;
    }

    public static final java.util.HashMap<java.lang.String, java.lang.String> getMissedCallMap() {
        return missedCallMap;
    }
}
