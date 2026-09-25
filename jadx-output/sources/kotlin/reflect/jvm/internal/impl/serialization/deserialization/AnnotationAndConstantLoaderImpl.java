package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

/* JADX INFO: compiled from: AnnotationAndConstantLoaderImpl.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class AnnotationAndConstantLoaderImpl implements kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationAndConstantLoader<kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor, kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue<?>> {
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationDeserializer deserializer;
    private final kotlin.reflect.jvm.internal.impl.serialization.SerializerExtensionProtocol protocol;

    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind.PROPERTY.ordinal()] = 1;
            iArr[kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind.PROPERTY_GETTER.ordinal()] = 2;
            iArr[kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind.PROPERTY_SETTER.ordinal()] = 3;
        }
    }

    public AnnotationAndConstantLoaderImpl(kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor module, kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses notFoundClasses, kotlin.reflect.jvm.internal.impl.serialization.SerializerExtensionProtocol protocol) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(module, "module");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(notFoundClasses, "notFoundClasses");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(protocol, "protocol");
        this.protocol = protocol;
        this.deserializer = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationDeserializer(module, notFoundClasses);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationAndConstantLoader
    public java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor> loadClassAnnotations(kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer.Class container) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(container, "container");
        java.util.List listEmptyList = (java.util.List) container.getClassProto().getExtension(this.protocol.getClassAnnotation());
        if (listEmptyList == null) {
            listEmptyList = kotlin.collections.CollectionsKt.emptyList();
        }
        java.util.List list = listEmptyList;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(this.deserializer.deserializeAnnotation((kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation) it.next(), container.getNameResolver()));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationAndConstantLoader
    public java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor> loadCallableAnnotations(kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer container, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite proto, kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind kind) {
        java.util.List listEmptyList;
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(container, "container");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(proto, "proto");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(kind, "kind");
        if (proto instanceof kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor) {
            listEmptyList = (java.util.List) ((kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor) proto).getExtension(this.protocol.getConstructorAnnotation());
        } else if (proto instanceof kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function) {
            listEmptyList = (java.util.List) ((kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function) proto).getExtension(this.protocol.getFunctionAnnotation());
        } else {
            if (!(proto instanceof kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property)) {
                throw new java.lang.IllegalStateException(("Unknown message: " + proto).toString());
            }
            int i = kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationAndConstantLoaderImpl.WhenMappings.$EnumSwitchMapping$0[kind.ordinal()];
            if (i == 1) {
                listEmptyList = (java.util.List) ((kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property) proto).getExtension(this.protocol.getPropertyAnnotation());
            } else if (i == 2) {
                listEmptyList = (java.util.List) ((kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property) proto).getExtension(this.protocol.getPropertyGetterAnnotation());
            } else if (i == 3) {
                listEmptyList = (java.util.List) ((kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property) proto).getExtension(this.protocol.getPropertySetterAnnotation());
            } else {
                throw new java.lang.IllegalStateException("Unsupported callable kind with property proto".toString());
            }
        }
        if (listEmptyList == null) {
            listEmptyList = kotlin.collections.CollectionsKt.emptyList();
        }
        java.util.List list = listEmptyList;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(this.deserializer.deserializeAnnotation((kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation) it.next(), container.getNameResolver()));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationAndConstantLoader
    public java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor> loadPropertyBackingFieldAnnotations(kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer container, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property proto) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(container, "container");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(proto, "proto");
        return kotlin.collections.CollectionsKt.emptyList();
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationAndConstantLoader
    public java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor> loadPropertyDelegateFieldAnnotations(kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer container, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property proto) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(container, "container");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(proto, "proto");
        return kotlin.collections.CollectionsKt.emptyList();
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationAndConstantLoader
    public java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor> loadEnumEntryAnnotations(kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer container, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry proto) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(container, "container");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(proto, "proto");
        java.util.List listEmptyList = (java.util.List) proto.getExtension(this.protocol.getEnumEntryAnnotation());
        if (listEmptyList == null) {
            listEmptyList = kotlin.collections.CollectionsKt.emptyList();
        }
        java.util.List list = listEmptyList;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(this.deserializer.deserializeAnnotation((kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation) it.next(), container.getNameResolver()));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationAndConstantLoader
    public java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor> loadValueParameterAnnotations(kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer container, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite callableProto, kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind kind, int i, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter proto) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(container, "container");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(callableProto, "callableProto");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(kind, "kind");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(proto, "proto");
        java.util.List listEmptyList = (java.util.List) proto.getExtension(this.protocol.getParameterAnnotation());
        if (listEmptyList == null) {
            listEmptyList = kotlin.collections.CollectionsKt.emptyList();
        }
        java.util.List list = listEmptyList;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(this.deserializer.deserializeAnnotation((kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation) it.next(), container.getNameResolver()));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationAndConstantLoader
    public java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor> loadExtensionReceiverParameterAnnotations(kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer container, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite proto, kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind kind) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(container, "container");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(proto, "proto");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(kind, "kind");
        return kotlin.collections.CollectionsKt.emptyList();
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationAndConstantLoader
    public java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor> loadTypeAnnotations(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type proto, kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver nameResolver) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(proto, "proto");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(nameResolver, "nameResolver");
        java.util.List listEmptyList = (java.util.List) proto.getExtension(this.protocol.getTypeAnnotation());
        if (listEmptyList == null) {
            listEmptyList = kotlin.collections.CollectionsKt.emptyList();
        }
        java.util.List list = listEmptyList;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(this.deserializer.deserializeAnnotation((kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation) it.next(), nameResolver));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationAndConstantLoader
    public java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor> loadTypeParameterAnnotations(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter proto, kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver nameResolver) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(proto, "proto");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(nameResolver, "nameResolver");
        java.util.List listEmptyList = (java.util.List) proto.getExtension(this.protocol.getTypeParameterAnnotation());
        if (listEmptyList == null) {
            listEmptyList = kotlin.collections.CollectionsKt.emptyList();
        }
        java.util.List list = listEmptyList;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(this.deserializer.deserializeAnnotation((kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation) it.next(), nameResolver));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationAndConstantLoader
    public kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue<?> loadPropertyConstant(kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer container, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property proto, kotlin.reflect.jvm.internal.impl.types.KotlinType expectedType) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(container, "container");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(proto, "proto");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(expectedType, "expectedType");
        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value value = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value) kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoBufUtilKt.getExtensionOrNull(proto, this.protocol.getCompileTimeValue());
        if (value != null) {
            return this.deserializer.resolveValue(expectedType, value, container.getNameResolver());
        }
        return null;
    }
}
