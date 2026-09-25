package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

/* JADX INFO: compiled from: VersionRequirement.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class VersionRequirement {
    public static final kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirement.Companion Companion = new kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirement.Companion(null);
    private final java.lang.Integer errorCode;
    private final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.VersionKind kind;
    private final kotlin.DeprecationLevel level;
    private final java.lang.String message;
    private final kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirement.Version version;

    public VersionRequirement(kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirement.Version version, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.VersionKind kind, kotlin.DeprecationLevel level, java.lang.Integer num, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(version, "version");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(kind, "kind");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(level, "level");
        this.version = version;
        this.kind = kind;
        this.level = level;
        this.errorCode = num;
        this.message = str;
    }

    public final kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirement.Version getVersion() {
        return this.version;
    }

    public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.VersionKind getKind() {
        return this.kind;
    }

    /* JADX INFO: compiled from: VersionRequirement.kt */
    public static final class Version {
        public static final kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirement.Version.Companion Companion = new kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirement.Version.Companion(null);
        public static final kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirement.Version INFINITY = new kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirement.Version(256, 256, 256);
        private final int major;
        private final int minor;
        private final int patch;

        public boolean equals(java.lang.Object obj) {
            if (this != obj) {
                if (obj instanceof kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirement.Version) {
                    kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirement.Version version = (kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirement.Version) obj;
                    if (this.major == version.major) {
                        if (this.minor == version.minor) {
                            if (this.patch == version.patch) {
                            }
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((this.major * 31) + this.minor) * 31) + this.patch;
        }

        public Version(int i, int i2, int i3) {
            this.major = i;
            this.minor = i2;
            this.patch = i3;
        }

        public /* synthetic */ Version(int i, int i2, int i3, int i4, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(i, i2, (i4 & 4) != 0 ? 0 : i3);
        }

        public final java.lang.String asString() {
            java.lang.StringBuilder sb;
            int i;
            if (this.patch == 0) {
                sb = new java.lang.StringBuilder();
                sb.append(this.major);
                sb.append('.');
                i = this.minor;
            } else {
                sb = new java.lang.StringBuilder();
                sb.append(this.major);
                sb.append('.');
                sb.append(this.minor);
                sb.append('.');
                i = this.patch;
            }
            sb.append(i);
            return sb.toString();
        }

        public java.lang.String toString() {
            return asString();
        }

        /* JADX INFO: compiled from: VersionRequirement.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirement.Version decode(java.lang.Integer num, java.lang.Integer num2) {
                if (num2 != null) {
                    return new kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirement.Version(num2.intValue() & 255, (num2.intValue() >> 8) & 255, (num2.intValue() >> 16) & 255);
                }
                if (num != null) {
                    return new kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirement.Version(num.intValue() & 7, (num.intValue() >> 3) & 15, (num.intValue() >> 7) & kotlinx.coroutines.scheduling.WorkQueueKt.MASK);
                }
                return kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirement.Version.INFINITY;
            }
        }
    }

    public java.lang.String toString() {
        java.lang.String str;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("since ");
        sb.append(this.version);
        sb.append(' ');
        sb.append(this.level);
        java.lang.String str2 = "";
        if (this.errorCode != null) {
            str = " error " + this.errorCode;
        } else {
            str = "";
        }
        sb.append(str);
        if (this.message != null) {
            str2 = ": " + this.message;
        }
        sb.append(str2);
        return sb.toString();
    }

    /* JADX INFO: compiled from: VersionRequirement.kt */
    public static final class Companion {

        public final /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.Level.values().length];
                $EnumSwitchMapping$0 = iArr;
                iArr[kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.Level.WARNING.ordinal()] = 1;
                iArr[kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.Level.ERROR.ordinal()] = 2;
                iArr[kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.Level.HIDDEN.ordinal()] = 3;
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final java.util.List<kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirement> create(kotlin.reflect.jvm.internal.impl.protobuf.MessageLite proto, kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver nameResolver, kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable table) {
            java.util.List<java.lang.Integer> ids;
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(proto, "proto");
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(nameResolver, "nameResolver");
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(table, "table");
            if (proto instanceof kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class) {
                ids = ((kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class) proto).getVersionRequirementList();
            } else if (proto instanceof kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor) {
                ids = ((kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor) proto).getVersionRequirementList();
            } else if (proto instanceof kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function) {
                ids = ((kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function) proto).getVersionRequirementList();
            } else if (proto instanceof kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property) {
                ids = ((kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property) proto).getVersionRequirementList();
            } else {
                if (!(proto instanceof kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias)) {
                    throw new java.lang.IllegalStateException("Unexpected declaration: " + proto.getClass());
                }
                ids = ((kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias) proto).getVersionRequirementList();
            }
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(ids, "ids");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Integer id : ids) {
                kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirement.Companion companion = kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirement.Companion;
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(id, "id");
                kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirement versionRequirementCreate = companion.create(id.intValue(), nameResolver, table);
                if (versionRequirementCreate != null) {
                    arrayList.add(versionRequirementCreate);
                }
            }
            return arrayList;
        }

        public final kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirement create(int i, kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver nameResolver, kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable table) {
            kotlin.DeprecationLevel deprecationLevel;
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(nameResolver, "nameResolver");
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(table, "table");
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement versionRequirement = table.get(i);
            if (versionRequirement == null) {
                return null;
            }
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirement.Version versionDecode = kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirement.Version.Companion.decode(versionRequirement.hasVersion() ? java.lang.Integer.valueOf(versionRequirement.getVersion()) : null, versionRequirement.hasVersionFull() ? java.lang.Integer.valueOf(versionRequirement.getVersionFull()) : null);
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.Level level = versionRequirement.getLevel();
            if (level == null) {
                kotlin.jvm.internal.Intrinsics.throwNpe();
            }
            int i2 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirement.Companion.WhenMappings.$EnumSwitchMapping$0[level.ordinal()];
            if (i2 == 1) {
                deprecationLevel = kotlin.DeprecationLevel.WARNING;
            } else if (i2 == 2) {
                deprecationLevel = kotlin.DeprecationLevel.ERROR;
            } else {
                if (i2 != 3) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                deprecationLevel = kotlin.DeprecationLevel.HIDDEN;
            }
            kotlin.DeprecationLevel deprecationLevel2 = deprecationLevel;
            java.lang.Integer numValueOf = versionRequirement.hasErrorCode() ? java.lang.Integer.valueOf(versionRequirement.getErrorCode()) : null;
            java.lang.String string = versionRequirement.hasMessage() ? nameResolver.getString(versionRequirement.getMessage()) : null;
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.VersionKind versionKind = versionRequirement.getVersionKind();
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(versionKind, "info.versionKind");
            return new kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirement(versionDecode, versionKind, deprecationLevel2, numValueOf, string);
        }
    }
}
