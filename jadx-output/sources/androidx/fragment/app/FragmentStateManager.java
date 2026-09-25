package androidx.fragment.app;

/* JADX INFO: loaded from: classes.dex */
class FragmentStateManager {
    private static final java.lang.String TAG = "FragmentManager";
    private static final java.lang.String TARGET_REQUEST_CODE_STATE_TAG = "android:target_req_state";
    private static final java.lang.String TARGET_STATE_TAG = "android:target_state";
    private static final java.lang.String USER_VISIBLE_HINT_TAG = "android:user_visible_hint";
    private static final java.lang.String VIEW_STATE_TAG = "android:view_state";
    private final androidx.fragment.app.FragmentLifecycleCallbacksDispatcher mDispatcher;
    private final androidx.fragment.app.Fragment mFragment;
    private int mFragmentManagerState = -1;

    FragmentStateManager(androidx.fragment.app.FragmentLifecycleCallbacksDispatcher fragmentLifecycleCallbacksDispatcher, androidx.fragment.app.Fragment fragment) {
        this.mDispatcher = fragmentLifecycleCallbacksDispatcher;
        this.mFragment = fragment;
    }

    FragmentStateManager(androidx.fragment.app.FragmentLifecycleCallbacksDispatcher fragmentLifecycleCallbacksDispatcher, java.lang.ClassLoader classLoader, androidx.fragment.app.FragmentFactory fragmentFactory, androidx.fragment.app.FragmentState fragmentState) {
        this.mDispatcher = fragmentLifecycleCallbacksDispatcher;
        androidx.fragment.app.Fragment fragmentInstantiate = fragmentFactory.instantiate(classLoader, fragmentState.mClassName);
        this.mFragment = fragmentInstantiate;
        if (fragmentState.mArguments != null) {
            fragmentState.mArguments.setClassLoader(classLoader);
        }
        fragmentInstantiate.setArguments(fragmentState.mArguments);
        fragmentInstantiate.mWho = fragmentState.mWho;
        fragmentInstantiate.mFromLayout = fragmentState.mFromLayout;
        fragmentInstantiate.mRestored = true;
        fragmentInstantiate.mFragmentId = fragmentState.mFragmentId;
        fragmentInstantiate.mContainerId = fragmentState.mContainerId;
        fragmentInstantiate.mTag = fragmentState.mTag;
        fragmentInstantiate.mRetainInstance = fragmentState.mRetainInstance;
        fragmentInstantiate.mRemoving = fragmentState.mRemoving;
        fragmentInstantiate.mDetached = fragmentState.mDetached;
        fragmentInstantiate.mHidden = fragmentState.mHidden;
        fragmentInstantiate.mMaxState = androidx.lifecycle.Lifecycle.State.values()[fragmentState.mMaxLifecycleState];
        if (fragmentState.mSavedFragmentState != null) {
            fragmentInstantiate.mSavedFragmentState = fragmentState.mSavedFragmentState;
        } else {
            fragmentInstantiate.mSavedFragmentState = new android.os.Bundle();
        }
        if (androidx.fragment.app.FragmentManager.isLoggingEnabled(2)) {
            android.util.Log.v(TAG, "Instantiated fragment " + fragmentInstantiate);
        }
    }

    FragmentStateManager(androidx.fragment.app.FragmentLifecycleCallbacksDispatcher fragmentLifecycleCallbacksDispatcher, androidx.fragment.app.Fragment fragment, androidx.fragment.app.FragmentState fragmentState) {
        this.mDispatcher = fragmentLifecycleCallbacksDispatcher;
        this.mFragment = fragment;
        fragment.mSavedViewState = null;
        fragment.mBackStackNesting = 0;
        fragment.mInLayout = false;
        fragment.mAdded = false;
        fragment.mTargetWho = fragment.mTarget != null ? fragment.mTarget.mWho : null;
        fragment.mTarget = null;
        if (fragmentState.mSavedFragmentState != null) {
            fragment.mSavedFragmentState = fragmentState.mSavedFragmentState;
        } else {
            fragment.mSavedFragmentState = new android.os.Bundle();
        }
    }

    androidx.fragment.app.Fragment getFragment() {
        return this.mFragment;
    }

    void setFragmentManagerState(int i) {
        this.mFragmentManagerState = i;
    }

