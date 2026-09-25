package powerwatch.matrix.com.pwgen2android.setup.notifications.ui;

/* JADX INFO: compiled from: NotificationsRecyclerViewAdapter.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/NotificationViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "viewType", "", "(Landroid/view/View;I)V", "appName", "Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;", "getAppName", "()Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;", "setAppName", "(Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;)V", "appToggle", "Landroidx/appcompat/widget/SwitchCompat;", "getAppToggle", "()Landroidx/appcompat/widget/SwitchCompat;", "setAppToggle", "(Landroidx/appcompat/widget/SwitchCompat;)V", "arrow", "Landroid/widget/ImageView;", "getArrow", "()Landroid/widget/ImageView;", "setArrow", "(Landroid/widget/ImageView;)V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class NotificationViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
    private powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView appName;
    public androidx.appcompat.widget.SwitchCompat appToggle;
    private android.widget.ImageView arrow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationViewHolder(android.view.View itemView, int i) {
        super(itemView);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(itemView, "itemView");
        powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView fontableTextView = (powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView) itemView.findViewById(powerwatch.matrix.com.pwgen2android.R.id.app_name);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(fontableTextView, "itemView.app_name");
        this.appName = fontableTextView;
        if (i == powerwatch.matrix.com.pwgen2android.setup.notifications.ui.ItemType.SimpleItem.INSTANCE.getType() || i == powerwatch.matrix.com.pwgen2android.setup.notifications.ui.ItemType.HeaderWithAction.INSTANCE.getType()) {
            androidx.appcompat.widget.SwitchCompat switchCompat = (androidx.appcompat.widget.SwitchCompat) itemView.findViewById(powerwatch.matrix.com.pwgen2android.R.id.app_toggle);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(switchCompat, "itemView.app_toggle");
            setAppToggle(switchCompat);
        }
        if (i == powerwatch.matrix.com.pwgen2android.setup.notifications.ui.ItemType.Header.INSTANCE.getType()) {
            this.arrow = (android.widget.ImageView) itemView.findViewById(powerwatch.matrix.com.pwgen2android.R.id.header_arrow);
        }
        if (i == powerwatch.matrix.com.pwgen2android.setup.notifications.ui.ItemType.HeaderWithAction.INSTANCE.getType()) {
            this.arrow = (android.widget.ImageView) itemView.findViewById(powerwatch.matrix.com.pwgen2android.R.id.header_arrow);
        }
    }

    public final powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView getAppName() {
        return this.appName;
    }

    public final void setAppName(powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView fontableTextView) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fontableTextView, "<set-?>");
        this.appName = fontableTextView;
    }

    public final androidx.appcompat.widget.SwitchCompat getAppToggle() {
        androidx.appcompat.widget.SwitchCompat switchCompat = this.appToggle;
        if (switchCompat != null) {
            return switchCompat;
        }
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("appToggle");
        throw null;
    }

    public final void setAppToggle(androidx.appcompat.widget.SwitchCompat switchCompat) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(switchCompat, "<set-?>");
        this.appToggle = switchCompat;
    }

    public final android.widget.ImageView getArrow() {
        return this.arrow;
    }

    public final void setArrow(android.widget.ImageView imageView) {
        this.arrow = imageView;
    }
}
