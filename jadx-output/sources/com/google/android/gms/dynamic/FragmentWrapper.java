package com.google.android.gms.dynamic;

/* JADX INFO: loaded from: classes.dex */
public final class FragmentWrapper extends com.google.android.gms.dynamic.IFragmentWrapper.Stub {
    private android.app.Fragment zzia;

    public static com.google.android.gms.dynamic.FragmentWrapper wrap(android.app.Fragment fragment) {
        if (fragment != null) {
            return new com.google.android.gms.dynamic.FragmentWrapper(fragment);
        }
        return null;
    }

    private FragmentWrapper(android.app.Fragment fragment) {
        this.zzia = fragment;
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final com.google.android.gms.dynamic.IObjectWrapper zzae() {
        return com.google.android.gms.dynamic.ObjectWrapper.wrap(this.zzia.getActivity());
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final android.os.Bundle getArguments() {
        return this.zzia.getArguments();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final int getId() {
        return this.zzia.getId();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final com.google.android.gms.dynamic.IFragmentWrapper zzaf() {
        return wrap(this.zzia.getParentFragment());
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final com.google.android.gms.dynamic.IObjectWrapper zzag() {
        return com.google.android.gms.dynamic.ObjectWrapper.wrap(this.zzia.getResources());
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean getRetainInstance() {
        return this.zzia.getRetainInstance();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final java.lang.String getTag() {
        return this.zzia.getTag();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final com.google.android.gms.dynamic.IFragmentWrapper zzah() {
        return wrap(this.zzia.getTargetFragment());
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final int getTargetRequestCode() {
        return this.zzia.getTargetRequestCode();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean getUserVisibleHint() {
        return this.zzia.getUserVisibleHint();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final com.google.android.gms.dynamic.IObjectWrapper zzai() {
        return com.google.android.gms.dynamic.ObjectWrapper.wrap(this.zzia.getView());
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean isAdded() {
        return this.zzia.isAdded();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean isDetached() {
        return this.zzia.isDetached();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean isHidden() {
        return this.zzia.isHidden();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean isInLayout() {
        return this.zzia.isInLayout();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean isRemoving() {
        return this.zzia.isRemoving();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean isResumed() {
        return this.zzia.isResumed();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean isVisible() {
        return this.zzia.isVisible();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void zza(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) {
        this.zzia.registerForContextMenu((android.view.View) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper));
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void setHasOptionsMenu(boolean z) {
        this.zzia.setHasOptionsMenu(z);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void setMenuVisibility(boolean z) {
        this.zzia.setMenuVisibility(z);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void setRetainInstance(boolean z) {
        this.zzia.setRetainInstance(z);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void setUserVisibleHint(boolean z) {
        this.zzia.setUserVisibleHint(z);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void startActivity(android.content.Intent intent) {
        this.zzia.startActivity(intent);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void startActivityForResult(android.content.Intent intent, int i) {
        this.zzia.startActivityForResult(intent, i);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void zzb(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) {
        this.zzia.unregisterForContextMenu((android.view.View) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper));
    }
}
