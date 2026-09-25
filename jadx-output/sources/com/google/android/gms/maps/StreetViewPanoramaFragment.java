package com.google.android.gms.maps;

/* JADX INFO: loaded from: classes.dex */
public class StreetViewPanoramaFragment extends android.app.Fragment {
    private final com.google.android.gms.maps.StreetViewPanoramaFragment.zzb zzbt = new com.google.android.gms.maps.StreetViewPanoramaFragment.zzb(this);

    public static com.google.android.gms.maps.StreetViewPanoramaFragment newInstance() {
        return new com.google.android.gms.maps.StreetViewPanoramaFragment();
    }

    public static com.google.android.gms.maps.StreetViewPanoramaFragment newInstance(com.google.android.gms.maps.StreetViewPanoramaOptions streetViewPanoramaOptions) {
        com.google.android.gms.maps.StreetViewPanoramaFragment streetViewPanoramaFragment = new com.google.android.gms.maps.StreetViewPanoramaFragment();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putParcelable("StreetViewPanoramaOptions", streetViewPanoramaOptions);
        streetViewPanoramaFragment.setArguments(bundle);
        return streetViewPanoramaFragment;
    }

    static class zza implements com.google.android.gms.maps.internal.StreetViewLifecycleDelegate {
        private final android.app.Fragment zzba;
        private final com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate zzbu;

        public zza(android.app.Fragment fragment, com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate iStreetViewPanoramaFragmentDelegate) {
            this.zzbu = (com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate) com.google.android.gms.common.internal.Preconditions.checkNotNull(iStreetViewPanoramaFragmentDelegate);
            this.zzba = (android.app.Fragment) com.google.android.gms.common.internal.Preconditions.checkNotNull(fragment);
        }

        @Override // com.google.android.gms.dynamic.LifecycleDelegate
        public final void onInflate(android.app.Activity activity, android.os.Bundle bundle, android.os.Bundle bundle2) {
            try {
                android.os.Bundle bundle3 = new android.os.Bundle();
                com.google.android.gms.maps.internal.zzby.zza(bundle2, bundle3);
                this.zzbu.onInflate(com.google.android.gms.dynamic.ObjectWrapper.wrap(activity), null, bundle3);
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
                if (arguments != null && arguments.containsKey("StreetViewPanoramaOptions")) {
                    com.google.android.gms.maps.internal.zzby.zza(bundle2, "StreetViewPanoramaOptions", arguments.getParcelable("StreetViewPanoramaOptions"));
                }
                this.zzbu.onCreate(bundle2);
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
                com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperOnCreateView = this.zzbu.onCreateView(com.google.android.gms.dynamic.ObjectWrapper.wrap(layoutInflater), com.google.android.gms.dynamic.ObjectWrapper.wrap(viewGroup), bundle2);
                com.google.android.gms.maps.internal.zzby.zza(bundle2, bundle);
                return (android.view.View) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapperOnCreateView);
            } catch (android.os.RemoteException e) {
                throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
            }
        }

        @Override // com.google.android.gms.dynamic.LifecycleDelegate
        public final void onStart() {
            try {
                this.zzbu.onStart();
            } catch (android.os.RemoteException e) {
                throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
            }
        }

        @Override // com.google.android.gms.dynamic.LifecycleDelegate
        public final void onResume() {
            try {
                this.zzbu.onResume();
            } catch (android.os.RemoteException e) {
                throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
            }
        }

        @Override // com.google.android.gms.dynamic.LifecycleDelegate
        public final void onPause() {
            try {
                this.zzbu.onPause();
            } catch (android.os.RemoteException e) {
                throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
            }
        }

        @Override // com.google.android.gms.dynamic.LifecycleDelegate
        public final void onStop() {
            try {
                this.zzbu.onStop();
            } catch (android.os.RemoteException e) {
                throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
            }
        }

        @Override // com.google.android.gms.dynamic.LifecycleDelegate
        public final void onDestroyView() {
            try {
                this.zzbu.onDestroyView();
            } catch (android.os.RemoteException e) {
                throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
            }
        }

        @Override // com.google.android.gms.dynamic.LifecycleDelegate
        public final void onDestroy() {
            try {
                this.zzbu.onDestroy();
            } catch (android.os.RemoteException e) {
                throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
            }
        }

        @Override // com.google.android.gms.dynamic.LifecycleDelegate
        public final void onLowMemory() {
            try {
                this.zzbu.onLowMemory();
            } catch (android.os.RemoteException e) {
                throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
            }
        }

        @Override // com.google.android.gms.dynamic.LifecycleDelegate
        public final void onSaveInstanceState(android.os.Bundle bundle) {
            try {
                android.os.Bundle bundle2 = new android.os.Bundle();
                com.google.android.gms.maps.internal.zzby.zza(bundle, bundle2);
                this.zzbu.onSaveInstanceState(bundle2);
                com.google.android.gms.maps.internal.zzby.zza(bundle2, bundle);
            } catch (android.os.RemoteException e) {
                throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
            }
        }

