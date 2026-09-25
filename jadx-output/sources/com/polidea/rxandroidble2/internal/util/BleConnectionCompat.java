package com.polidea.rxandroidble2.internal.util;

/* JADX INFO: loaded from: classes2.dex */
public class BleConnectionCompat {
    private final android.content.Context context;

    @bleshadow.javax.inject.Inject
    public BleConnectionCompat(android.content.Context context) {
        this.context = context;
    }

    public android.bluetooth.BluetoothGatt connectGatt(android.bluetooth.BluetoothDevice bluetoothDevice, boolean z, android.bluetooth.BluetoothGattCallback bluetoothGattCallback) {
        if (bluetoothDevice == null) {
            return null;
        }
        if (android.os.Build.VERSION.SDK_INT >= 24 || !z) {
            return connectGattCompat(bluetoothGattCallback, bluetoothDevice, z);
        }
        try {
            com.polidea.rxandroidble2.internal.RxBleLog.v("Trying to connectGatt using reflection.", new java.lang.Object[0]);
            java.lang.Object iBluetoothGatt = getIBluetoothGatt(getIBluetoothManager());
            if (iBluetoothGatt == null) {
                com.polidea.rxandroidble2.internal.RxBleLog.w("Couldn't get iBluetoothGatt object", new java.lang.Object[0]);
                return connectGattCompat(bluetoothGattCallback, bluetoothDevice, true);
            }
            android.bluetooth.BluetoothGatt bluetoothGattCreateBluetoothGatt = createBluetoothGatt(iBluetoothGatt, bluetoothDevice);
            if (bluetoothGattCreateBluetoothGatt == null) {
                com.polidea.rxandroidble2.internal.RxBleLog.w("Couldn't create BluetoothGatt object", new java.lang.Object[0]);
                return connectGattCompat(bluetoothGattCallback, bluetoothDevice, true);
            }
            if (!connectUsingReflection(bluetoothGattCreateBluetoothGatt, bluetoothGattCallback, true)) {
                com.polidea.rxandroidble2.internal.RxBleLog.w("Connection using reflection failed, closing gatt", new java.lang.Object[0]);
                bluetoothGattCreateBluetoothGatt.close();
            }
            return bluetoothGattCreateBluetoothGatt;
        } catch (java.lang.IllegalAccessException | java.lang.IllegalArgumentException | java.lang.InstantiationException | java.lang.NoSuchFieldException | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException e) {
            com.polidea.rxandroidble2.internal.RxBleLog.w(e, "Error while trying to connect via reflection", new java.lang.Object[0]);
            return connectGattCompat(bluetoothGattCallback, bluetoothDevice, true);
        }
    }

    private android.bluetooth.BluetoothGatt connectGattCompat(android.bluetooth.BluetoothGattCallback bluetoothGattCallback, android.bluetooth.BluetoothDevice bluetoothDevice, boolean z) {
        com.polidea.rxandroidble2.internal.RxBleLog.v("Connecting without reflection", new java.lang.Object[0]);
        if (android.os.Build.VERSION.SDK_INT >= 23) {
            return bluetoothDevice.connectGatt(this.context, z, bluetoothGattCallback, 2);
        }
        return bluetoothDevice.connectGatt(this.context, z, bluetoothGattCallback);
    }

    private boolean connectUsingReflection(android.bluetooth.BluetoothGatt bluetoothGatt, android.bluetooth.BluetoothGattCallback bluetoothGattCallback, boolean z) throws java.lang.IllegalAccessException, java.lang.NoSuchFieldException, java.lang.NoSuchMethodException, java.lang.reflect.InvocationTargetException {
        com.polidea.rxandroidble2.internal.RxBleLog.v("Connecting using reflection", new java.lang.Object[0]);
        setAutoConnectValue(bluetoothGatt, z);
        java.lang.reflect.Method declaredMethod = bluetoothGatt.getClass().getDeclaredMethod("connect", java.lang.Boolean.class, android.bluetooth.BluetoothGattCallback.class);
        declaredMethod.setAccessible(true);
        return ((java.lang.Boolean) declaredMethod.invoke(bluetoothGatt, true, bluetoothGattCallback)).booleanValue();
    }

    private android.bluetooth.BluetoothGatt createBluetoothGatt(java.lang.Object obj, android.bluetooth.BluetoothDevice bluetoothDevice) throws java.lang.IllegalAccessException, java.lang.InstantiationException, java.lang.reflect.InvocationTargetException {
        java.lang.reflect.Constructor<?> constructor = android.bluetooth.BluetoothGatt.class.getDeclaredConstructors()[0];
        constructor.setAccessible(true);
        com.polidea.rxandroidble2.internal.RxBleLog.v("Found constructor with args count = " + constructor.getParameterTypes().length, new java.lang.Object[0]);
        return constructor.getParameterTypes().length == 4 ? (android.bluetooth.BluetoothGatt) constructor.newInstance(this.context, obj, bluetoothDevice, 2) : (android.bluetooth.BluetoothGatt) constructor.newInstance(this.context, obj, bluetoothDevice);
    }

    private java.lang.Object getIBluetoothGatt(java.lang.Object obj) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.reflect.InvocationTargetException {
        if (obj == null) {
            return null;
        }
        return getMethodFromClass(obj.getClass(), "getBluetoothGatt").invoke(obj, new java.lang.Object[0]);
    }

    private java.lang.Object getIBluetoothManager() throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.reflect.InvocationTargetException {
        android.bluetooth.BluetoothAdapter defaultAdapter = android.bluetooth.BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter == null) {
            return null;
        }
        return getMethodFromClass(defaultAdapter.getClass(), "getBluetoothManager").invoke(defaultAdapter, new java.lang.Object[0]);
    }

    private java.lang.reflect.Method getMethodFromClass(java.lang.Class<?> cls, java.lang.String str) throws java.lang.NoSuchMethodException {
        java.lang.reflect.Method declaredMethod = cls.getDeclaredMethod(str, new java.lang.Class[0]);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    private void setAutoConnectValue(android.bluetooth.BluetoothGatt bluetoothGatt, boolean z) throws java.lang.IllegalAccessException, java.lang.NoSuchFieldException {
        java.lang.reflect.Field declaredField = bluetoothGatt.getClass().getDeclaredField("mAutoConnect");
        declaredField.setAccessible(true);
        declaredField.setBoolean(bluetoothGatt, z);
    }
}
