package powerwatch.matrix.com.pwgen2android.shared.ui.notifications;

/* JADX INFO: compiled from: NotificationLoggerRecyclerAdapter.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B>\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012!\u0010\b\u001a\u001d\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e0\t¢\u0006\u0002\u0010\u000fJ\b\u0010\u0018\u001a\u00020\nH\u0016J\u0018\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\nH\u0016J\u0018\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\nH\u0016R)\u0010\b\u001a\u001d\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R0\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u001f"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/ui/notifications/NotificationLoggerRecyclerAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lpowerwatch/matrix/com/pwgen2android/shared/ui/notifications/InternalLoggerViewHolder;", "newItems", "", "Lpowerwatch/matrix/com/pwgen2android/shared/ui/notifications/NotificationLogView;", "context", "Landroid/content/Context;", "clickListener", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME, "position", "", "(Ljava/util/List;Landroid/content/Context;Lkotlin/jvm/functions/Function1;)V", "getContext", "()Landroid/content/Context;", "value", "items", "getItems", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", "getItemCount", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class NotificationLoggerRecyclerAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<powerwatch.matrix.com.pwgen2android.shared.ui.notifications.InternalLoggerViewHolder> {
    private final kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit> clickListener;
    private final android.content.Context context;
    private java.util.List<powerwatch.matrix.com.pwgen2android.shared.ui.notifications.NotificationLogView> items;

    public final android.content.Context getContext() {
        return this.context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NotificationLoggerRecyclerAdapter(java.util.List<powerwatch.matrix.com.pwgen2android.shared.ui.notifications.NotificationLogView> newItems, android.content.Context context, kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> clickListener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(newItems, "newItems");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clickListener, "clickListener");
        this.context = context;
        this.clickListener = clickListener;
        this.items = newItems;
    }

    public final java.util.List<powerwatch.matrix.com.pwgen2android.shared.ui.notifications.NotificationLogView> getItems() {
        return this.items;
    }

    public final void setItems(java.util.List<powerwatch.matrix.com.pwgen2android.shared.ui.notifications.NotificationLogView> value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
        this.items = value;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public powerwatch.matrix.com.pwgen2android.shared.ui.notifications.InternalLoggerViewHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parent, "parent");
        android.view.View viewInflate = android.view.LayoutInflater.from(this.context).inflate(powerwatch.matrix.com.pwgen2android.R.layout.internal_logger_item, parent, false);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(viewInflate, "from(context).inflate(R.layout.internal_logger_item, parent, false)");
        return new powerwatch.matrix.com.pwgen2android.shared.ui.notifications.InternalLoggerViewHolder(viewInflate, this.clickListener);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.items.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(powerwatch.matrix.com.pwgen2android.shared.ui.notifications.InternalLoggerViewHolder holder, int position) {
        int i;
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(holder, "holder");
        powerwatch.matrix.com.pwgen2android.shared.ui.notifications.NotificationLogView notificationLogView = this.items.get(position);
        if (kotlin.text.StringsKt.contains$default((java.lang.CharSequence) notificationLogView.getContent(), (java.lang.CharSequence) "Parsing notification: POSTED", false, 2, (java.lang.Object) null)) {
            i = powerwatch.matrix.com.pwgen2android.R.color.green_chart;
        } else {
            i = kotlin.text.StringsKt.contains$default((java.lang.CharSequence) notificationLogView.getContent(), (java.lang.CharSequence) "Parsing notification: DISMISSED", false, 2, (java.lang.Object) null) ? powerwatch.matrix.com.pwgen2android.R.color.red : powerwatch.matrix.com.pwgen2android.R.color.white;
        }
        powerwatch.matrix.com.pwgen2android.shared.logger.LogLevel logLevel = notificationLogView.getLogLevel();
        if (kotlin.jvm.internal.Intrinsics.areEqual(logLevel, powerwatch.matrix.com.pwgen2android.shared.logger.LogLevel.INFO.INSTANCE)) {
            i2 = powerwatch.matrix.com.pwgen2android.R.mipmap.info_icon;
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(logLevel, powerwatch.matrix.com.pwgen2android.shared.logger.LogLevel.DEBUG.INSTANCE)) {
            i2 = powerwatch.matrix.com.pwgen2android.R.mipmap.debug_icon;
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(logLevel, powerwatch.matrix.com.pwgen2android.shared.logger.LogLevel.ERROR.INSTANCE)) {
            i2 = powerwatch.matrix.com.pwgen2android.R.mipmap.icon_error;
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(logLevel, powerwatch.matrix.com.pwgen2android.shared.logger.LogLevel.WARN.INSTANCE)) {
            i2 = powerwatch.matrix.com.pwgen2android.R.mipmap.icon_warning;
        } else {
            if (!kotlin.jvm.internal.Intrinsics.areEqual(logLevel, powerwatch.matrix.com.pwgen2android.shared.logger.LogLevel.WTF.INSTANCE)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            i2 = powerwatch.matrix.com.pwgen2android.R.mipmap.icon_wtf;
        }
        holder.getLogTitle().setTextColor(androidx.core.content.ContextCompat.getColor(this.context, i));
        android.widget.TextView logTitle = holder.getLogTitle();
        if (logTitle != null) {
            logTitle.setText(notificationLogView.getTitle() + " - " + notificationLogView.getTime());
        }
        holder.getLogContent().setTextColor(androidx.core.content.ContextCompat.getColor(this.context, i));
        android.widget.TextView logContent = holder.getLogContent();
        if (logContent != null) {
            logContent.setText(notificationLogView.getContent());
        }
        holder.getLogIcon().setImageResource(i2);
    }
}
