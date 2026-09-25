package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

/* JADX INFO: compiled from: signatureEnhancement.kt */
/* JADX INFO: loaded from: classes2.dex */
final class TypeAndDefaultQualifiers {
    private final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers defaultQualifiers;
    private final kotlin.reflect.jvm.internal.impl.types.KotlinType type;

    public final kotlin.reflect.jvm.internal.impl.types.KotlinType component1() {
        return this.type;
    }

    public final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers component2() {
        return this.defaultQualifiers;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeAndDefaultQualifiers)) {
            return false;
        }
        kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeAndDefaultQualifiers typeAndDefaultQualifiers = (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeAndDefaultQualifiers) obj;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.type, typeAndDefaultQualifiers.type) && kotlin.jvm.internal.Intrinsics.areEqual(this.defaultQualifiers, typeAndDefaultQualifiers.defaultQualifiers);
    }

    public int hashCode() {
        kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType = this.type;
        int iHashCode = (kotlinType != null ? kotlinType.hashCode() : 0) * 31;
        kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers javaTypeQualifiers = this.defaultQualifiers;
        return iHashCode + (javaTypeQualifiers != null ? javaTypeQualifiers.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "TypeAndDefaultQualifiers(type=" + this.type + ", defaultQualifiers=" + this.defaultQualifiers + ")";
    }

    public TypeAndDefaultQualifiers(kotlin.reflect.jvm.internal.impl.types.KotlinType type, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers javaTypeQualifiers) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(type, "type");
        this.type = type;
        this.defaultQualifiers = javaTypeQualifiers;
    }

    public final kotlin.reflect.jvm.internal.impl.types.KotlinType getType() {
        return this.type;
    }
}
