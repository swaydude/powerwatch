package com.google.android.gms.location;

/* JADX INFO: loaded from: classes.dex */
public interface Geofence {
    public static final int GEOFENCE_TRANSITION_DWELL = 4;
    public static final int GEOFENCE_TRANSITION_ENTER = 1;
    public static final int GEOFENCE_TRANSITION_EXIT = 2;
    public static final long NEVER_EXPIRE = -1;

    public static final class Builder {
        private double zzah;
        private double zzai;
        private float zzaj;
        private java.lang.String zzad = null;
        private int zzae = 0;
        private long zzaf = Long.MIN_VALUE;
        private short zzag = -1;
        private int zzak = 0;
        private int zzal = -1;

        public final com.google.android.gms.location.Geofence build() {
            if (this.zzad == null) {
                throw new java.lang.IllegalArgumentException("Request ID not set.");
            }
            int i = this.zzae;
            if (i == 0) {
                throw new java.lang.IllegalArgumentException("Transitions types not set.");
            }
            if ((i & 4) != 0 && this.zzal < 0) {
                throw new java.lang.IllegalArgumentException("Non-negative loitering delay needs to be set when transition types include GEOFENCE_TRANSITION_DWELLING.");
            }
            if (this.zzaf == Long.MIN_VALUE) {
                throw new java.lang.IllegalArgumentException("Expiration not set.");
            }
            if (this.zzag == -1) {
                throw new java.lang.IllegalArgumentException("Geofence region not set.");
            }
            if (this.zzak >= 0) {
                return new com.google.android.gms.internal.location.zzbh(this.zzad, this.zzae, (short) 1, this.zzah, this.zzai, this.zzaj, this.zzaf, this.zzak, this.zzal);
            }
            throw new java.lang.IllegalArgumentException("Notification responsiveness should be nonnegative.");
        }

        public final com.google.android.gms.location.Geofence.Builder setCircularRegion(double d, double d2, float f) {
            this.zzag = (short) 1;
            this.zzah = d;
            this.zzai = d2;
            this.zzaj = f;
            return this;
        }

        public final com.google.android.gms.location.Geofence.Builder setExpirationDuration(long j) {
            if (j < 0) {
                this.zzaf = -1L;
            } else {
                this.zzaf = android.os.SystemClock.elapsedRealtime() + j;
            }
            return this;
        }

        public final com.google.android.gms.location.Geofence.Builder setLoiteringDelay(int i) {
            this.zzal = i;
            return this;
        }

        public final com.google.android.gms.location.Geofence.Builder setNotificationResponsiveness(int i) {
            this.zzak = i;
            return this;
        }

        public final com.google.android.gms.location.Geofence.Builder setRequestId(java.lang.String str) {
            this.zzad = str;
            return this;
        }

        public final com.google.android.gms.location.Geofence.Builder setTransitionTypes(int i) {
            this.zzae = i;
            return this;
        }
    }

    java.lang.String getRequestId();
}
