package powerwatch.matrix.com.pwgen2android.main.watch.settings.alarm;

/* JADX INFO: compiled from: WatchAlarmSettingFragment.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001d2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u001dB\u0005¢\u0006\u0002\u0010\u0005J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0014J\b\u0010\u0013\u001a\u00020\u0003H\u0014J\b\u0010\u0014\u001a\u00020\u0012H\u0014J&\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016R\u001b\u0010\u0006\u001a\u00020\u00038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmSettingFragment;", "Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;", "Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentWatchAlarmBinding;", "Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmViewModel;", "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;", "()V", "alarmViewModel", "getAlarmViewModel", "()Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmViewModel;", "alarmViewModel$delegate", "Lkotlin/Lazy;", "amPicker", "Lcom/super_rabbit/wheel_picker/WheelPicker;", "hourPicker", "minutePicker", "copyValuesToVM", "", "getBindingVariable", "", "getViewModel", "layoutRes", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class WatchAlarmSettingFragment extends powerwatch.matrix.com.pwgen2android.shared.BaseFragment<powerwatch.matrix.com.pwgen2android.databinding.FragmentWatchAlarmBinding, powerwatch.matrix.com.pwgen2android.main.watch.settings.alarm.WatchAlarmViewModel> implements powerwatch.matrix.com.pwgen2android.shared.logger.Loggable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final powerwatch.matrix.com.pwgen2android.main.watch.settings.alarm.WatchAlarmSettingFragment.Companion INSTANCE = new powerwatch.matrix.com.pwgen2android.main.watch.settings.alarm.WatchAlarmSettingFragment.Companion(null);

    /* JADX INFO: renamed from: alarmViewModel$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy alarmViewModel;
    private com.super_rabbit.wheel_picker.WheelPicker amPicker;
    private com.super_rabbit.wheel_picker.WheelPicker hourPicker;
    private com.super_rabbit.wheel_picker.WheelPicker minutePicker;

    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseFragment
    public void _$_clearFindViewByIdCache() {
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseFragment
    protected int getBindingVariable() {
        return 1;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseFragment
    protected int layoutRes() {
        return powerwatch.matrix.com.pwgen2android.R.layout.fragment_watch_alarm;
    }

    public WatchAlarmSettingFragment() {
        final powerwatch.matrix.com.pwgen2android.main.watch.settings.alarm.WatchAlarmSettingFragment watchAlarmSettingFragment = this;
        final kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function0 = new kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters>() { // from class: powerwatch.matrix.com.pwgen2android.main.watch.settings.alarm.WatchAlarmSettingFragment$alarmViewModel$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final org.koin.core.parameter.DefinitionParameters invoke() {
                return org.koin.core.parameter.DefinitionParametersKt.parametersOf(this.this$0.getActivity(), this.this$0.getFragmentManager());
            }
        };
        final org.koin.core.qualifier.Qualifier qualifier = (org.koin.core.qualifier.Qualifier) null;
        this.alarmViewModel = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<powerwatch.matrix.com.pwgen2android.main.watch.settings.alarm.WatchAlarmViewModel>() { // from class: powerwatch.matrix.com.pwgen2android.main.watch.settings.alarm.WatchAlarmSettingFragment$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, powerwatch.matrix.com.pwgen2android.main.watch.settings.alarm.WatchAlarmViewModel] */
            @Override // kotlin.jvm.functions.Function0
            public final powerwatch.matrix.com.pwgen2android.main.watch.settings.alarm.WatchAlarmViewModel invoke() {
                return org.koin.androidx.viewmodel.ext.android.LifecycleOwnerExtKt.getViewModel(watchAlarmSettingFragment, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.main.watch.settings.alarm.WatchAlarmViewModel.class), qualifier, function0);
            }
        });
    }

    @Override // org.koin.core.KoinComponent
    public org.koin.core.Koin getKoin() {
        return powerwatch.matrix.com.pwgen2android.shared.logger.Loggable.DefaultImpls.getKoin(this);
    }

    private final powerwatch.matrix.com.pwgen2android.main.watch.settings.alarm.WatchAlarmViewModel getAlarmViewModel() {
        return (powerwatch.matrix.com.pwgen2android.main.watch.settings.alarm.WatchAlarmViewModel) this.alarmViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseFragment
    public powerwatch.matrix.com.pwgen2android.main.watch.settings.alarm.WatchAlarmViewModel getViewModel() {
        return getAlarmViewModel();
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseFragment, androidx.fragment.app.Fragment
    public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
        java.lang.String string;
        java.lang.String string2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inflater, "inflater");
        android.view.View viewOnCreateView = super.onCreateView(inflater, container, savedInstanceState);
        kotlin.jvm.internal.Intrinsics.checkNotNull(viewOnCreateView);
        powerwatch.matrix.com.pwgen2android.main.watch.settings.alarm.WatchAlarmViewModel viewModel = getViewModel();
        android.content.Context context = getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNull(context);
        viewModel.onCreateView(context);
        final powerwatch.matrix.com.pwgen2android.shared.ui.MainToolbar toolbar = (powerwatch.matrix.com.pwgen2android.shared.ui.MainToolbar) viewOnCreateView.findViewById(powerwatch.matrix.com.pwgen2android.R.id.main_toolbar);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(toolbar, "toolbar");
        java.lang.String string3 = getString(powerwatch.matrix.com.pwgen2android.R.string.alarm_set);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string3, "getString(R.string.alarm_set)");
        powerwatch.matrix.com.pwgen2android.shared.extensions.ToolbarViewExtensionsKt.title(toolbar, string3);
        java.lang.String string4 = getString(powerwatch.matrix.com.pwgen2android.R.string.button_done);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string4, "getString(R.string.button_done)");
        powerwatch.matrix.com.pwgen2android.shared.extensions.ToolbarViewExtensionsKt.rightButtonText(toolbar, string4);
        java.lang.String string5 = getString(powerwatch.matrix.com.pwgen2android.R.string.button_cancel);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string5, "getString(R.string.button_cancel)");
        powerwatch.matrix.com.pwgen2android.shared.extensions.ToolbarViewExtensionsKt.backButtonText(toolbar, string5);
        powerwatch.matrix.com.pwgen2android.shared.extensions.ToolbarViewExtensionsKt.backButtonClickListener(toolbar, new android.view.View.OnClickListener() { // from class: powerwatch.matrix.com.pwgen2android.main.watch.settings.alarm.-$$Lambda$WatchAlarmSettingFragment$O1clM48NwKv4v05EhLGRUc6FAyE
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                powerwatch.matrix.com.pwgen2android.main.watch.settings.alarm.WatchAlarmSettingFragment.m1968onCreateView$lambda0(this.f$0, view);
            }
        });
        powerwatch.matrix.com.pwgen2android.shared.extensions.ToolbarViewExtensionsKt.backButtonTextClickListener(toolbar, new android.view.View.OnClickListener() { // from class: powerwatch.matrix.com.pwgen2android.main.watch.settings.alarm.-$$Lambda$WatchAlarmSettingFragment$Mcl-QiK-84lV7VDz8Qo1AH0QlBI
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                powerwatch.matrix.com.pwgen2android.main.watch.settings.alarm.WatchAlarmSettingFragment.m1969onCreateView$lambda1(this.f$0, view);
            }
        });
        powerwatch.matrix.com.pwgen2android.shared.extensions.ToolbarViewExtensionsKt.rightButtonClickListener(toolbar, new android.view.View.OnClickListener() { // from class: powerwatch.matrix.com.pwgen2android.main.watch.settings.alarm.-$$Lambda$WatchAlarmSettingFragment$OZtdpQjVG4CrpAHPz56dCenQ3ks
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                powerwatch.matrix.com.pwgen2android.main.watch.settings.alarm.WatchAlarmSettingFragment.m1970onCreateView$lambda2(this.f$0, view);
            }
        });
        getViewModel().getShowSaveProgress().addOnPropertyChangedCallback(new androidx.databinding.Observable.OnPropertyChangedCallback() { // from class: powerwatch.matrix.com.pwgen2android.main.watch.settings.alarm.WatchAlarmSettingFragment.onCreateView.4
            @Override // androidx.databinding.Observable.OnPropertyChangedCallback
            public void onPropertyChanged(androidx.databinding.Observable sender, int propertyId) {
                java.lang.Boolean bool = powerwatch.matrix.com.pwgen2android.main.watch.settings.alarm.WatchAlarmSettingFragment.this.getViewModel().getShowSaveProgress().get();
                if (bool == null) {
                    bool = false;
                }
                if (bool.booleanValue()) {
                    powerwatch.matrix.com.pwgen2android.shared.ui.MainToolbar mainToolbar = toolbar;
                    if (mainToolbar == null) {
                        return;
                    }
                    mainToolbar.showRightProgress();
                    return;
                }
                powerwatch.matrix.com.pwgen2android.shared.ui.MainToolbar mainToolbar2 = toolbar;
                if (mainToolbar2 == null) {
                    return;
                }
                mainToolbar2.hideRightProgress();
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
        com.super_rabbit.wheel_picker.WheelPicker wheelPicker5 = this.hourPicker;
        if (wheelPicker5 != null) {
            kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
            java.lang.String str = java.lang.String.format("%02d", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(getViewModel().getInitialHourValue())}, 1));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "java.lang.String.format(format, *args)");
            wheelPicker5.scrollToValue(str);
        }
        com.super_rabbit.wheel_picker.WheelPicker wheelPicker6 = this.minutePicker;
        if (wheelPicker6 != null) {
            kotlin.jvm.internal.StringCompanionObject stringCompanionObject2 = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
            java.lang.String str2 = java.lang.String.format("%02d", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(getViewModel().getInitialMinuteValue())}, 1));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "java.lang.String.format(format, *args)");
            wheelPicker6.scrollToValue(str2);
        }
        this.amPicker = (com.super_rabbit.wheel_picker.WheelPicker) viewOnCreateView.findViewById(powerwatch.matrix.com.pwgen2android.R.id.am_pm_picker);
        if (getViewModel().isAMPMUSed()) {
            com.super_rabbit.wheel_picker.WheelPicker wheelPicker7 = this.amPicker;
            if (wheelPicker7 != null) {
                wheelPicker7.setVisibility(0);
            }
            java.lang.String[] strArrLoadAMValues = getViewModel().loadAMValues();
            com.super_rabbit.wheel_picker.WheelPicker wheelPicker8 = this.amPicker;
            if (wheelPicker8 != null) {
                wheelPicker8.setAdapter(new powerwatch.matrix.com.pwgen2android.setup.biometrics.StringPickerAdapter(new powerwatch.matrix.com.pwgen2android.setup.biometrics.PickedData(null, strArrLoadAMValues, 0, 0, strArrLoadAMValues, 13, null), null, 2, null));
            }
            com.super_rabbit.wheel_picker.WheelPicker wheelPicker9 = this.amPicker;
            if (wheelPicker9 != null) {
                wheelPicker9.scrollToValue(getViewModel().getInitialAM());
            }
        } else {
            com.super_rabbit.wheel_picker.WheelPicker wheelPicker10 = this.amPicker;
            if (wheelPicker10 != null) {
                wheelPicker10.setVisibility(8);
            }
        }
        android.view.View viewFindViewById = viewOnCreateView.findViewById(powerwatch.matrix.com.pwgen2android.R.id.previous_alarm_layout);
        android.widget.TextView textView = (android.widget.TextView) viewOnCreateView.findViewById(powerwatch.matrix.com.pwgen2android.R.id.old_alarm_label);
        android.widget.TextView textView2 = (android.widget.TextView) viewOnCreateView.findViewById(powerwatch.matrix.com.pwgen2android.R.id.old_alarm_repeat_mode);
        android.widget.TextView textView3 = (android.widget.TextView) viewOnCreateView.findViewById(powerwatch.matrix.com.pwgen2android.R.id.old_alarm_activation_mode);
        if (getViewModel().isOldAlarmSet()) {
            textView.setText(getViewModel().getOldAlarmTime());
            powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.AlarmControl oldAlarmActive = getViewModel().getOldAlarmActive();
            if (kotlin.jvm.internal.Intrinsics.areEqual(oldAlarmActive, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.AlarmControl.Off.INSTANCE)) {
                string = getString(powerwatch.matrix.com.pwgen2android.R.string.off);
            } else if (kotlin.jvm.internal.Intrinsics.areEqual(oldAlarmActive, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.AlarmControl.On.INSTANCE)) {
                string = getString(powerwatch.matrix.com.pwgen2android.R.string.on);
            } else {
                string = kotlin.jvm.internal.Intrinsics.areEqual(oldAlarmActive, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.AlarmControl.Once.INSTANCE) ? getString(powerwatch.matrix.com.pwgen2android.R.string.once) : "";
            }
            textView3.setText(string);
            powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.DaySelection oldAlarmRepetition = getViewModel().getOldAlarmRepetition();
            if (kotlin.jvm.internal.Intrinsics.areEqual(oldAlarmRepetition, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.DaySelection.EveryDay.INSTANCE)) {
                string2 = getString(powerwatch.matrix.com.pwgen2android.R.string.every_day);
            } else if (kotlin.jvm.internal.Intrinsics.areEqual(oldAlarmRepetition, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.DaySelection.EveryWeekDay.INSTANCE)) {
                string2 = getString(powerwatch.matrix.com.pwgen2android.R.string.every_week_day);
            } else if (kotlin.jvm.internal.Intrinsics.areEqual(oldAlarmRepetition, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.DaySelection.EveryWeekend.INSTANCE)) {
                string2 = getString(powerwatch.matrix.com.pwgen2android.R.string.every_weekend);
            } else {
                if (oldAlarmRepetition != null) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
            }
            textView2.setText(string2);
        } else {
            viewFindViewById.setVisibility(8);
        }
        return viewOnCreateView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreateView$lambda-0, reason: not valid java name */
    public static final void m1968onCreateView$lambda0(powerwatch.matrix.com.pwgen2android.main.watch.settings.alarm.WatchAlarmSettingFragment this$0, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getViewModel().onBackClicked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreateView$lambda-1, reason: not valid java name */
    public static final void m1969onCreateView$lambda1(powerwatch.matrix.com.pwgen2android.main.watch.settings.alarm.WatchAlarmSettingFragment this$0, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getViewModel().onBackClicked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreateView$lambda-2, reason: not valid java name */
    public static final void m1970onCreateView$lambda2(powerwatch.matrix.com.pwgen2android.main.watch.settings.alarm.WatchAlarmSettingFragment this$0, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.copyValuesToVM();
        this$0.getViewModel().onDoneClicked();
    }

    private final void copyValuesToVM() {
        java.lang.String currentItem;
        androidx.databinding.ObservableField<java.lang.Integer> hourValue = getViewModel().getHourValue();
        com.super_rabbit.wheel_picker.WheelPicker wheelPicker = this.hourPicker;
        java.lang.String currentItem2 = wheelPicker == null ? null : wheelPicker.getCurrentItem();
        hourValue.set(java.lang.Integer.valueOf(currentItem2 == null ? 0 : java.lang.Integer.parseInt(currentItem2)));
        androidx.databinding.ObservableField<java.lang.Integer> minuteValue = getViewModel().getMinuteValue();
        com.super_rabbit.wheel_picker.WheelPicker wheelPicker2 = this.minutePicker;
        java.lang.String currentItem3 = wheelPicker2 != null ? wheelPicker2.getCurrentItem() : null;
        minuteValue.set(java.lang.Integer.valueOf(currentItem3 != null ? java.lang.Integer.parseInt(currentItem3) : 0));
        androidx.databinding.ObservableField<java.lang.String> amPm = getViewModel().getAmPm();
        com.super_rabbit.wheel_picker.WheelPicker wheelPicker3 = this.amPicker;
        java.lang.String str = "";
        if (wheelPicker3 != null && (currentItem = wheelPicker3.getCurrentItem()) != null) {
            str = currentItem;
        }
        amPm.set(str);
    }

    /* JADX INFO: compiled from: WatchAlarmSettingFragment.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmSettingFragment$Companion;", "", "()V", "newInstance", "Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmSettingFragment;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final powerwatch.matrix.com.pwgen2android.main.watch.settings.alarm.WatchAlarmSettingFragment newInstance() {
            return new powerwatch.matrix.com.pwgen2android.main.watch.settings.alarm.WatchAlarmSettingFragment();
        }
    }
}
