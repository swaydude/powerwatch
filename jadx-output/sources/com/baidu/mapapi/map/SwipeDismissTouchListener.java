package com.baidu.mapapi.map;

/* JADX INFO: loaded from: classes.dex */
public class SwipeDismissTouchListener implements android.view.View.OnTouchListener {
    private int a;
    private int b;
    private int c;
    private long d;
    private android.view.View e;
    private com.baidu.mapapi.map.SwipeDismissTouchListener.DismissCallbacks f;
    private int g = 1;
    private float h;
    private float i;
    private boolean j;
    private int k;
    private java.lang.Object l;
    private android.view.VelocityTracker m;
    private float n;
    private boolean o;
    private boolean p;

    public interface DismissCallbacks {
        boolean canDismiss(java.lang.Object obj);

        void onDismiss(android.view.View view, java.lang.Object obj);

        void onNotify();
    }

    public SwipeDismissTouchListener(android.view.View view, java.lang.Object obj, com.baidu.mapapi.map.SwipeDismissTouchListener.DismissCallbacks dismissCallbacks) {
        android.view.ViewConfiguration viewConfiguration = android.view.ViewConfiguration.get(view.getContext());
        this.a = viewConfiguration.getScaledTouchSlop();
        this.b = viewConfiguration.getScaledMinimumFlingVelocity();
        this.c = viewConfiguration.getScaledMaximumFlingVelocity();
        this.d = view.getContext().getResources().getInteger(android.R.integer.config_shortAnimTime);
        this.e = view;
        view.getContext();
        this.l = obj;
        this.f = dismissCallbacks;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        android.view.ViewGroup.LayoutParams layoutParams = this.e.getLayoutParams();
        int height = this.e.getHeight();
        android.animation.ValueAnimator duration = android.animation.ValueAnimator.ofInt(height, 1).setDuration(this.d);
        duration.addListener(new com.baidu.mapapi.map.r(this, layoutParams, height));
        duration.addUpdateListener(new com.baidu.mapapi.map.s(this, layoutParams));
        duration.start();
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0027, code lost:
    
        if (r10.m == null) goto L88;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouch(android.view.View r11, android.view.MotionEvent r12) {
        /*
            Method dump skipped, instruction units count: 434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baidu.mapapi.map.SwipeDismissTouchListener.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
