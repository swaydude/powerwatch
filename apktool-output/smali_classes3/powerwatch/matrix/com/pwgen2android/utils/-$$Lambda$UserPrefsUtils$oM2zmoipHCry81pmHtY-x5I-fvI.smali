.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/utils/-$$Lambda$UserPrefsUtils$oM2zmoipHCry81pmHtY-x5I-fvI;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# static fields
.field public static final synthetic INSTANCE:Lpowerwatch/matrix/com/pwgen2android/utils/-$$Lambda$UserPrefsUtils$oM2zmoipHCry81pmHtY-x5I-fvI;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/utils/-$$Lambda$UserPrefsUtils$oM2zmoipHCry81pmHtY-x5I-fvI;

    invoke-direct {v0}, Lpowerwatch/matrix/com/pwgen2android/utils/-$$Lambda$UserPrefsUtils$oM2zmoipHCry81pmHtY-x5I-fvI;-><init>()V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/utils/-$$Lambda$UserPrefsUtils$oM2zmoipHCry81pmHtY-x5I-fvI;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/utils/-$$Lambda$UserPrefsUtils$oM2zmoipHCry81pmHtY-x5I-fvI;

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

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;

    invoke-static {p1}, Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;->lambda$oM2zmoipHCry81pmHtY-x5I-fvI(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;)Lpowerwatch/matrix/com/pwgen2android/utils/LanguageInfo;

    move-result-object p1

    return-object p1
.end method
