package powerwatch.matrix.com.pwgen2android.shared.cloud;

/* JADX INFO: compiled from: Cloud.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0018\b\u0002\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u0019\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u0005HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0007HÆ\u0003J/\u0010\u000f\u001a\u00020\u00002\u0018\b\u0002\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0004HÖ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR!\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/cloud/AuthHeaderData;", "", "headers", "", "", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/Headers;", "error", "", "(Ljava/util/Map;Ljava/lang/Throwable;)V", "getError", "()Ljava/lang/Throwable;", "getHeaders", "()Ljava/util/Map;", "component1", "component2", "copy", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class AuthHeaderData {
    private final java.lang.Throwable error;
    private final java.util.Map<java.lang.String, java.lang.String> headers;

    /* JADX WARN: Multi-variable type inference failed */
    public AuthHeaderData() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ powerwatch.matrix.com.pwgen2android.shared.cloud.AuthHeaderData copy$default(powerwatch.matrix.com.pwgen2android.shared.cloud.AuthHeaderData authHeaderData, java.util.Map map, java.lang.Throwable th, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            map = authHeaderData.headers;
        }
        if ((i & 2) != 0) {
            th = authHeaderData.error;
        }
        return authHeaderData.copy(map, th);
    }

    public final java.util.Map<java.lang.String, java.lang.String> component1() {
        return this.headers;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final java.lang.Throwable getError() {
        return this.error;
    }

    public final powerwatch.matrix.com.pwgen2android.shared.cloud.AuthHeaderData copy(java.util.Map<java.lang.String, java.lang.String> headers, java.lang.Throwable error) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headers, "headers");
        return new powerwatch.matrix.com.pwgen2android.shared.cloud.AuthHeaderData(headers, error);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof powerwatch.matrix.com.pwgen2android.shared.cloud.AuthHeaderData)) {
            return false;
        }
        powerwatch.matrix.com.pwgen2android.shared.cloud.AuthHeaderData authHeaderData = (powerwatch.matrix.com.pwgen2android.shared.cloud.AuthHeaderData) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.headers, authHeaderData.headers) && kotlin.jvm.internal.Intrinsics.areEqual(this.error, authHeaderData.error);
    }

    public int hashCode() {
        int iHashCode = this.headers.hashCode() * 31;
        java.lang.Throwable th = this.error;
        return iHashCode + (th == null ? 0 : th.hashCode());
    }

    public java.lang.String toString() {
        return "AuthHeaderData(headers=" + this.headers + ", error=" + this.error + ')';
    }

    public AuthHeaderData(java.util.Map<java.lang.String, java.lang.String> headers, java.lang.Throwable th) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headers, "headers");
        this.headers = headers;
        this.error = th;
    }

    public /* synthetic */ AuthHeaderData(java.util.Map map, java.lang.Throwable th, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? kotlin.collections.MapsKt.emptyMap() : map, (i & 2) != 0 ? null : th);
    }

    public final java.lang.Throwable getError() {
        return this.error;
    }

    public final java.util.Map<java.lang.String, java.lang.String> getHeaders() {
        return this.headers;
    }
}
