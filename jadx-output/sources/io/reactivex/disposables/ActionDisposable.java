package io.reactivex.disposables;

/* JADX INFO: loaded from: classes2.dex */
final class ActionDisposable extends io.reactivex.disposables.ReferenceDisposable<io.reactivex.functions.Action> {
    private static final long serialVersionUID = -8219729196779211169L;

    ActionDisposable(io.reactivex.functions.Action action) {
        super(action);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.reactivex.disposables.ReferenceDisposable
    public void onDisposed(io.reactivex.functions.Action action) {
        try {
            action.run();
        } catch (java.lang.Throwable th) {
            throw io.reactivex.internal.util.ExceptionHelper.wrapOrThrow(th);
        }
    }
}
