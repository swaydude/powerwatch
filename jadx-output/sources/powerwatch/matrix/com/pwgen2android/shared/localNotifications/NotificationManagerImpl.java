package powerwatch.matrix.com.pwgen2android.shared.localNotifications;

/* JADX INFO: compiled from: NotificationManager.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 '2\u00020\u0001:\u0001'B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0018\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u000eH\u0016J\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J(\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\nH\u0016J\"\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\n2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J(\u0010!\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\nH\u0016J\u0010\u0010\"\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0018\u0010#\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010$\u001a\u00020\u000eH\u0016J\u0010\u0010%\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J(\u0010&\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\nH\u0016R\u000e\u0010\t\u001a\u00020\nX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\nX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082D¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/localNotifications/NotificationManagerImpl;", "Lpowerwatch/matrix/com/pwgen2android/shared/localNotifications/NotificationManager;", "connectionNotificationPersistence", "Lpowerwatch/matrix/com/pwgen2android/main/notification/ConnectionNotificationPersistence;", "batteryNotificationPersistence", "Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryNotificationPersistence;", "goalsNotificationPersistence", "Lpowerwatch/matrix/com/pwgen2android/main/notification/GoalsNotificationPersistence;", "(Lpowerwatch/matrix/com/pwgen2android/main/notification/ConnectionNotificationPersistence;Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryNotificationPersistence;Lpowerwatch/matrix/com/pwgen2android/main/notification/GoalsNotificationPersistence;)V", "BATTERY_CHANNEL", "", "GOALS_CHANNEL", "PHONE_CONNECT_CHANNEL", "batteryNotificationID", "", "watchConnectionID", "dismissBatteryNotification", "", "context", "Landroid/content/Context;", "dismissNotification", "notificationID", "getNotificationIntent", "Landroid/app/PendingIntent;", "notificationIntent", "Landroid/content/Intent;", "showBatteryNotification", "deviceID", io.fabric.sdk.android.services.settings.SettingsJsonConstants.PROMPT_TITLE_KEY, io.fabric.sdk.android.services.settings.SettingsJsonConstants.PROMPT_MESSAGE_KEY, "showConnectionNotification", "realtimeDataNotification", "Lpowerwatch/matrix/com/pwgen2android/shared/localNotifications/UIRealtimeDataNotification;", "showGoalsAchievedMessage", "showOTAFailedNotification", "showOTAProgressNotification", androidx.core.app.NotificationCompat.CATEGORY_PROGRESS, "showOTASuccessNotification", "showWatchConnectedMessage", "Companion", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class NotificationManagerImpl implements powerwatch.matrix.com.pwgen2android.shared.localNotifications.NotificationManager {
    private static final int MAX_PROGRESS = 100;
    private static final int MIN_PROGRESS = 0;
    private final java.lang.String BATTERY_CHANNEL;
    private final java.lang.String GOALS_CHANNEL;
    private final java.lang.String PHONE_CONNECT_CHANNEL;
    private final int batteryNotificationID;
    private final powerwatch.matrix.com.pwgen2android.main.battery.BatteryNotificationPersistence batteryNotificationPersistence;
    private final powerwatch.matrix.com.pwgen2android.main.notification.ConnectionNotificationPersistence connectionNotificationPersistence;
    private final powerwatch.matrix.com.pwgen2android.main.notification.GoalsNotificationPersistence goalsNotificationPersistence;
    private final int watchConnectionID;

    public NotificationManagerImpl(powerwatch.matrix.com.pwgen2android.main.notification.ConnectionNotificationPersistence connectionNotificationPersistence, powerwatch.matrix.com.pwgen2android.main.battery.BatteryNotificationPersistence batteryNotificationPersistence, powerwatch.matrix.com.pwgen2android.main.notification.GoalsNotificationPersistence goalsNotificationPersistence) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connectionNotificationPersistence, "connectionNotificationPersistence");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(batteryNotificationPersistence, "batteryNotificationPersistence");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(goalsNotificationPersistence, "goalsNotificationPersistence");
        this.connectionNotificationPersistence = connectionNotificationPersistence;
        this.batteryNotificationPersistence = batteryNotificationPersistence;
        this.goalsNotificationPersistence = goalsNotificationPersistence;
        this.batteryNotificationID = powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitAuth.AUTH_CODE;
        this.watchConnectionID = 2233;
        this.GOALS_CHANNEL = "goals_notifications";
        this.BATTERY_CHANNEL = "battery_channel";
        this.PHONE_CONNECT_CHANNEL = "phone_connection_channel";
    }

    private final android.app.PendingIntent getNotificationIntent(android.content.Context context, android.content.Intent notificationIntent) {
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            android.app.PendingIntent activity = android.app.PendingIntent.getActivity(context, 0, notificationIntent, 33554432);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(activity, "{\n            PendingIntent.getActivity(context, 0, notificationIntent,\n                FLAG_MUTABLE)\n        }");
            return activity;
        }
        android.app.PendingIntent activity2 = android.app.PendingIntent.getActivity(context, 0, notificationIntent, 0);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(activity2, "{\n            PendingIntent.getActivity(context, 0, notificationIntent, 0)\n        }");
        return activity2;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.localNotifications.NotificationManager
    public void showConnectionNotification(android.content.Context context, java.lang.String title, powerwatch.matrix.com.pwgen2android.shared.localNotifications.UIRealtimeDataNotification realtimeDataNotification) {
        android.app.Notification.Builder builder;
        android.app.Notification.Builder priority;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "title");
        android.widget.RemoteViews remoteViews = new android.widget.RemoteViews(context.getApplicationInfo().packageName, powerwatch.matrix.com.pwgen2android.R.layout.connection_notification);
        if (realtimeDataNotification != null) {
            remoteViews.setCharSequence(powerwatch.matrix.com.pwgen2android.R.id.notification_steps, "setText", realtimeDataNotification.getSteps());
            remoteViews.setCharSequence(powerwatch.matrix.com.pwgen2android.R.id.steps_label, "setText", powerwatch.matrix.com.pwgen2android.shared.localNotifications.NotificationManagerKt.getSteps());
            remoteViews.setCharSequence(powerwatch.matrix.com.pwgen2android.R.id.notification_calories, "setText", realtimeDataNotification.getCalories().getFirst());
            remoteViews.setCharSequence(powerwatch.matrix.com.pwgen2android.R.id.notification_calories_unit, "setText", realtimeDataNotification.getCalories().getSecond());
            remoteViews.setCharSequence(powerwatch.matrix.com.pwgen2android.R.id.notification_distance, "setText", realtimeDataNotification.getDistance().getFirst());
            remoteViews.setCharSequence(powerwatch.matrix.com.pwgen2android.R.id.notification_distance_unit, "setText", realtimeDataNotification.getDistance().getSecond());
            remoteViews.setCharSequence(powerwatch.matrix.com.pwgen2android.R.id.notification_heart_rate, "setText", realtimeDataNotification.getHeartRate());
        }
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) powerwatch.matrix.com.pwgen2android.main.MainActivity.class);
        intent.setFlags(536870912);
        android.app.PendingIntent notificationIntent = getNotificationIntent(context, intent);
        new android.content.Intent(context, (java.lang.Class<?>) powerwatch.matrix.com.pwgen2android.sdk.ConnectionForegroundService.class).setAction(powerwatch.matrix.com.pwgen2android.sdk.ConnectionForegroundService.INSTANCE.getDISCONNECT_ACTION());
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            builder = new android.app.Notification.Builder(context, powerwatch.matrix.com.pwgen2android.sdk.ConnectionForegroundService.INSTANCE.getNOTIFICATION_CHANNEL_ID());
        } else {
            builder = new android.app.Notification.Builder(context);
        }
        android.app.Notification.Builder contentIntent = builder.setSmallIcon(powerwatch.matrix.com.pwgen2android.R.mipmap.app_icon_notif).setOngoing(true).setContentIntent(notificationIntent);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(contentIntent, "phoneNotificationBuilder\n                .setSmallIcon(R.mipmap.app_icon_notif)\n                .setOngoing(true)\n                .setContentIntent(pendingIntent)");
        if (android.os.Build.VERSION.SDK_INT >= 24) {
            priority = contentIntent.setCustomContentView(remoteViews).setStyle(new android.app.Notification.DecoratedCustomViewStyle());
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(priority, "notificationBuilder.setCustomContentView(notificationLayout)\n                    .setStyle(Notification.DecoratedCustomViewStyle())");
        } else {
            priority = contentIntent.setContent(remoteViews).setPriority(-1);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(priority, "notificationBuilder.setContent(notificationLayout)\n                    .setPriority(Notification.PRIORITY_LOW)");
        }
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            android.app.NotificationChannel notificationChannel = new android.app.NotificationChannel(powerwatch.matrix.com.pwgen2android.sdk.ConnectionForegroundService.INSTANCE.getNOTIFICATION_CHANNEL_ID(), "Notification channel name", 2);
            notificationChannel.setDescription("Notification channel desc");
            notificationChannel.setShowBadge(false);
            java.lang.Object systemService = context.getSystemService("notification");
            java.util.Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
            ((android.app.NotificationManager) systemService).createNotificationChannel(notificationChannel);
        }
        android.content.Intent intent2 = new android.content.Intent(context, (java.lang.Class<?>) powerwatch.matrix.com.pwgen2android.sdk.ConnectionForegroundService.class);
        intent2.putExtra(powerwatch.matrix.com.pwgen2android.sdk.ConnectionForegroundService.INSTANCE.getNOTIFICATION_EXTRA(), priority.build());
        powerwatch.matrix.com.pwgen2android.sdk.ConnectionForegroundService.INSTANCE.start(context, intent2);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.localNotifications.NotificationManager
    public void showOTASuccessNotification(android.content.Context context) {
        android.app.Notification.Builder builder;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) powerwatch.matrix.com.pwgen2android.main.MainActivity.class);
        intent.setFlags(536870912);
        android.app.PendingIntent notificationIntent = getNotificationIntent(context, intent);
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            builder = new android.app.Notification.Builder(context, powerwatch.matrix.com.pwgen2android.sdk.ConnectionForegroundService.INSTANCE.getNOTIFICATION_CHANNEL_ID());
        } else {
            builder = new android.app.Notification.Builder(context);
        }
        android.app.Notification notificationBuild = builder.setSmallIcon(powerwatch.matrix.com.pwgen2android.R.drawable.paired_success).setContentTitle("PowerWatch").setContentText("PowerWatch successfully updated.").setContentIntent(notificationIntent).setAutoCancel(true).build();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(notificationBuild, "phoneNotificationBuilder\n                .setSmallIcon(R.drawable.paired_success)\n                .setContentTitle(\"PowerWatch\")\n                .setContentText(\"PowerWatch successfully updated.\")\n                .setContentIntent(pendingIntent)\n                .setAutoCancel(true)\n                .build()");
        android.content.Intent intent2 = new android.content.Intent(context, (java.lang.Class<?>) powerwatch.matrix.com.pwgen2android.sdk.ConnectionForegroundService.class);
        intent2.putExtra(powerwatch.matrix.com.pwgen2android.sdk.ConnectionForegroundService.INSTANCE.getNOTIFICATION_EXTRA(), notificationBuild);
        powerwatch.matrix.com.pwgen2android.sdk.ConnectionForegroundService.INSTANCE.start(context, intent2);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.localNotifications.NotificationManager
    public void showOTAProgressNotification(android.content.Context context, int progress) {
        android.app.Notification.Builder builder;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) powerwatch.matrix.com.pwgen2android.main.MainActivity.class);
        intent.setFlags(536870912);
        android.app.PendingIntent notificationIntent = getNotificationIntent(context, intent);
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            builder = new android.app.Notification.Builder(context, powerwatch.matrix.com.pwgen2android.sdk.ConnectionForegroundService.INSTANCE.getNOTIFICATION_CHANNEL_ID());
        } else {
            builder = new android.app.Notification.Builder(context);
        }
        android.app.Notification notificationBuild = builder.setSmallIcon(powerwatch.matrix.com.pwgen2android.R.mipmap.app_icon_notif).setContentTitle("PowerWatch").setContentText("Your watch is updating...").setContentIntent(notificationIntent).setAutoCancel(false).setOngoing(true).setProgress(MAX_PROGRESS, progress, false).build();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(notificationBuild, "phoneNotificationBuilder\n                .setSmallIcon(R.mipmap.app_icon_notif)\n                .setContentTitle(\"PowerWatch\")\n                .setContentText(\"Your watch is updating...\")\n                .setContentIntent(pendingIntent)\n                .setAutoCancel(false)\n                .setOngoing(true)\n                .setProgress(MAX_PROGRESS, progress, false)\n                .build()");
        android.content.Intent intent2 = new android.content.Intent(context, (java.lang.Class<?>) powerwatch.matrix.com.pwgen2android.sdk.ConnectionForegroundService.class);
        intent2.putExtra(powerwatch.matrix.com.pwgen2android.sdk.ConnectionForegroundService.INSTANCE.getNOTIFICATION_EXTRA(), notificationBuild);
        powerwatch.matrix.com.pwgen2android.sdk.ConnectionForegroundService.INSTANCE.start(context, intent2);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.localNotifications.NotificationManager
    public void dismissNotification(android.content.Context context, int notificationID) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        powerwatch.matrix.com.pwgen2android.sdk.ConnectionForegroundService.INSTANCE.stop(context);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.localNotifications.NotificationManager
    public void showOTAFailedNotification(android.content.Context context) {
        android.app.Notification.Builder builder;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) powerwatch.matrix.com.pwgen2android.main.MainActivity.class);
        intent.setFlags(536870912);
        android.app.PendingIntent notificationIntent = getNotificationIntent(context, intent);
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            builder = new android.app.Notification.Builder(context, powerwatch.matrix.com.pwgen2android.sdk.ConnectionForegroundService.INSTANCE.getNOTIFICATION_CHANNEL_ID());
        } else {
            builder = new android.app.Notification.Builder(context);
        }
        android.app.Notification notificationBuild = builder.setSmallIcon(powerwatch.matrix.com.pwgen2android.R.mipmap.icon_cross_red).setContentTitle("PowerWatch").setContentText("Firmware update failed.").setContentIntent(notificationIntent).setAutoCancel(true).build();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(notificationBuild, "phoneNotificationBuilder.setSmallIcon(R.mipmap.icon_cross_red)\n                .setContentTitle(\"PowerWatch\")\n                .setContentText(\"Firmware update failed.\")\n                .setContentIntent(pendingIntent)\n                .setAutoCancel(true)\n                .build()");
        android.content.Intent intent2 = new android.content.Intent(context, (java.lang.Class<?>) powerwatch.matrix.com.pwgen2android.sdk.ConnectionForegroundService.class);
        intent2.putExtra(powerwatch.matrix.com.pwgen2android.sdk.ConnectionForegroundService.INSTANCE.getNOTIFICATION_EXTRA(), notificationBuild);
        powerwatch.matrix.com.pwgen2android.sdk.ConnectionForegroundService.INSTANCE.start(context, intent2);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.localNotifications.NotificationManager
    public void showBatteryNotification(java.lang.String deviceID, android.content.Context context, java.lang.String title, java.lang.String message) {
        android.app.Notification.Builder builder;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceID, "deviceID");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "title");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        if (this.batteryNotificationPersistence.isBatteryNotificationEnabled(deviceID)) {
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) powerwatch.matrix.com.pwgen2android.main.MainActivity.class);
            intent.setFlags(536870912);
            android.app.PendingIntent notificationIntent = getNotificationIntent(context, intent);
            java.lang.Object systemService = context.getSystemService("notification");
            java.util.Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
            android.app.NotificationManager notificationManager = (android.app.NotificationManager) systemService;
            if (android.os.Build.VERSION.SDK_INT >= 26) {
                android.app.NotificationChannel notificationChannel = new android.app.NotificationChannel(this.BATTERY_CHANNEL, "Battery notification channel", 4);
                notificationChannel.setDescription("Battery notification channel");
                notificationChannel.setShowBadge(false);
                notificationManager.createNotificationChannel(notificationChannel);
                builder = new android.app.Notification.Builder(context, this.BATTERY_CHANNEL);
            } else {
                builder = new android.app.Notification.Builder(context);
            }
            java.lang.String str = message;
            android.app.Notification notificationBuild = builder.setSmallIcon(powerwatch.matrix.com.pwgen2android.R.mipmap.app_icon_notif).setContentTitle(title).setContentText(str).setStyle(new android.app.Notification.BigTextStyle().bigText(str)).setContentIntent(notificationIntent).setAutoCancel(true).setOngoing(false).build();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(notificationBuild, "phoneNotificationBuilder.setSmallIcon(R.mipmap.app_icon_notif)\n                .setContentTitle(title)\n                .setContentText(message)\n                .setStyle(Notification.BigTextStyle()\n                        .bigText(message))\n                .setContentIntent(pendingIntent)\n                .setAutoCancel(true)\n                .setOngoing(false)\n                .build()");
            notificationManager.notify(this.batteryNotificationID, notificationBuild);
        }
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.localNotifications.NotificationManager
    public void dismissBatteryNotification(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        java.lang.Object systemService = context.getSystemService("notification");
        java.util.Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        ((android.app.NotificationManager) systemService).cancel(this.batteryNotificationID);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.localNotifications.NotificationManager
    public void showWatchConnectedMessage(java.lang.String deviceID, android.content.Context context, java.lang.String title, java.lang.String message) {
        android.app.Notification.Builder builder;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceID, "deviceID");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "title");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        if (this.connectionNotificationPersistence.isWatchConnectionNotificationEnabled(deviceID)) {
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) powerwatch.matrix.com.pwgen2android.main.MainActivity.class);
            intent.setFlags(536870912);
            android.app.PendingIntent notificationIntent = getNotificationIntent(context, intent);
            java.lang.Object systemService = context.getSystemService("notification");
            java.util.Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
            android.app.NotificationManager notificationManager = (android.app.NotificationManager) systemService;
            if (android.os.Build.VERSION.SDK_INT >= 26) {
                android.app.NotificationChannel notificationChannel = new android.app.NotificationChannel(this.PHONE_CONNECT_CHANNEL, "Phone connection channel", 4);
                notificationChannel.setDescription("Phone connection channel");
                notificationChannel.setShowBadge(false);
                notificationManager.createNotificationChannel(notificationChannel);
                builder = new android.app.Notification.Builder(context, this.PHONE_CONNECT_CHANNEL);
            } else {
                builder = new android.app.Notification.Builder(context);
            }
            java.lang.String str = message;
            android.app.Notification notificationBuild = builder.setSmallIcon(powerwatch.matrix.com.pwgen2android.R.mipmap.app_icon_notif).setContentTitle(title).setContentText(str).setStyle(new android.app.Notification.BigTextStyle().bigText(str)).setContentIntent(notificationIntent).setAutoCancel(true).setOngoing(false).build();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(notificationBuild, "phoneNotificationBuilder.setSmallIcon(R.mipmap.app_icon_notif)\n                .setContentTitle(title)\n                .setContentText(message)\n                .setStyle(Notification.BigTextStyle()\n                        .bigText(message))\n                .setContentIntent(pendingIntent)\n                .setAutoCancel(true)\n                .setOngoing(false)\n                .build()");
            notificationManager.notify(this.watchConnectionID, notificationBuild);
        }
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.localNotifications.NotificationManager
    public void showGoalsAchievedMessage(java.lang.String deviceID, android.content.Context context, java.lang.String title, java.lang.String message) {
        android.app.Notification.Builder builder;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceID, "deviceID");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "title");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        if (this.goalsNotificationPersistence.isGoalsNotificationsEnabled()) {
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) powerwatch.matrix.com.pwgen2android.main.MainActivity.class);
            intent.setFlags(536870912);
            android.app.PendingIntent notificationIntent = getNotificationIntent(context, intent);
            java.lang.Object systemService = context.getSystemService("notification");
            java.util.Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
            android.app.NotificationManager notificationManager = (android.app.NotificationManager) systemService;
            if (android.os.Build.VERSION.SDK_INT >= 26) {
                android.app.NotificationChannel notificationChannel = new android.app.NotificationChannel(this.GOALS_CHANNEL, "Goals notifications", 4);
                notificationChannel.setDescription("Goals notifications");
                notificationChannel.setShowBadge(false);
                notificationManager.createNotificationChannel(notificationChannel);
                builder = new android.app.Notification.Builder(context, this.GOALS_CHANNEL);
            } else {
                builder = new android.app.Notification.Builder(context);
            }
            java.lang.String str = message;
            android.app.Notification notificationBuild = builder.setSmallIcon(powerwatch.matrix.com.pwgen2android.R.mipmap.app_icon_notif).setContentTitle(title).setContentText(str).setStyle(new android.app.Notification.BigTextStyle().bigText(str)).setContentIntent(notificationIntent).setAutoCancel(true).setOngoing(false).build();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(notificationBuild, "phoneNotificationBuilder.setSmallIcon(R.mipmap.app_icon_notif)\n                .setContentTitle(title)\n                .setContentText(message)\n                .setStyle(Notification.BigTextStyle()\n                        .bigText(message))\n                .setContentIntent(pendingIntent)\n                .setAutoCancel(true)\n                .setOngoing(false)\n                .build()");
            notificationManager.notify(this.batteryNotificationID, notificationBuild);
        }
    }
}
