package com.google.android.play.core.missingsplits;

/* JADX INFO: loaded from: classes2.dex */
public class PlayCoreMissingSplitsActivity extends android.app.Activity implements android.content.DialogInterface.OnClickListener {
    private final java.lang.String a() {
        return getApplicationInfo().loadLabel(getPackageManager()).toString();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i) {
        if (i == -1) {
            java.lang.String packageName = getPackageName();
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(packageName).length() + 66);
            sb.append("market://details?id=");
            sb.append(packageName);
            sb.append("&referrer=utm_source%3Dplay.core.missingsplits");
            startActivity(new android.content.Intent("android.intent.action.VIEW").setData(android.net.Uri.parse(sb.toString())).setPackage("com.android.vending"));
        }
        finish();
    }

    @Override // android.app.Activity
    protected void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.app.AlertDialog.Builder neutralButton = new android.app.AlertDialog.Builder(this).setTitle("Installation failed").setCancelable(false).setNeutralButton("Close", this);
        if (com.google.android.play.core.internal.bg.a(this)) {
            java.lang.String strA = a();
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(strA).length() + 91);
            sb.append("The app ");
            sb.append(strA);
            sb.append(" is missing required components and must be reinstalled from the Google Play Store.");
            neutralButton.setMessage(sb.toString()).setPositiveButton("Reinstall", this);
        } else {
            java.lang.String strA2 = a();
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder(java.lang.String.valueOf(strA2).length() + 87);
            sb2.append("The app ");
            sb2.append(strA2);
            sb2.append(" is missing required components and must be reinstalled from an official store.");
            neutralButton.setMessage(sb2.toString());
        }
        neutralButton.create().show();
    }
}
