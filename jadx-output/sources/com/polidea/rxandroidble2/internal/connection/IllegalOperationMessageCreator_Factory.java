package com.polidea.rxandroidble2.internal.connection;

/* JADX INFO: loaded from: classes2.dex */
public final class IllegalOperationMessageCreator_Factory implements bleshadow.dagger.internal.Factory<com.polidea.rxandroidble2.internal.connection.IllegalOperationMessageCreator> {
    private final bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.util.CharacteristicPropertiesParser> propertiesParserProvider;

    public IllegalOperationMessageCreator_Factory(bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.util.CharacteristicPropertiesParser> provider) {
        this.propertiesParserProvider = provider;
    }

    @Override // bleshadow.javax.inject.Provider
    public com.polidea.rxandroidble2.internal.connection.IllegalOperationMessageCreator get() {
        return new com.polidea.rxandroidble2.internal.connection.IllegalOperationMessageCreator(this.propertiesParserProvider.get());
    }

    public static com.polidea.rxandroidble2.internal.connection.IllegalOperationMessageCreator_Factory create(bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.util.CharacteristicPropertiesParser> provider) {
        return new com.polidea.rxandroidble2.internal.connection.IllegalOperationMessageCreator_Factory(provider);
    }
}
