package com.google.android.gms.common.data;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public class SingleRefDataBufferIterator<T> extends com.google.android.gms.common.data.DataBufferIterator<T> {
    private T zams;

    public SingleRefDataBufferIterator(com.google.android.gms.common.data.DataBuffer<T> dataBuffer) {
        super(dataBuffer);
    }

    @Override // com.google.android.gms.common.data.DataBufferIterator, java.util.Iterator
    public T next() {
        if (!hasNext()) {
            int i = this.zalo;
            java.lang.StringBuilder sb = new java.lang.StringBuilder(46);
            sb.append("Cannot advance the iterator beyond ");
            sb.append(i);
            throw new java.util.NoSuchElementException(sb.toString());
        }
        this.zalo++;
        if (this.zalo == 0) {
            T t = this.zaln.get(0);
            this.zams = t;
            if (!(t instanceof com.google.android.gms.common.data.DataBufferRef)) {
                java.lang.String strValueOf = java.lang.String.valueOf(this.zams.getClass());
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder(java.lang.String.valueOf(strValueOf).length() + 44);
                sb2.append("DataBuffer reference of type ");
                sb2.append(strValueOf);
                sb2.append(" is not movable");
                throw new java.lang.IllegalStateException(sb2.toString());
            }
        } else {
            ((com.google.android.gms.common.data.DataBufferRef) this.zams).zag(this.zalo);
        }
        return this.zams;
    }
}
