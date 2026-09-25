package kotlin.reflect.jvm.internal.impl.types;

/* JADX INFO: compiled from: AbstractTypeChecker.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class AbstractNullabilityChecker {
    public static final kotlin.reflect.jvm.internal.impl.types.AbstractNullabilityChecker INSTANCE = new kotlin.reflect.jvm.internal.impl.types.AbstractNullabilityChecker();

    private AbstractNullabilityChecker() {
    }

    public final boolean isPossibleSubtype(kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext context, kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker subType, kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker superType) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(context, "context");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(subType, "subType");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(superType, "superType");
        return runIsPossibleSubtype(context, subType, superType);
    }

    private final boolean runIsPossibleSubtype(kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext abstractTypeCheckerContext, kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker simpleTypeMarker, kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker simpleTypeMarker2) {
        if (!abstractTypeCheckerContext.isSingleClassifierType(simpleTypeMarker) && !abstractTypeCheckerContext.isIntersection(abstractTypeCheckerContext.typeConstructor(simpleTypeMarker))) {
            abstractTypeCheckerContext.isAllowedTypeVariable(simpleTypeMarker);
        }
        if (!abstractTypeCheckerContext.isSingleClassifierType(simpleTypeMarker2)) {
            abstractTypeCheckerContext.isAllowedTypeVariable(simpleTypeMarker2);
        }
        if (abstractTypeCheckerContext.isMarkedNullable(simpleTypeMarker2) || abstractTypeCheckerContext.isDefinitelyNotNullType(simpleTypeMarker) || hasNotNullSupertype(abstractTypeCheckerContext, simpleTypeMarker, kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext.SupertypesPolicy.LowerIfFlexible.INSTANCE)) {
            return true;
        }
        if (abstractTypeCheckerContext.isDefinitelyNotNullType(simpleTypeMarker2) || hasNotNullSupertype(abstractTypeCheckerContext, simpleTypeMarker2, kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext.SupertypesPolicy.UpperIfFlexible.INSTANCE) || abstractTypeCheckerContext.isClassType(simpleTypeMarker)) {
            return false;
        }
        return hasPathByNotMarkedNullableNodes(abstractTypeCheckerContext, simpleTypeMarker, abstractTypeCheckerContext.typeConstructor(simpleTypeMarker2));
    }

    public final boolean hasNotNullSupertype(kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext hasNotNullSupertype, kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker type, kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext.SupertypesPolicy supertypesPolicy) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(hasNotNullSupertype, "$this$hasNotNullSupertype");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(type, "type");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(supertypesPolicy, "supertypesPolicy");
        if (!((hasNotNullSupertype.isClassType(type) && !hasNotNullSupertype.isMarkedNullable(type)) || hasNotNullSupertype.isDefinitelyNotNullType(type))) {
            hasNotNullSupertype.initialize();
            java.util.ArrayDeque<kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker> supertypesDeque = hasNotNullSupertype.getSupertypesDeque();
            if (supertypesDeque == null) {
                kotlin.jvm.internal.Intrinsics.throwNpe();
            }
            java.util.Set<kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker> supertypesSet = hasNotNullSupertype.getSupertypesSet();
            if (supertypesSet == null) {
                kotlin.jvm.internal.Intrinsics.throwNpe();
            }
            supertypesDeque.push(type);
            while (!supertypesDeque.isEmpty()) {
                if (supertypesSet.size() > 1000) {
                    throw new java.lang.IllegalStateException(("Too many supertypes for type: " + type + ". Supertypes = " + kotlin.collections.CollectionsKt.joinToString$default(supertypesSet, null, null, null, 0, null, null, 63, null)).toString());
                }
                kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker current = supertypesDeque.pop();
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(current, "current");
                if (supertypesSet.add(current)) {
                    kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext.SupertypesPolicy.None none = hasNotNullSupertype.isMarkedNullable(current) ? kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext.SupertypesPolicy.None.INSTANCE : supertypesPolicy;
                    if (!(!kotlin.jvm.internal.Intrinsics.areEqual(none, kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext.SupertypesPolicy.None.INSTANCE))) {
                        none = null;
                    }
                    if (none != null) {
                        java.util.Iterator<kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker> it = hasNotNullSupertype.supertypes(hasNotNullSupertype.typeConstructor(current)).iterator();
                        while (it.hasNext()) {
                            kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker simpleTypeMarkerMo1272transformType = none.mo1272transformType(hasNotNullSupertype, it.next());
                            if ((hasNotNullSupertype.isClassType(simpleTypeMarkerMo1272transformType) && !hasNotNullSupertype.isMarkedNullable(simpleTypeMarkerMo1272transformType)) || hasNotNullSupertype.isDefinitelyNotNullType(simpleTypeMarkerMo1272transformType)) {
                                hasNotNullSupertype.clear();
                            } else {
                                supertypesDeque.add(simpleTypeMarkerMo1272transformType);
                            }
                        }
                    } else {
                        continue;
                    }
                }
            }
            hasNotNullSupertype.clear();
            return false;
        }
        return true;
    }

    public final boolean hasPathByNotMarkedNullableNodes(kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext hasPathByNotMarkedNullableNodes, kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker start, kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker end) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(hasPathByNotMarkedNullableNodes, "$this$hasPathByNotMarkedNullableNodes");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(start, "start");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(end, "end");
        if (!(hasPathByNotMarkedNullableNodes.isNotNullNothing(start) || (!hasPathByNotMarkedNullableNodes.isMarkedNullable(start) && hasPathByNotMarkedNullableNodes.isEqualTypeConstructors(hasPathByNotMarkedNullableNodes.typeConstructor(start), end)))) {
            hasPathByNotMarkedNullableNodes.initialize();
            java.util.ArrayDeque<kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker> supertypesDeque = hasPathByNotMarkedNullableNodes.getSupertypesDeque();
            if (supertypesDeque == null) {
                kotlin.jvm.internal.Intrinsics.throwNpe();
            }
            java.util.Set<kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker> supertypesSet = hasPathByNotMarkedNullableNodes.getSupertypesSet();
            if (supertypesSet == null) {
                kotlin.jvm.internal.Intrinsics.throwNpe();
            }
            supertypesDeque.push(start);
            while (!supertypesDeque.isEmpty()) {
                if (supertypesSet.size() > 1000) {
                    throw new java.lang.IllegalStateException(("Too many supertypes for type: " + start + ". Supertypes = " + kotlin.collections.CollectionsKt.joinToString$default(supertypesSet, null, null, null, 0, null, null, 63, null)).toString());
                }
                kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker current = supertypesDeque.pop();
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(current, "current");
                if (supertypesSet.add(current)) {
                    kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext.SupertypesPolicy supertypesPolicy = hasPathByNotMarkedNullableNodes.isMarkedNullable(current) ? kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext.SupertypesPolicy.None.INSTANCE : kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext.SupertypesPolicy.LowerIfFlexible.INSTANCE;
                    if (!(!kotlin.jvm.internal.Intrinsics.areEqual(supertypesPolicy, kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext.SupertypesPolicy.None.INSTANCE))) {
                        supertypesPolicy = null;
                    }
                    if (supertypesPolicy != null) {
                        java.util.Iterator<kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker> it = hasPathByNotMarkedNullableNodes.supertypes(hasPathByNotMarkedNullableNodes.typeConstructor(current)).iterator();
                        while (it.hasNext()) {
                            kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker simpleTypeMarkerMo1272transformType = supertypesPolicy.mo1272transformType(hasPathByNotMarkedNullableNodes, it.next());
                            if (hasPathByNotMarkedNullableNodes.isNotNullNothing(simpleTypeMarkerMo1272transformType) || (!hasPathByNotMarkedNullableNodes.isMarkedNullable(simpleTypeMarkerMo1272transformType) && hasPathByNotMarkedNullableNodes.isEqualTypeConstructors(hasPathByNotMarkedNullableNodes.typeConstructor(simpleTypeMarkerMo1272transformType), end))) {
                                hasPathByNotMarkedNullableNodes.clear();
                            } else {
                                supertypesDeque.add(simpleTypeMarkerMo1272transformType);
                            }
                        }
                    } else {
                        continue;
                    }
                }
            }
            hasPathByNotMarkedNullableNodes.clear();
            return false;
        }
        return true;
    }
}
