package powerwatch.matrix.com.pwgen2android.databinding;

/* JADX INFO: loaded from: classes2.dex */
public abstract class FragmentActivityPeriodItemBinding extends androidx.databinding.ViewDataBinding {
    public final android.widget.FrameLayout chartFragmentContainer;
    public final powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView firstHeaderValueText;
    public final powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView firstHeaderValueTitle;
    public final powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView fourthHeaderValueText;
    public final powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView fourthHeaderValueTitle;
    public final android.widget.LinearLayout headerLayout;

    @androidx.databinding.Bindable
    protected powerwatch.matrix.com.pwgen2android.shared.ui.activityPeriods.BaseDashboardActivityPeriodItemViewModel mViewModel;
    public final powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView secondHeaderValueText;
    public final powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView secondHeaderValueTitle;
    public final powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView thirdHeaderValueText;
    public final powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView thirdHeaderValueTitle;

    public abstract void setViewModel(powerwatch.matrix.com.pwgen2android.shared.ui.activityPeriods.BaseDashboardActivityPeriodItemViewModel viewModel);

    protected FragmentActivityPeriodItemBinding(java.lang.Object _bindingComponent, android.view.View _root, int _localFieldCount, android.widget.FrameLayout chartFragmentContainer, powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView firstHeaderValueText, powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView firstHeaderValueTitle, powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView fourthHeaderValueText, powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView fourthHeaderValueTitle, android.widget.LinearLayout headerLayout, powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView secondHeaderValueText, powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView secondHeaderValueTitle, powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView thirdHeaderValueText, powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView thirdHeaderValueTitle) {
        super(_bindingComponent, _root, _localFieldCount);
        this.chartFragmentContainer = chartFragmentContainer;
        this.firstHeaderValueText = firstHeaderValueText;
        this.firstHeaderValueTitle = firstHeaderValueTitle;
        this.fourthHeaderValueText = fourthHeaderValueText;
        this.fourthHeaderValueTitle = fourthHeaderValueTitle;
        this.headerLayout = headerLayout;
        this.secondHeaderValueText = secondHeaderValueText;
        this.secondHeaderValueTitle = secondHeaderValueTitle;
        this.thirdHeaderValueText = thirdHeaderValueText;
        this.thirdHeaderValueTitle = thirdHeaderValueTitle;
    }

    public powerwatch.matrix.com.pwgen2android.shared.ui.activityPeriods.BaseDashboardActivityPeriodItemViewModel getViewModel() {
        return this.mViewModel;
    }

    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentActivityPeriodItemBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, androidx.databinding.DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentActivityPeriodItemBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot, java.lang.Object component) {
        return (powerwatch.matrix.com.pwgen2android.databinding.FragmentActivityPeriodItemBinding) androidx.databinding.ViewDataBinding.inflateInternal(inflater, powerwatch.matrix.com.pwgen2android.R.layout.fragment_activity_period_item, root, attachToRoot, component);
    }

    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentActivityPeriodItemBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, androidx.databinding.DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentActivityPeriodItemBinding inflate(android.view.LayoutInflater inflater, java.lang.Object component) {
        return (powerwatch.matrix.com.pwgen2android.databinding.FragmentActivityPeriodItemBinding) androidx.databinding.ViewDataBinding.inflateInternal(inflater, powerwatch.matrix.com.pwgen2android.R.layout.fragment_activity_period_item, null, false, component);
    }

    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentActivityPeriodItemBinding bind(android.view.View view) {
        return bind(view, androidx.databinding.DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentActivityPeriodItemBinding bind(android.view.View view, java.lang.Object component) {
        return (powerwatch.matrix.com.pwgen2android.databinding.FragmentActivityPeriodItemBinding) bind(component, view, powerwatch.matrix.com.pwgen2android.R.layout.fragment_activity_period_item);
    }
}
