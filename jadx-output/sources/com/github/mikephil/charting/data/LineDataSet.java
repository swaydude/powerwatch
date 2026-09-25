package com.github.mikephil.charting.data;

/* JADX INFO: loaded from: classes.dex */
public class LineDataSet extends com.github.mikephil.charting.data.LineRadarDataSet<com.github.mikephil.charting.data.Entry> implements com.github.mikephil.charting.interfaces.datasets.ILineDataSet {
    private int mCircleColorHole;
    private java.util.List<java.lang.Integer> mCircleColors;
    private float mCircleHoleRadius;
    private float mCircleRadius;
    private float mCubicIntensity;
    private android.graphics.DashPathEffect mDashPathEffect;
    private boolean mDrawCircleHole;
    private boolean mDrawCircles;
    private com.github.mikephil.charting.formatter.IFillFormatter mFillFormatter;
    private com.github.mikephil.charting.data.LineDataSet.Mode mMode;

    public enum Mode {
        LINEAR,
        STEPPED,
        CUBIC_BEZIER,
        HORIZONTAL_BEZIER
    }

    public LineDataSet(java.util.List<com.github.mikephil.charting.data.Entry> list, java.lang.String str) {
        super(list, str);
        this.mMode = com.github.mikephil.charting.data.LineDataSet.Mode.LINEAR;
        this.mCircleColors = null;
        this.mCircleColorHole = -1;
        this.mCircleRadius = 8.0f;
        this.mCircleHoleRadius = 4.0f;
        this.mCubicIntensity = 0.2f;
        this.mDashPathEffect = null;
        this.mFillFormatter = new com.github.mikephil.charting.formatter.DefaultFillFormatter();
        this.mDrawCircles = true;
        this.mDrawCircleHole = true;
        if (this.mCircleColors == null) {
            this.mCircleColors = new java.util.ArrayList();
        }
        this.mCircleColors.clear();
        this.mCircleColors.add(java.lang.Integer.valueOf(android.graphics.Color.rgb(140, 234, 255)));
    }

