package kotlin.reflect.jvm.internal.calls;

/* JADX INFO: compiled from: InlineClassAwareCaller.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u0006*\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u0002H\u0000\u001a6\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\n0\t\"\n\b\u0000\u0010\n*\u0004\u0018\u00010\u000b*\b\u0012\u0004\u0012\u0002H\n0\t2\u0006\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\rH\u0000\u001a\u0018\u0010\u000e\u001a\u00020\u000f*\u0006\u0012\u0002\b\u00030\u00102\u0006\u0010\u0007\u001a\u00020\u0002H\u0000\u001a\u0018\u0010\u0011\u001a\u00020\u000f*\u0006\u0012\u0002\b\u00030\u00102\u0006\u0010\u0007\u001a\u00020\u0002H\u0000\u001a\f\u0010\u0012\u001a\u00020\r*\u00020\u0002H\u0002\u001a\u0014\u0010\u0013\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0010*\u0004\u0018\u00010\u0014H\u0000\u001a\u0012\u0010\u0013\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0010*\u00020\u0001H\u0000\"\u001a\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0015"}, d2 = {"expectedReceiverType", "Lkotlin/reflect/jvm/internal/impl/types/KotlinType;", "Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;", "getExpectedReceiverType", "(Lorg/jetbrains/kotlin/descriptors/CallableMemberDescriptor;)Lorg/jetbrains/kotlin/types/KotlinType;", "coerceToExpectedReceiverType", "", "descriptor", "createInlineClassAwareCallerIfNeeded", "Lkotlin/reflect/jvm/internal/calls/Caller;", "M", "Ljava/lang/reflect/Member;", "isDefault", "", "getBoxMethod", "Ljava/lang/reflect/Method;", "Ljava/lang/Class;", "getUnboxMethod", "hasInlineClassReceiver", "toInlineClass", "Lkotlin/reflect/jvm/internal/impl/descriptors/DeclarationDescriptor;", "kotlin-reflection"}, k = 2, mv = {1, 1, 15})
public final class InlineClassAwareCallerKt {
    public static /* synthetic */ kotlin.reflect.jvm.internal.calls.Caller createInlineClassAwareCallerIfNeeded$default(kotlin.reflect.jvm.internal.calls.Caller caller, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return createInlineClassAwareCallerIfNeeded(caller, callableMemberDescriptor, z);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x006c  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <M extends java.lang.reflect.Member> kotlin.reflect.jvm.internal.calls.Caller<M> createInlineClassAwareCallerIfNeeded(kotlin.reflect.jvm.internal.calls.Caller<? extends M> createInlineClassAwareCallerIfNeeded, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor descriptor, boolean z) {
        boolean z2;
        kotlin.reflect.jvm.internal.impl.types.KotlinType returnType;
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(createInlineClassAwareCallerIfNeeded, "$this$createInlineClassAwareCallerIfNeeded");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(descriptor, "descriptor");
        boolean z3 = false;
        if (kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt.isGetterOfUnderlyingPropertyOfInlineClass(descriptor)) {
            z3 = true;
        } else {
            java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> valueParameters = descriptor.getValueParameters();
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(valueParameters, "descriptor.valueParameters");
            java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> list = valueParameters;
            if (!(list instanceof java.util.Collection) || !list.isEmpty()) {
                java.util.Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z2 = false;
                        break;
                    }
                    kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor it2 = (kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor) it.next();
                    kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(it2, "it");
                    kotlin.reflect.jvm.internal.impl.types.KotlinType type = it2.getType();
                    kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(type, "it.type");
                    if (kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt.isInlineClassType(type)) {
                        z2 = true;
                        break;
                    }
                }
            } else {
                z2 = false;
                break;
            }
            if (z2 || (((returnType = descriptor.getReturnType()) != null && kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt.isInlineClassType(returnType)) || (!(createInlineClassAwareCallerIfNeeded instanceof kotlin.reflect.jvm.internal.calls.BoundCaller) && hasInlineClassReceiver(descriptor)))) {
                z3 = true;
            }
        }
        return z3 ? new kotlin.reflect.jvm.internal.calls.InlineClassAwareCaller(descriptor, createInlineClassAwareCallerIfNeeded, z) : createInlineClassAwareCallerIfNeeded;
    }

    private static final boolean hasInlineClassReceiver(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor) {
        kotlin.reflect.jvm.internal.impl.types.KotlinType expectedReceiverType = getExpectedReceiverType(callableMemberDescriptor);
        return expectedReceiverType != null && kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt.isInlineClassType(expectedReceiverType);
    }

    public static final java.lang.reflect.Method getUnboxMethod(java.lang.Class<?> getUnboxMethod, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor descriptor) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(getUnboxMethod, "$this$getUnboxMethod");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(descriptor, "descriptor");
        try {
            java.lang.reflect.Method declaredMethod = getUnboxMethod.getDeclaredMethod("unbox-impl", new java.lang.Class[0]);
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(declaredMethod, "getDeclaredMethod(\"unbox…FOR_INLINE_CLASS_MEMBERS)");
            return declaredMethod;
        } catch (java.lang.NoSuchMethodException unused) {
            throw new kotlin.reflect.jvm.internal.KotlinReflectionInternalError("No unbox method found in inline class: " + getUnboxMethod + " (calling " + descriptor + ')');
        }
    }

    public static final java.lang.reflect.Method getBoxMethod(java.lang.Class<?> getBoxMethod, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor descriptor) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(getBoxMethod, "$this$getBoxMethod");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(descriptor, "descriptor");
        try {
            java.lang.reflect.Method declaredMethod = getBoxMethod.getDeclaredMethod("box-impl", getUnboxMethod(getBoxMethod, descriptor).getReturnType());
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(declaredMethod, "getDeclaredMethod(\"box\" …d(descriptor).returnType)");
            return declaredMethod;
        } catch (java.lang.NoSuchMethodException unused) {
            throw new kotlin.reflect.jvm.internal.KotlinReflectionInternalError("No box method found in inline class: " + getBoxMethod + " (calling " + descriptor + ')');
        }
    }

    public static final java.lang.Class<?> toInlineClass(kotlin.reflect.jvm.internal.impl.types.KotlinType toInlineClass) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(toInlineClass, "$this$toInlineClass");
        return toInlineClass(toInlineClass.getConstructor().mo1268getDeclarationDescriptor());
    }

    public static final java.lang.Class<?> toInlineClass(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) {
            kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor = (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) declarationDescriptor;
            if (classDescriptor.isInline()) {
                java.lang.Class<?> javaClass = kotlin.reflect.jvm.internal.UtilKt.toJavaClass(classDescriptor);
                if (javaClass != null) {
                    return javaClass;
                }
                throw new kotlin.reflect.jvm.internal.KotlinReflectionInternalError("Class object for the class " + classDescriptor.getName() + " cannot be found (classId=" + kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getClassId((kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor) declarationDescriptor) + ')');
            }
        }
        return null;
    }

    private static final kotlin.reflect.jvm.internal.impl.types.KotlinType getExpectedReceiverType(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor) {
        kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor extensionReceiverParameter = callableMemberDescriptor.getExtensionReceiverParameter();
        kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor dispatchReceiverParameter = callableMemberDescriptor.getDispatchReceiverParameter();
        if (extensionReceiverParameter != null) {
            return extensionReceiverParameter.getType();
        }
        if (dispatchReceiverParameter == null) {
            return null;
        }
        if (callableMemberDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor) {
            return dispatchReceiverParameter.getType();
        }
        kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor containingDeclaration = callableMemberDescriptor.getContainingDeclaration();
        if (!(containingDeclaration instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor)) {
            containingDeclaration = null;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor = (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) containingDeclaration;
        return classDescriptor != null ? classDescriptor.getDefaultType() : null;
    }

    public static final java.lang.Object coerceToExpectedReceiverType(java.lang.Object obj, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor descriptor) {
        kotlin.reflect.jvm.internal.impl.types.KotlinType expectedReceiverType;
        java.lang.Class<?> inlineClass;
        java.lang.reflect.Method unboxMethod;
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(descriptor, "descriptor");
        return (((descriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor) && kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt.isUnderlyingPropertyOfInlineClass((kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor) descriptor)) || (expectedReceiverType = getExpectedReceiverType(descriptor)) == null || (inlineClass = toInlineClass(expectedReceiverType)) == null || (unboxMethod = getUnboxMethod(inlineClass, descriptor)) == null) ? obj : unboxMethod.invoke(obj, new java.lang.Object[0]);
    }
}
