.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/shared/logger/-$$Lambda$PWLogCollectorExtensionImpl$hLgJr3pvdfh9OEMFdPqQEmN58ME;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Predicate;


# static fields
.field public static final synthetic INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/logger/-$$Lambda$PWLogCollectorExtensionImpl$hLgJr3pvdfh9OEMFdPqQEmN58ME;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/-$$Lambda$PWLogCollectorExtensionImpl$hLgJr3pvdfh9OEMFdPqQEmN58ME;

    invoke-direct {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/-$$Lambda$PWLogCollectorExtensionImpl$hLgJr3pvdfh9OEMFdPqQEmN58ME;-><init>()V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/-$$Lambda$PWLogCollectorExtensionImpl$hLgJr3pvdfh9OEMFdPqQEmN58ME;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/logger/-$$Lambda$PWLogCollectorExtensionImpl$hLgJr3pvdfh9OEMFdPqQEmN58ME;

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

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLog;

    invoke-static {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLogCollectorExtensionImpl;->lambda$hLgJr3pvdfh9OEMFdPqQEmN58ME(Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLog;)Z

    move-result p1

    return p1
.end method
