package powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts;

/* JADX INFO: compiled from: AlarmsCommunicator.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\b\u0010\u000b\u001a\u00020\bH\u0002J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/Gen1AlarmsCommunicator;", "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlarmsCommunicator;", "communicator", "Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;", "(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;)V", "alarmRepeatMap", "", "create", "", androidx.core.app.NotificationCompat.CATEGORY_ALARM, "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/Alarm;", "createDisable", "disableAlarm", "Lio/reactivex/Completable;", "deviceId", "", "enableAlarm", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class Gen1AlarmsCommunicator implements powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlarmsCommunicator {
    private final int[] alarmRepeatMap;
    private final powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator communicator;

    public Gen1AlarmsCommunicator(powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator communicator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(communicator, "communicator");
        this.communicator = communicator;
        this.alarmRepeatMap = new int[]{64, 1, 2, 4, 8, 16, 32};
    }

    private final byte[] create(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.Alarm alarm) {
        int i;
        int offset = java.util.Calendar.getInstance().getTimeZone().getOffset(java.lang.System.currentTimeMillis()) / 60000;
        int hour = alarm.getHour();
        int minute = alarm.getMinute();
        int i2 = hour - (offset / 60);
        if (i2 < 0) {
            i2 += 24;
        }
        int i3 = i2 % 24;
        if (alarm.getRepeat().isEmpty()) {
            i = 128;
        } else {
            int i4 = 0;
            for (java.lang.Integer day : alarm.getRepeat()) {
                int[] iArr = this.alarmRepeatMap;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(day, "day");
                i4 |= iArr[day.intValue()];
            }
            i = i4;
        }
        byte[] bArr = new byte[20];
        int i5 = 0;
        while (true) {
            int i6 = i5 + 1;
            bArr[i5] = 0;
            if (i6 > 19) {
                bArr[0] = -1;
                bArr[1] = 2;
                bArr[2] = 1;
                bArr[3] = 1;
                bArr[4] = -1;
                bArr[5] = -1;
                bArr[6] = -1;
                bArr[7] = (byte) i3;
                bArr[8] = (byte) minute;
                bArr[9] = (byte) i;
                bArr[10] = -1;
                return bArr;
            }
            i5 = i6;
        }
    }

    private final byte[] createDisable() {
        byte[] bArr = new byte[20];
        int i = 0;
        while (true) {
            int i2 = i + 1;
            bArr[i] = 0;
            if (i2 > 19) {
                bArr[0] = -1;
                bArr[1] = 2;
                bArr[2] = 1;
                bArr[3] = 1;
                bArr[4] = -1;
                bArr[5] = -1;
                bArr[6] = -1;
                bArr[7] = -1;
                bArr[8] = -1;
                bArr[9] = 0;
                bArr[10] = -1;
                return bArr;
            }
            i = i2;
        }
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlarmsCommunicator
    public io.reactivex.Completable enableAlarm(final java.lang.String deviceId, final powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.Alarm alarm) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(alarm, "alarm");
        io.reactivex.Completable completableFlatMapCompletable = io.reactivex.Single.create(new io.reactivex.SingleOnSubscribe() { // from class: powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.-$$Lambda$Gen1AlarmsCommunicator$amBDzcfsbuMH2y3ornf3kzmHpt4
            @Override // io.reactivex.SingleOnSubscribe
            public final void subscribe(io.reactivex.SingleEmitter singleEmitter) {
                powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.Gen1AlarmsCommunicator.m3590enableAlarm$lambda0(this.f$0, alarm, singleEmitter);
            }
        }).flatMapCompletable(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.-$$Lambda$Gen1AlarmsCommunicator$ztN9RvARPbQ_FJUMjCruiW94bwg
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.Gen1AlarmsCommunicator.m3591enableAlarm$lambda1(this.f$0, deviceId, (byte[]) obj);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(completableFlatMapCompletable, "create<ByteArray> {\n            it.onSuccess(create(alarm))\n        }.flatMapCompletable {\n            communicator.sendMessage(createMessage(deviceId, it))\n        }");
        return completableFlatMapCompletable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: enableAlarm$lambda-0, reason: not valid java name */
    public static final void m3590enableAlarm$lambda0(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.Gen1AlarmsCommunicator this$0, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.Alarm alarm, io.reactivex.SingleEmitter it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(alarm, "$alarm");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        it.onSuccess(this$0.create(alarm));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: enableAlarm$lambda-1, reason: not valid java name */
    public static final io.reactivex.CompletableSource m3591enableAlarm$lambda1(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.Gen1AlarmsCommunicator this$0, java.lang.String deviceId, byte[] it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceId, "$deviceId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return this$0.communicator.sendMessage(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsLiteCommunicatorKt.createMessage(deviceId, it));
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlarmsCommunicator
    public io.reactivex.Completable disableAlarm(final java.lang.String deviceId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        io.reactivex.Completable completableFlatMapCompletable = io.reactivex.Single.create(new io.reactivex.SingleOnSubscribe() { // from class: powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.-$$Lambda$Gen1AlarmsCommunicator$8efHjWPbJJOhuQRjmERTMWNFnS0
            @Override // io.reactivex.SingleOnSubscribe
            public final void subscribe(io.reactivex.SingleEmitter singleEmitter) {
                powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.Gen1AlarmsCommunicator.m3588disableAlarm$lambda2(this.f$0, singleEmitter);
            }
        }).flatMapCompletable(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.-$$Lambda$Gen1AlarmsCommunicator$YP9F2_XuP7y-bxcK5PyBrWj5nuQ
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.Gen1AlarmsCommunicator.m3589disableAlarm$lambda3(this.f$0, deviceId, (byte[]) obj);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(completableFlatMapCompletable, "create<ByteArray> {\n            it.onSuccess(createDisable())\n        }.flatMapCompletable {\n            communicator.sendMessage(createMessage(deviceId, it))\n        }");
        return completableFlatMapCompletable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: disableAlarm$lambda-2, reason: not valid java name */
    public static final void m3588disableAlarm$lambda2(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.Gen1AlarmsCommunicator this$0, io.reactivex.SingleEmitter it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        it.onSuccess(this$0.createDisable());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: disableAlarm$lambda-3, reason: not valid java name */
    public static final io.reactivex.CompletableSource m3589disableAlarm$lambda3(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.Gen1AlarmsCommunicator this$0, java.lang.String deviceId, byte[] it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceId, "$deviceId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return this$0.communicator.sendMessage(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsLiteCommunicatorKt.createMessage(deviceId, it));
    }
}
