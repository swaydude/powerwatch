package powerwatch.matrix.com.pwgen2android.sdk.protocol.commands;

/* JADX INFO: compiled from: Gen2SendUserLocationCommand.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SendUserLocationCommand;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2AbstractCommand;", "gpsPosition", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GPSPosition;", "(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GPSPosition;)V", "getGpsPosition", "()Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GPSPosition;", "createPayload", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class Gen2SendUserLocationCommand extends powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2AbstractCommand {
    private final powerwatch.matrix.com.pwgen2android.shared.data.models.GPSPosition gpsPosition;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Gen2SendUserLocationCommand(powerwatch.matrix.com.pwgen2android.shared.data.models.GPSPosition gpsPosition) {
        super(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2CommandIDs.Gen2SendUserLocationCommand.INSTANCE);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gpsPosition, "gpsPosition");
        this.gpsPosition = gpsPosition;
    }

    public final powerwatch.matrix.com.pwgen2android.shared.data.models.GPSPosition getGpsPosition() {
        return this.gpsPosition;
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2AbstractCommand, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2Command
    public byte[] createPayload() {
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis() / ((long) 1000);
        java.nio.ByteBuffer byteBufferOrder = java.nio.ByteBuffer.allocate(16).order(java.nio.ByteOrder.BIG_ENDIAN);
        byteBufferOrder.putInt((int) jCurrentTimeMillis);
        double d = 10.0f;
        double d2 = 7;
        byteBufferOrder.putInt((int) (this.gpsPosition.getLatitude() * ((double) ((float) java.lang.Math.pow(d, d2)))));
        byteBufferOrder.putInt((int) (this.gpsPosition.getLongitude() * ((double) ((float) java.lang.Math.pow(d, d2)))));
        byteBufferOrder.putInt((int) (this.gpsPosition.getAltitude() * ((double) 100)));
        byte[] bArrArray = byteBufferOrder.array();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bArrArray, "dataBuffer.array()");
        return bArrArray;
    }
}
