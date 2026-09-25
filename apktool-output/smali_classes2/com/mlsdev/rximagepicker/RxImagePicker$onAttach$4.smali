.class final Lcom/mlsdev/rximagepicker/RxImagePicker$onAttach$4;
.super Lkotlin/jvm/internal/MutablePropertyReference0;
.source "RxImagePicker.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    k = 0x3
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# direct methods
.method constructor <init>(Lcom/mlsdev/rximagepicker/RxImagePicker;)V
    .locals 0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/MutablePropertyReference0;-><init>(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public get()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/mlsdev/rximagepicker/RxImagePicker$onAttach$4;->receiver:Ljava/lang/Object;

    check-cast v0, Lcom/mlsdev/rximagepicker/RxImagePicker;

    .line 73
    invoke-static {v0}, Lcom/mlsdev/rximagepicker/RxImagePicker;->access$getCanceledSubject$p(Lcom/mlsdev/rximagepicker/RxImagePicker;)Lio/reactivex/subjects/PublishSubject;

    move-result-object v0

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    const-string v0, "canceledSubject"

    return-object v0
.end method

.method public getOwner()Lkotlin/reflect/KDeclarationContainer;
    .locals 1

    const-class v0, Lcom/mlsdev/rximagepicker/RxImagePicker;

    invoke-static {v0}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v0

    return-object v0
.end method

.method public getSignature()Ljava/lang/String;
    .locals 1

    const-string v0, "getCanceledSubject()Lio/reactivex/subjects/PublishSubject;"

    return-object v0
.end method

.method public set(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lcom/mlsdev/rximagepicker/RxImagePicker$onAttach$4;->receiver:Ljava/lang/Object;

    check-cast v0, Lcom/mlsdev/rximagepicker/RxImagePicker;

    .line 73
    check-cast p1, Lio/reactivex/subjects/PublishSubject;

    invoke-static {v0, p1}, Lcom/mlsdev/rximagepicker/RxImagePicker;->access$setCanceledSubject$p(Lcom/mlsdev/rximagepicker/RxImagePicker;Lio/reactivex/subjects/PublishSubject;)V

    return-void
.end method
