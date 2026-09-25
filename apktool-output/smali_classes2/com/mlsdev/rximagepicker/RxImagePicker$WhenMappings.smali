.class public final synthetic Lcom/mlsdev/rximagepicker/RxImagePicker$WhenMappings;
.super Ljava/lang/Object;


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


# static fields
.field public static final synthetic $EnumSwitchMapping$0:[I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    invoke-static {}, Lcom/mlsdev/rximagepicker/Sources;->values()[Lcom/mlsdev/rximagepicker/Sources;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sput-object v0, Lcom/mlsdev/rximagepicker/RxImagePicker$WhenMappings;->$EnumSwitchMapping$0:[I

    sget-object v1, Lcom/mlsdev/rximagepicker/Sources;->CAMERA:Lcom/mlsdev/rximagepicker/Sources;

    invoke-virtual {v1}, Lcom/mlsdev/rximagepicker/Sources;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    aput v2, v0, v1

    sget-object v1, Lcom/mlsdev/rximagepicker/Sources;->GALLERY:Lcom/mlsdev/rximagepicker/Sources;

    invoke-virtual {v1}, Lcom/mlsdev/rximagepicker/Sources;->ordinal()I

    move-result v1

    const/4 v2, 0x2

    aput v2, v0, v1

    sget-object v1, Lcom/mlsdev/rximagepicker/Sources;->DOCUMENTS:Lcom/mlsdev/rximagepicker/Sources;

    invoke-virtual {v1}, Lcom/mlsdev/rximagepicker/Sources;->ordinal()I

    move-result v1

    const/4 v2, 0x3

    aput v2, v0, v1

    sget-object v1, Lcom/mlsdev/rximagepicker/Sources;->CHOOSER:Lcom/mlsdev/rximagepicker/Sources;

    invoke-virtual {v1}, Lcom/mlsdev/rximagepicker/Sources;->ordinal()I

    move-result v1

    const/4 v2, 0x4

    aput v2, v0, v1

    return-void
.end method
