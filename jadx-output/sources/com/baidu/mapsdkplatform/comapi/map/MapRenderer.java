package com.baidu.mapsdkplatform.comapi.map;

/* JADX INFO: loaded from: classes.dex */
public class MapRenderer implements android.opengl.GLSurfaceView.Renderer {
    private static final java.lang.String d = "MapRenderer";
    public int a;
    public int b;
    public int c;
    private long e;
    private com.baidu.mapsdkplatform.comapi.map.MapRenderer.a f;
    private final com.baidu.mapsdkplatform.comapi.map.l g;

    public interface a {
        void f();
    }

    public MapRenderer(com.baidu.mapsdkplatform.comapi.map.l lVar, com.baidu.mapsdkplatform.comapi.map.MapRenderer.a aVar) {
        this.f = aVar;
        this.g = lVar;
    }

    private void a(javax.microedition.khronos.opengles.GL10 gl10) {
        android.opengl.GLES20.glClear(16640);
        android.opengl.GLES20.glClearColor(0.85f, 0.8f, 0.8f, 0.0f);
    }

    private boolean a() {
        return this.e != 0;
    }

    public static native void nativeInit(long j);

    public static native int nativeRender(long j);

    public static native void nativeResize(long j, int i, int i2);

    public void a(long j) {
        this.e = j;
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onDrawFrame(javax.microedition.khronos.opengles.GL10 gl10) {
        if (!a()) {
            a(gl10);
            return;
        }
        if (this.c <= 1) {
            nativeResize(this.e, this.a, this.b);
            this.c++;
        }
        this.f.f();
        int iNativeRender = nativeRender(this.e);
        if (this.g.a() == null) {
            return;
        }
        if (this.g.a().h != null) {
            for (com.baidu.mapsdkplatform.comapi.map.n nVar : this.g.a().h) {
                if (this.g.a() == null) {
                    return;
                }
                com.baidu.mapsdkplatform.comapi.map.ad adVarJ = this.g.a().J();
                if (nVar != null) {
                    nVar.a(gl10, adVarJ);
                }
            }
        }
        com.baidu.mapsdkplatform.comapi.map.l lVar = this.g;
        if (iNativeRender == 1) {
            lVar.requestRender();
            return;
        }
        if (lVar.a().b()) {
            if (lVar.getRenderMode() != 1) {
                lVar.setRenderMode(1);
            }
        } else if (lVar.getRenderMode() != 0) {
            lVar.setRenderMode(0);
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceChanged(javax.microedition.khronos.opengles.GL10 gl10, int i, int i2) {
        long j = this.e;
        if (j != 0) {
            nativeResize(j, i, i2);
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceCreated(javax.microedition.khronos.opengles.GL10 gl10, javax.microedition.khronos.egl.EGLConfig eGLConfig) {
        nativeInit(this.e);
        if (a()) {
            this.f.f();
        }
    }
}
