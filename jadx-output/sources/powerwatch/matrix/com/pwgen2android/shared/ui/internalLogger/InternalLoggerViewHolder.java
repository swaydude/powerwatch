package powerwatch.matrix.com.pwgen2android.shared.ui.internalLogger;

/* JADX INFO: compiled from: InternalLoggerRecyclerAdapter.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B0\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012!\u0010\u0004\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0005¢\u0006\u0002\u0010\u000bR\u0019\u0010\f\u001a\n \u000e*\u0004\u0018\u00010\r0\r¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0011\u001a\n \u000e*\u0004\u0018\u00010\u00120\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0015\u001a\n \u000e*\u0004\u0018\u00010\r0\r¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010¨\u0006\u0017"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/InternalLoggerViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "clickListener", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME, "position", "", "(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V", "logContent", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "getLogContent", "()Landroid/widget/TextView;", "logIcon", "Landroid/widget/ImageView;", "getLogIcon", "()Landroid/widget/ImageView;", "logTitle", "getLogTitle", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class InternalLoggerViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
    private final android.widget.TextView logContent;
    private final android.widget.ImageView logIcon;
    private final android.widget.TextView logTitle;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InternalLoggerViewHolder(android.view.View view, kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> clickListener) {
        super(view);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clickListener, "clickListener");
        this.logTitle = (android.widget.TextView) view.findViewById(powerwatch.matrix.com.pwgen2android.R.id.log_title);
        this.logContent = (android.widget.TextView) view.findViewById(powerwatch.matrix.com.pwgen2android.R.id.log_content);
        this.logIcon = (android.widget.ImageView) view.findViewById(powerwatch.matrix.com.pwgen2android.R.id.log_icon);
    }

    public final android.widget.TextView getLogTitle() {
        return this.logTitle;
    }

    public final android.widget.TextView getLogContent() {
        return this.logContent;
    }

    public final android.widget.ImageView getLogIcon() {
        return this.logIcon;
    }
}
