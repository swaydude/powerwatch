package kotlin.reflect.jvm.internal.impl.metadata;

/* JADX INFO: loaded from: classes2.dex */
public final class ProtoBuf {

    public interface AnnotationOrBuilder extends kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder {
    }

    public interface ClassOrBuilder extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    public interface ConstructorOrBuilder extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    public interface ContractOrBuilder extends kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder {
    }

    public interface EffectOrBuilder extends kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder {
    }

    public interface EnumEntryOrBuilder extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    public interface ExpressionOrBuilder extends kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder {
    }

    public interface FunctionOrBuilder extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    public interface PackageFragmentOrBuilder extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    public interface PackageOrBuilder extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    public interface PropertyOrBuilder extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    public interface QualifiedNameTableOrBuilder extends kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder {
    }

    public interface StringTableOrBuilder extends kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder {
    }

    public interface TypeAliasOrBuilder extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    public interface TypeOrBuilder extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    public interface TypeParameterOrBuilder extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    public interface TypeTableOrBuilder extends kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder {
    }

    public interface ValueParameterOrBuilder extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    public interface VersionRequirementOrBuilder extends kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder {
    }

    public interface VersionRequirementTableOrBuilder extends kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder {
    }

    public enum Modality implements kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite {
        FINAL(0, 0),
        OPEN(1, 1),
        ABSTRACT(2, 2),
        SEALED(3, 3);

        private static kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Modality> internalValueMap = new kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Modality>() { // from class: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Modality.1
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Modality findValueByNumber(int i) {
                return kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Modality.valueOf(i);
            }
        };
        private final int value;

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
        public final int getNumber() {
            return this.value;
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Modality valueOf(int i) {
            if (i == 0) {
                return FINAL;
            }
            if (i == 1) {
                return OPEN;
            }
            if (i == 2) {
                return ABSTRACT;
            }
            if (i != 3) {
                return null;
            }
            return SEALED;
        }

        Modality(int i, int i2) {
            this.value = i2;
        }
    }

    public enum Visibility implements kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite {
        INTERNAL(0, 0),
        PRIVATE(1, 1),
        PROTECTED(2, 2),
        PUBLIC(3, 3),
        PRIVATE_TO_THIS(4, 4),
        LOCAL(5, 5);

        private static kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Visibility> internalValueMap = new kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Visibility>() { // from class: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Visibility.1
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Visibility findValueByNumber(int i) {
                return kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Visibility.valueOf(i);
            }
        };
        private final int value;

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
        public final int getNumber() {
            return this.value;
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Visibility valueOf(int i) {
            if (i == 0) {
                return INTERNAL;
            }
            if (i == 1) {
                return PRIVATE;
            }
            if (i == 2) {
                return PROTECTED;
            }
            if (i == 3) {
                return PUBLIC;
            }
            if (i == 4) {
                return PRIVATE_TO_THIS;
            }
            if (i != 5) {
                return null;
            }
            return LOCAL;
        }

        Visibility(int i, int i2) {
            this.value = i2;
        }
    }

    public enum MemberKind implements kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite {
        DECLARATION(0, 0),
        FAKE_OVERRIDE(1, 1),
        DELEGATION(2, 2),
        SYNTHESIZED(3, 3);

        private static kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.MemberKind> internalValueMap = new kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.MemberKind>() { // from class: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.MemberKind.1
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.MemberKind findValueByNumber(int i) {
                return kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.MemberKind.valueOf(i);
            }
        };
        private final int value;

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
        public final int getNumber() {
            return this.value;
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.MemberKind valueOf(int i) {
            if (i == 0) {
                return DECLARATION;
            }
            if (i == 1) {
                return FAKE_OVERRIDE;
            }
            if (i == 2) {
                return DELEGATION;
            }
            if (i != 3) {
                return null;
            }
            return SYNTHESIZED;
        }

        MemberKind(int i, int i2) {
            this.value = i2;
        }
    }

    public static final class StringTable extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite implements kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTableOrBuilder {
        public static kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTable> PARSER = new kotlin.reflect.jvm.internal.impl.protobuf.AbstractParser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTable>() { // from class: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTable.1
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTable parsePartialFrom(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
                return new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTable(codedInputStream, extensionRegistryLite);
            }
        };
        private static final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTable defaultInstance;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private kotlin.reflect.jvm.internal.impl.protobuf.LazyStringList string_;
        private final kotlin.reflect.jvm.internal.impl.protobuf.ByteString unknownFields;

        private StringTable(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        private StringTable(boolean z) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = kotlin.reflect.jvm.internal.impl.protobuf.ByteString.EMPTY;
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTable getDefaultInstance() {
            return defaultInstance;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTable getDefaultInstanceForType() {
            return defaultInstance;
        }

        private StringTable(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            initFields();
            kotlin.reflect.jvm.internal.impl.protobuf.ByteString.Output outputNewOutput = kotlin.reflect.jvm.internal.impl.protobuf.ByteString.newOutput();
            kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream codedOutputStreamNewInstance = kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.newInstance(outputNewOutput, 1);
            boolean z = false;
            boolean z2 = false;
            while (!z) {
                try {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag != 10) {
                                    if (!parseUnknownField(codedInputStream, codedOutputStreamNewInstance, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    kotlin.reflect.jvm.internal.impl.protobuf.ByteString bytes = codedInputStream.readBytes();
                                    if (!(z2 & true)) {
                                        this.string_ = new kotlin.reflect.jvm.internal.impl.protobuf.LazyStringArrayList();
                                        z2 |= true;
                                    }
                                    this.string_.add(bytes);
                                }
                            }
                            z = true;
                        } catch (kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException e) {
                            throw e.setUnfinishedMessage(this);
                        }
                    } catch (java.io.IOException e2) {
                        throw new kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                    }
                } catch (java.lang.Throwable th) {
                    if (z2 & true) {
                        this.string_ = this.string_.getUnmodifiableView();
                    }
                    try {
                        codedOutputStreamNewInstance.flush();
                    } catch (java.io.IOException unused) {
                    } finally {
                        this.unknownFields = outputNewOutput.toByteString();
                    }
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            if (z2 & true) {
                this.string_ = this.string_.getUnmodifiableView();
            }
            try {
                codedOutputStreamNewInstance.flush();
            } catch (java.io.IOException unused2) {
            } finally {
                this.unknownFields = outputNewOutput.toByteString();
            }
            makeExtensionsImmutable();
        }

        static {
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTable stringTable = new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTable(true);
            defaultInstance = stringTable;
            stringTable.initFields();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTable> getParserForType() {
            return PARSER;
        }

        public kotlin.reflect.jvm.internal.impl.protobuf.ProtocolStringList getStringList() {
            return this.string_;
        }

        public java.lang.String getString(int i) {
            return (java.lang.String) this.string_.get(i);
        }

        private void initFields() {
            this.string_ = kotlin.reflect.jvm.internal.impl.protobuf.LazyStringArrayList.EMPTY;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream codedOutputStream) throws java.io.IOException {
            getSerializedSize();
            for (int i = 0; i < this.string_.size(); i++) {
                codedOutputStream.writeBytes(1, this.string_.getByteString(i));
            }
            codedOutputStream.writeRawBytes(this.unknownFields);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iComputeBytesSizeNoTag = 0;
            for (int i2 = 0; i2 < this.string_.size(); i2++) {
                iComputeBytesSizeNoTag += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeBytesSizeNoTag(this.string_.getByteString(i2));
            }
            int size = 0 + iComputeBytesSizeNoTag + (getStringList().size() * 1) + this.unknownFields.size();
            this.memoizedSerializedSize = size;
            return size;
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTable.Builder newBuilder() {
            return kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTable.Builder.create();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTable.Builder newBuilderForType() {
            return newBuilder();
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTable.Builder newBuilder(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTable stringTable) {
            return newBuilder().mergeFrom(stringTable);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTable.Builder toBuilder() {
            return newBuilder(this);
        }

        public static final class Builder extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTable, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTable.Builder> implements kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTableOrBuilder {
            private int bitField0_;
            private kotlin.reflect.jvm.internal.impl.protobuf.LazyStringList string_ = kotlin.reflect.jvm.internal.impl.protobuf.LazyStringArrayList.EMPTY;

            private void maybeForceBuilderInitialization() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTable.Builder create() {
                return new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTable.Builder();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTable.Builder mo1266clone() {
                return create().mergeFrom(buildPartial());
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTable getDefaultInstanceForType() {
                return kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTable.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTable build() {
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTable stringTableBuildPartial = buildPartial();
                if (stringTableBuildPartial.isInitialized()) {
                    return stringTableBuildPartial;
                }
                throw newUninitializedMessageException(stringTableBuildPartial);
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTable buildPartial() {
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTable stringTable = new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTable(this);
                if ((this.bitField0_ & 1) == 1) {
                    this.string_ = this.string_.getUnmodifiableView();
                    this.bitField0_ &= -2;
                }
                stringTable.string_ = this.string_;
                return stringTable;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTable.Builder mergeFrom(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTable stringTable) {
                if (stringTable == kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTable.getDefaultInstance()) {
                    return this;
                }
                if (!stringTable.string_.isEmpty()) {
                    if (this.string_.isEmpty()) {
                        this.string_ = stringTable.string_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureStringIsMutable();
                        this.string_.addAll(stringTable.string_);
                    }
                }
                setUnknownFields(getUnknownFields().concat(stringTable.unknownFields));
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTable.Builder mergeFrom(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.lang.Throwable {
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTable stringTable = null;
                try {
                    try {
                        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTable partialFrom = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTable.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (partialFrom != null) {
                            mergeFrom(partialFrom);
                        }
                        return this;
                    } catch (kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException e) {
                        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTable stringTable2 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTable) e.getUnfinishedMessage();
                        try {
                            throw e;
                        } catch (java.lang.Throwable th) {
                            th = th;
                            stringTable = stringTable2;
                            if (stringTable != null) {
                                mergeFrom(stringTable);
                            }
                            throw th;
                        }
                    }
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    if (stringTable != null) {
                        mergeFrom(stringTable);
                    }
                    throw th;
                }
            }

            private void ensureStringIsMutable() {
                if ((this.bitField0_ & 1) != 1) {
                    this.string_ = new kotlin.reflect.jvm.internal.impl.protobuf.LazyStringArrayList(this.string_);
                    this.bitField0_ |= 1;
                }
            }
        }
    }

    public static final class QualifiedNameTable extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite implements kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTableOrBuilder {
        public static kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable> PARSER = new kotlin.reflect.jvm.internal.impl.protobuf.AbstractParser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable>() { // from class: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.1
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable parsePartialFrom(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
                return new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable(codedInputStream, extensionRegistryLite);
            }
        };
        private static final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable defaultInstance;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName> qualifiedName_;
        private final kotlin.reflect.jvm.internal.impl.protobuf.ByteString unknownFields;

        public interface QualifiedNameOrBuilder extends kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder {
        }

        private QualifiedNameTable(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        private QualifiedNameTable(boolean z) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = kotlin.reflect.jvm.internal.impl.protobuf.ByteString.EMPTY;
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable getDefaultInstance() {
            return defaultInstance;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable getDefaultInstanceForType() {
            return defaultInstance;
        }

        private QualifiedNameTable(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            initFields();
            kotlin.reflect.jvm.internal.impl.protobuf.ByteString.Output outputNewOutput = kotlin.reflect.jvm.internal.impl.protobuf.ByteString.newOutput();
            kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream codedOutputStreamNewInstance = kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.newInstance(outputNewOutput, 1);
            boolean z = false;
            boolean z2 = false;
            while (!z) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        if (tag != 0) {
                            if (tag != 10) {
                                if (!parseUnknownField(codedInputStream, codedOutputStreamNewInstance, extensionRegistryLite, tag)) {
                                }
                            } else {
                                if (!(z2 & true)) {
                                    this.qualifiedName_ = new java.util.ArrayList();
                                    z2 |= true;
                                }
                                this.qualifiedName_.add((kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName) codedInputStream.readMessage(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName.PARSER, extensionRegistryLite));
                            }
                        }
                        z = true;
                    } catch (java.lang.Throwable th) {
                        if (z2 & true) {
                            this.qualifiedName_ = java.util.Collections.unmodifiableList(this.qualifiedName_);
                        }
                        try {
                            codedOutputStreamNewInstance.flush();
                        } catch (java.io.IOException unused) {
                        } finally {
                            this.unknownFields = outputNewOutput.toByteString();
                        }
                        makeExtensionsImmutable();
                        throw th;
                    }
                } catch (kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (java.io.IOException e2) {
                    throw new kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                }
            }
            if (z2 & true) {
                this.qualifiedName_ = java.util.Collections.unmodifiableList(this.qualifiedName_);
            }
            try {
                codedOutputStreamNewInstance.flush();
            } catch (java.io.IOException unused2) {
            } finally {
                this.unknownFields = outputNewOutput.toByteString();
            }
            makeExtensionsImmutable();
        }

        static {
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable qualifiedNameTable = new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable(true);
            defaultInstance = qualifiedNameTable;
            qualifiedNameTable.initFields();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable> getParserForType() {
            return PARSER;
        }

        public static final class QualifiedName extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite implements kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedNameOrBuilder {
            public static kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName> PARSER = new kotlin.reflect.jvm.internal.impl.protobuf.AbstractParser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName>() { // from class: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName.1
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
                public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName parsePartialFrom(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
                    return new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName(codedInputStream, extensionRegistryLite);
                }
            };
            private static final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName defaultInstance;
            private int bitField0_;
            private kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName.Kind kind_;
            private byte memoizedIsInitialized;
            private int memoizedSerializedSize;
            private int parentQualifiedName_;
            private int shortName_;
            private final kotlin.reflect.jvm.internal.impl.protobuf.ByteString unknownFields;

            private QualifiedName(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder builder) {
                super(builder);
                this.memoizedIsInitialized = (byte) -1;
                this.memoizedSerializedSize = -1;
                this.unknownFields = builder.getUnknownFields();
            }

            private QualifiedName(boolean z) {
                this.memoizedIsInitialized = (byte) -1;
                this.memoizedSerializedSize = -1;
                this.unknownFields = kotlin.reflect.jvm.internal.impl.protobuf.ByteString.EMPTY;
            }

            public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName getDefaultInstance() {
                return defaultInstance;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName getDefaultInstanceForType() {
                return defaultInstance;
            }

            private QualifiedName(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
                this.memoizedIsInitialized = (byte) -1;
                this.memoizedSerializedSize = -1;
                initFields();
                kotlin.reflect.jvm.internal.impl.protobuf.ByteString.Output outputNewOutput = kotlin.reflect.jvm.internal.impl.protobuf.ByteString.newOutput();
                kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream codedOutputStreamNewInstance = kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.newInstance(outputNewOutput, 1);
                boolean z = false;
                while (!z) {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag == 8) {
                                    this.bitField0_ |= 1;
                                    this.parentQualifiedName_ = codedInputStream.readInt32();
                                } else if (tag == 16) {
                                    this.bitField0_ |= 2;
                                    this.shortName_ = codedInputStream.readInt32();
                                } else if (tag != 24) {
                                    if (!parseUnknownField(codedInputStream, codedOutputStreamNewInstance, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    int i = codedInputStream.readEnum();
                                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName.Kind kindValueOf = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName.Kind.valueOf(i);
                                    if (kindValueOf == null) {
                                        codedOutputStreamNewInstance.writeRawVarint32(tag);
                                        codedOutputStreamNewInstance.writeRawVarint32(i);
                                    } else {
                                        this.bitField0_ |= 4;
                                        this.kind_ = kindValueOf;
                                    }
                                }
                            }
                            z = true;
                        } catch (kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException e) {
                            throw e.setUnfinishedMessage(this);
                        } catch (java.io.IOException e2) {
                            throw new kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                        }
                    } catch (java.lang.Throwable th) {
                        try {
                            codedOutputStreamNewInstance.flush();
                        } catch (java.io.IOException unused) {
                        } finally {
                            this.unknownFields = outputNewOutput.toByteString();
                        }
                        makeExtensionsImmutable();
                        throw th;
                    }
                }
                try {
                    codedOutputStreamNewInstance.flush();
                } catch (java.io.IOException unused2) {
                } finally {
                    this.unknownFields = outputNewOutput.toByteString();
                }
                makeExtensionsImmutable();
            }

            static {
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName qualifiedName = new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName(true);
                defaultInstance = qualifiedName;
                qualifiedName.initFields();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName> getParserForType() {
                return PARSER;
            }

            public enum Kind implements kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite {
                CLASS(0, 0),
                PACKAGE(1, 1),
                LOCAL(2, 2);

                private static kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName.Kind> internalValueMap = new kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName.Kind>() { // from class: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName.Kind.1
                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap
                    public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName.Kind findValueByNumber(int i) {
                        return kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName.Kind.valueOf(i);
                    }
                };
                private final int value;

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
                public final int getNumber() {
                    return this.value;
                }

                public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName.Kind valueOf(int i) {
                    if (i == 0) {
                        return CLASS;
                    }
                    if (i == 1) {
                        return PACKAGE;
                    }
                    if (i != 2) {
                        return null;
                    }
                    return LOCAL;
                }

                Kind(int i, int i2) {
                    this.value = i2;
                }
            }

            public boolean hasParentQualifiedName() {
                return (this.bitField0_ & 1) == 1;
            }

            public int getParentQualifiedName() {
                return this.parentQualifiedName_;
            }

            public boolean hasShortName() {
                return (this.bitField0_ & 2) == 2;
            }

            public int getShortName() {
                return this.shortName_;
            }

            public boolean hasKind() {
                return (this.bitField0_ & 4) == 4;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName.Kind getKind() {
                return this.kind_;
            }

            private void initFields() {
                this.parentQualifiedName_ = -1;
                this.shortName_ = 0;
                this.kind_ = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName.Kind.PACKAGE;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                byte b = this.memoizedIsInitialized;
                if (b == 1) {
                    return true;
                }
                if (b == 0) {
                    return false;
                }
                if (!hasShortName()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public void writeTo(kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream codedOutputStream) throws java.io.IOException {
                getSerializedSize();
                if ((this.bitField0_ & 1) == 1) {
                    codedOutputStream.writeInt32(1, this.parentQualifiedName_);
                }
                if ((this.bitField0_ & 2) == 2) {
                    codedOutputStream.writeInt32(2, this.shortName_);
                }
                if ((this.bitField0_ & 4) == 4) {
                    codedOutputStream.writeEnum(3, this.kind_.getNumber());
                }
                codedOutputStream.writeRawBytes(this.unknownFields);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public int getSerializedSize() {
                int i = this.memoizedSerializedSize;
                if (i != -1) {
                    return i;
                }
                int iComputeInt32Size = (this.bitField0_ & 1) == 1 ? 0 + kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeInt32Size(1, this.parentQualifiedName_) : 0;
                if ((this.bitField0_ & 2) == 2) {
                    iComputeInt32Size += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeInt32Size(2, this.shortName_);
                }
                if ((this.bitField0_ & 4) == 4) {
                    iComputeInt32Size += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeEnumSize(3, this.kind_.getNumber());
                }
                int size = iComputeInt32Size + this.unknownFields.size();
                this.memoizedSerializedSize = size;
                return size;
            }

            public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName.Builder newBuilder() {
                return kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName.Builder.create();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName.Builder newBuilderForType() {
                return newBuilder();
            }

            public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName.Builder newBuilder(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName qualifiedName) {
                return newBuilder().mergeFrom(qualifiedName);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName.Builder toBuilder() {
                return newBuilder(this);
            }

            public static final class Builder extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName.Builder> implements kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedNameOrBuilder {
                private int bitField0_;
                private int shortName_;
                private int parentQualifiedName_ = -1;
                private kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName.Kind kind_ = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName.Kind.PACKAGE;

                private void maybeForceBuilderInitialization() {
                }

                private Builder() {
                    maybeForceBuilderInitialization();
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName.Builder create() {
                    return new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName.Builder();
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
                /* JADX INFO: renamed from: clone */
                public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName.Builder mo1266clone() {
                    return create().mergeFrom(buildPartial());
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
                public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName getDefaultInstanceForType() {
                    return kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName.getDefaultInstance();
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
                public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName build() {
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName qualifiedNameBuildPartial = buildPartial();
                    if (qualifiedNameBuildPartial.isInitialized()) {
                        return qualifiedNameBuildPartial;
                    }
                    throw newUninitializedMessageException(qualifiedNameBuildPartial);
                }

                public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName buildPartial() {
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName qualifiedName = new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName(this);
                    int i = this.bitField0_;
                    int i2 = (i & 1) != 1 ? 0 : 1;
                    qualifiedName.parentQualifiedName_ = this.parentQualifiedName_;
                    if ((i & 2) == 2) {
                        i2 |= 2;
                    }
                    qualifiedName.shortName_ = this.shortName_;
                    if ((i & 4) == 4) {
                        i2 |= 4;
                    }
                    qualifiedName.kind_ = this.kind_;
                    qualifiedName.bitField0_ = i2;
                    return qualifiedName;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
                public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName.Builder mergeFrom(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName qualifiedName) {
                    if (qualifiedName == kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName.getDefaultInstance()) {
                        return this;
                    }
                    if (qualifiedName.hasParentQualifiedName()) {
                        setParentQualifiedName(qualifiedName.getParentQualifiedName());
                    }
                    if (qualifiedName.hasShortName()) {
                        setShortName(qualifiedName.getShortName());
                    }
                    if (qualifiedName.hasKind()) {
                        setKind(qualifiedName.getKind());
                    }
                    setUnknownFields(getUnknownFields().concat(qualifiedName.unknownFields));
                    return this;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    return hasShortName();
                }

                /* JADX WARN: Code duplicated, block: B:15:0x001d  */
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
                public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName.Builder mergeFrom(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.lang.Throwable {
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName qualifiedName = null;
                    try {
                        try {
                            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName partialFrom = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                            if (partialFrom != null) {
                                mergeFrom(partialFrom);
                            }
                            return this;
                        } catch (kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException e) {
                            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName qualifiedName2 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName) e.getUnfinishedMessage();
                            try {
                                throw e;
                            } catch (java.lang.Throwable th) {
                                th = th;
                                qualifiedName = qualifiedName2;
                                if (qualifiedName != null) {
                                    mergeFrom(qualifiedName);
                                }
                                throw th;
                            }
                        }
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        if (qualifiedName != null) {
                            mergeFrom(qualifiedName);
                        }
                        throw th;
                    }
                }

                public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName.Builder setParentQualifiedName(int i) {
                    this.bitField0_ |= 1;
                    this.parentQualifiedName_ = i;
                    return this;
                }

                public boolean hasShortName() {
                    return (this.bitField0_ & 2) == 2;
                }

                public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName.Builder setShortName(int i) {
                    this.bitField0_ |= 2;
                    this.shortName_ = i;
                    return this;
                }

                public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName.Builder setKind(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName.Kind kind) {
                    java.util.Objects.requireNonNull(kind);
                    this.bitField0_ |= 4;
                    this.kind_ = kind;
                    return this;
                }
            }
        }

        public int getQualifiedNameCount() {
            return this.qualifiedName_.size();
        }

        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName getQualifiedName(int i) {
            return this.qualifiedName_.get(i);
        }

        private void initFields() {
            this.qualifiedName_ = java.util.Collections.emptyList();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            for (int i = 0; i < getQualifiedNameCount(); i++) {
                if (!getQualifiedName(i).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream codedOutputStream) throws java.io.IOException {
            getSerializedSize();
            for (int i = 0; i < this.qualifiedName_.size(); i++) {
                codedOutputStream.writeMessage(1, this.qualifiedName_.get(i));
            }
            codedOutputStream.writeRawBytes(this.unknownFields);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iComputeMessageSize = 0;
            for (int i2 = 0; i2 < this.qualifiedName_.size(); i2++) {
                iComputeMessageSize += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeMessageSize(1, this.qualifiedName_.get(i2));
            }
            int size = iComputeMessageSize + this.unknownFields.size();
            this.memoizedSerializedSize = size;
            return size;
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.Builder newBuilder() {
            return kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.Builder.create();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.Builder newBuilderForType() {
            return newBuilder();
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.Builder newBuilder(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable qualifiedNameTable) {
            return newBuilder().mergeFrom(qualifiedNameTable);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.Builder toBuilder() {
            return newBuilder(this);
        }

        public static final class Builder extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.Builder> implements kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTableOrBuilder {
            private int bitField0_;
            private java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName> qualifiedName_ = java.util.Collections.emptyList();

            private void maybeForceBuilderInitialization() {
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.Builder create() {
                return new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.Builder();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.Builder mo1266clone() {
                return create().mergeFrom(buildPartial());
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable getDefaultInstanceForType() {
                return kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable build() {
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable qualifiedNameTableBuildPartial = buildPartial();
                if (qualifiedNameTableBuildPartial.isInitialized()) {
                    return qualifiedNameTableBuildPartial;
                }
                throw newUninitializedMessageException(qualifiedNameTableBuildPartial);
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable buildPartial() {
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable qualifiedNameTable = new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable(this);
                if ((this.bitField0_ & 1) == 1) {
                    this.qualifiedName_ = java.util.Collections.unmodifiableList(this.qualifiedName_);
                    this.bitField0_ &= -2;
                }
                qualifiedNameTable.qualifiedName_ = this.qualifiedName_;
                return qualifiedNameTable;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.Builder mergeFrom(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable qualifiedNameTable) {
                if (qualifiedNameTable == kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.getDefaultInstance()) {
                    return this;
                }
                if (!qualifiedNameTable.qualifiedName_.isEmpty()) {
                    if (this.qualifiedName_.isEmpty()) {
                        this.qualifiedName_ = qualifiedNameTable.qualifiedName_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureQualifiedNameIsMutable();
                        this.qualifiedName_.addAll(qualifiedNameTable.qualifiedName_);
                    }
                }
                setUnknownFields(getUnknownFields().concat(qualifiedNameTable.unknownFields));
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                for (int i = 0; i < getQualifiedNameCount(); i++) {
                    if (!getQualifiedName(i).isInitialized()) {
                        return false;
                    }
                }
                return true;
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.Builder mergeFrom(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.lang.Throwable {
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable qualifiedNameTable = null;
                try {
                    try {
                        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable partialFrom = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (partialFrom != null) {
                            mergeFrom(partialFrom);
                        }
                        return this;
                    } catch (kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException e) {
                        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable qualifiedNameTable2 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable) e.getUnfinishedMessage();
                        try {
                            throw e;
                        } catch (java.lang.Throwable th) {
                            th = th;
                            qualifiedNameTable = qualifiedNameTable2;
                            if (qualifiedNameTable != null) {
                                mergeFrom(qualifiedNameTable);
                            }
                            throw th;
                        }
                    }
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    if (qualifiedNameTable != null) {
                        mergeFrom(qualifiedNameTable);
                    }
                    throw th;
                }
            }

            private void ensureQualifiedNameIsMutable() {
                if ((this.bitField0_ & 1) != 1) {
                    this.qualifiedName_ = new java.util.ArrayList(this.qualifiedName_);
                    this.bitField0_ |= 1;
                }
            }

            public int getQualifiedNameCount() {
                return this.qualifiedName_.size();
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName getQualifiedName(int i) {
                return this.qualifiedName_.get(i);
            }
        }
    }

    public static final class Annotation extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite implements kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.AnnotationOrBuilder {
        public static kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation> PARSER = new kotlin.reflect.jvm.internal.impl.protobuf.AbstractParser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation>() { // from class: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.1
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation parsePartialFrom(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
                return new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation(codedInputStream, extensionRegistryLite);
            }
        };
        private static final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation defaultInstance;
        private java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument> argument_;
        private int bitField0_;
        private int id_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private final kotlin.reflect.jvm.internal.impl.protobuf.ByteString unknownFields;

        public interface ArgumentOrBuilder extends kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder {
        }

        private Annotation(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        private Annotation(boolean z) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = kotlin.reflect.jvm.internal.impl.protobuf.ByteString.EMPTY;
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation getDefaultInstance() {
            return defaultInstance;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation getDefaultInstanceForType() {
            return defaultInstance;
        }

        private Annotation(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            initFields();
            kotlin.reflect.jvm.internal.impl.protobuf.ByteString.Output outputNewOutput = kotlin.reflect.jvm.internal.impl.protobuf.ByteString.newOutput();
            kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream codedOutputStreamNewInstance = kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.newInstance(outputNewOutput, 1);
            boolean z = false;
            int i = 0;
            while (!z) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        if (tag != 0) {
                            if (tag == 8) {
                                this.bitField0_ |= 1;
                                this.id_ = codedInputStream.readInt32();
                            } else if (tag != 18) {
                                if (!parseUnknownField(codedInputStream, codedOutputStreamNewInstance, extensionRegistryLite, tag)) {
                                }
                            } else {
                                if ((i & 2) != 2) {
                                    this.argument_ = new java.util.ArrayList();
                                    i |= 2;
                                }
                                this.argument_.add((kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument) codedInputStream.readMessage(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.PARSER, extensionRegistryLite));
                            }
                        }
                        z = true;
                    } catch (java.lang.Throwable th) {
                        if ((i & 2) == 2) {
                            this.argument_ = java.util.Collections.unmodifiableList(this.argument_);
                        }
                        try {
                            codedOutputStreamNewInstance.flush();
                        } catch (java.io.IOException unused) {
                        } finally {
                            this.unknownFields = outputNewOutput.toByteString();
                        }
                        makeExtensionsImmutable();
                        throw th;
                    }
                } catch (kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (java.io.IOException e2) {
                    throw new kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                }
            }
            if ((i & 2) == 2) {
                this.argument_ = java.util.Collections.unmodifiableList(this.argument_);
            }
            try {
                codedOutputStreamNewInstance.flush();
            } catch (java.io.IOException unused2) {
            } finally {
                this.unknownFields = outputNewOutput.toByteString();
            }
            makeExtensionsImmutable();
        }

        static {
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation annotation = new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation(true);
            defaultInstance = annotation;
            annotation.initFields();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation> getParserForType() {
            return PARSER;
        }

        public static final class Argument extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite implements kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.ArgumentOrBuilder {
            public static kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument> PARSER = new kotlin.reflect.jvm.internal.impl.protobuf.AbstractParser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument>() { // from class: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.1
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
                public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument parsePartialFrom(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
                    return new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument(codedInputStream, extensionRegistryLite);
                }
            };
            private static final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument defaultInstance;
            private int bitField0_;
            private byte memoizedIsInitialized;
            private int memoizedSerializedSize;
            private int nameId_;
            private final kotlin.reflect.jvm.internal.impl.protobuf.ByteString unknownFields;
            private kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value value_;

            public interface ValueOrBuilder extends kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder {
            }

            private Argument(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder builder) {
                super(builder);
                this.memoizedIsInitialized = (byte) -1;
                this.memoizedSerializedSize = -1;
                this.unknownFields = builder.getUnknownFields();
            }

            private Argument(boolean z) {
                this.memoizedIsInitialized = (byte) -1;
                this.memoizedSerializedSize = -1;
                this.unknownFields = kotlin.reflect.jvm.internal.impl.protobuf.ByteString.EMPTY;
            }

            public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument getDefaultInstance() {
                return defaultInstance;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument getDefaultInstanceForType() {
                return defaultInstance;
            }

            private Argument(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
                this.memoizedIsInitialized = (byte) -1;
                this.memoizedSerializedSize = -1;
                initFields();
                kotlin.reflect.jvm.internal.impl.protobuf.ByteString.Output outputNewOutput = kotlin.reflect.jvm.internal.impl.protobuf.ByteString.newOutput();
                kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream codedOutputStreamNewInstance = kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.newInstance(outputNewOutput, 1);
                boolean z = false;
                while (!z) {
                    try {
                        try {
                            try {
                                int tag = codedInputStream.readTag();
                                if (tag != 0) {
                                    if (tag == 8) {
                                        this.bitField0_ |= 1;
                                        this.nameId_ = codedInputStream.readInt32();
                                    } else if (tag != 18) {
                                        if (!parseUnknownField(codedInputStream, codedOutputStreamNewInstance, extensionRegistryLite, tag)) {
                                        }
                                    } else {
                                        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Builder builder = (this.bitField0_ & 2) == 2 ? this.value_.toBuilder() : null;
                                        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value value = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value) codedInputStream.readMessage(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.PARSER, extensionRegistryLite);
                                        this.value_ = value;
                                        if (builder != null) {
                                            builder.mergeFrom(value);
                                            this.value_ = builder.buildPartial();
                                        }
                                        this.bitField0_ |= 2;
                                    }
                                }
                                z = true;
                            } catch (kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException e) {
                                throw e.setUnfinishedMessage(this);
                            }
                        } catch (java.io.IOException e2) {
                            throw new kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                        }
                    } catch (java.lang.Throwable th) {
                        try {
                            codedOutputStreamNewInstance.flush();
                        } catch (java.io.IOException unused) {
                        } finally {
                            this.unknownFields = outputNewOutput.toByteString();
                        }
                        makeExtensionsImmutable();
                        throw th;
                    }
                }
                try {
                    codedOutputStreamNewInstance.flush();
                } catch (java.io.IOException unused2) {
                } finally {
                    this.unknownFields = outputNewOutput.toByteString();
                }
                makeExtensionsImmutable();
            }

            static {
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument argument = new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument(true);
                defaultInstance = argument;
                argument.initFields();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument> getParserForType() {
                return PARSER;
            }

            public static final class Value extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite implements kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.ValueOrBuilder {
                public static kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value> PARSER = new kotlin.reflect.jvm.internal.impl.protobuf.AbstractParser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value>() { // from class: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.1
                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
                    public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value parsePartialFrom(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
                        return new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value(codedInputStream, extensionRegistryLite);
                    }
                };
                private static final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value defaultInstance;
                private kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation annotation_;
                private int arrayDimensionCount_;
                private java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value> arrayElement_;
                private int bitField0_;
                private int classId_;
                private double doubleValue_;
                private int enumValueId_;
                private int flags_;
                private float floatValue_;
                private long intValue_;
                private byte memoizedIsInitialized;
                private int memoizedSerializedSize;
                private int stringValue_;
                private kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Type type_;
                private final kotlin.reflect.jvm.internal.impl.protobuf.ByteString unknownFields;

                private Value(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder builder) {
                    super(builder);
                    this.memoizedIsInitialized = (byte) -1;
                    this.memoizedSerializedSize = -1;
                    this.unknownFields = builder.getUnknownFields();
                }

                private Value(boolean z) {
                    this.memoizedIsInitialized = (byte) -1;
                    this.memoizedSerializedSize = -1;
                    this.unknownFields = kotlin.reflect.jvm.internal.impl.protobuf.ByteString.EMPTY;
                }

                public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value getDefaultInstance() {
                    return defaultInstance;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
                public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value getDefaultInstanceForType() {
                    return defaultInstance;
                }

                private Value(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
                    this.memoizedIsInitialized = (byte) -1;
                    this.memoizedSerializedSize = -1;
                    initFields();
                    kotlin.reflect.jvm.internal.impl.protobuf.ByteString.Output outputNewOutput = kotlin.reflect.jvm.internal.impl.protobuf.ByteString.newOutput();
                    kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream codedOutputStreamNewInstance = kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.newInstance(outputNewOutput, 1);
                    boolean z = false;
                    int i = 0;
                    while (!z) {
                        try {
                            try {
                                int tag = codedInputStream.readTag();
                                switch (tag) {
                                    case 0:
                                        break;
                                    case 8:
                                        int i2 = codedInputStream.readEnum();
                                        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Type typeValueOf = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Type.valueOf(i2);
                                        if (typeValueOf == null) {
                                            codedOutputStreamNewInstance.writeRawVarint32(tag);
                                            codedOutputStreamNewInstance.writeRawVarint32(i2);
                                        } else {
                                            this.bitField0_ |= 1;
                                            this.type_ = typeValueOf;
                                            continue;
                                        }
                                        break;
                                    case 16:
                                        this.bitField0_ |= 2;
                                        this.intValue_ = codedInputStream.readSInt64();
                                        continue;
                                    case 29:
                                        this.bitField0_ |= 4;
                                        this.floatValue_ = codedInputStream.readFloat();
                                        continue;
                                    case 33:
                                        this.bitField0_ |= 8;
                                        this.doubleValue_ = codedInputStream.readDouble();
                                        continue;
                                    case 40:
                                        this.bitField0_ |= 16;
                                        this.stringValue_ = codedInputStream.readInt32();
                                        continue;
                                    case 48:
                                        this.bitField0_ |= 32;
                                        this.classId_ = codedInputStream.readInt32();
                                        continue;
                                    case 56:
                                        this.bitField0_ |= 64;
                                        this.enumValueId_ = codedInputStream.readInt32();
                                        continue;
                                    case 66:
                                        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Builder builder = (this.bitField0_ & 128) == 128 ? this.annotation_.toBuilder() : null;
                                        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation annotation = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation) codedInputStream.readMessage(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.PARSER, extensionRegistryLite);
                                        this.annotation_ = annotation;
                                        if (builder != null) {
                                            builder.mergeFrom(annotation);
                                            this.annotation_ = builder.buildPartial();
                                        }
                                        this.bitField0_ |= 128;
                                        continue;
                                    case 74:
                                        if ((i & 256) != 256) {
                                            this.arrayElement_ = new java.util.ArrayList();
                                            i |= 256;
                                        }
                                        this.arrayElement_.add((kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value) codedInputStream.readMessage(PARSER, extensionRegistryLite));
                                        continue;
                                    case 80:
                                        this.bitField0_ |= 512;
                                        this.flags_ = codedInputStream.readInt32();
                                        continue;
                                    case 88:
                                        this.bitField0_ |= 256;
                                        this.arrayDimensionCount_ = codedInputStream.readInt32();
                                        continue;
                                    default:
                                        if (!parseUnknownField(codedInputStream, codedOutputStreamNewInstance, extensionRegistryLite, tag)) {
                                            break;
                                        }
                                        break;
                                }
                                z = true;
                            } catch (kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException e) {
                                throw e.setUnfinishedMessage(this);
                            } catch (java.io.IOException e2) {
                                throw new kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                            }
                        } catch (java.lang.Throwable th) {
                            if ((i & 256) == 256) {
                                this.arrayElement_ = java.util.Collections.unmodifiableList(this.arrayElement_);
                            }
                            try {
                                codedOutputStreamNewInstance.flush();
                            } catch (java.io.IOException unused) {
                            } finally {
                                this.unknownFields = outputNewOutput.toByteString();
                            }
                            makeExtensionsImmutable();
                            throw th;
                        }
                    }
                    if ((i & 256) == 256) {
                        this.arrayElement_ = java.util.Collections.unmodifiableList(this.arrayElement_);
                    }
                    try {
                        codedOutputStreamNewInstance.flush();
                    } catch (java.io.IOException unused2) {
                    } finally {
                        this.unknownFields = outputNewOutput.toByteString();
                    }
                    makeExtensionsImmutable();
                }

                static {
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value value = new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value(true);
                    defaultInstance = value;
                    value.initFields();
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
                public kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value> getParserForType() {
                    return PARSER;
                }

                public enum Type implements kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite {
                    BYTE(0, 0),
                    CHAR(1, 1),
                    SHORT(2, 2),
                    INT(3, 3),
                    LONG(4, 4),
                    FLOAT(5, 5),
                    DOUBLE(6, 6),
                    BOOLEAN(7, 7),
                    STRING(8, 8),
                    CLASS(9, 9),
                    ENUM(10, 10),
                    ANNOTATION(11, 11),
                    ARRAY(12, 12);

                    private static kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Type> internalValueMap = new kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Type>() { // from class: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Type.1
                        @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap
                        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Type findValueByNumber(int i) {
                            return kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Type.valueOf(i);
                        }
                    };
                    private final int value;

                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
                    public final int getNumber() {
                        return this.value;
                    }

                    public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Type valueOf(int i) {
                        switch (i) {
                            case 0:
                                return BYTE;
                            case 1:
                                return CHAR;
                            case 2:
                                return SHORT;
                            case 3:
                                return INT;
                            case 4:
                                return LONG;
                            case 5:
                                return FLOAT;
                            case 6:
                                return DOUBLE;
                            case 7:
                                return BOOLEAN;
                            case 8:
                                return STRING;
                            case 9:
                                return CLASS;
                            case 10:
                                return ENUM;
                            case 11:
                                return ANNOTATION;
                            case 12:
                                return ARRAY;
                            default:
                                return null;
                        }
                    }

                    Type(int i, int i2) {
                        this.value = i2;
                    }
                }

                public boolean hasType() {
                    return (this.bitField0_ & 1) == 1;
                }

                public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Type getType() {
                    return this.type_;
                }

                public boolean hasIntValue() {
                    return (this.bitField0_ & 2) == 2;
                }

                public long getIntValue() {
                    return this.intValue_;
                }

                public boolean hasFloatValue() {
                    return (this.bitField0_ & 4) == 4;
                }

                public float getFloatValue() {
                    return this.floatValue_;
                }

                public boolean hasDoubleValue() {
                    return (this.bitField0_ & 8) == 8;
                }

                public double getDoubleValue() {
                    return this.doubleValue_;
                }

                public boolean hasStringValue() {
                    return (this.bitField0_ & 16) == 16;
                }

                public int getStringValue() {
                    return this.stringValue_;
                }

                public boolean hasClassId() {
                    return (this.bitField0_ & 32) == 32;
                }

                public int getClassId() {
                    return this.classId_;
                }

                public boolean hasEnumValueId() {
                    return (this.bitField0_ & 64) == 64;
                }

                public int getEnumValueId() {
                    return this.enumValueId_;
                }

                public boolean hasAnnotation() {
                    return (this.bitField0_ & 128) == 128;
                }

                public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation getAnnotation() {
                    return this.annotation_;
                }

                public java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value> getArrayElementList() {
                    return this.arrayElement_;
                }

                public int getArrayElementCount() {
                    return this.arrayElement_.size();
                }

                public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value getArrayElement(int i) {
                    return this.arrayElement_.get(i);
                }

                public boolean hasArrayDimensionCount() {
                    return (this.bitField0_ & 256) == 256;
                }

                public int getArrayDimensionCount() {
                    return this.arrayDimensionCount_;
                }

                public boolean hasFlags() {
                    return (this.bitField0_ & 512) == 512;
                }

                public int getFlags() {
                    return this.flags_;
                }

                private void initFields() {
                    this.type_ = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Type.BYTE;
                    this.intValue_ = 0L;
                    this.floatValue_ = 0.0f;
                    this.doubleValue_ = 0.0d;
                    this.stringValue_ = 0;
                    this.classId_ = 0;
                    this.enumValueId_ = 0;
                    this.annotation_ = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.getDefaultInstance();
                    this.arrayElement_ = java.util.Collections.emptyList();
                    this.arrayDimensionCount_ = 0;
                    this.flags_ = 0;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    byte b = this.memoizedIsInitialized;
                    if (b == 1) {
                        return true;
                    }
                    if (b == 0) {
                        return false;
                    }
                    if (hasAnnotation() && !getAnnotation().isInitialized()) {
                        this.memoizedIsInitialized = (byte) 0;
                        return false;
                    }
                    for (int i = 0; i < getArrayElementCount(); i++) {
                        if (!getArrayElement(i).isInitialized()) {
                            this.memoizedIsInitialized = (byte) 0;
                            return false;
                        }
                    }
                    this.memoizedIsInitialized = (byte) 1;
                    return true;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
                public void writeTo(kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream codedOutputStream) throws java.io.IOException {
                    getSerializedSize();
                    if ((this.bitField0_ & 1) == 1) {
                        codedOutputStream.writeEnum(1, this.type_.getNumber());
                    }
                    if ((this.bitField0_ & 2) == 2) {
                        codedOutputStream.writeSInt64(2, this.intValue_);
                    }
                    if ((this.bitField0_ & 4) == 4) {
                        codedOutputStream.writeFloat(3, this.floatValue_);
                    }
                    if ((this.bitField0_ & 8) == 8) {
                        codedOutputStream.writeDouble(4, this.doubleValue_);
                    }
                    if ((this.bitField0_ & 16) == 16) {
                        codedOutputStream.writeInt32(5, this.stringValue_);
                    }
                    if ((this.bitField0_ & 32) == 32) {
                        codedOutputStream.writeInt32(6, this.classId_);
                    }
                    if ((this.bitField0_ & 64) == 64) {
                        codedOutputStream.writeInt32(7, this.enumValueId_);
                    }
                    if ((this.bitField0_ & 128) == 128) {
                        codedOutputStream.writeMessage(8, this.annotation_);
                    }
                    for (int i = 0; i < this.arrayElement_.size(); i++) {
                        codedOutputStream.writeMessage(9, this.arrayElement_.get(i));
                    }
                    if ((this.bitField0_ & 512) == 512) {
                        codedOutputStream.writeInt32(10, this.flags_);
                    }
                    if ((this.bitField0_ & 256) == 256) {
                        codedOutputStream.writeInt32(11, this.arrayDimensionCount_);
                    }
                    codedOutputStream.writeRawBytes(this.unknownFields);
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
                public int getSerializedSize() {
                    int i = this.memoizedSerializedSize;
                    if (i != -1) {
                        return i;
                    }
                    int iComputeEnumSize = (this.bitField0_ & 1) == 1 ? kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeEnumSize(1, this.type_.getNumber()) + 0 : 0;
                    if ((this.bitField0_ & 2) == 2) {
                        iComputeEnumSize += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeSInt64Size(2, this.intValue_);
                    }
                    if ((this.bitField0_ & 4) == 4) {
                        iComputeEnumSize += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeFloatSize(3, this.floatValue_);
                    }
                    if ((this.bitField0_ & 8) == 8) {
                        iComputeEnumSize += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeDoubleSize(4, this.doubleValue_);
                    }
                    if ((this.bitField0_ & 16) == 16) {
                        iComputeEnumSize += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeInt32Size(5, this.stringValue_);
                    }
                    if ((this.bitField0_ & 32) == 32) {
                        iComputeEnumSize += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeInt32Size(6, this.classId_);
                    }
                    if ((this.bitField0_ & 64) == 64) {
                        iComputeEnumSize += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeInt32Size(7, this.enumValueId_);
                    }
                    if ((this.bitField0_ & 128) == 128) {
                        iComputeEnumSize += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeMessageSize(8, this.annotation_);
                    }
                    for (int i2 = 0; i2 < this.arrayElement_.size(); i2++) {
                        iComputeEnumSize += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeMessageSize(9, this.arrayElement_.get(i2));
                    }
                    if ((this.bitField0_ & 512) == 512) {
                        iComputeEnumSize += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeInt32Size(10, this.flags_);
                    }
                    if ((this.bitField0_ & 256) == 256) {
                        iComputeEnumSize += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeInt32Size(11, this.arrayDimensionCount_);
                    }
                    int size = iComputeEnumSize + this.unknownFields.size();
                    this.memoizedSerializedSize = size;
                    return size;
                }

                public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Builder newBuilder() {
                    return kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Builder.create();
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
                public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Builder newBuilderForType() {
                    return newBuilder();
                }

                public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Builder newBuilder(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value value) {
                    return newBuilder().mergeFrom(value);
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
                public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Builder toBuilder() {
                    return newBuilder(this);
                }

                public static final class Builder extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Builder> implements kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.ValueOrBuilder {
                    private int arrayDimensionCount_;
                    private int bitField0_;
                    private int classId_;
                    private double doubleValue_;
                    private int enumValueId_;
                    private int flags_;
                    private float floatValue_;
                    private long intValue_;
                    private int stringValue_;
                    private kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Type type_ = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Type.BYTE;
                    private kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation annotation_ = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.getDefaultInstance();
                    private java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value> arrayElement_ = java.util.Collections.emptyList();

                    private void maybeForceBuilderInitialization() {
                    }

                    private Builder() {
                        maybeForceBuilderInitialization();
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Builder create() {
                        return new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Builder();
                    }

                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
                    /* JADX INFO: renamed from: clone */
                    public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Builder mo1266clone() {
                        return create().mergeFrom(buildPartial());
                    }

                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
                    public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value getDefaultInstanceForType() {
                        return kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.getDefaultInstance();
                    }

                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
                    public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value build() {
                        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value valueBuildPartial = buildPartial();
                        if (valueBuildPartial.isInitialized()) {
                            return valueBuildPartial;
                        }
                        throw newUninitializedMessageException(valueBuildPartial);
                    }

                    public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value buildPartial() {
                        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value value = new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value(this);
                        int i = this.bitField0_;
                        int i2 = (i & 1) != 1 ? 0 : 1;
                        value.type_ = this.type_;
                        if ((i & 2) == 2) {
                            i2 |= 2;
                        }
                        value.intValue_ = this.intValue_;
                        if ((i & 4) == 4) {
                            i2 |= 4;
                        }
                        value.floatValue_ = this.floatValue_;
                        if ((i & 8) == 8) {
                            i2 |= 8;
                        }
                        value.doubleValue_ = this.doubleValue_;
                        if ((i & 16) == 16) {
                            i2 |= 16;
                        }
                        value.stringValue_ = this.stringValue_;
                        if ((i & 32) == 32) {
                            i2 |= 32;
                        }
                        value.classId_ = this.classId_;
                        if ((i & 64) == 64) {
                            i2 |= 64;
                        }
                        value.enumValueId_ = this.enumValueId_;
                        if ((i & 128) == 128) {
                            i2 |= 128;
                        }
                        value.annotation_ = this.annotation_;
                        if ((this.bitField0_ & 256) == 256) {
                            this.arrayElement_ = java.util.Collections.unmodifiableList(this.arrayElement_);
                            this.bitField0_ &= -257;
                        }
                        value.arrayElement_ = this.arrayElement_;
                        if ((i & 512) == 512) {
                            i2 |= 256;
                        }
                        value.arrayDimensionCount_ = this.arrayDimensionCount_;
                        if ((i & 1024) == 1024) {
                            i2 |= 512;
                        }
                        value.flags_ = this.flags_;
                        value.bitField0_ = i2;
                        return value;
                    }

                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
                    public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Builder mergeFrom(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value value) {
                        if (value == kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.getDefaultInstance()) {
                            return this;
                        }
                        if (value.hasType()) {
                            setType(value.getType());
                        }
                        if (value.hasIntValue()) {
                            setIntValue(value.getIntValue());
                        }
                        if (value.hasFloatValue()) {
                            setFloatValue(value.getFloatValue());
                        }
                        if (value.hasDoubleValue()) {
                            setDoubleValue(value.getDoubleValue());
                        }
                        if (value.hasStringValue()) {
                            setStringValue(value.getStringValue());
                        }
                        if (value.hasClassId()) {
                            setClassId(value.getClassId());
                        }
                        if (value.hasEnumValueId()) {
                            setEnumValueId(value.getEnumValueId());
                        }
                        if (value.hasAnnotation()) {
                            mergeAnnotation(value.getAnnotation());
                        }
                        if (!value.arrayElement_.isEmpty()) {
                            if (this.arrayElement_.isEmpty()) {
                                this.arrayElement_ = value.arrayElement_;
                                this.bitField0_ &= -257;
                            } else {
                                ensureArrayElementIsMutable();
                                this.arrayElement_.addAll(value.arrayElement_);
                            }
                        }
                        if (value.hasArrayDimensionCount()) {
                            setArrayDimensionCount(value.getArrayDimensionCount());
                        }
                        if (value.hasFlags()) {
                            setFlags(value.getFlags());
                        }
                        setUnknownFields(getUnknownFields().concat(value.unknownFields));
                        return this;
                    }

                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
                    public final boolean isInitialized() {
                        if (hasAnnotation() && !getAnnotation().isInitialized()) {
                            return false;
                        }
                        for (int i = 0; i < getArrayElementCount(); i++) {
                            if (!getArrayElement(i).isInitialized()) {
                                return false;
                            }
                        }
                        return true;
                    }

                    /* JADX WARN: Code duplicated, block: B:15:0x001d  */
                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
                    public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Builder mergeFrom(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.lang.Throwable {
                        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value value = null;
                        try {
                            try {
                                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value partialFrom = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                                if (partialFrom != null) {
                                    mergeFrom(partialFrom);
                                }
                                return this;
                            } catch (kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException e) {
                                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value value2 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value) e.getUnfinishedMessage();
                                try {
                                    throw e;
                                } catch (java.lang.Throwable th) {
                                    th = th;
                                    value = value2;
                                    if (value != null) {
                                        mergeFrom(value);
                                    }
                                    throw th;
                                }
                            }
                        } catch (java.lang.Throwable th2) {
                            th = th2;
                            if (value != null) {
                                mergeFrom(value);
                            }
                            throw th;
                        }
                    }

                    public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Builder setType(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Type type) {
                        java.util.Objects.requireNonNull(type);
                        this.bitField0_ |= 1;
                        this.type_ = type;
                        return this;
                    }

                    public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Builder setIntValue(long j) {
                        this.bitField0_ |= 2;
                        this.intValue_ = j;
                        return this;
                    }

                    public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Builder setFloatValue(float f) {
                        this.bitField0_ |= 4;
                        this.floatValue_ = f;
                        return this;
                    }

                    public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Builder setDoubleValue(double d) {
                        this.bitField0_ |= 8;
                        this.doubleValue_ = d;
                        return this;
                    }

                    public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Builder setStringValue(int i) {
                        this.bitField0_ |= 16;
                        this.stringValue_ = i;
                        return this;
                    }

                    public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Builder setClassId(int i) {
                        this.bitField0_ |= 32;
                        this.classId_ = i;
                        return this;
                    }

                    public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Builder setEnumValueId(int i) {
                        this.bitField0_ |= 64;
                        this.enumValueId_ = i;
                        return this;
                    }

                    public boolean hasAnnotation() {
                        return (this.bitField0_ & 128) == 128;
                    }

                    public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation getAnnotation() {
                        return this.annotation_;
                    }

                    public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Builder mergeAnnotation(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation annotation) {
                        if ((this.bitField0_ & 128) == 128 && this.annotation_ != kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.getDefaultInstance()) {
                            this.annotation_ = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.newBuilder(this.annotation_).mergeFrom(annotation).buildPartial();
                        } else {
                            this.annotation_ = annotation;
                        }
                        this.bitField0_ |= 128;
                        return this;
                    }

                    private void ensureArrayElementIsMutable() {
                        if ((this.bitField0_ & 256) != 256) {
                            this.arrayElement_ = new java.util.ArrayList(this.arrayElement_);
                            this.bitField0_ |= 256;
                        }
                    }

                    public int getArrayElementCount() {
                        return this.arrayElement_.size();
                    }

                    public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value getArrayElement(int i) {
                        return this.arrayElement_.get(i);
                    }

                    public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Builder setArrayDimensionCount(int i) {
                        this.bitField0_ |= 512;
                        this.arrayDimensionCount_ = i;
                        return this;
                    }

                    public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Builder setFlags(int i) {
                        this.bitField0_ |= 1024;
                        this.flags_ = i;
                        return this;
                    }
                }
            }

            public boolean hasNameId() {
                return (this.bitField0_ & 1) == 1;
            }

            public int getNameId() {
                return this.nameId_;
            }

            public boolean hasValue() {
                return (this.bitField0_ & 2) == 2;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value getValue() {
                return this.value_;
            }

            private void initFields() {
                this.nameId_ = 0;
                this.value_ = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                byte b = this.memoizedIsInitialized;
                if (b == 1) {
                    return true;
                }
                if (b == 0) {
                    return false;
                }
                if (!hasNameId()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
                if (!hasValue()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
                if (!getValue().isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public void writeTo(kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream codedOutputStream) throws java.io.IOException {
                getSerializedSize();
                if ((this.bitField0_ & 1) == 1) {
                    codedOutputStream.writeInt32(1, this.nameId_);
                }
                if ((this.bitField0_ & 2) == 2) {
                    codedOutputStream.writeMessage(2, this.value_);
                }
                codedOutputStream.writeRawBytes(this.unknownFields);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public int getSerializedSize() {
                int i = this.memoizedSerializedSize;
                if (i != -1) {
                    return i;
                }
                int iComputeInt32Size = (this.bitField0_ & 1) == 1 ? 0 + kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeInt32Size(1, this.nameId_) : 0;
                if ((this.bitField0_ & 2) == 2) {
                    iComputeInt32Size += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeMessageSize(2, this.value_);
                }
                int size = iComputeInt32Size + this.unknownFields.size();
                this.memoizedSerializedSize = size;
                return size;
            }

            public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Builder newBuilder() {
                return kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Builder.create();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Builder newBuilderForType() {
                return newBuilder();
            }

            public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Builder newBuilder(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument argument) {
                return newBuilder().mergeFrom(argument);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Builder toBuilder() {
                return newBuilder(this);
            }

            public static final class Builder extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Builder> implements kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.ArgumentOrBuilder {
                private int bitField0_;
                private int nameId_;
                private kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value value_ = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.getDefaultInstance();

                private void maybeForceBuilderInitialization() {
                }

                private Builder() {
                    maybeForceBuilderInitialization();
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Builder create() {
                    return new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Builder();
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
                /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
                public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Builder mo1266clone() {
                    return create().mergeFrom(buildPartial());
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
                public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument getDefaultInstanceForType() {
                    return kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.getDefaultInstance();
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
                public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument build() {
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument argumentBuildPartial = buildPartial();
                    if (argumentBuildPartial.isInitialized()) {
                        return argumentBuildPartial;
                    }
                    throw newUninitializedMessageException(argumentBuildPartial);
                }

                public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument buildPartial() {
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument argument = new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument(this);
                    int i = this.bitField0_;
                    int i2 = (i & 1) != 1 ? 0 : 1;
                    argument.nameId_ = this.nameId_;
                    if ((i & 2) == 2) {
                        i2 |= 2;
                    }
                    argument.value_ = this.value_;
                    argument.bitField0_ = i2;
                    return argument;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
                public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Builder mergeFrom(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument argument) {
                    if (argument == kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.getDefaultInstance()) {
                        return this;
                    }
                    if (argument.hasNameId()) {
                        setNameId(argument.getNameId());
                    }
                    if (argument.hasValue()) {
                        mergeValue(argument.getValue());
                    }
                    setUnknownFields(getUnknownFields().concat(argument.unknownFields));
                    return this;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    return hasNameId() && hasValue() && getValue().isInitialized();
                }

                /* JADX WARN: Code duplicated, block: B:15:0x001d  */
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
                public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Builder mergeFrom(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.lang.Throwable {
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument argument = null;
                    try {
                        try {
                            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument partialFrom = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                            if (partialFrom != null) {
                                mergeFrom(partialFrom);
                            }
                            return this;
                        } catch (kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException e) {
                            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument argument2 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument) e.getUnfinishedMessage();
                            try {
                                throw e;
                            } catch (java.lang.Throwable th) {
                                th = th;
                                argument = argument2;
                                if (argument != null) {
                                    mergeFrom(argument);
                                }
                                throw th;
                            }
                        }
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        if (argument != null) {
                            mergeFrom(argument);
                        }
                        throw th;
                    }
                }

                public boolean hasNameId() {
                    return (this.bitField0_ & 1) == 1;
                }

                public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Builder setNameId(int i) {
                    this.bitField0_ |= 1;
                    this.nameId_ = i;
                    return this;
                }

                public boolean hasValue() {
                    return (this.bitField0_ & 2) == 2;
                }

                public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value getValue() {
                    return this.value_;
                }

                public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Builder mergeValue(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value value) {
                    if ((this.bitField0_ & 2) == 2 && this.value_ != kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.getDefaultInstance()) {
                        this.value_ = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.newBuilder(this.value_).mergeFrom(value).buildPartial();
                    } else {
                        this.value_ = value;
                    }
                    this.bitField0_ |= 2;
                    return this;
                }
            }
        }

        public boolean hasId() {
            return (this.bitField0_ & 1) == 1;
        }

        public int getId() {
            return this.id_;
        }

        public java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument> getArgumentList() {
            return this.argument_;
        }

        public int getArgumentCount() {
            return this.argument_.size();
        }

        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument getArgument(int i) {
            return this.argument_.get(i);
        }

        private void initFields() {
            this.id_ = 0;
            this.argument_ = java.util.Collections.emptyList();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            if (!hasId()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            for (int i = 0; i < getArgumentCount(); i++) {
                if (!getArgument(i).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream codedOutputStream) throws java.io.IOException {
            getSerializedSize();
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.writeInt32(1, this.id_);
            }
            for (int i = 0; i < this.argument_.size(); i++) {
                codedOutputStream.writeMessage(2, this.argument_.get(i));
            }
            codedOutputStream.writeRawBytes(this.unknownFields);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iComputeInt32Size = (this.bitField0_ & 1) == 1 ? kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeInt32Size(1, this.id_) + 0 : 0;
            for (int i2 = 0; i2 < this.argument_.size(); i2++) {
                iComputeInt32Size += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeMessageSize(2, this.argument_.get(i2));
            }
            int size = iComputeInt32Size + this.unknownFields.size();
            this.memoizedSerializedSize = size;
            return size;
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Builder newBuilder() {
            return kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Builder.create();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Builder newBuilderForType() {
            return newBuilder();
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Builder newBuilder(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation annotation) {
            return newBuilder().mergeFrom(annotation);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Builder toBuilder() {
            return newBuilder(this);
        }

        public static final class Builder extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Builder> implements kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.AnnotationOrBuilder {
            private java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument> argument_ = java.util.Collections.emptyList();
            private int bitField0_;
            private int id_;

            private void maybeForceBuilderInitialization() {
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Builder create() {
                return new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Builder();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Builder mo1266clone() {
                return create().mergeFrom(buildPartial());
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation getDefaultInstanceForType() {
                return kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation build() {
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation annotationBuildPartial = buildPartial();
                if (annotationBuildPartial.isInitialized()) {
                    return annotationBuildPartial;
                }
                throw newUninitializedMessageException(annotationBuildPartial);
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation buildPartial() {
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation annotation = new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation(this);
                int i = (this.bitField0_ & 1) != 1 ? 0 : 1;
                annotation.id_ = this.id_;
                if ((this.bitField0_ & 2) == 2) {
                    this.argument_ = java.util.Collections.unmodifiableList(this.argument_);
                    this.bitField0_ &= -3;
                }
                annotation.argument_ = this.argument_;
                annotation.bitField0_ = i;
                return annotation;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Builder mergeFrom(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation annotation) {
                if (annotation == kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.getDefaultInstance()) {
                    return this;
                }
                if (annotation.hasId()) {
                    setId(annotation.getId());
                }
                if (!annotation.argument_.isEmpty()) {
                    if (this.argument_.isEmpty()) {
                        this.argument_ = annotation.argument_;
                        this.bitField0_ &= -3;
                    } else {
                        ensureArgumentIsMutable();
                        this.argument_.addAll(annotation.argument_);
                    }
                }
                setUnknownFields(getUnknownFields().concat(annotation.unknownFields));
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (!hasId()) {
                    return false;
                }
                for (int i = 0; i < getArgumentCount(); i++) {
                    if (!getArgument(i).isInitialized()) {
                        return false;
                    }
                }
                return true;
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Builder mergeFrom(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.lang.Throwable {
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation annotation = null;
                try {
                    try {
                        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation partialFrom = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (partialFrom != null) {
                            mergeFrom(partialFrom);
                        }
                        return this;
                    } catch (kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException e) {
                        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation annotation2 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation) e.getUnfinishedMessage();
                        try {
                            throw e;
                        } catch (java.lang.Throwable th) {
                            th = th;
                            annotation = annotation2;
                            if (annotation != null) {
                                mergeFrom(annotation);
                            }
                            throw th;
                        }
                    }
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    if (annotation != null) {
                        mergeFrom(annotation);
                    }
                    throw th;
                }
            }

            public boolean hasId() {
                return (this.bitField0_ & 1) == 1;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Builder setId(int i) {
                this.bitField0_ |= 1;
                this.id_ = i;
                return this;
            }

            private void ensureArgumentIsMutable() {
                if ((this.bitField0_ & 2) != 2) {
                    this.argument_ = new java.util.ArrayList(this.argument_);
                    this.bitField0_ |= 2;
                }
            }

            public int getArgumentCount() {
                return this.argument_.size();
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument getArgument(int i) {
                return this.argument_.get(i);
            }
        }
    }

    public static final class Type extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type> implements kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeOrBuilder {
        public static kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type> PARSER = new kotlin.reflect.jvm.internal.impl.protobuf.AbstractParser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type>() { // from class: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.1
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type parsePartialFrom(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
                return new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type(codedInputStream, extensionRegistryLite);
            }
        };
        private static final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type defaultInstance;
        private int abbreviatedTypeId_;
        private kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type abbreviatedType_;
        private java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument> argument_;
        private int bitField0_;
        private int className_;
        private int flags_;
        private int flexibleTypeCapabilitiesId_;
        private int flexibleUpperBoundId_;
        private kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type flexibleUpperBound_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private boolean nullable_;
        private int outerTypeId_;
        private kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type outerType_;
        private int typeAliasName_;
        private int typeParameterName_;
        private int typeParameter_;
        private final kotlin.reflect.jvm.internal.impl.protobuf.ByteString unknownFields;

        public interface ArgumentOrBuilder extends kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder {
        }

        private Type(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type, ?> extendableBuilder) {
            super(extendableBuilder);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = extendableBuilder.getUnknownFields();
        }

        private Type(boolean z) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = kotlin.reflect.jvm.internal.impl.protobuf.ByteString.EMPTY;
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type getDefaultInstance() {
            return defaultInstance;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type getDefaultInstanceForType() {
            return defaultInstance;
        }

        private Type(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Builder builder;
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            initFields();
            kotlin.reflect.jvm.internal.impl.protobuf.ByteString.Output outputNewOutput = kotlin.reflect.jvm.internal.impl.protobuf.ByteString.newOutput();
            kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream codedOutputStreamNewInstance = kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.newInstance(outputNewOutput, 1);
            boolean z = false;
            boolean z2 = false;
            while (!z) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        switch (tag) {
                            case 0:
                                break;
                            case 8:
                                this.bitField0_ |= 4096;
                                this.flags_ = codedInputStream.readInt32();
                                continue;
                            case 18:
                                if (!(z2 & true)) {
                                    this.argument_ = new java.util.ArrayList();
                                    z2 |= true;
                                }
                                this.argument_.add((kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument) codedInputStream.readMessage(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument.PARSER, extensionRegistryLite));
                                continue;
                            case 24:
                                this.bitField0_ |= 1;
                                this.nullable_ = codedInputStream.readBool();
                                continue;
                            case 32:
                                this.bitField0_ |= 2;
                                this.flexibleTypeCapabilitiesId_ = codedInputStream.readInt32();
                                continue;
                            case 42:
                                builder = (this.bitField0_ & 4) == 4 ? this.flexibleUpperBound_.toBuilder() : null;
                                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type type = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type) codedInputStream.readMessage(PARSER, extensionRegistryLite);
                                this.flexibleUpperBound_ = type;
                                if (builder != null) {
                                    builder.mergeFrom(type);
                                    this.flexibleUpperBound_ = builder.buildPartial();
                                }
                                this.bitField0_ |= 4;
                                continue;
                            case 48:
                                this.bitField0_ |= 16;
                                this.className_ = codedInputStream.readInt32();
                                continue;
                            case 56:
                                this.bitField0_ |= 32;
                                this.typeParameter_ = codedInputStream.readInt32();
                                continue;
                            case 64:
                                this.bitField0_ |= 8;
                                this.flexibleUpperBoundId_ = codedInputStream.readInt32();
                                continue;
                            case 72:
                                this.bitField0_ |= 64;
                                this.typeParameterName_ = codedInputStream.readInt32();
                                continue;
                            case 82:
                                builder = (this.bitField0_ & 256) == 256 ? this.outerType_.toBuilder() : null;
                                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type type2 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type) codedInputStream.readMessage(PARSER, extensionRegistryLite);
                                this.outerType_ = type2;
                                if (builder != null) {
                                    builder.mergeFrom(type2);
                                    this.outerType_ = builder.buildPartial();
                                }
                                this.bitField0_ |= 256;
                                continue;
                            case 88:
                                this.bitField0_ |= 512;
                                this.outerTypeId_ = codedInputStream.readInt32();
                                continue;
                            case 96:
                                this.bitField0_ |= 128;
                                this.typeAliasName_ = codedInputStream.readInt32();
                                continue;
                            case 106:
                                builder = (this.bitField0_ & 1024) == 1024 ? this.abbreviatedType_.toBuilder() : null;
                                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type type3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type) codedInputStream.readMessage(PARSER, extensionRegistryLite);
                                this.abbreviatedType_ = type3;
                                if (builder != null) {
                                    builder.mergeFrom(type3);
                                    this.abbreviatedType_ = builder.buildPartial();
                                }
                                this.bitField0_ |= 1024;
                                continue;
                            case 112:
                                this.bitField0_ |= 2048;
                                this.abbreviatedTypeId_ = codedInputStream.readInt32();
                                continue;
                            default:
                                if (!parseUnknownField(codedInputStream, codedOutputStreamNewInstance, extensionRegistryLite, tag)) {
                                    break;
                                }
                                break;
                        }
                        z = true;
                    } catch (kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException e) {
                        throw e.setUnfinishedMessage(this);
                    } catch (java.io.IOException e2) {
                        throw new kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                    }
                } catch (java.lang.Throwable th) {
                    if (z2 & true) {
                        this.argument_ = java.util.Collections.unmodifiableList(this.argument_);
                    }
                    try {
                        codedOutputStreamNewInstance.flush();
                    } catch (java.io.IOException unused) {
                    } finally {
                        this.unknownFields = outputNewOutput.toByteString();
                    }
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            if (z2 & true) {
                this.argument_ = java.util.Collections.unmodifiableList(this.argument_);
            }
            try {
                codedOutputStreamNewInstance.flush();
            } catch (java.io.IOException unused2) {
            } finally {
                this.unknownFields = outputNewOutput.toByteString();
            }
            makeExtensionsImmutable();
        }

        static {
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type type = new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type(true);
            defaultInstance = type;
            type.initFields();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type> getParserForType() {
            return PARSER;
        }

        public static final class Argument extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite implements kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.ArgumentOrBuilder {
            public static kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument> PARSER = new kotlin.reflect.jvm.internal.impl.protobuf.AbstractParser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument>() { // from class: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument.1
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
                public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument parsePartialFrom(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
                    return new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument(codedInputStream, extensionRegistryLite);
                }
            };
            private static final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument defaultInstance;
            private int bitField0_;
            private byte memoizedIsInitialized;
            private int memoizedSerializedSize;
            private kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument.Projection projection_;
            private int typeId_;
            private kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type type_;
            private final kotlin.reflect.jvm.internal.impl.protobuf.ByteString unknownFields;

            private Argument(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder builder) {
                super(builder);
                this.memoizedIsInitialized = (byte) -1;
                this.memoizedSerializedSize = -1;
                this.unknownFields = builder.getUnknownFields();
            }

            private Argument(boolean z) {
                this.memoizedIsInitialized = (byte) -1;
                this.memoizedSerializedSize = -1;
                this.unknownFields = kotlin.reflect.jvm.internal.impl.protobuf.ByteString.EMPTY;
            }

            public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument getDefaultInstance() {
                return defaultInstance;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument getDefaultInstanceForType() {
                return defaultInstance;
            }

            private Argument(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
                this.memoizedIsInitialized = (byte) -1;
                this.memoizedSerializedSize = -1;
                initFields();
                kotlin.reflect.jvm.internal.impl.protobuf.ByteString.Output outputNewOutput = kotlin.reflect.jvm.internal.impl.protobuf.ByteString.newOutput();
                kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream codedOutputStreamNewInstance = kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.newInstance(outputNewOutput, 1);
                boolean z = false;
                while (!z) {
                    try {
                        try {
                            try {
                                int tag = codedInputStream.readTag();
                                if (tag != 0) {
                                    if (tag == 8) {
                                        int i = codedInputStream.readEnum();
                                        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument.Projection projectionValueOf = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument.Projection.valueOf(i);
                                        if (projectionValueOf == null) {
                                            codedOutputStreamNewInstance.writeRawVarint32(tag);
                                            codedOutputStreamNewInstance.writeRawVarint32(i);
                                        } else {
                                            this.bitField0_ |= 1;
                                            this.projection_ = projectionValueOf;
                                        }
                                    } else if (tag == 18) {
                                        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Builder builder = (this.bitField0_ & 2) == 2 ? this.type_.toBuilder() : null;
                                        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type type = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type) codedInputStream.readMessage(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.PARSER, extensionRegistryLite);
                                        this.type_ = type;
                                        if (builder != null) {
                                            builder.mergeFrom(type);
                                            this.type_ = builder.buildPartial();
                                        }
                                        this.bitField0_ |= 2;
                                    } else if (tag != 24) {
                                        if (!parseUnknownField(codedInputStream, codedOutputStreamNewInstance, extensionRegistryLite, tag)) {
                                        }
                                    } else {
                                        this.bitField0_ |= 4;
                                        this.typeId_ = codedInputStream.readInt32();
                                    }
                                }
                                z = true;
                            } catch (kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException e) {
                                throw e.setUnfinishedMessage(this);
                            }
                        } catch (java.io.IOException e2) {
                            throw new kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                        }
                    } catch (java.lang.Throwable th) {
                        try {
                            codedOutputStreamNewInstance.flush();
                        } catch (java.io.IOException unused) {
                        } finally {
                            this.unknownFields = outputNewOutput.toByteString();
                        }
                        makeExtensionsImmutable();
                        throw th;
                    }
                }
                try {
                    codedOutputStreamNewInstance.flush();
                } catch (java.io.IOException unused2) {
                } finally {
                    this.unknownFields = outputNewOutput.toByteString();
                }
                makeExtensionsImmutable();
            }

            static {
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument argument = new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument(true);
                defaultInstance = argument;
                argument.initFields();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument> getParserForType() {
                return PARSER;
            }

            public enum Projection implements kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite {
                IN(0, 0),
                OUT(1, 1),
                INV(2, 2),
                STAR(3, 3);

                private static kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument.Projection> internalValueMap = new kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument.Projection>() { // from class: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument.Projection.1
                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap
                    public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument.Projection findValueByNumber(int i) {
                        return kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument.Projection.valueOf(i);
                    }
                };
                private final int value;

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
                public final int getNumber() {
                    return this.value;
                }

                public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument.Projection valueOf(int i) {
                    if (i == 0) {
                        return IN;
                    }
                    if (i == 1) {
                        return OUT;
                    }
                    if (i == 2) {
                        return INV;
                    }
                    if (i != 3) {
                        return null;
                    }
                    return STAR;
                }

                Projection(int i, int i2) {
                    this.value = i2;
                }
            }

            public boolean hasProjection() {
                return (this.bitField0_ & 1) == 1;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument.Projection getProjection() {
                return this.projection_;
            }

            public boolean hasType() {
                return (this.bitField0_ & 2) == 2;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type getType() {
                return this.type_;
            }

            public boolean hasTypeId() {
                return (this.bitField0_ & 4) == 4;
            }

            public int getTypeId() {
                return this.typeId_;
            }

            private void initFields() {
                this.projection_ = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument.Projection.INV;
                this.type_ = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.getDefaultInstance();
                this.typeId_ = 0;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                byte b = this.memoizedIsInitialized;
                if (b == 1) {
                    return true;
                }
                if (b == 0) {
                    return false;
                }
                if (hasType() && !getType().isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public void writeTo(kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream codedOutputStream) throws java.io.IOException {
                getSerializedSize();
                if ((this.bitField0_ & 1) == 1) {
                    codedOutputStream.writeEnum(1, this.projection_.getNumber());
                }
                if ((this.bitField0_ & 2) == 2) {
                    codedOutputStream.writeMessage(2, this.type_);
                }
                if ((this.bitField0_ & 4) == 4) {
                    codedOutputStream.writeInt32(3, this.typeId_);
                }
                codedOutputStream.writeRawBytes(this.unknownFields);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public int getSerializedSize() {
                int i = this.memoizedSerializedSize;
                if (i != -1) {
                    return i;
                }
                int iComputeEnumSize = (this.bitField0_ & 1) == 1 ? 0 + kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeEnumSize(1, this.projection_.getNumber()) : 0;
                if ((this.bitField0_ & 2) == 2) {
                    iComputeEnumSize += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeMessageSize(2, this.type_);
                }
                if ((this.bitField0_ & 4) == 4) {
                    iComputeEnumSize += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeInt32Size(3, this.typeId_);
                }
                int size = iComputeEnumSize + this.unknownFields.size();
                this.memoizedSerializedSize = size;
                return size;
            }

            public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument.Builder newBuilder() {
                return kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument.Builder.create();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument.Builder newBuilderForType() {
                return newBuilder();
            }

            public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument.Builder newBuilder(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument argument) {
                return newBuilder().mergeFrom(argument);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument.Builder toBuilder() {
                return newBuilder(this);
            }

            public static final class Builder extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument.Builder> implements kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.ArgumentOrBuilder {
                private int bitField0_;
                private int typeId_;
                private kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument.Projection projection_ = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument.Projection.INV;
                private kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type type_ = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.getDefaultInstance();

                private void maybeForceBuilderInitialization() {
                }

                private Builder() {
                    maybeForceBuilderInitialization();
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument.Builder create() {
                    return new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument.Builder();
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
                /* JADX INFO: renamed from: clone */
                public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument.Builder mo1266clone() {
                    return create().mergeFrom(buildPartial());
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
                public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument getDefaultInstanceForType() {
                    return kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument.getDefaultInstance();
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
                public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument build() {
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument argumentBuildPartial = buildPartial();
                    if (argumentBuildPartial.isInitialized()) {
                        return argumentBuildPartial;
                    }
                    throw newUninitializedMessageException(argumentBuildPartial);
                }

                public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument buildPartial() {
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument argument = new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument(this);
                    int i = this.bitField0_;
                    int i2 = (i & 1) != 1 ? 0 : 1;
                    argument.projection_ = this.projection_;
                    if ((i & 2) == 2) {
                        i2 |= 2;
                    }
                    argument.type_ = this.type_;
                    if ((i & 4) == 4) {
                        i2 |= 4;
                    }
                    argument.typeId_ = this.typeId_;
                    argument.bitField0_ = i2;
                    return argument;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
                public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument.Builder mergeFrom(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument argument) {
                    if (argument == kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument.getDefaultInstance()) {
                        return this;
                    }
                    if (argument.hasProjection()) {
                        setProjection(argument.getProjection());
                    }
                    if (argument.hasType()) {
                        mergeType(argument.getType());
                    }
                    if (argument.hasTypeId()) {
                        setTypeId(argument.getTypeId());
                    }
                    setUnknownFields(getUnknownFields().concat(argument.unknownFields));
                    return this;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    return !hasType() || getType().isInitialized();
                }

                /* JADX WARN: Code duplicated, block: B:15:0x001d  */
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
                public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument.Builder mergeFrom(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.lang.Throwable {
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument argument = null;
                    try {
                        try {
                            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument partialFrom = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                            if (partialFrom != null) {
                                mergeFrom(partialFrom);
                            }
                            return this;
                        } catch (kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException e) {
                            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument argument2 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument) e.getUnfinishedMessage();
                            try {
                                throw e;
                            } catch (java.lang.Throwable th) {
                                th = th;
                                argument = argument2;
                                if (argument != null) {
                                    mergeFrom(argument);
                                }
                                throw th;
                            }
                        }
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        if (argument != null) {
                            mergeFrom(argument);
                        }
                        throw th;
                    }
                }

                public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument.Builder setProjection(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument.Projection projection) {
                    java.util.Objects.requireNonNull(projection);
                    this.bitField0_ |= 1;
                    this.projection_ = projection;
                    return this;
                }

                public boolean hasType() {
                    return (this.bitField0_ & 2) == 2;
                }

                public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type getType() {
                    return this.type_;
                }

                public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument.Builder mergeType(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type type) {
                    if ((this.bitField0_ & 2) == 2 && this.type_ != kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.getDefaultInstance()) {
                        this.type_ = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.newBuilder(this.type_).mergeFrom(type).buildPartial();
                    } else {
                        this.type_ = type;
                    }
                    this.bitField0_ |= 2;
                    return this;
                }

                public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument.Builder setTypeId(int i) {
                    this.bitField0_ |= 4;
                    this.typeId_ = i;
                    return this;
                }
            }
        }

        public java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument> getArgumentList() {
            return this.argument_;
        }

        public int getArgumentCount() {
            return this.argument_.size();
        }

        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument getArgument(int i) {
            return this.argument_.get(i);
        }

        public boolean hasNullable() {
            return (this.bitField0_ & 1) == 1;
        }

        public boolean getNullable() {
            return this.nullable_;
        }

        public boolean hasFlexibleTypeCapabilitiesId() {
            return (this.bitField0_ & 2) == 2;
        }

        public int getFlexibleTypeCapabilitiesId() {
            return this.flexibleTypeCapabilitiesId_;
        }

        public boolean hasFlexibleUpperBound() {
            return (this.bitField0_ & 4) == 4;
        }

        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type getFlexibleUpperBound() {
            return this.flexibleUpperBound_;
        }

        public boolean hasFlexibleUpperBoundId() {
            return (this.bitField0_ & 8) == 8;
        }

        public int getFlexibleUpperBoundId() {
            return this.flexibleUpperBoundId_;
        }

        public boolean hasClassName() {
            return (this.bitField0_ & 16) == 16;
        }

        public int getClassName() {
            return this.className_;
        }

        public boolean hasTypeParameter() {
            return (this.bitField0_ & 32) == 32;
        }

        public int getTypeParameter() {
            return this.typeParameter_;
        }

        public boolean hasTypeParameterName() {
            return (this.bitField0_ & 64) == 64;
        }

        public int getTypeParameterName() {
            return this.typeParameterName_;
        }

        public boolean hasTypeAliasName() {
            return (this.bitField0_ & 128) == 128;
        }

        public int getTypeAliasName() {
            return this.typeAliasName_;
        }

        public boolean hasOuterType() {
            return (this.bitField0_ & 256) == 256;
        }

        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type getOuterType() {
            return this.outerType_;
        }

        public boolean hasOuterTypeId() {
            return (this.bitField0_ & 512) == 512;
        }

        public int getOuterTypeId() {
            return this.outerTypeId_;
        }

        public boolean hasAbbreviatedType() {
            return (this.bitField0_ & 1024) == 1024;
        }

        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type getAbbreviatedType() {
            return this.abbreviatedType_;
        }

        public boolean hasAbbreviatedTypeId() {
            return (this.bitField0_ & 2048) == 2048;
        }

        public int getAbbreviatedTypeId() {
            return this.abbreviatedTypeId_;
        }

        public boolean hasFlags() {
            return (this.bitField0_ & 4096) == 4096;
        }

        public int getFlags() {
            return this.flags_;
        }

        private void initFields() {
            this.argument_ = java.util.Collections.emptyList();
            this.nullable_ = false;
            this.flexibleTypeCapabilitiesId_ = 0;
            this.flexibleUpperBound_ = getDefaultInstance();
            this.flexibleUpperBoundId_ = 0;
            this.className_ = 0;
            this.typeParameter_ = 0;
            this.typeParameterName_ = 0;
            this.typeAliasName_ = 0;
            this.outerType_ = getDefaultInstance();
            this.outerTypeId_ = 0;
            this.abbreviatedType_ = getDefaultInstance();
            this.abbreviatedTypeId_ = 0;
            this.flags_ = 0;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            for (int i = 0; i < getArgumentCount(); i++) {
                if (!getArgument(i).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            if (hasFlexibleUpperBound() && !getFlexibleUpperBound().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasOuterType() && !getOuterType().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasAbbreviatedType() && !getAbbreviatedType().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!extensionsAreInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream codedOutputStream) throws java.io.IOException {
            getSerializedSize();
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage<MessageType>.ExtensionWriter extensionWriterNewExtensionWriter = newExtensionWriter();
            if ((this.bitField0_ & 4096) == 4096) {
                codedOutputStream.writeInt32(1, this.flags_);
            }
            for (int i = 0; i < this.argument_.size(); i++) {
                codedOutputStream.writeMessage(2, this.argument_.get(i));
            }
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.writeBool(3, this.nullable_);
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.writeInt32(4, this.flexibleTypeCapabilitiesId_);
            }
            if ((this.bitField0_ & 4) == 4) {
                codedOutputStream.writeMessage(5, this.flexibleUpperBound_);
            }
            if ((this.bitField0_ & 16) == 16) {
                codedOutputStream.writeInt32(6, this.className_);
            }
            if ((this.bitField0_ & 32) == 32) {
                codedOutputStream.writeInt32(7, this.typeParameter_);
            }
            if ((this.bitField0_ & 8) == 8) {
                codedOutputStream.writeInt32(8, this.flexibleUpperBoundId_);
            }
            if ((this.bitField0_ & 64) == 64) {
                codedOutputStream.writeInt32(9, this.typeParameterName_);
            }
            if ((this.bitField0_ & 256) == 256) {
                codedOutputStream.writeMessage(10, this.outerType_);
            }
            if ((this.bitField0_ & 512) == 512) {
                codedOutputStream.writeInt32(11, this.outerTypeId_);
            }
            if ((this.bitField0_ & 128) == 128) {
                codedOutputStream.writeInt32(12, this.typeAliasName_);
            }
            if ((this.bitField0_ & 1024) == 1024) {
                codedOutputStream.writeMessage(13, this.abbreviatedType_);
            }
            if ((this.bitField0_ & 2048) == 2048) {
                codedOutputStream.writeInt32(14, this.abbreviatedTypeId_);
            }
            extensionWriterNewExtensionWriter.writeUntil(200, codedOutputStream);
            codedOutputStream.writeRawBytes(this.unknownFields);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iComputeInt32Size = (this.bitField0_ & 4096) == 4096 ? kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeInt32Size(1, this.flags_) + 0 : 0;
            for (int i2 = 0; i2 < this.argument_.size(); i2++) {
                iComputeInt32Size += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeMessageSize(2, this.argument_.get(i2));
            }
            if ((this.bitField0_ & 1) == 1) {
                iComputeInt32Size += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeBoolSize(3, this.nullable_);
            }
            if ((this.bitField0_ & 2) == 2) {
                iComputeInt32Size += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeInt32Size(4, this.flexibleTypeCapabilitiesId_);
            }
            if ((this.bitField0_ & 4) == 4) {
                iComputeInt32Size += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeMessageSize(5, this.flexibleUpperBound_);
            }
            if ((this.bitField0_ & 16) == 16) {
                iComputeInt32Size += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeInt32Size(6, this.className_);
            }
            if ((this.bitField0_ & 32) == 32) {
                iComputeInt32Size += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeInt32Size(7, this.typeParameter_);
            }
            if ((this.bitField0_ & 8) == 8) {
                iComputeInt32Size += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeInt32Size(8, this.flexibleUpperBoundId_);
            }
            if ((this.bitField0_ & 64) == 64) {
                iComputeInt32Size += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeInt32Size(9, this.typeParameterName_);
            }
            if ((this.bitField0_ & 256) == 256) {
                iComputeInt32Size += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeMessageSize(10, this.outerType_);
            }
            if ((this.bitField0_ & 512) == 512) {
                iComputeInt32Size += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeInt32Size(11, this.outerTypeId_);
            }
            if ((this.bitField0_ & 128) == 128) {
                iComputeInt32Size += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeInt32Size(12, this.typeAliasName_);
            }
            if ((this.bitField0_ & 1024) == 1024) {
                iComputeInt32Size += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeMessageSize(13, this.abbreviatedType_);
            }
            if ((this.bitField0_ & 2048) == 2048) {
                iComputeInt32Size += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeInt32Size(14, this.abbreviatedTypeId_);
            }
            int iExtensionsSerializedSize = iComputeInt32Size + extensionsSerializedSize() + this.unknownFields.size();
            this.memoizedSerializedSize = iExtensionsSerializedSize;
            return iExtensionsSerializedSize;
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Builder newBuilder() {
            return kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Builder.create();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Builder newBuilderForType() {
            return newBuilder();
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Builder newBuilder(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type type) {
            return newBuilder().mergeFrom(type);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Builder toBuilder() {
            return newBuilder(this);
        }

        public static final class Builder extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Builder> implements kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeOrBuilder {
            private int abbreviatedTypeId_;
            private int bitField0_;
            private int className_;
            private int flags_;
            private int flexibleTypeCapabilitiesId_;
            private int flexibleUpperBoundId_;
            private boolean nullable_;
            private int outerTypeId_;
            private int typeAliasName_;
            private int typeParameterName_;
            private int typeParameter_;
            private java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument> argument_ = java.util.Collections.emptyList();
            private kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type flexibleUpperBound_ = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.getDefaultInstance();
            private kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type outerType_ = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.getDefaultInstance();
            private kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type abbreviatedType_ = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.getDefaultInstance();

            private void maybeForceBuilderInitialization() {
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Builder create() {
                return new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Builder();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Builder mo1266clone() {
                return create().mergeFrom(buildPartial());
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type getDefaultInstanceForType() {
                return kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type build() {
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type typeBuildPartial = buildPartial();
                if (typeBuildPartial.isInitialized()) {
                    return typeBuildPartial;
                }
                throw newUninitializedMessageException(typeBuildPartial);
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type buildPartial() {
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type type = new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type(this);
                int i = this.bitField0_;
                if ((i & 1) == 1) {
                    this.argument_ = java.util.Collections.unmodifiableList(this.argument_);
                    this.bitField0_ &= -2;
                }
                type.argument_ = this.argument_;
                int i2 = (i & 2) != 2 ? 0 : 1;
                type.nullable_ = this.nullable_;
                if ((i & 4) == 4) {
                    i2 |= 2;
                }
                type.flexibleTypeCapabilitiesId_ = this.flexibleTypeCapabilitiesId_;
                if ((i & 8) == 8) {
                    i2 |= 4;
                }
                type.flexibleUpperBound_ = this.flexibleUpperBound_;
                if ((i & 16) == 16) {
                    i2 |= 8;
                }
                type.flexibleUpperBoundId_ = this.flexibleUpperBoundId_;
                if ((i & 32) == 32) {
                    i2 |= 16;
                }
                type.className_ = this.className_;
                if ((i & 64) == 64) {
                    i2 |= 32;
                }
                type.typeParameter_ = this.typeParameter_;
                if ((i & 128) == 128) {
                    i2 |= 64;
                }
                type.typeParameterName_ = this.typeParameterName_;
                if ((i & 256) == 256) {
                    i2 |= 128;
                }
                type.typeAliasName_ = this.typeAliasName_;
                if ((i & 512) == 512) {
                    i2 |= 256;
                }
                type.outerType_ = this.outerType_;
                if ((i & 1024) == 1024) {
                    i2 |= 512;
                }
                type.outerTypeId_ = this.outerTypeId_;
                if ((i & 2048) == 2048) {
                    i2 |= 1024;
                }
                type.abbreviatedType_ = this.abbreviatedType_;
                if ((i & 4096) == 4096) {
                    i2 |= 2048;
                }
                type.abbreviatedTypeId_ = this.abbreviatedTypeId_;
                if ((i & 8192) == 8192) {
                    i2 |= 4096;
                }
                type.flags_ = this.flags_;
                type.bitField0_ = i2;
                return type;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Builder mergeFrom(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type type) {
                if (type == kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.getDefaultInstance()) {
                    return this;
                }
                if (!type.argument_.isEmpty()) {
                    if (this.argument_.isEmpty()) {
                        this.argument_ = type.argument_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureArgumentIsMutable();
                        this.argument_.addAll(type.argument_);
                    }
                }
                if (type.hasNullable()) {
                    setNullable(type.getNullable());
                }
                if (type.hasFlexibleTypeCapabilitiesId()) {
                    setFlexibleTypeCapabilitiesId(type.getFlexibleTypeCapabilitiesId());
                }
                if (type.hasFlexibleUpperBound()) {
                    mergeFlexibleUpperBound(type.getFlexibleUpperBound());
                }
                if (type.hasFlexibleUpperBoundId()) {
                    setFlexibleUpperBoundId(type.getFlexibleUpperBoundId());
                }
                if (type.hasClassName()) {
                    setClassName(type.getClassName());
                }
                if (type.hasTypeParameter()) {
                    setTypeParameter(type.getTypeParameter());
                }
                if (type.hasTypeParameterName()) {
                    setTypeParameterName(type.getTypeParameterName());
                }
                if (type.hasTypeAliasName()) {
                    setTypeAliasName(type.getTypeAliasName());
                }
                if (type.hasOuterType()) {
                    mergeOuterType(type.getOuterType());
                }
                if (type.hasOuterTypeId()) {
                    setOuterTypeId(type.getOuterTypeId());
                }
                if (type.hasAbbreviatedType()) {
                    mergeAbbreviatedType(type.getAbbreviatedType());
                }
                if (type.hasAbbreviatedTypeId()) {
                    setAbbreviatedTypeId(type.getAbbreviatedTypeId());
                }
                if (type.hasFlags()) {
                    setFlags(type.getFlags());
                }
                mergeExtensionFields(type);
                setUnknownFields(getUnknownFields().concat(type.unknownFields));
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                for (int i = 0; i < getArgumentCount(); i++) {
                    if (!getArgument(i).isInitialized()) {
                        return false;
                    }
                }
                if (hasFlexibleUpperBound() && !getFlexibleUpperBound().isInitialized()) {
                    return false;
                }
                if (!hasOuterType() || getOuterType().isInitialized()) {
                    return (!hasAbbreviatedType() || getAbbreviatedType().isInitialized()) && extensionsAreInitialized();
                }
                return false;
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Builder mergeFrom(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.lang.Throwable {
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type type = null;
                try {
                    try {
                        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type partialFrom = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (partialFrom != null) {
                            mergeFrom(partialFrom);
                        }
                        return this;
                    } catch (kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException e) {
                        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type type2 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type) e.getUnfinishedMessage();
                        try {
                            throw e;
                        } catch (java.lang.Throwable th) {
                            th = th;
                            type = type2;
                            if (type != null) {
                                mergeFrom(type);
                            }
                            throw th;
                        }
                    }
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    if (type != null) {
                        mergeFrom(type);
                    }
                    throw th;
                }
            }

            private void ensureArgumentIsMutable() {
                if ((this.bitField0_ & 1) != 1) {
                    this.argument_ = new java.util.ArrayList(this.argument_);
                    this.bitField0_ |= 1;
                }
            }

            public int getArgumentCount() {
                return this.argument_.size();
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument getArgument(int i) {
                return this.argument_.get(i);
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Builder setNullable(boolean z) {
                this.bitField0_ |= 2;
                this.nullable_ = z;
                return this;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Builder setFlexibleTypeCapabilitiesId(int i) {
                this.bitField0_ |= 4;
                this.flexibleTypeCapabilitiesId_ = i;
                return this;
            }

            public boolean hasFlexibleUpperBound() {
                return (this.bitField0_ & 8) == 8;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type getFlexibleUpperBound() {
                return this.flexibleUpperBound_;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Builder mergeFlexibleUpperBound(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type type) {
                if ((this.bitField0_ & 8) == 8 && this.flexibleUpperBound_ != kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.getDefaultInstance()) {
                    this.flexibleUpperBound_ = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.newBuilder(this.flexibleUpperBound_).mergeFrom(type).buildPartial();
                } else {
                    this.flexibleUpperBound_ = type;
                }
                this.bitField0_ |= 8;
                return this;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Builder setFlexibleUpperBoundId(int i) {
                this.bitField0_ |= 16;
                this.flexibleUpperBoundId_ = i;
                return this;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Builder setClassName(int i) {
                this.bitField0_ |= 32;
                this.className_ = i;
                return this;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Builder setTypeParameter(int i) {
                this.bitField0_ |= 64;
                this.typeParameter_ = i;
                return this;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Builder setTypeParameterName(int i) {
                this.bitField0_ |= 128;
                this.typeParameterName_ = i;
                return this;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Builder setTypeAliasName(int i) {
                this.bitField0_ |= 256;
                this.typeAliasName_ = i;
                return this;
            }

            public boolean hasOuterType() {
                return (this.bitField0_ & 512) == 512;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type getOuterType() {
                return this.outerType_;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Builder mergeOuterType(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type type) {
                if ((this.bitField0_ & 512) == 512 && this.outerType_ != kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.getDefaultInstance()) {
                    this.outerType_ = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.newBuilder(this.outerType_).mergeFrom(type).buildPartial();
                } else {
                    this.outerType_ = type;
                }
                this.bitField0_ |= 512;
                return this;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Builder setOuterTypeId(int i) {
                this.bitField0_ |= 1024;
                this.outerTypeId_ = i;
                return this;
            }

            public boolean hasAbbreviatedType() {
                return (this.bitField0_ & 2048) == 2048;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type getAbbreviatedType() {
                return this.abbreviatedType_;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Builder mergeAbbreviatedType(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type type) {
                if ((this.bitField0_ & 2048) == 2048 && this.abbreviatedType_ != kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.getDefaultInstance()) {
                    this.abbreviatedType_ = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.newBuilder(this.abbreviatedType_).mergeFrom(type).buildPartial();
                } else {
                    this.abbreviatedType_ = type;
                }
                this.bitField0_ |= 2048;
                return this;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Builder setAbbreviatedTypeId(int i) {
                this.bitField0_ |= 4096;
                this.abbreviatedTypeId_ = i;
                return this;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Builder setFlags(int i) {
                this.bitField0_ |= 8192;
                this.flags_ = i;
                return this;
            }
        }
    }

    public static final class TypeParameter extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter> implements kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameterOrBuilder {
        public static kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter> PARSER = new kotlin.reflect.jvm.internal.impl.protobuf.AbstractParser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter>() { // from class: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter.1
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter parsePartialFrom(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
                return new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter(codedInputStream, extensionRegistryLite);
            }
        };
        private static final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter defaultInstance;
        private int bitField0_;
        private int id_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private int name_;
        private boolean reified_;
        private final kotlin.reflect.jvm.internal.impl.protobuf.ByteString unknownFields;
        private int upperBoundIdMemoizedSerializedSize;
        private java.util.List<java.lang.Integer> upperBoundId_;
        private java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type> upperBound_;
        private kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter.Variance variance_;

        private TypeParameter(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter, ?> extendableBuilder) {
            super(extendableBuilder);
            this.upperBoundIdMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = extendableBuilder.getUnknownFields();
        }

        private TypeParameter(boolean z) {
            this.upperBoundIdMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = kotlin.reflect.jvm.internal.impl.protobuf.ByteString.EMPTY;
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter getDefaultInstance() {
            return defaultInstance;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter getDefaultInstanceForType() {
            return defaultInstance;
        }

        private TypeParameter(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
            this.upperBoundIdMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            initFields();
            kotlin.reflect.jvm.internal.impl.protobuf.ByteString.Output outputNewOutput = kotlin.reflect.jvm.internal.impl.protobuf.ByteString.newOutput();
            kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream codedOutputStreamNewInstance = kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.newInstance(outputNewOutput, 1);
            boolean z = false;
            int i = 0;
            while (!z) {
                try {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag == 8) {
                                    this.bitField0_ |= 1;
                                    this.id_ = codedInputStream.readInt32();
                                } else if (tag == 16) {
                                    this.bitField0_ |= 2;
                                    this.name_ = codedInputStream.readInt32();
                                } else if (tag == 24) {
                                    this.bitField0_ |= 4;
                                    this.reified_ = codedInputStream.readBool();
                                } else if (tag == 32) {
                                    int i2 = codedInputStream.readEnum();
                                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter.Variance varianceValueOf = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter.Variance.valueOf(i2);
                                    if (varianceValueOf == null) {
                                        codedOutputStreamNewInstance.writeRawVarint32(tag);
                                        codedOutputStreamNewInstance.writeRawVarint32(i2);
                                    } else {
                                        this.bitField0_ |= 8;
                                        this.variance_ = varianceValueOf;
                                    }
                                } else if (tag == 42) {
                                    if ((i & 16) != 16) {
                                        this.upperBound_ = new java.util.ArrayList();
                                        i |= 16;
                                    }
                                    this.upperBound_.add((kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type) codedInputStream.readMessage(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.PARSER, extensionRegistryLite));
                                } else if (tag == 48) {
                                    if ((i & 32) != 32) {
                                        this.upperBoundId_ = new java.util.ArrayList();
                                        i |= 32;
                                    }
                                    this.upperBoundId_.add(java.lang.Integer.valueOf(codedInputStream.readInt32()));
                                } else if (tag != 50) {
                                    if (!parseUnknownField(codedInputStream, codedOutputStreamNewInstance, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    int iPushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                    if ((i & 32) != 32 && codedInputStream.getBytesUntilLimit() > 0) {
                                        this.upperBoundId_ = new java.util.ArrayList();
                                        i |= 32;
                                    }
                                    while (codedInputStream.getBytesUntilLimit() > 0) {
                                        this.upperBoundId_.add(java.lang.Integer.valueOf(codedInputStream.readInt32()));
                                    }
                                    codedInputStream.popLimit(iPushLimit);
                                }
                            }
                            z = true;
                        } catch (java.io.IOException e) {
                            throw new kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException(e.getMessage()).setUnfinishedMessage(this);
                        }
                    } catch (kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException e2) {
                        throw e2.setUnfinishedMessage(this);
                    }
                } catch (java.lang.Throwable th) {
                    if ((i & 16) == 16) {
                        this.upperBound_ = java.util.Collections.unmodifiableList(this.upperBound_);
                    }
                    if ((i & 32) == 32) {
                        this.upperBoundId_ = java.util.Collections.unmodifiableList(this.upperBoundId_);
                    }
                    try {
                        codedOutputStreamNewInstance.flush();
                    } catch (java.io.IOException unused) {
                    } finally {
                        this.unknownFields = outputNewOutput.toByteString();
                    }
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            if ((i & 16) == 16) {
                this.upperBound_ = java.util.Collections.unmodifiableList(this.upperBound_);
            }
            if ((i & 32) == 32) {
                this.upperBoundId_ = java.util.Collections.unmodifiableList(this.upperBoundId_);
            }
            try {
                codedOutputStreamNewInstance.flush();
            } catch (java.io.IOException unused2) {
            } finally {
                this.unknownFields = outputNewOutput.toByteString();
            }
            makeExtensionsImmutable();
        }

        static {
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter typeParameter = new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter(true);
            defaultInstance = typeParameter;
            typeParameter.initFields();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter> getParserForType() {
            return PARSER;
        }

        public enum Variance implements kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite {
            IN(0, 0),
            OUT(1, 1),
            INV(2, 2);

            private static kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter.Variance> internalValueMap = new kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter.Variance>() { // from class: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter.Variance.1
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap
                public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter.Variance findValueByNumber(int i) {
                    return kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter.Variance.valueOf(i);
                }
            };
            private final int value;

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
            public final int getNumber() {
                return this.value;
            }

            public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter.Variance valueOf(int i) {
                if (i == 0) {
                    return IN;
                }
                if (i == 1) {
                    return OUT;
                }
                if (i != 2) {
                    return null;
                }
                return INV;
            }

            Variance(int i, int i2) {
                this.value = i2;
            }
        }

        public boolean hasId() {
            return (this.bitField0_ & 1) == 1;
        }

        public int getId() {
            return this.id_;
        }

        public boolean hasName() {
            return (this.bitField0_ & 2) == 2;
        }

        public int getName() {
            return this.name_;
        }

        public boolean hasReified() {
            return (this.bitField0_ & 4) == 4;
        }

        public boolean getReified() {
            return this.reified_;
        }

        public boolean hasVariance() {
            return (this.bitField0_ & 8) == 8;
        }

        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter.Variance getVariance() {
            return this.variance_;
        }

        public java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type> getUpperBoundList() {
            return this.upperBound_;
        }

        public int getUpperBoundCount() {
            return this.upperBound_.size();
        }

        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type getUpperBound(int i) {
            return this.upperBound_.get(i);
        }

        public java.util.List<java.lang.Integer> getUpperBoundIdList() {
            return this.upperBoundId_;
        }

        private void initFields() {
            this.id_ = 0;
            this.name_ = 0;
            this.reified_ = false;
            this.variance_ = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter.Variance.INV;
            this.upperBound_ = java.util.Collections.emptyList();
            this.upperBoundId_ = java.util.Collections.emptyList();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            if (!hasId()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasName()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            for (int i = 0; i < getUpperBoundCount(); i++) {
                if (!getUpperBound(i).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            if (!extensionsAreInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream codedOutputStream) throws java.io.IOException {
            getSerializedSize();
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage<MessageType>.ExtensionWriter extensionWriterNewExtensionWriter = newExtensionWriter();
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.writeInt32(1, this.id_);
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.writeInt32(2, this.name_);
            }
            if ((this.bitField0_ & 4) == 4) {
                codedOutputStream.writeBool(3, this.reified_);
            }
            if ((this.bitField0_ & 8) == 8) {
                codedOutputStream.writeEnum(4, this.variance_.getNumber());
            }
            for (int i = 0; i < this.upperBound_.size(); i++) {
                codedOutputStream.writeMessage(5, this.upperBound_.get(i));
            }
            if (getUpperBoundIdList().size() > 0) {
                codedOutputStream.writeRawVarint32(50);
                codedOutputStream.writeRawVarint32(this.upperBoundIdMemoizedSerializedSize);
            }
            for (int i2 = 0; i2 < this.upperBoundId_.size(); i2++) {
                codedOutputStream.writeInt32NoTag(this.upperBoundId_.get(i2).intValue());
            }
            extensionWriterNewExtensionWriter.writeUntil(1000, codedOutputStream);
            codedOutputStream.writeRawBytes(this.unknownFields);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iComputeInt32Size = (this.bitField0_ & 1) == 1 ? kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeInt32Size(1, this.id_) + 0 : 0;
            if ((this.bitField0_ & 2) == 2) {
                iComputeInt32Size += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeInt32Size(2, this.name_);
            }
            if ((this.bitField0_ & 4) == 4) {
                iComputeInt32Size += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeBoolSize(3, this.reified_);
            }
            if ((this.bitField0_ & 8) == 8) {
                iComputeInt32Size += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeEnumSize(4, this.variance_.getNumber());
            }
            for (int i2 = 0; i2 < this.upperBound_.size(); i2++) {
                iComputeInt32Size += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeMessageSize(5, this.upperBound_.get(i2));
            }
            int iComputeInt32SizeNoTag = 0;
            for (int i3 = 0; i3 < this.upperBoundId_.size(); i3++) {
                iComputeInt32SizeNoTag += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeInt32SizeNoTag(this.upperBoundId_.get(i3).intValue());
            }
            int iComputeInt32SizeNoTag2 = iComputeInt32Size + iComputeInt32SizeNoTag;
            if (!getUpperBoundIdList().isEmpty()) {
                iComputeInt32SizeNoTag2 = iComputeInt32SizeNoTag2 + 1 + kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeInt32SizeNoTag(iComputeInt32SizeNoTag);
            }
            this.upperBoundIdMemoizedSerializedSize = iComputeInt32SizeNoTag;
            int iExtensionsSerializedSize = iComputeInt32SizeNoTag2 + extensionsSerializedSize() + this.unknownFields.size();
            this.memoizedSerializedSize = iExtensionsSerializedSize;
            return iExtensionsSerializedSize;
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter.Builder newBuilder() {
            return kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter.Builder.create();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter.Builder newBuilderForType() {
            return newBuilder();
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter.Builder newBuilder(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter typeParameter) {
            return newBuilder().mergeFrom(typeParameter);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter.Builder toBuilder() {
            return newBuilder(this);
        }

        public static final class Builder extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter.Builder> implements kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameterOrBuilder {
            private int bitField0_;
            private int id_;
            private int name_;
            private boolean reified_;
            private kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter.Variance variance_ = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter.Variance.INV;
            private java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type> upperBound_ = java.util.Collections.emptyList();
            private java.util.List<java.lang.Integer> upperBoundId_ = java.util.Collections.emptyList();

            private void maybeForceBuilderInitialization() {
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter.Builder create() {
                return new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter.Builder();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter.Builder mo1266clone() {
                return create().mergeFrom(buildPartial());
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter getDefaultInstanceForType() {
                return kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter build() {
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter typeParameterBuildPartial = buildPartial();
                if (typeParameterBuildPartial.isInitialized()) {
                    return typeParameterBuildPartial;
                }
                throw newUninitializedMessageException(typeParameterBuildPartial);
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter buildPartial() {
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter typeParameter = new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter(this);
                int i = this.bitField0_;
                int i2 = (i & 1) != 1 ? 0 : 1;
                typeParameter.id_ = this.id_;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                typeParameter.name_ = this.name_;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                typeParameter.reified_ = this.reified_;
                if ((i & 8) == 8) {
                    i2 |= 8;
                }
                typeParameter.variance_ = this.variance_;
                if ((this.bitField0_ & 16) == 16) {
                    this.upperBound_ = java.util.Collections.unmodifiableList(this.upperBound_);
                    this.bitField0_ &= -17;
                }
                typeParameter.upperBound_ = this.upperBound_;
                if ((this.bitField0_ & 32) == 32) {
                    this.upperBoundId_ = java.util.Collections.unmodifiableList(this.upperBoundId_);
                    this.bitField0_ &= -33;
                }
                typeParameter.upperBoundId_ = this.upperBoundId_;
                typeParameter.bitField0_ = i2;
                return typeParameter;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter.Builder mergeFrom(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter typeParameter) {
                if (typeParameter == kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter.getDefaultInstance()) {
                    return this;
                }
                if (typeParameter.hasId()) {
                    setId(typeParameter.getId());
                }
                if (typeParameter.hasName()) {
                    setName(typeParameter.getName());
                }
                if (typeParameter.hasReified()) {
                    setReified(typeParameter.getReified());
                }
                if (typeParameter.hasVariance()) {
                    setVariance(typeParameter.getVariance());
                }
                if (!typeParameter.upperBound_.isEmpty()) {
                    if (this.upperBound_.isEmpty()) {
                        this.upperBound_ = typeParameter.upperBound_;
                        this.bitField0_ &= -17;
                    } else {
                        ensureUpperBoundIsMutable();
                        this.upperBound_.addAll(typeParameter.upperBound_);
                    }
                }
                if (!typeParameter.upperBoundId_.isEmpty()) {
                    if (this.upperBoundId_.isEmpty()) {
                        this.upperBoundId_ = typeParameter.upperBoundId_;
                        this.bitField0_ &= -33;
                    } else {
                        ensureUpperBoundIdIsMutable();
                        this.upperBoundId_.addAll(typeParameter.upperBoundId_);
                    }
                }
                mergeExtensionFields(typeParameter);
                setUnknownFields(getUnknownFields().concat(typeParameter.unknownFields));
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (!hasId() || !hasName()) {
                    return false;
                }
                for (int i = 0; i < getUpperBoundCount(); i++) {
                    if (!getUpperBound(i).isInitialized()) {
                        return false;
                    }
                }
                return extensionsAreInitialized();
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter.Builder mergeFrom(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.lang.Throwable {
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter typeParameter = null;
                try {
                    try {
                        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter partialFrom = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (partialFrom != null) {
                            mergeFrom(partialFrom);
                        }
                        return this;
                    } catch (kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException e) {
                        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter typeParameter2 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter) e.getUnfinishedMessage();
                        try {
                            throw e;
                        } catch (java.lang.Throwable th) {
                            th = th;
                            typeParameter = typeParameter2;
                            if (typeParameter != null) {
                                mergeFrom(typeParameter);
                            }
                            throw th;
                        }
                    }
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    if (typeParameter != null) {
                        mergeFrom(typeParameter);
                    }
                    throw th;
                }
            }

            public boolean hasId() {
                return (this.bitField0_ & 1) == 1;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter.Builder setId(int i) {
                this.bitField0_ |= 1;
                this.id_ = i;
                return this;
            }

            public boolean hasName() {
                return (this.bitField0_ & 2) == 2;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter.Builder setName(int i) {
                this.bitField0_ |= 2;
                this.name_ = i;
                return this;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter.Builder setReified(boolean z) {
                this.bitField0_ |= 4;
                this.reified_ = z;
                return this;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter.Builder setVariance(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter.Variance variance) {
                java.util.Objects.requireNonNull(variance);
                this.bitField0_ |= 8;
                this.variance_ = variance;
                return this;
            }

            private void ensureUpperBoundIsMutable() {
                if ((this.bitField0_ & 16) != 16) {
                    this.upperBound_ = new java.util.ArrayList(this.upperBound_);
                    this.bitField0_ |= 16;
                }
            }

            public int getUpperBoundCount() {
                return this.upperBound_.size();
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type getUpperBound(int i) {
                return this.upperBound_.get(i);
            }

            private void ensureUpperBoundIdIsMutable() {
                if ((this.bitField0_ & 32) != 32) {
                    this.upperBoundId_ = new java.util.ArrayList(this.upperBoundId_);
                    this.bitField0_ |= 32;
                }
            }
        }
    }

    public static final class Class extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class> implements kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ClassOrBuilder {
        public static kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class> PARSER = new kotlin.reflect.jvm.internal.impl.protobuf.AbstractParser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class>() { // from class: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.1
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class parsePartialFrom(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
                return new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class(codedInputStream, extensionRegistryLite);
            }
        };
        private static final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class defaultInstance;
        private int bitField0_;
        private int companionObjectName_;
        private java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor> constructor_;
        private java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry> enumEntry_;
        private int flags_;
        private int fqName_;
        private java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function> function_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private int nestedClassNameMemoizedSerializedSize;
        private java.util.List<java.lang.Integer> nestedClassName_;
        private java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property> property_;
        private int sealedSubclassFqNameMemoizedSerializedSize;
        private java.util.List<java.lang.Integer> sealedSubclassFqName_;
        private int supertypeIdMemoizedSerializedSize;
        private java.util.List<java.lang.Integer> supertypeId_;
        private java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type> supertype_;
        private java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias> typeAlias_;
        private java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter> typeParameter_;
        private kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable typeTable_;
        private final kotlin.reflect.jvm.internal.impl.protobuf.ByteString unknownFields;
        private kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable versionRequirementTable_;
        private java.util.List<java.lang.Integer> versionRequirement_;

        private Class(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class, ?> extendableBuilder) {
            super(extendableBuilder);
            this.supertypeIdMemoizedSerializedSize = -1;
            this.nestedClassNameMemoizedSerializedSize = -1;
            this.sealedSubclassFqNameMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = extendableBuilder.getUnknownFields();
        }

        private Class(boolean z) {
            this.supertypeIdMemoizedSerializedSize = -1;
            this.nestedClassNameMemoizedSerializedSize = -1;
            this.sealedSubclassFqNameMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = kotlin.reflect.jvm.internal.impl.protobuf.ByteString.EMPTY;
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class getDefaultInstance() {
            return defaultInstance;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class getDefaultInstanceForType() {
            return defaultInstance;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private Class(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
            this.supertypeIdMemoizedSerializedSize = -1;
            this.nestedClassNameMemoizedSerializedSize = -1;
            this.sealedSubclassFqNameMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            initFields();
            kotlin.reflect.jvm.internal.impl.protobuf.ByteString.Output outputNewOutput = kotlin.reflect.jvm.internal.impl.protobuf.ByteString.newOutput();
            kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream codedOutputStreamNewInstance = kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.newInstance(outputNewOutput, 1);
            boolean z = false;
            int i = 0;
            while (!z) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        switch (tag) {
                            case 0:
                                z = true;
                                break;
                            case 8:
                                this.bitField0_ |= 1;
                                this.flags_ = codedInputStream.readInt32();
                                break;
                            case 16:
                                if ((i & 32) != 32) {
                                    this.supertypeId_ = new java.util.ArrayList();
                                    i |= 32;
                                }
                                this.supertypeId_.add(java.lang.Integer.valueOf(codedInputStream.readInt32()));
                                break;
                            case 18:
                                int iPushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                if ((i & 32) != 32 && codedInputStream.getBytesUntilLimit() > 0) {
                                    this.supertypeId_ = new java.util.ArrayList();
                                    i |= 32;
                                }
                                while (codedInputStream.getBytesUntilLimit() > 0) {
                                    this.supertypeId_.add(java.lang.Integer.valueOf(codedInputStream.readInt32()));
                                }
                                codedInputStream.popLimit(iPushLimit);
                                break;
                            case 24:
                                this.bitField0_ |= 2;
                                this.fqName_ = codedInputStream.readInt32();
                                break;
                            case 32:
                                this.bitField0_ |= 4;
                                this.companionObjectName_ = codedInputStream.readInt32();
                                break;
                            case 42:
                                if ((i & 8) != 8) {
                                    this.typeParameter_ = new java.util.ArrayList();
                                    i |= 8;
                                }
                                this.typeParameter_.add((kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter) codedInputStream.readMessage(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter.PARSER, extensionRegistryLite));
                                break;
                            case 50:
                                if ((i & 16) != 16) {
                                    this.supertype_ = new java.util.ArrayList();
                                    i |= 16;
                                }
                                this.supertype_.add((kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type) codedInputStream.readMessage(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.PARSER, extensionRegistryLite));
                                break;
                            case 56:
                                if ((i & 64) != 64) {
                                    this.nestedClassName_ = new java.util.ArrayList();
                                    i |= 64;
                                }
                                this.nestedClassName_.add(java.lang.Integer.valueOf(codedInputStream.readInt32()));
                                break;
                            case 58:
                                int iPushLimit2 = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                if ((i & 64) != 64 && codedInputStream.getBytesUntilLimit() > 0) {
                                    this.nestedClassName_ = new java.util.ArrayList();
                                    i |= 64;
                                }
                                while (codedInputStream.getBytesUntilLimit() > 0) {
                                    this.nestedClassName_.add(java.lang.Integer.valueOf(codedInputStream.readInt32()));
                                }
                                codedInputStream.popLimit(iPushLimit2);
                                break;
                            case 66:
                                if ((i & 128) != 128) {
                                    this.constructor_ = new java.util.ArrayList();
                                    i |= 128;
                                }
                                this.constructor_.add((kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor) codedInputStream.readMessage(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor.PARSER, extensionRegistryLite));
                                break;
                            case 74:
                                if ((i & 256) != 256) {
                                    this.function_ = new java.util.ArrayList();
                                    i |= 256;
                                }
                                this.function_.add((kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function) codedInputStream.readMessage(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function.PARSER, extensionRegistryLite));
                                break;
                            case 82:
                                if ((i & 512) != 512) {
                                    this.property_ = new java.util.ArrayList();
                                    i |= 512;
                                }
                                this.property_.add((kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property) codedInputStream.readMessage(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property.PARSER, extensionRegistryLite));
                                break;
                            case 90:
                                if ((i & 1024) != 1024) {
                                    this.typeAlias_ = new java.util.ArrayList();
                                    i |= 1024;
                                }
                                this.typeAlias_.add((kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias) codedInputStream.readMessage(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias.PARSER, extensionRegistryLite));
                                break;
                            case 106:
                                if ((i & 2048) != 2048) {
                                    this.enumEntry_ = new java.util.ArrayList();
                                    i |= 2048;
                                }
                                this.enumEntry_.add((kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry) codedInputStream.readMessage(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry.PARSER, extensionRegistryLite));
                                break;
                            case 128:
                                if ((i & 4096) != 4096) {
                                    this.sealedSubclassFqName_ = new java.util.ArrayList();
                                    i |= 4096;
                                }
                                this.sealedSubclassFqName_.add(java.lang.Integer.valueOf(codedInputStream.readInt32()));
                                break;
                            case 130:
                                int iPushLimit3 = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                if ((i & 4096) != 4096 && codedInputStream.getBytesUntilLimit() > 0) {
                                    this.sealedSubclassFqName_ = new java.util.ArrayList();
                                    i |= 4096;
                                }
                                while (codedInputStream.getBytesUntilLimit() > 0) {
                                    this.sealedSubclassFqName_.add(java.lang.Integer.valueOf(codedInputStream.readInt32()));
                                }
                                codedInputStream.popLimit(iPushLimit3);
                                break;
                            case 242:
                                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable.Builder builder = (this.bitField0_ & 8) == 8 ? this.typeTable_.toBuilder() : null;
                                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable typeTable = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable) codedInputStream.readMessage(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable.PARSER, extensionRegistryLite);
                                this.typeTable_ = typeTable;
                                if (builder != 0) {
                                    builder.mergeFrom(typeTable);
                                    this.typeTable_ = builder.buildPartial();
                                }
                                this.bitField0_ |= 8;
                                break;
                            case 248:
                                if ((i & 16384) != 16384) {
                                    this.versionRequirement_ = new java.util.ArrayList();
                                    i |= 16384;
                                }
                                this.versionRequirement_.add(java.lang.Integer.valueOf(codedInputStream.readInt32()));
                                break;
                            case 250:
                                int iPushLimit4 = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                if ((i & 16384) != 16384 && codedInputStream.getBytesUntilLimit() > 0) {
                                    this.versionRequirement_ = new java.util.ArrayList();
                                    i |= 16384;
                                }
                                while (codedInputStream.getBytesUntilLimit() > 0) {
                                    this.versionRequirement_.add(java.lang.Integer.valueOf(codedInputStream.readInt32()));
                                }
                                codedInputStream.popLimit(iPushLimit4);
                                break;
                            case 258:
                                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable.Builder builder2 = (this.bitField0_ & 16) == 16 ? this.versionRequirementTable_.toBuilder() : null;
                                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable versionRequirementTable = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable) codedInputStream.readMessage(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable.PARSER, extensionRegistryLite);
                                this.versionRequirementTable_ = versionRequirementTable;
                                if (builder2 != 0) {
                                    builder2.mergeFrom(versionRequirementTable);
                                    this.versionRequirementTable_ = builder2.buildPartial();
                                }
                                this.bitField0_ |= 16;
                                break;
                            default:
                                if (!parseUnknownField(codedInputStream, codedOutputStreamNewInstance, extensionRegistryLite, tag)) {
                                    z = true;
                                }
                                break;
                        }
                    } catch (kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException e) {
                        throw e.setUnfinishedMessage(this);
                    } catch (java.io.IOException e2) {
                        throw new kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                    }
                } catch (java.lang.Throwable th) {
                    if ((i & 32) == 32) {
                        this.supertypeId_ = java.util.Collections.unmodifiableList(this.supertypeId_);
                    }
                    if ((i & 8) == 8) {
                        this.typeParameter_ = java.util.Collections.unmodifiableList(this.typeParameter_);
                    }
                    if ((i & 16) == 16) {
                        this.supertype_ = java.util.Collections.unmodifiableList(this.supertype_);
                    }
                    if ((i & 64) == 64) {
                        this.nestedClassName_ = java.util.Collections.unmodifiableList(this.nestedClassName_);
                    }
                    if ((i & 128) == 128) {
                        this.constructor_ = java.util.Collections.unmodifiableList(this.constructor_);
                    }
                    if ((i & 256) == 256) {
                        this.function_ = java.util.Collections.unmodifiableList(this.function_);
                    }
                    if ((i & 512) == 512) {
                        this.property_ = java.util.Collections.unmodifiableList(this.property_);
                    }
                    if ((i & 1024) == 1024) {
                        this.typeAlias_ = java.util.Collections.unmodifiableList(this.typeAlias_);
                    }
                    if ((i & 2048) == 2048) {
                        this.enumEntry_ = java.util.Collections.unmodifiableList(this.enumEntry_);
                    }
                    if ((i & 4096) == 4096) {
                        this.sealedSubclassFqName_ = java.util.Collections.unmodifiableList(this.sealedSubclassFqName_);
                    }
                    if ((i & 16384) == 16384) {
                        this.versionRequirement_ = java.util.Collections.unmodifiableList(this.versionRequirement_);
                    }
                    try {
                        codedOutputStreamNewInstance.flush();
                    } catch (java.io.IOException unused) {
                    } finally {
                        this.unknownFields = outputNewOutput.toByteString();
                    }
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            if ((i & 32) == 32) {
                this.supertypeId_ = java.util.Collections.unmodifiableList(this.supertypeId_);
            }
            if ((i & 8) == 8) {
                this.typeParameter_ = java.util.Collections.unmodifiableList(this.typeParameter_);
            }
            if ((i & 16) == 16) {
                this.supertype_ = java.util.Collections.unmodifiableList(this.supertype_);
            }
            if ((i & 64) == 64) {
                this.nestedClassName_ = java.util.Collections.unmodifiableList(this.nestedClassName_);
            }
            if ((i & 128) == 128) {
                this.constructor_ = java.util.Collections.unmodifiableList(this.constructor_);
            }
            if ((i & 256) == 256) {
                this.function_ = java.util.Collections.unmodifiableList(this.function_);
            }
            if ((i & 512) == 512) {
                this.property_ = java.util.Collections.unmodifiableList(this.property_);
            }
            if ((i & 1024) == 1024) {
                this.typeAlias_ = java.util.Collections.unmodifiableList(this.typeAlias_);
            }
            if ((i & 2048) == 2048) {
                this.enumEntry_ = java.util.Collections.unmodifiableList(this.enumEntry_);
            }
            if ((i & 4096) == 4096) {
                this.sealedSubclassFqName_ = java.util.Collections.unmodifiableList(this.sealedSubclassFqName_);
            }
            if ((i & 16384) == 16384) {
                this.versionRequirement_ = java.util.Collections.unmodifiableList(this.versionRequirement_);
            }
            try {
                codedOutputStreamNewInstance.flush();
            } catch (java.io.IOException unused2) {
            } finally {
                this.unknownFields = outputNewOutput.toByteString();
            }
            makeExtensionsImmutable();
        }

        static {
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class r0 = new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class(true);
            defaultInstance = r0;
            r0.initFields();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class> getParserForType() {
            return PARSER;
        }

        public enum Kind implements kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite {
            CLASS(0, 0),
            INTERFACE(1, 1),
            ENUM_CLASS(2, 2),
            ENUM_ENTRY(3, 3),
            ANNOTATION_CLASS(4, 4),
            OBJECT(5, 5),
            COMPANION_OBJECT(6, 6);

            private static kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.Kind> internalValueMap = new kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.Kind>() { // from class: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.Kind.1
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap
                public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.Kind findValueByNumber(int i) {
                    return kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.Kind.valueOf(i);
                }
            };
            private final int value;

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
            public final int getNumber() {
                return this.value;
            }

            public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.Kind valueOf(int i) {
                switch (i) {
                    case 0:
                        return CLASS;
                    case 1:
                        return INTERFACE;
                    case 2:
                        return ENUM_CLASS;
                    case 3:
                        return ENUM_ENTRY;
                    case 4:
                        return ANNOTATION_CLASS;
                    case 5:
                        return OBJECT;
                    case 6:
                        return COMPANION_OBJECT;
                    default:
                        return null;
                }
            }

            Kind(int i, int i2) {
                this.value = i2;
            }
        }

        public boolean hasFlags() {
            return (this.bitField0_ & 1) == 1;
        }

        public int getFlags() {
            return this.flags_;
        }

        public boolean hasFqName() {
            return (this.bitField0_ & 2) == 2;
        }

        public int getFqName() {
            return this.fqName_;
        }

        public boolean hasCompanionObjectName() {
            return (this.bitField0_ & 4) == 4;
        }

        public int getCompanionObjectName() {
            return this.companionObjectName_;
        }

        public java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter> getTypeParameterList() {
            return this.typeParameter_;
        }

        public int getTypeParameterCount() {
            return this.typeParameter_.size();
        }

        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter getTypeParameter(int i) {
            return this.typeParameter_.get(i);
        }

        public java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type> getSupertypeList() {
            return this.supertype_;
        }

        public int getSupertypeCount() {
            return this.supertype_.size();
        }

        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type getSupertype(int i) {
            return this.supertype_.get(i);
        }

        public java.util.List<java.lang.Integer> getSupertypeIdList() {
            return this.supertypeId_;
        }

        public java.util.List<java.lang.Integer> getNestedClassNameList() {
            return this.nestedClassName_;
        }

        public java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor> getConstructorList() {
            return this.constructor_;
        }

        public int getConstructorCount() {
            return this.constructor_.size();
        }

        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor getConstructor(int i) {
            return this.constructor_.get(i);
        }

        public java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function> getFunctionList() {
            return this.function_;
        }

        public int getFunctionCount() {
            return this.function_.size();
        }

        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function getFunction(int i) {
            return this.function_.get(i);
        }

        public java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property> getPropertyList() {
            return this.property_;
        }

        public int getPropertyCount() {
            return this.property_.size();
        }

        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property getProperty(int i) {
            return this.property_.get(i);
        }

        public java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias> getTypeAliasList() {
            return this.typeAlias_;
        }

        public int getTypeAliasCount() {
            return this.typeAlias_.size();
        }

        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias getTypeAlias(int i) {
            return this.typeAlias_.get(i);
        }

        public java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry> getEnumEntryList() {
            return this.enumEntry_;
        }

        public int getEnumEntryCount() {
            return this.enumEntry_.size();
        }

        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry getEnumEntry(int i) {
            return this.enumEntry_.get(i);
        }

        public java.util.List<java.lang.Integer> getSealedSubclassFqNameList() {
            return this.sealedSubclassFqName_;
        }

        public boolean hasTypeTable() {
            return (this.bitField0_ & 8) == 8;
        }

        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable getTypeTable() {
            return this.typeTable_;
        }

        public java.util.List<java.lang.Integer> getVersionRequirementList() {
            return this.versionRequirement_;
        }

        public boolean hasVersionRequirementTable() {
            return (this.bitField0_ & 16) == 16;
        }

        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable getVersionRequirementTable() {
            return this.versionRequirementTable_;
        }

        private void initFields() {
            this.flags_ = 6;
            this.fqName_ = 0;
            this.companionObjectName_ = 0;
            this.typeParameter_ = java.util.Collections.emptyList();
            this.supertype_ = java.util.Collections.emptyList();
            this.supertypeId_ = java.util.Collections.emptyList();
            this.nestedClassName_ = java.util.Collections.emptyList();
            this.constructor_ = java.util.Collections.emptyList();
            this.function_ = java.util.Collections.emptyList();
            this.property_ = java.util.Collections.emptyList();
            this.typeAlias_ = java.util.Collections.emptyList();
            this.enumEntry_ = java.util.Collections.emptyList();
            this.sealedSubclassFqName_ = java.util.Collections.emptyList();
            this.typeTable_ = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable.getDefaultInstance();
            this.versionRequirement_ = java.util.Collections.emptyList();
            this.versionRequirementTable_ = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable.getDefaultInstance();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            if (!hasFqName()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            for (int i = 0; i < getTypeParameterCount(); i++) {
                if (!getTypeParameter(i).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            for (int i2 = 0; i2 < getSupertypeCount(); i2++) {
                if (!getSupertype(i2).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            for (int i3 = 0; i3 < getConstructorCount(); i3++) {
                if (!getConstructor(i3).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            for (int i4 = 0; i4 < getFunctionCount(); i4++) {
                if (!getFunction(i4).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            for (int i5 = 0; i5 < getPropertyCount(); i5++) {
                if (!getProperty(i5).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            for (int i6 = 0; i6 < getTypeAliasCount(); i6++) {
                if (!getTypeAlias(i6).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            for (int i7 = 0; i7 < getEnumEntryCount(); i7++) {
                if (!getEnumEntry(i7).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            if (hasTypeTable() && !getTypeTable().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!extensionsAreInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream codedOutputStream) throws java.io.IOException {
            getSerializedSize();
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage<MessageType>.ExtensionWriter extensionWriterNewExtensionWriter = newExtensionWriter();
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.writeInt32(1, this.flags_);
            }
            if (getSupertypeIdList().size() > 0) {
                codedOutputStream.writeRawVarint32(18);
                codedOutputStream.writeRawVarint32(this.supertypeIdMemoizedSerializedSize);
            }
            for (int i = 0; i < this.supertypeId_.size(); i++) {
                codedOutputStream.writeInt32NoTag(this.supertypeId_.get(i).intValue());
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.writeInt32(3, this.fqName_);
            }
            if ((this.bitField0_ & 4) == 4) {
                codedOutputStream.writeInt32(4, this.companionObjectName_);
            }
            for (int i2 = 0; i2 < this.typeParameter_.size(); i2++) {
                codedOutputStream.writeMessage(5, this.typeParameter_.get(i2));
            }
            for (int i3 = 0; i3 < this.supertype_.size(); i3++) {
                codedOutputStream.writeMessage(6, this.supertype_.get(i3));
            }
            if (getNestedClassNameList().size() > 0) {
                codedOutputStream.writeRawVarint32(58);
                codedOutputStream.writeRawVarint32(this.nestedClassNameMemoizedSerializedSize);
            }
            for (int i4 = 0; i4 < this.nestedClassName_.size(); i4++) {
                codedOutputStream.writeInt32NoTag(this.nestedClassName_.get(i4).intValue());
            }
            for (int i5 = 0; i5 < this.constructor_.size(); i5++) {
                codedOutputStream.writeMessage(8, this.constructor_.get(i5));
            }
            for (int i6 = 0; i6 < this.function_.size(); i6++) {
                codedOutputStream.writeMessage(9, this.function_.get(i6));
            }
            for (int i7 = 0; i7 < this.property_.size(); i7++) {
                codedOutputStream.writeMessage(10, this.property_.get(i7));
            }
            for (int i8 = 0; i8 < this.typeAlias_.size(); i8++) {
                codedOutputStream.writeMessage(11, this.typeAlias_.get(i8));
            }
            for (int i9 = 0; i9 < this.enumEntry_.size(); i9++) {
                codedOutputStream.writeMessage(13, this.enumEntry_.get(i9));
            }
            if (getSealedSubclassFqNameList().size() > 0) {
                codedOutputStream.writeRawVarint32(130);
                codedOutputStream.writeRawVarint32(this.sealedSubclassFqNameMemoizedSerializedSize);
            }
            for (int i10 = 0; i10 < this.sealedSubclassFqName_.size(); i10++) {
                codedOutputStream.writeInt32NoTag(this.sealedSubclassFqName_.get(i10).intValue());
            }
            if ((this.bitField0_ & 8) == 8) {
                codedOutputStream.writeMessage(30, this.typeTable_);
            }
            for (int i11 = 0; i11 < this.versionRequirement_.size(); i11++) {
                codedOutputStream.writeInt32(31, this.versionRequirement_.get(i11).intValue());
            }
            if ((this.bitField0_ & 16) == 16) {
                codedOutputStream.writeMessage(32, this.versionRequirementTable_);
            }
            extensionWriterNewExtensionWriter.writeUntil(19000, codedOutputStream);
            codedOutputStream.writeRawBytes(this.unknownFields);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iComputeInt32Size = (this.bitField0_ & 1) == 1 ? kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeInt32Size(1, this.flags_) + 0 : 0;
            int iComputeInt32SizeNoTag = 0;
            for (int i2 = 0; i2 < this.supertypeId_.size(); i2++) {
                iComputeInt32SizeNoTag += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeInt32SizeNoTag(this.supertypeId_.get(i2).intValue());
            }
            int iComputeMessageSize = iComputeInt32Size + iComputeInt32SizeNoTag;
            if (!getSupertypeIdList().isEmpty()) {
                iComputeMessageSize = iComputeMessageSize + 1 + kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeInt32SizeNoTag(iComputeInt32SizeNoTag);
            }
            this.supertypeIdMemoizedSerializedSize = iComputeInt32SizeNoTag;
            if ((this.bitField0_ & 2) == 2) {
                iComputeMessageSize += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeInt32Size(3, this.fqName_);
            }
            if ((this.bitField0_ & 4) == 4) {
                iComputeMessageSize += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeInt32Size(4, this.companionObjectName_);
            }
            for (int i3 = 0; i3 < this.typeParameter_.size(); i3++) {
                iComputeMessageSize += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeMessageSize(5, this.typeParameter_.get(i3));
            }
            for (int i4 = 0; i4 < this.supertype_.size(); i4++) {
                iComputeMessageSize += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeMessageSize(6, this.supertype_.get(i4));
            }
            int iComputeInt32SizeNoTag2 = 0;
            for (int i5 = 0; i5 < this.nestedClassName_.size(); i5++) {
                iComputeInt32SizeNoTag2 += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeInt32SizeNoTag(this.nestedClassName_.get(i5).intValue());
            }
            int iComputeMessageSize2 = iComputeMessageSize + iComputeInt32SizeNoTag2;
            if (!getNestedClassNameList().isEmpty()) {
                iComputeMessageSize2 = iComputeMessageSize2 + 1 + kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeInt32SizeNoTag(iComputeInt32SizeNoTag2);
            }
            this.nestedClassNameMemoizedSerializedSize = iComputeInt32SizeNoTag2;
            for (int i6 = 0; i6 < this.constructor_.size(); i6++) {
                iComputeMessageSize2 += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeMessageSize(8, this.constructor_.get(i6));
            }
            for (int i7 = 0; i7 < this.function_.size(); i7++) {
                iComputeMessageSize2 += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeMessageSize(9, this.function_.get(i7));
            }
            for (int i8 = 0; i8 < this.property_.size(); i8++) {
                iComputeMessageSize2 += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeMessageSize(10, this.property_.get(i8));
            }
            for (int i9 = 0; i9 < this.typeAlias_.size(); i9++) {
                iComputeMessageSize2 += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeMessageSize(11, this.typeAlias_.get(i9));
            }
            for (int i10 = 0; i10 < this.enumEntry_.size(); i10++) {
                iComputeMessageSize2 += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeMessageSize(13, this.enumEntry_.get(i10));
            }
            int iComputeInt32SizeNoTag3 = 0;
            for (int i11 = 0; i11 < this.sealedSubclassFqName_.size(); i11++) {
                iComputeInt32SizeNoTag3 += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeInt32SizeNoTag(this.sealedSubclassFqName_.get(i11).intValue());
            }
            int iComputeMessageSize3 = iComputeMessageSize2 + iComputeInt32SizeNoTag3;
            if (!getSealedSubclassFqNameList().isEmpty()) {
                iComputeMessageSize3 = iComputeMessageSize3 + 2 + kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeInt32SizeNoTag(iComputeInt32SizeNoTag3);
            }
            this.sealedSubclassFqNameMemoizedSerializedSize = iComputeInt32SizeNoTag3;
            if ((this.bitField0_ & 8) == 8) {
                iComputeMessageSize3 += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeMessageSize(30, this.typeTable_);
            }
            int iComputeInt32SizeNoTag4 = 0;
            for (int i12 = 0; i12 < this.versionRequirement_.size(); i12++) {
                iComputeInt32SizeNoTag4 += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeInt32SizeNoTag(this.versionRequirement_.get(i12).intValue());
            }
            int size = iComputeMessageSize3 + iComputeInt32SizeNoTag4 + (getVersionRequirementList().size() * 2);
            if ((this.bitField0_ & 16) == 16) {
                size += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeMessageSize(32, this.versionRequirementTable_);
            }
            int iExtensionsSerializedSize = size + extensionsSerializedSize() + this.unknownFields.size();
            this.memoizedSerializedSize = iExtensionsSerializedSize;
            return iExtensionsSerializedSize;
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class parseFrom(java.io.InputStream inputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.Builder newBuilder() {
            return kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.Builder.create();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.Builder newBuilderForType() {
            return newBuilder();
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.Builder newBuilder(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class r1) {
            return newBuilder().mergeFrom(r1);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.Builder toBuilder() {
            return newBuilder(this);
        }

        public static final class Builder extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.Builder> implements kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ClassOrBuilder {
            private int bitField0_;
            private int companionObjectName_;
            private int fqName_;
            private int flags_ = 6;
            private java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter> typeParameter_ = java.util.Collections.emptyList();
            private java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type> supertype_ = java.util.Collections.emptyList();
            private java.util.List<java.lang.Integer> supertypeId_ = java.util.Collections.emptyList();
            private java.util.List<java.lang.Integer> nestedClassName_ = java.util.Collections.emptyList();
            private java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor> constructor_ = java.util.Collections.emptyList();
            private java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function> function_ = java.util.Collections.emptyList();
            private java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property> property_ = java.util.Collections.emptyList();
            private java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias> typeAlias_ = java.util.Collections.emptyList();
            private java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry> enumEntry_ = java.util.Collections.emptyList();
            private java.util.List<java.lang.Integer> sealedSubclassFqName_ = java.util.Collections.emptyList();
            private kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable typeTable_ = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable.getDefaultInstance();
            private java.util.List<java.lang.Integer> versionRequirement_ = java.util.Collections.emptyList();
            private kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable versionRequirementTable_ = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable.getDefaultInstance();

            private void maybeForceBuilderInitialization() {
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.Builder create() {
                return new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.Builder();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.Builder mo1266clone() {
                return create().mergeFrom(buildPartial());
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class getDefaultInstanceForType() {
                return kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class build() {
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class classBuildPartial = buildPartial();
                if (classBuildPartial.isInitialized()) {
                    return classBuildPartial;
                }
                throw newUninitializedMessageException(classBuildPartial);
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class buildPartial() {
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class r0 = new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class(this);
                int i = this.bitField0_;
                int i2 = (i & 1) != 1 ? 0 : 1;
                r0.flags_ = this.flags_;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                r0.fqName_ = this.fqName_;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                r0.companionObjectName_ = this.companionObjectName_;
                if ((this.bitField0_ & 8) == 8) {
                    this.typeParameter_ = java.util.Collections.unmodifiableList(this.typeParameter_);
                    this.bitField0_ &= -9;
                }
                r0.typeParameter_ = this.typeParameter_;
                if ((this.bitField0_ & 16) == 16) {
                    this.supertype_ = java.util.Collections.unmodifiableList(this.supertype_);
                    this.bitField0_ &= -17;
                }
                r0.supertype_ = this.supertype_;
                if ((this.bitField0_ & 32) == 32) {
                    this.supertypeId_ = java.util.Collections.unmodifiableList(this.supertypeId_);
                    this.bitField0_ &= -33;
                }
                r0.supertypeId_ = this.supertypeId_;
                if ((this.bitField0_ & 64) == 64) {
                    this.nestedClassName_ = java.util.Collections.unmodifiableList(this.nestedClassName_);
                    this.bitField0_ &= -65;
                }
                r0.nestedClassName_ = this.nestedClassName_;
                if ((this.bitField0_ & 128) == 128) {
                    this.constructor_ = java.util.Collections.unmodifiableList(this.constructor_);
                    this.bitField0_ &= -129;
                }
                r0.constructor_ = this.constructor_;
                if ((this.bitField0_ & 256) == 256) {
                    this.function_ = java.util.Collections.unmodifiableList(this.function_);
                    this.bitField0_ &= -257;
                }
                r0.function_ = this.function_;
                if ((this.bitField0_ & 512) == 512) {
                    this.property_ = java.util.Collections.unmodifiableList(this.property_);
                    this.bitField0_ &= -513;
                }
                r0.property_ = this.property_;
                if ((this.bitField0_ & 1024) == 1024) {
                    this.typeAlias_ = java.util.Collections.unmodifiableList(this.typeAlias_);
                    this.bitField0_ &= -1025;
                }
                r0.typeAlias_ = this.typeAlias_;
                if ((this.bitField0_ & 2048) == 2048) {
                    this.enumEntry_ = java.util.Collections.unmodifiableList(this.enumEntry_);
                    this.bitField0_ &= -2049;
                }
                r0.enumEntry_ = this.enumEntry_;
                if ((this.bitField0_ & 4096) == 4096) {
                    this.sealedSubclassFqName_ = java.util.Collections.unmodifiableList(this.sealedSubclassFqName_);
                    this.bitField0_ &= -4097;
                }
                r0.sealedSubclassFqName_ = this.sealedSubclassFqName_;
                if ((i & 8192) == 8192) {
                    i2 |= 8;
                }
                r0.typeTable_ = this.typeTable_;
                if ((this.bitField0_ & 16384) == 16384) {
                    this.versionRequirement_ = java.util.Collections.unmodifiableList(this.versionRequirement_);
                    this.bitField0_ &= -16385;
                }
                r0.versionRequirement_ = this.versionRequirement_;
                if ((i & 32768) == 32768) {
                    i2 |= 16;
                }
                r0.versionRequirementTable_ = this.versionRequirementTable_;
                r0.bitField0_ = i2;
                return r0;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.Builder mergeFrom(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class r3) {
                if (r3 == kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.getDefaultInstance()) {
                    return this;
                }
                if (r3.hasFlags()) {
                    setFlags(r3.getFlags());
                }
                if (r3.hasFqName()) {
                    setFqName(r3.getFqName());
                }
                if (r3.hasCompanionObjectName()) {
                    setCompanionObjectName(r3.getCompanionObjectName());
                }
                if (!r3.typeParameter_.isEmpty()) {
                    if (this.typeParameter_.isEmpty()) {
                        this.typeParameter_ = r3.typeParameter_;
                        this.bitField0_ &= -9;
                    } else {
                        ensureTypeParameterIsMutable();
                        this.typeParameter_.addAll(r3.typeParameter_);
                    }
                }
                if (!r3.supertype_.isEmpty()) {
                    if (this.supertype_.isEmpty()) {
                        this.supertype_ = r3.supertype_;
                        this.bitField0_ &= -17;
                    } else {
                        ensureSupertypeIsMutable();
                        this.supertype_.addAll(r3.supertype_);
                    }
                }
                if (!r3.supertypeId_.isEmpty()) {
                    if (this.supertypeId_.isEmpty()) {
                        this.supertypeId_ = r3.supertypeId_;
                        this.bitField0_ &= -33;
                    } else {
                        ensureSupertypeIdIsMutable();
                        this.supertypeId_.addAll(r3.supertypeId_);
                    }
                }
                if (!r3.nestedClassName_.isEmpty()) {
                    if (this.nestedClassName_.isEmpty()) {
                        this.nestedClassName_ = r3.nestedClassName_;
                        this.bitField0_ &= -65;
                    } else {
                        ensureNestedClassNameIsMutable();
                        this.nestedClassName_.addAll(r3.nestedClassName_);
                    }
                }
                if (!r3.constructor_.isEmpty()) {
                    if (this.constructor_.isEmpty()) {
                        this.constructor_ = r3.constructor_;
                        this.bitField0_ &= -129;
                    } else {
                        ensureConstructorIsMutable();
                        this.constructor_.addAll(r3.constructor_);
                    }
                }
                if (!r3.function_.isEmpty()) {
                    if (this.function_.isEmpty()) {
                        this.function_ = r3.function_;
                        this.bitField0_ &= -257;
                    } else {
                        ensureFunctionIsMutable();
                        this.function_.addAll(r3.function_);
                    }
                }
                if (!r3.property_.isEmpty()) {
                    if (this.property_.isEmpty()) {
                        this.property_ = r3.property_;
                        this.bitField0_ &= -513;
                    } else {
                        ensurePropertyIsMutable();
                        this.property_.addAll(r3.property_);
                    }
                }
                if (!r3.typeAlias_.isEmpty()) {
                    if (this.typeAlias_.isEmpty()) {
                        this.typeAlias_ = r3.typeAlias_;
                        this.bitField0_ &= -1025;
                    } else {
                        ensureTypeAliasIsMutable();
                        this.typeAlias_.addAll(r3.typeAlias_);
                    }
                }
                if (!r3.enumEntry_.isEmpty()) {
                    if (this.enumEntry_.isEmpty()) {
                        this.enumEntry_ = r3.enumEntry_;
                        this.bitField0_ &= -2049;
                    } else {
                        ensureEnumEntryIsMutable();
                        this.enumEntry_.addAll(r3.enumEntry_);
                    }
                }
                if (!r3.sealedSubclassFqName_.isEmpty()) {
                    if (this.sealedSubclassFqName_.isEmpty()) {
                        this.sealedSubclassFqName_ = r3.sealedSubclassFqName_;
                        this.bitField0_ &= -4097;
                    } else {
                        ensureSealedSubclassFqNameIsMutable();
                        this.sealedSubclassFqName_.addAll(r3.sealedSubclassFqName_);
                    }
                }
                if (r3.hasTypeTable()) {
                    mergeTypeTable(r3.getTypeTable());
                }
                if (!r3.versionRequirement_.isEmpty()) {
                    if (this.versionRequirement_.isEmpty()) {
                        this.versionRequirement_ = r3.versionRequirement_;
                        this.bitField0_ &= -16385;
                    } else {
                        ensureVersionRequirementIsMutable();
                        this.versionRequirement_.addAll(r3.versionRequirement_);
                    }
                }
                if (r3.hasVersionRequirementTable()) {
                    mergeVersionRequirementTable(r3.getVersionRequirementTable());
                }
                mergeExtensionFields(r3);
                setUnknownFields(getUnknownFields().concat(r3.unknownFields));
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (!hasFqName()) {
                    return false;
                }
                for (int i = 0; i < getTypeParameterCount(); i++) {
                    if (!getTypeParameter(i).isInitialized()) {
                        return false;
                    }
                }
                for (int i2 = 0; i2 < getSupertypeCount(); i2++) {
                    if (!getSupertype(i2).isInitialized()) {
                        return false;
                    }
                }
                for (int i3 = 0; i3 < getConstructorCount(); i3++) {
                    if (!getConstructor(i3).isInitialized()) {
                        return false;
                    }
                }
                for (int i4 = 0; i4 < getFunctionCount(); i4++) {
                    if (!getFunction(i4).isInitialized()) {
                        return false;
                    }
                }
                for (int i5 = 0; i5 < getPropertyCount(); i5++) {
                    if (!getProperty(i5).isInitialized()) {
                        return false;
                    }
                }
                for (int i6 = 0; i6 < getTypeAliasCount(); i6++) {
                    if (!getTypeAlias(i6).isInitialized()) {
                        return false;
                    }
                }
                for (int i7 = 0; i7 < getEnumEntryCount(); i7++) {
                    if (!getEnumEntry(i7).isInitialized()) {
                        return false;
                    }
                }
                return (!hasTypeTable() || getTypeTable().isInitialized()) && extensionsAreInitialized();
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.Builder mergeFrom(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.lang.Throwable {
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class r0 = null;
                try {
                    try {
                        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class partialFrom = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (partialFrom != null) {
                            mergeFrom(partialFrom);
                        }
                        return this;
                    } catch (kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException e) {
                        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class) e.getUnfinishedMessage();
                        try {
                            throw e;
                        } catch (java.lang.Throwable th) {
                            th = th;
                            r0 = r4;
                            if (r0 != null) {
                                mergeFrom(r0);
                            }
                            throw th;
                        }
                    }
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    if (r0 != null) {
                        mergeFrom(r0);
                    }
                    throw th;
                }
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.Builder setFlags(int i) {
                this.bitField0_ |= 1;
                this.flags_ = i;
                return this;
            }

            public boolean hasFqName() {
                return (this.bitField0_ & 2) == 2;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.Builder setFqName(int i) {
                this.bitField0_ |= 2;
                this.fqName_ = i;
                return this;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.Builder setCompanionObjectName(int i) {
                this.bitField0_ |= 4;
                this.companionObjectName_ = i;
                return this;
            }

            private void ensureTypeParameterIsMutable() {
                if ((this.bitField0_ & 8) != 8) {
                    this.typeParameter_ = new java.util.ArrayList(this.typeParameter_);
                    this.bitField0_ |= 8;
                }
            }

            public int getTypeParameterCount() {
                return this.typeParameter_.size();
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter getTypeParameter(int i) {
                return this.typeParameter_.get(i);
            }

            private void ensureSupertypeIsMutable() {
                if ((this.bitField0_ & 16) != 16) {
                    this.supertype_ = new java.util.ArrayList(this.supertype_);
                    this.bitField0_ |= 16;
                }
            }

            public int getSupertypeCount() {
                return this.supertype_.size();
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type getSupertype(int i) {
                return this.supertype_.get(i);
            }

            private void ensureSupertypeIdIsMutable() {
                if ((this.bitField0_ & 32) != 32) {
                    this.supertypeId_ = new java.util.ArrayList(this.supertypeId_);
                    this.bitField0_ |= 32;
                }
            }

            private void ensureNestedClassNameIsMutable() {
                if ((this.bitField0_ & 64) != 64) {
                    this.nestedClassName_ = new java.util.ArrayList(this.nestedClassName_);
                    this.bitField0_ |= 64;
                }
            }

            private void ensureConstructorIsMutable() {
                if ((this.bitField0_ & 128) != 128) {
                    this.constructor_ = new java.util.ArrayList(this.constructor_);
                    this.bitField0_ |= 128;
                }
            }

            public int getConstructorCount() {
                return this.constructor_.size();
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor getConstructor(int i) {
                return this.constructor_.get(i);
            }

            private void ensureFunctionIsMutable() {
                if ((this.bitField0_ & 256) != 256) {
                    this.function_ = new java.util.ArrayList(this.function_);
                    this.bitField0_ |= 256;
                }
            }

            public int getFunctionCount() {
                return this.function_.size();
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function getFunction(int i) {
                return this.function_.get(i);
            }

            private void ensurePropertyIsMutable() {
                if ((this.bitField0_ & 512) != 512) {
                    this.property_ = new java.util.ArrayList(this.property_);
                    this.bitField0_ |= 512;
                }
            }

            public int getPropertyCount() {
                return this.property_.size();
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property getProperty(int i) {
                return this.property_.get(i);
            }

            private void ensureTypeAliasIsMutable() {
                if ((this.bitField0_ & 1024) != 1024) {
                    this.typeAlias_ = new java.util.ArrayList(this.typeAlias_);
                    this.bitField0_ |= 1024;
                }
            }

            public int getTypeAliasCount() {
                return this.typeAlias_.size();
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias getTypeAlias(int i) {
                return this.typeAlias_.get(i);
            }

            private void ensureEnumEntryIsMutable() {
                if ((this.bitField0_ & 2048) != 2048) {
                    this.enumEntry_ = new java.util.ArrayList(this.enumEntry_);
                    this.bitField0_ |= 2048;
                }
            }

            public int getEnumEntryCount() {
                return this.enumEntry_.size();
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry getEnumEntry(int i) {
                return this.enumEntry_.get(i);
            }

            private void ensureSealedSubclassFqNameIsMutable() {
                if ((this.bitField0_ & 4096) != 4096) {
                    this.sealedSubclassFqName_ = new java.util.ArrayList(this.sealedSubclassFqName_);
                    this.bitField0_ |= 4096;
                }
            }

            public boolean hasTypeTable() {
                return (this.bitField0_ & 8192) == 8192;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable getTypeTable() {
                return this.typeTable_;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.Builder mergeTypeTable(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable typeTable) {
                if ((this.bitField0_ & 8192) == 8192 && this.typeTable_ != kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable.getDefaultInstance()) {
                    this.typeTable_ = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable.newBuilder(this.typeTable_).mergeFrom(typeTable).buildPartial();
                } else {
                    this.typeTable_ = typeTable;
                }
                this.bitField0_ |= 8192;
                return this;
            }

            private void ensureVersionRequirementIsMutable() {
                if ((this.bitField0_ & 16384) != 16384) {
                    this.versionRequirement_ = new java.util.ArrayList(this.versionRequirement_);
                    this.bitField0_ |= 16384;
                }
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.Builder mergeVersionRequirementTable(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable versionRequirementTable) {
                if ((this.bitField0_ & 32768) == 32768 && this.versionRequirementTable_ != kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable.getDefaultInstance()) {
                    this.versionRequirementTable_ = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable.newBuilder(this.versionRequirementTable_).mergeFrom(versionRequirementTable).buildPartial();
                } else {
                    this.versionRequirementTable_ = versionRequirementTable;
                }
                this.bitField0_ |= 32768;
                return this;
            }
        }
    }

    public static final class Package extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package> implements kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageOrBuilder {
        public static kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package> PARSER = new kotlin.reflect.jvm.internal.impl.protobuf.AbstractParser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package>() { // from class: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package.1
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package parsePartialFrom(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
                return new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package(codedInputStream, extensionRegistryLite);
            }
        };
        private static final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package defaultInstance;
        private int bitField0_;
        private java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function> function_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property> property_;
        private java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias> typeAlias_;
        private kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable typeTable_;
        private final kotlin.reflect.jvm.internal.impl.protobuf.ByteString unknownFields;
        private kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable versionRequirementTable_;

        private Package(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package, ?> extendableBuilder) {
            super(extendableBuilder);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = extendableBuilder.getUnknownFields();
        }

        private Package(boolean z) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = kotlin.reflect.jvm.internal.impl.protobuf.ByteString.EMPTY;
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package getDefaultInstance() {
            return defaultInstance;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package getDefaultInstanceForType() {
            return defaultInstance;
        }

        private Package(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            initFields();
            kotlin.reflect.jvm.internal.impl.protobuf.ByteString.Output outputNewOutput = kotlin.reflect.jvm.internal.impl.protobuf.ByteString.newOutput();
            kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream codedOutputStreamNewInstance = kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.newInstance(outputNewOutput, 1);
            boolean z = false;
            int i = 0;
            while (!z) {
                try {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag == 26) {
                                    if ((i & 1) != 1) {
                                        this.function_ = new java.util.ArrayList();
                                        i |= 1;
                                    }
                                    this.function_.add((kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function) codedInputStream.readMessage(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function.PARSER, extensionRegistryLite));
                                } else if (tag == 34) {
                                    if ((i & 2) != 2) {
                                        this.property_ = new java.util.ArrayList();
                                        i |= 2;
                                    }
                                    this.property_.add((kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property) codedInputStream.readMessage(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property.PARSER, extensionRegistryLite));
                                } else if (tag != 42) {
                                    if (tag == 242) {
                                        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable.Builder builder = (this.bitField0_ & 1) == 1 ? this.typeTable_.toBuilder() : null;
                                        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable typeTable = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable) codedInputStream.readMessage(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable.PARSER, extensionRegistryLite);
                                        this.typeTable_ = typeTable;
                                        if (builder != null) {
                                            builder.mergeFrom(typeTable);
                                            this.typeTable_ = builder.buildPartial();
                                        }
                                        this.bitField0_ |= 1;
                                    } else if (tag != 258) {
                                        if (!parseUnknownField(codedInputStream, codedOutputStreamNewInstance, extensionRegistryLite, tag)) {
                                        }
                                    } else {
                                        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable.Builder builder2 = (this.bitField0_ & 2) == 2 ? this.versionRequirementTable_.toBuilder() : null;
                                        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable versionRequirementTable = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable) codedInputStream.readMessage(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable.PARSER, extensionRegistryLite);
                                        this.versionRequirementTable_ = versionRequirementTable;
                                        if (builder2 != null) {
                                            builder2.mergeFrom(versionRequirementTable);
                                            this.versionRequirementTable_ = builder2.buildPartial();
                                        }
                                        this.bitField0_ |= 2;
                                    }
                                } else {
                                    if ((i & 4) != 4) {
                                        this.typeAlias_ = new java.util.ArrayList();
                                        i |= 4;
                                    }
                                    this.typeAlias_.add((kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias) codedInputStream.readMessage(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias.PARSER, extensionRegistryLite));
                                }
                            }
                            z = true;
                        } catch (kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException e) {
                            throw e.setUnfinishedMessage(this);
                        }
                    } catch (java.io.IOException e2) {
                        throw new kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                    }
                } catch (java.lang.Throwable th) {
                    if ((i & 1) == 1) {
                        this.function_ = java.util.Collections.unmodifiableList(this.function_);
                    }
                    if ((i & 2) == 2) {
                        this.property_ = java.util.Collections.unmodifiableList(this.property_);
                    }
                    if ((i & 4) == 4) {
                        this.typeAlias_ = java.util.Collections.unmodifiableList(this.typeAlias_);
                    }
                    try {
                        codedOutputStreamNewInstance.flush();
                    } catch (java.io.IOException unused) {
                    } finally {
                        this.unknownFields = outputNewOutput.toByteString();
                    }
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            if ((i & 1) == 1) {
                this.function_ = java.util.Collections.unmodifiableList(this.function_);
            }
            if ((i & 2) == 2) {
                this.property_ = java.util.Collections.unmodifiableList(this.property_);
            }
            if ((i & 4) == 4) {
                this.typeAlias_ = java.util.Collections.unmodifiableList(this.typeAlias_);
            }
            try {
                codedOutputStreamNewInstance.flush();
            } catch (java.io.IOException unused2) {
            } finally {
                this.unknownFields = outputNewOutput.toByteString();
            }
            makeExtensionsImmutable();
        }

        static {
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package r0 = new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package(true);
            defaultInstance = r0;
            r0.initFields();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package> getParserForType() {
            return PARSER;
        }

        public java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function> getFunctionList() {
            return this.function_;
        }

        public int getFunctionCount() {
            return this.function_.size();
        }

        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function getFunction(int i) {
            return this.function_.get(i);
        }

        public java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property> getPropertyList() {
            return this.property_;
        }

        public int getPropertyCount() {
            return this.property_.size();
        }

        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property getProperty(int i) {
            return this.property_.get(i);
        }

        public java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias> getTypeAliasList() {
            return this.typeAlias_;
        }

        public int getTypeAliasCount() {
            return this.typeAlias_.size();
        }

        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias getTypeAlias(int i) {
            return this.typeAlias_.get(i);
        }

        public boolean hasTypeTable() {
            return (this.bitField0_ & 1) == 1;
        }

        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable getTypeTable() {
            return this.typeTable_;
        }

        public boolean hasVersionRequirementTable() {
            return (this.bitField0_ & 2) == 2;
        }

        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable getVersionRequirementTable() {
            return this.versionRequirementTable_;
        }

        private void initFields() {
            this.function_ = java.util.Collections.emptyList();
            this.property_ = java.util.Collections.emptyList();
            this.typeAlias_ = java.util.Collections.emptyList();
            this.typeTable_ = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable.getDefaultInstance();
            this.versionRequirementTable_ = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable.getDefaultInstance();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            for (int i = 0; i < getFunctionCount(); i++) {
                if (!getFunction(i).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            for (int i2 = 0; i2 < getPropertyCount(); i2++) {
                if (!getProperty(i2).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            for (int i3 = 0; i3 < getTypeAliasCount(); i3++) {
                if (!getTypeAlias(i3).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            if (hasTypeTable() && !getTypeTable().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!extensionsAreInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream codedOutputStream) throws java.io.IOException {
            getSerializedSize();
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage<MessageType>.ExtensionWriter extensionWriterNewExtensionWriter = newExtensionWriter();
            for (int i = 0; i < this.function_.size(); i++) {
                codedOutputStream.writeMessage(3, this.function_.get(i));
            }
            for (int i2 = 0; i2 < this.property_.size(); i2++) {
                codedOutputStream.writeMessage(4, this.property_.get(i2));
            }
            for (int i3 = 0; i3 < this.typeAlias_.size(); i3++) {
                codedOutputStream.writeMessage(5, this.typeAlias_.get(i3));
            }
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.writeMessage(30, this.typeTable_);
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.writeMessage(32, this.versionRequirementTable_);
            }
            extensionWriterNewExtensionWriter.writeUntil(200, codedOutputStream);
            codedOutputStream.writeRawBytes(this.unknownFields);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iComputeMessageSize = 0;
            for (int i2 = 0; i2 < this.function_.size(); i2++) {
                iComputeMessageSize += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeMessageSize(3, this.function_.get(i2));
            }
            for (int i3 = 0; i3 < this.property_.size(); i3++) {
                iComputeMessageSize += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeMessageSize(4, this.property_.get(i3));
            }
            for (int i4 = 0; i4 < this.typeAlias_.size(); i4++) {
                iComputeMessageSize += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeMessageSize(5, this.typeAlias_.get(i4));
            }
            if ((this.bitField0_ & 1) == 1) {
                iComputeMessageSize += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeMessageSize(30, this.typeTable_);
            }
            if ((this.bitField0_ & 2) == 2) {
                iComputeMessageSize += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeMessageSize(32, this.versionRequirementTable_);
            }
            int iExtensionsSerializedSize = iComputeMessageSize + extensionsSerializedSize() + this.unknownFields.size();
            this.memoizedSerializedSize = iExtensionsSerializedSize;
            return iExtensionsSerializedSize;
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package parseFrom(java.io.InputStream inputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package.Builder newBuilder() {
            return kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package.Builder.create();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package.Builder newBuilderForType() {
            return newBuilder();
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package.Builder newBuilder(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package r1) {
            return newBuilder().mergeFrom(r1);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package.Builder toBuilder() {
            return newBuilder(this);
        }

        public static final class Builder extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package.Builder> implements kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageOrBuilder {
            private int bitField0_;
            private java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function> function_ = java.util.Collections.emptyList();
            private java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property> property_ = java.util.Collections.emptyList();
            private java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias> typeAlias_ = java.util.Collections.emptyList();
            private kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable typeTable_ = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable.getDefaultInstance();
            private kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable versionRequirementTable_ = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable.getDefaultInstance();

            private void maybeForceBuilderInitialization() {
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package.Builder create() {
                return new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package.Builder();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package.Builder mo1266clone() {
                return create().mergeFrom(buildPartial());
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package getDefaultInstanceForType() {
                return kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package build() {
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package packageBuildPartial = buildPartial();
                if (packageBuildPartial.isInitialized()) {
                    return packageBuildPartial;
                }
                throw newUninitializedMessageException(packageBuildPartial);
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package buildPartial() {
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package r0 = new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package(this);
                int i = this.bitField0_;
                if ((i & 1) == 1) {
                    this.function_ = java.util.Collections.unmodifiableList(this.function_);
                    this.bitField0_ &= -2;
                }
                r0.function_ = this.function_;
                if ((this.bitField0_ & 2) == 2) {
                    this.property_ = java.util.Collections.unmodifiableList(this.property_);
                    this.bitField0_ &= -3;
                }
                r0.property_ = this.property_;
                if ((this.bitField0_ & 4) == 4) {
                    this.typeAlias_ = java.util.Collections.unmodifiableList(this.typeAlias_);
                    this.bitField0_ &= -5;
                }
                r0.typeAlias_ = this.typeAlias_;
                int i2 = (i & 8) != 8 ? 0 : 1;
                r0.typeTable_ = this.typeTable_;
                if ((i & 16) == 16) {
                    i2 |= 2;
                }
                r0.versionRequirementTable_ = this.versionRequirementTable_;
                r0.bitField0_ = i2;
                return r0;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package.Builder mergeFrom(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package r3) {
                if (r3 == kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package.getDefaultInstance()) {
                    return this;
                }
                if (!r3.function_.isEmpty()) {
                    if (this.function_.isEmpty()) {
                        this.function_ = r3.function_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureFunctionIsMutable();
                        this.function_.addAll(r3.function_);
                    }
                }
                if (!r3.property_.isEmpty()) {
                    if (this.property_.isEmpty()) {
                        this.property_ = r3.property_;
                        this.bitField0_ &= -3;
                    } else {
                        ensurePropertyIsMutable();
                        this.property_.addAll(r3.property_);
                    }
                }
                if (!r3.typeAlias_.isEmpty()) {
                    if (this.typeAlias_.isEmpty()) {
                        this.typeAlias_ = r3.typeAlias_;
                        this.bitField0_ &= -5;
                    } else {
                        ensureTypeAliasIsMutable();
                        this.typeAlias_.addAll(r3.typeAlias_);
                    }
                }
                if (r3.hasTypeTable()) {
                    mergeTypeTable(r3.getTypeTable());
                }
                if (r3.hasVersionRequirementTable()) {
                    mergeVersionRequirementTable(r3.getVersionRequirementTable());
                }
                mergeExtensionFields(r3);
                setUnknownFields(getUnknownFields().concat(r3.unknownFields));
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                for (int i = 0; i < getFunctionCount(); i++) {
                    if (!getFunction(i).isInitialized()) {
                        return false;
                    }
                }
                for (int i2 = 0; i2 < getPropertyCount(); i2++) {
                    if (!getProperty(i2).isInitialized()) {
                        return false;
                    }
                }
                for (int i3 = 0; i3 < getTypeAliasCount(); i3++) {
                    if (!getTypeAlias(i3).isInitialized()) {
                        return false;
                    }
                }
                return (!hasTypeTable() || getTypeTable().isInitialized()) && extensionsAreInitialized();
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package.Builder mergeFrom(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.lang.Throwable {
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package r0 = null;
                try {
                    try {
                        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package partialFrom = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (partialFrom != null) {
                            mergeFrom(partialFrom);
                        }
                        return this;
                    } catch (kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException e) {
                        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package) e.getUnfinishedMessage();
                        try {
                            throw e;
                        } catch (java.lang.Throwable th) {
                            th = th;
                            r0 = r4;
                            if (r0 != null) {
                                mergeFrom(r0);
                            }
                            throw th;
                        }
                    }
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    if (r0 != null) {
                        mergeFrom(r0);
                    }
                    throw th;
                }
            }

            private void ensureFunctionIsMutable() {
                if ((this.bitField0_ & 1) != 1) {
                    this.function_ = new java.util.ArrayList(this.function_);
                    this.bitField0_ |= 1;
                }
            }

            public int getFunctionCount() {
                return this.function_.size();
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function getFunction(int i) {
                return this.function_.get(i);
            }

            private void ensurePropertyIsMutable() {
                if ((this.bitField0_ & 2) != 2) {
                    this.property_ = new java.util.ArrayList(this.property_);
                    this.bitField0_ |= 2;
                }
            }

            public int getPropertyCount() {
                return this.property_.size();
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property getProperty(int i) {
                return this.property_.get(i);
            }

            private void ensureTypeAliasIsMutable() {
                if ((this.bitField0_ & 4) != 4) {
                    this.typeAlias_ = new java.util.ArrayList(this.typeAlias_);
                    this.bitField0_ |= 4;
                }
            }

            public int getTypeAliasCount() {
                return this.typeAlias_.size();
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias getTypeAlias(int i) {
                return this.typeAlias_.get(i);
            }

            public boolean hasTypeTable() {
                return (this.bitField0_ & 8) == 8;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable getTypeTable() {
                return this.typeTable_;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package.Builder mergeTypeTable(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable typeTable) {
                if ((this.bitField0_ & 8) == 8 && this.typeTable_ != kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable.getDefaultInstance()) {
                    this.typeTable_ = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable.newBuilder(this.typeTable_).mergeFrom(typeTable).buildPartial();
                } else {
                    this.typeTable_ = typeTable;
                }
                this.bitField0_ |= 8;
                return this;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package.Builder mergeVersionRequirementTable(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable versionRequirementTable) {
                if ((this.bitField0_ & 16) == 16 && this.versionRequirementTable_ != kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable.getDefaultInstance()) {
                    this.versionRequirementTable_ = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable.newBuilder(this.versionRequirementTable_).mergeFrom(versionRequirementTable).buildPartial();
                } else {
                    this.versionRequirementTable_ = versionRequirementTable;
                }
                this.bitField0_ |= 16;
                return this;
            }
        }
    }

    public static final class TypeTable extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite implements kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTableOrBuilder {
        public static kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable> PARSER = new kotlin.reflect.jvm.internal.impl.protobuf.AbstractParser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable>() { // from class: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable.1
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable parsePartialFrom(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
                return new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable(codedInputStream, extensionRegistryLite);
            }
        };
        private static final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable defaultInstance;
        private int bitField0_;
        private int firstNullable_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type> type_;
        private final kotlin.reflect.jvm.internal.impl.protobuf.ByteString unknownFields;

        private TypeTable(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        private TypeTable(boolean z) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = kotlin.reflect.jvm.internal.impl.protobuf.ByteString.EMPTY;
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable getDefaultInstance() {
            return defaultInstance;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable getDefaultInstanceForType() {
            return defaultInstance;
        }

        private TypeTable(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            initFields();
            kotlin.reflect.jvm.internal.impl.protobuf.ByteString.Output outputNewOutput = kotlin.reflect.jvm.internal.impl.protobuf.ByteString.newOutput();
            kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream codedOutputStreamNewInstance = kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.newInstance(outputNewOutput, 1);
            boolean z = false;
            boolean z2 = false;
            while (!z) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        if (tag != 0) {
                            if (tag == 10) {
                                if (!(z2 & true)) {
                                    this.type_ = new java.util.ArrayList();
                                    z2 |= true;
                                }
                                this.type_.add((kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type) codedInputStream.readMessage(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.PARSER, extensionRegistryLite));
                            } else if (tag != 16) {
                                if (!parseUnknownField(codedInputStream, codedOutputStreamNewInstance, extensionRegistryLite, tag)) {
                                }
                            } else {
                                this.bitField0_ |= 1;
                                this.firstNullable_ = codedInputStream.readInt32();
                            }
                        }
                        z = true;
                    } catch (java.lang.Throwable th) {
                        if (z2 & true) {
                            this.type_ = java.util.Collections.unmodifiableList(this.type_);
                        }
                        try {
                            codedOutputStreamNewInstance.flush();
                        } catch (java.io.IOException unused) {
                        } finally {
                            this.unknownFields = outputNewOutput.toByteString();
                        }
                        makeExtensionsImmutable();
                        throw th;
                    }
                } catch (kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (java.io.IOException e2) {
                    throw new kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                }
            }
            if (z2 & true) {
                this.type_ = java.util.Collections.unmodifiableList(this.type_);
            }
            try {
                codedOutputStreamNewInstance.flush();
            } catch (java.io.IOException unused2) {
            } finally {
                this.unknownFields = outputNewOutput.toByteString();
            }
            makeExtensionsImmutable();
        }

        static {
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable typeTable = new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable(true);
            defaultInstance = typeTable;
            typeTable.initFields();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable> getParserForType() {
            return PARSER;
        }

        public java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type> getTypeList() {
            return this.type_;
        }

        public int getTypeCount() {
            return this.type_.size();
        }

        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type getType(int i) {
            return this.type_.get(i);
        }

        public boolean hasFirstNullable() {
            return (this.bitField0_ & 1) == 1;
        }

        public int getFirstNullable() {
            return this.firstNullable_;
        }

        private void initFields() {
            this.type_ = java.util.Collections.emptyList();
            this.firstNullable_ = -1;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            for (int i = 0; i < getTypeCount(); i++) {
                if (!getType(i).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream codedOutputStream) throws java.io.IOException {
            getSerializedSize();
            for (int i = 0; i < this.type_.size(); i++) {
                codedOutputStream.writeMessage(1, this.type_.get(i));
            }
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.writeInt32(2, this.firstNullable_);
            }
            codedOutputStream.writeRawBytes(this.unknownFields);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iComputeInt32Size = 0;
            for (int i2 = 0; i2 < this.type_.size(); i2++) {
                iComputeInt32Size += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeMessageSize(1, this.type_.get(i2));
            }
            if ((this.bitField0_ & 1) == 1) {
                iComputeInt32Size += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeInt32Size(2, this.firstNullable_);
            }
            int size = iComputeInt32Size + this.unknownFields.size();
            this.memoizedSerializedSize = size;
            return size;
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable.Builder newBuilder() {
            return kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable.Builder.create();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable.Builder newBuilderForType() {
            return newBuilder();
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable.Builder newBuilder(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable typeTable) {
            return newBuilder().mergeFrom(typeTable);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable.Builder toBuilder() {
            return newBuilder(this);
        }

        public static final class Builder extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable.Builder> implements kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTableOrBuilder {
            private int bitField0_;
            private java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type> type_ = java.util.Collections.emptyList();
            private int firstNullable_ = -1;

            private void maybeForceBuilderInitialization() {
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable.Builder create() {
                return new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable.Builder();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable.Builder mo1266clone() {
                return create().mergeFrom(buildPartial());
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable getDefaultInstanceForType() {
                return kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable build() {
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable typeTableBuildPartial = buildPartial();
                if (typeTableBuildPartial.isInitialized()) {
                    return typeTableBuildPartial;
                }
                throw newUninitializedMessageException(typeTableBuildPartial);
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable buildPartial() {
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable typeTable = new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable(this);
                int i = this.bitField0_;
                if ((i & 1) == 1) {
                    this.type_ = java.util.Collections.unmodifiableList(this.type_);
                    this.bitField0_ &= -2;
                }
                typeTable.type_ = this.type_;
                int i2 = (i & 2) != 2 ? 0 : 1;
                typeTable.firstNullable_ = this.firstNullable_;
                typeTable.bitField0_ = i2;
                return typeTable;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable.Builder mergeFrom(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable typeTable) {
                if (typeTable == kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable.getDefaultInstance()) {
                    return this;
                }
                if (!typeTable.type_.isEmpty()) {
                    if (this.type_.isEmpty()) {
                        this.type_ = typeTable.type_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureTypeIsMutable();
                        this.type_.addAll(typeTable.type_);
                    }
                }
                if (typeTable.hasFirstNullable()) {
                    setFirstNullable(typeTable.getFirstNullable());
                }
                setUnknownFields(getUnknownFields().concat(typeTable.unknownFields));
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                for (int i = 0; i < getTypeCount(); i++) {
                    if (!getType(i).isInitialized()) {
                        return false;
                    }
                }
                return true;
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable.Builder mergeFrom(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.lang.Throwable {
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable typeTable = null;
                try {
                    try {
                        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable partialFrom = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (partialFrom != null) {
                            mergeFrom(partialFrom);
                        }
                        return this;
                    } catch (kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException e) {
                        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable typeTable2 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable) e.getUnfinishedMessage();
                        try {
                            throw e;
                        } catch (java.lang.Throwable th) {
                            th = th;
                            typeTable = typeTable2;
                            if (typeTable != null) {
                                mergeFrom(typeTable);
                            }
                            throw th;
                        }
                    }
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    if (typeTable != null) {
                        mergeFrom(typeTable);
                    }
                    throw th;
                }
            }

            private void ensureTypeIsMutable() {
                if ((this.bitField0_ & 1) != 1) {
                    this.type_ = new java.util.ArrayList(this.type_);
                    this.bitField0_ |= 1;
                }
            }

            public int getTypeCount() {
                return this.type_.size();
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type getType(int i) {
                return this.type_.get(i);
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable.Builder setFirstNullable(int i) {
                this.bitField0_ |= 2;
                this.firstNullable_ = i;
                return this;
            }
        }
    }

    public static final class Constructor extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor> implements kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ConstructorOrBuilder {
        public static kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor> PARSER = new kotlin.reflect.jvm.internal.impl.protobuf.AbstractParser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor>() { // from class: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor.1
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor parsePartialFrom(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
                return new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor(codedInputStream, extensionRegistryLite);
            }
        };
        private static final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor defaultInstance;
        private int bitField0_;
        private int flags_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private final kotlin.reflect.jvm.internal.impl.protobuf.ByteString unknownFields;
        private java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter> valueParameter_;
        private java.util.List<java.lang.Integer> versionRequirement_;

        private Constructor(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor, ?> extendableBuilder) {
            super(extendableBuilder);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = extendableBuilder.getUnknownFields();
        }

        private Constructor(boolean z) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = kotlin.reflect.jvm.internal.impl.protobuf.ByteString.EMPTY;
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor getDefaultInstance() {
            return defaultInstance;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor getDefaultInstanceForType() {
            return defaultInstance;
        }

        private Constructor(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            initFields();
            kotlin.reflect.jvm.internal.impl.protobuf.ByteString.Output outputNewOutput = kotlin.reflect.jvm.internal.impl.protobuf.ByteString.newOutput();
            kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream codedOutputStreamNewInstance = kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.newInstance(outputNewOutput, 1);
            boolean z = false;
            int i = 0;
            while (!z) {
                try {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag == 8) {
                                    this.bitField0_ |= 1;
                                    this.flags_ = codedInputStream.readInt32();
                                } else if (tag == 18) {
                                    if ((i & 2) != 2) {
                                        this.valueParameter_ = new java.util.ArrayList();
                                        i |= 2;
                                    }
                                    this.valueParameter_.add((kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter) codedInputStream.readMessage(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter.PARSER, extensionRegistryLite));
                                } else if (tag == 248) {
                                    if ((i & 4) != 4) {
                                        this.versionRequirement_ = new java.util.ArrayList();
                                        i |= 4;
                                    }
                                    this.versionRequirement_.add(java.lang.Integer.valueOf(codedInputStream.readInt32()));
                                } else if (tag != 250) {
                                    if (!parseUnknownField(codedInputStream, codedOutputStreamNewInstance, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    int iPushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                    if ((i & 4) != 4 && codedInputStream.getBytesUntilLimit() > 0) {
                                        this.versionRequirement_ = new java.util.ArrayList();
                                        i |= 4;
                                    }
                                    while (codedInputStream.getBytesUntilLimit() > 0) {
                                        this.versionRequirement_.add(java.lang.Integer.valueOf(codedInputStream.readInt32()));
                                    }
                                    codedInputStream.popLimit(iPushLimit);
                                }
                            }
                            z = true;
                        } catch (kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException e) {
                            throw e.setUnfinishedMessage(this);
                        }
                    } catch (java.io.IOException e2) {
                        throw new kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                    }
                } catch (java.lang.Throwable th) {
                    if ((i & 2) == 2) {
                        this.valueParameter_ = java.util.Collections.unmodifiableList(this.valueParameter_);
                    }
                    if ((i & 4) == 4) {
                        this.versionRequirement_ = java.util.Collections.unmodifiableList(this.versionRequirement_);
                    }
                    try {
                        codedOutputStreamNewInstance.flush();
                    } catch (java.io.IOException unused) {
                    } finally {
                        this.unknownFields = outputNewOutput.toByteString();
                    }
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            if ((i & 2) == 2) {
                this.valueParameter_ = java.util.Collections.unmodifiableList(this.valueParameter_);
            }
            if ((i & 4) == 4) {
                this.versionRequirement_ = java.util.Collections.unmodifiableList(this.versionRequirement_);
            }
            try {
                codedOutputStreamNewInstance.flush();
            } catch (java.io.IOException unused2) {
            } finally {
                this.unknownFields = outputNewOutput.toByteString();
            }
            makeExtensionsImmutable();
        }

        static {
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor constructor = new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor(true);
            defaultInstance = constructor;
            constructor.initFields();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor> getParserForType() {
            return PARSER;
        }

        public boolean hasFlags() {
            return (this.bitField0_ & 1) == 1;
        }

        public int getFlags() {
            return this.flags_;
        }

        public java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter> getValueParameterList() {
            return this.valueParameter_;
        }

        public int getValueParameterCount() {
            return this.valueParameter_.size();
        }

        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter getValueParameter(int i) {
            return this.valueParameter_.get(i);
        }

        public java.util.List<java.lang.Integer> getVersionRequirementList() {
            return this.versionRequirement_;
        }

        private void initFields() {
            this.flags_ = 6;
            this.valueParameter_ = java.util.Collections.emptyList();
            this.versionRequirement_ = java.util.Collections.emptyList();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            for (int i = 0; i < getValueParameterCount(); i++) {
                if (!getValueParameter(i).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            if (!extensionsAreInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream codedOutputStream) throws java.io.IOException {
            getSerializedSize();
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage<MessageType>.ExtensionWriter extensionWriterNewExtensionWriter = newExtensionWriter();
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.writeInt32(1, this.flags_);
            }
            for (int i = 0; i < this.valueParameter_.size(); i++) {
                codedOutputStream.writeMessage(2, this.valueParameter_.get(i));
            }
            for (int i2 = 0; i2 < this.versionRequirement_.size(); i2++) {
                codedOutputStream.writeInt32(31, this.versionRequirement_.get(i2).intValue());
            }
            extensionWriterNewExtensionWriter.writeUntil(19000, codedOutputStream);
            codedOutputStream.writeRawBytes(this.unknownFields);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iComputeInt32Size = (this.bitField0_ & 1) == 1 ? kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeInt32Size(1, this.flags_) + 0 : 0;
            for (int i2 = 0; i2 < this.valueParameter_.size(); i2++) {
                iComputeInt32Size += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeMessageSize(2, this.valueParameter_.get(i2));
            }
            int iComputeInt32SizeNoTag = 0;
            for (int i3 = 0; i3 < this.versionRequirement_.size(); i3++) {
                iComputeInt32SizeNoTag += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeInt32SizeNoTag(this.versionRequirement_.get(i3).intValue());
            }
            int size = iComputeInt32Size + iComputeInt32SizeNoTag + (getVersionRequirementList().size() * 2) + extensionsSerializedSize() + this.unknownFields.size();
            this.memoizedSerializedSize = size;
            return size;
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor.Builder newBuilder() {
            return kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor.Builder.create();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor.Builder newBuilderForType() {
            return newBuilder();
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor.Builder newBuilder(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor constructor) {
            return newBuilder().mergeFrom(constructor);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor.Builder toBuilder() {
            return newBuilder(this);
        }

        public static final class Builder extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor.Builder> implements kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ConstructorOrBuilder {
            private int bitField0_;
            private int flags_ = 6;
            private java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter> valueParameter_ = java.util.Collections.emptyList();
            private java.util.List<java.lang.Integer> versionRequirement_ = java.util.Collections.emptyList();

            private void maybeForceBuilderInitialization() {
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor.Builder create() {
                return new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor.Builder();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor.Builder mo1266clone() {
                return create().mergeFrom(buildPartial());
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor getDefaultInstanceForType() {
                return kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor build() {
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor constructorBuildPartial = buildPartial();
                if (constructorBuildPartial.isInitialized()) {
                    return constructorBuildPartial;
                }
                throw newUninitializedMessageException(constructorBuildPartial);
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor buildPartial() {
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor constructor = new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor(this);
                int i = (this.bitField0_ & 1) != 1 ? 0 : 1;
                constructor.flags_ = this.flags_;
                if ((this.bitField0_ & 2) == 2) {
                    this.valueParameter_ = java.util.Collections.unmodifiableList(this.valueParameter_);
                    this.bitField0_ &= -3;
                }
                constructor.valueParameter_ = this.valueParameter_;
                if ((this.bitField0_ & 4) == 4) {
                    this.versionRequirement_ = java.util.Collections.unmodifiableList(this.versionRequirement_);
                    this.bitField0_ &= -5;
                }
                constructor.versionRequirement_ = this.versionRequirement_;
                constructor.bitField0_ = i;
                return constructor;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor.Builder mergeFrom(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor constructor) {
                if (constructor == kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor.getDefaultInstance()) {
                    return this;
                }
                if (constructor.hasFlags()) {
                    setFlags(constructor.getFlags());
                }
                if (!constructor.valueParameter_.isEmpty()) {
                    if (this.valueParameter_.isEmpty()) {
                        this.valueParameter_ = constructor.valueParameter_;
                        this.bitField0_ &= -3;
                    } else {
                        ensureValueParameterIsMutable();
                        this.valueParameter_.addAll(constructor.valueParameter_);
                    }
                }
                if (!constructor.versionRequirement_.isEmpty()) {
                    if (this.versionRequirement_.isEmpty()) {
                        this.versionRequirement_ = constructor.versionRequirement_;
                        this.bitField0_ &= -5;
                    } else {
                        ensureVersionRequirementIsMutable();
                        this.versionRequirement_.addAll(constructor.versionRequirement_);
                    }
                }
                mergeExtensionFields(constructor);
                setUnknownFields(getUnknownFields().concat(constructor.unknownFields));
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                for (int i = 0; i < getValueParameterCount(); i++) {
                    if (!getValueParameter(i).isInitialized()) {
                        return false;
                    }
                }
                return extensionsAreInitialized();
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor.Builder mergeFrom(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.lang.Throwable {
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor constructor = null;
                try {
                    try {
                        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor partialFrom = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (partialFrom != null) {
                            mergeFrom(partialFrom);
                        }
                        return this;
                    } catch (kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException e) {
                        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor constructor2 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor) e.getUnfinishedMessage();
                        try {
                            throw e;
                        } catch (java.lang.Throwable th) {
                            th = th;
                            constructor = constructor2;
                            if (constructor != null) {
                                mergeFrom(constructor);
                            }
                            throw th;
                        }
                    }
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    if (constructor != null) {
                        mergeFrom(constructor);
                    }
                    throw th;
                }
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor.Builder setFlags(int i) {
                this.bitField0_ |= 1;
                this.flags_ = i;
                return this;
            }

            private void ensureValueParameterIsMutable() {
                if ((this.bitField0_ & 2) != 2) {
                    this.valueParameter_ = new java.util.ArrayList(this.valueParameter_);
                    this.bitField0_ |= 2;
                }
            }

            public int getValueParameterCount() {
                return this.valueParameter_.size();
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter getValueParameter(int i) {
                return this.valueParameter_.get(i);
            }

            private void ensureVersionRequirementIsMutable() {
                if ((this.bitField0_ & 4) != 4) {
                    this.versionRequirement_ = new java.util.ArrayList(this.versionRequirement_);
                    this.bitField0_ |= 4;
                }
            }
        }
    }

    public static final class Function extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function> implements kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.FunctionOrBuilder {
        public static kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function> PARSER = new kotlin.reflect.jvm.internal.impl.protobuf.AbstractParser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function>() { // from class: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function.1
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function parsePartialFrom(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
                return new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function(codedInputStream, extensionRegistryLite);
            }
        };
        private static final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function defaultInstance;
        private int bitField0_;
        private kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract contract_;
        private int flags_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private int name_;
        private int oldFlags_;
        private int receiverTypeId_;
        private kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type receiverType_;
        private int returnTypeId_;
        private kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type returnType_;
        private java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter> typeParameter_;
        private kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable typeTable_;
        private final kotlin.reflect.jvm.internal.impl.protobuf.ByteString unknownFields;
        private java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter> valueParameter_;
        private java.util.List<java.lang.Integer> versionRequirement_;

        private Function(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function, ?> extendableBuilder) {
            super(extendableBuilder);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = extendableBuilder.getUnknownFields();
        }

        private Function(boolean z) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = kotlin.reflect.jvm.internal.impl.protobuf.ByteString.EMPTY;
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function getDefaultInstance() {
            return defaultInstance;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function getDefaultInstanceForType() {
            return defaultInstance;
        }

        private Function(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            initFields();
            kotlin.reflect.jvm.internal.impl.protobuf.ByteString.Output outputNewOutput = kotlin.reflect.jvm.internal.impl.protobuf.ByteString.newOutput();
            kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream codedOutputStreamNewInstance = kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.newInstance(outputNewOutput, 1);
            boolean z = false;
            int i = 0;
            while (!z) {
                try {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            switch (tag) {
                                case 0:
                                    break;
                                case 8:
                                    this.bitField0_ |= 2;
                                    this.oldFlags_ = codedInputStream.readInt32();
                                    continue;
                                case 16:
                                    this.bitField0_ |= 4;
                                    this.name_ = codedInputStream.readInt32();
                                    continue;
                                case 26:
                                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Builder builder = (this.bitField0_ & 8) == 8 ? this.returnType_.toBuilder() : null;
                                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type type = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type) codedInputStream.readMessage(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.PARSER, extensionRegistryLite);
                                    this.returnType_ = type;
                                    if (builder != null) {
                                        builder.mergeFrom(type);
                                        this.returnType_ = builder.buildPartial();
                                    }
                                    this.bitField0_ |= 8;
                                    continue;
                                case 34:
                                    if ((i & 32) != 32) {
                                        this.typeParameter_ = new java.util.ArrayList();
                                        i |= 32;
                                    }
                                    this.typeParameter_.add((kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter) codedInputStream.readMessage(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter.PARSER, extensionRegistryLite));
                                    continue;
                                case 42:
                                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Builder builder2 = (this.bitField0_ & 32) == 32 ? this.receiverType_.toBuilder() : null;
                                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type type2 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type) codedInputStream.readMessage(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.PARSER, extensionRegistryLite);
                                    this.receiverType_ = type2;
                                    if (builder2 != null) {
                                        builder2.mergeFrom(type2);
                                        this.receiverType_ = builder2.buildPartial();
                                    }
                                    this.bitField0_ |= 32;
                                    continue;
                                case 50:
                                    if ((i & 256) != 256) {
                                        this.valueParameter_ = new java.util.ArrayList();
                                        i |= 256;
                                    }
                                    this.valueParameter_.add((kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter) codedInputStream.readMessage(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter.PARSER, extensionRegistryLite));
                                    continue;
                                case 56:
                                    this.bitField0_ |= 16;
                                    this.returnTypeId_ = codedInputStream.readInt32();
                                    continue;
                                case 64:
                                    this.bitField0_ |= 64;
                                    this.receiverTypeId_ = codedInputStream.readInt32();
                                    continue;
                                case 72:
                                    this.bitField0_ |= 1;
                                    this.flags_ = codedInputStream.readInt32();
                                    continue;
                                case 242:
                                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable.Builder builder3 = (this.bitField0_ & 128) == 128 ? this.typeTable_.toBuilder() : null;
                                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable typeTable = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable) codedInputStream.readMessage(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable.PARSER, extensionRegistryLite);
                                    this.typeTable_ = typeTable;
                                    if (builder3 != null) {
                                        builder3.mergeFrom(typeTable);
                                        this.typeTable_ = builder3.buildPartial();
                                    }
                                    this.bitField0_ |= 128;
                                    continue;
                                case 248:
                                    if ((i & 1024) != 1024) {
                                        this.versionRequirement_ = new java.util.ArrayList();
                                        i |= 1024;
                                    }
                                    this.versionRequirement_.add(java.lang.Integer.valueOf(codedInputStream.readInt32()));
                                    continue;
                                case 250:
                                    int iPushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                    if ((i & 1024) != 1024 && codedInputStream.getBytesUntilLimit() > 0) {
                                        this.versionRequirement_ = new java.util.ArrayList();
                                        i |= 1024;
                                    }
                                    while (codedInputStream.getBytesUntilLimit() > 0) {
                                        this.versionRequirement_.add(java.lang.Integer.valueOf(codedInputStream.readInt32()));
                                    }
                                    codedInputStream.popLimit(iPushLimit);
                                    continue;
                                case 258:
                                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract.Builder builder4 = (this.bitField0_ & 256) == 256 ? this.contract_.toBuilder() : null;
                                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract contract = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract) codedInputStream.readMessage(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract.PARSER, extensionRegistryLite);
                                    this.contract_ = contract;
                                    if (builder4 != null) {
                                        builder4.mergeFrom(contract);
                                        this.contract_ = builder4.buildPartial();
                                    }
                                    this.bitField0_ |= 256;
                                    continue;
                                default:
                                    if (!parseUnknownField(codedInputStream, codedOutputStreamNewInstance, extensionRegistryLite, tag)) {
                                        break;
                                    }
                                    break;
                            }
                            z = true;
                        } catch (java.io.IOException e) {
                            throw new kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException(e.getMessage()).setUnfinishedMessage(this);
                        }
                    } catch (kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException e2) {
                        throw e2.setUnfinishedMessage(this);
                    }
                } catch (java.lang.Throwable th) {
                    if ((i & 32) == 32) {
                        this.typeParameter_ = java.util.Collections.unmodifiableList(this.typeParameter_);
                    }
                    if ((i & 256) == 256) {
                        this.valueParameter_ = java.util.Collections.unmodifiableList(this.valueParameter_);
                    }
                    if ((i & 1024) == 1024) {
                        this.versionRequirement_ = java.util.Collections.unmodifiableList(this.versionRequirement_);
                    }
                    try {
                        codedOutputStreamNewInstance.flush();
                    } catch (java.io.IOException unused) {
                    } finally {
                        this.unknownFields = outputNewOutput.toByteString();
                    }
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            if ((i & 32) == 32) {
                this.typeParameter_ = java.util.Collections.unmodifiableList(this.typeParameter_);
            }
            if ((i & 256) == 256) {
                this.valueParameter_ = java.util.Collections.unmodifiableList(this.valueParameter_);
            }
            if ((i & 1024) == 1024) {
                this.versionRequirement_ = java.util.Collections.unmodifiableList(this.versionRequirement_);
            }
            try {
                codedOutputStreamNewInstance.flush();
            } catch (java.io.IOException unused2) {
            } finally {
                this.unknownFields = outputNewOutput.toByteString();
            }
            makeExtensionsImmutable();
        }

        static {
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function function = new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function(true);
            defaultInstance = function;
            function.initFields();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function> getParserForType() {
            return PARSER;
        }

        public boolean hasFlags() {
            return (this.bitField0_ & 1) == 1;
        }

        public int getFlags() {
            return this.flags_;
        }

        public boolean hasOldFlags() {
            return (this.bitField0_ & 2) == 2;
        }

        public int getOldFlags() {
            return this.oldFlags_;
        }

        public boolean hasName() {
            return (this.bitField0_ & 4) == 4;
        }

        public int getName() {
            return this.name_;
        }

        public boolean hasReturnType() {
            return (this.bitField0_ & 8) == 8;
        }

        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type getReturnType() {
            return this.returnType_;
        }

        public boolean hasReturnTypeId() {
            return (this.bitField0_ & 16) == 16;
        }

        public int getReturnTypeId() {
            return this.returnTypeId_;
        }

        public java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter> getTypeParameterList() {
            return this.typeParameter_;
        }

        public int getTypeParameterCount() {
            return this.typeParameter_.size();
        }

        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter getTypeParameter(int i) {
            return this.typeParameter_.get(i);
        }

        public boolean hasReceiverType() {
            return (this.bitField0_ & 32) == 32;
        }

        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type getReceiverType() {
            return this.receiverType_;
        }

        public boolean hasReceiverTypeId() {
            return (this.bitField0_ & 64) == 64;
        }

        public int getReceiverTypeId() {
            return this.receiverTypeId_;
        }

        public java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter> getValueParameterList() {
            return this.valueParameter_;
        }

        public int getValueParameterCount() {
            return this.valueParameter_.size();
        }

        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter getValueParameter(int i) {
            return this.valueParameter_.get(i);
        }

        public boolean hasTypeTable() {
            return (this.bitField0_ & 128) == 128;
        }

        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable getTypeTable() {
            return this.typeTable_;
        }

        public java.util.List<java.lang.Integer> getVersionRequirementList() {
            return this.versionRequirement_;
        }

        public boolean hasContract() {
            return (this.bitField0_ & 256) == 256;
        }

        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract getContract() {
            return this.contract_;
        }

        private void initFields() {
            this.flags_ = 6;
            this.oldFlags_ = 6;
            this.name_ = 0;
            this.returnType_ = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.getDefaultInstance();
            this.returnTypeId_ = 0;
            this.typeParameter_ = java.util.Collections.emptyList();
            this.receiverType_ = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.getDefaultInstance();
            this.receiverTypeId_ = 0;
            this.valueParameter_ = java.util.Collections.emptyList();
            this.typeTable_ = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable.getDefaultInstance();
            this.versionRequirement_ = java.util.Collections.emptyList();
            this.contract_ = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract.getDefaultInstance();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            if (!hasName()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasReturnType() && !getReturnType().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            for (int i = 0; i < getTypeParameterCount(); i++) {
                if (!getTypeParameter(i).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            if (hasReceiverType() && !getReceiverType().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            for (int i2 = 0; i2 < getValueParameterCount(); i2++) {
                if (!getValueParameter(i2).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            if (hasTypeTable() && !getTypeTable().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasContract() && !getContract().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!extensionsAreInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream codedOutputStream) throws java.io.IOException {
            getSerializedSize();
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage<MessageType>.ExtensionWriter extensionWriterNewExtensionWriter = newExtensionWriter();
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.writeInt32(1, this.oldFlags_);
            }
            if ((this.bitField0_ & 4) == 4) {
                codedOutputStream.writeInt32(2, this.name_);
            }
            if ((this.bitField0_ & 8) == 8) {
                codedOutputStream.writeMessage(3, this.returnType_);
            }
            for (int i = 0; i < this.typeParameter_.size(); i++) {
                codedOutputStream.writeMessage(4, this.typeParameter_.get(i));
            }
            if ((this.bitField0_ & 32) == 32) {
                codedOutputStream.writeMessage(5, this.receiverType_);
            }
            for (int i2 = 0; i2 < this.valueParameter_.size(); i2++) {
                codedOutputStream.writeMessage(6, this.valueParameter_.get(i2));
            }
            if ((this.bitField0_ & 16) == 16) {
                codedOutputStream.writeInt32(7, this.returnTypeId_);
            }
            if ((this.bitField0_ & 64) == 64) {
                codedOutputStream.writeInt32(8, this.receiverTypeId_);
            }
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.writeInt32(9, this.flags_);
            }
            if ((this.bitField0_ & 128) == 128) {
                codedOutputStream.writeMessage(30, this.typeTable_);
            }
            for (int i3 = 0; i3 < this.versionRequirement_.size(); i3++) {
                codedOutputStream.writeInt32(31, this.versionRequirement_.get(i3).intValue());
            }
            if ((this.bitField0_ & 256) == 256) {
                codedOutputStream.writeMessage(32, this.contract_);
            }
            extensionWriterNewExtensionWriter.writeUntil(19000, codedOutputStream);
            codedOutputStream.writeRawBytes(this.unknownFields);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iComputeInt32Size = (this.bitField0_ & 2) == 2 ? kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeInt32Size(1, this.oldFlags_) + 0 : 0;
            if ((this.bitField0_ & 4) == 4) {
                iComputeInt32Size += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeInt32Size(2, this.name_);
            }
            if ((this.bitField0_ & 8) == 8) {
                iComputeInt32Size += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeMessageSize(3, this.returnType_);
            }
            for (int i2 = 0; i2 < this.typeParameter_.size(); i2++) {
                iComputeInt32Size += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeMessageSize(4, this.typeParameter_.get(i2));
            }
            if ((this.bitField0_ & 32) == 32) {
                iComputeInt32Size += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeMessageSize(5, this.receiverType_);
            }
            for (int i3 = 0; i3 < this.valueParameter_.size(); i3++) {
                iComputeInt32Size += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeMessageSize(6, this.valueParameter_.get(i3));
            }
            if ((this.bitField0_ & 16) == 16) {
                iComputeInt32Size += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeInt32Size(7, this.returnTypeId_);
            }
            if ((this.bitField0_ & 64) == 64) {
                iComputeInt32Size += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeInt32Size(8, this.receiverTypeId_);
            }
            if ((this.bitField0_ & 1) == 1) {
                iComputeInt32Size += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeInt32Size(9, this.flags_);
            }
            if ((this.bitField0_ & 128) == 128) {
                iComputeInt32Size += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeMessageSize(30, this.typeTable_);
            }
            int iComputeInt32SizeNoTag = 0;
            for (int i4 = 0; i4 < this.versionRequirement_.size(); i4++) {
                iComputeInt32SizeNoTag += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeInt32SizeNoTag(this.versionRequirement_.get(i4).intValue());
            }
            int size = iComputeInt32Size + iComputeInt32SizeNoTag + (getVersionRequirementList().size() * 2);
            if ((this.bitField0_ & 256) == 256) {
                size += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeMessageSize(32, this.contract_);
            }
            int iExtensionsSerializedSize = size + extensionsSerializedSize() + this.unknownFields.size();
            this.memoizedSerializedSize = iExtensionsSerializedSize;
            return iExtensionsSerializedSize;
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function parseFrom(java.io.InputStream inputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function.Builder newBuilder() {
            return kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function.Builder.create();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function.Builder newBuilderForType() {
            return newBuilder();
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function.Builder newBuilder(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function function) {
            return newBuilder().mergeFrom(function);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function.Builder toBuilder() {
            return newBuilder(this);
        }

        public static final class Builder extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function.Builder> implements kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.FunctionOrBuilder {
            private int bitField0_;
            private int name_;
            private int receiverTypeId_;
            private int returnTypeId_;
            private int flags_ = 6;
            private int oldFlags_ = 6;
            private kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type returnType_ = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.getDefaultInstance();
            private java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter> typeParameter_ = java.util.Collections.emptyList();
            private kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type receiverType_ = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.getDefaultInstance();
            private java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter> valueParameter_ = java.util.Collections.emptyList();
            private kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable typeTable_ = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable.getDefaultInstance();
            private java.util.List<java.lang.Integer> versionRequirement_ = java.util.Collections.emptyList();
            private kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract contract_ = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract.getDefaultInstance();

            private void maybeForceBuilderInitialization() {
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function.Builder create() {
                return new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function.Builder();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function.Builder mo1266clone() {
                return create().mergeFrom(buildPartial());
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function getDefaultInstanceForType() {
                return kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function build() {
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function functionBuildPartial = buildPartial();
                if (functionBuildPartial.isInitialized()) {
                    return functionBuildPartial;
                }
                throw newUninitializedMessageException(functionBuildPartial);
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function buildPartial() {
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function function = new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function(this);
                int i = this.bitField0_;
                int i2 = (i & 1) != 1 ? 0 : 1;
                function.flags_ = this.flags_;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                function.oldFlags_ = this.oldFlags_;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                function.name_ = this.name_;
                if ((i & 8) == 8) {
                    i2 |= 8;
                }
                function.returnType_ = this.returnType_;
                if ((i & 16) == 16) {
                    i2 |= 16;
                }
                function.returnTypeId_ = this.returnTypeId_;
                if ((this.bitField0_ & 32) == 32) {
                    this.typeParameter_ = java.util.Collections.unmodifiableList(this.typeParameter_);
                    this.bitField0_ &= -33;
                }
                function.typeParameter_ = this.typeParameter_;
                if ((i & 64) == 64) {
                    i2 |= 32;
                }
                function.receiverType_ = this.receiverType_;
                if ((i & 128) == 128) {
                    i2 |= 64;
                }
                function.receiverTypeId_ = this.receiverTypeId_;
                if ((this.bitField0_ & 256) == 256) {
                    this.valueParameter_ = java.util.Collections.unmodifiableList(this.valueParameter_);
                    this.bitField0_ &= -257;
                }
                function.valueParameter_ = this.valueParameter_;
                if ((i & 512) == 512) {
                    i2 |= 128;
                }
                function.typeTable_ = this.typeTable_;
                if ((this.bitField0_ & 1024) == 1024) {
                    this.versionRequirement_ = java.util.Collections.unmodifiableList(this.versionRequirement_);
                    this.bitField0_ &= -1025;
                }
                function.versionRequirement_ = this.versionRequirement_;
                if ((i & 2048) == 2048) {
                    i2 |= 256;
                }
                function.contract_ = this.contract_;
                function.bitField0_ = i2;
                return function;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function.Builder mergeFrom(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function function) {
                if (function == kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function.getDefaultInstance()) {
                    return this;
                }
                if (function.hasFlags()) {
                    setFlags(function.getFlags());
                }
                if (function.hasOldFlags()) {
                    setOldFlags(function.getOldFlags());
                }
                if (function.hasName()) {
                    setName(function.getName());
                }
                if (function.hasReturnType()) {
                    mergeReturnType(function.getReturnType());
                }
                if (function.hasReturnTypeId()) {
                    setReturnTypeId(function.getReturnTypeId());
                }
                if (!function.typeParameter_.isEmpty()) {
                    if (this.typeParameter_.isEmpty()) {
                        this.typeParameter_ = function.typeParameter_;
                        this.bitField0_ &= -33;
                    } else {
                        ensureTypeParameterIsMutable();
                        this.typeParameter_.addAll(function.typeParameter_);
                    }
                }
                if (function.hasReceiverType()) {
                    mergeReceiverType(function.getReceiverType());
                }
                if (function.hasReceiverTypeId()) {
                    setReceiverTypeId(function.getReceiverTypeId());
                }
                if (!function.valueParameter_.isEmpty()) {
                    if (this.valueParameter_.isEmpty()) {
                        this.valueParameter_ = function.valueParameter_;
                        this.bitField0_ &= -257;
                    } else {
                        ensureValueParameterIsMutable();
                        this.valueParameter_.addAll(function.valueParameter_);
                    }
                }
                if (function.hasTypeTable()) {
                    mergeTypeTable(function.getTypeTable());
                }
                if (!function.versionRequirement_.isEmpty()) {
                    if (this.versionRequirement_.isEmpty()) {
                        this.versionRequirement_ = function.versionRequirement_;
                        this.bitField0_ &= -1025;
                    } else {
                        ensureVersionRequirementIsMutable();
                        this.versionRequirement_.addAll(function.versionRequirement_);
                    }
                }
                if (function.hasContract()) {
                    mergeContract(function.getContract());
                }
                mergeExtensionFields(function);
                setUnknownFields(getUnknownFields().concat(function.unknownFields));
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (!hasName()) {
                    return false;
                }
                if (hasReturnType() && !getReturnType().isInitialized()) {
                    return false;
                }
                for (int i = 0; i < getTypeParameterCount(); i++) {
                    if (!getTypeParameter(i).isInitialized()) {
                        return false;
                    }
                }
                if (hasReceiverType() && !getReceiverType().isInitialized()) {
                    return false;
                }
                for (int i2 = 0; i2 < getValueParameterCount(); i2++) {
                    if (!getValueParameter(i2).isInitialized()) {
                        return false;
                    }
                }
                if (!hasTypeTable() || getTypeTable().isInitialized()) {
                    return (!hasContract() || getContract().isInitialized()) && extensionsAreInitialized();
                }
                return false;
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function.Builder mergeFrom(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.lang.Throwable {
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function function = null;
                try {
                    try {
                        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function partialFrom = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (partialFrom != null) {
                            mergeFrom(partialFrom);
                        }
                        return this;
                    } catch (kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException e) {
                        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function function2 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function) e.getUnfinishedMessage();
                        try {
                            throw e;
                        } catch (java.lang.Throwable th) {
                            th = th;
                            function = function2;
                            if (function != null) {
                                mergeFrom(function);
                            }
                            throw th;
                        }
                    }
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    if (function != null) {
                        mergeFrom(function);
                    }
                    throw th;
                }
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function.Builder setFlags(int i) {
                this.bitField0_ |= 1;
                this.flags_ = i;
                return this;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function.Builder setOldFlags(int i) {
                this.bitField0_ |= 2;
                this.oldFlags_ = i;
                return this;
            }

            public boolean hasName() {
                return (this.bitField0_ & 4) == 4;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function.Builder setName(int i) {
                this.bitField0_ |= 4;
                this.name_ = i;
                return this;
            }

            public boolean hasReturnType() {
                return (this.bitField0_ & 8) == 8;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type getReturnType() {
                return this.returnType_;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function.Builder mergeReturnType(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type type) {
                if ((this.bitField0_ & 8) == 8 && this.returnType_ != kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.getDefaultInstance()) {
                    this.returnType_ = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.newBuilder(this.returnType_).mergeFrom(type).buildPartial();
                } else {
                    this.returnType_ = type;
                }
                this.bitField0_ |= 8;
                return this;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function.Builder setReturnTypeId(int i) {
                this.bitField0_ |= 16;
                this.returnTypeId_ = i;
                return this;
            }

            private void ensureTypeParameterIsMutable() {
                if ((this.bitField0_ & 32) != 32) {
                    this.typeParameter_ = new java.util.ArrayList(this.typeParameter_);
                    this.bitField0_ |= 32;
                }
            }

            public int getTypeParameterCount() {
                return this.typeParameter_.size();
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter getTypeParameter(int i) {
                return this.typeParameter_.get(i);
            }

            public boolean hasReceiverType() {
                return (this.bitField0_ & 64) == 64;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type getReceiverType() {
                return this.receiverType_;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function.Builder mergeReceiverType(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type type) {
                if ((this.bitField0_ & 64) == 64 && this.receiverType_ != kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.getDefaultInstance()) {
                    this.receiverType_ = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.newBuilder(this.receiverType_).mergeFrom(type).buildPartial();
                } else {
                    this.receiverType_ = type;
                }
                this.bitField0_ |= 64;
                return this;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function.Builder setReceiverTypeId(int i) {
                this.bitField0_ |= 128;
                this.receiverTypeId_ = i;
                return this;
            }

            private void ensureValueParameterIsMutable() {
                if ((this.bitField0_ & 256) != 256) {
                    this.valueParameter_ = new java.util.ArrayList(this.valueParameter_);
                    this.bitField0_ |= 256;
                }
            }

            public int getValueParameterCount() {
                return this.valueParameter_.size();
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter getValueParameter(int i) {
                return this.valueParameter_.get(i);
            }

            public boolean hasTypeTable() {
                return (this.bitField0_ & 512) == 512;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable getTypeTable() {
                return this.typeTable_;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function.Builder mergeTypeTable(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable typeTable) {
                if ((this.bitField0_ & 512) == 512 && this.typeTable_ != kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable.getDefaultInstance()) {
                    this.typeTable_ = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable.newBuilder(this.typeTable_).mergeFrom(typeTable).buildPartial();
                } else {
                    this.typeTable_ = typeTable;
                }
                this.bitField0_ |= 512;
                return this;
            }

            private void ensureVersionRequirementIsMutable() {
                if ((this.bitField0_ & 1024) != 1024) {
                    this.versionRequirement_ = new java.util.ArrayList(this.versionRequirement_);
                    this.bitField0_ |= 1024;
                }
            }

            public boolean hasContract() {
                return (this.bitField0_ & 2048) == 2048;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract getContract() {
                return this.contract_;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function.Builder mergeContract(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract contract) {
                if ((this.bitField0_ & 2048) == 2048 && this.contract_ != kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract.getDefaultInstance()) {
                    this.contract_ = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract.newBuilder(this.contract_).mergeFrom(contract).buildPartial();
                } else {
                    this.contract_ = contract;
                }
                this.bitField0_ |= 2048;
                return this;
            }
        }
    }

    public static final class Property extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property> implements kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PropertyOrBuilder {
        public static kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property> PARSER = new kotlin.reflect.jvm.internal.impl.protobuf.AbstractParser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property>() { // from class: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property.1
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property parsePartialFrom(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
                return new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property(codedInputStream, extensionRegistryLite);
            }
        };
        private static final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property defaultInstance;
        private int bitField0_;
        private int flags_;
        private int getterFlags_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private int name_;
        private int oldFlags_;
        private int receiverTypeId_;
        private kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type receiverType_;
        private int returnTypeId_;
        private kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type returnType_;
        private int setterFlags_;
        private kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter setterValueParameter_;
        private java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter> typeParameter_;
        private final kotlin.reflect.jvm.internal.impl.protobuf.ByteString unknownFields;
        private java.util.List<java.lang.Integer> versionRequirement_;

        private Property(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property, ?> extendableBuilder) {
            super(extendableBuilder);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = extendableBuilder.getUnknownFields();
        }

        private Property(boolean z) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = kotlin.reflect.jvm.internal.impl.protobuf.ByteString.EMPTY;
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property getDefaultInstance() {
            return defaultInstance;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property getDefaultInstanceForType() {
            return defaultInstance;
        }

        private Property(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            initFields();
            kotlin.reflect.jvm.internal.impl.protobuf.ByteString.Output outputNewOutput = kotlin.reflect.jvm.internal.impl.protobuf.ByteString.newOutput();
            kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream codedOutputStreamNewInstance = kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.newInstance(outputNewOutput, 1);
            boolean z = false;
            int i = 0;
            while (!z) {
                try {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            switch (tag) {
                                case 0:
                                    break;
                                case 8:
                                    this.bitField0_ |= 2;
                                    this.oldFlags_ = codedInputStream.readInt32();
                                    continue;
                                case 16:
                                    this.bitField0_ |= 4;
                                    this.name_ = codedInputStream.readInt32();
                                    continue;
                                case 26:
                                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Builder builder = (this.bitField0_ & 8) == 8 ? this.returnType_.toBuilder() : null;
                                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type type = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type) codedInputStream.readMessage(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.PARSER, extensionRegistryLite);
                                    this.returnType_ = type;
                                    if (builder != null) {
                                        builder.mergeFrom(type);
                                        this.returnType_ = builder.buildPartial();
                                    }
                                    this.bitField0_ |= 8;
                                    continue;
                                case 34:
                                    if ((i & 32) != 32) {
                                        this.typeParameter_ = new java.util.ArrayList();
                                        i |= 32;
                                    }
                                    this.typeParameter_.add((kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter) codedInputStream.readMessage(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter.PARSER, extensionRegistryLite));
                                    continue;
                                case 42:
                                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Builder builder2 = (this.bitField0_ & 32) == 32 ? this.receiverType_.toBuilder() : null;
                                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type type2 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type) codedInputStream.readMessage(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.PARSER, extensionRegistryLite);
                                    this.receiverType_ = type2;
                                    if (builder2 != null) {
                                        builder2.mergeFrom(type2);
                                        this.receiverType_ = builder2.buildPartial();
                                    }
                                    this.bitField0_ |= 32;
                                    continue;
                                case 50:
                                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter.Builder builder3 = (this.bitField0_ & 128) == 128 ? this.setterValueParameter_.toBuilder() : null;
                                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter valueParameter = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter) codedInputStream.readMessage(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter.PARSER, extensionRegistryLite);
                                    this.setterValueParameter_ = valueParameter;
                                    if (builder3 != null) {
                                        builder3.mergeFrom(valueParameter);
                                        this.setterValueParameter_ = builder3.buildPartial();
                                    }
                                    this.bitField0_ |= 128;
                                    continue;
                                case 56:
                                    this.bitField0_ |= 256;
                                    this.getterFlags_ = codedInputStream.readInt32();
                                    continue;
                                case 64:
                                    this.bitField0_ |= 512;
                                    this.setterFlags_ = codedInputStream.readInt32();
                                    continue;
                                case 72:
                                    this.bitField0_ |= 16;
                                    this.returnTypeId_ = codedInputStream.readInt32();
                                    continue;
                                case 80:
                                    this.bitField0_ |= 64;
                                    this.receiverTypeId_ = codedInputStream.readInt32();
                                    continue;
                                case 88:
                                    this.bitField0_ |= 1;
                                    this.flags_ = codedInputStream.readInt32();
                                    continue;
                                case 248:
                                    if ((i & 2048) != 2048) {
                                        this.versionRequirement_ = new java.util.ArrayList();
                                        i |= 2048;
                                    }
                                    this.versionRequirement_.add(java.lang.Integer.valueOf(codedInputStream.readInt32()));
                                    continue;
                                case 250:
                                    int iPushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                    if ((i & 2048) != 2048 && codedInputStream.getBytesUntilLimit() > 0) {
                                        this.versionRequirement_ = new java.util.ArrayList();
                                        i |= 2048;
                                    }
                                    while (codedInputStream.getBytesUntilLimit() > 0) {
                                        this.versionRequirement_.add(java.lang.Integer.valueOf(codedInputStream.readInt32()));
                                    }
                                    codedInputStream.popLimit(iPushLimit);
                                    continue;
                                default:
                                    if (!parseUnknownField(codedInputStream, codedOutputStreamNewInstance, extensionRegistryLite, tag)) {
                                        break;
                                    }
                                    break;
                            }
                            z = true;
                        } catch (kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException e) {
                            throw e.setUnfinishedMessage(this);
                        }
                    } catch (java.io.IOException e2) {
                        throw new kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                    }
                } catch (java.lang.Throwable th) {
                    if ((i & 32) == 32) {
                        this.typeParameter_ = java.util.Collections.unmodifiableList(this.typeParameter_);
                    }
                    if ((i & 2048) == 2048) {
                        this.versionRequirement_ = java.util.Collections.unmodifiableList(this.versionRequirement_);
                    }
                    try {
                        codedOutputStreamNewInstance.flush();
                    } catch (java.io.IOException unused) {
                    } finally {
                        this.unknownFields = outputNewOutput.toByteString();
                    }
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            if ((i & 32) == 32) {
                this.typeParameter_ = java.util.Collections.unmodifiableList(this.typeParameter_);
            }
            if ((i & 2048) == 2048) {
                this.versionRequirement_ = java.util.Collections.unmodifiableList(this.versionRequirement_);
            }
            try {
                codedOutputStreamNewInstance.flush();
            } catch (java.io.IOException unused2) {
            } finally {
                this.unknownFields = outputNewOutput.toByteString();
            }
            makeExtensionsImmutable();
        }

        static {
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property property = new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property(true);
            defaultInstance = property;
            property.initFields();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property> getParserForType() {
            return PARSER;
        }

        public boolean hasFlags() {
            return (this.bitField0_ & 1) == 1;
        }

        public int getFlags() {
            return this.flags_;
        }

        public boolean hasOldFlags() {
            return (this.bitField0_ & 2) == 2;
        }

        public int getOldFlags() {
            return this.oldFlags_;
        }

        public boolean hasName() {
            return (this.bitField0_ & 4) == 4;
        }

        public int getName() {
            return this.name_;
        }

        public boolean hasReturnType() {
            return (this.bitField0_ & 8) == 8;
        }

        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type getReturnType() {
            return this.returnType_;
        }

        public boolean hasReturnTypeId() {
            return (this.bitField0_ & 16) == 16;
        }

        public int getReturnTypeId() {
            return this.returnTypeId_;
        }

        public java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter> getTypeParameterList() {
            return this.typeParameter_;
        }

        public int getTypeParameterCount() {
            return this.typeParameter_.size();
        }

        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter getTypeParameter(int i) {
            return this.typeParameter_.get(i);
        }

        public boolean hasReceiverType() {
            return (this.bitField0_ & 32) == 32;
        }

        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type getReceiverType() {
            return this.receiverType_;
        }

        public boolean hasReceiverTypeId() {
            return (this.bitField0_ & 64) == 64;
        }

        public int getReceiverTypeId() {
            return this.receiverTypeId_;
        }

        public boolean hasSetterValueParameter() {
            return (this.bitField0_ & 128) == 128;
        }

        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter getSetterValueParameter() {
            return this.setterValueParameter_;
        }

        public boolean hasGetterFlags() {
            return (this.bitField0_ & 256) == 256;
        }

        public int getGetterFlags() {
            return this.getterFlags_;
        }

        public boolean hasSetterFlags() {
            return (this.bitField0_ & 512) == 512;
        }

        public int getSetterFlags() {
            return this.setterFlags_;
        }

        public java.util.List<java.lang.Integer> getVersionRequirementList() {
            return this.versionRequirement_;
        }

        private void initFields() {
            this.flags_ = com.baidu.mapapi.UIMsg.m_AppUI.MSG_COMPASS_DISPLAY;
            this.oldFlags_ = 2054;
            this.name_ = 0;
            this.returnType_ = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.getDefaultInstance();
            this.returnTypeId_ = 0;
            this.typeParameter_ = java.util.Collections.emptyList();
            this.receiverType_ = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.getDefaultInstance();
            this.receiverTypeId_ = 0;
            this.setterValueParameter_ = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter.getDefaultInstance();
            this.getterFlags_ = 0;
            this.setterFlags_ = 0;
            this.versionRequirement_ = java.util.Collections.emptyList();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            if (!hasName()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasReturnType() && !getReturnType().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            for (int i = 0; i < getTypeParameterCount(); i++) {
                if (!getTypeParameter(i).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            if (hasReceiverType() && !getReceiverType().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasSetterValueParameter() && !getSetterValueParameter().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!extensionsAreInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream codedOutputStream) throws java.io.IOException {
            getSerializedSize();
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage<MessageType>.ExtensionWriter extensionWriterNewExtensionWriter = newExtensionWriter();
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.writeInt32(1, this.oldFlags_);
            }
            if ((this.bitField0_ & 4) == 4) {
                codedOutputStream.writeInt32(2, this.name_);
            }
            if ((this.bitField0_ & 8) == 8) {
                codedOutputStream.writeMessage(3, this.returnType_);
            }
            for (int i = 0; i < this.typeParameter_.size(); i++) {
                codedOutputStream.writeMessage(4, this.typeParameter_.get(i));
            }
            if ((this.bitField0_ & 32) == 32) {
                codedOutputStream.writeMessage(5, this.receiverType_);
            }
            if ((this.bitField0_ & 128) == 128) {
                codedOutputStream.writeMessage(6, this.setterValueParameter_);
            }
            if ((this.bitField0_ & 256) == 256) {
                codedOutputStream.writeInt32(7, this.getterFlags_);
            }
            if ((this.bitField0_ & 512) == 512) {
                codedOutputStream.writeInt32(8, this.setterFlags_);
            }
            if ((this.bitField0_ & 16) == 16) {
                codedOutputStream.writeInt32(9, this.returnTypeId_);
            }
            if ((this.bitField0_ & 64) == 64) {
                codedOutputStream.writeInt32(10, this.receiverTypeId_);
            }
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.writeInt32(11, this.flags_);
            }
            for (int i2 = 0; i2 < this.versionRequirement_.size(); i2++) {
                codedOutputStream.writeInt32(31, this.versionRequirement_.get(i2).intValue());
            }
            extensionWriterNewExtensionWriter.writeUntil(19000, codedOutputStream);
            codedOutputStream.writeRawBytes(this.unknownFields);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iComputeInt32Size = (this.bitField0_ & 2) == 2 ? kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeInt32Size(1, this.oldFlags_) + 0 : 0;
            if ((this.bitField0_ & 4) == 4) {
                iComputeInt32Size += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeInt32Size(2, this.name_);
            }
            if ((this.bitField0_ & 8) == 8) {
                iComputeInt32Size += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeMessageSize(3, this.returnType_);
            }
            for (int i2 = 0; i2 < this.typeParameter_.size(); i2++) {
                iComputeInt32Size += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeMessageSize(4, this.typeParameter_.get(i2));
            }
            if ((this.bitField0_ & 32) == 32) {
                iComputeInt32Size += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeMessageSize(5, this.receiverType_);
            }
            if ((this.bitField0_ & 128) == 128) {
                iComputeInt32Size += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeMessageSize(6, this.setterValueParameter_);
            }
            if ((this.bitField0_ & 256) == 256) {
                iComputeInt32Size += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeInt32Size(7, this.getterFlags_);
            }
            if ((this.bitField0_ & 512) == 512) {
                iComputeInt32Size += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeInt32Size(8, this.setterFlags_);
            }
            if ((this.bitField0_ & 16) == 16) {
                iComputeInt32Size += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeInt32Size(9, this.returnTypeId_);
            }
            if ((this.bitField0_ & 64) == 64) {
                iComputeInt32Size += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeInt32Size(10, this.receiverTypeId_);
            }
            if ((this.bitField0_ & 1) == 1) {
                iComputeInt32Size += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeInt32Size(11, this.flags_);
            }
            int iComputeInt32SizeNoTag = 0;
            for (int i3 = 0; i3 < this.versionRequirement_.size(); i3++) {
                iComputeInt32SizeNoTag += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeInt32SizeNoTag(this.versionRequirement_.get(i3).intValue());
            }
            int size = iComputeInt32Size + iComputeInt32SizeNoTag + (getVersionRequirementList().size() * 2) + extensionsSerializedSize() + this.unknownFields.size();
            this.memoizedSerializedSize = size;
            return size;
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property.Builder newBuilder() {
            return kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property.Builder.create();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property.Builder newBuilderForType() {
            return newBuilder();
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property.Builder newBuilder(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property property) {
            return newBuilder().mergeFrom(property);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property.Builder toBuilder() {
            return newBuilder(this);
        }

        public static final class Builder extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property.Builder> implements kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PropertyOrBuilder {
            private int bitField0_;
            private int getterFlags_;
            private int name_;
            private int receiverTypeId_;
            private int returnTypeId_;
            private int setterFlags_;
            private int flags_ = com.baidu.mapapi.UIMsg.m_AppUI.MSG_COMPASS_DISPLAY;
            private int oldFlags_ = 2054;
            private kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type returnType_ = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.getDefaultInstance();
            private java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter> typeParameter_ = java.util.Collections.emptyList();
            private kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type receiverType_ = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.getDefaultInstance();
            private kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter setterValueParameter_ = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter.getDefaultInstance();
            private java.util.List<java.lang.Integer> versionRequirement_ = java.util.Collections.emptyList();

            private void maybeForceBuilderInitialization() {
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property.Builder create() {
                return new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property.Builder();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property.Builder mo1266clone() {
                return create().mergeFrom(buildPartial());
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property getDefaultInstanceForType() {
                return kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property build() {
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property propertyBuildPartial = buildPartial();
                if (propertyBuildPartial.isInitialized()) {
                    return propertyBuildPartial;
                }
                throw newUninitializedMessageException(propertyBuildPartial);
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property buildPartial() {
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property property = new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property(this);
                int i = this.bitField0_;
                int i2 = (i & 1) != 1 ? 0 : 1;
                property.flags_ = this.flags_;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                property.oldFlags_ = this.oldFlags_;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                property.name_ = this.name_;
                if ((i & 8) == 8) {
                    i2 |= 8;
                }
                property.returnType_ = this.returnType_;
                if ((i & 16) == 16) {
                    i2 |= 16;
                }
                property.returnTypeId_ = this.returnTypeId_;
                if ((this.bitField0_ & 32) == 32) {
                    this.typeParameter_ = java.util.Collections.unmodifiableList(this.typeParameter_);
                    this.bitField0_ &= -33;
                }
                property.typeParameter_ = this.typeParameter_;
                if ((i & 64) == 64) {
                    i2 |= 32;
                }
                property.receiverType_ = this.receiverType_;
                if ((i & 128) == 128) {
                    i2 |= 64;
                }
                property.receiverTypeId_ = this.receiverTypeId_;
                if ((i & 256) == 256) {
                    i2 |= 128;
                }
                property.setterValueParameter_ = this.setterValueParameter_;
                if ((i & 512) == 512) {
                    i2 |= 256;
                }
                property.getterFlags_ = this.getterFlags_;
                if ((i & 1024) == 1024) {
                    i2 |= 512;
                }
                property.setterFlags_ = this.setterFlags_;
                if ((this.bitField0_ & 2048) == 2048) {
                    this.versionRequirement_ = java.util.Collections.unmodifiableList(this.versionRequirement_);
                    this.bitField0_ &= -2049;
                }
                property.versionRequirement_ = this.versionRequirement_;
                property.bitField0_ = i2;
                return property;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property.Builder mergeFrom(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property property) {
                if (property == kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property.getDefaultInstance()) {
                    return this;
                }
                if (property.hasFlags()) {
                    setFlags(property.getFlags());
                }
                if (property.hasOldFlags()) {
                    setOldFlags(property.getOldFlags());
                }
                if (property.hasName()) {
                    setName(property.getName());
                }
                if (property.hasReturnType()) {
                    mergeReturnType(property.getReturnType());
                }
                if (property.hasReturnTypeId()) {
                    setReturnTypeId(property.getReturnTypeId());
                }
                if (!property.typeParameter_.isEmpty()) {
                    if (this.typeParameter_.isEmpty()) {
                        this.typeParameter_ = property.typeParameter_;
                        this.bitField0_ &= -33;
                    } else {
                        ensureTypeParameterIsMutable();
                        this.typeParameter_.addAll(property.typeParameter_);
                    }
                }
                if (property.hasReceiverType()) {
                    mergeReceiverType(property.getReceiverType());
                }
                if (property.hasReceiverTypeId()) {
                    setReceiverTypeId(property.getReceiverTypeId());
                }
                if (property.hasSetterValueParameter()) {
                    mergeSetterValueParameter(property.getSetterValueParameter());
                }
                if (property.hasGetterFlags()) {
                    setGetterFlags(property.getGetterFlags());
                }
                if (property.hasSetterFlags()) {
                    setSetterFlags(property.getSetterFlags());
                }
                if (!property.versionRequirement_.isEmpty()) {
                    if (this.versionRequirement_.isEmpty()) {
                        this.versionRequirement_ = property.versionRequirement_;
                        this.bitField0_ &= -2049;
                    } else {
                        ensureVersionRequirementIsMutable();
                        this.versionRequirement_.addAll(property.versionRequirement_);
                    }
                }
                mergeExtensionFields(property);
                setUnknownFields(getUnknownFields().concat(property.unknownFields));
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (!hasName()) {
                    return false;
                }
                if (hasReturnType() && !getReturnType().isInitialized()) {
                    return false;
                }
                for (int i = 0; i < getTypeParameterCount(); i++) {
                    if (!getTypeParameter(i).isInitialized()) {
                        return false;
                    }
                }
                if (!hasReceiverType() || getReceiverType().isInitialized()) {
                    return (!hasSetterValueParameter() || getSetterValueParameter().isInitialized()) && extensionsAreInitialized();
                }
                return false;
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property.Builder mergeFrom(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.lang.Throwable {
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property property = null;
                try {
                    try {
                        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property partialFrom = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (partialFrom != null) {
                            mergeFrom(partialFrom);
                        }
                        return this;
                    } catch (kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException e) {
                        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property property2 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property) e.getUnfinishedMessage();
                        try {
                            throw e;
                        } catch (java.lang.Throwable th) {
                            th = th;
                            property = property2;
                            if (property != null) {
                                mergeFrom(property);
                            }
                            throw th;
                        }
                    }
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    if (property != null) {
                        mergeFrom(property);
                    }
                    throw th;
                }
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property.Builder setFlags(int i) {
                this.bitField0_ |= 1;
                this.flags_ = i;
                return this;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property.Builder setOldFlags(int i) {
                this.bitField0_ |= 2;
                this.oldFlags_ = i;
                return this;
            }

            public boolean hasName() {
                return (this.bitField0_ & 4) == 4;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property.Builder setName(int i) {
                this.bitField0_ |= 4;
                this.name_ = i;
                return this;
            }

            public boolean hasReturnType() {
                return (this.bitField0_ & 8) == 8;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type getReturnType() {
                return this.returnType_;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property.Builder mergeReturnType(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type type) {
                if ((this.bitField0_ & 8) == 8 && this.returnType_ != kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.getDefaultInstance()) {
                    this.returnType_ = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.newBuilder(this.returnType_).mergeFrom(type).buildPartial();
                } else {
                    this.returnType_ = type;
                }
                this.bitField0_ |= 8;
                return this;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property.Builder setReturnTypeId(int i) {
                this.bitField0_ |= 16;
                this.returnTypeId_ = i;
                return this;
            }

            private void ensureTypeParameterIsMutable() {
                if ((this.bitField0_ & 32) != 32) {
                    this.typeParameter_ = new java.util.ArrayList(this.typeParameter_);
                    this.bitField0_ |= 32;
                }
            }

            public int getTypeParameterCount() {
                return this.typeParameter_.size();
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter getTypeParameter(int i) {
                return this.typeParameter_.get(i);
            }

            public boolean hasReceiverType() {
                return (this.bitField0_ & 64) == 64;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type getReceiverType() {
                return this.receiverType_;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property.Builder mergeReceiverType(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type type) {
                if ((this.bitField0_ & 64) == 64 && this.receiverType_ != kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.getDefaultInstance()) {
                    this.receiverType_ = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.newBuilder(this.receiverType_).mergeFrom(type).buildPartial();
                } else {
                    this.receiverType_ = type;
                }
                this.bitField0_ |= 64;
                return this;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property.Builder setReceiverTypeId(int i) {
                this.bitField0_ |= 128;
                this.receiverTypeId_ = i;
                return this;
            }

            public boolean hasSetterValueParameter() {
                return (this.bitField0_ & 256) == 256;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter getSetterValueParameter() {
                return this.setterValueParameter_;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property.Builder mergeSetterValueParameter(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter valueParameter) {
                if ((this.bitField0_ & 256) == 256 && this.setterValueParameter_ != kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter.getDefaultInstance()) {
                    this.setterValueParameter_ = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter.newBuilder(this.setterValueParameter_).mergeFrom(valueParameter).buildPartial();
                } else {
                    this.setterValueParameter_ = valueParameter;
                }
                this.bitField0_ |= 256;
                return this;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property.Builder setGetterFlags(int i) {
                this.bitField0_ |= 512;
                this.getterFlags_ = i;
                return this;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property.Builder setSetterFlags(int i) {
                this.bitField0_ |= 1024;
                this.setterFlags_ = i;
                return this;
            }

            private void ensureVersionRequirementIsMutable() {
                if ((this.bitField0_ & 2048) != 2048) {
                    this.versionRequirement_ = new java.util.ArrayList(this.versionRequirement_);
                    this.bitField0_ |= 2048;
                }
            }
        }
    }

    public static final class ValueParameter extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter> implements kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameterOrBuilder {
        public static kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter> PARSER = new kotlin.reflect.jvm.internal.impl.protobuf.AbstractParser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter>() { // from class: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter.1
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter parsePartialFrom(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
                return new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter(codedInputStream, extensionRegistryLite);
            }
        };
        private static final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter defaultInstance;
        private int bitField0_;
        private int flags_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private int name_;
        private int typeId_;
        private kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type type_;
        private final kotlin.reflect.jvm.internal.impl.protobuf.ByteString unknownFields;
        private int varargElementTypeId_;
        private kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type varargElementType_;

        private ValueParameter(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter, ?> extendableBuilder) {
            super(extendableBuilder);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = extendableBuilder.getUnknownFields();
        }

        private ValueParameter(boolean z) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = kotlin.reflect.jvm.internal.impl.protobuf.ByteString.EMPTY;
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter getDefaultInstance() {
            return defaultInstance;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter getDefaultInstanceForType() {
            return defaultInstance;
        }

        private ValueParameter(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Builder builder;
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            initFields();
            kotlin.reflect.jvm.internal.impl.protobuf.ByteString.Output outputNewOutput = kotlin.reflect.jvm.internal.impl.protobuf.ByteString.newOutput();
            kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream codedOutputStreamNewInstance = kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.newInstance(outputNewOutput, 1);
            boolean z = false;
            while (!z) {
                try {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag == 8) {
                                    this.bitField0_ |= 1;
                                    this.flags_ = codedInputStream.readInt32();
                                } else if (tag != 16) {
                                    if (tag == 26) {
                                        builder = (this.bitField0_ & 4) == 4 ? this.type_.toBuilder() : null;
                                        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type type = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type) codedInputStream.readMessage(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.PARSER, extensionRegistryLite);
                                        this.type_ = type;
                                        if (builder != null) {
                                            builder.mergeFrom(type);
                                            this.type_ = builder.buildPartial();
                                        }
                                        this.bitField0_ |= 4;
                                    } else if (tag == 34) {
                                        builder = (this.bitField0_ & 16) == 16 ? this.varargElementType_.toBuilder() : null;
                                        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type type2 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type) codedInputStream.readMessage(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.PARSER, extensionRegistryLite);
                                        this.varargElementType_ = type2;
                                        if (builder != null) {
                                            builder.mergeFrom(type2);
                                            this.varargElementType_ = builder.buildPartial();
                                        }
                                        this.bitField0_ |= 16;
                                    } else if (tag == 40) {
                                        this.bitField0_ |= 8;
                                        this.typeId_ = codedInputStream.readInt32();
                                    } else if (tag != 48) {
                                        if (!parseUnknownField(codedInputStream, codedOutputStreamNewInstance, extensionRegistryLite, tag)) {
                                        }
                                    } else {
                                        this.bitField0_ |= 32;
                                        this.varargElementTypeId_ = codedInputStream.readInt32();
                                    }
                                } else {
                                    this.bitField0_ |= 2;
                                    this.name_ = codedInputStream.readInt32();
                                }
                            }
                            z = true;
                        } catch (java.io.IOException e) {
                            throw new kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException(e.getMessage()).setUnfinishedMessage(this);
                        }
                    } catch (kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException e2) {
                        throw e2.setUnfinishedMessage(this);
                    }
                } catch (java.lang.Throwable th) {
                    try {
                        codedOutputStreamNewInstance.flush();
                    } catch (java.io.IOException unused) {
                    } finally {
                        this.unknownFields = outputNewOutput.toByteString();
                    }
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            try {
                codedOutputStreamNewInstance.flush();
            } catch (java.io.IOException unused2) {
            } finally {
                this.unknownFields = outputNewOutput.toByteString();
            }
            makeExtensionsImmutable();
        }

        static {
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter valueParameter = new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter(true);
            defaultInstance = valueParameter;
            valueParameter.initFields();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter> getParserForType() {
            return PARSER;
        }

        public boolean hasFlags() {
            return (this.bitField0_ & 1) == 1;
        }

        public int getFlags() {
            return this.flags_;
        }

        public boolean hasName() {
            return (this.bitField0_ & 2) == 2;
        }

        public int getName() {
            return this.name_;
        }

        public boolean hasType() {
            return (this.bitField0_ & 4) == 4;
        }

        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type getType() {
            return this.type_;
        }

        public boolean hasTypeId() {
            return (this.bitField0_ & 8) == 8;
        }

        public int getTypeId() {
            return this.typeId_;
        }

        public boolean hasVarargElementType() {
            return (this.bitField0_ & 16) == 16;
        }

        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type getVarargElementType() {
            return this.varargElementType_;
        }

        public boolean hasVarargElementTypeId() {
            return (this.bitField0_ & 32) == 32;
        }

        public int getVarargElementTypeId() {
            return this.varargElementTypeId_;
        }

        private void initFields() {
            this.flags_ = 0;
            this.name_ = 0;
            this.type_ = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.getDefaultInstance();
            this.typeId_ = 0;
            this.varargElementType_ = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.getDefaultInstance();
            this.varargElementTypeId_ = 0;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            if (!hasName()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasType() && !getType().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasVarargElementType() && !getVarargElementType().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!extensionsAreInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream codedOutputStream) throws java.io.IOException {
            getSerializedSize();
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage<MessageType>.ExtensionWriter extensionWriterNewExtensionWriter = newExtensionWriter();
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.writeInt32(1, this.flags_);
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.writeInt32(2, this.name_);
            }
            if ((this.bitField0_ & 4) == 4) {
                codedOutputStream.writeMessage(3, this.type_);
            }
            if ((this.bitField0_ & 16) == 16) {
                codedOutputStream.writeMessage(4, this.varargElementType_);
            }
            if ((this.bitField0_ & 8) == 8) {
                codedOutputStream.writeInt32(5, this.typeId_);
            }
            if ((this.bitField0_ & 32) == 32) {
                codedOutputStream.writeInt32(6, this.varargElementTypeId_);
            }
            extensionWriterNewExtensionWriter.writeUntil(200, codedOutputStream);
            codedOutputStream.writeRawBytes(this.unknownFields);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iComputeInt32Size = (this.bitField0_ & 1) == 1 ? 0 + kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeInt32Size(1, this.flags_) : 0;
            if ((this.bitField0_ & 2) == 2) {
                iComputeInt32Size += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeInt32Size(2, this.name_);
            }
            if ((this.bitField0_ & 4) == 4) {
                iComputeInt32Size += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeMessageSize(3, this.type_);
            }
            if ((this.bitField0_ & 16) == 16) {
                iComputeInt32Size += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeMessageSize(4, this.varargElementType_);
            }
            if ((this.bitField0_ & 8) == 8) {
                iComputeInt32Size += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeInt32Size(5, this.typeId_);
            }
            if ((this.bitField0_ & 32) == 32) {
                iComputeInt32Size += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeInt32Size(6, this.varargElementTypeId_);
            }
            int iExtensionsSerializedSize = iComputeInt32Size + extensionsSerializedSize() + this.unknownFields.size();
            this.memoizedSerializedSize = iExtensionsSerializedSize;
            return iExtensionsSerializedSize;
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter.Builder newBuilder() {
            return kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter.Builder.create();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter.Builder newBuilderForType() {
            return newBuilder();
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter.Builder newBuilder(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter valueParameter) {
            return newBuilder().mergeFrom(valueParameter);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter.Builder toBuilder() {
            return newBuilder(this);
        }

        public static final class Builder extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter.Builder> implements kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameterOrBuilder {
            private int bitField0_;
            private int flags_;
            private int name_;
            private int typeId_;
            private int varargElementTypeId_;
            private kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type type_ = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.getDefaultInstance();
            private kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type varargElementType_ = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.getDefaultInstance();

            private void maybeForceBuilderInitialization() {
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter.Builder create() {
                return new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter.Builder();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter.Builder mo1266clone() {
                return create().mergeFrom(buildPartial());
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter getDefaultInstanceForType() {
                return kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter build() {
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter valueParameterBuildPartial = buildPartial();
                if (valueParameterBuildPartial.isInitialized()) {
                    return valueParameterBuildPartial;
                }
                throw newUninitializedMessageException(valueParameterBuildPartial);
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter buildPartial() {
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter valueParameter = new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter(this);
                int i = this.bitField0_;
                int i2 = (i & 1) != 1 ? 0 : 1;
                valueParameter.flags_ = this.flags_;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                valueParameter.name_ = this.name_;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                valueParameter.type_ = this.type_;
                if ((i & 8) == 8) {
                    i2 |= 8;
                }
                valueParameter.typeId_ = this.typeId_;
                if ((i & 16) == 16) {
                    i2 |= 16;
                }
                valueParameter.varargElementType_ = this.varargElementType_;
                if ((i & 32) == 32) {
                    i2 |= 32;
                }
                valueParameter.varargElementTypeId_ = this.varargElementTypeId_;
                valueParameter.bitField0_ = i2;
                return valueParameter;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter.Builder mergeFrom(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter valueParameter) {
                if (valueParameter == kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter.getDefaultInstance()) {
                    return this;
                }
                if (valueParameter.hasFlags()) {
                    setFlags(valueParameter.getFlags());
                }
                if (valueParameter.hasName()) {
                    setName(valueParameter.getName());
                }
                if (valueParameter.hasType()) {
                    mergeType(valueParameter.getType());
                }
                if (valueParameter.hasTypeId()) {
                    setTypeId(valueParameter.getTypeId());
                }
                if (valueParameter.hasVarargElementType()) {
                    mergeVarargElementType(valueParameter.getVarargElementType());
                }
                if (valueParameter.hasVarargElementTypeId()) {
                    setVarargElementTypeId(valueParameter.getVarargElementTypeId());
                }
                mergeExtensionFields(valueParameter);
                setUnknownFields(getUnknownFields().concat(valueParameter.unknownFields));
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (!hasName()) {
                    return false;
                }
                if (!hasType() || getType().isInitialized()) {
                    return (!hasVarargElementType() || getVarargElementType().isInitialized()) && extensionsAreInitialized();
                }
                return false;
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter.Builder mergeFrom(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.lang.Throwable {
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter valueParameter = null;
                try {
                    try {
                        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter partialFrom = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (partialFrom != null) {
                            mergeFrom(partialFrom);
                        }
                        return this;
                    } catch (kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException e) {
                        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter valueParameter2 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter) e.getUnfinishedMessage();
                        try {
                            throw e;
                        } catch (java.lang.Throwable th) {
                            th = th;
                            valueParameter = valueParameter2;
                            if (valueParameter != null) {
                                mergeFrom(valueParameter);
                            }
                            throw th;
                        }
                    }
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    if (valueParameter != null) {
                        mergeFrom(valueParameter);
                    }
                    throw th;
                }
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter.Builder setFlags(int i) {
                this.bitField0_ |= 1;
                this.flags_ = i;
                return this;
            }

            public boolean hasName() {
                return (this.bitField0_ & 2) == 2;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter.Builder setName(int i) {
                this.bitField0_ |= 2;
                this.name_ = i;
                return this;
            }

            public boolean hasType() {
                return (this.bitField0_ & 4) == 4;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type getType() {
                return this.type_;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter.Builder mergeType(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type type) {
                if ((this.bitField0_ & 4) == 4 && this.type_ != kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.getDefaultInstance()) {
                    this.type_ = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.newBuilder(this.type_).mergeFrom(type).buildPartial();
                } else {
                    this.type_ = type;
                }
                this.bitField0_ |= 4;
                return this;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter.Builder setTypeId(int i) {
                this.bitField0_ |= 8;
                this.typeId_ = i;
                return this;
            }

            public boolean hasVarargElementType() {
                return (this.bitField0_ & 16) == 16;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type getVarargElementType() {
                return this.varargElementType_;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter.Builder mergeVarargElementType(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type type) {
                if ((this.bitField0_ & 16) == 16 && this.varargElementType_ != kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.getDefaultInstance()) {
                    this.varargElementType_ = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.newBuilder(this.varargElementType_).mergeFrom(type).buildPartial();
                } else {
                    this.varargElementType_ = type;
                }
                this.bitField0_ |= 16;
                return this;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter.Builder setVarargElementTypeId(int i) {
                this.bitField0_ |= 32;
                this.varargElementTypeId_ = i;
                return this;
            }
        }
    }

    public static final class TypeAlias extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias> implements kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAliasOrBuilder {
        public static kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias> PARSER = new kotlin.reflect.jvm.internal.impl.protobuf.AbstractParser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias>() { // from class: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias.1
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias parsePartialFrom(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
                return new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias(codedInputStream, extensionRegistryLite);
            }
        };
        private static final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias defaultInstance;
        private java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation> annotation_;
        private int bitField0_;
        private int expandedTypeId_;
        private kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type expandedType_;
        private int flags_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private int name_;
        private java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter> typeParameter_;
        private int underlyingTypeId_;
        private kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type underlyingType_;
        private final kotlin.reflect.jvm.internal.impl.protobuf.ByteString unknownFields;
        private java.util.List<java.lang.Integer> versionRequirement_;

        private TypeAlias(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias, ?> extendableBuilder) {
            super(extendableBuilder);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = extendableBuilder.getUnknownFields();
        }

        private TypeAlias(boolean z) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = kotlin.reflect.jvm.internal.impl.protobuf.ByteString.EMPTY;
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias getDefaultInstance() {
            return defaultInstance;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias getDefaultInstanceForType() {
            return defaultInstance;
        }

        private TypeAlias(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Builder builder;
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            initFields();
            kotlin.reflect.jvm.internal.impl.protobuf.ByteString.Output outputNewOutput = kotlin.reflect.jvm.internal.impl.protobuf.ByteString.newOutput();
            kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream codedOutputStreamNewInstance = kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.newInstance(outputNewOutput, 1);
            boolean z = false;
            int i = 0;
            while (!z) {
                try {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            switch (tag) {
                                case 0:
                                    break;
                                case 8:
                                    this.bitField0_ |= 1;
                                    this.flags_ = codedInputStream.readInt32();
                                    continue;
                                case 16:
                                    this.bitField0_ |= 2;
                                    this.name_ = codedInputStream.readInt32();
                                    continue;
                                case 26:
                                    if ((i & 4) != 4) {
                                        this.typeParameter_ = new java.util.ArrayList();
                                        i |= 4;
                                    }
                                    this.typeParameter_.add((kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter) codedInputStream.readMessage(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter.PARSER, extensionRegistryLite));
                                    continue;
                                case 34:
                                    builder = (this.bitField0_ & 4) == 4 ? this.underlyingType_.toBuilder() : null;
                                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type type = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type) codedInputStream.readMessage(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.PARSER, extensionRegistryLite);
                                    this.underlyingType_ = type;
                                    if (builder != null) {
                                        builder.mergeFrom(type);
                                        this.underlyingType_ = builder.buildPartial();
                                    }
                                    this.bitField0_ |= 4;
                                    continue;
                                case 40:
                                    this.bitField0_ |= 8;
                                    this.underlyingTypeId_ = codedInputStream.readInt32();
                                    continue;
                                case 50:
                                    builder = (this.bitField0_ & 16) == 16 ? this.expandedType_.toBuilder() : null;
                                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type type2 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type) codedInputStream.readMessage(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.PARSER, extensionRegistryLite);
                                    this.expandedType_ = type2;
                                    if (builder != null) {
                                        builder.mergeFrom(type2);
                                        this.expandedType_ = builder.buildPartial();
                                    }
                                    this.bitField0_ |= 16;
                                    continue;
                                case 56:
                                    this.bitField0_ |= 32;
                                    this.expandedTypeId_ = codedInputStream.readInt32();
                                    continue;
                                case 66:
                                    if ((i & 128) != 128) {
                                        this.annotation_ = new java.util.ArrayList();
                                        i |= 128;
                                    }
                                    this.annotation_.add((kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation) codedInputStream.readMessage(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.PARSER, extensionRegistryLite));
                                    continue;
                                case 248:
                                    if ((i & 256) != 256) {
                                        this.versionRequirement_ = new java.util.ArrayList();
                                        i |= 256;
                                    }
                                    this.versionRequirement_.add(java.lang.Integer.valueOf(codedInputStream.readInt32()));
                                    continue;
                                case 250:
                                    int iPushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                    if ((i & 256) != 256 && codedInputStream.getBytesUntilLimit() > 0) {
                                        this.versionRequirement_ = new java.util.ArrayList();
                                        i |= 256;
                                    }
                                    while (codedInputStream.getBytesUntilLimit() > 0) {
                                        this.versionRequirement_.add(java.lang.Integer.valueOf(codedInputStream.readInt32()));
                                    }
                                    codedInputStream.popLimit(iPushLimit);
                                    continue;
                                default:
                                    if (!parseUnknownField(codedInputStream, codedOutputStreamNewInstance, extensionRegistryLite, tag)) {
                                        break;
                                    }
                                    break;
                            }
                            z = true;
                        } catch (java.io.IOException e) {
                            throw new kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException(e.getMessage()).setUnfinishedMessage(this);
                        }
                    } catch (kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException e2) {
                        throw e2.setUnfinishedMessage(this);
                    }
                } catch (java.lang.Throwable th) {
                    if ((i & 4) == 4) {
                        this.typeParameter_ = java.util.Collections.unmodifiableList(this.typeParameter_);
                    }
                    if ((i & 128) == 128) {
                        this.annotation_ = java.util.Collections.unmodifiableList(this.annotation_);
                    }
                    if ((i & 256) == 256) {
                        this.versionRequirement_ = java.util.Collections.unmodifiableList(this.versionRequirement_);
                    }
                    try {
                        codedOutputStreamNewInstance.flush();
                    } catch (java.io.IOException unused) {
                    } finally {
                        this.unknownFields = outputNewOutput.toByteString();
                    }
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            if ((i & 4) == 4) {
                this.typeParameter_ = java.util.Collections.unmodifiableList(this.typeParameter_);
            }
            if ((i & 128) == 128) {
                this.annotation_ = java.util.Collections.unmodifiableList(this.annotation_);
            }
            if ((i & 256) == 256) {
                this.versionRequirement_ = java.util.Collections.unmodifiableList(this.versionRequirement_);
            }
            try {
                codedOutputStreamNewInstance.flush();
            } catch (java.io.IOException unused2) {
            } finally {
                this.unknownFields = outputNewOutput.toByteString();
            }
            makeExtensionsImmutable();
        }

        static {
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias typeAlias = new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias(true);
            defaultInstance = typeAlias;
            typeAlias.initFields();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias> getParserForType() {
            return PARSER;
        }

        public boolean hasFlags() {
            return (this.bitField0_ & 1) == 1;
        }

        public int getFlags() {
            return this.flags_;
        }

        public boolean hasName() {
            return (this.bitField0_ & 2) == 2;
        }

        public int getName() {
            return this.name_;
        }

        public java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter> getTypeParameterList() {
            return this.typeParameter_;
        }

        public int getTypeParameterCount() {
            return this.typeParameter_.size();
        }

        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter getTypeParameter(int i) {
            return this.typeParameter_.get(i);
        }

        public boolean hasUnderlyingType() {
            return (this.bitField0_ & 4) == 4;
        }

        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type getUnderlyingType() {
            return this.underlyingType_;
        }

        public boolean hasUnderlyingTypeId() {
            return (this.bitField0_ & 8) == 8;
        }

        public int getUnderlyingTypeId() {
            return this.underlyingTypeId_;
        }

        public boolean hasExpandedType() {
            return (this.bitField0_ & 16) == 16;
        }

        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type getExpandedType() {
            return this.expandedType_;
        }

        public boolean hasExpandedTypeId() {
            return (this.bitField0_ & 32) == 32;
        }

        public int getExpandedTypeId() {
            return this.expandedTypeId_;
        }

        public java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation> getAnnotationList() {
            return this.annotation_;
        }

        public int getAnnotationCount() {
            return this.annotation_.size();
        }

        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation getAnnotation(int i) {
            return this.annotation_.get(i);
        }

        public java.util.List<java.lang.Integer> getVersionRequirementList() {
            return this.versionRequirement_;
        }

        private void initFields() {
            this.flags_ = 6;
            this.name_ = 0;
            this.typeParameter_ = java.util.Collections.emptyList();
            this.underlyingType_ = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.getDefaultInstance();
            this.underlyingTypeId_ = 0;
            this.expandedType_ = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.getDefaultInstance();
            this.expandedTypeId_ = 0;
            this.annotation_ = java.util.Collections.emptyList();
            this.versionRequirement_ = java.util.Collections.emptyList();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            if (!hasName()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            for (int i = 0; i < getTypeParameterCount(); i++) {
                if (!getTypeParameter(i).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            if (hasUnderlyingType() && !getUnderlyingType().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasExpandedType() && !getExpandedType().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            for (int i2 = 0; i2 < getAnnotationCount(); i2++) {
                if (!getAnnotation(i2).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            if (!extensionsAreInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream codedOutputStream) throws java.io.IOException {
            getSerializedSize();
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage<MessageType>.ExtensionWriter extensionWriterNewExtensionWriter = newExtensionWriter();
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.writeInt32(1, this.flags_);
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.writeInt32(2, this.name_);
            }
            for (int i = 0; i < this.typeParameter_.size(); i++) {
                codedOutputStream.writeMessage(3, this.typeParameter_.get(i));
            }
            if ((this.bitField0_ & 4) == 4) {
                codedOutputStream.writeMessage(4, this.underlyingType_);
            }
            if ((this.bitField0_ & 8) == 8) {
                codedOutputStream.writeInt32(5, this.underlyingTypeId_);
            }
            if ((this.bitField0_ & 16) == 16) {
                codedOutputStream.writeMessage(6, this.expandedType_);
            }
            if ((this.bitField0_ & 32) == 32) {
                codedOutputStream.writeInt32(7, this.expandedTypeId_);
            }
            for (int i2 = 0; i2 < this.annotation_.size(); i2++) {
                codedOutputStream.writeMessage(8, this.annotation_.get(i2));
            }
            for (int i3 = 0; i3 < this.versionRequirement_.size(); i3++) {
                codedOutputStream.writeInt32(31, this.versionRequirement_.get(i3).intValue());
            }
            extensionWriterNewExtensionWriter.writeUntil(200, codedOutputStream);
            codedOutputStream.writeRawBytes(this.unknownFields);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iComputeInt32Size = (this.bitField0_ & 1) == 1 ? kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeInt32Size(1, this.flags_) + 0 : 0;
            if ((this.bitField0_ & 2) == 2) {
                iComputeInt32Size += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeInt32Size(2, this.name_);
            }
            for (int i2 = 0; i2 < this.typeParameter_.size(); i2++) {
                iComputeInt32Size += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeMessageSize(3, this.typeParameter_.get(i2));
            }
            if ((this.bitField0_ & 4) == 4) {
                iComputeInt32Size += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeMessageSize(4, this.underlyingType_);
            }
            if ((this.bitField0_ & 8) == 8) {
                iComputeInt32Size += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeInt32Size(5, this.underlyingTypeId_);
            }
            if ((this.bitField0_ & 16) == 16) {
                iComputeInt32Size += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeMessageSize(6, this.expandedType_);
            }
            if ((this.bitField0_ & 32) == 32) {
                iComputeInt32Size += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeInt32Size(7, this.expandedTypeId_);
            }
            for (int i3 = 0; i3 < this.annotation_.size(); i3++) {
                iComputeInt32Size += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeMessageSize(8, this.annotation_.get(i3));
            }
            int iComputeInt32SizeNoTag = 0;
            for (int i4 = 0; i4 < this.versionRequirement_.size(); i4++) {
                iComputeInt32SizeNoTag += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeInt32SizeNoTag(this.versionRequirement_.get(i4).intValue());
            }
            int size = iComputeInt32Size + iComputeInt32SizeNoTag + (getVersionRequirementList().size() * 2) + extensionsSerializedSize() + this.unknownFields.size();
            this.memoizedSerializedSize = size;
            return size;
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias parseDelimitedFrom(java.io.InputStream inputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias.Builder newBuilder() {
            return kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias.Builder.create();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias.Builder newBuilderForType() {
            return newBuilder();
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias.Builder newBuilder(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias typeAlias) {
            return newBuilder().mergeFrom(typeAlias);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias.Builder toBuilder() {
            return newBuilder(this);
        }

        public static final class Builder extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias.Builder> implements kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAliasOrBuilder {
            private int bitField0_;
            private int expandedTypeId_;
            private int name_;
            private int underlyingTypeId_;
            private int flags_ = 6;
            private java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter> typeParameter_ = java.util.Collections.emptyList();
            private kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type underlyingType_ = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.getDefaultInstance();
            private kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type expandedType_ = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.getDefaultInstance();
            private java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation> annotation_ = java.util.Collections.emptyList();
            private java.util.List<java.lang.Integer> versionRequirement_ = java.util.Collections.emptyList();

            private void maybeForceBuilderInitialization() {
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias.Builder create() {
                return new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias.Builder();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias.Builder mo1266clone() {
                return create().mergeFrom(buildPartial());
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias getDefaultInstanceForType() {
                return kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias build() {
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias typeAliasBuildPartial = buildPartial();
                if (typeAliasBuildPartial.isInitialized()) {
                    return typeAliasBuildPartial;
                }
                throw newUninitializedMessageException(typeAliasBuildPartial);
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias buildPartial() {
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias typeAlias = new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias(this);
                int i = this.bitField0_;
                int i2 = (i & 1) != 1 ? 0 : 1;
                typeAlias.flags_ = this.flags_;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                typeAlias.name_ = this.name_;
                if ((this.bitField0_ & 4) == 4) {
                    this.typeParameter_ = java.util.Collections.unmodifiableList(this.typeParameter_);
                    this.bitField0_ &= -5;
                }
                typeAlias.typeParameter_ = this.typeParameter_;
                if ((i & 8) == 8) {
                    i2 |= 4;
                }
                typeAlias.underlyingType_ = this.underlyingType_;
                if ((i & 16) == 16) {
                    i2 |= 8;
                }
                typeAlias.underlyingTypeId_ = this.underlyingTypeId_;
                if ((i & 32) == 32) {
                    i2 |= 16;
                }
                typeAlias.expandedType_ = this.expandedType_;
                if ((i & 64) == 64) {
                    i2 |= 32;
                }
                typeAlias.expandedTypeId_ = this.expandedTypeId_;
                if ((this.bitField0_ & 128) == 128) {
                    this.annotation_ = java.util.Collections.unmodifiableList(this.annotation_);
                    this.bitField0_ &= -129;
                }
                typeAlias.annotation_ = this.annotation_;
                if ((this.bitField0_ & 256) == 256) {
                    this.versionRequirement_ = java.util.Collections.unmodifiableList(this.versionRequirement_);
                    this.bitField0_ &= -257;
                }
                typeAlias.versionRequirement_ = this.versionRequirement_;
                typeAlias.bitField0_ = i2;
                return typeAlias;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias.Builder mergeFrom(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias typeAlias) {
                if (typeAlias == kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias.getDefaultInstance()) {
                    return this;
                }
                if (typeAlias.hasFlags()) {
                    setFlags(typeAlias.getFlags());
                }
                if (typeAlias.hasName()) {
                    setName(typeAlias.getName());
                }
                if (!typeAlias.typeParameter_.isEmpty()) {
                    if (this.typeParameter_.isEmpty()) {
                        this.typeParameter_ = typeAlias.typeParameter_;
                        this.bitField0_ &= -5;
                    } else {
                        ensureTypeParameterIsMutable();
                        this.typeParameter_.addAll(typeAlias.typeParameter_);
                    }
                }
                if (typeAlias.hasUnderlyingType()) {
                    mergeUnderlyingType(typeAlias.getUnderlyingType());
                }
                if (typeAlias.hasUnderlyingTypeId()) {
                    setUnderlyingTypeId(typeAlias.getUnderlyingTypeId());
                }
                if (typeAlias.hasExpandedType()) {
                    mergeExpandedType(typeAlias.getExpandedType());
                }
                if (typeAlias.hasExpandedTypeId()) {
                    setExpandedTypeId(typeAlias.getExpandedTypeId());
                }
                if (!typeAlias.annotation_.isEmpty()) {
                    if (this.annotation_.isEmpty()) {
                        this.annotation_ = typeAlias.annotation_;
                        this.bitField0_ &= -129;
                    } else {
                        ensureAnnotationIsMutable();
                        this.annotation_.addAll(typeAlias.annotation_);
                    }
                }
                if (!typeAlias.versionRequirement_.isEmpty()) {
                    if (this.versionRequirement_.isEmpty()) {
                        this.versionRequirement_ = typeAlias.versionRequirement_;
                        this.bitField0_ &= -257;
                    } else {
                        ensureVersionRequirementIsMutable();
                        this.versionRequirement_.addAll(typeAlias.versionRequirement_);
                    }
                }
                mergeExtensionFields(typeAlias);
                setUnknownFields(getUnknownFields().concat(typeAlias.unknownFields));
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (!hasName()) {
                    return false;
                }
                for (int i = 0; i < getTypeParameterCount(); i++) {
                    if (!getTypeParameter(i).isInitialized()) {
                        return false;
                    }
                }
                if (hasUnderlyingType() && !getUnderlyingType().isInitialized()) {
                    return false;
                }
                if (hasExpandedType() && !getExpandedType().isInitialized()) {
                    return false;
                }
                for (int i2 = 0; i2 < getAnnotationCount(); i2++) {
                    if (!getAnnotation(i2).isInitialized()) {
                        return false;
                    }
                }
                return extensionsAreInitialized();
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias.Builder mergeFrom(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.lang.Throwable {
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias typeAlias = null;
                try {
                    try {
                        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias partialFrom = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (partialFrom != null) {
                            mergeFrom(partialFrom);
                        }
                        return this;
                    } catch (kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException e) {
                        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias typeAlias2 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias) e.getUnfinishedMessage();
                        try {
                            throw e;
                        } catch (java.lang.Throwable th) {
                            th = th;
                            typeAlias = typeAlias2;
                            if (typeAlias != null) {
                                mergeFrom(typeAlias);
                            }
                            throw th;
                        }
                    }
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    if (typeAlias != null) {
                        mergeFrom(typeAlias);
                    }
                    throw th;
                }
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias.Builder setFlags(int i) {
                this.bitField0_ |= 1;
                this.flags_ = i;
                return this;
            }

            public boolean hasName() {
                return (this.bitField0_ & 2) == 2;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias.Builder setName(int i) {
                this.bitField0_ |= 2;
                this.name_ = i;
                return this;
            }

            private void ensureTypeParameterIsMutable() {
                if ((this.bitField0_ & 4) != 4) {
                    this.typeParameter_ = new java.util.ArrayList(this.typeParameter_);
                    this.bitField0_ |= 4;
                }
            }

            public int getTypeParameterCount() {
                return this.typeParameter_.size();
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter getTypeParameter(int i) {
                return this.typeParameter_.get(i);
            }

            public boolean hasUnderlyingType() {
                return (this.bitField0_ & 8) == 8;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type getUnderlyingType() {
                return this.underlyingType_;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias.Builder mergeUnderlyingType(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type type) {
                if ((this.bitField0_ & 8) == 8 && this.underlyingType_ != kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.getDefaultInstance()) {
                    this.underlyingType_ = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.newBuilder(this.underlyingType_).mergeFrom(type).buildPartial();
                } else {
                    this.underlyingType_ = type;
                }
                this.bitField0_ |= 8;
                return this;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias.Builder setUnderlyingTypeId(int i) {
                this.bitField0_ |= 16;
                this.underlyingTypeId_ = i;
                return this;
            }

            public boolean hasExpandedType() {
                return (this.bitField0_ & 32) == 32;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type getExpandedType() {
                return this.expandedType_;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias.Builder mergeExpandedType(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type type) {
                if ((this.bitField0_ & 32) == 32 && this.expandedType_ != kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.getDefaultInstance()) {
                    this.expandedType_ = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.newBuilder(this.expandedType_).mergeFrom(type).buildPartial();
                } else {
                    this.expandedType_ = type;
                }
                this.bitField0_ |= 32;
                return this;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias.Builder setExpandedTypeId(int i) {
                this.bitField0_ |= 64;
                this.expandedTypeId_ = i;
                return this;
            }

            private void ensureAnnotationIsMutable() {
                if ((this.bitField0_ & 128) != 128) {
                    this.annotation_ = new java.util.ArrayList(this.annotation_);
                    this.bitField0_ |= 128;
                }
            }

            public int getAnnotationCount() {
                return this.annotation_.size();
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation getAnnotation(int i) {
                return this.annotation_.get(i);
            }

            private void ensureVersionRequirementIsMutable() {
                if ((this.bitField0_ & 256) != 256) {
                    this.versionRequirement_ = new java.util.ArrayList(this.versionRequirement_);
                    this.bitField0_ |= 256;
                }
            }
        }
    }

    public static final class EnumEntry extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry> implements kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntryOrBuilder {
        public static kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry> PARSER = new kotlin.reflect.jvm.internal.impl.protobuf.AbstractParser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry>() { // from class: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry.1
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry parsePartialFrom(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
                return new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry(codedInputStream, extensionRegistryLite);
            }
        };
        private static final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry defaultInstance;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private int name_;
        private final kotlin.reflect.jvm.internal.impl.protobuf.ByteString unknownFields;

        private EnumEntry(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry, ?> extendableBuilder) {
            super(extendableBuilder);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = extendableBuilder.getUnknownFields();
        }

        private EnumEntry(boolean z) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = kotlin.reflect.jvm.internal.impl.protobuf.ByteString.EMPTY;
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry getDefaultInstance() {
            return defaultInstance;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry getDefaultInstanceForType() {
            return defaultInstance;
        }

        private EnumEntry(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            initFields();
            kotlin.reflect.jvm.internal.impl.protobuf.ByteString.Output outputNewOutput = kotlin.reflect.jvm.internal.impl.protobuf.ByteString.newOutput();
            kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream codedOutputStreamNewInstance = kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.newInstance(outputNewOutput, 1);
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        if (tag != 0) {
                            if (tag != 8) {
                                if (!parseUnknownField(codedInputStream, codedOutputStreamNewInstance, extensionRegistryLite, tag)) {
                                }
                            } else {
                                this.bitField0_ |= 1;
                                this.name_ = codedInputStream.readInt32();
                            }
                        }
                        z = true;
                    } catch (kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException e) {
                        throw e.setUnfinishedMessage(this);
                    } catch (java.io.IOException e2) {
                        throw new kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                    }
                } catch (java.lang.Throwable th) {
                    try {
                        codedOutputStreamNewInstance.flush();
                    } catch (java.io.IOException unused) {
                    } finally {
                        this.unknownFields = outputNewOutput.toByteString();
                    }
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            try {
                codedOutputStreamNewInstance.flush();
            } catch (java.io.IOException unused2) {
            } finally {
                this.unknownFields = outputNewOutput.toByteString();
            }
            makeExtensionsImmutable();
        }

        static {
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry enumEntry = new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry(true);
            defaultInstance = enumEntry;
            enumEntry.initFields();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry> getParserForType() {
            return PARSER;
        }

        public boolean hasName() {
            return (this.bitField0_ & 1) == 1;
        }

        public int getName() {
            return this.name_;
        }

        private void initFields() {
            this.name_ = 0;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            if (!extensionsAreInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream codedOutputStream) throws java.io.IOException {
            getSerializedSize();
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage<MessageType>.ExtensionWriter extensionWriterNewExtensionWriter = newExtensionWriter();
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.writeInt32(1, this.name_);
            }
            extensionWriterNewExtensionWriter.writeUntil(200, codedOutputStream);
            codedOutputStream.writeRawBytes(this.unknownFields);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iComputeInt32Size = ((this.bitField0_ & 1) == 1 ? 0 + kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeInt32Size(1, this.name_) : 0) + extensionsSerializedSize() + this.unknownFields.size();
            this.memoizedSerializedSize = iComputeInt32Size;
            return iComputeInt32Size;
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry.Builder newBuilder() {
            return kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry.Builder.create();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry.Builder newBuilderForType() {
            return newBuilder();
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry.Builder newBuilder(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry enumEntry) {
            return newBuilder().mergeFrom(enumEntry);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry.Builder toBuilder() {
            return newBuilder(this);
        }

        public static final class Builder extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry.Builder> implements kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntryOrBuilder {
            private int bitField0_;
            private int name_;

            private void maybeForceBuilderInitialization() {
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry.Builder create() {
                return new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry.Builder();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry.Builder mo1266clone() {
                return create().mergeFrom(buildPartial());
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry getDefaultInstanceForType() {
                return kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry build() {
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry enumEntryBuildPartial = buildPartial();
                if (enumEntryBuildPartial.isInitialized()) {
                    return enumEntryBuildPartial;
                }
                throw newUninitializedMessageException(enumEntryBuildPartial);
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry buildPartial() {
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry enumEntry = new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry(this);
                int i = (this.bitField0_ & 1) != 1 ? 0 : 1;
                enumEntry.name_ = this.name_;
                enumEntry.bitField0_ = i;
                return enumEntry;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry.Builder mergeFrom(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry enumEntry) {
                if (enumEntry == kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry.getDefaultInstance()) {
                    return this;
                }
                if (enumEntry.hasName()) {
                    setName(enumEntry.getName());
                }
                mergeExtensionFields(enumEntry);
                setUnknownFields(getUnknownFields().concat(enumEntry.unknownFields));
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return extensionsAreInitialized();
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry.Builder mergeFrom(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.lang.Throwable {
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry enumEntry = null;
                try {
                    try {
                        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry partialFrom = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (partialFrom != null) {
                            mergeFrom(partialFrom);
                        }
                        return this;
                    } catch (kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException e) {
                        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry enumEntry2 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry) e.getUnfinishedMessage();
                        try {
                            throw e;
                        } catch (java.lang.Throwable th) {
                            th = th;
                            enumEntry = enumEntry2;
                            if (enumEntry != null) {
                                mergeFrom(enumEntry);
                            }
                            throw th;
                        }
                    }
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    if (enumEntry != null) {
                        mergeFrom(enumEntry);
                    }
                    throw th;
                }
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry.Builder setName(int i) {
                this.bitField0_ |= 1;
                this.name_ = i;
                return this;
            }
        }
    }

    public static final class VersionRequirement extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite implements kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementOrBuilder {
        public static kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement> PARSER = new kotlin.reflect.jvm.internal.impl.protobuf.AbstractParser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement>() { // from class: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.1
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement parsePartialFrom(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
                return new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement(codedInputStream, extensionRegistryLite);
            }
        };
        private static final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement defaultInstance;
        private int bitField0_;
        private int errorCode_;
        private kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.Level level_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private int message_;
        private final kotlin.reflect.jvm.internal.impl.protobuf.ByteString unknownFields;
        private int versionFull_;
        private kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.VersionKind versionKind_;
        private int version_;

        private VersionRequirement(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        private VersionRequirement(boolean z) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = kotlin.reflect.jvm.internal.impl.protobuf.ByteString.EMPTY;
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement getDefaultInstance() {
            return defaultInstance;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement getDefaultInstanceForType() {
            return defaultInstance;
        }

        private VersionRequirement(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            initFields();
            kotlin.reflect.jvm.internal.impl.protobuf.ByteString.Output outputNewOutput = kotlin.reflect.jvm.internal.impl.protobuf.ByteString.newOutput();
            kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream codedOutputStreamNewInstance = kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.newInstance(outputNewOutput, 1);
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        if (tag != 0) {
                            if (tag == 8) {
                                this.bitField0_ |= 1;
                                this.version_ = codedInputStream.readInt32();
                            } else if (tag == 16) {
                                this.bitField0_ |= 2;
                                this.versionFull_ = codedInputStream.readInt32();
                            } else if (tag == 24) {
                                int i = codedInputStream.readEnum();
                                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.Level levelValueOf = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.Level.valueOf(i);
                                if (levelValueOf == null) {
                                    codedOutputStreamNewInstance.writeRawVarint32(tag);
                                    codedOutputStreamNewInstance.writeRawVarint32(i);
                                } else {
                                    this.bitField0_ |= 4;
                                    this.level_ = levelValueOf;
                                }
                            } else if (tag == 32) {
                                this.bitField0_ |= 8;
                                this.errorCode_ = codedInputStream.readInt32();
                            } else if (tag == 40) {
                                this.bitField0_ |= 16;
                                this.message_ = codedInputStream.readInt32();
                            } else if (tag != 48) {
                                if (!parseUnknownField(codedInputStream, codedOutputStreamNewInstance, extensionRegistryLite, tag)) {
                                }
                            } else {
                                int i2 = codedInputStream.readEnum();
                                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.VersionKind versionKindValueOf = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.VersionKind.valueOf(i2);
                                if (versionKindValueOf == null) {
                                    codedOutputStreamNewInstance.writeRawVarint32(tag);
                                    codedOutputStreamNewInstance.writeRawVarint32(i2);
                                } else {
                                    this.bitField0_ |= 32;
                                    this.versionKind_ = versionKindValueOf;
                                }
                            }
                        }
                        z = true;
                    } catch (kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException e) {
                        throw e.setUnfinishedMessage(this);
                    } catch (java.io.IOException e2) {
                        throw new kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                    }
                } catch (java.lang.Throwable th) {
                    try {
                        codedOutputStreamNewInstance.flush();
                    } catch (java.io.IOException unused) {
                    } finally {
                        this.unknownFields = outputNewOutput.toByteString();
                    }
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            try {
                codedOutputStreamNewInstance.flush();
            } catch (java.io.IOException unused2) {
            } finally {
                this.unknownFields = outputNewOutput.toByteString();
            }
            makeExtensionsImmutable();
        }

        static {
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement versionRequirement = new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement(true);
            defaultInstance = versionRequirement;
            versionRequirement.initFields();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement> getParserForType() {
            return PARSER;
        }

        public enum Level implements kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite {
            WARNING(0, 0),
            ERROR(1, 1),
            HIDDEN(2, 2);

            private static kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.Level> internalValueMap = new kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.Level>() { // from class: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.Level.1
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap
                public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.Level findValueByNumber(int i) {
                    return kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.Level.valueOf(i);
                }
            };
            private final int value;

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
            public final int getNumber() {
                return this.value;
            }

            public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.Level valueOf(int i) {
                if (i == 0) {
                    return WARNING;
                }
                if (i == 1) {
                    return ERROR;
                }
                if (i != 2) {
                    return null;
                }
                return HIDDEN;
            }

            Level(int i, int i2) {
                this.value = i2;
            }
        }

        public enum VersionKind implements kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite {
            LANGUAGE_VERSION(0, 0),
            COMPILER_VERSION(1, 1),
            API_VERSION(2, 2);

            private static kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.VersionKind> internalValueMap = new kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.VersionKind>() { // from class: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.VersionKind.1
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap
                public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.VersionKind findValueByNumber(int i) {
                    return kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.VersionKind.valueOf(i);
                }
            };
            private final int value;

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
            public final int getNumber() {
                return this.value;
            }

            public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.VersionKind valueOf(int i) {
                if (i == 0) {
                    return LANGUAGE_VERSION;
                }
                if (i == 1) {
                    return COMPILER_VERSION;
                }
                if (i != 2) {
                    return null;
                }
                return API_VERSION;
            }

            VersionKind(int i, int i2) {
                this.value = i2;
            }
        }

        public boolean hasVersion() {
            return (this.bitField0_ & 1) == 1;
        }

        public int getVersion() {
            return this.version_;
        }

        public boolean hasVersionFull() {
            return (this.bitField0_ & 2) == 2;
        }

        public int getVersionFull() {
            return this.versionFull_;
        }

        public boolean hasLevel() {
            return (this.bitField0_ & 4) == 4;
        }

        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.Level getLevel() {
            return this.level_;
        }

        public boolean hasErrorCode() {
            return (this.bitField0_ & 8) == 8;
        }

        public int getErrorCode() {
            return this.errorCode_;
        }

        public boolean hasMessage() {
            return (this.bitField0_ & 16) == 16;
        }

        public int getMessage() {
            return this.message_;
        }

        public boolean hasVersionKind() {
            return (this.bitField0_ & 32) == 32;
        }

        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.VersionKind getVersionKind() {
            return this.versionKind_;
        }

        private void initFields() {
            this.version_ = 0;
            this.versionFull_ = 0;
            this.level_ = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.Level.ERROR;
            this.errorCode_ = 0;
            this.message_ = 0;
            this.versionKind_ = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.VersionKind.LANGUAGE_VERSION;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream codedOutputStream) throws java.io.IOException {
            getSerializedSize();
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.writeInt32(1, this.version_);
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.writeInt32(2, this.versionFull_);
            }
            if ((this.bitField0_ & 4) == 4) {
                codedOutputStream.writeEnum(3, this.level_.getNumber());
            }
            if ((this.bitField0_ & 8) == 8) {
                codedOutputStream.writeInt32(4, this.errorCode_);
            }
            if ((this.bitField0_ & 16) == 16) {
                codedOutputStream.writeInt32(5, this.message_);
            }
            if ((this.bitField0_ & 32) == 32) {
                codedOutputStream.writeEnum(6, this.versionKind_.getNumber());
            }
            codedOutputStream.writeRawBytes(this.unknownFields);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iComputeInt32Size = (this.bitField0_ & 1) == 1 ? 0 + kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeInt32Size(1, this.version_) : 0;
            if ((this.bitField0_ & 2) == 2) {
                iComputeInt32Size += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeInt32Size(2, this.versionFull_);
            }
            if ((this.bitField0_ & 4) == 4) {
                iComputeInt32Size += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeEnumSize(3, this.level_.getNumber());
            }
            if ((this.bitField0_ & 8) == 8) {
                iComputeInt32Size += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeInt32Size(4, this.errorCode_);
            }
            if ((this.bitField0_ & 16) == 16) {
                iComputeInt32Size += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeInt32Size(5, this.message_);
            }
            if ((this.bitField0_ & 32) == 32) {
                iComputeInt32Size += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeEnumSize(6, this.versionKind_.getNumber());
            }
            int size = iComputeInt32Size + this.unknownFields.size();
            this.memoizedSerializedSize = size;
            return size;
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.Builder newBuilder() {
            return kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.Builder.create();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.Builder newBuilderForType() {
            return newBuilder();
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.Builder newBuilder(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement versionRequirement) {
            return newBuilder().mergeFrom(versionRequirement);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.Builder toBuilder() {
            return newBuilder(this);
        }

        public static final class Builder extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.Builder> implements kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementOrBuilder {
            private int bitField0_;
            private int errorCode_;
            private int message_;
            private int versionFull_;
            private int version_;
            private kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.Level level_ = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.Level.ERROR;
            private kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.VersionKind versionKind_ = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.VersionKind.LANGUAGE_VERSION;

            private void maybeForceBuilderInitialization() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.Builder create() {
                return new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.Builder();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.Builder mo1266clone() {
                return create().mergeFrom(buildPartial());
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement getDefaultInstanceForType() {
                return kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement build() {
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement versionRequirementBuildPartial = buildPartial();
                if (versionRequirementBuildPartial.isInitialized()) {
                    return versionRequirementBuildPartial;
                }
                throw newUninitializedMessageException(versionRequirementBuildPartial);
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement buildPartial() {
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement versionRequirement = new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement(this);
                int i = this.bitField0_;
                int i2 = (i & 1) != 1 ? 0 : 1;
                versionRequirement.version_ = this.version_;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                versionRequirement.versionFull_ = this.versionFull_;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                versionRequirement.level_ = this.level_;
                if ((i & 8) == 8) {
                    i2 |= 8;
                }
                versionRequirement.errorCode_ = this.errorCode_;
                if ((i & 16) == 16) {
                    i2 |= 16;
                }
                versionRequirement.message_ = this.message_;
                if ((i & 32) == 32) {
                    i2 |= 32;
                }
                versionRequirement.versionKind_ = this.versionKind_;
                versionRequirement.bitField0_ = i2;
                return versionRequirement;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.Builder mergeFrom(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement versionRequirement) {
                if (versionRequirement == kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.getDefaultInstance()) {
                    return this;
                }
                if (versionRequirement.hasVersion()) {
                    setVersion(versionRequirement.getVersion());
                }
                if (versionRequirement.hasVersionFull()) {
                    setVersionFull(versionRequirement.getVersionFull());
                }
                if (versionRequirement.hasLevel()) {
                    setLevel(versionRequirement.getLevel());
                }
                if (versionRequirement.hasErrorCode()) {
                    setErrorCode(versionRequirement.getErrorCode());
                }
                if (versionRequirement.hasMessage()) {
                    setMessage(versionRequirement.getMessage());
                }
                if (versionRequirement.hasVersionKind()) {
                    setVersionKind(versionRequirement.getVersionKind());
                }
                setUnknownFields(getUnknownFields().concat(versionRequirement.unknownFields));
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.Builder mergeFrom(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.lang.Throwable {
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement versionRequirement = null;
                try {
                    try {
                        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement partialFrom = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (partialFrom != null) {
                            mergeFrom(partialFrom);
                        }
                        return this;
                    } catch (kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException e) {
                        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement versionRequirement2 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement) e.getUnfinishedMessage();
                        try {
                            throw e;
                        } catch (java.lang.Throwable th) {
                            th = th;
                            versionRequirement = versionRequirement2;
                            if (versionRequirement != null) {
                                mergeFrom(versionRequirement);
                            }
                            throw th;
                        }
                    }
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    if (versionRequirement != null) {
                        mergeFrom(versionRequirement);
                    }
                    throw th;
                }
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.Builder setVersion(int i) {
                this.bitField0_ |= 1;
                this.version_ = i;
                return this;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.Builder setVersionFull(int i) {
                this.bitField0_ |= 2;
                this.versionFull_ = i;
                return this;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.Builder setLevel(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.Level level) {
                java.util.Objects.requireNonNull(level);
                this.bitField0_ |= 4;
                this.level_ = level;
                return this;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.Builder setErrorCode(int i) {
                this.bitField0_ |= 8;
                this.errorCode_ = i;
                return this;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.Builder setMessage(int i) {
                this.bitField0_ |= 16;
                this.message_ = i;
                return this;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.Builder setVersionKind(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.VersionKind versionKind) {
                java.util.Objects.requireNonNull(versionKind);
                this.bitField0_ |= 32;
                this.versionKind_ = versionKind;
                return this;
            }
        }
    }

    public static final class VersionRequirementTable extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite implements kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTableOrBuilder {
        public static kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable> PARSER = new kotlin.reflect.jvm.internal.impl.protobuf.AbstractParser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable>() { // from class: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable.1
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable parsePartialFrom(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
                return new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable(codedInputStream, extensionRegistryLite);
            }
        };
        private static final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable defaultInstance;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement> requirement_;
        private final kotlin.reflect.jvm.internal.impl.protobuf.ByteString unknownFields;

        private VersionRequirementTable(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        private VersionRequirementTable(boolean z) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = kotlin.reflect.jvm.internal.impl.protobuf.ByteString.EMPTY;
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable getDefaultInstance() {
            return defaultInstance;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable getDefaultInstanceForType() {
            return defaultInstance;
        }

        private VersionRequirementTable(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            initFields();
            kotlin.reflect.jvm.internal.impl.protobuf.ByteString.Output outputNewOutput = kotlin.reflect.jvm.internal.impl.protobuf.ByteString.newOutput();
            kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream codedOutputStreamNewInstance = kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.newInstance(outputNewOutput, 1);
            boolean z = false;
            boolean z2 = false;
            while (!z) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        if (tag != 0) {
                            if (tag != 10) {
                                if (!parseUnknownField(codedInputStream, codedOutputStreamNewInstance, extensionRegistryLite, tag)) {
                                }
                            } else {
                                if (!(z2 & true)) {
                                    this.requirement_ = new java.util.ArrayList();
                                    z2 |= true;
                                }
                                this.requirement_.add((kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement) codedInputStream.readMessage(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.PARSER, extensionRegistryLite));
                            }
                        }
                        z = true;
                    } catch (java.lang.Throwable th) {
                        if (z2 & true) {
                            this.requirement_ = java.util.Collections.unmodifiableList(this.requirement_);
                        }
                        try {
                            codedOutputStreamNewInstance.flush();
                        } catch (java.io.IOException unused) {
                        } finally {
                            this.unknownFields = outputNewOutput.toByteString();
                        }
                        makeExtensionsImmutable();
                        throw th;
                    }
                } catch (kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (java.io.IOException e2) {
                    throw new kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                }
            }
            if (z2 & true) {
                this.requirement_ = java.util.Collections.unmodifiableList(this.requirement_);
            }
            try {
                codedOutputStreamNewInstance.flush();
            } catch (java.io.IOException unused2) {
            } finally {
                this.unknownFields = outputNewOutput.toByteString();
            }
            makeExtensionsImmutable();
        }

        static {
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable versionRequirementTable = new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable(true);
            defaultInstance = versionRequirementTable;
            versionRequirementTable.initFields();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable> getParserForType() {
            return PARSER;
        }

        public java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement> getRequirementList() {
            return this.requirement_;
        }

        public int getRequirementCount() {
            return this.requirement_.size();
        }

        private void initFields() {
            this.requirement_ = java.util.Collections.emptyList();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream codedOutputStream) throws java.io.IOException {
            getSerializedSize();
            for (int i = 0; i < this.requirement_.size(); i++) {
                codedOutputStream.writeMessage(1, this.requirement_.get(i));
            }
            codedOutputStream.writeRawBytes(this.unknownFields);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iComputeMessageSize = 0;
            for (int i2 = 0; i2 < this.requirement_.size(); i2++) {
                iComputeMessageSize += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeMessageSize(1, this.requirement_.get(i2));
            }
            int size = iComputeMessageSize + this.unknownFields.size();
            this.memoizedSerializedSize = size;
            return size;
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable.Builder newBuilder() {
            return kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable.Builder.create();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable.Builder newBuilderForType() {
            return newBuilder();
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable.Builder newBuilder(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable versionRequirementTable) {
            return newBuilder().mergeFrom(versionRequirementTable);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable.Builder toBuilder() {
            return newBuilder(this);
        }

        public static final class Builder extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable.Builder> implements kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTableOrBuilder {
            private int bitField0_;
            private java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement> requirement_ = java.util.Collections.emptyList();

            private void maybeForceBuilderInitialization() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable.Builder create() {
                return new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable.Builder();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable.Builder mo1266clone() {
                return create().mergeFrom(buildPartial());
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable getDefaultInstanceForType() {
                return kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable build() {
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable versionRequirementTableBuildPartial = buildPartial();
                if (versionRequirementTableBuildPartial.isInitialized()) {
                    return versionRequirementTableBuildPartial;
                }
                throw newUninitializedMessageException(versionRequirementTableBuildPartial);
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable buildPartial() {
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable versionRequirementTable = new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable(this);
                if ((this.bitField0_ & 1) == 1) {
                    this.requirement_ = java.util.Collections.unmodifiableList(this.requirement_);
                    this.bitField0_ &= -2;
                }
                versionRequirementTable.requirement_ = this.requirement_;
                return versionRequirementTable;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable.Builder mergeFrom(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable versionRequirementTable) {
                if (versionRequirementTable == kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable.getDefaultInstance()) {
                    return this;
                }
                if (!versionRequirementTable.requirement_.isEmpty()) {
                    if (this.requirement_.isEmpty()) {
                        this.requirement_ = versionRequirementTable.requirement_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureRequirementIsMutable();
                        this.requirement_.addAll(versionRequirementTable.requirement_);
                    }
                }
                setUnknownFields(getUnknownFields().concat(versionRequirementTable.unknownFields));
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable.Builder mergeFrom(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.lang.Throwable {
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable versionRequirementTable = null;
                try {
                    try {
                        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable partialFrom = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (partialFrom != null) {
                            mergeFrom(partialFrom);
                        }
                        return this;
                    } catch (kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException e) {
                        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable versionRequirementTable2 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable) e.getUnfinishedMessage();
                        try {
                            throw e;
                        } catch (java.lang.Throwable th) {
                            th = th;
                            versionRequirementTable = versionRequirementTable2;
                            if (versionRequirementTable != null) {
                                mergeFrom(versionRequirementTable);
                            }
                            throw th;
                        }
                    }
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    if (versionRequirementTable != null) {
                        mergeFrom(versionRequirementTable);
                    }
                    throw th;
                }
            }

            private void ensureRequirementIsMutable() {
                if ((this.bitField0_ & 1) != 1) {
                    this.requirement_ = new java.util.ArrayList(this.requirement_);
                    this.bitField0_ |= 1;
                }
            }
        }
    }

    public static final class PackageFragment extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment> implements kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragmentOrBuilder {
        public static kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment> PARSER = new kotlin.reflect.jvm.internal.impl.protobuf.AbstractParser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment>() { // from class: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment.1
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment parsePartialFrom(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
                return new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment(codedInputStream, extensionRegistryLite);
            }
        };
        private static final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment defaultInstance;
        private int bitField0_;
        private java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class> class__;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package package_;
        private kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable qualifiedNames_;
        private kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTable strings_;
        private final kotlin.reflect.jvm.internal.impl.protobuf.ByteString unknownFields;

        private PackageFragment(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment, ?> extendableBuilder) {
            super(extendableBuilder);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = extendableBuilder.getUnknownFields();
        }

        private PackageFragment(boolean z) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = kotlin.reflect.jvm.internal.impl.protobuf.ByteString.EMPTY;
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment getDefaultInstance() {
            return defaultInstance;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment getDefaultInstanceForType() {
            return defaultInstance;
        }

        private PackageFragment(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            initFields();
            kotlin.reflect.jvm.internal.impl.protobuf.ByteString.Output outputNewOutput = kotlin.reflect.jvm.internal.impl.protobuf.ByteString.newOutput();
            kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream codedOutputStreamNewInstance = kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.newInstance(outputNewOutput, 1);
            boolean z = false;
            int i = 0;
            while (!z) {
                try {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag == 10) {
                                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTable.Builder builder = (this.bitField0_ & 1) == 1 ? this.strings_.toBuilder() : null;
                                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTable stringTable = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTable) codedInputStream.readMessage(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTable.PARSER, extensionRegistryLite);
                                    this.strings_ = stringTable;
                                    if (builder != null) {
                                        builder.mergeFrom(stringTable);
                                        this.strings_ = builder.buildPartial();
                                    }
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.Builder builder2 = (this.bitField0_ & 2) == 2 ? this.qualifiedNames_.toBuilder() : null;
                                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable qualifiedNameTable = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable) codedInputStream.readMessage(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.PARSER, extensionRegistryLite);
                                    this.qualifiedNames_ = qualifiedNameTable;
                                    if (builder2 != null) {
                                        builder2.mergeFrom(qualifiedNameTable);
                                        this.qualifiedNames_ = builder2.buildPartial();
                                    }
                                    this.bitField0_ |= 2;
                                } else if (tag == 26) {
                                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package.Builder builder3 = (this.bitField0_ & 4) == 4 ? this.package_.toBuilder() : null;
                                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package r6 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package) codedInputStream.readMessage(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package.PARSER, extensionRegistryLite);
                                    this.package_ = r6;
                                    if (builder3 != null) {
                                        builder3.mergeFrom(r6);
                                        this.package_ = builder3.buildPartial();
                                    }
                                    this.bitField0_ |= 4;
                                } else if (tag != 34) {
                                    if (!parseUnknownField(codedInputStream, codedOutputStreamNewInstance, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    if ((i & 8) != 8) {
                                        this.class__ = new java.util.ArrayList();
                                        i |= 8;
                                    }
                                    this.class__.add((kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class) codedInputStream.readMessage(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.PARSER, extensionRegistryLite));
                                }
                            }
                            z = true;
                        } catch (java.io.IOException e) {
                            throw new kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException(e.getMessage()).setUnfinishedMessage(this);
                        }
                    } catch (kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException e2) {
                        throw e2.setUnfinishedMessage(this);
                    }
                } catch (java.lang.Throwable th) {
                    if ((i & 8) == 8) {
                        this.class__ = java.util.Collections.unmodifiableList(this.class__);
                    }
                    try {
                        codedOutputStreamNewInstance.flush();
                    } catch (java.io.IOException unused) {
                    } finally {
                        this.unknownFields = outputNewOutput.toByteString();
                    }
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            if ((i & 8) == 8) {
                this.class__ = java.util.Collections.unmodifiableList(this.class__);
            }
            try {
                codedOutputStreamNewInstance.flush();
            } catch (java.io.IOException unused2) {
            } finally {
                this.unknownFields = outputNewOutput.toByteString();
            }
            makeExtensionsImmutable();
        }

        static {
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment packageFragment = new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment(true);
            defaultInstance = packageFragment;
            packageFragment.initFields();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment> getParserForType() {
            return PARSER;
        }

        public boolean hasStrings() {
            return (this.bitField0_ & 1) == 1;
        }

        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTable getStrings() {
            return this.strings_;
        }

        public boolean hasQualifiedNames() {
            return (this.bitField0_ & 2) == 2;
        }

        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable getQualifiedNames() {
            return this.qualifiedNames_;
        }

        public boolean hasPackage() {
            return (this.bitField0_ & 4) == 4;
        }

        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package getPackage() {
            return this.package_;
        }

        public java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class> getClass_List() {
            return this.class__;
        }

        public int getClass_Count() {
            return this.class__.size();
        }

        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class getClass_(int i) {
            return this.class__.get(i);
        }

        private void initFields() {
            this.strings_ = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTable.getDefaultInstance();
            this.qualifiedNames_ = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.getDefaultInstance();
            this.package_ = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package.getDefaultInstance();
            this.class__ = java.util.Collections.emptyList();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            if (hasQualifiedNames() && !getQualifiedNames().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasPackage() && !getPackage().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            for (int i = 0; i < getClass_Count(); i++) {
                if (!getClass_(i).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            if (!extensionsAreInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream codedOutputStream) throws java.io.IOException {
            getSerializedSize();
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage<MessageType>.ExtensionWriter extensionWriterNewExtensionWriter = newExtensionWriter();
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.writeMessage(1, this.strings_);
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.writeMessage(2, this.qualifiedNames_);
            }
            if ((this.bitField0_ & 4) == 4) {
                codedOutputStream.writeMessage(3, this.package_);
            }
            for (int i = 0; i < this.class__.size(); i++) {
                codedOutputStream.writeMessage(4, this.class__.get(i));
            }
            extensionWriterNewExtensionWriter.writeUntil(200, codedOutputStream);
            codedOutputStream.writeRawBytes(this.unknownFields);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iComputeMessageSize = (this.bitField0_ & 1) == 1 ? kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeMessageSize(1, this.strings_) + 0 : 0;
            if ((this.bitField0_ & 2) == 2) {
                iComputeMessageSize += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeMessageSize(2, this.qualifiedNames_);
            }
            if ((this.bitField0_ & 4) == 4) {
                iComputeMessageSize += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeMessageSize(3, this.package_);
            }
            for (int i2 = 0; i2 < this.class__.size(); i2++) {
                iComputeMessageSize += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeMessageSize(4, this.class__.get(i2));
            }
            int iExtensionsSerializedSize = iComputeMessageSize + extensionsSerializedSize() + this.unknownFields.size();
            this.memoizedSerializedSize = iExtensionsSerializedSize;
            return iExtensionsSerializedSize;
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment parseFrom(java.io.InputStream inputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment.Builder newBuilder() {
            return kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment.Builder.create();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment.Builder newBuilderForType() {
            return newBuilder();
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment.Builder newBuilder(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment packageFragment) {
            return newBuilder().mergeFrom(packageFragment);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment.Builder toBuilder() {
            return newBuilder(this);
        }

        public static final class Builder extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment.Builder> implements kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragmentOrBuilder {
            private int bitField0_;
            private kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTable strings_ = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTable.getDefaultInstance();
            private kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable qualifiedNames_ = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.getDefaultInstance();
            private kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package package_ = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package.getDefaultInstance();
            private java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class> class__ = java.util.Collections.emptyList();

            private void maybeForceBuilderInitialization() {
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment.Builder create() {
                return new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment.Builder();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment.Builder mo1266clone() {
                return create().mergeFrom(buildPartial());
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment getDefaultInstanceForType() {
                return kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment build() {
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment packageFragmentBuildPartial = buildPartial();
                if (packageFragmentBuildPartial.isInitialized()) {
                    return packageFragmentBuildPartial;
                }
                throw newUninitializedMessageException(packageFragmentBuildPartial);
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment buildPartial() {
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment packageFragment = new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment(this);
                int i = this.bitField0_;
                int i2 = (i & 1) != 1 ? 0 : 1;
                packageFragment.strings_ = this.strings_;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                packageFragment.qualifiedNames_ = this.qualifiedNames_;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                packageFragment.package_ = this.package_;
                if ((this.bitField0_ & 8) == 8) {
                    this.class__ = java.util.Collections.unmodifiableList(this.class__);
                    this.bitField0_ &= -9;
                }
                packageFragment.class__ = this.class__;
                packageFragment.bitField0_ = i2;
                return packageFragment;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment.Builder mergeFrom(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment packageFragment) {
                if (packageFragment == kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment.getDefaultInstance()) {
                    return this;
                }
                if (packageFragment.hasStrings()) {
                    mergeStrings(packageFragment.getStrings());
                }
                if (packageFragment.hasQualifiedNames()) {
                    mergeQualifiedNames(packageFragment.getQualifiedNames());
                }
                if (packageFragment.hasPackage()) {
                    mergePackage(packageFragment.getPackage());
                }
                if (!packageFragment.class__.isEmpty()) {
                    if (this.class__.isEmpty()) {
                        this.class__ = packageFragment.class__;
                        this.bitField0_ &= -9;
                    } else {
                        ensureClass_IsMutable();
                        this.class__.addAll(packageFragment.class__);
                    }
                }
                mergeExtensionFields(packageFragment);
                setUnknownFields(getUnknownFields().concat(packageFragment.unknownFields));
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (hasQualifiedNames() && !getQualifiedNames().isInitialized()) {
                    return false;
                }
                if (hasPackage() && !getPackage().isInitialized()) {
                    return false;
                }
                for (int i = 0; i < getClass_Count(); i++) {
                    if (!getClass_(i).isInitialized()) {
                        return false;
                    }
                }
                return extensionsAreInitialized();
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment.Builder mergeFrom(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.lang.Throwable {
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment packageFragment = null;
                try {
                    try {
                        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment partialFrom = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (partialFrom != null) {
                            mergeFrom(partialFrom);
                        }
                        return this;
                    } catch (kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException e) {
                        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment packageFragment2 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment) e.getUnfinishedMessage();
                        try {
                            throw e;
                        } catch (java.lang.Throwable th) {
                            th = th;
                            packageFragment = packageFragment2;
                            if (packageFragment != null) {
                                mergeFrom(packageFragment);
                            }
                            throw th;
                        }
                    }
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    if (packageFragment != null) {
                        mergeFrom(packageFragment);
                    }
                    throw th;
                }
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment.Builder mergeStrings(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTable stringTable) {
                if ((this.bitField0_ & 1) == 1 && this.strings_ != kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTable.getDefaultInstance()) {
                    this.strings_ = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTable.newBuilder(this.strings_).mergeFrom(stringTable).buildPartial();
                } else {
                    this.strings_ = stringTable;
                }
                this.bitField0_ |= 1;
                return this;
            }

            public boolean hasQualifiedNames() {
                return (this.bitField0_ & 2) == 2;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable getQualifiedNames() {
                return this.qualifiedNames_;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment.Builder mergeQualifiedNames(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable qualifiedNameTable) {
                if ((this.bitField0_ & 2) == 2 && this.qualifiedNames_ != kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.getDefaultInstance()) {
                    this.qualifiedNames_ = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.newBuilder(this.qualifiedNames_).mergeFrom(qualifiedNameTable).buildPartial();
                } else {
                    this.qualifiedNames_ = qualifiedNameTable;
                }
                this.bitField0_ |= 2;
                return this;
            }

            public boolean hasPackage() {
                return (this.bitField0_ & 4) == 4;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package getPackage() {
                return this.package_;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment.Builder mergePackage(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package r4) {
                if ((this.bitField0_ & 4) == 4 && this.package_ != kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package.getDefaultInstance()) {
                    this.package_ = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package.newBuilder(this.package_).mergeFrom(r4).buildPartial();
                } else {
                    this.package_ = r4;
                }
                this.bitField0_ |= 4;
                return this;
            }

            private void ensureClass_IsMutable() {
                if ((this.bitField0_ & 8) != 8) {
                    this.class__ = new java.util.ArrayList(this.class__);
                    this.bitField0_ |= 8;
                }
            }

            public int getClass_Count() {
                return this.class__.size();
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class getClass_(int i) {
                return this.class__.get(i);
            }
        }
    }

    public static final class Contract extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite implements kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ContractOrBuilder {
        public static kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract> PARSER = new kotlin.reflect.jvm.internal.impl.protobuf.AbstractParser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract>() { // from class: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract.1
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract parsePartialFrom(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
                return new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract(codedInputStream, extensionRegistryLite);
            }
        };
        private static final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract defaultInstance;
        private java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect> effect_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private final kotlin.reflect.jvm.internal.impl.protobuf.ByteString unknownFields;

        private Contract(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        private Contract(boolean z) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = kotlin.reflect.jvm.internal.impl.protobuf.ByteString.EMPTY;
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract getDefaultInstance() {
            return defaultInstance;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract getDefaultInstanceForType() {
            return defaultInstance;
        }

        private Contract(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            initFields();
            kotlin.reflect.jvm.internal.impl.protobuf.ByteString.Output outputNewOutput = kotlin.reflect.jvm.internal.impl.protobuf.ByteString.newOutput();
            kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream codedOutputStreamNewInstance = kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.newInstance(outputNewOutput, 1);
            boolean z = false;
            boolean z2 = false;
            while (!z) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        if (tag != 0) {
                            if (tag != 10) {
                                if (!parseUnknownField(codedInputStream, codedOutputStreamNewInstance, extensionRegistryLite, tag)) {
                                }
                            } else {
                                if (!(z2 & true)) {
                                    this.effect_ = new java.util.ArrayList();
                                    z2 |= true;
                                }
                                this.effect_.add((kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect) codedInputStream.readMessage(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect.PARSER, extensionRegistryLite));
                            }
                        }
                        z = true;
                    } catch (java.lang.Throwable th) {
                        if (z2 & true) {
                            this.effect_ = java.util.Collections.unmodifiableList(this.effect_);
                        }
                        try {
                            codedOutputStreamNewInstance.flush();
                        } catch (java.io.IOException unused) {
                        } finally {
                            this.unknownFields = outputNewOutput.toByteString();
                        }
                        makeExtensionsImmutable();
                        throw th;
                    }
                } catch (kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (java.io.IOException e2) {
                    throw new kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                }
            }
            if (z2 & true) {
                this.effect_ = java.util.Collections.unmodifiableList(this.effect_);
            }
            try {
                codedOutputStreamNewInstance.flush();
            } catch (java.io.IOException unused2) {
            } finally {
                this.unknownFields = outputNewOutput.toByteString();
            }
            makeExtensionsImmutable();
        }

        static {
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract contract = new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract(true);
            defaultInstance = contract;
            contract.initFields();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract> getParserForType() {
            return PARSER;
        }

        public int getEffectCount() {
            return this.effect_.size();
        }

        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect getEffect(int i) {
            return this.effect_.get(i);
        }

        private void initFields() {
            this.effect_ = java.util.Collections.emptyList();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            for (int i = 0; i < getEffectCount(); i++) {
                if (!getEffect(i).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream codedOutputStream) throws java.io.IOException {
            getSerializedSize();
            for (int i = 0; i < this.effect_.size(); i++) {
                codedOutputStream.writeMessage(1, this.effect_.get(i));
            }
            codedOutputStream.writeRawBytes(this.unknownFields);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iComputeMessageSize = 0;
            for (int i2 = 0; i2 < this.effect_.size(); i2++) {
                iComputeMessageSize += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeMessageSize(1, this.effect_.get(i2));
            }
            int size = iComputeMessageSize + this.unknownFields.size();
            this.memoizedSerializedSize = size;
            return size;
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract.Builder newBuilder() {
            return kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract.Builder.create();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract.Builder newBuilderForType() {
            return newBuilder();
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract.Builder newBuilder(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract contract) {
            return newBuilder().mergeFrom(contract);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract.Builder toBuilder() {
            return newBuilder(this);
        }

        public static final class Builder extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract.Builder> implements kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ContractOrBuilder {
            private int bitField0_;
            private java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect> effect_ = java.util.Collections.emptyList();

            private void maybeForceBuilderInitialization() {
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract.Builder create() {
                return new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract.Builder();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract.Builder mo1266clone() {
                return create().mergeFrom(buildPartial());
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract getDefaultInstanceForType() {
                return kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract build() {
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract contractBuildPartial = buildPartial();
                if (contractBuildPartial.isInitialized()) {
                    return contractBuildPartial;
                }
                throw newUninitializedMessageException(contractBuildPartial);
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract buildPartial() {
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract contract = new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract(this);
                if ((this.bitField0_ & 1) == 1) {
                    this.effect_ = java.util.Collections.unmodifiableList(this.effect_);
                    this.bitField0_ &= -2;
                }
                contract.effect_ = this.effect_;
                return contract;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract.Builder mergeFrom(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract contract) {
                if (contract == kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract.getDefaultInstance()) {
                    return this;
                }
                if (!contract.effect_.isEmpty()) {
                    if (this.effect_.isEmpty()) {
                        this.effect_ = contract.effect_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureEffectIsMutable();
                        this.effect_.addAll(contract.effect_);
                    }
                }
                setUnknownFields(getUnknownFields().concat(contract.unknownFields));
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                for (int i = 0; i < getEffectCount(); i++) {
                    if (!getEffect(i).isInitialized()) {
                        return false;
                    }
                }
                return true;
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract.Builder mergeFrom(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.lang.Throwable {
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract contract = null;
                try {
                    try {
                        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract partialFrom = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (partialFrom != null) {
                            mergeFrom(partialFrom);
                        }
                        return this;
                    } catch (kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException e) {
                        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract contract2 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract) e.getUnfinishedMessage();
                        try {
                            throw e;
                        } catch (java.lang.Throwable th) {
                            th = th;
                            contract = contract2;
                            if (contract != null) {
                                mergeFrom(contract);
                            }
                            throw th;
                        }
                    }
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    if (contract != null) {
                        mergeFrom(contract);
                    }
                    throw th;
                }
            }

            private void ensureEffectIsMutable() {
                if ((this.bitField0_ & 1) != 1) {
                    this.effect_ = new java.util.ArrayList(this.effect_);
                    this.bitField0_ |= 1;
                }
            }

            public int getEffectCount() {
                return this.effect_.size();
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect getEffect(int i) {
                return this.effect_.get(i);
            }
        }
    }

    public static final class Effect extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite implements kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EffectOrBuilder {
        public static kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect> PARSER = new kotlin.reflect.jvm.internal.impl.protobuf.AbstractParser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect>() { // from class: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect.1
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect parsePartialFrom(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
                return new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect(codedInputStream, extensionRegistryLite);
            }
        };
        private static final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect defaultInstance;
        private int bitField0_;
        private kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression conclusionOfConditionalEffect_;
        private java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression> effectConstructorArgument_;
        private kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect.EffectType effectType_;
        private kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect.InvocationKind kind_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private final kotlin.reflect.jvm.internal.impl.protobuf.ByteString unknownFields;

        private Effect(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        private Effect(boolean z) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = kotlin.reflect.jvm.internal.impl.protobuf.ByteString.EMPTY;
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect getDefaultInstance() {
            return defaultInstance;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect getDefaultInstanceForType() {
            return defaultInstance;
        }

        private Effect(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            initFields();
            kotlin.reflect.jvm.internal.impl.protobuf.ByteString.Output outputNewOutput = kotlin.reflect.jvm.internal.impl.protobuf.ByteString.newOutput();
            kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream codedOutputStreamNewInstance = kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.newInstance(outputNewOutput, 1);
            boolean z = false;
            int i = 0;
            while (!z) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        if (tag != 0) {
                            if (tag == 8) {
                                int i2 = codedInputStream.readEnum();
                                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect.EffectType effectTypeValueOf = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect.EffectType.valueOf(i2);
                                if (effectTypeValueOf == null) {
                                    codedOutputStreamNewInstance.writeRawVarint32(tag);
                                    codedOutputStreamNewInstance.writeRawVarint32(i2);
                                } else {
                                    this.bitField0_ |= 1;
                                    this.effectType_ = effectTypeValueOf;
                                }
                            } else if (tag == 18) {
                                if ((i & 2) != 2) {
                                    this.effectConstructorArgument_ = new java.util.ArrayList();
                                    i |= 2;
                                }
                                this.effectConstructorArgument_.add((kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression) codedInputStream.readMessage(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression.PARSER, extensionRegistryLite));
                            } else if (tag == 26) {
                                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression.Builder builder = (this.bitField0_ & 2) == 2 ? this.conclusionOfConditionalEffect_.toBuilder() : null;
                                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression expression = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression) codedInputStream.readMessage(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression.PARSER, extensionRegistryLite);
                                this.conclusionOfConditionalEffect_ = expression;
                                if (builder != null) {
                                    builder.mergeFrom(expression);
                                    this.conclusionOfConditionalEffect_ = builder.buildPartial();
                                }
                                this.bitField0_ |= 2;
                            } else if (tag != 32) {
                                if (!parseUnknownField(codedInputStream, codedOutputStreamNewInstance, extensionRegistryLite, tag)) {
                                }
                            } else {
                                int i3 = codedInputStream.readEnum();
                                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect.InvocationKind invocationKindValueOf = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect.InvocationKind.valueOf(i3);
                                if (invocationKindValueOf == null) {
                                    codedOutputStreamNewInstance.writeRawVarint32(tag);
                                    codedOutputStreamNewInstance.writeRawVarint32(i3);
                                } else {
                                    this.bitField0_ |= 4;
                                    this.kind_ = invocationKindValueOf;
                                }
                            }
                        }
                        z = true;
                    } catch (java.lang.Throwable th) {
                        if ((i & 2) == 2) {
                            this.effectConstructorArgument_ = java.util.Collections.unmodifiableList(this.effectConstructorArgument_);
                        }
                        try {
                            codedOutputStreamNewInstance.flush();
                        } catch (java.io.IOException unused) {
                        } finally {
                            this.unknownFields = outputNewOutput.toByteString();
                        }
                        makeExtensionsImmutable();
                        throw th;
                    }
                } catch (kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (java.io.IOException e2) {
                    throw new kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                }
            }
            if ((i & 2) == 2) {
                this.effectConstructorArgument_ = java.util.Collections.unmodifiableList(this.effectConstructorArgument_);
            }
            try {
                codedOutputStreamNewInstance.flush();
            } catch (java.io.IOException unused2) {
            } finally {
                this.unknownFields = outputNewOutput.toByteString();
            }
            makeExtensionsImmutable();
        }

        static {
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect effect = new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect(true);
            defaultInstance = effect;
            effect.initFields();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect> getParserForType() {
            return PARSER;
        }

        public enum EffectType implements kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite {
            RETURNS_CONSTANT(0, 0),
            CALLS(1, 1),
            RETURNS_NOT_NULL(2, 2);

            private static kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect.EffectType> internalValueMap = new kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect.EffectType>() { // from class: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect.EffectType.1
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap
                public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect.EffectType findValueByNumber(int i) {
                    return kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect.EffectType.valueOf(i);
                }
            };
            private final int value;

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
            public final int getNumber() {
                return this.value;
            }

            public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect.EffectType valueOf(int i) {
                if (i == 0) {
                    return RETURNS_CONSTANT;
                }
                if (i == 1) {
                    return CALLS;
                }
                if (i != 2) {
                    return null;
                }
                return RETURNS_NOT_NULL;
            }

            EffectType(int i, int i2) {
                this.value = i2;
            }
        }

        public enum InvocationKind implements kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite {
            AT_MOST_ONCE(0, 0),
            EXACTLY_ONCE(1, 1),
            AT_LEAST_ONCE(2, 2);

            private static kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect.InvocationKind> internalValueMap = new kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect.InvocationKind>() { // from class: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect.InvocationKind.1
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap
                public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect.InvocationKind findValueByNumber(int i) {
                    return kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect.InvocationKind.valueOf(i);
                }
            };
            private final int value;

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
            public final int getNumber() {
                return this.value;
            }

            public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect.InvocationKind valueOf(int i) {
                if (i == 0) {
                    return AT_MOST_ONCE;
                }
                if (i == 1) {
                    return EXACTLY_ONCE;
                }
                if (i != 2) {
                    return null;
                }
                return AT_LEAST_ONCE;
            }

            InvocationKind(int i, int i2) {
                this.value = i2;
            }
        }

        public boolean hasEffectType() {
            return (this.bitField0_ & 1) == 1;
        }

        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect.EffectType getEffectType() {
            return this.effectType_;
        }

        public int getEffectConstructorArgumentCount() {
            return this.effectConstructorArgument_.size();
        }

        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression getEffectConstructorArgument(int i) {
            return this.effectConstructorArgument_.get(i);
        }

        public boolean hasConclusionOfConditionalEffect() {
            return (this.bitField0_ & 2) == 2;
        }

        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression getConclusionOfConditionalEffect() {
            return this.conclusionOfConditionalEffect_;
        }

        public boolean hasKind() {
            return (this.bitField0_ & 4) == 4;
        }

        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect.InvocationKind getKind() {
            return this.kind_;
        }

        private void initFields() {
            this.effectType_ = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect.EffectType.RETURNS_CONSTANT;
            this.effectConstructorArgument_ = java.util.Collections.emptyList();
            this.conclusionOfConditionalEffect_ = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression.getDefaultInstance();
            this.kind_ = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect.InvocationKind.AT_MOST_ONCE;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            for (int i = 0; i < getEffectConstructorArgumentCount(); i++) {
                if (!getEffectConstructorArgument(i).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            if (hasConclusionOfConditionalEffect() && !getConclusionOfConditionalEffect().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream codedOutputStream) throws java.io.IOException {
            getSerializedSize();
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.writeEnum(1, this.effectType_.getNumber());
            }
            for (int i = 0; i < this.effectConstructorArgument_.size(); i++) {
                codedOutputStream.writeMessage(2, this.effectConstructorArgument_.get(i));
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.writeMessage(3, this.conclusionOfConditionalEffect_);
            }
            if ((this.bitField0_ & 4) == 4) {
                codedOutputStream.writeEnum(4, this.kind_.getNumber());
            }
            codedOutputStream.writeRawBytes(this.unknownFields);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iComputeEnumSize = (this.bitField0_ & 1) == 1 ? kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeEnumSize(1, this.effectType_.getNumber()) + 0 : 0;
            for (int i2 = 0; i2 < this.effectConstructorArgument_.size(); i2++) {
                iComputeEnumSize += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeMessageSize(2, this.effectConstructorArgument_.get(i2));
            }
            if ((this.bitField0_ & 2) == 2) {
                iComputeEnumSize += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeMessageSize(3, this.conclusionOfConditionalEffect_);
            }
            if ((this.bitField0_ & 4) == 4) {
                iComputeEnumSize += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeEnumSize(4, this.kind_.getNumber());
            }
            int size = iComputeEnumSize + this.unknownFields.size();
            this.memoizedSerializedSize = size;
            return size;
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect.Builder newBuilder() {
            return kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect.Builder.create();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect.Builder newBuilderForType() {
            return newBuilder();
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect.Builder newBuilder(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect effect) {
            return newBuilder().mergeFrom(effect);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect.Builder toBuilder() {
            return newBuilder(this);
        }

        public static final class Builder extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect.Builder> implements kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EffectOrBuilder {
            private int bitField0_;
            private kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect.EffectType effectType_ = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect.EffectType.RETURNS_CONSTANT;
            private java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression> effectConstructorArgument_ = java.util.Collections.emptyList();
            private kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression conclusionOfConditionalEffect_ = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression.getDefaultInstance();
            private kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect.InvocationKind kind_ = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect.InvocationKind.AT_MOST_ONCE;

            private void maybeForceBuilderInitialization() {
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect.Builder create() {
                return new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect.Builder();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect.Builder mo1266clone() {
                return create().mergeFrom(buildPartial());
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect getDefaultInstanceForType() {
                return kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect build() {
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect effectBuildPartial = buildPartial();
                if (effectBuildPartial.isInitialized()) {
                    return effectBuildPartial;
                }
                throw newUninitializedMessageException(effectBuildPartial);
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect buildPartial() {
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect effect = new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect(this);
                int i = this.bitField0_;
                int i2 = (i & 1) != 1 ? 0 : 1;
                effect.effectType_ = this.effectType_;
                if ((this.bitField0_ & 2) == 2) {
                    this.effectConstructorArgument_ = java.util.Collections.unmodifiableList(this.effectConstructorArgument_);
                    this.bitField0_ &= -3;
                }
                effect.effectConstructorArgument_ = this.effectConstructorArgument_;
                if ((i & 4) == 4) {
                    i2 |= 2;
                }
                effect.conclusionOfConditionalEffect_ = this.conclusionOfConditionalEffect_;
                if ((i & 8) == 8) {
                    i2 |= 4;
                }
                effect.kind_ = this.kind_;
                effect.bitField0_ = i2;
                return effect;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect.Builder mergeFrom(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect effect) {
                if (effect == kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect.getDefaultInstance()) {
                    return this;
                }
                if (effect.hasEffectType()) {
                    setEffectType(effect.getEffectType());
                }
                if (!effect.effectConstructorArgument_.isEmpty()) {
                    if (this.effectConstructorArgument_.isEmpty()) {
                        this.effectConstructorArgument_ = effect.effectConstructorArgument_;
                        this.bitField0_ &= -3;
                    } else {
                        ensureEffectConstructorArgumentIsMutable();
                        this.effectConstructorArgument_.addAll(effect.effectConstructorArgument_);
                    }
                }
                if (effect.hasConclusionOfConditionalEffect()) {
                    mergeConclusionOfConditionalEffect(effect.getConclusionOfConditionalEffect());
                }
                if (effect.hasKind()) {
                    setKind(effect.getKind());
                }
                setUnknownFields(getUnknownFields().concat(effect.unknownFields));
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                for (int i = 0; i < getEffectConstructorArgumentCount(); i++) {
                    if (!getEffectConstructorArgument(i).isInitialized()) {
                        return false;
                    }
                }
                return !hasConclusionOfConditionalEffect() || getConclusionOfConditionalEffect().isInitialized();
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect.Builder mergeFrom(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.lang.Throwable {
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect effect = null;
                try {
                    try {
                        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect partialFrom = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (partialFrom != null) {
                            mergeFrom(partialFrom);
                        }
                        return this;
                    } catch (kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException e) {
                        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect effect2 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect) e.getUnfinishedMessage();
                        try {
                            throw e;
                        } catch (java.lang.Throwable th) {
                            th = th;
                            effect = effect2;
                            if (effect != null) {
                                mergeFrom(effect);
                            }
                            throw th;
                        }
                    }
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    if (effect != null) {
                        mergeFrom(effect);
                    }
                    throw th;
                }
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect.Builder setEffectType(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect.EffectType effectType) {
                java.util.Objects.requireNonNull(effectType);
                this.bitField0_ |= 1;
                this.effectType_ = effectType;
                return this;
            }

            private void ensureEffectConstructorArgumentIsMutable() {
                if ((this.bitField0_ & 2) != 2) {
                    this.effectConstructorArgument_ = new java.util.ArrayList(this.effectConstructorArgument_);
                    this.bitField0_ |= 2;
                }
            }

            public int getEffectConstructorArgumentCount() {
                return this.effectConstructorArgument_.size();
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression getEffectConstructorArgument(int i) {
                return this.effectConstructorArgument_.get(i);
            }

            public boolean hasConclusionOfConditionalEffect() {
                return (this.bitField0_ & 4) == 4;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression getConclusionOfConditionalEffect() {
                return this.conclusionOfConditionalEffect_;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect.Builder mergeConclusionOfConditionalEffect(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression expression) {
                if ((this.bitField0_ & 4) == 4 && this.conclusionOfConditionalEffect_ != kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression.getDefaultInstance()) {
                    this.conclusionOfConditionalEffect_ = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression.newBuilder(this.conclusionOfConditionalEffect_).mergeFrom(expression).buildPartial();
                } else {
                    this.conclusionOfConditionalEffect_ = expression;
                }
                this.bitField0_ |= 4;
                return this;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect.Builder setKind(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect.InvocationKind invocationKind) {
                java.util.Objects.requireNonNull(invocationKind);
                this.bitField0_ |= 8;
                this.kind_ = invocationKind;
                return this;
            }
        }
    }

    public static final class Expression extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite implements kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ExpressionOrBuilder {
        public static kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression> PARSER = new kotlin.reflect.jvm.internal.impl.protobuf.AbstractParser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression>() { // from class: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression.1
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression parsePartialFrom(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
                return new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression(codedInputStream, extensionRegistryLite);
            }
        };
        private static final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression defaultInstance;
        private java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression> andArgument_;
        private int bitField0_;
        private kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression.ConstantValue constantValue_;
        private int flags_;
        private int isInstanceTypeId_;
        private kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type isInstanceType_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression> orArgument_;
        private final kotlin.reflect.jvm.internal.impl.protobuf.ByteString unknownFields;
        private int valueParameterReference_;

        private Expression(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        private Expression(boolean z) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = kotlin.reflect.jvm.internal.impl.protobuf.ByteString.EMPTY;
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression getDefaultInstance() {
            return defaultInstance;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression getDefaultInstanceForType() {
            return defaultInstance;
        }

        private Expression(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            initFields();
            kotlin.reflect.jvm.internal.impl.protobuf.ByteString.Output outputNewOutput = kotlin.reflect.jvm.internal.impl.protobuf.ByteString.newOutput();
            kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream codedOutputStreamNewInstance = kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.newInstance(outputNewOutput, 1);
            boolean z = false;
            int i = 0;
            while (!z) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        if (tag != 0) {
                            if (tag == 8) {
                                this.bitField0_ |= 1;
                                this.flags_ = codedInputStream.readInt32();
                            } else if (tag == 16) {
                                this.bitField0_ |= 2;
                                this.valueParameterReference_ = codedInputStream.readInt32();
                            } else if (tag == 24) {
                                int i2 = codedInputStream.readEnum();
                                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression.ConstantValue constantValueValueOf = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression.ConstantValue.valueOf(i2);
                                if (constantValueValueOf == null) {
                                    codedOutputStreamNewInstance.writeRawVarint32(tag);
                                    codedOutputStreamNewInstance.writeRawVarint32(i2);
                                } else {
                                    this.bitField0_ |= 4;
                                    this.constantValue_ = constantValueValueOf;
                                }
                            } else if (tag == 34) {
                                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Builder builder = (this.bitField0_ & 8) == 8 ? this.isInstanceType_.toBuilder() : null;
                                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type type = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type) codedInputStream.readMessage(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.PARSER, extensionRegistryLite);
                                this.isInstanceType_ = type;
                                if (builder != null) {
                                    builder.mergeFrom(type);
                                    this.isInstanceType_ = builder.buildPartial();
                                }
                                this.bitField0_ |= 8;
                            } else if (tag == 40) {
                                this.bitField0_ |= 16;
                                this.isInstanceTypeId_ = codedInputStream.readInt32();
                            } else if (tag == 50) {
                                if ((i & 32) != 32) {
                                    this.andArgument_ = new java.util.ArrayList();
                                    i |= 32;
                                }
                                this.andArgument_.add((kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression) codedInputStream.readMessage(PARSER, extensionRegistryLite));
                            } else if (tag != 58) {
                                if (!parseUnknownField(codedInputStream, codedOutputStreamNewInstance, extensionRegistryLite, tag)) {
                                }
                            } else {
                                if ((i & 64) != 64) {
                                    this.orArgument_ = new java.util.ArrayList();
                                    i |= 64;
                                }
                                this.orArgument_.add((kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression) codedInputStream.readMessage(PARSER, extensionRegistryLite));
                            }
                        }
                        z = true;
                    } catch (kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException e) {
                        throw e.setUnfinishedMessage(this);
                    } catch (java.io.IOException e2) {
                        throw new kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                    }
                } catch (java.lang.Throwable th) {
                    if ((i & 32) == 32) {
                        this.andArgument_ = java.util.Collections.unmodifiableList(this.andArgument_);
                    }
                    if ((i & 64) == 64) {
                        this.orArgument_ = java.util.Collections.unmodifiableList(this.orArgument_);
                    }
                    try {
                        codedOutputStreamNewInstance.flush();
                    } catch (java.io.IOException unused) {
                    } finally {
                        this.unknownFields = outputNewOutput.toByteString();
                    }
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            if ((i & 32) == 32) {
                this.andArgument_ = java.util.Collections.unmodifiableList(this.andArgument_);
            }
            if ((i & 64) == 64) {
                this.orArgument_ = java.util.Collections.unmodifiableList(this.orArgument_);
            }
            try {
                codedOutputStreamNewInstance.flush();
            } catch (java.io.IOException unused2) {
            } finally {
                this.unknownFields = outputNewOutput.toByteString();
            }
            makeExtensionsImmutable();
        }

        static {
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression expression = new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression(true);
            defaultInstance = expression;
            expression.initFields();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression> getParserForType() {
            return PARSER;
        }

        public enum ConstantValue implements kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite {
            TRUE(0, 0),
            FALSE(1, 1),
            NULL(2, 2);

            private static kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression.ConstantValue> internalValueMap = new kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression.ConstantValue>() { // from class: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression.ConstantValue.1
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap
                public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression.ConstantValue findValueByNumber(int i) {
                    return kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression.ConstantValue.valueOf(i);
                }
            };
            private final int value;

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
            public final int getNumber() {
                return this.value;
            }

            public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression.ConstantValue valueOf(int i) {
                if (i == 0) {
                    return TRUE;
                }
                if (i == 1) {
                    return FALSE;
                }
                if (i != 2) {
                    return null;
                }
                return NULL;
            }

            ConstantValue(int i, int i2) {
                this.value = i2;
            }
        }

        public boolean hasFlags() {
            return (this.bitField0_ & 1) == 1;
        }

        public int getFlags() {
            return this.flags_;
        }

        public boolean hasValueParameterReference() {
            return (this.bitField0_ & 2) == 2;
        }

        public int getValueParameterReference() {
            return this.valueParameterReference_;
        }

        public boolean hasConstantValue() {
            return (this.bitField0_ & 4) == 4;
        }

        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression.ConstantValue getConstantValue() {
            return this.constantValue_;
        }

        public boolean hasIsInstanceType() {
            return (this.bitField0_ & 8) == 8;
        }

        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type getIsInstanceType() {
            return this.isInstanceType_;
        }

        public boolean hasIsInstanceTypeId() {
            return (this.bitField0_ & 16) == 16;
        }

        public int getIsInstanceTypeId() {
            return this.isInstanceTypeId_;
        }

        public int getAndArgumentCount() {
            return this.andArgument_.size();
        }

        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression getAndArgument(int i) {
            return this.andArgument_.get(i);
        }

        public int getOrArgumentCount() {
            return this.orArgument_.size();
        }

        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression getOrArgument(int i) {
            return this.orArgument_.get(i);
        }

        private void initFields() {
            this.flags_ = 0;
            this.valueParameterReference_ = 0;
            this.constantValue_ = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression.ConstantValue.TRUE;
            this.isInstanceType_ = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.getDefaultInstance();
            this.isInstanceTypeId_ = 0;
            this.andArgument_ = java.util.Collections.emptyList();
            this.orArgument_ = java.util.Collections.emptyList();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            if (hasIsInstanceType() && !getIsInstanceType().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            for (int i = 0; i < getAndArgumentCount(); i++) {
                if (!getAndArgument(i).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            for (int i2 = 0; i2 < getOrArgumentCount(); i2++) {
                if (!getOrArgument(i2).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream codedOutputStream) throws java.io.IOException {
            getSerializedSize();
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.writeInt32(1, this.flags_);
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.writeInt32(2, this.valueParameterReference_);
            }
            if ((this.bitField0_ & 4) == 4) {
                codedOutputStream.writeEnum(3, this.constantValue_.getNumber());
            }
            if ((this.bitField0_ & 8) == 8) {
                codedOutputStream.writeMessage(4, this.isInstanceType_);
            }
            if ((this.bitField0_ & 16) == 16) {
                codedOutputStream.writeInt32(5, this.isInstanceTypeId_);
            }
            for (int i = 0; i < this.andArgument_.size(); i++) {
                codedOutputStream.writeMessage(6, this.andArgument_.get(i));
            }
            for (int i2 = 0; i2 < this.orArgument_.size(); i2++) {
                codedOutputStream.writeMessage(7, this.orArgument_.get(i2));
            }
            codedOutputStream.writeRawBytes(this.unknownFields);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iComputeInt32Size = (this.bitField0_ & 1) == 1 ? kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeInt32Size(1, this.flags_) + 0 : 0;
            if ((this.bitField0_ & 2) == 2) {
                iComputeInt32Size += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeInt32Size(2, this.valueParameterReference_);
            }
            if ((this.bitField0_ & 4) == 4) {
                iComputeInt32Size += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeEnumSize(3, this.constantValue_.getNumber());
            }
            if ((this.bitField0_ & 8) == 8) {
                iComputeInt32Size += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeMessageSize(4, this.isInstanceType_);
            }
            if ((this.bitField0_ & 16) == 16) {
                iComputeInt32Size += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeInt32Size(5, this.isInstanceTypeId_);
            }
            for (int i2 = 0; i2 < this.andArgument_.size(); i2++) {
                iComputeInt32Size += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeMessageSize(6, this.andArgument_.get(i2));
            }
            for (int i3 = 0; i3 < this.orArgument_.size(); i3++) {
                iComputeInt32Size += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeMessageSize(7, this.orArgument_.get(i3));
            }
            int size = iComputeInt32Size + this.unknownFields.size();
            this.memoizedSerializedSize = size;
            return size;
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression.Builder newBuilder() {
            return kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression.Builder.create();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression.Builder newBuilderForType() {
            return newBuilder();
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression.Builder newBuilder(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression expression) {
            return newBuilder().mergeFrom(expression);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression.Builder toBuilder() {
            return newBuilder(this);
        }

        public static final class Builder extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression.Builder> implements kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ExpressionOrBuilder {
            private int bitField0_;
            private int flags_;
            private int isInstanceTypeId_;
            private int valueParameterReference_;
            private kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression.ConstantValue constantValue_ = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression.ConstantValue.TRUE;
            private kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type isInstanceType_ = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.getDefaultInstance();
            private java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression> andArgument_ = java.util.Collections.emptyList();
            private java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression> orArgument_ = java.util.Collections.emptyList();

            private void maybeForceBuilderInitialization() {
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression.Builder create() {
                return new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression.Builder();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression.Builder mo1266clone() {
                return create().mergeFrom(buildPartial());
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression getDefaultInstanceForType() {
                return kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression build() {
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression expressionBuildPartial = buildPartial();
                if (expressionBuildPartial.isInitialized()) {
                    return expressionBuildPartial;
                }
                throw newUninitializedMessageException(expressionBuildPartial);
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression buildPartial() {
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression expression = new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression(this);
                int i = this.bitField0_;
                int i2 = (i & 1) != 1 ? 0 : 1;
                expression.flags_ = this.flags_;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                expression.valueParameterReference_ = this.valueParameterReference_;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                expression.constantValue_ = this.constantValue_;
                if ((i & 8) == 8) {
                    i2 |= 8;
                }
                expression.isInstanceType_ = this.isInstanceType_;
                if ((i & 16) == 16) {
                    i2 |= 16;
                }
                expression.isInstanceTypeId_ = this.isInstanceTypeId_;
                if ((this.bitField0_ & 32) == 32) {
                    this.andArgument_ = java.util.Collections.unmodifiableList(this.andArgument_);
                    this.bitField0_ &= -33;
                }
                expression.andArgument_ = this.andArgument_;
                if ((this.bitField0_ & 64) == 64) {
                    this.orArgument_ = java.util.Collections.unmodifiableList(this.orArgument_);
                    this.bitField0_ &= -65;
                }
                expression.orArgument_ = this.orArgument_;
                expression.bitField0_ = i2;
                return expression;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression.Builder mergeFrom(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression expression) {
                if (expression == kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression.getDefaultInstance()) {
                    return this;
                }
                if (expression.hasFlags()) {
                    setFlags(expression.getFlags());
                }
                if (expression.hasValueParameterReference()) {
                    setValueParameterReference(expression.getValueParameterReference());
                }
                if (expression.hasConstantValue()) {
                    setConstantValue(expression.getConstantValue());
                }
                if (expression.hasIsInstanceType()) {
                    mergeIsInstanceType(expression.getIsInstanceType());
                }
                if (expression.hasIsInstanceTypeId()) {
                    setIsInstanceTypeId(expression.getIsInstanceTypeId());
                }
                if (!expression.andArgument_.isEmpty()) {
                    if (this.andArgument_.isEmpty()) {
                        this.andArgument_ = expression.andArgument_;
                        this.bitField0_ &= -33;
                    } else {
                        ensureAndArgumentIsMutable();
                        this.andArgument_.addAll(expression.andArgument_);
                    }
                }
                if (!expression.orArgument_.isEmpty()) {
                    if (this.orArgument_.isEmpty()) {
                        this.orArgument_ = expression.orArgument_;
                        this.bitField0_ &= -65;
                    } else {
                        ensureOrArgumentIsMutable();
                        this.orArgument_.addAll(expression.orArgument_);
                    }
                }
                setUnknownFields(getUnknownFields().concat(expression.unknownFields));
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (hasIsInstanceType() && !getIsInstanceType().isInitialized()) {
                    return false;
                }
                for (int i = 0; i < getAndArgumentCount(); i++) {
                    if (!getAndArgument(i).isInitialized()) {
                        return false;
                    }
                }
                for (int i2 = 0; i2 < getOrArgumentCount(); i2++) {
                    if (!getOrArgument(i2).isInitialized()) {
                        return false;
                    }
                }
                return true;
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression.Builder mergeFrom(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.lang.Throwable {
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression expression = null;
                try {
                    try {
                        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression partialFrom = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (partialFrom != null) {
                            mergeFrom(partialFrom);
                        }
                        return this;
                    } catch (kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException e) {
                        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression expression2 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression) e.getUnfinishedMessage();
                        try {
                            throw e;
                        } catch (java.lang.Throwable th) {
                            th = th;
                            expression = expression2;
                            if (expression != null) {
                                mergeFrom(expression);
                            }
                            throw th;
                        }
                    }
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    if (expression != null) {
                        mergeFrom(expression);
                    }
                    throw th;
                }
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression.Builder setFlags(int i) {
                this.bitField0_ |= 1;
                this.flags_ = i;
                return this;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression.Builder setValueParameterReference(int i) {
                this.bitField0_ |= 2;
                this.valueParameterReference_ = i;
                return this;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression.Builder setConstantValue(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression.ConstantValue constantValue) {
                java.util.Objects.requireNonNull(constantValue);
                this.bitField0_ |= 4;
                this.constantValue_ = constantValue;
                return this;
            }

            public boolean hasIsInstanceType() {
                return (this.bitField0_ & 8) == 8;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type getIsInstanceType() {
                return this.isInstanceType_;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression.Builder mergeIsInstanceType(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type type) {
                if ((this.bitField0_ & 8) == 8 && this.isInstanceType_ != kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.getDefaultInstance()) {
                    this.isInstanceType_ = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.newBuilder(this.isInstanceType_).mergeFrom(type).buildPartial();
                } else {
                    this.isInstanceType_ = type;
                }
                this.bitField0_ |= 8;
                return this;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression.Builder setIsInstanceTypeId(int i) {
                this.bitField0_ |= 16;
                this.isInstanceTypeId_ = i;
                return this;
            }

            private void ensureAndArgumentIsMutable() {
                if ((this.bitField0_ & 32) != 32) {
                    this.andArgument_ = new java.util.ArrayList(this.andArgument_);
                    this.bitField0_ |= 32;
                }
            }

            public int getAndArgumentCount() {
                return this.andArgument_.size();
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression getAndArgument(int i) {
                return this.andArgument_.get(i);
            }

            private void ensureOrArgumentIsMutable() {
                if ((this.bitField0_ & 64) != 64) {
                    this.orArgument_ = new java.util.ArrayList(this.orArgument_);
                    this.bitField0_ |= 64;
                }
            }

            public int getOrArgumentCount() {
                return this.orArgument_.size();
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression getOrArgument(int i) {
                return this.orArgument_.get(i);
            }
        }
    }
}
