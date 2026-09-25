package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

/* JADX INFO: compiled from: ClassData.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class ClassData {
    private final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class classProto;
    private final kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion metadataVersion;
    private final kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver nameResolver;
    private final kotlin.reflect.jvm.internal.impl.descriptors.SourceElement sourceElement;

    public final kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver component1() {
        return this.nameResolver;
    }

    public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class component2() {
        return this.classProto;
    }

    public final kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion component3() {
        return this.metadataVersion;
    }

    public final kotlin.reflect.jvm.internal.impl.descriptors.SourceElement component4() {
        return this.sourceElement;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassData)) {
            return false;
        }
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassData classData = (kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassData) obj;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.nameResolver, classData.nameResolver) && kotlin.jvm.internal.Intrinsics.areEqual(this.classProto, classData.classProto) && kotlin.jvm.internal.Intrinsics.areEqual(this.metadataVersion, classData.metadataVersion) && kotlin.jvm.internal.Intrinsics.areEqual(this.sourceElement, classData.sourceElement);
    }

    public int hashCode() {
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver nameResolver = this.nameResolver;
        int iHashCode = (nameResolver != null ? nameResolver.hashCode() : 0) * 31;
        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class r2 = this.classProto;
        int iHashCode2 = (iHashCode + (r2 != null ? r2.hashCode() : 0)) * 31;
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion binaryVersion = this.metadataVersion;
        int iHashCode3 = (iHashCode2 + (binaryVersion != null ? binaryVersion.hashCode() : 0)) * 31;
        kotlin.reflect.jvm.internal.impl.descriptors.SourceElement sourceElement = this.sourceElement;
        return iHashCode3 + (sourceElement != null ? sourceElement.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "ClassData(nameResolver=" + this.nameResolver + ", classProto=" + this.classProto + ", metadataVersion=" + this.metadataVersion + ", sourceElement=" + this.sourceElement + ")";
    }

    public ClassData(kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver nameResolver, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class classProto, kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion metadataVersion, kotlin.reflect.jvm.internal.impl.descriptors.SourceElement sourceElement) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(nameResolver, "nameResolver");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(classProto, "classProto");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(metadataVersion, "metadataVersion");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(sourceElement, "sourceElement");
        this.nameResolver = nameResolver;
        this.classProto = classProto;
        this.metadataVersion = metadataVersion;
        this.sourceElement = sourceElement;
    }
}
