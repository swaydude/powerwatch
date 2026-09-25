package powerwatch.matrix.com.pwgen2android.shared.ui.views;

/* JADX INFO: compiled from: LockableViewPager.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\tH\u0016J\u0010\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\u0010\u0010 \u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0010\u0010!\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0010\u0010\"\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u001fH\u0002R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R(\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006#"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/LockableViewPager;", "Landroidx/viewpager/widget/ViewPager;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "displayWidth", "", "pressedX", "", "pressedY", "swipeDetected", "Lkotlin/Function1;", "Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/SwipeDirection;", "", "getSwipeDetected", "()Lkotlin/jvm/functions/Function1;", "setSwipeDetected", "(Lkotlin/jvm/functions/Function1;)V", "swipeLocked", "", "getSwipeLocked", "()Z", "setSwipeLocked", "(Z)V", "canScrollHorizontally", "direction", "detectSwipe", androidx.core.app.NotificationCompat.CATEGORY_EVENT, "Landroid/view/MotionEvent;", "onInterceptTouchEvent", "onTouchEvent", "shouldDetectSwipe", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class LockableViewPager extends androidx.viewpager.widget.ViewPager {
    private final int displayWidth;
    private float pressedX;
    private float pressedY;
    private kotlin.jvm.functions.Function1<? super powerwatch.matrix.com.pwgen2android.shared.ui.views.SwipeDirection, kotlin.Unit> swipeDetected;
    private boolean swipeLocked;

    public void _$_clearFindViewByIdCache() {
    }

    public final kotlin.jvm.functions.Function1<powerwatch.matrix.com.pwgen2android.shared.ui.views.SwipeDirection, kotlin.Unit> getSwipeDetected() {
        return this.swipeDetected;
    }

    public final void setSwipeDetected(kotlin.jvm.functions.Function1<? super powerwatch.matrix.com.pwgen2android.shared.ui.views.SwipeDirection, kotlin.Unit> function1) {
        this.swipeDetected = function1;
    }

    public final boolean getSwipeLocked() {
        return this.swipeLocked;
    }

    public final void setSwipeLocked(boolean z) {
        this.swipeLocked = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LockableViewPager(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        android.content.Context context2 = getContext();
        java.util.Objects.requireNonNull(context2, "null cannot be cast to non-null type android.app.Activity");
        ((android.app.Activity) context2).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        this.displayWidth = displayMetrics.widthPixels;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LockableViewPager(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attrs, "attrs");
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        android.content.Context context2 = getContext();
        java.util.Objects.requireNonNull(context2, "null cannot be cast to non-null type android.app.Activity");
        ((android.app.Activity) context2).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        this.displayWidth = displayMetrics.widthPixels;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public boolean onTouchEvent(android.view.MotionEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "event");
        detectSwipe(event);
        return (!this.swipeLocked || event.getAction() == 0) && super.onTouchEvent(event);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "event");
        detectSwipe(event);
        return (!this.swipeLocked || event.getAction() == 0) && super.onInterceptTouchEvent(event);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public boolean canScrollHorizontally(int direction) {
        return !this.swipeLocked && super.canScrollHorizontally(direction);
    }

    private final void detectSwipe(android.view.MotionEvent event) {
        if (event.getAction() == 0) {
            this.pressedX = event.getX();
            this.pressedY = event.getY();
            return;
        }
        if (event.getAction() == 1 && shouldDetectSwipe(event)) {
            if (this.pressedX > event.getX()) {
                java.lang.System.out.println((java.lang.Object) "fragment_invoke");
                kotlin.jvm.functions.Function1<? super powerwatch.matrix.com.pwgen2android.shared.ui.views.SwipeDirection, kotlin.Unit> function1 = this.swipeDetected;
                if (function1 == null) {
                    return;
                }
                function1.invoke(powerwatch.matrix.com.pwgen2android.shared.ui.views.SwipeDirection.SwipeLeft.INSTANCE);
                return;
            }
            if (this.pressedX < event.getX()) {
                java.lang.System.out.println((java.lang.Object) "fragment_invoke");
                kotlin.jvm.functions.Function1<? super powerwatch.matrix.com.pwgen2android.shared.ui.views.SwipeDirection, kotlin.Unit> function2 = this.swipeDetected;
                if (function2 == null) {
                    return;
                }
                function2.invoke(powerwatch.matrix.com.pwgen2android.shared.ui.views.SwipeDirection.SwipeRight.INSTANCE);
            }
        }
    }

    private final boolean shouldDetectSwipe(android.view.MotionEvent event) {
        float fAbs = java.lang.Math.abs(event.getX() - this.pressedX);
        float fAbs2 = java.lang.Math.abs(event.getY() - this.pressedY);
        java.lang.System.out.println((java.lang.Object) ("swipe_details: deltaX - " + fAbs + ", deltaY - " + fAbs2));
        double d = (double) fAbs;
        return d > ((double) getWidth()) * 0.15d && d > ((double) fAbs2) * 1.7d;
    }
}
