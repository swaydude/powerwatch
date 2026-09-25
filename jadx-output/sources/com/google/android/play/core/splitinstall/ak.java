package com.google.android.play.core.splitinstall;

/* JADX INFO: loaded from: classes2.dex */
final class ak {
    private final org.xmlpull.v1.XmlPullParser a;
    private final com.google.android.play.core.splitinstall.h b = new com.google.android.play.core.splitinstall.h();

    ak(org.xmlpull.v1.XmlPullParser xmlPullParser) {
        this.a = xmlPullParser;
    }

    private final java.lang.String a(java.lang.String str) {
        for (int i = 0; i < this.a.getAttributeCount(); i++) {
            if (this.a.getAttributeName(i).equals(str)) {
                return this.a.getAttributeValue(i);
            }
        }
        return null;
    }

    private final void b() throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        int i = 1;
        while (i != 0) {
            int next = this.a.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }

    final com.google.android.play.core.splitinstall.f a() {
        java.lang.String strA;
        while (this.a.next() != 1) {
            try {
                if (this.a.getEventType() == 2) {
                    if (this.a.getName().equals("splits")) {
                        while (this.a.next() != 3) {
                            if (this.a.getEventType() == 2) {
                                if (!this.a.getName().equals("module") || (strA = a(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME)) == null) {
                                    b();
                                } else {
                                    while (this.a.next() != 3) {
                                        if (this.a.getEventType() == 2) {
                                            if (this.a.getName().equals("language")) {
                                                while (this.a.next() != 3) {
                                                    if (this.a.getEventType() == 2) {
                                                        if (this.a.getName().equals("entry")) {
                                                            java.lang.String strA2 = a("key");
                                                            java.lang.String strA3 = a("split");
                                                            b();
                                                            if (strA2 != null && strA3 != null) {
                                                                this.b.a(strA, strA2, strA3);
                                                            }
                                                        } else {
                                                            b();
                                                        }
                                                    }
                                                }
                                            } else {
                                                b();
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        b();
                    }
                }
            } catch (java.io.IOException | java.lang.IllegalStateException | org.xmlpull.v1.XmlPullParserException e) {
                android.util.Log.e("SplitInstall", "Error while parsing splits.xml", e);
                return null;
            }
        }
        return this.b.a();
    }
}
