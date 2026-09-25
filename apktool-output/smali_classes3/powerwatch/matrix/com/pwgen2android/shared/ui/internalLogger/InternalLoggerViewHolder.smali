.class public final Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/InternalLoggerViewHolder;
.super Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
.source "InternalLoggerRecyclerAdapter.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u00002\u00020\u0001B0\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012!\u0010\u0004\u001a\u001d\u0012\u0013\u0012\u00110\u0006\u00a2\u0006\u000c\u0008\u0007\u0012\u0008\u0008\u0008\u0012\u0004\u0008\u0008(\t\u0012\u0004\u0012\u00020\n0\u0005\u00a2\u0006\u0002\u0010\u000bR\u0019\u0010\u000c\u001a\n \u000e*\u0004\u0018\u00010\r0\r\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010R\u0019\u0010\u0011\u001a\n \u000e*\u0004\u0018\u00010\u00120\u0012\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0014R\u0019\u0010\u0015\u001a\n \u000e*\u0004\u0018\u00010\r0\r\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0016\u0010\u0010\u00a8\u0006\u0017"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/InternalLoggerViewHolder;",
        "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;",
        "view",
        "Landroid/view/View;",
        "clickListener",
        "Lkotlin/Function1;",
        "",
        "Lkotlin/ParameterName;",
        "name",
        "position",
        "",
        "(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V",
        "logContent",
        "Landroid/widget/TextView;",
        "kotlin.jvm.PlatformType",
        "getLogContent",
        "()Landroid/widget/TextView;",
        "logIcon",
        "Landroid/widget/ImageView;",
        "getLogIcon",
        "()Landroid/widget/ImageView;",
        "logTitle",
        "getLogTitle",
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


# instance fields
.field private final logContent:Landroid/widget/TextView;

.field private final logIcon:Landroid/widget/ImageView;

.field private final logTitle:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "clickListener"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 61
    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    .line 62
    sget p2, Lpowerwatch/matrix/com/pwgen2android/R$id;->log_title:I

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/TextView;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/InternalLoggerViewHolder;->logTitle:Landroid/widget/TextView;

    .line 63
    sget p2, Lpowerwatch/matrix/com/pwgen2android/R$id;->log_content:I

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/TextView;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/InternalLoggerViewHolder;->logContent:Landroid/widget/TextView;

    .line 64
    sget p2, Lpowerwatch/matrix/com/pwgen2android/R$id;->log_icon:I

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/InternalLoggerViewHolder;->logIcon:Landroid/widget/ImageView;

    return-void
.end method


# virtual methods
.method public final getLogContent()Landroid/widget/TextView;
    .locals 1

    .line 63
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/InternalLoggerViewHolder;->logContent:Landroid/widget/TextView;

    return-object v0
.end method

.method public final getLogIcon()Landroid/widget/ImageView;
    .locals 1

    .line 64
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/InternalLoggerViewHolder;->logIcon:Landroid/widget/ImageView;

    return-object v0
.end method

.method public final getLogTitle()Landroid/widget/TextView;
    .locals 1

    .line 62
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/InternalLoggerViewHolder;->logTitle:Landroid/widget/TextView;

    return-object v0
.end method
