package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
public final class zzla extends com.google.android.gms.measurement.internal.zzhi {
    private static final java.lang.String[] zza = {"firebase_", "google_", "ga_"};
    private java.security.SecureRandom zzb;
    private final java.util.concurrent.atomic.AtomicLong zzc;
    private int zzd;
    private java.lang.Integer zze;

    zzla(com.google.android.gms.measurement.internal.zzgo zzgoVar) {
        super(zzgoVar);
        this.zze = null;
        this.zzc = new java.util.concurrent.atomic.AtomicLong(0L);
    }

    @Override // com.google.android.gms.measurement.internal.zzhi
    protected final boolean zze() {
        return true;
    }

    @Override // com.google.android.gms.measurement.internal.zzhi
    protected final void f_() {
        zzd();
        java.security.SecureRandom secureRandom = new java.security.SecureRandom();
        long jNextLong = secureRandom.nextLong();
        if (jNextLong == 0) {
            jNextLong = secureRandom.nextLong();
            if (jNextLong == 0) {
                zzr().zzi().zza("Utils falling back to Random for random id");
            }
        }
        this.zzc.set(jNextLong);
    }

    public final long zzg() {
        long andIncrement;
        long j;
        if (this.zzc.get() == 0) {
            synchronized (this.zzc) {
                long jNextLong = new java.util.Random(java.lang.System.nanoTime() ^ zzm().currentTimeMillis()).nextLong();
                int i = this.zzd + 1;
                this.zzd = i;
                j = jNextLong + ((long) i);
            }
            return j;
        }
        synchronized (this.zzc) {
            this.zzc.compareAndSet(-1L, 1L);
            andIncrement = this.zzc.getAndIncrement();
        }
        return andIncrement;
    }

    final java.security.SecureRandom zzh() {
        zzd();
        if (this.zzb == null) {
            this.zzb = new java.security.SecureRandom();
        }
        return this.zzb;
    }

    static boolean zza(java.lang.String str) {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        return str.charAt(0) != '_' || str.equals("_ep");
    }

    final android.os.Bundle zza(android.net.Uri uri) {
        java.lang.String queryParameter;
        java.lang.String queryParameter2;
        java.lang.String queryParameter3;
        java.lang.String queryParameter4;
        if (uri == null) {
            return null;
        }
        try {
            if (uri.isHierarchical()) {
                queryParameter = uri.getQueryParameter("utm_campaign");
                queryParameter2 = uri.getQueryParameter("utm_source");
                queryParameter3 = uri.getQueryParameter("utm_medium");
                queryParameter4 = uri.getQueryParameter("gclid");
            } else {
                queryParameter = null;
                queryParameter2 = null;
                queryParameter3 = null;
                queryParameter4 = null;
            }
            if (android.text.TextUtils.isEmpty(queryParameter) && android.text.TextUtils.isEmpty(queryParameter2) && android.text.TextUtils.isEmpty(queryParameter3) && android.text.TextUtils.isEmpty(queryParameter4)) {
                return null;
            }
            android.os.Bundle bundle = new android.os.Bundle();
            if (!android.text.TextUtils.isEmpty(queryParameter)) {
                bundle.putString(com.google.firebase.analytics.FirebaseAnalytics.Param.CAMPAIGN, queryParameter);
            }
            if (!android.text.TextUtils.isEmpty(queryParameter2)) {
                bundle.putString(com.google.firebase.analytics.FirebaseAnalytics.Param.SOURCE, queryParameter2);
            }
            if (!android.text.TextUtils.isEmpty(queryParameter3)) {
                bundle.putString(com.google.firebase.analytics.FirebaseAnalytics.Param.MEDIUM, queryParameter3);
            }
            if (!android.text.TextUtils.isEmpty(queryParameter4)) {
                bundle.putString("gclid", queryParameter4);
            }
            java.lang.String queryParameter5 = uri.getQueryParameter("utm_term");
            if (!android.text.TextUtils.isEmpty(queryParameter5)) {
                bundle.putString(com.google.firebase.analytics.FirebaseAnalytics.Param.TERM, queryParameter5);
            }
            java.lang.String queryParameter6 = uri.getQueryParameter("utm_content");
            if (!android.text.TextUtils.isEmpty(queryParameter6)) {
                bundle.putString(com.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT, queryParameter6);
            }
            java.lang.String queryParameter7 = uri.getQueryParameter(com.google.firebase.analytics.FirebaseAnalytics.Param.ACLID);
            if (!android.text.TextUtils.isEmpty(queryParameter7)) {
                bundle.putString(com.google.firebase.analytics.FirebaseAnalytics.Param.ACLID, queryParameter7);
            }
            java.lang.String queryParameter8 = uri.getQueryParameter(com.google.firebase.analytics.FirebaseAnalytics.Param.CP1);
            if (!android.text.TextUtils.isEmpty(queryParameter8)) {
                bundle.putString(com.google.firebase.analytics.FirebaseAnalytics.Param.CP1, queryParameter8);
            }
            java.lang.String queryParameter9 = uri.getQueryParameter("anid");
            if (!android.text.TextUtils.isEmpty(queryParameter9)) {
                bundle.putString("anid", queryParameter9);
            }
            return bundle;
        } catch (java.lang.UnsupportedOperationException e) {
            zzr().zzi().zza("Install referrer url isn't a hierarchical URI", e);
            return null;
        }
    }

    static boolean zza(android.content.Intent intent) {
        java.lang.String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
        return "android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) || "https://www.google.com".equals(stringExtra) || "android-app://com.google.appcrawler".equals(stringExtra);
    }

