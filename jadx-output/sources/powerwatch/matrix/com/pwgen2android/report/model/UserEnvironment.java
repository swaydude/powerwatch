package powerwatch.matrix.com.pwgen2android.report.model;

/* JADX INFO: compiled from: UserEnvironment.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003JO\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006!"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/report/model/UserEnvironment;", "", "email", "", "hostID", "hostLanguage", "deviceID", "country", "authToken", "cloudURL", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAuthToken", "()Ljava/lang/String;", "getCloudURL", "getCountry", "getDeviceID", "getEmail", "getHostID", "getHostLanguage", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class UserEnvironment {
    private final java.lang.String authToken;
    private final java.lang.String cloudURL;
    private final java.lang.String country;
    private final java.lang.String deviceID;
    private final java.lang.String email;
    private final java.lang.String hostID;
    private final java.lang.String hostLanguage;

    public static /* synthetic */ powerwatch.matrix.com.pwgen2android.report.model.UserEnvironment copy$default(powerwatch.matrix.com.pwgen2android.report.model.UserEnvironment userEnvironment, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = userEnvironment.email;
        }
        if ((i & 2) != 0) {
            str2 = userEnvironment.hostID;
        }
        java.lang.String str8 = str2;
        if ((i & 4) != 0) {
            str3 = userEnvironment.hostLanguage;
        }
        java.lang.String str9 = str3;
        if ((i & 8) != 0) {
            str4 = userEnvironment.deviceID;
        }
        java.lang.String str10 = str4;
        if ((i & 16) != 0) {
            str5 = userEnvironment.country;
        }
        java.lang.String str11 = str5;
        if ((i & 32) != 0) {
            str6 = userEnvironment.authToken;
        }
        java.lang.String str12 = str6;
        if ((i & 64) != 0) {
            str7 = userEnvironment.cloudURL;
        }
        return userEnvironment.copy(str, str8, str9, str10, str11, str12, str7);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final java.lang.String getEmail() {
        return this.email;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final java.lang.String getHostID() {
        return this.hostID;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final java.lang.String getHostLanguage() {
        return this.hostLanguage;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final java.lang.String getDeviceID() {
        return this.deviceID;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final java.lang.String getCountry() {
        return this.country;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final java.lang.String getAuthToken() {
        return this.authToken;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final java.lang.String getCloudURL() {
        return this.cloudURL;
    }

    public final powerwatch.matrix.com.pwgen2android.report.model.UserEnvironment copy(java.lang.String email, java.lang.String hostID, java.lang.String hostLanguage, java.lang.String deviceID, java.lang.String country, java.lang.String authToken, java.lang.String cloudURL) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(email, "email");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hostID, "hostID");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hostLanguage, "hostLanguage");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceID, "deviceID");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(country, "country");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authToken, "authToken");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cloudURL, "cloudURL");
        return new powerwatch.matrix.com.pwgen2android.report.model.UserEnvironment(email, hostID, hostLanguage, deviceID, country, authToken, cloudURL);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof powerwatch.matrix.com.pwgen2android.report.model.UserEnvironment)) {
            return false;
        }
        powerwatch.matrix.com.pwgen2android.report.model.UserEnvironment userEnvironment = (powerwatch.matrix.com.pwgen2android.report.model.UserEnvironment) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.email, userEnvironment.email) && kotlin.jvm.internal.Intrinsics.areEqual(this.hostID, userEnvironment.hostID) && kotlin.jvm.internal.Intrinsics.areEqual(this.hostLanguage, userEnvironment.hostLanguage) && kotlin.jvm.internal.Intrinsics.areEqual(this.deviceID, userEnvironment.deviceID) && kotlin.jvm.internal.Intrinsics.areEqual(this.country, userEnvironment.country) && kotlin.jvm.internal.Intrinsics.areEqual(this.authToken, userEnvironment.authToken) && kotlin.jvm.internal.Intrinsics.areEqual(this.cloudURL, userEnvironment.cloudURL);
    }

    public int hashCode() {
        return (((((((((((this.email.hashCode() * 31) + this.hostID.hashCode()) * 31) + this.hostLanguage.hashCode()) * 31) + this.deviceID.hashCode()) * 31) + this.country.hashCode()) * 31) + this.authToken.hashCode()) * 31) + this.cloudURL.hashCode();
    }

    public java.lang.String toString() {
        return "UserEnvironment(email=" + this.email + ", hostID=" + this.hostID + ", hostLanguage=" + this.hostLanguage + ", deviceID=" + this.deviceID + ", country=" + this.country + ", authToken=" + this.authToken + ", cloudURL=" + this.cloudURL + ')';
    }

    public UserEnvironment(java.lang.String email, java.lang.String hostID, java.lang.String hostLanguage, java.lang.String deviceID, java.lang.String country, java.lang.String authToken, java.lang.String cloudURL) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(email, "email");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hostID, "hostID");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hostLanguage, "hostLanguage");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceID, "deviceID");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(country, "country");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authToken, "authToken");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cloudURL, "cloudURL");
        this.email = email;
        this.hostID = hostID;
        this.hostLanguage = hostLanguage;
        this.deviceID = deviceID;
        this.country = country;
        this.authToken = authToken;
        this.cloudURL = cloudURL;
    }

    public final java.lang.String getEmail() {
        return this.email;
    }

    public final java.lang.String getHostID() {
        return this.hostID;
    }

    public final java.lang.String getHostLanguage() {
        return this.hostLanguage;
    }

    public final java.lang.String getDeviceID() {
        return this.deviceID;
    }

    public final java.lang.String getCountry() {
        return this.country;
    }

    public final java.lang.String getAuthToken() {
        return this.authToken;
    }

    public final java.lang.String getCloudURL() {
        return this.cloudURL;
    }
}
