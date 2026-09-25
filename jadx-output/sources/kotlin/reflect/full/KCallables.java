package kotlin.reflect.full;

/* JADX INFO: compiled from: KCallables.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\u001a9\u0010\u000f\u001a\u0002H\u0010\"\u0004\b\u0000\u0010\u0010*\b\u0012\u0004\u0012\u0002H\u00100\u00022\u0016\u0010\u0011\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00130\u0012\"\u0004\u0018\u00010\u0013H\u0087@ø\u0001\u0000¢\u0006\u0002\u0010\u0014\u001a7\u0010\u0015\u001a\u0002H\u0010\"\u0004\b\u0000\u0010\u0010*\b\u0012\u0004\u0012\u0002H\u00100\u00022\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0016H\u0087@ø\u0001\u0000¢\u0006\u0002\u0010\u0017\u001a\u001a\u0010\u0018\u001a\u0004\u0018\u00010\u0001*\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0019\u001a\u00020\u001aH\u0007\"$\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u0006\u0012\u0002\b\u00030\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"$\u0010\u0007\u001a\u0004\u0018\u00010\u0001*\u0006\u0012\u0002\b\u00030\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006\"(\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b*\u0006\u0012\u0002\b\u00030\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b\f\u0010\u0004\u001a\u0004\b\r\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"extensionReceiverParameter", "Lkotlin/reflect/KParameter;", "Lkotlin/reflect/KCallable;", "extensionReceiverParameter$annotations", "(Lkotlin/reflect/KCallable;)V", "getExtensionReceiverParameter", "(Lkotlin/reflect/KCallable;)Lkotlin/reflect/KParameter;", "instanceParameter", "instanceParameter$annotations", "getInstanceParameter", "valueParameters", "", "valueParameters$annotations", "getValueParameters", "(Lkotlin/reflect/KCallable;)Ljava/util/List;", "callSuspend", "R", "args", "", "", "(Lkotlin/reflect/KCallable;[Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "callSuspendBy", "", "(Lkotlin/reflect/KCallable;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "findParameterByName", com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME, "", "kotlin-reflection"}, k = 2, mv = {1, 1, 15})
public final class KCallables {
    public static /* synthetic */ void extensionReceiverParameter$annotations(kotlin.reflect.KCallable kCallable) {
    }

    public static /* synthetic */ void instanceParameter$annotations(kotlin.reflect.KCallable kCallable) {
    }

    public static /* synthetic */ void valueParameters$annotations(kotlin.reflect.KCallable kCallable) {
    }

    public static final kotlin.reflect.KParameter getInstanceParameter(kotlin.reflect.KCallable<?> instanceParameter) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(instanceParameter, "$this$instanceParameter");
        java.lang.Object obj = null;
        java.lang.Object obj2 = null;
        boolean z = false;
        for (java.lang.Object obj3 : instanceParameter.getParameters()) {
            if (((kotlin.reflect.KParameter) obj3).getKind() == kotlin.reflect.KParameter.Kind.INSTANCE) {
                if (z) {
                    return (kotlin.reflect.KParameter) obj;
                }
                obj2 = obj3;
                z = true;
            }
        }
        if (z) {
            obj = obj2;
        }
        return (kotlin.reflect.KParameter) obj;
    }

    public static final kotlin.reflect.KParameter getExtensionReceiverParameter(kotlin.reflect.KCallable<?> extensionReceiverParameter) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(extensionReceiverParameter, "$this$extensionReceiverParameter");
        java.lang.Object obj = null;
        java.lang.Object obj2 = null;
        boolean z = false;
        for (java.lang.Object obj3 : extensionReceiverParameter.getParameters()) {
            if (((kotlin.reflect.KParameter) obj3).getKind() == kotlin.reflect.KParameter.Kind.EXTENSION_RECEIVER) {
                if (z) {
                    return (kotlin.reflect.KParameter) obj;
                }
                obj2 = obj3;
                z = true;
            }
        }
        if (z) {
            obj = obj2;
        }
        return (kotlin.reflect.KParameter) obj;
    }

    public static final java.util.List<kotlin.reflect.KParameter> getValueParameters(kotlin.reflect.KCallable<?> valueParameters) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(valueParameters, "$this$valueParameters");
        java.util.List<kotlin.reflect.KParameter> parameters = valueParameters.getParameters();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : parameters) {
            if (((kotlin.reflect.KParameter) obj).getKind() == kotlin.reflect.KParameter.Kind.VALUE) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final kotlin.reflect.KParameter findParameterByName(kotlin.reflect.KCallable<?> findParameterByName, java.lang.String name) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(findParameterByName, "$this$findParameterByName");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(name, "name");
        java.lang.Object obj = null;
        boolean z = false;
        java.lang.Object obj2 = null;
        for (java.lang.Object obj3 : findParameterByName.getParameters()) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(((kotlin.reflect.KParameter) obj3).getName(), name)) {
                if (z) {
                    return (kotlin.reflect.KParameter) obj;
                }
                z = true;
                obj2 = obj3;
            }
        }
        if (z) {
            obj = obj2;
        }
        return (kotlin.reflect.KParameter) obj;
    }

    public static final <R> java.lang.Object callSuspend(kotlin.reflect.KCallable<? extends R> kCallable, java.lang.Object[] objArr, kotlin.coroutines.Continuation<? super R> continuation) {
        if (!kCallable.isSuspend()) {
            return kCallable.call(java.util.Arrays.copyOf(objArr, objArr.length));
        }
        if (!(kCallable instanceof kotlin.reflect.KFunction)) {
            throw new java.lang.IllegalArgumentException("Cannot callSuspend on a property " + kCallable + ": suspend properties are not supported yet");
        }
        kotlin.jvm.internal.SpreadBuilder spreadBuilder = new kotlin.jvm.internal.SpreadBuilder(2);
        spreadBuilder.addSpread(objArr);
        spreadBuilder.add(continuation);
        R rCall = kCallable.call(spreadBuilder.toArray(new java.lang.Object[spreadBuilder.size()]));
        if (rCall == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return rCall;
    }

    public static final <R> java.lang.Object callSuspendBy(kotlin.reflect.KCallable<? extends R> kCallable, java.util.Map<kotlin.reflect.KParameter, ? extends java.lang.Object> map, kotlin.coroutines.Continuation<? super R> continuation) throws kotlin.reflect.full.IllegalCallableAccessException {
        if (!kCallable.isSuspend()) {
            return kCallable.callBy(map);
        }
        if (!(kCallable instanceof kotlin.reflect.KFunction)) {
            throw new java.lang.IllegalArgumentException("Cannot callSuspendBy on a property " + kCallable + ": suspend properties are not supported yet");
        }
        kotlin.reflect.jvm.internal.KCallableImpl<?> kCallableImplAsKCallableImpl = kotlin.reflect.jvm.internal.UtilKt.asKCallableImpl(kCallable);
        if (kCallableImplAsKCallableImpl == null) {
            throw new kotlin.reflect.jvm.internal.KotlinReflectionInternalError("This callable does not support a default call: " + kCallable);
        }
        java.lang.Object objCallDefaultMethod$kotlin_reflection = kCallableImplAsKCallableImpl.callDefaultMethod$kotlin_reflection(map, continuation);
        if (objCallDefaultMethod$kotlin_reflection == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return objCallDefaultMethod$kotlin_reflection;
    }
}
