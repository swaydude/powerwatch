package powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts;

/* JADX INFO: compiled from: SentAlertsCache.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0006J\u0010\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\rJ\u0006\u0010\u000e\u001a\u00020\tJ\u000e\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u000f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u0006J\u0006\u0010\u0012\u001a\u00020\tJ\b\u0010\u0013\u001a\u00020\u0011H\u0002J\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u00152\u0006\u0010\u0010\u001a\u00020\u0011R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/SentAlertsCache;", "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;", "()V", "cache", "Ljava/util/SortedMap;", "", "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertCacheInfo;", "removeThreshold", "add", "", "alertId", "cleanCache", "removeFirst", "", "clearCache", "contains", io.fabric.sdk.android.services.settings.SettingsJsonConstants.PROMPT_TITLE_KEY, "", "dump", "dumpCache", "fetchAndRemove", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class SentAlertsCache implements powerwatch.matrix.com.pwgen2android.shared.logger.Loggable {
    private final java.util.SortedMap<java.lang.Long, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertCacheInfo> cache = new java.util.TreeMap();
    private final long removeThreshold = 86400000;

    @Override // org.koin.core.KoinComponent
    public org.koin.core.Koin getKoin() {
        return powerwatch.matrix.com.pwgen2android.shared.logger.Loggable.DefaultImpls.getKoin(this);
    }

    public final void clearCache() {
        this.cache.clear();
    }

    public static /* synthetic */ void cleanCache$default(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.SentAlertsCache sentAlertsCache, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        sentAlertsCache.cleanCache(z);
    }

    public final void cleanCache(boolean removeFirst) {
        final long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        if (this.cache.isEmpty()) {
            return;
        }
        java.util.Set<java.lang.Long> setKeySet = this.cache.keySet();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(setKeySet, "cache.keys");
        boolean zRemoveAll = kotlin.collections.CollectionsKt.removeAll(setKeySet, new kotlin.jvm.functions.Function1<java.lang.Long, java.lang.Boolean>() { // from class: powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.SentAlertsCache$cleanCache$removed$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ java.lang.Boolean invoke(java.lang.Long l) {
                return java.lang.Boolean.valueOf(invoke2(l));
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final boolean invoke2(java.lang.Long it) {
                long j = jCurrentTimeMillis;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(it, "it");
                return j - it.longValue() >= this.removeThreshold;
            }
        });
        if (removeFirst && (!this.cache.isEmpty()) && !zRemoveAll) {
            java.util.SortedMap<java.lang.Long, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertCacheInfo> sortedMap = this.cache;
            sortedMap.remove(sortedMap.firstKey());
        }
    }

    public final java.util.List<powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertCacheInfo> fetchAndRemove(final java.lang.String title) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "title");
        java.util.Collection<powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertCacheInfo> collectionValues = this.cache.values();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(collectionValues, "this.cache.values");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : collectionValues) {
            powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertCacheInfo alertCacheInfo = (powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertCacheInfo) obj;
            if (alertCacheInfo.isMessage() && kotlin.jvm.internal.Intrinsics.areEqual(alertCacheInfo.getTitle(), title)) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = arrayList;
        java.util.Collection<powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertCacheInfo> collectionValues2 = this.cache.values();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(collectionValues2, "this.cache.values");
        kotlin.collections.CollectionsKt.removeAll(collectionValues2, new kotlin.jvm.functions.Function1<powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertCacheInfo, java.lang.Boolean>() { // from class: powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.SentAlertsCache.fetchAndRemove.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ java.lang.Boolean invoke(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertCacheInfo alertCacheInfo2) {
                return java.lang.Boolean.valueOf(invoke2(alertCacheInfo2));
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final boolean invoke2(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertCacheInfo alertCacheInfo2) {
                return alertCacheInfo2.isMessage() && kotlin.jvm.internal.Intrinsics.areEqual(alertCacheInfo2.getTitle(), title);
            }
        });
        return arrayList2;
    }

    public final boolean contains(java.lang.String title) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "title");
        java.util.Collection<powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertCacheInfo> collectionValues = this.cache.values();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(collectionValues, "this.cache.values");
        java.util.Collection<powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertCacheInfo> collection = collectionValues;
        if (!collection.isEmpty()) {
            for (powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertCacheInfo alertCacheInfo : collection) {
                if (alertCacheInfo.isMessage() && kotlin.jvm.internal.Intrinsics.areEqual(alertCacheInfo.getTitle(), title)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void add(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertCacheInfo alertId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(alertId, "alertId");
        if (this.cache.size() == 40) {
            powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this, "Cleaning cache", null, 2, null);
            cleanCache(true);
        }
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this, kotlin.jvm.internal.Intrinsics.stringPlus("Adding alert to cache, ", alertId), null, 2, null);
        this.cache.put(java.lang.Long.valueOf(alertId.getTime()), alertId);
    }

    public final boolean contains(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertCacheInfo alertId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(alertId, "alertId");
        java.util.Collection<powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertCacheInfo> collectionValues = this.cache.values();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(collectionValues, "cache.values");
        java.util.Collection<powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertCacheInfo> collection = collectionValues;
        boolean z = true;
        if (!collection.isEmpty()) {
            java.util.Iterator<T> it = collection.iterator();
            do {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
            } while (!(((powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertCacheInfo) it.next()).getAlertId() == alertId.getAlertId()));
        } else {
            z = false;
            break;
        }
        powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.SentAlertsCache sentAlertsCache = this;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("Examining alert: ");
        sb.append(alertId);
        sb.append(", result is ");
        sb.append(z ? "found" : "not found");
        sb.append(", cache: ");
        sb.append(dumpCache());
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(sentAlertsCache, sb.toString(), null, 2, null);
        return z;
    }

    public final void dump() {
        java.util.Iterator<java.util.Map.Entry<java.lang.Long, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertCacheInfo>> it = this.cache.entrySet().iterator();
        while (it.hasNext()) {
            java.lang.System.out.println((java.lang.Object) java.lang.String.valueOf(it.next()));
        }
    }

    private final java.lang.String dumpCache() {
        java.util.SortedMap<java.lang.Long, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertCacheInfo> sortedMap = this.cache;
        java.util.ArrayList arrayList = new java.util.ArrayList(sortedMap.size());
        for (java.util.Map.Entry<java.lang.Long, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertCacheInfo> entry : sortedMap.entrySet()) {
            arrayList.add(entry.getKey() + " -> " + entry.getValue().getAlertId());
        }
        java.util.ArrayList arrayList2 = arrayList;
        if (!(!arrayList2.isEmpty())) {
            arrayList2 = null;
        }
        if (arrayList2 == null) {
            return " empty";
        }
        java.util.Iterator it = arrayList2.iterator();
        if (!it.hasNext()) {
            throw new java.lang.UnsupportedOperationException("Empty collection can't be reduced.");
        }
        java.lang.Object next = it.next();
        while (it.hasNext()) {
            next = ((java.lang.String) next) + '\n' + ((java.lang.String) it.next());
        }
        java.lang.String str = (java.lang.String) next;
        return str == null ? " empty" : str;
    }
}
