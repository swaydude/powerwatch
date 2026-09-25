package androidx.fragment.app;

/* JADX INFO: loaded from: classes.dex */
public class FragmentActivity extends androidx.activity.ComponentActivity implements androidx.core.app.ActivityCompat.OnRequestPermissionsResultCallback, androidx.core.app.ActivityCompat.RequestPermissionsRequestCodeValidator {
    static final java.lang.String ALLOCATED_REQUEST_INDICIES_TAG = "android:support:request_indicies";
    static final java.lang.String FRAGMENTS_TAG = "android:support:fragments";
    static final int MAX_NUM_PENDING_FRAGMENT_ACTIVITY_RESULTS = 65534;
    static final java.lang.String NEXT_CANDIDATE_REQUEST_INDEX_TAG = "android:support:next_request_index";
    static final java.lang.String REQUEST_FRAGMENT_WHO_TAG = "android:support:request_fragment_who";
    private static final java.lang.String TAG = "FragmentActivity";
    boolean mCreated;
    final androidx.lifecycle.LifecycleRegistry mFragmentLifecycleRegistry;
    final androidx.fragment.app.FragmentController mFragments;
    int mNextCandidateRequestIndex;
    androidx.collection.SparseArrayCompat<java.lang.String> mPendingFragmentActivityResults;
    boolean mRequestedPermissionsFromFragment;
    boolean mResumed;
    boolean mStartedActivityFromFragment;
    boolean mStartedIntentSenderFromFragment;
    boolean mStopped;

    public void onAttachFragment(androidx.fragment.app.Fragment fragment) {
    }

    public FragmentActivity() {
        this.mFragments = androidx.fragment.app.FragmentController.createController(new androidx.fragment.app.FragmentActivity.HostCallbacks());
        this.mFragmentLifecycleRegistry = new androidx.lifecycle.LifecycleRegistry(this);
        this.mStopped = true;
    }

    public FragmentActivity(int i) {
        super(i);
        this.mFragments = androidx.fragment.app.FragmentController.createController(new androidx.fragment.app.FragmentActivity.HostCallbacks());
        this.mFragmentLifecycleRegistry = new androidx.lifecycle.LifecycleRegistry(this);
        this.mStopped = true;
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i, int i2, android.content.Intent intent) {
        this.mFragments.noteStateNotSaved();
        int i3 = i >> 16;
        if (i3 != 0) {
            int i4 = i3 - 1;
            java.lang.String str = this.mPendingFragmentActivityResults.get(i4);
            this.mPendingFragmentActivityResults.remove(i4);
            if (str == null) {
                android.util.Log.w(TAG, "Activity result delivered for unknown Fragment.");
                return;
            }
            androidx.fragment.app.Fragment fragmentFindFragmentByWho = this.mFragments.findFragmentByWho(str);
            if (fragmentFindFragmentByWho == null) {
                android.util.Log.w(TAG, "Activity result no fragment exists for who: " + str);
                return;
            }
            fragmentFindFragmentByWho.onActivityResult(i & androidx.core.internal.view.SupportMenu.USER_MASK, i2, intent);
            return;
        }
        androidx.core.app.ActivityCompat.PermissionCompatDelegate permissionCompatDelegate = androidx.core.app.ActivityCompat.getPermissionCompatDelegate();
        if (permissionCompatDelegate == null || !permissionCompatDelegate.onActivityResult(this, i, i2, intent)) {
            super.onActivityResult(i, i2, intent);
        }
    }

    public void supportFinishAfterTransition() {
        androidx.core.app.ActivityCompat.finishAfterTransition(this);
    }

    public void setEnterSharedElementCallback(androidx.core.app.SharedElementCallback sharedElementCallback) {
        androidx.core.app.ActivityCompat.setEnterSharedElementCallback(this, sharedElementCallback);
    }

    public void setExitSharedElementCallback(androidx.core.app.SharedElementCallback sharedElementCallback) {
        androidx.core.app.ActivityCompat.setExitSharedElementCallback(this, sharedElementCallback);
    }

    public void supportPostponeEnterTransition() {
        androidx.core.app.ActivityCompat.postponeEnterTransition(this);
    }

