package com.crashlytics.android.core;

/* JADX INFO: loaded from: classes.dex */
final class ByteString {
    public static final com.crashlytics.android.core.ByteString EMPTY = new com.crashlytics.android.core.ByteString(new byte[0]);
    private final byte[] bytes;
    private volatile int hash;

    private ByteString(byte[] bArr) {
        this.hash = 0;
        this.bytes = bArr;
    }

    public byte byteAt(int i) {
        return this.bytes[i];
    }

    public int size() {
        return this.bytes.length;
    }

    public boolean isEmpty() {
        return this.bytes.length == 0;
    }

    public static com.crashlytics.android.core.ByteString copyFrom(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        java.lang.System.arraycopy(bArr, i, bArr2, 0, i2);
        return new com.crashlytics.android.core.ByteString(bArr2);
    }

    public static com.crashlytics.android.core.ByteString copyFrom(byte[] bArr) {
        return copyFrom(bArr, 0, bArr.length);
    }

    public static com.crashlytics.android.core.ByteString copyFrom(java.nio.ByteBuffer byteBuffer, int i) {
        byte[] bArr = new byte[i];
        byteBuffer.get(bArr);
        return new com.crashlytics.android.core.ByteString(bArr);
    }

    public static com.crashlytics.android.core.ByteString copyFrom(java.nio.ByteBuffer byteBuffer) {
        return copyFrom(byteBuffer, byteBuffer.remaining());
    }

    public static com.crashlytics.android.core.ByteString copyFrom(java.lang.String str, java.lang.String str2) throws java.io.UnsupportedEncodingException {
        return new com.crashlytics.android.core.ByteString(str.getBytes(str2));
    }

    public static com.crashlytics.android.core.ByteString copyFromUtf8(java.lang.String str) {
        try {
            return new com.crashlytics.android.core.ByteString(str.getBytes(io.fabric.sdk.android.services.network.HttpRequest.CHARSET_UTF8));
        } catch (java.io.UnsupportedEncodingException e) {
            throw new java.lang.RuntimeException("UTF-8 not supported.", e);
        }
    }

    public static com.crashlytics.android.core.ByteString copyFrom(java.util.List<com.crashlytics.android.core.ByteString> list) {
        if (list.size() == 0) {
            return EMPTY;
        }
        if (list.size() == 1) {
            return list.get(0);
        }
        java.util.Iterator<com.crashlytics.android.core.ByteString> it = list.iterator();
        int size = 0;
        while (it.hasNext()) {
            size += it.next().size();
        }
        byte[] bArr = new byte[size];
        int size2 = 0;
        for (com.crashlytics.android.core.ByteString byteString : list) {
            java.lang.System.arraycopy(byteString.bytes, 0, bArr, size2, byteString.size());
            size2 += byteString.size();
        }
        return new com.crashlytics.android.core.ByteString(bArr);
    }

    public void copyTo(byte[] bArr, int i) {
        byte[] bArr2 = this.bytes;
        java.lang.System.arraycopy(bArr2, 0, bArr, i, bArr2.length);
    }

    public void copyTo(byte[] bArr, int i, int i2, int i3) {
        java.lang.System.arraycopy(this.bytes, i, bArr, i2, i3);
    }

    public void copyTo(java.nio.ByteBuffer byteBuffer) {
        byte[] bArr = this.bytes;
        byteBuffer.put(bArr, 0, bArr.length);
    }

    public byte[] toByteArray() {
        byte[] bArr = this.bytes;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        java.lang.System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    public java.nio.ByteBuffer asReadOnlyByteBuffer() {
        return java.nio.ByteBuffer.wrap(this.bytes).asReadOnlyBuffer();
    }

    public java.lang.String toString(java.lang.String str) throws java.io.UnsupportedEncodingException {
        return new java.lang.String(this.bytes, str);
    }

    public java.lang.String toStringUtf8() {
        try {
            return new java.lang.String(this.bytes, io.fabric.sdk.android.services.network.HttpRequest.CHARSET_UTF8);
        } catch (java.io.UnsupportedEncodingException e) {
            throw new java.lang.RuntimeException("UTF-8 not supported?", e);
        }
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.crashlytics.android.core.ByteString)) {
            return false;
        }
        byte[] bArr = this.bytes;
        int length = bArr.length;
        byte[] bArr2 = ((com.crashlytics.android.core.ByteString) obj).bytes;
        if (length != bArr2.length) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            if (bArr[i] != bArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = this.hash;
        if (i == 0) {
            byte[] bArr = this.bytes;
            int length = bArr.length;
            for (byte b : bArr) {
                length = (length * 31) + b;
            }
            i = length == 0 ? 1 : length;
            this.hash = i;
        }
        return i;
    }

    public java.io.InputStream newInput() {
        return new java.io.ByteArrayInputStream(this.bytes);
    }

    public static com.crashlytics.android.core.ByteString.Output newOutput(int i) {
        return new com.crashlytics.android.core.ByteString.Output(new java.io.ByteArrayOutputStream(i));
    }

    public static com.crashlytics.android.core.ByteString.Output newOutput() {
        return newOutput(32);
    }

    static final class Output extends java.io.FilterOutputStream {
        private final java.io.ByteArrayOutputStream bout;

        private Output(java.io.ByteArrayOutputStream byteArrayOutputStream) {
            super(byteArrayOutputStream);
            this.bout = byteArrayOutputStream;
        }

        public com.crashlytics.android.core.ByteString toByteString() {
            return new com.crashlytics.android.core.ByteString(this.bout.toByteArray());
        }
    }

    static com.crashlytics.android.core.ByteString.CodedBuilder newCodedBuilder(int i) {
        return new com.crashlytics.android.core.ByteString.CodedBuilder(i);
    }

    static final class CodedBuilder {
        private final byte[] buffer;
        private final com.crashlytics.android.core.CodedOutputStream output;

        private CodedBuilder(int i) {
            byte[] bArr = new byte[i];
            this.buffer = bArr;
            this.output = com.crashlytics.android.core.CodedOutputStream.newInstance(bArr);
        }

        public com.crashlytics.android.core.ByteString build() {
            this.output.checkNoSpaceLeft();
            return new com.crashlytics.android.core.ByteString(this.buffer);
        }

        public com.crashlytics.android.core.CodedOutputStream getCodedOutput() {
            return this.output;
        }
    }
}
