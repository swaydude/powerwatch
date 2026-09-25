package powerwatch.matrix.com.pwgen2android.sdk;

/* JADX INFO: compiled from: SettingsDataParser.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u000e2\u00020\u0001:\u0016\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001cB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0015\u001d\u001e\u001f !\"#$%&'()*+,-./01¨\u00062"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/SettingTable;", "", "key", "", "(B)V", "getKey", "()B", "Age", "Alert", "BLEDisconnect", "BackLight", "BackLightDuration", "CaloriesGoal", "ClockFormatSelection", "Companion", "DND", "DistanceGoal", "GPSUpdateRate", "Gender", "Height", "HomeScreen", "LanguageSelection", "PopupDuration", "Ringtone", "SleepGoal", "StepGoal", "TimeZone", "UnitSelection", "Weight", "Lpowerwatch/matrix/com/pwgen2android/sdk/SettingTable$ClockFormatSelection;", "Lpowerwatch/matrix/com/pwgen2android/sdk/SettingTable$UnitSelection;", "Lpowerwatch/matrix/com/pwgen2android/sdk/SettingTable$LanguageSelection;", "Lpowerwatch/matrix/com/pwgen2android/sdk/SettingTable$TimeZone;", "Lpowerwatch/matrix/com/pwgen2android/sdk/SettingTable$Gender;", "Lpowerwatch/matrix/com/pwgen2android/sdk/SettingTable$Age;", "Lpowerwatch/matrix/com/pwgen2android/sdk/SettingTable$Weight;", "Lpowerwatch/matrix/com/pwgen2android/sdk/SettingTable$Height;", "Lpowerwatch/matrix/com/pwgen2android/sdk/SettingTable$StepGoal;", "Lpowerwatch/matrix/com/pwgen2android/sdk/SettingTable$DistanceGoal;", "Lpowerwatch/matrix/com/pwgen2android/sdk/SettingTable$CaloriesGoal;", "Lpowerwatch/matrix/com/pwgen2android/sdk/SettingTable$SleepGoal;", "Lpowerwatch/matrix/com/pwgen2android/sdk/SettingTable$DND;", "Lpowerwatch/matrix/com/pwgen2android/sdk/SettingTable$BackLight;", "Lpowerwatch/matrix/com/pwgen2android/sdk/SettingTable$BackLightDuration;", "Lpowerwatch/matrix/com/pwgen2android/sdk/SettingTable$PopupDuration;", "Lpowerwatch/matrix/com/pwgen2android/sdk/SettingTable$GPSUpdateRate;", "Lpowerwatch/matrix/com/pwgen2android/sdk/SettingTable$HomeScreen;", "Lpowerwatch/matrix/com/pwgen2android/sdk/SettingTable$BLEDisconnect;", "Lpowerwatch/matrix/com/pwgen2android/sdk/SettingTable$Ringtone;", "Lpowerwatch/matrix/com/pwgen2android/sdk/SettingTable$Alert;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public abstract class SettingTable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final powerwatch.matrix.com.pwgen2android.sdk.SettingTable.Companion INSTANCE = new powerwatch.matrix.com.pwgen2android.sdk.SettingTable.Companion(null);
    private static final java.util.HashMap<java.lang.Integer, kotlin.jvm.functions.Function2<powerwatch.matrix.com.pwgen2android.sdk.SettingsData, java.util.List<java.lang.Byte>, kotlin.Unit>> array;
    private final byte key;

    public /* synthetic */ SettingTable(byte b, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(b);
    }

    private SettingTable(byte b) {
        this.key = b;
    }

    public final byte getKey() {
        return this.key;
    }

    /* JADX INFO: compiled from: SettingsDataParser.kt */
    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u009a\u0001\u0010\u0003\u001a\u008a\u0001\u0012\u0004\u0012\u00020\u0005\u0012:\u00128\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e0\u00060\u0004jD\u0012\u0004\u0012\u00020\u0005\u0012:\u00128\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e0\u0006`\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/SettingTable$Companion;", "", "()V", "array", "Ljava/util/HashMap;", "", "Lkotlin/Function2;", "Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;", "Lkotlin/ParameterName;", com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME, "data", "", "", "dataList", "", "Lkotlin/collections/HashMap;", "getArray", "()Ljava/util/HashMap;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final java.util.HashMap<java.lang.Integer, kotlin.jvm.functions.Function2<powerwatch.matrix.com.pwgen2android.sdk.SettingsData, java.util.List<java.lang.Byte>, kotlin.Unit>> getArray() {
            return powerwatch.matrix.com.pwgen2android.sdk.SettingTable.array;
        }
    }

    static {
        java.util.HashMap<java.lang.Integer, kotlin.jvm.functions.Function2<powerwatch.matrix.com.pwgen2android.sdk.SettingsData, java.util.List<java.lang.Byte>, kotlin.Unit>> map = new java.util.HashMap<>();
        array = map;
        map.put(java.lang.Integer.valueOf(powerwatch.matrix.com.pwgen2android.sdk.SettingTable.ClockFormatSelection.INSTANCE.getKey()), new kotlin.jvm.functions.Function2<powerwatch.matrix.com.pwgen2android.sdk.SettingsData, java.util.List<? extends java.lang.Byte>, kotlin.Unit>() { // from class: powerwatch.matrix.com.pwgen2android.sdk.SettingTable.Companion.1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(powerwatch.matrix.com.pwgen2android.sdk.SettingsData settingsData, java.util.List<? extends java.lang.Byte> list) {
                invoke2(settingsData, (java.util.List<java.lang.Byte>) list);
                return kotlin.Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(powerwatch.matrix.com.pwgen2android.sdk.SettingsData data, java.util.List<java.lang.Byte> dataList) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "data");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataList, "dataList");
                data.setClockFormatSelection(powerwatch.matrix.com.pwgen2android.sdk.SettingsDataParserKt.extractInt$default(dataList, false, 2, null));
            }
        });
        map.put(java.lang.Integer.valueOf(powerwatch.matrix.com.pwgen2android.sdk.SettingTable.UnitSelection.INSTANCE.getKey()), new kotlin.jvm.functions.Function2<powerwatch.matrix.com.pwgen2android.sdk.SettingsData, java.util.List<? extends java.lang.Byte>, kotlin.Unit>() { // from class: powerwatch.matrix.com.pwgen2android.sdk.SettingTable.Companion.2
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(powerwatch.matrix.com.pwgen2android.sdk.SettingsData settingsData, java.util.List<? extends java.lang.Byte> list) {
                invoke2(settingsData, (java.util.List<java.lang.Byte>) list);
                return kotlin.Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(powerwatch.matrix.com.pwgen2android.sdk.SettingsData data, java.util.List<java.lang.Byte> dataList) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "data");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataList, "dataList");
                data.setUnitSelection(powerwatch.matrix.com.pwgen2android.sdk.SettingsDataParserKt.extractInt$default(dataList, false, 2, null));
            }
        });
        map.put(java.lang.Integer.valueOf(powerwatch.matrix.com.pwgen2android.sdk.SettingTable.LanguageSelection.INSTANCE.getKey()), new kotlin.jvm.functions.Function2<powerwatch.matrix.com.pwgen2android.sdk.SettingsData, java.util.List<? extends java.lang.Byte>, kotlin.Unit>() { // from class: powerwatch.matrix.com.pwgen2android.sdk.SettingTable.Companion.3
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(powerwatch.matrix.com.pwgen2android.sdk.SettingsData settingsData, java.util.List<? extends java.lang.Byte> list) {
                invoke2(settingsData, (java.util.List<java.lang.Byte>) list);
                return kotlin.Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(powerwatch.matrix.com.pwgen2android.sdk.SettingsData data, java.util.List<java.lang.Byte> dataList) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "data");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataList, "dataList");
                data.setLanguageSelection(powerwatch.matrix.com.pwgen2android.sdk.SettingsDataParserKt.extractInt$default(dataList, false, 2, null));
            }
        });
        map.put(java.lang.Integer.valueOf(powerwatch.matrix.com.pwgen2android.sdk.SettingTable.TimeZone.INSTANCE.getKey()), new kotlin.jvm.functions.Function2<powerwatch.matrix.com.pwgen2android.sdk.SettingsData, java.util.List<? extends java.lang.Byte>, kotlin.Unit>() { // from class: powerwatch.matrix.com.pwgen2android.sdk.SettingTable.Companion.4
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(powerwatch.matrix.com.pwgen2android.sdk.SettingsData settingsData, java.util.List<? extends java.lang.Byte> list) {
                invoke2(settingsData, (java.util.List<java.lang.Byte>) list);
                return kotlin.Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(powerwatch.matrix.com.pwgen2android.sdk.SettingsData data, java.util.List<java.lang.Byte> dataList) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "data");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataList, "dataList");
                data.setTimeZone(powerwatch.matrix.com.pwgen2android.sdk.SettingsDataParserKt.extractInt$default(dataList, false, 2, null));
            }
        });
        map.put(java.lang.Integer.valueOf(powerwatch.matrix.com.pwgen2android.sdk.SettingTable.Gender.INSTANCE.getKey()), new kotlin.jvm.functions.Function2<powerwatch.matrix.com.pwgen2android.sdk.SettingsData, java.util.List<? extends java.lang.Byte>, kotlin.Unit>() { // from class: powerwatch.matrix.com.pwgen2android.sdk.SettingTable.Companion.5
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(powerwatch.matrix.com.pwgen2android.sdk.SettingsData settingsData, java.util.List<? extends java.lang.Byte> list) {
                invoke2(settingsData, (java.util.List<java.lang.Byte>) list);
                return kotlin.Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(powerwatch.matrix.com.pwgen2android.sdk.SettingsData data, java.util.List<java.lang.Byte> dataList) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "data");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataList, "dataList");
                data.setGender(powerwatch.matrix.com.pwgen2android.sdk.SettingsDataParserKt.extractInt$default(dataList, false, 2, null));
            }
        });
        map.put(java.lang.Integer.valueOf(powerwatch.matrix.com.pwgen2android.sdk.SettingTable.Age.INSTANCE.getKey()), new kotlin.jvm.functions.Function2<powerwatch.matrix.com.pwgen2android.sdk.SettingsData, java.util.List<? extends java.lang.Byte>, kotlin.Unit>() { // from class: powerwatch.matrix.com.pwgen2android.sdk.SettingTable.Companion.6
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(powerwatch.matrix.com.pwgen2android.sdk.SettingsData settingsData, java.util.List<? extends java.lang.Byte> list) {
                invoke2(settingsData, (java.util.List<java.lang.Byte>) list);
                return kotlin.Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(powerwatch.matrix.com.pwgen2android.sdk.SettingsData data, java.util.List<java.lang.Byte> dataList) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "data");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataList, "dataList");
                data.setAge(powerwatch.matrix.com.pwgen2android.sdk.SettingsDataParserKt.extractInt$default(dataList, false, 2, null));
            }
        });
        map.put(java.lang.Integer.valueOf(powerwatch.matrix.com.pwgen2android.sdk.SettingTable.Weight.INSTANCE.getKey()), new kotlin.jvm.functions.Function2<powerwatch.matrix.com.pwgen2android.sdk.SettingsData, java.util.List<? extends java.lang.Byte>, kotlin.Unit>() { // from class: powerwatch.matrix.com.pwgen2android.sdk.SettingTable.Companion.7
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(powerwatch.matrix.com.pwgen2android.sdk.SettingsData settingsData, java.util.List<? extends java.lang.Byte> list) {
                invoke2(settingsData, (java.util.List<java.lang.Byte>) list);
                return kotlin.Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(powerwatch.matrix.com.pwgen2android.sdk.SettingsData data, java.util.List<java.lang.Byte> dataList) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "data");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataList, "dataList");
                data.setWeight(powerwatch.matrix.com.pwgen2android.sdk.SettingsDataParserKt.extractInt$default(dataList, false, 2, null));
            }
        });
        map.put(java.lang.Integer.valueOf(powerwatch.matrix.com.pwgen2android.sdk.SettingTable.Height.INSTANCE.getKey()), new kotlin.jvm.functions.Function2<powerwatch.matrix.com.pwgen2android.sdk.SettingsData, java.util.List<? extends java.lang.Byte>, kotlin.Unit>() { // from class: powerwatch.matrix.com.pwgen2android.sdk.SettingTable.Companion.8
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(powerwatch.matrix.com.pwgen2android.sdk.SettingsData settingsData, java.util.List<? extends java.lang.Byte> list) {
                invoke2(settingsData, (java.util.List<java.lang.Byte>) list);
                return kotlin.Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(powerwatch.matrix.com.pwgen2android.sdk.SettingsData data, java.util.List<java.lang.Byte> dataList) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "data");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataList, "dataList");
                data.setHeight(powerwatch.matrix.com.pwgen2android.sdk.SettingsDataParserKt.extractInt$default(dataList, false, 2, null));
            }
        });
        map.put(java.lang.Integer.valueOf(powerwatch.matrix.com.pwgen2android.sdk.SettingTable.StepGoal.INSTANCE.getKey()), new kotlin.jvm.functions.Function2<powerwatch.matrix.com.pwgen2android.sdk.SettingsData, java.util.List<? extends java.lang.Byte>, kotlin.Unit>() { // from class: powerwatch.matrix.com.pwgen2android.sdk.SettingTable.Companion.9
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(powerwatch.matrix.com.pwgen2android.sdk.SettingsData settingsData, java.util.List<? extends java.lang.Byte> list) {
                invoke2(settingsData, (java.util.List<java.lang.Byte>) list);
                return kotlin.Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(powerwatch.matrix.com.pwgen2android.sdk.SettingsData data, java.util.List<java.lang.Byte> dataList) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "data");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataList, "dataList");
                data.setStepGoal(powerwatch.matrix.com.pwgen2android.sdk.SettingsDataParserKt.extractInt$default(dataList, false, 2, null));
            }
        });
        map.put(java.lang.Integer.valueOf(powerwatch.matrix.com.pwgen2android.sdk.SettingTable.DistanceGoal.INSTANCE.getKey()), new kotlin.jvm.functions.Function2<powerwatch.matrix.com.pwgen2android.sdk.SettingsData, java.util.List<? extends java.lang.Byte>, kotlin.Unit>() { // from class: powerwatch.matrix.com.pwgen2android.sdk.SettingTable.Companion.10
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(powerwatch.matrix.com.pwgen2android.sdk.SettingsData settingsData, java.util.List<? extends java.lang.Byte> list) {
                invoke2(settingsData, (java.util.List<java.lang.Byte>) list);
                return kotlin.Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(powerwatch.matrix.com.pwgen2android.sdk.SettingsData data, java.util.List<java.lang.Byte> dataList) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "data");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataList, "dataList");
                data.setDistanceGoal(powerwatch.matrix.com.pwgen2android.sdk.SettingsDataParserKt.extractInt$default(dataList, false, 2, null));
            }
        });
        map.put(java.lang.Integer.valueOf(powerwatch.matrix.com.pwgen2android.sdk.SettingTable.CaloriesGoal.INSTANCE.getKey()), new kotlin.jvm.functions.Function2<powerwatch.matrix.com.pwgen2android.sdk.SettingsData, java.util.List<? extends java.lang.Byte>, kotlin.Unit>() { // from class: powerwatch.matrix.com.pwgen2android.sdk.SettingTable.Companion.11
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(powerwatch.matrix.com.pwgen2android.sdk.SettingsData settingsData, java.util.List<? extends java.lang.Byte> list) {
                invoke2(settingsData, (java.util.List<java.lang.Byte>) list);
                return kotlin.Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(powerwatch.matrix.com.pwgen2android.sdk.SettingsData data, java.util.List<java.lang.Byte> dataList) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "data");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataList, "dataList");
                data.setCaloriesGoal(powerwatch.matrix.com.pwgen2android.sdk.SettingsDataParserKt.extractInt$default(dataList, false, 2, null));
            }
        });
        map.put(java.lang.Integer.valueOf(powerwatch.matrix.com.pwgen2android.sdk.SettingTable.SleepGoal.INSTANCE.getKey()), new kotlin.jvm.functions.Function2<powerwatch.matrix.com.pwgen2android.sdk.SettingsData, java.util.List<? extends java.lang.Byte>, kotlin.Unit>() { // from class: powerwatch.matrix.com.pwgen2android.sdk.SettingTable.Companion.12
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(powerwatch.matrix.com.pwgen2android.sdk.SettingsData settingsData, java.util.List<? extends java.lang.Byte> list) {
                invoke2(settingsData, (java.util.List<java.lang.Byte>) list);
                return kotlin.Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(powerwatch.matrix.com.pwgen2android.sdk.SettingsData data, java.util.List<java.lang.Byte> dataList) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "data");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataList, "dataList");
                data.setSleepGoal(powerwatch.matrix.com.pwgen2android.sdk.SettingsDataParserKt.extractInt$default(dataList, false, 2, null));
            }
        });
        map.put(java.lang.Integer.valueOf(powerwatch.matrix.com.pwgen2android.sdk.SettingTable.DND.INSTANCE.getKey()), new kotlin.jvm.functions.Function2<powerwatch.matrix.com.pwgen2android.sdk.SettingsData, java.util.List<? extends java.lang.Byte>, kotlin.Unit>() { // from class: powerwatch.matrix.com.pwgen2android.sdk.SettingTable.Companion.13
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(powerwatch.matrix.com.pwgen2android.sdk.SettingsData settingsData, java.util.List<? extends java.lang.Byte> list) {
                invoke2(settingsData, (java.util.List<java.lang.Byte>) list);
                return kotlin.Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(powerwatch.matrix.com.pwgen2android.sdk.SettingsData data, java.util.List<java.lang.Byte> dataList) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "data");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataList, "dataList");
                data.setDnd(powerwatch.matrix.com.pwgen2android.sdk.SettingsDataParserKt.extractInt$default(dataList, false, 2, null));
            }
        });
        map.put(java.lang.Integer.valueOf(powerwatch.matrix.com.pwgen2android.sdk.SettingTable.BackLight.INSTANCE.getKey()), new kotlin.jvm.functions.Function2<powerwatch.matrix.com.pwgen2android.sdk.SettingsData, java.util.List<? extends java.lang.Byte>, kotlin.Unit>() { // from class: powerwatch.matrix.com.pwgen2android.sdk.SettingTable.Companion.14
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(powerwatch.matrix.com.pwgen2android.sdk.SettingsData settingsData, java.util.List<? extends java.lang.Byte> list) {
                invoke2(settingsData, (java.util.List<java.lang.Byte>) list);
                return kotlin.Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(powerwatch.matrix.com.pwgen2android.sdk.SettingsData data, java.util.List<java.lang.Byte> dataList) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "data");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataList, "dataList");
                data.setBackLight(powerwatch.matrix.com.pwgen2android.sdk.SettingsDataParserKt.extractInt$default(dataList, false, 2, null));
            }
        });
        map.put(java.lang.Integer.valueOf(powerwatch.matrix.com.pwgen2android.sdk.SettingTable.BackLightDuration.INSTANCE.getKey()), new kotlin.jvm.functions.Function2<powerwatch.matrix.com.pwgen2android.sdk.SettingsData, java.util.List<? extends java.lang.Byte>, kotlin.Unit>() { // from class: powerwatch.matrix.com.pwgen2android.sdk.SettingTable.Companion.15
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(powerwatch.matrix.com.pwgen2android.sdk.SettingsData settingsData, java.util.List<? extends java.lang.Byte> list) {
                invoke2(settingsData, (java.util.List<java.lang.Byte>) list);
                return kotlin.Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(powerwatch.matrix.com.pwgen2android.sdk.SettingsData data, java.util.List<java.lang.Byte> dataList) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "data");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataList, "dataList");
                data.setBackLightDuration(powerwatch.matrix.com.pwgen2android.sdk.SettingsDataParserKt.extractInt$default(dataList, false, 2, null));
            }
        });
        map.put(java.lang.Integer.valueOf(powerwatch.matrix.com.pwgen2android.sdk.SettingTable.PopupDuration.INSTANCE.getKey()), new kotlin.jvm.functions.Function2<powerwatch.matrix.com.pwgen2android.sdk.SettingsData, java.util.List<? extends java.lang.Byte>, kotlin.Unit>() { // from class: powerwatch.matrix.com.pwgen2android.sdk.SettingTable.Companion.16
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(powerwatch.matrix.com.pwgen2android.sdk.SettingsData settingsData, java.util.List<? extends java.lang.Byte> list) {
                invoke2(settingsData, (java.util.List<java.lang.Byte>) list);
                return kotlin.Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(powerwatch.matrix.com.pwgen2android.sdk.SettingsData data, java.util.List<java.lang.Byte> dataList) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "data");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataList, "dataList");
                data.setPopupDuration(powerwatch.matrix.com.pwgen2android.sdk.SettingsDataParserKt.extractInt$default(dataList, false, 2, null));
            }
        });
        map.put(java.lang.Integer.valueOf(powerwatch.matrix.com.pwgen2android.sdk.SettingTable.GPSUpdateRate.INSTANCE.getKey()), new kotlin.jvm.functions.Function2<powerwatch.matrix.com.pwgen2android.sdk.SettingsData, java.util.List<? extends java.lang.Byte>, kotlin.Unit>() { // from class: powerwatch.matrix.com.pwgen2android.sdk.SettingTable.Companion.17
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(powerwatch.matrix.com.pwgen2android.sdk.SettingsData settingsData, java.util.List<? extends java.lang.Byte> list) {
                invoke2(settingsData, (java.util.List<java.lang.Byte>) list);
                return kotlin.Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(powerwatch.matrix.com.pwgen2android.sdk.SettingsData data, java.util.List<java.lang.Byte> dataList) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "data");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataList, "dataList");
                data.setGpsUpdateRate(powerwatch.matrix.com.pwgen2android.sdk.SettingsDataParserKt.extractInt$default(dataList, false, 2, null));
            }
        });
        map.put(java.lang.Integer.valueOf(powerwatch.matrix.com.pwgen2android.sdk.SettingTable.HomeScreen.INSTANCE.getKey()), new kotlin.jvm.functions.Function2<powerwatch.matrix.com.pwgen2android.sdk.SettingsData, java.util.List<? extends java.lang.Byte>, kotlin.Unit>() { // from class: powerwatch.matrix.com.pwgen2android.sdk.SettingTable.Companion.18
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(powerwatch.matrix.com.pwgen2android.sdk.SettingsData settingsData, java.util.List<? extends java.lang.Byte> list) {
                invoke2(settingsData, (java.util.List<java.lang.Byte>) list);
                return kotlin.Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(powerwatch.matrix.com.pwgen2android.sdk.SettingsData data, java.util.List<java.lang.Byte> dataList) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "data");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataList, "dataList");
                data.setHomeScreen(powerwatch.matrix.com.pwgen2android.sdk.SettingsDataParserKt.extractInt$default(dataList, false, 2, null));
            }
        });
        map.put(java.lang.Integer.valueOf(powerwatch.matrix.com.pwgen2android.sdk.SettingTable.BLEDisconnect.INSTANCE.getKey()), new kotlin.jvm.functions.Function2<powerwatch.matrix.com.pwgen2android.sdk.SettingsData, java.util.List<? extends java.lang.Byte>, kotlin.Unit>() { // from class: powerwatch.matrix.com.pwgen2android.sdk.SettingTable.Companion.19
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(powerwatch.matrix.com.pwgen2android.sdk.SettingsData settingsData, java.util.List<? extends java.lang.Byte> list) {
                invoke2(settingsData, (java.util.List<java.lang.Byte>) list);
                return kotlin.Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(powerwatch.matrix.com.pwgen2android.sdk.SettingsData data, java.util.List<java.lang.Byte> dataList) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "data");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataList, "dataList");
                data.setBleDisconnect(powerwatch.matrix.com.pwgen2android.sdk.SettingsDataParserKt.extractInt$default(dataList, false, 2, null));
            }
        });
        map.put(java.lang.Integer.valueOf(powerwatch.matrix.com.pwgen2android.sdk.SettingTable.Ringtone.INSTANCE.getKey()), new kotlin.jvm.functions.Function2<powerwatch.matrix.com.pwgen2android.sdk.SettingsData, java.util.List<? extends java.lang.Byte>, kotlin.Unit>() { // from class: powerwatch.matrix.com.pwgen2android.sdk.SettingTable.Companion.20
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(powerwatch.matrix.com.pwgen2android.sdk.SettingsData settingsData, java.util.List<? extends java.lang.Byte> list) {
                invoke2(settingsData, (java.util.List<java.lang.Byte>) list);
                return kotlin.Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(powerwatch.matrix.com.pwgen2android.sdk.SettingsData data, java.util.List<java.lang.Byte> dataList) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "data");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataList, "dataList");
                data.setRingtone(powerwatch.matrix.com.pwgen2android.sdk.SettingsDataParserKt.extractInt$default(dataList, false, 2, null));
            }
        });
        map.put(java.lang.Integer.valueOf(powerwatch.matrix.com.pwgen2android.sdk.SettingTable.Alert.INSTANCE.getKey()), new kotlin.jvm.functions.Function2<powerwatch.matrix.com.pwgen2android.sdk.SettingsData, java.util.List<? extends java.lang.Byte>, kotlin.Unit>() { // from class: powerwatch.matrix.com.pwgen2android.sdk.SettingTable.Companion.21
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(powerwatch.matrix.com.pwgen2android.sdk.SettingsData settingsData, java.util.List<? extends java.lang.Byte> list) {
                invoke2(settingsData, (java.util.List<java.lang.Byte>) list);
                return kotlin.Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(powerwatch.matrix.com.pwgen2android.sdk.SettingsData data, java.util.List<java.lang.Byte> dataList) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "data");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataList, "dataList");
                data.setAlert(powerwatch.matrix.com.pwgen2android.sdk.SettingsDataParserKt.extractInt$default(dataList, false, 2, null));
            }
        });
    }

    /* JADX INFO: compiled from: SettingsDataParser.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/SettingTable$ClockFormatSelection;", "Lpowerwatch/matrix/com/pwgen2android/sdk/SettingTable;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class ClockFormatSelection extends powerwatch.matrix.com.pwgen2android.sdk.SettingTable {
        public static final powerwatch.matrix.com.pwgen2android.sdk.SettingTable.ClockFormatSelection INSTANCE = new powerwatch.matrix.com.pwgen2android.sdk.SettingTable.ClockFormatSelection();

        private ClockFormatSelection() {
            super((byte) 0, null);
        }
    }

    /* JADX INFO: compiled from: SettingsDataParser.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/SettingTable$UnitSelection;", "Lpowerwatch/matrix/com/pwgen2android/sdk/SettingTable;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class UnitSelection extends powerwatch.matrix.com.pwgen2android.sdk.SettingTable {
        public static final powerwatch.matrix.com.pwgen2android.sdk.SettingTable.UnitSelection INSTANCE = new powerwatch.matrix.com.pwgen2android.sdk.SettingTable.UnitSelection();

        private UnitSelection() {
            super((byte) 1, null);
        }
    }

    /* JADX INFO: compiled from: SettingsDataParser.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/SettingTable$LanguageSelection;", "Lpowerwatch/matrix/com/pwgen2android/sdk/SettingTable;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class LanguageSelection extends powerwatch.matrix.com.pwgen2android.sdk.SettingTable {
        public static final powerwatch.matrix.com.pwgen2android.sdk.SettingTable.LanguageSelection INSTANCE = new powerwatch.matrix.com.pwgen2android.sdk.SettingTable.LanguageSelection();

        private LanguageSelection() {
            super((byte) 2, null);
        }
    }

    /* JADX INFO: compiled from: SettingsDataParser.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/SettingTable$TimeZone;", "Lpowerwatch/matrix/com/pwgen2android/sdk/SettingTable;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class TimeZone extends powerwatch.matrix.com.pwgen2android.sdk.SettingTable {
        public static final powerwatch.matrix.com.pwgen2android.sdk.SettingTable.TimeZone INSTANCE = new powerwatch.matrix.com.pwgen2android.sdk.SettingTable.TimeZone();

        private TimeZone() {
            super((byte) 3, null);
        }
    }

    /* JADX INFO: compiled from: SettingsDataParser.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/SettingTable$Gender;", "Lpowerwatch/matrix/com/pwgen2android/sdk/SettingTable;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Gender extends powerwatch.matrix.com.pwgen2android.sdk.SettingTable {
        public static final powerwatch.matrix.com.pwgen2android.sdk.SettingTable.Gender INSTANCE = new powerwatch.matrix.com.pwgen2android.sdk.SettingTable.Gender();

        private Gender() {
            super((byte) 4, null);
        }
    }

    /* JADX INFO: compiled from: SettingsDataParser.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/SettingTable$Age;", "Lpowerwatch/matrix/com/pwgen2android/sdk/SettingTable;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Age extends powerwatch.matrix.com.pwgen2android.sdk.SettingTable {
        public static final powerwatch.matrix.com.pwgen2android.sdk.SettingTable.Age INSTANCE = new powerwatch.matrix.com.pwgen2android.sdk.SettingTable.Age();

        private Age() {
            super((byte) 5, null);
        }
    }

    /* JADX INFO: compiled from: SettingsDataParser.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/SettingTable$Weight;", "Lpowerwatch/matrix/com/pwgen2android/sdk/SettingTable;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Weight extends powerwatch.matrix.com.pwgen2android.sdk.SettingTable {
        public static final powerwatch.matrix.com.pwgen2android.sdk.SettingTable.Weight INSTANCE = new powerwatch.matrix.com.pwgen2android.sdk.SettingTable.Weight();

        private Weight() {
            super((byte) 6, null);
        }
    }

    /* JADX INFO: compiled from: SettingsDataParser.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/SettingTable$Height;", "Lpowerwatch/matrix/com/pwgen2android/sdk/SettingTable;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Height extends powerwatch.matrix.com.pwgen2android.sdk.SettingTable {
        public static final powerwatch.matrix.com.pwgen2android.sdk.SettingTable.Height INSTANCE = new powerwatch.matrix.com.pwgen2android.sdk.SettingTable.Height();

        private Height() {
            super((byte) 7, null);
        }
    }

    /* JADX INFO: compiled from: SettingsDataParser.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/SettingTable$StepGoal;", "Lpowerwatch/matrix/com/pwgen2android/sdk/SettingTable;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class StepGoal extends powerwatch.matrix.com.pwgen2android.sdk.SettingTable {
        public static final powerwatch.matrix.com.pwgen2android.sdk.SettingTable.StepGoal INSTANCE = new powerwatch.matrix.com.pwgen2android.sdk.SettingTable.StepGoal();

        private StepGoal() {
            super((byte) 8, null);
        }
    }

    /* JADX INFO: compiled from: SettingsDataParser.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/SettingTable$DistanceGoal;", "Lpowerwatch/matrix/com/pwgen2android/sdk/SettingTable;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class DistanceGoal extends powerwatch.matrix.com.pwgen2android.sdk.SettingTable {
        public static final powerwatch.matrix.com.pwgen2android.sdk.SettingTable.DistanceGoal INSTANCE = new powerwatch.matrix.com.pwgen2android.sdk.SettingTable.DistanceGoal();

        private DistanceGoal() {
            super((byte) 9, null);
        }
    }

    /* JADX INFO: compiled from: SettingsDataParser.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/SettingTable$CaloriesGoal;", "Lpowerwatch/matrix/com/pwgen2android/sdk/SettingTable;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class CaloriesGoal extends powerwatch.matrix.com.pwgen2android.sdk.SettingTable {
        public static final powerwatch.matrix.com.pwgen2android.sdk.SettingTable.CaloriesGoal INSTANCE = new powerwatch.matrix.com.pwgen2android.sdk.SettingTable.CaloriesGoal();

        private CaloriesGoal() {
            super((byte) 10, null);
        }
    }

    /* JADX INFO: compiled from: SettingsDataParser.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/SettingTable$SleepGoal;", "Lpowerwatch/matrix/com/pwgen2android/sdk/SettingTable;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class SleepGoal extends powerwatch.matrix.com.pwgen2android.sdk.SettingTable {
        public static final powerwatch.matrix.com.pwgen2android.sdk.SettingTable.SleepGoal INSTANCE = new powerwatch.matrix.com.pwgen2android.sdk.SettingTable.SleepGoal();

        private SleepGoal() {
            super((byte) 11, null);
        }
    }

    /* JADX INFO: compiled from: SettingsDataParser.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/SettingTable$DND;", "Lpowerwatch/matrix/com/pwgen2android/sdk/SettingTable;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class DND extends powerwatch.matrix.com.pwgen2android.sdk.SettingTable {
        public static final powerwatch.matrix.com.pwgen2android.sdk.SettingTable.DND INSTANCE = new powerwatch.matrix.com.pwgen2android.sdk.SettingTable.DND();

        private DND() {
            super((byte) 12, null);
        }
    }

    /* JADX INFO: compiled from: SettingsDataParser.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/SettingTable$BackLight;", "Lpowerwatch/matrix/com/pwgen2android/sdk/SettingTable;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class BackLight extends powerwatch.matrix.com.pwgen2android.sdk.SettingTable {
        public static final powerwatch.matrix.com.pwgen2android.sdk.SettingTable.BackLight INSTANCE = new powerwatch.matrix.com.pwgen2android.sdk.SettingTable.BackLight();

        private BackLight() {
            super((byte) 13, null);
        }
    }

    /* JADX INFO: compiled from: SettingsDataParser.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/SettingTable$BackLightDuration;", "Lpowerwatch/matrix/com/pwgen2android/sdk/SettingTable;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class BackLightDuration extends powerwatch.matrix.com.pwgen2android.sdk.SettingTable {
        public static final powerwatch.matrix.com.pwgen2android.sdk.SettingTable.BackLightDuration INSTANCE = new powerwatch.matrix.com.pwgen2android.sdk.SettingTable.BackLightDuration();

        private BackLightDuration() {
            super((byte) 14, null);
        }
    }

    /* JADX INFO: compiled from: SettingsDataParser.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/SettingTable$PopupDuration;", "Lpowerwatch/matrix/com/pwgen2android/sdk/SettingTable;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class PopupDuration extends powerwatch.matrix.com.pwgen2android.sdk.SettingTable {
        public static final powerwatch.matrix.com.pwgen2android.sdk.SettingTable.PopupDuration INSTANCE = new powerwatch.matrix.com.pwgen2android.sdk.SettingTable.PopupDuration();

        private PopupDuration() {
            super((byte) 15, null);
        }
    }

    /* JADX INFO: compiled from: SettingsDataParser.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/SettingTable$GPSUpdateRate;", "Lpowerwatch/matrix/com/pwgen2android/sdk/SettingTable;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class GPSUpdateRate extends powerwatch.matrix.com.pwgen2android.sdk.SettingTable {
        public static final powerwatch.matrix.com.pwgen2android.sdk.SettingTable.GPSUpdateRate INSTANCE = new powerwatch.matrix.com.pwgen2android.sdk.SettingTable.GPSUpdateRate();

        private GPSUpdateRate() {
            super((byte) 16, null);
        }
    }

    /* JADX INFO: compiled from: SettingsDataParser.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/SettingTable$HomeScreen;", "Lpowerwatch/matrix/com/pwgen2android/sdk/SettingTable;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class HomeScreen extends powerwatch.matrix.com.pwgen2android.sdk.SettingTable {
        public static final powerwatch.matrix.com.pwgen2android.sdk.SettingTable.HomeScreen INSTANCE = new powerwatch.matrix.com.pwgen2android.sdk.SettingTable.HomeScreen();

        private HomeScreen() {
            super((byte) 17, null);
        }
    }

    /* JADX INFO: compiled from: SettingsDataParser.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/SettingTable$BLEDisconnect;", "Lpowerwatch/matrix/com/pwgen2android/sdk/SettingTable;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class BLEDisconnect extends powerwatch.matrix.com.pwgen2android.sdk.SettingTable {
        public static final powerwatch.matrix.com.pwgen2android.sdk.SettingTable.BLEDisconnect INSTANCE = new powerwatch.matrix.com.pwgen2android.sdk.SettingTable.BLEDisconnect();

        private BLEDisconnect() {
            super((byte) 18, null);
        }
    }

    /* JADX INFO: compiled from: SettingsDataParser.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/SettingTable$Ringtone;", "Lpowerwatch/matrix/com/pwgen2android/sdk/SettingTable;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Ringtone extends powerwatch.matrix.com.pwgen2android.sdk.SettingTable {
        public static final powerwatch.matrix.com.pwgen2android.sdk.SettingTable.Ringtone INSTANCE = new powerwatch.matrix.com.pwgen2android.sdk.SettingTable.Ringtone();

        private Ringtone() {
            super((byte) 19, null);
        }
    }

    /* JADX INFO: compiled from: SettingsDataParser.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/SettingTable$Alert;", "Lpowerwatch/matrix/com/pwgen2android/sdk/SettingTable;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Alert extends powerwatch.matrix.com.pwgen2android.sdk.SettingTable {
        public static final powerwatch.matrix.com.pwgen2android.sdk.SettingTable.Alert INSTANCE = new powerwatch.matrix.com.pwgen2android.sdk.SettingTable.Alert();

        private Alert() {
            super((byte) 20, null);
        }
    }
}
