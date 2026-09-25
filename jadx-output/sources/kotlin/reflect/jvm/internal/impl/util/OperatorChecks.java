package kotlin.reflect.jvm.internal.impl.util;

/* JADX INFO: compiled from: modifierChecks.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class OperatorChecks extends kotlin.reflect.jvm.internal.impl.util.AbstractModifierChecks {
    public static final kotlin.reflect.jvm.internal.impl.util.OperatorChecks INSTANCE = new kotlin.reflect.jvm.internal.impl.util.OperatorChecks();
    private static final java.util.List<kotlin.reflect.jvm.internal.impl.util.Checks> checks = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new kotlin.reflect.jvm.internal.impl.util.Checks[]{new kotlin.reflect.jvm.internal.impl.util.Checks(kotlin.reflect.jvm.internal.impl.util.OperatorNameConventions.GET, new kotlin.reflect.jvm.internal.impl.util.Check[]{kotlin.reflect.jvm.internal.impl.util.MemberKindCheck.MemberOrExtension.INSTANCE, new kotlin.reflect.jvm.internal.impl.util.ValueParameterCountCheck.AtLeast(1)}, (kotlin.jvm.functions.Function1) null, 4, (kotlin.jvm.internal.DefaultConstructorMarker) null), new kotlin.reflect.jvm.internal.impl.util.Checks(kotlin.reflect.jvm.internal.impl.util.OperatorNameConventions.SET, new kotlin.reflect.jvm.internal.impl.util.Check[]{kotlin.reflect.jvm.internal.impl.util.MemberKindCheck.MemberOrExtension.INSTANCE, new kotlin.reflect.jvm.internal.impl.util.ValueParameterCountCheck.AtLeast(2)}, new kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor, java.lang.String>() { // from class: kotlin.reflect.jvm.internal.impl.util.OperatorChecks$checks$1
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.String invoke(kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor receiver) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver, "$receiver");
            java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> valueParameters = receiver.getValueParameters();
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(valueParameters, "valueParameters");
            kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor valueParameterDescriptor = (kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor) kotlin.collections.CollectionsKt.lastOrNull((java.util.List) valueParameters);
            boolean z = false;
            if (valueParameterDescriptor != null) {
                if (!kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.declaresOrInheritsDefaultValue(valueParameterDescriptor) && valueParameterDescriptor.getVarargElementType() == null) {
                    z = true;
                }
            }
            kotlin.reflect.jvm.internal.impl.util.OperatorChecks operatorChecks = kotlin.reflect.jvm.internal.impl.util.OperatorChecks.INSTANCE;
            if (z) {
                return null;
            }
            return "last parameter should not have a default value or be a vararg";
        }
    }), new kotlin.reflect.jvm.internal.impl.util.Checks(kotlin.reflect.jvm.internal.impl.util.OperatorNameConventions.GET_VALUE, new kotlin.reflect.jvm.internal.impl.util.Check[]{kotlin.reflect.jvm.internal.impl.util.MemberKindCheck.MemberOrExtension.INSTANCE, kotlin.reflect.jvm.internal.impl.util.NoDefaultAndVarargsCheck.INSTANCE, new kotlin.reflect.jvm.internal.impl.util.ValueParameterCountCheck.AtLeast(2), kotlin.reflect.jvm.internal.impl.util.IsKPropertyCheck.INSTANCE}, (kotlin.jvm.functions.Function1) null, 4, (kotlin.jvm.internal.DefaultConstructorMarker) null), new kotlin.reflect.jvm.internal.impl.util.Checks(kotlin.reflect.jvm.internal.impl.util.OperatorNameConventions.SET_VALUE, new kotlin.reflect.jvm.internal.impl.util.Check[]{kotlin.reflect.jvm.internal.impl.util.MemberKindCheck.MemberOrExtension.INSTANCE, kotlin.reflect.jvm.internal.impl.util.NoDefaultAndVarargsCheck.INSTANCE, new kotlin.reflect.jvm.internal.impl.util.ValueParameterCountCheck.AtLeast(3), kotlin.reflect.jvm.internal.impl.util.IsKPropertyCheck.INSTANCE}, (kotlin.jvm.functions.Function1) null, 4, (kotlin.jvm.internal.DefaultConstructorMarker) null), new kotlin.reflect.jvm.internal.impl.util.Checks(kotlin.reflect.jvm.internal.impl.util.OperatorNameConventions.PROVIDE_DELEGATE, new kotlin.reflect.jvm.internal.impl.util.Check[]{kotlin.reflect.jvm.internal.impl.util.MemberKindCheck.MemberOrExtension.INSTANCE, kotlin.reflect.jvm.internal.impl.util.NoDefaultAndVarargsCheck.INSTANCE, new kotlin.reflect.jvm.internal.impl.util.ValueParameterCountCheck.Equals(2), kotlin.reflect.jvm.internal.impl.util.IsKPropertyCheck.INSTANCE}, (kotlin.jvm.functions.Function1) null, 4, (kotlin.jvm.internal.DefaultConstructorMarker) null), new kotlin.reflect.jvm.internal.impl.util.Checks(kotlin.reflect.jvm.internal.impl.util.OperatorNameConventions.INVOKE, new kotlin.reflect.jvm.internal.impl.util.Check[]{kotlin.reflect.jvm.internal.impl.util.MemberKindCheck.MemberOrExtension.INSTANCE}, (kotlin.jvm.functions.Function1) null, 4, (kotlin.jvm.internal.DefaultConstructorMarker) null), new kotlin.reflect.jvm.internal.impl.util.Checks(kotlin.reflect.jvm.internal.impl.util.OperatorNameConventions.CONTAINS, new kotlin.reflect.jvm.internal.impl.util.Check[]{kotlin.reflect.jvm.internal.impl.util.MemberKindCheck.MemberOrExtension.INSTANCE, kotlin.reflect.jvm.internal.impl.util.ValueParameterCountCheck.SingleValueParameter.INSTANCE, kotlin.reflect.jvm.internal.impl.util.NoDefaultAndVarargsCheck.INSTANCE, kotlin.reflect.jvm.internal.impl.util.ReturnsCheck.ReturnsBoolean.INSTANCE}, (kotlin.jvm.functions.Function1) null, 4, (kotlin.jvm.internal.DefaultConstructorMarker) null), new kotlin.reflect.jvm.internal.impl.util.Checks(kotlin.reflect.jvm.internal.impl.util.OperatorNameConventions.ITERATOR, new kotlin.reflect.jvm.internal.impl.util.Check[]{kotlin.reflect.jvm.internal.impl.util.MemberKindCheck.MemberOrExtension.INSTANCE, kotlin.reflect.jvm.internal.impl.util.ValueParameterCountCheck.NoValueParameters.INSTANCE}, (kotlin.jvm.functions.Function1) null, 4, (kotlin.jvm.internal.DefaultConstructorMarker) null), new kotlin.reflect.jvm.internal.impl.util.Checks(kotlin.reflect.jvm.internal.impl.util.OperatorNameConventions.NEXT, new kotlin.reflect.jvm.internal.impl.util.Check[]{kotlin.reflect.jvm.internal.impl.util.MemberKindCheck.MemberOrExtension.INSTANCE, kotlin.reflect.jvm.internal.impl.util.ValueParameterCountCheck.NoValueParameters.INSTANCE}, (kotlin.jvm.functions.Function1) null, 4, (kotlin.jvm.internal.DefaultConstructorMarker) null), new kotlin.reflect.jvm.internal.impl.util.Checks(kotlin.reflect.jvm.internal.impl.util.OperatorNameConventions.HAS_NEXT, new kotlin.reflect.jvm.internal.impl.util.Check[]{kotlin.reflect.jvm.internal.impl.util.MemberKindCheck.MemberOrExtension.INSTANCE, kotlin.reflect.jvm.internal.impl.util.ValueParameterCountCheck.NoValueParameters.INSTANCE, kotlin.reflect.jvm.internal.impl.util.ReturnsCheck.ReturnsBoolean.INSTANCE}, (kotlin.jvm.functions.Function1) null, 4, (kotlin.jvm.internal.DefaultConstructorMarker) null), new kotlin.reflect.jvm.internal.impl.util.Checks(kotlin.reflect.jvm.internal.impl.util.OperatorNameConventions.RANGE_TO, new kotlin.reflect.jvm.internal.impl.util.Check[]{kotlin.reflect.jvm.internal.impl.util.MemberKindCheck.MemberOrExtension.INSTANCE, kotlin.reflect.jvm.internal.impl.util.ValueParameterCountCheck.SingleValueParameter.INSTANCE, kotlin.reflect.jvm.internal.impl.util.NoDefaultAndVarargsCheck.INSTANCE}, (kotlin.jvm.functions.Function1) null, 4, (kotlin.jvm.internal.DefaultConstructorMarker) null), new kotlin.reflect.jvm.internal.impl.util.Checks(kotlin.reflect.jvm.internal.impl.util.OperatorNameConventions.EQUALS, new kotlin.reflect.jvm.internal.impl.util.Check[]{kotlin.reflect.jvm.internal.impl.util.MemberKindCheck.Member.INSTANCE}, new kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor, java.lang.String>() { // from class: kotlin.reflect.jvm.internal.impl.util.OperatorChecks$checks$2

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.util.OperatorChecks$checks$2$1, reason: invalid class name */
        /* JADX INFO: compiled from: modifierChecks.kt */
        static final class AnonymousClass1 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor, java.lang.Boolean> {
            public static final kotlin.reflect.jvm.internal.impl.util.OperatorChecks$checks$2.AnonymousClass1 INSTANCE = new kotlin.reflect.jvm.internal.impl.util.OperatorChecks$checks$2.AnonymousClass1();

            AnonymousClass1() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ java.lang.Boolean invoke(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor) {
                return java.lang.Boolean.valueOf(invoke2(declarationDescriptor));
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final boolean invoke2(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor isAny) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(isAny, "$this$isAny");
                return (isAny instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) && kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isAny((kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) isAny);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public final java.lang.String invoke(kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor receiver) {
            boolean z;
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver, "$receiver");
            kotlin.reflect.jvm.internal.impl.util.OperatorChecks$checks$2.AnonymousClass1 anonymousClass1 = kotlin.reflect.jvm.internal.impl.util.OperatorChecks$checks$2.AnonymousClass1.INSTANCE;
            kotlin.reflect.jvm.internal.impl.util.OperatorChecks operatorChecks = kotlin.reflect.jvm.internal.impl.util.OperatorChecks.INSTANCE;
            kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor containingDeclaration = receiver.getContainingDeclaration();
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(containingDeclaration, "containingDeclaration");
            boolean zInvoke2 = anonymousClass1.invoke2(containingDeclaration);
            boolean z2 = true;
            if (!zInvoke2) {
                java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor> overriddenDescriptors = receiver.getOverriddenDescriptors();
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(overriddenDescriptors, "overriddenDescriptors");
                java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor> collection = overriddenDescriptors;
                if (!(collection instanceof java.util.Collection) || !collection.isEmpty()) {
                    java.util.Iterator<T> it = collection.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z = false;
                            break;
                        }
                        kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor it2 = (kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor) it.next();
                        kotlin.reflect.jvm.internal.impl.util.OperatorChecks$checks$2.AnonymousClass1 anonymousClass2 = kotlin.reflect.jvm.internal.impl.util.OperatorChecks$checks$2.AnonymousClass1.INSTANCE;
                        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(it2, "it");
                        kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor containingDeclaration2 = it2.getContainingDeclaration();
                        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(containingDeclaration2, "it.containingDeclaration");
                        if (anonymousClass2.invoke2(containingDeclaration2)) {
                            z = true;
                            break;
                        }
                    }
                } else {
                    z = false;
                    break;
                }
                if (!z) {
                    z2 = false;
                }
            }
            if (z2) {
                return null;
            }
            return "must override ''equals()'' in Any";
        }
    }), new kotlin.reflect.jvm.internal.impl.util.Checks(kotlin.reflect.jvm.internal.impl.util.OperatorNameConventions.COMPARE_TO, new kotlin.reflect.jvm.internal.impl.util.Check[]{kotlin.reflect.jvm.internal.impl.util.MemberKindCheck.MemberOrExtension.INSTANCE, kotlin.reflect.jvm.internal.impl.util.ReturnsCheck.ReturnsInt.INSTANCE, kotlin.reflect.jvm.internal.impl.util.ValueParameterCountCheck.SingleValueParameter.INSTANCE, kotlin.reflect.jvm.internal.impl.util.NoDefaultAndVarargsCheck.INSTANCE}, (kotlin.jvm.functions.Function1) null, 4, (kotlin.jvm.internal.DefaultConstructorMarker) null), new kotlin.reflect.jvm.internal.impl.util.Checks(kotlin.reflect.jvm.internal.impl.util.OperatorNameConventions.BINARY_OPERATION_NAMES, new kotlin.reflect.jvm.internal.impl.util.Check[]{kotlin.reflect.jvm.internal.impl.util.MemberKindCheck.MemberOrExtension.INSTANCE, kotlin.reflect.jvm.internal.impl.util.ValueParameterCountCheck.SingleValueParameter.INSTANCE, kotlin.reflect.jvm.internal.impl.util.NoDefaultAndVarargsCheck.INSTANCE}, (kotlin.jvm.functions.Function1) null, 4, (kotlin.jvm.internal.DefaultConstructorMarker) null), new kotlin.reflect.jvm.internal.impl.util.Checks(kotlin.reflect.jvm.internal.impl.util.OperatorNameConventions.SIMPLE_UNARY_OPERATION_NAMES, new kotlin.reflect.jvm.internal.impl.util.Check[]{kotlin.reflect.jvm.internal.impl.util.MemberKindCheck.MemberOrExtension.INSTANCE, kotlin.reflect.jvm.internal.impl.util.ValueParameterCountCheck.NoValueParameters.INSTANCE}, (kotlin.jvm.functions.Function1) null, 4, (kotlin.jvm.internal.DefaultConstructorMarker) null), new kotlin.reflect.jvm.internal.impl.util.Checks(kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new kotlin.reflect.jvm.internal.impl.name.Name[]{kotlin.reflect.jvm.internal.impl.util.OperatorNameConventions.INC, kotlin.reflect.jvm.internal.impl.util.OperatorNameConventions.DEC}), new kotlin.reflect.jvm.internal.impl.util.Check[]{kotlin.reflect.jvm.internal.impl.util.MemberKindCheck.MemberOrExtension.INSTANCE}, new kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor, java.lang.String>() { // from class: kotlin.reflect.jvm.internal.impl.util.OperatorChecks$checks$3
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.String invoke(kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor receiver) {
            boolean zIsSubtypeOf;
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver, "$receiver");
            kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor dispatchReceiverParameter = receiver.getDispatchReceiverParameter();
            if (dispatchReceiverParameter == null) {
                dispatchReceiverParameter = receiver.getExtensionReceiverParameter();
            }
            kotlin.reflect.jvm.internal.impl.util.OperatorChecks operatorChecks = kotlin.reflect.jvm.internal.impl.util.OperatorChecks.INSTANCE;
            boolean z = false;
            if (dispatchReceiverParameter != null) {
                kotlin.reflect.jvm.internal.impl.types.KotlinType returnType = receiver.getReturnType();
                if (returnType != null) {
                    kotlin.reflect.jvm.internal.impl.types.KotlinType type = dispatchReceiverParameter.getType();
                    kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(type, "receiver.type");
                    zIsSubtypeOf = kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.isSubtypeOf(returnType, type);
                } else {
                    zIsSubtypeOf = false;
                }
                if (zIsSubtypeOf) {
                    z = true;
                }
            }
            if (z) {
                return null;
            }
            return "receiver must be a supertype of the return type";
        }
    }), new kotlin.reflect.jvm.internal.impl.util.Checks(kotlin.reflect.jvm.internal.impl.util.OperatorNameConventions.ASSIGNMENT_OPERATIONS, new kotlin.reflect.jvm.internal.impl.util.Check[]{kotlin.reflect.jvm.internal.impl.util.MemberKindCheck.MemberOrExtension.INSTANCE, kotlin.reflect.jvm.internal.impl.util.ReturnsCheck.ReturnsUnit.INSTANCE, kotlin.reflect.jvm.internal.impl.util.ValueParameterCountCheck.SingleValueParameter.INSTANCE, kotlin.reflect.jvm.internal.impl.util.NoDefaultAndVarargsCheck.INSTANCE}, (kotlin.jvm.functions.Function1) null, 4, (kotlin.jvm.internal.DefaultConstructorMarker) null), new kotlin.reflect.jvm.internal.impl.util.Checks(kotlin.reflect.jvm.internal.impl.util.OperatorNameConventions.COMPONENT_REGEX, new kotlin.reflect.jvm.internal.impl.util.Check[]{kotlin.reflect.jvm.internal.impl.util.MemberKindCheck.MemberOrExtension.INSTANCE, kotlin.reflect.jvm.internal.impl.util.ValueParameterCountCheck.NoValueParameters.INSTANCE}, (kotlin.jvm.functions.Function1) null, 4, (kotlin.jvm.internal.DefaultConstructorMarker) null)});

    private OperatorChecks() {
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.AbstractModifierChecks
    public java.util.List<kotlin.reflect.jvm.internal.impl.util.Checks> getChecks$descriptors() {
        return checks;
    }
}
