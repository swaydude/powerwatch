package androidx.databinding;

/* JADX INFO: loaded from: classes.dex */
public class DataBindingUtil {
    private static androidx.databinding.DataBinderMapper sMapper = new androidx.databinding.DataBinderMapperImpl();
    private static androidx.databinding.DataBindingComponent sDefaultComponent = null;

    private DataBindingUtil() {
    }

    public static void setDefaultComponent(androidx.databinding.DataBindingComponent dataBindingComponent) {
        sDefaultComponent = dataBindingComponent;
    }

    public static androidx.databinding.DataBindingComponent getDefaultComponent() {
        return sDefaultComponent;
    }

    public static <T extends androidx.databinding.ViewDataBinding> T inflate(android.view.LayoutInflater layoutInflater, int i, android.view.ViewGroup viewGroup, boolean z) {
        return (T) inflate(layoutInflater, i, viewGroup, z, sDefaultComponent);
    }

    public static <T extends androidx.databinding.ViewDataBinding> T inflate(android.view.LayoutInflater layoutInflater, int i, android.view.ViewGroup viewGroup, boolean z, androidx.databinding.DataBindingComponent dataBindingComponent) {
        boolean z2 = viewGroup != null && z;
        int childCount = z2 ? viewGroup.getChildCount() : 0;
        android.view.View viewInflate = layoutInflater.inflate(i, viewGroup, z);
        if (z2) {
            return (T) bindToAddedViews(dataBindingComponent, viewGroup, childCount, i);
        }
        return (T) bind(dataBindingComponent, viewInflate, i);
    }

    public static <T extends androidx.databinding.ViewDataBinding> T bind(android.view.View view) {
        return (T) bind(view, sDefaultComponent);
    }

    public static <T extends androidx.databinding.ViewDataBinding> T bind(android.view.View view, androidx.databinding.DataBindingComponent dataBindingComponent) {
        T t = (T) getBinding(view);
        if (t != null) {
            return t;
        }
        java.lang.Object tag = view.getTag();
        if (!(tag instanceof java.lang.String)) {
            throw new java.lang.IllegalArgumentException("View is not a binding layout");
        }
        int layoutId = sMapper.getLayoutId((java.lang.String) tag);
        if (layoutId == 0) {
            throw new java.lang.IllegalArgumentException("View is not a binding layout. Tag: " + tag);
        }
        return (T) sMapper.getDataBinder(dataBindingComponent, view, layoutId);
    }

    static <T extends androidx.databinding.ViewDataBinding> T bind(androidx.databinding.DataBindingComponent dataBindingComponent, android.view.View[] viewArr, int i) {
        return (T) sMapper.getDataBinder(dataBindingComponent, viewArr, i);
    }

    static <T extends androidx.databinding.ViewDataBinding> T bind(androidx.databinding.DataBindingComponent dataBindingComponent, android.view.View view, int i) {
        return (T) sMapper.getDataBinder(dataBindingComponent, view, i);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0038  */
    public static <T extends androidx.databinding.ViewDataBinding> T findBinding(android.view.View view) {
        while (view != null) {
            T t = (T) androidx.databinding.ViewDataBinding.getBinding(view);
            if (t != null) {
                return t;
            }
            java.lang.Object tag = view.getTag();
            if (tag instanceof java.lang.String) {
                java.lang.String str = (java.lang.String) tag;
                if (str.startsWith("layout") && str.endsWith("_0")) {
                    char cCharAt = str.charAt(6);
                    int iIndexOf = str.indexOf(47, 7);
                    boolean z = true;
                    boolean z2 = false;
                    if (cCharAt == '/') {
                        if (iIndexOf != -1) {
                            z = false;
                        }
                        z2 = z;
                    } else if (cCharAt == '-' && iIndexOf != -1) {
                        if (str.indexOf(47, iIndexOf + 1) != -1) {
                            z = false;
                        }
                        z2 = z;
                    }
                    if (z2) {
                        return null;
                    }
                }
            }
            java.lang.Object parent = view.getParent();
            view = parent instanceof android.view.View ? (android.view.View) parent : null;
        }
        return null;
    }

    public static <T extends androidx.databinding.ViewDataBinding> T getBinding(android.view.View view) {
        return (T) androidx.databinding.ViewDataBinding.getBinding(view);
    }

    public static <T extends androidx.databinding.ViewDataBinding> T setContentView(android.app.Activity activity, int i) {
        return (T) setContentView(activity, i, sDefaultComponent);
    }

    public static <T extends androidx.databinding.ViewDataBinding> T setContentView(android.app.Activity activity, int i, androidx.databinding.DataBindingComponent dataBindingComponent) {
        activity.setContentView(i);
        return (T) bindToAddedViews(dataBindingComponent, (android.view.ViewGroup) activity.getWindow().getDecorView().findViewById(android.R.id.content), 0, i);
    }

    public static java.lang.String convertBrIdToString(int i) {
        return sMapper.convertBrIdToString(i);
    }

    private static <T extends androidx.databinding.ViewDataBinding> T bindToAddedViews(androidx.databinding.DataBindingComponent dataBindingComponent, android.view.ViewGroup viewGroup, int i, int i2) {
        int childCount = viewGroup.getChildCount();
        int i3 = childCount - i;
        if (i3 == 1) {
            return (T) bind(dataBindingComponent, viewGroup.getChildAt(childCount - 1), i2);
        }
        android.view.View[] viewArr = new android.view.View[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            viewArr[i4] = viewGroup.getChildAt(i4 + i);
        }
        return (T) bind(dataBindingComponent, viewArr, i2);
    }
}
