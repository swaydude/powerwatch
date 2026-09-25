package com.github.mikephil.charting.data;

/* JADX INFO: loaded from: classes.dex */
public class BarEntry extends com.github.mikephil.charting.data.Entry {
    private float mNegativeSum;
    private float mPositiveSum;
    private com.github.mikephil.charting.highlight.Range[] mRanges;
    private float[] mYVals;

    public BarEntry(float f, float f2) {
        super(f, f2);
    }

    public BarEntry(float f, float f2, java.lang.Object obj) {
        super(f, f2, obj);
    }

    public BarEntry(float f, float f2, android.graphics.drawable.Drawable drawable) {
        super(f, f2, drawable);
    }

    public BarEntry(float f, float f2, android.graphics.drawable.Drawable drawable, java.lang.Object obj) {
        super(f, f2, drawable, obj);
    }

    public BarEntry(float f, float[] fArr) {
        super(f, calcSum(fArr));
        this.mYVals = fArr;
        calcPosNegSum();
        calcRanges();
    }

    public BarEntry(float f, float[] fArr, java.lang.Object obj) {
        super(f, calcSum(fArr), obj);
        this.mYVals = fArr;
        calcPosNegSum();
        calcRanges();
    }

    public BarEntry(float f, float[] fArr, android.graphics.drawable.Drawable drawable) {
        super(f, calcSum(fArr), drawable);
        this.mYVals = fArr;
        calcPosNegSum();
        calcRanges();
    }

    public BarEntry(float f, float[] fArr, android.graphics.drawable.Drawable drawable, java.lang.Object obj) {
        super(f, calcSum(fArr), drawable, obj);
        this.mYVals = fArr;
        calcPosNegSum();
        calcRanges();
    }

    @Override // com.github.mikephil.charting.data.Entry
    public com.github.mikephil.charting.data.BarEntry copy() {
        com.github.mikephil.charting.data.BarEntry barEntry = new com.github.mikephil.charting.data.BarEntry(getX(), getY(), getData());
        barEntry.setVals(this.mYVals);
        return barEntry;
    }

    public float[] getYVals() {
        return this.mYVals;
    }

    public void setVals(float[] fArr) {
        setY(calcSum(fArr));
        this.mYVals = fArr;
        calcPosNegSum();
        calcRanges();
    }

    @Override // com.github.mikephil.charting.data.BaseEntry
    public float getY() {
        return super.getY();
    }

    public com.github.mikephil.charting.highlight.Range[] getRanges() {
        return this.mRanges;
    }

    public boolean isStacked() {
        return this.mYVals != null;
    }

    @java.lang.Deprecated
    public float getBelowSum(int i) {
        return getSumBelow(i);
    }

    public float getSumBelow(int i) {
        float[] fArr = this.mYVals;
        float f = 0.0f;
        if (fArr == null) {
            return 0.0f;
        }
        for (int length = fArr.length - 1; length > i && length >= 0; length--) {
            f += this.mYVals[length];
        }
        return f;
    }

    public float getPositiveSum() {
        return this.mPositiveSum;
    }

    public float getNegativeSum() {
        return this.mNegativeSum;
    }

    private void calcPosNegSum() {
        float[] fArr = this.mYVals;
        if (fArr == null) {
            this.mNegativeSum = 0.0f;
            this.mPositiveSum = 0.0f;
            return;
        }
        float fAbs = 0.0f;
        float f = 0.0f;
        for (float f2 : fArr) {
            if (f2 <= 0.0f) {
                fAbs += java.lang.Math.abs(f2);
            } else {
                f += f2;
            }
        }
        this.mNegativeSum = fAbs;
        this.mPositiveSum = f;
    }

    private static float calcSum(float[] fArr) {
        float f = 0.0f;
        if (fArr == null) {
            return 0.0f;
        }
        for (float f2 : fArr) {
            f += f2;
        }
        return f;
    }

    protected void calcRanges() {
        float[] yVals = getYVals();
        if (yVals == null || yVals.length == 0) {
            return;
        }
        this.mRanges = new com.github.mikephil.charting.highlight.Range[yVals.length];
        float f = -getNegativeSum();
        int i = 0;
        float f2 = 0.0f;
        while (true) {
            com.github.mikephil.charting.highlight.Range[] rangeArr = this.mRanges;
            if (i >= rangeArr.length) {
                return;
            }
            float f3 = yVals[i];
            if (f3 < 0.0f) {
                float f4 = f - f3;
                rangeArr[i] = new com.github.mikephil.charting.highlight.Range(f, f4);
                f = f4;
            } else {
                float f5 = f3 + f2;
                rangeArr[i] = new com.github.mikephil.charting.highlight.Range(f2, f5);
                f2 = f5;
            }
            i++;
        }
    }
}
