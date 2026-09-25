package kotlin.reflect.jvm.internal.impl.resolve.constants;

/* JADX INFO: compiled from: IntegerLiteralTypeConstructor.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class IntegerLiteralTypeConstructor implements kotlin.reflect.jvm.internal.impl.types.TypeConstructor {
    static final /* synthetic */ kotlin.reflect.KProperty[] $$delegatedProperties = {kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor.class), "supertypes", "getSupertypes()Ljava/util/List;"))};
    public static final kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor.Companion Companion = new kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor.Companion(null);
    private final kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor module;
    private final java.util.Set<kotlin.reflect.jvm.internal.impl.types.KotlinType> possibleTypes;
    private final kotlin.Lazy supertypes$delegate;
    private final kotlin.reflect.jvm.internal.impl.types.SimpleType type;
    private final long value;

    private final java.util.List<kotlin.reflect.jvm.internal.impl.types.KotlinType> getSupertypes() {
        kotlin.Lazy lazy = this.supertypes$delegate;
        kotlin.reflect.KProperty kProperty = $$delegatedProperties[0];
        return (java.util.List) lazy.getValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    /* JADX INFO: renamed from: getDeclarationDescriptor */
    public kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor mo1268getDeclarationDescriptor() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public boolean isDenotable() {
        return false;
    }

    /* JADX INFO: compiled from: IntegerLiteralTypeConstructor.kt */
    public static final class Companion {

        /* JADX INFO: compiled from: IntegerLiteralTypeConstructor.kt */
        private enum Mode {
            COMMON_SUPER_TYPE,
            INTERSECTION_TYPE
        }

        public final /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor.Companion.Mode.values().length];
                $EnumSwitchMapping$0 = iArr;
                iArr[kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor.Companion.Mode.COMMON_SUPER_TYPE.ordinal()] = 1;
                iArr[kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor.Companion.Mode.INTERSECTION_TYPE.ordinal()] = 2;
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final kotlin.reflect.jvm.internal.impl.types.SimpleType findIntersectionType(java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.types.SimpleType> types) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(types, "types");
            return findCommonSuperTypeOrIntersectionType(types, kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor.Companion.Mode.INTERSECTION_TYPE);
        }

        private final kotlin.reflect.jvm.internal.impl.types.SimpleType findCommonSuperTypeOrIntersectionType(java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.types.SimpleType> collection, kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor.Companion.Mode mode) {
            if (collection.isEmpty()) {
                return null;
            }
            java.util.Iterator<T> it = collection.iterator();
            if (!it.hasNext()) {
                throw new java.lang.UnsupportedOperationException("Empty collection can't be reduced.");
            }
            java.lang.Object next = it.next();
            while (it.hasNext()) {
                kotlin.reflect.jvm.internal.impl.types.SimpleType simpleType = (kotlin.reflect.jvm.internal.impl.types.SimpleType) it.next();
                next = kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor.Companion.fold((kotlin.reflect.jvm.internal.impl.types.SimpleType) next, simpleType, mode);
            }
            return (kotlin.reflect.jvm.internal.impl.types.SimpleType) next;
        }

        private final kotlin.reflect.jvm.internal.impl.types.SimpleType fold(kotlin.reflect.jvm.internal.impl.types.SimpleType simpleType, kotlin.reflect.jvm.internal.impl.types.SimpleType simpleType2, kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor.Companion.Mode mode) {
            if (simpleType == null || simpleType2 == null) {
                return null;
            }
            kotlin.reflect.jvm.internal.impl.types.TypeConstructor constructor = simpleType.getConstructor();
            kotlin.reflect.jvm.internal.impl.types.TypeConstructor constructor2 = simpleType2.getConstructor();
            boolean z = constructor instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor;
            if (z && (constructor2 instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor)) {
                return fold((kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor) constructor, (kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor) constructor2, mode);
            }
            if (z) {
                return fold((kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor) constructor, simpleType2);
            }
            if (constructor2 instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor) {
                return fold((kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor) constructor2, simpleType);
            }
            return null;
        }

        private final kotlin.reflect.jvm.internal.impl.types.SimpleType fold(kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor integerLiteralTypeConstructor, kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor integerLiteralTypeConstructor2, kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor.Companion.Mode mode) {
            java.util.Set setIntersect;
            int i = kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor.Companion.WhenMappings.$EnumSwitchMapping$0[mode.ordinal()];
            if (i == 1) {
                setIntersect = kotlin.collections.CollectionsKt.intersect(integerLiteralTypeConstructor.getPossibleTypes(), integerLiteralTypeConstructor2.getPossibleTypes());
            } else {
                if (i != 2) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                setIntersect = kotlin.collections.CollectionsKt.union(integerLiteralTypeConstructor.getPossibleTypes(), integerLiteralTypeConstructor2.getPossibleTypes());
            }
            return kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.integerLiteralType(kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations.Companion.getEMPTY(), new kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor(integerLiteralTypeConstructor.value, integerLiteralTypeConstructor.module, setIntersect, null), false);
        }

        private final kotlin.reflect.jvm.internal.impl.types.SimpleType fold(kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor integerLiteralTypeConstructor, kotlin.reflect.jvm.internal.impl.types.SimpleType simpleType) {
            if (integerLiteralTypeConstructor.getPossibleTypes().contains(simpleType)) {
                return simpleType;
            }
            return null;
        }
    }

    public /* synthetic */ IntegerLiteralTypeConstructor(long j, kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor moduleDescriptor, java.util.Set set, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(j, moduleDescriptor, set);
    }

    public final java.util.Set<kotlin.reflect.jvm.internal.impl.types.KotlinType> getPossibleTypes() {
        return this.possibleTypes;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private IntegerLiteralTypeConstructor(long j, kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor moduleDescriptor, java.util.Set<? extends kotlin.reflect.jvm.internal.impl.types.KotlinType> set) {
        this.type = kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.integerLiteralType(kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations.Companion.getEMPTY(), this, false);
        this.supertypes$delegate = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<java.util.List<kotlin.reflect.jvm.internal.impl.types.SimpleType>>() { // from class: kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor$supertypes$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final java.util.List<kotlin.reflect.jvm.internal.impl.types.SimpleType> invoke() {
                kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor comparable = this.this$0.getBuiltIns().getComparable();
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(comparable, "builtIns.comparable");
                kotlin.reflect.jvm.internal.impl.types.SimpleType defaultType = comparable.getDefaultType();
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(defaultType, "builtIns.comparable.defaultType");
                java.util.List<kotlin.reflect.jvm.internal.impl.types.SimpleType> listMutableListOf = kotlin.collections.CollectionsKt.mutableListOf(kotlin.reflect.jvm.internal.impl.types.TypeSubstitutionKt.replace$default(defaultType, kotlin.collections.CollectionsKt.listOf(new kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl(kotlin.reflect.jvm.internal.impl.types.Variance.IN_VARIANCE, this.this$0.type)), (kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations) null, 2, (java.lang.Object) null));
                if (!this.this$0.isContainsOnlyUnsignedTypes()) {
                    listMutableListOf.add(this.this$0.getBuiltIns().getNumberType());
                }
                return listMutableListOf;
            }
        });
        this.value = j;
        this.module = moduleDescriptor;
        this.possibleTypes = set;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isContainsOnlyUnsignedTypes() {
        java.util.Collection<kotlin.reflect.jvm.internal.impl.types.KotlinType> allSignedLiteralTypes = kotlin.reflect.jvm.internal.impl.resolve.constants.PrimitiveTypeUtilKt.getAllSignedLiteralTypes(this.module);
        if ((allSignedLiteralTypes instanceof java.util.Collection) && allSignedLiteralTypes.isEmpty()) {
            return true;
        }
        java.util.Iterator<T> it = allSignedLiteralTypes.iterator();
        while (it.hasNext()) {
            if (!(!this.possibleTypes.contains((kotlin.reflect.jvm.internal.impl.types.KotlinType) it.next()))) {
                return false;
            }
        }
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> getParameters() {
        return kotlin.collections.CollectionsKt.emptyList();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    /* JADX INFO: renamed from: getSupertypes, reason: collision with other method in class */
    public java.util.Collection<kotlin.reflect.jvm.internal.impl.types.KotlinType> mo1269getSupertypes() {
        return getSupertypes();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns getBuiltIns() {
        return this.module.getBuiltIns();
    }

    public java.lang.String toString() {
        return "IntegerLiteralType" + valueToString();
    }

    public final boolean checkConstructor(kotlin.reflect.jvm.internal.impl.types.TypeConstructor constructor) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(constructor, "constructor");
        java.util.Set<kotlin.reflect.jvm.internal.impl.types.KotlinType> set = this.possibleTypes;
        if ((set instanceof java.util.Collection) && set.isEmpty()) {
            return false;
        }
        java.util.Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(((kotlin.reflect.jvm.internal.impl.types.KotlinType) it.next()).getConstructor(), constructor)) {
                return true;
            }
        }
        return false;
    }

    private final java.lang.String valueToString() {
        return '[' + kotlin.collections.CollectionsKt.joinToString$default(this.possibleTypes, ",", null, null, 0, null, new kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.types.KotlinType, java.lang.String>() { // from class: kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor.valueToString.1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.String invoke(kotlin.reflect.jvm.internal.impl.types.KotlinType it) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(it, "it");
                return it.toString();
            }
        }, 30, null) + ']';
    }
}
