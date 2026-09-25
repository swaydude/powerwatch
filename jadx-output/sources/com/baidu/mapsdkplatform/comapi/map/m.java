package com.baidu.mapsdkplatform.comapi.map;

/* JADX INFO: loaded from: classes.dex */
class m extends android.os.Handler {
    final /* synthetic */ com.baidu.mapsdkplatform.comapi.map.l a;

    m(com.baidu.mapsdkplatform.comapi.map.l lVar) {
        this.a = lVar;
    }

    @Override // android.os.Handler
    public void handleMessage(android.os.Message message) {
        super.handleMessage(message);
        if (this.a.g != null && ((java.lang.Long) message.obj).longValue() == this.a.g.j) {
            boolean z = true;
            int i = 0;
            if (message.what == 4000) {
                if (this.a.g.h == null) {
                    return;
                }
                for (com.baidu.mapsdkplatform.comapi.map.n nVar : this.a.g.h) {
                    android.graphics.Bitmap bitmapCreateBitmap = null;
                    if (message.arg2 == 1) {
                        int[] iArr = new int[this.a.d * this.a.e];
                        int[] iArr2 = new int[this.a.d * this.a.e];
                        if (this.a.g.i == null) {
                            return;
                        }
                        int[] iArrA = this.a.g.i.a(iArr, this.a.d, this.a.e);
                        for (int i2 = 0; i2 < this.a.e; i2++) {
                            for (int i3 = 0; i3 < this.a.d; i3++) {
                                int i4 = iArrA[(this.a.d * i2) + i3];
                                iArr2[(((this.a.e - i2) - 1) * this.a.d) + i3] = (i4 & (-16711936)) | ((i4 << 16) & 16711680) | ((i4 >> 16) & 255);
                            }
                        }
                        bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(iArr2, this.a.d, this.a.e, android.graphics.Bitmap.Config.RGB_565);
                    }
                    if (nVar != null) {
                        nVar.a(bitmapCreateBitmap);
                    }
                }
                return;
            }
            if (message.what == 39) {
                if (this.a.g == null || this.a.g.h == null) {
                    return;
                }
                if (message.arg1 == 100) {
                    this.a.g.B();
                } else if (message.arg1 == 200) {
                    this.a.g.L();
                } else if (message.arg1 == 1) {
                    this.a.requestRender();
                } else if (message.arg1 == 0) {
                    this.a.requestRender();
                    if (!this.a.g.b() && this.a.getRenderMode() != 0) {
                        this.a.setRenderMode(0);
                    }
                } else if (message.arg1 == 2) {
                    if (this.a.g.h == null) {
                        return;
                    }
                    for (com.baidu.mapsdkplatform.comapi.map.n nVar2 : this.a.g.h) {
                        if (nVar2 != null) {
                            nVar2.c();
                        }
                    }
                }
                if (!this.a.g.k && this.a.e > 0 && this.a.d > 0 && this.a.g.b(0, 0) != null) {
                    this.a.g.k = true;
                    for (com.baidu.mapsdkplatform.comapi.map.n nVar3 : this.a.g.h) {
                        if (nVar3 != null) {
                            nVar3.b();
                        }
                    }
                }
                for (com.baidu.mapsdkplatform.comapi.map.n nVar4 : this.a.g.h) {
                    if (nVar4 != null) {
                        nVar4.a();
                    }
                }
                return;
            }
            if (message.what == 41) {
                if (this.a.g == null || this.a.g.h == null) {
                    return;
                }
                if (this.a.g.n || this.a.g.o) {
                    for (com.baidu.mapsdkplatform.comapi.map.n nVar5 : this.a.g.h) {
                        if (nVar5 != null) {
                            nVar5.b(this.a.g.E());
                        }
                    }
                    return;
                }
                return;
            }
            if (message.what == 999) {
                if (this.a.g.h == null) {
                    return;
                }
                for (com.baidu.mapsdkplatform.comapi.map.n nVar6 : this.a.g.h) {
                    if (nVar6 != null) {
                        nVar6.e();
                    }
                }
                return;
            }
            if (message.what == 50) {
                if (this.a.g.h == null) {
                    return;
                }
                for (com.baidu.mapsdkplatform.comapi.map.n nVar7 : this.a.g.h) {
                    if (nVar7 != null) {
                        if (message.arg1 != 0) {
                            if (message.arg1 == 1) {
                                if (this.a.g.E().a >= 18.0f) {
                                    nVar7.a(true);
                                }
                            }
                        }
                        nVar7.a(false);
                    }
                }
                return;
            }
            if (message.what == 65289) {
                int i5 = message.arg2;
                if (message.arg1 == 300) {
                    if (message.arg2 != 1003) {
                        if (message.arg2 >= 1004) {
                            int i6 = message.arg2;
                        }
                        i = i5;
                        z = false;
                    }
                    for (com.baidu.mapsdkplatform.comapi.map.n nVar8 : this.a.g.h) {
                        if (nVar8 != null) {
                            nVar8.a(z, i);
                        }
                    }
                }
            }
        }
    }
}
