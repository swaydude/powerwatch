package kotlin.reflect.jvm.internal;

/* JADX INFO: compiled from: KCallableImpl.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b \u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0005¢\u0006\u0002\u0010\u0003J%\u00105\u001a\u00028\u00002\u0016\u00106\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010807\"\u0004\u0018\u000108H\u0016¢\u0006\u0002\u00109J#\u0010:\u001a\u00028\u00002\u0014\u00106\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u0001080;H\u0002¢\u0006\u0002\u0010<J#\u0010=\u001a\u00028\u00002\u0014\u00106\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u0001080;H\u0016¢\u0006\u0002\u0010<J3\u0010>\u001a\u00028\u00002\u0014\u00106\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u0001080;2\f\u0010?\u001a\b\u0012\u0002\b\u0003\u0018\u00010@H\u0000¢\u0006\u0004\bA\u0010BJ\u0012\u0010C\u001a\u0004\u0018\u0001082\u0006\u0010D\u001a\u00020EH\u0002J\n\u0010F\u001a\u0004\u0018\u00010EH\u0002R(\u0010\u0004\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \b*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010\t\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u000b \b*\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n0\n0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\f\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\r0\r0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010\u000e\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u000f \b*\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00060\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u0014X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0012\u0010\u0017\u001a\u00020\u0018X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0014X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0016R\u0012\u0010\u001d\u001a\u00020\u001eX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010#R\u0014\u0010$\u001a\u00020\"8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b$\u0010#R\u0012\u0010%\u001a\u00020\"X¦\u0004¢\u0006\u0006\u001a\u0004\b%\u0010#R\u0014\u0010&\u001a\u00020\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010#R\u0014\u0010'\u001a\u00020\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010#R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010\u0012R\u0014\u0010*\u001a\u00020+8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020/0\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u0010\u0012R\u0016\u00101\u001a\u0004\u0018\u0001028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b3\u00104¨\u0006G"}, d2 = {"Lkotlin/reflect/jvm/internal/KCallableImpl;", "R", "Lkotlin/reflect/KCallable;", "()V", "_annotations", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", "", "", "kotlin.jvm.PlatformType", "_parameters", "Ljava/util/ArrayList;", "Lkotlin/reflect/KParameter;", "_returnType", "Lkotlin/reflect/jvm/internal/KTypeImpl;", "_typeParameters", "Lkotlin/reflect/jvm/internal/KTypeParameterImpl;", "annotations", "getAnnotations", "()Ljava/util/List;", "caller", "Lkotlin/reflect/jvm/internal/calls/Caller;", "getCaller", "()Lkotlin/reflect/jvm/internal/calls/Caller;", "container", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "getContainer", "()Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "defaultCaller", "getDefaultCaller", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/CallableMemberDescriptor;", "isAbstract", "", "()Z", "isAnnotationConstructor", "isBound", "isFinal", "isOpen", "parameters", "getParameters", "returnType", "Lkotlin/reflect/KType;", "getReturnType", "()Lkotlin/reflect/KType;", "typeParameters", "Lkotlin/reflect/KTypeParameter;", "getTypeParameters", "visibility", "Lkotlin/reflect/KVisibility;", "getVisibility", "()Lkotlin/reflect/KVisibility;", androidx.core.app.NotificationCompat.CATEGORY_CALL, "args", "", "", "([Ljava/lang/Object;)Ljava/lang/Object;", "callAnnotationConstructor", "", "(Ljava/util/Map;)Ljava/lang/Object;", "callBy", "callDefaultMethod", "continuationArgument", "Lkotlin/coroutines/Continuation;", "callDefaultMethod$kotlin_reflection", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "defaultPrimitiveValue", "type", "Ljava/lang/reflect/Type;", "extractContinuationArgument", "kotlin-reflection"}, k = 1, mv = {1, 1, 15})
public abstract class KCallableImpl<R> implements kotlin.reflect.KCallable<R> {
    private final kotlin.reflect.jvm.internal.ReflectProperties.LazySoftVal<java.util.List<java.lang.annotation.Annotation>> _annotations;
    private final kotlin.reflect.jvm.internal.ReflectProperties.LazySoftVal<java.util.ArrayList<kotlin.reflect.KParameter>> _parameters;
    private final kotlin.reflect.jvm.internal.ReflectProperties.LazySoftVal<kotlin.reflect.jvm.internal.KTypeImpl> _returnType;
    private final kotlin.reflect.jvm.internal.ReflectProperties.LazySoftVal<java.util.List<kotlin.reflect.jvm.internal.KTypeParameterImpl>> _typeParameters;

    public abstract kotlin.reflect.jvm.internal.calls.Caller<?> getCaller();

    public abstract kotlin.reflect.jvm.internal.KDeclarationContainerImpl getContainer();

    public abstract kotlin.reflect.jvm.internal.calls.Caller<?> getDefaultCaller();

    public abstract kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor getDescriptor();

    public abstract boolean isBound();

    public KCallableImpl() {
        kotlin.reflect.jvm.internal.ReflectProperties.LazySoftVal<java.util.List<java.lang.annotation.Annotation>> lazySoftValLazySoft = kotlin.reflect.jvm.internal.ReflectProperties.lazySoft(new kotlin.jvm.functions.Function0<java.util.List<? extends java.lang.annotation.Annotation>>() { // from class: kotlin.reflect.jvm.internal.KCallableImpl$_annotations$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final java.util.List<? extends java.lang.annotation.Annotation> invoke() {
                return kotlin.reflect.jvm.internal.UtilKt.computeAnnotations(this.this$0.getDescriptor());
            }
        });
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(lazySoftValLazySoft, "ReflectProperties.lazySo…or.computeAnnotations() }");
        this._annotations = lazySoftValLazySoft;
        kotlin.reflect.jvm.internal.ReflectProperties.LazySoftVal<java.util.ArrayList<kotlin.reflect.KParameter>> lazySoftValLazySoft2 = kotlin.reflect.jvm.internal.ReflectProperties.lazySoft(new kotlin.jvm.functions.Function0<java.util.ArrayList<kotlin.reflect.KParameter>>() { // from class: kotlin.reflect.jvm.internal.KCallableImpl$_parameters$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final java.util.ArrayList<kotlin.reflect.KParameter> invoke() {
                int i;
                final kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor descriptor = this.this$0.getDescriptor();
                java.util.ArrayList<kotlin.reflect.KParameter> arrayList = new java.util.ArrayList<>();
                final int i2 = 0;
                if (this.this$0.isBound()) {
                    i = 0;
                } else {
                    final kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor instanceReceiverParameter = kotlin.reflect.jvm.internal.UtilKt.getInstanceReceiverParameter(descriptor);
                    if (instanceReceiverParameter != null) {
                        arrayList.add(new kotlin.reflect.jvm.internal.KParameterImpl(this.this$0, 0, kotlin.reflect.KParameter.Kind.INSTANCE, new kotlin.jvm.functions.Function0<kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor>() { // from class: kotlin.reflect.jvm.internal.KCallableImpl$_parameters$1.1
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public final kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor invoke() {
                                return instanceReceiverParameter;
                            }
                        }));
                        i = 1;
                    } else {
                        i = 0;
                    }
                    final kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor extensionReceiverParameter = descriptor.getExtensionReceiverParameter();
                    if (extensionReceiverParameter != null) {
                        arrayList.add(new kotlin.reflect.jvm.internal.KParameterImpl(this.this$0, i, kotlin.reflect.KParameter.Kind.EXTENSION_RECEIVER, new kotlin.jvm.functions.Function0<kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor>() { // from class: kotlin.reflect.jvm.internal.KCallableImpl$_parameters$1.2
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public final kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor invoke() {
                                return extensionReceiverParameter;
                            }
                        }));
                        i++;
                    }
                }
                java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> valueParameters = descriptor.getValueParameters();
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(valueParameters, "descriptor.valueParameters");
                int size = valueParameters.size();
                while (i2 < size) {
                    arrayList.add(new kotlin.reflect.jvm.internal.KParameterImpl(this.this$0, i, kotlin.reflect.KParameter.Kind.VALUE, new kotlin.jvm.functions.Function0<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor>() { // from class: kotlin.reflect.jvm.internal.KCallableImpl$_parameters$1.3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor invoke() {
                            kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor valueParameterDescriptor = descriptor.getValueParameters().get(i2);
                            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(valueParameterDescriptor, "descriptor.valueParameters[i]");
                            return valueParameterDescriptor;
                        }
                    }));
                    i2++;
                    i++;
                }
                if (this.this$0.isAnnotationConstructor() && (descriptor instanceof kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaCallableMemberDescriptor)) {
                    java.util.ArrayList<kotlin.reflect.KParameter> arrayList2 = arrayList;
                    if (arrayList2.size() > 1) {
                        kotlin.collections.CollectionsKt.sortWith(arrayList2, new java.util.Comparator<T>() { // from class: kotlin.reflect.jvm.internal.KCallableImpl$_parameters$1$$special$$inlined$sortBy$1
                            @Override // java.util.Comparator
                            public final int compare(T t, T t2) {
                                return kotlin.comparisons.ComparisonsKt.compareValues(((kotlin.reflect.KParameter) t).getName(), ((kotlin.reflect.KParameter) t2).getName());
                            }
                        });
                    }
                }
                arrayList.trimToSize();
                return arrayList;
            }
        });
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(lazySoftValLazySoft2, "ReflectProperties.lazySo…ze()\n        result\n    }");
        this._parameters = lazySoftValLazySoft2;
        kotlin.reflect.jvm.internal.ReflectProperties.LazySoftVal<kotlin.reflect.jvm.internal.KTypeImpl> lazySoftValLazySoft3 = kotlin.reflect.jvm.internal.ReflectProperties.lazySoft(new kotlin.jvm.functions.Function0<kotlin.reflect.jvm.internal.KTypeImpl>() { // from class: kotlin.reflect.jvm.internal.KCallableImpl$_returnType$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final kotlin.reflect.jvm.internal.KTypeImpl invoke() {
                kotlin.reflect.jvm.internal.impl.types.KotlinType returnType = this.this$0.getDescriptor().getReturnType();
                if (returnType == null) {
                    kotlin.jvm.internal.Intrinsics.throwNpe();
                }
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(returnType, "descriptor.returnType!!");
                return new kotlin.reflect.jvm.internal.KTypeImpl(returnType, new kotlin.jvm.functions.Function0<java.lang.reflect.Type>() { // from class: kotlin.reflect.jvm.internal.KCallableImpl$_returnType$1.1
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.reflect.Type invoke() {
                        java.lang.reflect.Type typeExtractContinuationArgument = kotlin.reflect.jvm.internal.KCallableImpl$_returnType$1.this.this$0.extractContinuationArgument();
                        return typeExtractContinuationArgument != null ? typeExtractContinuationArgument : kotlin.reflect.jvm.internal.KCallableImpl$_returnType$1.this.this$0.getCaller().getReturnType();
                    }
                });
            }
        });
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(lazySoftValLazySoft3, "ReflectProperties.lazySo…eturnType\n        }\n    }");
        this._returnType = lazySoftValLazySoft3;
        kotlin.reflect.jvm.internal.ReflectProperties.LazySoftVal<java.util.List<kotlin.reflect.jvm.internal.KTypeParameterImpl>> lazySoftValLazySoft4 = kotlin.reflect.jvm.internal.ReflectProperties.lazySoft(new kotlin.jvm.functions.Function0<java.util.List<? extends kotlin.reflect.jvm.internal.KTypeParameterImpl>>() { // from class: kotlin.reflect.jvm.internal.KCallableImpl$_typeParameters$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final java.util.List<? extends kotlin.reflect.jvm.internal.KTypeParameterImpl> invoke() {
                java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> typeParameters = this.this$0.getDescriptor().getTypeParameters();
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(typeParameters, "descriptor.typeParameters");
                java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> list = typeParameters;
                java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
                java.util.Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new kotlin.reflect.jvm.internal.KTypeParameterImpl((kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor) it.next()));
                }
                return arrayList;
            }
        });
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(lazySoftValLazySoft4, "ReflectProperties.lazySo…KTypeParameterImpl)\n    }");
        this._typeParameters = lazySoftValLazySoft4;
    }

    @Override // kotlin.reflect.KAnnotatedElement
    public java.util.List<java.lang.annotation.Annotation> getAnnotations() {
        java.util.List<java.lang.annotation.Annotation> listInvoke = this._annotations.invoke();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(listInvoke, "_annotations()");
        return listInvoke;
    }

    @Override // kotlin.reflect.KCallable
    public java.util.List<kotlin.reflect.KParameter> getParameters() {
        java.util.ArrayList<kotlin.reflect.KParameter> arrayListInvoke = this._parameters.invoke();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(arrayListInvoke, "_parameters()");
        return arrayListInvoke;
    }

    @Override // kotlin.reflect.KCallable
    public kotlin.reflect.KType getReturnType() {
        kotlin.reflect.jvm.internal.KTypeImpl kTypeImplInvoke = this._returnType.invoke();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(kTypeImplInvoke, "_returnType()");
        return kTypeImplInvoke;
    }

    @Override // kotlin.reflect.KCallable
    public java.util.List<kotlin.reflect.KTypeParameter> getTypeParameters() {
        java.util.List<kotlin.reflect.jvm.internal.KTypeParameterImpl> listInvoke = this._typeParameters.invoke();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(listInvoke, "_typeParameters()");
        return listInvoke;
    }

    @Override // kotlin.reflect.KCallable
    public kotlin.reflect.KVisibility getVisibility() {
        kotlin.reflect.jvm.internal.impl.descriptors.Visibility visibility = getDescriptor().getVisibility();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(visibility, "descriptor.visibility");
        return kotlin.reflect.jvm.internal.UtilKt.toKVisibility(visibility);
    }

    @Override // kotlin.reflect.KCallable
    public boolean isFinal() {
        return getDescriptor().getModality() == kotlin.reflect.jvm.internal.impl.descriptors.Modality.FINAL;
    }

    @Override // kotlin.reflect.KCallable
    public boolean isOpen() {
        return getDescriptor().getModality() == kotlin.reflect.jvm.internal.impl.descriptors.Modality.OPEN;
    }

    @Override // kotlin.reflect.KCallable
    public boolean isAbstract() {
        return getDescriptor().getModality() == kotlin.reflect.jvm.internal.impl.descriptors.Modality.ABSTRACT;
    }

    protected final boolean isAnnotationConstructor() {
        return kotlin.jvm.internal.Intrinsics.areEqual(getName(), "<init>") && getContainer().getJClass().isAnnotation();
    }

    @Override // kotlin.reflect.KCallable
    public R call(java.lang.Object... args) throws kotlin.reflect.full.IllegalCallableAccessException {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(args, "args");
        try {
            return (R) getCaller().call(args);
        } catch (java.lang.IllegalAccessException e) {
            throw new kotlin.reflect.full.IllegalCallableAccessException(e);
        }
    }

    @Override // kotlin.reflect.KCallable
    public R callBy(java.util.Map<kotlin.reflect.KParameter, ? extends java.lang.Object> args) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(args, "args");
        return isAnnotationConstructor() ? callAnnotationConstructor(args) : callDefaultMethod$kotlin_reflection(args, null);
    }

    public final R callDefaultMethod$kotlin_reflection(java.util.Map<kotlin.reflect.KParameter, ? extends java.lang.Object> args, kotlin.coroutines.Continuation<?> continuationArgument) throws kotlin.reflect.full.IllegalCallableAccessException {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(args, "args");
        java.util.List<kotlin.reflect.KParameter> parameters = getParameters();
        java.util.ArrayList arrayList = new java.util.ArrayList(parameters.size());
        java.util.ArrayList arrayList2 = new java.util.ArrayList(1);
        int i = 0;
        boolean z = false;
        int i2 = 0;
        for (kotlin.reflect.KParameter kParameter : parameters) {
            if (i != 0 && i % 32 == 0) {
                arrayList2.add(java.lang.Integer.valueOf(i2));
                i2 = 0;
            }
            if (args.containsKey(kParameter)) {
                arrayList.add(args.get(kParameter));
            } else if (kParameter.isOptional()) {
                arrayList.add(defaultPrimitiveValue(kotlin.reflect.jvm.ReflectJvmMapping.getJavaType(kParameter.getType())));
                i2 = (1 << (i % 32)) | i2;
                z = true;
            } else {
                throw new java.lang.IllegalArgumentException("No argument provided for a required parameter: " + kParameter);
            }
            if (kParameter.getKind() == kotlin.reflect.KParameter.Kind.VALUE) {
                i++;
            }
        }
        if (continuationArgument != null) {
            arrayList.add(continuationArgument);
        }
        if (z) {
            arrayList2.add(java.lang.Integer.valueOf(i2));
            kotlin.reflect.jvm.internal.calls.Caller<?> defaultCaller = getDefaultCaller();
            if (defaultCaller == null) {
                throw new kotlin.reflect.jvm.internal.KotlinReflectionInternalError("This callable does not support a default call: " + getDescriptor());
            }
            arrayList.addAll(arrayList2);
            arrayList.add(null);
            try {
                java.lang.Object[] array = arrayList.toArray(new java.lang.Object[0]);
                if (array != null) {
                    return (R) defaultCaller.call(array);
                }
                throw new kotlin.TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
            } catch (java.lang.IllegalAccessException e) {
                throw new kotlin.reflect.full.IllegalCallableAccessException(e);
            }
        }
        java.lang.Object[] array2 = arrayList.toArray(new java.lang.Object[0]);
        if (array2 != null) {
            return call(java.util.Arrays.copyOf(array2, array2.length));
        }
        throw new kotlin.TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    private final R callAnnotationConstructor(java.util.Map<kotlin.reflect.KParameter, ? extends java.lang.Object> args) throws kotlin.reflect.full.IllegalCallableAccessException {
        java.lang.Object obj;
        java.util.List<kotlin.reflect.KParameter> parameters = getParameters();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(parameters, 10));
        for (kotlin.reflect.KParameter kParameter : parameters) {
            if (args.containsKey(kParameter)) {
                obj = args.get(kParameter);
                if (obj == null) {
                    throw new java.lang.IllegalArgumentException("Annotation argument value cannot be null (" + kParameter + ')');
                }
            } else {
                if (!kParameter.isOptional()) {
                    throw new java.lang.IllegalArgumentException("No argument provided for a required parameter: " + kParameter);
                }
                obj = null;
            }
            arrayList.add(obj);
        }
        java.util.ArrayList arrayList2 = arrayList;
        kotlin.reflect.jvm.internal.calls.Caller<?> defaultCaller = getDefaultCaller();
        if (defaultCaller == null) {
            throw new kotlin.reflect.jvm.internal.KotlinReflectionInternalError("This callable does not support a default call: " + getDescriptor());
        }
        try {
            java.lang.Object[] array = arrayList2.toArray(new java.lang.Object[0]);
            if (array != null) {
                return (R) defaultCaller.call(array);
            }
            throw new kotlin.TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
        } catch (java.lang.IllegalAccessException e) {
            throw new kotlin.reflect.full.IllegalCallableAccessException(e);
        }
    }

    private final java.lang.Object defaultPrimitiveValue(java.lang.reflect.Type type) {
        if (!(type instanceof java.lang.Class) || !((java.lang.Class) type).isPrimitive()) {
            return null;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(type, java.lang.Boolean.TYPE)) {
            return false;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(type, java.lang.Character.TYPE)) {
            return java.lang.Character.valueOf((char) 0);
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(type, java.lang.Byte.TYPE)) {
            return java.lang.Byte.valueOf((byte) 0);
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(type, java.lang.Short.TYPE)) {
            return java.lang.Short.valueOf((short) 0);
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(type, java.lang.Integer.TYPE)) {
            return 0;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(type, java.lang.Float.TYPE)) {
            return java.lang.Float.valueOf(0.0f);
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(type, java.lang.Long.TYPE)) {
            return 0L;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(type, java.lang.Double.TYPE)) {
            return java.lang.Double.valueOf(0.0d);
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(type, java.lang.Void.TYPE)) {
            throw new java.lang.IllegalStateException("Parameter with void type is illegal");
        }
        throw new java.lang.UnsupportedOperationException("Unknown primitive: " + type);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.reflect.Type extractContinuationArgument() {
        java.lang.reflect.Type[] lowerBounds;
        kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor descriptor = getDescriptor();
        if (!(descriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor)) {
            descriptor = null;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor functionDescriptor = (kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor) descriptor;
        if (functionDescriptor == null || !functionDescriptor.isSuspend()) {
            return null;
        }
        java.lang.Object objLastOrNull = kotlin.collections.CollectionsKt.lastOrNull((java.util.List<? extends java.lang.Object>) getCaller().getParameterTypes());
        if (!(objLastOrNull instanceof java.lang.reflect.ParameterizedType)) {
            objLastOrNull = null;
        }
        java.lang.reflect.ParameterizedType parameterizedType = (java.lang.reflect.ParameterizedType) objLastOrNull;
        if (!kotlin.jvm.internal.Intrinsics.areEqual(parameterizedType != null ? parameterizedType.getRawType() : null, kotlin.coroutines.Continuation.class)) {
            return null;
        }
        java.lang.reflect.Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(actualTypeArguments, "continuationType.actualTypeArguments");
        java.lang.Object objSingle = kotlin.collections.ArraysKt.single(actualTypeArguments);
        if (!(objSingle instanceof java.lang.reflect.WildcardType)) {
            objSingle = null;
        }
        java.lang.reflect.WildcardType wildcardType = (java.lang.reflect.WildcardType) objSingle;
        if (wildcardType == null || (lowerBounds = wildcardType.getLowerBounds()) == null) {
            return null;
        }
        return (java.lang.reflect.Type) kotlin.collections.ArraysKt.first(lowerBounds);
    }
}
