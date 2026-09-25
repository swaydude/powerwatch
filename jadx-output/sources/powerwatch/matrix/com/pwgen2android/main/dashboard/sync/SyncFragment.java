package powerwatch.matrix.com.pwgen2android.main.dashboard.sync;

/* JADX INFO: compiled from: SyncFragment.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u000e2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000eB\u0005¢\u0006\u0002\u0010\u0004J\b\u0010\n\u001a\u00020\u000bH\u0014J\b\u0010\f\u001a\u00020\u0003H\u0014J\b\u0010\r\u001a\u00020\u000bH\u0014R\u001b\u0010\u0005\u001a\u00020\u00038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/dashboard/sync/SyncFragment;", "Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;", "Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSyncBinding;", "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/sync/SyncViewModel;", "()V", "syncViewModel", "getSyncViewModel", "()Lpowerwatch/matrix/com/pwgen2android/main/dashboard/sync/SyncViewModel;", "syncViewModel$delegate", "Lkotlin/Lazy;", "getBindingVariable", "", "getViewModel", "layoutRes", "Companion", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class SyncFragment extends powerwatch.matrix.com.pwgen2android.shared.BaseFragment<powerwatch.matrix.com.pwgen2android.databinding.FragmentSyncBinding, powerwatch.matrix.com.pwgen2android.main.dashboard.sync.SyncViewModel> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final powerwatch.matrix.com.pwgen2android.main.dashboard.sync.SyncFragment.Companion INSTANCE = new powerwatch.matrix.com.pwgen2android.main.dashboard.sync.SyncFragment.Companion(null);

    /* JADX INFO: renamed from: syncViewModel$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy syncViewModel = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.NONE, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<powerwatch.matrix.com.pwgen2android.main.dashboard.sync.SyncViewModel>() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.sync.SyncFragment$syncViewModel$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final powerwatch.matrix.com.pwgen2android.main.dashboard.sync.SyncViewModel invoke() {
            androidx.fragment.app.Fragment parentFragment = this.this$0.getParentFragment();
            kotlin.jvm.internal.Intrinsics.checkNotNull(parentFragment);
            androidx.lifecycle.ViewModel viewModel = androidx.lifecycle.ViewModelProviders.of(parentFragment).get(powerwatch.matrix.com.pwgen2android.main.dashboard.sync.SyncViewModel.class);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(viewModel, "of(parentFragment!!).get(SyncViewModel::class.java)");
            return (powerwatch.matrix.com.pwgen2android.main.dashboard.sync.SyncViewModel) viewModel;
        }
    });

    @kotlin.jvm.JvmStatic
    public static final powerwatch.matrix.com.pwgen2android.main.dashboard.sync.SyncFragment newInstance() {
        return INSTANCE.newInstance();
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseFragment
    public void _$_clearFindViewByIdCache() {
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseFragment
    protected int getBindingVariable() {
        return 1;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseFragment
    protected int layoutRes() {
        return powerwatch.matrix.com.pwgen2android.R.layout.fragment_sync;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseFragment
    public powerwatch.matrix.com.pwgen2android.main.dashboard.sync.SyncViewModel getViewModel() {
        return getSyncViewModel();
    }

    private final powerwatch.matrix.com.pwgen2android.main.dashboard.sync.SyncViewModel getSyncViewModel() {
        return (powerwatch.matrix.com.pwgen2android.main.dashboard.sync.SyncViewModel) this.syncViewModel.getValue();
    }

    /* JADX INFO: compiled from: SyncFragment.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/dashboard/sync/SyncFragment$Companion;", "", "()V", "newInstance", "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/sync/SyncFragment;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final powerwatch.matrix.com.pwgen2android.main.dashboard.sync.SyncFragment newInstance() {
            powerwatch.matrix.com.pwgen2android.main.dashboard.sync.SyncFragment syncFragment = new powerwatch.matrix.com.pwgen2android.main.dashboard.sync.SyncFragment();
            android.os.Bundle bundle = new android.os.Bundle();
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            syncFragment.setArguments(bundle);
            return syncFragment;
        }
    }
}
