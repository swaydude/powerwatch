package com.google.android.gms.internal.vision;

/* JADX INFO: compiled from: com.google.android.gms:play-services-vision-common@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzgh extends com.google.android.gms.internal.vision.zzgf<com.google.android.gms.internal.vision.zzgs.zzd> {
    zzgh() {
    }

    @Override // com.google.android.gms.internal.vision.zzgf
    final boolean zze(com.google.android.gms.internal.vision.zzic zzicVar) {
        return zzicVar instanceof com.google.android.gms.internal.vision.zzgs.zze;
    }

    @Override // com.google.android.gms.internal.vision.zzgf
    final com.google.android.gms.internal.vision.zzgi<com.google.android.gms.internal.vision.zzgs.zzd> zze(java.lang.Object obj) {
        return ((com.google.android.gms.internal.vision.zzgs.zze) obj).zzwk;
    }

    @Override // com.google.android.gms.internal.vision.zzgf
    final com.google.android.gms.internal.vision.zzgi<com.google.android.gms.internal.vision.zzgs.zzd> zzf(java.lang.Object obj) {
        return ((com.google.android.gms.internal.vision.zzgs.zze) obj).zzgk();
    }

    @Override // com.google.android.gms.internal.vision.zzgf
    final void zzg(java.lang.Object obj) {
        zze(obj).zzdp();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.vision.zzgf
    final <UT, UB> UB zza(com.google.android.gms.internal.vision.zzis zzisVar, java.lang.Object obj, com.google.android.gms.internal.vision.zzgd zzgdVar, com.google.android.gms.internal.vision.zzgi<com.google.android.gms.internal.vision.zzgs.zzd> zzgiVar, UB ub, com.google.android.gms.internal.vision.zzjj<UT, UB> zzjjVar) throws java.io.IOException {
        java.lang.Object objZza;
        java.util.ArrayList arrayList;
        com.google.android.gms.internal.vision.zzgs.zzg zzgVar = (com.google.android.gms.internal.vision.zzgs.zzg) obj;
        int i = zzgVar.zzxb.number;
        if (zzgVar.zzxb.zzwi && zzgVar.zzxb.zzwj) {
            switch (com.google.android.gms.internal.vision.zzgg.zzrr[zzgVar.zzxb.zzwh.ordinal()]) {
                case 1:
                    arrayList = new java.util.ArrayList();
                    zzisVar.zza(arrayList);
                    break;
                case 2:
                    arrayList = new java.util.ArrayList();
                    zzisVar.zzb(arrayList);
                    break;
                case 3:
                    arrayList = new java.util.ArrayList();
                    zzisVar.zzd(arrayList);
                    break;
                case 4:
                    arrayList = new java.util.ArrayList();
                    zzisVar.zzc(arrayList);
                    break;
                case 5:
                    arrayList = new java.util.ArrayList();
                    zzisVar.zze(arrayList);
                    break;
                case 6:
                    arrayList = new java.util.ArrayList();
                    zzisVar.zzf(arrayList);
                    break;
                case 7:
                    arrayList = new java.util.ArrayList();
                    zzisVar.zzg(arrayList);
                    break;
                case 8:
                    arrayList = new java.util.ArrayList();
                    zzisVar.zzh(arrayList);
                    break;
                case 9:
                    arrayList = new java.util.ArrayList();
                    zzisVar.zzk(arrayList);
                    break;
                case 10:
                    arrayList = new java.util.ArrayList();
                    zzisVar.zzm(arrayList);
                    break;
                case 11:
                    arrayList = new java.util.ArrayList();
                    zzisVar.zzn(arrayList);
                    break;
                case 12:
                    arrayList = new java.util.ArrayList();
                    zzisVar.zzo(arrayList);
                    break;
                case 13:
                    arrayList = new java.util.ArrayList();
                    zzisVar.zzp(arrayList);
                    break;
                case 14:
                    arrayList = new java.util.ArrayList();
                    zzisVar.zzl(arrayList);
                    ub = (UB) com.google.android.gms.internal.vision.zzit.zza(i, arrayList, zzgVar.zzxb.zzwg, ub, zzjjVar);
                    break;
                default:
                    java.lang.String strValueOf = java.lang.String.valueOf(zzgVar.zzxb.zzwh);
                    java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(strValueOf).length() + 23);
                    sb.append("Type cannot be packed: ");
                    sb.append(strValueOf);
                    throw new java.lang.IllegalStateException(sb.toString());
            }
            zzgiVar.zza(zzgVar.zzxb, arrayList);
        } else {
            java.lang.Object objValueOf = null;
            if (zzgVar.zzxb.zzwh == com.google.android.gms.internal.vision.zzka.zzabz) {
                int iZzdy = zzisVar.zzdy();
                if (zzgVar.zzxb.zzwg.zzg(iZzdy) == null) {
                    return (UB) com.google.android.gms.internal.vision.zzit.zza(i, iZzdy, ub, zzjjVar);
                }
                objValueOf = java.lang.Integer.valueOf(iZzdy);
            } else {
                switch (com.google.android.gms.internal.vision.zzgg.zzrr[zzgVar.zzxb.zzwh.ordinal()]) {
                    case 1:
                        objValueOf = java.lang.Double.valueOf(zzisVar.readDouble());
                        break;
                    case 2:
                        objValueOf = java.lang.Float.valueOf(zzisVar.readFloat());
                        break;
                    case 3:
                        objValueOf = java.lang.Long.valueOf(zzisVar.zzdx());
                        break;
                    case 4:
                        objValueOf = java.lang.Long.valueOf(zzisVar.zzdw());
                        break;
                    case 5:
                        objValueOf = java.lang.Integer.valueOf(zzisVar.zzdy());
                        break;
                    case 6:
                        objValueOf = java.lang.Long.valueOf(zzisVar.zzdz());
                        break;
                    case 7:
                        objValueOf = java.lang.Integer.valueOf(zzisVar.zzea());
                        break;
                    case 8:
                        objValueOf = java.lang.Boolean.valueOf(zzisVar.zzeb());
                        break;
                    case 9:
                        objValueOf = java.lang.Integer.valueOf(zzisVar.zzee());
                        break;
                    case 10:
                        objValueOf = java.lang.Integer.valueOf(zzisVar.zzeg());
                        break;
                    case 11:
                        objValueOf = java.lang.Long.valueOf(zzisVar.zzeh());
                        break;
                    case 12:
                        objValueOf = java.lang.Integer.valueOf(zzisVar.zzei());
                        break;
                    case 13:
                        objValueOf = java.lang.Long.valueOf(zzisVar.zzej());
                        break;
                    case 14:
                        throw new java.lang.IllegalStateException("Shouldn't reach here.");
                    case 15:
                        objValueOf = zzisVar.zzed();
                        break;
                    case 16:
                        objValueOf = zzisVar.readString();
                        break;
                    case 17:
                        objValueOf = zzisVar.zzb(zzgVar.zzxa.getClass(), zzgdVar);
                        break;
                    case 18:
                        objValueOf = zzisVar.zza(zzgVar.zzxa.getClass(), zzgdVar);
                        break;
                }
            }
            if (zzgVar.zzxb.zzwi) {
                zzgiVar.zzb(zzgVar.zzxb, objValueOf);
            } else {
                int i2 = com.google.android.gms.internal.vision.zzgg.zzrr[zzgVar.zzxb.zzwh.ordinal()];
                if ((i2 == 17 || i2 == 18) && (objZza = zzgiVar.zza(zzgVar.zzxb)) != null) {
                    objValueOf = com.google.android.gms.internal.vision.zzgt.zzb(objZza, objValueOf);
                }
                zzgiVar.zza(zzgVar.zzxb, objValueOf);
            }
        }
        return ub;
    }

    @Override // com.google.android.gms.internal.vision.zzgf
    final int zza(java.util.Map.Entry<?, ?> entry) {
        return ((com.google.android.gms.internal.vision.zzgs.zzd) entry.getKey()).number;
    }

    @Override // com.google.android.gms.internal.vision.zzgf
    final void zza(com.google.android.gms.internal.vision.zzkg zzkgVar, java.util.Map.Entry<?, ?> entry) throws java.io.IOException {
        com.google.android.gms.internal.vision.zzgs.zzd zzdVar = (com.google.android.gms.internal.vision.zzgs.zzd) entry.getKey();
        if (zzdVar.zzwi) {
            switch (com.google.android.gms.internal.vision.zzgg.zzrr[zzdVar.zzwh.ordinal()]) {
                case 1:
                    com.google.android.gms.internal.vision.zzit.zza(zzdVar.number, (java.util.List<java.lang.Double>) entry.getValue(), zzkgVar, zzdVar.zzwj);
                    break;
                case 2:
                    com.google.android.gms.internal.vision.zzit.zzb(zzdVar.number, (java.util.List<java.lang.Float>) entry.getValue(), zzkgVar, zzdVar.zzwj);
                    break;
                case 3:
                    com.google.android.gms.internal.vision.zzit.zzc(zzdVar.number, (java.util.List) entry.getValue(), zzkgVar, zzdVar.zzwj);
                    break;
                case 4:
                    com.google.android.gms.internal.vision.zzit.zzd(zzdVar.number, (java.util.List) entry.getValue(), zzkgVar, zzdVar.zzwj);
                    break;
                case 5:
                    com.google.android.gms.internal.vision.zzit.zzh(zzdVar.number, (java.util.List) entry.getValue(), zzkgVar, zzdVar.zzwj);
                    break;
                case 6:
                    com.google.android.gms.internal.vision.zzit.zzf(zzdVar.number, (java.util.List) entry.getValue(), zzkgVar, zzdVar.zzwj);
                    break;
                case 7:
                    com.google.android.gms.internal.vision.zzit.zzk(zzdVar.number, (java.util.List) entry.getValue(), zzkgVar, zzdVar.zzwj);
                    break;
                case 8:
                    com.google.android.gms.internal.vision.zzit.zzn(zzdVar.number, (java.util.List) entry.getValue(), zzkgVar, zzdVar.zzwj);
                    break;
                case 9:
                    com.google.android.gms.internal.vision.zzit.zzi(zzdVar.number, (java.util.List) entry.getValue(), zzkgVar, zzdVar.zzwj);
                    break;
                case 10:
                    com.google.android.gms.internal.vision.zzit.zzl(zzdVar.number, (java.util.List) entry.getValue(), zzkgVar, zzdVar.zzwj);
                    break;
                case 11:
                    com.google.android.gms.internal.vision.zzit.zzg(zzdVar.number, (java.util.List) entry.getValue(), zzkgVar, zzdVar.zzwj);
                    break;
                case 12:
                    com.google.android.gms.internal.vision.zzit.zzj(zzdVar.number, (java.util.List) entry.getValue(), zzkgVar, zzdVar.zzwj);
                    break;
                case 13:
                    com.google.android.gms.internal.vision.zzit.zze(zzdVar.number, (java.util.List) entry.getValue(), zzkgVar, zzdVar.zzwj);
                    break;
                case 14:
                    com.google.android.gms.internal.vision.zzit.zzh(zzdVar.number, (java.util.List) entry.getValue(), zzkgVar, zzdVar.zzwj);
                    break;
                case 15:
                    com.google.android.gms.internal.vision.zzit.zzb(zzdVar.number, (java.util.List) entry.getValue(), zzkgVar);
                    break;
                case 16:
                    com.google.android.gms.internal.vision.zzit.zza(zzdVar.number, (java.util.List<java.lang.String>) entry.getValue(), zzkgVar);
                    break;
                case 17:
                    java.util.List list = (java.util.List) entry.getValue();
                    if (list != null && !list.isEmpty()) {
                        com.google.android.gms.internal.vision.zzit.zzb(zzdVar.number, (java.util.List<?>) entry.getValue(), zzkgVar, com.google.android.gms.internal.vision.zzin.zzho().zzf(list.get(0).getClass()));
                        break;
                    }
                    break;
                case 18:
                    java.util.List list2 = (java.util.List) entry.getValue();
                    if (list2 != null && !list2.isEmpty()) {
                        com.google.android.gms.internal.vision.zzit.zza(zzdVar.number, (java.util.List<?>) entry.getValue(), zzkgVar, com.google.android.gms.internal.vision.zzin.zzho().zzf(list2.get(0).getClass()));
                        break;
                    }
                    break;
            }
        }
        switch (com.google.android.gms.internal.vision.zzgg.zzrr[zzdVar.zzwh.ordinal()]) {
            case 1:
                zzkgVar.zza(zzdVar.number, ((java.lang.Double) entry.getValue()).doubleValue());
                break;
            case 2:
                zzkgVar.zza(zzdVar.number, ((java.lang.Float) entry.getValue()).floatValue());
                break;
            case 3:
                zzkgVar.zzi(zzdVar.number, ((java.lang.Long) entry.getValue()).longValue());
                break;
            case 4:
                zzkgVar.zza(zzdVar.number, ((java.lang.Long) entry.getValue()).longValue());
                break;
            case 5:
                zzkgVar.zzh(zzdVar.number, ((java.lang.Integer) entry.getValue()).intValue());
                break;
            case 6:
                zzkgVar.zzc(zzdVar.number, ((java.lang.Long) entry.getValue()).longValue());
                break;
            case 7:
                zzkgVar.zzk(zzdVar.number, ((java.lang.Integer) entry.getValue()).intValue());
                break;
            case 8:
                zzkgVar.zza(zzdVar.number, ((java.lang.Boolean) entry.getValue()).booleanValue());
                break;
            case 9:
                zzkgVar.zzi(zzdVar.number, ((java.lang.Integer) entry.getValue()).intValue());
                break;
            case 10:
                zzkgVar.zzr(zzdVar.number, ((java.lang.Integer) entry.getValue()).intValue());
                break;
            case 11:
                zzkgVar.zzj(zzdVar.number, ((java.lang.Long) entry.getValue()).longValue());
                break;
            case 12:
                zzkgVar.zzj(zzdVar.number, ((java.lang.Integer) entry.getValue()).intValue());
                break;
            case 13:
                zzkgVar.zzb(zzdVar.number, ((java.lang.Long) entry.getValue()).longValue());
                break;
            case 14:
                zzkgVar.zzh(zzdVar.number, ((java.lang.Integer) entry.getValue()).intValue());
                break;
            case 15:
                zzkgVar.zza(zzdVar.number, (com.google.android.gms.internal.vision.zzfh) entry.getValue());
                break;
            case 16:
                zzkgVar.zza(zzdVar.number, (java.lang.String) entry.getValue());
                break;
            case 17:
                zzkgVar.zzb(zzdVar.number, entry.getValue(), com.google.android.gms.internal.vision.zzin.zzho().zzf(entry.getValue().getClass()));
                break;
            case 18:
                zzkgVar.zza(zzdVar.number, entry.getValue(), com.google.android.gms.internal.vision.zzin.zzho().zzf(entry.getValue().getClass()));
                break;
        }
    }

    @Override // com.google.android.gms.internal.vision.zzgf
    final java.lang.Object zza(com.google.android.gms.internal.vision.zzgd zzgdVar, com.google.android.gms.internal.vision.zzic zzicVar, int i) {
        return zzgdVar.zza(zzicVar, i);
    }

    @Override // com.google.android.gms.internal.vision.zzgf
    final void zza(com.google.android.gms.internal.vision.zzis zzisVar, java.lang.Object obj, com.google.android.gms.internal.vision.zzgd zzgdVar, com.google.android.gms.internal.vision.zzgi<com.google.android.gms.internal.vision.zzgs.zzd> zzgiVar) throws java.io.IOException {
        com.google.android.gms.internal.vision.zzgs.zzg zzgVar = (com.google.android.gms.internal.vision.zzgs.zzg) obj;
        zzgiVar.zza(zzgVar.zzxb, zzisVar.zza(zzgVar.zzxa.getClass(), zzgdVar));
    }

    @Override // com.google.android.gms.internal.vision.zzgf
    final void zza(com.google.android.gms.internal.vision.zzfh zzfhVar, java.lang.Object obj, com.google.android.gms.internal.vision.zzgd zzgdVar, com.google.android.gms.internal.vision.zzgi<com.google.android.gms.internal.vision.zzgs.zzd> zzgiVar) throws java.io.IOException {
        byte[] bArr;
        com.google.android.gms.internal.vision.zzgs.zzg zzgVar = (com.google.android.gms.internal.vision.zzgs.zzg) obj;
        com.google.android.gms.internal.vision.zzic zzicVarZzgb = zzgVar.zzxa.zzgj().zzgb();
        int size = zzfhVar.size();
        if (size == 0) {
            bArr = com.google.android.gms.internal.vision.zzgt.zzxc;
        } else {
            byte[] bArr2 = new byte[size];
            zzfhVar.zza(bArr2, 0, 0, size);
            bArr = bArr2;
        }
        java.nio.ByteBuffer byteBufferWrap = java.nio.ByteBuffer.wrap(bArr);
        if (byteBufferWrap.hasArray()) {
            com.google.android.gms.internal.vision.zzfg zzfgVar = new com.google.android.gms.internal.vision.zzfg(byteBufferWrap, true);
            com.google.android.gms.internal.vision.zzin.zzho().zzu(zzicVarZzgb).zza(zzicVarZzgb, zzfgVar, zzgdVar);
            zzgiVar.zza(zzgVar.zzxb, zzicVarZzgb);
            if (zzfgVar.zzdu() != Integer.MAX_VALUE) {
                throw com.google.android.gms.internal.vision.zzhc.zzgq();
            }
            return;
        }
        throw new java.lang.IllegalArgumentException("Direct buffers not yet supported");
    }
}
