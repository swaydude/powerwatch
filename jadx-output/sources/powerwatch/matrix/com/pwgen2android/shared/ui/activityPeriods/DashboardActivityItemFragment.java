package powerwatch.matrix.com.pwgen2android.shared.ui.activityPeriods;

/* JADX INFO: compiled from: DashboardActivityItemFragment.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\f\b\u0000\u0010\u0001*\u0006\u0012\u0002\b\u00030\u0002*\f\b\u0001\u0010\u0003*\u0006\u0012\u0002\b\u00030\u00042\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u0002H\u00030\u0005B\u0005¢\u0006\u0002\u0010\u0007J*\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0018\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u000e0\rH\u0002J \u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\b\u0010\u0016\u001a\u00020\u0013H\u0014J\r\u0010\u0017\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0018J\b\u0010\u0019\u001a\u00020\u0013H\u0014J&\u0010\u001a\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J \u0010!\u001a\u00020\t2\u0018\u0010\"\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u000e0\r¨\u0006#"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/ui/activityPeriods/DashboardActivityItemFragment;", "CHART", "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartFragment;", "ViewModel", "Lpowerwatch/matrix/com/pwgen2android/shared/ui/activityPeriods/BaseDashboardActivityPeriodItemViewModel;", "Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;", "Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentActivityPeriodItemBinding;", "()V", "fillHeader", "", "header", "Landroid/widget/LinearLayout;", "values", "", "Lkotlin/Pair;", "", "fillValue", "value", "viewID", "", "rootView", "Landroid/view/View;", "getBindingVariable", "getChartInstance", "()Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartFragment;", "layoutRes", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "setHeaderValues", "headerValues", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public abstract class DashboardActivityItemFragment<CHART extends powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartFragment<?>, ViewModel extends powerwatch.matrix.com.pwgen2android.shared.ui.activityPeriods.BaseDashboardActivityPeriodItemViewModel<?>> extends powerwatch.matrix.com.pwgen2android.shared.BaseFragment<powerwatch.matrix.com.pwgen2android.databinding.FragmentActivityPeriodItemBinding, ViewModel> {
    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseFragment
    public void _$_clearFindViewByIdCache() {
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseFragment
    protected int getBindingVariable() {
        return 1;
    }

    public abstract CHART getChartInstance();

    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseFragment
    protected int layoutRes() {
        return powerwatch.matrix.com.pwgen2android.R.layout.fragment_activity_period_item;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ powerwatch.matrix.com.pwgen2android.shared.ui.activityPeriods.BaseDashboardActivityPeriodItemViewModel access$getViewModel(powerwatch.matrix.com.pwgen2android.shared.ui.activityPeriods.DashboardActivityItemFragment dashboardActivityItemFragment) {
        return (powerwatch.matrix.com.pwgen2android.shared.ui.activityPeriods.BaseDashboardActivityPeriodItemViewModel) dashboardActivityItemFragment.getViewModel();
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseFragment, androidx.fragment.app.Fragment
    public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inflater, "inflater");
        android.view.View viewOnCreateView = super.onCreateView(inflater, container, savedInstanceState);
        kotlin.jvm.internal.Intrinsics.checkNotNull(viewOnCreateView);
        if (getChildFragmentManager().findFragmentById(powerwatch.matrix.com.pwgen2android.R.id.chart_fragment_container) == null) {
            final powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartFragment chartInstance = getChartInstance();
            getChildFragmentManager().beginTransaction().add(powerwatch.matrix.com.pwgen2android.R.id.chart_fragment_container, chartInstance).commitAllowingStateLoss();
            getViewModel().getConfiguration().addOnPropertyChangedCallback(new androidx.databinding.Observable.OnPropertyChangedCallback(this) { // from class: powerwatch.matrix.com.pwgen2android.shared.ui.activityPeriods.DashboardActivityItemFragment.onCreateView.1
                final /* synthetic */ powerwatch.matrix.com.pwgen2android.shared.ui.activityPeriods.DashboardActivityItemFragment<CHART, ViewModel> this$0;

                {
                    this.this$0 = this;
                }

                @Override // androidx.databinding.Observable.OnPropertyChangedCallback
                public void onPropertyChanged(androidx.databinding.Observable sender, int propertyId) {
                    powerwatch.matrix.com.pwgen2android.shared.ui.charts.BaseChartConfig baseChartConfig = (powerwatch.matrix.com.pwgen2android.shared.ui.charts.BaseChartConfig) powerwatch.matrix.com.pwgen2android.shared.ui.activityPeriods.DashboardActivityItemFragment.access$getViewModel(this.this$0).getConfiguration().get();
                    if (baseChartConfig != null) {
                        this.this$0.setHeaderValues(baseChartConfig.getHeaderValues());
                        chartInstance.setConfig(baseChartConfig);
                    }
                }
            });
        } else {
            powerwatch.matrix.com.pwgen2android.shared.ui.charts.BaseChartConfig baseChartConfig = (powerwatch.matrix.com.pwgen2android.shared.ui.charts.BaseChartConfig) getViewModel().getConfiguration().get();
            if (baseChartConfig != null) {
                setHeaderValues(baseChartConfig.getHeaderValues());
            }
        }
        ViewModel viewModel = getViewModel();
        android.content.Context context = getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNull(context);
        viewModel.onCreateView(context);
        return viewOnCreateView;
    }

    private final void fillValue(java.lang.String value, int viewID, android.view.View rootView) {
        android.widget.TextView textView = (android.widget.TextView) rootView.findViewById(viewID);
        textView.setText(value);
        textView.setVisibility(0);
    }

    private final void fillHeader(android.widget.LinearLayout header, java.util.List<kotlin.Pair<java.lang.String, java.lang.String>> values) {
        int i = 0;
        for (java.lang.Object obj : values) {
            int i2 = i + 1;
            if (i < 0) {
                kotlin.collections.CollectionsKt.throwIndexOverflow();
            }
            kotlin.Pair pair = (kotlin.Pair) obj;
            if (i == 0) {
                android.widget.LinearLayout linearLayout = header;
                fillValue((java.lang.String) pair.getFirst(), powerwatch.matrix.com.pwgen2android.R.id.first_header_value_title, linearLayout);
                fillValue((java.lang.String) pair.getSecond(), powerwatch.matrix.com.pwgen2android.R.id.first_header_value_text, linearLayout);
            } else if (i == 1) {
                android.widget.LinearLayout linearLayout2 = header;
                fillValue((java.lang.String) pair.getFirst(), powerwatch.matrix.com.pwgen2android.R.id.second_header_value_title, linearLayout2);
                fillValue((java.lang.String) pair.getSecond(), powerwatch.matrix.com.pwgen2android.R.id.second_header_value_text, linearLayout2);
            } else if (i == 2) {
                android.widget.LinearLayout linearLayout3 = header;
                fillValue((java.lang.String) pair.getFirst(), powerwatch.matrix.com.pwgen2android.R.id.third_header_value_title, linearLayout3);
                fillValue((java.lang.String) pair.getSecond(), powerwatch.matrix.com.pwgen2android.R.id.third_header_value_text, linearLayout3);
            } else if (i == 3) {
                android.widget.LinearLayout linearLayout4 = header;
                fillValue((java.lang.String) pair.getFirst(), powerwatch.matrix.com.pwgen2android.R.id.fourth_header_value_title, linearLayout4);
                fillValue((java.lang.String) pair.getSecond(), powerwatch.matrix.com.pwgen2android.R.id.fourth_header_value_text, linearLayout4);
            }
            i = i2;
        }
    }

    public final void setHeaderValues(java.util.List<kotlin.Pair<java.lang.String, java.lang.String>> headerValues) {
        android.widget.LinearLayout linearLayout;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headerValues, "headerValues");
        android.view.View rootView = getRootView();
        if (rootView == null || (linearLayout = (android.widget.LinearLayout) rootView.findViewById(powerwatch.matrix.com.pwgen2android.R.id.header_layout)) == null) {
            return;
        }
        fillHeader(linearLayout, headerValues);
    }
}
