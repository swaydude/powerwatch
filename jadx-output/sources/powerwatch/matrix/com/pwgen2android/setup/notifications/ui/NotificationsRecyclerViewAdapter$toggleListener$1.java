package powerwatch.matrix.com.pwgen2android.setup.notifications.ui;

/* JADX INFO: compiled from: NotificationsRecyclerViewAdapter.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\n"}, d2 = {"<anonymous>", "", "position", "", "enabled", "", "viewType", "Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/ItemType;"}, k = 3, mv = {1, 5, 1}, xi = 48)
final class NotificationsRecyclerViewAdapter$toggleListener$1 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function3<java.lang.Integer, java.lang.Boolean, powerwatch.matrix.com.pwgen2android.setup.notifications.ui.ItemType, kotlin.Unit> {
    final /* synthetic */ powerwatch.matrix.com.pwgen2android.setup.notifications.ui.NotificationsRecyclerViewAdapter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NotificationsRecyclerViewAdapter$toggleListener$1(powerwatch.matrix.com.pwgen2android.setup.notifications.ui.NotificationsRecyclerViewAdapter notificationsRecyclerViewAdapter) {
        super(3);
        this.this$0 = notificationsRecyclerViewAdapter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: invoke$lambda-1, reason: not valid java name */
    public static final void m2920invoke$lambda1(java.lang.Throwable th) {
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Integer num, java.lang.Boolean bool, powerwatch.matrix.com.pwgen2android.setup.notifications.ui.ItemType itemType) {
        invoke(num.intValue(), bool.booleanValue(), itemType);
        return kotlin.Unit.INSTANCE;
    }

    public final void invoke(int i, final boolean z, powerwatch.matrix.com.pwgen2android.setup.notifications.ui.ItemType viewType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewType, "viewType");
        if ((kotlin.jvm.internal.Intrinsics.areEqual(viewType, powerwatch.matrix.com.pwgen2android.setup.notifications.ui.ItemType.SimpleItem.INSTANCE) || kotlin.jvm.internal.Intrinsics.areEqual(viewType, powerwatch.matrix.com.pwgen2android.setup.notifications.ui.ItemType.HeaderWithAction.INSTANCE)) && i >= 0 && i < this.this$0.getItemList().size()) {
            final powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.AppInfo appInfo = kotlin.jvm.internal.Intrinsics.areEqual(viewType, powerwatch.matrix.com.pwgen2android.setup.notifications.ui.ItemType.SimpleItem.INSTANCE) ? ((powerwatch.matrix.com.pwgen2android.setup.notifications.ui.AppListItemState.ItemState) this.this$0.getItemList().get(i)).getAppInfo() : ((powerwatch.matrix.com.pwgen2android.setup.notifications.ui.AppListItemState.ActionHeader) this.this$0.getItemList().get(i)).getAppInfo();
            if (!kotlin.jvm.internal.Intrinsics.areEqual(appInfo.getPackageName(), powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.WhiteListResolverKt.getMainGlobalDialerPackage())) {
                this.this$0.resolverContainer.enableApp(appInfo, z);
            } else if (z) {
                io.reactivex.Observable<com.tbruyelle.rxpermissions2.Permission> observableRequestEach = this.this$0.rxPermissions.requestEach("android.permission.READ_PHONE_STATE", "android.permission.READ_CONTACTS");
                final powerwatch.matrix.com.pwgen2android.setup.notifications.ui.NotificationsRecyclerViewAdapter notificationsRecyclerViewAdapter = this.this$0;
                observableRequestEach.subscribe(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.setup.notifications.ui.-$$Lambda$NotificationsRecyclerViewAdapter$toggleListener$1$oOmUqEgOqFA94qqim2wgqVls-YI
                    @Override // io.reactivex.functions.Consumer
                    public final void accept(java.lang.Object obj) {
                        powerwatch.matrix.com.pwgen2android.setup.notifications.ui.NotificationsRecyclerViewAdapter$toggleListener$1.m2919invoke$lambda0(notificationsRecyclerViewAdapter, appInfo, z, (com.tbruyelle.rxpermissions2.Permission) obj);
                    }
                }, new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.setup.notifications.ui.-$$Lambda$NotificationsRecyclerViewAdapter$toggleListener$1$eYgY6JmtZTpT_QiXNbE5JjzfZ2s
                    @Override // io.reactivex.functions.Consumer
                    public final void accept(java.lang.Object obj) {
                        powerwatch.matrix.com.pwgen2android.setup.notifications.ui.NotificationsRecyclerViewAdapter$toggleListener$1.m2920invoke$lambda1((java.lang.Throwable) obj);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: invoke$lambda-0, reason: not valid java name */
    public static final void m2919invoke$lambda0(powerwatch.matrix.com.pwgen2android.setup.notifications.ui.NotificationsRecyclerViewAdapter this$0, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.AppInfo appInfo, boolean z, com.tbruyelle.rxpermissions2.Permission permission) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appInfo, "$appInfo");
        if (kotlin.jvm.internal.Intrinsics.areEqual(permission.name, "android.permission.READ_PHONE_STATE")) {
            this$0.resolverContainer.enableApp(appInfo, z && permission.granted);
            if (permission.granted && android.os.Build.VERSION.SDK_INT >= 29) {
                java.lang.Object systemService = this$0.activityContext.getSystemService("role");
                java.util.Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.app.role.RoleManager");
                android.app.role.RoleManager roleManager = (android.app.role.RoleManager) systemService;
                if (!roleManager.isRoleHeld("android.app.role.CALL_SCREENING")) {
                    android.content.Intent intentCreateRequestRoleIntent = roleManager.createRequestRoleIntent("android.app.role.CALL_SCREENING");
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intentCreateRequestRoleIntent, "roleManager.createRequestRoleIntent(RoleManager.ROLE_CALL_SCREENING)");
                    ((androidx.fragment.app.FragmentActivity) this$0.activityContext).startActivityForResult(intentCreateRequestRoleIntent, powerwatch.matrix.com.pwgen2android.main.MainActivityViewModelKt.getREQUEST_ID());
                }
            }
            this$0.notifyDataSetChanged();
        }
    }
}
