package kotlin.reflect.jvm.internal.impl.protobuf;

/* JADX INFO: loaded from: classes2.dex */
public abstract class GeneratedMessageLite extends kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite implements java.io.Serializable {

    public interface ExtendableMessageOrBuilder<MessageType extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage> extends kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder {
    }

    protected void makeExtensionsImmutable() {
    }

    protected GeneratedMessageLite() {
    }

    protected GeneratedMessageLite(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder builder) {
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
    public kotlin.reflect.jvm.internal.impl.protobuf.Parser<? extends kotlin.reflect.jvm.internal.impl.protobuf.MessageLite> getParserForType() {
        throw new java.lang.UnsupportedOperationException("This is supposed to be overridden by subclasses.");
    }

    protected boolean parseUnknownField(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream codedOutputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite, int i) throws java.io.IOException {
        return codedInputStream.skipField(i, codedOutputStream);
    }

    public static abstract class Builder<MessageType extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, BuilderType extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder> extends kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder<BuilderType> {
        private kotlin.reflect.jvm.internal.impl.protobuf.ByteString unknownFields = kotlin.reflect.jvm.internal.impl.protobuf.ByteString.EMPTY;

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public abstract MessageType getDefaultInstanceForType();

        public abstract BuilderType mergeFrom(MessageType messagetype);

        protected Builder() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
        /* JADX INFO: renamed from: clone */
        public BuilderType mo1266clone() {
            throw new java.lang.UnsupportedOperationException("This is supposed to be overridden by subclasses.");
        }

        public final kotlin.reflect.jvm.internal.impl.protobuf.ByteString getUnknownFields() {
            return this.unknownFields;
        }

        public final BuilderType setUnknownFields(kotlin.reflect.jvm.internal.impl.protobuf.ByteString byteString) {
            this.unknownFields = byteString;
            return this;
        }
    }

    public static abstract class ExtendableMessage<MessageType extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage<MessageType>> extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite implements kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder<MessageType> {
        private final kotlin.reflect.jvm.internal.impl.protobuf.FieldSet<kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtensionDescriptor> extensions;

        protected ExtendableMessage() {
            this.extensions = kotlin.reflect.jvm.internal.impl.protobuf.FieldSet.newFieldSet();
        }

        protected ExtendableMessage(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder<MessageType, ?> extendableBuilder) {
            this.extensions = extendableBuilder.buildExtensions();
        }

        private void verifyExtensionContainingType(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.GeneratedExtension<MessageType, ?> generatedExtension) {
            if (generatedExtension.getContainingTypeDefaultInstance() != getDefaultInstanceForType()) {
                throw new java.lang.IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final <Type> boolean hasExtension(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.GeneratedExtension<MessageType, Type> generatedExtension) {
            verifyExtensionContainingType(generatedExtension);
            return this.extensions.hasField(generatedExtension.descriptor);
        }

        public final <Type> int getExtensionCount(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.GeneratedExtension<MessageType, java.util.List<Type>> generatedExtension) {
            verifyExtensionContainingType(generatedExtension);
            return this.extensions.getRepeatedFieldCount(generatedExtension.descriptor);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final <Type> Type getExtension(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.GeneratedExtension<MessageType, Type> generatedExtension) {
            verifyExtensionContainingType(generatedExtension);
            java.lang.Object field = this.extensions.getField(generatedExtension.descriptor);
            if (field == null) {
                return generatedExtension.defaultValue;
            }
            return (Type) generatedExtension.fromFieldSetType(field);
        }

        public final <Type> Type getExtension(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.GeneratedExtension<MessageType, java.util.List<Type>> generatedExtension, int i) {
            verifyExtensionContainingType(generatedExtension);
            return (Type) generatedExtension.singularFromFieldSetType(this.extensions.getRepeatedField(generatedExtension.descriptor, i));
        }

        protected boolean extensionsAreInitialized() {
            return this.extensions.isInitialized();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
        protected boolean parseUnknownField(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream codedOutputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite, int i) throws java.io.IOException {
            return kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.parseUnknownField(this.extensions, getDefaultInstanceForType(), codedInputStream, codedOutputStream, extensionRegistryLite, i);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
        protected void makeExtensionsImmutable() {
            this.extensions.makeImmutable();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public class ExtensionWriter {
            private final java.util.Iterator<java.util.Map.Entry<kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtensionDescriptor, java.lang.Object>> iter;
            private final boolean messageSetWireFormat;
            private java.util.Map.Entry<kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtensionDescriptor, java.lang.Object> next;

            /* synthetic */ ExtensionWriter(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage extendableMessage, boolean z, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.AnonymousClass1 anonymousClass1) {
                this(z);
            }

            private ExtensionWriter(boolean z) {
                java.util.Iterator<java.util.Map.Entry<kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtensionDescriptor, java.lang.Object>> it = kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage.this.extensions.iterator();
                this.iter = it;
                if (it.hasNext()) {
                    this.next = it.next();
                }
                this.messageSetWireFormat = z;
            }

            public void writeUntil(int i, kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream codedOutputStream) throws java.io.IOException {
                while (true) {
                    java.util.Map.Entry<kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtensionDescriptor, java.lang.Object> entry = this.next;
                    if (entry == null || entry.getKey().getNumber() >= i) {
                        return;
                    }
                    kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtensionDescriptor key = this.next.getKey();
                    if (this.messageSetWireFormat && key.getLiteJavaType() == kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType.MESSAGE && !key.isRepeated()) {
                        codedOutputStream.writeMessageSetExtension(key.getNumber(), (kotlin.reflect.jvm.internal.impl.protobuf.MessageLite) this.next.getValue());
                    } else {
                        kotlin.reflect.jvm.internal.impl.protobuf.FieldSet.writeField(key, this.next.getValue(), codedOutputStream);
                    }
                    if (this.iter.hasNext()) {
                        this.next = this.iter.next();
                    } else {
                        this.next = null;
                    }
                }
            }
        }

        protected kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage<MessageType>.ExtensionWriter newExtensionWriter() {
            return new kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage.ExtensionWriter(this, false, null);
        }

        protected int extensionsSerializedSize() {
            return this.extensions.getSerializedSize();
        }
    }

    public static abstract class ExtendableBuilder<MessageType extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage<MessageType>, BuilderType extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder<MessageType, BuilderType>> extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder<MessageType, BuilderType> implements kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder<MessageType> {
        private kotlin.reflect.jvm.internal.impl.protobuf.FieldSet<kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtensionDescriptor> extensions = kotlin.reflect.jvm.internal.impl.protobuf.FieldSet.emptySet();
        private boolean extensionsIsMutable;

        protected ExtendableBuilder() {
        }

        private void ensureExtensionsIsMutable() {
            if (this.extensionsIsMutable) {
                return;
            }
            this.extensions = this.extensions.clone();
            this.extensionsIsMutable = true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public kotlin.reflect.jvm.internal.impl.protobuf.FieldSet<kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtensionDescriptor> buildExtensions() {
            this.extensions.makeImmutable();
            this.extensionsIsMutable = false;
            return this.extensions;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
        /* JADX INFO: renamed from: clone */
        public BuilderType mo1266clone() {
            throw new java.lang.UnsupportedOperationException("This is supposed to be overridden by subclasses.");
        }

        protected boolean extensionsAreInitialized() {
            return this.extensions.isInitialized();
        }

        protected final void mergeExtensionFields(MessageType messagetype) {
            ensureExtensionsIsMutable();
            this.extensions.mergeFrom(((kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage) messagetype).extensions);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:4:0x0010  */
    public static <MessageType extends kotlin.reflect.jvm.internal.impl.protobuf.MessageLite> boolean parseUnknownField(kotlin.reflect.jvm.internal.impl.protobuf.FieldSet<kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtensionDescriptor> fieldSet, MessageType messagetype, kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream codedOutputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite, int i) throws java.io.IOException {
        boolean z;
        boolean z2;
        java.lang.Object objBuild;
        kotlin.reflect.jvm.internal.impl.protobuf.MessageLite messageLite;
        int tagWireType = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.getTagWireType(i);
        kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.GeneratedExtension generatedExtensionFindLiteExtensionByNumber = extensionRegistryLite.findLiteExtensionByNumber(messagetype, kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.getTagFieldNumber(i));
        if (generatedExtensionFindLiteExtensionByNumber == null) {
            z = true;
            z2 = false;
        } else if (tagWireType == kotlin.reflect.jvm.internal.impl.protobuf.FieldSet.getWireFormatForFieldType(generatedExtensionFindLiteExtensionByNumber.descriptor.getLiteType(), false)) {
            z = false;
            z2 = false;
        } else if (generatedExtensionFindLiteExtensionByNumber.descriptor.isRepeated && generatedExtensionFindLiteExtensionByNumber.descriptor.type.isPackable() && tagWireType == kotlin.reflect.jvm.internal.impl.protobuf.FieldSet.getWireFormatForFieldType(generatedExtensionFindLiteExtensionByNumber.descriptor.getLiteType(), true)) {
            z = false;
            z2 = true;
        } else {
            z = true;
            z2 = false;
        }
        if (z) {
            return codedInputStream.skipField(i, codedOutputStream);
        }
        if (z2) {
            int iPushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
            if (generatedExtensionFindLiteExtensionByNumber.descriptor.getLiteType() == kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType.ENUM) {
                while (codedInputStream.getBytesUntilLimit() > 0) {
                    kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite enumLiteFindValueByNumber = generatedExtensionFindLiteExtensionByNumber.descriptor.getEnumType().findValueByNumber(codedInputStream.readEnum());
                    if (enumLiteFindValueByNumber == null) {
                        return true;
                    }
                    fieldSet.addRepeatedField(generatedExtensionFindLiteExtensionByNumber.descriptor, generatedExtensionFindLiteExtensionByNumber.singularToFieldSetType(enumLiteFindValueByNumber));
                }
            } else {
                while (codedInputStream.getBytesUntilLimit() > 0) {
                    fieldSet.addRepeatedField(generatedExtensionFindLiteExtensionByNumber.descriptor, kotlin.reflect.jvm.internal.impl.protobuf.FieldSet.readPrimitiveField(codedInputStream, generatedExtensionFindLiteExtensionByNumber.descriptor.getLiteType(), false));
                }
            }
            codedInputStream.popLimit(iPushLimit);
        } else {
            int i2 = kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$JavaType[generatedExtensionFindLiteExtensionByNumber.descriptor.getLiteJavaType().ordinal()];
            if (i2 == 1) {
                kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder builderNewBuilderForType = null;
                if (!generatedExtensionFindLiteExtensionByNumber.descriptor.isRepeated() && (messageLite = (kotlin.reflect.jvm.internal.impl.protobuf.MessageLite) fieldSet.getField(generatedExtensionFindLiteExtensionByNumber.descriptor)) != null) {
                    builderNewBuilderForType = messageLite.toBuilder();
                }
                if (builderNewBuilderForType == null) {
                    builderNewBuilderForType = generatedExtensionFindLiteExtensionByNumber.getMessageDefaultInstance().newBuilderForType();
                }
                if (generatedExtensionFindLiteExtensionByNumber.descriptor.getLiteType() == kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType.GROUP) {
                    codedInputStream.readGroup(generatedExtensionFindLiteExtensionByNumber.getNumber(), builderNewBuilderForType, extensionRegistryLite);
                } else {
                    codedInputStream.readMessage(builderNewBuilderForType, extensionRegistryLite);
                }
                objBuild = builderNewBuilderForType.build();
            } else if (i2 == 2) {
                int i3 = codedInputStream.readEnum();
                kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite enumLiteFindValueByNumber2 = generatedExtensionFindLiteExtensionByNumber.descriptor.getEnumType().findValueByNumber(i3);
                if (enumLiteFindValueByNumber2 == null) {
                    codedOutputStream.writeRawVarint32(i);
                    codedOutputStream.writeUInt32NoTag(i3);
                    return true;
                }
                objBuild = enumLiteFindValueByNumber2;
            } else {
                objBuild = kotlin.reflect.jvm.internal.impl.protobuf.FieldSet.readPrimitiveField(codedInputStream, generatedExtensionFindLiteExtensionByNumber.descriptor.getLiteType(), false);
            }
            if (generatedExtensionFindLiteExtensionByNumber.descriptor.isRepeated()) {
                fieldSet.addRepeatedField(generatedExtensionFindLiteExtensionByNumber.descriptor, generatedExtensionFindLiteExtensionByNumber.singularToFieldSetType(objBuild));
            } else {
                fieldSet.setField(generatedExtensionFindLiteExtensionByNumber.descriptor, generatedExtensionFindLiteExtensionByNumber.singularToFieldSetType(objBuild));
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$JavaType;

        static {
            int[] iArr = new int[kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType.values().length];
            $SwitchMap$com$google$protobuf$WireFormat$JavaType = iArr;
            try {
                iArr[kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType.MESSAGE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$JavaType[kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType.ENUM.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
        }
    }

    public static <ContainingType extends kotlin.reflect.jvm.internal.impl.protobuf.MessageLite, Type> kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.GeneratedExtension<ContainingType, Type> newSingularGeneratedExtension(ContainingType containingtype, Type type, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite messageLite, kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap<?> enumLiteMap, int i, kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType fieldType, java.lang.Class cls) {
        return new kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.GeneratedExtension<>(containingtype, type, messageLite, new kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtensionDescriptor(enumLiteMap, i, fieldType, false, false), cls);
    }

    public static <ContainingType extends kotlin.reflect.jvm.internal.impl.protobuf.MessageLite, Type> kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.GeneratedExtension<ContainingType, Type> newRepeatedGeneratedExtension(ContainingType containingtype, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite messageLite, kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap<?> enumLiteMap, int i, kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType fieldType, boolean z, java.lang.Class cls) {
        return new kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.GeneratedExtension<>(containingtype, java.util.Collections.emptyList(), messageLite, new kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtensionDescriptor(enumLiteMap, i, fieldType, true, z), cls);
    }

    static final class ExtensionDescriptor implements kotlin.reflect.jvm.internal.impl.protobuf.FieldSet.FieldDescriptorLite<kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtensionDescriptor> {
        final kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap<?> enumTypeMap;
        final boolean isPacked;
        final boolean isRepeated;
        final int number;
        final kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType type;

        ExtensionDescriptor(kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap<?> enumLiteMap, int i, kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType fieldType, boolean z, boolean z2) {
            this.enumTypeMap = enumLiteMap;
            this.number = i;
            this.type = fieldType;
            this.isRepeated = z;
            this.isPacked = z2;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.FieldSet.FieldDescriptorLite
        public int getNumber() {
            return this.number;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.FieldSet.FieldDescriptorLite
        public kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType getLiteType() {
            return this.type;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.FieldSet.FieldDescriptorLite
        public kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType getLiteJavaType() {
            return this.type.getJavaType();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.FieldSet.FieldDescriptorLite
        public boolean isRepeated() {
            return this.isRepeated;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.FieldSet.FieldDescriptorLite
        public boolean isPacked() {
            return this.isPacked;
        }

        public kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap<?> getEnumType() {
            return this.enumTypeMap;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.FieldSet.FieldDescriptorLite
        public kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder internalMergeFrom(kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite messageLite) {
            return ((kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder) builder).mergeFrom((kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite) messageLite);
        }

        @Override // java.lang.Comparable
        public int compareTo(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtensionDescriptor extensionDescriptor) {
            return this.number - extensionDescriptor.number;
        }
    }

    static java.lang.reflect.Method getMethodOrDie(java.lang.Class cls, java.lang.String str, java.lang.Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (java.lang.NoSuchMethodException e) {
            java.lang.String strValueOf = java.lang.String.valueOf(java.lang.String.valueOf(cls.getName()));
            java.lang.String strValueOf2 = java.lang.String.valueOf(java.lang.String.valueOf(str));
            java.lang.StringBuilder sb = new java.lang.StringBuilder(strValueOf.length() + 45 + strValueOf2.length());
            sb.append("Generated message class \"");
            sb.append(strValueOf);
            sb.append("\" missing method \"");
            sb.append(strValueOf2);
            sb.append("\".");
            throw new java.lang.RuntimeException(sb.toString(), e);
        }
    }

    static java.lang.Object invokeOrDie(java.lang.reflect.Method method, java.lang.Object obj, java.lang.Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (java.lang.IllegalAccessException e) {
            throw new java.lang.RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (java.lang.reflect.InvocationTargetException e2) {
            java.lang.Throwable cause = e2.getCause();
            if (cause instanceof java.lang.RuntimeException) {
                throw ((java.lang.RuntimeException) cause);
            }
            if (cause instanceof java.lang.Error) {
                throw ((java.lang.Error) cause);
            }
            throw new java.lang.RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static class GeneratedExtension<ContainingType extends kotlin.reflect.jvm.internal.impl.protobuf.MessageLite, Type> {
        final ContainingType containingTypeDefaultInstance;
        final Type defaultValue;
        final kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtensionDescriptor descriptor;
        final java.lang.reflect.Method enumValueOf;
        final kotlin.reflect.jvm.internal.impl.protobuf.MessageLite messageDefaultInstance;
        final java.lang.Class singularType;

        GeneratedExtension(ContainingType containingtype, Type type, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite messageLite, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtensionDescriptor extensionDescriptor, java.lang.Class cls) {
            if (containingtype == null) {
                throw new java.lang.IllegalArgumentException("Null containingTypeDefaultInstance");
            }
            if (extensionDescriptor.getLiteType() == kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType.MESSAGE && messageLite == null) {
                throw new java.lang.IllegalArgumentException("Null messageDefaultInstance");
            }
            this.containingTypeDefaultInstance = containingtype;
            this.defaultValue = type;
            this.messageDefaultInstance = messageLite;
            this.descriptor = extensionDescriptor;
            this.singularType = cls;
            if (kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite.class.isAssignableFrom(cls)) {
                this.enumValueOf = kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.getMethodOrDie(cls, "valueOf", java.lang.Integer.TYPE);
            } else {
                this.enumValueOf = null;
            }
        }

        public ContainingType getContainingTypeDefaultInstance() {
            return this.containingTypeDefaultInstance;
        }

        public int getNumber() {
            return this.descriptor.getNumber();
        }

        public kotlin.reflect.jvm.internal.impl.protobuf.MessageLite getMessageDefaultInstance() {
            return this.messageDefaultInstance;
        }

        java.lang.Object fromFieldSetType(java.lang.Object obj) {
            if (this.descriptor.isRepeated()) {
                if (this.descriptor.getLiteJavaType() != kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType.ENUM) {
                    return obj;
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.Iterator it = ((java.util.List) obj).iterator();
                while (it.hasNext()) {
                    arrayList.add(singularFromFieldSetType(it.next()));
                }
                return arrayList;
            }
            return singularFromFieldSetType(obj);
        }

        java.lang.Object singularFromFieldSetType(java.lang.Object obj) {
            return this.descriptor.getLiteJavaType() == kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType.ENUM ? kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.invokeOrDie(this.enumValueOf, null, (java.lang.Integer) obj) : obj;
        }

        java.lang.Object singularToFieldSetType(java.lang.Object obj) {
            return this.descriptor.getLiteJavaType() == kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType.ENUM ? java.lang.Integer.valueOf(((kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite) obj).getNumber()) : obj;
        }
    }
}
