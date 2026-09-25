package com.bugfender.sdk.ui;

/* JADX INFO: loaded from: classes.dex */
public class FeedbackActivity extends android.app.Activity {
    public static final int REQUEST_CODE = 2222;
    public static final java.lang.String RESULT_FEEDBACK_URL = "result.feedback.url";
    private static final java.lang.String g = "FeedbackActivity";
    private static final java.lang.String h = "extra.texts";
    private static final java.lang.String i = "extra.style";
    private android.widget.ImageView a;
    private android.widget.TextView b;
    private android.widget.TextView c;
    private android.widget.TextView d;
    private android.widget.EditText e;
    private android.widget.EditText f;

    class a implements android.view.View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View view) {
            com.bugfender.sdk.ui.FeedbackActivity.this.setResult(0);
            com.bugfender.sdk.ui.FeedbackActivity.this.finish();
        }
    }

    class b implements android.view.View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View view) {
            java.net.URL urlSendUserFeedback = com.bugfender.sdk.Bugfender.sendUserFeedback(com.bugfender.sdk.ui.FeedbackActivity.this.e.getText().toString(), com.bugfender.sdk.ui.FeedbackActivity.this.f.getText().toString());
            if (urlSendUserFeedback != null) {
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra(com.bugfender.sdk.ui.FeedbackActivity.RESULT_FEEDBACK_URL, urlSendUserFeedback.toString());
                com.bugfender.sdk.ui.FeedbackActivity.this.setResult(-1, intent);
            }
            com.bugfender.sdk.ui.FeedbackActivity.this.finish();
        }
    }

    private static class c implements java.io.Serializable {
        private static final long f = 41;
        final java.lang.String a;
        final java.lang.String b;
        final java.lang.String c;
        final java.lang.String d;
        final java.lang.String e;

        private c() {
            this.a = "Feedback";
            this.b = "Please insert your feedback here and click send";
            this.c = "Feedback subject";
            this.d = "Feedback message";
            this.e = io.fabric.sdk.android.services.settings.SettingsJsonConstants.PROMPT_SEND_BUTTON_TITLE_DEFAULT;
        }

        /* synthetic */ c(com.bugfender.sdk.ui.FeedbackActivity.a aVar) {
            this();
        }

        c(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = str5;
        }
    }

    private void a() {
        com.bugfender.sdk.ui.FeedbackStyle feedbackStyle = getIntent().hasExtra(i) ? (com.bugfender.sdk.ui.FeedbackStyle) getIntent().getSerializableExtra(i) : new com.bugfender.sdk.ui.FeedbackStyle();
        findViewById(com.bugfender.android.R.id.appbar_rl).setBackgroundResource(feedbackStyle.appBarBackgroundColor);
        this.a.setColorFilter(getResources().getColor(feedbackStyle.appBarCloseButtonColor), android.graphics.PorterDuff.Mode.SRC_ATOP);
        this.b.setTextColor(getResources().getColor(feedbackStyle.appBarTitleColor));
        this.c.setTextColor(getResources().getColor(feedbackStyle.appBarActionButtonColor));
        findViewById(com.bugfender.android.R.id.root_vg).setBackgroundResource(feedbackStyle.backgroundColor);
        this.d.setTextColor(getResources().getColor(feedbackStyle.textColor));
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.bugfender.android.R.id.bugfender_tv);
        android.graphics.drawable.Drawable drawable = getResources().getDrawable(com.bugfender.android.R.drawable.bf_bugfender_logo);
        drawable.setColorFilter(getResources().getColor(feedbackStyle.textColor), android.graphics.PorterDuff.Mode.SRC_ATOP);
        textView.setCompoundDrawablesWithIntrinsicBounds(drawable, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null);
        textView.setTextColor(getResources().getColor(feedbackStyle.textColor));
        this.e.setTextColor(getResources().getColor(feedbackStyle.inputTextColor));
        this.e.setHintTextColor(getResources().getColor(feedbackStyle.inputHintColor));
        this.e.setBackgroundResource(feedbackStyle.inputBackgroundColor);
        this.f.setTextColor(getResources().getColor(feedbackStyle.inputTextColor));
        this.f.setHintTextColor(getResources().getColor(feedbackStyle.inputHintColor));
        this.f.setBackgroundResource(feedbackStyle.inputBackgroundColor);
    }

    private void b() {
        com.bugfender.sdk.ui.FeedbackActivity.c cVar = getIntent().hasExtra(h) ? (com.bugfender.sdk.ui.FeedbackActivity.c) getIntent().getSerializableExtra(h) : new com.bugfender.sdk.ui.FeedbackActivity.c(null);
        this.b.setText(cVar.a);
        this.c.setText(cVar.e);
        this.d.setText(cVar.b);
        this.e.setHint(cVar.c);
        this.f.setHint(cVar.d);
    }

    public static android.content.Intent getIntent(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, com.bugfender.sdk.ui.FeedbackStyle feedbackStyle) {
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.bugfender.sdk.ui.FeedbackActivity.class);
        intent.putExtra(h, new com.bugfender.sdk.ui.FeedbackActivity.c(str, str2, str3, str4, str5));
        if (feedbackStyle == null) {
            feedbackStyle = new com.bugfender.sdk.ui.FeedbackStyle();
        }
        intent.putExtra(i, feedbackStyle);
        return intent;
    }

    @Override // android.app.Activity
    protected void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        try {
            setContentView(com.bugfender.android.R.layout.bf_feedback_screen);
            this.a = (android.widget.ImageView) findViewById(com.bugfender.android.R.id.close_iv);
            this.b = (android.widget.TextView) findViewById(com.bugfender.android.R.id.title_tv);
            this.c = (android.widget.TextView) findViewById(com.bugfender.android.R.id.positive_action_tv);
            this.d = (android.widget.TextView) findViewById(com.bugfender.android.R.id.message_tv);
            this.e = (android.widget.EditText) findViewById(com.bugfender.android.R.id.feedback_title_et);
            this.f = (android.widget.EditText) findViewById(com.bugfender.android.R.id.feedback_message_et);
            b();
            a();
            this.a.setOnClickListener(new com.bugfender.sdk.ui.FeedbackActivity.a());
            this.c.setOnClickListener(new com.bugfender.sdk.ui.FeedbackActivity.b());
        } catch (java.lang.RuntimeException e) {
            com.bugfender.sdk.d1.a(g, "Error inflating view. This is known to happen when performing Google Play pre-launch tests but it doesn't occur during app real usage", e);
            finish();
        }
    }
}
