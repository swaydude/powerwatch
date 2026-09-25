.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/sdk/channels/-$$Lambda$BleStreamCommunicationChannel$qIHc3vlNMGFNvDbSXDTPGKkfguM;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# static fields
.field public static final synthetic INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/channels/-$$Lambda$BleStreamCommunicationChannel$qIHc3vlNMGFNvDbSXDTPGKkfguM;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/-$$Lambda$BleStreamCommunicationChannel$qIHc3vlNMGFNvDbSXDTPGKkfguM;

    invoke-direct {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/-$$Lambda$BleStreamCommunicationChannel$qIHc3vlNMGFNvDbSXDTPGKkfguM;-><init>()V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/-$$Lambda$BleStreamCommunicationChannel$qIHc3vlNMGFNvDbSXDTPGKkfguM;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/channels/-$$Lambda$BleStreamCommunicationChannel$qIHc3vlNMGFNvDbSXDTPGKkfguM;

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

    invoke-static {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/BleStreamCommunicationChannel;->lambda$qIHc3vlNMGFNvDbSXDTPGKkfguM(Ljava/util/List;)[B

    move-result-object p1

    return-object p1
.end method
