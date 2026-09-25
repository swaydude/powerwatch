package kotlin.reflect.jvm.internal.impl.protobuf;

/* JADX INFO: loaded from: classes2.dex */
class BoundedByteString extends kotlin.reflect.jvm.internal.impl.protobuf.LiteralByteString {
    private final int bytesLength;
    private final int bytesOffset;

    BoundedByteString(byte[] bArr, int i, int i2) {
        super(bArr);
        if (i < 0) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(29);
            sb.append("Offset too small: ");
            sb.append(i);
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        if (i2 < 0) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder(29);
            sb2.append("Length too small: ");
            sb2.append(i);
            throw new java.lang.IllegalArgumentException(sb2.toString());
        }
        if (((long) i) + ((long) i2) > bArr.length) {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder(48);
            sb3.append("Offset+Length too large: ");
            sb3.append(i);
            sb3.append("+");
            sb3.append(i2);
            throw new java.lang.IllegalArgumentException(sb3.toString());
        }
        this.bytesOffset = i;
        this.bytesLength = i2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.LiteralByteString
    public byte byteAt(int i) {
        if (i < 0) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(28);
            sb.append("Index too small: ");
            sb.append(i);
            throw new java.lang.ArrayIndexOutOfBoundsException(sb.toString());
        }
        if (i >= size()) {
            int size = size();
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder(41);
            sb2.append("Index too large: ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(size);
            throw new java.lang.ArrayIndexOutOfBoundsException(sb2.toString());
        }
        return this.bytes[this.bytesOffset + i];
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.LiteralByteString, kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public int size() {
        return this.bytesLength;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.LiteralByteString
    protected int getOffsetIntoBytes() {
        return this.bytesOffset;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.LiteralByteString, kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    protected void copyToInternal(byte[] bArr, int i, int i2, int i3) {
        java.lang.System.arraycopy(this.bytes, getOffsetIntoBytes() + i, bArr, i2, i3);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.LiteralByteString, kotlin.reflect.jvm.internal.impl.protobuf.ByteString, java.lang.Iterable
    public java.util.Iterator<java.lang.Byte> iterator() {
        return new kotlin.reflect.jvm.internal.impl.protobuf.BoundedByteString.BoundedByteIterator();
    }

    private class BoundedByteIterator implements kotlin.reflect.jvm.internal.impl.protobuf.ByteString.ByteIterator {
        private final int limit;
        private int position;

        private BoundedByteIterator() {
            int offsetIntoBytes = kotlin.reflect.jvm.internal.impl.protobuf.BoundedByteString.this.getOffsetIntoBytes();
            this.position = offsetIntoBytes;
            this.limit = offsetIntoBytes + kotlin.reflect.jvm.internal.impl.protobuf.BoundedByteString.this.size();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.position < this.limit;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.Iterator
        public java.lang.Byte next() {
            return java.lang.Byte.valueOf(nextByte());
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString.ByteIterator
        public byte nextByte() {
            if (this.position >= this.limit) {
                throw new java.util.NoSuchElementException();
            }
            byte[] bArr = kotlin.reflect.jvm.internal.impl.protobuf.BoundedByteString.this.bytes;
            int i = this.position;
            this.position = i + 1;
            return bArr[i];
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new java.lang.UnsupportedOperationException();
        }
    }
}
