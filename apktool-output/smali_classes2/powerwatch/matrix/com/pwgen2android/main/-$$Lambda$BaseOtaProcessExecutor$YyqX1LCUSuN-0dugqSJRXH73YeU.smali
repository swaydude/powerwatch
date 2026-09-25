.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$BaseOtaProcessExecutor$YyqX1LCUSuN-0dugqSJRXH73YeU;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Predicate;


# static fields
.field public static final synthetic INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$BaseOtaProcessExecutor$YyqX1LCUSuN-0dugqSJRXH73YeU;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$BaseOtaProcessExecutor$YyqX1LCUSuN-0dugqSJRXH73YeU;

    invoke-direct {v0}, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$BaseOtaProcessExecutor$YyqX1LCUSuN-0dugqSJRXH73YeU;-><init>()V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$BaseOtaProcessExecutor$YyqX1LCUSuN-0dugqSJRXH73YeU;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$BaseOtaProcessExecutor$YyqX1LCUSuN-0dugqSJRXH73YeU;

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

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;

    invoke-static {p1}, Lpowerwatch/matrix/com/pwgen2android/main/BaseOtaProcessExecutor;->lambda$YyqX1LCUSuN-0dugqSJRXH73YeU(Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;)Z

    move-result p1

    return p1
.end method
