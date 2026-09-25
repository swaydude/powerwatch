package powerwatch.matrix.com.pwgen2android.main.notification.ui;

/* JADX INFO: compiled from: NotificationSettingsFragment.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00172\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0017B\u0005¢\u0006\u0002\u0010\u0005J\b\u0010\u000b\u001a\u00020\fH\u0014J\b\u0010\r\u001a\u00020\u0003H\u0014J\b\u0010\u000e\u001a\u00020\fH\u0014J&\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016R\u001b\u0010\u0006\u001a\u00020\u00038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\u0018"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/notification/ui/NotificationSettingsFragment;", "Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;", "Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentNotificationSettingsBinding;", "Lpowerwatch/matrix/com/pwgen2android/main/notification/ui/NotificationSettingsVM;", "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;", "()V", "notificationSettingsVM", "getNotificationSettingsVM", "()Lpowerwatch/matrix/com/pwgen2android/main/notification/ui/NotificationSettingsVM;", "notificationSettingsVM$delegate", "Lkotlin/Lazy;", "getBindingVariable", "", "getViewModel", "layoutRes", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class NotificationSettingsFragment extends powerwatch.matrix.com.pwgen2android.shared.BaseFragment<powerwatch.matrix.com.pwgen2android.databinding.FragmentNotificationSettingsBinding, powerwatch.matrix.com.pwgen2android.main.notification.ui.NotificationSettingsVM> implements powerwatch.matrix.com.pwgen2android.shared.logger.Loggable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final powerwatch.matrix.com.pwgen2android.main.notification.ui.NotificationSettingsFragment.Companion INSTANCE = new powerwatch.matrix.com.pwgen2android.main.notification.ui.NotificationSettingsFragment.Companion(null);
    public static final java.lang.String DEVICE_KEY = "device_key";

    /* JADX INFO: renamed from: notificationSettingsVM$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy notificationSettingsVM;

    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseFragment
    public void _$_clearFindViewByIdCache() {
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseFragment
    protected int getBindingVariable() {
        return 1;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseFragment
    protected int layoutRes() {
        return powerwatch.matrix.com.pwgen2android.R.layout.fragment_notification_settings;
    }

    public NotificationSettingsFragment() {
        final powerwatch.matrix.com.pwgen2android.main.notification.ui.NotificationSettingsFragment notificationSettingsFragment = this;
        final kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function0 = new kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters>() { // from class: powerwatch.matrix.com.pwgen2android.main.notification.ui.NotificationSettingsFragment$notificationSettingsVM$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final org.koin.core.parameter.DefinitionParameters invoke() {
                return org.koin.core.parameter.DefinitionParametersKt.parametersOf(this.this$0.getFragmentManager(), this.this$0.getActivity());
            }
        };
        final org.koin.core.qualifier.Qualifier qualifier = (org.koin.core.qualifier.Qualifier) null;
        this.notificationSettingsVM = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<powerwatch.matrix.com.pwgen2android.main.notification.ui.NotificationSettingsVM>() { // from class: powerwatch.matrix.com.pwgen2android.main.notification.ui.NotificationSettingsFragment$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, powerwatch.matrix.com.pwgen2android.main.notification.ui.NotificationSettingsVM] */
            @Override // kotlin.jvm.functions.Function0
            public final powerwatch.matrix.com.pwgen2android.main.notification.ui.NotificationSettingsVM invoke() {
                return org.koin.androidx.viewmodel.ext.android.LifecycleOwnerExtKt.getViewModel(notificationSettingsFragment, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.main.notification.ui.NotificationSettingsVM.class), qualifier, function0);
            }
        });
    }

    @Override // org.koin.core.KoinComponent
    public org.koin.core.Koin getKoin() {
        return powerwatch.matrix.com.pwgen2android.shared.logger.Loggable.DefaultImpls.getKoin(this);
    }

    private final powerwatch.matrix.com.pwgen2android.main.notification.ui.NotificationSettingsVM getNotificationSettingsVM() {
        return (powerwatch.matrix.com.pwgen2android.main.notification.ui.NotificationSettingsVM) this.notificationSettingsVM.getValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseFragment
    public powerwatch.matrix.com.pwgen2android.main.notification.ui.NotificationSettingsVM getViewModel() {
        return getNotificationSettingsVM();
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseFragment, androidx.fragment.app.Fragment
    public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inflater, "inflater");
        android.view.View viewOnCreateView = super.onCreateView(inflater, container, savedInstanceState);
        android.os.Bundle arguments = getArguments();
        getViewModel().onCreate(arguments == null ? null : arguments.getString(DEVICE_KEY));
        android.view.View rootView = getRootView();
        powerwatch.matrix.com.pwgen2android.shared.ui.MainToolbar mainToolbar = rootView != null ? (powerwatch.matrix.com.pwgen2android.shared.ui.MainToolbar) rootView.findViewById(powerwatch.matrix.com.pwgen2android.R.id.main_toolbar) : null;
        if (mainToolbar != null) {
            java.lang.String string = getString(powerwatch.matrix.com.pwgen2android.R.string.button_save);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.button_save)");
            powerwatch.matrix.com.pwgen2android.shared.extensions.ToolbarViewExtensionsKt.rightButtonText(mainToolbar, string);
        }
        java.lang.String string2 = getString(powerwatch.matrix.com.pwgen2android.R.string.notification_settings);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.notification_settings)");
        if (mainToolbar != null) {
            powerwatch.matrix.com.pwgen2android.shared.extensions.ToolbarViewExtensionsKt.title(mainToolbar, string2);
        }
        if (mainToolbar != null) {
            powerwatch.matrix.com.pwgen2android.shared.extensions.ToolbarViewExtensionsKt.backButtonClickListener(mainToolbar, new android.view.View.OnClickListener() { // from class: powerwatch.matrix.com.pwgen2android.main.notification.ui.-$$Lambda$NotificationSettingsFragment$gyJHH8bBn8cBGi5QkoUqeR9gdAw
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    powerwatch.matrix.com.pwgen2android.main.notification.ui.NotificationSettingsFragment.m1896onCreateView$lambda0(this.f$0, view);
                }
            });
        }
        if (mainToolbar != null) {
            powerwatch.matrix.com.pwgen2android.shared.extensions.ToolbarViewExtensionsKt.rightButtonClickListener(mainToolbar, new android.view.View.OnClickListener() { // from class: powerwatch.matrix.com.pwgen2android.main.notification.ui.-$$Lambda$NotificationSettingsFragment$Q_PZf57LkvEgyz1KLNiCHYVuHYo
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    powerwatch.matrix.com.pwgen2android.main.notification.ui.NotificationSettingsFragment.m1897onCreateView$lambda1(this.f$0, view);
                }
            });
        }
        return viewOnCreateView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreateView$lambda-0, reason: not valid java name */
    public static final void m1896onCreateView$lambda0(powerwatch.matrix.com.pwgen2android.main.notification.ui.NotificationSettingsFragment this$0, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getNotificationSettingsVM().onBackClicked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreateView$lambda-1, reason: not valid java name */
    public static final void m1897onCreateView$lambda1(powerwatch.matrix.com.pwgen2android.main.notification.ui.NotificationSettingsFragment this$0, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getNotificationSettingsVM().onSaveClicked();
    }

    /* JADX INFO: compiled from: NotificationSettingsFragment.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/notification/ui/NotificationSettingsFragment$Companion;", "", "()V", "DEVICE_KEY", "", "newInstance", "Lpowerwatch/matrix/com/pwgen2android/main/notification/ui/NotificationSettingsFragment;", "pairedDeviceId", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final powerwatch.matrix.com.pwgen2android.main.notification.ui.NotificationSettingsFragment newInstance(java.lang.String pairedDeviceId) {
            powerwatch.matrix.com.pwgen2android.main.notification.ui.NotificationSettingsFragment notificationSettingsFragment = new powerwatch.matrix.com.pwgen2android.main.notification.ui.NotificationSettingsFragment();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString(powerwatch.matrix.com.pwgen2android.main.notification.ui.NotificationSettingsFragment.DEVICE_KEY, pairedDeviceId);
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            notificationSettingsFragment.setArguments(bundle);
            return notificationSettingsFragment;
        }
    }
}
