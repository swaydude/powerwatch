package kotlin.reflect.jvm.internal.impl.builtins.functions;

/* JADX INFO: compiled from: BuiltInFictitiousFunctionClassFactory.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class BuiltInFictitiousFunctionClassFactory implements kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory {
    public static final kotlin.reflect.jvm.internal.impl.builtins.functions.BuiltInFictitiousFunctionClassFactory.Companion Companion = new kotlin.reflect.jvm.internal.impl.builtins.functions.BuiltInFictitiousFunctionClassFactory.Companion(null);
    private final kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor module;
    private final kotlin.reflect.jvm.internal.impl.storage.StorageManager storageManager;

    public BuiltInFictitiousFunctionClassFactory(kotlin.reflect.jvm.internal.impl.storage.StorageManager storageManager, kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor module) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(storageManager, "storageManager");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(module, "module");
        this.storageManager = storageManager;
        this.module = module;
    }

    /* JADX INFO: compiled from: BuiltInFictitiousFunctionClassFactory.kt */
    private static final class KindWithArity {
        private final int arity;
        private final kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassDescriptor.Kind kind;

        public final kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassDescriptor.Kind component1() {
            return this.kind;
        }

        public final int component2() {
            return this.arity;
        }

        public boolean equals(java.lang.Object obj) {
            if (this != obj) {
                if (obj instanceof kotlin.reflect.jvm.internal.impl.builtins.functions.BuiltInFictitiousFunctionClassFactory.KindWithArity) {
                    kotlin.reflect.jvm.internal.impl.builtins.functions.BuiltInFictitiousFunctionClassFactory.KindWithArity kindWithArity = (kotlin.reflect.jvm.internal.impl.builtins.functions.BuiltInFictitiousFunctionClassFactory.KindWithArity) obj;
                    if (kotlin.jvm.internal.Intrinsics.areEqual(this.kind, kindWithArity.kind)) {
                        if (this.arity == kindWithArity.arity) {
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassDescriptor.Kind kind = this.kind;
            return ((kind != null ? kind.hashCode() : 0) * 31) + this.arity;
        }

        public java.lang.String toString() {
            return "KindWithArity(kind=" + this.kind + ", arity=" + this.arity + ")";
        }

        public KindWithArity(kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassDescriptor.Kind kind, int i) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(kind, "kind");
            this.kind = kind;
            this.arity = i;
        }

        public final kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassDescriptor.Kind getKind() {
            return this.kind;
        }
    }

    /* JADX INFO: compiled from: BuiltInFictitiousFunctionClassFactory.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final kotlin.reflect.jvm.internal.impl.builtins.functions.BuiltInFictitiousFunctionClassFactory.KindWithArity parseClassName(java.lang.String str, kotlin.reflect.jvm.internal.impl.name.FqName fqName) {
            kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassDescriptor.Kind kindByClassNamePrefix = kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassDescriptor.Kind.Companion.byClassNamePrefix(fqName, str);
            if (kindByClassNamePrefix == null) {
                return null;
            }
            kotlin.reflect.jvm.internal.impl.builtins.functions.BuiltInFictitiousFunctionClassFactory.Companion companion = this;
            int length = kindByClassNamePrefix.getClassNamePrefix().length();
            if (str == null) {
                throw new kotlin.TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
            java.lang.String strSubstring = str.substring(length);
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(strSubstring, "(this as java.lang.String).substring(startIndex)");
            java.lang.Integer num = companion.toInt(strSubstring);
            if (num != null) {
                return new kotlin.reflect.jvm.internal.impl.builtins.functions.BuiltInFictitiousFunctionClassFactory.KindWithArity(kindByClassNamePrefix, num.intValue());
            }
            return null;
        }

        @kotlin.jvm.JvmStatic
        public final kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassDescriptor.Kind getFunctionalClassKind(java.lang.String className, kotlin.reflect.jvm.internal.impl.name.FqName packageFqName) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(className, "className");
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(packageFqName, "packageFqName");
            kotlin.reflect.jvm.internal.impl.builtins.functions.BuiltInFictitiousFunctionClassFactory.KindWithArity className2 = parseClassName(className, packageFqName);
            if (className2 != null) {
                return className2.getKind();
            }
            return null;
        }

        private final java.lang.Integer toInt(java.lang.String str) {
            if (str.length() == 0) {
                return null;
            }
            int length = str.length();
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                int iCharAt = str.charAt(i2) - '0';
                if (iCharAt < 0 || 9 < iCharAt) {
                    return null;
                }
                i = (i * 10) + iCharAt;
            }
            return java.lang.Integer.valueOf(i);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory
    public boolean shouldCreateClass(kotlin.reflect.jvm.internal.impl.name.FqName packageFqName, kotlin.reflect.jvm.internal.impl.name.Name name) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(packageFqName, "packageFqName");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(name, "name");
        java.lang.String strAsString = name.asString();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(strAsString, "name.asString()");
        return (kotlin.text.StringsKt.startsWith$default(strAsString, "Function", false, 2, (java.lang.Object) null) || kotlin.text.StringsKt.startsWith$default(strAsString, "KFunction", false, 2, (java.lang.Object) null) || kotlin.text.StringsKt.startsWith$default(strAsString, "SuspendFunction", false, 2, (java.lang.Object) null) || kotlin.text.StringsKt.startsWith$default(strAsString, "KSuspendFunction", false, 2, (java.lang.Object) null)) && Companion.parseClassName(strAsString, packageFqName) != null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory
    public kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor createClass(kotlin.reflect.jvm.internal.impl.name.ClassId classId) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(classId, "classId");
        if (!classId.isLocal() && !classId.isNestedClass()) {
            java.lang.String strAsString = classId.getRelativeClassName().asString();
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(strAsString, "classId.relativeClassName.asString()");
            if (!kotlin.text.StringsKt.contains$default((java.lang.CharSequence) strAsString, (java.lang.CharSequence) "Function", false, 2, (java.lang.Object) null)) {
                return null;
            }
            kotlin.reflect.jvm.internal.impl.name.FqName packageFqName = classId.getPackageFqName();
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(packageFqName, "classId.packageFqName");
            kotlin.reflect.jvm.internal.impl.builtins.functions.BuiltInFictitiousFunctionClassFactory.KindWithArity className = Companion.parseClassName(strAsString, packageFqName);
            if (className != null) {
                kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassDescriptor.Kind kindComponent1 = className.component1();
                int iComponent2 = className.component2();
                java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor> fragments = this.module.getPackage(packageFqName).getFragments();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.Object obj : fragments) {
                    if (obj instanceof kotlin.reflect.jvm.internal.impl.builtins.BuiltInsPackageFragment) {
                        arrayList.add(obj);
                    }
                }
                java.util.ArrayList arrayList2 = arrayList;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                for (java.lang.Object obj2 : arrayList2) {
                    if (obj2 instanceof kotlin.reflect.jvm.internal.impl.builtins.FunctionInterfacePackageFragment) {
                        arrayList3.add(obj2);
                    }
                }
                java.lang.Object objFirst = (kotlin.reflect.jvm.internal.impl.builtins.FunctionInterfacePackageFragment) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) arrayList3);
                if (objFirst == null) {
                    objFirst = kotlin.collections.CollectionsKt.first((java.util.List<? extends java.lang.Object>) arrayList2);
                }
                return new kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassDescriptor(this.storageManager, (kotlin.reflect.jvm.internal.impl.builtins.BuiltInsPackageFragment) objFirst, kindComponent1, iComponent2);
            }
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory
    public java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor> getAllContributedClassesIfPossible(kotlin.reflect.jvm.internal.impl.name.FqName packageFqName) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(packageFqName, "packageFqName");
        return kotlin.collections.SetsKt.emptySet();
    }
}
