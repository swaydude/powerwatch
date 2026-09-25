package com.baidu.mapsdkplatform.comapi.a;

/* JADX INFO: loaded from: classes.dex */
public class l extends com.baidu.mapsdkplatform.comapi.a.c {
    private android.animation.Animator a = null;
    private long b = 0;
    private android.view.animation.Interpolator c = null;
    private com.baidu.mapapi.animation.Animation.AnimationListener d = null;
    private int e = 1;
    private int f = 0;
    private java.lang.Object[] g;

    public class a implements android.animation.TypeEvaluator {
        public a() {
        }

        @Override // android.animation.TypeEvaluator
        public java.lang.Object evaluate(float f, java.lang.Object obj, java.lang.Object obj2) {
            com.baidu.mapapi.model.LatLng latLng = (com.baidu.mapapi.model.LatLng) obj;
            com.baidu.mapapi.model.LatLng latLng2 = (com.baidu.mapapi.model.LatLng) obj2;
            double d = f;
            return new com.baidu.mapapi.model.LatLng(latLng.latitude + (d * (latLng2.latitude - latLng.latitude)), latLng.longitude + ((latLng2.longitude - latLng.longitude) * d));
        }
    }

    public class b implements android.animation.TypeEvaluator {
        public b() {
        }

        @Override // android.animation.TypeEvaluator
        public java.lang.Object evaluate(float f, java.lang.Object obj, java.lang.Object obj2) {
            android.graphics.Point point = (android.graphics.Point) obj;
            android.graphics.Point point2 = (android.graphics.Point) obj2;
            return new android.graphics.Point((int) (point.x + ((point2.x - point.x) * f)), (int) (point.y + (f * (point2.y - point.y))));
        }
    }

    public l(android.graphics.Point... pointArr) {
        this.g = pointArr;
    }

    public l(com.baidu.mapapi.model.LatLng... latLngArr) {
        this.g = latLngArr;
    }

    android.animation.ObjectAnimator a(com.baidu.mapapi.map.Marker marker) {
        android.animation.ObjectAnimator objectAnimatorOfObject;
        if (marker.isFixed()) {
            if (!(this.g[0] instanceof android.graphics.Point)) {
                throw new java.lang.ClassCastException("BDMapSDKException: if the marker is fixed on screen, the parameters of Transformation must be android.graphics.Point");
            }
            objectAnimatorOfObject = android.animation.ObjectAnimator.ofObject(marker, "fixedScreenPosition", new com.baidu.mapsdkplatform.comapi.a.l.b(), this.g);
        } else {
            if (!(this.g[0] instanceof com.baidu.mapapi.model.LatLng)) {
                throw new java.lang.ClassCastException("BDMapSDKException: if the marker isn't fixed on screen, the parameters of Transformation must be Latlng");
            }
            objectAnimatorOfObject = android.animation.ObjectAnimator.ofObject(marker, "position", new com.baidu.mapsdkplatform.comapi.a.l.a(), this.g);
        }
        if (objectAnimatorOfObject != null) {
            objectAnimatorOfObject.setRepeatCount(this.f);
            objectAnimatorOfObject.setRepeatMode(c());
            objectAnimatorOfObject.setDuration(this.b);
            android.view.animation.Interpolator interpolator = this.c;
            if (interpolator != null) {
                objectAnimatorOfObject.setInterpolator(interpolator);
            }
        }
        return objectAnimatorOfObject;
    }

    @Override // com.baidu.mapsdkplatform.comapi.a.c
    public void a() {
        android.animation.Animator animator = this.a;
        if (animator == null) {
            return;
        }
        animator.start();
    }

    @Override // com.baidu.mapsdkplatform.comapi.a.c
    public void a(int i) {
        this.e = i;
    }

    @Override // com.baidu.mapsdkplatform.comapi.a.c
    public void a(long j) {
        if (j < 0) {
            j = 0;
        }
        this.b = j;
    }

    @Override // com.baidu.mapsdkplatform.comapi.a.c
    protected void a(android.animation.Animator animator) {
        if (animator == null) {
            return;
        }
        animator.addListener(new com.baidu.mapsdkplatform.comapi.a.m(this));
    }

    @Override // com.baidu.mapsdkplatform.comapi.a.c
    public void a(android.view.animation.Interpolator interpolator) {
        this.c = interpolator;
    }

    @Override // com.baidu.mapsdkplatform.comapi.a.c
    public void a(com.baidu.mapapi.animation.Animation.AnimationListener animationListener) {
        this.d = animationListener;
    }

    @Override // com.baidu.mapsdkplatform.comapi.a.c
    public void a(com.baidu.mapapi.map.Marker marker, com.baidu.mapapi.animation.Animation animation) {
        android.animation.ObjectAnimator objectAnimatorA = a(marker);
        this.a = objectAnimatorA;
        a(objectAnimatorA);
    }

    @Override // com.baidu.mapsdkplatform.comapi.a.c
    public void b() {
        android.animation.Animator animator = this.a;
        if (animator != null) {
            animator.cancel();
            this.a = null;
        }
    }

    @Override // com.baidu.mapsdkplatform.comapi.a.c
    public void b(int i) {
        if (i > 0 || i == -1) {
            this.f = i;
        }
    }

    public int c() {
        return this.e;
    }

    @Override // com.baidu.mapsdkplatform.comapi.a.c
    public void c(int i) {
    }
}
