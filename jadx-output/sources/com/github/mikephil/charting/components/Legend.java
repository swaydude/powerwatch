package com.github.mikephil.charting.components;

/* JADX INFO: loaded from: classes.dex */
public class Legend extends com.github.mikephil.charting.components.ComponentBase {
    private java.util.List<java.lang.Boolean> mCalculatedLabelBreakPoints;
    private java.util.List<com.github.mikephil.charting.utils.FSize> mCalculatedLabelSizes;
    private java.util.List<com.github.mikephil.charting.utils.FSize> mCalculatedLineSizes;
    private com.github.mikephil.charting.components.Legend.LegendDirection mDirection;
    private boolean mDrawInside;
    private com.github.mikephil.charting.components.LegendEntry[] mEntries;
    private com.github.mikephil.charting.components.LegendEntry[] mExtraEntries;
    private android.graphics.DashPathEffect mFormLineDashEffect;
    private float mFormLineWidth;
    private float mFormSize;
    private float mFormToTextSpace;
    private com.github.mikephil.charting.components.Legend.LegendHorizontalAlignment mHorizontalAlignment;
    private boolean mIsLegendCustom;
    private float mMaxSizePercent;
    public float mNeededHeight;
    public float mNeededWidth;
    private com.github.mikephil.charting.components.Legend.LegendOrientation mOrientation;
    private com.github.mikephil.charting.components.Legend.LegendForm mShape;
    private float mStackSpace;
    public float mTextHeightMax;
    public float mTextWidthMax;
    private com.github.mikephil.charting.components.Legend.LegendVerticalAlignment mVerticalAlignment;
    private boolean mWordWrapEnabled;
    private float mXEntrySpace;
    private float mYEntrySpace;

    public enum LegendDirection {
        LEFT_TO_RIGHT,
        RIGHT_TO_LEFT
    }

    public enum LegendForm {
        NONE,
        EMPTY,
        DEFAULT,
        SQUARE,
        CIRCLE,
        LINE
    }

    public enum LegendHorizontalAlignment {
        LEFT,
        CENTER,
        RIGHT
    }

    public enum LegendOrientation {
        HORIZONTAL,
        VERTICAL
    }

    @java.lang.Deprecated
    public enum LegendPosition {
        RIGHT_OF_CHART,
        RIGHT_OF_CHART_CENTER,
        RIGHT_OF_CHART_INSIDE,
        LEFT_OF_CHART,
        LEFT_OF_CHART_CENTER,
        LEFT_OF_CHART_INSIDE,
        BELOW_CHART_LEFT,
        BELOW_CHART_RIGHT,
        BELOW_CHART_CENTER,
        ABOVE_CHART_LEFT,
        ABOVE_CHART_RIGHT,
        ABOVE_CHART_CENTER,
        PIECHART_CENTER
    }

    public enum LegendVerticalAlignment {
        TOP,
        CENTER,
        BOTTOM
    }

    public Legend() {
        this.mEntries = new com.github.mikephil.charting.components.LegendEntry[0];
        this.mIsLegendCustom = false;
        this.mHorizontalAlignment = com.github.mikephil.charting.components.Legend.LegendHorizontalAlignment.LEFT;
        this.mVerticalAlignment = com.github.mikephil.charting.components.Legend.LegendVerticalAlignment.BOTTOM;
        this.mOrientation = com.github.mikephil.charting.components.Legend.LegendOrientation.HORIZONTAL;
        this.mDrawInside = false;
        this.mDirection = com.github.mikephil.charting.components.Legend.LegendDirection.LEFT_TO_RIGHT;
        this.mShape = com.github.mikephil.charting.components.Legend.LegendForm.SQUARE;
        this.mFormSize = 8.0f;
        this.mFormLineWidth = 3.0f;
        this.mFormLineDashEffect = null;
        this.mXEntrySpace = 6.0f;
        this.mYEntrySpace = 0.0f;
        this.mFormToTextSpace = 5.0f;
        this.mStackSpace = 3.0f;
        this.mMaxSizePercent = 0.95f;
        this.mNeededWidth = 0.0f;
        this.mNeededHeight = 0.0f;
        this.mTextHeightMax = 0.0f;
        this.mTextWidthMax = 0.0f;
        this.mWordWrapEnabled = false;
        this.mCalculatedLabelSizes = new java.util.ArrayList(16);
        this.mCalculatedLabelBreakPoints = new java.util.ArrayList(16);
        this.mCalculatedLineSizes = new java.util.ArrayList(16);
        this.mTextSize = com.github.mikephil.charting.utils.Utils.convertDpToPixel(10.0f);
        this.mXOffset = com.github.mikephil.charting.utils.Utils.convertDpToPixel(5.0f);
        this.mYOffset = com.github.mikephil.charting.utils.Utils.convertDpToPixel(3.0f);
    }

