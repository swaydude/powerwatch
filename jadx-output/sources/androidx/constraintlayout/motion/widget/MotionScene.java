package androidx.constraintlayout.motion.widget;

/* JADX INFO: loaded from: classes.dex */
public class MotionScene {
    static final int ANTICIPATE = 4;
    static final int BOUNCE = 5;
    private static final boolean DEBUG = false;
    static final int EASE_IN = 1;
    static final int EASE_IN_OUT = 0;
    static final int EASE_OUT = 2;
    private static final int INTERPOLATOR_REFRENCE_ID = -2;
    static final int LINEAR = 3;
    private static final int SPLINE_STRING = -1;
    public static final java.lang.String TAG = "MotionScene";
    static final int TRANSITION_BACKWARD = 0;
    static final int TRANSITION_FORWARD = 1;
    public static final int UNSET = -1;
    private android.view.MotionEvent mLastTouchDown;
    float mLastTouchX;
    float mLastTouchY;
    private final androidx.constraintlayout.motion.widget.MotionLayout mMotionLayout;
    private android.view.VelocityTracker mVelocityTracker;
    androidx.constraintlayout.widget.StateSet mStateSet = null;
    androidx.constraintlayout.motion.widget.MotionScene.Transition mCurrentTransition = null;
    private java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionScene.Transition> mTransitionList = new java.util.ArrayList<>();
    private android.util.SparseArray<androidx.constraintlayout.widget.ConstraintSet> mConstraintSetMap = new android.util.SparseArray<>();
    private android.util.SparseIntArray mDeriveMap = new android.util.SparseIntArray();
    private boolean DEBUG_DESKTOP = false;
    private int mDefaultDuration = 100;
    private boolean mMotionOutsideRegion = false;

    public float getPathPercent(android.view.View view, int i) {
        return 0.0f;
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0024  */
    void setTransition(int i, int i2) {
        int iStateGetConstraintID;
        int iStateGetConstraintID2;
        androidx.constraintlayout.widget.StateSet stateSet = this.mStateSet;
        if (stateSet != null) {
            iStateGetConstraintID = stateSet.stateGetConstraintID(i, -1, -1);
            if (iStateGetConstraintID == -1) {
                iStateGetConstraintID = i;
            }
            iStateGetConstraintID2 = this.mStateSet.stateGetConstraintID(i2, -1, -1);
            if (iStateGetConstraintID2 == -1) {
            }
            for (androidx.constraintlayout.motion.widget.MotionScene.Transition transition : this.mTransitionList) {
                if ((transition.mConstraintSetEnd != iStateGetConstraintID2 && transition.mConstraintSetStart == iStateGetConstraintID) || (transition.mConstraintSetEnd == i2 && transition.mConstraintSetStart == i)) {
                    this.mCurrentTransition = transition;
                    return;
                }
            }
            androidx.constraintlayout.motion.widget.MotionScene.Transition transition2 = new androidx.constraintlayout.motion.widget.MotionScene.Transition(this);
            transition2.mConstraintSetStart = iStateGetConstraintID;
            transition2.mConstraintSetEnd = iStateGetConstraintID2;
            transition2.mDuration = this.mDefaultDuration;
            this.mTransitionList.add(transition2);
            this.mCurrentTransition = transition2;
        }
        iStateGetConstraintID = i;
        iStateGetConstraintID2 = i2;
        while (r1.hasNext()) {
            if (transition.mConstraintSetEnd != iStateGetConstraintID2) {
            }
            this.mCurrentTransition = transition;
            return;
        }
        androidx.constraintlayout.motion.widget.MotionScene.Transition transition3 = new androidx.constraintlayout.motion.widget.MotionScene.Transition(this);
        transition3.mConstraintSetStart = iStateGetConstraintID;
        transition3.mConstraintSetEnd = iStateGetConstraintID2;
        transition3.mDuration = this.mDefaultDuration;
        this.mTransitionList.add(transition3);
        this.mCurrentTransition = transition3;
    }

    public void addTransition(androidx.constraintlayout.motion.widget.MotionScene.Transition transition) {
        int index = getIndex(transition);
        if (index == -1) {
            this.mTransitionList.add(transition);
        } else {
            this.mTransitionList.set(index, transition);
        }
    }

    public void removeTransition(androidx.constraintlayout.motion.widget.MotionScene.Transition transition) {
        int index = getIndex(transition);
        if (index != -1) {
            this.mTransitionList.remove(index);
        }
    }

    private int getIndex(androidx.constraintlayout.motion.widget.MotionScene.Transition transition) {
        int i = transition.mId;
        if (i == -1) {
            throw new java.lang.IllegalArgumentException("The transition must have an id");
        }
        for (int i2 = 0; i2 < this.mTransitionList.size(); i2++) {
            if (this.mTransitionList.get(i2).mId == i) {
                return i2;
            }
        }
        return -1;
    }

    public boolean validateLayout(androidx.constraintlayout.motion.widget.MotionLayout motionLayout) {
        return motionLayout == this.mMotionLayout && motionLayout.mScene == this;
    }

    public void setTransition(androidx.constraintlayout.motion.widget.MotionScene.Transition transition) {
        this.mCurrentTransition = transition;
    }

    private int getRealID(int i) {
        int iStateGetConstraintID;
        androidx.constraintlayout.widget.StateSet stateSet = this.mStateSet;
        return (stateSet == null || (iStateGetConstraintID = stateSet.stateGetConstraintID(i, -1, -1)) == -1) ? i : iStateGetConstraintID;
    }

    public java.util.List<androidx.constraintlayout.motion.widget.MotionScene.Transition> getTransitionsWithState(int i) {
        int realID = getRealID(i);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (androidx.constraintlayout.motion.widget.MotionScene.Transition transition : this.mTransitionList) {
            if (transition.mConstraintSetStart == realID || transition.mConstraintSetEnd == realID) {
                arrayList.add(transition);
            }
        }
        return arrayList;
    }

    public void addOnClickListeners(androidx.constraintlayout.motion.widget.MotionLayout motionLayout, int i) {
        for (androidx.constraintlayout.motion.widget.MotionScene.Transition transition : this.mTransitionList) {
            if (transition.mOnClicks.size() > 0) {
                for (androidx.constraintlayout.motion.widget.MotionScene.Transition.TransitionOnClick transitionOnClick : transition.mOnClicks) {
                    if (i == transition.mConstraintSetStart || i == transition.mConstraintSetEnd) {
                        transitionOnClick.addOnClickListeners(motionLayout);
                    } else {
                        transitionOnClick.removeOnClickListeners(motionLayout);
                    }
                }
            }
        }
    }

    public androidx.constraintlayout.motion.widget.MotionScene.Transition bestTransitionFor(int i, float f, float f2, android.view.MotionEvent motionEvent) {
        android.graphics.RectF touchRegion;
        if (i != -1) {
            java.util.List<androidx.constraintlayout.motion.widget.MotionScene.Transition> transitionsWithState = getTransitionsWithState(i);
            float f3 = 0.0f;
            androidx.constraintlayout.motion.widget.MotionScene.Transition transition = null;
            android.graphics.RectF rectF = new android.graphics.RectF();
            for (androidx.constraintlayout.motion.widget.MotionScene.Transition transition2 : transitionsWithState) {
                if (!transition2.mDisable && transition2.mTouchResponse != null && ((touchRegion = transition2.mTouchResponse.getTouchRegion(this.mMotionLayout, rectF)) == null || touchRegion.contains(motionEvent.getX(), motionEvent.getY()))) {
                    float fDot = transition2.mTouchResponse.dot(f, f2);
                    if (transition2.mConstraintSetEnd == i) {
                        fDot *= -1.0f;
                    }
                    if (fDot > f3) {
                        transition = transition2;
                        f3 = fDot;
                    }
                }
            }
            return transition;
        }
        return this.mCurrentTransition;
    }

    public java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionScene.Transition> getDefinedTransitions() {
        return this.mTransitionList;
    }

    public androidx.constraintlayout.motion.widget.MotionScene.Transition getTransitionById(int i) {
        for (androidx.constraintlayout.motion.widget.MotionScene.Transition transition : this.mTransitionList) {
            if (transition.mId == i) {
                return transition;
            }
        }
        return null;
    }

    public int[] getConstraintSetIds() {
        int size = this.mConstraintSetMap.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = this.mConstraintSetMap.keyAt(i);
        }
        return iArr;
    }

