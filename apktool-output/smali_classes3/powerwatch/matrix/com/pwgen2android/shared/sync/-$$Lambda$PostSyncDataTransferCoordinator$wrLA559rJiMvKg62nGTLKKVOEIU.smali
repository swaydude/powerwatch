.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$PostSyncDataTransferCoordinator$wrLA559rJiMvKg62nGTLKKVOEIU;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Consumer;


# static fields
.field public static final synthetic INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$PostSyncDataTransferCoordinator$wrLA559rJiMvKg62nGTLKKVOEIU;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$PostSyncDataTransferCoordinator$wrLA559rJiMvKg62nGTLKKVOEIU;

    invoke-direct {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$PostSyncDataTransferCoordinator$wrLA559rJiMvKg62nGTLKKVOEIU;-><init>()V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$PostSyncDataTransferCoordinator$wrLA559rJiMvKg62nGTLKKVOEIU;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$PostSyncDataTransferCoordinator$wrLA559rJiMvKg62nGTLKKVOEIU;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;

    invoke-static {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/PostSyncDataTransferCoordinator;->lambda$wrLA559rJiMvKg62nGTLKKVOEIU(Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;)V

    return-void
.end method
