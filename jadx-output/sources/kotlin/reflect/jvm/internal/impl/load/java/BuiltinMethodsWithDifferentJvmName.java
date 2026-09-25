package kotlin.reflect.jvm.internal.impl.load.java;

/* JADX INFO: compiled from: specialBuiltinMembers.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class BuiltinMethodsWithDifferentJvmName {
    public static final kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithDifferentJvmName INSTANCE = new kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithDifferentJvmName();
    private static final java.util.Map<kotlin.reflect.jvm.internal.impl.name.Name, java.util.List<kotlin.reflect.jvm.internal.impl.name.Name>> JVM_SHORT_NAME_TO_BUILTIN_SHORT_NAMES_MAP;
    private static final java.util.Map<kotlin.reflect.jvm.internal.impl.load.java.NameAndSignature, kotlin.reflect.jvm.internal.impl.name.Name> NAME_AND_SIGNATURE_TO_JVM_REPRESENTATION_NAME_MAP;
    private static final java.util.List<kotlin.reflect.jvm.internal.impl.name.Name> ORIGINAL_SHORT_NAMES;
    private static final kotlin.reflect.jvm.internal.impl.load.java.NameAndSignature REMOVE_AT_NAME_AND_SIGNATURE;
    private static final java.util.Map<java.lang.String, kotlin.reflect.jvm.internal.impl.name.Name> SIGNATURE_TO_JVM_REPRESENTATION_NAME;

    static {
        java.lang.String desc = kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType.INT.getDesc();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(desc, "JvmPrimitiveType.INT.desc");
        kotlin.reflect.jvm.internal.impl.load.java.NameAndSignature nameAndSignatureMethod = kotlin.reflect.jvm.internal.impl.load.java.SpecialBuiltinMembers.method("java/util/List", "removeAt", desc, "Ljava/lang/Object;");
        REMOVE_AT_NAME_AND_SIGNATURE = nameAndSignatureMethod;
        kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents signatureBuildingComponents = kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents.INSTANCE;
        java.lang.String strJavaLang = signatureBuildingComponents.javaLang("Number");
        java.lang.String desc2 = kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType.BYTE.getDesc();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(desc2, "JvmPrimitiveType.BYTE.desc");
        java.lang.String strJavaLang2 = signatureBuildingComponents.javaLang("Number");
        java.lang.String desc3 = kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType.SHORT.getDesc();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(desc3, "JvmPrimitiveType.SHORT.desc");
        java.lang.String strJavaLang3 = signatureBuildingComponents.javaLang("Number");
        java.lang.String desc4 = kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType.INT.getDesc();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(desc4, "JvmPrimitiveType.INT.desc");
        java.lang.String strJavaLang4 = signatureBuildingComponents.javaLang("Number");
        java.lang.String desc5 = kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType.LONG.getDesc();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(desc5, "JvmPrimitiveType.LONG.desc");
        java.lang.String strJavaLang5 = signatureBuildingComponents.javaLang("Number");
        java.lang.String desc6 = kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType.FLOAT.getDesc();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(desc6, "JvmPrimitiveType.FLOAT.desc");
        java.lang.String strJavaLang6 = signatureBuildingComponents.javaLang("Number");
        java.lang.String desc7 = kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType.DOUBLE.getDesc();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(desc7, "JvmPrimitiveType.DOUBLE.desc");
        java.lang.String strJavaLang7 = signatureBuildingComponents.javaLang("CharSequence");
        java.lang.String desc8 = kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType.INT.getDesc();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(desc8, "JvmPrimitiveType.INT.desc");
        java.lang.String desc9 = kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType.CHAR.getDesc();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(desc9, "JvmPrimitiveType.CHAR.desc");
        java.util.Map<kotlin.reflect.jvm.internal.impl.load.java.NameAndSignature, kotlin.reflect.jvm.internal.impl.name.Name> mapMapOf = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(kotlin.reflect.jvm.internal.impl.load.java.SpecialBuiltinMembers.method(strJavaLang, "toByte", "", desc2), kotlin.reflect.jvm.internal.impl.name.Name.identifier("byteValue")), kotlin.TuplesKt.to(kotlin.reflect.jvm.internal.impl.load.java.SpecialBuiltinMembers.method(strJavaLang2, "toShort", "", desc3), kotlin.reflect.jvm.internal.impl.name.Name.identifier("shortValue")), kotlin.TuplesKt.to(kotlin.reflect.jvm.internal.impl.load.java.SpecialBuiltinMembers.method(strJavaLang3, "toInt", "", desc4), kotlin.reflect.jvm.internal.impl.name.Name.identifier("intValue")), kotlin.TuplesKt.to(kotlin.reflect.jvm.internal.impl.load.java.SpecialBuiltinMembers.method(strJavaLang4, "toLong", "", desc5), kotlin.reflect.jvm.internal.impl.name.Name.identifier("longValue")), kotlin.TuplesKt.to(kotlin.reflect.jvm.internal.impl.load.java.SpecialBuiltinMembers.method(strJavaLang5, "toFloat", "", desc6), kotlin.reflect.jvm.internal.impl.name.Name.identifier("floatValue")), kotlin.TuplesKt.to(kotlin.reflect.jvm.internal.impl.load.java.SpecialBuiltinMembers.method(strJavaLang6, "toDouble", "", desc7), kotlin.reflect.jvm.internal.impl.name.Name.identifier("doubleValue")), kotlin.TuplesKt.to(nameAndSignatureMethod, kotlin.reflect.jvm.internal.impl.name.Name.identifier("remove")), kotlin.TuplesKt.to(kotlin.reflect.jvm.internal.impl.load.java.SpecialBuiltinMembers.method(strJavaLang7, "get", desc8, desc9), kotlin.reflect.jvm.internal.impl.name.Name.identifier("charAt")));
        NAME_AND_SIGNATURE_TO_JVM_REPRESENTATION_NAME_MAP = mapMapOf;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kotlin.collections.MapsKt.mapCapacity(mapMapOf.size()));
        java.util.Iterator<T> it = mapMapOf.entrySet().iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            linkedHashMap.put(((kotlin.reflect.jvm.internal.impl.load.java.NameAndSignature) entry.getKey()).getSignature(), entry.getValue());
        }
        SIGNATURE_TO_JVM_REPRESENTATION_NAME = linkedHashMap;
        java.util.Set<kotlin.reflect.jvm.internal.impl.load.java.NameAndSignature> setKeySet = NAME_AND_SIGNATURE_TO_JVM_REPRESENTATION_NAME_MAP.keySet();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(setKeySet, 10));
        java.util.Iterator<T> it2 = setKeySet.iterator();
        while (it2.hasNext()) {
            arrayList.add(((kotlin.reflect.jvm.internal.impl.load.java.NameAndSignature) it2.next()).getName());
        }
        ORIGINAL_SHORT_NAMES = arrayList;
        java.util.Set<java.util.Map.Entry<kotlin.reflect.jvm.internal.impl.load.java.NameAndSignature, kotlin.reflect.jvm.internal.impl.name.Name>> setEntrySet = NAME_AND_SIGNATURE_TO_JVM_REPRESENTATION_NAME_MAP.entrySet();
        java.util.ArrayList<kotlin.Pair> arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(setEntrySet, 10));
        java.util.Iterator<T> it3 = setEntrySet.iterator();
        while (it3.hasNext()) {
            java.util.Map.Entry entry2 = (java.util.Map.Entry) it3.next();
            arrayList2.add(new kotlin.Pair(((kotlin.reflect.jvm.internal.impl.load.java.NameAndSignature) entry2.getKey()).getName(), entry2.getValue()));
        }
        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
        for (kotlin.Pair pair : arrayList2) {
            kotlin.reflect.jvm.internal.impl.name.Name name = (kotlin.reflect.jvm.internal.impl.name.Name) pair.getSecond();
            java.lang.Object arrayList3 = linkedHashMap2.get(name);
            if (arrayList3 == null) {
                arrayList3 = new java.util.ArrayList();
                linkedHashMap2.put(name, arrayList3);
            }
            ((java.util.List) arrayList3).add((kotlin.reflect.jvm.internal.impl.name.Name) pair.getFirst());
        }
        JVM_SHORT_NAME_TO_BUILTIN_SHORT_NAMES_MAP = linkedHashMap2;
    }

    private BuiltinMethodsWithDifferentJvmName() {
    }

    public static final /* synthetic */ java.util.Map access$getSIGNATURE_TO_JVM_REPRESENTATION_NAME$p(kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithDifferentJvmName builtinMethodsWithDifferentJvmName) {
        return SIGNATURE_TO_JVM_REPRESENTATION_NAME;
    }

    public final java.util.List<kotlin.reflect.jvm.internal.impl.name.Name> getORIGINAL_SHORT_NAMES() {
        return ORIGINAL_SHORT_NAMES;
    }

    public final boolean getSameAsRenamedInJvmBuiltin(kotlin.reflect.jvm.internal.impl.name.Name sameAsRenamedInJvmBuiltin) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(sameAsRenamedInJvmBuiltin, "$this$sameAsRenamedInJvmBuiltin");
        return ORIGINAL_SHORT_NAMES.contains(sameAsRenamedInJvmBuiltin);
    }

    public final kotlin.reflect.jvm.internal.impl.name.Name getJvmName(kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor functionDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(functionDescriptor, "functionDescriptor");
        java.util.Map<java.lang.String, kotlin.reflect.jvm.internal.impl.name.Name> map = SIGNATURE_TO_JVM_REPRESENTATION_NAME;
        java.lang.String strComputeJvmSignature = kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt.computeJvmSignature(functionDescriptor);
        if (strComputeJvmSignature != null) {
            return map.get(strComputeJvmSignature);
        }
        return null;
    }

    public final boolean isBuiltinFunctionWithDifferentNameInJvm(final kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor functionDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(functionDescriptor, "functionDescriptor");
        return kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isBuiltIn(functionDescriptor) && kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.firstOverridden$default(functionDescriptor, false, new kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, java.lang.Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithDifferentJvmName.isBuiltinFunctionWithDifferentNameInJvm.1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ java.lang.Boolean invoke(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor) {
                return java.lang.Boolean.valueOf(invoke2(callableMemberDescriptor));
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final boolean invoke2(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor it) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(it, "it");
                java.util.Map mapAccess$getSIGNATURE_TO_JVM_REPRESENTATION_NAME$p = kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithDifferentJvmName.access$getSIGNATURE_TO_JVM_REPRESENTATION_NAME$p(kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithDifferentJvmName.INSTANCE);
                java.lang.String strComputeJvmSignature = kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt.computeJvmSignature(functionDescriptor);
                if (mapAccess$getSIGNATURE_TO_JVM_REPRESENTATION_NAME$p != null) {
                    return mapAccess$getSIGNATURE_TO_JVM_REPRESENTATION_NAME$p.containsKey(strComputeJvmSignature);
                }
                throw new kotlin.TypeCastException("null cannot be cast to non-null type kotlin.collections.Map<K, *>");
            }
        }, 1, null) != null;
    }

    public final java.util.List<kotlin.reflect.jvm.internal.impl.name.Name> getBuiltinFunctionNamesByJvmName(kotlin.reflect.jvm.internal.impl.name.Name name) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(name, "name");
        java.util.List<kotlin.reflect.jvm.internal.impl.name.Name> list = JVM_SHORT_NAME_TO_BUILTIN_SHORT_NAMES_MAP.get(name);
        return list != null ? list : kotlin.collections.CollectionsKt.emptyList();
    }

    public final boolean isRemoveAtByIndex(kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor isRemoveAtByIndex) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(isRemoveAtByIndex, "$this$isRemoveAtByIndex");
        return kotlin.jvm.internal.Intrinsics.areEqual(isRemoveAtByIndex.getName().asString(), "removeAt") && kotlin.jvm.internal.Intrinsics.areEqual(kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt.computeJvmSignature(isRemoveAtByIndex), REMOVE_AT_NAME_AND_SIGNATURE.getSignature());
    }
}
