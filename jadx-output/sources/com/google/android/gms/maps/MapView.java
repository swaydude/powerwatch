package com.google.android.gms.maps;

/* JADX INFO: loaded from: classes.dex */
public class MapView extends android.widget.FrameLayout {
    private final com.google.android.gms.maps.MapView.zzb zzbg;

    public MapView(android.content.Context context) {
        super(context);
        this.zzbg = new com.google.android.gms.maps.MapView.zzb(this, context, null);
        setClickable(true);
    }

    static class zza implements com.google.android.gms.maps.internal.MapLifecycleDelegate {
        private final android.view.ViewGroup parent;
        private final com.google.android.gms.maps.internal.IMapViewDelegate zzbh;
        private android.view.View zzbi;

        public zza(android.view.ViewGroup viewGroup, com.google.android.gms.maps.internal.IMapViewDelegate iMapViewDelegate) {
            this.zzbh = (com.google.android.gms.maps.internal.IMapViewDelegate) com.google.android.gms.common.internal.Preconditions.checkNotNull(iMapViewDelegate);
            this.parent = (android.view.ViewGroup) com.google.android.gms.common.internal.Preconditions.checkNotNull(viewGroup);
        }

        @Override // com.google.android.gms.dynamic.LifecycleDelegate
        public final void onInflate(android.app.Activity activity, android.os.Bundle bundle, android.os.Bundle bundle2) {
            throw new java.lang.UnsupportedOperationException("onInflate not allowed on MapViewDelegate");
        }

        @Override // com.google.android.gms.dynamic.LifecycleDelegate
        public final void onCreate(android.os.Bundle bundle) {
            try {
                android.os.Bundle bundle2 = new android.os.Bundle();
                com.google.android.gms.maps.internal.zzby.zza(bundle, bundle2);
                this.zzbh.onCreate(bundle2);
                com.google.android.gms.maps.internal.zzby.zza(bundle2, bundle);
                this.zzbi = (android.view.View) com.google.android.gms.dynamic.ObjectWrapper.unwrap(this.zzbh.getView());
                this.parent.removeAllViews();
                this.parent.addView(this.zzbi);
            } catch (android.os.RemoteException e) {
                throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
            }
        }

        @Override // com.google.android.gms.dynamic.LifecycleDelegate
        public final android.view.View onCreateView(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
            throw new java.lang.UnsupportedOperationException("onCreateView not allowed on MapViewDelegate");
        }

        @Override // com.google.android.gms.dynamic.LifecycleDelegate
        public final void onStart() {
            try {
                this.zzbh.onStart();
            } catch (android.os.RemoteException e) {
                throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
            }
        }

        @Override // com.google.android.gms.dynamic.LifecycleDelegate
        public final void onResume() {
            try {
                this.zzbh.onResume();
            } catch (android.os.RemoteException e) {
                throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
            }
        }

        @Override // com.google.android.gms.dynamic.LifecycleDelegate
        public final void onPause() {
            try {
                this.zzbh.onPause();
            } catch (android.os.RemoteException e) {
                throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
            }
        }

        @Override // com.google.android.gms.dynamic.LifecycleDelegate
        public final void onStop() {
            try {
                this.zzbh.onStop();
            } catch (android.os.RemoteException e) {
                throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
            }
        }

        @Override // com.google.android.gms.dynamic.LifecycleDelegate
        public final void onDestroyView() {
            throw new java.lang.UnsupportedOperationException("onDestroyView not allowed on MapViewDelegate");
        }

        @Override // com.google.android.gms.dynamic.LifecycleDelegate
        public final void onDestroy() {
            try {
                this.zzbh.onDestroy();
            } catch (android.os.RemoteException e) {
                throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
            }
        }

        @Override // com.google.android.gms.dynamic.LifecycleDelegate
        public final void onLowMemory() {
            try {
                this.zzbh.onLowMemory();
            } catch (android.os.RemoteException e) {
                throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
            }
        }

        @Override // com.google.android.gms.dynamic.LifecycleDelegate
        public final void onSaveInstanceState(android.os.Bundle bundle) {
            try {
                android.os.Bundle bundle2 = new android.os.Bundle();
                com.google.android.gms.maps.internal.zzby.zza(bundle, bundle2);
                this.zzbh.onSaveInstanceState(bundle2);
                com.google.android.gms.maps.internal.zzby.zza(bundle2, bundle);
            } catch (android.os.RemoteException e) {
                throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
            }
        }

        @Override // com.google.android.gms.maps.internal.MapLifecycleDelegate
        public final void getMapAsync(com.google.android.gms.maps.OnMapReadyCallback onMapReadyCallback) {
            try {
                this.zzbh.getMapAsync(new com.google.android.gms.maps.zzac(this, onMapReadyCallback));
            } catch (android.os.RemoteException e) {
                throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
            }
        }

        public final void onEnterAmbient(android.os.Bundle bundle) {
            try {
                android.os.Bundle bundle2 = new android.os.Bundle();
                com.google.android.gms.maps.internal.zzby.zza(bundle, bundle2);
                this.zzbh.onEnterAmbient(bundle2);
                com.google.android.gms.maps.internal.zzby.zza(bundle2, bundle);
            } catch (android.os.RemoteException e) {
                throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
            }
        }

