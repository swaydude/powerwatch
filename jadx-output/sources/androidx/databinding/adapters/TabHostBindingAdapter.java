package androidx.databinding.adapters;

/* JADX INFO: loaded from: classes.dex */
public class TabHostBindingAdapter {
    public static int getCurrentTab(android.widget.TabHost tabHost) {
        return tabHost.getCurrentTab();
    }

    public static java.lang.String getCurrentTabTag(android.widget.TabHost tabHost) {
        return tabHost.getCurrentTabTag();
    }

    public static void setCurrentTab(android.widget.TabHost tabHost, int i) {
        if (tabHost.getCurrentTab() != i) {
            tabHost.setCurrentTab(i);
        }
    }

    public static void setCurrentTabTag(android.widget.TabHost tabHost, java.lang.String str) {
        java.lang.String currentTabTag = tabHost.getCurrentTabTag();
        if ((currentTabTag == null || currentTabTag.equals(str)) && (currentTabTag != null || str == null)) {
            return;
        }
        tabHost.setCurrentTabByTag(str);
    }

    public static void setListeners(android.widget.TabHost tabHost, final android.widget.TabHost.OnTabChangeListener onTabChangeListener, final androidx.databinding.InverseBindingListener inverseBindingListener) {
        if (inverseBindingListener == null) {
            tabHost.setOnTabChangedListener(onTabChangeListener);
        } else {
            tabHost.setOnTabChangedListener(new android.widget.TabHost.OnTabChangeListener() { // from class: androidx.databinding.adapters.TabHostBindingAdapter.1
                @Override // android.widget.TabHost.OnTabChangeListener
                public void onTabChanged(java.lang.String str) {
                    android.widget.TabHost.OnTabChangeListener onTabChangeListener2 = onTabChangeListener;
                    if (onTabChangeListener2 != null) {
                        onTabChangeListener2.onTabChanged(str);
                    }
                    inverseBindingListener.onChange();
                }
            });
        }
    }
}
