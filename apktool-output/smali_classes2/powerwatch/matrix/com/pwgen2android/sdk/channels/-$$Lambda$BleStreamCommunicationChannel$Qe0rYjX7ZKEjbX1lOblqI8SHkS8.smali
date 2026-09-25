.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/sdk/channels/-$$Lambda$BleStreamCommunicationChannel$Qe0rYjX7ZKEjbX1lOblqI8SHkS8;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/BiFunction;


# static fields
.field public static final synthetic INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/channels/-$$Lambda$BleStreamCommunicationChannel$Qe0rYjX7ZKEjbX1lOblqI8SHkS8;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/-$$Lambda$BleStreamCommunicationChannel$Qe0rYjX7ZKEjbX1lOblqI8SHkS8;

    invoke-direct {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/-$$Lambda$BleStreamCommunicationChannel$Qe0rYjX7ZKEjbX1lOblqI8SHkS8;-><init>()V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/-$$Lambda$BleStreamCommunicationChannel$Qe0rYjX7ZKEjbX1lOblqI8SHkS8;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/channels/-$$Lambda$BleStreamCommunicationChannel$Qe0rYjX7ZKEjbX1lOblqI8SHkS8;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/stream/ChannelStream;

    check-cast p2, [B

    invoke-static {p1, p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/BleStreamCommunicationChannel;->lambda$Qe0rYjX7ZKEjbX1lOblqI8SHkS8(Lpowerwatch/matrix/com/pwgen2android/sdk/channels/stream/ChannelStream;[B)Lpowerwatch/matrix/com/pwgen2android/sdk/channels/stream/ChannelStream;

    move-result-object p1

    return-object p1
.end method
