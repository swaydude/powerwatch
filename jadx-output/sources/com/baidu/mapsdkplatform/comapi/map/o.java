package com.baidu.mapsdkplatform.comapi.map;

/* JADX INFO: loaded from: classes.dex */
public class o extends java.lang.Thread {
    private java.util.concurrent.atomic.AtomicBoolean a;
    private android.graphics.SurfaceTexture b;
    private com.baidu.mapsdkplatform.comapi.map.o.a c;
    private javax.microedition.khronos.egl.EGL10 d;
    private javax.microedition.khronos.opengles.GL10 h;
    private final com.baidu.mapsdkplatform.comapi.map.ae k;
    private javax.microedition.khronos.egl.EGLDisplay e = javax.microedition.khronos.egl.EGL10.EGL_NO_DISPLAY;
    private javax.microedition.khronos.egl.EGLContext f = javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT;
    private javax.microedition.khronos.egl.EGLSurface g = javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE;
    private int i = 1;
    private boolean j = false;

    public interface a {
        int a();
    }

    public o(android.graphics.SurfaceTexture surfaceTexture, com.baidu.mapsdkplatform.comapi.map.o.a aVar, java.util.concurrent.atomic.AtomicBoolean atomicBoolean, com.baidu.mapsdkplatform.comapi.map.ae aeVar) {
        this.b = surfaceTexture;
        this.c = aVar;
        this.a = atomicBoolean;
        this.k = aeVar;
    }

