package com.google.android.gms.common.api;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public class GoogleApiActivity extends android.app.Activity implements android.content.DialogInterface.OnCancelListener {
    private int zabr = 0;

    public static android.app.PendingIntent zaa(android.content.Context context, android.app.PendingIntent pendingIntent, int i) {
        return android.app.PendingIntent.getActivity(context, 0, zaa(context, pendingIntent, i, true), 134217728);
    }

    public static android.content.Intent zaa(android.content.Context context, android.app.PendingIntent pendingIntent, int i, boolean z) {
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.google.android.gms.common.api.GoogleApiActivity.class);
        intent.putExtra("pending_intent", pendingIntent);
        intent.putExtra("failing_client_id", i);
        intent.putExtra("notify_manager", z);
        return intent;
    }

    @Override // android.app.Activity
    protected void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.zabr = bundle.getInt("resolution");
        }
        if (this.zabr != 1) {
            android.os.Bundle extras = getIntent().getExtras();
            if (extras == null) {
                android.util.Log.e("GoogleApiActivity", "Activity started without extras");
                finish();
                return;
            }
            android.app.PendingIntent pendingIntent = (android.app.PendingIntent) extras.get("pending_intent");
            java.lang.Integer num = (java.lang.Integer) extras.get(com.baidu.mapapi.SDKInitializer.SDK_BROADTCAST_INTENT_EXTRA_INFO_KEY_ERROR_CODE);
            if (pendingIntent == null && num == null) {
                android.util.Log.e("GoogleApiActivity", "Activity started without resolution");
                finish();
            } else {
                if (pendingIntent != null) {
                    try {
                        startIntentSenderForResult(pendingIntent.getIntentSender(), 1, null, 0, 0, 0);
                        this.zabr = 1;
                        return;
                    } catch (android.content.IntentSender.SendIntentException e) {
                        android.util.Log.e("GoogleApiActivity", "Failed to launch pendingIntent", e);
                        finish();
                        return;
                    }
                }
                com.google.android.gms.common.GoogleApiAvailability.getInstance().showErrorDialogFragment(this, num.intValue(), 2, this);
                this.zabr = 1;
            }
        }
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i, int i2, android.content.Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.zabr = 0;
            setResult(i2, intent);
            if (booleanExtra) {
                com.google.android.gms.common.api.internal.GoogleApiManager googleApiManagerZab = com.google.android.gms.common.api.internal.GoogleApiManager.zab(this);
                if (i2 == -1) {
                    googleApiManagerZab.zam();
                } else if (i2 == 0) {
                    googleApiManagerZab.zaa(new com.google.android.gms.common.ConnectionResult(13, null), getIntent().getIntExtra("failing_client_id", -1));
                }
            }
        } else if (i == 2) {
            this.zabr = 0;
            setResult(i2, intent);
        }
        finish();
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(android.os.Bundle bundle) {
        bundle.putInt("resolution", this.zabr);
        super.onSaveInstanceState(bundle);
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        this.zabr = 0;
        setResult(0);
        finish();
    }
}
