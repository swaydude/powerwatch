package com.google.android.gms.internal.vision;

/* JADX INFO: compiled from: com.google.android.gms:play-services-vision-common@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzjf {
    static java.lang.String zzd(com.google.android.gms.internal.vision.zzfh zzfhVar) {
        com.google.android.gms.internal.vision.zzji zzjiVar = new com.google.android.gms.internal.vision.zzji(zzfhVar);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(zzjiVar.size());
        for (int i = 0; i < zzjiVar.size(); i++) {
            byte bZzan = zzjiVar.zzan(i);
            if (bZzan == 34) {
                sb.append("\\\"");
            } else if (bZzan == 39) {
                sb.append("\\'");
            } else if (bZzan != 92) {
                switch (bZzan) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (bZzan < 32 || bZzan > 126) {
                            sb.append('\\');
                            sb.append((char) (((bZzan >>> 6) & 3) + 48));
                            sb.append((char) (((bZzan >>> 3) & 7) + 48));
                            sb.append((char) ((bZzan & 7) + 48));
                        } else {
                            sb.append((char) bZzan);
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }
}
