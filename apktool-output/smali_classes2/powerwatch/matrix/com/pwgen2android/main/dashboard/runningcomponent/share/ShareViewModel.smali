.class public final Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/share/ShareViewModel;
.super Landroidx/lifecycle/ViewModel;
.source "ShareActivityFragment.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\"\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u00152\u0008\u0008\u0002\u0010\u001e\u001a\u00020\u0015H\u0002J(\u0010\u001f\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u00152\u0006\u0010!\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0002J\n\u0010&\u001a\u00020\u000f*\u00020\'J\n\u0010(\u001a\u00020\u000f*\u00020\'J\n\u0010)\u001a\u00020\u000f*\u00020\'R\u000e\u0010\u0007\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0010\u0012\u000c\u0012\n \u000b*\u0004\u0018\u00010\u00050\u00050\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R*\u0010\u000c\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011\"\u0004\u0008\u0012\u0010\u0013R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0016\u0010\u0017\"\u0004\u0008\u0018\u0010\u0019R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006*"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/share/ShareViewModel;",
        "Landroidx/lifecycle/ViewModel;",
        "userActivitySessionDataProvider",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/UserActivitySessionDataProvider;",
        "activityContext",
        "Landroid/content/Context;",
        "(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/UserActivitySessionDataProvider;Landroid/content/Context;)V",
        "compositeDisposable",
        "Lio/reactivex/disposables/CompositeDisposable;",
        "contextWeakReference",
        "Ljava/lang/ref/WeakReference;",
        "kotlin.jvm.PlatformType",
        "dialogClose",
        "Lkotlin/Function1;",
        "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/share/SharedActivity;",
        "",
        "getDialogClose",
        "()Lkotlin/jvm/functions/Function1;",
        "setDialogClose",
        "(Lkotlin/jvm/functions/Function1;)V",
        "sessionId",
        "",
        "getSessionId",
        "()Ljava/lang/String;",
        "setSessionId",
        "(Ljava/lang/String;)V",
        "createFile",
        "Ljava/io/File;",
        "context",
        "logsString",
        "extension",
        "shareActivity",
        "activityData",
        "sharedActivity",
        "activityType",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityType;",
        "startTime",
        "",
        "onCancelClicked",
        "Landroid/view/View;",
        "onGPXClicked",
        "onTCXClicked",
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
.field private final compositeDisposable:Lio/reactivex/disposables/CompositeDisposable;

.field private final contextWeakReference:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field

.field private dialogClose:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/share/SharedActivity;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private sessionId:Ljava/lang/String;

.field private final userActivitySessionDataProvider:Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/UserActivitySessionDataProvider;


# direct methods
.method public constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/UserActivitySessionDataProvider;Landroid/content/Context;)V
    .locals 1

    const-string v0, "userActivitySessionDataProvider"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "activityContext"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 45
    invoke-direct {p0}, Landroidx/lifecycle/ViewModel;-><init>()V

    .line 44
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/share/ShareViewModel;->userActivitySessionDataProvider:Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/UserActivitySessionDataProvider;

    .line 46
    new-instance p1, Lio/reactivex/disposables/CompositeDisposable;

    invoke-direct {p1}, Lio/reactivex/disposables/CompositeDisposable;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/share/ShareViewModel;->compositeDisposable:Lio/reactivex/disposables/CompositeDisposable;

    .line 48
    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/share/ShareViewModel;->contextWeakReference:Ljava/lang/ref/WeakReference;

    return-void
.end method

