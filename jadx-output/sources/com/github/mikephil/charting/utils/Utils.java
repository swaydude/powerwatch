package com.github.mikephil.charting.utils;

/* JADX INFO: loaded from: classes.dex */
public abstract class Utils {
    public static final double DEG2RAD = 0.017453292519943295d;
    public static final float FDEG2RAD = 0.017453292f;
    private static int mMaximumFlingVelocity = 8000;
    private static android.util.DisplayMetrics mMetrics = null;
    private static int mMinimumFlingVelocity = 50;
    public static final double DOUBLE_EPSILON = java.lang.Double.longBitsToDouble(1);
    public static final float FLOAT_EPSILON = java.lang.Float.intBitsToFloat(1);
    private static android.graphics.Rect mCalcTextHeightRect = new android.graphics.Rect();
    private static android.graphics.Paint.FontMetrics mFontMetrics = new android.graphics.Paint.FontMetrics();
    private static android.graphics.Rect mCalcTextSizeRect = new android.graphics.Rect();
    private static final int[] POW_10 = {1, 10, 100, 1000, 10000, 100000, kotlin.time.DurationKt.NANOS_IN_MILLIS, 10000000, 100000000, 1000000000};
    private static com.github.mikephil.charting.formatter.IValueFormatter mDefaultValueFormatter = generateDefaultValueFormatter();
    private static android.graphics.Rect mDrawableBoundsCache = new android.graphics.Rect();
    private static android.graphics.Rect mDrawTextRectBuffer = new android.graphics.Rect();
    private static android.graphics.Paint.FontMetrics mFontMetricsBuffer = new android.graphics.Paint.FontMetrics();

    public static float getNormalizedAngle(float f) {
        while (f < 0.0f) {
            f += 360.0f;
        }
        return f % 360.0f;
    }

    public static void init(android.content.Context context) {
        if (context == null) {
            mMinimumFlingVelocity = android.view.ViewConfiguration.getMinimumFlingVelocity();
            mMaximumFlingVelocity = android.view.ViewConfiguration.getMaximumFlingVelocity();
            android.util.Log.e("MPChartLib-Utils", "Utils.init(...) PROVIDED CONTEXT OBJECT IS NULL");
        } else {
            android.view.ViewConfiguration viewConfiguration = android.view.ViewConfiguration.get(context);
            mMinimumFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
            mMaximumFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
            mMetrics = context.getResources().getDisplayMetrics();
        }
    }

    @java.lang.Deprecated
    public static void init(android.content.res.Resources resources) {
        mMetrics = resources.getDisplayMetrics();
        mMinimumFlingVelocity = android.view.ViewConfiguration.getMinimumFlingVelocity();
        mMaximumFlingVelocity = android.view.ViewConfiguration.getMaximumFlingVelocity();
    }

    public static float convertDpToPixel(float f) {
        android.util.DisplayMetrics displayMetrics = mMetrics;
        if (displayMetrics == null) {
            android.util.Log.e("MPChartLib-Utils", "Utils NOT INITIALIZED. You need to call Utils.init(...) at least once before calling Utils.convertDpToPixel(...). Otherwise conversion does not take place.");
            return f;
        }
        return f * displayMetrics.density;
    }

    public static float convertPixelsToDp(float f) {
        android.util.DisplayMetrics displayMetrics = mMetrics;
        if (displayMetrics == null) {
            android.util.Log.e("MPChartLib-Utils", "Utils NOT INITIALIZED. You need to call Utils.init(...) at least once before calling Utils.convertPixelsToDp(...). Otherwise conversion does not take place.");
            return f;
        }
        return f / displayMetrics.density;
    }

    public static int calcTextWidth(android.graphics.Paint paint, java.lang.String str) {
        return (int) paint.measureText(str);
    }

    public static int calcTextHeight(android.graphics.Paint paint, java.lang.String str) {
        android.graphics.Rect rect = mCalcTextHeightRect;
        rect.set(0, 0, 0, 0);
        paint.getTextBounds(str, 0, str.length(), rect);
        return rect.height();
    }

    public static float getLineHeight(android.graphics.Paint paint) {
        return getLineHeight(paint, mFontMetrics);
    }

    public static float getLineHeight(android.graphics.Paint paint, android.graphics.Paint.FontMetrics fontMetrics) {
        paint.getFontMetrics(fontMetrics);
        return fontMetrics.descent - fontMetrics.ascent;
    }

    public static float getLineSpacing(android.graphics.Paint paint) {
        return getLineSpacing(paint, mFontMetrics);
    }

    public static float getLineSpacing(android.graphics.Paint paint, android.graphics.Paint.FontMetrics fontMetrics) {
        paint.getFontMetrics(fontMetrics);
        return (fontMetrics.ascent - fontMetrics.top) + fontMetrics.bottom;
    }

