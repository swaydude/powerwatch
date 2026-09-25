package com.google.android.gms.maps;

/* JADX INFO: loaded from: classes.dex */
public final class UiSettings {
    private final com.google.android.gms.maps.internal.IUiSettingsDelegate zzcj;

    UiSettings(com.google.android.gms.maps.internal.IUiSettingsDelegate iUiSettingsDelegate) {
        this.zzcj = iUiSettingsDelegate;
    }

    public final void setZoomControlsEnabled(boolean z) {
        try {
            this.zzcj.setZoomControlsEnabled(z);
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final void setCompassEnabled(boolean z) {
        try {
            this.zzcj.setCompassEnabled(z);
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final void setMyLocationButtonEnabled(boolean z) {
        try {
            this.zzcj.setMyLocationButtonEnabled(z);
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final void setIndoorLevelPickerEnabled(boolean z) {
        try {
            this.zzcj.setIndoorLevelPickerEnabled(z);
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final void setScrollGesturesEnabled(boolean z) {
        try {
            this.zzcj.setScrollGesturesEnabled(z);
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final void setZoomGesturesEnabled(boolean z) {
        try {
            this.zzcj.setZoomGesturesEnabled(z);
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final void setTiltGesturesEnabled(boolean z) {
        try {
            this.zzcj.setTiltGesturesEnabled(z);
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final void setRotateGesturesEnabled(boolean z) {
        try {
            this.zzcj.setRotateGesturesEnabled(z);
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final void setScrollGesturesEnabledDuringRotateOrZoom(boolean z) {
        try {
            this.zzcj.setScrollGesturesEnabledDuringRotateOrZoom(z);
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final void setAllGesturesEnabled(boolean z) {
        try {
            this.zzcj.setAllGesturesEnabled(z);
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final void setMapToolbarEnabled(boolean z) {
        try {
            this.zzcj.setMapToolbarEnabled(z);
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final boolean isZoomControlsEnabled() {
        try {
            return this.zzcj.isZoomControlsEnabled();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final boolean isCompassEnabled() {
        try {
            return this.zzcj.isCompassEnabled();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final boolean isMyLocationButtonEnabled() {
        try {
            return this.zzcj.isMyLocationButtonEnabled();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final boolean isIndoorLevelPickerEnabled() {
        try {
            return this.zzcj.isIndoorLevelPickerEnabled();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final boolean isScrollGesturesEnabled() {
        try {
            return this.zzcj.isScrollGesturesEnabled();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final boolean isScrollGesturesEnabledDuringRotateOrZoom() {
        try {
            return this.zzcj.isScrollGesturesEnabled();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final boolean isZoomGesturesEnabled() {
        try {
            return this.zzcj.isZoomGesturesEnabled();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final boolean isTiltGesturesEnabled() {
        try {
            return this.zzcj.isTiltGesturesEnabled();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final boolean isRotateGesturesEnabled() {
        try {
            return this.zzcj.isRotateGesturesEnabled();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final boolean isMapToolbarEnabled() {
        try {
            return this.zzcj.isMapToolbarEnabled();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }
}
