package kotlin.reflect.jvm.internal.impl.builtins;

/* JADX INFO: compiled from: DefaultBuiltIns.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class DefaultBuiltIns extends kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns {
    public static final kotlin.reflect.jvm.internal.impl.builtins.DefaultBuiltIns.Companion Companion;
    private static final kotlin.reflect.jvm.internal.impl.builtins.DefaultBuiltIns Instance;

    public DefaultBuiltIns() {
        this(false, 1, null);
    }

    public static final kotlin.reflect.jvm.internal.impl.builtins.DefaultBuiltIns getInstance() {
        return Instance;
    }

    public DefaultBuiltIns(boolean z) {
        super(new kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager("DefaultBuiltIns"));
        if (z) {
            createBuiltInsModule(false);
        }
    }

    public /* synthetic */ DefaultBuiltIns(boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z);
    }

    /* JADX INFO: compiled from: DefaultBuiltIns.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new kotlin.reflect.jvm.internal.impl.builtins.DefaultBuiltIns.Companion(defaultConstructorMarker);
        Instance = new kotlin.reflect.jvm.internal.impl.builtins.DefaultBuiltIns(false, 1, defaultConstructorMarker);
    }
}
