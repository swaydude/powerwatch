.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/sdk/channels/-$$Lambda$Gen2HeartRateChannel$tHRbzWvrT0q9meASe_eHC4zIKDI;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# static fields
.field public static final synthetic INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/channels/-$$Lambda$Gen2HeartRateChannel$tHRbzWvrT0q9meASe_eHC4zIKDI;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/-$$Lambda$Gen2HeartRateChannel$tHRbzWvrT0q9meASe_eHC4zIKDI;

    invoke-direct {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/-$$Lambda$Gen2HeartRateChannel$tHRbzWvrT0q9meASe_eHC4zIKDI;-><init>()V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/-$$Lambda$Gen2HeartRateChannel$tHRbzWvrT0q9meASe_eHC4zIKDI;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/channels/-$$Lambda$Gen2HeartRateChannel$tHRbzWvrT0q9meASe_eHC4zIKDI;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lio/reactivex/Observable;

    invoke-static {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/Gen2HeartRateChannel;->lambda$tHRbzWvrT0q9meASe_eHC4zIKDI(Lio/reactivex/Observable;)Lio/reactivex/ObservableSource;

    move-result-object p1

    return-object p1
.end method
