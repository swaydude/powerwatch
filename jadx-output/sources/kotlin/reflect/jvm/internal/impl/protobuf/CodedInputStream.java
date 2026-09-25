package kotlin.reflect.jvm.internal.impl.protobuf;

/* JADX INFO: loaded from: classes2.dex */
public final class CodedInputStream {
    private final byte[] buffer;
    private final boolean bufferIsImmutable;
    private int bufferPos;
    private int bufferSize;
    private int bufferSizeAfterLimit;
    private int currentLimit;
    private boolean enableAliasing;
    private final java.io.InputStream input;
    private int lastTag;
    private int recursionDepth;
    private int recursionLimit;
    private kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream.RefillCallback refillCallback;
    private int sizeLimit;
    private int totalBytesRetired;

    private interface RefillCallback {
        void onRefill();
    }

    public static int decodeZigZag32(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    public static long decodeZigZag64(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    public static kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream newInstance(java.io.InputStream inputStream) {
        return new kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream(inputStream);
    }

    static kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream newInstance(kotlin.reflect.jvm.internal.impl.protobuf.LiteralByteString literalByteString) {
        kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream = new kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream(literalByteString);
        try {
            codedInputStream.pushLimit(literalByteString.size());
            return codedInputStream;
        } catch (kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException e) {
            throw new java.lang.IllegalArgumentException(e);
        }
    }

    public int readTag() throws java.io.IOException {
        if (isAtEnd()) {
            this.lastTag = 0;
            return 0;
        }
        int rawVarint32 = readRawVarint32();
        this.lastTag = rawVarint32;
        if (kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.getTagFieldNumber(rawVarint32) == 0) {
            throw kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException.invalidTag();
        }
        return this.lastTag;
    }

    public void checkLastTagWas(int i) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
        if (this.lastTag != i) {
            throw kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException.invalidEndTag();
        }
    }

    public boolean skipField(int i, kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream codedOutputStream) throws java.io.IOException {
        int tagWireType = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.getTagWireType(i);
        if (tagWireType == 0) {
            long int64 = readInt64();
            codedOutputStream.writeRawVarint32(i);
            codedOutputStream.writeUInt64NoTag(int64);
            return true;
        }
        if (tagWireType == 1) {
            long rawLittleEndian64 = readRawLittleEndian64();
            codedOutputStream.writeRawVarint32(i);
            codedOutputStream.writeFixed64NoTag(rawLittleEndian64);
            return true;
        }
        if (tagWireType == 2) {
            kotlin.reflect.jvm.internal.impl.protobuf.ByteString bytes = readBytes();
            codedOutputStream.writeRawVarint32(i);
            codedOutputStream.writeBytesNoTag(bytes);
            return true;
        }
        if (tagWireType == 3) {
            codedOutputStream.writeRawVarint32(i);
            skipMessage(codedOutputStream);
            int iMakeTag = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.makeTag(kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.getTagFieldNumber(i), 4);
            checkLastTagWas(iMakeTag);
            codedOutputStream.writeRawVarint32(iMakeTag);
            return true;
        }
        if (tagWireType == 4) {
            return false;
        }
        if (tagWireType == 5) {
            int rawLittleEndian32 = readRawLittleEndian32();
            codedOutputStream.writeRawVarint32(i);
            codedOutputStream.writeFixed32NoTag(rawLittleEndian32);
            return true;
        }
        throw kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException.invalidWireType();
    }

    public void skipMessage(kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream codedOutputStream) throws java.io.IOException {
        int tag;
        do {
            tag = readTag();
            if (tag == 0) {
                return;
            }
        } while (skipField(tag, codedOutputStream));
    }

    public double readDouble() throws java.io.IOException {
        return java.lang.Double.longBitsToDouble(readRawLittleEndian64());
    }

    public float readFloat() throws java.io.IOException {
        return java.lang.Float.intBitsToFloat(readRawLittleEndian32());
    }

    public long readUInt64() throws java.io.IOException {
        return readRawVarint64();
    }

    public long readInt64() throws java.io.IOException {
        return readRawVarint64();
    }

    public int readInt32() throws java.io.IOException {
        return readRawVarint32();
    }

    public long readFixed64() throws java.io.IOException {
        return readRawLittleEndian64();
    }

    public int readFixed32() throws java.io.IOException {
        return readRawLittleEndian32();
    }

    public boolean readBool() throws java.io.IOException {
        return readRawVarint64() != 0;
    }

    public java.lang.String readString() throws java.io.IOException {
        int rawVarint32 = readRawVarint32();
        if (rawVarint32 > this.bufferSize - this.bufferPos || rawVarint32 <= 0) {
            return rawVarint32 == 0 ? "" : new java.lang.String(readRawBytesSlowPath(rawVarint32), io.fabric.sdk.android.services.network.HttpRequest.CHARSET_UTF8);
        }
        java.lang.String str = new java.lang.String(this.buffer, this.bufferPos, rawVarint32, io.fabric.sdk.android.services.network.HttpRequest.CHARSET_UTF8);
        this.bufferPos += rawVarint32;
        return str;
    }

    public java.lang.String readStringRequireUtf8() throws java.io.IOException {
        byte[] rawBytesSlowPath;
        int rawVarint32 = readRawVarint32();
        int i = this.bufferPos;
        if (rawVarint32 <= this.bufferSize - i && rawVarint32 > 0) {
            rawBytesSlowPath = this.buffer;
            this.bufferPos = i + rawVarint32;
        } else {
            if (rawVarint32 == 0) {
                return "";
            }
            rawBytesSlowPath = readRawBytesSlowPath(rawVarint32);
            i = 0;
        }
        if (!kotlin.reflect.jvm.internal.impl.protobuf.Utf8.isValidUtf8(rawBytesSlowPath, i, i + rawVarint32)) {
            throw kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException.invalidUtf8();
        }
        return new java.lang.String(rawBytesSlowPath, i, rawVarint32, io.fabric.sdk.android.services.network.HttpRequest.CHARSET_UTF8);
    }

    public void readGroup(int i, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder builder, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        int i2 = this.recursionDepth;
        if (i2 >= this.recursionLimit) {
            throw kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException.recursionLimitExceeded();
        }
        this.recursionDepth = i2 + 1;
        builder.mergeFrom(this, extensionRegistryLite);
        checkLastTagWas(kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.makeTag(i, 4));
        this.recursionDepth--;
    }

    public void readMessage(kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder builder, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        int rawVarint32 = readRawVarint32();
        if (this.recursionDepth >= this.recursionLimit) {
            throw kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException.recursionLimitExceeded();
        }
        int iPushLimit = pushLimit(rawVarint32);
        this.recursionDepth++;
        builder.mergeFrom(this, extensionRegistryLite);
        checkLastTagWas(0);
        this.recursionDepth--;
        popLimit(iPushLimit);
    }

    public <T extends kotlin.reflect.jvm.internal.impl.protobuf.MessageLite> T readMessage(kotlin.reflect.jvm.internal.impl.protobuf.Parser<T> parser, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        int rawVarint32 = readRawVarint32();
        if (this.recursionDepth >= this.recursionLimit) {
            throw kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException.recursionLimitExceeded();
        }
        int iPushLimit = pushLimit(rawVarint32);
        this.recursionDepth++;
        T partialFrom = parser.parsePartialFrom(this, extensionRegistryLite);
        checkLastTagWas(0);
        this.recursionDepth--;
        popLimit(iPushLimit);
        return partialFrom;
    }

    public kotlin.reflect.jvm.internal.impl.protobuf.ByteString readBytes() throws java.io.IOException {
        int rawVarint32 = readRawVarint32();
        int i = this.bufferSize;
        int i2 = this.bufferPos;
        if (rawVarint32 > i - i2 || rawVarint32 <= 0) {
            if (rawVarint32 == 0) {
                return kotlin.reflect.jvm.internal.impl.protobuf.ByteString.EMPTY;
            }
            return new kotlin.reflect.jvm.internal.impl.protobuf.LiteralByteString(readRawBytesSlowPath(rawVarint32));
        }
        kotlin.reflect.jvm.internal.impl.protobuf.ByteString boundedByteString = (this.bufferIsImmutable && this.enableAliasing) ? new kotlin.reflect.jvm.internal.impl.protobuf.BoundedByteString(this.buffer, this.bufferPos, rawVarint32) : kotlin.reflect.jvm.internal.impl.protobuf.ByteString.copyFrom(this.buffer, i2, rawVarint32);
        this.bufferPos += rawVarint32;
        return boundedByteString;
    }

    public int readUInt32() throws java.io.IOException {
        return readRawVarint32();
    }

    public int readEnum() throws java.io.IOException {
        return readRawVarint32();
    }

    public int readSFixed32() throws java.io.IOException {
        return readRawLittleEndian32();
    }

    public long readSFixed64() throws java.io.IOException {
        return readRawLittleEndian64();
    }

    public int readSInt32() throws java.io.IOException {
        return decodeZigZag32(readRawVarint32());
    }

    public long readSInt64() throws java.io.IOException {
        return decodeZigZag64(readRawVarint64());
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x007a, code lost:
    
        if (r2[r3] < 0) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int readRawVarint32() throws java.io.IOException {
        /*
            r9 = this;
            int r0 = r9.bufferPos
            int r1 = r9.bufferSize
            if (r1 != r0) goto L8
            goto L7c
        L8:
            byte[] r2 = r9.buffer
            int r3 = r0 + 1
            r0 = r2[r0]
            if (r0 < 0) goto L13
            r9.bufferPos = r3
            return r0
        L13:
            int r1 = r1 - r3
            r4 = 9
            if (r1 >= r4) goto L19
            goto L7c
        L19:
            int r1 = r3 + 1
            r3 = r2[r3]
            int r3 = r3 << 7
            r0 = r0 ^ r3
            long r3 = (long) r0
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 >= 0) goto L2d
            r5 = -128(0xffffffffffffff80, double:NaN)
        L29:
            long r2 = r3 ^ r5
            int r0 = (int) r2
            goto L82
        L2d:
            int r3 = r1 + 1
            r1 = r2[r1]
            int r1 = r1 << 14
            r0 = r0 ^ r1
            long r7 = (long) r0
            int r1 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r1 < 0) goto L3f
            r0 = 16256(0x3f80, double:8.0315E-320)
            long r0 = r0 ^ r7
            int r0 = (int) r0
        L3d:
            r1 = r3
            goto L82
        L3f:
            int r1 = r3 + 1
            r3 = r2[r3]
            int r3 = r3 << 21
            r0 = r0 ^ r3
            long r3 = (long) r0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 >= 0) goto L4f
            r5 = -2080896(0xffffffffffe03f80, double:NaN)
            goto L29
        L4f:
            int r3 = r1 + 1
            r1 = r2[r1]
            int r4 = r1 << 28
            r0 = r0 ^ r4
            long r4 = (long) r0
            r6 = 266354560(0xfe03f80, double:1.315966377E-315)
            long r4 = r4 ^ r6
            int r0 = (int) r4
            if (r1 >= 0) goto L3d
            int r1 = r3 + 1
            r3 = r2[r3]
            if (r3 >= 0) goto L82
            int r3 = r1 + 1
            r1 = r2[r1]
            if (r1 >= 0) goto L3d
            int r1 = r3 + 1
            r3 = r2[r3]
            if (r3 >= 0) goto L82
            int r3 = r1 + 1
            r1 = r2[r1]
            if (r1 >= 0) goto L3d
            int r1 = r3 + 1
            r2 = r2[r3]
            if (r2 >= 0) goto L82
        L7c:
            long r0 = r9.readRawVarint64SlowPath()
            int r1 = (int) r0
            return r1
        L82:
            r9.bufferPos = r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream.readRawVarint32():int");
    }

    public static int readRawVarint32(int i, java.io.InputStream inputStream) throws java.io.IOException {
        if ((i & 128) == 0) {
            return i;
        }
        int i2 = i & kotlinx.coroutines.scheduling.WorkQueueKt.MASK;
        int i3 = 7;
        while (i3 < 32) {
            int i4 = inputStream.read();
            if (i4 == -1) {
                throw kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException.truncatedMessage();
            }
            i2 |= (i4 & kotlinx.coroutines.scheduling.WorkQueueKt.MASK) << i3;
            if ((i4 & 128) == 0) {
                return i2;
            }
            i3 += 7;
        }
        while (i3 < 64) {
            int i5 = inputStream.read();
            if (i5 == -1) {
                throw kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException.truncatedMessage();
            }
            if ((i5 & 128) == 0) {
                return i2;
            }
            i3 += 7;
        }
        throw kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException.malformedVarint();
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b6, code lost:
    
        if (r2[r0] < 0) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long readRawVarint64() throws java.io.IOException {
        /*
            r9 = this;
            int r0 = r9.bufferPos
            int r1 = r9.bufferSize
            if (r1 != r0) goto L8
            goto Lb8
        L8:
            byte[] r2 = r9.buffer
            int r3 = r0 + 1
            r0 = r2[r0]
            if (r0 < 0) goto L14
            r9.bufferPos = r3
            long r0 = (long) r0
            return r0
        L14:
            int r1 = r1 - r3
            r4 = 9
            if (r1 >= r4) goto L1b
            goto Lb8
        L1b:
            int r1 = r3 + 1
            r3 = r2[r3]
            int r3 = r3 << 7
            r0 = r0 ^ r3
            long r3 = (long) r0
            r5 = 0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 >= 0) goto L2f
            r5 = -128(0xffffffffffffff80, double:NaN)
        L2b:
            long r2 = r3 ^ r5
            goto Lbf
        L2f:
            int r0 = r1 + 1
            r1 = r2[r1]
            int r1 = r1 << 14
            long r7 = (long) r1
            long r3 = r3 ^ r7
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 < 0) goto L42
            r1 = 16256(0x3f80, double:8.0315E-320)
        L3d:
            long r2 = r3 ^ r1
            r1 = r0
            goto Lbf
        L42:
            int r1 = r0 + 1
            r0 = r2[r0]
            int r0 = r0 << 21
            long r7 = (long) r0
            long r3 = r3 ^ r7
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 >= 0) goto L52
            r5 = -2080896(0xffffffffffe03f80, double:NaN)
            goto L2b
        L52:
            int r0 = r1 + 1
            r1 = r2[r1]
            long r7 = (long) r1
            r1 = 28
            long r7 = r7 << r1
            long r3 = r3 ^ r7
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 < 0) goto L63
            r1 = 266354560(0xfe03f80, double:1.315966377E-315)
            goto L3d
        L63:
            int r1 = r0 + 1
            r0 = r2[r0]
            long r7 = (long) r0
            r0 = 35
            long r7 = r7 << r0
            long r3 = r3 ^ r7
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 >= 0) goto L76
            r5 = -34093383808(0xfffffff80fe03f80, double:NaN)
            goto L2b
        L76:
            int r0 = r1 + 1
            r1 = r2[r1]
            long r7 = (long) r1
            r1 = 42
            long r7 = r7 << r1
            long r3 = r3 ^ r7
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 < 0) goto L89
            r1 = 4363953127296(0x3f80fe03f80, double:2.1560793202584E-311)
            goto L3d
        L89:
            int r1 = r0 + 1
            r0 = r2[r0]
            long r7 = (long) r0
            r0 = 49
            long r7 = r7 << r0
            long r3 = r3 ^ r7
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 >= 0) goto L9c
            r5 = -558586000294016(0xfffe03f80fe03f80, double:NaN)
            goto L2b
        L9c:
            int r0 = r1 + 1
            r1 = r2[r1]
            long r7 = (long) r1
            r1 = 56
            long r7 = r7 << r1
            long r3 = r3 ^ r7
            r7 = 71499008037633920(0xfe03f80fe03f80, double:6.838959413692434E-304)
            long r3 = r3 ^ r7
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 >= 0) goto Lbd
            int r1 = r0 + 1
            r0 = r2[r0]
            long r7 = (long) r0
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 >= 0) goto Lbe
        Lb8:
            long r0 = r9.readRawVarint64SlowPath()
            return r0
        Lbd:
            r1 = r0
        Lbe:
            r2 = r3
        Lbf:
            r9.bufferPos = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream.readRawVarint64():long");
    }

    long readRawVarint64SlowPath() throws java.io.IOException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte rawByte = readRawByte();
            j |= ((long) (rawByte & kotlin.jvm.internal.ByteCompanionObject.MAX_VALUE)) << i;
            if ((rawByte & kotlin.jvm.internal.ByteCompanionObject.MIN_VALUE) == 0) {
                return j;
            }
        }
        throw kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException.malformedVarint();
    }

    public int readRawLittleEndian32() throws java.io.IOException {
        int i = this.bufferPos;
        if (this.bufferSize - i < 4) {
            refillBuffer(4);
            i = this.bufferPos;
        }
        byte[] bArr = this.buffer;
        this.bufferPos = i + 4;
        return ((bArr[i + 3] & kotlin.UByte.MAX_VALUE) << 24) | (bArr[i] & kotlin.UByte.MAX_VALUE) | ((bArr[i + 1] & kotlin.UByte.MAX_VALUE) << 8) | ((bArr[i + 2] & kotlin.UByte.MAX_VALUE) << 16);
    }

    public long readRawLittleEndian64() throws java.io.IOException {
        int i = this.bufferPos;
        if (this.bufferSize - i < 8) {
            refillBuffer(8);
            i = this.bufferPos;
        }
        byte[] bArr = this.buffer;
        this.bufferPos = i + 8;
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    private CodedInputStream(java.io.InputStream inputStream) {
        this.enableAliasing = false;
        this.currentLimit = Integer.MAX_VALUE;
        this.recursionLimit = 64;
        this.sizeLimit = 67108864;
        this.refillCallback = null;
        this.buffer = new byte[4096];
        this.bufferSize = 0;
        this.bufferPos = 0;
        this.totalBytesRetired = 0;
        this.input = inputStream;
        this.bufferIsImmutable = false;
    }

    private CodedInputStream(kotlin.reflect.jvm.internal.impl.protobuf.LiteralByteString literalByteString) {
        this.enableAliasing = false;
        this.currentLimit = Integer.MAX_VALUE;
        this.recursionLimit = 64;
        this.sizeLimit = 67108864;
        this.refillCallback = null;
        this.buffer = literalByteString.bytes;
        int offsetIntoBytes = literalByteString.getOffsetIntoBytes();
        this.bufferPos = offsetIntoBytes;
        this.bufferSize = offsetIntoBytes + literalByteString.size();
        this.totalBytesRetired = -this.bufferPos;
        this.input = null;
        this.bufferIsImmutable = true;
    }

    public int pushLimit(int i) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
        if (i < 0) {
            throw kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException.negativeSize();
        }
        int i2 = i + this.totalBytesRetired + this.bufferPos;
        int i3 = this.currentLimit;
        if (i2 > i3) {
            throw kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException.truncatedMessage();
        }
        this.currentLimit = i2;
        recomputeBufferSizeAfterLimit();
        return i3;
    }

    private void recomputeBufferSizeAfterLimit() {
        int i = this.bufferSize + this.bufferSizeAfterLimit;
        this.bufferSize = i;
        int i2 = this.totalBytesRetired + i;
        int i3 = this.currentLimit;
        if (i2 > i3) {
            int i4 = i2 - i3;
            this.bufferSizeAfterLimit = i4;
            this.bufferSize = i - i4;
            return;
        }
        this.bufferSizeAfterLimit = 0;
    }

    public void popLimit(int i) {
        this.currentLimit = i;
        recomputeBufferSizeAfterLimit();
    }

    public int getBytesUntilLimit() {
        int i = this.currentLimit;
        if (i == Integer.MAX_VALUE) {
            return -1;
        }
        return i - (this.totalBytesRetired + this.bufferPos);
    }

    public boolean isAtEnd() throws java.io.IOException {
        return this.bufferPos == this.bufferSize && !tryRefillBuffer(1);
    }

    private void ensureAvailable(int i) throws java.io.IOException {
        if (this.bufferSize - this.bufferPos < i) {
            refillBuffer(i);
        }
    }

    private void refillBuffer(int i) throws java.io.IOException {
        if (!tryRefillBuffer(i)) {
            throw kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException.truncatedMessage();
        }
    }

    private boolean tryRefillBuffer(int i) throws java.io.IOException {
        int i2 = this.bufferPos;
        if (i2 + i <= this.bufferSize) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(77);
            sb.append("refillBuffer() called when ");
            sb.append(i);
            sb.append(" bytes were already available in buffer");
            throw new java.lang.IllegalStateException(sb.toString());
        }
        if (this.totalBytesRetired + i2 + i > this.currentLimit) {
            return false;
        }
        kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream.RefillCallback refillCallback = this.refillCallback;
        if (refillCallback != null) {
            refillCallback.onRefill();
        }
        if (this.input != null) {
            int i3 = this.bufferPos;
            if (i3 > 0) {
                int i4 = this.bufferSize;
                if (i4 > i3) {
                    byte[] bArr = this.buffer;
                    java.lang.System.arraycopy(bArr, i3, bArr, 0, i4 - i3);
                }
                this.totalBytesRetired += i3;
                this.bufferSize -= i3;
                this.bufferPos = 0;
            }
            java.io.InputStream inputStream = this.input;
            byte[] bArr2 = this.buffer;
            int i5 = this.bufferSize;
            int i6 = inputStream.read(bArr2, i5, bArr2.length - i5);
            if (i6 == 0 || i6 < -1 || i6 > this.buffer.length) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder(102);
                sb2.append("InputStream#read(byte[]) returned invalid result: ");
                sb2.append(i6);
                sb2.append("\nThe InputStream implementation is buggy.");
                throw new java.lang.IllegalStateException(sb2.toString());
            }
            if (i6 > 0) {
                this.bufferSize += i6;
                if ((this.totalBytesRetired + i) - this.sizeLimit > 0) {
                    throw kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException.sizeLimitExceeded();
                }
                recomputeBufferSizeAfterLimit();
                if (this.bufferSize >= i) {
                    return true;
                }
                return tryRefillBuffer(i);
            }
        }
        return false;
    }

    public byte readRawByte() throws java.io.IOException {
        if (this.bufferPos == this.bufferSize) {
            refillBuffer(1);
        }
        byte[] bArr = this.buffer;
        int i = this.bufferPos;
        this.bufferPos = i + 1;
        return bArr[i];
    }

    private byte[] readRawBytesSlowPath(int i) throws java.io.IOException {
        if (i <= 0) {
            if (i == 0) {
                return kotlin.reflect.jvm.internal.impl.protobuf.Internal.EMPTY_BYTE_ARRAY;
            }
            throw kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException.negativeSize();
        }
        int i2 = this.totalBytesRetired;
        int i3 = this.bufferPos;
        int i4 = i2 + i3 + i;
        int i5 = this.currentLimit;
        if (i4 > i5) {
            skipRawBytes((i5 - i2) - i3);
            throw kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException.truncatedMessage();
        }
        if (i < 4096) {
            byte[] bArr = new byte[i];
            int i6 = this.bufferSize - i3;
            java.lang.System.arraycopy(this.buffer, i3, bArr, 0, i6);
            this.bufferPos = this.bufferSize;
            int i7 = i - i6;
            ensureAvailable(i7);
            java.lang.System.arraycopy(this.buffer, 0, bArr, i6, i7);
            this.bufferPos = i7;
            return bArr;
        }
        int i8 = this.bufferSize;
        this.totalBytesRetired = i2 + i8;
        this.bufferPos = 0;
        this.bufferSize = 0;
        int length = i8 - i3;
        int i9 = i - length;
        java.util.ArrayList<byte[]> arrayList = new java.util.ArrayList();
        while (i9 > 0) {
            int iMin = java.lang.Math.min(i9, 4096);
            byte[] bArr2 = new byte[iMin];
            int i10 = 0;
            while (i10 < iMin) {
                java.io.InputStream inputStream = this.input;
                int i11 = inputStream == null ? -1 : inputStream.read(bArr2, i10, iMin - i10);
                if (i11 == -1) {
                    throw kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException.truncatedMessage();
                }
                this.totalBytesRetired += i11;
                i10 += i11;
            }
            i9 -= iMin;
            arrayList.add(bArr2);
        }
        byte[] bArr3 = new byte[i];
        java.lang.System.arraycopy(this.buffer, i3, bArr3, 0, length);
        for (byte[] bArr4 : arrayList) {
            java.lang.System.arraycopy(bArr4, 0, bArr3, length, bArr4.length);
            length += bArr4.length;
        }
        return bArr3;
    }

    public void skipRawBytes(int i) throws java.io.IOException {
        int i2 = this.bufferSize;
        int i3 = this.bufferPos;
        if (i <= i2 - i3 && i >= 0) {
            this.bufferPos = i3 + i;
        } else {
            skipRawBytesSlowPath(i);
        }
    }

    private void skipRawBytesSlowPath(int i) throws java.io.IOException {
        if (i < 0) {
            throw kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException.negativeSize();
        }
        int i2 = this.totalBytesRetired;
        int i3 = this.bufferPos;
        int i4 = i2 + i3 + i;
        int i5 = this.currentLimit;
        if (i4 > i5) {
            skipRawBytes((i5 - i2) - i3);
            throw kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException.truncatedMessage();
        }
        int i6 = this.bufferSize;
        int i7 = i6 - i3;
        this.bufferPos = i6;
        refillBuffer(1);
        while (true) {
            int i8 = i - i7;
            int i9 = this.bufferSize;
            if (i8 > i9) {
                i7 += i9;
                this.bufferPos = i9;
                refillBuffer(1);
            } else {
                this.bufferPos = i8;
                return;
            }
        }
    }
}
