package powerwatch.matrix.com.pwgen2android.shared.ui.charts;

/* JADX INFO: compiled from: BarChartFragment.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\u0018\u00002\u00020\u0001BC\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\u0007¢\u0006\u0002\u0010\rJ\u0010\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\nH\u0016J\u0012\u0010\u0012\u001a\u00020\n2\b\u0010\u0013\u001a\u0004\u0018\u00010\bH\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u000b\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/GoalsBarDataSet;", "Lcom/github/mikephil/charting/data/BarDataSet;", "multipleColors", "", "context", "Landroid/content/Context;", "yValues", "", "Lcom/github/mikephil/charting/data/BarEntry;", "min", "", "max", "barColors", "(ZLandroid/content/Context;Ljava/util/List;IILjava/util/List;)V", "getContext", "()Landroid/content/Context;", "getColor", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "getEntryIndex", com.baidu.mapsdkplatform.comapi.e.a, "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class GoalsBarDataSet extends com.github.mikephil.charting.data.BarDataSet {
    private final android.content.Context context;
    private final int max;
    private final int min;
    private final boolean multipleColors;
    private final java.util.List<com.github.mikephil.charting.data.BarEntry> yValues;

    public /* synthetic */ GoalsBarDataSet(boolean z, android.content.Context context, java.util.List list, int i, int i2, java.util.List list2, int i3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? false : z, context, list, i, i2, list2);
    }

    public final android.content.Context getContext() {
        return this.context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public GoalsBarDataSet(boolean z, android.content.Context context, java.util.List<? extends com.github.mikephil.charting.data.BarEntry> yValues, int i, int i2, java.util.List<java.lang.Integer> barColors) {
        super(yValues, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(yValues, "yValues");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barColors, "barColors");
        this.multipleColors = z;
        this.context = context;
        this.yValues = yValues;
        this.min = i;
        this.max = i2;
        java.util.List<java.lang.Integer> list = barColors;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(java.lang.Integer.valueOf(androidx.core.content.ContextCompat.getColor(getContext(), ((java.lang.Number) it.next()).intValue())));
        }
        int[] intArray = kotlin.collections.CollectionsKt.toIntArray(arrayList);
        setColors(java.util.Arrays.copyOf(intArray, intArray.length));
    }

    @Override // com.github.mikephil.charting.data.DataSet, com.github.mikephil.charting.interfaces.datasets.IDataSet
    public int getEntryIndex(com.github.mikephil.charting.data.BarEntry e) {
        return kotlin.collections.CollectionsKt.indexOf((java.util.List<? extends com.github.mikephil.charting.data.BarEntry>) this.yValues, e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.github.mikephil.charting.data.BaseDataSet, com.github.mikephil.charting.interfaces.datasets.IDataSet
    public int getColor(int index) {
        if (!this.multipleColors) {
            java.lang.Integer num = this.mColors.get(0);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(num, "mColors[0]");
            return num.intValue();
        }
        com.github.mikephil.charting.data.BarEntry barEntry = (com.github.mikephil.charting.data.BarEntry) getEntryForIndex(index);
        if (barEntry.getY() < this.min) {
            java.lang.Integer num2 = this.mColors.get(2);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(num2, "mColors[2]");
            return num2.intValue();
        }
        if (barEntry.getY() < this.min || barEntry.getY() >= this.max) {
            java.lang.Integer num3 = this.mColors.get(0);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(num3, "mColors[0]");
            return num3.intValue();
        }
        java.lang.Integer num4 = this.mColors.get(1);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(num4, "mColors[1]");
        return num4.intValue();
    }
}
