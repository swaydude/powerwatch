package powerwatch.matrix.com.pwgen2android.databinding;

/* JADX INFO: loaded from: classes2.dex */
public abstract class FragmentSetGoalsBinding extends androidx.databinding.ViewDataBinding {
    public final powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableEditText caloriesEditText;
    public final powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView caloriesTitle;
    public final powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableEditText distanceEditText;
    public final powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView distanceTitle;

    @androidx.databinding.Bindable
    protected powerwatch.matrix.com.pwgen2android.setup.goals.SetGoalsViewModel mViewModel;
    public final android.widget.LinearLayout mainView;
    public final powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableEditText sleepEditText;
    public final powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView sleepTitle;
    public final powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableEditText stepsEditText;
    public final powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView stepsTitle;

    public abstract void setViewModel(powerwatch.matrix.com.pwgen2android.setup.goals.SetGoalsViewModel viewModel);

    protected FragmentSetGoalsBinding(java.lang.Object _bindingComponent, android.view.View _root, int _localFieldCount, powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableEditText caloriesEditText, powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView caloriesTitle, powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableEditText distanceEditText, powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView distanceTitle, android.widget.LinearLayout mainView, powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableEditText sleepEditText, powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView sleepTitle, powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableEditText stepsEditText, powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView stepsTitle) {
        super(_bindingComponent, _root, _localFieldCount);
        this.caloriesEditText = caloriesEditText;
        this.caloriesTitle = caloriesTitle;
        this.distanceEditText = distanceEditText;
        this.distanceTitle = distanceTitle;
        this.mainView = mainView;
        this.sleepEditText = sleepEditText;
        this.sleepTitle = sleepTitle;
        this.stepsEditText = stepsEditText;
        this.stepsTitle = stepsTitle;
    }

    public powerwatch.matrix.com.pwgen2android.setup.goals.SetGoalsViewModel getViewModel() {
        return this.mViewModel;
    }

    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentSetGoalsBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, androidx.databinding.DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentSetGoalsBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot, java.lang.Object component) {
        return (powerwatch.matrix.com.pwgen2android.databinding.FragmentSetGoalsBinding) androidx.databinding.ViewDataBinding.inflateInternal(inflater, powerwatch.matrix.com.pwgen2android.R.layout.fragment_set_goals, root, attachToRoot, component);
    }

    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentSetGoalsBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, androidx.databinding.DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentSetGoalsBinding inflate(android.view.LayoutInflater inflater, java.lang.Object component) {
        return (powerwatch.matrix.com.pwgen2android.databinding.FragmentSetGoalsBinding) androidx.databinding.ViewDataBinding.inflateInternal(inflater, powerwatch.matrix.com.pwgen2android.R.layout.fragment_set_goals, null, false, component);
    }

    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentSetGoalsBinding bind(android.view.View view) {
        return bind(view, androidx.databinding.DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentSetGoalsBinding bind(android.view.View view, java.lang.Object component) {
        return (powerwatch.matrix.com.pwgen2android.databinding.FragmentSetGoalsBinding) bind(component, view, powerwatch.matrix.com.pwgen2android.R.layout.fragment_set_goals);
    }
}
