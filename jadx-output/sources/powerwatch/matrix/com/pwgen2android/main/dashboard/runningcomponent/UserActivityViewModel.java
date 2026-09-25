package powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent;

/* JADX INFO: compiled from: UserActivityViewModel.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000Ê\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002BG\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012¢\u0006\u0002\u0010\u0013J\u001c\u0010j\u001a\b\u0012\u0004\u0012\u00020`0\u001e2\f\u0010_\u001a\b\u0012\u0004\u0012\u00020k0\u001eH\u0002J\u0018\u0010l\u001a\u00020m2\u0006\u0010n\u001a\u00020\u001f2\u0006\u0010o\u001a\u00020pH\u0002J\u0018\u0010q\u001a\u00020\u001b2\u0006\u0010r\u001a\u00020]2\u0006\u0010s\u001a\u00020\u001bH\u0002J\u0018\u0010t\u001a\u00020\u001b2\u0006\u0010T\u001a\u00020u2\u0006\u0010s\u001a\u00020\u001bH\u0002J\u0018\u0010v\u001a\u00020m2\b\u0010w\u001a\u0004\u0018\u00010\u001b2\u0006\u0010o\u001a\u00020pJ\b\u0010x\u001a\u00020mH\u0016J\u0010\u0010y\u001a\u00020m2\u0006\u0010o\u001a\u00020pH\u0016J\u0010\u0010z\u001a\u00020m2\u0006\u0010o\u001a\u00020pH\u0016J\u0006\u0010{\u001a\u00020mJ\b\u0010|\u001a\u00020mH\u0007J\u0010\u0010}\u001a\u00020m2\u0006\u0010n\u001a\u00020\u001fH\u0002J\n\u0010~\u001a\u00020m*\u00020\u007fJ\u000b\u0010\u0080\u0001\u001a\u00020m*\u00020\u007fJ\u000b\u0010\u0081\u0001\u001a\u00020m*\u00020\u007fR\u001f\u0010\u0014\u001a\u0010\u0012\f\u0012\n \u0017*\u0004\u0018\u00010\u00160\u00160\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0019R\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u001f\u0010 \u001a\u0010\u0012\f\u0012\n \u0017*\u0004\u0018\u00010\u00160\u00160\u0015¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0019R\u001f\u0010\"\u001a\u0010\u0012\f\u0012\n \u0017*\u0004\u0018\u00010\u001b0\u001b0\u0015¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0019R\u001a\u0010$\u001a\u00020%X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u000e\u0010*\u001a\u00020+X\u0082\u000e¢\u0006\u0002\n\u0000R\u0017\u0010,\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0015¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u0019R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010.\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0015¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u0019R\u0017\u00100\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0015¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\u0019R\u001f\u00102\u001a\u0010\u0012\f\u0012\n \u0017*\u0004\u0018\u00010\u00160\u00160\u0015¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\u0019R\u001f\u00104\u001a\u0010\u0012\f\u0012\n \u0017*\u0004\u0018\u00010\u00160\u00160\u0015¢\u0006\b\n\u0000\u001a\u0004\b5\u0010\u0019R\u001f\u00106\u001a\u0010\u0012\f\u0012\n \u0017*\u0004\u0018\u00010\u00160\u00160\u0015¢\u0006\b\n\u0000\u001a\u0004\b7\u0010\u0019R\u001a\u00108\u001a\u000209X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u0017\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015¢\u0006\b\n\u0000\u001a\u0004\b?\u0010\u0019R\u0014\u0010@\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010A\u001a\u0010\u0012\f\u0012\n \u0017*\u0004\u0018\u00010\u00160\u00160\u0015¢\u0006\b\n\u0000\u001a\u0004\bB\u0010\u0019R\u0017\u0010C\u001a\b\u0012\u0004\u0012\u00020E0D¢\u0006\b\n\u0000\u001a\u0004\bF\u0010GR\u001a\u0010H\u001a\u00020IX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\u001f\u0010N\u001a\u0010\u0012\f\u0012\n \u0017*\u0004\u0018\u00010\u001b0\u001b0\u0015¢\u0006\b\n\u0000\u001a\u0004\bO\u0010\u0019R\u001f\u0010P\u001a\u0010\u0012\f\u0012\n \u0017*\u0004\u0018\u00010\u001b0\u001b0\u0015¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010\u0019R\u001f\u0010R\u001a\u0010\u0012\f\u0012\n \u0017*\u0004\u0018\u00010\u00160\u00160\u0015¢\u0006\b\n\u0000\u001a\u0004\bS\u0010\u0019R\u0017\u0010T\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0015¢\u0006\b\n\u0000\u001a\u0004\bU\u0010\u0019R\u0017\u0010V\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0015¢\u0006\b\n\u0000\u001a\u0004\bW\u0010\u0019R\u001c\u0010X\u001a\u0010\u0012\f\u0012\n \u0017*\u0004\u0018\u00010\u000e0\u000e0YX\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010Z\u001a\u0010\u0012\f\u0012\n \u0017*\u0004\u0018\u00010\u00160\u00160\u0015¢\u0006\b\n\u0000\u001a\u0004\b[\u0010\u0019R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\\\u001a\u0004\u0018\u00010]X\u0082\u000e¢\u0006\u0004\n\u0002\u0010^R\u001d\u0010_\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020`0\u001e0\u0015¢\u0006\b\n\u0000\u001a\u0004\ba\u0010\u0019R\u0017\u0010b\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0015¢\u0006\b\n\u0000\u001a\u0004\bc\u0010\u0019R\u0017\u0010d\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0015¢\u0006\b\n\u0000\u001a\u0004\be\u0010\u0019R\u001f\u0010f\u001a\u0010\u0012\f\u0012\n \u0017*\u0004\u0018\u00010\u001b0\u001b0\u0015¢\u0006\b\n\u0000\u001a\u0004\bg\u0010\u0019R\u001f\u0010h\u001a\u0010\u0012\f\u0012\n \u0017*\u0004\u0018\u00010\u001b0\u001b0\u0015¢\u0006\b\n\u0000\u001a\u0004\bi\u0010\u0019R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0082\u0001"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/UserActivityViewModel;", "Lpowerwatch/matrix/com/pwgen2android/main/MainDeepBaseViewModel;", "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;", "userActivitySessionDataProvider", "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/UserActivitySessionDataProvider;", "runningAnimator", "Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimator;", "selectedDateProvider", "Lpowerwatch/matrix/com/pwgen2android/shared/SelectedDateProvider;", "userPrefsUtils", "Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;", "dialogManager", "Lpowerwatch/matrix/com/pwgen2android/shared/ui/dialogManager/DialogManager;", "parentFragmentManager", "Landroidx/fragment/app/FragmentManager;", "activity", "Landroid/app/Activity;", "rxBus", "Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;", "(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/UserActivitySessionDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimator;Lpowerwatch/matrix/com/pwgen2android/shared/SelectedDateProvider;Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;Lpowerwatch/matrix/com/pwgen2android/shared/ui/dialogManager/DialogManager;Landroidx/fragment/app/FragmentManager;Landroid/app/Activity;Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;)V", "absoluteElevationEnabled", "Landroidx/databinding/ObservableField;", "", "kotlin.jvm.PlatformType", "getAbsoluteElevationEnabled", "()Landroidx/databinding/ObservableField;", "activeCals", "", "getActiveCals", "activitySessions", "", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;", "ascendDisplayed", "getAscendDisplayed", "avgHeartRate", "getAvgHeartRate", "controlViewViewModel", "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/control/ControlViewViewModel;", "getControlViewViewModel", "()Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/control/ControlViewViewModel;", "setControlViewViewModel", "(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/control/ControlViewViewModel;)V", "dataDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "date", "getDate", "distance", "getDistance", "duration", "getDuration", "hasHeartRates", "getHasHeartRates", "hasLocations", "getHasLocations", "hasSplits", "getHasSplits", "heartRateChartViewModel", "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/heartrate/ActivityHeartRateViewModel;", "getHeartRateChartViewModel", "()Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/heartrate/ActivityHeartRateViewModel;", "setHeartRateChartViewModel", "(Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/heartrate/ActivityHeartRateViewModel;)V", "hiitActivityDisplayed", "getHiitActivityDisplayed", "languageField", "leftArrowVisible", "getLeftArrowVisible", "mapData", "Lio/reactivex/subjects/BehaviorSubject;", "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/MapType;", "getMapData", "()Lio/reactivex/subjects/BehaviorSubject;", "mapsViewModel", "Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/BaseMapViewModel;", "getMapsViewModel", "()Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/BaseMapViewModel;", "setMapsViewModel", "(Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/BaseMapViewModel;)V", "maxHRValue", "getMaxHRValue", "nameField", "getNameField", "noSessions", "getNoSessions", "pace", "getPace", "paceTitle", "getPaceTitle", "parentFragmentManagerWeakReference", "Ljava/lang/ref/WeakReference;", "rightArrowVisible", "getRightArrowVisible", "selectedSessionIndex", "", "Ljava/lang/Integer;", "splits", "Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/SplitItemView;", "getSplits", "startTime", "getStartTime", "subtitleField", "getSubtitleField", "totalAscendedValue", "getTotalAscendedValue", "totalDescendedValue", "getTotalDescendedValue", "convertToSplitView", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RunningSplit;", "fillUI", "", io.fabric.sdk.android.services.settings.SettingsJsonConstants.SESSION_KEY, "context", "Landroid/content/Context;", "formatAvgSpeed", "speed", "unit", "formatPace", "", "loadActivitySession", powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.UserActivityDetailsFragment.ACTIVITY_ID, "onBackClicked", "onDataReload", "onDestroyView", "onRightButtonClicked", "onShareButtonClicked", "reformatHRGraph", "onNextClicked", "Landroid/view/View;", "onPreviousClicked", "onSessionClicked", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class UserActivityViewModel extends powerwatch.matrix.com.pwgen2android.main.MainDeepBaseViewModel implements powerwatch.matrix.com.pwgen2android.shared.logger.Loggable {
    private final androidx.databinding.ObservableField<java.lang.Boolean> absoluteElevationEnabled;
    private final androidx.databinding.ObservableField<java.lang.String> activeCals;
    private java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession> activitySessions;
    private final androidx.databinding.ObservableField<java.lang.Boolean> ascendDisplayed;
    private final androidx.databinding.ObservableField<java.lang.String> avgHeartRate;
    public powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.control.ControlViewViewModel controlViewViewModel;
    private io.reactivex.disposables.CompositeDisposable dataDisposable;
    private final androidx.databinding.ObservableField<java.lang.String> date;
    private final powerwatch.matrix.com.pwgen2android.shared.ui.dialogManager.DialogManager dialogManager;
    private final androidx.databinding.ObservableField<java.lang.String> distance;
    private final androidx.databinding.ObservableField<java.lang.String> duration;
    private final androidx.databinding.ObservableField<java.lang.Boolean> hasHeartRates;
    private final androidx.databinding.ObservableField<java.lang.Boolean> hasLocations;
    private final androidx.databinding.ObservableField<java.lang.Boolean> hasSplits;
    public powerwatch.matrix.com.pwgen2android.shared.ui.charts.heartrate.ActivityHeartRateViewModel heartRateChartViewModel;
    private final androidx.databinding.ObservableField<java.lang.Boolean> hiitActivityDisplayed;
    private final androidx.databinding.ObservableField<java.lang.String> languageField;
    private final androidx.databinding.ObservableField<java.lang.Boolean> leftArrowVisible;
    private final io.reactivex.subjects.BehaviorSubject<powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.MapType> mapData;
    public powerwatch.matrix.com.pwgen2android.shared.ui.maps.BaseMapViewModel mapsViewModel;
    private final androidx.databinding.ObservableField<java.lang.String> maxHRValue;
    private final androidx.databinding.ObservableField<java.lang.String> nameField;
    private final androidx.databinding.ObservableField<java.lang.Boolean> noSessions;
    private final androidx.databinding.ObservableField<java.lang.String> pace;
    private final androidx.databinding.ObservableField<java.lang.String> paceTitle;
    private final java.lang.ref.WeakReference<androidx.fragment.app.FragmentManager> parentFragmentManagerWeakReference;
    private final androidx.databinding.ObservableField<java.lang.Boolean> rightArrowVisible;
    private final powerwatch.matrix.com.pwgen2android.shared.ui.RunningAnimator runningAnimator;
    private final powerwatch.matrix.com.pwgen2android.shared.SelectedDateProvider selectedDateProvider;
    private java.lang.Integer selectedSessionIndex;
    private final androidx.databinding.ObservableField<java.util.List<powerwatch.matrix.com.pwgen2android.shared.ui.views.SplitItemView>> splits;
    private final androidx.databinding.ObservableField<java.lang.String> startTime;
    private final androidx.databinding.ObservableField<java.lang.String> subtitleField;
    private final androidx.databinding.ObservableField<java.lang.String> totalAscendedValue;
    private final androidx.databinding.ObservableField<java.lang.String> totalDescendedValue;
    private final powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.UserActivitySessionDataProvider userActivitySessionDataProvider;
    private final powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtils userPrefsUtils;

    @Override // org.koin.core.KoinComponent
    public org.koin.core.Koin getKoin() {
        return powerwatch.matrix.com.pwgen2android.shared.logger.Loggable.DefaultImpls.getKoin(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserActivityViewModel(powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.UserActivitySessionDataProvider userActivitySessionDataProvider, powerwatch.matrix.com.pwgen2android.shared.ui.RunningAnimator runningAnimator, powerwatch.matrix.com.pwgen2android.shared.SelectedDateProvider selectedDateProvider, powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtils userPrefsUtils, powerwatch.matrix.com.pwgen2android.shared.ui.dialogManager.DialogManager dialogManager, androidx.fragment.app.FragmentManager parentFragmentManager, android.app.Activity activity, powerwatch.matrix.com.pwgen2android.shared.RxBus rxBus) {
        java.lang.String string;
        super(activity, rxBus);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userActivitySessionDataProvider, "userActivitySessionDataProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(runningAnimator, "runningAnimator");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selectedDateProvider, "selectedDateProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userPrefsUtils, "userPrefsUtils");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dialogManager, "dialogManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parentFragmentManager, "parentFragmentManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rxBus, "rxBus");
        this.userActivitySessionDataProvider = userActivitySessionDataProvider;
        this.runningAnimator = runningAnimator;
        this.selectedDateProvider = selectedDateProvider;
        this.userPrefsUtils = userPrefsUtils;
        this.dialogManager = dialogManager;
        this.dataDisposable = new io.reactivex.disposables.CompositeDisposable();
        this.parentFragmentManagerWeakReference = new java.lang.ref.WeakReference<>(parentFragmentManager);
        this.activitySessions = kotlin.collections.CollectionsKt.emptyList();
        this.noSessions = new androidx.databinding.ObservableField<>(true);
        androidx.databinding.ObservableField<java.lang.Boolean> observableField = new androidx.databinding.ObservableField<>(false);
        this.hasLocations = observableField;
        androidx.databinding.ObservableField<java.lang.Boolean> observableField2 = new androidx.databinding.ObservableField<>(false);
        this.hasHeartRates = observableField2;
        java.lang.Boolean bool = observableField.get();
        kotlin.jvm.internal.Intrinsics.checkNotNull(bool);
        boolean zBooleanValue = bool.booleanValue();
        java.lang.Boolean bool2 = observableField2.get();
        kotlin.jvm.internal.Intrinsics.checkNotNull(bool2);
        io.reactivex.subjects.BehaviorSubject<powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.MapType> behaviorSubjectCreateDefault = io.reactivex.subjects.BehaviorSubject.createDefault(new powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.MapType.Google(zBooleanValue, bool2.booleanValue()));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(behaviorSubjectCreateDefault, "createDefault(MapType.Google(hasLocations.get()!!, hasHeartRates.get()!!))");
        this.mapData = behaviorSubjectCreateDefault;
        this.hasSplits = new androidx.databinding.ObservableField<>(false);
        this.leftArrowVisible = new androidx.databinding.ObservableField<>(false);
        this.rightArrowVisible = new androidx.databinding.ObservableField<>(false);
        this.subtitleField = new androidx.databinding.ObservableField<>("");
        this.activeCals = new androidx.databinding.ObservableField<>("0");
        this.nameField = new androidx.databinding.ObservableField<>("");
        this.distance = new androidx.databinding.ObservableField<>("0");
        this.pace = new androidx.databinding.ObservableField<>("0");
        androidx.databinding.ObservableField<java.lang.String> observableField3 = new androidx.databinding.ObservableField<>("0");
        this.paceTitle = observableField3;
        this.duration = new androidx.databinding.ObservableField<>("-");
        this.date = new androidx.databinding.ObservableField<>("");
        this.startTime = new androidx.databinding.ObservableField<>("");
        this.splits = new androidx.databinding.ObservableField<>(kotlin.collections.CollectionsKt.emptyList());
        this.hiitActivityDisplayed = new androidx.databinding.ObservableField<>(false);
        this.maxHRValue = new androidx.databinding.ObservableField<>("");
        this.avgHeartRate = new androidx.databinding.ObservableField<>("");
        this.totalAscendedValue = new androidx.databinding.ObservableField<>("0");
        this.totalDescendedValue = new androidx.databinding.ObservableField<>("0");
        this.ascendDisplayed = new androidx.databinding.ObservableField<>(false);
        this.absoluteElevationEnabled = new androidx.databinding.ObservableField<>(true);
        this.languageField = new androidx.databinding.ObservableField<>("en");
        getCompositeDisposable().add(rxBus.getEvents().filter(new io.reactivex.functions.Predicate() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.-$$Lambda$UserActivityViewModel$uzNRQPPjD9V9OqKgrar_zcEv3yw
            @Override // io.reactivex.functions.Predicate
            public final boolean test(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.UserActivityViewModel.m1856_init_$lambda0(obj);
            }
        }).subscribe(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.-$$Lambda$UserActivityViewModel$TVatJgg5eO3nxnIJnK_DTMMaf2k
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.UserActivityViewModel.m1857_init_$lambda1(this.f$0, obj);
            }
        }, new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.-$$Lambda$UserActivityViewModel$8jDQjCNj1-l_IDs2quqgrBdXBoI
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                ((java.lang.Throwable) obj).printStackTrace();
            }
        }));
        android.content.Context activityContext = getActivityContext();
        java.lang.String str = "average pace";
        if (activityContext != null && (string = activityContext.getString(powerwatch.matrix.com.pwgen2android.R.string.average_pace)) != null) {
            str = string;
        }
        java.lang.String upperCase = str.toUpperCase();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase, "(this as java.lang.String).toUpperCase()");
        observableField3.set(upperCase);
        getCompositeDisposable().add(userPrefsUtils.getLanguage().subscribe(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.-$$Lambda$UserActivityViewModel$orX9CWPEte5KsX2RB6cFlwNMeLs
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.UserActivityViewModel.m1859_init_$lambda3(this.f$0, (powerwatch.matrix.com.pwgen2android.utils.LanguageInfo) obj);
            }
        }));
        observableField.addOnPropertyChangedCallback(new androidx.databinding.Observable.OnPropertyChangedCallback() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.UserActivityViewModel.5
            @Override // androidx.databinding.Observable.OnPropertyChangedCallback
            public void onPropertyChanged(androidx.databinding.Observable sender, int propertyId) {
                powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.MapType value = powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.UserActivityViewModel.this.getMapData().getValue();
                kotlin.jvm.internal.Intrinsics.checkNotNull(value);
                java.lang.Boolean bool3 = powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.UserActivityViewModel.this.getHasLocations().get();
                kotlin.jvm.internal.Intrinsics.checkNotNull(bool3);
                value.setHasLocations(bool3.booleanValue());
                powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.MapType value2 = powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.UserActivityViewModel.this.getMapData().getValue();
                kotlin.jvm.internal.Intrinsics.checkNotNull(value2);
                java.lang.Boolean bool4 = powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.UserActivityViewModel.this.getHasHeartRates().get();
                kotlin.jvm.internal.Intrinsics.checkNotNull(bool4);
                value2.setHasHeartRate(bool4.booleanValue());
                io.reactivex.subjects.BehaviorSubject<powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.MapType> mapData = powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.UserActivityViewModel.this.getMapData();
                powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.MapType value3 = powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.UserActivityViewModel.this.getMapData().getValue();
                kotlin.jvm.internal.Intrinsics.checkNotNull(value3);
                mapData.onNext(value3);
            }
        });
        observableField2.addOnPropertyChangedCallback(new androidx.databinding.Observable.OnPropertyChangedCallback() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.UserActivityViewModel.6
            @Override // androidx.databinding.Observable.OnPropertyChangedCallback
            public void onPropertyChanged(androidx.databinding.Observable sender, int propertyId) {
                powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.MapType value = powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.UserActivityViewModel.this.getMapData().getValue();
                kotlin.jvm.internal.Intrinsics.checkNotNull(value);
                java.lang.Boolean bool3 = powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.UserActivityViewModel.this.getHasLocations().get();
                kotlin.jvm.internal.Intrinsics.checkNotNull(bool3);
                value.setHasLocations(bool3.booleanValue());
                powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.MapType value2 = powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.UserActivityViewModel.this.getMapData().getValue();
                kotlin.jvm.internal.Intrinsics.checkNotNull(value2);
                java.lang.Boolean bool4 = powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.UserActivityViewModel.this.getHasHeartRates().get();
                kotlin.jvm.internal.Intrinsics.checkNotNull(bool4);
                value2.setHasHeartRate(bool4.booleanValue());
                io.reactivex.subjects.BehaviorSubject<powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.MapType> mapData = powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.UserActivityViewModel.this.getMapData();
                powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.MapType value3 = powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.UserActivityViewModel.this.getMapData().getValue();
                kotlin.jvm.internal.Intrinsics.checkNotNull(value3);
                mapData.onNext(value3);
            }
        });
    }

    public final powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.control.ControlViewViewModel getControlViewViewModel() {
        powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.control.ControlViewViewModel controlViewViewModel = this.controlViewViewModel;
        if (controlViewViewModel != null) {
            return controlViewViewModel;
        }
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("controlViewViewModel");
        throw null;
    }

    public final void setControlViewViewModel(powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.control.ControlViewViewModel controlViewViewModel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(controlViewViewModel, "<set-?>");
        this.controlViewViewModel = controlViewViewModel;
    }

    public final powerwatch.matrix.com.pwgen2android.shared.ui.charts.heartrate.ActivityHeartRateViewModel getHeartRateChartViewModel() {
        powerwatch.matrix.com.pwgen2android.shared.ui.charts.heartrate.ActivityHeartRateViewModel activityHeartRateViewModel = this.heartRateChartViewModel;
        if (activityHeartRateViewModel != null) {
            return activityHeartRateViewModel;
        }
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("heartRateChartViewModel");
        throw null;
    }

    public final void setHeartRateChartViewModel(powerwatch.matrix.com.pwgen2android.shared.ui.charts.heartrate.ActivityHeartRateViewModel activityHeartRateViewModel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityHeartRateViewModel, "<set-?>");
        this.heartRateChartViewModel = activityHeartRateViewModel;
    }

    public final powerwatch.matrix.com.pwgen2android.shared.ui.maps.BaseMapViewModel getMapsViewModel() {
        powerwatch.matrix.com.pwgen2android.shared.ui.maps.BaseMapViewModel baseMapViewModel = this.mapsViewModel;
        if (baseMapViewModel != null) {
            return baseMapViewModel;
        }
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("mapsViewModel");
        throw null;
    }

    public final void setMapsViewModel(powerwatch.matrix.com.pwgen2android.shared.ui.maps.BaseMapViewModel baseMapViewModel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseMapViewModel, "<set-?>");
        this.mapsViewModel = baseMapViewModel;
    }

    public final androidx.databinding.ObservableField<java.lang.Boolean> getNoSessions() {
        return this.noSessions;
    }

    public final androidx.databinding.ObservableField<java.lang.Boolean> getHasLocations() {
        return this.hasLocations;
    }

    public final androidx.databinding.ObservableField<java.lang.Boolean> getHasHeartRates() {
        return this.hasHeartRates;
    }

    public final io.reactivex.subjects.BehaviorSubject<powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.MapType> getMapData() {
        return this.mapData;
    }

    public final androidx.databinding.ObservableField<java.lang.Boolean> getHasSplits() {
        return this.hasSplits;
    }

    public final androidx.databinding.ObservableField<java.lang.Boolean> getLeftArrowVisible() {
        return this.leftArrowVisible;
    }

    public final androidx.databinding.ObservableField<java.lang.Boolean> getRightArrowVisible() {
        return this.rightArrowVisible;
    }

    public final androidx.databinding.ObservableField<java.lang.String> getSubtitleField() {
        return this.subtitleField;
    }

    public final androidx.databinding.ObservableField<java.lang.String> getActiveCals() {
        return this.activeCals;
    }

    public final androidx.databinding.ObservableField<java.lang.String> getNameField() {
        return this.nameField;
    }

    public final androidx.databinding.ObservableField<java.lang.String> getDistance() {
        return this.distance;
    }

    public final androidx.databinding.ObservableField<java.lang.String> getPace() {
        return this.pace;
    }

    public final androidx.databinding.ObservableField<java.lang.String> getPaceTitle() {
        return this.paceTitle;
    }

    public final androidx.databinding.ObservableField<java.lang.String> getDuration() {
        return this.duration;
    }

    public final androidx.databinding.ObservableField<java.lang.String> getDate() {
        return this.date;
    }

    public final androidx.databinding.ObservableField<java.lang.String> getStartTime() {
        return this.startTime;
    }

    public final androidx.databinding.ObservableField<java.util.List<powerwatch.matrix.com.pwgen2android.shared.ui.views.SplitItemView>> getSplits() {
        return this.splits;
    }

    public final androidx.databinding.ObservableField<java.lang.Boolean> getHiitActivityDisplayed() {
        return this.hiitActivityDisplayed;
    }

    public final androidx.databinding.ObservableField<java.lang.String> getMaxHRValue() {
        return this.maxHRValue;
    }

    public final androidx.databinding.ObservableField<java.lang.String> getAvgHeartRate() {
        return this.avgHeartRate;
    }

    public final androidx.databinding.ObservableField<java.lang.String> getTotalAscendedValue() {
        return this.totalAscendedValue;
    }

    public final androidx.databinding.ObservableField<java.lang.String> getTotalDescendedValue() {
        return this.totalDescendedValue;
    }

    public final androidx.databinding.ObservableField<java.lang.Boolean> getAscendDisplayed() {
        return this.ascendDisplayed;
    }

    public final androidx.databinding.ObservableField<java.lang.Boolean> getAbsoluteElevationEnabled() {
        return this.absoluteElevationEnabled;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: _init_$lambda-0, reason: not valid java name */
    public static final boolean m1856_init_$lambda0(java.lang.Object it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return kotlin.jvm.internal.Intrinsics.areEqual(it, powerwatch.matrix.com.pwgen2android.shared.ActivityChartClicked.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: _init_$lambda-1, reason: not valid java name */
    public static final void m1857_init_$lambda1(powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.UserActivityViewModel this$0, java.lang.Object obj) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        androidx.databinding.ObservableField<java.lang.Boolean> absoluteElevationEnabled = this$0.getAbsoluteElevationEnabled();
        java.lang.Boolean bool = this$0.getAbsoluteElevationEnabled().get();
        if (bool == null) {
            bool = false;
        }
        absoluteElevationEnabled.set(java.lang.Boolean.valueOf(!bool.booleanValue()));
        if (this$0.getActivityContext() != null) {
            this$0.onDataReload(this$0.getActivityContext());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: _init_$lambda-3, reason: not valid java name */
    public static final void m1859_init_$lambda3(powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.UserActivityViewModel this$0, powerwatch.matrix.com.pwgen2android.utils.LanguageInfo languageInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.languageField.set(languageInfo.getLanguageKey());
        java.lang.Boolean bool = this$0.getHasLocations().get();
        kotlin.jvm.internal.Intrinsics.checkNotNull(bool);
        boolean zBooleanValue = bool.booleanValue();
        java.lang.Boolean bool2 = this$0.getHasHeartRates().get();
        kotlin.jvm.internal.Intrinsics.checkNotNull(bool2);
        boolean zBooleanValue2 = bool2.booleanValue();
        this$0.getMapData().onNext((kotlin.jvm.internal.Intrinsics.areEqual(languageInfo.getLocale(), powerwatch.matrix.com.pwgen2android.utils.LanguageControllerImpl.Companion.LanguageLocale.TraditionalChinese.INSTANCE.getLocale()) || kotlin.jvm.internal.Intrinsics.areEqual(languageInfo.getLocale(), powerwatch.matrix.com.pwgen2android.utils.LanguageControllerImpl.Companion.LanguageLocale.SimplifiedChinese.INSTANCE.getLocale())) ? new powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.MapType.Baidu(zBooleanValue, zBooleanValue2) : new powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.MapType.Google(zBooleanValue, zBooleanValue2));
    }

    /* JADX WARN: Code duplicated, block: B:87:0x0315  */
    private final void fillUI(powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession session, android.content.Context context) {
        java.util.List listEmptyList;
        java.lang.String string;
        int iIntValue;
        java.lang.String string2;
        getControlViewViewModel().reset();
        int iRoundToInt = 0;
        this.hiitActivityDisplayed.set(java.lang.Boolean.valueOf(session.getActivityType() == powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivityType.ACTIVITY_HIIT));
        java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.GPSPosition> gpsPositions = session.getGpsPositions();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(gpsPositions, 10));
        java.util.Iterator<T> it = gpsPositions.iterator();
        while (it.hasNext()) {
            arrayList.add(powerwatch.matrix.com.pwgen2android.shared.data.models.ActivityPeriodsModelsKt.toLocation((powerwatch.matrix.com.pwgen2android.shared.data.models.GPSPosition) it.next()));
        }
        java.util.ArrayList arrayList2 = arrayList;
        java.util.ArrayList arrayList3 = arrayList2;
        java.util.ArrayList arrayList4 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList3, 10));
        java.util.Iterator it2 = arrayList3.iterator();
        int i = 0;
        while (true) {
            float fDistanceTo = 0.0f;
            if (!it2.hasNext()) {
                break;
            }
            java.lang.Object next = it2.next();
            int i2 = i + 1;
            if (i < 0) {
                kotlin.collections.CollectionsKt.throwIndexOverflow();
            }
            android.location.Location location = (android.location.Location) next;
            if (i != 0) {
                fDistanceTo = location.distanceTo((android.location.Location) arrayList2.get(i - 1));
            }
            arrayList4.add(java.lang.Float.valueOf(fDistanceTo));
            i = i2;
        }
        java.util.ArrayList arrayList5 = arrayList4;
        java.util.Iterator<T> it3 = session.getHeartRates().iterator();
        if (it3.hasNext()) {
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            java.lang.Object next2 = it3.next();
            while (it3.hasNext()) {
                java.lang.Object next3 = it3.next();
                arrayList6.add(java.lang.Float.valueOf(java.lang.Math.abs(((powerwatch.matrix.com.pwgen2android.shared.data.models.HeartRate) next3).getStartTime() - ((powerwatch.matrix.com.pwgen2android.shared.data.models.HeartRate) next2).getStartTime())));
                next2 = next3;
            }
            listEmptyList = arrayList6;
        } else {
            listEmptyList = kotlin.collections.CollectionsKt.emptyList();
        }
        kotlin.collections.CollectionsKt.toMutableList((java.util.Collection) listEmptyList).add(0, java.lang.Float.valueOf(0.0f));
        float fSumOfFloat = kotlin.collections.CollectionsKt.sumOfFloat(arrayList5);
        boolean z = (session.getGpsPositions().isEmpty() ^ true) && fSumOfFloat > 0.0f;
        if (!session.getSplits().isEmpty()) {
            int i3 = (fSumOfFloat > 0.0f ? 1 : (fSumOfFloat == 0.0f ? 0 : -1));
        }
        boolean z2 = !session.getHeartRates().isEmpty();
        this.hasLocations.set(java.lang.Boolean.valueOf(z));
        this.hasSplits.set(false);
        this.hasHeartRates.set(java.lang.Boolean.valueOf(z2));
        if (z || z2) {
            this.splits.set(convertToSplitView(session.getSplits()));
            reformatHRGraph(session);
            getMapsViewModel().loadActivitySession(session);
        }
        this.nameField.set(powerwatch.matrix.com.pwgen2android.shared.extensions.ActivityPeriodsExtensionsKt.mapActivityTypeToName(session.getActivityType(), context));
        kotlin.Pair<java.lang.Float, java.lang.String> value = this.userPrefsUtils.getValue(java.lang.Float.valueOf((float) powerwatch.matrix.com.pwgen2android.shared.extensions.NumberExtensionsKt.divide((java.lang.Number) java.lang.Float.valueOf(session.getDistance()), 1000)), powerwatch.matrix.com.pwgen2android.utils.MetricsConvertType.DISTANCE.INSTANCE);
        this.distance.set(kotlin.jvm.internal.Intrinsics.stringPlus(powerwatch.matrix.com.pwgen2android.shared.extensions.NumberExtensionsKt.twoDecimalsFormat(value.getFirst().floatValue()), value.getSecond()));
        kotlin.Pair<java.lang.Float, java.lang.String> value2 = this.userPrefsUtils.getValue(java.lang.Float.valueOf((float) powerwatch.matrix.com.pwgen2android.shared.extensions.NumberExtensionsKt.divide((java.lang.Number) java.lang.Integer.valueOf(session.getActiveCalories()), 1000)), powerwatch.matrix.com.pwgen2android.utils.MetricsConvertType.CALORIES.INSTANCE);
        this.activeCals.set(kotlin.math.MathKt.roundToInt(value2.getFirst().floatValue()) + value2.getSecond());
        this.startTime.set(powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.hoursMinutesTimeFormat(session.getStartTime(), this.userPrefsUtils.isTwelveHourFormatUsed()));
        androidx.databinding.ObservableField<java.lang.String> observableField = this.date;
        java.util.Calendar zonedCalendar$default = powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.toZonedCalendar$default(session.getStartTime(), null, 1, null);
        java.lang.String str = this.languageField.get();
        kotlin.jvm.internal.Intrinsics.checkNotNull(str);
        observableField.set(powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.monthDayYearFormatText(zonedCalendar$default, str));
        java.lang.Boolean boolIsMetricsUsedOrNull = this.userPrefsUtils.isMetricsUsedOrNull();
        boolean zBooleanValue = boolIsMetricsUsedOrNull != null ? boolIsMetricsUsedOrNull.booleanValue() : true;
        int iRoundToInt2 = kotlin.math.MathKt.roundToInt((session.getEndTime() - session.getStartTime()) / ((long) 1000));
        if (session.getActivityType() == powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivityType.ACTIVITY_BIKING) {
            this.pace.set(formatAvgSpeed((int) (value.getFirst().floatValue() > 0.0f ? value.getFirst().floatValue() / (iRoundToInt2 / 3600.0f) : 0.0f), zBooleanValue ? powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtilsKt.metricsSpeedUnit : powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtilsKt.imperialSpeedUnit));
            androidx.databinding.ObservableField<java.lang.String> observableField2 = this.paceTitle;
            android.content.Context activityContext = getActivityContext();
            java.lang.String str2 = "average speed";
            if (activityContext != null && (string2 = activityContext.getString(powerwatch.matrix.com.pwgen2android.R.string.average_speed)) != null) {
                str2 = string2;
            }
            java.lang.String upperCase = str2.toUpperCase();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase, "(this as java.lang.String).toUpperCase()");
            observableField2.set(upperCase);
        } else {
            this.pace.set(formatPace(value.getFirst().floatValue() > 0.0f ? iRoundToInt2 / value.getFirst().floatValue() : 0.0f, zBooleanValue ? powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtilsKt.metricDistanceUnit : powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtilsKt.imperialDistanceUnit));
            androidx.databinding.ObservableField<java.lang.String> observableField3 = this.paceTitle;
            android.content.Context activityContext2 = getActivityContext();
            java.lang.String str3 = "average pace";
            if (activityContext2 != null && (string = activityContext2.getString(powerwatch.matrix.com.pwgen2android.R.string.average_pace)) != null) {
                str3 = string;
            }
            java.lang.String upperCase2 = str3.toUpperCase();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase2, "(this as java.lang.String).toUpperCase()");
            observableField3.set(upperCase2);
        }
        if (z2) {
            java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.HeartRate> heartRates = session.getHeartRates();
            java.util.ArrayList arrayList7 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(heartRates, 10));
            java.util.Iterator<T> it4 = heartRates.iterator();
            while (it4.hasNext()) {
                arrayList7.add(java.lang.Integer.valueOf(((powerwatch.matrix.com.pwgen2android.shared.data.models.HeartRate) it4.next()).getValue()));
            }
            java.lang.Integer num = (java.lang.Integer) kotlin.collections.CollectionsKt.maxOrNull((java.lang.Iterable) arrayList7);
            if (num == null) {
                iIntValue = 0;
            } else {
                iIntValue = num.intValue();
            }
        } else {
            iIntValue = 0;
        }
        if (z2) {
            java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.HeartRate> heartRates2 = session.getHeartRates();
            java.util.ArrayList arrayList8 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(heartRates2, 10));
            java.util.Iterator<T> it5 = heartRates2.iterator();
            while (it5.hasNext()) {
                arrayList8.add(java.lang.Integer.valueOf(((powerwatch.matrix.com.pwgen2android.shared.data.models.HeartRate) it5.next()).getValue()));
            }
            iRoundToInt = kotlin.math.MathKt.roundToInt(kotlin.collections.CollectionsKt.averageOfInt(arrayList8));
        }
        this.maxHRValue.set(java.lang.String.valueOf(iIntValue));
        this.avgHeartRate.set(java.lang.String.valueOf(iRoundToInt));
        this.duration.set(powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.hourMinSecTimeFormat(session.getEndTime() - session.getStartTime()));
        this.subtitleField.set(session.getLocationName());
        this.noSessions.set(false);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0054  */
    /* JADX WARN: Code duplicated, block: B:45:0x0100  */
    /* JADX WARN: Code duplicated, block: B:47:0x0119  */
    /* JADX WARN: Code duplicated, block: B:48:0x011c  */
    /* JADX WARN: Code duplicated, block: B:53:0x016c  */
    /* JADX WARN: Code duplicated, block: B:55:0x0172  */
    /* JADX WARN: Code duplicated, block: B:56:0x0175  */
    private final void reformatHRGraph(powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession session) {
        boolean z;
        double altitude;
        double d;
        double d2;
        java.util.ArrayList arrayList;
        java.lang.Boolean boolIsMetricsUsedOrNull;
        java.lang.String str;
        double d3;
        int i;
        if (!session.getGpsPositions().isEmpty()) {
            java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.GPSPosition> gpsPositions = session.getGpsPositions();
            if ((gpsPositions instanceof java.util.Collection) && gpsPositions.isEmpty()) {
                i = 0;
            } else {
                java.util.Iterator<T> it = gpsPositions.iterator();
                i = 0;
                while (it.hasNext()) {
                    if ((!(((powerwatch.matrix.com.pwgen2android.shared.data.models.GPSPosition) it.next()).getLatitude() == 0.0d)) && (i = i + 1) < 0) {
                        kotlin.collections.CollectionsKt.throwCountOverflow();
                    }
                }
            }
            if (i > 2) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        if (z) {
            altitude = session.getGpsPositions().get(0).getAltitude();
            java.util.Iterator<T> it2 = session.getGpsPositions().iterator();
            if (it2.hasNext()) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.Object next = it2.next();
                d2 = 0.0d;
                d = 0.0d;
                while (it2.hasNext()) {
                    java.lang.Object next2 = it2.next();
                    double altitude2 = ((powerwatch.matrix.com.pwgen2android.shared.data.models.GPSPosition) next2).getAltitude() - ((powerwatch.matrix.com.pwgen2android.shared.data.models.GPSPosition) next).getAltitude();
                    if (altitude2 > 0.0d) {
                        d2 += altitude2;
                    } else {
                        d += altitude2;
                    }
                    arrayList2.add(kotlin.Unit.INSTANCE);
                    next = next2;
                }
            } else {
                kotlin.collections.CollectionsKt.emptyList();
            }
            java.lang.System.out.println((java.lang.Object) ("asc_desc - ascend: " + d2 + ", descend: " + d));
            java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.GPSPosition> gpsPositions2 = session.getGpsPositions();
            arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(gpsPositions2, 10));
            for (powerwatch.matrix.com.pwgen2android.shared.data.models.GPSPosition gPSPosition : gpsPositions2) {
                if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) getAbsoluteElevationEnabled().get(), (java.lang.Object) true)) {
                    d3 = 0.0d;
                } else {
                    d3 = altitude;
                }
                arrayList.add(gPSPosition.copy((27 & 1) != 0 ? gPSPosition.longitude : 0.0d, (27 & 2) != 0 ? gPSPosition.latitude : 0.0d, (27 & 4) != 0 ? gPSPosition.altitude : this.userPrefsUtils.getValue(java.lang.Double.valueOf(gPSPosition.getAltitude() - d3), powerwatch.matrix.com.pwgen2android.utils.MetricsConvertType.DISTANCE.INSTANCE).getFirst().floatValue(), (27 & 8) != 0 ? gPSPosition.elevation : 0.0d, (27 & 16) != 0 ? gPSPosition.timestamp : 0L));
            }
            java.util.ArrayList arrayList3 = arrayList;
            this.ascendDisplayed.set(java.lang.Boolean.valueOf(z));
            boolIsMetricsUsedOrNull = this.userPrefsUtils.isMetricsUsedOrNull();
            if (boolIsMetricsUsedOrNull != null ? boolIsMetricsUsedOrNull.booleanValue() : false) {
                str = powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtilsKt.metricsMetersUnit;
            } else {
                str = powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtilsKt.imperialFeetUnit;
            }
            kotlin.Pair<java.lang.Float, java.lang.String> value = this.userPrefsUtils.getValue(java.lang.Double.valueOf(d2), powerwatch.matrix.com.pwgen2android.utils.MetricsConvertType.DISTANCE.INSTANCE);
            this.totalAscendedValue.set(kotlin.math.MathKt.roundToInt(value.getFirst().floatValue()) + str);
            kotlin.Pair<java.lang.Float, java.lang.String> value2 = this.userPrefsUtils.getValue(java.lang.Double.valueOf(d), powerwatch.matrix.com.pwgen2android.utils.MetricsConvertType.DISTANCE.INSTANCE);
            this.totalDescendedValue.set(kotlin.math.MathKt.roundToInt(value2.getFirst().floatValue()) + str);
            powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession userActivitySessionCopy = session.copy((114673 & 1) != 0 ? session.id : null, (114673 & 2) != 0 ? session.name : null, (114673 & 4) != 0 ? session.activityType : null, (114673 & 8) != 0 ? session.locationName : null, (114673 & 16) != 0 ? session.distance : 0.0f, (114673 & 32) != 0 ? session.steps : 0, (114673 & 64) != 0 ? session.startTime : 0L, (114673 & 128) != 0 ? session.endTime : 0L, (114673 & 256) != 0 ? session.pace : 0.0f, (114673 & 512) != 0 ? session.activeCalories : 0, (114673 & 1024) != 0 ? session.bmrCalories : 0, (114673 & 2048) != 0 ? session.splits : null, (114673 & 4096) != 0 ? session.gpsPositions : arrayList3, (114673 & 8192) != 0 ? session.heartRates : null, (114673 & 16384) != 0 ? session.notes : null, (114673 & 32768) != 0 ? session.getShouldSend() : false, (114673 & 65536) != 0 ? session.getEmail() : null);
            getHeartRateChartViewModel().loadActivityData(userActivitySessionCopy);
            this.runningAnimator.init(userActivitySessionCopy);
        }
        powerwatch.matrix.com.pwgen2android.shared.data.models.GPSPosition gPSPosition2 = (powerwatch.matrix.com.pwgen2android.shared.data.models.GPSPosition) kotlin.collections.CollectionsKt.getOrNull(session.getGpsPositions(), 0);
        altitude = gPSPosition2 == null ? 0.0d : gPSPosition2.getAltitude();
        d2 = 0.0d;
        d = 0.0d;
        java.lang.System.out.println((java.lang.Object) ("asc_desc - ascend: " + d2 + ", descend: " + d));
        java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.GPSPosition> gpsPositions3 = session.getGpsPositions();
        arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(gpsPositions3, 10));
        while (r8.hasNext()) {
            if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) getAbsoluteElevationEnabled().get(), (java.lang.Object) true)) {
                d3 = 0.0d;
            } else {
                d3 = altitude;
            }
            arrayList.add(gPSPosition.copy((27 & 1) != 0 ? gPSPosition.longitude : 0.0d, (27 & 2) != 0 ? gPSPosition.latitude : 0.0d, (27 & 4) != 0 ? gPSPosition.altitude : this.userPrefsUtils.getValue(java.lang.Double.valueOf(gPSPosition.getAltitude() - d3), powerwatch.matrix.com.pwgen2android.utils.MetricsConvertType.DISTANCE.INSTANCE).getFirst().floatValue(), (27 & 8) != 0 ? gPSPosition.elevation : 0.0d, (27 & 16) != 0 ? gPSPosition.timestamp : 0L));
        }
        java.util.ArrayList arrayList4 = arrayList;
        this.ascendDisplayed.set(java.lang.Boolean.valueOf(z));
        boolIsMetricsUsedOrNull = this.userPrefsUtils.isMetricsUsedOrNull();
        if (boolIsMetricsUsedOrNull != null ? boolIsMetricsUsedOrNull.booleanValue() : false) {
            str = powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtilsKt.metricsMetersUnit;
        } else {
            str = powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtilsKt.imperialFeetUnit;
        }
        kotlin.Pair<java.lang.Float, java.lang.String> value3 = this.userPrefsUtils.getValue(java.lang.Double.valueOf(d2), powerwatch.matrix.com.pwgen2android.utils.MetricsConvertType.DISTANCE.INSTANCE);
        this.totalAscendedValue.set(kotlin.math.MathKt.roundToInt(value3.getFirst().floatValue()) + str);
        kotlin.Pair<java.lang.Float, java.lang.String> value4 = this.userPrefsUtils.getValue(java.lang.Double.valueOf(d), powerwatch.matrix.com.pwgen2android.utils.MetricsConvertType.DISTANCE.INSTANCE);
        this.totalDescendedValue.set(kotlin.math.MathKt.roundToInt(value4.getFirst().floatValue()) + str);
        powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession userActivitySessionCopy2 = session.copy((114673 & 1) != 0 ? session.id : null, (114673 & 2) != 0 ? session.name : null, (114673 & 4) != 0 ? session.activityType : null, (114673 & 8) != 0 ? session.locationName : null, (114673 & 16) != 0 ? session.distance : 0.0f, (114673 & 32) != 0 ? session.steps : 0, (114673 & 64) != 0 ? session.startTime : 0L, (114673 & 128) != 0 ? session.endTime : 0L, (114673 & 256) != 0 ? session.pace : 0.0f, (114673 & 512) != 0 ? session.activeCalories : 0, (114673 & 1024) != 0 ? session.bmrCalories : 0, (114673 & 2048) != 0 ? session.splits : null, (114673 & 4096) != 0 ? session.gpsPositions : arrayList4, (114673 & 8192) != 0 ? session.heartRates : null, (114673 & 16384) != 0 ? session.notes : null, (114673 & 32768) != 0 ? session.getShouldSend() : false, (114673 & 65536) != 0 ? session.getEmail() : null);
        getHeartRateChartViewModel().loadActivityData(userActivitySessionCopy2);
        this.runningAnimator.init(userActivitySessionCopy2);
    }

    private final java.lang.String formatPace(float pace, java.lang.String unit) {
        int i = (int) (pace / 60);
        int iRoundToInt = kotlin.math.MathKt.roundToInt(pace - (i * 60));
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
        java.lang.String str = java.lang.String.format("%02d", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(i)}, 1));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "java.lang.String.format(this, *args)");
        java.lang.String str2 = java.lang.String.format("%02d", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(iRoundToInt)}, 1));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "java.lang.String.format(this, *args)");
        java.lang.String str3 = java.lang.String.format("%s:%s", java.util.Arrays.copyOf(new java.lang.Object[]{str, str2}, 2));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str3, "java.lang.String.format(format, *args)");
        sb.append(str3);
        sb.append('/');
        java.util.Objects.requireNonNull(unit, "null cannot be cast to non-null type kotlin.CharSequence");
        sb.append(kotlin.text.StringsKt.trim((java.lang.CharSequence) unit).toString());
        return sb.toString();
    }

    private final java.lang.String formatAvgSpeed(int speed, java.lang.String unit) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
        java.lang.String str = java.lang.String.format("%d", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(speed)}, 1));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "java.lang.String.format(format, *args)");
        sb.append(str);
        sb.append(' ');
        java.util.Objects.requireNonNull(unit, "null cannot be cast to non-null type kotlin.CharSequence");
        sb.append(kotlin.text.StringsKt.trim((java.lang.CharSequence) unit).toString());
        return sb.toString();
    }

    private final java.util.List<powerwatch.matrix.com.pwgen2android.shared.ui.views.SplitItemView> convertToSplitView(java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.RunningSplit> splits) {
        java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.RunningSplit> list = splits;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
        int i = 0;
        for (java.lang.Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                kotlin.collections.CollectionsKt.throwIndexOverflow();
            }
            kotlin.Pair<java.lang.Long, java.lang.Long> pairMinutesAndSeconds = powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.minutesAndSeconds(((powerwatch.matrix.com.pwgen2android.shared.data.models.RunningSplit) obj).getSplitDuration());
            java.lang.String strStringPlus = kotlin.jvm.internal.Intrinsics.stringPlus("KM ", java.lang.Integer.valueOf(i2));
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(pairMinutesAndSeconds.getFirst().longValue());
            sb.append('\'');
            sb.append(pairMinutesAndSeconds.getSecond().longValue());
            sb.append(kotlin.text.Typography.quote);
            arrayList.add(new powerwatch.matrix.com.pwgen2android.shared.ui.views.SplitItemView(strStringPlus, sb.toString()));
            i = i2;
        }
        return arrayList;
    }

    @Override // powerwatch.matrix.com.pwgen2android.main.MainDeepBaseViewModel
    public void onBackClicked() {
        super.onBackClicked();
        androidx.fragment.app.FragmentManager fragmentManager = this.parentFragmentManagerWeakReference.get();
        if (fragmentManager == null) {
            return;
        }
        fragmentManager.popBackStack();
    }

    public final void onRightButtonClicked() {
        java.lang.Integer num = this.selectedSessionIndex;
        if (num != null) {
            java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession> list = this.activitySessions;
            kotlin.jvm.internal.Intrinsics.checkNotNull(num);
            powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.EditUserActivityFragment editUserActivityFragmentNewInstance = powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.EditUserActivityFragment.INSTANCE.newInstance(list.get(num.intValue()).getId());
            androidx.fragment.app.FragmentManager fragmentManager = this.parentFragmentManagerWeakReference.get();
            if (fragmentManager == null) {
                return;
            }
            powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationExtensionsKt.addFragment$default(fragmentManager, editUserActivityFragmentNewInstance, powerwatch.matrix.com.pwgen2android.R.id.dashboard_fragment_container, false, null, 12, null);
        }
    }

    public final void onSessionClicked(android.view.View view) {
        android.os.Bundle arguments;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<this>");
        java.lang.Integer num = this.selectedSessionIndex;
        if (num != null) {
            java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession> list = this.activitySessions;
            kotlin.jvm.internal.Intrinsics.checkNotNull(num);
            java.lang.String id = list.get(num.intValue()).getId();
            androidx.fragment.app.FragmentManager fragmentManager = this.parentFragmentManagerWeakReference.get();
            androidx.fragment.app.Fragment fragmentFindFragmentByTag = fragmentManager == null ? null : fragmentManager.findFragmentByTag(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.MainDashboardFragment.class).getSimpleName());
            powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.MainDashboardFragment mainDashboardFragment = fragmentFindFragmentByTag instanceof powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.MainDashboardFragment ? (powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.MainDashboardFragment) fragmentFindFragmentByTag : null;
            if (mainDashboardFragment != null) {
                androidx.fragment.app.Fragment fragmentFindFragmentByTag2 = mainDashboardFragment.getChildFragmentManager().findFragmentByTag(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.MainUserActivityFragment.class).getSimpleName());
                powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.MainUserActivityFragment mainUserActivityFragment = fragmentFindFragmentByTag2 instanceof powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.MainUserActivityFragment ? (powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.MainUserActivityFragment) fragmentFindFragmentByTag2 : null;
                if (mainUserActivityFragment != null && (arguments = mainUserActivityFragment.getArguments()) != null) {
                    arguments.putString(powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.UserActivityDetailsFragment.ACTIVITY_ID, id);
                }
            }
            if (fragmentManager == null) {
                return;
            }
            powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationExtensionsKt.addFragment$default(fragmentManager, powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.UserActivityDetailsFragment.INSTANCE.newInstance(id), powerwatch.matrix.com.pwgen2android.R.id.dashboard_fragment_container, true, null, 8, null);
        }
    }

    public final void loadActivitySession(final java.lang.String activityId, final android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.dataDisposable.dispose();
        io.reactivex.disposables.CompositeDisposable compositeDisposable = new io.reactivex.disposables.CompositeDisposable();
        this.dataDisposable = compositeDisposable;
        compositeDisposable.add(this.selectedDateProvider.getSelectedDateObservable().switchMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.-$$Lambda$UserActivityViewModel$t6EloQrq2x36E9xJyRaVSvjFGXw
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.UserActivityViewModel.m1861loadActivitySession$lambda13(this.f$0, (java.util.Calendar) obj);
            }
        }).subscribe(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.-$$Lambda$UserActivityViewModel$PkJrb2DPvrIILAPJHw8TMYQGWbY
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.UserActivityViewModel.m1862loadActivitySession$lambda16(this.f$0, context, activityId, (java.util.List) obj);
            }
        }, new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.-$$Lambda$UserActivityViewModel$ErVRZ5yYdFccsFYrFE4KLbX_L3o
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.UserActivityViewModel.m1863loadActivitySession$lambda17(this.f$0, (java.lang.Throwable) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: loadActivitySession$lambda-13, reason: not valid java name */
    public static final io.reactivex.ObservableSource m1861loadActivitySession$lambda13(powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.UserActivityViewModel this$0, java.util.Calendar it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return this$0.userActivitySessionDataProvider.loadData(new powerwatch.matrix.com.pwgen2android.shared.data.repositories.Page(1, powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.dayOffsetFromToday(it), 0L, 0, 12, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: loadActivitySession$lambda-16, reason: not valid java name */
    public static final void m1862loadActivitySession$lambda16(powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.UserActivityViewModel this$0, android.content.Context context, java.lang.String str, java.util.List activitySessions) {
        java.lang.Object next;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "$context");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(activitySessions, "activitySessions");
        this$0.activitySessions = kotlin.collections.CollectionsKt.sortedWith(activitySessions, new java.util.Comparator<T>() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.UserActivityViewModel$loadActivitySession$lambda-16$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return kotlin.comparisons.ComparisonsKt.compareValues(java.lang.Long.valueOf(((powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession) t).getStartTime()), java.lang.Long.valueOf(((powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession) t2).getStartTime()));
            }
        });
        int size = activitySessions.size();
        this$0.getLeftArrowVisible().set(java.lang.Boolean.valueOf(size > 1));
        this$0.getRightArrowVisible().set(java.lang.Boolean.valueOf(size > 1));
        java.util.Iterator<T> it = this$0.activitySessions.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!kotlin.jvm.internal.Intrinsics.areEqual(((powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession) next).getId(), str));
        powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession userActivitySession = (powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession) next;
        if (userActivitySession == null) {
            userActivitySession = (powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession) kotlin.collections.CollectionsKt.lastOrNull((java.util.List) this$0.activitySessions);
        }
        if (userActivitySession != null) {
            java.lang.Integer numValueOf = java.lang.Integer.valueOf(this$0.activitySessions.indexOf(userActivitySession));
            this$0.selectedSessionIndex = numValueOf;
            int size2 = activitySessions.size() - 1;
            if (numValueOf == null || numValueOf.intValue() != size2) {
                if (numValueOf != null && numValueOf.intValue() == 0) {
                    this$0.getLeftArrowVisible().set(false);
                }
            } else {
                this$0.getRightArrowVisible().set(false);
            }
            this$0.fillUI(userActivitySession, context);
            return;
        }
        this$0.selectedSessionIndex = null;
        this$0.getNoSessions().set(true);
        this$0.getHasLocations().set(false);
        this$0.getHasSplits().set(false);
        this$0.getHasHeartRates().set(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: loadActivitySession$lambda-17, reason: not valid java name */
    public static final void m1863loadActivitySession$lambda17(powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.UserActivityViewModel this$0, java.lang.Throwable th) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.error$default(this$0, "Error while loading activity sessions.", th, null, 4, null);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseViewModel
    public void onDataReload(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        super.onDataReload(context);
        java.lang.Integer num = this.selectedSessionIndex;
        if (num != null) {
            java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession> list = this.activitySessions;
            kotlin.jvm.internal.Intrinsics.checkNotNull(num);
            fillUI(list.get(num.intValue()), context);
            java.lang.Integer num2 = this.selectedSessionIndex;
            kotlin.jvm.internal.Intrinsics.checkNotNull(num2);
            if (num2.intValue() == this.activitySessions.size() - 1) {
                this.rightArrowVisible.set(false);
            }
            java.lang.Integer num3 = this.selectedSessionIndex;
            kotlin.jvm.internal.Intrinsics.checkNotNull(num3);
            if (num3.intValue() == 0) {
                this.leftArrowVisible.set(false);
            }
        }
    }

    public final void onNextClicked(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<this>");
        java.lang.Integer num = this.selectedSessionIndex;
        if (num != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(num);
            if (num.intValue() < this.activitySessions.size() - 1) {
                java.lang.Integer num2 = this.selectedSessionIndex;
                kotlin.jvm.internal.Intrinsics.checkNotNull(num2);
                java.lang.Integer numValueOf = java.lang.Integer.valueOf(num2.intValue() + 1);
                this.selectedSessionIndex = numValueOf;
                java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession> list = this.activitySessions;
                kotlin.jvm.internal.Intrinsics.checkNotNull(numValueOf);
                powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession userActivitySession = list.get(numValueOf.intValue());
                android.content.Context context = view.getContext();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context, "context");
                fillUI(userActivitySession, context);
                java.lang.Integer num3 = this.selectedSessionIndex;
                kotlin.jvm.internal.Intrinsics.checkNotNull(num3);
                if (num3.intValue() == this.activitySessions.size() - 1) {
                    this.rightArrowVisible.set(false);
                }
                this.leftArrowVisible.set(true);
            }
        }
    }

    public final void onPreviousClicked(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<this>");
        java.lang.Integer num = this.selectedSessionIndex;
        if (num != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(num);
            if (num.intValue() > 0) {
                java.lang.Integer num2 = this.selectedSessionIndex;
                kotlin.jvm.internal.Intrinsics.checkNotNull(num2);
                java.lang.Integer numValueOf = java.lang.Integer.valueOf(num2.intValue() - 1);
                this.selectedSessionIndex = numValueOf;
                java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession> list = this.activitySessions;
                kotlin.jvm.internal.Intrinsics.checkNotNull(numValueOf);
                powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession userActivitySession = list.get(numValueOf.intValue());
                android.content.Context context = view.getContext();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context, "context");
                fillUI(userActivitySession, context);
                java.lang.Integer num3 = this.selectedSessionIndex;
                kotlin.jvm.internal.Intrinsics.checkNotNull(num3);
                if (num3.intValue() == 0) {
                    this.leftArrowVisible.set(false);
                }
                this.rightArrowVisible.set(true);
            }
        }
    }

    public final void onShareButtonClicked() {
        java.lang.Integer num = this.selectedSessionIndex;
        if (num != null) {
            java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession> list = this.activitySessions;
            kotlin.jvm.internal.Intrinsics.checkNotNull(num);
            final powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.share.ShareActivityFragment shareActivityFragmentNewInstance = powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.share.ShareActivityFragment.INSTANCE.newInstance(list.get(num.intValue()).getId());
            shareActivityFragmentNewInstance.setDialogClose(new kotlin.jvm.functions.Function1<powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.share.SharedActivity, kotlin.Unit>() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.UserActivityViewModel.onShareButtonClicked.1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.share.SharedActivity sharedActivity) {
                    invoke2(sharedActivity);
                    return kotlin.Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.share.SharedActivity data) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "data");
                    shareActivityFragmentNewInstance.dismissAllowingStateLoss();
                }
            });
            androidx.fragment.app.FragmentManager fragmentManager = this.parentFragmentManagerWeakReference.get();
            kotlin.jvm.internal.Intrinsics.checkNotNull(fragmentManager);
            shareActivityFragmentNewInstance.show(fragmentManager, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(shareActivityFragmentNewInstance.getClass()).getSimpleName());
        }
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseViewModel
    public void onDestroyView(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        super.onDestroyView(context);
        this.dataDisposable.clear();
    }
}
