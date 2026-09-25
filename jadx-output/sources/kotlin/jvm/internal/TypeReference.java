package kotlin.jvm.internal;

/* JADX INFO: compiled from: TypeReference.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\u0017\u001a\u00020\u0013H\u0002J\u0013\u0010\u0018\u001a\u00020\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0096\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u0013H\u0016J\f\u0010\u0017\u001a\u00020\u0013*\u00020\u0006H\u0002R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0011R\u001c\u0010\u0012\u001a\u00020\u0013*\u0006\u0012\u0002\b\u00030\u00148BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001e"}, d2 = {"Lkotlin/jvm/internal/TypeReference;", "Lkotlin/reflect/KType;", "classifier", "Lkotlin/reflect/KClassifier;", "arguments", "", "Lkotlin/reflect/KTypeProjection;", "isMarkedNullable", "", "(Lkotlin/reflect/KClassifier;Ljava/util/List;Z)V", "annotations", "", "getAnnotations", "()Ljava/util/List;", "getArguments", "getClassifier", "()Lkotlin/reflect/KClassifier;", "()Z", "arrayClassName", "", "Ljava/lang/Class;", "getArrayClassName", "(Ljava/lang/Class;)Ljava/lang/String;", "asString", "equals", com.google.android.gms.fitness.FitnessActivities.OTHER, "", "hashCode", "", "toString", "kotlin-stdlib"}, k = 1, mv = {1, 5, 1})
public final class TypeReference implements kotlin.reflect.KType {
    private final java.util.List<kotlin.reflect.KTypeProjection> arguments;
    private final kotlin.reflect.KClassifier classifier;
    private final boolean isMarkedNullable;

    @kotlin.Metadata(k = 3, mv = {1, 5, 1})
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[kotlin.reflect.KVariance.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[kotlin.reflect.KVariance.INVARIANT.ordinal()] = 1;
            iArr[kotlin.reflect.KVariance.IN.ordinal()] = 2;
            iArr[kotlin.reflect.KVariance.OUT.ordinal()] = 3;
        }
    }

    public TypeReference(kotlin.reflect.KClassifier classifier, java.util.List<kotlin.reflect.KTypeProjection> arguments, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classifier, "classifier");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(arguments, "arguments");
        this.classifier = classifier;
        this.arguments = arguments;
        this.isMarkedNullable = z;
    }

    @Override // kotlin.reflect.KType
    public kotlin.reflect.KClassifier getClassifier() {
        return this.classifier;
    }

    @Override // kotlin.reflect.KType
    public java.util.List<kotlin.reflect.KTypeProjection> getArguments() {
        return this.arguments;
    }

    @Override // kotlin.reflect.KType
    /* JADX INFO: renamed from: isMarkedNullable, reason: from getter */
    public boolean getIsMarkedNullable() {
        return this.isMarkedNullable;
    }

    @Override // kotlin.reflect.KAnnotatedElement
    public java.util.List<java.lang.annotation.Annotation> getAnnotations() {
        return kotlin.collections.CollectionsKt.emptyList();
    }

    public boolean equals(java.lang.Object other) {
        if (other instanceof kotlin.jvm.internal.TypeReference) {
            kotlin.jvm.internal.TypeReference typeReference = (kotlin.jvm.internal.TypeReference) other;
            if (kotlin.jvm.internal.Intrinsics.areEqual(getClassifier(), typeReference.getClassifier()) && kotlin.jvm.internal.Intrinsics.areEqual(getArguments(), typeReference.getArguments()) && getIsMarkedNullable() == typeReference.getIsMarkedNullable()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((getClassifier().hashCode() * 31) + getArguments().hashCode()) * 31) + java.lang.Boolean.valueOf(getIsMarkedNullable()).hashCode();
    }

    public java.lang.String toString() {
        return asString() + " (Kotlin reflection is not available)";
    }

    private final java.lang.String asString() {
        java.lang.String arrayClassName;
        kotlin.reflect.KClassifier classifier = getClassifier();
        if (!(classifier instanceof kotlin.reflect.KClass)) {
            classifier = null;
        }
        kotlin.reflect.KClass kClass = (kotlin.reflect.KClass) classifier;
        java.lang.Class<?> javaClass = kClass != null ? kotlin.jvm.JvmClassMappingKt.getJavaClass(kClass) : null;
        if (javaClass == null) {
            arrayClassName = getClassifier().toString();
        } else {
            arrayClassName = javaClass.isArray() ? getArrayClassName(javaClass) : javaClass.getName();
        }
        return arrayClassName + (getArguments().isEmpty() ? "" : kotlin.collections.CollectionsKt.joinToString$default(getArguments(), ", ", "<", ">", 0, null, new kotlin.jvm.functions.Function1<kotlin.reflect.KTypeProjection, java.lang.CharSequence>() { // from class: kotlin.jvm.internal.TypeReference$asString$args$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final java.lang.CharSequence invoke(kotlin.reflect.KTypeProjection it) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                return this.this$0.asString(it);
            }
        }, 24, null)) + (getIsMarkedNullable() ? "?" : "");
    }

    private final java.lang.String getArrayClassName(java.lang.Class<?> cls) {
        if (kotlin.jvm.internal.Intrinsics.areEqual(cls, boolean[].class)) {
            return "kotlin.BooleanArray";
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(cls, char[].class)) {
            return "kotlin.CharArray";
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(cls, byte[].class)) {
            return "kotlin.ByteArray";
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(cls, short[].class)) {
            return "kotlin.ShortArray";
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(cls, int[].class)) {
            return "kotlin.IntArray";
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(cls, float[].class)) {
            return "kotlin.FloatArray";
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(cls, long[].class)) {
            return "kotlin.LongArray";
        }
        return kotlin.jvm.internal.Intrinsics.areEqual(cls, double[].class) ? "kotlin.DoubleArray" : "kotlin.Array";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.String asString(kotlin.reflect.KTypeProjection kTypeProjection) {
        java.lang.String strValueOf;
        if (kTypeProjection.getVariance() == null) {
            return "*";
        }
        kotlin.reflect.KType type = kTypeProjection.getType();
        if (!(type instanceof kotlin.jvm.internal.TypeReference)) {
            type = null;
        }
        kotlin.jvm.internal.TypeReference typeReference = (kotlin.jvm.internal.TypeReference) type;
        if (typeReference == null || (strValueOf = typeReference.asString()) == null) {
            strValueOf = java.lang.String.valueOf(kTypeProjection.getType());
        }
        kotlin.reflect.KVariance variance = kTypeProjection.getVariance();
        if (variance != null) {
            int i = kotlin.jvm.internal.TypeReference.WhenMappings.$EnumSwitchMapping$0[variance.ordinal()];
            if (i == 1) {
                return strValueOf;
            }
            if (i == 2) {
                return "in " + strValueOf;
            }
            if (i == 3) {
                return "out " + strValueOf;
            }
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }
}
