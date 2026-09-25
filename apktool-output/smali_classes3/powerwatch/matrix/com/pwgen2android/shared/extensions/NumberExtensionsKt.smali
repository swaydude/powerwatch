.class public final Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NumberExtensionsKt;
.super Ljava/lang/Object;
.source "NumberExtensions.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u0006\n\u0002\u0010\u0004\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0004\u001a\u001e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0005\u001a\u0012\u0010\u0006\u001a\u00020\u0007*\u00020\u00082\u0006\u0010\t\u001a\u00020\u0003\u001a\u0012\u0010\u0006\u001a\u00020\u0007*\u00020\u00082\u0006\u0010\t\u001a\u00020\n\u001a\u0012\u0010\u000b\u001a\u00020\u0003*\u00020\u00082\u0006\u0010\t\u001a\u00020\u0003\u001a\u0012\u0010\u000b\u001a\u00020\u0003*\u00020\u00082\u0006\u0010\t\u001a\u00020\n\u001a$\u0010\u000c\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u0010\u001a\n\u0010\u0011\u001a\u00020\u0012*\u00020\u0008\u001a\n\u0010\u0013\u001a\u00020\u0012*\u00020\u0014\u001a\u0014\u0010\u0015\u001a\u00020\u0003*\u00020\u00032\u0008\u0008\u0002\u0010\u0016\u001a\u00020\u0003\u001a\n\u0010\u0017\u001a\u00020\u0012*\u00020\u0014\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006\u0018"
    }
    d2 = {
        "createMask",
        "Lkotlin/UInt;",
        "a",
        "",
        "b",
        "(II)I",
        "divide",
        "",
        "",
        "divideIndex",
        "",
        "divideRounded",
        "extractNumber",
        "low",
        "high",
        "useSign",
        "",
        "formatByLocale",
        "",
        "oneDecimalFormat",
        "",
        "toFloatingNumber",
        "bias",
        "twoDecimalsFormat",
        "app_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x5,
        0x1
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final createMask(II)I
    .locals 1

    const/4 v0, 0x0

    :goto_0
    if-lt p0, p1, :cond_0

    shl-int/lit8 v0, v0, 0x1

    .line 42
    invoke-static {v0}, Lkotlin/UInt;->constructor-impl(I)I

    move-result v0

    or-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Lkotlin/UInt;->constructor-impl(I)I

    move-result v0

    add-int/lit8 p0, p0, -0x1

    goto :goto_0

    :cond_0
    :goto_1
    if-ltz p0, :cond_1

    shl-int/lit8 p1, v0, 0x1

    .line 47
    invoke-static {p1}, Lkotlin/UInt;->constructor-impl(I)I

    move-result v0

    add-int/lit8 p0, p0, -0x1

    goto :goto_1

    :cond_1
    return v0
.end method

.method public static final divide(Ljava/lang/Number;I)D
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    int-to-long v0, p1

    .line 58
    invoke-static {p0, v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NumberExtensionsKt;->divide(Ljava/lang/Number;J)D

    move-result-wide p0

    return-wide p0
.end method

.method public static final divide(Ljava/lang/Number;J)D
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 54
    invoke-virtual {p0}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v0

    long-to-double p0, p1

    div-double/2addr v0, p0

    return-wide v0
.end method

.method public static final divideRounded(Ljava/lang/Number;I)I
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    int-to-long v0, p1

    .line 66
    invoke-static {p0, v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NumberExtensionsKt;->divideRounded(Ljava/lang/Number;J)I

    move-result p0

    return p0
.end method

.method public static final divideRounded(Ljava/lang/Number;J)I
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 62
    invoke-virtual {p0}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v0

    long-to-double p0, p1

    div-double/2addr v0, p0

    invoke-static {v0, v1}, Lkotlin/math/MathKt;->roundToInt(D)I

    move-result p0

    return p0
.end method

.method public static final extractNumber(IIIZ)I
    .locals 4

    .line 18
    invoke-static {p2, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NumberExtensionsKt;->createMask(II)I

    move-result v0

    .line 19
    invoke-static {p0}, Lkotlin/UInt;->constructor-impl(I)I

    move-result p0

    and-int/2addr p0, v0

    invoke-static {p0}, Lkotlin/UInt;->constructor-impl(I)I

    move-result p0

    ushr-int/2addr p0, p1

    invoke-static {p0}, Lkotlin/UInt;->constructor-impl(I)I

    move-result p0

    if-eqz p3, :cond_0

    sub-int/2addr p2, p1

    int-to-double v0, p2

    const-wide/high16 v2, 0x4000000000000000L    # 2.0

    .line 22
    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v0

    double-to-int p1, v0

    add-int/lit8 p1, p1, -0x1

    if-le p0, p1, :cond_0

    add-int/lit8 p2, p2, 0x1

    int-to-double p1, p2

    invoke-static {v2, v3, p1, p2}, Ljava/lang/Math;->pow(DD)D

    move-result-wide p1

    double-to-int p1, p1

    sub-int/2addr p0, p1

    :cond_0
    return p0
.end method

.method public static synthetic extractNumber$default(IIIZILjava/lang/Object;)I
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    .line 17
    :cond_0
    invoke-static {p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NumberExtensionsKt;->extractNumber(IIIZ)I

    move-result p0

    return p0
.end method

.method public static final formatByLocale(Ljava/lang/Number;)Ljava/lang/String;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    invoke-static {}, Ljava/text/NumberFormat;->getNumberInstance()Ljava/text/NumberFormat;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/text/NumberFormat;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    const-string v0, "getNumberInstance().format(this)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static final oneDecimalFormat(F)Ljava/lang/String;
    .locals 3

    const/4 v0, 0x1

    new-array v1, v0, [Ljava/lang/Object;

    .line 10
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p0

    const/4 v2, 0x0

    aput-object p0, v1, v2

    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p0

    const-string v0, "%.1f"

    invoke-static {v0, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    const-string v0, "java.lang.String.format(this, *args)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static final toFloatingNumber(II)I
    .locals 7

    add-int/lit8 v2, p1, -0x2

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x4

    const/4 v5, 0x0

    move v0, p0

    .line 30
    invoke-static/range {v0 .. v5}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NumberExtensionsKt;->extractNumber$default(IIIZILjava/lang/Object;)I

    move-result v0

    add-int/lit8 v2, p1, -0x1

    mul-int/lit8 p1, p1, 0x2

    add-int/lit8 v3, p1, -0x1

    const/4 v4, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x0

    move v1, p0

    .line 31
    invoke-static/range {v1 .. v6}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NumberExtensionsKt;->extractNumber$default(IIIZILjava/lang/Object;)I

    move-result p0

    if-nez p0, :cond_0

    return v0

    :cond_0
    int-to-double v1, p0

    const-wide/high16 v3, 0x3ff0000000000000L    # 1.0

    add-double/2addr v1, v3

    const-wide/high16 v3, 0x4000000000000000L    # 2.0

    .line 34
    invoke-static {v3, v4, v1, v2}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v1

    int-to-double v5, v0

    add-int/lit8 p0, p0, -0x1

    int-to-double p0, p0

    invoke-static {v3, v4, p0, p1}, Ljava/lang/Math;->pow(DD)D

    move-result-wide p0

    mul-double v5, v5, p0

    add-double/2addr v1, v5

    double-to-int p0, v1

    return p0
.end method

.method public static synthetic toFloatingNumber$default(IIILjava/lang/Object;)I
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x3

    .line 28
    :cond_0
    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NumberExtensionsKt;->toFloatingNumber(II)I

    move-result p0

    return p0
.end method

.method public static final twoDecimalsFormat(F)Ljava/lang/String;
    .locals 3

    const/4 v0, 0x1

    new-array v1, v0, [Ljava/lang/Object;

    .line 9
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p0

    const/4 v2, 0x0

    aput-object p0, v1, v2

    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p0

    const-string v0, "%.2f"

    invoke-static {v0, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    const-string v0, "java.lang.String.format(this, *args)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method
