package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

/* JADX INFO: compiled from: DeserializedTypeParameterDescriptor.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class DeserializedTypeParameterDescriptor extends kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractLazyTypeParameterDescriptor {
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedAnnotations annotations;
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext c;
    private final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter proto;

    public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter getProto() {
        return this.proto;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DeserializedTypeParameterDescriptor(kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext c, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter proto, int i) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(c, "c");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(proto, "proto");
        kotlin.reflect.jvm.internal.impl.storage.StorageManager storageManager = c.getStorageManager();
        kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor containingDeclaration = c.getContainingDeclaration();
        kotlin.reflect.jvm.internal.impl.name.Name name = kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt.getName(c.getNameResolver(), proto.getName());
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoEnumFlags protoEnumFlags = kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoEnumFlags.INSTANCE;
        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter.Variance variance = proto.getVariance();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(variance, "proto.variance");
        super(storageManager, containingDeclaration, name, protoEnumFlags.variance(variance), proto.getReified(), i, kotlin.reflect.jvm.internal.impl.descriptors.SourceElement.NO_SOURCE, kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker.EMPTY.INSTANCE);
        this.c = c;
        this.proto = proto;
        this.annotations = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedAnnotations(c.getStorageManager(), new kotlin.jvm.functions.Function0<java.util.List<? extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedTypeParameterDescriptor$annotations$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final java.util.List<? extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor> invoke() {
                return kotlin.collections.CollectionsKt.toList(this.this$0.c.getComponents().getAnnotationAndConstantLoader().loadTypeParameterAnnotations(this.this$0.getProto(), this.this$0.c.getNameResolver()));
            }
        });
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotatedImpl, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    public kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedAnnotations getAnnotations() {
        return this.annotations;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeParameterDescriptor
    protected java.util.List<kotlin.reflect.jvm.internal.impl.types.KotlinType> resolveUpperBounds() {
        java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type> listUpperBounds = kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt.upperBounds(this.proto, this.c.getTypeTable());
        if (listUpperBounds.isEmpty()) {
            return kotlin.collections.CollectionsKt.listOf(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getBuiltIns(this).getDefaultBound());
        }
        java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type> list = listUpperBounds;
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer typeDeserializer = this.c.getTypeDeserializer();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(typeDeserializer.type((kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type) it.next()));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeParameterDescriptor
    /* JADX INFO: renamed from: reportSupertypeLoopError, reason: merged with bridge method [inline-methods] */
    public java.lang.Void mo1271reportSupertypeLoopError(kotlin.reflect.jvm.internal.impl.types.KotlinType type) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(type, "type");
        throw new java.lang.IllegalStateException("There should be no cycles for deserialized type parameters, but found for: " + this);
    }
}
