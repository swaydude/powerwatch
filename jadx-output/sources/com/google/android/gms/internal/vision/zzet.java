package com.google.android.gms.internal.vision;

/* JADX INFO: compiled from: com.google.android.gms:play-services-vision-common@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzet<MessageType extends com.google.android.gms.internal.vision.zzet<MessageType, BuilderType>, BuilderType extends com.google.android.gms.internal.vision.zzew<MessageType, BuilderType>> implements com.google.android.gms.internal.vision.zzic {
    protected int zzri = 0;

    @Override // com.google.android.gms.internal.vision.zzic
    public final com.google.android.gms.internal.vision.zzfh zzdk() {
        try {
            com.google.android.gms.internal.vision.zzfp zzfpVarZzap = com.google.android.gms.internal.vision.zzfh.zzap(zzgf());
            zzb(zzfpVarZzap.zzew());
            return zzfpVarZzap.zzev();
        } catch (java.io.IOException e) {
            java.lang.String name = getClass().getName();
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(name).length() + 62 + "ByteString".length());
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a ");
            sb.append("ByteString");
            sb.append(" threw an IOException (should never happen).");
            throw new java.lang.RuntimeException(sb.toString(), e);
        }
    }

    public final byte[] toByteArray() {
        try {
            byte[] bArr = new byte[zzgf()];
            com.google.android.gms.internal.vision.zzga zzgaVarZze = com.google.android.gms.internal.vision.zzga.zze(bArr);
            zzb(zzgaVarZze);
            zzgaVarZze.zzfh();
            return bArr;
        } catch (java.io.IOException e) {
            java.lang.String name = getClass().getName();
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(name).length() + 62 + "byte array".length());
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a ");
            sb.append("byte array");
            sb.append(" threw an IOException (should never happen).");
            throw new java.lang.RuntimeException(sb.toString(), e);
        }
    }

    int zzdl() {
        throw new java.lang.UnsupportedOperationException();
    }

    void zzad(int i) {
        throw new java.lang.UnsupportedOperationException();
    }

    protected static <T> void zza(java.lang.Iterable<T> iterable, java.util.List<? super T> list) {
        com.google.android.gms.internal.vision.zzgt.checkNotNull(iterable);
        if (iterable instanceof com.google.android.gms.internal.vision.zzhj) {
            java.util.List<?> listZzgx = ((com.google.android.gms.internal.vision.zzhj) iterable).zzgx();
            com.google.android.gms.internal.vision.zzhj zzhjVar = (com.google.android.gms.internal.vision.zzhj) list;
            int size = list.size();
            for (java.lang.Object obj : listZzgx) {
                if (obj == null) {
                    int size2 = zzhjVar.size() - size;
                    java.lang.StringBuilder sb = new java.lang.StringBuilder(37);
                    sb.append("Element at index ");
                    sb.append(size2);
                    sb.append(" is null.");
                    java.lang.String string = sb.toString();
                    for (int size3 = zzhjVar.size() - 1; size3 >= size; size3--) {
                        zzhjVar.remove(size3);
                    }
                    throw new java.lang.NullPointerException(string);
                }
                if (obj instanceof com.google.android.gms.internal.vision.zzfh) {
                    zzhjVar.zzc((com.google.android.gms.internal.vision.zzfh) obj);
                } else {
                    zzhjVar.add((java.lang.String) obj);
                }
            }
            return;
        }
        if (iterable instanceof com.google.android.gms.internal.vision.zzio) {
            list.addAll((java.util.Collection) iterable);
            return;
        }
        if ((list instanceof java.util.ArrayList) && (iterable instanceof java.util.Collection)) {
            ((java.util.ArrayList) list).ensureCapacity(list.size() + ((java.util.Collection) iterable).size());
        }
        int size4 = list.size();
        for (T t : iterable) {
            if (t == null) {
                int size5 = list.size() - size4;
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder(37);
                sb2.append("Element at index ");
                sb2.append(size5);
                sb2.append(" is null.");
                java.lang.String string2 = sb2.toString();
                for (int size6 = list.size() - 1; size6 >= size4; size6--) {
                    list.remove(size6);
                }
                throw new java.lang.NullPointerException(string2);
            }
            list.add(t);
        }
    }
}
