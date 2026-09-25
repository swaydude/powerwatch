package powerwatch.matrix.com.pwgen2android.sdk.model;

/* JADX INFO: compiled from: Entities.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\b\u001a\u00020\tHÖ\u0001J\u0019\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tHÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u000f"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/model/ExtendedDeviceInfo;", "Landroid/os/Parcelable;", "firmwareVersion", "", "(Ljava/lang/String;)V", "getFirmwareVersion", "()Ljava/lang/String;", "setFirmwareVersion", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class ExtendedDeviceInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<powerwatch.matrix.com.pwgen2android.sdk.model.ExtendedDeviceInfo> CREATOR = new powerwatch.matrix.com.pwgen2android.sdk.model.ExtendedDeviceInfo.Creator();
    private java.lang.String firmwareVersion;

    /* JADX INFO: compiled from: Entities.kt */
    @kotlin.Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class Creator implements android.os.Parcelable.Creator<powerwatch.matrix.com.pwgen2android.sdk.model.ExtendedDeviceInfo> {
        @Override // android.os.Parcelable.Creator
        public final powerwatch.matrix.com.pwgen2android.sdk.model.ExtendedDeviceInfo createFromParcel(android.os.Parcel parcel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new powerwatch.matrix.com.pwgen2android.sdk.model.ExtendedDeviceInfo(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final powerwatch.matrix.com.pwgen2android.sdk.model.ExtendedDeviceInfo[] newArray(int i) {
            return new powerwatch.matrix.com.pwgen2android.sdk.model.ExtendedDeviceInfo[i];
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int flags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.firmwareVersion);
    }

    public ExtendedDeviceInfo(java.lang.String firmwareVersion) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(firmwareVersion, "firmwareVersion");
        this.firmwareVersion = firmwareVersion;
    }

    public final java.lang.String getFirmwareVersion() {
        return this.firmwareVersion;
    }

    public final void setFirmwareVersion(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.firmwareVersion = str;
    }
}
