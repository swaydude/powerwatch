package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

/* JADX INFO: compiled from: ClassDeserializer.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class ClassDeserializer {
    private final kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDeserializer.ClassKey, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor> classes;
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents components;
    public static final kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDeserializer.Companion Companion = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDeserializer.Companion(null);
    private static final java.util.Set<kotlin.reflect.jvm.internal.impl.name.ClassId> BLACK_LIST = kotlin.collections.SetsKt.setOf(kotlin.reflect.jvm.internal.impl.name.ClassId.topLevel(kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.FQ_NAMES.cloneable.toSafe()));

    public ClassDeserializer(kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents components) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(components, "components");
        this.components = components;
        this.classes = components.getStorageManager().createMemoizedFunctionWithNullableValues(new kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDeserializer.ClassKey, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDeserializer$classes$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor invoke(kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDeserializer.ClassKey key) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(key, "key");
                return this.this$0.createClass(key);
            }
        });
    }

    public static /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor deserializeClass$default(kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDeserializer classDeserializer, kotlin.reflect.jvm.internal.impl.name.ClassId classId, kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassData classData, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            classData = (kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassData) null;
        }
        return classDeserializer.deserializeClass(classId, classData);
    }

    public final kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor deserializeClass(kotlin.reflect.jvm.internal.impl.name.ClassId classId, kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassData classData) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(classId, "classId");
        return this.classes.invoke(new kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDeserializer.ClassKey(classId, classData));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:38:0x00b6  */
    public final kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor createClass(kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDeserializer.ClassKey classKey) {
        java.lang.Object next;
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext deserializationContextCreateContext;
        boolean z;
        kotlin.reflect.jvm.internal.impl.name.ClassId classId = classKey.getClassId();
        java.util.Iterator<kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory> it = this.components.getFictitiousClassDescriptorFactories().iterator();
        while (it.hasNext()) {
            kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptorCreateClass = it.next().createClass(classId);
            if (classDescriptorCreateClass != null) {
                return classDescriptorCreateClass;
            }
        }
        if (BLACK_LIST.contains(classId)) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassData classData = classKey.getClassData();
        if (classData == null) {
            classData = this.components.getClassDataFinder().findClassData(classId);
        }
        if (classData != null) {
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver nameResolverComponent1 = classData.component1();
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class classComponent2 = classData.component2();
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion binaryVersionComponent3 = classData.component3();
            kotlin.reflect.jvm.internal.impl.descriptors.SourceElement sourceElementComponent4 = classData.component4();
            kotlin.reflect.jvm.internal.impl.name.ClassId outerClassId = classId.getOuterClassId();
            if (outerClassId != null) {
                kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptorDeserializeClass$default = deserializeClass$default(this, outerClassId, null, 2, null);
                if (!(classDescriptorDeserializeClass$default instanceof kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor)) {
                    classDescriptorDeserializeClass$default = null;
                }
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor deserializedClassDescriptor = (kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor) classDescriptorDeserializeClass$default;
                if (deserializedClassDescriptor == null) {
                    return null;
                }
                kotlin.reflect.jvm.internal.impl.name.Name shortClassName = classId.getShortClassName();
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(shortClassName, "classId.shortClassName");
                if (!deserializedClassDescriptor.hasNestedClass$deserialization(shortClassName)) {
                    return null;
                }
                deserializationContextCreateContext = deserializedClassDescriptor.getC();
            } else {
                kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider packageFragmentProvider = this.components.getPackageFragmentProvider();
                kotlin.reflect.jvm.internal.impl.name.FqName packageFqName = classId.getPackageFqName();
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(packageFqName, "classId.packageFqName");
                java.util.Iterator<T> it2 = packageFragmentProvider.getPackageFragments(packageFqName).iterator();
                do {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                    kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor packageFragmentDescriptor = (kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor) next;
                    if (packageFragmentDescriptor instanceof kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializedPackageFragment) {
                        kotlin.reflect.jvm.internal.impl.name.Name shortClassName2 = classId.getShortClassName();
                        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(shortClassName2, "classId.shortClassName");
                        if (((kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializedPackageFragment) packageFragmentDescriptor).hasTopLevelClass(shortClassName2)) {
                            z = true;
                        } else {
                            z = false;
                        }
                    } else {
                        z = true;
                    }
                } while (!z);
                kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor packageFragmentDescriptor2 = (kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor) next;
                if (packageFragmentDescriptor2 != null) {
                    kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents deserializationComponents = this.components;
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable typeTable = classComponent2.getTypeTable();
                    kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(typeTable, "classProto.typeTable");
                    kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable typeTable2 = new kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable(typeTable);
                    kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable.Companion companion = kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable.Companion;
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable versionRequirementTable = classComponent2.getVersionRequirementTable();
                    kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(versionRequirementTable, "classProto.versionRequirementTable");
                    deserializationContextCreateContext = deserializationComponents.createContext(packageFragmentDescriptor2, nameResolverComponent1, typeTable2, companion.create(versionRequirementTable), binaryVersionComponent3, null);
                }
            }
            return new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor(deserializationContextCreateContext, classComponent2, nameResolverComponent1, binaryVersionComponent3, sourceElementComponent4);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: ClassDeserializer.kt */
    static final class ClassKey {
        private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassData classData;
        private final kotlin.reflect.jvm.internal.impl.name.ClassId classId;

        public ClassKey(kotlin.reflect.jvm.internal.impl.name.ClassId classId, kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassData classData) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(classId, "classId");
            this.classId = classId;
            this.classData = classData;
        }

        public final kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassData getClassData() {
            return this.classData;
        }

        public final kotlin.reflect.jvm.internal.impl.name.ClassId getClassId() {
            return this.classId;
        }

        public boolean equals(java.lang.Object obj) {
            return (obj instanceof kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDeserializer.ClassKey) && kotlin.jvm.internal.Intrinsics.areEqual(this.classId, ((kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDeserializer.ClassKey) obj).classId);
        }

        public int hashCode() {
            return this.classId.hashCode();
        }
    }

    /* JADX INFO: compiled from: ClassDeserializer.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final java.util.Set<kotlin.reflect.jvm.internal.impl.name.ClassId> getBLACK_LIST() {
            return kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDeserializer.BLACK_LIST;
        }
    }
}