    int computeMaxState() {
        int iMin = this.mFragmentManagerState;
        if (this.mFragment.mFromLayout) {
            if (this.mFragment.mInLayout) {
                iMin = java.lang.Math.max(this.mFragmentManagerState, 1);
            } else {
                iMin = java.lang.Math.min(iMin, 1);
            }
        }
        if (!this.mFragment.mAdded) {
            iMin = java.lang.Math.min(iMin, 1);
        }
        if (this.mFragment.mRemoving) {
            if (this.mFragment.isInBackStack()) {
                iMin = java.lang.Math.min(iMin, 1);
            } else {
                iMin = java.lang.Math.min(iMin, -1);
            }
        }
        if (this.mFragment.mDeferStart && this.mFragment.mState < 3) {
            iMin = java.lang.Math.min(iMin, 2);
        }
        int i = androidx.fragment.app.FragmentStateManager.AnonymousClass1.$SwitchMap$androidx$lifecycle$Lifecycle$State[this.mFragment.mMaxState.ordinal()];
        if (i == 1) {
            return iMin;
        }
        if (i == 2) {
            return java.lang.Math.min(iMin, 3);
        }
        if (i == 3) {
            return java.lang.Math.min(iMin, 1);
        }
        return java.lang.Math.min(iMin, -1);
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentStateManager$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$androidx$lifecycle$Lifecycle$State;

        static {
            int[] iArr = new int[androidx.lifecycle.Lifecycle.State.values().length];
            $SwitchMap$androidx$lifecycle$Lifecycle$State = iArr;
            try {
                iArr[androidx.lifecycle.Lifecycle.State.RESUMED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$androidx$lifecycle$Lifecycle$State[androidx.lifecycle.Lifecycle.State.STARTED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$androidx$lifecycle$Lifecycle$State[androidx.lifecycle.Lifecycle.State.CREATED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
        }
    }

    void ensureInflatedView() {
        if (this.mFragment.mFromLayout && this.mFragment.mInLayout && !this.mFragment.mPerformedCreateView) {
            if (androidx.fragment.app.FragmentManager.isLoggingEnabled(3)) {
                android.util.Log.d(TAG, "moveto CREATE_VIEW: " + this.mFragment);
            }
            androidx.fragment.app.Fragment fragment = this.mFragment;
            fragment.performCreateView(fragment.performGetLayoutInflater(fragment.mSavedFragmentState), null, this.mFragment.mSavedFragmentState);
            if (this.mFragment.mView != null) {
                this.mFragment.mView.setSaveFromParentEnabled(false);
                if (this.mFragment.mHidden) {
                    this.mFragment.mView.setVisibility(8);
                }
                androidx.fragment.app.Fragment fragment2 = this.mFragment;
                fragment2.onViewCreated(fragment2.mView, this.mFragment.mSavedFragmentState);
                androidx.fragment.app.FragmentLifecycleCallbacksDispatcher fragmentLifecycleCallbacksDispatcher = this.mDispatcher;
                androidx.fragment.app.Fragment fragment3 = this.mFragment;
                fragmentLifecycleCallbacksDispatcher.dispatchOnFragmentViewCreated(fragment3, fragment3.mView, this.mFragment.mSavedFragmentState, false);
            }
        }
    }

    void restoreState(java.lang.ClassLoader classLoader) {
        if (this.mFragment.mSavedFragmentState == null) {
            return;
        }
        this.mFragment.mSavedFragmentState.setClassLoader(classLoader);
        androidx.fragment.app.Fragment fragment = this.mFragment;
        fragment.mSavedViewState = fragment.mSavedFragmentState.getSparseParcelableArray(VIEW_STATE_TAG);
        androidx.fragment.app.Fragment fragment2 = this.mFragment;
        fragment2.mTargetWho = fragment2.mSavedFragmentState.getString(TARGET_STATE_TAG);
        if (this.mFragment.mTargetWho != null) {
            androidx.fragment.app.Fragment fragment3 = this.mFragment;
            fragment3.mTargetRequestCode = fragment3.mSavedFragmentState.getInt(TARGET_REQUEST_CODE_STATE_TAG, 0);
        }
        if (this.mFragment.mSavedUserVisibleHint != null) {
            androidx.fragment.app.Fragment fragment4 = this.mFragment;
            fragment4.mUserVisibleHint = fragment4.mSavedUserVisibleHint.booleanValue();
            this.mFragment.mSavedUserVisibleHint = null;
        } else {
            androidx.fragment.app.Fragment fragment5 = this.mFragment;
            fragment5.mUserVisibleHint = fragment5.mSavedFragmentState.getBoolean(USER_VISIBLE_HINT_TAG, true);
        }
        if (this.mFragment.mUserVisibleHint) {
            return;
        }
        this.mFragment.mDeferStart = true;
    }

    void attach(androidx.fragment.app.FragmentHostCallback<?> fragmentHostCallback, androidx.fragment.app.FragmentManager fragmentManager, androidx.fragment.app.Fragment fragment) {
        this.mFragment.mHost = fragmentHostCallback;
        this.mFragment.mParentFragment = fragment;
        this.mFragment.mFragmentManager = fragmentManager;
        this.mDispatcher.dispatchOnFragmentPreAttached(this.mFragment, fragmentHostCallback.getContext(), false);
        this.mFragment.performAttach();
        if (this.mFragment.mParentFragment == null) {
            fragmentHostCallback.onAttachFragment(this.mFragment);
        } else {
            this.mFragment.mParentFragment.onAttachFragment(this.mFragment);
        }
        this.mDispatcher.dispatchOnFragmentAttached(this.mFragment, fragmentHostCallback.getContext(), false);
    }

    void create() {
        if (androidx.fragment.app.FragmentManager.isLoggingEnabled(3)) {
            android.util.Log.d(TAG, "moveto CREATED: " + this.mFragment);
        }
        if (!this.mFragment.mIsCreated) {
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher fragmentLifecycleCallbacksDispatcher = this.mDispatcher;
            androidx.fragment.app.Fragment fragment = this.mFragment;
            fragmentLifecycleCallbacksDispatcher.dispatchOnFragmentPreCreated(fragment, fragment.mSavedFragmentState, false);
            androidx.fragment.app.Fragment fragment2 = this.mFragment;
            fragment2.performCreate(fragment2.mSavedFragmentState);
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher fragmentLifecycleCallbacksDispatcher2 = this.mDispatcher;
            androidx.fragment.app.Fragment fragment3 = this.mFragment;
            fragmentLifecycleCallbacksDispatcher2.dispatchOnFragmentCreated(fragment3, fragment3.mSavedFragmentState, false);
            return;
        }
        androidx.fragment.app.Fragment fragment4 = this.mFragment;
        fragment4.restoreChildFragmentState(fragment4.mSavedFragmentState);
        this.mFragment.mState = 1;
    }

    void createView(androidx.fragment.app.FragmentContainer fragmentContainer) {
        java.lang.String resourceName;
        if (this.mFragment.mFromLayout) {
            return;
        }
        if (androidx.fragment.app.FragmentManager.isLoggingEnabled(3)) {
            android.util.Log.d(TAG, "moveto CREATE_VIEW: " + this.mFragment);
        }
        android.view.ViewGroup viewGroup = null;
        if (this.mFragment.mContainer != null) {
            viewGroup = this.mFragment.mContainer;
        } else if (this.mFragment.mContainerId != 0) {
            if (this.mFragment.mContainerId == -1) {
                throw new java.lang.IllegalArgumentException("Cannot create fragment " + this.mFragment + " for a container view with no id");
            }
            viewGroup = (android.view.ViewGroup) fragmentContainer.onFindViewById(this.mFragment.mContainerId);
            if (viewGroup == null && !this.mFragment.mRestored) {
                try {
                    resourceName = this.mFragment.getResources().getResourceName(this.mFragment.mContainerId);
                } catch (android.content.res.Resources.NotFoundException unused) {
                    resourceName = "unknown";
                }
                throw new java.lang.IllegalArgumentException("No view found for id 0x" + java.lang.Integer.toHexString(this.mFragment.mContainerId) + " (" + resourceName + ") for fragment " + this.mFragment);
            }
        }
        this.mFragment.mContainer = viewGroup;
        androidx.fragment.app.Fragment fragment = this.mFragment;
        fragment.performCreateView(fragment.performGetLayoutInflater(fragment.mSavedFragmentState), viewGroup, this.mFragment.mSavedFragmentState);
        if (this.mFragment.mView != null) {
            boolean z = false;
            this.mFragment.mView.setSaveFromParentEnabled(false);
            this.mFragment.mView.setTag(androidx.fragment.R.id.fragment_container_view_tag, this.mFragment);
            if (viewGroup != null) {
                viewGroup.addView(this.mFragment.mView);
            }
            if (this.mFragment.mHidden) {
                this.mFragment.mView.setVisibility(8);
            }
            androidx.core.view.ViewCompat.requestApplyInsets(this.mFragment.mView);
            androidx.fragment.app.Fragment fragment2 = this.mFragment;
            fragment2.onViewCreated(fragment2.mView, this.mFragment.mSavedFragmentState);
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher fragmentLifecycleCallbacksDispatcher = this.mDispatcher;
            androidx.fragment.app.Fragment fragment3 = this.mFragment;
            fragmentLifecycleCallbacksDispatcher.dispatchOnFragmentViewCreated(fragment3, fragment3.mView, this.mFragment.mSavedFragmentState, false);
            androidx.fragment.app.Fragment fragment4 = this.mFragment;
            if (fragment4.mView.getVisibility() == 0 && this.mFragment.mContainer != null) {
                z = true;
            }
            fragment4.mIsNewlyAdded = z;
        }
    }

    void activityCreated() {
        if (androidx.fragment.app.FragmentManager.isLoggingEnabled(3)) {
            android.util.Log.d(TAG, "moveto ACTIVITY_CREATED: " + this.mFragment);
        }
        androidx.fragment.app.Fragment fragment = this.mFragment;
        fragment.performActivityCreated(fragment.mSavedFragmentState);
        androidx.fragment.app.FragmentLifecycleCallbacksDispatcher fragmentLifecycleCallbacksDispatcher = this.mDispatcher;
        androidx.fragment.app.Fragment fragment2 = this.mFragment;
        fragmentLifecycleCallbacksDispatcher.dispatchOnFragmentActivityCreated(fragment2, fragment2.mSavedFragmentState, false);
    }

    void restoreViewState() {
        if (androidx.fragment.app.FragmentManager.isLoggingEnabled(3)) {
            android.util.Log.d(TAG, "moveto RESTORE_VIEW_STATE: " + this.mFragment);
        }
        if (this.mFragment.mView != null) {
            androidx.fragment.app.Fragment fragment = this.mFragment;
            fragment.restoreViewState(fragment.mSavedFragmentState);
        }
        this.mFragment.mSavedFragmentState = null;
    }

    void start() {
        if (androidx.fragment.app.FragmentManager.isLoggingEnabled(3)) {
            android.util.Log.d(TAG, "moveto STARTED: " + this.mFragment);
        }
        this.mFragment.performStart();
        this.mDispatcher.dispatchOnFragmentStarted(this.mFragment, false);
    }

    void resume() {
        if (androidx.fragment.app.FragmentManager.isLoggingEnabled(3)) {
            android.util.Log.d(TAG, "moveto RESUMED: " + this.mFragment);
        }
        this.mFragment.performResume();
        this.mDispatcher.dispatchOnFragmentResumed(this.mFragment, false);
        this.mFragment.mSavedFragmentState = null;
        this.mFragment.mSavedViewState = null;
    }

    void pause() {
        if (androidx.fragment.app.FragmentManager.isLoggingEnabled(3)) {
            android.util.Log.d(TAG, "movefrom RESUMED: " + this.mFragment);
        }
        this.mFragment.performPause();
        this.mDispatcher.dispatchOnFragmentPaused(this.mFragment, false);
    }

    void stop() {
        if (androidx.fragment.app.FragmentManager.isLoggingEnabled(3)) {
            android.util.Log.d(TAG, "movefrom STARTED: " + this.mFragment);
        }
        this.mFragment.performStop();
        this.mDispatcher.dispatchOnFragmentStopped(this.mFragment, false);
    }

    androidx.fragment.app.FragmentState saveState() {
        androidx.fragment.app.FragmentState fragmentState = new androidx.fragment.app.FragmentState(this.mFragment);
        if (this.mFragment.mState > -1 && fragmentState.mSavedFragmentState == null) {
            fragmentState.mSavedFragmentState = saveBasicState();
            if (this.mFragment.mTargetWho != null) {
                if (fragmentState.mSavedFragmentState == null) {
                    fragmentState.mSavedFragmentState = new android.os.Bundle();
                }
                fragmentState.mSavedFragmentState.putString(TARGET_STATE_TAG, this.mFragment.mTargetWho);
                if (this.mFragment.mTargetRequestCode != 0) {
                    fragmentState.mSavedFragmentState.putInt(TARGET_REQUEST_CODE_STATE_TAG, this.mFragment.mTargetRequestCode);
                }
            }
        } else {
            fragmentState.mSavedFragmentState = this.mFragment.mSavedFragmentState;
        }
        return fragmentState;
    }

    androidx.fragment.app.Fragment.SavedState saveInstanceState() {
        android.os.Bundle bundleSaveBasicState;
        if (this.mFragment.mState <= -1 || (bundleSaveBasicState = saveBasicState()) == null) {
            return null;
        }
        return new androidx.fragment.app.Fragment.SavedState(bundleSaveBasicState);
    }

    private android.os.Bundle saveBasicState() {
        android.os.Bundle bundle = new android.os.Bundle();
        this.mFragment.performSaveInstanceState(bundle);
        this.mDispatcher.dispatchOnFragmentSaveInstanceState(this.mFragment, bundle, false);
        if (bundle.isEmpty()) {
            bundle = null;
        }
        if (this.mFragment.mView != null) {
            saveViewState();
        }
        if (this.mFragment.mSavedViewState != null) {
            if (bundle == null) {
                bundle = new android.os.Bundle();
            }
            bundle.putSparseParcelableArray(VIEW_STATE_TAG, this.mFragment.mSavedViewState);
        }
        if (!this.mFragment.mUserVisibleHint) {
            if (bundle == null) {
                bundle = new android.os.Bundle();
            }
            bundle.putBoolean(USER_VISIBLE_HINT_TAG, this.mFragment.mUserVisibleHint);
        }
        return bundle;
    }

    void saveViewState() {
        if (this.mFragment.mView == null) {
            return;
        }
        android.util.SparseArray<android.os.Parcelable> sparseArray = new android.util.SparseArray<>();
        this.mFragment.mView.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            this.mFragment.mSavedViewState = sparseArray;
        }
    }

    void destroy(androidx.fragment.app.FragmentHostCallback<?> fragmentHostCallback, androidx.fragment.app.FragmentManagerViewModel fragmentManagerViewModel) {
        if (androidx.fragment.app.FragmentManager.isLoggingEnabled(3)) {
            android.util.Log.d(TAG, "movefrom CREATED: " + this.mFragment);
        }
        boolean zIsChangingConfigurations = true;
        boolean z = this.mFragment.mRemoving && !this.mFragment.isInBackStack();
        if (z || fragmentManagerViewModel.shouldDestroy(this.mFragment)) {
            if (fragmentHostCallback instanceof androidx.lifecycle.ViewModelStoreOwner) {
                zIsChangingConfigurations = fragmentManagerViewModel.isCleared();
            } else if (fragmentHostCallback.getContext() instanceof android.app.Activity) {
                zIsChangingConfigurations = true ^ ((android.app.Activity) fragmentHostCallback.getContext()).isChangingConfigurations();
            }
            if (z || zIsChangingConfigurations) {
                fragmentManagerViewModel.clearNonConfigState(this.mFragment);
            }
            this.mFragment.performDestroy();
            this.mDispatcher.dispatchOnFragmentDestroyed(this.mFragment, false);
            return;
        }
        this.mFragment.mState = 0;
    }

    void detach(androidx.fragment.app.FragmentManagerViewModel fragmentManagerViewModel) {
        if (androidx.fragment.app.FragmentManager.isLoggingEnabled(3)) {
            android.util.Log.d(TAG, "movefrom ATTACHED: " + this.mFragment);
        }
        this.mFragment.performDetach();
        boolean z = false;
        this.mDispatcher.dispatchOnFragmentDetached(this.mFragment, false);
        this.mFragment.mState = -1;
        this.mFragment.mHost = null;
        this.mFragment.mParentFragment = null;
        this.mFragment.mFragmentManager = null;
        if (this.mFragment.mRemoving && !this.mFragment.isInBackStack()) {
            z = true;
        }
        if (z || fragmentManagerViewModel.shouldDestroy(this.mFragment)) {
            if (androidx.fragment.app.FragmentManager.isLoggingEnabled(3)) {
                android.util.Log.d(TAG, "initState called for fragment: " + this.mFragment);
            }
            this.mFragment.initState();
        }
    }
}
