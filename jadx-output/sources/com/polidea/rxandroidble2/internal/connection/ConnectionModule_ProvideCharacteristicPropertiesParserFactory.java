package com.polidea.rxandroidble2.internal.connection;

/* JADX INFO: loaded from: classes2.dex */
public final class ConnectionModule_ProvideCharacteristicPropertiesParserFactory implements bleshadow.dagger.internal.Factory<com.polidea.rxandroidble2.internal.util.CharacteristicPropertiesParser> {
    private static final com.polidea.rxandroidble2.internal.connection.ConnectionModule_ProvideCharacteristicPropertiesParserFactory INSTANCE = new com.polidea.rxandroidble2.internal.connection.ConnectionModule_ProvideCharacteristicPropertiesParserFactory();

    @Override // bleshadow.javax.inject.Provider
    public com.polidea.rxandroidble2.internal.util.CharacteristicPropertiesParser get() {
        return (com.polidea.rxandroidble2.internal.util.CharacteristicPropertiesParser) bleshadow.dagger.internal.Preconditions.checkNotNull(com.polidea.rxandroidble2.internal.connection.ConnectionModule.provideCharacteristicPropertiesParser(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static com.polidea.rxandroidble2.internal.connection.ConnectionModule_ProvideCharacteristicPropertiesParserFactory create() {
        return INSTANCE;
    }

    public static com.polidea.rxandroidble2.internal.util.CharacteristicPropertiesParser proxyProvideCharacteristicPropertiesParser() {
        return (com.polidea.rxandroidble2.internal.util.CharacteristicPropertiesParser) bleshadow.dagger.internal.Preconditions.checkNotNull(com.polidea.rxandroidble2.internal.connection.ConnectionModule.provideCharacteristicPropertiesParser(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
