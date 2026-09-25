.class public Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/utils/BoundaryFillFormatter;
.super Ljava/lang/Object;
.source "BoundaryFillFormatter.java"

# interfaces
.implements Lcom/github/mikephil/charting/formatter/IFillFormatter;


# instance fields
.field private boundaryDataSet:Lcom/github/mikephil/charting/interfaces/datasets/ILineDataSet;


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    .line 16
    invoke-direct {p0, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/utils/BoundaryFillFormatter;-><init>(Lcom/github/mikephil/charting/interfaces/datasets/ILineDataSet;)V

    return-void
.end method

.method public constructor <init>(Lcom/github/mikephil/charting/interfaces/datasets/ILineDataSet;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "boundaryDataSet"
        }
    .end annotation

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/utils/BoundaryFillFormatter;->boundaryDataSet:Lcom/github/mikephil/charting/interfaces/datasets/ILineDataSet;

    return-void
.end method


# virtual methods
.method public getBoundaryDataSet()Lcom/github/mikephil/charting/data/LineDataSet;
    .locals 1

    .line 30
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/utils/BoundaryFillFormatter;->boundaryDataSet:Lcom/github/mikephil/charting/interfaces/datasets/ILineDataSet;

    check-cast v0, Lcom/github/mikephil/charting/data/LineDataSet;

    return-object v0
.end method

.method public getFillLineBoundary()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/github/mikephil/charting/data/Entry;",
            ">;"
        }
    .end annotation

    .line 35
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/utils/BoundaryFillFormatter;->boundaryDataSet:Lcom/github/mikephil/charting/interfaces/datasets/ILineDataSet;

    if-eqz v0, :cond_0

    .line 36
    check-cast v0, Lcom/github/mikephil/charting/data/LineDataSet;

    invoke-virtual {v0}, Lcom/github/mikephil/charting/data/LineDataSet;->getValues()Ljava/util/List;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public getFillLinePosition(Lcom/github/mikephil/charting/interfaces/datasets/ILineDataSet;Lcom/github/mikephil/charting/interfaces/dataprovider/LineDataProvider;)F
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "dataSet",
            "dataProvider"
        }
    .end annotation

    const/4 p1, 0x0

    return p1
.end method
