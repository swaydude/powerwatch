package com.baidu.mapsdkplatform.comapi.map;

/* JADX INFO: loaded from: classes.dex */
public class am extends android.widget.LinearLayout implements android.view.View.OnTouchListener {
    private android.widget.ImageView a;
    private android.widget.ImageView b;
    private android.content.Context c;
    private android.graphics.Bitmap d;
    private android.graphics.Bitmap e;
    private android.graphics.Bitmap f;
    private android.graphics.Bitmap g;
    private android.graphics.Bitmap h;
    private android.graphics.Bitmap i;
    private android.graphics.Bitmap j;
    private android.graphics.Bitmap k;
    private int l;
    private boolean m;
    private boolean n;

    @java.lang.Deprecated
    public am(android.content.Context context) {
        super(context);
        this.m = false;
        this.n = false;
        this.c = context;
        c();
        if (this.d == null || this.e == null || this.f == null || this.g == null) {
            return;
        }
        this.a = new android.widget.ImageView(this.c);
        this.b = new android.widget.ImageView(this.c);
        this.a.setImageBitmap(this.d);
        this.b.setImageBitmap(this.f);
        this.l = a(this.f.getHeight() / 6);
        a(this.a, "main_topbtn_up.9.png");
        a(this.b, "main_bottombtn_up.9.png");
        this.a.setId(0);
        this.b.setId(1);
        this.a.setClickable(true);
        this.b.setClickable(true);
        this.a.setOnTouchListener(this);
        this.b.setOnTouchListener(this);
        setOrientation(1);
        setLayoutParams(new android.widget.LinearLayout.LayoutParams(-2, -2));
        addView(this.a);
        addView(this.b);
        this.n = true;
    }

