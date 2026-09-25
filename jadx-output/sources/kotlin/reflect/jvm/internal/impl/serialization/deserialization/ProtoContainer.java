package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

/* JADX INFO: compiled from: ProtoContainer.kt */
/* JADX INFO: loaded from: classes2.dex */
public abstract class ProtoContainer {
    private final kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver nameResolver;
    private final kotlin.reflect.jvm.internal.impl.descriptors.SourceElement source;
    private final kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable typeTable;

    public abstract kotlin.reflect.jvm.internal.impl.name.FqName debugFqName();

    private ProtoContainer(kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver nameResolver, kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable typeTable, kotlin.reflect.jvm.internal.impl.descriptors.SourceElement sourceElement) {
        this.nameResolver = nameResolver;
        this.typeTable = typeTable;
        this.source = sourceElement;
    }

    public /* synthetic */ ProtoContainer(kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver nameResolver, kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable typeTable, kotlin.reflect.jvm.internal.impl.descriptors.SourceElement sourceElement, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(nameResolver, typeTable, sourceElement);
    }

    public final kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver getNameResolver() {
        return this.nameResolver;
    }

    public final kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable getTypeTable() {
        return this.typeTable;
    }

    public final kotlin.reflect.jvm.internal.impl.descriptors.SourceElement getSource() {
        return this.source;
    }

    /* JADX INFO: compiled from: ProtoContainer.kt */
    public static final class Class extends kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer {
        private final kotlin.reflect.jvm.internal.impl.name.ClassId classId;
        private final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class classProto;
        private final boolean isInner;
        private final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.Kind kind;
        private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer.Class outerClass;

        public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class getClassProto() {
            return this.classProto;
        }

        public final kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer.Class getOuterClass() {
            return this.outerClass;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Class(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class classProto, kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver nameResolver, kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable typeTable, kotlin.reflect.jvm.internal.impl.descriptors.SourceElement sourceElement, kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer.Class r6) {
            super(nameResolver, typeTable, sourceElement, null);
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(classProto, "classProto");
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(nameResolver, "nameResolver");
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(typeTable, "typeTable");
            this.classProto = classProto;
            this.outerClass = r6;
            this.classId = kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt.getClassId(nameResolver, classProto.getFqName());
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.Kind kind = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.CLASS_KIND.get(classProto.getFlags());
            this.kind = kind == null ? kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.Kind.CLASS : kind;
            java.lang.Boolean bool = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.IS_INNER.get(classProto.getFlags());
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(bool, "Flags.IS_INNER.get(classProto.flags)");
            this.isInner = bool.booleanValue();
        }

        public final kotlin.reflect.jvm.internal.impl.name.ClassId getClassId() {
            return this.classId;
        }

        public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.Kind getKind() {
            return this.kind;
        }

        public final boolean isInner() {
            return this.isInner;
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer
        public kotlin.reflect.jvm.internal.impl.name.FqName debugFqName() {
            kotlin.reflect.jvm.internal.impl.name.FqName fqNameAsSingleFqName = this.classId.asSingleFqName();
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(fqNameAsSingleFqName, "classId.asSingleFqName()");
            return fqNameAsSingleFqName;
        }
    }

    /* JADX INFO: compiled from: ProtoContainer.kt */
    public static final class Package extends kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer {
        private final kotlin.reflect.jvm.internal.impl.name.FqName fqName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Package(kotlin.reflect.jvm.internal.impl.name.FqName fqName, kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver nameResolver, kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable typeTable, kotlin.reflect.jvm.internal.impl.descriptors.SourceElement sourceElement) {
            super(nameResolver, typeTable, sourceElement, null);
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(fqName, "fqName");
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(nameResolver, "nameResolver");
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(typeTable, "typeTable");
            this.fqName = fqName;
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer
        public kotlin.reflect.jvm.internal.impl.name.FqName debugFqName() {
            return this.fqName;
        }
    }

    public java.lang.String toString() {
        return getClass().getSimpleName() + ": " + debugFqName();
    }
}
