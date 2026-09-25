package androidx.room;

/* JADX INFO: renamed from: androidx.room.-$$Lambda$l0jdGWVgR3o4ffMWMuoLxrLwoQ4, reason: invalid class name */
/* JADX INFO: compiled from: lambda */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class $$Lambda$l0jdGWVgR3o4ffMWMuoLxrLwoQ4 implements androidx.arch.core.util.Function {
    public static final /* synthetic */ androidx.room.$$Lambda$l0jdGWVgR3o4ffMWMuoLxrLwoQ4 INSTANCE = new androidx.room.$$Lambda$l0jdGWVgR3o4ffMWMuoLxrLwoQ4();

    private /* synthetic */ $$Lambda$l0jdGWVgR3o4ffMWMuoLxrLwoQ4() {
    }

    @Override // androidx.arch.core.util.Function
    public final java.lang.Object apply(java.lang.Object obj) {
        return java.lang.Boolean.valueOf(((androidx.sqlite.db.SupportSQLiteDatabase) obj).yieldIfContendedSafely());
    }
}
