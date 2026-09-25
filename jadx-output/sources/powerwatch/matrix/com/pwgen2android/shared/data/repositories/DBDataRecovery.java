package powerwatch.matrix.com.pwgen2android.shared.data.repositories;

/* JADX INFO: compiled from: DBDataRecovery.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0002J\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rJ\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\nJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0014\u001a\u00020\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0015"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DBDataRecovery;", "", "appContext", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getAppContext", "()Landroid/content/Context;", "database", "", "loadActivities", "", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;", "startTime", "", "endTime", com.google.android.gms.actions.SearchIntents.EXTRA_QUERY, "db", "Lnet/sqlcipher/database/SQLiteDatabase;", "loadNotSyncedActivities", "loadSingleActivity", powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.UserActivityDetailsFragment.ACTIVITY_ID, "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class DBDataRecovery {
    private final android.content.Context appContext;

    public DBDataRecovery(android.content.Context appContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appContext, "appContext");
        this.appContext = appContext;
    }

    public final android.content.Context getAppContext() {
        return this.appContext;
    }

    private final java.lang.String database() {
        java.lang.String absolutePath = this.appContext.getDatabasePath("PowerWatchDB").getAbsolutePath();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(absolutePath, "appContext.getDatabasePath(\"PowerWatchDB\").absolutePath");
        return absolutePath;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x015b  */
    private final java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession> loadActivities(java.lang.String query, net.sqlcipher.database.SQLiteDatabase db) {
        java.util.ArrayList arrayList;
        java.lang.String str = "email";
        java.lang.String str2 = "notes";
        java.lang.String str3 = "locationName";
        java.lang.String str4 = com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME;
        java.lang.String str5 = "id";
        net.sqlcipher.Cursor cursorRawQuery = db.rawQuery(query, (java.lang.String[]) null);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        if (cursorRawQuery != null) {
            try {
                cursorRawQuery.moveToFirst();
                if (cursorRawQuery.getCount() > 0) {
                    while (true) {
                        int columnIndex = cursorRawQuery.getColumnIndex(str5);
                        int columnIndex2 = cursorRawQuery.getColumnIndex(str4);
                        int columnIndex3 = cursorRawQuery.getColumnIndex("activityType");
                        int columnIndex4 = cursorRawQuery.getColumnIndex(str3);
                        int columnIndex5 = cursorRawQuery.getColumnIndex("distance");
                        int columnIndex6 = cursorRawQuery.getColumnIndex("steps");
                        int columnIndex7 = cursorRawQuery.getColumnIndex("startTime");
                        int columnIndex8 = cursorRawQuery.getColumnIndex("endTime");
                        int columnIndex9 = cursorRawQuery.getColumnIndex("pace");
                        java.util.ArrayList arrayList3 = arrayList2;
                        int columnIndex10 = cursorRawQuery.getColumnIndex("activeCalories");
                        java.lang.String str6 = str3;
                        int columnIndex11 = cursorRawQuery.getColumnIndex("bmrCalories");
                        java.lang.String str7 = str4;
                        int columnIndex12 = cursorRawQuery.getColumnIndex("splits");
                        java.lang.String str8 = str5;
                        int columnIndex13 = cursorRawQuery.getColumnIndex("gpsPositions");
                        int columnIndex14 = cursorRawQuery.getColumnIndex("heartRates");
                        int columnIndex15 = cursorRawQuery.getColumnIndex(str2);
                        java.lang.String str9 = str2;
                        int columnIndex16 = cursorRawQuery.getColumnIndex("shouldSend");
                        int columnIndex17 = cursorRawQuery.getColumnIndex(str);
                        java.lang.String string = cursorRawQuery.getString(columnIndex);
                        java.lang.String string2 = cursorRawQuery.getString(columnIndex2);
                        java.lang.String str10 = str;
                        powerwatch.matrix.com.pwgen2android.shared.data.db.UserActivitySessionConverter userActivitySessionConverter = new powerwatch.matrix.com.pwgen2android.shared.data.db.UserActivitySessionConverter();
                        java.lang.String typeString = cursorRawQuery.getString(columnIndex3);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(typeString, "typeString");
                        powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivityType activityType = userActivitySessionConverter.toActivityType(typeString);
                        java.lang.String string3 = cursorRawQuery.getString(columnIndex4);
                        float f = cursorRawQuery.getFloat(columnIndex5);
                        int i = cursorRawQuery.getInt(columnIndex6);
                        long j = cursorRawQuery.getLong(columnIndex7);
                        long j2 = cursorRawQuery.getLong(columnIndex8);
                        float f2 = cursorRawQuery.getFloat(columnIndex9);
                        int i2 = cursorRawQuery.getInt(columnIndex10);
                        int i3 = cursorRawQuery.getInt(columnIndex11);
                        java.lang.String splitsString = cursorRawQuery.getString(columnIndex12);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(splitsString, "splitsString");
                        java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.RunningSplit> runningSplits = userActivitySessionConverter.toRunningSplits(splitsString);
                        java.lang.String gpsPositionString = cursorRawQuery.getString(columnIndex13);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(gpsPositionString, "gpsPositionString");
                        java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.GPSPosition> gPSPositions = userActivitySessionConverter.toGPSPositions(gpsPositionString);
                        java.lang.String heartRatesString = cursorRawQuery.getString(columnIndex14);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(heartRatesString, "heartRatesString");
                        java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.HeartRate> heartRates = userActivitySessionConverter.toHeartRates(heartRatesString);
                        boolean z = cursorRawQuery.getInt(columnIndex16) != 0;
                        java.lang.String string4 = cursorRawQuery.getString(columnIndex17);
                        java.lang.String string5 = cursorRawQuery.getString(columnIndex15);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, str8);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, str7);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string3, str6);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string5, str9);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string4, str10);
                        powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession userActivitySession = new powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession(string, string2, activityType, string3, f, i, j, j2, f2, i2, i3, runningSplits, gPSPositions, heartRates, string5, z, string4);
                        arrayList = arrayList3;
                        arrayList.add(userActivitySession);
                        if (!cursorRawQuery.moveToNext()) {
                            break;
                        }
                        str5 = str8;
                        str4 = str7;
                        str3 = str6;
                        str2 = str9;
                        arrayList2 = arrayList;
                        str = str10;
                    }
                } else {
                    arrayList = arrayList2;
                }
            } finally {
                cursorRawQuery.close();
                db.close();
            }
        } else {
            arrayList = arrayList2;
        }
        return arrayList;
    }

    public final java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession> loadNotSyncedActivities() {
        net.sqlcipher.database.SQLiteDatabase.loadLibs(this.appContext);
        net.sqlcipher.database.SQLiteDatabase db = net.sqlcipher.database.SQLiteDatabase.openDatabase(database(), "", (net.sqlcipher.database.SQLiteDatabase.CursorFactory) null, 1);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(db, "db");
        return loadActivities("SELECT * FROM UserActivitySession WHERE shouldSend = 1", db);
    }

    public final powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession loadSingleActivity(java.lang.String activityId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityId, "activityId");
        net.sqlcipher.database.SQLiteDatabase.loadLibs(this.appContext);
        net.sqlcipher.database.SQLiteDatabase db = net.sqlcipher.database.SQLiteDatabase.openDatabase(database(), "", (net.sqlcipher.database.SQLiteDatabase.CursorFactory) null, 1);
        java.lang.String str = "SELECT * FROM UserActivitySession WHERE id = '" + activityId + '\'';
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(db, "db");
        return (powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) loadActivities(str, db));
    }

    public final java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession> loadActivities(long startTime, long endTime) {
        net.sqlcipher.database.SQLiteDatabase.loadLibs(this.appContext);
        net.sqlcipher.database.SQLiteDatabase db = net.sqlcipher.database.SQLiteDatabase.openDatabase(database(), "", (net.sqlcipher.database.SQLiteDatabase.CursorFactory) null, 1);
        java.lang.String str = "SELECT * FROM UserActivitySession WHERE startTime >= " + startTime + " AND startTime < " + endTime;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(db, "db");
        return loadActivities(str, db);
    }
}
