.class public interface abstract Lpowerwatch/matrix/com/pwgen2android/utils/LanguageController;
.super Ljava/lang/Object;
.source "LanguageController.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0000\u0008f\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0007\u001a\u00020\u0008H&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0008H&J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u000b\u001a\u00020\u000cH&J\u000e\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u000eH&J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0011"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/utils/LanguageController;",
        "",
        "getAppLanguage",
        "Lpowerwatch/matrix/com/pwgen2android/utils/LanguageInfo;",
        "context",
        "Landroid/content/Context;",
        "getLanguage",
        "languageKey",
        "",
        "getLanguageByKey",
        "getLanguageByResourceID",
        "languageID",
        "",
        "getLocales",
        "",
        "initSetLanguage",
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


# virtual methods
.method public abstract getAppLanguage(Landroid/content/Context;)Lpowerwatch/matrix/com/pwgen2android/utils/LanguageInfo;
.end method

.method public abstract getLanguage(Ljava/lang/String;)Lpowerwatch/matrix/com/pwgen2android/utils/LanguageInfo;
.end method

.method public abstract getLanguageByKey(Ljava/lang/String;)Lpowerwatch/matrix/com/pwgen2android/utils/LanguageInfo;
.end method

.method public abstract getLanguageByResourceID(I)Lpowerwatch/matrix/com/pwgen2android/utils/LanguageInfo;
.end method

.method public abstract getLocales()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/utils/LanguageInfo;",
            ">;"
        }
    .end annotation
.end method

.method public abstract initSetLanguage(Landroid/content/Context;)V
.end method