    boolean autoTransition(androidx.constraintlayout.motion.widget.MotionLayout motionLayout, int i) {
        if (isProcessingTouch()) {
            return false;
        }
        for (androidx.constraintlayout.motion.widget.MotionScene.Transition transition : this.mTransitionList) {
            if (transition.mConstraintSetStart != 0) {
                if (i == transition.mConstraintSetStart && (transition.mAutoTransition == 4 || transition.mAutoTransition == 2)) {
                    motionLayout.setTransition(transition);
                    if (transition.mAutoTransition == 4) {
                        motionLayout.transitionToEnd();
                    } else {
                        motionLayout.setProgress(1.0f);
                    }
                    return true;
                }
                if (i == transition.mConstraintSetEnd && (transition.mAutoTransition == 3 || transition.mAutoTransition == 1)) {
                    motionLayout.setTransition(transition);
                    if (transition.mAutoTransition == 3) {
                        motionLayout.transitionToStart();
                    } else {
                        motionLayout.setProgress(0.0f);
                    }
                    return true;
                }
            }
        }
        return false;
    }

    private boolean isProcessingTouch() {
        return this.mVelocityTracker != null;
    }

    public static class Transition {
        public static final int AUTO_ANIMATE_TO_END = 4;
        public static final int AUTO_ANIMATE_TO_START = 3;
        public static final int AUTO_JUMP_TO_END = 2;
        public static final int AUTO_JUMP_TO_START = 1;
        public static final int AUTO_NONE = 0;
        private int mAutoTransition;
        private int mConstraintSetEnd;
        private int mConstraintSetStart;
        private int mDefaultInterpolator;
        private int mDefaultInterpolatorID;
        private java.lang.String mDefaultInterpolatorString;
        private boolean mDisable;
        private int mDuration;
        private int mId;
        private java.util.ArrayList<androidx.constraintlayout.motion.widget.KeyFrames> mKeyFramesList;
        private final androidx.constraintlayout.motion.widget.MotionScene mMotionScene;
        private java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionScene.Transition.TransitionOnClick> mOnClicks;
        private float mStagger;
        private androidx.constraintlayout.motion.widget.TouchResponse mTouchResponse;

