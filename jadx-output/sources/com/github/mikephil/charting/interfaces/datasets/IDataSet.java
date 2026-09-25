package com.github.mikephil.charting.interfaces.datasets;

/* JADX INFO: loaded from: classes.dex */
public interface IDataSet<T extends com.github.mikephil.charting.data.Entry> {
    boolean addEntry(T t);

    void addEntryOrdered(T t);

    void calcMinMax();

    void calcMinMaxY(float f, float f2);

    void clear();

    boolean contains(T t);

    com.github.mikephil.charting.components.YAxis.AxisDependency getAxisDependency();

    int getColor();

    int getColor(int i);

    java.util.List<java.lang.Integer> getColors();

    java.util.List<T> getEntriesForXValue(float f);

    int getEntryCount();

    T getEntryForIndex(int i);

    T getEntryForXValue(float f, float f2);

    T getEntryForXValue(float f, float f2, com.github.mikephil.charting.data.DataSet.Rounding rounding);

    int getEntryIndex(float f, float f2, com.github.mikephil.charting.data.DataSet.Rounding rounding);

    int getEntryIndex(T t);

    com.github.mikephil.charting.components.Legend.LegendForm getForm();

    android.graphics.DashPathEffect getFormLineDashEffect();

    float getFormLineWidth();

    float getFormSize();

    com.github.mikephil.charting.utils.MPPointF getIconsOffset();

    int getIndexInEntries(int i);

    java.lang.String getLabel();

    com.github.mikephil.charting.formatter.IValueFormatter getValueFormatter();

    int getValueTextColor();

    int getValueTextColor(int i);

    float getValueTextSize();

    android.graphics.Typeface getValueTypeface();

    float getXMax();

    float getXMin();

    float getYMax();

    float getYMin();

    boolean isDrawIconsEnabled();

    boolean isDrawValuesEnabled();

    boolean isHighlightEnabled();

    boolean isVisible();

    boolean needsFormatter();

    boolean removeEntry(int i);

    boolean removeEntry(T t);

    boolean removeEntryByXValue(float f);

    boolean removeFirst();

    boolean removeLast();

    void setAxisDependency(com.github.mikephil.charting.components.YAxis.AxisDependency axisDependency);

    void setDrawIcons(boolean z);

    void setDrawValues(boolean z);

    void setHighlightEnabled(boolean z);

    void setIconsOffset(com.github.mikephil.charting.utils.MPPointF mPPointF);

    void setLabel(java.lang.String str);

    void setValueFormatter(com.github.mikephil.charting.formatter.IValueFormatter iValueFormatter);

    void setValueTextColor(int i);

    void setValueTextColors(java.util.List<java.lang.Integer> list);

    void setValueTextSize(float f);

    void setValueTypeface(android.graphics.Typeface typeface);

    void setVisible(boolean z);
}
