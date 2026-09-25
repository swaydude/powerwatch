package com.google.android.gms.internal.fitness;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zziq {
    static java.lang.String zzc(com.google.android.gms.internal.fitness.zzff zzffVar) {
        com.google.android.gms.internal.fitness.zzip zzipVar = new com.google.android.gms.internal.fitness.zzip(zzffVar);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(zzipVar.size());
        for (int i = 0; i < zzipVar.size(); i++) {
            byte bZzh = zzipVar.zzh(i);
            if (bZzh == 34) {
                sb.append("\\\"");
            } else if (bZzh == 39) {
                sb.append("\\'");
            } else if (bZzh != 92) {
                switch (bZzh) {
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
                        if (bZzh < 32 || bZzh > 126) {
                            sb.append('\\');
                            sb.append((char) (((bZzh >>> 6) & 3) + 48));
                            sb.append((char) (((bZzh >>> 3) & 7) + 48));
                            sb.append((char) ((bZzh & 7) + 48));
                        } else {
                            sb.append((char) bZzh);
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
