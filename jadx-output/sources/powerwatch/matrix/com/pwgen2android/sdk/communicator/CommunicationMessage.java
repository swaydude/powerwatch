package powerwatch.matrix.com.pwgen2android.sdk.communicator;

/* JADX INFO: compiled from: Communicator.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001e\u001a\u00020\tHÆ\u0003J1\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006&"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;", "", "uid", "", "protocolMessage", "Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;", "technologyType", "Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;", "protocolType", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;", "(Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;)V", "getProtocolMessage", "()Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;", "setProtocolMessage", "(Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;)V", "getProtocolType", "()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;", "setProtocolType", "(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;)V", "getTechnologyType", "()Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;", "setTechnologyType", "(Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;)V", "getUid", "()Ljava/lang/String;", "setUid", "(Ljava/lang/String;)V", "component1", "component2", "component3", "component4", "copy", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class CommunicationMessage {
    private powerwatch.matrix.com.pwgen2android.sdk.model.ProtocolMessage protocolMessage;
    private powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolType protocolType;
    private powerwatch.matrix.com.pwgen2android.sdk.technologies.TechnologyType technologyType;
    private java.lang.String uid;

    public static /* synthetic */ powerwatch.matrix.com.pwgen2android.sdk.communicator.CommunicationMessage copy$default(powerwatch.matrix.com.pwgen2android.sdk.communicator.CommunicationMessage communicationMessage, java.lang.String str, powerwatch.matrix.com.pwgen2android.sdk.model.ProtocolMessage protocolMessage, powerwatch.matrix.com.pwgen2android.sdk.technologies.TechnologyType technologyType, powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolType protocolType, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = communicationMessage.uid;
        }
        if ((i & 2) != 0) {
            protocolMessage = communicationMessage.protocolMessage;
        }
        if ((i & 4) != 0) {
            technologyType = communicationMessage.technologyType;
        }
        if ((i & 8) != 0) {
            protocolType = communicationMessage.protocolType;
        }
        return communicationMessage.copy(str, protocolMessage, technologyType, protocolType);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final java.lang.String getUid() {
        return this.uid;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final powerwatch.matrix.com.pwgen2android.sdk.model.ProtocolMessage getProtocolMessage() {
        return this.protocolMessage;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final powerwatch.matrix.com.pwgen2android.sdk.technologies.TechnologyType getTechnologyType() {
        return this.technologyType;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolType getProtocolType() {
        return this.protocolType;
    }

    public final powerwatch.matrix.com.pwgen2android.sdk.communicator.CommunicationMessage copy(java.lang.String uid, powerwatch.matrix.com.pwgen2android.sdk.model.ProtocolMessage protocolMessage, powerwatch.matrix.com.pwgen2android.sdk.technologies.TechnologyType technologyType, powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolType protocolType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uid, "uid");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(protocolMessage, "protocolMessage");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(technologyType, "technologyType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(protocolType, "protocolType");
        return new powerwatch.matrix.com.pwgen2android.sdk.communicator.CommunicationMessage(uid, protocolMessage, technologyType, protocolType);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof powerwatch.matrix.com.pwgen2android.sdk.communicator.CommunicationMessage)) {
            return false;
        }
        powerwatch.matrix.com.pwgen2android.sdk.communicator.CommunicationMessage communicationMessage = (powerwatch.matrix.com.pwgen2android.sdk.communicator.CommunicationMessage) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.uid, communicationMessage.uid) && kotlin.jvm.internal.Intrinsics.areEqual(this.protocolMessage, communicationMessage.protocolMessage) && this.technologyType == communicationMessage.technologyType && this.protocolType == communicationMessage.protocolType;
    }

    public int hashCode() {
        return (((((this.uid.hashCode() * 31) + this.protocolMessage.hashCode()) * 31) + this.technologyType.hashCode()) * 31) + this.protocolType.hashCode();
    }

    public java.lang.String toString() {
        return "CommunicationMessage(uid=" + this.uid + ", protocolMessage=" + this.protocolMessage + ", technologyType=" + this.technologyType + ", protocolType=" + this.protocolType + ')';
    }

    public CommunicationMessage(java.lang.String uid, powerwatch.matrix.com.pwgen2android.sdk.model.ProtocolMessage protocolMessage, powerwatch.matrix.com.pwgen2android.sdk.technologies.TechnologyType technologyType, powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolType protocolType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uid, "uid");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(protocolMessage, "protocolMessage");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(technologyType, "technologyType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(protocolType, "protocolType");
        this.uid = uid;
        this.protocolMessage = protocolMessage;
        this.technologyType = technologyType;
        this.protocolType = protocolType;
    }

    public final java.lang.String getUid() {
        return this.uid;
    }

    public final void setUid(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.uid = str;
    }

    public final powerwatch.matrix.com.pwgen2android.sdk.model.ProtocolMessage getProtocolMessage() {
        return this.protocolMessage;
    }

    public final void setProtocolMessage(powerwatch.matrix.com.pwgen2android.sdk.model.ProtocolMessage protocolMessage) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(protocolMessage, "<set-?>");
        this.protocolMessage = protocolMessage;
    }

    public final powerwatch.matrix.com.pwgen2android.sdk.technologies.TechnologyType getTechnologyType() {
        return this.technologyType;
    }

    public final void setTechnologyType(powerwatch.matrix.com.pwgen2android.sdk.technologies.TechnologyType technologyType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(technologyType, "<set-?>");
        this.technologyType = technologyType;
    }

    public final powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolType getProtocolType() {
        return this.protocolType;
    }

    public final void setProtocolType(powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolType protocolType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(protocolType, "<set-?>");
        this.protocolType = protocolType;
    }
}