    final boolean zza(java.lang.String str, java.lang.String str2) {
        if (str2 == null) {
            zzr().zzh().zza("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.length() == 0) {
            zzr().zzh().zza("Name is required and can't be empty. Type", str);
            return false;
        }
        int iCodePointAt = str2.codePointAt(0);
        if (!java.lang.Character.isLetter(iCodePointAt)) {
            zzr().zzh().zza("Name must start with a letter. Type, name", str, str2);
            return false;
        }
        int length = str2.length();
        int iCharCount = java.lang.Character.charCount(iCodePointAt);
        while (iCharCount < length) {
            int iCodePointAt2 = str2.codePointAt(iCharCount);
            if (iCodePointAt2 != 95 && !java.lang.Character.isLetterOrDigit(iCodePointAt2)) {
                zzr().zzh().zza("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                return false;
            }
            iCharCount += java.lang.Character.charCount(iCodePointAt2);
        }
        return true;
    }

    final boolean zzb(java.lang.String str, java.lang.String str2) {
        if (str2 == null) {
            zzr().zzh().zza("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.length() == 0) {
            zzr().zzh().zza("Name is required and can't be empty. Type", str);
            return false;
        }
        int iCodePointAt = str2.codePointAt(0);
        if (!java.lang.Character.isLetter(iCodePointAt) && iCodePointAt != 95) {
            zzr().zzh().zza("Name must start with a letter or _ (underscore). Type, name", str, str2);
            return false;
        }
        int length = str2.length();
        int iCharCount = java.lang.Character.charCount(iCodePointAt);
        while (iCharCount < length) {
            int iCodePointAt2 = str2.codePointAt(iCharCount);
            if (iCodePointAt2 != 95 && !java.lang.Character.isLetterOrDigit(iCodePointAt2)) {
                zzr().zzh().zza("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                return false;
            }
            iCharCount += java.lang.Character.charCount(iCodePointAt2);
        }
        return true;
    }

    final boolean zza(java.lang.String str, java.lang.String[] strArr, java.lang.String str2) {
        boolean z;
        if (str2 == null) {
            zzr().zzh().zza("Name is required and can't be null. Type", str);
            return false;
        }
        com.google.android.gms.common.internal.Preconditions.checkNotNull(str2);
        java.lang.String[] strArr2 = zza;
        int length = strArr2.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                z = false;
                break;
            }
            if (str2.startsWith(strArr2[i])) {
                z = true;
                break;
            }
            i++;
        }
        if (z) {
            zzr().zzh().zza("Name starts with reserved prefix. Type, name", str, str2);
            return false;
        }
        if (strArr == null || !zza(str2, strArr)) {
            return true;
        }
        zzr().zzh().zza("Name is reserved. Type, name", str, str2);
        return false;
    }

    final boolean zza(java.lang.String str, int i, java.lang.String str2) {
        if (str2 == null) {
            zzr().zzh().zza("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.codePointCount(0, str2.length()) <= i) {
            return true;
        }
        zzr().zzh().zza("Name is too long. Type, maximum supported length, name", str, java.lang.Integer.valueOf(i), str2);
        return false;
    }

    final int zzb(java.lang.String str) {
        if (!zzb(androidx.core.app.NotificationCompat.CATEGORY_EVENT, str)) {
            return 2;
        }
        if (zza(androidx.core.app.NotificationCompat.CATEGORY_EVENT, com.google.android.gms.measurement.internal.zzhj.zza, str)) {
            return !zza(androidx.core.app.NotificationCompat.CATEGORY_EVENT, 40, str) ? 2 : 0;
        }
        return 13;
    }

    final int zzc(java.lang.String str) {
        if (!zzb("user property", str)) {
            return 6;
        }
        if (zza("user property", com.google.android.gms.measurement.internal.zzhl.zza, str)) {
            return !zza("user property", 24, str) ? 6 : 0;
        }
        return 15;
    }

    private final int zzg(java.lang.String str) {
        if (!zza("event param", str)) {
            return 3;
        }
        if (zza("event param", (java.lang.String[]) null, str)) {
            return !zza("event param", 40, str) ? 3 : 0;
        }
        return 14;
    }

    private final int zzh(java.lang.String str) {
        if (!zzb("event param", str)) {
            return 3;
        }
        if (zza("event param", (java.lang.String[]) null, str)) {
            return !zza("event param", 40, str) ? 3 : 0;
        }
        return 14;
    }

    private static boolean zzb(java.lang.Object obj) {
        return (obj instanceof android.os.Parcelable[]) || (obj instanceof java.util.ArrayList) || (obj instanceof android.os.Bundle);
    }

    private final boolean zza(java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        int size;
        if (obj instanceof android.os.Parcelable[]) {
            size = ((android.os.Parcelable[]) obj).length;
        } else {
            if (obj instanceof java.util.ArrayList) {
                size = ((java.util.ArrayList) obj).size();
            }
            return true;
        }
        if (size > i) {
            zzr().zzk().zza("Parameter array is too long; discarded. Value kind, name, array length", str, str2, java.lang.Integer.valueOf(size));
            return false;
        }
        return true;
    }

    private final boolean zzb(java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if (obj != null && !(obj instanceof java.lang.Long) && !(obj instanceof java.lang.Float) && !(obj instanceof java.lang.Integer) && !(obj instanceof java.lang.Byte) && !(obj instanceof java.lang.Short) && !(obj instanceof java.lang.Boolean) && !(obj instanceof java.lang.Double)) {
            if (!(obj instanceof java.lang.String) && !(obj instanceof java.lang.Character) && !(obj instanceof java.lang.CharSequence)) {
                return false;
            }
            java.lang.String strValueOf = java.lang.String.valueOf(obj);
            if (strValueOf.codePointCount(0, strValueOf.length()) > i) {
                zzr().zzk().zza("Value is too long; discarded. Value kind, name, value length", str, str2, java.lang.Integer.valueOf(strValueOf.length()));
                return false;
            }
        }
        return true;
    }

    private final void zza(java.lang.String str, java.lang.String str2, java.lang.String str3, android.os.Bundle bundle, java.util.List<java.lang.String> list, boolean z) {
        int iZzg;
        int iZza;
        this = this;
        if (bundle == null) {
            return;
        }
        boolean zZza = zzt().zza(com.google.android.gms.measurement.internal.zzap.zzde);
        int i = zZza ? 10 : 25;
        int i2 = 0;
        for (java.lang.String str4 : new java.util.TreeSet(bundle.keySet())) {
            if (list == null || !list.contains(str4)) {
                iZzg = z ? this.zzg(str4) : 0;
                if (iZzg == 0) {
                    iZzg = this.zzh(str4);
                }
            } else {
                iZzg = 0;
            }
            if (iZzg != 0) {
                zza(bundle, iZzg, str4, str4, iZzg == 3 ? str4 : null);
                bundle.remove(str4);
            } else {
                if (zzb(bundle.get(str4))) {
                    zzr().zzk().zza("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", str2, str3, str4);
                    iZza = 22;
                } else {
                    iZza = zza(str, str2, str4, bundle.get(str4), bundle, list, z, false);
                }
                if (iZza != 0 && !"_ev".equals(str4)) {
                    zza(bundle, iZza, str4, str4, bundle.get(str4));
                    bundle.remove(str4);
                } else if (zza(str4) && (!zZza || !zza(str4, com.google.android.gms.measurement.internal.zzhm.zzd))) {
                    int i3 = i2 + 1;
                    if (i3 > i) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder(63);
                        sb.append("Child bundles can't contain more than ");
                        sb.append(i);
                        sb.append(" custom params");
                        zzr().zzh().zza(sb.toString(), zzo().zza(str2), zzo().zza(bundle));
                        zza(bundle, zZza ? 23 : 5);
                        bundle.remove(str4);
                        i2 = i3;
                    } else {
                        i2 = i3;
                    }
                }
            }
        }
    }

    final boolean zza(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (!android.text.TextUtils.isEmpty(str)) {
            if (zzi(str)) {
                return true;
            }
            if (this.zzx.zzl()) {
                zzr().zzh().zza("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", com.google.android.gms.measurement.internal.zzfk.zza(str));
            }
            return false;
        }
        if (com.google.android.gms.internal.measurement.zzll.zzb() && zzt().zza(com.google.android.gms.measurement.internal.zzap.zzch) && !android.text.TextUtils.isEmpty(str3)) {
            return true;
        }
        if (!android.text.TextUtils.isEmpty(str2)) {
            if (zzi(str2)) {
                return true;
            }
            zzr().zzh().zza("Invalid admob_app_id. Analytics disabled.", com.google.android.gms.measurement.internal.zzfk.zza(str2));
            return false;
        }
        if (this.zzx.zzl()) {
            zzr().zzh().zza("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
        }
        return false;
    }

    static boolean zza(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        boolean zIsEmpty = android.text.TextUtils.isEmpty(str);
        boolean zIsEmpty2 = android.text.TextUtils.isEmpty(str2);
        if (!zIsEmpty && !zIsEmpty2) {
            return !str.equals(str2);
        }
        if (zIsEmpty && zIsEmpty2) {
            if (android.text.TextUtils.isEmpty(str3) || android.text.TextUtils.isEmpty(str4)) {
                return !android.text.TextUtils.isEmpty(str4);
            }
            return !str3.equals(str4);
        }
        if (zIsEmpty || !zIsEmpty2) {
            return android.text.TextUtils.isEmpty(str3) || !str3.equals(str4);
        }
        if (android.text.TextUtils.isEmpty(str4)) {
            return false;
        }
        return android.text.TextUtils.isEmpty(str3) || !str3.equals(str4);
    }

    private static boolean zzi(java.lang.String str) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(str);
        return str.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$");
    }

    private final java.lang.Object zza(int i, java.lang.Object obj, boolean z, boolean z2) {
        android.os.Bundle bundleZza;
        if (obj == null) {
            return null;
        }
        if ((obj instanceof java.lang.Long) || (obj instanceof java.lang.Double)) {
            return obj;
        }
        if (obj instanceof java.lang.Integer) {
            return java.lang.Long.valueOf(((java.lang.Integer) obj).intValue());
        }
        if (obj instanceof java.lang.Byte) {
            return java.lang.Long.valueOf(((java.lang.Byte) obj).byteValue());
        }
        if (obj instanceof java.lang.Short) {
            return java.lang.Long.valueOf(((java.lang.Short) obj).shortValue());
        }
        if (obj instanceof java.lang.Boolean) {
            return java.lang.Long.valueOf(((java.lang.Boolean) obj).booleanValue() ? 1L : 0L);
        }
        if (obj instanceof java.lang.Float) {
            return java.lang.Double.valueOf(((java.lang.Float) obj).doubleValue());
        }
        if ((obj instanceof java.lang.String) || (obj instanceof java.lang.Character) || (obj instanceof java.lang.CharSequence)) {
            return zza(java.lang.String.valueOf(obj), i, z);
        }
        if (!com.google.android.gms.internal.measurement.zzjp.zzb() || !zzt().zza(com.google.android.gms.measurement.internal.zzap.zzdd) || !zzt().zza(com.google.android.gms.measurement.internal.zzap.zzdc) || !z2 || (!(obj instanceof android.os.Bundle[]) && !(obj instanceof android.os.Parcelable[]))) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (android.os.Parcelable parcelable : (android.os.Parcelable[]) obj) {
            if ((parcelable instanceof android.os.Bundle) && (bundleZza = zza((android.os.Bundle) parcelable)) != null && !bundleZza.isEmpty()) {
                arrayList.add(bundleZza);
            }
        }
        return arrayList.toArray(new android.os.Bundle[arrayList.size()]);
    }

    public static java.lang.String zza(java.lang.String str, int i, boolean z) {
        if (str == null) {
            return null;
        }
        if (str.codePointCount(0, str.length()) <= i) {
            return str;
        }
        if (z) {
            return java.lang.String.valueOf(str.substring(0, str.offsetByCodePoints(0, i))).concat("...");
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00a1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:44:0x00a2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:53:0x00be A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:56:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:58:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:60:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:63:0x00f8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:65:0x010f  */
    /* JADX WARN: Code duplicated, block: B:67:0x0114  */
    /* JADX WARN: Code duplicated, block: B:69:0x0118  */
    /* JADX WARN: Code duplicated, block: B:71:0x0122  */
    /* JADX WARN: Code duplicated, block: B:74:0x013e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:75:0x0140  */
    /* JADX WARN: Code duplicated, block: B:78:0x0157 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:79:0x0158 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:82:0x00e6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x012c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x0152 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:58:0x00d9, please report this as an issue */
    private final int zza(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Object obj, android.os.Bundle bundle, java.util.List<java.lang.String> list, boolean z, boolean z2) {
        int i;
        boolean z3;
        java.util.ArrayList arrayList;
        int size;
        int i2;
        java.lang.Object obj2;
        int i3;
        int i4;
        zzd();
        boolean z4 = false;
        if (com.google.android.gms.internal.measurement.zzjp.zzb() && zzt().zza(com.google.android.gms.measurement.internal.zzap.zzde)) {
            if (zzb(obj)) {
                if (!z2) {
                    return 21;
                }
                if (!zza(str3, com.google.android.gms.measurement.internal.zzhm.zzc)) {
                    return 20;
                }
                if (!zza("param", str3, 200, obj)) {
                    if (obj instanceof android.os.Parcelable[]) {
                        android.os.Parcelable[] parcelableArr = (android.os.Parcelable[]) obj;
                        if (parcelableArr.length > 200) {
                            bundle.putParcelableArray(str3, (android.os.Parcelable[]) java.util.Arrays.copyOf(parcelableArr, 200));
                        }
                    } else if (obj instanceof java.util.ArrayList) {
                        java.util.ArrayList arrayList2 = (java.util.ArrayList) obj;
                        if (arrayList2.size() > 200) {
                            bundle.putParcelableArrayList(str3, new java.util.ArrayList<>(arrayList2.subList(0, 200)));
                        }
                    }
                    i = 17;
                }
            }
            if (zzb("param", str3, ((zzt().zze(str, com.google.android.gms.measurement.internal.zzap.zzap) || !zze(str2)) && !zze(str3)) ? 100 : 256, obj)) {
                return i;
            }
            if (z2) {
                return 4;
            }
            if (com.google.android.gms.internal.measurement.zzjp.zzb() || !zzt().zza(com.google.android.gms.measurement.internal.zzap.zzdd)) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (obj instanceof android.os.Bundle) {
                if (obj instanceof android.os.Parcelable[]) {
                    for (android.os.Parcelable parcelable : (android.os.Parcelable[]) obj) {
                        if (parcelable instanceof android.os.Bundle) {
                            if (z3) {
                                zza(str, str2, str3, (android.os.Bundle) parcelable, list, z);
                            }
                        } else {
                            zzr().zzk().zza("All Parcelable[] elements must be of type Bundle. Value type, name", parcelable.getClass(), str3);
                        }
                    }
                } else if (obj instanceof java.util.ArrayList) {
                    arrayList = (java.util.ArrayList) obj;
                    size = arrayList.size();
                    i2 = 0;
                    while (i2 < size) {
                        obj2 = arrayList.get(i2);
                        i3 = i2 + 1;
                        if (obj2 instanceof android.os.Bundle) {
                            if (z3) {
                                zza(str, str2, str3, (android.os.Bundle) obj2, list, z);
                            }
                            i2 = i3;
                        } else {
                            zzr().zzk().zza("All ArrayList elements must be of type Bundle. Value type, name", obj2.getClass(), str3);
                        }
                    }
                }
                if (z4) {
                    return i;
                }
                return 4;
            }
            if (z3) {
                zza(str, str2, str3, (android.os.Bundle) obj, list, z);
            }
            z4 = true;
            if (z4) {
                return i;
            }
            return 4;
        }
        if (z2 && !zza("param", str3, 1000, obj)) {
            return 17;
        }
        i = 0;
        if (zzb("param", str3, ((zzt().zze(str, com.google.android.gms.measurement.internal.zzap.zzap) || !zze(str2)) && !zze(str3)) ? 100 : 256, obj)) {
            return i;
        }
        if (z2) {
            return 4;
        }
        if (com.google.android.gms.internal.measurement.zzjp.zzb()) {
            z3 = false;
        } else {
            z3 = false;
        }
        if (obj instanceof android.os.Bundle) {
            if (obj instanceof android.os.Parcelable[]) {
                while (i4 < r15) {
                    if (parcelable instanceof android.os.Bundle) {
                        zzr().zzk().zza("All Parcelable[] elements must be of type Bundle. Value type, name", parcelable.getClass(), str3);
                    } else {
                        if (z3) {
                            zza(str, str2, str3, (android.os.Bundle) parcelable, list, z);
                        }
                    }
                }
            } else if (obj instanceof java.util.ArrayList) {
                arrayList = (java.util.ArrayList) obj;
                size = arrayList.size();
                i2 = 0;
                while (i2 < size) {
                    obj2 = arrayList.get(i2);
                    i3 = i2 + 1;
                    if (obj2 instanceof android.os.Bundle) {
                        zzr().zzk().zza("All ArrayList elements must be of type Bundle. Value type, name", obj2.getClass(), str3);
                    } else {
                        if (z3) {
                            zza(str, str2, str3, (android.os.Bundle) obj2, list, z);
                        }
                        i2 = i3;
                    }
                }
            }
            if (z4) {
                return i;
            }
            return 4;
        }
        if (z3) {
            zza(str, str2, str3, (android.os.Bundle) obj, list, z);
        }
        z4 = true;
        if (z4) {
            return i;
        }
        return 4;
    }

    final java.lang.Object zza(java.lang.String str, java.lang.Object obj) {
        if ("_ev".equals(str)) {
            return zza(256, obj, true, true);
        }
        return zza(zze(str) ? 256 : 100, obj, false, true);
    }

    static android.os.Bundle[] zza(java.lang.Object obj) {
        if (obj instanceof android.os.Bundle) {
            return new android.os.Bundle[]{(android.os.Bundle) obj};
        }
        if (obj instanceof android.os.Parcelable[]) {
            android.os.Parcelable[] parcelableArr = (android.os.Parcelable[]) obj;
            return (android.os.Bundle[]) java.util.Arrays.copyOf(parcelableArr, parcelableArr.length, android.os.Bundle[].class);
        }
        if (!(obj instanceof java.util.ArrayList)) {
            return null;
        }
        java.util.ArrayList arrayList = (java.util.ArrayList) obj;
        return (android.os.Bundle[]) arrayList.toArray(new android.os.Bundle[arrayList.size()]);
    }

    final android.os.Bundle zza(java.lang.String str, java.lang.String str2, android.os.Bundle bundle, java.util.List<java.lang.String> list, boolean z, boolean z2) {
        java.util.Set<java.lang.String> setKeySet;
        int iZzg;
        java.lang.String str3;
        android.os.Bundle bundle2;
        boolean z3 = com.google.android.gms.internal.measurement.zzjp.zzb() && zzt().zza(com.google.android.gms.measurement.internal.zzap.zzde);
        boolean zZza = z3 ? zza(str2, com.google.android.gms.measurement.internal.zzhj.zzc) : z2;
        if (bundle == null) {
            return null;
        }
        android.os.Bundle bundle3 = new android.os.Bundle(bundle);
        if (zzt().zze(str, com.google.android.gms.measurement.internal.zzap.zzbk)) {
            setKeySet = new java.util.TreeSet<>(bundle.keySet());
        } else {
            setKeySet = bundle.keySet();
        }
        int i = 0;
        for (java.lang.String str4 : setKeySet) {
            if (list == null || !list.contains(str4)) {
                iZzg = z ? zzg(str4) : 0;
                if (iZzg == 0) {
                    iZzg = zzh(str4);
                }
            } else {
                iZzg = 0;
            }
            if (iZzg != 0) {
                zza(bundle3, iZzg, str4, str4, iZzg == 3 ? str4 : null);
                bundle3.remove(str4);
                bundle2 = bundle3;
            } else {
                android.os.Bundle bundle4 = bundle3;
                int iZza = zza(str, str2, str4, bundle.get(str4), bundle3, list, z, zZza);
                if (z3 && iZza == 17) {
                    str3 = str4;
                    bundle2 = bundle4;
                    zza(bundle2, iZza, str3, str3, (java.lang.Object) false);
                } else {
                    str3 = str4;
                    bundle2 = bundle4;
                    if (iZza != 0 && !"_ev".equals(str3)) {
                        zza(bundle2, iZza, iZza == 21 ? str2 : str3, str3, bundle.get(str3));
                        bundle2.remove(str3);
                    }
                }
                if (zza(str3)) {
                    int i2 = i + 1;
                    if (i2 > 25) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder(48);
                        sb.append("Event can't contain more than 25 params");
                        zzr().zzh().zza(sb.toString(), zzo().zza(str2), zzo().zza(bundle));
                        zza(bundle2, 5);
                        bundle2.remove(str3);
                        i = i2;
                    } else {
                        i = i2;
                    }
                }
                bundle3 = bundle2;
            }
            bundle3 = bundle2;
        }
        return bundle3;
    }

    private static void zza(android.os.Bundle bundle, int i, java.lang.String str, java.lang.String str2, java.lang.Object obj) {
        if (zza(bundle, i)) {
            bundle.putString("_ev", zza(str, 40, true));
            if (obj != null) {
                com.google.android.gms.common.internal.Preconditions.checkNotNull(bundle);
                if (obj != null) {
                    if ((obj instanceof java.lang.String) || (obj instanceof java.lang.CharSequence)) {
                        bundle.putLong("_el", java.lang.String.valueOf(obj).length());
                    }
                }
            }
        }
    }

    private static boolean zza(android.os.Bundle bundle, int i) {
        if (bundle == null || bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", i);
        return true;
    }

    private final int zzj(java.lang.String str) {
        if ("_ldl".equals(str)) {
            return 2048;
        }
        if ("_id".equals(str)) {
            return 256;
        }
        return (zzt().zza(com.google.android.gms.measurement.internal.zzap.zzce) && "_lgclid".equals(str)) ? 100 : 36;
    }

    final int zzb(java.lang.String str, java.lang.Object obj) {
        boolean zZzb;
        if ("_ldl".equals(str)) {
            zZzb = zzb("user property referrer", str, zzj(str), obj);
        } else {
            zZzb = zzb("user property", str, zzj(str), obj);
        }
        return zZzb ? 0 : 7;
    }

    final java.lang.Object zzc(java.lang.String str, java.lang.Object obj) {
        if ("_ldl".equals(str)) {
            return zza(zzj(str), obj, true, false);
        }
        return zza(zzj(str), obj, false, false);
    }

    final void zza(android.os.Bundle bundle, java.lang.String str, java.lang.Object obj) {
        if (bundle == null) {
            return;
        }
        if (obj instanceof java.lang.Long) {
            bundle.putLong(str, ((java.lang.Long) obj).longValue());
            return;
        }
        if (obj instanceof java.lang.String) {
            bundle.putString(str, java.lang.String.valueOf(obj));
            return;
        }
        if (obj instanceof java.lang.Double) {
            bundle.putDouble(str, ((java.lang.Double) obj).doubleValue());
            return;
        }
        if (com.google.android.gms.internal.measurement.zzjp.zzb() && zzt().zza(com.google.android.gms.measurement.internal.zzap.zzdd) && zzt().zza(com.google.android.gms.measurement.internal.zzap.zzdc) && (obj instanceof android.os.Bundle[])) {
            bundle.putParcelableArray(str, (android.os.Bundle[]) obj);
        } else if (str != null) {
            zzr().zzk().zza("Not putting event parameter. Invalid value type. name, type", zzo().zzb(str), obj != null ? obj.getClass().getSimpleName() : null);
        }
    }

    public final void zza(int i, java.lang.String str, java.lang.String str2, int i2) {
        zza((java.lang.String) null, i, str, str2, i2);
    }

    final void zza(java.lang.String str, int i, java.lang.String str2, java.lang.String str3, int i2) {
        android.os.Bundle bundle = new android.os.Bundle();
        zza(bundle, i);
        if (!android.text.TextUtils.isEmpty(str2) && !android.text.TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i == 6 || i == 7 || i == 2) {
            bundle.putLong("_el", i2);
        }
        this.zzx.zzu();
        this.zzx.zzh().zza(kotlinx.coroutines.DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_err", bundle);
    }

    static java.security.MessageDigest zzi() {
        for (int i = 0; i < 2; i++) {
            try {
                java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance("MD5");
                if (messageDigest != null) {
                    return messageDigest;
                }
            } catch (java.security.NoSuchAlgorithmException unused) {
            }
        }
        return null;
    }

    static long zza(byte[] bArr) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(bArr);
        int i = 0;
        com.google.android.gms.common.internal.Preconditions.checkState(bArr.length > 0);
        long j = 0;
        for (int length = bArr.length - 1; length >= 0 && length >= bArr.length - 8; length--) {
            j += (((long) bArr[length]) & 255) << i;
            i += 8;
        }
        return j;
    }

    static boolean zza(android.content.Context context, boolean z) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(context);
        if (android.os.Build.VERSION.SDK_INT >= 24) {
            return zzb(context, "com.google.android.gms.measurement.AppMeasurementJobService");
        }
        return zzb(context, "com.google.android.gms.measurement.AppMeasurementService");
    }

    private static boolean zzb(android.content.Context context, java.lang.String str) {
        android.content.pm.ServiceInfo serviceInfo;
        try {
            android.content.pm.PackageManager packageManager = context.getPackageManager();
            return (packageManager == null || (serviceInfo = packageManager.getServiceInfo(new android.content.ComponentName(context, str), 0)) == null || !serviceInfo.enabled) ? false : true;
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
        }
    }

    final boolean zzd(java.lang.String str) {
        zzd();
        if (com.google.android.gms.common.wrappers.Wrappers.packageManager(zzn()).checkCallingOrSelfPermission(str) == 0) {
            return true;
        }
        zzr().zzw().zza("Permission not granted", str);
        return false;
    }

    static boolean zze(java.lang.String str) {
        return !android.text.TextUtils.isEmpty(str) && str.startsWith(io.fabric.sdk.android.services.events.EventsFilesManager.ROLL_OVER_FILE_NAME_SEPARATOR);
    }

    static boolean zzc(java.lang.String str, java.lang.String str2) {
        if (str == null && str2 == null) {
            return true;
        }
        if (str == null) {
            return false;
        }
        return str.equals(str2);
    }

    static boolean zza(java.lang.Boolean bool, java.lang.Boolean bool2) {
        if (bool == null && bool2 == null) {
            return true;
        }
        if (bool == null) {
            return false;
        }
        return bool.equals(bool2);
    }

    static boolean zza(java.util.List<java.lang.String> list, java.util.List<java.lang.String> list2) {
        if (list == null && list2 == null) {
            return true;
        }
        if (list == null) {
            return false;
        }
        return list.equals(list2);
    }

    final boolean zzf(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return false;
        }
        java.lang.String strZzv = zzt().zzv();
        zzu();
        return strZzv.equals(str);
    }

    final android.os.Bundle zza(android.os.Bundle bundle) {
        android.os.Bundle bundle2 = new android.os.Bundle();
        if (bundle != null) {
            for (java.lang.String str : bundle.keySet()) {
                java.lang.Object objZza = zza(str, bundle.get(str));
                if (objZza == null) {
                    zzr().zzk().zza("Param value can't be null", zzo().zzb(str));
                } else {
                    zza(bundle2, str, objZza);
                }
            }
        }
        return bundle2;
    }

    final com.google.android.gms.measurement.internal.zzan zza(java.lang.String str, java.lang.String str2, android.os.Bundle bundle, java.lang.String str3, long j, boolean z, boolean z2) {
        if (android.text.TextUtils.isEmpty(str2)) {
            return null;
        }
        if (zzb(str2) != 0) {
            zzr().zzf().zza("Invalid conditional property event name", zzo().zzc(str2));
            throw new java.lang.IllegalArgumentException();
        }
        android.os.Bundle bundle2 = bundle != null ? new android.os.Bundle(bundle) : new android.os.Bundle();
        bundle2.putString("_o", str3);
        return new com.google.android.gms.measurement.internal.zzan(str2, new com.google.android.gms.measurement.internal.zzam(zza(zza(str, str2, bundle2, com.google.android.gms.common.util.CollectionUtils.listOf("_o"), false, false))), str3, j);
    }

    final long zza(android.content.Context context, java.lang.String str) {
        zzd();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(context);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        android.content.pm.PackageManager packageManager = context.getPackageManager();
        java.security.MessageDigest messageDigestZzi = zzi();
        long jZza = -1;
        if (messageDigestZzi == null) {
            zzr().zzf().zza("Could not get MD5 instance");
            return -1L;
        }
        if (packageManager != null) {
            try {
                if (!zzc(context, str)) {
                    android.content.pm.PackageInfo packageInfo = com.google.android.gms.common.wrappers.Wrappers.packageManager(context).getPackageInfo(zzn().getPackageName(), 64);
                    if (packageInfo.signatures != null && packageInfo.signatures.length > 0) {
                        jZza = zza(messageDigestZzi.digest(packageInfo.signatures[0].toByteArray()));
                    } else {
                        zzr().zzi().zza("Could not get signatures");
                    }
                    return jZza;
                }
            } catch (android.content.pm.PackageManager.NameNotFoundException e) {
                zzr().zzf().zza("Package name not found", e);
            }
        }
        return 0L;
    }

    private final boolean zzc(android.content.Context context, java.lang.String str) {
        javax.security.auth.x500.X500Principal x500Principal = new javax.security.auth.x500.X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            android.content.pm.PackageInfo packageInfo = com.google.android.gms.common.wrappers.Wrappers.packageManager(context).getPackageInfo(str, 64);
            if (packageInfo == null || packageInfo.signatures == null || packageInfo.signatures.length <= 0) {
                return true;
            }
            return ((java.security.cert.X509Certificate) java.security.cert.CertificateFactory.getInstance("X.509").generateCertificate(new java.io.ByteArrayInputStream(packageInfo.signatures[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
        } catch (android.content.pm.PackageManager.NameNotFoundException e) {
            zzr().zzf().zza("Package name not found", e);
            return true;
        } catch (java.security.cert.CertificateException e2) {
            zzr().zzf().zza("Error obtaining certificate", e2);
            return true;
        }
    }

    static byte[] zza(android.os.Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        android.os.Parcel parcelObtain = android.os.Parcel.obtain();
        try {
            parcelable.writeToParcel(parcelObtain, 0);
            return parcelObtain.marshall();
        } finally {
            parcelObtain.recycle();
        }
    }

    public static android.os.Bundle zzb(android.os.Bundle bundle) {
        if (bundle == null) {
            return new android.os.Bundle();
        }
        android.os.Bundle bundle2 = new android.os.Bundle(bundle);
        for (java.lang.String str : bundle2.keySet()) {
            java.lang.Object obj = bundle2.get(str);
            if (obj instanceof android.os.Bundle) {
                bundle2.putBundle(str, new android.os.Bundle((android.os.Bundle) obj));
            } else {
                int i = 0;
                if (obj instanceof android.os.Parcelable[]) {
                    android.os.Parcelable[] parcelableArr = (android.os.Parcelable[]) obj;
                    while (i < parcelableArr.length) {
                        if (parcelableArr[i] instanceof android.os.Bundle) {
                            parcelableArr[i] = new android.os.Bundle((android.os.Bundle) parcelableArr[i]);
                        }
                        i++;
                    }
                } else if (obj instanceof java.util.List) {
                    java.util.List list = (java.util.List) obj;
                    while (i < list.size()) {
                        java.lang.Object obj2 = list.get(i);
                        if (obj2 instanceof android.os.Bundle) {
                            list.set(i, new android.os.Bundle((android.os.Bundle) obj2));
                        }
                        i++;
                    }
                }
            }
        }
        return bundle2;
    }

    private static boolean zza(java.lang.String str, java.lang.String[] strArr) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(strArr);
        for (java.lang.String str2 : strArr) {
            if (zzc(str, str2)) {
                return true;
            }
        }
        return false;
    }

    public final int zzj() {
        if (this.zze == null) {
            this.zze = java.lang.Integer.valueOf(com.google.android.gms.common.GoogleApiAvailabilityLight.getInstance().getApkVersion(zzn()) / 1000);
        }
        return this.zze.intValue();
    }

    public final int zza(int i) {
        return com.google.android.gms.common.GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(zzn(), 12451000);
    }

    public static long zza(long j, long j2) {
        return (j + (j2 * 60000)) / 86400000;
    }

    final java.lang.String zzk() {
        byte[] bArr = new byte[16];
        zzh().nextBytes(bArr);
        return java.lang.String.format(java.util.Locale.US, "%032x", new java.math.BigInteger(1, bArr));
    }

    final void zza(android.os.Bundle bundle, long j) {
        long j2 = bundle.getLong("_et");
        if (j2 != 0) {
            zzr().zzi().zza("Params already contained engagement", java.lang.Long.valueOf(j2));
        }
        bundle.putLong("_et", j + j2);
    }

    public final void zza(com.google.android.gms.internal.measurement.zzn zznVar, java.lang.String str) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("r", str);
        try {
            zznVar.zza(bundle);
        } catch (android.os.RemoteException e) {
            this.zzx.zzr().zzi().zza("Error returning string value to wrapper", e);
        }
    }

    public final void zza(com.google.android.gms.internal.measurement.zzn zznVar, long j) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putLong("r", j);
        try {
            zznVar.zza(bundle);
        } catch (android.os.RemoteException e) {
            this.zzx.zzr().zzi().zza("Error returning long value to wrapper", e);
        }
    }

    public final void zza(com.google.android.gms.internal.measurement.zzn zznVar, int i) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("r", i);
        try {
            zznVar.zza(bundle);
        } catch (android.os.RemoteException e) {
            this.zzx.zzr().zzi().zza("Error returning int value to wrapper", e);
        }
    }

    public final void zza(com.google.android.gms.internal.measurement.zzn zznVar, byte[] bArr) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putByteArray("r", bArr);
        try {
            zznVar.zza(bundle);
        } catch (android.os.RemoteException e) {
            this.zzx.zzr().zzi().zza("Error returning byte array to wrapper", e);
        }
    }

