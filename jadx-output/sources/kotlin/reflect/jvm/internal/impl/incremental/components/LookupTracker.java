package kotlin.reflect.jvm.internal.impl.incremental.components;

/* JADX INFO: compiled from: LookupTracker.kt */
/* JADX INFO: loaded from: classes2.dex */
public interface LookupTracker {
    boolean getRequiresPosition();

    void record(java.lang.String str, kotlin.reflect.jvm.internal.impl.incremental.components.Position position, java.lang.String str2, kotlin.reflect.jvm.internal.impl.incremental.components.ScopeKind scopeKind, java.lang.String str3);

    /* JADX INFO: compiled from: LookupTracker.kt */
    public static final class DO_NOTHING implements kotlin.reflect.jvm.internal.impl.incremental.components.LookupTracker {
        public static final kotlin.reflect.jvm.internal.impl.incremental.components.LookupTracker.DO_NOTHING INSTANCE = new kotlin.reflect.jvm.internal.impl.incremental.components.LookupTracker.DO_NOTHING();

        @Override // kotlin.reflect.jvm.internal.impl.incremental.components.LookupTracker
        public boolean getRequiresPosition() {
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.incremental.components.LookupTracker
        public void record(java.lang.String filePath, kotlin.reflect.jvm.internal.impl.incremental.components.Position position, java.lang.String scopeFqName, kotlin.reflect.jvm.internal.impl.incremental.components.ScopeKind scopeKind, java.lang.String name) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(filePath, "filePath");
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(position, "position");
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(scopeFqName, "scopeFqName");
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(scopeKind, "scopeKind");
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(name, "name");
        }

        private DO_NOTHING() {
        }
    }
}
