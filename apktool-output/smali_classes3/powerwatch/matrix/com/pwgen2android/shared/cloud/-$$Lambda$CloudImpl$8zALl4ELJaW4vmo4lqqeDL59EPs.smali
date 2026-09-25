.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/shared/cloud/-$$Lambda$CloudImpl$8zALl4ELJaW4vmo4lqqeDL59EPs;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# static fields
.field public static final synthetic INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/-$$Lambda$CloudImpl$8zALl4ELJaW4vmo4lqqeDL59EPs;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/-$$Lambda$CloudImpl$8zALl4ELJaW4vmo4lqqeDL59EPs;

    invoke-direct {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/-$$Lambda$CloudImpl$8zALl4ELJaW4vmo4lqqeDL59EPs;-><init>()V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/-$$Lambda$CloudImpl$8zALl4ELJaW4vmo4lqqeDL59EPs;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/-$$Lambda$CloudImpl$8zALl4ELJaW4vmo4lqqeDL59EPs;

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

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/AuthHeaderData;

    invoke-static {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudImpl;->lambda$8zALl4ELJaW4vmo4lqqeDL59EPs(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/AuthHeaderData;)Lio/reactivex/ObservableSource;

    move-result-object p1

    return-object p1
.end method