        @Override // com.google.android.gms.maps.internal.StreetViewLifecycleDelegate
        public final void getStreetViewPanoramaAsync(com.google.android.gms.maps.OnStreetViewPanoramaReadyCallback onStreetViewPanoramaReadyCallback) {
            try {
                this.zzbu.getStreetViewPanoramaAsync(new com.google.android.gms.maps.zzah(this, onStreetViewPanoramaReadyCallback));
            } catch (android.os.RemoteException e) {
                throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
            }
        }
    }

    static class zzb extends com.google.android.gms.dynamic.DeferredLifecycleHelper<com.google.android.gms.maps.StreetViewPanoramaFragment.zza> {
        private final android.app.Fragment zzba;
        private com.google.android.gms.dynamic.OnDelegateCreatedListener<com.google.android.gms.maps.StreetViewPanoramaFragment.zza> zzbd;
        private android.app.Activity zzbe;
        private final java.util.List<com.google.android.gms.maps.OnStreetViewPanoramaReadyCallback> zzbw = new java.util.ArrayList();

        zzb(android.app.Fragment fragment) {
            this.zzba = fragment;
        }

        @Override // com.google.android.gms.dynamic.DeferredLifecycleHelper
        protected final void createDelegate(com.google.android.gms.dynamic.OnDelegateCreatedListener<com.google.android.gms.maps.StreetViewPanoramaFragment.zza> onDelegateCreatedListener) {
            this.zzbd = onDelegateCreatedListener;
            zzd();
        }

        private final void zzd() {
            if (this.zzbe == null || this.zzbd == null || getDelegate() != null) {
                return;
            }
            try {
                com.google.android.gms.maps.MapsInitializer.initialize(this.zzbe);
                this.zzbd.onDelegateCreated(new com.google.android.gms.maps.StreetViewPanoramaFragment.zza(this.zzba, com.google.android.gms.maps.internal.zzbz.zza(this.zzbe).zzd(com.google.android.gms.dynamic.ObjectWrapper.wrap(this.zzbe))));
                java.util.Iterator<com.google.android.gms.maps.OnStreetViewPanoramaReadyCallback> it = this.zzbw.iterator();
                while (it.hasNext()) {
                    getDelegate().getStreetViewPanoramaAsync(it.next());
                }
                this.zzbw.clear();
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

        public final void getStreetViewPanoramaAsync(com.google.android.gms.maps.OnStreetViewPanoramaReadyCallback onStreetViewPanoramaReadyCallback) {
            if (getDelegate() != null) {
                getDelegate().getStreetViewPanoramaAsync(onStreetViewPanoramaReadyCallback);
            } else {
                this.zzbw.add(onStreetViewPanoramaReadyCallback);
            }
        }
    }

    @Override // android.app.Fragment
    public void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        this.zzbt.setActivity(activity);
    }

    @Override // android.app.Fragment
    public void onInflate(android.app.Activity activity, android.util.AttributeSet attributeSet, android.os.Bundle bundle) {
        android.os.StrictMode.ThreadPolicy threadPolicy = android.os.StrictMode.getThreadPolicy();
        android.os.StrictMode.setThreadPolicy(new android.os.StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            super.onInflate(activity, attributeSet, bundle);
            this.zzbt.setActivity(activity);
            this.zzbt.onInflate(activity, new android.os.Bundle(), bundle);
        } finally {
            android.os.StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    @Override // android.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.zzbt.onCreate(bundle);
    }

    @Override // android.app.Fragment
    public android.view.View onCreateView(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        return this.zzbt.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        this.zzbt.onStart();
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        this.zzbt.onResume();
    }

    @Override // android.app.Fragment
    public void onPause() {
        this.zzbt.onPause();
        super.onPause();
    }

    @Override // android.app.Fragment
    public void onStop() {
        this.zzbt.onStop();
        super.onStop();
    }

    @Override // android.app.Fragment
    public void onDestroyView() {
        this.zzbt.onDestroyView();
        super.onDestroyView();
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        this.zzbt.onDestroy();
        super.onDestroy();
    }

    @Override // android.app.Fragment, android.content.ComponentCallbacks
    public void onLowMemory() {
        this.zzbt.onLowMemory();
        super.onLowMemory();
    }

    @Override // android.app.Fragment
    public void onActivityCreated(android.os.Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(com.google.android.gms.maps.StreetViewPanoramaFragment.class.getClassLoader());
        }
        super.onActivityCreated(bundle);
    }

    @Override // android.app.Fragment
    public void onSaveInstanceState(android.os.Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(com.google.android.gms.maps.StreetViewPanoramaFragment.class.getClassLoader());
        }
        super.onSaveInstanceState(bundle);
        this.zzbt.onSaveInstanceState(bundle);
    }

    @Override // android.app.Fragment
    public void setArguments(android.os.Bundle bundle) {
        super.setArguments(bundle);
    }

    public void getStreetViewPanoramaAsync(com.google.android.gms.maps.OnStreetViewPanoramaReadyCallback onStreetViewPanoramaReadyCallback) {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("getStreetViewPanoramaAsync() must be called on the main thread");
        this.zzbt.getStreetViewPanoramaAsync(onStreetViewPanoramaReadyCallback);
    }
}
