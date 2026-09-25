package powerwatch.matrix.com.pwgen2android.pair.camera;

/* JADX INFO: compiled from: OverlayView.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\u0011\u001a\u00020\u0012H\u0002J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0015H\u0014J\b\u0010\u0016\u001a\u00020\u0017H\u0016J0\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\tH\u0014J\u0018\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\t2\u0006\u0010 \u001a\u00020\tH\u0014J\u000e\u0010!\u001a\u00020\u00172\u0006\u0010\"\u001a\u00020\u0010R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/pair/camera/OverlayView;", "Landroid/widget/RelativeLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "bitmap", "Landroid/graphics/Bitmap;", "radius", "", "rect", "Landroid/graphics/Rect;", "createWindowFrame", "", "dispatchDraw", "canvas", "Landroid/graphics/Canvas;", "isInEditMode", "", "onLayout", "changed", "l", "t", "r", "b", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "shouldDecode", "resultRect", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class OverlayView extends android.widget.RelativeLayout {
    private android.graphics.Bitmap bitmap;
    private float radius;
    private android.graphics.Rect rect;

    public void _$_clearFindViewByIdCache() {
    }

    @Override // android.view.View
    public boolean isInEditMode() {
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OverlayView(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OverlayView(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attrs, "attrs");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OverlayView(android.content.Context context, android.util.AttributeSet attrs, int i) {
        super(context, attrs, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attrs, "attrs");
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(android.graphics.Canvas canvas) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.dispatchDraw(canvas);
        if (this.bitmap == null) {
            createWindowFrame();
        }
        android.graphics.Bitmap bitmap = this.bitmap;
        kotlin.jvm.internal.Intrinsics.checkNotNull(bitmap);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (android.graphics.Paint) null);
    }

    public final boolean shouldDecode(android.graphics.Rect resultRect) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resultRect, "resultRect");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("My: ");
        android.graphics.Rect rect = this.rect;
        sb.append((java.lang.Object) (rect == null ? null : rect.toShortString()));
        sb.append(", compare: ");
        sb.append((java.lang.Object) resultRect.toShortString());
        android.util.Log.d("rect_issue", sb.toString());
        android.graphics.Rect rect2 = this.rect;
        if (rect2 != null) {
            java.lang.Boolean boolValueOf = rect2 != null ? java.lang.Boolean.valueOf(rect2.contains(resultRect)) : null;
            kotlin.jvm.internal.Intrinsics.checkNotNull(boolValueOf);
            if (boolValueOf.booleanValue()) {
                return true;
            }
        }
        return false;
    }

    private final void createWindowFrame() {
        this.bitmap = android.graphics.Bitmap.createBitmap(getWidth(), getHeight(), android.graphics.Bitmap.Config.ARGB_8888);
        android.graphics.Bitmap bitmap = this.bitmap;
        kotlin.jvm.internal.Intrinsics.checkNotNull(bitmap);
        android.graphics.Canvas canvas = new android.graphics.Canvas(bitmap);
        android.graphics.RectF rectF = new android.graphics.RectF(0.0f, 0.0f, getWidth(), getHeight());
        android.graphics.Paint paint = new android.graphics.Paint(1);
        paint.setColor(android.graphics.Color.parseColor("#000000"));
        paint.setAlpha(40);
        canvas.drawRect(rectF, paint);
        paint.setColor(0);
        paint.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.SRC_OUT));
        float width = getWidth() / 2;
        float height = getHeight() / 2;
        float f = this.radius;
        canvas.drawCircle(width, height, f, paint);
        android.graphics.Rect rect = new android.graphics.Rect((int) (width - f), (int) (height - f), (int) (width + f), (int) (height + f));
        this.rect = rect;
        android.util.Log.d("rect_issue", kotlin.jvm.internal.Intrinsics.stringPlus("Drawing: ", rect == null ? null : rect.toShortString()));
        android.graphics.Paint paint2 = new android.graphics.Paint();
        paint2.setStrokeWidth(10.0f);
        paint2.setColor(-7829368);
        paint2.setStyle(android.graphics.Paint.Style.STROKE);
        paint2.setPathEffect(new android.graphics.DashPathEffect(new float[]{60.0f, 20.0f}, 1.0f));
        canvas.drawCircle(width, height, f, paint2);
        android.graphics.Bitmap bitmap2 = this.bitmap;
        kotlin.jvm.internal.Intrinsics.checkNotNull(bitmap2);
        canvas.drawBitmap(bitmap2, 0.0f, 0.0f, (android.graphics.Paint) null);
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        this.radius = getMeasuredWidth() / 4.0f;
        setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
        super.onLayout(changed, l, t, r, b);
        this.bitmap = null;
    }
}
