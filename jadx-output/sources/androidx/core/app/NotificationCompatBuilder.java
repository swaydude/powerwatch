package androidx.core.app;

/* JADX INFO: loaded from: classes.dex */
class NotificationCompatBuilder implements androidx.core.app.NotificationBuilderWithBuilderAccessor {
    private android.widget.RemoteViews mBigContentView;
    private final android.app.Notification.Builder mBuilder;
    private final androidx.core.app.NotificationCompat.Builder mBuilderCompat;
    private android.widget.RemoteViews mContentView;
    private int mGroupAlertBehavior;
    private android.widget.RemoteViews mHeadsUpContentView;
    private final java.util.List<android.os.Bundle> mActionExtrasList = new java.util.ArrayList();
    private final android.os.Bundle mExtras = new android.os.Bundle();

    NotificationCompatBuilder(androidx.core.app.NotificationCompat.Builder builder) {
        this.mBuilderCompat = builder;
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            this.mBuilder = new android.app.Notification.Builder(builder.mContext, builder.mChannelId);
        } else {
            this.mBuilder = new android.app.Notification.Builder(builder.mContext);
        }
        android.app.Notification notification = builder.mNotification;
        this.mBuilder.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, builder.mTickerView).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(builder.mContentTitle).setContentText(builder.mContentText).setContentInfo(builder.mContentInfo).setContentIntent(builder.mContentIntent).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(builder.mFullScreenIntent, (notification.flags & 128) != 0).setLargeIcon(builder.mLargeIcon).setNumber(builder.mNumber).setProgress(builder.mProgressMax, builder.mProgress, builder.mProgressIndeterminate);
        if (android.os.Build.VERSION.SDK_INT < 21) {
            this.mBuilder.setSound(notification.sound, notification.audioStreamType);
        }
        if (android.os.Build.VERSION.SDK_INT >= 16) {
            this.mBuilder.setSubText(builder.mSubText).setUsesChronometer(builder.mUseChronometer).setPriority(builder.mPriority);
            java.util.Iterator<androidx.core.app.NotificationCompat.Action> it = builder.mActions.iterator();
            while (it.hasNext()) {
                addAction(it.next());
            }
            if (builder.mExtras != null) {
                this.mExtras.putAll(builder.mExtras);
            }
            if (android.os.Build.VERSION.SDK_INT < 20) {
                if (builder.mLocalOnly) {
                    this.mExtras.putBoolean(androidx.core.app.NotificationCompatExtras.EXTRA_LOCAL_ONLY, true);
                }
                if (builder.mGroupKey != null) {
                    this.mExtras.putString(androidx.core.app.NotificationCompatExtras.EXTRA_GROUP_KEY, builder.mGroupKey);
                    if (builder.mGroupSummary) {
                        this.mExtras.putBoolean(androidx.core.app.NotificationCompatExtras.EXTRA_GROUP_SUMMARY, true);
                    } else {
                        this.mExtras.putBoolean(androidx.core.app.NotificationManagerCompat.EXTRA_USE_SIDE_CHANNEL, true);
                    }
                }
                if (builder.mSortKey != null) {
                    this.mExtras.putString(androidx.core.app.NotificationCompatExtras.EXTRA_SORT_KEY, builder.mSortKey);
                }
            }
            this.mContentView = builder.mContentView;
            this.mBigContentView = builder.mBigContentView;
        }
        if (android.os.Build.VERSION.SDK_INT >= 19) {
            this.mBuilder.setShowWhen(builder.mShowWhen);
            if (android.os.Build.VERSION.SDK_INT < 21 && builder.mPeople != null && !builder.mPeople.isEmpty()) {
                this.mExtras.putStringArray(androidx.core.app.NotificationCompat.EXTRA_PEOPLE, (java.lang.String[]) builder.mPeople.toArray(new java.lang.String[builder.mPeople.size()]));
            }
        }
        if (android.os.Build.VERSION.SDK_INT >= 20) {
            this.mBuilder.setLocalOnly(builder.mLocalOnly).setGroup(builder.mGroupKey).setGroupSummary(builder.mGroupSummary).setSortKey(builder.mSortKey);
            this.mGroupAlertBehavior = builder.mGroupAlertBehavior;
        }
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            this.mBuilder.setCategory(builder.mCategory).setColor(builder.mColor).setVisibility(builder.mVisibility).setPublicVersion(builder.mPublicVersion).setSound(notification.sound, notification.audioAttributes);
            java.util.Iterator<java.lang.String> it2 = builder.mPeople.iterator();
            while (it2.hasNext()) {
                this.mBuilder.addPerson(it2.next());
            }
            this.mHeadsUpContentView = builder.mHeadsUpContentView;
            if (builder.mInvisibleActions.size() > 0) {
                android.os.Bundle bundle = builder.getExtras().getBundle("android.car.EXTENSIONS");
                bundle = bundle == null ? new android.os.Bundle() : bundle;
                android.os.Bundle bundle2 = new android.os.Bundle();
                for (int i = 0; i < builder.mInvisibleActions.size(); i++) {
                    bundle2.putBundle(java.lang.Integer.toString(i), androidx.core.app.NotificationCompatJellybean.getBundleForAction(builder.mInvisibleActions.get(i)));
                }
                bundle.putBundle("invisible_actions", bundle2);
                builder.getExtras().putBundle("android.car.EXTENSIONS", bundle);
                this.mExtras.putBundle("android.car.EXTENSIONS", bundle);
            }
        }
        if (android.os.Build.VERSION.SDK_INT >= 24) {
            this.mBuilder.setExtras(builder.mExtras).setRemoteInputHistory(builder.mRemoteInputHistory);
            if (builder.mContentView != null) {
                this.mBuilder.setCustomContentView(builder.mContentView);
            }
            if (builder.mBigContentView != null) {
                this.mBuilder.setCustomBigContentView(builder.mBigContentView);
            }
            if (builder.mHeadsUpContentView != null) {
                this.mBuilder.setCustomHeadsUpContentView(builder.mHeadsUpContentView);
            }
        }
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            this.mBuilder.setBadgeIconType(builder.mBadgeIcon).setShortcutId(builder.mShortcutId).setTimeoutAfter(builder.mTimeout).setGroupAlertBehavior(builder.mGroupAlertBehavior);
            if (builder.mColorizedSet) {
                this.mBuilder.setColorized(builder.mColorized);
            }
            if (android.text.TextUtils.isEmpty(builder.mChannelId)) {
                return;
            }
            this.mBuilder.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
        }
    }

    @Override // androidx.core.app.NotificationBuilderWithBuilderAccessor
    public android.app.Notification.Builder getBuilder() {
        return this.mBuilder;
    }

    public android.app.Notification build() {
        android.os.Bundle extras;
        android.widget.RemoteViews remoteViewsMakeHeadsUpContentView;
        android.widget.RemoteViews remoteViewsMakeBigContentView;
        androidx.core.app.NotificationCompat.Style style = this.mBuilderCompat.mStyle;
        if (style != null) {
            style.apply(this);
        }
        android.widget.RemoteViews remoteViewsMakeContentView = style != null ? style.makeContentView(this) : null;
        android.app.Notification notificationBuildInternal = buildInternal();
        if (remoteViewsMakeContentView != null) {
            notificationBuildInternal.contentView = remoteViewsMakeContentView;
        } else if (this.mBuilderCompat.mContentView != null) {
            notificationBuildInternal.contentView = this.mBuilderCompat.mContentView;
        }
        if (android.os.Build.VERSION.SDK_INT >= 16 && style != null && (remoteViewsMakeBigContentView = style.makeBigContentView(this)) != null) {
            notificationBuildInternal.bigContentView = remoteViewsMakeBigContentView;
        }
        if (android.os.Build.VERSION.SDK_INT >= 21 && style != null && (remoteViewsMakeHeadsUpContentView = this.mBuilderCompat.mStyle.makeHeadsUpContentView(this)) != null) {
            notificationBuildInternal.headsUpContentView = remoteViewsMakeHeadsUpContentView;
        }
        if (android.os.Build.VERSION.SDK_INT >= 16 && style != null && (extras = androidx.core.app.NotificationCompat.getExtras(notificationBuildInternal)) != null) {
            style.addCompatExtras(extras);
        }
        return notificationBuildInternal;
    }

    private void addAction(androidx.core.app.NotificationCompat.Action action) {
        android.os.Bundle bundle;
        if (android.os.Build.VERSION.SDK_INT >= 20) {
            android.app.Notification.Action.Builder builder = new android.app.Notification.Action.Builder(action.getIcon(), action.getTitle(), action.getActionIntent());
            if (action.getRemoteInputs() != null) {
                for (android.app.RemoteInput remoteInput : androidx.core.app.RemoteInput.fromCompat(action.getRemoteInputs())) {
                    builder.addRemoteInput(remoteInput);
                }
            }
            if (action.getExtras() != null) {
                bundle = new android.os.Bundle(action.getExtras());
            } else {
                bundle = new android.os.Bundle();
            }
            bundle.putBoolean("android.support.allowGeneratedReplies", action.getAllowGeneratedReplies());
            if (android.os.Build.VERSION.SDK_INT >= 24) {
                builder.setAllowGeneratedReplies(action.getAllowGeneratedReplies());
            }
            bundle.putInt("android.support.action.semanticAction", action.getSemanticAction());
            if (android.os.Build.VERSION.SDK_INT >= 28) {
                builder.setSemanticAction(action.getSemanticAction());
            }
            bundle.putBoolean("android.support.action.showsUserInterface", action.getShowsUserInterface());
            builder.addExtras(bundle);
            this.mBuilder.addAction(builder.build());
            return;
        }
        if (android.os.Build.VERSION.SDK_INT >= 16) {
            this.mActionExtrasList.add(androidx.core.app.NotificationCompatJellybean.writeActionAndGetExtras(this.mBuilder, action));
        }
    }

    protected android.app.Notification buildInternal() {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            return this.mBuilder.build();
        }
        if (android.os.Build.VERSION.SDK_INT >= 24) {
            android.app.Notification notificationBuild = this.mBuilder.build();
            if (this.mGroupAlertBehavior != 0) {
                if (notificationBuild.getGroup() != null && (notificationBuild.flags & 512) != 0 && this.mGroupAlertBehavior == 2) {
                    removeSoundAndVibration(notificationBuild);
                }
                if (notificationBuild.getGroup() != null && (notificationBuild.flags & 512) == 0 && this.mGroupAlertBehavior == 1) {
                    removeSoundAndVibration(notificationBuild);
                }
            }
            return notificationBuild;
        }
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            this.mBuilder.setExtras(this.mExtras);
            android.app.Notification notificationBuild2 = this.mBuilder.build();
            android.widget.RemoteViews remoteViews = this.mContentView;
            if (remoteViews != null) {
                notificationBuild2.contentView = remoteViews;
            }
            android.widget.RemoteViews remoteViews2 = this.mBigContentView;
            if (remoteViews2 != null) {
                notificationBuild2.bigContentView = remoteViews2;
            }
            android.widget.RemoteViews remoteViews3 = this.mHeadsUpContentView;
            if (remoteViews3 != null) {
                notificationBuild2.headsUpContentView = remoteViews3;
            }
            if (this.mGroupAlertBehavior != 0) {
                if (notificationBuild2.getGroup() != null && (notificationBuild2.flags & 512) != 0 && this.mGroupAlertBehavior == 2) {
                    removeSoundAndVibration(notificationBuild2);
                }
                if (notificationBuild2.getGroup() != null && (notificationBuild2.flags & 512) == 0 && this.mGroupAlertBehavior == 1) {
                    removeSoundAndVibration(notificationBuild2);
                }
            }
            return notificationBuild2;
        }
        if (android.os.Build.VERSION.SDK_INT >= 20) {
            this.mBuilder.setExtras(this.mExtras);
            android.app.Notification notificationBuild3 = this.mBuilder.build();
            android.widget.RemoteViews remoteViews4 = this.mContentView;
            if (remoteViews4 != null) {
                notificationBuild3.contentView = remoteViews4;
            }
            android.widget.RemoteViews remoteViews5 = this.mBigContentView;
            if (remoteViews5 != null) {
                notificationBuild3.bigContentView = remoteViews5;
            }
            if (this.mGroupAlertBehavior != 0) {
                if (notificationBuild3.getGroup() != null && (notificationBuild3.flags & 512) != 0 && this.mGroupAlertBehavior == 2) {
                    removeSoundAndVibration(notificationBuild3);
                }
                if (notificationBuild3.getGroup() != null && (notificationBuild3.flags & 512) == 0 && this.mGroupAlertBehavior == 1) {
                    removeSoundAndVibration(notificationBuild3);
                }
            }
            return notificationBuild3;
        }
        if (android.os.Build.VERSION.SDK_INT >= 19) {
            android.util.SparseArray<android.os.Bundle> sparseArrayBuildActionExtrasMap = androidx.core.app.NotificationCompatJellybean.buildActionExtrasMap(this.mActionExtrasList);
            if (sparseArrayBuildActionExtrasMap != null) {
                this.mExtras.putSparseParcelableArray(androidx.core.app.NotificationCompatExtras.EXTRA_ACTION_EXTRAS, sparseArrayBuildActionExtrasMap);
            }
            this.mBuilder.setExtras(this.mExtras);
            android.app.Notification notificationBuild4 = this.mBuilder.build();
            android.widget.RemoteViews remoteViews6 = this.mContentView;
            if (remoteViews6 != null) {
                notificationBuild4.contentView = remoteViews6;
            }
            android.widget.RemoteViews remoteViews7 = this.mBigContentView;
            if (remoteViews7 != null) {
                notificationBuild4.bigContentView = remoteViews7;
            }
            return notificationBuild4;
        }
        if (android.os.Build.VERSION.SDK_INT >= 16) {
            android.app.Notification notificationBuild5 = this.mBuilder.build();
            android.os.Bundle extras = androidx.core.app.NotificationCompat.getExtras(notificationBuild5);
            android.os.Bundle bundle = new android.os.Bundle(this.mExtras);
            for (java.lang.String str : this.mExtras.keySet()) {
                if (extras.containsKey(str)) {
                    bundle.remove(str);
                }
            }
            extras.putAll(bundle);
            android.util.SparseArray<android.os.Bundle> sparseArrayBuildActionExtrasMap2 = androidx.core.app.NotificationCompatJellybean.buildActionExtrasMap(this.mActionExtrasList);
            if (sparseArrayBuildActionExtrasMap2 != null) {
                androidx.core.app.NotificationCompat.getExtras(notificationBuild5).putSparseParcelableArray(androidx.core.app.NotificationCompatExtras.EXTRA_ACTION_EXTRAS, sparseArrayBuildActionExtrasMap2);
            }
            android.widget.RemoteViews remoteViews8 = this.mContentView;
            if (remoteViews8 != null) {
                notificationBuild5.contentView = remoteViews8;
            }
            android.widget.RemoteViews remoteViews9 = this.mBigContentView;
            if (remoteViews9 != null) {
                notificationBuild5.bigContentView = remoteViews9;
            }
            return notificationBuild5;
        }
        return this.mBuilder.getNotification();
    }

    private void removeSoundAndVibration(android.app.Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        notification.defaults &= -2;
        notification.defaults &= -3;
    }
}
