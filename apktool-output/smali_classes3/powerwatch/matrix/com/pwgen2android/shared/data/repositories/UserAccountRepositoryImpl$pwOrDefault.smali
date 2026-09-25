.class Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepositoryImpl$pwOrDefault;
.super Ljava/lang/Object;
.source "UserAccountRepositoryImpl.java"

# interfaces
.implements Lio/reactivex/functions/Function;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepositoryImpl;->load(ZZ)Lio/reactivex/Observable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "pwOrDefault"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lio/reactivex/functions/Function<",
        "Ljava/lang/Object;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
# PW_OFFLINE PATCH v2: pass-through for a Room-emitted user; substitute the offline
# default User (uid = 0) when the value is NULL. Room's observeUser() emits a NULL
# element (not an empty stream) when the User table is empty, so mapping it through
# this Function restores exactly what the v1 patch's Observable.just(constant)
# provided, but ONLY in the empty-DB case — a saved row (wheel-saved clock 12/24h,
# units, language) passes through untouched instead of being masked by the constant.
# The v1 unconditional-constant load() was the "watch + app settings not saved" bug:
# update() wrote the value to Room (INSERT OR REPLACE) and pushed it to the watch,
# but the read side always returned the constant, so the app display reverted.
#
# Register note: .locals 16 is forced by the 14-slot constant build (range invokes
# need 13-14 consecutive regs ending at <= v15), which puts p1 at v17 — too wide for
# the 4-bit (21T) if-nez, so the null check moves p1 into v0 first via
# move-object/FROM16 (31I — smali rejects plain 12X move-object for pN > v15);
# the build below overwrites v0 with the constant, which is flow-safely dead.
.method public apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    # from16 form: smali 2.9.3 rejects a pN above v15 on plain move-object (12X)
    # ("Invalid register: v17"), even though the dex 12X field is 8-bit.
    move-object/from16 v0, p1

    if-nez v0, :pw_ret

    const-wide/16 v1, 0x0              # uid = 0L (v1-v2)
    const/4 v3, 0x1                    # enabled = true
    const-string v4, "Test"            # name
    const-string v5, "test@test.com"   # email
    const-string v6, "test1234"        # password
    const/16 v7, 0x19                  # age = 25
    const/16 v8, 0xb4                  # height = 180
    const v9, 0x42800000               # weight = 80.0f
    const-string v10, "Male"           # gender
    const/4 v11, 0x0                   # shouldSync = false
    const-string v13, "en_US"          # settings.language
    const-string v14, "metric"         # settings.unitType
    const/4 v15, 0x0                   # settings.timeFormatType (0 => 24h default)
    new-instance v12, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserAccountSettings;
    invoke-direct/range {v12 .. v15}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserAccountSettings;-><init>(Ljava/lang/String;Ljava/lang/String;I)V
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;
    invoke-direct/range {v0 .. v12}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;-><init>(JZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;IIFLjava/lang/String;ZLpowerwatch/matrix/com/pwgen2android/shared/data/models/UserAccountSettings;)V

    :pw_ret
    return-object v0
.end method
