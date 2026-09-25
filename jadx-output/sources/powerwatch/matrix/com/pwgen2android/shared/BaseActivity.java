package powerwatch.matrix.com.pwgen2android.shared;

/* JADX INFO: compiled from: BaseActivity.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u00020\u0005B\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0013\u001a\u00020\u0014H$J\b\u0010\u0015\u001a\u00020\u0014H%J\r\u0010\u0016\u001a\u00028\u0001H$¢\u0006\u0002\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0012\u0010\u001c\u001a\u00020\u00192\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0014J\b\u0010\u001f\u001a\u00020\u0019H\u0002R\u001a\u0010\u0007\u001a\u00020\bX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\u00028\u0000X\u0084.¢\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006 "}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/BaseActivity;", "DB", "Landroidx/databinding/ViewDataBinding;", "VM", "Lpowerwatch/matrix/com/pwgen2android/shared/BaseActivityViewModel;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "preventBackPress", "", "getPreventBackPress", "()Z", "setPreventBackPress", "(Z)V", "viewDataBinding", "getViewDataBinding", "()Landroidx/databinding/ViewDataBinding;", "setViewDataBinding", "(Landroidx/databinding/ViewDataBinding;)V", "Landroidx/databinding/ViewDataBinding;", "getBindingVariable", "", "getLayoutId", "getViewModel", "()Lpowerwatch/matrix/com/pwgen2android/shared/BaseActivityViewModel;", "onConfigurationChanged", "", "newConfig", "Landroid/content/res/Configuration;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "performDataBinding", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public abstract class BaseActivity<DB extends androidx.databinding.ViewDataBinding, VM extends powerwatch.matrix.com.pwgen2android.shared.BaseActivityViewModel> extends androidx.appcompat.app.AppCompatActivity {
    private boolean preventBackPress;
    protected DB viewDataBinding;

    public void _$_clearFindViewByIdCache() {
    }

    protected abstract int getBindingVariable();

    protected abstract int getLayoutId();

    protected abstract VM getViewModel();

    protected final DB getViewDataBinding() {
        DB db = this.viewDataBinding;
        if (db != null) {
            return db;
        }
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("viewDataBinding");
        throw null;
    }

    protected final void setViewDataBinding(DB db) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(db, "<set-?>");
        this.viewDataBinding = db;
    }

    protected final boolean getPreventBackPress() {
        return this.preventBackPress;
    }

    protected final void setPreventBackPress(boolean z) {
        this.preventBackPress = z;
    }

    private final void performDataBinding() {
        androidx.databinding.ViewDataBinding contentView = androidx.databinding.DataBindingUtil.setContentView(this, getLayoutId());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(contentView, "setContentView(this, getLayoutId())");
        setViewDataBinding(contentView);
        getViewDataBinding().setVariable(getBindingVariable(), getViewModel());
        getViewDataBinding().executePendingBindings();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(android.os.Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        performDataBinding();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration newConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        getViewModel().resetLanguage(this);
    }
}
