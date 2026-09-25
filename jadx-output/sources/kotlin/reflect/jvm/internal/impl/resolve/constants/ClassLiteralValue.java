package kotlin.reflect.jvm.internal.impl.resolve.constants;

/* JADX INFO: compiled from: ClassLiteralValue.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class ClassLiteralValue {
    private final int arrayNestedness;
    private final kotlin.reflect.jvm.internal.impl.name.ClassId classId;

    public final kotlin.reflect.jvm.internal.impl.name.ClassId component1() {
        return this.classId;
    }

    public final int component2() {
        return this.arrayNestedness;
    }

    public boolean equals(java.lang.Object obj) {
        if (this != obj) {
            if (obj instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.ClassLiteralValue) {
                kotlin.reflect.jvm.internal.impl.resolve.constants.ClassLiteralValue classLiteralValue = (kotlin.reflect.jvm.internal.impl.resolve.constants.ClassLiteralValue) obj;
                if (kotlin.jvm.internal.Intrinsics.areEqual(this.classId, classLiteralValue.classId)) {
                    if (this.arrayNestedness == classLiteralValue.arrayNestedness) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        kotlin.reflect.jvm.internal.impl.name.ClassId classId = this.classId;
        return ((classId != null ? classId.hashCode() : 0) * 31) + this.arrayNestedness;
    }

    public ClassLiteralValue(kotlin.reflect.jvm.internal.impl.name.ClassId classId, int i) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(classId, "classId");
        this.classId = classId;
        this.arrayNestedness = i;
    }

    public final int getArrayNestedness() {
        return this.arrayNestedness;
    }

    public final kotlin.reflect.jvm.internal.impl.name.ClassId getClassId() {
        return this.classId;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int i = this.arrayNestedness;
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("kotlin/Array<");
        }
        sb.append(this.classId);
        int i3 = this.arrayNestedness;
        for (int i4 = 0; i4 < i3; i4++) {
            sb.append(">");
        }
        java.lang.String string = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
