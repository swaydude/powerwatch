package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class SignInButtonCreator extends com.google.android.gms.dynamic.RemoteCreator<com.google.android.gms.common.internal.ISignInButtonCreator> {
    private static final com.google.android.gms.common.internal.SignInButtonCreator zapt = new com.google.android.gms.common.internal.SignInButtonCreator();

    private SignInButtonCreator() {
        super("com.google.android.gms.common.ui.SignInButtonCreatorImpl");
    }

    public static android.view.View createView(android.content.Context context, int i, int i2) throws com.google.android.gms.dynamic.RemoteCreator.RemoteCreatorException {
        return zapt.zaa(context, i, i2);
    }

    private final android.view.View zaa(android.content.Context context, int i, int i2) throws com.google.android.gms.dynamic.RemoteCreator.RemoteCreatorException {
        try {
            com.google.android.gms.common.internal.SignInButtonConfig signInButtonConfig = new com.google.android.gms.common.internal.SignInButtonConfig(i, i2, null);
            return (android.view.View) com.google.android.gms.dynamic.ObjectWrapper.unwrap(getRemoteCreatorInstance(context).newSignInButtonFromConfig(com.google.android.gms.dynamic.ObjectWrapper.wrap(context), signInButtonConfig));
        } catch (java.lang.Exception e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(64);
            sb.append("Could not get button with size ");
            sb.append(i);
            sb.append(" and color ");
            sb.append(i2);
            throw new com.google.android.gms.dynamic.RemoteCreator.RemoteCreatorException(sb.toString(), e);
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.android.gms.dynamic.RemoteCreator
    public final com.google.android.gms.common.internal.ISignInButtonCreator getRemoteCreator(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ISignInButtonCreator");
        if (iInterfaceQueryLocalInterface instanceof com.google.android.gms.common.internal.ISignInButtonCreator) {
            return (com.google.android.gms.common.internal.ISignInButtonCreator) iInterfaceQueryLocalInterface;
        }
        return new com.google.android.gms.common.internal.zah(iBinder);
    }
}
