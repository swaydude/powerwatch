.class public final Lcom/mlsdev/rximagepicker/RxImagePicker;
.super Landroidx/fragment/app/Fragment;
.source "RxImagePicker.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/mlsdev/rximagepicker/RxImagePicker$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nRxImagePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RxImagePicker.kt\ncom/mlsdev/rximagepicker/RxImagePicker\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,268:1\n37#2,2:269\n*E\n*S KotlinDebug\n*F\n+ 1 RxImagePicker.kt\ncom/mlsdev/rximagepicker/RxImagePicker\n*L\n181#1,2:269\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u0000 72\u00020\u0001:\u00017B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0008\u0010\u0011\u001a\u00020\u0004H\u0002J\u0012\u0010\u0012\u001a\u00020\u00132\u0008\u0010\t\u001a\u0004\u0018\u00010\nH\u0002J\n\u0010\u0014\u001a\u0004\u0018\u00010\u000eH\u0002J\u0008\u0010\u0015\u001a\u00020\u0013H\u0002J\u0008\u0010\u0016\u001a\u00020\u0013H\u0002J \u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u000eH\u0002J\u0012\u0010\u001d\u001a\u00020\u00182\u0008\u0010\u001e\u001a\u0004\u0018\u00010\u0013H\u0002J\u0008\u0010\u001f\u001a\u00020\u0018H\u0002J\u0012\u0010 \u001a\u00020\u00042\u0008\u0010\u001e\u001a\u0004\u0018\u00010\u0013H\u0002J\"\u0010!\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020\u00082\u0006\u0010#\u001a\u00020\u00082\u0008\u0010\u001e\u001a\u0004\u0018\u00010\u0013H\u0016J\u0012\u0010$\u001a\u00020\u00182\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u0012\u0010%\u001a\u00020\u00182\u0008\u0010&\u001a\u0004\u0018\u00010\'H\u0016J\u0012\u0010(\u001a\u00020\u00182\u0008\u0010\u001c\u001a\u0004\u0018\u00010\u000eH\u0002J\u0016\u0010)\u001a\u00020\u00182\u000c\u0010*\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\u0010H\u0002J+\u0010+\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020\u00082\u000c\u0010,\u001a\u0008\u0012\u0004\u0012\u00020\n0-2\u0006\u0010.\u001a\u00020/H\u0016\u00a2\u0006\u0002\u00100J\u0008\u00101\u001a\u00020\u0018H\u0002J\u0014\u00102\u001a\u0008\u0012\u0004\u0012\u00020\u000e032\u0006\u00104\u001a\u00020\u000cJ\u001e\u00102\u001a\u0008\u0012\u0004\u0012\u00020\u000e032\u0006\u00104\u001a\u00020\u000c2\u0008\u0010\t\u001a\u0004\u0018\u00010\nJ\u0014\u00105\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000e0\u001003H\u0007J\u0008\u00106\u001a\u00020\u0018H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u000cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000e0\u00100\u0006X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u00068"
    }
    d2 = {
        "Lcom/mlsdev/rximagepicker/RxImagePicker;",
        "Landroidx/fragment/app/Fragment;",
        "()V",
        "allowMultipleImages",
        "",
        "attachedSubject",
        "Lio/reactivex/subjects/PublishSubject;",
        "canceledSubject",
        "",
        "chooserTitle",
        "",
        "imageSource",
        "Lcom/mlsdev/rximagepicker/Sources;",
        "publishSubject",
        "Landroid/net/Uri;",
        "publishSubjectMultipleImages",
        "",
        "checkPermission",
        "createChooserIntent",
        "Landroid/content/Intent;",
        "createImageUri",
        "createPickFromDocumentsIntent",
        "createPickFromGalleryIntent",
        "grantWritePermission",
        "",
        "context",
        "Landroid/content/Context;",
        "intent",
        "uri",
        "handleGalleryResult",
        "data",
        "initSubjects",
        "isPhoto",
        "onActivityResult",
        "requestCode",
        "resultCode",
        "onAttach",
        "onCreate",
        "savedInstanceState",
        "Landroid/os/Bundle;",
        "onImagePicked",
        "onImagesPicked",
        "uris",
        "onRequestPermissionsResult",
        "permissions",
        "",
        "grantResults",
        "",
        "(I[Ljava/lang/String;[I)V",
        "pickImage",
        "requestImage",
        "Lio/reactivex/Observable;",
        "source",
        "requestMultipleImages",
        "requestPickImage",
        "Companion",
        "library_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# static fields
.field private static final CHOOSER:I = 0x66

.field public static final Companion:Lcom/mlsdev/rximagepicker/RxImagePicker$Companion;

.field private static final SELECT_PHOTO:I = 0x64

.field private static final TAG:Ljava/lang/String;

.field private static final TAKE_PHOTO:I = 0x65

.field private static cameraPictureUrl:Landroid/net/Uri;


# instance fields
.field private _$_findViewCache:Ljava/util/HashMap;

.field private allowMultipleImages:Z

.field private attachedSubject:Lio/reactivex/subjects/PublishSubject;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/subjects/PublishSubject<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private canceledSubject:Lio/reactivex/subjects/PublishSubject;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/subjects/PublishSubject<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private chooserTitle:Ljava/lang/String;

.field private imageSource:Lcom/mlsdev/rximagepicker/Sources;

.field private publishSubject:Lio/reactivex/subjects/PublishSubject;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/subjects/PublishSubject<",
            "Landroid/net/Uri;",
            ">;"
        }
    .end annotation
