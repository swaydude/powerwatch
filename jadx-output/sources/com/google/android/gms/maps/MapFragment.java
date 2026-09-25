package com.google.android.gms.maps;

/* JADX INFO: loaded from: classes.dex */
public class MapFragment extends android.app.Fragment {
    private final com.google.android.gms.maps.MapFragment.zzb zzaz = new com.google.android.gms.maps.MapFragment.zzb(this);

    public static com.google.android.gms.maps.MapFragment newInstance() {
        return new com.google.android.gms.maps.MapFragment();
    }

    public static com.google.android.gms.maps.MapFragment newInstance(com.google.android.gms.maps.GoogleMapOptions googleMapOptions) {
        com.google.android.gms.maps.MapFragment mapFragment = new com.google.android.gms.maps.MapFragment();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putParcelable("MapOptions", googleMapOptions);
        mapFragment.setArguments(bundle);
        return mapFragment;
    }

    static class zza implements com.google.android.gms.maps.internal.MapLifecycleDelegate {
        private final android.app.Fragment zzba;
        private final com.google.android.gms.maps.internal.IMapFragmentDelegate zzbb;

        public zza(android.app.Fragment fragment, com.google.android.gms.maps.internal.IMapFragmentDelegate iMapFragmentDelegate) {
            this.zzbb = (com.google.android.gms.maps.internal.IMapFragmentDelegate) com.google.android.gms.common.internal.Preconditions.checkNotNull(iMapFragmentDelegate);
            this.zzba = (android.app.Fragment) com.google.android.gms.common.internal.Preconditions.checkNotNull(fragment);
        }

        @Override // com.google.android.gms.dynamic.LifecycleDelegate
        public final void onInflate(android.app.Activity activity, android.os.Bundle bundle, android.os.Bundle bundle2) {
            com.google.android.gms.maps.GoogleMapOptions googleMapOptions = (com.google.android.gms.maps.GoogleMapOptions) bundle.getParcelable("MapOptions");
            try {
                android.os.Bundle bundle3 = new android.os.Bundle();
                com.google.android.gms.maps.internal.zzby.zza(bundle2, bundle3);
                this.zzbb.onInflate(com.google.android.gms.dynamic.ObjectWrapper.wrap(activity), googleMapOptions, bundle3);
                com.google.android.gms.maps.internal.zzby.zza(bundle3, bundle2);
            } catch (android.os.RemoteException e) {
                throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
            }
        }

        @Override // com.google.android.gms.dynamic.LifecycleDelegate
        public final void onCreate(android.os.Bundle bundle) {
            try {
                android.os.Bundle bundle2 = new android.os.Bundle();
                com.google.android.gms.maps.internal.zzby.zza(bundle, bundle2);
                android.os.Bundle arguments = this.zzba.getArguments();
                if (arguments != null && arguments.containsKey("MapOptions")) {
                    com.google.android.gms.maps.internal.zzby.zza(bundle2, "MapOptions", arguments.getParcelable("MapOptions"));
                }
                this.zzbb.onCreate(bundle2);
                com.google.android.gms.maps.internal.zzby.zza(bundle2, bundle);
            } catch (android.os.RemoteException e) {
                throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
            }
        }

        @Override // com.google.android.gms.dynamic.LifecycleDelegate
        public final android.view.View onCreateView(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
            try {
                android.os.Bundle bundle2 = new android.os.Bundle();
                com.google.android.gms.maps.internal.zzby.zza(bundle, bundle2);
                com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperOnCreateView = this.zzbb.onCreateView(com.google.android.gms.dynamic.ObjectWrapper.wrap(layoutInflater), com.google.android.gms.dynamic.ObjectWrapper.wrap(viewGroup), bundle2);
                com.google.android.gms.maps.internal.zzby.zza(bundle2, bundle);
                return (android.view.View) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapperOnCreateView);
            } catch (android.os.RemoteException e) {
                throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
            }
        }

        @Override // com.google.android.gms.dynamic.LifecycleDelegate
        public final void onStart() {
            try {
                this.zzbb.onStart();
            } catch (android.os.RemoteException e) {
                throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
            }
        }

