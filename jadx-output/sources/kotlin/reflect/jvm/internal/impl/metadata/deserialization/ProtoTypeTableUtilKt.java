package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

/* JADX INFO: compiled from: protoTypeTableUtil.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class ProtoTypeTableUtilKt {
    public static final java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type> supertypes(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class supertypes, kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable typeTable) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(supertypes, "$this$supertypes");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(typeTable, "typeTable");
        java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type> supertypeList = supertypes.getSupertypeList();
        if (!(!supertypeList.isEmpty())) {
            supertypeList = null;
        }
        if (supertypeList != null) {
            return supertypeList;
        }
        java.util.List<java.lang.Integer> supertypeIdList = supertypes.getSupertypeIdList();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(supertypeIdList, "supertypeIdList");
        java.util.List<java.lang.Integer> list = supertypeIdList;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
        for (java.lang.Integer it : list) {
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(it, "it");
            arrayList.add(typeTable.get(it.intValue()));
        }
        return arrayList;
    }

    public static final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type type(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument type, kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable typeTable) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(type, "$this$type");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(typeTable, "typeTable");
        if (type.hasType()) {
            return type.getType();
        }
        if (type.hasTypeId()) {
            return typeTable.get(type.getTypeId());
        }
        return null;
    }

    public static final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type flexibleUpperBound(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type flexibleUpperBound, kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable typeTable) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(flexibleUpperBound, "$this$flexibleUpperBound");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(typeTable, "typeTable");
        if (flexibleUpperBound.hasFlexibleUpperBound()) {
            return flexibleUpperBound.getFlexibleUpperBound();
        }
        if (flexibleUpperBound.hasFlexibleUpperBoundId()) {
            return typeTable.get(flexibleUpperBound.getFlexibleUpperBoundId());
        }
        return null;
    }

    public static final java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type> upperBounds(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter upperBounds, kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable typeTable) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(upperBounds, "$this$upperBounds");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(typeTable, "typeTable");
        java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type> upperBoundList = upperBounds.getUpperBoundList();
        if (!(!upperBoundList.isEmpty())) {
            upperBoundList = null;
        }
        if (upperBoundList != null) {
            return upperBoundList;
        }
        java.util.List<java.lang.Integer> upperBoundIdList = upperBounds.getUpperBoundIdList();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(upperBoundIdList, "upperBoundIdList");
        java.util.List<java.lang.Integer> list = upperBoundIdList;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
        for (java.lang.Integer it : list) {
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(it, "it");
            arrayList.add(typeTable.get(it.intValue()));
        }
        return arrayList;
    }

    public static final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type returnType(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function returnType, kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable typeTable) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(returnType, "$this$returnType");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(typeTable, "typeTable");
        if (returnType.hasReturnType()) {
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type returnType2 = returnType.getReturnType();
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(returnType2, "returnType");
            return returnType2;
        }
        if (returnType.hasReturnTypeId()) {
            return typeTable.get(returnType.getReturnTypeId());
        }
        throw new java.lang.IllegalStateException("No returnType in ProtoBuf.Function".toString());
    }

    public static final boolean hasReceiver(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function hasReceiver) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(hasReceiver, "$this$hasReceiver");
        return hasReceiver.hasReceiverType() || hasReceiver.hasReceiverTypeId();
    }

    public static final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type receiverType(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function receiverType, kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable typeTable) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiverType, "$this$receiverType");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(typeTable, "typeTable");
        if (receiverType.hasReceiverType()) {
            return receiverType.getReceiverType();
        }
        if (receiverType.hasReceiverTypeId()) {
            return typeTable.get(receiverType.getReceiverTypeId());
        }
        return null;
    }

    public static final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type returnType(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property returnType, kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable typeTable) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(returnType, "$this$returnType");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(typeTable, "typeTable");
        if (returnType.hasReturnType()) {
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type returnType2 = returnType.getReturnType();
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(returnType2, "returnType");
            return returnType2;
        }
        if (returnType.hasReturnTypeId()) {
            return typeTable.get(returnType.getReturnTypeId());
        }
        throw new java.lang.IllegalStateException("No returnType in ProtoBuf.Property".toString());
    }

    public static final boolean hasReceiver(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property hasReceiver) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(hasReceiver, "$this$hasReceiver");
        return hasReceiver.hasReceiverType() || hasReceiver.hasReceiverTypeId();
    }

    public static final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type receiverType(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property receiverType, kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable typeTable) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiverType, "$this$receiverType");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(typeTable, "typeTable");
        if (receiverType.hasReceiverType()) {
            return receiverType.getReceiverType();
        }
        if (receiverType.hasReceiverTypeId()) {
            return typeTable.get(receiverType.getReceiverTypeId());
        }
        return null;
    }

    public static final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type type(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter type, kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable typeTable) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(type, "$this$type");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(typeTable, "typeTable");
        if (type.hasType()) {
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type type2 = type.getType();
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(type2, "type");
            return type2;
        }
        if (type.hasTypeId()) {
            return typeTable.get(type.getTypeId());
        }
        throw new java.lang.IllegalStateException("No type in ProtoBuf.ValueParameter".toString());
    }

    public static final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type varargElementType(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter varargElementType, kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable typeTable) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(varargElementType, "$this$varargElementType");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(typeTable, "typeTable");
        if (varargElementType.hasVarargElementType()) {
            return varargElementType.getVarargElementType();
        }
        if (varargElementType.hasVarargElementTypeId()) {
            return typeTable.get(varargElementType.getVarargElementTypeId());
        }
        return null;
    }

    public static final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type outerType(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type outerType, kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable typeTable) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(outerType, "$this$outerType");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(typeTable, "typeTable");
        if (outerType.hasOuterType()) {
            return outerType.getOuterType();
        }
        if (outerType.hasOuterTypeId()) {
            return typeTable.get(outerType.getOuterTypeId());
        }
        return null;
    }

    public static final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type abbreviatedType(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type abbreviatedType, kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable typeTable) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(abbreviatedType, "$this$abbreviatedType");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(typeTable, "typeTable");
        if (abbreviatedType.hasAbbreviatedType()) {
            return abbreviatedType.getAbbreviatedType();
        }
        if (abbreviatedType.hasAbbreviatedTypeId()) {
            return typeTable.get(abbreviatedType.getAbbreviatedTypeId());
        }
        return null;
    }

    public static final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type underlyingType(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias underlyingType, kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable typeTable) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(underlyingType, "$this$underlyingType");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(typeTable, "typeTable");
        if (underlyingType.hasUnderlyingType()) {
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type underlyingType2 = underlyingType.getUnderlyingType();
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(underlyingType2, "underlyingType");
            return underlyingType2;
        }
        if (underlyingType.hasUnderlyingTypeId()) {
            return typeTable.get(underlyingType.getUnderlyingTypeId());
        }
        throw new java.lang.IllegalStateException("No underlyingType in ProtoBuf.TypeAlias".toString());
    }

    public static final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type expandedType(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias expandedType, kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable typeTable) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(expandedType, "$this$expandedType");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(typeTable, "typeTable");
        if (expandedType.hasExpandedType()) {
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type expandedType2 = expandedType.getExpandedType();
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(expandedType2, "expandedType");
            return expandedType2;
        }
        if (expandedType.hasExpandedTypeId()) {
            return typeTable.get(expandedType.getExpandedTypeId());
        }
        throw new java.lang.IllegalStateException("No expandedType in ProtoBuf.TypeAlias".toString());
    }
}