.end field

.field private publishSubjectMultipleImages:Lio/reactivex/subjects/PublishSubject;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/subjects/PublishSubject<",
            "Ljava/util/List<",
            "Landroid/net/Uri;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/mlsdev/rximagepicker/RxImagePicker$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/mlsdev/rximagepicker/RxImagePicker$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/mlsdev/rximagepicker/RxImagePicker;->Companion:Lcom/mlsdev/rximagepicker/RxImagePicker$Companion;

    .line 252
    const-class v0, Lcom/mlsdev/rximagepicker/RxImagePicker;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/mlsdev/rximagepicker/RxImagePicker;->TAG:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 23
    invoke-direct {p0}, Landroidx/fragment/app/Fragment;-><init>()V

    return-void
.end method

.method public static final synthetic access$getAttachedSubject$p(Lcom/mlsdev/rximagepicker/RxImagePicker;)Lio/reactivex/subjects/PublishSubject;
    .locals 1

    .line 23
    iget-object p0, p0, Lcom/mlsdev/rximagepicker/RxImagePicker;->attachedSubject:Lio/reactivex/subjects/PublishSubject;

    if-nez p0, :cond_0

    const-string v0, "attachedSubject"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    :cond_0
    return-object p0
.end method

.method public static final synthetic access$getCanceledSubject$p(Lcom/mlsdev/rximagepicker/RxImagePicker;)Lio/reactivex/subjects/PublishSubject;
    .locals 1

    .line 23
    iget-object p0, p0, Lcom/mlsdev/rximagepicker/RxImagePicker;->canceledSubject:Lio/reactivex/subjects/PublishSubject;

    if-nez p0, :cond_0

    const-string v0, "canceledSubject"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    :cond_0
    return-object p0
.end method

.method public static final synthetic access$getPublishSubject$p(Lcom/mlsdev/rximagepicker/RxImagePicker;)Lio/reactivex/subjects/PublishSubject;
    .locals 1

    .line 23
    iget-object p0, p0, Lcom/mlsdev/rximagepicker/RxImagePicker;->publishSubject:Lio/reactivex/subjects/PublishSubject;

    if-nez p0, :cond_0

    const-string v0, "publishSubject"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    :cond_0
    return-object p0
.end method

.method public static final synthetic access$getPublishSubjectMultipleImages$p(Lcom/mlsdev/rximagepicker/RxImagePicker;)Lio/reactivex/subjects/PublishSubject;
    .locals 1

    .line 23
    iget-object p0, p0, Lcom/mlsdev/rximagepicker/RxImagePicker;->publishSubjectMultipleImages:Lio/reactivex/subjects/PublishSubject;

    if-nez p0, :cond_0

    const-string v0, "publishSubjectMultipleImages"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    :cond_0
    return-object p0
.end method

.method public static final synthetic access$getTAG$cp()Ljava/lang/String;
    .locals 1

    .line 23
    sget-object v0, Lcom/mlsdev/rximagepicker/RxImagePicker;->TAG:Ljava/lang/String;

    return-object v0
.end method

.method public static final synthetic access$pickImage(Lcom/mlsdev/rximagepicker/RxImagePicker;)V
    .locals 0

    .line 23
    invoke-direct {p0}, Lcom/mlsdev/rximagepicker/RxImagePicker;->pickImage()V

    return-void
.end method

.method public static final synthetic access$setAttachedSubject$p(Lcom/mlsdev/rximagepicker/RxImagePicker;Lio/reactivex/subjects/PublishSubject;)V
    .locals 0

    .line 23
    iput-object p1, p0, Lcom/mlsdev/rximagepicker/RxImagePicker;->attachedSubject:Lio/reactivex/subjects/PublishSubject;

    return-void
.end method

.method public static final synthetic access$setCanceledSubject$p(Lcom/mlsdev/rximagepicker/RxImagePicker;Lio/reactivex/subjects/PublishSubject;)V
    .locals 0

    .line 23
    iput-object p1, p0, Lcom/mlsdev/rximagepicker/RxImagePicker;->canceledSubject:Lio/reactivex/subjects/PublishSubject;

    return-void
.end method

.method public static final synthetic access$setPublishSubject$p(Lcom/mlsdev/rximagepicker/RxImagePicker;Lio/reactivex/subjects/PublishSubject;)V
    .locals 0

    .line 23
    iput-object p1, p0, Lcom/mlsdev/rximagepicker/RxImagePicker;->publishSubject:Lio/reactivex/subjects/PublishSubject;

    return-void
