.class public final Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;
.super Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;
.source "PWWatchViewModel.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nPWWatchViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PWWatchViewModel.kt\npowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,653:1\n286#2,2:654\n1547#2:658\n1618#2,3:659\n1547#2:664\n1618#2,3:665\n37#3,2:656\n37#3,2:662\n37#3,2:668\n*S KotlinDebug\n*F\n+ 1 PWWatchViewModel.kt\npowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel\n*L\n407#1:654,2\n455#1:658\n455#1:659,3\n475#1:664\n475#1:665,3\n416#1:656,2\n456#1:662,2\n475#1:668,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0090\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u001a\u0018\u0000 \u00a1\u00012\u00020\u00012\u00020\u0002:\u0002\u00a1\u0001B\u00bf\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u000c\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0018\u0012\u0006\u0010\u0019\u001a\u00020\u001a\u0012\u0006\u0010\u001b\u001a\u00020\u001c\u0012\u0006\u0010\u001d\u001a\u00020\u001e\u0012\u0006\u0010\u001f\u001a\u00020 \u0012\u0006\u0010!\u001a\u00020\"\u0012\u0006\u0010#\u001a\u00020$\u0012\u0006\u0010%\u001a\u00020&\u0012\u0006\u0010\'\u001a\u00020(\u0012\u0006\u0010)\u001a\u00020*\u0012\u0006\u0010+\u001a\u00020,\u0012\u0006\u0010-\u001a\u00020.\u0012\u0008\u0008\u0002\u0010/\u001a\u000200\u00a2\u0006\u0002\u00101J\u0006\u0010o\u001a\u00020pJ\u0006\u0010q\u001a\u00020pJ\u0008\u0010r\u001a\u000204H\u0002J\u0014\u0010s\u001a\u00020p2\n\u0008\u0002\u0010t\u001a\u0004\u0018\u000104H\u0002J\u000e\u0010u\u001a\u00020p2\u0006\u0010v\u001a\u00020DJ1\u0010w\u001a\u00020p2\u0006\u0010x\u001a\u00020D2!\u0010y\u001a\u001d\u0012\u0013\u0012\u00110D\u00a2\u0006\u000c\u0008{\u0012\u0008\u0008|\u0012\u0004\u0008\u0008(}\u0012\u0004\u0012\u00020p0zJ\u0006\u0010~\u001a\u00020DJ\u0008\u0010\u007f\u001a\u000204H\u0002J\u0013\u0010\u0080\u0001\u001a\u00020p2\u0008\u0010\u0081\u0001\u001a\u00030\u0082\u0001H\u0016J\u0013\u0010\u0083\u0001\u001a\u00020p2\u0008\u0010\u0081\u0001\u001a\u00030\u0082\u0001H\u0016J\t\u0010\u0084\u0001\u001a\u00020pH\u0002J\u0012\u0010\u0085\u0001\u001a\u00020p2\u0007\u0010\u0086\u0001\u001a\u000204H\u0002J\u000c\u0010\u0087\u0001\u001a\u00020p*\u00030\u0088\u0001J\u000c\u0010\u0089\u0001\u001a\u00020p*\u00030\u0088\u0001J\u000c\u0010\u008a\u0001\u001a\u00020p*\u00030\u0088\u0001J\u000c\u0010\u008b\u0001\u001a\u00020p*\u00030\u0088\u0001J\u000c\u0010\u008c\u0001\u001a\u00020p*\u00030\u0088\u0001J\u000c\u0010\u008d\u0001\u001a\u00020p*\u00030\u0088\u0001J\u000c\u0010\u008e\u0001\u001a\u00020p*\u00030\u0088\u0001J\u000c\u0010\u008f\u0001\u001a\u00020p*\u00030\u0088\u0001J\u000c\u0010\u0090\u0001\u001a\u00020p*\u00030\u0088\u0001J\u000c\u0010\u0091\u0001\u001a\u00020p*\u00030\u0088\u0001J\u000c\u0010\u0092\u0001\u001a\u00020p*\u00030\u0088\u0001J\u000c\u0010\u0093\u0001\u001a\u00020p*\u00030\u0088\u0001J\u000c\u0010\u0094\u0001\u001a\u00020p*\u00030\u0088\u0001J\u000c\u0010\u0095\u0001\u001a\u00020p*\u00030\u0088\u0001J\u000c\u0010\u0096\u0001\u001a\u00020p*\u00030\u0088\u0001J\u000c\u0010\u0097\u0001\u001a\u00020p*\u00030\u0088\u0001J\u000c\u0010\u0098\u0001\u001a\u00020p*\u00030\u0088\u0001J\u000c\u0010\u0099\u0001\u001a\u00020p*\u00030\u0088\u0001J\u000c\u0010\u009a\u0001\u001a\u00020p*\u00030\u0088\u0001J\u000c\u0010\u009b\u0001\u001a\u00020p*\u00030\u0088\u0001J\u000c\u0010\u009c\u0001\u001a\u00020p*\u00030\u0088\u0001J\u000c\u0010\u009d\u0001\u001a\u00020p*\u00030\u0088\u0001J\u000c\u0010\u009e\u0001\u001a\u00020p*\u00030\u0088\u0001J\u000c\u0010\u009f\u0001\u001a\u00020p*\u00030\u0088\u0001J\u000c\u0010\u00a0\u0001\u001a\u00020p*\u00030\u0088\u0001R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u00102\u001a\u0010\u0012\u000c\u0012\n 5*\u0004\u0018\u0001040403\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00086\u00107R\u001f\u00108\u001a\u0010\u0012\u000c\u0012\n 5*\u0004\u0018\u0001040403\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00089\u00107R\u000e\u0010%\u001a\u00020&X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010:\u001a\u0010\u0012\u000c\u0012\n 5*\u0004\u0018\u0001040403\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008;\u00107R\u0016\u0010<\u001a\n 5*\u0004\u0018\u00010=0=X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010>\u001a\u0010\u0012\u000c\u0012\n 5*\u0004\u0018\u00010@0@0?X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010A\u001a\u0010\u0012\u000c\u0012\n 5*\u0004\u0018\u0001040403\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008B\u00107R\u000e\u0010+\u001a\u00020,X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020.X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010C\u001a\u0010\u0012\u000c\u0012\n 5*\u0004\u0018\u00010D0D03\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008E\u00107R\u0014\u0010F\u001a\u0008\u0012\u0004\u0012\u00020\u001a0GX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020*X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010H\u001a\u0004\u0018\u00010IX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001f\u0010J\u001a\u0010\u0012\u000c\u0012\n 5*\u0004\u0018\u0001040403\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008K\u00107R\u0017\u0010L\u001a\u0008\u0012\u0004\u0012\u00020403\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008M\u00107R\u0014\u0010N\u001a\u0008\u0012\u0004\u0012\u00020\u001c0GX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010O\u001a\u0010\u0012\u000c\u0012\n 5*\u0004\u0018\u0001040403\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008P\u00107R\u0010\u0010Q\u001a\u0004\u0018\u00010RX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010S\u001a\u0010\u0012\u000c\u0012\n 5*\u0004\u0018\u00010D0D03\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008T\u00107R\u001f\u0010U\u001a\u0010\u0012\u000c\u0012\n 5*\u0004\u0018\u0001040403\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008V\u00107R\u001f\u0010W\u001a\u0010\u0012\u000c\u0012\n 5*\u0004\u0018\u00010D0D03\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008W\u00107R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010X\u001a\u0010\u0012\u000c\u0012\n 5*\u0004\u0018\u0001040403\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008Y\u00107R\u000e\u0010#\u001a\u00020$X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010Z\u001a\u0010\u0012\u000c\u0012\n 5*\u0004\u0018\u00010\u001e0\u001e0GX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010[\u001a\u0004\u0018\u00010\\X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001f\u0010]\u001a\u0010\u0012\u000c\u0012\n 5*\u0004\u0018\u0001040403\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008^\u00107R\u000e\u0010/\u001a\u000200X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010_\u001a\u0010\u0012\u000c\u0012\n 5*\u0004\u0018\u0001040403\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008`\u00107R\u001f\u0010a\u001a\u0010\u0012\u000c\u0012\n 5*\u0004\u0018\u0001040403\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008b\u00107R\u000e\u0010\'\u001a\u00020(X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010c\u001a\u0010\u0012\u000c\u0012\n 5*\u0004\u0018\u0001040403\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008d\u00107R\u000e\u0010!\u001a\u00020\"X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010e\u001a\u0010\u0012\u000c\u0012\n 5*\u0004\u0018\u00010D0D03\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008f\u00107R\u001f\u0010g\u001a\u0010\u0012\u000c\u0012\n 5*\u0004\u0018\u0001040403\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008h\u00107R\u0010\u0010i\u001a\u0004\u0018\u00010jX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010k\u001a\u00020lX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u000cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010m\u001a\u0010\u0012\u000c\u0012\n 5*\u0004\u0018\u0001040403\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008n\u00107\u00a8\u0006\u00a2\u0001"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;",
        "userAccountRepository",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;",
        "loginCloudService",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/LoginCloudService;",
        "deviceRepository",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;",
        "updateInfoRepository",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UpdateInfoRepository;",
        "userPrefsUtils",
        "Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;",
        "deviceManager",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;",
        "dbManager",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DBManager;",
        "dialogManager",
        "Lpowerwatch/matrix/com/pwgen2android/shared/ui/dialogManager/DialogManager;",
        "languageController",
        "Lpowerwatch/matrix/com/pwgen2android/utils/LanguageController;",
        "goalsRepository",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepository;",
        "activityPeriodCacheClear",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/ActivityPeriodCacheClear;",
        "activity",
        "Landroid/app/Activity;",
        "fragment",
        "Landroidx/fragment/app/Fragment;",
        "fragmentManager",
        "Landroidx/fragment/app/FragmentManager;",
        "googleFitController",
        "Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;",
        "stravaController",
        "Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;",
        "locationInfoProvider",
        "Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProvider;",
        "bugfenderConfig",
        "Lpowerwatch/matrix/com/pwgen2android/BugfenderConfig;",
        "sleepTimeUIStorage",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/SleepTimeUIStorage;",
        "deviceProtocolStorage",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceProtocolStorage;",
        "communicator",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;",
        "connectionPreference",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/ConnectionPreference;",
        "rxPermissions",
        "Lcom/tbruyelle/rxpermissions2/RxPermissions;",
        "(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/LoginCloudService;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UpdateInfoRepository;Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DBManager;Lpowerwatch/matrix/com/pwgen2android/shared/ui/dialogManager/DialogManager;Lpowerwatch/matrix/com/pwgen2android/utils/LanguageController;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/ActivityPeriodCacheClear;Landroid/app/Activity;Landroidx/fragment/app/Fragment;Landroidx/fragment/app/FragmentManager;Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProvider;Lpowerwatch/matrix/com/pwgen2android/BugfenderConfig;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/SleepTimeUIStorage;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceProtocolStorage;Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/ConnectionPreference;Lcom/tbruyelle/rxpermissions2/RxPermissions;)V",
        "ageField",
        "Landroidx/databinding/ObservableField;",
        "",
        "kotlin.jvm.PlatformType",
        "getAgeField",
        "()Landroidx/databinding/ObservableField;",
        "appVersionField",
        "getAppVersionField",
        "caloriesField",
        "getCaloriesField",
        "clickObservable",
        "Lio/reactivex/Completable;",
        "clickSubject",
        "Lio/reactivex/subjects/PublishSubject;",
        "",
        "clockField",
        "getClockField",
        "connectionStatus",
        "",
        "getConnectionStatus",
        "contextWeakReference",
        "Ljava/lang/ref/WeakReference;",
        "disposable",
        "Lio/reactivex/disposables/Disposable;",
        "emailField",
        "getEmailField",
        "firmwareVersionField",
        "getFirmwareVersionField",
        "fragmentWeakReference",
        "genderField",
        "getGenderField",
        "goalConfig",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;",
        "googleFitStatus",
        "getGoogleFitStatus",
        "heightField",
        "getHeightField",
        "isUpdateAvailable",
        "languageField",
        "getLanguageField",
        "managerWeakReference",
        "pairedDevice",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;",
        "powerField",
        "getPowerField",
        "sleepField",
        "getSleepField",
        "sleepTimeField",
        "getSleepTimeField",
        "stepsField",
        "getStepsField",
        "stravaStatus",
        "getStravaStatus",
        "unitsField",
        "getUnitsField",
        "updateInfo",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UpdateInfo;",
        "user",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;",
        "weightField",
        "getWeightField",
        "authorizationCanceled",
        "",
        "authorizationSuccess",
        "createAppInfoData",
        "displaySleepTime",
        "deviceID",
        "enableConnectionOptimization",
        "value",
        "enableConnectionOptimizationDialog",
        "enable",
        "callback",
        "Lkotlin/Function1;",
        "Lkotlin/ParameterName;",
        "name",
        "approved",
        "isConnectionOptimized",
        "loadFWVersion",
        "onCreateView",
        "context",
        "Landroid/content/Context;",
        "onStart",
        "openSecretScreen",
        "printMessage",
        "message",
        "onAgeClicked",
        "Landroid/view/View;",
        "onAppVersionFieldClick",
        "onCaloriesClicked",
        "onChangePasswordClicked",
        "onClockClicked",
        "onContactSupportClicked",
        "onDailySettingsClicked",
        "onGenderClicked",
        "onHeightClicked",
        "onLanguageClicked",
        "onLocationRequested",
        "onLogoutClicked",
        "onNotificationSettingsClicked",
        "onNotificationsClicked",
        "onPersonalPreferencesSettingsClicked",
        "onPowerClicked",
        "onReportIssueClicked",
        "onSleepClicked",
        "onSleepTimeClicked",
        "onStepsClicked",
        "onUnPairClicked",
        "onUnitsClicked",
        "onUpdateClicked",
        "onWatchSettingsClicked",
        "onWeightClicked",
        "Companion",
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
.field public static final Companion:Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel$Companion;

.field private static final TAG:Ljava/lang/String;


# instance fields
.field private final activityPeriodCacheClear:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/ActivityPeriodCacheClear;

.field private final ageField:Landroidx/databinding/ObservableField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final appVersionField:Landroidx/databinding/ObservableField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final bugfenderConfig:Lpowerwatch/matrix/com/pwgen2android/BugfenderConfig;

.field private final caloriesField:Landroidx/databinding/ObservableField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final clickObservable:Lio/reactivex/Completable;

.field private final clickSubject:Lio/reactivex/subjects/PublishSubject;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/subjects/PublishSubject<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final clockField:Landroidx/databinding/ObservableField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final communicator:Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;

.field private final connectionPreference:Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/ConnectionPreference;

.field private final connectionStatus:Landroidx/databinding/ObservableField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final contextWeakReference:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/app/Activity;",
            ">;"
        }
    .end annotation
.end field

.field private final dbManager:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DBManager;

.field private final deviceManager:Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;

.field private final deviceProtocolStorage:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceProtocolStorage;

.field private final deviceRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;

.field private final dialogManager:Lpowerwatch/matrix/com/pwgen2android/shared/ui/dialogManager/DialogManager;

.field private disposable:Lio/reactivex/disposables/Disposable;

.field private final emailField:Landroidx/databinding/ObservableField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final firmwareVersionField:Landroidx/databinding/ObservableField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final fragmentWeakReference:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroidx/fragment/app/Fragment;",
            ">;"
        }
    .end annotation
.end field

.field private final genderField:Landroidx/databinding/ObservableField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private goalConfig:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;

.field private final goalsRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepository;

.field private final googleFitController:Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;