        public void addOnClick(android.content.Context context, org.xmlpull.v1.XmlPullParser xmlPullParser) {
            this.mOnClicks.add(new androidx.constraintlayout.motion.widget.MotionScene.Transition.TransitionOnClick(context, this, xmlPullParser));
        }

        public int getEndConstraintSetId() {
            return this.mConstraintSetEnd;
        }

        public int getStartConstraintSetId() {
            return this.mConstraintSetStart;
        }

        public void setDuration(int i) {
            this.mDuration = i;
        }

        public int getDuration() {
            return this.mDuration;
        }

        public float getStagger() {
            return this.mStagger;
        }

        public java.util.List<androidx.constraintlayout.motion.widget.KeyFrames> getKeyFrameList() {
            return this.mKeyFramesList;
        }

        public java.util.List<androidx.constraintlayout.motion.widget.MotionScene.Transition.TransitionOnClick> getOnClickList() {
            return this.mOnClicks;
        }

        public androidx.constraintlayout.motion.widget.TouchResponse getTouchResponse() {
            return this.mTouchResponse;
        }

        public void setStagger(float f) {
            this.mStagger = f;
        }

        public boolean isEnabled() {
            return !this.mDisable;
        }

        public void setEnable(boolean z) {
            this.mDisable = !z;
        }

        public java.lang.String debugString(android.content.Context context) {
            return (this.mConstraintSetEnd == -1 ? "null" : context.getResources().getResourceEntryName(this.mConstraintSetStart)) + " -> " + context.getResources().getResourceEntryName(this.mConstraintSetEnd);
        }

        static class TransitionOnClick implements android.view.View.OnClickListener {
            public static final int ANIM_TOGGLE = 17;
            public static final int ANIM_TO_END = 1;
            public static final int ANIM_TO_START = 16;
            public static final int JUMP_TO_END = 256;
            public static final int JUMP_TO_START = 4096;
            int mMode;
            int mTargetId;
            private final androidx.constraintlayout.motion.widget.MotionScene.Transition mTransition;

            public TransitionOnClick(android.content.Context context, androidx.constraintlayout.motion.widget.MotionScene.Transition transition, org.xmlpull.v1.XmlPullParser xmlPullParser) {
                this.mTargetId = -1;
                this.mMode = 17;
                this.mTransition = transition;
                android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(android.util.Xml.asAttributeSet(xmlPullParser), androidx.constraintlayout.widget.R.styleable.OnClick);
                int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
                for (int i = 0; i < indexCount; i++) {
                    int index = typedArrayObtainStyledAttributes.getIndex(i);
                    if (index == androidx.constraintlayout.widget.R.styleable.OnClick_targetId) {
                        this.mTargetId = typedArrayObtainStyledAttributes.getResourceId(index, this.mTargetId);
                    } else if (index == androidx.constraintlayout.widget.R.styleable.OnClick_clickAction) {
                        this.mMode = typedArrayObtainStyledAttributes.getInt(index, this.mMode);
                    }
                }
                typedArrayObtainStyledAttributes.recycle();
            }

            public void addOnClickListeners(androidx.constraintlayout.motion.widget.MotionLayout motionLayout) {
                android.view.View viewFindViewById;
                int i = this.mTargetId;
                androidx.constraintlayout.motion.widget.MotionLayout motionLayout2 = motionLayout;
                if (i != -1) {
                    viewFindViewById = motionLayout.findViewById(i);
                }
                if (motionLayout2 == null) {
                    motionLayout2 = viewFindViewById;
                    android.util.Log.e(androidx.constraintlayout.motion.widget.MotionScene.TAG, " (*)  could not find id " + this.mTargetId);
                    return;
                }
                motionLayout2 = viewFindViewById;
                motionLayout2.setOnClickListener(this);
            }

            public void removeOnClickListeners(androidx.constraintlayout.motion.widget.MotionLayout motionLayout) {
                android.view.View viewFindViewById = motionLayout.findViewById(this.mTargetId);
                if (viewFindViewById == null) {
                    android.util.Log.e(androidx.constraintlayout.motion.widget.MotionScene.TAG, " (*)  could not find id " + this.mTargetId);
                    return;
                }
                viewFindViewById.setOnClickListener(null);
            }

