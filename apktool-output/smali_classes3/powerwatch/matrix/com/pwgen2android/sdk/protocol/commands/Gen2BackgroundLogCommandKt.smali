.class public final Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2BackgroundLogCommandKt;
.super Ljava/lang/Object;
.source "Gen2BackgroundLogCommand.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0010\u0015\n\u0002\u0008\u0005\"\u0011\u0010\u0000\u001a\u00020\u0001\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0002\u0010\u0003\"\u0011\u0010\u0004\u001a\u00020\u0001\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0003\u00a8\u0006\u0006"
    }
    d2 = {
        "consumptionArray",
        "",
        "getConsumptionArray",
        "()[I",
        "generationArray",
        "getGenerationArray",
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


# static fields
.field private static final consumptionArray:[I

.field private static final generationArray:[I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x40

    new-array v0, v0, [I

    .line 31
    fill-array-data v0, :array_0

    .line 30
    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2BackgroundLogCommandKt;->generationArray:[I

    const/16 v0, 0x100

    new-array v0, v0, [I

    .line 51
    fill-array-data v0, :array_1

    .line 50
    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2BackgroundLogCommandKt;->consumptionArray:[I

    return-void

    nop

    :array_0
    .array-data 4
        0x0
        0x1
        0x2
        0x3
        0x4
        0x5
        0x6
        0x7
        0x8
        0xa
        0xc
        0xe
        0x10
        0x14
        0x18
        0x1c
        0x20
        0x28
        0x30
        0x38
        0x40
        0x50
        0x60
        0x70
        0x80
        0xa0
        0xc0
        0xe0
        0x100
        0x140
        0x180
        0x1c0
        0x200
        0x280
        0x300
        0x380
        0x400
        0x500
        0x600
        0x700
        0x800
        0xa00
        0xc00
        0xe00
        0x1000
        0x1400
        0x1800
        0x1c00
        0x2000
        0x2800
        0x3000
        0x3800
        0x4000
        0x5000
        0x6000
        0x7000
        0x8000
        0xa000
        0xc000
        0xe000
        0x10000
        0x14000
        0x18000
        0x1c000
    .end array-data

    :array_1
    .array-data 4
        0x0
        0x1
        0x2
        0x3
        0x4
        0x5
        0x6
        0x7
        0x8
        0x9
        0xa
        0xb
        0xc
        0xd
        0xe
        0xf
        0x10
        0x11
        0x12
        0x13
        0x14
        0x15
        0x16
        0x17
        0x18
        0x19
        0x1a
        0x1b
        0x1c
        0x1d
        0x1e
        0x1f
        0x20
        0x22
        0x24
        0x26
        0x28
        0x2a
        0x2c
        0x2e
        0x30
        0x32
        0x34
        0x36
        0x38
        0x3a
        0x3c
        0x3e
        0x40
        0x44
        0x48
        0x4c
        0x50
        0x54
        0x58
        0x5c
        0x60
        0x64
        0x68
        0x6c
        0x70
        0x74
        0x78
        0x7c
        0x80
        0x88
        0x90
        0x98
        0xa0
        0xa8
        0xb0
        0xb8
        0xc0
        0xc8
        0xd0
        0xd8
        0xe0
        0xe8
        0xf0
        0xf8
        0x100
        0x110
        0x120
        0x130
        0x140
        0x150
        0x160
        0x170
        0x180
        0x190
        0x1a0
        0x1b0
        0x1c0
        0x1d0
        0x1e0
        0x1f0
        0x200
        0x220
        0x240
        0x260
        0x280
        0x2a0
        0x2c0
        0x2e0
        0x300
        0x320
        0x340
        0x360
        0x380
        0x3a0
        0x3c0
        0x3e0
        0x400
        0x440
        0x480
        0x4c0
        0x500
        0x540
        0x580
        0x5c0
        0x600
        0x640
        0x680
        0x6c0
        0x700
        0x740
        0x780
        0x7c0
        0x800
        0x880
        0x900
        0x980
        0xa00
        0xa80
        0xb00
        0xb80
        0xc00
        0xc80
        0xd00
        0xd80
        0xe00
        0xe80
        0xf00
        0xf80
        0x1000
        0x1100
        0x1200
        0x1300
        0x1400
        0x1500
        0x1600
        0x1700
        0x1800
        0x1900
        0x1a00
        0x1b00
        0x1c00
        0x1d00
        0x1e00
        0x1f00
        0x2000
        0x2200
        0x2400
        0x2600
        0x2800
        0x2a00
        0x2c00
        0x2e00
        0x3000
        0x3200
        0x3400
        0x3600
        0x3800
        0x3a00
        0x3c00
        0x3e00
        0x4000
        0x4400
        0x4800
        0x4c00
        0x5000
        0x5400
        0x5800
        0x5c00
        0x6000
        0x6400
        0x6800
        0x6c00
        0x7000
        0x7400
        0x7800
        0x7c00
        0x8000
        0x8800
        0x9000
        0x9800
        0xa000
        0xa800
        0xb000
        0xb800
        0xc000
        0xc800
        0xd000
        0xd800
        0xe000
        0xe800
        0xf000
        0xf800
        0x10000
        0x11000
        0x12000
        0x13000
        0x14000
        0x15000
        0x16000
        0x17000
        0x18000
        0x19000
        0x1a000
        0x1b000
        0x1c000
        0x1d000
        0x1e000
        0x1f000
        0x20000
        0x22000
        0x24000
        0x26000
        0x28000
        0x2a000
        0x2c000
        0x2e000
        0x30000
        0x32000
        0x34000
        0x36000
        0x38000
        0x3a000
        0x3c000
        0x3e000
        0x40000
        0x44000
        0x48000
        0x4c000
        0x50000
        0x54000
        0x58000
        0x5c000
        0x60000
        0x64000
        0x68000
        0x6c000
        0x70000
        0x74000
        0x78000
        0x7c000
    .end array-data
.end method

.method public static final getConsumptionArray()[I
    .locals 1

    .line 50
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2BackgroundLogCommandKt;->consumptionArray:[I

    return-object v0
.end method

.method public static final getGenerationArray()[I
    .locals 1

    .line 30
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2BackgroundLogCommandKt;->generationArray:[I

    return-object v0
.end method
