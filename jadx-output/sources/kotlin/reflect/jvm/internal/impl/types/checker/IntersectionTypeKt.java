package kotlin.reflect.jvm.internal.impl.types.checker;

/* JADX INFO: compiled from: IntersectionType.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class IntersectionTypeKt {
    public static final kotlin.reflect.jvm.internal.impl.types.UnwrappedType intersectTypes(java.util.List<? extends kotlin.reflect.jvm.internal.impl.types.UnwrappedType> types) {
        kotlin.reflect.jvm.internal.impl.types.SimpleType lowerBound;
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(types, "types");
        int size = types.size();
        if (size == 0) {
            throw new java.lang.IllegalStateException("Expected some types".toString());
        }
        if (size == 1) {
            return (kotlin.reflect.jvm.internal.impl.types.UnwrappedType) kotlin.collections.CollectionsKt.single((java.util.List) types);
        }
        java.util.List<? extends kotlin.reflect.jvm.internal.impl.types.UnwrappedType> list = types;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
        boolean z = false;
        boolean z2 = false;
        for (kotlin.reflect.jvm.internal.impl.types.UnwrappedType unwrappedType : list) {
            z = z || kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt.isError(unwrappedType);
            if (unwrappedType instanceof kotlin.reflect.jvm.internal.impl.types.SimpleType) {
                lowerBound = (kotlin.reflect.jvm.internal.impl.types.SimpleType) unwrappedType;
            } else if (unwrappedType instanceof kotlin.reflect.jvm.internal.impl.types.FlexibleType) {
                if (kotlin.reflect.jvm.internal.impl.types.DynamicTypesKt.isDynamic(unwrappedType)) {
                    return unwrappedType;
                }
                lowerBound = ((kotlin.reflect.jvm.internal.impl.types.FlexibleType) unwrappedType).getLowerBound();
                z2 = true;
            } else {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            arrayList.add(lowerBound);
        }
        java.util.ArrayList arrayList2 = arrayList;
        if (z) {
            kotlin.reflect.jvm.internal.impl.types.SimpleType simpleTypeCreateErrorType = kotlin.reflect.jvm.internal.impl.types.ErrorUtils.createErrorType("Intersection of error types: " + types);
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(simpleTypeCreateErrorType, "ErrorUtils.createErrorTy… of error types: $types\")");
            return simpleTypeCreateErrorType;
        }
        if (!z2) {
            return kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector.INSTANCE.intersectTypes$descriptors(arrayList2);
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList3.add(kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt.upperIfFlexible((kotlin.reflect.jvm.internal.impl.types.UnwrappedType) it.next()));
        }
        return kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.flexibleType(kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector.INSTANCE.intersectTypes$descriptors(arrayList2), kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector.INSTANCE.intersectTypes$descriptors(arrayList3));
    }
}
