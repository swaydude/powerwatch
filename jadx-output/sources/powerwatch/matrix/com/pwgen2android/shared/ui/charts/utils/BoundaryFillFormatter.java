package powerwatch.matrix.com.pwgen2android.shared.ui.charts.utils;

/* JADX INFO: loaded from: classes3.dex */
public class BoundaryFillFormatter implements com.github.mikephil.charting.formatter.IFillFormatter {
    private com.github.mikephil.charting.interfaces.datasets.ILineDataSet boundaryDataSet;

    @Override // com.github.mikephil.charting.formatter.IFillFormatter
    public float getFillLinePosition(com.github.mikephil.charting.interfaces.datasets.ILineDataSet dataSet, com.github.mikephil.charting.interfaces.dataprovider.LineDataProvider dataProvider) {
        return 0.0f;
    }

    public BoundaryFillFormatter() {
        this(null);
    }

    public BoundaryFillFormatter(com.github.mikephil.charting.interfaces.datasets.ILineDataSet boundaryDataSet) {
        this.boundaryDataSet = boundaryDataSet;
    }

    public com.github.mikephil.charting.data.LineDataSet getBoundaryDataSet() {
        return (com.github.mikephil.charting.data.LineDataSet) this.boundaryDataSet;
    }

    public java.util.List<com.github.mikephil.charting.data.Entry> getFillLineBoundary() {
        com.github.mikephil.charting.interfaces.datasets.ILineDataSet iLineDataSet = this.boundaryDataSet;
        if (iLineDataSet != null) {
            return ((com.github.mikephil.charting.data.LineDataSet) iLineDataSet).getValues();
        }
        return null;
    }
}
