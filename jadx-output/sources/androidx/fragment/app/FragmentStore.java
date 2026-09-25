package androidx.fragment.app;

/* JADX INFO: loaded from: classes.dex */
class FragmentStore {
    private static final java.lang.String TAG = "FragmentManager";
    private final java.util.ArrayList<androidx.fragment.app.Fragment> mAdded = new java.util.ArrayList<>();
    private final java.util.HashMap<java.lang.String, androidx.fragment.app.FragmentStateManager> mActive = new java.util.HashMap<>();

    FragmentStore() {
    }

    void resetActiveFragments() {
        this.mActive.clear();
    }

    void restoreAddedFragments(java.util.List<java.lang.String> list) {
        this.mAdded.clear();
        if (list != null) {
            for (java.lang.String str : list) {
                androidx.fragment.app.Fragment fragmentFindActiveFragment = findActiveFragment(str);
                if (fragmentFindActiveFragment == null) {
                    throw new java.lang.IllegalStateException("No instantiated fragment for (" + str + ")");
                }
                if (androidx.fragment.app.FragmentManager.isLoggingEnabled(2)) {
                    android.util.Log.v(TAG, "restoreSaveState: added (" + str + "): " + fragmentFindActiveFragment);
                }
                addFragment(fragmentFindActiveFragment);
            }
        }
    }

    void makeActive(androidx.fragment.app.FragmentStateManager fragmentStateManager) {
        this.mActive.put(fragmentStateManager.getFragment().mWho, fragmentStateManager);
    }

    void addFragment(androidx.fragment.app.Fragment fragment) {
        if (this.mAdded.contains(fragment)) {
            throw new java.lang.IllegalStateException("Fragment already added: " + fragment);
        }
        synchronized (this.mAdded) {
            this.mAdded.add(fragment);
        }
        fragment.mAdded = true;
    }

    void dispatchStateChange(int i) {
        java.util.Iterator<androidx.fragment.app.Fragment> it = this.mAdded.iterator();
        while (it.hasNext()) {
            androidx.fragment.app.FragmentStateManager fragmentStateManager = this.mActive.get(it.next().mWho);
            if (fragmentStateManager != null) {
                fragmentStateManager.setFragmentManagerState(i);
            }
        }
        for (androidx.fragment.app.FragmentStateManager fragmentStateManager2 : this.mActive.values()) {
            if (fragmentStateManager2 != null) {
                fragmentStateManager2.setFragmentManagerState(i);
            }
        }
    }

    void removeFragment(androidx.fragment.app.Fragment fragment) {
        synchronized (this.mAdded) {
            this.mAdded.remove(fragment);
        }
        fragment.mAdded = false;
    }

    void makeInactive(androidx.fragment.app.FragmentStateManager fragmentStateManager) {
        androidx.fragment.app.Fragment fragment = fragmentStateManager.getFragment();
        for (androidx.fragment.app.FragmentStateManager fragmentStateManager2 : this.mActive.values()) {
            if (fragmentStateManager2 != null) {
                androidx.fragment.app.Fragment fragment2 = fragmentStateManager2.getFragment();
                if (fragment.mWho.equals(fragment2.mTargetWho)) {
                    fragment2.mTarget = fragment;
                    fragment2.mTargetWho = null;
                }
            }
        }
        this.mActive.put(fragment.mWho, null);
        if (fragment.mTargetWho != null) {
            fragment.mTarget = findActiveFragment(fragment.mTargetWho);
        }
    }

    void burpActive() {
        this.mActive.values().removeAll(java.util.Collections.singleton(null));
    }

    java.util.ArrayList<androidx.fragment.app.FragmentState> saveActiveFragments() {
        java.util.ArrayList<androidx.fragment.app.FragmentState> arrayList = new java.util.ArrayList<>(this.mActive.size());
        for (androidx.fragment.app.FragmentStateManager fragmentStateManager : this.mActive.values()) {
            if (fragmentStateManager != null) {
                androidx.fragment.app.Fragment fragment = fragmentStateManager.getFragment();
                androidx.fragment.app.FragmentState fragmentStateSaveState = fragmentStateManager.saveState();
                arrayList.add(fragmentStateSaveState);
                if (androidx.fragment.app.FragmentManager.isLoggingEnabled(2)) {
                    android.util.Log.v(TAG, "Saved state of " + fragment + ": " + fragmentStateSaveState.mSavedFragmentState);
                }
            }
        }
        return arrayList;
    }

    java.util.ArrayList<java.lang.String> saveAddedFragments() {
        synchronized (this.mAdded) {
            if (this.mAdded.isEmpty()) {
                return null;
            }
            java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>(this.mAdded.size());
            for (androidx.fragment.app.Fragment fragment : this.mAdded) {
                arrayList.add(fragment.mWho);
                if (androidx.fragment.app.FragmentManager.isLoggingEnabled(2)) {
                    android.util.Log.v(TAG, "saveAllState: adding fragment (" + fragment.mWho + "): " + fragment);
                }
            }
            return arrayList;
        }
    }

