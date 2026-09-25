package powerwatch.matrix.com.pwgen2android.sdk.model;

/* JADX INFO: compiled from: Entities.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J'\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;", "", "payload", "Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolPayload;", "type", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;", "messageType", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;", "(Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolPayload;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;)V", "getMessageType", "()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;", "getPayload", "()Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolPayload;", "setPayload", "(Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolPayload;)V", "getType", "()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;", "setType", "(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;)V", "component1", "component2", "component3", "copy", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class ProtocolMessage {
    private final powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolMessageType messageType;
    private powerwatch.matrix.com.pwgen2android.sdk.model.ProtocolPayload payload;
    private powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolType type;

    public static /* synthetic */ powerwatch.matrix.com.pwgen2android.sdk.model.ProtocolMessage copy$default(powerwatch.matrix.com.pwgen2android.sdk.model.ProtocolMessage protocolMessage, powerwatch.matrix.com.pwgen2android.sdk.model.ProtocolPayload protocolPayload, powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolType protocolType, powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolMessageType protocolMessageType, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            protocolPayload = protocolMessage.payload;
        }
        if ((i & 2) != 0) {
            protocolType = protocolMessage.type;
        }
        if ((i & 4) != 0) {
            protocolMessageType = protocolMessage.messageType;
        }
        return protocolMessage.copy(protocolPayload, protocolType, protocolMessageType);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final powerwatch.matrix.com.pwgen2android.sdk.model.ProtocolPayload getPayload() {
        return this.payload;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolType getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolMessageType getMessageType() {
        return this.messageType;
    }

    public final powerwatch.matrix.com.pwgen2android.sdk.model.ProtocolMessage copy(powerwatch.matrix.com.pwgen2android.sdk.model.ProtocolPayload payload, powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolType type, powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolMessageType messageType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payload, "payload");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "type");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(messageType, "messageType");
        return new powerwatch.matrix.com.pwgen2android.sdk.model.ProtocolMessage(payload, type, messageType);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof powerwatch.matrix.com.pwgen2android.sdk.model.ProtocolMessage)) {
            return false;
        }
        powerwatch.matrix.com.pwgen2android.sdk.model.ProtocolMessage protocolMessage = (powerwatch.matrix.com.pwgen2android.sdk.model.ProtocolMessage) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.payload, protocolMessage.payload) && this.type == protocolMessage.type && this.messageType == protocolMessage.messageType;
    }

    public int hashCode() {
        return (((this.payload.hashCode() * 31) + this.type.hashCode()) * 31) + this.messageType.hashCode();
    }

    public java.lang.String toString() {
        return "ProtocolMessage(payload=" + this.payload + ", type=" + this.type + ", messageType=" + this.messageType + ')';
    }

    public ProtocolMessage(powerwatch.matrix.com.pwgen2android.sdk.model.ProtocolPayload payload, powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolType type, powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolMessageType messageType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payload, "payload");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "type");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(messageType, "messageType");
        this.payload = payload;
        this.type = type;
        this.messageType = messageType;
    }

    public /* synthetic */ ProtocolMessage(powerwatch.matrix.com.pwgen2android.sdk.model.ProtocolPayload protocolPayload, powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolType protocolType, powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolMessageType protocolMessageType, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(protocolPayload, (i & 2) != 0 ? powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolType.BLE_DTP : protocolType, (i & 4) != 0 ? powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolMessageType.UNKNOWN : protocolMessageType);
    }

    public final powerwatch.matrix.com.pwgen2android.sdk.model.ProtocolPayload getPayload() {
        return this.payload;
    }

    public final powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolType getType() {
        return this.type;
    }

    public final void setPayload(powerwatch.matrix.com.pwgen2android.sdk.model.ProtocolPayload protocolPayload) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(protocolPayload, "<set-?>");
        this.payload = protocolPayload;
    }

    public final void setType(powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolType protocolType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(protocolType, "<set-?>");
        this.type = protocolType;
    }

    public final powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolMessageType getMessageType() {
        return this.messageType;
    }
}
