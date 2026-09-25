package com.baidu.mapsdkplatform.comapi.map;

/* JADX INFO: loaded from: classes.dex */
class af extends android.os.Handler {
    final /* synthetic */ com.baidu.mapsdkplatform.comapi.map.ae a;

    af(com.baidu.mapsdkplatform.comapi.map.ae aeVar) {
        this.a = aeVar;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0105  */
    @Override // android.os.Handler
    public void handleMessage(android.os.Message message) {
        super.handleMessage(message);
        if (this.a.i == null || this.a.i.i == null || ((java.lang.Long) message.obj).longValue() != this.a.i.j) {
            return;
        }
        if (message.what == 4000) {
            if (this.a.i.h == null) {
                return;
            }
            for (com.baidu.mapsdkplatform.comapi.map.n nVar : this.a.i.h) {
                android.graphics.Bitmap bitmapCreateBitmap = null;
                if (message.arg2 == 1) {
                    int[] iArr = new int[com.baidu.mapsdkplatform.comapi.map.ae.a * com.baidu.mapsdkplatform.comapi.map.ae.b];
                    int[] iArr2 = new int[com.baidu.mapsdkplatform.comapi.map.ae.a * com.baidu.mapsdkplatform.comapi.map.ae.b];
                    if (this.a.i.i == null) {
                        return;
                    }
                    int[] iArrA = this.a.i.i.a(iArr, com.baidu.mapsdkplatform.comapi.map.ae.a, com.baidu.mapsdkplatform.comapi.map.ae.b);
                    for (int i = 0; i < com.baidu.mapsdkplatform.comapi.map.ae.b; i++) {
                        for (int i2 = 0; i2 < com.baidu.mapsdkplatform.comapi.map.ae.a; i2++) {
                            int i3 = iArrA[(com.baidu.mapsdkplatform.comapi.map.ae.a * i) + i2];
                            iArr2[(((com.baidu.mapsdkplatform.comapi.map.ae.b - i) - 1) * com.baidu.mapsdkplatform.comapi.map.ae.a) + i2] = (i3 & (-16711936)) | ((i3 << 16) & 16711680) | ((i3 >> 16) & 255);
                        }
                    }
                    bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(iArr2, com.baidu.mapsdkplatform.comapi.map.ae.a, com.baidu.mapsdkplatform.comapi.map.ae.b, android.graphics.Bitmap.Config.ARGB_8888);
                }
                if (nVar != null) {
                    nVar.a(bitmapCreateBitmap);
                }
            }
            return;
        }
        if (message.what != 39) {
            if (message.what == 41) {
                if (this.a.i == null) {
                    return;
                }
                if ((this.a.i.n || this.a.i.o) && this.a.i.h != null) {
                    for (com.baidu.mapsdkplatform.comapi.map.n nVar2 : this.a.i.h) {
                        if (nVar2 != null) {
                            nVar2.b(this.a.i.E());
                            if (this.a.i.q()) {
                                if (this.a.i.E().a >= 18.0f) {
                                    nVar2.a(true);
                                } else {
                                    nVar2.a(false);
                                }
                            }
                        }
                    }
                    return;
                }
                return;
            }
            if (message.what == 999) {
                if (this.a.i.h == null) {
                    return;
                }
                for (com.baidu.mapsdkplatform.comapi.map.n nVar3 : this.a.i.h) {
                    if (nVar3 != null) {
                        nVar3.e();
                    }
                }
                return;
            }
            if (message.what != 50 || this.a.i.h == null) {
                return;
            }
            for (com.baidu.mapsdkplatform.comapi.map.n nVar4 : this.a.i.h) {
                if (nVar4 != null) {
                    if (message.arg1 != 0) {
                        if (message.arg1 == 1) {
                            if (this.a.i.E().a >= 18.0f) {
                                nVar4.a(true);
                            }
                        }
                    }
                    nVar4.a(false);
                }
            }
            return;
        }
        if (this.a.i == null) {
            return;
        }
        if (message.arg1 == 100) {
            this.a.i.B();
        } else if (message.arg1 == 200) {
            this.a.i.L();
        } else if (message.arg1 == 1) {
            if (this.a.h != null) {
                this.a.h.a();
            }
        } else if (message.arg1 == 0) {
            if (this.a.h != null) {
                this.a.h.a();
            }
        } else if (message.arg1 == 2) {
            if (this.a.i.h == null) {
                return;
            }
            for (com.baidu.mapsdkplatform.comapi.map.n nVar5 : this.a.i.h) {
                if (nVar5 != null) {
                    nVar5.c();
                }
            }
        }
        if (!this.a.i.k && com.baidu.mapsdkplatform.comapi.map.ae.b > 0 && com.baidu.mapsdkplatform.comapi.map.ae.a > 0 && this.a.i.b(0, 0) != null) {
            this.a.i.k = true;
            if (this.a.i.h == null) {
                return;
            }
            for (com.baidu.mapsdkplatform.comapi.map.n nVar6 : this.a.i.h) {
                if (nVar6 != null) {
                    nVar6.b();
                }
            }
        }
        if (this.a.i.h == null) {
            return;
        }
        for (com.baidu.mapsdkplatform.comapi.map.n nVar7 : this.a.i.h) {
            if (nVar7 != null) {
                nVar7.a();
            }
        }
        if (!this.a.i.q() || this.a.i.h == null) {
            return;
        }
        for (com.baidu.mapsdkplatform.comapi.map.n nVar8 : this.a.i.h) {
            if (nVar8 != null) {
                if (this.a.i.E().a >= 18.0f) {
                    nVar8.a(true);
                } else {
                    nVar8.a(false);
                }
            }
        }
    }
}
