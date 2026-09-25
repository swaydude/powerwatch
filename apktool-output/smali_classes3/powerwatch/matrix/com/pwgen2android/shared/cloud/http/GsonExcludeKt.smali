.class public final Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/GsonExcludeKt;
.super Ljava/lang/Object;
.source "GsonExclude.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\"\u001a\u0010\u0000\u001a\u00020\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0002\u0010\u0003\"\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "strategy",
        "Lcom/google/gson/ExclusionStrategy;",
        "getStrategy",
        "()Lcom/google/gson/ExclusionStrategy;",
        "setStrategy",
        "(Lcom/google/gson/ExclusionStrategy;)V",
        "app_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x5,
        0x1
    }
    xi = 0x30
.end annotation


# static fields
.field private static strategy:Lcom/google/gson/ExclusionStrategy;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 10
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/GsonExcludeKt$strategy$1;

    invoke-direct {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/GsonExcludeKt$strategy$1;-><init>()V

    check-cast v0, Lcom/google/gson/ExclusionStrategy;

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/GsonExcludeKt;->strategy:Lcom/google/gson/ExclusionStrategy;

    return-void
.end method

.method public static final getStrategy()Lcom/google/gson/ExclusionStrategy;
    .locals 1

    .line 10
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/GsonExcludeKt;->strategy:Lcom/google/gson/ExclusionStrategy;

    return-object v0
.end method

.method public static final setStrategy(Lcom/google/gson/ExclusionStrategy;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    sput-object p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/GsonExcludeKt;->strategy:Lcom/google/gson/ExclusionStrategy;

    return-void
.end method
