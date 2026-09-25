package powerwatch.matrix.com.pwgen2android.sdk.protocol.executors;

/* JADX INFO: compiled from: SyncProgressChannel.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\r\"\u001d\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0005\"\u001d\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0005\"\u001d\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0005\"\u001d\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0005\"\u001d\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0005¨\u0006\u0010"}, d2 = {"pairConfigPowers", "Lkotlin/Function1;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2CommandIDs;", "", "getPairConfigPowers", "()Lkotlin/jvm/functions/Function1;", "pairConfigPowers2", "getPairConfigPowers2", "pairConfigPowers2Ver3", "getPairConfigPowers2Ver3", "syncConfigPowers2Ver3", "getSyncConfigPowers2Ver3", "syncConfigPowersV2", "getSyncConfigPowersV2", "syncPowers", "getSyncPowers", "app_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
public final class SyncProgressChannelKt {
    private static final kotlin.jvm.functions.Function1<powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2CommandIDs, java.lang.Float> pairConfigPowers2 = new kotlin.jvm.functions.Function1<powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2CommandIDs, java.lang.Float>() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.SyncProgressChannelKt$pairConfigPowers2$1
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ java.lang.Float invoke(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2CommandIDs gen2CommandIDs) {
            return java.lang.Float.valueOf(invoke2(gen2CommandIDs));
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final float invoke2(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2CommandIDs it) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
            if (kotlin.jvm.internal.Intrinsics.areEqual(it, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2CommandIDs.Gen2StartAmDTPCommandId.INSTANCE)) {
                return 0.1f;
            }
            if (kotlin.jvm.internal.Intrinsics.areEqual(it, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2CommandIDs.Gen2GetUserAndGoalsCommandId.INSTANCE)) {
                return 0.3f;
            }
            if (kotlin.jvm.internal.Intrinsics.areEqual(it, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2CommandIDs.Gen2SendUserPrefsAndGoalsCommandId.INSTANCE)) {
                return 0.4f;
            }
            return kotlin.jvm.internal.Intrinsics.areEqual(it, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2CommandIDs.Gen2StopPairingCommandId.INSTANCE) ? 0.2f : 0.0f;
        }
    };
    private static final kotlin.jvm.functions.Function1<powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2CommandIDs, java.lang.Float> syncConfigPowersV2 = new kotlin.jvm.functions.Function1<powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2CommandIDs, java.lang.Float>() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.SyncProgressChannelKt$syncConfigPowersV2$1
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ java.lang.Float invoke(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2CommandIDs gen2CommandIDs) {
            return java.lang.Float.valueOf(invoke2(gen2CommandIDs));
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final float invoke2(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2CommandIDs it) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
            if (kotlin.jvm.internal.Intrinsics.areEqual(it, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2CommandIDs.Gen2StartAmDTPCommandId.INSTANCE) || kotlin.jvm.internal.Intrinsics.areEqual(it, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2CommandIDs.Gen2GetLogCountCommandId.INSTANCE) || kotlin.jvm.internal.Intrinsics.areEqual(it, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2CommandIDs.Gen2GetUserAndGoalsCommandId.INSTANCE) || kotlin.jvm.internal.Intrinsics.areEqual(it, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2CommandIDs.Gen2SendUserPrefsAndGoalsCommandId.INSTANCE) || kotlin.jvm.internal.Intrinsics.areEqual(it, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2CommandIDs.RTLStatusCommandId.INSTANCE) || kotlin.jvm.internal.Intrinsics.areEqual(it, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2CommandIDs.RTLTimeCommandId.INSTANCE) || kotlin.jvm.internal.Intrinsics.areEqual(it, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2CommandIDs.Gen2AccelTraceLogId.INSTANCE)) {
                return 0.025f;
            }
            if (kotlin.jvm.internal.Intrinsics.areEqual(it, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2CommandIDs.Gen2CleanAllLogsCommandId.INSTANCE) || kotlin.jvm.internal.Intrinsics.areEqual(it, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2CommandIDs.Gen2StopAmDTPCommandId.INSTANCE)) {
                return 0.0125f;
            }
            if (kotlin.jvm.internal.Intrinsics.areEqual(it, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2CommandIDs.Gen2ActivityStartLogCommandId.INSTANCE)) {
                return 0.2f;
            }
            if (!kotlin.jvm.internal.Intrinsics.areEqual(it, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2CommandIDs.Gen2ActivityEndLogCommandId.INSTANCE)) {
                if (kotlin.jvm.internal.Intrinsics.areEqual(it, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2CommandIDs.Gen2ActivityDeltaLogCommandId.INSTANCE) || kotlin.jvm.internal.Intrinsics.areEqual(it, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2CommandIDs.Gen2BackgroundLogCommandId.INSTANCE)) {
                    return 0.3f;
                }
                if (!kotlin.jvm.internal.Intrinsics.areEqual(it, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2CommandIDs.Gen2HeaderTraceLogId.INSTANCE)) {
                    return 0.0f;
                }
            }
            return 0.05f;
        }
    };
    private static final kotlin.jvm.functions.Function1<powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2CommandIDs, java.lang.Float> pairConfigPowers = new kotlin.jvm.functions.Function1<powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2CommandIDs, java.lang.Float>() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.SyncProgressChannelKt$pairConfigPowers$1
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ java.lang.Float invoke(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2CommandIDs gen2CommandIDs) {
            return java.lang.Float.valueOf(invoke2(gen2CommandIDs));
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final float invoke2(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2CommandIDs it) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
            if (kotlin.jvm.internal.Intrinsics.areEqual(it, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2CommandIDs.Gen2StartAmDTPCommandId.INSTANCE) || kotlin.jvm.internal.Intrinsics.areEqual(it, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2CommandIDs.Gen2ReceiveUserInformationCommandId.INSTANCE)) {
                return 0.1f;
            }
            if (kotlin.jvm.internal.Intrinsics.areEqual(it, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2CommandIDs.Gen2SendUserInformationCommandId.INSTANCE)) {
                return 0.2f;
            }
            return (kotlin.jvm.internal.Intrinsics.areEqual(it, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2CommandIDs.Gen2SendBiometricsCommandId.INSTANCE) || kotlin.jvm.internal.Intrinsics.areEqual(it, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2CommandIDs.Gen2SendLanguageCommandId.INSTANCE) || kotlin.jvm.internal.Intrinsics.areEqual(it, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2CommandIDs.Gen2ReceiveStepsDistanceGoalsId.INSTANCE) || kotlin.jvm.internal.Intrinsics.areEqual(it, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2CommandIDs.Gen2SendStepsDistanceGoalId.INSTANCE) || kotlin.jvm.internal.Intrinsics.areEqual(it, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2CommandIDs.Gen2SendCaloriesSleepGoalId.INSTANCE) || kotlin.jvm.internal.Intrinsics.areEqual(it, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2CommandIDs.Gen2StopPairingCommandId.INSTANCE)) ? 0.1f : 0.0f;
        }
    };
    private static final kotlin.jvm.functions.Function1<powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2CommandIDs, java.lang.Float> syncPowers = new kotlin.jvm.functions.Function1<powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2CommandIDs, java.lang.Float>() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.SyncProgressChannelKt$syncPowers$1
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ java.lang.Float invoke(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2CommandIDs gen2CommandIDs) {
            return java.lang.Float.valueOf(invoke2(gen2CommandIDs));
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final float invoke2(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2CommandIDs it) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
            if (!kotlin.jvm.internal.Intrinsics.areEqual(it, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2CommandIDs.Gen2StartAmDTPCommandId.INSTANCE) && !kotlin.jvm.internal.Intrinsics.areEqual(it, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2CommandIDs.Gen2ReceiveUserInformationCommandId.INSTANCE) && !kotlin.jvm.internal.Intrinsics.areEqual(it, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2CommandIDs.Gen2SendUserInformationCommandId.INSTANCE) && !kotlin.jvm.internal.Intrinsics.areEqual(it, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2CommandIDs.Gen2SendBiometricsCommandId.INSTANCE)) {
                if (!kotlin.jvm.internal.Intrinsics.areEqual(it, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2CommandIDs.Gen2SendLanguageCommandId.INSTANCE) && !kotlin.jvm.internal.Intrinsics.areEqual(it, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2CommandIDs.Gen2ReceiveStepsDistanceGoalsId.INSTANCE) && !kotlin.jvm.internal.Intrinsics.areEqual(it, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2CommandIDs.Gen2SendStepsDistanceGoalId.INSTANCE) && !kotlin.jvm.internal.Intrinsics.areEqual(it, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2CommandIDs.Gen2SendCaloriesSleepGoalId.INSTANCE) && !kotlin.jvm.internal.Intrinsics.areEqual(it, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2CommandIDs.ReceiveRealTimeCommandId.INSTANCE) && !kotlin.jvm.internal.Intrinsics.areEqual(it, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2CommandIDs.RTLTimeCommandId.INSTANCE)) {
                    if (!kotlin.jvm.internal.Intrinsics.areEqual(it, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2CommandIDs.RTLStatusCommandId.INSTANCE)) {
                        if (kotlin.jvm.internal.Intrinsics.areEqual(it, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2CommandIDs.Gen2ActivityStartLogCommandId.INSTANCE) || kotlin.jvm.internal.Intrinsics.areEqual(it, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2CommandIDs.Gen2ActivityEndLogCommandId.INSTANCE) || kotlin.jvm.internal.Intrinsics.areEqual(it, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2CommandIDs.Gen2ActivityDeltaLogCommandId.INSTANCE) || kotlin.jvm.internal.Intrinsics.areEqual(it, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2CommandIDs.Gen2BackgroundLogCommandId.INSTANCE)) {
                            return 0.1f;
                        }
                        if (!kotlin.jvm.internal.Intrinsics.areEqual(it, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2CommandIDs.Gen2CleanRTLCommandId.INSTANCE) && !kotlin.jvm.internal.Intrinsics.areEqual(it, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2CommandIDs.Gen2CleanActivityLogCommandId.INSTANCE)) {
                            if (!kotlin.jvm.internal.Intrinsics.areEqual(it, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2CommandIDs.Gen2CleanSleepLogCommandId.INSTANCE) && !kotlin.jvm.internal.Intrinsics.areEqual(it, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2CommandIDs.Gen2CleanBackgroundLogCommand.INSTANCE) && !kotlin.jvm.internal.Intrinsics.areEqual(it, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2CommandIDs.Gen2StopAmDTPCommandId.INSTANCE)) {
                                return 0.0f;
                            }
                        }
                    }
                }
                return 0.025f;
            }
            return 0.05f;
        }
    };
    private static final kotlin.jvm.functions.Function1<powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2CommandIDs, java.lang.Float> pairConfigPowers2Ver3 = new kotlin.jvm.functions.Function1<powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2CommandIDs, java.lang.Float>() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.SyncProgressChannelKt$pairConfigPowers2Ver3$1
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ java.lang.Float invoke(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2CommandIDs gen2CommandIDs) {
            return java.lang.Float.valueOf(invoke2(gen2CommandIDs));
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final float invoke2(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2CommandIDs it) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
            if (kotlin.jvm.internal.Intrinsics.areEqual(it, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2CommandIDs.Gen2StartAmDTPCommandId.INSTANCE)) {
                return 0.1f;
            }
            if (kotlin.jvm.internal.Intrinsics.areEqual(it, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2CommandIDs.Gen2GetUserAndGoalsVer3CommandId.INSTANCE)) {
                return 0.3f;
            }
            if (kotlin.jvm.internal.Intrinsics.areEqual(it, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2CommandIDs.Gen2SendUserPrefsAndGoalsVer3CommandId.INSTANCE)) {
                return 0.4f;
            }
            return kotlin.jvm.internal.Intrinsics.areEqual(it, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2CommandIDs.Gen2StopPairingCommandId.INSTANCE) ? 0.2f : 0.0f;
        }
    };
    private static final kotlin.jvm.functions.Function1<powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2CommandIDs, java.lang.Float> syncConfigPowers2Ver3 = new kotlin.jvm.functions.Function1<powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2CommandIDs, java.lang.Float>() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.SyncProgressChannelKt$syncConfigPowers2Ver3$1
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ java.lang.Float invoke(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2CommandIDs gen2CommandIDs) {
            return java.lang.Float.valueOf(invoke2(gen2CommandIDs));
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final float invoke2(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2CommandIDs it) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
            if (kotlin.jvm.internal.Intrinsics.areEqual(it, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2CommandIDs.Gen2StartAmDTPCommandId.INSTANCE) || kotlin.jvm.internal.Intrinsics.areEqual(it, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2CommandIDs.Gen2Ver3GetLogCountCommandId.INSTANCE) || kotlin.jvm.internal.Intrinsics.areEqual(it, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2CommandIDs.Gen2GetUserAndGoalsVer3CommandId.INSTANCE) || kotlin.jvm.internal.Intrinsics.areEqual(it, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2CommandIDs.Gen2SendUserPrefsAndGoalsVer3CommandId.INSTANCE) || kotlin.jvm.internal.Intrinsics.areEqual(it, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2CommandIDs.RTLStatusCommandId.INSTANCE) || kotlin.jvm.internal.Intrinsics.areEqual(it, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2CommandIDs.RTLTimeCommandId.INSTANCE)) {
                return 0.025f;
            }
            if (kotlin.jvm.internal.Intrinsics.areEqual(it, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2CommandIDs.Gen2ActivityDeltaLogVer3CommandId.INSTANCE) || kotlin.jvm.internal.Intrinsics.areEqual(it, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2CommandIDs.Gen2BackgroundLogCommandId.INSTANCE)) {
                return 0.3f;
            }
            return (kotlin.jvm.internal.Intrinsics.areEqual(it, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2CommandIDs.Gen2CleanAllLogsCommandId.INSTANCE) || kotlin.jvm.internal.Intrinsics.areEqual(it, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2CommandIDs.Gen2StopAmDTPCommandId.INSTANCE)) ? 0.125f : 0.0f;
        }
    };

    public static final kotlin.jvm.functions.Function1<powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2CommandIDs, java.lang.Float> getPairConfigPowers2() {
        return pairConfigPowers2;
    }

    public static final kotlin.jvm.functions.Function1<powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2CommandIDs, java.lang.Float> getSyncConfigPowersV2() {
        return syncConfigPowersV2;
    }

    public static final kotlin.jvm.functions.Function1<powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2CommandIDs, java.lang.Float> getPairConfigPowers() {
        return pairConfigPowers;
    }

    public static final kotlin.jvm.functions.Function1<powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2CommandIDs, java.lang.Float> getSyncPowers() {
        return syncPowers;
    }

    public static final kotlin.jvm.functions.Function1<powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2CommandIDs, java.lang.Float> getPairConfigPowers2Ver3() {
        return pairConfigPowers2Ver3;
    }

    public static final kotlin.jvm.functions.Function1<powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2CommandIDs, java.lang.Float> getSyncConfigPowers2Ver3() {
        return syncConfigPowers2Ver3;
    }
}
