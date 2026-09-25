package androidx.media.app;

/* JADX INFO: loaded from: classes.dex */
public class NotificationCompat {
    private NotificationCompat() {
    }

    public static class MediaStyle extends androidx.core.app.NotificationCompat.Style {
        private static final int MAX_MEDIA_BUTTONS = 5;
        private static final int MAX_MEDIA_BUTTONS_IN_COMPACT = 3;
        int[] mActionsToShowInCompact = null;
        android.app.PendingIntent mCancelButtonIntent;
        boolean mShowCancelButton;
        android.support.v4.media.session.MediaSessionCompat.Token mToken;

        public static android.support.v4.media.session.MediaSessionCompat.Token getMediaSession(android.app.Notification notification) {
            android.os.Bundle extras = androidx.core.app.NotificationCompat.getExtras(notification);
            if (extras == null) {
                return null;
            }
            if (android.os.Build.VERSION.SDK_INT >= 21) {
                android.os.Parcelable parcelable = extras.getParcelable(androidx.core.app.NotificationCompat.EXTRA_MEDIA_SESSION);
                if (parcelable != null) {
                    return android.support.v4.media.session.MediaSessionCompat.Token.fromToken(parcelable);
                }
                return null;
            }
            android.os.IBinder binder = androidx.core.app.BundleCompat.getBinder(extras, androidx.core.app.NotificationCompat.EXTRA_MEDIA_SESSION);
            if (binder == null) {
                return null;
            }
            android.os.Parcel parcelObtain = android.os.Parcel.obtain();
            parcelObtain.writeStrongBinder(binder);
            parcelObtain.setDataPosition(0);
            android.support.v4.media.session.MediaSessionCompat.Token tokenCreateFromParcel = android.support.v4.media.session.MediaSessionCompat.Token.CREATOR.createFromParcel(parcelObtain);
            parcelObtain.recycle();
            return tokenCreateFromParcel;
        }

        public MediaStyle() {
        }

        public MediaStyle(androidx.core.app.NotificationCompat.Builder builder) {
            setBuilder(builder);
        }

        public androidx.media.app.NotificationCompat.MediaStyle setShowActionsInCompactView(int... iArr) {
            this.mActionsToShowInCompact = iArr;
            return this;
        }

        public androidx.media.app.NotificationCompat.MediaStyle setMediaSession(android.support.v4.media.session.MediaSessionCompat.Token token) {
            this.mToken = token;
            return this;
        }

        public androidx.media.app.NotificationCompat.MediaStyle setShowCancelButton(boolean z) {
            if (android.os.Build.VERSION.SDK_INT < 21) {
                this.mShowCancelButton = z;
            }
            return this;
        }

