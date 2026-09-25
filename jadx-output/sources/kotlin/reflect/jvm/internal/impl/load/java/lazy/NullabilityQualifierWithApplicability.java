package kotlin.reflect.jvm.internal.impl.load.java.lazy;

/* JADX INFO: compiled from: context.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class NullabilityQualifierWithApplicability {
    private final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus nullabilityQualifier;
    private final java.util.Collection<kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolver.QualifierApplicabilityType> qualifierApplicabilityTypes;

    public final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus component1() {
        return this.nullabilityQualifier;
    }

    public final java.util.Collection<kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolver.QualifierApplicabilityType> component2() {
        return this.qualifierApplicabilityTypes;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kotlin.reflect.jvm.internal.impl.load.java.lazy.NullabilityQualifierWithApplicability)) {
            return false;
        }
        kotlin.reflect.jvm.internal.impl.load.java.lazy.NullabilityQualifierWithApplicability nullabilityQualifierWithApplicability = (kotlin.reflect.jvm.internal.impl.load.java.lazy.NullabilityQualifierWithApplicability) obj;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.nullabilityQualifier, nullabilityQualifierWithApplicability.nullabilityQualifier) && kotlin.jvm.internal.Intrinsics.areEqual(this.qualifierApplicabilityTypes, nullabilityQualifierWithApplicability.qualifierApplicabilityTypes);
    }

    public int hashCode() {
        kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus = this.nullabilityQualifier;
        int iHashCode = (nullabilityQualifierWithMigrationStatus != null ? nullabilityQualifierWithMigrationStatus.hashCode() : 0) * 31;
        java.util.Collection<kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolver.QualifierApplicabilityType> collection = this.qualifierApplicabilityTypes;
        return iHashCode + (collection != null ? collection.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "NullabilityQualifierWithApplicability(nullabilityQualifier=" + this.nullabilityQualifier + ", qualifierApplicabilityTypes=" + this.qualifierApplicabilityTypes + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NullabilityQualifierWithApplicability(kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus nullabilityQualifier, java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolver.QualifierApplicabilityType> qualifierApplicabilityTypes) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(nullabilityQualifier, "nullabilityQualifier");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(qualifierApplicabilityTypes, "qualifierApplicabilityTypes");
        this.nullabilityQualifier = nullabilityQualifier;
        this.qualifierApplicabilityTypes = qualifierApplicabilityTypes;
    }
}
