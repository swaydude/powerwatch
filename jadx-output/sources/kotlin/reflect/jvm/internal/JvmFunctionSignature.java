package kotlin.reflect.jvm.internal;

/* JADX INFO: compiled from: RuntimeTypeMapper.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0005\u0005\u0006\u0007\b\tB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u0082\u0001\u0005\n\u000b\f\r\u000e¨\u0006\u000f"}, d2 = {"Lkotlin/reflect/jvm/internal/JvmFunctionSignature;", "", "()V", "asString", "", "FakeJavaAnnotationConstructor", "JavaConstructor", "JavaMethod", "KotlinConstructor", "KotlinFunction", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinFunction;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinConstructor;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature$JavaMethod;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature$JavaConstructor;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature$FakeJavaAnnotationConstructor;", "kotlin-reflection"}, k = 1, mv = {1, 1, 15})
public abstract class JvmFunctionSignature {
    /* JADX INFO: renamed from: asString */
    public abstract java.lang.String get_signature();

    private JvmFunctionSignature() {
    }

    public /* synthetic */ JvmFunctionSignature(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: compiled from: RuntimeTypeMapper.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u000e\u001a\u00020\u0006H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinFunction;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature;", "signature", "Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/JvmMemberSignature$Method;", "(Lorg/jetbrains/kotlin/metadata/jvm/deserialization/JvmMemberSignature$Method;)V", "_signature", "", "methodDesc", "getMethodDesc", "()Ljava/lang/String;", "methodName", "getMethodName", "getSignature", "()Lorg/jetbrains/kotlin/metadata/jvm/deserialization/JvmMemberSignature$Method;", "asString", "kotlin-reflection"}, k = 1, mv = {1, 1, 15})
    public static final class KotlinFunction extends kotlin.reflect.jvm.internal.JvmFunctionSignature {
        private final java.lang.String _signature;
        private final kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature.Method signature;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public KotlinFunction(kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature.Method signature) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(signature, "signature");
            this.signature = signature;
            this._signature = signature.asString();
        }

        public final java.lang.String getMethodName() {
            return this.signature.getName();
        }

        public final java.lang.String getMethodDesc() {
            return this.signature.getDesc();
        }

        @Override // kotlin.reflect.jvm.internal.JvmFunctionSignature
        /* JADX INFO: renamed from: asString, reason: from getter */
        public java.lang.String get_signature() {
            return this._signature;
        }
    }

    /* JADX INFO: compiled from: RuntimeTypeMapper.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\f\u001a\u00020\u0006H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinConstructor;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature;", "signature", "Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/JvmMemberSignature$Method;", "(Lorg/jetbrains/kotlin/metadata/jvm/deserialization/JvmMemberSignature$Method;)V", "_signature", "", "constructorDesc", "getConstructorDesc", "()Ljava/lang/String;", "getSignature", "()Lorg/jetbrains/kotlin/metadata/jvm/deserialization/JvmMemberSignature$Method;", "asString", "kotlin-reflection"}, k = 1, mv = {1, 1, 15})
    public static final class KotlinConstructor extends kotlin.reflect.jvm.internal.JvmFunctionSignature {
        private final java.lang.String _signature;
        private final kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature.Method signature;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public KotlinConstructor(kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature.Method signature) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(signature, "signature");
            this.signature = signature;
            this._signature = signature.asString();
        }

        public final java.lang.String getConstructorDesc() {
            return this.signature.getDesc();
        }

        @Override // kotlin.reflect.jvm.internal.JvmFunctionSignature
        /* JADX INFO: renamed from: asString, reason: from getter */
        public java.lang.String get_signature() {
            return this._signature;
        }
    }

    /* JADX INFO: compiled from: RuntimeTypeMapper.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lkotlin/reflect/jvm/internal/JvmFunctionSignature$JavaMethod;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature;", com.google.firebase.analytics.FirebaseAnalytics.Param.METHOD, "Ljava/lang/reflect/Method;", "(Ljava/lang/reflect/Method;)V", "getMethod", "()Ljava/lang/reflect/Method;", "asString", "", "kotlin-reflection"}, k = 1, mv = {1, 1, 15})
    public static final class JavaMethod extends kotlin.reflect.jvm.internal.JvmFunctionSignature {
        private final java.lang.reflect.Method method;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public JavaMethod(java.lang.reflect.Method method) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(method, "method");
            this.method = method;
        }

        public final java.lang.reflect.Method getMethod() {
            return this.method;
        }

        @Override // kotlin.reflect.jvm.internal.JvmFunctionSignature
        /* JADX INFO: renamed from: asString */
        public java.lang.String get_signature() {
            return kotlin.reflect.jvm.internal.RuntimeTypeMapperKt.getSignature(this.method);
        }
    }

    /* JADX INFO: compiled from: RuntimeTypeMapper.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016R\u0015\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lkotlin/reflect/jvm/internal/JvmFunctionSignature$JavaConstructor;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature;", "constructor", "Ljava/lang/reflect/Constructor;", "(Ljava/lang/reflect/Constructor;)V", "getConstructor", "()Ljava/lang/reflect/Constructor;", "asString", "", "kotlin-reflection"}, k = 1, mv = {1, 1, 15})
    public static final class JavaConstructor extends kotlin.reflect.jvm.internal.JvmFunctionSignature {
        private final java.lang.reflect.Constructor<?> constructor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public JavaConstructor(java.lang.reflect.Constructor<?> constructor) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(constructor, "constructor");
            this.constructor = constructor;
        }

        public final java.lang.reflect.Constructor<?> getConstructor() {
            return this.constructor;
        }

        @Override // kotlin.reflect.jvm.internal.JvmFunctionSignature
        /* JADX INFO: renamed from: asString */
        public java.lang.String get_signature() {
            java.lang.Class<?>[] parameterTypes = this.constructor.getParameterTypes();
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(parameterTypes, "constructor.parameterTypes");
            return kotlin.collections.ArraysKt.joinToString$default(parameterTypes, "", "<init>(", ")V", 0, (java.lang.CharSequence) null, new kotlin.jvm.functions.Function1<java.lang.Class<?>, java.lang.String>() { // from class: kotlin.reflect.jvm.internal.JvmFunctionSignature$JavaConstructor$asString$1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.String invoke(java.lang.Class<?> it) {
                    kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(it, "it");
                    return kotlin.reflect.jvm.internal.structure.ReflectClassUtilKt.getDesc(it);
                }
            }, 24, (java.lang.Object) null);
        }
    }

    /* JADX INFO: compiled from: RuntimeTypeMapper.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\r\u001a\u00020\u000eH\u0016R\u0015\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001f\u0010\u0007\u001a\u0010\u0012\f\u0012\n \n*\u0004\u0018\u00010\t0\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lkotlin/reflect/jvm/internal/JvmFunctionSignature$FakeJavaAnnotationConstructor;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature;", "jClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)V", "getJClass", "()Ljava/lang/Class;", "methods", "", "Ljava/lang/reflect/Method;", "kotlin.jvm.PlatformType", "getMethods", "()Ljava/util/List;", "asString", "", "kotlin-reflection"}, k = 1, mv = {1, 1, 15})
    public static final class FakeJavaAnnotationConstructor extends kotlin.reflect.jvm.internal.JvmFunctionSignature {
        private final java.lang.Class<?> jClass;
        private final java.util.List<java.lang.reflect.Method> methods;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FakeJavaAnnotationConstructor(java.lang.Class<?> jClass) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(jClass, "jClass");
            this.jClass = jClass;
            java.lang.reflect.Method[] declaredMethods = jClass.getDeclaredMethods();
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(declaredMethods, "jClass.declaredMethods");
            this.methods = kotlin.collections.ArraysKt.sortedWith(declaredMethods, new java.util.Comparator<T>() { // from class: kotlin.reflect.jvm.internal.JvmFunctionSignature$FakeJavaAnnotationConstructor$$special$$inlined$sortedBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    java.lang.reflect.Method it = (java.lang.reflect.Method) t;
                    kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(it, "it");
                    java.lang.String name = it.getName();
                    java.lang.reflect.Method it2 = (java.lang.reflect.Method) t2;
                    kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(it2, "it");
                    return kotlin.comparisons.ComparisonsKt.compareValues(name, it2.getName());
                }
            });
        }

        public final java.util.List<java.lang.reflect.Method> getMethods() {
            return this.methods;
        }

        @Override // kotlin.reflect.jvm.internal.JvmFunctionSignature
        /* JADX INFO: renamed from: asString */
        public java.lang.String get_signature() {
            return kotlin.collections.CollectionsKt.joinToString$default(this.methods, "", "<init>(", ")V", 0, null, new kotlin.jvm.functions.Function1<java.lang.reflect.Method, java.lang.String>() { // from class: kotlin.reflect.jvm.internal.JvmFunctionSignature$FakeJavaAnnotationConstructor$asString$1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.String invoke(java.lang.reflect.Method it) {
                    kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(it, "it");
                    java.lang.Class<?> returnType = it.getReturnType();
                    kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(returnType, "it.returnType");
                    return kotlin.reflect.jvm.internal.structure.ReflectClassUtilKt.getDesc(returnType);
                }
            }, 24, null);
        }
    }
}