            boolean isTransitionViable(androidx.constraintlayout.motion.widget.MotionScene.Transition transition, boolean z, androidx.constraintlayout.motion.widget.MotionLayout motionLayout) {
                androidx.constraintlayout.motion.widget.MotionScene.Transition transition2 = this.mTransition;
                if (transition2 == transition) {
                    return true;
                }
                int i = z ? transition2.mConstraintSetEnd : transition2.mConstraintSetStart;
                int i2 = z ? this.mTransition.mConstraintSetStart : this.mTransition.mConstraintSetEnd;
                if (motionLayout.getProgress() == 0.0f) {
                    return motionLayout.mCurrentState == i2;
                }
                return motionLayout.getProgress() == 1.0f && motionLayout.mCurrentState == i;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view) {
                androidx.constraintlayout.motion.widget.MotionLayout motionLayout = this.mTransition.mMotionScene.mMotionLayout;
                androidx.constraintlayout.motion.widget.MotionScene.Transition transition = this.mTransition.mMotionScene.mCurrentTransition;
                int i = this.mMode;
                boolean z = ((i & 1) == 0 && (i & 256) == 0) ? false : true;
                boolean z2 = ((i & 16) == 0 && (i & 4096) == 0) ? false : true;
                if (z && z2) {
                    androidx.constraintlayout.motion.widget.MotionScene.Transition transition2 = this.mTransition.mMotionScene.mCurrentTransition;
                    androidx.constraintlayout.motion.widget.MotionScene.Transition transition3 = this.mTransition;
                    if (transition2 != transition3) {
                        motionLayout.setTransition(transition3);
                    }
                    if (motionLayout.getCurrentState() == motionLayout.getEndState() || motionLayout.getProgress() > 0.5f) {
                        z = false;
                    } else {
                        z2 = false;
                    }
                }
                if (z) {
                    if (isTransitionViable(transition, true, motionLayout) && (this.mMode & 1) != 0) {
                        motionLayout.transitionToEnd();
                        return;
                    } else {
                        motionLayout.setProgress(1.0f);
                        return;
                    }
                }
                if (z2) {
                    if (isTransitionViable(transition, false, motionLayout) && (this.mMode & 16) != 0) {
                        motionLayout.transitionToStart();
                    } else {
                        motionLayout.setProgress(0.0f);
                    }
                }
            }
        }

        Transition(androidx.constraintlayout.motion.widget.MotionScene motionScene) {
            this.mId = -1;
            this.mConstraintSetEnd = 0;
            this.mConstraintSetStart = 0;
            this.mDefaultInterpolator = 0;
            this.mDefaultInterpolatorString = null;
            this.mDefaultInterpolatorID = -1;
            this.mDuration = 400;
            this.mStagger = 0.0f;
            this.mKeyFramesList = new java.util.ArrayList<>();
            this.mTouchResponse = null;
            this.mOnClicks = new java.util.ArrayList<>();
            this.mAutoTransition = 0;
            this.mDisable = false;
            this.mMotionScene = motionScene;
        }

        public Transition(int i, androidx.constraintlayout.motion.widget.MotionScene motionScene, int i2, int i3) {
            this.mId = -1;
            this.mConstraintSetEnd = 0;
            this.mConstraintSetStart = 0;
            this.mDefaultInterpolator = 0;
            this.mDefaultInterpolatorString = null;
            this.mDefaultInterpolatorID = -1;
            this.mDuration = 400;
            this.mStagger = 0.0f;
            this.mKeyFramesList = new java.util.ArrayList<>();
            this.mTouchResponse = null;
            this.mOnClicks = new java.util.ArrayList<>();
            this.mAutoTransition = 0;
            this.mDisable = false;
            this.mId = i;
            this.mMotionScene = motionScene;
            this.mConstraintSetStart = i2;
            this.mConstraintSetEnd = i3;
        }

        Transition(androidx.constraintlayout.motion.widget.MotionScene motionScene, android.content.Context context, org.xmlpull.v1.XmlPullParser xmlPullParser) {
            this.mId = -1;
            this.mConstraintSetEnd = 0;
            this.mConstraintSetStart = 0;
            this.mDefaultInterpolator = 0;
            this.mDefaultInterpolatorString = null;
            this.mDefaultInterpolatorID = -1;
            this.mDuration = 400;
            this.mStagger = 0.0f;
            this.mKeyFramesList = new java.util.ArrayList<>();
            this.mTouchResponse = null;
            this.mOnClicks = new java.util.ArrayList<>();
            this.mAutoTransition = 0;
            this.mDisable = false;
            this.mDuration = motionScene.mDefaultDuration;
            this.mMotionScene = motionScene;
            fillFromAttributeList(motionScene, context, android.util.Xml.asAttributeSet(xmlPullParser));
        }

        private void fillFromAttributeList(androidx.constraintlayout.motion.widget.MotionScene motionScene, android.content.Context context, android.util.AttributeSet attributeSet) {
            android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.R.styleable.Transition);
            fill(motionScene, context, typedArrayObtainStyledAttributes);
            typedArrayObtainStyledAttributes.recycle();
        }

