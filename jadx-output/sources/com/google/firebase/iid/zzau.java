package com.google.firebase.iid;

/* JADX INFO: compiled from: com.google.firebase:firebase-iid@@20.2.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzau {
    private static int zza;
    private static android.app.PendingIntent zzb;
    private final android.content.Context zzd;
    private final com.google.firebase.iid.zzao zze;
    private android.os.Messenger zzg;
    private com.google.firebase.iid.zzj zzh;
    private final androidx.collection.SimpleArrayMap<java.lang.String, com.google.android.gms.tasks.TaskCompletionSource<android.os.Bundle>> zzc = new androidx.collection.SimpleArrayMap<>();
    private android.os.Messenger zzf = new android.os.Messenger(new com.google.firebase.iid.zzax(this, android.os.Looper.getMainLooper()));

    public zzau(android.content.Context context, com.google.firebase.iid.zzao zzaoVar) {
        this.zzd = context;
        this.zze = zzaoVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(android.os.Message message) {
        if (message != null && (message.obj instanceof android.content.Intent)) {
            android.content.Intent intent = (android.content.Intent) message.obj;
            intent.setExtrasClassLoader(new com.google.firebase.iid.zzj.zza());
            if (intent.hasExtra("google.messenger")) {
                android.os.Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                if (parcelableExtra instanceof com.google.firebase.iid.zzj) {
                    this.zzh = (com.google.firebase.iid.zzj) parcelableExtra;
                }
                if (parcelableExtra instanceof android.os.Messenger) {
                    this.zzg = (android.os.Messenger) parcelableExtra;
                }
            }
            android.content.Intent intent2 = (android.content.Intent) message.obj;
            java.lang.String action = intent2.getAction();
            if (!"com.google.android.c2dm.intent.REGISTRATION".equals(action)) {
                if (android.util.Log.isLoggable("FirebaseInstanceId", 3)) {
                    java.lang.String strValueOf = java.lang.String.valueOf(action);
                    android.util.Log.d("FirebaseInstanceId", strValueOf.length() != 0 ? "Unexpected response action: ".concat(strValueOf) : new java.lang.String("Unexpected response action: "));
                    return;
                }
                return;
            }
            java.lang.String stringExtra = intent2.getStringExtra("registration_id");
            if (stringExtra == null) {
                stringExtra = intent2.getStringExtra("unregistered");
            }
            if (stringExtra == null) {
                java.lang.String stringExtra2 = intent2.getStringExtra("error");
                if (stringExtra2 == null) {
                    java.lang.String strValueOf2 = java.lang.String.valueOf(intent2.getExtras());
                    java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(strValueOf2).length() + 49);
                    sb.append("Unexpected response, no error or registration id ");
                    sb.append(strValueOf2);
                    android.util.Log.w("FirebaseInstanceId", sb.toString());
                    return;
                }
                if (android.util.Log.isLoggable("FirebaseInstanceId", 3)) {
                    java.lang.String strValueOf3 = java.lang.String.valueOf(stringExtra2);
                    android.util.Log.d("FirebaseInstanceId", strValueOf3.length() != 0 ? "Received InstanceID error ".concat(strValueOf3) : new java.lang.String("Received InstanceID error "));
                }
                if (stringExtra2.startsWith("|")) {
                    java.lang.String[] strArrSplit = stringExtra2.split("\\|");
                    if (strArrSplit.length <= 2 || !"ID".equals(strArrSplit[1])) {
                        java.lang.String strValueOf4 = java.lang.String.valueOf(stringExtra2);
                        android.util.Log.w("FirebaseInstanceId", strValueOf4.length() != 0 ? "Unexpected structured response ".concat(strValueOf4) : new java.lang.String("Unexpected structured response "));
                        return;
                    }
                    java.lang.String str = strArrSplit[2];
                    java.lang.String strSubstring = strArrSplit[3];
                    if (strSubstring.startsWith(":")) {
                        strSubstring = strSubstring.substring(1);
                    }
                    zza(str, intent2.putExtra("error", strSubstring).getExtras());
                    return;
                }
                synchronized (this.zzc) {
                    for (int i = 0; i < this.zzc.size(); i++) {
                        zza(this.zzc.keyAt(i), intent2.getExtras());
                    }
                }
                return;
            }
            java.util.regex.Matcher matcher = java.util.regex.Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)").matcher(stringExtra);
            if (!matcher.matches()) {
                if (android.util.Log.isLoggable("FirebaseInstanceId", 3)) {
                    java.lang.String strValueOf5 = java.lang.String.valueOf(stringExtra);
                    android.util.Log.d("FirebaseInstanceId", strValueOf5.length() != 0 ? "Unexpected response string: ".concat(strValueOf5) : new java.lang.String("Unexpected response string: "));
                    return;
                }
                return;
            }
            java.lang.String strGroup = matcher.group(1);
            java.lang.String strGroup2 = matcher.group(2);
            android.os.Bundle extras = intent2.getExtras();
            extras.putString("registration_id", strGroup2);
            zza(strGroup, extras);
            return;
        }
        android.util.Log.w("FirebaseInstanceId", "Dropping invalid message");
    }

    private static synchronized void zza(android.content.Context context, android.content.Intent intent) {
        if (zzb == null) {
            android.content.Intent intent2 = new android.content.Intent();
            intent2.setPackage("com.google.example.invalidpackage");
            zzb = android.app.PendingIntent.getBroadcast(context, 0, intent2, 0);
        }
        intent.putExtra(io.fabric.sdk.android.services.settings.SettingsJsonConstants.APP_KEY, zzb);
    }

    private final void zza(java.lang.String str, android.os.Bundle bundle) {
        synchronized (this.zzc) {
            com.google.android.gms.tasks.TaskCompletionSource<android.os.Bundle> taskCompletionSourceRemove = this.zzc.remove(str);
            if (taskCompletionSourceRemove == null) {
                java.lang.String strValueOf = java.lang.String.valueOf(str);
                android.util.Log.w("FirebaseInstanceId", strValueOf.length() != 0 ? "Missing callback for ".concat(strValueOf) : new java.lang.String("Missing callback for "));
            } else {
                taskCompletionSourceRemove.setResult(bundle);
            }
        }
    }

    final android.os.Bundle zza(android.os.Bundle bundle) throws java.io.IOException {
        if (this.zze.zze() >= 12000000) {
            try {
                return (android.os.Bundle) com.google.android.gms.tasks.Tasks.await(com.google.firebase.iid.zzab.zza(this.zzd).zzb(1, bundle));
            } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException e) {
                if (android.util.Log.isLoggable("FirebaseInstanceId", 3)) {
                    java.lang.String strValueOf = java.lang.String.valueOf(e);
                    java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(strValueOf).length() + 22);
                    sb.append("Error making request: ");
                    sb.append(strValueOf);
                    android.util.Log.d("FirebaseInstanceId", sb.toString());
                }
                if ((e.getCause() instanceof com.google.firebase.iid.zzam) && ((com.google.firebase.iid.zzam) e.getCause()).zza() == 4) {
                    return zzb(bundle);
                }
                return null;
            }
        }
        return zzb(bundle);
    }

    private final android.os.Bundle zzb(android.os.Bundle bundle) throws java.io.IOException {
        android.os.Bundle bundleZzc = zzc(bundle);
        if (bundleZzc == null || !bundleZzc.containsKey("google.messenger")) {
            return bundleZzc;
        }
        android.os.Bundle bundleZzc2 = zzc(bundle);
        if (bundleZzc2 == null || !bundleZzc2.containsKey("google.messenger")) {
            return bundleZzc2;
        }
        return null;
    }

    private static synchronized java.lang.String zza() {
        int i;
        i = zza;
        zza = i + 1;
        return java.lang.Integer.toString(i);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:31:0x00d7  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.google.android.gms.tasks.TaskCompletionSource, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v14, types: [java.util.concurrent.TimeUnit] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00d1 -> B:65:0x00dc). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00d7 -> B:65:0x00dc). Please report as a decompilation issue!!! */
    private final android.os.Bundle zzc(android.os.Bundle bundle) throws java.io.IOException {
        com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource;
        ?? r1;
        java.lang.String strZza = zza();
        ?? taskCompletionSource2 = new com.google.android.gms.tasks.TaskCompletionSource();
        synchronized (this.zzc) {
            this.zzc.put(strZza, taskCompletionSource2);
        }
        if (this.zze.zzb() == 0) {
            throw new java.io.IOException("MISSING_INSTANCEID_SERVICE");
        }
        android.content.Intent intent = new android.content.Intent();
        intent.setPackage("com.google.android.gms");
        if (this.zze.zzb() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        zza(this.zzd, intent);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(strZza).length() + 5);
        sb.append("|ID|");
        sb.append(strZza);
        sb.append("|");
        intent.putExtra("kid", sb.toString());
        int i = 3;
        if (android.util.Log.isLoggable("FirebaseInstanceId", 3)) {
            java.lang.String strValueOf = java.lang.String.valueOf(intent.getExtras());
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder(java.lang.String.valueOf(strValueOf).length() + 8);
            sb2.append("Sending ");
            sb2.append(strValueOf);
            android.util.Log.d("FirebaseInstanceId", sb2.toString());
        }
        intent.putExtra("google.messenger", this.zzf);
        if (this.zzg != null || this.zzh != null) {
            r1 = taskCompletionSource2;
            android.os.Message messageObtain = android.os.Message.obtain();
            messageObtain.obj = intent;
            try {
                android.os.Messenger messenger = this.zzg;
                if (messenger != null) {
                    messenger.send(messageObtain);
                    taskCompletionSource = taskCompletionSource2;
                } else {
                    this.zzh.zza(messageObtain);
                    taskCompletionSource = taskCompletionSource2;
                }
            } catch (android.os.RemoteException unused) {
                r1 = taskCompletionSource2;
                if (android.util.Log.isLoggable("FirebaseInstanceId", i)) {
                    android.util.Log.d("FirebaseInstanceId", "Messenger failed, fallback to startService");
                    r1 = taskCompletionSource2;
                }
                r1 = taskCompletionSource2;
                if (this.zze.zzb() == 2) {
                    this.zzd.sendBroadcast(intent);
                    taskCompletionSource = r1;
                } else {
                    this.zzd.startService(intent);
                    taskCompletionSource = r1;
                }
            }
        } else {
            r1 = taskCompletionSource2;
            if (this.zze.zzb() == 2) {
                this.zzd.sendBroadcast(intent);
                taskCompletionSource = r1;
            } else {
                this.zzd.startService(intent);
                taskCompletionSource = r1;
            }
        }
        try {
            try {
                com.google.android.gms.tasks.Task task = taskCompletionSource.getTask();
                taskCompletionSource2 = 30000;
                i = java.util.concurrent.TimeUnit.MILLISECONDS;
                android.os.Bundle bundle2 = (android.os.Bundle) com.google.android.gms.tasks.Tasks.await(task, 30000L, i);
                synchronized (this.zzc) {
                    this.zzc.remove(strZza);
                }
                return bundle2;
            } catch (java.lang.Throwable th) {
                synchronized (this.zzc) {
                    this.zzc.remove(strZza);
                    throw th;
                }
            }
        } catch (java.lang.InterruptedException | java.util.concurrent.TimeoutException unused2) {
            android.util.Log.w("FirebaseInstanceId", "No response");
            throw new java.io.IOException("TIMEOUT");
        } catch (java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }
}
