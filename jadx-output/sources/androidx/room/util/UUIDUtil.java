package androidx.room.util;

/* JADX INFO: loaded from: classes.dex */
public final class UUIDUtil {
    private UUIDUtil() {
    }

    public static java.util.UUID convertByteToUUID(byte[] bArr) {
        java.nio.ByteBuffer byteBufferWrap = java.nio.ByteBuffer.wrap(bArr);
        return new java.util.UUID(byteBufferWrap.getLong(), byteBufferWrap.getLong());
    }

    public static byte[] convertUUIDToByte(java.util.UUID uuid) {
        java.nio.ByteBuffer byteBufferWrap = java.nio.ByteBuffer.wrap(new byte[16]);
        byteBufferWrap.putLong(uuid.getMostSignificantBits());
        byteBufferWrap.putLong(uuid.getLeastSignificantBits());
        return byteBufferWrap.array();
    }
}