.field private final googleFitStatus:Landroidx/databinding/ObservableField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final heightField:Landroidx/databinding/ObservableField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final isUpdateAvailable:Landroidx/databinding/ObservableField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final languageController:Lpowerwatch/matrix/com/pwgen2android/utils/LanguageController;

.field private final languageField:Landroidx/databinding/ObservableField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final locationInfoProvider:Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProvider;

.field private final loginCloudService:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/LoginCloudService;

.field private final managerWeakReference:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroidx/fragment/app/FragmentManager;",
            ">;"
        }
    .end annotation
.end field

.field private pairedDevice:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;

.field private final powerField:Landroidx/databinding/ObservableField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final rxPermissions:Lcom/tbruyelle/rxpermissions2/RxPermissions;

.field private final sleepField:Landroidx/databinding/ObservableField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final sleepTimeField:Landroidx/databinding/ObservableField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final sleepTimeUIStorage:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/SleepTimeUIStorage;

.field private final stepsField:Landroidx/databinding/ObservableField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final stravaController:Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;

.field private final stravaStatus:Landroidx/databinding/ObservableField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final unitsField:Landroidx/databinding/ObservableField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private updateInfo:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UpdateInfo;

.field private final updateInfoRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UpdateInfoRepository;

.field private user:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;

.field private final userAccountRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;

.field private final userPrefsUtils:Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;

