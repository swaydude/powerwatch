package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

/* JADX INFO: compiled from: DeserializedMemberScope.kt */
/* JADX INFO: loaded from: classes2.dex */
public abstract class DeserializedMemberScope extends kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl {
    static final /* synthetic */ kotlin.reflect.KProperty[] $$delegatedProperties = {kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.class), "functionNamesLazy", "getFunctionNamesLazy()Ljava/util/Set;")), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.class), "variableNamesLazy", "getVariableNamesLazy()Ljava/util/Set;")), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.class), "classNames", "getClassNames$deserialization()Ljava/util/Set;"))};
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext c;
    private final kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue classNames$delegate;
    private final kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue functionNamesLazy$delegate;
    private final java.util.Map<kotlin.reflect.jvm.internal.impl.name.Name, byte[]> functionProtosBytes;
    private final kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull<kotlin.reflect.jvm.internal.impl.name.Name, java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor>> functions;
    private final kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull<kotlin.reflect.jvm.internal.impl.name.Name, java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor>> properties;
    private final java.util.Map<kotlin.reflect.jvm.internal.impl.name.Name, byte[]> propertyProtosBytes;
    private final kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable<kotlin.reflect.jvm.internal.impl.name.Name, kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor> typeAliasByName;
    private final java.util.Map<kotlin.reflect.jvm.internal.impl.name.Name, byte[]> typeAliasBytes;
    private final kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue variableNamesLazy$delegate;

    private final java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name> getFunctionNamesLazy() {
        return (java.util.Set) kotlin.reflect.jvm.internal.impl.storage.StorageKt.getValue(this.functionNamesLazy$delegate, this, (kotlin.reflect.KProperty<?>) $$delegatedProperties[0]);
    }

    private final java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name> getVariableNamesLazy() {
        return (java.util.Set) kotlin.reflect.jvm.internal.impl.storage.StorageKt.getValue(this.variableNamesLazy$delegate, this, (kotlin.reflect.KProperty<?>) $$delegatedProperties[1]);
    }

    protected abstract void addEnumEntryDescriptors(java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor> collection, kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.Name, java.lang.Boolean> function1);

    protected void computeNonDeclaredFunctions(kotlin.reflect.jvm.internal.impl.name.Name name, java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> functions) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(name, "name");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(functions, "functions");
    }

    protected void computeNonDeclaredProperties(kotlin.reflect.jvm.internal.impl.name.Name name, java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor> descriptors) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(name, "name");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(descriptors, "descriptors");
    }

    protected abstract kotlin.reflect.jvm.internal.impl.name.ClassId createClassId(kotlin.reflect.jvm.internal.impl.name.Name name);

    public final java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name> getClassNames$deserialization() {
        return (java.util.Set) kotlin.reflect.jvm.internal.impl.storage.StorageKt.getValue(this.classNames$delegate, this, (kotlin.reflect.KProperty<?>) $$delegatedProperties[2]);
    }

    protected abstract java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name> getNonDeclaredFunctionNames();

    protected abstract java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name> getNonDeclaredVariableNames();

    protected final kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext getC() {
        return this.c;
    }

    protected DeserializedMemberScope(kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext c, java.util.Collection<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function> functionList, java.util.Collection<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property> propertyList, java.util.Collection<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias> typeAliasList, final kotlin.jvm.functions.Function0<? extends java.util.Collection<kotlin.reflect.jvm.internal.impl.name.Name>> classNames) throws java.io.IOException {
        java.util.Map<kotlin.reflect.jvm.internal.impl.name.Name, byte[]> mapEmptyMap;
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(c, "c");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(functionList, "functionList");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(propertyList, "propertyList");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(typeAliasList, "typeAliasList");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(classNames, "classNames");
        this.c = c;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.lang.Object obj : functionList) {
            kotlin.reflect.jvm.internal.impl.name.Name name = kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt.getName(this.c.getNameResolver(), ((kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function) ((kotlin.reflect.jvm.internal.impl.protobuf.MessageLite) obj)).getName());
            java.lang.Object arrayList = linkedHashMap.get(name);
            if (arrayList == null) {
                arrayList = new java.util.ArrayList();
                linkedHashMap.put(name, arrayList);
            }
            ((java.util.List) arrayList).add(obj);
        }
        this.functionProtosBytes = packToByteArray(linkedHashMap);
        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
        for (java.lang.Object obj2 : propertyList) {
            kotlin.reflect.jvm.internal.impl.name.Name name2 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt.getName(this.c.getNameResolver(), ((kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property) ((kotlin.reflect.jvm.internal.impl.protobuf.MessageLite) obj2)).getName());
            java.lang.Object arrayList2 = linkedHashMap2.get(name2);
            if (arrayList2 == null) {
                arrayList2 = new java.util.ArrayList();
                linkedHashMap2.put(name2, arrayList2);
            }
            ((java.util.List) arrayList2).add(obj2);
        }
        this.propertyProtosBytes = packToByteArray(linkedHashMap2);
        if (!this.c.getComponents().getConfiguration().getTypeAliasesAllowed()) {
            mapEmptyMap = kotlin.collections.MapsKt.emptyMap();
        } else {
            java.util.LinkedHashMap linkedHashMap3 = new java.util.LinkedHashMap();
            for (java.lang.Object obj3 : typeAliasList) {
                kotlin.reflect.jvm.internal.impl.name.Name name3 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt.getName(this.c.getNameResolver(), ((kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias) ((kotlin.reflect.jvm.internal.impl.protobuf.MessageLite) obj3)).getName());
                java.lang.Object arrayList3 = linkedHashMap3.get(name3);
                if (arrayList3 == null) {
                    arrayList3 = new java.util.ArrayList();
                    linkedHashMap3.put(name3, arrayList3);
                }
                ((java.util.List) arrayList3).add(obj3);
            }
            mapEmptyMap = packToByteArray(linkedHashMap3);
        }
        this.typeAliasBytes = mapEmptyMap;
        this.functions = this.c.getStorageManager().createMemoizedFunction(new kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.name.Name, java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$functions$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> invoke(kotlin.reflect.jvm.internal.impl.name.Name it) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(it, "it");
                return this.this$0.computeFunctions(it);
            }
        });
        this.properties = this.c.getStorageManager().createMemoizedFunction(new kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.name.Name, java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$properties$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor> invoke(kotlin.reflect.jvm.internal.impl.name.Name it) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(it, "it");
                return this.this$0.computeProperties(it);
            }
        });
        this.typeAliasByName = this.c.getStorageManager().createMemoizedFunctionWithNullableValues(new kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.name.Name, kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$typeAliasByName$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor invoke(kotlin.reflect.jvm.internal.impl.name.Name it) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(it, "it");
                return this.this$0.createTypeAlias(it);
            }
        });
        this.functionNamesLazy$delegate = this.c.getStorageManager().createLazyValue(new kotlin.jvm.functions.Function0<java.util.Set<? extends kotlin.reflect.jvm.internal.impl.name.Name>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$functionNamesLazy$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final java.util.Set<? extends kotlin.reflect.jvm.internal.impl.name.Name> invoke() {
                return kotlin.collections.SetsKt.plus(this.this$0.functionProtosBytes.keySet(), (java.lang.Iterable) this.this$0.getNonDeclaredFunctionNames());
            }
        });
        this.variableNamesLazy$delegate = this.c.getStorageManager().createLazyValue(new kotlin.jvm.functions.Function0<java.util.Set<? extends kotlin.reflect.jvm.internal.impl.name.Name>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$variableNamesLazy$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final java.util.Set<? extends kotlin.reflect.jvm.internal.impl.name.Name> invoke() {
                return kotlin.collections.SetsKt.plus(this.this$0.propertyProtosBytes.keySet(), (java.lang.Iterable) this.this$0.getNonDeclaredVariableNames());
            }
        });
        this.classNames$delegate = this.c.getStorageManager().createLazyValue(new kotlin.jvm.functions.Function0<java.util.Set<? extends kotlin.reflect.jvm.internal.impl.name.Name>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$classNames$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final java.util.Set<? extends kotlin.reflect.jvm.internal.impl.name.Name> invoke() {
                return kotlin.collections.CollectionsKt.toSet((java.lang.Iterable) classNames.invoke());
            }
        });
    }

    private final java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name> getTypeAliasNames() {
        return this.typeAliasBytes.keySet();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name> getFunctionNames() {
        return getFunctionNamesLazy();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name> getVariableNames() {
        return getVariableNamesLazy();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x002a  */
    public final java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> computeFunctions(kotlin.reflect.jvm.internal.impl.name.Name name) {
        java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function> listEmptyList;
        java.util.Map<kotlin.reflect.jvm.internal.impl.name.Name, byte[]> map = this.functionProtosBytes;
        final kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function> parser = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function.PARSER;
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(parser, "ProtoBuf.Function.PARSER");
        byte[] bArr = map.get(name);
        if (bArr != null) {
            final java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(bArr);
            java.util.List list = kotlin.sequences.SequencesKt.toList(kotlin.sequences.SequencesKt.generateSequence(new kotlin.jvm.functions.Function0<M>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$computeDescriptors$$inlined$let$lambda$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Incorrect return type in method signature: ()TM; */
                @Override // kotlin.jvm.functions.Function0
                public final kotlin.reflect.jvm.internal.impl.protobuf.MessageLite invoke() {
                    return (kotlin.reflect.jvm.internal.impl.protobuf.MessageLite) parser.parseDelimitedFrom(byteArrayInputStream, this.getC().getComponents().getExtensionRegistryLite());
                }
            }));
            if (list != null) {
                listEmptyList = list;
            } else {
                listEmptyList = kotlin.collections.CollectionsKt.emptyList();
            }
        } else {
            listEmptyList = kotlin.collections.CollectionsKt.emptyList();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function it : listEmptyList) {
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer memberDeserializer = this.c.getMemberDeserializer();
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(it, "it");
            arrayList.add(memberDeserializer.loadFunction(it));
        }
        java.util.ArrayList arrayList2 = arrayList;
        computeNonDeclaredFunctions(name, arrayList2);
        return kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.compact(arrayList2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> getContributedFunctions(kotlin.reflect.jvm.internal.impl.name.Name name, kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation location) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(name, "name");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(location, "location");
        return !getFunctionNames().contains(name) ? kotlin.collections.CollectionsKt.emptyList() : this.functions.invoke(name);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x002a  */
    public final java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor> computeProperties(kotlin.reflect.jvm.internal.impl.name.Name name) {
        java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property> listEmptyList;
        java.util.Map<kotlin.reflect.jvm.internal.impl.name.Name, byte[]> map = this.propertyProtosBytes;
        final kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property> parser = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property.PARSER;
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(parser, "ProtoBuf.Property.PARSER");
        byte[] bArr = map.get(name);
        if (bArr != null) {
            final java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(bArr);
            java.util.List list = kotlin.sequences.SequencesKt.toList(kotlin.sequences.SequencesKt.generateSequence(new kotlin.jvm.functions.Function0<M>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$computeDescriptors$$inlined$let$lambda$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Incorrect return type in method signature: ()TM; */
                @Override // kotlin.jvm.functions.Function0
                public final kotlin.reflect.jvm.internal.impl.protobuf.MessageLite invoke() {
                    return (kotlin.reflect.jvm.internal.impl.protobuf.MessageLite) parser.parseDelimitedFrom(byteArrayInputStream, this.getC().getComponents().getExtensionRegistryLite());
                }
            }));
            if (list != null) {
                listEmptyList = list;
            } else {
                listEmptyList = kotlin.collections.CollectionsKt.emptyList();
            }
        } else {
            listEmptyList = kotlin.collections.CollectionsKt.emptyList();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property it : listEmptyList) {
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer memberDeserializer = this.c.getMemberDeserializer();
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(it, "it");
            arrayList.add(memberDeserializer.loadProperty(it));
        }
        java.util.ArrayList arrayList2 = arrayList;
        computeNonDeclaredProperties(name, arrayList2);
        return kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.compact(arrayList2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor createTypeAlias(kotlin.reflect.jvm.internal.impl.name.Name name) {
        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias delimitedFrom;
        byte[] bArr = this.typeAliasBytes.get(name);
        if (bArr == null || (delimitedFrom = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias.parseDelimitedFrom(new java.io.ByteArrayInputStream(bArr), this.c.getComponents().getExtensionRegistryLite())) == null) {
            return null;
        }
        return this.c.getMemberDeserializer().loadTypeAlias(delimitedFrom);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor> getContributedVariables(kotlin.reflect.jvm.internal.impl.name.Name name, kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation location) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(name, "name");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(location, "location");
        return !getVariableNames().contains(name) ? kotlin.collections.CollectionsKt.emptyList() : this.properties.invoke(name);
    }

    protected final java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor> computeDescriptors(kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter kindFilter, kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.Name, java.lang.Boolean> nameFilter, kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation location) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(kindFilter, "kindFilter");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(nameFilter, "nameFilter");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(location, "location");
        java.util.ArrayList arrayList = new java.util.ArrayList(0);
        if (kindFilter.acceptsKinds(kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter.Companion.getSINGLETON_CLASSIFIERS_MASK())) {
            addEnumEntryDescriptors(arrayList, nameFilter);
        }
        java.util.ArrayList arrayList2 = arrayList;
        addFunctionsAndProperties(arrayList2, kindFilter, nameFilter, location);
        if (kindFilter.acceptsKinds(kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter.Companion.getCLASSIFIERS_MASK())) {
            for (kotlin.reflect.jvm.internal.impl.name.Name name : getClassNames$deserialization()) {
                if (nameFilter.invoke(name).booleanValue()) {
                    kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.addIfNotNull(arrayList2, deserializeClass(name));
                }
            }
        }
        if (kindFilter.acceptsKinds(kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter.Companion.getTYPE_ALIASES_MASK())) {
            for (kotlin.reflect.jvm.internal.impl.name.Name name2 : getTypeAliasNames()) {
                if (nameFilter.invoke(name2).booleanValue()) {
                    kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.addIfNotNull(arrayList2, this.typeAliasByName.invoke(name2));
                }
            }
        }
        return kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.compact(arrayList);
    }

    private final void addFunctionsAndProperties(java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor> collection, kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter descriptorKindFilter, kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.Name, java.lang.Boolean> function1, kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation lookupLocation) {
        if (descriptorKindFilter.acceptsKinds(kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter.Companion.getVARIABLES_MASK())) {
            java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name> variableNames = getVariableNames();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (kotlin.reflect.jvm.internal.impl.name.Name name : variableNames) {
                if (function1.invoke(name).booleanValue()) {
                    arrayList.addAll(getContributedVariables(name, lookupLocation));
                }
            }
            kotlin.reflect.jvm.internal.impl.resolve.MemberComparator.NameAndTypeMemberComparator nameAndTypeMemberComparator = kotlin.reflect.jvm.internal.impl.resolve.MemberComparator.NameAndTypeMemberComparator.INSTANCE;
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(nameAndTypeMemberComparator, "MemberComparator.NameAnd…MemberComparator.INSTANCE");
            kotlin.collections.CollectionsKt.sortWith(arrayList, nameAndTypeMemberComparator);
            collection.addAll(arrayList);
        }
        if (descriptorKindFilter.acceptsKinds(kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter.Companion.getFUNCTIONS_MASK())) {
            java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name> functionNames = getFunctionNames();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (kotlin.reflect.jvm.internal.impl.name.Name name2 : functionNames) {
                if (function1.invoke(name2).booleanValue()) {
                    arrayList2.addAll(getContributedFunctions(name2, lookupLocation));
                }
            }
            kotlin.reflect.jvm.internal.impl.resolve.MemberComparator.NameAndTypeMemberComparator nameAndTypeMemberComparator2 = kotlin.reflect.jvm.internal.impl.resolve.MemberComparator.NameAndTypeMemberComparator.INSTANCE;
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(nameAndTypeMemberComparator2, "MemberComparator.NameAnd…MemberComparator.INSTANCE");
            kotlin.collections.CollectionsKt.sortWith(arrayList2, nameAndTypeMemberComparator2);
            collection.addAll(arrayList2);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    /* JADX INFO: renamed from: getContributedClassifier */
    public kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor mo1270getContributedClassifier(kotlin.reflect.jvm.internal.impl.name.Name name, kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation location) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(name, "name");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(location, "location");
        if (hasClass(name)) {
            return deserializeClass(name);
        }
        if (getTypeAliasNames().contains(name)) {
            return this.typeAliasByName.invoke(name);
        }
        return null;
    }

    private final kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor deserializeClass(kotlin.reflect.jvm.internal.impl.name.Name name) {
        return this.c.getComponents().deserializeClass(createClassId(name));
    }

    protected boolean hasClass(kotlin.reflect.jvm.internal.impl.name.Name name) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(name, "name");
        return getClassNames$deserialization().contains(name);
    }

    private final java.util.Map<kotlin.reflect.jvm.internal.impl.name.Name, byte[]> packToByteArray(java.util.Map<kotlin.reflect.jvm.internal.impl.name.Name, ? extends java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite>> map) throws java.io.IOException {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kotlin.collections.MapsKt.mapCapacity(map.size()));
        java.util.Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            java.lang.Object key = entry.getKey();
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            java.lang.Iterable iterable = (java.lang.Iterable) entry.getValue();
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(iterable, 10));
            java.util.Iterator it2 = iterable.iterator();
            while (it2.hasNext()) {
                ((kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite) it2.next()).writeDelimitedTo(byteArrayOutputStream);
                arrayList.add(kotlin.Unit.INSTANCE);
            }
            linkedHashMap.put(key, byteArrayOutputStream.toByteArray());
        }
        return linkedHashMap;
    }
}