    public void supportStartPostponedEnterTransition() {
        androidx.core.app.ActivityCompat.startPostponedEnterTransition(this);
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z) {
        this.mFragments.dispatchMultiWindowModeChanged(z);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z) {
        this.mFragments.dispatchPictureInPictureModeChanged(z);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.mFragments.noteStateNotSaved();
        this.mFragments.dispatchConfigurationChanged(configuration);
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(android.os.Bundle bundle) {
        this.mFragments.attachHost(null);
        if (bundle != null) {
            this.mFragments.restoreSaveState(bundle.getParcelable(FRAGMENTS_TAG));
            if (bundle.containsKey(NEXT_CANDIDATE_REQUEST_INDEX_TAG)) {
                this.mNextCandidateRequestIndex = bundle.getInt(NEXT_CANDIDATE_REQUEST_INDEX_TAG);
                int[] intArray = bundle.getIntArray(ALLOCATED_REQUEST_INDICIES_TAG);
                java.lang.String[] stringArray = bundle.getStringArray(REQUEST_FRAGMENT_WHO_TAG);
                if (intArray == null || stringArray == null || intArray.length != stringArray.length) {
                    android.util.Log.w(TAG, "Invalid requestCode mapping in savedInstanceState.");
                } else {
                    this.mPendingFragmentActivityResults = new androidx.collection.SparseArrayCompat<>(intArray.length);
                    for (int i = 0; i < intArray.length; i++) {
                        this.mPendingFragmentActivityResults.put(intArray[i], stringArray[i]);
                    }
                }
            }
        }
        if (this.mPendingFragmentActivityResults == null) {
            this.mPendingFragmentActivityResults = new androidx.collection.SparseArrayCompat<>();
            this.mNextCandidateRequestIndex = 0;
        }
        super.onCreate(bundle);
        this.mFragmentLifecycleRegistry.handleLifecycleEvent(androidx.lifecycle.Lifecycle.Event.ON_CREATE);
        this.mFragments.dispatchCreate();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i, android.view.Menu menu) {
        if (i == 0) {
            return super.onCreatePanelMenu(i, menu) | this.mFragments.dispatchCreateOptionsMenu(menu, getMenuInflater());
        }
        return super.onCreatePanelMenu(i, menu);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public android.view.View onCreateView(android.view.View view, java.lang.String str, android.content.Context context, android.util.AttributeSet attributeSet) {
        android.view.View viewDispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(view, str, context, attributeSet);
        return viewDispatchFragmentsOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : viewDispatchFragmentsOnCreateView;
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public android.view.View onCreateView(java.lang.String str, android.content.Context context, android.util.AttributeSet attributeSet) {
        android.view.View viewDispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(null, str, context, attributeSet);
        return viewDispatchFragmentsOnCreateView == null ? super.onCreateView(str, context, attributeSet) : viewDispatchFragmentsOnCreateView;
    }

    final android.view.View dispatchFragmentsOnCreateView(android.view.View view, java.lang.String str, android.content.Context context, android.util.AttributeSet attributeSet) {
        return this.mFragments.onCreateView(view, str, context, attributeSet);
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        this.mFragments.dispatchDestroy();
        this.mFragmentLifecycleRegistry.handleLifecycleEvent(androidx.lifecycle.Lifecycle.Event.ON_DESTROY);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        this.mFragments.dispatchLowMemory();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, android.view.MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            return this.mFragments.dispatchOptionsItemSelected(menuItem);
        }
        if (i != 6) {
            return false;
        }
        return this.mFragments.dispatchContextItemSelected(menuItem);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, android.view.Menu menu) {
        if (i == 0) {
            this.mFragments.dispatchOptionsMenuClosed(menu);
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        this.mResumed = false;
        this.mFragments.dispatchPause();
        this.mFragmentLifecycleRegistry.handleLifecycleEvent(androidx.lifecycle.Lifecycle.Event.ON_PAUSE);
    }

    @Override // android.app.Activity
    protected void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
        this.mFragments.noteStateNotSaved();
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.mFragments.noteStateNotSaved();
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        this.mResumed = true;
        this.mFragments.noteStateNotSaved();
        this.mFragments.execPendingActions();
    }

    @Override // android.app.Activity
    protected void onPostResume() {
        super.onPostResume();
        onResumeFragments();
    }

    protected void onResumeFragments() {
        this.mFragmentLifecycleRegistry.handleLifecycleEvent(androidx.lifecycle.Lifecycle.Event.ON_RESUME);
        this.mFragments.dispatchResume();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i, android.view.View view, android.view.Menu menu) {
        if (i == 0) {
            return onPrepareOptionsPanel(view, menu) | this.mFragments.dispatchPrepareOptionsMenu(menu);
        }
        return super.onPreparePanel(i, view, menu);
    }

    @java.lang.Deprecated
    protected boolean onPrepareOptionsPanel(android.view.View view, android.view.Menu menu) {
        return super.onPreparePanel(0, view, menu);
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onSaveInstanceState(android.os.Bundle bundle) {
        super.onSaveInstanceState(bundle);
        markFragmentsCreated();
        this.mFragmentLifecycleRegistry.handleLifecycleEvent(androidx.lifecycle.Lifecycle.Event.ON_STOP);
        android.os.Parcelable parcelableSaveAllState = this.mFragments.saveAllState();
        if (parcelableSaveAllState != null) {
            bundle.putParcelable(FRAGMENTS_TAG, parcelableSaveAllState);
        }
        if (this.mPendingFragmentActivityResults.size() > 0) {
            bundle.putInt(NEXT_CANDIDATE_REQUEST_INDEX_TAG, this.mNextCandidateRequestIndex);
            int[] iArr = new int[this.mPendingFragmentActivityResults.size()];
            java.lang.String[] strArr = new java.lang.String[this.mPendingFragmentActivityResults.size()];
            for (int i = 0; i < this.mPendingFragmentActivityResults.size(); i++) {
                iArr[i] = this.mPendingFragmentActivityResults.keyAt(i);
                strArr[i] = this.mPendingFragmentActivityResults.valueAt(i);
            }
            bundle.putIntArray(ALLOCATED_REQUEST_INDICIES_TAG, iArr);
            bundle.putStringArray(REQUEST_FRAGMENT_WHO_TAG, strArr);
        }
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        this.mStopped = false;
        if (!this.mCreated) {
            this.mCreated = true;
            this.mFragments.dispatchActivityCreated();
        }
        this.mFragments.noteStateNotSaved();
        this.mFragments.execPendingActions();
        this.mFragmentLifecycleRegistry.handleLifecycleEvent(androidx.lifecycle.Lifecycle.Event.ON_START);
        this.mFragments.dispatchStart();
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        this.mStopped = true;
        markFragmentsCreated();
        this.mFragments.dispatchStop();
        this.mFragmentLifecycleRegistry.handleLifecycleEvent(androidx.lifecycle.Lifecycle.Event.ON_STOP);
    }

    @java.lang.Deprecated
    public void supportInvalidateOptionsMenu() {
        invalidateOptionsMenu();
    }

    @Override // android.app.Activity
    public void dump(java.lang.String str, java.io.FileDescriptor fileDescriptor, java.io.PrintWriter printWriter, java.lang.String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)));
        printWriter.println(" State:");
        java.lang.String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.mCreated);
        printWriter.print(" mResumed=");
        printWriter.print(this.mResumed);
        printWriter.print(" mStopped=");
        printWriter.print(this.mStopped);
        if (getApplication() != null) {
            androidx.loader.app.LoaderManager.getInstance(this).dump(str2, fileDescriptor, printWriter, strArr);
        }
        this.mFragments.getSupportFragmentManager().dump(str, fileDescriptor, printWriter, strArr);
    }

    public androidx.fragment.app.FragmentManager getSupportFragmentManager() {
        return this.mFragments.getSupportFragmentManager();
    }

    @java.lang.Deprecated
    public androidx.loader.app.LoaderManager getSupportLoaderManager() {
        return androidx.loader.app.LoaderManager.getInstance(this);
    }

    @Override // android.app.Activity
    public void startActivityForResult(android.content.Intent intent, int i) {
        if (!this.mStartedActivityFromFragment && i != -1) {
            checkForValidRequestCode(i);
        }
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity
    public void startActivityForResult(android.content.Intent intent, int i, android.os.Bundle bundle) {
        if (!this.mStartedActivityFromFragment && i != -1) {
            checkForValidRequestCode(i);
        }
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(android.content.IntentSender intentSender, int i, android.content.Intent intent, int i2, int i3, int i4) throws android.content.IntentSender.SendIntentException {
        if (!this.mStartedIntentSenderFromFragment && i != -1) {
            checkForValidRequestCode(i);
        }
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(android.content.IntentSender intentSender, int i, android.content.Intent intent, int i2, int i3, int i4, android.os.Bundle bundle) throws android.content.IntentSender.SendIntentException {
        if (!this.mStartedIntentSenderFromFragment && i != -1) {
            checkForValidRequestCode(i);
        }
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    static void checkForValidRequestCode(int i) {
        if ((i & androidx.core.internal.view.SupportMenu.CATEGORY_MASK) != 0) {
            throw new java.lang.IllegalArgumentException("Can only use lower 16 bits for requestCode");
        }
    }

    @Override // androidx.core.app.ActivityCompat.RequestPermissionsRequestCodeValidator
    public final void validateRequestPermissionsRequestCode(int i) {
        if (this.mRequestedPermissionsFromFragment || i == -1) {
            return;
        }
        checkForValidRequestCode(i);
    }

    @Override // android.app.Activity, androidx.core.app.ActivityCompat.OnRequestPermissionsResultCallback
    public void onRequestPermissionsResult(int i, java.lang.String[] strArr, int[] iArr) {
        this.mFragments.noteStateNotSaved();
        int i2 = (i >> 16) & androidx.core.internal.view.SupportMenu.USER_MASK;
        if (i2 != 0) {
            int i3 = i2 - 1;
            java.lang.String str = this.mPendingFragmentActivityResults.get(i3);
            this.mPendingFragmentActivityResults.remove(i3);
            if (str == null) {
                android.util.Log.w(TAG, "Activity result delivered for unknown Fragment.");
                return;
            }
            androidx.fragment.app.Fragment fragmentFindFragmentByWho = this.mFragments.findFragmentByWho(str);
            if (fragmentFindFragmentByWho == null) {
                android.util.Log.w(TAG, "Activity result no fragment exists for who: " + str);
                return;
            }
            fragmentFindFragmentByWho.onRequestPermissionsResult(i & androidx.core.internal.view.SupportMenu.USER_MASK, strArr, iArr);
        }
    }

    public void startActivityFromFragment(androidx.fragment.app.Fragment fragment, android.content.Intent intent, int i) {
        startActivityFromFragment(fragment, intent, i, (android.os.Bundle) null);
    }

    public void startActivityFromFragment(androidx.fragment.app.Fragment fragment, android.content.Intent intent, int i, android.os.Bundle bundle) {
        this.mStartedActivityFromFragment = true;
        try {
            if (i == -1) {
                androidx.core.app.ActivityCompat.startActivityForResult(this, intent, -1, bundle);
                this.mStartedActivityFromFragment = false;
            } else {
                checkForValidRequestCode(i);
                androidx.core.app.ActivityCompat.startActivityForResult(this, intent, ((allocateRequestIndex(fragment) + 1) << 16) + (i & androidx.core.internal.view.SupportMenu.USER_MASK), bundle);
                this.mStartedActivityFromFragment = false;
            }
        } catch (java.lang.Throwable th) {
            this.mStartedActivityFromFragment = false;
            throw th;
        }
    }

    public void startIntentSenderFromFragment(androidx.fragment.app.Fragment fragment, android.content.IntentSender intentSender, int i, android.content.Intent intent, int i2, int i3, int i4, android.os.Bundle bundle) throws android.content.IntentSender.SendIntentException {
        this.mStartedIntentSenderFromFragment = true;
        try {
            if (i == -1) {
                androidx.core.app.ActivityCompat.startIntentSenderForResult(this, intentSender, i, intent, i2, i3, i4, bundle);
                this.mStartedIntentSenderFromFragment = false;
            } else {
                checkForValidRequestCode(i);
                androidx.core.app.ActivityCompat.startIntentSenderForResult(this, intentSender, ((allocateRequestIndex(fragment) + 1) << 16) + (i & androidx.core.internal.view.SupportMenu.USER_MASK), intent, i2, i3, i4, bundle);
                this.mStartedIntentSenderFromFragment = false;
            }
        } catch (java.lang.Throwable th) {
            this.mStartedIntentSenderFromFragment = false;
            throw th;
        }
    }

    private int allocateRequestIndex(androidx.fragment.app.Fragment fragment) {
        if (this.mPendingFragmentActivityResults.size() >= MAX_NUM_PENDING_FRAGMENT_ACTIVITY_RESULTS) {
            throw new java.lang.IllegalStateException("Too many pending Fragment activity results.");
        }
        while (this.mPendingFragmentActivityResults.indexOfKey(this.mNextCandidateRequestIndex) >= 0) {
            this.mNextCandidateRequestIndex = (this.mNextCandidateRequestIndex + 1) % MAX_NUM_PENDING_FRAGMENT_ACTIVITY_RESULTS;
        }
        int i = this.mNextCandidateRequestIndex;
        this.mPendingFragmentActivityResults.put(i, fragment.mWho);
        this.mNextCandidateRequestIndex = (this.mNextCandidateRequestIndex + 1) % MAX_NUM_PENDING_FRAGMENT_ACTIVITY_RESULTS;
        return i;
    }

    void requestPermissionsFromFragment(androidx.fragment.app.Fragment fragment, java.lang.String[] strArr, int i) {
        if (i == -1) {
            androidx.core.app.ActivityCompat.requestPermissions(this, strArr, i);
            return;
        }
        checkForValidRequestCode(i);
        try {
            this.mRequestedPermissionsFromFragment = true;
            androidx.core.app.ActivityCompat.requestPermissions(this, strArr, ((allocateRequestIndex(fragment) + 1) << 16) + (i & androidx.core.internal.view.SupportMenu.USER_MASK));
        } finally {
            this.mRequestedPermissionsFromFragment = false;
        }
    }

    class HostCallbacks extends androidx.fragment.app.FragmentHostCallback<androidx.fragment.app.FragmentActivity> implements androidx.lifecycle.ViewModelStoreOwner, androidx.activity.OnBackPressedDispatcherOwner {
        public HostCallbacks() {
            super(androidx.fragment.app.FragmentActivity.this);
        }

        @Override // androidx.lifecycle.LifecycleOwner
        public androidx.lifecycle.Lifecycle getLifecycle() {
            return androidx.fragment.app.FragmentActivity.this.mFragmentLifecycleRegistry;
        }

        @Override // androidx.lifecycle.ViewModelStoreOwner
        public androidx.lifecycle.ViewModelStore getViewModelStore() {
            return androidx.fragment.app.FragmentActivity.this.getViewModelStore();
        }

        @Override // androidx.activity.OnBackPressedDispatcherOwner
        public androidx.activity.OnBackPressedDispatcher getOnBackPressedDispatcher() {
            return androidx.fragment.app.FragmentActivity.this.getOnBackPressedDispatcher();
        }

        @Override // androidx.fragment.app.FragmentHostCallback
        public void onDump(java.lang.String str, java.io.FileDescriptor fileDescriptor, java.io.PrintWriter printWriter, java.lang.String[] strArr) {
            androidx.fragment.app.FragmentActivity.this.dump(str, fileDescriptor, printWriter, strArr);
        }

        @Override // androidx.fragment.app.FragmentHostCallback
        public boolean onShouldSaveFragmentState(androidx.fragment.app.Fragment fragment) {
            return !androidx.fragment.app.FragmentActivity.this.isFinishing();
        }

        @Override // androidx.fragment.app.FragmentHostCallback
        public android.view.LayoutInflater onGetLayoutInflater() {
            return androidx.fragment.app.FragmentActivity.this.getLayoutInflater().cloneInContext(androidx.fragment.app.FragmentActivity.this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.fragment.app.FragmentHostCallback
        public androidx.fragment.app.FragmentActivity onGetHost() {
            return androidx.fragment.app.FragmentActivity.this;
        }

        @Override // androidx.fragment.app.FragmentHostCallback
        public void onSupportInvalidateOptionsMenu() {
            androidx.fragment.app.FragmentActivity.this.supportInvalidateOptionsMenu();
        }

        @Override // androidx.fragment.app.FragmentHostCallback
        public void onStartActivityFromFragment(androidx.fragment.app.Fragment fragment, android.content.Intent intent, int i) {
            androidx.fragment.app.FragmentActivity.this.startActivityFromFragment(fragment, intent, i);
        }

        @Override // androidx.fragment.app.FragmentHostCallback
        public void onStartActivityFromFragment(androidx.fragment.app.Fragment fragment, android.content.Intent intent, int i, android.os.Bundle bundle) {
            androidx.fragment.app.FragmentActivity.this.startActivityFromFragment(fragment, intent, i, bundle);
        }

        @Override // androidx.fragment.app.FragmentHostCallback
        public void onStartIntentSenderFromFragment(androidx.fragment.app.Fragment fragment, android.content.IntentSender intentSender, int i, android.content.Intent intent, int i2, int i3, int i4, android.os.Bundle bundle) throws android.content.IntentSender.SendIntentException {
            androidx.fragment.app.FragmentActivity.this.startIntentSenderFromFragment(fragment, intentSender, i, intent, i2, i3, i4, bundle);
        }

        @Override // androidx.fragment.app.FragmentHostCallback
        public void onRequestPermissionsFromFragment(androidx.fragment.app.Fragment fragment, java.lang.String[] strArr, int i) {
            androidx.fragment.app.FragmentActivity.this.requestPermissionsFromFragment(fragment, strArr, i);
        }

        @Override // androidx.fragment.app.FragmentHostCallback
        public boolean onShouldShowRequestPermissionRationale(java.lang.String str) {
            return androidx.core.app.ActivityCompat.shouldShowRequestPermissionRationale(androidx.fragment.app.FragmentActivity.this, str);
        }

        @Override // androidx.fragment.app.FragmentHostCallback
        public boolean onHasWindowAnimations() {
            return androidx.fragment.app.FragmentActivity.this.getWindow() != null;
        }

        @Override // androidx.fragment.app.FragmentHostCallback
        public int onGetWindowAnimations() {
            android.view.Window window = androidx.fragment.app.FragmentActivity.this.getWindow();
            if (window == null) {
                return 0;
            }
            return window.getAttributes().windowAnimations;
        }

        @Override // androidx.fragment.app.FragmentHostCallback
        public void onAttachFragment(androidx.fragment.app.Fragment fragment) {
            androidx.fragment.app.FragmentActivity.this.onAttachFragment(fragment);
        }

        @Override // androidx.fragment.app.FragmentHostCallback, androidx.fragment.app.FragmentContainer
        public android.view.View onFindViewById(int i) {
            return androidx.fragment.app.FragmentActivity.this.findViewById(i);
        }

        @Override // androidx.fragment.app.FragmentHostCallback, androidx.fragment.app.FragmentContainer
        public boolean onHasView() {
            android.view.Window window = androidx.fragment.app.FragmentActivity.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }
    }

    private void markFragmentsCreated() {
        while (markState(getSupportFragmentManager(), androidx.lifecycle.Lifecycle.State.CREATED)) {
        }
    }

    private static boolean markState(androidx.fragment.app.FragmentManager fragmentManager, androidx.lifecycle.Lifecycle.State state) {
        boolean zMarkState = false;
        for (androidx.fragment.app.Fragment fragment : fragmentManager.getFragments()) {
            if (fragment != null) {
                if (fragment.getHost() != null) {
                    zMarkState |= markState(fragment.getChildFragmentManager(), state);
                }
                if (fragment.getLifecycle().getCurrentState().isAtLeast(androidx.lifecycle.Lifecycle.State.STARTED)) {
                    fragment.mLifecycleRegistry.setCurrentState(state);
                    zMarkState = true;
                }
            }
        }
        return zMarkState;
    }
}
