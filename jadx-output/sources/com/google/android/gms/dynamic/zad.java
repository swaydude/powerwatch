package com.google.android.gms.dynamic;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
final class zad implements android.view.View.OnClickListener {
    private final /* synthetic */ android.content.Context val$context;
    private final /* synthetic */ android.content.Intent zasa;

    zad(android.content.Context context, android.content.Intent intent) {
        this.val$context = context;
        this.zasa = intent;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        try {
            this.val$context.startActivity(this.zasa);
        } catch (android.content.ActivityNotFoundException e) {
            android.util.Log.e("DeferredLifecycleHelper", "Failed to start resolution intent", e);
        }
    }
}
