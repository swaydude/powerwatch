.class public final Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;
.super Ljava/lang/Object;
.source "CallEvent.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/AlertEvent;
.implements Landroid/os/Parcelable;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008)\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0087\u0008\u0018\u00002\u00020\u00012\u00020\u0002BY\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u000c\u0012\u0006\u0010\r\u001a\u00020\u000c\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\u0002\u0010\u0011J\t\u0010-\u001a\u00020\u0004H\u00c6\u0003J\t\u0010.\u001a\u00020\u0004H\u00c6\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\t\u00100\u001a\u00020\u0008H\u00c6\u0003J\t\u00101\u001a\u00020\nH\u00c6\u0003J\t\u00102\u001a\u00020\u000cH\u00c6\u0003J\t\u00103\u001a\u00020\u000cH\u00c6\u0003J\t\u00104\u001a\u00020\u0004H\u00c6\u0003J\t\u00105\u001a\u00020\u0010H\u00c6\u0003Je\u00106\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00082\u0008\u0008\u0002\u0010\t\u001a\u00020\n2\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u0010H\u00c6\u0001J\t\u00107\u001a\u00020\nH\u00d6\u0001J\u0013\u00108\u001a\u00020\u00102\u0008\u00109\u001a\u0004\u0018\u00010:H\u0096\u0002J\u0008\u0010;\u001a\u00020\nH\u0016J\t\u0010<\u001a\u00020\u0004H\u00d6\u0001J\u0019\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020\nH\u00d6\u0001R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0004X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0012\u0010\u0013\"\u0004\u0008\u0014\u0010\u0015R\u001a\u0010\u0007\u001a\u00020\u0008X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0016\u0010\u0017\"\u0004\u0008\u0018\u0010\u0019R\u001a\u0010\t\u001a\u00020\nX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u001a\u0010\u001b\"\u0004\u0008\u001c\u0010\u001dR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u000f\u0010\u001e\"\u0004\u0008\u001f\u0010 R\u001a\u0010\r\u001a\u00020\u000cX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008!\u0010\"\"\u0004\u0008#\u0010$R\u001a\u0010\u000b\u001a\u00020\u000cX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008%\u0010\"\"\u0004\u0008&\u0010$R\u001a\u0010\u0005\u001a\u00020\u0004X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\'\u0010\u0013\"\u0004\u0008(\u0010\u0015R\u001a\u0010\u000e\u001a\u00020\u0004X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008)\u0010\u0013\"\u0004\u0008*\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u0004X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008+\u0010\u0013\"\u0004\u0008,\u0010\u0015\u00a8\u0006B"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/AlertEvent;",
        "Landroid/os/Parcelable;",
        "title",
        "",
        "subTitle",
        "appPackageName",
        "callState",
        "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;",
        "id",
        "",
        "postTimestamp",
        "",
        "notificationTimestamp",
        "text",
        "isVoip",
        "",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;IJJLjava/lang/String;Z)V",
        "getAppPackageName",
        "()Ljava/lang/String;",
        "setAppPackageName",
        "(Ljava/lang/String;)V",
        "getCallState",
        "()Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;",
        "setCallState",
        "(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;)V",
        "getId",
        "()I",
        "setId",
        "(I)V",
        "()Z",
        "setVoip",
        "(Z)V",
        "getNotificationTimestamp",
        "()J",
        "setNotificationTimestamp",
        "(J)V",
        "getPostTimestamp",
        "setPostTimestamp",
        "getSubTitle",
        "setSubTitle",
        "getText",
        "setText",
        "getTitle",
        "setTitle",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "copy",
        "describeContents",
        "equals",
        "other",
        "",
        "hashCode",
        "toString",
        "writeToParcel",
        "",
        "parcel",
        "Landroid/os/Parcel;",
        "flags",
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


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private appPackageName:Ljava/lang/String;

.field private callState:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;

.field private id:I

.field private isVoip:Z

.field private notificationTimestamp:J

.field private postTimestamp:J

.field private subTitle:Ljava/lang/String;

.field private text:Ljava/lang/String;

