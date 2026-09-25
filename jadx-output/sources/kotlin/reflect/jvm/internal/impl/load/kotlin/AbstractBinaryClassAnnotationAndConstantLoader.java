package kotlin.reflect.jvm.internal.impl.load.kotlin;

/* JADX INFO: compiled from: AbstractBinaryClassAnnotationAndConstantLoader.kt */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractBinaryClassAnnotationAndConstantLoader<A, C> implements kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationAndConstantLoader<A, C> {
    public static final kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.Companion Companion = new kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.Companion(null);
    private static final java.util.Set<kotlin.reflect.jvm.internal.impl.name.ClassId> SPECIAL_ANNOTATIONS;
    private final kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder kotlinClassFinder;
    private final kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull<kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass, kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.Storage<A, C>> storage;

    /* JADX INFO: compiled from: AbstractBinaryClassAnnotationAndConstantLoader.kt */
    private enum PropertyRelatedElement {
        PROPERTY,
        BACKING_FIELD,
        DELEGATE_FIELD
    }

    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind.PROPERTY_GETTER.ordinal()] = 1;
            iArr[kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind.PROPERTY_SETTER.ordinal()] = 2;
            iArr[kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind.PROPERTY.ordinal()] = 3;
        }
    }

    protected byte[] getCachedFileContent(kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass kotlinClass) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(kotlinClass, "kotlinClass");
        return null;
    }

    protected abstract kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor loadAnnotation(kotlin.reflect.jvm.internal.impl.name.ClassId classId, kotlin.reflect.jvm.internal.impl.descriptors.SourceElement sourceElement, java.util.List<A> list);

    protected abstract C loadConstant(java.lang.String str, java.lang.Object obj);

    protected abstract A loadTypeAnnotation(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation annotation, kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver nameResolver);

    protected abstract C transformToUnsignedConstant(C c);

    public AbstractBinaryClassAnnotationAndConstantLoader(kotlin.reflect.jvm.internal.impl.storage.StorageManager storageManager, kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder kotlinClassFinder) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(storageManager, "storageManager");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(kotlinClassFinder, "kotlinClassFinder");
        this.kotlinClassFinder = kotlinClassFinder;
        this.storage = storageManager.createMemoizedFunction(new kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass, kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.Storage<? extends A, ? extends C>>() { // from class: kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader$storage$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.Storage<A, C> invoke(kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass kotlinClass) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(kotlinClass, "kotlinClass");
                return this.this$0.loadAnnotationsAndInitializers(kotlinClass);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor loadAnnotationIfNotSpecial(kotlin.reflect.jvm.internal.impl.name.ClassId classId, kotlin.reflect.jvm.internal.impl.descriptors.SourceElement sourceElement, java.util.List<A> list) {
        if (SPECIAL_ANNOTATIONS.contains(classId)) {
            return null;
        }
        return loadAnnotation(classId, sourceElement, list);
    }

    private final kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass toBinaryClass(kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer.Class r3) {
        kotlin.reflect.jvm.internal.impl.descriptors.SourceElement source = r3.getSource();
        if (!(source instanceof kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinarySourceElement)) {
            source = null;
        }
        kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinarySourceElement kotlinJvmBinarySourceElement = (kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinarySourceElement) source;
        if (kotlinJvmBinarySourceElement != null) {
            return kotlinJvmBinarySourceElement.getBinaryClass();
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationAndConstantLoader
    public java.util.List<A> loadClassAnnotations(kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer.Class container) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(container, "container");
        kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass binaryClass = toBinaryClass(container);
        if (binaryClass == null) {
            throw new java.lang.IllegalStateException(("Class for loading annotations is not found: " + container.debugFqName()).toString());
        }
        final java.util.ArrayList arrayList = new java.util.ArrayList(1);
        binaryClass.loadClassAnnotations(new kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationVisitor() { // from class: kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.loadClassAnnotations.1
            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationVisitor
            public void visitEnd() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationVisitor
            public kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor visitAnnotation(kotlin.reflect.jvm.internal.impl.name.ClassId classId, kotlin.reflect.jvm.internal.impl.descriptors.SourceElement source) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(classId, "classId");
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(source, "source");
                return kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.this.loadAnnotationIfNotSpecial(classId, source, arrayList);
            }
        }, getCachedFileContent(binaryClass));
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationAndConstantLoader
    public java.util.List<A> loadCallableAnnotations(kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer container, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite proto, kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind kind) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(container, "container");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(proto, "proto");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(kind, "kind");
        if (kind == kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind.PROPERTY) {
            return loadPropertyAnnotations(container, (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property) proto, kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.PropertyRelatedElement.PROPERTY);
        }
        kotlin.reflect.jvm.internal.impl.load.kotlin.MemberSignature callableSignature$default = getCallableSignature$default(this, proto, container.getNameResolver(), container.getTypeTable(), kind, false, 16, null);
        if (callableSignature$default == null) {
            return kotlin.collections.CollectionsKt.emptyList();
        }
        return findClassAndLoadMemberAnnotations$default(this, container, callableSignature$default, false, false, null, false, 60, null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationAndConstantLoader
    public java.util.List<A> loadPropertyBackingFieldAnnotations(kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer container, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property proto) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(container, "container");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(proto, "proto");
        return loadPropertyAnnotations(container, proto, kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.PropertyRelatedElement.BACKING_FIELD);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationAndConstantLoader
    public java.util.List<A> loadPropertyDelegateFieldAnnotations(kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer container, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property proto) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(container, "container");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(proto, "proto");
        return loadPropertyAnnotations(container, proto, kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.PropertyRelatedElement.DELEGATE_FIELD);
    }

    private final java.util.List<A> loadPropertyAnnotations(kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer protoContainer, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property property, kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.PropertyRelatedElement propertyRelatedElement) {
        java.lang.Boolean bool = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.IS_CONST.get(property.getFlags());
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(bool, "Flags.IS_CONST.get(proto.flags)");
        boolean zBooleanValue = bool.booleanValue();
        boolean zIsMovedFromInterfaceCompanion = kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil.isMovedFromInterfaceCompanion(property);
        if (propertyRelatedElement == kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.PropertyRelatedElement.PROPERTY) {
            kotlin.reflect.jvm.internal.impl.load.kotlin.MemberSignature propertySignature$default = getPropertySignature$default(this, property, protoContainer.getNameResolver(), protoContainer.getTypeTable(), false, true, false, 40, null);
            if (propertySignature$default == null) {
                return kotlin.collections.CollectionsKt.emptyList();
            }
            return findClassAndLoadMemberAnnotations$default(this, protoContainer, propertySignature$default, true, false, java.lang.Boolean.valueOf(zBooleanValue), zIsMovedFromInterfaceCompanion, 8, null);
        }
        kotlin.reflect.jvm.internal.impl.load.kotlin.MemberSignature propertySignature$default2 = getPropertySignature$default(this, property, protoContainer.getNameResolver(), protoContainer.getTypeTable(), true, false, false, 48, null);
        if (propertySignature$default2 != null) {
            return kotlin.text.StringsKt.contains$default((java.lang.CharSequence) propertySignature$default2.getSignature$descriptors_jvm(), (java.lang.CharSequence) "$delegate", false, 2, (java.lang.Object) null) != (propertyRelatedElement == kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.PropertyRelatedElement.DELEGATE_FIELD) ? kotlin.collections.CollectionsKt.emptyList() : findClassAndLoadMemberAnnotations(protoContainer, propertySignature$default2, true, true, java.lang.Boolean.valueOf(zBooleanValue), zIsMovedFromInterfaceCompanion);
        }
        return kotlin.collections.CollectionsKt.emptyList();
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationAndConstantLoader
    public java.util.List<A> loadEnumEntryAnnotations(kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer container, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry proto) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(container, "container");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(proto, "proto");
        kotlin.reflect.jvm.internal.impl.load.kotlin.MemberSignature.Companion companion = kotlin.reflect.jvm.internal.impl.load.kotlin.MemberSignature.Companion;
        java.lang.String string = container.getNameResolver().getString(proto.getName());
        java.lang.String strAsString = ((kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer.Class) container).getClassId().asString();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(strAsString, "(container as ProtoConta…Class).classId.asString()");
        return findClassAndLoadMemberAnnotations$default(this, container, companion.fromFieldNameAndDesc(string, kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.ClassMapperLite.mapClass(strAsString)), false, false, null, false, 60, null);
    }

    static /* synthetic */ java.util.List findClassAndLoadMemberAnnotations$default(kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader abstractBinaryClassAnnotationAndConstantLoader, kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer protoContainer, kotlin.reflect.jvm.internal.impl.load.kotlin.MemberSignature memberSignature, boolean z, boolean z2, java.lang.Boolean bool, boolean z3, int i, java.lang.Object obj) {
        if (obj == null) {
            return abstractBinaryClassAnnotationAndConstantLoader.findClassAndLoadMemberAnnotations(protoContainer, memberSignature, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? (java.lang.Boolean) null : bool, (i & 32) != 0 ? false : z3);
        }
        throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: findClassAndLoadMemberAnnotations");
    }

    private final java.util.List<A> findClassAndLoadMemberAnnotations(kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer protoContainer, kotlin.reflect.jvm.internal.impl.load.kotlin.MemberSignature memberSignature, boolean z, boolean z2, java.lang.Boolean bool, boolean z3) {
        kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass kotlinJvmBinaryClassFindClassWithAnnotationsAndInitializers = findClassWithAnnotationsAndInitializers(protoContainer, getSpecialCaseContainerClass(protoContainer, z, z2, bool, z3));
        if (kotlinJvmBinaryClassFindClassWithAnnotationsAndInitializers == null) {
            return kotlin.collections.CollectionsKt.emptyList();
        }
        java.util.List<A> list = this.storage.invoke(kotlinJvmBinaryClassFindClassWithAnnotationsAndInitializers).getMemberAnnotations().get(memberSignature);
        return list != null ? list : kotlin.collections.CollectionsKt.emptyList();
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationAndConstantLoader
    public java.util.List<A> loadValueParameterAnnotations(kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer container, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite callableProto, kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind kind, int i, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter proto) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(container, "container");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(callableProto, "callableProto");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(kind, "kind");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(proto, "proto");
        kotlin.reflect.jvm.internal.impl.load.kotlin.MemberSignature callableSignature$default = getCallableSignature$default(this, callableProto, container.getNameResolver(), container.getTypeTable(), kind, false, 16, null);
        if (callableSignature$default != null) {
            return findClassAndLoadMemberAnnotations$default(this, container, kotlin.reflect.jvm.internal.impl.load.kotlin.MemberSignature.Companion.fromMethodSignatureAndParameterIndex(callableSignature$default, i + computeJvmParameterIndexShift(container, callableProto)), false, false, null, false, 60, null);
        }
        return kotlin.collections.CollectionsKt.emptyList();
    }

    private final int computeJvmParameterIndexShift(kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer protoContainer, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite messageLite) {
        if (messageLite instanceof kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function) {
            if (kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt.hasReceiver((kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function) messageLite)) {
                return 1;
            }
        } else if (messageLite instanceof kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property) {
            if (kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt.hasReceiver((kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property) messageLite)) {
                return 1;
            }
        } else {
            if (!(messageLite instanceof kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor)) {
                throw new java.lang.UnsupportedOperationException("Unsupported message: " + messageLite.getClass());
            }
            if (protoContainer != null) {
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer.Class r4 = (kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer.Class) protoContainer;
                if (r4.getKind() == kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.Kind.ENUM_CLASS) {
                    return 2;
                }
                if (r4.isInner()) {
                    return 1;
                }
            } else {
                throw new kotlin.TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.serialization.deserialization.ProtoContainer.Class");
            }
        }
        return 0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationAndConstantLoader
    public java.util.List<A> loadExtensionReceiverParameterAnnotations(kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer container, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite proto, kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind kind) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(container, "container");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(proto, "proto");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(kind, "kind");
        kotlin.reflect.jvm.internal.impl.load.kotlin.MemberSignature callableSignature$default = getCallableSignature$default(this, proto, container.getNameResolver(), container.getTypeTable(), kind, false, 16, null);
        if (callableSignature$default != null) {
            return findClassAndLoadMemberAnnotations$default(this, container, kotlin.reflect.jvm.internal.impl.load.kotlin.MemberSignature.Companion.fromMethodSignatureAndParameterIndex(callableSignature$default, 0), false, false, null, false, 60, null);
        }
        return kotlin.collections.CollectionsKt.emptyList();
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationAndConstantLoader
    public java.util.List<A> loadTypeAnnotations(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type proto, kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver nameResolver) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(proto, "proto");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(nameResolver, "nameResolver");
        java.lang.Object extension = proto.getExtension(kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.typeAnnotation);
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(extension, "proto.getExtension(JvmProtoBuf.typeAnnotation)");
        java.lang.Iterable<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation> iterable = (java.lang.Iterable) extension;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(iterable, 10));
        for (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation it : iterable) {
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(it, "it");
            arrayList.add(loadTypeAnnotation(it, nameResolver));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationAndConstantLoader
    public java.util.List<A> loadTypeParameterAnnotations(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter proto, kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver nameResolver) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(proto, "proto");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(nameResolver, "nameResolver");
        java.lang.Object extension = proto.getExtension(kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.typeParameterAnnotation);
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(extension, "proto.getExtension(JvmPr….typeParameterAnnotation)");
        java.lang.Iterable<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation> iterable = (java.lang.Iterable) extension;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(iterable, 10));
        for (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation it : iterable) {
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(it, "it");
            arrayList.add(loadTypeAnnotation(it, nameResolver));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationAndConstantLoader
    public C loadPropertyConstant(kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer container, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property proto, kotlin.reflect.jvm.internal.impl.types.KotlinType expectedType) {
        C c;
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(container, "container");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(proto, "proto");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(expectedType, "expectedType");
        kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass kotlinJvmBinaryClassFindClassWithAnnotationsAndInitializers = findClassWithAnnotationsAndInitializers(container, getSpecialCaseContainerClass(container, true, true, kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.IS_CONST.get(proto.getFlags()), kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil.isMovedFromInterfaceCompanion(proto)));
        if (kotlinJvmBinaryClassFindClassWithAnnotationsAndInitializers != null) {
            kotlin.reflect.jvm.internal.impl.load.kotlin.MemberSignature callableSignature = getCallableSignature(proto, container.getNameResolver(), container.getTypeTable(), kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind.PROPERTY, kotlinJvmBinaryClassFindClassWithAnnotationsAndInitializers.getClassHeader().getMetadataVersion().isAtLeast(kotlin.reflect.jvm.internal.impl.load.kotlin.DeserializedDescriptorResolver.Companion.getKOTLIN_1_3_RC_METADATA_VERSION$descriptors_jvm()));
            if (callableSignature != null && (c = this.storage.invoke(kotlinJvmBinaryClassFindClassWithAnnotationsAndInitializers).getPropertyConstants().get(callableSignature)) != null) {
                return kotlin.reflect.jvm.internal.impl.builtins.UnsignedTypes.INSTANCE.isUnsignedType(expectedType) ? transformToUnsignedConstant(c) : c;
            }
        }
        return null;
    }

    private final kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass findClassWithAnnotationsAndInitializers(kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer protoContainer, kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass kotlinJvmBinaryClass) {
        if (kotlinJvmBinaryClass != null) {
            return kotlinJvmBinaryClass;
        }
        if (protoContainer instanceof kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer.Class) {
            return toBinaryClass((kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer.Class) protoContainer);
        }
        return null;
    }

    private final kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass getSpecialCaseContainerClass(kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer protoContainer, boolean z, boolean z2, java.lang.Boolean bool, boolean z3) {
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer.Class outerClass;
        if (z) {
            if (bool == null) {
                throw new java.lang.IllegalStateException(("isConst should not be null for property (container=" + protoContainer + ')').toString());
            }
            if (protoContainer instanceof kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer.Class) {
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer.Class r8 = (kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer.Class) protoContainer;
                if (r8.getKind() == kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.Kind.INTERFACE) {
                    kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder kotlinClassFinder = this.kotlinClassFinder;
                    kotlin.reflect.jvm.internal.impl.name.ClassId classIdCreateNestedClassId = r8.getClassId().createNestedClassId(kotlin.reflect.jvm.internal.impl.name.Name.identifier("DefaultImpls"));
                    kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(classIdCreateNestedClassId, "container.classId.create…EFAULT_IMPLS_CLASS_NAME))");
                    return kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinderKt.findKotlinClass(kotlinClassFinder, classIdCreateNestedClassId);
                }
            }
            if (bool.booleanValue() && (protoContainer instanceof kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer.Package)) {
                kotlin.reflect.jvm.internal.impl.descriptors.SourceElement source = protoContainer.getSource();
                if (!(source instanceof kotlin.reflect.jvm.internal.impl.load.kotlin.JvmPackagePartSource)) {
                    source = null;
                }
                kotlin.reflect.jvm.internal.impl.load.kotlin.JvmPackagePartSource jvmPackagePartSource = (kotlin.reflect.jvm.internal.impl.load.kotlin.JvmPackagePartSource) source;
                kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName facadeClassName = jvmPackagePartSource != null ? jvmPackagePartSource.getFacadeClassName() : null;
                if (facadeClassName != null) {
                    kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder kotlinClassFinder2 = this.kotlinClassFinder;
                    java.lang.String internalName = facadeClassName.getInternalName();
                    kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(internalName, "facadeClassName.internalName");
                    kotlin.reflect.jvm.internal.impl.name.ClassId classId = kotlin.reflect.jvm.internal.impl.name.ClassId.topLevel(new kotlin.reflect.jvm.internal.impl.name.FqName(kotlin.text.StringsKt.replace$default(internalName, '/', '.', false, 4, (java.lang.Object) null)));
                    kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(classId, "ClassId.topLevel(FqName(…lName.replace('/', '.')))");
                    return kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinderKt.findKotlinClass(kotlinClassFinder2, classId);
                }
            }
        }
        if (z2 && (protoContainer instanceof kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer.Class)) {
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer.Class r9 = (kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer.Class) protoContainer;
            if (r9.getKind() == kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.Kind.COMPANION_OBJECT && (outerClass = r9.getOuterClass()) != null && (outerClass.getKind() == kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.Kind.CLASS || outerClass.getKind() == kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.Kind.ENUM_CLASS || (z3 && (outerClass.getKind() == kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.Kind.INTERFACE || outerClass.getKind() == kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.Kind.ANNOTATION_CLASS)))) {
                return toBinaryClass(outerClass);
            }
        }
        if (!(protoContainer instanceof kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer.Package) || !(protoContainer.getSource() instanceof kotlin.reflect.jvm.internal.impl.load.kotlin.JvmPackagePartSource)) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.SourceElement source2 = protoContainer.getSource();
        if (source2 == null) {
            throw new kotlin.TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.load.kotlin.JvmPackagePartSource");
        }
        kotlin.reflect.jvm.internal.impl.load.kotlin.JvmPackagePartSource jvmPackagePartSource2 = (kotlin.reflect.jvm.internal.impl.load.kotlin.JvmPackagePartSource) source2;
        kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass knownJvmBinaryClass = jvmPackagePartSource2.getKnownJvmBinaryClass();
        return knownJvmBinaryClass != null ? knownJvmBinaryClass : kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinderKt.findKotlinClass(this.kotlinClassFinder, jvmPackagePartSource2.getClassId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.Storage<A, C> loadAnnotationsAndInitializers(kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass kotlinJvmBinaryClass) {
        final java.util.HashMap map = new java.util.HashMap();
        final java.util.HashMap map2 = new java.util.HashMap();
        kotlinJvmBinaryClass.visitMembers(new kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.MemberVisitor() { // from class: kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.loadAnnotationsAndInitializers.1
            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.MemberVisitor
            public kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.MethodAnnotationVisitor visitMethod(kotlin.reflect.jvm.internal.impl.name.Name name, java.lang.String desc) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(name, "name");
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(desc, "desc");
                kotlin.reflect.jvm.internal.impl.load.kotlin.MemberSignature.Companion companion = kotlin.reflect.jvm.internal.impl.load.kotlin.MemberSignature.Companion;
                java.lang.String strAsString = name.asString();
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(strAsString, "name.asString()");
                return new kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.AnonymousClass1.AnnotationVisitorForMethod(this, companion.fromMethodNameAndDesc(strAsString, desc));
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.MemberVisitor
            public kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationVisitor visitField(kotlin.reflect.jvm.internal.impl.name.Name name, java.lang.String desc, java.lang.Object obj) {
                java.lang.Object objLoadConstant;
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(name, "name");
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(desc, "desc");
                kotlin.reflect.jvm.internal.impl.load.kotlin.MemberSignature.Companion companion = kotlin.reflect.jvm.internal.impl.load.kotlin.MemberSignature.Companion;
                java.lang.String strAsString = name.asString();
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(strAsString, "name.asString()");
                kotlin.reflect.jvm.internal.impl.load.kotlin.MemberSignature memberSignatureFromFieldNameAndDesc = companion.fromFieldNameAndDesc(strAsString, desc);
                if (obj != null && (objLoadConstant = kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.this.loadConstant(desc, obj)) != null) {
                    map2.put(memberSignatureFromFieldNameAndDesc, objLoadConstant);
                }
                return new kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.AnonymousClass1.MemberAnnotationVisitor(this, memberSignatureFromFieldNameAndDesc);
            }

            /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader$loadAnnotationsAndInitializers$1$AnnotationVisitorForMethod */
            /* JADX INFO: compiled from: AbstractBinaryClassAnnotationAndConstantLoader.kt */
            public final class AnnotationVisitorForMethod extends kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.AnonymousClass1.MemberAnnotationVisitor implements kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.MethodAnnotationVisitor {
                final /* synthetic */ kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.AnonymousClass1 this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnnotationVisitorForMethod(kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.AnonymousClass1 anonymousClass1, kotlin.reflect.jvm.internal.impl.load.kotlin.MemberSignature signature) {
                    super(anonymousClass1, signature);
                    kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(signature, "signature");
                    this.this$0 = anonymousClass1;
                }

                @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.MethodAnnotationVisitor
                public kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor visitParameterAnnotation(int i, kotlin.reflect.jvm.internal.impl.name.ClassId classId, kotlin.reflect.jvm.internal.impl.descriptors.SourceElement source) {
                    kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(classId, "classId");
                    kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(source, "source");
                    kotlin.reflect.jvm.internal.impl.load.kotlin.MemberSignature memberSignatureFromMethodSignatureAndParameterIndex = kotlin.reflect.jvm.internal.impl.load.kotlin.MemberSignature.Companion.fromMethodSignatureAndParameterIndex(getSignature(), i);
                    java.util.ArrayList arrayList = (java.util.List) map.get(memberSignatureFromMethodSignatureAndParameterIndex);
                    if (arrayList == null) {
                        arrayList = new java.util.ArrayList();
                        map.put(memberSignatureFromMethodSignatureAndParameterIndex, arrayList);
                    }
                    return kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.this.loadAnnotationIfNotSpecial(classId, source, arrayList);
                }
            }

            /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader$loadAnnotationsAndInitializers$1$MemberAnnotationVisitor */
            /* JADX INFO: compiled from: AbstractBinaryClassAnnotationAndConstantLoader.kt */
            public class MemberAnnotationVisitor implements kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationVisitor {
                private final java.util.ArrayList<A> result;
                private final kotlin.reflect.jvm.internal.impl.load.kotlin.MemberSignature signature;
                final /* synthetic */ kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.AnonymousClass1 this$0;

                public MemberAnnotationVisitor(kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.AnonymousClass1 anonymousClass1, kotlin.reflect.jvm.internal.impl.load.kotlin.MemberSignature signature) {
                    kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(signature, "signature");
                    this.this$0 = anonymousClass1;
                    this.signature = signature;
                    this.result = new java.util.ArrayList<>();
                }

                protected final kotlin.reflect.jvm.internal.impl.load.kotlin.MemberSignature getSignature() {
                    return this.signature;
                }

                @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationVisitor
                public kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor visitAnnotation(kotlin.reflect.jvm.internal.impl.name.ClassId classId, kotlin.reflect.jvm.internal.impl.descriptors.SourceElement source) {
                    kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(classId, "classId");
                    kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(source, "source");
                    return kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.this.loadAnnotationIfNotSpecial(classId, source, this.result);
                }

                @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationVisitor
                public void visitEnd() {
                    if (!this.result.isEmpty()) {
                        map.put(this.signature, this.result);
                    }
                }
            }
        }, getCachedFileContent(kotlinJvmBinaryClass));
        return new kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.Storage<>(map, map2);
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.load.kotlin.MemberSignature getPropertySignature$default(kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader abstractBinaryClassAnnotationAndConstantLoader, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property property, kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver nameResolver, kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable typeTable, boolean z, boolean z2, boolean z3, int i, java.lang.Object obj) {
        if (obj == null) {
            return abstractBinaryClassAnnotationAndConstantLoader.getPropertySignature(property, nameResolver, typeTable, (i & 8) != 0 ? false : z, (i & 16) != 0 ? false : z2, (i & 32) != 0 ? true : z3);
        }
        throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getPropertySignature");
    }

    private final kotlin.reflect.jvm.internal.impl.load.kotlin.MemberSignature getPropertySignature(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property property, kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver nameResolver, kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable typeTable, boolean z, boolean z2, boolean z3) {
        kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.GeneratedExtension<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property, kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmPropertySignature> propertySignature = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.propertySignature;
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(propertySignature, "propertySignature");
        kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmPropertySignature jvmPropertySignature = (kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmPropertySignature) kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoBufUtilKt.getExtensionOrNull(property, propertySignature);
        if (jvmPropertySignature != null) {
            if (z) {
                kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature.Field jvmFieldSignature = kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil.INSTANCE.getJvmFieldSignature(property, nameResolver, typeTable, z3);
                if (jvmFieldSignature != null) {
                    return kotlin.reflect.jvm.internal.impl.load.kotlin.MemberSignature.Companion.fromJvmMemberSignature(jvmFieldSignature);
                }
                return null;
            }
            if (z2 && jvmPropertySignature.hasSyntheticMethod()) {
                kotlin.reflect.jvm.internal.impl.load.kotlin.MemberSignature.Companion companion = kotlin.reflect.jvm.internal.impl.load.kotlin.MemberSignature.Companion;
                kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmMethodSignature syntheticMethod = jvmPropertySignature.getSyntheticMethod();
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(syntheticMethod, "signature.syntheticMethod");
                return companion.fromMethod(nameResolver, syntheticMethod);
            }
        }
        return null;
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.load.kotlin.MemberSignature getCallableSignature$default(kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader abstractBinaryClassAnnotationAndConstantLoader, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite messageLite, kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver nameResolver, kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable typeTable, kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind annotatedCallableKind, boolean z, int i, java.lang.Object obj) {
        if (obj == null) {
            return abstractBinaryClassAnnotationAndConstantLoader.getCallableSignature(messageLite, nameResolver, typeTable, annotatedCallableKind, (i & 16) != 0 ? false : z);
        }
        throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCallableSignature");
    }

    private final kotlin.reflect.jvm.internal.impl.load.kotlin.MemberSignature getCallableSignature(kotlin.reflect.jvm.internal.impl.protobuf.MessageLite messageLite, kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver nameResolver, kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable typeTable, kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind annotatedCallableKind, boolean z) {
        if (messageLite instanceof kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor) {
            kotlin.reflect.jvm.internal.impl.load.kotlin.MemberSignature.Companion companion = kotlin.reflect.jvm.internal.impl.load.kotlin.MemberSignature.Companion;
            kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature.Method jvmConstructorSignature = kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil.INSTANCE.getJvmConstructorSignature((kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor) messageLite, nameResolver, typeTable);
            if (jvmConstructorSignature != null) {
                return companion.fromJvmMemberSignature(jvmConstructorSignature);
            }
            return null;
        }
        if (messageLite instanceof kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function) {
            kotlin.reflect.jvm.internal.impl.load.kotlin.MemberSignature.Companion companion2 = kotlin.reflect.jvm.internal.impl.load.kotlin.MemberSignature.Companion;
            kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature.Method jvmMethodSignature = kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil.INSTANCE.getJvmMethodSignature((kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function) messageLite, nameResolver, typeTable);
            if (jvmMethodSignature != null) {
                return companion2.fromJvmMemberSignature(jvmMethodSignature);
            }
            return null;
        }
        if (!(messageLite instanceof kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property)) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.GeneratedExtension<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property, kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmPropertySignature> propertySignature = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.propertySignature;
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(propertySignature, "propertySignature");
        kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmPropertySignature jvmPropertySignature = (kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmPropertySignature) kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoBufUtilKt.getExtensionOrNull((kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage) messageLite, propertySignature);
        if (jvmPropertySignature == null) {
            return null;
        }
        int i = kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.WhenMappings.$EnumSwitchMapping$0[annotatedCallableKind.ordinal()];
        if (i == 1) {
            if (!jvmPropertySignature.hasGetter()) {
                return null;
            }
            kotlin.reflect.jvm.internal.impl.load.kotlin.MemberSignature.Companion companion3 = kotlin.reflect.jvm.internal.impl.load.kotlin.MemberSignature.Companion;
            kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmMethodSignature getter = jvmPropertySignature.getGetter();
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(getter, "signature.getter");
            return companion3.fromMethod(nameResolver, getter);
        }
        if (i != 2) {
            if (i != 3) {
                return null;
            }
            return getPropertySignature((kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property) messageLite, nameResolver, typeTable, true, true, z);
        }
        if (!jvmPropertySignature.hasSetter()) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.load.kotlin.MemberSignature.Companion companion4 = kotlin.reflect.jvm.internal.impl.load.kotlin.MemberSignature.Companion;
        kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmMethodSignature setter = jvmPropertySignature.getSetter();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(setter, "signature.setter");
        return companion4.fromMethod(nameResolver, setter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: AbstractBinaryClassAnnotationAndConstantLoader.kt */
    static final class Storage<A, C> {
        private final java.util.Map<kotlin.reflect.jvm.internal.impl.load.kotlin.MemberSignature, java.util.List<A>> memberAnnotations;
        private final java.util.Map<kotlin.reflect.jvm.internal.impl.load.kotlin.MemberSignature, C> propertyConstants;

        /* JADX WARN: Multi-variable type inference failed */
        public Storage(java.util.Map<kotlin.reflect.jvm.internal.impl.load.kotlin.MemberSignature, ? extends java.util.List<? extends A>> memberAnnotations, java.util.Map<kotlin.reflect.jvm.internal.impl.load.kotlin.MemberSignature, ? extends C> propertyConstants) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(memberAnnotations, "memberAnnotations");
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(propertyConstants, "propertyConstants");
            this.memberAnnotations = memberAnnotations;
            this.propertyConstants = propertyConstants;
        }

        public final java.util.Map<kotlin.reflect.jvm.internal.impl.load.kotlin.MemberSignature, java.util.List<A>> getMemberAnnotations() {
            return this.memberAnnotations;
        }

        public final java.util.Map<kotlin.reflect.jvm.internal.impl.load.kotlin.MemberSignature, C> getPropertyConstants() {
            return this.propertyConstants;
        }
    }

    /* JADX INFO: compiled from: AbstractBinaryClassAnnotationAndConstantLoader.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        java.util.List listListOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new kotlin.reflect.jvm.internal.impl.name.FqName[]{kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames.METADATA_FQ_NAME, kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames.JETBRAINS_NOT_NULL_ANNOTATION, kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames.JETBRAINS_NULLABLE_ANNOTATION, new kotlin.reflect.jvm.internal.impl.name.FqName("java.lang.annotation.Target"), new kotlin.reflect.jvm.internal.impl.name.FqName("java.lang.annotation.Retention"), new kotlin.reflect.jvm.internal.impl.name.FqName("java.lang.annotation.Documented")});
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(listListOf, 10));
        java.util.Iterator it = listListOf.iterator();
        while (it.hasNext()) {
            arrayList.add(kotlin.reflect.jvm.internal.impl.name.ClassId.topLevel((kotlin.reflect.jvm.internal.impl.name.FqName) it.next()));
        }
        SPECIAL_ANNOTATIONS = kotlin.collections.CollectionsKt.toSet(arrayList);
    }
}