    private boolean a(int i, int i2, int i3, int i4, int i5, int i6) {
        javax.microedition.khronos.egl.EGL10 egl10 = (javax.microedition.khronos.egl.EGL10) javax.microedition.khronos.egl.EGLContext.getEGL();
        this.d = egl10;
        javax.microedition.khronos.egl.EGLDisplay eGLDisplayEglGetDisplay = egl10.eglGetDisplay(javax.microedition.khronos.egl.EGL10.EGL_DEFAULT_DISPLAY);
        this.e = eGLDisplayEglGetDisplay;
        if (eGLDisplayEglGetDisplay == javax.microedition.khronos.egl.EGL10.EGL_NO_DISPLAY) {
            throw new java.lang.RuntimeException("eglGetdisplay failed : " + android.opengl.GLUtils.getEGLErrorString(this.d.eglGetError()));
        }
        if (!this.d.eglInitialize(this.e, new int[2])) {
            throw new java.lang.RuntimeException("eglInitialize failed : " + android.opengl.GLUtils.getEGLErrorString(this.d.eglGetError()));
        }
        javax.microedition.khronos.egl.EGLConfig[] eGLConfigArr = new javax.microedition.khronos.egl.EGLConfig[100];
        int[] iArr = new int[1];
        if (!this.d.eglChooseConfig(this.e, new int[]{12352, 4, 12324, i, 12323, i2, 12322, i3, 12321, i4, 12325, i5, 12326, i6, 12344}, eGLConfigArr, 100, iArr) || iArr[0] <= 0) {
            return false;
        }
        this.f = this.d.eglCreateContext(this.e, eGLConfigArr[0], javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT, new int[]{12440, 2, 12344});
        javax.microedition.khronos.egl.EGLSurface eGLSurfaceEglCreateWindowSurface = this.d.eglCreateWindowSurface(this.e, eGLConfigArr[0], this.b, null);
        this.g = eGLSurfaceEglCreateWindowSurface;
        if (eGLSurfaceEglCreateWindowSurface == javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE || this.f == javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT) {
            if (this.d.eglGetError() == 12299) {
                throw new java.lang.RuntimeException("eglCreateWindowSurface returned EGL_BAD_NATIVE_WINDOW. ");
            }
            android.opengl.GLUtils.getEGLErrorString(this.d.eglGetError());
        }
        javax.microedition.khronos.egl.EGL10 egl11 = this.d;
        javax.microedition.khronos.egl.EGLDisplay eGLDisplay = this.e;
        javax.microedition.khronos.egl.EGLSurface eGLSurface = this.g;
        if (egl11.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.f)) {
            this.h = (javax.microedition.khronos.opengles.GL10) this.f.getGL();
            return true;
        }
        throw new java.lang.RuntimeException("eglMakeCurrent failed : " + android.opengl.GLUtils.getEGLErrorString(this.d.eglGetError()));
    }

    private static boolean b(int i, int i2, int i3, int i4, int i5, int i6) {
        javax.microedition.khronos.egl.EGL10 egl10 = (javax.microedition.khronos.egl.EGL10) javax.microedition.khronos.egl.EGLContext.getEGL();
        javax.microedition.khronos.egl.EGLDisplay eGLDisplayEglGetDisplay = egl10.eglGetDisplay(javax.microedition.khronos.egl.EGL10.EGL_DEFAULT_DISPLAY);
        egl10.eglInitialize(eGLDisplayEglGetDisplay, new int[2]);
        int[] iArr = new int[1];
        return egl10.eglChooseConfig(eGLDisplayEglGetDisplay, new int[]{12324, i, 12323, i2, 12322, i3, 12321, i4, 12325, i5, 12326, i6, 12344}, new javax.microedition.khronos.egl.EGLConfig[100], 100, iArr) && iArr[0] > 0;
    }

    private void d() {
        try {
            if (b(5, 6, 5, 0, 24, 0)) {
                a(8, 8, 8, 0, 24, 0);
            } else {
                a(8, 8, 8, 0, 24, 0);
            }
        } catch (java.lang.IllegalArgumentException unused) {
            a(8, 8, 8, 0, 24, 0);
        }
        if (this.k.b() == null) {
            return;
        }
        com.baidu.mapsdkplatform.comapi.map.MapRenderer.nativeInit(this.k.b().j);
        com.baidu.mapsdkplatform.comapi.map.MapRenderer.nativeResize(this.k.b().j, com.baidu.mapsdkplatform.comapi.map.ae.a, com.baidu.mapsdkplatform.comapi.map.ae.b);
    }

    private void e() {
        if (this.g != javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE) {
            this.d.eglMakeCurrent(this.e, javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE, javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE, javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT);
            this.d.eglDestroySurface(this.e, this.g);
            this.g = javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE;
        }
        if (this.f != javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT) {
            this.d.eglDestroyContext(this.e, this.f);
            this.f = javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT;
        }
        if (this.e != javax.microedition.khronos.egl.EGL10.EGL_NO_DISPLAY) {
            this.d.eglTerminate(this.e);
            this.e = javax.microedition.khronos.egl.EGL10.EGL_NO_DISPLAY;
        }
    }

    public void a() {
        this.i = 1;
        this.j = false;
        synchronized (this) {
            if (getState() == java.lang.Thread.State.WAITING) {
                notify();
            }
        }
    }

    public void b() {
        this.i = 0;
        synchronized (this) {
            this.j = true;
        }
    }

    public void c() {
        this.j = true;
        synchronized (this) {
            if (getState() == java.lang.Thread.State.WAITING) {
                notify();
            }
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        d();
        while (this.c != null) {
            if (this.i != 1 || this.j) {
                try {
                    synchronized (this) {
                        try {
                            wait();
                        } catch (java.lang.Throwable th) {
                            throw th;
                        }
                    }
                } catch (java.lang.InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                if (this.k.b() == null) {
                    break;
                }
                synchronized (this.k.b()) {
                    synchronized (this) {
                        if (!this.j) {
                            this.i = this.c.a();
                        }
                        com.baidu.mapsdkplatform.comapi.map.e eVarB = this.k.b();
                        if (eVarB != null && eVarB.h != null) {
                            for (com.baidu.mapsdkplatform.comapi.map.n nVar : eVarB.h) {
                                if (nVar != null) {
                                    com.baidu.mapsdkplatform.comapi.map.ad adVarJ = eVarB.J();
                                    javax.microedition.khronos.opengles.GL10 gl10 = this.h;
                                    if (gl10 == null) {
                                        return;
                                    }
                                    if (nVar != null) {
                                        nVar.a(gl10, adVarJ);
                                    }
                                }
                            }
                        }
                        this.d.eglSwapBuffers(this.e, this.g);
                    }
                }
            }
            if (this.j) {
                break;
            }
        }
        e();
    }
}
