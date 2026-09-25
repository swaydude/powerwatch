package com.google.firebase.iid;

/* JADX INFO: compiled from: com.google.firebase:firebase-iid@@20.2.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzac implements android.content.ServiceConnection {
    int zza;
    final android.os.Messenger zzb;
    com.google.firebase.iid.zzal zzc;
    final java.util.Queue<com.google.firebase.iid.zzan<?>> zzd;
    final android.util.SparseArray<com.google.firebase.iid.zzan<?>> zze;
    final /* synthetic */ com.google.firebase.iid.zzab zzf;

    private zzac(com.google.firebase.iid.zzab zzabVar) {
        this.zzf = zzabVar;
        this.zza = 0;
        this.zzb = new android.os.Messenger(new com.google.android.gms.internal.firebase_messaging.zze(android.os.Looper.getMainLooper(), new android.os.Handler.Callback(this) { // from class: com.google.firebase.iid.zzaf
            private final com.google.firebase.iid.zzac zza;

            {
                this.zza = this;
            }

            @Override // android.os.Handler.Callback
            public final boolean handleMessage(android.os.Message message) {
                return this.zza.zza(message);
            }
        }));
        this.zzd = new java.util.ArrayDeque();
        this.zze = new android.util.SparseArray<>();
    }

    final synchronized boolean zza(com.google.firebase.iid.zzan<?> zzanVar) {
        int i = this.zza;
        if (i == 0) {
            this.zzd.add(zzanVar);
            com.google.android.gms.common.internal.Preconditions.checkState(this.zza == 0);
            if (android.util.Log.isLoggable("MessengerIpcClient", 2)) {
                android.util.Log.v("MessengerIpcClient", "Starting bind to GmsCore");
            }
            this.zza = 1;
            android.content.Intent intent = new android.content.Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            if (!com.google.android.gms.common.stats.ConnectionTracker.getInstance().bindService(this.zzf.zzb, intent, this, 1)) {
                zza(0, "Unable to bind to service");
            } else {
                this.zzf.zzc.schedule(new java.lang.Runnable(this) { // from class: com.google.firebase.iid.zzae
                    private final com.google.firebase.iid.zzac zza;

                    {
                        this.zza = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.zzc();
                    }
                }, 30L, java.util.concurrent.TimeUnit.SECONDS);
            }
            return true;
        }
        if (i == 1) {
            this.zzd.add(zzanVar);
            return true;
        }
        if (i == 2) {
            this.zzd.add(zzanVar);
            zza();
            return true;
        }
        if (i != 3 && i != 4) {
            int i2 = this.zza;
            java.lang.StringBuilder sb = new java.lang.StringBuilder(26);
            sb.append("Unknown state: ");
            sb.append(i2);
            throw new java.lang.IllegalStateException(sb.toString());
        }
        return false;
    }

    final boolean zza(android.os.Message message) {
        int i = message.arg1;
        if (android.util.Log.isLoggable("MessengerIpcClient", 3)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(41);
            sb.append("Received response to request: ");
            sb.append(i);
            android.util.Log.d("MessengerIpcClient", sb.toString());
        }
        synchronized (this) {
            com.google.firebase.iid.zzan<?> zzanVar = this.zze.get(i);
            if (zzanVar == null) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder(50);
                sb2.append("Received response for unknown request: ");
                sb2.append(i);
                android.util.Log.w("MessengerIpcClient", sb2.toString());
                return true;
            }
            this.zze.remove(i);
            zzb();
            android.os.Bundle data = message.getData();
            if (data.getBoolean("unsupported", false)) {
                zzanVar.zza(new com.google.firebase.iid.zzam(4, "Not supported by GmsCore"));
            } else {
                zzanVar.zza(data);
            }
            return true;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(android.content.ComponentName componentName, final android.os.IBinder iBinder) {
        if (android.util.Log.isLoggable("MessengerIpcClient", 2)) {
            android.util.Log.v("MessengerIpcClient", "Service connected");
        }
        this.zzf.zzc.execute(new java.lang.Runnable(this, iBinder) { // from class: com.google.firebase.iid.zzah
            private final com.google.firebase.iid.zzac zza;
            private final android.os.IBinder zzb;

            {
                this.zza = this;
                this.zzb = iBinder;
            }

            @Override // java.lang.Runnable
            public final void run() {
                com.google.firebase.iid.zzac zzacVar = this.zza;
                android.os.IBinder iBinder2 = this.zzb;
                synchronized (zzacVar) {
                    try {
                        if (iBinder2 == null) {
                            zzacVar.zza(0, "Null service connection");
                            return;
                        }
                        try {
                            zzacVar.zzc = new com.google.firebase.iid.zzal(iBinder2);
                            zzacVar.zza = 2;
                            zzacVar.zza();
                        } catch (android.os.RemoteException e) {
                            zzacVar.zza(0, e.getMessage());
                        }
                    } catch (java.lang.Throwable th) {
                        throw th;
                    }
                }
            }
        });
    }

    final void zza() {
        this.zzf.zzc.execute(new java.lang.Runnable(this) { // from class: com.google.firebase.iid.zzag
            private final com.google.firebase.iid.zzac zza;

            {
                this.zza = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                final com.google.firebase.iid.zzan<?> zzanVarPoll;
                final com.google.firebase.iid.zzac zzacVar = this.zza;
                while (true) {
                    synchronized (zzacVar) {
                        if (zzacVar.zza != 2) {
                            return;
                        }
                        if (zzacVar.zzd.isEmpty()) {
                            zzacVar.zzb();
                            return;
                        } else {
                            zzanVarPoll = zzacVar.zzd.poll();
                            zzacVar.zze.put(zzanVarPoll.zza, zzanVarPoll);
                            zzacVar.zzf.zzc.schedule(new java.lang.Runnable(zzacVar, zzanVarPoll) { // from class: com.google.firebase.iid.zzai
                                private final com.google.firebase.iid.zzac zza;
                                private final com.google.firebase.iid.zzan zzb;

                                {
                                    this.zza = zzacVar;
                                    this.zzb = zzanVarPoll;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    this.zza.zza(this.zzb.zza);
                                }
                            }, 30L, java.util.concurrent.TimeUnit.SECONDS);
                        }
                    }
                    if (android.util.Log.isLoggable("MessengerIpcClient", 3)) {
                        java.lang.String strValueOf = java.lang.String.valueOf(zzanVarPoll);
                        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(strValueOf).length() + 8);
                        sb.append("Sending ");
                        sb.append(strValueOf);
                        android.util.Log.d("MessengerIpcClient", sb.toString());
                    }
                    android.content.Context context = zzacVar.zzf.zzb;
                    android.os.Messenger messenger = zzacVar.zzb;
                    android.os.Message messageObtain = android.os.Message.obtain();
                    messageObtain.what = zzanVarPoll.zzc;
                    messageObtain.arg1 = zzanVarPoll.zza;
                    messageObtain.replyTo = messenger;
                    android.os.Bundle bundle = new android.os.Bundle();
                    bundle.putBoolean("oneWay", zzanVarPoll.zza());
                    bundle.putString("pkg", context.getPackageName());
                    bundle.putBundle("data", zzanVarPoll.zzd);
                    messageObtain.setData(bundle);
                    try {
                        zzacVar.zzc.zza(messageObtain);
                    } catch (android.os.RemoteException e) {
                        zzacVar.zza(2, e.getMessage());
                    }
                }
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(android.content.ComponentName componentName) {
        if (android.util.Log.isLoggable("MessengerIpcClient", 2)) {
            android.util.Log.v("MessengerIpcClient", "Service disconnected");
        }
        this.zzf.zzc.execute(new java.lang.Runnable(this) { // from class: com.google.firebase.iid.zzaj
            private final com.google.firebase.iid.zzac zza;

            {
                this.zza = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zza(2, "Service disconnected");
            }
        });
    }

    final synchronized void zza(int i, java.lang.String str) {
        if (android.util.Log.isLoggable("MessengerIpcClient", 3)) {
            java.lang.String strValueOf = java.lang.String.valueOf(str);
            android.util.Log.d("MessengerIpcClient", strValueOf.length() != 0 ? "Disconnected: ".concat(strValueOf) : new java.lang.String("Disconnected: "));
        }
        int i2 = this.zza;
        if (i2 == 0) {
            throw new java.lang.IllegalStateException();
        }
        if (i2 != 1 && i2 != 2) {
            if (i2 == 3) {
                this.zza = 4;
                return;
            } else {
                if (i2 == 4) {
                    return;
                }
                int i3 = this.zza;
                java.lang.StringBuilder sb = new java.lang.StringBuilder(26);
                sb.append("Unknown state: ");
                sb.append(i3);
                throw new java.lang.IllegalStateException(sb.toString());
            }
        }
        if (android.util.Log.isLoggable("MessengerIpcClient", 2)) {
            android.util.Log.v("MessengerIpcClient", "Unbinding service");
        }
        this.zza = 4;
        com.google.android.gms.common.stats.ConnectionTracker.getInstance().unbindService(this.zzf.zzb, this);
        com.google.firebase.iid.zzam zzamVar = new com.google.firebase.iid.zzam(i, str);
        java.util.Iterator<com.google.firebase.iid.zzan<?>> it = this.zzd.iterator();
        while (it.hasNext()) {
            it.next().zza(zzamVar);
        }
        this.zzd.clear();
        for (int i4 = 0; i4 < this.zze.size(); i4++) {
            this.zze.valueAt(i4).zza(zzamVar);
        }
        this.zze.clear();
    }

    final synchronized void zzb() {
        if (this.zza == 2 && this.zzd.isEmpty() && this.zze.size() == 0) {
            if (android.util.Log.isLoggable("MessengerIpcClient", 2)) {
                android.util.Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
            }
            this.zza = 3;
            com.google.android.gms.common.stats.ConnectionTracker.getInstance().unbindService(this.zzf.zzb, this);
        }
    }

    final synchronized void zzc() {
        if (this.zza == 1) {
            zza(1, "Timed out while binding");
        }
    }

    final synchronized void zza(int i) {
        com.google.firebase.iid.zzan<?> zzanVar = this.zze.get(i);
        if (zzanVar != null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(31);
            sb.append("Timing out request: ");
            sb.append(i);
            android.util.Log.w("MessengerIpcClient", sb.toString());
            this.zze.remove(i);
            zzanVar.zza(new com.google.firebase.iid.zzam(3, "Timed out waiting for response"));
            zzb();
        }
    }
}
