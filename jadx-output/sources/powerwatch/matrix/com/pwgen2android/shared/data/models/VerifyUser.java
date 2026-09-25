package powerwatch.matrix.com.pwgen2android.shared.data.models;

/* JADX INFO: compiled from: UserAccount.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001a"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/data/models/VerifyUser;", "", "token", "", "newPassword", "host", "Lpowerwatch/matrix/com/pwgen2android/shared/host/Host;", "email", "(Ljava/lang/String;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/host/Host;Ljava/lang/String;)V", "getEmail", "()Ljava/lang/String;", "getHost", "()Lpowerwatch/matrix/com/pwgen2android/shared/host/Host;", "getNewPassword", "getToken", "component1", "component2", "component3", "component4", "copy", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class VerifyUser {
    private final java.lang.String email;
    private final powerwatch.matrix.com.pwgen2android.shared.host.Host host;
    private final java.lang.String newPassword;
    private final java.lang.String token;

    public static /* synthetic */ powerwatch.matrix.com.pwgen2android.shared.data.models.VerifyUser copy$default(powerwatch.matrix.com.pwgen2android.shared.data.models.VerifyUser verifyUser, java.lang.String str, java.lang.String str2, powerwatch.matrix.com.pwgen2android.shared.host.Host host, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = verifyUser.token;
        }
        if ((i & 2) != 0) {
            str2 = verifyUser.newPassword;
        }
        if ((i & 4) != 0) {
            host = verifyUser.host;
        }
        if ((i & 8) != 0) {
            str3 = verifyUser.email;
        }
        return verifyUser.copy(str, str2, host, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final java.lang.String getToken() {
        return this.token;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final java.lang.String getNewPassword() {
        return this.newPassword;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final powerwatch.matrix.com.pwgen2android.shared.host.Host getHost() {
        return this.host;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final java.lang.String getEmail() {
        return this.email;
    }

    public final powerwatch.matrix.com.pwgen2android.shared.data.models.VerifyUser copy(java.lang.String token, java.lang.String newPassword, powerwatch.matrix.com.pwgen2android.shared.host.Host host, java.lang.String email) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(token, "token");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(newPassword, "newPassword");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(host, "host");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(email, "email");
        return new powerwatch.matrix.com.pwgen2android.shared.data.models.VerifyUser(token, newPassword, host, email);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof powerwatch.matrix.com.pwgen2android.shared.data.models.VerifyUser)) {
            return false;
        }
        powerwatch.matrix.com.pwgen2android.shared.data.models.VerifyUser verifyUser = (powerwatch.matrix.com.pwgen2android.shared.data.models.VerifyUser) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.token, verifyUser.token) && kotlin.jvm.internal.Intrinsics.areEqual(this.newPassword, verifyUser.newPassword) && kotlin.jvm.internal.Intrinsics.areEqual(this.host, verifyUser.host) && kotlin.jvm.internal.Intrinsics.areEqual(this.email, verifyUser.email);
    }

    public int hashCode() {
        return (((((this.token.hashCode() * 31) + this.newPassword.hashCode()) * 31) + this.host.hashCode()) * 31) + this.email.hashCode();
    }

    public java.lang.String toString() {
        return "VerifyUser(token=" + this.token + ", newPassword=" + this.newPassword + ", host=" + this.host + ", email=" + this.email + ')';
    }

    public VerifyUser(java.lang.String token, java.lang.String newPassword, powerwatch.matrix.com.pwgen2android.shared.host.Host host, java.lang.String email) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(token, "token");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(newPassword, "newPassword");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(host, "host");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(email, "email");
        this.token = token;
        this.newPassword = newPassword;
        this.host = host;
        this.email = email;
    }

    public final java.lang.String getEmail() {
        return this.email;
    }

    public final powerwatch.matrix.com.pwgen2android.shared.host.Host getHost() {
        return this.host;
    }

    public final java.lang.String getNewPassword() {
        return this.newPassword;
    }

    public final java.lang.String getToken() {
        return this.token;
    }
}
