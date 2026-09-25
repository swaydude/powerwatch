.class public interface abstract Lpowerwatch/matrix/com/pwgen2android/shared/ui/dialogManager/DialogManager;
.super Ljava/lang/Object;
.source "DialogManager.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpowerwatch/matrix/com/pwgen2android/shared/ui/dialogManager/DialogManager$DefaultImpls;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008f\u0018\u00002\u00020\u0001J:\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\u00082\u0008\u0008\u0002\u0010\n\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u0008H&J*\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u0002H\r0\u0003\"\u0004\u0008\u0000\u0010\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u000c\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u0002H\r0\u0011H&\u00a8\u0006\u0012"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/ui/dialogManager/DialogManager;",
        "",
        "openAlertDialog",
        "Lio/reactivex/Single;",
        "",
        "context",
        "Landroid/content/Context;",
        "title",
        "",
        "message",
        "positiveButtonText",
        "negativeButtonText",
        "openCustomDialog",
        "DATA",
        "fragmentManager",
        "Landroidx/fragment/app/FragmentManager;",
        "dialogFragment",
        "Lpowerwatch/matrix/com/pwgen2android/shared/ui/dialogManager/dialogs/BaseDialog;",
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


# virtual methods
.method public abstract openAlertDialog(Landroid/content/Context;IIII)Lio/reactivex/Single;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "IIII)",
            "Lio/reactivex/Single<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end method

.method public abstract openCustomDialog(Landroidx/fragment/app/FragmentManager;Lpowerwatch/matrix/com/pwgen2android/shared/ui/dialogManager/dialogs/BaseDialog;)Lio/reactivex/Single;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<DATA:",
            "Ljava/lang/Object;",
            ">(",
            "Landroidx/fragment/app/FragmentManager;",
            "Lpowerwatch/matrix/com/pwgen2android/shared/ui/dialogManager/dialogs/BaseDialog<",
            "TDATA;>;)",
            "Lio/reactivex/Single<",
            "TDATA;>;"
        }
    .end annotation
.end method
