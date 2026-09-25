package powerwatch.matrix.com.pwgen2android.shared.extensions;

/* JADX INFO: compiled from: ToolbarViewExtensions.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\r\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0012\u0010\u0005\u001a\u00020\u0001*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u001a\u0012\u0010\t\u001a\u00020\u0001*\u00020\u00062\u0006\u0010\n\u001a\u00020\u0004\u001a\u0012\u0010\u000b\u001a\u00020\u0001*\u00020\u00062\u0006\u0010\f\u001a\u00020\r\u001a\u0012\u0010\u000e\u001a\u00020\u0001*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u001a\u0012\u0010\u000f\u001a\u00020\u0001*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u001a\n\u0010\u0010\u001a\u00020\u0001*\u00020\u0006\u001a\u0012\u0010\u0011\u001a\u00020\u0001*\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0013\u001a\u0012\u0010\u0014\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\f\u001a\u00020\r\u001a\n\u0010\u0015\u001a\u00020\u0001*\u00020\u0006\u001a\n\u0010\u0016\u001a\u00020\u0001*\u00020\u0006\u001a\u0014\u0010\u0017\u001a\u00020\u0001*\u00020\u00062\b\b\u0002\u0010\u0018\u001a\u00020\u0013\u001a\n\u0010\u0019\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u001a\u001a\u00020\u0001*\u00020\u0006\u001a\u0012\u0010\u001b\u001a\u00020\u0001*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u001a\u0012\u0010\u001c\u001a\u00020\u0001*\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u0004\u001a\u0012\u0010\u001e\u001a\u00020\u0001*\u00020\u00062\u0006\u0010\f\u001a\u00020\r\u001a\u0012\u0010\u001f\u001a\u00020\u0001*\u00020\u00062\u0006\u0010\u001f\u001a\u00020\r¨\u0006 "}, d2 = {"backButtonBackground", "", "Lpowerwatch/matrix/com/pwgen2android/shared/ui/LoginToolbar;", "resource", "", "backButtonClickListener", "Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Landroid/view/View$OnClickListener;", "backButtonDrawable", "drawableId", "backButtonText", "text", "", "backButtonTextClickListener", "calendarClickListener", "changeBackButtonToCalendar", "displayCalendarIcon", "displayIcon", "", "enableBackButtonWithText", "hideBackButton", "hideRightButton", "removeBackButtonDrawable", "gone", "removeBackground", "resetRightButtonState", "rightButtonClickListener", "rightButtonIcon", io.fabric.sdk.android.services.settings.SettingsJsonConstants.APP_ICON_KEY, "rightButtonText", io.fabric.sdk.android.services.settings.SettingsJsonConstants.PROMPT_TITLE_KEY, "app_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
public final class ToolbarViewExtensionsKt {
    public static final void title(powerwatch.matrix.com.pwgen2android.shared.ui.MainToolbar mainToolbar, java.lang.String title) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mainToolbar, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "title");
        ((android.widget.TextView) mainToolbar.findViewById(powerwatch.matrix.com.pwgen2android.R.id.toolbar_title)).setText(title);
    }

    public static final void backButtonDrawable(powerwatch.matrix.com.pwgen2android.shared.ui.MainToolbar mainToolbar, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mainToolbar, "<this>");
        ((androidx.appcompat.widget.AppCompatImageView) mainToolbar.findViewById(powerwatch.matrix.com.pwgen2android.R.id.back_button)).setBackgroundResource(i);
    }

    public static /* synthetic */ void removeBackButtonDrawable$default(powerwatch.matrix.com.pwgen2android.shared.ui.MainToolbar mainToolbar, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        removeBackButtonDrawable(mainToolbar, z);
    }

    public static final void removeBackButtonDrawable(powerwatch.matrix.com.pwgen2android.shared.ui.MainToolbar mainToolbar, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mainToolbar, "<this>");
        androidx.appcompat.widget.AppCompatImageView appCompatImageView = (androidx.appcompat.widget.AppCompatImageView) mainToolbar.findViewById(powerwatch.matrix.com.pwgen2android.R.id.back_button);
        if (z) {
            appCompatImageView.setVisibility(8);
        } else {
            appCompatImageView.setImageDrawable(null);
        }
    }

    public static final void backButtonText(powerwatch.matrix.com.pwgen2android.shared.ui.MainToolbar mainToolbar, java.lang.String text) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mainToolbar, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(text, "text");
        ((android.widget.TextView) mainToolbar.findViewById(powerwatch.matrix.com.pwgen2android.R.id.back_button_text)).setText(text);
    }

    public static final void displayCalendarIcon(powerwatch.matrix.com.pwgen2android.shared.ui.MainToolbar mainToolbar, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mainToolbar, "<this>");
        android.widget.ImageView imageView = (android.widget.ImageView) mainToolbar.findViewById(powerwatch.matrix.com.pwgen2android.R.id.calendar_toolbar_icon);
        if (z) {
            android.content.Context context = imageView.getContext();
            kotlin.jvm.internal.Intrinsics.checkNotNull(context);
            imageView.setColorFilter(new android.graphics.PorterDuffColorFilter(androidx.core.content.ContextCompat.getColor(context, powerwatch.matrix.com.pwgen2android.R.color.red), android.graphics.PorterDuff.Mode.SRC_ATOP));
        }
        imageView.setVisibility(z ? 0 : 8);
        ((android.widget.TextView) mainToolbar.findViewById(powerwatch.matrix.com.pwgen2android.R.id.back_button_text)).setVisibility(z ? 8 : 0);
    }

    public static final void calendarClickListener(powerwatch.matrix.com.pwgen2android.shared.ui.MainToolbar mainToolbar, android.view.View.OnClickListener listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mainToolbar, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "listener");
        ((android.widget.ImageView) mainToolbar.findViewById(powerwatch.matrix.com.pwgen2android.R.id.calendar_toolbar_icon)).setOnClickListener(listener);
    }

    public static final void changeBackButtonToCalendar(powerwatch.matrix.com.pwgen2android.shared.ui.MainToolbar mainToolbar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mainToolbar, "<this>");
        android.widget.ImageView imageView = (android.widget.ImageView) mainToolbar.findViewById(powerwatch.matrix.com.pwgen2android.R.id.back_button);
        imageView.setImageResource(powerwatch.matrix.com.pwgen2android.R.mipmap.calendar_icon);
        android.content.Context context = imageView.getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNull(context);
        imageView.setColorFilter(new android.graphics.PorterDuffColorFilter(androidx.core.content.ContextCompat.getColor(context, powerwatch.matrix.com.pwgen2android.R.color.red), android.graphics.PorterDuff.Mode.SRC_ATOP));
    }

    public static final void backButtonTextClickListener(powerwatch.matrix.com.pwgen2android.shared.ui.MainToolbar mainToolbar, android.view.View.OnClickListener listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mainToolbar, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "listener");
        ((android.widget.TextView) mainToolbar.findViewById(powerwatch.matrix.com.pwgen2android.R.id.back_button_text)).setOnClickListener(listener);
    }

    public static final void rightButtonIcon(powerwatch.matrix.com.pwgen2android.shared.ui.MainToolbar mainToolbar, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mainToolbar, "<this>");
        android.widget.ImageView imageView = (android.widget.ImageView) mainToolbar.findViewById(powerwatch.matrix.com.pwgen2android.R.id.share_button);
        imageView.setImageResource(i);
        if (imageView.getVisibility() == 8) {
            imageView.setVisibility(0);
        }
        ((android.widget.TextView) mainToolbar.findViewById(powerwatch.matrix.com.pwgen2android.R.id.right_button)).setText("");
    }

    public static final void resetRightButtonState(powerwatch.matrix.com.pwgen2android.shared.ui.MainToolbar mainToolbar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mainToolbar, "<this>");
        android.widget.ImageView imageView = (android.widget.ImageView) mainToolbar.findViewById(powerwatch.matrix.com.pwgen2android.R.id.share_button);
        imageView.setImageResource(powerwatch.matrix.com.pwgen2android.R.drawable.shared_icon);
        imageView.setVisibility(8);
    }

    public static final void hideBackButton(powerwatch.matrix.com.pwgen2android.shared.ui.MainToolbar mainToolbar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mainToolbar, "<this>");
        ((android.widget.TextView) mainToolbar.findViewById(powerwatch.matrix.com.pwgen2android.R.id.back_button_text)).setVisibility(4);
        ((android.widget.ImageView) mainToolbar.findViewById(powerwatch.matrix.com.pwgen2android.R.id.back_button)).setVisibility(4);
    }

    public static final void hideRightButton(powerwatch.matrix.com.pwgen2android.shared.ui.MainToolbar mainToolbar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mainToolbar, "<this>");
        ((android.widget.TextView) mainToolbar.findViewById(powerwatch.matrix.com.pwgen2android.R.id.right_button)).setVisibility(4);
    }

    public static final void rightButtonText(powerwatch.matrix.com.pwgen2android.shared.ui.MainToolbar mainToolbar, java.lang.String text) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mainToolbar, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(text, "text");
        ((android.widget.TextView) mainToolbar.findViewById(powerwatch.matrix.com.pwgen2android.R.id.right_button)).setText(text);
    }

    public static final void backButtonClickListener(powerwatch.matrix.com.pwgen2android.shared.ui.MainToolbar mainToolbar, android.view.View.OnClickListener listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mainToolbar, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "listener");
        ((android.widget.ImageView) mainToolbar.findViewById(powerwatch.matrix.com.pwgen2android.R.id.back_button)).setOnClickListener(listener);
    }

    public static final void rightButtonClickListener(powerwatch.matrix.com.pwgen2android.shared.ui.MainToolbar mainToolbar, android.view.View.OnClickListener listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mainToolbar, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "listener");
        ((android.widget.TextView) mainToolbar.findViewById(powerwatch.matrix.com.pwgen2android.R.id.right_button)).setOnClickListener(listener);
    }

    public static final void removeBackground(powerwatch.matrix.com.pwgen2android.shared.ui.LoginToolbar loginToolbar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loginToolbar, "<this>");
        loginToolbar.setBackgroundResource(0);
    }

    public static final void backButtonBackground(powerwatch.matrix.com.pwgen2android.shared.ui.LoginToolbar loginToolbar, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loginToolbar, "<this>");
        ((android.widget.Button) loginToolbar.findViewById(powerwatch.matrix.com.pwgen2android.R.id.back_button)).setBackgroundResource(i);
    }

    public static final void enableBackButtonWithText(powerwatch.matrix.com.pwgen2android.shared.ui.LoginToolbar loginToolbar, java.lang.String text) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loginToolbar, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(text, "text");
        ((android.widget.FrameLayout) loginToolbar.findViewById(powerwatch.matrix.com.pwgen2android.R.id.back_button_container)).setVisibility(8);
        ((android.widget.FrameLayout) loginToolbar.findViewById(powerwatch.matrix.com.pwgen2android.R.id.back_button_with_text_container)).setVisibility(0);
        ((android.widget.Button) loginToolbar.findViewById(powerwatch.matrix.com.pwgen2android.R.id.back_button_with_text)).setText(text);
    }
}
