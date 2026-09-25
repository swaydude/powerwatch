.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/main/update/-$$Lambda$FirmwareAvailableViewModel$aZjBXGZ8an7TepvqRwyhWy42tJo;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function3;


# static fields
.field public static final synthetic INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/update/-$$Lambda$FirmwareAvailableViewModel$aZjBXGZ8an7TepvqRwyhWy42tJo;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/main/update/-$$Lambda$FirmwareAvailableViewModel$aZjBXGZ8an7TepvqRwyhWy42tJo;

    invoke-direct {v0}, Lpowerwatch/matrix/com/pwgen2android/main/update/-$$Lambda$FirmwareAvailableViewModel$aZjBXGZ8an7TepvqRwyhWy42tJo;-><init>()V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/main/update/-$$Lambda$FirmwareAvailableViewModel$aZjBXGZ8an7TepvqRwyhWy42tJo;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/update/-$$Lambda$FirmwareAvailableViewModel$aZjBXGZ8an7TepvqRwyhWy42tJo;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothState;

    check-cast p2, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

    check-cast p3, Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkStatus;

    invoke-static {p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->lambda$aZjBXGZ8an7TepvqRwyhWy42tJo(Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothState;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkStatus;)Lpowerwatch/matrix/com/pwgen2android/main/update/UpdatePreconditionsState;

    move-result-object p1

    return-object p1
.end method
