package powerwatch.matrix.com.pwgen2android.shared;

/* JADX INFO: compiled from: BaseFragment.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u00020\u0005B\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u001c\u001a\u00020\u001dH$J\r\u0010\u001e\u001a\u00028\u0001H$¢\u0006\u0002\u0010\u001fJ\b\u0010 \u001a\u00020\u001dH%J\u0010\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0016J&\u0010%\u001a\u0004\u0018\u00010\u00112\u0006\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010)2\b\u0010*\u001a\u0004\u0018\u00010+H\u0016J\b\u0010,\u001a\u00020\"H\u0016J\b\u0010-\u001a\u00020\"H\u0016J\b\u0010.\u001a\u00020\"H\u0016J\b\u0010/\u001a\u00020\"H\u0016J\b\u00100\u001a\u00020\"H\u0016J\b\u00101\u001a\u00020\"H\u0016J\b\u00102\u001a\u00020\"H\u0016J\u001a\u00103\u001a\u00020\"2\u0006\u00104\u001a\u00020\u00112\b\u0010*\u001a\u0004\u0018\u00010+H\u0016R\"\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\b@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\rX\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0016\u001a\u00028\u0000X\u0084.¢\u0006\u0010\n\u0002\u0010\u001b\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u00065"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;", "T", "Landroidx/databinding/ViewDataBinding;", "VM", "Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;", "Landroidx/fragment/app/Fragment;", "()V", "<set-?>", "Landroidx/appcompat/app/AppCompatActivity;", "baseActivity", "getBaseActivity", "()Landroidx/appcompat/app/AppCompatActivity;", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "getCompositeDisposable", "()Lio/reactivex/disposables/CompositeDisposable;", "rootView", "Landroid/view/View;", "getRootView", "()Landroid/view/View;", "setRootView", "(Landroid/view/View;)V", "viewDataBinding", "getViewDataBinding", "()Landroidx/databinding/ViewDataBinding;", "setViewDataBinding", "(Landroidx/databinding/ViewDataBinding;)V", "Landroidx/databinding/ViewDataBinding;", "getBindingVariable", "", "getViewModel", "()Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;", "layoutRes", "onAttach", "", "context", "Landroid/content/Context;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onDestroyView", "onDetach", "onPause", "onResume", "onStart", "onStop", "onViewCreated", "view", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public abstract class BaseFragment<T extends androidx.databinding.ViewDataBinding, VM extends powerwatch.matrix.com.pwgen2android.shared.BaseViewModel> extends androidx.fragment.app.Fragment {
    private androidx.appcompat.app.AppCompatActivity baseActivity;
    private final io.reactivex.disposables.CompositeDisposable compositeDisposable = new io.reactivex.disposables.CompositeDisposable();
    private android.view.View rootView;
    protected T viewDataBinding;

    public void _$_clearFindViewByIdCache() {
    }

    protected abstract int getBindingVariable();

    protected abstract VM getViewModel();

    protected abstract int layoutRes();

    protected final io.reactivex.disposables.CompositeDisposable getCompositeDisposable() {
        return this.compositeDisposable;
    }

    public final androidx.appcompat.app.AppCompatActivity getBaseActivity() {
        return this.baseActivity;
    }

    protected final android.view.View getRootView() {
        return this.rootView;
    }

    protected final void setRootView(android.view.View view) {
        this.rootView = view;
    }

    protected final T getViewDataBinding() {
        T t = this.viewDataBinding;
        if (t != null) {
            return t;
        }
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("viewDataBinding");
        throw null;
    }

    protected final void setViewDataBinding(T t) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t, "<set-?>");
        this.viewDataBinding = t;
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inflater, "inflater");
        androidx.databinding.ViewDataBinding viewDataBindingInflate = androidx.databinding.DataBindingUtil.inflate(inflater, layoutRes(), container, false);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "inflate(inflater, layoutRes(), container, false)");
        setViewDataBinding(viewDataBindingInflate);
        android.view.View root = getViewDataBinding().getRoot();
        this.rootView = root;
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(android.view.View view, android.os.Bundle savedInstanceState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        getViewDataBinding().setVariable(getBindingVariable(), getViewModel());
        getViewDataBinding().executePendingBindings();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        this.baseActivity = (androidx.appcompat.app.AppCompatActivity) context;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        this.baseActivity = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        android.content.Context context = getContext();
        if (context != null) {
            getViewModel().onResume(context);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        android.content.Context context = getContext();
        if (context != null) {
            getViewModel().onStart(context);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        android.content.Context context = getContext();
        if (context != null) {
            getViewModel().onStop(context);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        android.content.Context context = getContext();
        if (context != null) {
            getViewModel().onPause(context);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        android.content.Context context = getContext();
        if (context != null) {
            getViewModel().onDestroyView(context);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        android.content.Context context = getContext();
        if (context != null) {
            getViewModel().onDestroy(context);
        }
    }
}
