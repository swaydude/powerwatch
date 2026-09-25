package kotlin.jvm;

/* JADX INFO: compiled from: JvmClassMapping.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\u0010\u0011\n\u0002\b\u0002\u001a\u001f\u0010\u0018\u001a\u00020\u0019\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\r*\u0006\u0012\u0002\b\u00030\u001a¢\u0006\u0002\u0010\u001b\"'\u0010\u0000\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u0002H\u00028F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\"-\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0007\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00018G¢\u0006\f\u0012\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"&\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0007\"\b\b\u0000\u0010\u0002*\u00020\r*\u0002H\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b\n\u0010\u000e\";\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00010\u0007\"\b\b\u0000\u0010\u0002*\u00020\r*\b\u0012\u0004\u0012\u0002H\u00020\u00018Ç\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u000f\u0010\t\u001a\u0004\b\u0010\u0010\u000b\"+\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0007\"\b\b\u0000\u0010\u0002*\u00020\r*\b\u0012\u0004\u0012\u0002H\u00020\u00018F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u000b\"-\u0010\u0013\u001a\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u0007\"\b\b\u0000\u0010\u0002*\u00020\r*\b\u0012\u0004\u0012\u0002H\u00020\u00018F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u000b\"+\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\r*\b\u0012\u0004\u0012\u0002H\u00020\u00078G¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001c"}, d2 = {"annotationClass", "Lkotlin/reflect/KClass;", "T", "", "getAnnotationClass", "(Ljava/lang/annotation/Annotation;)Lkotlin/reflect/KClass;", "java", "Ljava/lang/Class;", "getJavaClass$annotations", "(Lkotlin/reflect/KClass;)V", "getJavaClass", "(Lkotlin/reflect/KClass;)Ljava/lang/Class;", "javaClass", "", "(Ljava/lang/Object;)Ljava/lang/Class;", "getRuntimeClassOfKClassInstance$annotations", "getRuntimeClassOfKClassInstance", "javaObjectType", "getJavaObjectType", "javaPrimitiveType", "getJavaPrimitiveType", "kotlin", "getKotlinClass", "(Ljava/lang/Class;)Lkotlin/reflect/KClass;", "isArrayOf", "", "", "([Ljava/lang/Object;)Z", "kotlin-stdlib"}, k = 2, mv = {1, 5, 1})
public final class JvmClassMappingKt {
    public static /* synthetic */ void getJavaClass$annotations(kotlin.reflect.KClass kClass) {
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Use 'java' property to get Java class corresponding to this Kotlin class or cast this instance to Any if you really want to get the runtime Java class of this implementation of KClass.", replaceWith = @kotlin.ReplaceWith(expression = "(this as Any).javaClass", imports = {}))
    public static /* synthetic */ void getRuntimeClassOfKClassInstance$annotations(kotlin.reflect.KClass kClass) {
    }

    public static final <T> java.lang.Class<T> getJavaClass(kotlin.reflect.KClass<T> java) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(java, "$this$java");
        java.lang.Class<T> cls = (java.lang.Class<T>) ((kotlin.jvm.internal.ClassBasedDeclarationContainer) java).getJClass();
        java.util.Objects.requireNonNull(cls, "null cannot be cast to non-null type java.lang.Class<T>");
        return cls;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final <T> java.lang.Class<T> getJavaPrimitiveType(kotlin.reflect.KClass<T> javaPrimitiveType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(javaPrimitiveType, "$this$javaPrimitiveType");
        java.lang.Class<T> cls = (java.lang.Class<T>) ((kotlin.jvm.internal.ClassBasedDeclarationContainer) javaPrimitiveType).getJClass();
        if (cls.isPrimitive()) {
            java.util.Objects.requireNonNull(cls, "null cannot be cast to non-null type java.lang.Class<T>");
            return cls;
        }
        java.lang.String name = cls.getName();
        if (name != null) {
            switch (name.hashCode()) {
                case -2056817302:
                    if (name.equals("java.lang.Integer")) {
                        return java.lang.Integer.TYPE;
                    }
                    break;
                case -527879800:
                    if (name.equals("java.lang.Float")) {
                        return java.lang.Float.TYPE;
                    }
                    break;
                case -515992664:
                    if (name.equals("java.lang.Short")) {
                        return java.lang.Short.TYPE;
                    }
                    break;
                case 155276373:
                    if (name.equals("java.lang.Character")) {
                        return java.lang.Character.TYPE;
                    }
                    break;
                case 344809556:
                    if (name.equals("java.lang.Boolean")) {
                        return java.lang.Boolean.TYPE;
                    }
                    break;
                case 398507100:
                    if (name.equals("java.lang.Byte")) {
                        return java.lang.Byte.TYPE;
                    }
                    break;
                case 398795216:
                    if (name.equals("java.lang.Long")) {
                        return java.lang.Long.TYPE;
                    }
                    break;
                case 399092968:
                    if (name.equals("java.lang.Void")) {
                        return java.lang.Void.TYPE;
                    }
                    break;
                case 761287205:
                    if (name.equals("java.lang.Double")) {
                        return java.lang.Double.TYPE;
                    }
                    break;
            }
        }
        return null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final <T> java.lang.Class<T> getJavaObjectType(kotlin.reflect.KClass<T> javaObjectType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(javaObjectType, "$this$javaObjectType");
        java.lang.Class<T> cls = (java.lang.Class<T>) ((kotlin.jvm.internal.ClassBasedDeclarationContainer) javaObjectType).getJClass();
        if (!cls.isPrimitive()) {
            java.util.Objects.requireNonNull(cls, "null cannot be cast to non-null type java.lang.Class<T>");
            return cls;
        }
        java.lang.String name = cls.getName();
        if (name != null) {
            switch (name.hashCode()) {
                case -1325958191:
                    if (name.equals("double")) {
                        cls = (java.lang.Class<T>) java.lang.Double.class;
                    }
                    break;
                case 104431:
                    if (name.equals("int")) {
                        cls = (java.lang.Class<T>) java.lang.Integer.class;
                    }
                    break;
                case 3039496:
                    if (name.equals("byte")) {
                        cls = (java.lang.Class<T>) java.lang.Byte.class;
                    }
                    break;
                case 3052374:
                    if (name.equals("char")) {
                        cls = (java.lang.Class<T>) java.lang.Character.class;
                    }
                    break;
                case 3327612:
                    if (name.equals("long")) {
                        cls = (java.lang.Class<T>) java.lang.Long.class;
                    }
                    break;
                case 3625364:
                    if (name.equals("void")) {
                        cls = (java.lang.Class<T>) java.lang.Void.class;
                    }
                    break;
                case 64711720:
                    if (name.equals("boolean")) {
                        cls = (java.lang.Class<T>) java.lang.Boolean.class;
                    }
                    break;
                case 97526364:
                    if (name.equals("float")) {
                        cls = (java.lang.Class<T>) java.lang.Float.class;
                    }
                    break;
                case 109413500:
                    if (name.equals("short")) {
                        cls = (java.lang.Class<T>) java.lang.Short.class;
                    }
                    break;
            }
        }
        java.util.Objects.requireNonNull(cls, "null cannot be cast to non-null type java.lang.Class<T>");
        return cls;
    }

    public static final <T> kotlin.reflect.KClass<T> getKotlinClass(java.lang.Class<T> kotlin2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlin2, "$this$kotlin");
        return kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlin2);
    }

    public static final <T> java.lang.Class<T> getJavaClass(T javaClass) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(javaClass, "$this$javaClass");
        java.lang.Class<T> cls = (java.lang.Class<T>) javaClass.getClass();
        java.util.Objects.requireNonNull(cls, "null cannot be cast to non-null type java.lang.Class<T>");
        return cls;
    }

    public static final <T> java.lang.Class<kotlin.reflect.KClass<T>> getRuntimeClassOfKClassInstance(kotlin.reflect.KClass<T> javaClass) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(javaClass, "$this$javaClass");
        java.lang.Class<kotlin.reflect.KClass<T>> cls = (java.lang.Class<kotlin.reflect.KClass<T>>) javaClass.getClass();
        java.util.Objects.requireNonNull(cls, "null cannot be cast to non-null type java.lang.Class<kotlin.reflect.KClass<T>>");
        return cls;
    }

    public static final /* synthetic */ <T> boolean isArrayOf(java.lang.Object[] isArrayOf) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(isArrayOf, "$this$isArrayOf");
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        return java.lang.Object.class.isAssignableFrom(isArrayOf.getClass().getComponentType());
    }

    public static final <T extends java.lang.annotation.Annotation> kotlin.reflect.KClass<? extends T> getAnnotationClass(T annotationClass) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(annotationClass, "$this$annotationClass");
        java.lang.Class<? extends java.lang.annotation.Annotation> clsAnnotationType = annotationClass.annotationType();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(clsAnnotationType, "(this as java.lang.annot…otation).annotationType()");
        kotlin.reflect.KClass<? extends T> kotlinClass = getKotlinClass(clsAnnotationType);
        java.util.Objects.requireNonNull(kotlinClass, "null cannot be cast to non-null type kotlin.reflect.KClass<out T>");
        return kotlinClass;
    }
}
