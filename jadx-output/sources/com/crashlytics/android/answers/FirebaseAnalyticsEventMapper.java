package com.crashlytics.android.answers;

/* JADX INFO: loaded from: classes.dex */
public class FirebaseAnalyticsEventMapper {
    private static final java.util.Set<java.lang.String> EVENT_NAMES = new java.util.HashSet(java.util.Arrays.asList("app_clear_data", "app_exception", "app_remove", "app_upgrade", "app_install", "app_update", "firebase_campaign", "error", "first_open", "first_visit", "in_app_purchase", "notification_dismiss", "notification_foreground", "notification_open", "notification_receive", "os_update", "session_start", "user_engagement", "ad_exposure", "adunit_exposure", "ad_query", "ad_activeview", "ad_impression", "ad_click", "screen_view", "firebase_extra_parameter"));
    private static final java.lang.String FIREBASE_LEVEL_NAME = "level_name";
    private static final java.lang.String FIREBASE_METHOD = "method";
    private static final java.lang.String FIREBASE_RATING = "rating";
    private static final java.lang.String FIREBASE_SUCCESS = "success";

    public com.crashlytics.android.answers.FirebaseAnalyticsEvent mapEvent(com.crashlytics.android.answers.SessionEvent sessionEvent) {
        android.os.Bundle bundle;
        java.lang.String strMapCustomEventName;
        boolean z = com.crashlytics.android.answers.SessionEvent.Type.CUSTOM.equals(sessionEvent.type) && sessionEvent.customType != null;
        boolean z2 = com.crashlytics.android.answers.SessionEvent.Type.PREDEFINED.equals(sessionEvent.type) && sessionEvent.predefinedType != null;
        if (!z && !z2) {
            return null;
        }
        if (z2) {
            bundle = mapPredefinedEvent(sessionEvent);
        } else {
            bundle = new android.os.Bundle();
            if (sessionEvent.customAttributes != null) {
                mapCustomEventAttributes(bundle, sessionEvent.customAttributes);
            }
        }
        if (z2) {
            java.lang.String str = (java.lang.String) sessionEvent.predefinedAttributes.get("success");
            strMapCustomEventName = mapPredefinedEventName(sessionEvent.predefinedType, (str == null || java.lang.Boolean.parseBoolean(str)) ? false : true);
        } else {
            strMapCustomEventName = mapCustomEventName(sessionEvent.customType);
        }
        io.fabric.sdk.android.Fabric.getLogger().d(com.crashlytics.android.answers.Answers.TAG, "Logging event into firebase...");
        return new com.crashlytics.android.answers.FirebaseAnalyticsEvent(strMapCustomEventName, bundle);
    }