    @Override // com.github.mikephil.charting.data.DataSet
    public com.github.mikephil.charting.data.DataSet<com.github.mikephil.charting.data.Entry> copy() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i = 0; i < this.mValues.size(); i++) {
            arrayList.add(((com.github.mikephil.charting.data.Entry) this.mValues.get(i)).copy());
        }
        com.github.mikephil.charting.data.LineDataSet lineDataSet = new com.github.mikephil.charting.data.LineDataSet(arrayList, getLabel());
        lineDataSet.mMode = this.mMode;
        lineDataSet.mColors = this.mColors;
        lineDataSet.mCircleRadius = this.mCircleRadius;
        lineDataSet.mCircleHoleRadius = this.mCircleHoleRadius;
        lineDataSet.mCircleColors = this.mCircleColors;
        lineDataSet.mDashPathEffect = this.mDashPathEffect;
        lineDataSet.mDrawCircles = this.mDrawCircles;
        lineDataSet.mDrawCircleHole = this.mDrawCircleHole;
        lineDataSet.mHighLightColor = this.mHighLightColor;
        return lineDataSet;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.ILineDataSet
    public com.github.mikephil.charting.data.LineDataSet.Mode getMode() {
        return this.mMode;
    }

    public void setMode(com.github.mikephil.charting.data.LineDataSet.Mode mode) {
        this.mMode = mode;
    }

    public void setCubicIntensity(float f) {
        if (f > 1.0f) {
            f = 1.0f;
        }
        if (f < 0.05f) {
            f = 0.05f;
        }
        this.mCubicIntensity = f;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.ILineDataSet
    public float getCubicIntensity() {
        return this.mCubicIntensity;
    }

    public void setCircleRadius(float f) {
        if (f >= 1.0f) {
            this.mCircleRadius = com.github.mikephil.charting.utils.Utils.convertDpToPixel(f);
        } else {
            android.util.Log.e("LineDataSet", "Circle radius cannot be < 1");
        }
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.ILineDataSet
    public float getCircleRadius() {
        return this.mCircleRadius;
    }

    public void setCircleHoleRadius(float f) {
        if (f >= 0.5f) {
            this.mCircleHoleRadius = com.github.mikephil.charting.utils.Utils.convertDpToPixel(f);
        } else {
            android.util.Log.e("LineDataSet", "Circle radius cannot be < 0.5");
        }
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.ILineDataSet
    public float getCircleHoleRadius() {
        return this.mCircleHoleRadius;
    }

    @java.lang.Deprecated
    public void setCircleSize(float f) {
        setCircleRadius(f);
    }

    @java.lang.Deprecated
    public float getCircleSize() {
        return getCircleRadius();
    }

    public void enableDashedLine(float f, float f2, float f3) {
        this.mDashPathEffect = new android.graphics.DashPathEffect(new float[]{f, f2}, f3);
    }

    public void disableDashedLine() {
        this.mDashPathEffect = null;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.ILineDataSet
    public boolean isDashedLineEnabled() {
        return this.mDashPathEffect != null;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.ILineDataSet
    public android.graphics.DashPathEffect getDashPathEffect() {
        return this.mDashPathEffect;
    }

    public void setDrawCircles(boolean z) {
        this.mDrawCircles = z;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.ILineDataSet
    public boolean isDrawCirclesEnabled() {
        return this.mDrawCircles;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.ILineDataSet
    @java.lang.Deprecated
    public boolean isDrawCubicEnabled() {
        return this.mMode == com.github.mikephil.charting.data.LineDataSet.Mode.CUBIC_BEZIER;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.ILineDataSet
    @java.lang.Deprecated
    public boolean isDrawSteppedEnabled() {
        return this.mMode == com.github.mikephil.charting.data.LineDataSet.Mode.STEPPED;
    }

    public java.util.List<java.lang.Integer> getCircleColors() {
        return this.mCircleColors;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.ILineDataSet
    public int getCircleColor(int i) {
        return this.mCircleColors.get(i).intValue();
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.ILineDataSet
    public int getCircleColorCount() {
        return this.mCircleColors.size();
    }

    public void setCircleColors(java.util.List<java.lang.Integer> list) {
        this.mCircleColors = list;
    }

    public void setCircleColors(int... iArr) {
        this.mCircleColors = com.github.mikephil.charting.utils.ColorTemplate.createColors(iArr);
    }

    public void setCircleColors(int[] iArr, android.content.Context context) {
        java.util.List<java.lang.Integer> arrayList = this.mCircleColors;
        if (arrayList == null) {
            arrayList = new java.util.ArrayList<>();
        }
        arrayList.clear();
        for (int i : iArr) {
            arrayList.add(java.lang.Integer.valueOf(context.getResources().getColor(i)));
        }
        this.mCircleColors = arrayList;
    }

    public void setCircleColor(int i) {
        resetCircleColors();
        this.mCircleColors.add(java.lang.Integer.valueOf(i));
    }

    public void resetCircleColors() {
        if (this.mCircleColors == null) {
            this.mCircleColors = new java.util.ArrayList();
        }
        this.mCircleColors.clear();
    }

    public void setCircleColorHole(int i) {
        this.mCircleColorHole = i;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.ILineDataSet
    public int getCircleHoleColor() {
        return this.mCircleColorHole;
    }

    public void setDrawCircleHole(boolean z) {
        this.mDrawCircleHole = z;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.ILineDataSet
    public boolean isDrawCircleHoleEnabled() {
        return this.mDrawCircleHole;
    }

    public void setFillFormatter(com.github.mikephil.charting.formatter.IFillFormatter iFillFormatter) {
        if (iFillFormatter == null) {
            this.mFillFormatter = new com.github.mikephil.charting.formatter.DefaultFillFormatter();
        } else {
            this.mFillFormatter = iFillFormatter;
        }
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.ILineDataSet
    public com.github.mikephil.charting.formatter.IFillFormatter getFillFormatter() {
        return this.mFillFormatter;
    }
}
