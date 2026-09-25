package powerwatch.matrix.com.pwgen2android.sdk.model;

/* JADX INFO: compiled from: Entities.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\u0019\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0013HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006 "}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/model/ConnectionInfo;", "Landroid/os/Parcelable;", "technologyType", "Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;", "protocolType", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;", "(Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;)V", "getProtocolType", "()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;", "setProtocolType", "(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;)V", "getTechnologyType", "()Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;", "setTechnologyType", "(Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;)V", "component1", "component2", "copy", "describeContents", "", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class ConnectionInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<powerwatch.matrix.com.pwgen2android.sdk.model.ConnectionInfo> CREATOR = new powerwatch.matrix.com.pwgen2android.sdk.model.ConnectionInfo.Creator();
    private powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolType protocolType;
    private powerwatch.matrix.com.pwgen2android.sdk.technologies.TechnologyType technologyType;

    /* JADX INFO: compiled from: Entities.kt */
    @kotlin.Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class Creator implements android.os.Parcelable.Creator<powerwatch.matrix.com.pwgen2android.sdk.model.ConnectionInfo> {
        @Override // android.os.Parcelable.Creator
        public final powerwatch.matrix.com.pwgen2android.sdk.model.ConnectionInfo createFromParcel(android.os.Parcel parcel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new powerwatch.matrix.com.pwgen2android.sdk.model.ConnectionInfo(powerwatch.matrix.com.pwgen2android.sdk.technologies.TechnologyType.valueOf(parcel.readString()), powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolType.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final powerwatch.matrix.com.pwgen2android.sdk.model.ConnectionInfo[] newArray(int i) {
            return new powerwatch.matrix.com.pwgen2android.sdk.model.ConnectionInfo[i];
        }
    }

    public static /* synthetic */ powerwatch.matrix.com.pwgen2android.sdk.model.ConnectionInfo copy$default(powerwatch.matrix.com.pwgen2android.sdk.model.ConnectionInfo connectionInfo, powerwatch.matrix.com.pwgen2android.sdk.technologies.TechnologyType technologyType, powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolType protocolType, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            technologyType = connectionInfo.technologyType;
        }
        if ((i & 2) != 0) {
            protocolType = connectionInfo.protocolType;
        }
        return connectionInfo.copy(technologyType, protocolType);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final powerwatch.matrix.com.pwgen2android.sdk.technologies.TechnologyType getTechnologyType() {
        return this.technologyType;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolType getProtocolType() {
        return this.protocolType;
    }

    public final powerwatch.matrix.com.pwgen2android.sdk.model.ConnectionInfo copy(powerwatch.matrix.com.pwgen2android.sdk.technologies.TechnologyType technologyType, powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolType protocolType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(technologyType, "technologyType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(protocolType, "protocolType");
        return new powerwatch.matrix.com.pwgen2android.sdk.model.ConnectionInfo(technologyType, protocolType);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof powerwatch.matrix.com.pwgen2android.sdk.model.ConnectionInfo)) {
            return false;
        }
        powerwatch.matrix.com.pwgen2android.sdk.model.ConnectionInfo connectionInfo = (powerwatch.matrix.com.pwgen2android.sdk.model.ConnectionInfo) other;
        return this.technologyType == connectionInfo.technologyType && this.protocolType == connectionInfo.protocolType;
    }

    public int hashCode() {
        return (this.technologyType.hashCode() * 31) + this.protocolType.hashCode();
    }

    public java.lang.String toString() {
        return "ConnectionInfo(technologyType=" + this.technologyType + ", protocolType=" + this.protocolType + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int flags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.technologyType.name());
        parcel.writeString(this.protocolType.name());
    }

    public ConnectionInfo(powerwatch.matrix.com.pwgen2android.sdk.technologies.TechnologyType technologyType, powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolType protocolType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(technologyType, "technologyType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(protocolType, "protocolType");
        this.technologyType = technologyType;
        this.protocolType = protocolType;
    }

    public final powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolType getProtocolType() {
        return this.protocolType;
    }

    public final powerwatch.matrix.com.pwgen2android.sdk.technologies.TechnologyType getTechnologyType() {
        return this.technologyType;
    }

    public final void setProtocolType(powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolType protocolType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(protocolType, "<set-?>");
        this.protocolType = protocolType;
    }

    public final void setTechnologyType(powerwatch.matrix.com.pwgen2android.sdk.technologies.TechnologyType technologyType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(technologyType, "<set-?>");
        this.technologyType = technologyType;
    }
}
