package powerwatch.matrix.com.pwgen2android.databinding;

/* JADX INFO: loaded from: classes2.dex */
public abstract class FragmentEditUserActivityBinding extends androidx.databinding.ViewDataBinding {
    public final powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView activityTypeTitle;
    public final powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableEditText locationEditText;
    public final powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView locationTitle;

    @androidx.databinding.Bindable
    protected powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.EditUserActivityViewModel mViewModel;
    public final android.widget.LinearLayout mainView;

    public abstract void setViewModel(powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.EditUserActivityViewModel viewModel);

    protected FragmentEditUserActivityBinding(java.lang.Object _bindingComponent, android.view.View _root, int _localFieldCount, powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView activityTypeTitle, powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableEditText locationEditText, powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView locationTitle, android.widget.LinearLayout mainView) {
        super(_bindingComponent, _root, _localFieldCount);
        this.activityTypeTitle = activityTypeTitle;
        this.locationEditText = locationEditText;
        this.locationTitle = locationTitle;
        this.mainView = mainView;
    }

    public powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.EditUserActivityViewModel getViewModel() {
        return this.mViewModel;
    }

    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentEditUserActivityBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, androidx.databinding.DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentEditUserActivityBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot, java.lang.Object component) {
        return (powerwatch.matrix.com.pwgen2android.databinding.FragmentEditUserActivityBinding) androidx.databinding.ViewDataBinding.inflateInternal(inflater, powerwatch.matrix.com.pwgen2android.R.layout.fragment_edit_user_activity, root, attachToRoot, component);
    }

    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentEditUserActivityBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, androidx.databinding.DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentEditUserActivityBinding inflate(android.view.LayoutInflater inflater, java.lang.Object component) {
        return (powerwatch.matrix.com.pwgen2android.databinding.FragmentEditUserActivityBinding) androidx.databinding.ViewDataBinding.inflateInternal(inflater, powerwatch.matrix.com.pwgen2android.R.layout.fragment_edit_user_activity, null, false, component);
    }

    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentEditUserActivityBinding bind(android.view.View view) {
        return bind(view, androidx.databinding.DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentEditUserActivityBinding bind(android.view.View view, java.lang.Object component) {
        return (powerwatch.matrix.com.pwgen2android.databinding.FragmentEditUserActivityBinding) bind(component, view, powerwatch.matrix.com.pwgen2android.R.layout.fragment_edit_user_activity);
    }
}
