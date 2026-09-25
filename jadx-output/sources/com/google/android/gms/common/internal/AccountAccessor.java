package com.google.android.gms.common.internal;

/* JADX INFO: loaded from: classes.dex */
public class AccountAccessor extends com.google.android.gms.common.internal.IAccountAccessor.Stub {
    public static android.accounts.Account getAccountBinderSafe(com.google.android.gms.common.internal.IAccountAccessor iAccountAccessor) {
        if (iAccountAccessor != null) {
            long jClearCallingIdentity = android.os.Binder.clearCallingIdentity();
            try {
                return iAccountAccessor.getAccount();
            } catch (android.os.RemoteException unused) {
                android.util.Log.w("AccountAccessor", "Remote account accessor probably died");
                return null;
            } finally {
                android.os.Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        }
        return null;
    }

    @Override // com.google.android.gms.common.internal.IAccountAccessor
    public final android.accounts.Account getAccount() {
        throw new java.lang.NoSuchMethodError();
    }

    public boolean equals(java.lang.Object obj) {
        throw new java.lang.NoSuchMethodError();
    }
}
