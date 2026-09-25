package androidx.constraintlayout.solver.widgets;

/* JADX INFO: loaded from: classes.dex */
public class Flow extends androidx.constraintlayout.solver.widgets.VirtualLayout {
    public static final int HORIZONTAL_ALIGN_CENTER = 2;
    public static final int HORIZONTAL_ALIGN_END = 1;
    public static final int HORIZONTAL_ALIGN_START = 0;
    public static final int VERTICAL_ALIGN_BASELINE = 3;
    public static final int VERTICAL_ALIGN_BOTTOM = 1;
    public static final int VERTICAL_ALIGN_CENTER = 2;
    public static final int VERTICAL_ALIGN_TOP = 0;
    public static final int WRAP_ALIGNED = 2;
    public static final int WRAP_CHAIN = 1;
    public static final int WRAP_NONE = 0;
    private int mHorizontalStyle = -1;
    private int mVerticalStyle = -1;
    private int mFirstHorizontalStyle = -1;
    private int mFirstVerticalStyle = -1;
    private int mLastHorizontalStyle = -1;
    private int mLastVerticalStyle = -1;
    private float mHorizontalBias = 0.5f;
    private float mVerticalBias = 0.5f;
    private float mFirstHorizontalBias = 0.5f;
    private float mFirstVerticalBias = 0.5f;
    private float mLastHorizontalBias = 0.5f;
    private float mLastVerticalBias = 0.5f;
    private int mHorizontalGap = 0;
    private int mVerticalGap = 0;
    private int mHorizontalAlign = 2;
    private int mVerticalAlign = 2;
    private int mWrapMode = 0;
    private int mMaxElementsWrap = -1;
    private int mOrientation = 0;
    private java.util.ArrayList<androidx.constraintlayout.solver.widgets.Flow.WidgetsList> mChainList = new java.util.ArrayList<>();
    private androidx.constraintlayout.solver.widgets.ConstraintWidget[] mAlignedBiggestElementsInRows = null;
    private androidx.constraintlayout.solver.widgets.ConstraintWidget[] mAlignedBiggestElementsInCols = null;
    private int[] mAlignedDimensions = null;

    @Override // androidx.constraintlayout.solver.widgets.HelperWidget, androidx.constraintlayout.solver.widgets.ConstraintWidget
    public void copy(androidx.constraintlayout.solver.widgets.ConstraintWidget constraintWidget, java.util.HashMap<androidx.constraintlayout.solver.widgets.ConstraintWidget, androidx.constraintlayout.solver.widgets.ConstraintWidget> map) {
        super.copy(constraintWidget, map);
        androidx.constraintlayout.solver.widgets.Flow flow = (androidx.constraintlayout.solver.widgets.Flow) constraintWidget;
        this.mHorizontalStyle = flow.mHorizontalStyle;
        this.mVerticalStyle = flow.mVerticalStyle;
        this.mFirstHorizontalStyle = flow.mFirstHorizontalStyle;
        this.mFirstVerticalStyle = flow.mFirstVerticalStyle;
        this.mLastHorizontalStyle = flow.mLastHorizontalStyle;
        this.mLastVerticalStyle = flow.mLastVerticalStyle;
        this.mHorizontalBias = flow.mHorizontalBias;
        this.mVerticalBias = flow.mVerticalBias;
        this.mFirstHorizontalBias = flow.mFirstHorizontalBias;
        this.mFirstVerticalBias = flow.mFirstVerticalBias;
        this.mLastHorizontalBias = flow.mLastHorizontalBias;
        this.mLastVerticalBias = flow.mLastVerticalBias;
        this.mHorizontalGap = flow.mHorizontalGap;
        this.mVerticalGap = flow.mVerticalGap;
        this.mHorizontalAlign = flow.mHorizontalAlign;
        this.mVerticalAlign = flow.mVerticalAlign;
        this.mWrapMode = flow.mWrapMode;
        this.mMaxElementsWrap = flow.mMaxElementsWrap;
        this.mOrientation = flow.mOrientation;
    }

    public void setOrientation(int i) {
        this.mOrientation = i;
    }

    public void setFirstHorizontalStyle(int i) {
        this.mFirstHorizontalStyle = i;
    }

    public void setFirstVerticalStyle(int i) {
        this.mFirstVerticalStyle = i;
    }

    public void setLastHorizontalStyle(int i) {
        this.mLastHorizontalStyle = i;
    }

    public void setLastVerticalStyle(int i) {
        this.mLastVerticalStyle = i;
    }

    public void setHorizontalStyle(int i) {
        this.mHorizontalStyle = i;
    }

    public void setVerticalStyle(int i) {
        this.mVerticalStyle = i;
    }

    public void setHorizontalBias(float f) {
        this.mHorizontalBias = f;
    }

    public void setVerticalBias(float f) {
        this.mVerticalBias = f;
    }