    public static com.github.mikephil.charting.utils.FSize calcTextSize(android.graphics.Paint paint, java.lang.String str) {
        com.github.mikephil.charting.utils.FSize fSize = com.github.mikephil.charting.utils.FSize.getInstance(0.0f, 0.0f);
        calcTextSize(paint, str, fSize);
        return fSize;
    }

    public static void calcTextSize(android.graphics.Paint paint, java.lang.String str, com.github.mikephil.charting.utils.FSize fSize) {
        android.graphics.Rect rect = mCalcTextSizeRect;
        rect.set(0, 0, 0, 0);
        paint.getTextBounds(str, 0, str.length(), rect);
        fSize.width = rect.width();
        fSize.height = rect.height();
    }

    private static com.github.mikephil.charting.formatter.IValueFormatter generateDefaultValueFormatter() {
        return new com.github.mikephil.charting.formatter.DefaultValueFormatter(1);
    }

    public static com.github.mikephil.charting.formatter.IValueFormatter getDefaultValueFormatter() {
        return mDefaultValueFormatter;
    }

    public static java.lang.String formatNumber(float f, int i, boolean z) {
        return formatNumber(f, i, z, '.');
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00a6  */
    public static java.lang.String formatNumber(float f, int i, boolean z, char c) {
        boolean z2;
        float f2 = f;
        char[] cArr = new char[35];
        if (f2 == 0.0f) {
            return "0";
        }
        int i2 = 0;
        boolean z3 = f2 < 1.0f && f2 > -1.0f;
        if (f2 < 0.0f) {
            f2 = -f2;
            z2 = true;
        } else {
            z2 = false;
        }
        int[] iArr = POW_10;
        int length = i > iArr.length ? iArr.length - 1 : i;
        long jRound = java.lang.Math.round(f2 * iArr[length]);
        int i3 = 34;
        boolean z4 = false;
        while (true) {
            if (jRound == 0 && i2 >= length + 1) {
                break;
            }
            boolean z5 = z4;
            int i4 = (int) (jRound % 10);
            jRound /= 10;
            int i5 = i3 - 1;
            cArr[i3] = (char) (i4 + 48);
            i2++;
            if (i2 == length) {
                i3 = i5 - 1;
                cArr[i5] = ',';
                i2++;
                z4 = true;
            } else if (!z || jRound == 0 || i2 <= length) {
                z4 = z5;
                i3 = i5;
            } else if (z5) {
                if ((i2 - length) % 4 == 0) {
                    i3 = i5 - 1;
                    cArr[i5] = c;
                    i2++;
                    z4 = z5;
                } else {
                    z4 = z5;
                    i3 = i5;
                }
            } else if ((i2 - length) % 4 == 3) {
                i3 = i5 - 1;
                cArr[i5] = c;
                i2++;
                z4 = z5;
            } else {
                z4 = z5;
                i3 = i5;
            }
        }
        if (z3) {
            cArr[i3] = '0';
            i2++;
            i3--;
        }
        if (z2) {
            cArr[i3] = '-';
            i2++;
        }
        int i6 = 35 - i2;
        return java.lang.String.valueOf(cArr, i6, 35 - i6);
    }

    public static float roundToNextSignificant(double d) {
        if (java.lang.Double.isInfinite(d) || java.lang.Double.isNaN(d) || d == 0.0d) {
            return 0.0f;
        }
        float fPow = (float) java.lang.Math.pow(10.0d, 1 - ((int) java.lang.Math.ceil((float) java.lang.Math.log10(d < 0.0d ? -d : d))));
        return java.lang.Math.round(d * ((double) fPow)) / fPow;
    }

    public static int getDecimals(float f) {
        float fRoundToNextSignificant = roundToNextSignificant(f);
        if (java.lang.Float.isInfinite(fRoundToNextSignificant)) {
            return 0;
        }
        return ((int) java.lang.Math.ceil(-java.lang.Math.log10(fRoundToNextSignificant))) + 2;
    }

    public static int[] convertIntegers(java.util.List<java.lang.Integer> list) {
        int[] iArr = new int[list.size()];
        copyIntegers(list, iArr);
        return iArr;
    }

    public static void copyIntegers(java.util.List<java.lang.Integer> list, int[] iArr) {
        int length = iArr.length < list.size() ? iArr.length : list.size();
        for (int i = 0; i < length; i++) {
            iArr[i] = list.get(i).intValue();
        }
    }

    public static java.lang.String[] convertStrings(java.util.List<java.lang.String> list) {
        int size = list.size();
        java.lang.String[] strArr = new java.lang.String[size];
        for (int i = 0; i < size; i++) {
            strArr[i] = list.get(i);
        }
        return strArr;
    }

    public static void copyStrings(java.util.List<java.lang.String> list, java.lang.String[] strArr) {
        int length = strArr.length < list.size() ? strArr.length : list.size();
        for (int i = 0; i < length; i++) {
            strArr[i] = list.get(i);
        }
    }

    public static double nextUp(double d) {
        if (d == Double.POSITIVE_INFINITY) {
            return d;
        }
        double d2 = d + 0.0d;
        return java.lang.Double.longBitsToDouble(java.lang.Double.doubleToRawLongBits(d2) + (d2 >= 0.0d ? 1L : -1L));
    }

    public static com.github.mikephil.charting.utils.MPPointF getPosition(com.github.mikephil.charting.utils.MPPointF mPPointF, float f, float f2) {
        com.github.mikephil.charting.utils.MPPointF mPPointF2 = com.github.mikephil.charting.utils.MPPointF.getInstance(0.0f, 0.0f);
        getPosition(mPPointF, f, f2, mPPointF2);
        return mPPointF2;
    }

    public static void getPosition(com.github.mikephil.charting.utils.MPPointF mPPointF, float f, float f2, com.github.mikephil.charting.utils.MPPointF mPPointF2) {
        double d = f;
        double d2 = f2;
        mPPointF2.x = (float) (((double) mPPointF.x) + (java.lang.Math.cos(java.lang.Math.toRadians(d2)) * d));
        mPPointF2.y = (float) (((double) mPPointF.y) + (d * java.lang.Math.sin(java.lang.Math.toRadians(d2))));
    }

    public static void velocityTrackerPointerUpCleanUpIfNecessary(android.view.MotionEvent motionEvent, android.view.VelocityTracker velocityTracker) {
        velocityTracker.computeCurrentVelocity(1000, mMaximumFlingVelocity);
        int actionIndex = motionEvent.getActionIndex();
        int pointerId = motionEvent.getPointerId(actionIndex);
        float xVelocity = velocityTracker.getXVelocity(pointerId);
        float yVelocity = velocityTracker.getYVelocity(pointerId);
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            if (i != actionIndex) {
                int pointerId2 = motionEvent.getPointerId(i);
                if ((velocityTracker.getXVelocity(pointerId2) * xVelocity) + (velocityTracker.getYVelocity(pointerId2) * yVelocity) < 0.0f) {
                    velocityTracker.clear();
                    return;
                }
            }
        }
    }

