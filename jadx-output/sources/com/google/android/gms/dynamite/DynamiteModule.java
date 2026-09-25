package com.google.android.gms.dynamite;

/* JADX INFO: loaded from: classes.dex */
public final class DynamiteModule {
    private static java.lang.Boolean zzif = null;
    private static com.google.android.gms.dynamite.zzi zzig = null;
    private static com.google.android.gms.dynamite.zzk zzih = null;
    private static java.lang.String zzii = null;
    private static int zzij = -1;
    private final android.content.Context zzin;
    private static final java.lang.ThreadLocal<com.google.android.gms.dynamite.DynamiteModule.zza> zzik = new java.lang.ThreadLocal<>();
    private static final com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.zza zzil = new com.google.android.gms.dynamite.zza();
    public static final com.google.android.gms.dynamite.DynamiteModule.VersionPolicy PREFER_REMOTE = new com.google.android.gms.dynamite.zzb();
    public static final com.google.android.gms.dynamite.DynamiteModule.VersionPolicy PREFER_LOCAL = new com.google.android.gms.dynamite.zzc();
    public static final com.google.android.gms.dynamite.DynamiteModule.VersionPolicy PREFER_HIGHEST_OR_LOCAL_VERSION = new com.google.android.gms.dynamite.zzd();
    public static final com.google.android.gms.dynamite.DynamiteModule.VersionPolicy PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING = new com.google.android.gms.dynamite.zze();
    public static final com.google.android.gms.dynamite.DynamiteModule.VersionPolicy PREFER_HIGHEST_OR_REMOTE_VERSION = new com.google.android.gms.dynamite.zzf();
    private static final com.google.android.gms.dynamite.DynamiteModule.VersionPolicy zzim = new com.google.android.gms.dynamite.zzg();

    public static class DynamiteLoaderClassLoader {
        public static java.lang.ClassLoader sClassLoader;
    }

    public interface VersionPolicy {

        public interface zza {
            int getLocalVersion(android.content.Context context, java.lang.String str);

            int zza(android.content.Context context, java.lang.String str, boolean z) throws com.google.android.gms.dynamite.DynamiteModule.LoadingException;
        }

        public static class zzb {
            public int zzir = 0;
            public int zzis = 0;
            public int zzit = 0;
        }

        com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.zzb zza(android.content.Context context, java.lang.String str, com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.zza zzaVar) throws com.google.android.gms.dynamite.DynamiteModule.LoadingException;
    }

    private static class zza {
        public android.database.Cursor zzio;

        private zza() {
        }

        /* synthetic */ zza(com.google.android.gms.dynamite.zza zzaVar) {
            this();
        }
    }

