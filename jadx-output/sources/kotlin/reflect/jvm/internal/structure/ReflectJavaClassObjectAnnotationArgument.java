package kotlin.reflect.jvm.internal.structure;

/* JADX INFO: compiled from: ReflectJavaAnnotationArguments.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0016R\u0012\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lkotlin/reflect/jvm/internal/structure/ReflectJavaClassObjectAnnotationArgument;", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaAnnotationArgument;", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaClassObjectAnnotationArgument;", com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME, "Lkotlin/reflect/jvm/internal/impl/name/Name;", "klass", "Ljava/lang/Class;", "(Lorg/jetbrains/kotlin/name/Name;Ljava/lang/Class;)V", "getReferencedType", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaType;", "descriptors.runtime"}, k = 1, mv = {1, 1, 15})
public final class ReflectJavaClassObjectAnnotationArgument extends kotlin.reflect.jvm.internal.structure.ReflectJavaAnnotationArgument implements kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassObjectAnnotationArgument {
    private final java.lang.Class<?> klass;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReflectJavaClassObjectAnnotationArgument(kotlin.reflect.jvm.internal.impl.name.Name name, java.lang.Class<?> klass) {
        super(name);
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(klass, "klass");
        this.klass = klass;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassObjectAnnotationArgument
    public kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType getReferencedType() {
        return kotlin.reflect.jvm.internal.structure.ReflectJavaType.INSTANCE.create(this.klass);
    }
}
