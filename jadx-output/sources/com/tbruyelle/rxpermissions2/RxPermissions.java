package com.tbruyelle.rxpermissions2;

/* JADX INFO: loaded from: classes2.dex */
public class RxPermissions {
    static final java.lang.String TAG = "RxPermissions";
    static final java.lang.Object TRIGGER = new java.lang.Object();
    com.tbruyelle.rxpermissions2.RxPermissions.Lazy<com.tbruyelle.rxpermissions2.RxPermissionsFragment> mRxPermissionsFragment;

    @java.lang.FunctionalInterface
    public interface Lazy<V> {
        V get();
    }

    public RxPermissions(androidx.fragment.app.FragmentActivity fragmentActivity) {
        this.mRxPermissionsFragment = getLazySingleton(fragmentActivity.getSupportFragmentManager());
    }

    public RxPermissions(androidx.fragment.app.Fragment fragment) {
        this.mRxPermissionsFragment = getLazySingleton(fragment.getChildFragmentManager());
    }

    private com.tbruyelle.rxpermissions2.RxPermissions.Lazy<com.tbruyelle.rxpermissions2.RxPermissionsFragment> getLazySingleton(final androidx.fragment.app.FragmentManager fragmentManager) {
        return new com.tbruyelle.rxpermissions2.RxPermissions.Lazy<com.tbruyelle.rxpermissions2.RxPermissionsFragment>() { // from class: com.tbruyelle.rxpermissions2.RxPermissions.1
            private com.tbruyelle.rxpermissions2.RxPermissionsFragment rxPermissionsFragment;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.tbruyelle.rxpermissions2.RxPermissions.Lazy
            public synchronized com.tbruyelle.rxpermissions2.RxPermissionsFragment get() {
                if (this.rxPermissionsFragment == null) {
                    this.rxPermissionsFragment = com.tbruyelle.rxpermissions2.RxPermissions.this.getRxPermissionsFragment(fragmentManager);
                }
                return this.rxPermissionsFragment;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.tbruyelle.rxpermissions2.RxPermissionsFragment getRxPermissionsFragment(androidx.fragment.app.FragmentManager fragmentManager) {
        com.tbruyelle.rxpermissions2.RxPermissionsFragment rxPermissionsFragmentFindRxPermissionsFragment = findRxPermissionsFragment(fragmentManager);
        if (!(rxPermissionsFragmentFindRxPermissionsFragment == null)) {
            return rxPermissionsFragmentFindRxPermissionsFragment;
        }
        com.tbruyelle.rxpermissions2.RxPermissionsFragment rxPermissionsFragment = new com.tbruyelle.rxpermissions2.RxPermissionsFragment();
        fragmentManager.beginTransaction().add(rxPermissionsFragment, TAG).commitNow();
        return rxPermissionsFragment;
    }

    private com.tbruyelle.rxpermissions2.RxPermissionsFragment findRxPermissionsFragment(androidx.fragment.app.FragmentManager fragmentManager) {
        return (com.tbruyelle.rxpermissions2.RxPermissionsFragment) fragmentManager.findFragmentByTag(TAG);
    }

    public void setLogging(boolean z) {
        this.mRxPermissionsFragment.get().setLogging(z);
    }

    public <T> io.reactivex.ObservableTransformer<T, java.lang.Boolean> ensure(final java.lang.String... strArr) {
        return new io.reactivex.ObservableTransformer<T, java.lang.Boolean>() { // from class: com.tbruyelle.rxpermissions2.RxPermissions.2
            @Override // io.reactivex.ObservableTransformer
            /* JADX INFO: renamed from: apply */
            public io.reactivex.ObservableSource<java.lang.Boolean> apply2(io.reactivex.Observable<T> observable) {
                return com.tbruyelle.rxpermissions2.RxPermissions.this.request(observable, strArr).buffer(strArr.length).flatMap(new io.reactivex.functions.Function<java.util.List<com.tbruyelle.rxpermissions2.Permission>, io.reactivex.ObservableSource<java.lang.Boolean>>() { // from class: com.tbruyelle.rxpermissions2.RxPermissions.2.1
                    @Override // io.reactivex.functions.Function
                    public io.reactivex.ObservableSource<java.lang.Boolean> apply(java.util.List<com.tbruyelle.rxpermissions2.Permission> list) {
                        if (list.isEmpty()) {
                            return io.reactivex.Observable.empty();
                        }
                        java.util.Iterator<com.tbruyelle.rxpermissions2.Permission> it = list.iterator();
                        while (it.hasNext()) {
                            if (!it.next().granted) {
                                return io.reactivex.Observable.just(false);
                            }
                        }
                        return io.reactivex.Observable.just(true);
                    }
                });
            }
        };
    }

    public <T> io.reactivex.ObservableTransformer<T, com.tbruyelle.rxpermissions2.Permission> ensureEach(final java.lang.String... strArr) {
        return new io.reactivex.ObservableTransformer<T, com.tbruyelle.rxpermissions2.Permission>() { // from class: com.tbruyelle.rxpermissions2.RxPermissions.3
            @Override // io.reactivex.ObservableTransformer
            /* JADX INFO: renamed from: apply */
            public io.reactivex.ObservableSource<com.tbruyelle.rxpermissions2.Permission> apply2(io.reactivex.Observable<T> observable) {
                return com.tbruyelle.rxpermissions2.RxPermissions.this.request(observable, strArr);
            }
        };
    }

    public <T> io.reactivex.ObservableTransformer<T, com.tbruyelle.rxpermissions2.Permission> ensureEachCombined(final java.lang.String... strArr) {
        return new io.reactivex.ObservableTransformer<T, com.tbruyelle.rxpermissions2.Permission>() { // from class: com.tbruyelle.rxpermissions2.RxPermissions.4
            @Override // io.reactivex.ObservableTransformer
            /* JADX INFO: renamed from: apply */
            public io.reactivex.ObservableSource<com.tbruyelle.rxpermissions2.Permission> apply2(io.reactivex.Observable<T> observable) {
                return com.tbruyelle.rxpermissions2.RxPermissions.this.request(observable, strArr).buffer(strArr.length).flatMap(new io.reactivex.functions.Function<java.util.List<com.tbruyelle.rxpermissions2.Permission>, io.reactivex.ObservableSource<com.tbruyelle.rxpermissions2.Permission>>() { // from class: com.tbruyelle.rxpermissions2.RxPermissions.4.1
                    @Override // io.reactivex.functions.Function
                    public io.reactivex.ObservableSource<com.tbruyelle.rxpermissions2.Permission> apply(java.util.List<com.tbruyelle.rxpermissions2.Permission> list) {
                        if (list.isEmpty()) {
                            return io.reactivex.Observable.empty();
                        }
                        return io.reactivex.Observable.just(new com.tbruyelle.rxpermissions2.Permission(list));
                    }
                });
            }
        };
    }

    public io.reactivex.Observable<java.lang.Boolean> request(java.lang.String... strArr) {
        return io.reactivex.Observable.just(TRIGGER).compose(ensure(strArr));
    }

    public io.reactivex.Observable<com.tbruyelle.rxpermissions2.Permission> requestEach(java.lang.String... strArr) {
        return io.reactivex.Observable.just(TRIGGER).compose(ensureEach(strArr));
    }

    public io.reactivex.Observable<com.tbruyelle.rxpermissions2.Permission> requestEachCombined(java.lang.String... strArr) {
        return io.reactivex.Observable.just(TRIGGER).compose(ensureEachCombined(strArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public io.reactivex.Observable<com.tbruyelle.rxpermissions2.Permission> request(io.reactivex.Observable<?> observable, final java.lang.String... strArr) {
        if (strArr == null || strArr.length == 0) {
            throw new java.lang.IllegalArgumentException("RxPermissions.request/requestEach requires at least one input permission");
        }
        return oneOf(observable, pending(strArr)).flatMap(new io.reactivex.functions.Function<java.lang.Object, io.reactivex.Observable<com.tbruyelle.rxpermissions2.Permission>>() { // from class: com.tbruyelle.rxpermissions2.RxPermissions.5
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // io.reactivex.functions.Function
            public io.reactivex.Observable<com.tbruyelle.rxpermissions2.Permission> apply(java.lang.Object obj) {
                return com.tbruyelle.rxpermissions2.RxPermissions.this.requestImplementation(strArr);
            }
        });
    }

    private io.reactivex.Observable<?> pending(java.lang.String... strArr) {
        for (java.lang.String str : strArr) {
            if (!this.mRxPermissionsFragment.get().containsByPermission(str)) {
                return io.reactivex.Observable.empty();
            }
        }
        return io.reactivex.Observable.just(TRIGGER);
    }

    private io.reactivex.Observable<?> oneOf(io.reactivex.Observable<?> observable, io.reactivex.Observable<?> observable2) {
        if (observable == null) {
            return io.reactivex.Observable.just(TRIGGER);
        }
        return io.reactivex.Observable.merge(observable, observable2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public io.reactivex.Observable<com.tbruyelle.rxpermissions2.Permission> requestImplementation(java.lang.String... strArr) {
        java.util.ArrayList arrayList = new java.util.ArrayList(strArr.length);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.String str : strArr) {
            this.mRxPermissionsFragment.get().log("Requesting permission " + str);
            if (isGranted(str)) {
                arrayList.add(io.reactivex.Observable.just(new com.tbruyelle.rxpermissions2.Permission(str, true, false)));
            } else if (isRevoked(str)) {
                arrayList.add(io.reactivex.Observable.just(new com.tbruyelle.rxpermissions2.Permission(str, false, false)));
            } else {
                io.reactivex.subjects.PublishSubject<com.tbruyelle.rxpermissions2.Permission> subjectByPermission = this.mRxPermissionsFragment.get().getSubjectByPermission(str);
                if (subjectByPermission == null) {
                    arrayList2.add(str);
                    subjectByPermission = io.reactivex.subjects.PublishSubject.create();
                    this.mRxPermissionsFragment.get().setSubjectForPermission(str, subjectByPermission);
                }
                arrayList.add(subjectByPermission);
            }
        }
        if (!arrayList2.isEmpty()) {
            requestPermissionsFromFragment((java.lang.String[]) arrayList2.toArray(new java.lang.String[arrayList2.size()]));
        }
        return io.reactivex.Observable.concat(io.reactivex.Observable.fromIterable(arrayList));
    }

    public io.reactivex.Observable<java.lang.Boolean> shouldShowRequestPermissionRationale(android.app.Activity activity, java.lang.String... strArr) {
        if (!isMarshmallow()) {
            return io.reactivex.Observable.just(false);
        }
        return io.reactivex.Observable.just(java.lang.Boolean.valueOf(shouldShowRequestPermissionRationaleImplementation(activity, strArr)));
    }

    private boolean shouldShowRequestPermissionRationaleImplementation(android.app.Activity activity, java.lang.String... strArr) {
        for (java.lang.String str : strArr) {
            if (!isGranted(str) && !activity.shouldShowRequestPermissionRationale(str)) {
                return false;
            }
        }
        return true;
    }

    void requestPermissionsFromFragment(java.lang.String[] strArr) {
        this.mRxPermissionsFragment.get().log("requestPermissionsFromFragment " + android.text.TextUtils.join(", ", strArr));
        this.mRxPermissionsFragment.get().requestPermissions(strArr);
    }

    public boolean isGranted(java.lang.String str) {
        return !isMarshmallow() || this.mRxPermissionsFragment.get().isGranted(str);
    }

    public boolean isRevoked(java.lang.String str) {
        return isMarshmallow() && this.mRxPermissionsFragment.get().isRevoked(str);
    }

    boolean isMarshmallow() {
        return android.os.Build.VERSION.SDK_INT >= 23;
    }

    void onRequestPermissionsResult(java.lang.String[] strArr, int[] iArr) {
        this.mRxPermissionsFragment.get().onRequestPermissionsResult(strArr, iArr, new boolean[strArr.length]);
    }
}
