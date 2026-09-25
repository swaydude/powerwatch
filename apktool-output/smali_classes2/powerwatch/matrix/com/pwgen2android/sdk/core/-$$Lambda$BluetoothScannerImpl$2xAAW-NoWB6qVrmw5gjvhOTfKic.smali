.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/sdk/core/-$$Lambda$BluetoothScannerImpl$2xAAW-NoWB6qVrmw5gjvhOTfKic;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Predicate;


# instance fields
.field public final synthetic f$0:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/core/-$$Lambda$BluetoothScannerImpl$2xAAW-NoWB6qVrmw5gjvhOTfKic;->f$0:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final test(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/core/-$$Lambda$BluetoothScannerImpl$2xAAW-NoWB6qVrmw5gjvhOTfKic;->f$0:Ljava/util/List;

    check-cast p1, Landroid/bluetooth/BluetoothDevice;

    invoke-static {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/core/BluetoothScannerImpl;->lambda$2xAAW-NoWB6qVrmw5gjvhOTfKic(Ljava/util/List;Landroid/bluetooth/BluetoothDevice;)Z

    move-result p1

    return p1
.end method
