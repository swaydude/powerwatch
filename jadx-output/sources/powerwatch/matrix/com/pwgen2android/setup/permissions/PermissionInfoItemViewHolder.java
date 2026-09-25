package powerwatch.matrix.com.pwgen2android.setup.permissions;

/* JADX INFO: compiled from: PermissionInfoRecyclerAdapter.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B2\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012#\u0010\u0004\u001a\u001f\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n\u0018\u00010\u0005¢\u0006\u0002\u0010\u000bR\u0019\u0010\f\u001a\n \u000e*\u0004\u0018\u00010\r0\r¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0015\u001a\n \u000e*\u0004\u0018\u00010\u00160\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0019\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014¨\u0006\u001b"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/setup/permissions/PermissionInfoItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "clickListener", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME, "position", "", "(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V", "checked", "Landroidx/appcompat/widget/AppCompatCheckBox;", "kotlin.jvm.PlatformType", "getChecked", "()Landroidx/appcompat/widget/AppCompatCheckBox;", "description", "Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;", "getDescription", "()Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;", io.fabric.sdk.android.services.settings.SettingsJsonConstants.APP_ICON_KEY, "Landroid/widget/ImageView;", "getIcon", "()Landroid/widget/ImageView;", io.fabric.sdk.android.services.settings.SettingsJsonConstants.PROMPT_TITLE_KEY, "getTitle", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class PermissionInfoItemViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
    private final androidx.appcompat.widget.AppCompatCheckBox checked;
    private final powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView description;
    private final android.widget.ImageView icon;
    private final powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView title;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PermissionInfoItemViewHolder(android.view.View view, final kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> function1) {
        super(view);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView fontableTextView = (powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView) view.findViewById(powerwatch.matrix.com.pwgen2android.R.id.permission_item_title);
        kotlin.jvm.internal.Intrinsics.checkNotNull(fontableTextView);
        this.title = fontableTextView;
        powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView fontableTextView2 = (powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView) view.findViewById(powerwatch.matrix.com.pwgen2android.R.id.permission_item_description);
        kotlin.jvm.internal.Intrinsics.checkNotNull(fontableTextView2);
        this.description = fontableTextView2;
        this.icon = (android.widget.ImageView) view.findViewById(powerwatch.matrix.com.pwgen2android.R.id.permission_item_icon);
        androidx.appcompat.widget.AppCompatCheckBox appCompatCheckBox = (androidx.appcompat.widget.AppCompatCheckBox) view.findViewById(powerwatch.matrix.com.pwgen2android.R.id.permission_item_checkbox);
        this.checked = appCompatCheckBox;
        appCompatCheckBox.setOnClickListener(new android.view.View.OnClickListener() { // from class: powerwatch.matrix.com.pwgen2android.setup.permissions.-$$Lambda$PermissionInfoItemViewHolder$UkU_VOoxNYDiE2tzT7-_rSZ3i6c
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                powerwatch.matrix.com.pwgen2android.setup.permissions.PermissionInfoItemViewHolder.m2922_init_$lambda0(function1, this, view2);
            }
        });
    }

    public final powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView getTitle() {
        return this.title;
    }

    public final powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView getDescription() {
        return this.description;
    }

    public final android.widget.ImageView getIcon() {
        return this.icon;
    }

    public final androidx.appcompat.widget.AppCompatCheckBox getChecked() {
        return this.checked;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: _init_$lambda-0, reason: not valid java name */
    public static final void m2922_init_$lambda0(kotlin.jvm.functions.Function1 function1, powerwatch.matrix.com.pwgen2android.setup.permissions.PermissionInfoItemViewHolder this$0, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (function1 == null) {
            return;
        }
        function1.invoke(java.lang.Integer.valueOf(this$0.getAdapterPosition()));
    }
}
