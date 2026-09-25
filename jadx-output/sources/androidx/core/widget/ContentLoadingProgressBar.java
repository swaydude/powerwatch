package androidx.core.widget;

/* JADX INFO: loaded from: classes.dex */
public class ContentLoadingProgressBar extends android.widget.ProgressBar {
    private static final int MIN_DELAY = 500;
    private static final int MIN_SHOW_TIME = 500;
    private final java.lang.Runnable mDelayedHide;
    private final java.lang.Runnable mDelayedShow;
    boolean mDismissed;
    boolean mPostedHide;
    boolean mPostedShow;
    long mStartTime;

    public ContentLoadingProgressBar(android.content.Context context) {
        this(context, null);
    }

    public ContentLoadingProgressBar(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.mStartTime = -1L;
        this.mPostedHide = false;
        this.mPostedShow = false;
        this.mDismissed = false;
        this.mDelayedHide = new java.lang.Runnable() { // from class: androidx.core.widget.ContentLoadingProgressBar.1
            @Override // java.lang.Runnable
            public void run() {
                androidx.core.widget.ContentLoadingProgressBar.this.mPostedHide = false;
                androidx.core.widget.ContentLoadingProgressBar.this.mStartTime = -1L;
                androidx.core.widget.ContentLoadingProgressBar.this.setVisibility(8);
            }
        };
        this.mDelayedShow = new java.lang.Runnable() { // from class: androidx.core.widget.ContentLoadingProgressBar.2
            @Override // java.lang.Runnable
            public void run() {
                androidx.core.widget.ContentLoadingProgressBar.this.mPostedShow = false;
                if (androidx.core.widget.ContentLoadingProgressBar.this.mDismissed) {
                    return;
                }
                androidx.core.widget.ContentLoadingProgressBar.this.mStartTime = java.lang.System.currentTimeMillis();
                androidx.core.widget.ContentLoadingProgressBar.this.setVisibility(0);
            }
        };
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        removeCallbacks();
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks();
    }

    private void removeCallbacks() {
        removeCallbacks(this.mDelayedHide);
        removeCallbacks(this.mDelayedShow);
    }

    public synchronized void hide() {
        this.mDismissed = true;
        removeCallbacks(this.mDelayedShow);
        this.mPostedShow = false;
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        long j = this.mStartTime;
        long j2 = jCurrentTimeMillis - j;
        if (j2 >= 500 || j == -1) {
            setVisibility(8);
        } else if (!this.mPostedHide) {
            postDelayed(this.mDelayedHide, 500 - j2);
            this.mPostedHide = true;
        }
    }

    public synchronized void show() {
        this.mStartTime = -1L;
        this.mDismissed = false;
        removeCallbacks(this.mDelayedHide);
        this.mPostedHide = false;
        if (!this.mPostedShow) {
            postDelayed(this.mDelayedShow, 500L);
            this.mPostedShow = true;
        }
    }
}
