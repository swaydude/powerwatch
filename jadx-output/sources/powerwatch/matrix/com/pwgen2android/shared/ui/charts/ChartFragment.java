package powerwatch.matrix.com.pwgen2android.shared.ui.charts;

/* JADX INFO: compiled from: ChartFragment.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\b&\u0018\u0000*\n\b\u0000\u0010\u0001 \u0000*\u00020\u00022\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J\u001d\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\tH$¢\u0006\u0002\u0010\nJ\u0012\u0010\u000b\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\fH&¨\u0006\r"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartFragment;", "CHART_CONFIG", "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BaseChartConfig;", "Landroidx/fragment/app/Fragment;", "()V", "init", "", "config", "rootView", "Landroid/view/View;", "(Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BaseChartConfig;Landroid/view/View;)V", "setConfig", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public abstract class ChartFragment<CHART_CONFIG extends powerwatch.matrix.com.pwgen2android.shared.ui.charts.BaseChartConfig> extends androidx.fragment.app.Fragment {
    public void _$_clearFindViewByIdCache() {
    }

    protected abstract void init(CHART_CONFIG config, android.view.View rootView);

    public abstract void setConfig(java.lang.Object config);
}
