package powerwatch.matrix.com.pwgen2android.main.dashboard.realtime;

/* JADX INFO: compiled from: DashedCircleView.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u00108\u001a\u00020\f2\u0006\u00109\u001a\u00020\tH\u0002J\u0010\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020=H\u0002J\u0010\u0010>\u001a\u00020;2\u0006\u0010<\u001a\u00020=H\u0002J\u0010\u0010?\u001a\u00020\u000e2\u0006\u0010@\u001a\u00020\fH\u0002J\b\u0010A\u001a\u00020;H\u0002J\u0012\u0010A\u001a\u00020;2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0002J\u0010\u0010B\u001a\u00020;2\u0006\u0010<\u001a\u00020=H\u0014J\u0018\u0010C\u001a\u00020;2\u0006\u0010D\u001a\u00020\f2\u0006\u0010E\u001a\u00020\fH\u0014J(\u0010F\u001a\u00020;2\u0006\u0010G\u001a\u00020\f2\u0006\u0010H\u001a\u00020\f2\u0006\u0010I\u001a\u00020\f2\u0006\u0010J\u001a\u00020\fH\u0014J\u0014\u0010K\u001a\u00020;2\f\u0010L\u001a\b\u0012\u0004\u0012\u00020\f0MJ\u000e\u0010N\u001a\u00020;2\u0006\u0010O\u001a\u00020.J \u0010P\u001a\u00020;2\u0018\u0010L\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020.0Q0MJ\u001a\u0010R\u001a\u00020;2\u0012\u0010O\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020.0QJ\u001a\u0010S\u001a\u00020;2\u0012\u0010T\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020.0QJ\u0018\u0010U\u001a\u00020;2\u0006\u0010V\u001a\u00020.2\u0006\u0010W\u001a\u00020.H\u0002J\b\u0010X\u001a\u00020;H\u0002R\u000e\u0010\b\u001a\u00020\tX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\fX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u000eX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010!\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0013\"\u0004\b#\u0010\u0015R\u001a\u0010$\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0013\"\u0004\b&\u0010\u0015R\u001a\u0010'\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0013\"\u0004\b)\u0010\u0015R\u0010\u0010*\u001a\u0004\u0018\u00010+X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010-\u001a\u00020.X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u000e\u00103\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00105\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00106\u001a\u00020\u000eX\u0082.¢\u0006\u0002\n\u0000R\u000e\u00107\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006Y"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/DashedCircleView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attributeSet", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "ANGLE_END_PROGRESS_BACKGROUND", "", "DEFAULT_PROGRESS_START_ANGLE", "backgroundDashedColor", "", "backgroundPaint", "Landroid/graphics/Paint;", "circleBounds", "Landroid/graphics/RectF;", "circleLength", "getCircleLength", "()F", "setCircleLength", "(F)V", "count", "getCount", "()I", "dashPathEffect", "Landroid/graphics/DashPathEffect;", "firstValue", "firstValueColor", "firstValueEndAngle", "firstValuePaint", "isAnimationEnabled", "", "maxValue", "getMaxValue", "setMaxValue", "offLength", "getOffLength", "setOffLength", "onLength", "getOnLength", "setOnLength", "progressAnimator", "Landroid/animation/ValueAnimator;", "radius", "ratio", "", "getRatio", "()D", "setRatio", "(D)V", "secondValue", "secondValueColor", "secondValueEndAngle", "secondValuePaint", "strokeWidth", "dp2px", "dp", "drawProgress", "", "canvas", "Landroid/graphics/Canvas;", "drawProgressBackground", "getPaint", "color", "init", "onDraw", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "onSizeChanged", "w", powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtilsKt.hourUnit, "oldw", "oldh", "setCircleValue", "field", "Landroidx/databinding/ObservableField;", "setCurrentValue", "currentProgress", "setDoubleCircleValue", "Lkotlin/Pair;", "setDoubleCurrentValue", "setValue", "current", "startProgressAnimation", "oldCurrentProgress", "finalAngle", "stopProgressAnimation", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class DashedCircleView extends android.view.View {
    private final float ANGLE_END_PROGRESS_BACKGROUND;
    private final float DEFAULT_PROGRESS_START_ANGLE;
    private int backgroundDashedColor;
    private android.graphics.Paint backgroundPaint;
    private android.graphics.RectF circleBounds;
    private float circleLength;
    private final int count;
    private android.graphics.DashPathEffect dashPathEffect;
    private float firstValue;
    private int firstValueColor;
    private int firstValueEndAngle;
    private android.graphics.Paint firstValuePaint;
    private final boolean isAnimationEnabled;
    private float maxValue;
    private float offLength;
    private float onLength;
    private android.animation.ValueAnimator progressAnimator;
    private float radius;
    private double ratio;
    private float secondValue;
    private int secondValueColor;
    private int secondValueEndAngle;
    private android.graphics.Paint secondValuePaint;
    private int strokeWidth;

    public void _$_clearFindViewByIdCache() {
    }

    public final float getMaxValue() {
        return this.maxValue;
    }

    public final void setMaxValue(float f) {
        this.maxValue = f;
    }

    public final float getCircleLength() {
        return this.circleLength;
    }

    public final void setCircleLength(float f) {
        this.circleLength = f;
    }

    public final float getOnLength() {
        return this.onLength;
    }

    public final void setOnLength(float f) {
        this.onLength = f;
    }

    public final float getOffLength() {
        return this.offLength;
    }

    public final void setOffLength(float f) {
        this.offLength = f;
    }

    public final double getRatio() {
        return this.ratio;
    }

    public final void setRatio(double d) {
        this.ratio = d;
    }

    public final int getCount() {
        return this.count;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DashedCircleView(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.DEFAULT_PROGRESS_START_ANGLE = 270.0f;
        this.ANGLE_END_PROGRESS_BACKGROUND = 359.0f;
        this.dashPathEffect = new android.graphics.DashPathEffect(new float[]{0.0f, 0.0f}, 0.0f);
        this.circleLength = 100.0f;
        this.onLength = 50.0f;
        this.offLength = 20.0f;
        this.ratio = 9.3d;
        this.count = 20;
        this.circleBounds = new android.graphics.RectF();
        this.maxValue = 100.0f;
        this.firstValueEndAngle = 0;
        this.secondValueEndAngle = 0;
        this.firstValue = 0.0f;
        this.secondValue = 0.0f;
        this.isAnimationEnabled = false;
        this.strokeWidth = dp2px(8.0f);
        this.backgroundDashedColor = android.graphics.Color.parseColor("#222222");
        this.firstValueColor = android.graphics.Color.parseColor("#FFFFFF");
        this.secondValueColor = android.graphics.Color.parseColor("#33FF44");
        init();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DashedCircleView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attributeSet, "attributeSet");
        this.DEFAULT_PROGRESS_START_ANGLE = 270.0f;
        this.ANGLE_END_PROGRESS_BACKGROUND = 359.0f;
        this.dashPathEffect = new android.graphics.DashPathEffect(new float[]{0.0f, 0.0f}, 0.0f);
        this.circleLength = 100.0f;
        this.onLength = 50.0f;
        this.offLength = 20.0f;
        this.ratio = 9.3d;
        this.count = 20;
        this.circleBounds = new android.graphics.RectF();
        this.maxValue = 100.0f;
        this.firstValueEndAngle = 0;
        this.secondValueEndAngle = 0;
        this.firstValue = 0.0f;
        this.secondValue = 0.0f;
        this.isAnimationEnabled = false;
        this.strokeWidth = dp2px(8.0f);
        this.backgroundDashedColor = android.graphics.Color.parseColor("#222222");
        this.firstValueColor = android.graphics.Color.parseColor("#FFFFFF");
        this.secondValueColor = android.graphics.Color.parseColor("#33FF44");
        init(attributeSet);
        init();
    }

    private final void init(android.util.AttributeSet attributeSet) {
        if (attributeSet != null) {
            android.content.res.TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, powerwatch.matrix.com.pwgen2android.R.styleable.DashedCircleView);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "context.obtainStyledAttributes(attributeSet, R.styleable.DashedCircleView)");
            this.backgroundDashedColor = typedArrayObtainStyledAttributes.getColor(0, this.backgroundDashedColor);
            this.firstValueColor = typedArrayObtainStyledAttributes.getColor(3, this.firstValueColor);
            this.secondValueColor = typedArrayObtainStyledAttributes.getColor(4, this.secondValueColor);
            this.strokeWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, this.strokeWidth);
            this.firstValue = typedArrayObtainStyledAttributes.getInteger(1, (int) this.firstValue);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    private final void init() {
        this.firstValuePaint = getPaint(this.firstValueColor);
        this.secondValuePaint = getPaint(this.secondValueColor);
        this.backgroundPaint = getPaint(this.backgroundDashedColor);
        setCurrentValue(0.0d);
    }

    private final android.graphics.Paint getPaint(int color) {
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setAntiAlias(true);
        paint.setStrokeWidth(this.strokeWidth);
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        paint.setColor(color);
        return paint;
    }

    @Override // android.view.View
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        float f = w;
        this.radius = f / 2.0f;
        android.graphics.Paint paint = this.backgroundPaint;
        if (paint == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("backgroundPaint");
            throw null;
        }
        float strokeWidth = paint.getStrokeWidth() / 2.0f;
        this.circleBounds.left = strokeWidth;
        this.circleBounds.top = strokeWidth;
        this.circleBounds.right = f - strokeWidth;
        this.circleBounds.bottom = h - strokeWidth;
        this.radius = this.circleBounds.width() / 2.0f;
    }

    @Override // android.view.View
    protected void onDraw(android.graphics.Canvas canvas) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(canvas, "canvas");
        drawProgressBackground(canvas);
        drawProgress(canvas);
    }

    public final void setDoubleCircleValue(androidx.databinding.ObservableField<kotlin.Pair<java.lang.Double, java.lang.Double>> field) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(field, "field");
        kotlin.Pair<java.lang.Double, java.lang.Double> pair = field.get();
        if (pair == null) {
            pair = new kotlin.Pair<>(java.lang.Double.valueOf(0.0d), java.lang.Double.valueOf(0.0d));
        }
        setDoubleCurrentValue(pair);
    }

    public final void setCircleValue(androidx.databinding.ObservableField<java.lang.Integer> field) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(field, "field");
        java.lang.Integer num = field.get();
        setCurrentValue(num == null ? 0.0d : num.intValue());
    }

    public final void setCurrentValue(double currentProgress) {
        setDoubleCurrentValue(new kotlin.Pair<>(java.lang.Double.valueOf(currentProgress), java.lang.Double.valueOf(0.0d)));
    }

    public final void setDoubleCurrentValue(kotlin.Pair<java.lang.Double, java.lang.Double> currentProgress) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currentProgress, "currentProgress");
        setValue(currentProgress);
    }

    public final void setValue(kotlin.Pair<java.lang.Double, java.lang.Double> current) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(current, "current");
        double dDoubleValue = current.getFirst().doubleValue();
        double dDoubleValue2 = current.getFirst().doubleValue() + current.getSecond().doubleValue();
        float f = this.maxValue;
        if (dDoubleValue2 > f) {
            double d = ((double) f) / dDoubleValue2;
            dDoubleValue *= d;
            dDoubleValue2 *= d;
        }
        double d2 = 360;
        double d3 = (dDoubleValue / ((double) f)) * d2;
        double d4 = (dDoubleValue2 / ((double) f)) * d2;
        if (d3 >= 360.0d) {
            d3 = this.ANGLE_END_PROGRESS_BACKGROUND;
        }
        if (d4 >= 360.0d) {
            d4 = this.ANGLE_END_PROGRESS_BACKGROUND;
        }
        double d5 = d4 - d3;
        double d6 = this.firstValue;
        this.firstValue = (float) java.lang.Math.min(current.getFirst().doubleValue(), this.maxValue);
        this.secondValue = (float) java.lang.Math.min(current.getSecond().doubleValue(), this.maxValue);
        stopProgressAnimation();
        if (this.isAnimationEnabled) {
            startProgressAnimation(d6, d3);
            return;
        }
        this.firstValueEndAngle = (int) d3;
        this.secondValueEndAngle = (int) d5;
        invalidate();
    }

    private final void startProgressAnimation(double oldCurrentProgress, double finalAngle) {
        android.animation.PropertyValuesHolder propertyValuesHolderOfInt = android.animation.PropertyValuesHolder.ofInt("angle", this.firstValueEndAngle, (int) finalAngle);
        android.animation.ValueAnimator valueAnimatorOfObject = android.animation.ValueAnimator.ofObject(new android.animation.TypeEvaluator() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.-$$Lambda$DashedCircleView$dw-amE92ejJJDjVqbZ2tNJKenYg
            @Override // android.animation.TypeEvaluator
            public final java.lang.Object evaluate(float f, java.lang.Object obj, java.lang.Object obj2) {
                return powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.DashedCircleView.m1838startProgressAnimation$lambda0(f, (java.lang.Double) obj, (java.lang.Double) obj2);
            }
        }, java.lang.Double.valueOf(oldCurrentProgress), java.lang.Float.valueOf(this.firstValue));
        this.progressAnimator = valueAnimatorOfObject;
        if (valueAnimatorOfObject != null) {
            valueAnimatorOfObject.setDuration(1000L);
        }
        android.animation.ValueAnimator valueAnimator = this.progressAnimator;
        if (valueAnimator != null) {
            valueAnimator.setValues(propertyValuesHolderOfInt);
        }
        android.animation.ValueAnimator valueAnimator2 = this.progressAnimator;
        if (valueAnimator2 != null) {
            valueAnimator2.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
        }
        android.animation.ValueAnimator valueAnimator3 = this.progressAnimator;
        if (valueAnimator3 != null) {
            valueAnimator3.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.-$$Lambda$DashedCircleView$O9os_knupfpYtBHkQukNxVn3Q0w
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator4) {
                    powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.DashedCircleView.m1839startProgressAnimation$lambda1(this.f$0, valueAnimator4);
                }
            });
        }
        android.animation.ValueAnimator valueAnimator4 = this.progressAnimator;
        if (valueAnimator4 == null) {
            return;
        }
        valueAnimator4.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: startProgressAnimation$lambda-0, reason: not valid java name */
    public static final java.lang.Double m1838startProgressAnimation$lambda0(float f, java.lang.Double d, java.lang.Double d2) {
        kotlin.jvm.internal.Intrinsics.checkNotNull(d);
        double dDoubleValue = d.doubleValue();
        kotlin.jvm.internal.Intrinsics.checkNotNull(d2);
        return java.lang.Double.valueOf(dDoubleValue + ((d2.doubleValue() - d.doubleValue()) * ((double) f)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: startProgressAnimation$lambda-1, reason: not valid java name */
    public static final void m1839startProgressAnimation$lambda1(powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.DashedCircleView this$0, android.animation.ValueAnimator valueAnimator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        java.lang.Object animatedValue = valueAnimator.getAnimatedValue("angle");
        java.util.Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        this$0.firstValueEndAngle = ((java.lang.Integer) animatedValue).intValue();
        this$0.invalidate();
    }

    private final void stopProgressAnimation() {
        android.animation.ValueAnimator valueAnimator = this.progressAnimator;
        if (valueAnimator == null || valueAnimator == null) {
            return;
        }
        valueAnimator.cancel();
    }

    private final void drawProgressBackground(android.graphics.Canvas canvas) {
        android.graphics.RectF rectF = this.circleBounds;
        float f = this.DEFAULT_PROGRESS_START_ANGLE;
        float f2 = this.ANGLE_END_PROGRESS_BACKGROUND;
        android.graphics.Paint paint = this.backgroundPaint;
        if (paint != null) {
            canvas.drawArc(rectF, f, f2, false, paint);
        } else {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("backgroundPaint");
            throw null;
        }
    }

    private final void drawProgress(android.graphics.Canvas canvas) {
        android.graphics.RectF rectF = this.circleBounds;
        float f = this.DEFAULT_PROGRESS_START_ANGLE;
        float f2 = this.firstValueEndAngle;
        android.graphics.Paint paint = this.firstValuePaint;
        if (paint == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("firstValuePaint");
            throw null;
        }
        canvas.drawArc(rectF, f, f2, false, paint);
        android.graphics.RectF rectF2 = this.circleBounds;
        float f3 = this.DEFAULT_PROGRESS_START_ANGLE + this.firstValueEndAngle;
        float f4 = this.secondValueEndAngle;
        android.graphics.Paint paint2 = this.secondValuePaint;
        if (paint2 != null) {
            canvas.drawArc(rectF2, f3, f4, false, paint2);
        } else {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("secondValuePaint");
            throw null;
        }
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        getPaddingTop();
        getPaddingBottom();
        int size = android.view.View.MeasureSpec.getSize(widthMeasureSpec);
        android.view.View.MeasureSpec.getSize(heightMeasureSpec);
        int i = (size - paddingLeft) - paddingRight;
        float f = i;
        android.graphics.Paint paint = this.backgroundPaint;
        if (paint == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("backgroundPaint");
            throw null;
        }
        float strokeWidth = (float) (((double) (f - paint.getStrokeWidth())) * 3.141592653589793d);
        this.circleLength = strokeWidth;
        float f2 = strokeWidth / this.count;
        double d = this.ratio;
        float f3 = f2 / ((float) (((double) 1) + d));
        this.offLength = f3;
        float f4 = (float) (d * ((double) f3));
        this.onLength = f4;
        this.onLength = f4 - (f3 / 2);
        android.graphics.DashPathEffect dashPathEffect = new android.graphics.DashPathEffect(new float[]{this.onLength, this.offLength}, 0.0f);
        this.dashPathEffect = dashPathEffect;
        android.graphics.Paint paint2 = this.backgroundPaint;
        if (paint2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("backgroundPaint");
            throw null;
        }
        paint2.setPathEffect(dashPathEffect);
        android.graphics.Paint paint3 = this.firstValuePaint;
        if (paint3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("firstValuePaint");
            throw null;
        }
        paint3.setPathEffect(this.dashPathEffect);
        android.graphics.Paint paint4 = this.secondValuePaint;
        if (paint4 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("secondValuePaint");
            throw null;
        }
        paint4.setPathEffect(this.dashPathEffect);
        setMeasuredDimension(i, i);
    }

    private final int dp2px(float dp) {
        return (int) android.util.TypedValue.applyDimension(1, dp, getResources().getDisplayMetrics());
    }
}
