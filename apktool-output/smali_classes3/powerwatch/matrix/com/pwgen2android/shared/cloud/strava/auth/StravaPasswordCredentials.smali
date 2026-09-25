.class public final Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaPasswordCredentials;
.super Ljava/lang/Object;
.source "AuthModel.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0002\u0008\u0016\n\u0002\u0010\u000b\n\u0002\u0008\u0005\u0008\u0086\u0008\u0018\u00002\u00020\u0001B?\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u000cJ\t\u0010\u0017\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\tH\u00c6\u0003J\t\u0010\u001c\u001a\u00020\tH\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0005H\u00c6\u0003JO\u0010\u001e\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t2\u0008\u0008\u0002\u0010\n\u001a\u00020\t2\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u001f\u001a\u00020 2\u0008\u0010!\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\u0006\u0010\"\u001a\u00020 J\t\u0010#\u001a\u00020\u0003H\u00d6\u0001J\t\u0010$\u001a\u00020\u0005H\u00d6\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u0016\u0010\u000b\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u000eR\u0016\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011R\u0016\u0010\u0008\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0011R\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0016\u00a8\u0006%"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaPasswordCredentials;",
        "",
        "uid",
        "",
        "accessToken",
        "",
        "tokenType",
        "refreshToken",
        "expiresIn",
        "",
        "expiresAt",
        "code",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;)V",
        "getAccessToken",
        "()Ljava/lang/String;",
        "getCode",
        "getExpiresAt",
        "()J",
        "getExpiresIn",
        "getRefreshToken",
        "getTokenType",
        "getUid",
        "()I",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "copy",
        "equals",
        "",
        "other",
        "hasExpired",
        "hashCode",
        "toString",
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
.field private final accessToken:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "access_token"
    .end annotation
.end field

.field private final code:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "code"
    .end annotation
.end field

.field private final expiresAt:J
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "expires_at"
    .end annotation
.end field

.field private final expiresIn:J
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "expires_in"
    .end annotation
.end field

.field private final refreshToken:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "refresh_token"
    .end annotation
.end field

.field private final tokenType:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "token_type"
    .end annotation
.end field

.field private final uid:I


# direct methods
.method public constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;)V
    .locals 1

    const-string v0, "accessToken"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "tokenType"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "refreshToken"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "code"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaPasswordCredentials;->uid:I

    .line 7
    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaPasswordCredentials;->accessToken:Ljava/lang/String;

    .line 8
    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaPasswordCredentials;->tokenType:Ljava/lang/String;

    .line 9
    iput-object p4, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaPasswordCredentials;->refreshToken:Ljava/lang/String;

    .line 10
    iput-wide p5, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaPasswordCredentials;->expiresIn:J

    .line 11
    iput-wide p7, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaPasswordCredentials;->expiresAt:J

    .line 12
    iput-object p9, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaPasswordCredentials;->code:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 11

    and-int/lit8 v0, p10, 0x1

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    move v2, p1

    :goto_0
    move-object v1, p0

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-wide/from16 v6, p5

    move-wide/from16 v8, p7

    move-object/from16 v10, p9

    .line 5
    invoke-direct/range {v1 .. v10}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaPasswordCredentials;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;)V

    return-void
.end method

