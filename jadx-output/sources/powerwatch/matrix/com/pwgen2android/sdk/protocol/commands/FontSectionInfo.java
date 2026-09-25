package powerwatch.matrix.com.pwgen2android.sdk.protocol.commands;

/* JADX INFO: compiled from: Commands.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\b\u0010\u0017\u001a\u00020\u0018H\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/FontSectionInfo;", "", "fontType", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/FontType;", "version", "", "(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/FontType;J)V", "getFontType", "()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/FontType;", "setFontType", "(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/FontType;)V", "getVersion", "()J", "setVersion", "(J)V", "component1", "component2", "copy", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class FontSectionInfo {
    private powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.FontType fontType;
    private long version;

    public static /* synthetic */ powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.FontSectionInfo copy$default(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.FontSectionInfo fontSectionInfo, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.FontType fontType, long j, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            fontType = fontSectionInfo.fontType;
        }
        if ((i & 2) != 0) {
            j = fontSectionInfo.version;
        }
        return fontSectionInfo.copy(fontType, j);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.FontType getFontType() {
        return this.fontType;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getVersion() {
        return this.version;
    }

    public final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.FontSectionInfo copy(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.FontType fontType, long version) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fontType, "fontType");
        return new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.FontSectionInfo(fontType, version);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.FontSectionInfo)) {
            return false;
        }
        powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.FontSectionInfo fontSectionInfo = (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.FontSectionInfo) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.fontType, fontSectionInfo.fontType) && this.version == fontSectionInfo.version;
    }

    public int hashCode() {
        return (this.fontType.hashCode() * 31) + powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter$SleepSession$$ExternalSynthetic0.m0(this.version);
    }

    public FontSectionInfo(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.FontType fontType, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fontType, "fontType");
        this.fontType = fontType;
        this.version = j;
    }

    public final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.FontType getFontType() {
        return this.fontType;
    }

    public final long getVersion() {
        return this.version;
    }

    public final void setFontType(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.FontType fontType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fontType, "<set-?>");
        this.fontType = fontType;
    }

    public final void setVersion(long j) {
        this.version = j;
    }

    public java.lang.String toString() {
        return "(fontType=" + this.fontType.getName() + ", version=" + this.version + ')';
    }
}