    public static com.google.android.gms.dynamite.DynamiteModule load(android.content.Context context, com.google.android.gms.dynamite.DynamiteModule.VersionPolicy versionPolicy, java.lang.String str) throws com.google.android.gms.dynamite.DynamiteModule.LoadingException {
        java.lang.ThreadLocal<com.google.android.gms.dynamite.DynamiteModule.zza> threadLocal = zzik;
        com.google.android.gms.dynamite.DynamiteModule.zza zzaVar = threadLocal.get();
        com.google.android.gms.dynamite.zza zzaVar2 = null;
        com.google.android.gms.dynamite.DynamiteModule.zza zzaVar3 = new com.google.android.gms.dynamite.DynamiteModule.zza(zzaVar2);
        threadLocal.set(zzaVar3);
        try {
            com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.zzb zzbVarZza = versionPolicy.zza(context, str, zzil);
            int i = zzbVarZza.zzir;
            int i2 = zzbVarZza.zzis;
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 68 + java.lang.String.valueOf(str).length());
            sb.append("Considering local module ");
            sb.append(str);
            sb.append(":");
            sb.append(i);
            sb.append(" and remote module ");
            sb.append(str);
            sb.append(":");
            sb.append(i2);
            android.util.Log.i("DynamiteModule", sb.toString());
            if (zzbVarZza.zzit == 0 || ((zzbVarZza.zzit == -1 && zzbVarZza.zzir == 0) || (zzbVarZza.zzit == 1 && zzbVarZza.zzis == 0))) {
                int i3 = zzbVarZza.zzir;
                int i4 = zzbVarZza.zzis;
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder(91);
                sb2.append("No acceptable module found. Local version is ");
                sb2.append(i3);
                sb2.append(" and remote version is ");
                sb2.append(i4);
                sb2.append(".");
                throw new com.google.android.gms.dynamite.DynamiteModule.LoadingException(sb2.toString(), zzaVar2);
            }
            if (zzbVarZza.zzit == -1) {
                com.google.android.gms.dynamite.DynamiteModule dynamiteModuleZze = zze(context, str);
                if (zzaVar3.zzio != null) {
                    zzaVar3.zzio.close();
                }
                threadLocal.set(zzaVar);
                return dynamiteModuleZze;
            }
            if (zzbVarZza.zzit != 1) {
                int i5 = zzbVarZza.zzit;
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder(47);
                sb3.append("VersionPolicy returned invalid code:");
                sb3.append(i5);
                throw new com.google.android.gms.dynamite.DynamiteModule.LoadingException(sb3.toString(), zzaVar2);
            }
            try {
                com.google.android.gms.dynamite.DynamiteModule dynamiteModuleZza = zza(context, str, zzbVarZza.zzis);
                if (zzaVar3.zzio != null) {
                    zzaVar3.zzio.close();
                }
                threadLocal.set(zzaVar);
                return dynamiteModuleZza;
            } catch (com.google.android.gms.dynamite.DynamiteModule.LoadingException e) {
                java.lang.String strValueOf = java.lang.String.valueOf(e.getMessage());
                android.util.Log.w("DynamiteModule", strValueOf.length() != 0 ? "Failed to load remote module: ".concat(strValueOf) : new java.lang.String("Failed to load remote module: "));
                if (zzbVarZza.zzir == 0 || versionPolicy.zza(context, str, new com.google.android.gms.dynamite.DynamiteModule.zzb(zzbVarZza.zzir, 0)).zzit != -1) {
                    throw new com.google.android.gms.dynamite.DynamiteModule.LoadingException("Remote load failed. No local fallback found.", e, zzaVar2);
                }
                com.google.android.gms.dynamite.DynamiteModule dynamiteModuleZze2 = zze(context, str);
                if (zzaVar3.zzio != null) {
                    zzaVar3.zzio.close();
                }
                zzik.set(zzaVar);
                return dynamiteModuleZze2;
            }
        } catch (java.lang.Throwable th) {
            if (zzaVar3.zzio != null) {
                zzaVar3.zzio.close();
            }
            zzik.set(zzaVar);
            throw th;
        }
    }

    public static class LoadingException extends java.lang.Exception {
        private LoadingException(java.lang.String str) {
            super(str);
        }

        private LoadingException(java.lang.String str, java.lang.Throwable th) {
            super(str, th);
        }

        /* synthetic */ LoadingException(java.lang.String str, com.google.android.gms.dynamite.zza zzaVar) {
            this(str);
        }

        /* synthetic */ LoadingException(java.lang.String str, java.lang.Throwable th, com.google.android.gms.dynamite.zza zzaVar) {
            this(str, th);
        }
    }

    private static class zzb implements com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.zza {
        private final int zzip;
        private final int zziq = 0;

        public zzb(int i, int i2) {
            this.zzip = i;
        }

        @Override // com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.zza
        public final int zza(android.content.Context context, java.lang.String str, boolean z) {
            return 0;
        }

        @Override // com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.zza
        public final int getLocalVersion(android.content.Context context, java.lang.String str) {
            return this.zzip;
        }
    }

    public static int getLocalVersion(android.content.Context context, java.lang.String str) {
        try {
            java.lang.ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 61);
            sb.append("com.google.android.gms.dynamite.descriptors.");
            sb.append(str);
            sb.append(".ModuleDescriptor");
            java.lang.Class<?> clsLoadClass = classLoader.loadClass(sb.toString());
            java.lang.reflect.Field declaredField = clsLoadClass.getDeclaredField("MODULE_ID");
            java.lang.reflect.Field declaredField2 = clsLoadClass.getDeclaredField("MODULE_VERSION");
            if (!declaredField.get(null).equals(str)) {
                java.lang.String strValueOf = java.lang.String.valueOf(declaredField.get(null));
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder(java.lang.String.valueOf(strValueOf).length() + 51 + java.lang.String.valueOf(str).length());
                sb2.append("Module descriptor id '");
                sb2.append(strValueOf);
                sb2.append("' didn't match expected id '");
                sb2.append(str);
                sb2.append("'");
                android.util.Log.e("DynamiteModule", sb2.toString());
                return 0;
            }
            return declaredField2.getInt(null);
        } catch (java.lang.ClassNotFoundException unused) {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 45);
            sb3.append("Local module descriptor class for ");
            sb3.append(str);
            sb3.append(" not found.");
            android.util.Log.w("DynamiteModule", sb3.toString());
            return 0;
        } catch (java.lang.Exception e) {
            java.lang.String strValueOf2 = java.lang.String.valueOf(e.getMessage());
            android.util.Log.e("DynamiteModule", strValueOf2.length() != 0 ? "Failed to load module descriptor class: ".concat(strValueOf2) : new java.lang.String("Failed to load module descriptor class: "));
            return 0;
        }
    }

    public static int zza(android.content.Context context, java.lang.String str, boolean z) {
        java.lang.Boolean bool;
        try {
            synchronized (com.google.android.gms.dynamite.DynamiteModule.class) {
                java.lang.Boolean bool2 = zzif;
                if (bool2 == null) {
                    try {
                        java.lang.Class<?> clsLoadClass = context.getApplicationContext().getClassLoader().loadClass(com.google.android.gms.dynamite.DynamiteModule.DynamiteLoaderClassLoader.class.getName());
                        java.lang.reflect.Field declaredField = clsLoadClass.getDeclaredField("sClassLoader");
                        synchronized (clsLoadClass) {
                            java.lang.ClassLoader classLoader = (java.lang.ClassLoader) declaredField.get(null);
                            if (classLoader != null) {
                                if (classLoader == java.lang.ClassLoader.getSystemClassLoader()) {
                                    bool = java.lang.Boolean.FALSE;
                                } else {
                                    try {
                                        zza(classLoader);
                                    } catch (com.google.android.gms.dynamite.DynamiteModule.LoadingException unused) {
                                    }
                                    bool = java.lang.Boolean.TRUE;
                                }
                            } else if ("com.google.android.gms".equals(context.getApplicationContext().getPackageName())) {
                                declaredField.set(null, java.lang.ClassLoader.getSystemClassLoader());
                                bool = java.lang.Boolean.FALSE;
                            } else {
                                try {
                                    int iZzc = zzc(context, str, z);
                                    java.lang.String str2 = zzii;
                                    if (str2 != null && !str2.isEmpty()) {
                                        com.google.android.gms.dynamite.zzh zzhVar = new com.google.android.gms.dynamite.zzh(zzii, java.lang.ClassLoader.getSystemClassLoader());
                                        zza(zzhVar);
                                        declaredField.set(null, zzhVar);
                                        zzif = java.lang.Boolean.TRUE;
                                        return iZzc;
                                    }
                                    return iZzc;
                                } catch (com.google.android.gms.dynamite.DynamiteModule.LoadingException unused2) {
                                    declaredField.set(null, java.lang.ClassLoader.getSystemClassLoader());
                                    bool = java.lang.Boolean.FALSE;
                                }
                            }
                            bool2 = bool;
                            zzif = bool2;
                        }
                    } catch (java.lang.ClassNotFoundException | java.lang.IllegalAccessException | java.lang.NoSuchFieldException e) {
                        java.lang.String strValueOf = java.lang.String.valueOf(e);
                        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(strValueOf).length() + 30);
                        sb.append("Failed to load module via V2: ");
                        sb.append(strValueOf);
                        android.util.Log.w("DynamiteModule", sb.toString());
                        bool2 = java.lang.Boolean.FALSE;
                    }
                }
                if (bool2.booleanValue()) {
                    try {
                        return zzc(context, str, z);
                    } catch (com.google.android.gms.dynamite.DynamiteModule.LoadingException e2) {
                        java.lang.String strValueOf2 = java.lang.String.valueOf(e2.getMessage());
                        android.util.Log.w("DynamiteModule", strValueOf2.length() != 0 ? "Failed to retrieve remote module version: ".concat(strValueOf2) : new java.lang.String("Failed to retrieve remote module version: "));
                        return 0;
                    }
                }
                return zzb(context, str, z);
            }
        } catch (java.lang.Throwable th) {
            com.google.android.gms.common.util.CrashUtils.addDynamiteErrorToDropBox(context, th);
            throw th;
        }
    }

    private static int zzb(android.content.Context context, java.lang.String str, boolean z) {
        com.google.android.gms.dynamite.zzi zziVarZzj = zzj(context);
        if (zziVarZzj == null) {
            return 0;
        }
        try {
            if (zziVarZzj.zzak() >= 2) {
                return zziVarZzj.zzb(com.google.android.gms.dynamic.ObjectWrapper.wrap(context), str, z);
            }
            android.util.Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
            return zziVarZzj.zza(com.google.android.gms.dynamic.ObjectWrapper.wrap(context), str, z);
        } catch (android.os.RemoteException e) {
            java.lang.String strValueOf = java.lang.String.valueOf(e.getMessage());
            android.util.Log.w("DynamiteModule", strValueOf.length() != 0 ? "Failed to retrieve remote module version: ".concat(strValueOf) : new java.lang.String("Failed to retrieve remote module version: "));
            return 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0080  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b4  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.dynamite.zza] */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    private static int zzc(android.content.Context context, java.lang.String str, boolean z) throws java.lang.Throwable {
        android.database.Cursor cursor;
        ?? r0 = 0;
        android.database.Cursor cursor2 = null;
        try {
            android.content.ContentResolver contentResolver = context.getContentResolver();
            java.lang.String str2 = z ? "api_force_staging" : "api";
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(str2).length() + 42 + java.lang.String.valueOf(str).length());
            sb.append("content://com.google.android.gms.chimera/");
            sb.append(str2);
            sb.append("/");
            sb.append(str);
            android.database.Cursor cursorQuery = contentResolver.query(android.net.Uri.parse(sb.toString()), null, null, null, null);
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.moveToFirst()) {
                        int i = cursorQuery.getInt(0);
                        if (i > 0) {
                            synchronized (com.google.android.gms.dynamite.DynamiteModule.class) {
                                zzii = cursorQuery.getString(2);
                                int columnIndex = cursorQuery.getColumnIndex("loaderVersion");
                                if (columnIndex >= 0) {
                                    zzij = cursorQuery.getInt(columnIndex);
                                }
                            }
                            com.google.android.gms.dynamite.DynamiteModule.zza zzaVar = zzik.get();
                            if (zzaVar == null || zzaVar.zzio != null) {
                                cursor2 = cursorQuery;
                            } else {
                                zzaVar.zzio = cursorQuery;
                            }
                        } else {
                            cursor2 = cursorQuery;
                        }
                        if (cursor2 != null) {
                            cursor2.close();
                        }
                        return i;
                    }
                } catch (java.lang.Exception e) {
                    cursor = cursorQuery;
                    e = e;
                    try {
                        if (e instanceof com.google.android.gms.dynamite.DynamiteModule.LoadingException) {
                            throw e;
                        }
                        throw new com.google.android.gms.dynamite.DynamiteModule.LoadingException("V2 version check failed", e, r0);
                    } catch (java.lang.Throwable th) {
                        th = th;
                        r0 = cursor;
                        if (r0 != 0) {
                            r0.close();
                        }
                        throw th;
                    }
                } catch (java.lang.Throwable th2) {
                    r0 = cursorQuery;
                    th = th2;
                    if (r0 != 0) {
                        r0.close();
                    }
                    throw th;
                }
            }
            android.util.Log.w("DynamiteModule", "Failed to retrieve remote module version.");
            throw new com.google.android.gms.dynamite.DynamiteModule.LoadingException("Failed to connect to dynamite module ContentResolver.", (com.google.android.gms.dynamite.zza) r0);
        } catch (java.lang.Exception e2) {
            e = e2;
            cursor = null;
        } catch (java.lang.Throwable th3) {
            th = th3;
        }
    }

    public static int getRemoteVersion(android.content.Context context, java.lang.String str) {
        return zza(context, str, false);
    }

    private static com.google.android.gms.dynamite.DynamiteModule zze(android.content.Context context, java.lang.String str) {
        java.lang.String strValueOf = java.lang.String.valueOf(str);
        android.util.Log.i("DynamiteModule", strValueOf.length() != 0 ? "Selected local version of ".concat(strValueOf) : new java.lang.String("Selected local version of "));
        return new com.google.android.gms.dynamite.DynamiteModule(context.getApplicationContext());
    }

    private static com.google.android.gms.dynamite.DynamiteModule zza(android.content.Context context, java.lang.String str, int i) throws com.google.android.gms.dynamite.DynamiteModule.LoadingException {
        java.lang.Boolean bool;
        com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperZza;
        com.google.android.gms.dynamite.zza zzaVar = null;
        try {
            synchronized (com.google.android.gms.dynamite.DynamiteModule.class) {
                bool = zzif;
            }
            if (bool == null) {
                throw new com.google.android.gms.dynamite.DynamiteModule.LoadingException("Failed to determine which loading route to use.", zzaVar);
            }
            if (bool.booleanValue()) {
                return zzb(context, str, i);
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 51);
            sb.append("Selected remote version of ");
            sb.append(str);
            sb.append(", version >= ");
            sb.append(i);
            android.util.Log.i("DynamiteModule", sb.toString());
            com.google.android.gms.dynamite.zzi zziVarZzj = zzj(context);
            if (zziVarZzj == null) {
                throw new com.google.android.gms.dynamite.DynamiteModule.LoadingException("Failed to create IDynamiteLoader.", zzaVar);
            }
            if (zziVarZzj.zzak() >= 2) {
                iObjectWrapperZza = zziVarZzj.zzb(com.google.android.gms.dynamic.ObjectWrapper.wrap(context), str, i);
            } else {
                android.util.Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                iObjectWrapperZza = zziVarZzj.zza(com.google.android.gms.dynamic.ObjectWrapper.wrap(context), str, i);
            }
            if (com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapperZza) == null) {
                throw new com.google.android.gms.dynamite.DynamiteModule.LoadingException("Failed to load remote module.", zzaVar);
            }
            return new com.google.android.gms.dynamite.DynamiteModule((android.content.Context) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapperZza));
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.dynamite.DynamiteModule.LoadingException("Failed to load remote module.", e, zzaVar);
        } catch (com.google.android.gms.dynamite.DynamiteModule.LoadingException e2) {
            throw e2;
        } catch (java.lang.Throwable th) {
            com.google.android.gms.common.util.CrashUtils.addDynamiteErrorToDropBox(context, th);
            throw new com.google.android.gms.dynamite.DynamiteModule.LoadingException("Failed to load remote module.", th, zzaVar);
        }
    }

    private static com.google.android.gms.dynamite.zzi zzj(android.content.Context context) {
        com.google.android.gms.dynamite.zzi zzjVar;
        synchronized (com.google.android.gms.dynamite.DynamiteModule.class) {
            com.google.android.gms.dynamite.zzi zziVar = zzig;
            if (zziVar != null) {
                return zziVar;
            }
            if (com.google.android.gms.common.GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(context) != 0) {
                return null;
            }
            try {
                android.os.IBinder iBinder = (android.os.IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    zzjVar = null;
                } else {
                    android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    if (iInterfaceQueryLocalInterface instanceof com.google.android.gms.dynamite.zzi) {
                        zzjVar = (com.google.android.gms.dynamite.zzi) iInterfaceQueryLocalInterface;
                    } else {
                        zzjVar = new com.google.android.gms.dynamite.zzj(iBinder);
                    }
                }
                if (zzjVar != null) {
                    zzig = zzjVar;
                    return zzjVar;
                }
            } catch (java.lang.Exception e) {
                java.lang.String strValueOf = java.lang.String.valueOf(e.getMessage());
                android.util.Log.e("DynamiteModule", strValueOf.length() != 0 ? "Failed to load IDynamiteLoader from GmsCore: ".concat(strValueOf) : new java.lang.String("Failed to load IDynamiteLoader from GmsCore: "));
            }
            return null;
        }
    }

    public final android.content.Context getModuleContext() {
        return this.zzin;
    }

    private static com.google.android.gms.dynamite.DynamiteModule zzb(android.content.Context context, java.lang.String str, int i) throws android.os.RemoteException, com.google.android.gms.dynamite.DynamiteModule.LoadingException {
        com.google.android.gms.dynamite.zzk zzkVar;
        com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperZza;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 51);
        sb.append("Selected remote version of ");
        sb.append(str);
        sb.append(", version >= ");
        sb.append(i);
        android.util.Log.i("DynamiteModule", sb.toString());
        synchronized (com.google.android.gms.dynamite.DynamiteModule.class) {
            zzkVar = zzih;
        }
        com.google.android.gms.dynamite.zza zzaVar = null;
        if (zzkVar == null) {
            throw new com.google.android.gms.dynamite.DynamiteModule.LoadingException("DynamiteLoaderV2 was not cached.", zzaVar);
        }
        com.google.android.gms.dynamite.DynamiteModule.zza zzaVar2 = zzik.get();
        if (zzaVar2 == null || zzaVar2.zzio == null) {
            throw new com.google.android.gms.dynamite.DynamiteModule.LoadingException("No result cursor", zzaVar);
        }
        android.content.Context applicationContext = context.getApplicationContext();
        android.database.Cursor cursor = zzaVar2.zzio;
        com.google.android.gms.dynamic.ObjectWrapper.wrap(null);
        if (zzaj().booleanValue()) {
            android.util.Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
            iObjectWrapperZza = zzkVar.zzb(com.google.android.gms.dynamic.ObjectWrapper.wrap(applicationContext), str, i, com.google.android.gms.dynamic.ObjectWrapper.wrap(cursor));
        } else {
            android.util.Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
            iObjectWrapperZza = zzkVar.zza(com.google.android.gms.dynamic.ObjectWrapper.wrap(applicationContext), str, i, com.google.android.gms.dynamic.ObjectWrapper.wrap(cursor));
        }
        android.content.Context context2 = (android.content.Context) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapperZza);
        if (context2 == null) {
            throw new com.google.android.gms.dynamite.DynamiteModule.LoadingException("Failed to get module context", zzaVar);
        }
        return new com.google.android.gms.dynamite.DynamiteModule(context2);
    }

    private static java.lang.Boolean zzaj() {
        java.lang.Boolean boolValueOf;
        synchronized (com.google.android.gms.dynamite.DynamiteModule.class) {
            boolValueOf = java.lang.Boolean.valueOf(zzij >= 2);
        }
        return boolValueOf;
    }

    private static void zza(java.lang.ClassLoader classLoader) throws com.google.android.gms.dynamite.DynamiteModule.LoadingException {
        com.google.android.gms.dynamite.zzk zzlVar;
        com.google.android.gms.dynamite.zza zzaVar = null;
        try {
            android.os.IBinder iBinder = (android.os.IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
            if (iBinder == null) {
                zzlVar = null;
            } else {
                android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                if (iInterfaceQueryLocalInterface instanceof com.google.android.gms.dynamite.zzk) {
                    zzlVar = (com.google.android.gms.dynamite.zzk) iInterfaceQueryLocalInterface;
                } else {
                    zzlVar = new com.google.android.gms.dynamite.zzl(iBinder);
                }
            }
            zzih = zzlVar;
        } catch (java.lang.ClassNotFoundException | java.lang.IllegalAccessException | java.lang.InstantiationException | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException e) {
            throw new com.google.android.gms.dynamite.DynamiteModule.LoadingException("Failed to instantiate dynamite loader", e, zzaVar);
        }
    }

    public final android.os.IBinder instantiate(java.lang.String str) throws com.google.android.gms.dynamite.DynamiteModule.LoadingException {
        try {
            return (android.os.IBinder) this.zzin.getClassLoader().loadClass(str).newInstance();
        } catch (java.lang.ClassNotFoundException | java.lang.IllegalAccessException | java.lang.InstantiationException e) {
            java.lang.String strValueOf = java.lang.String.valueOf(str);
            throw new com.google.android.gms.dynamite.DynamiteModule.LoadingException(strValueOf.length() != 0 ? "Failed to instantiate module class: ".concat(strValueOf) : new java.lang.String("Failed to instantiate module class: "), e, null);
        }
    }

    private DynamiteModule(android.content.Context context) {
        this.zzin = (android.content.Context) com.google.android.gms.common.internal.Preconditions.checkNotNull(context);
    }
}
