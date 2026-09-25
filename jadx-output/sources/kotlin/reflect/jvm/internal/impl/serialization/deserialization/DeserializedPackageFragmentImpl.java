package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

/* JADX INFO: compiled from: DeserializedPackageFragmentImpl.kt */
/* JADX INFO: loaded from: classes2.dex */
public abstract class DeserializedPackageFragmentImpl extends kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializedPackageFragment {
    private kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope _memberScope;
    private kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment _proto;
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoBasedClassDataFinder classDataFinder;
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerSource containerSource;
    private final kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion metadataVersion;
    private final kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolverImpl nameResolver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeserializedPackageFragmentImpl(kotlin.reflect.jvm.internal.impl.name.FqName fqName, kotlin.reflect.jvm.internal.impl.storage.StorageManager storageManager, kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor module, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment proto, kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion metadataVersion, kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerSource deserializedContainerSource) {
        super(fqName, storageManager, module);
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(fqName, "fqName");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(storageManager, "storageManager");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(module, "module");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(proto, "proto");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(metadataVersion, "metadataVersion");
        this.metadataVersion = metadataVersion;
        this.containerSource = deserializedContainerSource;
        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTable strings = proto.getStrings();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(strings, "proto.strings");
        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable qualifiedNames = proto.getQualifiedNames();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(qualifiedNames, "proto.qualifiedNames");
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolverImpl nameResolverImpl = new kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolverImpl(strings, qualifiedNames);
        this.nameResolver = nameResolverImpl;
        this.classDataFinder = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoBasedClassDataFinder(proto, nameResolverImpl, metadataVersion, new kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.name.ClassId, kotlin.reflect.jvm.internal.impl.descriptors.SourceElement>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializedPackageFragmentImpl$classDataFinder$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final kotlin.reflect.jvm.internal.impl.descriptors.SourceElement invoke(kotlin.reflect.jvm.internal.impl.name.ClassId it) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(it, "it");
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerSource deserializedContainerSource2 = this.this$0.containerSource;
                if (deserializedContainerSource2 != null) {
                    return deserializedContainerSource2;
                }
                kotlin.reflect.jvm.internal.impl.descriptors.SourceElement sourceElement = kotlin.reflect.jvm.internal.impl.descriptors.SourceElement.NO_SOURCE;
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(sourceElement, "SourceElement.NO_SOURCE");
                return sourceElement;
            }
        });
        this._proto = proto;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializedPackageFragment
    public kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoBasedClassDataFinder getClassDataFinder() {
        return this.classDataFinder;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializedPackageFragment
    public void initialize(kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents components) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(components, "components");
        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment packageFragment = this._proto;
        if (packageFragment == null) {
            throw new java.lang.IllegalStateException("Repeated call to DeserializedPackageFragmentImpl::initialize".toString());
        }
        this._proto = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment) null;
        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package r4 = packageFragment.getPackage();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r4, "proto.`package`");
        this._memberScope = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedPackageMemberScope(this, r4, this.nameResolver, this.metadataVersion, this.containerSource, components, new kotlin.jvm.functions.Function0<java.util.List<? extends kotlin.reflect.jvm.internal.impl.name.Name>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializedPackageFragmentImpl.initialize.1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final java.util.List<? extends kotlin.reflect.jvm.internal.impl.name.Name> invoke() {
                java.util.Collection<kotlin.reflect.jvm.internal.impl.name.ClassId> allClassIds = kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializedPackageFragmentImpl.this.getClassDataFinder().getAllClassIds();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.Object obj : allClassIds) {
                    kotlin.reflect.jvm.internal.impl.name.ClassId classId = (kotlin.reflect.jvm.internal.impl.name.ClassId) obj;
                    if ((classId.isNestedClass() || kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDeserializer.Companion.getBLACK_LIST().contains(classId)) ? false : true) {
                        arrayList.add(obj);
                    }
                }
                java.util.ArrayList arrayList2 = arrayList;
                java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
                java.util.Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    arrayList3.add(((kotlin.reflect.jvm.internal.impl.name.ClassId) it.next()).getShortClassName());
                }
                return arrayList3;
            }
        });
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor
    public kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope getMemberScope() {
        kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope memberScope = this._memberScope;
        if (memberScope == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("_memberScope");
        }
        return memberScope;
    }
}
