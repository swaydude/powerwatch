package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

/* JADX INFO: compiled from: signatureEnhancement.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class SignatureEnhancement {
    private final kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolver annotationTypeQualifierResolver;
    private final kotlin.reflect.jvm.internal.impl.utils.Jsr305State jsr305State;

    public SignatureEnhancement(kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolver annotationTypeQualifierResolver, kotlin.reflect.jvm.internal.impl.utils.Jsr305State jsr305State) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(annotationTypeQualifierResolver, "annotationTypeQualifierResolver");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(jsr305State, "jsr305State");
        this.annotationTypeQualifierResolver = annotationTypeQualifierResolver;
        this.jsr305State = jsr305State;
    }

    private final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus extractNullabilityTypeFromArgument(kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor annotationDescriptor) {
        kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus;
        kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue<?> constantValueFirstArgument = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.firstArgument(annotationDescriptor);
        if (!(constantValueFirstArgument instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.EnumValue)) {
            constantValueFirstArgument = null;
        }
        kotlin.reflect.jvm.internal.impl.resolve.constants.EnumValue enumValue = (kotlin.reflect.jvm.internal.impl.resolve.constants.EnumValue) constantValueFirstArgument;
        if (enumValue == null) {
            return new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus(kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NOT_NULL, false, 2, null);
        }
        java.lang.String strAsString = enumValue.getEnumEntryName().asString();
        switch (strAsString) {
            case "MAYBE":
            case "NEVER":
                if (!strAsString.equals("MAYBE")) {
                    return null;
                }
                nullabilityQualifierWithMigrationStatus = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus(kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NULLABLE, false, 2, null);
                return nullabilityQualifierWithMigrationStatus;
            case "UNKNOWN":
                nullabilityQualifierWithMigrationStatus = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus(kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.FORCE_FLEXIBILITY, false, 2, null);
                return nullabilityQualifierWithMigrationStatus;
            case "ALWAYS":
                nullabilityQualifierWithMigrationStatus = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus(kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NOT_NULL, false, 2, null);
                return nullabilityQualifierWithMigrationStatus;
            default:
                return null;
        }
    }

    public final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus extractNullability(kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor annotationDescriptor) {
        kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatusExtractNullabilityFromKnownAnnotations;
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(annotationDescriptor, "annotationDescriptor");
        kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatusExtractNullabilityFromKnownAnnotations2 = extractNullabilityFromKnownAnnotations(annotationDescriptor);
        if (nullabilityQualifierWithMigrationStatusExtractNullabilityFromKnownAnnotations2 != null) {
            return nullabilityQualifierWithMigrationStatusExtractNullabilityFromKnownAnnotations2;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor annotationDescriptorResolveTypeQualifierAnnotation = this.annotationTypeQualifierResolver.resolveTypeQualifierAnnotation(annotationDescriptor);
        if (annotationDescriptorResolveTypeQualifierAnnotation == null) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.utils.ReportLevel reportLevelResolveJsr305AnnotationState = this.annotationTypeQualifierResolver.resolveJsr305AnnotationState(annotationDescriptor);
        if (reportLevelResolveJsr305AnnotationState.isIgnore() || (nullabilityQualifierWithMigrationStatusExtractNullabilityFromKnownAnnotations = extractNullabilityFromKnownAnnotations(annotationDescriptorResolveTypeQualifierAnnotation)) == null) {
            return null;
        }
        return kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus.copy$default(nullabilityQualifierWithMigrationStatusExtractNullabilityFromKnownAnnotations, null, reportLevelResolveJsr305AnnotationState.isWarning(), 1, null);
    }

    private final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus extractNullabilityFromKnownAnnotations(kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor annotationDescriptor) {
        kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus;
        kotlin.reflect.jvm.internal.impl.name.FqName fqName = annotationDescriptor.getFqName();
        if (fqName == null) {
            return null;
        }
        if (kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNamesKt.getNULLABLE_ANNOTATIONS().contains(fqName)) {
            nullabilityQualifierWithMigrationStatus = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus(kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NULLABLE, false, 2, null);
        } else if (kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNamesKt.getNOT_NULL_ANNOTATIONS().contains(fqName)) {
            nullabilityQualifierWithMigrationStatus = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus(kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NOT_NULL, false, 2, null);
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(fqName, kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNamesKt.getJAVAX_NONNULL_ANNOTATION())) {
            nullabilityQualifierWithMigrationStatus = extractNullabilityTypeFromArgument(annotationDescriptor);
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(fqName, kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNamesKt.getCOMPATQUAL_NULLABLE_ANNOTATION()) && this.jsr305State.getEnableCompatqualCheckerFrameworkAnnotations()) {
            nullabilityQualifierWithMigrationStatus = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus(kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NULLABLE, false, 2, null);
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(fqName, kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNamesKt.getCOMPATQUAL_NONNULL_ANNOTATION()) && this.jsr305State.getEnableCompatqualCheckerFrameworkAnnotations()) {
            nullabilityQualifierWithMigrationStatus = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus(kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NOT_NULL, false, 2, null);
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(fqName, kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNamesKt.getANDROIDX_RECENTLY_NON_NULL_ANNOTATION())) {
            nullabilityQualifierWithMigrationStatus = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus(kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NOT_NULL, true);
        } else {
            nullabilityQualifierWithMigrationStatus = kotlin.jvm.internal.Intrinsics.areEqual(fqName, kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNamesKt.getANDROIDX_RECENTLY_NULLABLE_ANNOTATION()) ? new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus(kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NULLABLE, true) : null;
        }
        if (nullabilityQualifierWithMigrationStatus != null) {
            return (!nullabilityQualifierWithMigrationStatus.isForWarningOnly() && (annotationDescriptor instanceof kotlin.reflect.jvm.internal.impl.load.java.descriptors.PossiblyExternalAnnotationDescriptor) && ((kotlin.reflect.jvm.internal.impl.load.java.descriptors.PossiblyExternalAnnotationDescriptor) annotationDescriptor).isIdeExternalAnnotation()) ? kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus.copy$default(nullabilityQualifierWithMigrationStatus, null, true, 1, null) : nullabilityQualifierWithMigrationStatus;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <D extends kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor> java.util.Collection<D> enhanceSignatures(kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext c, java.util.Collection<? extends D> platformSignatures) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(c, "c");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(platformSignatures, "platformSignatures");
        java.util.Collection<? extends D> collection = platformSignatures;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(collection, 10));
        java.util.Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(enhanceSignature((kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) it.next(), c));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ba  */
    private final <D extends kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor> D enhanceSignature(D d, kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext lazyJavaResolverContext) {
        kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyGetterDescriptorImpl propertyGetterDescriptorImpl;
        kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement.PartEnhancementResult partEnhancementResultEnhance$default;
        kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedFunctionEnhancementInfo predefinedFunctionEnhancementInfo;
        kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolver.QualifierApplicabilityType qualifierApplicabilityType;
        boolean z;
        boolean z2;
        kotlin.reflect.jvm.internal.impl.types.KotlinType type;
        java.util.List<kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeEnhancementInfo> parametersInfo;
        kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaPropertyDescriptor javaPropertyDescriptor;
        kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyGetterDescriptorImpl getter;
        if (!(d instanceof kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaCallableMemberDescriptor)) {
            return d;
        }
        kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaCallableMemberDescriptor javaCallableMemberDescriptor = (kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaCallableMemberDescriptor) d;
        boolean z3 = true;
        if (javaCallableMemberDescriptor.getKind() == kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind.FAKE_OVERRIDE) {
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor original = javaCallableMemberDescriptor.getOriginal();
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(original, "original");
            if (original.getOverriddenDescriptors().size() == 1) {
                return d;
            }
        }
        kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext lazyJavaResolverContextCopyWithNewDefaultTypeQualifiers = kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt.copyWithNewDefaultTypeQualifiers(lazyJavaResolverContext, d.getAnnotations());
        if (!(d instanceof kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaPropertyDescriptor) || (getter = (javaPropertyDescriptor = (kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaPropertyDescriptor) d).getGetter()) == null || getter.isDefault()) {
            propertyGetterDescriptorImpl = d;
        } else {
            kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyGetterDescriptorImpl getter2 = javaPropertyDescriptor.getGetter();
            if (getter2 == null) {
                kotlin.jvm.internal.Intrinsics.throwNpe();
            }
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(getter2, "getter!!");
            propertyGetterDescriptorImpl = getter2;
        }
        if (javaCallableMemberDescriptor.getExtensionReceiverParameter() != null) {
            kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor functionDescriptor = (kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor) (!(propertyGetterDescriptorImpl instanceof kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor) ? null : propertyGetterDescriptorImpl);
            partEnhancementResultEnhance$default = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.enhance$default(partsForValueParameter(d, functionDescriptor != null ? (kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor) functionDescriptor.getUserData(kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor.ORIGINAL_VALUE_PARAMETER_FOR_EXTENSION_RECEIVER) : null, lazyJavaResolverContextCopyWithNewDefaultTypeQualifiers, new kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, kotlin.reflect.jvm.internal.impl.types.KotlinType>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$enhanceSignature$receiverTypeEnhancement$1
                @Override // kotlin.jvm.functions.Function1
                public final kotlin.reflect.jvm.internal.impl.types.KotlinType invoke(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor it) {
                    kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(it, "it");
                    kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor extensionReceiverParameter = it.getExtensionReceiverParameter();
                    if (extensionReceiverParameter == null) {
                        kotlin.jvm.internal.Intrinsics.throwNpe();
                    }
                    kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(extensionReceiverParameter, "it.extensionReceiverParameter!!");
                    kotlin.reflect.jvm.internal.impl.types.KotlinType type2 = extensionReceiverParameter.getType();
                    kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(type2, "it.extensionReceiverParameter!!.type");
                    return type2;
                }
            }), null, 1, null);
        } else {
            partEnhancementResultEnhance$default = null;
        }
        kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor javaMethodDescriptor = (kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor) (!(d instanceof kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor) ? null : d);
        if (javaMethodDescriptor != null) {
            kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents signatureBuildingComponents = kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents.INSTANCE;
            kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor containingDeclaration = javaMethodDescriptor.getContainingDeclaration();
            if (containingDeclaration == null) {
                throw new kotlin.TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            }
            java.lang.String strSignature = signatureBuildingComponents.signature((kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) containingDeclaration, kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt.computeJvmDescriptor$default(javaMethodDescriptor, false, false, 3, null));
            if (strSignature != null) {
                predefinedFunctionEnhancementInfo = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt.getPREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE().get(strSignature);
            } else {
                predefinedFunctionEnhancementInfo = null;
            }
        } else {
            predefinedFunctionEnhancementInfo = null;
        }
        if (predefinedFunctionEnhancementInfo != null) {
            predefinedFunctionEnhancementInfo.getParametersInfo().size();
            javaCallableMemberDescriptor.getValueParameters().size();
        }
        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> valueParameters = propertyGetterDescriptorImpl.getValueParameters();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(valueParameters, "annotationOwnerForMember.valueParameters");
        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> list = valueParameters;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
        for (final kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor p : list) {
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement.PartEnhancementResult partEnhancementResultEnhance = partsForValueParameter(d, p, lazyJavaResolverContextCopyWithNewDefaultTypeQualifiers, new kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, kotlin.reflect.jvm.internal.impl.types.KotlinType>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$enhanceSignature$valueParameterEnhancements$1$enhancementResult$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final kotlin.reflect.jvm.internal.impl.types.KotlinType invoke(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor it) {
                    kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(it, "it");
                    kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor valueParameterDescriptor = it.getValueParameters().get(p.getIndex());
                    kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(valueParameterDescriptor, "it.valueParameters[p.index]");
                    kotlin.reflect.jvm.internal.impl.types.KotlinType type2 = valueParameterDescriptor.getType();
                    kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(type2, "it.valueParameters[p.index].type");
                    return type2;
                }
            }).enhance((predefinedFunctionEnhancementInfo == null || (parametersInfo = predefinedFunctionEnhancementInfo.getParametersInfo()) == null) ? null : (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeEnhancementInfo) kotlin.collections.CollectionsKt.getOrNull(parametersInfo, p.getIndex()));
            if (partEnhancementResultEnhance.getWereChanges()) {
                type = partEnhancementResultEnhance.getType();
            } else {
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(p, "p");
                type = p.getType();
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(type, "p.type");
            }
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(p, "p");
            boolean zHasDefaultValueInAnnotation = hasDefaultValueInAnnotation(p, type);
            arrayList.add(new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement.ValueParameterEnhancementResult(partEnhancementResultEnhance.getType(), zHasDefaultValueInAnnotation, partEnhancementResultEnhance.getWereChanges() || zHasDefaultValueInAnnotation != p.declaresDefaultValue(), partEnhancementResultEnhance.getContainsFunctionN()));
        }
        java.util.ArrayList arrayList2 = arrayList;
        kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor = propertyGetterDescriptorImpl;
        kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor propertyDescriptor = (kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor) (!(d instanceof kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor) ? null : d);
        if (propertyDescriptor != null && kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.JavaDescriptorUtilKt.isJavaField(propertyDescriptor)) {
            qualifierApplicabilityType = kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolver.QualifierApplicabilityType.FIELD;
        } else {
            qualifierApplicabilityType = kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolver.QualifierApplicabilityType.METHOD_RETURN_TYPE;
        }
        kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement.PartEnhancementResult partEnhancementResultEnhance2 = parts(d, callableMemberDescriptor, true, lazyJavaResolverContextCopyWithNewDefaultTypeQualifiers, qualifierApplicabilityType, new kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, kotlin.reflect.jvm.internal.impl.types.KotlinType>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$enhanceSignature$returnTypeEnhancement$1
            @Override // kotlin.jvm.functions.Function1
            public final kotlin.reflect.jvm.internal.impl.types.KotlinType invoke(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor it) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(it, "it");
                kotlin.reflect.jvm.internal.impl.types.KotlinType returnType = it.getReturnType();
                if (returnType == null) {
                    kotlin.jvm.internal.Intrinsics.throwNpe();
                }
                return returnType;
            }
        }).enhance(predefinedFunctionEnhancementInfo != null ? predefinedFunctionEnhancementInfo.getReturnTypeInfo() : null);
        if ((partEnhancementResultEnhance$default == null || !partEnhancementResultEnhance$default.getContainsFunctionN()) && !partEnhancementResultEnhance2.getContainsFunctionN()) {
            java.util.ArrayList arrayList3 = arrayList2;
            if (!(arrayList3 instanceof java.util.Collection) || !arrayList3.isEmpty()) {
                java.util.Iterator it = arrayList3.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = false;
                        break;
                    }
                    if (((kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement.ValueParameterEnhancementResult) it.next()).getContainsFunctionN()) {
                        z = true;
                        break;
                    }
                }
            } else {
                z = false;
                break;
            }
            if (z) {
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            z2 = true;
        }
        if ((partEnhancementResultEnhance$default == null || !partEnhancementResultEnhance$default.getWereChanges()) && !partEnhancementResultEnhance2.getWereChanges()) {
            java.util.ArrayList arrayList4 = arrayList2;
            if (!(arrayList4 instanceof java.util.Collection) || !arrayList4.isEmpty()) {
                java.util.Iterator it2 = arrayList4.iterator();
                do {
                    if (!it2.hasNext()) {
                        z3 = false;
                        break;
                    }
                } while (!((kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement.ValueParameterEnhancementResult) it2.next()).getWereChanges());
            } else {
                z3 = false;
                break;
            }
            if (!z3 && !z2) {
                return d;
            }
        }
        kotlin.Pair<kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor.UserDataKey<?>, ?> pair = z2 ? kotlin.TuplesKt.to(kotlin.reflect.jvm.internal.impl.resolve.deprecation.DeprecationKt.getDEPRECATED_FUNCTION_KEY(), new kotlin.reflect.jvm.internal.impl.load.java.DeprecationCausedByFunctionN(d)) : null;
        kotlin.reflect.jvm.internal.impl.types.KotlinType type2 = partEnhancementResultEnhance$default != null ? partEnhancementResultEnhance$default.getType() : null;
        java.util.ArrayList<kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement.ValueParameterEnhancementResult> arrayList5 = arrayList2;
        java.util.ArrayList arrayList6 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList5, 10));
        for (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement.ValueParameterEnhancementResult valueParameterEnhancementResult : arrayList5) {
            arrayList6.add(new kotlin.reflect.jvm.internal.impl.load.java.descriptors.ValueParameterData(valueParameterEnhancementResult.getType(), valueParameterEnhancementResult.getHasDefaultValue()));
        }
        kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaCallableMemberDescriptor javaCallableMemberDescriptorEnhance = javaCallableMemberDescriptor.enhance(type2, arrayList6, partEnhancementResultEnhance2.getType(), pair);
        if (javaCallableMemberDescriptorEnhance != null) {
            return javaCallableMemberDescriptorEnhance;
        }
        throw new kotlin.TypeCastException("null cannot be cast to non-null type D");
    }

    private final boolean hasDefaultValueInAnnotation(kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor valueParameterDescriptor, kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        boolean zDeclaresDefaultValue;
        kotlin.reflect.jvm.internal.impl.load.java.descriptors.AnnotationDefaultValue defaultValueFromAnnotation = kotlin.reflect.jvm.internal.impl.load.java.descriptors.UtilKt.getDefaultValueFromAnnotation(valueParameterDescriptor);
        if (defaultValueFromAnnotation instanceof kotlin.reflect.jvm.internal.impl.load.java.descriptors.StringDefaultValue) {
            zDeclaresDefaultValue = kotlin.reflect.jvm.internal.impl.load.java.UtilsKt.lexicalCastFrom(kotlinType, ((kotlin.reflect.jvm.internal.impl.load.java.descriptors.StringDefaultValue) defaultValueFromAnnotation).getValue()) != null;
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(defaultValueFromAnnotation, kotlin.reflect.jvm.internal.impl.load.java.descriptors.NullDefaultValue.INSTANCE)) {
            zDeclaresDefaultValue = kotlin.reflect.jvm.internal.impl.types.TypeUtils.acceptsNullable(kotlinType);
        } else if (defaultValueFromAnnotation == null) {
            zDeclaresDefaultValue = valueParameterDescriptor.declaresDefaultValue();
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return zDeclaresDefaultValue && valueParameterDescriptor.getOverriddenDescriptors().isEmpty();
    }

    /* JADX INFO: compiled from: signatureEnhancement.kt */
    private final class SignatureParts {
        private final kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolver.QualifierApplicabilityType containerApplicabilityType;
        private final kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext containerContext;
        private final java.util.Collection<kotlin.reflect.jvm.internal.impl.types.KotlinType> fromOverridden;
        private final kotlin.reflect.jvm.internal.impl.types.KotlinType fromOverride;
        private final boolean isCovariant;
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement this$0;
        private final kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated typeContainer;

        /* JADX WARN: Multi-variable type inference failed */
        public SignatureParts(kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement signatureEnhancement, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated annotated, kotlin.reflect.jvm.internal.impl.types.KotlinType fromOverride, java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.types.KotlinType> fromOverridden, boolean z, kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext containerContext, kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolver.QualifierApplicabilityType containerApplicabilityType) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(fromOverride, "fromOverride");
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(fromOverridden, "fromOverridden");
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(containerContext, "containerContext");
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(containerApplicabilityType, "containerApplicabilityType");
            this.this$0 = signatureEnhancement;
            this.typeContainer = annotated;
            this.fromOverride = fromOverride;
            this.fromOverridden = fromOverridden;
            this.isCovariant = z;
            this.containerContext = containerContext;
            this.containerApplicabilityType = containerApplicabilityType;
        }

        private final boolean isForVarargParameter() {
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated annotated = this.typeContainer;
            if (!(annotated instanceof kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor)) {
                annotated = null;
            }
            kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor valueParameterDescriptor = (kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor) annotated;
            return (valueParameterDescriptor != null ? valueParameterDescriptor.getVarargElementType() : null) != null;
        }

        public static /* synthetic */ kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement.PartEnhancementResult enhance$default(kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement.SignatureParts signatureParts, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeEnhancementInfo typeEnhancementInfo, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                typeEnhancementInfo = (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeEnhancementInfo) null;
            }
            return signatureParts.enhance(typeEnhancementInfo);
        }

        public final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement.PartEnhancementResult enhance(final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeEnhancementInfo typeEnhancementInfo) {
            final kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers> function1ComputeIndexedQualifiersForOverride = computeIndexedQualifiersForOverride();
            kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers> function1 = typeEnhancementInfo != null ? new kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$SignatureParts$enhance$$inlined$let$lambda$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers invoke(java.lang.Integer num) {
                    return invoke(num.intValue());
                }

                public final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers invoke(int i) {
                    kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers javaTypeQualifiers = typeEnhancementInfo.getMap().get(java.lang.Integer.valueOf(i));
                    return javaTypeQualifiers != null ? javaTypeQualifiers : (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers) function1ComputeIndexedQualifiersForOverride.invoke(java.lang.Integer.valueOf(i));
                }
            } : null;
            boolean zContains = kotlin.reflect.jvm.internal.impl.types.TypeUtils.contains(this.fromOverride, new kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.types.UnwrappedType, java.lang.Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$SignatureParts$enhance$containsFunctionN$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ java.lang.Boolean invoke(kotlin.reflect.jvm.internal.impl.types.UnwrappedType unwrappedType) {
                    return java.lang.Boolean.valueOf(invoke2(unwrappedType));
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final boolean invoke2(kotlin.reflect.jvm.internal.impl.types.UnwrappedType unwrappedType) {
                    kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor classifierDescriptorMo1268getDeclarationDescriptor = unwrappedType.getConstructor().mo1268getDeclarationDescriptor();
                    if (classifierDescriptorMo1268getDeclarationDescriptor == null) {
                        return false;
                    }
                    kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(classifierDescriptorMo1268getDeclarationDescriptor, "it.constructor.declarati… ?: return@contains false");
                    return kotlin.jvm.internal.Intrinsics.areEqual(classifierDescriptorMo1268getDeclarationDescriptor.getName(), kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap.INSTANCE.getFUNCTION_N_FQ_NAME().shortName()) && kotlin.jvm.internal.Intrinsics.areEqual(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.fqNameOrNull(classifierDescriptorMo1268getDeclarationDescriptor), kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap.INSTANCE.getFUNCTION_N_FQ_NAME());
                }
            });
            kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType = this.fromOverride;
            if (function1 != null) {
                function1ComputeIndexedQualifiersForOverride = function1;
            }
            kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinTypeEnhance = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeEnhancementKt.enhance(kotlinType, function1ComputeIndexedQualifiersForOverride);
            if (kotlinTypeEnhance != null) {
                return new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement.PartEnhancementResult(kotlinTypeEnhance, true, zContains);
            }
            return new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement.PartEnhancementResult(this.fromOverride, false, zContains);
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0048  */
        /* JADX WARN: Code duplicated, block: B:17:0x004b  */
        /* JADX WARN: Code duplicated, block: B:19:0x0051  */
        /* JADX WARN: Code duplicated, block: B:20:0x0054  */
        private final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers extractQualifiers(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
            kotlin.Pair pair;
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier nullabilityQualifier;
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier nullabilityQualifier2;
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier mutabilityQualifier;
            if (kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt.isFlexible(kotlinType)) {
                kotlin.reflect.jvm.internal.impl.types.FlexibleType flexibleTypeAsFlexibleType = kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt.asFlexibleType(kotlinType);
                pair = new kotlin.Pair(flexibleTypeAsFlexibleType.getLowerBound(), flexibleTypeAsFlexibleType.getUpperBound());
            } else {
                pair = new kotlin.Pair(kotlinType, kotlinType);
            }
            kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType2 = (kotlin.reflect.jvm.internal.impl.types.KotlinType) pair.component1();
            kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType3 = (kotlin.reflect.jvm.internal.impl.types.KotlinType) pair.component2();
            kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap javaToKotlinClassMap = kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap.INSTANCE;
            if (!kotlinType2.isMarkedNullable()) {
                if (kotlinType3.isMarkedNullable()) {
                    nullabilityQualifier = null;
                } else {
                    nullabilityQualifier2 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NOT_NULL;
                }
                if (javaToKotlinClassMap.isReadOnly(kotlinType2)) {
                    mutabilityQualifier = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier.READ_ONLY;
                } else if (javaToKotlinClassMap.isMutable(kotlinType3)) {
                    mutabilityQualifier = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier.MUTABLE;
                } else {
                    mutabilityQualifier = null;
                }
                return new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers(nullabilityQualifier, mutabilityQualifier, kotlinType.unwrap() instanceof kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NotNullTypeParameter, false, 8, null);
            }
            nullabilityQualifier2 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NULLABLE;
            nullabilityQualifier = nullabilityQualifier2;
            if (javaToKotlinClassMap.isReadOnly(kotlinType2)) {
                mutabilityQualifier = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier.READ_ONLY;
            } else if (javaToKotlinClassMap.isMutable(kotlinType3)) {
                mutabilityQualifier = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier.MUTABLE;
            } else {
                mutabilityQualifier = null;
            }
            return new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers(nullabilityQualifier, mutabilityQualifier, kotlinType.unwrap() instanceof kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NotNullTypeParameter, false, 8, null);
        }

        private final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers extractQualifiersFromAnnotations(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType, boolean z, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers javaTypeQualifiers) {
            final kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations;
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated annotated;
            if (z && (annotated = this.typeContainer) != null) {
                annotations = kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationsKt.composeAnnotations(annotated.getAnnotations(), kotlinType.getAnnotations());
            } else {
                annotations = kotlinType.getAnnotations();
            }
            kotlin.jvm.functions.Function2<java.util.List<? extends kotlin.reflect.jvm.internal.impl.name.FqName>, T, T> function2 = new kotlin.jvm.functions.Function2<java.util.List<? extends kotlin.reflect.jvm.internal.impl.name.FqName>, T, T>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$SignatureParts$extractQualifiersFromAnnotations$1
                {
                    super(2);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ java.lang.Object invoke(java.util.List<? extends kotlin.reflect.jvm.internal.impl.name.FqName> list, java.lang.Object obj) {
                    return invoke2((java.util.List<kotlin.reflect.jvm.internal.impl.name.FqName>) list, obj);
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final <T> T invoke2(java.util.List<kotlin.reflect.jvm.internal.impl.name.FqName> ifPresent, T qualifier) {
                    kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(ifPresent, "$this$ifPresent");
                    kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(qualifier, "qualifier");
                    java.util.List<kotlin.reflect.jvm.internal.impl.name.FqName> list = ifPresent;
                    boolean z2 = true;
                    if ((list instanceof java.util.Collection) && list.isEmpty()) {
                        z2 = false;
                    } else {
                        java.util.Iterator<T> it = list.iterator();
                        while (it.hasNext()) {
                            if (annotations.mo1263findAnnotation((kotlin.reflect.jvm.internal.impl.name.FqName) it.next()) != null) {
                            }
                        }
                        z2 = false;
                    }
                    if (z2) {
                        return qualifier;
                    }
                    return null;
                }
            };
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$SignatureParts$extractQualifiersFromAnnotations$2 signatureEnhancement$SignatureParts$extractQualifiersFromAnnotations$2 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$SignatureParts$extractQualifiersFromAnnotations$2.INSTANCE;
            if (z) {
                kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaTypeQualifiersByElementType defaultTypeQualifiers = this.containerContext.getDefaultTypeQualifiers();
                javaTypeQualifiers = defaultTypeQualifiers != null ? defaultTypeQualifiers.get(this.containerApplicabilityType) : null;
            }
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatusExtractNullability = extractNullability(annotations);
            if (nullabilityQualifierWithMigrationStatusExtractNullability == null) {
                nullabilityQualifierWithMigrationStatusExtractNullability = (javaTypeQualifiers == null || javaTypeQualifiers.getNullability() == null) ? null : new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus(javaTypeQualifiers.getNullability(), javaTypeQualifiers.isNullabilityQualifierForWarning());
            }
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier qualifier = nullabilityQualifierWithMigrationStatusExtractNullability != null ? nullabilityQualifierWithMigrationStatusExtractNullability.getQualifier() : null;
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier mutabilityQualifier = (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier) signatureEnhancement$SignatureParts$extractQualifiersFromAnnotations$2.invoke(function2.invoke2(kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNamesKt.getREAD_ONLY_ANNOTATIONS(), kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier.READ_ONLY), function2.invoke2(kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNamesKt.getMUTABLE_ANNOTATIONS(), kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier.MUTABLE));
            boolean z2 = false;
            boolean z3 = (nullabilityQualifierWithMigrationStatusExtractNullability != null ? nullabilityQualifierWithMigrationStatusExtractNullability.getQualifier() : null) == kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NOT_NULL && kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.isTypeParameter(kotlinType);
            if (nullabilityQualifierWithMigrationStatusExtractNullability != null && nullabilityQualifierWithMigrationStatusExtractNullability.isForWarningOnly()) {
                z2 = true;
            }
            return new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers(qualifier, mutabilityQualifier, z3, z2);
        }

        private final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus extractNullability(kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations) {
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement signatureEnhancement = this.this$0;
            java.util.Iterator<kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor> it = annotations.iterator();
            while (it.hasNext()) {
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatusExtractNullability = signatureEnhancement.extractNullability(it.next());
                if (nullabilityQualifierWithMigrationStatusExtractNullability != null) {
                    return nullabilityQualifierWithMigrationStatusExtractNullability;
                }
            }
            return null;
        }

        /* JADX WARN: Code duplicated, block: B:21:0x006a  */
        private final kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers> computeIndexedQualifiersForOverride() {
            boolean z;
            boolean z2;
            java.util.Collection<kotlin.reflect.jvm.internal.impl.types.KotlinType> collection = this.fromOverridden;
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(collection, 10));
            java.util.Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                arrayList.add(toIndexed((kotlin.reflect.jvm.internal.impl.types.KotlinType) it.next()));
            }
            java.util.ArrayList arrayList2 = arrayList;
            java.util.List<kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeAndDefaultQualifiers> indexed = toIndexed(this.fromOverride);
            if (this.isCovariant) {
                java.util.Collection<kotlin.reflect.jvm.internal.impl.types.KotlinType> collection2 = this.fromOverridden;
                if (!(collection2 instanceof java.util.Collection) || !collection2.isEmpty()) {
                    java.util.Iterator<T> it2 = collection2.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            z2 = false;
                            break;
                        }
                        if (!kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker.DEFAULT.equalTypes((kotlin.reflect.jvm.internal.impl.types.KotlinType) it2.next(), this.fromOverride)) {
                            z2 = true;
                            break;
                        }
                    }
                } else {
                    z2 = false;
                    break;
                }
                if (z2) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            int size = z ? 1 : indexed.size();
            final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers[] javaTypeQualifiersArr = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers[size];
            int i = 0;
            while (i < size) {
                boolean z3 = i == 0;
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeAndDefaultQualifiers typeAndDefaultQualifiers = indexed.get(i);
                kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinTypeComponent1 = typeAndDefaultQualifiers.component1();
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers javaTypeQualifiersComponent2 = typeAndDefaultQualifiers.component2();
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.util.Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeAndDefaultQualifiers typeAndDefaultQualifiers2 = (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeAndDefaultQualifiers) kotlin.collections.CollectionsKt.getOrNull((java.util.List) it3.next(), i);
                    kotlin.reflect.jvm.internal.impl.types.KotlinType type = typeAndDefaultQualifiers2 != null ? typeAndDefaultQualifiers2.getType() : null;
                    if (type != null) {
                        arrayList3.add(type);
                    }
                }
                javaTypeQualifiersArr[i] = computeQualifiersForOverride(kotlinTypeComponent1, arrayList3, javaTypeQualifiersComponent2, z3);
                i++;
            }
            return new kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$SignatureParts$computeIndexedQualifiersForOverride$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers invoke(java.lang.Integer num) {
                    return invoke(num.intValue());
                }

                public final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers invoke(int i2) {
                    kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers[] javaTypeQualifiersArr2 = javaTypeQualifiersArr;
                    return (i2 < 0 || i2 > kotlin.collections.ArraysKt.getLastIndex(javaTypeQualifiersArr2)) ? kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers.Companion.getNONE() : javaTypeQualifiersArr2[i2];
                }
            };
        }

        private final java.util.List<kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeAndDefaultQualifiers> toIndexed(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
            final java.util.ArrayList arrayList = new java.util.ArrayList(1);
            new kotlin.jvm.functions.Function2<kotlin.reflect.jvm.internal.impl.types.KotlinType, kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext, kotlin.Unit>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$SignatureParts$toIndexed$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType2, kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext lazyJavaResolverContext) {
                    invoke2(kotlinType2, lazyJavaResolverContext);
                    return kotlin.Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(kotlin.reflect.jvm.internal.impl.types.KotlinType type, kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext ownerContext) {
                    kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(type, "type");
                    kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(ownerContext, "ownerContext");
                    kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext lazyJavaResolverContextCopyWithNewDefaultTypeQualifiers = kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt.copyWithNewDefaultTypeQualifiers(ownerContext, type.getAnnotations());
                    java.util.ArrayList arrayList2 = arrayList;
                    kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaTypeQualifiersByElementType defaultTypeQualifiers = lazyJavaResolverContextCopyWithNewDefaultTypeQualifiers.getDefaultTypeQualifiers();
                    arrayList2.add(new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeAndDefaultQualifiers(type, defaultTypeQualifiers != null ? defaultTypeQualifiers.get(kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolver.QualifierApplicabilityType.TYPE_USE) : null));
                    for (kotlin.reflect.jvm.internal.impl.types.TypeProjection typeProjection : type.getArguments()) {
                        if (typeProjection.isStarProjection()) {
                            java.util.ArrayList arrayList3 = arrayList;
                            kotlin.reflect.jvm.internal.impl.types.KotlinType type2 = typeProjection.getType();
                            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(type2, "arg.type");
                            arrayList3.add(new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeAndDefaultQualifiers(type2, null));
                        } else {
                            kotlin.reflect.jvm.internal.impl.types.KotlinType type3 = typeProjection.getType();
                            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(type3, "arg.type");
                            invoke2(type3, lazyJavaResolverContextCopyWithNewDefaultTypeQualifiers);
                        }
                    }
                }
            }.invoke2(kotlinType, this.containerContext);
            return arrayList;
        }

        /* JADX WARN: Code duplicated, block: B:70:0x0138  */
        private final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers computeQualifiersForOverride(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType, java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.types.KotlinType> collection, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers javaTypeQualifiers, boolean z) {
            boolean z2;
            boolean z3;
            java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.types.KotlinType> collection2 = collection;
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(collection2, 10));
            java.util.Iterator<T> it = collection2.iterator();
            while (it.hasNext()) {
                arrayList.add(extractQualifiers((kotlin.reflect.jvm.internal.impl.types.KotlinType) it.next()));
            }
            java.util.ArrayList arrayList2 = arrayList;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.util.Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier mutability = ((kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers) it2.next()).getMutability();
                if (mutability != null) {
                    arrayList3.add(mutability);
                }
            }
            java.util.Set set = kotlin.collections.CollectionsKt.toSet(arrayList3);
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.util.Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier nullability = ((kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers) it3.next()).getNullability();
                if (nullability != null) {
                    arrayList4.add(nullability);
                }
            }
            java.util.Set set2 = kotlin.collections.CollectionsKt.toSet(arrayList4);
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            java.util.Iterator<T> it4 = collection2.iterator();
            while (it4.hasNext()) {
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier nullability2 = extractQualifiers(kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancementKt.unwrapEnhancement((kotlin.reflect.jvm.internal.impl.types.KotlinType) it4.next())).getNullability();
                if (nullability2 != null) {
                    arrayList5.add(nullability2);
                }
            }
            java.util.Set set3 = kotlin.collections.CollectionsKt.toSet(arrayList5);
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers javaTypeQualifiersExtractQualifiersFromAnnotations = extractQualifiersFromAnnotations(kotlinType, z, javaTypeQualifiers);
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier nullabilityQualifier = null;
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers javaTypeQualifiers2 = javaTypeQualifiersExtractQualifiersFromAnnotations.isNullabilityQualifierForWarning() ^ true ? javaTypeQualifiersExtractQualifiersFromAnnotations : null;
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier nullability3 = javaTypeQualifiers2 != null ? javaTypeQualifiers2.getNullability() : null;
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier nullability4 = javaTypeQualifiersExtractQualifiersFromAnnotations.getNullability();
            boolean z4 = this.isCovariant && z;
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier nullabilityQualifierSelect = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementKt.select(set2, nullability3, z4);
            if (nullabilityQualifierSelect != null) {
                if (!(isForVarargParameter() && z && nullabilityQualifierSelect == kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NULLABLE)) {
                    nullabilityQualifier = nullabilityQualifierSelect;
                }
            }
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier mutabilityQualifier = (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier) kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementKt.select(set, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier.MUTABLE, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier.READ_ONLY, javaTypeQualifiersExtractQualifiersFromAnnotations.getMutability(), z4);
            boolean z5 = nullability4 != nullability3 || (kotlin.jvm.internal.Intrinsics.areEqual(set3, set2) ^ true);
            if (javaTypeQualifiersExtractQualifiersFromAnnotations.isNotNullTypeParameter()) {
                z2 = true;
            } else {
                if (!(arrayList2 instanceof java.util.Collection) || !arrayList2.isEmpty()) {
                    java.util.Iterator it5 = arrayList2.iterator();
                    while (true) {
                        if (!it5.hasNext()) {
                            z3 = false;
                            break;
                        }
                        if (((kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers) it5.next()).isNotNullTypeParameter()) {
                            z3 = true;
                            break;
                        }
                    }
                } else {
                    z3 = false;
                    break;
                }
                if (z3) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            }
            if (nullabilityQualifier == null && z5) {
                return kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementKt.createJavaTypeQualifiers(kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementKt.select(set3, nullability4, z4), mutabilityQualifier, true, z2);
            }
            return kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementKt.createJavaTypeQualifiers(nullabilityQualifier, mutabilityQualifier, nullabilityQualifier == null, z2);
        }
    }

    /* JADX INFO: compiled from: signatureEnhancement.kt */
    private static class PartEnhancementResult {
        private final boolean containsFunctionN;
        private final kotlin.reflect.jvm.internal.impl.types.KotlinType type;
        private final boolean wereChanges;

        public PartEnhancementResult(kotlin.reflect.jvm.internal.impl.types.KotlinType type, boolean z, boolean z2) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(type, "type");
            this.type = type;
            this.wereChanges = z;
            this.containsFunctionN = z2;
        }

        public final kotlin.reflect.jvm.internal.impl.types.KotlinType getType() {
            return this.type;
        }

        public final boolean getWereChanges() {
            return this.wereChanges;
        }

        public final boolean getContainsFunctionN() {
            return this.containsFunctionN;
        }
    }

    /* JADX INFO: compiled from: signatureEnhancement.kt */
    private static final class ValueParameterEnhancementResult extends kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement.PartEnhancementResult {
        private final boolean hasDefaultValue;

        public final boolean getHasDefaultValue() {
            return this.hasDefaultValue;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ValueParameterEnhancementResult(kotlin.reflect.jvm.internal.impl.types.KotlinType type, boolean z, boolean z2, boolean z3) {
            super(type, z2, z3);
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(type, "type");
            this.hasDefaultValue = z;
        }
    }

    private final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement.SignatureParts partsForValueParameter(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor valueParameterDescriptor, kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext lazyJavaResolverContext, kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, ? extends kotlin.reflect.jvm.internal.impl.types.KotlinType> function1) {
        kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext lazyJavaResolverContextCopyWithNewDefaultTypeQualifiers;
        return parts(callableMemberDescriptor, valueParameterDescriptor, false, (valueParameterDescriptor == null || (lazyJavaResolverContextCopyWithNewDefaultTypeQualifiers = kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt.copyWithNewDefaultTypeQualifiers(lazyJavaResolverContext, valueParameterDescriptor.getAnnotations())) == null) ? lazyJavaResolverContext : lazyJavaResolverContextCopyWithNewDefaultTypeQualifiers, kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolver.QualifierApplicabilityType.VALUE_PARAMETER, function1);
    }

    private final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement.SignatureParts parts(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated annotated, boolean z, kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext lazyJavaResolverContext, kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolver.QualifierApplicabilityType qualifierApplicabilityType, kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, ? extends kotlin.reflect.jvm.internal.impl.types.KotlinType> function1) {
        kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinTypeInvoke = function1.invoke(callableMemberDescriptor);
        java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor> overriddenDescriptors = callableMemberDescriptor.getOverriddenDescriptors();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(overriddenDescriptors, "this.overriddenDescriptors");
        java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor> collection = overriddenDescriptors;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(collection, 10));
        for (kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor it : collection) {
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(it, "it");
            arrayList.add(function1.invoke(it));
        }
        return new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement.SignatureParts(this, annotated, kotlinTypeInvoke, arrayList, z, kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt.copyWithNewDefaultTypeQualifiers(lazyJavaResolverContext, function1.invoke(callableMemberDescriptor).getAnnotations()), qualifierApplicabilityType);
    }
}
