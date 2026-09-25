package powerwatch.matrix.com.pwgen2android.shared.data.models;

/* JADX INFO: compiled from: UserAccount.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/data/models/ResetPassword;", "", "oldPassword", "", "newPassword", "(Ljava/lang/String;Ljava/lang/String;)V", "getNewPassword", "()Ljava/lang/String;", "getOldPassword", "component1", "component2", "copy", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class ResetPassword {
    private final java.lang.String newPassword;
    private final java.lang.String oldPassword;

    public static /* synthetic */ powerwatch.matrix.com.pwgen2android.shared.data.models.ResetPassword copy$default(powerwatch.matrix.com.pwgen2android.shared.data.models.ResetPassword resetPassword, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = resetPassword.oldPassword;
        }
        if ((i & 2) != 0) {
            str2 = resetPassword.newPassword;
        }
        return resetPassword.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final java.lang.String getOldPassword() {
        return this.oldPassword;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final java.lang.String getNewPassword() {
        return this.newPassword;
    }

    public final powerwatch.matrix.com.pwgen2android.shared.data.models.ResetPassword copy(java.lang.String oldPassword, java.lang.String newPassword) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(oldPassword, "oldPassword");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(newPassword, "newPassword");
        return new powerwatch.matrix.com.pwgen2android.shared.data.models.ResetPassword(oldPassword, newPassword);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof powerwatch.matrix.com.pwgen2android.shared.data.models.ResetPassword)) {
            return false;
        }
        powerwatch.matrix.com.pwgen2android.shared.data.models.ResetPassword resetPassword = (powerwatch.matrix.com.pwgen2android.shared.data.models.ResetPassword) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.oldPassword, resetPassword.oldPassword) && kotlin.jvm.internal.Intrinsics.areEqual(this.newPassword, resetPassword.newPassword);
    }

    public int hashCode() {
        return (this.oldPassword.hashCode() * 31) + this.newPassword.hashCode();
    }

    public java.lang.String toString() {
        return "ResetPassword(oldPassword=" + this.oldPassword + ", newPassword=" + this.newPassword + ')';
    }

    public ResetPassword(java.lang.String oldPassword, java.lang.String newPassword) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(oldPassword, "oldPassword");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(newPassword, "newPassword");
        this.oldPassword = oldPassword;
        this.newPassword = newPassword;
    }

    public final java.lang.String getNewPassword() {
        return this.newPassword;
    }

    public final java.lang.String getOldPassword() {
        return this.oldPassword;
    }
}
