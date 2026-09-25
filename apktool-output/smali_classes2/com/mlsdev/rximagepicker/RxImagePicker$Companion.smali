.class public final Lcom/mlsdev/rximagepicker/RxImagePicker$Companion;
.super Ljava/lang/Object;
.source "RxImagePicker.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/mlsdev/rximagepicker/RxImagePicker;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u000c\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \u0008*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"
    }
    d2 = {
        "Lcom/mlsdev/rximagepicker/RxImagePicker$Companion;",
        "",
        "()V",
        "CHOOSER",
        "",
        "SELECT_PHOTO",
        "TAG",
        "",
        "kotlin.jvm.PlatformType",
        "TAKE_PHOTO",
        "cameraPictureUrl",
        "Landroid/net/Uri;",
        "with",
        "Lcom/mlsdev/rximagepicker/RxImagePicker;",
        "fragmentManager",
        "Landroidx/fragment/app/FragmentManager;",
        "library_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 246
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 246
    invoke-direct {p0}, Lcom/mlsdev/rximagepicker/RxImagePicker$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final with(Landroidx/fragment/app/FragmentManager;)Lcom/mlsdev/rximagepicker/RxImagePicker;
    .locals 3

    const-string v0, "fragmentManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 256
    invoke-static {}, Lcom/mlsdev/rximagepicker/RxImagePicker;->access$getTAG$cp()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroidx/fragment/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    move-result-object v0

    check-cast v0, Lcom/mlsdev/rximagepicker/RxImagePicker;

    if-nez v0, :cond_0

    .line 258
    new-instance v0, Lcom/mlsdev/rximagepicker/RxImagePicker;

    invoke-direct {v0}, Lcom/mlsdev/rximagepicker/RxImagePicker;-><init>()V

    .line 259
    invoke-virtual {p1}, Landroidx/fragment/app/FragmentManager;->beginTransaction()Landroidx/fragment/app/FragmentTransaction;

    move-result-object p1

    .line 260
    move-object v1, v0

    check-cast v1, Landroidx/fragment/app/Fragment;

    invoke-static {}, Lcom/mlsdev/rximagepicker/RxImagePicker;->access$getTAG$cp()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v1, v2}, Landroidx/fragment/app/FragmentTransaction;->add(Landroidx/fragment/app/Fragment;Ljava/lang/String;)Landroidx/fragment/app/FragmentTransaction;

    move-result-object p1

    .line 261
    invoke-virtual {p1}, Landroidx/fragment/app/FragmentTransaction;->commit()I

    :cond_0
    return-object v0
.end method
