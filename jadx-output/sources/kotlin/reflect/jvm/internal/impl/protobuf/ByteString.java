package kotlin.reflect.jvm.internal.impl.protobuf;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ByteString implements java.lang.Iterable<java.lang.Byte> {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final kotlin.reflect.jvm.internal.impl.protobuf.ByteString EMPTY = new kotlin.reflect.jvm.internal.impl.protobuf.LiteralByteString(new byte[0]);

    public interface ByteIterator extends java.util.Iterator<java.lang.Byte> {
        byte nextByte();
    }

    protected abstract void copyToInternal(byte[] bArr, int i, int i2, int i3);

    protected abstract int getTreeDepth();

    protected abstract boolean isBalanced();

    public abstract boolean isValidUtf8();

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.lang.Iterable
    public abstract java.util.Iterator<java.lang.Byte> iterator();

    public abstract kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream newCodedInput();

    protected abstract int partialHash(int i, int i2, int i3);

    protected abstract int partialIsValidUtf8(int i, int i2, int i3);

    protected abstract int peekCachedHashCode();

    public abstract int size();

    public abstract java.lang.String toString(java.lang.String str) throws java.io.UnsupportedEncodingException;

    abstract void writeToInternal(java.io.OutputStream outputStream, int i, int i2) throws java.io.IOException;

    ByteString() {
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public static kotlin.reflect.jvm.internal.impl.protobuf.ByteString copyFrom(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        java.lang.System.arraycopy(bArr, i, bArr2, 0, i2);
        return new kotlin.reflect.jvm.internal.impl.protobuf.LiteralByteString(bArr2);
    }

    public static kotlin.reflect.jvm.internal.impl.protobuf.ByteString copyFrom(byte[] bArr) {
        return copyFrom(bArr, 0, bArr.length);
    }

    public static kotlin.reflect.jvm.internal.impl.protobuf.ByteString copyFromUtf8(java.lang.String str) {
        try {
            return new kotlin.reflect.jvm.internal.impl.protobuf.LiteralByteString(str.getBytes(io.fabric.sdk.android.services.network.HttpRequest.CHARSET_UTF8));
        } catch (java.io.UnsupportedEncodingException e) {
            throw new java.lang.RuntimeException("UTF-8 not supported?", e);
        }
    }

    public kotlin.reflect.jvm.internal.impl.protobuf.ByteString concat(kotlin.reflect.jvm.internal.impl.protobuf.ByteString byteString) {
        int size = size();
        int size2 = byteString.size();
        if (((long) size) + ((long) size2) >= 2147483647L) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(53);
            sb.append("ByteString would be too long: ");
            sb.append(size);
            sb.append("+");
            sb.append(size2);
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        return kotlin.reflect.jvm.internal.impl.protobuf.RopeByteString.concatenate(this, byteString);
    }

    public static kotlin.reflect.jvm.internal.impl.protobuf.ByteString copyFrom(java.lang.Iterable<kotlin.reflect.jvm.internal.impl.protobuf.ByteString> iterable) {
        java.util.Collection arrayList;
        if (!(iterable instanceof java.util.Collection)) {
            arrayList = new java.util.ArrayList();
            java.util.Iterator<kotlin.reflect.jvm.internal.impl.protobuf.ByteString> it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
        } else {
            arrayList = (java.util.Collection) iterable;
        }
        if (arrayList.isEmpty()) {
            return EMPTY;
        }
        return balancedConcat(arrayList.iterator(), arrayList.size());
    }

    private static kotlin.reflect.jvm.internal.impl.protobuf.ByteString balancedConcat(java.util.Iterator<kotlin.reflect.jvm.internal.impl.protobuf.ByteString> it, int i) {
        if (i == 1) {
            return it.next();
        }
        int i2 = i >>> 1;
        return balancedConcat(it, i2).concat(balancedConcat(it, i - i2));
    }

    public void copyTo(byte[] bArr, int i, int i2, int i3) {
        if (i < 0) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(30);
            sb.append("Source offset < 0: ");
            sb.append(i);
            throw new java.lang.IndexOutOfBoundsException(sb.toString());
        }
        if (i2 < 0) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder(30);
            sb2.append("Target offset < 0: ");
            sb2.append(i2);
            throw new java.lang.IndexOutOfBoundsException(sb2.toString());
        }
        if (i3 < 0) {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder(23);
            sb3.append("Length < 0: ");
            sb3.append(i3);
            throw new java.lang.IndexOutOfBoundsException(sb3.toString());
        }
        int i4 = i + i3;
        if (i4 > size()) {
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder(34);
            sb4.append("Source end offset < 0: ");
            sb4.append(i4);
            throw new java.lang.IndexOutOfBoundsException(sb4.toString());
        }
        int i5 = i2 + i3;
        if (i5 <= bArr.length) {
            if (i3 > 0) {
                copyToInternal(bArr, i, i2, i3);
            }
        } else {
            java.lang.StringBuilder sb5 = new java.lang.StringBuilder(34);
            sb5.append("Target end offset < 0: ");
            sb5.append(i5);
            throw new java.lang.IndexOutOfBoundsException(sb5.toString());
        }
    }

    public byte[] toByteArray() {
        int size = size();
        if (size == 0) {
            return kotlin.reflect.jvm.internal.impl.protobuf.Internal.EMPTY_BYTE_ARRAY;
        }
        byte[] bArr = new byte[size];
        copyToInternal(bArr, 0, 0, size);
        return bArr;
    }

    void writeTo(java.io.OutputStream outputStream, int i, int i2) throws java.io.IOException {
        if (i < 0) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(30);
            sb.append("Source offset < 0: ");
            sb.append(i);
            throw new java.lang.IndexOutOfBoundsException(sb.toString());
        }
        if (i2 < 0) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder(23);
            sb2.append("Length < 0: ");
            sb2.append(i2);
            throw new java.lang.IndexOutOfBoundsException(sb2.toString());
        }
        int i3 = i + i2;
        if (i3 <= size()) {
            if (i2 > 0) {
                writeToInternal(outputStream, i, i2);
            }
        } else {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder(39);
            sb3.append("Source end offset exceeded: ");
            sb3.append(i3);
            throw new java.lang.IndexOutOfBoundsException(sb3.toString());
        }
    }

    public java.lang.String toStringUtf8() {
        try {
            return toString(io.fabric.sdk.android.services.network.HttpRequest.CHARSET_UTF8);
        } catch (java.io.UnsupportedEncodingException e) {
            throw new java.lang.RuntimeException("UTF-8 not supported?", e);
        }
    }

    public static kotlin.reflect.jvm.internal.impl.protobuf.ByteString.Output newOutput() {
        return new kotlin.reflect.jvm.internal.impl.protobuf.ByteString.Output(128);
    }

    public static final class Output extends java.io.OutputStream {
        private static final byte[] EMPTY_BYTE_ARRAY = new byte[0];
        private byte[] buffer;
        private int bufferPos;
        private final java.util.ArrayList<kotlin.reflect.jvm.internal.impl.protobuf.ByteString> flushedBuffers;
        private int flushedBuffersTotalBytes;
        private final int initialCapacity;

        Output(int i) {
            if (i < 0) {
                throw new java.lang.IllegalArgumentException("Buffer size < 0");
            }
            this.initialCapacity = i;
            this.flushedBuffers = new java.util.ArrayList<>();
            this.buffer = new byte[i];
        }

        @Override // java.io.OutputStream
        public synchronized void write(int i) {
            if (this.bufferPos == this.buffer.length) {
                flushFullBuffer(1);
            }
            byte[] bArr = this.buffer;
            int i2 = this.bufferPos;
            this.bufferPos = i2 + 1;
            bArr[i2] = (byte) i;
        }

        @Override // java.io.OutputStream
        public synchronized void write(byte[] bArr, int i, int i2) {
            byte[] bArr2 = this.buffer;
            int length = bArr2.length;
            int i3 = this.bufferPos;
            if (i2 <= length - i3) {
                java.lang.System.arraycopy(bArr, i, bArr2, i3, i2);
                this.bufferPos += i2;
            } else {
                int length2 = bArr2.length - i3;
                java.lang.System.arraycopy(bArr, i, bArr2, i3, length2);
                int i4 = i2 - length2;
                flushFullBuffer(i4);
                java.lang.System.arraycopy(bArr, i + length2, this.buffer, 0, i4);
                this.bufferPos = i4;
            }
        }

        public synchronized kotlin.reflect.jvm.internal.impl.protobuf.ByteString toByteString() {
            flushLastBuffer();
            return kotlin.reflect.jvm.internal.impl.protobuf.ByteString.copyFrom(this.flushedBuffers);
        }

        private byte[] copyArray(byte[] bArr, int i) {
            byte[] bArr2 = new byte[i];
            java.lang.System.arraycopy(bArr, 0, bArr2, 0, java.lang.Math.min(bArr.length, i));
            return bArr2;
        }

        public synchronized int size() {
            return this.flushedBuffersTotalBytes + this.bufferPos;
        }

        public java.lang.String toString() {
            return java.lang.String.format("<ByteString.Output@%s size=%d>", java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)), java.lang.Integer.valueOf(size()));
        }

        private void flushFullBuffer(int i) {
            this.flushedBuffers.add(new kotlin.reflect.jvm.internal.impl.protobuf.LiteralByteString(this.buffer));
            int length = this.flushedBuffersTotalBytes + this.buffer.length;
            this.flushedBuffersTotalBytes = length;
            this.buffer = new byte[java.lang.Math.max(this.initialCapacity, java.lang.Math.max(i, length >>> 1))];
            this.bufferPos = 0;
        }

        private void flushLastBuffer() {
            int i = this.bufferPos;
            byte[] bArr = this.buffer;
            if (i >= bArr.length) {
                this.flushedBuffers.add(new kotlin.reflect.jvm.internal.impl.protobuf.LiteralByteString(this.buffer));
                this.buffer = EMPTY_BYTE_ARRAY;
            } else if (i > 0) {
                this.flushedBuffers.add(new kotlin.reflect.jvm.internal.impl.protobuf.LiteralByteString(copyArray(bArr, i)));
            }
            this.flushedBuffersTotalBytes += this.bufferPos;
            this.bufferPos = 0;
        }
    }

    public java.lang.String toString() {
        return java.lang.String.format("<ByteString@%s size=%d>", java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)), java.lang.Integer.valueOf(size()));
    }
}
