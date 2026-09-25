.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/main/update/-$$Lambda$FirmwareAvailableViewModel$6ajYOG-tBjRzosXQGczJRwQPKJ4;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Predicate;


# static fields
.field public static final synthetic INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/update/-$$Lambda$FirmwareAvailableViewModel$6ajYOG-tBjRzosXQGczJRwQPKJ4;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/main/update/-$$Lambda$FirmwareAvailableViewModel$6ajYOG-tBjRzosXQGczJRwQPKJ4;

    invoke-direct {v0}, Lpowerwatch/matrix/com/pwgen2android/main/update/-$$Lambda$FirmwareAvailableViewModel$6ajYOG-tBjRzosXQGczJRwQPKJ4;-><init>()V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/main/update/-$$Lambda$FirmwareAvailableViewModel$6ajYOG-tBjRzosXQGczJRwQPKJ4;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/update/-$$Lambda$FirmwareAvailableViewModel$6ajYOG-tBjRzosXQGczJRwQPKJ4;

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

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;

    invoke-static {p1}, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->lambda$6ajYOG-tBjRzosXQGczJRwQPKJ4(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;)Z

    move-result p1

    return p1
.end method
