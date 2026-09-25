.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/-$$Lambda$MetricsRepositoryImpl$WuViSgV5y2ZqDliY4XBsaQLcKBg;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Consumer;


# static fields
.field public static final synthetic INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/-$$Lambda$MetricsRepositoryImpl$WuViSgV5y2ZqDliY4XBsaQLcKBg;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/-$$Lambda$MetricsRepositoryImpl$WuViSgV5y2ZqDliY4XBsaQLcKBg;

    invoke-direct {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/-$$Lambda$MetricsRepositoryImpl$WuViSgV5y2ZqDliY4XBsaQLcKBg;-><init>()V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/-$$Lambda$MetricsRepositoryImpl$WuViSgV5y2ZqDliY4XBsaQLcKBg;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/-$$Lambda$MetricsRepositoryImpl$WuViSgV5y2ZqDliY4XBsaQLcKBg;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/LogEvent;

    invoke-static {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepositoryImpl;->lambda$WuViSgV5y2ZqDliY4XBsaQLcKBg(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/LogEvent;)V

    return-void
.end method
