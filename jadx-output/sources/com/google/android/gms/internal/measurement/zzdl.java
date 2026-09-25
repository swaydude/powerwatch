package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzdl<MessageType extends com.google.android.gms.internal.measurement.zzdl<MessageType, BuilderType>, BuilderType extends com.google.android.gms.internal.measurement.zzdn<MessageType, BuilderType>> implements com.google.android.gms.internal.measurement.zzgo {
    protected int zza = 0;

    @Override // com.google.android.gms.internal.measurement.zzgo
    public final com.google.android.gms.internal.measurement.zzdu zzbh() {
        try {
            com.google.android.gms.internal.measurement.zzec zzecVarZzc = com.google.android.gms.internal.measurement.zzdu.zzc(zzbn());
            zza(zzecVarZzc.zzb());
            return zzecVarZzc.zza();
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

    public final byte[] zzbi() {
        try {
            byte[] bArr = new byte[zzbn()];
            com.google.android.gms.internal.measurement.zzen zzenVarZza = com.google.android.gms.internal.measurement.zzen.zza(bArr);
            zza(zzenVarZza);
            zzenVarZza.zzb();
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

    int zzbj() {
        throw new java.lang.UnsupportedOperationException();
    }

    void zzc(int i) {
        throw new java.lang.UnsupportedOperationException();
    }

    protected static <T> void zza(java.lang.Iterable<T> iterable, java.util.List<? super T> list) {
        com.google.android.gms.internal.measurement.zzff.zza(iterable);
        if (iterable instanceof com.google.android.gms.internal.measurement.zzfv) {
            java.util.List<?> listZzb = ((com.google.android.gms.internal.measurement.zzfv) iterable).zzb();
            com.google.android.gms.internal.measurement.zzfv zzfvVar = (com.google.android.gms.internal.measurement.zzfv) list;
            int size = list.size();
            for (java.lang.Object obj : listZzb) {
                if (obj == null) {
                    int size2 = zzfvVar.size() - size;
                    java.lang.StringBuilder sb = new java.lang.StringBuilder(37);
                    sb.append("Element at index ");
                    sb.append(size2);
                    sb.append(" is null.");
                    java.lang.String string = sb.toString();
                    for (int size3 = zzfvVar.size() - 1; size3 >= size; size3--) {
                        zzfvVar.remove(size3);
                    }
                    throw new java.lang.NullPointerException(string);
                }
                if (obj instanceof com.google.android.gms.internal.measurement.zzdu) {
                    zzfvVar.zza((com.google.android.gms.internal.measurement.zzdu) obj);
                } else {
                    zzfvVar.add((java.lang.String) obj);
                }
            }
            return;
        }
        if (iterable instanceof com.google.android.gms.internal.measurement.zzha) {
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
