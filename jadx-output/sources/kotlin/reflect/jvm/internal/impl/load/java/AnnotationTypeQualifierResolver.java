package kotlin.reflect.jvm.internal.impl.load.java;

/* JADX INFO: compiled from: AnnotationTypeQualifierResolver.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class AnnotationTypeQualifierResolver {
    private final boolean disabled;
    private final kotlin.reflect.jvm.internal.impl.utils.Jsr305State jsr305State;
    private final kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable<kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor> resolvedNicknames;

    /* JADX INFO: compiled from: AnnotationTypeQualifierResolver.kt */
    public enum QualifierApplicabilityType {
        METHOD_RETURN_TYPE,
        VALUE_PARAMETER,
        FIELD,
        TYPE_USE
    }

    public AnnotationTypeQualifierResolver(kotlin.reflect.jvm.internal.impl.storage.StorageManager storageManager, kotlin.reflect.jvm.internal.impl.utils.Jsr305State jsr305State) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(storageManager, "storageManager");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(jsr305State, "jsr305State");
        this.jsr305State = jsr305State;
        this.resolvedNicknames = storageManager.createMemoizedFunctionWithNullableValues(new kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolver$resolvedNicknames$1(this));
        this.disabled = jsr305State.getDisabled();
    }

    /* JADX INFO: compiled from: AnnotationTypeQualifierResolver.kt */
    public static final class TypeQualifierWithApplicability {
        private final int applicability;
        private final kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor typeQualifier;

        public TypeQualifierWithApplicability(kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor typeQualifier, int i) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(typeQualifier, "typeQualifier");
            this.typeQualifier = typeQualifier;
            this.applicability = i;
        }

        public final kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor component1() {
            return this.typeQualifier;
        }

        public final java.util.List<kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolver.QualifierApplicabilityType> component2() {
            kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolver.QualifierApplicabilityType[] qualifierApplicabilityTypeArrValues = kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolver.QualifierApplicabilityType.values();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolver.QualifierApplicabilityType qualifierApplicabilityType : qualifierApplicabilityTypeArrValues) {
                if (isApplicableTo(qualifierApplicabilityType)) {
                    arrayList.add(qualifierApplicabilityType);
                }
            }
            return arrayList;
        }

        private final boolean isApplicableTo(kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolver.QualifierApplicabilityType qualifierApplicabilityType) {
            return isApplicableConsideringMask(kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolver.QualifierApplicabilityType.TYPE_USE) || isApplicableConsideringMask(qualifierApplicabilityType);
        }

        private final boolean isApplicableConsideringMask(kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolver.QualifierApplicabilityType qualifierApplicabilityType) {
            return ((1 << qualifierApplicabilityType.ordinal()) & this.applicability) != 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor computeTypeQualifierNickname(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor) {
        if (!classDescriptor.getAnnotations().hasAnnotation(kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolverKt.getTYPE_QUALIFIER_NICKNAME_FQNAME())) {
            return null;
        }
        java.util.Iterator<kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor> it = classDescriptor.getAnnotations().iterator();
        while (it.hasNext()) {
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor annotationDescriptorResolveTypeQualifierAnnotation = resolveTypeQualifierAnnotation(it.next());
            if (annotationDescriptorResolveTypeQualifierAnnotation != null) {
                return annotationDescriptorResolveTypeQualifierAnnotation;
            }
        }
        return null;
    }

    private final kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor resolveTypeQualifierNickname(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor) {
        if (classDescriptor.getKind() != kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.ANNOTATION_CLASS) {
            return null;
        }
        return this.resolvedNicknames.invoke(classDescriptor);
    }

    public final kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor resolveTypeQualifierAnnotation(kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor annotationDescriptor) {
        kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor annotationClass;
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(annotationDescriptor, "annotationDescriptor");
        if (this.jsr305State.getDisabled() || (annotationClass = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getAnnotationClass(annotationDescriptor)) == null) {
            return null;
        }
        return kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolverKt.isAnnotatedWithTypeQualifier(annotationClass) ? annotationDescriptor : resolveTypeQualifierNickname(annotationClass);
    }

    public final kotlin.reflect.jvm.internal.impl.load.java.lazy.NullabilityQualifierWithApplicability resolveQualifierBuiltInDefaultAnnotation(kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor annotationDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(annotationDescriptor, "annotationDescriptor");
        if (this.jsr305State.getDisabled()) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.load.java.lazy.NullabilityQualifierWithApplicability nullabilityQualifierWithApplicability = kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolverKt.getBUILT_IN_TYPE_QUALIFIER_DEFAULT_ANNOTATIONS().get(annotationDescriptor.getFqName());
        if (nullabilityQualifierWithApplicability == null) {
            return (kotlin.reflect.jvm.internal.impl.load.java.lazy.NullabilityQualifierWithApplicability) null;
        }
        kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatusComponent1 = nullabilityQualifierWithApplicability.component1();
        java.util.Collection<kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolver.QualifierApplicabilityType> collectionComponent2 = nullabilityQualifierWithApplicability.component2();
        kotlin.reflect.jvm.internal.impl.utils.ReportLevel reportLevelResolveJsr305AnnotationState = resolveJsr305AnnotationState(annotationDescriptor);
        if (!(reportLevelResolveJsr305AnnotationState != kotlin.reflect.jvm.internal.impl.utils.ReportLevel.IGNORE)) {
            reportLevelResolveJsr305AnnotationState = null;
        }
        if (reportLevelResolveJsr305AnnotationState != null) {
            return new kotlin.reflect.jvm.internal.impl.load.java.lazy.NullabilityQualifierWithApplicability(kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus.copy$default(nullabilityQualifierWithMigrationStatusComponent1, null, reportLevelResolveJsr305AnnotationState.isWarning(), 1, null), collectionComponent2);
        }
        return null;
    }

    public final kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolver.TypeQualifierWithApplicability resolveTypeQualifierDefaultAnnotation(kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor annotationDescriptor) {
        kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor annotationClass;
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor next;
        java.util.List<kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolver.QualifierApplicabilityType> listEmptyList;
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(annotationDescriptor, "annotationDescriptor");
        if (!this.jsr305State.getDisabled() && (annotationClass = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getAnnotationClass(annotationDescriptor)) != null) {
            if (!annotationClass.getAnnotations().hasAnnotation(kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolverKt.getTYPE_QUALIFIER_DEFAULT_FQNAME())) {
                annotationClass = null;
            }
            if (annotationClass != null) {
                kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor annotationClass2 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getAnnotationClass(annotationDescriptor);
                if (annotationClass2 == null) {
                    kotlin.jvm.internal.Intrinsics.throwNpe();
                }
                kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor annotationDescriptorMo1263findAnnotation = annotationClass2.getAnnotations().mo1263findAnnotation(kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolverKt.getTYPE_QUALIFIER_DEFAULT_FQNAME());
                if (annotationDescriptorMo1263findAnnotation == null) {
                    kotlin.jvm.internal.Intrinsics.throwNpe();
                }
                java.util.Map<kotlin.reflect.jvm.internal.impl.name.Name, kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue<?>> allValueArguments = annotationDescriptorMo1263findAnnotation.getAllValueArguments();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.util.Map.Entry<kotlin.reflect.jvm.internal.impl.name.Name, kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue<?>> entry : allValueArguments.entrySet()) {
                    kotlin.reflect.jvm.internal.impl.name.Name key = entry.getKey();
                    kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue<?> value = entry.getValue();
                    if (kotlin.jvm.internal.Intrinsics.areEqual(key, kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames.DEFAULT_ANNOTATION_MEMBER_NAME)) {
                        listEmptyList = mapConstantToQualifierApplicabilityTypes(value);
                    } else {
                        listEmptyList = kotlin.collections.CollectionsKt.emptyList();
                    }
                    kotlin.collections.CollectionsKt.addAll(arrayList, listEmptyList);
                }
                java.util.Iterator it = arrayList.iterator();
                int iOrdinal = 0;
                while (it.hasNext()) {
                    iOrdinal |= 1 << ((kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolver.QualifierApplicabilityType) it.next()).ordinal();
                }
                java.util.Iterator<kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor> it2 = annotationClass.getAnnotations().iterator();
                do {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                } while (!(resolveTypeQualifierAnnotation(next) != null));
                kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor annotationDescriptor2 = next;
                if (annotationDescriptor2 != null) {
                    return new kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolver.TypeQualifierWithApplicability(annotationDescriptor2, iOrdinal);
                }
            }
        }
        return null;
    }

    public final kotlin.reflect.jvm.internal.impl.utils.ReportLevel resolveJsr305AnnotationState(kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor annotationDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(annotationDescriptor, "annotationDescriptor");
        kotlin.reflect.jvm.internal.impl.utils.ReportLevel reportLevelResolveJsr305CustomState = resolveJsr305CustomState(annotationDescriptor);
        return reportLevelResolveJsr305CustomState != null ? reportLevelResolveJsr305CustomState : this.jsr305State.getGlobal();
    }

    public final kotlin.reflect.jvm.internal.impl.utils.ReportLevel resolveJsr305CustomState(kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor annotationDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(annotationDescriptor, "annotationDescriptor");
        java.util.Map<java.lang.String, kotlin.reflect.jvm.internal.impl.utils.ReportLevel> user = this.jsr305State.getUser();
        kotlin.reflect.jvm.internal.impl.name.FqName fqName = annotationDescriptor.getFqName();
        kotlin.reflect.jvm.internal.impl.utils.ReportLevel reportLevel = user.get(fqName != null ? fqName.asString() : null);
        if (reportLevel != null) {
            return reportLevel;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor annotationClass = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getAnnotationClass(annotationDescriptor);
        if (annotationClass != null) {
            return migrationAnnotationStatus(annotationClass);
        }
        return null;
    }

    private final kotlin.reflect.jvm.internal.impl.utils.ReportLevel migrationAnnotationStatus(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor) {
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor annotationDescriptorMo1263findAnnotation = classDescriptor.getAnnotations().mo1263findAnnotation(kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolverKt.getMIGRATION_ANNOTATION_FQNAME());
        kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue<?> constantValueFirstArgument = annotationDescriptorMo1263findAnnotation != null ? kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.firstArgument(annotationDescriptorMo1263findAnnotation) : null;
        if (!(constantValueFirstArgument instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.EnumValue)) {
            constantValueFirstArgument = null;
        }
        kotlin.reflect.jvm.internal.impl.resolve.constants.EnumValue enumValue = (kotlin.reflect.jvm.internal.impl.resolve.constants.EnumValue) constantValueFirstArgument;
        if (enumValue == null) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.utils.ReportLevel migration = this.jsr305State.getMigration();
        if (migration != null) {
            return migration;
        }
        java.lang.String strAsString = enumValue.getEnumEntryName().asString();
        int iHashCode = strAsString.hashCode();
        if (iHashCode == -2137067054) {
            if (strAsString.equals("IGNORE")) {
                return kotlin.reflect.jvm.internal.impl.utils.ReportLevel.IGNORE;
            }
            return null;
        }
        if (iHashCode == -1838656823) {
            if (strAsString.equals("STRICT")) {
                return kotlin.reflect.jvm.internal.impl.utils.ReportLevel.STRICT;
            }
            return null;
        }
        if (iHashCode == 2656902 && strAsString.equals("WARN")) {
            return kotlin.reflect.jvm.internal.impl.utils.ReportLevel.WARN;
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:26:0x0072  */
    private final java.util.List<kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolver.QualifierApplicabilityType> mapConstantToQualifierApplicabilityTypes(kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue<?> constantValue) {
        kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolver.QualifierApplicabilityType qualifierApplicabilityType;
        if (constantValue instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.ArrayValue) {
            java.util.List<? extends kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue<?>> value = ((kotlin.reflect.jvm.internal.impl.resolve.constants.ArrayValue) constantValue).getValue();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator<T> it = value.iterator();
            while (it.hasNext()) {
                kotlin.collections.CollectionsKt.addAll(arrayList, mapConstantToQualifierApplicabilityTypes((kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue) it.next()));
            }
            return arrayList;
        }
        if (!(constantValue instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.EnumValue)) {
            return kotlin.collections.CollectionsKt.emptyList();
        }
        switch (((kotlin.reflect.jvm.internal.impl.resolve.constants.EnumValue) constantValue).getEnumEntryName().getIdentifier()) {
            case "METHOD":
                qualifierApplicabilityType = kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolver.QualifierApplicabilityType.METHOD_RETURN_TYPE;
                break;
            case "FIELD":
                qualifierApplicabilityType = kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolver.QualifierApplicabilityType.FIELD;
                break;
            case "TYPE_USE":
                qualifierApplicabilityType = kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolver.QualifierApplicabilityType.TYPE_USE;
                break;
            case "PARAMETER":
                qualifierApplicabilityType = kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolver.QualifierApplicabilityType.VALUE_PARAMETER;
                break;
            default:
                qualifierApplicabilityType = null;
                break;
        }
        return kotlin.collections.CollectionsKt.listOfNotNull(qualifierApplicabilityType);
    }

    public final boolean getDisabled() {
        return this.disabled;
    }
}
