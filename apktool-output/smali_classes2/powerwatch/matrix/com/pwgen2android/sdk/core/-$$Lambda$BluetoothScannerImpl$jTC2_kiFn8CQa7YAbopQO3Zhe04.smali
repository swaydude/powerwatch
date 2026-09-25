.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/sdk/core/-$$Lambda$BluetoothScannerImpl$jTC2_kiFn8CQa7YAbopQO3Zhe04;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Consumer;


# static fields
.field public static final synthetic INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/core/-$$Lambda$BluetoothScannerImpl$jTC2_kiFn8CQa7YAbopQO3Zhe04;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/core/-$$Lambda$BluetoothScannerImpl$jTC2_kiFn8CQa7YAbopQO3Zhe04;

    invoke-direct {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/core/-$$Lambda$BluetoothScannerImpl$jTC2_kiFn8CQa7YAbopQO3Zhe04;-><init>()V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/core/-$$Lambda$BluetoothScannerImpl$jTC2_kiFn8CQa7YAbopQO3Zhe04;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/core/-$$Lambda$BluetoothScannerImpl$jTC2_kiFn8CQa7YAbopQO3Zhe04;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Landroid/bluetooth/BluetoothDevice;

    invoke-static {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/core/BluetoothScannerImpl;->lambda$jTC2_kiFn8CQa7YAbopQO3Zhe04(Landroid/bluetooth/BluetoothDevice;)V

    return-void
.end method
