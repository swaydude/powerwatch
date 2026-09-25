package kotlin.reflect.jvm.internal.impl.resolve.scopes;

/* JADX INFO: compiled from: MemberScope.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class DescriptorKindFilter {
    public static final kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter ALL;
    private static final int ALL_KINDS_MASK;
    public static final kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter CALLABLES;
    private static final int CALLABLES_MASK;
    public static final kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter CLASSIFIERS;
    private static final int CLASSIFIERS_MASK;
    public static final kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter.Companion Companion;
    private static final java.util.List<kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter.Companion.MaskToName> DEBUG_MASK_BIT_NAMES;
    private static final java.util.List<kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter.Companion.MaskToName> DEBUG_PREDEFINED_FILTERS_MASK_NAMES;
    public static final kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter FUNCTIONS;
    private static final int FUNCTIONS_MASK;
    public static final kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter NON_SINGLETON_CLASSIFIERS;
    private static final int NON_SINGLETON_CLASSIFIERS_MASK;
    public static final kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter PACKAGES;
    private static final int PACKAGES_MASK;
    public static final kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter SINGLETON_CLASSIFIERS;
    private static final int SINGLETON_CLASSIFIERS_MASK;
    public static final kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter TYPE_ALIASES;
    private static final int TYPE_ALIASES_MASK;
    public static final kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter VALUES;
    private static final int VALUES_MASK;
    public static final kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter VARIABLES;
    private static final int VARIABLES_MASK;
    private static int nextMaskValue;
    private final java.util.List<kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindExclude> excludes;
    private final int kindMask;

    /* JADX WARN: Multi-variable type inference failed */
    public DescriptorKindFilter(int i, java.util.List<? extends kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindExclude> excludes) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(excludes, "excludes");
        this.excludes = excludes;
        java.util.Iterator it = excludes.iterator();
        while (it.hasNext()) {
            i &= ~((kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindExclude) it.next()).getFullyExcludedDescriptorKinds();
        }
        this.kindMask = i;
    }

    public /* synthetic */ DescriptorKindFilter(int i, java.util.List list, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list);
    }

    public final java.util.List<kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindExclude> getExcludes() {
        return this.excludes;
    }

    public final int getKindMask() {
        return this.kindMask;
    }

    public final boolean acceptsKinds(int i) {
        return (i & this.kindMask) != 0;
    }

    public final kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter restrictedToKindsOrNull(int i) {
        int i2 = i & this.kindMask;
        if (i2 == 0) {
            return null;
        }
        return new kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter(i2, this.excludes);
    }

    public java.lang.String toString() {
        java.lang.Object next;
        java.util.Iterator<T> it = DEBUG_PREDEFINED_FILTERS_MASK_NAMES.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(((kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter.Companion.MaskToName) next).getMask() == this.kindMask));
        kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter.Companion.MaskToName maskToName = (kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter.Companion.MaskToName) next;
        java.lang.String name = maskToName != null ? maskToName.getName() : null;
        if (name == null) {
            java.util.List<kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter.Companion.MaskToName> list = DEBUG_MASK_BIT_NAMES;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter.Companion.MaskToName maskToName2 : list) {
                java.lang.String name2 = acceptsKinds(maskToName2.getMask()) ? maskToName2.getName() : null;
                if (name2 != null) {
                    arrayList.add(name2);
                }
            }
            name = kotlin.collections.CollectionsKt.joinToString$default(arrayList, " | ", null, null, 0, null, null, 62, null);
        }
        return "DescriptorKindFilter(" + name + ", " + this.excludes + ')';
    }

    /* JADX INFO: compiled from: MemberScope.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int nextMask() {
            int i = kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter.nextMaskValue;
            kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter.nextMaskValue <<= 1;
            return i;
        }

        public final int getNON_SINGLETON_CLASSIFIERS_MASK() {
            return kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter.NON_SINGLETON_CLASSIFIERS_MASK;
        }

        public final int getSINGLETON_CLASSIFIERS_MASK() {
            return kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter.SINGLETON_CLASSIFIERS_MASK;
        }

        public final int getTYPE_ALIASES_MASK() {
            return kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter.TYPE_ALIASES_MASK;
        }

        public final int getPACKAGES_MASK() {
            return kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter.PACKAGES_MASK;
        }

        public final int getFUNCTIONS_MASK() {
            return kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter.FUNCTIONS_MASK;
        }

        public final int getVARIABLES_MASK() {
            return kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter.VARIABLES_MASK;
        }

        public final int getALL_KINDS_MASK() {
            return kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter.ALL_KINDS_MASK;
        }

        public final int getCLASSIFIERS_MASK() {
            return kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter.CLASSIFIERS_MASK;
        }

        /* JADX INFO: compiled from: MemberScope.kt */
        private static final class MaskToName {
            private final int mask;
            private final java.lang.String name;

            public MaskToName(int i, java.lang.String name) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(name, "name");
                this.mask = i;
                this.name = name;
            }

            public final int getMask() {
                return this.mask;
            }

            public final java.lang.String getName() {
                return this.name;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter.Companion.MaskToName maskToName;
        kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter.Companion.MaskToName maskToName2;
        kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter.Companion companion = new kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter.Companion(null);
        Companion = companion;
        nextMaskValue = 1;
        int iNextMask = companion.nextMask();
        NON_SINGLETON_CLASSIFIERS_MASK = iNextMask;
        int iNextMask2 = companion.nextMask();
        SINGLETON_CLASSIFIERS_MASK = iNextMask2;
        int iNextMask3 = companion.nextMask();
        TYPE_ALIASES_MASK = iNextMask3;
        int iNextMask4 = companion.nextMask();
        PACKAGES_MASK = iNextMask4;
        int iNextMask5 = companion.nextMask();
        FUNCTIONS_MASK = iNextMask5;
        int iNextMask6 = companion.nextMask();
        VARIABLES_MASK = iNextMask6;
        int iNextMask7 = companion.nextMask() - 1;
        ALL_KINDS_MASK = iNextMask7;
        int i = iNextMask | iNextMask2 | iNextMask3;
        CLASSIFIERS_MASK = i;
        int i2 = iNextMask2 | iNextMask5 | iNextMask6;
        VALUES_MASK = i2;
        int i3 = iNextMask5 | iNextMask6;
        CALLABLES_MASK = i3;
        int i4 = 2;
        ALL = new kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter(iNextMask7, 0 == true ? 1 : 0, i4, 0 == true ? 1 : 0);
        CALLABLES = new kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter(i3, 0 == true ? 1 : 0, i4, 0 == true ? 1 : 0);
        NON_SINGLETON_CLASSIFIERS = new kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter(iNextMask, 0 == true ? 1 : 0, i4, 0 == true ? 1 : 0);
        SINGLETON_CLASSIFIERS = new kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter(iNextMask2, 0 == true ? 1 : 0, i4, 0 == true ? 1 : 0);
        TYPE_ALIASES = new kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter(iNextMask3, 0 == true ? 1 : 0, i4, 0 == true ? 1 : 0);
        CLASSIFIERS = new kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter(i, 0 == true ? 1 : 0, i4, 0 == true ? 1 : 0);
        PACKAGES = new kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter(iNextMask4, 0 == true ? 1 : 0, i4, 0 == true ? 1 : 0);
        FUNCTIONS = new kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter(iNextMask5, 0 == true ? 1 : 0, i4, 0 == true ? 1 : 0);
        VARIABLES = new kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter(iNextMask6, 0 == true ? 1 : 0, i4, 0 == true ? 1 : 0);
        VALUES = new kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter(i2, 0 == true ? 1 : 0, i4, 0 == true ? 1 : 0);
        java.lang.reflect.Field[] fields = kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter.class.getFields();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(fields, "T::class.java.fields");
        java.util.ArrayList<java.lang.reflect.Field> arrayList = new java.util.ArrayList();
        for (java.lang.reflect.Field it : fields) {
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(it, "it");
            if (java.lang.reflect.Modifier.isStatic(it.getModifiers())) {
                arrayList.add(it);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.reflect.Field field : arrayList) {
            java.lang.Object obj = field.get(null);
            if (!(obj instanceof kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter)) {
                obj = null;
            }
            kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter descriptorKindFilter = (kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter) obj;
            if (descriptorKindFilter != null) {
                int i5 = descriptorKindFilter.kindMask;
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(field, "field");
                java.lang.String name = field.getName();
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(name, "field.name");
                maskToName2 = new kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter.Companion.MaskToName(i5, name);
            } else {
                maskToName2 = null;
            }
            if (maskToName2 != null) {
                arrayList2.add(maskToName2);
            }
        }
        DEBUG_PREDEFINED_FILTERS_MASK_NAMES = kotlin.collections.CollectionsKt.toList(arrayList2);
        java.lang.reflect.Field[] fields2 = kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter.class.getFields();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(fields2, "T::class.java.fields");
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        for (java.lang.reflect.Field it2 : fields2) {
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(it2, "it");
            if (java.lang.reflect.Modifier.isStatic(it2.getModifiers())) {
                arrayList3.add(it2);
            }
        }
        java.util.ArrayList<java.lang.reflect.Field> arrayList4 = new java.util.ArrayList();
        for (java.lang.Object obj2 : arrayList3) {
            java.lang.reflect.Field it3 = (java.lang.reflect.Field) obj2;
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(it3, "it");
            if (kotlin.jvm.internal.Intrinsics.areEqual(it3.getType(), java.lang.Integer.TYPE)) {
                arrayList4.add(obj2);
            }
        }
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        for (java.lang.reflect.Field field2 : arrayList4) {
            java.lang.Object obj3 = field2.get(null);
            if (obj3 == null) {
                throw new kotlin.TypeCastException("null cannot be cast to non-null type kotlin.Int");
            }
            int iIntValue = ((java.lang.Integer) obj3).intValue();
            if (iIntValue == ((-iIntValue) & iIntValue)) {
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(field2, "field");
                java.lang.String name2 = field2.getName();
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(name2, "field.name");
                maskToName = new kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter.Companion.MaskToName(iIntValue, name2);
            } else {
                maskToName = null;
            }
            if (maskToName != null) {
                arrayList5.add(maskToName);
            }
        }
        DEBUG_MASK_BIT_NAMES = kotlin.collections.CollectionsKt.toList(arrayList5);
    }
}