        public final void onExitAmbient() {
            try {
                this.zzbh.onExitAmbient();
            } catch (android.os.RemoteException e) {
                throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
            }
        }
    }

    static class zzb extends com.google.android.gms.dynamic.DeferredLifecycleHelper<com.google.android.gms.maps.MapView.zza> {
        private com.google.android.gms.dynamic.OnDelegateCreatedListener<com.google.android.gms.maps.MapView.zza> zzbd;
        private final java.util.List<com.google.android.gms.maps.OnMapReadyCallback> zzbf = new java.util.ArrayList();
        private final android.view.ViewGroup zzbj;
        private final android.content.Context zzbk;
        private final com.google.android.gms.maps.GoogleMapOptions zzbl;

        zzb(android.view.ViewGroup viewGroup, android.content.Context context, com.google.android.gms.maps.GoogleMapOptions googleMapOptions) {
            this.zzbj = viewGroup;
            this.zzbk = context;
            this.zzbl = googleMapOptions;
        }

        @Override // com.google.android.gms.dynamic.DeferredLifecycleHelper
        protected final void createDelegate(com.google.android.gms.dynamic.OnDelegateCreatedListener<com.google.android.gms.maps.MapView.zza> onDelegateCreatedListener) {
            this.zzbd = onDelegateCreatedListener;
            if (onDelegateCreatedListener == null || getDelegate() != null) {
                return;
            }
            try {
                com.google.android.gms.maps.MapsInitializer.initialize(this.zzbk);
                com.google.android.gms.maps.internal.IMapViewDelegate iMapViewDelegateZza = com.google.android.gms.maps.internal.zzbz.zza(this.zzbk).zza(com.google.android.gms.dynamic.ObjectWrapper.wrap(this.zzbk), this.zzbl);
                if (iMapViewDelegateZza == null) {
                    return;
                }
                this.zzbd.onDelegateCreated(new com.google.android.gms.maps.MapView.zza(this.zzbj, iMapViewDelegateZza));
                java.util.Iterator<com.google.android.gms.maps.OnMapReadyCallback> it = this.zzbf.iterator();
                while (it.hasNext()) {
                    getDelegate().getMapAsync(it.next());
                }
                this.zzbf.clear();
            } catch (android.os.RemoteException e) {
                throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
            } catch (com.google.android.gms.common.GooglePlayServicesNotAvailableException unused) {
            }
        }

        public final void getMapAsync(com.google.android.gms.maps.OnMapReadyCallback onMapReadyCallback) {
            if (getDelegate() != null) {
                getDelegate().getMapAsync(onMapReadyCallback);
            } else {
                this.zzbf.add(onMapReadyCallback);
            }
        }
    }

    public MapView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.zzbg = new com.google.android.gms.maps.MapView.zzb(this, context, com.google.android.gms.maps.GoogleMapOptions.createFromAttributes(context, attributeSet));
        setClickable(true);
    }

    public MapView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.zzbg = new com.google.android.gms.maps.MapView.zzb(this, context, com.google.android.gms.maps.GoogleMapOptions.createFromAttributes(context, attributeSet));
        setClickable(true);
    }

    public MapView(android.content.Context context, com.google.android.gms.maps.GoogleMapOptions googleMapOptions) {
        super(context);
        this.zzbg = new com.google.android.gms.maps.MapView.zzb(this, context, googleMapOptions);
        setClickable(true);
    }

    public final void onCreate(android.os.Bundle bundle) {
        android.os.StrictMode.ThreadPolicy threadPolicy = android.os.StrictMode.getThreadPolicy();
        android.os.StrictMode.setThreadPolicy(new android.os.StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            this.zzbg.onCreate(bundle);
            if (this.zzbg.getDelegate() == null) {
                com.google.android.gms.dynamic.DeferredLifecycleHelper.showGooglePlayUnavailableMessage(this);
            }
        } finally {
            android.os.StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public final void onResume() {
        this.zzbg.onResume();
    }

    public final void onPause() {
        this.zzbg.onPause();
    }

    public final void onStart() {
        this.zzbg.onStart();
    }

    public final void onStop() {
        this.zzbg.onStop();
    }

    public final void onDestroy() {
        this.zzbg.onDestroy();
    }

    public final void onLowMemory() {
        this.zzbg.onLowMemory();
    }

    public final void onSaveInstanceState(android.os.Bundle bundle) {
        this.zzbg.onSaveInstanceState(bundle);
    }

    public void getMapAsync(com.google.android.gms.maps.OnMapReadyCallback onMapReadyCallback) {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("getMapAsync() must be called on the main thread");
        this.zzbg.getMapAsync(onMapReadyCallback);
    }

    public final void onEnterAmbient(android.os.Bundle bundle) {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("onEnterAmbient() must be called on the main thread");
        com.google.android.gms.maps.MapView.zzb zzbVar = this.zzbg;
        if (zzbVar.getDelegate() != null) {
            zzbVar.getDelegate().onEnterAmbient(bundle);
        }
    }

    public final void onExitAmbient() {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("onExitAmbient() must be called on the main thread");
        com.google.android.gms.maps.MapView.zzb zzbVar = this.zzbg;
        if (zzbVar.getDelegate() != null) {
            zzbVar.getDelegate().onExitAmbient();
        }
    }
}
