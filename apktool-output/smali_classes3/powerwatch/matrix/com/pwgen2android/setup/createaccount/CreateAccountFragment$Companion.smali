.class public final Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/CreateAccountFragment$Companion;
.super Ljava/lang/Object;
.source "CreateAccountFragment.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/CreateAccountFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0005\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0008H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/CreateAccountFragment$Companion;",
        "",
        "()V",
        "IS_FROM_LOGIN",
        "",
        "newInstance",
        "Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/CreateAccountFragment;",
        "fromLogin",
        "",
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


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/CreateAccountFragment$Companion;-><init>()V

    return-void
.end method

.method public static synthetic newInstance$default(Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/CreateAccountFragment$Companion;ZILjava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/CreateAccountFragment;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    .line 51
    :cond_0
    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/CreateAccountFragment$Companion;->newInstance(Z)Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/CreateAccountFragment;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final newInstance(Z)Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/CreateAccountFragment;
    .locals 3
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .line 51
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/CreateAccountFragment;

    invoke-direct {v0}, Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/CreateAccountFragment;-><init>()V

    .line 52
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    const-string v2, "from_login_key"

    .line 53
    invoke-virtual {v1, v2, p1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 54
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 52
    invoke-virtual {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/CreateAccountFragment;->setArguments(Landroid/os/Bundle;)V

    return-object v0
.end method
