package com.google.android.gms.common.data;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class DataBufferObserverSet implements com.google.android.gms.common.data.DataBufferObserver, com.google.android.gms.common.data.DataBufferObserver.Observable {
    private java.util.HashSet<com.google.android.gms.common.data.DataBufferObserver> zalq = new java.util.HashSet<>();

    public final boolean hasObservers() {
        return !this.zalq.isEmpty();
    }

    public final void clear() {
        this.zalq.clear();
    }

    @Override // com.google.android.gms.common.data.DataBufferObserver.Observable
    public final void addObserver(com.google.android.gms.common.data.DataBufferObserver dataBufferObserver) {
        this.zalq.add(dataBufferObserver);
    }

    @Override // com.google.android.gms.common.data.DataBufferObserver.Observable
    public final void removeObserver(com.google.android.gms.common.data.DataBufferObserver dataBufferObserver) {
        this.zalq.remove(dataBufferObserver);
    }

    @Override // com.google.android.gms.common.data.DataBufferObserver
    public final void onDataChanged() {
        java.util.Iterator<com.google.android.gms.common.data.DataBufferObserver> it = this.zalq.iterator();
        while (it.hasNext()) {
            it.next().onDataChanged();
        }
    }

    @Override // com.google.android.gms.common.data.DataBufferObserver
    public final void onDataRangeChanged(int i, int i2) {
        java.util.Iterator<com.google.android.gms.common.data.DataBufferObserver> it = this.zalq.iterator();
        while (it.hasNext()) {
            it.next().onDataRangeChanged(i, i2);
        }
    }

    @Override // com.google.android.gms.common.data.DataBufferObserver
    public final void onDataRangeInserted(int i, int i2) {
        java.util.Iterator<com.google.android.gms.common.data.DataBufferObserver> it = this.zalq.iterator();
        while (it.hasNext()) {
            it.next().onDataRangeInserted(i, i2);
        }
    }

    @Override // com.google.android.gms.common.data.DataBufferObserver
    public final void onDataRangeRemoved(int i, int i2) {
        java.util.Iterator<com.google.android.gms.common.data.DataBufferObserver> it = this.zalq.iterator();
        while (it.hasNext()) {
            it.next().onDataRangeRemoved(i, i2);
        }
    }

    @Override // com.google.android.gms.common.data.DataBufferObserver
    public final void onDataRangeMoved(int i, int i2, int i3) {
        java.util.Iterator<com.google.android.gms.common.data.DataBufferObserver> it = this.zalq.iterator();
        while (it.hasNext()) {
            it.next().onDataRangeMoved(i, i2, i3);
        }
    }
}
