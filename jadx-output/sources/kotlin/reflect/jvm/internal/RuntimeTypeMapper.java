package kotlin.reflect.jvm.internal;

/* JADX INFO: compiled from: RuntimeTypeMapper.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\n\u001a\u00020\u00042\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\u0007J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u0012H\u0002J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016J\u000e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u0006*\u0006\u0012\u0002\b\u00030\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u001a"}, d2 = {"Lkotlin/reflect/jvm/internal/RuntimeTypeMapper;", "", "()V", "JAVA_LANG_VOID", "Lkotlin/reflect/jvm/internal/impl/name/ClassId;", "primitiveType", "Lkotlin/reflect/jvm/internal/impl/builtins/PrimitiveType;", "Ljava/lang/Class;", "getPrimitiveType", "(Ljava/lang/Class;)Lorg/jetbrains/kotlin/builtins/PrimitiveType;", "mapJvmClassToKotlinClassId", "klass", "mapJvmFunctionSignature", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinFunction;", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;", "mapName", "", "Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;", "mapPropertySignature", "Lkotlin/reflect/jvm/internal/JvmPropertySignature;", "possiblyOverriddenProperty", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "mapSignature", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature;", "possiblySubstitutedFunction", "kotlin-reflection"}, k = 1, mv = {1, 1, 15})
public final class RuntimeTypeMapper {
    public static final kotlin.reflect.jvm.internal.RuntimeTypeMapper INSTANCE = new kotlin.reflect.jvm.internal.RuntimeTypeMapper();
    private static final kotlin.reflect.jvm.internal.impl.name.ClassId JAVA_LANG_VOID;

    static {
        kotlin.reflect.jvm.internal.impl.name.ClassId classId = kotlin.reflect.jvm.internal.impl.name.ClassId.topLevel(new kotlin.reflect.jvm.internal.impl.name.FqName("java.lang.Void"));
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(classId, "ClassId.topLevel(FqName(\"java.lang.Void\"))");
        JAVA_LANG_VOID = classId;
    }

    private RuntimeTypeMapper() {
    }

    public final kotlin.reflect.jvm.internal.JvmFunctionSignature mapSignature(kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor possiblySubstitutedFunction) {
        java.lang.reflect.Method member;
        kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature.Method jvmConstructorSignature;
        kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature.Method jvmMethodSignature;
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(possiblySubstitutedFunction, "possiblySubstitutedFunction");
        kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptorUnwrapFakeOverride = kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.unwrapFakeOverride(possiblySubstitutedFunction);
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(callableMemberDescriptorUnwrapFakeOverride, "DescriptorUtils.unwrapFa…siblySubstitutedFunction)");
        kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor original = ((kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor) callableMemberDescriptorUnwrapFakeOverride).getOriginal();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(original, "DescriptorUtils.unwrapFa…titutedFunction).original");
        if (original instanceof kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedCallableMemberDescriptor) {
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedCallableMemberDescriptor deserializedCallableMemberDescriptor = (kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedCallableMemberDescriptor) original;
            kotlin.reflect.jvm.internal.impl.protobuf.MessageLite proto = deserializedCallableMemberDescriptor.getProto();
            if ((proto instanceof kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function) && (jvmMethodSignature = kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil.INSTANCE.getJvmMethodSignature((kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function) proto, deserializedCallableMemberDescriptor.getNameResolver(), deserializedCallableMemberDescriptor.getTypeTable())) != null) {
                return new kotlin.reflect.jvm.internal.JvmFunctionSignature.KotlinFunction(jvmMethodSignature);
            }
            if ((proto instanceof kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor) && (jvmConstructorSignature = kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil.INSTANCE.getJvmConstructorSignature((kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor) proto, deserializedCallableMemberDescriptor.getNameResolver(), deserializedCallableMemberDescriptor.getTypeTable())) != null) {
                kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor containingDeclaration = possiblySubstitutedFunction.getContainingDeclaration();
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(containingDeclaration, "possiblySubstitutedFunction.containingDeclaration");
                if (kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt.isInlineClass(containingDeclaration)) {
                    return new kotlin.reflect.jvm.internal.JvmFunctionSignature.KotlinFunction(jvmConstructorSignature);
                }
                return new kotlin.reflect.jvm.internal.JvmFunctionSignature.KotlinConstructor(jvmConstructorSignature);
            }
            return mapJvmFunctionSignature(original);
        }
        if (original instanceof kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor) {
            kotlin.reflect.jvm.internal.impl.descriptors.SourceElement source = ((kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor) original).getSource();
            if (!(source instanceof kotlin.reflect.jvm.internal.impl.load.java.sources.JavaSourceElement)) {
                source = null;
            }
            kotlin.reflect.jvm.internal.impl.load.java.sources.JavaSourceElement javaSourceElement = (kotlin.reflect.jvm.internal.impl.load.java.sources.JavaSourceElement) source;
            kotlin.reflect.jvm.internal.impl.load.java.structure.JavaElement javaElement = javaSourceElement != null ? javaSourceElement.getJavaElement() : null;
            kotlin.reflect.jvm.internal.structure.ReflectJavaMethod reflectJavaMethod = (kotlin.reflect.jvm.internal.structure.ReflectJavaMethod) (javaElement instanceof kotlin.reflect.jvm.internal.structure.ReflectJavaMethod ? javaElement : null);
            if (reflectJavaMethod == null || (member = reflectJavaMethod.getMember()) == null) {
                throw new kotlin.reflect.jvm.internal.KotlinReflectionInternalError("Incorrect resolution sequence for Java method " + original);
            }
            return new kotlin.reflect.jvm.internal.JvmFunctionSignature.JavaMethod(member);
        }
        if (original instanceof kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaClassConstructorDescriptor) {
            kotlin.reflect.jvm.internal.impl.descriptors.SourceElement source2 = ((kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaClassConstructorDescriptor) original).getSource();
            if (!(source2 instanceof kotlin.reflect.jvm.internal.impl.load.java.sources.JavaSourceElement)) {
                source2 = null;
            }
            kotlin.reflect.jvm.internal.impl.load.java.sources.JavaSourceElement javaSourceElement2 = (kotlin.reflect.jvm.internal.impl.load.java.sources.JavaSourceElement) source2;
            kotlin.reflect.jvm.internal.impl.load.java.structure.JavaElement javaElement2 = javaSourceElement2 != null ? javaSourceElement2.getJavaElement() : null;
            if (javaElement2 instanceof kotlin.reflect.jvm.internal.structure.ReflectJavaConstructor) {
                return new kotlin.reflect.jvm.internal.JvmFunctionSignature.JavaConstructor(((kotlin.reflect.jvm.internal.structure.ReflectJavaConstructor) javaElement2).getMember());
            }
            if (javaElement2 instanceof kotlin.reflect.jvm.internal.structure.ReflectJavaClass) {
                kotlin.reflect.jvm.internal.structure.ReflectJavaClass reflectJavaClass = (kotlin.reflect.jvm.internal.structure.ReflectJavaClass) javaElement2;
                if (reflectJavaClass.isAnnotationType()) {
                    return new kotlin.reflect.jvm.internal.JvmFunctionSignature.FakeJavaAnnotationConstructor(reflectJavaClass.getElement());
                }
            }
            throw new kotlin.reflect.jvm.internal.KotlinReflectionInternalError("Incorrect resolution sequence for Java constructor " + original + " (" + javaElement2 + ')');
        }
        if (kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory.isEnumValueOfMethod(original) || kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory.isEnumValuesMethod(original)) {
            return mapJvmFunctionSignature(original);
        }
        throw new kotlin.reflect.jvm.internal.KotlinReflectionInternalError("Unknown origin of " + original + " (" + original.getClass() + ')');
    }

    public final kotlin.reflect.jvm.internal.JvmPropertySignature mapPropertySignature(kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor possiblyOverriddenProperty) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(possiblyOverriddenProperty, "possiblyOverriddenProperty");
        kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptorUnwrapFakeOverride = kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.unwrapFakeOverride(possiblyOverriddenProperty);
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(callableMemberDescriptorUnwrapFakeOverride, "DescriptorUtils.unwrapFa…ssiblyOverriddenProperty)");
        kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor original = ((kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor) callableMemberDescriptorUnwrapFakeOverride).getOriginal();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(original, "DescriptorUtils.unwrapFa…rriddenProperty).original");
        if (original instanceof kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedPropertyDescriptor) {
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedPropertyDescriptor deserializedPropertyDescriptor = (kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedPropertyDescriptor) original;
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property proto = deserializedPropertyDescriptor.getProto();
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.GeneratedExtension<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property, kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmPropertySignature> generatedExtension = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.propertySignature;
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(generatedExtension, "JvmProtoBuf.propertySignature");
            kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmPropertySignature jvmPropertySignature = (kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmPropertySignature) kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoBufUtilKt.getExtensionOrNull(proto, generatedExtension);
            if (jvmPropertySignature != null) {
                return new kotlin.reflect.jvm.internal.JvmPropertySignature.KotlinProperty(original, proto, jvmPropertySignature, deserializedPropertyDescriptor.getNameResolver(), deserializedPropertyDescriptor.getTypeTable());
            }
        } else if (original instanceof kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaPropertyDescriptor) {
            kotlin.reflect.jvm.internal.impl.descriptors.SourceElement source = ((kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaPropertyDescriptor) original).getSource();
            if (!(source instanceof kotlin.reflect.jvm.internal.impl.load.java.sources.JavaSourceElement)) {
                source = null;
            }
            kotlin.reflect.jvm.internal.impl.load.java.sources.JavaSourceElement javaSourceElement = (kotlin.reflect.jvm.internal.impl.load.java.sources.JavaSourceElement) source;
            kotlin.reflect.jvm.internal.impl.load.java.structure.JavaElement javaElement = javaSourceElement != null ? javaSourceElement.getJavaElement() : null;
            if (javaElement instanceof kotlin.reflect.jvm.internal.structure.ReflectJavaField) {
                return new kotlin.reflect.jvm.internal.JvmPropertySignature.JavaField(((kotlin.reflect.jvm.internal.structure.ReflectJavaField) javaElement).getMember());
            }
            if (javaElement instanceof kotlin.reflect.jvm.internal.structure.ReflectJavaMethod) {
                java.lang.reflect.Method member = ((kotlin.reflect.jvm.internal.structure.ReflectJavaMethod) javaElement).getMember();
                kotlin.reflect.jvm.internal.impl.descriptors.PropertySetterDescriptor setter = original.getSetter();
                kotlin.reflect.jvm.internal.impl.descriptors.SourceElement source2 = setter != null ? setter.getSource() : null;
                if (!(source2 instanceof kotlin.reflect.jvm.internal.impl.load.java.sources.JavaSourceElement)) {
                    source2 = null;
                }
                kotlin.reflect.jvm.internal.impl.load.java.sources.JavaSourceElement javaSourceElement2 = (kotlin.reflect.jvm.internal.impl.load.java.sources.JavaSourceElement) source2;
                kotlin.reflect.jvm.internal.impl.load.java.structure.JavaElement javaElement2 = javaSourceElement2 != null ? javaSourceElement2.getJavaElement() : null;
                if (!(javaElement2 instanceof kotlin.reflect.jvm.internal.structure.ReflectJavaMethod)) {
                    javaElement2 = null;
                }
                kotlin.reflect.jvm.internal.structure.ReflectJavaMethod reflectJavaMethod = (kotlin.reflect.jvm.internal.structure.ReflectJavaMethod) javaElement2;
                return new kotlin.reflect.jvm.internal.JvmPropertySignature.JavaMethodProperty(member, reflectJavaMethod != null ? reflectJavaMethod.getMember() : null);
            }
            throw new kotlin.reflect.jvm.internal.KotlinReflectionInternalError("Incorrect resolution sequence for Java field " + original + " (source = " + javaElement + ')');
        }
        kotlin.reflect.jvm.internal.impl.descriptors.PropertyGetterDescriptor getter = original.getGetter();
        if (getter == null) {
            kotlin.jvm.internal.Intrinsics.throwNpe();
        }
        kotlin.reflect.jvm.internal.RuntimeTypeMapper runtimeTypeMapper = this;
        kotlin.reflect.jvm.internal.JvmFunctionSignature.KotlinFunction kotlinFunctionMapJvmFunctionSignature = runtimeTypeMapper.mapJvmFunctionSignature(getter);
        kotlin.reflect.jvm.internal.impl.descriptors.PropertySetterDescriptor setter2 = original.getSetter();
        return new kotlin.reflect.jvm.internal.JvmPropertySignature.MappedKotlinProperty(kotlinFunctionMapJvmFunctionSignature, setter2 != null ? runtimeTypeMapper.mapJvmFunctionSignature(setter2) : null);
    }

    private final kotlin.reflect.jvm.internal.JvmFunctionSignature.KotlinFunction mapJvmFunctionSignature(kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor descriptor) {
        return new kotlin.reflect.jvm.internal.JvmFunctionSignature.KotlinFunction(new kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature.Method(mapName(descriptor), kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt.computeJvmDescriptor$default(descriptor, false, false, 1, null)));
    }

    private final java.lang.String mapName(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor descriptor) {
        java.lang.String strAsString;
        java.lang.String jvmMethodNameIfSpecial = kotlin.reflect.jvm.internal.impl.load.java.SpecialBuiltinMembers.getJvmMethodNameIfSpecial(descriptor);
        if (jvmMethodNameIfSpecial == null) {
            if (descriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.PropertyGetterDescriptor) {
                strAsString = kotlin.reflect.jvm.internal.impl.load.java.JvmAbi.getterName(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getPropertyIfAccessor(descriptor).getName().asString());
            } else {
                strAsString = descriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.PropertySetterDescriptor ? kotlin.reflect.jvm.internal.impl.load.java.JvmAbi.setterName(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getPropertyIfAccessor(descriptor).getName().asString()) : descriptor.getName().asString();
            }
            jvmMethodNameIfSpecial = strAsString;
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(jvmMethodNameIfSpecial, "when (descriptor) {\n    …name.asString()\n        }");
        }
        return jvmMethodNameIfSpecial;
    }

    public final kotlin.reflect.jvm.internal.impl.name.ClassId mapJvmClassToKotlinClassId(java.lang.Class<?> klass) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(klass, "klass");
        if (klass.isArray()) {
            java.lang.Class<?> componentType = klass.getComponentType();
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(componentType, "klass.componentType");
            kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType primitiveType = getPrimitiveType(componentType);
            if (primitiveType != null) {
                return new kotlin.reflect.jvm.internal.impl.name.ClassId(kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.BUILT_INS_PACKAGE_FQ_NAME, primitiveType.getArrayTypeName());
            }
            kotlin.reflect.jvm.internal.impl.name.ClassId classId = kotlin.reflect.jvm.internal.impl.name.ClassId.topLevel(kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.FQ_NAMES.array.toSafe());
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(classId, "ClassId.topLevel(KotlinB….FQ_NAMES.array.toSafe())");
            return classId;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(klass, java.lang.Void.TYPE)) {
            return JAVA_LANG_VOID;
        }
        kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType primitiveType2 = getPrimitiveType(klass);
        if (primitiveType2 != null) {
            return new kotlin.reflect.jvm.internal.impl.name.ClassId(kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.BUILT_INS_PACKAGE_FQ_NAME, primitiveType2.getTypeName());
        }
        kotlin.reflect.jvm.internal.impl.name.ClassId classId2 = kotlin.reflect.jvm.internal.structure.ReflectClassUtilKt.getClassId(klass);
        if (!classId2.isLocal()) {
            kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap javaToKotlinClassMap = kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap.INSTANCE;
            kotlin.reflect.jvm.internal.impl.name.FqName fqNameAsSingleFqName = classId2.asSingleFqName();
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(fqNameAsSingleFqName, "classId.asSingleFqName()");
            kotlin.reflect.jvm.internal.impl.name.ClassId classIdMapJavaToKotlin = javaToKotlinClassMap.mapJavaToKotlin(fqNameAsSingleFqName);
            if (classIdMapJavaToKotlin != null) {
                return classIdMapJavaToKotlin;
            }
        }
        return classId2;
    }

    private final kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType getPrimitiveType(java.lang.Class<?> cls) {
        if (!cls.isPrimitive()) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType jvmPrimitiveType = kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType.get(cls.getSimpleName());
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(jvmPrimitiveType, "JvmPrimitiveType.get(simpleName)");
        return jvmPrimitiveType.getPrimitiveType();
    }
}
