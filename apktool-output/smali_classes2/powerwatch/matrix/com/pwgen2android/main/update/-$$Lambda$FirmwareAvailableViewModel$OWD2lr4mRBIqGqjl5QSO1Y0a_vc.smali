.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/main/update/-$$Lambda$FirmwareAvailableViewModel$OWD2lr4mRBIqGqjl5QSO1Y0a_vc;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Predicate;


# static fields
.field public static final synthetic INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/update/-$$Lambda$FirmwareAvailableViewModel$OWD2lr4mRBIqGqjl5QSO1Y0a_vc;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/main/update/-$$Lambda$FirmwareAvailableViewModel$OWD2lr4mRBIqGqjl5QSO1Y0a_vc;

    invoke-direct {v0}, Lpowerwatch/matrix/com/pwgen2android/main/update/-$$Lambda$FirmwareAvailableViewModel$OWD2lr4mRBIqGqjl5QSO1Y0a_vc;-><init>()V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/main/update/-$$Lambda$FirmwareAvailableViewModel$OWD2lr4mRBIqGqjl5QSO1Y0a_vc;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/update/-$$Lambda$FirmwareAvailableViewModel$OWD2lr4mRBIqGqjl5QSO1Y0a_vc;

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

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;

    invoke-static {p1}, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->lambda$OWD2lr4mRBIqGqjl5QSO1Y0a_vc(Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;)Z

    move-result p1

    return p1
.end method
