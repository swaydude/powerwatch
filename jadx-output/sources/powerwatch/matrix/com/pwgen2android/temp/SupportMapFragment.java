package powerwatch.matrix.com.pwgen2android.temp;

/* JADX INFO: loaded from: classes3.dex */
public class SupportMapFragment extends androidx.fragment.app.Fragment {
    private final powerwatch.matrix.com.pwgen2android.temp.SupportMapFragment.zzb zzcg = new powerwatch.matrix.com.pwgen2android.temp.SupportMapFragment.zzb(this);

    public static powerwatch.matrix.com.pwgen2android.temp.SupportMapFragment newInstance() {
        return new powerwatch.matrix.com.pwgen2android.temp.SupportMapFragment();
    }

    public static powerwatch.matrix.com.pwgen2android.temp.SupportMapFragment newInstance(com.google.android.gms.maps.GoogleMapOptions var0) {
        powerwatch.matrix.com.pwgen2android.temp.SupportMapFragment supportMapFragment = new powerwatch.matrix.com.pwgen2android.temp.SupportMapFragment();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putParcelable("MapOptions", var0);
        supportMapFragment.setArguments(bundle);
        return supportMapFragment;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.app.Activity var1) {
        super.onAttach(var1);
        this.zzcg.setActivity(var1);
    }