.field private title:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent$Creator;

    invoke-direct {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent$Creator;-><init>()V

    check-cast v0, Landroid/os/Parcelable$Creator;

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;IJJLjava/lang/String;Z)V
    .locals 1

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "subTitle"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callState"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "text"

    invoke-static {p10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;->title:Ljava/lang/String;

    .line 19
    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;->subTitle:Ljava/lang/String;

    .line 20
    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;->appPackageName:Ljava/lang/String;

    .line 21
    iput-object p4, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;->callState:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;

    .line 22
    iput p5, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;->id:I

    .line 23
    iput-wide p6, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;->postTimestamp:J

    .line 24
    iput-wide p8, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;->notificationTimestamp:J

    .line 25
    iput-object p10, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;->text:Ljava/lang/String;

    .line 26
    iput-boolean p11, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;->isVoip:Z

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;IJJLjava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 15

    move/from16 v0, p12

    and-int/lit8 v1, v0, 0x1

    const-string v2, ""

    if-eqz v1, :cond_0

    move-object v4, v2

    goto :goto_0

    :cond_0
    move-object/from16 v4, p1

    :goto_0
    and-int/lit8 v1, v0, 0x2

    if-eqz v1, :cond_1

    move-object v5, v2

    goto :goto_1

    :cond_1
    move-object/from16 v5, p2

    :goto_1
    and-int/lit8 v1, v0, 0x4

    if-eqz v1, :cond_2

    const/4 v1, 0x0

    move-object v6, v1

    goto :goto_2

    :cond_2
    move-object/from16 v6, p3

    :goto_2
    and-int/lit8 v1, v0, 0x10

    if-eqz v1, :cond_3

    const/4 v1, -0x1

    const/4 v8, -0x1

    goto :goto_3

    :cond_3
    move/from16 v8, p5

    :goto_3
    and-int/lit16 v0, v0, 0x100

    if-eqz v0, :cond_4

    const/4 v0, 0x1

    const/4 v14, 0x1

    goto :goto_4

    :cond_4
    move/from16 v14, p11

    :goto_4
    move-object v3, p0

    move-object/from16 v7, p4

    move-wide/from16 v9, p6

    move-wide/from16 v11, p8

    move-object/from16 v13, p10

    .line 18
    invoke-direct/range {v3 .. v14}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;IJJLjava/lang/String;Z)V

    return-void
.end method

.method public static synthetic copy$default(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;IJJLjava/lang/String;ZILjava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;
    .locals 12

    move-object v0, p0

    move/from16 v1, p12

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;->getTitle()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_0
    move-object v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;->getSubTitle()Ljava/lang/String;

    move-result-object v3

    goto :goto_1

    :cond_1
    move-object v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;->getAppPackageName()Ljava/lang/String;

    move-result-object v4

    goto :goto_2

    :cond_2
    move-object v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-object v5, v0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;->callState:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;

    goto :goto_3

    :cond_3
    move-object/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;->getId()I

    move-result v6

    goto :goto_4

    :cond_4
    move/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;->getPostTimestamp()J

    move-result-wide v7

    goto :goto_5

    :cond_5
    move-wide/from16 v7, p6

    :goto_5
    and-int/lit8 v9, v1, 0x40

    if-eqz v9, :cond_6

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;->getNotificationTimestamp()J

    move-result-wide v9

    goto :goto_6

    :cond_6
    move-wide/from16 v9, p8

    :goto_6
    and-int/lit16 v11, v1, 0x80

    if-eqz v11, :cond_7

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;->getText()Ljava/lang/String;

    move-result-object v11

    goto :goto_7

    :cond_7
    move-object/from16 v11, p10

    :goto_7
    and-int/lit16 v1, v1, 0x100

    if-eqz v1, :cond_8

    iget-boolean v1, v0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;->isVoip:Z

    goto :goto_8

    :cond_8
    move/from16 v1, p11

    :goto_8
    move-object p1, v2

    move-object p2, v3

    move-object p3, v4

    move-object/from16 p4, v5

    move/from16 p5, v6

    move-wide/from16 p6, v7

    move-wide/from16 p8, v9

    move-object/from16 p10, v11

    move/from16 p11, v1

    invoke-virtual/range {p0 .. p11}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;IJJLjava/lang/String;Z)Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;->getTitle()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;->getSubTitle()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;->getAppPackageName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final component4()Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;->callState:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;

    return-object v0
.end method

.method public final component5()I
    .locals 1

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;->getId()I

    move-result v0

    return v0
.end method

.method public final component6()J
    .locals 2

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;->getPostTimestamp()J

    move-result-wide v0

    return-wide v0
.end method

.method public final component7()J
    .locals 2

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;->getNotificationTimestamp()J

    move-result-wide v0

    return-wide v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;->getText()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final component9()Z
    .locals 1

    iget-boolean v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;->isVoip:Z

    return v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;IJJLjava/lang/String;Z)Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;
    .locals 13

    const-string v0, "title"

    move-object v2, p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "subTitle"

    move-object v3, p2

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callState"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "text"

    move-object/from16 v11, p10

    invoke-static {v11, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;

    move-object v1, v0

    move-object/from16 v4, p3

    move/from16 v6, p5

    move-wide/from16 v7, p6

    move-wide/from16 v9, p8

    move/from16 v12, p11

    invoke-direct/range {v1 .. v12}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;IJJLjava/lang/String;Z)V

    return-object v0
