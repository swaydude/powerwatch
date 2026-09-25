package com.super_rabbit.wheel_picker;

/* JADX INFO: compiled from: WheelPicker.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 2}, d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b)\n\u0002\u0018\u0002\n\u0002\b\u001b\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u00106\u001a\u000207H\u0002J \u00108\u001a\u00020\u00072\u0006\u00109\u001a\u00020\u00072\u0006\u0010:\u001a\u00020\u00072\u0006\u0010;\u001a\u00020\u0007H\u0002J\u0010\u0010<\u001a\u0002072\u0006\u0010=\u001a\u00020\u0007H\u0002J\b\u0010>\u001a\u00020\u0007H\u0002J\b\u0010?\u001a\u000207H\u0016J\b\u0010@\u001a\u00020\u0007H\u0002J\b\u0010A\u001a\u000207H\u0002J\u0010\u0010B\u001a\u0002072\u0006\u0010C\u001a\u00020DH\u0002J\b\u0010E\u001a\u00020\u000eH\u0014J\u0006\u0010F\u001a\u00020)J\b\u0010G\u001a\u00020\u0007H\u0002J\b\u0010H\u001a\u00020\u0007H\u0002J\u0010\u0010I\u001a\u00020\u00072\u0006\u0010J\u001a\u00020)H\u0002J\b\u0010K\u001a\u00020\u0007H\u0014J\b\u0010L\u001a\u00020\u0007H\u0014J\b\u0010M\u001a\u00020\u000eH\u0014J\u0010\u0010N\u001a\u00020)2\u0006\u0010O\u001a\u00020\u0007H\u0002J\u0010\u0010P\u001a\u00020\u00072\u0006\u0010Q\u001a\u00020\u0007H\u0002J\u0010\u0010R\u001a\u0002072\u0006\u0010S\u001a\u00020\u0007H\u0002J\b\u0010T\u001a\u000207H\u0002J\b\u0010U\u001a\u000207H\u0002J\b\u0010V\u001a\u000207H\u0002J\b\u0010W\u001a\u000207H\u0002J\b\u0010X\u001a\u000207H\u0002J\u0018\u0010Y\u001a\u0002072\u0006\u0010Z\u001a\u00020\u00072\u0006\u0010[\u001a\u00020\u0007H\u0002J\u0010\u0010\\\u001a\u0002072\u0006\u0010C\u001a\u00020DH\u0014J0\u0010]\u001a\u0002072\u0006\u0010^\u001a\u00020\u00142\u0006\u0010_\u001a\u00020\u00072\u0006\u0010`\u001a\u00020\u00072\u0006\u0010a\u001a\u00020\u00072\u0006\u0010b\u001a\u00020\u0007H\u0014J\u0018\u0010c\u001a\u0002072\u0006\u0010d\u001a\u00020\u00072\u0006\u0010e\u001a\u00020\u0007H\u0014J(\u0010f\u001a\u0002072\u0006\u0010g\u001a\u00020\u00072\u0006\u0010h\u001a\u00020\u00072\u0006\u0010i\u001a\u00020\u00072\u0006\u0010j\u001a\u00020\u0007H\u0014J\u0018\u0010k\u001a\u0002072\u0006\u0010[\u001a\u00020\u00072\u0006\u0010Y\u001a\u00020\u0014H\u0002J\u0010\u0010l\u001a\u00020\u00142\u0006\u0010m\u001a\u00020nH\u0016J\u0010\u0010o\u001a\u0002072\u0006\u0010m\u001a\u00020nH\u0002J\b\u0010p\u001a\u000207H\u0002J\u0006\u0010q\u001a\u000207J\u0018\u0010r\u001a\u0002072\u0006\u0010s\u001a\u00020\u00072\u0006\u0010S\u001a\u00020\u0007H\u0016J\u000e\u0010t\u001a\u0002072\u0006\u0010O\u001a\u00020\u0007J\u000e\u0010u\u001a\u0002072\u0006\u0010J\u001a\u00020)J\u0010\u0010v\u001a\u0002072\b\u0010w\u001a\u0004\u0018\u00010\u0010J\u000e\u0010x\u001a\u0002072\u0006\u0010y\u001a\u00020\u0007J\u000e\u0010z\u001a\u0002072\u0006\u0010{\u001a\u00020\u0007J\u000e\u0010|\u001a\u0002072\u0006\u0010}\u001a\u00020\u001eJ\u000e\u0010~\u001a\u0002072\u0006\u0010\u007f\u001a\u00020\u0007J\u0010\u0010\u0080\u0001\u001a\u0002072\u0007\u0010\u0081\u0001\u001a\u00020\u0014J\u0010\u0010\u0082\u0001\u001a\u0002072\u0007\u0010\u0083\u0001\u001a\u00020\u0007J\u0010\u0010\u0084\u0001\u001a\u0002072\u0007\u0010\u0085\u0001\u001a\u00020\u0007J\u000f\u0010\u0086\u0001\u001a\u0002072\u0006\u0010O\u001a\u00020\u0007J\u000f\u0010\u0087\u0001\u001a\u0002072\u0006\u0010J\u001a\u00020)J\u0011\u0010\u0088\u0001\u001a\u00020\u00072\u0006\u0010O\u001a\u00020\u0007H\u0002R\u000e\u0010\t\u001a\u00020\u0007X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082D¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u0004\u0018\u00010 X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010$\u001a\u0012\u0012\u0004\u0012\u00020\u00070%j\b\u0012\u0004\u0012\u00020\u0007`&X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020)X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010,\u001a\u0004\u0018\u00010-X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00101\u001a\u0004\u0018\u000102X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00105\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0089\u0001"}, d2 = {"Lcom/super_rabbit/wheel_picker/WheelPicker;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "DEFAULT_ITEM_COUNT", "DEFAULT_TEXT_SIZE", "SELECTOR_MAX_FLING_VELOCITY_ADJUSTMENT", "SNAP_SCROLL_DURATION", "TOP_AND_BOTTOM_FADING_EDGE_STRENGTH", "", "mAdapter", "Lcom/super_rabbit/wheel_picker/WheelAdapter;", "mCurSelectedItemIndex", "mCurrentFirstItemOffset", "mFadingEdgeEnabled", "", "mInitialFirstItemOffset", "mIsDragging", "mItemHeight", "mLastY", "mMaxIndex", "mMaximumVelocity", "mMinIndex", "mMinimumVelocity", "mOnValueChangeListener", "Lcom/super_rabbit/wheel_picker/OnValueChangeListener;", "mOverScroller", "Landroid/widget/OverScroller;", "mPreviousScrollerY", "mSelectedTextColor", "mSelectorItemCount", "mSelectorItemIndices", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "mSelectorVisibleItemCount", "mTextAlign", "", "mTextGapHeight", "mTextHeight", "mTextPaint", "Landroid/graphics/Paint;", "mTextSize", "mTouchSlop", "mUnSelectedTextColor", "mVelocityTracker", "Landroid/view/VelocityTracker;", "mWheelMiddleItemIndex", "mWheelVisibleItemMiddleIndex", "mWrapSelectorWheelPreferred", "adjustItemVertical", "", "calculateSize", "suggestedSize", "paramSize", "measureSpec", "changeValueBySteps", "steps", "computeMaximumWidth", "computeScroll", "computeTextHeight", "decreaseSelectorsIndex", "drawVertical", "canvas", "Landroid/graphics/Canvas;", "getBottomFadingEdgeStrength", "getCurrentItem", "getGapHeight", "getItemHeight", "getPosition", "value", "getSuggestedMinimumHeight", "getSuggestedMinimumWidth", "getTopFadingEdgeStrength", "getValue", "position", "getWrappedSelectorIndex", "selectorIndex", "handlerClickVertical", "y", "increaseSelectorsIndex", "initializeFadingEdges", "initializeSelectorWheel", "initializeSelectorWheelIndices", "invalidateOnAnimation", "notifyChange", "previous", "current", "onDraw", "onLayout", "changed", "left", "top", "right", "bottom", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "onScrollChanged", "l", "t", "oldl", "oldt", "onSelectionChanged", "onTouchEvent", androidx.core.app.NotificationCompat.CATEGORY_EVENT, "Landroid/view/MotionEvent;", "onTouchEventVertical", "recyclerVelocityTracker", "reset", "scrollBy", "x", "scrollTo", "scrollToValue", "setAdapter", "adapter", "setMax", "max", "setMin", "min", "setOnValueChangeListener", "onValueChangeListener", "setSelectedTextColor", "colorId", "setSelectorRoundedWrapPreferred", "wrap", "setUnselectedTextColor", "resourceId", "setWheelItemCount", "count", "smoothScrollTo", "smoothScrollToValue", "validatePosition", "wheel_picker_release"}, k = 1, mv = {1, 1, 9})
public final class WheelPicker extends android.view.View {
    private final int DEFAULT_ITEM_COUNT;
    private final int DEFAULT_TEXT_SIZE;
    private final int SELECTOR_MAX_FLING_VELOCITY_ADJUSTMENT;
    private final int SNAP_SCROLL_DURATION;
    private final float TOP_AND_BOTTOM_FADING_EDGE_STRENGTH;
    private com.super_rabbit.wheel_picker.WheelAdapter mAdapter;
    private int mCurSelectedItemIndex;
    private int mCurrentFirstItemOffset;
    private boolean mFadingEdgeEnabled;
    private int mInitialFirstItemOffset;
    private boolean mIsDragging;
    private int mItemHeight;
    private float mLastY;
    private int mMaxIndex;
    private final int mMaximumVelocity;
    private int mMinIndex;
    private final int mMinimumVelocity;
    private com.super_rabbit.wheel_picker.OnValueChangeListener mOnValueChangeListener;
    private android.widget.OverScroller mOverScroller;
    private int mPreviousScrollerY;
    private int mSelectedTextColor;
    private int mSelectorItemCount;
    private java.util.ArrayList<java.lang.Integer> mSelectorItemIndices;
    private int mSelectorVisibleItemCount;
    private java.lang.String mTextAlign;
    private int mTextGapHeight;
    private int mTextHeight;
    private android.graphics.Paint mTextPaint;
    private int mTextSize;
    private final int mTouchSlop;
    private int mUnSelectedTextColor;
    private android.view.VelocityTracker mVelocityTracker;
    private int mWheelMiddleItemIndex;
    private int mWheelVisibleItemMiddleIndex;
    private boolean mWrapSelectorWheelPreferred;

    @kotlin.Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 9})
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[android.graphics.Paint.Align.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[android.graphics.Paint.Align.LEFT.ordinal()] = 1;
            iArr[android.graphics.Paint.Align.CENTER.ordinal()] = 2;
            iArr[android.graphics.Paint.Align.RIGHT.ordinal()] = 3;
        }
    }

    public WheelPicker(android.content.Context context) {
        this(context, null, 0, 6, null);
    }

    public WheelPicker(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ WheelPicker(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? (android.util.AttributeSet) null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WheelPicker(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(context, "context");
        this.TOP_AND_BOTTOM_FADING_EDGE_STRENGTH = 0.9f;
        this.SNAP_SCROLL_DURATION = 300;
        this.SELECTOR_MAX_FLING_VELOCITY_ADJUSTMENT = 4;
        this.DEFAULT_ITEM_COUNT = 3;
        this.DEFAULT_TEXT_SIZE = 80;
        this.mInitialFirstItemOffset = Integer.MIN_VALUE;
        this.mFadingEdgeEnabled = true;
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.super_rabbit.wheel_picker.R.styleable.WheelPicker, i, 0);
        int i2 = typedArrayObtainStyledAttributes.getInt(com.super_rabbit.wheel_picker.R.styleable.WheelPicker_wheelItemCount, 3) + 2;
        this.mSelectorItemCount = i2;
        this.mWheelMiddleItemIndex = (i2 - 1) / 2;
        int i3 = i2 - 2;
        this.mSelectorVisibleItemCount = i3;
        this.mWheelVisibleItemMiddleIndex = (i3 - 1) / 2;
        this.mSelectorItemIndices = new java.util.ArrayList<>(this.mSelectorItemCount);
        this.mMinIndex = typedArrayObtainStyledAttributes.getInt(com.super_rabbit.wheel_picker.R.styleable.WheelPicker_min, Integer.MIN_VALUE);
        this.mMaxIndex = typedArrayObtainStyledAttributes.getInt(com.super_rabbit.wheel_picker.R.styleable.WheelPicker_max, Integer.MAX_VALUE);
        this.mWrapSelectorWheelPreferred = typedArrayObtainStyledAttributes.getBoolean(com.super_rabbit.wheel_picker.R.styleable.WheelPicker_wrapSelectorWheel, false);
        this.mOverScroller = new android.widget.OverScroller(context, new android.view.animation.DecelerateInterpolator(2.5f));
        android.view.ViewConfiguration configuration = android.view.ViewConfiguration.get(context);
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(configuration, "configuration");
        this.mTouchSlop = configuration.getScaledTouchSlop();
        this.mMaximumVelocity = configuration.getScaledMaximumFlingVelocity() / 4;
        this.mMinimumVelocity = configuration.getScaledMinimumFlingVelocity();
        this.mSelectedTextColor = typedArrayObtainStyledAttributes.getColor(com.super_rabbit.wheel_picker.R.styleable.WheelPicker_selectedTextColor, androidx.core.content.ContextCompat.getColor(context, com.super_rabbit.wheel_picker.R.color.color_4_blue));
        this.mUnSelectedTextColor = typedArrayObtainStyledAttributes.getColor(com.super_rabbit.wheel_picker.R.styleable.WheelPicker_textColor, androidx.core.content.ContextCompat.getColor(context, com.super_rabbit.wheel_picker.R.color.color_3_dark_blue));
        this.mTextSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(com.super_rabbit.wheel_picker.R.styleable.WheelPicker_textSize, 80);
        int i4 = typedArrayObtainStyledAttributes.getInt(com.super_rabbit.wheel_picker.R.styleable.WheelPicker_align, 1);
        java.lang.String str = "CENTER";
        if (i4 == 0) {
            str = "LEFT";
        } else if (i4 != 1 && i4 == 2) {
            str = "RIGHT";
        }
        this.mTextAlign = str;
        this.mFadingEdgeEnabled = typedArrayObtainStyledAttributes.getBoolean(com.super_rabbit.wheel_picker.R.styleable.WheelPicker_fadingEdgeEnabled, true);
        android.graphics.Paint paint = new android.graphics.Paint();
        this.mTextPaint = paint;
        paint.setAntiAlias(true);
        android.graphics.Paint paint2 = this.mTextPaint;
        if (paint2 == null) {
            kotlin.jvm.internal.Intrinsics.throwNpe();
        }
        paint2.setTextSize(this.mTextSize);
        android.graphics.Paint paint3 = this.mTextPaint;
        if (paint3 == null) {
            kotlin.jvm.internal.Intrinsics.throwNpe();
        }
        paint3.setTextAlign(android.graphics.Paint.Align.valueOf(this.mTextAlign));
        android.graphics.Paint paint4 = this.mTextPaint;
        if (paint4 == null) {
            kotlin.jvm.internal.Intrinsics.throwNpe();
        }
        paint4.setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
        typedArrayObtainStyledAttributes.recycle();
        initializeSelectorWheelIndices();
    }

    @Override // android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        if (changed) {
            initializeSelectorWheel();
            initializeFadingEdges();
        }
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        android.view.ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new android.view.ViewGroup.LayoutParams(-2, -2);
        }
        setMeasuredDimension(calculateSize(getSuggestedMinimumWidth(), layoutParams.width, widthMeasureSpec) + getPaddingLeft() + getPaddingRight(), calculateSize(getSuggestedMinimumHeight(), layoutParams.height, heightMeasureSpec) + getPaddingTop() + getPaddingBottom());
    }

    @Override // android.view.View
    protected int getSuggestedMinimumWidth() {
        int suggestedMinimumHeight = super.getSuggestedMinimumHeight();
        return this.mSelectorVisibleItemCount > 0 ? java.lang.Math.max(suggestedMinimumHeight, computeMaximumWidth()) : suggestedMinimumHeight;
    }

    @Override // android.view.View
    protected int getSuggestedMinimumHeight() {
        int suggestedMinimumWidth = super.getSuggestedMinimumWidth();
        if (this.mSelectorVisibleItemCount <= 0) {
            return suggestedMinimumWidth;
        }
        android.graphics.Paint paint = this.mTextPaint;
        if (paint == null) {
            kotlin.jvm.internal.Intrinsics.throwNpe();
        }
        android.graphics.Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
        return java.lang.Math.max(suggestedMinimumWidth, (fontMetricsInt.descent - fontMetricsInt.ascent) * this.mSelectorVisibleItemCount);
    }

    private final int computeMaximumWidth() {
        int iMeasureText;
        android.graphics.Paint paint = this.mTextPaint;
        if (paint == null) {
            kotlin.jvm.internal.Intrinsics.throwNpe();
        }
        paint.setTextSize(this.mTextSize * 1.3f);
        com.super_rabbit.wheel_picker.WheelAdapter wheelAdapter = this.mAdapter;
        if (wheelAdapter == null) {
            android.graphics.Paint paint2 = this.mTextPaint;
            if (paint2 == null) {
                kotlin.jvm.internal.Intrinsics.throwNpe();
            }
            int iMeasureText2 = (int) paint2.measureText(java.lang.String.valueOf(this.mMinIndex));
            android.graphics.Paint paint3 = this.mTextPaint;
            if (paint3 == null) {
                kotlin.jvm.internal.Intrinsics.throwNpe();
            }
            int iMeasureText3 = (int) paint3.measureText(java.lang.String.valueOf(this.mMaxIndex));
            android.graphics.Paint paint4 = this.mTextPaint;
            if (paint4 == null) {
                kotlin.jvm.internal.Intrinsics.throwNpe();
            }
            paint4.setTextSize(this.mTextSize * 1.0f);
            return iMeasureText2 > iMeasureText3 ? iMeasureText2 : iMeasureText3;
        }
        if (wheelAdapter == null) {
            kotlin.jvm.internal.Intrinsics.throwNpe();
        }
        if (!(wheelAdapter.getTextWithMaximumLength().length() == 0)) {
            android.graphics.Paint paint5 = this.mTextPaint;
            if (paint5 == null) {
                kotlin.jvm.internal.Intrinsics.throwNpe();
            }
            com.super_rabbit.wheel_picker.WheelAdapter wheelAdapter2 = this.mAdapter;
            if (wheelAdapter2 == null) {
                kotlin.jvm.internal.Intrinsics.throwNpe();
            }
            iMeasureText = (int) paint5.measureText(wheelAdapter2.getTextWithMaximumLength());
            android.graphics.Paint paint6 = this.mTextPaint;
            if (paint6 == null) {
                kotlin.jvm.internal.Intrinsics.throwNpe();
            }
            paint6.setTextSize(this.mTextSize * 1.0f);
        } else {
            android.graphics.Paint paint7 = this.mTextPaint;
            if (paint7 == null) {
                kotlin.jvm.internal.Intrinsics.throwNpe();
            }
            iMeasureText = (int) paint7.measureText("0000");
            android.graphics.Paint paint8 = this.mTextPaint;
            if (paint8 == null) {
                kotlin.jvm.internal.Intrinsics.throwNpe();
            }
            paint8.setTextSize(this.mTextSize * 1.0f);
        }
        return iMeasureText;
    }

    private final int calculateSize(int suggestedSize, int paramSize, int measureSpec) {
        int size = android.view.View.MeasureSpec.getSize(measureSpec);
        int mode = android.view.View.MeasureSpec.getMode(android.view.View.MeasureSpec.getMode(measureSpec));
        if (mode == Integer.MIN_VALUE) {
            if (paramSize == -2) {
                return java.lang.Math.min(suggestedSize, size);
            }
            return paramSize == -1 ? size : java.lang.Math.min(paramSize, size);
        }
        if (mode != 0) {
            if (mode != 1073741824) {
                return 0;
            }
            return size;
        }
        if (paramSize != -2 && paramSize != -1) {
            suggestedSize = paramSize;
        }
        return suggestedSize;
    }

    private final void initializeSelectorWheel() {
        this.mItemHeight = getItemHeight();
        this.mTextHeight = computeTextHeight();
        this.mTextGapHeight = getGapHeight();
        int i = this.mItemHeight;
        int i2 = ((this.mWheelVisibleItemMiddleIndex * i) + ((this.mTextHeight + i) / 2)) - (i * this.mWheelMiddleItemIndex);
        this.mInitialFirstItemOffset = i2;
        this.mCurrentFirstItemOffset = i2;
    }

    private final void initializeFadingEdges() {
        setVerticalFadingEdgeEnabled(this.mFadingEdgeEnabled);
        if (this.mFadingEdgeEnabled) {
            setFadingEdgeLength(((getBottom() - getTop()) - this.mTextSize) / 2);
        }
    }

    private final void initializeSelectorWheelIndices() {
        this.mSelectorItemIndices.clear();
        int i = this.mSelectorItemCount;
        for (int i2 = 0; i2 < i; i2++) {
            int wrappedSelectorIndex = i2 - this.mWheelMiddleItemIndex;
            if (this.mWrapSelectorWheelPreferred) {
                wrappedSelectorIndex = getWrappedSelectorIndex(wrappedSelectorIndex);
            }
            this.mSelectorItemIndices.add(java.lang.Integer.valueOf(wrappedSelectorIndex));
        }
    }

    @Override // android.view.View
    protected float getBottomFadingEdgeStrength() {
        return this.TOP_AND_BOTTOM_FADING_EDGE_STRENGTH;
    }

    @Override // android.view.View
    protected float getTopFadingEdgeStrength() {
        return this.TOP_AND_BOTTOM_FADING_EDGE_STRENGTH;
    }

    @Override // android.view.View
    protected void onDraw(android.graphics.Canvas canvas) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(canvas, "canvas");
        super.onDraw(canvas);
        drawVertical(canvas);
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent event) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(event, "event");
        onTouchEventVertical(event);
        return true;
    }

    private final void onTouchEventVertical(android.view.MotionEvent event) {
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = android.view.VelocityTracker.obtain();
        }
        android.view.VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.addMovement(event);
        }
        int actionMasked = event.getActionMasked();
        if (actionMasked == 0) {
            android.widget.OverScroller overScroller = this.mOverScroller;
            if (overScroller == null) {
                kotlin.jvm.internal.Intrinsics.throwNpe();
            }
            if (!overScroller.isFinished()) {
                android.widget.OverScroller overScroller2 = this.mOverScroller;
                if (overScroller2 == null) {
                    kotlin.jvm.internal.Intrinsics.throwNpe();
                }
                overScroller2.forceFinished(true);
            }
            this.mLastY = event.getY();
            return;
        }
        if (actionMasked == 1) {
            if (this.mIsDragging) {
                this.mIsDragging = false;
                android.view.ViewParent parent = getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(false);
                }
                android.view.VelocityTracker velocityTracker2 = this.mVelocityTracker;
                if (velocityTracker2 != null) {
                    velocityTracker2.computeCurrentVelocity(1000, this.mMaximumVelocity);
                }
                android.view.VelocityTracker velocityTracker3 = this.mVelocityTracker;
                java.lang.Integer numValueOf = velocityTracker3 != null ? java.lang.Integer.valueOf((int) velocityTracker3.getYVelocity()) : null;
                if (numValueOf == null) {
                    kotlin.jvm.internal.Intrinsics.throwNpe();
                }
                if (java.lang.Math.abs(numValueOf.intValue()) > this.mMinimumVelocity) {
                    this.mPreviousScrollerY = 0;
                    android.widget.OverScroller overScroller3 = this.mOverScroller;
                    if (overScroller3 != null) {
                        overScroller3.fling(getScrollX(), getScrollY(), 0, numValueOf.intValue(), 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, (int) (((double) getItemHeight()) * 0.7d));
                    }
                    invalidateOnAnimation();
                } else {
                    adjustItemVertical();
                }
                recyclerVelocityTracker();
                return;
            }
            handlerClickVertical((int) event.getY());
            return;
        }
        if (actionMasked != 2) {
            if (actionMasked != 3) {
                return;
            }
            if (this.mIsDragging) {
                adjustItemVertical();
                this.mIsDragging = false;
            }
            recyclerVelocityTracker();
            return;
        }
        float y = event.getY() - this.mLastY;
        if (!this.mIsDragging && java.lang.Math.abs(y) > this.mTouchSlop) {
            android.view.ViewParent parent2 = getParent();
            if (parent2 != null) {
                parent2.requestDisallowInterceptTouchEvent(true);
            }
            if (y > 0) {
                y -= this.mTouchSlop;
            } else {
                y += this.mTouchSlop;
            }
            this.mIsDragging = true;
        }
        if (this.mIsDragging) {
            scrollBy(0, (int) y);
            invalidate();
            this.mLastY = event.getY();
        }
    }

    private final void handlerClickVertical(int y) {
        changeValueBySteps((y / this.mItemHeight) - this.mWheelVisibleItemMiddleIndex);
    }

    @Override // android.view.View
    public void scrollBy(int x, int y) {
        if (y == 0) {
            return;
        }
        int i = this.mTextGapHeight;
        if (!this.mWrapSelectorWheelPreferred && y > 0 && kotlin.jvm.internal.Intrinsics.compare(this.mSelectorItemIndices.get(this.mWheelMiddleItemIndex).intValue(), this.mMinIndex) <= 0) {
            int i2 = this.mCurrentFirstItemOffset;
            int i3 = this.mInitialFirstItemOffset;
            int i4 = i / 2;
            if ((i2 + y) - i3 < i4) {
                this.mCurrentFirstItemOffset = i2 + y;
                return;
            }
            this.mCurrentFirstItemOffset = i3 + i4;
            android.widget.OverScroller overScroller = this.mOverScroller;
            if (overScroller == null) {
                kotlin.jvm.internal.Intrinsics.throwNpe();
            }
            if (overScroller.isFinished() || this.mIsDragging) {
                return;
            }
            android.widget.OverScroller overScroller2 = this.mOverScroller;
            if (overScroller2 == null) {
                kotlin.jvm.internal.Intrinsics.throwNpe();
            }
            overScroller2.abortAnimation();
            return;
        }
        if (!this.mWrapSelectorWheelPreferred && y < 0 && kotlin.jvm.internal.Intrinsics.compare(this.mSelectorItemIndices.get(this.mWheelMiddleItemIndex).intValue(), this.mMaxIndex) >= 0) {
            int i5 = this.mCurrentFirstItemOffset;
            int i6 = this.mInitialFirstItemOffset;
            int i7 = i / 2;
            if ((i5 + y) - i6 > (-i7)) {
                this.mCurrentFirstItemOffset = i5 + y;
                return;
            }
            this.mCurrentFirstItemOffset = i6 - i7;
            android.widget.OverScroller overScroller3 = this.mOverScroller;
            if (overScroller3 == null) {
                kotlin.jvm.internal.Intrinsics.throwNpe();
            }
            if (overScroller3.isFinished() || this.mIsDragging) {
                return;
            }
            android.widget.OverScroller overScroller4 = this.mOverScroller;
            if (overScroller4 == null) {
                kotlin.jvm.internal.Intrinsics.throwNpe();
            }
            overScroller4.abortAnimation();
            return;
        }
        this.mCurrentFirstItemOffset += y;
        while (true) {
            int i8 = this.mCurrentFirstItemOffset;
            if (i8 - this.mInitialFirstItemOffset >= (-i)) {
                break;
            }
            this.mCurrentFirstItemOffset = i8 + this.mItemHeight;
            increaseSelectorsIndex();
            if (!this.mWrapSelectorWheelPreferred && kotlin.jvm.internal.Intrinsics.compare(this.mSelectorItemIndices.get(this.mWheelMiddleItemIndex).intValue(), this.mMaxIndex) >= 0) {
                this.mCurrentFirstItemOffset = this.mInitialFirstItemOffset;
            }
        }
        while (true) {
            int i9 = this.mCurrentFirstItemOffset;
            if (i9 - this.mInitialFirstItemOffset > i) {
                this.mCurrentFirstItemOffset = i9 - this.mItemHeight;
                decreaseSelectorsIndex();
                if (!this.mWrapSelectorWheelPreferred && kotlin.jvm.internal.Intrinsics.compare(this.mSelectorItemIndices.get(this.mWheelMiddleItemIndex).intValue(), this.mMinIndex) <= 0) {
                    this.mCurrentFirstItemOffset = this.mInitialFirstItemOffset;
                }
            } else {
                java.lang.Integer num = this.mSelectorItemIndices.get(this.mWheelMiddleItemIndex);
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(num, "mSelectorItemIndices[mWheelMiddleItemIndex]");
                onSelectionChanged(num.intValue(), true);
                return;
            }
        }
    }

    @Override // android.view.View
    public void computeScroll() {
        super.computeScroll();
        android.widget.OverScroller overScroller = this.mOverScroller;
        if (overScroller == null) {
            kotlin.jvm.internal.Intrinsics.throwNpe();
        }
        if (overScroller.computeScrollOffset()) {
            android.widget.OverScroller overScroller2 = this.mOverScroller;
            if (overScroller2 == null) {
                kotlin.jvm.internal.Intrinsics.throwNpe();
            }
            int currX = overScroller2.getCurrX();
            android.widget.OverScroller overScroller3 = this.mOverScroller;
            if (overScroller3 == null) {
                kotlin.jvm.internal.Intrinsics.throwNpe();
            }
            int currY = overScroller3.getCurrY();
            if (this.mPreviousScrollerY == 0) {
                android.widget.OverScroller overScroller4 = this.mOverScroller;
                if (overScroller4 == null) {
                    kotlin.jvm.internal.Intrinsics.throwNpe();
                }
                this.mPreviousScrollerY = overScroller4.getStartY();
            }
            scrollBy(currX, currY - this.mPreviousScrollerY);
            this.mPreviousScrollerY = currY;
            invalidate();
            return;
        }
        if (this.mIsDragging) {
            return;
        }
        adjustItemVertical();
    }

    private final void adjustItemVertical() {
        this.mPreviousScrollerY = 0;
        int i = this.mInitialFirstItemOffset - this.mCurrentFirstItemOffset;
        int iAbs = java.lang.Math.abs(i);
        int i2 = this.mItemHeight;
        if (iAbs > i2 / 2) {
            if (i > 0) {
                i2 = -i2;
            }
            i += i2;
        }
        int i3 = i;
        if (i3 != 0) {
            android.widget.OverScroller overScroller = this.mOverScroller;
            if (overScroller == null) {
                kotlin.jvm.internal.Intrinsics.throwNpe();
            }
            overScroller.startScroll(getScrollX(), getScrollY(), 0, i3, 800);
            invalidateOnAnimation();
        }
    }

    private final void recyclerVelocityTracker() {
        android.view.VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.mVelocityTracker = (android.view.VelocityTracker) null;
    }

    @Override // android.view.View
    protected void onScrollChanged(int l, int t, int oldl, int oldt) {
        super.onScrollChanged(l, t, oldl, oldt);
    }

    private final int getItemHeight() {
        return getHeight() / (this.mSelectorItemCount - 2);
    }

    private final int getGapHeight() {
        return getItemHeight() - computeTextHeight();
    }

    private final int computeTextHeight() {
        android.graphics.Paint paint = this.mTextPaint;
        if (paint == null) {
            kotlin.jvm.internal.Intrinsics.throwNpe();
        }
        android.graphics.Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
        return java.lang.Math.abs(fontMetricsInt.bottom + fontMetricsInt.top);
    }

    private final void invalidateOnAnimation() {
        if (android.os.Build.VERSION.SDK_INT >= 16) {
            postInvalidateOnAnimation();
        } else {
            invalidate();
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002c  */
    private final void drawVertical(android.graphics.Canvas canvas) {
        int right;
        float right2;
        if (this.mSelectorItemIndices.size() == 0) {
            return;
        }
        int itemHeight = getItemHeight();
        android.graphics.Paint paint = this.mTextPaint;
        if (paint == null) {
            kotlin.jvm.internal.Intrinsics.throwNpe();
        }
        android.graphics.Paint.Align textAlign = paint.getTextAlign();
        if (textAlign != null) {
            int i = com.super_rabbit.wheel_picker.WheelPicker.WhenMappings.$EnumSwitchMapping$0[textAlign.ordinal()];
            if (i == 1) {
                right = getPaddingLeft();
            } else if (i != 2 && i == 3) {
                right2 = (getRight() - getLeft()) - getPaddingRight();
            } else {
                right = (getRight() - getLeft()) / 2;
            }
            right2 = right;
        } else {
            right = (getRight() - getLeft()) / 2;
            right2 = right;
        }
        float f = this.mCurrentFirstItemOffset;
        int i2 = this.mWheelVisibleItemMiddleIndex;
        int iMax = java.lang.Math.max(i2, (this.mSelectorVisibleItemCount - i2) - 1);
        for (int i3 = 0; i3 < this.mSelectorItemIndices.size(); i3++) {
            float f2 = 1.0f;
            float fAbs = java.lang.Math.abs(f - (this.mInitialFirstItemOffset + (this.mWheelMiddleItemIndex * itemHeight)));
            if (iMax != 0) {
                float f3 = itemHeight * iMax;
                f2 = 1 + (((f3 - fAbs) * 0.3f) / f3);
            }
            if (fAbs < this.mItemHeight / 2) {
                android.graphics.Paint paint2 = this.mTextPaint;
                if (paint2 == null) {
                    kotlin.jvm.internal.Intrinsics.throwNpe();
                }
                paint2.setColor(this.mSelectedTextColor);
            } else {
                android.graphics.Paint paint3 = this.mTextPaint;
                if (paint3 == null) {
                    kotlin.jvm.internal.Intrinsics.throwNpe();
                }
                paint3.setColor(this.mUnSelectedTextColor);
            }
            canvas.save();
            canvas.scale(f2, f2, right2, f);
            java.lang.Integer num = this.mSelectorItemIndices.get(i3);
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(num, "mSelectorItemIndices[i]");
            java.lang.String value = getValue(num.intValue());
            android.graphics.Paint paint4 = this.mTextPaint;
            if (paint4 == null) {
                kotlin.jvm.internal.Intrinsics.throwNpe();
            }
            canvas.drawText(value, right2, f, paint4);
            canvas.restore();
            f += itemHeight;
        }
    }

    private final java.lang.String getValue(int position) {
        com.super_rabbit.wheel_picker.WheelAdapter wheelAdapter = this.mAdapter;
        if (wheelAdapter != null) {
            if (wheelAdapter == null) {
                kotlin.jvm.internal.Intrinsics.throwNpe();
            }
            return wheelAdapter.getValue(position);
        }
        if (this.mWrapSelectorWheelPreferred) {
            return java.lang.String.valueOf(getWrappedSelectorIndex(position));
        }
        return (position <= this.mMaxIndex && position >= this.mMinIndex) ? java.lang.String.valueOf(position) : "";
    }

    private final int getPosition(java.lang.String value) {
        com.super_rabbit.wheel_picker.WheelAdapter wheelAdapter = this.mAdapter;
        if (wheelAdapter == null) {
            try {
                return validatePosition(java.lang.Integer.parseInt(value));
            } catch (java.lang.NumberFormatException unused) {
                return 0;
            }
        }
        if (wheelAdapter == null) {
            kotlin.jvm.internal.Intrinsics.throwNpe();
        }
        return wheelAdapter.getPosition(value);
    }

    private final void increaseSelectorsIndex() {
        int size = this.mSelectorItemIndices.size() - 1;
        int i = 0;
        while (i < size) {
            java.util.ArrayList<java.lang.Integer> arrayList = this.mSelectorItemIndices;
            int i2 = i + 1;
            arrayList.set(i, arrayList.get(i2));
            i = i2;
        }
        java.util.ArrayList<java.lang.Integer> arrayList2 = this.mSelectorItemIndices;
        int iIntValue = arrayList2.get(arrayList2.size() - 2).intValue() + 1;
        if (this.mWrapSelectorWheelPreferred && iIntValue > this.mMaxIndex) {
            iIntValue = this.mMinIndex;
        }
        java.util.ArrayList<java.lang.Integer> arrayList3 = this.mSelectorItemIndices;
        arrayList3.set(arrayList3.size() - 1, java.lang.Integer.valueOf(iIntValue));
    }

    private final void decreaseSelectorsIndex() {
        for (int size = this.mSelectorItemIndices.size() - 1; size >= 1; size--) {
            java.util.ArrayList<java.lang.Integer> arrayList = this.mSelectorItemIndices;
            arrayList.set(size, arrayList.get(size - 1));
        }
        int iIntValue = this.mSelectorItemIndices.get(1).intValue() - 1;
        if (this.mWrapSelectorWheelPreferred && iIntValue < this.mMinIndex) {
            iIntValue = this.mMaxIndex;
        }
        this.mSelectorItemIndices.set(0, java.lang.Integer.valueOf(iIntValue));
    }

    private final void changeValueBySteps(int steps) {
        this.mPreviousScrollerY = 0;
        android.widget.OverScroller overScroller = this.mOverScroller;
        if (overScroller == null) {
            kotlin.jvm.internal.Intrinsics.throwNpe();
        }
        overScroller.startScroll(0, 0, 0, (-this.mItemHeight) * steps, this.SNAP_SCROLL_DURATION);
        invalidate();
    }

    private final void onSelectionChanged(int current, boolean notifyChange) {
        int i = this.mCurSelectedItemIndex;
        this.mCurSelectedItemIndex = current;
        if (!notifyChange || i == current) {
            return;
        }
        notifyChange(i, current);
    }

    private final int getWrappedSelectorIndex(int selectorIndex) {
        int i = this.mMaxIndex;
        if (selectorIndex > i) {
            int i2 = this.mMinIndex;
            return (i2 + ((selectorIndex - i) % ((i - i2) + 1))) - 1;
        }
        int i3 = this.mMinIndex;
        return selectorIndex < i3 ? (i - ((i3 - selectorIndex) % ((i - i3) + 1))) + 1 : selectorIndex;
    }

    private final void notifyChange(int previous, int current) {
        com.super_rabbit.wheel_picker.OnValueChangeListener onValueChangeListener = this.mOnValueChangeListener;
        if (onValueChangeListener != null) {
            onValueChangeListener.onValueChange(this, getValue(previous), getValue(current));
        }
    }

    public final void scrollTo(int position) {
        if (this.mCurSelectedItemIndex == position) {
            return;
        }
        this.mCurSelectedItemIndex = position;
        this.mSelectorItemIndices.clear();
        int i = this.mSelectorItemCount;
        for (int i2 = 0; i2 < i; i2++) {
            int wrappedSelectorIndex = this.mCurSelectedItemIndex + (i2 - this.mWheelMiddleItemIndex);
            if (this.mWrapSelectorWheelPreferred) {
                wrappedSelectorIndex = getWrappedSelectorIndex(wrappedSelectorIndex);
            }
            this.mSelectorItemIndices.add(java.lang.Integer.valueOf(wrappedSelectorIndex));
        }
    }

    public final void setOnValueChangeListener(com.super_rabbit.wheel_picker.OnValueChangeListener onValueChangeListener) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(onValueChangeListener, "onValueChangeListener");
        this.mOnValueChangeListener = onValueChangeListener;
    }

    public final java.lang.String getCurrentItem() {
        return getValue(this.mCurSelectedItemIndex);
    }

    public final void smoothScrollTo(int position) {
        changeValueBySteps(validatePosition(position) - this.mCurSelectedItemIndex);
    }

    public final void smoothScrollToValue(java.lang.String value) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(value, "value");
        smoothScrollTo(getPosition(value));
    }

    public final void scrollToValue(java.lang.String value) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(value, "value");
        scrollTo(getPosition(value));
    }

    private final int validatePosition(int position) {
        if (!this.mWrapSelectorWheelPreferred) {
            int i = this.mMaxIndex;
            return (position <= i && position >= (i = this.mMinIndex)) ? position : i;
        }
        return getWrappedSelectorIndex(position);
    }

    public final void setUnselectedTextColor(int resourceId) {
        this.mUnSelectedTextColor = resourceId;
    }

    public final void setAdapter(com.super_rabbit.wheel_picker.WheelAdapter adapter) {
        this.mAdapter = adapter;
        if (adapter == null) {
            invalidate();
            return;
        }
        if (adapter == null) {
            kotlin.jvm.internal.Intrinsics.throwNpe();
        }
        this.mMaxIndex = adapter.getMaxIndex();
        this.mMinIndex = adapter.getMinIndex();
        invalidate();
    }

    public final void setSelectorRoundedWrapPreferred(boolean wrap) {
        this.mWrapSelectorWheelPreferred = wrap;
        requestLayout();
    }

    public final void setWheelItemCount(int count) {
        int i = count + 2;
        this.mSelectorItemCount = i;
        this.mWheelMiddleItemIndex = (i - 1) / 2;
        int i2 = i - 2;
        this.mSelectorVisibleItemCount = i2;
        this.mWheelVisibleItemMiddleIndex = (i2 - 1) / 2;
        this.mSelectorItemIndices = new java.util.ArrayList<>(this.mSelectorItemCount);
        reset();
        requestLayout();
    }

    public final void setSelectedTextColor(int colorId) {
        this.mSelectedTextColor = androidx.core.content.ContextCompat.getColor(getContext(), colorId);
        requestLayout();
    }

    public final void setMax(int max) {
        this.mMaxIndex = max;
    }

    public final void setMin(int min) {
        this.mMinIndex = min;
    }

    public final void reset() {
        initializeSelectorWheelIndices();
        initializeSelectorWheel();
        requestLayout();
    }
}