    public final void zza(com.google.android.gms.internal.measurement.zzn zznVar, boolean z) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("r", z);
        try {
            zznVar.zza(bundle);
        } catch (android.os.RemoteException e) {
            this.zzx.zzr().zzi().zza("Error returning boolean value to wrapper", e);
        }
    }

    public final void zza(com.google.android.gms.internal.measurement.zzn zznVar, android.os.Bundle bundle) {
        try {
            zznVar.zza(bundle);
        } catch (android.os.RemoteException e) {
            this.zzx.zzr().zzi().zza("Error returning bundle value to wrapper", e);
        }
    }

    public static android.os.Bundle zza(java.util.List<com.google.android.gms.measurement.internal.zzkz> list) {
        android.os.Bundle bundle = new android.os.Bundle();
        if (list == null) {
            return bundle;
        }
        for (com.google.android.gms.measurement.internal.zzkz zzkzVar : list) {
            if (zzkzVar.zzd != null) {
                bundle.putString(zzkzVar.zza, zzkzVar.zzd);
            } else if (zzkzVar.zzc != null) {
                bundle.putLong(zzkzVar.zza, zzkzVar.zzc.longValue());
            } else if (zzkzVar.zzf != null) {
                bundle.putDouble(zzkzVar.zza, zzkzVar.zzf.doubleValue());
            }
        }
        return bundle;
    }

    public final void zza(com.google.android.gms.internal.measurement.zzn zznVar, java.util.ArrayList<android.os.Bundle> arrayList) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putParcelableArrayList("r", arrayList);
        try {
            zznVar.zza(bundle);
        } catch (android.os.RemoteException e) {
            this.zzx.zzr().zzi().zza("Error returning bundle list to wrapper", e);
        }
    }

    public static java.util.ArrayList<android.os.Bundle> zzb(java.util.List<com.google.android.gms.measurement.internal.zzv> list) {
        if (list == null) {
            return new java.util.ArrayList<>(0);
        }
        java.util.ArrayList<android.os.Bundle> arrayList = new java.util.ArrayList<>(list.size());
        for (com.google.android.gms.measurement.internal.zzv zzvVar : list) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("app_id", zzvVar.zza);
            bundle.putString("origin", zzvVar.zzb);
            bundle.putLong(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, zzvVar.zzd);
            bundle.putString(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME, zzvVar.zzc.zza);
            com.google.android.gms.measurement.internal.zzhk.zza(bundle, zzvVar.zzc.zza());
            bundle.putBoolean(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.ACTIVE, zzvVar.zze);
            if (zzvVar.zzf != null) {
                bundle.putString(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, zzvVar.zzf);
            }
            if (zzvVar.zzg != null) {
                bundle.putString(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_NAME, zzvVar.zzg.zza);
                if (zzvVar.zzg.zzb != null) {
                    bundle.putBundle(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_PARAMS, zzvVar.zzg.zzb.zzb());
                }
            }
            bundle.putLong(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, zzvVar.zzh);
            if (zzvVar.zzi != null) {
                bundle.putString(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_NAME, zzvVar.zzi.zza);
                if (zzvVar.zzi.zzb != null) {
                    bundle.putBundle(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_PARAMS, zzvVar.zzi.zzb.zzb());
                }
            }
            bundle.putLong(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, zzvVar.zzc.zzb);
            bundle.putLong(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, zzvVar.zzj);
            if (zzvVar.zzk != null) {
                bundle.putString(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, zzvVar.zzk.zza);
                if (zzvVar.zzk.zzb != null) {
                    bundle.putBundle(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, zzvVar.zzk.zzb.zzb());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    public final java.net.URL zza(long j, java.lang.String str, java.lang.String str2, long j2) {
        try {
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str2);
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
            java.lang.String strConcat = java.lang.String.format("https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=%s&rdid=%s&bundleid=%s&retry=%s", java.lang.String.format("v%s.%s", java.lang.Long.valueOf(j), java.lang.Integer.valueOf(zzj())), str2, str, java.lang.Long.valueOf(j2));
            if (str.equals(zzt().zzw())) {
                strConcat = strConcat.concat("&ddl_test=1");
            }
            return new java.net.URL(strConcat);
        } catch (java.lang.IllegalArgumentException | java.net.MalformedURLException e) {
            zzr().zzf().zza("Failed to create BOW URL for Deferred Deep Link. exception", e.getMessage());
            return null;
        }
    }

    final boolean zza(java.lang.String str, double d) {
        try {
            android.content.SharedPreferences.Editor editorEdit = zzn().getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
            editorEdit.putString("deeplink", str);
            editorEdit.putLong("timestamp", java.lang.Double.doubleToRawLongBits(d));
            return editorEdit.commit();
        } catch (java.lang.Exception e) {
            zzr().zzf().zza("Failed to persist Deferred Deep Link. exception", e);
            return false;
        }
    }

    public final boolean zzv() {
        try {
            zzn().getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
            return true;
        } catch (java.lang.ClassNotFoundException unused) {
            return false;
        }
    }

    public static long zza(com.google.android.gms.measurement.internal.zzam zzamVar) {
        long length = 0;
        if (zzamVar == null) {
            return 0L;
        }
        java.util.Iterator<java.lang.String> it = zzamVar.iterator();
        while (it.hasNext()) {
            java.lang.Object objZza = zzamVar.zza(it.next());
            if (objZza instanceof android.os.Parcelable[]) {
                length += (long) ((android.os.Parcelable[]) objZza).length;
            }
        }
        return length;
    }

    @Override // com.google.android.gms.measurement.internal.zzhf
    public final /* bridge */ /* synthetic */ void zza() {
        super.zza();
    }

    @Override // com.google.android.gms.measurement.internal.zzhf
    public final /* bridge */ /* synthetic */ void zzb() {
        super.zzb();
    }

    @Override // com.google.android.gms.measurement.internal.zzhf
    public final /* bridge */ /* synthetic */ void zzc() {
        super.zzc();
    }

    @Override // com.google.android.gms.measurement.internal.zzhf
    public final /* bridge */ /* synthetic */ void zzd() {
        super.zzd();
    }

    @Override // com.google.android.gms.measurement.internal.zzhf
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.zzah zzl() {
        return super.zzl();
    }

    @Override // com.google.android.gms.measurement.internal.zzhf, com.google.android.gms.measurement.internal.zzhh
    public final /* bridge */ /* synthetic */ com.google.android.gms.common.util.Clock zzm() {
        return super.zzm();
    }

    @Override // com.google.android.gms.measurement.internal.zzhf, com.google.android.gms.measurement.internal.zzhh
    public final /* bridge */ /* synthetic */ android.content.Context zzn() {
        return super.zzn();
    }

    @Override // com.google.android.gms.measurement.internal.zzhf
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.zzfi zzo() {
        return super.zzo();
    }

    @Override // com.google.android.gms.measurement.internal.zzhf
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.zzla zzp() {
        return super.zzp();
    }

    @Override // com.google.android.gms.measurement.internal.zzhf, com.google.android.gms.measurement.internal.zzhh
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.zzgh zzq() {
        return super.zzq();
    }

    @Override // com.google.android.gms.measurement.internal.zzhf, com.google.android.gms.measurement.internal.zzhh
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.zzfk zzr() {
        return super.zzr();
    }

    @Override // com.google.android.gms.measurement.internal.zzhf
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.zzft zzs() {
        return super.zzs();
    }

    @Override // com.google.android.gms.measurement.internal.zzhf
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.zzx zzt() {
        return super.zzt();
    }

    @Override // com.google.android.gms.measurement.internal.zzhf, com.google.android.gms.measurement.internal.zzhh
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.zzw zzu() {
        return super.zzu();
    }
}
