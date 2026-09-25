package com.bugfender.sdk;

/* JADX INFO: loaded from: classes.dex */
public class o1 {
    private static final java.lang.String c = com.bugfender.sdk.Bugfender.class.getSimpleName();
    private final com.bugfender.sdk.q2 a;
    private final com.bugfender.sdk.g0<com.bugfender.sdk.p1> b;

    public o1(com.bugfender.sdk.q2 q2Var) {
        com.bugfender.sdk.w1.a(q2Var, "BugfenderApiManager must be not null");
        this.a = q2Var;
        this.b = new com.bugfender.sdk.q0();
    }

    private void a(java.lang.Throwable th) {
        if (th instanceof com.bugfender.sdk.g) {
            com.bugfender.sdk.d1.b(c, "Unrecognized application key.");
            return;
        }
        if (th instanceof com.bugfender.sdk.j) {
            com.bugfender.sdk.d1.a(com.bugfender.sdk.k1.G, "Log limit reached");
        } else if (th instanceof com.bugfender.sdk.k) {
            java.lang.Throwable cause = th.getCause();
            com.bugfender.sdk.d1.b(com.bugfender.sdk.k1.G, ((cause instanceof com.bugfender.sdk.p1) && ((com.bugfender.sdk.p1) cause).a() == 0) ? "The Internet permission is not available, please manually delete the app and reinstall it so the manifest can be updated" : "Network error, will retry later");
        }
    }

    public long a(com.bugfender.sdk.k2 k2Var) throws com.bugfender.sdk.h {
        try {
            java.lang.String strA = this.a.a(io.fabric.sdk.android.services.settings.SettingsJsonConstants.SESSION_KEY, com.bugfender.sdk.y0.c.a.a(k2Var, java.lang.Boolean.TRUE));
            com.bugfender.sdk.m2 m2VarA = com.bugfender.sdk.y0.c.b.a(strA);
            if (m2VarA != null) {
                return m2VarA.a();
            }
            throw new com.bugfender.sdk.p1(2, "Unexpected response body from server: " + strA);
        } catch (com.bugfender.sdk.p1 e) {
            com.bugfender.sdk.h hVarOf = this.b.of(e);
            a(hVarOf);
            throw hVarOf;
        }
    }

    public com.bugfender.sdk.y a(java.lang.String str, com.bugfender.sdk.w wVar, java.util.Map<java.lang.String, ?> map) throws com.bugfender.sdk.h {
        try {
            java.lang.String strA = this.a.a("app/device-status", com.bugfender.sdk.y0.a.C0017a.a(str, wVar, map));
            com.bugfender.sdk.b0 b0VarA = com.bugfender.sdk.y0.a.b.a(strA);
            if (b0VarA == null) {
                throw new com.bugfender.sdk.p1(2, "Unexpected response body from server: " + strA);
            }
            com.bugfender.sdk.b0.a aVarA = b0VarA.a();
            if (aVarA != null) {
                int iA = aVarA.a();
                if (iA == -1017) {
                    throw new com.bugfender.sdk.p1(com.bugfender.sdk.p1.g, "Deleted app");
                }
                if (iA == -1004) {
                    throw new com.bugfender.sdk.p1(com.bugfender.sdk.p1.f, "Invalid app token");
                }
            }
            return new com.bugfender.sdk.y.b().b(b0VarA.c()).a(b0VarA.d()).a(b0VarA.b().a()).a();
        } catch (com.bugfender.sdk.p1 e) {
            com.bugfender.sdk.h hVarOf = this.b.of(e);
            a(hVarOf);
            throw hVarOf;
        }
    }

    public void a(com.bugfender.sdk.u0 u0Var, com.bugfender.sdk.k2 k2Var) throws com.bugfender.sdk.h {
        try {
            this.a.a("issue", com.bugfender.sdk.y0.b.a.a(u0Var, k2Var));
        } catch (com.bugfender.sdk.p1 e) {
            com.bugfender.sdk.h hVarOf = this.b.of(e);
            a(hVarOf);
            throw hVarOf;
        }
    }

    public void a(java.lang.String str, java.lang.String str2, com.bugfender.sdk.z0<?> z0Var) throws com.bugfender.sdk.h {
        try {
            this.a.a("device/keyvalue", com.bugfender.sdk.y0.d.a.a(str, str2, z0Var));
        } catch (com.bugfender.sdk.p1 e) {
            com.bugfender.sdk.h hVarOf = this.b.of(e);
            a(hVarOf);
            throw hVarOf;
        }
    }

    public void a(java.util.List<com.bugfender.sdk.e1> list, com.bugfender.sdk.k2 k2Var) throws com.bugfender.sdk.h {
        try {
            this.a.a("log/batch", com.bugfender.sdk.y0.e.a.a(list, k2Var), k2Var.k());
        } catch (com.bugfender.sdk.p1 e) {
            com.bugfender.sdk.h hVarOf = this.b.of(e);
            a(hVarOf);
            throw hVarOf;
        }
    }
}
