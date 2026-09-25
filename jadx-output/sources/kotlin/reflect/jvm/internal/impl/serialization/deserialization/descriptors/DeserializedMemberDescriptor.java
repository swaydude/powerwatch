package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

/* JADX INFO: compiled from: DeserializedMemberDescriptor.kt */
/* JADX INFO: loaded from: classes2.dex */
public interface DeserializedMemberDescriptor extends kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor {

    /* JADX INFO: compiled from: DeserializedMemberDescriptor.kt */
    public enum CoroutinesCompatibilityMode {
        COMPATIBLE,
        NEEDS_WRAPPER,
        INCOMPATIBLE
    }

    kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver getNameResolver();

    kotlin.reflect.jvm.internal.impl.protobuf.MessageLite getProto();

    kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable getTypeTable();

    kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable getVersionRequirementTable();

    java.util.List<kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirement> getVersionRequirements();

    /* JADX INFO: compiled from: DeserializedMemberDescriptor.kt */
    public static final class DefaultImpls {
        public static java.util.List<kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirement> getVersionRequirements(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor deserializedMemberDescriptor) {
            return kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirement.Companion.create(deserializedMemberDescriptor.getProto(), deserializedMemberDescriptor.getNameResolver(), deserializedMemberDescriptor.getVersionRequirementTable());
        }
    }
}
