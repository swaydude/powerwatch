package powerwatch.matrix.com.pwgen2android.setup.notifications.ui;

/* JADX INFO: compiled from: NotificationsRecyclerViewAdapter.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0007\b\t\nB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0004\u000b\f\r\u000e¨\u0006\u000f"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/ItemType;", "", "type", "", "(I)V", "getType", "()I", "Header", "HeaderWithAction", "NotCollapsibleHeader", "SimpleItem", "Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/ItemType$Header;", "Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/ItemType$SimpleItem;", "Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/ItemType$HeaderWithAction;", "Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/ItemType$NotCollapsibleHeader;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public abstract class ItemType {
    private final int type;

    public /* synthetic */ ItemType(int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(i);
    }

    /* JADX INFO: compiled from: NotificationsRecyclerViewAdapter.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/ItemType$Header;", "Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/ItemType;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Header extends powerwatch.matrix.com.pwgen2android.setup.notifications.ui.ItemType {
        public static final powerwatch.matrix.com.pwgen2android.setup.notifications.ui.ItemType.Header INSTANCE = new powerwatch.matrix.com.pwgen2android.setup.notifications.ui.ItemType.Header();

        private Header() {
            super(0, null);
        }
    }

    private ItemType(int i) {
        this.type = i;
    }

    public final int getType() {
        return this.type;
    }

    /* JADX INFO: compiled from: NotificationsRecyclerViewAdapter.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/ItemType$SimpleItem;", "Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/ItemType;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class SimpleItem extends powerwatch.matrix.com.pwgen2android.setup.notifications.ui.ItemType {
        public static final powerwatch.matrix.com.pwgen2android.setup.notifications.ui.ItemType.SimpleItem INSTANCE = new powerwatch.matrix.com.pwgen2android.setup.notifications.ui.ItemType.SimpleItem();

        private SimpleItem() {
            super(1, null);
        }
    }

    /* JADX INFO: compiled from: NotificationsRecyclerViewAdapter.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/ItemType$HeaderWithAction;", "Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/ItemType;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class HeaderWithAction extends powerwatch.matrix.com.pwgen2android.setup.notifications.ui.ItemType {
        public static final powerwatch.matrix.com.pwgen2android.setup.notifications.ui.ItemType.HeaderWithAction INSTANCE = new powerwatch.matrix.com.pwgen2android.setup.notifications.ui.ItemType.HeaderWithAction();

        private HeaderWithAction() {
            super(2, null);
        }
    }

    /* JADX INFO: compiled from: NotificationsRecyclerViewAdapter.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/ItemType$NotCollapsibleHeader;", "Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/ItemType;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class NotCollapsibleHeader extends powerwatch.matrix.com.pwgen2android.setup.notifications.ui.ItemType {
        public static final powerwatch.matrix.com.pwgen2android.setup.notifications.ui.ItemType.NotCollapsibleHeader INSTANCE = new powerwatch.matrix.com.pwgen2android.setup.notifications.ui.ItemType.NotCollapsibleHeader();

        private NotCollapsibleHeader() {
            super(3, null);
        }
    }
}
