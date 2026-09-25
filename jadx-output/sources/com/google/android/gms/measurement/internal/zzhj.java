package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
public class zzhj {
    public static final java.lang.String[] zza = {"app_background", "app_clear_data", "app_exception", "app_remove", "app_upgrade", "app_install", "app_update", "ga_campaign", "error", "first_open", "first_visit", "in_app_purchase", "notification_dismiss", "notification_foreground", "notification_open", "notification_receive", "os_update", "session_start", "user_engagement", "ad_exposure", "adunit_exposure", "ad_query", "ad_activeview", "ad_impression", "ad_click", "ad_reward", "screen_view", "ga_extra_parameter", "session_start_with_rollout", "firebase_campaign"};
    public static final java.lang.String[] zzb = {"_ab", "_cd", "_ae", "_ui", "_ug", "_in", "_au", "_cmp", "_err", "_f", "_v", "_iap", "_nd", "_nf", "_no", "_nr", "_ou", "_s", "_e", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", "_ar", "_vs", "_ep", "_ssr", "_cmp"};
    public static final java.lang.String[] zzc = {"purchase", "refund", com.google.firebase.analytics.FirebaseAnalytics.Event.ADD_PAYMENT_INFO, "add_shipping_info", com.google.firebase.analytics.FirebaseAnalytics.Event.ADD_TO_CART, com.google.firebase.analytics.FirebaseAnalytics.Event.ADD_TO_WISHLIST, com.google.firebase.analytics.FirebaseAnalytics.Event.BEGIN_CHECKOUT, com.google.firebase.analytics.FirebaseAnalytics.Event.REMOVE_FROM_CART, "select_item", "select_promotion", "view_cart", com.google.firebase.analytics.FirebaseAnalytics.Event.VIEW_ITEM, com.google.firebase.analytics.FirebaseAnalytics.Event.VIEW_ITEM_LIST, "view_promotion", com.google.firebase.analytics.FirebaseAnalytics.Event.ECOMMERCE_PURCHASE};

    protected zzhj() {
    }

    public static java.lang.String zza(java.lang.String str) {
        return com.google.android.gms.measurement.internal.zziu.zza(str, zzb, zza);
    }

    public static java.lang.String zzb(java.lang.String str) {
        return com.google.android.gms.measurement.internal.zziu.zza(str, zza, zzb);
    }
}
