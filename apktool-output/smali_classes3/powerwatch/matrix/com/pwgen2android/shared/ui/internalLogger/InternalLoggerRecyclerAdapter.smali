.class public final Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/InternalLoggerRecyclerAdapter;
.super Landroidx/recyclerview/widget/RecyclerView$Adapter;
.source "InternalLoggerRecyclerAdapter.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/recyclerview/widget/RecyclerView$Adapter<",
        "Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/InternalLoggerViewHolder;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B>\u0012\u000c\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012!\u0010\u0008\u001a\u001d\u0012\u0013\u0012\u00110\n\u00a2\u0006\u000c\u0008\u000b\u0012\u0008\u0008\u000c\u0012\u0004\u0008\u0008(\r\u0012\u0004\u0012\u00020\u000e0\t\u00a2\u0006\u0002\u0010\u000fJ\u0008\u0010\u0018\u001a\u00020\nH\u0016J\u0018\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\nH\u0016J\u0018\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\nH\u0016R)\u0010\u0008\u001a\u001d\u0012\u0013\u0012\u00110\n\u00a2\u0006\u000c\u0008\u000b\u0012\u0008\u0008\u000c\u0012\u0004\u0008\u0008(\r\u0012\u0004\u0012\u00020\u000e0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011R0\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u000c\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0014\u0010\u0015\"\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\u001f"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/InternalLoggerRecyclerAdapter;",
        "Landroidx/recyclerview/widget/RecyclerView$Adapter;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/InternalLoggerViewHolder;",
        "newItems",
        "",
        "Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/PWLogView;",
        "context",
        "Landroid/content/Context;",
        "clickListener",
        "Lkotlin/Function1;",
        "",
        "Lkotlin/ParameterName;",
        "name",
        "position",
        "",
        "(Ljava/util/List;Landroid/content/Context;Lkotlin/jvm/functions/Function1;)V",
        "getContext",
        "()Landroid/content/Context;",
        "value",
        "items",
        "getItems",
        "()Ljava/util/List;",
        "setItems",
        "(Ljava/util/List;)V",
        "getItemCount",
        "onBindViewHolder",
        "holder",
        "onCreateViewHolder",
        "parent",
        "Landroid/view/ViewGroup;",
        "viewType",
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
.field private final clickListener:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private final context:Landroid/content/Context;

.field private items:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/PWLogView;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/List;Landroid/content/Context;Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/PWLogView;",
            ">;",
            "Landroid/content/Context;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "newItems"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "clickListener"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;-><init>()V

    .line 14
    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/InternalLoggerRecyclerAdapter;->context:Landroid/content/Context;

    .line 15
    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/InternalLoggerRecyclerAdapter;->clickListener:Lkotlin/jvm/functions/Function1;

    .line 19
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/InternalLoggerRecyclerAdapter;->items:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final getContext()Landroid/content/Context;
    .locals 1

    .line 14
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/InternalLoggerRecyclerAdapter;->context:Landroid/content/Context;

    return-object v0
.end method

.method public getItemCount()I
    .locals 1

    .line 33
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/InternalLoggerRecyclerAdapter;->items:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public final getItems()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/PWLogView;",
            ">;"
        }
    .end annotation

    .line 19
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/InternalLoggerRecyclerAdapter;->items:Ljava/util/List;

    return-object v0
.end method

