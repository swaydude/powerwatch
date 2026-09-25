package com.google.android.gms.vision.text;

/* JADX INFO: compiled from: com.google.android.gms:play-services-vision@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
public interface Text {
    android.graphics.Rect getBoundingBox();

    java.util.List<? extends com.google.android.gms.vision.text.Text> getComponents();

    android.graphics.Point[] getCornerPoints();

    java.lang.String getValue();
}
