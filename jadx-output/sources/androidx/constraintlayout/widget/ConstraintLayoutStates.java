package androidx.constraintlayout.widget;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintLayoutStates {
    private static final boolean DEBUG = false;
    public static final java.lang.String TAG = "ConstraintLayoutStates";
    private final androidx.constraintlayout.widget.ConstraintLayout mConstraintLayout;
    androidx.constraintlayout.widget.ConstraintSet mDefaultConstraintSet;
    int mCurrentStateId = -1;
    int mCurrentConstraintNumber = -1;
    private android.util.SparseArray<androidx.constraintlayout.widget.ConstraintLayoutStates.State> mStateList = new android.util.SparseArray<>();
    private android.util.SparseArray<androidx.constraintlayout.widget.ConstraintSet> mConstraintSetMap = new android.util.SparseArray<>();
    private androidx.constraintlayout.widget.ConstraintsChangedListener mConstraintsChangedListener = null;

    ConstraintLayoutStates(android.content.Context context, androidx.constraintlayout.widget.ConstraintLayout constraintLayout, int i) {
        this.mConstraintLayout = constraintLayout;
        load(context, i);
    }

    public boolean needsToChange(int i, float f, float f2) {
        int i2 = this.mCurrentStateId;
        if (i2 != i) {
            return true;
        }
        androidx.constraintlayout.widget.ConstraintLayoutStates.State stateValueAt = i == -1 ? this.mStateList.valueAt(0) : this.mStateList.get(i2);
        return (this.mCurrentConstraintNumber == -1 || !stateValueAt.mVariants.get(this.mCurrentConstraintNumber).match(f, f2)) && this.mCurrentConstraintNumber != stateValueAt.findMatch(f, f2);
    }

    public void updateConstraints(int i, float f, float f2) {
        androidx.constraintlayout.widget.ConstraintSet constraintSet;
        int i2;
        androidx.constraintlayout.widget.ConstraintLayoutStates.State stateValueAt;
        int iFindMatch;
        androidx.constraintlayout.widget.ConstraintSet constraintSet2;
        int i3;
        int i4 = this.mCurrentStateId;
        if (i4 == i) {
            if (i == -1) {
                stateValueAt = this.mStateList.valueAt(0);
            } else {
                stateValueAt = this.mStateList.get(i4);
            }
            if ((this.mCurrentConstraintNumber == -1 || !stateValueAt.mVariants.get(this.mCurrentConstraintNumber).match(f, f2)) && this.mCurrentConstraintNumber != (iFindMatch = stateValueAt.findMatch(f, f2))) {
                if (iFindMatch == -1) {
                    constraintSet2 = this.mDefaultConstraintSet;
                } else {
                    constraintSet2 = stateValueAt.mVariants.get(iFindMatch).mConstraintSet;
                }
                if (iFindMatch == -1) {
                    i3 = stateValueAt.mConstraintID;
                } else {
                    i3 = stateValueAt.mVariants.get(iFindMatch).mConstraintID;
                }
                if (constraintSet2 == null) {
                    return;
                }
                this.mCurrentConstraintNumber = iFindMatch;
                androidx.constraintlayout.widget.ConstraintsChangedListener constraintsChangedListener = this.mConstraintsChangedListener;
                if (constraintsChangedListener != null) {
                    constraintsChangedListener.preLayoutChange(-1, i3);
                }
                constraintSet2.applyTo(this.mConstraintLayout);
                androidx.constraintlayout.widget.ConstraintsChangedListener constraintsChangedListener2 = this.mConstraintsChangedListener;
                if (constraintsChangedListener2 != null) {
                    constraintsChangedListener2.postLayoutChange(-1, i3);
                    return;
                }
                return;
            }
            return;
        }
        this.mCurrentStateId = i;
        androidx.constraintlayout.widget.ConstraintLayoutStates.State state = this.mStateList.get(i);
        int iFindMatch2 = state.findMatch(f, f2);
        if (iFindMatch2 == -1) {
            constraintSet = state.mConstraintSet;
        } else {
            constraintSet = state.mVariants.get(iFindMatch2).mConstraintSet;
        }
        if (iFindMatch2 == -1) {
            i2 = state.mConstraintID;
        } else {
            i2 = state.mVariants.get(iFindMatch2).mConstraintID;
        }
        if (constraintSet == null) {
            android.util.Log.v("ConstraintLayoutStates", "NO Constraint set found ! id=" + i + ", dim =" + f + ", " + f2);
            return;
        }
        this.mCurrentConstraintNumber = iFindMatch2;
        androidx.constraintlayout.widget.ConstraintsChangedListener constraintsChangedListener3 = this.mConstraintsChangedListener;
        if (constraintsChangedListener3 != null) {
            constraintsChangedListener3.preLayoutChange(i, i2);
        }
        constraintSet.applyTo(this.mConstraintLayout);
        androidx.constraintlayout.widget.ConstraintsChangedListener constraintsChangedListener4 = this.mConstraintsChangedListener;
        if (constraintsChangedListener4 != null) {
            constraintsChangedListener4.postLayoutChange(i, i2);
        }
    }

    public void setOnConstraintsChanged(androidx.constraintlayout.widget.ConstraintsChangedListener constraintsChangedListener) {
        this.mConstraintsChangedListener = constraintsChangedListener;
    }

    static class State {
        int mConstraintID;
        androidx.constraintlayout.widget.ConstraintSet mConstraintSet;
        int mId;
        java.util.ArrayList<androidx.constraintlayout.widget.ConstraintLayoutStates.Variant> mVariants = new java.util.ArrayList<>();

        public State(android.content.Context context, org.xmlpull.v1.XmlPullParser xmlPullParser) {
            this.mConstraintID = -1;
            android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(android.util.Xml.asAttributeSet(xmlPullParser), androidx.constraintlayout.widget.R.styleable.State);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == androidx.constraintlayout.widget.R.styleable.State_android_id) {
                    this.mId = typedArrayObtainStyledAttributes.getResourceId(index, this.mId);
                } else if (index == androidx.constraintlayout.widget.R.styleable.State_constraints) {
                    this.mConstraintID = typedArrayObtainStyledAttributes.getResourceId(index, this.mConstraintID);
                    java.lang.String resourceTypeName = context.getResources().getResourceTypeName(this.mConstraintID);
                    context.getResources().getResourceName(this.mConstraintID);
                    if ("layout".equals(resourceTypeName)) {
                        androidx.constraintlayout.widget.ConstraintSet constraintSet = new androidx.constraintlayout.widget.ConstraintSet();
                        this.mConstraintSet = constraintSet;
                        constraintSet.clone(context, this.mConstraintID);
                    }
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        void add(androidx.constraintlayout.widget.ConstraintLayoutStates.Variant variant) {
            this.mVariants.add(variant);
        }

        public int findMatch(float f, float f2) {
            for (int i = 0; i < this.mVariants.size(); i++) {
                if (this.mVariants.get(i).match(f, f2)) {
                    return i;
                }
            }
            return -1;
        }
    }

    static class Variant {
        int mConstraintID;
        androidx.constraintlayout.widget.ConstraintSet mConstraintSet;
        int mId;
        float mMaxHeight;
        float mMaxWidth;
        float mMinHeight;
        float mMinWidth;

        public Variant(android.content.Context context, org.xmlpull.v1.XmlPullParser xmlPullParser) {
            this.mMinWidth = Float.NaN;
            this.mMinHeight = Float.NaN;
            this.mMaxWidth = Float.NaN;
            this.mMaxHeight = Float.NaN;
            this.mConstraintID = -1;
            android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(android.util.Xml.asAttributeSet(xmlPullParser), androidx.constraintlayout.widget.R.styleable.Variant);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == androidx.constraintlayout.widget.R.styleable.Variant_constraints) {
                    this.mConstraintID = typedArrayObtainStyledAttributes.getResourceId(index, this.mConstraintID);
                    java.lang.String resourceTypeName = context.getResources().getResourceTypeName(this.mConstraintID);
                    context.getResources().getResourceName(this.mConstraintID);
                    if ("layout".equals(resourceTypeName)) {
                        androidx.constraintlayout.widget.ConstraintSet constraintSet = new androidx.constraintlayout.widget.ConstraintSet();
                        this.mConstraintSet = constraintSet;
                        constraintSet.clone(context, this.mConstraintID);
                    }
                } else if (index == androidx.constraintlayout.widget.R.styleable.Variant_region_heightLessThan) {
                    this.mMaxHeight = typedArrayObtainStyledAttributes.getDimension(index, this.mMaxHeight);
                } else if (index == androidx.constraintlayout.widget.R.styleable.Variant_region_heightMoreThan) {
                    this.mMinHeight = typedArrayObtainStyledAttributes.getDimension(index, this.mMinHeight);
                } else if (index == androidx.constraintlayout.widget.R.styleable.Variant_region_widthLessThan) {
                    this.mMaxWidth = typedArrayObtainStyledAttributes.getDimension(index, this.mMaxWidth);
                } else if (index == androidx.constraintlayout.widget.R.styleable.Variant_region_widthMoreThan) {
                    this.mMinWidth = typedArrayObtainStyledAttributes.getDimension(index, this.mMinWidth);
                } else {
                    android.util.Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        boolean match(float f, float f2) {
            if (!java.lang.Float.isNaN(this.mMinWidth) && f < this.mMinWidth) {
                return false;
            }
            if (!java.lang.Float.isNaN(this.mMinHeight) && f2 < this.mMinHeight) {
                return false;
            }
            if (java.lang.Float.isNaN(this.mMaxWidth) || f <= this.mMaxWidth) {
                return java.lang.Float.isNaN(this.mMaxHeight) || f2 <= this.mMaxHeight;
            }
            return false;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private void load(android.content.Context context, int i) {
        android.content.res.XmlResourceParser xml = context.getResources().getXml(i);
        androidx.constraintlayout.widget.ConstraintLayoutStates.State state = null;
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    java.lang.String name = xml.getName();
                    byte b = -1;
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                b = 4;
                            }
                            break;
                        case 80204913:
                            if (name.equals("State")) {
                                b = 2;
                            }
                            break;
                        case 1382829617:
                            if (name.equals("StateSet")) {
                                b = 1;
                            }
                            break;
                        case 1657696882:
                            if (name.equals("layoutDescription")) {
                                b = 0;
                            }
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                b = 3;
                            }
                            break;
                    }
                    if (b != 0 && b != 1) {
                        if (b == 2) {
                            state = new androidx.constraintlayout.widget.ConstraintLayoutStates.State(context, xml);
                            this.mStateList.put(state.mId, state);
                        } else if (b == 3) {
                            androidx.constraintlayout.widget.ConstraintLayoutStates.Variant variant = new androidx.constraintlayout.widget.ConstraintLayoutStates.Variant(context, xml);
                            if (state != null) {
                                state.add(variant);
                            }
                        } else if (b == 4) {
                            parseConstraintSet(context, xml);
                        } else {
                            android.util.Log.v("ConstraintLayoutStates", "unknown tag " + name);
                        }
                    }
                }
            }
        } catch (java.io.IOException e) {
            e.printStackTrace();
        } catch (org.xmlpull.v1.XmlPullParserException e2) {
            e2.printStackTrace();
        }
    }

    private void parseConstraintSet(android.content.Context context, org.xmlpull.v1.XmlPullParser xmlPullParser) {
        androidx.constraintlayout.widget.ConstraintSet constraintSet = new androidx.constraintlayout.widget.ConstraintSet();
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            if ("mId".equals(xmlPullParser.getAttributeName(i))) {
                java.lang.String attributeValue = xmlPullParser.getAttributeValue(i);
                int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "mId", context.getPackageName()) : -1;
                if (identifier == -1) {
                    if (attributeValue != null && attributeValue.length() > 1) {
                        identifier = java.lang.Integer.parseInt(attributeValue.substring(1));
                    } else {
                        android.util.Log.e("ConstraintLayoutStates", "error in parsing mId");
                    }
                }
                constraintSet.load(context, xmlPullParser);
                this.mConstraintSetMap.put(identifier, constraintSet);
                return;
            }
        }
    }
}
