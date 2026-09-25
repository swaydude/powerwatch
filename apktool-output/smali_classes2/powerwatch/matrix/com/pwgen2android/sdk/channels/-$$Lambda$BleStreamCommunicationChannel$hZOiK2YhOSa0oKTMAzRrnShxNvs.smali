.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/sdk/channels/-$$Lambda$BleStreamCommunicationChannel$hZOiK2YhOSa0oKTMAzRrnShxNvs;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# static fields
.field public static final synthetic INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/channels/-$$Lambda$BleStreamCommunicationChannel$hZOiK2YhOSa0oKTMAzRrnShxNvs;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/-$$Lambda$BleStreamCommunicationChannel$hZOiK2YhOSa0oKTMAzRrnShxNvs;

    invoke-direct {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/-$$Lambda$BleStreamCommunicationChannel$hZOiK2YhOSa0oKTMAzRrnShxNvs;-><init>()V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/-$$Lambda$BleStreamCommunicationChannel$hZOiK2YhOSa0oKTMAzRrnShxNvs;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/channels/-$$Lambda$BleStreamCommunicationChannel$hZOiK2YhOSa0oKTMAzRrnShxNvs;

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

    check-cast p1, Ljava/util/List;

    invoke-static {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/BleStreamCommunicationChannel;->lambda$hZOiK2YhOSa0oKTMAzRrnShxNvs(Ljava/util/List;)[B

    move-result-object p1

    return-object p1
.end method
