package com.github.mikephil.charting.listener;

/* JADX INFO: loaded from: classes.dex */
public interface OnDrawListener {
    void onDrawFinished(com.github.mikephil.charting.data.DataSet<?> dataSet);

    void onEntryAdded(com.github.mikephil.charting.data.Entry entry);

    void onEntryMoved(com.github.mikephil.charting.data.Entry entry);
}
