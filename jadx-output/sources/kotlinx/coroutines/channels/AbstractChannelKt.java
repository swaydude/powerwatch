package kotlinx.coroutines.channels;

/* JADX INFO: compiled from: AbstractChannel.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0000\"\u0016\u0010\u0000\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0002\u0010\u0003\"\u0016\u0010\u0004\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0003\"\u0016\u0010\u0006\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0007\u0010\u0003\"\u0016\u0010\b\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b\t\u0010\u0003\"\u0016\u0010\n\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u000b\u0010\u0003\"\u0016\u0010\f\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b\r\u0010\u0003\"\u0016\u0010\u000e\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u000f\u0010\u0003\"\u0016\u0010\u0010\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0011\u0010\u0003\"\u0016\u0010\u0012\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0013\u0010\u0003*(\b\u0000\u0010\u0014\"\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0004\u0012\u00020\u00170\u00152\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0004\u0012\u00020\u00170\u0015¨\u0006\u0018"}, d2 = {"CLOSE_RESUMED", "", "CLOSE_RESUMED$annotations", "()V", "ENQUEUE_FAILED", "ENQUEUE_FAILED$annotations", "HANDLER_INVOKED", "HANDLER_INVOKED$annotations", "NULL_VALUE", "NULL_VALUE$annotations", "OFFER_FAILED", "OFFER_FAILED$annotations", "OFFER_SUCCESS", "OFFER_SUCCESS$annotations", "POLL_FAILED", "POLL_FAILED$annotations", "SELECT_STARTED", "SELECT_STARTED$annotations", "SEND_RESUMED", "SEND_RESUMED$annotations", "Handler", "Lkotlin/Function1;", "", "", "kotlinx-coroutines-core"}, k = 2, mv = {1, 1, 13})
public final class AbstractChannelKt {
    public static final java.lang.Object OFFER_SUCCESS = new kotlinx.coroutines.internal.Symbol("OFFER_SUCCESS");
    public static final java.lang.Object OFFER_FAILED = new kotlinx.coroutines.internal.Symbol("OFFER_FAILED");
    public static final java.lang.Object POLL_FAILED = new kotlinx.coroutines.internal.Symbol("POLL_FAILED");
    public static final java.lang.Object ENQUEUE_FAILED = new kotlinx.coroutines.internal.Symbol("ENQUEUE_FAILED");
    public static final java.lang.Object SELECT_STARTED = new kotlinx.coroutines.internal.Symbol("SELECT_STARTED");
    public static final java.lang.Object NULL_VALUE = new kotlinx.coroutines.internal.Symbol("NULL_VALUE");
    public static final java.lang.Object CLOSE_RESUMED = new kotlinx.coroutines.internal.Symbol("CLOSE_RESUMED");
    public static final java.lang.Object SEND_RESUMED = new kotlinx.coroutines.internal.Symbol("SEND_RESUMED");
    public static final java.lang.Object HANDLER_INVOKED = new kotlinx.coroutines.internal.Symbol("ON_CLOSE_HANDLER_INVOKED");

    public static /* synthetic */ void CLOSE_RESUMED$annotations() {
    }

    public static /* synthetic */ void ENQUEUE_FAILED$annotations() {
    }

    public static /* synthetic */ void HANDLER_INVOKED$annotations() {
    }

    public static /* synthetic */ void NULL_VALUE$annotations() {
    }

    public static /* synthetic */ void OFFER_FAILED$annotations() {
    }

    public static /* synthetic */ void OFFER_SUCCESS$annotations() {
    }

    public static /* synthetic */ void POLL_FAILED$annotations() {
    }

    public static /* synthetic */ void SELECT_STARTED$annotations() {
    }

    public static /* synthetic */ void SEND_RESUMED$annotations() {
    }
}
