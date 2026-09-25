.class public final Lpowerwatch/matrix/com/pwgen2android/fcm/FirebaseTokenProviderImpl;
.super Ljava/lang/Object;
.source "FirebaseTokenProvider.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/fcm/PushMessagingTokenProvider;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00068VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0008\u0010\tR\u001c\u0010\n\u001a\u0010\u0012\u000c\u0012\n \u000c*\u0004\u0018\u00010\u00070\u00070\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/fcm/FirebaseTokenProviderImpl;",
        "Lpowerwatch/matrix/com/pwgen2android/fcm/PushMessagingTokenProvider;",
        "context",
        "Landroid/content/Context;",
        "(Landroid/content/Context;)V",
        "token",
        "Lio/reactivex/Observable;",
        "",
        "getToken",
        "()Lio/reactivex/Observable;",
        "tokenSubject",
        "Lio/reactivex/subjects/BehaviorSubject;",
        "kotlin.jvm.PlatformType",
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
.field private final tokenSubject:Lio/reactivex/subjects/BehaviorSubject;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/subjects/BehaviorSubject<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    invoke-static {}, Lio/reactivex/subjects/BehaviorSubject;->create()Lio/reactivex/subjects/BehaviorSubject;

    move-result-object v0

    const-string v1, "create<String>()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/fcm/FirebaseTokenProviderImpl;->tokenSubject:Lio/reactivex/subjects/BehaviorSubject;

    # PATCHED: removed FirebaseInstanceId call to avoid crash when google-services.json missing

    .line 43
    invoke-static {p1}, Landroidx/localbroadcastmanager/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroidx/localbroadcastmanager/content/LocalBroadcastManager;

    move-result-object p1

    .line 44
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/fcm/FirebaseTokenProviderImpl$2;

    invoke-direct {v0, p0}, Lpowerwatch/matrix/com/pwgen2android/fcm/FirebaseTokenProviderImpl$2;-><init>(Lpowerwatch/matrix/com/pwgen2android/fcm/FirebaseTokenProviderImpl;)V

    check-cast v0, Landroid/content/BroadcastReceiver;

    .line 52
    new-instance v1, Landroid/content/IntentFilter;

    const-string v2, "com.example.slobodanpavic.consultations.TOKEN_REFRESHED"

    invoke-direct {v1, v2}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 44
    invoke-virtual {p1, v0, v1}, Landroidx/localbroadcastmanager/content/LocalBroadcastManager;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V

    return-void
.end method

.method private static final _init_$lambda-0(Lpowerwatch/matrix/com/pwgen2android/fcm/FirebaseTokenProviderImpl;Lcom/google/android/gms/tasks/Task;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "task"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 36
    :cond_0
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/firebase/iid/InstanceIdResult;

    if-nez p1, :cond_1

    const/4 p1, 0x0

    goto :goto_0

    :cond_1
    invoke-interface {p1}, Lcom/google/firebase/iid/InstanceIdResult;->getToken()Ljava/lang/String;

    move-result-object p1

    :goto_0
    if-eqz p1, :cond_2

    .line 38
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/fcm/FirebaseTokenProviderImpl;->tokenSubject:Lio/reactivex/subjects/BehaviorSubject;

    invoke-virtual {p0, p1}, Lio/reactivex/subjects/BehaviorSubject;->onNext(Ljava/lang/Object;)V

    :cond_2
    return-void
.end method

.method public static final synthetic access$getTokenSubject$p(Lpowerwatch/matrix/com/pwgen2android/fcm/FirebaseTokenProviderImpl;)Lio/reactivex/subjects/BehaviorSubject;
    .locals 0

    .line 19
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/fcm/FirebaseTokenProviderImpl;->tokenSubject:Lio/reactivex/subjects/BehaviorSubject;

    return-object p0
.end method

.method public static synthetic lambda$hv0Tq4tGyAuaW3qhcOA81rEMHJc(Lpowerwatch/matrix/com/pwgen2android/fcm/FirebaseTokenProviderImpl;Lcom/google/android/gms/tasks/Task;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/fcm/FirebaseTokenProviderImpl;->_init_$lambda-0(Lpowerwatch/matrix/com/pwgen2android/fcm/FirebaseTokenProviderImpl;Lcom/google/android/gms/tasks/Task;)V

    return-void
.end method


# virtual methods
.method public getToken()Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 25
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/fcm/FirebaseTokenProviderImpl;->tokenSubject:Lio/reactivex/subjects/BehaviorSubject;

    check-cast v0, Lio/reactivex/Observable;

    return-object v0
.end method