        public androidx.media.app.NotificationCompat.MediaStyle setCancelButtonIntent(android.app.PendingIntent pendingIntent) {
            this.mCancelButtonIntent = pendingIntent;
            return this;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public void apply(androidx.core.app.NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            if (android.os.Build.VERSION.SDK_INT >= 21) {
                notificationBuilderWithBuilderAccessor.getBuilder().setStyle(fillInMediaStyle(new android.app.Notification.MediaStyle()));
            } else if (this.mShowCancelButton) {
                notificationBuilderWithBuilderAccessor.getBuilder().setOngoing(true);
            }
        }

        android.app.Notification.MediaStyle fillInMediaStyle(android.app.Notification.MediaStyle mediaStyle) {
            int[] iArr = this.mActionsToShowInCompact;
            if (iArr != null) {
                mediaStyle.setShowActionsInCompactView(iArr);
            }
            android.support.v4.media.session.MediaSessionCompat.Token token = this.mToken;
            if (token != null) {
                mediaStyle.setMediaSession((android.media.session.MediaSession.Token) token.getToken());
            }
            return mediaStyle;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public android.widget.RemoteViews makeContentView(androidx.core.app.NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            if (android.os.Build.VERSION.SDK_INT >= 21) {
                return null;
            }
            return generateContentView();
        }

        android.widget.RemoteViews generateContentView() {
            android.widget.RemoteViews remoteViewsApplyStandardTemplate = applyStandardTemplate(false, getContentViewLayoutResource(), true);
            int size = this.mBuilder.mActions.size();
            int[] iArr = this.mActionsToShowInCompact;
            int iMin = iArr == null ? 0 : java.lang.Math.min(iArr.length, 3);
            remoteViewsApplyStandardTemplate.removeAllViews(androidx.media.R.id.media_actions);
            if (iMin > 0) {
                for (int i = 0; i < iMin; i++) {
                    if (i >= size) {
                        throw new java.lang.IllegalArgumentException(java.lang.String.format("setShowActionsInCompactView: action %d out of bounds (max %d)", java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(size - 1)));
                    }
                    remoteViewsApplyStandardTemplate.addView(androidx.media.R.id.media_actions, generateMediaActionButton(this.mBuilder.mActions.get(this.mActionsToShowInCompact[i])));
                }
            }
            if (this.mShowCancelButton) {
                remoteViewsApplyStandardTemplate.setViewVisibility(androidx.media.R.id.end_padder, 8);
                remoteViewsApplyStandardTemplate.setViewVisibility(androidx.media.R.id.cancel_action, 0);
                remoteViewsApplyStandardTemplate.setOnClickPendingIntent(androidx.media.R.id.cancel_action, this.mCancelButtonIntent);
                remoteViewsApplyStandardTemplate.setInt(androidx.media.R.id.cancel_action, "setAlpha", this.mBuilder.mContext.getResources().getInteger(androidx.media.R.integer.cancel_button_image_alpha));
            } else {
                remoteViewsApplyStandardTemplate.setViewVisibility(androidx.media.R.id.end_padder, 0);
                remoteViewsApplyStandardTemplate.setViewVisibility(androidx.media.R.id.cancel_action, 8);
            }
            return remoteViewsApplyStandardTemplate;
        }

        private android.widget.RemoteViews generateMediaActionButton(androidx.core.app.NotificationCompat.Action action) {
            boolean z = action.getActionIntent() == null;
            android.widget.RemoteViews remoteViews = new android.widget.RemoteViews(this.mBuilder.mContext.getPackageName(), androidx.media.R.layout.notification_media_action);
            remoteViews.setImageViewResource(androidx.media.R.id.action0, action.getIcon());
            if (!z) {
                remoteViews.setOnClickPendingIntent(androidx.media.R.id.action0, action.getActionIntent());
            }
            if (android.os.Build.VERSION.SDK_INT >= 15) {
                remoteViews.setContentDescription(androidx.media.R.id.action0, action.getTitle());
            }
            return remoteViews;
        }

        int getContentViewLayoutResource() {
            return androidx.media.R.layout.notification_template_media;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public android.widget.RemoteViews makeBigContentView(androidx.core.app.NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            if (android.os.Build.VERSION.SDK_INT >= 21) {
                return null;
            }
            return generateBigContentView();
        }

        android.widget.RemoteViews generateBigContentView() {
            int iMin = java.lang.Math.min(this.mBuilder.mActions.size(), 5);
            android.widget.RemoteViews remoteViewsApplyStandardTemplate = applyStandardTemplate(false, getBigContentViewLayoutResource(iMin), false);
            remoteViewsApplyStandardTemplate.removeAllViews(androidx.media.R.id.media_actions);
            if (iMin > 0) {
                for (int i = 0; i < iMin; i++) {
                    remoteViewsApplyStandardTemplate.addView(androidx.media.R.id.media_actions, generateMediaActionButton(this.mBuilder.mActions.get(i)));
                }
            }
            if (this.mShowCancelButton) {
                remoteViewsApplyStandardTemplate.setViewVisibility(androidx.media.R.id.cancel_action, 0);
                remoteViewsApplyStandardTemplate.setInt(androidx.media.R.id.cancel_action, "setAlpha", this.mBuilder.mContext.getResources().getInteger(androidx.media.R.integer.cancel_button_image_alpha));
                remoteViewsApplyStandardTemplate.setOnClickPendingIntent(androidx.media.R.id.cancel_action, this.mCancelButtonIntent);
            } else {
                remoteViewsApplyStandardTemplate.setViewVisibility(androidx.media.R.id.cancel_action, 8);
            }
            return remoteViewsApplyStandardTemplate;
        }

        int getBigContentViewLayoutResource(int i) {
            return i <= 3 ? androidx.media.R.layout.notification_template_big_media_narrow : androidx.media.R.layout.notification_template_big_media;
        }
    }

    public static class DecoratedMediaCustomViewStyle extends androidx.media.app.NotificationCompat.MediaStyle {
        @Override // androidx.media.app.NotificationCompat.MediaStyle, androidx.core.app.NotificationCompat.Style
        public void apply(androidx.core.app.NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            if (android.os.Build.VERSION.SDK_INT >= 24) {
                notificationBuilderWithBuilderAccessor.getBuilder().setStyle(fillInMediaStyle(new android.app.Notification.DecoratedMediaCustomViewStyle()));
            } else {
                super.apply(notificationBuilderWithBuilderAccessor);
            }
        }

        @Override // androidx.media.app.NotificationCompat.MediaStyle, androidx.core.app.NotificationCompat.Style
        public android.widget.RemoteViews makeContentView(androidx.core.app.NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            if (android.os.Build.VERSION.SDK_INT >= 24) {
                return null;
            }
            boolean z = true;
            boolean z2 = this.mBuilder.getContentView() != null;
            if (android.os.Build.VERSION.SDK_INT >= 21) {
                if (!z2 && this.mBuilder.getBigContentView() == null) {
                    z = false;
                }
                if (z) {
                    android.widget.RemoteViews remoteViewsGenerateContentView = generateContentView();
                    if (z2) {
                        buildIntoRemoteViews(remoteViewsGenerateContentView, this.mBuilder.getContentView());
                    }
                    setBackgroundColor(remoteViewsGenerateContentView);
                    return remoteViewsGenerateContentView;
                }
            } else {
                android.widget.RemoteViews remoteViewsGenerateContentView2 = generateContentView();
                if (z2) {
                    buildIntoRemoteViews(remoteViewsGenerateContentView2, this.mBuilder.getContentView());
                    return remoteViewsGenerateContentView2;
                }
            }
            return null;
        }

        @Override // androidx.media.app.NotificationCompat.MediaStyle
        int getContentViewLayoutResource() {
            return this.mBuilder.getContentView() != null ? androidx.media.R.layout.notification_template_media_custom : super.getContentViewLayoutResource();
        }

        @Override // androidx.media.app.NotificationCompat.MediaStyle, androidx.core.app.NotificationCompat.Style
        public android.widget.RemoteViews makeBigContentView(androidx.core.app.NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            android.widget.RemoteViews contentView;
            if (android.os.Build.VERSION.SDK_INT >= 24) {
                return null;
            }
            if (this.mBuilder.getBigContentView() != null) {
                contentView = this.mBuilder.getBigContentView();
            } else {
                contentView = this.mBuilder.getContentView();
            }
            if (contentView == null) {
                return null;
            }
            android.widget.RemoteViews remoteViewsGenerateBigContentView = generateBigContentView();
            buildIntoRemoteViews(remoteViewsGenerateBigContentView, contentView);
            if (android.os.Build.VERSION.SDK_INT >= 21) {
                setBackgroundColor(remoteViewsGenerateBigContentView);
            }
            return remoteViewsGenerateBigContentView;
        }

        @Override // androidx.media.app.NotificationCompat.MediaStyle
        int getBigContentViewLayoutResource(int i) {
            return i <= 3 ? androidx.media.R.layout.notification_template_big_media_narrow_custom : androidx.media.R.layout.notification_template_big_media_custom;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public android.widget.RemoteViews makeHeadsUpContentView(androidx.core.app.NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            android.widget.RemoteViews contentView;
            if (android.os.Build.VERSION.SDK_INT >= 24) {
                return null;
            }
            if (this.mBuilder.getHeadsUpContentView() != null) {
                contentView = this.mBuilder.getHeadsUpContentView();
            } else {
                contentView = this.mBuilder.getContentView();
            }
            if (contentView == null) {
                return null;
            }
            android.widget.RemoteViews remoteViewsGenerateBigContentView = generateBigContentView();
            buildIntoRemoteViews(remoteViewsGenerateBigContentView, contentView);
            if (android.os.Build.VERSION.SDK_INT >= 21) {
                setBackgroundColor(remoteViewsGenerateBigContentView);
            }
            return remoteViewsGenerateBigContentView;
        }

        private void setBackgroundColor(android.widget.RemoteViews remoteViews) {
            int color;
            if (this.mBuilder.getColor() != 0) {
                color = this.mBuilder.getColor();
            } else {
                color = this.mBuilder.mContext.getResources().getColor(androidx.media.R.color.notification_material_background_media_default_color);
            }
            remoteViews.setInt(androidx.media.R.id.status_bar_latest_event_content, "setBackgroundColor", color);
        }
    }
}
