package powerwatch.matrix.com.pwgen2android.main.watch;

/* JADX INFO: compiled from: WatchContainerFragment.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u000e2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000eB\u0005¢\u0006\u0002\u0010\u0004J\b\u0010\n\u001a\u00020\u000bH\u0014J\b\u0010\f\u001a\u00020\u0003H\u0014J\b\u0010\r\u001a\u00020\u000bH\u0014R\u001b\u0010\u0005\u001a\u00020\u00038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/watch/WatchContainerFragment;", "Lpowerwatch/matrix/com/pwgen2android/shared/BaseContainerFragment;", "Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentWatchContainerBinding;", "Lpowerwatch/matrix/com/pwgen2android/main/watch/WatchContainerViewModel;", "()V", "watchContainerViewModel", "getWatchContainerViewModel", "()Lpowerwatch/matrix/com/pwgen2android/main/watch/WatchContainerViewModel;", "watchContainerViewModel$delegate", "Lkotlin/Lazy;", "getBindingVariable", "", "getViewModel", "layoutRes", "Companion", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class WatchContainerFragment extends powerwatch.matrix.com.pwgen2android.shared.BaseContainerFragment<powerwatch.matrix.com.pwgen2android.databinding.FragmentWatchContainerBinding, powerwatch.matrix.com.pwgen2android.main.watch.WatchContainerViewModel> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final powerwatch.matrix.com.pwgen2android.main.watch.WatchContainerFragment.Companion INSTANCE = new powerwatch.matrix.com.pwgen2android.main.watch.WatchContainerFragment.Companion(null);

    /* JADX INFO: renamed from: watchContainerViewModel$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy watchContainerViewModel;

    @kotlin.jvm.JvmStatic
    public static final powerwatch.matrix.com.pwgen2android.main.watch.WatchContainerFragment newInstance() {
        return INSTANCE.newInstance();
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseContainerFragment, powerwatch.matrix.com.pwgen2android.shared.BaseFragment
    public void _$_clearFindViewByIdCache() {
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseFragment
    protected int getBindingVariable() {
        return 1;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseFragment
    protected int layoutRes() {
        return powerwatch.matrix.com.pwgen2android.R.layout.fragment_watch_container;
    }

    public WatchContainerFragment() {
        final powerwatch.matrix.com.pwgen2android.main.watch.WatchContainerFragment watchContainerFragment = this;
        final kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function0 = new kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters>() { // from class: powerwatch.matrix.com.pwgen2android.main.watch.WatchContainerFragment$watchContainerViewModel$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final org.koin.core.parameter.DefinitionParameters invoke() {
                return org.koin.core.parameter.DefinitionParametersKt.parametersOf(this.this$0.getChildFragmentManager());
            }
        };
        final org.koin.core.qualifier.Qualifier qualifier = (org.koin.core.qualifier.Qualifier) null;
        this.watchContainerViewModel = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<powerwatch.matrix.com.pwgen2android.main.watch.WatchContainerViewModel>() { // from class: powerwatch.matrix.com.pwgen2android.main.watch.WatchContainerFragment$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, powerwatch.matrix.com.pwgen2android.main.watch.WatchContainerViewModel] */
            @Override // kotlin.jvm.functions.Function0
            public final powerwatch.matrix.com.pwgen2android.main.watch.WatchContainerViewModel invoke() {
                return org.koin.androidx.viewmodel.ext.android.LifecycleOwnerExtKt.getViewModel(watchContainerFragment, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.main.watch.WatchContainerViewModel.class), qualifier, function0);
            }
        });
    }

    private final powerwatch.matrix.com.pwgen2android.main.watch.WatchContainerViewModel getWatchContainerViewModel() {
        return (powerwatch.matrix.com.pwgen2android.main.watch.WatchContainerViewModel) this.watchContainerViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseFragment
    public powerwatch.matrix.com.pwgen2android.main.watch.WatchContainerViewModel getViewModel() {
        return getWatchContainerViewModel();
    }

    /* JADX INFO: compiled from: WatchContainerFragment.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/watch/WatchContainerFragment$Companion;", "", "()V", "newInstance", "Lpowerwatch/matrix/com/pwgen2android/main/watch/WatchContainerFragment;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final powerwatch.matrix.com.pwgen2android.main.watch.WatchContainerFragment newInstance() {
            return new powerwatch.matrix.com.pwgen2android.main.watch.WatchContainerFragment();
        }
    }
}
