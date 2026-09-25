package powerwatch.matrix.com.pwgen2android.shared.extensions;

/* JADX INFO: compiled from: BluetoothExtensions.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u001a\n\u0010\u0005\u001a\u00020\u0004*\u00020\u0006\u001a\n\u0010\u0007\u001a\u00020\u0004*\u00020\b\u001a\u0010\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n*\u00020\u000b¨\u0006\f"}, d2 = {"formatToString", "", "", "useSpace", "", "isBluetoothPermissionGranted", "Landroid/content/Context;", "isPowerWatchDevice", "Landroid/bluetooth/BluetoothDevice;", "powerWatchDevices", "", "Landroid/bluetooth/BluetoothAdapter;", "app_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
public final class BluetoothExtensionsKt {
    public static final boolean isPowerWatchDevice(android.bluetooth.BluetoothDevice bluetoothDevice) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bluetoothDevice, "<this>");
        return bluetoothDevice.getName() != null && (kotlin.jvm.internal.Intrinsics.areEqual(bluetoothDevice.getName(), "PowerWatch") || kotlin.jvm.internal.Intrinsics.areEqual(bluetoothDevice.getName(), "Powerwatch") || kotlin.jvm.internal.Intrinsics.areEqual(bluetoothDevice.getName(), "powerwatch") || kotlin.jvm.internal.Intrinsics.areEqual(bluetoothDevice.getName(), "PW_X"));
    }

    public static final java.util.List<android.bluetooth.BluetoothDevice> powerWatchDevices(android.bluetooth.BluetoothAdapter bluetoothAdapter) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bluetoothAdapter, "<this>");
        java.util.Set<android.bluetooth.BluetoothDevice> bondedDevices = bluetoothAdapter.getBondedDevices();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bondedDevices, "this.bondedDevices");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : bondedDevices) {
            android.bluetooth.BluetoothDevice it = (android.bluetooth.BluetoothDevice) obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(it, "it");
            if (isPowerWatchDevice(it)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static /* synthetic */ java.lang.String formatToString$default(byte[] bArr, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return formatToString(bArr, z);
    }

    public static final java.lang.String formatToString(byte[] bArr, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "<this>");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.String str = z ? "%02X " : "%02X";
        int length = bArr.length;
        int i = 0;
        while (i < length) {
            byte b = bArr[i];
            i++;
            kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
            java.lang.String str2 = java.lang.String.format(str, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Byte.valueOf(b)}, 1));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "java.lang.String.format(format, *args)");
            sb.append(str2);
        }
        java.lang.String string = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "builder.toString()");
        return string;
    }

    public static final boolean isBluetoothPermissionGranted(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "<this>");
        return android.os.Build.VERSION.SDK_INT < 31 || (android.os.Build.VERSION.SDK_INT >= 31 && context.checkSelfPermission("android.permission.BLUETOOTH_CONNECT") == 0 && context.checkSelfPermission("android.permission.BLUETOOTH_SCAN") == 0);
    }
}
