package powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.chooseActityType;

/* JADX INFO: compiled from: ChooseItemRecyclerAdapter.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B%\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0014\u0010 \u001a\u00020\u00112\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J\b\u0010!\u001a\u00020\rH\u0016J\u0018\u0010\"\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\rH\u0016J\u0018\u0010$\u001a\u00020\u00022\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\rH\u0016R7\u0010\u000b\u001a\u001f\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R0\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u0006("}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/chooseActityType/ChooseItemRecyclerAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/chooseActityType/ActivityTypeViewHolder;", "newItems", "", "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/chooseActityType/UIChooseItemView;", "context", "Landroid/content/Context;", "scaleDown", "", "(Ljava/util/List;Landroid/content/Context;Z)V", "clickListener", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME, "position", "", "getClickListener", "()Lkotlin/jvm/functions/Function1;", "setClickListener", "(Lkotlin/jvm/functions/Function1;)V", "getContext", "()Landroid/content/Context;", "value", "items", "getItems", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", "getScaleDown", "()Z", "addItems", "getItemCount", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class ChooseItemRecyclerAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.chooseActityType.ActivityTypeViewHolder> {
    private kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> clickListener;
    private final android.content.Context context;
    private java.util.List<powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.chooseActityType.UIChooseItemView> items;
    private final boolean scaleDown;

    public /* synthetic */ ChooseItemRecyclerAdapter(java.util.List list, android.content.Context context, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(list, context, (i & 4) != 0 ? false : z);
    }

    public final android.content.Context getContext() {
        return this.context;
    }

    public final boolean getScaleDown() {
        return this.scaleDown;
    }

    public ChooseItemRecyclerAdapter(java.util.List<powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.chooseActityType.UIChooseItemView> newItems, android.content.Context context, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(newItems, "newItems");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.scaleDown = z;
        this.items = newItems;
    }

    public final java.util.List<powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.chooseActityType.UIChooseItemView> getItems() {
        return this.items;
    }

    public final void setItems(java.util.List<powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.chooseActityType.UIChooseItemView> value) {
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
    public powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.chooseActityType.ActivityTypeViewHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parent, "parent");
        android.view.View view = android.view.LayoutInflater.from(this.context).inflate(powerwatch.matrix.com.pwgen2android.R.layout.activity_type_recycler_item, parent, false);
        if (this.scaleDown) {
            ((android.widget.TextView) view.findViewById(powerwatch.matrix.com.pwgen2android.R.id.activity_name)).setTextSize(16.0f);
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(view, "view");
        return new powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.chooseActityType.ActivityTypeViewHolder(view, this.clickListener);
    }

    public final void addItems(java.util.List<powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.chooseActityType.UIChooseItemView> newItems) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(newItems, "newItems");
        setItems(newItems);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.items.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.chooseActityType.ActivityTypeViewHolder holder, int position) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(holder, "holder");
        powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.chooseActityType.UIChooseItemView uIChooseItemView = this.items.get(position);
        holder.getActivityName().setText(uIChooseItemView.getName());
        holder.getCheckedButton().setChecked(uIChooseItemView.getChecked());
    }
}
