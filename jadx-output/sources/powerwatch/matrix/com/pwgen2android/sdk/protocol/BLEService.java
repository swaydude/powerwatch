package powerwatch.matrix.com.pwgen2android.sdk.protocol;

/* JADX INFO: compiled from: BLEServices.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u000b\f\rB\u001d\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0002\u0010\u0006R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u0082\u0001\u0003\u000e\u000f\u0010¨\u0006\u0011"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/BLEService;", "", androidx.core.app.NotificationCompat.CATEGORY_SERVICE, "Ljava/util/UUID;", "chars", "", "(Ljava/util/UUID;Ljava/util/Set;)V", "getChars", "()Ljava/util/Set;", "getService", "()Ljava/util/UUID;", "DtpService", "DtpServicePWX", "OtaService", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/BLEService$DtpService;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/BLEService$DtpServicePWX;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/BLEService$OtaService;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public abstract class BLEService {
    private final java.util.Set<java.util.UUID> chars;
    private final java.util.UUID service;

    public /* synthetic */ BLEService(java.util.UUID uuid, java.util.Set set, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(uuid, set);
    }

    /* JADX INFO: compiled from: BLEServices.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/BLEService$DtpService;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/BLEService;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class DtpService extends powerwatch.matrix.com.pwgen2android.sdk.protocol.BLEService {
        public static final powerwatch.matrix.com.pwgen2android.sdk.protocol.BLEService.DtpService INSTANCE = new powerwatch.matrix.com.pwgen2android.sdk.protocol.BLEService.DtpService();

        /* JADX WARN: Illegal instructions before constructor call */
        private DtpService() {
            java.util.UUID uuidFromString = java.util.UUID.fromString(powerwatch.matrix.com.pwgen2android.sdk.protocol.BLEServicesKt.DTP_SERVICE);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(uuidFromString, "fromString(DTP_SERVICE)");
            java.util.UUID uuidFromString2 = java.util.UUID.fromString(powerwatch.matrix.com.pwgen2android.sdk.protocol.BLEServicesKt.BASIC_DTP_SERVICE_RX);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(uuidFromString2, "fromString(BASIC_DTP_SERVICE_RX)");
            java.util.UUID uuidFromString3 = java.util.UUID.fromString(powerwatch.matrix.com.pwgen2android.sdk.protocol.BLEServicesKt.BASIC_DTP_SERVICE_TX);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(uuidFromString3, "fromString(BASIC_DTP_SERVICE_TX)");
            super(uuidFromString, kotlin.collections.SetsKt.setOf((java.lang.Object[]) new java.util.UUID[]{uuidFromString2, uuidFromString3}), null);
        }
    }

    private BLEService(java.util.UUID uuid, java.util.Set<java.util.UUID> set) {
        this.service = uuid;
        this.chars = set;
    }

    public final java.util.Set<java.util.UUID> getChars() {
        return this.chars;
    }

    public final java.util.UUID getService() {
        return this.service;
    }

    /* JADX INFO: compiled from: BLEServices.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/BLEService$DtpServicePWX;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/BLEService;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class DtpServicePWX extends powerwatch.matrix.com.pwgen2android.sdk.protocol.BLEService {
        public static final powerwatch.matrix.com.pwgen2android.sdk.protocol.BLEService.DtpServicePWX INSTANCE = new powerwatch.matrix.com.pwgen2android.sdk.protocol.BLEService.DtpServicePWX();

        /* JADX WARN: Illegal instructions before constructor call */
        private DtpServicePWX() {
            java.util.UUID uuidFromString = java.util.UUID.fromString(powerwatch.matrix.com.pwgen2android.sdk.protocol.BLEServicesKt.DTP_SERVICE);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(uuidFromString, "fromString(DTP_SERVICE)");
            java.util.UUID uuidFromString2 = java.util.UUID.fromString(powerwatch.matrix.com.pwgen2android.sdk.protocol.BLEServicesKt.BASIC_DTP_SERVICE_PWX_RX);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(uuidFromString2, "fromString(BASIC_DTP_SERVICE_PWX_RX)");
            java.util.UUID uuidFromString3 = java.util.UUID.fromString(powerwatch.matrix.com.pwgen2android.sdk.protocol.BLEServicesKt.BASIC_DTP_SERVICE_TX);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(uuidFromString3, "fromString(BASIC_DTP_SERVICE_TX)");
            super(uuidFromString, kotlin.collections.SetsKt.setOf((java.lang.Object[]) new java.util.UUID[]{uuidFromString2, uuidFromString3}), null);
        }
    }

    /* JADX INFO: compiled from: BLEServices.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/BLEService$OtaService;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/BLEService;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class OtaService extends powerwatch.matrix.com.pwgen2android.sdk.protocol.BLEService {
        public static final powerwatch.matrix.com.pwgen2android.sdk.protocol.BLEService.OtaService INSTANCE = new powerwatch.matrix.com.pwgen2android.sdk.protocol.BLEService.OtaService();

        /* JADX WARN: Illegal instructions before constructor call */
        private OtaService() {
            java.util.UUID uuidFromString = java.util.UUID.fromString(powerwatch.matrix.com.pwgen2android.sdk.protocol.BLEServicesKt.OTA_SERVICE);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(uuidFromString, "fromString(OTA_SERVICE)");
            java.util.UUID uuidFromString2 = java.util.UUID.fromString(powerwatch.matrix.com.pwgen2android.sdk.protocol.BLEServicesKt.BASIC_OTA_SERVICE_RX);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(uuidFromString2, "fromString(BASIC_OTA_SERVICE_RX)");
            java.util.UUID uuidFromString3 = java.util.UUID.fromString(powerwatch.matrix.com.pwgen2android.sdk.protocol.BLEServicesKt.BASIC_OTA_SERVICE_TX);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(uuidFromString3, "fromString(BASIC_OTA_SERVICE_TX)");
            super(uuidFromString, kotlin.collections.SetsKt.setOf((java.lang.Object[]) new java.util.UUID[]{uuidFromString2, uuidFromString3}), null);
        }
    }
}
