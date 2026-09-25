package kotlin.reflect.jvm.internal.impl.load.kotlin;

/* JADX INFO: compiled from: JvmPackagePartSource.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class JvmPackagePartSource implements kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerSource {
    private final kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName className;
    private final kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName facadeClassName;
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.IncompatibleVersionErrorData<kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMetadataVersion> incompatibility;
    private final boolean isPreReleaseInvisible;
    private final kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass knownJvmBinaryClass;
    private final java.lang.String moduleName;

    public JvmPackagePartSource(kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName className, kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName jvmClassName, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package packageProto, kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver nameResolver, kotlin.reflect.jvm.internal.impl.serialization.deserialization.IncompatibleVersionErrorData<kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMetadataVersion> incompatibleVersionErrorData, boolean z, kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass kotlinJvmBinaryClass) {
        java.lang.String string;
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(className, "className");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(packageProto, "packageProto");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(nameResolver, "nameResolver");
        this.className = className;
        this.facadeClassName = jvmClassName;
        this.incompatibility = incompatibleVersionErrorData;
        this.isPreReleaseInvisible = z;
        this.knownJvmBinaryClass = kotlinJvmBinaryClass;
        kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.GeneratedExtension<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package, java.lang.Integer> generatedExtension = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.packageModuleName;
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(generatedExtension, "JvmProtoBuf.packageModuleName");
        java.lang.Integer num = (java.lang.Integer) kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoBufUtilKt.getExtensionOrNull(packageProto, generatedExtension);
        this.moduleName = (num == null || (string = nameResolver.getString(num.intValue())) == null) ? "main" : string;
    }

    public final kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName getFacadeClassName() {
        return this.facadeClassName;
    }

    public final kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass getKnownJvmBinaryClass() {
        return this.knownJvmBinaryClass;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public JvmPackagePartSource(kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass kotlinClass, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package packageProto, kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver nameResolver, kotlin.reflect.jvm.internal.impl.serialization.deserialization.IncompatibleVersionErrorData<kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMetadataVersion> incompatibleVersionErrorData, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(kotlinClass, "kotlinClass");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(packageProto, "packageProto");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(nameResolver, "nameResolver");
        kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName jvmClassNameByClassId = kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName.byClassId(kotlinClass.getClassId());
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(jvmClassNameByClassId, "JvmClassName.byClassId(kotlinClass.classId)");
        java.lang.String multifileClassName = kotlinClass.getClassHeader().getMultifileClassName();
        kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName jvmClassNameByInternalName = null;
        if (multifileClassName != null) {
            if (multifileClassName.length() > 0) {
                jvmClassNameByInternalName = kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName.byInternalName(multifileClassName);
            }
        }
        this(jvmClassNameByClassId, jvmClassNameByInternalName, packageProto, nameResolver, incompatibleVersionErrorData, z, kotlinClass);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerSource
    public java.lang.String getPresentableString() {
        return "Class '" + getClassId().asSingleFqName().asString() + '\'';
    }

    public final kotlin.reflect.jvm.internal.impl.name.Name getSimpleName() {
        java.lang.String internalName = this.className.getInternalName();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(internalName, "className.internalName");
        kotlin.reflect.jvm.internal.impl.name.Name nameIdentifier = kotlin.reflect.jvm.internal.impl.name.Name.identifier(kotlin.text.StringsKt.substringAfterLast$default(internalName, '/', (java.lang.String) null, 2, (java.lang.Object) null));
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(nameIdentifier, "Name.identifier(classNam….substringAfterLast('/'))");
        return nameIdentifier;
    }

    public final kotlin.reflect.jvm.internal.impl.name.ClassId getClassId() {
        return new kotlin.reflect.jvm.internal.impl.name.ClassId(this.className.getPackageFqName(), getSimpleName());
    }

    public java.lang.String toString() {
        return getClass().getSimpleName() + ": " + this.className;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.SourceElement
    public kotlin.reflect.jvm.internal.impl.descriptors.SourceFile getContainingFile() {
        kotlin.reflect.jvm.internal.impl.descriptors.SourceFile sourceFile = kotlin.reflect.jvm.internal.impl.descriptors.SourceFile.NO_SOURCE_FILE;
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(sourceFile, "SourceFile.NO_SOURCE_FILE");
        return sourceFile;
    }
}
