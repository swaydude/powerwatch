package kotlin.reflect.jvm.internal;

import kotlin.reflect.jvm.internal.KPackageImpl.Data;

/* JADX INFO: compiled from: KPackageImpl.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001,B\u001d\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0096\u0002J\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\b2\u0006\u0010#\u001a\u00020$H\u0016J\u0012\u0010%\u001a\u0004\u0018\u00010&2\u0006\u0010'\u001a\u00020(H\u0016J\u0016\u0010)\u001a\b\u0012\u0004\u0012\u00020&0\b2\u0006\u0010#\u001a\u00020$H\u0016J\b\u0010*\u001a\u00020(H\u0016J\b\u0010+\u001a\u00020\u0005H\u0016R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR$\u0010\f\u001a\u0018\u0012\u0014\u0012\u0012 \u000f*\b\u0018\u00010\u000eR\u00020\u00000\u000eR\u00020\u00000\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0012\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00130\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u000bR\u0018\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u00038TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0011R\u0014\u0010\u0017\u001a\u00020\u00188BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006-"}, d2 = {"Lkotlin/reflect/jvm/internal/KPackageImpl;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "jClass", "Ljava/lang/Class;", "usageModuleName", "", "(Ljava/lang/Class;Ljava/lang/String;)V", "constructorDescriptors", "", "Lkotlin/reflect/jvm/internal/impl/descriptors/ConstructorDescriptor;", "getConstructorDescriptors", "()Ljava/util/Collection;", "data", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazyVal;", "Lkotlin/reflect/jvm/internal/KPackageImpl$Data;", "kotlin.jvm.PlatformType", "getJClass", "()Ljava/lang/Class;", "members", "Lkotlin/reflect/KCallable;", "getMembers", "methodOwner", "getMethodOwner", "scope", "Lkotlin/reflect/jvm/internal/impl/resolve/scopes/MemberScope;", "getScope", "()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", "getUsageModuleName", "()Ljava/lang/String;", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "", "getFunctions", "Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;", com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME, "Lkotlin/reflect/jvm/internal/impl/name/Name;", "getLocalProperty", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "", "getProperties", "hashCode", "toString", "Data", "kotlin-reflection"}, k = 1, mv = {1, 1, 15})
public final class KPackageImpl extends kotlin.reflect.jvm.internal.KDeclarationContainerImpl {
    private final kotlin.reflect.jvm.internal.ReflectProperties.LazyVal<kotlin.reflect.jvm.internal.KPackageImpl.Data> data;
    private final java.lang.Class<?> jClass;
    private final java.lang.String usageModuleName;

    @Override // kotlin.jvm.internal.ClassBasedDeclarationContainer
    public java.lang.Class<?> getJClass() {
        return this.jClass;
    }

    public /* synthetic */ KPackageImpl(java.lang.Class cls, java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(cls, (i & 2) != 0 ? (java.lang.String) null : str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: KPackageImpl.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R%\u0010\n\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\f0\u000b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\t\u001a\u0004\b\r\u0010\u000eR/\u0010\u0010\u001a\u0016\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00118FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016R!\u0010\u0019\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001a8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010\u001e\u001a\u00020\u001f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\t\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"Lkotlin/reflect/jvm/internal/KPackageImpl$Data;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$Data;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "(Lkotlin/reflect/jvm/internal/KPackageImpl;)V", "kotlinClass", "Lkotlin/reflect/jvm/internal/components/ReflectKotlinClass;", "getKotlinClass", "()Lkotlin/reflect/jvm/internal/components/ReflectKotlinClass;", "kotlinClass$delegate", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", "members", "", "Lkotlin/reflect/jvm/internal/KCallableImpl;", "getMembers", "()Ljava/util/Collection;", "members$delegate", "metadata", "Lkotlin/Triple;", "Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/JvmNameResolver;", "Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Package;", "Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/JvmMetadataVersion;", "getMetadata", "()Lkotlin/Triple;", "metadata$delegate", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazyVal;", "multifileFacade", "Ljava/lang/Class;", "getMultifileFacade", "()Ljava/lang/Class;", "multifileFacade$delegate", "scope", "Lkotlin/reflect/jvm/internal/impl/resolve/scopes/MemberScope;", "getScope", "()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", "scope$delegate", "kotlin-reflection"}, k = 1, mv = {1, 1, 15})
    final class Data extends kotlin.reflect.jvm.internal.KDeclarationContainerImpl.Data {
        static final /* synthetic */ kotlin.reflect.KProperty[] $$delegatedProperties = {kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlin.reflect.jvm.internal.KPackageImpl.Data.class), "kotlinClass", "getKotlinClass()Lkotlin/reflect/jvm/internal/components/ReflectKotlinClass;")), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlin.reflect.jvm.internal.KPackageImpl.Data.class), "scope", "getScope()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;")), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlin.reflect.jvm.internal.KPackageImpl.Data.class), "multifileFacade", "getMultifileFacade()Ljava/lang/Class;")), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlin.reflect.jvm.internal.KPackageImpl.Data.class), "metadata", "getMetadata()Lkotlin/Triple;")), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlin.reflect.jvm.internal.KPackageImpl.Data.class), "members", "getMembers()Ljava/util/Collection;"))};

        /* JADX INFO: renamed from: kotlinClass$delegate, reason: from kotlin metadata */
        private final kotlin.reflect.jvm.internal.ReflectProperties.LazySoftVal kotlinClass;

        /* JADX INFO: renamed from: members$delegate, reason: from kotlin metadata */
        private final kotlin.reflect.jvm.internal.ReflectProperties.LazySoftVal members;

        /* JADX INFO: renamed from: metadata$delegate, reason: from kotlin metadata */
        private final kotlin.reflect.jvm.internal.ReflectProperties.LazyVal metadata;

        /* JADX INFO: renamed from: multifileFacade$delegate, reason: from kotlin metadata */
        private final kotlin.reflect.jvm.internal.ReflectProperties.LazyVal multifileFacade;

        /* JADX INFO: renamed from: scope$delegate, reason: from kotlin metadata */
        private final kotlin.reflect.jvm.internal.ReflectProperties.LazySoftVal scope;

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public final kotlin.reflect.jvm.internal.components.ReflectKotlinClass getKotlinClass() {
            return (kotlin.reflect.jvm.internal.components.ReflectKotlinClass) this.kotlinClass.getValue(this, $$delegatedProperties[0]);
        }

        public final java.util.Collection<kotlin.reflect.jvm.internal.KCallableImpl<?>> getMembers() {
            return (java.util.Collection) this.members.getValue(this, $$delegatedProperties[4]);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final kotlin.Triple<kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmNameResolver, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package, kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMetadataVersion> getMetadata() {
            return (kotlin.Triple) this.metadata.getValue(this, $$delegatedProperties[3]);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final java.lang.Class<?> getMultifileFacade() {
            return (java.lang.Class) this.multifileFacade.getValue(this, $$delegatedProperties[2]);
        }

        public final kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope getScope() {
            return (kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope) this.scope.getValue(this, $$delegatedProperties[1]);
        }

        public Data() {
            super();
            this.kotlinClass = kotlin.reflect.jvm.internal.ReflectProperties.lazySoft(new kotlin.jvm.functions.Function0<kotlin.reflect.jvm.internal.components.ReflectKotlinClass>() { // from class: kotlin.reflect.jvm.internal.KPackageImpl$Data$kotlinClass$2
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final kotlin.reflect.jvm.internal.components.ReflectKotlinClass invoke() {
                    return kotlin.reflect.jvm.internal.components.ReflectKotlinClass.INSTANCE.create(kotlin.reflect.jvm.internal.KPackageImpl.this.getJClass());
                }
            });
            this.scope = kotlin.reflect.jvm.internal.ReflectProperties.lazySoft(new kotlin.jvm.functions.Function0<kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope>() { // from class: kotlin.reflect.jvm.internal.KPackageImpl$Data$scope$2
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope invoke() {
                    kotlin.reflect.jvm.internal.components.ReflectKotlinClass kotlinClass = this.this$0.getKotlinClass();
                    if (kotlinClass != null) {
                        return this.this$0.getModuleData().getPackagePartScopeCache().getPackagePartScope(kotlinClass);
                    }
                    return kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope.Empty.INSTANCE;
                }
            });
            this.multifileFacade = kotlin.reflect.jvm.internal.ReflectProperties.lazy(new kotlin.jvm.functions.Function0<java.lang.Class<?>>() { // from class: kotlin.reflect.jvm.internal.KPackageImpl$Data$multifileFacade$2
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Class<?> invoke() {
                    kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader classHeader;
                    kotlin.reflect.jvm.internal.components.ReflectKotlinClass kotlinClass = this.this$0.getKotlinClass();
                    java.lang.String multifileClassName = (kotlinClass == null || (classHeader = kotlinClass.getClassHeader()) == null) ? null : classHeader.getMultifileClassName();
                    if (multifileClassName == null) {
                        return null;
                    }
                    if (multifileClassName.length() > 0) {
                        return kotlin.reflect.jvm.internal.KPackageImpl.this.getJClass().getClassLoader().loadClass(kotlin.text.StringsKt.replace$default(multifileClassName, '/', '.', false, 4, (java.lang.Object) null));
                    }
                    return null;
                }
            });
            this.metadata = kotlin.reflect.jvm.internal.ReflectProperties.lazy(new kotlin.jvm.functions.Function0<kotlin.Triple<? extends kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmNameResolver, ? extends kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package, ? extends kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMetadataVersion>>() { // from class: kotlin.reflect.jvm.internal.KPackageImpl$Data$metadata$2
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final kotlin.Triple<? extends kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmNameResolver, ? extends kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package, ? extends kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMetadataVersion> invoke() {
                    kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader classHeader;
                    kotlin.reflect.jvm.internal.components.ReflectKotlinClass kotlinClass = this.this$0.getKotlinClass();
                    if (kotlinClass == null || (classHeader = kotlinClass.getClassHeader()) == null) {
                        return null;
                    }
                    java.lang.String[] data = classHeader.getData();
                    java.lang.String[] strings = classHeader.getStrings();
                    if (data == null || strings == null) {
                        return null;
                    }
                    kotlin.Pair<kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmNameResolver, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package> packageDataFrom = kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(data, strings);
                    return new kotlin.Triple<>(packageDataFrom.component1(), packageDataFrom.component2(), classHeader.getMetadataVersion());
                }
            });
            this.members = kotlin.reflect.jvm.internal.ReflectProperties.lazySoft(new kotlin.jvm.functions.Function0<java.util.Collection<? extends kotlin.reflect.jvm.internal.KCallableImpl<?>>>() { // from class: kotlin.reflect.jvm.internal.KPackageImpl$Data$members$2
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final java.util.Collection<? extends kotlin.reflect.jvm.internal.KCallableImpl<?>> invoke() {
                    return kotlin.reflect.jvm.internal.KPackageImpl.this.getMembers(this.this$0.getScope(), kotlin.reflect.jvm.internal.KDeclarationContainerImpl.MemberBelonginess.DECLARED);
                }
            });
        }
    }

    public KPackageImpl(java.lang.Class<?> jClass, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(jClass, "jClass");
        this.jClass = jClass;
        this.usageModuleName = str;
        kotlin.reflect.jvm.internal.ReflectProperties.LazyVal<kotlin.reflect.jvm.internal.KPackageImpl.Data> lazyValLazy = kotlin.reflect.jvm.internal.ReflectProperties.lazy(new kotlin.jvm.functions.Function0<kotlin.reflect.jvm.internal.KPackageImpl.Data>() { // from class: kotlin.reflect.jvm.internal.KPackageImpl$data$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final kotlin.reflect.jvm.internal.KPackageImpl.Data invoke() {
                return this.this$0.new Data();
            }
        });
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(lazyValLazy, "ReflectProperties.lazy { Data() }");
        this.data = lazyValLazy;
    }

    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    protected java.lang.Class<?> getMethodOwner() {
        java.lang.Class<?> multifileFacade = this.data.invoke().getMultifileFacade();
        return multifileFacade != null ? multifileFacade : getJClass();
    }

    private final kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope getScope() {
        return this.data.invoke().getScope();
    }

    @Override // kotlin.reflect.KDeclarationContainer
    public java.util.Collection<kotlin.reflect.KCallable<?>> getMembers() {
        return this.data.invoke().getMembers();
    }

    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    public java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor> getConstructorDescriptors() {
        return kotlin.collections.CollectionsKt.emptyList();
    }

    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    public java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor> getProperties(kotlin.reflect.jvm.internal.impl.name.Name name) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(name, "name");
        return getScope().getContributedVariables(name, kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation.FROM_REFLECTION);
    }

    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    public java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor> getFunctions(kotlin.reflect.jvm.internal.impl.name.Name name) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(name, "name");
        return getScope().getContributedFunctions(name, kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation.FROM_REFLECTION);
    }

    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    public kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor getLocalProperty(int index) {
        kotlin.Triple<kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmNameResolver, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package, kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMetadataVersion> metadata = this.data.invoke().getMetadata();
        if (metadata == null) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmNameResolver jvmNameResolverComponent1 = metadata.component1();
        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package packageComponent2 = metadata.component2();
        kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMetadataVersion jvmMetadataVersionComponent3 = metadata.component3();
        kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.GeneratedExtension<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package, java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property>> generatedExtension = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.packageLocalVariable;
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(generatedExtension, "JvmProtoBuf.packageLocalVariable");
        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property property = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property) kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoBufUtilKt.getExtensionOrNull(packageComponent2, generatedExtension, index);
        if (property == null) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable typeTable = packageComponent2.getTypeTable();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(typeTable, "packageProto.typeTable");
        return (kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor) kotlin.reflect.jvm.internal.UtilKt.deserializeToDescriptor(getJClass(), property, jvmNameResolverComponent1, new kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable(typeTable), jvmMetadataVersionComponent3, kotlin.reflect.jvm.internal.KPackageImpl$getLocalProperty$1$1$1.INSTANCE);
    }

    public boolean equals(java.lang.Object other) {
        return (other instanceof kotlin.reflect.jvm.internal.KPackageImpl) && kotlin.jvm.internal.Intrinsics.areEqual(getJClass(), ((kotlin.reflect.jvm.internal.KPackageImpl) other).getJClass());
    }

    public int hashCode() {
        return getJClass().hashCode();
    }

    public java.lang.String toString() {
        return "file class " + kotlin.reflect.jvm.internal.structure.ReflectClassUtilKt.getClassId(getJClass()).asSingleFqName();
    }
}
