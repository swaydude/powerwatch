package com.google.android.gms.maps;

/* JADX INFO: loaded from: classes.dex */
public class StreetViewPanoramaView extends android.widget.FrameLayout {
    private final com.google.android.gms.maps.StreetViewPanoramaView.zzb zzcd;

    public StreetViewPanoramaView(android.content.Context context) {
        super(context);
        this.zzcd = new com.google.android.gms.maps.StreetViewPanoramaView.zzb(this, context, null);
    }

    static class zza implements com.google.android.gms.maps.internal.StreetViewLifecycleDelegate {
        private final android.view.ViewGroup parent;
        private final com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate zzce;
        private android.view.View zzcf;

        public zza(android.view.ViewGroup viewGroup, com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate iStreetViewPanoramaViewDelegate) {
            this.zzce = (com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate) com.google.android.gms.common.internal.Preconditions.checkNotNull(iStreetViewPanoramaViewDelegate);
            this.parent = (android.view.ViewGroup) com.google.android.gms.common.internal.Preconditions.checkNotNull(viewGroup);
        }

        @Override // com.google.android.gms.dynamic.LifecycleDelegate
        public final void onInflate(android.app.Activity activity, android.os.Bundle bundle, android.os.Bundle bundle2) {
            throw new java.lang.UnsupportedOperationException("onInflate not allowed on StreetViewPanoramaViewDelegate");
        }

        @Override // com.google.android.gms.dynamic.LifecycleDelegate
        public final void onCreate(android.os.Bundle bundle) {
            try {
                android.os.Bundle bundle2 = new android.os.Bundle();
                com.google.android.gms.maps.internal.zzby.zza(bundle, bundle2);
                this.zzce.onCreate(bundle2);
                com.google.android.gms.maps.internal.zzby.zza(bundle2, bundle);
                this.zzcf = (android.view.View) com.google.android.gms.dynamic.ObjectWrapper.unwrap(this.zzce.getView());
                this.parent.removeAllViews();
                this.parent.addView(this.zzcf);
            } catch (android.os.RemoteException e) {
                throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
            }
        }

        @Override // com.google.android.gms.dynamic.LifecycleDelegate
        public final android.view.View onCreateView(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
            throw new java.lang.UnsupportedOperationException("onCreateView not allowed on StreetViewPanoramaViewDelegate");
        }

        @Override // com.google.android.gms.dynamic.LifecycleDelegate
        public final void onStart() {
            try {
                this.zzce.onStart();
            } catch (android.os.RemoteException e) {
                throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
            }
        }

        @Override // com.google.android.gms.dynamic.LifecycleDelegate
        public final void onResume() {
            try {
                this.zzce.onResume();
            } catch (android.os.RemoteException e) {
                throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
            }
        }

        @Override // com.google.android.gms.dynamic.LifecycleDelegate
        public final void onPause() {
            try {
                this.zzce.onPause();
            } catch (android.os.RemoteException e) {
                throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
            }
        }

        @Override // com.google.android.gms.dynamic.LifecycleDelegate
        public final void onStop() {
            try {
                this.zzce.onStop();
            } catch (android.os.RemoteException e) {
                throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
            }
        }

        @Override // com.google.android.gms.dynamic.LifecycleDelegate
        public final void onDestroyView() {
            throw new java.lang.UnsupportedOperationException("onDestroyView not allowed on StreetViewPanoramaViewDelegate");
        }

        @Override // com.google.android.gms.dynamic.LifecycleDelegate
        public final void onDestroy() {
            try {
                this.zzce.onDestroy();
            } catch (android.os.RemoteException e) {
                throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
            }
        }

        @Override // com.google.android.gms.dynamic.LifecycleDelegate
        public final void onLowMemory() {
            try {
                this.zzce.onLowMemory();
            } catch (android.os.RemoteException e) {
                throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
            }
        }

        @Override // com.google.android.gms.dynamic.LifecycleDelegate
        public final void onSaveInstanceState(android.os.Bundle bundle) {
            try {
                android.os.Bundle bundle2 = new android.os.Bundle();
                com.google.android.gms.maps.internal.zzby.zza(bundle, bundle2);
                this.zzce.onSaveInstanceState(bundle2);
                com.google.android.gms.maps.internal.zzby.zza(bundle2, bundle);
            } catch (android.os.RemoteException e) {
                throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
            }
        }

