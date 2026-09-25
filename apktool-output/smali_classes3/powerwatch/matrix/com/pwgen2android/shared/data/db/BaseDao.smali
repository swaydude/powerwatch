.class public interface abstract Lpowerwatch/matrix/com/pwgen2android/shared/data/db/BaseDao;
.super Ljava/lang/Object;
.source "BaseDao.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        "ID:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008f\u0018\u0000*\u0004\u0008\u0000\u0010\u0001*\u0004\u0008\u0001\u0010\u00022\u00020\u0003J\u0015\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\u0007J\u0015\u0010\u0008\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\nJ\u0014\u0010\u000b\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\r0\u000cH&J\u0008\u0010\u000e\u001a\u00020\u000fH&J\u0015\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00028\u0001H&\u00a2\u0006\u0002\u0010\u0007J\u0015\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00028\u0001H&\u00a2\u0006\u0002\u0010\nJ\u001b\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00142\u0006\u0010\u0011\u001a\u00028\u0001H&\u00a2\u0006\u0002\u0010\u0015\u00a8\u0006\u0016"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/db/BaseDao;",
        "T",
        "ID",
        "",
        "add",
        "",
        "item",
        "(Ljava/lang/Object;)V",
        "addCompletable",
        "Lio/reactivex/Completable;",
        "(Ljava/lang/Object;)Lio/reactivex/Completable;",
        "all",
        "Lio/reactivex/Single;",
        "",
        "count",
        "",
        "delete",
        "id",
        "deleteCompletable",
        "get",
        "Lio/reactivex/Maybe;",
        "(Ljava/lang/Object;)Lio/reactivex/Maybe;",
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


# virtual methods
.method public abstract add(Ljava/lang/Object;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation
.end method

.method public abstract addCompletable(Ljava/lang/Object;)Lio/reactivex/Completable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)",
            "Lio/reactivex/Completable;"
        }
    .end annotation
.end method

.method public abstract all()Lio/reactivex/Single;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Single<",
            "Ljava/util/List<",
            "TT;>;>;"
        }
    .end annotation
.end method

.method public abstract count()J
.end method

.method public abstract delete(Ljava/lang/Object;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TID;)V"
        }
    .end annotation
.end method

.method public abstract deleteCompletable(Ljava/lang/Object;)Lio/reactivex/Completable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TID;)",
            "Lio/reactivex/Completable;"
        }
    .end annotation
.end method

.method public abstract get(Ljava/lang/Object;)Lio/reactivex/Maybe;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TID;)",
            "Lio/reactivex/Maybe<",
            "TT;>;"
        }
    .end annotation
.end method
