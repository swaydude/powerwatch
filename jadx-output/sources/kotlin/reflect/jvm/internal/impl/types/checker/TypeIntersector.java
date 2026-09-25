package kotlin.reflect.jvm.internal.impl.types.checker;

/* JADX INFO: compiled from: IntersectionType.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class TypeIntersector {
    public static final kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector INSTANCE = new kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector();

    private TypeIntersector() {
    }

    public final kotlin.reflect.jvm.internal.impl.types.SimpleType intersectTypes$descriptors(java.util.List<? extends kotlin.reflect.jvm.internal.impl.types.SimpleType> types) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(types, "types");
        types.size();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (kotlin.reflect.jvm.internal.impl.types.SimpleType simpleType : types) {
            if (simpleType.getConstructor() instanceof kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor) {
                java.util.Collection<kotlin.reflect.jvm.internal.impl.types.KotlinType> collectionMo1269getSupertypes = simpleType.getConstructor().mo1269getSupertypes();
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(collectionMo1269getSupertypes, "type.constructor.supertypes");
                java.util.Collection<kotlin.reflect.jvm.internal.impl.types.KotlinType> collection = collectionMo1269getSupertypes;
                java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(collection, 10));
                for (kotlin.reflect.jvm.internal.impl.types.KotlinType it : collection) {
                    kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(it, "it");
                    kotlin.reflect.jvm.internal.impl.types.SimpleType simpleTypeUpperIfFlexible = kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt.upperIfFlexible(it);
                    if (simpleType.isMarkedNullable()) {
                        simpleTypeUpperIfFlexible = simpleTypeUpperIfFlexible.makeNullableAsSpecified(true);
                    }
                    arrayList2.add(simpleTypeUpperIfFlexible);
                }
                arrayList.addAll(arrayList2);
            } else {
                arrayList.add(simpleType);
            }
        }
        java.util.ArrayList<kotlin.reflect.jvm.internal.impl.types.SimpleType> arrayList3 = arrayList;
        kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector.ResultNullability resultNullabilityCombine = kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector.ResultNullability.START;
        java.util.Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            resultNullabilityCombine = resultNullabilityCombine.combine((kotlin.reflect.jvm.internal.impl.types.UnwrappedType) it2.next());
        }
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        for (kotlin.reflect.jvm.internal.impl.types.SimpleType simpleTypeMakeSimpleTypeDefinitelyNotNullOrNotNull : arrayList3) {
            if (resultNullabilityCombine == kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector.ResultNullability.NOT_NULL) {
                simpleTypeMakeSimpleTypeDefinitelyNotNullOrNotNull = kotlin.reflect.jvm.internal.impl.types.SpecialTypesKt.makeSimpleTypeDefinitelyNotNullOrNotNull(simpleTypeMakeSimpleTypeDefinitelyNotNullOrNotNull);
            }
            linkedHashSet.add(simpleTypeMakeSimpleTypeDefinitelyNotNullOrNotNull);
        }
        return intersectTypesWithoutIntersectionType(linkedHashSet);
    }

    private final kotlin.reflect.jvm.internal.impl.types.SimpleType intersectTypesWithoutIntersectionType(final java.util.Set<? extends kotlin.reflect.jvm.internal.impl.types.SimpleType> set) {
        if (set.size() == 1) {
            return (kotlin.reflect.jvm.internal.impl.types.SimpleType) kotlin.collections.CollectionsKt.single(set);
        }
        new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector$intersectTypesWithoutIntersectionType$errorMessage$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final java.lang.String invoke() {
                return "This collections cannot be empty! input types: " + kotlin.collections.CollectionsKt.joinToString$default(set, null, null, null, 0, null, null, 63, null);
            }
        };
        java.util.Set<? extends kotlin.reflect.jvm.internal.impl.types.SimpleType> set2 = set;
        java.util.Collection<kotlin.reflect.jvm.internal.impl.types.SimpleType> collectionFilterTypes = filterTypes(set2, new kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector$intersectTypesWithoutIntersectionType$filteredEqualTypes$1(this));
        collectionFilterTypes.isEmpty();
        kotlin.reflect.jvm.internal.impl.types.SimpleType simpleTypeFindIntersectionType = kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor.Companion.findIntersectionType(collectionFilterTypes);
        if (simpleTypeFindIntersectionType != null) {
            return simpleTypeFindIntersectionType;
        }
        java.util.Collection<kotlin.reflect.jvm.internal.impl.types.SimpleType> collectionFilterTypes2 = filterTypes(collectionFilterTypes, new kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector$intersectTypesWithoutIntersectionType$filteredSuperAndEqualTypes$1(kotlin.reflect.jvm.internal.impl.types.checker.NewKotlinTypeChecker.INSTANCE));
        collectionFilterTypes2.isEmpty();
        if (collectionFilterTypes2.size() < 2) {
            return (kotlin.reflect.jvm.internal.impl.types.SimpleType) kotlin.collections.CollectionsKt.single(collectionFilterTypes2);
        }
        kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor intersectionTypeConstructor = new kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor(set2);
        return kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.simpleTypeWithNonTrivialMemberScope(kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations.Companion.getEMPTY(), intersectionTypeConstructor, kotlin.collections.CollectionsKt.emptyList(), false, intersectionTypeConstructor.createScopeForKotlinType());
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0058  */
    private final java.util.Collection<kotlin.reflect.jvm.internal.impl.types.SimpleType> filterTypes(java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.types.SimpleType> collection, kotlin.jvm.functions.Function2<? super kotlin.reflect.jvm.internal.impl.types.SimpleType, ? super kotlin.reflect.jvm.internal.impl.types.SimpleType, java.lang.Boolean> function2) {
        boolean z;
        java.util.ArrayList arrayList = new java.util.ArrayList(collection);
        java.util.Iterator it = arrayList.iterator();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(it, "filteredTypes.iterator()");
        while (it.hasNext()) {
            kotlin.reflect.jvm.internal.impl.types.SimpleType upper = (kotlin.reflect.jvm.internal.impl.types.SimpleType) it.next();
            java.util.ArrayList arrayList2 = arrayList;
            boolean z2 = true;
            if (!(arrayList2 instanceof java.util.Collection) || !arrayList2.isEmpty()) {
                java.util.Iterator it2 = arrayList2.iterator();
                do {
                    if (!it2.hasNext()) {
                        z2 = false;
                        break;
                    }
                    kotlin.reflect.jvm.internal.impl.types.SimpleType lower = (kotlin.reflect.jvm.internal.impl.types.SimpleType) it2.next();
                    if (lower != upper) {
                        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(lower, "lower");
                        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(upper, "upper");
                        if (function2.invoke(lower, upper).booleanValue()) {
                            z = true;
                        } else {
                            z = false;
                        }
                    } else {
                        z = false;
                    }
                } while (!z);
            } else {
                z2 = false;
                break;
            }
            if (z2) {
                it.remove();
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isStrictSupertype(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType, kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType2) {
        kotlin.reflect.jvm.internal.impl.types.checker.NewKotlinTypeChecker newKotlinTypeChecker = kotlin.reflect.jvm.internal.impl.types.checker.NewKotlinTypeChecker.INSTANCE;
        return newKotlinTypeChecker.isSubtypeOf(kotlinType, kotlinType2) && !newKotlinTypeChecker.isSubtypeOf(kotlinType2, kotlinType);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: IntersectionType.kt */
    private static final class ResultNullability {
        private static final /* synthetic */ kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector.ResultNullability[] $VALUES;
        public static final kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector.ResultNullability ACCEPT_NULL;
        public static final kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector.ResultNullability NOT_NULL;
        public static final kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector.ResultNullability START;
        public static final kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector.ResultNullability UNKNOWN;

        static {
            kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector.ResultNullability.START start = new kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector.ResultNullability.START("START", 0);
            START = start;
            kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector.ResultNullability.ACCEPT_NULL accept_null = new kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector.ResultNullability.ACCEPT_NULL("ACCEPT_NULL", 1);
            ACCEPT_NULL = accept_null;
            kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector.ResultNullability.UNKNOWN unknown = new kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector.ResultNullability.UNKNOWN("UNKNOWN", 2);
            UNKNOWN = unknown;
            kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector.ResultNullability.NOT_NULL not_null = new kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector.ResultNullability.NOT_NULL("NOT_NULL", 3);
            NOT_NULL = not_null;
            $VALUES = new kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector.ResultNullability[]{start, accept_null, unknown, not_null};
        }

        public static kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector.ResultNullability valueOf(java.lang.String str) {
            return (kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector.ResultNullability) java.lang.Enum.valueOf(kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector.ResultNullability.class, str);
        }

        public static kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector.ResultNullability[] values() {
            return (kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector.ResultNullability[]) $VALUES.clone();
        }

        public abstract kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector.ResultNullability combine(kotlin.reflect.jvm.internal.impl.types.UnwrappedType unwrappedType);

        /* JADX INFO: compiled from: IntersectionType.kt */
        static final class START extends kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector.ResultNullability {
            START(java.lang.String str, int i) {
                super(str, i, null);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector.ResultNullability
            public kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector.ResultNullability combine(kotlin.reflect.jvm.internal.impl.types.UnwrappedType nextType) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(nextType, "nextType");
                return getResultNullability(nextType);
            }
        }

        private ResultNullability(java.lang.String str, int i) {
            super(str, i);
        }

        public /* synthetic */ ResultNullability(java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        /* JADX INFO: compiled from: IntersectionType.kt */
        static final class ACCEPT_NULL extends kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector.ResultNullability {
            ACCEPT_NULL(java.lang.String str, int i) {
                super(str, i, null);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector.ResultNullability
            public kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector.ResultNullability combine(kotlin.reflect.jvm.internal.impl.types.UnwrappedType nextType) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(nextType, "nextType");
                return getResultNullability(nextType);
            }
        }

        /* JADX INFO: compiled from: IntersectionType.kt */
        static final class UNKNOWN extends kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector.ResultNullability {
            UNKNOWN(java.lang.String str, int i) {
                super(str, i, null);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector.ResultNullability
            public kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector.ResultNullability combine(kotlin.reflect.jvm.internal.impl.types.UnwrappedType nextType) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(nextType, "nextType");
                kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector.ResultNullability resultNullability = getResultNullability(nextType);
                return resultNullability == kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector.ResultNullability.ACCEPT_NULL ? this : resultNullability;
            }
        }

        /* JADX INFO: compiled from: IntersectionType.kt */
        static final class NOT_NULL extends kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector.ResultNullability {
            @Override // kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector.ResultNullability
            public kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector.ResultNullability.NOT_NULL combine(kotlin.reflect.jvm.internal.impl.types.UnwrappedType nextType) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(nextType, "nextType");
                return this;
            }

            NOT_NULL(java.lang.String str, int i) {
                super(str, i, null);
            }
        }

        protected final kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector.ResultNullability getResultNullability(kotlin.reflect.jvm.internal.impl.types.UnwrappedType resultNullability) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(resultNullability, "$this$resultNullability");
            if (resultNullability.isMarkedNullable()) {
                return ACCEPT_NULL;
            }
            return kotlin.reflect.jvm.internal.impl.types.checker.NullabilityChecker.INSTANCE.isSubtypeOfAny(resultNullability) ? NOT_NULL : UNKNOWN;
        }
    }
}
