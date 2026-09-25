package powerwatch.matrix.com.pwgen2android.setup.notifications.ui;

/* JADX INFO: compiled from: NotificationsRecyclerViewAdapter.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u00100\u001a\u00020(H\u0016J\u0010\u00101\u001a\u00020(2\u0006\u0010)\u001a\u00020(H\u0016J\u0018\u00102\u001a\u00020\u001a2\u0006\u00103\u001a\u00020\u00022\u0006\u0010)\u001a\u00020(H\u0016J\u0018\u00104\u001a\u00020\u00022\u0006\u00105\u001a\u0002062\u0006\u0010\u0019\u001a\u00020(H\u0016J\u0018\u00107\u001a\u00020\u001a2\u0006\u00108\u001a\u00020\f2\u0006\u00109\u001a\u00020(H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R,\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012RJ\u0010\u0013\u001a2\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0013\u0012\u00110\u0018¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u001a0\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000Rc\u0010&\u001aG\u0012\u0013\u0012\u00110(¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b()\u0012\u0013\u0012\u00110*¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(+\u0012\u0013\u0012\u00110\u0018¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u001a0'8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/¨\u0006:"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/NotificationsRecyclerViewAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/NotificationViewHolder;", "activityContext", "Landroid/content/Context;", "resolverContainer", "Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/AppGroupController;", "rxPermissions", "Lcom/tbruyelle/rxpermissions2/RxPermissions;", "(Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/AppGroupController;Lcom/tbruyelle/rxpermissions2/RxPermissions;)V", "appGroupMap", "", "Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/AppListItemState$HeaderState;", "", "Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/AppListItemState$ItemState;", "getAppGroupMap", "()Ljava/util/Map;", "setAppGroupMap", "(Ljava/util/Map;)V", "clickListener", "Lkotlin/Function2;", "Lkotlin/ParameterName;", com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME, "viewHolder", "Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/ItemType;", "viewType", "", "getClickListener", "()Lkotlin/jvm/functions/Function2;", "setClickListener", "(Lkotlin/jvm/functions/Function2;)V", "itemList", "", "Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/AppListItemState;", "getItemList", "()Ljava/util/List;", "setItemList", "(Ljava/util/List;)V", "toggleListener", "Lkotlin/Function3;", "", "position", "", "enabled", "getToggleListener", "()Lkotlin/jvm/functions/Function3;", "setToggleListener", "(Lkotlin/jvm/functions/Function3;)V", "getItemCount", "getItemViewType", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "onGroupExpanded", "group", "groupPositionInList", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class NotificationsRecyclerViewAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<powerwatch.matrix.com.pwgen2android.setup.notifications.ui.NotificationViewHolder> {
    private final android.content.Context activityContext;
    private java.util.Map<powerwatch.matrix.com.pwgen2android.setup.notifications.ui.AppListItemState.HeaderState, java.util.List<powerwatch.matrix.com.pwgen2android.setup.notifications.ui.AppListItemState.ItemState>> appGroupMap;
    private kotlin.jvm.functions.Function2<? super powerwatch.matrix.com.pwgen2android.setup.notifications.ui.NotificationViewHolder, ? super powerwatch.matrix.com.pwgen2android.setup.notifications.ui.ItemType, kotlin.Unit> clickListener;
    private java.util.List<powerwatch.matrix.com.pwgen2android.setup.notifications.ui.AppListItemState> itemList;
    private final powerwatch.matrix.com.pwgen2android.setup.notifications.ui.AppGroupController resolverContainer;
    private final com.tbruyelle.rxpermissions2.RxPermissions rxPermissions;
    private kotlin.jvm.functions.Function3<? super java.lang.Integer, ? super java.lang.Boolean, ? super powerwatch.matrix.com.pwgen2android.setup.notifications.ui.ItemType, kotlin.Unit> toggleListener;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onBindViewHolder$lambda-1, reason: not valid java name */
    public static final void m2916onBindViewHolder$lambda1(android.widget.CompoundButton compoundButton, boolean z) {
    }

    public /* synthetic */ NotificationsRecyclerViewAdapter(android.content.Context context, powerwatch.matrix.com.pwgen2android.setup.notifications.ui.AppGroupController appGroupController, com.tbruyelle.rxpermissions2.RxPermissions rxPermissions, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, appGroupController, (i & 4) != 0 ? new com.tbruyelle.rxpermissions2.RxPermissions((androidx.fragment.app.FragmentActivity) context) : rxPermissions);
    }

    public NotificationsRecyclerViewAdapter(android.content.Context activityContext, powerwatch.matrix.com.pwgen2android.setup.notifications.ui.AppGroupController resolverContainer, com.tbruyelle.rxpermissions2.RxPermissions rxPermissions) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityContext, "activityContext");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resolverContainer, "resolverContainer");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rxPermissions, "rxPermissions");
        this.activityContext = activityContext;
        this.resolverContainer = resolverContainer;
        this.rxPermissions = rxPermissions;
        this.itemList = new java.util.ArrayList();
        this.appGroupMap = new java.util.LinkedHashMap();
        java.util.Map<powerwatch.matrix.com.pwgen2android.setup.notifications.ui.AppListItemState.HeaderState, java.util.List<powerwatch.matrix.com.pwgen2android.setup.notifications.ui.AppListItemState.ItemState>> mutableMap = kotlin.collections.MapsKt.toMutableMap(resolverContainer.getAppGroups(activityContext));
        this.appGroupMap = mutableMap;
        for (java.util.Map.Entry<powerwatch.matrix.com.pwgen2android.setup.notifications.ui.AppListItemState.HeaderState, java.util.List<powerwatch.matrix.com.pwgen2android.setup.notifications.ui.AppListItemState.ItemState>> entry : mutableMap.entrySet()) {
            powerwatch.matrix.com.pwgen2android.setup.notifications.ui.AppListItemState.HeaderState key = entry.getKey();
            java.util.List<powerwatch.matrix.com.pwgen2android.setup.notifications.ui.AppListItemState.ItemState> value = entry.getValue();
            getItemList().add(key);
            getItemList().addAll(value);
        }
        this.toggleListener = new powerwatch.matrix.com.pwgen2android.setup.notifications.ui.NotificationsRecyclerViewAdapter$toggleListener$1(this);
        this.clickListener = new kotlin.jvm.functions.Function2<powerwatch.matrix.com.pwgen2android.setup.notifications.ui.NotificationViewHolder, powerwatch.matrix.com.pwgen2android.setup.notifications.ui.ItemType, kotlin.Unit>() { // from class: powerwatch.matrix.com.pwgen2android.setup.notifications.ui.NotificationsRecyclerViewAdapter$clickListener$1
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(powerwatch.matrix.com.pwgen2android.setup.notifications.ui.NotificationViewHolder notificationViewHolder, powerwatch.matrix.com.pwgen2android.setup.notifications.ui.ItemType itemType) {
                invoke2(notificationViewHolder, itemType);
                return kotlin.Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(powerwatch.matrix.com.pwgen2android.setup.notifications.ui.NotificationViewHolder viewHolder, powerwatch.matrix.com.pwgen2android.setup.notifications.ui.ItemType viewType) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewType, "viewType");
                if (kotlin.jvm.internal.Intrinsics.areEqual(viewType, powerwatch.matrix.com.pwgen2android.setup.notifications.ui.ItemType.Header.INSTANCE) || kotlin.jvm.internal.Intrinsics.areEqual(viewType, powerwatch.matrix.com.pwgen2android.setup.notifications.ui.ItemType.HeaderWithAction.INSTANCE)) {
                    int adapterPosition = viewHolder.getAdapterPosition();
                    this.this$0.onGroupExpanded((powerwatch.matrix.com.pwgen2android.setup.notifications.ui.AppListItemState.HeaderState) this.this$0.getItemList().get(adapterPosition), adapterPosition);
                    this.this$0.notifyDataSetChanged();
                }
            }
        };
    }

    public final java.util.List<powerwatch.matrix.com.pwgen2android.setup.notifications.ui.AppListItemState> getItemList() {
        return this.itemList;
    }

    public final void setItemList(java.util.List<powerwatch.matrix.com.pwgen2android.setup.notifications.ui.AppListItemState> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.itemList = list;
    }

    public final java.util.Map<powerwatch.matrix.com.pwgen2android.setup.notifications.ui.AppListItemState.HeaderState, java.util.List<powerwatch.matrix.com.pwgen2android.setup.notifications.ui.AppListItemState.ItemState>> getAppGroupMap() {
        return this.appGroupMap;
    }

    public final void setAppGroupMap(java.util.Map<powerwatch.matrix.com.pwgen2android.setup.notifications.ui.AppListItemState.HeaderState, java.util.List<powerwatch.matrix.com.pwgen2android.setup.notifications.ui.AppListItemState.ItemState>> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.appGroupMap = map;
    }

    public final kotlin.jvm.functions.Function3<java.lang.Integer, java.lang.Boolean, powerwatch.matrix.com.pwgen2android.setup.notifications.ui.ItemType, kotlin.Unit> getToggleListener() {
        return this.toggleListener;
    }

    public final void setToggleListener(kotlin.jvm.functions.Function3<? super java.lang.Integer, ? super java.lang.Boolean, ? super powerwatch.matrix.com.pwgen2android.setup.notifications.ui.ItemType, kotlin.Unit> function3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function3, "<set-?>");
        this.toggleListener = function3;
    }

    public final kotlin.jvm.functions.Function2<powerwatch.matrix.com.pwgen2android.setup.notifications.ui.NotificationViewHolder, powerwatch.matrix.com.pwgen2android.setup.notifications.ui.ItemType, kotlin.Unit> getClickListener() {
        return this.clickListener;
    }

    public final void setClickListener(kotlin.jvm.functions.Function2<? super powerwatch.matrix.com.pwgen2android.setup.notifications.ui.NotificationViewHolder, ? super powerwatch.matrix.com.pwgen2android.setup.notifications.ui.ItemType, kotlin.Unit> function2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "<set-?>");
        this.clickListener = function2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public powerwatch.matrix.com.pwgen2android.setup.notifications.ui.NotificationViewHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
        int i;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parent, "parent");
        if (viewType == powerwatch.matrix.com.pwgen2android.setup.notifications.ui.ItemType.Header.INSTANCE.getType()) {
            i = powerwatch.matrix.com.pwgen2android.R.layout.notification_item_header;
        } else if (viewType == powerwatch.matrix.com.pwgen2android.setup.notifications.ui.ItemType.HeaderWithAction.INSTANCE.getType()) {
            i = powerwatch.matrix.com.pwgen2android.R.layout.notification_item_action_header;
        } else {
            i = viewType == powerwatch.matrix.com.pwgen2android.setup.notifications.ui.ItemType.NotCollapsibleHeader.INSTANCE.getType() ? powerwatch.matrix.com.pwgen2android.R.layout.notification_item_header_persistent : powerwatch.matrix.com.pwgen2android.R.layout.notification_app_item;
        }
        android.view.View viewInflate = android.view.LayoutInflater.from(this.activityContext).inflate(i, parent, false);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(viewInflate, "from(activityContext).inflate(layout, parent, false)");
        return new powerwatch.matrix.com.pwgen2android.setup.notifications.ui.NotificationViewHolder(viewInflate, viewType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onGroupExpanded(final powerwatch.matrix.com.pwgen2android.setup.notifications.ui.AppListItemState.HeaderState group, int groupPositionInList) {
        group.setColapsed(!group.getColapsed());
        if (group.getColapsed()) {
            kotlin.collections.CollectionsKt.removeAll((java.util.List) this.itemList, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<powerwatch.matrix.com.pwgen2android.setup.notifications.ui.AppListItemState, java.lang.Boolean>() { // from class: powerwatch.matrix.com.pwgen2android.setup.notifications.ui.NotificationsRecyclerViewAdapter.onGroupExpanded.1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ java.lang.Boolean invoke(powerwatch.matrix.com.pwgen2android.setup.notifications.ui.AppListItemState appListItemState) {
                    return java.lang.Boolean.valueOf(invoke2(appListItemState));
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final boolean invoke2(powerwatch.matrix.com.pwgen2android.setup.notifications.ui.AppListItemState it) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                    return kotlin.jvm.internal.Intrinsics.areEqual(it.getType(), powerwatch.matrix.com.pwgen2android.setup.notifications.ui.ItemType.SimpleItem.INSTANCE) && it.getHeaderIndex() == group.getHeaderIndex();
                }
            });
            return;
        }
        java.util.List<powerwatch.matrix.com.pwgen2android.setup.notifications.ui.AppListItemState> list = this.itemList;
        int i = groupPositionInList + 1;
        java.util.List<powerwatch.matrix.com.pwgen2android.setup.notifications.ui.AppListItemState.ItemState> listEmptyList = this.appGroupMap.get(group);
        if (listEmptyList == null) {
            listEmptyList = kotlin.collections.CollectionsKt.emptyList();
        }
        list.addAll(i, listEmptyList);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.itemList.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        return this.itemList.get(position).getType().getType();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(final powerwatch.matrix.com.pwgen2android.setup.notifications.ui.NotificationViewHolder holder, int position) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(holder, "holder");
        powerwatch.matrix.com.pwgen2android.setup.notifications.ui.AppListItemState appListItemState = this.itemList.get(position);
        holder.getAppName().setText(appListItemState.getTitle());
        final powerwatch.matrix.com.pwgen2android.setup.notifications.ui.ItemType type = appListItemState.getType();
        if (kotlin.jvm.internal.Intrinsics.areEqual(type, powerwatch.matrix.com.pwgen2android.setup.notifications.ui.ItemType.SimpleItem.INSTANCE) || kotlin.jvm.internal.Intrinsics.areEqual(type, powerwatch.matrix.com.pwgen2android.setup.notifications.ui.ItemType.HeaderWithAction.INSTANCE)) {
            powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.AppInfo appInfo = kotlin.jvm.internal.Intrinsics.areEqual(type, powerwatch.matrix.com.pwgen2android.setup.notifications.ui.ItemType.SimpleItem.INSTANCE) ? ((powerwatch.matrix.com.pwgen2android.setup.notifications.ui.AppListItemState.ItemState) appListItemState).getAppInfo() : ((powerwatch.matrix.com.pwgen2android.setup.notifications.ui.AppListItemState.ActionHeader) appListItemState).getAppInfo();
            if (kotlin.jvm.internal.Intrinsics.areEqual(type, powerwatch.matrix.com.pwgen2android.setup.notifications.ui.ItemType.HeaderWithAction.INSTANCE)) {
                holder.getAppToggle().setText(((powerwatch.matrix.com.pwgen2android.setup.notifications.ui.AppListItemState.ActionHeader) appListItemState).getActionTitle());
            }
            holder.getAppToggle().setOnCheckedChangeListener(new android.widget.CompoundButton.OnCheckedChangeListener() { // from class: powerwatch.matrix.com.pwgen2android.setup.notifications.ui.-$$Lambda$NotificationsRecyclerViewAdapter$-ItioVzbgO6kZBf1RdK4ZuWtMXc
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                    powerwatch.matrix.com.pwgen2android.setup.notifications.ui.NotificationsRecyclerViewAdapter.m2916onBindViewHolder$lambda1(compoundButton, z);
                }
            });
            holder.getAppToggle().setChecked(this.resolverContainer.isAppEnabled(appInfo));
            holder.getAppToggle().setOnCheckedChangeListener(new android.widget.CompoundButton.OnCheckedChangeListener() { // from class: powerwatch.matrix.com.pwgen2android.setup.notifications.ui.-$$Lambda$NotificationsRecyclerViewAdapter$XOm4USELumtoRu9WouDaiJ_URZg
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                    powerwatch.matrix.com.pwgen2android.setup.notifications.ui.NotificationsRecyclerViewAdapter.m2917onBindViewHolder$lambda2(this.f$0, holder, type, compoundButton, z);
                }
            });
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(type, powerwatch.matrix.com.pwgen2android.setup.notifications.ui.ItemType.Header.INSTANCE) || kotlin.jvm.internal.Intrinsics.areEqual(type, powerwatch.matrix.com.pwgen2android.setup.notifications.ui.ItemType.HeaderWithAction.INSTANCE)) {
            if (((powerwatch.matrix.com.pwgen2android.setup.notifications.ui.AppListItemState.HeaderState) this.itemList.get(position)).getColapsed()) {
                android.widget.ImageView arrow = holder.getArrow();
                if (arrow != null) {
                    arrow.setImageResource(powerwatch.matrix.com.pwgen2android.R.drawable.right_arrow_grey);
                }
            } else {
                android.widget.ImageView arrow2 = holder.getArrow();
                if (arrow2 != null) {
                    arrow2.setImageResource(powerwatch.matrix.com.pwgen2android.R.drawable.left_arrow_grey);
                }
            }
            android.widget.ImageView arrow3 = holder.getArrow();
            if (arrow3 != null) {
                arrow3.setRotation(90.0f);
            }
            holder.itemView.setOnClickListener(new android.view.View.OnClickListener() { // from class: powerwatch.matrix.com.pwgen2android.setup.notifications.ui.-$$Lambda$NotificationsRecyclerViewAdapter$_u3zBLdowexR0ZptG3zQWaGuQXw
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    powerwatch.matrix.com.pwgen2android.setup.notifications.ui.NotificationsRecyclerViewAdapter.m2918onBindViewHolder$lambda3(this.f$0, holder, type, view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onBindViewHolder$lambda-2, reason: not valid java name */
    public static final void m2917onBindViewHolder$lambda2(powerwatch.matrix.com.pwgen2android.setup.notifications.ui.NotificationsRecyclerViewAdapter this$0, powerwatch.matrix.com.pwgen2android.setup.notifications.ui.NotificationViewHolder holder, powerwatch.matrix.com.pwgen2android.setup.notifications.ui.ItemType itemType, android.widget.CompoundButton compoundButton, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(holder, "$holder");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(itemType, "$itemType");
        this$0.getToggleListener().invoke(java.lang.Integer.valueOf(holder.getAdapterPosition()), java.lang.Boolean.valueOf(z), itemType);
        if (kotlin.jvm.internal.Intrinsics.areEqual(itemType, powerwatch.matrix.com.pwgen2android.setup.notifications.ui.ItemType.HeaderWithAction.INSTANCE)) {
            this$0.notifyItemRangeChanged(holder.getAdapterPosition(), 50);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onBindViewHolder$lambda-3, reason: not valid java name */
    public static final void m2918onBindViewHolder$lambda3(powerwatch.matrix.com.pwgen2android.setup.notifications.ui.NotificationsRecyclerViewAdapter this$0, powerwatch.matrix.com.pwgen2android.setup.notifications.ui.NotificationViewHolder holder, powerwatch.matrix.com.pwgen2android.setup.notifications.ui.ItemType itemType, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(holder, "$holder");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(itemType, "$itemType");
        this$0.getClickListener().invoke(holder, itemType);
    }
}
