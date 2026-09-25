.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/shared/logger/-$$Lambda$PWLogCollectorExtensionImpl$cOI9pF9vR_GJraBOg8G6CoeE69M;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# instance fields
.field public final synthetic f$0:Ljava/util/List;

.field public final synthetic f$1:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;Ljava/util/List;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/-$$Lambda$PWLogCollectorExtensionImpl$cOI9pF9vR_GJraBOg8G6CoeE69M;->f$0:Ljava/util/List;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/-$$Lambda$PWLogCollectorExtensionImpl$cOI9pF9vR_GJraBOg8G6CoeE69M;->f$1:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/-$$Lambda$PWLogCollectorExtensionImpl$cOI9pF9vR_GJraBOg8G6CoeE69M;->f$0:Ljava/util/List;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/-$$Lambda$PWLogCollectorExtensionImpl$cOI9pF9vR_GJraBOg8G6CoeE69M;->f$1:Ljava/util/List;

    check-cast p1, Ljava/util/List;

    invoke-static {v0, v1, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLogCollectorExtensionImpl;->lambda$cOI9pF9vR_GJraBOg8G6CoeE69M(Ljava/util/List;Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
