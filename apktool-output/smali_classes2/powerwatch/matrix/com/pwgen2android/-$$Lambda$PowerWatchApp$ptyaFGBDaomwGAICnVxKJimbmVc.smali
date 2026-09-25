.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/-$$Lambda$PowerWatchApp$ptyaFGBDaomwGAICnVxKJimbmVc;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Consumer;


# static fields
.field public static final synthetic INSTANCE:Lpowerwatch/matrix/com/pwgen2android/-$$Lambda$PowerWatchApp$ptyaFGBDaomwGAICnVxKJimbmVc;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/-$$Lambda$PowerWatchApp$ptyaFGBDaomwGAICnVxKJimbmVc;

    invoke-direct {v0}, Lpowerwatch/matrix/com/pwgen2android/-$$Lambda$PowerWatchApp$ptyaFGBDaomwGAICnVxKJimbmVc;-><init>()V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/-$$Lambda$PowerWatchApp$ptyaFGBDaomwGAICnVxKJimbmVc;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/-$$Lambda$PowerWatchApp$ptyaFGBDaomwGAICnVxKJimbmVc;

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

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;

    invoke-static {p1}, Lpowerwatch/matrix/com/pwgen2android/PowerWatchApp;->lambda$ptyaFGBDaomwGAICnVxKJimbmVc(Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;)V

    return-void
.end method
