package powerwatch.matrix.com.pwgen2android.shared.ui.charts;

/* JADX INFO: compiled from: CubicLineChartFragment.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J#\u0010\u0010\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0017"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/DaySetData;", "", "dataSets", "", "Lcom/github/mikephil/charting/interfaces/datasets/ILineDataSet;", "label", "", "(Ljava/util/List;Ljava/lang/String;)V", "getDataSets", "()Ljava/util/List;", "getLabel", "()Ljava/lang/String;", "setLabel", "(Ljava/lang/String;)V", "component1", "component2", "copy", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class DaySetData {
    private final java.util.List<com.github.mikephil.charting.interfaces.datasets.ILineDataSet> dataSets;
    private java.lang.String label;

    /* JADX WARN: Multi-variable type inference failed */
    public DaySetData() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ powerwatch.matrix.com.pwgen2android.shared.ui.charts.DaySetData copy$default(powerwatch.matrix.com.pwgen2android.shared.ui.charts.DaySetData daySetData, java.util.List list, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = daySetData.dataSets;
        }
        if ((i & 2) != 0) {
            str = daySetData.label;
        }
        return daySetData.copy(list, str);
    }

    public final java.util.List<com.github.mikephil.charting.interfaces.datasets.ILineDataSet> component1() {
        return this.dataSets;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final java.lang.String getLabel() {
        return this.label;
    }

    public final powerwatch.matrix.com.pwgen2android.shared.ui.charts.DaySetData copy(java.util.List<com.github.mikephil.charting.interfaces.datasets.ILineDataSet> dataSets, java.lang.String label) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataSets, "dataSets");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(label, "label");
        return new powerwatch.matrix.com.pwgen2android.shared.ui.charts.DaySetData(dataSets, label);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof powerwatch.matrix.com.pwgen2android.shared.ui.charts.DaySetData)) {
            return false;
        }
        powerwatch.matrix.com.pwgen2android.shared.ui.charts.DaySetData daySetData = (powerwatch.matrix.com.pwgen2android.shared.ui.charts.DaySetData) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.dataSets, daySetData.dataSets) && kotlin.jvm.internal.Intrinsics.areEqual(this.label, daySetData.label);
    }

    public int hashCode() {
        return (this.dataSets.hashCode() * 31) + this.label.hashCode();
    }

    public java.lang.String toString() {
        return "DaySetData(dataSets=" + this.dataSets + ", label=" + this.label + ')';
    }

    public DaySetData(java.util.List<com.github.mikephil.charting.interfaces.datasets.ILineDataSet> dataSets, java.lang.String label) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataSets, "dataSets");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(label, "label");
        this.dataSets = dataSets;
        this.label = label;
    }

    public /* synthetic */ DaySetData(java.util.ArrayList arrayList, java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new java.util.ArrayList() : arrayList, (i & 2) != 0 ? "" : str);
    }

    public final java.util.List<com.github.mikephil.charting.interfaces.datasets.ILineDataSet> getDataSets() {
        return this.dataSets;
    }

    public final java.lang.String getLabel() {
        return this.label;
    }

    public final void setLabel(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.label = str;
    }
}
