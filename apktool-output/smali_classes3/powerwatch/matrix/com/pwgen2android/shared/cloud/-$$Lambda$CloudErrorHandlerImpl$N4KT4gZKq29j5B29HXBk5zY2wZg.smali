.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/shared/cloud/-$$Lambda$CloudErrorHandlerImpl$N4KT4gZKq29j5B29HXBk5zY2wZg;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# instance fields
.field public final synthetic f$0:Ljava/lang/Throwable;

.field public final synthetic f$1:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorHandlerImpl;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Throwable;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorHandlerImpl;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/-$$Lambda$CloudErrorHandlerImpl$N4KT4gZKq29j5B29HXBk5zY2wZg;->f$0:Ljava/lang/Throwable;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/-$$Lambda$CloudErrorHandlerImpl$N4KT4gZKq29j5B29HXBk5zY2wZg;->f$1:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorHandlerImpl;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/-$$Lambda$CloudErrorHandlerImpl$N4KT4gZKq29j5B29HXBk5zY2wZg;->f$0:Ljava/lang/Throwable;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/-$$Lambda$CloudErrorHandlerImpl$N4KT4gZKq29j5B29HXBk5zY2wZg;->f$1:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorHandlerImpl;

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/Optional;

    invoke-static {v0, v1, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorHandlerImpl;->lambda$N4KT4gZKq29j5B29HXBk5zY2wZg(Ljava/lang/Throwable;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorHandlerImpl;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/Optional;)Lio/reactivex/CompletableSource;

    move-result-object p1

    return-object p1
.end method
