package powerwatch.matrix.com.pwgen2android.shared.ui.charts;

/* JADX INFO: compiled from: Utils.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u001a\u001e\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u001a\u001c\u0010\u0007\u001a\u00020\b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\t"}, d2 = {"buildMalformedDataSet", "Lcom/github/mikephil/charting/data/LineDataSet;", "context", "Landroid/content/Context;", "malformedData", "", "Lcom/github/mikephil/charting/data/Entry;", "reformatDataForBadPlacement", "", "app_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
public final class UtilsKt {
    public static final void reformatDataForBadPlacement(java.util.List<com.github.mikephil.charting.data.Entry> malformedData, android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(malformedData, "malformedData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        int size = malformedData.size() - 1;
        int i = 0;
        while (i < size) {
            com.github.mikephil.charting.data.Entry entry = malformedData.get(i);
            int i2 = i + 1;
            com.github.mikephil.charting.data.Entry entry2 = malformedData.get(i2);
            if ((entry.getY() == entry2.getY()) && entry.getY() > 0.0f && i == 0) {
                entry.setIcon(context.getDrawable(powerwatch.matrix.com.pwgen2android.R.mipmap.alert_icon));
            }
            if (!(entry.getY() == entry2.getY())) {
                if (!(entry.getX() == entry2.getX())) {
                    boolean z = entry.getY() < entry2.getY();
                    com.github.mikephil.charting.data.Entry entry3 = new com.github.mikephil.charting.data.Entry(entry.getX() + 0.5f, entry.getY());
                    com.github.mikephil.charting.data.Entry entry4 = new com.github.mikephil.charting.data.Entry(entry.getX() + 0.5f, entry2.getY());
                    if (z) {
                        entry4.setIcon(context.getDrawable(powerwatch.matrix.com.pwgen2android.R.mipmap.alert_icon));
                    }
                    malformedData.add(i2, entry3);
                    i += 2;
                    malformedData.add(i, entry4);
                    size = malformedData.size() - 1;
                }
            }
            i++;
        }
    }

    public static final com.github.mikephil.charting.data.LineDataSet buildMalformedDataSet(android.content.Context context, java.util.List<com.github.mikephil.charting.data.Entry> malformedData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(malformedData, "malformedData");
        if (!(!malformedData.isEmpty())) {
            return null;
        }
        com.github.mikephil.charting.data.LineDataSet lineDataSet = new com.github.mikephil.charting.data.LineDataSet(malformedData, "Bad placement");
        lineDataSet.setColor(androidx.core.content.ContextCompat.getColor(context, android.R.color.transparent));
        lineDataSet.setFillColor(androidx.core.content.ContextCompat.getColor(context, powerwatch.matrix.com.pwgen2android.R.color.bad_placement_fill));
        lineDataSet.setDrawFilled(true);
        lineDataSet.setDrawCircleHole(false);
        lineDataSet.setDrawCircles(false);
        lineDataSet.setDrawValues(false);
        lineDataSet.setIconsOffset(new com.github.mikephil.charting.utils.MPPointF(10.0f, 10.0f));
        lineDataSet.setDrawIcons(true);
        lineDataSet.setAxisDependency(com.github.mikephil.charting.components.YAxis.AxisDependency.LEFT);
        return lineDataSet;
    }
}
