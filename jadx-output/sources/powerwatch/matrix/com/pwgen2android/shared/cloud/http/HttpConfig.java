package powerwatch.matrix.com.pwgen2android.shared.cloud.http;

/* JADX INFO: compiled from: HttpModule.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u0019"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpConfig;", "", "baseURL", "", "connectionTimeout", "", "readTimeout", "writeTimeout", "(Ljava/lang/String;III)V", "getBaseURL", "()Ljava/lang/String;", "getConnectionTimeout", "()I", "getReadTimeout", "getWriteTimeout", "component1", "component2", "component3", "component4", "copy", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "toString", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class HttpConfig {
    private final java.lang.String baseURL;
    private final int connectionTimeout;
    private final int readTimeout;
    private final int writeTimeout;

    public static /* synthetic */ powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpConfig copy$default(powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpConfig httpConfig, java.lang.String str, int i, int i2, int i3, int i4, java.lang.Object obj) {
        if ((i4 & 1) != 0) {
            str = httpConfig.baseURL;
        }
        if ((i4 & 2) != 0) {
            i = httpConfig.connectionTimeout;
        }
        if ((i4 & 4) != 0) {
            i2 = httpConfig.readTimeout;
        }
        if ((i4 & 8) != 0) {
            i3 = httpConfig.writeTimeout;
        }
        return httpConfig.copy(str, i, i2, i3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final java.lang.String getBaseURL() {
        return this.baseURL;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getConnectionTimeout() {
        return this.connectionTimeout;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getReadTimeout() {
        return this.readTimeout;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getWriteTimeout() {
        return this.writeTimeout;
    }

    public final powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpConfig copy(java.lang.String baseURL, int connectionTimeout, int readTimeout, int writeTimeout) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseURL, "baseURL");
        return new powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpConfig(baseURL, connectionTimeout, readTimeout, writeTimeout);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpConfig)) {
            return false;
        }
        powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpConfig httpConfig = (powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpConfig) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.baseURL, httpConfig.baseURL) && this.connectionTimeout == httpConfig.connectionTimeout && this.readTimeout == httpConfig.readTimeout && this.writeTimeout == httpConfig.writeTimeout;
    }

    public int hashCode() {
        return (((((this.baseURL.hashCode() * 31) + this.connectionTimeout) * 31) + this.readTimeout) * 31) + this.writeTimeout;
    }

    public java.lang.String toString() {
        return "HttpConfig(baseURL=" + this.baseURL + ", connectionTimeout=" + this.connectionTimeout + ", readTimeout=" + this.readTimeout + ", writeTimeout=" + this.writeTimeout + ')';
    }

    public HttpConfig(java.lang.String baseURL, int i, int i2, int i3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseURL, "baseURL");
        this.baseURL = baseURL;
        this.connectionTimeout = i;
        this.readTimeout = i2;
        this.writeTimeout = i3;
    }

    public final java.lang.String getBaseURL() {
        return this.baseURL;
    }

    public final int getConnectionTimeout() {
        return this.connectionTimeout;
    }

    public final int getReadTimeout() {
        return this.readTimeout;
    }

    public final int getWriteTimeout() {
        return this.writeTimeout;
    }
}
