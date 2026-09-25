package powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.chooseActityType;

/* JADX INFO: compiled from: ChooseItemRecyclerAdapter.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B2\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012#\u0010\u0004\u001a\u001f\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n\u0018\u00010\u0005¢\u0006\u0002\u0010\u000bR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/chooseActityType/ActivityTypeViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "clickListener", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME, "position", "", "(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V", "activityName", "Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;", "getActivityName", "()Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;", "checkedButton", "Landroid/widget/RadioButton;", "getCheckedButton", "()Landroid/widget/RadioButton;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class ActivityTypeViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
    private final powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView activityName;
    private final android.widget.RadioButton checkedButton;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivityTypeViewHolder(android.view.View view, final kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> function1) {
        super(view);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView fontableTextView = (powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView) view.findViewById(powerwatch.matrix.com.pwgen2android.R.id.activity_name);
        kotlin.jvm.internal.Intrinsics.checkNotNull(fontableTextView);
        this.activityName = fontableTextView;
        android.widget.RadioButton radioButton = (android.widget.RadioButton) view.findViewById(powerwatch.matrix.com.pwgen2android.R.id.checked_button);
        kotlin.jvm.internal.Intrinsics.checkNotNull(radioButton);
        this.checkedButton = radioButton;
        view.setOnClickListener(new android.view.View.OnClickListener() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.chooseActityType.-$$Lambda$ActivityTypeViewHolder$K1Q2ZlE95Q02Uz5tdeBlgU6Mr2c
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.chooseActityType.ActivityTypeViewHolder.m1889_init_$lambda0(function1, this, view2);
            }
        });
    }

    public final powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView getActivityName() {
        return this.activityName;
    }

    public final android.widget.RadioButton getCheckedButton() {
        return this.checkedButton;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: _init_$lambda-0, reason: not valid java name */
    public static final void m1889_init_$lambda0(kotlin.jvm.functions.Function1 function1, powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.chooseActityType.ActivityTypeViewHolder this$0, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (function1 == null) {
            return;
        }
        function1.invoke(java.lang.Integer.valueOf(this$0.getAdapterPosition()));
    }
}
