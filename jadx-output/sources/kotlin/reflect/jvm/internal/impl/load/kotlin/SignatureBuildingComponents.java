package kotlin.reflect.jvm.internal.impl.load.kotlin;

/* JADX INFO: compiled from: methodSignatureBuilding.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class SignatureBuildingComponents {
    public static final kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents INSTANCE = new kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents();

    private SignatureBuildingComponents() {
    }

    public final java.lang.String javaLang(java.lang.String name) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(name, "name");
        return "java/lang/" + name;
    }

    public final java.lang.String javaUtil(java.lang.String name) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(name, "name");
        return "java/util/" + name;
    }

    public final java.lang.String javaFunction(java.lang.String name) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(name, "name");
        return "java/util/function/" + name;
    }

    public final java.util.LinkedHashSet<java.lang.String> inJavaLang(java.lang.String name, java.lang.String... signatures) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(name, "name");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(signatures, "signatures");
        return inClass(javaLang(name), (java.lang.String[]) java.util.Arrays.copyOf(signatures, signatures.length));
    }

    public final java.util.LinkedHashSet<java.lang.String> inJavaUtil(java.lang.String name, java.lang.String... signatures) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(name, "name");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(signatures, "signatures");
        return inClass(javaUtil(name), (java.lang.String[]) java.util.Arrays.copyOf(signatures, signatures.length));
    }

    public final java.util.LinkedHashSet<java.lang.String> inClass(java.lang.String internalName, java.lang.String... signatures) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(internalName, "internalName");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(signatures, "signatures");
        java.util.LinkedHashSet<java.lang.String> linkedHashSet = new java.util.LinkedHashSet<>();
        for (java.lang.String str : signatures) {
            linkedHashSet.add(internalName + '.' + str);
        }
        return linkedHashSet;
    }

    public final java.lang.String signature(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor, java.lang.String jvmDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(classDescriptor, "classDescriptor");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(jvmDescriptor, "jvmDescriptor");
        return signature(kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt.getInternalName(classDescriptor), jvmDescriptor);
    }

    public final java.lang.String signature(java.lang.String internalName, java.lang.String jvmDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(internalName, "internalName");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(jvmDescriptor, "jvmDescriptor");
        return internalName + '.' + jvmDescriptor;
    }

    public final java.lang.String jvmDescriptor(java.lang.String name, java.util.List<java.lang.String> parameters, java.lang.String ret) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(name, "name");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(parameters, "parameters");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(ret, "ret");
        return name + '(' + kotlin.collections.CollectionsKt.joinToString$default(parameters, "", null, null, 0, null, new kotlin.jvm.functions.Function1<java.lang.String, java.lang.String>() { // from class: kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents.jvmDescriptor.1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.String invoke(java.lang.String it) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(it, "it");
                return kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents.INSTANCE.escapeClassName(it);
            }
        }, 30, null) + ')' + escapeClassName(ret);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.String escapeClassName(java.lang.String str) {
        if (str.length() <= 1) {
            return str;
        }
        return 'L' + str + ';';
    }

    public final java.lang.String[] constructors(java.lang.String... signatures) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(signatures, "signatures");
        java.util.ArrayList arrayList = new java.util.ArrayList(signatures.length);
        for (java.lang.String str : signatures) {
            arrayList.add("<init>(" + str + ")V");
        }
        java.lang.Object[] array = arrayList.toArray(new java.lang.String[0]);
        if (array != null) {
            return (java.lang.String[]) array;
        }
        throw new kotlin.TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
    }
}
