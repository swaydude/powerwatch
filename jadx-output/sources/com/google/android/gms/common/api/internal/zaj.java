package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zaj {
    private int zadb;
    private final androidx.collection.ArrayMap<com.google.android.gms.common.api.internal.ApiKey<?>, java.lang.String> zacz = new androidx.collection.ArrayMap<>();
    private final com.google.android.gms.tasks.TaskCompletionSource<java.util.Map<com.google.android.gms.common.api.internal.ApiKey<?>, java.lang.String>> zada = new com.google.android.gms.tasks.TaskCompletionSource<>();
    private boolean zadc = false;
    private final androidx.collection.ArrayMap<com.google.android.gms.common.api.internal.ApiKey<?>, com.google.android.gms.common.ConnectionResult> zaba = new androidx.collection.ArrayMap<>();

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
    public zaj(java.lang.Iterable<? extends com.google.android.gms.common.api.HasApiKey<?>> iterable) {
        java.util.Iterator<? extends com.google.android.gms.common.api.HasApiKey<?>> it = iterable.iterator();
        while (it.hasNext()) {
            this.zaba.put(it.next().getApiKey(), null);
        }
        this.zadb = this.zaba.keySet().size();
    }

    public final java.util.Set<com.google.android.gms.common.api.internal.ApiKey<?>> zan() {
        return this.zaba.keySet();
    }

    public final com.google.android.gms.tasks.Task<java.util.Map<com.google.android.gms.common.api.internal.ApiKey<?>, java.lang.String>> getTask() {
        return this.zada.getTask();
    }

    public final void zaa(com.google.android.gms.common.api.internal.ApiKey<?> apiKey, com.google.android.gms.common.ConnectionResult connectionResult, java.lang.String str) {
        this.zaba.put(apiKey, connectionResult);
        this.zacz.put(apiKey, str);
        this.zadb--;
        if (!connectionResult.isSuccess()) {
            this.zadc = true;
        }
        if (this.zadb == 0) {
            if (this.zadc) {
                this.zada.setException(new com.google.android.gms.common.api.AvailabilityException(this.zaba));
            } else {
                this.zada.setResult(this.zacz);
            }
        }
    }
}
