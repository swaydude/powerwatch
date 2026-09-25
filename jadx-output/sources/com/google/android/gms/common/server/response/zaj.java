package com.google.android.gms.common.server.response;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zaj extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.server.response.zaj> CREATOR = new com.google.android.gms.common.server.response.zao();
    private final int zali;
    private final java.util.HashMap<java.lang.String, java.util.Map<java.lang.String, com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?>>> zarj;
    private final java.util.ArrayList<com.google.android.gms.common.server.response.zam> zark;
    private final java.lang.String zarl;

    zaj(int i, java.util.ArrayList<com.google.android.gms.common.server.response.zam> arrayList, java.lang.String str) {
        this.zali = i;
        this.zark = null;
        java.util.HashMap<java.lang.String, java.util.Map<java.lang.String, com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?>>> map = new java.util.HashMap<>();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            com.google.android.gms.common.server.response.zam zamVar = arrayList.get(i2);
            java.lang.String str2 = zamVar.className;
            java.util.HashMap map2 = new java.util.HashMap();
            int size2 = zamVar.zaro.size();
            for (int i3 = 0; i3 < size2; i3++) {
                com.google.android.gms.common.server.response.zal zalVar = zamVar.zaro.get(i3);
                map2.put(zalVar.zarm, zalVar.zarn);
            }
            map.put(str2, map2);
        }
        this.zarj = map;
        this.zarl = (java.lang.String) com.google.android.gms.common.internal.Preconditions.checkNotNull(str);
        zacp();
    }

    public final void zacp() {
        java.util.Iterator<java.lang.String> it = this.zarj.keySet().iterator();
        while (it.hasNext()) {
            java.util.Map<java.lang.String, com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?>> map = this.zarj.get(it.next());
            java.util.Iterator<java.lang.String> it2 = map.keySet().iterator();
            while (it2.hasNext()) {
                map.get(it2.next()).zaa(this);
            }
        }
    }

    public final void zacq() {
        for (java.lang.String str : this.zarj.keySet()) {
            java.util.Map<java.lang.String, com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?>> map = this.zarj.get(str);
            java.util.HashMap map2 = new java.util.HashMap();
            for (java.lang.String str2 : map.keySet()) {
                map2.put(str2, map.get(str2).zacj());
            }
            this.zarj.put(str, map2);
        }
    }

    public zaj(java.lang.Class<? extends com.google.android.gms.common.server.response.FastJsonResponse> cls) {
        this.zali = 1;
        this.zark = null;
        this.zarj = new java.util.HashMap<>();
        this.zarl = cls.getCanonicalName();
    }

    public final void zaa(java.lang.Class<? extends com.google.android.gms.common.server.response.FastJsonResponse> cls, java.util.Map<java.lang.String, com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?>> map) {
        this.zarj.put(cls.getCanonicalName(), map);
    }

    public final java.util.Map<java.lang.String, com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?>> zai(java.lang.String str) {
        return this.zarj.get(str);
    }

    public final boolean zaa(java.lang.Class<? extends com.google.android.gms.common.server.response.FastJsonResponse> cls) {
        return this.zarj.containsKey(cls.getCanonicalName());
    }

    public final java.lang.String zacr() {
        return this.zarl;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (java.lang.String str : this.zarj.keySet()) {
            sb.append(str);
            sb.append(":\n");
            java.util.Map<java.lang.String, com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?>> map = this.zarj.get(str);
            for (java.lang.String str2 : map.keySet()) {
                sb.append("  ");
                sb.append(str2);
                sb.append(": ");
                sb.append(map.get(str2));
            }
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, this.zali);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.String str : this.zarj.keySet()) {
            arrayList.add(new com.google.android.gms.common.server.response.zam(str, this.zarj.get(str)));
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(parcel, 2, arrayList, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 3, this.zarl, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
