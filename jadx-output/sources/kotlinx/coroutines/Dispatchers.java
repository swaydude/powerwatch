package kotlinx.coroutines;

/* JADX INFO: compiled from: Dispatchers.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\t\u0010\u0002\u001a\u0004\b\n\u0010\u0007R\u001a\u0010\u000b\u001a\u00020\f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\r\u0010\u0002\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\u0002\u001a\u0004\b\u0012\u0010\u0007¨\u0006\u0013"}, d2 = {"Lkotlinx/coroutines/Dispatchers;", "", "()V", "Default", "Lkotlinx/coroutines/CoroutineDispatcher;", "Default$annotations", "getDefault", "()Lkotlinx/coroutines/CoroutineDispatcher;", "IO", "IO$annotations", "getIO", "Main", "Lkotlinx/coroutines/MainCoroutineDispatcher;", "Main$annotations", "getMain", "()Lkotlinx/coroutines/MainCoroutineDispatcher;", "Unconfined", "Unconfined$annotations", "getUnconfined", "kotlinx-coroutines-core"}, k = 1, mv = {1, 1, 13})
public final class Dispatchers {
    public static final kotlinx.coroutines.Dispatchers INSTANCE = new kotlinx.coroutines.Dispatchers();
    private static final kotlinx.coroutines.CoroutineDispatcher Default = kotlinx.coroutines.CoroutineContextKt.createDefaultDispatcher();
    private static final kotlinx.coroutines.CoroutineDispatcher Unconfined = kotlinx.coroutines.Unconfined.INSTANCE;
    private static final kotlinx.coroutines.CoroutineDispatcher IO = kotlinx.coroutines.scheduling.DefaultScheduler.INSTANCE.getIO();

    @kotlin.jvm.JvmStatic
    public static /* synthetic */ void Default$annotations() {
    }

    @kotlin.jvm.JvmStatic
    public static /* synthetic */ void IO$annotations() {
    }

    @kotlin.jvm.JvmStatic
    public static /* synthetic */ void Main$annotations() {
    }

    @kotlin.jvm.JvmStatic
    public static /* synthetic */ void Unconfined$annotations() {
    }

    private Dispatchers() {
    }

    public static final kotlinx.coroutines.CoroutineDispatcher getDefault() {
        return Default;
    }

    public static final kotlinx.coroutines.MainCoroutineDispatcher getMain() {
        return kotlinx.coroutines.internal.MainDispatcherLoader.dispatcher;
    }

    public static final kotlinx.coroutines.CoroutineDispatcher getUnconfined() {
        return Unconfined;
    }

    public static final kotlinx.coroutines.CoroutineDispatcher getIO() {
        return IO;
    }
}
