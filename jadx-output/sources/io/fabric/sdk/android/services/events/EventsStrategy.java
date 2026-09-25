package io.fabric.sdk.android.services.events;

/* JADX INFO: loaded from: classes2.dex */
public interface EventsStrategy<T> extends io.fabric.sdk.android.services.events.FileRollOverManager, io.fabric.sdk.android.services.events.EventsManager<T> {
    io.fabric.sdk.android.services.events.FilesSender getFilesSender();
}
