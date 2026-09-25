package kotlin.reflect.jvm.internal.structure;

/* JADX INFO: compiled from: ReflectJavaAnnotationArguments.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lkotlin/reflect/jvm/internal/structure/ReflectJavaAnnotationArgument;", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaAnnotationArgument;", com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME, "Lkotlin/reflect/jvm/internal/impl/name/Name;", "(Lorg/jetbrains/kotlin/name/Name;)V", "getName", "()Lorg/jetbrains/kotlin/name/Name;", "Factory", "descriptors.runtime"}, k = 1, mv = {1, 1, 15})
public abstract class ReflectJavaAnnotationArgument implements kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationArgument {

    /* JADX INFO: renamed from: Factory, reason: from kotlin metadata */
    public static final kotlin.reflect.jvm.internal.structure.ReflectJavaAnnotationArgument.Companion INSTANCE = new kotlin.reflect.jvm.internal.structure.ReflectJavaAnnotationArgument.Companion(null);
    private final kotlin.reflect.jvm.internal.impl.name.Name name;

    public ReflectJavaAnnotationArgument(kotlin.reflect.jvm.internal.impl.name.Name name) {
        this.name = name;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationArgument
    public kotlin.reflect.jvm.internal.impl.name.Name getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.structure.ReflectJavaAnnotationArgument$Factory, reason: from kotlin metadata */
    /* JADX INFO: compiled from: ReflectJavaAnnotationArguments.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\b"}, d2 = {"Lkotlin/reflect/jvm/internal/structure/ReflectJavaAnnotationArgument$Factory;", "", "()V", "create", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaAnnotationArgument;", "value", com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME, "Lkotlin/reflect/jvm/internal/impl/name/Name;", "descriptors.runtime"}, k = 1, mv = {1, 1, 15})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final kotlin.reflect.jvm.internal.structure.ReflectJavaAnnotationArgument create(java.lang.Object value, kotlin.reflect.jvm.internal.impl.name.Name name) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(value, "value");
            if (kotlin.reflect.jvm.internal.structure.ReflectClassUtilKt.isEnumClassOrSpecializedEnumEntryClass(value.getClass())) {
                return new kotlin.reflect.jvm.internal.structure.ReflectJavaEnumValueAnnotationArgument(name, (java.lang.Enum) value);
            }
            if (value instanceof java.lang.annotation.Annotation) {
                return new kotlin.reflect.jvm.internal.structure.ReflectJavaAnnotationAsAnnotationArgument(name, (java.lang.annotation.Annotation) value);
            }
            if (value instanceof java.lang.Object[]) {
                return new kotlin.reflect.jvm.internal.structure.ReflectJavaArrayAnnotationArgument(name, (java.lang.Object[]) value);
            }
            return value instanceof java.lang.Class ? new kotlin.reflect.jvm.internal.structure.ReflectJavaClassObjectAnnotationArgument(name, (java.lang.Class) value) : new kotlin.reflect.jvm.internal.structure.ReflectJavaLiteralAnnotationArgument(name, value);
        }
    }
}
