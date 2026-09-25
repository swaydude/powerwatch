package powerwatch.matrix.com.pwgen2android.main.watch.settings.timer;

/* JADX INFO: compiled from: TimerSettingsVM.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B%\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0011\u0010(\u001a\b\u0012\u0004\u0012\u00020*0)¢\u0006\u0002\u0010+J\u0011\u0010,\u001a\b\u0012\u0004\u0012\u00020*0)¢\u0006\u0002\u0010+J\u0011\u0010-\u001a\b\u0012\u0004\u0012\u00020*0)¢\u0006\u0002\u0010+J\b\u0010.\u001a\u00020/H\u0016J\u0006\u00100\u001a\u00020/J\u0006\u00101\u001a\u00020/J\u0006\u00102\u001a\u00020/J\b\u00103\u001a\u00020/H\u0002R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\u0010\u0012\f\u0012\n \u0015*\u0004\u0018\u00010\u00060\u00060\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u001a\u0010\u001a\u001a\u00020\u001bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u000f¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0012R\u001a\u0010#\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'¨\u00064"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingsVM;", "Lpowerwatch/matrix/com/pwgen2android/main/MainDeepBaseViewModel;", "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;", "activity", "Landroid/app/Activity;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "communicator", "Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;", "alarmTimerSettingExecutor", "Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingsExecutor;", "(Landroid/app/Activity;Landroidx/fragment/app/FragmentManager;Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingsExecutor;)V", "getCommunicator", "()Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;", "hourValue", "Landroidx/databinding/ObservableField;", "", "getHourValue", "()Landroidx/databinding/ObservableField;", "managerWeakReference", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "minuteValue", "getMinuteValue", "secondsValue", "getSecondsValue", "timer", "Ljava/util/Timer;", "getTimer", "()Ljava/util/Timer;", "setTimer", "(Ljava/util/Timer;)V", "timerStateField", "Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerState;", "getTimerStateField", "timerValue", "getTimerValue", "()I", "setTimerValue", "(I)V", "loadHourValues", "", "", "()[Ljava/lang/String;", "loadMinuteValues", "loadSecondsValues", "onBackClicked", "", "onPauseButtonClicked", "onResetButtonClicked", "onStartButtonClicked", "updateUI", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class TimerSettingsVM extends powerwatch.matrix.com.pwgen2android.main.MainDeepBaseViewModel implements powerwatch.matrix.com.pwgen2android.shared.logger.Loggable {
    private final powerwatch.matrix.com.pwgen2android.sdk.highlevel.WatchSettingsExecutor alarmTimerSettingExecutor;
    private final powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator communicator;
    private final androidx.databinding.ObservableField<java.lang.Integer> hourValue;
    private final java.lang.ref.WeakReference<androidx.fragment.app.FragmentManager> managerWeakReference;
    private final androidx.databinding.ObservableField<java.lang.Integer> minuteValue;
    private final androidx.databinding.ObservableField<java.lang.Integer> secondsValue;
    private java.util.Timer timer;
    private final androidx.databinding.ObservableField<powerwatch.matrix.com.pwgen2android.main.watch.settings.timer.TimerState> timerStateField;
    private int timerValue;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onPauseButtonClicked$lambda-8, reason: not valid java name */
    public static final void m1992onPauseButtonClicked$lambda8(java.lang.Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onResetButtonClicked$lambda-6, reason: not valid java name */
    public static final void m1994onResetButtonClicked$lambda6(java.lang.Throwable th) {
    }

    @Override // org.koin.core.KoinComponent
    public org.koin.core.Koin getKoin() {
        return powerwatch.matrix.com.pwgen2android.shared.logger.Loggable.DefaultImpls.getKoin(this);
    }

    public final powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator getCommunicator() {
        return this.communicator;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TimerSettingsVM(android.app.Activity activity, androidx.fragment.app.FragmentManager fragmentManager, powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator communicator, powerwatch.matrix.com.pwgen2android.sdk.highlevel.WatchSettingsExecutor alarmTimerSettingExecutor) {
        super(activity, null, 2, 0 == true ? 1 : 0);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(communicator, "communicator");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(alarmTimerSettingExecutor, "alarmTimerSettingExecutor");
        this.communicator = communicator;
        this.alarmTimerSettingExecutor = alarmTimerSettingExecutor;
        this.managerWeakReference = new java.lang.ref.WeakReference<>(fragmentManager);
        this.hourValue = new androidx.databinding.ObservableField<>();
        this.minuteValue = new androidx.databinding.ObservableField<>();
        this.secondsValue = new androidx.databinding.ObservableField<>();
        androidx.databinding.ObservableField<powerwatch.matrix.com.pwgen2android.main.watch.settings.timer.TimerState> observableField = new androidx.databinding.ObservableField<>(powerwatch.matrix.com.pwgen2android.main.watch.settings.timer.TimerState.Idle.INSTANCE);
        this.timerStateField = observableField;
        this.timer = new java.util.Timer();
        observableField.addOnPropertyChangedCallback(new androidx.databinding.Observable.OnPropertyChangedCallback() { // from class: powerwatch.matrix.com.pwgen2android.main.watch.settings.timer.TimerSettingsVM.1
            @Override // androidx.databinding.Observable.OnPropertyChangedCallback
            public void onPropertyChanged(androidx.databinding.Observable sender, int propertyId) {
            }
        });
    }

    public final androidx.databinding.ObservableField<java.lang.Integer> getHourValue() {
        return this.hourValue;
    }

    public final androidx.databinding.ObservableField<java.lang.Integer> getMinuteValue() {
        return this.minuteValue;
    }

    public final androidx.databinding.ObservableField<java.lang.Integer> getSecondsValue() {
        return this.secondsValue;
    }

    public final androidx.databinding.ObservableField<powerwatch.matrix.com.pwgen2android.main.watch.settings.timer.TimerState> getTimerStateField() {
        return this.timerStateField;
    }

    public final java.util.Timer getTimer() {
        return this.timer;
    }

    public final void setTimer(java.util.Timer timer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timer, "<set-?>");
        this.timer = timer;
    }

    public final int getTimerValue() {
        return this.timerValue;
    }

    public final void setTimerValue(int i) {
        this.timerValue = i;
    }

    public final java.lang.String[] loadHourValues() {
        kotlin.ranges.IntRange intRange = new kotlin.ranges.IntRange(0, 24);
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(intRange, 10));
        java.util.Iterator<java.lang.Integer> it = intRange.iterator();
        while (it.hasNext()) {
            int iNextInt = ((kotlin.collections.IntIterator) it).nextInt();
            kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
            java.lang.String str = java.lang.String.format("%02d", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(iNextInt)}, 1));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "java.lang.String.format(format, *args)");
            arrayList.add(str);
        }
        java.lang.Object[] array = arrayList.toArray(new java.lang.String[0]);
        java.util.Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        return (java.lang.String[]) array;
    }

    public final java.lang.String[] loadMinuteValues() {
        kotlin.ranges.IntRange intRange = new kotlin.ranges.IntRange(0, 59);
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(intRange, 10));
        java.util.Iterator<java.lang.Integer> it = intRange.iterator();
        while (it.hasNext()) {
            int iNextInt = ((kotlin.collections.IntIterator) it).nextInt();
            kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
            java.lang.String str = java.lang.String.format("%02d", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(iNextInt)}, 1));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "java.lang.String.format(format, *args)");
            arrayList.add(str);
        }
        java.lang.Object[] array = arrayList.toArray(new java.lang.String[0]);
        java.util.Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        return (java.lang.String[]) array;
    }

    public final java.lang.String[] loadSecondsValues() {
        return loadMinuteValues();
    }

    @Override // powerwatch.matrix.com.pwgen2android.main.MainDeepBaseViewModel
    public void onBackClicked() {
        androidx.fragment.app.FragmentManager fragmentManager = this.managerWeakReference.get();
        if (fragmentManager == null) {
            return;
        }
        fragmentManager.popBackStack();
    }

    public final void onStartButtonClicked() {
        io.reactivex.disposables.CompositeDisposable compositeDisposable = getCompositeDisposable();
        powerwatch.matrix.com.pwgen2android.sdk.highlevel.WatchSettingsExecutor watchSettingsExecutor = this.alarmTimerSettingExecutor;
        java.lang.Integer num = this.hourValue.get();
        byte bIntValue = num == null ? (byte) 0 : (byte) num.intValue();
        java.lang.Integer num2 = this.minuteValue.get();
        byte bIntValue2 = num2 == null ? (byte) 0 : (byte) num2.intValue();
        java.lang.Integer num3 = this.secondsValue.get();
        compositeDisposable.add(watchSettingsExecutor.setTimer(new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.TimerData(bIntValue, bIntValue2, num3 != null ? (byte) num3.intValue() : (byte) 0, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.TimerControl.Start.INSTANCE)).observeOn(io.reactivex.android.schedulers.AndroidSchedulers.mainThread()).subscribe(new io.reactivex.functions.Action() { // from class: powerwatch.matrix.com.pwgen2android.main.watch.settings.timer.-$$Lambda$TimerSettingsVM$zDB5XUGR2aZcdOZXzLs9EUAxPGQ
            @Override // io.reactivex.functions.Action
            public final void run() {
                powerwatch.matrix.com.pwgen2android.main.watch.settings.timer.TimerSettingsVM.m1995onStartButtonClicked$lambda2(this.f$0);
            }
        }, new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.main.watch.settings.timer.-$$Lambda$TimerSettingsVM$AcVb7wX_VMPZVuJ0wRE7fw5WfAc
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                ((java.lang.Throwable) obj).printStackTrace();
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onStartButtonClicked$lambda-2, reason: not valid java name */
    public static final void m1995onStartButtonClicked$lambda2(powerwatch.matrix.com.pwgen2android.main.watch.settings.timer.TimerSettingsVM this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        java.lang.Integer num = this$0.getHourValue().get();
        kotlin.jvm.internal.Intrinsics.checkNotNull(num);
        int iIntValue = num.intValue() * 60 * 60;
        java.lang.Integer num2 = this$0.getMinuteValue().get();
        kotlin.jvm.internal.Intrinsics.checkNotNull(num2);
        int iIntValue2 = iIntValue + (num2.intValue() * 60);
        java.lang.Integer num3 = this$0.getSecondsValue().get();
        kotlin.jvm.internal.Intrinsics.checkNotNull(num3);
        this$0.setTimerValue(iIntValue2 + num3.intValue());
        this$0.getTimerStateField().set(powerwatch.matrix.com.pwgen2android.main.watch.settings.timer.TimerState.Running.INSTANCE);
        java.lang.System.out.println((java.lang.Object) kotlin.jvm.internal.Intrinsics.stringPlus("timer_flow: started ", java.lang.Integer.valueOf(this$0.getTimerValue())));
        this$0.getTimer().schedule(new powerwatch.matrix.com.pwgen2android.main.watch.settings.timer.TimerSettingsVM$onStartButtonClicked$1$1(this$0), 0L, 1000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateUI() {
        long j = ((long) this.timerValue) * 1000;
        final long hours = java.util.concurrent.TimeUnit.MILLISECONDS.toHours(j);
        final long minutes = java.util.concurrent.TimeUnit.MILLISECONDS.toMinutes(j) - java.util.concurrent.TimeUnit.HOURS.toMinutes(java.util.concurrent.TimeUnit.MILLISECONDS.toHours(j));
        final long seconds = java.util.concurrent.TimeUnit.MILLISECONDS.toSeconds(j) - java.util.concurrent.TimeUnit.MINUTES.toSeconds(java.util.concurrent.TimeUnit.MILLISECONDS.toMinutes(j));
        java.lang.System.out.println((java.lang.Object) ("timer_flow: updating ui elements - " + hours + ", " + minutes + ", " + seconds));
        new android.os.Handler(android.os.Looper.getMainLooper()).post(new java.lang.Runnable() { // from class: powerwatch.matrix.com.pwgen2android.main.watch.settings.timer.-$$Lambda$TimerSettingsVM$cZGQENbGynv2HzykKTgDqunJkKk
            @Override // java.lang.Runnable
            public final void run() {
                powerwatch.matrix.com.pwgen2android.main.watch.settings.timer.TimerSettingsVM.m1997updateUI$lambda4(this.f$0, hours, minutes, seconds);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: updateUI$lambda-4, reason: not valid java name */
    public static final void m1997updateUI$lambda4(powerwatch.matrix.com.pwgen2android.main.watch.settings.timer.TimerSettingsVM this$0, long j, long j2, long j3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getHourValue().set(java.lang.Integer.valueOf((int) j));
        this$0.getMinuteValue().set(java.lang.Integer.valueOf((int) j2));
        this$0.getSecondsValue().set(java.lang.Integer.valueOf((int) j3));
    }

    public final void onResetButtonClicked() {
        io.reactivex.disposables.CompositeDisposable compositeDisposable = getCompositeDisposable();
        powerwatch.matrix.com.pwgen2android.sdk.highlevel.WatchSettingsExecutor watchSettingsExecutor = this.alarmTimerSettingExecutor;
        java.lang.Integer num = this.hourValue.get();
        byte bIntValue = num == null ? (byte) 0 : (byte) num.intValue();
        java.lang.Integer num2 = this.minuteValue.get();
        byte bIntValue2 = num2 == null ? (byte) 0 : (byte) num2.intValue();
        java.lang.Integer num3 = this.secondsValue.get();
        compositeDisposable.add(watchSettingsExecutor.setTimer(new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.TimerData(bIntValue, bIntValue2, num3 != null ? (byte) num3.intValue() : (byte) 0, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.TimerControl.Reset.INSTANCE)).observeOn(io.reactivex.android.schedulers.AndroidSchedulers.mainThread()).subscribe(new io.reactivex.functions.Action() { // from class: powerwatch.matrix.com.pwgen2android.main.watch.settings.timer.-$$Lambda$TimerSettingsVM$md93yOzuBg6EX4KXjc4qebsrA8o
            @Override // io.reactivex.functions.Action
            public final void run() {
                powerwatch.matrix.com.pwgen2android.main.watch.settings.timer.TimerSettingsVM.m1993onResetButtonClicked$lambda5(this.f$0);
            }
        }, new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.main.watch.settings.timer.-$$Lambda$TimerSettingsVM$xJx9whZzbB64hnIb_4DwGzk2qwY
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.main.watch.settings.timer.TimerSettingsVM.m1994onResetButtonClicked$lambda6((java.lang.Throwable) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onResetButtonClicked$lambda-5, reason: not valid java name */
    public static final void m1993onResetButtonClicked$lambda5(powerwatch.matrix.com.pwgen2android.main.watch.settings.timer.TimerSettingsVM this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        java.lang.System.out.println((java.lang.Object) "timer_flow: reset triggered");
        this$0.setTimerValue(0);
        this$0.updateUI();
        this$0.getTimerStateField().set(powerwatch.matrix.com.pwgen2android.main.watch.settings.timer.TimerState.Idle.INSTANCE);
    }

    public final void onPauseButtonClicked() {
        io.reactivex.disposables.CompositeDisposable compositeDisposable = getCompositeDisposable();
        powerwatch.matrix.com.pwgen2android.sdk.highlevel.WatchSettingsExecutor watchSettingsExecutor = this.alarmTimerSettingExecutor;
        java.lang.Integer num = this.hourValue.get();
        byte bIntValue = num == null ? (byte) 0 : (byte) num.intValue();
        java.lang.Integer num2 = this.minuteValue.get();
        byte bIntValue2 = num2 == null ? (byte) 0 : (byte) num2.intValue();
        java.lang.Integer num3 = this.secondsValue.get();
        compositeDisposable.add(watchSettingsExecutor.setTimer(new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.TimerData(bIntValue, bIntValue2, num3 != null ? (byte) num3.intValue() : (byte) 0, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.TimerControl.Pause.INSTANCE)).observeOn(io.reactivex.android.schedulers.AndroidSchedulers.mainThread()).subscribe(new io.reactivex.functions.Action() { // from class: powerwatch.matrix.com.pwgen2android.main.watch.settings.timer.-$$Lambda$TimerSettingsVM$sFvv_cLx4VDBnfubVEAz3ek6aDM
            @Override // io.reactivex.functions.Action
            public final void run() {
                powerwatch.matrix.com.pwgen2android.main.watch.settings.timer.TimerSettingsVM.m1991onPauseButtonClicked$lambda7(this.f$0);
            }
        }, new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.main.watch.settings.timer.-$$Lambda$TimerSettingsVM$aMw4NC7n5ieHkumWO755teJxHkw
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.main.watch.settings.timer.TimerSettingsVM.m1992onPauseButtonClicked$lambda8((java.lang.Throwable) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onPauseButtonClicked$lambda-7, reason: not valid java name */
    public static final void m1991onPauseButtonClicked$lambda7(powerwatch.matrix.com.pwgen2android.main.watch.settings.timer.TimerSettingsVM this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        java.lang.System.out.println((java.lang.Object) "timer_flow: pause triggered");
        this$0.getTimer().cancel();
        this$0.getTimer().purge();
        this$0.setTimer(new java.util.Timer());
        this$0.getTimerStateField().set(powerwatch.matrix.com.pwgen2android.main.watch.settings.timer.TimerState.Pause.INSTANCE);
    }
}
