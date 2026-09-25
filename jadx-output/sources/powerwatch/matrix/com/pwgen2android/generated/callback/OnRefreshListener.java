package powerwatch.matrix.com.pwgen2android.generated.callback;

/* JADX INFO: loaded from: classes2.dex */
public final class OnRefreshListener implements androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener {
    final powerwatch.matrix.com.pwgen2android.generated.callback.OnRefreshListener.Listener mListener;
    final int mSourceId;

    public interface Listener {
        void _internalCallbackOnRefresh(int sourceId);
    }

    public OnRefreshListener(powerwatch.matrix.com.pwgen2android.generated.callback.OnRefreshListener.Listener listener, int sourceId) {
        this.mListener = listener;
        this.mSourceId = sourceId;
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
    public void onRefresh() {
        this.mListener._internalCallbackOnRefresh(this.mSourceId);
    }
}
