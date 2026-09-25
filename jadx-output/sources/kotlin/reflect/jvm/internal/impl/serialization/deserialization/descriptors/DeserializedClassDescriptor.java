package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

/* JADX INFO: compiled from: DeserializedClassDescriptor.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class DeserializedClassDescriptor extends kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractClassDescriptor {
    private final kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations;
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext c;
    private final kotlin.reflect.jvm.internal.impl.name.ClassId classId;
    private final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class classProto;
    private final kotlin.reflect.jvm.internal.impl.storage.NullableLazyValue<kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor> companionObjectDescriptor;
    private final kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue<java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor>> constructors;
    private final kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor containingDeclaration;
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor.EnumEntryClassDescriptors enumEntries;
    private final kotlin.reflect.jvm.internal.impl.descriptors.ClassKind kind;
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor.DeserializedClassMemberScope memberScope;
    private final kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion metadataVersion;
    private final kotlin.reflect.jvm.internal.impl.descriptors.Modality modality;
    private final kotlin.reflect.jvm.internal.impl.storage.NullableLazyValue<kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor> primaryConstructor;
    private final kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue<java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor>> sealedSubclasses;
    private final kotlin.reflect.jvm.internal.impl.descriptors.SourceElement sourceElement;
    private final kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl staticScope;
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer.Class thisAsProtoContainer;
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor.DeserializedClassTypeConstructor typeConstructor;
    private final kotlin.reflect.jvm.internal.impl.descriptors.Visibility visibility;

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isActual() {
        return false;
    }

    public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class getClassProto() {
        return this.classProto;
    }

    public final kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion getMetadataVersion() {
        return this.metadataVersion;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeserializedClassDescriptor(kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext outerContext, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class classProto, kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver nameResolver, kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion metadataVersion, kotlin.reflect.jvm.internal.impl.descriptors.SourceElement sourceElement) {
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.NonEmptyDeserializedAnnotations nonEmptyDeserializedAnnotations;
        super(outerContext.getStorageManager(), kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt.getClassId(nameResolver, classProto.getFqName()).getShortClassName());
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(outerContext, "outerContext");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(classProto, "classProto");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(nameResolver, "nameResolver");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(metadataVersion, "metadataVersion");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(sourceElement, "sourceElement");
        this.classProto = classProto;
        this.metadataVersion = metadataVersion;
        this.sourceElement = sourceElement;
        this.classId = kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt.getClassId(nameResolver, classProto.getFqName());
        this.modality = kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoEnumFlags.INSTANCE.modality(kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.MODALITY.get(classProto.getFlags()));
        this.visibility = kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoEnumFlags.INSTANCE.visibility(kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.VISIBILITY.get(classProto.getFlags()));
        kotlin.reflect.jvm.internal.impl.descriptors.ClassKind classKind = kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoEnumFlags.INSTANCE.classKind(kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.CLASS_KIND.get(classProto.getFlags()));
        this.kind = classKind;
        java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter> typeParameterList = classProto.getTypeParameterList();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(typeParameterList, "classProto.typeParameterList");
        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable typeTable = classProto.getTypeTable();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(typeTable, "classProto.typeTable");
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable typeTable2 = new kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable(typeTable);
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable.Companion companion = kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable.Companion;
        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable versionRequirementTable = classProto.getVersionRequirementTable();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(versionRequirementTable, "classProto.versionRequirementTable");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext deserializationContextChildContext = outerContext.childContext(this, typeParameterList, nameResolver, typeTable2, companion.create(versionRequirementTable), metadataVersion);
        this.c = deserializationContextChildContext;
        this.staticScope = classKind == kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.ENUM_CLASS ? new kotlin.reflect.jvm.internal.impl.resolve.scopes.StaticScopeForKotlinEnum(deserializationContextChildContext.getStorageManager(), this) : kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope.Empty.INSTANCE;
        this.typeConstructor = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor.DeserializedClassTypeConstructor();
        this.memberScope = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor.DeserializedClassMemberScope();
        this.enumEntries = classKind == kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.ENUM_CLASS ? new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor.EnumEntryClassDescriptors() : null;
        kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor containingDeclaration = outerContext.getContainingDeclaration();
        this.containingDeclaration = containingDeclaration;
        this.primaryConstructor = deserializationContextChildContext.getStorageManager().createNullableLazyValue(new kotlin.jvm.functions.Function0<kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$primaryConstructor$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor invoke() {
                return this.this$0.computePrimaryConstructor();
            }
        });
        this.constructors = deserializationContextChildContext.getStorageManager().createLazyValue(new kotlin.jvm.functions.Function0<java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$constructors$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor> invoke() {
                return this.this$0.computeConstructors();
            }
        });
        this.companionObjectDescriptor = deserializationContextChildContext.getStorageManager().createNullableLazyValue(new kotlin.jvm.functions.Function0<kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$companionObjectDescriptor$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor invoke() {
                return this.this$0.computeCompanionObjectDescriptor();
            }
        });
        this.sealedSubclasses = deserializationContextChildContext.getStorageManager().createLazyValue(new kotlin.jvm.functions.Function0<java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$sealedSubclasses$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor> invoke() {
                return this.this$0.computeSubclassesForSealedClass();
            }
        });
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver nameResolver2 = deserializationContextChildContext.getNameResolver();
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable typeTable3 = deserializationContextChildContext.getTypeTable();
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor deserializedClassDescriptor = (kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor) (containingDeclaration instanceof kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor ? containingDeclaration : null);
        this.thisAsProtoContainer = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer.Class(classProto, nameResolver2, typeTable3, sourceElement, deserializedClassDescriptor != null ? deserializedClassDescriptor.thisAsProtoContainer : null);
        if (!kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.HAS_ANNOTATIONS.get(classProto.getFlags()).booleanValue()) {
            nonEmptyDeserializedAnnotations = kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations.Companion.getEMPTY();
        } else {
            nonEmptyDeserializedAnnotations = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.NonEmptyDeserializedAnnotations(deserializationContextChildContext.getStorageManager(), new kotlin.jvm.functions.Function0<java.util.List<? extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$annotations$1
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final java.util.List<? extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor> invoke() {
                    return kotlin.collections.CollectionsKt.toList(this.this$0.getC().getComponents().getAnnotationAndConstantLoader().loadClassAnnotations(this.this$0.getThisAsProtoContainer$deserialization()));
                }
            });
        }
        this.annotations = nonEmptyDeserializedAnnotations;
    }

    public final kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext getC() {
        return this.c;
    }

    public final kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer.Class getThisAsProtoContainer$deserialization() {
        return this.thisAsProtoContainer;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    public kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations getAnnotations() {
        return this.annotations;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorNonRoot, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor getContainingDeclaration() {
        return this.containingDeclaration;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    public kotlin.reflect.jvm.internal.impl.types.TypeConstructor getTypeConstructor() {
        return this.typeConstructor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public kotlin.reflect.jvm.internal.impl.descriptors.ClassKind getKind() {
        return this.kind;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public kotlin.reflect.jvm.internal.impl.descriptors.Modality getModality() {
        return this.modality;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public kotlin.reflect.jvm.internal.impl.descriptors.Visibility getVisibility() {
        return this.visibility;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
    public boolean isInner() {
        java.lang.Boolean bool = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.IS_INNER.get(this.classProto.getFlags());
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(bool, "Flags.IS_INNER.get(classProto.flags)");
        return bool.booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isData() {
        java.lang.Boolean bool = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.IS_DATA.get(this.classProto.getFlags());
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(bool, "Flags.IS_DATA.get(classProto.flags)");
        return bool.booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isInline() {
        java.lang.Boolean bool = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.IS_INLINE_CLASS.get(this.classProto.getFlags());
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(bool, "Flags.IS_INLINE_CLASS.get(classProto.flags)");
        return bool.booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isExpect() {
        java.lang.Boolean bool = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.IS_EXPECT_CLASS.get(this.classProto.getFlags());
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(bool, "Flags.IS_EXPECT_CLASS.get(classProto.flags)");
        return bool.booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isExternal() {
        java.lang.Boolean bool = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.IS_EXTERNAL_CLASS.get(this.classProto.getFlags());
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(bool, "Flags.IS_EXTERNAL_CLASS.get(classProto.flags)");
        return bool.booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope getUnsubstitutedMemberScope() {
        return this.memberScope;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl getStaticScope() {
        return this.staticScope;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isCompanionObject() {
        return kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.CLASS_KIND.get(this.classProto.getFlags()) == kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.Kind.COMPANION_OBJECT;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor computePrimaryConstructor() {
        java.lang.Object next;
        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor it;
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField booleanFlagField;
        if (this.kind.isSingleton()) {
            kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassConstructorDescriptorImpl classConstructorDescriptorImplCreatePrimaryConstructorForObject = kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory.createPrimaryConstructorForObject(this, kotlin.reflect.jvm.internal.impl.descriptors.SourceElement.NO_SOURCE);
            classConstructorDescriptorImplCreatePrimaryConstructorForObject.setReturnType(getDefaultType());
            return classConstructorDescriptorImplCreatePrimaryConstructorForObject;
        }
        java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor> constructorList = this.classProto.getConstructorList();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(constructorList, "classProto.constructorList");
        java.util.Iterator<T> it2 = constructorList.iterator();
        do {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            it = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor) next;
            booleanFlagField = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.IS_SECONDARY;
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(it, "it");
        } while (!(!booleanFlagField.get(it.getFlags()).booleanValue()));
        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor constructor = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor) next;
        if (constructor != null) {
            return this.c.getMemberDeserializer().loadConstructor(constructor, true);
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    /* JADX INFO: renamed from: getUnsubstitutedPrimaryConstructor */
    public kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor mo1262getUnsubstitutedPrimaryConstructor() {
        return this.primaryConstructor.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor> computeConstructors() {
        return kotlin.collections.CollectionsKt.plus((java.util.Collection) kotlin.collections.CollectionsKt.plus((java.util.Collection) computeSecondaryConstructors(), (java.lang.Iterable) kotlin.collections.CollectionsKt.listOfNotNull(mo1262getUnsubstitutedPrimaryConstructor())), (java.lang.Iterable) this.c.getComponents().getAdditionalClassPartsProvider().getConstructors(this));
    }

    private final java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor> computeSecondaryConstructors() {
        java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor> constructorList = this.classProto.getConstructorList();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(constructorList, "classProto.constructorList");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : constructorList) {
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor it = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor) obj;
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField booleanFlagField = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.IS_SECONDARY;
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(it, "it");
            java.lang.Boolean bool = booleanFlagField.get(it.getFlags());
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(bool, "Flags.IS_SECONDARY.get(it.flags)");
            if (bool.booleanValue()) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor> arrayList2 = arrayList;
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        for (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor it2 : arrayList2) {
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer memberDeserializer = this.c.getMemberDeserializer();
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(it2, "it");
            arrayList3.add(memberDeserializer.loadConstructor(it2, false));
        }
        return arrayList3;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor> getConstructors() {
        return this.constructors.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor computeCompanionObjectDescriptor() {
        if (!this.classProto.hasCompanionObjectName()) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor classifierDescriptorMo1270getContributedClassifier = this.memberScope.mo1270getContributedClassifier(kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt.getName(this.c.getNameResolver(), this.classProto.getCompanionObjectName()), kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation.FROM_DESERIALIZATION);
        return (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) (classifierDescriptorMo1270getContributedClassifier instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor ? classifierDescriptorMo1270getContributedClassifier : null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    /* JADX INFO: renamed from: getCompanionObjectDescriptor */
    public kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor mo1261getCompanionObjectDescriptor() {
        return this.companionObjectDescriptor.invoke();
    }

    public final boolean hasNestedClass$deserialization(kotlin.reflect.jvm.internal.impl.name.Name name) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(name, "name");
        return this.memberScope.getClassNames$deserialization().contains(name);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor> computeSubclassesForSealedClass() {
        if (this.modality != kotlin.reflect.jvm.internal.impl.descriptors.Modality.SEALED) {
            return kotlin.collections.CollectionsKt.emptyList();
        }
        java.util.List<java.lang.Integer> fqNames = this.classProto.getSealedSubclassFqNameList();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(fqNames, "fqNames");
        if (!(!fqNames.isEmpty())) {
            return kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.computeSealedSubclasses(this);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Integer index : fqNames) {
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents components = this.c.getComponents();
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver nameResolver = this.c.getNameResolver();
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(index, "index");
            kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptorDeserializeClass = components.deserializeClass(kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt.getClassId(nameResolver, index.intValue()));
            if (classDescriptorDeserializeClass != null) {
                arrayList.add(classDescriptorDeserializeClass);
            }
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor> getSealedSubclasses() {
        return this.sealedSubclasses.invoke();
    }

    public java.lang.String toString() {
        return "deserialized class " + getName();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource
    public kotlin.reflect.jvm.internal.impl.descriptors.SourceElement getSource() {
        return this.sourceElement;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
    public java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> getDeclaredTypeParameters() {
        return this.c.getTypeDeserializer().getOwnTypeParameters();
    }

    /* JADX INFO: compiled from: DeserializedClassDescriptor.kt */
    private final class DeserializedClassTypeConstructor extends kotlin.reflect.jvm.internal.impl.types.AbstractClassTypeConstructor {
        private final kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue<java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor>> parameters;

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        public boolean isDenotable() {
            return true;
        }

        public DeserializedClassTypeConstructor() {
            super(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor.this.getC().getStorageManager());
            this.parameters = kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor.this.getC().getStorageManager().createLazyValue(new kotlin.jvm.functions.Function0<java.util.List<? extends kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$DeserializedClassTypeConstructor$parameters$1
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final java.util.List<? extends kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> invoke() {
                    return kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterUtilsKt.computeConstructorTypeParameters(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor.this);
                }
            });
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
        protected java.util.Collection<kotlin.reflect.jvm.internal.impl.types.KotlinType> computeSupertypes() {
            java.lang.String strAsString;
            kotlin.reflect.jvm.internal.impl.name.FqName fqNameAsSingleFqName;
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type> listSupertypes = kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt.supertypes(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor.this.getClassProto(), kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor.this.getC().getTypeTable());
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(listSupertypes, 10));
            java.util.Iterator<T> it = listSupertypes.iterator();
            while (it.hasNext()) {
                arrayList.add(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor.this.getC().getTypeDeserializer().type((kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type) it.next()));
            }
            java.util.List listPlus = kotlin.collections.CollectionsKt.plus((java.util.Collection) arrayList, (java.lang.Iterable) kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor.this.getC().getComponents().getAdditionalClassPartsProvider().getSupertypes(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor.this));
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator it2 = listPlus.iterator();
            while (it2.hasNext()) {
                kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor classifierDescriptorMo1268getDeclarationDescriptor = ((kotlin.reflect.jvm.internal.impl.types.KotlinType) it2.next()).getConstructor().mo1268getDeclarationDescriptor();
                if (!(classifierDescriptorMo1268getDeclarationDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses.MockClassDescriptor)) {
                    classifierDescriptorMo1268getDeclarationDescriptor = null;
                }
                kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses.MockClassDescriptor mockClassDescriptor = (kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses.MockClassDescriptor) classifierDescriptorMo1268getDeclarationDescriptor;
                if (mockClassDescriptor != null) {
                    arrayList2.add(mockClassDescriptor);
                }
            }
            java.util.ArrayList arrayList3 = arrayList2;
            if (!arrayList3.isEmpty()) {
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter errorReporter = kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor.this.getC().getComponents().getErrorReporter();
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor deserializedClassDescriptor = kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor.this;
                java.util.ArrayList<kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses.MockClassDescriptor> arrayList4 = arrayList3;
                java.util.ArrayList arrayList5 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList4, 10));
                for (kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses.MockClassDescriptor mockClassDescriptor2 : arrayList4) {
                    kotlin.reflect.jvm.internal.impl.name.ClassId classId = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getClassId(mockClassDescriptor2);
                    if (classId == null || (fqNameAsSingleFqName = classId.asSingleFqName()) == null || (strAsString = fqNameAsSingleFqName.asString()) == null) {
                        strAsString = mockClassDescriptor2.getName().asString();
                    }
                    arrayList5.add(strAsString);
                }
                errorReporter.reportIncompleteHierarchy(deserializedClassDescriptor, arrayList5);
            }
            return kotlin.collections.CollectionsKt.toList(listPlus);
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        public java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> getParameters() {
            return this.parameters.invoke();
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractClassTypeConstructor, kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        /* JADX INFO: renamed from: getDeclarationDescriptor */
        public kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor mo1268getDeclarationDescriptor() {
            return kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor.this;
        }

        public java.lang.String toString() {
            java.lang.String string = kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor.this.getName().toString();
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(string, "name.toString()");
            return string;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
        protected kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker getSupertypeLoopChecker() {
            return kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker.EMPTY.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: DeserializedClassDescriptor.kt */
    private final class DeserializedClassMemberScope extends kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope {
        private final kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue<java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor>> allDescriptors;

        public DeserializedClassMemberScope() {
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext c = kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor.this.getC();
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function> functionList = kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor.this.getClassProto().getFunctionList();
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(functionList, "classProto.functionList");
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function> list = functionList;
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property> propertyList = kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor.this.getClassProto().getPropertyList();
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(propertyList, "classProto.propertyList");
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property> list2 = propertyList;
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias> typeAliasList = kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor.this.getClassProto().getTypeAliasList();
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(typeAliasList, "classProto.typeAliasList");
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias> list3 = typeAliasList;
            java.util.List<java.lang.Integer> nestedClassNameList = kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor.this.getClassProto().getNestedClassNameList();
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(nestedClassNameList, "classProto.nestedClassNameList");
            java.util.List<java.lang.Integer> list4 = nestedClassNameList;
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver nameResolver = kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor.this.getC().getNameResolver();
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list4, 10));
            java.util.Iterator<T> it = list4.iterator();
            while (it.hasNext()) {
                arrayList.add(kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt.getName(nameResolver, ((java.lang.Number) it.next()).intValue()));
            }
            final java.util.ArrayList arrayList2 = arrayList;
            super(c, list, list2, list3, new kotlin.jvm.functions.Function0<java.util.List<? extends kotlin.reflect.jvm.internal.impl.name.Name>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$DeserializedClassMemberScope$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final java.util.List<? extends kotlin.reflect.jvm.internal.impl.name.Name> invoke() {
                    return arrayList2;
                }
            });
            this.allDescriptors = getC().getStorageManager().createLazyValue(new kotlin.jvm.functions.Function0<java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$DeserializedClassMemberScope$allDescriptors$1
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor> invoke() {
                    return this.this$0.computeDescriptors(kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter.ALL, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope.Companion.getALL_NAME_FILTER(), kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation.WHEN_GET_ALL_DESCRIPTORS);
                }
            });
        }

        private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor getClassDescriptor() {
            return kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor.this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
        public java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor> getContributedDescriptors(kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter kindFilter, kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.Name, java.lang.Boolean> nameFilter) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(kindFilter, "kindFilter");
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(nameFilter, "nameFilter");
            return this.allDescriptors.invoke();
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
        public java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> getContributedFunctions(kotlin.reflect.jvm.internal.impl.name.Name name, kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation location) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(name, "name");
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(location, "location");
            recordLookup(name, location);
            return super.getContributedFunctions(name, location);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
        public java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor> getContributedVariables(kotlin.reflect.jvm.internal.impl.name.Name name, kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation location) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(name, "name");
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(location, "location");
            recordLookup(name, location);
            return super.getContributedVariables(name, location);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
        protected void computeNonDeclaredFunctions(kotlin.reflect.jvm.internal.impl.name.Name name, java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> functions) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(name, "name");
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(functions, "functions");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator<kotlin.reflect.jvm.internal.impl.types.KotlinType> it = getClassDescriptor().getTypeConstructor().mo1269getSupertypes().iterator();
            while (it.hasNext()) {
                arrayList.addAll(it.next().getMemberScope().getContributedFunctions(name, kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation.FOR_ALREADY_TRACKED));
            }
            kotlin.collections.CollectionsKt.retainAll(functions, new kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor, java.lang.Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$DeserializedClassMemberScope$computeNonDeclaredFunctions$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ java.lang.Boolean invoke(kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor simpleFunctionDescriptor) {
                    return java.lang.Boolean.valueOf(invoke2(simpleFunctionDescriptor));
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final boolean invoke2(kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor it2) {
                    kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(it2, "it");
                    return this.this$0.getC().getComponents().getPlatformDependentDeclarationFilter().isFunctionAvailable(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor.this, it2);
                }
            });
            functions.addAll(getC().getComponents().getAdditionalClassPartsProvider().getFunctions(name, kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor.this));
            generateFakeOverrides(name, arrayList, functions);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
        protected void computeNonDeclaredProperties(kotlin.reflect.jvm.internal.impl.name.Name name, java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor> descriptors) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(name, "name");
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(descriptors, "descriptors");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator<kotlin.reflect.jvm.internal.impl.types.KotlinType> it = getClassDescriptor().getTypeConstructor().mo1269getSupertypes().iterator();
            while (it.hasNext()) {
                arrayList.addAll(it.next().getMemberScope().getContributedVariables(name, kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation.FOR_ALREADY_TRACKED));
            }
            generateFakeOverrides(name, arrayList, descriptors);
        }

        private final <D extends kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor> void generateFakeOverrides(kotlin.reflect.jvm.internal.impl.name.Name name, java.util.Collection<? extends D> collection, final java.util.Collection<D> collection2) {
            kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.generateOverridesInFunctionGroup(name, collection, new java.util.ArrayList(collection2), getClassDescriptor(), new kotlin.reflect.jvm.internal.impl.resolve.NonReportingOverrideStrategy() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$DeserializedClassMemberScope$generateFakeOverrides$1
                @Override // kotlin.reflect.jvm.internal.impl.resolve.NonReportingOverrideStrategy
                protected void conflict(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor fromSuper, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor fromCurrent) {
                    kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(fromSuper, "fromSuper");
                    kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(fromCurrent, "fromCurrent");
                }

                @Override // kotlin.reflect.jvm.internal.impl.resolve.OverridingStrategy
                public void addFakeOverride(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor fakeOverride) {
                    kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(fakeOverride, "fakeOverride");
                    kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.resolveUnknownVisibilityForMember(fakeOverride, null);
                    collection2.add(fakeOverride);
                }
            });
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
        protected java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name> getNonDeclaredFunctionNames() {
            java.util.List supertypes = getClassDescriptor().typeConstructor.mo1269getSupertypes();
            java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
            java.util.Iterator it = supertypes.iterator();
            while (it.hasNext()) {
                kotlin.collections.CollectionsKt.addAll(linkedHashSet, ((kotlin.reflect.jvm.internal.impl.types.KotlinType) it.next()).getMemberScope().getFunctionNames());
            }
            linkedHashSet.addAll(getC().getComponents().getAdditionalClassPartsProvider().getFunctionsNames(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor.this));
            return linkedHashSet;
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
        protected java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name> getNonDeclaredVariableNames() {
            java.util.List supertypes = getClassDescriptor().typeConstructor.mo1269getSupertypes();
            java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
            java.util.Iterator it = supertypes.iterator();
            while (it.hasNext()) {
                kotlin.collections.CollectionsKt.addAll(linkedHashSet, ((kotlin.reflect.jvm.internal.impl.types.KotlinType) it.next()).getMemberScope().getVariableNames());
            }
            return linkedHashSet;
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
        /* JADX INFO: renamed from: getContributedClassifier */
        public kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor mo1270getContributedClassifier(kotlin.reflect.jvm.internal.impl.name.Name name, kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation location) {
            kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptorFindEnumEntry;
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(name, "name");
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(location, "location");
            recordLookup(name, location);
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor.EnumEntryClassDescriptors enumEntryClassDescriptors = getClassDescriptor().enumEntries;
            return (enumEntryClassDescriptors == null || (classDescriptorFindEnumEntry = enumEntryClassDescriptors.findEnumEntry(name)) == null) ? super.mo1270getContributedClassifier(name, location) : classDescriptorFindEnumEntry;
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
        protected kotlin.reflect.jvm.internal.impl.name.ClassId createClassId(kotlin.reflect.jvm.internal.impl.name.Name name) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(name, "name");
            kotlin.reflect.jvm.internal.impl.name.ClassId classIdCreateNestedClassId = kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor.this.classId.createNestedClassId(name);
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(classIdCreateNestedClassId, "classId.createNestedClassId(name)");
            return classIdCreateNestedClassId;
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
        protected void addEnumEntryDescriptors(java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor> result, kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.Name, java.lang.Boolean> nameFilter) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(result, "result");
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(nameFilter, "nameFilter");
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor.EnumEntryClassDescriptors enumEntryClassDescriptors = getClassDescriptor().enumEntries;
            java.util.List listAll = enumEntryClassDescriptors != null ? enumEntryClassDescriptors.all() : null;
            if (listAll == null) {
                listAll = kotlin.collections.CollectionsKt.emptyList();
            }
            result.addAll(listAll);
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl
        public void recordLookup(kotlin.reflect.jvm.internal.impl.name.Name name, kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation location) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(name, "name");
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(location, "location");
            kotlin.reflect.jvm.internal.impl.incremental.UtilsKt.record(getC().getComponents().getLookupTracker(), location, getClassDescriptor(), name);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: DeserializedClassDescriptor.kt */
    final class EnumEntryClassDescriptors {
        private final kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable<kotlin.reflect.jvm.internal.impl.name.Name, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor> enumEntryByName;
        private final java.util.Map<kotlin.reflect.jvm.internal.impl.name.Name, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry> enumEntryProtos;
        private final kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue<java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name>> enumMemberNames;

        public EnumEntryClassDescriptors() {
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry> enumEntryList = kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor.this.getClassProto().getEnumEntryList();
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(enumEntryList, "classProto.enumEntryList");
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry> list = enumEntryList;
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kotlin.ranges.RangesKt.coerceAtLeast(kotlin.collections.MapsKt.mapCapacity(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10)), 16));
            for (java.lang.Object obj : list) {
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry it = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry) obj;
                kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver nameResolver = kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor.this.getC().getNameResolver();
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(it, "it");
                linkedHashMap.put(kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt.getName(nameResolver, it.getName()), obj);
            }
            this.enumEntryProtos = linkedHashMap;
            this.enumEntryByName = kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor.this.getC().getStorageManager().createMemoizedFunctionWithNullableValues(new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$EnumEntryClassDescriptors$enumEntryByName$1(this));
            this.enumMemberNames = kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor.this.getC().getStorageManager().createLazyValue(new kotlin.jvm.functions.Function0<java.util.Set<? extends kotlin.reflect.jvm.internal.impl.name.Name>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$EnumEntryClassDescriptors$enumMemberNames$1
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final java.util.Set<? extends kotlin.reflect.jvm.internal.impl.name.Name> invoke() {
                    return this.this$0.computeEnumMemberNames();
                }
            });
        }

        public final kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor findEnumEntry(kotlin.reflect.jvm.internal.impl.name.Name name) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(name, "name");
            return this.enumEntryByName.invoke(name);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name> computeEnumMemberNames() {
            java.util.HashSet hashSet = new java.util.HashSet();
            java.util.Iterator<kotlin.reflect.jvm.internal.impl.types.KotlinType> it = kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor.this.getTypeConstructor().mo1269getSupertypes().iterator();
            while (it.hasNext()) {
                for (kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor : kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope.DefaultImpls.getContributedDescriptors$default(it.next().getMemberScope(), null, null, 3, null)) {
                    if ((declarationDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor) || (declarationDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor)) {
                        hashSet.add(declarationDescriptor.getName());
                    }
                }
            }
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function> functionList = kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor.this.getClassProto().getFunctionList();
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(functionList, "classProto.functionList");
            for (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function it2 : functionList) {
                kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver nameResolver = kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor.this.getC().getNameResolver();
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(it2, "it");
                hashSet.add(kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt.getName(nameResolver, it2.getName()));
            }
            java.util.HashSet hashSet2 = hashSet;
            java.util.HashSet hashSet3 = hashSet2;
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property> propertyList = kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor.this.getClassProto().getPropertyList();
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(propertyList, "classProto.propertyList");
            for (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property it3 : propertyList) {
                kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver nameResolver2 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor.this.getC().getNameResolver();
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(it3, "it");
                hashSet2.add(kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt.getName(nameResolver2, it3.getName()));
            }
            return kotlin.collections.SetsKt.plus((java.util.Set) hashSet3, (java.lang.Iterable) hashSet2);
        }

        public final java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor> all() {
            java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name> setKeySet = this.enumEntryProtos.keySet();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator<T> it = setKeySet.iterator();
            while (it.hasNext()) {
                kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptorFindEnumEntry = findEnumEntry((kotlin.reflect.jvm.internal.impl.name.Name) it.next());
                if (classDescriptorFindEnumEntry != null) {
                    arrayList.add(classDescriptorFindEnumEntry);
                }
            }
            return arrayList;
        }
    }
}
