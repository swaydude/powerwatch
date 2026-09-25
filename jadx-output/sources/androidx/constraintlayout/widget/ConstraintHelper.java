package androidx.constraintlayout.widget;

/* JADX INFO: loaded from: classes.dex */
public abstract class ConstraintHelper extends android.view.View {
    protected int mCount;
    protected androidx.constraintlayout.solver.widgets.Helper mHelperWidget;
    protected int[] mIds;
    private java.util.HashMap<java.lang.Integer, java.lang.String> mMap;
    protected java.lang.String mReferenceIds;
    protected boolean mUseViewMeasure;
    private android.view.View[] mViews;
    protected android.content.Context myContext;

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
    }

    public void resolveRtl(androidx.constraintlayout.solver.widgets.ConstraintWidget constraintWidget, boolean z) {
    }

    public void updatePostConstraints(androidx.constraintlayout.widget.ConstraintLayout constraintLayout) {
    }

    public void updatePostLayout(androidx.constraintlayout.widget.ConstraintLayout constraintLayout) {
    }

    public void updatePostMeasure(androidx.constraintlayout.widget.ConstraintLayout constraintLayout) {
    }

    public ConstraintHelper(android.content.Context context) {
        super(context);
        this.mIds = new int[32];
        this.mUseViewMeasure = false;
        this.mViews = null;
        this.mMap = new java.util.HashMap<>();
        this.myContext = context;
        init(null);
    }

    public ConstraintHelper(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mIds = new int[32];
        this.mUseViewMeasure = false;
        this.mViews = null;
        this.mMap = new java.util.HashMap<>();
        this.myContext = context;
        init(attributeSet);
    }

    public ConstraintHelper(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mIds = new int[32];
        this.mUseViewMeasure = false;
        this.mViews = null;
        this.mMap = new java.util.HashMap<>();
        this.myContext = context;
        init(attributeSet);
    }

    protected void init(android.util.AttributeSet attributeSet) {
        if (attributeSet != null) {
            android.content.res.TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_constraint_referenced_ids) {
                    java.lang.String string = typedArrayObtainStyledAttributes.getString(index);
                    this.mReferenceIds = string;
                    setIds(string);
                }
            }
        }
    }

    public void addView(android.view.View view) {
        if (view.getId() == -1) {
            android.util.Log.e("ConstraintHelper", "Views added to a ConstraintHelper need to have an id");
        } else {
            if (view.getParent() == null) {
                android.util.Log.e("ConstraintHelper", "Views added to a ConstraintHelper need to have a parent");
                return;
            }
            this.mReferenceIds = null;
            addRscID(view.getId());
            requestLayout();
        }
    }

    public void removeView(android.view.View view) {
        int i;
        int id = view.getId();
        if (id == -1) {
            return;
        }
        this.mReferenceIds = null;
        int i2 = 0;
        while (i2 < this.mCount) {
            if (this.mIds[i2] == id) {
                while (true) {
                    i = this.mCount;
                    if (i2 >= i - 1) {
                        break;
                    }
                    int[] iArr = this.mIds;
                    int i3 = i2 + 1;
                    iArr[i2] = iArr[i3];
                    i2 = i3;
                }
                this.mIds[i - 1] = 0;
                this.mCount = i - 1;
                break;
            }
            i2++;
        }
        requestLayout();
    }

    public int[] getReferencedIds() {
        return java.util.Arrays.copyOf(this.mIds, this.mCount);
    }

    public void setReferencedIds(int[] iArr) {
        this.mReferenceIds = null;
        this.mCount = 0;
        for (int i : iArr) {
            addRscID(i);
        }
    }

    private void addRscID(int i) {
        int i2 = this.mCount + 1;
        int[] iArr = this.mIds;
        if (i2 > iArr.length) {
            this.mIds = java.util.Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.mIds;
        int i3 = this.mCount;
        iArr2[i3] = i;
        this.mCount = i3 + 1;
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        if (this.mUseViewMeasure) {
            super.onMeasure(i, i2);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    public void validateParams() {
        if (this.mHelperWidget == null) {
            return;
        }
        android.view.ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) {
            ((androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) layoutParams).widget = (androidx.constraintlayout.solver.widgets.ConstraintWidget) this.mHelperWidget;
        }
    }

    private void addID(java.lang.String str) {
        java.lang.Object designInformation;
        if (str == null || str.length() == 0 || this.myContext == null) {
            return;
        }
        java.lang.String strTrim = str.trim();
        if (getParent() instanceof androidx.constraintlayout.widget.ConstraintLayout) {
            androidx.constraintlayout.widget.ConstraintLayout constraintLayout = (androidx.constraintlayout.widget.ConstraintLayout) getParent();
            int iFindId = findId(constraintLayout, strTrim);
            if (iFindId == 0 && isInEditMode() && (designInformation = constraintLayout.getDesignInformation(0, strTrim)) != null && (designInformation instanceof java.lang.Integer)) {
                iFindId = ((java.lang.Integer) designInformation).intValue();
            }
            if (iFindId == 0) {
                iFindId = this.myContext.getResources().getIdentifier(strTrim, "id", this.myContext.getPackageName());
            }
            if (iFindId != 0) {
                this.mMap.put(java.lang.Integer.valueOf(iFindId), strTrim);
                addRscID(iFindId);
                return;
            }
            android.util.Log.w("ConstraintHelper", "Could not find id of \"" + strTrim + "\"");
        }
    }

    private int findId(androidx.constraintlayout.widget.ConstraintLayout constraintLayout, java.lang.String str) {
        android.content.res.Resources resources;
        if (str == null || constraintLayout == null || (resources = getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            android.view.View childAt = constraintLayout.getChildAt(i);
            if (childAt.getId() != -1) {
                java.lang.String resourceEntryName = null;
                try {
                    resourceEntryName = resources.getResourceEntryName(childAt.getId());
                } catch (android.content.res.Resources.NotFoundException unused) {
                }
                if (str.equals(resourceEntryName)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    protected void setIds(java.lang.String str) {
        this.mReferenceIds = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.mCount = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i);
            if (iIndexOf == -1) {
                addID(str.substring(i));
                return;
            } else {
                addID(str.substring(i, iIndexOf));
                i = iIndexOf + 1;
            }
        }
    }

    public void updatePreLayout(androidx.constraintlayout.widget.ConstraintLayout constraintLayout) {
        java.lang.String str;
        int iFindId;
        if (isInEditMode()) {
            setIds(this.mReferenceIds);
        }
        if (this.mHelperWidget == null) {
            return;
        }
        java.lang.String str2 = this.mReferenceIds;
        if (str2 != null) {
            setIds(str2);
        }
        this.mHelperWidget.removeAllIds();
        for (int i = 0; i < this.mCount; i++) {
            int i2 = this.mIds[i];
            android.view.View viewById = constraintLayout.getViewById(i2);
            if (viewById == null && (iFindId = findId(constraintLayout, (str = this.mMap.get(java.lang.Integer.valueOf(i2))))) != 0) {
                this.mIds[i] = iFindId;
                this.mMap.put(java.lang.Integer.valueOf(iFindId), str);
                viewById = constraintLayout.getViewById(iFindId);
            }
            if (viewById != null) {
                this.mHelperWidget.add(constraintLayout.getViewWidget(viewById));
            }
        }
        this.mHelperWidget.updateConstraints(constraintLayout.mLayoutWidget);
    }

    public void updatePreLayout(androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer constraintWidgetContainer, androidx.constraintlayout.solver.widgets.Helper helper, android.util.SparseArray<androidx.constraintlayout.solver.widgets.ConstraintWidget> sparseArray) {
        helper.removeAllIds();
        for (int i = 0; i < this.mCount; i++) {
            helper.add(sparseArray.get(this.mIds[i]));
        }
    }

    protected android.view.View[] getViews(androidx.constraintlayout.widget.ConstraintLayout constraintLayout) {
        android.view.View[] viewArr = this.mViews;
        if (viewArr == null || viewArr.length != this.mCount) {
            this.mViews = new android.view.View[this.mCount];
        }
        for (int i = 0; i < this.mCount; i++) {
            this.mViews[i] = constraintLayout.getViewById(this.mIds[i]);
        }
        return this.mViews;
    }

    public void loadParameters(androidx.constraintlayout.widget.ConstraintSet.Constraint constraint, androidx.constraintlayout.solver.widgets.HelperWidget helperWidget, androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams, android.util.SparseArray<androidx.constraintlayout.solver.widgets.ConstraintWidget> sparseArray) {
        if (constraint.layout.mReferenceIds != null) {
            setReferencedIds(constraint.layout.mReferenceIds);
            return;
        }
        if (constraint.layout.mReferenceIdString == null || constraint.layout.mReferenceIdString.length() <= 0) {
            return;
        }
        constraint.layout.mReferenceIds = convertReferenceString(this, constraint.layout.mReferenceIdString);
        helperWidget.removeAllIds();
        for (int i = 0; i < constraint.layout.mReferenceIds.length; i++) {
            androidx.constraintlayout.solver.widgets.ConstraintWidget constraintWidget = sparseArray.get(constraint.layout.mReferenceIds[i]);
            if (constraintWidget != null) {
                helperWidget.add(constraintWidget);
            }
        }
    }

    private int[] convertReferenceString(android.view.View view, java.lang.String str) {
        int iIntValue;
        java.lang.Object designInformation;
        java.lang.String[] strArrSplit = str.split(",");
        android.content.Context context = view.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i = 0;
        int i2 = 0;
        while (i < strArrSplit.length) {
            java.lang.String strTrim = strArrSplit[i].trim();
            try {
                iIntValue = androidx.constraintlayout.widget.R.id.class.getField(strTrim).getInt(null);
            } catch (java.lang.Exception unused) {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                iIntValue = context.getResources().getIdentifier(strTrim, "id", context.getPackageName());
            }
            if (iIntValue == 0 && view.isInEditMode() && (view.getParent() instanceof androidx.constraintlayout.widget.ConstraintLayout) && (designInformation = ((androidx.constraintlayout.widget.ConstraintLayout) view.getParent()).getDesignInformation(0, strTrim)) != null && (designInformation instanceof java.lang.Integer)) {
                iIntValue = ((java.lang.Integer) designInformation).intValue();
            }
            iArr[i2] = iIntValue;
            i++;
            i2++;
        }
        return i2 != strArrSplit.length ? java.util.Arrays.copyOf(iArr, i2) : iArr;
    }
}