        @Override // com.google.android.gms.maps.internal.StreetViewLifecycleDelegate
        public final void getStreetViewPanoramaAsync(com.google.android.gms.maps.OnStreetViewPanoramaReadyCallback onStreetViewPanoramaReadyCallback) {
            try {
                this.zzce.getStreetViewPanoramaAsync(new com.google.android.gms.maps.zzaj(this, onStreetViewPanoramaReadyCallback));
            } catch (android.os.RemoteException e) {
                throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
            }
        }
    }

    public StreetViewPanoramaView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.zzcd = new com.google.android.gms.maps.StreetViewPanoramaView.zzb(this, context, null);
    }

    static class zzb extends com.google.android.gms.dynamic.DeferredLifecycleHelper<com.google.android.gms.maps.StreetViewPanoramaView.zza> {
        private com.google.android.gms.dynamic.OnDelegateCreatedListener<com.google.android.gms.maps.StreetViewPanoramaView.zza> zzbd;
        private final android.view.ViewGroup zzbj;
        private final android.content.Context zzbk;
        private final java.util.List<com.google.android.gms.maps.OnStreetViewPanoramaReadyCallback> zzbw = new java.util.ArrayList();
        private final com.google.android.gms.maps.StreetViewPanoramaOptions zzcg;

        zzb(android.view.ViewGroup viewGroup, android.content.Context context, com.google.android.gms.maps.StreetViewPanoramaOptions streetViewPanoramaOptions) {
            this.zzbj = viewGroup;
            this.zzbk = context;
            this.zzcg = streetViewPanoramaOptions;
        }

        @Override // com.google.android.gms.dynamic.DeferredLifecycleHelper
        protected final void createDelegate(com.google.android.gms.dynamic.OnDelegateCreatedListener<com.google.android.gms.maps.StreetViewPanoramaView.zza> onDelegateCreatedListener) {
            this.zzbd = onDelegateCreatedListener;
            if (onDelegateCreatedListener == null || getDelegate() != null) {
                return;
            }
            try {
                com.google.android.gms.maps.MapsInitializer.initialize(this.zzbk);
                this.zzbd.onDelegateCreated(new com.google.android.gms.maps.StreetViewPanoramaView.zza(this.zzbj, com.google.android.gms.maps.internal.zzbz.zza(this.zzbk).zza(com.google.android.gms.dynamic.ObjectWrapper.wrap(this.zzbk), this.zzcg)));
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

        public final void getStreetViewPanoramaAsync(com.google.android.gms.maps.OnStreetViewPanoramaReadyCallback onStreetViewPanoramaReadyCallback) {
            if (getDelegate() != null) {
                getDelegate().getStreetViewPanoramaAsync(onStreetViewPanoramaReadyCallback);
            } else {
                this.zzbw.add(onStreetViewPanoramaReadyCallback);
            }
        }
    }

    public StreetViewPanoramaView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.zzcd = new com.google.android.gms.maps.StreetViewPanoramaView.zzb(this, context, null);
    }

    public StreetViewPanoramaView(android.content.Context context, com.google.android.gms.maps.StreetViewPanoramaOptions streetViewPanoramaOptions) {
        super(context);
        this.zzcd = new com.google.android.gms.maps.StreetViewPanoramaView.zzb(this, context, streetViewPanoramaOptions);
    }

    public final void onCreate(android.os.Bundle bundle) {
        android.os.StrictMode.ThreadPolicy threadPolicy = android.os.StrictMode.getThreadPolicy();
        android.os.StrictMode.setThreadPolicy(new android.os.StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            this.zzcd.onCreate(bundle);
            if (this.zzcd.getDelegate() == null) {
                com.google.android.gms.dynamic.DeferredLifecycleHelper.showGooglePlayUnavailableMessage(this);
            }
        } finally {
            android.os.StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public void onStart() {
        this.zzcd.onStart();
    }

    public void onResume() {
        this.zzcd.onResume();
    }

    public final void onPause() {
        this.zzcd.onPause();
    }

    public void onStop() {
        this.zzcd.onStop();
    }

    public void onDestroy() {
        this.zzcd.onDestroy();
    }

    public final void onLowMemory() {
        this.zzcd.onLowMemory();
    }

    public final void onSaveInstanceState(android.os.Bundle bundle) {
        this.zzcd.onSaveInstanceState(bundle);
    }

    public void getStreetViewPanoramaAsync(com.google.android.gms.maps.OnStreetViewPanoramaReadyCallback onStreetViewPanoramaReadyCallback) {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("getStreetViewPanoramaAsync() must be called on the main thread");
        this.zzcd.getStreetViewPanoramaAsync(onStreetViewPanoramaReadyCallback);
    }
}
