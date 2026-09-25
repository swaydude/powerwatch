package io.fabric.sdk.android.services.events;

/* JADX INFO: loaded from: classes2.dex */
public class GZIPQueueFileEventStorage extends io.fabric.sdk.android.services.events.QueueFileEventStorage {
    public GZIPQueueFileEventStorage(android.content.Context context, java.io.File file, java.lang.String str, java.lang.String str2) throws java.io.IOException {
        super(context, file, str, str2);
    }

    @Override // io.fabric.sdk.android.services.events.QueueFileEventStorage
    public java.io.OutputStream getMoveOutputStream(java.io.File file) throws java.io.IOException {
        return new java.util.zip.GZIPOutputStream(new java.io.FileOutputStream(file));
    }
}
