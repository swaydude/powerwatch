package kotlin.reflect.jvm.internal.calls;

/* JADX INFO: compiled from: AnnotationConstructorCaller.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\u0004\b\u0000\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0002 !B?\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0006¢\u0006\u0002\u0010\u000eJ\u001b\u0010\u001c\u001a\u0004\u0018\u00010\u00102\n\u0010\u001d\u001a\u0006\u0012\u0002\b\u00030\u001eH\u0016¢\u0006\u0002\u0010\u001fR\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\""}, d2 = {"Lkotlin/reflect/jvm/internal/calls/AnnotationConstructorCaller;", "Lkotlin/reflect/jvm/internal/calls/Caller;", "", "jClass", "Ljava/lang/Class;", "parameterNames", "", "", "callMode", "Lkotlin/reflect/jvm/internal/calls/AnnotationConstructorCaller$CallMode;", "origin", "Lkotlin/reflect/jvm/internal/calls/AnnotationConstructorCaller$Origin;", "methods", "Ljava/lang/reflect/Method;", "(Ljava/lang/Class;Ljava/util/List;Lkotlin/reflect/jvm/internal/calls/AnnotationConstructorCaller$CallMode;Lkotlin/reflect/jvm/internal/calls/AnnotationConstructorCaller$Origin;Ljava/util/List;)V", "defaultValues", "", "erasedParameterTypes", "member", "getMember", "()Ljava/lang/Void;", "parameterTypes", "Ljava/lang/reflect/Type;", "getParameterTypes", "()Ljava/util/List;", "returnType", "getReturnType", "()Ljava/lang/reflect/Type;", androidx.core.app.NotificationCompat.CATEGORY_CALL, "args", "", "([Ljava/lang/Object;)Ljava/lang/Object;", "CallMode", "Origin", "kotlin-reflection"}, k = 1, mv = {1, 1, 15})
public final class AnnotationConstructorCaller implements kotlin.reflect.jvm.internal.calls.Caller {
    private final kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller.CallMode callMode;
    private final java.util.List<java.lang.Object> defaultValues;
    private final java.util.List<java.lang.Class<?>> erasedParameterTypes;
    private final java.lang.Class<?> jClass;
    private final java.util.List<java.lang.reflect.Method> methods;
    private final java.util.List<java.lang.String> parameterNames;
    private final java.util.List<java.lang.reflect.Type> parameterTypes;

    /* JADX INFO: compiled from: AnnotationConstructorCaller.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/AnnotationConstructorCaller$CallMode;", "", "(Ljava/lang/String;I)V", "CALL_BY_NAME", "POSITIONAL_CALL", "kotlin-reflection"}, k = 1, mv = {1, 1, 15})
    public enum CallMode {
        CALL_BY_NAME,
        POSITIONAL_CALL
    }

    /* JADX INFO: compiled from: AnnotationConstructorCaller.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/AnnotationConstructorCaller$Origin;", "", "(Ljava/lang/String;I)V", "JAVA", "KOTLIN", "kotlin-reflection"}, k = 1, mv = {1, 1, 15})
    public enum Origin {
        JAVA,
        KOTLIN
    }

    public java.lang.Void getMember() {
        return null;
    }

    public AnnotationConstructorCaller(java.lang.Class<?> jClass, java.util.List<java.lang.String> parameterNames, kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller.CallMode callMode, kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller.Origin origin, java.util.List<java.lang.reflect.Method> methods) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(jClass, "jClass");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(parameterNames, "parameterNames");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(callMode, "callMode");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(origin, "origin");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(methods, "methods");
        this.jClass = jClass;
        this.parameterNames = parameterNames;
        this.callMode = callMode;
        this.methods = methods;
        java.util.List<java.lang.reflect.Method> list = methods;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((java.lang.reflect.Method) it.next()).getGenericReturnType());
        }
        this.parameterTypes = arrayList;
        java.util.List<java.lang.reflect.Method> list2 = this.methods;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
        java.util.Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            java.lang.Class<?> it3 = ((java.lang.reflect.Method) it2.next()).getReturnType();
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(it3, "it");
            java.lang.Class<?> wrapperByPrimitive = kotlin.reflect.jvm.internal.structure.ReflectClassUtilKt.getWrapperByPrimitive(it3);
            if (wrapperByPrimitive != null) {
                it3 = wrapperByPrimitive;
            }
            arrayList2.add(it3);
        }
        this.erasedParameterTypes = arrayList2;
        java.util.List<java.lang.reflect.Method> list3 = this.methods;
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list3, 10));
        java.util.Iterator<T> it4 = list3.iterator();
        while (it4.hasNext()) {
            arrayList3.add(((java.lang.reflect.Method) it4.next()).getDefaultValue());
        }
        this.defaultValues = arrayList3;
        if (this.callMode == kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller.CallMode.POSITIONAL_CALL && origin == kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller.Origin.JAVA && (!kotlin.collections.CollectionsKt.minus(this.parameterNames, "value").isEmpty())) {
            throw new java.lang.UnsupportedOperationException("Positional call of a Java annotation constructor is allowed only if there are no parameters or one parameter named \"value\". This restriction exists because Java annotations (in contrast to Kotlin)do not impose any order on their arguments. Use KCallable#callBy instead.");
        }
    }

    public void checkArguments(java.lang.Object[] args) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(args, "args");
        kotlin.reflect.jvm.internal.calls.Caller.DefaultImpls.checkArguments(this, args);
    }

    @Override // kotlin.reflect.jvm.internal.calls.Caller
    /* JADX INFO: renamed from: getMember, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ java.lang.reflect.Member mo1260getMember() {
        return (java.lang.reflect.Member) getMember();
    }

    public /* synthetic */ AnnotationConstructorCaller(java.lang.Class cls, java.util.List list, kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller.CallMode callMode, kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller.Origin origin, java.util.List list2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 16) != 0) {
            java.util.List list3 = list;
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list3, 10));
            java.util.Iterator it = list3.iterator();
            while (it.hasNext()) {
                arrayList.add(cls.getDeclaredMethod((java.lang.String) it.next(), new java.lang.Class[0]));
            }
            list2 = arrayList;
        }
        this(cls, list, callMode, origin, list2);
    }

    @Override // kotlin.reflect.jvm.internal.calls.Caller
    public java.lang.reflect.Type getReturnType() {
        return this.jClass;
    }

    @Override // kotlin.reflect.jvm.internal.calls.Caller
    public java.util.List<java.lang.reflect.Type> getParameterTypes() {
        return this.parameterTypes;
    }

    @Override // kotlin.reflect.jvm.internal.calls.Caller
    public java.lang.Object call(java.lang.Object[] args) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(args, "args");
        checkArguments(args);
        java.util.ArrayList arrayList = new java.util.ArrayList(args.length);
        int length = args.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            java.lang.Object obj = args[i];
            int i3 = i2 + 1;
            java.lang.Object objTransformKotlinToJvm = (obj == null && this.callMode == kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller.CallMode.CALL_BY_NAME) ? this.defaultValues.get(i2) : kotlin.reflect.jvm.internal.calls.AnnotationConstructorCallerKt.transformKotlinToJvm(obj, this.erasedParameterTypes.get(i2));
            if (objTransformKotlinToJvm == null) {
                kotlin.reflect.jvm.internal.calls.AnnotationConstructorCallerKt.throwIllegalArgumentType(i2, this.parameterNames.get(i2), this.erasedParameterTypes.get(i2));
                throw null;
            }
            arrayList.add(objTransformKotlinToJvm);
            i++;
            i2 = i3;
        }
        return kotlin.reflect.jvm.internal.calls.AnnotationConstructorCallerKt.createAnnotationInstance(this.jClass, kotlin.collections.MapsKt.toMap(kotlin.collections.CollectionsKt.zip(this.parameterNames, arrayList)), this.methods);
    }
}
