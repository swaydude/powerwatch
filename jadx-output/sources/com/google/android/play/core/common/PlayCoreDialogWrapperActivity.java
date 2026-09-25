package com.google.android.play.core.common;

/* JADX INFO: loaded from: classes2.dex */
public class PlayCoreDialogWrapperActivity extends android.app.Activity {
    private android.os.ResultReceiver a;

    @Override // android.app.Activity
    protected void onActivityResult(int i, int i2, android.content.Intent intent) {
        android.os.ResultReceiver resultReceiver;
        int i3;
        android.os.Bundle bundle;
        super.onActivityResult(i, i2, intent);
        if (i == 0 && (resultReceiver = this.a) != null) {
            if (i2 == -1) {
                i3 = 1;
                bundle = new android.os.Bundle();
            } else if (i2 == 0) {
                i3 = 2;
                bundle = new android.os.Bundle();
            }
            resultReceiver.send(i3, bundle);
        }
        finish();
    }

    @Override // android.app.Activity
    protected void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.a = (android.os.ResultReceiver) bundle.getParcelable("result_receiver");
            return;
        }
        this.a = (android.os.ResultReceiver) getIntent().getParcelableExtra("result_receiver");
        try {
            startIntentSenderForResult(((android.app.PendingIntent) getIntent().getExtras().get("confirmation_intent")).getIntentSender(), 0, null, 0, 0, 0);
        } catch (android.content.IntentSender.SendIntentException unused) {
            android.os.ResultReceiver resultReceiver = this.a;
            if (resultReceiver != null) {
                resultReceiver.send(3, new android.os.Bundle());
            }
            finish();
        }
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(android.os.Bundle bundle) {
        bundle.putParcelable("result_receiver", this.a);
    }
}
