package kotlin.reflect.jvm.internal.impl.types;

/* JADX INFO: compiled from: SpecialTypes.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class SpecialTypesKt {
    public static final kotlin.reflect.jvm.internal.impl.types.AbbreviatedType getAbbreviatedType(kotlin.reflect.jvm.internal.impl.types.KotlinType getAbbreviatedType) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(getAbbreviatedType, "$this$getAbbreviatedType");
        kotlin.reflect.jvm.internal.impl.types.UnwrappedType unwrappedTypeUnwrap = getAbbreviatedType.unwrap();
        if (!(unwrappedTypeUnwrap instanceof kotlin.reflect.jvm.internal.impl.types.AbbreviatedType)) {
            unwrappedTypeUnwrap = null;
        }
        return (kotlin.reflect.jvm.internal.impl.types.AbbreviatedType) unwrappedTypeUnwrap;
    }

    public static final kotlin.reflect.jvm.internal.impl.types.SimpleType getAbbreviation(kotlin.reflect.jvm.internal.impl.types.KotlinType getAbbreviation) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(getAbbreviation, "$this$getAbbreviation");
        kotlin.reflect.jvm.internal.impl.types.AbbreviatedType abbreviatedType = getAbbreviatedType(getAbbreviation);
        if (abbreviatedType != null) {
            return abbreviatedType.getAbbreviation();
        }
        return null;
    }

    public static final kotlin.reflect.jvm.internal.impl.types.SimpleType withAbbreviation(kotlin.reflect.jvm.internal.impl.types.SimpleType withAbbreviation, kotlin.reflect.jvm.internal.impl.types.SimpleType abbreviatedType) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(withAbbreviation, "$this$withAbbreviation");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(abbreviatedType, "abbreviatedType");
        return kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt.isError(withAbbreviation) ? withAbbreviation : new kotlin.reflect.jvm.internal.impl.types.AbbreviatedType(withAbbreviation, abbreviatedType);
    }

    public static final boolean isDefinitelyNotNullType(kotlin.reflect.jvm.internal.impl.types.KotlinType isDefinitelyNotNullType) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(isDefinitelyNotNullType, "$this$isDefinitelyNotNullType");
        return isDefinitelyNotNullType.unwrap() instanceof kotlin.reflect.jvm.internal.impl.types.DefinitelyNotNullType;
    }

    public static final kotlin.reflect.jvm.internal.impl.types.SimpleType makeSimpleTypeDefinitelyNotNullOrNotNull(kotlin.reflect.jvm.internal.impl.types.SimpleType makeSimpleTypeDefinitelyNotNullOrNotNull) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(makeSimpleTypeDefinitelyNotNullOrNotNull, "$this$makeSimpleTypeDefinitelyNotNullOrNotNull");
        kotlin.reflect.jvm.internal.impl.types.DefinitelyNotNullType definitelyNotNullTypeMakeDefinitelyNotNull$descriptors = kotlin.reflect.jvm.internal.impl.types.DefinitelyNotNullType.Companion.makeDefinitelyNotNull$descriptors(makeSimpleTypeDefinitelyNotNullOrNotNull);
        kotlin.reflect.jvm.internal.impl.types.DefinitelyNotNullType definitelyNotNullTypeMakeIntersectionTypeDefinitelyNotNullOrNotNull = definitelyNotNullTypeMakeDefinitelyNotNull$descriptors != null ? definitelyNotNullTypeMakeDefinitelyNotNull$descriptors : makeIntersectionTypeDefinitelyNotNullOrNotNull(makeSimpleTypeDefinitelyNotNullOrNotNull);
        return definitelyNotNullTypeMakeIntersectionTypeDefinitelyNotNullOrNotNull != null ? definitelyNotNullTypeMakeIntersectionTypeDefinitelyNotNullOrNotNull : makeSimpleTypeDefinitelyNotNullOrNotNull.makeNullableAsSpecified(false);
    }

    public static final kotlin.reflect.jvm.internal.impl.types.UnwrappedType makeDefinitelyNotNullOrNotNull(kotlin.reflect.jvm.internal.impl.types.UnwrappedType makeDefinitelyNotNullOrNotNull) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(makeDefinitelyNotNullOrNotNull, "$this$makeDefinitelyNotNullOrNotNull");
        kotlin.reflect.jvm.internal.impl.types.DefinitelyNotNullType definitelyNotNullTypeMakeDefinitelyNotNull$descriptors = kotlin.reflect.jvm.internal.impl.types.DefinitelyNotNullType.Companion.makeDefinitelyNotNull$descriptors(makeDefinitelyNotNullOrNotNull);
        kotlin.reflect.jvm.internal.impl.types.SimpleType simpleTypeMakeIntersectionTypeDefinitelyNotNullOrNotNull = definitelyNotNullTypeMakeDefinitelyNotNull$descriptors != null ? definitelyNotNullTypeMakeDefinitelyNotNull$descriptors : makeIntersectionTypeDefinitelyNotNullOrNotNull(makeDefinitelyNotNullOrNotNull);
        return simpleTypeMakeIntersectionTypeDefinitelyNotNullOrNotNull != null ? simpleTypeMakeIntersectionTypeDefinitelyNotNullOrNotNull : makeDefinitelyNotNullOrNotNull.makeNullableAsSpecified(false);
    }

    private static final kotlin.reflect.jvm.internal.impl.types.SimpleType makeIntersectionTypeDefinitelyNotNullOrNotNull(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor intersectionTypeConstructorMakeDefinitelyNotNullOrNotNull;
        kotlin.reflect.jvm.internal.impl.types.TypeConstructor constructor = kotlinType.getConstructor();
        if (!(constructor instanceof kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor)) {
            constructor = null;
        }
        kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor intersectionTypeConstructor = (kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor) constructor;
        if (intersectionTypeConstructor == null || (intersectionTypeConstructorMakeDefinitelyNotNullOrNotNull = makeDefinitelyNotNullOrNotNull(intersectionTypeConstructor)) == null) {
            return null;
        }
        return kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.simpleTypeWithNonTrivialMemberScope(kotlinType.getAnnotations(), intersectionTypeConstructorMakeDefinitelyNotNullOrNotNull, kotlin.collections.CollectionsKt.emptyList(), false, intersectionTypeConstructorMakeDefinitelyNotNullOrNotNull.createScopeForKotlinType());
    }

    private static final kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor makeDefinitelyNotNullOrNotNull(kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor intersectionTypeConstructor) {
        java.util.Collection<kotlin.reflect.jvm.internal.impl.types.KotlinType> collectionMo1269getSupertypes = intersectionTypeConstructor.mo1269getSupertypes();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(collectionMo1269getSupertypes, 10));
        boolean z = false;
        for (kotlin.reflect.jvm.internal.impl.types.UnwrappedType unwrappedTypeMakeDefinitelyNotNullOrNotNull : collectionMo1269getSupertypes) {
            if (kotlin.reflect.jvm.internal.impl.types.TypeUtils.isNullableType(unwrappedTypeMakeDefinitelyNotNullOrNotNull)) {
                z = true;
                unwrappedTypeMakeDefinitelyNotNullOrNotNull = makeDefinitelyNotNullOrNotNull(unwrappedTypeMakeDefinitelyNotNullOrNotNull.unwrap());
            }
            arrayList.add(unwrappedTypeMakeDefinitelyNotNullOrNotNull);
        }
        java.util.ArrayList arrayList2 = arrayList;
        if (z) {
            return new kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor(arrayList2);
        }
        return null;
    }
}