    public Legend(com.github.mikephil.charting.components.LegendEntry[] legendEntryArr) {
        this();
        if (legendEntryArr == null) {
            throw new java.lang.IllegalArgumentException("entries array is NULL");
        }
        this.mEntries = legendEntryArr;
    }

    @java.lang.Deprecated
    public Legend(int[] iArr, java.lang.String[] strArr) {
        this();
        if (iArr == null || strArr == null) {
            throw new java.lang.IllegalArgumentException("colors array or labels array is NULL");
        }
        if (iArr.length != strArr.length) {
            throw new java.lang.IllegalArgumentException("colors array and labels array need to be of same size");
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i = 0; i < java.lang.Math.min(iArr.length, strArr.length); i++) {
            com.github.mikephil.charting.components.LegendEntry legendEntry = new com.github.mikephil.charting.components.LegendEntry();
            legendEntry.formColor = iArr[i];
            legendEntry.label = strArr[i];
            if (legendEntry.formColor == 1122868) {
                legendEntry.form = com.github.mikephil.charting.components.Legend.LegendForm.NONE;
            } else if (legendEntry.formColor == 1122867 || legendEntry.formColor == 0) {
                legendEntry.form = com.github.mikephil.charting.components.Legend.LegendForm.EMPTY;
            }
            arrayList.add(legendEntry);
        }
        this.mEntries = (com.github.mikephil.charting.components.LegendEntry[]) arrayList.toArray(new com.github.mikephil.charting.components.LegendEntry[arrayList.size()]);
    }

    @java.lang.Deprecated
    public Legend(java.util.List<java.lang.Integer> list, java.util.List<java.lang.String> list2) {
        this(com.github.mikephil.charting.utils.Utils.convertIntegers(list), com.github.mikephil.charting.utils.Utils.convertStrings(list2));
    }

    public void setEntries(java.util.List<com.github.mikephil.charting.components.LegendEntry> list) {
        this.mEntries = (com.github.mikephil.charting.components.LegendEntry[]) list.toArray(new com.github.mikephil.charting.components.LegendEntry[list.size()]);
    }

    public com.github.mikephil.charting.components.LegendEntry[] getEntries() {
        return this.mEntries;
    }

    public float getMaximumEntryWidth(android.graphics.Paint paint) {
        float fConvertDpToPixel = com.github.mikephil.charting.utils.Utils.convertDpToPixel(this.mFormToTextSpace);
        float f = 0.0f;
        float f2 = 0.0f;
        for (com.github.mikephil.charting.components.LegendEntry legendEntry : this.mEntries) {
            float fConvertDpToPixel2 = com.github.mikephil.charting.utils.Utils.convertDpToPixel(java.lang.Float.isNaN(legendEntry.formSize) ? this.mFormSize : legendEntry.formSize);
            if (fConvertDpToPixel2 > f2) {
                f2 = fConvertDpToPixel2;
            }
            java.lang.String str = legendEntry.label;
            if (str != null) {
                float fCalcTextWidth = com.github.mikephil.charting.utils.Utils.calcTextWidth(paint, str);
                if (fCalcTextWidth > f) {
                    f = fCalcTextWidth;
                }
            }
        }
        return f + f2 + fConvertDpToPixel;
    }

    public float getMaximumEntryHeight(android.graphics.Paint paint) {
        float f = 0.0f;
        for (com.github.mikephil.charting.components.LegendEntry legendEntry : this.mEntries) {
            java.lang.String str = legendEntry.label;
            if (str != null) {
                float fCalcTextHeight = com.github.mikephil.charting.utils.Utils.calcTextHeight(paint, str);
                if (fCalcTextHeight > f) {
                    f = fCalcTextHeight;
                }
            }
        }
        return f;
    }

    @java.lang.Deprecated
    public int[] getColors() {
        int i;
        int[] iArr = new int[this.mEntries.length];
        int i2 = 0;
        while (true) {
            com.github.mikephil.charting.components.LegendEntry[] legendEntryArr = this.mEntries;
            if (i2 >= legendEntryArr.length) {
                return iArr;
            }
            if (legendEntryArr[i2].form == com.github.mikephil.charting.components.Legend.LegendForm.NONE) {
                i = com.github.mikephil.charting.utils.ColorTemplate.COLOR_SKIP;
            } else {
                i = this.mEntries[i2].form == com.github.mikephil.charting.components.Legend.LegendForm.EMPTY ? com.github.mikephil.charting.utils.ColorTemplate.COLOR_NONE : this.mEntries[i2].formColor;
            }
            iArr[i2] = i;
            i2++;
        }
    }

