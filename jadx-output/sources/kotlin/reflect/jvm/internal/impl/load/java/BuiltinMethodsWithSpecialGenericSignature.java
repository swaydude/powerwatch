package kotlin.reflect.jvm.internal.impl.load.java;

/* JADX INFO: compiled from: specialBuiltinMembers.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class BuiltinMethodsWithSpecialGenericSignature {
    private static final java.util.List<java.lang.String> ERASED_COLLECTION_PARAMETER_NAMES;
    private static final java.util.List<kotlin.reflect.jvm.internal.impl.load.java.NameAndSignature> ERASED_COLLECTION_PARAMETER_NAME_AND_SIGNATURES;
    private static final java.util.List<java.lang.String> ERASED_COLLECTION_PARAMETER_SIGNATURES;
    private static final java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name> ERASED_VALUE_PARAMETERS_SHORT_NAMES;
    private static final java.util.Set<java.lang.String> ERASED_VALUE_PARAMETERS_SIGNATURES;
    private static final java.util.Map<kotlin.reflect.jvm.internal.impl.load.java.NameAndSignature, kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature.TypeSafeBarrierDescription> GENERIC_PARAMETERS_METHODS_TO_DEFAULT_VALUES_MAP;
    public static final kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature INSTANCE = new kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature();
    private static final java.util.Map<java.lang.String, kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature.TypeSafeBarrierDescription> SIGNATURE_TO_DEFAULT_VALUES_MAP;

    static {
        java.util.Set<java.lang.String> of = kotlin.collections.SetsKt.setOf((java.lang.Object[]) new java.lang.String[]{"containsAll", "removeAll", "retainAll"});
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(of, 10));
        for (java.lang.String str : of) {
            java.lang.String desc = kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType.BOOLEAN.getDesc();
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(desc, "JvmPrimitiveType.BOOLEAN.desc");
            arrayList.add(kotlin.reflect.jvm.internal.impl.load.java.SpecialBuiltinMembers.method("java/util/Collection", str, "Ljava/util/Collection;", desc));
        }
        java.util.ArrayList arrayList2 = arrayList;
        ERASED_COLLECTION_PARAMETER_NAME_AND_SIGNATURES = arrayList2;
        java.util.ArrayList arrayList3 = arrayList2;
        java.util.ArrayList arrayList4 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList3, 10));
        java.util.Iterator it = arrayList3.iterator();
        while (it.hasNext()) {
            arrayList4.add(((kotlin.reflect.jvm.internal.impl.load.java.NameAndSignature) it.next()).getSignature());
        }
        ERASED_COLLECTION_PARAMETER_SIGNATURES = arrayList4;
        java.util.List<kotlin.reflect.jvm.internal.impl.load.java.NameAndSignature> list = ERASED_COLLECTION_PARAMETER_NAME_AND_SIGNATURES;
        java.util.ArrayList arrayList5 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
        java.util.Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList5.add(((kotlin.reflect.jvm.internal.impl.load.java.NameAndSignature) it2.next()).getName().asString());
        }
        ERASED_COLLECTION_PARAMETER_NAMES = arrayList5;
        kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents signatureBuildingComponents = kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents.INSTANCE;
        java.lang.String strJavaUtil = signatureBuildingComponents.javaUtil("Collection");
        java.lang.String desc2 = kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType.BOOLEAN.getDesc();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(desc2, "JvmPrimitiveType.BOOLEAN.desc");
        java.lang.String strJavaUtil2 = signatureBuildingComponents.javaUtil("Collection");
        java.lang.String desc3 = kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType.BOOLEAN.getDesc();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(desc3, "JvmPrimitiveType.BOOLEAN.desc");
        java.lang.String strJavaUtil3 = signatureBuildingComponents.javaUtil("Map");
        java.lang.String desc4 = kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType.BOOLEAN.getDesc();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(desc4, "JvmPrimitiveType.BOOLEAN.desc");
        java.lang.String strJavaUtil4 = signatureBuildingComponents.javaUtil("Map");
        java.lang.String desc5 = kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType.BOOLEAN.getDesc();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(desc5, "JvmPrimitiveType.BOOLEAN.desc");
        java.lang.String strJavaUtil5 = signatureBuildingComponents.javaUtil("Map");
        java.lang.String desc6 = kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType.BOOLEAN.getDesc();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(desc6, "JvmPrimitiveType.BOOLEAN.desc");
        java.lang.String strJavaUtil6 = signatureBuildingComponents.javaUtil("List");
        java.lang.String desc7 = kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType.INT.getDesc();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(desc7, "JvmPrimitiveType.INT.desc");
        java.lang.String strJavaUtil7 = signatureBuildingComponents.javaUtil("List");
        java.lang.String desc8 = kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType.INT.getDesc();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(desc8, "JvmPrimitiveType.INT.desc");
        java.util.Map<kotlin.reflect.jvm.internal.impl.load.java.NameAndSignature, kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature.TypeSafeBarrierDescription> mapMapOf = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(kotlin.reflect.jvm.internal.impl.load.java.SpecialBuiltinMembers.method(strJavaUtil, "contains", "Ljava/lang/Object;", desc2), kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature.TypeSafeBarrierDescription.FALSE), kotlin.TuplesKt.to(kotlin.reflect.jvm.internal.impl.load.java.SpecialBuiltinMembers.method(strJavaUtil2, "remove", "Ljava/lang/Object;", desc3), kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature.TypeSafeBarrierDescription.FALSE), kotlin.TuplesKt.to(kotlin.reflect.jvm.internal.impl.load.java.SpecialBuiltinMembers.method(strJavaUtil3, "containsKey", "Ljava/lang/Object;", desc4), kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature.TypeSafeBarrierDescription.FALSE), kotlin.TuplesKt.to(kotlin.reflect.jvm.internal.impl.load.java.SpecialBuiltinMembers.method(strJavaUtil4, "containsValue", "Ljava/lang/Object;", desc5), kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature.TypeSafeBarrierDescription.FALSE), kotlin.TuplesKt.to(kotlin.reflect.jvm.internal.impl.load.java.SpecialBuiltinMembers.method(strJavaUtil5, "remove", "Ljava/lang/Object;Ljava/lang/Object;", desc6), kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature.TypeSafeBarrierDescription.FALSE), kotlin.TuplesKt.to(kotlin.reflect.jvm.internal.impl.load.java.SpecialBuiltinMembers.method(signatureBuildingComponents.javaUtil("Map"), "getOrDefault", "Ljava/lang/Object;Ljava/lang/Object;", "Ljava/lang/Object;"), kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature.TypeSafeBarrierDescription.MAP_GET_OR_DEFAULT), kotlin.TuplesKt.to(kotlin.reflect.jvm.internal.impl.load.java.SpecialBuiltinMembers.method(signatureBuildingComponents.javaUtil("Map"), "get", "Ljava/lang/Object;", "Ljava/lang/Object;"), kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature.TypeSafeBarrierDescription.NULL), kotlin.TuplesKt.to(kotlin.reflect.jvm.internal.impl.load.java.SpecialBuiltinMembers.method(signatureBuildingComponents.javaUtil("Map"), "remove", "Ljava/lang/Object;", "Ljava/lang/Object;"), kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature.TypeSafeBarrierDescription.NULL), kotlin.TuplesKt.to(kotlin.reflect.jvm.internal.impl.load.java.SpecialBuiltinMembers.method(strJavaUtil6, "indexOf", "Ljava/lang/Object;", desc7), kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature.TypeSafeBarrierDescription.INDEX), kotlin.TuplesKt.to(kotlin.reflect.jvm.internal.impl.load.java.SpecialBuiltinMembers.method(strJavaUtil7, "lastIndexOf", "Ljava/lang/Object;", desc8), kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature.TypeSafeBarrierDescription.INDEX));
        GENERIC_PARAMETERS_METHODS_TO_DEFAULT_VALUES_MAP = mapMapOf;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kotlin.collections.MapsKt.mapCapacity(mapMapOf.size()));
        java.util.Iterator<T> it3 = mapMapOf.entrySet().iterator();
        while (it3.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it3.next();
            linkedHashMap.put(((kotlin.reflect.jvm.internal.impl.load.java.NameAndSignature) entry.getKey()).getSignature(), entry.getValue());
        }
        SIGNATURE_TO_DEFAULT_VALUES_MAP = linkedHashMap;
        java.util.Set setPlus = kotlin.collections.SetsKt.plus((java.util.Set) GENERIC_PARAMETERS_METHODS_TO_DEFAULT_VALUES_MAP.keySet(), (java.lang.Iterable) ERASED_COLLECTION_PARAMETER_NAME_AND_SIGNATURES);
        java.util.ArrayList arrayList6 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(setPlus, 10));
        java.util.Iterator it4 = setPlus.iterator();
        while (it4.hasNext()) {
            arrayList6.add(((kotlin.reflect.jvm.internal.impl.load.java.NameAndSignature) it4.next()).getName());
        }
        ERASED_VALUE_PARAMETERS_SHORT_NAMES = kotlin.collections.CollectionsKt.toSet(arrayList6);
        java.util.ArrayList arrayList7 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(setPlus, 10));
        java.util.Iterator it5 = setPlus.iterator();
        while (it5.hasNext()) {
            arrayList7.add(((kotlin.reflect.jvm.internal.impl.load.java.NameAndSignature) it5.next()).getSignature());
        }
        ERASED_VALUE_PARAMETERS_SIGNATURES = kotlin.collections.CollectionsKt.toSet(arrayList7);
    }

    private BuiltinMethodsWithSpecialGenericSignature() {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: specialBuiltinMembers.kt */
    public static final class TypeSafeBarrierDescription {
        private static final /* synthetic */ kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature.TypeSafeBarrierDescription[] $VALUES;
        public static final kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature.TypeSafeBarrierDescription FALSE;
        public static final kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature.TypeSafeBarrierDescription INDEX;
        public static final kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature.TypeSafeBarrierDescription MAP_GET_OR_DEFAULT;
        public static final kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature.TypeSafeBarrierDescription NULL;
        private final java.lang.Object defaultValue;

        public static kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature.TypeSafeBarrierDescription valueOf(java.lang.String str) {
            return (kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature.TypeSafeBarrierDescription) java.lang.Enum.valueOf(kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature.TypeSafeBarrierDescription.class, str);
        }

        public static kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature.TypeSafeBarrierDescription[] values() {
            return (kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature.TypeSafeBarrierDescription[]) $VALUES.clone();
        }

        private TypeSafeBarrierDescription(java.lang.String str, int i, java.lang.Object obj) {
            super(str, i);
            this.defaultValue = obj;
        }

        public /* synthetic */ TypeSafeBarrierDescription(java.lang.String str, int i, java.lang.Object obj, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, obj);
        }

        static {
            kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature.TypeSafeBarrierDescription typeSafeBarrierDescription = new kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature.TypeSafeBarrierDescription("NULL", 0, null);
            NULL = typeSafeBarrierDescription;
            kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature.TypeSafeBarrierDescription typeSafeBarrierDescription2 = new kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature.TypeSafeBarrierDescription("INDEX", 1, -1);
            INDEX = typeSafeBarrierDescription2;
            kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature.TypeSafeBarrierDescription typeSafeBarrierDescription3 = new kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature.TypeSafeBarrierDescription("FALSE", 2, false);
            FALSE = typeSafeBarrierDescription3;
            kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature.TypeSafeBarrierDescription.MAP_GET_OR_DEFAULT map_get_or_default = new kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature.TypeSafeBarrierDescription.MAP_GET_OR_DEFAULT("MAP_GET_OR_DEFAULT", 3);
            MAP_GET_OR_DEFAULT = map_get_or_default;
            $VALUES = new kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature.TypeSafeBarrierDescription[]{typeSafeBarrierDescription, typeSafeBarrierDescription2, typeSafeBarrierDescription3, map_get_or_default};
        }

        /* JADX INFO: compiled from: specialBuiltinMembers.kt */
        static final class MAP_GET_OR_DEFAULT extends kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature.TypeSafeBarrierDescription {
            /* JADX WARN: Illegal instructions before constructor call */
            MAP_GET_OR_DEFAULT(java.lang.String str, int i) {
                kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker = null;
                super(str, i, defaultConstructorMarker, defaultConstructorMarker);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getHasErasedValueParametersInJava(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor) {
        return kotlin.collections.CollectionsKt.contains(ERASED_VALUE_PARAMETERS_SIGNATURES, kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt.computeJvmSignature(callableMemberDescriptor));
    }

    @kotlin.jvm.JvmStatic
    public static final kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor getOverriddenBuiltinFunctionWithErasedValueParametersInJava(kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor functionDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(functionDescriptor, "functionDescriptor");
        kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature builtinMethodsWithSpecialGenericSignature = INSTANCE;
        kotlin.reflect.jvm.internal.impl.name.Name name = functionDescriptor.getName();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(name, "functionDescriptor.name");
        if (builtinMethodsWithSpecialGenericSignature.getSameAsBuiltinMethodWithErasedValueParameters(name)) {
            return (kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor) kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.firstOverridden$default(functionDescriptor, false, new kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, java.lang.Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature.getOverriddenBuiltinFunctionWithErasedValueParametersInJava.1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ java.lang.Boolean invoke(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor) {
                    return java.lang.Boolean.valueOf(invoke2(callableMemberDescriptor));
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final boolean invoke2(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor it) {
                    kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(it, "it");
                    return kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature.INSTANCE.getHasErasedValueParametersInJava(it);
                }
            }, 1, null);
        }
        return null;
    }

    public final boolean getSameAsBuiltinMethodWithErasedValueParameters(kotlin.reflect.jvm.internal.impl.name.Name sameAsBuiltinMethodWithErasedValueParameters) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(sameAsBuiltinMethodWithErasedValueParameters, "$this$sameAsBuiltinMethodWithErasedValueParameters");
        return ERASED_VALUE_PARAMETERS_SHORT_NAMES.contains(sameAsBuiltinMethodWithErasedValueParameters);
    }

    /* JADX INFO: compiled from: specialBuiltinMembers.kt */
    public enum SpecialSignatureInfo {
        ONE_COLLECTION_PARAMETER("Ljava/util/Collection<+Ljava/lang/Object;>;", false),
        OBJECT_PARAMETER_NON_GENERIC(null, true),
        OBJECT_PARAMETER_GENERIC("Ljava/lang/Object;", true);

        private final boolean isObjectReplacedWithTypeParameter;
        private final java.lang.String valueParametersSignature;

        SpecialSignatureInfo(java.lang.String str, boolean z) {
            this.valueParametersSignature = str;
            this.isObjectReplacedWithTypeParameter = z;
        }
    }

    @kotlin.jvm.JvmStatic
    public static final kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature.SpecialSignatureInfo getSpecialSignatureInfo(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor getSpecialSignatureInfo) {
        kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptorFirstOverridden$default;
        java.lang.String strComputeJvmSignature;
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(getSpecialSignatureInfo, "$this$getSpecialSignatureInfo");
        if (!ERASED_VALUE_PARAMETERS_SHORT_NAMES.contains(getSpecialSignatureInfo.getName()) || (callableMemberDescriptorFirstOverridden$default = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.firstOverridden$default(getSpecialSignatureInfo, false, new kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, java.lang.Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature$getSpecialSignatureInfo$builtinSignature$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ java.lang.Boolean invoke(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor) {
                return java.lang.Boolean.valueOf(invoke2(callableMemberDescriptor));
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final boolean invoke2(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor it) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(it, "it");
                return (it instanceof kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor) && kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature.INSTANCE.getHasErasedValueParametersInJava(it);
            }
        }, 1, null)) == null || (strComputeJvmSignature = kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt.computeJvmSignature(callableMemberDescriptorFirstOverridden$default)) == null) {
            return null;
        }
        if (ERASED_COLLECTION_PARAMETER_SIGNATURES.contains(strComputeJvmSignature)) {
            return kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature.SpecialSignatureInfo.ONE_COLLECTION_PARAMETER;
        }
        if (((kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature.TypeSafeBarrierDescription) kotlin.collections.MapsKt.getValue(SIGNATURE_TO_DEFAULT_VALUES_MAP, strComputeJvmSignature)) == kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature.TypeSafeBarrierDescription.NULL) {
            return kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature.SpecialSignatureInfo.OBJECT_PARAMETER_GENERIC;
        }
        return kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature.SpecialSignatureInfo.OBJECT_PARAMETER_NON_GENERIC;
    }
}
