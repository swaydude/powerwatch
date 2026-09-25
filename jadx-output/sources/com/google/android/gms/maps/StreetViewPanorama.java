package com.google.android.gms.maps;

/* JADX INFO: loaded from: classes.dex */
public class StreetViewPanorama {
    private final com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate zzbo;

    public interface OnStreetViewPanoramaCameraChangeListener {
        void onStreetViewPanoramaCameraChange(com.google.android.gms.maps.model.StreetViewPanoramaCamera streetViewPanoramaCamera);
    }

    public interface OnStreetViewPanoramaChangeListener {
        void onStreetViewPanoramaChange(com.google.android.gms.maps.model.StreetViewPanoramaLocation streetViewPanoramaLocation);
    }

    public interface OnStreetViewPanoramaClickListener {
        void onStreetViewPanoramaClick(com.google.android.gms.maps.model.StreetViewPanoramaOrientation streetViewPanoramaOrientation);
    }

    public interface OnStreetViewPanoramaLongClickListener {
        void onStreetViewPanoramaLongClick(com.google.android.gms.maps.model.StreetViewPanoramaOrientation streetViewPanoramaOrientation);
    }

    public StreetViewPanorama(com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate iStreetViewPanoramaDelegate) {
        this.zzbo = (com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate) com.google.android.gms.common.internal.Preconditions.checkNotNull(iStreetViewPanoramaDelegate, "delegate");
    }

    public boolean isZoomGesturesEnabled() {
        try {
            return this.zzbo.isZoomGesturesEnabled();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public void setZoomGesturesEnabled(boolean z) {
        try {
            this.zzbo.enableZoom(z);
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public boolean isPanningGesturesEnabled() {
        try {
            return this.zzbo.isPanningGesturesEnabled();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public void setPanningGesturesEnabled(boolean z) {
        try {
            this.zzbo.enablePanning(z);
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public boolean isUserNavigationEnabled() {
        try {
            return this.zzbo.isUserNavigationEnabled();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public void setUserNavigationEnabled(boolean z) {
        try {
            this.zzbo.enableUserNavigation(z);
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public boolean isStreetNamesEnabled() {
        try {
            return this.zzbo.isStreetNamesEnabled();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public void setStreetNamesEnabled(boolean z) {
        try {
            this.zzbo.enableStreetNames(z);
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public void animateTo(com.google.android.gms.maps.model.StreetViewPanoramaCamera streetViewPanoramaCamera, long j) {
        try {
            this.zzbo.animateTo(streetViewPanoramaCamera, j);
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public com.google.android.gms.maps.model.StreetViewPanoramaCamera getPanoramaCamera() {
        try {
            return this.zzbo.getPanoramaCamera();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public void setPosition(java.lang.String str) {
        try {
            this.zzbo.setPositionWithID(str);
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public void setPosition(com.google.android.gms.maps.model.LatLng latLng) {
        try {
            this.zzbo.setPosition(latLng);
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public void setPosition(com.google.android.gms.maps.model.LatLng latLng, int i) {
        try {
            this.zzbo.setPositionWithRadius(latLng, i);
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public void setPosition(com.google.android.gms.maps.model.LatLng latLng, com.google.android.gms.maps.model.StreetViewSource streetViewSource) {
        try {
            this.zzbo.setPositionWithSource(latLng, streetViewSource);
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public void setPosition(com.google.android.gms.maps.model.LatLng latLng, int i, com.google.android.gms.maps.model.StreetViewSource streetViewSource) {
        try {
            this.zzbo.setPositionWithRadiusAndSource(latLng, i, streetViewSource);
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public com.google.android.gms.maps.model.StreetViewPanoramaLocation getLocation() {
        try {
            return this.zzbo.getStreetViewPanoramaLocation();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public com.google.android.gms.maps.model.StreetViewPanoramaOrientation pointToOrientation(android.graphics.Point point) {
        try {
            return this.zzbo.pointToOrientation(com.google.android.gms.dynamic.ObjectWrapper.wrap(point));
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public android.graphics.Point orientationToPoint(com.google.android.gms.maps.model.StreetViewPanoramaOrientation streetViewPanoramaOrientation) {
        try {
            com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperOrientationToPoint = this.zzbo.orientationToPoint(streetViewPanoramaOrientation);
            if (iObjectWrapperOrientationToPoint == null) {
                return null;
            }
            return (android.graphics.Point) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapperOrientationToPoint);
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final void setOnStreetViewPanoramaChangeListener(com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaChangeListener onStreetViewPanoramaChangeListener) {
        try {
            if (onStreetViewPanoramaChangeListener == null) {
                this.zzbo.setOnStreetViewPanoramaChangeListener(null);
            } else {
                this.zzbo.setOnStreetViewPanoramaChangeListener(new com.google.android.gms.maps.zzad(this, onStreetViewPanoramaChangeListener));
            }
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final void setOnStreetViewPanoramaCameraChangeListener(com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaCameraChangeListener onStreetViewPanoramaCameraChangeListener) {
        try {
            if (onStreetViewPanoramaCameraChangeListener == null) {
                this.zzbo.setOnStreetViewPanoramaCameraChangeListener(null);
            } else {
                this.zzbo.setOnStreetViewPanoramaCameraChangeListener(new com.google.android.gms.maps.zzae(this, onStreetViewPanoramaCameraChangeListener));
            }
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final void setOnStreetViewPanoramaClickListener(com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaClickListener onStreetViewPanoramaClickListener) {
        try {
            if (onStreetViewPanoramaClickListener == null) {
                this.zzbo.setOnStreetViewPanoramaClickListener(null);
            } else {
                this.zzbo.setOnStreetViewPanoramaClickListener(new com.google.android.gms.maps.zzaf(this, onStreetViewPanoramaClickListener));
            }
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final void setOnStreetViewPanoramaLongClickListener(com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaLongClickListener onStreetViewPanoramaLongClickListener) {
        try {
            if (onStreetViewPanoramaLongClickListener == null) {
                this.zzbo.setOnStreetViewPanoramaLongClickListener(null);
            } else {
                this.zzbo.setOnStreetViewPanoramaLongClickListener(new com.google.android.gms.maps.zzag(this, onStreetViewPanoramaLongClickListener));
            }
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }
}
