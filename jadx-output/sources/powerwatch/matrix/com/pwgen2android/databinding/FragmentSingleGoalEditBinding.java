package powerwatch.matrix.com.pwgen2android.databinding;

/* JADX INFO: loaded from: classes2.dex */
public abstract class FragmentSingleGoalEditBinding extends androidx.databinding.ViewDataBinding {
    public final powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableEditText goalValueEditText;

    @androidx.databinding.Bindable
    protected powerwatch.matrix.com.pwgen2android.setup.goals.SingleGoalEditViewModel mViewModel;
    public final android.widget.FrameLayout mainView;

    public abstract void setViewModel(powerwatch.matrix.com.pwgen2android.setup.goals.SingleGoalEditViewModel viewModel);

    protected FragmentSingleGoalEditBinding(java.lang.Object _bindingComponent, android.view.View _root, int _localFieldCount, powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableEditText goalValueEditText, android.widget.FrameLayout mainView) {
        super(_bindingComponent, _root, _localFieldCount);
        this.goalValueEditText = goalValueEditText;
        this.mainView = mainView;
    }

    public powerwatch.matrix.com.pwgen2android.setup.goals.SingleGoalEditViewModel getViewModel() {
        return this.mViewModel;
    }

    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentSingleGoalEditBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, androidx.databinding.DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentSingleGoalEditBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot, java.lang.Object component) {
        return (powerwatch.matrix.com.pwgen2android.databinding.FragmentSingleGoalEditBinding) androidx.databinding.ViewDataBinding.inflateInternal(inflater, powerwatch.matrix.com.pwgen2android.R.layout.fragment_single_goal_edit, root, attachToRoot, component);
    }

    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentSingleGoalEditBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, androidx.databinding.DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentSingleGoalEditBinding inflate(android.view.LayoutInflater inflater, java.lang.Object component) {
        return (powerwatch.matrix.com.pwgen2android.databinding.FragmentSingleGoalEditBinding) androidx.databinding.ViewDataBinding.inflateInternal(inflater, powerwatch.matrix.com.pwgen2android.R.layout.fragment_single_goal_edit, null, false, component);
    }

    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentSingleGoalEditBinding bind(android.view.View view) {
        return bind(view, androidx.databinding.DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentSingleGoalEditBinding bind(android.view.View view, java.lang.Object component) {
        return (powerwatch.matrix.com.pwgen2android.databinding.FragmentSingleGoalEditBinding) bind(component, view, powerwatch.matrix.com.pwgen2android.R.layout.fragment_single_goal_edit);
    }
}
