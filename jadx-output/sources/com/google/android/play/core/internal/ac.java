package com.google.android.play.core.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class ac implements com.google.android.play.core.splitinstall.a {
    private final android.content.Context a;
    private final com.google.android.play.core.splitcompat.c b;
    private final com.google.android.play.core.internal.ba c;
    private final java.util.concurrent.Executor d;
    private final com.google.android.play.core.splitinstall.j e;

    public ac(android.content.Context context, java.util.concurrent.Executor executor, com.google.android.play.core.internal.ba baVar, com.google.android.play.core.splitcompat.c cVar, com.google.android.play.core.splitinstall.j jVar) {
        this.a = context;
        this.b = cVar;
        this.c = baVar;
        this.d = executor;
        this.e = jVar;
    }

    private final java.lang.Integer a(java.util.List<android.content.Intent> list) {
        java.nio.channels.FileLock fileLockTryLock;
        try {
            java.nio.channels.FileChannel channel = new java.io.RandomAccessFile(this.b.b(), "rw").getChannel();
            java.lang.Integer numValueOf = null;
            try {
                try {
                    fileLockTryLock = channel.tryLock();
                } catch (java.nio.channels.OverlappingFileLockException unused) {
                    fileLockTryLock = null;
                }
                if (fileLockTryLock != null) {
                    numValueOf = java.lang.Integer.valueOf(b(list));
                    fileLockTryLock.release();
                }
                if (channel != null) {
                    channel.close();
                }
                return numValueOf;
            } catch (java.lang.Throwable th) {
                if (channel != null) {
                    try {
                        channel.close();
                    } catch (java.lang.Throwable th2) {
                        com.google.android.play.core.internal.bj.a(th, th2);
                    }
                }
                throw th;
            }
        } catch (java.lang.Exception e) {
            android.util.Log.e("SplitCompat", "Error locking files.", e);
            return -13;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(com.google.android.play.core.splitinstall.d dVar) {
        try {
            if (this.e.a(com.google.android.play.core.internal.ag.a(this.a))) {
                android.util.Log.i("SplitCompat", "Splits installed.");
                dVar.a();
            } else {
                android.util.Log.e("SplitCompat", "Emulating splits failed.");
                dVar.a(-12);
            }
        } catch (java.lang.Exception e) {
            android.util.Log.e("SplitCompat", "Error emulating splits.", e);
            dVar.a(-12);
        }
    }

    private final int b(java.util.List<android.content.Intent> list) {
        try {
            android.util.Log.i("SplitCompat", "Copying splits.");
            for (android.content.Intent intent : list) {
                java.lang.String stringExtra = intent.getStringExtra("split_id");
                android.content.res.AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = this.a.getContentResolver().openAssetFileDescriptor(intent.getData(), "r");
                java.io.File fileA = this.b.a(stringExtra);
                if ((fileA.exists() && fileA.length() != assetFileDescriptorOpenAssetFileDescriptor.getLength()) || !fileA.exists()) {
                    if (this.b.b(stringExtra).exists()) {
                        continue;
                    } else {
                        java.io.BufferedInputStream bufferedInputStream = new java.io.BufferedInputStream(assetFileDescriptorOpenAssetFileDescriptor.createInputStream());
                        try {
                            java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(fileA);
                            try {
                                byte[] bArr = new byte[4096];
                                while (true) {
                                    int i = bufferedInputStream.read(bArr);
                                    if (i <= 0) {
                                        break;
                                    }
                                    fileOutputStream.write(bArr, 0, i);
                                    try {
                                        bufferedInputStream.close();
                                    } catch (java.lang.Throwable th) {
                                        com.google.android.play.core.internal.bj.a(th, th);
                                    }
                                    throw th;
                                }
                                fileOutputStream.close();
                                bufferedInputStream.close();
                            } catch (java.lang.Throwable th2) {
                                try {
                                    fileOutputStream.close();
                                } catch (java.lang.Throwable th3) {
                                    com.google.android.play.core.internal.bj.a(th2, th3);
                                }
                                throw th2;
                            }
                        } catch (java.lang.Throwable th4) {
                            bufferedInputStream.close();
                            throw th4;
                        }
                    }
                }
            }
            android.util.Log.i("SplitCompat", "Splits copied.");
            try {
                if (this.c.a()) {
                    android.util.Log.i("SplitCompat", "Splits verified.");
                    return 0;
                }
                android.util.Log.e("SplitCompat", "Split verification failed.");
                return -11;
            } catch (java.lang.Exception e) {
                android.util.Log.e("SplitCompat", "Error verifying splits.", e);
                return -11;
            }
        } catch (java.lang.Exception e2) {
            android.util.Log.e("SplitCompat", "Error copying splits.", e2);
            return -13;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(java.util.List<android.content.Intent> list, com.google.android.play.core.splitinstall.d dVar) {
        java.lang.Integer numA = a(list);
        if (numA == null) {
            return;
        }
        if (numA.intValue() == 0) {
            dVar.b();
        } else {
            dVar.a(numA.intValue());
        }
    }

    @Override // com.google.android.play.core.splitinstall.a
    public final void a(java.util.List<android.content.Intent> list, com.google.android.play.core.splitinstall.d dVar) {
        b(list, dVar);
    }

    public final void b(java.util.List<android.content.Intent> list, com.google.android.play.core.splitinstall.d dVar) {
        if (!this.e.a()) {
            throw new java.lang.IllegalStateException("Ingestion should only be called in SplitCompat mode.");
        }
        this.d.execute(new com.google.android.play.core.internal.ae(this, list, dVar));
    }
}
