package kotlin.reflect.jvm.internal.impl.protobuf;

/* JADX INFO: loaded from: classes2.dex */
public final class CodedOutputStream {
    private final byte[] buffer;
    private final int limit;
    private final java.io.OutputStream output;
    private int totalBytesWritten = 0;
    private int position = 0;

    public static int computeBoolSizeNoTag(boolean z) {
        return 1;
    }

    public static int computeDoubleSizeNoTag(double d) {
        return 8;
    }

    public static int computeFixed32SizeNoTag(int i) {
        return 4;
    }

    public static int computeFixed64SizeNoTag(long j) {
        return 8;
    }

    public static int computeFloatSizeNoTag(float f) {
        return 4;
    }

    static int computePreferredBufferSize(int i) {
        if (i > 4096) {
            return 4096;
        }
        return i;
    }

    public static int computeRawVarint32Size(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    public static int computeRawVarint64Size(long j) {
        if (((-128) & j) == 0) {
            return 1;
        }
        if (((-16384) & j) == 0) {
            return 2;
        }
        if (((-2097152) & j) == 0) {
            return 3;
        }
        if (((-268435456) & j) == 0) {
            return 4;
        }
        if (((-34359738368L) & j) == 0) {
            return 5;
        }
        if (((-4398046511104L) & j) == 0) {
            return 6;
        }
        if (((-562949953421312L) & j) == 0) {
            return 7;
        }
        if (((-72057594037927936L) & j) == 0) {
            return 8;
        }
        return (j & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    public static int computeSFixed32SizeNoTag(int i) {
        return 4;
    }

    public static int computeSFixed64SizeNoTag(long j) {
        return 8;
    }

    public static int encodeZigZag32(int i) {
        return (i >> 31) ^ (i << 1);
    }

    public static long encodeZigZag64(long j) {
        return (j >> 63) ^ (j << 1);
    }

    private CodedOutputStream(java.io.OutputStream outputStream, byte[] bArr) {
        this.output = outputStream;
        this.buffer = bArr;
        this.limit = bArr.length;
    }

    public static kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream newInstance(java.io.OutputStream outputStream, int i) {
        return new kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream(outputStream, new byte[i]);
    }

    public void writeDouble(int i, double d) throws java.io.IOException {
        writeTag(i, 1);
        writeDoubleNoTag(d);
    }

    public void writeFloat(int i, float f) throws java.io.IOException {
        writeTag(i, 5);
        writeFloatNoTag(f);
    }

    public void writeInt32(int i, int i2) throws java.io.IOException {
        writeTag(i, 0);
        writeInt32NoTag(i2);
    }

    public void writeBool(int i, boolean z) throws java.io.IOException {
        writeTag(i, 0);
        writeBoolNoTag(z);
    }

    public void writeGroup(int i, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite messageLite) throws java.io.IOException {
        writeTag(i, 3);
        writeGroupNoTag(messageLite);
        writeTag(i, 4);
    }

    public void writeMessage(int i, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite messageLite) throws java.io.IOException {
        writeTag(i, 2);
        writeMessageNoTag(messageLite);
    }

    public void writeBytes(int i, kotlin.reflect.jvm.internal.impl.protobuf.ByteString byteString) throws java.io.IOException {
        writeTag(i, 2);
        writeBytesNoTag(byteString);
    }

    public void writeUInt32(int i, int i2) throws java.io.IOException {
        writeTag(i, 0);
        writeUInt32NoTag(i2);
    }

    public void writeEnum(int i, int i2) throws java.io.IOException {
        writeTag(i, 0);
        writeEnumNoTag(i2);
    }

    public void writeSInt64(int i, long j) throws java.io.IOException {
        writeTag(i, 0);
        writeSInt64NoTag(j);
    }

    public void writeMessageSetExtension(int i, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite messageLite) throws java.io.IOException {
        writeTag(1, 3);
        writeUInt32(2, i);
        writeMessage(3, messageLite);
        writeTag(1, 4);
    }

    public void writeDoubleNoTag(double d) throws java.io.IOException {
        writeRawLittleEndian64(java.lang.Double.doubleToRawLongBits(d));
    }

    public void writeFloatNoTag(float f) throws java.io.IOException {
        writeRawLittleEndian32(java.lang.Float.floatToRawIntBits(f));
    }

    public void writeUInt64NoTag(long j) throws java.io.IOException {
        writeRawVarint64(j);
    }

    public void writeInt64NoTag(long j) throws java.io.IOException {
        writeRawVarint64(j);
    }

    public void writeInt32NoTag(int i) throws java.io.IOException {
        if (i >= 0) {
            writeRawVarint32(i);
        } else {
            writeRawVarint64(i);
        }
    }

    public void writeFixed64NoTag(long j) throws java.io.IOException {
        writeRawLittleEndian64(j);
    }

    public void writeFixed32NoTag(int i) throws java.io.IOException {
        writeRawLittleEndian32(i);
    }

    public void writeBoolNoTag(boolean z) throws java.io.IOException {
        writeRawByte(z ? 1 : 0);
    }

    public void writeStringNoTag(java.lang.String str) throws java.io.IOException {
        byte[] bytes = str.getBytes(io.fabric.sdk.android.services.network.HttpRequest.CHARSET_UTF8);
        writeRawVarint32(bytes.length);
        writeRawBytes(bytes);
    }

    public void writeGroupNoTag(kotlin.reflect.jvm.internal.impl.protobuf.MessageLite messageLite) throws java.io.IOException {
        messageLite.writeTo(this);
    }

    public void writeMessageNoTag(kotlin.reflect.jvm.internal.impl.protobuf.MessageLite messageLite) throws java.io.IOException {
        writeRawVarint32(messageLite.getSerializedSize());
        messageLite.writeTo(this);
    }

    public void writeBytesNoTag(kotlin.reflect.jvm.internal.impl.protobuf.ByteString byteString) throws java.io.IOException {
        writeRawVarint32(byteString.size());
        writeRawBytes(byteString);
    }

    public void writeByteArrayNoTag(byte[] bArr) throws java.io.IOException {
        writeRawVarint32(bArr.length);
        writeRawBytes(bArr);
    }

    public void writeUInt32NoTag(int i) throws java.io.IOException {
        writeRawVarint32(i);
    }

    public void writeEnumNoTag(int i) throws java.io.IOException {
        writeInt32NoTag(i);
    }

    public void writeSFixed32NoTag(int i) throws java.io.IOException {
        writeRawLittleEndian32(i);
    }

    public void writeSFixed64NoTag(long j) throws java.io.IOException {
        writeRawLittleEndian64(j);
    }

    public void writeSInt32NoTag(int i) throws java.io.IOException {
        writeRawVarint32(encodeZigZag32(i));
    }

    public void writeSInt64NoTag(long j) throws java.io.IOException {
        writeRawVarint64(encodeZigZag64(j));
    }

    public static int computeDoubleSize(int i, double d) {
        return computeTagSize(i) + computeDoubleSizeNoTag(d);
    }

    public static int computeFloatSize(int i, float f) {
        return computeTagSize(i) + computeFloatSizeNoTag(f);
    }

    public static int computeInt32Size(int i, int i2) {
        return computeTagSize(i) + computeInt32SizeNoTag(i2);
    }

    public static int computeBoolSize(int i, boolean z) {
        return computeTagSize(i) + computeBoolSizeNoTag(z);
    }

    public static int computeMessageSize(int i, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite messageLite) {
        return computeTagSize(i) + computeMessageSizeNoTag(messageLite);
    }

    public static int computeBytesSize(int i, kotlin.reflect.jvm.internal.impl.protobuf.ByteString byteString) {
        return computeTagSize(i) + computeBytesSizeNoTag(byteString);
    }

    public static int computeEnumSize(int i, int i2) {
        return computeTagSize(i) + computeEnumSizeNoTag(i2);
    }

    public static int computeSInt64Size(int i, long j) {
        return computeTagSize(i) + computeSInt64SizeNoTag(j);
    }

    public static int computeUInt64SizeNoTag(long j) {
        return computeRawVarint64Size(j);
    }

    public static int computeInt64SizeNoTag(long j) {
        return computeRawVarint64Size(j);
    }

    public static int computeInt32SizeNoTag(int i) {
        if (i >= 0) {
            return computeRawVarint32Size(i);
        }
        return 10;
    }

    public static int computeStringSizeNoTag(java.lang.String str) {
        try {
            byte[] bytes = str.getBytes(io.fabric.sdk.android.services.network.HttpRequest.CHARSET_UTF8);
            return computeRawVarint32Size(bytes.length) + bytes.length;
        } catch (java.io.UnsupportedEncodingException e) {
            throw new java.lang.RuntimeException("UTF-8 not supported.", e);
        }
    }

    public static int computeGroupSizeNoTag(kotlin.reflect.jvm.internal.impl.protobuf.MessageLite messageLite) {
        return messageLite.getSerializedSize();
    }

    public static int computeMessageSizeNoTag(kotlin.reflect.jvm.internal.impl.protobuf.MessageLite messageLite) {
        int serializedSize = messageLite.getSerializedSize();
        return computeRawVarint32Size(serializedSize) + serializedSize;
    }

    public static int computeLazyFieldSizeNoTag(kotlin.reflect.jvm.internal.impl.protobuf.LazyFieldLite lazyFieldLite) {
        int serializedSize = lazyFieldLite.getSerializedSize();
        return computeRawVarint32Size(serializedSize) + serializedSize;
    }

    public static int computeBytesSizeNoTag(kotlin.reflect.jvm.internal.impl.protobuf.ByteString byteString) {
        return computeRawVarint32Size(byteString.size()) + byteString.size();
    }

    public static int computeByteArraySizeNoTag(byte[] bArr) {
        return computeRawVarint32Size(bArr.length) + bArr.length;
    }

    public static int computeUInt32SizeNoTag(int i) {
        return computeRawVarint32Size(i);
    }

    public static int computeEnumSizeNoTag(int i) {
        return computeInt32SizeNoTag(i);
    }

    public static int computeSInt32SizeNoTag(int i) {
        return computeRawVarint32Size(encodeZigZag32(i));
    }

    public static int computeSInt64SizeNoTag(long j) {
        return computeRawVarint64Size(encodeZigZag64(j));
    }

    private void refreshBuffer() throws java.io.IOException {
        java.io.OutputStream outputStream = this.output;
        if (outputStream == null) {
            throw new kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.OutOfSpaceException();
        }
        outputStream.write(this.buffer, 0, this.position);
        this.position = 0;
    }

    public void flush() throws java.io.IOException {
        if (this.output != null) {
            refreshBuffer();
        }
    }

    public static class OutOfSpaceException extends java.io.IOException {
        OutOfSpaceException() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }
    }

    public void writeRawByte(byte b) throws java.io.IOException {
        if (this.position == this.limit) {
            refreshBuffer();
        }
        byte[] bArr = this.buffer;
        int i = this.position;
        this.position = i + 1;
        bArr[i] = b;
        this.totalBytesWritten++;
    }

    public void writeRawByte(int i) throws java.io.IOException {
        writeRawByte((byte) i);
    }

    public void writeRawBytes(kotlin.reflect.jvm.internal.impl.protobuf.ByteString byteString) throws java.io.IOException {
        writeRawBytes(byteString, 0, byteString.size());
    }

    public void writeRawBytes(byte[] bArr) throws java.io.IOException {
        writeRawBytes(bArr, 0, bArr.length);
    }

    public void writeRawBytes(byte[] bArr, int i, int i2) throws java.io.IOException {
        int i3 = this.limit;
        int i4 = this.position;
        if (i3 - i4 >= i2) {
            java.lang.System.arraycopy(bArr, i, this.buffer, i4, i2);
            this.position += i2;
            this.totalBytesWritten += i2;
            return;
        }
        int i5 = i3 - i4;
        java.lang.System.arraycopy(bArr, i, this.buffer, i4, i5);
        int i6 = i + i5;
        int i7 = i2 - i5;
        this.position = this.limit;
        this.totalBytesWritten += i5;
        refreshBuffer();
        if (i7 <= this.limit) {
            java.lang.System.arraycopy(bArr, i6, this.buffer, 0, i7);
            this.position = i7;
        } else {
            this.output.write(bArr, i6, i7);
        }
        this.totalBytesWritten += i7;
    }

    public void writeRawBytes(kotlin.reflect.jvm.internal.impl.protobuf.ByteString byteString, int i, int i2) throws java.io.IOException {
        int i3 = this.limit;
        int i4 = this.position;
        if (i3 - i4 >= i2) {
            byteString.copyTo(this.buffer, i, i4, i2);
            this.position += i2;
            this.totalBytesWritten += i2;
            return;
        }
        int i5 = i3 - i4;
        byteString.copyTo(this.buffer, i, i4, i5);
        int i6 = i + i5;
        int i7 = i2 - i5;
        this.position = this.limit;
        this.totalBytesWritten += i5;
        refreshBuffer();
        if (i7 <= this.limit) {
            byteString.copyTo(this.buffer, i6, 0, i7);
            this.position = i7;
        } else {
            byteString.writeTo(this.output, i6, i7);
        }
        this.totalBytesWritten += i7;
    }

    public void writeTag(int i, int i2) throws java.io.IOException {
        writeRawVarint32(kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.makeTag(i, i2));
    }

    public static int computeTagSize(int i) {
        return computeRawVarint32Size(kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.makeTag(i, 0));
    }

    public void writeRawVarint32(int i) throws java.io.IOException {
        while ((i & (-128)) != 0) {
            writeRawByte((i & kotlinx.coroutines.scheduling.WorkQueueKt.MASK) | 128);
            i >>>= 7;
        }
        writeRawByte(i);
    }

    public void writeRawVarint64(long j) throws java.io.IOException {
        while (((-128) & j) != 0) {
            writeRawByte((((int) j) & kotlinx.coroutines.scheduling.WorkQueueKt.MASK) | 128);
            j >>>= 7;
        }
        writeRawByte((int) j);
    }

    public void writeRawLittleEndian32(int i) throws java.io.IOException {
        writeRawByte(i & 255);
        writeRawByte((i >> 8) & 255);
        writeRawByte((i >> 16) & 255);
        writeRawByte((i >> 24) & 255);
    }

    public void writeRawLittleEndian64(long j) throws java.io.IOException {
        writeRawByte(((int) j) & 255);
        writeRawByte(((int) (j >> 8)) & 255);
        writeRawByte(((int) (j >> 16)) & 255);
        writeRawByte(((int) (j >> 24)) & 255);
        writeRawByte(((int) (j >> 32)) & 255);
        writeRawByte(((int) (j >> 40)) & 255);
        writeRawByte(((int) (j >> 48)) & 255);
        writeRawByte(((int) (j >> 56)) & 255);
    }
}
