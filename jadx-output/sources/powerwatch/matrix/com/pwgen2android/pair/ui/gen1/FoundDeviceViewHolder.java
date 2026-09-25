package powerwatch.matrix.com.pwgen2android.pair.ui.gen1;

/* JADX INFO: compiled from: FoundDevicesRecyclerAdapter.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B0\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012!\u0010\u0004\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0005¢\u0006\u0002\u0010\u000bR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/FoundDeviceViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "clickListener", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME, "position", "", "(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V", "deviceName", "Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;", "getDeviceName", "()Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;", "pairButton", "Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableButton;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class FoundDeviceViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
    private final powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView deviceName;
    private final powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableButton pairButton;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FoundDeviceViewHolder(android.view.View view, final kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> clickListener) {
        super(view);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clickListener, "clickListener");
        powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView fontableTextView = (powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView) view.findViewById(powerwatch.matrix.com.pwgen2android.R.id.device_name);
        kotlin.jvm.internal.Intrinsics.checkNotNull(fontableTextView);
        this.deviceName = fontableTextView;
        powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableButton fontableButton = (powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableButton) view.findViewById(powerwatch.matrix.com.pwgen2android.R.id.pair_button);
        kotlin.jvm.internal.Intrinsics.checkNotNull(fontableButton);
        this.pairButton = fontableButton;
        fontableButton.setOnClickListener(new android.view.View.OnClickListener() { // from class: powerwatch.matrix.com.pwgen2android.pair.ui.gen1.-$$Lambda$FoundDeviceViewHolder$S2BZb6GlIC45nGTrUw0TVnElM6g
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                powerwatch.matrix.com.pwgen2android.pair.ui.gen1.FoundDeviceViewHolder.m2036_init_$lambda0(clickListener, this, view2);
            }
        });
    }

    public final powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView getDeviceName() {
        return this.deviceName;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: _init_$lambda-0, reason: not valid java name */
    public static final void m2036_init_$lambda0(kotlin.jvm.functions.Function1 clickListener, powerwatch.matrix.com.pwgen2android.pair.ui.gen1.FoundDeviceViewHolder this$0, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clickListener, "$clickListener");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        clickListener.invoke(java.lang.Integer.valueOf(this$0.getAdapterPosition()));
    }
}