    public am(android.content.Context context, boolean z) {
        super(context);
        this.m = false;
        this.n = false;
        this.c = context;
        this.m = z;
        this.a = new android.widget.ImageView(this.c);
        this.b = new android.widget.ImageView(this.c);
        if (z) {
            d();
            if (this.h == null || this.i == null || this.j == null || this.k == null) {
                return;
            }
            this.a.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-2, -2));
            this.b.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-2, -2));
            this.a.setImageBitmap(this.h);
            this.b.setImageBitmap(this.j);
            setLayoutParams(new android.widget.LinearLayout.LayoutParams(-2, -2));
            setOrientation(0);
        } else {
            c();
            android.graphics.Bitmap bitmap = this.d;
            if (bitmap == null || this.e == null || this.f == null || this.g == null) {
                return;
            }
            this.a.setImageBitmap(bitmap);
            this.b.setImageBitmap(this.f);
            this.l = a(this.f.getHeight() / 6);
            a(this.a, "main_topbtn_up.9.png");
            a(this.b, "main_bottombtn_up.9.png");
            setLayoutParams(new android.widget.LinearLayout.LayoutParams(-2, -2));
            setOrientation(1);
        }
        this.a.setId(0);
        this.b.setId(1);
        this.a.setClickable(true);
        this.b.setClickable(true);
        this.a.setOnTouchListener(this);
        this.b.setOnTouchListener(this);
        addView(this.a);
        addView(this.b);
        this.n = true;
    }

    private int a(int i) {
        return (int) ((this.c.getResources().getDisplayMetrics().density * i) + 0.5f);
    }

    private android.graphics.Bitmap a(java.lang.String str) {
        float f;
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        int densityDpi = com.baidu.mapapi.common.SysOSUtil.getDensityDpi();
        if (densityDpi > 480) {
            f = 1.8f;
        } else {
            f = (densityDpi <= 320 || densityDpi > 480) ? 1.2f : 1.5f;
        }
        matrix.postScale(f, f);
        android.graphics.Bitmap bitmapA = com.baidu.mapsdkplatform.comapi.commonutils.a.a(str, this.c);
        return android.graphics.Bitmap.createBitmap(bitmapA, 0, 0, bitmapA.getWidth(), bitmapA.getHeight(), matrix, true);
    }

    private void a(android.view.View view, java.lang.String str) {
        android.graphics.Bitmap bitmapA = com.baidu.mapsdkplatform.comapi.commonutils.a.a(str, this.c);
        byte[] ninePatchChunk = bitmapA.getNinePatchChunk();
        android.graphics.NinePatch.isNinePatchChunk(ninePatchChunk);
        view.setBackgroundDrawable(new android.graphics.drawable.NinePatchDrawable(bitmapA, ninePatchChunk, new android.graphics.Rect(), null));
        int i = this.l;
        view.setPadding(i, i, i, i);
    }

    private void c() {
        this.d = a("main_icon_zoomin.png");
        this.e = a("main_icon_zoomin_dis.png");
        this.f = a("main_icon_zoomout.png");
        this.g = a("main_icon_zoomout_dis.png");
    }

    private void d() {
        this.h = a("wear_zoom_in.png");
        this.i = a("wear_zoom_in_pressed.png");
        this.j = a("wear_zoon_out.png");
        this.k = a("wear_zoom_out_pressed.png");
    }

    public void a(android.view.View.OnClickListener onClickListener) {
        this.a.setOnClickListener(onClickListener);
    }

    public void a(boolean z) {
        android.widget.ImageView imageView;
        android.graphics.Bitmap bitmap;
        this.a.setEnabled(z);
        if (z) {
            imageView = this.a;
            bitmap = this.d;
        } else {
            imageView = this.a;
            bitmap = this.e;
        }
        imageView.setImageBitmap(bitmap);
    }

    public boolean a() {
        return this.n;
    }

    public void b() {
        android.graphics.Bitmap bitmap = this.d;
        if (bitmap != null && !bitmap.isRecycled()) {
            this.d.recycle();
            this.d = null;
        }
        android.graphics.Bitmap bitmap2 = this.e;
        if (bitmap2 != null && !bitmap2.isRecycled()) {
            this.e.recycle();
            this.e = null;
        }
        android.graphics.Bitmap bitmap3 = this.f;
        if (bitmap3 != null && !bitmap3.isRecycled()) {
            this.f.recycle();
            this.f = null;
        }
        android.graphics.Bitmap bitmap4 = this.g;
        if (bitmap4 != null && !bitmap4.isRecycled()) {
            this.g.recycle();
            this.g = null;
        }
        android.graphics.Bitmap bitmap5 = this.h;
        if (bitmap5 != null && !bitmap5.isRecycled()) {
            this.h.recycle();
            this.h = null;
        }
        android.graphics.Bitmap bitmap6 = this.i;
        if (bitmap6 != null && !bitmap6.isRecycled()) {
            this.i.recycle();
            this.i = null;
        }
        android.graphics.Bitmap bitmap7 = this.j;
        if (bitmap7 != null && !bitmap7.isRecycled()) {
            this.j.recycle();
            this.j = null;
        }
        android.graphics.Bitmap bitmap8 = this.k;
        if (bitmap8 == null || bitmap8.isRecycled()) {
            return;
        }
        this.k.recycle();
        this.k = null;
    }

    public void b(android.view.View.OnClickListener onClickListener) {
        this.b.setOnClickListener(onClickListener);
    }

    public void b(boolean z) {
        android.widget.ImageView imageView;
        android.graphics.Bitmap bitmap;
        this.b.setEnabled(z);
        if (z) {
            imageView = this.b;
            bitmap = this.f;
        } else {
            imageView = this.b;
            bitmap = this.g;
        }
        imageView.setImageBitmap(bitmap);
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        android.widget.ImageView imageView;
        android.graphics.Bitmap bitmap;
        android.widget.ImageView imageView2;
        java.lang.String str;
        if (!(view instanceof android.widget.ImageView)) {
            return false;
        }
        int id = ((android.widget.ImageView) view).getId();
        if (id == 0) {
            if (motionEvent.getAction() == 0) {
                if (this.m) {
                    imageView = this.a;
                    bitmap = this.i;
                    imageView.setImageBitmap(bitmap);
                    return false;
                }
                imageView2 = this.a;
                str = "main_topbtn_down.9.png";
                a(imageView2, str);
                return false;
            }
            if (motionEvent.getAction() != 1) {
                return false;
            }
            if (this.m) {
                imageView = this.a;
                bitmap = this.h;
                imageView.setImageBitmap(bitmap);
                return false;
            }
            imageView2 = this.a;
            str = "main_topbtn_up.9.png";
            a(imageView2, str);
            return false;
        }
        if (id != 1) {
            return false;
        }
        if (motionEvent.getAction() == 0) {
            if (this.m) {
                imageView = this.b;
                bitmap = this.k;
                imageView.setImageBitmap(bitmap);
                return false;
            }
            imageView2 = this.b;
            str = "main_bottombtn_down.9.png";
            a(imageView2, str);
            return false;
        }
        if (motionEvent.getAction() != 1) {
            return false;
        }
        if (this.m) {
            imageView = this.b;
            bitmap = this.j;
            imageView.setImageBitmap(bitmap);
            return false;
        }
        imageView2 = this.b;
        str = "main_bottombtn_up.9.png";
        a(imageView2, str);
        return false;
    }
}
