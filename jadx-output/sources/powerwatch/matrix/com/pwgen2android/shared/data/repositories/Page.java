package powerwatch.matrix.com.pwgen2android.shared.data.repositories;

/* JADX INFO: compiled from: Repository.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\u0015\u0010\u001a\u001a\u00020\f2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u001cJ\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u001f"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;", "", "limit", "", "offset", "", "pageExpireTime", "correctedOffset", "(IJJI)V", "getCorrectedOffset", "()I", "isToday", "", "()Z", "getLimit", "getOffset", "()J", "getPageExpireTime", "component1", "component2", "component3", "component4", "copy", "equals", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "isPageExpired", "cacheStoredTimestamp", "(Ljava/lang/Long;)Z", "toString", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class Page {
    private final int correctedOffset;
    private final int limit;
    private final long offset;
    private final long pageExpireTime;

    public Page() {
        this(0, 0L, 0L, 0, 15, null);
    }

    public static /* synthetic */ powerwatch.matrix.com.pwgen2android.shared.data.repositories.Page copy$default(powerwatch.matrix.com.pwgen2android.shared.data.repositories.Page page, int i, long j, long j2, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = page.limit;
        }
        if ((i3 & 2) != 0) {
            j = page.offset;
        }
        long j3 = j;
        if ((i3 & 4) != 0) {
            j2 = page.pageExpireTime;
        }
        long j4 = j2;
        if ((i3 & 8) != 0) {
            i2 = page.correctedOffset;
        }
        return page.copy(i, j3, j4, i2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getLimit() {
        return this.limit;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getOffset() {
        return this.offset;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getPageExpireTime() {
        return this.pageExpireTime;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getCorrectedOffset() {
        return this.correctedOffset;
    }

    public final powerwatch.matrix.com.pwgen2android.shared.data.repositories.Page copy(int limit, long offset, long pageExpireTime, int correctedOffset) {
        return new powerwatch.matrix.com.pwgen2android.shared.data.repositories.Page(limit, offset, pageExpireTime, correctedOffset);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof powerwatch.matrix.com.pwgen2android.shared.data.repositories.Page)) {
            return false;
        }
        powerwatch.matrix.com.pwgen2android.shared.data.repositories.Page page = (powerwatch.matrix.com.pwgen2android.shared.data.repositories.Page) other;
        return this.limit == page.limit && this.offset == page.offset && this.pageExpireTime == page.pageExpireTime && this.correctedOffset == page.correctedOffset;
    }

    public int hashCode() {
        return (((((this.limit * 31) + powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter$SleepSession$$ExternalSynthetic0.m0(this.offset)) * 31) + powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter$SleepSession$$ExternalSynthetic0.m0(this.pageExpireTime)) * 31) + this.correctedOffset;
    }

    public java.lang.String toString() {
        return "Page(limit=" + this.limit + ", offset=" + this.offset + ", pageExpireTime=" + this.pageExpireTime + ", correctedOffset=" + this.correctedOffset + ')';
    }

    public Page(int i, long j, long j2, int i2) {
        this.limit = i;
        this.offset = j;
        this.pageExpireTime = j2;
        this.correctedOffset = i2;
    }

    public /* synthetic */ Page(int i, long j, long j2, int i2, int i3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 10 : i, (i3 & 2) != 0 ? 0L : j, (i3 & 4) != 0 ? powerwatch.matrix.com.pwgen2android.shared.data.models.ActivityConstantsKt.defaultPageCache : j2, (i3 & 8) != 0 ? 0 : i2);
    }

    public final int getCorrectedOffset() {
        return this.correctedOffset;
    }

    public final int getLimit() {
        return this.limit;
    }

    public final long getOffset() {
        return this.offset;
    }

    public final long getPageExpireTime() {
        return this.pageExpireTime;
    }

    public final boolean isToday() {
        long j = this.offset;
        return j <= 0 && j >= -24;
    }

    public final boolean isPageExpired(java.lang.Long cacheStoredTimestamp) {
        return cacheStoredTimestamp == null || java.lang.System.currentTimeMillis() - cacheStoredTimestamp.longValue() > this.pageExpireTime;
    }
}
