package androidx.recyclerview.widget;

/* JADX INFO: loaded from: classes.dex */
public class RecyclerViewAccessibilityDelegate extends androidx.core.view.AccessibilityDelegateCompat {
    final androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate.ItemDelegate mItemDelegate = new androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate.ItemDelegate(this);
    final androidx.recyclerview.widget.RecyclerView mRecyclerView;

    public RecyclerViewAccessibilityDelegate(androidx.recyclerview.widget.RecyclerView recyclerView) {
        this.mRecyclerView = recyclerView;
    }

    boolean shouldIgnore() {
        return this.mRecyclerView.hasPendingAdapterUpdates();
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public boolean performAccessibilityAction(android.view.View view, int i, android.os.Bundle bundle) {
        if (super.performAccessibilityAction(view, i, bundle)) {
            return true;
        }
        if (shouldIgnore() || this.mRecyclerView.getLayoutManager() == null) {
            return false;
        }
        return this.mRecyclerView.getLayoutManager().performAccessibilityAction(i, bundle);
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public void onInitializeAccessibilityNodeInfo(android.view.View view, androidx.core.view.accessibility.AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        if (shouldIgnore() || this.mRecyclerView.getLayoutManager() == null) {
            return;
        }
        this.mRecyclerView.getLayoutManager().onInitializeAccessibilityNodeInfo(accessibilityNodeInfoCompat);
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public void onInitializeAccessibilityEvent(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        if (!(view instanceof androidx.recyclerview.widget.RecyclerView) || shouldIgnore()) {
            return;
        }
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().onInitializeAccessibilityEvent(accessibilityEvent);
        }
    }

    public androidx.core.view.AccessibilityDelegateCompat getItemDelegate() {
        return this.mItemDelegate;
    }

    public static class ItemDelegate extends androidx.core.view.AccessibilityDelegateCompat {
        private java.util.Map<android.view.View, androidx.core.view.AccessibilityDelegateCompat> mOriginalItemDelegates = new java.util.WeakHashMap();
        final androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate mRecyclerViewDelegate;

        public ItemDelegate(androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate recyclerViewAccessibilityDelegate) {
            this.mRecyclerViewDelegate = recyclerViewAccessibilityDelegate;
        }

        void saveOriginalDelegate(android.view.View view) {
            androidx.core.view.AccessibilityDelegateCompat accessibilityDelegate = androidx.core.view.ViewCompat.getAccessibilityDelegate(view);
            if (accessibilityDelegate == null || accessibilityDelegate == this) {
                return;
            }
            this.mOriginalItemDelegates.put(view, accessibilityDelegate);
        }

        androidx.core.view.AccessibilityDelegateCompat getAndRemoveOriginalDelegateForItem(android.view.View view) {
            return this.mOriginalItemDelegates.remove(view);
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityNodeInfo(android.view.View view, androidx.core.view.accessibility.AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            if (this.mRecyclerViewDelegate.shouldIgnore() || this.mRecyclerViewDelegate.mRecyclerView.getLayoutManager() == null) {
                return;
            }
            this.mRecyclerViewDelegate.mRecyclerView.getLayoutManager().onInitializeAccessibilityNodeInfoForItem(view, accessibilityNodeInfoCompat);
            androidx.core.view.AccessibilityDelegateCompat accessibilityDelegateCompat = this.mOriginalItemDelegates.get(view);
            if (accessibilityDelegateCompat != null) {
                accessibilityDelegateCompat.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            }
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public boolean performAccessibilityAction(android.view.View view, int i, android.os.Bundle bundle) {
            if (super.performAccessibilityAction(view, i, bundle)) {
                return true;
            }
            if (this.mRecyclerViewDelegate.shouldIgnore() || this.mRecyclerViewDelegate.mRecyclerView.getLayoutManager() == null) {
                return false;
            }
            androidx.core.view.AccessibilityDelegateCompat accessibilityDelegateCompat = this.mOriginalItemDelegates.get(view);
            if (accessibilityDelegateCompat == null || !accessibilityDelegateCompat.performAccessibilityAction(view, i, bundle)) {
                return this.mRecyclerViewDelegate.mRecyclerView.getLayoutManager().performAccessibilityActionForItem(view, i, bundle);
            }
            return true;
        }
    }
}
