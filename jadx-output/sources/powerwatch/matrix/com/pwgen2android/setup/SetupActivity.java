package powerwatch.matrix.com.pwgen2android.setup;

/* JADX INFO: compiled from: SetupActivity.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005¢\u0006\u0002\u0010\u0004J\b\u0010\n\u001a\u00020\u000bH\u0014J\b\u0010\f\u001a\u00020\u000bH\u0014J\b\u0010\r\u001a\u00020\u0003H\u0014J\u0012\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0014J\b\u0010\u0012\u001a\u00020\u000fH\u0014J\u0012\u0010\u0013\u001a\u00020\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0014R\u001b\u0010\u0005\u001a\u00020\u00038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0016"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/setup/SetupActivity;", "Lpowerwatch/matrix/com/pwgen2android/shared/BaseActivity;", "Lpowerwatch/matrix/com/pwgen2android/databinding/ActivitySetupBinding;", "Lpowerwatch/matrix/com/pwgen2android/setup/SetupActivityViewModel;", "()V", "setupActivityViewModel", "getSetupActivityViewModel", "()Lpowerwatch/matrix/com/pwgen2android/setup/SetupActivityViewModel;", "setupActivityViewModel$delegate", "Lkotlin/Lazy;", "getBindingVariable", "", "getLayoutId", "getViewModel", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onNewIntent", "intent", "Landroid/content/Intent;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class SetupActivity extends powerwatch.matrix.com.pwgen2android.shared.BaseActivity<powerwatch.matrix.com.pwgen2android.databinding.ActivitySetupBinding, powerwatch.matrix.com.pwgen2android.setup.SetupActivityViewModel> {

    /* JADX INFO: renamed from: setupActivityViewModel$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy setupActivityViewModel;

    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseActivity
    public void _$_clearFindViewByIdCache() {
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseActivity
    protected int getBindingVariable() {
        return 1;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseActivity
    protected int getLayoutId() {
        return powerwatch.matrix.com.pwgen2android.R.layout.activity_setup;
    }

    public SetupActivity() {
        final powerwatch.matrix.com.pwgen2android.setup.SetupActivity setupActivity = this;
        final kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function0 = new kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters>() { // from class: powerwatch.matrix.com.pwgen2android.setup.SetupActivity$setupActivityViewModel$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final org.koin.core.parameter.DefinitionParameters invoke() {
                powerwatch.matrix.com.pwgen2android.setup.SetupActivity setupActivity2 = this.this$0;
                return org.koin.core.parameter.DefinitionParametersKt.parametersOf(setupActivity2, setupActivity2.getSupportFragmentManager(), this.this$0.getIntent());
            }
        };
        final org.koin.core.qualifier.Qualifier qualifier = (org.koin.core.qualifier.Qualifier) null;
        this.setupActivityViewModel = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<powerwatch.matrix.com.pwgen2android.setup.SetupActivityViewModel>() { // from class: powerwatch.matrix.com.pwgen2android.setup.SetupActivity$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, powerwatch.matrix.com.pwgen2android.setup.SetupActivityViewModel] */
            @Override // kotlin.jvm.functions.Function0
            public final powerwatch.matrix.com.pwgen2android.setup.SetupActivityViewModel invoke() {
                return org.koin.androidx.viewmodel.ext.android.LifecycleOwnerExtKt.getViewModel(setupActivity, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.setup.SetupActivityViewModel.class), qualifier, function0);
            }
        });
    }

    private final powerwatch.matrix.com.pwgen2android.setup.SetupActivityViewModel getSetupActivityViewModel() {
        return (powerwatch.matrix.com.pwgen2android.setup.SetupActivityViewModel) this.setupActivityViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseActivity
    public powerwatch.matrix.com.pwgen2android.setup.SetupActivityViewModel getViewModel() {
        return getSetupActivityViewModel();
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(android.os.Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(powerwatch.matrix.com.pwgen2android.R.layout.activity_setup);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        if (isFinishing()) {
            getIntent().setAction("");
        }
    }
}
