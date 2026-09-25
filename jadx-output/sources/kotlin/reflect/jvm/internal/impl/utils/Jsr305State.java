package kotlin.reflect.jvm.internal.impl.utils;

/* JADX INFO: compiled from: Jsr305State.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class Jsr305State {
    static final /* synthetic */ kotlin.reflect.KProperty[] $$delegatedProperties = {kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlin.reflect.jvm.internal.impl.utils.Jsr305State.class), "description", "getDescription()[Ljava/lang/String;"))};
    public static final kotlin.reflect.jvm.internal.impl.utils.Jsr305State.Companion Companion = new kotlin.reflect.jvm.internal.impl.utils.Jsr305State.Companion(null);
    public static final kotlin.reflect.jvm.internal.impl.utils.Jsr305State DEFAULT = new kotlin.reflect.jvm.internal.impl.utils.Jsr305State(kotlin.reflect.jvm.internal.impl.utils.ReportLevel.WARN, null, kotlin.collections.MapsKt.emptyMap(), false, 8, null);
    public static final kotlin.reflect.jvm.internal.impl.utils.Jsr305State DISABLED = new kotlin.reflect.jvm.internal.impl.utils.Jsr305State(kotlin.reflect.jvm.internal.impl.utils.ReportLevel.IGNORE, kotlin.reflect.jvm.internal.impl.utils.ReportLevel.IGNORE, kotlin.collections.MapsKt.emptyMap(), false, 8, null);
    public static final kotlin.reflect.jvm.internal.impl.utils.Jsr305State STRICT = new kotlin.reflect.jvm.internal.impl.utils.Jsr305State(kotlin.reflect.jvm.internal.impl.utils.ReportLevel.STRICT, kotlin.reflect.jvm.internal.impl.utils.ReportLevel.STRICT, kotlin.collections.MapsKt.emptyMap(), false, 8, null);
    private final kotlin.Lazy description$delegate;
    private final boolean enableCompatqualCheckerFrameworkAnnotations;
    private final kotlin.reflect.jvm.internal.impl.utils.ReportLevel global;
    private final kotlin.reflect.jvm.internal.impl.utils.ReportLevel migration;
    private final java.util.Map<java.lang.String, kotlin.reflect.jvm.internal.impl.utils.ReportLevel> user;

    public boolean equals(java.lang.Object obj) {
        if (this != obj) {
            if (obj instanceof kotlin.reflect.jvm.internal.impl.utils.Jsr305State) {
                kotlin.reflect.jvm.internal.impl.utils.Jsr305State jsr305State = (kotlin.reflect.jvm.internal.impl.utils.Jsr305State) obj;
                if (kotlin.jvm.internal.Intrinsics.areEqual(this.global, jsr305State.global) && kotlin.jvm.internal.Intrinsics.areEqual(this.migration, jsr305State.migration) && kotlin.jvm.internal.Intrinsics.areEqual(this.user, jsr305State.user)) {
                    if (this.enableCompatqualCheckerFrameworkAnnotations == jsr305State.enableCompatqualCheckerFrameworkAnnotations) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v6 */
    public int hashCode() {
        kotlin.reflect.jvm.internal.impl.utils.ReportLevel reportLevel = this.global;
        int iHashCode = (reportLevel != null ? reportLevel.hashCode() : 0) * 31;
        kotlin.reflect.jvm.internal.impl.utils.ReportLevel reportLevel2 = this.migration;
        int iHashCode2 = (iHashCode + (reportLevel2 != null ? reportLevel2.hashCode() : 0)) * 31;
        java.util.Map<java.lang.String, kotlin.reflect.jvm.internal.impl.utils.ReportLevel> map = this.user;
        int iHashCode3 = (iHashCode2 + (map != null ? map.hashCode() : 0)) * 31;
        boolean z = this.enableCompatqualCheckerFrameworkAnnotations;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return iHashCode3 + r1;
    }

    public java.lang.String toString() {
        return "Jsr305State(global=" + this.global + ", migration=" + this.migration + ", user=" + this.user + ", enableCompatqualCheckerFrameworkAnnotations=" + this.enableCompatqualCheckerFrameworkAnnotations + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Jsr305State(kotlin.reflect.jvm.internal.impl.utils.ReportLevel global, kotlin.reflect.jvm.internal.impl.utils.ReportLevel reportLevel, java.util.Map<java.lang.String, ? extends kotlin.reflect.jvm.internal.impl.utils.ReportLevel> user, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(global, "global");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(user, "user");
        this.global = global;
        this.migration = reportLevel;
        this.user = user;
        this.enableCompatqualCheckerFrameworkAnnotations = z;
        this.description$delegate = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<java.lang.String[]>() { // from class: kotlin.reflect.jvm.internal.impl.utils.Jsr305State$description$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final java.lang.String[] invoke() {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(this.this$0.getGlobal().getDescription());
                kotlin.reflect.jvm.internal.impl.utils.ReportLevel migration = this.this$0.getMigration();
                if (migration != null) {
                    arrayList.add("under-migration:" + migration.getDescription());
                }
                for (java.util.Map.Entry<java.lang.String, kotlin.reflect.jvm.internal.impl.utils.ReportLevel> entry : this.this$0.getUser().entrySet()) {
                    arrayList.add('@' + entry.getKey() + ':' + entry.getValue().getDescription());
                }
                java.lang.Object[] array = arrayList.toArray(new java.lang.String[0]);
                if (array != null) {
                    return (java.lang.String[]) array;
                }
                throw new kotlin.TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
            }
        });
    }

    public final kotlin.reflect.jvm.internal.impl.utils.ReportLevel getGlobal() {
        return this.global;
    }

    public final kotlin.reflect.jvm.internal.impl.utils.ReportLevel getMigration() {
        return this.migration;
    }

    public final java.util.Map<java.lang.String, kotlin.reflect.jvm.internal.impl.utils.ReportLevel> getUser() {
        return this.user;
    }

    public /* synthetic */ Jsr305State(kotlin.reflect.jvm.internal.impl.utils.ReportLevel reportLevel, kotlin.reflect.jvm.internal.impl.utils.ReportLevel reportLevel2, java.util.Map map, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(reportLevel, reportLevel2, map, (i & 8) != 0 ? true : z);
    }

    public final boolean getEnableCompatqualCheckerFrameworkAnnotations() {
        return this.enableCompatqualCheckerFrameworkAnnotations;
    }

    public final boolean getDisabled() {
        return this == DISABLED;
    }

    /* JADX INFO: compiled from: Jsr305State.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
