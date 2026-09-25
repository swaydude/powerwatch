package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

/* JADX INFO: compiled from: ProtoBasedClassDataFinder.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class ProtoBasedClassDataFinder implements kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDataFinder {
    private final java.util.Map<kotlin.reflect.jvm.internal.impl.name.ClassId, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class> classIdToProto;
    private final kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.name.ClassId, kotlin.reflect.jvm.internal.impl.descriptors.SourceElement> classSource;
    private final kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion metadataVersion;
    private final kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver nameResolver;

    /* JADX WARN: Multi-variable type inference failed */
    public ProtoBasedClassDataFinder(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment proto, kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver nameResolver, kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion metadataVersion, kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.ClassId, ? extends kotlin.reflect.jvm.internal.impl.descriptors.SourceElement> classSource) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(proto, "proto");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(nameResolver, "nameResolver");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(metadataVersion, "metadataVersion");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(classSource, "classSource");
        this.nameResolver = nameResolver;
        this.metadataVersion = metadataVersion;
        this.classSource = classSource;
        java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class> class_List = proto.getClass_List();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(class_List, "proto.class_List");
        java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class> list = class_List;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kotlin.ranges.RangesKt.coerceAtLeast(kotlin.collections.MapsKt.mapCapacity(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10)), 16));
        for (java.lang.Object obj : list) {
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class klass = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class) obj;
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver nameResolver2 = this.nameResolver;
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(klass, "klass");
            linkedHashMap.put(kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt.getClassId(nameResolver2, klass.getFqName()), obj);
        }
        this.classIdToProto = linkedHashMap;
    }

    public final java.util.Collection<kotlin.reflect.jvm.internal.impl.name.ClassId> getAllClassIds() {
        return this.classIdToProto.keySet();
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDataFinder
    public kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassData findClassData(kotlin.reflect.jvm.internal.impl.name.ClassId classId) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(classId, "classId");
        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class r0 = this.classIdToProto.get(classId);
        if (r0 != null) {
            return new kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassData(this.nameResolver, r0, this.metadataVersion, this.classSource.invoke(classId));
        }
        return null;
    }
}
