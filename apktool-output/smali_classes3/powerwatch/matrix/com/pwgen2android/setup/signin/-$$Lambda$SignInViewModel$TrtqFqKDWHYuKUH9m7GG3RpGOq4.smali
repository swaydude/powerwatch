.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/setup/signin/-$$Lambda$SignInViewModel$TrtqFqKDWHYuKUH9m7GG3RpGOq4;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Consumer;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/setup/signin/SignInViewModel;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/setup/signin/SignInViewModel;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/signin/-$$Lambda$SignInViewModel$TrtqFqKDWHYuKUH9m7GG3RpGOq4;->f$0:Lpowerwatch/matrix/com/pwgen2android/setup/signin/SignInViewModel;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/signin/-$$Lambda$SignInViewModel$TrtqFqKDWHYuKUH9m7GG3RpGOq4;->f$0:Lpowerwatch/matrix/com/pwgen2android/setup/signin/SignInViewModel;

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;

    invoke-static {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/setup/signin/SignInViewModel;->lambda$TrtqFqKDWHYuKUH9m7GG3RpGOq4(Lpowerwatch/matrix/com/pwgen2android/setup/signin/SignInViewModel;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;)V

    return-void
.end method
