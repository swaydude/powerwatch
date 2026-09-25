package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

/* JADX INFO: compiled from: VersionRequirement.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class VersionRequirementTable {
    public static final kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable.Companion Companion = new kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable.Companion(null);
    private static final kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable EMPTY = new kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable(kotlin.collections.CollectionsKt.emptyList());
    private final java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement> infos;

    private VersionRequirementTable(java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement> list) {
        this.infos = list;
    }

    public /* synthetic */ VersionRequirementTable(java.util.List list, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(list);
    }

    public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement get(int i) {
        return (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement) kotlin.collections.CollectionsKt.getOrNull(this.infos, i);
    }

    /* JADX INFO: compiled from: VersionRequirement.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable getEMPTY() {
            return kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable.EMPTY;
        }

        public final kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable create(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable table) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(table, "table");
            if (table.getRequirementCount() == 0) {
                return getEMPTY();
            }
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement> requirementList = table.getRequirementList();
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(requirementList, "table.requirementList");
            return new kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable(requirementList, null);
        }
    }
}
