package kotlin.reflect.jvm.internal.impl.builtins;

/* JADX INFO: compiled from: UnsignedType.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class UnsignedTypes {
    public static final kotlin.reflect.jvm.internal.impl.builtins.UnsignedTypes INSTANCE = new kotlin.reflect.jvm.internal.impl.builtins.UnsignedTypes();
    private static final java.util.HashMap<kotlin.reflect.jvm.internal.impl.name.ClassId, kotlin.reflect.jvm.internal.impl.name.ClassId> arrayClassIdToUnsignedClassId;
    private static final java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name> arrayClassesShortNames;
    private static final java.util.HashMap<kotlin.reflect.jvm.internal.impl.name.ClassId, kotlin.reflect.jvm.internal.impl.name.ClassId> unsignedClassIdToArrayClassId;
    private static final java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name> unsignedTypeNames;

    static {
        kotlin.reflect.jvm.internal.impl.builtins.UnsignedType[] unsignedTypeArrValues = kotlin.reflect.jvm.internal.impl.builtins.UnsignedType.values();
        java.util.ArrayList arrayList = new java.util.ArrayList(unsignedTypeArrValues.length);
        for (kotlin.reflect.jvm.internal.impl.builtins.UnsignedType unsignedType : unsignedTypeArrValues) {
            arrayList.add(unsignedType.getTypeName());
        }
        unsignedTypeNames = kotlin.collections.CollectionsKt.toSet(arrayList);
        arrayClassIdToUnsignedClassId = new java.util.HashMap<>();
        unsignedClassIdToArrayClassId = new java.util.HashMap<>();
        kotlin.reflect.jvm.internal.impl.builtins.UnsignedType[] unsignedTypeArrValues2 = kotlin.reflect.jvm.internal.impl.builtins.UnsignedType.values();
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        for (kotlin.reflect.jvm.internal.impl.builtins.UnsignedType unsignedType2 : unsignedTypeArrValues2) {
            linkedHashSet.add(unsignedType2.getArrayClassId().getShortClassName());
        }
        arrayClassesShortNames = linkedHashSet;
        for (kotlin.reflect.jvm.internal.impl.builtins.UnsignedType unsignedType3 : kotlin.reflect.jvm.internal.impl.builtins.UnsignedType.values()) {
            arrayClassIdToUnsignedClassId.put(unsignedType3.getArrayClassId(), unsignedType3.getClassId());
            unsignedClassIdToArrayClassId.put(unsignedType3.getClassId(), unsignedType3.getArrayClassId());
        }
    }

    private UnsignedTypes() {
    }

    public final boolean isShortNameOfUnsignedArray(kotlin.reflect.jvm.internal.impl.name.Name name) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(name, "name");
        return arrayClassesShortNames.contains(name);
    }

    public final kotlin.reflect.jvm.internal.impl.name.ClassId getUnsignedClassIdByArrayClassId(kotlin.reflect.jvm.internal.impl.name.ClassId arrayClassId) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(arrayClassId, "arrayClassId");
        return arrayClassIdToUnsignedClassId.get(arrayClassId);
    }

    public final kotlin.reflect.jvm.internal.impl.name.ClassId getUnsignedArrayClassIdByUnsignedClassId(kotlin.reflect.jvm.internal.impl.name.ClassId arrayClassId) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(arrayClassId, "arrayClassId");
        return unsignedClassIdToArrayClassId.get(arrayClassId);
    }

    public final boolean isUnsignedType(kotlin.reflect.jvm.internal.impl.types.KotlinType type) {
        kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor classifierDescriptorMo1268getDeclarationDescriptor;
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(type, "type");
        if (kotlin.reflect.jvm.internal.impl.types.TypeUtils.noExpectedType(type) || (classifierDescriptorMo1268getDeclarationDescriptor = type.getConstructor().mo1268getDeclarationDescriptor()) == null) {
            return false;
        }
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(classifierDescriptorMo1268getDeclarationDescriptor, "type.constructor.declara…escriptor ?: return false");
        return isUnsignedClass(classifierDescriptorMo1268getDeclarationDescriptor);
    }

    public final boolean isUnsignedClass(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor descriptor) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(descriptor, "descriptor");
        kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor containingDeclaration = descriptor.getContainingDeclaration();
        return (containingDeclaration instanceof kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor) && kotlin.jvm.internal.Intrinsics.areEqual(((kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor) containingDeclaration).getFqName(), kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.BUILT_INS_PACKAGE_FQ_NAME) && unsignedTypeNames.contains(descriptor.getName());
    }
}
