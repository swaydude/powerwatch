package kotlin.reflect.jvm.internal.impl.load.java;

/* JADX INFO: compiled from: specialBuiltinMembers.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class SpecialBuiltinMembers {
    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.reflect.jvm.internal.impl.name.FqName child(kotlin.reflect.jvm.internal.impl.name.FqName fqName, java.lang.String str) {
        kotlin.reflect.jvm.internal.impl.name.FqName fqNameChild = fqName.child(kotlin.reflect.jvm.internal.impl.name.Name.identifier(str));
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(fqNameChild, "child(Name.identifier(name))");
        return fqNameChild;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.reflect.jvm.internal.impl.name.FqName childSafe(kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe fqNameUnsafe, java.lang.String str) {
        kotlin.reflect.jvm.internal.impl.name.FqName safe = fqNameUnsafe.child(kotlin.reflect.jvm.internal.impl.name.Name.identifier(str)).toSafe();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(safe, "child(Name.identifier(name)).toSafe()");
        return safe;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.reflect.jvm.internal.impl.load.java.NameAndSignature method(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        kotlin.reflect.jvm.internal.impl.name.Name nameIdentifier = kotlin.reflect.jvm.internal.impl.name.Name.identifier(str2);
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(nameIdentifier, "Name.identifier(name)");
        return new kotlin.reflect.jvm.internal.impl.load.java.NameAndSignature(nameIdentifier, kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents.INSTANCE.signature(str, str2 + '(' + str3 + ')' + str4));
    }

    public static final <T extends kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor> T getOverriddenBuiltinWithDifferentJvmName(T getOverriddenBuiltinWithDifferentJvmName) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(getOverriddenBuiltinWithDifferentJvmName, "$this$getOverriddenBuiltinWithDifferentJvmName");
        if (!kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithDifferentJvmName.INSTANCE.getORIGINAL_SHORT_NAMES().contains(getOverriddenBuiltinWithDifferentJvmName.getName()) && !kotlin.reflect.jvm.internal.impl.load.java.BuiltinSpecialProperties.INSTANCE.getSPECIAL_SHORT_NAMES$descriptors_jvm().contains(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getPropertyIfAccessor(getOverriddenBuiltinWithDifferentJvmName).getName())) {
            return null;
        }
        if ((getOverriddenBuiltinWithDifferentJvmName instanceof kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor) || (getOverriddenBuiltinWithDifferentJvmName instanceof kotlin.reflect.jvm.internal.impl.descriptors.PropertyAccessorDescriptor)) {
            return (T) kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.firstOverridden$default(getOverriddenBuiltinWithDifferentJvmName, false, new kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, java.lang.Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.SpecialBuiltinMembers.getOverriddenBuiltinWithDifferentJvmName.1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ java.lang.Boolean invoke(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor) {
                    return java.lang.Boolean.valueOf(invoke2(callableMemberDescriptor));
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final boolean invoke2(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor it) {
                    kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(it, "it");
                    return kotlin.reflect.jvm.internal.impl.load.java.BuiltinSpecialProperties.INSTANCE.hasBuiltinSpecialPropertyFqName(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getPropertyIfAccessor(it));
                }
            }, 1, null);
        }
        if (getOverriddenBuiltinWithDifferentJvmName instanceof kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor) {
            return (T) kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.firstOverridden$default(getOverriddenBuiltinWithDifferentJvmName, false, new kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, java.lang.Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.SpecialBuiltinMembers.getOverriddenBuiltinWithDifferentJvmName.2
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ java.lang.Boolean invoke(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor) {
                    return java.lang.Boolean.valueOf(invoke2(callableMemberDescriptor));
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final boolean invoke2(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor it) {
                    kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(it, "it");
                    return kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithDifferentJvmName.INSTANCE.isBuiltinFunctionWithDifferentNameInJvm((kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor) it);
                }
            }, 1, null);
        }
        return null;
    }

    public static final boolean doesOverrideBuiltinWithDifferentJvmName(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor doesOverrideBuiltinWithDifferentJvmName) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(doesOverrideBuiltinWithDifferentJvmName, "$this$doesOverrideBuiltinWithDifferentJvmName");
        return getOverriddenBuiltinWithDifferentJvmName(doesOverrideBuiltinWithDifferentJvmName) != null;
    }

    public static final <T extends kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor> T getOverriddenSpecialBuiltin(T getOverriddenSpecialBuiltin) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(getOverriddenSpecialBuiltin, "$this$getOverriddenSpecialBuiltin");
        T t = (T) getOverriddenBuiltinWithDifferentJvmName(getOverriddenSpecialBuiltin);
        if (t != null) {
            return t;
        }
        kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature builtinMethodsWithSpecialGenericSignature = kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature.INSTANCE;
        kotlin.reflect.jvm.internal.impl.name.Name name = getOverriddenSpecialBuiltin.getName();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(name, "name");
        if (builtinMethodsWithSpecialGenericSignature.getSameAsBuiltinMethodWithErasedValueParameters(name)) {
            return (T) kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.firstOverridden$default(getOverriddenSpecialBuiltin, false, new kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, java.lang.Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.SpecialBuiltinMembers.getOverriddenSpecialBuiltin.2
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ java.lang.Boolean invoke(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor) {
                    return java.lang.Boolean.valueOf(invoke2(callableMemberDescriptor));
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final boolean invoke2(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor it) {
                    kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(it, "it");
                    return kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isBuiltIn(it) && kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature.getSpecialSignatureInfo(it) != null;
                }
            }, 1, null);
        }
        return null;
    }

    public static final java.lang.String getJvmMethodNameIfSpecial(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor) {
        kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor propertyIfAccessor;
        kotlin.reflect.jvm.internal.impl.name.Name jvmName;
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(callableMemberDescriptor, "callableMemberDescriptor");
        kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor overriddenBuiltinThatAffectsJvmName = getOverriddenBuiltinThatAffectsJvmName(callableMemberDescriptor);
        if (overriddenBuiltinThatAffectsJvmName == null || (propertyIfAccessor = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getPropertyIfAccessor(overriddenBuiltinThatAffectsJvmName)) == null) {
            return null;
        }
        if (propertyIfAccessor instanceof kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor) {
            return kotlin.reflect.jvm.internal.impl.load.java.BuiltinSpecialProperties.INSTANCE.getBuiltinSpecialPropertyGetterName(propertyIfAccessor);
        }
        if (!(propertyIfAccessor instanceof kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor) || (jvmName = kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithDifferentJvmName.INSTANCE.getJvmName((kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor) propertyIfAccessor)) == null) {
            return null;
        }
        return jvmName.asString();
    }

    private static final kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor getOverriddenBuiltinThatAffectsJvmName(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor) {
        if (kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isBuiltIn(callableMemberDescriptor)) {
            return getOverriddenBuiltinWithDifferentJvmName(callableMemberDescriptor);
        }
        return null;
    }

    public static final boolean hasRealKotlinSuperClassWithOverrideOf(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor hasRealKotlinSuperClassWithOverrideOf, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor specialCallableDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(hasRealKotlinSuperClassWithOverrideOf, "$this$hasRealKotlinSuperClassWithOverrideOf");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(specialCallableDescriptor, "specialCallableDescriptor");
        kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor containingDeclaration = specialCallableDescriptor.getContainingDeclaration();
        if (containingDeclaration == null) {
            throw new kotlin.TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        }
        kotlin.reflect.jvm.internal.impl.types.SimpleType defaultType = ((kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) containingDeclaration).getDefaultType();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(defaultType, "(specialCallableDescript…ssDescriptor).defaultType");
        kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor superClassDescriptor = kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.getSuperClassDescriptor(hasRealKotlinSuperClassWithOverrideOf);
        while (true) {
            if (superClassDescriptor == null) {
                return false;
            }
            if (!(superClassDescriptor instanceof kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaClassDescriptor)) {
                if (kotlin.reflect.jvm.internal.impl.types.checker.TypeCheckingProcedure.findCorrespondingSupertype(superClassDescriptor.getDefaultType(), defaultType) != null) {
                    return !kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isBuiltIn(superClassDescriptor);
                }
            }
            superClassDescriptor = kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.getSuperClassDescriptor(superClassDescriptor);
        }
    }

    public static final boolean isFromJava(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor isFromJava) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(isFromJava, "$this$isFromJava");
        return kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getPropertyIfAccessor(isFromJava).getContainingDeclaration() instanceof kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaClassDescriptor;
    }

    public static final boolean isFromJavaOrBuiltins(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor isFromJavaOrBuiltins) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(isFromJavaOrBuiltins, "$this$isFromJavaOrBuiltins");
        return isFromJava(isFromJavaOrBuiltins) || kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isBuiltIn(isFromJavaOrBuiltins);
    }
}
