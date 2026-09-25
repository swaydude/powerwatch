package kotlin.reflect.jvm.internal;

/* JADX INFO: compiled from: KDeclarationContainerImpl.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\b\b \u0018\u0000 =2\u00020\u0001:\u0003=>?B\u0005¢\u0006\u0002\u0010\u0002J*\u0010\f\u001a\u00020\r2\u0010\u0010\u000e\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0014\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0014\u0010\u0018\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00192\u0006\u0010\u0010\u001a\u00020\u0011J\u0014\u0010\u001a\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00192\u0006\u0010\u0010\u001a\u00020\u0011J \u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u0013J\u0016\u0010\u001f\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\u00112\u0006\u0010!\u001a\u00020\u0011J\u0018\u0010\"\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0011J\u0016\u0010#\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u00112\u0006\u0010!\u001a\u00020\u0011J\u0016\u0010$\u001a\b\u0012\u0004\u0012\u00020 0\u00042\u0006\u0010\u001d\u001a\u00020%H&J\u0012\u0010&\u001a\u0004\u0018\u00010\u00172\u0006\u0010'\u001a\u00020(H&J\"\u0010)\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030*0\u00042\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.H\u0004J\u0016\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00170\u00042\u0006\u0010\u001d\u001a\u00020%H&J\u001a\u00100\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t012\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0014\u00102\u001a\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J$\u00103\u001a\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u00104\u001a\u00020(2\u0006\u00105\u001a\u00020(H\u0002J=\u00106\u001a\u0004\u0018\u00010\u001c*\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\u001d\u001a\u00020\u00112\u0010\u00107\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t082\n\u00109\u001a\u0006\u0012\u0002\b\u00030\tH\u0002¢\u0006\u0002\u0010:J8\u00106\u001a\u0004\u0018\u00010\u001c*\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\u001d\u001a\u00020\u00112\u0010\u00107\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t012\n\u00109\u001a\u0006\u0012\u0002\b\u00030\tH\u0002J(\u0010;\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0019*\u0006\u0012\u0002\b\u00030\t2\u0010\u00107\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t01H\u0002J=\u0010<\u001a\u0004\u0018\u00010\u001c*\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\u001d\u001a\u00020\u00112\u0010\u00107\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t082\n\u00109\u001a\u0006\u0012\u0002\b\u00030\tH\u0002¢\u0006\u0002\u0010:R\u0018\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001a\u0006\u0012\u0002\b\u00030\t8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006@"}, d2 = {"Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "Lkotlin/jvm/internal/ClassBasedDeclarationContainer;", "()V", "constructorDescriptors", "", "Lkotlin/reflect/jvm/internal/impl/descriptors/ConstructorDescriptor;", "getConstructorDescriptors", "()Ljava/util/Collection;", "methodOwner", "Ljava/lang/Class;", "getMethodOwner", "()Ljava/lang/Class;", "addParametersAndMasks", "", "result", "", "desc", "", "isConstructor", "", "createProperty", "Lkotlin/reflect/jvm/internal/KPropertyImpl;", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "findConstructorBySignature", "Ljava/lang/reflect/Constructor;", "findDefaultConstructor", "findDefaultMethod", "Ljava/lang/reflect/Method;", com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME, "isMember", "findFunctionDescriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;", "signature", "findMethodBySignature", "findPropertyDescriptor", "getFunctions", "Lkotlin/reflect/jvm/internal/impl/name/Name;", "getLocalProperty", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "", "getMembers", "Lkotlin/reflect/jvm/internal/KCallableImpl;", "scope", "Lkotlin/reflect/jvm/internal/impl/resolve/scopes/MemberScope;", "belonginess", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$MemberBelonginess;", "getProperties", "loadParameterTypes", "", "loadReturnType", "parseType", "begin", "end", "lookupMethod", "parameterTypes", "", "returnType", "(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/reflect/Method;", "tryGetConstructor", "tryGetMethod", "Companion", "Data", "MemberBelonginess", "kotlin-reflection"}, k = 1, mv = {1, 1, 15})
public abstract class KDeclarationContainerImpl implements kotlin.jvm.internal.ClassBasedDeclarationContainer {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final kotlin.reflect.jvm.internal.KDeclarationContainerImpl.Companion INSTANCE = new kotlin.reflect.jvm.internal.KDeclarationContainerImpl.Companion(null);
    private static final java.lang.Class<?> DEFAULT_CONSTRUCTOR_MARKER = java.lang.Class.forName("kotlin.jvm.internal.DefaultConstructorMarker");
    private static final kotlin.text.Regex LOCAL_PROPERTY_SIGNATURE = new kotlin.text.Regex("<v#(\\d+)>");

    public abstract java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor> getConstructorDescriptors();

    public abstract java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor> getFunctions(kotlin.reflect.jvm.internal.impl.name.Name name);

    public abstract kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor getLocalProperty(int index);

    public abstract java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor> getProperties(kotlin.reflect.jvm.internal.impl.name.Name name);

    /* JADX INFO: compiled from: KDeclarationContainerImpl.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b¦\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$Data;", "", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;)V", "moduleData", "Lkotlin/reflect/jvm/internal/components/RuntimeModuleData;", "getModuleData", "()Lkotlin/reflect/jvm/internal/components/RuntimeModuleData;", "moduleData$delegate", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", "kotlin-reflection"}, k = 1, mv = {1, 1, 15})
    public abstract class Data {
        static final /* synthetic */ kotlin.reflect.KProperty[] $$delegatedProperties = {kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlin.reflect.jvm.internal.KDeclarationContainerImpl.Data.class), "moduleData", "getModuleData()Lkotlin/reflect/jvm/internal/components/RuntimeModuleData;"))};

        /* JADX INFO: renamed from: moduleData$delegate, reason: from kotlin metadata */
        private final kotlin.reflect.jvm.internal.ReflectProperties.LazySoftVal moduleData = kotlin.reflect.jvm.internal.ReflectProperties.lazySoft(new kotlin.jvm.functions.Function0<kotlin.reflect.jvm.internal.components.RuntimeModuleData>() { // from class: kotlin.reflect.jvm.internal.KDeclarationContainerImpl$Data$moduleData$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final kotlin.reflect.jvm.internal.components.RuntimeModuleData invoke() {
                return kotlin.reflect.jvm.internal.ModuleByClassLoaderKt.getOrCreateModule(kotlin.reflect.jvm.internal.KDeclarationContainerImpl.this.getJClass());
            }
        });

        /* JADX WARN: Multi-variable type inference failed */
        public final kotlin.reflect.jvm.internal.components.RuntimeModuleData getModuleData() {
            return (kotlin.reflect.jvm.internal.components.RuntimeModuleData) this.moduleData.getValue(this, $$delegatedProperties[0]);
        }

        public Data() {
        }
    }

    protected java.lang.Class<?> getMethodOwner() {
        java.lang.Class<?> wrapperByPrimitive = kotlin.reflect.jvm.internal.structure.ReflectClassUtilKt.getWrapperByPrimitive(getJClass());
        return wrapperByPrimitive != null ? wrapperByPrimitive : getJClass();
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0055  */
    protected final java.util.Collection<kotlin.reflect.jvm.internal.KCallableImpl<?>> getMembers(kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope scope, kotlin.reflect.jvm.internal.KDeclarationContainerImpl.MemberBelonginess belonginess) {
        kotlin.reflect.jvm.internal.KCallableImpl kCallableImpl;
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(scope, "scope");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(belonginess, "belonginess");
        kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorVisitorEmptyBodies<kotlin.reflect.jvm.internal.KCallableImpl<?>, kotlin.Unit> declarationDescriptorVisitorEmptyBodies = new kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorVisitorEmptyBodies<kotlin.reflect.jvm.internal.KCallableImpl<?>, kotlin.Unit>() { // from class: kotlin.reflect.jvm.internal.KDeclarationContainerImpl$getMembers$visitor$1
            @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorVisitorEmptyBodies, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
            public kotlin.reflect.jvm.internal.KCallableImpl<?> visitPropertyDescriptor(kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor descriptor, kotlin.Unit data) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(descriptor, "descriptor");
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(data, "data");
                return this.this$0.createProperty(descriptor);
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorVisitorEmptyBodies, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
            public kotlin.reflect.jvm.internal.KCallableImpl<?> visitFunctionDescriptor(kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor descriptor, kotlin.Unit data) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(descriptor, "descriptor");
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(data, "data");
                return new kotlin.reflect.jvm.internal.KFunctionImpl(this.this$0, descriptor);
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorVisitorEmptyBodies, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
            public kotlin.reflect.jvm.internal.KCallableImpl<?> visitConstructorDescriptor(kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor descriptor, kotlin.Unit data) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(descriptor, "descriptor");
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(data, "data");
                throw new java.lang.IllegalStateException("No constructors should appear in this scope: " + descriptor);
            }
        };
        java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor> contributedDescriptors$default = kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope.DefaultImpls.getContributedDescriptors$default(scope, null, null, 3, null);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor : contributedDescriptors$default) {
            if (declarationDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) {
                kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor = (kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) declarationDescriptor;
                if ((!kotlin.jvm.internal.Intrinsics.areEqual(callableMemberDescriptor.getVisibility(), kotlin.reflect.jvm.internal.impl.descriptors.Visibilities.INVISIBLE_FAKE)) && belonginess.accept(callableMemberDescriptor)) {
                    kCallableImpl = (kotlin.reflect.jvm.internal.KCallableImpl) declarationDescriptor.accept(declarationDescriptorVisitorEmptyBodies, kotlin.Unit.INSTANCE);
                } else {
                    kCallableImpl = null;
                }
            } else {
                kCallableImpl = null;
            }
            if (kCallableImpl != null) {
                arrayList.add(kCallableImpl);
            }
        }
        return kotlin.collections.CollectionsKt.toList(arrayList);
    }

    /* JADX INFO: compiled from: KDeclarationContainerImpl.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0084\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$MemberBelonginess;", "", "(Ljava/lang/String;I)V", "accept", "", "member", "Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;", "DECLARED", "INHERITED", "kotlin-reflection"}, k = 1, mv = {1, 1, 15})
    protected enum MemberBelonginess {
        DECLARED,
        INHERITED;

        public final boolean accept(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor member) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(member, "member");
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind kind = member.getKind();
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(kind, "member.kind");
            return kind.isReal() == (this == DECLARED);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kotlin.reflect.jvm.internal.KPropertyImpl<?> createProperty(kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor descriptor) {
        int i = (descriptor.getDispatchReceiverParameter() != null ? 1 : 0) + (descriptor.getExtensionReceiverParameter() != null ? 1 : 0);
        if (descriptor.isVar()) {
            if (i == 0) {
                return new kotlin.reflect.jvm.internal.KMutableProperty0Impl(this, descriptor);
            }
            if (i == 1) {
                return new kotlin.reflect.jvm.internal.KMutableProperty1Impl(this, descriptor);
            }
            if (i == 2) {
                return new kotlin.reflect.jvm.internal.KMutableProperty2Impl(this, descriptor);
            }
        } else {
            if (i == 0) {
                return new kotlin.reflect.jvm.internal.KProperty0Impl(this, descriptor);
            }
            if (i == 1) {
                return new kotlin.reflect.jvm.internal.KProperty1Impl(this, descriptor);
            }
            if (i == 2) {
                return new kotlin.reflect.jvm.internal.KProperty2Impl(this, descriptor);
            }
        }
        throw new kotlin.reflect.jvm.internal.KotlinReflectionInternalError("Unsupported property: " + descriptor);
    }

    public final kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor findPropertyDescriptor(java.lang.String name, java.lang.String signature) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(name, "name");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(signature, "signature");
        kotlin.text.MatchResult matchResultMatchEntire = LOCAL_PROPERTY_SIGNATURE.matchEntire(signature);
        if (matchResultMatchEntire != null) {
            java.lang.String str = matchResultMatchEntire.getDestructured().getMatch().getGroupValues().get(1);
            kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor localProperty = getLocalProperty(java.lang.Integer.parseInt(str));
            if (localProperty != null) {
                return localProperty;
            }
            throw new kotlin.reflect.jvm.internal.KotlinReflectionInternalError("Local property #" + str + " not found in " + getJClass());
        }
        kotlin.reflect.jvm.internal.impl.name.Name nameIdentifier = kotlin.reflect.jvm.internal.impl.name.Name.identifier(name);
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(nameIdentifier, "Name.identifier(name)");
        java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor> properties = getProperties(nameIdentifier);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : properties) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(kotlin.reflect.jvm.internal.RuntimeTypeMapper.INSTANCE.mapPropertySignature((kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor) obj).getString(), signature)) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = arrayList;
        if (arrayList2.isEmpty()) {
            throw new kotlin.reflect.jvm.internal.KotlinReflectionInternalError("Property '" + name + "' (JVM signature: " + signature + ") not resolved in " + this);
        }
        if (arrayList2.size() == 1) {
            return (kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor) kotlin.collections.CollectionsKt.single((java.util.List) arrayList2);
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.lang.Object obj2 : arrayList2) {
            kotlin.reflect.jvm.internal.impl.descriptors.Visibility visibility = ((kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor) obj2).getVisibility();
            java.lang.Object arrayList3 = linkedHashMap.get(visibility);
            if (arrayList3 == null) {
                arrayList3 = new java.util.ArrayList();
                linkedHashMap.put(visibility, arrayList3);
            }
            ((java.util.List) arrayList3).add(obj2);
        }
        java.util.Collection collectionValues = kotlin.collections.MapsKt.toSortedMap(linkedHashMap, new java.util.Comparator<kotlin.reflect.jvm.internal.impl.descriptors.Visibility>() { // from class: kotlin.reflect.jvm.internal.KDeclarationContainerImpl$findPropertyDescriptor$mostVisibleProperties$2
            @Override // java.util.Comparator
            public final int compare(kotlin.reflect.jvm.internal.impl.descriptors.Visibility visibility2, kotlin.reflect.jvm.internal.impl.descriptors.Visibility visibility3) {
                java.lang.Integer numCompare = kotlin.reflect.jvm.internal.impl.descriptors.Visibilities.compare(visibility2, visibility3);
                if (numCompare != null) {
                    return numCompare.intValue();
                }
                return 0;
            }
        }).values();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(collectionValues, "properties\n             …                }).values");
        java.util.List mostVisibleProperties = (java.util.List) kotlin.collections.CollectionsKt.last(collectionValues);
        if (mostVisibleProperties.size() == 1) {
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(mostVisibleProperties, "mostVisibleProperties");
            return (kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor) kotlin.collections.CollectionsKt.first(mostVisibleProperties);
        }
        kotlin.reflect.jvm.internal.impl.name.Name nameIdentifier2 = kotlin.reflect.jvm.internal.impl.name.Name.identifier(name);
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(nameIdentifier2, "Name.identifier(name)");
        java.lang.String strJoinToString$default = kotlin.collections.CollectionsKt.joinToString$default(getProperties(nameIdentifier2), "\n", null, null, 0, null, new kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor, java.lang.String>() { // from class: kotlin.reflect.jvm.internal.KDeclarationContainerImpl$findPropertyDescriptor$allMembers$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.String invoke(kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor descriptor) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(descriptor, "descriptor");
                return kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer.DEBUG_TEXT.render(descriptor) + " | " + kotlin.reflect.jvm.internal.RuntimeTypeMapper.INSTANCE.mapPropertySignature(descriptor);
            }
        }, 30, null);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("Property '");
        sb.append(name);
        sb.append("' (JVM signature: ");
        sb.append(signature);
        sb.append(") not resolved in ");
        sb.append(this);
        sb.append(':');
        sb.append(strJoinToString$default.length() == 0 ? " no members found" : '\n' + strJoinToString$default);
        throw new kotlin.reflect.jvm.internal.KotlinReflectionInternalError(sb.toString());
    }

    public final kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor findFunctionDescriptor(java.lang.String name, java.lang.String signature) {
        java.util.List functions;
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(name, "name");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(signature, "signature");
        if (kotlin.jvm.internal.Intrinsics.areEqual(name, "<init>")) {
            functions = kotlin.collections.CollectionsKt.toList(getConstructorDescriptors());
        } else {
            kotlin.reflect.jvm.internal.impl.name.Name nameIdentifier = kotlin.reflect.jvm.internal.impl.name.Name.identifier(name);
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(nameIdentifier, "Name.identifier(name)");
            functions = getFunctions(nameIdentifier);
        }
        java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor> collection = functions;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : collection) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(kotlin.reflect.jvm.internal.RuntimeTypeMapper.INSTANCE.mapSignature((kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor) obj).get_signature(), signature)) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = arrayList;
        if (arrayList2.size() != 1) {
            java.lang.String strJoinToString$default = kotlin.collections.CollectionsKt.joinToString$default(collection, "\n", null, null, 0, null, new kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor, java.lang.String>() { // from class: kotlin.reflect.jvm.internal.KDeclarationContainerImpl$findFunctionDescriptor$allMembers$1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.String invoke(kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor descriptor) {
                    kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(descriptor, "descriptor");
                    return kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer.DEBUG_TEXT.render(descriptor) + " | " + kotlin.reflect.jvm.internal.RuntimeTypeMapper.INSTANCE.mapSignature(descriptor);
                }
            }, 30, null);
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append("Function '");
            sb.append(name);
            sb.append("' (JVM signature: ");
            sb.append(signature);
            sb.append(") not resolved in ");
            sb.append(this);
            sb.append(':');
            sb.append(strJoinToString$default.length() == 0 ? " no members found" : '\n' + strJoinToString$default);
            throw new kotlin.reflect.jvm.internal.KotlinReflectionInternalError(sb.toString());
        }
        return (kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor) kotlin.collections.CollectionsKt.single((java.util.List) arrayList2);
    }

    private final java.lang.reflect.Method lookupMethod(java.lang.Class<?> cls, java.lang.String str, java.util.List<? extends java.lang.Class<?>> list, java.lang.Class<?> cls2) {
        java.util.List<? extends java.lang.Class<?>> list2 = list;
        if (list2 == null) {
            throw new kotlin.TypeCastException("null cannot be cast to non-null type java.util.Collection<T>");
        }
        java.lang.Object[] array = list2.toArray(new java.lang.Class[0]);
        if (array != null) {
            java.lang.reflect.Method methodLookupMethod = lookupMethod(cls, str, (java.lang.Class<?>[]) array, cls2);
            if (methodLookupMethod != null) {
                return methodLookupMethod;
            }
            if (!cls.isInterface()) {
                return null;
            }
            if (list2 == null) {
                throw new kotlin.TypeCastException("null cannot be cast to non-null type java.util.Collection<T>");
            }
            java.lang.Object[] array2 = list2.toArray(new java.lang.Class[0]);
            if (array2 != null) {
                java.lang.reflect.Method methodLookupMethod2 = lookupMethod(java.lang.Object.class, str, (java.lang.Class<?>[]) array2, cls2);
                if (methodLookupMethod2 != null) {
                    return methodLookupMethod2;
                }
                return null;
            }
            throw new kotlin.TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        throw new kotlin.TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    private final java.lang.reflect.Method lookupMethod(java.lang.Class<?> cls, java.lang.String str, java.lang.Class<?>[] clsArr, java.lang.Class<?> cls2) {
        java.lang.reflect.Method methodLookupMethod;
        java.lang.reflect.Method methodTryGetMethod = tryGetMethod(cls, str, clsArr, cls2);
        if (methodTryGetMethod != null) {
            return methodTryGetMethod;
        }
        java.lang.Class<? super java.lang.Object> superclass = cls.getSuperclass();
        if (superclass != null && (methodLookupMethod = lookupMethod(superclass, str, clsArr, cls2)) != null) {
            return methodLookupMethod;
        }
        for (java.lang.Class<?> superInterface : cls.getInterfaces()) {
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(superInterface, "superInterface");
            java.lang.reflect.Method methodLookupMethod2 = lookupMethod(superInterface, str, clsArr, cls2);
            if (methodLookupMethod2 != null) {
                return methodLookupMethod2;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0057  */
    private final java.lang.reflect.Method tryGetMethod(java.lang.Class<?> cls, java.lang.String str, java.lang.Class<?>[] clsArr, java.lang.Class<?> cls2) {
        boolean z;
        try {
            java.lang.reflect.Method result = cls.getDeclaredMethod(str, (java.lang.Class[]) java.util.Arrays.copyOf(clsArr, clsArr.length));
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(result, "result");
            if (kotlin.jvm.internal.Intrinsics.areEqual(result.getReturnType(), cls2)) {
                return result;
            }
            java.lang.reflect.Method[] declaredMethods = cls.getDeclaredMethods();
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(declaredMethods, "declaredMethods");
            for (java.lang.reflect.Method method : declaredMethods) {
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(method, "method");
                if (kotlin.jvm.internal.Intrinsics.areEqual(method.getName(), str) && kotlin.jvm.internal.Intrinsics.areEqual(method.getReturnType(), cls2)) {
                    java.lang.Class<?>[] parameterTypes = method.getParameterTypes();
                    if (parameterTypes == null) {
                        kotlin.jvm.internal.Intrinsics.throwNpe();
                    }
                    if (java.util.Arrays.equals(parameterTypes, clsArr)) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else {
                    z = false;
                }
                if (z) {
                    return method;
                }
            }
            return null;
        } catch (java.lang.NoSuchMethodException unused) {
            return null;
        }
    }

    private final java.lang.reflect.Constructor<?> tryGetConstructor(java.lang.Class<?> cls, java.util.List<? extends java.lang.Class<?>> list) {
        try {
            java.util.List<? extends java.lang.Class<?>> list2 = list;
            if (list2 == null) {
                throw new kotlin.TypeCastException("null cannot be cast to non-null type java.util.Collection<T>");
            }
            java.lang.Object[] array = list2.toArray(new java.lang.Class[0]);
            if (array != null) {
                java.lang.Class[] clsArr = (java.lang.Class[]) array;
                return cls.getDeclaredConstructor((java.lang.Class[]) java.util.Arrays.copyOf(clsArr, clsArr.length));
            }
            throw new kotlin.TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
        } catch (java.lang.NoSuchMethodException unused) {
            return null;
        }
    }

    public final java.lang.reflect.Method findMethodBySignature(java.lang.String name, java.lang.String desc) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(name, "name");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(desc, "desc");
        if (kotlin.jvm.internal.Intrinsics.areEqual(name, "<init>")) {
            return null;
        }
        return lookupMethod(getMethodOwner(), name, loadParameterTypes(desc), loadReturnType(desc));
    }

    public final java.lang.reflect.Method findDefaultMethod(java.lang.String name, java.lang.String desc, boolean isMember) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(name, "name");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(desc, "desc");
        if (kotlin.jvm.internal.Intrinsics.areEqual(name, "<init>")) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (isMember) {
            arrayList.add(getJClass());
        }
        java.util.ArrayList arrayList2 = arrayList;
        addParametersAndMasks(arrayList2, desc, false);
        return lookupMethod(getMethodOwner(), name + "$default", arrayList2, loadReturnType(desc));
    }

    public final java.lang.reflect.Constructor<?> findConstructorBySignature(java.lang.String desc) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(desc, "desc");
        return tryGetConstructor(getJClass(), loadParameterTypes(desc));
    }

    public final java.lang.reflect.Constructor<?> findDefaultConstructor(java.lang.String desc) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(desc, "desc");
        java.lang.Class<?> jClass = getJClass();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        addParametersAndMasks(arrayList, desc, true);
        return tryGetConstructor(jClass, arrayList);
    }

    private final void addParametersAndMasks(java.util.List<java.lang.Class<?>> result, java.lang.String desc, boolean isConstructor) {
        java.util.List<java.lang.Class<?>> listLoadParameterTypes = loadParameterTypes(desc);
        result.addAll(listLoadParameterTypes);
        int size = ((listLoadParameterTypes.size() + 32) - 1) / 32;
        for (int i = 0; i < size; i++) {
            java.lang.Class<?> cls = java.lang.Integer.TYPE;
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(cls, "Integer.TYPE");
            result.add(cls);
        }
        java.lang.Class<?> cls2 = isConstructor ? DEFAULT_CONSTRUCTOR_MARKER : java.lang.Object.class;
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(cls2, "if (isConstructor) DEFAU…RKER else Any::class.java");
        result.add(cls2);
    }

    private final java.util.List<java.lang.Class<?>> loadParameterTypes(java.lang.String desc) {
        int iIndexOf$default;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i = 1;
        while (desc.charAt(i) != ')') {
            int i2 = i;
            while (desc.charAt(i2) == '[') {
                i2++;
            }
            char cCharAt = desc.charAt(i2);
            if (kotlin.text.StringsKt.contains$default((java.lang.CharSequence) "VZCBSIFJD", cCharAt, false, 2, (java.lang.Object) null)) {
                iIndexOf$default = i2 + 1;
            } else if (cCharAt == 'L') {
                iIndexOf$default = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) desc, ';', i, false, 4, (java.lang.Object) null) + 1;
            } else {
                throw new kotlin.reflect.jvm.internal.KotlinReflectionInternalError("Unknown type prefix in the method signature: " + desc);
            }
            arrayList.add(parseType(desc, i, iIndexOf$default));
            i = iIndexOf$default;
        }
        return arrayList;
    }

    private final java.lang.Class<?> parseType(java.lang.String desc, int begin, int end) throws java.lang.ClassNotFoundException {
        char cCharAt = desc.charAt(begin);
        if (cCharAt == 'F') {
            return java.lang.Float.TYPE;
        }
        if (cCharAt == 'L') {
            java.lang.ClassLoader safeClassLoader = kotlin.reflect.jvm.internal.structure.ReflectClassUtilKt.getSafeClassLoader(getJClass());
            int i = begin + 1;
            int i2 = end - 1;
            if (desc == null) {
                throw new kotlin.TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
            java.lang.String strSubstring = desc.substring(i, i2);
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            java.lang.Class<?> clsLoadClass = safeClassLoader.loadClass(kotlin.text.StringsKt.replace$default(strSubstring, '/', '.', false, 4, (java.lang.Object) null));
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(clsLoadClass, "jClass.safeClassLoader.l…d - 1).replace('/', '.'))");
            return clsLoadClass;
        }
        if (cCharAt == 'S') {
            return java.lang.Short.TYPE;
        }
        if (cCharAt == 'V') {
            java.lang.Class<?> cls = java.lang.Void.TYPE;
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(cls, "Void.TYPE");
            return cls;
        }
        if (cCharAt == 'I') {
            return java.lang.Integer.TYPE;
        }
        if (cCharAt == 'J') {
            return java.lang.Long.TYPE;
        }
        if (cCharAt == 'Z') {
            return java.lang.Boolean.TYPE;
        }
        if (cCharAt == '[') {
            return kotlin.reflect.jvm.internal.structure.ReflectClassUtilKt.createArrayType(parseType(desc, begin + 1, end));
        }
        switch (cCharAt) {
            case 'B':
                return java.lang.Byte.TYPE;
            case 'C':
                return java.lang.Character.TYPE;
            case 'D':
                return java.lang.Double.TYPE;
            default:
                throw new kotlin.reflect.jvm.internal.KotlinReflectionInternalError("Unknown type prefix in the method signature: " + desc);
        }
    }

    private final java.lang.Class<?> loadReturnType(java.lang.String desc) {
        return parseType(desc, kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) desc, ')', 0, false, 6, (java.lang.Object) null) + 1, desc.length());
    }

    /* JADX INFO: compiled from: KDeclarationContainerImpl.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u0012\u0012\u0002\b\u0003 \u0005*\b\u0012\u0002\b\u0003\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0007X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$Companion;", "", "()V", "DEFAULT_CONSTRUCTOR_MARKER", "Ljava/lang/Class;", "kotlin.jvm.PlatformType", "LOCAL_PROPERTY_SIGNATURE", "Lkotlin/text/Regex;", "getLOCAL_PROPERTY_SIGNATURE$kotlin_reflection", "()Lkotlin/text/Regex;", "kotlin-reflection"}, k = 1, mv = {1, 1, 15})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final kotlin.text.Regex getLOCAL_PROPERTY_SIGNATURE$kotlin_reflection() {
            return kotlin.reflect.jvm.internal.KDeclarationContainerImpl.LOCAL_PROPERTY_SIGNATURE;
        }
    }
}
