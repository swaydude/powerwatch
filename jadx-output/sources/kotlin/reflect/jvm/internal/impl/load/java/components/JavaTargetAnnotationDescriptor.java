package kotlin.reflect.jvm.internal.impl.load.java.components;

/* JADX INFO: compiled from: JavaAnnotationMapper.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class JavaTargetAnnotationDescriptor extends kotlin.reflect.jvm.internal.impl.load.java.components.JavaAnnotationDescriptor {
    static final /* synthetic */ kotlin.reflect.KProperty[] $$delegatedProperties = {kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlin.reflect.jvm.internal.impl.load.java.components.JavaTargetAnnotationDescriptor.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};
    private final kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue allValueArguments$delegate;

    @Override // kotlin.reflect.jvm.internal.impl.load.java.components.JavaAnnotationDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    public java.util.Map<kotlin.reflect.jvm.internal.impl.name.Name, kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue<?>> getAllValueArguments() {
        return (java.util.Map) kotlin.reflect.jvm.internal.impl.storage.StorageKt.getValue(this.allValueArguments$delegate, this, (kotlin.reflect.KProperty<?>) $$delegatedProperties[0]);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public JavaTargetAnnotationDescriptor(kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation annotation, kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext c) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(annotation, "annotation");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(c, "c");
        kotlin.reflect.jvm.internal.impl.name.FqName fqName = kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.FQ_NAMES.target;
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(fqName, "KotlinBuiltIns.FQ_NAMES.target");
        super(c, annotation, fqName);
        this.allValueArguments$delegate = c.getStorageManager().createLazyValue(new kotlin.jvm.functions.Function0<java.util.Map<kotlin.reflect.jvm.internal.impl.name.Name, ? extends kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue<?>>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.components.JavaTargetAnnotationDescriptor$allValueArguments$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final java.util.Map<kotlin.reflect.jvm.internal.impl.name.Name, ? extends kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue<?>> invoke() {
                kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue<?> constantValueMapJavaTargetArguments$descriptors_jvm;
                kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationArgument firstArgument = this.this$0.getFirstArgument();
                if (firstArgument instanceof kotlin.reflect.jvm.internal.impl.load.java.structure.JavaArrayAnnotationArgument) {
                    constantValueMapJavaTargetArguments$descriptors_jvm = kotlin.reflect.jvm.internal.impl.load.java.components.JavaAnnotationTargetMapper.INSTANCE.mapJavaTargetArguments$descriptors_jvm(((kotlin.reflect.jvm.internal.impl.load.java.structure.JavaArrayAnnotationArgument) this.this$0.getFirstArgument()).getElements());
                } else {
                    constantValueMapJavaTargetArguments$descriptors_jvm = firstArgument instanceof kotlin.reflect.jvm.internal.impl.load.java.structure.JavaEnumValueAnnotationArgument ? kotlin.reflect.jvm.internal.impl.load.java.components.JavaAnnotationTargetMapper.INSTANCE.mapJavaTargetArguments$descriptors_jvm(kotlin.collections.CollectionsKt.listOf(this.this$0.getFirstArgument())) : null;
                }
                java.util.Map<kotlin.reflect.jvm.internal.impl.name.Name, ? extends kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue<?>> mapMapOf = constantValueMapJavaTargetArguments$descriptors_jvm != null ? kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(kotlin.reflect.jvm.internal.impl.load.java.components.JavaAnnotationMapper.INSTANCE.getTARGET_ANNOTATION_ALLOWED_TARGETS$descriptors_jvm(), constantValueMapJavaTargetArguments$descriptors_jvm)) : null;
                return mapMapOf != null ? mapMapOf : kotlin.collections.MapsKt.emptyMap();
            }
        });
    }
}
