package androidx.fragment.app;

/* JADX INFO: loaded from: classes.dex */
class FragmentLayoutInflaterFactory implements android.view.LayoutInflater.Factory2 {
    private static final java.lang.String TAG = "FragmentManager";
    private final androidx.fragment.app.FragmentManager mFragmentManager;

    FragmentLayoutInflaterFactory(androidx.fragment.app.FragmentManager fragmentManager) {
        this.mFragmentManager = fragmentManager;
    }

    @Override // android.view.LayoutInflater.Factory
    public android.view.View onCreateView(java.lang.String str, android.content.Context context, android.util.AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public android.view.View onCreateView(android.view.View view, java.lang.String str, android.content.Context context, android.util.AttributeSet attributeSet) {
        if (androidx.fragment.app.FragmentContainerView.class.getName().equals(str)) {
            return new androidx.fragment.app.FragmentContainerView(context, attributeSet, this.mFragmentManager);
        }
        if (!"fragment".equals(str)) {
            return null;
        }
        java.lang.String attributeValue = attributeSet.getAttributeValue(null, "class");
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.fragment.R.styleable.Fragment);
        if (attributeValue == null) {
            attributeValue = typedArrayObtainStyledAttributes.getString(androidx.fragment.R.styleable.Fragment_android_name);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(androidx.fragment.R.styleable.Fragment_android_id, -1);
        java.lang.String string = typedArrayObtainStyledAttributes.getString(androidx.fragment.R.styleable.Fragment_android_tag);
        typedArrayObtainStyledAttributes.recycle();
        if (attributeValue == null || !androidx.fragment.app.FragmentFactory.isFragmentClass(context.getClassLoader(), attributeValue)) {
            return null;
        }
        int id = view != null ? view.getId() : 0;
        if (id == -1 && resourceId == -1 && string == null) {
            throw new java.lang.IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
        }
        androidx.fragment.app.Fragment fragmentFindFragmentById = resourceId != -1 ? this.mFragmentManager.findFragmentById(resourceId) : null;
        if (fragmentFindFragmentById == null && string != null) {
            fragmentFindFragmentById = this.mFragmentManager.findFragmentByTag(string);
        }
        if (fragmentFindFragmentById == null && id != -1) {
            fragmentFindFragmentById = this.mFragmentManager.findFragmentById(id);
        }
        if (androidx.fragment.app.FragmentManager.isLoggingEnabled(2)) {
            android.util.Log.v(TAG, "onCreateView: id=0x" + java.lang.Integer.toHexString(resourceId) + " fname=" + attributeValue + " existing=" + fragmentFindFragmentById);
        }
        if (fragmentFindFragmentById == null) {
            fragmentFindFragmentById = this.mFragmentManager.getFragmentFactory().instantiate(context.getClassLoader(), attributeValue);
            fragmentFindFragmentById.mFromLayout = true;
            fragmentFindFragmentById.mFragmentId = resourceId != 0 ? resourceId : id;
            fragmentFindFragmentById.mContainerId = id;
            fragmentFindFragmentById.mTag = string;
            fragmentFindFragmentById.mInLayout = true;
            fragmentFindFragmentById.mFragmentManager = this.mFragmentManager;
            fragmentFindFragmentById.mHost = this.mFragmentManager.mHost;
            fragmentFindFragmentById.onInflate(this.mFragmentManager.mHost.getContext(), attributeSet, fragmentFindFragmentById.mSavedFragmentState);
            this.mFragmentManager.addFragment(fragmentFindFragmentById);
            this.mFragmentManager.moveToState(fragmentFindFragmentById);
        } else {
            if (fragmentFindFragmentById.mInLayout) {
                throw new java.lang.IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + java.lang.Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + java.lang.Integer.toHexString(id) + " with another fragment for " + attributeValue);
            }
            fragmentFindFragmentById.mInLayout = true;
            fragmentFindFragmentById.mHost = this.mFragmentManager.mHost;
            fragmentFindFragmentById.onInflate(this.mFragmentManager.mHost.getContext(), attributeSet, fragmentFindFragmentById.mSavedFragmentState);
        }
        if (this.mFragmentManager.mCurState < 1 && fragmentFindFragmentById.mFromLayout) {
            this.mFragmentManager.moveToState(fragmentFindFragmentById, 1);
        } else {
            this.mFragmentManager.moveToState(fragmentFindFragmentById);
        }
        if (fragmentFindFragmentById.mView == null) {
            throw new java.lang.IllegalStateException("Fragment " + attributeValue + " did not create a view.");
        }
        if (resourceId != 0) {
            fragmentFindFragmentById.mView.setId(resourceId);
        }
        if (fragmentFindFragmentById.mView.getTag() == null) {
            fragmentFindFragmentById.mView.setTag(string);
        }
        return fragmentFindFragmentById.mView;
    }
}
