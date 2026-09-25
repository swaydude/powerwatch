.class public final Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/EmptyUserSingleSource;
.super Ljava/lang/Object;
.source "EmptyUserSingleSource.kt"

# interfaces
.implements Lio/reactivex/SingleSource;
.implements Lorg/reactivestreams/Publisher;


# static fields
.field public static final INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/EmptyUserSingleSource;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/EmptyUserSingleSource;

    invoke-direct {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/EmptyUserSingleSource;-><init>()V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/EmptyUserSingleSource;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/EmptyUserSingleSource;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public subscribe(Lio/reactivex/SingleObserver;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/SingleObserver<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Lio/reactivex/SingleObserver;->onSubscribe(Lio/reactivex/disposables/Disposable;)V

    return-void
.end method

.method public subscribe(Lorg/reactivestreams/Subscriber;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/reactivestreams/Subscriber<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;",
            ">;)V"
        }
    .end annotation

    return-void
.end method