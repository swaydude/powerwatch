package kotlin.reflect.jvm.internal.calls;

/* JADX INFO: compiled from: InlineClassAwareCaller.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u0000\u0018\u0000*\f\b\u0000\u0010\u0001 \u0001*\u0004\u0018\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0001\u001cB#\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u001b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\u0010\u0019\u001a\u0006\u0012\u0002\b\u00030\u001aH\u0016¢\u0006\u0002\u0010\u001bR\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001d"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/InlineClassAwareCaller;", "M", "Ljava/lang/reflect/Member;", "Lkotlin/reflect/jvm/internal/calls/Caller;", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;", "caller", "isDefault", "", "(Lorg/jetbrains/kotlin/descriptors/CallableMemberDescriptor;Lkotlin/reflect/jvm/internal/calls/Caller;Z)V", "data", "Lkotlin/reflect/jvm/internal/calls/InlineClassAwareCaller$BoxUnboxData;", "member", "getMember", "()Ljava/lang/reflect/Member;", "parameterTypes", "", "Ljava/lang/reflect/Type;", "getParameterTypes", "()Ljava/util/List;", "returnType", "getReturnType", "()Ljava/lang/reflect/Type;", androidx.core.app.NotificationCompat.CATEGORY_CALL, "", "args", "", "([Ljava/lang/Object;)Ljava/lang/Object;", "BoxUnboxData", "kotlin-reflection"}, k = 1, mv = {1, 1, 15})
public final class InlineClassAwareCaller<M extends java.lang.reflect.Member> implements kotlin.reflect.jvm.internal.calls.Caller<M> {
    private final kotlin.reflect.jvm.internal.calls.Caller<M> caller;
    private final kotlin.reflect.jvm.internal.calls.InlineClassAwareCaller.BoxUnboxData data;
    private final boolean isDefault;

    /* JADX WARN: Code duplicated, block: B:28:0x0077  */
    /* JADX WARN: Multi-variable type inference failed */
    public InlineClassAwareCaller(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor descriptor, kotlin.reflect.jvm.internal.calls.Caller<? extends M> caller, boolean z) {
        kotlin.reflect.jvm.internal.calls.InlineClassAwareCaller.BoxUnboxData boxUnboxData;
        java.lang.Class<?> inlineClass;
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(descriptor, "descriptor");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(caller, "caller");
        this.caller = caller;
        this.isDefault = z;
        kotlin.reflect.jvm.internal.calls.InlineClassAwareCaller<M> inlineClassAwareCaller = this;
        kotlin.reflect.jvm.internal.impl.types.KotlinType returnType = descriptor.getReturnType();
        if (returnType == null) {
            kotlin.jvm.internal.Intrinsics.throwNpe();
        }
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(returnType, "descriptor.returnType!!");
        java.lang.Class<?> inlineClass2 = kotlin.reflect.jvm.internal.calls.InlineClassAwareCallerKt.toInlineClass(returnType);
        java.lang.reflect.Method boxMethod = inlineClass2 != null ? kotlin.reflect.jvm.internal.calls.InlineClassAwareCallerKt.getBoxMethod(inlineClass2, descriptor) : null;
        if (kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt.isGetterOfUnderlyingPropertyOfInlineClass(descriptor)) {
            boxUnboxData = new kotlin.reflect.jvm.internal.calls.InlineClassAwareCaller.BoxUnboxData(kotlin.ranges.IntRange.INSTANCE.getEMPTY(), new java.lang.reflect.Method[0], boxMethod);
        } else {
            kotlin.reflect.jvm.internal.calls.Caller<M> caller2 = inlineClassAwareCaller.caller;
            int i = -1;
            if (!(caller2 instanceof kotlin.reflect.jvm.internal.calls.CallerImpl.Method.BoundStatic)) {
                if (descriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor) {
                    if (!(caller2 instanceof kotlin.reflect.jvm.internal.calls.BoundCaller)) {
                        i = 0;
                    }
                } else if (descriptor.getDispatchReceiverParameter() == null || (inlineClassAwareCaller.caller instanceof kotlin.reflect.jvm.internal.calls.BoundCaller)) {
                    i = 0;
                } else {
                    kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor containingDeclaration = descriptor.getContainingDeclaration();
                    kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(containingDeclaration, "descriptor.containingDeclaration");
                    if (kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt.isInlineClass(containingDeclaration)) {
                        i = 0;
                    } else {
                        i = 1;
                    }
                }
            }
            int i2 = inlineClassAwareCaller.isDefault ? 2 : 0;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor extensionReceiverParameter = descriptor.getExtensionReceiverParameter();
            kotlin.reflect.jvm.internal.impl.types.KotlinType type = extensionReceiverParameter != null ? extensionReceiverParameter.getType() : null;
            if (type != null) {
                arrayList.add(type);
            } else if (descriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor) {
                kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor constructedClass = ((kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor) descriptor).getConstructedClass();
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(constructedClass, "descriptor.constructedClass");
                if (constructedClass.isInner()) {
                    kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor containingDeclaration2 = constructedClass.getContainingDeclaration();
                    if (containingDeclaration2 == null) {
                        throw new kotlin.TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    }
                    arrayList.add(((kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) containingDeclaration2).getDefaultType());
                }
            } else {
                kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor containingDeclaration3 = descriptor.getContainingDeclaration();
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(containingDeclaration3, "descriptor.containingDeclaration");
                if (containingDeclaration3 instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) {
                    kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor = (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) containingDeclaration3;
                    if (classDescriptor.isInline()) {
                        arrayList.add(classDescriptor.getDefaultType());
                    }
                }
            }
            java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> valueParameters = descriptor.getValueParameters();
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(valueParameters, "descriptor.valueParameters");
            java.util.Iterator<T> it = valueParameters.iterator();
            while (it.hasNext()) {
                arrayList.add(((kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor) it.next()).getType());
            }
            java.util.ArrayList arrayList2 = arrayList;
            int size = arrayList2.size() + i + i2;
            kotlin.reflect.jvm.internal.calls.InlineClassAwareCaller<M> inlineClassAwareCaller2 = inlineClassAwareCaller;
            if (kotlin.reflect.jvm.internal.calls.CallerKt.getArity(inlineClassAwareCaller2) != size) {
                throw new kotlin.reflect.jvm.internal.KotlinReflectionInternalError("Inconsistent number of parameters in the descriptor and Java reflection object: " + kotlin.reflect.jvm.internal.calls.CallerKt.getArity(inlineClassAwareCaller2) + " != " + size + "\nCalling: " + descriptor + "\nParameter types: " + inlineClassAwareCaller.getParameterTypes() + ")\nDefault: " + inlineClassAwareCaller.isDefault);
            }
            kotlin.ranges.IntRange intRangeUntil = kotlin.ranges.RangesKt.until(java.lang.Math.max(i, 0), arrayList2.size() + i);
            java.lang.reflect.Method[] methodArr = new java.lang.reflect.Method[size];
            for (int i3 = 0; i3 < size; i3++) {
                methodArr[i3] = (!intRangeUntil.contains(i3) || (inlineClass = kotlin.reflect.jvm.internal.calls.InlineClassAwareCallerKt.toInlineClass((kotlin.reflect.jvm.internal.impl.types.KotlinType) arrayList2.get(i3 - i))) == null) ? null : kotlin.reflect.jvm.internal.calls.InlineClassAwareCallerKt.getUnboxMethod(inlineClass, descriptor);
            }
            boxUnboxData = new kotlin.reflect.jvm.internal.calls.InlineClassAwareCaller.BoxUnboxData(intRangeUntil, methodArr, boxMethod);
        }
        this.data = boxUnboxData;
    }

    @Override // kotlin.reflect.jvm.internal.calls.Caller
    /* JADX INFO: renamed from: getMember */
    public M mo1260getMember() {
        return (M) this.caller.mo1260getMember();
    }

    @Override // kotlin.reflect.jvm.internal.calls.Caller
    public java.lang.reflect.Type getReturnType() {
        return this.caller.getReturnType();
    }

    @Override // kotlin.reflect.jvm.internal.calls.Caller
    public java.util.List<java.lang.reflect.Type> getParameterTypes() {
        return this.caller.getParameterTypes();
    }

    /* JADX INFO: compiled from: InlineClassAwareCaller.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\r\b\u0002\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\bJ\t\u0010\u0010\u001a\u00020\u0003H\u0086\u0002J\u0016\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005H\u0086\u0002¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0006H\u0086\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0013"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/InlineClassAwareCaller$BoxUnboxData;", "", "argumentRange", "Lkotlin/ranges/IntRange;", "unbox", "", "Ljava/lang/reflect/Method;", "box", "(Lkotlin/ranges/IntRange;[Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V", "getArgumentRange", "()Lkotlin/ranges/IntRange;", "getBox", "()Ljava/lang/reflect/Method;", "getUnbox", "()[Ljava/lang/reflect/Method;", "[Ljava/lang/reflect/Method;", "component1", "component2", "component3", "kotlin-reflection"}, k = 1, mv = {1, 1, 15})
    private static final class BoxUnboxData {
        private final kotlin.ranges.IntRange argumentRange;
        private final java.lang.reflect.Method box;
        private final java.lang.reflect.Method[] unbox;

        public BoxUnboxData(kotlin.ranges.IntRange argumentRange, java.lang.reflect.Method[] unbox, java.lang.reflect.Method method) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(argumentRange, "argumentRange");
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(unbox, "unbox");
            this.argumentRange = argumentRange;
            this.unbox = unbox;
            this.box = method;
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final kotlin.ranges.IntRange getArgumentRange() {
            return this.argumentRange;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final java.lang.reflect.Method[] getUnbox() {
            return this.unbox;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final java.lang.reflect.Method getBox() {
            return this.box;
        }
    }

    @Override // kotlin.reflect.jvm.internal.calls.Caller
    public java.lang.Object call(java.lang.Object[] args) throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        java.lang.Object objInvoke;
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(args, "args");
        kotlin.reflect.jvm.internal.calls.InlineClassAwareCaller.BoxUnboxData boxUnboxData = this.data;
        kotlin.ranges.IntRange argumentRange = boxUnboxData.getArgumentRange();
        java.lang.reflect.Method[] unbox = boxUnboxData.getUnbox();
        java.lang.reflect.Method box = boxUnboxData.getBox();
        java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(args, args.length);
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(objArrCopyOf, "java.util.Arrays.copyOf(this, size)");
        if (objArrCopyOf == null) {
            throw new kotlin.TypeCastException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        }
        int first = argumentRange.getFirst();
        int last = argumentRange.getLast();
        if (first <= last) {
            while (true) {
                java.lang.reflect.Method method = unbox[first];
                java.lang.Object objInvoke2 = args[first];
                if (method != null && objInvoke2 != null) {
                    objInvoke2 = method.invoke(objInvoke2, new java.lang.Object[0]);
                }
                objArrCopyOf[first] = objInvoke2;
                if (first == last) {
                    break;
                }
                first++;
            }
        }
        java.lang.Object objCall = this.caller.call(objArrCopyOf);
        return (box == null || (objInvoke = box.invoke(null, objCall)) == null) ? objCall : objInvoke;
    }
}
