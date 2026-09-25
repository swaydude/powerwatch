package powerwatch.matrix.com.pwgen2android.shared.cloud.fonts;

/* JADX INFO: compiled from: FontUpdateConfiguration.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/cloud/fonts/FontUpdateConfiguration;", "", "getUpdateInfoEndpoint", "", "(Ljava/lang/String;)V", "getGetUpdateInfoEndpoint", "()Ljava/lang/String;", "component1", "copy", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class FontUpdateConfiguration {
    private final java.lang.String getUpdateInfoEndpoint;

    public static /* synthetic */ powerwatch.matrix.com.pwgen2android.shared.cloud.fonts.FontUpdateConfiguration copy$default(powerwatch.matrix.com.pwgen2android.shared.cloud.fonts.FontUpdateConfiguration fontUpdateConfiguration, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = fontUpdateConfiguration.getUpdateInfoEndpoint;
        }
        return fontUpdateConfiguration.copy(str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final java.lang.String getGetUpdateInfoEndpoint() {
        return this.getUpdateInfoEndpoint;
    }

    public final powerwatch.matrix.com.pwgen2android.shared.cloud.fonts.FontUpdateConfiguration copy(java.lang.String getUpdateInfoEndpoint) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getUpdateInfoEndpoint, "getUpdateInfoEndpoint");
        return new powerwatch.matrix.com.pwgen2android.shared.cloud.fonts.FontUpdateConfiguration(getUpdateInfoEndpoint);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof powerwatch.matrix.com.pwgen2android.shared.cloud.fonts.FontUpdateConfiguration) && kotlin.jvm.internal.Intrinsics.areEqual(this.getUpdateInfoEndpoint, ((powerwatch.matrix.com.pwgen2android.shared.cloud.fonts.FontUpdateConfiguration) other).getUpdateInfoEndpoint);
    }

    public int hashCode() {
        return this.getUpdateInfoEndpoint.hashCode();
    }

    public java.lang.String toString() {
        return "FontUpdateConfiguration(getUpdateInfoEndpoint=" + this.getUpdateInfoEndpoint + ')';
    }

    public FontUpdateConfiguration(java.lang.String getUpdateInfoEndpoint) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getUpdateInfoEndpoint, "getUpdateInfoEndpoint");
        this.getUpdateInfoEndpoint = getUpdateInfoEndpoint;
    }

    public final java.lang.String getGetUpdateInfoEndpoint() {
        return this.getUpdateInfoEndpoint;
    }
}
