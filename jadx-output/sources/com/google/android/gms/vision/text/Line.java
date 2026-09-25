package com.google.android.gms.vision.text;

/* JADX INFO: compiled from: com.google.android.gms:play-services-vision@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
public class Line implements com.google.android.gms.vision.text.Text {
    private com.google.android.gms.internal.vision.zzac zzdy;
    private java.util.List<com.google.android.gms.vision.text.Element> zzdz;

    Line(com.google.android.gms.internal.vision.zzac zzacVar) {
        this.zzdy = zzacVar;
    }

    public java.lang.String getLanguage() {
        return this.zzdy.zzec;
    }

    @Override // com.google.android.gms.vision.text.Text
    public java.lang.String getValue() {
        return this.zzdy.zzel;
    }

    @Override // com.google.android.gms.vision.text.Text
    public android.graphics.Rect getBoundingBox() {
        return com.google.android.gms.vision.text.zzc.zza(this);
    }

    @Override // com.google.android.gms.vision.text.Text
    public android.graphics.Point[] getCornerPoints() {
        return com.google.android.gms.vision.text.zzc.zza(this.zzdy.zzei);
    }

    @Override // com.google.android.gms.vision.text.Text
    public java.util.List<? extends com.google.android.gms.vision.text.Text> getComponents() {
        if (this.zzdy.zzeh.length == 0) {
            return new java.util.ArrayList(0);
        }
        if (this.zzdz == null) {
            this.zzdz = new java.util.ArrayList(this.zzdy.zzeh.length);
            for (com.google.android.gms.internal.vision.zzaj zzajVar : this.zzdy.zzeh) {
                this.zzdz.add(new com.google.android.gms.vision.text.Element(zzajVar));
            }
        }
        return this.zzdz;
    }

    public float getAngle() {
        return this.zzdy.zzei.zzeg;
    }

    public boolean isVertical() {
        return this.zzdy.zzen;
    }
}
