package com.github.mikephil.charting.data;

/* JADX INFO: loaded from: classes.dex */
public class PieDataSet extends com.github.mikephil.charting.data.DataSet<com.github.mikephil.charting.data.PieEntry> implements com.github.mikephil.charting.interfaces.datasets.IPieDataSet {
    private boolean mAutomaticallyDisableSliceSpacing;
    private float mShift;
    private float mSliceSpace;
    private int mValueLineColor;
    private float mValueLinePart1Length;
    private float mValueLinePart1OffsetPercentage;
    private float mValueLinePart2Length;
    private boolean mValueLineVariableLength;
    private float mValueLineWidth;
    private com.github.mikephil.charting.data.PieDataSet.ValuePosition mXValuePosition;
    private com.github.mikephil.charting.data.PieDataSet.ValuePosition mYValuePosition;

    public enum ValuePosition {
        INSIDE_SLICE,
        OUTSIDE_SLICE
    }

    public PieDataSet(java.util.List<com.github.mikephil.charting.data.PieEntry> list, java.lang.String str) {
        super(list, str);
        this.mSliceSpace = 0.0f;
        this.mShift = 18.0f;
        this.mXValuePosition = com.github.mikephil.charting.data.PieDataSet.ValuePosition.INSIDE_SLICE;
        this.mYValuePosition = com.github.mikephil.charting.data.PieDataSet.ValuePosition.INSIDE_SLICE;
        this.mValueLineColor = androidx.core.view.ViewCompat.MEASURED_STATE_MASK;
        this.mValueLineWidth = 1.0f;
        this.mValueLinePart1OffsetPercentage = 75.0f;
        this.mValueLinePart1Length = 0.3f;
        this.mValueLinePart2Length = 0.4f;
        this.mValueLineVariableLength = true;
    }

    @Override // com.github.mikephil.charting.data.DataSet
    public com.github.mikephil.charting.data.DataSet<com.github.mikephil.charting.data.PieEntry> copy() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i = 0; i < this.mValues.size(); i++) {
            arrayList.add(((com.github.mikephil.charting.data.PieEntry) this.mValues.get(i)).copy());
        }
        com.github.mikephil.charting.data.PieDataSet pieDataSet = new com.github.mikephil.charting.data.PieDataSet(arrayList, getLabel());
        pieDataSet.mColors = this.mColors;
        pieDataSet.mSliceSpace = this.mSliceSpace;
        pieDataSet.mShift = this.mShift;
        return pieDataSet;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.github.mikephil.charting.data.DataSet
    public void calcMinMax(com.github.mikephil.charting.data.PieEntry pieEntry) {
        if (pieEntry == null) {
            return;
        }
        calcMinMaxY(pieEntry);
    }

    public void setSliceSpace(float f) {
        if (f > 20.0f) {
            f = 20.0f;
        }
        if (f < 0.0f) {
            f = 0.0f;
        }
        this.mSliceSpace = com.github.mikephil.charting.utils.Utils.convertDpToPixel(f);
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IPieDataSet
    public float getSliceSpace() {
        return this.mSliceSpace;
    }

    public void setAutomaticallyDisableSliceSpacing(boolean z) {
        this.mAutomaticallyDisableSliceSpacing = z;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IPieDataSet
    public boolean isAutomaticallyDisableSliceSpacingEnabled() {
        return this.mAutomaticallyDisableSliceSpacing;
    }

    public void setSelectionShift(float f) {
        this.mShift = com.github.mikephil.charting.utils.Utils.convertDpToPixel(f);
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IPieDataSet
    public float getSelectionShift() {
        return this.mShift;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IPieDataSet
    public com.github.mikephil.charting.data.PieDataSet.ValuePosition getXValuePosition() {
        return this.mXValuePosition;
    }

    public void setXValuePosition(com.github.mikephil.charting.data.PieDataSet.ValuePosition valuePosition) {
        this.mXValuePosition = valuePosition;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IPieDataSet
    public com.github.mikephil.charting.data.PieDataSet.ValuePosition getYValuePosition() {
        return this.mYValuePosition;
    }

    public void setYValuePosition(com.github.mikephil.charting.data.PieDataSet.ValuePosition valuePosition) {
        this.mYValuePosition = valuePosition;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IPieDataSet
    public int getValueLineColor() {
        return this.mValueLineColor;
    }

    public void setValueLineColor(int i) {
        this.mValueLineColor = i;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IPieDataSet
    public float getValueLineWidth() {
        return this.mValueLineWidth;
    }

    public void setValueLineWidth(float f) {
        this.mValueLineWidth = f;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IPieDataSet
    public float getValueLinePart1OffsetPercentage() {
        return this.mValueLinePart1OffsetPercentage;
    }

    public void setValueLinePart1OffsetPercentage(float f) {
        this.mValueLinePart1OffsetPercentage = f;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IPieDataSet
    public float getValueLinePart1Length() {
        return this.mValueLinePart1Length;
    }

    public void setValueLinePart1Length(float f) {
        this.mValueLinePart1Length = f;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IPieDataSet
    public float getValueLinePart2Length() {
        return this.mValueLinePart2Length;
    }

    public void setValueLinePart2Length(float f) {
        this.mValueLinePart2Length = f;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IPieDataSet
    public boolean isValueLineVariableLength() {
        return this.mValueLineVariableLength;
    }

    public void setValueLineVariableLength(boolean z) {
        this.mValueLineVariableLength = z;
    }
}