        private void fill(androidx.constraintlayout.motion.widget.MotionScene motionScene, android.content.Context context, android.content.res.TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArray.getIndex(i);
                if (index == androidx.constraintlayout.widget.R.styleable.Transition_constraintSetEnd) {
                    this.mConstraintSetEnd = typedArray.getResourceId(index, this.mConstraintSetEnd);
                    if ("layout".equals(context.getResources().getResourceTypeName(this.mConstraintSetEnd))) {
                        androidx.constraintlayout.widget.ConstraintSet constraintSet = new androidx.constraintlayout.widget.ConstraintSet();
                        constraintSet.load(context, this.mConstraintSetEnd);
                        motionScene.mConstraintSetMap.append(this.mConstraintSetEnd, constraintSet);
                    }
                } else if (index == androidx.constraintlayout.widget.R.styleable.Transition_constraintSetStart) {
                    this.mConstraintSetStart = typedArray.getResourceId(index, this.mConstraintSetStart);
                    if ("layout".equals(context.getResources().getResourceTypeName(this.mConstraintSetStart))) {
                        androidx.constraintlayout.widget.ConstraintSet constraintSet2 = new androidx.constraintlayout.widget.ConstraintSet();
                        constraintSet2.load(context, this.mConstraintSetStart);
                        motionScene.mConstraintSetMap.append(this.mConstraintSetStart, constraintSet2);
                    }
                } else if (index == androidx.constraintlayout.widget.R.styleable.Transition_motionInterpolator) {
                    android.util.TypedValue typedValuePeekValue = typedArray.peekValue(index);
                    if (typedValuePeekValue.type == 1) {
                        int resourceId = typedArray.getResourceId(index, -1);
                        this.mDefaultInterpolatorID = resourceId;
                        if (resourceId != -1) {
                            this.mDefaultInterpolator = -2;
                        }
                    } else if (typedValuePeekValue.type == 3) {
                        java.lang.String string = typedArray.getString(index);
                        this.mDefaultInterpolatorString = string;
                        if (string.indexOf("/") > 0) {
                            this.mDefaultInterpolatorID = typedArray.getResourceId(index, -1);
                            this.mDefaultInterpolator = -2;
                        } else {
                            this.mDefaultInterpolator = -1;
                        }
                    } else {
                        this.mDefaultInterpolator = typedArray.getInteger(index, this.mDefaultInterpolator);
                    }
                } else if (index == androidx.constraintlayout.widget.R.styleable.Transition_duration) {
                    this.mDuration = typedArray.getInt(index, this.mDuration);
                } else if (index == androidx.constraintlayout.widget.R.styleable.Transition_staggered) {
                    this.mStagger = typedArray.getFloat(index, this.mStagger);
                } else if (index == androidx.constraintlayout.widget.R.styleable.Transition_autoTransition) {
                    this.mAutoTransition = typedArray.getInteger(index, this.mAutoTransition);
                } else if (index == androidx.constraintlayout.widget.R.styleable.Transition_android_id) {
                    this.mId = typedArray.getResourceId(index, this.mId);
                } else if (index == androidx.constraintlayout.widget.R.styleable.Transition_transitionDisable) {
                    this.mDisable = typedArray.getBoolean(index, this.mDisable);
                }
            }
        }
    }

    public MotionScene(androidx.constraintlayout.motion.widget.MotionLayout motionLayout) {
        this.mMotionLayout = motionLayout;
    }

    MotionScene(android.content.Context context, androidx.constraintlayout.motion.widget.MotionLayout motionLayout, int i) {
        this.mMotionLayout = motionLayout;
        load(context, i);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:38:0x0083  */
    private void load(android.content.Context context, int i) {
        android.content.res.XmlResourceParser xml = context.getResources().getXml(i);
        androidx.constraintlayout.motion.widget.MotionScene.Transition transition = null;
        try {
            int eventType = xml.getEventType();
            while (true) {
                if (eventType == 1) {
                    return;
                }
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    java.lang.String name = xml.getName();
                    if (this.DEBUG_DESKTOP) {
                        java.lang.System.out.println("parsing = " + name);
                    }
                    switch (name) {
                        case "MotionScene":
                            parseMotionSceneTags(context, xml);
                            break;
                        case "Transition":
                            java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionScene.Transition> arrayList = this.mTransitionList;
                            androidx.constraintlayout.motion.widget.MotionScene.Transition transition2 = new androidx.constraintlayout.motion.widget.MotionScene.Transition(this, context, xml);
                            arrayList.add(transition2);
                            if (this.mCurrentTransition == null) {
                                this.mCurrentTransition = transition2;
                            }
                            transition = transition2;
                            break;
                        case "OnSwipe":
                            if (transition == null) {
                                android.util.Log.v(TAG, " OnSwipe (" + context.getResources().getResourceEntryName(i) + ".xml:" + xml.getLineNumber() + ")");
                            }
                            transition.mTouchResponse = new androidx.constraintlayout.motion.widget.TouchResponse(context, this.mMotionLayout, xml);
                            break;
                        case "OnClick":
                            transition.addOnClick(context, xml);
                            break;
                        case "StateSet":
                            this.mStateSet = new androidx.constraintlayout.widget.StateSet(context, xml);
                            break;
                        case "ConstraintSet":
                            parseConstraintSet(context, xml);
                            break;
                        case "KeyFrameSet":
                            transition.mKeyFramesList.add(new androidx.constraintlayout.motion.widget.KeyFrames(context, xml));
                            break;
                        default:
                            android.util.Log.v(TAG, "WARNING UNKNOWN ATTRIBUTE " + name);
                            break;
                    }
                }
                eventType = xml.next();
            }
        } catch (java.io.IOException e) {
            e.printStackTrace();
        } catch (org.xmlpull.v1.XmlPullParserException e2) {
            e2.printStackTrace();
        }
    }

    private void parseMotionSceneTags(android.content.Context context, org.xmlpull.v1.XmlPullParser xmlPullParser) {
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(android.util.Xml.asAttributeSet(xmlPullParser), androidx.constraintlayout.widget.R.styleable.MotionScene);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == androidx.constraintlayout.widget.R.styleable.MotionScene_defaultDuration) {
                this.mDefaultDuration = typedArrayObtainStyledAttributes.getInt(index, this.mDefaultDuration);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    private int getId(android.content.Context context, java.lang.String str) {
        int identifier;
        if (str.contains("/")) {
            identifier = context.getResources().getIdentifier(str.substring(str.indexOf(47) + 1), "id", context.getPackageName());
            if (this.DEBUG_DESKTOP) {
                java.lang.System.out.println("id getMap res = " + identifier);
            }
        } else {
            identifier = -1;
        }
        if (identifier != -1) {
            return identifier;
        }
        if (str != null && str.length() > 1) {
            return java.lang.Integer.parseInt(str.substring(1));
        }
        android.util.Log.e(TAG, "error in parsing id");
        return identifier;
    }

    private void parseConstraintSet(android.content.Context context, org.xmlpull.v1.XmlPullParser xmlPullParser) {
        androidx.constraintlayout.widget.ConstraintSet constraintSet = new androidx.constraintlayout.widget.ConstraintSet();
        constraintSet.setForceId(false);
        int attributeCount = xmlPullParser.getAttributeCount();
        int id = -1;
        int id2 = -1;
        for (int i = 0; i < attributeCount; i++) {
            java.lang.String attributeName = xmlPullParser.getAttributeName(i);
            java.lang.String attributeValue = xmlPullParser.getAttributeValue(i);
            if (this.DEBUG_DESKTOP) {
                java.lang.System.out.println("id string = " + attributeValue);
            }
            attributeName.hashCode();
            if (attributeName.equals("deriveConstraintsFrom")) {
                id2 = getId(context, attributeValue);
            } else if (attributeName.equals("id")) {
                id = getId(context, attributeValue);
            }
        }
        if (id != -1) {
            if (this.mMotionLayout.mDebugPath != 0) {
                constraintSet.setValidateOnParse(true);
            }
            constraintSet.load(context, xmlPullParser);
            if (id2 != -1) {
                this.mDeriveMap.put(id, id2);
            }
            this.mConstraintSetMap.put(id, constraintSet);
        }
    }

    public androidx.constraintlayout.widget.ConstraintSet getConstraintSet(android.content.Context context, java.lang.String str) {
        if (this.DEBUG_DESKTOP) {
            java.lang.System.out.println("id " + str);
            java.lang.System.out.println("size " + this.mConstraintSetMap.size());
        }
        for (int i = 0; i < this.mConstraintSetMap.size(); i++) {
            int iKeyAt = this.mConstraintSetMap.keyAt(i);
            java.lang.String resourceName = context.getResources().getResourceName(iKeyAt);
            if (this.DEBUG_DESKTOP) {
                java.lang.System.out.println("Id for <" + i + "> is <" + resourceName + "> looking for <" + str + ">");
            }
            if (str.equals(resourceName)) {
                return this.mConstraintSetMap.get(iKeyAt);
            }
        }
        return null;
    }

    androidx.constraintlayout.widget.ConstraintSet getConstraintSet(int i) {
        return getConstraintSet(i, -1, -1);
    }

    androidx.constraintlayout.widget.ConstraintSet getConstraintSet(int i, int i2, int i3) {
        int iStateGetConstraintID;
        if (this.DEBUG_DESKTOP) {
            java.lang.System.out.println("id " + i);
            java.lang.System.out.println("size " + this.mConstraintSetMap.size());
        }
        androidx.constraintlayout.widget.StateSet stateSet = this.mStateSet;
        if (stateSet != null && (iStateGetConstraintID = stateSet.stateGetConstraintID(i, i2, i3)) != -1) {
            i = iStateGetConstraintID;
        }
        if (this.mConstraintSetMap.get(i) == null) {
            android.util.SparseArray<androidx.constraintlayout.widget.ConstraintSet> sparseArray = this.mConstraintSetMap;
            return sparseArray.get(sparseArray.keyAt(0));
        }
        return this.mConstraintSetMap.get(i);
    }

    public void setConstraintSet(int i, androidx.constraintlayout.widget.ConstraintSet constraintSet) {
        this.mConstraintSetMap.put(i, constraintSet);
    }

    public void getKeyFrames(androidx.constraintlayout.motion.widget.MotionController motionController) {
        androidx.constraintlayout.motion.widget.MotionScene.Transition transition = this.mCurrentTransition;
        if (transition == null) {
            return;
        }
        java.util.Iterator it = transition.mKeyFramesList.iterator();
        while (it.hasNext()) {
            ((androidx.constraintlayout.motion.widget.KeyFrames) it.next()).addFrames(motionController);
        }
    }

    androidx.constraintlayout.motion.widget.Key getKeyFrame(android.content.Context context, int i, int i2, int i3) {
        androidx.constraintlayout.motion.widget.MotionScene.Transition transition = this.mCurrentTransition;
        if (transition == null) {
            return null;
        }
        for (androidx.constraintlayout.motion.widget.KeyFrames keyFrames : transition.mKeyFramesList) {
            for (java.lang.Integer num : keyFrames.getKeys()) {
                if (i2 == num.intValue()) {
                    for (androidx.constraintlayout.motion.widget.Key key : keyFrames.getKeyFramesForView(num.intValue())) {
                        if (key.mFramePosition == i3 && key.mType == i) {
                            return key;
                        }
                    }
                }
            }
        }
        return null;
    }

    int getTransitionDirection(int i) {
        java.util.Iterator<androidx.constraintlayout.motion.widget.MotionScene.Transition> it = this.mTransitionList.iterator();
        while (it.hasNext()) {
            if (it.next().mConstraintSetStart == i) {
                return 0;
            }
        }
        return 1;
    }

    boolean hasKeyFramePosition(android.view.View view, int i) {
        androidx.constraintlayout.motion.widget.MotionScene.Transition transition = this.mCurrentTransition;
        if (transition == null) {
            return false;
        }
        java.util.Iterator it = transition.mKeyFramesList.iterator();
        while (it.hasNext()) {
            java.util.Iterator<androidx.constraintlayout.motion.widget.Key> it2 = ((androidx.constraintlayout.motion.widget.KeyFrames) it.next()).getKeyFramesForView(view.getId()).iterator();
            while (it2.hasNext()) {
                if (it2.next().mFramePosition == i) {
                    return true;
                }
            }
        }
        return false;
    }

    public void setKeyframe(android.view.View view, int i, java.lang.String str, java.lang.Object obj) {
        androidx.constraintlayout.motion.widget.MotionScene.Transition transition = this.mCurrentTransition;
        if (transition == null) {
            return;
        }
        java.util.Iterator it = transition.mKeyFramesList.iterator();
        while (it.hasNext()) {
            java.util.Iterator<androidx.constraintlayout.motion.widget.Key> it2 = ((androidx.constraintlayout.motion.widget.KeyFrames) it.next()).getKeyFramesForView(view.getId()).iterator();
            while (it2.hasNext()) {
                if (it2.next().mFramePosition == i) {
                    int i2 = ((obj != null ? ((java.lang.Float) obj).floatValue() : 0.0f) > 0.0f ? 1 : ((obj != null ? ((java.lang.Float) obj).floatValue() : 0.0f) == 0.0f ? 0 : -1));
                    str.equalsIgnoreCase("app:PerpendicularPath_percent");
                }
            }
        }
    }

    boolean supportTouch() {
        java.util.Iterator<androidx.constraintlayout.motion.widget.MotionScene.Transition> it = this.mTransitionList.iterator();
        while (it.hasNext()) {
            if (it.next().mTouchResponse != null) {
                return true;
            }
        }
        androidx.constraintlayout.motion.widget.MotionScene.Transition transition = this.mCurrentTransition;
        return (transition == null || transition.mTouchResponse == null) ? false : true;
    }

    void processTouchEvent(android.view.MotionEvent motionEvent, int i, androidx.constraintlayout.motion.widget.MotionLayout motionLayout) {
        android.view.VelocityTracker velocityTracker;
        android.graphics.RectF rectF = new android.graphics.RectF();
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = android.view.VelocityTracker.obtain();
        }
        this.mVelocityTracker.addMovement(motionEvent);
        if (i != -1) {
            int action = motionEvent.getAction();
            boolean z = false;
            if (action == 0) {
                this.mLastTouchX = motionEvent.getRawX();
                this.mLastTouchY = motionEvent.getRawY();
                this.mLastTouchDown = motionEvent;
                if (this.mCurrentTransition.mTouchResponse != null) {
                    android.graphics.RectF touchRegion = this.mCurrentTransition.mTouchResponse.getTouchRegion(this.mMotionLayout, rectF);
                    if (touchRegion != null && !touchRegion.contains(this.mLastTouchDown.getX(), this.mLastTouchDown.getY())) {
                        this.mMotionOutsideRegion = true;
                    } else {
                        this.mMotionOutsideRegion = false;
                    }
                    this.mCurrentTransition.mTouchResponse.setDown(this.mLastTouchX, this.mLastTouchY);
                    return;
                }
                return;
            }
            if (action == 2) {
                float rawY = motionEvent.getRawY() - this.mLastTouchY;
                float rawX = motionEvent.getRawX() - this.mLastTouchX;
                if (rawX == 0.0d && rawY == 0.0d) {
                    return;
                }
                androidx.constraintlayout.motion.widget.MotionScene.Transition transitionBestTransitionFor = bestTransitionFor(i, rawX, rawY, this.mLastTouchDown);
                if (transitionBestTransitionFor != null) {
                    motionLayout.setTransition(transitionBestTransitionFor);
                    android.graphics.RectF touchRegion2 = this.mCurrentTransition.mTouchResponse.getTouchRegion(this.mMotionLayout, rectF);
                    if (touchRegion2 != null && !touchRegion2.contains(this.mLastTouchDown.getX(), this.mLastTouchDown.getY())) {
                        z = true;
                    }
                    this.mMotionOutsideRegion = z;
                    this.mCurrentTransition.mTouchResponse.setUpTouchEvent(this.mLastTouchX, this.mLastTouchY);
                }
            }
        }
        androidx.constraintlayout.motion.widget.MotionScene.Transition transition = this.mCurrentTransition;
        if (transition != null && transition.mTouchResponse != null && !this.mMotionOutsideRegion) {
            this.mCurrentTransition.mTouchResponse.processTouchEvent(motionEvent, this.mVelocityTracker, i, this);
        }
        this.mLastTouchX = motionEvent.getRawX();
        this.mLastTouchY = motionEvent.getRawY();
        if (motionEvent.getAction() != 1 || (velocityTracker = this.mVelocityTracker) == null) {
            return;
        }
        velocityTracker.recycle();
        this.mVelocityTracker = null;
        if (motionLayout.mCurrentState != -1) {
            autoTransition(motionLayout, motionLayout.mCurrentState);
        }
    }

    void processScrollMove(float f, float f2) {
        androidx.constraintlayout.motion.widget.MotionScene.Transition transition = this.mCurrentTransition;
        if (transition == null || transition.mTouchResponse == null) {
            return;
        }
        this.mCurrentTransition.mTouchResponse.scrollMove(f, f2);
    }

    void processScrollUp(float f, float f2) {
        androidx.constraintlayout.motion.widget.MotionScene.Transition transition = this.mCurrentTransition;
        if (transition == null || transition.mTouchResponse == null) {
            return;
        }
        this.mCurrentTransition.mTouchResponse.scrollUp(f, f2);
    }

    float getProgressDirection(float f, float f2) {
        androidx.constraintlayout.motion.widget.MotionScene.Transition transition = this.mCurrentTransition;
        if (transition == null || transition.mTouchResponse == null) {
            return 0.0f;
        }
        return this.mCurrentTransition.mTouchResponse.getProgressDirection(f, f2);
    }

    int getStartId() {
        androidx.constraintlayout.motion.widget.MotionScene.Transition transition = this.mCurrentTransition;
        if (transition == null) {
            return -1;
        }
        return transition.mConstraintSetStart;
    }

    int getEndId() {
        androidx.constraintlayout.motion.widget.MotionScene.Transition transition = this.mCurrentTransition;
        if (transition == null) {
            return -1;
        }
        return transition.mConstraintSetEnd;
    }

    public android.view.animation.Interpolator getInterpolator() {
        int i = this.mCurrentTransition.mDefaultInterpolator;
        if (i == -2) {
            return android.view.animation.AnimationUtils.loadInterpolator(this.mMotionLayout.getContext(), this.mCurrentTransition.mDefaultInterpolatorID);
        }
        if (i == -1) {
            final androidx.constraintlayout.motion.utils.Easing interpolator = androidx.constraintlayout.motion.utils.Easing.getInterpolator(this.mCurrentTransition.mDefaultInterpolatorString);
            return new android.view.animation.Interpolator() { // from class: androidx.constraintlayout.motion.widget.MotionScene.1
                @Override // android.animation.TimeInterpolator
                public float getInterpolation(float f) {
                    return (float) interpolator.get(f);
                }
            };
        }
        if (i == 0) {
            return new android.view.animation.AccelerateDecelerateInterpolator();
        }
        if (i == 1) {
            return new android.view.animation.AccelerateInterpolator();
        }
        if (i == 2) {
            return new android.view.animation.DecelerateInterpolator();
        }
        if (i == 4) {
            return new android.view.animation.AnticipateInterpolator();
        }
        if (i != 5) {
            return null;
        }
        return new android.view.animation.BounceInterpolator();
    }

    public int getDuration() {
        androidx.constraintlayout.motion.widget.MotionScene.Transition transition = this.mCurrentTransition;
        if (transition != null) {
            return transition.mDuration;
        }
        return this.mDefaultDuration;
    }

    public void setDuration(int i) {
        androidx.constraintlayout.motion.widget.MotionScene.Transition transition = this.mCurrentTransition;
        if (transition != null) {
            transition.setDuration(i);
        } else {
            this.mDefaultDuration = i;
        }
    }

    public float getStaggered() {
        androidx.constraintlayout.motion.widget.MotionScene.Transition transition = this.mCurrentTransition;
        if (transition != null) {
            return transition.mStagger;
        }
        return 0.0f;
    }

    float getMaxAcceleration() {
        androidx.constraintlayout.motion.widget.MotionScene.Transition transition = this.mCurrentTransition;
        if (transition == null || transition.mTouchResponse == null) {
            return 0.0f;
        }
        return this.mCurrentTransition.mTouchResponse.getMaxAcceleration();
    }

    float getMaxVelocity() {
        androidx.constraintlayout.motion.widget.MotionScene.Transition transition = this.mCurrentTransition;
        if (transition == null || transition.mTouchResponse == null) {
            return 0.0f;
        }
        return this.mCurrentTransition.mTouchResponse.getMaxVelocity();
    }

    void setupTouch() {
        androidx.constraintlayout.motion.widget.MotionScene.Transition transition = this.mCurrentTransition;
        if (transition == null || transition.mTouchResponse == null) {
            return;
        }
        this.mCurrentTransition.mTouchResponse.setupTouch();
    }

    boolean getMoveWhenScrollAtTop() {
        androidx.constraintlayout.motion.widget.MotionScene.Transition transition = this.mCurrentTransition;
        if (transition == null || transition.mTouchResponse == null) {
            return false;
        }
        return this.mCurrentTransition.mTouchResponse.getMoveWhenScrollAtTop();
    }

    void readFallback(androidx.constraintlayout.motion.widget.MotionLayout motionLayout) {
        for (int i = 0; i < this.mConstraintSetMap.size(); i++) {
            readConstraintChain(this.mConstraintSetMap.keyAt(i));
        }
        for (int i2 = 0; i2 < this.mConstraintSetMap.size(); i2++) {
            this.mConstraintSetMap.valueAt(i2).readFallback(motionLayout);
        }
    }

    private void readConstraintChain(int i) {
        int i2 = this.mDeriveMap.get(i);
        if (i2 > 0) {
            readConstraintChain(this.mDeriveMap.get(i));
            this.mConstraintSetMap.get(i).readFallback(this.mConstraintSetMap.get(i2));
            this.mDeriveMap.put(i, -1);
        }
    }
}
