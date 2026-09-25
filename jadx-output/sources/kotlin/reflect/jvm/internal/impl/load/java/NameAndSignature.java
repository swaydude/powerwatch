package kotlin.reflect.jvm.internal.impl.load.java;

/* JADX INFO: compiled from: specialBuiltinMembers.kt */
/* JADX INFO: loaded from: classes2.dex */
final class NameAndSignature {
    private final kotlin.reflect.jvm.internal.impl.name.Name name;
    private final java.lang.String signature;

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kotlin.reflect.jvm.internal.impl.load.java.NameAndSignature)) {
            return false;
        }
        kotlin.reflect.jvm.internal.impl.load.java.NameAndSignature nameAndSignature = (kotlin.reflect.jvm.internal.impl.load.java.NameAndSignature) obj;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.name, nameAndSignature.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.signature, nameAndSignature.signature);
    }

    public int hashCode() {
        kotlin.reflect.jvm.internal.impl.name.Name name = this.name;
        int iHashCode = (name != null ? name.hashCode() : 0) * 31;
        java.lang.String str = this.signature;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "NameAndSignature(name=" + this.name + ", signature=" + this.signature + ")";
    }

    public NameAndSignature(kotlin.reflect.jvm.internal.impl.name.Name name, java.lang.String signature) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(name, "name");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(signature, "signature");
        this.name = name;
        this.signature = signature;
    }

    public final kotlin.reflect.jvm.internal.impl.name.Name getName() {
        return this.name;
    }

    public final java.lang.String getSignature() {
        return this.signature;
    }
}