    java.util.List<androidx.fragment.app.Fragment> getFragments() {
        java.util.ArrayList arrayList;
        if (this.mAdded.isEmpty()) {
            return java.util.Collections.emptyList();
        }
        synchronized (this.mAdded) {
            arrayList = new java.util.ArrayList(this.mAdded);
        }
        return arrayList;
    }

    java.util.List<androidx.fragment.app.Fragment> getActiveFragments() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (androidx.fragment.app.FragmentStateManager fragmentStateManager : this.mActive.values()) {
            if (fragmentStateManager != null) {
                arrayList.add(fragmentStateManager.getFragment());
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    int getActiveFragmentCount() {
        return this.mActive.size();
    }

    androidx.fragment.app.Fragment findFragmentById(int i) {
        for (int size = this.mAdded.size() - 1; size >= 0; size--) {
            androidx.fragment.app.Fragment fragment = this.mAdded.get(size);
            if (fragment != null && fragment.mFragmentId == i) {
                return fragment;
            }
        }
        for (androidx.fragment.app.FragmentStateManager fragmentStateManager : this.mActive.values()) {
            if (fragmentStateManager != null) {
                androidx.fragment.app.Fragment fragment2 = fragmentStateManager.getFragment();
                if (fragment2.mFragmentId == i) {
                    return fragment2;
                }
            }
        }
        return null;
    }

    androidx.fragment.app.Fragment findFragmentByTag(java.lang.String str) {
        if (str != null) {
            for (int size = this.mAdded.size() - 1; size >= 0; size--) {
                androidx.fragment.app.Fragment fragment = this.mAdded.get(size);
                if (fragment != null && str.equals(fragment.mTag)) {
                    return fragment;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (androidx.fragment.app.FragmentStateManager fragmentStateManager : this.mActive.values()) {
            if (fragmentStateManager != null) {
                androidx.fragment.app.Fragment fragment2 = fragmentStateManager.getFragment();
                if (str.equals(fragment2.mTag)) {
                    return fragment2;
                }
            }
        }
        return null;
    }

    boolean containsActiveFragment(java.lang.String str) {
        return this.mActive.containsKey(str);
    }

    androidx.fragment.app.FragmentStateManager getFragmentStateManager(java.lang.String str) {
        return this.mActive.get(str);
    }

    androidx.fragment.app.Fragment findFragmentByWho(java.lang.String str) {
        androidx.fragment.app.Fragment fragmentFindFragmentByWho;
        for (androidx.fragment.app.FragmentStateManager fragmentStateManager : this.mActive.values()) {
            if (fragmentStateManager != null && (fragmentFindFragmentByWho = fragmentStateManager.getFragment().findFragmentByWho(str)) != null) {
                return fragmentFindFragmentByWho;
            }
        }
        return null;
    }

    androidx.fragment.app.Fragment findActiveFragment(java.lang.String str) {
        androidx.fragment.app.FragmentStateManager fragmentStateManager = this.mActive.get(str);
        if (fragmentStateManager != null) {
            return fragmentStateManager.getFragment();
        }
        return null;
    }

    androidx.fragment.app.Fragment findFragmentUnder(androidx.fragment.app.Fragment fragment) {
        android.view.ViewGroup viewGroup = fragment.mContainer;
        android.view.View view = fragment.mView;
        if (viewGroup != null && view != null) {
            for (int iIndexOf = this.mAdded.indexOf(fragment) - 1; iIndexOf >= 0; iIndexOf--) {
                androidx.fragment.app.Fragment fragment2 = this.mAdded.get(iIndexOf);
                if (fragment2.mContainer == viewGroup && fragment2.mView != null) {
                    return fragment2;
                }
            }
        }
        return null;
    }

    void dump(java.lang.String str, java.io.FileDescriptor fileDescriptor, java.io.PrintWriter printWriter, java.lang.String[] strArr) {
        java.lang.String str2 = str + "    ";
        if (!this.mActive.isEmpty()) {
            printWriter.print(str);
            printWriter.print("Active Fragments:");
            for (androidx.fragment.app.FragmentStateManager fragmentStateManager : this.mActive.values()) {
                printWriter.print(str);
                if (fragmentStateManager != null) {
                    androidx.fragment.app.Fragment fragment = fragmentStateManager.getFragment();
                    printWriter.println(fragment);
                    fragment.dump(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size = this.mAdded.size();
        if (size > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size; i++) {
                androidx.fragment.app.Fragment fragment2 = this.mAdded.get(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(fragment2.toString());
            }
        }
    }
}
