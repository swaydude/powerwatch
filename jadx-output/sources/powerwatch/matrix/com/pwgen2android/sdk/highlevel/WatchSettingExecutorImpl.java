package powerwatch.matrix.com.pwgen2android.sdk.highlevel;

/* JADX INFO: compiled from: WatchSettingsExecutor.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J(\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00172\u0016\u0010\u0018\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u001a\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u0019H\u0002J\u0010\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u0010\u0010\u001f\u001a\u00020\u00122\u0006\u0010 \u001a\u00020!H\u0016J\u0010\u0010\"\u001a\u00020\u00122\u0006\u0010#\u001a\u00020$H\u0016J\u0010\u0010%\u001a\u00020\u00122\u0006\u0010&\u001a\u00020'H\u0016J\u0010\u0010(\u001a\u00020\u00122\u0006\u0010)\u001a\u00020*H\u0016J\u0010\u0010+\u001a\u00020\u00122\u0006\u0010)\u001a\u00020,H\u0016J\u0010\u0010-\u001a\u00020\u00122\u0006\u0010.\u001a\u00020/H\u0016J\u0010\u00100\u001a\u00020\u00122\u0006\u00101\u001a\u000202H\u0016J\u0010\u00103\u001a\u00020\u00122\u0006\u00104\u001a\u000205H\u0016J\u0010\u00106\u001a\u00020\u00122\u0006\u00107\u001a\u000208H\u0016J\u0010\u00109\u001a\u00020\u00122\u0006\u0010:\u001a\u00020;H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006<"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingExecutorImpl;", "Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingsExecutor;", "communicator", "Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;", "deviceCommunicationQueuer", "Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;", "settingsDataRepository", "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/SettingsDataRepository;", "(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/SettingsDataRepository;)V", "getCommunicator", "()Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;", "getDeviceCommunicationQueuer", "()Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;", "getSettingsDataRepository", "()Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/SettingsDataRepository;", "settingsExecutor", "Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/SettingsExecutor;", "resetWatch", "Lio/reactivex/Completable;", "resetMode", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/ResetMode;", "sendCommand", "gen2Command", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;", "vv", "Lkotlin/Function1;", "Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;", "", "setAlarm", "alarmData", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/AlarmData;", "setAlert", "alertMode", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/AlertMode;", "setBLEDisconnectionAlert", "bleAlertMode", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/BLEAlertMode;", "setBackLightDuration", "duration", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/BackLightDuration;", "setBackLightMode", "mode", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/BackLightMode;", "setDNDMode", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/DNDMode;", "setGPSUpdateRate", "gpsUpdateRate", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/GPSUpdateRate;", "setHomeScreenMode", "homeScreenMode", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/HomeScreenMode;", "setPopupDuration", "popupDuration", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/PopupDuration;", "setRingtone", "ringtoneMode", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/RingtoneMode;", "setTimer", "timerData", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/TimerData;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class WatchSettingExecutorImpl implements powerwatch.matrix.com.pwgen2android.sdk.highlevel.WatchSettingsExecutor {
    private final powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator communicator;
    private final powerwatch.matrix.com.pwgen2android.sdk.DeviceCommunicationQueuer deviceCommunicationQueuer;
    private final powerwatch.matrix.com.pwgen2android.shared.data.providers.SettingsDataRepository settingsDataRepository;
    private final powerwatch.matrix.com.pwgen2android.sdk.highlevel.SettingsExecutor settingsExecutor;

    public WatchSettingExecutorImpl(powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator communicator, powerwatch.matrix.com.pwgen2android.sdk.DeviceCommunicationQueuer deviceCommunicationQueuer, powerwatch.matrix.com.pwgen2android.shared.data.providers.SettingsDataRepository settingsDataRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(communicator, "communicator");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceCommunicationQueuer, "deviceCommunicationQueuer");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(settingsDataRepository, "settingsDataRepository");
        this.communicator = communicator;
        this.deviceCommunicationQueuer = deviceCommunicationQueuer;
        this.settingsDataRepository = settingsDataRepository;
        this.settingsExecutor = new powerwatch.matrix.com.pwgen2android.sdk.highlevel.SettingsExecutor(communicator, deviceCommunicationQueuer);
    }

    public final powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator getCommunicator() {
        return this.communicator;
    }

    public final powerwatch.matrix.com.pwgen2android.sdk.DeviceCommunicationQueuer getDeviceCommunicationQueuer() {
        return this.deviceCommunicationQueuer;
    }

    public final powerwatch.matrix.com.pwgen2android.shared.data.providers.SettingsDataRepository getSettingsDataRepository() {
        return this.settingsDataRepository;
    }

    private final io.reactivex.Completable sendCommand(final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2Command gen2Command, final kotlin.jvm.functions.Function1<? super powerwatch.matrix.com.pwgen2android.sdk.SettingsData, kotlin.Unit> vv) {
        io.reactivex.Completable completableDoOnComplete = io.reactivex.Maybe.create(new io.reactivex.MaybeOnSubscribe() { // from class: powerwatch.matrix.com.pwgen2android.sdk.highlevel.-$$Lambda$WatchSettingExecutorImpl$DiJq2Y8RbfXdqyJ49ExkBqRiDjM
            @Override // io.reactivex.MaybeOnSubscribe
            public final void subscribe(io.reactivex.MaybeEmitter maybeEmitter) {
                powerwatch.matrix.com.pwgen2android.sdk.highlevel.WatchSettingExecutorImpl.m2290sendCommand$lambda0(this.f$0, maybeEmitter);
            }
        }).flatMapCompletable(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.highlevel.-$$Lambda$WatchSettingExecutorImpl$AYo7FEHigmZu1HMkAUfVXBcUCCg
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.highlevel.WatchSettingExecutorImpl.m2291sendCommand$lambda1(this.f$0, gen2Command, (java.lang.String) obj);
            }
        }).doOnComplete(new io.reactivex.functions.Action() { // from class: powerwatch.matrix.com.pwgen2android.sdk.highlevel.-$$Lambda$WatchSettingExecutorImpl$6aDAafsh_ZQdhgnL4hvs8vFAw_E
            @Override // io.reactivex.functions.Action
            public final void run() {
                powerwatch.matrix.com.pwgen2android.sdk.highlevel.WatchSettingExecutorImpl.m2292sendCommand$lambda2(this.f$0, vv);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(completableDoOnComplete, "create<String> {\n            val deviceID = communicator.defaultConnectedDevice()?.uid\n            if (deviceID == null) it.onError(Throwable(\"Device not connected\"))\n            else it.onSuccess(deviceID)\n        }.flatMapCompletable {\n            settingsExecutor.sendSettingCommand(it, gen2Command)\n        }.doOnComplete {\n            val deviceID = communicator.defaultConnectedDevice()?.uid\n            if (deviceID != null && vv != null) {\n                val data = settingsDataRepository.loadSettings(deviceID)\n                vv.invoke(data)\n                settingsDataRepository.saveSettings(deviceID, data)\n            }\n        }");
        return completableDoOnComplete;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: sendCommand$lambda-0, reason: not valid java name */
    public static final void m2290sendCommand$lambda0(powerwatch.matrix.com.pwgen2android.sdk.highlevel.WatchSettingExecutorImpl this$0, io.reactivex.MaybeEmitter it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo deviceInfoDefaultConnectedDevice = this$0.getCommunicator().defaultConnectedDevice();
        java.lang.String uid = deviceInfoDefaultConnectedDevice == null ? null : deviceInfoDefaultConnectedDevice.getUid();
        if (uid == null) {
            it.onError(new java.lang.Throwable("Device not connected"));
        } else {
            it.onSuccess(uid);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: sendCommand$lambda-1, reason: not valid java name */
    public static final io.reactivex.CompletableSource m2291sendCommand$lambda1(powerwatch.matrix.com.pwgen2android.sdk.highlevel.WatchSettingExecutorImpl this$0, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2Command gen2Command, java.lang.String it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gen2Command, "$gen2Command");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return this$0.settingsExecutor.sendSettingCommand(it, gen2Command);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: sendCommand$lambda-2, reason: not valid java name */
    public static final void m2292sendCommand$lambda2(powerwatch.matrix.com.pwgen2android.sdk.highlevel.WatchSettingExecutorImpl this$0, kotlin.jvm.functions.Function1 function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo deviceInfoDefaultConnectedDevice = this$0.getCommunicator().defaultConnectedDevice();
        java.lang.String uid = deviceInfoDefaultConnectedDevice == null ? null : deviceInfoDefaultConnectedDevice.getUid();
        if (uid == null || function1 == null) {
            return;
        }
        powerwatch.matrix.com.pwgen2android.sdk.SettingsData settingsDataLoadSettings = this$0.getSettingsDataRepository().loadSettings(uid);
        function1.invoke(settingsDataLoadSettings);
        this$0.getSettingsDataRepository().saveSettings(uid, settingsDataLoadSettings);
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.highlevel.WatchSettingsExecutor
    public io.reactivex.Completable setDNDMode(final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.DNDMode mode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mode, "mode");
        return sendCommand(new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.DNDGen2Command(mode), new kotlin.jvm.functions.Function1<powerwatch.matrix.com.pwgen2android.sdk.SettingsData, kotlin.Unit>() { // from class: powerwatch.matrix.com.pwgen2android.sdk.highlevel.WatchSettingExecutorImpl.setDNDMode.1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(powerwatch.matrix.com.pwgen2android.sdk.SettingsData settingsData) {
                invoke2(settingsData);
                return kotlin.Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(powerwatch.matrix.com.pwgen2android.sdk.SettingsData settingsData) {
                if (settingsData == null) {
                    return;
                }
                settingsData.setDnd(mode.getMode());
            }
        });
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.highlevel.WatchSettingsExecutor
    public io.reactivex.Completable setBackLightMode(final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.BackLightMode mode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mode, "mode");
        return sendCommand(new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.Gen2BackLightCommand(mode), new kotlin.jvm.functions.Function1<powerwatch.matrix.com.pwgen2android.sdk.SettingsData, kotlin.Unit>() { // from class: powerwatch.matrix.com.pwgen2android.sdk.highlevel.WatchSettingExecutorImpl.setBackLightMode.1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(powerwatch.matrix.com.pwgen2android.sdk.SettingsData settingsData) {
                invoke2(settingsData);
                return kotlin.Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(powerwatch.matrix.com.pwgen2android.sdk.SettingsData settingsData) {
                if (settingsData == null) {
                    return;
                }
                settingsData.setBackLight(mode.getMode());
            }
        });
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.highlevel.WatchSettingsExecutor
    public io.reactivex.Completable setBackLightDuration(final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.BackLightDuration duration) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(duration, "duration");
        return sendCommand(new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.Gen2BackLightDurationCommand(duration), new kotlin.jvm.functions.Function1<powerwatch.matrix.com.pwgen2android.sdk.SettingsData, kotlin.Unit>() { // from class: powerwatch.matrix.com.pwgen2android.sdk.highlevel.WatchSettingExecutorImpl.setBackLightDuration.1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(powerwatch.matrix.com.pwgen2android.sdk.SettingsData settingsData) {
                invoke2(settingsData);
                return kotlin.Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(powerwatch.matrix.com.pwgen2android.sdk.SettingsData settingsData) {
                if (settingsData == null) {
                    return;
                }
                settingsData.setBackLightDuration(duration.getDuration());
            }
        });
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.highlevel.WatchSettingsExecutor
    public io.reactivex.Completable setPopupDuration(final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.PopupDuration popupDuration) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(popupDuration, "popupDuration");
        return sendCommand(new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.Gen2PopupDurationCommand(popupDuration), new kotlin.jvm.functions.Function1<powerwatch.matrix.com.pwgen2android.sdk.SettingsData, kotlin.Unit>() { // from class: powerwatch.matrix.com.pwgen2android.sdk.highlevel.WatchSettingExecutorImpl.setPopupDuration.1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(powerwatch.matrix.com.pwgen2android.sdk.SettingsData settingsData) {
                invoke2(settingsData);
                return kotlin.Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(powerwatch.matrix.com.pwgen2android.sdk.SettingsData settingsData) {
                if (settingsData == null) {
                    return;
                }
                settingsData.setPopupDuration(popupDuration.getMode());
            }
        });
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.highlevel.WatchSettingsExecutor
    public io.reactivex.Completable setGPSUpdateRate(final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.GPSUpdateRate gpsUpdateRate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gpsUpdateRate, "gpsUpdateRate");
        return sendCommand(new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.Gen2GPSUpdateRateCommand(gpsUpdateRate), new kotlin.jvm.functions.Function1<powerwatch.matrix.com.pwgen2android.sdk.SettingsData, kotlin.Unit>() { // from class: powerwatch.matrix.com.pwgen2android.sdk.highlevel.WatchSettingExecutorImpl.setGPSUpdateRate.1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(powerwatch.matrix.com.pwgen2android.sdk.SettingsData settingsData) {
                invoke2(settingsData);
                return kotlin.Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(powerwatch.matrix.com.pwgen2android.sdk.SettingsData settingsData) {
                if (settingsData == null) {
                    return;
                }
                settingsData.setGpsUpdateRate(gpsUpdateRate.getRate());
            }
        });
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.highlevel.WatchSettingsExecutor
    public io.reactivex.Completable setHomeScreenMode(final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.HomeScreenMode homeScreenMode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(homeScreenMode, "homeScreenMode");
        return sendCommand(new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.Gen2HomeScreenCommand(homeScreenMode), new kotlin.jvm.functions.Function1<powerwatch.matrix.com.pwgen2android.sdk.SettingsData, kotlin.Unit>() { // from class: powerwatch.matrix.com.pwgen2android.sdk.highlevel.WatchSettingExecutorImpl.setHomeScreenMode.1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(powerwatch.matrix.com.pwgen2android.sdk.SettingsData settingsData) {
                invoke2(settingsData);
                return kotlin.Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(powerwatch.matrix.com.pwgen2android.sdk.SettingsData settingsData) {
                if (settingsData == null) {
                    return;
                }
                settingsData.setHomeScreen(homeScreenMode.getMode());
            }
        });
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.highlevel.WatchSettingsExecutor
    public io.reactivex.Completable setBLEDisconnectionAlert(final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.BLEAlertMode bleAlertMode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bleAlertMode, "bleAlertMode");
        return sendCommand(new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.Gen2BLEDisconnectionAlertCommand(bleAlertMode), new kotlin.jvm.functions.Function1<powerwatch.matrix.com.pwgen2android.sdk.SettingsData, kotlin.Unit>() { // from class: powerwatch.matrix.com.pwgen2android.sdk.highlevel.WatchSettingExecutorImpl.setBLEDisconnectionAlert.1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(powerwatch.matrix.com.pwgen2android.sdk.SettingsData settingsData) {
                invoke2(settingsData);
                return kotlin.Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(powerwatch.matrix.com.pwgen2android.sdk.SettingsData settingsData) {
                if (settingsData == null) {
                    return;
                }
                settingsData.setBleDisconnect(bleAlertMode.getMode());
            }
        });
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.highlevel.WatchSettingsExecutor
    public io.reactivex.Completable setRingtone(final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.RingtoneMode ringtoneMode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ringtoneMode, "ringtoneMode");
        return sendCommand(new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.Gen2RingtoneCommand(ringtoneMode), new kotlin.jvm.functions.Function1<powerwatch.matrix.com.pwgen2android.sdk.SettingsData, kotlin.Unit>() { // from class: powerwatch.matrix.com.pwgen2android.sdk.highlevel.WatchSettingExecutorImpl.setRingtone.1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(powerwatch.matrix.com.pwgen2android.sdk.SettingsData settingsData) {
                invoke2(settingsData);
                return kotlin.Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(powerwatch.matrix.com.pwgen2android.sdk.SettingsData settingsData) {
                if (settingsData == null) {
                    return;
                }
                settingsData.setRingtone(ringtoneMode.getMode());
            }
        });
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.highlevel.WatchSettingsExecutor
    public io.reactivex.Completable setAlert(final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.AlertMode alertMode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(alertMode, "alertMode");
        return sendCommand(new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.Gen2AlertCommand(alertMode), new kotlin.jvm.functions.Function1<powerwatch.matrix.com.pwgen2android.sdk.SettingsData, kotlin.Unit>() { // from class: powerwatch.matrix.com.pwgen2android.sdk.highlevel.WatchSettingExecutorImpl.setAlert.1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(powerwatch.matrix.com.pwgen2android.sdk.SettingsData settingsData) {
                invoke2(settingsData);
                return kotlin.Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(powerwatch.matrix.com.pwgen2android.sdk.SettingsData settingsData) {
                if (settingsData == null) {
                    return;
                }
                settingsData.setAlert(alertMode.getMode());
            }
        });
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.highlevel.WatchSettingsExecutor
    public io.reactivex.Completable resetWatch(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.ResetMode resetMode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resetMode, "resetMode");
        return sendCommand(new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.Gen2ResetCommand(resetMode), null);
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.highlevel.WatchAlarmTimerSettingExecutor
    public io.reactivex.Completable setAlarm(final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.AlarmData alarmData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(alarmData, "alarmData");
        return sendCommand(new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.Gen2AlarmCommand(alarmData), new kotlin.jvm.functions.Function1<powerwatch.matrix.com.pwgen2android.sdk.SettingsData, kotlin.Unit>() { // from class: powerwatch.matrix.com.pwgen2android.sdk.highlevel.WatchSettingExecutorImpl.setAlarm.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(powerwatch.matrix.com.pwgen2android.sdk.SettingsData settingsData) {
                invoke2(settingsData);
                return kotlin.Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(powerwatch.matrix.com.pwgen2android.sdk.SettingsData settingsData) {
                powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo deviceInfoDefaultConnectedDevice = powerwatch.matrix.com.pwgen2android.sdk.highlevel.WatchSettingExecutorImpl.this.getCommunicator().defaultConnectedDevice();
                java.lang.String uid = deviceInfoDefaultConnectedDevice == null ? null : deviceInfoDefaultConnectedDevice.getUid();
                if (uid != null) {
                    powerwatch.matrix.com.pwgen2android.sdk.highlevel.WatchSettingExecutorImpl.this.getSettingsDataRepository().saveAlarm(uid, alarmData);
                }
            }
        });
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.highlevel.WatchAlarmTimerSettingExecutor
    public io.reactivex.Completable setTimer(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.TimerData timerData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timerData, "timerData");
        return sendCommand(new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.Gen2TimerCommand(timerData), new kotlin.jvm.functions.Function1<powerwatch.matrix.com.pwgen2android.sdk.SettingsData, kotlin.Unit>() { // from class: powerwatch.matrix.com.pwgen2android.sdk.highlevel.WatchSettingExecutorImpl.setTimer.1
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(powerwatch.matrix.com.pwgen2android.sdk.SettingsData settingsData) {
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(powerwatch.matrix.com.pwgen2android.sdk.SettingsData settingsData) {
                invoke2(settingsData);
                return kotlin.Unit.INSTANCE;
            }
        });
    }
}
