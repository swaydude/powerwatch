.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/-$$Lambda$ReportIssueViewModel$9C2PYc-8LVhFkEh15DWlMRbgBLY;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# static fields
.field public static final synthetic INSTANCE:Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/-$$Lambda$ReportIssueViewModel$9C2PYc-8LVhFkEh15DWlMRbgBLY;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/-$$Lambda$ReportIssueViewModel$9C2PYc-8LVhFkEh15DWlMRbgBLY;

    invoke-direct {v0}, Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/-$$Lambda$ReportIssueViewModel$9C2PYc-8LVhFkEh15DWlMRbgBLY;-><init>()V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/-$$Lambda$ReportIssueViewModel$9C2PYc-8LVhFkEh15DWlMRbgBLY;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/-$$Lambda$ReportIssueViewModel$9C2PYc-8LVhFkEh15DWlMRbgBLY;

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

    check-cast p1, Ljava/util/List;

    invoke-static {p1}, Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/ReportIssueViewModel;->lambda$9C2PYc-8LVhFkEh15DWlMRbgBLY(Ljava/util/List;)Lio/reactivex/MaybeSource;

    move-result-object p1

    return-object p1
.end method