    public static void postInvalidateOnAnimation(android.view.View view) {
        if (android.os.Build.VERSION.SDK_INT >= 16) {
            view.postInvalidateOnAnimation();
        } else {
            view.postInvalidateDelayed(10L);
        }
    }

    public static int getMinimumFlingVelocity() {
        return mMinimumFlingVelocity;
    }

    public static int getMaximumFlingVelocity() {
        return mMaximumFlingVelocity;
    }

    public static void drawImage(android.graphics.Canvas canvas, android.graphics.drawable.Drawable drawable, int i, int i2, int i3, int i4) {
        com.github.mikephil.charting.utils.MPPointF mPPointF = com.github.mikephil.charting.utils.MPPointF.getInstance();
        mPPointF.x = i - (i3 / 2);
        mPPointF.y = i2 - (i4 / 2);
        drawable.copyBounds(mDrawableBoundsCache);
        drawable.setBounds(mDrawableBoundsCache.left, mDrawableBoundsCache.top, mDrawableBoundsCache.left + i3, mDrawableBoundsCache.top + i3);
        int iSave = canvas.save();
        canvas.translate(mPPointF.x, mPPointF.y);
        drawable.draw(canvas);
        canvas.restoreToCount(iSave);
    }

    public static void drawXAxisValue(android.graphics.Canvas canvas, java.lang.String str, float f, float f2, android.graphics.Paint paint, com.github.mikephil.charting.utils.MPPointF mPPointF, float f3) {
        float fontMetrics = paint.getFontMetrics(mFontMetricsBuffer);
        paint.getTextBounds(str, 0, str.length(), mDrawTextRectBuffer);
        float fWidth = 0.0f - mDrawTextRectBuffer.left;
        float f4 = (-mFontMetricsBuffer.ascent) + 0.0f;
        android.graphics.Paint.Align textAlign = paint.getTextAlign();
        paint.setTextAlign(android.graphics.Paint.Align.LEFT);
        if (f3 != 0.0f) {
            float fWidth2 = fWidth - (mDrawTextRectBuffer.width() * 0.5f);
            float f5 = f4 - (fontMetrics * 0.5f);
            if (mPPointF.x != 0.5f || mPPointF.y != 0.5f) {
                com.github.mikephil.charting.utils.FSize sizeOfRotatedRectangleByDegrees = getSizeOfRotatedRectangleByDegrees(mDrawTextRectBuffer.width(), fontMetrics, f3);
                f -= sizeOfRotatedRectangleByDegrees.width * (mPPointF.x - 0.5f);
                f2 -= sizeOfRotatedRectangleByDegrees.height * (mPPointF.y - 0.5f);
                com.github.mikephil.charting.utils.FSize.recycleInstance(sizeOfRotatedRectangleByDegrees);
            }
            canvas.save();
            canvas.translate(f, f2);
            canvas.rotate(f3);
            canvas.drawText(str, fWidth2, f5, paint);
            canvas.restore();
        } else {
            if (mPPointF.x != 0.0f || mPPointF.y != 0.0f) {
                fWidth -= mDrawTextRectBuffer.width() * mPPointF.x;
                f4 -= fontMetrics * mPPointF.y;
            }
            canvas.drawText(str, fWidth + f, f4 + f2, paint);
        }
        paint.setTextAlign(textAlign);
    }

