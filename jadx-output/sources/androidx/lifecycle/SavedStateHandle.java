package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
public final class SavedStateHandle {
    private static final java.lang.Class[] ACCEPTABLE_CLASSES;
    private static final java.lang.String KEYS = "keys";
    private static final java.lang.String VALUES = "values";
    private final java.util.Map<java.lang.String, androidx.lifecycle.SavedStateHandle.SavingStateLiveData<?>> mLiveDatas;
    final java.util.Map<java.lang.String, java.lang.Object> mRegular;
    private final androidx.savedstate.SavedStateRegistry.SavedStateProvider mSavedStateProvider;

    public SavedStateHandle(java.util.Map<java.lang.String, java.lang.Object> map) {
        this.mLiveDatas = new java.util.HashMap();
        this.mSavedStateProvider = new androidx.savedstate.SavedStateRegistry.SavedStateProvider() { // from class: androidx.lifecycle.SavedStateHandle.1
            @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
            public android.os.Bundle saveState() {
                java.util.Set<java.lang.String> setKeySet = androidx.lifecycle.SavedStateHandle.this.mRegular.keySet();
                java.util.ArrayList<? extends android.os.Parcelable> arrayList = new java.util.ArrayList<>(setKeySet.size());
                java.util.ArrayList<? extends android.os.Parcelable> arrayList2 = new java.util.ArrayList<>(arrayList.size());
                for (java.lang.String str : setKeySet) {
                    arrayList.add(str);
                    arrayList2.add(androidx.lifecycle.SavedStateHandle.this.mRegular.get(str));
                }
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putParcelableArrayList(androidx.lifecycle.SavedStateHandle.KEYS, arrayList);
                bundle.putParcelableArrayList(androidx.lifecycle.SavedStateHandle.VALUES, arrayList2);
                return bundle;
            }
        };
        this.mRegular = new java.util.HashMap(map);
    }

    public SavedStateHandle() {
        this.mLiveDatas = new java.util.HashMap();
        this.mSavedStateProvider = new androidx.savedstate.SavedStateRegistry.SavedStateProvider() { // from class: androidx.lifecycle.SavedStateHandle.1
            @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
            public android.os.Bundle saveState() {
                java.util.Set<java.lang.String> setKeySet = androidx.lifecycle.SavedStateHandle.this.mRegular.keySet();
                java.util.ArrayList<? extends android.os.Parcelable> arrayList = new java.util.ArrayList<>(setKeySet.size());
                java.util.ArrayList<? extends android.os.Parcelable> arrayList2 = new java.util.ArrayList<>(arrayList.size());
                for (java.lang.String str : setKeySet) {
                    arrayList.add(str);
                    arrayList2.add(androidx.lifecycle.SavedStateHandle.this.mRegular.get(str));
                }
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putParcelableArrayList(androidx.lifecycle.SavedStateHandle.KEYS, arrayList);
                bundle.putParcelableArrayList(androidx.lifecycle.SavedStateHandle.VALUES, arrayList2);
                return bundle;
            }
        };
        this.mRegular = new java.util.HashMap();
    }

    static androidx.lifecycle.SavedStateHandle createHandle(android.os.Bundle bundle, android.os.Bundle bundle2) {
        if (bundle == null && bundle2 == null) {
            return new androidx.lifecycle.SavedStateHandle();
        }
        java.util.HashMap map = new java.util.HashMap();
        if (bundle2 != null) {
            for (java.lang.String str : bundle2.keySet()) {
                map.put(str, bundle2.get(str));
            }
        }
        if (bundle == null) {
            return new androidx.lifecycle.SavedStateHandle(map);
        }
        java.util.ArrayList parcelableArrayList = bundle.getParcelableArrayList(KEYS);
        java.util.ArrayList parcelableArrayList2 = bundle.getParcelableArrayList(VALUES);
        if (parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) {
            throw new java.lang.IllegalStateException("Invalid bundle passed as restored state");
        }
        for (int i = 0; i < parcelableArrayList.size(); i++) {
            map.put((java.lang.String) parcelableArrayList.get(i), parcelableArrayList2.get(i));
        }
        return new androidx.lifecycle.SavedStateHandle(map);
    }

    androidx.savedstate.SavedStateRegistry.SavedStateProvider savedStateProvider() {
        return this.mSavedStateProvider;
    }

    public boolean contains(java.lang.String str) {
        return this.mRegular.containsKey(str);
    }

    public <T> androidx.lifecycle.MutableLiveData<T> getLiveData(java.lang.String str) {
        return getLiveDataInternal(str, false, null);
    }

    public <T> androidx.lifecycle.MutableLiveData<T> getLiveData(java.lang.String str, T t) {
        return getLiveDataInternal(str, true, t);
    }

