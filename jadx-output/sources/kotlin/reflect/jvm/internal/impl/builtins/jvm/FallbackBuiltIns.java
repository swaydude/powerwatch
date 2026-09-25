package kotlin.reflect.jvm.internal.impl.builtins.jvm;

/* JADX INFO: compiled from: JvmBuiltInsSettings.kt */
/* JADX INFO: loaded from: classes2.dex */
final class FallbackBuiltIns extends kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns {
    public static final kotlin.reflect.jvm.internal.impl.builtins.jvm.FallbackBuiltIns.Companion Companion = new kotlin.reflect.jvm.internal.impl.builtins.jvm.FallbackBuiltIns.Companion(null);
    private static final kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns Instance = new kotlin.reflect.jvm.internal.impl.builtins.jvm.FallbackBuiltIns();

    private FallbackBuiltIns() {
        super(new kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager("FallbackBuiltIns"));
        createBuiltInsModule(true);
    }

    /* JADX INFO: compiled from: JvmBuiltInsSettings.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns getInstance() {
            return kotlin.reflect.jvm.internal.impl.builtins.jvm.FallbackBuiltIns.Instance;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns
    public kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter.All getPlatformDependentDeclarationFilter() {
        return kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter.All.INSTANCE;
    }
}
