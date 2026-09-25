package powerwatch.matrix.com.pwgen2android.sdk.channels;

/* JADX INFO: compiled from: CommunicationChannel.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CharacteristicType;", "", "(Ljava/lang/String;I)V", "FIRMWARE", "SERIAL", "HEART_RATE", "SETTINGS_INFO", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public enum CharacteristicType {
    FIRMWARE,
    SERIAL,
    HEART_RATE,
    SETTINGS_INFO;

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static powerwatch.matrix.com.pwgen2android.sdk.channels.CharacteristicType[] valuesCustom() {
        powerwatch.matrix.com.pwgen2android.sdk.channels.CharacteristicType[] characteristicTypeArrValuesCustom = values();
        return (powerwatch.matrix.com.pwgen2android.sdk.channels.CharacteristicType[]) java.util.Arrays.copyOf(characteristicTypeArrValuesCustom, characteristicTypeArrValuesCustom.length);
    }
}