    private java.lang.String mapCustomEventName(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return "fabric_unnamed_event";
        }
        if (EVENT_NAMES.contains(str)) {
            return "fabric_" + str;
        }
        java.lang.String strReplaceAll = str.replaceAll("[^\\p{Alnum}_]+", io.fabric.sdk.android.services.events.EventsFilesManager.ROLL_OVER_FILE_NAME_SEPARATOR);
        if (strReplaceAll.startsWith("ga_") || strReplaceAll.startsWith("google_") || strReplaceAll.startsWith("firebase_") || !java.lang.Character.isLetter(strReplaceAll.charAt(0))) {
            strReplaceAll = "fabric_" + strReplaceAll;
        }
        return strReplaceAll.length() > 40 ? strReplaceAll.substring(0, 40) : strReplaceAll;
    }

    private java.lang.String mapAttribute(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return "fabric_unnamed_parameter";
        }
        java.lang.String strReplaceAll = str.replaceAll("[^\\p{Alnum}_]+", io.fabric.sdk.android.services.events.EventsFilesManager.ROLL_OVER_FILE_NAME_SEPARATOR);
        if (strReplaceAll.startsWith("ga_") || strReplaceAll.startsWith("google_") || strReplaceAll.startsWith("firebase_") || !java.lang.Character.isLetter(strReplaceAll.charAt(0))) {
            strReplaceAll = "fabric_" + strReplaceAll;
        }
        return strReplaceAll.length() > 40 ? strReplaceAll.substring(0, 40) : strReplaceAll;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:29:0x004f  */
    /* JADX WARN: Code duplicated, block: B:6:0x0016  */
    private java.lang.String mapPredefinedEventName(java.lang.String str, boolean z) {
        if (z) {
            str.hashCode();
            switch (str) {
                case "signUp":
                    return "failed_sign_up";
                case "login":
                    return "failed_login";
                case "purchase":
                    return "failed_ecommerce_purchase";
            }
        }
        str.hashCode();
        switch (str) {
            case "levelEnd":
                return com.google.firebase.analytics.FirebaseAnalytics.Event.LEVEL_END;
            case "invite":
                return "invite";
            case "rating":
                return "rate_content";
            case "search":
                return com.google.firebase.analytics.FirebaseAnalytics.Event.SEARCH;
            case "signUp":
                return com.google.firebase.analytics.FirebaseAnalytics.Event.SIGN_UP;
            case "contentView":
                return com.google.firebase.analytics.FirebaseAnalytics.Event.SELECT_CONTENT;
            case "addToCart":
                return com.google.firebase.analytics.FirebaseAnalytics.Event.ADD_TO_CART;
            case "login":
                return com.google.firebase.analytics.FirebaseAnalytics.Event.LOGIN;
            case "share":
                return com.google.firebase.analytics.FirebaseAnalytics.Event.SHARE;
            case "levelStart":
                return com.google.firebase.analytics.FirebaseAnalytics.Event.LEVEL_START;
            case "startCheckout":
                return com.google.firebase.analytics.FirebaseAnalytics.Event.BEGIN_CHECKOUT;
            case "purchase":
                return com.google.firebase.analytics.FirebaseAnalytics.Event.ECOMMERCE_PURCHASE;
            default:
                return mapCustomEventName(str);
        }
    }

    private android.os.Bundle mapPredefinedEvent(com.crashlytics.android.answers.SessionEvent sessionEvent) {
        android.os.Bundle bundle = new android.os.Bundle();
        if ("purchase".equals(sessionEvent.predefinedType)) {
            putString(bundle, com.google.firebase.analytics.FirebaseAnalytics.Param.ITEM_ID, (java.lang.String) sessionEvent.predefinedAttributes.get("itemId"));
            putString(bundle, com.google.firebase.analytics.FirebaseAnalytics.Param.ITEM_NAME, (java.lang.String) sessionEvent.predefinedAttributes.get("itemName"));
            putString(bundle, com.google.firebase.analytics.FirebaseAnalytics.Param.ITEM_CATEGORY, (java.lang.String) sessionEvent.predefinedAttributes.get("itemType"));
            putDouble(bundle, "value", mapPriceValue(sessionEvent.predefinedAttributes.get("itemPrice")));
            putString(bundle, com.google.firebase.analytics.FirebaseAnalytics.Param.CURRENCY, (java.lang.String) sessionEvent.predefinedAttributes.get(com.google.firebase.analytics.FirebaseAnalytics.Param.CURRENCY));
        } else if ("addToCart".equals(sessionEvent.predefinedType)) {
            putString(bundle, com.google.firebase.analytics.FirebaseAnalytics.Param.ITEM_ID, (java.lang.String) sessionEvent.predefinedAttributes.get("itemId"));
            putString(bundle, com.google.firebase.analytics.FirebaseAnalytics.Param.ITEM_NAME, (java.lang.String) sessionEvent.predefinedAttributes.get("itemName"));
            putString(bundle, com.google.firebase.analytics.FirebaseAnalytics.Param.ITEM_CATEGORY, (java.lang.String) sessionEvent.predefinedAttributes.get("itemType"));
            putDouble(bundle, com.google.firebase.analytics.FirebaseAnalytics.Param.PRICE, mapPriceValue(sessionEvent.predefinedAttributes.get("itemPrice")));
            putDouble(bundle, "value", mapPriceValue(sessionEvent.predefinedAttributes.get("itemPrice")));
            putString(bundle, com.google.firebase.analytics.FirebaseAnalytics.Param.CURRENCY, (java.lang.String) sessionEvent.predefinedAttributes.get(com.google.firebase.analytics.FirebaseAnalytics.Param.CURRENCY));
            bundle.putLong(com.google.firebase.analytics.FirebaseAnalytics.Param.QUANTITY, 1L);
        } else if ("startCheckout".equals(sessionEvent.predefinedType)) {
            putLong(bundle, com.google.firebase.analytics.FirebaseAnalytics.Param.QUANTITY, java.lang.Long.valueOf(((java.lang.Integer) sessionEvent.predefinedAttributes.get("itemCount")).intValue()));
            putDouble(bundle, "value", mapPriceValue(sessionEvent.predefinedAttributes.get("totalPrice")));
            putString(bundle, com.google.firebase.analytics.FirebaseAnalytics.Param.CURRENCY, (java.lang.String) sessionEvent.predefinedAttributes.get(com.google.firebase.analytics.FirebaseAnalytics.Param.CURRENCY));
        } else if ("contentView".equals(sessionEvent.predefinedType)) {
            putString(bundle, com.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT_TYPE, (java.lang.String) sessionEvent.predefinedAttributes.get("contentType"));
            putString(bundle, com.google.firebase.analytics.FirebaseAnalytics.Param.ITEM_ID, (java.lang.String) sessionEvent.predefinedAttributes.get("contentId"));
            putString(bundle, com.google.firebase.analytics.FirebaseAnalytics.Param.ITEM_NAME, (java.lang.String) sessionEvent.predefinedAttributes.get("contentName"));
        } else if (com.google.firebase.analytics.FirebaseAnalytics.Event.SEARCH.equals(sessionEvent.predefinedType)) {
            putString(bundle, com.google.firebase.analytics.FirebaseAnalytics.Param.SEARCH_TERM, (java.lang.String) sessionEvent.predefinedAttributes.get(com.google.android.gms.actions.SearchIntents.EXTRA_QUERY));
        } else if (com.google.firebase.analytics.FirebaseAnalytics.Event.SHARE.equals(sessionEvent.predefinedType)) {
            putString(bundle, "method", (java.lang.String) sessionEvent.predefinedAttributes.get("method"));
            putString(bundle, com.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT_TYPE, (java.lang.String) sessionEvent.predefinedAttributes.get("contentType"));
            putString(bundle, com.google.firebase.analytics.FirebaseAnalytics.Param.ITEM_ID, (java.lang.String) sessionEvent.predefinedAttributes.get("contentId"));
            putString(bundle, com.google.firebase.analytics.FirebaseAnalytics.Param.ITEM_NAME, (java.lang.String) sessionEvent.predefinedAttributes.get("contentName"));
        } else if (FIREBASE_RATING.equals(sessionEvent.predefinedType)) {
            putString(bundle, FIREBASE_RATING, java.lang.String.valueOf(sessionEvent.predefinedAttributes.get(FIREBASE_RATING)));
            putString(bundle, com.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT_TYPE, (java.lang.String) sessionEvent.predefinedAttributes.get("contentType"));
            putString(bundle, com.google.firebase.analytics.FirebaseAnalytics.Param.ITEM_ID, (java.lang.String) sessionEvent.predefinedAttributes.get("contentId"));
            putString(bundle, com.google.firebase.analytics.FirebaseAnalytics.Param.ITEM_NAME, (java.lang.String) sessionEvent.predefinedAttributes.get("contentName"));
        } else if ("signUp".equals(sessionEvent.predefinedType) || com.google.firebase.analytics.FirebaseAnalytics.Event.LOGIN.equals(sessionEvent.predefinedType) || "invite".equals(sessionEvent.predefinedType)) {
            putString(bundle, "method", (java.lang.String) sessionEvent.predefinedAttributes.get("method"));
        } else if ("levelStart".equals(sessionEvent.predefinedType)) {
            putString(bundle, "level_name", (java.lang.String) sessionEvent.predefinedAttributes.get("levelName"));
        } else if ("levelEnd".equals(sessionEvent.predefinedType)) {
            putDouble(bundle, com.google.firebase.analytics.FirebaseAnalytics.Param.SCORE, mapDouble(sessionEvent.predefinedAttributes.get(com.google.firebase.analytics.FirebaseAnalytics.Param.SCORE)));
            putString(bundle, "level_name", (java.lang.String) sessionEvent.predefinedAttributes.get("levelName"));
            putInt(bundle, "success", mapBooleanValue((java.lang.String) sessionEvent.predefinedAttributes.get("success")));
        }
        mapCustomEventAttributes(bundle, sessionEvent.customAttributes);
        return bundle;
    }

    private void putLong(android.os.Bundle bundle, java.lang.String str, java.lang.Long l) {
        if (l == null) {
            return;
        }
        bundle.putLong(str, l.longValue());
    }

    private void putInt(android.os.Bundle bundle, java.lang.String str, java.lang.Integer num) {
        if (num == null) {
            return;
        }
        bundle.putInt(str, num.intValue());
    }

    private void putString(android.os.Bundle bundle, java.lang.String str, java.lang.String str2) {
        if (str2 == null) {
            return;
        }
        bundle.putString(str, str2);
    }

    private void putDouble(android.os.Bundle bundle, java.lang.String str, java.lang.Double d) {
        java.lang.Double dMapDouble = mapDouble(d);
        if (dMapDouble == null) {
            return;
        }
        bundle.putDouble(str, dMapDouble.doubleValue());
    }

    private java.lang.Double mapDouble(java.lang.Object obj) {
        java.lang.String strValueOf = java.lang.String.valueOf(obj);
        if (strValueOf == null) {
            return null;
        }
        return java.lang.Double.valueOf(strValueOf);
    }

    private java.lang.Integer mapBooleanValue(java.lang.String str) {
        if (str == null) {
            return null;
        }
        return java.lang.Integer.valueOf(str.equals("true") ? 1 : 0);
    }

    private java.lang.Double mapPriceValue(java.lang.Object obj) {
        java.lang.Long l = (java.lang.Long) obj;
        if (l == null) {
            return null;
        }
        return java.lang.Double.valueOf(new java.math.BigDecimal(l.longValue()).divide(com.crashlytics.android.answers.AddToCartEvent.MICRO_CONSTANT).doubleValue());
    }

    private void mapCustomEventAttributes(android.os.Bundle bundle, java.util.Map<java.lang.String, java.lang.Object> map) {
        for (java.util.Map.Entry<java.lang.String, java.lang.Object> entry : map.entrySet()) {
            java.lang.Object value = entry.getValue();
            java.lang.String strMapAttribute = mapAttribute(entry.getKey());
            if (value instanceof java.lang.String) {
                bundle.putString(strMapAttribute, entry.getValue().toString());
            } else if (value instanceof java.lang.Double) {
                bundle.putDouble(strMapAttribute, ((java.lang.Double) entry.getValue()).doubleValue());
            } else if (value instanceof java.lang.Long) {
                bundle.putLong(strMapAttribute, ((java.lang.Long) entry.getValue()).longValue());
            } else if (value instanceof java.lang.Integer) {
                bundle.putInt(strMapAttribute, ((java.lang.Integer) entry.getValue()).intValue());
            }
        }
    }
}
