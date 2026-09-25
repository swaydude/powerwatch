.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/shared/cloud/-$$Lambda$CloudSynchronizerImpl$_tG8q96-jwIDTdZpJqUaogKTjXE;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# static fields
.field public static final synthetic INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/-$$Lambda$CloudSynchronizerImpl$_tG8q96-jwIDTdZpJqUaogKTjXE;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/-$$Lambda$CloudSynchronizerImpl$_tG8q96-jwIDTdZpJqUaogKTjXE;

    invoke-direct {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/-$$Lambda$CloudSynchronizerImpl$_tG8q96-jwIDTdZpJqUaogKTjXE;-><init>()V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/-$$Lambda$CloudSynchronizerImpl$_tG8q96-jwIDTdZpJqUaogKTjXE;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/-$$Lambda$CloudSynchronizerImpl$_tG8q96-jwIDTdZpJqUaogKTjXE;

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

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkStatus;

    invoke-static {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudSynchronizerImpl;->lambda$_tG8q96-jwIDTdZpJqUaogKTjXE(Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkStatus;)Lio/reactivex/ObservableSource;

    move-result-object p1

    return-object p1
.end method