    public static void drawMultilineText(android.graphics.Canvas canvas, android.text.StaticLayout staticLayout, float f, float f2, android.text.TextPaint textPaint, com.github.mikephil.charting.utils.MPPointF mPPointF, float f3) {
        float fontMetrics = textPaint.getFontMetrics(mFontMetricsBuffer);
        float width = staticLayout.getWidth();
        float lineCount = staticLayout.getLineCount() * fontMetrics;
        float f4 = 0.0f - mDrawTextRectBuffer.left;
        float f5 = lineCount + 0.0f;
        android.graphics.Paint.Align textAlign = textPaint.getTextAlign();
        textPaint.setTextAlign(android.graphics.Paint.Align.LEFT);
        if (f3 != 0.0f) {
            float f6 = f4 - (width * 0.5f);
            float f7 = f5 - (lineCount * 0.5f);
            if (mPPointF.x != 0.5f || mPPointF.y != 0.5f) {
                com.github.mikephil.charting.utils.FSize sizeOfRotatedRectangleByDegrees = getSizeOfRotatedRectangleByDegrees(width, lineCount, f3);
                f -= sizeOfRotatedRectangleByDegrees.width * (mPPointF.x - 0.5f);
                f2 -= sizeOfRotatedRectangleByDegrees.height * (mPPointF.y - 0.5f);
                com.github.mikephil.charting.utils.FSize.recycleInstance(sizeOfRotatedRectangleByDegrees);
            }
            canvas.save();
            canvas.translate(f, f2);
            canvas.rotate(f3);
            canvas.translate(f6, f7);
            staticLayout.draw(canvas);
            canvas.restore();
        } else {
            if (mPPointF.x != 0.0f || mPPointF.y != 0.0f) {
                f4 -= width * mPPointF.x;
                f5 -= lineCount * mPPointF.y;
            }
            canvas.save();
            canvas.translate(f4 + f, f5 + f2);
            staticLayout.draw(canvas);
            canvas.restore();
        }
        textPaint.setTextAlign(textAlign);
    }

    public static void drawMultilineText(android.graphics.Canvas canvas, java.lang.String str, float f, float f2, android.text.TextPaint textPaint, com.github.mikephil.charting.utils.FSize fSize, com.github.mikephil.charting.utils.MPPointF mPPointF, float f3) {
        drawMultilineText(canvas, new android.text.StaticLayout(str, 0, str.length(), textPaint, (int) java.lang.Math.max(java.lang.Math.ceil(fSize.width), 1.0d), android.text.Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false), f, f2, textPaint, mPPointF, f3);
    }

    public static com.github.mikephil.charting.utils.FSize getSizeOfRotatedRectangleByDegrees(com.github.mikephil.charting.utils.FSize fSize, float f) {
        return getSizeOfRotatedRectangleByRadians(fSize.width, fSize.height, f * 0.017453292f);
    }

    public static com.github.mikephil.charting.utils.FSize getSizeOfRotatedRectangleByRadians(com.github.mikephil.charting.utils.FSize fSize, float f) {
        return getSizeOfRotatedRectangleByRadians(fSize.width, fSize.height, f);
    }

    public static com.github.mikephil.charting.utils.FSize getSizeOfRotatedRectangleByDegrees(float f, float f2, float f3) {
        return getSizeOfRotatedRectangleByRadians(f, f2, f3 * 0.017453292f);
    }

    public static com.github.mikephil.charting.utils.FSize getSizeOfRotatedRectangleByRadians(float f, float f2, float f3) {
        double d = f3;
        return com.github.mikephil.charting.utils.FSize.getInstance(java.lang.Math.abs(((float) java.lang.Math.cos(d)) * f) + java.lang.Math.abs(((float) java.lang.Math.sin(d)) * f2), java.lang.Math.abs(f * ((float) java.lang.Math.sin(d))) + java.lang.Math.abs(f2 * ((float) java.lang.Math.cos(d))));
    }

    public static int getSDKInt() {
        return android.os.Build.VERSION.SDK_INT;
    }
}
