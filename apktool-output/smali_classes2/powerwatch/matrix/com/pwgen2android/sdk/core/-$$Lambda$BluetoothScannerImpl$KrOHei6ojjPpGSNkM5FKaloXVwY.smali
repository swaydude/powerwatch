.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/sdk/core/-$$Lambda$BluetoothScannerImpl$KrOHei6ojjPpGSNkM5FKaloXVwY;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Predicate;


# static fields
.field public static final synthetic INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/core/-$$Lambda$BluetoothScannerImpl$KrOHei6ojjPpGSNkM5FKaloXVwY;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/core/-$$Lambda$BluetoothScannerImpl$KrOHei6ojjPpGSNkM5FKaloXVwY;

    invoke-direct {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/core/-$$Lambda$BluetoothScannerImpl$KrOHei6ojjPpGSNkM5FKaloXVwY;-><init>()V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/core/-$$Lambda$BluetoothScannerImpl$KrOHei6ojjPpGSNkM5FKaloXVwY;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/core/-$$Lambda$BluetoothScannerImpl$KrOHei6ojjPpGSNkM5FKaloXVwY;

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

    check-cast p1, Landroid/bluetooth/BluetoothDevice;

    invoke-static {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/core/BluetoothScannerImpl;->lambda$KrOHei6ojjPpGSNkM5FKaloXVwY(Landroid/bluetooth/BluetoothDevice;)Z

    move-result p1

    return p1
.end method
