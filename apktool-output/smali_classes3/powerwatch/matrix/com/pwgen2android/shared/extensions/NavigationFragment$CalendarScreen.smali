.class public final Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationFragment$CalendarScreen;
.super Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationFragment;
.source "NavigationExtensions.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "CalendarScreen"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationFragment$CalendarScreen;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationFragment;",
        "()V",
        "app_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x5,
        0x1
    }
    xi = 0x30
.end annotation


# static fields
.field public static final INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationFragment$CalendarScreen;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationFragment$CalendarScreen;

    invoke-direct {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationFragment$CalendarScreen;-><init>()V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationFragment$CalendarScreen;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationFragment$CalendarScreen;

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    .line 32
    const-class v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/CalendarFragment;

    invoke-static {v0}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v0

    invoke-interface {v0}, Lkotlin/reflect/KClass;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationFragment;-><init>(Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method