        @Override // com.google.android.gms.dynamic.LifecycleDelegate
        public final void onResume() {
            try {
                this.zzbb.onResume();
            } catch (android.os.RemoteException e) {
                throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
            }
        }

        @Override // com.google.android.gms.dynamic.LifecycleDelegate
        public final void onPause() {
            try {
                this.zzbb.onPause();
            } catch (android.os.RemoteException e) {
                throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
            }
        }

        @Override // com.google.android.gms.dynamic.LifecycleDelegate
        public final void onStop() {
            try {
                this.zzbb.onStop();
            } catch (android.os.RemoteException e) {
                throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
            }
        }

        @Override // com.google.android.gms.dynamic.LifecycleDelegate
        public final void onDestroyView() {
            try {
                this.zzbb.onDestroyView();
            } catch (android.os.RemoteException e) {
                throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
            }
        }

        @Override // com.google.android.gms.dynamic.LifecycleDelegate
        public final void onDestroy() {
            try {
                this.zzbb.onDestroy();
            } catch (android.os.RemoteException e) {
                throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
            }
        }

        @Override // com.google.android.gms.dynamic.LifecycleDelegate
        public final void onLowMemory() {
            try {
                this.zzbb.onLowMemory();
            } catch (android.os.RemoteException e) {
                throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
            }
        }

        @Override // com.google.android.gms.dynamic.LifecycleDelegate
        public final void onSaveInstanceState(android.os.Bundle bundle) {
            try {
                android.os.Bundle bundle2 = new android.os.Bundle();
                com.google.android.gms.maps.internal.zzby.zza(bundle, bundle2);
                this.zzbb.onSaveInstanceState(bundle2);
                com.google.android.gms.maps.internal.zzby.zza(bundle2, bundle);
            } catch (android.os.RemoteException e) {
                throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
            }
        }

        @Override // com.google.android.gms.maps.internal.MapLifecycleDelegate
        public final void getMapAsync(com.google.android.gms.maps.OnMapReadyCallback onMapReadyCallback) {
            try {
                this.zzbb.getMapAsync(new com.google.android.gms.maps.zzab(this, onMapReadyCallback));
            } catch (android.os.RemoteException e) {
                throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
            }
        }

        public final void onEnterAmbient(android.os.Bundle bundle) {
            try {
                android.os.Bundle bundle2 = new android.os.Bundle();
                com.google.android.gms.maps.internal.zzby.zza(bundle, bundle2);
                this.zzbb.onEnterAmbient(bundle2);
                com.google.android.gms.maps.internal.zzby.zza(bundle2, bundle);
            } catch (android.os.RemoteException e) {
                throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
            }
        }

