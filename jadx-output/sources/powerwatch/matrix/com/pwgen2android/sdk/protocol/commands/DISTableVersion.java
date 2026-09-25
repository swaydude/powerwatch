package powerwatch.matrix.com.pwgen2android.sdk.protocol.commands;

/* JADX INFO: compiled from: Commands.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\n\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001f\u001a\u00020\tHÆ\u0003J;\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020\u0007HÖ\u0001J\t\u0010%\u001a\u00020&HÖ\u0001R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000eR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000eR\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006'"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DISTableVersion;", "", "otaVersion", "", "mtpVersion", "disVersion", "timestamp", "", "sections", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/SectionsInfo;", "(SSSILpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/SectionsInfo;)V", "getDisVersion", "()S", "setDisVersion", "(S)V", "getMtpVersion", "setMtpVersion", "getOtaVersion", "setOtaVersion", "getSections", "()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/SectionsInfo;", "setSections", "(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/SectionsInfo;)V", "getTimestamp", "()I", "setTimestamp", "(I)V", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "toString", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class DISTableVersion {
    private short disVersion;
    private short mtpVersion;
    private short otaVersion;
    private powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.SectionsInfo sections;
    private int timestamp;

    public DISTableVersion() {
        this((short) 0, (short) 0, (short) 0, 0, null, 31, null);
    }

    public static /* synthetic */ powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DISTableVersion copy$default(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DISTableVersion dISTableVersion, short s, short s2, short s3, int i, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.SectionsInfo sectionsInfo, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            s = dISTableVersion.otaVersion;
        }
        if ((i2 & 2) != 0) {
            s2 = dISTableVersion.mtpVersion;
        }
        short s4 = s2;
        if ((i2 & 4) != 0) {
            s3 = dISTableVersion.disVersion;
        }
        short s5 = s3;
        if ((i2 & 8) != 0) {
            i = dISTableVersion.timestamp;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            sectionsInfo = dISTableVersion.sections;
        }
        return dISTableVersion.copy(s, s4, s5, i3, sectionsInfo);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final short getOtaVersion() {
        return this.otaVersion;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final short getMtpVersion() {
        return this.mtpVersion;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final short getDisVersion() {
        return this.disVersion;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getTimestamp() {
        return this.timestamp;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.SectionsInfo getSections() {
        return this.sections;
    }

    public final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DISTableVersion copy(short otaVersion, short mtpVersion, short disVersion, int timestamp, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.SectionsInfo sections) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sections, "sections");
        return new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DISTableVersion(otaVersion, mtpVersion, disVersion, timestamp, sections);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DISTableVersion)) {
            return false;
        }
        powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DISTableVersion dISTableVersion = (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DISTableVersion) other;
        return this.otaVersion == dISTableVersion.otaVersion && this.mtpVersion == dISTableVersion.mtpVersion && this.disVersion == dISTableVersion.disVersion && this.timestamp == dISTableVersion.timestamp && kotlin.jvm.internal.Intrinsics.areEqual(this.sections, dISTableVersion.sections);
    }

    public int hashCode() {
        return (((((((this.otaVersion * 31) + this.mtpVersion) * 31) + this.disVersion) * 31) + this.timestamp) * 31) + this.sections.hashCode();
    }

    public java.lang.String toString() {
        return "DISTableVersion(otaVersion=" + ((int) this.otaVersion) + ", mtpVersion=" + ((int) this.mtpVersion) + ", disVersion=" + ((int) this.disVersion) + ", timestamp=" + this.timestamp + ", sections=" + this.sections + ')';
    }

    public DISTableVersion(short s, short s2, short s3, int i, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.SectionsInfo sections) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sections, "sections");
        this.otaVersion = s;
        this.mtpVersion = s2;
        this.disVersion = s3;
        this.timestamp = i;
        this.sections = sections;
    }

    public final short getMtpVersion() {
        return this.mtpVersion;
    }

    public final short getOtaVersion() {
        return this.otaVersion;
    }

    public final void setMtpVersion(short s) {
        this.mtpVersion = s;
    }

    public final void setOtaVersion(short s) {
        this.otaVersion = s;
    }

    public final short getDisVersion() {
        return this.disVersion;
    }

    public final int getTimestamp() {
        return this.timestamp;
    }

    public final void setDisVersion(short s) {
        this.disVersion = s;
    }

    public final void setTimestamp(int i) {
        this.timestamp = i;
    }

    public /* synthetic */ DISTableVersion(short s, short s2, short s3, int i, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.SectionsInfo sectionsInfo, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? (short) 1 : s, (i2 & 2) != 0 ? (short) 1 : s2, (i2 & 4) != 0 ? (short) 1 : s3, (i2 & 8) != 0 ? -1 : i, (i2 & 16) != 0 ? new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.SectionsInfo(null, 1, null) : sectionsInfo);
    }

    public final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.SectionsInfo getSections() {
        return this.sections;
    }

    public final void setSections(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.SectionsInfo sectionsInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sectionsInfo, "<set-?>");
        this.sections = sectionsInfo;
    }
}
