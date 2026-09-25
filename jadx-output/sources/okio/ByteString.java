package okio;

/* JADX INFO: loaded from: classes2.dex */
public class ByteString implements java.io.Serializable, java.lang.Comparable<okio.ByteString> {
    private static final long serialVersionUID = 1;
    final byte[] data;
    transient int hashCode;
    transient java.lang.String utf8;
    static final char[] HEX_DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final okio.ByteString EMPTY = of(new byte[0]);

    ByteString(byte[] bArr) {
        this.data = bArr;
    }

    public static okio.ByteString of(byte... bArr) {
        if (bArr == null) {
            throw new java.lang.IllegalArgumentException("data == null");
        }
        return new okio.ByteString((byte[]) bArr.clone());
    }

    public static okio.ByteString of(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw new java.lang.IllegalArgumentException("data == null");
        }
        okio.Util.checkOffsetAndCount(bArr.length, i, i2);
        byte[] bArr2 = new byte[i2];
        java.lang.System.arraycopy(bArr, i, bArr2, 0, i2);
        return new okio.ByteString(bArr2);
    }

    public static okio.ByteString of(java.nio.ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            throw new java.lang.IllegalArgumentException("data == null");
        }
        byte[] bArr = new byte[byteBuffer.remaining()];
        byteBuffer.get(bArr);
        return new okio.ByteString(bArr);
    }

    public static okio.ByteString encodeUtf8(java.lang.String str) {
        if (str == null) {
            throw new java.lang.IllegalArgumentException("s == null");
        }
        okio.ByteString byteString = new okio.ByteString(str.getBytes(okio.Util.UTF_8));
        byteString.utf8 = str;
        return byteString;
    }

    public static okio.ByteString encodeString(java.lang.String str, java.nio.charset.Charset charset) {
        if (str == null) {
            throw new java.lang.IllegalArgumentException("s == null");
        }
        if (charset == null) {
            throw new java.lang.IllegalArgumentException("charset == null");
        }
        return new okio.ByteString(str.getBytes(charset));
    }

    public java.lang.String utf8() {
        java.lang.String str = this.utf8;
        if (str != null) {
            return str;
        }
        java.lang.String str2 = new java.lang.String(this.data, okio.Util.UTF_8);
        this.utf8 = str2;
        return str2;
    }

    public java.lang.String string(java.nio.charset.Charset charset) {
        if (charset == null) {
            throw new java.lang.IllegalArgumentException("charset == null");
        }
        return new java.lang.String(this.data, charset);
    }

    public java.lang.String base64() {
        return okio.Base64.encode(this.data);
    }

    public okio.ByteString md5() {
        return digest("MD5");
    }

    public okio.ByteString sha1() {
        return digest(io.fabric.sdk.android.services.common.CommonUtils.SHA1_INSTANCE);
    }

    public okio.ByteString sha256() {
        return digest(io.fabric.sdk.android.services.common.CommonUtils.SHA256_INSTANCE);
    }

    public okio.ByteString sha512() {
        return digest("SHA-512");
    }

    private okio.ByteString digest(java.lang.String str) {
        try {
            return of(java.security.MessageDigest.getInstance(str).digest(this.data));
        } catch (java.security.NoSuchAlgorithmException e) {
            throw new java.lang.AssertionError(e);
        }
    }

    public okio.ByteString hmacSha1(okio.ByteString byteString) {
        return hmac("HmacSHA1", byteString);
    }

    public okio.ByteString hmacSha256(okio.ByteString byteString) {
        return hmac("HmacSHA256", byteString);
    }

    public okio.ByteString hmacSha512(okio.ByteString byteString) {
        return hmac("HmacSHA512", byteString);
    }

    private okio.ByteString hmac(java.lang.String str, okio.ByteString byteString) {
        try {
            javax.crypto.Mac mac = javax.crypto.Mac.getInstance(str);
            mac.init(new javax.crypto.spec.SecretKeySpec(byteString.toByteArray(), str));
            return of(mac.doFinal(this.data));
        } catch (java.security.InvalidKeyException e) {
            throw new java.lang.IllegalArgumentException(e);
        } catch (java.security.NoSuchAlgorithmException e2) {
            throw new java.lang.AssertionError(e2);
        }
    }

    public java.lang.String base64Url() {
        return okio.Base64.encodeUrl(this.data);
    }

    @javax.annotation.Nullable
    public static okio.ByteString decodeBase64(java.lang.String str) {
        if (str == null) {
            throw new java.lang.IllegalArgumentException("base64 == null");
        }
        byte[] bArrDecode = okio.Base64.decode(str);
        if (bArrDecode != null) {
            return new okio.ByteString(bArrDecode);
        }
        return null;
    }

    public java.lang.String hex() {
        byte[] bArr = this.data;
        char[] cArr = new char[bArr.length * 2];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            char[] cArr2 = HEX_DIGITS;
            cArr[i] = cArr2[(b >> 4) & 15];
            i = i2 + 1;
            cArr[i2] = cArr2[b & 15];
        }
        return new java.lang.String(cArr);
    }

    public static okio.ByteString decodeHex(java.lang.String str) {
        if (str == null) {
            throw new java.lang.IllegalArgumentException("hex == null");
        }
        if (str.length() % 2 != 0) {
            throw new java.lang.IllegalArgumentException("Unexpected hex string: " + str);
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) ((decodeHexDigit(str.charAt(i2)) << 4) + decodeHexDigit(str.charAt(i2 + 1)));
        }
        return of(bArr);
    }

    private static int decodeHexDigit(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        char c2 = 'a';
        if (c < 'a' || c > 'f') {
            c2 = 'A';
            if (c < 'A' || c > 'F') {
                throw new java.lang.IllegalArgumentException("Unexpected hex digit: " + c);
            }
        }
        return (c - c2) + 10;
    }

    public static okio.ByteString read(java.io.InputStream inputStream, int i) throws java.io.IOException {
        if (inputStream == null) {
            throw new java.lang.IllegalArgumentException("in == null");
        }
        if (i < 0) {
            throw new java.lang.IllegalArgumentException("byteCount < 0: " + i);
        }
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int i3 = inputStream.read(bArr, i2, i - i2);
            if (i3 == -1) {
                throw new java.io.EOFException();
            }
            i2 += i3;
        }
        return new okio.ByteString(bArr);
    }

    public okio.ByteString toAsciiLowercase() {
        int i = 0;
        while (true) {
            byte[] bArr = this.data;
            if (i >= bArr.length) {
                return this;
            }
            byte b = bArr[i];
            if (b >= 65 && b <= 90) {
                byte[] bArr2 = (byte[]) bArr.clone();
                bArr2[i] = (byte) (b + 32);
                for (int i2 = i + 1; i2 < bArr2.length; i2++) {
                    byte b2 = bArr2[i2];
                    if (b2 >= 65 && b2 <= 90) {
                        bArr2[i2] = (byte) (b2 + 32);
                    }
                }
                return new okio.ByteString(bArr2);
            }
            i++;
        }
    }

    public okio.ByteString toAsciiUppercase() {
        int i = 0;
        while (true) {
            byte[] bArr = this.data;
            if (i >= bArr.length) {
                return this;
            }
            byte b = bArr[i];
            if (b >= 97 && b <= 122) {
                byte[] bArr2 = (byte[]) bArr.clone();
                bArr2[i] = (byte) (b - 32);
                for (int i2 = i + 1; i2 < bArr2.length; i2++) {
                    byte b2 = bArr2[i2];
                    if (b2 >= 97 && b2 <= 122) {
                        bArr2[i2] = (byte) (b2 - 32);
                    }
                }
                return new okio.ByteString(bArr2);
            }
            i++;
        }
    }

    public okio.ByteString substring(int i) {
        return substring(i, this.data.length);
    }

    public okio.ByteString substring(int i, int i2) {
        if (i < 0) {
            throw new java.lang.IllegalArgumentException("beginIndex < 0");
        }
        byte[] bArr = this.data;
        if (i2 > bArr.length) {
            throw new java.lang.IllegalArgumentException("endIndex > length(" + this.data.length + ")");
        }
        int i3 = i2 - i;
        if (i3 < 0) {
            throw new java.lang.IllegalArgumentException("endIndex < beginIndex");
        }
        if (i == 0 && i2 == bArr.length) {
            return this;
        }
        byte[] bArr2 = new byte[i3];
        java.lang.System.arraycopy(bArr, i, bArr2, 0, i3);
        return new okio.ByteString(bArr2);
    }

    public byte getByte(int i) {
        return this.data[i];
    }

    public int size() {
        return this.data.length;
    }

    public byte[] toByteArray() {
        return (byte[]) this.data.clone();
    }

    byte[] internalArray() {
        return this.data;
    }

    public java.nio.ByteBuffer asByteBuffer() {
        return java.nio.ByteBuffer.wrap(this.data).asReadOnlyBuffer();
    }

    public void write(java.io.OutputStream outputStream) throws java.io.IOException {
        if (outputStream == null) {
            throw new java.lang.IllegalArgumentException("out == null");
        }
        outputStream.write(this.data);
    }

    void write(okio.Buffer buffer) {
        byte[] bArr = this.data;
        buffer.write(bArr, 0, bArr.length);
    }

    public boolean rangeEquals(int i, okio.ByteString byteString, int i2, int i3) {
        return byteString.rangeEquals(i2, this.data, i, i3);
    }

    public boolean rangeEquals(int i, byte[] bArr, int i2, int i3) {
        if (i >= 0) {
            byte[] bArr2 = this.data;
            if (i <= bArr2.length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && okio.Util.arrayRangeEquals(bArr2, i, bArr, i2, i3)) {
                return true;
            }
        }
        return false;
    }

    public final boolean startsWith(okio.ByteString byteString) {
        return rangeEquals(0, byteString, 0, byteString.size());
    }

    public final boolean startsWith(byte[] bArr) {
        return rangeEquals(0, bArr, 0, bArr.length);
    }

    public final boolean endsWith(okio.ByteString byteString) {
        return rangeEquals(size() - byteString.size(), byteString, 0, byteString.size());
    }

    public final boolean endsWith(byte[] bArr) {
        return rangeEquals(size() - bArr.length, bArr, 0, bArr.length);
    }

    public final int indexOf(okio.ByteString byteString) {
        return indexOf(byteString.internalArray(), 0);
    }

    public final int indexOf(okio.ByteString byteString, int i) {
        return indexOf(byteString.internalArray(), i);
    }

    public final int indexOf(byte[] bArr) {
        return indexOf(bArr, 0);
    }

    public int indexOf(byte[] bArr, int i) {
        int length = this.data.length - bArr.length;
        for (int iMax = java.lang.Math.max(i, 0); iMax <= length; iMax++) {
            if (okio.Util.arrayRangeEquals(this.data, iMax, bArr, 0, bArr.length)) {
                return iMax;
            }
        }
        return -1;
    }

    public final int lastIndexOf(okio.ByteString byteString) {
        return lastIndexOf(byteString.internalArray(), size());
    }

    public final int lastIndexOf(okio.ByteString byteString, int i) {
        return lastIndexOf(byteString.internalArray(), i);
    }

    public final int lastIndexOf(byte[] bArr) {
        return lastIndexOf(bArr, size());
    }

    public int lastIndexOf(byte[] bArr, int i) {
        for (int iMin = java.lang.Math.min(i, this.data.length - bArr.length); iMin >= 0; iMin--) {
            if (okio.Util.arrayRangeEquals(this.data, iMin, bArr, 0, bArr.length)) {
                return iMin;
            }
        }
        return -1;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof okio.ByteString) {
            okio.ByteString byteString = (okio.ByteString) obj;
            int size = byteString.size();
            byte[] bArr = this.data;
            if (size == bArr.length && byteString.rangeEquals(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = java.util.Arrays.hashCode(this.data);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // java.lang.Comparable
    public int compareTo(okio.ByteString byteString) {
        int size = size();
        int size2 = byteString.size();
        int iMin = java.lang.Math.min(size, size2);
        for (int i = 0; i < iMin; i++) {
            int i2 = getByte(i) & kotlin.UByte.MAX_VALUE;
            int i3 = byteString.getByte(i) & kotlin.UByte.MAX_VALUE;
            if (i2 != i3) {
                return i2 < i3 ? -1 : 1;
            }
        }
        if (size == size2) {
            return 0;
        }
        return size < size2 ? -1 : 1;
    }

    public java.lang.String toString() {
        if (this.data.length == 0) {
            return "[size=0]";
        }
        java.lang.String strUtf8 = utf8();
        int iCodePointIndexToCharIndex = codePointIndexToCharIndex(strUtf8, 64);
        if (iCodePointIndexToCharIndex == -1) {
            if (this.data.length <= 64) {
                return "[hex=" + hex() + "]";
            }
            return "[size=" + this.data.length + " hex=" + substring(0, 64).hex() + "…]";
        }
        java.lang.String strReplace = strUtf8.substring(0, iCodePointIndexToCharIndex).replace("\\", "\\\\").replace("\n", "\\n").replace("\r", "\\r");
        if (iCodePointIndexToCharIndex < strUtf8.length()) {
            return "[size=" + this.data.length + " text=" + strReplace + "…]";
        }
        return "[text=" + strReplace + "]";
    }

    static int codePointIndexToCharIndex(java.lang.String str, int i) {
        int length = str.length();
        int iCharCount = 0;
        int i2 = 0;
        while (iCharCount < length) {
            if (i2 == i) {
                return iCharCount;
            }
            int iCodePointAt = str.codePointAt(iCharCount);
            if ((java.lang.Character.isISOControl(iCodePointAt) && iCodePointAt != 10 && iCodePointAt != 13) || iCodePointAt == 65533) {
                return -1;
            }
            i2++;
            iCharCount += java.lang.Character.charCount(iCodePointAt);
        }
        return str.length();
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.IOException {
        okio.ByteString byteString = read(objectInputStream, objectInputStream.readInt());
        try {
            java.lang.reflect.Field declaredField = okio.ByteString.class.getDeclaredField("data");
            declaredField.setAccessible(true);
            declaredField.set(this, byteString.data);
        } catch (java.lang.IllegalAccessException unused) {
            throw new java.lang.AssertionError();
        } catch (java.lang.NoSuchFieldException unused2) {
            throw new java.lang.AssertionError();
        }
    }

    private void writeObject(java.io.ObjectOutputStream objectOutputStream) throws java.io.IOException {
        objectOutputStream.writeInt(this.data.length);
        objectOutputStream.write(this.data);
    }
}
