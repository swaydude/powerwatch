package powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent;

/* JADX INFO: compiled from: UserActivityDetailsFragment.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u00020\u0006H\u0014J\b\u0010\f\u001a\u00020\rH\u0014J\b\u0010\u000e\u001a\u00020\u000fH\u0014J&\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\u001b"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/UserActivityDetailsFragment;", "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/BaseUserActivityFragment;", "()V", "activityID", "", "userActivityViewModel", "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/UserActivityViewModel;", "getUserActivityViewModel", "()Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/UserActivityViewModel;", "userActivityViewModel$delegate", "Lkotlin/Lazy;", "getViewModel", "isMainScreen", "", "layoutRes", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "", "Companion", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public class UserActivityDetailsFragment extends powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.BaseUserActivityFragment {
    public static final java.lang.String ACTIVITY_ID = "activityId";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.UserActivityDetailsFragment.Companion INSTANCE = new powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.UserActivityDetailsFragment.Companion(null);
    private java.lang.String activityID;

    /* JADX INFO: renamed from: userActivityViewModel$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy userActivityViewModel;

    @Override // powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.BaseUserActivityFragment, powerwatch.matrix.com.pwgen2android.shared.BaseFragment
    public void _$_clearFindViewByIdCache() {
    }

    @Override // powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.BaseUserActivityFragment
    protected boolean isMainScreen() {
        return false;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseFragment
    protected int layoutRes() {
        return powerwatch.matrix.com.pwgen2android.R.layout.fragment_user_activity;
    }

    public UserActivityDetailsFragment() {
        final powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.UserActivityDetailsFragment userActivityDetailsFragment = this;
        final kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function0 = new kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters>() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.UserActivityDetailsFragment$userActivityViewModel$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final org.koin.core.parameter.DefinitionParameters invoke() {
                return org.koin.core.parameter.DefinitionParametersKt.parametersOf(this.this$0.getActivity(), this.this$0.getFragmentManager());
            }
        };
        final org.koin.core.qualifier.Qualifier qualifier = (org.koin.core.qualifier.Qualifier) null;
        this.userActivityViewModel = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.UserActivityViewModel>() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.UserActivityDetailsFragment$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.UserActivityViewModel] */
            @Override // kotlin.jvm.functions.Function0
            public final powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.UserActivityViewModel invoke() {
                return org.koin.androidx.viewmodel.ext.android.LifecycleOwnerExtKt.getViewModel(userActivityDetailsFragment, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.UserActivityViewModel.class), qualifier, function0);
            }
        });
    }

    private final powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.UserActivityViewModel getUserActivityViewModel() {
        return (powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.UserActivityViewModel) this.userActivityViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseFragment
    public powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.UserActivityViewModel getViewModel() {
        return getUserActivityViewModel();
    }

    @Override // powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.BaseUserActivityFragment, powerwatch.matrix.com.pwgen2android.shared.BaseFragment, androidx.fragment.app.Fragment
    public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inflater, "inflater");
        android.view.View viewOnCreateView = super.onCreateView(inflater, container, savedInstanceState);
        android.os.Bundle arguments = getArguments();
        java.lang.String string = arguments == null ? null : arguments.getString(ACTIVITY_ID);
        if (string == null) {
            throw new java.lang.IllegalArgumentException("Activity ID must be provided.");
        }
        this.activityID = string;
        powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.UserActivityViewModel userActivityViewModel = getUserActivityViewModel();
        java.lang.String str = this.activityID;
        if (str == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("activityID");
            throw null;
        }
        android.content.Context context = getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNull(context);
        userActivityViewModel.loadActivitySession(str, context);
        android.widget.ImageView imageView = viewOnCreateView != null ? (android.widget.ImageView) viewOnCreateView.findViewById(powerwatch.matrix.com.pwgen2android.R.id.share_button) : null;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        if (imageView != null) {
            imageView.setOnClickListener(new android.view.View.OnClickListener() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.-$$Lambda$UserActivityDetailsFragment$hBBgWsEqptqk0xnLMLAccl5zQys
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.UserActivityDetailsFragment.m1855onCreateView$lambda0(this.f$0, view);
                }
            });
        }
        return viewOnCreateView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreateView$lambda-0, reason: not valid java name */
    public static final void m1855onCreateView$lambda0(powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.UserActivityDetailsFragment this$0, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getUserActivityViewModel().onShareButtonClicked();
    }

    @Override // powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.BaseUserActivityFragment, powerwatch.matrix.com.pwgen2android.shared.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        android.view.View rootView = getRootView();
        android.widget.ImageView imageView = rootView == null ? null : (android.widget.ImageView) rootView.findViewById(powerwatch.matrix.com.pwgen2android.R.id.share_button);
        if (imageView == null) {
            return;
        }
        imageView.setVisibility(8);
    }

    /* JADX INFO: compiled from: UserActivityDetailsFragment.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/UserActivityDetailsFragment$Companion;", "", "()V", "ACTIVITY_ID", "", "newInstance", "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/UserActivityDetailsFragment;", powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.UserActivityDetailsFragment.ACTIVITY_ID, "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.UserActivityDetailsFragment newInstance(java.lang.String activityId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityId, "activityId");
            powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.UserActivityDetailsFragment userActivityDetailsFragment = new powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.UserActivityDetailsFragment();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString(powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.UserActivityDetailsFragment.ACTIVITY_ID, activityId);
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            userActivityDetailsFragment.setArguments(bundle);
            return userActivityDetailsFragment;
        }
    }
}