    public void setFirstHorizontalBias(float f) {
        this.mFirstHorizontalBias = f;
    }

    public void setFirstVerticalBias(float f) {
        this.mFirstVerticalBias = f;
    }

    public void setLastHorizontalBias(float f) {
        this.mLastHorizontalBias = f;
    }

    public void setLastVerticalBias(float f) {
        this.mLastVerticalBias = f;
    }

    public void setHorizontalAlign(int i) {
        this.mHorizontalAlign = i;
    }

    public void setVerticalAlign(int i) {
        this.mVerticalAlign = i;
    }

    public void setWrapMode(int i) {
        this.mWrapMode = i;
    }

    public void setHorizontalGap(int i) {
        this.mHorizontalGap = i;
    }

    public void setVerticalGap(int i) {
        this.mVerticalGap = i;
    }

    public void setMaxElementsWrap(int i) {
        this.mMaxElementsWrap = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getWidgetWidth(androidx.constraintlayout.solver.widgets.ConstraintWidget constraintWidget) {
        if (constraintWidget == null) {
            return 0;
        }
        if (constraintWidget.getHorizontalDimensionBehaviour() == androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.mMatchConstraintDefaultWidth == 0) {
            return 0;
        }
        return constraintWidget.getWidth();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getWidgetHeight(androidx.constraintlayout.solver.widgets.ConstraintWidget constraintWidget) {
        if (constraintWidget == null) {
            return 0;
        }
        if (constraintWidget.getVerticalDimensionBehaviour() == androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.mMatchConstraintDefaultHeight == 0) {
            return 0;
        }
        return constraintWidget.getHeight();
    }

    @Override // androidx.constraintlayout.solver.widgets.VirtualLayout
    public void measure(int i, int i2, int i3, int i4) {
        if (this.mWidgetsCount > 0 && !measureChildren()) {
            setMeasure(0, 0);
            needsCallbackFromSolver(false);
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int[] iArr = new int[2];
        int i5 = (i2 - paddingLeft) - paddingRight;
        int i6 = this.mOrientation;
        if (i6 == 1) {
            i5 = (i4 - paddingTop) - paddingBottom;
        }
        if (i6 == 0) {
            if (this.mHorizontalStyle == -1) {
                this.mHorizontalStyle = 0;
            }
            if (this.mVerticalStyle == -1) {
                this.mVerticalStyle = 0;
            }
        } else {
            if (this.mHorizontalStyle == -1) {
                this.mHorizontalStyle = 0;
            }
            if (this.mVerticalStyle == -1) {
                this.mVerticalStyle = 0;
            }
        }
        int i7 = this.mWrapMode;
        if (i7 == 0) {
            measureNoWrap(this.mWidgets, this.mOrientation, i5, iArr);
        } else if (i7 == 1) {
            measureChainWrap(this.mWidgets, this.mOrientation, i5, iArr);
        } else if (i7 == 2) {
            measureAligned(this.mWidgets, this.mOrientation, i5, iArr);
        }
        int i8 = iArr[0] + paddingLeft + paddingRight;
        int i9 = iArr[1] + paddingTop + paddingBottom;
        if (i != 1073741824) {
            if (i == Integer.MIN_VALUE) {
                i2 = java.lang.Math.min(i8, i2);
            } else {
                i2 = i == 0 ? i8 : 0;
            }
        }
        if (i3 != 1073741824) {
            if (i3 == Integer.MIN_VALUE) {
                i4 = java.lang.Math.min(i9, i4);
            } else {
                i4 = i3 == 0 ? i9 : 0;
            }
        }
        setMeasure(i2, i4);
        needsCallbackFromSolver(this.mWidgetsCount > 0);
    }

    private class WidgetsList {
        private androidx.constraintlayout.solver.widgets.ConstraintAnchor mBottom;
        private androidx.constraintlayout.solver.widgets.ConstraintAnchor mLeft;
        private int mOrientation;
        private int mPaddingBottom;
        private int mPaddingLeft;
        private int mPaddingRight;
        private int mPaddingTop;
        private androidx.constraintlayout.solver.widgets.ConstraintAnchor mRight;
        private androidx.constraintlayout.solver.widgets.ConstraintAnchor mTop;
        private androidx.constraintlayout.solver.widgets.ConstraintWidget biggest = null;
        int biggestDimension = 0;
        private int mWidth = 0;
        private int mHeight = 0;
        private int mStartIndex = 0;
        private int mCount = 0;

        public WidgetsList(int i, androidx.constraintlayout.solver.widgets.ConstraintAnchor constraintAnchor, androidx.constraintlayout.solver.widgets.ConstraintAnchor constraintAnchor2, androidx.constraintlayout.solver.widgets.ConstraintAnchor constraintAnchor3, androidx.constraintlayout.solver.widgets.ConstraintAnchor constraintAnchor4) {
            this.mOrientation = 0;
            this.mPaddingLeft = 0;
            this.mPaddingTop = 0;
            this.mPaddingRight = 0;
            this.mPaddingBottom = 0;
            this.mOrientation = i;
            this.mLeft = constraintAnchor;
            this.mTop = constraintAnchor2;
            this.mRight = constraintAnchor3;
            this.mBottom = constraintAnchor4;
            this.mPaddingLeft = androidx.constraintlayout.solver.widgets.Flow.this.getPaddingLeft();
            this.mPaddingTop = androidx.constraintlayout.solver.widgets.Flow.this.getPaddingTop();
            this.mPaddingRight = androidx.constraintlayout.solver.widgets.Flow.this.getPaddingRight();
            this.mPaddingBottom = androidx.constraintlayout.solver.widgets.Flow.this.getPaddingBottom();
        }

        public void setup(int i, androidx.constraintlayout.solver.widgets.ConstraintAnchor constraintAnchor, androidx.constraintlayout.solver.widgets.ConstraintAnchor constraintAnchor2, androidx.constraintlayout.solver.widgets.ConstraintAnchor constraintAnchor3, androidx.constraintlayout.solver.widgets.ConstraintAnchor constraintAnchor4, int i2, int i3, int i4, int i5) {
            this.mOrientation = i;
            this.mLeft = constraintAnchor;
            this.mTop = constraintAnchor2;
            this.mRight = constraintAnchor3;
            this.mBottom = constraintAnchor4;
            this.mPaddingLeft = i2;
            this.mPaddingTop = i3;
            this.mPaddingRight = i4;
            this.mPaddingBottom = i5;
        }

        public void clear() {
            this.biggestDimension = 0;
            this.biggest = null;
            this.mWidth = 0;
            this.mHeight = 0;
            this.mStartIndex = 0;
            this.mCount = 0;
        }

        public void setStartIndex(int i) {
            this.mStartIndex = i;
        }

        public int getWidth() {
            if (this.mOrientation == 0) {
                return this.mWidth - androidx.constraintlayout.solver.widgets.Flow.this.mHorizontalGap;
            }
            return this.mWidth;
        }

        public int getHeight() {
            if (this.mOrientation == 1) {
                return this.mHeight - androidx.constraintlayout.solver.widgets.Flow.this.mVerticalGap;
            }
            return this.mHeight;
        }

        public void add(androidx.constraintlayout.solver.widgets.ConstraintWidget constraintWidget) {
            if (this.mOrientation != 0) {
                int widgetWidth = androidx.constraintlayout.solver.widgets.Flow.this.getWidgetWidth(constraintWidget);
                this.mHeight += androidx.constraintlayout.solver.widgets.Flow.this.getWidgetHeight(constraintWidget) + (constraintWidget.getVisibility() != 8 ? androidx.constraintlayout.solver.widgets.Flow.this.mVerticalGap : 0);
                if (this.biggest == null || this.biggestDimension < widgetWidth) {
                    this.biggest = constraintWidget;
                    this.biggestDimension = widgetWidth;
                    this.mWidth = widgetWidth;
                }
            } else {
                this.mWidth += androidx.constraintlayout.solver.widgets.Flow.this.getWidgetWidth(constraintWidget) + (constraintWidget.getVisibility() != 8 ? androidx.constraintlayout.solver.widgets.Flow.this.mHorizontalGap : 0);
                int widgetHeight = androidx.constraintlayout.solver.widgets.Flow.this.getWidgetHeight(constraintWidget);
                if (this.biggest == null || this.biggestDimension < widgetHeight) {
                    this.biggest = constraintWidget;
                    this.biggestDimension = widgetHeight;
                    this.mHeight = widgetHeight;
                }
            }
            this.mCount++;
        }

        public void createConstraints(boolean z, int i, boolean z2) {
            androidx.constraintlayout.solver.widgets.ConstraintWidget constraintWidget;
            int i2 = this.mCount;
            for (int i3 = 0; i3 < i2; i3++) {
                androidx.constraintlayout.solver.widgets.Flow.this.mWidgets[this.mStartIndex + i3].resetAnchors();
            }
            if (i2 == 0 || this.biggest == null) {
                return;
            }
            boolean z3 = z2 && i == 0;
            int i4 = -1;
            int i5 = -1;
            for (int i6 = 0; i6 < i2; i6++) {
                if (androidx.constraintlayout.solver.widgets.Flow.this.mWidgets[this.mStartIndex + (z ? (i2 - 1) - i6 : i6)].getVisibility() == 0) {
                    if (i4 == -1) {
                        i4 = i6;
                    }
                    i5 = i6;
                }
            }
            androidx.constraintlayout.solver.widgets.ConstraintWidget constraintWidget2 = null;
            if (this.mOrientation == 0) {
                androidx.constraintlayout.solver.widgets.ConstraintWidget constraintWidget3 = this.biggest;
                constraintWidget3.setVerticalChainStyle(androidx.constraintlayout.solver.widgets.Flow.this.mVerticalStyle);
                int i7 = this.mPaddingTop;
                if (i > 0) {
                    i7 += androidx.constraintlayout.solver.widgets.Flow.this.mVerticalGap;
                }
                constraintWidget3.mTop.connect(this.mTop, i7);
                if (z2) {
                    constraintWidget3.mBottom.connect(this.mBottom, this.mPaddingBottom);
                }
                if (i > 0) {
                    this.mTop.mOwner.mBottom.connect(constraintWidget3.mTop, 0);
                }
                if (androidx.constraintlayout.solver.widgets.Flow.this.mVerticalAlign != 3 || constraintWidget3.hasBaseline()) {
                    constraintWidget = constraintWidget3;
                    break;
                }
                int i8 = 0;
                while (true) {
                    if (i8 >= i2) {
                        constraintWidget = constraintWidget3;
                        break;
                    }
                    constraintWidget = androidx.constraintlayout.solver.widgets.Flow.this.mWidgets[this.mStartIndex + (z ? (i2 - 1) - i8 : i8)];
                    if (constraintWidget.hasBaseline()) {
                        break;
                    } else {
                        i8++;
                    }
                }
                int i9 = 0;
                while (i9 < i2) {
                    androidx.constraintlayout.solver.widgets.ConstraintWidget constraintWidget4 = androidx.constraintlayout.solver.widgets.Flow.this.mWidgets[this.mStartIndex + (z ? (i2 - 1) - i9 : i9)];
                    if (i9 == 0) {
                        constraintWidget4.connect(constraintWidget4.mLeft, this.mLeft, this.mPaddingLeft);
                        int i10 = androidx.constraintlayout.solver.widgets.Flow.this.mHorizontalStyle;
                        float f = androidx.constraintlayout.solver.widgets.Flow.this.mHorizontalBias;
                        if (this.mStartIndex != 0 || androidx.constraintlayout.solver.widgets.Flow.this.mFirstHorizontalStyle == -1) {
                            if (z2 && androidx.constraintlayout.solver.widgets.Flow.this.mLastHorizontalStyle != -1) {
                                i10 = androidx.constraintlayout.solver.widgets.Flow.this.mLastHorizontalStyle;
                                f = androidx.constraintlayout.solver.widgets.Flow.this.mLastHorizontalBias;
                            }
                        } else {
                            i10 = androidx.constraintlayout.solver.widgets.Flow.this.mFirstHorizontalStyle;
                            f = androidx.constraintlayout.solver.widgets.Flow.this.mFirstHorizontalBias;
                        }
                        constraintWidget4.setHorizontalChainStyle(i10);
                        constraintWidget4.setHorizontalBiasPercent(f);
                    }
                    if (i9 == i2 - 1) {
                        constraintWidget4.connect(constraintWidget4.mRight, this.mRight, this.mPaddingRight);
                    }
                    if (constraintWidget2 != null) {
                        constraintWidget4.mLeft.connect(constraintWidget2.mRight, androidx.constraintlayout.solver.widgets.Flow.this.mHorizontalGap);
                        if (i9 == i4) {
                            constraintWidget4.mLeft.setGoneMargin(this.mPaddingLeft);
                        }
                        constraintWidget2.mRight.connect(constraintWidget4.mLeft, 0);
                        if (i9 == i5 + 1) {
                            constraintWidget2.mRight.setGoneMargin(this.mPaddingRight);
                        }
                    }
                    if (constraintWidget4 != constraintWidget3) {
                        if (androidx.constraintlayout.solver.widgets.Flow.this.mVerticalAlign != 3 || !constraintWidget.hasBaseline() || constraintWidget4 == constraintWidget || !constraintWidget4.hasBaseline()) {
                            int i11 = androidx.constraintlayout.solver.widgets.Flow.this.mVerticalAlign;
                            if (i11 == 0) {
                                constraintWidget4.mTop.connect(constraintWidget3.mTop, 0);
                            } else if (i11 == 1) {
                                constraintWidget4.mBottom.connect(constraintWidget3.mBottom, 0);
                            } else if (z3) {
                                constraintWidget4.mTop.connect(this.mTop, this.mPaddingTop);
                                constraintWidget4.mBottom.connect(this.mBottom, this.mPaddingBottom);
                            } else {
                                constraintWidget4.mTop.connect(constraintWidget3.mTop, 0);
                                constraintWidget4.mBottom.connect(constraintWidget3.mBottom, 0);
                            }
                        } else {
                            constraintWidget4.mBaseline.connect(constraintWidget.mBaseline, 0);
                        }
                    }
                    i9++;
                    constraintWidget2 = constraintWidget4;
                }
                return;
            }
            androidx.constraintlayout.solver.widgets.ConstraintWidget constraintWidget5 = this.biggest;
            constraintWidget5.setHorizontalChainStyle(androidx.constraintlayout.solver.widgets.Flow.this.mVerticalStyle);
            int i12 = this.mPaddingLeft;
            if (i > 0) {
                i12 += androidx.constraintlayout.solver.widgets.Flow.this.mHorizontalGap;
            }
            if (z) {
                constraintWidget5.mRight.connect(this.mRight, i12);
                if (z2) {
                    constraintWidget5.mLeft.connect(this.mLeft, this.mPaddingRight);
                }
                if (i > 0) {
                    this.mRight.mOwner.mLeft.connect(constraintWidget5.mRight, 0);
                }
            } else {
                constraintWidget5.mLeft.connect(this.mLeft, i12);
                if (z2) {
                    constraintWidget5.mRight.connect(this.mRight, this.mPaddingRight);
                }
                if (i > 0) {
                    this.mLeft.mOwner.mRight.connect(constraintWidget5.mLeft, 0);
                }
            }
            int i13 = 0;
            while (i13 < i2) {
                androidx.constraintlayout.solver.widgets.ConstraintWidget constraintWidget6 = androidx.constraintlayout.solver.widgets.Flow.this.mWidgets[this.mStartIndex + i13];
                if (i13 == 0) {
                    constraintWidget6.connect(constraintWidget6.mTop, this.mTop, this.mPaddingTop);
                    int i14 = androidx.constraintlayout.solver.widgets.Flow.this.mVerticalStyle;
                    float f2 = androidx.constraintlayout.solver.widgets.Flow.this.mVerticalBias;
                    if (this.mStartIndex != 0 || androidx.constraintlayout.solver.widgets.Flow.this.mFirstVerticalStyle == -1) {
                        if (z2 && androidx.constraintlayout.solver.widgets.Flow.this.mLastVerticalStyle != -1) {
                            i14 = androidx.constraintlayout.solver.widgets.Flow.this.mLastVerticalStyle;
                            f2 = androidx.constraintlayout.solver.widgets.Flow.this.mLastVerticalBias;
                        }
                    } else {
                        i14 = androidx.constraintlayout.solver.widgets.Flow.this.mFirstVerticalStyle;
                        f2 = androidx.constraintlayout.solver.widgets.Flow.this.mFirstVerticalBias;
                    }
                    constraintWidget6.setVerticalChainStyle(i14);
                    constraintWidget6.setVerticalBiasPercent(f2);
                }
                if (i13 == i2 - 1) {
                    constraintWidget6.connect(constraintWidget6.mBottom, this.mBottom, this.mPaddingBottom);
                }
                if (constraintWidget2 != null) {
                    constraintWidget6.mTop.connect(constraintWidget2.mBottom, androidx.constraintlayout.solver.widgets.Flow.this.mVerticalGap);
                    if (i13 == i4) {
                        constraintWidget6.mTop.setGoneMargin(this.mPaddingTop);
                    }
                    constraintWidget2.mBottom.connect(constraintWidget6.mTop, 0);
                    if (i13 == i5 + 1) {
                        constraintWidget2.mBottom.setGoneMargin(this.mPaddingBottom);
                    }
                }
                if (constraintWidget6 != constraintWidget5) {
                    if (z) {
                        int i15 = androidx.constraintlayout.solver.widgets.Flow.this.mHorizontalAlign;
                        if (i15 == 0) {
                            constraintWidget6.mRight.connect(constraintWidget5.mRight, 0);
                        } else if (i15 == 1) {
                            constraintWidget6.mLeft.connect(constraintWidget5.mLeft, 0);
                        } else if (i15 == 2) {
                            constraintWidget6.mLeft.connect(constraintWidget5.mLeft, 0);
                            constraintWidget6.mRight.connect(constraintWidget5.mRight, 0);
                        }
                    } else {
                        int i16 = androidx.constraintlayout.solver.widgets.Flow.this.mHorizontalAlign;
                        if (i16 == 0) {
                            constraintWidget6.mLeft.connect(constraintWidget5.mLeft, 0);
                        } else if (i16 == 1) {
                            constraintWidget6.mRight.connect(constraintWidget5.mRight, 0);
                        } else if (i16 == 2) {
                            if (z3) {
                                constraintWidget6.mLeft.connect(this.mLeft, this.mPaddingLeft);
                                constraintWidget6.mRight.connect(this.mRight, this.mPaddingRight);
                            } else {
                                constraintWidget6.mLeft.connect(constraintWidget5.mLeft, 0);
                                constraintWidget6.mRight.connect(constraintWidget5.mRight, 0);
                            }
                        }
                    }
                }
                i13++;
                constraintWidget2 = constraintWidget6;
            }
        }
    }

    private void measureChainWrap(androidx.constraintlayout.solver.widgets.ConstraintWidget[] constraintWidgetArr, int i, int i2, int[] iArr) {
        int i3;
        int i4;
        androidx.constraintlayout.solver.widgets.ConstraintAnchor constraintAnchor;
        int paddingRight;
        androidx.constraintlayout.solver.widgets.ConstraintAnchor constraintAnchor2;
        androidx.constraintlayout.solver.widgets.ConstraintAnchor constraintAnchor3;
        int paddingBottom;
        int i5;
        int i6 = this.mWidgetsCount;
        if (i6 == 0) {
            return;
        }
        this.mChainList.clear();
        androidx.constraintlayout.solver.widgets.Flow.WidgetsList widgetsList = new androidx.constraintlayout.solver.widgets.Flow.WidgetsList(i, this.mLeft, this.mTop, this.mRight, this.mBottom);
        this.mChainList.add(widgetsList);
        if (i == 0) {
            int i7 = this.mHorizontalGap * 2;
            for (int i8 = 0; i8 < i6; i8++) {
                androidx.constraintlayout.solver.widgets.ConstraintWidget constraintWidget = constraintWidgetArr[i8];
                int widgetWidth = getWidgetWidth(constraintWidget);
                boolean z = (i7 + widgetWidth) + this.mHorizontalGap > i2 && widgetsList.biggest != null;
                if (!z && i8 > 0 && (i5 = this.mMaxElementsWrap) > 0 && i8 % i5 == 0) {
                    z = true;
                }
                if (z) {
                    int i9 = this.mHorizontalGap * 2;
                    androidx.constraintlayout.solver.widgets.Flow.WidgetsList widgetsList2 = new androidx.constraintlayout.solver.widgets.Flow.WidgetsList(i, this.mLeft, this.mTop, this.mRight, this.mBottom);
                    widgetsList2.setStartIndex(i8);
                    this.mChainList.add(widgetsList2);
                    i7 = i9;
                    widgetsList = widgetsList2;
                }
                i7 += widgetWidth + this.mHorizontalGap;
                widgetsList.add(constraintWidget);
            }
        } else {
            int i10 = this.mVerticalGap * 2;
            for (int i11 = 0; i11 < i6; i11++) {
                androidx.constraintlayout.solver.widgets.ConstraintWidget constraintWidget2 = constraintWidgetArr[i11];
                int widgetHeight = getWidgetHeight(constraintWidget2);
                boolean z2 = (i10 + widgetHeight) + this.mVerticalGap > i2 && widgetsList.biggest != null;
                if (!z2 && i11 > 0 && (i3 = this.mMaxElementsWrap) > 0 && i11 % i3 == 0) {
                    z2 = true;
                }
                if (z2) {
                    int i12 = this.mVerticalGap * 2;
                    androidx.constraintlayout.solver.widgets.Flow.WidgetsList widgetsList3 = new androidx.constraintlayout.solver.widgets.Flow.WidgetsList(i, this.mLeft, this.mTop, this.mRight, this.mBottom);
                    widgetsList3.setStartIndex(i11);
                    this.mChainList.add(widgetsList3);
                    i10 = i12;
                    widgetsList = widgetsList3;
                }
                i10 += widgetHeight;
                widgetsList.add(constraintWidget2);
            }
        }
        int size = this.mChainList.size();
        androidx.constraintlayout.solver.widgets.ConstraintAnchor constraintAnchor4 = this.mLeft;
        androidx.constraintlayout.solver.widgets.ConstraintAnchor constraintAnchor5 = this.mTop;
        androidx.constraintlayout.solver.widgets.ConstraintAnchor constraintAnchor6 = this.mRight;
        androidx.constraintlayout.solver.widgets.ConstraintAnchor constraintAnchor7 = this.mBottom;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int height = 0;
        int width = 0;
        int i13 = 0;
        androidx.constraintlayout.solver.widgets.ConstraintAnchor constraintAnchor8 = constraintAnchor4;
        androidx.constraintlayout.solver.widgets.ConstraintAnchor constraintAnchor9 = constraintAnchor5;
        int paddingRight2 = getPaddingRight();
        int paddingBottom2 = getPaddingBottom();
        while (i13 < size) {
            androidx.constraintlayout.solver.widgets.Flow.WidgetsList widgetsList4 = this.mChainList.get(i13);
            if (i == 0) {
                if (i13 < size - 1) {
                    constraintAnchor3 = this.mChainList.get(i13 + 1).biggest.mTop;
                    paddingBottom = 0;
                } else {
                    constraintAnchor3 = this.mBottom;
                    paddingBottom = getPaddingBottom();
                }
                androidx.constraintlayout.solver.widgets.ConstraintAnchor constraintAnchor10 = constraintAnchor6;
                androidx.constraintlayout.solver.widgets.ConstraintAnchor constraintAnchor11 = constraintAnchor3;
                constraintAnchor2 = widgetsList4.biggest.mBottom;
                i4 = i13;
                widgetsList4.setup(i, constraintAnchor8, constraintAnchor9, constraintAnchor6, constraintAnchor3, paddingLeft, paddingTop, paddingRight2, paddingBottom);
                int iMax = java.lang.Math.max(width, widgetsList4.getWidth());
                height += widgetsList4.getHeight();
                if (i4 > 0) {
                    height += this.mVerticalGap;
                }
                constraintAnchor6 = constraintAnchor10;
                width = iMax;
                paddingBottom2 = paddingBottom;
                paddingTop = 0;
                constraintAnchor7 = constraintAnchor11;
            } else {
                int i14 = paddingBottom2;
                androidx.constraintlayout.solver.widgets.ConstraintAnchor constraintAnchor12 = constraintAnchor9;
                int i15 = height;
                int i16 = width;
                i4 = i13;
                if (i4 < size - 1) {
                    constraintAnchor = this.mChainList.get(i4 + 1).biggest.mLeft;
                    paddingRight = 0;
                } else {
                    constraintAnchor = this.mRight;
                    paddingRight = getPaddingRight();
                }
                constraintAnchor8 = widgetsList4.biggest.mRight;
                widgetsList4.setup(i, constraintAnchor8, constraintAnchor12, constraintAnchor, constraintAnchor7, paddingLeft, paddingTop, paddingRight, i14);
                width = i16 + widgetsList4.getWidth();
                int iMax2 = java.lang.Math.max(i15, widgetsList4.getHeight());
                if (i4 > 0) {
                    width += this.mHorizontalGap;
                }
                height = iMax2;
                paddingBottom2 = i14;
                constraintAnchor6 = constraintAnchor;
                paddingLeft = 0;
                constraintAnchor2 = constraintAnchor12;
                paddingRight2 = paddingRight;
            }
            i13 = i4 + 1;
            constraintAnchor9 = constraintAnchor2;
        }
        iArr[0] = width;
        iArr[1] = height;
    }

    private void measureNoWrap(androidx.constraintlayout.solver.widgets.ConstraintWidget[] constraintWidgetArr, int i, int i2, int[] iArr) {
        androidx.constraintlayout.solver.widgets.Flow.WidgetsList widgetsList;
        int i3 = this.mWidgetsCount;
        if (i3 == 0) {
            return;
        }
        if (this.mChainList.size() == 0) {
            widgetsList = new androidx.constraintlayout.solver.widgets.Flow.WidgetsList(i, this.mLeft, this.mTop, this.mRight, this.mBottom);
            this.mChainList.add(widgetsList);
        } else {
            androidx.constraintlayout.solver.widgets.Flow.WidgetsList widgetsList2 = this.mChainList.get(0);
            widgetsList2.clear();
            widgetsList = widgetsList2;
            widgetsList.setup(i, this.mLeft, this.mTop, this.mRight, this.mBottom, getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        for (int i4 = 0; i4 < i3; i4++) {
            widgetsList.add(constraintWidgetArr[i4]);
        }
        iArr[0] = widgetsList.getWidth();
        iArr[1] = widgetsList.getHeight();
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0106 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:102:0x0108  */
    /* JADX WARN: Code duplicated, block: B:108:0x011b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:111:0x0123 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:119:0x0129 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:120:0x0121 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:121:0x005d A[ADDED_TO_REGION, EDGE_INSN: B:121:0x005d->B:44:0x005d BREAK  A[LOOP:1: B:46:0x0060->B:126:0x0060], REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:123:0x0119 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:124:0x005d A[ADDED_TO_REGION, EDGE_INSN: B:124:0x005d->B:44:0x005d BREAK  A[LOOP:1: B:46:0x0060->B:126:0x0060], REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:134:0x00df A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:138:0x00f9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:141:0x0110 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x0062 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:48:0x0064  */
    /* JADX WARN: Code duplicated, block: B:49:0x0070  */
    /* JADX WARN: Code duplicated, block: B:52:0x0080  */
    /* JADX WARN: Code duplicated, block: B:56:0x0088  */
    /* JADX WARN: Code duplicated, block: B:59:0x0090  */
    /* JADX WARN: Code duplicated, block: B:63:0x0098  */
    /* JADX WARN: Code duplicated, block: B:66:0x009f  */
    /* JADX WARN: Code duplicated, block: B:68:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:70:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:74:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:79:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:81:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:84:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:86:0x00db  */
    /* JADX WARN: Code duplicated, block: B:91:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:93:0x00ef A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:94:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:99:0x0100  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:107:0x0119 -> B:44:0x005d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:108:0x011b -> B:44:0x005d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:110:0x0121 -> B:44:0x005d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:111:0x0123 -> B:44:0x005d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:108:0x011b
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private void measureAligned(androidx.constraintlayout.solver.widgets.ConstraintWidget[] r12, int r13, int r14, int[] r15) {
        /*
            Method dump skipped, instruction units count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.widgets.Flow.measureAligned(androidx.constraintlayout.solver.widgets.ConstraintWidget[], int, int, int[]):void");
    }

    private void createAlignedConstraints(boolean z) {
        androidx.constraintlayout.solver.widgets.ConstraintWidget constraintWidget;
        if (this.mAlignedDimensions == null || this.mAlignedBiggestElementsInCols == null || this.mAlignedBiggestElementsInRows == null) {
            return;
        }
        for (int i = 0; i < this.mWidgetsCount; i++) {
            this.mWidgets[i].resetAnchors();
        }
        int[] iArr = this.mAlignedDimensions;
        int i2 = iArr[0];
        int i3 = iArr[1];
        androidx.constraintlayout.solver.widgets.ConstraintWidget constraintWidget2 = null;
        for (int i4 = 0; i4 < i2; i4++) {
            androidx.constraintlayout.solver.widgets.ConstraintWidget constraintWidget3 = this.mAlignedBiggestElementsInCols[z ? (i2 - i4) - 1 : i4];
            if (constraintWidget3 != null) {
                if (i4 == 0) {
                    constraintWidget3.connect(constraintWidget3.mLeft, this.mLeft, getPaddingLeft());
                    constraintWidget3.setHorizontalChainStyle(this.mHorizontalStyle);
                    constraintWidget3.setHorizontalBiasPercent(this.mHorizontalBias);
                }
                if (i4 == i2 - 1) {
                    constraintWidget3.connect(constraintWidget3.mRight, this.mRight, getPaddingRight());
                }
                if (i4 > 0) {
                    constraintWidget3.connect(constraintWidget3.mLeft, constraintWidget2.mRight, this.mHorizontalGap);
                    constraintWidget2.connect(constraintWidget2.mRight, constraintWidget3.mLeft, 0);
                }
                constraintWidget2 = constraintWidget3;
            }
        }
        for (int i5 = 0; i5 < i3; i5++) {
            androidx.constraintlayout.solver.widgets.ConstraintWidget constraintWidget4 = this.mAlignedBiggestElementsInRows[i5];
            if (constraintWidget4 != null) {
                if (i5 == 0) {
                    constraintWidget4.connect(constraintWidget4.mTop, this.mTop, getPaddingTop());
                    constraintWidget4.setVerticalChainStyle(this.mVerticalStyle);
                    constraintWidget4.setVerticalBiasPercent(this.mVerticalBias);
                }
                if (i5 == i3 - 1) {
                    constraintWidget4.connect(constraintWidget4.mBottom, this.mBottom, getPaddingBottom());
                }
                if (i5 > 0) {
                    constraintWidget4.connect(constraintWidget4.mTop, constraintWidget2.mBottom, this.mVerticalGap);
                    constraintWidget2.connect(constraintWidget2.mBottom, constraintWidget4.mTop, 0);
                }
                constraintWidget2 = constraintWidget4;
            }
        }
        for (int i6 = 0; i6 < i2; i6++) {
            for (int i7 = 0; i7 < i3; i7++) {
                int i8 = (i7 * i2) + i6;
                if (this.mOrientation == 1) {
                    i8 = (i6 * i3) + i7;
                }
                if (i8 < this.mWidgets.length && (constraintWidget = this.mWidgets[i8]) != null) {
                    androidx.constraintlayout.solver.widgets.ConstraintWidget constraintWidget5 = this.mAlignedBiggestElementsInCols[i6];
                    androidx.constraintlayout.solver.widgets.ConstraintWidget constraintWidget6 = this.mAlignedBiggestElementsInRows[i7];
                    if (constraintWidget != constraintWidget5) {
                        constraintWidget.connect(constraintWidget.mLeft, constraintWidget5.mLeft, 0);
                        constraintWidget.connect(constraintWidget.mRight, constraintWidget5.mRight, 0);
                    }
                    if (constraintWidget != constraintWidget6) {
                        constraintWidget.connect(constraintWidget.mTop, constraintWidget6.mTop, 0);
                        constraintWidget.connect(constraintWidget.mBottom, constraintWidget6.mBottom, 0);
                    }
                }
            }
        }
    }

    @Override // androidx.constraintlayout.solver.widgets.ConstraintWidget
    public void addToSolver(androidx.constraintlayout.solver.LinearSystem linearSystem) {
        super.addToSolver(linearSystem);
        boolean zIsRtl = getParent() != null ? ((androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer) getParent()).isRtl() : false;
        int i = this.mWrapMode;
        if (i != 0) {
            if (i == 1) {
                int size = this.mChainList.size();
                int i2 = 0;
                while (i2 < size) {
                    this.mChainList.get(i2).createConstraints(zIsRtl, i2, i2 == size + (-1));
                    i2++;
                }
            } else if (i == 2) {
                createAlignedConstraints(zIsRtl);
            }
        } else if (this.mChainList.size() > 0) {
            this.mChainList.get(0).createConstraints(zIsRtl, 0, true);
        }
        needsCallbackFromSolver(false);
    }
}
