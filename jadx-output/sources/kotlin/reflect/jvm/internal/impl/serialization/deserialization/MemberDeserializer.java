package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

/* JADX INFO: compiled from: MemberDeserializer.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class MemberDeserializer {
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationDeserializer annotationDeserializer;
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext c;

    private final int loadOldFlags(int i) {
        return (i & 63) + ((i >> 8) << 6);
    }

    public MemberDeserializer(kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext c) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(c, "c");
        this.c = c;
        this.annotationDeserializer = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationDeserializer(c.getComponents().getModuleDescriptor(), c.getComponents().getNotFoundClasses());
    }

    public final kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor loadProperty(final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property proto) {
        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property property;
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations empty;
        kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyGetterDescriptorImpl propertyGetterDescriptorImpl;
        boolean z;
        kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyGetterDescriptorImpl propertyGetterDescriptorImplCreateDefaultGetter;
        kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinTypeType;
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(proto, "proto");
        int flags = proto.hasFlags() ? proto.getFlags() : loadOldFlags(proto.getOldFlags());
        kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor containingDeclaration = this.c.getContainingDeclaration();
        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property property2 = proto;
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations = getAnnotations(property2, flags, kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind.PROPERTY);
        kotlin.reflect.jvm.internal.impl.descriptors.Modality modality = kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoEnumFlags.INSTANCE.modality(kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.MODALITY.get(flags));
        kotlin.reflect.jvm.internal.impl.descriptors.Visibility visibility = kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoEnumFlags.INSTANCE.visibility(kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.VISIBILITY.get(flags));
        java.lang.Boolean bool = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.IS_VAR.get(flags);
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(bool, "Flags.IS_VAR.get(flags)");
        boolean zBooleanValue = bool.booleanValue();
        kotlin.reflect.jvm.internal.impl.name.Name name = kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt.getName(this.c.getNameResolver(), proto.getName());
        kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind kindMemberKind = kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoEnumFlags.INSTANCE.memberKind(kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.MEMBER_KIND.get(flags));
        java.lang.Boolean bool2 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.IS_LATEINIT.get(flags);
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(bool2, "Flags.IS_LATEINIT.get(flags)");
        boolean zBooleanValue2 = bool2.booleanValue();
        java.lang.Boolean bool3 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.IS_CONST.get(flags);
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(bool3, "Flags.IS_CONST.get(flags)");
        boolean zBooleanValue3 = bool3.booleanValue();
        java.lang.Boolean bool4 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.IS_EXTERNAL_PROPERTY.get(flags);
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(bool4, "Flags.IS_EXTERNAL_PROPERTY.get(flags)");
        boolean zBooleanValue4 = bool4.booleanValue();
        java.lang.Boolean bool5 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.IS_DELEGATED.get(flags);
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(bool5, "Flags.IS_DELEGATED.get(flags)");
        boolean zBooleanValue5 = bool5.booleanValue();
        java.lang.Boolean bool6 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.IS_EXPECT_PROPERTY.get(flags);
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(bool6, "Flags.IS_EXPECT_PROPERTY.get(flags)");
        final kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedPropertyDescriptor deserializedPropertyDescriptor = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedPropertyDescriptor(containingDeclaration, null, annotations, modality, visibility, zBooleanValue, name, kindMemberKind, zBooleanValue2, zBooleanValue3, zBooleanValue4, zBooleanValue5, bool6.booleanValue(), proto, this.c.getNameResolver(), this.c.getTypeTable(), this.c.getVersionRequirementTable(), this.c.getContainerSource());
        java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter> typeParameterList = proto.getTypeParameterList();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(typeParameterList, "proto.typeParameterList");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext deserializationContextChildContext$default = kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext.childContext$default(this.c, deserializedPropertyDescriptor, typeParameterList, null, null, null, null, 60, null);
        java.lang.Boolean bool7 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.HAS_GETTER.get(flags);
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(bool7, "Flags.HAS_GETTER.get(flags)");
        boolean zBooleanValue6 = bool7.booleanValue();
        if (zBooleanValue6 && kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt.hasReceiver(proto)) {
            property = property2;
            empty = getReceiverParameterAnnotations(property, kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind.PROPERTY_GETTER);
        } else {
            property = property2;
            empty = kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations.Companion.getEMPTY();
        }
        kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinTypeType2 = deserializationContextChildContext$default.getTypeDeserializer().type(kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt.returnType(proto, this.c.getTypeTable()));
        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> ownTypeParameters = deserializationContextChildContext$default.getTypeDeserializer().getOwnTypeParameters();
        kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor dispatchReceiverParameter = getDispatchReceiverParameter();
        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type typeReceiverType = kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt.receiverType(proto, this.c.getTypeTable());
        kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertySetterDescriptorImpl propertySetterDescriptorImplCreateDefaultSetter = null;
        deserializedPropertyDescriptor.setType(kotlinTypeType2, ownTypeParameters, dispatchReceiverParameter, (typeReceiverType == null || (kotlinTypeType = deserializationContextChildContext$default.getTypeDeserializer().type(typeReceiverType)) == null) ? null : kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory.createExtensionReceiverParameterForCallable(deserializedPropertyDescriptor, kotlinTypeType, empty));
        java.lang.Boolean bool8 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.HAS_ANNOTATIONS.get(flags);
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(bool8, "Flags.HAS_ANNOTATIONS.get(flags)");
        int accessorFlags = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.getAccessorFlags(bool8.booleanValue(), kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.VISIBILITY.get(flags), kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.MODALITY.get(flags), false, false, false);
        if (zBooleanValue6) {
            int getterFlags = proto.hasGetterFlags() ? proto.getGetterFlags() : accessorFlags;
            java.lang.Boolean bool9 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.IS_NOT_DEFAULT.get(getterFlags);
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(bool9, "Flags.IS_NOT_DEFAULT.get(getterFlags)");
            boolean zBooleanValue7 = bool9.booleanValue();
            java.lang.Boolean bool10 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.IS_EXTERNAL_ACCESSOR.get(getterFlags);
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(bool10, "Flags.IS_EXTERNAL_ACCESSOR.get(getterFlags)");
            boolean zBooleanValue8 = bool10.booleanValue();
            java.lang.Boolean bool11 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.IS_INLINE_ACCESSOR.get(getterFlags);
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(bool11, "Flags.IS_INLINE_ACCESSOR.get(getterFlags)");
            boolean zBooleanValue9 = bool11.booleanValue();
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations2 = getAnnotations(property, getterFlags, kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind.PROPERTY_GETTER);
            if (zBooleanValue7) {
                propertyGetterDescriptorImplCreateDefaultGetter = new kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyGetterDescriptorImpl(deserializedPropertyDescriptor, annotations2, kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoEnumFlags.INSTANCE.modality(kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.MODALITY.get(getterFlags)), kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoEnumFlags.INSTANCE.visibility(kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.VISIBILITY.get(getterFlags)), !zBooleanValue7, zBooleanValue8, zBooleanValue9, deserializedPropertyDescriptor.getKind(), null, kotlin.reflect.jvm.internal.impl.descriptors.SourceElement.NO_SOURCE);
            } else {
                propertyGetterDescriptorImplCreateDefaultGetter = kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory.createDefaultGetter(deserializedPropertyDescriptor, annotations2);
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(propertyGetterDescriptorImplCreateDefaultGetter, "DescriptorFactory.create…er(property, annotations)");
            }
            propertyGetterDescriptorImplCreateDefaultGetter.initialize(deserializedPropertyDescriptor.getReturnType());
            propertyGetterDescriptorImpl = propertyGetterDescriptorImplCreateDefaultGetter;
        } else {
            propertyGetterDescriptorImpl = null;
        }
        java.lang.Boolean bool12 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.HAS_SETTER.get(flags);
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(bool12, "Flags.HAS_SETTER.get(flags)");
        if (bool12.booleanValue()) {
            if (proto.hasSetterFlags()) {
                accessorFlags = proto.getSetterFlags();
            }
            java.lang.Boolean bool13 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.IS_NOT_DEFAULT.get(accessorFlags);
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(bool13, "Flags.IS_NOT_DEFAULT.get(setterFlags)");
            boolean zBooleanValue10 = bool13.booleanValue();
            java.lang.Boolean bool14 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.IS_EXTERNAL_ACCESSOR.get(accessorFlags);
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(bool14, "Flags.IS_EXTERNAL_ACCESSOR.get(setterFlags)");
            boolean zBooleanValue11 = bool14.booleanValue();
            java.lang.Boolean bool15 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.IS_INLINE_ACCESSOR.get(accessorFlags);
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(bool15, "Flags.IS_INLINE_ACCESSOR.get(setterFlags)");
            boolean zBooleanValue12 = bool15.booleanValue();
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations3 = getAnnotations(property, accessorFlags, kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind.PROPERTY_SETTER);
            if (zBooleanValue10) {
                kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertySetterDescriptorImpl propertySetterDescriptorImpl = new kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertySetterDescriptorImpl(deserializedPropertyDescriptor, annotations3, kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoEnumFlags.INSTANCE.modality(kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.MODALITY.get(accessorFlags)), kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoEnumFlags.INSTANCE.visibility(kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.VISIBILITY.get(accessorFlags)), !zBooleanValue10, zBooleanValue11, zBooleanValue12, deserializedPropertyDescriptor.getKind(), null, kotlin.reflect.jvm.internal.impl.descriptors.SourceElement.NO_SOURCE);
                z = true;
                propertySetterDescriptorImpl.initialize((kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor) kotlin.collections.CollectionsKt.single((java.util.List) kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext.childContext$default(deserializationContextChildContext$default, propertySetterDescriptorImpl, kotlin.collections.CollectionsKt.emptyList(), null, null, null, null, 60, null).getMemberDeserializer().valueParameters(kotlin.collections.CollectionsKt.listOf(proto.getSetterValueParameter()), property, kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind.PROPERTY_SETTER)));
                propertySetterDescriptorImplCreateDefaultSetter = propertySetterDescriptorImpl;
            } else {
                z = true;
                propertySetterDescriptorImplCreateDefaultSetter = kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory.createDefaultSetter(deserializedPropertyDescriptor, annotations3, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations.Companion.getEMPTY());
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(propertySetterDescriptorImplCreateDefaultSetter, "DescriptorFactory.create…ptor */\n                )");
            }
        } else {
            z = true;
        }
        java.lang.Boolean bool16 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.HAS_CONSTANT.get(flags);
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(bool16, "Flags.HAS_CONSTANT.get(flags)");
        if (bool16.booleanValue()) {
            deserializedPropertyDescriptor.setCompileTimeInitializer(this.c.getStorageManager().createNullableLazyValue(new kotlin.jvm.functions.Function0<kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue<?>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer.loadProperty.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue<?> invoke() {
                    kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer memberDeserializer = kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer.this;
                    kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer protoContainerAsProtoContainer = memberDeserializer.asProtoContainer(memberDeserializer.c.getContainingDeclaration());
                    if (protoContainerAsProtoContainer == null) {
                        kotlin.jvm.internal.Intrinsics.throwNpe();
                    }
                    kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationAndConstantLoader<kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor, kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue<?>> annotationAndConstantLoader = kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer.this.c.getComponents().getAnnotationAndConstantLoader();
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property property3 = proto;
                    kotlin.reflect.jvm.internal.impl.types.KotlinType returnType = deserializedPropertyDescriptor.getReturnType();
                    kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(returnType, "property.returnType");
                    return annotationAndConstantLoader.loadPropertyConstant(protoContainerAsProtoContainer, property3, returnType);
                }
            }));
        }
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedPropertyDescriptor deserializedPropertyDescriptor2 = deserializedPropertyDescriptor;
        deserializedPropertyDescriptor.initialize(propertyGetterDescriptorImpl, propertySetterDescriptorImplCreateDefaultSetter, new kotlin.reflect.jvm.internal.impl.descriptors.impl.FieldDescriptorImpl(getPropertyFieldAnnotations(proto, false), deserializedPropertyDescriptor2), new kotlin.reflect.jvm.internal.impl.descriptors.impl.FieldDescriptorImpl(getPropertyFieldAnnotations(proto, z), deserializedPropertyDescriptor2), checkExperimentalCoroutine(deserializedPropertyDescriptor, deserializationContextChildContext$default.getTypeDeserializer()));
        return deserializedPropertyDescriptor2;
    }

    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor.CoroutinesCompatibilityMode checkExperimentalCoroutine(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor deserializedMemberDescriptor, kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer typeDeserializer) {
        if (!versionAndReleaseCoroutinesMismatch(deserializedMemberDescriptor)) {
            return kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor.CoroutinesCompatibilityMode.COMPATIBLE;
        }
        forceUpperBoundsComputation(typeDeserializer);
        if (typeDeserializer.getExperimentalSuspendFunctionTypeEncountered()) {
            return kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor.CoroutinesCompatibilityMode.INCOMPATIBLE;
        }
        return kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor.CoroutinesCompatibilityMode.COMPATIBLE;
    }

    private final void forceUpperBoundsComputation(kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer typeDeserializer) {
        java.util.Iterator<T> it = typeDeserializer.getOwnTypeParameters().iterator();
        while (it.hasNext()) {
            ((kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor) it.next()).getUpperBounds();
        }
    }

    private final void initializeWithCoroutinesExperimentalityStatus(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedSimpleFunctionDescriptor deserializedSimpleFunctionDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor receiverParameterDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor receiverParameterDescriptor2, java.util.List<? extends kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> list, java.util.List<? extends kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> list2, kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType, kotlin.reflect.jvm.internal.impl.descriptors.Modality modality, kotlin.reflect.jvm.internal.impl.descriptors.Visibility visibility, java.util.Map<? extends kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor.UserDataKey<?>, ?> map, boolean z) {
        deserializedSimpleFunctionDescriptor.initialize(receiverParameterDescriptor, receiverParameterDescriptor2, list, list2, kotlinType, modality, visibility, map, computeExperimentalityModeForFunctions(deserializedSimpleFunctionDescriptor, receiverParameterDescriptor, list2, list, kotlinType, z));
    }

    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor.CoroutinesCompatibilityMode computeExperimentalityModeForFunctions(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedCallableMemberDescriptor deserializedCallableMemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor receiverParameterDescriptor, java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> collection, java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> collection2, kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType, boolean z) {
        boolean z2;
        boolean z3;
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor.CoroutinesCompatibilityMode coroutinesCompatibilityMode;
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor.CoroutinesCompatibilityMode coroutinesCompatibilityMode2;
        boolean z4;
        if (versionAndReleaseCoroutinesMismatch(deserializedCallableMemberDescriptor) && !kotlin.jvm.internal.Intrinsics.areEqual(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.fqNameOrNull(deserializedCallableMemberDescriptor), kotlin.reflect.jvm.internal.impl.serialization.deserialization.SuspendFunctionTypeUtilKt.KOTLIN_SUSPEND_BUILT_IN_FUNCTION_FQ_NAME)) {
            java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> collection3 = collection;
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(collection3, 10));
            java.util.Iterator<T> it = collection3.iterator();
            while (it.hasNext()) {
                arrayList.add(((kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor) it.next()).getType());
            }
            java.util.List listPlus = kotlin.collections.CollectionsKt.plus((java.util.Collection) arrayList, (java.lang.Iterable) kotlin.collections.CollectionsKt.listOfNotNull(receiverParameterDescriptor != null ? receiverParameterDescriptor.getType() : null));
            if (kotlinType != null && containsSuspendFunctionType(kotlinType)) {
                return kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor.CoroutinesCompatibilityMode.INCOMPATIBLE;
            }
            java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> collection4 = collection2;
            if (!(collection4 instanceof java.util.Collection) || !collection4.isEmpty()) {
                java.util.Iterator<T> it2 = collection4.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        z3 = false;
                        break;
                    }
                    java.util.List<kotlin.reflect.jvm.internal.impl.types.KotlinType> upperBounds = ((kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor) it2.next()).getUpperBounds();
                    kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(upperBounds, "typeParameter.upperBounds");
                    java.util.List<kotlin.reflect.jvm.internal.impl.types.KotlinType> list = upperBounds;
                    if (!(list instanceof java.util.Collection) || !list.isEmpty()) {
                        java.util.Iterator<T> it3 = list.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                z2 = false;
                                break;
                            }
                            kotlin.reflect.jvm.internal.impl.types.KotlinType it4 = (kotlin.reflect.jvm.internal.impl.types.KotlinType) it3.next();
                            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(it4, "it");
                            if (containsSuspendFunctionType(it4)) {
                                z2 = true;
                                break;
                            }
                        }
                    } else {
                        z2 = false;
                        break;
                        break;
                    }
                    if (z2) {
                        z3 = true;
                        break;
                    }
                }
            } else {
                z3 = false;
                break;
            }
            if (z3) {
                return kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor.CoroutinesCompatibilityMode.INCOMPATIBLE;
            }
            java.util.List<kotlin.reflect.jvm.internal.impl.types.KotlinType> list2 = listPlus;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
            for (kotlin.reflect.jvm.internal.impl.types.KotlinType type : list2) {
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(type, "type");
                if (kotlin.reflect.jvm.internal.impl.builtins.FunctionTypesKt.isSuspendFunctionType(type) && type.getArguments().size() <= 3) {
                    java.util.List<kotlin.reflect.jvm.internal.impl.types.TypeProjection> arguments = type.getArguments();
                    if (!(arguments instanceof java.util.Collection) || !arguments.isEmpty()) {
                        java.util.Iterator<T> it5 = arguments.iterator();
                        while (true) {
                            if (!it5.hasNext()) {
                                z4 = false;
                                break;
                            }
                            kotlin.reflect.jvm.internal.impl.types.KotlinType type2 = ((kotlin.reflect.jvm.internal.impl.types.TypeProjection) it5.next()).getType();
                            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(type2, "it.type");
                            if (containsSuspendFunctionType(type2)) {
                                z4 = true;
                                break;
                            }
                        }
                    } else {
                        z4 = false;
                        break;
                    }
                    if (z4) {
                        coroutinesCompatibilityMode2 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor.CoroutinesCompatibilityMode.INCOMPATIBLE;
                    } else {
                        coroutinesCompatibilityMode2 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor.CoroutinesCompatibilityMode.NEEDS_WRAPPER;
                    }
                } else {
                    coroutinesCompatibilityMode2 = containsSuspendFunctionType(type) ? kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor.CoroutinesCompatibilityMode.INCOMPATIBLE : kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor.CoroutinesCompatibilityMode.COMPATIBLE;
                }
                arrayList2.add(coroutinesCompatibilityMode2);
            }
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor.CoroutinesCompatibilityMode coroutinesCompatibilityMode3 = (kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor.CoroutinesCompatibilityMode) kotlin.collections.CollectionsKt.max((java.lang.Iterable) arrayList2);
            if (coroutinesCompatibilityMode3 == null) {
                coroutinesCompatibilityMode3 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor.CoroutinesCompatibilityMode.COMPATIBLE;
            }
            if (z) {
                coroutinesCompatibilityMode = kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor.CoroutinesCompatibilityMode.NEEDS_WRAPPER;
            } else {
                coroutinesCompatibilityMode = kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor.CoroutinesCompatibilityMode.COMPATIBLE;
            }
            return (kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor.CoroutinesCompatibilityMode) kotlin.comparisons.ComparisonsKt.maxOf(coroutinesCompatibilityMode, coroutinesCompatibilityMode3);
        }
        return kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor.CoroutinesCompatibilityMode.COMPATIBLE;
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer$containsSuspendFunctionType$1, reason: invalid class name */
    /* JADX INFO: compiled from: MemberDeserializer.kt */
    final /* synthetic */ class AnonymousClass1 extends kotlin.jvm.internal.PropertyReference1 {
        public static final kotlin.reflect.KProperty1 INSTANCE = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer.AnonymousClass1();

        AnonymousClass1() {
        }

        @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
        public java.lang.String getName() {
            return "isSuspendFunctionType";
        }

        @Override // kotlin.jvm.internal.CallableReference
        public kotlin.reflect.KDeclarationContainer getOwner() {
            return kotlin.jvm.internal.Reflection.getOrCreateKotlinPackage(kotlin.reflect.jvm.internal.impl.builtins.FunctionTypesKt.class, "deserialization");
        }

        @Override // kotlin.jvm.internal.CallableReference
        public java.lang.String getSignature() {
            return "isSuspendFunctionType(Lorg/jetbrains/kotlin/types/KotlinType;)Z";
        }

        @Override // kotlin.reflect.KProperty1
        public java.lang.Object get(java.lang.Object obj) {
            return java.lang.Boolean.valueOf(kotlin.reflect.jvm.internal.impl.builtins.FunctionTypesKt.isSuspendFunctionType((kotlin.reflect.jvm.internal.impl.types.UnwrappedType) obj));
        }
    }

    private final boolean containsSuspendFunctionType(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        return kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.contains(kotlinType, kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer.AnonymousClass1.INSTANCE);
    }

    private final boolean versionAndReleaseCoroutinesMismatch(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor deserializedMemberDescriptor) {
        boolean z;
        if (!this.c.getComponents().getConfiguration().getReleaseCoroutines()) {
            return false;
        }
        java.util.List<kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirement> versionRequirements = deserializedMemberDescriptor.getVersionRequirements();
        if ((versionRequirements instanceof java.util.Collection) && versionRequirements.isEmpty()) {
            z = true;
        } else {
            for (kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirement versionRequirement : versionRequirements) {
                if (kotlin.jvm.internal.Intrinsics.areEqual(versionRequirement.getVersion(), new kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirement.Version(1, 3, 0, 4, null)) && versionRequirement.getKind() == kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.VersionKind.LANGUAGE_VERSION) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    public final kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor loadFunction(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function proto) {
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations empty;
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable versionRequirementTable;
        kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinTypeType;
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(proto, "proto");
        int flags = proto.hasFlags() ? proto.getFlags() : loadOldFlags(proto.getOldFlags());
        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function function = proto;
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations = getAnnotations(function, flags, kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind.FUNCTION);
        if (kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt.hasReceiver(proto)) {
            empty = getReceiverParameterAnnotations(function, kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind.FUNCTION);
        } else {
            empty = kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations.Companion.getEMPTY();
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getFqNameSafe(this.c.getContainingDeclaration()).child(kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt.getName(this.c.getNameResolver(), proto.getName())), kotlin.reflect.jvm.internal.impl.serialization.deserialization.SuspendFunctionTypeUtilKt.KOTLIN_SUSPEND_BUILT_IN_FUNCTION_FQ_NAME)) {
            versionRequirementTable = kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable.Companion.getEMPTY();
        } else {
            versionRequirementTable = this.c.getVersionRequirementTable();
        }
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedSimpleFunctionDescriptor deserializedSimpleFunctionDescriptor = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedSimpleFunctionDescriptor(this.c.getContainingDeclaration(), null, annotations, kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt.getName(this.c.getNameResolver(), proto.getName()), kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoEnumFlags.INSTANCE.memberKind(kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.MEMBER_KIND.get(flags)), proto, this.c.getNameResolver(), this.c.getTypeTable(), versionRequirementTable, this.c.getContainerSource(), null, 1024, null);
        java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter> typeParameterList = proto.getTypeParameterList();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(typeParameterList, "proto.typeParameterList");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext deserializationContextChildContext$default = kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext.childContext$default(this.c, deserializedSimpleFunctionDescriptor, typeParameterList, null, null, null, null, 60, null);
        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type typeReceiverType = kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt.receiverType(proto, this.c.getTypeTable());
        kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor receiverParameterDescriptorCreateExtensionReceiverParameterForCallable = (typeReceiverType == null || (kotlinTypeType = deserializationContextChildContext$default.getTypeDeserializer().type(typeReceiverType)) == null) ? null : kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory.createExtensionReceiverParameterForCallable(deserializedSimpleFunctionDescriptor, kotlinTypeType, empty);
        kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor dispatchReceiverParameter = getDispatchReceiverParameter();
        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> ownTypeParameters = deserializationContextChildContext$default.getTypeDeserializer().getOwnTypeParameters();
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer memberDeserializer = deserializationContextChildContext$default.getMemberDeserializer();
        java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter> valueParameterList = proto.getValueParameterList();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(valueParameterList, "proto.valueParameterList");
        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> listValueParameters = memberDeserializer.valueParameters(valueParameterList, function, kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind.FUNCTION);
        kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinTypeType2 = deserializationContextChildContext$default.getTypeDeserializer().type(kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt.returnType(proto, this.c.getTypeTable()));
        kotlin.reflect.jvm.internal.impl.descriptors.Modality modality = kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoEnumFlags.INSTANCE.modality(kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.MODALITY.get(flags));
        kotlin.reflect.jvm.internal.impl.descriptors.Visibility visibility = kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoEnumFlags.INSTANCE.visibility(kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.VISIBILITY.get(flags));
        java.util.Map<? extends kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor.UserDataKey<?>, ?> mapEmptyMap = kotlin.collections.MapsKt.emptyMap();
        java.lang.Boolean bool = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.IS_SUSPEND.get(flags);
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(bool, "Flags.IS_SUSPEND.get(flags)");
        initializeWithCoroutinesExperimentalityStatus(deserializedSimpleFunctionDescriptor, receiverParameterDescriptorCreateExtensionReceiverParameterForCallable, dispatchReceiverParameter, ownTypeParameters, listValueParameters, kotlinTypeType2, modality, visibility, mapEmptyMap, bool.booleanValue());
        java.lang.Boolean bool2 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.IS_OPERATOR.get(flags);
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(bool2, "Flags.IS_OPERATOR.get(flags)");
        deserializedSimpleFunctionDescriptor.setOperator(bool2.booleanValue());
        java.lang.Boolean bool3 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.IS_INFIX.get(flags);
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(bool3, "Flags.IS_INFIX.get(flags)");
        deserializedSimpleFunctionDescriptor.setInfix(bool3.booleanValue());
        java.lang.Boolean bool4 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.IS_EXTERNAL_FUNCTION.get(flags);
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(bool4, "Flags.IS_EXTERNAL_FUNCTION.get(flags)");
        deserializedSimpleFunctionDescriptor.setExternal(bool4.booleanValue());
        java.lang.Boolean bool5 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.IS_INLINE.get(flags);
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(bool5, "Flags.IS_INLINE.get(flags)");
        deserializedSimpleFunctionDescriptor.setInline(bool5.booleanValue());
        java.lang.Boolean bool6 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.IS_TAILREC.get(flags);
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(bool6, "Flags.IS_TAILREC.get(flags)");
        deserializedSimpleFunctionDescriptor.setTailrec(bool6.booleanValue());
        java.lang.Boolean bool7 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.IS_SUSPEND.get(flags);
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(bool7, "Flags.IS_SUSPEND.get(flags)");
        deserializedSimpleFunctionDescriptor.setSuspend(bool7.booleanValue());
        java.lang.Boolean bool8 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.IS_EXPECT_FUNCTION.get(flags);
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(bool8, "Flags.IS_EXPECT_FUNCTION.get(flags)");
        deserializedSimpleFunctionDescriptor.setExpect(bool8.booleanValue());
        kotlin.Pair<kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor.UserDataKey<?>, java.lang.Object> pairDeserializeContractFromFunction = this.c.getComponents().getContractDeserializer().deserializeContractFromFunction(proto, deserializedSimpleFunctionDescriptor, this.c.getTypeTable(), this.c.getTypeDeserializer());
        if (pairDeserializeContractFromFunction != null) {
            deserializedSimpleFunctionDescriptor.putInUserDataMap(pairDeserializeContractFromFunction.getFirst(), pairDeserializeContractFromFunction.getSecond());
        }
        return deserializedSimpleFunctionDescriptor;
    }

    public final kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor loadTypeAlias(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias proto) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(proto, "proto");
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations.Companion companion = kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations.Companion;
        java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation> annotationList = proto.getAnnotationList();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(annotationList, "proto.annotationList");
        java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation> list = annotationList;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
        for (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation it : list) {
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationDeserializer annotationDeserializer = this.annotationDeserializer;
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(it, "it");
            arrayList.add(annotationDeserializer.deserializeAnnotation(it, this.c.getNameResolver()));
        }
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedTypeAliasDescriptor deserializedTypeAliasDescriptor = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedTypeAliasDescriptor(this.c.getStorageManager(), this.c.getContainingDeclaration(), companion.create(arrayList), kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt.getName(this.c.getNameResolver(), proto.getName()), kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoEnumFlags.INSTANCE.visibility(kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.VISIBILITY.get(proto.getFlags())), proto, this.c.getNameResolver(), this.c.getTypeTable(), this.c.getVersionRequirementTable(), this.c.getContainerSource());
        java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter> typeParameterList = proto.getTypeParameterList();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(typeParameterList, "proto.typeParameterList");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext deserializationContextChildContext$default = kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext.childContext$default(this.c, deserializedTypeAliasDescriptor, typeParameterList, null, null, null, null, 60, null);
        deserializedTypeAliasDescriptor.initialize(deserializationContextChildContext$default.getTypeDeserializer().getOwnTypeParameters(), deserializationContextChildContext$default.getTypeDeserializer().simpleType(kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt.underlyingType(proto, this.c.getTypeTable())), deserializationContextChildContext$default.getTypeDeserializer().simpleType(kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt.expandedType(proto, this.c.getTypeTable())), checkExperimentalCoroutine(deserializedTypeAliasDescriptor, deserializationContextChildContext$default.getTypeDeserializer()));
        return deserializedTypeAliasDescriptor;
    }

    private final kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor getDispatchReceiverParameter() {
        kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor containingDeclaration = this.c.getContainingDeclaration();
        if (!(containingDeclaration instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor)) {
            containingDeclaration = null;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor = (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) containingDeclaration;
        if (classDescriptor != null) {
            return classDescriptor.getThisAsReceiverParameter();
        }
        return null;
    }

    public final kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor loadConstructor(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor proto, boolean z) {
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor.CoroutinesCompatibilityMode coroutinesCompatibilityModeComputeExperimentalityModeForFunctions;
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext c;
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer typeDeserializer;
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(proto, "proto");
        kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor containingDeclaration = this.c.getContainingDeclaration();
        if (containingDeclaration == null) {
            throw new kotlin.TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        }
        kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor = (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) containingDeclaration;
        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor constructor = proto;
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassConstructorDescriptor deserializedClassConstructorDescriptor = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassConstructorDescriptor(classDescriptor, null, getAnnotations(constructor, proto.getFlags(), kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind.FUNCTION), z, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind.DECLARATION, proto, this.c.getNameResolver(), this.c.getTypeTable(), this.c.getVersionRequirementTable(), this.c.getContainerSource(), null, 1024, null);
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer memberDeserializer = kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext.childContext$default(this.c, deserializedClassConstructorDescriptor, kotlin.collections.CollectionsKt.emptyList(), null, null, null, null, 60, null).getMemberDeserializer();
        java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter> valueParameterList = proto.getValueParameterList();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(valueParameterList, "proto.valueParameterList");
        deserializedClassConstructorDescriptor.initialize(memberDeserializer.valueParameters(valueParameterList, constructor, kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind.FUNCTION), kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoEnumFlags.INSTANCE.visibility(kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.VISIBILITY.get(proto.getFlags())));
        deserializedClassConstructorDescriptor.setReturnType(classDescriptor.getDefaultType());
        kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor containingDeclaration2 = this.c.getContainingDeclaration();
        if (!(containingDeclaration2 instanceof kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor)) {
            containingDeclaration2 = null;
        }
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor deserializedClassDescriptor = (kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor) containingDeclaration2;
        if ((deserializedClassDescriptor == null || (c = deserializedClassDescriptor.getC()) == null || (typeDeserializer = c.getTypeDeserializer()) == null || !typeDeserializer.getExperimentalSuspendFunctionTypeEncountered() || !versionAndReleaseCoroutinesMismatch(deserializedClassConstructorDescriptor)) ? false : true) {
            coroutinesCompatibilityModeComputeExperimentalityModeForFunctions = kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor.CoroutinesCompatibilityMode.INCOMPATIBLE;
        } else {
            java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> valueParameters = deserializedClassConstructorDescriptor.getValueParameters();
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(valueParameters, "descriptor.valueParameters");
            java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> list = valueParameters;
            java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> typeParameters = deserializedClassConstructorDescriptor.getTypeParameters();
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(typeParameters, "descriptor.typeParameters");
            coroutinesCompatibilityModeComputeExperimentalityModeForFunctions = computeExperimentalityModeForFunctions(deserializedClassConstructorDescriptor, null, list, typeParameters, deserializedClassConstructorDescriptor.getReturnType(), false);
        }
        deserializedClassConstructorDescriptor.setCoroutinesExperimentalCompatibilityMode$deserialization(coroutinesCompatibilityModeComputeExperimentalityModeForFunctions);
        return deserializedClassConstructorDescriptor;
    }

    private final kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations getAnnotations(final kotlin.reflect.jvm.internal.impl.protobuf.MessageLite messageLite, int i, final kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind annotatedCallableKind) {
        if (!kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.HAS_ANNOTATIONS.get(i).booleanValue()) {
            return kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations.Companion.getEMPTY();
        }
        return new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.NonEmptyDeserializedAnnotations(this.c.getStorageManager(), new kotlin.jvm.functions.Function0<java.util.List<? extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer.getAnnotations.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final java.util.List<? extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor> invoke() {
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer memberDeserializer = kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer.this;
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer protoContainerAsProtoContainer = memberDeserializer.asProtoContainer(memberDeserializer.c.getContainingDeclaration());
                java.util.List<? extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor> list = protoContainerAsProtoContainer != null ? kotlin.collections.CollectionsKt.toList(kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer.this.c.getComponents().getAnnotationAndConstantLoader().loadCallableAnnotations(protoContainerAsProtoContainer, messageLite, annotatedCallableKind)) : null;
                return list != null ? list : kotlin.collections.CollectionsKt.emptyList();
            }
        });
    }

    private final kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations getPropertyFieldAnnotations(final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property property, final boolean z) {
        if (!kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.HAS_ANNOTATIONS.get(property.getFlags()).booleanValue()) {
            return kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations.Companion.getEMPTY();
        }
        return new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.NonEmptyDeserializedAnnotations(this.c.getStorageManager(), new kotlin.jvm.functions.Function0<java.util.List<? extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer.getPropertyFieldAnnotations.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final java.util.List<? extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor> invoke() {
                java.util.List<? extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor> list;
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer memberDeserializer = kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer.this;
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer protoContainerAsProtoContainer = memberDeserializer.asProtoContainer(memberDeserializer.c.getContainingDeclaration());
                if (protoContainerAsProtoContainer != null) {
                    list = z ? kotlin.collections.CollectionsKt.toList(kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer.this.c.getComponents().getAnnotationAndConstantLoader().loadPropertyDelegateFieldAnnotations(protoContainerAsProtoContainer, property)) : kotlin.collections.CollectionsKt.toList(kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer.this.c.getComponents().getAnnotationAndConstantLoader().loadPropertyBackingFieldAnnotations(protoContainerAsProtoContainer, property));
                } else {
                    list = null;
                }
                return list != null ? list : kotlin.collections.CollectionsKt.emptyList();
            }
        });
    }

    private final kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations getReceiverParameterAnnotations(final kotlin.reflect.jvm.internal.impl.protobuf.MessageLite messageLite, final kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind annotatedCallableKind) {
        return new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedAnnotations(this.c.getStorageManager(), new kotlin.jvm.functions.Function0<java.util.List<? extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer.getReceiverParameterAnnotations.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final java.util.List<? extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor> invoke() {
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer memberDeserializer = kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer.this;
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer protoContainerAsProtoContainer = memberDeserializer.asProtoContainer(memberDeserializer.c.getContainingDeclaration());
                java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor> listLoadExtensionReceiverParameterAnnotations = protoContainerAsProtoContainer != null ? kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer.this.c.getComponents().getAnnotationAndConstantLoader().loadExtensionReceiverParameterAnnotations(protoContainerAsProtoContainer, messageLite, annotatedCallableKind) : null;
                return listLoadExtensionReceiverParameterAnnotations != null ? listLoadExtensionReceiverParameterAnnotations : kotlin.collections.CollectionsKt.emptyList();
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:18:0x008b  */
    private final java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> valueParameters(java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter> list, final kotlin.reflect.jvm.internal.impl.protobuf.MessageLite messageLite, final kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind annotatedCallableKind) {
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations empty;
        kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor containingDeclaration = this.c.getContainingDeclaration();
        if (containingDeclaration == null) {
            throw new kotlin.TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableDescriptor");
        }
        final kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor callableDescriptor = (kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor) containingDeclaration;
        kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor containingDeclaration2 = callableDescriptor.getContainingDeclaration();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(containingDeclaration2, "callableDescriptor.containingDeclaration");
        final kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer protoContainerAsProtoContainer = asProtoContainer(containingDeclaration2);
        java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter> list2 = list;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
        int i = 0;
        for (java.lang.Object obj : list2) {
            int i2 = i + 1;
            if (i < 0) {
                kotlin.collections.CollectionsKt.throwIndexOverflow();
            }
            final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter valueParameter = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter) obj;
            int flags = valueParameter.hasFlags() ? valueParameter.getFlags() : 0;
            if (protoContainerAsProtoContainer != null) {
                java.lang.Boolean bool = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.HAS_ANNOTATIONS.get(flags);
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(bool, "Flags.HAS_ANNOTATIONS.get(flags)");
                if (bool.booleanValue()) {
                    final int i3 = i;
                    empty = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.NonEmptyDeserializedAnnotations(this.c.getStorageManager(), new kotlin.jvm.functions.Function0<java.util.List<? extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer$valueParameters$$inlined$mapIndexed$lambda$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final java.util.List<? extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor> invoke() {
                            return kotlin.collections.CollectionsKt.toList(this.c.getComponents().getAnnotationAndConstantLoader().loadValueParameterAnnotations(protoContainerAsProtoContainer, messageLite, annotatedCallableKind, i3, valueParameter));
                        }
                    });
                } else {
                    empty = kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations.Companion.getEMPTY();
                }
            } else {
                empty = kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations.Companion.getEMPTY();
            }
            kotlin.reflect.jvm.internal.impl.name.Name name = kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt.getName(this.c.getNameResolver(), valueParameter.getName());
            kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinTypeType = this.c.getTypeDeserializer().type(kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt.type(valueParameter, this.c.getTypeTable()));
            java.lang.Boolean bool2 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.DECLARES_DEFAULT_VALUE.get(flags);
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(bool2, "Flags.DECLARES_DEFAULT_VALUE.get(flags)");
            boolean zBooleanValue = bool2.booleanValue();
            java.lang.Boolean bool3 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.IS_CROSSINLINE.get(flags);
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(bool3, "Flags.IS_CROSSINLINE.get(flags)");
            boolean zBooleanValue2 = bool3.booleanValue();
            java.lang.Boolean bool4 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.IS_NOINLINE.get(flags);
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(bool4, "Flags.IS_NOINLINE.get(flags)");
            boolean zBooleanValue3 = bool4.booleanValue();
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type typeVarargElementType = kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt.varargElementType(valueParameter, this.c.getTypeTable());
            kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinTypeType2 = typeVarargElementType != null ? this.c.getTypeDeserializer().type(typeVarargElementType) : null;
            kotlin.reflect.jvm.internal.impl.descriptors.SourceElement sourceElement = kotlin.reflect.jvm.internal.impl.descriptors.SourceElement.NO_SOURCE;
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(sourceElement, "SourceElement.NO_SOURCE");
            java.util.ArrayList arrayList2 = arrayList;
            arrayList2.add(new kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl(callableDescriptor, null, i, empty, name, kotlinTypeType, zBooleanValue, zBooleanValue2, zBooleanValue3, kotlinTypeType2, sourceElement));
            arrayList = arrayList2;
            i = i2;
        }
        return kotlin.collections.CollectionsKt.toList(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer asProtoContainer(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor) {
            return new kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer.Package(((kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor) declarationDescriptor).getFqName(), this.c.getNameResolver(), this.c.getTypeTable(), this.c.getContainerSource());
        }
        if (declarationDescriptor instanceof kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor) {
            return ((kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor) declarationDescriptor).getThisAsProtoContainer$deserialization();
        }
        return null;
    }
}
