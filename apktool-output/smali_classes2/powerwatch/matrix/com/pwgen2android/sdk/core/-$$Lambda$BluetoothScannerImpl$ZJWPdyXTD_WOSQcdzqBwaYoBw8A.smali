.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/sdk/core/-$$Lambda$BluetoothScannerImpl$ZJWPdyXTD_WOSQcdzqBwaYoBw8A;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# static fields
.field public static final synthetic INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/core/-$$Lambda$BluetoothScannerImpl$ZJWPdyXTD_WOSQcdzqBwaYoBw8A;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/core/-$$Lambda$BluetoothScannerImpl$ZJWPdyXTD_WOSQcdzqBwaYoBw8A;

    invoke-direct {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/core/-$$Lambda$BluetoothScannerImpl$ZJWPdyXTD_WOSQcdzqBwaYoBw8A;-><init>()V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/core/-$$Lambda$BluetoothScannerImpl$ZJWPdyXTD_WOSQcdzqBwaYoBw8A;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/core/-$$Lambda$BluetoothScannerImpl$ZJWPdyXTD_WOSQcdzqBwaYoBw8A;

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

    check-cast p1, Ljava/lang/Throwable;

    invoke-static {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/core/BluetoothScannerImpl;->lambda$ZJWPdyXTD_WOSQcdzqBwaYoBw8A(Ljava/lang/Throwable;)Lio/reactivex/ObservableSource;

    move-result-object p1

    return-object p1
.end method
