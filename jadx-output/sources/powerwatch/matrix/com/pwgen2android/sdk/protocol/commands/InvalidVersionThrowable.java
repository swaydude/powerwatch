package powerwatch.matrix.com.pwgen2android.sdk.protocol.commands;

/* JADX INFO: compiled from: Commands.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/InvalidVersionThrowable;", "", "dataInfo", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;", "(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;)V", "getDataInfo", "()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;", io.fabric.sdk.android.services.settings.SettingsJsonConstants.PROMPT_MESSAGE_KEY, "", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class InvalidVersionThrowable extends java.lang.Throwable {
    private final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo dataInfo;

    public static /* synthetic */ powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.InvalidVersionThrowable copy$default(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.InvalidVersionThrowable invalidVersionThrowable, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo dataInfo, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            dataInfo = invalidVersionThrowable.dataInfo;
        }
        return invalidVersionThrowable.copy(dataInfo);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo getDataInfo() {
        return this.dataInfo;
    }

    public final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.InvalidVersionThrowable copy(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo dataInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataInfo, "dataInfo");
        return new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.InvalidVersionThrowable(dataInfo);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.InvalidVersionThrowable) && kotlin.jvm.internal.Intrinsics.areEqual(this.dataInfo, ((powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.InvalidVersionThrowable) other).dataInfo);
    }

    public int hashCode() {
        return this.dataInfo.hashCode();
    }

    @Override // java.lang.Throwable
    public java.lang.String toString() {
        return "InvalidVersionThrowable(dataInfo=" + this.dataInfo + ')';
    }

    public InvalidVersionThrowable(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo dataInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataInfo, "dataInfo");
        this.dataInfo = dataInfo;
    }

    public final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo getDataInfo() {
        return this.dataInfo;
    }

    @Override // java.lang.Throwable
    public java.lang.String getMessage() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("Invalid version found: ");
        sb.append((java.lang.Object) this.dataInfo.getData().getFirmwareVersion());
        sb.append(", binary: ");
        java.lang.String firmwareVersion = this.dataInfo.getData().getFirmwareVersion();
        java.lang.String toString$default = null;
        if (firmwareVersion != null) {
            byte[] bytes = firmwareVersion.getBytes(kotlin.text.Charsets.UTF_8);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
            if (bytes != null) {
                toString$default = powerwatch.matrix.com.pwgen2android.shared.extensions.BluetoothExtensionsKt.formatToString$default(bytes, false, 1, null);
            }
        }
        sb.append((java.lang.Object) toString$default);
        return sb.toString();
    }
}
