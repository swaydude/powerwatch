.class public abstract Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/PeriodFillerImpl;
.super Ljava/lang/Object;
.source "PeriodFiller.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/PeriodFiller;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<INPUT::",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/BaseLog;",
        "OUTPUT::",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/BaseActivityPeriod;",
        ">",
        "Ljava/lang/Object;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/PeriodFiller<",
        "TINPUT;TOUTPUT;>;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nPeriodFiller.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PeriodFiller.kt\npowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/PeriodFillerImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,154:1\n2820#2,5:155\n2820#2,5:160\n2190#2,14:165\n1895#2,14:179\n764#2:193\n855#2,2:194\n2190#2,14:196\n764#2:210\n855#2,2:211\n1547#2:213\n1618#2,3:214\n764#2:217\n855#2,2:218\n1895#2,14:220\n2820#2,5:234\n2833#2,5:239\n2833#2,5:244\n1895#2,14:249\n1547#2:263\n1618#2,3:264\n286#2,2:267\n1895#2,14:269\n2190#2,14:283\n2190#2,14:297\n*S KotlinDebug\n*F\n+ 1 PeriodFiller.kt\npowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/PeriodFillerImpl\n*L\n20#1:155,5\n21#1:160,5\n23#1:165,14\n24#1:179,14\n25#1:193\n25#1:194,2\n25#1:196,14\n28#1:210\n28#1:211,2\n28#1:213\n28#1:214,3\n32#1:217\n32#1:218,2\n32#1:220,14\n34#1:234,5\n35#1:239,5\n36#1:244,5\n37#1:249,14\n38#1:263\n38#1:264,3\n40#1:267,2\n42#1:269,14\n43#1:283,14\n45#1:297,14\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010 \n\u0002\u0008\u0005\u0008&\u0018\u0000*\u0008\u0008\u0000\u0010\u0001*\u00020\u0002*\u0008\u0008\u0001\u0010\u0003*\u00020\u00042\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0005B\u0005\u00a2\u0006\u0002\u0010\u0006J#\u0010\u0007\u001a\u00028\u00012\u0006\u0010\u0008\u001a\u00028\u00012\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00028\u00000\nH\u0016\u00a2\u0006\u0002\u0010\u000bJ\u001d\u0010\u000c\u001a\u00028\u00012\u0006\u0010\u0008\u001a\u00028\u00012\u0006\u0010\r\u001a\u00028\u0001H\u0016\u00a2\u0006\u0002\u0010\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/PeriodFillerImpl;",
        "INPUT",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/BaseLog;",
        "OUTPUT",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/BaseActivityPeriod;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/PeriodFiller;",
        "()V",
        "fill",
        "output",
        "inputs",
        "",
        "(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/BaseActivityPeriod;Ljava/util/List;)Lpowerwatch/matrix/com/pwgen2android/shared/data/models/BaseActivityPeriod;",
        "mergePeriod",
        "periodToMerge",
        "(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/BaseActivityPeriod;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/BaseActivityPeriod;)Lpowerwatch/matrix/com/pwgen2android/shared/data/models/BaseActivityPeriod;",
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


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic fill(Ljava/lang/Object;Ljava/util/List;)Ljava/lang/Object;
    .locals 0

    .line 17
    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/BaseActivityPeriod;

    invoke-virtual {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/PeriodFillerImpl;->fill(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/BaseActivityPeriod;Ljava/util/List;)Lpowerwatch/matrix/com/pwgen2android/shared/data/models/BaseActivityPeriod;

    move-result-object p1

    return-object p1
.end method

.method public fill(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/BaseActivityPeriod;Ljava/util/List;)Lpowerwatch/matrix/com/pwgen2android/shared/data/models/BaseActivityPeriod;
    .locals 29
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TOUTPUT;",
            "Ljava/util/List<",
            "+TINPUT;>;)TOUTPUT;"
        }
    .end annotation

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    const-string v2, "output"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "inputs"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    check-cast v1, Ljava/lang/Iterable;

    .line 156
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const/4 v4, 0x0

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    .line 157
    check-cast v5, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/BaseLog;

    .line 20
    invoke-interface {v5}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/BaseLog;->getActiveCalories()I

    move-result v5

    add-int/2addr v4, v5

    goto :goto_0

    .line 161
    :cond_0
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const/4 v5, 0x0

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    .line 162
    check-cast v6, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/BaseLog;

    .line 21
    invoke-interface {v6}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/BaseLog;->getBmrCalories()I

    move-result v6

    add-int/2addr v5, v6

    goto :goto_1

    .line 165
    :cond_1
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    .line 166
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-nez v6, :cond_2

    const/4 v6, 0x0

    goto :goto_2

    .line 167
    :cond_2
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    .line 168
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-nez v8, :cond_3

    goto :goto_2

    .line 169
    :cond_3
    move-object v8, v6

    check-cast v8, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/BaseLog;

    .line 23
    invoke-interface {v8}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/BaseLog;->getStartTime()J

    move-result-wide v8

    .line 171
    :cond_4
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    .line 172
    move-object v11, v10

    check-cast v11, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/BaseLog;

    .line 23
    invoke-interface {v11}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/BaseLog;->getStartTime()J

    move-result-wide v11

    cmp-long v13, v8, v11

    if-lez v13, :cond_5

    move-object v6, v10

    move-wide v8, v11

    .line 177
    :cond_5
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-nez v10, :cond_4

    .line 23
    :goto_2
    check-cast v6, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/BaseLog;

    const-wide/16 v10, 0x0

    if-nez v6, :cond_6

    move-wide v12, v10

    goto :goto_3

    :cond_6
    invoke-interface {v6}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/BaseLog;->getStartTime()J

    move-result-wide v8

    move-wide v12, v8

    .line 179
    :goto_3
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v14

    .line 180
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-nez v2, :cond_7

    const/4 v2, 0x0

    goto :goto_4

    .line 181
    :cond_7
    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 182
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-nez v6, :cond_8

    goto :goto_4

    .line 183
    :cond_8
    move-object v6, v2

    check-cast v6, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/BaseLog;

    .line 24
    invoke-interface {v6}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/BaseLog;->getEndTime()J

    move-result-wide v8

    .line 185
    :cond_9
    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    .line 186
    move-object v15, v6

    check-cast v15, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/BaseLog;

    .line 24
    invoke-interface {v15}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/BaseLog;->getEndTime()J

    move-result-wide v15

    cmp-long v17, v8, v15

    if-gez v17, :cond_a

    move-object v2, v6

    move-wide v8, v15

    .line 191
    :cond_a
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-nez v6, :cond_9

    .line 24
    :goto_4
    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/BaseLog;

    if-nez v2, :cond_b

    goto :goto_5

    :cond_b
    invoke-interface {v2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/BaseLog;->getEndTime()J

    move-result-wide v10

    :goto_5
    move-wide v8, v10

    .line 193
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    check-cast v2, Ljava/util/Collection;

    .line 194
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_c
    :goto_6
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_e

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    move-object v11, v10

    check-cast v11, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/BaseLog;

    .line 25
    invoke-interface {v11}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/BaseLog;->getMinHeartRate()I

    move-result v11

    if-lez v11, :cond_d

    const/4 v15, 0x1

    goto :goto_7

    :cond_d
    const/4 v15, 0x0

    :goto_7
    if-eqz v15, :cond_c

    invoke-interface {v2, v10}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_6

    .line 195
    :cond_e
    check-cast v2, Ljava/util/List;

    .line 193
    check-cast v2, Ljava/lang/Iterable;

    .line 196
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    .line 197
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-nez v2, :cond_f

    const/4 v2, 0x0

    goto :goto_8

    .line 198
    :cond_f
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 199
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-nez v10, :cond_10

    goto :goto_8

    .line 200
    :cond_10
    move-object v10, v2

    check-cast v10, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/BaseLog;

    .line 25
    invoke-interface {v10}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/BaseLog;->getMinHeartRate()I

    move-result v10

    .line 202
    :cond_11
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    .line 203
    move-object v14, v11

    check-cast v14, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/BaseLog;

    .line 25
    invoke-interface {v14}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/BaseLog;->getMinHeartRate()I

    move-result v14

    if-le v10, v14, :cond_12

    move-object v2, v11

    move v10, v14

    .line 208
    :cond_12
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-nez v11, :cond_11

    .line 25
    :goto_8
    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/BaseLog;

    if-nez v2, :cond_13

    const/4 v11, 0x0

    goto :goto_9

    :cond_13
    invoke-interface {v2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/BaseLog;->getMinHeartRate()I

    move-result v2

    move v11, v2

    .line 210
    :goto_9
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    check-cast v2, Ljava/util/Collection;

    .line 211
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_14
    :goto_a
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    const/4 v14, 0x0

    if-eqz v10, :cond_16

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    move-object/from16 v16, v10

    check-cast v16, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/BaseLog;

    .line 28
    invoke-interface/range {v16 .. v16}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/BaseLog;->getHeartRate()F

    move-result v16

    cmpl-float v14, v16, v14

    if-lez v14, :cond_15

    const/4 v14, 0x1

    goto :goto_b

    :cond_15
    const/4 v14, 0x0

    :goto_b
    if-eqz v14, :cond_14

    invoke-interface {v2, v10}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_a

    .line 212
    :cond_16
    check-cast v2, Ljava/util/List;

    .line 210
    check-cast v2, Ljava/lang/Iterable;

    .line 213
    new-instance v6, Ljava/util/ArrayList;

    const/16 v10, 0xa

    invoke-static {v2, v10}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v6, v3}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v6, Ljava/util/Collection;

    .line 214
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_c
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_17

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    .line 215
    check-cast v3, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/BaseLog;

    .line 28
    invoke-interface {v3}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/BaseLog;->getHeartRate()F

    move-result v3

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    invoke-interface {v6, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_c

    .line 216
    :cond_17
    check-cast v6, Ljava/util/List;

    .line 213
    check-cast v6, Ljava/lang/Iterable;

    .line 28
    invoke-static {v6}, Lkotlin/collections/CollectionsKt;->averageOfFloat(Ljava/lang/Iterable;)D

    move-result-wide v2

    double-to-float v2, v2

    .line 29
    invoke-static {v2}, Ljava/lang/Float;->isNaN(F)Z

    move-result v3

    if-eqz v3, :cond_18

    const/4 v3, 0x0

    goto :goto_d

    :cond_18
    move v3, v2

    .line 217
    :goto_d
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    check-cast v2, Ljava/util/Collection;

    .line 218
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_19
    :goto_e
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v16

    if-eqz v16, :cond_1b

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    move-object/from16 v17, v7

    check-cast v17, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/BaseLog;

    .line 32
    invoke-interface/range {v17 .. v17}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/BaseLog;->getMaxHeartRate()I

    move-result v17

    if-lez v17, :cond_1a

    const/16 v17, 0x1

    goto :goto_f

    :cond_1a
    const/16 v17, 0x0

    :goto_f
    if-eqz v17, :cond_19

    invoke-interface {v2, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_e

    .line 219
    :cond_1b
    check-cast v2, Ljava/util/List;

    .line 217
    check-cast v2, Ljava/lang/Iterable;

    .line 220
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    .line 221
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-nez v2, :cond_1c

    const/4 v2, 0x0

    goto :goto_10

    .line 222
    :cond_1c
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 223
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-nez v6, :cond_1d

    goto :goto_10

    .line 224
    :cond_1d
    move-object v6, v2

    check-cast v6, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/BaseLog;

    .line 32
    invoke-interface {v6}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/BaseLog;->getMaxHeartRate()I

    move-result v6

    .line 226
    :cond_1e
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v17

    .line 227
    move-object/from16 v18, v17

    check-cast v18, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/BaseLog;

    .line 32
    invoke-interface/range {v18 .. v18}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/BaseLog;->getMaxHeartRate()I

    move-result v15

    if-ge v6, v15, :cond_1f

    move v6, v15

    move-object/from16 v2, v17

    .line 232
    :cond_1f
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-nez v15, :cond_1e

    .line 32
    :goto_10
    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/BaseLog;

    if-nez v2, :cond_20

    const/4 v15, 0x0

    goto :goto_11

    :cond_20
    invoke-interface {v2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/BaseLog;->getMaxHeartRate()I

    move-result v2

    move v15, v2

    .line 235
    :goto_11
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const/4 v6, 0x0

    :goto_12
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_21

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    .line 236
    check-cast v7, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/BaseLog;

    .line 34
    invoke-interface {v7}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/BaseLog;->getMinsInPeriod()I

    move-result v7

    add-int/2addr v6, v7

    goto :goto_12

    .line 240
    :cond_21
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const-wide/16 v17, 0x0

    move/from16 v21, v15

    move-wide/from16 v14, v17

    :goto_13
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_22

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    .line 241
    check-cast v7, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/BaseLog;

    .line 35
    invoke-interface {v7}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/BaseLog;->getBodyPower()F

    move-result v7

    move/from16 v22, v11

    float-to-double v10, v7

    add-double/2addr v14, v10

    move/from16 v11, v22

    const/16 v10, 0xa

    goto :goto_13

    :cond_22
    move/from16 v22, v11

    .line 245
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    move-wide/from16 v10, v17

    :goto_14
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_23

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    .line 246
    check-cast v7, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/BaseLog;

    .line 36
    invoke-interface {v7}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/BaseLog;->getSolarPower()F

    move-result v7

    move-wide/from16 v17, v14

    float-to-double v14, v7

    add-double/2addr v10, v14

    move-wide/from16 v14, v17

    goto :goto_14

    :cond_23
    move-wide/from16 v17, v14

    .line 249
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v14

    .line 250
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-nez v2, :cond_24

    const/4 v2, 0x0

    goto :goto_17

    .line 251
    :cond_24
    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 252
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-nez v7, :cond_25

    goto :goto_17

    .line 253
    :cond_25
    move-object v7, v2

    check-cast v7, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/BaseLog;

    .line 37
    invoke-interface {v7}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/BaseLog;->getMaxSkinTemp()F

    move-result v7

    .line 255
    :goto_15
    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v15

    .line 256
    move-object/from16 v24, v15

    check-cast v24, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/BaseLog;

    move-object/from16 v25, v2

    .line 37
    invoke-interface/range {v24 .. v24}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/BaseLog;->getMaxSkinTemp()F

    move-result v2

    .line 257
    invoke-static {v7, v2}, Ljava/lang/Float;->compare(FF)I

    move-result v24

    if-gez v24, :cond_26

    move v7, v2

    move-object v2, v15

    goto :goto_16

    :cond_26
    move-object/from16 v2, v25

    .line 261
    :goto_16
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-nez v15, :cond_3c

    .line 37
    :goto_17
    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/BaseLog;

    if-nez v2, :cond_27

    const/4 v15, 0x0

    goto :goto_18

    :cond_27
    invoke-interface {v2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/BaseLog;->getMaxSkinTemp()F

    move-result v2

    move v15, v2

    .line 263
    :goto_18
    new-instance v2, Ljava/util/ArrayList;

    const/16 v7, 0xa

    invoke-static {v1, v7}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v7

    invoke-direct {v2, v7}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v2, Ljava/util/Collection;

    .line 264
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_19
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_28

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    .line 265
    check-cast v14, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/BaseLog;

    .line 38
    invoke-interface {v14}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/BaseLog;->getSkinTemp()F

    move-result v14

    invoke-static {v14}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v14

    invoke-interface {v2, v14}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_19

    .line 266
    :cond_28
    check-cast v2, Ljava/util/List;

    .line 263
    check-cast v2, Ljava/lang/Iterable;

    move/from16 v23, v15

    .line 38
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->averageOfFloat(Ljava/lang/Iterable;)D

    move-result-wide v14

    double-to-float v15, v14

    .line 267
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_29
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_2b

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    move-object v14, v7

    check-cast v14, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/BaseLog;

    .line 40
    invoke-interface {v14}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/BaseLog;->getHrv()F

    move-result v14

    const/16 v20, 0x0

    cmpl-float v14, v14, v20

    if-lez v14, :cond_2a

    const/4 v14, 0x1

    goto :goto_1a

    :cond_2a
    const/4 v14, 0x0

    :goto_1a
    if-eqz v14, :cond_29

    goto :goto_1b

    :cond_2b
    const/16 v20, 0x0

    const/4 v7, 0x0

    :goto_1b
    check-cast v7, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/BaseLog;

    if-nez v7, :cond_2c

    const/4 v2, 0x0

    goto :goto_1c

    :cond_2c
    invoke-interface {v7}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/BaseLog;->getHrv()F

    move-result v2

    .line 269
    :goto_1c
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v24

    .line 270
    invoke-interface/range {v24 .. v24}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-nez v7, :cond_2d

    const/4 v7, 0x0

    goto :goto_1f

    .line 271
    :cond_2d
    invoke-interface/range {v24 .. v24}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    .line 272
    invoke-interface/range {v24 .. v24}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-nez v14, :cond_2e

    goto :goto_1f

    .line 273
    :cond_2e
    move-object v14, v7

    check-cast v14, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/BaseLog;

    .line 42
    invoke-interface {v14}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/BaseLog;->getCaseTemp()F

    move-result v14

    .line 275
    :goto_1d
    invoke-interface/range {v24 .. v24}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v19

    .line 276
    move-object/from16 v25, v19

    check-cast v25, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/BaseLog;

    move-object/from16 p2, v7

    .line 42
    invoke-interface/range {v25 .. v25}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/BaseLog;->getCaseTemp()F

    move-result v7

    .line 277
    invoke-static {v14, v7}, Ljava/lang/Float;->compare(FF)I

    move-result v25

    if-gez v25, :cond_2f

    move v14, v7

    move-object/from16 v7, v19

    goto :goto_1e

    :cond_2f
    move-object/from16 v7, p2

    .line 281
    :goto_1e
    invoke-interface/range {v24 .. v24}, Ljava/util/Iterator;->hasNext()Z

    move-result v19

    if-nez v19, :cond_3b

    .line 42
    :goto_1f
    check-cast v7, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/BaseLog;

    if-nez v7, :cond_30

    const/4 v7, 0x0

    goto :goto_20

    :cond_30
    invoke-interface {v7}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/BaseLog;->getCaseTemp()F

    move-result v7

    .line 283
    :goto_20
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v19

    .line 284
    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-nez v14, :cond_31

    move/from16 v26, v7

    const/4 v14, 0x0

    goto :goto_23

    .line 285
    :cond_31
    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    .line 286
    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->hasNext()Z

    move-result v24

    if-nez v24, :cond_32

    move/from16 v26, v7

    goto :goto_23

    .line 287
    :cond_32
    move-object/from16 v24, v14

    check-cast v24, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/BaseLog;

    .line 43
    invoke-interface/range {v24 .. v24}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/BaseLog;->getCaseTemp()F

    move-result v24

    move-object/from16 p2, v14

    move/from16 v14, v24

    .line 289
    :goto_21
    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v24

    .line 290
    move-object/from16 v25, v24

    check-cast v25, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/BaseLog;

    move/from16 v26, v7

    .line 43
    invoke-interface/range {v25 .. v25}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/BaseLog;->getCaseTemp()F

    move-result v7

    .line 291
    invoke-static {v14, v7}, Ljava/lang/Float;->compare(FF)I

    move-result v25

    if-lez v25, :cond_33

    move v14, v7

    goto :goto_22

    :cond_33
    move-object/from16 v24, p2

    .line 295
    :goto_22
    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-nez v7, :cond_3a

    move-object/from16 v14, v24

    .line 43
    :goto_23
    check-cast v14, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/BaseLog;

    if-nez v14, :cond_34

    const/4 v7, 0x0

    goto :goto_24

    :cond_34
    invoke-interface {v14}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/BaseLog;->getCaseTemp()F

    move-result v7

    .line 297
    :goto_24
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v25

    .line 298
    invoke-interface/range {v25 .. v25}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-nez v1, :cond_35

    const/4 v1, 0x0

    goto :goto_27

    .line 299
    :cond_35
    invoke-interface/range {v25 .. v25}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 300
    invoke-interface/range {v25 .. v25}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-nez v14, :cond_36

    goto :goto_27

    .line 301
    :cond_36
    move-object v14, v1

    check-cast v14, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/BaseLog;

    .line 45
    invoke-interface {v14}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/BaseLog;->getMinSkinTemp()F

    move-result v14

    .line 303
    :goto_25
    invoke-interface/range {v25 .. v25}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v16

    .line 304
    move-object/from16 v19, v16

    check-cast v19, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/BaseLog;

    move-object/from16 p2, v1

    .line 45
    invoke-interface/range {v19 .. v19}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/BaseLog;->getMinSkinTemp()F

    move-result v1

    .line 305
    invoke-static {v14, v1}, Ljava/lang/Float;->compare(FF)I

    move-result v19

    if-lez v19, :cond_37

    move v14, v1

    move-object/from16 v1, v16

    goto :goto_26

    :cond_37
    move-object/from16 v1, p2

    .line 309
    :goto_26
    invoke-interface/range {v25 .. v25}, Ljava/util/Iterator;->hasNext()Z

    move-result v16

    if-nez v16, :cond_39

    .line 45
    :goto_27
    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/BaseLog;

    if-nez v1, :cond_38

    const/4 v14, 0x0

    goto :goto_28

    :cond_38
    invoke-interface {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/BaseLog;->getMinSkinTemp()F

    move-result v14

    .line 49
    :goto_28
    invoke-interface {v0, v12, v13}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/BaseActivityPeriod;->setStartTime(J)V

    .line 50
    invoke-interface {v0, v8, v9}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/BaseActivityPeriod;->setEndTime(J)V

    .line 51
    invoke-interface {v0, v6}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/BaseActivityPeriod;->setMinsInPeriod(I)V

    .line 52
    invoke-interface {v0, v4}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/BaseActivityPeriod;->setActiveCalories(I)V

    .line 53
    invoke-interface {v0, v5}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/BaseActivityPeriod;->setBmrCalories(I)V

    .line 54
    invoke-interface {v0, v3}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/BaseActivityPeriod;->setHeartRate(F)V

    move/from16 v1, v21

    .line 55
    invoke-interface {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/BaseActivityPeriod;->setMaxHeartRate(I)V

    move/from16 v1, v22

    .line 56
    invoke-interface {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/BaseActivityPeriod;->setMinHeartRate(I)V

    move-wide/from16 v3, v17

    double-to-float v1, v3

    .line 57
    invoke-interface {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/BaseActivityPeriod;->setBodyPower(F)V

    double-to-float v1, v10

    .line 58
    invoke-interface {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/BaseActivityPeriod;->setSolarPower(F)V

    move/from16 v1, v23

    .line 59
    invoke-interface {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/BaseActivityPeriod;->setPeakTemp(F)V

    .line 60
    invoke-interface {v0, v2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/BaseActivityPeriod;->setHrv(F)V

    .line 61
    invoke-interface {v0, v15}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/BaseActivityPeriod;->setSkinTemp(F)V

    .line 62
    invoke-interface {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/BaseActivityPeriod;->setMaxSkinTemp(F)V

    .line 63
    invoke-interface {v0, v14}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/BaseActivityPeriod;->setMinSkinTemp(F)V

    move/from16 v1, v26

    .line 64
    invoke-interface {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/BaseActivityPeriod;->setMaxCaseTemp(F)V

    .line 65
    invoke-interface {v0, v7}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/BaseActivityPeriod;->setMinCaseTemp(F)V

    .line 66
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0

    :cond_39
    move-wide/from16 v27, v17

    move/from16 v18, v21

    move/from16 v17, v22

    move-wide/from16 v21, v27

    move/from16 v22, v17

    move/from16 v21, v18

    move-wide/from16 v17, v27

    goto :goto_25

    :cond_3a
    move-wide/from16 v27, v17

    move/from16 v18, v21

    move/from16 v17, v22

    move-wide/from16 v21, v27

    move-object/from16 p2, v24

    move/from16 v7, v26

    move/from16 v22, v17

    move/from16 v21, v18

    move-wide/from16 v17, v27

    goto/16 :goto_21

    :cond_3b
    move-wide/from16 v27, v17

    move/from16 v18, v21

    move/from16 v17, v22

    move-wide/from16 v21, v27

    move/from16 v22, v17

    move/from16 v21, v18

    move-wide/from16 v17, v27

    goto/16 :goto_1d

    :cond_3c
    const/16 v20, 0x0

    move-wide/from16 v27, v17

    move/from16 v18, v21

    move/from16 v17, v22

    move-wide/from16 v21, v27

    move/from16 v22, v17

    move/from16 v21, v18

    move-wide/from16 v17, v27

    goto/16 :goto_15
.end method

.method public bridge synthetic mergePeriod(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 17
    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/BaseActivityPeriod;

    check-cast p2, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/BaseActivityPeriod;

    invoke-virtual {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/PeriodFillerImpl;->mergePeriod(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/BaseActivityPeriod;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/BaseActivityPeriod;)Lpowerwatch/matrix/com/pwgen2android/shared/data/models/BaseActivityPeriod;

    move-result-object p1

    return-object p1
.end method

.method public mergePeriod(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/BaseActivityPeriod;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/BaseActivityPeriod;)Lpowerwatch/matrix/com/pwgen2android/shared/data/models/BaseActivityPeriod;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TOUTPUT;TOUTPUT;)TOUTPUT;"
        }
    .end annotation

    const-string v0, "output"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "periodToMerge"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 72
    invoke-interface {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/BaseActivityPeriod;->getMinsInPeriod()I

    move-result v0

    invoke-interface {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/BaseActivityPeriod;->getMinsInPeriod()I

    move-result v1

    add-int/2addr v0, v1

    if-lez v0, :cond_0

    .line 74
    invoke-interface {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/BaseActivityPeriod;->getHeartRate()F

    move-result v1

    invoke-interface {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/BaseActivityPeriod;->getMinsInPeriod()I

    move-result v2

    int-to-double v2, v2

    int-to-double v4, v0

    div-double/2addr v2, v4

    invoke-static {v2, v3}, Lkotlin/math/MathKt;->roundToInt(D)I

    move-result v0

    int-to-float v0, v0

    mul-float v1, v1, v0

    invoke-interface {p1, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/BaseActivityPeriod;->setHeartRate(F)V

    .line 75
    invoke-interface {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/BaseActivityPeriod;->getHeartRate()F

    invoke-interface {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/BaseActivityPeriod;->getMinsInPeriod()I

    move-result v0

    int-to-double v0, v0

    div-double/2addr v0, v4

    invoke-static {v0, v1}, Lkotlin/math/MathKt;->roundToInt(D)I

    .line 77
    invoke-interface {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/BaseActivityPeriod;->getSkinTemp()F

    move-result v0

    invoke-interface {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/BaseActivityPeriod;->getMinsInPeriod()I

    move-result v1

    int-to-double v1, v1

    div-double/2addr v1, v4

    invoke-static {v1, v2}, Lkotlin/math/MathKt;->roundToInt(D)I

    move-result v1

    int-to-float v1, v1

    mul-float v0, v0, v1

    invoke-interface {p1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/BaseActivityPeriod;->setSkinTemp(F)V

    .line 78
    invoke-interface {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/BaseActivityPeriod;->getSkinTemp()F

    invoke-interface {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/BaseActivityPeriod;->getMinsInPeriod()I

    move-result v0

    int-to-double v0, v0

    div-double/2addr v0, v4

    invoke-static {v0, v1}, Lkotlin/math/MathKt;->roundToInt(D)I

    .line 81
    :cond_0
    invoke-interface {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/BaseActivityPeriod;->getPeakTemp()F

    move-result v0

    invoke-interface {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/BaseActivityPeriod;->getPeakTemp()F

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Math;->max(FF)F

    move-result v0

    invoke-interface {p1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/BaseActivityPeriod;->setPeakTemp(F)V

    .line 82
    invoke-interface {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/BaseActivityPeriod;->getMaxCaseTemp()F

    move-result v0

    invoke-interface {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/BaseActivityPeriod;->getMaxCaseTemp()F

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Math;->max(FF)F

    move-result v0

    invoke-interface {p1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/BaseActivityPeriod;->setMaxCaseTemp(F)V

    .line 83
    invoke-interface {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/BaseActivityPeriod;->getMinCaseTemp()F

    move-result v0

    invoke-interface {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/BaseActivityPeriod;->getMinCaseTemp()F

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Math;->min(FF)F

    move-result v0

    invoke-interface {p1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/BaseActivityPeriod;->setMinCaseTemp(F)V

    .line 85
    invoke-interface {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/BaseActivityPeriod;->getMaxSkinTemp()F

    move-result v0

    invoke-interface {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/BaseActivityPeriod;->getMaxSkinTemp()F

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Math;->max(FF)F

    move-result v0

    invoke-interface {p1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/BaseActivityPeriod;->setMaxSkinTemp(F)V

    .line 86
    invoke-interface {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/BaseActivityPeriod;->getMinSkinTemp()F

    move-result v0

    invoke-interface {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/BaseActivityPeriod;->getMinSkinTemp()F

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Math;->min(FF)F

    move-result v0

    invoke-interface {p1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/BaseActivityPeriod;->setMinSkinTemp(F)V

    .line 88
    invoke-interface {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/BaseActivityPeriod;->getMinHeartRate()I

    move-result v0

    invoke-interface {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/BaseActivityPeriod;->getMinHeartRate()I

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    invoke-interface {p1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/BaseActivityPeriod;->setMinHeartRate(I)V

    .line 89
    invoke-interface {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/BaseActivityPeriod;->getMaxHeartRate()I

    move-result v0

    invoke-interface {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/BaseActivityPeriod;->getMaxHeartRate()I

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    invoke-interface {p1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/BaseActivityPeriod;->setMaxHeartRate(I)V

    .line 91
    invoke-interface {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/BaseActivityPeriod;->getBodyPower()F

    move-result v0

    invoke-interface {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/BaseActivityPeriod;->getBodyPower()F

    move-result v1

    add-float/2addr v0, v1

    invoke-interface {p1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/BaseActivityPeriod;->setBodyPower(F)V

    .line 92
    invoke-interface {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/BaseActivityPeriod;->getSolarPower()F

    move-result v0

    invoke-interface {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/BaseActivityPeriod;->getSolarPower()F

    move-result v1

    add-float/2addr v0, v1

    invoke-interface {p1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/BaseActivityPeriod;->setSolarPower(F)V

    .line 93
    invoke-interface {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/BaseActivityPeriod;->getActiveCalories()I

    move-result v0

    invoke-interface {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/BaseActivityPeriod;->getActiveCalories()I

    move-result v1

    add-int/2addr v0, v1

    invoke-interface {p1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/BaseActivityPeriod;->setActiveCalories(I)V

    .line 94
    invoke-interface {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/BaseActivityPeriod;->getBmrCalories()I

    move-result v0

    invoke-interface {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/BaseActivityPeriod;->getBmrCalories()I

    move-result v1

    add-int/2addr v0, v1

    invoke-interface {p1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/BaseActivityPeriod;->setBmrCalories(I)V

    .line 95
    invoke-interface {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/BaseActivityPeriod;->getStartTime()J

    move-result-wide v0

    invoke-interface {p1, v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/BaseActivityPeriod;->setStartTime(J)V

    .line 96
    invoke-interface {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/BaseActivityPeriod;->getMinsInPeriod()I

    move-result v0

    invoke-interface {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/BaseActivityPeriod;->getMinsInPeriod()I

    move-result p2

    add-int/2addr v0, p2

    invoke-interface {p1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/BaseActivityPeriod;->setMinsInPeriod(I)V

    return-object p1
.end method
