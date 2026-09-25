package com.google.firebase.analytics;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-api@@17.2.3 */
/* JADX INFO: loaded from: classes2.dex */
public final class FirebaseAnalytics {
    private static volatile com.google.firebase.analytics.FirebaseAnalytics zza;
    private final com.google.android.gms.measurement.internal.zzgo zzb;
    private final com.google.android.gms.internal.measurement.zzx zzc;
    private final boolean zzd;
    private java.lang.String zze;
    private long zzf;
    private final java.lang.Object zzg;
    private java.util.concurrent.ExecutorService zzh;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-api@@17.2.3 */
    public static class Event {
        public static final java.lang.String ADD_PAYMENT_INFO = "add_payment_info";
        public static final java.lang.String ADD_TO_CART = "add_to_cart";
        public static final java.lang.String ADD_TO_WISHLIST = "add_to_wishlist";
        public static final java.lang.String APP_OPEN = "app_open";
        public static final java.lang.String BEGIN_CHECKOUT = "begin_checkout";
        public static final java.lang.String CAMPAIGN_DETAILS = "campaign_details";
        public static final java.lang.String CHECKOUT_PROGRESS = "checkout_progress";
        public static final java.lang.String EARN_VIRTUAL_CURRENCY = "earn_virtual_currency";
        public static final java.lang.String ECOMMERCE_PURCHASE = "ecommerce_purchase";
        public static final java.lang.String GENERATE_LEAD = "generate_lead";
        public static final java.lang.String JOIN_GROUP = "join_group";
        public static final java.lang.String LEVEL_END = "level_end";
        public static final java.lang.String LEVEL_START = "level_start";
        public static final java.lang.String LEVEL_UP = "level_up";
        public static final java.lang.String LOGIN = "login";
        public static final java.lang.String POST_SCORE = "post_score";
        public static final java.lang.String PRESENT_OFFER = "present_offer";
        public static final java.lang.String PURCHASE_REFUND = "purchase_refund";
        public static final java.lang.String REMOVE_FROM_CART = "remove_from_cart";
        public static final java.lang.String SEARCH = "search";
        public static final java.lang.String SELECT_CONTENT = "select_content";
        public static final java.lang.String SET_CHECKOUT_OPTION = "set_checkout_option";
        public static final java.lang.String SHARE = "share";
        public static final java.lang.String SIGN_UP = "sign_up";
        public static final java.lang.String SPEND_VIRTUAL_CURRENCY = "spend_virtual_currency";
        public static final java.lang.String TUTORIAL_BEGIN = "tutorial_begin";
        public static final java.lang.String TUTORIAL_COMPLETE = "tutorial_complete";
        public static final java.lang.String UNLOCK_ACHIEVEMENT = "unlock_achievement";
        public static final java.lang.String VIEW_ITEM = "view_item";
        public static final java.lang.String VIEW_ITEM_LIST = "view_item_list";
        public static final java.lang.String VIEW_SEARCH_RESULTS = "view_search_results";

