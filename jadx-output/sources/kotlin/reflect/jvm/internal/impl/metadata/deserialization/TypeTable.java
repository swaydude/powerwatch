package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

/* JADX INFO: compiled from: TypeTable.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class TypeTable {
    private final java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type> types;

    public TypeTable(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable typeTable) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(typeTable, "typeTable");
        java.util.ArrayList originalTypes = typeTable.getTypeList();
        if (typeTable.hasFirstNullable()) {
            int firstNullable = typeTable.getFirstNullable();
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type> typeList = typeTable.getTypeList();
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(typeList, "typeTable.typeList");
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type> list = typeList;
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
            int i = 0;
            for (java.lang.Object obj : list) {
                int i2 = i + 1;
                if (i < 0) {
                    kotlin.collections.CollectionsKt.throwIndexOverflow();
                }
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type typeBuild = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type) obj;
                if (i >= firstNullable) {
                    typeBuild = typeBuild.toBuilder().setNullable(true).build();
                }
                arrayList.add(typeBuild);
                i = i2;
            }
            originalTypes = arrayList;
        } else {
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(originalTypes, "originalTypes");
        }
        this.types = originalTypes;
    }

    public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type get(int i) {
        return this.types.get(i);
    }
}
