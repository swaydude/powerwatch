package kotlin.reflect.jvm.internal.impl.builtins.jvm;

/* JADX INFO: compiled from: mappingUtil.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class MappingUtilKt {
    public static final kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution createMappedTypeParametersSubstitution(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor from, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor to) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(from, "from");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(to, "to");
        from.getDeclaredTypeParameters().size();
        to.getDeclaredTypeParameters().size();
        kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution.Companion companion = kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution.Companion;
        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> declaredTypeParameters = from.getDeclaredTypeParameters();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(declaredTypeParameters, "from.declaredTypeParameters");
        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> list = declaredTypeParameters;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor) it.next()).getTypeConstructor());
        }
        java.util.ArrayList arrayList2 = arrayList;
        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> declaredTypeParameters2 = to.getDeclaredTypeParameters();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(declaredTypeParameters2, "to.declaredTypeParameters");
        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> list2 = declaredTypeParameters2;
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor it2 : list2) {
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(it2, "it");
            kotlin.reflect.jvm.internal.impl.types.SimpleType defaultType = it2.getDefaultType();
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(defaultType, "it.defaultType");
            arrayList3.add(kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.asTypeProjection(defaultType));
        }
        return kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution.Companion.createByConstructorsMap$default(companion, kotlin.collections.MapsKt.toMap(kotlin.collections.CollectionsKt.zip(arrayList2, arrayList3)), false, 2, null);
    }
}
