package kotlin.reflect.jvm.internal.impl.protobuf;

/* JADX INFO: loaded from: classes2.dex */
public class LazyFieldLite {
    private kotlin.reflect.jvm.internal.impl.protobuf.ByteString bytes;
    private kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistry;
    private volatile boolean isDirty;
    protected volatile kotlin.reflect.jvm.internal.impl.protobuf.MessageLite value;

    public kotlin.reflect.jvm.internal.impl.protobuf.MessageLite getValue(kotlin.reflect.jvm.internal.impl.protobuf.MessageLite messageLite) {
        ensureInitialized(messageLite);
        return this.value;
    }

    public kotlin.reflect.jvm.internal.impl.protobuf.MessageLite setValue(kotlin.reflect.jvm.internal.impl.protobuf.MessageLite messageLite) {
        kotlin.reflect.jvm.internal.impl.protobuf.MessageLite messageLite2 = this.value;
        this.value = messageLite;
        this.bytes = null;
        this.isDirty = true;
        return messageLite2;
    }

    public int getSerializedSize() {
        if (this.isDirty) {
            return this.value.getSerializedSize();
        }
        return this.bytes.size();
    }

    protected void ensureInitialized(kotlin.reflect.jvm.internal.impl.protobuf.MessageLite messageLite) {
        if (this.value != null) {
            return;
        }
        synchronized (this) {
            if (this.value != null) {
                return;
            }
            try {
                if (this.bytes != null) {
                    this.value = messageLite.getParserForType().parseFrom(this.bytes, this.extensionRegistry);
                } else {
                    this.value = messageLite;
                }
            } catch (java.io.IOException unused) {
            }
        }
    }
}
