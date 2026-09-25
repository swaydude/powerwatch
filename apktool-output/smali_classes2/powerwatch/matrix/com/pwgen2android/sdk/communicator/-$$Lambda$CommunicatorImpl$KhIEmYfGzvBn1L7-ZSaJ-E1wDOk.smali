.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/-$$Lambda$CommunicatorImpl$KhIEmYfGzvBn1L7-ZSaJ-E1wDOk;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# static fields
.field public static final synthetic INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/-$$Lambda$CommunicatorImpl$KhIEmYfGzvBn1L7-ZSaJ-E1wDOk;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/-$$Lambda$CommunicatorImpl$KhIEmYfGzvBn1L7-ZSaJ-E1wDOk;

    invoke-direct {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/-$$Lambda$CommunicatorImpl$KhIEmYfGzvBn1L7-ZSaJ-E1wDOk;-><init>()V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/-$$Lambda$CommunicatorImpl$KhIEmYfGzvBn1L7-ZSaJ-E1wDOk;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/-$$Lambda$CommunicatorImpl$KhIEmYfGzvBn1L7-ZSaJ-E1wDOk;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Device;

    invoke-static {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicatorImpl;->lambda$KhIEmYfGzvBn1L7-ZSaJ-E1wDOk(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Device;)Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

    move-result-object p1

    return-object p1
.end method
