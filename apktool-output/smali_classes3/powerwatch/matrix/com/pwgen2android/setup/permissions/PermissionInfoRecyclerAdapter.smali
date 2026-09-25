.class public final Lpowerwatch/matrix/com/pwgen2android/setup/permissions/PermissionInfoRecyclerAdapter;
.super Landroidx/recyclerview/widget/RecyclerView$Adapter;
.source "PermissionInfoRecyclerAdapter.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/recyclerview/widget/RecyclerView$Adapter<",
        "Lpowerwatch/matrix/com/pwgen2android/setup/permissions/PermissionInfoItemViewHolder;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\u000c\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u0008J\u0008\u0010\u001c\u001a\u00020\u000bH\u0016J\u0018\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000bH\u0016J\u0018\u0010\u001f\u001a\u00020\u00022\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u000bH\u0016R7\u0010\t\u001a\u001f\u0012\u0013\u0012\u00110\u000b\u00a2\u0006\u000c\u0008\u000c\u0012\u0008\u0008\r\u0012\u0004\u0008\u0008(\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011\"\u0004\u0008\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u0015R0\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u000c\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0018\u0010\u0019\"\u0004\u0008\u001a\u0010\u001b\u00a8\u0006#"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/setup/permissions/PermissionInfoRecyclerAdapter;",
        "Landroidx/recyclerview/widget/RecyclerView$Adapter;",
        "Lpowerwatch/matrix/com/pwgen2android/setup/permissions/PermissionInfoItemViewHolder;",
        "newItems",
        "",
        "Lpowerwatch/matrix/com/pwgen2android/setup/permissions/UIPermissionInfo;",
        "context",
        "Landroid/content/Context;",
        "(Ljava/util/List;Landroid/content/Context;)V",
        "clickListener",
        "Lkotlin/Function1;",
        "",
        "Lkotlin/ParameterName;",
        "name",
        "position",
        "",
        "getClickListener",
        "()Lkotlin/jvm/functions/Function1;",
        "setClickListener",
        "(Lkotlin/jvm/functions/Function1;)V",
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
.field private clickListener:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "-",
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
            "Lpowerwatch/matrix/com/pwgen2android/setup/permissions/UIPermissionInfo;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/List;Landroid/content/Context;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/setup/permissions/UIPermissionInfo;",
            ">;",
            "Landroid/content/Context;",
            ")V"
        }
    .end annotation

    const-string v0, "newItems"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;-><init>()V

    .line 14
    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/setup/permissions/PermissionInfoRecyclerAdapter;->context:Landroid/content/Context;

    .line 18
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/permissions/PermissionInfoRecyclerAdapter;->items:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final getClickListener()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .line 23
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/permissions/PermissionInfoRecyclerAdapter;->clickListener:Lkotlin/jvm/functions/Function1;

    return-object v0
.end method

.method public final getContext()Landroid/content/Context;
    .locals 1

    .line 14
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/permissions/PermissionInfoRecyclerAdapter;->context:Landroid/content/Context;

    return-object v0
.end method

.method public getItemCount()I
    .locals 1

    .line 32
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/permissions/PermissionInfoRecyclerAdapter;->items:Ljava/util/List;

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
            "Lpowerwatch/matrix/com/pwgen2android/setup/permissions/UIPermissionInfo;",
            ">;"
        }
    .end annotation

    .line 18
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/permissions/PermissionInfoRecyclerAdapter;->items:Ljava/util/List;

    return-object v0
.end method

.method public bridge synthetic onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V
    .locals 0

    .line 13
    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/setup/permissions/PermissionInfoItemViewHolder;

    invoke-virtual {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/setup/permissions/PermissionInfoRecyclerAdapter;->onBindViewHolder(Lpowerwatch/matrix/com/pwgen2android/setup/permissions/PermissionInfoItemViewHolder;I)V

    return-void
.end method

.method public onBindViewHolder(Lpowerwatch/matrix/com/pwgen2android/setup/permissions/PermissionInfoItemViewHolder;I)V
    .locals 2

    const-string v0, "holder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/permissions/PermissionInfoRecyclerAdapter;->items:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lpowerwatch/matrix/com/pwgen2android/setup/permissions/UIPermissionInfo;

    .line 37
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/setup/permissions/PermissionInfoItemViewHolder;->getTitle()Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    move-result-object v0

    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/setup/permissions/UIPermissionInfo;->getTitle()Ljava/lang/String;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;->setText(Ljava/lang/CharSequence;)V

    .line 38
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/setup/permissions/PermissionInfoItemViewHolder;->getDescription()Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    move-result-object v0

    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/setup/permissions/UIPermissionInfo;->getDescription()Ljava/lang/String;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;->setText(Ljava/lang/CharSequence;)V

    .line 39
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/setup/permissions/PermissionInfoItemViewHolder;->getIcon()Landroid/widget/ImageView;

    move-result-object v0

    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/setup/permissions/UIPermissionInfo;->getIcon()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 40
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/setup/permissions/PermissionInfoItemViewHolder;->getChecked()Landroidx/appcompat/widget/AppCompatCheckBox;

    move-result-object v0

    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/setup/permissions/UIPermissionInfo;->getChecked()Z

    move-result v1

    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/AppCompatCheckBox;->setChecked(Z)V

    .line 41
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/setup/permissions/PermissionInfoItemViewHolder;->getChecked()Landroidx/appcompat/widget/AppCompatCheckBox;

    move-result-object p1

    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/setup/permissions/UIPermissionInfo;->getClickable()Z

    move-result p2

    invoke-virtual {p1, p2}, Landroidx/appcompat/widget/AppCompatCheckBox;->setEnabled(Z)V

    return-void
.end method

.method public bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
    .locals 0

    .line 13
    invoke-virtual {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/setup/permissions/PermissionInfoRecyclerAdapter;->onCreateViewHolder(Landroid/view/ViewGroup;I)Lpowerwatch/matrix/com/pwgen2android/setup/permissions/PermissionInfoItemViewHolder;

    move-result-object p1

    check-cast p1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;

    return-object p1
.end method

.method public onCreateViewHolder(Landroid/view/ViewGroup;I)Lpowerwatch/matrix/com/pwgen2android/setup/permissions/PermissionInfoItemViewHolder;
    .locals 3

    const-string p2, "parent"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    new-instance p2, Lpowerwatch/matrix/com/pwgen2android/setup/permissions/PermissionInfoItemViewHolder;

    .line 27
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/permissions/PermissionInfoRecyclerAdapter;->context:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f0b00bb

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    const-string v0, "from(context).inflate(R.layout.permission_info_item, parent, false)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/permissions/PermissionInfoRecyclerAdapter;->clickListener:Lkotlin/jvm/functions/Function1;

    .line 26
    invoke-direct {p2, p1, v0}, Lpowerwatch/matrix/com/pwgen2android/setup/permissions/PermissionInfoItemViewHolder;-><init>(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    return-object p2
.end method

.method public final setClickListener(Lkotlin/jvm/functions/Function1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 23
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/permissions/PermissionInfoRecyclerAdapter;->clickListener:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public final setItems(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/setup/permissions/UIPermissionInfo;",
            ">;)V"
        }
    .end annotation

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/permissions/PermissionInfoRecyclerAdapter;->items:Ljava/util/List;

    .line 21
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/permissions/PermissionInfoRecyclerAdapter;->notifyDataSetChanged()V

    return-void
.end method
