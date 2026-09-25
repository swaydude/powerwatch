package powerwatch.matrix.com.pwgen2android.shared.ui.carouserView;

/* JADX INFO: compiled from: CarouselLinearLayout.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0014J\u000e\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/ui/carouserView/CarouselLinearLayout;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "(Landroid/content/Context;)V", "scale", "", "onDraw", "", "canvas", "Landroid/graphics/Canvas;", "setScaleBoth", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class CarouselLinearLayout extends android.widget.LinearLayout {
    private float scale;

    public void _$_clearFindViewByIdCache() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CarouselLinearLayout(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.scale = powerwatch.matrix.com.pwgen2android.shared.ui.carouserView.CarouselPagerAdapter.INSTANCE.getBIG_SCALE();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CarouselLinearLayout(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.scale = powerwatch.matrix.com.pwgen2android.shared.ui.carouserView.CarouselPagerAdapter.INSTANCE.getBIG_SCALE();
    }

    public final void setScaleBoth(float scale) {
        this.scale = scale;
        invalidate();
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onDraw(android.graphics.Canvas canvas) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        float f = this.scale;
        float f2 = 2;
        canvas.scale(f, f, width / f2, height / f2);
    }
}
