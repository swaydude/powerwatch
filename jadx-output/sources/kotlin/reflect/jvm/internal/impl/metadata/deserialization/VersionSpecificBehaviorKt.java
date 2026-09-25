package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

/* JADX INFO: compiled from: versionSpecificBehavior.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class VersionSpecificBehaviorKt {
    public static final boolean isVersionRequirementTableWrittenCorrectly(kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion version) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(version, "version");
        return isKotlin1Dot4OrLater(version);
    }

    public static final boolean isKotlin1Dot4OrLater(kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion version) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(version, "version");
        return version.getMajor() == 1 && version.getMinor() >= 4;
    }
}
