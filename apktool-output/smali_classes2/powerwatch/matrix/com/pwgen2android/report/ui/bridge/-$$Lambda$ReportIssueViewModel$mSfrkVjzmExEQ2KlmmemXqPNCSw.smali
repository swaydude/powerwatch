.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/-$$Lambda$ReportIssueViewModel$mSfrkVjzmExEQ2KlmmemXqPNCSw;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# static fields
.field public static final synthetic INSTANCE:Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/-$$Lambda$ReportIssueViewModel$mSfrkVjzmExEQ2KlmmemXqPNCSw;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/-$$Lambda$ReportIssueViewModel$mSfrkVjzmExEQ2KlmmemXqPNCSw;

    invoke-direct {v0}, Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/-$$Lambda$ReportIssueViewModel$mSfrkVjzmExEQ2KlmmemXqPNCSw;-><init>()V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/-$$Lambda$ReportIssueViewModel$mSfrkVjzmExEQ2KlmmemXqPNCSw;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/-$$Lambda$ReportIssueViewModel$mSfrkVjzmExEQ2KlmmemXqPNCSw;

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

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/report/model/UserEnvironment;

    invoke-static {p1}, Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/ReportIssueViewModel;->lambda$mSfrkVjzmExEQ2KlmmemXqPNCSw(Lpowerwatch/matrix/com/pwgen2android/report/model/UserEnvironment;)Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/Envelope;

    move-result-object p1

    return-object p1
.end method
