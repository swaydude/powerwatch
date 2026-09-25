package powerwatch.matrix.com.pwgen2android.sdk.model;

/* JADX INFO: compiled from: Entities.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\bHÆ\u0003J-\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u000f2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u001f\u001a\u00020 J\t\u0010!\u001a\u00020\u0013HÖ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006$"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/model/Accessory;", "", "deviceInfo", "Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;", "connections", "", "Lpowerwatch/matrix/com/pwgen2android/sdk/connection/Connection;", "technologyType", "Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;", "(Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;Ljava/util/List;Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;)V", "getConnections", "()Ljava/util/List;", "getDeviceInfo", "()Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;", "hasConnections", "", "getHasConnections", "()Z", "numberOfConnections", "", "getNumberOfConnections", "()I", "getTechnologyType", "()Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;", "component1", "component2", "component3", "copy", "equals", com.google.android.gms.fitness.FitnessActivities.OTHER, "getConnectionByProtocolType", "protocolType", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;", "hashCode", "toString", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class Accessory {
    private final java.util.List<powerwatch.matrix.com.pwgen2android.sdk.connection.Connection> connections;
    private final powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo deviceInfo;
    private final powerwatch.matrix.com.pwgen2android.sdk.technologies.TechnologyType technologyType;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ powerwatch.matrix.com.pwgen2android.sdk.model.Accessory copy$default(powerwatch.matrix.com.pwgen2android.sdk.model.Accessory accessory, powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo deviceInfo, java.util.List list, powerwatch.matrix.com.pwgen2android.sdk.technologies.TechnologyType technologyType, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            deviceInfo = accessory.deviceInfo;
        }
        if ((i & 2) != 0) {
            list = accessory.connections;
        }
        if ((i & 4) != 0) {
            technologyType = accessory.technologyType;
        }
        return accessory.copy(deviceInfo, list, technologyType);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    public final java.util.List<powerwatch.matrix.com.pwgen2android.sdk.connection.Connection> component2() {
        return this.connections;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final powerwatch.matrix.com.pwgen2android.sdk.technologies.TechnologyType getTechnologyType() {
        return this.technologyType;
    }

    public final powerwatch.matrix.com.pwgen2android.sdk.model.Accessory copy(powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo deviceInfo, java.util.List<? extends powerwatch.matrix.com.pwgen2android.sdk.connection.Connection> connections, powerwatch.matrix.com.pwgen2android.sdk.technologies.TechnologyType technologyType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connections, "connections");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(technologyType, "technologyType");
        return new powerwatch.matrix.com.pwgen2android.sdk.model.Accessory(deviceInfo, connections, technologyType);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof powerwatch.matrix.com.pwgen2android.sdk.model.Accessory)) {
            return false;
        }
        powerwatch.matrix.com.pwgen2android.sdk.model.Accessory accessory = (powerwatch.matrix.com.pwgen2android.sdk.model.Accessory) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.deviceInfo, accessory.deviceInfo) && kotlin.jvm.internal.Intrinsics.areEqual(this.connections, accessory.connections) && this.technologyType == accessory.technologyType;
    }

    public int hashCode() {
        return (((this.deviceInfo.hashCode() * 31) + this.connections.hashCode()) * 31) + this.technologyType.hashCode();
    }

    public java.lang.String toString() {
        return "Accessory(deviceInfo=" + this.deviceInfo + ", connections=" + this.connections + ", technologyType=" + this.technologyType + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Accessory(powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo deviceInfo, java.util.List<? extends powerwatch.matrix.com.pwgen2android.sdk.connection.Connection> connections, powerwatch.matrix.com.pwgen2android.sdk.technologies.TechnologyType technologyType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connections, "connections");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(technologyType, "technologyType");
        this.deviceInfo = deviceInfo;
        this.connections = connections;
        this.technologyType = technologyType;
    }

    public final java.util.List<powerwatch.matrix.com.pwgen2android.sdk.connection.Connection> getConnections() {
        return this.connections;
    }

    public final powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    public final powerwatch.matrix.com.pwgen2android.sdk.technologies.TechnologyType getTechnologyType() {
        return this.technologyType;
    }

    public final int getNumberOfConnections() {
        return this.connections.size();
    }

    public final boolean getHasConnections() {
        return getNumberOfConnections() > 0;
    }

    public final java.util.List<powerwatch.matrix.com.pwgen2android.sdk.connection.Connection> getConnectionByProtocolType(powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolType protocolType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(protocolType, "protocolType");
        java.util.List<powerwatch.matrix.com.pwgen2android.sdk.connection.Connection> list = this.connections;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (((powerwatch.matrix.com.pwgen2android.sdk.connection.Connection) obj).getConnectionInfo().getProtocolType() == protocolType) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
