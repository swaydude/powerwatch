package powerwatch.matrix.com.pwgen2android.sdk.communicator;

/* JADX INFO: loaded from: classes2.dex */
public class UnpairController {
    public static void unPairDevice(java.lang.String deviceAddress) {
        android.bluetooth.BluetoothDevice remoteDevice = android.bluetooth.BluetoothAdapter.getDefaultAdapter().getRemoteDevice(deviceAddress);
        if (remoteDevice != null) {
            try {
                remoteDevice.getClass().getMethod("removeBond", (java.lang.Class[]) null).invoke(remoteDevice, (java.lang.Object[]) null);
            } catch (java.lang.IllegalAccessException | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException e) {
                e.printStackTrace();
            }
        }
    }
}
