.class public final Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsLiteCommunicator$DefaultImpls;
.super Ljava/lang/Object;
.source "AlertsLiteCommunicator.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsLiteCommunicator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "DefaultImpls"
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x5,
        0x1
    }
    xi = 0x30
.end annotation


# direct methods
.method public static synthetic sendClearCallIconAlert$default(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsLiteCommunicator;Ljava/lang/String;SLjava/lang/String;Ljava/lang/String;Ljava/lang/String;JJILjava/lang/Object;)Lio/reactivex/Completable;
    .locals 11

    if-nez p11, :cond_4

    and-int/lit8 v0, p10, 0x2

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    const/4 v3, 0x0

    goto :goto_0

    :cond_0
    move v3, p2

    :goto_0
    and-int/lit8 v0, p10, 0x4

    const-string v1, ""

    if-eqz v0, :cond_1

    move-object v4, v1

    goto :goto_1

    :cond_1
    move-object v4, p3

    :goto_1
    and-int/lit8 v0, p10, 0x8

    if-eqz v0, :cond_2

    move-object v5, v1

    goto :goto_2

    :cond_2
    move-object v5, p4

    :goto_2
    and-int/lit8 v0, p10, 0x10

    if-eqz v0, :cond_3

    move-object v6, v1

    goto :goto_3

    :cond_3
    move-object/from16 v6, p5

    :goto_3
    move-object v1, p0

    move-object v2, p1

    move-wide/from16 v7, p6

    move-wide/from16 v9, p8

    .line 32
    invoke-interface/range {v1 .. v10}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsLiteCommunicator;->sendClearCallIconAlert(Ljava/lang/String;SLjava/lang/String;Ljava/lang/String;Ljava/lang/String;JJ)Lio/reactivex/Completable;

    move-result-object v0

    return-object v0

    :cond_4
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Super calls with default arguments not supported in this target, function: sendClearCallIconAlert"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static synthetic sendClearMessageIconAlert$default(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsLiteCommunicator;Ljava/lang/String;SLjava/lang/String;Ljava/lang/String;Ljava/lang/String;JJILjava/lang/Object;)Lio/reactivex/Completable;
    .locals 11

    if-nez p11, :cond_4

    and-int/lit8 v0, p10, 0x2

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    const/4 v3, 0x0

    goto :goto_0

    :cond_0
    move v3, p2

    :goto_0
    and-int/lit8 v0, p10, 0x4

    const-string v1, ""

    if-eqz v0, :cond_1

    move-object v4, v1

    goto :goto_1

    :cond_1
    move-object v4, p3

    :goto_1
    and-int/lit8 v0, p10, 0x8

    if-eqz v0, :cond_2

    move-object v5, v1

    goto :goto_2

    :cond_2
    move-object v5, p4

    :goto_2
    and-int/lit8 v0, p10, 0x10

    if-eqz v0, :cond_3

    move-object v6, v1

    goto :goto_3

    :cond_3
    move-object/from16 v6, p5

    :goto_3
    move-object v1, p0

    move-object v2, p1

    move-wide/from16 v7, p6

    move-wide/from16 v9, p8

    .line 33
    invoke-interface/range {v1 .. v10}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsLiteCommunicator;->sendClearMessageIconAlert(Ljava/lang/String;SLjava/lang/String;Ljava/lang/String;Ljava/lang/String;JJ)Lio/reactivex/Completable;

    move-result-object v0

    return-object v0

    :cond_4
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Super calls with default arguments not supported in this target, function: sendClearMessageIconAlert"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static synthetic sendImportantCallAlert$default(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsLiteCommunicator;Ljava/lang/String;SLjava/lang/String;Ljava/lang/String;Ljava/lang/String;JJILjava/lang/Object;)Lio/reactivex/Completable;
    .locals 11

    if-nez p11, :cond_1

    and-int/lit8 v0, p10, 0x2

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    const/4 v3, 0x0

    goto :goto_0

    :cond_0
    move v3, p2

    :goto_0
    move-object v1, p0

    move-object v2, p1

    move-object v4, p3

    move-object v5, p4

    move-object/from16 v6, p5

    move-wide/from16 v7, p6

    move-wide/from16 v9, p8

    .line 26
    invoke-interface/range {v1 .. v10}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsLiteCommunicator;->sendImportantCallAlert(Ljava/lang/String;SLjava/lang/String;Ljava/lang/String;Ljava/lang/String;JJ)Lio/reactivex/Completable;

    move-result-object v0

    return-object v0

    :cond_1
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Super calls with default arguments not supported in this target, function: sendImportantCallAlert"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static synthetic sendImportantMessageAlert$default(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsLiteCommunicator;Ljava/lang/String;SLjava/lang/String;Ljava/lang/String;Ljava/lang/String;JJILjava/lang/Object;)Lio/reactivex/Completable;
    .locals 11

    if-nez p11, :cond_1

    and-int/lit8 v0, p10, 0x2

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    const/4 v3, 0x0

    goto :goto_0

    :cond_0
    move v3, p2

    :goto_0
    move-object v1, p0

    move-object v2, p1

    move-object v4, p3

    move-object v5, p4

    move-object/from16 v6, p5

    move-wide/from16 v7, p6

    move-wide/from16 v9, p8

    .line 29
    invoke-interface/range {v1 .. v10}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsLiteCommunicator;->sendImportantMessageAlert(Ljava/lang/String;SLjava/lang/String;Ljava/lang/String;Ljava/lang/String;JJ)Lio/reactivex/Completable;

    move-result-object v0

    return-object v0

    :cond_1
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Super calls with default arguments not supported in this target, function: sendImportantMessageAlert"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static synthetic sendPreExistingCallAlert$default(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsLiteCommunicator;Ljava/lang/String;SLjava/lang/String;Ljava/lang/String;Ljava/lang/String;JJILjava/lang/Object;)Lio/reactivex/Completable;
    .locals 11

    if-nez p11, :cond_1

    and-int/lit8 v0, p10, 0x2

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    const/4 v3, 0x0

    goto :goto_0

    :cond_0
    move v3, p2

    :goto_0
    move-object v1, p0

    move-object v2, p1

    move-object v4, p3

    move-object v5, p4

    move-object/from16 v6, p5

    move-wide/from16 v7, p6

    move-wide/from16 v9, p8

    .line 28
    invoke-interface/range {v1 .. v10}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsLiteCommunicator;->sendPreExistingCallAlert(Ljava/lang/String;SLjava/lang/String;Ljava/lang/String;Ljava/lang/String;JJ)Lio/reactivex/Completable;

    move-result-object v0

    return-object v0

    :cond_1
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Super calls with default arguments not supported in this target, function: sendPreExistingCallAlert"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static synthetic sendPreExistingMessageAlert$default(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsLiteCommunicator;Ljava/lang/String;SLjava/lang/String;Ljava/lang/String;Ljava/lang/String;JJILjava/lang/Object;)Lio/reactivex/Completable;
    .locals 11

    if-nez p11, :cond_1

    and-int/lit8 v0, p10, 0x2

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    const/4 v3, 0x0

    goto :goto_0

    :cond_0
    move v3, p2

    :goto_0
    move-object v1, p0

    move-object v2, p1

    move-object v4, p3

    move-object v5, p4

    move-object/from16 v6, p5

    move-wide/from16 v7, p6

    move-wide/from16 v9, p8

    .line 31
    invoke-interface/range {v1 .. v10}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsLiteCommunicator;->sendPreExistingMessageAlert(Ljava/lang/String;SLjava/lang/String;Ljava/lang/String;Ljava/lang/String;JJ)Lio/reactivex/Completable;

    move-result-object v0

    return-object v0

    :cond_1
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Super calls with default arguments not supported in this target, function: sendPreExistingMessageAlert"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static synthetic sendSilentCallAlert$default(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsLiteCommunicator;Ljava/lang/String;SLjava/lang/String;Ljava/lang/String;Ljava/lang/String;JJILjava/lang/Object;)Lio/reactivex/Completable;
    .locals 11

    if-nez p11, :cond_1

    and-int/lit8 v0, p10, 0x2

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    const/4 v3, 0x0

    goto :goto_0

    :cond_0
    move v3, p2

    :goto_0
    move-object v1, p0

    move-object v2, p1

    move-object v4, p3

    move-object v5, p4

    move-object/from16 v6, p5

    move-wide/from16 v7, p6

    move-wide/from16 v9, p8

    .line 27
    invoke-interface/range {v1 .. v10}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsLiteCommunicator;->sendSilentCallAlert(Ljava/lang/String;SLjava/lang/String;Ljava/lang/String;Ljava/lang/String;JJ)Lio/reactivex/Completable;

    move-result-object v0

    return-object v0

    :cond_1
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Super calls with default arguments not supported in this target, function: sendSilentCallAlert"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static synthetic sendSilentIncomingCallAlert$default(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsLiteCommunicator;Ljava/lang/String;SLjava/lang/String;Ljava/lang/String;Ljava/lang/String;JJILjava/lang/Object;)Lio/reactivex/Completable;
    .locals 11

    if-nez p11, :cond_1

    and-int/lit8 v0, p10, 0x2

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    const/4 v3, 0x0

    goto :goto_0

    :cond_0
    move v3, p2

    :goto_0
    move-object v1, p0

    move-object v2, p1

    move-object v4, p3

    move-object v5, p4

    move-object/from16 v6, p5

    move-wide/from16 v7, p6

    move-wide/from16 v9, p8

    .line 34
    invoke-interface/range {v1 .. v10}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsLiteCommunicator;->sendSilentIncomingCallAlert(Ljava/lang/String;SLjava/lang/String;Ljava/lang/String;Ljava/lang/String;JJ)Lio/reactivex/Completable;

    move-result-object v0

    return-object v0

    :cond_1
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Super calls with default arguments not supported in this target, function: sendSilentIncomingCallAlert"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static synthetic sendSilentMessageAlert$default(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsLiteCommunicator;Ljava/lang/String;SLjava/lang/String;Ljava/lang/String;Ljava/lang/String;JJILjava/lang/Object;)Lio/reactivex/Completable;
    .locals 11

    if-nez p11, :cond_1

    and-int/lit8 v0, p10, 0x2

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    const/4 v3, 0x0

    goto :goto_0

    :cond_0
    move v3, p2

    :goto_0
    move-object v1, p0

    move-object v2, p1

    move-object v4, p3

    move-object v5, p4

    move-object/from16 v6, p5

    move-wide/from16 v7, p6

    move-wide/from16 v9, p8

    .line 30
    invoke-interface/range {v1 .. v10}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsLiteCommunicator;->sendSilentMessageAlert(Ljava/lang/String;SLjava/lang/String;Ljava/lang/String;Ljava/lang/String;JJ)Lio/reactivex/Completable;

    move-result-object v0

    return-object v0

    :cond_1
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Super calls with default arguments not supported in this target, function: sendSilentMessageAlert"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
