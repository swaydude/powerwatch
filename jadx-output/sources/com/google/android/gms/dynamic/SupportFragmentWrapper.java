package com.google.android.gms.dynamic;

/* JADX INFO: loaded from: classes.dex */
public final class SupportFragmentWrapper extends com.google.android.gms.dynamic.IFragmentWrapper.Stub {
    private androidx.fragment.app.Fragment zzie;

    public static com.google.android.gms.dynamic.SupportFragmentWrapper wrap(androidx.fragment.app.Fragment fragment) {
        if (fragment != null) {
            return new com.google.android.gms.dynamic.SupportFragmentWrapper(fragment);
        }
        return null;
    }

    private SupportFragmentWrapper(androidx.fragment.app.Fragment fragment) {
        this.zzie = fragment;
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final com.google.android.gms.dynamic.IObjectWrapper zzae() {
        return com.google.android.gms.dynamic.ObjectWrapper.wrap(this.zzie.getActivity());
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final android.os.Bundle getArguments() {
        return this.zzie.getArguments();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final int getId() {
        return this.zzie.getId();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final com.google.android.gms.dynamic.IFragmentWrapper zzaf() {
        return wrap(this.zzie.getParentFragment());
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final com.google.android.gms.dynamic.IObjectWrapper zzag() {
        return com.google.android.gms.dynamic.ObjectWrapper.wrap(this.zzie.getResources());
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean getRetainInstance() {
        return this.zzie.getRetainInstance();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final java.lang.String getTag() {
        return this.zzie.getTag();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final com.google.android.gms.dynamic.IFragmentWrapper zzah() {
        return wrap(this.zzie.getTargetFragment());
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final int getTargetRequestCode() {
        return this.zzie.getTargetRequestCode();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean getUserVisibleHint() {
        return this.zzie.getUserVisibleHint();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final com.google.android.gms.dynamic.IObjectWrapper zzai() {
        return com.google.android.gms.dynamic.ObjectWrapper.wrap(this.zzie.getView());
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean isAdded() {
        return this.zzie.isAdded();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean isDetached() {
        return this.zzie.isDetached();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean isHidden() {
        return this.zzie.isHidden();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean isInLayout() {
        return this.zzie.isInLayout();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean isRemoving() {
        return this.zzie.isRemoving();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean isResumed() {
        return this.zzie.isResumed();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean isVisible() {
        return this.zzie.isVisible();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void zza(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) {
        this.zzie.registerForContextMenu((android.view.View) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper));
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void setHasOptionsMenu(boolean z) {
        this.zzie.setHasOptionsMenu(z);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void setMenuVisibility(boolean z) {
        this.zzie.setMenuVisibility(z);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void setRetainInstance(boolean z) {
        this.zzie.setRetainInstance(z);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void setUserVisibleHint(boolean z) {
        this.zzie.setUserVisibleHint(z);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void startActivity(android.content.Intent intent) {
        this.zzie.startActivity(intent);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void startActivityForResult(android.content.Intent intent, int i) {
        this.zzie.startActivityForResult(intent, i);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void zzb(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) {
        this.zzie.unregisterForContextMenu((android.view.View) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper));
    }
}
