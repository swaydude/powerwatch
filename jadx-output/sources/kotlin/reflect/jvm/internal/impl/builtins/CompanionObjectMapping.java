package kotlin.reflect.jvm.internal.impl.builtins;

/* JADX INFO: compiled from: CompanionObjectMapping.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class CompanionObjectMapping {
    public static final kotlin.reflect.jvm.internal.impl.builtins.CompanionObjectMapping INSTANCE = new kotlin.reflect.jvm.internal.impl.builtins.CompanionObjectMapping();
    private static final java.util.LinkedHashSet<kotlin.reflect.jvm.internal.impl.name.ClassId> classIds;

    static {
        java.util.Set<kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType> set = kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType.NUMBER_TYPES;
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(set, "PrimitiveType.NUMBER_TYPES");
        java.util.Set<kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType> set2 = set;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(set2, 10));
        java.util.Iterator<T> it = set2.iterator();
        while (it.hasNext()) {
            arrayList.add(kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.getPrimitiveFqName((kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType) it.next()));
        }
        java.util.List listPlus = kotlin.collections.CollectionsKt.plus((java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.name.FqName>) kotlin.collections.CollectionsKt.plus((java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.name.FqName>) kotlin.collections.CollectionsKt.plus((java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.name.FqName>) arrayList, kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.FQ_NAMES.string.toSafe()), kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.FQ_NAMES._boolean.toSafe()), kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.FQ_NAMES._enum.toSafe());
        java.util.LinkedHashSet<kotlin.reflect.jvm.internal.impl.name.ClassId> linkedHashSet = new java.util.LinkedHashSet<>();
        java.util.Iterator it2 = listPlus.iterator();
        while (it2.hasNext()) {
            linkedHashSet.add(kotlin.reflect.jvm.internal.impl.name.ClassId.topLevel((kotlin.reflect.jvm.internal.impl.name.FqName) it2.next()));
        }
        classIds = linkedHashSet;
    }

    private CompanionObjectMapping() {
    }

    public final java.util.Set<kotlin.reflect.jvm.internal.impl.name.ClassId> allClassesWithIntrinsicCompanions() {
        java.util.Set<kotlin.reflect.jvm.internal.impl.name.ClassId> setUnmodifiableSet = java.util.Collections.unmodifiableSet(classIds);
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(setUnmodifiableSet, "Collections.unmodifiableSet(classIds)");
        return setUnmodifiableSet;
    }

    public final boolean isMappedIntrinsicCompanionObject(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(classDescriptor, "classDescriptor");
        if (kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.isCompanionObject(classDescriptor)) {
            java.util.LinkedHashSet<kotlin.reflect.jvm.internal.impl.name.ClassId> linkedHashSet = classIds;
            kotlin.reflect.jvm.internal.impl.name.ClassId classId = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getClassId(classDescriptor);
            if (kotlin.collections.CollectionsKt.contains(linkedHashSet, classId != null ? classId.getOuterClassId() : null)) {
                return true;
            }
        }
        return false;
    }
}
