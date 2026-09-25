package com.google.android.gms.vision.text;

/* JADX INFO: compiled from: com.google.android.gms:play-services-vision@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
public class TextBlock implements com.google.android.gms.vision.text.Text {
    private android.graphics.Point[] cornerPoints;
    private com.google.android.gms.internal.vision.zzac[] zzea;
    private java.util.List<com.google.android.gms.vision.text.Line> zzeb;
    private java.lang.String zzec;
    private android.graphics.Rect zzed;

    TextBlock(android.util.SparseArray<com.google.android.gms.internal.vision.zzac> sparseArray) {
        this.zzea = new com.google.android.gms.internal.vision.zzac[sparseArray.size()];
        int i = 0;
        while (true) {
            com.google.android.gms.internal.vision.zzac[] zzacVarArr = this.zzea;
            if (i >= zzacVarArr.length) {
                return;
            }
            zzacVarArr[i] = sparseArray.valueAt(i);
            i++;
        }
    }

    public java.lang.String getLanguage() {
        java.lang.String str = this.zzec;
        if (str != null) {
            return str;
        }
        java.util.HashMap map = new java.util.HashMap();
        for (com.google.android.gms.internal.vision.zzac zzacVar : this.zzea) {
            map.put(zzacVar.zzec, java.lang.Integer.valueOf((map.containsKey(zzacVar.zzec) ? ((java.lang.Integer) map.get(zzacVar.zzec)).intValue() : 0) + 1));
        }
        java.lang.String str2 = (java.lang.String) ((java.util.Map.Entry) java.util.Collections.max(map.entrySet(), new com.google.android.gms.vision.text.zza(this))).getKey();
        this.zzec = str2;
        if (str2 == null || str2.isEmpty()) {
            this.zzec = "und";
        }
        return this.zzec;
    }

    @Override // com.google.android.gms.vision.text.Text
    public java.lang.String getValue() {
        com.google.android.gms.internal.vision.zzac[] zzacVarArr = this.zzea;
        if (zzacVarArr.length == 0) {
            return "";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(zzacVarArr[0].zzel);
        for (int i = 1; i < this.zzea.length; i++) {
            sb.append("\n");
            sb.append(this.zzea[i].zzel);
        }
        return sb.toString();
    }

    @Override // com.google.android.gms.vision.text.Text
    public android.graphics.Point[] getCornerPoints() {
        com.google.android.gms.vision.text.TextBlock textBlock;
        com.google.android.gms.internal.vision.zzac[] zzacVarArr;
        com.google.android.gms.vision.text.TextBlock textBlock2 = this;
        if (textBlock2.cornerPoints == null) {
            char c = 0;
            if (textBlock2.zzea.length == 0) {
                textBlock2.cornerPoints = new android.graphics.Point[0];
                textBlock = textBlock2;
            } else {
                int iMax = Integer.MIN_VALUE;
                int iMax2 = Integer.MIN_VALUE;
                int iMin = Integer.MAX_VALUE;
                int iMin2 = Integer.MAX_VALUE;
                int i = 0;
                while (true) {
                    zzacVarArr = textBlock2.zzea;
                    if (i >= zzacVarArr.length) {
                        break;
                    }
                    com.google.android.gms.internal.vision.zzw zzwVar = zzacVarArr[i].zzei;
                    com.google.android.gms.internal.vision.zzw zzwVar2 = textBlock2.zzea[c].zzei;
                    int i2 = -zzwVar2.left;
                    int i3 = -zzwVar2.top;
                    double dSin = java.lang.Math.sin(java.lang.Math.toRadians(zzwVar2.zzeg));
                    double dCos = java.lang.Math.cos(java.lang.Math.toRadians(zzwVar2.zzeg));
                    android.graphics.Point[] pointArr = new android.graphics.Point[4];
                    pointArr[c] = new android.graphics.Point(zzwVar.left, zzwVar.top);
                    pointArr[c].offset(i2, i3);
                    int i4 = iMax2;
                    int i5 = (int) ((((double) pointArr[c].x) * dCos) + (((double) pointArr[c].y) * dSin));
                    int i6 = (int) ((((double) (-pointArr[0].x)) * dSin) + (((double) pointArr[0].y) * dCos));
                    pointArr[0].x = i5;
                    pointArr[0].y = i6;
                    pointArr[1] = new android.graphics.Point(zzwVar.width + i5, i6);
                    pointArr[2] = new android.graphics.Point(zzwVar.width + i5, zzwVar.height + i6);
                    pointArr[3] = new android.graphics.Point(i5, i6 + zzwVar.height);
                    iMax2 = i4;
                    for (int i7 = 0; i7 < 4; i7++) {
                        android.graphics.Point point = pointArr[i7];
                        iMin = java.lang.Math.min(iMin, point.x);
                        iMax = java.lang.Math.max(iMax, point.x);
                        iMin2 = java.lang.Math.min(iMin2, point.y);
                        iMax2 = java.lang.Math.max(iMax2, point.y);
                    }
                    i++;
                    c = 0;
                    textBlock2 = this;
                }
                int i8 = iMax2;
                com.google.android.gms.internal.vision.zzw zzwVar3 = zzacVarArr[0].zzei;
                int i9 = zzwVar3.left;
                int i10 = zzwVar3.top;
                double dSin2 = java.lang.Math.sin(java.lang.Math.toRadians(zzwVar3.zzeg));
                double dCos2 = java.lang.Math.cos(java.lang.Math.toRadians(zzwVar3.zzeg));
                android.graphics.Point[] pointArr2 = {new android.graphics.Point(iMin, iMin2), new android.graphics.Point(iMax, iMin2), new android.graphics.Point(iMax, i8), new android.graphics.Point(iMin, i8)};
                for (int i11 = 0; i11 < 4; i11++) {
                    int i12 = (int) ((((double) pointArr2[i11].x) * dCos2) - (((double) pointArr2[i11].y) * dSin2));
                    int i13 = (int) ((((double) pointArr2[i11].x) * dSin2) + (((double) pointArr2[i11].y) * dCos2));
                    pointArr2[i11].x = i12;
                    pointArr2[i11].y = i13;
                    pointArr2[i11].offset(i9, i10);
                }
                textBlock = this;
                textBlock.cornerPoints = pointArr2;
            }
        } else {
            textBlock = textBlock2;
        }
        return textBlock.cornerPoints;
    }

    @Override // com.google.android.gms.vision.text.Text
    public java.util.List<? extends com.google.android.gms.vision.text.Text> getComponents() {
        if (this.zzea.length == 0) {
            return new java.util.ArrayList(0);
        }
        if (this.zzeb == null) {
            this.zzeb = new java.util.ArrayList(this.zzea.length);
            for (com.google.android.gms.internal.vision.zzac zzacVar : this.zzea) {
                this.zzeb.add(new com.google.android.gms.vision.text.Line(zzacVar));
            }
        }
        return this.zzeb;
    }

    @Override // com.google.android.gms.vision.text.Text
    public android.graphics.Rect getBoundingBox() {
        if (this.zzed == null) {
            this.zzed = com.google.android.gms.vision.text.zzc.zza(this);
        }
        return this.zzed;
    }
}
