.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/main/battery/-$$Lambda$BatteryNotificationCenter$C4strVLKjMo1SMZMb5FcLtPucek;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Predicate;


# static fields
.field public static final synthetic INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/battery/-$$Lambda$BatteryNotificationCenter$C4strVLKjMo1SMZMb5FcLtPucek;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/main/battery/-$$Lambda$BatteryNotificationCenter$C4strVLKjMo1SMZMb5FcLtPucek;

    invoke-direct {v0}, Lpowerwatch/matrix/com/pwgen2android/main/battery/-$$Lambda$BatteryNotificationCenter$C4strVLKjMo1SMZMb5FcLtPucek;-><init>()V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/main/battery/-$$Lambda$BatteryNotificationCenter$C4strVLKjMo1SMZMb5FcLtPucek;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/battery/-$$Lambda$BatteryNotificationCenter$C4strVLKjMo1SMZMb5FcLtPucek;

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

    check-cast p1, Ljava/util/List;

    invoke-static {p1}, Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryNotificationCenter;->lambda$C4strVLKjMo1SMZMb5FcLtPucek(Ljava/util/List;)Z

    move-result p1

    return p1
.end method