        public final void onExitAmbient() {
            try {
                this.zzbb.onExitAmbient();
            } catch (android.os.RemoteException e) {
                throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
            }
        }
    }

    static class zzb extends com.google.android.gms.dynamic.DeferredLifecycleHelper<com.google.android.gms.maps.MapFragment.zza> {
        private final android.app.Fragment zzba;
        private com.google.android.gms.dynamic.OnDelegateCreatedListener<com.google.android.gms.maps.MapFragment.zza> zzbd;
        private android.app.Activity zzbe;
        private final java.util.List<com.google.android.gms.maps.OnMapReadyCallback> zzbf = new java.util.ArrayList();

        zzb(android.app.Fragment fragment) {
            this.zzba = fragment;
        }

        @Override // com.google.android.gms.dynamic.DeferredLifecycleHelper
        protected final void createDelegate(com.google.android.gms.dynamic.OnDelegateCreatedListener<com.google.android.gms.maps.MapFragment.zza> onDelegateCreatedListener) {
            this.zzbd = onDelegateCreatedListener;
            zzd();
        }

        private final void zzd() {
            if (this.zzbe == null || this.zzbd == null || getDelegate() != null) {
                return;
            }
            try {
                com.google.android.gms.maps.MapsInitializer.initialize(this.zzbe);
                com.google.android.gms.maps.internal.IMapFragmentDelegate iMapFragmentDelegateZzc = com.google.android.gms.maps.internal.zzbz.zza(this.zzbe).zzc(com.google.android.gms.dynamic.ObjectWrapper.wrap(this.zzbe));
                if (iMapFragmentDelegateZzc == null) {
                    return;
                }
                this.zzbd.onDelegateCreated(new com.google.android.gms.maps.MapFragment.zza(this.zzba, iMapFragmentDelegateZzc));
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

        /* JADX INFO: Access modifiers changed from: private */
        public final void setActivity(android.app.Activity activity) {
            this.zzbe = activity;
            zzd();
        }

        public final void getMapAsync(com.google.android.gms.maps.OnMapReadyCallback onMapReadyCallback) {
            if (getDelegate() != null) {
                getDelegate().getMapAsync(onMapReadyCallback);
            } else {
                this.zzbf.add(onMapReadyCallback);
            }
        }
    }

    @Override // android.app.Fragment
    public void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        this.zzaz.setActivity(activity);
    }

    @Override // android.app.Fragment
    public void onInflate(android.app.Activity activity, android.util.AttributeSet attributeSet, android.os.Bundle bundle) {
        android.os.StrictMode.ThreadPolicy threadPolicy = android.os.StrictMode.getThreadPolicy();
        android.os.StrictMode.setThreadPolicy(new android.os.StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            super.onInflate(activity, attributeSet, bundle);
            this.zzaz.setActivity(activity);
            com.google.android.gms.maps.GoogleMapOptions googleMapOptionsCreateFromAttributes = com.google.android.gms.maps.GoogleMapOptions.createFromAttributes(activity, attributeSet);
            android.os.Bundle bundle2 = new android.os.Bundle();
            bundle2.putParcelable("MapOptions", googleMapOptionsCreateFromAttributes);
            this.zzaz.onInflate(activity, bundle2, bundle);
        } finally {
            android.os.StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    @Override // android.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.zzaz.onCreate(bundle);
    }

    @Override // android.app.Fragment
    public android.view.View onCreateView(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        android.view.View viewOnCreateView = this.zzaz.onCreateView(layoutInflater, viewGroup, bundle);
        viewOnCreateView.setClickable(true);
        return viewOnCreateView;
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        this.zzaz.onResume();
    }

    @Override // android.app.Fragment
    public void onPause() {
        this.zzaz.onPause();
        super.onPause();
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        this.zzaz.onStart();
    }

    @Override // android.app.Fragment
    public void onStop() {
        this.zzaz.onStop();
        super.onStop();
    }

    @Override // android.app.Fragment
    public void onDestroyView() {
        this.zzaz.onDestroyView();
        super.onDestroyView();
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        this.zzaz.onDestroy();
        super.onDestroy();
    }

    @Override // android.app.Fragment, android.content.ComponentCallbacks
    public void onLowMemory() {
        this.zzaz.onLowMemory();
        super.onLowMemory();
    }

    @Override // android.app.Fragment
    public void onActivityCreated(android.os.Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(com.google.android.gms.maps.MapFragment.class.getClassLoader());
        }
        super.onActivityCreated(bundle);
    }

    @Override // android.app.Fragment
    public void onSaveInstanceState(android.os.Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(com.google.android.gms.maps.MapFragment.class.getClassLoader());
        }
        super.onSaveInstanceState(bundle);
        this.zzaz.onSaveInstanceState(bundle);
    }

    public final void onEnterAmbient(android.os.Bundle bundle) {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("onEnterAmbient must be called on the main thread.");
        com.google.android.gms.maps.MapFragment.zzb zzbVar = this.zzaz;
        if (zzbVar.getDelegate() != null) {
            zzbVar.getDelegate().onEnterAmbient(bundle);
        }
    }

    public final void onExitAmbient() {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("onExitAmbient must be called on the main thread.");
        com.google.android.gms.maps.MapFragment.zzb zzbVar = this.zzaz;
        if (zzbVar.getDelegate() != null) {
            zzbVar.getDelegate().onExitAmbient();
        }
    }

    public void getMapAsync(com.google.android.gms.maps.OnMapReadyCallback onMapReadyCallback) {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("getMapAsync must be called on the main thread.");
        this.zzaz.getMapAsync(onMapReadyCallback);
    }

    @Override // android.app.Fragment
    public void setArguments(android.os.Bundle bundle) {
        super.setArguments(bundle);
    }
}
