package kotlin.reflect.jvm.internal.impl.builtins;

/* JADX INFO: compiled from: ReflectionTypes.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class ReflectionTypes {
    static final /* synthetic */ kotlin.reflect.KProperty[] $$delegatedProperties = {kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlin.reflect.jvm.internal.impl.builtins.ReflectionTypes.class), "kotlinReflectScope", "getKotlinReflectScope()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;")), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlin.reflect.jvm.internal.impl.builtins.ReflectionTypes.class), "kClass", "getKClass()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlin.reflect.jvm.internal.impl.builtins.ReflectionTypes.class), "kProperty", "getKProperty()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlin.reflect.jvm.internal.impl.builtins.ReflectionTypes.class), "kProperty0", "getKProperty0()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlin.reflect.jvm.internal.impl.builtins.ReflectionTypes.class), "kProperty1", "getKProperty1()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlin.reflect.jvm.internal.impl.builtins.ReflectionTypes.class), "kProperty2", "getKProperty2()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlin.reflect.jvm.internal.impl.builtins.ReflectionTypes.class), "kMutableProperty0", "getKMutableProperty0()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlin.reflect.jvm.internal.impl.builtins.ReflectionTypes.class), "kMutableProperty1", "getKMutableProperty1()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlin.reflect.jvm.internal.impl.builtins.ReflectionTypes.class), "kMutableProperty2", "getKMutableProperty2()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;"))};
    public static final kotlin.reflect.jvm.internal.impl.builtins.ReflectionTypes.Companion Companion = new kotlin.reflect.jvm.internal.impl.builtins.ReflectionTypes.Companion(null);
    private final kotlin.reflect.jvm.internal.impl.builtins.ReflectionTypes.ClassLookup kClass$delegate;
    private final kotlin.reflect.jvm.internal.impl.builtins.ReflectionTypes.ClassLookup kMutableProperty0$delegate;
    private final kotlin.reflect.jvm.internal.impl.builtins.ReflectionTypes.ClassLookup kMutableProperty1$delegate;
    private final kotlin.reflect.jvm.internal.impl.builtins.ReflectionTypes.ClassLookup kMutableProperty2$delegate;
    private final kotlin.reflect.jvm.internal.impl.builtins.ReflectionTypes.ClassLookup kProperty$delegate;
    private final kotlin.reflect.jvm.internal.impl.builtins.ReflectionTypes.ClassLookup kProperty0$delegate;
    private final kotlin.reflect.jvm.internal.impl.builtins.ReflectionTypes.ClassLookup kProperty1$delegate;
    private final kotlin.reflect.jvm.internal.impl.builtins.ReflectionTypes.ClassLookup kProperty2$delegate;
    private final kotlin.Lazy kotlinReflectScope$delegate;
    private final kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses notFoundClasses;

    private final kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope getKotlinReflectScope() {
        kotlin.Lazy lazy = this.kotlinReflectScope$delegate;
        kotlin.reflect.KProperty kProperty = $$delegatedProperties[0];
        return (kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope) lazy.getValue();
    }

    public final kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor getKClass() {
        return this.kClass$delegate.getValue(this, $$delegatedProperties[1]);
    }

    public ReflectionTypes(final kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor module, kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses notFoundClasses) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(module, "module");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(notFoundClasses, "notFoundClasses");
        this.notFoundClasses = notFoundClasses;
        this.kotlinReflectScope$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope>() { // from class: kotlin.reflect.jvm.internal.impl.builtins.ReflectionTypes$kotlinReflectScope$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope invoke() {
                return module.getPackage(kotlin.reflect.jvm.internal.impl.builtins.ReflectionTypesKt.getKOTLIN_REFLECT_FQ_NAME()).getMemberScope();
            }
        });
        this.kClass$delegate = new kotlin.reflect.jvm.internal.impl.builtins.ReflectionTypes.ClassLookup(1);
        this.kProperty$delegate = new kotlin.reflect.jvm.internal.impl.builtins.ReflectionTypes.ClassLookup(1);
        this.kProperty0$delegate = new kotlin.reflect.jvm.internal.impl.builtins.ReflectionTypes.ClassLookup(1);
        this.kProperty1$delegate = new kotlin.reflect.jvm.internal.impl.builtins.ReflectionTypes.ClassLookup(2);
        this.kProperty2$delegate = new kotlin.reflect.jvm.internal.impl.builtins.ReflectionTypes.ClassLookup(3);
        this.kMutableProperty0$delegate = new kotlin.reflect.jvm.internal.impl.builtins.ReflectionTypes.ClassLookup(1);
        this.kMutableProperty1$delegate = new kotlin.reflect.jvm.internal.impl.builtins.ReflectionTypes.ClassLookup(2);
        this.kMutableProperty2$delegate = new kotlin.reflect.jvm.internal.impl.builtins.ReflectionTypes.ClassLookup(3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor find(java.lang.String str, int i) {
        kotlin.reflect.jvm.internal.impl.name.Name nameIdentifier = kotlin.reflect.jvm.internal.impl.name.Name.identifier(str);
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(nameIdentifier, "Name.identifier(className)");
        kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor contributedClassifier = getKotlinReflectScope().mo1270getContributedClassifier(nameIdentifier, kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation.FROM_REFLECTION);
        if (!(contributedClassifier instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor)) {
            contributedClassifier = null;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor = (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) contributedClassifier;
        return classDescriptor != null ? classDescriptor : this.notFoundClasses.getClass(new kotlin.reflect.jvm.internal.impl.name.ClassId(kotlin.reflect.jvm.internal.impl.builtins.ReflectionTypesKt.getKOTLIN_REFLECT_FQ_NAME(), nameIdentifier), kotlin.collections.CollectionsKt.listOf(java.lang.Integer.valueOf(i)));
    }

    /* JADX INFO: compiled from: ReflectionTypes.kt */
    private static final class ClassLookup {
        private final int numberOfTypeParameters;

        public ClassLookup(int i) {
            this.numberOfTypeParameters = i;
        }

        public final kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor getValue(kotlin.reflect.jvm.internal.impl.builtins.ReflectionTypes types, kotlin.reflect.KProperty<?> property) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(types, "types");
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(property, "property");
            return types.find(kotlin.text.StringsKt.capitalize(property.getName()), this.numberOfTypeParameters);
        }
    }

    /* JADX INFO: compiled from: ReflectionTypes.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final kotlin.reflect.jvm.internal.impl.types.KotlinType createKPropertyStarType(kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor module) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(module, "module");
            kotlin.reflect.jvm.internal.impl.name.ClassId classId = kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.FQ_NAMES.kProperty;
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(classId, "KotlinBuiltIns.FQ_NAMES.kProperty");
            kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptorFindClassAcrossModuleDependencies = kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt.findClassAcrossModuleDependencies(module, classId);
            if (classDescriptorFindClassAcrossModuleDependencies == null) {
                return null;
            }
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations empty = kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations.Companion.getEMPTY();
            kotlin.reflect.jvm.internal.impl.types.TypeConstructor typeConstructor = classDescriptorFindClassAcrossModuleDependencies.getTypeConstructor();
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(typeConstructor, "kPropertyClass.typeConstructor");
            java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> parameters = typeConstructor.getParameters();
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(parameters, "kPropertyClass.typeConstructor.parameters");
            java.lang.Object objSingle = kotlin.collections.CollectionsKt.single((java.util.List<? extends java.lang.Object>) parameters);
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(objSingle, "kPropertyClass.typeConstructor.parameters.single()");
            return kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.simpleNotNullType(empty, classDescriptorFindClassAcrossModuleDependencies, kotlin.collections.CollectionsKt.listOf(new kotlin.reflect.jvm.internal.impl.types.StarProjectionImpl((kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor) objSingle)));
        }
    }
}