.field private final weightField:Landroidx/databinding/ObservableField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->Companion:Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel$Companion;

    .line 651
    const-class v0, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;

    invoke-static {v0}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v0

    invoke-interface {v0}, Lkotlin/reflect/KClass;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->TAG:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/LoginCloudService;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UpdateInfoRepository;Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DBManager;Lpowerwatch/matrix/com/pwgen2android/shared/ui/dialogManager/DialogManager;Lpowerwatch/matrix/com/pwgen2android/utils/LanguageController;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/ActivityPeriodCacheClear;Landroid/app/Activity;Landroidx/fragment/app/Fragment;Landroidx/fragment/app/FragmentManager;Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProvider;Lpowerwatch/matrix/com/pwgen2android/BugfenderConfig;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/SleepTimeUIStorage;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceProtocolStorage;Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/ConnectionPreference;Lcom/tbruyelle/rxpermissions2/RxPermissions;)V
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    move-object/from16 v9, p9

    move-object/from16 v10, p10

    move-object/from16 v11, p11

    move-object/from16 v12, p12

    move-object/from16 v13, p13

    move-object/from16 v14, p14

    move-object/from16 v15, p15

    move-object/from16 v0, p16

    const-string v0, "userAccountRepository"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "loginCloudService"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deviceRepository"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "updateInfoRepository"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userPrefsUtils"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deviceManager"

    invoke-static {v6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dbManager"

    invoke-static {v7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dialogManager"

    invoke-static {v8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "languageController"

    invoke-static {v9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "goalsRepository"

    invoke-static {v10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "activityPeriodCacheClear"

    invoke-static {v11, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "activity"

    invoke-static {v12, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fragment"

    invoke-static {v13, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fragmentManager"

    invoke-static {v14, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "googleFitController"

    invoke-static {v15, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "stravaController"

    move-object/from16 v13, p16

    invoke-static {v13, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "locationInfoProvider"

    move-object/from16 v13, p17

    invoke-static {v13, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bugfenderConfig"

    move-object/from16 v12, p18

    invoke-static {v12, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sleepTimeUIStorage"

    move-object/from16 v14, p19

    invoke-static {v14, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deviceProtocolStorage"

    move-object/from16 v14, p20

    invoke-static {v14, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "communicator"

    move-object/from16 v14, p21

    invoke-static {v14, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "connectionPreference"

    move-object/from16 v14, p22

    invoke-static {v14, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "rxPermissions"

    move-object/from16 v14, p23

    invoke-static {v14, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v14, 0x3

    move-object/from16 v12, p0

    move-object/from16 v13, p16

    .line 100
    invoke-direct {v12, v0, v0, v14, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;-><init>(Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 78
    iput-object v1, v12, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->userAccountRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;

    .line 79
    iput-object v2, v12, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->loginCloudService:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/LoginCloudService;

    .line 80
    iput-object v3, v12, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->deviceRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;

    .line 81
    iput-object v4, v12, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->updateInfoRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UpdateInfoRepository;

    .line 82
    iput-object v5, v12, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->userPrefsUtils:Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;

    .line 83
    iput-object v6, v12, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->deviceManager:Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;

    .line 84
    iput-object v7, v12, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->dbManager:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DBManager;

    .line 85
    iput-object v8, v12, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->dialogManager:Lpowerwatch/matrix/com/pwgen2android/shared/ui/dialogManager/DialogManager;

    .line 86
    iput-object v9, v12, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->languageController:Lpowerwatch/matrix/com/pwgen2android/utils/LanguageController;

    .line 87
    iput-object v10, v12, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->goalsRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepository;

    .line 88
    iput-object v11, v12, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->activityPeriodCacheClear:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/ActivityPeriodCacheClear;

    .line 92
    iput-object v15, v12, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->googleFitController:Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;

    .line 93
    iput-object v13, v12, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->stravaController:Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;

    move-object/from16 v1, p17

    .line 94
    iput-object v1, v12, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->locationInfoProvider:Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProvider;

    move-object/from16 v2, p18

    move-object v1, v12

    .line 95
    iput-object v2, v1, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->bugfenderConfig:Lpowerwatch/matrix/com/pwgen2android/BugfenderConfig;

    move-object/from16 v2, p19

    move-object/from16 v4, p20

    .line 96
    iput-object v2, v1, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->sleepTimeUIStorage:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/SleepTimeUIStorage;

    .line 97
    iput-object v4, v1, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->deviceProtocolStorage:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceProtocolStorage;

    move-object/from16 v2, p21

    move-object/from16 v4, p22

    .line 98
    iput-object v2, v1, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->communicator:Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;

    .line 99
    iput-object v4, v1, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->connectionPreference:Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/ConnectionPreference;

    move-object/from16 v2, p23

    const/4 v4, 0x3

    .line 100
    iput-object v2, v1, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->rxPermissions:Lcom/tbruyelle/rxpermissions2/RxPermissions;

    .line 105
    new-instance v2, Landroidx/databinding/ObservableField;

    const-string v5, ""

    invoke-direct {v2, v5}, Landroidx/databinding/ObservableField;-><init>(Ljava/lang/Object;)V

    iput-object v2, v1, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->emailField:Landroidx/databinding/ObservableField;

    .line 106
    new-instance v2, Landroidx/databinding/ObservableField;

    invoke-direct {v2, v5}, Landroidx/databinding/ObservableField;-><init>(Ljava/lang/Object;)V

    iput-object v2, v1, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->languageField:Landroidx/databinding/ObservableField;

    .line 107
    new-instance v2, Landroidx/databinding/ObservableField;

    invoke-direct {v2, v5}, Landroidx/databinding/ObservableField;-><init>(Ljava/lang/Object;)V

    iput-object v2, v1, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->unitsField:Landroidx/databinding/ObservableField;

    .line 108
    new-instance v2, Landroidx/databinding/ObservableField;

    invoke-direct {v2, v5}, Landroidx/databinding/ObservableField;-><init>(Ljava/lang/Object;)V

    iput-object v2, v1, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->clockField:Landroidx/databinding/ObservableField;

    .line 110
    new-instance v2, Landroidx/databinding/ObservableField;

    invoke-direct {v2, v5}, Landroidx/databinding/ObservableField;-><init>(Ljava/lang/Object;)V

    iput-object v2, v1, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->weightField:Landroidx/databinding/ObservableField;

    .line 111
    new-instance v2, Landroidx/databinding/ObservableField;

    invoke-direct {v2, v5}, Landroidx/databinding/ObservableField;-><init>(Ljava/lang/Object;)V

    iput-object v2, v1, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->heightField:Landroidx/databinding/ObservableField;

    .line 112
    new-instance v2, Landroidx/databinding/ObservableField;

    invoke-direct {v2, v5}, Landroidx/databinding/ObservableField;-><init>(Ljava/lang/Object;)V

    iput-object v2, v1, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->ageField:Landroidx/databinding/ObservableField;

    .line 113
    new-instance v2, Landroidx/databinding/ObservableField;

    invoke-direct {v2, v5}, Landroidx/databinding/ObservableField;-><init>(Ljava/lang/Object;)V

    iput-object v2, v1, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->genderField:Landroidx/databinding/ObservableField;

    .line 114
    new-instance v2, Landroidx/databinding/ObservableField;

    invoke-direct {v2, v5}, Landroidx/databinding/ObservableField;-><init>(Ljava/lang/Object;)V

    iput-object v2, v1, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->sleepTimeField:Landroidx/databinding/ObservableField;

    .line 116
    new-instance v2, Landroidx/databinding/ObservableField;

    invoke-direct {v2, v5}, Landroidx/databinding/ObservableField;-><init>(Ljava/lang/Object;)V

    iput-object v2, v1, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->stepsField:Landroidx/databinding/ObservableField;

    .line 117
    new-instance v2, Landroidx/databinding/ObservableField;

    invoke-direct {v2, v5}, Landroidx/databinding/ObservableField;-><init>(Ljava/lang/Object;)V

    iput-object v2, v1, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->caloriesField:Landroidx/databinding/ObservableField;

    .line 118
    new-instance v2, Landroidx/databinding/ObservableField;

    invoke-direct {v2, v5}, Landroidx/databinding/ObservableField;-><init>(Ljava/lang/Object;)V

    iput-object v2, v1, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->sleepField:Landroidx/databinding/ObservableField;

    .line 119
    new-instance v2, Landroidx/databinding/ObservableField;

    invoke-direct {v2, v5}, Landroidx/databinding/ObservableField;-><init>(Ljava/lang/Object;)V

    iput-object v2, v1, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->powerField:Landroidx/databinding/ObservableField;

    .line 120
    new-instance v2, Landroidx/databinding/ObservableField;

    const/4 v6, 0x0

    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v7

    invoke-direct {v2, v7}, Landroidx/databinding/ObservableField;-><init>(Ljava/lang/Object;)V

    iput-object v2, v1, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->googleFitStatus:Landroidx/databinding/ObservableField;

    .line 121
    new-instance v8, Landroidx/databinding/ObservableField;

    invoke-direct {v8, v7}, Landroidx/databinding/ObservableField;-><init>(Ljava/lang/Object;)V

    iput-object v8, v1, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->connectionStatus:Landroidx/databinding/ObservableField;

    .line 122
    new-instance v9, Landroidx/databinding/ObservableField;

    invoke-direct {v9, v7}, Landroidx/databinding/ObservableField;-><init>(Ljava/lang/Object;)V

    iput-object v9, v1, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->stravaStatus:Landroidx/databinding/ObservableField;

    .line 124
    new-instance v10, Landroidx/databinding/ObservableField;

    invoke-direct {v10}, Landroidx/databinding/ObservableField;-><init>()V

    iput-object v10, v1, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->firmwareVersionField:Landroidx/databinding/ObservableField;

    .line 125
    new-instance v10, Landroidx/databinding/ObservableField;

    invoke-direct {v10, v7}, Landroidx/databinding/ObservableField;-><init>(Ljava/lang/Object;)V

    iput-object v10, v1, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->isUpdateAvailable:Landroidx/databinding/ObservableField;

    .line 126
    new-instance v11, Landroidx/databinding/ObservableField;

    invoke-direct {v11, v5}, Landroidx/databinding/ObservableField;-><init>(Ljava/lang/Object;)V

    iput-object v11, v1, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->appVersionField:Landroidx/databinding/ObservableField;

    .line 129
    new-instance v5, Ljava/lang/ref/WeakReference;

    move-object/from16 v12, p14

    invoke-direct {v5, v12}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v5, v1, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->managerWeakReference:Ljava/lang/ref/WeakReference;

    .line 130
    new-instance v5, Ljava/lang/ref/WeakReference;

    move-object/from16 v12, p12

    invoke-direct {v5, v12}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v5, v1, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->contextWeakReference:Ljava/lang/ref/WeakReference;

    .line 131
    new-instance v12, Ljava/lang/ref/WeakReference;

    move-object/from16 v13, p13

    invoke-direct {v12, v13}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v12, v1, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->fragmentWeakReference:Ljava/lang/ref/WeakReference;

    .line 134
    invoke-static {}, Lio/reactivex/subjects/PublishSubject;->create()Lio/reactivex/subjects/PublishSubject;

    move-result-object v12

    const-string v13, "create<Int>()"

    invoke-static {v12, v13}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v12, v1, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->clickSubject:Lio/reactivex/subjects/PublishSubject;

    const-wide/16 v13, 0xc

    .line 138
    invoke-virtual {v12, v13, v14}, Lio/reactivex/subjects/PublishSubject;->take(J)Lio/reactivex/Observable;

    move-result-object v12

    .line 139
    invoke-virtual {v12}, Lio/reactivex/Observable;->ignoreElements()Lio/reactivex/Completable;

    move-result-object v12

    .line 140
    sget-object v13, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    move-object/from16 p2, v7

    const-wide/16 v6, 0x1770

    invoke-virtual {v12, v6, v7, v13}, Lio/reactivex/Completable;->timeout(JLjava/util/concurrent/TimeUnit;)Lio/reactivex/Completable;

    move-result-object v6

    iput-object v6, v1, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->clickObservable:Lio/reactivex/Completable;

    .line 145
    invoke-virtual {v5}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/app/Activity;

    if-eqz v5, :cond_0

    .line 149
    invoke-virtual/range {p16 .. p16}, Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;->hasAuthorize()Z

    move-result v6

    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6

    invoke-virtual {v9, v6}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    .line 151
    invoke-virtual/range {p0 .. p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->isConnectionOptimized()Z

    move-result v6

    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6

    invoke-virtual {v8, v6}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    .line 152
    new-instance v6, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel$1;

    invoke-direct {v6, v1}, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel$1;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;)V

    check-cast v6, Landroidx/databinding/Observable$OnPropertyChangedCallback;

    invoke-virtual {v8, v6}, Landroidx/databinding/ObservableField;->addOnPropertyChangedCallback(Landroidx/databinding/Observable$OnPropertyChangedCallback;)V

    .line 162
    invoke-virtual {v5}, Landroid/app/Activity;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v6

    invoke-virtual {v5}, Landroid/app/Activity;->getPackageName()Ljava/lang/String;

    move-result-object v7

    const/4 v8, 0x0

    invoke-virtual {v6, v7, v8}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v6

    .line 163
    sget-object v7, Lkotlin/jvm/internal/StringCompanionObject;->INSTANCE:Lkotlin/jvm/internal/StringCompanionObject;

    const v7, 0x7f0f0038

    const/4 v12, 0x2

    new-array v12, v12, [Ljava/lang/Object;

    iget-object v13, v6, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    aput-object v13, v12, v8

    const/4 v13, 0x1

    iget v6, v6, Landroid/content/pm/PackageInfo;->versionCode:I

    invoke-static {v6}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v6

    aput-object v6, v12, v13

    invoke-virtual {v5, v7, v12}, Landroid/app/Activity;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "context.getString(R.string.app_version, packageInfo.versionName, packageInfo.versionCode.toString())"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-array v6, v8, [Ljava/lang/Object;

    invoke-static {v6, v8}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v6

    invoke-static {v5, v6}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "java.lang.String.format(format, *args)"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 165
    invoke-virtual {v11, v5}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    move-object/from16 v5, p2

    .line 166
    invoke-virtual {v10, v5}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    .line 168
    invoke-virtual/range {p0 .. p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->getCompositeDisposable()Lio/reactivex/disposables/CompositeDisposable;

    move-result-object v5

    check-cast v3, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/ObserveRepository;

    .line 169
    invoke-static {v3, v8, v8, v4, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/ObserveRepository$DefaultImpls;->load$default(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/ObserveRepository;ZZILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v0

    .line 170
    invoke-static {}, Lio/reactivex/android/schedulers/AndroidSchedulers;->mainThread()Lio/reactivex/Scheduler;

    move-result-object v3

    invoke-virtual {v0, v3}, Lio/reactivex/Observable;->observeOn(Lio/reactivex/Scheduler;)Lio/reactivex/Observable;

    move-result-object v0

    .line 171
    new-instance v3, Lpowerwatch/matrix/com/pwgen2android/main/watch/-$$Lambda$PWWatchViewModel$bmYTqLxSQMdFql90ht7vllH_Q-Q;

    invoke-direct {v3, v1}, Lpowerwatch/matrix/com/pwgen2android/main/watch/-$$Lambda$PWWatchViewModel$bmYTqLxSQMdFql90ht7vllH_Q-Q;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;)V

    invoke-virtual {v0, v3}, Lio/reactivex/Observable;->doOnNext(Lio/reactivex/functions/Consumer;)Lio/reactivex/Observable;

    move-result-object v0

    .line 176
    new-instance v3, Lpowerwatch/matrix/com/pwgen2android/main/watch/-$$Lambda$PWWatchViewModel$62QPzlPexLtORULzwGcxZ4BAQ3Q;

    invoke-direct {v3, v1}, Lpowerwatch/matrix/com/pwgen2android/main/watch/-$$Lambda$PWWatchViewModel$62QPzlPexLtORULzwGcxZ4BAQ3Q;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;)V

    invoke-virtual {v0, v3}, Lio/reactivex/Observable;->flatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object v0

    .line 179
    new-instance v3, Lpowerwatch/matrix/com/pwgen2android/main/watch/-$$Lambda$PWWatchViewModel$tWK0FVLn7rl-fMXFKvIkhaANw7w;

    invoke-direct {v3, v1}, Lpowerwatch/matrix/com/pwgen2android/main/watch/-$$Lambda$PWWatchViewModel$tWK0FVLn7rl-fMXFKvIkhaANw7w;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;)V

    sget-object v4, Lpowerwatch/matrix/com/pwgen2android/main/watch/-$$Lambda$PWWatchViewModel$ZFc_YulnOxdOlIZo97OqPJmsJNE;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/watch/-$$Lambda$PWWatchViewModel$ZFc_YulnOxdOlIZo97OqPJmsJNE;

    invoke-virtual {v0, v3, v4}, Lio/reactivex/Observable;->subscribe(Lio/reactivex/functions/Consumer;Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    move-result-object v0

    .line 168
    invoke-virtual {v5, v0}, Lio/reactivex/disposables/CompositeDisposable;->add(Lio/reactivex/disposables/Disposable;)Z

    .line 191
    invoke-virtual/range {p0 .. p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->getCompositeDisposable()Lio/reactivex/disposables/CompositeDisposable;

    move-result-object v0

    .line 192
    invoke-virtual/range {p15 .. p15}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;->getSubscription()Lio/reactivex/Observable;

    move-result-object v3

    .line 194
    new-instance v4, Lpowerwatch/matrix/com/pwgen2android/main/watch/-$$Lambda$PWWatchViewModel$Jqf1obOIfGMKfXXqv79ZAuuEyZo;

    invoke-direct {v4, v1}, Lpowerwatch/matrix/com/pwgen2android/main/watch/-$$Lambda$PWWatchViewModel$Jqf1obOIfGMKfXXqv79ZAuuEyZo;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;)V

    sget-object v5, Lpowerwatch/matrix/com/pwgen2android/main/watch/-$$Lambda$PWWatchViewModel$DDKVnTH5hCzgH-kKMIt1Y5paF_U;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/watch/-$$Lambda$PWWatchViewModel$DDKVnTH5hCzgH-kKMIt1Y5paF_U;

    .line 193
    invoke-virtual {v3, v4, v5}, Lio/reactivex/Observable;->subscribe(Lio/reactivex/functions/Consumer;Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    move-result-object v3

    .line 191
    invoke-virtual {v0, v3}, Lio/reactivex/disposables/CompositeDisposable;->add(Lio/reactivex/disposables/Disposable;)Z

    .line 199
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel$8;

    invoke-direct {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel$8;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;)V

    check-cast v0, Landroidx/databinding/Observable$OnPropertyChangedCallback;

    invoke-virtual {v2, v0}, Landroidx/databinding/ObservableField;->addOnPropertyChangedCallback(Landroidx/databinding/Observable$OnPropertyChangedCallback;)V

    .line 210
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel$9;

    invoke-direct {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel$9;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;)V

    check-cast v0, Landroidx/databinding/Observable$OnPropertyChangedCallback;

    invoke-virtual {v9, v0}, Landroidx/databinding/ObservableField;->addOnPropertyChangedCallback(Landroidx/databinding/Observable$OnPropertyChangedCallback;)V

    :cond_0
    return-void
.end method

.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/LoginCloudService;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UpdateInfoRepository;Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DBManager;Lpowerwatch/matrix/com/pwgen2android/shared/ui/dialogManager/DialogManager;Lpowerwatch/matrix/com/pwgen2android/utils/LanguageController;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/ActivityPeriodCacheClear;Landroid/app/Activity;Landroidx/fragment/app/Fragment;Landroidx/fragment/app/FragmentManager;Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProvider;Lpowerwatch/matrix/com/pwgen2android/BugfenderConfig;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/SleepTimeUIStorage;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceProtocolStorage;Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/ConnectionPreference;Lcom/tbruyelle/rxpermissions2/RxPermissions;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 25

    const/high16 v0, 0x400000

    and-int v0, p24, v0

    if-eqz v0, :cond_0

    .line 100
    new-instance v0, Lcom/tbruyelle/rxpermissions2/RxPermissions;

    move-object/from16 v14, p13

    invoke-direct {v0, v14}, Lcom/tbruyelle/rxpermissions2/RxPermissions;-><init>(Landroidx/fragment/app/Fragment;)V

    move-object/from16 v24, v0

    goto :goto_0

    :cond_0
    move-object/from16 v14, p13

    move-object/from16 v24, p23

    :goto_0
    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move-object/from16 v14, p13

    move-object/from16 v15, p14

    move-object/from16 v16, p15

    move-object/from16 v17, p16

    move-object/from16 v18, p17

    move-object/from16 v19, p18

    move-object/from16 v20, p19

    move-object/from16 v21, p20

    move-object/from16 v22, p21

    move-object/from16 v23, p22

    .line 78
    invoke-direct/range {v1 .. v24}, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/LoginCloudService;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UpdateInfoRepository;Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DBManager;Lpowerwatch/matrix/com/pwgen2android/shared/ui/dialogManager/DialogManager;Lpowerwatch/matrix/com/pwgen2android/utils/LanguageController;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/ActivityPeriodCacheClear;Landroid/app/Activity;Landroidx/fragment/app/Fragment;Landroidx/fragment/app/FragmentManager;Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProvider;Lpowerwatch/matrix/com/pwgen2android/BugfenderConfig;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/SleepTimeUIStorage;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceProtocolStorage;Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/ConnectionPreference;Lcom/tbruyelle/rxpermissions2/RxPermissions;)V

    return-void
.end method

.method private static final _init_$lambda-0(Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;)V
    .locals 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 172
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->pairedDevice:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;

    .line 173
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->getFirmwareVersionField()Landroidx/databinding/ObservableField;

    move-result-object p1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->pairedDevice:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move-object v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;->getFirmwareVersion()Ljava/lang/String;

    move-result-object v0

    :goto_0
    invoke-virtual {p1, v0}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    .line 174
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->pairedDevice:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;

    if-nez p1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;->getBluetoothAddress()Ljava/lang/String;

    move-result-object v1

    :goto_1
    invoke-direct {p0, v1}, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->displaySleepTime(Ljava/lang/String;)V

    return-void
.end method

.method private static final _init_$lambda-1(Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;)Lio/reactivex/ObservableSource;
    .locals 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 177
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->updateInfoRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UpdateInfoRepository;

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UpdateInfoParams;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;->getPid()I

    move-result p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    const-string v1, "en"

    invoke-direct {v0, p1, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UpdateInfoParams;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p1, 0x0

    invoke-interface {p0, v0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UpdateInfoRepository;->getOne(Ljava/lang/Object;Z)Lio/reactivex/Observable;

    move-result-object p0

    check-cast p0, Lio/reactivex/ObservableSource;

    return-object p0
.end method

.method private static final _init_$lambda-2(Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UpdateInfo;)V
    .locals 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 180
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->TAG:Ljava/lang/String;

    const-string v1, "Update info has received.. "

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 181
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->updateInfo:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UpdateInfo;

    .line 182
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->pairedDevice:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;->getFirmwareVersion()Ljava/lang/String;

    move-result-object v0

    :goto_0
    invoke-virtual {p1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UpdateInfo;->isUpdateAvailable(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 183
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->isUpdateAvailable()Landroidx/databinding/ObservableField;

    move-result-object p0

    const/4 p1, 0x1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    goto :goto_1

    .line 185
    :cond_1
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->isUpdateAvailable()Landroidx/databinding/ObservableField;

    move-result-object p0

    const/4 p1, 0x0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    :goto_1
    return-void
.end method

.method private static final _init_$lambda-3(Ljava/lang/Throwable;)V
    .locals 0

    .line 188
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    return-void
.end method

.method private static final _init_$lambda-4(Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;Ljava/lang/Boolean;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 195
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->getGoogleFitStatus()Landroidx/databinding/ObservableField;

    move-result-object p0

    invoke-virtual {p0, p1}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    return-void
.end method

.method private static final _init_$lambda-5(Ljava/lang/Throwable;)V
    .locals 0

    .line 196
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    return-void
.end method

.method public static final synthetic access$getContextWeakReference$p(Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;)Ljava/lang/ref/WeakReference;
    .locals 0

    .line 78
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->contextWeakReference:Ljava/lang/ref/WeakReference;

    return-object p0
.end method

.method public static final synthetic access$getFragmentWeakReference$p(Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;)Ljava/lang/ref/WeakReference;
    .locals 0

    .line 78
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->fragmentWeakReference:Ljava/lang/ref/WeakReference;

    return-object p0
.end method

.method public static final synthetic access$getGoogleFitController$p(Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;)Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;
    .locals 0

    .line 78
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->googleFitController:Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;

    return-object p0
.end method

.method public static final synthetic access$getStravaController$p(Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;)Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;
    .locals 0

    .line 78
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->stravaController:Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;

    return-object p0
.end method

.method private final createAppInfoData()Ljava/lang/String;
    .locals 8

    .line 567
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Landroid/os/Build;->MODEL:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x20

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    sget-object v2, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 569
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/Locale;->getDisplayLanguage()Ljava/lang/String;

    move-result-object v2

    .line 571
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->loadFWVersion()Ljava/lang/String;

    move-result-object v3

    .line 572
    iget-object v4, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->user:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;

    if-eqz v4, :cond_2

    invoke-virtual {v4}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;->getEmail()Ljava/lang/String;

    move-result-object v4

    const-string v5, "User email: "

    invoke-static {v5, v4}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    .line 574
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v6

    invoke-virtual {v6}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v6, 0x5f

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v6

    invoke-virtual {v6}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 575
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "Device: "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", Platform: "

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "Android"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", Device language: "

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", Country: "

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", App version: "

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "1.5.6(197)"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 576
    move-object v0, v3

    check-cast v0, Ljava/lang/CharSequence;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_1
    const-string v0, ""

    .line 575
    :goto_1
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_2
    const-string v0, "user"

    .line 572
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method private final displaySleepTime(Ljava/lang/String;)V
    .locals 2

    .line 288
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->deviceProtocolStorage:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceProtocolStorage;

    invoke-virtual {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceProtocolStorage;->getDeviceProtocolVersion(Ljava/lang/String;)I

    move-result p1

    const/4 v0, 0x3

    if-ge p1, v0, :cond_1

    .line 291
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->sleepTimeField:Landroidx/databinding/ObservableField;

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->contextWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/Activity;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    const v1, 0x7f0f0197

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    :goto_0
    invoke-virtual {p1, v0}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    goto :goto_1

    .line 293
    :cond_1
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->sleepTimeUIStorage:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/SleepTimeUIStorage;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/SleepTimeUIStorage;->getDisplayValue()Ljava/lang/String;

    move-result-object p1

    .line 294
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->sleepTimeField:Landroidx/databinding/ObservableField;

    invoke-virtual {v0, p1}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    :goto_1
    return-void
.end method

.method static synthetic displaySleepTime$default(Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;Ljava/lang/String;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    .line 287
    :cond_0
    invoke-direct {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->displaySleepTime(Ljava/lang/String;)V

    return-void
.end method

.method private static final enableConnectionOptimizationDialog$lambda-32(Lkotlin/jvm/functions/Function1;Ljava/lang/Boolean;)V
    .locals 1

    const-string v0, "$callback"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    .line 630
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static synthetic lambda$--UZa82Ld_WCdGNDbv9A6kgup5U(Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->onLocationRequested$lambda-20(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic lambda$0Y3Rnw1qStN4mMro6H1oR3IocYw(Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->onLogoutClicked$lambda-15(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic lambda$53kHF_Y5ugd6BNPS-4_scSwCVhw(Lkotlin/Pair;)Ljava/lang/Boolean;
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->onLocationRequested$lambda-18$lambda-17(Lkotlin/Pair;)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$62QPzlPexLtORULzwGcxZ4BAQ3Q(Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->_init_$lambda-1(Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$DDKVnTH5hCzgH-kKMIt1Y5paF_U(Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->_init_$lambda-5(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic lambda$Hf86PAoBSiW8J_iU6WFDMu_UoYM(Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;Ljava/lang/Boolean;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->onLocationRequested$lambda-18(Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;Ljava/lang/Boolean;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$Jqf1obOIfGMKfXXqv79ZAuuEyZo(Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;Ljava/lang/Boolean;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->_init_$lambda-4(Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;Ljava/lang/Boolean;)V

    return-void
.end method

.method public static synthetic lambda$KvoeO4ySbNQRWD1hfd0nDTWLhYQ(Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->onAppVersionFieldClick$lambda-31(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic lambda$OueR02RGmpMll6zOMjToBjVGjik(Landroid/view/View;Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->onAppVersionFieldClick$lambda-30(Landroid/view/View;Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;)V

    return-void
.end method

.method public static synthetic lambda$PLy5l8FDkPlWIxMZmJt1nFfiduM(Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;)V
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->onAppVersionFieldClick$lambda-30$lambda-29(Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;)V

    return-void
.end method

.method public static synthetic lambda$TXu5D_4_uJuO5WF6igkgIxAeoXg(Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->onLogoutClicked$lambda-13$lambda-11(Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic lambda$W3iysnAuvTmCskuzDVsEBc5tkh0(Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;Lkotlin/Pair;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->onLocationRequested$lambda-18$lambda-16(Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;Lkotlin/Pair;)V

    return-void
.end method

.method public static synthetic lambda$XbR2SFA1SnwomFZOdHmsl8z3O4Y(Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->onCreateView$lambda-6(Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;)V

    return-void
.end method

.method public static synthetic lambda$Yz9er8oSqQvynqxybkufATavWcE(Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->onCreateView$lambda-8(Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;)V

    return-void
.end method

.method public static synthetic lambda$YzLcvqy1roivdrVFbD54QDPInIw(Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->onCreateView$lambda-7(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic lambda$ZFc_YulnOxdOlIZo97OqPJmsJNE(Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->_init_$lambda-3(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic lambda$bmYTqLxSQMdFql90ht7vllH_Q-Q(Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->_init_$lambda-0(Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;)V

    return-void
.end method

.method public static synthetic lambda$dzKBkFX5lv41c1vpA_x6nl5dtfo(Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;Ljava/lang/Boolean;)Lio/reactivex/CompletableSource;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->onLogoutClicked$lambda-13(Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;Ljava/lang/Boolean;)Lio/reactivex/CompletableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$e9cpvLrIxhEbx2hlaIm2QmtO1ys(Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;)Lio/reactivex/CompletableSource;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->onLogoutClicked$lambda-13$lambda-10(Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;)Lio/reactivex/CompletableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$fCNw_JASlY25ot1NKsyIXvvZYqY()V
    .locals 0

    invoke-static {}, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->onLogoutClicked$lambda-14()V

    return-void
.end method

.method public static synthetic lambda$fDoawfkw43Jr3BjdeJflWc09VPQ(Lkotlin/jvm/functions/Function1;Ljava/lang/Boolean;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->enableConnectionOptimizationDialog$lambda-32(Lkotlin/jvm/functions/Function1;Ljava/lang/Boolean;)V

    return-void
.end method

.method public static synthetic lambda$fuE_QShYnKrR-XHwA7CSDOzgwh8(Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->onLogoutClicked$lambda-13$lambda-12(Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic lambda$hTh6jfxqLUNP-izY2lsjdb_N-TM(Ljava/lang/Boolean;)V
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->onLocationRequested$lambda-19(Ljava/lang/Boolean;)V

    return-void
.end method

.method public static synthetic lambda$nI6Kpi3x6hYpF_mDrJDj9monvCQ(Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->onCreateView$lambda-9(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic lambda$tWK0FVLn7rl-fMXFKvIkhaANw7w(Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UpdateInfo;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->_init_$lambda-2(Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UpdateInfo;)V

    return-void
.end method

.method private final loadFWVersion()Ljava/lang/String;
    .locals 2

    .line 581
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->pairedDevice:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move-object v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;->getFirmwareVersion()Ljava/lang/String;

    move-result-object v0

    :goto_0
    if-eqz v0, :cond_2

    .line 582
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->pairedDevice:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;->getFirmwareVersion()Ljava/lang/String;

    move-result-object v1

    :goto_1
    const-string v0, "FW Version "

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_2

    :cond_2
    const-string v0, ""

    :goto_2
    return-object v0
.end method

.method private static final onAppVersionFieldClick$lambda-30(Landroid/view/View;Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;)V
    .locals 3

    const-string v0, "$this_onAppVersionFieldClick"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "this$0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 590
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p0

    const-string v0, "Secret screen will open now."

    check-cast v0, Ljava/lang/CharSequence;

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p0

    .line 591
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 592
    new-instance p0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {p0, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/main/watch/-$$Lambda$PWWatchViewModel$PLy5l8FDkPlWIxMZmJt1nFfiduM;

    invoke-direct {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/watch/-$$Lambda$PWWatchViewModel$PLy5l8FDkPlWIxMZmJt1nFfiduM;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;)V

    const-wide/16 v1, 0x7d0

    invoke-virtual {p0, v0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method private static final onAppVersionFieldClick$lambda-30$lambda-29(Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 593
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->openSecretScreen()V

    return-void
.end method

.method private static final onAppVersionFieldClick$lambda-31(Ljava/lang/Throwable;)V
    .locals 0

    return-void
.end method

.method private static final onCreateView$lambda-6(Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;)V
    .locals 5

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 234
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->bugfenderConfig:Lpowerwatch/matrix/com/pwgen2android/BugfenderConfig;

    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;->getEmail()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/BugfenderConfig;->setUserEmail(Ljava/lang/String;)V

    const-string v0, "it"

    .line 235
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->user:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;

    .line 236
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->getEmailField()Landroidx/databinding/ObservableField;

    move-result-object v0

    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;->getEmail()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    .line 238
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->userPrefsUtils:Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;

    invoke-virtual {v0, p2}, Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;->isMetricsUsed(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;)Z

    move-result v0

    if-eqz v0, :cond_0

    const v0, 0x7f0f0111

    goto :goto_0

    :cond_0
    const v0, 0x7f0f00f9

    .line 240
    :goto_0
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->userPrefsUtils:Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;

    invoke-virtual {v1, p2}, Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;->isTwelveHourFormatUsed(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;)Z

    move-result v1

    if-eqz v1, :cond_1

    const v1, 0x7f0f01cd

    goto :goto_1

    :cond_1
    const v1, 0x7f0f01ce

    .line 243
    :goto_1
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->getUnitsField()Landroidx/databinding/ObservableField;

    move-result-object v2

    iget-object v3, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->contextWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v3}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/app/Activity;

    const/4 v4, 0x0

    if-nez v3, :cond_2

    move-object v0, v4

    goto :goto_2

    :cond_2
    invoke-virtual {v3, v0}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    :goto_2
    invoke-virtual {v2, v0}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    .line 244
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->getClockField()Landroidx/databinding/ObservableField;

    move-result-object v0

    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->contextWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v2}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/app/Activity;

    if-nez v2, :cond_3

    move-object v1, v4

    goto :goto_3

    :cond_3
    invoke-virtual {v2, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    :goto_3
    invoke-virtual {v0, v1}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    .line 246
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->userPrefsUtils:Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;

    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;->getHeight()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType$HEIGHT;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType$HEIGHT;

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType;

    invoke-virtual {v0, v1, v2}, Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;->getValue(Ljava/lang/Number;Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType;)Lkotlin/Pair;

    move-result-object v0

    .line 247
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->getHeightField()Landroidx/databinding/ObservableField;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    move-result v3

    invoke-static {v3}, Lkotlin/math/MathKt;->roundToInt(F)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    .line 249
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->userPrefsUtils:Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;

    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;->getWeight()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType$WEIGHT;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType$WEIGHT;

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType;

    invoke-virtual {v0, v1, v2}, Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;->getValue(Ljava/lang/Number;Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType;)Lkotlin/Pair;

    move-result-object v0

    .line 250
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->getWeightField()Landroidx/databinding/ObservableField;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    move-result v3

    invoke-static {v3}, Lkotlin/math/MathKt;->roundToInt(F)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    .line 252
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->getAgeField()Landroidx/databinding/ObservableField;

    move-result-object v0

    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;->getAge()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    .line 254
    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;->getGender()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Gender$Male;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Gender$Male;

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Gender$Male;->getDescription()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Gender$Male;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Gender$Male;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Gender$Male;->getDisplayResource()I

    move-result v0

    goto :goto_4

    :cond_4
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Gender$Female;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Gender$Female;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Gender$Female;->getDisplayResource()I

    move-result v0

    .line 255
    :goto_4
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->contextWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/app/Activity;

    if-nez v1, :cond_5

    goto :goto_5

    :cond_5
    invoke-virtual {v1, v0}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v4

    :goto_5
    if-nez v4, :cond_6

    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;->getGender()Ljava/lang/String;

    move-result-object v4

    :cond_6
    const-string v0, "contextWeakReference.get()?.getString(res) ?: it.gender"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 256
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->getGenderField()Landroidx/databinding/ObservableField;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    .line 258
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->languageController:Lpowerwatch/matrix/com/pwgen2android/utils/LanguageController;

    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;->getAccountSettings()Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserAccountSettings;

    move-result-object p2

    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserAccountSettings;->getLanguage()Ljava/lang/String;

    move-result-object p2

    invoke-interface {v0, p2}, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageController;->getLanguage(Ljava/lang/String;)Lpowerwatch/matrix/com/pwgen2android/utils/LanguageInfo;

    move-result-object p2

    .line 259
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->contextWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/Activity;

    if-eqz v0, :cond_7

    if-eqz p2, :cond_7

    .line 261
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->getLanguageField()Landroidx/databinding/ObservableField;

    move-result-object p0

    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageInfo;->getLanguageDisplay()I

    move-result p2

    invoke-virtual {p1, p2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    :cond_7
    return-void
.end method

.method private static final onCreateView$lambda-7(Ljava/lang/Throwable;)V
    .locals 0

    .line 264
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    return-void
.end method

.method private static final onCreateView$lambda-8(Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;)V
    .locals 4

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 270
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->goalConfig:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;

    .line 271
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->getStepsField()Landroidx/databinding/ObservableField;

    move-result-object v0

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;->getSteps()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    .line 272
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->getCaloriesField()Landroidx/databinding/ObservableField;

    move-result-object v0

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;->getCalories()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    .line 273
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->getSleepField()Landroidx/databinding/ObservableField;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;->getSleep()I

    move-result v2

    int-to-float v2, v2

    const/16 v3, 0x3c

    int-to-float v3, v3

    div-float/2addr v2, v3

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const/16 v2, 0x68

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    .line 274
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->getPowerField()Landroidx/databinding/ObservableField;

    move-result-object p0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;->getPower()I

    move-result p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " \u00b5Wh"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    return-void
.end method

.method private static final onCreateView$lambda-9(Ljava/lang/Throwable;)V
    .locals 0

    return-void
.end method

.method private static final onLocationRequested$lambda-18(Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;Ljava/lang/Boolean;)Lio/reactivex/ObservableSource;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "approved"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 358
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 359
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->locationInfoProvider:Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProvider;

    .line 360
    invoke-interface {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProvider;->getLastKnownLocation()Lio/reactivex/Single;

    move-result-object p1

    .line 361
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/main/watch/-$$Lambda$PWWatchViewModel$W3iysnAuvTmCskuzDVsEBc5tkh0;

    invoke-direct {v0, p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/-$$Lambda$PWWatchViewModel$W3iysnAuvTmCskuzDVsEBc5tkh0;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;)V

    invoke-virtual {p1, v0}, Lio/reactivex/Single;->doOnSuccess(Lio/reactivex/functions/Consumer;)Lio/reactivex/Single;

    move-result-object p0

    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/main/watch/-$$Lambda$PWWatchViewModel$53kHF_Y5ugd6BNPS-4_scSwCVhw;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/watch/-$$Lambda$PWWatchViewModel$53kHF_Y5ugd6BNPS-4_scSwCVhw;

    .line 369
    invoke-virtual {p0, p1}, Lio/reactivex/Single;->map(Lio/reactivex/functions/Function;)Lio/reactivex/Single;

    move-result-object p0

    .line 370
    invoke-virtual {p0}, Lio/reactivex/Single;->toObservable()Lio/reactivex/Observable;

    move-result-object p0

    goto :goto_0

    .line 372
    :cond_0
    invoke-static {p1}, Lio/reactivex/Observable;->just(Ljava/lang/Object;)Lio/reactivex/Observable;

    move-result-object p0

    :goto_0
    check-cast p0, Lio/reactivex/ObservableSource;

    return-object p0
.end method

.method private static final onLocationRequested$lambda-18$lambda-16(Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;Lkotlin/Pair;)V
    .locals 5

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 362
    invoke-virtual {p1}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 363
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Location found: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/location/Location;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move-object v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Landroid/location/Location;->getLatitude()D

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " , "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/location/Location;

    if-nez p1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Landroid/location/Location;->getLongitude()D

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    :goto_1
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v0, p1}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    const-string p1, "Location found"

    .line 364
    invoke-direct {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->printMessage(Ljava/lang/String;)V

    goto :goto_2

    .line 366
    :cond_2
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->locationInfoProvider:Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProvider;

    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->contextWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {p0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/app/Activity;

    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    check-cast p0, Landroid/content/Context;

    invoke-interface {p1, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProvider;->showDialogForLocation(Landroid/content/Context;)V

    :goto_2
    return-void
.end method

.method private static final onLocationRequested$lambda-18$lambda-17(Lkotlin/Pair;)Ljava/lang/Boolean;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 369
    invoke-virtual {p0}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    return-object p0
.end method

.method private static final onLocationRequested$lambda-19(Ljava/lang/Boolean;)V
    .locals 0

    return-void
.end method

.method private static final onLocationRequested$lambda-20(Ljava/lang/Throwable;)V
    .locals 0

    .line 379
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    return-void
.end method

.method private static final onLogoutClicked$lambda-13(Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;Ljava/lang/Boolean;)Lio/reactivex/CompletableSource;
    .locals 5

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 323
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 324
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->loginCloudService:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/LoginCloudService;

    .line 325
    invoke-interface {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/LoginCloudService;->logout()Lio/reactivex/Completable;

    move-result-object p1

    .line 326
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->userAccountRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GetFirstRepository;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x2

    const/4 v4, 0x0

    invoke-static {v0, v1, v2, v3, v4}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GetFirstRepository$DefaultImpls;->getFirst$default(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GetFirstRepository;ZZILjava/lang/Object;)Lio/reactivex/Single;

    move-result-object v0

    .line 327
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/main/watch/-$$Lambda$PWWatchViewModel$e9cpvLrIxhEbx2hlaIm2QmtO1ys;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/-$$Lambda$PWWatchViewModel$e9cpvLrIxhEbx2hlaIm2QmtO1ys;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;)V

    invoke-virtual {v0, v1}, Lio/reactivex/Single;->flatMapCompletable(Lio/reactivex/functions/Function;)Lio/reactivex/Completable;

    move-result-object v0

    .line 331
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->dbManager:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DBManager;

    invoke-interface {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DBManager;->clearBackgroundAndActivityLogsCompletable()Lio/reactivex/Completable;

    move-result-object v1

    check-cast v1, Lio/reactivex/CompletableSource;

    invoke-virtual {v0, v1}, Lio/reactivex/Completable;->andThen(Lio/reactivex/CompletableSource;)Lio/reactivex/Completable;

    move-result-object v0

    .line 333
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->dbManager:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DBManager;

    invoke-interface {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DBManager;->clearDevicesCompletable()Lio/reactivex/Completable;

    move-result-object v1

    check-cast v1, Lio/reactivex/CompletableSource;

    invoke-virtual {v0, v1}, Lio/reactivex/Completable;->andThen(Lio/reactivex/CompletableSource;)Lio/reactivex/Completable;

    move-result-object v0

    .line 334
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->activityPeriodCacheClear:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/ActivityPeriodCacheClear;

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/ActivityPeriodCacheClear;->clear()Lio/reactivex/Completable;

    move-result-object v1

    check-cast v1, Lio/reactivex/CompletableSource;

    invoke-virtual {v0, v1}, Lio/reactivex/Completable;->andThen(Lio/reactivex/CompletableSource;)Lio/reactivex/Completable;

    move-result-object v0

    .line 335
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->goalsRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepository;

    invoke-interface {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepository;->deleteAll()Lio/reactivex/Completable;

    move-result-object v1

    check-cast v1, Lio/reactivex/CompletableSource;

    invoke-virtual {v0, v1}, Lio/reactivex/Completable;->andThen(Lio/reactivex/CompletableSource;)Lio/reactivex/Completable;

    move-result-object v0

    .line 336
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/main/watch/-$$Lambda$PWWatchViewModel$TXu5D_4_uJuO5WF6igkgIxAeoXg;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/-$$Lambda$PWWatchViewModel$TXu5D_4_uJuO5WF6igkgIxAeoXg;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;)V

    invoke-virtual {v0, v1}, Lio/reactivex/Completable;->doOnEvent(Lio/reactivex/functions/Consumer;)Lio/reactivex/Completable;

    move-result-object v0

    .line 339
    invoke-virtual {v0}, Lio/reactivex/Completable;->onErrorComplete()Lio/reactivex/Completable;

    move-result-object v0

    check-cast v0, Lio/reactivex/CompletableSource;

    .line 326
    invoke-virtual {p1, v0}, Lio/reactivex/Completable;->andThen(Lio/reactivex/CompletableSource;)Lio/reactivex/Completable;

    move-result-object p1

    .line 340
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/main/watch/-$$Lambda$PWWatchViewModel$fuE_QShYnKrR-XHwA7CSDOzgwh8;

    invoke-direct {v0, p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/-$$Lambda$PWWatchViewModel$fuE_QShYnKrR-XHwA7CSDOzgwh8;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;)V

    invoke-virtual {p1, v0}, Lio/reactivex/Completable;->doOnEvent(Lio/reactivex/functions/Consumer;)Lio/reactivex/Completable;

    move-result-object p0

    check-cast p0, Lio/reactivex/CompletableSource;

    return-object p0

    .line 346
    :cond_0
    invoke-static {}, Lio/reactivex/Completable;->complete()Lio/reactivex/Completable;

    move-result-object p0

    check-cast p0, Lio/reactivex/CompletableSource;

    return-object p0
.end method

.method private static final onLogoutClicked$lambda-13$lambda-10(Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;)Lio/reactivex/CompletableSource;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 327
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->userAccountRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;

    invoke-interface {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;->delete(Ljava/lang/Object;)Lio/reactivex/Completable;

    move-result-object p0

    check-cast p0, Lio/reactivex/CompletableSource;

    return-object p0
.end method

.method private static final onLogoutClicked$lambda-13$lambda-11(Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;Ljava/lang/Throwable;)V
    .locals 0

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 337
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->deviceManager:Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;

    invoke-interface {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;->destroy()V

    return-void
.end method

.method private static final onLogoutClicked$lambda-13$lambda-12(Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;Ljava/lang/Throwable;)V
    .locals 0

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 341
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->contextWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {p0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/app/Activity;

    if-nez p0, :cond_0

    goto :goto_0

    .line 342
    :cond_0
    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationFragment$WelcomeScreen;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationFragment$WelcomeScreen;

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationFragment;

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationExtensionsKt;->goToSetupActivity(Landroid/app/Activity;Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationFragment;)V

    :goto_0
    if-nez p0, :cond_1

    goto :goto_1

    .line 343
    :cond_1
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    :goto_1
    return-void
.end method

.method private static final onLogoutClicked$lambda-14()V
    .locals 0

    return-void
.end method

.method private static final onLogoutClicked$lambda-15(Ljava/lang/Throwable;)V
    .locals 0

    return-void
.end method

.method private final openSecretScreen()V
    .locals 9

    .line 602
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/secret/SecretScreenFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/secret/SecretScreenFragment$Companion;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/secret/SecretScreenFragment$Companion;->newInstance()Lpowerwatch/matrix/com/pwgen2android/secret/SecretScreenFragment;

    move-result-object v0

    .line 603
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->managerWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Landroidx/fragment/app/FragmentManager;

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    move-object v3, v0

    check-cast v3, Landroidx/fragment/app/Fragment;

    const v4, 0x7f080280

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/16 v7, 0x8

    const/4 v8, 0x0

    invoke-static/range {v2 .. v8}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationExtensionsKt;->addFragment$default(Landroidx/fragment/app/FragmentManager;Landroidx/fragment/app/Fragment;IZLpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType;ILjava/lang/Object;)V

    :goto_0
    return-void
.end method

.method private final printMessage(Ljava/lang/String;)V
    .locals 2

    .line 385
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->contextWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/Activity;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    check-cast v0, Landroid/content/Context;

    check-cast p1, Ljava/lang/CharSequence;

    const/4 v1, 0x0

    invoke-static {v0, p1, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    return-void
.end method


# virtual methods
.method public final authorizationCanceled()V
    .locals 2

    .line 612
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->googleFitStatus:Landroidx/databinding/ObservableField;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    return-void
.end method

.method public final authorizationSuccess()V
    .locals 1

    .line 608
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->googleFitController:Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;->authorizationSuccess()V

    return-void
.end method

.method public final enableConnectionOptimization(Z)V
    .locals 4

    .line 616
    move-object v0, p0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const-string v2, "Connection setting updated to: "

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-static {v0, v1, v2, v3, v2}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->debug$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    .line 617
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->connectionPreference:Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/ConnectionPreference;

    xor-int/lit8 p1, p1, 0x1

    invoke-virtual {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/ConnectionPreference;->enableAutoConnect(Z)V

    return-void
.end method

.method public final enableConnectionOptimizationDialog(ZLkotlin/jvm/functions/Function1;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Boolean;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "callback"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 623
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->contextWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/Activity;

    if-nez v0, :cond_0

    return-void

    .line 625
    :cond_0
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->getCompositeDisposable()Lio/reactivex/disposables/CompositeDisposable;

    move-result-object v1

    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->dialogManager:Lpowerwatch/matrix/com/pwgen2android/shared/ui/dialogManager/DialogManager;

    move-object v3, v0

    check-cast v3, Landroid/content/Context;

    const v4, 0x7f0f008e

    if-eqz p1, :cond_1

    const p1, 0x7f0f008d

    const v5, 0x7f0f008d

    goto :goto_0

    :cond_1
    const p1, 0x7f0f008c

    const v5, 0x7f0f008c

    :goto_0
    const v6, 0x7f0f005f

    const/4 v7, 0x0

    const/16 v8, 0x10

    const/4 v9, 0x0

    invoke-static/range {v2 .. v9}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/dialogManager/DialogManager$DefaultImpls;->openAlertDialog$default(Lpowerwatch/matrix/com/pwgen2android/shared/ui/dialogManager/DialogManager;Landroid/content/Context;IIIIILjava/lang/Object;)Lio/reactivex/Single;

    move-result-object p1

    .line 629
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/main/watch/-$$Lambda$PWWatchViewModel$fDoawfkw43Jr3BjdeJflWc09VPQ;

    invoke-direct {v0, p2}, Lpowerwatch/matrix/com/pwgen2android/main/watch/-$$Lambda$PWWatchViewModel$fDoawfkw43Jr3BjdeJflWc09VPQ;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v0}, Lio/reactivex/Single;->subscribe(Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    move-result-object p1

    .line 625
    invoke-virtual {v1, p1}, Lio/reactivex/disposables/CompositeDisposable;->add(Lio/reactivex/disposables/Disposable;)Z

    return-void
.end method

.method public final getAgeField()Landroidx/databinding/ObservableField;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 112
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->ageField:Landroidx/databinding/ObservableField;

    return-object v0
.end method

.method public final getAppVersionField()Landroidx/databinding/ObservableField;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 126
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->appVersionField:Landroidx/databinding/ObservableField;

    return-object v0
.end method

.method public final getCaloriesField()Landroidx/databinding/ObservableField;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 117
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->caloriesField:Landroidx/databinding/ObservableField;

    return-object v0
.end method

.method public final getClockField()Landroidx/databinding/ObservableField;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 108
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->clockField:Landroidx/databinding/ObservableField;

    return-object v0
.end method

.method public final getConnectionStatus()Landroidx/databinding/ObservableField;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .line 121
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->connectionStatus:Landroidx/databinding/ObservableField;

    return-object v0
.end method

.method public final getEmailField()Landroidx/databinding/ObservableField;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 105
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->emailField:Landroidx/databinding/ObservableField;

    return-object v0
.end method

.method public final getFirmwareVersionField()Landroidx/databinding/ObservableField;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 124
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->firmwareVersionField:Landroidx/databinding/ObservableField;

    return-object v0
.end method

.method public final getGenderField()Landroidx/databinding/ObservableField;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 113
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->genderField:Landroidx/databinding/ObservableField;

    return-object v0
.end method

.method public final getGoogleFitStatus()Landroidx/databinding/ObservableField;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .line 120
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->googleFitStatus:Landroidx/databinding/ObservableField;

    return-object v0
.end method

.method public final getHeightField()Landroidx/databinding/ObservableField;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 111
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->heightField:Landroidx/databinding/ObservableField;

    return-object v0
.end method

.method public getKoin()Lorg/koin/core/Koin;
    .locals 1

    .line 78
    move-object v0, p0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    invoke-static {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable$DefaultImpls;->getKoin(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;)Lorg/koin/core/Koin;

    move-result-object v0

    return-object v0
.end method

.method public final getLanguageField()Landroidx/databinding/ObservableField;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 106
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->languageField:Landroidx/databinding/ObservableField;

    return-object v0
.end method

.method public final getPowerField()Landroidx/databinding/ObservableField;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 119
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->powerField:Landroidx/databinding/ObservableField;

    return-object v0
.end method

.method public final getSleepField()Landroidx/databinding/ObservableField;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 118
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->sleepField:Landroidx/databinding/ObservableField;

    return-object v0
.end method

.method public final getSleepTimeField()Landroidx/databinding/ObservableField;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 114
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->sleepTimeField:Landroidx/databinding/ObservableField;

    return-object v0
.end method

.method public final getStepsField()Landroidx/databinding/ObservableField;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 116
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->stepsField:Landroidx/databinding/ObservableField;

    return-object v0
.end method

.method public final getStravaStatus()Landroidx/databinding/ObservableField;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .line 122
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->stravaStatus:Landroidx/databinding/ObservableField;

    return-object v0
.end method

.method public final getUnitsField()Landroidx/databinding/ObservableField;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 107
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->unitsField:Landroidx/databinding/ObservableField;

    return-object v0
.end method

.method public final getWeightField()Landroidx/databinding/ObservableField;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 110
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->weightField:Landroidx/databinding/ObservableField;

    return-object v0
.end method

.method public final isConnectionOptimized()Z
    .locals 1

    .line 620
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->connectionPreference:Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/ConnectionPreference;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/ConnectionPreference;->isAutoConnectEnabled()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public final isUpdateAvailable()Landroidx/databinding/ObservableField;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .line 125
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->isUpdateAvailable:Landroidx/databinding/ObservableField;

    return-object v0
.end method

.method public final onAgeClicked(Landroid/view/View;)V
    .locals 10

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 502
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->user:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;->getAge()I

    move-result p1

    .line 503
    new-instance v9, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelConfig;

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelType$Age;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelType$Age;

    move-object v1, v0

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelType;

    .line 504
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    const/16 v4, 0x78

    const/16 v5, 0xd

    const/4 v6, 0x0

    const/16 v7, 0x24

    const/4 v8, 0x0

    move-object v0, v9

    .line 503
    invoke-direct/range {v0 .. v8}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelConfig;-><init>(Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelType;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/StringPickerAdapter;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 508
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->managerWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    move-object v0, p1

    check-cast v0, Landroidx/fragment/app/FragmentManager;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelFragment$Companion;

    invoke-virtual {p1, v9}, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelFragment$Companion;->newInstance(Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelConfig;)Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelFragment;

    move-result-object p1

    move-object v1, p1

    check-cast v1, Landroidx/fragment/app/Fragment;

    const v2, 0x7f080280

    const/4 v3, 0x0

    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType$Side;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType$Side;

    move-object v4, p1

    check-cast v4, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType;

    const/4 v5, 0x4

    const/4 v6, 0x0

    invoke-static/range {v0 .. v6}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationExtensionsKt;->addFragment$default(Landroidx/fragment/app/FragmentManager;Landroidx/fragment/app/Fragment;IZLpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType;ILjava/lang/Object;)V

    :goto_0
    return-void

    :cond_1
    const-string p1, "user"

    .line 502
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public final onAppVersionFieldClick(Landroid/view/View;)V
    .locals 2

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 587
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->disposable:Lio/reactivex/disposables/Disposable;

    if-eqz v0, :cond_0

    .line 588
    invoke-interface {v0}, Lio/reactivex/disposables/Disposable;->isDisposed()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 589
    :cond_0
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->clickObservable:Lio/reactivex/Completable;

    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/main/watch/-$$Lambda$PWWatchViewModel$OueR02RGmpMll6zOMjToBjVGjik;

    invoke-direct {v1, p1, p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/-$$Lambda$PWWatchViewModel$OueR02RGmpMll6zOMjToBjVGjik;-><init>(Landroid/view/View;Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;)V

    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/main/watch/-$$Lambda$PWWatchViewModel$KvoeO4ySbNQRWD1hfd0nDTWLhYQ;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/watch/-$$Lambda$PWWatchViewModel$KvoeO4ySbNQRWD1hfd0nDTWLhYQ;

    invoke-virtual {v0, v1, p1}, Lio/reactivex/Completable;->subscribe(Lio/reactivex/functions/Action;Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    move-result-object p1

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->disposable:Lio/reactivex/disposables/Disposable;

    .line 597
    :cond_1
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->clickSubject:Lio/reactivex/subjects/PublishSubject;

    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1, v0}, Lio/reactivex/subjects/PublishSubject;->onNext(Ljava/lang/Object;)V

    return-void
.end method

.method public final onCaloriesClicked(Landroid/view/View;)V
    .locals 9

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 527
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->goalConfig:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;

    if-nez p1, :cond_0

    goto :goto_1

    .line 528
    :cond_0
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->userPrefsUtils:Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->user:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;

    if-eqz v1, :cond_3

    invoke-virtual {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;->isMetricsUsed(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;)Z

    move-result v0

    .line 529
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/setup/goals/EditGoalConfig;

    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/setup/goals/GoalType$Calories;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/setup/goals/GoalType$Calories;

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/setup/goals/GoalType;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;->getCalories()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    if-eqz v0, :cond_1

    const-string v0, " kcal"

    goto :goto_0

    :cond_1
    const-string v0, " Cal"

    :goto_0
    invoke-direct {v1, v2, p1, v0}, Lpowerwatch/matrix/com/pwgen2android/setup/goals/EditGoalConfig;-><init>(Lpowerwatch/matrix/com/pwgen2android/setup/goals/GoalType;Ljava/lang/Number;Ljava/lang/String;)V

    .line 530
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->managerWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    move-object v2, p1

    check-cast v2, Landroidx/fragment/app/FragmentManager;

    if-nez v2, :cond_2

    goto :goto_1

    :cond_2
    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditFragment$Companion;

    invoke-virtual {p1, v1}, Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditFragment$Companion;->newInstance(Lpowerwatch/matrix/com/pwgen2android/setup/goals/EditGoalConfig;)Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditFragment;

    move-result-object p1

    move-object v3, p1

    check-cast v3, Landroidx/fragment/app/Fragment;

    const v4, 0x7f080280

    const/4 v5, 0x0

    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType$Side;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType$Side;

    move-object v6, p1

    check-cast v6, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType;

    const/4 v7, 0x4

    const/4 v8, 0x0

    invoke-static/range {v2 .. v8}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationExtensionsKt;->addFragment$default(Landroidx/fragment/app/FragmentManager;Landroidx/fragment/app/Fragment;IZLpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType;ILjava/lang/Object;)V

    :goto_1
    return-void

    :cond_3
    const-string p1, "user"

    .line 528
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public final onChangePasswordClicked(Landroid/view/View;)V
    .locals 7

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 439
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->managerWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    move-object v0, p1

    check-cast v0, Landroidx/fragment/app/FragmentManager;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/setup/changepassword/ChangePasswordFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/setup/changepassword/ChangePasswordFragment$Companion;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/setup/changepassword/ChangePasswordFragment$Companion;->newInstance()Lpowerwatch/matrix/com/pwgen2android/setup/changepassword/ChangePasswordFragment;

    move-result-object p1

    move-object v1, p1

    check-cast v1, Landroidx/fragment/app/Fragment;

    const v2, 0x7f080280

    const/4 v3, 0x0

    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType$Side;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType$Side;

    move-object v4, p1

    check-cast v4, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType;

    const/4 v5, 0x4

    const/4 v6, 0x0

    invoke-static/range {v0 .. v6}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationExtensionsKt;->addFragment$default(Landroidx/fragment/app/FragmentManager;Landroidx/fragment/app/Fragment;IZLpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType;ILjava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public final onClockClicked(Landroid/view/View;)V
    .locals 20

    move-object/from16 v0, p0

    const-string v1, "<this>"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 425
    iget-object v1, v0, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->user:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;->getAccountSettings()Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserAccountSettings;

    move-result-object v1

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserAccountSettings;->getTimeFormatType()I

    move-result v1

    .line 427
    new-instance v11, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelConfig;

    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelType$Clock;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelType$Clock;

    move-object v3, v2

    check-cast v3, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelType;

    .line 428
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x68

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 429
    new-instance v5, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/StringPickerAdapter;

    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/PickedData;

    const/4 v13, 0x0

    const/4 v2, 0x2

    new-array v14, v2, [Ljava/lang/String;

    const/4 v2, 0x0

    .line 431
    sget-object v6, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/HourFormat$Twelve;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/HourFormat$Twelve;

    invoke-virtual {v6}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/HourFormat$Twelve;->getFormat()I

    move-result v6

    invoke-static {v6}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v6

    aput-object v6, v14, v2

    const/4 v2, 0x1

    .line 432
    sget-object v6, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/HourFormat$TwentyFour;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/HourFormat$TwentyFour;

    invoke-virtual {v6}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/HourFormat$TwentyFour;->getFormat()I

    move-result v6

    invoke-static {v6}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v6

    aput-object v6, v14, v2

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x1d

    const/16 v19, 0x0

    move-object v12, v1

    .line 429
    invoke-direct/range {v12 .. v19}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/PickedData;-><init>(Ljava/lang/String;[Ljava/lang/String;II[Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const-string v2, "h"

    invoke-direct {v5, v1, v2}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/StringPickerAdapter;-><init>(Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/PickedData;Ljava/lang/String;)V

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/16 v9, 0x38

    const/4 v10, 0x0

    move-object v2, v11

    .line 427
    invoke-direct/range {v2 .. v10}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelConfig;-><init>(Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelType;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/StringPickerAdapter;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 434
    iget-object v1, v0, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->managerWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Landroidx/fragment/app/FragmentManager;

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelFragment$Companion;

    invoke-virtual {v1, v11}, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelFragment$Companion;->newInstance(Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelConfig;)Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelFragment;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Landroidx/fragment/app/Fragment;

    const v4, 0x7f080280

    const/4 v5, 0x0

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType$Side;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType$Side;

    move-object v6, v1

    check-cast v6, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType;

    const/4 v7, 0x4

    const/4 v8, 0x0

    invoke-static/range {v2 .. v8}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationExtensionsKt;->addFragment$default(Landroidx/fragment/app/FragmentManager;Landroidx/fragment/app/Fragment;IZLpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType;ILjava/lang/Object;)V

    :goto_0
    return-void

    :cond_1
    const-string v1, "user"

    .line 425
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v1, 0x0

    throw v1
.end method

.method public final onContactSupportClicked(Landroid/view/View;)V
    .locals 5

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 555
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const v1, 0x7f0f008f

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "context.getString(R.string.contact_support)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 556
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const v2, 0x7f0f010e

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "context.getString(R.string.matrix_support_email)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 557
    new-instance v2, Landroid/content/Intent;

    const-string v3, "android.intent.action.SEND"

    invoke-direct {v2, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/String;

    const/4 v4, 0x0

    aput-object v1, v3, v4

    const-string v1, "android.intent.extra.EMAIL"

    .line 558
    invoke-virtual {v2, v1, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[Ljava/lang/String;)Landroid/content/Intent;

    const-string v1, "message/rfc822"

    .line 559
    invoke-virtual {v2, v1}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    const-string v1, "android.intent.extra.SUBJECT"

    .line 560
    invoke-virtual {v2, v1, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 561
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->createAppInfoData()Ljava/lang/String;

    move-result-object v1

    const-string v3, "android.intent.extra.TEXT"

    invoke-virtual {v2, v3, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 562
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    check-cast v0, Ljava/lang/CharSequence;

    invoke-static {v2, v0}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method public onCreateView(Landroid/content/Context;)V
    .locals 6

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 227
    invoke-super {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;->onCreateView(Landroid/content/Context;)V

    .line 229
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->sleepTimeField:Landroidx/databinding/ObservableField;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->contextWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/app/Activity;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move-object v1, v2

    goto :goto_0

    :cond_0
    const v3, 0x7f0f0197

    invoke-virtual {v1, v3}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    :goto_0
    invoke-virtual {v0, v1}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    .line 230
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->getCompositeDisposable()Lio/reactivex/disposables/CompositeDisposable;

    move-result-object v0

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->userAccountRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GetFirstRepository;

    const/4 v3, 0x0

    const/4 v4, 0x3

    .line 231
    invoke-static {v1, v3, v3, v4, v2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GetFirstRepository$DefaultImpls;->getFirst$default(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GetFirstRepository;ZZILjava/lang/Object;)Lio/reactivex/Single;

    move-result-object v1

    .line 232
    invoke-static {}, Lio/reactivex/android/schedulers/AndroidSchedulers;->mainThread()Lio/reactivex/Scheduler;

    move-result-object v5

    invoke-virtual {v1, v5}, Lio/reactivex/Single;->observeOn(Lio/reactivex/Scheduler;)Lio/reactivex/Single;

    move-result-object v1

    .line 233
    new-instance v5, Lpowerwatch/matrix/com/pwgen2android/main/watch/-$$Lambda$PWWatchViewModel$XbR2SFA1SnwomFZOdHmsl8z3O4Y;

    invoke-direct {v5, p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/watch/-$$Lambda$PWWatchViewModel$XbR2SFA1SnwomFZOdHmsl8z3O4Y;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;Landroid/content/Context;)V

    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/main/watch/-$$Lambda$PWWatchViewModel$YzLcvqy1roivdrVFbD54QDPInIw;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/watch/-$$Lambda$PWWatchViewModel$YzLcvqy1roivdrVFbD54QDPInIw;

    invoke-virtual {v1, v5, p1}, Lio/reactivex/Single;->subscribe(Lio/reactivex/functions/Consumer;Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    move-result-object p1

    .line 230
    invoke-virtual {v0, p1}, Lio/reactivex/disposables/CompositeDisposable;->add(Lio/reactivex/disposables/Disposable;)Z

    .line 267
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->getCompositeDisposable()Lio/reactivex/disposables/CompositeDisposable;

    move-result-object p1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->goalsRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepository;

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/ObserveRepository;

    invoke-static {v0, v3, v3, v4, v2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/ObserveRepository$DefaultImpls;->load$default(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/ObserveRepository;ZZILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v0

    .line 268
    invoke-virtual {v0}, Lio/reactivex/Observable;->firstOrError()Lio/reactivex/Single;

    move-result-object v0

    .line 269
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/main/watch/-$$Lambda$PWWatchViewModel$Yz9er8oSqQvynqxybkufATavWcE;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/-$$Lambda$PWWatchViewModel$Yz9er8oSqQvynqxybkufATavWcE;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;)V

    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/main/watch/-$$Lambda$PWWatchViewModel$nI6Kpi3x6hYpF_mDrJDj9monvCQ;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/watch/-$$Lambda$PWWatchViewModel$nI6Kpi3x6hYpF_mDrJDj9monvCQ;

    invoke-virtual {v0, v1, v2}, Lio/reactivex/Single;->subscribe(Lio/reactivex/functions/Consumer;Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    move-result-object v0

    .line 267
    invoke-virtual {p1, v0}, Lio/reactivex/disposables/CompositeDisposable;->add(Lio/reactivex/disposables/Disposable;)Z

    return-void
.end method

.method public final onDailySettingsClicked(Landroid/view/View;)V
    .locals 4

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 635
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->managerWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/fragment/app/FragmentManager;

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/dailygoals/DailyGoalsSettingsFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/dailygoals/DailyGoalsSettingsFragment$Companion;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/dailygoals/DailyGoalsSettingsFragment$Companion;->newInstance()Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/dailygoals/DailyGoalsSettingsFragment;

    move-result-object v0

    check-cast v0, Landroidx/fragment/app/Fragment;

    const v1, 0x7f080280

    const/4 v2, 0x1

    sget-object v3, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType$Side;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType$Side;

    check-cast v3, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType;

    invoke-static {p1, v0, v1, v2, v3}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationExtensionsKt;->addFragment(Landroidx/fragment/app/FragmentManager;Landroidx/fragment/app/Fragment;IZLpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType;)V

    :goto_0
    return-void
.end method

.method public final onGenderClicked(Landroid/view/View;)V
    .locals 17

    move-object/from16 v0, p0

    const-string v1, "<this>"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 482
    iget-object v1, v0, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->user:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;

    if-eqz v1, :cond_8

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;->getGender()Ljava/lang/String;

    move-result-object v1

    .line 484
    sget-object v3, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Gender$Male;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Gender$Male;

    invoke-virtual {v3}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Gender$Male;->getDescription()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    sget-object v3, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Gender$Male;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Gender$Male;

    invoke-virtual {v3}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Gender$Male;->getDisplayResource()I

    move-result v3

    goto :goto_0

    :cond_0
    sget-object v3, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Gender$Female;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Gender$Female;

    invoke-virtual {v3}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Gender$Female;->getDisplayResource()I

    move-result v3

    .line 485
    :goto_0
    iget-object v4, v0, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->contextWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v4}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/app/Activity;

    if-nez v4, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v4, v3}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_2

    :goto_1
    move-object v6, v1

    goto :goto_2

    :cond_2
    move-object v6, v3

    :goto_2
    const-string v3, "contextWeakReference.get()?.getString(res) ?: currentGender"

    invoke-static {v6, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 487
    new-instance v3, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelConfig;

    sget-object v4, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelType$Gender;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelType$Gender;

    move-object v5, v4

    check-cast v5, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelType;

    .line 489
    new-instance v7, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/StringPickerAdapter;

    new-instance v4, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/PickedData;

    const/4 v9, 0x0

    const/4 v15, 0x2

    new-array v10, v15, [Ljava/lang/String;

    .line 491
    sget-object v8, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Gender$Male;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Gender$Male;

    invoke-virtual {v8}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Gender$Male;->getDescription()Ljava/lang/String;

    move-result-object v8

    const/4 v11, 0x0

    aput-object v8, v10, v11

    .line 492
    sget-object v8, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Gender$Female;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Gender$Female;

    invoke-virtual {v8}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Gender$Female;->getDescription()Ljava/lang/String;

    move-result-object v8

    const/4 v12, 0x1

    aput-object v8, v10, v12

    const/4 v13, 0x0

    const/4 v14, 0x0

    new-array v8, v15, [Ljava/lang/String;

    .line 494
    iget-object v15, v0, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->contextWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v15}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Landroid/app/Activity;

    if-nez v15, :cond_3

    goto :goto_3

    :cond_3
    sget-object v16, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Gender$Male;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Gender$Male;

    invoke-virtual/range {v16 .. v16}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Gender$Male;->getDisplayResource()I

    move-result v2

    invoke-virtual {v15, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_4

    :goto_3
    move-object v2, v1

    :cond_4
    const-string v15, "contextWeakReference.get()?.getString(Gender.Male.displayResource) ?: currentGender"

    invoke-static {v2, v15}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    aput-object v2, v8, v11

    .line 495
    iget-object v2, v0, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->contextWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v2}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/app/Activity;

    if-nez v2, :cond_5

    goto :goto_4

    :cond_5
    sget-object v11, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Gender$Female;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Gender$Female;

    invoke-virtual {v11}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Gender$Female;->getDisplayResource()I

    move-result v11

    invoke-virtual {v2, v11}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_6

    goto :goto_4

    :cond_6
    move-object v1, v2

    :goto_4
    const-string v2, "contextWeakReference.get()?.getString(Gender.Female.displayResource) ?: currentGender"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    aput-object v1, v8, v12

    const/16 v1, 0xd

    const/4 v15, 0x0

    move-object v2, v8

    move-object v8, v4

    move v11, v13

    move v12, v14

    move-object v13, v2

    move v14, v1

    const/4 v1, 0x2

    .line 489
    invoke-direct/range {v8 .. v15}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/PickedData;-><init>(Ljava/lang/String;[Ljava/lang/String;II[Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v2, 0x0

    invoke-direct {v7, v4, v2, v1, v2}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/StringPickerAdapter;-><init>(Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/PickedData;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/16 v11, 0x38

    const/4 v12, 0x0

    move-object v4, v3

    .line 487
    invoke-direct/range {v4 .. v12}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelConfig;-><init>(Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelType;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/StringPickerAdapter;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 498
    iget-object v1, v0, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->managerWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Landroidx/fragment/app/FragmentManager;

    if-nez v4, :cond_7

    goto :goto_5

    :cond_7
    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelFragment$Companion;

    invoke-virtual {v1, v3}, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelFragment$Companion;->newInstance(Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelConfig;)Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelFragment;

    move-result-object v1

    move-object v5, v1

    check-cast v5, Landroidx/fragment/app/Fragment;

    const v6, 0x7f080280

    const/4 v7, 0x0

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType$Side;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType$Side;

    move-object v8, v1

    check-cast v8, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType;

    const/4 v9, 0x4

    const/4 v10, 0x0

    invoke-static/range {v4 .. v10}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationExtensionsKt;->addFragment$default(Landroidx/fragment/app/FragmentManager;Landroidx/fragment/app/Fragment;IZLpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType;ILjava/lang/Object;)V

    :goto_5
    return-void

    :cond_8
    const-string v1, "user"

    .line 482
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v1, 0x0

    throw v1
.end method

.method public final onHeightClicked(Landroid/view/View;)V
    .locals 13

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 443
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->userPrefsUtils:Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->user:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;

    const/4 v1, 0x0

    const-string v2, "user"

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;->getHeight()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    sget-object v3, Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType$HEIGHT;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType$HEIGHT;

    check-cast v3, Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType;

    invoke-virtual {p1, v0, v3}, Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;->getValue(Ljava/lang/Number;Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType;)Lkotlin/Pair;

    move-result-object p1

    .line 444
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->userPrefsUtils:Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;

    iget-object v3, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->user:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;

    if-eqz v3, :cond_2

    invoke-virtual {v0, v3}, Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;->isMetricsUsed(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;)Z

    move-result v0

    .line 446
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->userPrefsUtils:Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;

    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType$HEIGHT;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType$HEIGHT;

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType;

    invoke-virtual {v1, v2, v0}, Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;->maxUnitValue(Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType;Z)I

    move-result v1

    .line 447
    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->userPrefsUtils:Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;

    sget-object v3, Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType$HEIGHT;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType$HEIGHT;

    check-cast v3, Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType;

    invoke-virtual {v2, v3, v0}, Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;->minUnitValue(Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType;Z)I

    move-result v0

    .line 449
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    move-result v3

    invoke-static {v3}, Lkotlin/math/MathKt;->roundToInt(F)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 450
    sget-object v11, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelType$Height;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelType$Height;

    .line 455
    new-instance v3, Lkotlin/ranges/IntRange;

    invoke-direct {v3, v0, v1}, Lkotlin/ranges/IntRange;-><init>(II)V

    check-cast v3, Ljava/lang/Iterable;

    .line 658
    new-instance v4, Ljava/util/ArrayList;

    const/16 v5, 0xa

    invoke-static {v3, v5}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v4, Ljava/util/Collection;

    .line 659
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_0

    move-object v5, v3

    check-cast v5, Lkotlin/collections/IntIterator;

    invoke-virtual {v5}, Lkotlin/collections/IntIterator;->nextInt()I

    move-result v5

    .line 455
    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 661
    :cond_0
    check-cast v4, Ljava/util/List;

    .line 658
    check-cast v4, Ljava/util/Collection;

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/String;

    .line 663
    invoke-interface {v4, v3}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v3

    const-string v4, "null cannot be cast to non-null type kotlin.Array<T>"

    invoke-static {v3, v4}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 456
    move-object v5, v3

    check-cast v5, [Ljava/lang/String;

    .line 454
    new-instance v12, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/PickedData;

    const/4 v8, 0x0

    const/16 v9, 0x10

    const/4 v10, 0x0

    move-object v3, v12

    move-object v4, v2

    move v6, v1

    move v7, v0

    invoke-direct/range {v3 .. v10}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/PickedData;-><init>(Ljava/lang/String;[Ljava/lang/String;II[Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 456
    invoke-virtual {p1}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    .line 454
    new-instance v6, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/StringPickerAdapter;

    invoke-direct {v6, v12, p1}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/StringPickerAdapter;-><init>(Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/PickedData;Ljava/lang/String;)V

    .line 450
    new-instance p1, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelConfig;

    move-object v4, v11

    check-cast v4, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelType;

    const/4 v9, 0x0

    const/16 v10, 0x20

    const/4 v11, 0x0

    move-object v3, p1

    move-object v5, v2

    move v7, v1

    move v8, v0

    invoke-direct/range {v3 .. v11}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelConfig;-><init>(Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelType;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/StringPickerAdapter;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 458
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->managerWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Landroidx/fragment/app/FragmentManager;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelFragment$Companion;

    invoke-virtual {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelFragment$Companion;->newInstance(Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelConfig;)Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelFragment;

    move-result-object p1

    move-object v2, p1

    check-cast v2, Landroidx/fragment/app/Fragment;

    const v3, 0x7f080280

    const/4 v4, 0x0

    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType$Side;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType$Side;

    move-object v5, p1

    check-cast v5, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType;

    const/4 v6, 0x4

    const/4 v7, 0x0

    invoke-static/range {v1 .. v7}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationExtensionsKt;->addFragment$default(Landroidx/fragment/app/FragmentManager;Landroidx/fragment/app/Fragment;IZLpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType;ILjava/lang/Object;)V

    :goto_1
    return-void

    .line 444
    :cond_2
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    throw v1

    .line 443
    :cond_3
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    throw v1
.end method

.method public final onLanguageClicked(Landroid/view/View;)V
    .locals 7

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 513
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->managerWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    move-object v0, p1

    check-cast v0, Landroidx/fragment/app/FragmentManager;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/setup/language/ChooseLanguageFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/setup/language/ChooseLanguageFragment$Companion;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/setup/language/ChooseLanguageFragment$Companion;->newInstance()Lpowerwatch/matrix/com/pwgen2android/setup/language/ChooseLanguageFragment;

    move-result-object p1

    move-object v1, p1

    check-cast v1, Landroidx/fragment/app/Fragment;

    const v2, 0x7f080280

    const/4 v3, 0x0

    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType$Side;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType$Side;

    move-object v4, p1

    check-cast v4, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType;

    const/4 v5, 0x4

    const/4 v6, 0x0

    invoke-static/range {v0 .. v6}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationExtensionsKt;->addFragment$default(Landroidx/fragment/app/FragmentManager;Landroidx/fragment/app/Fragment;IZLpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType;ILjava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public final onLocationRequested(Landroid/view/View;)V
    .locals 3

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 354
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->getCompositeDisposable()Lio/reactivex/disposables/CompositeDisposable;

    move-result-object p1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->rxPermissions:Lcom/tbruyelle/rxpermissions2/RxPermissions;

    const-string v1, "android.permission.ACCESS_COARSE_LOCATION"

    const-string v2, "android.permission.ACCESS_FINE_LOCATION"

    .line 356
    filled-new-array {v1, v2}, [Ljava/lang/String;

    move-result-object v1

    .line 355
    invoke-virtual {v0, v1}, Lcom/tbruyelle/rxpermissions2/RxPermissions;->request([Ljava/lang/String;)Lio/reactivex/Observable;

    move-result-object v0

    .line 357
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/main/watch/-$$Lambda$PWWatchViewModel$Hf86PAoBSiW8J_iU6WFDMu_UoYM;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/-$$Lambda$PWWatchViewModel$Hf86PAoBSiW8J_iU6WFDMu_UoYM;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;)V

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->flatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object v0

    .line 375
    invoke-static {}, Lio/reactivex/android/schedulers/AndroidSchedulers;->mainThread()Lio/reactivex/Scheduler;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->observeOn(Lio/reactivex/Scheduler;)Lio/reactivex/Observable;

    move-result-object v0

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/main/watch/-$$Lambda$PWWatchViewModel$hTh6jfxqLUNP-izY2lsjdb_N-TM;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/watch/-$$Lambda$PWWatchViewModel$hTh6jfxqLUNP-izY2lsjdb_N-TM;

    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/main/watch/-$$Lambda$PWWatchViewModel$--UZa82Ld_WCdGNDbv9A6kgup5U;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/watch/-$$Lambda$PWWatchViewModel$--UZa82Ld_WCdGNDbv9A6kgup5U;

    .line 376
    invoke-virtual {v0, v1, v2}, Lio/reactivex/Observable;->subscribe(Lio/reactivex/functions/Consumer;Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    move-result-object v0

    .line 354
    invoke-virtual {p1, v0}, Lio/reactivex/disposables/CompositeDisposable;->add(Lio/reactivex/disposables/Disposable;)Z

    return-void
.end method

.method public final onLogoutClicked(Landroid/view/View;)V
    .locals 9

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 320
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->getCompositeDisposable()Lio/reactivex/disposables/CompositeDisposable;

    move-result-object v0

    .line 321
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->dialogManager:Lpowerwatch/matrix/com/pwgen2android/shared/ui/dialogManager/DialogManager;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    const-string p1, "context"

    invoke-static {v2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const v3, 0x7f0f00fb

    const v4, 0x7f0f010a

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/16 v7, 0x18

    const/4 v8, 0x0

    invoke-static/range {v1 .. v8}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/dialogManager/DialogManager$DefaultImpls;->openAlertDialog$default(Lpowerwatch/matrix/com/pwgen2android/shared/ui/dialogManager/DialogManager;Landroid/content/Context;IIIIILjava/lang/Object;)Lio/reactivex/Single;

    move-result-object p1

    .line 322
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/main/watch/-$$Lambda$PWWatchViewModel$dzKBkFX5lv41c1vpA_x6nl5dtfo;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/-$$Lambda$PWWatchViewModel$dzKBkFX5lv41c1vpA_x6nl5dtfo;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;)V

    invoke-virtual {p1, v1}, Lio/reactivex/Single;->flatMapCompletable(Lio/reactivex/functions/Function;)Lio/reactivex/Completable;

    move-result-object p1

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/main/watch/-$$Lambda$PWWatchViewModel$fCNw_JASlY25ot1NKsyIXvvZYqY;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/watch/-$$Lambda$PWWatchViewModel$fCNw_JASlY25ot1NKsyIXvvZYqY;

    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/main/watch/-$$Lambda$PWWatchViewModel$0Y3Rnw1qStN4mMro6H1oR3IocYw;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/watch/-$$Lambda$PWWatchViewModel$0Y3Rnw1qStN4mMro6H1oR3IocYw;

    .line 349
    invoke-virtual {p1, v1, v2}, Lio/reactivex/Completable;->subscribe(Lio/reactivex/functions/Action;Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    move-result-object p1

    .line 320
    invoke-virtual {v0, p1}, Lio/reactivex/disposables/CompositeDisposable;->add(Lio/reactivex/disposables/Disposable;)Z

    return-void
.end method

.method public final onNotificationSettingsClicked(Landroid/view/View;)V
    .locals 4

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 647
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->managerWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/fragment/app/FragmentManager;

    if-nez p1, :cond_0

    goto :goto_1

    :cond_0
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/main/notification/ui/NotificationSettingsFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/main/notification/ui/NotificationSettingsFragment$Companion;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->pairedDevice:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;

    if-nez v1, :cond_1

    const/4 v1, 0x0

    goto :goto_0

    :cond_1
    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;->getBluetoothAddress()Ljava/lang/String;

    move-result-object v1

    :goto_0
    invoke-virtual {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/main/notification/ui/NotificationSettingsFragment$Companion;->newInstance(Ljava/lang/String;)Lpowerwatch/matrix/com/pwgen2android/main/notification/ui/NotificationSettingsFragment;

    move-result-object v0

    check-cast v0, Landroidx/fragment/app/Fragment;

    const v1, 0x7f080280

    const/4 v2, 0x1

    sget-object v3, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType$Side;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType$Side;

    check-cast v3, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType;

    invoke-static {p1, v0, v1, v2, v3}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationExtensionsKt;->addFragment(Landroidx/fragment/app/FragmentManager;Landroidx/fragment/app/Fragment;IZLpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType;)V

    :goto_1
    return-void
.end method

.method public final onNotificationsClicked(Landroid/view/View;)V
    .locals 7

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 395
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->managerWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    move-object v0, p1

    check-cast v0, Landroidx/fragment/app/FragmentManager;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/NotificationsFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/setup/notifications/NotificationsFragment$Companion;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/NotificationsFragment$Companion;->newInstance()Lpowerwatch/matrix/com/pwgen2android/setup/notifications/NotificationsFragment;

    move-result-object p1

    move-object v1, p1

    check-cast v1, Landroidx/fragment/app/Fragment;

    const v2, 0x7f080280

    const/4 v3, 0x0

    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType$Side;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType$Side;

    move-object v4, p1

    check-cast v4, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType;

    const/4 v5, 0x4

    const/4 v6, 0x0

    invoke-static/range {v0 .. v6}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationExtensionsKt;->addFragment$default(Landroidx/fragment/app/FragmentManager;Landroidx/fragment/app/Fragment;IZLpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType;ILjava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public final onPersonalPreferencesSettingsClicked(Landroid/view/View;)V
    .locals 4

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 643
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->managerWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/fragment/app/FragmentManager;

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/PersonalSettingsFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/PersonalSettingsFragment$Companion;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/PersonalSettingsFragment$Companion;->newInstance()Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/PersonalSettingsFragment;

    move-result-object v0

    check-cast v0, Landroidx/fragment/app/Fragment;

    const v1, 0x7f080280

    const/4 v2, 0x1

    sget-object v3, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType$Side;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType$Side;

    check-cast v3, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType;

    invoke-static {p1, v0, v1, v2, v3}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationExtensionsKt;->addFragment(Landroidx/fragment/app/FragmentManager;Landroidx/fragment/app/Fragment;IZLpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType;)V

    :goto_0
    return-void
.end method

.method public final onPowerClicked(Landroid/view/View;)V
    .locals 8

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 543
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->goalConfig:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;

    if-nez p1, :cond_0

    goto :goto_0

    .line 544
    :cond_0
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/setup/goals/EditGoalConfig;

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/setup/goals/GoalType$Power;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/setup/goals/GoalType$Power;

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/setup/goals/GoalType;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;->getPower()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    const-string v2, " \u00b5Wh"

    invoke-direct {v0, v1, p1, v2}, Lpowerwatch/matrix/com/pwgen2android/setup/goals/EditGoalConfig;-><init>(Lpowerwatch/matrix/com/pwgen2android/setup/goals/GoalType;Ljava/lang/Number;Ljava/lang/String;)V

    .line 545
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->managerWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    move-object v1, p1

    check-cast v1, Landroidx/fragment/app/FragmentManager;

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditFragment$Companion;

    invoke-virtual {p1, v0}, Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditFragment$Companion;->newInstance(Lpowerwatch/matrix/com/pwgen2android/setup/goals/EditGoalConfig;)Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditFragment;

    move-result-object p1

    move-object v2, p1

    check-cast v2, Landroidx/fragment/app/Fragment;

    const v3, 0x7f080280

    const/4 v4, 0x0

    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType$Side;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType$Side;

    move-object v5, p1

    check-cast v5, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType;

    const/4 v6, 0x4

    const/4 v7, 0x0

    invoke-static/range {v1 .. v7}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationExtensionsKt;->addFragment$default(Landroidx/fragment/app/FragmentManager;Landroidx/fragment/app/Fragment;IZLpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType;ILjava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public final onReportIssueClicked(Landroid/view/View;)V
    .locals 7

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 551
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->managerWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    move-object v0, p1

    check-cast v0, Landroidx/fragment/app/FragmentManager;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/ReportIssueFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/ReportIssueFragment$Companion;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/ReportIssueFragment$Companion;->newInstance()Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/ReportIssueFragment;

    move-result-object p1

    move-object v1, p1

    check-cast v1, Landroidx/fragment/app/Fragment;

    const v2, 0x7f080280

    const/4 v3, 0x0

    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType$Side;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType$Side;

    move-object v4, p1

    check-cast v4, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType;

    const/4 v5, 0x4

    const/4 v6, 0x0

    invoke-static/range {v0 .. v6}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationExtensionsKt;->addFragment$default(Landroidx/fragment/app/FragmentManager;Landroidx/fragment/app/Fragment;IZLpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType;ILjava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public final onSleepClicked(Landroid/view/View;)V
    .locals 8

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 536
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->goalConfig:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;

    if-nez p1, :cond_0

    goto :goto_0

    .line 537
    :cond_0
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/setup/goals/EditGoalConfig;

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/setup/goals/GoalType$Sleep;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/setup/goals/GoalType$Sleep;

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/setup/goals/GoalType;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;->getSleep()I

    move-result p1

    int-to-float p1, p1

    const/16 v2, 0x3c

    int-to-float v2, v2

    div-float/2addr p1, v2

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    const-string v2, "h"

    invoke-direct {v0, v1, p1, v2}, Lpowerwatch/matrix/com/pwgen2android/setup/goals/EditGoalConfig;-><init>(Lpowerwatch/matrix/com/pwgen2android/setup/goals/GoalType;Ljava/lang/Number;Ljava/lang/String;)V

    .line 538
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->managerWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    move-object v1, p1

    check-cast v1, Landroidx/fragment/app/FragmentManager;

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditFragment$Companion;

    invoke-virtual {p1, v0}, Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditFragment$Companion;->newInstance(Lpowerwatch/matrix/com/pwgen2android/setup/goals/EditGoalConfig;)Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditFragment;

    move-result-object p1

    move-object v2, p1

    check-cast v2, Landroidx/fragment/app/Fragment;

    const v3, 0x7f080280

    const/4 v4, 0x0

    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType$Side;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType$Side;

    move-object v5, p1

    check-cast v5, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType;

    const/4 v6, 0x4

    const/4 v7, 0x0

    invoke-static/range {v1 .. v7}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationExtensionsKt;->addFragment$default(Landroidx/fragment/app/FragmentManager;Landroidx/fragment/app/Fragment;IZLpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType;ILjava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public final onSleepTimeClicked(Landroid/view/View;)V
    .locals 14

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 406
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->pairedDevice:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;

    if-eqz p1, :cond_6

    .line 407
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->communicator:Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;

    invoke-interface {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;->connectedDevices()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    .line 654
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

    .line 407
    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->getUid()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->pairedDevice:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;

    if-nez v3, :cond_1

    move-object v3, v1

    goto :goto_0

    :cond_1
    invoke-virtual {v3}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;->getBluetoothAddress()Ljava/lang/String;

    move-result-object v3

    :goto_0
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_1

    :cond_2
    move-object v0, v1

    :goto_1
    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

    if-nez v0, :cond_3

    goto/16 :goto_3

    .line 409
    :cond_3
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->deviceProtocolStorage:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceProtocolStorage;

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->pairedDevice:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;

    if-nez v0, :cond_4

    move-object v0, v1

    goto :goto_2

    :cond_4
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;->getBluetoothAddress()Ljava/lang/String;

    move-result-object v0

    :goto_2
    invoke-virtual {p1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceProtocolStorage;->getDeviceProtocolVersion(Ljava/lang/String;)I

    move-result p1

    const/4 v0, 0x3

    if-lt p1, v0, :cond_6

    .line 411
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->sleepTimeUIStorage:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/SleepTimeUIStorage;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/SleepTimeUIStorage;->getDisplayValue()Ljava/lang/String;

    move-result-object v4

    .line 413
    new-instance p1, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelConfig;

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelType$SleepTime;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelType$SleepTime;

    move-object v3, v0

    check-cast v3, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelType;

    .line 415
    new-instance v5, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/StringPickerAdapter;

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/PickedData;

    const/4 v7, 0x0

    .line 416
    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->sleepTimeUIStorage:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/SleepTimeUIStorage;

    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/SleepTimeUIStorage;->getPossibleValues()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/util/Collection;

    const/4 v6, 0x0

    new-array v6, v6, [Ljava/lang/String;

    .line 657
    invoke-interface {v2, v6}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v2

    const-string v6, "null cannot be cast to non-null type kotlin.Array<T>"

    invoke-static {v2, v6}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-object v8, v2

    check-cast v8, [Ljava/lang/String;

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/16 v12, 0x1d

    const/4 v13, 0x0

    move-object v6, v0

    .line 415
    invoke-direct/range {v6 .. v13}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/PickedData;-><init>(Ljava/lang/String;[Ljava/lang/String;II[Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v2, 0x2

    invoke-direct {v5, v0, v1, v2, v1}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/StringPickerAdapter;-><init>(Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/PickedData;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/16 v9, 0x38

    const/4 v10, 0x0

    move-object v2, p1

    .line 413
    invoke-direct/range {v2 .. v10}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelConfig;-><init>(Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelType;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/StringPickerAdapter;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 418
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->managerWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Landroidx/fragment/app/FragmentManager;

    if-nez v1, :cond_5

    goto :goto_3

    :cond_5
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelFragment$Companion;

    invoke-virtual {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelFragment$Companion;->newInstance(Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelConfig;)Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelFragment;

    move-result-object p1

    move-object v2, p1

    check-cast v2, Landroidx/fragment/app/Fragment;

    const v3, 0x7f080280

    const/4 v4, 0x0

    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType$Side;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType$Side;

    move-object v5, p1

    check-cast v5, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType;

    const/4 v6, 0x4

    const/4 v7, 0x0

    invoke-static/range {v1 .. v7}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationExtensionsKt;->addFragment$default(Landroidx/fragment/app/FragmentManager;Landroidx/fragment/app/Fragment;IZLpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType;ILjava/lang/Object;)V

    :cond_6
    :goto_3
    return-void
.end method

.method public onStart(Landroid/content/Context;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 282
    invoke-super {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;->onStart(Landroid/content/Context;)V

    .line 283
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->pairedDevice:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;->getBluetoothAddress()Ljava/lang/String;

    move-result-object p1

    :goto_0
    invoke-direct {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->displaySleepTime(Ljava/lang/String;)V

    return-void
.end method

.method public final onStepsClicked(Landroid/view/View;)V
    .locals 8

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 519
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->goalConfig:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;

    if-nez p1, :cond_0

    goto :goto_0

    .line 520
    :cond_0
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/setup/goals/EditGoalConfig;

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/setup/goals/GoalType$Steps;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/setup/goals/GoalType$Steps;

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/setup/goals/GoalType;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;->getSteps()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    const-string v2, ""

    invoke-direct {v0, v1, p1, v2}, Lpowerwatch/matrix/com/pwgen2android/setup/goals/EditGoalConfig;-><init>(Lpowerwatch/matrix/com/pwgen2android/setup/goals/GoalType;Ljava/lang/Number;Ljava/lang/String;)V

    .line 521
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->managerWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    move-object v1, p1

    check-cast v1, Landroidx/fragment/app/FragmentManager;

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditFragment$Companion;

    invoke-virtual {p1, v0}, Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditFragment$Companion;->newInstance(Lpowerwatch/matrix/com/pwgen2android/setup/goals/EditGoalConfig;)Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditFragment;

    move-result-object p1

    move-object v2, p1

    check-cast v2, Landroidx/fragment/app/Fragment;

    const v3, 0x7f080280

    const/4 v4, 0x0

    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType$Side;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType$Side;

    move-object v5, p1

    check-cast v5, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType;

    const/4 v6, 0x4

    const/4 v7, 0x0

    invoke-static/range {v1 .. v7}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationExtensionsKt;->addFragment$default(Landroidx/fragment/app/FragmentManager;Landroidx/fragment/app/Fragment;IZLpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType;ILjava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public final onUnPairClicked(Landroid/view/View;)V
    .locals 2

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 390
    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/unpair/UnpairDialogFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/unpair/UnpairDialogFragment$Companion;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/unpair/UnpairDialogFragment$Companion;->newInstance()Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/unpair/UnpairDialogFragment;

    move-result-object p1

    .line 391
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->managerWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/fragment/app/FragmentManager;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/unpair/UnpairDialogFragment;->show(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;)V

    return-void
.end method

.method public final onUnitsClicked(Landroid/view/View;)V
    .locals 7

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 401
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->managerWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    move-object v0, p1

    check-cast v0, Landroidx/fragment/app/FragmentManager;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/setup/units/ChooseUnitsFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/setup/units/ChooseUnitsFragment$Companion;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/setup/units/ChooseUnitsFragment$Companion;->newInstance()Lpowerwatch/matrix/com/pwgen2android/setup/units/ChooseUnitsFragment;

    move-result-object p1

    move-object v1, p1

    check-cast v1, Landroidx/fragment/app/Fragment;

    const v2, 0x7f080280

    const/4 v3, 0x0

    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType$Side;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType$Side;

    move-object v4, p1

    check-cast v4, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType;

    const/4 v5, 0x4

    const/4 v6, 0x0

    invoke-static/range {v0 .. v6}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationExtensionsKt;->addFragment$default(Landroidx/fragment/app/FragmentManager;Landroidx/fragment/app/Fragment;IZLpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType;ILjava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public final onUpdateClicked(Landroid/view/View;)V
    .locals 10

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 300
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->updateInfo:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UpdateInfo;

    if-eqz p1, :cond_8

    .line 301
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->pairedDevice:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;

    if-eqz v0, :cond_8

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move-object v0, v1

    goto :goto_0

    .line 302
    :cond_0
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;->getFirmwareVersion()Ljava/lang/String;

    move-result-object v0

    :goto_0
    invoke-virtual {p1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UpdateInfo;->isUpdateAvailable(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UpdateInfo;->getForced()Z

    move-result v0

    if-eqz v0, :cond_8

    .line 304
    :cond_1
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/main/update/UpdateAvailableData;

    .line 305
    new-instance v9, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UpdateInfo;->getReleaseVersion()Ljava/lang/String;

    move-result-object v3

    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->pairedDevice:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;

    if-nez v2, :cond_2

    move-object v4, v1

    goto :goto_1

    :cond_2
    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;->getFirmwareVersion()Ljava/lang/String;

    move-result-object v2

    move-object v4, v2

    :goto_1
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 306
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UpdateInfo;->getReleaseNotes()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UpdateInfo;->getDownloadUrl()Ljava/lang/String;

    move-result-object v6

    .line 307
    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->pairedDevice:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;

    if-nez v2, :cond_3

    const/4 v2, 0x1

    const/4 v7, 0x1

    goto :goto_2

    :cond_3
    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;->getPid()I

    move-result v2

    move v7, v2

    :goto_2
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UpdateInfo;->getReleaseDate()Ljava/lang/String;

    move-result-object v8

    move-object v2, v9

    .line 305
    invoke-direct/range {v2 .. v8}, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V

    .line 308
    new-instance p1, Lpowerwatch/matrix/com/pwgen2android/main/update/DeviceUpdateData;

    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->pairedDevice:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;

    if-nez v2, :cond_4

    move-object v2, v1

    goto :goto_3

    :cond_4
    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;->getBluetoothAddress()Ljava/lang/String;

    move-result-object v2

    :goto_3
    iget-object v3, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->pairedDevice:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;

    if-nez v3, :cond_5

    goto :goto_4

    :cond_5
    invoke-virtual {v3}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;->getFirmwareVersion()Ljava/lang/String;

    move-result-object v1

    :goto_4
    invoke-direct {p1, v2, v1}, Lpowerwatch/matrix/com/pwgen2android/main/update/DeviceUpdateData;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->isUpdateAvailable:Landroidx/databinding/ObservableField;

    invoke-virtual {v1}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    if-nez v1, :cond_6

    const/4 v1, 0x0

    .line 309
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    .line 308
    :cond_6
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    .line 304
    invoke-direct {v0, v9, p1, v1}, Lpowerwatch/matrix/com/pwgen2android/main/update/UpdateAvailableData;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;Lpowerwatch/matrix/com/pwgen2android/main/update/DeviceUpdateData;Z)V

    .line 311
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->managerWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    move-object v1, p1

    check-cast v1, Landroidx/fragment/app/FragmentManager;

    if-nez v1, :cond_7

    goto :goto_5

    :cond_7
    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableFragment$Companion;

    .line 312
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/main/update/UpdateAvailableData;->getVersion()Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;

    move-result-object v2

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/main/update/UpdateAvailableData;->getDeviceInfo()Lpowerwatch/matrix/com/pwgen2android/main/update/DeviceUpdateData;

    move-result-object v3

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/main/update/UpdateAvailableData;->getUpdateAvailable()Z

    move-result v0

    .line 311
    invoke-virtual {p1, v2, v3, v0}, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableFragment$Companion;->newInstance(Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;Lpowerwatch/matrix/com/pwgen2android/main/update/DeviceUpdateData;Z)Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableFragment;

    move-result-object p1

    move-object v2, p1

    check-cast v2, Landroidx/fragment/app/Fragment;

    const v3, 0x7f080280

    const/4 v4, 0x0

    .line 314
    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType$Side;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType$Side;

    move-object v5, p1

    check-cast v5, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType;

    const/4 v6, 0x4

    const/4 v7, 0x0

    .line 311
    invoke-static/range {v1 .. v7}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationExtensionsKt;->addFragment$default(Landroidx/fragment/app/FragmentManager;Landroidx/fragment/app/Fragment;IZLpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType;ILjava/lang/Object;)V

    :cond_8
    :goto_5
    return-void
.end method

.method public final onWatchSettingsClicked(Landroid/view/View;)V
    .locals 4

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 639
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->managerWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/fragment/app/FragmentManager;

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsFragment$Companion;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsFragment$Companion;->newInstance()Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsFragment;

    move-result-object v0

    check-cast v0, Landroidx/fragment/app/Fragment;

    const v1, 0x7f080280

    const/4 v2, 0x1

    sget-object v3, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType$Side;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType$Side;

    check-cast v3, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType;

    invoke-static {p1, v0, v1, v2, v3}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationExtensionsKt;->addFragment(Landroidx/fragment/app/FragmentManager;Landroidx/fragment/app/Fragment;IZLpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType;)V

    :goto_0
    return-void
.end method

.method public final onWeightClicked(Landroid/view/View;)V
    .locals 13

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 463
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->userPrefsUtils:Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->user:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;

    const/4 v1, 0x0

    const-string v2, "user"

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;->getWeight()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    sget-object v3, Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType$WEIGHT;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType$WEIGHT;

    check-cast v3, Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType;

    invoke-virtual {p1, v0, v3}, Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;->getValue(Ljava/lang/Number;Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType;)Lkotlin/Pair;

    move-result-object p1

    .line 464
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    move-result v3

    invoke-static {v3}, Lkotlin/math/MathKt;->roundToInt(F)I

    move-result v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 466
    iget-object v3, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->userPrefsUtils:Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;

    iget-object v4, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->user:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;

    if-eqz v4, :cond_2

    invoke-virtual {v3, v4}, Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;->isMetricsUsed(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;)Z

    move-result v1

    .line 468
    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->userPrefsUtils:Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;

    sget-object v3, Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType$WEIGHT;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType$WEIGHT;

    check-cast v3, Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType;

    invoke-virtual {v2, v3, v1}, Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;->maxUnitValue(Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType;Z)I

    move-result v2

    .line 469
    iget-object v3, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->userPrefsUtils:Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;

    sget-object v4, Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType$WEIGHT;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType$WEIGHT;

    check-cast v4, Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType;

    invoke-virtual {v3, v4, v1}, Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;->minUnitValue(Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType;Z)I

    move-result v1

    .line 471
    sget-object v3, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelType$Weight;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelType$Weight;

    .line 475
    new-instance v4, Lkotlin/ranges/IntRange;

    invoke-direct {v4, v1, v2}, Lkotlin/ranges/IntRange;-><init>(II)V

    check-cast v4, Ljava/lang/Iterable;

    .line 664
    new-instance v5, Ljava/util/ArrayList;

    const/16 v6, 0xa

    invoke-static {v4, v6}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v5, Ljava/util/Collection;

    .line 665
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_0

    move-object v6, v4

    check-cast v6, Lkotlin/collections/IntIterator;

    invoke-virtual {v6}, Lkotlin/collections/IntIterator;->nextInt()I

    move-result v6

    .line 475
    invoke-static {v6}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v6

    invoke-interface {v5, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 667
    :cond_0
    check-cast v5, Ljava/util/List;

    .line 664
    check-cast v5, Ljava/util/Collection;

    const/4 v4, 0x0

    new-array v4, v4, [Ljava/lang/String;

    .line 669
    invoke-interface {v5, v4}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v4

    const-string v5, "null cannot be cast to non-null type kotlin.Array<T>"

    invoke-static {v4, v5}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-object v6, v4

    check-cast v6, [Ljava/lang/String;

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/16 v10, 0x1c

    const/4 v11, 0x0

    .line 475
    new-instance v12, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/PickedData;

    move-object v4, v12

    move-object v5, v0

    invoke-direct/range {v4 .. v11}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/PickedData;-><init>(Ljava/lang/String;[Ljava/lang/String;II[Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 476
    invoke-virtual {p1}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    .line 475
    new-instance v7, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/StringPickerAdapter;

    invoke-direct {v7, v12, p1}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/StringPickerAdapter;-><init>(Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/PickedData;Ljava/lang/String;)V

    .line 471
    new-instance p1, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelConfig;

    move-object v5, v3

    check-cast v5, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelType;

    const/4 v10, 0x0

    const/16 v11, 0x20

    const/4 v12, 0x0

    move-object v4, p1

    move-object v6, v0

    move v8, v2

    move v9, v1

    invoke-direct/range {v4 .. v12}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelConfig;-><init>(Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelType;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/StringPickerAdapter;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 477
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->managerWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Landroidx/fragment/app/FragmentManager;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelFragment$Companion;

    invoke-virtual {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelFragment$Companion;->newInstance(Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelConfig;)Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelFragment;

    move-result-object p1

    move-object v2, p1

    check-cast v2, Landroidx/fragment/app/Fragment;

    const v3, 0x7f080280

    const/4 v4, 0x0

    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType$Side;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType$Side;

    move-object v5, p1

    check-cast v5, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType;

    const/4 v6, 0x4

    const/4 v7, 0x0

    invoke-static/range {v1 .. v7}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationExtensionsKt;->addFragment$default(Landroidx/fragment/app/FragmentManager;Landroidx/fragment/app/Fragment;IZLpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType;ILjava/lang/Object;)V

    :goto_1
    return-void

    .line 466
    :cond_2
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    throw v1

    .line 463
    :cond_3
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    throw v1
.end method
