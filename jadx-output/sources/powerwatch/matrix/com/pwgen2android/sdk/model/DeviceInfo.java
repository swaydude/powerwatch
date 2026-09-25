package powerwatch.matrix.com.pwgen2android.sdk.model;

/* JADX INFO: compiled from: Entities.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b#\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Be\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0002\u0010\u0012J\t\u00101\u001a\u00020\u0003HÆ\u0003J\u0010\u00102\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010$J\t\u00103\u001a\u00020\u0005HÆ\u0003J\t\u00104\u001a\u00020\bHÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003J\t\u00106\u001a\u00020\u000bHÆ\u0003J\u000f\u00107\u001a\b\u0012\u0004\u0012\u00020\u000e0\rHÆ\u0003J\u0015\u00108\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00110\u0010HÆ\u0003Jr\u00109\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00110\u0010HÆ\u0001¢\u0006\u0002\u0010:J\t\u0010;\u001a\u00020\bHÖ\u0001J\u0013\u0010<\u001a\u00020\u001a2\b\u0010=\u001a\u0004\u0018\u00010>HÖ\u0003J\t\u0010?\u001a\u00020\bHÖ\u0001J\u000e\u0010@\u001a\u00020\u001a2\u0006\u0010A\u001a\u00020BJ\t\u0010C\u001a\u00020\u0003HÖ\u0001J\u0019\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020G2\u0006\u0010H\u001a\u00020\bHÖ\u0001R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0019\u001a\u00020\u001a8F¢\u0006\f\u0012\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0019\u0010\u001dR\u0011\u0010\u001e\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001dR\u0017\u0010\u001f\u001a\u00020\u001a8F¢\u0006\f\u0012\u0004\b \u0010\u001c\u001a\u0004\b\u001f\u0010\u001dR\u0017\u0010!\u001a\u00020\u001a8F¢\u0006\f\u0012\u0004\b\"\u0010\u001c\u001a\u0004\b!\u0010\u001dR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010%\u001a\u0004\b#\u0010$R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001d\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\u0016¨\u0006I"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;", "Landroid/os/Parcelable;", "uid", "", "pairingCode", "", "protocolVersion", "time", "", "deviceName", "extendedDeviceInfo", "Lpowerwatch/matrix/com/pwgen2android/sdk/model/ExtendedDeviceInfo;", "connectionInfos", "", "Lpowerwatch/matrix/com/pwgen2android/sdk/model/ConnectionInfo;", "sectionInfoMap", "", "", "(Ljava/lang/String;Ljava/lang/Short;SILjava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/model/ExtendedDeviceInfo;Ljava/util/List;Ljava/util/Map;)V", "getConnectionInfos", "()Ljava/util/List;", "getDeviceName", "()Ljava/lang/String;", "getExtendedDeviceInfo", "()Lpowerwatch/matrix/com/pwgen2android/sdk/model/ExtendedDeviceInfo;", "isConnected", "", "isConnected$annotations", "()V", "()Z", "isDefault", "isGen2", "isGen2$annotations", "isGen2NewVersion", "isGen2NewVersion$annotations", "getPairingCode", "()Ljava/lang/Short;", "Ljava/lang/Short;", "getProtocolVersion", "()S", "setProtocolVersion", "(S)V", "getSectionInfoMap", "()Ljava/util/Map;", "getTime", "()I", "setTime", "(I)V", "getUid", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/Short;SILjava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/model/ExtendedDeviceInfo;Ljava/util/List;Ljava/util/Map;)Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;", "describeContents", "equals", com.google.android.gms.fitness.FitnessActivities.OTHER, "", "hashCode", "isProtocolSupported", "protocolType", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class DeviceInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo> CREATOR = new powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo.Creator();
    private final java.util.List<powerwatch.matrix.com.pwgen2android.sdk.model.ConnectionInfo> connectionInfos;
    private final java.lang.String deviceName;
    private final powerwatch.matrix.com.pwgen2android.sdk.model.ExtendedDeviceInfo extendedDeviceInfo;
    private final java.lang.Short pairingCode;
    private short protocolVersion;
    private final java.util.Map<java.lang.String, java.lang.Long> sectionInfoMap;
    private int time;
    private final java.lang.String uid;

    /* JADX INFO: compiled from: Entities.kt */
    @kotlin.Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class Creator implements android.os.Parcelable.Creator<powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo> {
        @Override // android.os.Parcelable.Creator
        public final powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo createFromParcel(android.os.Parcel parcel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "parcel");
            java.lang.String string = parcel.readString();
            java.lang.Short shValueOf = parcel.readInt() == 0 ? null : java.lang.Short.valueOf((short) parcel.readInt());
            short s = (short) parcel.readInt();
            int i = parcel.readInt();
            java.lang.String string2 = parcel.readString();
            powerwatch.matrix.com.pwgen2android.sdk.model.ExtendedDeviceInfo extendedDeviceInfoCreateFromParcel = powerwatch.matrix.com.pwgen2android.sdk.model.ExtendedDeviceInfo.CREATOR.createFromParcel(parcel);
            int i2 = parcel.readInt();
            java.util.ArrayList arrayList = new java.util.ArrayList(i2);
            for (int i3 = 0; i3 != i2; i3++) {
                arrayList.add(powerwatch.matrix.com.pwgen2android.sdk.model.ConnectionInfo.CREATOR.createFromParcel(parcel));
            }
            java.util.ArrayList arrayList2 = arrayList;
            int i4 = parcel.readInt();
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(i4);
            for (int i5 = 0; i5 != i4; i5++) {
                linkedHashMap.put(parcel.readString(), java.lang.Long.valueOf(parcel.readLong()));
            }
            return new powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo(string, shValueOf, s, i, string2, extendedDeviceInfoCreateFromParcel, arrayList2, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo[] newArray(int i) {
            return new powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo[i];
        }
    }

    public static /* synthetic */ void isConnected$annotations() {
    }

    public static /* synthetic */ void isGen2$annotations() {
    }

    public static /* synthetic */ void isGen2NewVersion$annotations() {
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final java.lang.String getUid() {
        return this.uid;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final java.lang.Short getPairingCode() {
        return this.pairingCode;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final short getProtocolVersion() {
        return this.protocolVersion;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getTime() {
        return this.time;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final java.lang.String getDeviceName() {
        return this.deviceName;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final powerwatch.matrix.com.pwgen2android.sdk.model.ExtendedDeviceInfo getExtendedDeviceInfo() {
        return this.extendedDeviceInfo;
    }

    public final java.util.List<powerwatch.matrix.com.pwgen2android.sdk.model.ConnectionInfo> component7() {
        return this.connectionInfos;
    }

    public final java.util.Map<java.lang.String, java.lang.Long> component8() {
        return this.sectionInfoMap;
    }

    public final powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo copy(java.lang.String uid, java.lang.Short pairingCode, short protocolVersion, int time, java.lang.String deviceName, powerwatch.matrix.com.pwgen2android.sdk.model.ExtendedDeviceInfo extendedDeviceInfo, java.util.List<powerwatch.matrix.com.pwgen2android.sdk.model.ConnectionInfo> connectionInfos, java.util.Map<java.lang.String, java.lang.Long> sectionInfoMap) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uid, "uid");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceName, "deviceName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(extendedDeviceInfo, "extendedDeviceInfo");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connectionInfos, "connectionInfos");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sectionInfoMap, "sectionInfoMap");
        return new powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo(uid, pairingCode, protocolVersion, time, deviceName, extendedDeviceInfo, connectionInfos, sectionInfoMap);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo)) {
            return false;
        }
        powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo deviceInfo = (powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.uid, deviceInfo.uid) && kotlin.jvm.internal.Intrinsics.areEqual(this.pairingCode, deviceInfo.pairingCode) && this.protocolVersion == deviceInfo.protocolVersion && this.time == deviceInfo.time && kotlin.jvm.internal.Intrinsics.areEqual(this.deviceName, deviceInfo.deviceName) && kotlin.jvm.internal.Intrinsics.areEqual(this.extendedDeviceInfo, deviceInfo.extendedDeviceInfo) && kotlin.jvm.internal.Intrinsics.areEqual(this.connectionInfos, deviceInfo.connectionInfos) && kotlin.jvm.internal.Intrinsics.areEqual(this.sectionInfoMap, deviceInfo.sectionInfoMap);
    }

    public int hashCode() {
        int iHashCode = this.uid.hashCode() * 31;
        java.lang.Short sh = this.pairingCode;
        return ((((((((((((iHashCode + (sh == null ? 0 : sh.hashCode())) * 31) + this.protocolVersion) * 31) + this.time) * 31) + this.deviceName.hashCode()) * 31) + this.extendedDeviceInfo.hashCode()) * 31) + this.connectionInfos.hashCode()) * 31) + this.sectionInfoMap.hashCode();
    }

    public java.lang.String toString() {
        return "DeviceInfo(uid=" + this.uid + ", pairingCode=" + this.pairingCode + ", protocolVersion=" + ((int) this.protocolVersion) + ", time=" + this.time + ", deviceName=" + this.deviceName + ", extendedDeviceInfo=" + this.extendedDeviceInfo + ", connectionInfos=" + this.connectionInfos + ", sectionInfoMap=" + this.sectionInfoMap + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int flags) {
        short sShortValue;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.uid);
        java.lang.Short sh = this.pairingCode;
        if (sh == null) {
            sShortValue = 0;
        } else {
            parcel.writeInt(1);
            sShortValue = sh.shortValue();
        }
        parcel.writeInt(sShortValue);
        parcel.writeInt(this.protocolVersion);
        parcel.writeInt(this.time);
        parcel.writeString(this.deviceName);
        this.extendedDeviceInfo.writeToParcel(parcel, flags);
        java.util.List<powerwatch.matrix.com.pwgen2android.sdk.model.ConnectionInfo> list = this.connectionInfos;
        parcel.writeInt(list.size());
        java.util.Iterator<powerwatch.matrix.com.pwgen2android.sdk.model.ConnectionInfo> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, flags);
        }
        java.util.Map<java.lang.String, java.lang.Long> map = this.sectionInfoMap;
        parcel.writeInt(map.size());
        for (java.util.Map.Entry<java.lang.String, java.lang.Long> entry : map.entrySet()) {
            parcel.writeString(entry.getKey());
            parcel.writeLong(entry.getValue().longValue());
        }
    }

    public DeviceInfo(java.lang.String uid, java.lang.Short sh, short s, int i, java.lang.String deviceName, powerwatch.matrix.com.pwgen2android.sdk.model.ExtendedDeviceInfo extendedDeviceInfo, java.util.List<powerwatch.matrix.com.pwgen2android.sdk.model.ConnectionInfo> connectionInfos, java.util.Map<java.lang.String, java.lang.Long> sectionInfoMap) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uid, "uid");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceName, "deviceName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(extendedDeviceInfo, "extendedDeviceInfo");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connectionInfos, "connectionInfos");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sectionInfoMap, "sectionInfoMap");
        this.uid = uid;
        this.pairingCode = sh;
        this.protocolVersion = s;
        this.time = i;
        this.deviceName = deviceName;
        this.extendedDeviceInfo = extendedDeviceInfo;
        this.connectionInfos = connectionInfos;
        this.sectionInfoMap = sectionInfoMap;
    }

    public final java.lang.String getUid() {
        return this.uid;
    }

    public final java.lang.Short getPairingCode() {
        return this.pairingCode;
    }

    public final short getProtocolVersion() {
        return this.protocolVersion;
    }

    public final void setProtocolVersion(short s) {
        this.protocolVersion = s;
    }

    public final int getTime() {
        return this.time;
    }

    public final void setTime(int i) {
        this.time = i;
    }

    public final java.lang.String getDeviceName() {
        return this.deviceName;
    }

    public /* synthetic */ DeviceInfo(java.lang.String str, java.lang.Short sh, short s, int i, java.lang.String str2, powerwatch.matrix.com.pwgen2android.sdk.model.ExtendedDeviceInfo extendedDeviceInfo, java.util.List list, java.util.Map map, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? null : sh, (i2 & 4) != 0 ? (short) 1 : s, (i2 & 8) != 0 ? -1 : i, str2, (i2 & 32) != 0 ? new powerwatch.matrix.com.pwgen2android.sdk.model.ExtendedDeviceInfo("") : extendedDeviceInfo, (i2 & 64) != 0 ? new java.util.ArrayList() : list, (i2 & 128) != 0 ? new java.util.LinkedHashMap() : map);
    }

    public final powerwatch.matrix.com.pwgen2android.sdk.model.ExtendedDeviceInfo getExtendedDeviceInfo() {
        return this.extendedDeviceInfo;
    }

    public final java.util.List<powerwatch.matrix.com.pwgen2android.sdk.model.ConnectionInfo> getConnectionInfos() {
        return this.connectionInfos;
    }

    public final java.util.Map<java.lang.String, java.lang.Long> getSectionInfoMap() {
        return this.sectionInfoMap;
    }

    public final boolean isConnected() {
        return !this.connectionInfos.isEmpty();
    }

    public final boolean isDefault() {
        return kotlin.jvm.internal.Intrinsics.areEqual(this.uid, "") && kotlin.jvm.internal.Intrinsics.areEqual(this.deviceName, "");
    }

    public final boolean isGen2() {
        java.util.List<powerwatch.matrix.com.pwgen2android.sdk.model.ConnectionInfo> list = this.connectionInfos;
        if (!(list instanceof java.util.Collection) || !list.isEmpty()) {
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((powerwatch.matrix.com.pwgen2android.sdk.model.ConnectionInfo) it.next()).getProtocolType() == powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolType.GEN2_STANDARD_BASICS) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean isGen2NewVersion() {
        return isGen2() && this.protocolVersion == 2;
    }

    public final boolean isProtocolSupported(powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolType protocolType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(protocolType, "protocolType");
        java.util.List<powerwatch.matrix.com.pwgen2android.sdk.model.ConnectionInfo> list = this.connectionInfos;
        if (!(list instanceof java.util.Collection) || !list.isEmpty()) {
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((powerwatch.matrix.com.pwgen2android.sdk.model.ConnectionInfo) it.next()).getProtocolType() == protocolType) {
                    return true;
                }
            }
        }
        return false;
    }
}
