.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$FontUpdateController$7u153K22eZYormyD7KlH6B36wY4;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Predicate;


# static fields
.field public static final synthetic INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$FontUpdateController$7u153K22eZYormyD7KlH6B36wY4;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$FontUpdateController$7u153K22eZYormyD7KlH6B36wY4;

    invoke-direct {v0}, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$FontUpdateController$7u153K22eZYormyD7KlH6B36wY4;-><init>()V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$FontUpdateController$7u153K22eZYormyD7KlH6B36wY4;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$FontUpdateController$7u153K22eZYormyD7KlH6B36wY4;

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

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult$FontUpdateProgress;

    invoke-static {p1}, Lpowerwatch/matrix/com/pwgen2android/main/FontUpdateController;->lambda$7u153K22eZYormyD7KlH6B36wY4(Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult$FontUpdateProgress;)Z

    move-result p1

    return p1
.end method
