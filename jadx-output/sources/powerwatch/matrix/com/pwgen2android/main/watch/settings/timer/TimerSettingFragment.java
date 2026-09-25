package powerwatch.matrix.com.pwgen2android.main.watch.settings.timer;

/* JADX INFO: compiled from: TimerSettingFragment.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001d2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u001dB\u0005¢\u0006\u0002\u0010\u0005J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0014J\b\u0010\u0013\u001a\u00020\u0003H\u0014J\b\u0010\u0014\u001a\u00020\u0012H\u0014J&\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016R\u001b\u0010\u0006\u001a\u00020\u00038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingFragment;", "Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;", "Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentTimerSettingsBinding;", "Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingsVM;", "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;", "()V", "alarmViewModel", "getAlarmViewModel", "()Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingsVM;", "alarmViewModel$delegate", "Lkotlin/Lazy;", "hourPicker", "Lcom/super_rabbit/wheel_picker/WheelPicker;", "minutePicker", "secondsPicker", "copyValuesToVM", "", "getBindingVariable", "", "getViewModel", "layoutRes", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class TimerSettingFragment extends powerwatch.matrix.com.pwgen2android.shared.BaseFragment<powerwatch.matrix.com.pwgen2android.databinding.FragmentTimerSettingsBinding, powerwatch.matrix.com.pwgen2android.main.watch.settings.timer.TimerSettingsVM> implements powerwatch.matrix.com.pwgen2android.shared.logger.Loggable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final powerwatch.matrix.com.pwgen2android.main.watch.settings.timer.TimerSettingFragment.Companion INSTANCE = new powerwatch.matrix.com.pwgen2android.main.watch.settings.timer.TimerSettingFragment.Companion(null);

    /* JADX INFO: renamed from: alarmViewModel$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy alarmViewModel;
    private com.super_rabbit.wheel_picker.WheelPicker hourPicker;
    private com.super_rabbit.wheel_picker.WheelPicker minutePicker;
    private com.super_rabbit.wheel_picker.WheelPicker secondsPicker;

    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseFragment
    public void _$_clearFindViewByIdCache() {
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseFragment
    protected int getBindingVariable() {
        return 1;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseFragment
    protected int layoutRes() {
        return powerwatch.matrix.com.pwgen2android.R.layout.fragment_timer_settings;
    }

    public TimerSettingFragment() {
        final powerwatch.matrix.com.pwgen2android.main.watch.settings.timer.TimerSettingFragment timerSettingFragment = this;
        final kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function0 = new kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters>() { // from class: powerwatch.matrix.com.pwgen2android.main.watch.settings.timer.TimerSettingFragment$alarmViewModel$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final org.koin.core.parameter.DefinitionParameters invoke() {
                return org.koin.core.parameter.DefinitionParametersKt.parametersOf(this.this$0.getActivity(), this.this$0.getFragmentManager());
            }
        };
        final org.koin.core.qualifier.Qualifier qualifier = (org.koin.core.qualifier.Qualifier) null;
        this.alarmViewModel = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<powerwatch.matrix.com.pwgen2android.main.watch.settings.timer.TimerSettingsVM>() { // from class: powerwatch.matrix.com.pwgen2android.main.watch.settings.timer.TimerSettingFragment$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, powerwatch.matrix.com.pwgen2android.main.watch.settings.timer.TimerSettingsVM] */
            @Override // kotlin.jvm.functions.Function0
            public final powerwatch.matrix.com.pwgen2android.main.watch.settings.timer.TimerSettingsVM invoke() {
                return org.koin.androidx.viewmodel.ext.android.LifecycleOwnerExtKt.getViewModel(timerSettingFragment, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.main.watch.settings.timer.TimerSettingsVM.class), qualifier, function0);
            }
        });
    }

    @Override // org.koin.core.KoinComponent
    public org.koin.core.Koin getKoin() {
        return powerwatch.matrix.com.pwgen2android.shared.logger.Loggable.DefaultImpls.getKoin(this);
    }

    private final powerwatch.matrix.com.pwgen2android.main.watch.settings.timer.TimerSettingsVM getAlarmViewModel() {
        return (powerwatch.matrix.com.pwgen2android.main.watch.settings.timer.TimerSettingsVM) this.alarmViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseFragment
    public powerwatch.matrix.com.pwgen2android.main.watch.settings.timer.TimerSettingsVM getViewModel() {
        return getAlarmViewModel();
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseFragment, androidx.fragment.app.Fragment
    public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inflater, "inflater");
        android.view.View viewOnCreateView = super.onCreateView(inflater, container, savedInstanceState);
        kotlin.jvm.internal.Intrinsics.checkNotNull(viewOnCreateView);
        powerwatch.matrix.com.pwgen2android.main.watch.settings.timer.TimerSettingsVM viewModel = getViewModel();
        android.content.Context context = getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNull(context);
        viewModel.onCreateView(context);
        powerwatch.matrix.com.pwgen2android.shared.ui.MainToolbar toolbar = (powerwatch.matrix.com.pwgen2android.shared.ui.MainToolbar) viewOnCreateView.findViewById(powerwatch.matrix.com.pwgen2android.R.id.main_toolbar);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(toolbar, "toolbar");
        java.lang.String string = getString(powerwatch.matrix.com.pwgen2android.R.string.timer_set);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.timer_set)");
        powerwatch.matrix.com.pwgen2android.shared.extensions.ToolbarViewExtensionsKt.title(toolbar, string);
        powerwatch.matrix.com.pwgen2android.shared.extensions.ToolbarViewExtensionsKt.hideRightButton(toolbar);
        powerwatch.matrix.com.pwgen2android.shared.extensions.ToolbarViewExtensionsKt.backButtonText(toolbar, "");
        powerwatch.matrix.com.pwgen2android.shared.extensions.ToolbarViewExtensionsKt.backButtonClickListener(toolbar, new android.view.View.OnClickListener() { // from class: powerwatch.matrix.com.pwgen2android.main.watch.settings.timer.-$$Lambda$TimerSettingFragment$N07sGPUenq1QbwyskmFegrPKefA
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                powerwatch.matrix.com.pwgen2android.main.watch.settings.timer.TimerSettingFragment.m1987onCreateView$lambda0(this.f$0, view);
            }
        });
        this.hourPicker = (com.super_rabbit.wheel_picker.WheelPicker) viewOnCreateView.findViewById(powerwatch.matrix.com.pwgen2android.R.id.hour_picker);
        java.lang.String[] strArrLoadHourValues = getViewModel().loadHourValues();
        com.super_rabbit.wheel_picker.WheelPicker wheelPicker = this.hourPicker;
        if (wheelPicker != null) {
            wheelPicker.setAdapter(new powerwatch.matrix.com.pwgen2android.setup.biometrics.StringPickerAdapter(new powerwatch.matrix.com.pwgen2android.setup.biometrics.PickedData(null, strArrLoadHourValues, 0, 0, strArrLoadHourValues, 13, null), null, 2, null));
        }
        com.super_rabbit.wheel_picker.WheelPicker wheelPicker2 = this.hourPicker;
        if (wheelPicker2 != null) {
            wheelPicker2.reset();
        }
        this.minutePicker = (com.super_rabbit.wheel_picker.WheelPicker) viewOnCreateView.findViewById(powerwatch.matrix.com.pwgen2android.R.id.minute_picker);
        java.lang.String[] strArrLoadMinuteValues = getViewModel().loadMinuteValues();
        com.super_rabbit.wheel_picker.WheelPicker wheelPicker3 = this.minutePicker;
        if (wheelPicker3 != null) {
            wheelPicker3.setAdapter(new powerwatch.matrix.com.pwgen2android.setup.biometrics.StringPickerAdapter(new powerwatch.matrix.com.pwgen2android.setup.biometrics.PickedData(null, strArrLoadMinuteValues, 0, 0, strArrLoadMinuteValues, 13, null), null, 2, null));
        }
        com.super_rabbit.wheel_picker.WheelPicker wheelPicker4 = this.minutePicker;
        if (wheelPicker4 != null) {
            wheelPicker4.reset();
        }
        this.secondsPicker = (com.super_rabbit.wheel_picker.WheelPicker) viewOnCreateView.findViewById(powerwatch.matrix.com.pwgen2android.R.id.seconds_picker);
        java.lang.String[] strArrLoadSecondsValues = getViewModel().loadSecondsValues();
        com.super_rabbit.wheel_picker.WheelPicker wheelPicker5 = this.secondsPicker;
        if (wheelPicker5 != null) {
            wheelPicker5.setAdapter(new powerwatch.matrix.com.pwgen2android.setup.biometrics.StringPickerAdapter(new powerwatch.matrix.com.pwgen2android.setup.biometrics.PickedData(null, strArrLoadSecondsValues, 0, 0, strArrLoadSecondsValues, 13, null), null, 2, null));
        }
        com.super_rabbit.wheel_picker.WheelPicker wheelPicker6 = this.secondsPicker;
        if (wheelPicker6 != null) {
            wheelPicker6.reset();
        }
        final android.widget.TextView textView = (android.widget.TextView) viewOnCreateView.findViewById(powerwatch.matrix.com.pwgen2android.R.id.start_view);
        textView.setOnClickListener(new android.view.View.OnClickListener() { // from class: powerwatch.matrix.com.pwgen2android.main.watch.settings.timer.-$$Lambda$TimerSettingFragment$4b8l12iWJcdQYandWuCiEIdsysk
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                powerwatch.matrix.com.pwgen2android.main.watch.settings.timer.TimerSettingFragment.m1988onCreateView$lambda1(this.f$0, view);
            }
        });
        final android.widget.TextView textView2 = (android.widget.TextView) viewOnCreateView.findViewById(powerwatch.matrix.com.pwgen2android.R.id.pause_view);
        textView2.setOnClickListener(new android.view.View.OnClickListener() { // from class: powerwatch.matrix.com.pwgen2android.main.watch.settings.timer.-$$Lambda$TimerSettingFragment$czKhwRUaXgSu4Ri_8LMUwdJGA-k
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                powerwatch.matrix.com.pwgen2android.main.watch.settings.timer.TimerSettingFragment.m1989onCreateView$lambda2(this.f$0, view);
            }
        });
        final android.widget.TextView textView3 = (android.widget.TextView) viewOnCreateView.findViewById(powerwatch.matrix.com.pwgen2android.R.id.reset_view);
        textView3.setOnClickListener(new android.view.View.OnClickListener() { // from class: powerwatch.matrix.com.pwgen2android.main.watch.settings.timer.-$$Lambda$TimerSettingFragment$QWMUsysE0MrsBa9E3fxbIHjASpk
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                powerwatch.matrix.com.pwgen2android.main.watch.settings.timer.TimerSettingFragment.m1990onCreateView$lambda3(this.f$0, view);
            }
        });
        getViewModel().getTimerStateField().addOnPropertyChangedCallback(new androidx.databinding.Observable.OnPropertyChangedCallback() { // from class: powerwatch.matrix.com.pwgen2android.main.watch.settings.timer.TimerSettingFragment.onCreateView.5
            @Override // androidx.databinding.Observable.OnPropertyChangedCallback
            public void onPropertyChanged(androidx.databinding.Observable sender, int propertyId) {
                powerwatch.matrix.com.pwgen2android.main.watch.settings.timer.TimerState timerState = powerwatch.matrix.com.pwgen2android.main.watch.settings.timer.TimerSettingFragment.this.getViewModel().getTimerStateField().get();
                kotlin.jvm.internal.Intrinsics.checkNotNull(timerState);
                if (kotlin.jvm.internal.Intrinsics.areEqual(timerState, powerwatch.matrix.com.pwgen2android.main.watch.settings.timer.TimerState.Idle.INSTANCE)) {
                    textView.setVisibility(0);
                    textView2.setVisibility(8);
                    textView3.setEnabled(false);
                } else if (kotlin.jvm.internal.Intrinsics.areEqual(timerState, powerwatch.matrix.com.pwgen2android.main.watch.settings.timer.TimerState.Running.INSTANCE)) {
                    textView.setVisibility(8);
                    textView3.setEnabled(false);
                    textView2.setVisibility(0);
                } else if (kotlin.jvm.internal.Intrinsics.areEqual(timerState, powerwatch.matrix.com.pwgen2android.main.watch.settings.timer.TimerState.Pause.INSTANCE)) {
                    textView.setVisibility(0);
                    textView2.setVisibility(8);
                    textView3.setEnabled(true);
                }
            }
        });
        getViewModel().getHourValue().addOnPropertyChangedCallback(new androidx.databinding.Observable.OnPropertyChangedCallback() { // from class: powerwatch.matrix.com.pwgen2android.main.watch.settings.timer.TimerSettingFragment.onCreateView.6
            @Override // androidx.databinding.Observable.OnPropertyChangedCallback
            public void onPropertyChanged(androidx.databinding.Observable sender, int propertyId) {
                java.lang.System.out.println((java.lang.Object) "timer_flow: updating ui hours");
                com.super_rabbit.wheel_picker.WheelPicker wheelPicker7 = powerwatch.matrix.com.pwgen2android.main.watch.settings.timer.TimerSettingFragment.this.hourPicker;
                if (wheelPicker7 == null) {
                    return;
                }
                kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
                java.lang.Integer num = powerwatch.matrix.com.pwgen2android.main.watch.settings.timer.TimerSettingFragment.this.getViewModel().getHourValue().get();
                kotlin.jvm.internal.Intrinsics.checkNotNull(num);
                java.lang.String str = java.lang.String.format("%02d", java.util.Arrays.copyOf(new java.lang.Object[]{num}, 1));
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "java.lang.String.format(format, *args)");
                wheelPicker7.smoothScrollToValue(str);
            }
        });
        getViewModel().getMinuteValue().addOnPropertyChangedCallback(new androidx.databinding.Observable.OnPropertyChangedCallback() { // from class: powerwatch.matrix.com.pwgen2android.main.watch.settings.timer.TimerSettingFragment.onCreateView.7
            @Override // androidx.databinding.Observable.OnPropertyChangedCallback
            public void onPropertyChanged(androidx.databinding.Observable sender, int propertyId) {
                java.lang.System.out.println((java.lang.Object) "timer_flow: updating ui minutes");
                com.super_rabbit.wheel_picker.WheelPicker wheelPicker7 = powerwatch.matrix.com.pwgen2android.main.watch.settings.timer.TimerSettingFragment.this.minutePicker;
                if (wheelPicker7 == null) {
                    return;
                }
                kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
                java.lang.Integer num = powerwatch.matrix.com.pwgen2android.main.watch.settings.timer.TimerSettingFragment.this.getViewModel().getMinuteValue().get();
                kotlin.jvm.internal.Intrinsics.checkNotNull(num);
                java.lang.String str = java.lang.String.format("%02d", java.util.Arrays.copyOf(new java.lang.Object[]{num}, 1));
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "java.lang.String.format(format, *args)");
                wheelPicker7.smoothScrollToValue(str);
            }
        });
        getViewModel().getSecondsValue().addOnPropertyChangedCallback(new androidx.databinding.Observable.OnPropertyChangedCallback() { // from class: powerwatch.matrix.com.pwgen2android.main.watch.settings.timer.TimerSettingFragment.onCreateView.8
            @Override // androidx.databinding.Observable.OnPropertyChangedCallback
            public void onPropertyChanged(androidx.databinding.Observable sender, int propertyId) {
                java.lang.System.out.println((java.lang.Object) "timer_flow: updating ui seconds");
                com.super_rabbit.wheel_picker.WheelPicker wheelPicker7 = powerwatch.matrix.com.pwgen2android.main.watch.settings.timer.TimerSettingFragment.this.secondsPicker;
                if (wheelPicker7 == null) {
                    return;
                }
                kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
                java.lang.Integer num = powerwatch.matrix.com.pwgen2android.main.watch.settings.timer.TimerSettingFragment.this.getViewModel().getSecondsValue().get();
                kotlin.jvm.internal.Intrinsics.checkNotNull(num);
                java.lang.String str = java.lang.String.format("%02d", java.util.Arrays.copyOf(new java.lang.Object[]{num}, 1));
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "java.lang.String.format(format, *args)");
                wheelPicker7.smoothScrollToValue(str);
            }
        });
        return viewOnCreateView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreateView$lambda-0, reason: not valid java name */
    public static final void m1987onCreateView$lambda0(powerwatch.matrix.com.pwgen2android.main.watch.settings.timer.TimerSettingFragment this$0, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getViewModel().onBackClicked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreateView$lambda-1, reason: not valid java name */
    public static final void m1988onCreateView$lambda1(powerwatch.matrix.com.pwgen2android.main.watch.settings.timer.TimerSettingFragment this$0, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.copyValuesToVM();
        this$0.getViewModel().onStartButtonClicked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreateView$lambda-2, reason: not valid java name */
    public static final void m1989onCreateView$lambda2(powerwatch.matrix.com.pwgen2android.main.watch.settings.timer.TimerSettingFragment this$0, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getViewModel().onPauseButtonClicked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreateView$lambda-3, reason: not valid java name */
    public static final void m1990onCreateView$lambda3(powerwatch.matrix.com.pwgen2android.main.watch.settings.timer.TimerSettingFragment this$0, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getViewModel().onResetButtonClicked();
    }

    private final void copyValuesToVM() {
        androidx.databinding.ObservableField<java.lang.Integer> hourValue = getViewModel().getHourValue();
        com.super_rabbit.wheel_picker.WheelPicker wheelPicker = this.hourPicker;
        java.lang.String currentItem = wheelPicker == null ? null : wheelPicker.getCurrentItem();
        hourValue.set(java.lang.Integer.valueOf(currentItem == null ? 0 : java.lang.Integer.parseInt(currentItem)));
        androidx.databinding.ObservableField<java.lang.Integer> minuteValue = getViewModel().getMinuteValue();
        com.super_rabbit.wheel_picker.WheelPicker wheelPicker2 = this.minutePicker;
        java.lang.String currentItem2 = wheelPicker2 == null ? null : wheelPicker2.getCurrentItem();
        minuteValue.set(java.lang.Integer.valueOf(currentItem2 == null ? 0 : java.lang.Integer.parseInt(currentItem2)));
        androidx.databinding.ObservableField<java.lang.Integer> secondsValue = getViewModel().getSecondsValue();
        com.super_rabbit.wheel_picker.WheelPicker wheelPicker3 = this.secondsPicker;
        java.lang.String currentItem3 = wheelPicker3 != null ? wheelPicker3.getCurrentItem() : null;
        secondsValue.set(java.lang.Integer.valueOf(currentItem3 != null ? java.lang.Integer.parseInt(currentItem3) : 0));
    }

    /* JADX INFO: compiled from: TimerSettingFragment.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingFragment$Companion;", "", "()V", "newInstance", "Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingFragment;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final powerwatch.matrix.com.pwgen2android.main.watch.settings.timer.TimerSettingFragment newInstance() {
            return new powerwatch.matrix.com.pwgen2android.main.watch.settings.timer.TimerSettingFragment();
        }
    }
}