.method private final createFile(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;
    .locals 2

    .line 111
    invoke-virtual {p1}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    move-result-object p1

    const-string v0, "activity"

    invoke-static {v0, p3, p1}, Ljava/io/File;->createTempFile(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Ljava/io/File;

    move-result-object p1

    const/4 p3, 0x0

    .line 116
    :try_start_0
    new-instance v0, Ljava/io/BufferedWriter;

    new-instance v1, Ljava/io/FileWriter;

    invoke-direct {v1, p1}, Ljava/io/FileWriter;-><init>(Ljava/io/File;)V

    check-cast v1, Ljava/io/Writer;

    invoke-direct {v0, v1}, Ljava/io/BufferedWriter;-><init>(Ljava/io/Writer;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 117
    :try_start_1
    invoke-virtual {v0, p2}, Ljava/io/BufferedWriter;->write(Ljava/lang/String;)V

    .line 118
    invoke-virtual {v0}, Ljava/io/BufferedWriter;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 122
    invoke-virtual {v0}, Ljava/io/BufferedWriter;->close()V

    goto :goto_3

    :catchall_0
    move-exception p1

    move-object p3, v0

    goto :goto_0

    :catch_0
    move-object p3, v0

    goto :goto_2

    :catchall_1
    move-exception p1

    :goto_0
    if-nez p3, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {p3}, Ljava/io/BufferedWriter;->close()V

    :goto_1
    throw p1

    :catch_1
    nop

    :goto_2
    if-nez p3, :cond_1

    goto :goto_3

    :cond_1
    invoke-virtual {p3}, Ljava/io/BufferedWriter;->close()V

    :goto_3
    const-string p2, "file"

    .line 125
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method static synthetic createFile$default(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/share/ShareViewModel;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/io/File;
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const-string p3, ".tcx"

    .line 110
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/share/ShareViewModel;->createFile(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$AubuT45aCPsJ_1JXJKmki3NlToY(Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/share/ShareViewModel;->onTCXClicked$lambda-1(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic lambda$My89bgvZiksDzRQhS46S9XVXavU(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/share/ShareViewModel;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/share/ShareViewModel;->onGPXClicked$lambda-2(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/share/ShareViewModel;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;)V

    return-void
.end method

.method public static synthetic lambda$fK7p4Z6bd9z3iPexDl4xUFDazco(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/share/ShareViewModel;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/share/ShareViewModel;->onTCXClicked$lambda-0(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/share/ShareViewModel;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;)V

    return-void
.end method

.method public static synthetic lambda$ghhRrmarSuyhxeHSA9n_mCzZIdg(Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/share/ShareViewModel;->onGPXClicked$lambda-3(Ljava/lang/Throwable;)V

    return-void
.end method

.method private static final onGPXClicked$lambda-2(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/share/ShareViewModel;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;)V
    .locals 8

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 72
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/GPXXMLWriter;

    invoke-direct {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/GPXXMLWriter;-><init>()V

    const-string v1, "it"

    .line 73
    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/GPXXMLWriter;->mapActivityToGPX(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;)Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/GPXData;

    move-result-object v1

    invoke-virtual {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/GPXXMLWriter;->writeGPX(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/GPXData;)Ljava/lang/String;

    move-result-object v3

    .line 75
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/share/SharedActivity$GPX;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/share/SharedActivity$GPX;

    move-object v4, v0

    check-cast v4, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/share/SharedActivity;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->getActivityType()Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityType;

    move-result-object v5

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->getStartTime()J

    move-result-wide v6

    move-object v2, p0

    invoke-direct/range {v2 .. v7}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/share/ShareViewModel;->shareActivity(Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/share/SharedActivity;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityType;J)V

    .line 76
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/share/ShareViewModel;->getDialogClose()Lkotlin/jvm/functions/Function1;

    move-result-object p0

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/share/SharedActivity$GPX;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/share/SharedActivity$GPX;

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_0
    return-void
.end method

.method private static final onGPXClicked$lambda-3(Ljava/lang/Throwable;)V
    .locals 0

    return-void
.end method

.method private static final onTCXClicked$lambda-0(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/share/ShareViewModel;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;)V
    .locals 8

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 57
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXWriter;

    invoke-direct {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXWriter;-><init>()V

    const-string v1, "it"

    .line 58
    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXWriter;->mapToTCXActivity(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;)Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXActivity;

    move-result-object v1

    invoke-virtual {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXWriter;->write(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXActivity;)Ljava/lang/String;

    move-result-object v3

    .line 60
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/share/SharedActivity$TCX;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/share/SharedActivity$TCX;

    move-object v4, v0

    check-cast v4, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/share/SharedActivity;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->getActivityType()Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityType;

    move-result-object v5

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->getStartTime()J

    move-result-wide v6

    move-object v2, p0

    invoke-direct/range {v2 .. v7}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/share/ShareViewModel;->shareActivity(Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/share/SharedActivity;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityType;J)V

    .line 61
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/share/ShareViewModel;->getDialogClose()Lkotlin/jvm/functions/Function1;

    move-result-object p0

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/share/SharedActivity$TCX;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/share/SharedActivity$TCX;

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_0
    return-void
.end method

.method private static final onTCXClicked$lambda-1(Ljava/lang/Throwable;)V
    .locals 0

    return-void
.end method

.method private final shareActivity(Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/share/SharedActivity;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityType;J)V
    .locals 2

    .line 89
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/share/ShareViewModel;->contextWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    if-eqz v0, :cond_2

    .line 92
    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/share/SharedActivity$TCX;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/share/SharedActivity$TCX;

    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const-string p2, ".tcx"

    goto :goto_0

    .line 93
    :cond_0
    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/share/SharedActivity$GPX;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/share/SharedActivity$GPX;

    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    const-string p2, ".gpx"

    .line 95
    :goto_0
    invoke-direct {p0, v0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/share/ShareViewModel;->createFile(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;

    move-result-object p1

    .line 97
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p3}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityType;->name()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p3, 0x5f

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-static {p4, p5}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/DateTimeExtensionsKt;->activityShareDateFormat(J)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    .line 99
    new-instance p4, Landroid/content/Intent;

    const-string p5, "android.intent.action.SEND"

    invoke-direct {p4, p5}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 100
    invoke-static {p3, p2}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    const-string p5, "android.intent.extra.SUBJECT"

    invoke-virtual {p4, p5, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string p2, "*/txt"

    .line 101
    invoke-virtual {p4, p2}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 103
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p2

    invoke-virtual {p2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p2

    invoke-static {v0, p2, p1}, Landroidx/core/content/FileProvider;->getUriForFile(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;)Landroid/net/Uri;

    move-result-object p1

    .line 105
    check-cast p1, Landroid/os/Parcelable;

    const-string p2, "android.intent.extra.STREAM"

    invoke-virtual {p4, p2, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 106
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/share/ShareViewModel;->contextWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/Context;

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    check-cast p3, Ljava/lang/CharSequence;

    invoke-static {p4, p3}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    goto :goto_1

    .line 93
    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_2
    :goto_1
    return-void
.end method


# virtual methods
.method public final getDialogClose()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1<",
            "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/share/SharedActivity;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .line 50
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/share/ShareViewModel;->dialogClose:Lkotlin/jvm/functions/Function1;

    return-object v0
.end method

.method public final getSessionId()Ljava/lang/String;
    .locals 1

    .line 47
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/share/ShareViewModel;->sessionId:Ljava/lang/String;

    return-object v0
.end method

.method public final onCancelClicked(Landroid/view/View;)V
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 84
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/share/ShareViewModel;->dialogClose:Lkotlin/jvm/functions/Function1;

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_0
    return-void
.end method

.method public final onGPXClicked(Landroid/view/View;)V
    .locals 3

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 68
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/share/ShareViewModel;->sessionId:Ljava/lang/String;

    if-eqz p1, :cond_0

    .line 69
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/share/ShareViewModel;->compositeDisposable:Lio/reactivex/disposables/CompositeDisposable;

    .line 70
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/share/ShareViewModel;->userActivitySessionDataProvider:Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/UserActivitySessionDataProvider;

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-interface {v1, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/UserActivitySessionDataProvider;->loadSessionById(Ljava/lang/String;)Lio/reactivex/Observable;

    move-result-object p1

    .line 71
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/share/-$$Lambda$ShareViewModel$My89bgvZiksDzRQhS46S9XVXavU;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/share/-$$Lambda$ShareViewModel$My89bgvZiksDzRQhS46S9XVXavU;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/share/ShareViewModel;)V

    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/share/-$$Lambda$ShareViewModel$ghhRrmarSuyhxeHSA9n_mCzZIdg;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/share/-$$Lambda$ShareViewModel$ghhRrmarSuyhxeHSA9n_mCzZIdg;

    invoke-virtual {p1, v1, v2}, Lio/reactivex/Observable;->subscribe(Lio/reactivex/functions/Consumer;Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    move-result-object p1

    .line 70
    invoke-virtual {v0, p1}, Lio/reactivex/disposables/CompositeDisposable;->add(Lio/reactivex/disposables/Disposable;)Z

    :cond_0
    return-void
.end method

.method public final onTCXClicked(Landroid/view/View;)V
    .locals 3

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 53
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/share/ShareViewModel;->sessionId:Ljava/lang/String;

    if-eqz p1, :cond_0

    .line 54
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/share/ShareViewModel;->compositeDisposable:Lio/reactivex/disposables/CompositeDisposable;

    .line 55
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/share/ShareViewModel;->userActivitySessionDataProvider:Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/UserActivitySessionDataProvider;

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-interface {v1, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/UserActivitySessionDataProvider;->loadSessionById(Ljava/lang/String;)Lio/reactivex/Observable;

    move-result-object p1

    .line 56
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/share/-$$Lambda$ShareViewModel$fK7p4Z6bd9z3iPexDl4xUFDazco;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/share/-$$Lambda$ShareViewModel$fK7p4Z6bd9z3iPexDl4xUFDazco;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/share/ShareViewModel;)V

    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/share/-$$Lambda$ShareViewModel$AubuT45aCPsJ_1JXJKmki3NlToY;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/share/-$$Lambda$ShareViewModel$AubuT45aCPsJ_1JXJKmki3NlToY;

    invoke-virtual {p1, v1, v2}, Lio/reactivex/Observable;->subscribe(Lio/reactivex/functions/Consumer;Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    move-result-object p1

    .line 55
    invoke-virtual {v0, p1}, Lio/reactivex/disposables/CompositeDisposable;->add(Lio/reactivex/disposables/Disposable;)Z

    :cond_0
    return-void
.end method

.method public final setDialogClose(Lkotlin/jvm/functions/Function1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/share/SharedActivity;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 50
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/share/ShareViewModel;->dialogClose:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public final setSessionId(Ljava/lang/String;)V
    .locals 0

    .line 47
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/share/ShareViewModel;->sessionId:Ljava/lang/String;

    return-void
.end method
