package com.polidea.rxandroidble2.internal.logger;

/* JADX INFO: loaded from: classes2.dex */
public final class LoggerUtilBluetoothServices_Factory implements bleshadow.dagger.internal.Factory<com.polidea.rxandroidble2.internal.logger.LoggerUtilBluetoothServices> {
    private final bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.util.CharacteristicPropertiesParser> characteristicPropertiesParserProvider;

    public LoggerUtilBluetoothServices_Factory(bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.util.CharacteristicPropertiesParser> provider) {
        this.characteristicPropertiesParserProvider = provider;
    }

    @Override // bleshadow.javax.inject.Provider
    public com.polidea.rxandroidble2.internal.logger.LoggerUtilBluetoothServices get() {
        return new com.polidea.rxandroidble2.internal.logger.LoggerUtilBluetoothServices(this.characteristicPropertiesParserProvider.get());
    }

    public static com.polidea.rxandroidble2.internal.logger.LoggerUtilBluetoothServices_Factory create(bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.util.CharacteristicPropertiesParser> provider) {
        return new com.polidea.rxandroidble2.internal.logger.LoggerUtilBluetoothServices_Factory(provider);
    }

    public static com.polidea.rxandroidble2.internal.logger.LoggerUtilBluetoothServices newLoggerUtilBluetoothServices(com.polidea.rxandroidble2.internal.util.CharacteristicPropertiesParser characteristicPropertiesParser) {
        return new com.polidea.rxandroidble2.internal.logger.LoggerUtilBluetoothServices(characteristicPropertiesParser);
    }
}
