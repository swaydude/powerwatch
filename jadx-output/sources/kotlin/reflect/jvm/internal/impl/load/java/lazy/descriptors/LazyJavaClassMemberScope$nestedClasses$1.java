package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

/* JADX INFO: compiled from: LazyJavaClassMemberScope.kt */
/* JADX INFO: loaded from: classes2.dex */
final class LazyJavaClassMemberScope$nestedClasses$1 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.name.Name, kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassDescriptorBase> {
    final /* synthetic */ kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext $c;
    final /* synthetic */ kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LazyJavaClassMemberScope$nestedClasses$1(kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope lazyJavaClassMemberScope, kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext lazyJavaResolverContext) {
        super(1);
        this.this$0 = lazyJavaClassMemberScope;
        this.$c = lazyJavaResolverContext;
    }

    @Override // kotlin.jvm.functions.Function1
    public final kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassDescriptorBase invoke(kotlin.reflect.jvm.internal.impl.name.Name name) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(name, "name");
        kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource lazyJavaClassDescriptor = null;
        if (!((java.util.Set) this.this$0.nestedClassIndex.invoke()).contains(name)) {
            kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField javaField = (kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField) ((java.util.Map) this.this$0.enumEntryIndex.invoke()).get(name);
            if (javaField != null) {
                lazyJavaClassDescriptor = kotlin.reflect.jvm.internal.impl.descriptors.impl.EnumEntrySyntheticClassDescriptor.create(this.$c.getStorageManager(), this.this$0.getOwnerDescriptor(), name, this.$c.getStorageManager().createLazyValue(new kotlin.jvm.functions.Function0<java.util.Set<? extends kotlin.reflect.jvm.internal.impl.name.Name>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope$nestedClasses$1$enumMemberNames$1
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final java.util.Set<? extends kotlin.reflect.jvm.internal.impl.name.Name> invoke() {
                        return kotlin.collections.SetsKt.plus((java.util.Set) this.this$0.this$0.getFunctionNames(), (java.lang.Iterable) this.this$0.this$0.getVariableNames());
                    }
                }), kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotationsKt.resolveAnnotations(this.$c, javaField), this.$c.getComponents().getSourceElementFactory().source(javaField));
            }
            return (kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassDescriptorBase) lazyJavaClassDescriptor;
        }
        kotlin.reflect.jvm.internal.impl.load.java.JavaClassFinder finder = this.$c.getComponents().getFinder();
        kotlin.reflect.jvm.internal.impl.name.ClassId classId = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getClassId(this.this$0.getOwnerDescriptor());
        if (classId == null) {
            kotlin.jvm.internal.Intrinsics.throwNpe();
        }
        kotlin.reflect.jvm.internal.impl.name.ClassId classIdCreateNestedClassId = classId.createNestedClassId(name);
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(classIdCreateNestedClassId, "ownerDescriptor.classId!…createNestedClassId(name)");
        kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass javaClassFindClass = finder.findClass(new kotlin.reflect.jvm.internal.impl.load.java.JavaClassFinder.Request(classIdCreateNestedClassId, null, this.this$0.jClass, 2, null));
        if (javaClassFindClass != null) {
            lazyJavaClassDescriptor = new kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor(this.$c, this.this$0.getOwnerDescriptor(), javaClassFindClass, null, 8, null);
            this.$c.getComponents().getJavaClassesTracker().reportClass((kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaClassDescriptor) lazyJavaClassDescriptor);
        }
        return (kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassDescriptorBase) lazyJavaClassDescriptor;
    }
}
