package powerwatch.matrix.com.pwgen2android.shared.ui;

/* JADX INFO: compiled from: bindingAdapters.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000H\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0007\u001a\u0018\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0005H\u0007\u001a\u0018\u0010\b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0005H\u0007\u001a\u001e\u0010\n\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0007\u001a\u001e\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00112\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00120\rH\u0007\u001a\u0018\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0005H\u0007\u001a\u0018\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0007\u001a\u00020\u0005H\u0007\u001a\u0018\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0007¨\u0006\u001c"}, d2 = {"centerHorizontalInRelative", "", "view", "Landroid/view/View;", "centered", "", "enabledIf", "enabled", "goneUnless", "visible", "setLineData", "Lcom/github/mikephil/charting/charts/LineChart;", "data", "", "Lcom/github/mikephil/charting/data/LineDataSet;", "setSplitsData", "splitsView", "Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/SplitsLayoutContainer;", "Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/SplitItemView;", "showWithTimer", "swipeEnabled", "swipeRefreshLayout", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;", "wheelValue", "wheelPicker", "Lcom/super_rabbit/wheel_picker/WheelPicker;", "value", "", "app_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
public final class BindingAdaptersKt {
    @androidx.databinding.BindingAdapter({"app:wheelValue"})
    public static final void wheelValue(com.super_rabbit.wheel_picker.WheelPicker wheelPicker, java.lang.String value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(wheelPicker, "wheelPicker");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
    }

    @androidx.databinding.BindingAdapter({"android:splits"})
    public static final void setSplitsData(powerwatch.matrix.com.pwgen2android.shared.ui.views.SplitsLayoutContainer splitsView, java.util.List<powerwatch.matrix.com.pwgen2android.shared.ui.views.SplitItemView> data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(splitsView, "splitsView");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "data");
        splitsView.removeAllViews();
        for (powerwatch.matrix.com.pwgen2android.shared.ui.views.SplitItemView splitItemView : data) {
            android.view.View viewInflate = android.view.LayoutInflater.from(splitsView.getContext()).inflate(powerwatch.matrix.com.pwgen2android.R.layout.split_item_view, (android.view.ViewGroup) splitsView, false);
            ((powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView) viewInflate.findViewById(powerwatch.matrix.com.pwgen2android.R.id.split_title)).setText(splitItemView.getDistance());
            ((powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView) viewInflate.findViewById(powerwatch.matrix.com.pwgen2android.R.id.split_value)).setText(splitItemView.getDuration());
            splitsView.addView(viewInflate);
        }
    }

    @androidx.databinding.BindingAdapter({"android:setLineData"})
    public static final void setLineData(com.github.mikephil.charting.charts.LineChart view, java.util.List<? extends com.github.mikephil.charting.data.LineDataSet> data) {
        boolean z;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "data");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = data.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            if (((com.github.mikephil.charting.data.LineDataSet) next).getEntryCount() > 0) {
                arrayList.add(next);
            }
        }
        int i = 0;
        for (java.lang.Object obj : arrayList) {
            int i2 = i + 1;
            if (i < 0) {
                kotlin.collections.CollectionsKt.throwIndexOverflow();
            }
            com.github.mikephil.charting.data.LineDataSet lineDataSet = (com.github.mikephil.charting.data.LineDataSet) obj;
            lineDataSet.setMode(com.github.mikephil.charting.data.LineDataSet.Mode.LINEAR);
            lineDataSet.setDrawCircles(false);
            lineDataSet.setDrawValues(false);
            lineDataSet.setCircleColor(-1);
            lineDataSet.setLineWidth(2.0f);
            lineDataSet.setCircleRadius(3.0f);
            lineDataSet.setFillAlpha(65);
            lineDataSet.setFillColor(com.github.mikephil.charting.utils.ColorTemplate.getHoloBlue());
            lineDataSet.setHighLightColor(android.graphics.Color.rgb(244, 117, 117));
            lineDataSet.setDrawCircleHole(false);
            if (i % 2 == 0) {
                lineDataSet.setColor(androidx.core.content.ContextCompat.getColor(view.getContext(), powerwatch.matrix.com.pwgen2android.R.color.activity_heart_rate_color));
                lineDataSet.setAxisDependency(view.getAxisLeft().getAxisDependency());
            } else {
                lineDataSet.setColor(androidx.core.content.ContextCompat.getColor(view.getContext(), powerwatch.matrix.com.pwgen2android.R.color.activity_elevation_color));
                lineDataSet.setAxisDependency(view.getAxisRight().getAxisDependency());
            }
            java.lang.Iterable values = lineDataSet.getValues();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(values, "values");
            java.lang.Iterable iterable = values;
            if (!(iterable instanceof java.util.Collection) || !((java.util.Collection) iterable).isEmpty()) {
                java.util.Iterator it2 = iterable.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (!(((com.github.mikephil.charting.data.Entry) it2.next()).getY() == 0.0f)) {
                            z = false;
                            break;
                        }
                    } else {
                        z = true;
                        break;
                    }
                }
            } else {
                z = true;
                break;
            }
            if (z) {
                view.getAxisRight().setAxisMinimum(0.0f);
            } else {
                view.getAxisRight().resetAxisMinimum();
            }
            i = i2;
        }
        com.github.mikephil.charting.data.LineData lineData = new com.github.mikephil.charting.data.LineData((java.util.List<com.github.mikephil.charting.interfaces.datasets.ILineDataSet>) data);
        lineData.setValueTextColor(-1);
        lineData.setValueTextSize(9.0f);
        view.setData(lineData);
        ((com.github.mikephil.charting.data.LineData) view.getData()).setHighlightEnabled(false);
        view.getXAxis().getLimitLines().clear();
        view.invalidate();
    }

    @androidx.databinding.BindingAdapter({"app:goneUnless"})
    public static final void goneUnless(android.view.View view, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        view.setVisibility(z ? 0 : 8);
    }

    @androidx.databinding.BindingAdapter({"app:enabledIf"})
    public static final void enabledIf(android.view.View view, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        view.setEnabled(z);
    }

    @androidx.databinding.BindingAdapter({"app:showWithTimer"})
    public static final void showWithTimer(final android.view.View view, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        if (z) {
            view.setVisibility(0);
            new android.os.Handler().postDelayed(new java.lang.Runnable() { // from class: powerwatch.matrix.com.pwgen2android.shared.ui.-$$Lambda$BindingAdaptersKt$crGOb_eyg6FLjndHr8LESO-_G0o
                @Override // java.lang.Runnable
                public final void run() {
                    powerwatch.matrix.com.pwgen2android.shared.ui.BindingAdaptersKt.m3435showWithTimer$lambda5(view);
                }
            }, 3000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: showWithTimer$lambda-5, reason: not valid java name */
    public static final void m3435showWithTimer$lambda5(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "$view");
        view.setVisibility(8);
    }

    @androidx.databinding.BindingAdapter({"app:centerHorizontalInRelative"})
    public static final void centerHorizontalInRelative(android.view.View view, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        android.widget.RelativeLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.RelativeLayout.LayoutParams ? (android.widget.RelativeLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            if (z) {
                layoutParams2.addRule(14);
            } else {
                layoutParams2.removeRule(14);
            }
            view.setLayoutParams(layoutParams2);
        }
    }

    @androidx.databinding.BindingAdapter({"app:swipeEnabled"})
    public static final void swipeEnabled(androidx.swiperefreshlayout.widget.SwipeRefreshLayout swipeRefreshLayout, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(swipeRefreshLayout, "swipeRefreshLayout");
        swipeRefreshLayout.setEnabled(z);
    }
}
