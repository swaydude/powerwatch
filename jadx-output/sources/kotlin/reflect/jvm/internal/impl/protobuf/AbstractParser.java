package kotlin.reflect.jvm.internal.impl.protobuf;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractParser<MessageType extends kotlin.reflect.jvm.internal.impl.protobuf.MessageLite> implements kotlin.reflect.jvm.internal.impl.protobuf.Parser<MessageType> {
    private static final kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite EMPTY_REGISTRY = kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite.getEmptyRegistry();

    private kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException newUninitializedMessageException(MessageType messagetype) {
        if (messagetype instanceof kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite) {
            return ((kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite) messagetype).newUninitializedMessageException();
        }
        return new kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException(messagetype);
    }

    private MessageType checkMessageInitialized(MessageType messagetype) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
        if (messagetype == null || messagetype.isInitialized()) {
            return messagetype;
        }
        throw newUninitializedMessageException(messagetype).asInvalidProtocolBufferException().setUnfinishedMessage(messagetype);
    }

    public MessageType parsePartialFrom(kotlin.reflect.jvm.internal.impl.protobuf.ByteString byteString, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
        try {
            kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStreamNewCodedInput = byteString.newCodedInput();
            MessageType partialFrom = parsePartialFrom(codedInputStreamNewCodedInput, extensionRegistryLite);
            try {
                codedInputStreamNewCodedInput.checkLastTagWas(0);
                return partialFrom;
            } catch (kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(partialFrom);
            }
        } catch (kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException e2) {
            throw e2;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
    public MessageType parseFrom(kotlin.reflect.jvm.internal.impl.protobuf.ByteString byteString, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
        return (MessageType) checkMessageInitialized(parsePartialFrom(byteString, extensionRegistryLite));
    }

    public MessageType parsePartialFrom(java.io.InputStream inputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
        kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStreamNewInstance = kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream.newInstance(inputStream);
        MessageType partialFrom = parsePartialFrom(codedInputStreamNewInstance, extensionRegistryLite);
        try {
            codedInputStreamNewInstance.checkLastTagWas(0);
            return partialFrom;
        } catch (kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(partialFrom);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
    public MessageType parseFrom(java.io.InputStream inputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
        return (MessageType) checkMessageInitialized(parsePartialFrom(inputStream, extensionRegistryLite));
    }

    public MessageType parsePartialDelimitedFrom(java.io.InputStream inputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
        try {
            int i = inputStream.read();
            if (i == -1) {
                return null;
            }
            return (MessageType) parsePartialFrom(new kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder.LimitedInputStream(inputStream, kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream.readRawVarint32(i, inputStream)), extensionRegistryLite);
        } catch (java.io.IOException e) {
            throw new kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException(e.getMessage());
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
    public MessageType parseDelimitedFrom(java.io.InputStream inputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
        return (MessageType) checkMessageInitialized(parsePartialDelimitedFrom(inputStream, extensionRegistryLite));
    }
}
