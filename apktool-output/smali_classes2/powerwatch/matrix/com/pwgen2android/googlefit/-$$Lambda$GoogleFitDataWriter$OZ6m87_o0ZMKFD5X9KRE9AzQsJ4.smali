.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitDataWriter$OZ6m87_o0ZMKFD5X9KRE9AzQsJ4;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/SingleOnSubscribe;


# instance fields
.field public final synthetic f$0:Ljava/util/List;

.field public final synthetic f$1:Landroid/content/Context;

.field public final synthetic f$2:Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitDataWriter$OZ6m87_o0ZMKFD5X9KRE9AzQsJ4;->f$0:Ljava/util/List;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitDataWriter$OZ6m87_o0ZMKFD5X9KRE9AzQsJ4;->f$1:Landroid/content/Context;

    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitDataWriter$OZ6m87_o0ZMKFD5X9KRE9AzQsJ4;->f$2:Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;

    return-void
.end method


# virtual methods
.method public final subscribe(Lio/reactivex/SingleEmitter;)V
    .locals 3

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitDataWriter$OZ6m87_o0ZMKFD5X9KRE9AzQsJ4;->f$0:Ljava/util/List;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitDataWriter$OZ6m87_o0ZMKFD5X9KRE9AzQsJ4;->f$1:Landroid/content/Context;

    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitDataWriter$OZ6m87_o0ZMKFD5X9KRE9AzQsJ4;->f$2:Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;

    invoke-static {v0, v1, v2, p1}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;->lambda$OZ6m87_o0ZMKFD5X9KRE9AzQsJ4(Ljava/util/List;Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;Lio/reactivex/SingleEmitter;)V

    return-void
.end method
