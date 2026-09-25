package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

/* JADX INFO: compiled from: IncompatibleVersionErrorData.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class IncompatibleVersionErrorData<T extends kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion> {
    private final T actualVersion;
    private final kotlin.reflect.jvm.internal.impl.name.ClassId classId;
    private final T expectedVersion;
    private final java.lang.String filePath;

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kotlin.reflect.jvm.internal.impl.serialization.deserialization.IncompatibleVersionErrorData)) {
            return false;
        }
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.IncompatibleVersionErrorData incompatibleVersionErrorData = (kotlin.reflect.jvm.internal.impl.serialization.deserialization.IncompatibleVersionErrorData) obj;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.actualVersion, incompatibleVersionErrorData.actualVersion) && kotlin.jvm.internal.Intrinsics.areEqual(this.expectedVersion, incompatibleVersionErrorData.expectedVersion) && kotlin.jvm.internal.Intrinsics.areEqual(this.filePath, incompatibleVersionErrorData.filePath) && kotlin.jvm.internal.Intrinsics.areEqual(this.classId, incompatibleVersionErrorData.classId);
    }

    public int hashCode() {
        T t = this.actualVersion;
        int iHashCode = (t != null ? t.hashCode() : 0) * 31;
        T t2 = this.expectedVersion;
        int iHashCode2 = (iHashCode + (t2 != null ? t2.hashCode() : 0)) * 31;
        java.lang.String str = this.filePath;
        int iHashCode3 = (iHashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        kotlin.reflect.jvm.internal.impl.name.ClassId classId = this.classId;
        return iHashCode3 + (classId != null ? classId.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "IncompatibleVersionErrorData(actualVersion=" + this.actualVersion + ", expectedVersion=" + this.expectedVersion + ", filePath=" + this.filePath + ", classId=" + this.classId + ")";
    }

    public IncompatibleVersionErrorData(T actualVersion, T expectedVersion, java.lang.String filePath, kotlin.reflect.jvm.internal.impl.name.ClassId classId) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(actualVersion, "actualVersion");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(expectedVersion, "expectedVersion");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(filePath, "filePath");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(classId, "classId");
        this.actualVersion = actualVersion;
        this.expectedVersion = expectedVersion;
        this.filePath = filePath;
        this.classId = classId;
    }
}
