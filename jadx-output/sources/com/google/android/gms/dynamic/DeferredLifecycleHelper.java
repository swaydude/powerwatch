package com.google.android.gms.dynamic;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class DeferredLifecycleHelper<T extends com.google.android.gms.dynamic.LifecycleDelegate> {
    private T zaru;
    private android.os.Bundle zarv;
    private java.util.LinkedList<com.google.android.gms.dynamic.DeferredLifecycleHelper.zaa> zarw;
    private final com.google.android.gms.dynamic.OnDelegateCreatedListener<T> zarx = new com.google.android.gms.dynamic.zaa(this);

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    interface zaa {
        int getState();

        void zaa(com.google.android.gms.dynamic.LifecycleDelegate lifecycleDelegate);
    }

    protected abstract void createDelegate(com.google.android.gms.dynamic.OnDelegateCreatedListener<T> onDelegateCreatedListener);

    public T getDelegate() {
        return this.zaru;
    }

    private final void zal(int i) {
        while (!this.zarw.isEmpty() && this.zarw.getLast().getState() >= i) {
            this.zarw.removeLast();
        }
    }

    private final void zaa(android.os.Bundle bundle, com.google.android.gms.dynamic.DeferredLifecycleHelper.zaa zaaVar) {
        T t = this.zaru;
        if (t != null) {
            zaaVar.zaa(t);
            return;
        }
        if (this.zarw == null) {
            this.zarw = new java.util.LinkedList<>();
        }
        this.zarw.add(zaaVar);
        if (bundle != null) {
            android.os.Bundle bundle2 = this.zarv;
            if (bundle2 == null) {
                this.zarv = (android.os.Bundle) bundle.clone();
            } else {
                bundle2.putAll(bundle);
            }
        }
        createDelegate(this.zarx);
    }

    public void onInflate(android.app.Activity activity, android.os.Bundle bundle, android.os.Bundle bundle2) {
        zaa(bundle2, new com.google.android.gms.dynamic.zac(this, activity, bundle, bundle2));
    }

    public void onCreate(android.os.Bundle bundle) {
        zaa(bundle, new com.google.android.gms.dynamic.zab(this, bundle));
    }

    public android.view.View onCreateView(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(layoutInflater.getContext());
        zaa(bundle, new com.google.android.gms.dynamic.zae(this, frameLayout, layoutInflater, viewGroup, bundle));
        if (this.zaru == null) {
            handleGooglePlayUnavailable(frameLayout);
        }
        return frameLayout;
    }

    protected void handleGooglePlayUnavailable(android.widget.FrameLayout frameLayout) {
        showGooglePlayUnavailableMessage(frameLayout);
    }

    public static void showGooglePlayUnavailableMessage(android.widget.FrameLayout frameLayout) {
        com.google.android.gms.common.GoogleApiAvailability googleApiAvailability = com.google.android.gms.common.GoogleApiAvailability.getInstance();
        android.content.Context context = frameLayout.getContext();
        int iIsGooglePlayServicesAvailable = googleApiAvailability.isGooglePlayServicesAvailable(context);
        java.lang.String errorMessage = com.google.android.gms.common.internal.ConnectionErrorMessages.getErrorMessage(context, iIsGooglePlayServicesAvailable);
        java.lang.String errorDialogButtonMessage = com.google.android.gms.common.internal.ConnectionErrorMessages.getErrorDialogButtonMessage(context, iIsGooglePlayServicesAvailable);
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(frameLayout.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-2, -2));
        frameLayout.addView(linearLayout);
        android.widget.TextView textView = new android.widget.TextView(frameLayout.getContext());
        textView.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-2, -2));
        textView.setText(errorMessage);
        linearLayout.addView(textView);
        android.content.Intent errorResolutionIntent = googleApiAvailability.getErrorResolutionIntent(context, iIsGooglePlayServicesAvailable, null);
        if (errorResolutionIntent != null) {
            android.widget.Button button = new android.widget.Button(context);
            button.setId(android.R.id.button1);
            button.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-2, -2));
            button.setText(errorDialogButtonMessage);
            linearLayout.addView(button);
            button.setOnClickListener(new com.google.android.gms.dynamic.zad(context, errorResolutionIntent));
        }
    }

    public void onStart() {
        zaa((android.os.Bundle) null, new com.google.android.gms.dynamic.zag(this));
    }

    public void onResume() {
        zaa((android.os.Bundle) null, new com.google.android.gms.dynamic.zaf(this));
    }

    public void onPause() {
        T t = this.zaru;
        if (t != null) {
            t.onPause();
        } else {
            zal(5);
        }
    }

    public void onStop() {
        T t = this.zaru;
        if (t != null) {
            t.onStop();
        } else {
            zal(4);
        }
    }

    public void onDestroyView() {
        T t = this.zaru;
        if (t != null) {
            t.onDestroyView();
        } else {
            zal(2);
        }
    }

    public void onDestroy() {
        T t = this.zaru;
        if (t != null) {
            t.onDestroy();
        } else {
            zal(1);
        }
    }

    public void onSaveInstanceState(android.os.Bundle bundle) {
        T t = this.zaru;
        if (t != null) {
            t.onSaveInstanceState(bundle);
            return;
        }
        android.os.Bundle bundle2 = this.zarv;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
    }

    public void onLowMemory() {
        T t = this.zaru;
        if (t != null) {
            t.onLowMemory();
        }
    }

    static /* synthetic */ android.os.Bundle zaa(com.google.android.gms.dynamic.DeferredLifecycleHelper deferredLifecycleHelper, android.os.Bundle bundle) {
        deferredLifecycleHelper.zarv = null;
        return null;
    }
}
