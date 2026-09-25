.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/main/update/-$$Lambda$FirmwareAvailableViewModel$21FprlhyENUJ5kv6rkvlTmYmeBM;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/BiFunction;


# static fields
.field public static final synthetic INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/update/-$$Lambda$FirmwareAvailableViewModel$21FprlhyENUJ5kv6rkvlTmYmeBM;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/main/update/-$$Lambda$FirmwareAvailableViewModel$21FprlhyENUJ5kv6rkvlTmYmeBM;

    invoke-direct {v0}, Lpowerwatch/matrix/com/pwgen2android/main/update/-$$Lambda$FirmwareAvailableViewModel$21FprlhyENUJ5kv6rkvlTmYmeBM;-><init>()V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/main/update/-$$Lambda$FirmwareAvailableViewModel$21FprlhyENUJ5kv6rkvlTmYmeBM;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/update/-$$Lambda$FirmwareAvailableViewModel$21FprlhyENUJ5kv6rkvlTmYmeBM;

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

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/main/update/UpdatePreconditionsState;

    check-cast p2, Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;

    invoke-static {p1, p2}, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->lambda$21FprlhyENUJ5kv6rkvlTmYmeBM(Lpowerwatch/matrix/com/pwgen2android/main/update/UpdatePreconditionsState;Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;)Lkotlin/Pair;

    move-result-object p1

    return-object p1
.end method
