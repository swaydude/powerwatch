package okio;

/* JADX INFO: loaded from: classes2.dex */
final class SegmentPool {
    static final long MAX_SIZE = 65536;
    static long byteCount;

    @javax.annotation.Nullable
    static okio.Segment next;

    private SegmentPool() {
    }

    static okio.Segment take() {
        synchronized (okio.SegmentPool.class) {
            okio.Segment segment = next;
            if (segment != null) {
                next = segment.next;
                segment.next = null;
                byteCount -= android.support.v4.media.session.PlaybackStateCompat.ACTION_PLAY_FROM_URI;
                return segment;
            }
            return new okio.Segment();
        }
    }

    static void recycle(okio.Segment segment) {
        if (segment.next != null || segment.prev != null) {
            throw new java.lang.IllegalArgumentException();
        }
        if (segment.shared) {
            return;
        }
        synchronized (okio.SegmentPool.class) {
            long j = byteCount;
            if (j + android.support.v4.media.session.PlaybackStateCompat.ACTION_PLAY_FROM_URI > 65536) {
                return;
            }
            byteCount = j + android.support.v4.media.session.PlaybackStateCompat.ACTION_PLAY_FROM_URI;
            segment.next = next;
            segment.limit = 0;
            segment.pos = 0;
            next = segment;
        }
    }
}