    @Override // androidx.fragment.app.Fragment
    public void onInflate(android.app.Activity var1, android.util.AttributeSet var2, android.os.Bundle var3) {
        android.os.StrictMode.ThreadPolicy threadPolicy = android.os.StrictMode.getThreadPolicy();
        android.os.StrictMode.setThreadPolicy(new android.os.StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            super.onInflate(var1, var2, var3);
            this.zzcg.setActivity(var1);
            com.google.android.gms.maps.GoogleMapOptions googleMapOptionsCreateFromAttributes = com.google.android.gms.maps.GoogleMapOptions.createFromAttributes(var1, var2);
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("MapOptions", googleMapOptionsCreateFromAttributes);
            this.zzcg.onInflate(var1, bundle, var3);
        } finally {
            android.os.StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle var1) {
        super.onCreate(var1);
        this.zzcg.onCreate(var1);
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(android.view.LayoutInflater var1, android.view.ViewGroup var2, android.os.Bundle var3) {
        android.view.View viewOnCreateView = this.zzcg.onCreateView(var1, var2, var3);
        viewOnCreateView.setClickable(true);
        return viewOnCreateView;
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.zzcg.onResume();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        this.zzcg.onPause();
        super.onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        this.zzcg.onStart();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        this.zzcg.onStop();
        super.onStop();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.zzcg.onDestroyView();
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        this.zzcg.onDestroy();
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onLowMemory() {
        this.zzcg.onLowMemory();
        super.onLowMemory();
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(android.os.Bundle var1) {
        if (var1 != null) {
            var1.setClassLoader(powerwatch.matrix.com.pwgen2android.temp.SupportMapFragment.class.getClassLoader());
        }
        super.onActivityCreated(var1);
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(android.os.Bundle var1) {
        if (var1 != null) {
            var1.setClassLoader(powerwatch.matrix.com.pwgen2android.temp.SupportMapFragment.class.getClassLoader());
        }
        super.onSaveInstanceState(var1);
        this.zzcg.onSaveInstanceState(var1);
    }

    public final void onEnterAmbient(android.os.Bundle var1) {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("onEnterAmbient must be called on the main thread.");
        powerwatch.matrix.com.pwgen2android.temp.SupportMapFragment.zzb zzbVar = this.zzcg;
        if (zzbVar.getDelegate() != null) {
            zzbVar.getDelegate().onEnterAmbient(var1);
        }
    }

    public final void onExitAmbient() {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("onExitAmbient must be called on the main thread.");
        powerwatch.matrix.com.pwgen2android.temp.SupportMapFragment.zzb zzbVar = this.zzcg;
        if (zzbVar.getDelegate() != null) {
            zzbVar.getDelegate().onExitAmbient();
        }
    }

    public void getMapAsync(com.google.android.gms.maps.OnMapReadyCallback var1) {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("getMapAsync must be called on the main thread.");
        this.zzcg.getMapAsync(var1);
    }

    @Override // androidx.fragment.app.Fragment
    public void setArguments(android.os.Bundle var1) {
        super.setArguments(var1);
    }

    static class zzb extends com.google.android.gms.dynamic.DeferredLifecycleHelper<powerwatch.matrix.com.pwgen2android.temp.SupportMapFragment.zza> {
        private final androidx.fragment.app.Fragment fragment;
        private com.google.android.gms.dynamic.OnDelegateCreatedListener<powerwatch.matrix.com.pwgen2android.temp.SupportMapFragment.zza> zzbc;
        private android.app.Activity zzbd;
        private final java.util.List<com.google.android.gms.maps.OnMapReadyCallback> zzbe = new java.util.ArrayList();

        zzb(androidx.fragment.app.Fragment var1) {
            this.fragment = var1;
        }

        @Override // com.google.android.gms.dynamic.DeferredLifecycleHelper
        protected final void createDelegate(com.google.android.gms.dynamic.OnDelegateCreatedListener<powerwatch.matrix.com.pwgen2android.temp.SupportMapFragment.zza> var1) {
            this.zzbc = var1;
            zzc();
        }

        private final void zzc() {
            if (this.zzbd == null || this.zzbc == null || getDelegate() != null) {
                return;
            }
            try {
                com.google.android.gms.maps.MapsInitializer.initialize(this.zzbd);
                com.google.android.gms.maps.internal.IMapFragmentDelegate iMapFragmentDelegateZzc = com.google.android.gms.maps.internal.zzbz.zza(this.zzbd).zzc(com.google.android.gms.dynamic.ObjectWrapper.wrap(this.zzbd));
                if (iMapFragmentDelegateZzc == null) {
                    return;
                }
                this.zzbc.onDelegateCreated(new powerwatch.matrix.com.pwgen2android.temp.SupportMapFragment.zza(this.fragment, iMapFragmentDelegateZzc));
                java.util.Iterator<com.google.android.gms.maps.OnMapReadyCallback> it = this.zzbe.iterator();
                while (it.hasNext()) {
                    getDelegate().getMapAsync(it.next());
                }
                this.zzbe.clear();
            } catch (android.os.RemoteException e) {
                throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
            } catch (com.google.android.gms.common.GooglePlayServicesNotAvailableException unused) {
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void setActivity(android.app.Activity var1) {
            this.zzbd = var1;
            zzc();
        }

        public final void getMapAsync(com.google.android.gms.maps.OnMapReadyCallback var1) {
            if (getDelegate() != null) {
                getDelegate().getMapAsync(var1);
            } else {
                this.zzbe.add(var1);
            }
        }
    }

    static class zza implements com.google.android.gms.maps.internal.MapLifecycleDelegate {
        private final androidx.fragment.app.Fragment fragment;
        private final com.google.android.gms.maps.internal.IMapFragmentDelegate zzba;

        public zza(androidx.fragment.app.Fragment var1, com.google.android.gms.maps.internal.IMapFragmentDelegate var2) {
            this.zzba = (com.google.android.gms.maps.internal.IMapFragmentDelegate) com.google.android.gms.common.internal.Preconditions.checkNotNull(var2);
            this.fragment = (androidx.fragment.app.Fragment) com.google.android.gms.common.internal.Preconditions.checkNotNull(var1);
        }

        @Override // com.google.android.gms.dynamic.LifecycleDelegate
        public final void onInflate(android.app.Activity var1, android.os.Bundle var2, android.os.Bundle var3) {
            com.google.android.gms.maps.GoogleMapOptions googleMapOptions = (com.google.android.gms.maps.GoogleMapOptions) var2.getParcelable("MapOptions");
            try {
                android.os.Bundle bundle = new android.os.Bundle();
                com.google.android.gms.maps.internal.zzby.zza(var3, bundle);
                this.zzba.onInflate(com.google.android.gms.dynamic.ObjectWrapper.wrap(var1), googleMapOptions, bundle);
                com.google.android.gms.maps.internal.zzby.zza(bundle, var3);
            } catch (android.os.RemoteException e) {
                throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
            }
        }

        @Override // com.google.android.gms.dynamic.LifecycleDelegate
        public final void onCreate(android.os.Bundle var1) {
            try {
                android.os.Bundle bundle = new android.os.Bundle();
                com.google.android.gms.maps.internal.zzby.zza(var1, bundle);
                android.os.Bundle arguments = this.fragment.getArguments();
                if (arguments != null && arguments.containsKey("MapOptions")) {
                    com.google.android.gms.maps.internal.zzby.zza(bundle, "MapOptions", arguments.getParcelable("MapOptions"));
                }
                this.zzba.onCreate(bundle);
                com.google.android.gms.maps.internal.zzby.zza(bundle, var1);
            } catch (android.os.RemoteException e) {
                throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
            }
        }

        @Override // com.google.android.gms.dynamic.LifecycleDelegate
        public final android.view.View onCreateView(android.view.LayoutInflater var1, android.view.ViewGroup var2, android.os.Bundle var3) {
            try {
                android.os.Bundle bundle = new android.os.Bundle();
                com.google.android.gms.maps.internal.zzby.zza(var3, bundle);
                com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperOnCreateView = this.zzba.onCreateView(com.google.android.gms.dynamic.ObjectWrapper.wrap(var1), com.google.android.gms.dynamic.ObjectWrapper.wrap(var2), bundle);
                com.google.android.gms.maps.internal.zzby.zza(bundle, var3);
                return (android.view.View) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapperOnCreateView);
            } catch (android.os.RemoteException e) {
                throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
            }
        }

        @Override // com.google.android.gms.dynamic.LifecycleDelegate
        public final void onStart() {
            try {
                this.zzba.onStart();
            } catch (android.os.RemoteException e) {
                throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
            }
        }

        @Override // com.google.android.gms.dynamic.LifecycleDelegate
        public final void onResume() {
            try {
                this.zzba.onResume();
            } catch (android.os.RemoteException e) {
                throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
            }
        }

        @Override // com.google.android.gms.dynamic.LifecycleDelegate
        public final void onPause() {
            try {
                this.zzba.onPause();
            } catch (android.os.RemoteException e) {
                throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
            }
        }

        @Override // com.google.android.gms.dynamic.LifecycleDelegate
        public final void onStop() {
            try {
                this.zzba.onStop();
            } catch (android.os.RemoteException e) {
                throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
            }
        }

        @Override // com.google.android.gms.dynamic.LifecycleDelegate
        public final void onDestroyView() {
            try {
                this.zzba.onDestroyView();
            } catch (android.os.RemoteException e) {
                throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
            }
        }

        @Override // com.google.android.gms.dynamic.LifecycleDelegate
        public final void onDestroy() {
            try {
                this.zzba.onDestroy();
            } catch (android.os.RemoteException e) {
                throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
            }
        }

        @Override // com.google.android.gms.dynamic.LifecycleDelegate
        public final void onLowMemory() {
            try {
                this.zzba.onLowMemory();
            } catch (android.os.RemoteException e) {
                throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
            }
        }

        @Override // com.google.android.gms.dynamic.LifecycleDelegate
        public final void onSaveInstanceState(android.os.Bundle var1) {
            try {
                android.os.Bundle bundle = new android.os.Bundle();
                com.google.android.gms.maps.internal.zzby.zza(var1, bundle);
                this.zzba.onSaveInstanceState(bundle);
                com.google.android.gms.maps.internal.zzby.zza(bundle, var1);
            } catch (android.os.RemoteException e) {
                throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
            }
        }

        @Override // com.google.android.gms.maps.internal.MapLifecycleDelegate
        public final void getMapAsync(com.google.android.gms.maps.OnMapReadyCallback var1) {
            try {
                this.zzba.getMapAsync(new powerwatch.matrix.com.pwgen2android.temp.SupportMapCallback(this, var1));
            } catch (android.os.RemoteException e) {
                throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
            }
        }

        public final void onEnterAmbient(android.os.Bundle var1) {
            try {
                android.os.Bundle bundle = new android.os.Bundle();
                com.google.android.gms.maps.internal.zzby.zza(var1, bundle);
                this.zzba.onEnterAmbient(bundle);
                com.google.android.gms.maps.internal.zzby.zza(bundle, var1);
            } catch (android.os.RemoteException e) {
                throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
            }
        }

        public final void onExitAmbient() {
            try {
                this.zzba.onExitAmbient();
            } catch (android.os.RemoteException e) {
                throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
            }
        }
    }
}
