package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
public final class zzfg extends com.google.android.gms.measurement.internal.zze {
    private final com.google.android.gms.measurement.internal.zzff zza;
    private boolean zzb;

    zzfg(com.google.android.gms.measurement.internal.zzgo zzgoVar) {
        super(zzgoVar);
        this.zza = new com.google.android.gms.measurement.internal.zzff(this, zzn(), "google_app_measurement_local.db");
    }

    @Override // com.google.android.gms.measurement.internal.zze
    protected final boolean zzz() {
        return false;
    }

    public final void zzab() {
        zzb();
        zzd();
        try {
            int iDelete = zzae().delete("messages", null, null) + 0;
            if (iDelete > 0) {
                zzr().zzx().zza("Reset local analytics data. records", java.lang.Integer.valueOf(iDelete));
            }
        } catch (android.database.sqlite.SQLiteException e) {
            zzr().zzf().zza("Error resetting local analytics data. error", e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:78:0x0123  */
    /* JADX WARN: Code duplicated, block: B:80:0x0128  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v3, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v4, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v5, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    private final boolean zza(int i, byte[] bArr) throws java.lang.Throwable {
        android.database.sqlite.SQLiteDatabase sQLiteDatabaseZzae;
        ?? RawQuery;
        zzb();
        zzd();
        ?? r2 = 0;
        if (this.zzb) {
            return false;
        }
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("type", java.lang.Integer.valueOf(i));
        contentValues.put("entry", bArr);
        int i2 = 0;
        int i3 = 5;
        for (int i4 = 5; i2 < i4; i4 = 5) {
            ?? r7 = 0;
             = 0;
            r7 = 0;
            ?? r8 = 0;
            r7 = 0;
            android.database.sqlite.SQLiteDatabase sQLiteDatabase = null;
            try {
                sQLiteDatabaseZzae = zzae();
                try {
                    if (sQLiteDatabaseZzae == null) {
                        this.zzb = true;
                        if (sQLiteDatabaseZzae != null) {
                            sQLiteDatabaseZzae.close();
                        }
                        return r2;
                    }
                    sQLiteDatabaseZzae.beginTransaction();
                    long j = 0;
                    RawQuery = sQLiteDatabaseZzae.rawQuery("select count(1) from messages", null);
                    if (RawQuery != 0) {
                        try {
                            if (RawQuery.moveToFirst()) {
                                j = RawQuery.getLong(r2);
                            }
                        } catch (android.database.sqlite.SQLiteDatabaseLockedException unused) {
                            r8 = RawQuery;
                            android.os.SystemClock.sleep(i3);
                            i3 += 20;
                            if (r8 != 0) {
                                r8.close();
                            }
                            if (sQLiteDatabaseZzae != null) {
                                sQLiteDatabaseZzae.close();
                            }
                            i2++;
                            r2 = 0;
                        } catch (android.database.sqlite.SQLiteFullException e) {
                            e = e;
                            r7 = RawQuery;
                            try {
                                zzr().zzf().zza("Error writing entry; local database full", e);
                                this.zzb = true;
                                if (r7 != 0) {
                                    r7.close();
                                }
                                if (sQLiteDatabaseZzae != null) {
                                    sQLiteDatabaseZzae.close();
                                }
                                i2++;
                                r2 = 0;
                            } catch (java.lang.Throwable th) {
                                th = th;
                                if (r7 != 0) {
                                    r7.close();
                                }
                                if (sQLiteDatabaseZzae != null) {
                                    sQLiteDatabaseZzae.close();
                                }
                                throw th;
                            }
                        } catch (android.database.sqlite.SQLiteException e2) {
                            e = e2;
                            sQLiteDatabase = sQLiteDatabaseZzae;
                            RawQuery = RawQuery;
                            if (sQLiteDatabase != null) {
                                try {
                                    if (sQLiteDatabase.inTransaction()) {
                                        sQLiteDatabase.endTransaction();
                                    }
                                } catch (java.lang.Throwable th2) {
                                    th = th2;
                                    sQLiteDatabaseZzae = sQLiteDatabase;
                                    r7 = RawQuery;
                                    if (r7 != 0) {
                                        r7.close();
                                    }
                                    if (sQLiteDatabaseZzae != null) {
                                        sQLiteDatabaseZzae.close();
                                    }
                                    throw th;
                                }
                            }
                            zzr().zzf().zza("Error writing entry to local database", e);
                            this.zzb = true;
                            if (RawQuery != 0) {
                                RawQuery.close();
                            }
                            if (sQLiteDatabase != null) {
                                sQLiteDatabase.close();
                            }
                            i2++;
                            r2 = 0;
                        } catch (java.lang.Throwable th3) {
                            th = th3;
                            r7 = RawQuery;
                            if (r7 != 0) {
                                r7.close();
                            }
                            if (sQLiteDatabaseZzae != null) {
                                sQLiteDatabaseZzae.close();
                            }
                            throw th;
                        }
                    }
                    if (j >= 100000) {
                        zzr().zzf().zza("Data loss, local db full");
                        long j2 = (100000 - j) + 1;
                        java.lang.String[] strArr = new java.lang.String[1];
                        strArr[r2] = java.lang.Long.toString(j2);
                        long jDelete = sQLiteDatabaseZzae.delete("messages", "rowid in (select rowid from messages order by rowid asc limit ?)", strArr);
                        if (jDelete != j2) {
                            zzr().zzf().zza("Different delete count than expected in local db. expected, received, difference", java.lang.Long.valueOf(j2), java.lang.Long.valueOf(jDelete), java.lang.Long.valueOf(j2 - jDelete));
                        }
                    }
                    sQLiteDatabaseZzae.insertOrThrow("messages", null, contentValues);
                    sQLiteDatabaseZzae.setTransactionSuccessful();
                    sQLiteDatabaseZzae.endTransaction();
                    if (RawQuery != 0) {
                        RawQuery.close();
                    }
                    if (sQLiteDatabaseZzae == null) {
                        return true;
                    }
                    sQLiteDatabaseZzae.close();
                    return true;
                } catch (android.database.sqlite.SQLiteDatabaseLockedException unused2) {
                } catch (android.database.sqlite.SQLiteFullException e3) {
                    e = e3;
                } catch (android.database.sqlite.SQLiteException e4) {
                    e = e4;
                    RawQuery = 0;
                }
            } catch (android.database.sqlite.SQLiteDatabaseLockedException unused3) {
                sQLiteDatabaseZzae = null;
            } catch (android.database.sqlite.SQLiteFullException e5) {
                e = e5;
                sQLiteDatabaseZzae = null;
            } catch (android.database.sqlite.SQLiteException e6) {
                e = e6;
                RawQuery = 0;
            } catch (java.lang.Throwable th4) {
                th = th4;
                sQLiteDatabaseZzae = null;
                if (r7 != 0) {
                    r7.close();
                }
                if (sQLiteDatabaseZzae != null) {
                    sQLiteDatabaseZzae.close();
                }
                throw th;
            }
        }
        zzr().zzx().zza("Failed to write entry to local database");
        return false;
    }

    public final boolean zza(com.google.android.gms.measurement.internal.zzan zzanVar) {
        android.os.Parcel parcelObtain = android.os.Parcel.obtain();
        zzanVar.writeToParcel(parcelObtain, 0);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        if (bArrMarshall.length > 131072) {
            zzr().zzg().zza("Event is too long for local database. Sending event directly to service");
            return false;
        }
        return zza(0, bArrMarshall);
    }

    public final boolean zza(com.google.android.gms.measurement.internal.zzkz zzkzVar) {
        android.os.Parcel parcelObtain = android.os.Parcel.obtain();
        zzkzVar.writeToParcel(parcelObtain, 0);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        if (bArrMarshall.length > 131072) {
            zzr().zzg().zza("User property too long for local database. Sending directly to service");
            return false;
        }
        return zza(1, bArrMarshall);
    }

    public final boolean zza(com.google.android.gms.measurement.internal.zzv zzvVar) {
        zzp();
        byte[] bArrZza = com.google.android.gms.measurement.internal.zzla.zza((android.os.Parcelable) zzvVar);
        if (bArrZza.length > 131072) {
            zzr().zzg().zza("Conditional user property too long for local database. Sending directly to service");
            return false;
        }
        return zza(2, bArrZza);
    }

    /* JADX WARN: Code duplicated, block: B:150:0x021b A[Catch: all -> 0x0267, TryCatch #2 {all -> 0x0267, blocks: (B:148:0x0215, B:150:0x021b, B:151:0x021e, B:166:0x024c, B:158:0x0239), top: B:183:0x0215 }] */
    /* JADX WARN: Code duplicated, block: B:153:0x022d  */
    /* JADX WARN: Code duplicated, block: B:155:0x0232  */
    /* JADX WARN: Code duplicated, block: B:161:0x0240  */
    /* JADX WARN: Code duplicated, block: B:163:0x0245  */
    /* JADX WARN: Code duplicated, block: B:168:0x025b  */
    /* JADX WARN: Code duplicated, block: B:170:0x0260  */
    /* JADX WARN: Code duplicated, block: B:176:0x026c  */
    /* JADX WARN: Code duplicated, block: B:178:0x0271  */
    /* JADX WARN: Code duplicated, block: B:183:0x0215 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:213:0x0263 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:215:0x0263 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:217:0x0263 A[SYNTHETIC] */
    public final java.util.List<com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable> zza(int i) throws java.lang.Throwable {
        android.database.sqlite.SQLiteDatabase sQLiteDatabase;
        android.database.Cursor cursor;
        android.database.sqlite.SQLiteDatabase sQLiteDatabaseZzae;
        android.database.sqlite.SQLiteDatabase sQLiteDatabase2;
        android.database.sqlite.SQLiteDatabase sQLiteDatabase3;
        java.lang.String str;
        java.lang.String[] strArr;
        android.database.Cursor cursorQuery;
        com.google.android.gms.measurement.internal.zzkz zzkzVarCreateFromParcel;
        com.google.android.gms.measurement.internal.zzv zzvVarCreateFromParcel;
        zzd();
        zzb();
        android.database.Cursor cursor2 = null;
        if (this.zzb) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (!zzaf()) {
            return arrayList;
        }
        int i2 = 5;
        for (int i3 = 0; i3 < 5; i3++) {
            try {
                sQLiteDatabaseZzae = zzae();
                try {
                    try {
                        if (sQLiteDatabaseZzae == null) {
                            this.zzb = true;
                            if (sQLiteDatabaseZzae != null) {
                                sQLiteDatabaseZzae.close();
                            }
                            return null;
                        }
                        try {
                            sQLiteDatabaseZzae.beginTransaction();
                            long j = -1;
                            if (zzt().zza(com.google.android.gms.measurement.internal.zzap.zzbz)) {
                                try {
                                    long jZza = zza(sQLiteDatabaseZzae);
                                    if (jZza != -1) {
                                        try {
                                            str = "rowid<?";
                                            strArr = new java.lang.String[]{java.lang.String.valueOf(jZza)};
                                        } catch (android.database.sqlite.SQLiteFullException e) {
                                            e = e;
                                            cursor = null;
                                            zzr().zzf().zza("Error reading entries from local database", e);
                                            this.zzb = true;
                                            if (cursor != null) {
                                                cursor.close();
                                            }
                                            if (sQLiteDatabaseZzae != null) {
                                                sQLiteDatabaseZzae.close();
                                            }
                                        } catch (android.database.sqlite.SQLiteException e2) {
                                            e = e2;
                                            cursor = null;
                                            if (sQLiteDatabaseZzae != null) {
                                                try {
                                                    if (sQLiteDatabaseZzae.inTransaction()) {
                                                        sQLiteDatabaseZzae.endTransaction();
                                                    }
                                                } catch (java.lang.Throwable th) {
                                                    th = th;
                                                    cursor2 = cursor;
                                                    sQLiteDatabase = sQLiteDatabaseZzae;
                                                    if (cursor2 != null) {
                                                        cursor2.close();
                                                    }
                                                    if (sQLiteDatabase != null) {
                                                        sQLiteDatabase.close();
                                                    }
                                                    throw th;
                                                }
                                            }
                                            zzr().zzf().zza("Error reading entries from local database", e);
                                            this.zzb = true;
                                            if (cursor != null) {
                                                cursor.close();
                                            }
                                            if (sQLiteDatabaseZzae != null) {
                                                sQLiteDatabaseZzae.close();
                                            }
                                        }
                                    } else {
                                        str = null;
                                        strArr = null;
                                    }
                                    sQLiteDatabase3 = sQLiteDatabaseZzae;
                                    try {
                                        try {
                                            cursorQuery = sQLiteDatabaseZzae.query("messages", new java.lang.String[]{"rowid", "type", "entry"}, str, strArr, null, null, "rowid asc", java.lang.Integer.toString(100));
                                        } catch (android.database.sqlite.SQLiteFullException e3) {
                                            e = e3;
                                            sQLiteDatabaseZzae = sQLiteDatabase3;
                                            cursor = null;
                                            zzr().zzf().zza("Error reading entries from local database", e);
                                            this.zzb = true;
                                            if (cursor != null) {
                                                cursor.close();
                                            }
                                            if (sQLiteDatabaseZzae != null) {
                                                sQLiteDatabaseZzae.close();
                                            }
                                        } catch (android.database.sqlite.SQLiteException e4) {
                                            e = e4;
                                            sQLiteDatabaseZzae = sQLiteDatabase3;
                                            cursor = null;
                                            if (sQLiteDatabaseZzae != null) {
                                                if (sQLiteDatabaseZzae.inTransaction()) {
                                                    sQLiteDatabaseZzae.endTransaction();
                                                }
                                            }
                                            zzr().zzf().zza("Error reading entries from local database", e);
                                            this.zzb = true;
                                            if (cursor != null) {
                                                cursor.close();
                                            }
                                            if (sQLiteDatabaseZzae != null) {
                                                sQLiteDatabaseZzae.close();
                                            }
                                        }
                                    } catch (android.database.sqlite.SQLiteDatabaseLockedException unused) {
                                        sQLiteDatabase = sQLiteDatabase3;
                                        cursor = null;
                                        sQLiteDatabase2 = sQLiteDatabase;
                                        android.os.SystemClock.sleep(i2);
                                        i2 += 20;
                                        if (cursor != null) {
                                            cursor.close();
                                        }
                                        if (sQLiteDatabase2 != null) {
                                            sQLiteDatabase2.close();
                                        }
                                    } catch (java.lang.Throwable th2) {
                                        th = th2;
                                        sQLiteDatabase = sQLiteDatabase3;
                                        if (cursor2 != null) {
                                            cursor2.close();
                                        }
                                        if (sQLiteDatabase != null) {
                                            sQLiteDatabase.close();
                                        }
                                        throw th;
                                    }
                                } catch (android.database.sqlite.SQLiteFullException e5) {
                                    e = e5;
                                } catch (android.database.sqlite.SQLiteException e6) {
                                    e = e6;
                                } catch (java.lang.Throwable th3) {
                                    th = th3;
                                    sQLiteDatabase3 = sQLiteDatabaseZzae;
                                    sQLiteDatabase = sQLiteDatabase3;
                                    if (cursor2 != null) {
                                        cursor2.close();
                                    }
                                    if (sQLiteDatabase != null) {
                                        sQLiteDatabase.close();
                                    }
                                    throw th;
                                }
                            } else {
                                sQLiteDatabase3 = sQLiteDatabaseZzae;
                                try {
                                    cursorQuery = sQLiteDatabase3.query("messages", new java.lang.String[]{"rowid", "type", "entry"}, null, null, null, null, "rowid asc", java.lang.Integer.toString(100));
                                } catch (android.database.sqlite.SQLiteFullException e7) {
                                    e = e7;
                                    sQLiteDatabase = sQLiteDatabase3;
                                    cursor = null;
                                    sQLiteDatabaseZzae = sQLiteDatabase;
                                    zzr().zzf().zza("Error reading entries from local database", e);
                                    this.zzb = true;
                                    if (cursor != null) {
                                        cursor.close();
                                    }
                                    if (sQLiteDatabaseZzae != null) {
                                        sQLiteDatabaseZzae.close();
                                    }
                                } catch (android.database.sqlite.SQLiteException e8) {
                                    e = e8;
                                    sQLiteDatabase = sQLiteDatabase3;
                                    cursor = null;
                                    sQLiteDatabaseZzae = sQLiteDatabase;
                                    if (sQLiteDatabaseZzae != null) {
                                        if (sQLiteDatabaseZzae.inTransaction()) {
                                            sQLiteDatabaseZzae.endTransaction();
                                        }
                                    }
                                    zzr().zzf().zza("Error reading entries from local database", e);
                                    this.zzb = true;
                                    if (cursor != null) {
                                        cursor.close();
                                    }
                                    if (sQLiteDatabaseZzae != null) {
                                        sQLiteDatabaseZzae.close();
                                    }
                                }
                            }
                            cursor = cursorQuery;
                            while (cursor.moveToNext()) {
                                try {
                                    try {
                                        try {
                                            j = cursor.getLong(0);
                                            int i4 = cursor.getInt(1);
                                            byte[] blob = cursor.getBlob(2);
                                            if (i4 == 0) {
                                                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                                                try {
                                                    try {
                                                        parcelObtain.unmarshall(blob, 0, blob.length);
                                                        parcelObtain.setDataPosition(0);
                                                        com.google.android.gms.measurement.internal.zzan zzanVarCreateFromParcel = com.google.android.gms.measurement.internal.zzan.CREATOR.createFromParcel(parcelObtain);
                                                        parcelObtain.recycle();
                                                        if (zzanVarCreateFromParcel != null) {
                                                            arrayList.add(zzanVarCreateFromParcel);
                                                        }
                                                    } catch (java.lang.Throwable th4) {
                                                        parcelObtain.recycle();
                                                        throw th4;
                                                    }
                                                } catch (com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException unused2) {
                                                    zzr().zzf().zza("Failed to load event from local database");
                                                    parcelObtain.recycle();
                                                }
                                            } else if (i4 == 1) {
                                                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                                                try {
                                                    try {
                                                        parcelObtain2.unmarshall(blob, 0, blob.length);
                                                        parcelObtain2.setDataPosition(0);
                                                        zzkzVarCreateFromParcel = com.google.android.gms.measurement.internal.zzkz.CREATOR.createFromParcel(parcelObtain2);
                                                        parcelObtain2.recycle();
                                                    } catch (com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException unused3) {
                                                        zzr().zzf().zza("Failed to load user property from local database");
                                                        parcelObtain2.recycle();
                                                        zzkzVarCreateFromParcel = null;
                                                    }
                                                    if (zzkzVarCreateFromParcel != null) {
                                                        arrayList.add(zzkzVarCreateFromParcel);
                                                    }
                                                } catch (java.lang.Throwable th5) {
                                                    parcelObtain2.recycle();
                                                    throw th5;
                                                }
                                            } else if (i4 == 2) {
                                                android.os.Parcel parcelObtain3 = android.os.Parcel.obtain();
                                                try {
                                                    try {
                                                        parcelObtain3.unmarshall(blob, 0, blob.length);
                                                        parcelObtain3.setDataPosition(0);
                                                        zzvVarCreateFromParcel = com.google.android.gms.measurement.internal.zzv.CREATOR.createFromParcel(parcelObtain3);
                                                        parcelObtain3.recycle();
                                                    } catch (com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException unused4) {
                                                        zzr().zzf().zza("Failed to load conditional user property from local database");
                                                        parcelObtain3.recycle();
                                                        zzvVarCreateFromParcel = null;
                                                    }
                                                    if (zzvVarCreateFromParcel != null) {
                                                        arrayList.add(zzvVarCreateFromParcel);
                                                    }
                                                } catch (java.lang.Throwable th6) {
                                                    parcelObtain3.recycle();
                                                    throw th6;
                                                }
                                            } else if (i4 == 3) {
                                                zzr().zzi().zza("Skipping app launch break");
                                            } else {
                                                zzr().zzf().zza("Unknown record type in local database");
                                            }
                                        } catch (android.database.sqlite.SQLiteFullException e9) {
                                            e = e9;
                                            sQLiteDatabaseZzae = sQLiteDatabase3;
                                            zzr().zzf().zza("Error reading entries from local database", e);
                                            this.zzb = true;
                                            if (cursor != null) {
                                                cursor.close();
                                            }
                                            if (sQLiteDatabaseZzae != null) {
                                                sQLiteDatabaseZzae.close();
                                            }
                                        } catch (android.database.sqlite.SQLiteException e10) {
                                            e = e10;
                                            sQLiteDatabaseZzae = sQLiteDatabase3;
                                            if (sQLiteDatabaseZzae != null) {
                                                if (sQLiteDatabaseZzae.inTransaction()) {
                                                    sQLiteDatabaseZzae.endTransaction();
                                                }
                                            }
                                            zzr().zzf().zza("Error reading entries from local database", e);
                                            this.zzb = true;
                                            if (cursor != null) {
                                                cursor.close();
                                            }
                                            if (sQLiteDatabaseZzae != null) {
                                                sQLiteDatabaseZzae.close();
                                            }
                                        }
                                    } catch (android.database.sqlite.SQLiteDatabaseLockedException unused5) {
                                        sQLiteDatabase = sQLiteDatabase3;
                                    } catch (java.lang.Throwable th7) {
                                        th = th7;
                                        sQLiteDatabase = sQLiteDatabase3;
                                    }
                                } catch (android.database.sqlite.SQLiteFullException e11) {
                                    e = e11;
                                    sQLiteDatabase = sQLiteDatabase3;
                                } catch (android.database.sqlite.SQLiteException e12) {
                                    e = e12;
                                    sQLiteDatabase = sQLiteDatabase3;
                                }
                            }
                            sQLiteDatabase = sQLiteDatabase3;
                            try {
                                if (sQLiteDatabase.delete("messages", "rowid <= ?", new java.lang.String[]{java.lang.Long.toString(j)}) < arrayList.size()) {
                                    zzr().zzf().zza("Fewer entries removed from local database than expected");
                                }
                                sQLiteDatabase.setTransactionSuccessful();
                                sQLiteDatabase.endTransaction();
                                if (cursor != null) {
                                    cursor.close();
                                }
                                if (sQLiteDatabase != null) {
                                    sQLiteDatabase.close();
                                }
                                return arrayList;
                            } catch (android.database.sqlite.SQLiteDatabaseLockedException unused6) {
                                sQLiteDatabase2 = sQLiteDatabase;
                                android.os.SystemClock.sleep(i2);
                                i2 += 20;
                                if (cursor != null) {
                                    cursor.close();
                                }
                                if (sQLiteDatabase2 != null) {
                                    sQLiteDatabase2.close();
                                }
                            } catch (android.database.sqlite.SQLiteFullException e13) {
                                e = e13;
                                sQLiteDatabaseZzae = sQLiteDatabase;
                                zzr().zzf().zza("Error reading entries from local database", e);
                                this.zzb = true;
                                if (cursor != null) {
                                    cursor.close();
                                }
                                if (sQLiteDatabaseZzae != null) {
                                    sQLiteDatabaseZzae.close();
                                }
                            } catch (android.database.sqlite.SQLiteException e14) {
                                e = e14;
                                sQLiteDatabaseZzae = sQLiteDatabase;
                                if (sQLiteDatabaseZzae != null) {
                                    if (sQLiteDatabaseZzae.inTransaction()) {
                                        sQLiteDatabaseZzae.endTransaction();
                                    }
                                }
                                zzr().zzf().zza("Error reading entries from local database", e);
                                this.zzb = true;
                                if (cursor != null) {
                                    cursor.close();
                                }
                                if (sQLiteDatabaseZzae != null) {
                                    sQLiteDatabaseZzae.close();
                                }
                            } catch (java.lang.Throwable th8) {
                                th = th8;
                                cursor2 = cursor;
                                if (cursor2 != null) {
                                    cursor2.close();
                                }
                                if (sQLiteDatabase != null) {
                                    sQLiteDatabase.close();
                                }
                                throw th;
                            }
                        } catch (android.database.sqlite.SQLiteFullException e15) {
                            e = e15;
                        } catch (android.database.sqlite.SQLiteException e16) {
                            e = e16;
                        }
                    } catch (java.lang.Throwable th9) {
                        th = th9;
                        sQLiteDatabase = sQLiteDatabaseZzae;
                        if (cursor2 != null) {
                            cursor2.close();
                        }
                        if (sQLiteDatabase != null) {
                            sQLiteDatabase.close();
                        }
                        throw th;
                    }
                } catch (android.database.sqlite.SQLiteDatabaseLockedException unused7) {
                    sQLiteDatabase = sQLiteDatabaseZzae;
                }
            } catch (android.database.sqlite.SQLiteDatabaseLockedException unused8) {
                cursor = null;
                sQLiteDatabase2 = null;
            } catch (android.database.sqlite.SQLiteFullException e17) {
                e = e17;
                cursor = null;
                sQLiteDatabaseZzae = null;
            } catch (android.database.sqlite.SQLiteException e18) {
                e = e18;
                cursor = null;
                sQLiteDatabaseZzae = null;
            } catch (java.lang.Throwable th10) {
                th = th10;
                sQLiteDatabase = null;
            }
        }
        zzr().zzi().zza("Failed to read events from database in reasonable time");
        return null;
    }

    public final boolean zzac() {
        return zza(3, new byte[0]);
    }

    public final boolean zzad() {
        zzd();
        zzb();
        if (this.zzb || !zzaf()) {
            return false;
        }
        int i = 5;
        for (int i2 = 0; i2 < 5; i2++) {
            android.database.sqlite.SQLiteDatabase sQLiteDatabase = null;
            try {
                try {
                    android.database.sqlite.SQLiteDatabase sQLiteDatabaseZzae = zzae();
                    if (sQLiteDatabaseZzae == null) {
                        this.zzb = true;
                        if (sQLiteDatabaseZzae != null) {
                            sQLiteDatabaseZzae.close();
                        }
                        return false;
                    }
                    sQLiteDatabaseZzae.beginTransaction();
                    sQLiteDatabaseZzae.delete("messages", "type == ?", new java.lang.String[]{java.lang.Integer.toString(3)});
                    sQLiteDatabaseZzae.setTransactionSuccessful();
                    sQLiteDatabaseZzae.endTransaction();
                    if (sQLiteDatabaseZzae != null) {
                        sQLiteDatabaseZzae.close();
                    }
                    return true;
                } catch (android.database.sqlite.SQLiteException e) {
                    if (0 != 0) {
                        try {
                            if (sQLiteDatabase.inTransaction()) {
                                sQLiteDatabase.endTransaction();
                            }
                        } catch (java.lang.Throwable th) {
                            if (0 != 0) {
                                sQLiteDatabase.close();
                            }
                            throw th;
                        }
                    }
                    zzr().zzf().zza("Error deleting app launch break from local database", e);
                    this.zzb = true;
                    if (0 != 0) {
                        sQLiteDatabase.close();
                    }
                }
            } catch (android.database.sqlite.SQLiteDatabaseLockedException unused) {
                android.os.SystemClock.sleep(i);
                i += 20;
                if (0 != 0) {
                    sQLiteDatabase.close();
                }
            } catch (android.database.sqlite.SQLiteFullException e2) {
                zzr().zzf().zza("Error deleting app launch break from local database", e2);
                this.zzb = true;
                if (0 != 0) {
                    sQLiteDatabase.close();
                }
            }
        }
        zzr().zzi().zza("Error deleting app launch break from local database in reasonable time");
        return false;
    }

    private static long zza(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        android.database.Cursor cursorQuery = null;
        try {
            cursorQuery = sQLiteDatabase.query("messages", new java.lang.String[]{"rowid"}, "type=?", new java.lang.String[]{"3"}, null, null, "rowid desc", "1");
            if (cursorQuery.moveToFirst()) {
                return cursorQuery.getLong(0);
            }
        } finally {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        }
    }

    private final android.database.sqlite.SQLiteDatabase zzae() throws android.database.sqlite.SQLiteException {
        if (this.zzb) {
            return null;
        }
        android.database.sqlite.SQLiteDatabase writableDatabase = this.zza.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.zzb = true;
        return null;
    }

    private final boolean zzaf() {
        return zzn().getDatabasePath("google_app_measurement_local.db").exists();
    }

    @Override // com.google.android.gms.measurement.internal.zzf, com.google.android.gms.measurement.internal.zzhf
    public final /* bridge */ /* synthetic */ void zza() {
        super.zza();
    }

    @Override // com.google.android.gms.measurement.internal.zzf, com.google.android.gms.measurement.internal.zzhf
    public final /* bridge */ /* synthetic */ void zzb() {
        super.zzb();
    }

    @Override // com.google.android.gms.measurement.internal.zzf, com.google.android.gms.measurement.internal.zzhf
    public final /* bridge */ /* synthetic */ void zzc() {
        super.zzc();
    }

    @Override // com.google.android.gms.measurement.internal.zzf, com.google.android.gms.measurement.internal.zzhf
    public final /* bridge */ /* synthetic */ void zzd() {
        super.zzd();
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.zzb zze() {
        return super.zze();
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.zzhp zzf() {
        return super.zzf();
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.zzfd zzg() {
        return super.zzg();
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.zzix zzh() {
        return super.zzh();
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.zziw zzi() {
        return super.zzi();
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.zzfg zzj() {
        return super.zzj();
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.zzkc zzk() {
        return super.zzk();
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