.method public static synthetic copy$default(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaPasswordCredentials;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;ILjava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaPasswordCredentials;
    .locals 10

    move-object v0, p0

    and-int/lit8 v1, p10, 0x1

    if-eqz v1, :cond_0

    iget v1, v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaPasswordCredentials;->uid:I

    goto :goto_0

    :cond_0
    move v1, p1

    :goto_0
    and-int/lit8 v2, p10, 0x2

    if-eqz v2, :cond_1

    iget-object v2, v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaPasswordCredentials;->accessToken:Ljava/lang/String;

    goto :goto_1

    :cond_1
    move-object v2, p2

    :goto_1
    and-int/lit8 v3, p10, 0x4

    if-eqz v3, :cond_2

    iget-object v3, v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaPasswordCredentials;->tokenType:Ljava/lang/String;

    goto :goto_2

    :cond_2
    move-object v3, p3

    :goto_2
    and-int/lit8 v4, p10, 0x8

    if-eqz v4, :cond_3

    iget-object v4, v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaPasswordCredentials;->refreshToken:Ljava/lang/String;

    goto :goto_3

    :cond_3
    move-object v4, p4

    :goto_3
    and-int/lit8 v5, p10, 0x10

    if-eqz v5, :cond_4

    iget-wide v5, v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaPasswordCredentials;->expiresIn:J

    goto :goto_4

    :cond_4
    move-wide v5, p5

    :goto_4
    and-int/lit8 v7, p10, 0x20

    if-eqz v7, :cond_5

    iget-wide v7, v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaPasswordCredentials;->expiresAt:J

    goto :goto_5

    :cond_5
    move-wide/from16 v7, p7

    :goto_5
    and-int/lit8 v9, p10, 0x40

    if-eqz v9, :cond_6

    iget-object v9, v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaPasswordCredentials;->code:Ljava/lang/String;

    goto :goto_6

    :cond_6
    move-object/from16 v9, p9

    :goto_6
    move p1, v1

    move-object p2, v2

    move-object p3, v3

    move-object p4, v4

    move-wide p5, v5

    move-wide/from16 p7, v7

    move-object/from16 p9, v9

    invoke-virtual/range {p0 .. p9}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaPasswordCredentials;->copy(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;)Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaPasswordCredentials;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaPasswordCredentials;->uid:I

    return v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaPasswordCredentials;->accessToken:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaPasswordCredentials;->tokenType:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaPasswordCredentials;->refreshToken:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()J
    .locals 2

    iget-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaPasswordCredentials;->expiresIn:J

    return-wide v0
.end method

.method public final component6()J
    .locals 2

    iget-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaPasswordCredentials;->expiresAt:J

    return-wide v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaPasswordCredentials;->code:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;)Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaPasswordCredentials;
    .locals 11

    const-string v0, "accessToken"

    move-object v3, p2

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "tokenType"

    move-object v4, p3

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "refreshToken"

    move-object v5, p4

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "code"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaPasswordCredentials;

    move-object v1, v0

    move v2, p1

    move-wide/from16 v6, p5

    move-wide/from16 v8, p7

    invoke-direct/range {v1 .. v10}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaPasswordCredentials;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaPasswordCredentials;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaPasswordCredentials;

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaPasswordCredentials;->uid:I

    iget v3, p1, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaPasswordCredentials;->uid:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaPasswordCredentials;->accessToken:Ljava/lang/String;

    iget-object v3, p1, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaPasswordCredentials;->accessToken:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaPasswordCredentials;->tokenType:Ljava/lang/String;

    iget-object v3, p1, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaPasswordCredentials;->tokenType:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaPasswordCredentials;->refreshToken:Ljava/lang/String;

    iget-object v3, p1, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaPasswordCredentials;->refreshToken:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-wide v3, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaPasswordCredentials;->expiresIn:J

    iget-wide v5, p1, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaPasswordCredentials;->expiresIn:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_6

    return v2

    :cond_6
    iget-wide v3, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaPasswordCredentials;->expiresAt:J

    iget-wide v5, p1, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaPasswordCredentials;->expiresAt:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaPasswordCredentials;->code:Ljava/lang/String;

    iget-object p1, p1, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaPasswordCredentials;->code:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final getAccessToken()Ljava/lang/String;
    .locals 1

    .line 7
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaPasswordCredentials;->accessToken:Ljava/lang/String;

    return-object v0
.end method

.method public final getCode()Ljava/lang/String;
    .locals 1

    .line 12
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaPasswordCredentials;->code:Ljava/lang/String;

    return-object v0
.end method

.method public final getExpiresAt()J
    .locals 2

    .line 11
    iget-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaPasswordCredentials;->expiresAt:J

    return-wide v0
.end method

.method public final getExpiresIn()J
    .locals 2

    .line 10
    iget-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaPasswordCredentials;->expiresIn:J

    return-wide v0
.end method

.method public final getRefreshToken()Ljava/lang/String;
    .locals 1

    .line 9
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaPasswordCredentials;->refreshToken:Ljava/lang/String;

    return-object v0
.end method

.method public final getTokenType()Ljava/lang/String;
    .locals 1

    .line 8
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaPasswordCredentials;->tokenType:Ljava/lang/String;

    return-object v0
.end method

.method public final getUid()I
    .locals 1

    .line 6
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaPasswordCredentials;->uid:I

    return v0
.end method

.method public final hasExpired()Z
    .locals 6

    .line 15
    iget-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaPasswordCredentials;->expiresAt:J

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    const/16 v4, 0x3e8

    int-to-long v4, v4

    div-long/2addr v2, v4

    sub-long/2addr v0, v2

    const-wide/16 v2, 0xe10

    cmp-long v4, v0, v2

    if-gez v4, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public hashCode()I
    .locals 3

    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaPasswordCredentials;->uid:I

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaPasswordCredentials;->accessToken:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaPasswordCredentials;->tokenType:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaPasswordCredentials;->refreshToken:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaPasswordCredentials;->expiresIn:J

    invoke-static {v1, v2}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter$SleepSession-$$ExternalSynthetic0;->m0(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaPasswordCredentials;->expiresAt:J

    invoke-static {v1, v2}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter$SleepSession-$$ExternalSynthetic0;->m0(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaPasswordCredentials;->code:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "StravaPasswordCredentials(uid="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaPasswordCredentials;->uid:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", accessToken="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaPasswordCredentials;->accessToken:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", tokenType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaPasswordCredentials;->tokenType:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", refreshToken="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaPasswordCredentials;->refreshToken:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", expiresIn="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaPasswordCredentials;->expiresIn:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", expiresAt="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaPasswordCredentials;->expiresAt:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", code="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaPasswordCredentials;->code:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
