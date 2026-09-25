.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/utils/-$$Lambda$UserPrefsUtils$unLphIhH0WP78-4ENCBHqifkDhQ;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Consumer;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/utils/-$$Lambda$UserPrefsUtils$unLphIhH0WP78-4ENCBHqifkDhQ;->f$0:Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/utils/-$$Lambda$UserPrefsUtils$unLphIhH0WP78-4ENCBHqifkDhQ;->f$0:Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;

    invoke-static {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;->lambda$unLphIhH0WP78-4ENCBHqifkDhQ(Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;)V

    return-void
.end method
