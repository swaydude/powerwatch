.class public final Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsMessageFormatter;
.super Ljava/lang/Object;
.source "AlertsMessageFormatter.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0008\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006J\u0010\u0010\u0008\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nH\u0002J\u000c\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006J\u001c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eJ\u001c\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eJ\u001c\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eJ\u001c\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eJ,\u0010\u0013\u001a\u00020\u00072\u0008\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\nH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsMessageFormatter;",
        "",
        "()V",
        "mStateController",
        "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/StateController;",
        "clearCallIcon",
        "Ljava/util/ArrayList;",
        "",
        "clearIcon",
        "type",
        "",
        "clearMessageIcon",
        "createIncomingCall",
        "title",
        "",
        "body",
        "createMessagePayload",
        "createMissedCall",
        "createMissedMessagePayload",
        "prepareMessage",
        "categoryType",
        "eventFlag",
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


# instance fields
.field private final mStateController:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/StateController;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/StateController;

    invoke-direct {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/StateController;-><init>()V

    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsMessageFormatter;->mStateController:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/StateController;

    return-void
.end method

.method private final clearIcon(I)[B
    .locals 5

    const/16 v0, 0x11

    new-array v1, v0, [B

    const/4 v2, 0x0

    aput-byte v0, v1, v2

    const/4 v0, 0x1

    aput-byte v2, v1, v0

    const/4 v3, 0x2

    const/16 v4, 0xe

    aput-byte v4, v1, v3

    const/4 v3, 0x3

    aput-byte v0, v1, v3

    int-to-byte p1, p1

    const/4 v0, 0x4

    aput-byte p1, v1, v0

    .line 99
    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ANCSConstants$EventID;->EVENT_ID_NOTIFICATION_REMOVED:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ANCSConstants$EventID;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ANCSConstants$EventID;->ordinal()I

    move-result p1

    int-to-byte p1, p1

    const/4 v0, 0x5

    aput-byte p1, v1, v0

    .line 100
    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ANCSConstants$EventFlag;->EVENT_FLAG_SILENT:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ANCSConstants$EventFlag;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ANCSConstants$EventFlag;->getValue()I

    move-result p1

    int-to-byte p1, p1

    const/4 v0, 0x6

    aput-byte p1, v1, v0

    const/4 p1, 0x7

    aput-byte v2, v1, p1

    const/16 p1, 0x8

    const/4 v0, -0x1

    aput-byte v0, v1, p1

    const/16 p1, 0x9

    aput-byte v0, v1, p1

    const/16 p1, 0xa

    aput-byte v0, v1, p1

    const/16 p1, 0xb

    const/16 v0, 0x20

    aput-byte v0, v1, p1

    const/16 p1, 0xc

    aput-byte v3, v1, p1

    const/16 p1, 0xd

    aput-byte v0, v1, p1

    aput-byte v3, v1, v4

    const/16 p1, 0xf

    const/16 v0, -0x55

    aput-byte v0, v1, p1

    const/16 p1, 0x10

    const/16 v0, -0x33

    aput-byte v0, v1, p1

    return-object v1
.end method

.method private final prepareMessage(Ljava/lang/String;Ljava/lang/String;II)[B
    .locals 8

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eqz p1, :cond_2

    .line 56
    move-object v2, p1

    check-cast v2, Ljava/lang/CharSequence;

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-nez v2, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    if-eqz v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    goto :goto_2

    :cond_2
    :goto_1
    const/4 v2, 0x0

    :goto_2
    if-eqz p2, :cond_5

    .line 57
    move-object v3, p2

    check-cast v3, Ljava/lang/CharSequence;

    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    move-result v3

    if-nez v3, :cond_3

    const/4 v3, 0x1

    goto :goto_3

    :cond_3
    const/4 v3, 0x0

    :goto_3
    if-eqz v3, :cond_4

    goto :goto_4

    :cond_4
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v3

    goto :goto_5

    :cond_5
    :goto_4
    const/4 v3, 0x0

    :goto_5
    add-int v4, v2, v3

    add-int/lit8 v5, v4, 0xf

    .line 61
    new-array v5, v5, [B

    const/16 v6, 0x11

    .line 62
    aput-byte v6, v5, v1

    shr-int/lit8 v6, v4, 0x8

    and-int/lit16 v6, v6, 0xff

    int-to-byte v6, v6

    .line 63
    aput-byte v6, v5, v0

    const/4 v6, 0x2

    and-int/lit16 v7, v4, 0xff

    int-to-byte v7, v7

    .line 64
    aput-byte v7, v5, v6

    const/4 v6, 0x3

    .line 65
    aput-byte v0, v5, v6

    const/4 v7, 0x4

    int-to-byte p3, p3

    .line 66
    aput-byte p3, v5, v7

    const/4 p3, 0x5

    .line 67
    sget-object v7, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ANCSConstants$EventID;->EVENT_ID_NOTIFICATION_ADDED:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ANCSConstants$EventID;

    invoke-virtual {v7}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ANCSConstants$EventID;->ordinal()I

    move-result v7

    int-to-byte v7, v7

    aput-byte v7, v5, p3

    const/4 p3, 0x6

    int-to-byte p4, p4

    .line 68
    aput-byte p4, v5, p3

    const/4 p3, 0x7

    .line 69
    aput-byte v0, v5, p3

    const/16 p3, 0x8

    const/4 p4, -0x1

    .line 70
    aput-byte p4, v5, p3

    const/16 p3, 0x9

    .line 71
    aput-byte p4, v5, p3

    const/16 p3, 0xa

    .line 72
    aput-byte p4, v5, p3

    if-lez v2, :cond_7

    const/4 p3, 0x0

    :goto_6
    add-int/lit8 p4, p3, 0x1

    add-int/lit8 v0, p3, 0xb

    .line 75
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {p1, p3}, Ljava/lang/String;->charAt(I)C

    move-result p3

    int-to-byte p3, p3

    aput-byte p3, v5, v0

    if-lt p4, v2, :cond_6

    goto :goto_7

    :cond_6
    move p3, p4

    goto :goto_6

    :cond_7
    :goto_7
    add-int/lit8 p1, v2, 0xb

    .line 78
    aput-byte v6, v5, p1

    if-lez v3, :cond_9

    :goto_8
    add-int/lit8 p1, v1, 0x1

    add-int/lit8 p3, v2, 0xc

    .line 81
    invoke-static {p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {p2, v1}, Ljava/lang/String;->charAt(I)C

    move-result p4

    int-to-byte p4, p4

    aput-byte p4, v5, p3

    if-lt p1, v3, :cond_8

    goto :goto_9

    :cond_8
    move v1, p1

    goto :goto_8

    :cond_9
    :goto_9
    add-int/lit8 p1, v4, 0xc

    .line 84
    aput-byte v6, v5, p1

    add-int/lit8 p1, v4, 0xd

    const/16 p2, -0x55

    .line 85
    aput-byte p2, v5, p1

    add-int/lit8 v4, v4, 0xe

    const/16 p1, -0x33

    .line 86
    aput-byte p1, v5, v4

    return-object v5
.end method


# virtual methods
.method public final clearCallIcon()Ljava/util/ArrayList;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "[B>;"
        }
    .end annotation

    .line 45
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ANCSConstants$CategoryID;->CATEGORY_ID_INCOMING_CALL:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ANCSConstants$CategoryID;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ANCSConstants$CategoryID;->ordinal()I

    move-result v0

    invoke-direct {p0, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsMessageFormatter;->clearIcon(I)[B

    move-result-object v0

    .line 46
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsMessageFormatter;->mStateController:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/StateController;

    invoke-virtual {v1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/StateController;->process([B)Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method

.method public final clearMessageIcon()Ljava/util/ArrayList;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "[B>;"
        }
    .end annotation

    .line 50
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ANCSConstants$CategoryID;->CATEGORY_ID_OTHER:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ANCSConstants$CategoryID;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ANCSConstants$CategoryID;->ordinal()I

    move-result v0

    invoke-direct {p0, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsMessageFormatter;->clearIcon(I)[B

    move-result-object v0

    .line 51
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsMessageFormatter;->mStateController:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/StateController;

    invoke-virtual {v1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/StateController;->process([B)Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method

.method public final createIncomingCall(Ljava/lang/String;Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/ArrayList<",
            "[B>;"
        }
    .end annotation

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "body"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ANCSConstants$CategoryID;->CATEGORY_ID_INCOMING_CALL:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ANCSConstants$CategoryID;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ANCSConstants$CategoryID;->ordinal()I

    move-result v0

    .line 16
    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ANCSConstants$EventFlag;->EVENT_FLAG_IMPORTANT:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ANCSConstants$EventFlag;

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ANCSConstants$EventFlag;->getValue()I

    move-result v1

    .line 13
    invoke-direct {p0, p1, p2, v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsMessageFormatter;->prepareMessage(Ljava/lang/String;Ljava/lang/String;II)[B

    move-result-object p1

    .line 17
    iget-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsMessageFormatter;->mStateController:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/StateController;

    invoke-virtual {p2, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/StateController;->process([B)Ljava/util/ArrayList;

    move-result-object p1

    return-object p1
.end method

.method public final createMessagePayload(Ljava/lang/String;Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/ArrayList<",
            "[B>;"
        }
    .end annotation

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "body"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ANCSConstants$CategoryID;->CATEGORY_ID_OTHER:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ANCSConstants$CategoryID;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ANCSConstants$CategoryID;->ordinal()I

    move-result v0

    .line 32
    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ANCSConstants$EventFlag;->EVENT_FLAG_IMPORTANT:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ANCSConstants$EventFlag;

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ANCSConstants$EventFlag;->getValue()I

    move-result v1

    .line 29
    invoke-direct {p0, p1, p2, v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsMessageFormatter;->prepareMessage(Ljava/lang/String;Ljava/lang/String;II)[B

    move-result-object p1

    .line 33
    iget-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsMessageFormatter;->mStateController:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/StateController;

    invoke-virtual {p2, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/StateController;->process([B)Ljava/util/ArrayList;

    move-result-object p1

    return-object p1
.end method

.method public final createMissedCall(Ljava/lang/String;Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/ArrayList<",
            "[B>;"
        }
    .end annotation

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "body"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ANCSConstants$CategoryID;->CATEGORY_ID_MISSED_CALL:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ANCSConstants$CategoryID;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ANCSConstants$CategoryID;->ordinal()I

    move-result v0

    .line 24
    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ANCSConstants$EventFlag;->EVENT_FLAG_SILENT:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ANCSConstants$EventFlag;

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ANCSConstants$EventFlag;->getValue()I

    move-result v1

    .line 21
    invoke-direct {p0, p1, p2, v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsMessageFormatter;->prepareMessage(Ljava/lang/String;Ljava/lang/String;II)[B

    move-result-object p1

    .line 25
    iget-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsMessageFormatter;->mStateController:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/StateController;

    invoke-virtual {p2, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/StateController;->process([B)Ljava/util/ArrayList;

    move-result-object p1

    return-object p1
.end method

.method public final createMissedMessagePayload(Ljava/lang/String;Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/ArrayList<",
            "[B>;"
        }
    .end annotation

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "body"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ANCSConstants$CategoryID;->CATEGORY_ID_OTHER:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ANCSConstants$CategoryID;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ANCSConstants$CategoryID;->ordinal()I

    move-result v0

    .line 40
    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ANCSConstants$EventFlag;->EVENT_FLAG_SILENT:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ANCSConstants$EventFlag;

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ANCSConstants$EventFlag;->getValue()I

    move-result v1

    .line 37
    invoke-direct {p0, p1, p2, v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsMessageFormatter;->prepareMessage(Ljava/lang/String;Ljava/lang/String;II)[B

    move-result-object p1

    .line 41
    iget-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsMessageFormatter;->mStateController:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/StateController;

    invoke-virtual {p2, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/StateController;->process([B)Ljava/util/ArrayList;

    move-result-object p1

    return-object p1
.end method
