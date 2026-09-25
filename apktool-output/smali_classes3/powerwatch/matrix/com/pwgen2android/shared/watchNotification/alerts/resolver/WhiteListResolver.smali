.class public final Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/WhiteListResolver;
.super Ljava/lang/Object;
.source "WhiteListResolver.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppsResolverHelper;


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nWhiteListResolver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WhiteListResolver.kt\npowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/WhiteListResolver\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,388:1\n211#2,2:389\n764#3:391\n855#3,2:392\n1849#3,2:394\n1547#3:396\n1618#3,3:397\n286#3,2:400\n*S KotlinDebug\n*F\n+ 1 WhiteListResolver.kt\npowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/WhiteListResolver\n*L\n52#1:389,2\n76#1:391\n76#1:392,2\n78#1:394,2\n380#1:396\n380#1:397,3\n381#1:400,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000b\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u0008J\u0006\u0010\u0017\u001a\u00020\u0018J\u0018\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u000eH\u0016J\u0018\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u000eH\u0016J\u0006\u0010\u001e\u001a\u00020\u0018J\u0016\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00020!0 2\u0006\u0010\"\u001a\u00020\u0003H\u0016J\u0008\u0010#\u001a\u00020\u000bH\u0002J\u0010\u0010$\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u000bH\u0016J\u0010\u0010%\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020\'H\u0016J\u0010\u0010(\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u000bH\u0002J\u001a\u0010)\u001a\u0004\u0018\u00010*2\u0006\u0010&\u001a\u00020\'2\u0006\u0010+\u001a\u00020,H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000c\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011\"\u0004\u0008\u0012\u0010\u0013R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00160\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006-"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/WhiteListResolver;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppsResolverHelper;",
        "applicationContext",
        "Landroid/content/Context;",
        "thirdPartyAppStorage",
        "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ThirdPartyAppStorage;",
        "rxBus",
        "Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;",
        "(Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ThirdPartyAppStorage;Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;)V",
        "hiddenDialerAppsSet",
        "",
        "",
        "localMemory",
        "",
        "",
        "mainDialerPackage",
        "getMainDialerPackage",
        "()Ljava/lang/String;",
        "setMainDialerPackage",
        "(Ljava/lang/String;)V",
        "smsPackage",
        "whiteListedApps",
        "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/ResolverWrapper;",
        "clearLocalMemory",
        "",
        "enableApp",
        "packageName",
        "enable",
        "enableCallsApp",
        "store",
        "flushMemory",
        "getAppInfo",
        "",
        "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfo;",
        "activityContext",
        "getSMSPackage",
        "isAppEnabled",
        "isAppSupported",
        "notification",
        "Landroid/service/notification/StatusBarNotification;",
        "isHiddenDialerApp",
        "resolveAppNotification",
        "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/AlertEvent;",
        "notificationEventType",
        "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/NotificationEventType;",
        "app_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x5,
        0x1
    }
    xi = 0x30
.end annotation


# instance fields
.field private final applicationContext:Landroid/content/Context;

.field private final hiddenDialerAppsSet:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final localMemory:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private mainDialerPackage:Ljava/lang/String;

.field private final rxBus:Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;

.field private smsPackage:Ljava/lang/String;

.field private final thirdPartyAppStorage:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ThirdPartyAppStorage;