.end method

.method public static final synthetic access$setPublishSubjectMultipleImages$p(Lcom/mlsdev/rximagepicker/RxImagePicker;Lio/reactivex/subjects/PublishSubject;)V
    .locals 0

    .line 23
    iput-object p1, p0, Lcom/mlsdev/rximagepicker/RxImagePicker;->publishSubjectMultipleImages:Lio/reactivex/subjects/PublishSubject;

    return-void
.end method

.method private final checkPermission()Z
    .locals 4

    .line 210
    invoke-virtual {p0}, Lcom/mlsdev/rximagepicker/RxImagePicker;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-static {}, Lkotlin/jvm/internal/Intrinsics;->throwNpe()V

    :cond_0
    check-cast v0, Landroid/content/Context;

    const-string v1, "android.permission.WRITE_EXTERNAL_STORAGE"

    invoke-static {v0, v1}, Landroidx/core/content/ContextCompat;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    .line 211
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x17

    if-lt v0, v3, :cond_2

    .line 212
    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0, v2}, Lcom/mlsdev/rximagepicker/RxImagePicker;->requestPermissions([Ljava/lang/String;I)V

    goto :goto_0

    :cond_1
    const/4 v2, 0x1

    :cond_2
    :goto_0
    return v2
.end method

.method private final createChooserIntent(Ljava/lang/String;)Landroid/content/Intent;
    .locals 10

    .line 165
    invoke-direct {p0}, Lcom/mlsdev/rximagepicker/RxImagePicker;->createImageUri()Landroid/net/Uri;

    move-result-object v0

    sput-object v0, Lcom/mlsdev/rximagepicker/RxImagePicker;->cameraPictureUrl:Landroid/net/Uri;

    .line 166
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 167
    new-instance v1, Landroid/content/Intent;

    const-string v2, "android.media.action.IMAGE_CAPTURE"

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 168
    invoke-virtual {p0}, Lcom/mlsdev/rximagepicker/RxImagePicker;->getContext()Landroid/content/Context;

    move-result-object v2

    if-nez v2, :cond_0

    invoke-static {}, Lkotlin/jvm/internal/Intrinsics;->throwNpe()V

    :cond_0
    const-string v3, "context!!"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v2

    const/4 v4, 0x0

    .line 169
    invoke-virtual {v2, v1, v4}, Landroid/content/pm/PackageManager;->queryIntentActivities(Landroid/content/Intent;I)Ljava/util/List;

    move-result-object v2

    .line 170
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/content/pm/ResolveInfo;

    .line 171
    iget-object v6, v5, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    iget-object v6, v6, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    .line 172
    new-instance v7, Landroid/content/Intent;

    invoke-direct {v7, v1}, Landroid/content/Intent;-><init>(Landroid/content/Intent;)V

    .line 173
    new-instance v8, Landroid/content/ComponentName;

    iget-object v9, v5, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    iget-object v9, v9, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    iget-object v5, v5, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    iget-object v5, v5, Landroid/content/pm/ActivityInfo;->name:Ljava/lang/String;

    invoke-direct {v8, v9, v5}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v7, v8}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 174
    invoke-virtual {v7, v6}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 175
    sget-object v5, Lcom/mlsdev/rximagepicker/RxImagePicker;->cameraPictureUrl:Landroid/net/Uri;

    check-cast v5, Landroid/os/Parcelable;

    const-string v6, "output"

    invoke-virtual {v7, v6, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 176
    invoke-virtual {p0}, Lcom/mlsdev/rximagepicker/RxImagePicker;->getContext()Landroid/content/Context;

    move-result-object v5

    if-nez v5, :cond_1

    invoke-static {}, Lkotlin/jvm/internal/Intrinsics;->throwNpe()V

    :cond_1
    invoke-static {v5, v3}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v6, Lcom/mlsdev/rximagepicker/RxImagePicker;->cameraPictureUrl:Landroid/net/Uri;

    if-nez v6, :cond_2

    invoke-static {}, Lkotlin/jvm/internal/Intrinsics;->throwNpe()V

    :cond_2
    invoke-direct {p0, v5, v7, v6}, Lcom/mlsdev/rximagepicker/RxImagePicker;->grantWritePermission(Landroid/content/Context;Landroid/content/Intent;Landroid/net/Uri;)V

    .line 177
    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 179
    :cond_3
    invoke-direct {p0}, Lcom/mlsdev/rximagepicker/RxImagePicker;->createPickFromDocumentsIntent()Landroid/content/Intent;

    move-result-object v1

    .line 180
    check-cast p1, Ljava/lang/CharSequence;

    invoke-static {v1, p1}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;

    move-result-object p1

    .line 181
    check-cast v0, Ljava/util/Collection;

    new-array v1, v4, [Landroid/content/Intent;

    .line 270
    invoke-interface {v0, v1}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_4

    check-cast v0, [Landroid/os/Parcelable;

    const-string v1, "android.intent.extra.INITIAL_INTENTS"

    .line 181
    invoke-virtual {p1, v1, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[Landroid/os/Parcelable;)Landroid/content/Intent;

    const-string v0, "chooserIntent"

    .line 183
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    .line 270
    :cond_4
    new-instance p1, Lkotlin/TypeCastException;

    const-string v0, "null cannot be cast to non-null type kotlin.Array<T>"

    invoke-direct {p1, v0}, Lkotlin/TypeCastException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private final createImageUri()Landroid/net/Uri;
    .locals 5

    .line 221
    invoke-virtual {p0}, Lcom/mlsdev/rximagepicker/RxImagePicker;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-static {}, Lkotlin/jvm/internal/Intrinsics;->throwNpe()V

    :cond_0
    const-string v1, "activity!!"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentActivity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    .line 222
    new-instance v1, Landroid/content/ContentValues;

    invoke-direct {v1}, Landroid/content/ContentValues;-><init>()V

    .line 223
    new-instance v2, Ljava/text/SimpleDateFormat;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v3

    const-string v4, "yyyyMMdd_HHmmss"

    invoke-direct {v2, v4, v3}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    new-instance v3, Ljava/util/Date;

    invoke-direct {v3}, Ljava/util/Date;-><init>()V

    invoke-virtual {v2, v3}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "title"

    .line 224
    invoke-virtual {v1, v3, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 225
    sget-object v2, Landroid/provider/MediaStore$Images$Media;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    invoke-virtual {v0, v2, v1}, Landroid/content/ContentResolver;->insert(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;

    move-result-object v0

    return-object v0
.end method

.method private final createPickFromDocumentsIntent()Landroid/content/Intent;
    .locals 3

    .line 196
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x13

    if-lt v0, v1, :cond_0

    .line 197
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.OPEN_DOCUMENT"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 198
    iget-boolean v1, p0, Lcom/mlsdev/rximagepicker/RxImagePicker;->allowMultipleImages:Z

    const-string v2, "android.intent.extra.ALLOW_MULTIPLE"

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    const/16 v1, 0x40

    .line 199
    invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    goto :goto_0

    .line 201
    :cond_0
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.GET_CONTENT"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    :goto_0
    const-string v1, "android.intent.extra.LOCAL_ONLY"

    const/4 v2, 0x1

    .line 203
    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 204
    invoke-virtual {v0, v2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    const-string v1, "image/*"

    .line 205
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    return-object v0
.end method

.method private final createPickFromGalleryIntent()Landroid/content/Intent;
    .locals 3

    .line 187
    new-instance v0, Landroid/content/Intent;

    sget-object v1, Landroid/provider/MediaStore$Images$Media;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    const-string v2, "android.intent.action.PICK"

    invoke-direct {v0, v2, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 188
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x13

    if-lt v1, v2, :cond_0

    .line 189
    iget-boolean v1, p0, Lcom/mlsdev/rximagepicker/RxImagePicker;->allowMultipleImages:Z

    const-string v2, "android.intent.extra.ALLOW_MULTIPLE"

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    :cond_0
    return-object v0
.end method

.method private final grantWritePermission(Landroid/content/Context;Landroid/content/Intent;Landroid/net/Uri;)V
    .locals 2

    .line 229
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    const/high16 v1, 0x10000

    invoke-virtual {v0, p2, v1}, Landroid/content/pm/PackageManager;->queryIntentActivities(Landroid/content/Intent;I)Ljava/util/List;

    move-result-object p2

    .line 230
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/pm/ResolveInfo;

    .line 231
    iget-object v0, v0, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    iget-object v0, v0, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    const/4 v1, 0x3

    .line 232
    invoke-virtual {p1, v0, p3, v1}, Landroid/content/Context;->grantUriPermission(Ljava/lang/String;Landroid/net/Uri;I)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method private final handleGalleryResult(Landroid/content/Intent;)V
    .locals 5

    .line 107
    iget-boolean v0, p0, Lcom/mlsdev/rximagepicker/RxImagePicker;->allowMultipleImages:Z

    if-eqz v0, :cond_3

    .line 108
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    if-nez p1, :cond_0

    .line 109
    invoke-static {}, Lkotlin/jvm/internal/Intrinsics;->throwNpe()V

    :cond_0
    invoke-virtual {p1}, Landroid/content/Intent;->getClipData()Landroid/content/ClipData;

    move-result-object v1

    if-eqz v1, :cond_1

    const/4 p1, 0x0

    .line 111
    invoke-virtual {v1}, Landroid/content/ClipData;->getItemCount()I

    move-result v2

    :goto_0
    if-ge p1, v2, :cond_2

    .line 112
    invoke-virtual {v1, p1}, Landroid/content/ClipData;->getItemAt(I)Landroid/content/ClipData$Item;

    move-result-object v3

    const-string v4, "clipData.getItemAt(i)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3}, Landroid/content/ClipData$Item;->getUri()Landroid/net/Uri;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    .line 115
    :cond_1
    invoke-virtual {p1}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 117
    :cond_2
    check-cast v0, Ljava/util/List;

    invoke-direct {p0, v0}, Lcom/mlsdev/rximagepicker/RxImagePicker;->onImagesPicked(Ljava/util/List;)V

    goto :goto_1

    :cond_3
    if-nez p1, :cond_4

    .line 119
    invoke-static {}, Lkotlin/jvm/internal/Intrinsics;->throwNpe()V

    :cond_4
    invoke-virtual {p1}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/mlsdev/rximagepicker/RxImagePicker;->onImagePicked(Landroid/net/Uri;)V

    :goto_1
    return-void
.end method

.method private final initSubjects()V
    .locals 2

    .line 62
    invoke-static {}, Lio/reactivex/subjects/PublishSubject;->create()Lio/reactivex/subjects/PublishSubject;

    move-result-object v0

    const-string v1, "PublishSubject.create()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/mlsdev/rximagepicker/RxImagePicker;->publishSubject:Lio/reactivex/subjects/PublishSubject;

    .line 63
    invoke-static {}, Lio/reactivex/subjects/PublishSubject;->create()Lio/reactivex/subjects/PublishSubject;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/mlsdev/rximagepicker/RxImagePicker;->attachedSubject:Lio/reactivex/subjects/PublishSubject;

    .line 64
    invoke-static {}, Lio/reactivex/subjects/PublishSubject;->create()Lio/reactivex/subjects/PublishSubject;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/mlsdev/rximagepicker/RxImagePicker;->canceledSubject:Lio/reactivex/subjects/PublishSubject;

    .line 65
    invoke-static {}, Lio/reactivex/subjects/PublishSubject;->create()Lio/reactivex/subjects/PublishSubject;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/mlsdev/rximagepicker/RxImagePicker;->publishSubjectMultipleImages:Lio/reactivex/subjects/PublishSubject;

    return-void
.end method

.method private final isPhoto(Landroid/content/Intent;)Z
    .locals 1

    if-eqz p1, :cond_1

    .line 103
    invoke-virtual {p1}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Landroid/content/Intent;->getClipData()Landroid/content/ClipData;

    move-result-object p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method private final onImagePicked(Landroid/net/Uri;)V
    .locals 2

    .line 242
    iget-object v0, p0, Lcom/mlsdev/rximagepicker/RxImagePicker;->publishSubject:Lio/reactivex/subjects/PublishSubject;

    const-string v1, "publishSubject"

    if-nez v0, :cond_0

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    :cond_0
    if-nez p1, :cond_1

    invoke-static {}, Lkotlin/jvm/internal/Intrinsics;->throwNpe()V

    :cond_1
    invoke-virtual {v0, p1}, Lio/reactivex/subjects/PublishSubject;->onNext(Ljava/lang/Object;)V

    .line 243
    iget-object p1, p0, Lcom/mlsdev/rximagepicker/RxImagePicker;->publishSubject:Lio/reactivex/subjects/PublishSubject;

    if-nez p1, :cond_2

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    :cond_2
    invoke-virtual {p1}, Lio/reactivex/subjects/PublishSubject;->onComplete()V

    return-void
.end method

.method private final onImagesPicked(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Landroid/net/Uri;",
            ">;)V"
        }
    .end annotation

    .line 237
    iget-object v0, p0, Lcom/mlsdev/rximagepicker/RxImagePicker;->publishSubjectMultipleImages:Lio/reactivex/subjects/PublishSubject;

    const-string v1, "publishSubjectMultipleImages"

    if-nez v0, :cond_0

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    :cond_0
    invoke-virtual {v0, p1}, Lio/reactivex/subjects/PublishSubject;->onNext(Ljava/lang/Object;)V

    .line 238
    iget-object p1, p0, Lcom/mlsdev/rximagepicker/RxImagePicker;->publishSubjectMultipleImages:Lio/reactivex/subjects/PublishSubject;

    if-nez p1, :cond_1

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    :cond_1
    invoke-virtual {p1}, Lio/reactivex/subjects/PublishSubject;->onComplete()V

    return-void
.end method

.method private final pickImage()V
    .locals 5

    .line 132
    invoke-direct {p0}, Lcom/mlsdev/rximagepicker/RxImagePicker;->checkPermission()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 137
    check-cast v1, Landroid/content/Intent;

    .line 139
    iget-object v2, p0, Lcom/mlsdev/rximagepicker/RxImagePicker;->imageSource:Lcom/mlsdev/rximagepicker/Sources;

    const/16 v3, 0x64

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    sget-object v4, Lcom/mlsdev/rximagepicker/RxImagePicker$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v2}, Lcom/mlsdev/rximagepicker/Sources;->ordinal()I

    move-result v2

    aget v2, v4, v2

    const/4 v4, 0x1

    if-eq v2, v4, :cond_5

    const/4 v4, 0x2

    if-eq v2, v4, :cond_4

    const/4 v4, 0x3

    if-eq v2, v4, :cond_3

    const/4 v3, 0x4

    if-eq v2, v3, :cond_2

    goto :goto_1

    .line 156
    :cond_2
    iget-object v0, p0, Lcom/mlsdev/rximagepicker/RxImagePicker;->chooserTitle:Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/mlsdev/rximagepicker/RxImagePicker;->createChooserIntent(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v1

    const/16 v0, 0x66

    goto :goto_1

    .line 152
    :cond_3
    invoke-direct {p0}, Lcom/mlsdev/rximagepicker/RxImagePicker;->createPickFromDocumentsIntent()Landroid/content/Intent;

    move-result-object v1

    goto :goto_0

    .line 148
    :cond_4
    invoke-direct {p0}, Lcom/mlsdev/rximagepicker/RxImagePicker;->createPickFromGalleryIntent()Landroid/content/Intent;

    move-result-object v1

    :goto_0
    const/16 v0, 0x64

    goto :goto_1

    .line 141
    :cond_5
    invoke-direct {p0}, Lcom/mlsdev/rximagepicker/RxImagePicker;->createImageUri()Landroid/net/Uri;

    move-result-object v0

    sput-object v0, Lcom/mlsdev/rximagepicker/RxImagePicker;->cameraPictureUrl:Landroid/net/Uri;

    .line 142
    new-instance v1, Landroid/content/Intent;

    const-string v0, "android.media.action.IMAGE_CAPTURE"

    invoke-direct {v1, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 143
    sget-object v0, Lcom/mlsdev/rximagepicker/RxImagePicker;->cameraPictureUrl:Landroid/net/Uri;

    check-cast v0, Landroid/os/Parcelable;

    const-string v2, "output"

    invoke-virtual {v1, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 144
    invoke-virtual {p0}, Lcom/mlsdev/rximagepicker/RxImagePicker;->getContext()Landroid/content/Context;

    move-result-object v0

    if-nez v0, :cond_6

    invoke-static {}, Lkotlin/jvm/internal/Intrinsics;->throwNpe()V

    :cond_6
    const-string v2, "context!!"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Lcom/mlsdev/rximagepicker/RxImagePicker;->cameraPictureUrl:Landroid/net/Uri;

    if-nez v2, :cond_7

    invoke-static {}, Lkotlin/jvm/internal/Intrinsics;->throwNpe()V

    :cond_7
    invoke-direct {p0, v0, v1, v2}, Lcom/mlsdev/rximagepicker/RxImagePicker;->grantWritePermission(Landroid/content/Context;Landroid/content/Intent;Landroid/net/Uri;)V

    const/16 v0, 0x65

    .line 161
    :goto_1
    invoke-virtual {p0, v1, v0}, Lcom/mlsdev/rximagepicker/RxImagePicker;->startActivityForResult(Landroid/content/Intent;I)V

    return-void
.end method

.method private final requestPickImage()V
    .locals 2

    .line 124
    invoke-virtual {p0}, Lcom/mlsdev/rximagepicker/RxImagePicker;->isAdded()Z

    move-result v0

    if-nez v0, :cond_1

    .line 125
    iget-object v0, p0, Lcom/mlsdev/rximagepicker/RxImagePicker;->attachedSubject:Lio/reactivex/subjects/PublishSubject;

    if-nez v0, :cond_0

    const-string v1, "attachedSubject"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    :cond_0
    new-instance v1, Lcom/mlsdev/rximagepicker/RxImagePicker$requestPickImage$1;

    invoke-direct {v1, p0}, Lcom/mlsdev/rximagepicker/RxImagePicker$requestPickImage$1;-><init>(Lcom/mlsdev/rximagepicker/RxImagePicker;)V

    check-cast v1, Lio/reactivex/functions/Consumer;

    invoke-virtual {v0, v1}, Lio/reactivex/subjects/PublishSubject;->subscribe(Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    goto :goto_0

    .line 127
    :cond_1
    invoke-direct {p0}, Lcom/mlsdev/rximagepicker/RxImagePicker;->pickImage()V

    :goto_0
    return-void
.end method


# virtual methods
.method public _$_clearFindViewByIdCache()V
    .locals 1

    iget-object v0, p0, Lcom/mlsdev/rximagepicker/RxImagePicker;->_$_findViewCache:Ljava/util/HashMap;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    :cond_0
    return-void
.end method

.method public _$_findCachedViewById(I)Landroid/view/View;
    .locals 2

    iget-object v0, p0, Lcom/mlsdev/rximagepicker/RxImagePicker;->_$_findViewCache:Ljava/util/HashMap;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/mlsdev/rximagepicker/RxImagePicker;->_$_findViewCache:Ljava/util/HashMap;

    :cond_0
    iget-object v0, p0, Lcom/mlsdev/rximagepicker/RxImagePicker;->_$_findViewCache:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    if-nez v0, :cond_2

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getView()Landroid/view/View;

    move-result-object v0

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return-object p1

    :cond_1
    invoke-virtual {v0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iget-object v1, p0, Lcom/mlsdev/rximagepicker/RxImagePicker;->_$_findViewCache:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v1, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    return-object v0
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 1

    const/4 v0, -0x1

    if-ne p2, v0, :cond_1

    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 91
    :pswitch_0
    invoke-direct {p0, p3}, Lcom/mlsdev/rximagepicker/RxImagePicker;->isPhoto(Landroid/content/Intent;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 92
    sget-object p1, Lcom/mlsdev/rximagepicker/RxImagePicker;->cameraPictureUrl:Landroid/net/Uri;

    invoke-direct {p0, p1}, Lcom/mlsdev/rximagepicker/RxImagePicker;->onImagePicked(Landroid/net/Uri;)V

    goto :goto_0

    .line 94
    :cond_0
    invoke-direct {p0, p3}, Lcom/mlsdev/rximagepicker/RxImagePicker;->handleGalleryResult(Landroid/content/Intent;)V

    goto :goto_0

    .line 90
    :pswitch_1
    sget-object p1, Lcom/mlsdev/rximagepicker/RxImagePicker;->cameraPictureUrl:Landroid/net/Uri;

    invoke-direct {p0, p1}, Lcom/mlsdev/rximagepicker/RxImagePicker;->onImagePicked(Landroid/net/Uri;)V

    goto :goto_0

    .line 89
    :pswitch_2
    invoke-direct {p0, p3}, Lcom/mlsdev/rximagepicker/RxImagePicker;->handleGalleryResult(Landroid/content/Intent;)V

    goto :goto_0

    .line 98
    :cond_1
    iget-object p2, p0, Lcom/mlsdev/rximagepicker/RxImagePicker;->canceledSubject:Lio/reactivex/subjects/PublishSubject;

    if-nez p2, :cond_2

    const-string p3, "canceledSubject"

    invoke-static {p3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    :cond_2
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p2, p1}, Lio/reactivex/subjects/PublishSubject;->onNext(Ljava/lang/Object;)V

    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x64
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public onAttach(Landroid/content/Context;)V
    .locals 4

    .line 69
    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->onAttach(Landroid/content/Context;)V

    .line 70
    move-object p1, p0

    check-cast p1, Lcom/mlsdev/rximagepicker/RxImagePicker;

    iget-object v0, p1, Lcom/mlsdev/rximagepicker/RxImagePicker;->attachedSubject:Lio/reactivex/subjects/PublishSubject;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    xor-int/2addr v0, v2

    .line 71
    iget-object v3, p1, Lcom/mlsdev/rximagepicker/RxImagePicker;->publishSubject:Lio/reactivex/subjects/PublishSubject;

    if-eqz v3, :cond_1

    const/4 v3, 0x1

    goto :goto_1

    :cond_1
    const/4 v3, 0x0

    :goto_1
    xor-int/2addr v3, v2

    or-int/2addr v0, v3

    .line 72
    iget-object v3, p1, Lcom/mlsdev/rximagepicker/RxImagePicker;->publishSubjectMultipleImages:Lio/reactivex/subjects/PublishSubject;

    if-eqz v3, :cond_2

    const/4 v3, 0x1

    goto :goto_2

    :cond_2
    const/4 v3, 0x0

    :goto_2
    xor-int/2addr v3, v2

    or-int/2addr v0, v3

    .line 73
    iget-object p1, p1, Lcom/mlsdev/rximagepicker/RxImagePicker;->canceledSubject:Lio/reactivex/subjects/PublishSubject;

    if-eqz p1, :cond_3

    const/4 v1, 0x1

    :cond_3
    xor-int/lit8 p1, v1, 0x1

    or-int/2addr p1, v0

    if-eqz p1, :cond_4

    .line 74
    invoke-direct {p0}, Lcom/mlsdev/rximagepicker/RxImagePicker;->initSubjects()V

    .line 76
    :cond_4
    iget-object p1, p0, Lcom/mlsdev/rximagepicker/RxImagePicker;->attachedSubject:Lio/reactivex/subjects/PublishSubject;

    const-string v0, "attachedSubject"

    if-nez p1, :cond_5

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    :cond_5
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {p1, v1}, Lio/reactivex/subjects/PublishSubject;->onNext(Ljava/lang/Object;)V

    .line 77
    iget-object p1, p0, Lcom/mlsdev/rximagepicker/RxImagePicker;->attachedSubject:Lio/reactivex/subjects/PublishSubject;

    if-nez p1, :cond_6

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    :cond_6
    invoke-virtual {p1}, Lio/reactivex/subjects/PublishSubject;->onComplete()V

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 0

    .line 57
    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->onCreate(Landroid/os/Bundle;)V

    const/4 p1, 0x1

    .line 58
    invoke-virtual {p0, p1}, Lcom/mlsdev/rximagepicker/RxImagePicker;->setRetainInstance(Z)V

    return-void
.end method

.method public synthetic onDestroyView()V
    .locals 0

    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onDestroyView()V

    invoke-virtual {p0}, Lcom/mlsdev/rximagepicker/RxImagePicker;->_$_clearFindViewByIdCache()V

    return-void
.end method

.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .locals 1

    const-string p1, "permissions"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "grantResults"

    invoke-static {p3, p1}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 81
    array-length p1, p3

    const/4 p2, 0x1

    const/4 v0, 0x0

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    xor-int/2addr p1, p2

    if-eqz p1, :cond_1

    aget p1, p3, v0

    if-nez p1, :cond_1

    .line 82
    invoke-direct {p0}, Lcom/mlsdev/rximagepicker/RxImagePicker;->pickImage()V

    :cond_1
    return-void
.end method

.method public final requestImage(Lcom/mlsdev/rximagepicker/Sources;)Lio/reactivex/Observable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/mlsdev/rximagepicker/Sources;",
            ")",
            "Lio/reactivex/Observable<",
            "Landroid/net/Uri;",
            ">;"
        }
    .end annotation

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    invoke-direct {p0}, Lcom/mlsdev/rximagepicker/RxImagePicker;->initSubjects()V

    const/4 v0, 0x0

    .line 41
    iput-boolean v0, p0, Lcom/mlsdev/rximagepicker/RxImagePicker;->allowMultipleImages:Z

    .line 42
    iput-object p1, p0, Lcom/mlsdev/rximagepicker/RxImagePicker;->imageSource:Lcom/mlsdev/rximagepicker/Sources;

    .line 43
    invoke-direct {p0}, Lcom/mlsdev/rximagepicker/RxImagePicker;->requestPickImage()V

    .line 44
    iget-object p1, p0, Lcom/mlsdev/rximagepicker/RxImagePicker;->publishSubject:Lio/reactivex/subjects/PublishSubject;

    if-nez p1, :cond_0

    const-string v0, "publishSubject"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, Lcom/mlsdev/rximagepicker/RxImagePicker;->canceledSubject:Lio/reactivex/subjects/PublishSubject;

    if-nez v0, :cond_1

    const-string v1, "canceledSubject"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    :cond_1
    check-cast v0, Lio/reactivex/ObservableSource;

    invoke-virtual {p1, v0}, Lio/reactivex/subjects/PublishSubject;->takeUntil(Lio/reactivex/ObservableSource;)Lio/reactivex/Observable;

    move-result-object p1

    const-string v0, "publishSubject.takeUntil(canceledSubject)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final requestImage(Lcom/mlsdev/rximagepicker/Sources;Ljava/lang/String;)Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/mlsdev/rximagepicker/Sources;",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/Observable<",
            "Landroid/net/Uri;",
            ">;"
        }
    .end annotation

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    iput-object p2, p0, Lcom/mlsdev/rximagepicker/RxImagePicker;->chooserTitle:Ljava/lang/String;

    .line 36
    invoke-virtual {p0, p1}, Lcom/mlsdev/rximagepicker/RxImagePicker;->requestImage(Lcom/mlsdev/rximagepicker/Sources;)Lio/reactivex/Observable;

    move-result-object p1

    return-object p1
.end method

.method public final requestMultipleImages()Lio/reactivex/Observable;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Ljava/util/List<",
            "Landroid/net/Uri;",
            ">;>;"
        }
    .end annotation

    .line 49
    invoke-direct {p0}, Lcom/mlsdev/rximagepicker/RxImagePicker;->initSubjects()V

    .line 50
    sget-object v0, Lcom/mlsdev/rximagepicker/Sources;->GALLERY:Lcom/mlsdev/rximagepicker/Sources;

    iput-object v0, p0, Lcom/mlsdev/rximagepicker/RxImagePicker;->imageSource:Lcom/mlsdev/rximagepicker/Sources;

    const/4 v0, 0x1

    .line 51
    iput-boolean v0, p0, Lcom/mlsdev/rximagepicker/RxImagePicker;->allowMultipleImages:Z

    .line 52
    invoke-direct {p0}, Lcom/mlsdev/rximagepicker/RxImagePicker;->requestPickImage()V

    .line 53
    iget-object v0, p0, Lcom/mlsdev/rximagepicker/RxImagePicker;->publishSubjectMultipleImages:Lio/reactivex/subjects/PublishSubject;

    if-nez v0, :cond_0

    const-string v1, "publishSubjectMultipleImages"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    :cond_0
    iget-object v1, p0, Lcom/mlsdev/rximagepicker/RxImagePicker;->canceledSubject:Lio/reactivex/subjects/PublishSubject;

    if-nez v1, :cond_1

    const-string v2, "canceledSubject"

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    :cond_1
    check-cast v1, Lio/reactivex/ObservableSource;

    invoke-virtual {v0, v1}, Lio/reactivex/subjects/PublishSubject;->takeUntil(Lio/reactivex/ObservableSource;)Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "publishSubjectMultipleIm\u2026akeUntil(canceledSubject)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
