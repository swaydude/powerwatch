.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/-$$Lambda$CommunicatorImpl$3LYjFY5A8_0heI0O7iTwn5b5ucs;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Predicate;


# static fields
.field public static final synthetic INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/-$$Lambda$CommunicatorImpl$3LYjFY5A8_0heI0O7iTwn5b5ucs;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/-$$Lambda$CommunicatorImpl$3LYjFY5A8_0heI0O7iTwn5b5ucs;

    invoke-direct {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/-$$Lambda$CommunicatorImpl$3LYjFY5A8_0heI0O7iTwn5b5ucs;-><init>()V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/-$$Lambda$CommunicatorImpl$3LYjFY5A8_0heI0O7iTwn5b5ucs;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/-$$Lambda$CommunicatorImpl$3LYjFY5A8_0heI0O7iTwn5b5ucs;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final test(Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

    invoke-static {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicatorImpl;->lambda$3LYjFY5A8_0heI0O7iTwn5b5ucs(Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)Z

    move-result p1

    return p1
.end method