.field private final whiteListedApps:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/ResolverWrapper;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ThirdPartyAppStorage;Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;)V
    .locals 29

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    const-string v4, "applicationContext"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "thirdPartyAppStorage"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "rxBus"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    iput-object v1, v0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/WhiteListResolver;->applicationContext:Landroid/content/Context;

    iput-object v2, v0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/WhiteListResolver;->thirdPartyAppStorage:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ThirdPartyAppStorage;

    iput-object v3, v0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/WhiteListResolver;->rxBus:Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;

    const-string v2, ""

    .line 30
    iput-object v2, v0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/WhiteListResolver;->mainDialerPackage:Ljava/lang/String;

    .line 31
    iput-object v2, v0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/WhiteListResolver;->smsPackage:Ljava/lang/String;

    .line 32
    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    check-cast v2, Ljava/util/Map;

    iput-object v2, v0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/WhiteListResolver;->whiteListedApps:Ljava/util/Map;

    .line 33
    new-instance v4, Ljava/util/LinkedHashMap;

    invoke-direct {v4}, Ljava/util/LinkedHashMap;-><init>()V

    check-cast v4, Ljava/util/Map;

    iput-object v4, v0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/WhiteListResolver;->localMemory:Ljava/util/Map;

    const-string v4, "com.android.server.telecom"

    const-string v5, "com.android.incallui"

    const-string v6, "com.samsung.android.incallui"

    .line 36
    filled-new-array {v4, v5, v6}, [Ljava/lang/String;

    move-result-object v7

    .line 35
    invoke-static {v7}, Lkotlin/collections/SetsKt;->setOf([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v7

    iput-object v7, v0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/WhiteListResolver;->hiddenDialerAppsSet:Ljava/util/Set;

    .line 110
    new-instance v7, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v8, 0x0

    invoke-direct {v7, v8}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 113
    new-instance v9, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/apps/posted/CellularCallAlertPosted;

    invoke-direct {v9, v7, v1, v3}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/apps/posted/CellularCallAlertPosted;-><init>(Ljava/util/concurrent/atomic/AtomicBoolean;Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;)V

    .line 114
    new-instance v3, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/apps/dismissed/CellularCallAlertDismissed;

    invoke-direct {v3, v7, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/apps/dismissed/CellularCallAlertDismissed;-><init>(Ljava/util/concurrent/atomic/AtomicBoolean;Landroid/content/Context;)V

    .line 118
    new-instance v7, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/WhiteListResolver$fbMessengerPosted$1;

    invoke-direct {v7, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/WhiteListResolver$fbMessengerPosted$1;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/WhiteListResolver;)V

    .line 133
    new-instance v10, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/WhiteListResolver$fbMessengerDismissed$1;

    invoke-direct {v10, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/WhiteListResolver$fbMessengerDismissed$1;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/WhiteListResolver;)V

    .line 149
    new-instance v11, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/WhiteListResolver$skypePosted$1;

    invoke-direct {v11, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/WhiteListResolver$skypePosted$1;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/WhiteListResolver;)V

    .line 160
    new-instance v12, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/WhiteListResolver$skypeDismissed$1;

    invoke-direct {v12, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/WhiteListResolver$skypeDismissed$1;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/WhiteListResolver;)V

    .line 175
    new-instance v13, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/WhiteListResolver$alertPosted$1;

    invoke-direct {v13, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/WhiteListResolver$alertPosted$1;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/WhiteListResolver;)V

    .line 188
    new-instance v14, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/WhiteListResolver$gmailPosted$1;

    invoke-direct {v14, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/WhiteListResolver$gmailPosted$1;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/WhiteListResolver;)V

    .line 201
    new-instance v15, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/WhiteListResolver$alertDismissed$1;

    invoke-direct {v15, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/WhiteListResolver$alertDismissed$1;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/WhiteListResolver;)V

    .line 212
    new-instance v8, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/WhiteListResolver$whatsAppPosted$1;

    invoke-direct {v8, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/WhiteListResolver$whatsAppPosted$1;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/WhiteListResolver;)V

    move-object/from16 p3, v12

    .line 241
    new-instance v12, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/WhiteListResolver$whatsAppDismissed$1;

    invoke-direct {v12, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/WhiteListResolver$whatsAppDismissed$1;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/WhiteListResolver;)V

    move-object/from16 v16, v11

    .line 261
    new-instance v11, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/WhiteListResolver$lineAlertDismissed$1;

    invoke-direct {v11, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/WhiteListResolver$lineAlertDismissed$1;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/WhiteListResolver;)V

    move-object/from16 v17, v11

    .line 269
    new-instance v11, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/WhiteListResolver$lineAlertPosted$1;

    invoke-direct {v11, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/WhiteListResolver$lineAlertPosted$1;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/WhiteListResolver;)V

    move-object/from16 v18, v11

    .line 281
    new-instance v11, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/WhiteListResolver$fongoAppPosted$1;

    invoke-direct {v11, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/WhiteListResolver$fongoAppPosted$1;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/WhiteListResolver;)V

    move-object/from16 v19, v14

    .line 296
    new-instance v14, Ljava/util/concurrent/atomic/AtomicBoolean;

    move-object/from16 v20, v10

    const/4 v10, 0x0

    invoke-direct {v14, v10}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 298
    new-instance v10, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/apps/posted/ViberPostedAlert;

    invoke-direct {v10, v14, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/apps/posted/ViberPostedAlert;-><init>(Ljava/util/concurrent/atomic/AtomicBoolean;Landroid/content/Context;)V

    move-object/from16 v21, v7

    .line 299
    new-instance v7, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/apps/dismissed/ViberDismissedAlert;

    invoke-direct {v7, v14, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/apps/dismissed/ViberDismissedAlert;-><init>(Ljava/util/concurrent/atomic/AtomicBoolean;Landroid/content/Context;)V

    .line 303
    sget-object v14, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/PowerWatch2AlertsService;->Companion:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/PowerWatch2AlertsService$Companion;

    invoke-virtual {v14, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/PowerWatch2AlertsService$Companion;->getPackagesOfDialerApps(Landroid/content/Context;)Ljava/util/List;

    move-result-object v14

    .line 306
    move-object/from16 v22, v14

    check-cast v22, Ljava/util/Collection;

    invoke-interface/range {v22 .. v22}, Ljava/util/Collection;->isEmpty()Z

    move-result v22

    xor-int/lit8 v22, v22, 0x1

    if-eqz v22, :cond_0

    move-object/from16 v22, v11

    const/4 v11, 0x0

    .line 307
    invoke-interface {v14, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v23

    move-object/from16 p2, v7

    move-object/from16 v7, v23

    check-cast v7, Ljava/lang/String;

    iput-object v7, v0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/WhiteListResolver;->mainDialerPackage:Ljava/lang/String;

    .line 308
    invoke-interface {v14, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    invoke-static {v7}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/WhiteListResolverKt;->setMainGlobalDialerPackage(Ljava/lang/String;)V

    .line 309
    new-instance v7, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/ResolverWrapper;

    check-cast v9, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/PowerWatch2AlertsService$OnNotificationReceived;

    check-cast v3, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/PowerWatch2AlertsService$OnNotificationReceived;

    new-instance v11, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfo;

    iget-object v14, v0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/WhiteListResolver;->mainDialerPackage:Ljava/lang/String;

    const/16 v26, 0x0

    const/16 v27, 0x4

    const/16 v28, 0x0

    const-string v24, "Phone Call"

    move-object/from16 v23, v11

    move-object/from16 v25, v14

    invoke-direct/range {v23 .. v28}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfoType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {v7, v9, v3, v11}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/ResolverWrapper;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/PowerWatch2AlertsService$OnNotificationReceived;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/PowerWatch2AlertsService$OnNotificationReceived;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfo;)V

    .line 311
    iget-object v3, v0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/WhiteListResolver;->mainDialerPackage:Ljava/lang/String;

    invoke-interface {v2, v3, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 312
    invoke-interface {v2, v4, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 313
    invoke-interface {v2, v5, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 314
    invoke-interface {v2, v6, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    move-object/from16 p2, v7

    move-object/from16 v22, v11

    .line 319
    :goto_0
    new-instance v3, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/ResolverWrapper;

    check-cast v13, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/PowerWatch2AlertsService$OnNotificationReceived;

    check-cast v15, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/PowerWatch2AlertsService$OnNotificationReceived;

    new-instance v4, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfo;

    const/16 v26, 0x0

    const/16 v27, 0x4

    const/16 v28, 0x0

    const-string v24, "Calendar"

    const-string v25, "com.google.android.calendar"

    move-object/from16 v23, v4

    invoke-direct/range {v23 .. v28}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfoType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {v3, v13, v15, v4}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/ResolverWrapper;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/PowerWatch2AlertsService$OnNotificationReceived;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/PowerWatch2AlertsService$OnNotificationReceived;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfo;)V

    const-string v4, "com.google.android.calendar"

    invoke-interface {v2, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 322
    new-instance v3, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/ResolverWrapper;

    check-cast v8, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/PowerWatch2AlertsService$OnNotificationReceived;

    check-cast v12, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/PowerWatch2AlertsService$OnNotificationReceived;

    new-instance v4, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfo;

    const v5, 0x7f0f01f1

    invoke-virtual {v1, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    const-string v6, "applicationContext.getString(R.string.whatsapp)"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v25, "com.whatsapp"

    move-object/from16 v23, v4

    move-object/from16 v24, v5

    invoke-direct/range {v23 .. v28}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfoType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {v3, v8, v12, v4}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/ResolverWrapper;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/PowerWatch2AlertsService$OnNotificationReceived;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/PowerWatch2AlertsService$OnNotificationReceived;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfo;)V

    const-string v4, "com.whatsapp"

    invoke-interface {v2, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 325
    new-instance v3, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/ResolverWrapper;

    check-cast v10, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/PowerWatch2AlertsService$OnNotificationReceived;

    move-object/from16 v7, p2

    check-cast v7, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/PowerWatch2AlertsService$OnNotificationReceived;

    new-instance v4, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfo;

    const v5, 0x7f0f01e1

    invoke-virtual {v1, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    const-string v6, "applicationContext.getString(R.string.viber)"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v25, "com.viber.voip"

    move-object/from16 v23, v4

    move-object/from16 v24, v5

    invoke-direct/range {v23 .. v28}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfoType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {v3, v10, v7, v4}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/ResolverWrapper;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/PowerWatch2AlertsService$OnNotificationReceived;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/PowerWatch2AlertsService$OnNotificationReceived;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfo;)V

    const-string v4, "com.viber.voip"

    invoke-interface {v2, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 328
    new-instance v3, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/ResolverWrapper;

    move-object/from16 v11, v22

    check-cast v11, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/PowerWatch2AlertsService$OnNotificationReceived;

    new-instance v10, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfo;

    const v4, 0x7f0f00d5

    invoke-virtual {v1, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    const-string v4, "applicationContext.getString(R.string.fongo)"

    invoke-static {v5, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v7, 0x0

    const/4 v8, 0x4

    const/4 v9, 0x0

    const-string v6, "com.fongo.dellvoice"

    move-object v4, v10

    invoke-direct/range {v4 .. v9}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfoType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {v3, v11, v15, v10}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/ResolverWrapper;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/PowerWatch2AlertsService$OnNotificationReceived;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/PowerWatch2AlertsService$OnNotificationReceived;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfo;)V

    const-string v4, "com.fongo.dellvoice"

    invoke-interface {v2, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 332
    new-instance v3, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/ResolverWrapper;

    move-object/from16 v7, v21

    check-cast v7, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/PowerWatch2AlertsService$OnNotificationReceived;

    move-object/from16 v10, v20

    check-cast v10, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/PowerWatch2AlertsService$OnNotificationReceived;

    new-instance v4, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfo;

    const v5, 0x7f0f00cd

    invoke-virtual {v1, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    const-string v6, "applicationContext.getString(R.string.facebook_messenger)"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v23, 0x0

    const/16 v24, 0x4

    const/16 v25, 0x0

    const-string v22, "com.facebook.orca"

    move-object/from16 v20, v4

    move-object/from16 v21, v5

    invoke-direct/range {v20 .. v25}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfoType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {v3, v7, v10, v4}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/ResolverWrapper;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/PowerWatch2AlertsService$OnNotificationReceived;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/PowerWatch2AlertsService$OnNotificationReceived;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfo;)V

    const-string v4, "com.facebook.orca"

    invoke-interface {v2, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 335
    new-instance v3, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/ResolverWrapper;

    new-instance v4, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfo;

    const v5, 0x7f0f00ce

    invoke-virtual {v1, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    const-string v6, "applicationContext.getString(R.string.facebook_messenger_lite)"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v22, "com.facebook.mlite"

    move-object/from16 v20, v4

    move-object/from16 v21, v5

    invoke-direct/range {v20 .. v25}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfoType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {v3, v7, v10, v4}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/ResolverWrapper;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/PowerWatch2AlertsService$OnNotificationReceived;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/PowerWatch2AlertsService$OnNotificationReceived;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfo;)V

    const-string v4, "com.facebook.mlite"

    invoke-interface {v2, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 338
    new-instance v3, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/ResolverWrapper;

    move-object/from16 v14, v19

    check-cast v14, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/PowerWatch2AlertsService$OnNotificationReceived;

    new-instance v10, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfo;

    const v4, 0x7f0f00e0

    invoke-virtual {v1, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    const-string v4, "applicationContext.getString(R.string.gmail)"

    invoke-static {v5, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v7, 0x0

    const-string v6, "com.google.android.gm"

    move-object v4, v10

    invoke-direct/range {v4 .. v9}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfoType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {v3, v14, v15, v10}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/ResolverWrapper;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/PowerWatch2AlertsService$OnNotificationReceived;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/PowerWatch2AlertsService$OnNotificationReceived;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfo;)V

    const-string v4, "com.google.android.gm"

    invoke-interface {v2, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 341
    new-instance v3, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/ResolverWrapper;

    move-object/from16 v11, v16

    check-cast v11, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/PowerWatch2AlertsService$OnNotificationReceived;

    move-object/from16 v12, p3

    check-cast v12, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/PowerWatch2AlertsService$OnNotificationReceived;

    new-instance v10, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfo;

    const v4, 0x7f0f0195

    invoke-virtual {v1, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    const-string v4, "applicationContext.getString(R.string.skype)"

    invoke-static {v5, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "com.skype.raider"

    move-object v4, v10

    invoke-direct/range {v4 .. v9}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfoType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {v3, v11, v12, v10}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/ResolverWrapper;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/PowerWatch2AlertsService$OnNotificationReceived;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/PowerWatch2AlertsService$OnNotificationReceived;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfo;)V

    const-string v4, "com.skype.raider"

    invoke-interface {v2, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 344
    new-instance v3, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/ResolverWrapper;

    new-instance v10, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfo;

    const v4, 0x7f0f01eb

    invoke-virtual {v1, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    const-string v4, "applicationContext.getString(R.string.wechat)"

    invoke-static {v5, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "com.tencent.mm"

    move-object v4, v10

    invoke-direct/range {v4 .. v9}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfoType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {v3, v13, v15, v10}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/ResolverWrapper;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/PowerWatch2AlertsService$OnNotificationReceived;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/PowerWatch2AlertsService$OnNotificationReceived;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfo;)V

    const-string v4, "com.tencent.mm"

    invoke-interface {v2, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 347
    new-instance v3, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/ResolverWrapper;

    move-object/from16 v11, v18

    check-cast v11, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/PowerWatch2AlertsService$OnNotificationReceived;

    move-object/from16 v4, v17

    check-cast v4, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/PowerWatch2AlertsService$OnNotificationReceived;

    new-instance v12, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfo;

    const v5, 0x7f0f0103

    invoke-virtual {v1, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v6

    const-string v5, "applicationContext.getString(R.string.line)"

    invoke-static {v6, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v8, 0x0

    const/4 v9, 0x4

    const/4 v10, 0x0

    const-string v7, "jp.naver.line.android"

    move-object v5, v12

    invoke-direct/range {v5 .. v10}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfoType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {v3, v11, v4, v12}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/ResolverWrapper;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/PowerWatch2AlertsService$OnNotificationReceived;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/PowerWatch2AlertsService$OnNotificationReceived;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfo;)V

    const-string v4, "jp.naver.line.android"

    invoke-interface {v2, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 350
    new-instance v3, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/ResolverWrapper;

    new-instance v10, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfo;

    const v4, 0x7f0f0104

    invoke-virtual {v1, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    const-string v4, "applicationContext.getString(R.string.line_lite)"

    invoke-static {v5, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v7, 0x0

    const/4 v8, 0x4

    const/4 v9, 0x0

    const-string v6, "com.linecorp.linelite"

    move-object v4, v10

    invoke-direct/range {v4 .. v9}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfoType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {v3, v13, v15, v10}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/ResolverWrapper;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/PowerWatch2AlertsService$OnNotificationReceived;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/PowerWatch2AlertsService$OnNotificationReceived;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfo;)V

    const-string v4, "com.linecorp.linelite"

    invoke-interface {v2, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 353
    new-instance v3, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/ResolverWrapper;

    new-instance v10, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfo;

    const v4, 0x7f0f00fc

    invoke-virtual {v1, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    const-string v4, "applicationContext.getString(R.string.instagram)"

    invoke-static {v5, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "com.instagram.android"

    move-object v4, v10

    invoke-direct/range {v4 .. v9}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfoType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {v3, v13, v15, v10}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/ResolverWrapper;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/PowerWatch2AlertsService$OnNotificationReceived;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/PowerWatch2AlertsService$OnNotificationReceived;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfo;)V

    const-string v4, "com.instagram.android"

    invoke-interface {v2, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 356
    new-instance v3, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/ResolverWrapper;

    new-instance v10, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfo;

    const v4, 0x7f0f01b5

    invoke-virtual {v1, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    const-string v4, "applicationContext.getString(R.string.telegram)"

    invoke-static {v5, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "org.telegram.messenger"

    move-object v4, v10

    invoke-direct/range {v4 .. v9}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfoType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {v3, v13, v15, v10}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/ResolverWrapper;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/PowerWatch2AlertsService$OnNotificationReceived;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/PowerWatch2AlertsService$OnNotificationReceived;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfo;)V

    const-string v4, "org.telegram.messenger"

    invoke-interface {v2, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 359
    new-instance v3, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/ResolverWrapper;

    new-instance v10, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfo;

    const v4, 0x7f0f014d

    invoke-virtual {v1, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    const-string v1, "applicationContext.getString(R.string.outlook)"

    invoke-static {v5, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "com.microsoft.office.outlook"

    move-object v4, v10

    invoke-direct/range {v4 .. v9}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfoType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {v3, v13, v15, v10}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/ResolverWrapper;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/PowerWatch2AlertsService$OnNotificationReceived;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/PowerWatch2AlertsService$OnNotificationReceived;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfo;)V

    const-string v1, "com.microsoft.office.outlook"

    invoke-interface {v2, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 362
    invoke-direct/range {p0 .. p0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/WhiteListResolver;->getSMSPackage()Ljava/lang/String;

    move-result-object v1

    .line 364
    iput-object v1, v0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/WhiteListResolver;->smsPackage:Ljava/lang/String;

    .line 365
    new-instance v3, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/ResolverWrapper;

    new-instance v10, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfo;

    const-string v5, "SMS"

    move-object v4, v10

    move-object v6, v1

    invoke-direct/range {v4 .. v9}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfoType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {v3, v13, v15, v10}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/ResolverWrapper;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/PowerWatch2AlertsService$OnNotificationReceived;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/PowerWatch2AlertsService$OnNotificationReceived;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfo;)V

    invoke-interface {v2, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final synthetic access$getApplicationContext$p(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/WhiteListResolver;)Landroid/content/Context;
    .locals 0

    .line 28
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/WhiteListResolver;->applicationContext:Landroid/content/Context;

    return-object p0
.end method

.method private final getSMSPackage()Ljava/lang/String;
    .locals 7

    .line 370
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/WhiteListResolver;->applicationContext:Landroid/content/Context;

    invoke-static {v0}, Landroid/provider/Telephony$Sms;->getDefaultSmsPackage(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_6

    .line 373
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.SENDTO"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v1, "smsto:"

    .line 374
    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 376
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/WhiteListResolver;->applicationContext:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Landroid/content/pm/PackageManager;->queryIntentActivities(Landroid/content/Intent;I)Ljava/util/List;

    move-result-object v0

    const-string v1, "applicationContext.packageManager.queryIntentActivities(intent, 0)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 378
    move-object v1, v0

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    const/4 v3, 0x1

    xor-int/2addr v1, v3

    const-string v4, "unknown"

    if-eqz v1, :cond_5

    .line 379
    check-cast v0, Ljava/lang/Iterable;

    .line 396
    new-instance v1, Ljava/util/ArrayList;

    const/16 v5, 0xa

    invoke-static {v0, v5}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v1, v5}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v1, Ljava/util/Collection;

    .line 397
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    .line 398
    check-cast v5, Landroid/content/pm/ResolveInfo;

    .line 380
    iget-object v5, v5, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    iget-object v5, v5, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    invoke-interface {v1, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 399
    :cond_0
    check-cast v1, Ljava/util/List;

    .line 396
    check-cast v1, Ljava/lang/Iterable;

    .line 400
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v5, v1

    check-cast v5, Ljava/lang/String;

    .line 381
    iget-object v6, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/WhiteListResolver;->whiteListedApps:Ljava/util/Map;

    invoke-interface {v6, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    if-nez v5, :cond_2

    const/4 v5, 0x1

    goto :goto_1

    :cond_2
    const/4 v5, 0x0

    :goto_1
    if-eqz v5, :cond_1

    goto :goto_2

    :cond_3
    const/4 v1, 0x0

    :goto_2
    check-cast v1, Ljava/lang/String;

    if-nez v1, :cond_4

    goto :goto_3

    :cond_4
    move-object v4, v1

    :cond_5
    :goto_3
    return-object v4

    :cond_6
    return-object v0
.end method

.method private final isHiddenDialerApp(Ljava/lang/String;)Z
    .locals 1

    .line 59
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/WhiteListResolver;->hiddenDialerAppsSet:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method


# virtual methods
.method public final clearLocalMemory()V
    .locals 1

    .line 40
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/WhiteListResolver;->localMemory:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    return-void
.end method

.method public enableApp(Ljava/lang/String;Z)V
    .locals 1

    const-string v0, "packageName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 63
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/WhiteListResolver;->localMemory:Ljava/util/Map;

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public enableCallsApp(ZZ)V
    .locals 3

    .line 44
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/WhiteListResolver;->whiteListedApps:Ljava/util/Map;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/WhiteListResolver;->mainDialerPackage:Ljava/lang/String;

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 45
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/WhiteListResolver;->localMemory:Ljava/util/Map;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/WhiteListResolver;->mainDialerPackage:Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz p2, :cond_0

    .line 47
    iget-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/WhiteListResolver;->thirdPartyAppStorage:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ThirdPartyAppStorage;

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/WhiteListResolver;->mainDialerPackage:Ljava/lang/String;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/WhiteListResolver;->applicationContext:Landroid/content/Context;

    invoke-interface {p2, v0, p1, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ThirdPartyAppStorage;->setThirdPartAppEnabled(Ljava/lang/String;ZLandroid/content/Context;)V

    :cond_0
    return-void
.end method

.method public final flushMemory()V
    .locals 5

    .line 52
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/WhiteListResolver;->localMemory:Ljava/util/Map;

    .line 389
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 53
    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/WhiteListResolver;->thirdPartyAppStorage:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ThirdPartyAppStorage;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    iget-object v4, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/WhiteListResolver;->applicationContext:Landroid/content/Context;

    invoke-interface {v2, v3, v1, v4}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ThirdPartyAppStorage;->setThirdPartAppEnabled(Ljava/lang/String;ZLandroid/content/Context;)V

    goto :goto_0

    .line 55
    :cond_0
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/WhiteListResolver;->localMemory:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    return-void
.end method

.method public getAppInfo(Landroid/content/Context;)Ljava/util/List;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            ")",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfo;",
            ">;"
        }
    .end annotation

    const-string v0, "activityContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 68
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    check-cast v0, Ljava/util/List;

    .line 69
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/WhiteListResolver;->whiteListedApps:Ljava/util/Map;

    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/WhiteListResolver;->mainDialerPackage:Ljava/lang/String;

    invoke-interface {v1, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 70
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfo;

    const v2, 0x7f0f0161

    invoke-virtual {p1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    const-string v2, "activityContext.getString(R.string.phone_call)"

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v4, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/WhiteListResolver;->mainDialerPackage:Ljava/lang/String;

    const/4 v5, 0x0

    const/4 v6, 0x4

    const/4 v7, 0x0

    move-object v2, v1

    invoke-direct/range {v2 .. v7}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfoType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 72
    :cond_0
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/WhiteListResolver;->whiteListedApps:Ljava/util/Map;

    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/WhiteListResolver;->smsPackage:Ljava/lang/String;

    invoke-interface {v1, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 73
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfo;

    const v2, 0x7f0f019a

    invoke-virtual {p1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    const-string p1, "activityContext.getString(R.string.sms)"

    invoke-static {v3, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v4, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/WhiteListResolver;->smsPackage:Ljava/lang/String;

    const/4 v5, 0x0

    const/4 v6, 0x4

    const/4 v7, 0x0

    move-object v2, v1

    invoke-direct/range {v2 .. v7}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfoType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 76
    :cond_1
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/WhiteListResolver;->whiteListedApps:Ljava/util/Map;

    invoke-interface {p1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    .line 391
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    check-cast v1, Ljava/util/Collection;

    .line 392
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_2
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Ljava/lang/String;

    .line 77
    iget-object v4, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/WhiteListResolver;->hiddenDialerAppsSet:Ljava/util/Set;

    invoke-interface {v4, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_3

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/WhiteListResolver;->getMainDialerPackage()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_3

    iget-object v4, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/WhiteListResolver;->smsPackage:Ljava/lang/String;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3

    const/4 v3, 0x1

    goto :goto_1

    :cond_3
    const/4 v3, 0x0

    :goto_1
    if-eqz v3, :cond_2

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 393
    :cond_4
    check-cast v1, Ljava/util/List;

    .line 391
    check-cast v1, Ljava/lang/Iterable;

    .line 394
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_8

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Ljava/lang/String;

    .line 79
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/WhiteListResolver;->whiteListedApps:Ljava/util/Map;

    invoke-interface {v1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/ResolverWrapper;

    if-nez v1, :cond_5

    const/4 v1, 0x0

    goto :goto_3

    :cond_5
    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/ResolverWrapper;->getAppInfo()Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfo;

    move-result-object v1

    :goto_3
    const-string v2, ""

    if-nez v1, :cond_6

    :goto_4
    move-object v3, v2

    goto :goto_5

    :cond_6
    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfo;->getAppName()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_7

    goto :goto_4

    :cond_7
    move-object v3, v1

    .line 80
    :goto_5
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfo;

    const/4 v5, 0x0

    const/4 v6, 0x4

    const/4 v7, 0x0

    move-object v2, v1

    invoke-direct/range {v2 .. v7}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfoType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_8
    return-object v0
.end method

.method public final getMainDialerPackage()Ljava/lang/String;
    .locals 1

    .line 30
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/WhiteListResolver;->mainDialerPackage:Ljava/lang/String;

    return-object v0
.end method

.method public isAppEnabled(Ljava/lang/String;)Z
    .locals 6

    const-string v0, "packageName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 95
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/WhiteListResolver;->localMemory:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/WhiteListResolver;->localMemory:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    :goto_0
    return p1

    .line 97
    :cond_1
    invoke-direct {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/WhiteListResolver;->isHiddenDialerApp(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/WhiteListResolver;->mainDialerPackage:Ljava/lang/String;

    :cond_2
    move-object v2, p1

    .line 98
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/WhiteListResolver;->thirdPartyAppStorage:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ThirdPartyAppStorage;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/WhiteListResolver;->applicationContext:Landroid/content/Context;

    const/4 v3, 0x0

    const/4 v4, 0x4

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ThirdPartyAppStorage$DefaultImpls;->isAppNotificationEnabled$default(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ThirdPartyAppStorage;Landroid/content/Context;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public isAppSupported(Landroid/service/notification/StatusBarNotification;)Z
    .locals 1

    const-string v0, "notification"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 102
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/WhiteListResolver;->whiteListedApps:Ljava/util/Map;

    invoke-virtual {p1}, Landroid/service/notification/StatusBarNotification;->getPackageName()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public resolveAppNotification(Landroid/service/notification/StatusBarNotification;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/NotificationEventType;)Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/AlertEvent;
    .locals 2

    const-string v0, "notification"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "notificationEventType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 87
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/WhiteListResolver;->whiteListedApps:Ljava/util/Map;

    invoke-virtual {p1}, Landroid/service/notification/StatusBarNotification;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/ResolverWrapper;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 89
    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/NotificationEventType$POSTED;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/NotificationEventType$POSTED;

    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/ResolverWrapper;->getPostedResolver()Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/PowerWatch2AlertsService$OnNotificationReceived;

    move-result-object p2

    invoke-interface {p2, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/PowerWatch2AlertsService$OnNotificationReceived;->resolveAlert(Landroid/service/notification/StatusBarNotification;)Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/AlertEvent;

    move-result-object p1

    goto :goto_0

    .line 90
    :cond_0
    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/NotificationEventType$DISMISSED;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/NotificationEventType$DISMISSED;

    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/ResolverWrapper;->getDismissedResolver()Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/PowerWatch2AlertsService$OnNotificationReceived;

    move-result-object p2

    invoke-interface {p2, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/PowerWatch2AlertsService$OnNotificationReceived;->resolveAlert(Landroid/service/notification/StatusBarNotification;)Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/AlertEvent;

    move-result-object p1

    :goto_0
    return-object p1

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public final setMainDialerPackage(Ljava/lang/String;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/WhiteListResolver;->mainDialerPackage:Ljava/lang/String;

    return-void
.end method

.method public shouldResolve(Landroid/service/notification/StatusBarNotification;)Z
    .locals 0

    .line 28
    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppsResolverHelper$DefaultImpls;->shouldResolve(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppsResolverHelper;Landroid/service/notification/StatusBarNotification;)Z

    move-result p1

    return p1
.end method