    private <T> androidx.lifecycle.MutableLiveData<T> getLiveDataInternal(java.lang.String str, boolean z, T t) {
        androidx.lifecycle.SavedStateHandle.SavingStateLiveData<?> savingStateLiveData;
        androidx.lifecycle.SavedStateHandle.SavingStateLiveData<?> savingStateLiveData2 = this.mLiveDatas.get(str);
        if (savingStateLiveData2 != null) {
            return savingStateLiveData2;
        }
        if (this.mRegular.containsKey(str)) {
            savingStateLiveData = new androidx.lifecycle.SavedStateHandle.SavingStateLiveData<>(this, str, this.mRegular.get(str));
        } else if (z) {
            savingStateLiveData = new androidx.lifecycle.SavedStateHandle.SavingStateLiveData<>(this, str, t);
        } else {
            savingStateLiveData = new androidx.lifecycle.SavedStateHandle.SavingStateLiveData<>(this, str);
        }
        this.mLiveDatas.put(str, savingStateLiveData);
        return savingStateLiveData;
    }

    public java.util.Set<java.lang.String> keys() {
        return java.util.Collections.unmodifiableSet(this.mRegular.keySet());
    }

    public <T> T get(java.lang.String str) {
        return (T) this.mRegular.get(str);
    }

    public <T> void set(java.lang.String str, T t) {
        validateValue(t);
        androidx.lifecycle.SavedStateHandle.SavingStateLiveData<?> savingStateLiveData = this.mLiveDatas.get(str);
        if (savingStateLiveData != null) {
            savingStateLiveData.setValue(t);
        } else {
            this.mRegular.put(str, t);
        }
    }

    private static void validateValue(java.lang.Object obj) {
        if (obj == null) {
            return;
        }
        for (java.lang.Class cls : ACCEPTABLE_CLASSES) {
            if (cls.isInstance(obj)) {
                return;
            }
        }
        throw new java.lang.IllegalArgumentException("Can't put value with type " + obj.getClass() + " into saved state");
    }

    public <T> T remove(java.lang.String str) {
        T t = (T) this.mRegular.remove(str);
        androidx.lifecycle.SavedStateHandle.SavingStateLiveData<?> savingStateLiveDataRemove = this.mLiveDatas.remove(str);
        if (savingStateLiveDataRemove != null) {
            savingStateLiveDataRemove.detach();
        }
        return t;
    }

    static class SavingStateLiveData<T> extends androidx.lifecycle.MutableLiveData<T> {
        private androidx.lifecycle.SavedStateHandle mHandle;
        private java.lang.String mKey;

        SavingStateLiveData(androidx.lifecycle.SavedStateHandle savedStateHandle, java.lang.String str, T t) {
            super(t);
            this.mKey = str;
            this.mHandle = savedStateHandle;
        }

        SavingStateLiveData(androidx.lifecycle.SavedStateHandle savedStateHandle, java.lang.String str) {
            this.mKey = str;
            this.mHandle = savedStateHandle;
        }

        @Override // androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData
        public void setValue(T t) {
            androidx.lifecycle.SavedStateHandle savedStateHandle = this.mHandle;
            if (savedStateHandle != null) {
                savedStateHandle.mRegular.put(this.mKey, t);
            }
            super.setValue(t);
        }

        void detach() {
            this.mHandle = null;
        }
    }

    static {
        java.lang.Class[] clsArr = new java.lang.Class[29];
        clsArr[0] = java.lang.Boolean.TYPE;
        clsArr[1] = boolean[].class;
        clsArr[2] = java.lang.Double.TYPE;
        clsArr[3] = double[].class;
        clsArr[4] = java.lang.Integer.TYPE;
        clsArr[5] = int[].class;
        clsArr[6] = java.lang.Long.TYPE;
        clsArr[7] = long[].class;
        clsArr[8] = java.lang.String.class;
        clsArr[9] = java.lang.String[].class;
        clsArr[10] = android.os.Binder.class;
        clsArr[11] = android.os.Bundle.class;
        clsArr[12] = java.lang.Byte.TYPE;
        clsArr[13] = byte[].class;
        clsArr[14] = java.lang.Character.TYPE;
        clsArr[15] = char[].class;
        clsArr[16] = java.lang.CharSequence.class;
        clsArr[17] = java.lang.CharSequence[].class;
        clsArr[18] = java.util.ArrayList.class;
        clsArr[19] = java.lang.Float.TYPE;
        clsArr[20] = float[].class;
        clsArr[21] = android.os.Parcelable.class;
        clsArr[22] = android.os.Parcelable[].class;
        clsArr[23] = java.io.Serializable.class;
        clsArr[24] = java.lang.Short.TYPE;
        clsArr[25] = short[].class;
        clsArr[26] = android.util.SparseArray.class;
        clsArr[27] = android.os.Build.VERSION.SDK_INT >= 21 ? android.util.Size.class : java.lang.Integer.TYPE;
        clsArr[28] = android.os.Build.VERSION.SDK_INT >= 21 ? android.util.SizeF.class : java.lang.Integer.TYPE;
        ACCEPTABLE_CLASSES = clsArr;
    }
}
