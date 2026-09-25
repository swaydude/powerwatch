package io.fabric.sdk.android.services.settings;

/* JADX INFO: loaded from: classes2.dex */
public class PromptSettingsData {
    public final java.lang.String alwaysSendButtonTitle;
    public final java.lang.String cancelButtonTitle;
    public final java.lang.String message;
    public final java.lang.String sendButtonTitle;
    public final boolean showAlwaysSendButton;
    public final boolean showCancelButton;
    public final java.lang.String title;

    public PromptSettingsData(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, java.lang.String str4, boolean z2, java.lang.String str5) {
        this.title = str;
        this.message = str2;
        this.sendButtonTitle = str3;
        this.showCancelButton = z;
        this.cancelButtonTitle = str4;
        this.showAlwaysSendButton = z2;
        this.alwaysSendButtonTitle = str5;
    }
}
