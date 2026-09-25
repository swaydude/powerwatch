package powerwatch.matrix.com.pwgen2android.setup.notifications.ui;

/* JADX INFO: compiled from: NotificationsRecyclerViewAdapter.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0011\u0012\u0013\u0014B\u001f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u0082\u0001\u0002\u0015\u0016¨\u0006\u0017"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/AppListItemState;", "", io.fabric.sdk.android.services.settings.SettingsJsonConstants.PROMPT_TITLE_KEY, "", "type", "Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/ItemType;", "headerIndex", "", "(Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/ItemType;I)V", "getHeaderIndex", "()I", "getTitle", "()Ljava/lang/String;", "getType", "()Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/ItemType;", "setType", "(Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/ItemType;)V", "ActionHeader", "HeaderState", "ItemState", "NonCollapsibleHeader", "Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/AppListItemState$ItemState;", "Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/AppListItemState$HeaderState;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public abstract class AppListItemState {
    private final int headerIndex;
    private final java.lang.String title;
    private powerwatch.matrix.com.pwgen2android.setup.notifications.ui.ItemType type;

    public /* synthetic */ AppListItemState(java.lang.String str, powerwatch.matrix.com.pwgen2android.setup.notifications.ui.ItemType itemType, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, itemType, i);
    }

    /* JADX INFO: compiled from: NotificationsRecyclerViewAdapter.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/AppListItemState$ItemState;", "Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/AppListItemState;", io.fabric.sdk.android.services.settings.SettingsJsonConstants.PROMPT_TITLE_KEY, "", "appInfo", "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfo;", "headerIndex", "", "(Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfo;I)V", "getAppInfo", "()Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfo;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class ItemState extends powerwatch.matrix.com.pwgen2android.setup.notifications.ui.AppListItemState {
        private final powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.AppInfo appInfo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ItemState(java.lang.String title, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.AppInfo appInfo, int i) {
            super(title, powerwatch.matrix.com.pwgen2android.setup.notifications.ui.ItemType.SimpleItem.INSTANCE, i, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "title");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appInfo, "appInfo");
            this.appInfo = appInfo;
        }

        public final powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.AppInfo getAppInfo() {
            return this.appInfo;
        }
    }

    private AppListItemState(java.lang.String str, powerwatch.matrix.com.pwgen2android.setup.notifications.ui.ItemType itemType, int i) {
        this.title = str;
        this.type = itemType;
        this.headerIndex = i;
    }

    public final int getHeaderIndex() {
        return this.headerIndex;
    }

    public final java.lang.String getTitle() {
        return this.title;
    }

    public final powerwatch.matrix.com.pwgen2android.setup.notifications.ui.ItemType getType() {
        return this.type;
    }

    public final void setType(powerwatch.matrix.com.pwgen2android.setup.notifications.ui.ItemType itemType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(itemType, "<set-?>");
        this.type = itemType;
    }

    /* JADX INFO: compiled from: NotificationsRecyclerViewAdapter.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/AppListItemState$HeaderState;", "Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/AppListItemState;", io.fabric.sdk.android.services.settings.SettingsJsonConstants.PROMPT_TITLE_KEY, "", "colapsed", "", "headerIndex", "", "(Ljava/lang/String;ZI)V", "getColapsed", "()Z", "setColapsed", "(Z)V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static class HeaderState extends powerwatch.matrix.com.pwgen2android.setup.notifications.ui.AppListItemState {
        private boolean colapsed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HeaderState(java.lang.String title, boolean z, int i) {
            super(title, powerwatch.matrix.com.pwgen2android.setup.notifications.ui.ItemType.Header.INSTANCE, i, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "title");
            this.colapsed = z;
        }

        public final boolean getColapsed() {
            return this.colapsed;
        }

        public final void setColapsed(boolean z) {
            this.colapsed = z;
        }
    }

    /* JADX INFO: compiled from: NotificationsRecyclerViewAdapter.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/AppListItemState$NonCollapsibleHeader;", "Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/AppListItemState$HeaderState;", io.fabric.sdk.android.services.settings.SettingsJsonConstants.PROMPT_TITLE_KEY, "", "headerIndex", "", "(Ljava/lang/String;I)V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class NonCollapsibleHeader extends powerwatch.matrix.com.pwgen2android.setup.notifications.ui.AppListItemState.HeaderState {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NonCollapsibleHeader(java.lang.String title, int i) {
            super(title, false, i);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "title");
            setType(powerwatch.matrix.com.pwgen2android.setup.notifications.ui.ItemType.NotCollapsibleHeader.INSTANCE);
        }
    }

    /* JADX INFO: compiled from: NotificationsRecyclerViewAdapter.kt */
    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0002\u0010\u000bR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/AppListItemState$ActionHeader;", "Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/AppListItemState$HeaderState;", io.fabric.sdk.android.services.settings.SettingsJsonConstants.PROMPT_TITLE_KEY, "", "collapsed", "", "headerIndex", "", "appInfo", "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfo;", "actionTitle", "(Ljava/lang/String;ZILpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfo;Ljava/lang/String;)V", "getActionTitle", "()Ljava/lang/String;", "getAppInfo", "()Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfo;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class ActionHeader extends powerwatch.matrix.com.pwgen2android.setup.notifications.ui.AppListItemState.HeaderState {
        private final java.lang.String actionTitle;
        private final powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.AppInfo appInfo;

        public final java.lang.String getActionTitle() {
            return this.actionTitle;
        }

        public final powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.AppInfo getAppInfo() {
            return this.appInfo;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionHeader(java.lang.String title, boolean z, int i, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.AppInfo appInfo, java.lang.String actionTitle) {
            super(title, z, i);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "title");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appInfo, "appInfo");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(actionTitle, "actionTitle");
            this.appInfo = appInfo;
            this.actionTitle = actionTitle;
            setType(powerwatch.matrix.com.pwgen2android.setup.notifications.ui.ItemType.HeaderWithAction.INSTANCE);
        }
    }
}
