package kotlin.reflect.jvm.internal.impl.protobuf;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractMessageLite implements kotlin.reflect.jvm.internal.impl.protobuf.MessageLite {
    protected int memoizedHashCode = 0;

    public void writeDelimitedTo(java.io.OutputStream outputStream) throws java.io.IOException {
        int serializedSize = getSerializedSize();
        kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream codedOutputStreamNewInstance = kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.newInstance(outputStream, kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computePreferredBufferSize(kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeRawVarint32Size(serializedSize) + serializedSize));
        codedOutputStreamNewInstance.writeRawVarint32(serializedSize);
        writeTo(codedOutputStreamNewInstance);
        codedOutputStreamNewInstance.flush();
    }

    kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException newUninitializedMessageException() {
        return new kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException(this);
    }

    public static abstract class Builder<BuilderType extends kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder> implements kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder {
        @Override // 
        /* JADX INFO: renamed from: clone */
        public abstract BuilderType mo1266clone();

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
        public abstract BuilderType mergeFrom(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException;

        static final class LimitedInputStream extends java.io.FilterInputStream {
            private int limit;

            LimitedInputStream(java.io.InputStream inputStream, int i) {
                super(inputStream);
                this.limit = i;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int available() throws java.io.IOException {
                return java.lang.Math.min(super.available(), this.limit);
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int read() throws java.io.IOException {
                if (this.limit <= 0) {
                    return -1;
                }
                int i = super.read();
                if (i >= 0) {
                    this.limit--;
                }
                return i;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int read(byte[] bArr, int i, int i2) throws java.io.IOException {
                int i3 = this.limit;
                if (i3 <= 0) {
                    return -1;
                }
                int i4 = super.read(bArr, i, java.lang.Math.min(i2, i3));
                if (i4 >= 0) {
                    this.limit -= i4;
                }
                return i4;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public long skip(long j) throws java.io.IOException {
                long jSkip = super.skip(java.lang.Math.min(j, this.limit));
                if (jSkip >= 0) {
                    this.limit = (int) (((long) this.limit) - jSkip);
                }
                return jSkip;
            }
        }

        protected static kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException newUninitializedMessageException(kotlin.reflect.jvm.internal.impl.protobuf.MessageLite messageLite) {
            return new kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException(messageLite);
        }
    }
}
