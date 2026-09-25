package kotlin.reflect.jvm.internal.impl.protobuf;

/* JADX INFO: loaded from: classes2.dex */
public class InvalidProtocolBufferException extends java.io.IOException {
    private kotlin.reflect.jvm.internal.impl.protobuf.MessageLite unfinishedMessage;

    public InvalidProtocolBufferException(java.lang.String str) {
        super(str);
        this.unfinishedMessage = null;
    }

    public kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException setUnfinishedMessage(kotlin.reflect.jvm.internal.impl.protobuf.MessageLite messageLite) {
        this.unfinishedMessage = messageLite;
        return this;
    }

    public kotlin.reflect.jvm.internal.impl.protobuf.MessageLite getUnfinishedMessage() {
        return this.unfinishedMessage;
    }

    static kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException truncatedMessage() {
        return new kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
    }

    static kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException negativeSize() {
        return new kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException malformedVarint() {
        return new kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException("CodedInputStream encountered a malformed varint.");
    }

    static kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException invalidTag() {
        return new kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException("Protocol message contained an invalid tag (zero).");
    }

    static kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException invalidEndTag() {
        return new kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
    }

    static kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException invalidWireType() {
        return new kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException("Protocol message tag had invalid wire type.");
    }

    static kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException recursionLimitExceeded() {
        return new kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    static kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException sizeLimitExceeded() {
        return new kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    static kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException invalidUtf8() {
        return new kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException("Protocol message had invalid UTF-8.");
    }
}
