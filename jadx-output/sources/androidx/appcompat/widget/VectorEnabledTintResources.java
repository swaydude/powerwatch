package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
public class VectorEnabledTintResources extends android.content.res.Resources {
    public static final int MAX_SDK_WHERE_REQUIRED = 20;
    private static boolean sCompatVectorFromResourcesEnabled = false;
    private final java.lang.ref.WeakReference<android.content.Context> mContextRef;

    public static boolean shouldBeUsed() {
        return isCompatVectorFromResourcesEnabled() && android.os.Build.VERSION.SDK_INT <= 20;
    }

    public VectorEnabledTintResources(android.content.Context context, android.content.res.Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.mContextRef = new java.lang.ref.WeakReference<>(context);
    }

    @Override // android.content.res.Resources
    public android.graphics.drawable.Drawable getDrawable(int i) throws android.content.res.Resources.NotFoundException {
        android.content.Context context = this.mContextRef.get();
        if (context != null) {
            return androidx.appcompat.widget.ResourceManagerInternal.get().onDrawableLoadedFromResources(context, this, i);
        }
        return super.getDrawable(i);
    }

    final android.graphics.drawable.Drawable superGetDrawable(int i) {
        return super.getDrawable(i);
    }

    public static void setCompatVectorFromResourcesEnabled(boolean z) {
        sCompatVectorFromResourcesEnabled = z;
    }

    public static boolean isCompatVectorFromResourcesEnabled() {
        return sCompatVectorFromResourcesEnabled;
    }
}
