package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

/* JADX INFO: compiled from: JavaTypeResolver.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class JavaTypeAttributes {
    private final kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeFlexibility flexibility;
    private final kotlin.reflect.jvm.internal.impl.load.java.components.TypeUsage howThisTypeIsUsed;
    private final boolean isForAnnotationParameter;
    private final kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor upperBoundOfTypeParameter;

    public static /* synthetic */ kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributes copy$default(kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributes javaTypeAttributes, kotlin.reflect.jvm.internal.impl.load.java.components.TypeUsage typeUsage, kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeFlexibility javaTypeFlexibility, boolean z, kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor typeParameterDescriptor, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            typeUsage = javaTypeAttributes.howThisTypeIsUsed;
        }
        if ((i & 2) != 0) {
            javaTypeFlexibility = javaTypeAttributes.flexibility;
        }
        if ((i & 4) != 0) {
            z = javaTypeAttributes.isForAnnotationParameter;
        }
        if ((i & 8) != 0) {
            typeParameterDescriptor = javaTypeAttributes.upperBoundOfTypeParameter;
        }
        return javaTypeAttributes.copy(typeUsage, javaTypeFlexibility, z, typeParameterDescriptor);
    }

    public final kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributes copy(kotlin.reflect.jvm.internal.impl.load.java.components.TypeUsage howThisTypeIsUsed, kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeFlexibility flexibility, boolean z, kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor typeParameterDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(howThisTypeIsUsed, "howThisTypeIsUsed");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(flexibility, "flexibility");
        return new kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributes(howThisTypeIsUsed, flexibility, z, typeParameterDescriptor);
    }

    public boolean equals(java.lang.Object obj) {
        if (this != obj) {
            if (obj instanceof kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributes) {
                kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributes javaTypeAttributes = (kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributes) obj;
                if (kotlin.jvm.internal.Intrinsics.areEqual(this.howThisTypeIsUsed, javaTypeAttributes.howThisTypeIsUsed) && kotlin.jvm.internal.Intrinsics.areEqual(this.flexibility, javaTypeAttributes.flexibility)) {
                    if (!(this.isForAnnotationParameter == javaTypeAttributes.isForAnnotationParameter) || !kotlin.jvm.internal.Intrinsics.areEqual(this.upperBoundOfTypeParameter, javaTypeAttributes.upperBoundOfTypeParameter)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [int] */
    /* JADX WARN: Type inference failed for: r2v4, types: [int] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v8 */
    public int hashCode() {
        kotlin.reflect.jvm.internal.impl.load.java.components.TypeUsage typeUsage = this.howThisTypeIsUsed;
        int iHashCode = (typeUsage != null ? typeUsage.hashCode() : 0) * 31;
        kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeFlexibility javaTypeFlexibility = this.flexibility;
        int iHashCode2 = (iHashCode + (javaTypeFlexibility != null ? javaTypeFlexibility.hashCode() : 0)) * 31;
        boolean z = this.isForAnnotationParameter;
        ?? r2 = z;
        if (z) {
            r2 = 1;
        }
        int i = (iHashCode2 + r2) * 31;
        kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor typeParameterDescriptor = this.upperBoundOfTypeParameter;
        return i + (typeParameterDescriptor != null ? typeParameterDescriptor.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "JavaTypeAttributes(howThisTypeIsUsed=" + this.howThisTypeIsUsed + ", flexibility=" + this.flexibility + ", isForAnnotationParameter=" + this.isForAnnotationParameter + ", upperBoundOfTypeParameter=" + this.upperBoundOfTypeParameter + ")";
    }

    public JavaTypeAttributes(kotlin.reflect.jvm.internal.impl.load.java.components.TypeUsage howThisTypeIsUsed, kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeFlexibility flexibility, boolean z, kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor typeParameterDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(howThisTypeIsUsed, "howThisTypeIsUsed");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(flexibility, "flexibility");
        this.howThisTypeIsUsed = howThisTypeIsUsed;
        this.flexibility = flexibility;
        this.isForAnnotationParameter = z;
        this.upperBoundOfTypeParameter = typeParameterDescriptor;
    }

    public final kotlin.reflect.jvm.internal.impl.load.java.components.TypeUsage getHowThisTypeIsUsed() {
        return this.howThisTypeIsUsed;
    }

    public /* synthetic */ JavaTypeAttributes(kotlin.reflect.jvm.internal.impl.load.java.components.TypeUsage typeUsage, kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeFlexibility javaTypeFlexibility, boolean z, kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor typeParameterDescriptor, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(typeUsage, (i & 2) != 0 ? kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeFlexibility.INFLEXIBLE : javaTypeFlexibility, (i & 4) != 0 ? false : z, (i & 8) != 0 ? (kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor) null : typeParameterDescriptor);
    }

    public final kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeFlexibility getFlexibility() {
        return this.flexibility;
    }

    public final boolean isForAnnotationParameter() {
        return this.isForAnnotationParameter;
    }

    public final kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor getUpperBoundOfTypeParameter() {
        return this.upperBoundOfTypeParameter;
    }

    public final kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributes withFlexibility(kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeFlexibility flexibility) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(flexibility, "flexibility");
        return copy$default(this, null, flexibility, false, null, 13, null);
    }
}
