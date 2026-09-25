.class public abstract Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartFragment;
.super Landroidx/fragment/app/Fragment;
.source "ChartFragment.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<CHART_CONFIG::",
        "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BaseChartConfig;",
        ">",
        "Landroidx/fragment/app/Fragment;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0000\u0008&\u0018\u0000*\n\u0008\u0000\u0010\u0001 \u0000*\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u001d\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\u0008\u001a\u00020\tH$\u00a2\u0006\u0002\u0010\nJ\u0012\u0010\u000b\u001a\u00020\u00062\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u000cH&\u00a8\u0006\r"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartFragment;",
        "CHART_CONFIG",
        "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BaseChartConfig;",
        "Landroidx/fragment/app/Fragment;",
        "()V",
        "init",
        "",
        "config",
        "rootView",
        "Landroid/view/View;",
        "(Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BaseChartConfig;Landroid/view/View;)V",
        "setConfig",
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
.method public constructor <init>()V
    .locals 0

    .line 26
    invoke-direct {p0}, Landroidx/fragment/app/Fragment;-><init>()V

    return-void
.end method


# virtual methods
.method public _$_clearFindViewByIdCache()V
    .locals 0

    return-void
.end method

.method protected abstract init(Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BaseChartConfig;Landroid/view/View;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TCHART_CONFIG;",
            "Landroid/view/View;",
            ")V"
        }
    .end annotation
.end method

.method public abstract setConfig(Ljava/lang/Object;)V
.end method
