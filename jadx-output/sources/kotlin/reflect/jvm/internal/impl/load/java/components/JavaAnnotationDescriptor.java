package kotlin.reflect.jvm.internal.impl.load.java.components;

/* JADX INFO: compiled from: JavaAnnotationMapper.kt */
/* JADX INFO: loaded from: classes2.dex */
public class JavaAnnotationDescriptor implements kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor, kotlin.reflect.jvm.internal.impl.load.java.descriptors.PossiblyExternalAnnotationDescriptor {
    static final /* synthetic */ kotlin.reflect.KProperty[] $$delegatedProperties = {kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlin.reflect.jvm.internal.impl.load.java.components.JavaAnnotationDescriptor.class), "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;"))};
    private final kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationArgument firstArgument;
    private final kotlin.reflect.jvm.internal.impl.name.FqName fqName;
    private final boolean isIdeExternalAnnotation;
    private final kotlin.reflect.jvm.internal.impl.descriptors.SourceElement source;
    private final kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue type$delegate;

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    public kotlin.reflect.jvm.internal.impl.types.SimpleType getType() {
        return (kotlin.reflect.jvm.internal.impl.types.SimpleType) kotlin.reflect.jvm.internal.impl.storage.StorageKt.getValue(this.type$delegate, this, (kotlin.reflect.KProperty<?>) $$delegatedProperties[0]);
    }

    public JavaAnnotationDescriptor(final kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext c, kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation javaAnnotation, kotlin.reflect.jvm.internal.impl.name.FqName fqName) {
        kotlin.reflect.jvm.internal.impl.load.java.sources.JavaSourceElement javaSourceElement;
        java.util.Collection<kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationArgument> arguments;
        kotlin.reflect.jvm.internal.impl.load.java.sources.JavaSourceElement javaSourceElementSource;
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(c, "c");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(fqName, "fqName");
        this.fqName = fqName;
        if (javaAnnotation == null || (javaSourceElementSource = c.getComponents().getSourceElementFactory().source(javaAnnotation)) == null) {
            javaSourceElement = kotlin.reflect.jvm.internal.impl.descriptors.SourceElement.NO_SOURCE;
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(javaSourceElement, "SourceElement.NO_SOURCE");
        } else {
            javaSourceElement = javaSourceElementSource;
        }
        this.source = javaSourceElement;
        this.type$delegate = c.getStorageManager().createLazyValue(new kotlin.jvm.functions.Function0<kotlin.reflect.jvm.internal.impl.types.SimpleType>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.components.JavaAnnotationDescriptor$type$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final kotlin.reflect.jvm.internal.impl.types.SimpleType invoke() {
                kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor builtInClassByFqName = c.getModule().getBuiltIns().getBuiltInClassByFqName(this.this$0.getFqName());
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(builtInClassByFqName, "c.module.builtIns.getBuiltInClassByFqName(fqName)");
                return builtInClassByFqName.getDefaultType();
            }
        });
        this.firstArgument = (javaAnnotation == null || (arguments = javaAnnotation.getArguments()) == null) ? null : (kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationArgument) kotlin.collections.CollectionsKt.firstOrNull(arguments);
        this.isIdeExternalAnnotation = javaAnnotation != null && javaAnnotation.isIdeExternalAnnotation();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    public kotlin.reflect.jvm.internal.impl.name.FqName getFqName() {
        return this.fqName;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    public kotlin.reflect.jvm.internal.impl.descriptors.SourceElement getSource() {
        return this.source;
    }

    protected final kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationArgument getFirstArgument() {
        return this.firstArgument;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    public java.util.Map<kotlin.reflect.jvm.internal.impl.name.Name, kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue<?>> getAllValueArguments() {
        return kotlin.collections.MapsKt.emptyMap();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.descriptors.PossiblyExternalAnnotationDescriptor
    public boolean isIdeExternalAnnotation() {
        return this.isIdeExternalAnnotation;
    }
}