        protected Event() {
        }
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-api@@17.2.3 */
    public static class Param {
        public static final java.lang.String ACHIEVEMENT_ID = "achievement_id";
        public static final java.lang.String ACLID = "aclid";
        public static final java.lang.String AFFILIATION = "affiliation";
        public static final java.lang.String CAMPAIGN = "campaign";
        public static final java.lang.String CHARACTER = "character";
        public static final java.lang.String CHECKOUT_OPTION = "checkout_option";
        public static final java.lang.String CHECKOUT_STEP = "checkout_step";
        public static final java.lang.String CONTENT = "content";
        public static final java.lang.String CONTENT_TYPE = "content_type";
        public static final java.lang.String COUPON = "coupon";
        public static final java.lang.String CP1 = "cp1";
        public static final java.lang.String CREATIVE_NAME = "creative_name";
        public static final java.lang.String CREATIVE_SLOT = "creative_slot";
        public static final java.lang.String CURRENCY = "currency";
        public static final java.lang.String DESTINATION = "destination";
        public static final java.lang.String END_DATE = "end_date";
        public static final java.lang.String EXTEND_SESSION = "extend_session";
        public static final java.lang.String FLIGHT_NUMBER = "flight_number";
        public static final java.lang.String GROUP_ID = "group_id";
        public static final java.lang.String INDEX = "index";
        public static final java.lang.String ITEM_BRAND = "item_brand";
        public static final java.lang.String ITEM_CATEGORY = "item_category";
        public static final java.lang.String ITEM_ID = "item_id";
        public static final java.lang.String ITEM_LIST = "item_list";
        public static final java.lang.String ITEM_LOCATION_ID = "item_location_id";
        public static final java.lang.String ITEM_NAME = "item_name";
        public static final java.lang.String ITEM_VARIANT = "item_variant";
        public static final java.lang.String LEVEL = "level";
        public static final java.lang.String LEVEL_NAME = "level_name";
        public static final java.lang.String LOCATION = "location";
        public static final java.lang.String MEDIUM = "medium";
        public static final java.lang.String METHOD = "method";
        public static final java.lang.String NUMBER_OF_NIGHTS = "number_of_nights";
        public static final java.lang.String NUMBER_OF_PASSENGERS = "number_of_passengers";
        public static final java.lang.String NUMBER_OF_ROOMS = "number_of_rooms";
        public static final java.lang.String ORIGIN = "origin";
        public static final java.lang.String PRICE = "price";
        public static final java.lang.String QUANTITY = "quantity";
        public static final java.lang.String SCORE = "score";
        public static final java.lang.String SEARCH_TERM = "search_term";
        public static final java.lang.String SHIPPING = "shipping";

        @java.lang.Deprecated
        public static final java.lang.String SIGN_UP_METHOD = "sign_up_method";
        public static final java.lang.String SOURCE = "source";
        public static final java.lang.String START_DATE = "start_date";
        public static final java.lang.String SUCCESS = "success";
        public static final java.lang.String TAX = "tax";
        public static final java.lang.String TERM = "term";
        public static final java.lang.String TRANSACTION_ID = "transaction_id";
        public static final java.lang.String TRAVEL_CLASS = "travel_class";
        public static final java.lang.String VALUE = "value";
        public static final java.lang.String VIRTUAL_CURRENCY_NAME = "virtual_currency_name";

        protected Param() {
        }
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-api@@17.2.3 */
    public static class UserProperty {
        public static final java.lang.String ALLOW_AD_PERSONALIZATION_SIGNALS = "allow_personalized_ads";
        public static final java.lang.String SIGN_UP_METHOD = "sign_up_method";

        protected UserProperty() {
        }
    }

    public static com.google.firebase.analytics.FirebaseAnalytics getInstance(android.content.Context context) {
        if (zza == null) {
            synchronized (com.google.firebase.analytics.FirebaseAnalytics.class) {
                if (zza == null) {
                    if (com.google.android.gms.internal.measurement.zzx.zzb(context)) {
                        zza = new com.google.firebase.analytics.FirebaseAnalytics(com.google.android.gms.internal.measurement.zzx.zza(context));
                    } else {
                        zza = new com.google.firebase.analytics.FirebaseAnalytics(com.google.android.gms.measurement.internal.zzgo.zza(context, (com.google.android.gms.internal.measurement.zzv) null));
                    }
                }
            }
        }
        return zza;
    }

    public final void logEvent(java.lang.String str, android.os.Bundle bundle) {
        if (this.zzd) {
            this.zzc.zza(str, bundle);
        } else {
            this.zzb.zzh().zza(io.fabric.sdk.android.services.settings.SettingsJsonConstants.APP_KEY, str, bundle, true);
        }
    }

    public final void setUserProperty(java.lang.String str, java.lang.String str2) {
        if (this.zzd) {
            this.zzc.zza(str, str2);
        } else {
            this.zzb.zzh().zza(io.fabric.sdk.android.services.settings.SettingsJsonConstants.APP_KEY, str, (java.lang.Object) str2, false);
        }
    }

    public final void setCurrentScreen(android.app.Activity activity, java.lang.String str, java.lang.String str2) {
        if (this.zzd) {
            this.zzc.zza(activity, str, str2);
        } else if (!com.google.android.gms.measurement.internal.zzw.zza()) {
            this.zzb.zzr().zzi().zza("setCurrentScreen must be called from the main thread");
        } else {
            this.zzb.zzv().zza(activity, str, str2);
        }
    }

