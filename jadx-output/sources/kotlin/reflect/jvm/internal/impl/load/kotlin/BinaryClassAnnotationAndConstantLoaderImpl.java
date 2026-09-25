package kotlin.reflect.jvm.internal.impl.load.kotlin;

/* JADX INFO: compiled from: BinaryClassAnnotationAndConstantLoaderImpl.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class BinaryClassAnnotationAndConstantLoaderImpl extends kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader<kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor, kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue<?>> {
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationDeserializer annotationDeserializer;
    private final kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor module;
    private final kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses notFoundClasses;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinaryClassAnnotationAndConstantLoaderImpl(kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor module, kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses notFoundClasses, kotlin.reflect.jvm.internal.impl.storage.StorageManager storageManager, kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder kotlinClassFinder) {
        super(storageManager, kotlinClassFinder);
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(module, "module");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(notFoundClasses, "notFoundClasses");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(storageManager, "storageManager");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(kotlinClassFinder, "kotlinClassFinder");
        this.module = module;
        this.notFoundClasses = notFoundClasses;
        this.annotationDeserializer = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationDeserializer(module, notFoundClasses);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader
    public kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor loadTypeAnnotation(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation proto, kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver nameResolver) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(proto, "proto");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(nameResolver, "nameResolver");
        return this.annotationDeserializer.deserializeAnnotation(proto, nameResolver);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader
    public kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue<?> loadConstant(java.lang.String desc, java.lang.Object initializer) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(desc, "desc");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(initializer, "initializer");
        if (kotlin.text.StringsKt.contains$default((java.lang.CharSequence) "ZBCS", (java.lang.CharSequence) desc, false, 2, (java.lang.Object) null)) {
            int iIntValue = ((java.lang.Integer) initializer).intValue();
            int iHashCode = desc.hashCode();
            if (iHashCode == 66) {
                if (desc.equals("B")) {
                    initializer = java.lang.Byte.valueOf((byte) iIntValue);
                }
                throw new java.lang.AssertionError(desc);
            }
            if (iHashCode == 67) {
                if (desc.equals("C")) {
                    initializer = java.lang.Character.valueOf((char) iIntValue);
                }
                throw new java.lang.AssertionError(desc);
            }
            if (iHashCode == 83) {
                if (desc.equals("S")) {
                    initializer = java.lang.Short.valueOf((short) iIntValue);
                }
                throw new java.lang.AssertionError(desc);
            }
            if (iHashCode == 90 && desc.equals("Z")) {
                initializer = java.lang.Boolean.valueOf(iIntValue != 0);
            }
            throw new java.lang.AssertionError(desc);
        }
        return kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValueFactory.INSTANCE.createConstantValue(initializer);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader
    public kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue<?> transformToUnsignedConstant(kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue<?> constant) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(constant, "constant");
        if (constant instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.ByteValue) {
            return new kotlin.reflect.jvm.internal.impl.resolve.constants.UByteValue(((kotlin.reflect.jvm.internal.impl.resolve.constants.ByteValue) constant).getValue().byteValue());
        }
        if (constant instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.ShortValue) {
            return new kotlin.reflect.jvm.internal.impl.resolve.constants.UShortValue(((kotlin.reflect.jvm.internal.impl.resolve.constants.ShortValue) constant).getValue().shortValue());
        }
        if (constant instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.IntValue) {
            return new kotlin.reflect.jvm.internal.impl.resolve.constants.UIntValue(((kotlin.reflect.jvm.internal.impl.resolve.constants.IntValue) constant).getValue().intValue());
        }
        return constant instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.LongValue ? new kotlin.reflect.jvm.internal.impl.resolve.constants.ULongValue(((kotlin.reflect.jvm.internal.impl.resolve.constants.LongValue) constant).getValue().longValue()) : constant;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader
    protected kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor loadAnnotation(kotlin.reflect.jvm.internal.impl.name.ClassId annotationClassId, kotlin.reflect.jvm.internal.impl.descriptors.SourceElement source, java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor> result) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(annotationClassId, "annotationClassId");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(source, "source");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(result, "result");
        return new kotlin.reflect.jvm.internal.impl.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl.AnonymousClass1(resolveClass(annotationClassId), result, source);
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl$loadAnnotation$1, reason: invalid class name */
    /* JADX INFO: compiled from: BinaryClassAnnotationAndConstantLoaderImpl.kt */
    public static final class AnonymousClass1 implements kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor {
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor $annotationClass;
        final /* synthetic */ java.util.List $result;
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.SourceElement $source;
        private final java.util.HashMap<kotlin.reflect.jvm.internal.impl.name.Name, kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue<?>> arguments = new java.util.HashMap<>();

        AnonymousClass1(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor, java.util.List list, kotlin.reflect.jvm.internal.impl.descriptors.SourceElement sourceElement) {
            this.$annotationClass = classDescriptor;
            this.$result = list;
            this.$source = sourceElement;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public void visit(kotlin.reflect.jvm.internal.impl.name.Name name, java.lang.Object obj) {
            if (name != null) {
                this.arguments.put(name, createConstant(name, obj));
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public void visitClassLiteral(kotlin.reflect.jvm.internal.impl.name.Name name, kotlin.reflect.jvm.internal.impl.resolve.constants.ClassLiteralValue value) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(name, "name");
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(value, "value");
            this.arguments.put(name, new kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue(value));
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public void visitEnum(kotlin.reflect.jvm.internal.impl.name.Name name, kotlin.reflect.jvm.internal.impl.name.ClassId enumClassId, kotlin.reflect.jvm.internal.impl.name.Name enumEntryName) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(name, "name");
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(enumClassId, "enumClassId");
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(enumEntryName, "enumEntryName");
            this.arguments.put(name, new kotlin.reflect.jvm.internal.impl.resolve.constants.EnumValue(enumClassId, enumEntryName));
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor visitArray(final kotlin.reflect.jvm.internal.impl.name.Name name) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(name, "name");
            return new kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor() { // from class: kotlin.reflect.jvm.internal.impl.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl$loadAnnotation$1$visitArray$1
                private final java.util.ArrayList<kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue<?>> elements = new java.util.ArrayList<>();

                @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor
                public void visit(java.lang.Object obj) {
                    this.elements.add(this.this$0.createConstant(name, obj));
                }

                @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor
                public void visitEnum(kotlin.reflect.jvm.internal.impl.name.ClassId enumClassId, kotlin.reflect.jvm.internal.impl.name.Name enumEntryName) {
                    kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(enumClassId, "enumClassId");
                    kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(enumEntryName, "enumEntryName");
                    this.elements.add(new kotlin.reflect.jvm.internal.impl.resolve.constants.EnumValue(enumClassId, enumEntryName));
                }

                @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor
                public void visitClassLiteral(kotlin.reflect.jvm.internal.impl.resolve.constants.ClassLiteralValue value) {
                    kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(value, "value");
                    this.elements.add(new kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue(value));
                }

                @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor
                public void visitEnd() {
                    kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor annotationParameterByName = kotlin.reflect.jvm.internal.impl.load.java.components.DescriptorResolverUtils.getAnnotationParameterByName(name, this.this$0.$annotationClass);
                    if (annotationParameterByName != null) {
                        java.util.HashMap map = this.this$0.arguments;
                        kotlin.reflect.jvm.internal.impl.name.Name name2 = name;
                        kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValueFactory constantValueFactory = kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValueFactory.INSTANCE;
                        java.util.List<? extends kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue<?>> listCompact = kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.compact(this.elements);
                        kotlin.reflect.jvm.internal.impl.types.KotlinType type = annotationParameterByName.getType();
                        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(type, "parameter.type");
                        map.put(name2, constantValueFactory.createArrayValue(listCompact, type));
                    }
                }
            };
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor visitAnnotation(final kotlin.reflect.jvm.internal.impl.name.Name name, kotlin.reflect.jvm.internal.impl.name.ClassId classId) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(name, "name");
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(classId, "classId");
            final java.util.ArrayList arrayList = new java.util.ArrayList();
            kotlin.reflect.jvm.internal.impl.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl binaryClassAnnotationAndConstantLoaderImpl = kotlin.reflect.jvm.internal.impl.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl.this;
            kotlin.reflect.jvm.internal.impl.descriptors.SourceElement sourceElement = kotlin.reflect.jvm.internal.impl.descriptors.SourceElement.NO_SOURCE;
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(sourceElement, "SourceElement.NO_SOURCE");
            final kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor annotationArgumentVisitorLoadAnnotation = binaryClassAnnotationAndConstantLoaderImpl.loadAnnotation(classId, sourceElement, arrayList);
            if (annotationArgumentVisitorLoadAnnotation == null) {
                kotlin.jvm.internal.Intrinsics.throwNpe();
            }
            return new kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor(annotationArgumentVisitorLoadAnnotation, name, arrayList) { // from class: kotlin.reflect.jvm.internal.impl.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl$loadAnnotation$1$visitAnnotation$1
                private final /* synthetic */ kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor $$delegate_0;
                final /* synthetic */ java.util.ArrayList $list;
                final /* synthetic */ kotlin.reflect.jvm.internal.impl.name.Name $name;
                final /* synthetic */ kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor $visitor;

                @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
                public void visit(kotlin.reflect.jvm.internal.impl.name.Name name2, java.lang.Object obj) {
                    this.$$delegate_0.visit(name2, obj);
                }

                @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
                public kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor visitAnnotation(kotlin.reflect.jvm.internal.impl.name.Name name2, kotlin.reflect.jvm.internal.impl.name.ClassId classId2) {
                    kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(name2, "name");
                    kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(classId2, "classId");
                    return this.$$delegate_0.visitAnnotation(name2, classId2);
                }

                @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
                public kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor visitArray(kotlin.reflect.jvm.internal.impl.name.Name name2) {
                    kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(name2, "name");
                    return this.$$delegate_0.visitArray(name2);
                }

                @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
                public void visitClassLiteral(kotlin.reflect.jvm.internal.impl.name.Name name2, kotlin.reflect.jvm.internal.impl.resolve.constants.ClassLiteralValue value) {
                    kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(name2, "name");
                    kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(value, "value");
                    this.$$delegate_0.visitClassLiteral(name2, value);
                }

                @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
                public void visitEnum(kotlin.reflect.jvm.internal.impl.name.Name name2, kotlin.reflect.jvm.internal.impl.name.ClassId enumClassId, kotlin.reflect.jvm.internal.impl.name.Name enumEntryName) {
                    kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(name2, "name");
                    kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(enumClassId, "enumClassId");
                    kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(enumEntryName, "enumEntryName");
                    this.$$delegate_0.visitEnum(name2, enumClassId, enumEntryName);
                }

                {
                    this.$visitor = annotationArgumentVisitorLoadAnnotation;
                    this.$name = name;
                    this.$list = arrayList;
                    this.$$delegate_0 = annotationArgumentVisitorLoadAnnotation;
                }

                @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
                public void visitEnd() {
                    this.$visitor.visitEnd();
                    this.this$0.arguments.put(this.$name, new kotlin.reflect.jvm.internal.impl.resolve.constants.AnnotationValue((kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor) kotlin.collections.CollectionsKt.single((java.util.List) this.$list)));
                }
            };
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public void visitEnd() {
            this.$result.add(new kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptorImpl(this.$annotationClass.getDefaultType(), this.arguments, this.$source));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue<?> createConstant(kotlin.reflect.jvm.internal.impl.name.Name name, java.lang.Object obj) {
            kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue<?> constantValueCreateConstantValue = kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValueFactory.INSTANCE.createConstantValue(obj);
            if (constantValueCreateConstantValue != null) {
                return constantValueCreateConstantValue;
            }
            return kotlin.reflect.jvm.internal.impl.resolve.constants.ErrorValue.Companion.create("Unsupported annotation argument: " + name);
        }
    }

    private final kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor resolveClass(kotlin.reflect.jvm.internal.impl.name.ClassId classId) {
        return kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt.findNonGenericClassAcrossDependencies(this.module, classId, this.notFoundClasses);
    }
}
