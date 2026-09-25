package com.google.android.gms.internal.clearcut;

/* JADX INFO: loaded from: classes.dex */
final class zzfx implements java.lang.Cloneable {
    private java.lang.Object value;
    private com.google.android.gms.internal.clearcut.zzfv<?, ?> zzrp;
    private java.util.List<java.lang.Object> zzrq = new java.util.ArrayList();

    zzfx() {
    }

    private final byte[] toByteArray() throws java.io.IOException {
        byte[] bArr = new byte[zzen()];
        zza(com.google.android.gms.internal.clearcut.zzfs.zzg(bArr));
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzeq, reason: merged with bridge method [inline-methods] */
    public final com.google.android.gms.internal.clearcut.zzfx clone() {
        java.lang.Object objClone;
        com.google.android.gms.internal.clearcut.zzfx zzfxVar = new com.google.android.gms.internal.clearcut.zzfx();
        try {
            zzfxVar.zzrp = this.zzrp;
            java.util.List<java.lang.Object> list = this.zzrq;
            if (list == null) {
                zzfxVar.zzrq = null;
            } else {
                zzfxVar.zzrq.addAll(list);
            }
            java.lang.Object obj = this.value;
            if (obj != null) {
                if (obj instanceof com.google.android.gms.internal.clearcut.zzfz) {
                    objClone = (com.google.android.gms.internal.clearcut.zzfz) ((com.google.android.gms.internal.clearcut.zzfz) obj).clone();
                } else if (obj instanceof byte[]) {
                    objClone = ((byte[]) obj).clone();
                } else {
                    int i = 0;
                    if (obj instanceof byte[][]) {
                        byte[][] bArr = (byte[][]) obj;
                        byte[][] bArr2 = new byte[bArr.length][];
                        zzfxVar.value = bArr2;
                        while (i < bArr.length) {
                            bArr2[i] = (byte[]) bArr[i].clone();
                            i++;
                        }
                    } else if (obj instanceof boolean[]) {
                        objClone = ((boolean[]) obj).clone();
                    } else if (obj instanceof int[]) {
                        objClone = ((int[]) obj).clone();
                    } else if (obj instanceof long[]) {
                        objClone = ((long[]) obj).clone();
                    } else if (obj instanceof float[]) {
                        objClone = ((float[]) obj).clone();
                    } else if (obj instanceof double[]) {
                        objClone = ((double[]) obj).clone();
                    } else if (obj instanceof com.google.android.gms.internal.clearcut.zzfz[]) {
                        com.google.android.gms.internal.clearcut.zzfz[] zzfzVarArr = (com.google.android.gms.internal.clearcut.zzfz[]) obj;
                        com.google.android.gms.internal.clearcut.zzfz[] zzfzVarArr2 = new com.google.android.gms.internal.clearcut.zzfz[zzfzVarArr.length];
                        zzfxVar.value = zzfzVarArr2;
                        while (i < zzfzVarArr.length) {
                            zzfzVarArr2[i] = (com.google.android.gms.internal.clearcut.zzfz) zzfzVarArr[i].clone();
                            i++;
                        }
                    }
                }
                zzfxVar.value = objClone;
            }
            return zzfxVar;
        } catch (java.lang.CloneNotSupportedException e) {
            throw new java.lang.AssertionError(e);
        }
    }

    public final boolean equals(java.lang.Object obj) {
        java.util.List<java.lang.Object> list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.clearcut.zzfx)) {
            return false;
        }
        com.google.android.gms.internal.clearcut.zzfx zzfxVar = (com.google.android.gms.internal.clearcut.zzfx) obj;
        if (this.value == null || zzfxVar.value == null) {
            java.util.List<java.lang.Object> list2 = this.zzrq;
            if (list2 != null && (list = zzfxVar.zzrq) != null) {
                return list2.equals(list);
            }
            try {
                return java.util.Arrays.equals(toByteArray(), zzfxVar.toByteArray());
            } catch (java.io.IOException e) {
                throw new java.lang.IllegalStateException(e);
            }
        }
        com.google.android.gms.internal.clearcut.zzfv<?, ?> zzfvVar = this.zzrp;
        if (zzfvVar != zzfxVar.zzrp) {
            return false;
        }
        if (!zzfvVar.zzrk.isArray()) {
            return this.value.equals(zzfxVar.value);
        }
        java.lang.Object obj2 = this.value;
        if (obj2 instanceof byte[]) {
            return java.util.Arrays.equals((byte[]) obj2, (byte[]) zzfxVar.value);
        }
        if (obj2 instanceof int[]) {
            return java.util.Arrays.equals((int[]) obj2, (int[]) zzfxVar.value);
        }
        if (obj2 instanceof long[]) {
            return java.util.Arrays.equals((long[]) obj2, (long[]) zzfxVar.value);
        }
        if (obj2 instanceof float[]) {
            return java.util.Arrays.equals((float[]) obj2, (float[]) zzfxVar.value);
        }
        if (obj2 instanceof double[]) {
            return java.util.Arrays.equals((double[]) obj2, (double[]) zzfxVar.value);
        }
        return obj2 instanceof boolean[] ? java.util.Arrays.equals((boolean[]) obj2, (boolean[]) zzfxVar.value) : java.util.Arrays.deepEquals((java.lang.Object[]) obj2, (java.lang.Object[]) zzfxVar.value);
    }

    public final int hashCode() {
        try {
            return java.util.Arrays.hashCode(toByteArray()) + 527;
        } catch (java.io.IOException e) {
            throw new java.lang.IllegalStateException(e);
        }
    }

    final void zza(com.google.android.gms.internal.clearcut.zzfs zzfsVar) throws java.io.IOException {
        if (this.value != null) {
            throw new java.lang.NoSuchMethodError();
        }
        java.util.Iterator<java.lang.Object> it = this.zzrq.iterator();
        if (it.hasNext()) {
            it.next();
            throw new java.lang.NoSuchMethodError();
        }
    }

    final int zzen() {
        if (this.value != null) {
            throw new java.lang.NoSuchMethodError();
        }
        java.util.Iterator<java.lang.Object> it = this.zzrq.iterator();
        if (!it.hasNext()) {
            return 0;
        }
        it.next();
        throw new java.lang.NoSuchMethodError();
    }
}
