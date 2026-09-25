.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/main/battery/-$$Lambda$MockProvider$XQeN2MT0F2farxtvT1L-XSDOk3Q;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# static fields
.field public static final synthetic INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/battery/-$$Lambda$MockProvider$XQeN2MT0F2farxtvT1L-XSDOk3Q;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/main/battery/-$$Lambda$MockProvider$XQeN2MT0F2farxtvT1L-XSDOk3Q;

    invoke-direct {v0}, Lpowerwatch/matrix/com/pwgen2android/main/battery/-$$Lambda$MockProvider$XQeN2MT0F2farxtvT1L-XSDOk3Q;-><init>()V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/main/battery/-$$Lambda$MockProvider$XQeN2MT0F2farxtvT1L-XSDOk3Q;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/battery/-$$Lambda$MockProvider$XQeN2MT0F2farxtvT1L-XSDOk3Q;

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

    check-cast p1, Ljava/lang/Integer;

    invoke-static {p1}, Lpowerwatch/matrix/com/pwgen2android/main/battery/MockProvider;->lambda$XQeN2MT0F2farxtvT1L-XSDOk3Q(Ljava/lang/Integer;)Lio/reactivex/ObservableSource;

    move-result-object p1

    return-object p1
.end method
