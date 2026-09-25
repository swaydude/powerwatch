package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

/* JADX INFO: compiled from: DeserializedPackageFragment.kt */
/* JADX INFO: loaded from: classes2.dex */
public abstract class DeserializedPackageFragment extends kotlin.reflect.jvm.internal.impl.descriptors.impl.PackageFragmentDescriptorImpl {
    private final kotlin.reflect.jvm.internal.impl.storage.StorageManager storageManager;

    public abstract kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDataFinder getClassDataFinder();

    public abstract void initialize(kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents deserializationComponents);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeserializedPackageFragment(kotlin.reflect.jvm.internal.impl.name.FqName fqName, kotlin.reflect.jvm.internal.impl.storage.StorageManager storageManager, kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor module) {
        super(module, fqName);
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(fqName, "fqName");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(storageManager, "storageManager");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(module, "module");
        this.storageManager = storageManager;
    }

    public boolean hasTopLevelClass(kotlin.reflect.jvm.internal.impl.name.Name name) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(name, "name");
        kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope memberScope = getMemberScope();
        return (memberScope instanceof kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope) && ((kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope) memberScope).getClassNames$deserialization().contains(name);
    }
}
