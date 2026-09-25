package com.crashlytics.android.core;

/* JADX INFO: loaded from: classes.dex */
class CrashPromptDialog {
    private final android.app.AlertDialog.Builder dialog;
    private final com.crashlytics.android.core.CrashPromptDialog.OptInLatch latch;

    interface AlwaysSendCallback {
        void sendUserReportsWithoutPrompting(boolean z);
    }

    private static int dipsToPixels(float f, int i) {
        return (int) (f * i);
    }

    private static class OptInLatch {
        private final java.util.concurrent.CountDownLatch latch;
        private boolean send;

        private OptInLatch() {
            this.send = false;
            this.latch = new java.util.concurrent.CountDownLatch(1);
        }

        void setOptIn(boolean z) {
            this.send = z;
            this.latch.countDown();
        }

        boolean getOptIn() {
            return this.send;
        }

        void await() {
            try {
                this.latch.await();
            } catch (java.lang.InterruptedException unused) {
            }
        }
    }

    public static com.crashlytics.android.core.CrashPromptDialog create(android.app.Activity activity, io.fabric.sdk.android.services.settings.PromptSettingsData promptSettingsData, final com.crashlytics.android.core.CrashPromptDialog.AlwaysSendCallback alwaysSendCallback) {
        final com.crashlytics.android.core.CrashPromptDialog.OptInLatch optInLatch = new com.crashlytics.android.core.CrashPromptDialog.OptInLatch();
        com.crashlytics.android.core.DialogStringResolver dialogStringResolver = new com.crashlytics.android.core.DialogStringResolver(activity, promptSettingsData);
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(activity);
        android.widget.ScrollView scrollViewCreateDialogView = createDialogView(activity, dialogStringResolver.getMessage());
        builder.setView(scrollViewCreateDialogView).setTitle(dialogStringResolver.getTitle()).setCancelable(false).setNeutralButton(dialogStringResolver.getSendButtonTitle(), new android.content.DialogInterface.OnClickListener() { // from class: com.crashlytics.android.core.CrashPromptDialog.1
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(android.content.DialogInterface dialogInterface, int i) {
                optInLatch.setOptIn(true);
                dialogInterface.dismiss();
            }
        });
        if (promptSettingsData.showCancelButton) {
            builder.setNegativeButton(dialogStringResolver.getCancelButtonTitle(), new android.content.DialogInterface.OnClickListener() { // from class: com.crashlytics.android.core.CrashPromptDialog.2
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(android.content.DialogInterface dialogInterface, int i) {
                    optInLatch.setOptIn(false);
                    dialogInterface.dismiss();
                }
            });
        }
        if (promptSettingsData.showAlwaysSendButton) {
            builder.setPositiveButton(dialogStringResolver.getAlwaysSendButtonTitle(), new android.content.DialogInterface.OnClickListener() { // from class: com.crashlytics.android.core.CrashPromptDialog.3
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(android.content.DialogInterface dialogInterface, int i) {
                    alwaysSendCallback.sendUserReportsWithoutPrompting(true);
                    optInLatch.setOptIn(true);
                    dialogInterface.dismiss();
                }
            });
        }
        return new com.crashlytics.android.core.CrashPromptDialog(builder, optInLatch);
    }

    private static android.widget.ScrollView createDialogView(android.app.Activity activity, java.lang.String str) {
        float f = activity.getResources().getDisplayMetrics().density;
        int iDipsToPixels = dipsToPixels(f, 5);
        android.widget.TextView textView = new android.widget.TextView(activity);
        textView.setAutoLinkMask(15);
        textView.setText(str);
        textView.setTextAppearance(activity, android.R.style.TextAppearance.Medium);
        textView.setPadding(iDipsToPixels, iDipsToPixels, iDipsToPixels, iDipsToPixels);
        textView.setFocusable(false);
        android.widget.ScrollView scrollView = new android.widget.ScrollView(activity);
        scrollView.setPadding(dipsToPixels(f, 14), dipsToPixels(f, 2), dipsToPixels(f, 10), dipsToPixels(f, 12));
        scrollView.addView(textView);
        return scrollView;
    }

    private CrashPromptDialog(android.app.AlertDialog.Builder builder, com.crashlytics.android.core.CrashPromptDialog.OptInLatch optInLatch) {
        this.latch = optInLatch;
        this.dialog = builder;
    }

    public void show() {
        this.dialog.show();
    }

    public void await() {
        this.latch.await();
    }

    public boolean getOptIn() {
        return this.latch.getOptIn();
    }
}
