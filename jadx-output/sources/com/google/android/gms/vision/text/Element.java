package com.google.android.gms.vision.text;

/* JADX INFO: compiled from: com.google.android.gms:play-services-vision@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
public class Element implements com.google.android.gms.vision.text.Text {
    private com.google.android.gms.internal.vision.zzaj zzdx;

    Element(com.google.android.gms.internal.vision.zzaj zzajVar) {
        this.zzdx = zzajVar;
    }

    public java.lang.String getLanguage() {
        return this.zzdx.zzec;
    }

    @Override // com.google.android.gms.vision.text.Text
    public java.lang.String getValue() {
        return this.zzdx.zzel;
    }

    @Override // com.google.android.gms.vision.text.Text
    public android.graphics.Rect getBoundingBox() {
        return com.google.android.gms.vision.text.zzc.zza(this);
    }

    @Override // com.google.android.gms.vision.text.Text
    public android.graphics.Point[] getCornerPoints() {
        return com.google.android.gms.vision.text.zzc.zza(this.zzdx.zzei);
    }

    @Override // com.google.android.gms.vision.text.Text
    public java.util.List<? extends com.google.android.gms.vision.text.Text> getComponents() {
        return new java.util.ArrayList();
    }
}
