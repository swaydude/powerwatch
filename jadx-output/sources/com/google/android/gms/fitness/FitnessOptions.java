package com.google.android.gms.fitness;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class FitnessOptions implements com.google.android.gms.auth.api.signin.GoogleSignInOptionsExtension {
    public static final int ACCESS_READ = 0;
    public static final int ACCESS_WRITE = 1;
    private final java.util.Set<com.google.android.gms.common.api.Scope> zzhu;

    private FitnessOptions(com.google.android.gms.fitness.FitnessOptions.Builder builder) {
        this.zzhu = com.google.android.gms.fitness.zzh.zza(builder.zzhu);
    }

    @Override // com.google.android.gms.auth.api.signin.GoogleSignInOptionsExtension
    public final int getExtensionType() {
        return 3;
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
    public static final class Builder {
        private final java.util.Set<com.google.android.gms.common.api.Scope> zzhu;

        private Builder() {
            this.zzhu = new java.util.HashSet();
        }

        public final com.google.android.gms.fitness.FitnessOptions.Builder addDataType(com.google.android.gms.fitness.data.DataType dataType) {
            return addDataType(dataType, 0);
        }

        public final com.google.android.gms.fitness.FitnessOptions.Builder addDataType(com.google.android.gms.fitness.data.DataType dataType, int i) {
            com.google.android.gms.common.internal.Preconditions.checkArgument(i == 0 || i == 1, "valid access types are FitnessOptions.ACCESS_READ or FitnessOptions.ACCESS_WRITE");
            if (i == 0 && dataType.zzn() != null) {
                this.zzhu.add(new com.google.android.gms.common.api.Scope(dataType.zzn()));
            } else if (i == 1 && dataType.zzo() != null) {
                this.zzhu.add(new com.google.android.gms.common.api.Scope(dataType.zzo()));
            }
            return this;
        }

        public final com.google.android.gms.fitness.FitnessOptions build() {
            return new com.google.android.gms.fitness.FitnessOptions(this);
        }
    }

    @Override // com.google.android.gms.auth.api.signin.GoogleSignInOptionsExtension
    public final android.os.Bundle toBundle() {
        return new android.os.Bundle();
    }

    @Override // com.google.android.gms.auth.api.signin.GoogleSignInOptionsExtension
    public final java.util.List<com.google.android.gms.common.api.Scope> getImpliedScopes() {
        return new java.util.ArrayList(this.zzhu);
    }

    public static com.google.android.gms.fitness.FitnessOptions.Builder builder() {
        return new com.google.android.gms.fitness.FitnessOptions.Builder();
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.gms.fitness.FitnessOptions) {
            return this.zzhu.equals(((com.google.android.gms.fitness.FitnessOptions) obj).zzhu);
        }
        return false;
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zzhu);
    }
}
