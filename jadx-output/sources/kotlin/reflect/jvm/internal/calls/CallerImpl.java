package kotlin.reflect.jvm.internal.calls;

/* JADX INFO: compiled from: CallerImpl.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000 \u001e*\n\b\u0000\u0010\u0001 \u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\b\u001b\u001c\u001d\u001e\u001f !\"B3\b\u0002\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0002\b\u0003\u0018\u00010\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\n¢\u0006\u0002\u0010\u000bJ\u0012\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0004R\u0017\u0010\u0007\u001a\b\u0012\u0002\b\u0003\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0012X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016\u0082\u0001\u0007#$%&'()¨\u0006*"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl;", "M", "Ljava/lang/reflect/Member;", "Lkotlin/reflect/jvm/internal/calls/Caller;", "member", "returnType", "Ljava/lang/reflect/Type;", "instanceClass", "Ljava/lang/Class;", "valueParameterTypes", "", "(Ljava/lang/reflect/Member;Ljava/lang/reflect/Type;Ljava/lang/Class;[Ljava/lang/reflect/Type;)V", "getInstanceClass", "()Ljava/lang/Class;", "getMember", "()Ljava/lang/reflect/Member;", "Ljava/lang/reflect/Member;", "parameterTypes", "", "getParameterTypes", "()Ljava/util/List;", "getReturnType", "()Ljava/lang/reflect/Type;", "checkObjectInstance", "", "obj", "", "AccessorForHiddenBoundConstructor", "AccessorForHiddenConstructor", "BoundConstructor", "Companion", "Constructor", "FieldGetter", "FieldSetter", "Method", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Constructor;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$BoundConstructor;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$AccessorForHiddenConstructor;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$AccessorForHiddenBoundConstructor;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter;", "kotlin-reflection"}, k = 1, mv = {1, 1, 15})
public abstract class CallerImpl<M extends java.lang.reflect.Member> implements kotlin.reflect.jvm.internal.calls.Caller<M> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final kotlin.reflect.jvm.internal.calls.CallerImpl.Companion INSTANCE = new kotlin.reflect.jvm.internal.calls.CallerImpl.Companion(null);
    private final java.lang.Class<?> instanceClass;
    private final M member;
    private final java.util.List<java.lang.reflect.Type> parameterTypes;
    private final java.lang.reflect.Type returnType;

    /* JADX WARN: Code duplicated, block: B:7:0x002c  */
    private CallerImpl(M m, java.lang.reflect.Type type, java.lang.Class<?> cls, java.lang.reflect.Type[] typeArr) {
        java.util.List<java.lang.reflect.Type> list;
        this.member = m;
        this.returnType = type;
        this.instanceClass = cls;
        if (cls != null) {
            kotlin.jvm.internal.SpreadBuilder spreadBuilder = new kotlin.jvm.internal.SpreadBuilder(2);
            spreadBuilder.add(cls);
            spreadBuilder.addSpread(typeArr);
            list = kotlin.collections.CollectionsKt.listOf(spreadBuilder.toArray(new java.lang.reflect.Type[spreadBuilder.size()]));
            list = list == null ? kotlin.collections.ArraysKt.toList(typeArr) : list;
        }
        this.parameterTypes = list;
    }

    public /* synthetic */ CallerImpl(java.lang.reflect.Member member, java.lang.reflect.Type type, java.lang.Class cls, java.lang.reflect.Type[] typeArr, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(member, type, cls, typeArr);
    }

    public void checkArguments(java.lang.Object[] args) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(args, "args");
        kotlin.reflect.jvm.internal.calls.Caller.DefaultImpls.checkArguments(this, args);
    }

    @Override // kotlin.reflect.jvm.internal.calls.Caller
    /* JADX INFO: renamed from: getMember */
    public final M mo1260getMember() {
        return this.member;
    }

    @Override // kotlin.reflect.jvm.internal.calls.Caller
    public final java.lang.reflect.Type getReturnType() {
        return this.returnType;
    }

    public final java.lang.Class<?> getInstanceClass() {
        return this.instanceClass;
    }

    @Override // kotlin.reflect.jvm.internal.calls.Caller
    public java.util.List<java.lang.reflect.Type> getParameterTypes() {
        return this.parameterTypes;
    }

    protected final void checkObjectInstance(java.lang.Object obj) {
        if (obj == null || !this.member.getDeclaringClass().isInstance(obj)) {
            throw new java.lang.IllegalArgumentException("An object member requires the object instance passed as the first argument.");
        }
    }

    /* JADX INFO: compiled from: CallerImpl.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0011\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0002\u0010\u0004J\u001b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\bH\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$Constructor;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl;", "Ljava/lang/reflect/Constructor;", "constructor", "(Ljava/lang/reflect/Constructor;)V", androidx.core.app.NotificationCompat.CATEGORY_CALL, "", "args", "", "([Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-reflection"}, k = 1, mv = {1, 1, 15})
    public static final class Constructor extends kotlin.reflect.jvm.internal.calls.CallerImpl<java.lang.reflect.Constructor<?>> {
        /* JADX WARN: Illegal instructions before constructor call */
        public Constructor(java.lang.reflect.Constructor<?> constructor) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(constructor, "constructor");
            java.lang.reflect.Constructor<?> constructor2 = constructor;
            java.lang.Class<?> declaringClass = constructor.getDeclaringClass();
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(declaringClass, "constructor.declaringClass");
            java.lang.Class<?> cls = declaringClass;
            java.lang.Class<?> klass = constructor.getDeclaringClass();
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(klass, "klass");
            java.lang.Class<?> declaringClass2 = klass.getDeclaringClass();
            java.lang.Class<?> cls2 = (declaringClass2 == null || java.lang.reflect.Modifier.isStatic(klass.getModifiers())) ? null : declaringClass2;
            java.lang.reflect.Type[] genericParameterTypes = constructor.getGenericParameterTypes();
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(genericParameterTypes, "constructor.genericParameterTypes");
            super(constructor2, cls, cls2, genericParameterTypes, null);
        }

        @Override // kotlin.reflect.jvm.internal.calls.Caller
        public java.lang.Object call(java.lang.Object[] args) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(args, "args");
            checkArguments(args);
            return mo1260getMember().newInstance(java.util.Arrays.copyOf(args, args.length));
        }
    }

    /* JADX INFO: compiled from: CallerImpl.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\u0018\u00002\u00020\u00012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002B\u001b\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u001b\u0010\b\u001a\u0004\u0018\u00010\u00062\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\nH\u0016¢\u0006\u0002\u0010\u000bR\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$BoundConstructor;", "Lkotlin/reflect/jvm/internal/calls/BoundCaller;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl;", "Ljava/lang/reflect/Constructor;", "constructor", "boundReceiver", "", "(Ljava/lang/reflect/Constructor;Ljava/lang/Object;)V", androidx.core.app.NotificationCompat.CATEGORY_CALL, "args", "", "([Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-reflection"}, k = 1, mv = {1, 1, 15})
    public static final class BoundConstructor extends kotlin.reflect.jvm.internal.calls.CallerImpl<java.lang.reflect.Constructor<?>> implements kotlin.reflect.jvm.internal.calls.BoundCaller {
        private final java.lang.Object boundReceiver;

        /* JADX WARN: Illegal instructions before constructor call */
        public BoundConstructor(java.lang.reflect.Constructor<?> constructor, java.lang.Object obj) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(constructor, "constructor");
            java.lang.Class<?> declaringClass = constructor.getDeclaringClass();
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(declaringClass, "constructor.declaringClass");
            java.lang.reflect.Type[] genericParameterTypes = constructor.getGenericParameterTypes();
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(genericParameterTypes, "constructor.genericParameterTypes");
            super(constructor, declaringClass, null, genericParameterTypes, null);
            this.boundReceiver = obj;
        }

        @Override // kotlin.reflect.jvm.internal.calls.Caller
        public java.lang.Object call(java.lang.Object[] args) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(args, "args");
            checkArguments(args);
            java.lang.reflect.Constructor<?> member = mo1260getMember();
            kotlin.jvm.internal.SpreadBuilder spreadBuilder = new kotlin.jvm.internal.SpreadBuilder(2);
            spreadBuilder.add(this.boundReceiver);
            spreadBuilder.addSpread(args);
            return member.newInstance(spreadBuilder.toArray(new java.lang.Object[spreadBuilder.size()]));
        }
    }

    /* JADX INFO: compiled from: CallerImpl.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0011\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0002\u0010\u0004J\u001b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\bH\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$AccessorForHiddenConstructor;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl;", "Ljava/lang/reflect/Constructor;", "constructor", "(Ljava/lang/reflect/Constructor;)V", androidx.core.app.NotificationCompat.CATEGORY_CALL, "", "args", "", "([Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-reflection"}, k = 1, mv = {1, 1, 15})
    public static final class AccessorForHiddenConstructor extends kotlin.reflect.jvm.internal.calls.CallerImpl<java.lang.reflect.Constructor<?>> {
        /* JADX WARN: Illegal instructions before constructor call */
        public AccessorForHiddenConstructor(java.lang.reflect.Constructor<?> constructor) {
            java.lang.Object objCopyOfRange;
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(constructor, "constructor");
            java.lang.reflect.Constructor<?> constructor2 = constructor;
            java.lang.Class<?> declaringClass = constructor.getDeclaringClass();
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(declaringClass, "constructor.declaringClass");
            java.lang.Class<?> cls = declaringClass;
            kotlin.reflect.jvm.internal.calls.CallerImpl.Companion companion = kotlin.reflect.jvm.internal.calls.CallerImpl.INSTANCE;
            java.lang.reflect.Type[] genericParameterTypes = constructor.getGenericParameterTypes();
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(genericParameterTypes, "constructor.genericParameterTypes");
            if (genericParameterTypes.length <= 1) {
                objCopyOfRange = new java.lang.reflect.Type[0];
            } else {
                objCopyOfRange = kotlin.collections.ArraysKt.copyOfRange(genericParameterTypes, 0, genericParameterTypes.length - 1);
                if (objCopyOfRange == null) {
                    throw new kotlin.TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
                }
            }
            super(constructor2, cls, null, (java.lang.reflect.Type[]) objCopyOfRange, null);
        }

        @Override // kotlin.reflect.jvm.internal.calls.Caller
        public java.lang.Object call(java.lang.Object[] args) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(args, "args");
            checkArguments(args);
            java.lang.reflect.Constructor<?> member = mo1260getMember();
            kotlin.jvm.internal.SpreadBuilder spreadBuilder = new kotlin.jvm.internal.SpreadBuilder(2);
            spreadBuilder.addSpread(args);
            spreadBuilder.add(null);
            return member.newInstance(spreadBuilder.toArray(new java.lang.Object[spreadBuilder.size()]));
        }
    }

    /* JADX INFO: compiled from: CallerImpl.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u00012\u00020\u0003B\u001b\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u001b\u0010\b\u001a\u0004\u0018\u00010\u00062\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\nH\u0016¢\u0006\u0002\u0010\u000bR\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$AccessorForHiddenBoundConstructor;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl;", "Ljava/lang/reflect/Constructor;", "Lkotlin/reflect/jvm/internal/calls/BoundCaller;", "constructor", "boundReceiver", "", "(Ljava/lang/reflect/Constructor;Ljava/lang/Object;)V", androidx.core.app.NotificationCompat.CATEGORY_CALL, "args", "", "([Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-reflection"}, k = 1, mv = {1, 1, 15})
    public static final class AccessorForHiddenBoundConstructor extends kotlin.reflect.jvm.internal.calls.CallerImpl<java.lang.reflect.Constructor<?>> implements kotlin.reflect.jvm.internal.calls.BoundCaller {
        private final java.lang.Object boundReceiver;

        /* JADX WARN: Illegal instructions before constructor call */
        public AccessorForHiddenBoundConstructor(java.lang.reflect.Constructor<?> constructor, java.lang.Object obj) {
            java.lang.Object objCopyOfRange;
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(constructor, "constructor");
            java.lang.reflect.Constructor<?> constructor2 = constructor;
            java.lang.Class<?> declaringClass = constructor.getDeclaringClass();
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(declaringClass, "constructor.declaringClass");
            java.lang.Class<?> cls = declaringClass;
            kotlin.reflect.jvm.internal.calls.CallerImpl.Companion companion = kotlin.reflect.jvm.internal.calls.CallerImpl.INSTANCE;
            java.lang.reflect.Type[] genericParameterTypes = constructor.getGenericParameterTypes();
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(genericParameterTypes, "constructor.genericParameterTypes");
            if (genericParameterTypes.length <= 2) {
                objCopyOfRange = new java.lang.reflect.Type[0];
            } else {
                objCopyOfRange = kotlin.collections.ArraysKt.copyOfRange(genericParameterTypes, 1, genericParameterTypes.length - 1);
                if (objCopyOfRange == null) {
                    throw new kotlin.TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
                }
            }
            super(constructor2, cls, null, (java.lang.reflect.Type[]) objCopyOfRange, null);
            this.boundReceiver = obj;
        }

        @Override // kotlin.reflect.jvm.internal.calls.Caller
        public java.lang.Object call(java.lang.Object[] args) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(args, "args");
            checkArguments(args);
            java.lang.reflect.Constructor<?> member = mo1260getMember();
            kotlin.jvm.internal.SpreadBuilder spreadBuilder = new kotlin.jvm.internal.SpreadBuilder(3);
            spreadBuilder.add(this.boundReceiver);
            spreadBuilder.addSpread(args);
            spreadBuilder.add(null);
            return member.newInstance(spreadBuilder.toArray(new java.lang.Object[spreadBuilder.size()]));
        }
    }

    /* JADX INFO: compiled from: CallerImpl.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0006\u0010\u0011\u0012\u0013\u0014\u0015B)\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tJ%\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\f2\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u0007H\u0004¢\u0006\u0002\u0010\u000fR\u000e\u0010\n\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0001\u0006\u0016\u0017\u0018\u0019\u001a\u001b¨\u0006\u001c"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl;", "Ljava/lang/reflect/Method;", com.google.firebase.analytics.FirebaseAnalytics.Param.METHOD, "requiresInstance", "", "parameterTypes", "", "Ljava/lang/reflect/Type;", "(Ljava/lang/reflect/Method;Z[Ljava/lang/reflect/Type;)V", "isVoidMethod", "callMethod", "", "instance", "args", "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "BoundInstance", "BoundJvmStaticInObject", "BoundStatic", "Instance", "JvmStaticInObject", "Static", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method$Static;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method$Instance;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method$JvmStaticInObject;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method$BoundStatic;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method$BoundInstance;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method$BoundJvmStaticInObject;", "kotlin-reflection"}, k = 1, mv = {1, 1, 15})
    public static abstract class Method extends kotlin.reflect.jvm.internal.calls.CallerImpl<java.lang.reflect.Method> {
        private final boolean isVoidMethod;

        public /* synthetic */ Method(java.lang.reflect.Method method, boolean z, java.lang.reflect.Type[] typeArr, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(method, z, typeArr);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /* synthetic */ Method(java.lang.reflect.Method method, boolean z, java.lang.reflect.Type[] typeArr, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            z = (i & 2) != 0 ? !java.lang.reflect.Modifier.isStatic(method.getModifiers()) : z;
            if ((i & 4) != 0) {
                typeArr = method.getGenericParameterTypes();
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(typeArr, "method.genericParameterTypes");
            }
            this(method, z, typeArr);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        private Method(java.lang.reflect.Method method, boolean z, java.lang.reflect.Type[] typeArr) {
            java.lang.reflect.Method method2 = method;
            java.lang.reflect.Type genericReturnType = method.getGenericReturnType();
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(genericReturnType, "method.genericReturnType");
            super(method2, genericReturnType, z ? method.getDeclaringClass() : null, typeArr, null);
            this.isVoidMethod = kotlin.jvm.internal.Intrinsics.areEqual(getReturnType(), java.lang.Void.TYPE);
        }

        protected final java.lang.Object callMethod(java.lang.Object instance, java.lang.Object[] args) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(args, "args");
            return this.isVoidMethod ? kotlin.Unit.INSTANCE : mo1260getMember().invoke(instance, java.util.Arrays.copyOf(args, args.length));
        }

        /* JADX INFO: compiled from: CallerImpl.kt */
        @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\bH\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method$Static;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method;", com.google.firebase.analytics.FirebaseAnalytics.Param.METHOD, "Ljava/lang/reflect/Method;", "(Ljava/lang/reflect/Method;)V", androidx.core.app.NotificationCompat.CATEGORY_CALL, "", "args", "", "([Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-reflection"}, k = 1, mv = {1, 1, 15})
        public static final class Static extends kotlin.reflect.jvm.internal.calls.CallerImpl.Method {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Static(java.lang.reflect.Method method) {
                super(method, false, null, 6, null);
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(method, "method");
            }

            @Override // kotlin.reflect.jvm.internal.calls.Caller
            public java.lang.Object call(java.lang.Object[] args) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(args, "args");
                checkArguments(args);
                return callMethod(null, args);
            }
        }

        /* JADX INFO: compiled from: CallerImpl.kt */
        @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\bH\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method$Instance;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method;", com.google.firebase.analytics.FirebaseAnalytics.Param.METHOD, "Ljava/lang/reflect/Method;", "(Ljava/lang/reflect/Method;)V", androidx.core.app.NotificationCompat.CATEGORY_CALL, "", "args", "", "([Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-reflection"}, k = 1, mv = {1, 1, 15})
        public static final class Instance extends kotlin.reflect.jvm.internal.calls.CallerImpl.Method {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Instance(java.lang.reflect.Method method) {
                super(method, false, null, 6, null);
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(method, "method");
            }

            @Override // kotlin.reflect.jvm.internal.calls.Caller
            public java.lang.Object call(java.lang.Object[] args) {
                java.lang.Object[] objArrCopyOfRange;
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(args, "args");
                checkArguments(args);
                java.lang.Object obj = args[0];
                kotlin.reflect.jvm.internal.calls.CallerImpl.Companion companion = kotlin.reflect.jvm.internal.calls.CallerImpl.INSTANCE;
                if (args.length <= 1) {
                    objArrCopyOfRange = new java.lang.Object[0];
                } else {
                    objArrCopyOfRange = kotlin.collections.ArraysKt.copyOfRange(args, 1, args.length);
                    if (objArrCopyOfRange == null) {
                        throw new kotlin.TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
                    }
                }
                return callMethod(obj, objArrCopyOfRange);
            }
        }

        /* JADX INFO: compiled from: CallerImpl.kt */
        @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\bH\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method$JvmStaticInObject;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method;", com.google.firebase.analytics.FirebaseAnalytics.Param.METHOD, "Ljava/lang/reflect/Method;", "(Ljava/lang/reflect/Method;)V", androidx.core.app.NotificationCompat.CATEGORY_CALL, "", "args", "", "([Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-reflection"}, k = 1, mv = {1, 1, 15})
        public static final class JvmStaticInObject extends kotlin.reflect.jvm.internal.calls.CallerImpl.Method {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public JvmStaticInObject(java.lang.reflect.Method method) {
                super(method, true, null, 4, null);
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(method, "method");
            }

            @Override // kotlin.reflect.jvm.internal.calls.Caller
            public java.lang.Object call(java.lang.Object[] args) {
                java.lang.Object[] objArrCopyOfRange;
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(args, "args");
                checkArguments(args);
                checkObjectInstance(kotlin.collections.ArraysKt.firstOrNull(args));
                kotlin.reflect.jvm.internal.calls.CallerImpl.Companion companion = kotlin.reflect.jvm.internal.calls.CallerImpl.INSTANCE;
                if (args.length <= 1) {
                    objArrCopyOfRange = new java.lang.Object[0];
                } else {
                    objArrCopyOfRange = kotlin.collections.ArraysKt.copyOfRange(args, 1, args.length);
                    if (objArrCopyOfRange == null) {
                        throw new kotlin.TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
                    }
                }
                return callMethod(null, objArrCopyOfRange);
            }
        }

        /* JADX INFO: compiled from: CallerImpl.kt */
        @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u001b\u0010\b\u001a\u0004\u0018\u00010\u00062\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\nH\u0016¢\u0006\u0002\u0010\u000bR\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method$BoundStatic;", "Lkotlin/reflect/jvm/internal/calls/BoundCaller;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method;", com.google.firebase.analytics.FirebaseAnalytics.Param.METHOD, "Ljava/lang/reflect/Method;", "boundReceiver", "", "(Ljava/lang/reflect/Method;Ljava/lang/Object;)V", androidx.core.app.NotificationCompat.CATEGORY_CALL, "args", "", "([Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-reflection"}, k = 1, mv = {1, 1, 15})
        public static final class BoundStatic extends kotlin.reflect.jvm.internal.calls.CallerImpl.Method implements kotlin.reflect.jvm.internal.calls.BoundCaller {
            private final java.lang.Object boundReceiver;

            /* JADX WARN: Illegal instructions before constructor call */
            public BoundStatic(java.lang.reflect.Method method, java.lang.Object obj) {
                java.lang.Object objCopyOfRange;
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(method, "method");
                kotlin.reflect.jvm.internal.calls.CallerImpl.Companion companion = kotlin.reflect.jvm.internal.calls.CallerImpl.INSTANCE;
                java.lang.reflect.Type[] genericParameterTypes = method.getGenericParameterTypes();
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(genericParameterTypes, "method.genericParameterTypes");
                boolean z = false;
                if (genericParameterTypes.length <= 1) {
                    objCopyOfRange = new java.lang.reflect.Type[0];
                } else {
                    objCopyOfRange = kotlin.collections.ArraysKt.copyOfRange(genericParameterTypes, 1, genericParameterTypes.length);
                    if (objCopyOfRange == null) {
                        throw new kotlin.TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
                    }
                }
                super(method, z, (java.lang.reflect.Type[]) objCopyOfRange, null);
                this.boundReceiver = obj;
            }

            @Override // kotlin.reflect.jvm.internal.calls.Caller
            public java.lang.Object call(java.lang.Object[] args) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(args, "args");
                checkArguments(args);
                kotlin.jvm.internal.SpreadBuilder spreadBuilder = new kotlin.jvm.internal.SpreadBuilder(2);
                spreadBuilder.add(this.boundReceiver);
                spreadBuilder.addSpread(args);
                return callMethod(null, spreadBuilder.toArray(new java.lang.Object[spreadBuilder.size()]));
            }
        }

        /* JADX INFO: compiled from: CallerImpl.kt */
        @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u001b\u0010\b\u001a\u0004\u0018\u00010\u00062\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\nH\u0016¢\u0006\u0002\u0010\u000bR\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method$BoundInstance;", "Lkotlin/reflect/jvm/internal/calls/BoundCaller;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method;", com.google.firebase.analytics.FirebaseAnalytics.Param.METHOD, "Ljava/lang/reflect/Method;", "boundReceiver", "", "(Ljava/lang/reflect/Method;Ljava/lang/Object;)V", androidx.core.app.NotificationCompat.CATEGORY_CALL, "args", "", "([Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-reflection"}, k = 1, mv = {1, 1, 15})
        public static final class BoundInstance extends kotlin.reflect.jvm.internal.calls.CallerImpl.Method implements kotlin.reflect.jvm.internal.calls.BoundCaller {
            private final java.lang.Object boundReceiver;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public BoundInstance(java.lang.reflect.Method method, java.lang.Object obj) {
                super(method, false, null, 4, null);
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(method, "method");
                this.boundReceiver = obj;
            }

            @Override // kotlin.reflect.jvm.internal.calls.Caller
            public java.lang.Object call(java.lang.Object[] args) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(args, "args");
                checkArguments(args);
                return callMethod(this.boundReceiver, args);
            }
        }

        /* JADX INFO: compiled from: CallerImpl.kt */
        @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u001b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\tH\u0016¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method$BoundJvmStaticInObject;", "Lkotlin/reflect/jvm/internal/calls/BoundCaller;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method;", com.google.firebase.analytics.FirebaseAnalytics.Param.METHOD, "Ljava/lang/reflect/Method;", "(Ljava/lang/reflect/Method;)V", androidx.core.app.NotificationCompat.CATEGORY_CALL, "", "args", "", "([Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-reflection"}, k = 1, mv = {1, 1, 15})
        public static final class BoundJvmStaticInObject extends kotlin.reflect.jvm.internal.calls.CallerImpl.Method implements kotlin.reflect.jvm.internal.calls.BoundCaller {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public BoundJvmStaticInObject(java.lang.reflect.Method method) {
                super(method, false, null, 4, null);
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(method, "method");
            }

            @Override // kotlin.reflect.jvm.internal.calls.Caller
            public java.lang.Object call(java.lang.Object[] args) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(args, "args");
                checkArguments(args);
                return callMethod(null, args);
            }
        }
    }

    /* JADX INFO: compiled from: CallerImpl.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0005\f\r\u000e\u000f\u0010B\u0017\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001b\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\nH\u0016¢\u0006\u0002\u0010\u000b\u0082\u0001\u0005\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl;", "Ljava/lang/reflect/Field;", "field", "requiresInstance", "", "(Ljava/lang/reflect/Field;Z)V", androidx.core.app.NotificationCompat.CATEGORY_CALL, "", "args", "", "([Ljava/lang/Object;)Ljava/lang/Object;", "BoundInstance", "BoundJvmStaticInObject", "Instance", "JvmStaticInObject", "Static", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter$Static;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter$Instance;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter$JvmStaticInObject;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter$BoundInstance;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter$BoundJvmStaticInObject;", "kotlin-reflection"}, k = 1, mv = {1, 1, 15})
    public static abstract class FieldGetter extends kotlin.reflect.jvm.internal.calls.CallerImpl<java.lang.reflect.Field> {
        public /* synthetic */ FieldGetter(java.lang.reflect.Field field, boolean z, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(field, z);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        private FieldGetter(java.lang.reflect.Field field, boolean z) {
            java.lang.reflect.Field field2 = field;
            java.lang.reflect.Type genericType = field.getGenericType();
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(genericType, "field.genericType");
            super(field2, genericType, z ? field.getDeclaringClass() : null, new java.lang.reflect.Type[0], null);
        }

        @Override // kotlin.reflect.jvm.internal.calls.Caller
        public java.lang.Object call(java.lang.Object[] args) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(args, "args");
            checkArguments(args);
            return mo1260getMember().get(getInstanceClass() != null ? kotlin.collections.ArraysKt.first(args) : null);
        }

        /* JADX INFO: compiled from: CallerImpl.kt */
        @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter$Static;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter;", "field", "Ljava/lang/reflect/Field;", "(Ljava/lang/reflect/Field;)V", "kotlin-reflection"}, k = 1, mv = {1, 1, 15})
        public static final class Static extends kotlin.reflect.jvm.internal.calls.CallerImpl.FieldGetter {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Static(java.lang.reflect.Field field) {
                super(field, false, null);
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(field, "field");
            }
        }

        /* JADX INFO: compiled from: CallerImpl.kt */
        @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter$Instance;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter;", "field", "Ljava/lang/reflect/Field;", "(Ljava/lang/reflect/Field;)V", "kotlin-reflection"}, k = 1, mv = {1, 1, 15})
        public static final class Instance extends kotlin.reflect.jvm.internal.calls.CallerImpl.FieldGetter {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Instance(java.lang.reflect.Field field) {
                super(field, true, null);
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(field, "field");
            }
        }

        /* JADX INFO: compiled from: CallerImpl.kt */
        @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00062\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\bH\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter$JvmStaticInObject;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter;", "field", "Ljava/lang/reflect/Field;", "(Ljava/lang/reflect/Field;)V", "checkArguments", "", "args", "", "([Ljava/lang/Object;)V", "kotlin-reflection"}, k = 1, mv = {1, 1, 15})
        public static final class JvmStaticInObject extends kotlin.reflect.jvm.internal.calls.CallerImpl.FieldGetter {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public JvmStaticInObject(java.lang.reflect.Field field) {
                super(field, true, null);
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(field, "field");
            }

            @Override // kotlin.reflect.jvm.internal.calls.CallerImpl
            public void checkArguments(java.lang.Object[] args) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(args, "args");
                super.checkArguments(args);
                checkObjectInstance(kotlin.collections.ArraysKt.firstOrNull(args));
            }
        }

        /* JADX INFO: compiled from: CallerImpl.kt */
        @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u001b\u0010\b\u001a\u0004\u0018\u00010\u00062\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\nH\u0016¢\u0006\u0002\u0010\u000bR\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter$BoundInstance;", "Lkotlin/reflect/jvm/internal/calls/BoundCaller;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter;", "field", "Ljava/lang/reflect/Field;", "boundReceiver", "", "(Ljava/lang/reflect/Field;Ljava/lang/Object;)V", androidx.core.app.NotificationCompat.CATEGORY_CALL, "args", "", "([Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-reflection"}, k = 1, mv = {1, 1, 15})
        public static final class BoundInstance extends kotlin.reflect.jvm.internal.calls.CallerImpl.FieldGetter implements kotlin.reflect.jvm.internal.calls.BoundCaller {
            private final java.lang.Object boundReceiver;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public BoundInstance(java.lang.reflect.Field field, java.lang.Object obj) {
                super(field, false, null);
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(field, "field");
                this.boundReceiver = obj;
            }

            @Override // kotlin.reflect.jvm.internal.calls.CallerImpl.FieldGetter, kotlin.reflect.jvm.internal.calls.Caller
            public java.lang.Object call(java.lang.Object[] args) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(args, "args");
                checkArguments(args);
                return mo1260getMember().get(this.boundReceiver);
            }
        }

        /* JADX INFO: compiled from: CallerImpl.kt */
        @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter$BoundJvmStaticInObject;", "Lkotlin/reflect/jvm/internal/calls/BoundCaller;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter;", "field", "Ljava/lang/reflect/Field;", "(Ljava/lang/reflect/Field;)V", "kotlin-reflection"}, k = 1, mv = {1, 1, 15})
        public static final class BoundJvmStaticInObject extends kotlin.reflect.jvm.internal.calls.CallerImpl.FieldGetter implements kotlin.reflect.jvm.internal.calls.BoundCaller {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public BoundJvmStaticInObject(java.lang.reflect.Field field) {
                super(field, false, null);
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(field, "field");
            }
        }
    }

    /* JADX INFO: compiled from: CallerImpl.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0005\u0010\u0011\u0012\u0013\u0014B\u001f\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\u001b\u0010\b\u001a\u0004\u0018\u00010\t2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u000bH\u0016¢\u0006\u0002\u0010\fJ\u0019\u0010\r\u001a\u00020\u000e2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u000bH\u0016¢\u0006\u0002\u0010\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0001\u0005\u0015\u0016\u0017\u0018\u0019¨\u0006\u001a"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl;", "Ljava/lang/reflect/Field;", "field", "notNull", "", "requiresInstance", "(Ljava/lang/reflect/Field;ZZ)V", androidx.core.app.NotificationCompat.CATEGORY_CALL, "", "args", "", "([Ljava/lang/Object;)Ljava/lang/Object;", "checkArguments", "", "([Ljava/lang/Object;)V", "BoundInstance", "BoundJvmStaticInObject", "Instance", "JvmStaticInObject", "Static", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter$Static;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter$Instance;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter$JvmStaticInObject;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter$BoundInstance;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter$BoundJvmStaticInObject;", "kotlin-reflection"}, k = 1, mv = {1, 1, 15})
    public static abstract class FieldSetter extends kotlin.reflect.jvm.internal.calls.CallerImpl<java.lang.reflect.Field> {
        private final boolean notNull;

        public /* synthetic */ FieldSetter(java.lang.reflect.Field field, boolean z, boolean z2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(field, z, z2);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        private FieldSetter(java.lang.reflect.Field field, boolean z, boolean z2) {
            java.lang.reflect.Field field2 = field;
            java.lang.Class cls = java.lang.Void.TYPE;
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(cls, "Void.TYPE");
            java.lang.Class cls2 = cls;
            java.lang.Class<?> declaringClass = z2 ? field.getDeclaringClass() : null;
            java.lang.reflect.Type genericType = field.getGenericType();
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(genericType, "field.genericType");
            super(field2, cls2, declaringClass, new java.lang.reflect.Type[]{genericType}, null);
            this.notNull = z;
        }

        @Override // kotlin.reflect.jvm.internal.calls.CallerImpl
        public void checkArguments(java.lang.Object[] args) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(args, "args");
            super.checkArguments(args);
            if (this.notNull && kotlin.collections.ArraysKt.last(args) == null) {
                throw new java.lang.IllegalArgumentException("null is not allowed as a value for this property.");
            }
        }

        @Override // kotlin.reflect.jvm.internal.calls.Caller
        public java.lang.Object call(java.lang.Object[] args) throws java.lang.IllegalAccessException {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(args, "args");
            checkArguments(args);
            mo1260getMember().set(getInstanceClass() != null ? kotlin.collections.ArraysKt.first(args) : null, kotlin.collections.ArraysKt.last(args));
            return kotlin.Unit.INSTANCE;
        }

        /* JADX INFO: compiled from: CallerImpl.kt */
        @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter$Static;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter;", "field", "Ljava/lang/reflect/Field;", "notNull", "", "(Ljava/lang/reflect/Field;Z)V", "kotlin-reflection"}, k = 1, mv = {1, 1, 15})
        public static final class Static extends kotlin.reflect.jvm.internal.calls.CallerImpl.FieldSetter {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Static(java.lang.reflect.Field field, boolean z) {
                super(field, z, false, null);
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(field, "field");
            }
        }

        /* JADX INFO: compiled from: CallerImpl.kt */
        @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter$Instance;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter;", "field", "Ljava/lang/reflect/Field;", "notNull", "", "(Ljava/lang/reflect/Field;Z)V", "kotlin-reflection"}, k = 1, mv = {1, 1, 15})
        public static final class Instance extends kotlin.reflect.jvm.internal.calls.CallerImpl.FieldSetter {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Instance(java.lang.reflect.Field field, boolean z) {
                super(field, z, true, null);
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(field, "field");
            }
        }

        /* JADX INFO: compiled from: CallerImpl.kt */
        @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\b2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter$JvmStaticInObject;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter;", "field", "Ljava/lang/reflect/Field;", "notNull", "", "(Ljava/lang/reflect/Field;Z)V", "checkArguments", "", "args", "", "([Ljava/lang/Object;)V", "kotlin-reflection"}, k = 1, mv = {1, 1, 15})
        public static final class JvmStaticInObject extends kotlin.reflect.jvm.internal.calls.CallerImpl.FieldSetter {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public JvmStaticInObject(java.lang.reflect.Field field, boolean z) {
                super(field, z, true, null);
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(field, "field");
            }

            @Override // kotlin.reflect.jvm.internal.calls.CallerImpl.FieldSetter, kotlin.reflect.jvm.internal.calls.CallerImpl
            public void checkArguments(java.lang.Object[] args) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(args, "args");
                super.checkArguments(args);
                checkObjectInstance(kotlin.collections.ArraysKt.firstOrNull(args));
            }
        }

        /* JADX INFO: compiled from: CallerImpl.kt */
        @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u001b\u0010\n\u001a\u0004\u0018\u00010\b2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\fH\u0016¢\u0006\u0002\u0010\rR\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter$BoundInstance;", "Lkotlin/reflect/jvm/internal/calls/BoundCaller;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter;", "field", "Ljava/lang/reflect/Field;", "notNull", "", "boundReceiver", "", "(Ljava/lang/reflect/Field;ZLjava/lang/Object;)V", androidx.core.app.NotificationCompat.CATEGORY_CALL, "args", "", "([Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-reflection"}, k = 1, mv = {1, 1, 15})
        public static final class BoundInstance extends kotlin.reflect.jvm.internal.calls.CallerImpl.FieldSetter implements kotlin.reflect.jvm.internal.calls.BoundCaller {
            private final java.lang.Object boundReceiver;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public BoundInstance(java.lang.reflect.Field field, boolean z, java.lang.Object obj) {
                super(field, z, false, null);
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(field, "field");
                this.boundReceiver = obj;
            }

            @Override // kotlin.reflect.jvm.internal.calls.CallerImpl.FieldSetter, kotlin.reflect.jvm.internal.calls.Caller
            public java.lang.Object call(java.lang.Object[] args) throws java.lang.IllegalAccessException {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(args, "args");
                checkArguments(args);
                mo1260getMember().set(this.boundReceiver, kotlin.collections.ArraysKt.first(args));
                return kotlin.Unit.INSTANCE;
            }
        }

        /* JADX INFO: compiled from: CallerImpl.kt */
        @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u001b\u0010\b\u001a\u0004\u0018\u00010\t2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u000bH\u0016¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter$BoundJvmStaticInObject;", "Lkotlin/reflect/jvm/internal/calls/BoundCaller;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter;", "field", "Ljava/lang/reflect/Field;", "notNull", "", "(Ljava/lang/reflect/Field;Z)V", androidx.core.app.NotificationCompat.CATEGORY_CALL, "", "args", "", "([Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-reflection"}, k = 1, mv = {1, 1, 15})
        public static final class BoundJvmStaticInObject extends kotlin.reflect.jvm.internal.calls.CallerImpl.FieldSetter implements kotlin.reflect.jvm.internal.calls.BoundCaller {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public BoundJvmStaticInObject(java.lang.reflect.Field field, boolean z) {
                super(field, z, false, null);
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(field, "field");
            }

            @Override // kotlin.reflect.jvm.internal.calls.CallerImpl.FieldSetter, kotlin.reflect.jvm.internal.calls.Caller
            public java.lang.Object call(java.lang.Object[] args) throws java.lang.IllegalAccessException {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(args, "args");
                checkArguments(args);
                mo1260getMember().set(null, kotlin.collections.ArraysKt.last(args));
                return kotlin.Unit.INSTANCE;
            }
        }
    }

    /* JADX INFO: compiled from: CallerImpl.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0006\b\u0001\u0010\u0005\u0018\u0001*\n\u0012\u0006\b\u0001\u0012\u0002H\u00050\u0004H\u0086\b¢\u0006\u0002\u0010\u0006J(\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0006\b\u0001\u0010\u0005\u0018\u0001*\n\u0012\u0006\b\u0001\u0012\u0002H\u00050\u0004H\u0086\b¢\u0006\u0002\u0010\u0006J(\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0006\b\u0001\u0010\u0005\u0018\u0001*\n\u0012\u0006\b\u0001\u0012\u0002H\u00050\u0004H\u0086\b¢\u0006\u0002\u0010\u0006¨\u0006\t"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$Companion;", "", "()V", "dropFirst", "", "T", "([Ljava/lang/Object;)[Ljava/lang/Object;", "dropFirstAndLast", "dropLast", "kotlin-reflection"}, k = 1, mv = {1, 1, 15})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
