.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/shared/data/db/-$$Lambda$UserDao$AI86tPcR4JxnnIlDXSx15LNhDQ0;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Action;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UserDao;

.field public final synthetic f$1:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UserDao;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/-$$Lambda$UserDao$AI86tPcR4JxnnIlDXSx15LNhDQ0;->f$0:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UserDao;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/-$$Lambda$UserDao$AI86tPcR4JxnnIlDXSx15LNhDQ0;->f$1:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/-$$Lambda$UserDao$AI86tPcR4JxnnIlDXSx15LNhDQ0;->f$0:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UserDao;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/-$$Lambda$UserDao$AI86tPcR4JxnnIlDXSx15LNhDQ0;->f$1:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;

    invoke-static {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UserDao;->lambda$AI86tPcR4JxnnIlDXSx15LNhDQ0(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UserDao;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;)V

    return-void
.end method
