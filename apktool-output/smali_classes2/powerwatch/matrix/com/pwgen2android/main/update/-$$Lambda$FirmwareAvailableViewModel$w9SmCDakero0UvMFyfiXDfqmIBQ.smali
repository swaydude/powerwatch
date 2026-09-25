.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/main/update/-$$Lambda$FirmwareAvailableViewModel$w9SmCDakero0UvMFyfiXDfqmIBQ;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# static fields
.field public static final synthetic INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/update/-$$Lambda$FirmwareAvailableViewModel$w9SmCDakero0UvMFyfiXDfqmIBQ;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/main/update/-$$Lambda$FirmwareAvailableViewModel$w9SmCDakero0UvMFyfiXDfqmIBQ;

    invoke-direct {v0}, Lpowerwatch/matrix/com/pwgen2android/main/update/-$$Lambda$FirmwareAvailableViewModel$w9SmCDakero0UvMFyfiXDfqmIBQ;-><init>()V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/main/update/-$$Lambda$FirmwareAvailableViewModel$w9SmCDakero0UvMFyfiXDfqmIBQ;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/update/-$$Lambda$FirmwareAvailableViewModel$w9SmCDakero0UvMFyfiXDfqmIBQ;

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

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/main/update/UpdatePreconditionsState;

    invoke-static {p1}, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->lambda$w9SmCDakero0UvMFyfiXDfqmIBQ(Lpowerwatch/matrix/com/pwgen2android/main/update/UpdatePreconditionsState;)Lio/reactivex/ObservableSource;

    move-result-object p1

    return-object p1
.end method
