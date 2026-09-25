.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/-$$Lambda$DashedCircleView$dw-amE92ejJJDjVqbZ2tNJKenYg;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Landroid/animation/TypeEvaluator;


# static fields
.field public static final synthetic INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/-$$Lambda$DashedCircleView$dw-amE92ejJJDjVqbZ2tNJKenYg;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/-$$Lambda$DashedCircleView$dw-amE92ejJJDjVqbZ2tNJKenYg;

    invoke-direct {v0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/-$$Lambda$DashedCircleView$dw-amE92ejJJDjVqbZ2tNJKenYg;-><init>()V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/-$$Lambda$DashedCircleView$dw-amE92ejJJDjVqbZ2tNJKenYg;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/-$$Lambda$DashedCircleView$dw-amE92ejJJDjVqbZ2tNJKenYg;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final evaluate(FLjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p2, Ljava/lang/Double;

    check-cast p3, Ljava/lang/Double;

    invoke-static {p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/DashedCircleView;->lambda$dw-amE92ejJJDjVqbZ2tNJKenYg(FLjava/lang/Double;Ljava/lang/Double;)Ljava/lang/Double;

    move-result-object p1

    return-object p1
.end method
