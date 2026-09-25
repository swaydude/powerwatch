package powerwatch.matrix.com.pwgen2android.sdk.protocol.commands;

/* JADX INFO: compiled from: UserInfoCommands.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SendLanguageCommand;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2AbstractCommand;", "locale", "Ljava/util/Locale;", "(Ljava/util/Locale;)V", "createPayload", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class Gen2SendLanguageCommand extends powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2AbstractCommand {
    private final java.util.Locale locale;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Gen2SendLanguageCommand(java.util.Locale locale) {
        super(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2CommandIDs.Gen2SendLanguageCommandId.INSTANCE);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(locale, "locale");
        this.locale = locale;
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2AbstractCommand, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2Command
    public byte[] createPayload() {
        powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.LocaleCommandValue.English english;
        java.util.Locale locale = this.locale;
        if (kotlin.jvm.internal.Intrinsics.areEqual(locale, powerwatch.matrix.com.pwgen2android.utils.LanguageControllerImpl.Companion.LanguageLocale.English.INSTANCE.getLocale())) {
            english = powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.LocaleCommandValue.English.INSTANCE;
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(locale, powerwatch.matrix.com.pwgen2android.utils.LanguageControllerImpl.Companion.LanguageLocale.French.INSTANCE.getLocale())) {
            english = powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.LocaleCommandValue.French.INSTANCE;
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(locale, powerwatch.matrix.com.pwgen2android.utils.LanguageControllerImpl.Companion.LanguageLocale.German.INSTANCE.getLocale())) {
            english = powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.LocaleCommandValue.German.INSTANCE;
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(locale, powerwatch.matrix.com.pwgen2android.utils.LanguageControllerImpl.Companion.LanguageLocale.Japanese.INSTANCE.getLocale())) {
            english = powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.LocaleCommandValue.Japanese.INSTANCE;
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(locale, powerwatch.matrix.com.pwgen2android.utils.LanguageControllerImpl.Companion.LanguageLocale.Korean.INSTANCE.getLocale())) {
            english = powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.LocaleCommandValue.Korean.INSTANCE;
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(locale, powerwatch.matrix.com.pwgen2android.utils.LanguageControllerImpl.Companion.LanguageLocale.SimplifiedChinese.INSTANCE.getLocale())) {
            english = powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.LocaleCommandValue.SimplifiedChinese.INSTANCE;
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(locale, powerwatch.matrix.com.pwgen2android.utils.LanguageControllerImpl.Companion.LanguageLocale.TraditionalChinese.INSTANCE.getLocale())) {
            english = powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.LocaleCommandValue.TraditionalChinese.INSTANCE;
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(locale, powerwatch.matrix.com.pwgen2android.utils.LanguageControllerImpl.Companion.LanguageLocale.Italian.INSTANCE.getLocale())) {
            english = powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.LocaleCommandValue.Italian.INSTANCE;
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(locale, powerwatch.matrix.com.pwgen2android.utils.LanguageControllerImpl.Companion.LanguageLocale.Spanish.INSTANCE.getLocale())) {
            english = powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.LocaleCommandValue.Spanish.INSTANCE;
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(locale, powerwatch.matrix.com.pwgen2android.utils.LanguageControllerImpl.Companion.LanguageLocale.Portugal.INSTANCE.getLocale())) {
            english = powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.LocaleCommandValue.Portugal.INSTANCE;
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(locale, powerwatch.matrix.com.pwgen2android.utils.LanguageControllerImpl.Companion.LanguageLocale.Russian.INSTANCE.getLocale())) {
            english = powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.LocaleCommandValue.Russian.INSTANCE;
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(locale, powerwatch.matrix.com.pwgen2android.utils.LanguageControllerImpl.Companion.LanguageLocale.Czech.INSTANCE.getLocale())) {
            english = powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.LocaleCommandValue.Czech.INSTANCE;
        } else {
            english = kotlin.jvm.internal.Intrinsics.areEqual(locale, powerwatch.matrix.com.pwgen2android.utils.LanguageControllerImpl.Companion.LanguageLocale.Polish.INSTANCE.getLocale()) ? powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.LocaleCommandValue.Polish.INSTANCE : powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.LocaleCommandValue.English.INSTANCE;
        }
        java.nio.ByteBuffer byteBufferAllocate = java.nio.ByteBuffer.allocate(1);
        byteBufferAllocate.order(java.nio.ByteOrder.BIG_ENDIAN).put((byte) english.getValue());
        byte[] bArrArray = byteBufferAllocate.array();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bArrArray, "dataBuffer.array()");
        return bArrArray;
    }
}
