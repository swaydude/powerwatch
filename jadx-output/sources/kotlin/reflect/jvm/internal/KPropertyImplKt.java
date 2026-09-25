package kotlin.reflect.jvm.internal;

/* JADX INFO: compiled from: KPropertyImpl.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a \u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0006*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00022\u0006\u0010\u0007\u001a\u00020\bH\u0002\u001a\f\u0010\t\u001a\u00020\b*\u00020\nH\u0002\"\"\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u000b"}, d2 = {"boundReceiver", "", "Lkotlin/reflect/jvm/internal/KPropertyImpl$Accessor;", "getBoundReceiver", "(Lkotlin/reflect/jvm/internal/KPropertyImpl$Accessor;)Ljava/lang/Object;", "computeCallerForAccessor", "Lkotlin/reflect/jvm/internal/calls/Caller;", "isGetter", "", "isJvmFieldPropertyInCompanionObject", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "kotlin-reflection"}, k = 2, mv = {1, 1, 15})
public final class KPropertyImplKt {
    public static final java.lang.Object getBoundReceiver(kotlin.reflect.jvm.internal.KPropertyImpl.Accessor<?, ?> boundReceiver) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(boundReceiver, "$this$boundReceiver");
        return boundReceiver.getProperty().getBoundReceiver();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:16:0x005b  */
    public static final kotlin.reflect.jvm.internal.calls.Caller<?> computeCallerForAccessor(final kotlin.reflect.jvm.internal.KPropertyImpl.Accessor<?, ?> accessor, final boolean z) {
        kotlin.reflect.jvm.internal.JvmFunctionSignature.KotlinFunction setterSignature;
        java.lang.reflect.Method setterMethod;
        kotlin.reflect.jvm.internal.calls.Caller boundInstance;
        kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmMethodSignature setter;
        java.lang.reflect.Method unboxMethod;
        if (kotlin.reflect.jvm.internal.KDeclarationContainerImpl.INSTANCE.getLOCAL_PROPERTY_SIGNATURE$kotlin_reflection().matches(accessor.getProperty().getSignature())) {
            return kotlin.reflect.jvm.internal.calls.ThrowingCaller.INSTANCE;
        }
        final kotlin.reflect.jvm.internal.KPropertyImplKt.AnonymousClass1 anonymousClass1 = new kotlin.reflect.jvm.internal.KPropertyImplKt.AnonymousClass1(accessor);
        final kotlin.reflect.jvm.internal.KPropertyImplKt.AnonymousClass2 anonymousClass2 = new kotlin.reflect.jvm.internal.KPropertyImplKt.AnonymousClass2(accessor);
        kotlin.jvm.functions.Function1<java.lang.reflect.Field, kotlin.reflect.jvm.internal.calls.CallerImpl<? extends java.lang.reflect.Field>> function1 = new kotlin.jvm.functions.Function1<java.lang.reflect.Field, kotlin.reflect.jvm.internal.calls.CallerImpl<? extends java.lang.reflect.Field>>() { // from class: kotlin.reflect.jvm.internal.KPropertyImplKt.computeCallerForAccessor.3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final kotlin.reflect.jvm.internal.calls.CallerImpl<java.lang.reflect.Field> invoke(java.lang.reflect.Field field) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(field, "field");
                if (kotlin.reflect.jvm.internal.KPropertyImplKt.isJvmFieldPropertyInCompanionObject(accessor.getProperty().getDescriptor()) || !java.lang.reflect.Modifier.isStatic(field.getModifiers())) {
                    if (z) {
                        return accessor.isBound() ? new kotlin.reflect.jvm.internal.calls.CallerImpl.FieldGetter.BoundInstance(field, kotlin.reflect.jvm.internal.KPropertyImplKt.getBoundReceiver(accessor)) : new kotlin.reflect.jvm.internal.calls.CallerImpl.FieldGetter.Instance(field);
                    }
                    return accessor.isBound() ? new kotlin.reflect.jvm.internal.calls.CallerImpl.FieldSetter.BoundInstance(field, anonymousClass2.invoke2(), kotlin.reflect.jvm.internal.KPropertyImplKt.getBoundReceiver(accessor)) : new kotlin.reflect.jvm.internal.calls.CallerImpl.FieldSetter.Instance(field, anonymousClass2.invoke2());
                }
                if (!anonymousClass1.invoke2()) {
                    return z ? new kotlin.reflect.jvm.internal.calls.CallerImpl.FieldGetter.Static(field) : new kotlin.reflect.jvm.internal.calls.CallerImpl.FieldSetter.Static(field, anonymousClass2.invoke2());
                }
                if (z) {
                    return accessor.isBound() ? new kotlin.reflect.jvm.internal.calls.CallerImpl.FieldGetter.BoundJvmStaticInObject(field) : new kotlin.reflect.jvm.internal.calls.CallerImpl.FieldGetter.JvmStaticInObject(field);
                }
                return accessor.isBound() ? new kotlin.reflect.jvm.internal.calls.CallerImpl.FieldSetter.BoundJvmStaticInObject(field, anonymousClass2.invoke2()) : new kotlin.reflect.jvm.internal.calls.CallerImpl.FieldSetter.JvmStaticInObject(field, anonymousClass2.invoke2());
            }
        };
        kotlin.reflect.jvm.internal.JvmPropertySignature jvmPropertySignatureMapPropertySignature = kotlin.reflect.jvm.internal.RuntimeTypeMapper.INSTANCE.mapPropertySignature(accessor.getProperty().getDescriptor());
        if (jvmPropertySignatureMapPropertySignature instanceof kotlin.reflect.jvm.internal.JvmPropertySignature.KotlinProperty) {
            kotlin.reflect.jvm.internal.JvmPropertySignature.KotlinProperty kotlinProperty = (kotlin.reflect.jvm.internal.JvmPropertySignature.KotlinProperty) jvmPropertySignatureMapPropertySignature;
            kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmPropertySignature signature = kotlinProperty.getSignature();
            if (z) {
                if (signature.hasGetter()) {
                    setter = signature.getGetter();
                } else {
                    setter = null;
                }
            } else if (signature.hasSetter()) {
                setter = signature.getSetter();
            } else {
                setter = null;
            }
            java.lang.reflect.Method methodFindMethodBySignature = setter != null ? accessor.getProperty().getContainer().findMethodBySignature(kotlinProperty.getNameResolver().getString(setter.getName()), kotlinProperty.getNameResolver().getString(setter.getDesc())) : null;
            if (methodFindMethodBySignature == null) {
                if (kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt.isUnderlyingPropertyOfInlineClass(accessor.getProperty().getDescriptor()) && kotlin.jvm.internal.Intrinsics.areEqual(accessor.getProperty().getDescriptor().getVisibility(), kotlin.reflect.jvm.internal.impl.descriptors.Visibilities.INTERNAL)) {
                    java.lang.Class<?> inlineClass = kotlin.reflect.jvm.internal.calls.InlineClassAwareCallerKt.toInlineClass(accessor.getProperty().getDescriptor().getContainingDeclaration());
                    if (inlineClass == null || (unboxMethod = kotlin.reflect.jvm.internal.calls.InlineClassAwareCallerKt.getUnboxMethod(inlineClass, accessor.getProperty().getDescriptor())) == null) {
                        throw new kotlin.reflect.jvm.internal.KotlinReflectionInternalError("Underlying property of inline class " + accessor.getProperty() + " should have a field");
                    }
                    boundInstance = accessor.isBound() ? new kotlin.reflect.jvm.internal.calls.InternalUnderlyingValOfInlineClass.Bound(unboxMethod, getBoundReceiver(accessor)) : new kotlin.reflect.jvm.internal.calls.InternalUnderlyingValOfInlineClass.Unbound(unboxMethod);
                } else {
                    java.lang.reflect.Field javaField = accessor.getProperty().getJavaField();
                    if (javaField == null) {
                        throw new kotlin.reflect.jvm.internal.KotlinReflectionInternalError("No accessors or field is found for property " + accessor.getProperty());
                    }
                    boundInstance = function1.invoke(javaField);
                }
            } else if (!java.lang.reflect.Modifier.isStatic(methodFindMethodBySignature.getModifiers())) {
                boundInstance = accessor.isBound() ? new kotlin.reflect.jvm.internal.calls.CallerImpl.Method.BoundInstance(methodFindMethodBySignature, getBoundReceiver(accessor)) : new kotlin.reflect.jvm.internal.calls.CallerImpl.Method.Instance(methodFindMethodBySignature);
            } else if (anonymousClass1.invoke2()) {
                boundInstance = accessor.isBound() ? new kotlin.reflect.jvm.internal.calls.CallerImpl.Method.BoundJvmStaticInObject(methodFindMethodBySignature) : new kotlin.reflect.jvm.internal.calls.CallerImpl.Method.JvmStaticInObject(methodFindMethodBySignature);
            } else {
                boundInstance = accessor.isBound() ? new kotlin.reflect.jvm.internal.calls.CallerImpl.Method.BoundStatic(methodFindMethodBySignature, getBoundReceiver(accessor)) : new kotlin.reflect.jvm.internal.calls.CallerImpl.Method.Static(methodFindMethodBySignature);
            }
        } else if (jvmPropertySignatureMapPropertySignature instanceof kotlin.reflect.jvm.internal.JvmPropertySignature.JavaField) {
            boundInstance = function1.invoke(((kotlin.reflect.jvm.internal.JvmPropertySignature.JavaField) jvmPropertySignatureMapPropertySignature).getField());
        } else if (jvmPropertySignatureMapPropertySignature instanceof kotlin.reflect.jvm.internal.JvmPropertySignature.JavaMethodProperty) {
            if (z) {
                setterMethod = ((kotlin.reflect.jvm.internal.JvmPropertySignature.JavaMethodProperty) jvmPropertySignatureMapPropertySignature).getGetterMethod();
            } else {
                kotlin.reflect.jvm.internal.JvmPropertySignature.JavaMethodProperty javaMethodProperty = (kotlin.reflect.jvm.internal.JvmPropertySignature.JavaMethodProperty) jvmPropertySignatureMapPropertySignature;
                setterMethod = javaMethodProperty.getSetterMethod();
                if (setterMethod == null) {
                    throw new kotlin.reflect.jvm.internal.KotlinReflectionInternalError("No source found for setter of Java method property: " + javaMethodProperty.getGetterMethod());
                }
            }
            boundInstance = accessor.isBound() ? new kotlin.reflect.jvm.internal.calls.CallerImpl.Method.BoundInstance(setterMethod, getBoundReceiver(accessor)) : new kotlin.reflect.jvm.internal.calls.CallerImpl.Method.Instance(setterMethod);
        } else {
            if (jvmPropertySignatureMapPropertySignature instanceof kotlin.reflect.jvm.internal.JvmPropertySignature.MappedKotlinProperty) {
                if (z) {
                    setterSignature = ((kotlin.reflect.jvm.internal.JvmPropertySignature.MappedKotlinProperty) jvmPropertySignatureMapPropertySignature).getGetterSignature();
                } else {
                    setterSignature = ((kotlin.reflect.jvm.internal.JvmPropertySignature.MappedKotlinProperty) jvmPropertySignatureMapPropertySignature).getSetterSignature();
                    if (setterSignature == null) {
                        throw new kotlin.reflect.jvm.internal.KotlinReflectionInternalError("No setter found for property " + accessor.getProperty());
                    }
                }
                java.lang.reflect.Method methodFindMethodBySignature2 = accessor.getProperty().getContainer().findMethodBySignature(setterSignature.getMethodName(), setterSignature.getMethodDesc());
                if (methodFindMethodBySignature2 == null) {
                    throw new kotlin.reflect.jvm.internal.KotlinReflectionInternalError("No accessor found for property " + accessor.getProperty());
                }
                java.lang.reflect.Modifier.isStatic(methodFindMethodBySignature2.getModifiers());
                return accessor.isBound() ? new kotlin.reflect.jvm.internal.calls.CallerImpl.Method.BoundInstance(methodFindMethodBySignature2, getBoundReceiver(accessor)) : new kotlin.reflect.jvm.internal.calls.CallerImpl.Method.Instance(methodFindMethodBySignature2);
            }
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return kotlin.reflect.jvm.internal.calls.InlineClassAwareCallerKt.createInlineClassAwareCallerIfNeeded$default(boundInstance, accessor.getDescriptor(), false, 2, null);
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.KPropertyImplKt$computeCallerForAccessor$1, reason: invalid class name */
    /* JADX INFO: compiled from: KPropertyImpl.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"isJvmStaticProperty", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class AnonymousClass1 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<java.lang.Boolean> {
        final /* synthetic */ kotlin.reflect.jvm.internal.KPropertyImpl.Accessor $this_computeCallerForAccessor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(kotlin.reflect.jvm.internal.KPropertyImpl.Accessor accessor) {
            super(0);
            this.$this_computeCallerForAccessor = accessor;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ java.lang.Boolean invoke() {
            return java.lang.Boolean.valueOf(invoke2());
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final boolean invoke2() {
            return this.$this_computeCallerForAccessor.getProperty().getDescriptor().getAnnotations().hasAnnotation(kotlin.reflect.jvm.internal.UtilKt.getJVM_STATIC());
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.KPropertyImplKt$computeCallerForAccessor$2, reason: invalid class name */
    /* JADX INFO: compiled from: KPropertyImpl.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"isNotNullProperty", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class AnonymousClass2 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<java.lang.Boolean> {
        final /* synthetic */ kotlin.reflect.jvm.internal.KPropertyImpl.Accessor $this_computeCallerForAccessor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(kotlin.reflect.jvm.internal.KPropertyImpl.Accessor accessor) {
            super(0);
            this.$this_computeCallerForAccessor = accessor;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ java.lang.Boolean invoke() {
            return java.lang.Boolean.valueOf(invoke2());
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final boolean invoke2() {
            return !kotlin.reflect.jvm.internal.impl.types.TypeUtils.isNullableType(this.$this_computeCallerForAccessor.getProperty().getDescriptor().getType());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isJvmFieldPropertyInCompanionObject(kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor propertyDescriptor) {
        kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor containingDeclaration = propertyDescriptor.getContainingDeclaration();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(containingDeclaration, "containingDeclaration");
        if (!kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.isCompanionObject(containingDeclaration)) {
            return false;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor containingDeclaration2 = containingDeclaration.getContainingDeclaration();
        return !(kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.isInterface(containingDeclaration2) || kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.isAnnotationClass(containingDeclaration2)) || ((propertyDescriptor instanceof kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedPropertyDescriptor) && kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil.isMovedFromInterfaceCompanion(((kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedPropertyDescriptor) propertyDescriptor).getProto()));
    }
}
