package androidx.databinding.adapters;

/* JADX INFO: loaded from: classes.dex */
public class AbsListViewBindingAdapter {

    public interface OnScroll {
        void onScroll(android.widget.AbsListView absListView, int i, int i2, int i3);
    }

    public interface OnScrollStateChanged {
        void onScrollStateChanged(android.widget.AbsListView absListView, int i);
    }

    public static void setOnScroll(android.widget.AbsListView absListView, final androidx.databinding.adapters.AbsListViewBindingAdapter.OnScroll onScroll, final androidx.databinding.adapters.AbsListViewBindingAdapter.OnScrollStateChanged onScrollStateChanged) {
        absListView.setOnScrollListener(new android.widget.AbsListView.OnScrollListener() { // from class: androidx.databinding.adapters.AbsListViewBindingAdapter.1
            @Override // android.widget.AbsListView.OnScrollListener
            public void onScrollStateChanged(android.widget.AbsListView absListView2, int i) {
                androidx.databinding.adapters.AbsListViewBindingAdapter.OnScrollStateChanged onScrollStateChanged2 = onScrollStateChanged;
                if (onScrollStateChanged2 != null) {
                    onScrollStateChanged2.onScrollStateChanged(absListView2, i);
                }
            }

            @Override // android.widget.AbsListView.OnScrollListener
            public void onScroll(android.widget.AbsListView absListView2, int i, int i2, int i3) {
                androidx.databinding.adapters.AbsListViewBindingAdapter.OnScroll onScroll2 = onScroll;
                if (onScroll2 != null) {
                    onScroll2.onScroll(absListView2, i, i2, i3);
                }
            }
        });
    }
}
