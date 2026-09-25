.class public interface abstract Lpowerwatch/matrix/com/pwgen2android/secret/Repository;
.super Ljava/lang/Object;
.source "SecretScreenFragment.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<ENTITY:",
        "Ljava/lang/Object;",
        "ID:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u001c\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008f\u0018\u0000*\u0004\u0008\u0000\u0010\u0001*\u0004\u0008\u0001\u0010\u00022\u00020\u0003J\u0008\u0010\u0004\u001a\u00020\u0005H&J\u001b\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\u0008\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\tJ\"\u0010\n\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u000b0\u00072\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00028\u00000\rH&J\u0015\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00028\u0001H&\u00a2\u0006\u0002\u0010\u0011J\u0014\u0010\u0012\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u000b0\u0013H&J\u001b\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00152\u0006\u0010\u0010\u001a\u00028\u0001H&\u00a2\u0006\u0002\u0010\u0016J\u001b\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\u0008\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\tJ\"\u0010\u0018\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u000b0\u00072\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00028\u00000\rH&\u00a8\u0006\u0019"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/secret/Repository;",
        "ENTITY",
        "ID",
        "",
        "count",
        "",
        "delete",
        "Lio/reactivex/Single;",
        "entity",
        "(Ljava/lang/Object;)Lio/reactivex/Single;",
        "deleteAll",
        "",
        "entities",
        "",
        "existsById",
        "",
        "id",
        "(Ljava/lang/Object;)Z",
        "findAll",
        "Lio/reactivex/Observable;",
        "findById",
        "Lio/reactivex/Maybe;",
        "(Ljava/lang/Object;)Lio/reactivex/Maybe;",
        "save",
        "saveAll",
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
.method public abstract count()J
.end method

.method public abstract delete(Ljava/lang/Object;)Lio/reactivex/Single;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TENTITY;)",
            "Lio/reactivex/Single<",
            "TENTITY;>;"
        }
    .end annotation
.end method

.method public abstract deleteAll(Ljava/lang/Iterable;)Lio/reactivex/Single;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable<",
            "+TENTITY;>;)",
            "Lio/reactivex/Single<",
            "Ljava/util/List<",
            "TENTITY;>;>;"
        }
    .end annotation
.end method

.method public abstract existsById(Ljava/lang/Object;)Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TID;)Z"
        }
    .end annotation
.end method

.method public abstract findAll()Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Ljava/util/List<",
            "TENTITY;>;>;"
        }
    .end annotation
.end method

.method public abstract findById(Ljava/lang/Object;)Lio/reactivex/Maybe;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TID;)",
            "Lio/reactivex/Maybe<",
            "TENTITY;>;"
        }
    .end annotation
.end method

.method public abstract save(Ljava/lang/Object;)Lio/reactivex/Single;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TENTITY;)",
            "Lio/reactivex/Single<",
            "TENTITY;>;"
        }
    .end annotation
.end method

.method public abstract saveAll(Ljava/lang/Iterable;)Lio/reactivex/Single;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable<",
            "+TENTITY;>;)",
            "Lio/reactivex/Single<",
            "Ljava/util/List<",
            "TENTITY;>;>;"
        }
    .end annotation
.end method