    @java.lang.Deprecated
    public java.lang.String[] getLabels() {
        java.lang.String[] strArr = new java.lang.String[this.mEntries.length];
        int i = 0;
        while (true) {
            com.github.mikephil.charting.components.LegendEntry[] legendEntryArr = this.mEntries;
            if (i >= legendEntryArr.length) {
                return strArr;
            }
            strArr[i] = legendEntryArr[i].label;
            i++;
        }
    }

    @java.lang.Deprecated
    public int[] getExtraColors() {
        int i;
        int[] iArr = new int[this.mExtraEntries.length];
        int i2 = 0;
        while (true) {
            com.github.mikephil.charting.components.LegendEntry[] legendEntryArr = this.mExtraEntries;
            if (i2 >= legendEntryArr.length) {
                return iArr;
            }
            if (legendEntryArr[i2].form == com.github.mikephil.charting.components.Legend.LegendForm.NONE) {
                i = com.github.mikephil.charting.utils.ColorTemplate.COLOR_SKIP;
            } else {
                i = this.mExtraEntries[i2].form == com.github.mikephil.charting.components.Legend.LegendForm.EMPTY ? com.github.mikephil.charting.utils.ColorTemplate.COLOR_NONE : this.mExtraEntries[i2].formColor;
            }
            iArr[i2] = i;
            i2++;
        }
    }

    @java.lang.Deprecated
    public java.lang.String[] getExtraLabels() {
        java.lang.String[] strArr = new java.lang.String[this.mExtraEntries.length];
        int i = 0;
        while (true) {
            com.github.mikephil.charting.components.LegendEntry[] legendEntryArr = this.mExtraEntries;
            if (i >= legendEntryArr.length) {
                return strArr;
            }
            strArr[i] = legendEntryArr[i].label;
            i++;
        }
    }

    public com.github.mikephil.charting.components.LegendEntry[] getExtraEntries() {
        return this.mExtraEntries;
    }

    public void setExtra(java.util.List<com.github.mikephil.charting.components.LegendEntry> list) {
        this.mExtraEntries = (com.github.mikephil.charting.components.LegendEntry[]) list.toArray(new com.github.mikephil.charting.components.LegendEntry[list.size()]);
    }

    public void setExtra(com.github.mikephil.charting.components.LegendEntry[] legendEntryArr) {
        if (legendEntryArr == null) {
            legendEntryArr = new com.github.mikephil.charting.components.LegendEntry[0];
        }
        this.mExtraEntries = legendEntryArr;
    }

    @java.lang.Deprecated
    public void setExtra(java.util.List<java.lang.Integer> list, java.util.List<java.lang.String> list2) {
        setExtra(com.github.mikephil.charting.utils.Utils.convertIntegers(list), com.github.mikephil.charting.utils.Utils.convertStrings(list2));
    }

