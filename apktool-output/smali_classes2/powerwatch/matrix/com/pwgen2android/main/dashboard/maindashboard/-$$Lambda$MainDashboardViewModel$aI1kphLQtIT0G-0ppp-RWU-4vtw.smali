.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/-$$Lambda$MainDashboardViewModel$aI1kphLQtIT0G-0ppp-RWU-4vtw;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# static fields
.field public static final synthetic INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/-$$Lambda$MainDashboardViewModel$aI1kphLQtIT0G-0ppp-RWU-4vtw;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/-$$Lambda$MainDashboardViewModel$aI1kphLQtIT0G-0ppp-RWU-4vtw;

    invoke-direct {v0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/-$$Lambda$MainDashboardViewModel$aI1kphLQtIT0G-0ppp-RWU-4vtw;-><init>()V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/-$$Lambda$MainDashboardViewModel$aI1kphLQtIT0G-0ppp-RWU-4vtw;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/-$$Lambda$MainDashboardViewModel$aI1kphLQtIT0G-0ppp-RWU-4vtw;

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

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothState;

    invoke-static {p1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;->lambda$aI1kphLQtIT0G-0ppp-RWU-4vtw(Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothState;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
