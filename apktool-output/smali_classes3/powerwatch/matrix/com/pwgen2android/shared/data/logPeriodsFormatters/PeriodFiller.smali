.class public interface abstract Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/PeriodFiller;
.super Ljava/lang/Object;
.source "PeriodFiller.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<INPUT:",
        "Ljava/lang/Object;",
        "OUTPUT:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0008\u0005\u0008f\u0018\u0000*\u0004\u0008\u0000\u0010\u0001*\u0004\u0008\u0001\u0010\u00022\u00020\u0003J#\u0010\u0004\u001a\u00028\u00012\u0006\u0010\u0005\u001a\u00028\u00012\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0007H&\u00a2\u0006\u0002\u0010\u0008J\u001d\u0010\t\u001a\u00028\u00012\u0006\u0010\u0005\u001a\u00028\u00012\u0006\u0010\n\u001a\u00028\u0001H&\u00a2\u0006\u0002\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/PeriodFiller;",
        "INPUT",
        "OUTPUT",
        "",
        "fill",
        "output",
        "inputs",
        "",
        "(Ljava/lang/Object;Ljava/util/List;)Ljava/lang/Object;",
        "mergePeriod",
        "periodToMerge",
        "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;",
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
.method public abstract fill(Ljava/lang/Object;Ljava/util/List;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TOUTPUT;",
            "Ljava/util/List<",
            "+TINPUT;>;)TOUTPUT;"
        }
    .end annotation
.end method

.method public abstract mergePeriod(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TOUTPUT;TOUTPUT;)TOUTPUT;"
        }
    .end annotation
.end method
