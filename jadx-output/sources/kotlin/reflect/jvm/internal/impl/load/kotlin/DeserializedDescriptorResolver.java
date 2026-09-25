package kotlin.reflect.jvm.internal.impl.load.kotlin;

/* JADX INFO: compiled from: DeserializedDescriptorResolver.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class DeserializedDescriptorResolver {
    public kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents components;
    public static final kotlin.reflect.jvm.internal.impl.load.kotlin.DeserializedDescriptorResolver.Companion Companion = new kotlin.reflect.jvm.internal.impl.load.kotlin.DeserializedDescriptorResolver.Companion(null);
    private static final java.util.Set<kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind> KOTLIN_CLASS = kotlin.collections.SetsKt.setOf(kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind.CLASS);
    private static final java.util.Set<kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind> KOTLIN_FILE_FACADE_OR_MULTIFILE_CLASS_PART = kotlin.collections.SetsKt.setOf((java.lang.Object[]) new kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind[]{kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind.FILE_FACADE, kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind.MULTIFILE_CLASS_PART});
    private static final kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMetadataVersion KOTLIN_1_1_EAP_METADATA_VERSION = new kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMetadataVersion(1, 1, 2);
    private static final kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMetadataVersion KOTLIN_1_3_M1_METADATA_VERSION = new kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMetadataVersion(1, 1, 11);
    private static final kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMetadataVersion KOTLIN_1_3_RC_METADATA_VERSION = new kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMetadataVersion(1, 1, 13);

    public final kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents getComponents() {
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents deserializationComponents = this.components;
        if (deserializationComponents == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("components");
        }
        return deserializationComponents;
    }

    public final void setComponents(kotlin.reflect.jvm.internal.impl.load.kotlin.DeserializationComponentsForJava components) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(components, "components");
        this.components = components.getComponents();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getSkipMetadataVersionCheck() {
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents deserializationComponents = this.components;
        if (deserializationComponents == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("components");
        }
        return deserializationComponents.getConfiguration().getSkipMetadataVersionCheck();
    }

    public final kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor resolveClass(kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass kotlinClass) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(kotlinClass, "kotlinClass");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassData classData$descriptors_jvm = readClassData$descriptors_jvm(kotlinClass);
        if (classData$descriptors_jvm == null) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents deserializationComponents = this.components;
        if (deserializationComponents == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("components");
        }
        return deserializationComponents.getClassDeserializer().deserializeClass(kotlinClass.getClassId(), classData$descriptors_jvm);
    }

    public final kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassData readClassData$descriptors_jvm(kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass kotlinClass) {
        java.lang.String[] strings;
        kotlin.Pair<kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmNameResolver, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class> classDataFrom;
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(kotlinClass, "kotlinClass");
        java.lang.String[] data = readData(kotlinClass, KOTLIN_CLASS);
        if (data == null || (strings = kotlinClass.getClassHeader().getStrings()) == null) {
            return null;
        }
        try {
            try {
                classDataFrom = kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil.readClassDataFrom(data, strings);
            } catch (kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException e) {
                throw new java.lang.IllegalStateException("Could not read data from " + kotlinClass.getLocation(), e);
            }
        } catch (java.lang.Throwable th) {
            if (getSkipMetadataVersionCheck() || kotlinClass.getClassHeader().getMetadataVersion().isCompatible()) {
                throw th;
            }
            classDataFrom = null;
        }
        if (classDataFrom != null) {
            return new kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassData(classDataFrom.component1(), classDataFrom.component2(), kotlinClass.getClassHeader().getMetadataVersion(), new kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinarySourceElement(kotlinClass, getIncompatibility(kotlinClass), isPreReleaseInvisible(kotlinClass)));
        }
        return null;
    }

    public final kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope createKotlinPackagePartScope(kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor descriptor, kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass kotlinClass) {
        kotlin.Pair<kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmNameResolver, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package> packageDataFrom;
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(descriptor, "descriptor");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(kotlinClass, "kotlinClass");
        java.lang.String[] data = readData(kotlinClass, KOTLIN_FILE_FACADE_OR_MULTIFILE_CLASS_PART);
        if (data != null) {
            java.lang.String[] strings = kotlinClass.getClassHeader().getStrings();
            try {
                if (strings != null) {
                    try {
                        packageDataFrom = kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(data, strings);
                        if (packageDataFrom == null) {
                            return null;
                        }
                        kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmNameResolver jvmNameResolverComponent1 = packageDataFrom.component1();
                        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package packageComponent2 = packageDataFrom.component2();
                        kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmNameResolver jvmNameResolver = jvmNameResolverComponent1;
                        kotlin.reflect.jvm.internal.impl.load.kotlin.JvmPackagePartSource jvmPackagePartSource = new kotlin.reflect.jvm.internal.impl.load.kotlin.JvmPackagePartSource(kotlinClass, packageComponent2, jvmNameResolver, getIncompatibility(kotlinClass), isPreReleaseInvisible(kotlinClass));
                        kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMetadataVersion metadataVersion = kotlinClass.getClassHeader().getMetadataVersion();
                        kotlin.reflect.jvm.internal.impl.load.kotlin.JvmPackagePartSource jvmPackagePartSource2 = jvmPackagePartSource;
                        kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents deserializationComponents = this.components;
                        if (deserializationComponents == null) {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("components");
                        }
                        return new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedPackageMemberScope(descriptor, packageComponent2, jvmNameResolver, metadataVersion, jvmPackagePartSource2, deserializationComponents, new kotlin.jvm.functions.Function0<java.util.List<? extends kotlin.reflect.jvm.internal.impl.name.Name>>() { // from class: kotlin.reflect.jvm.internal.impl.load.kotlin.DeserializedDescriptorResolver.createKotlinPackagePartScope.2
                            @Override // kotlin.jvm.functions.Function0
                            public final java.util.List<? extends kotlin.reflect.jvm.internal.impl.name.Name> invoke() {
                                return kotlin.collections.CollectionsKt.emptyList();
                            }
                        });
                    } catch (kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException e) {
                        throw new java.lang.IllegalStateException("Could not read data from " + kotlinClass.getLocation(), e);
                    }
                }
            } catch (java.lang.Throwable th) {
                if (getSkipMetadataVersionCheck() || kotlinClass.getClassHeader().getMetadataVersion().isCompatible()) {
                    throw th;
                }
                packageDataFrom = null;
            }
        }
        return null;
    }

    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.IncompatibleVersionErrorData<kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMetadataVersion> getIncompatibility(kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass kotlinJvmBinaryClass) {
        if (getSkipMetadataVersionCheck() || kotlinJvmBinaryClass.getClassHeader().getMetadataVersion().isCompatible()) {
            return null;
        }
        return new kotlin.reflect.jvm.internal.impl.serialization.deserialization.IncompatibleVersionErrorData<>(kotlinJvmBinaryClass.getClassHeader().getMetadataVersion(), kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMetadataVersion.INSTANCE, kotlinJvmBinaryClass.getLocation(), kotlinJvmBinaryClass.getClassId());
    }

    private final boolean isPreReleaseInvisible(kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass kotlinJvmBinaryClass) {
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents deserializationComponents = this.components;
        if (deserializationComponents == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("components");
        }
        return (deserializationComponents.getConfiguration().getReportErrorsOnPreReleaseDependencies() && (kotlinJvmBinaryClass.getClassHeader().isPreRelease() || kotlin.jvm.internal.Intrinsics.areEqual(kotlinJvmBinaryClass.getClassHeader().getMetadataVersion(), KOTLIN_1_1_EAP_METADATA_VERSION))) || isCompiledWith13M1(kotlinJvmBinaryClass);
    }

    private final boolean isCompiledWith13M1(kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass kotlinJvmBinaryClass) {
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents deserializationComponents = this.components;
        if (deserializationComponents == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("components");
        }
        return !deserializationComponents.getConfiguration().getSkipMetadataVersionCheck() && kotlinJvmBinaryClass.getClassHeader().isPreRelease() && kotlin.jvm.internal.Intrinsics.areEqual(kotlinJvmBinaryClass.getClassHeader().getMetadataVersion(), KOTLIN_1_3_M1_METADATA_VERSION);
    }

    private final java.lang.String[] readData(kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass kotlinJvmBinaryClass, java.util.Set<? extends kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind> set) {
        kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader classHeader = kotlinJvmBinaryClass.getClassHeader();
        java.lang.String[] data = classHeader.getData();
        if (data == null) {
            data = classHeader.getIncompatibleData();
        }
        if (data == null) {
            return null;
        }
        if (!set.contains(classHeader.getKind())) {
            data = null;
        }
        return data;
    }

    /* JADX INFO: compiled from: DeserializedDescriptorResolver.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMetadataVersion getKOTLIN_1_3_RC_METADATA_VERSION$descriptors_jvm() {
            return kotlin.reflect.jvm.internal.impl.load.kotlin.DeserializedDescriptorResolver.KOTLIN_1_3_RC_METADATA_VERSION;
        }
    }
}
