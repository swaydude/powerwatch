.class public final Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/PhoneCallResolver;
.super Ljava/lang/Object;
.source "PhoneCallResolver.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0008\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u000cR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/PhoneCallResolver;",
        "",
        "()V",
        "callEvent",
        "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;",
        "lastCallState",
        "",
        "getEvent",
        "state",
        "time",
        "",
        "callerName",
        "",
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
.field private final callEvent:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;

.field private lastCallState:I


# direct methods
.method public constructor <init>()V
    .locals 15

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    sget-object v4, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;->IDLE:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;

    new-instance v14, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const-wide/16 v6, 0x0

    const-wide/16 v8, 0x0

    const-string v10, ""

    const/4 v11, 0x0

    const/16 v12, 0x117

    const/4 v13, 0x0

    move-object v0, v14

    invoke-direct/range {v0 .. v13}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;IJJLjava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v14, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/PhoneCallResolver;->callEvent:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;

    return-void
.end method


# virtual methods
.method public final getEvent(IJLjava/lang/String;)Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;
    .locals 31

    move-object/from16 v0, p0

    move/from16 v1, p1

    const-string v2, "callerName"

    move-object/from16 v4, p4

    invoke-static {v4, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    iget v2, v0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/PhoneCallResolver;->lastCallState:I

    if-ne v2, v1, :cond_0

    .line 17
    iget-object v3, v0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/PhoneCallResolver;->callEvent:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const-wide/16 v9, 0x0

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v15, 0x1ff

    const/16 v16, 0x0

    invoke-static/range {v3 .. v16}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;->copy$default(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;IJJLjava/lang/String;ZILjava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;

    move-result-object v1

    return-object v1

    :cond_0
    const/4 v3, 0x2

    const/4 v5, 0x1

    if-eqz v1, :cond_3

    if-eq v1, v5, :cond_2

    if-eq v1, v3, :cond_1

    goto :goto_0

    :cond_1
    if-ne v2, v5, :cond_5

    .line 23
    iget-object v2, v0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/PhoneCallResolver;->callEvent:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;

    sget-object v3, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;->ANSWERED:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;

    invoke-virtual {v2, v3}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;->setCallState(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;)V

    goto :goto_0

    .line 20
    :cond_2
    iget-object v2, v0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/PhoneCallResolver;->callEvent:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;

    sget-object v3, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;->RINGING:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;

    invoke-virtual {v2, v3}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;->setCallState(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;)V

    goto :goto_0

    :cond_3
    if-ne v2, v5, :cond_4

    .line 28
    iget-object v2, v0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/PhoneCallResolver;->callEvent:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;

    sget-object v3, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;->MISSED:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;

    invoke-virtual {v2, v3}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;->setCallState(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;)V

    goto :goto_0

    :cond_4
    if-ne v2, v3, :cond_5

    .line 30
    iget-object v2, v0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/PhoneCallResolver;->callEvent:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;

    sget-object v3, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;->CALL_ENDED:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;

    invoke-virtual {v2, v3}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;->setCallState(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;)V

    .line 33
    :cond_5
    :goto_0
    iput v1, v0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/PhoneCallResolver;->lastCallState:I

    .line 35
    iget-object v1, v0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/PhoneCallResolver;->callEvent:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;->getCallState()Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;

    move-result-object v1

    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;->RINGING:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;

    if-eq v1, v2, :cond_8

    iget-object v1, v0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/PhoneCallResolver;->callEvent:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;->getCallState()Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;

    move-result-object v1

    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;->ANSWERED:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;

    if-ne v1, v2, :cond_6

    goto :goto_1

    .line 43
    :cond_6
    iget-object v1, v0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/PhoneCallResolver;->callEvent:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;->getCallState()Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;

    move-result-object v1

    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;->MISSED:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;

    if-ne v1, v2, :cond_7

    .line 46
    invoke-static {}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/AlertEventKt;->getMissedCallString()Ljava/lang/String;

    move-result-object v13

    .line 49
    iget-object v1, v0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/PhoneCallResolver;->callEvent:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;->getCallState()Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;

    move-result-object v7

    .line 44
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v14, 0x0

    const/16 v15, 0x116

    const/16 v16, 0x0

    move-object v3, v1

    move-object/from16 v4, p4

    move-wide/from16 v9, p2

    move-wide/from16 v11, p2

    invoke-direct/range {v3 .. v16}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;IJJLjava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    .line 53
    :cond_7
    iget-object v1, v0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/PhoneCallResolver;->callEvent:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const-wide/16 v23, 0x0

    const-wide/16 v25, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x1ff

    const/16 v30, 0x0

    move-object/from16 v17, v1

    invoke-static/range {v17 .. v30}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;->copy$default(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;IJJLjava/lang/String;ZILjava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;

    move-result-object v1

    return-object v1

    .line 38
    :cond_8
    :goto_1
    invoke-static {}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/AlertEventKt;->getIncomingCallString()Ljava/lang/String;

    move-result-object v13

    .line 41
    iget-object v1, v0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/PhoneCallResolver;->callEvent:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;->getCallState()Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;

    move-result-object v7

    .line 36
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v14, 0x0

    const/16 v15, 0x116

    const/16 v16, 0x0

    move-object v3, v1

    move-object/from16 v4, p4

    move-wide/from16 v9, p2

    move-wide/from16 v11, p2

    invoke-direct/range {v3 .. v16}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;IJJLjava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method