.method public bridge synthetic onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V
    .locals 0

    .line 13
    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/InternalLoggerViewHolder;

    invoke-virtual {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/InternalLoggerRecyclerAdapter;->onBindViewHolder(Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/InternalLoggerViewHolder;I)V

    return-void
.end method

.method public onBindViewHolder(Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/InternalLoggerViewHolder;I)V
    .locals 5

    const-string v0, "holder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/InternalLoggerRecyclerAdapter;->items:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/PWLogView;

    .line 38
    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/PWLogView;->getLogLevel()Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel;

    move-result-object v0

    .line 39
    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel$INFO;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel$INFO;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const v2, 0x7f0500ea

    if-eqz v1, :cond_0

    const v2, 0x7f050105

    goto :goto_0

    .line 40
    :cond_0
    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel$DEBUG;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel$DEBUG;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const v2, 0x7f050087

    goto :goto_0

    .line 41
    :cond_1
    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel$ERROR;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel$ERROR;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_0

    .line 42
    :cond_2
    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel$WARN;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel$WARN;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    const v2, 0x7f0500de

    goto :goto_0

    .line 43
    :cond_3
    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel$WTF;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel$WTF;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_b

    .line 45
    :goto_0
    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/PWLogView;->getLogLevel()Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel;

    move-result-object v0

    .line 46
    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel$INFO;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel$INFO;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    const v0, 0x7f0c0015

    goto :goto_1

    .line 47
    :cond_4
    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel$DEBUG;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel$DEBUG;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    const v0, 0x7f0c000d

    goto :goto_1

    .line 48
    :cond_5
    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel$ERROR;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel$ERROR;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    const v0, 0x7f0c0012

    goto :goto_1

    .line 49
    :cond_6
    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel$WARN;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel$WARN;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7

    const v0, 0x7f0c0013

    goto :goto_1

    .line 50
    :cond_7
    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel$WTF;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel$WTF;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a

    const v0, 0x7f0c0014

    .line 52
    :goto_1
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/InternalLoggerViewHolder;->getLogTitle()Landroid/widget/TextView;

    move-result-object v1

    iget-object v3, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/InternalLoggerRecyclerAdapter;->context:Landroid/content/Context;

    invoke-static {v3, v2}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v3

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 53
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/InternalLoggerViewHolder;->getLogTitle()Landroid/widget/TextView;

    move-result-object v1

    if-nez v1, :cond_8

    goto :goto_2

    :cond_8
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/PWLogView;->getTitle()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, " - "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/PWLogView;->getTime()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    check-cast v3, Ljava/lang/CharSequence;

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 54
    :goto_2
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/InternalLoggerViewHolder;->getLogContent()Landroid/widget/TextView;

    move-result-object v1

    iget-object v3, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/InternalLoggerRecyclerAdapter;->context:Landroid/content/Context;

    invoke-static {v3, v2}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 55
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/InternalLoggerViewHolder;->getLogContent()Landroid/widget/TextView;

    move-result-object v1

    if-nez v1, :cond_9

    goto :goto_3

    :cond_9
    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/PWLogView;->getContent()Ljava/lang/String;

    move-result-object p2

    check-cast p2, Ljava/lang/CharSequence;

    invoke-virtual {v1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 56
    :goto_3
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/InternalLoggerViewHolder;->getLogIcon()Landroid/widget/ImageView;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    return-void

    .line 50
    :cond_a
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    .line 43
    :cond_b
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
    .locals 0

    .line 13
    invoke-virtual {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/InternalLoggerRecyclerAdapter;->onCreateViewHolder(Landroid/view/ViewGroup;I)Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/InternalLoggerViewHolder;

    move-result-object p1

    check-cast p1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;

    return-object p1
.end method

.method public onCreateViewHolder(Landroid/view/ViewGroup;I)Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/InternalLoggerViewHolder;
    .locals 3

    const-string p2, "parent"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    new-instance p2, Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/InternalLoggerViewHolder;

    .line 28
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/InternalLoggerRecyclerAdapter;->context:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f0b0088

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    const-string v0, "from(context).inflate(R.layout.internal_logger_item, parent, false)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/InternalLoggerRecyclerAdapter;->clickListener:Lkotlin/jvm/functions/Function1;

    .line 27
    invoke-direct {p2, p1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/InternalLoggerViewHolder;-><init>(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    return-object p2
.end method

.method public final setItems(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/PWLogView;",
            ">;)V"
        }
    .end annotation

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/InternalLoggerRecyclerAdapter;->items:Ljava/util/List;

    .line 22
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/InternalLoggerRecyclerAdapter;->notifyDataSetChanged()V

    return-void
.end method
