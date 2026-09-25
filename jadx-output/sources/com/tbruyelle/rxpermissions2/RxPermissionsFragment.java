package com.tbruyelle.rxpermissions2;

/* JADX INFO: loaded from: classes2.dex */
public class RxPermissionsFragment extends androidx.fragment.app.Fragment {
    private static final int PERMISSIONS_REQUEST_CODE = 42;
    private boolean mLogging;
    private java.util.Map<java.lang.String, io.reactivex.subjects.PublishSubject<com.tbruyelle.rxpermissions2.Permission>> mSubjects = new java.util.HashMap();

    @Override // androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
    }

    void requestPermissions(java.lang.String[] strArr) {
        requestPermissions(strArr, 42);
    }

    @Override // androidx.fragment.app.Fragment
    public void onRequestPermissionsResult(int i, java.lang.String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i != 42) {
            return;
        }
        boolean[] zArr = new boolean[strArr.length];
        for (int i2 = 0; i2 < strArr.length; i2++) {
            zArr[i2] = shouldShowRequestPermissionRationale(strArr[i2]);
        }
        onRequestPermissionsResult(strArr, iArr, zArr);
    }

    void onRequestPermissionsResult(java.lang.String[] strArr, int[] iArr, boolean[] zArr) {
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            log("onRequestPermissionsResult  " + strArr[i]);
            io.reactivex.subjects.PublishSubject<com.tbruyelle.rxpermissions2.Permission> publishSubject = this.mSubjects.get(strArr[i]);
            if (publishSubject == null) {
                android.util.Log.e(com.tbruyelle.rxpermissions2.RxPermissions.TAG, "RxPermissions.onRequestPermissionsResult invoked but didn't find the corresponding permission request.");
                return;
            }
            this.mSubjects.remove(strArr[i]);
            publishSubject.onNext(new com.tbruyelle.rxpermissions2.Permission(strArr[i], iArr[i] == 0, zArr[i]));
            publishSubject.onComplete();
        }
    }

    boolean isGranted(java.lang.String str) {
        androidx.fragment.app.FragmentActivity activity = getActivity();
        if (activity != null) {
            return activity.checkSelfPermission(str) == 0;
        }
        throw new java.lang.IllegalStateException("This fragment must be attached to an activity.");
    }

    boolean isRevoked(java.lang.String str) {
        androidx.fragment.app.FragmentActivity activity = getActivity();
        if (activity == null) {
            throw new java.lang.IllegalStateException("This fragment must be attached to an activity.");
        }
        return activity.getPackageManager().isPermissionRevokedByPolicy(str, getActivity().getPackageName());
    }

    public void setLogging(boolean z) {
        this.mLogging = z;
    }

    public io.reactivex.subjects.PublishSubject<com.tbruyelle.rxpermissions2.Permission> getSubjectByPermission(java.lang.String str) {
        return this.mSubjects.get(str);
    }

    public boolean containsByPermission(java.lang.String str) {
        return this.mSubjects.containsKey(str);
    }

    public void setSubjectForPermission(java.lang.String str, io.reactivex.subjects.PublishSubject<com.tbruyelle.rxpermissions2.Permission> publishSubject) {
        this.mSubjects.put(str, publishSubject);
    }

    void log(java.lang.String str) {
        if (this.mLogging) {
            android.util.Log.d(com.tbruyelle.rxpermissions2.RxPermissions.TAG, str);
        }
    }
}
