package com.google.android.gms.maps.model;

/* JADX INFO: loaded from: classes.dex */
public final class Polyline {
    private final com.google.android.gms.internal.maps.zzz zzeb;

    public Polyline(com.google.android.gms.internal.maps.zzz zzzVar) {
        this.zzeb = (com.google.android.gms.internal.maps.zzz) com.google.android.gms.common.internal.Preconditions.checkNotNull(zzzVar);
    }

    public final void remove() {
        try {
            this.zzeb.remove();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final java.lang.String getId() {
        try {
            return this.zzeb.getId();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final void setPoints(java.util.List<com.google.android.gms.maps.model.LatLng> list) {
        try {
            this.zzeb.setPoints(list);
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final java.util.List<com.google.android.gms.maps.model.LatLng> getPoints() {
        try {
            return this.zzeb.getPoints();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final void setWidth(float f) {
        try {
            this.zzeb.setWidth(f);
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final float getWidth() {
        try {
            return this.zzeb.getWidth();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final void setColor(int i) {
        try {
            this.zzeb.setColor(i);
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final int getColor() {
        try {
            return this.zzeb.getColor();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final void setStartCap(com.google.android.gms.maps.model.Cap cap) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(cap, "startCap must not be null");
        try {
            this.zzeb.setStartCap(cap);
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final com.google.android.gms.maps.model.Cap getStartCap() {
        try {
            return this.zzeb.getStartCap().zzh();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final void setEndCap(com.google.android.gms.maps.model.Cap cap) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(cap, "endCap must not be null");
        try {
            this.zzeb.setEndCap(cap);
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final com.google.android.gms.maps.model.Cap getEndCap() {
        try {
            return this.zzeb.getEndCap().zzh();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final void setJointType(int i) {
        try {
            this.zzeb.setJointType(i);
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final int getJointType() {
        try {
            return this.zzeb.getJointType();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final void setPattern(java.util.List<com.google.android.gms.maps.model.PatternItem> list) {
        try {
            this.zzeb.setPattern(list);
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final java.util.List<com.google.android.gms.maps.model.PatternItem> getPattern() {
        try {
            return com.google.android.gms.maps.model.PatternItem.zza(this.zzeb.getPattern());
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final void setZIndex(float f) {
        try {
            this.zzeb.setZIndex(f);
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final float getZIndex() {
        try {
            return this.zzeb.getZIndex();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final void setVisible(boolean z) {
        try {
            this.zzeb.setVisible(z);
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final boolean isVisible() {
        try {
            return this.zzeb.isVisible();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final void setGeodesic(boolean z) {
        try {
            this.zzeb.setGeodesic(z);
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final boolean isGeodesic() {
        try {
            return this.zzeb.isGeodesic();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final void setClickable(boolean z) {
        try {
            this.zzeb.setClickable(z);
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final boolean isClickable() {
        try {
            return this.zzeb.isClickable();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final void setTag(java.lang.Object obj) {
        try {
            this.zzeb.zze(com.google.android.gms.dynamic.ObjectWrapper.wrap(obj));
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final java.lang.Object getTag() {
        try {
            return com.google.android.gms.dynamic.ObjectWrapper.unwrap(this.zzeb.zzk());
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.maps.model.Polyline)) {
            return false;
        }
        try {
            return this.zzeb.zzb(((com.google.android.gms.maps.model.Polyline) obj).zzeb);
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final int hashCode() {
        try {
            return this.zzeb.zzj();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }
}
