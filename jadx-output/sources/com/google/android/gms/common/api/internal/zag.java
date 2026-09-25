package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zag extends com.google.android.gms.common.api.internal.zae<java.lang.Void> {
    private final com.google.android.gms.common.api.internal.RegisterListenerMethod<com.google.android.gms.common.api.Api.AnyClient, ?> zact;
    private final com.google.android.gms.common.api.internal.UnregisterListenerMethod<com.google.android.gms.common.api.Api.AnyClient, ?> zacu;

    public zag(com.google.android.gms.common.api.internal.zabv zabvVar, com.google.android.gms.tasks.TaskCompletionSource<java.lang.Void> taskCompletionSource) {
        super(3, taskCompletionSource);
        this.zact = zabvVar.zakc;
        this.zacu = zabvVar.zakd;
    }

    @Override // com.google.android.gms.common.api.internal.zae, com.google.android.gms.common.api.internal.zac
    public final /* bridge */ /* synthetic */ void zaa(com.google.android.gms.common.api.internal.zaz zazVar, boolean z) {
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.gms.common.api.internal.zae
    public final void zad(com.google.android.gms.common.api.internal.GoogleApiManager.zaa<?> zaaVar) throws android.os.RemoteException {
        this.zact.registerListener(zaaVar.zaad(), this.zacq);
        if (this.zact.getListenerKey() != null) {
            zaaVar.zabi().put(this.zact.getListenerKey(), new com.google.android.gms.common.api.internal.zabv(this.zact, this.zacu));
        }
    }

    @Override // com.google.android.gms.common.api.internal.zab
    public final com.google.android.gms.common.Feature[] zaa(com.google.android.gms.common.api.internal.GoogleApiManager.zaa<?> zaaVar) {
        return this.zact.getRequiredFeatures();
    }

    @Override // com.google.android.gms.common.api.internal.zab
    public final boolean zab(com.google.android.gms.common.api.internal.GoogleApiManager.zaa<?> zaaVar) {
        return this.zact.shouldAutoResolveMissingFeatures();
    }

    @Override // com.google.android.gms.common.api.internal.zae, com.google.android.gms.common.api.internal.zac
    public final /* bridge */ /* synthetic */ void zaa(java.lang.RuntimeException runtimeException) {
        super.zaa(runtimeException);
    }

    @Override // com.google.android.gms.common.api.internal.zae, com.google.android.gms.common.api.internal.zac
    public final /* bridge */ /* synthetic */ void zaa(com.google.android.gms.common.api.Status status) {
        super.zaa(status);
    }
}
