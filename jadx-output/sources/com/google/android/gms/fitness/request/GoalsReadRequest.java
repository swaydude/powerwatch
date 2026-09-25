package com.google.android.gms.fitness.request;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public class GoalsReadRequest extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fitness.request.GoalsReadRequest> CREATOR = new com.google.android.gms.fitness.request.zzad();
    private final java.util.List<com.google.android.gms.fitness.data.DataType> zzio;
    private final java.util.List<java.lang.Integer> zzll;
    private final com.google.android.gms.internal.fitness.zzbm zzpl;
    private final java.util.List<java.lang.Integer> zzpm;

    public java.util.List<com.google.android.gms.fitness.data.DataType> getDataTypes() {
        return this.zzio;
    }

    public java.util.List<java.lang.Integer> getObjectiveTypes() {
        if (this.zzpm.isEmpty()) {
            return null;
        }
        return this.zzpm;
    }

    public java.util.List<java.lang.String> getActivityNames() {
        if (this.zzll.isEmpty()) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<java.lang.Integer> it = this.zzll.iterator();
        while (it.hasNext()) {
            arrayList.add(com.google.android.gms.internal.fitness.zzjn.getName(it.next().intValue()));
        }
        return arrayList;
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
    public static class Builder {
        private final java.util.List<com.google.android.gms.fitness.data.DataType> zzio = new java.util.ArrayList();
        private final java.util.List<java.lang.Integer> zzpm = new java.util.ArrayList();
        private final java.util.List<java.lang.Integer> zzll = new java.util.ArrayList();

        public com.google.android.gms.fitness.request.GoalsReadRequest.Builder addDataType(com.google.android.gms.fitness.data.DataType dataType) {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(dataType, "Attempting to use a null data type");
            if (!this.zzio.contains(dataType)) {
                this.zzio.add(dataType);
            }
            return this;
        }

        public com.google.android.gms.fitness.request.GoalsReadRequest.Builder addActivity(java.lang.String str) {
            int iZzp = com.google.android.gms.internal.fitness.zzjn.zzp(str);
            com.google.android.gms.common.internal.Preconditions.checkState(iZzp != 4, "Attempting to add an unknown activity");
            com.google.android.gms.internal.fitness.zzi.zza(java.lang.Integer.valueOf(iZzp), this.zzll);
            return this;
        }

        public com.google.android.gms.fitness.request.GoalsReadRequest.Builder addObjectiveType(int i) {
            boolean z = true;
            if (i != 1 && i != 2 && i != 3) {
                z = false;
            }
            com.google.android.gms.common.internal.Preconditions.checkState(z, "Attempting to add an invalid objective type");
            if (!this.zzpm.contains(java.lang.Integer.valueOf(i))) {
                this.zzpm.add(java.lang.Integer.valueOf(i));
            }
            return this;
        }

        public com.google.android.gms.fitness.request.GoalsReadRequest build() {
            com.google.android.gms.common.internal.Preconditions.checkState(!this.zzio.isEmpty(), "At least one data type should be specified.");
            return new com.google.android.gms.fitness.request.GoalsReadRequest(this);
        }
    }

    GoalsReadRequest(android.os.IBinder iBinder, java.util.List<com.google.android.gms.fitness.data.DataType> list, java.util.List<java.lang.Integer> list2, java.util.List<java.lang.Integer> list3) {
        this.zzpl = iBinder == null ? null : com.google.android.gms.internal.fitness.zzbp.zzf(iBinder);
        this.zzio = list;
        this.zzpm = list2;
        this.zzll = list3;
    }

    private GoalsReadRequest(com.google.android.gms.fitness.request.GoalsReadRequest.Builder builder) {
        this((com.google.android.gms.internal.fitness.zzbm) null, (java.util.List<com.google.android.gms.fitness.data.DataType>) builder.zzio, (java.util.List<java.lang.Integer>) builder.zzpm, (java.util.List<java.lang.Integer>) builder.zzll);
    }

    public GoalsReadRequest(com.google.android.gms.fitness.request.GoalsReadRequest goalsReadRequest, com.google.android.gms.internal.fitness.zzbm zzbmVar) {
        this(zzbmVar, goalsReadRequest.getDataTypes(), goalsReadRequest.zzpm, goalsReadRequest.zzll);
    }

    private GoalsReadRequest(com.google.android.gms.internal.fitness.zzbm zzbmVar, java.util.List<com.google.android.gms.fitness.data.DataType> list, java.util.List<java.lang.Integer> list2, java.util.List<java.lang.Integer> list3) {
        this(zzbmVar == null ? null : zzbmVar.asBinder(), list, list2, list3);
    }

    public boolean equals(java.lang.Object obj) {
        if (this != obj) {
            if (obj instanceof com.google.android.gms.fitness.request.GoalsReadRequest) {
                com.google.android.gms.fitness.request.GoalsReadRequest goalsReadRequest = (com.google.android.gms.fitness.request.GoalsReadRequest) obj;
                if (com.google.android.gms.common.internal.Objects.equal(this.zzio, goalsReadRequest.zzio) && com.google.android.gms.common.internal.Objects.equal(this.zzpm, goalsReadRequest.zzpm) && com.google.android.gms.common.internal.Objects.equal(this.zzll, goalsReadRequest.zzll)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zzio, this.zzpm, getActivityNames());
    }

    public java.lang.String toString() {
        return com.google.android.gms.common.internal.Objects.toStringHelper(this).add("dataTypes", this.zzio).add("objectiveTypes", this.zzpm).add("activities", getActivityNames()).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(parcel, 1, this.zzpl.asBinder(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeList(parcel, 2, getDataTypes(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeList(parcel, 3, this.zzpm, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeList(parcel, 4, this.zzll, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
