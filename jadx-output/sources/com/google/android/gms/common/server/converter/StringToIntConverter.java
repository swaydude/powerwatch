package com.google.android.gms.common.server.converter;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class StringToIntConverter extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.server.response.FastJsonResponse.FieldConverter<java.lang.String, java.lang.Integer> {
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.server.converter.StringToIntConverter> CREATOR = new com.google.android.gms.common.server.converter.zad();
    private final int zali;
    private final java.util.HashMap<java.lang.String, java.lang.Integer> zaqc;
    private final android.util.SparseArray<java.lang.String> zaqd;
    private final java.util.ArrayList<com.google.android.gms.common.server.converter.StringToIntConverter.zaa> zaqe;

    StringToIntConverter(int i, java.util.ArrayList<com.google.android.gms.common.server.converter.StringToIntConverter.zaa> arrayList) {
        this.zali = i;
        this.zaqc = new java.util.HashMap<>();
        this.zaqd = new android.util.SparseArray<>();
        this.zaqe = null;
        java.util.ArrayList<com.google.android.gms.common.server.converter.StringToIntConverter.zaa> arrayList2 = arrayList;
        int size = arrayList2.size();
        int i2 = 0;
        while (i2 < size) {
            com.google.android.gms.common.server.converter.StringToIntConverter.zaa zaaVar = arrayList2.get(i2);
            i2++;
            com.google.android.gms.common.server.converter.StringToIntConverter.zaa zaaVar2 = zaaVar;
            add(zaaVar2.zaqa, zaaVar2.zaqb);
        }
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse.FieldConverter
    public final int zach() {
        return 7;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse.FieldConverter
    public final int zaci() {
        return 0;
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    public static final class zaa extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
        public static final android.os.Parcelable.Creator<com.google.android.gms.common.server.converter.StringToIntConverter.zaa> CREATOR = new com.google.android.gms.common.server.converter.zac();
        private final int versionCode;
        final java.lang.String zaqa;
        final int zaqb;

        zaa(int i, java.lang.String str, int i2) {
            this.versionCode = i;
            this.zaqa = str;
            this.zaqb = i2;
        }

        zaa(java.lang.String str, int i) {
            this.versionCode = 1;
            this.zaqa = str;
            this.zaqb = i;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int i) {
            int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, this.versionCode);
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, this.zaqa, false);
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 3, this.zaqb);
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
        }
    }

    public StringToIntConverter() {
        this.zali = 1;
        this.zaqc = new java.util.HashMap<>();
        this.zaqd = new android.util.SparseArray<>();
        this.zaqe = null;
    }

    public final com.google.android.gms.common.server.converter.StringToIntConverter add(java.lang.String str, int i) {
        this.zaqc.put(str, java.lang.Integer.valueOf(i));
        this.zaqd.put(i, str);
        return this;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, this.zali);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.String str : this.zaqc.keySet()) {
            arrayList.add(new com.google.android.gms.common.server.converter.StringToIntConverter.zaa(str, this.zaqc.get(str).intValue()));
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(parcel, 2, arrayList, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse.FieldConverter
    public final /* synthetic */ java.lang.String convertBack(java.lang.Integer num) {
        java.lang.String str = this.zaqd.get(num.intValue());
        return (str == null && this.zaqc.containsKey("gms_unknown")) ? "gms_unknown" : str;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse.FieldConverter
    public final /* synthetic */ java.lang.Integer convert(java.lang.String str) {
        java.lang.Integer num = this.zaqc.get(str);
        return num == null ? this.zaqc.get("gms_unknown") : num;
    }
}
