package com.google.android.gms.common.api;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public class BooleanResult implements com.google.android.gms.common.api.Result {
    private final com.google.android.gms.common.api.Status mStatus;
    private final boolean zabi;

    public BooleanResult(com.google.android.gms.common.api.Status status, boolean z) {
        this.mStatus = (com.google.android.gms.common.api.Status) com.google.android.gms.common.internal.Preconditions.checkNotNull(status, "Status must not be null");
        this.zabi = z;
    }

    @Override // com.google.android.gms.common.api.Result
    public com.google.android.gms.common.api.Status getStatus() {
        return this.mStatus;
    }

    public boolean getValue() {
        return this.zabi;
    }

    public final int hashCode() {
        return ((this.mStatus.hashCode() + 527) * 31) + (this.zabi ? 1 : 0);
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.common.api.BooleanResult)) {
            return false;
        }
        com.google.android.gms.common.api.BooleanResult booleanResult = (com.google.android.gms.common.api.BooleanResult) obj;
        return this.mStatus.equals(booleanResult.mStatus) && this.zabi == booleanResult.zabi;
    }
}
