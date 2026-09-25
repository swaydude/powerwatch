package com.baidu.mapapi.model;

/* JADX INFO: loaded from: classes.dex */
public final class LatLngBounds implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.baidu.mapapi.model.LatLngBounds> CREATOR = new com.baidu.mapapi.model.b();
    public final com.baidu.mapapi.model.LatLng northeast;
    public final com.baidu.mapapi.model.LatLng southwest;

    public static final class Builder {
        private double a;
        private double b;
        private double c;
        private double d;
        private boolean e = true;

        private void a(com.baidu.mapapi.model.LatLng latLng) {
            if (latLng == null) {
                return;
            }
            double d = latLng.latitude;
            double d2 = latLng.longitude;
            if (d < this.a) {
                this.a = d;
            }
            if (d > this.b) {
                this.b = d;
            }
            if (d2 < this.c) {
                this.c = d2;
            }
            if (d2 > this.d) {
                this.d = d2;
            }
        }

        public com.baidu.mapapi.model.LatLngBounds build() {
            return new com.baidu.mapapi.model.LatLngBounds(new com.baidu.mapapi.model.LatLng(this.b, this.d), new com.baidu.mapapi.model.LatLng(this.a, this.c));
        }

        public com.baidu.mapapi.model.LatLngBounds.Builder include(com.baidu.mapapi.model.LatLng latLng) {
            if (latLng == null) {
                return this;
            }
            if (this.e) {
                this.e = false;
                double d = latLng.latitude;
                this.a = d;
                this.b = d;
                double d2 = latLng.longitude;
                this.c = d2;
                this.d = d2;
            }
            a(latLng);
            return this;
        }

        public com.baidu.mapapi.model.LatLngBounds.Builder include(java.util.List<com.baidu.mapapi.model.LatLng> list) {
            if (list != null && list.size() != 0) {
                if (list.get(0) != null && this.e) {
                    this.e = false;
                    double d = list.get(0).latitude;
                    this.c = d;
                    this.b = d;
                    double d2 = list.get(0).longitude;
                    this.c = d2;
                    this.d = d2;
                }
                java.util.Iterator<com.baidu.mapapi.model.LatLng> it = list.iterator();
                while (it.hasNext()) {
                    a(it.next());
                }
            }
            return this;
        }
    }

    protected LatLngBounds(android.os.Parcel parcel) {
        this.northeast = (com.baidu.mapapi.model.LatLng) parcel.readParcelable(com.baidu.mapapi.model.LatLng.class.getClassLoader());
        this.southwest = (com.baidu.mapapi.model.LatLng) parcel.readParcelable(com.baidu.mapapi.model.LatLng.class.getClassLoader());
    }

    LatLngBounds(com.baidu.mapapi.model.LatLng latLng, com.baidu.mapapi.model.LatLng latLng2) {
        this.northeast = latLng;
        this.southwest = latLng2;
    }

    public boolean contains(com.baidu.mapapi.model.LatLng latLng) {
        if (latLng == null) {
            return false;
        }
        double d = this.southwest.latitude;
        double d2 = this.northeast.latitude;
        double d3 = this.southwest.longitude;
        double d4 = this.northeast.longitude;
        double d5 = latLng.latitude;
        double d6 = latLng.longitude;
        return d5 >= d && d5 <= d2 && d6 >= d3 && d6 <= d4;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public com.baidu.mapapi.model.LatLng getCenter() {
        return new com.baidu.mapapi.model.LatLng(((this.northeast.latitude - this.southwest.latitude) / 2.0d) + this.southwest.latitude, ((this.northeast.longitude - this.southwest.longitude) / 2.0d) + this.southwest.longitude);
    }

    public java.lang.String toString() {
        return "southwest: " + this.southwest.latitude + ", " + this.southwest.longitude + "\nnortheast: " + this.northeast.latitude + ", " + this.northeast.longitude;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeParcelable(this.northeast, i);
        parcel.writeParcelable(this.southwest, i);
    }
}
