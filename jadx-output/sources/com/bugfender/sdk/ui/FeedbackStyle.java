package com.bugfender.sdk.ui;

/* JADX INFO: loaded from: classes.dex */
public class FeedbackStyle implements java.io.Serializable {
    private static final long serialVersionUID = 42;
    int appBarBackgroundColor = com.bugfender.android.R.color.feedback_appbar_background;
    int appBarTitleColor = com.bugfender.android.R.color.feedback_appbar_title;
    int appBarCloseButtonColor = com.bugfender.android.R.color.feedback_appbar_close_button;
    int appBarActionButtonColor = com.bugfender.android.R.color.feedback_appbar_action_button;
    int backgroundColor = com.bugfender.android.R.color.feedback_background;
    int textColor = com.bugfender.android.R.color.feedback_text;
    int inputBackgroundColor = com.bugfender.android.R.color.feedback_input_background;
    int inputTextColor = com.bugfender.android.R.color.feedback_input_text;
    int inputHintColor = com.bugfender.android.R.color.feedback_input_hint;

    public com.bugfender.sdk.ui.FeedbackStyle setAppBarColors(int i, int i2, int i3, int i4) {
        this.appBarBackgroundColor = i;
        this.appBarTitleColor = i2;
        this.appBarCloseButtonColor = i3;
        this.appBarActionButtonColor = i4;
        return this;
    }

    public com.bugfender.sdk.ui.FeedbackStyle setInputColors(int i, int i2, int i3) {
        this.inputBackgroundColor = i;
        this.inputTextColor = i2;
        this.inputHintColor = i3;
        return this;
    }

    public com.bugfender.sdk.ui.FeedbackStyle setScreenColors(int i, int i2) {
        this.backgroundColor = i;
        this.textColor = i2;
        return this;
    }
}
