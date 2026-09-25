package com.google.android.gms.location;

/* JADX INFO: loaded from: classes.dex */
public class GeofencingEvent {
    private final int errorCode;
    private final int zzam;
    private final java.util.List<com.google.android.gms.location.Geofence> zzan;
    private final android.location.Location zzao;

    private GeofencingEvent(int i, int i2, java.util.List<com.google.android.gms.location.Geofence> list, android.location.Location location) {
        this.errorCode = i;
        this.zzam = i2;
        this.zzan = list;
        this.zzao = location;
    }

    public static com.google.android.gms.location.GeofencingEvent fromIntent(android.content.Intent intent) {
        java.util.ArrayList arrayList = null;
        if (intent == null) {
            return null;
        }
        int i = -1;
        int intExtra = intent.getIntExtra(com.google.android.gms.common.internal.Constants.KEY_GMS_ERROR_CODE, -1);
        int intExtra2 = intent.getIntExtra("com.google.android.location.intent.extra.transition", -1);
        if (intExtra2 != -1 && (intExtra2 == 1 || intExtra2 == 2 || intExtra2 == 4)) {
            i = intExtra2;
        }
        java.util.ArrayList arrayList2 = (java.util.ArrayList) intent.getSerializableExtra("com.google.android.location.intent.extra.geofence_list");
        if (arrayList2 != null) {
            arrayList = new java.util.ArrayList(arrayList2.size());
            java.util.ArrayList arrayList3 = arrayList2;
            int size = arrayList3.size();
            int i2 = 0;
            while (i2 < size) {
                java.lang.Object obj = arrayList3.get(i2);
                i2++;
                arrayList.add(com.google.android.gms.internal.location.zzbh.zza((byte[]) obj));
            }
        }
        return new com.google.android.gms.location.GeofencingEvent(intExtra, i, arrayList, (android.location.Location) intent.getParcelableExtra("com.google.android.location.intent.extra.triggering_location"));
    }

    public int getErrorCode() {
        return this.errorCode;
    }

    public int getGeofenceTransition() {
        return this.zzam;
    }

    public java.util.List<com.google.android.gms.location.Geofence> getTriggeringGeofences() {
        return this.zzan;
    }

    public android.location.Location getTriggeringLocation() {
        return this.zzao;
    }

    public boolean hasError() {
        return this.errorCode != -1;
    }
}
