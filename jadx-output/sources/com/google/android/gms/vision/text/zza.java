package com.google.android.gms.vision.text;

/* JADX INFO: compiled from: com.google.android.gms:play-services-vision@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zza implements java.util.Comparator<java.util.Map.Entry<java.lang.String, java.lang.Integer>> {
    zza(com.google.android.gms.vision.text.TextBlock textBlock) {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(java.util.Map.Entry<java.lang.String, java.lang.Integer> entry, java.util.Map.Entry<java.lang.String, java.lang.Integer> entry2) {
        return entry.getValue().compareTo(entry2.getValue());
    }
}