.end method

.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 6

    .line 30
    instance-of v0, p1, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 33
    :cond_0
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;->getTitle()Ljava/lang/String;

    move-result-object v0

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;->getTitle()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;->getText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;->getText()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;->callState:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;

    iget-object v2, p1, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;->callState:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;

    if-ne v0, v2, :cond_1

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;->getAppPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;->getAppPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;->isVoip:Z

    iget-boolean v2, p1, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;->isVoip:Z

    if-ne v0, v2, :cond_1

    .line 34
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;->getPostTimestamp()J

    move-result-wide v2

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;->getPostTimestamp()J

    move-result-wide v4

    sub-long/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/Math;->abs(J)J

    move-result-wide v2

    const-wide/16 v4, 0x7d0

    cmp-long p1, v2, v4

    if-gez p1, :cond_1

    const/4 v1, 0x1

    :cond_1
    return v1
.end method

.method public getAppPackageName()Ljava/lang/String;
    .locals 1

    .line 20
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;->appPackageName:Ljava/lang/String;

    return-object v0
.end method

.method public final getCallState()Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;
    .locals 1

    .line 21
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;->callState:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;

    return-object v0
.end method

.method public getId()I
    .locals 1

    .line 22
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;->id:I

    return v0
.end method

.method public getNotificationTimestamp()J
    .locals 2

    .line 24
    iget-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;->notificationTimestamp:J

    return-wide v0
.end method

.method public getPostTimestamp()J
    .locals 2

    .line 23
    iget-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;->postTimestamp:J

    return-wide v0
.end method

.method public getSubTitle()Ljava/lang/String;
    .locals 1

    .line 19
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;->subTitle:Ljava/lang/String;

    return-object v0
.end method

.method public getText()Ljava/lang/String;
    .locals 1

    .line 25
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;->text:Ljava/lang/String;

    return-object v0
.end method

.method public getTitle()Ljava/lang/String;
    .locals 1

    .line 18
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;->title:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 6

    .line 39
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;->getTitle()Ljava/lang/String;

    move-result-object v0

    const-string v1, " "

    const-string v2, ""

    const/4 v3, 0x0

    const/4 v4, 0x4

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Lkotlin/text/StringsKt;->replace$default(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    .line 40
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;->getAppPackageName()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 41
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;->getId()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 42
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;->getNotificationTimestamp()J

    move-result-wide v1

    const/16 v3, 0x3e8

    int-to-long v3, v3

    div-long/2addr v1, v3

    long-to-int v2, v1

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    .line 43
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;->getText()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final isVoip()Z
    .locals 1

    .line 26
    iget-boolean v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;->isVoip:Z

    return v0
.end method

.method public setAppPackageName(Ljava/lang/String;)V
    .locals 0

    .line 20
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;->appPackageName:Ljava/lang/String;

    return-void
.end method

.method public final setCallState(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;->callState:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;

    return-void
.end method

.method public setId(I)V
    .locals 0

    .line 22
    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;->id:I

    return-void
.end method

.method public setNotificationTimestamp(J)V
    .locals 0

    .line 24
    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;->notificationTimestamp:J

    return-void
.end method

.method public setPostTimestamp(J)V
    .locals 0

    .line 23
    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;->postTimestamp:J

    return-void
.end method

.method public setSubTitle(Ljava/lang/String;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;->subTitle:Ljava/lang/String;

    return-void
.end method

.method public setText(Ljava/lang/String;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;->text:Ljava/lang/String;

    return-void
.end method

.method public setTitle(Ljava/lang/String;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;->title:Ljava/lang/String;

    return-void
.end method

.method public final setVoip(Z)V
    .locals 0

    .line 26
    iput-boolean p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;->isVoip:Z

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "CallEvent(title="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;->getTitle()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", subTitle="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;->getSubTitle()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", appPackageName="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;->getAppPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", callState="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;->callState:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;->getId()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", postTimestamp="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;->getPostTimestamp()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", notificationTimestamp="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;->getNotificationTimestamp()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", text="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;->getText()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", isVoip="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;->isVoip:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    const-string p2, "out"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;->title:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;->subTitle:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;->appPackageName:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;->callState:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;

    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;->name()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;->id:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;->postTimestamp:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    iget-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;->notificationTimestamp:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    iget-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;->text:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-boolean p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;->isVoip:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method
