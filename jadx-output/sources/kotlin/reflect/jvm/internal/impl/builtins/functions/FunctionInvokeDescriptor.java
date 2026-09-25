package kotlin.reflect.jvm.internal.impl.builtins.functions;

/* JADX INFO: compiled from: FunctionInvokeDescriptor.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class FunctionInvokeDescriptor extends kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl {
    public static final kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionInvokeDescriptor.Factory Factory = new kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionInvokeDescriptor.Factory(null);

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isExternal() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    public boolean isInline() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    public boolean isTailrec() {
        return false;
    }

    public /* synthetic */ FunctionInvokeDescriptor(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor, kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionInvokeDescriptor functionInvokeDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind kind, boolean z, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(declarationDescriptor, functionInvokeDescriptor, kind, z);
    }

    private FunctionInvokeDescriptor(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor, kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionInvokeDescriptor functionInvokeDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind kind, boolean z) {
        super(declarationDescriptor, functionInvokeDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations.Companion.getEMPTY(), kotlin.reflect.jvm.internal.impl.util.OperatorNameConventions.INVOKE, kind, kotlin.reflect.jvm.internal.impl.descriptors.SourceElement.NO_SOURCE);
        setOperator(true);
        setSuspend(z);
        setHasStableParameterNames(false);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl
    protected kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor doSubstitute(kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl.CopyConfiguration configuration) {
        kotlin.reflect.jvm.internal.impl.types.KotlinType type;
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(configuration, "configuration");
        kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionInvokeDescriptor functionInvokeDescriptor = (kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionInvokeDescriptor) super.doSubstitute(configuration);
        if (functionInvokeDescriptor == null) {
            return null;
        }
        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> valueParameters = functionInvokeDescriptor.getValueParameters();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(valueParameters, "substituted.valueParameters");
        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> list = valueParameters;
        boolean z = false;
        if ((list instanceof java.util.Collection) && list.isEmpty()) {
            z = true;
            break;
        }
        java.util.Iterator<T> it = list.iterator();
        do {
            if (!it.hasNext()) {
                z = true;
                break;
            }
            kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor it2 = (kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor) it.next();
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(it2, "it");
            type = it2.getType();
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(type, "it.type");
        } while (!(kotlin.reflect.jvm.internal.impl.builtins.FunctionTypesKt.extractParameterNameFromFunctionTypeArgument(type) != null));
        if (z) {
            return functionInvokeDescriptor;
        }
        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> valueParameters2 = functionInvokeDescriptor.getValueParameters();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(valueParameters2, "substituted.valueParameters");
        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> list2 = valueParameters2;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor it3 : list2) {
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(it3, "it");
            kotlin.reflect.jvm.internal.impl.types.KotlinType type2 = it3.getType();
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(type2, "it.type");
            arrayList.add(kotlin.reflect.jvm.internal.impl.builtins.FunctionTypesKt.extractParameterNameFromFunctionTypeArgument(type2));
        }
        return functionInvokeDescriptor.replaceParameterNames(arrayList);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl
    protected kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl createSubstitutedCopy(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor newOwner, kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor functionDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind kind, kotlin.reflect.jvm.internal.impl.name.Name name, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations, kotlin.reflect.jvm.internal.impl.descriptors.SourceElement source) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(newOwner, "newOwner");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(kind, "kind");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(annotations, "annotations");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(source, "source");
        return new kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionInvokeDescriptor(newOwner, (kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionInvokeDescriptor) functionDescriptor, kind, isSuspend());
    }

    private final kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor replaceParameterNames(java.util.List<kotlin.reflect.jvm.internal.impl.name.Name> list) {
        kotlin.reflect.jvm.internal.impl.name.Name name;
        int size = getValueParameters().size() - list.size();
        boolean z = true;
        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> valueParameters = getValueParameters();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(valueParameters, "valueParameters");
        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> list2 = valueParameters;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor it : list2) {
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(it, "it");
            kotlin.reflect.jvm.internal.impl.name.Name name2 = it.getName();
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(name2, "it.name");
            int index = it.getIndex();
            int i = index - size;
            if (i >= 0 && (name = list.get(i)) != null) {
                name2 = name;
            }
            arrayList.add(it.copy(this, name2, index));
        }
        java.util.ArrayList arrayList2 = arrayList;
        kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl.CopyConfiguration copyConfigurationNewCopyBuilder = newCopyBuilder(kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor.EMPTY);
        java.util.List<kotlin.reflect.jvm.internal.impl.name.Name> list3 = list;
        if (!(list3 instanceof java.util.Collection) || !list3.isEmpty()) {
            java.util.Iterator<T> it2 = list3.iterator();
            do {
                if (!it2.hasNext()) {
                    z = false;
                    break;
                }
            } while (!(((kotlin.reflect.jvm.internal.impl.name.Name) it2.next()) == null));
        } else {
            z = false;
            break;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl.CopyConfiguration original = copyConfigurationNewCopyBuilder.setHasSynthesizedParameterNames(z).setValueParameters((java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor>) arrayList2).setOriginal((kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) getOriginal());
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(original, "newCopyBuilder(TypeSubst…   .setOriginal(original)");
        kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor functionDescriptorDoSubstitute = super.doSubstitute(original);
        if (functionDescriptorDoSubstitute == null) {
            kotlin.jvm.internal.Intrinsics.throwNpe();
        }
        return functionDescriptorDoSubstitute;
    }

    /* JADX INFO: compiled from: FunctionInvokeDescriptor.kt */
    public static final class Factory {
        private Factory() {
        }

        public /* synthetic */ Factory(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionInvokeDescriptor create(kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassDescriptor functionClass, boolean z) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(functionClass, "functionClass");
            java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> declaredTypeParameters = functionClass.getDeclaredTypeParameters();
            kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionInvokeDescriptor functionInvokeDescriptor = new kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionInvokeDescriptor(functionClass, null, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind.DECLARATION, z, null);
            kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor thisAsReceiverParameter = functionClass.getThisAsReceiverParameter();
            java.util.List listEmptyList = kotlin.collections.CollectionsKt.emptyList();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : declaredTypeParameters) {
                if (!(((kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor) obj).getVariance() == kotlin.reflect.jvm.internal.impl.types.Variance.IN_VARIANCE)) {
                    break;
                }
                arrayList.add(obj);
            }
            java.lang.Iterable<kotlin.collections.IndexedValue> iterableWithIndex = kotlin.collections.CollectionsKt.withIndex(arrayList);
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(iterableWithIndex, 10));
            for (kotlin.collections.IndexedValue indexedValue : iterableWithIndex) {
                arrayList2.add(kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionInvokeDescriptor.Factory.createValueParameter(functionInvokeDescriptor, indexedValue.getIndex(), (kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor) indexedValue.getValue()));
            }
            functionInvokeDescriptor.initialize((kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor) null, thisAsReceiverParameter, listEmptyList, (java.util.List) arrayList2, (kotlin.reflect.jvm.internal.impl.types.KotlinType) ((kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor) kotlin.collections.CollectionsKt.last((java.util.List) declaredTypeParameters)).getDefaultType(), kotlin.reflect.jvm.internal.impl.descriptors.Modality.ABSTRACT, kotlin.reflect.jvm.internal.impl.descriptors.Visibilities.PUBLIC);
            functionInvokeDescriptor.setHasSynthesizedParameterNames(true);
            return functionInvokeDescriptor;
        }

        /* JADX WARN: Code duplicated, block: B:13:0x0030 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:14:0x0032  */
        /* JADX WARN: Code duplicated, block: B:17:0x0070  */
        private final kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor createValueParameter(kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionInvokeDescriptor functionInvokeDescriptor, int i, kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor typeParameterDescriptor) {
            java.lang.String lowerCase;
            java.lang.String strAsString = typeParameterDescriptor.getName().asString();
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(strAsString, "typeParameter.name.asString()");
            int iHashCode = strAsString.hashCode();
            if (iHashCode != 69) {
                if (iHashCode == 84 && strAsString.equals("T")) {
                    lowerCase = "instance";
                } else if (strAsString != null) {
                    lowerCase = strAsString.toLowerCase();
                    kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(lowerCase, "(this as java.lang.String).toLowerCase()");
                } else {
                    throw new kotlin.TypeCastException("null cannot be cast to non-null type java.lang.String");
                }
            } else if (strAsString.equals("E")) {
                lowerCase = "receiver";
            } else if (strAsString != null) {
                lowerCase = strAsString.toLowerCase();
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(lowerCase, "(this as java.lang.String).toLowerCase()");
            } else {
                throw new kotlin.TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations empty = kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations.Companion.getEMPTY();
            kotlin.reflect.jvm.internal.impl.name.Name nameIdentifier = kotlin.reflect.jvm.internal.impl.name.Name.identifier(lowerCase);
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(nameIdentifier, "Name.identifier(name)");
            kotlin.reflect.jvm.internal.impl.types.SimpleType defaultType = typeParameterDescriptor.getDefaultType();
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(defaultType, "typeParameter.defaultType");
            kotlin.reflect.jvm.internal.impl.descriptors.SourceElement sourceElement = kotlin.reflect.jvm.internal.impl.descriptors.SourceElement.NO_SOURCE;
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(sourceElement, "SourceElement.NO_SOURCE");
            return new kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl(functionInvokeDescriptor, null, i, empty, nameIdentifier, defaultType, false, false, false, null, sourceElement);
        }
    }
}
