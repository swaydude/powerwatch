package kotlin.reflect.jvm.internal.impl.load.java;

/* JADX INFO: compiled from: specialBuiltinMembers.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class BuiltinSpecialProperties {
    private static final java.util.Map<kotlin.reflect.jvm.internal.impl.name.Name, java.util.List<kotlin.reflect.jvm.internal.impl.name.Name>> GETTER_JVM_NAME_TO_PROPERTIES_SHORT_NAME_MAP;
    public static final kotlin.reflect.jvm.internal.impl.load.java.BuiltinSpecialProperties INSTANCE = new kotlin.reflect.jvm.internal.impl.load.java.BuiltinSpecialProperties();
    private static final java.util.Map<kotlin.reflect.jvm.internal.impl.name.FqName, kotlin.reflect.jvm.internal.impl.name.Name> PROPERTY_FQ_NAME_TO_JVM_GETTER_NAME_MAP;
    private static final java.util.Set<kotlin.reflect.jvm.internal.impl.name.FqName> SPECIAL_FQ_NAMES;
    private static final java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name> SPECIAL_SHORT_NAMES;

    static {
        kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe fqNameUnsafe = kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.FQ_NAMES._enum;
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(fqNameUnsafe, "BUILTIN_NAMES._enum");
        kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe fqNameUnsafe2 = kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.FQ_NAMES._enum;
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(fqNameUnsafe2, "BUILTIN_NAMES._enum");
        kotlin.reflect.jvm.internal.impl.name.FqName fqName = kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.FQ_NAMES.collection;
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(fqName, "BUILTIN_NAMES.collection");
        kotlin.reflect.jvm.internal.impl.name.FqName fqName2 = kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.FQ_NAMES.map;
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(fqName2, "BUILTIN_NAMES.map");
        kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe fqNameUnsafe3 = kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.FQ_NAMES.charSequence;
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(fqNameUnsafe3, "BUILTIN_NAMES.charSequence");
        kotlin.reflect.jvm.internal.impl.name.FqName fqName3 = kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.FQ_NAMES.map;
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(fqName3, "BUILTIN_NAMES.map");
        kotlin.reflect.jvm.internal.impl.name.FqName fqName4 = kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.FQ_NAMES.map;
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(fqName4, "BUILTIN_NAMES.map");
        kotlin.reflect.jvm.internal.impl.name.FqName fqName5 = kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.FQ_NAMES.map;
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(fqName5, "BUILTIN_NAMES.map");
        java.util.Map<kotlin.reflect.jvm.internal.impl.name.FqName, kotlin.reflect.jvm.internal.impl.name.Name> mapMapOf = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(kotlin.reflect.jvm.internal.impl.load.java.SpecialBuiltinMembers.childSafe(fqNameUnsafe, com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME), kotlin.reflect.jvm.internal.impl.name.Name.identifier(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME)), kotlin.TuplesKt.to(kotlin.reflect.jvm.internal.impl.load.java.SpecialBuiltinMembers.childSafe(fqNameUnsafe2, "ordinal"), kotlin.reflect.jvm.internal.impl.name.Name.identifier("ordinal")), kotlin.TuplesKt.to(kotlin.reflect.jvm.internal.impl.load.java.SpecialBuiltinMembers.child(fqName, "size"), kotlin.reflect.jvm.internal.impl.name.Name.identifier("size")), kotlin.TuplesKt.to(kotlin.reflect.jvm.internal.impl.load.java.SpecialBuiltinMembers.child(fqName2, "size"), kotlin.reflect.jvm.internal.impl.name.Name.identifier("size")), kotlin.TuplesKt.to(kotlin.reflect.jvm.internal.impl.load.java.SpecialBuiltinMembers.childSafe(fqNameUnsafe3, "length"), kotlin.reflect.jvm.internal.impl.name.Name.identifier("length")), kotlin.TuplesKt.to(kotlin.reflect.jvm.internal.impl.load.java.SpecialBuiltinMembers.child(fqName3, "keys"), kotlin.reflect.jvm.internal.impl.name.Name.identifier("keySet")), kotlin.TuplesKt.to(kotlin.reflect.jvm.internal.impl.load.java.SpecialBuiltinMembers.child(fqName4, "values"), kotlin.reflect.jvm.internal.impl.name.Name.identifier("values")), kotlin.TuplesKt.to(kotlin.reflect.jvm.internal.impl.load.java.SpecialBuiltinMembers.child(fqName5, "entries"), kotlin.reflect.jvm.internal.impl.name.Name.identifier("entrySet")));
        PROPERTY_FQ_NAME_TO_JVM_GETTER_NAME_MAP = mapMapOf;
        java.util.Set<java.util.Map.Entry<kotlin.reflect.jvm.internal.impl.name.FqName, kotlin.reflect.jvm.internal.impl.name.Name>> setEntrySet = mapMapOf.entrySet();
        java.util.ArrayList<kotlin.Pair> arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(setEntrySet, 10));
        java.util.Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            arrayList.add(new kotlin.Pair(((kotlin.reflect.jvm.internal.impl.name.FqName) entry.getKey()).shortName(), entry.getValue()));
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (kotlin.Pair pair : arrayList) {
            kotlin.reflect.jvm.internal.impl.name.Name name = (kotlin.reflect.jvm.internal.impl.name.Name) pair.getSecond();
            java.lang.Object arrayList2 = linkedHashMap.get(name);
            if (arrayList2 == null) {
                arrayList2 = new java.util.ArrayList();
                linkedHashMap.put(name, arrayList2);
            }
            ((java.util.List) arrayList2).add((kotlin.reflect.jvm.internal.impl.name.Name) pair.getFirst());
        }
        GETTER_JVM_NAME_TO_PROPERTIES_SHORT_NAME_MAP = linkedHashMap;
        java.util.Set<kotlin.reflect.jvm.internal.impl.name.FqName> setKeySet = PROPERTY_FQ_NAME_TO_JVM_GETTER_NAME_MAP.keySet();
        SPECIAL_FQ_NAMES = setKeySet;
        java.util.Set<kotlin.reflect.jvm.internal.impl.name.FqName> set = setKeySet;
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(set, 10));
        java.util.Iterator<T> it2 = set.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((kotlin.reflect.jvm.internal.impl.name.FqName) it2.next()).shortName());
        }
        SPECIAL_SHORT_NAMES = kotlin.collections.CollectionsKt.toSet(arrayList3);
    }

    private BuiltinSpecialProperties() {
    }

    public final java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name> getSPECIAL_SHORT_NAMES$descriptors_jvm() {
        return SPECIAL_SHORT_NAMES;
    }

    public final boolean hasBuiltinSpecialPropertyFqName(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(callableMemberDescriptor, "callableMemberDescriptor");
        if (SPECIAL_SHORT_NAMES.contains(callableMemberDescriptor.getName())) {
            return hasBuiltinSpecialPropertyFqNameImpl(callableMemberDescriptor);
        }
        return false;
    }

    private final boolean hasBuiltinSpecialPropertyFqNameImpl(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor) {
        kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor2 = callableMemberDescriptor;
        if (kotlin.collections.CollectionsKt.contains(SPECIAL_FQ_NAMES, kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.fqNameOrNull(callableMemberDescriptor2)) && callableMemberDescriptor.getValueParameters().isEmpty()) {
            return true;
        }
        if (!kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isBuiltIn(callableMemberDescriptor2)) {
            return false;
        }
        java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor> overriddenDescriptors = callableMemberDescriptor.getOverriddenDescriptors();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(overriddenDescriptors, "overriddenDescriptors");
        java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor> collection = overriddenDescriptors;
        if (!(collection instanceof java.util.Collection) || !collection.isEmpty()) {
            for (kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor it : collection) {
                kotlin.reflect.jvm.internal.impl.load.java.BuiltinSpecialProperties builtinSpecialProperties = INSTANCE;
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(it, "it");
                if (builtinSpecialProperties.hasBuiltinSpecialPropertyFqName(it)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final java.util.List<kotlin.reflect.jvm.internal.impl.name.Name> getPropertyNameCandidatesBySpecialGetterName(kotlin.reflect.jvm.internal.impl.name.Name name1) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(name1, "name1");
        java.util.List<kotlin.reflect.jvm.internal.impl.name.Name> list = GETTER_JVM_NAME_TO_PROPERTIES_SHORT_NAME_MAP.get(name1);
        return list != null ? list : kotlin.collections.CollectionsKt.emptyList();
    }

    public final java.lang.String getBuiltinSpecialPropertyGetterName(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor getBuiltinSpecialPropertyGetterName) {
        kotlin.reflect.jvm.internal.impl.name.Name name;
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(getBuiltinSpecialPropertyGetterName, "$this$getBuiltinSpecialPropertyGetterName");
        kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isBuiltIn(getBuiltinSpecialPropertyGetterName);
        kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptorFirstOverridden$default = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.firstOverridden$default(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getPropertyIfAccessor(getBuiltinSpecialPropertyGetterName), false, new kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, java.lang.Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.BuiltinSpecialProperties$getBuiltinSpecialPropertyGetterName$descriptor$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ java.lang.Boolean invoke(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor) {
                return java.lang.Boolean.valueOf(invoke2(callableMemberDescriptor));
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final boolean invoke2(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor it) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(it, "it");
                return kotlin.reflect.jvm.internal.impl.load.java.BuiltinSpecialProperties.INSTANCE.hasBuiltinSpecialPropertyFqName(it);
            }
        }, 1, null);
        if (callableMemberDescriptorFirstOverridden$default == null || (name = PROPERTY_FQ_NAME_TO_JVM_GETTER_NAME_MAP.get(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getFqNameSafe(callableMemberDescriptorFirstOverridden$default))) == null) {
            return null;
        }
        return name.asString();
    }
}
