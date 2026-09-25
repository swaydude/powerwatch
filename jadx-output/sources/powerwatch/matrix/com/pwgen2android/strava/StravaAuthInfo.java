package powerwatch.matrix.com.pwgen2android.strava;

/* JADX INFO: compiled from: StravaController.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/strava/StravaAuthInfo;", "", "code", "", "scope", "(Ljava/lang/String;Ljava/lang/String;)V", "getCode", "()Ljava/lang/String;", "getScope", "component1", "component2", "copy", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class StravaAuthInfo {
    private final java.lang.String code;
    private final java.lang.String scope;

    public static /* synthetic */ powerwatch.matrix.com.pwgen2android.strava.StravaAuthInfo copy$default(powerwatch.matrix.com.pwgen2android.strava.StravaAuthInfo stravaAuthInfo, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = stravaAuthInfo.code;
        }
        if ((i & 2) != 0) {
            str2 = stravaAuthInfo.scope;
        }
        return stravaAuthInfo.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final java.lang.String getCode() {
        return this.code;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final java.lang.String getScope() {
        return this.scope;
    }

    public final powerwatch.matrix.com.pwgen2android.strava.StravaAuthInfo copy(java.lang.String code, java.lang.String scope) {
        return new powerwatch.matrix.com.pwgen2android.strava.StravaAuthInfo(code, scope);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof powerwatch.matrix.com.pwgen2android.strava.StravaAuthInfo)) {
            return false;
        }
        powerwatch.matrix.com.pwgen2android.strava.StravaAuthInfo stravaAuthInfo = (powerwatch.matrix.com.pwgen2android.strava.StravaAuthInfo) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.code, stravaAuthInfo.code) && kotlin.jvm.internal.Intrinsics.areEqual(this.scope, stravaAuthInfo.scope);
    }

    public int hashCode() {
        java.lang.String str = this.code;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.String str2 = this.scope;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "StravaAuthInfo(code=" + ((java.lang.Object) this.code) + ", scope=" + ((java.lang.Object) this.scope) + ')';
    }

    public StravaAuthInfo(java.lang.String str, java.lang.String str2) {
        this.code = str;
        this.scope = str2;
    }

    public final java.lang.String getCode() {
        return this.code;
    }

    public final java.lang.String getScope() {
        return this.scope;
    }
}
