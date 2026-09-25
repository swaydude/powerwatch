package powerwatch.matrix.com.pwgen2android.setup.biometrics;

/* JADX INFO: compiled from: BiometricsViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010,\u001a\u00020\u000fJ\u000e\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020\u000fJ\n\u00100\u001a\u00020.*\u000201J\n\u00102\u001a\u00020.*\u000201J\n\u00103\u001a\u00020.*\u000201J\n\u00104\u001a\u00020.*\u000201J\n\u00105\u001a\u00020.*\u000201R\u001f\u0010\u0005\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.¢\u0006\u0002\n\u0000R\u001f\u0010\u0010\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\nR\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\nR\u001f\u0010\u0015\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\nR\u001f\u0010\u0017\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\nR\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\f0\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\nR\u001f\u0010\u001b\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\nR\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00130\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\nR\u001f\u0010\u001f\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010 0 0\u0006¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\nR\u001f\u0010\"\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010#0#0\u0006¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\nR\u001f\u0010%\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\nR\u0017\u0010'\u001a\b\u0012\u0004\u0012\u00020\f0\u0006¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\nR\u001f\u0010)\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010*0*0\u0006¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\n¨\u00066"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel;", "Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;", "appContext", "Landroid/content/Context;", "(Landroid/content/Context;)V", "age", "Landroidx/databinding/ObservableField;", "", "kotlin.jvm.PlatformType", "getAge", "()Landroidx/databinding/ObservableField;", "agePicker", "Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/PickedData;", "getAgePicker", "currentBiometrics", "Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/Biometrics;", "gender", "getGender", "genderAdapter", "Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/StringPickerAdapter;", "getGenderAdapter", "genderPicker", "getGenderPicker", io.fabric.sdk.android.services.settings.SettingsJsonConstants.ICON_HEIGHT_KEY, "getHeight", "heightPicker", "getHeightPicker", "language", "getLanguage", "languageAdapter", "getLanguageAdapter", "languageShown", "", "getLanguageShown", "textColor", "", "getTextColor", "weight", "getWeight", "weightPicker", "getWeightPicker", "wheelConfig", "Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelConfig;", "getWheelConfig", "getBiometrics", "setBiometrics", "", "biometrics", "onAgeClicked", "Landroid/view/View;", "onGenderClicked", "onHeightClicked", "onLanguageClicked", "onWeightClicked", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class BiometricsViewModel extends powerwatch.matrix.com.pwgen2android.shared.BaseViewModel {
    private final androidx.databinding.ObservableField<java.lang.String> age;
    private final androidx.databinding.ObservableField<powerwatch.matrix.com.pwgen2android.setup.biometrics.PickedData> agePicker;
    private final android.content.Context appContext;
    private powerwatch.matrix.com.pwgen2android.setup.biometrics.Biometrics currentBiometrics;
    private final androidx.databinding.ObservableField<java.lang.String> gender;
    private final androidx.databinding.ObservableField<powerwatch.matrix.com.pwgen2android.setup.biometrics.StringPickerAdapter> genderAdapter;
    private final androidx.databinding.ObservableField<java.lang.String> genderPicker;
    private final androidx.databinding.ObservableField<java.lang.String> height;
    private final androidx.databinding.ObservableField<powerwatch.matrix.com.pwgen2android.setup.biometrics.PickedData> heightPicker;
    private final androidx.databinding.ObservableField<java.lang.String> language;
    private final androidx.databinding.ObservableField<powerwatch.matrix.com.pwgen2android.setup.biometrics.StringPickerAdapter> languageAdapter;
    private final androidx.databinding.ObservableField<java.lang.Boolean> languageShown;
    private final androidx.databinding.ObservableField<java.lang.Integer> textColor;
    private final androidx.databinding.ObservableField<java.lang.String> weight;
    private final androidx.databinding.ObservableField<powerwatch.matrix.com.pwgen2android.setup.biometrics.PickedData> weightPicker;
    private final androidx.databinding.ObservableField<powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelConfig> wheelConfig;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BiometricsViewModel(android.content.Context appContext) {
        super(null, null, 3, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appContext, "appContext");
        this.appContext = appContext;
        this.age = new androidx.databinding.ObservableField<>("25");
        this.height = new androidx.databinding.ObservableField<>("180");
        this.weight = new androidx.databinding.ObservableField<>("80");
        this.gender = new androidx.databinding.ObservableField<>(powerwatch.matrix.com.pwgen2android.shared.data.models.Gender.Male.INSTANCE.getDescription());
        this.language = new androidx.databinding.ObservableField<>("English");
        this.textColor = new androidx.databinding.ObservableField<>(java.lang.Integer.valueOf(androidx.core.content.ContextCompat.getColor(appContext, powerwatch.matrix.com.pwgen2android.R.color.white)));
        this.wheelConfig = new androidx.databinding.ObservableField<>(new powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelConfig(powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelType.Weight.INSTANCE, null, null, 0, 0, 0, 62, null));
        this.agePicker = new androidx.databinding.ObservableField<>(new powerwatch.matrix.com.pwgen2android.setup.biometrics.PickedData("45", null, 120, 13, null, 18, null));
        kotlin.ranges.IntRange intRange = new kotlin.ranges.IntRange(100, powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtilsKt.metricHeightMax);
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(intRange, 10));
        java.util.Iterator<java.lang.Integer> it = intRange.iterator();
        while (it.hasNext()) {
            arrayList.add(java.lang.String.valueOf(((kotlin.collections.IntIterator) it).nextInt()));
        }
        java.lang.Object[] array = arrayList.toArray(new java.lang.String[0]);
        java.util.Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        this.heightPicker = new androidx.databinding.ObservableField<>(new powerwatch.matrix.com.pwgen2android.setup.biometrics.PickedData("180", (java.lang.String[]) array, powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtilsKt.metricHeightMax, 100, null, 16, null));
        kotlin.ranges.IntRange intRange2 = new kotlin.ranges.IntRange(20, 300);
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(intRange2, 10));
        java.util.Iterator<java.lang.Integer> it2 = intRange2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(java.lang.String.valueOf(((kotlin.collections.IntIterator) it2).nextInt()));
        }
        java.lang.Object[] array2 = arrayList2.toArray(new java.lang.String[0]);
        java.util.Objects.requireNonNull(array2, "null cannot be cast to non-null type kotlin.Array<T>");
        this.weightPicker = new androidx.databinding.ObservableField<>(new powerwatch.matrix.com.pwgen2android.setup.biometrics.PickedData("80", (java.lang.String[]) array2, 300, 20, null, 16, null));
        this.genderPicker = new androidx.databinding.ObservableField<>(powerwatch.matrix.com.pwgen2android.shared.data.models.Gender.Male.INSTANCE.getDescription());
        java.util.List<powerwatch.matrix.com.pwgen2android.utils.LanguageInfo> languageInfos = powerwatch.matrix.com.pwgen2android.utils.LanguageControllerImpl.INSTANCE.getLanguageInfos();
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(languageInfos, 10));
        java.util.Iterator<T> it3 = languageInfos.iterator();
        while (it3.hasNext()) {
            arrayList3.add(this.appContext.getString(((powerwatch.matrix.com.pwgen2android.utils.LanguageInfo) it3.next()).getLanguageDisplay()));
        }
        java.lang.Object[] array3 = arrayList3.toArray(new java.lang.String[0]);
        java.util.Objects.requireNonNull(array3, "null cannot be cast to non-null type kotlin.Array<T>");
        this.languageAdapter = new androidx.databinding.ObservableField<>(new powerwatch.matrix.com.pwgen2android.setup.biometrics.StringPickerAdapter(new powerwatch.matrix.com.pwgen2android.setup.biometrics.PickedData(null, (java.lang.String[]) array3, 0, 0, null, 29, null), null, 2, null));
        this.genderAdapter = new androidx.databinding.ObservableField<>(new powerwatch.matrix.com.pwgen2android.setup.biometrics.StringPickerAdapter(new powerwatch.matrix.com.pwgen2android.setup.biometrics.PickedData(null, new java.lang.String[]{powerwatch.matrix.com.pwgen2android.shared.data.models.Gender.Male.INSTANCE.getDescription(), powerwatch.matrix.com.pwgen2android.shared.data.models.Gender.Female.INSTANCE.getDescription()}, 0, 0, null, 29, null), null, 2, null));
        this.languageShown = new androidx.databinding.ObservableField<>(true);
    }

    public final androidx.databinding.ObservableField<java.lang.String> getAge() {
        return this.age;
    }

    public final androidx.databinding.ObservableField<java.lang.String> getHeight() {
        return this.height;
    }

    public final androidx.databinding.ObservableField<java.lang.String> getWeight() {
        return this.weight;
    }

    public final androidx.databinding.ObservableField<java.lang.String> getGender() {
        return this.gender;
    }

    public final androidx.databinding.ObservableField<java.lang.String> getLanguage() {
        return this.language;
    }

    public final androidx.databinding.ObservableField<java.lang.Integer> getTextColor() {
        return this.textColor;
    }

    public final androidx.databinding.ObservableField<powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelConfig> getWheelConfig() {
        return this.wheelConfig;
    }

    public final androidx.databinding.ObservableField<powerwatch.matrix.com.pwgen2android.setup.biometrics.PickedData> getAgePicker() {
        return this.agePicker;
    }

    public final androidx.databinding.ObservableField<powerwatch.matrix.com.pwgen2android.setup.biometrics.PickedData> getHeightPicker() {
        return this.heightPicker;
    }

    public final androidx.databinding.ObservableField<powerwatch.matrix.com.pwgen2android.setup.biometrics.PickedData> getWeightPicker() {
        return this.weightPicker;
    }

    public final androidx.databinding.ObservableField<java.lang.String> getGenderPicker() {
        return this.genderPicker;
    }

    public final androidx.databinding.ObservableField<powerwatch.matrix.com.pwgen2android.setup.biometrics.StringPickerAdapter> getLanguageAdapter() {
        return this.languageAdapter;
    }

    public final androidx.databinding.ObservableField<powerwatch.matrix.com.pwgen2android.setup.biometrics.StringPickerAdapter> getGenderAdapter() {
        return this.genderAdapter;
    }

    public final androidx.databinding.ObservableField<java.lang.Boolean> getLanguageShown() {
        return this.languageShown;
    }

    public final void setBiometrics(powerwatch.matrix.com.pwgen2android.setup.biometrics.Biometrics biometrics) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(biometrics, "biometrics");
        this.currentBiometrics = biometrics;
        java.lang.String strValueOf = java.lang.String.valueOf(biometrics.getAge());
        java.lang.String str = biometrics.getHeight().getFirst().intValue() + biometrics.getHeight().getSecond();
        java.lang.String str2 = kotlin.math.MathKt.roundToInt(biometrics.getWeight().getFirst().floatValue()) + biometrics.getWeight().getSecond();
        java.lang.String gender = biometrics.getGender();
        this.age.set(strValueOf);
        this.height.set(str);
        this.weight.set(str2);
        this.gender.set(gender);
        androidx.databinding.ObservableField<powerwatch.matrix.com.pwgen2android.setup.biometrics.PickedData> observableField = this.agePicker;
        powerwatch.matrix.com.pwgen2android.setup.biometrics.PickedData pickedData = observableField.get();
        kotlin.jvm.internal.Intrinsics.checkNotNull(pickedData);
        observableField.set(powerwatch.matrix.com.pwgen2android.setup.biometrics.PickedData.copy$default(pickedData, strValueOf, null, 0, 0, null, 30, null));
        androidx.databinding.ObservableField<powerwatch.matrix.com.pwgen2android.setup.biometrics.PickedData> observableField2 = this.heightPicker;
        powerwatch.matrix.com.pwgen2android.setup.biometrics.PickedData pickedData2 = observableField2.get();
        kotlin.jvm.internal.Intrinsics.checkNotNull(pickedData2);
        observableField2.set(powerwatch.matrix.com.pwgen2android.setup.biometrics.PickedData.copy$default(pickedData2, str, null, 0, 0, null, 30, null));
        androidx.databinding.ObservableField<powerwatch.matrix.com.pwgen2android.setup.biometrics.PickedData> observableField3 = this.weightPicker;
        powerwatch.matrix.com.pwgen2android.setup.biometrics.PickedData pickedData3 = observableField3.get();
        kotlin.jvm.internal.Intrinsics.checkNotNull(pickedData3);
        observableField3.set(powerwatch.matrix.com.pwgen2android.setup.biometrics.PickedData.copy$default(pickedData3, str2, null, 0, 0, null, 30, null));
        this.genderPicker.set(gender);
    }

    public final powerwatch.matrix.com.pwgen2android.setup.biometrics.Biometrics getBiometrics() {
        int i;
        int i2;
        float f;
        powerwatch.matrix.com.pwgen2android.utils.LanguageInfo languageInfoPrevious;
        try {
            java.lang.String str = this.age.get();
            kotlin.jvm.internal.Intrinsics.checkNotNull(str);
            i = java.lang.Integer.parseInt(str);
        } catch (java.lang.Exception unused) {
            i = 25;
        }
        try {
            java.lang.String str2 = this.height.get();
            kotlin.jvm.internal.Intrinsics.checkNotNull(str2);
            powerwatch.matrix.com.pwgen2android.setup.biometrics.Biometrics biometrics = this.currentBiometrics;
            if (biometrics == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("currentBiometrics");
                throw null;
            }
            i2 = java.lang.Integer.parseInt(kotlin.text.StringsKt.replace$default(str2, biometrics.getHeight().getSecond(), "", false, 4, (java.lang.Object) null));
            try {
                java.lang.String str3 = this.weight.get();
                kotlin.jvm.internal.Intrinsics.checkNotNull(str3);
                powerwatch.matrix.com.pwgen2android.setup.biometrics.Biometrics biometrics2 = this.currentBiometrics;
                if (biometrics2 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("currentBiometrics");
                    throw null;
                }
                f = java.lang.Float.parseFloat(kotlin.text.StringsKt.replace$default(str3, biometrics2.getWeight().getSecond(), "", false, 4, (java.lang.Object) null));
                java.lang.String str4 = this.language.get();
                kotlin.jvm.internal.Intrinsics.checkNotNull(str4);
                java.util.List<powerwatch.matrix.com.pwgen2android.utils.LanguageInfo> languageInfos = powerwatch.matrix.com.pwgen2android.utils.LanguageControllerImpl.INSTANCE.getLanguageInfos();
                java.util.ListIterator<powerwatch.matrix.com.pwgen2android.utils.LanguageInfo> listIterator = languageInfos.listIterator(languageInfos.size());
                do {
                    if (!listIterator.hasPrevious()) {
                        languageInfoPrevious = null;
                        break;
                    }
                    languageInfoPrevious = listIterator.previous();
                } while (!kotlin.jvm.internal.Intrinsics.areEqual(this.appContext.getString(languageInfoPrevious.getLanguageDisplay()), str4));
                powerwatch.matrix.com.pwgen2android.utils.LanguageInfo defaultLanguageInfo = languageInfoPrevious;
                if (defaultLanguageInfo == null) {
                    defaultLanguageInfo = powerwatch.matrix.com.pwgen2android.utils.LanguageControllerImpl.INSTANCE.getDefaultLanguageInfo();
                }
                powerwatch.matrix.com.pwgen2android.setup.biometrics.Biometrics biometrics3 = this.currentBiometrics;
                if (biometrics3 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("currentBiometrics");
                    throw null;
                }
                java.lang.Integer numValueOf = java.lang.Integer.valueOf(i2);
                powerwatch.matrix.com.pwgen2android.setup.biometrics.Biometrics biometrics4 = this.currentBiometrics;
                if (biometrics4 != null) {
                    kotlin.Pair pair = new kotlin.Pair(numValueOf, biometrics4.getHeight().getSecond());
                    java.lang.Float fValueOf = java.lang.Float.valueOf(f);
                    powerwatch.matrix.com.pwgen2android.setup.biometrics.Biometrics biometrics5 = this.currentBiometrics;
                    if (biometrics5 != null) {
                        kotlin.Pair pair2 = new kotlin.Pair(fValueOf, biometrics5.getWeight().getSecond());
                        java.lang.String str5 = this.gender.get();
                        kotlin.jvm.internal.Intrinsics.checkNotNull(str5);
                        return powerwatch.matrix.com.pwgen2android.setup.biometrics.Biometrics.copy$default(biometrics3, i, pair, pair2, str5, defaultLanguageInfo, false, 32, null);
                    }
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("currentBiometrics");
                    throw null;
                }
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("currentBiometrics");
                throw null;
            } catch (java.lang.Exception unused2) {
                f = 80.0f;
            }
        } catch (java.lang.Exception unused3) {
            i2 = powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtilsKt.metricHeightDefault;
        }
    }

    public final void onLanguageClicked(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<this>");
        androidx.databinding.ObservableField<powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelConfig> observableField = this.wheelConfig;
        powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelType.Language language = powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelType.Language.INSTANCE;
        java.lang.String str = this.language.get();
        kotlin.jvm.internal.Intrinsics.checkNotNull(str);
        powerwatch.matrix.com.pwgen2android.setup.biometrics.StringPickerAdapter stringPickerAdapter = this.languageAdapter.get();
        kotlin.jvm.internal.Intrinsics.checkNotNull(stringPickerAdapter);
        powerwatch.matrix.com.pwgen2android.setup.biometrics.StringPickerAdapter stringPickerAdapter2 = this.languageAdapter.get();
        kotlin.jvm.internal.Intrinsics.checkNotNull(stringPickerAdapter2);
        observableField.set(new powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelConfig(language, str, stringPickerAdapter, 0, 0, stringPickerAdapter2.getMaxIndex() + 1, 24, null));
    }

    public final void onAgeClicked(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<this>");
        androidx.databinding.ObservableField<powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelConfig> observableField = this.wheelConfig;
        powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelType.Age age = powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelType.Age.INSTANCE;
        powerwatch.matrix.com.pwgen2android.setup.biometrics.PickedData pickedData = this.agePicker.get();
        kotlin.jvm.internal.Intrinsics.checkNotNull(pickedData);
        java.lang.String value = pickedData.getValue();
        powerwatch.matrix.com.pwgen2android.setup.biometrics.PickedData pickedData2 = this.agePicker.get();
        kotlin.jvm.internal.Intrinsics.checkNotNull(pickedData2);
        int max = pickedData2.getMax();
        powerwatch.matrix.com.pwgen2android.setup.biometrics.PickedData pickedData3 = this.agePicker.get();
        kotlin.jvm.internal.Intrinsics.checkNotNull(pickedData3);
        observableField.set(new powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelConfig(age, value, null, max, pickedData3.getMin(), 0, 36, null));
    }

    public final void onGenderClicked(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<this>");
        androidx.databinding.ObservableField<powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelConfig> observableField = this.wheelConfig;
        powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelType.Gender gender = powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelType.Gender.INSTANCE;
        java.lang.String str = this.gender.get();
        kotlin.jvm.internal.Intrinsics.checkNotNull(str);
        powerwatch.matrix.com.pwgen2android.setup.biometrics.StringPickerAdapter stringPickerAdapter = this.genderAdapter.get();
        kotlin.jvm.internal.Intrinsics.checkNotNull(stringPickerAdapter);
        observableField.set(new powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelConfig(gender, str, stringPickerAdapter, 0, 0, 4, 24, null));
    }

    public final void onWeightClicked(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<this>");
        androidx.databinding.ObservableField<powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelConfig> observableField = this.wheelConfig;
        powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelType.Weight weight = powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelType.Weight.INSTANCE;
        java.lang.String str = this.weight.get();
        kotlin.jvm.internal.Intrinsics.checkNotNull(str);
        powerwatch.matrix.com.pwgen2android.setup.biometrics.PickedData pickedData = this.weightPicker.get();
        kotlin.jvm.internal.Intrinsics.checkNotNull(pickedData);
        int max = pickedData.getMax();
        powerwatch.matrix.com.pwgen2android.setup.biometrics.PickedData pickedData2 = this.weightPicker.get();
        kotlin.jvm.internal.Intrinsics.checkNotNull(pickedData2);
        int min = pickedData2.getMin();
        powerwatch.matrix.com.pwgen2android.setup.biometrics.PickedData pickedData3 = this.weightPicker.get();
        kotlin.jvm.internal.Intrinsics.checkNotNull(pickedData3);
        powerwatch.matrix.com.pwgen2android.setup.biometrics.Biometrics biometrics = this.currentBiometrics;
        if (biometrics != null) {
            observableField.set(new powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelConfig(weight, str, new powerwatch.matrix.com.pwgen2android.setup.biometrics.StringPickerAdapter(pickedData3, biometrics.getWeight().getSecond()), max, min, 0, 32, null));
        } else {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("currentBiometrics");
            throw null;
        }
    }

    public final void onHeightClicked(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<this>");
        androidx.databinding.ObservableField<powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelConfig> observableField = this.wheelConfig;
        powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelType.Height height = powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelType.Height.INSTANCE;
        java.lang.String str = this.height.get();
        kotlin.jvm.internal.Intrinsics.checkNotNull(str);
        powerwatch.matrix.com.pwgen2android.setup.biometrics.PickedData pickedData = this.heightPicker.get();
        kotlin.jvm.internal.Intrinsics.checkNotNull(pickedData);
        int max = pickedData.getMax();
        powerwatch.matrix.com.pwgen2android.setup.biometrics.PickedData pickedData2 = this.heightPicker.get();
        kotlin.jvm.internal.Intrinsics.checkNotNull(pickedData2);
        int min = pickedData2.getMin();
        powerwatch.matrix.com.pwgen2android.setup.biometrics.PickedData pickedData3 = this.heightPicker.get();
        kotlin.jvm.internal.Intrinsics.checkNotNull(pickedData3);
        powerwatch.matrix.com.pwgen2android.setup.biometrics.Biometrics biometrics = this.currentBiometrics;
        if (biometrics != null) {
            observableField.set(new powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelConfig(height, str, new powerwatch.matrix.com.pwgen2android.setup.biometrics.StringPickerAdapter(pickedData3, biometrics.getHeight().getSecond()), max, min, 0, 32, null));
        } else {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("currentBiometrics");
            throw null;
        }
    }
}
