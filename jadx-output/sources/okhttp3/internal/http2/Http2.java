package okhttp3.internal.http2;

/* JADX INFO: loaded from: classes2.dex */
public final class Http2 {
    static final byte FLAG_ACK = 1;
    static final byte FLAG_COMPRESSED = 32;
    static final byte FLAG_END_HEADERS = 4;
    static final byte FLAG_END_PUSH_PROMISE = 4;
    static final byte FLAG_END_STREAM = 1;
    static final byte FLAG_NONE = 0;
    static final byte FLAG_PADDED = 8;
    static final byte FLAG_PRIORITY = 32;
    static final int INITIAL_MAX_FRAME_SIZE = 16384;
    static final byte TYPE_CONTINUATION = 9;
    static final byte TYPE_DATA = 0;
    static final byte TYPE_GOAWAY = 7;
    static final byte TYPE_HEADERS = 1;
    static final byte TYPE_PING = 6;
    static final byte TYPE_PRIORITY = 2;
    static final byte TYPE_PUSH_PROMISE = 5;
    static final byte TYPE_RST_STREAM = 3;
    static final byte TYPE_SETTINGS = 4;
    static final byte TYPE_WINDOW_UPDATE = 8;
    static final okio.ByteString CONNECTION_PREFACE = okio.ByteString.encodeUtf8("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
    private static final java.lang.String[] FRAME_NAMES = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
    static final java.lang.String[] FLAGS = new java.lang.String[64];
    static final java.lang.String[] BINARY = new java.lang.String[256];

    static {
        int i = 0;
        int i2 = 0;
        while (true) {
            java.lang.String[] strArr = BINARY;
            if (i2 >= strArr.length) {
                break;
            }
            strArr[i2] = okhttp3.internal.Util.format("%8s", java.lang.Integer.toBinaryString(i2)).replace(' ', '0');
            i2++;
        }
        java.lang.String[] strArr2 = FLAGS;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        for (int i3 = 0; i3 < 1; i3++) {
            int i4 = iArr[i3];
            java.lang.String[] strArr3 = FLAGS;
            strArr3[i4 | 8] = strArr3[i4] + "|PADDED";
        }
        java.lang.String[] strArr4 = FLAGS;
        strArr4[4] = "END_HEADERS";
        strArr4[32] = "PRIORITY";
        strArr4[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i5 = 0; i5 < 3; i5++) {
            int i6 = iArr2[i5];
            for (int i7 = 0; i7 < 1; i7++) {
                int i8 = iArr[i7];
                java.lang.String[] strArr5 = FLAGS;
                int i9 = i8 | i6;
                strArr5[i9] = strArr5[i8] + '|' + strArr5[i6];
                strArr5[i9 | 8] = strArr5[i8] + '|' + strArr5[i6] + "|PADDED";
            }
        }
        while (true) {
            java.lang.String[] strArr6 = FLAGS;
            if (i >= strArr6.length) {
                return;
            }
            if (strArr6[i] == null) {
                strArr6[i] = BINARY[i];
            }
            i++;
        }
    }

    private Http2() {
    }

    static java.lang.IllegalArgumentException illegalArgument(java.lang.String str, java.lang.Object... objArr) {
        throw new java.lang.IllegalArgumentException(okhttp3.internal.Util.format(str, objArr));
    }

    static java.io.IOException ioException(java.lang.String str, java.lang.Object... objArr) throws java.io.IOException {
        throw new java.io.IOException(okhttp3.internal.Util.format(str, objArr));
    }

    static java.lang.String frameLog(boolean z, int i, int i2, byte b, byte b2) {
        java.lang.String[] strArr = FRAME_NAMES;
        java.lang.String str = b < strArr.length ? strArr[b] : okhttp3.internal.Util.format("0x%02x", java.lang.Byte.valueOf(b));
        java.lang.String flags = formatFlags(b, b2);
        java.lang.Object[] objArr = new java.lang.Object[5];
        objArr[0] = z ? "<<" : ">>";
        objArr[1] = java.lang.Integer.valueOf(i);
        objArr[2] = java.lang.Integer.valueOf(i2);
        objArr[3] = str;
        objArr[4] = flags;
        return okhttp3.internal.Util.format("%s 0x%08x %5d %-13s %s", objArr);
    }

    static java.lang.String formatFlags(byte b, byte b2) {
        if (b2 == 0) {
            return "";
        }
        if (b != 2 && b != 3) {
            if (b == 4 || b == 6) {
                return b2 == 1 ? "ACK" : BINARY[b2];
            }
            if (b != 7 && b != 8) {
                java.lang.String[] strArr = FLAGS;
                java.lang.String str = b2 < strArr.length ? strArr[b2] : BINARY[b2];
                if (b != 5 || (b2 & 4) == 0) {
                    return (b != 0 || (b2 & 32) == 0) ? str : str.replace("PRIORITY", "COMPRESSED");
                }
                return str.replace("HEADERS", "PUSH_PROMISE");
            }
        }
        return BINARY[b2];
    }
}