    public final void setAnalyticsCollectionEnabled(boolean z) {
        if (this.zzd) {
            this.zzc.zza(z);
        } else {
            this.zzb.zzh().zza(z);
        }
    }

    public final void setUserId(java.lang.String str) {
        if (this.zzd) {
            this.zzc.zza(str);
        } else {
            this.zzb.zzh().zza(io.fabric.sdk.android.services.settings.SettingsJsonConstants.APP_KEY, "_id", (java.lang.Object) str, true);
        }
    }

    @java.lang.Deprecated
    public final void setMinimumSessionDuration(long j) {
        if (this.zzd) {
            this.zzc.zza(j);
        } else {
            this.zzb.zzh().zza(j);
        }
    }

    public final void setSessionTimeoutDuration(long j) {
        if (this.zzd) {
            this.zzc.zzb(j);
        } else {
            this.zzb.zzh().zzb(j);
        }
    }

    private final java.util.concurrent.ExecutorService zza() {
        java.util.concurrent.ExecutorService executorService;
        synchronized (com.google.firebase.analytics.FirebaseAnalytics.class) {
            if (this.zzh == null) {
                this.zzh = new java.util.concurrent.ThreadPoolExecutor(0, 1, 30L, java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.ArrayBlockingQueue(100));
            }
            executorService = this.zzh;
        }
        return executorService;
    }

    public final com.google.android.gms.tasks.Task<java.lang.String> getAppInstanceId() {
        try {
            java.lang.String strZzb = zzb();
            if (strZzb != null) {
                return com.google.android.gms.tasks.Tasks.forResult(strZzb);
            }
            return com.google.android.gms.tasks.Tasks.call(zza(), new com.google.firebase.analytics.zzb(this));
        } catch (java.lang.Exception e) {
            if (this.zzd) {
                this.zzc.zza(5, "Failed to schedule task for getAppInstanceId", (java.lang.Object) null, (java.lang.Object) null, (java.lang.Object) null);
            } else {
                this.zzb.zzr().zzi().zza("Failed to schedule task for getAppInstanceId");
            }
            return com.google.android.gms.tasks.Tasks.forException(e);
        }
    }

    private FirebaseAnalytics(com.google.android.gms.measurement.internal.zzgo zzgoVar) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzgoVar);
        this.zzb = zzgoVar;
        this.zzc = null;
        this.zzd = false;
        this.zzg = new java.lang.Object();
    }

    private FirebaseAnalytics(com.google.android.gms.internal.measurement.zzx zzxVar) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzxVar);
        this.zzb = null;
        this.zzc = zzxVar;
        this.zzd = true;
        this.zzg = new java.lang.Object();
    }

    public final void resetAnalyticsData() {
        zza((java.lang.String) null);
        if (this.zzd) {
            this.zzc.zzb();
        } else {
            this.zzb.zzh().zzd(this.zzb.zzm().currentTimeMillis());
        }
    }

    public final java.lang.String getFirebaseInstanceId() {
        return com.google.firebase.iid.FirebaseInstanceId.getInstance().getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(java.lang.String str) {
        synchronized (this.zzg) {
            this.zze = str;
            if (this.zzd) {
                this.zzf = com.google.android.gms.common.util.DefaultClock.getInstance().elapsedRealtime();
            } else {
                this.zzf = this.zzb.zzm().elapsedRealtime();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.String zzb() {
        long jElapsedRealtime;
        synchronized (this.zzg) {
            if (this.zzd) {
                jElapsedRealtime = com.google.android.gms.common.util.DefaultClock.getInstance().elapsedRealtime();
            } else {
                jElapsedRealtime = this.zzb.zzm().elapsedRealtime();
            }
            if (java.lang.Math.abs(jElapsedRealtime - this.zzf) >= 1000) {
                return null;
            }
            return this.zze;
        }
    }

    public static com.google.android.gms.measurement.internal.zzio getScionFrontendApiImplementation(android.content.Context context, android.os.Bundle bundle) {
        com.google.android.gms.internal.measurement.zzx zzxVarZza;
        if (com.google.android.gms.internal.measurement.zzx.zzb(context) && (zzxVarZza = com.google.android.gms.internal.measurement.zzx.zza(context, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, bundle)) != null) {
            return new com.google.firebase.analytics.zza(zzxVarZza);
        }
        return null;
    }
}
