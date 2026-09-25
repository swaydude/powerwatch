.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/-$$Lambda$BleScanningTechnology$ntmpL5E3ljs9dgDG4N5VupvGQFk;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Predicate;


# static fields
.field public static final synthetic INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/-$$Lambda$BleScanningTechnology$ntmpL5E3ljs9dgDG4N5VupvGQFk;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/-$$Lambda$BleScanningTechnology$ntmpL5E3ljs9dgDG4N5VupvGQFk;

    invoke-direct {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/-$$Lambda$BleScanningTechnology$ntmpL5E3ljs9dgDG4N5VupvGQFk;-><init>()V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/-$$Lambda$BleScanningTechnology$ntmpL5E3ljs9dgDG4N5VupvGQFk;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/-$$Lambda$BleScanningTechnology$ntmpL5E3ljs9dgDG4N5VupvGQFk;

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

    check-cast p1, Lcom/polidea/rxandroidble2/scan/ScanResult;

    invoke-static {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleScanningTechnology;->lambda$ntmpL5E3ljs9dgDG4N5VupvGQFk(Lcom/polidea/rxandroidble2/scan/ScanResult;)Z

    move-result p1

    return p1
.end method
