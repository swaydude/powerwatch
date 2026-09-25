.class final Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar$rightButton$2;
.super Lkotlin/jvm/internal/Lambda;
.source "toolbars.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Landroid/widget/TextView;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n"
    }
    d2 = {
        "<anonymous>",
        "Landroid/widget/TextView;",
        "kotlin.jvm.PlatformType"
    }
    k = 0x3
    mv = {
        0x1,
        0x5,
        0x1
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic this$0:Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;


# direct methods
.method constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;)V
    .locals 0

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar$rightButton$2;->this$0:Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Landroid/widget/TextView;
    .locals 2

    .line 14
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar$rightButton$2;->this$0:Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;

    const v1, 0x7f0801d7

    invoke-virtual {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 13
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar$rightButton$2;->invoke()Landroid/widget/TextView;

    move-result-object v0

    return-object v0
.end method
