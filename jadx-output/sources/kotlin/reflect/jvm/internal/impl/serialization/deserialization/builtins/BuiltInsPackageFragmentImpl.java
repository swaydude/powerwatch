package kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins;

/* JADX INFO: compiled from: BuiltInsPackageFragmentImpl.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class BuiltInsPackageFragmentImpl extends kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializedPackageFragmentImpl implements kotlin.reflect.jvm.internal.impl.builtins.BuiltInsPackageFragment {
    public static final kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.BuiltInsPackageFragmentImpl.Companion Companion = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.BuiltInsPackageFragmentImpl.Companion(null);
    private final boolean isFallback;

    public /* synthetic */ BuiltInsPackageFragmentImpl(kotlin.reflect.jvm.internal.impl.name.FqName fqName, kotlin.reflect.jvm.internal.impl.storage.StorageManager storageManager, kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor moduleDescriptor, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment packageFragment, kotlin.reflect.jvm.internal.impl.metadata.builtins.BuiltInsBinaryVersion builtInsBinaryVersion, boolean z, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(fqName, storageManager, moduleDescriptor, packageFragment, builtInsBinaryVersion, z);
    }

    private BuiltInsPackageFragmentImpl(kotlin.reflect.jvm.internal.impl.name.FqName fqName, kotlin.reflect.jvm.internal.impl.storage.StorageManager storageManager, kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor moduleDescriptor, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment packageFragment, kotlin.reflect.jvm.internal.impl.metadata.builtins.BuiltInsBinaryVersion builtInsBinaryVersion, boolean z) {
        super(fqName, storageManager, moduleDescriptor, packageFragment, builtInsBinaryVersion, null);
        this.isFallback = z;
    }

    /* JADX INFO: compiled from: BuiltInsPackageFragmentImpl.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.BuiltInsPackageFragmentImpl create(kotlin.reflect.jvm.internal.impl.name.FqName fqName, kotlin.reflect.jvm.internal.impl.storage.StorageManager storageManager, kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor module, java.io.InputStream inputStream, boolean z) throws java.io.IOException {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(fqName, "fqName");
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(storageManager, "storageManager");
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(module, "module");
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(inputStream, "inputStream");
            java.io.InputStream inputStream2 = inputStream;
            java.lang.Throwable th = (java.lang.Throwable) null;
            try {
                java.io.InputStream inputStream3 = inputStream2;
                kotlin.reflect.jvm.internal.impl.metadata.builtins.BuiltInsBinaryVersion from = kotlin.reflect.jvm.internal.impl.metadata.builtins.BuiltInsBinaryVersion.Companion.readFrom(inputStream3);
                if (from == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("version");
                }
                if (!from.isCompatible()) {
                    throw new java.lang.UnsupportedOperationException("Kotlin built-in definition format version is not supported: expected " + kotlin.reflect.jvm.internal.impl.metadata.builtins.BuiltInsBinaryVersion.INSTANCE + ", actual " + from + ". Please update Kotlin");
                }
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment proto = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment.parseFrom(inputStream3, kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.BuiltInSerializerProtocol.INSTANCE.getExtensionRegistry());
                kotlin.io.CloseableKt.closeFinally(inputStream2, th);
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(proto, "proto");
                return new kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.BuiltInsPackageFragmentImpl(fqName, storageManager, module, proto, from, z, null);
            } catch (java.lang.Throwable th2) {
                try {
                    throw th2;
                } catch (java.lang.Throwable th3) {
                    kotlin.io.CloseableKt.closeFinally(inputStream2, th2);
                    throw th3;
                }
            }
        }
    }
}
