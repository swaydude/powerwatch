package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
public class Transformations {
    private Transformations() {
    }

    public static <X, Y> androidx.lifecycle.LiveData<Y> map(androidx.lifecycle.LiveData<X> liveData, final androidx.arch.core.util.Function<X, Y> function) {
        final androidx.lifecycle.MediatorLiveData mediatorLiveData = new androidx.lifecycle.MediatorLiveData();
        mediatorLiveData.addSource(liveData, new androidx.lifecycle.Observer<X>() { // from class: androidx.lifecycle.Transformations.1
            @Override // androidx.lifecycle.Observer
            public void onChanged(X x) {
                mediatorLiveData.setValue(function.apply(x));
            }
        });
        return mediatorLiveData;
    }

    public static <X, Y> androidx.lifecycle.LiveData<Y> switchMap(androidx.lifecycle.LiveData<X> liveData, final androidx.arch.core.util.Function<X, androidx.lifecycle.LiveData<Y>> function) {
        final androidx.lifecycle.MediatorLiveData mediatorLiveData = new androidx.lifecycle.MediatorLiveData();
        mediatorLiveData.addSource(liveData, new androidx.lifecycle.Observer<X>() { // from class: androidx.lifecycle.Transformations.2
            androidx.lifecycle.LiveData<Y> mSource;

            @Override // androidx.lifecycle.Observer
            public void onChanged(X x) {
                androidx.lifecycle.LiveData<Y> liveData2 = (androidx.lifecycle.LiveData) function.apply(x);
                java.lang.Object obj = this.mSource;
                if (obj == liveData2) {
                    return;
                }
                if (obj != null) {
                    mediatorLiveData.removeSource(obj);
                }
                this.mSource = liveData2;
                if (liveData2 != 0) {
                    mediatorLiveData.addSource(liveData2, new androidx.lifecycle.Observer<Y>() { // from class: androidx.lifecycle.Transformations.2.1
                        @Override // androidx.lifecycle.Observer
                        public void onChanged(Y y) {
                            mediatorLiveData.setValue(y);
                        }
                    });
                }
            }
        });
        return mediatorLiveData;
    }

    public static <X> androidx.lifecycle.LiveData<X> distinctUntilChanged(androidx.lifecycle.LiveData<X> liveData) {
        final androidx.lifecycle.MediatorLiveData mediatorLiveData = new androidx.lifecycle.MediatorLiveData();
        mediatorLiveData.addSource(liveData, new androidx.lifecycle.Observer<X>() { // from class: androidx.lifecycle.Transformations.3
            boolean mFirstTime = true;

            @Override // androidx.lifecycle.Observer
            public void onChanged(X x) {
                T value = mediatorLiveData.getValue();
                if (this.mFirstTime || ((value == 0 && x != null) || !(value == 0 || value.equals(x)))) {
                    this.mFirstTime = false;
                    mediatorLiveData.setValue(x);
                }
            }
        });
        return mediatorLiveData;
    }
}