    public void setExtra(int[] iArr, java.lang.String[] strArr) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i = 0; i < java.lang.Math.min(iArr.length, strArr.length); i++) {
            com.github.mikephil.charting.components.LegendEntry legendEntry = new com.github.mikephil.charting.components.LegendEntry();
            legendEntry.formColor = iArr[i];
            legendEntry.label = strArr[i];
            if (legendEntry.formColor == 1122868 || legendEntry.formColor == 0) {
                legendEntry.form = com.github.mikephil.charting.components.Legend.LegendForm.NONE;
            } else if (legendEntry.formColor == 1122867) {
                legendEntry.form = com.github.mikephil.charting.components.Legend.LegendForm.EMPTY;
            }
            arrayList.add(legendEntry);
        }
        this.mExtraEntries = (com.github.mikephil.charting.components.LegendEntry[]) arrayList.toArray(new com.github.mikephil.charting.components.LegendEntry[arrayList.size()]);
    }

    public void setCustom(com.github.mikephil.charting.components.LegendEntry[] legendEntryArr) {
        this.mEntries = legendEntryArr;
        this.mIsLegendCustom = true;
    }

    public void setCustom(java.util.List<com.github.mikephil.charting.components.LegendEntry> list) {
        this.mEntries = (com.github.mikephil.charting.components.LegendEntry[]) list.toArray(new com.github.mikephil.charting.components.LegendEntry[list.size()]);
        this.mIsLegendCustom = true;
    }

    public void resetCustom() {
        this.mIsLegendCustom = false;
    }

    public boolean isLegendCustom() {
        return this.mIsLegendCustom;
    }

    @java.lang.Deprecated
    public com.github.mikephil.charting.components.Legend.LegendPosition getPosition() {
        if (this.mOrientation == com.github.mikephil.charting.components.Legend.LegendOrientation.VERTICAL && this.mHorizontalAlignment == com.github.mikephil.charting.components.Legend.LegendHorizontalAlignment.CENTER && this.mVerticalAlignment == com.github.mikephil.charting.components.Legend.LegendVerticalAlignment.CENTER) {
            return com.github.mikephil.charting.components.Legend.LegendPosition.PIECHART_CENTER;
        }
        if (this.mOrientation == com.github.mikephil.charting.components.Legend.LegendOrientation.HORIZONTAL) {
            if (this.mVerticalAlignment == com.github.mikephil.charting.components.Legend.LegendVerticalAlignment.TOP) {
                if (this.mHorizontalAlignment == com.github.mikephil.charting.components.Legend.LegendHorizontalAlignment.LEFT) {
                    return com.github.mikephil.charting.components.Legend.LegendPosition.ABOVE_CHART_LEFT;
                }
                return this.mHorizontalAlignment == com.github.mikephil.charting.components.Legend.LegendHorizontalAlignment.RIGHT ? com.github.mikephil.charting.components.Legend.LegendPosition.ABOVE_CHART_RIGHT : com.github.mikephil.charting.components.Legend.LegendPosition.ABOVE_CHART_CENTER;
            }
            if (this.mHorizontalAlignment == com.github.mikephil.charting.components.Legend.LegendHorizontalAlignment.LEFT) {
                return com.github.mikephil.charting.components.Legend.LegendPosition.BELOW_CHART_LEFT;
            }
            return this.mHorizontalAlignment == com.github.mikephil.charting.components.Legend.LegendHorizontalAlignment.RIGHT ? com.github.mikephil.charting.components.Legend.LegendPosition.BELOW_CHART_RIGHT : com.github.mikephil.charting.components.Legend.LegendPosition.BELOW_CHART_CENTER;
        }
        if (this.mHorizontalAlignment == com.github.mikephil.charting.components.Legend.LegendHorizontalAlignment.LEFT) {
            if (this.mVerticalAlignment == com.github.mikephil.charting.components.Legend.LegendVerticalAlignment.TOP && this.mDrawInside) {
                return com.github.mikephil.charting.components.Legend.LegendPosition.LEFT_OF_CHART_INSIDE;
            }
            return this.mVerticalAlignment == com.github.mikephil.charting.components.Legend.LegendVerticalAlignment.CENTER ? com.github.mikephil.charting.components.Legend.LegendPosition.LEFT_OF_CHART_CENTER : com.github.mikephil.charting.components.Legend.LegendPosition.LEFT_OF_CHART;
        }
        if (this.mVerticalAlignment == com.github.mikephil.charting.components.Legend.LegendVerticalAlignment.TOP && this.mDrawInside) {
            return com.github.mikephil.charting.components.Legend.LegendPosition.RIGHT_OF_CHART_INSIDE;
        }
        return this.mVerticalAlignment == com.github.mikephil.charting.components.Legend.LegendVerticalAlignment.CENTER ? com.github.mikephil.charting.components.Legend.LegendPosition.RIGHT_OF_CHART_CENTER : com.github.mikephil.charting.components.Legend.LegendPosition.RIGHT_OF_CHART;
    }

    @java.lang.Deprecated
    public void setPosition(com.github.mikephil.charting.components.Legend.LegendPosition legendPosition) {
        com.github.mikephil.charting.components.Legend.LegendHorizontalAlignment legendHorizontalAlignment;
        com.github.mikephil.charting.components.Legend.LegendHorizontalAlignment legendHorizontalAlignment2;
        switch (com.github.mikephil.charting.components.Legend.AnonymousClass1.$SwitchMap$com$github$mikephil$charting$components$Legend$LegendPosition[legendPosition.ordinal()]) {
            case 1:
            case 2:
            case 3:
                this.mHorizontalAlignment = com.github.mikephil.charting.components.Legend.LegendHorizontalAlignment.LEFT;
                this.mVerticalAlignment = legendPosition == com.github.mikephil.charting.components.Legend.LegendPosition.LEFT_OF_CHART_CENTER ? com.github.mikephil.charting.components.Legend.LegendVerticalAlignment.CENTER : com.github.mikephil.charting.components.Legend.LegendVerticalAlignment.TOP;
                this.mOrientation = com.github.mikephil.charting.components.Legend.LegendOrientation.VERTICAL;
                break;
            case 4:
            case 5:
            case 6:
                this.mHorizontalAlignment = com.github.mikephil.charting.components.Legend.LegendHorizontalAlignment.RIGHT;
                this.mVerticalAlignment = legendPosition == com.github.mikephil.charting.components.Legend.LegendPosition.RIGHT_OF_CHART_CENTER ? com.github.mikephil.charting.components.Legend.LegendVerticalAlignment.CENTER : com.github.mikephil.charting.components.Legend.LegendVerticalAlignment.TOP;
                this.mOrientation = com.github.mikephil.charting.components.Legend.LegendOrientation.VERTICAL;
                break;
            case 7:
            case 8:
            case 9:
                if (legendPosition == com.github.mikephil.charting.components.Legend.LegendPosition.ABOVE_CHART_LEFT) {
                    legendHorizontalAlignment = com.github.mikephil.charting.components.Legend.LegendHorizontalAlignment.LEFT;
                } else {
                    legendHorizontalAlignment = legendPosition == com.github.mikephil.charting.components.Legend.LegendPosition.ABOVE_CHART_RIGHT ? com.github.mikephil.charting.components.Legend.LegendHorizontalAlignment.RIGHT : com.github.mikephil.charting.components.Legend.LegendHorizontalAlignment.CENTER;
                }
                this.mHorizontalAlignment = legendHorizontalAlignment;
                this.mVerticalAlignment = com.github.mikephil.charting.components.Legend.LegendVerticalAlignment.TOP;
                this.mOrientation = com.github.mikephil.charting.components.Legend.LegendOrientation.HORIZONTAL;
                break;
            case 10:
            case 11:
            case 12:
                if (legendPosition == com.github.mikephil.charting.components.Legend.LegendPosition.BELOW_CHART_LEFT) {
                    legendHorizontalAlignment2 = com.github.mikephil.charting.components.Legend.LegendHorizontalAlignment.LEFT;
                } else {
                    legendHorizontalAlignment2 = legendPosition == com.github.mikephil.charting.components.Legend.LegendPosition.BELOW_CHART_RIGHT ? com.github.mikephil.charting.components.Legend.LegendHorizontalAlignment.RIGHT : com.github.mikephil.charting.components.Legend.LegendHorizontalAlignment.CENTER;
                }
                this.mHorizontalAlignment = legendHorizontalAlignment2;
                this.mVerticalAlignment = com.github.mikephil.charting.components.Legend.LegendVerticalAlignment.BOTTOM;
                this.mOrientation = com.github.mikephil.charting.components.Legend.LegendOrientation.HORIZONTAL;
                break;
            case 13:
                this.mHorizontalAlignment = com.github.mikephil.charting.components.Legend.LegendHorizontalAlignment.CENTER;
                this.mVerticalAlignment = com.github.mikephil.charting.components.Legend.LegendVerticalAlignment.CENTER;
                this.mOrientation = com.github.mikephil.charting.components.Legend.LegendOrientation.VERTICAL;
                break;
        }
        this.mDrawInside = legendPosition == com.github.mikephil.charting.components.Legend.LegendPosition.LEFT_OF_CHART_INSIDE || legendPosition == com.github.mikephil.charting.components.Legend.LegendPosition.RIGHT_OF_CHART_INSIDE;
    }

    public com.github.mikephil.charting.components.Legend.LegendHorizontalAlignment getHorizontalAlignment() {
        return this.mHorizontalAlignment;
    }

    public void setHorizontalAlignment(com.github.mikephil.charting.components.Legend.LegendHorizontalAlignment legendHorizontalAlignment) {
        this.mHorizontalAlignment = legendHorizontalAlignment;
    }

    public com.github.mikephil.charting.components.Legend.LegendVerticalAlignment getVerticalAlignment() {
        return this.mVerticalAlignment;
    }

    public void setVerticalAlignment(com.github.mikephil.charting.components.Legend.LegendVerticalAlignment legendVerticalAlignment) {
        this.mVerticalAlignment = legendVerticalAlignment;
    }

    public com.github.mikephil.charting.components.Legend.LegendOrientation getOrientation() {
        return this.mOrientation;
    }

    public void setOrientation(com.github.mikephil.charting.components.Legend.LegendOrientation legendOrientation) {
        this.mOrientation = legendOrientation;
    }

    public boolean isDrawInsideEnabled() {
        return this.mDrawInside;
    }

    public void setDrawInside(boolean z) {
        this.mDrawInside = z;
    }

    public com.github.mikephil.charting.components.Legend.LegendDirection getDirection() {
        return this.mDirection;
    }

    public void setDirection(com.github.mikephil.charting.components.Legend.LegendDirection legendDirection) {
        this.mDirection = legendDirection;
    }

    public com.github.mikephil.charting.components.Legend.LegendForm getForm() {
        return this.mShape;
    }

    public void setForm(com.github.mikephil.charting.components.Legend.LegendForm legendForm) {
        this.mShape = legendForm;
    }

    public void setFormSize(float f) {
        this.mFormSize = f;
    }

    public float getFormSize() {
        return this.mFormSize;
    }

    public void setFormLineWidth(float f) {
        this.mFormLineWidth = f;
    }

    public float getFormLineWidth() {
        return this.mFormLineWidth;
    }

    public void setFormLineDashEffect(android.graphics.DashPathEffect dashPathEffect) {
        this.mFormLineDashEffect = dashPathEffect;
    }

    public android.graphics.DashPathEffect getFormLineDashEffect() {
        return this.mFormLineDashEffect;
    }

    public float getXEntrySpace() {
        return this.mXEntrySpace;
    }

    public void setXEntrySpace(float f) {
        this.mXEntrySpace = f;
    }

    public float getYEntrySpace() {
        return this.mYEntrySpace;
    }

    public void setYEntrySpace(float f) {
        this.mYEntrySpace = f;
    }

    public float getFormToTextSpace() {
        return this.mFormToTextSpace;
    }

    public void setFormToTextSpace(float f) {
        this.mFormToTextSpace = f;
    }

    public float getStackSpace() {
        return this.mStackSpace;
    }

    public void setStackSpace(float f) {
        this.mStackSpace = f;
    }

    public void setWordWrapEnabled(boolean z) {
        this.mWordWrapEnabled = z;
    }

    public boolean isWordWrapEnabled() {
        return this.mWordWrapEnabled;
    }

    public float getMaxSizePercent() {
        return this.mMaxSizePercent;
    }

    public void setMaxSizePercent(float f) {
        this.mMaxSizePercent = f;
    }

    public java.util.List<com.github.mikephil.charting.utils.FSize> getCalculatedLabelSizes() {
        return this.mCalculatedLabelSizes;
    }

    public java.util.List<java.lang.Boolean> getCalculatedLabelBreakPoints() {
        return this.mCalculatedLabelBreakPoints;
    }

    public java.util.List<com.github.mikephil.charting.utils.FSize> getCalculatedLineSizes() {
        return this.mCalculatedLineSizes;
    }

    /* JADX WARN: Code duplicated, block: B:91:0x01db  */
    public void calculateDimensions(android.graphics.Paint paint, com.github.mikephil.charting.utils.ViewPortHandler viewPortHandler) {
        float fMax;
        float f;
        float f2;
        float f3;
        float fMax2;
        float f4;
        float fConvertDpToPixel = com.github.mikephil.charting.utils.Utils.convertDpToPixel(this.mFormSize);
        float fConvertDpToPixel2 = com.github.mikephil.charting.utils.Utils.convertDpToPixel(this.mStackSpace);
        float fConvertDpToPixel3 = com.github.mikephil.charting.utils.Utils.convertDpToPixel(this.mFormToTextSpace);
        float fConvertDpToPixel4 = com.github.mikephil.charting.utils.Utils.convertDpToPixel(this.mXEntrySpace);
        float fConvertDpToPixel5 = com.github.mikephil.charting.utils.Utils.convertDpToPixel(this.mYEntrySpace);
        boolean z = this.mWordWrapEnabled;
        com.github.mikephil.charting.components.LegendEntry[] legendEntryArr = this.mEntries;
        int length = legendEntryArr.length;
        this.mTextWidthMax = getMaximumEntryWidth(paint);
        this.mTextHeightMax = getMaximumEntryHeight(paint);
        int i = com.github.mikephil.charting.components.Legend.AnonymousClass1.$SwitchMap$com$github$mikephil$charting$components$Legend$LegendOrientation[this.mOrientation.ordinal()];
        if (i == 1) {
            float lineHeight = com.github.mikephil.charting.utils.Utils.getLineHeight(paint);
            float f5 = 0.0f;
            float f6 = 0.0f;
            float fMax3 = 0.0f;
            boolean z2 = false;
            for (int i2 = 0; i2 < length; i2++) {
                com.github.mikephil.charting.components.LegendEntry legendEntry = legendEntryArr[i2];
                boolean z3 = legendEntry.form != com.github.mikephil.charting.components.Legend.LegendForm.NONE;
                float fConvertDpToPixel6 = java.lang.Float.isNaN(legendEntry.formSize) ? fConvertDpToPixel : com.github.mikephil.charting.utils.Utils.convertDpToPixel(legendEntry.formSize);
                java.lang.String str = legendEntry.label;
                if (!z2) {
                    f6 = 0.0f;
                }
                if (z3) {
                    if (z2) {
                        f6 += fConvertDpToPixel2;
                    }
                    f6 += fConvertDpToPixel6;
                }
                if (str != null) {
                    if (!z3 || z2) {
                        if (z2) {
                            f5 += lineHeight + fConvertDpToPixel5;
                            fMax = java.lang.Math.max(fMax3, f6);
                            f = 0.0f;
                            z2 = false;
                        }
                        float fCalcTextWidth = f + com.github.mikephil.charting.utils.Utils.calcTextWidth(paint, str);
                        if (i2 < length - 1) {
                            f5 += lineHeight + fConvertDpToPixel5;
                        }
                        fMax3 = fMax;
                        f6 = fCalcTextWidth;
                    } else {
                        f6 += fConvertDpToPixel3;
                    }
                    float f7 = fMax3;
                    f = f6;
                    fMax = f7;
                    float fCalcTextWidth2 = f + com.github.mikephil.charting.utils.Utils.calcTextWidth(paint, str);
                    if (i2 < length - 1) {
                        f5 += lineHeight + fConvertDpToPixel5;
                    }
                    fMax3 = fMax;
                    f6 = fCalcTextWidth2;
                } else {
                    f6 += fConvertDpToPixel6;
                    if (i2 < length - 1) {
                        f6 += fConvertDpToPixel2;
                    }
                    z2 = true;
                }
                fMax3 = java.lang.Math.max(fMax3, f6);
            }
            this.mNeededWidth = fMax3;
            this.mNeededHeight = f5;
        } else if (i == 2) {
            float lineHeight2 = com.github.mikephil.charting.utils.Utils.getLineHeight(paint);
            float lineSpacing = com.github.mikephil.charting.utils.Utils.getLineSpacing(paint) + fConvertDpToPixel5;
            float fContentWidth = viewPortHandler.contentWidth() * this.mMaxSizePercent;
            this.mCalculatedLabelBreakPoints.clear();
            this.mCalculatedLabelSizes.clear();
            this.mCalculatedLineSizes.clear();
            int i3 = 0;
            int i4 = -1;
            float fMax4 = 0.0f;
            float f8 = 0.0f;
            float f9 = 0.0f;
            while (i3 < length) {
                com.github.mikephil.charting.components.LegendEntry legendEntry2 = legendEntryArr[i3];
                float f10 = fConvertDpToPixel;
                boolean z4 = legendEntry2.form != com.github.mikephil.charting.components.Legend.LegendForm.NONE;
                float fConvertDpToPixel7 = java.lang.Float.isNaN(legendEntry2.formSize) ? f10 : com.github.mikephil.charting.utils.Utils.convertDpToPixel(legendEntry2.formSize);
                java.lang.String str2 = legendEntry2.label;
                float f11 = fConvertDpToPixel4;
                com.github.mikephil.charting.components.LegendEntry[] legendEntryArr2 = legendEntryArr;
                this.mCalculatedLabelBreakPoints.add(false);
                float f12 = i4 == -1 ? 0.0f : f8 + fConvertDpToPixel2;
                if (str2 != null) {
                    f2 = fConvertDpToPixel2;
                    this.mCalculatedLabelSizes.add(com.github.mikephil.charting.utils.Utils.calcTextSize(paint, str2));
                    f3 = f12 + (z4 ? fConvertDpToPixel3 + fConvertDpToPixel7 : 0.0f) + this.mCalculatedLabelSizes.get(i3).width;
                } else {
                    f2 = fConvertDpToPixel2;
                    float f13 = fConvertDpToPixel7;
                    this.mCalculatedLabelSizes.add(com.github.mikephil.charting.utils.FSize.getInstance(0.0f, 0.0f));
                    f3 = f12 + (z4 ? f13 : 0.0f);
                    if (i4 == -1) {
                        i4 = i3;
                    }
                }
                if (str2 != null || i3 == length - 1) {
                    float f14 = f9;
                    float f15 = f14 == 0.0f ? 0.0f : f11;
                    if (!z || f14 == 0.0f || fContentWidth - f14 >= f15 + f3) {
                        float f16 = f14 + f15 + f3;
                        fMax2 = fMax4;
                        f4 = f16;
                    } else {
                        this.mCalculatedLineSizes.add(com.github.mikephil.charting.utils.FSize.getInstance(f14, lineHeight2));
                        fMax2 = java.lang.Math.max(fMax4, f14);
                        this.mCalculatedLabelBreakPoints.set(i4 > -1 ? i4 : i3, true);
                        f4 = f3;
                    }
                    if (i3 == length - 1) {
                        this.mCalculatedLineSizes.add(com.github.mikephil.charting.utils.FSize.getInstance(f4, lineHeight2));
                        fMax4 = java.lang.Math.max(fMax2, f4);
                    } else {
                        fMax4 = fMax2;
                    }
                    f9 = f4;
                }
                if (str2 != null) {
                    i4 = -1;
                }
                i3++;
                fConvertDpToPixel2 = f2;
                fConvertDpToPixel = f10;
                legendEntryArr = legendEntryArr2;
                f8 = f3;
                fConvertDpToPixel4 = f11;
            }
            this.mNeededWidth = fMax4;
            this.mNeededHeight = (lineHeight2 * this.mCalculatedLineSizes.size()) + (lineSpacing * (this.mCalculatedLineSizes.size() == 0 ? 0 : this.mCalculatedLineSizes.size() - 1));
        }
        this.mNeededHeight += this.mYOffset;
        this.mNeededWidth += this.mXOffset;
    }

    /* JADX INFO: renamed from: com.github.mikephil.charting.components.Legend$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$github$mikephil$charting$components$Legend$LegendOrientation;
        static final /* synthetic */ int[] $SwitchMap$com$github$mikephil$charting$components$Legend$LegendPosition;

        static {
            int[] iArr = new int[com.github.mikephil.charting.components.Legend.LegendOrientation.values().length];
            $SwitchMap$com$github$mikephil$charting$components$Legend$LegendOrientation = iArr;
            try {
                iArr[com.github.mikephil.charting.components.Legend.LegendOrientation.VERTICAL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$github$mikephil$charting$components$Legend$LegendOrientation[com.github.mikephil.charting.components.Legend.LegendOrientation.HORIZONTAL.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[com.github.mikephil.charting.components.Legend.LegendPosition.values().length];
            $SwitchMap$com$github$mikephil$charting$components$Legend$LegendPosition = iArr2;
            try {
                iArr2[com.github.mikephil.charting.components.Legend.LegendPosition.LEFT_OF_CHART.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$github$mikephil$charting$components$Legend$LegendPosition[com.github.mikephil.charting.components.Legend.LegendPosition.LEFT_OF_CHART_INSIDE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$github$mikephil$charting$components$Legend$LegendPosition[com.github.mikephil.charting.components.Legend.LegendPosition.LEFT_OF_CHART_CENTER.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$github$mikephil$charting$components$Legend$LegendPosition[com.github.mikephil.charting.components.Legend.LegendPosition.RIGHT_OF_CHART.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$github$mikephil$charting$components$Legend$LegendPosition[com.github.mikephil.charting.components.Legend.LegendPosition.RIGHT_OF_CHART_INSIDE.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$github$mikephil$charting$components$Legend$LegendPosition[com.github.mikephil.charting.components.Legend.LegendPosition.RIGHT_OF_CHART_CENTER.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$github$mikephil$charting$components$Legend$LegendPosition[com.github.mikephil.charting.components.Legend.LegendPosition.ABOVE_CHART_LEFT.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$github$mikephil$charting$components$Legend$LegendPosition[com.github.mikephil.charting.components.Legend.LegendPosition.ABOVE_CHART_CENTER.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$github$mikephil$charting$components$Legend$LegendPosition[com.github.mikephil.charting.components.Legend.LegendPosition.ABOVE_CHART_RIGHT.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$github$mikephil$charting$components$Legend$LegendPosition[com.github.mikephil.charting.components.Legend.LegendPosition.BELOW_CHART_LEFT.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$github$mikephil$charting$components$Legend$LegendPosition[com.github.mikephil.charting.components.Legend.LegendPosition.BELOW_CHART_CENTER.ordinal()] = 11;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$github$mikephil$charting$components$Legend$LegendPosition[com.github.mikephil.charting.components.Legend.LegendPosition.BELOW_CHART_RIGHT.ordinal()] = 12;
            } catch (java.lang.NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$github$mikephil$charting$components$Legend$LegendPosition[com.github.mikephil.charting.components.Legend.LegendPosition.PIECHART_CENTER.ordinal()] = 13;
            } catch (java.lang.NoSuchFieldError unused15) {
            }
        }
    }
}
