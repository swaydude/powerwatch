.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/ota/-$$Lambda$OtaCommunicatorImpl$m1g3ScQpHdkgg8hVf4mHzg9NFKY;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# static fields
.field public static final synthetic INSTANCE:Lpowerwatch/matrix/com/pwgen2android/ota/-$$Lambda$OtaCommunicatorImpl$m1g3ScQpHdkgg8hVf4mHzg9NFKY;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/ota/-$$Lambda$OtaCommunicatorImpl$m1g3ScQpHdkgg8hVf4mHzg9NFKY;

    invoke-direct {v0}, Lpowerwatch/matrix/com/pwgen2android/ota/-$$Lambda$OtaCommunicatorImpl$m1g3ScQpHdkgg8hVf4mHzg9NFKY;-><init>()V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/ota/-$$Lambda$OtaCommunicatorImpl$m1g3ScQpHdkgg8hVf4mHzg9NFKY;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/ota/-$$Lambda$OtaCommunicatorImpl$m1g3ScQpHdkgg8hVf4mHzg9NFKY;

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

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;

    invoke-static {p1}, Lpowerwatch/matrix/com/pwgen2android/ota/OtaCommunicatorImpl;->lambda$m1g3ScQpHdkgg8hVf4mHzg9NFKY(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;)[B

    move-result-object p1

    return-object p1
.end method
