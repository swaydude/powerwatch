.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$PostSyncDataTransferCoordinator$LWwLb2EoDw9Q7TLtPu4UvC7Yu9Q;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/shared/sync/PostSyncDataTransferCoordinator;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/sync/PostSyncDataTransferCoordinator;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$PostSyncDataTransferCoordinator$LWwLb2EoDw9Q7TLtPu4UvC7Yu9Q;->f$0:Lpowerwatch/matrix/com/pwgen2android/shared/sync/PostSyncDataTransferCoordinator;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$PostSyncDataTransferCoordinator$LWwLb2EoDw9Q7TLtPu4UvC7Yu9Q;->f$0:Lpowerwatch/matrix/com/pwgen2android/shared/sync/PostSyncDataTransferCoordinator;

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/fonts/FontUpdateInfo;

    invoke-static {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/PostSyncDataTransferCoordinator;->lambda$LWwLb2EoDw9Q7TLtPu4UvC7Yu9Q(Lpowerwatch/matrix/com/pwgen2android/shared/sync/PostSyncDataTransferCoordinator;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/fonts/FontUpdateInfo;)Lio/reactivex/ObservableSource;

    move-result-object p1

    return-object p1
.end method
