package powerwatch.matrix.com.pwgen2android.setup.permissions;

/* JADX INFO: compiled from: PermissionInfoRecyclerAdapter.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u001c\u001a\u00020\u000bH\u0016J\u0018\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000bH\u0016J\u0018\u0010\u001f\u001a\u00020\u00022\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u000bH\u0016R7\u0010\t\u001a\u001f\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R0\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006#"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/setup/permissions/PermissionInfoRecyclerAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lpowerwatch/matrix/com/pwgen2android/setup/permissions/PermissionInfoItemViewHolder;", "newItems", "", "Lpowerwatch/matrix/com/pwgen2android/setup/permissions/UIPermissionInfo;", "context", "Landroid/content/Context;", "(Ljava/util/List;Landroid/content/Context;)V", "clickListener", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME, "position", "", "getClickListener", "()Lkotlin/jvm/functions/Function1;", "setClickListener", "(Lkotlin/jvm/functions/Function1;)V", "getContext", "()Landroid/content/Context;", "value", "items", "getItems", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", "getItemCount", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class PermissionInfoRecyclerAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<powerwatch.matrix.com.pwgen2android.setup.permissions.PermissionInfoItemViewHolder> {
    private kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> clickListener;
    private final android.content.Context context;
    private java.util.List<powerwatch.matrix.com.pwgen2android.setup.permissions.UIPermissionInfo> items;

    public final android.content.Context getContext() {
        return this.context;
    }

    public PermissionInfoRecyclerAdapter(java.util.List<powerwatch.matrix.com.pwgen2android.setup.permissions.UIPermissionInfo> newItems, android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(newItems, "newItems");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.items = newItems;
    }

    public final java.util.List<powerwatch.matrix.com.pwgen2android.setup.permissions.UIPermissionInfo> getItems() {
        return this.items;
    }

    public final void setItems(java.util.List<powerwatch.matrix.com.pwgen2android.setup.permissions.UIPermissionInfo> value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
        this.items = value;
        notifyDataSetChanged();
    }

    public final kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit> getClickListener() {
        return this.clickListener;
    }

    public final void setClickListener(kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> function1) {
        this.clickListener = function1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public powerwatch.matrix.com.pwgen2android.setup.permissions.PermissionInfoItemViewHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parent, "parent");
        android.view.View viewInflate = android.view.LayoutInflater.from(this.context).inflate(powerwatch.matrix.com.pwgen2android.R.layout.permission_info_item, parent, false);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(viewInflate, "from(context).inflate(R.layout.permission_info_item, parent, false)");
        return new powerwatch.matrix.com.pwgen2android.setup.permissions.PermissionInfoItemViewHolder(viewInflate, this.clickListener);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.items.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(powerwatch.matrix.com.pwgen2android.setup.permissions.PermissionInfoItemViewHolder holder, int position) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(holder, "holder");
        powerwatch.matrix.com.pwgen2android.setup.permissions.UIPermissionInfo uIPermissionInfo = this.items.get(position);
        holder.getTitle().setText(uIPermissionInfo.getTitle());
        holder.getDescription().setText(uIPermissionInfo.getDescription());
        holder.getIcon().setImageResource(uIPermissionInfo.getIcon());
        holder.getChecked().setChecked(uIPermissionInfo.getChecked());
        holder.getChecked().setEnabled(uIPermissionInfo.getClickable());
    }
}
