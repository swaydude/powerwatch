package powerwatch.matrix.com.pwgen2android.shared.data.db;

/* JADX INFO: loaded from: classes3.dex */
public final class RoomDB_Impl extends powerwatch.matrix.com.pwgen2android.shared.data.db.RoomDB {
    private volatile powerwatch.matrix.com.pwgen2android.shared.data.db.DefaultPhoneWatchDao _defaultPhoneWatchDao;
    private volatile powerwatch.matrix.com.pwgen2android.shared.data.db.DeviceDao _deviceDao;
    private volatile powerwatch.matrix.com.pwgen2android.shared.data.db.GoalConfigurationDao _goalConfigurationDao;
    private volatile powerwatch.matrix.com.pwgen2android.shared.data.db.activityPeriods.RestingHourPeriodDao _restingHourPeriodDao;
    private volatile powerwatch.matrix.com.pwgen2android.shared.data.db.activityLogs.RestingLogDao _restingLogDao;
    private volatile powerwatch.matrix.com.pwgen2android.shared.data.db.activityPeriods.SleepHourPeriodDao _sleepHourPeriodDao;
    private volatile powerwatch.matrix.com.pwgen2android.shared.data.db.activityLogs.SleepLogDao _sleepLogDao;
    private volatile powerwatch.matrix.com.pwgen2android.shared.cloud.auth.TokenStorage _tokenStorage;
    private volatile powerwatch.matrix.com.pwgen2android.shared.data.db.UpdateInfoDao _updateInfoDao;
    private volatile powerwatch.matrix.com.pwgen2android.shared.data.db.activitySessions.UserActivitySessionDao _userActivitySessionDao;
    private volatile powerwatch.matrix.com.pwgen2android.shared.data.db.UserDao _userDao;
    private volatile powerwatch.matrix.com.pwgen2android.shared.data.db.activityPeriods.WalkingHourPeriodDao _walkingHourPeriodDao;
    private volatile powerwatch.matrix.com.pwgen2android.shared.data.db.activityLogs.WalkingLogDao _walkingLogDao;

    @Override // androidx.room.RoomDatabase
    protected androidx.sqlite.db.SupportSQLiteOpenHelper createOpenHelper(androidx.room.DatabaseConfiguration configuration) {
        return configuration.sqliteOpenHelperFactory.create(androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration.builder(configuration.context).name(configuration.name).callback(new androidx.room.RoomOpenHelper(configuration, new androidx.room.RoomOpenHelper.Delegate(23) { // from class: powerwatch.matrix.com.pwgen2android.shared.data.db.RoomDB_Impl.1
            @Override // androidx.room.RoomOpenHelper.Delegate
            public void onPostMigrate(androidx.sqlite.db.SupportSQLiteDatabase _db) {
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public void createAllTables(androidx.sqlite.db.SupportSQLiteDatabase _db) {
                _db.execSQL("CREATE TABLE IF NOT EXISTS `PasswordCredentials` (`uid` INTEGER NOT NULL, `accessToken` TEXT NOT NULL, `tokenType` TEXT NOT NULL, `refreshToken` TEXT NOT NULL, `expiresIn` INTEGER NOT NULL, `scope` TEXT NOT NULL, `tokenValidUntil` INTEGER NOT NULL, `email` TEXT, `password` TEXT, PRIMARY KEY(`uid`))");
                _db.execSQL("CREATE TABLE IF NOT EXISTS `User` (`uid` INTEGER NOT NULL, `enabled` INTEGER NOT NULL, `name` TEXT NOT NULL, `email` TEXT NOT NULL, `password` TEXT, `age` INTEGER NOT NULL, `height` INTEGER NOT NULL, `weight` REAL NOT NULL, `gender` TEXT NOT NULL, `shouldSync` INTEGER NOT NULL, `language` TEXT NOT NULL, `unitType` TEXT NOT NULL, `timeFormatType` INTEGER NOT NULL, PRIMARY KEY(`uid`))");
                _db.execSQL("CREATE TABLE IF NOT EXISTS `Device` (`uid` INTEGER NOT NULL, `serialNumber` TEXT NOT NULL, `bluetoothAddress` TEXT NOT NULL, `pid` INTEGER NOT NULL, `firmwareVersion` TEXT NOT NULL, `productName` TEXT NOT NULL, `shouldSync` INTEGER, `callNotification` INTEGER NOT NULL, `messageNotification` INTEGER NOT NULL, `activityGoalNotification` INTEGER NOT NULL, `alarmNotification` INTEGER NOT NULL, PRIMARY KEY(`uid`))");
                _db.execSQL("CREATE TABLE IF NOT EXISTS `WalkingHourPeriod` (`startTime` INTEGER NOT NULL, `endTime` INTEGER NOT NULL, `hourInDay` INTEGER NOT NULL, `maxHeartRate` INTEGER NOT NULL, `minHeartRate` INTEGER NOT NULL, `heartRate` REAL NOT NULL, `skinTemp` REAL NOT NULL, `maxSkinTemp` REAL NOT NULL, `minSkinTemp` REAL NOT NULL, `bodyPower` REAL NOT NULL, `solarPower` REAL NOT NULL, `hrv` REAL NOT NULL, `peakTemp` REAL NOT NULL, `activeCalories` INTEGER NOT NULL, `steps` INTEGER NOT NULL, `distance` REAL NOT NULL, `lastUpdated` INTEGER NOT NULL, `minsInPeriod` INTEGER NOT NULL, `bmrCalories` INTEGER NOT NULL, `caseTemp` REAL NOT NULL, `minCaseTemp` REAL NOT NULL, `maxCaseTemp` REAL NOT NULL, PRIMARY KEY(`startTime`))");
                _db.execSQL("CREATE TABLE IF NOT EXISTS `RestingHourPeriod` (`startTime` INTEGER NOT NULL, `endTime` INTEGER NOT NULL, `hourInDay` INTEGER NOT NULL, `heartRate` REAL NOT NULL, `maxHeartRate` INTEGER NOT NULL, `minHeartRate` INTEGER NOT NULL, `hrv` REAL NOT NULL, `skinTemp` REAL NOT NULL, `maxSkinTemp` REAL NOT NULL, `minSkinTemp` REAL NOT NULL, `bodyPower` REAL NOT NULL, `solarPower` REAL NOT NULL, `peakTemp` REAL NOT NULL, `activeCalories` INTEGER NOT NULL, `lastUpdated` INTEGER NOT NULL, `minsInPeriod` INTEGER NOT NULL, `bmrCalories` INTEGER NOT NULL, `caseTemp` REAL NOT NULL, `minCaseTemp` REAL NOT NULL, `maxCaseTemp` REAL NOT NULL, PRIMARY KEY(`startTime`))");
                _db.execSQL("CREATE TABLE IF NOT EXISTS `SleepHourPeriod` (`startTime` INTEGER NOT NULL, `endTime` INTEGER NOT NULL, `heartRate` REAL NOT NULL, `maxHeartRate` INTEGER NOT NULL, `minHeartRate` INTEGER NOT NULL, `skinTemp` REAL NOT NULL, `maxSkinTemp` REAL NOT NULL, `minSkinTemp` REAL NOT NULL, `hrv` REAL NOT NULL, `bodyPower` REAL NOT NULL, `solarPower` REAL NOT NULL, `peakTemp` REAL NOT NULL, `activeCalories` INTEGER NOT NULL, `hourInDay` INTEGER NOT NULL, `restlessMinutes` INTEGER NOT NULL, `sleepFiveMins` TEXT NOT NULL, `sleepType` TEXT NOT NULL, `lastUpdated` INTEGER NOT NULL, `minsInPeriod` INTEGER NOT NULL, `bmrCalories` INTEGER NOT NULL, `caseTemp` REAL NOT NULL, `minCaseTemp` REAL NOT NULL, `maxCaseTemp` REAL NOT NULL, PRIMARY KEY(`startTime`))");
                _db.execSQL("CREATE TABLE IF NOT EXISTS `GoalConfiguration` (`id` INTEGER NOT NULL, `calories` INTEGER NOT NULL, `distance` REAL NOT NULL, `power` INTEGER NOT NULL, `sleep` INTEGER NOT NULL, `steps` INTEGER NOT NULL, `createdAt` INTEGER NOT NULL, `shouldSync` INTEGER NOT NULL, PRIMARY KEY(`id`))");
                _db.execSQL("CREATE TABLE IF NOT EXISTS `WalkingLog` (`startTime` INTEGER NOT NULL, `steps` INTEGER NOT NULL, `distance` REAL NOT NULL, `endTime` INTEGER NOT NULL, `heartRate` REAL NOT NULL, `bodyPower` REAL NOT NULL, `solarPower` REAL NOT NULL, `skinTemp` REAL NOT NULL, `maxSkinTemp` REAL NOT NULL, `minSkinTemp` REAL NOT NULL, `caseTemp` REAL NOT NULL, `maxCaseTemp` REAL NOT NULL, `minCaseTemp` REAL NOT NULL, `activeCalories` INTEGER NOT NULL, `hrv` REAL NOT NULL, `shouldSend` INTEGER NOT NULL, `bmrCalories` INTEGER NOT NULL, `minHeartRate` INTEGER NOT NULL, `maxHeartRate` INTEGER NOT NULL, `email` TEXT NOT NULL, PRIMARY KEY(`startTime`))");
                _db.execSQL("CREATE TABLE IF NOT EXISTS `SleepLog` (`startTime` INTEGER NOT NULL, `endTime` INTEGER NOT NULL, `heartRate` REAL NOT NULL, `bodyPower` REAL NOT NULL, `solarPower` REAL NOT NULL, `skinTemp` REAL NOT NULL, `maxSkinTemp` REAL NOT NULL, `minSkinTemp` REAL NOT NULL, `caseTemp` REAL NOT NULL, `maxCaseTemp` REAL NOT NULL, `minCaseTemp` REAL NOT NULL, `activeCalories` INTEGER NOT NULL, `sleepType` TEXT NOT NULL, `hrv` REAL NOT NULL, `shouldSend` INTEGER NOT NULL, `bmrCalories` INTEGER NOT NULL, `minHeartRate` INTEGER NOT NULL, `maxHeartRate` INTEGER NOT NULL, `email` TEXT NOT NULL, `minsInPeriod` INTEGER NOT NULL, PRIMARY KEY(`startTime`))");
                _db.execSQL("CREATE TABLE IF NOT EXISTS `RestingLog` (`startTime` INTEGER NOT NULL, `endTime` INTEGER NOT NULL, `heartRate` REAL NOT NULL, `bodyPower` REAL NOT NULL, `solarPower` REAL NOT NULL, `skinTemp` REAL NOT NULL, `maxSkinTemp` REAL NOT NULL, `minSkinTemp` REAL NOT NULL, `caseTemp` REAL NOT NULL, `maxCaseTemp` REAL NOT NULL, `minCaseTemp` REAL NOT NULL, `activeCalories` INTEGER NOT NULL, `hrv` REAL NOT NULL, `shouldSend` INTEGER NOT NULL, `bmrCalories` INTEGER NOT NULL, `minHeartRate` INTEGER NOT NULL, `maxHeartRate` INTEGER NOT NULL, `email` TEXT NOT NULL, PRIMARY KEY(`startTime`))");
                _db.execSQL("CREATE TABLE IF NOT EXISTS `UserActivitySession` (`id` TEXT NOT NULL, `name` TEXT NOT NULL, `activityType` TEXT NOT NULL, `locationName` TEXT NOT NULL, `distance` REAL NOT NULL, `steps` INTEGER NOT NULL, `startTime` INTEGER NOT NULL, `endTime` INTEGER NOT NULL, `pace` REAL NOT NULL, `activeCalories` INTEGER NOT NULL, `bmrCalories` INTEGER NOT NULL, `splits` TEXT NOT NULL, `gpsPositions` TEXT NOT NULL, `heartRates` TEXT NOT NULL, `notes` TEXT NOT NULL, `shouldSend` INTEGER NOT NULL, `email` TEXT NOT NULL, PRIMARY KEY(`id`))");
                _db.execSQL("CREATE TABLE IF NOT EXISTS `DefaultPhoneWatch` (`uid` INTEGER NOT NULL, `bluetoothAddress` TEXT NOT NULL, `serialNumber` TEXT NOT NULL, PRIMARY KEY(`uid`))");
                _db.execSQL("CREATE TABLE IF NOT EXISTS `UpdateInfo` (`uid` INTEGER NOT NULL, `pid` INTEGER NOT NULL, `releaseNotes` TEXT NOT NULL, `language` TEXT NOT NULL, `releaseVersion` TEXT NOT NULL, `downloadUrl` TEXT NOT NULL, `mandatory` INTEGER NOT NULL, `forced` INTEGER NOT NULL, `releaseDate` TEXT, PRIMARY KEY(`uid`))");
                _db.execSQL("CREATE TABLE IF NOT EXISTS `UserActivityDate` (`startTime` INTEGER NOT NULL, PRIMARY KEY(`startTime`))");
                _db.execSQL(androidx.room.RoomMasterTable.CREATE_QUERY);
                _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '7eea0e60d59cd2ba54d78e05b0b90fa3')");
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public void dropAllTables(androidx.sqlite.db.SupportSQLiteDatabase _db) {
                _db.execSQL("DROP TABLE IF EXISTS `PasswordCredentials`");
                _db.execSQL("DROP TABLE IF EXISTS `User`");
                _db.execSQL("DROP TABLE IF EXISTS `Device`");
                _db.execSQL("DROP TABLE IF EXISTS `WalkingHourPeriod`");
                _db.execSQL("DROP TABLE IF EXISTS `RestingHourPeriod`");
                _db.execSQL("DROP TABLE IF EXISTS `SleepHourPeriod`");
                _db.execSQL("DROP TABLE IF EXISTS `GoalConfiguration`");
                _db.execSQL("DROP TABLE IF EXISTS `WalkingLog`");
                _db.execSQL("DROP TABLE IF EXISTS `SleepLog`");
                _db.execSQL("DROP TABLE IF EXISTS `RestingLog`");
                _db.execSQL("DROP TABLE IF EXISTS `UserActivitySession`");
                _db.execSQL("DROP TABLE IF EXISTS `DefaultPhoneWatch`");
                _db.execSQL("DROP TABLE IF EXISTS `UpdateInfo`");
                _db.execSQL("DROP TABLE IF EXISTS `UserActivityDate`");
                if (powerwatch.matrix.com.pwgen2android.shared.data.db.RoomDB_Impl.this.mCallbacks != null) {
                    int size = powerwatch.matrix.com.pwgen2android.shared.data.db.RoomDB_Impl.this.mCallbacks.size();
                    for (int i = 0; i < size; i++) {
                        ((androidx.room.RoomDatabase.Callback) powerwatch.matrix.com.pwgen2android.shared.data.db.RoomDB_Impl.this.mCallbacks.get(i)).onDestructiveMigration(_db);
                    }
                }
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            protected void onCreate(androidx.sqlite.db.SupportSQLiteDatabase _db) {
                if (powerwatch.matrix.com.pwgen2android.shared.data.db.RoomDB_Impl.this.mCallbacks != null) {
                    int size = powerwatch.matrix.com.pwgen2android.shared.data.db.RoomDB_Impl.this.mCallbacks.size();
                    for (int i = 0; i < size; i++) {
                        ((androidx.room.RoomDatabase.Callback) powerwatch.matrix.com.pwgen2android.shared.data.db.RoomDB_Impl.this.mCallbacks.get(i)).onCreate(_db);
                    }
                }
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public void onOpen(androidx.sqlite.db.SupportSQLiteDatabase _db) {
                powerwatch.matrix.com.pwgen2android.shared.data.db.RoomDB_Impl.this.mDatabase = _db;
                powerwatch.matrix.com.pwgen2android.shared.data.db.RoomDB_Impl.this.internalInitInvalidationTracker(_db);
                if (powerwatch.matrix.com.pwgen2android.shared.data.db.RoomDB_Impl.this.mCallbacks != null) {
                    int size = powerwatch.matrix.com.pwgen2android.shared.data.db.RoomDB_Impl.this.mCallbacks.size();
                    for (int i = 0; i < size; i++) {
                        ((androidx.room.RoomDatabase.Callback) powerwatch.matrix.com.pwgen2android.shared.data.db.RoomDB_Impl.this.mCallbacks.get(i)).onOpen(_db);
                    }
                }
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public void onPreMigrate(androidx.sqlite.db.SupportSQLiteDatabase _db) {
                androidx.room.util.DBUtil.dropFtsSyncTriggers(_db);
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            protected androidx.room.RoomOpenHelper.ValidationResult onValidateSchema(androidx.sqlite.db.SupportSQLiteDatabase _db) {
                java.util.HashMap map = new java.util.HashMap(9);
                map.put("uid", new androidx.room.util.TableInfo.Column("uid", "INTEGER", true, 1, null, 1));
                map.put("accessToken", new androidx.room.util.TableInfo.Column("accessToken", "TEXT", true, 0, null, 1));
                map.put("tokenType", new androidx.room.util.TableInfo.Column("tokenType", "TEXT", true, 0, null, 1));
                map.put("refreshToken", new androidx.room.util.TableInfo.Column("refreshToken", "TEXT", true, 0, null, 1));
                map.put("expiresIn", new androidx.room.util.TableInfo.Column("expiresIn", "INTEGER", true, 0, null, 1));
                map.put("scope", new androidx.room.util.TableInfo.Column("scope", "TEXT", true, 0, null, 1));
                map.put("tokenValidUntil", new androidx.room.util.TableInfo.Column("tokenValidUntil", "INTEGER", true, 0, null, 1));
                map.put("email", new androidx.room.util.TableInfo.Column("email", "TEXT", false, 0, null, 1));
                map.put("password", new androidx.room.util.TableInfo.Column("password", "TEXT", false, 0, null, 1));
                androidx.room.util.TableInfo tableInfo = new androidx.room.util.TableInfo("PasswordCredentials", map, new java.util.HashSet(0), new java.util.HashSet(0));
                androidx.room.util.TableInfo tableInfo2 = androidx.room.util.TableInfo.read(_db, "PasswordCredentials");
                if (!tableInfo.equals(tableInfo2)) {
                    return new androidx.room.RoomOpenHelper.ValidationResult(false, "PasswordCredentials(powerwatch.matrix.com.pwgen2android.shared.cloud.auth.PasswordCredentials).\n Expected:\n" + tableInfo + "\n Found:\n" + tableInfo2);
                }
                java.util.HashMap map2 = new java.util.HashMap(13);
                map2.put("uid", new androidx.room.util.TableInfo.Column("uid", "INTEGER", true, 1, null, 1));
                map2.put("enabled", new androidx.room.util.TableInfo.Column("enabled", "INTEGER", true, 0, null, 1));
                map2.put(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME, new androidx.room.util.TableInfo.Column(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME, "TEXT", true, 0, null, 1));
                map2.put("email", new androidx.room.util.TableInfo.Column("email", "TEXT", true, 0, null, 1));
                map2.put("password", new androidx.room.util.TableInfo.Column("password", "TEXT", false, 0, null, 1));
                map2.put("age", new androidx.room.util.TableInfo.Column("age", "INTEGER", true, 0, null, 1));
                map2.put(io.fabric.sdk.android.services.settings.SettingsJsonConstants.ICON_HEIGHT_KEY, new androidx.room.util.TableInfo.Column(io.fabric.sdk.android.services.settings.SettingsJsonConstants.ICON_HEIGHT_KEY, "INTEGER", true, 0, null, 1));
                map2.put("weight", new androidx.room.util.TableInfo.Column("weight", "REAL", true, 0, null, 1));
                map2.put("gender", new androidx.room.util.TableInfo.Column("gender", "TEXT", true, 0, null, 1));
                map2.put("shouldSync", new androidx.room.util.TableInfo.Column("shouldSync", "INTEGER", true, 0, null, 1));
                map2.put("language", new androidx.room.util.TableInfo.Column("language", "TEXT", true, 0, null, 1));
                map2.put("unitType", new androidx.room.util.TableInfo.Column("unitType", "TEXT", true, 0, null, 1));
                map2.put("timeFormatType", new androidx.room.util.TableInfo.Column("timeFormatType", "INTEGER", true, 0, null, 1));
                androidx.room.util.TableInfo tableInfo3 = new androidx.room.util.TableInfo("User", map2, new java.util.HashSet(0), new java.util.HashSet(0));
                androidx.room.util.TableInfo tableInfo4 = androidx.room.util.TableInfo.read(_db, "User");
                if (!tableInfo3.equals(tableInfo4)) {
                    return new androidx.room.RoomOpenHelper.ValidationResult(false, "User(powerwatch.matrix.com.pwgen2android.shared.data.models.User).\n Expected:\n" + tableInfo3 + "\n Found:\n" + tableInfo4);
                }
                java.util.HashMap map3 = new java.util.HashMap(11);
                map3.put("uid", new androidx.room.util.TableInfo.Column("uid", "INTEGER", true, 1, null, 1));
                map3.put("serialNumber", new androidx.room.util.TableInfo.Column("serialNumber", "TEXT", true, 0, null, 1));
                map3.put("bluetoothAddress", new androidx.room.util.TableInfo.Column("bluetoothAddress", "TEXT", true, 0, null, 1));
                map3.put("pid", new androidx.room.util.TableInfo.Column("pid", "INTEGER", true, 0, null, 1));
                map3.put("firmwareVersion", new androidx.room.util.TableInfo.Column("firmwareVersion", "TEXT", true, 0, null, 1));
                map3.put("productName", new androidx.room.util.TableInfo.Column("productName", "TEXT", true, 0, null, 1));
                map3.put("shouldSync", new androidx.room.util.TableInfo.Column("shouldSync", "INTEGER", false, 0, null, 1));
                map3.put("callNotification", new androidx.room.util.TableInfo.Column("callNotification", "INTEGER", true, 0, null, 1));
                map3.put("messageNotification", new androidx.room.util.TableInfo.Column("messageNotification", "INTEGER", true, 0, null, 1));
                map3.put("activityGoalNotification", new androidx.room.util.TableInfo.Column("activityGoalNotification", "INTEGER", true, 0, null, 1));
                map3.put("alarmNotification", new androidx.room.util.TableInfo.Column("alarmNotification", "INTEGER", true, 0, null, 1));
                androidx.room.util.TableInfo tableInfo5 = new androidx.room.util.TableInfo("Device", map3, new java.util.HashSet(0), new java.util.HashSet(0));
                androidx.room.util.TableInfo tableInfo6 = androidx.room.util.TableInfo.read(_db, "Device");
                if (!tableInfo5.equals(tableInfo6)) {
                    return new androidx.room.RoomOpenHelper.ValidationResult(false, "Device(powerwatch.matrix.com.pwgen2android.shared.data.models.Device).\n Expected:\n" + tableInfo5 + "\n Found:\n" + tableInfo6);
                }
                java.util.HashMap map4 = new java.util.HashMap(22);
                map4.put("startTime", new androidx.room.util.TableInfo.Column("startTime", "INTEGER", true, 1, null, 1));
                map4.put("endTime", new androidx.room.util.TableInfo.Column("endTime", "INTEGER", true, 0, null, 1));
                map4.put("hourInDay", new androidx.room.util.TableInfo.Column("hourInDay", "INTEGER", true, 0, null, 1));
                map4.put("maxHeartRate", new androidx.room.util.TableInfo.Column("maxHeartRate", "INTEGER", true, 0, null, 1));
                map4.put("minHeartRate", new androidx.room.util.TableInfo.Column("minHeartRate", "INTEGER", true, 0, null, 1));
                map4.put("heartRate", new androidx.room.util.TableInfo.Column("heartRate", "REAL", true, 0, null, 1));
                map4.put("skinTemp", new androidx.room.util.TableInfo.Column("skinTemp", "REAL", true, 0, null, 1));
                map4.put("maxSkinTemp", new androidx.room.util.TableInfo.Column("maxSkinTemp", "REAL", true, 0, null, 1));
                map4.put("minSkinTemp", new androidx.room.util.TableInfo.Column("minSkinTemp", "REAL", true, 0, null, 1));
                map4.put("bodyPower", new androidx.room.util.TableInfo.Column("bodyPower", "REAL", true, 0, null, 1));
                map4.put("solarPower", new androidx.room.util.TableInfo.Column("solarPower", "REAL", true, 0, null, 1));
                map4.put("hrv", new androidx.room.util.TableInfo.Column("hrv", "REAL", true, 0, null, 1));
                map4.put("peakTemp", new androidx.room.util.TableInfo.Column("peakTemp", "REAL", true, 0, null, 1));
                map4.put("activeCalories", new androidx.room.util.TableInfo.Column("activeCalories", "INTEGER", true, 0, null, 1));
                map4.put("steps", new androidx.room.util.TableInfo.Column("steps", "INTEGER", true, 0, null, 1));
                map4.put("distance", new androidx.room.util.TableInfo.Column("distance", "REAL", true, 0, null, 1));
                map4.put("lastUpdated", new androidx.room.util.TableInfo.Column("lastUpdated", "INTEGER", true, 0, null, 1));
                map4.put("minsInPeriod", new androidx.room.util.TableInfo.Column("minsInPeriod", "INTEGER", true, 0, null, 1));
                map4.put("bmrCalories", new androidx.room.util.TableInfo.Column("bmrCalories", "INTEGER", true, 0, null, 1));
                map4.put("caseTemp", new androidx.room.util.TableInfo.Column("caseTemp", "REAL", true, 0, null, 1));
                map4.put("minCaseTemp", new androidx.room.util.TableInfo.Column("minCaseTemp", "REAL", true, 0, null, 1));
                map4.put("maxCaseTemp", new androidx.room.util.TableInfo.Column("maxCaseTemp", "REAL", true, 0, null, 1));
                androidx.room.util.TableInfo tableInfo7 = new androidx.room.util.TableInfo("WalkingHourPeriod", map4, new java.util.HashSet(0), new java.util.HashSet(0));
                androidx.room.util.TableInfo tableInfo8 = androidx.room.util.TableInfo.read(_db, "WalkingHourPeriod");
                if (!tableInfo7.equals(tableInfo8)) {
                    return new androidx.room.RoomOpenHelper.ValidationResult(false, "WalkingHourPeriod(powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingHourPeriod).\n Expected:\n" + tableInfo7 + "\n Found:\n" + tableInfo8);
                }
                java.util.HashMap map5 = new java.util.HashMap(20);
                map5.put("startTime", new androidx.room.util.TableInfo.Column("startTime", "INTEGER", true, 1, null, 1));
                map5.put("endTime", new androidx.room.util.TableInfo.Column("endTime", "INTEGER", true, 0, null, 1));
                map5.put("hourInDay", new androidx.room.util.TableInfo.Column("hourInDay", "INTEGER", true, 0, null, 1));
                map5.put("heartRate", new androidx.room.util.TableInfo.Column("heartRate", "REAL", true, 0, null, 1));
                map5.put("maxHeartRate", new androidx.room.util.TableInfo.Column("maxHeartRate", "INTEGER", true, 0, null, 1));
                map5.put("minHeartRate", new androidx.room.util.TableInfo.Column("minHeartRate", "INTEGER", true, 0, null, 1));
                map5.put("hrv", new androidx.room.util.TableInfo.Column("hrv", "REAL", true, 0, null, 1));
                map5.put("skinTemp", new androidx.room.util.TableInfo.Column("skinTemp", "REAL", true, 0, null, 1));
                map5.put("maxSkinTemp", new androidx.room.util.TableInfo.Column("maxSkinTemp", "REAL", true, 0, null, 1));
                map5.put("minSkinTemp", new androidx.room.util.TableInfo.Column("minSkinTemp", "REAL", true, 0, null, 1));
                map5.put("bodyPower", new androidx.room.util.TableInfo.Column("bodyPower", "REAL", true, 0, null, 1));
                map5.put("solarPower", new androidx.room.util.TableInfo.Column("solarPower", "REAL", true, 0, null, 1));
                map5.put("peakTemp", new androidx.room.util.TableInfo.Column("peakTemp", "REAL", true, 0, null, 1));
                map5.put("activeCalories", new androidx.room.util.TableInfo.Column("activeCalories", "INTEGER", true, 0, null, 1));
                map5.put("lastUpdated", new androidx.room.util.TableInfo.Column("lastUpdated", "INTEGER", true, 0, null, 1));
                map5.put("minsInPeriod", new androidx.room.util.TableInfo.Column("minsInPeriod", "INTEGER", true, 0, null, 1));
                map5.put("bmrCalories", new androidx.room.util.TableInfo.Column("bmrCalories", "INTEGER", true, 0, null, 1));
                map5.put("caseTemp", new androidx.room.util.TableInfo.Column("caseTemp", "REAL", true, 0, null, 1));
                map5.put("minCaseTemp", new androidx.room.util.TableInfo.Column("minCaseTemp", "REAL", true, 0, null, 1));
                map5.put("maxCaseTemp", new androidx.room.util.TableInfo.Column("maxCaseTemp", "REAL", true, 0, null, 1));
                androidx.room.util.TableInfo tableInfo9 = new androidx.room.util.TableInfo("RestingHourPeriod", map5, new java.util.HashSet(0), new java.util.HashSet(0));
                androidx.room.util.TableInfo tableInfo10 = androidx.room.util.TableInfo.read(_db, "RestingHourPeriod");
                if (!tableInfo9.equals(tableInfo10)) {
                    return new androidx.room.RoomOpenHelper.ValidationResult(false, "RestingHourPeriod(powerwatch.matrix.com.pwgen2android.shared.data.models.RestingHourPeriod).\n Expected:\n" + tableInfo9 + "\n Found:\n" + tableInfo10);
                }
                java.util.HashMap map6 = new java.util.HashMap(23);
                map6.put("startTime", new androidx.room.util.TableInfo.Column("startTime", "INTEGER", true, 1, null, 1));
                map6.put("endTime", new androidx.room.util.TableInfo.Column("endTime", "INTEGER", true, 0, null, 1));
                map6.put("heartRate", new androidx.room.util.TableInfo.Column("heartRate", "REAL", true, 0, null, 1));
                map6.put("maxHeartRate", new androidx.room.util.TableInfo.Column("maxHeartRate", "INTEGER", true, 0, null, 1));
                map6.put("minHeartRate", new androidx.room.util.TableInfo.Column("minHeartRate", "INTEGER", true, 0, null, 1));
                map6.put("skinTemp", new androidx.room.util.TableInfo.Column("skinTemp", "REAL", true, 0, null, 1));
                map6.put("maxSkinTemp", new androidx.room.util.TableInfo.Column("maxSkinTemp", "REAL", true, 0, null, 1));
                map6.put("minSkinTemp", new androidx.room.util.TableInfo.Column("minSkinTemp", "REAL", true, 0, null, 1));
                map6.put("hrv", new androidx.room.util.TableInfo.Column("hrv", "REAL", true, 0, null, 1));
                map6.put("bodyPower", new androidx.room.util.TableInfo.Column("bodyPower", "REAL", true, 0, null, 1));
                map6.put("solarPower", new androidx.room.util.TableInfo.Column("solarPower", "REAL", true, 0, null, 1));
                map6.put("peakTemp", new androidx.room.util.TableInfo.Column("peakTemp", "REAL", true, 0, null, 1));
                map6.put("activeCalories", new androidx.room.util.TableInfo.Column("activeCalories", "INTEGER", true, 0, null, 1));
                map6.put("hourInDay", new androidx.room.util.TableInfo.Column("hourInDay", "INTEGER", true, 0, null, 1));
                map6.put("restlessMinutes", new androidx.room.util.TableInfo.Column("restlessMinutes", "INTEGER", true, 0, null, 1));
                map6.put("sleepFiveMins", new androidx.room.util.TableInfo.Column("sleepFiveMins", "TEXT", true, 0, null, 1));
                map6.put("sleepType", new androidx.room.util.TableInfo.Column("sleepType", "TEXT", true, 0, null, 1));
                map6.put("lastUpdated", new androidx.room.util.TableInfo.Column("lastUpdated", "INTEGER", true, 0, null, 1));
                map6.put("minsInPeriod", new androidx.room.util.TableInfo.Column("minsInPeriod", "INTEGER", true, 0, null, 1));
                map6.put("bmrCalories", new androidx.room.util.TableInfo.Column("bmrCalories", "INTEGER", true, 0, null, 1));
                map6.put("caseTemp", new androidx.room.util.TableInfo.Column("caseTemp", "REAL", true, 0, null, 1));
                map6.put("minCaseTemp", new androidx.room.util.TableInfo.Column("minCaseTemp", "REAL", true, 0, null, 1));
                map6.put("maxCaseTemp", new androidx.room.util.TableInfo.Column("maxCaseTemp", "REAL", true, 0, null, 1));
                androidx.room.util.TableInfo tableInfo11 = new androidx.room.util.TableInfo("SleepHourPeriod", map6, new java.util.HashSet(0), new java.util.HashSet(0));
                androidx.room.util.TableInfo tableInfo12 = androidx.room.util.TableInfo.read(_db, "SleepHourPeriod");
                if (!tableInfo11.equals(tableInfo12)) {
                    return new androidx.room.RoomOpenHelper.ValidationResult(false, "SleepHourPeriod(powerwatch.matrix.com.pwgen2android.shared.data.models.SleepHourPeriod).\n Expected:\n" + tableInfo11 + "\n Found:\n" + tableInfo12);
                }
                java.util.HashMap map7 = new java.util.HashMap(8);
                map7.put("id", new androidx.room.util.TableInfo.Column("id", "INTEGER", true, 1, null, 1));
                map7.put(com.google.android.gms.fitness.data.Field.NUTRIENT_CALORIES, new androidx.room.util.TableInfo.Column(com.google.android.gms.fitness.data.Field.NUTRIENT_CALORIES, "INTEGER", true, 0, null, 1));
                map7.put("distance", new androidx.room.util.TableInfo.Column("distance", "REAL", true, 0, null, 1));
                map7.put("power", new androidx.room.util.TableInfo.Column("power", "INTEGER", true, 0, null, 1));
                map7.put(com.google.android.gms.fitness.FitnessActivities.SLEEP, new androidx.room.util.TableInfo.Column(com.google.android.gms.fitness.FitnessActivities.SLEEP, "INTEGER", true, 0, null, 1));
                map7.put("steps", new androidx.room.util.TableInfo.Column("steps", "INTEGER", true, 0, null, 1));
                map7.put("createdAt", new androidx.room.util.TableInfo.Column("createdAt", "INTEGER", true, 0, null, 1));
                map7.put("shouldSync", new androidx.room.util.TableInfo.Column("shouldSync", "INTEGER", true, 0, null, 1));
                androidx.room.util.TableInfo tableInfo13 = new androidx.room.util.TableInfo("GoalConfiguration", map7, new java.util.HashSet(0), new java.util.HashSet(0));
                androidx.room.util.TableInfo tableInfo14 = androidx.room.util.TableInfo.read(_db, "GoalConfiguration");
                if (!tableInfo13.equals(tableInfo14)) {
                    return new androidx.room.RoomOpenHelper.ValidationResult(false, "GoalConfiguration(powerwatch.matrix.com.pwgen2android.shared.data.models.GoalConfiguration).\n Expected:\n" + tableInfo13 + "\n Found:\n" + tableInfo14);
                }
                java.util.HashMap map8 = new java.util.HashMap(20);
                map8.put("startTime", new androidx.room.util.TableInfo.Column("startTime", "INTEGER", true, 1, null, 1));
                map8.put("steps", new androidx.room.util.TableInfo.Column("steps", "INTEGER", true, 0, null, 1));
                map8.put("distance", new androidx.room.util.TableInfo.Column("distance", "REAL", true, 0, null, 1));
                map8.put("endTime", new androidx.room.util.TableInfo.Column("endTime", "INTEGER", true, 0, null, 1));
                map8.put("heartRate", new androidx.room.util.TableInfo.Column("heartRate", "REAL", true, 0, null, 1));
                map8.put("bodyPower", new androidx.room.util.TableInfo.Column("bodyPower", "REAL", true, 0, null, 1));
                map8.put("solarPower", new androidx.room.util.TableInfo.Column("solarPower", "REAL", true, 0, null, 1));
                map8.put("skinTemp", new androidx.room.util.TableInfo.Column("skinTemp", "REAL", true, 0, null, 1));
                map8.put("maxSkinTemp", new androidx.room.util.TableInfo.Column("maxSkinTemp", "REAL", true, 0, null, 1));
                map8.put("minSkinTemp", new androidx.room.util.TableInfo.Column("minSkinTemp", "REAL", true, 0, null, 1));
                map8.put("caseTemp", new androidx.room.util.TableInfo.Column("caseTemp", "REAL", true, 0, null, 1));
                map8.put("maxCaseTemp", new androidx.room.util.TableInfo.Column("maxCaseTemp", "REAL", true, 0, null, 1));
                map8.put("minCaseTemp", new androidx.room.util.TableInfo.Column("minCaseTemp", "REAL", true, 0, null, 1));
                map8.put("activeCalories", new androidx.room.util.TableInfo.Column("activeCalories", "INTEGER", true, 0, null, 1));
                map8.put("hrv", new androidx.room.util.TableInfo.Column("hrv", "REAL", true, 0, null, 1));
                map8.put("shouldSend", new androidx.room.util.TableInfo.Column("shouldSend", "INTEGER", true, 0, null, 1));
                map8.put("bmrCalories", new androidx.room.util.TableInfo.Column("bmrCalories", "INTEGER", true, 0, null, 1));
                map8.put("minHeartRate", new androidx.room.util.TableInfo.Column("minHeartRate", "INTEGER", true, 0, null, 1));
                map8.put("maxHeartRate", new androidx.room.util.TableInfo.Column("maxHeartRate", "INTEGER", true, 0, null, 1));
                map8.put("email", new androidx.room.util.TableInfo.Column("email", "TEXT", true, 0, null, 1));
                androidx.room.util.TableInfo tableInfo15 = new androidx.room.util.TableInfo("WalkingLog", map8, new java.util.HashSet(0), new java.util.HashSet(0));
                androidx.room.util.TableInfo tableInfo16 = androidx.room.util.TableInfo.read(_db, "WalkingLog");
                if (!tableInfo15.equals(tableInfo16)) {
                    return new androidx.room.RoomOpenHelper.ValidationResult(false, "WalkingLog(powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.WalkingLog).\n Expected:\n" + tableInfo15 + "\n Found:\n" + tableInfo16);
                }
                java.util.HashMap map9 = new java.util.HashMap(20);
                map9.put("startTime", new androidx.room.util.TableInfo.Column("startTime", "INTEGER", true, 1, null, 1));
                map9.put("endTime", new androidx.room.util.TableInfo.Column("endTime", "INTEGER", true, 0, null, 1));
                map9.put("heartRate", new androidx.room.util.TableInfo.Column("heartRate", "REAL", true, 0, null, 1));
                map9.put("bodyPower", new androidx.room.util.TableInfo.Column("bodyPower", "REAL", true, 0, null, 1));
                map9.put("solarPower", new androidx.room.util.TableInfo.Column("solarPower", "REAL", true, 0, null, 1));
                map9.put("skinTemp", new androidx.room.util.TableInfo.Column("skinTemp", "REAL", true, 0, null, 1));
                map9.put("maxSkinTemp", new androidx.room.util.TableInfo.Column("maxSkinTemp", "REAL", true, 0, null, 1));
                map9.put("minSkinTemp", new androidx.room.util.TableInfo.Column("minSkinTemp", "REAL", true, 0, null, 1));
                map9.put("caseTemp", new androidx.room.util.TableInfo.Column("caseTemp", "REAL", true, 0, null, 1));
                map9.put("maxCaseTemp", new androidx.room.util.TableInfo.Column("maxCaseTemp", "REAL", true, 0, null, 1));
                map9.put("minCaseTemp", new androidx.room.util.TableInfo.Column("minCaseTemp", "REAL", true, 0, null, 1));
                map9.put("activeCalories", new androidx.room.util.TableInfo.Column("activeCalories", "INTEGER", true, 0, null, 1));
                map9.put("sleepType", new androidx.room.util.TableInfo.Column("sleepType", "TEXT", true, 0, null, 1));
                map9.put("hrv", new androidx.room.util.TableInfo.Column("hrv", "REAL", true, 0, null, 1));
                map9.put("shouldSend", new androidx.room.util.TableInfo.Column("shouldSend", "INTEGER", true, 0, null, 1));
                map9.put("bmrCalories", new androidx.room.util.TableInfo.Column("bmrCalories", "INTEGER", true, 0, null, 1));
                map9.put("minHeartRate", new androidx.room.util.TableInfo.Column("minHeartRate", "INTEGER", true, 0, null, 1));
                map9.put("maxHeartRate", new androidx.room.util.TableInfo.Column("maxHeartRate", "INTEGER", true, 0, null, 1));
                map9.put("email", new androidx.room.util.TableInfo.Column("email", "TEXT", true, 0, null, 1));
                map9.put("minsInPeriod", new androidx.room.util.TableInfo.Column("minsInPeriod", "INTEGER", true, 0, null, 1));
                androidx.room.util.TableInfo tableInfo17 = new androidx.room.util.TableInfo("SleepLog", map9, new java.util.HashSet(0), new java.util.HashSet(0));
                androidx.room.util.TableInfo tableInfo18 = androidx.room.util.TableInfo.read(_db, "SleepLog");
                if (!tableInfo17.equals(tableInfo18)) {
                    return new androidx.room.RoomOpenHelper.ValidationResult(false, "SleepLog(powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.SleepLog).\n Expected:\n" + tableInfo17 + "\n Found:\n" + tableInfo18);
                }
                java.util.HashMap map10 = new java.util.HashMap(18);
                map10.put("startTime", new androidx.room.util.TableInfo.Column("startTime", "INTEGER", true, 1, null, 1));
                map10.put("endTime", new androidx.room.util.TableInfo.Column("endTime", "INTEGER", true, 0, null, 1));
                map10.put("heartRate", new androidx.room.util.TableInfo.Column("heartRate", "REAL", true, 0, null, 1));
                map10.put("bodyPower", new androidx.room.util.TableInfo.Column("bodyPower", "REAL", true, 0, null, 1));
                map10.put("solarPower", new androidx.room.util.TableInfo.Column("solarPower", "REAL", true, 0, null, 1));
                map10.put("skinTemp", new androidx.room.util.TableInfo.Column("skinTemp", "REAL", true, 0, null, 1));
                map10.put("maxSkinTemp", new androidx.room.util.TableInfo.Column("maxSkinTemp", "REAL", true, 0, null, 1));
                map10.put("minSkinTemp", new androidx.room.util.TableInfo.Column("minSkinTemp", "REAL", true, 0, null, 1));
                map10.put("caseTemp", new androidx.room.util.TableInfo.Column("caseTemp", "REAL", true, 0, null, 1));
                map10.put("maxCaseTemp", new androidx.room.util.TableInfo.Column("maxCaseTemp", "REAL", true, 0, null, 1));
                map10.put("minCaseTemp", new androidx.room.util.TableInfo.Column("minCaseTemp", "REAL", true, 0, null, 1));
                map10.put("activeCalories", new androidx.room.util.TableInfo.Column("activeCalories", "INTEGER", true, 0, null, 1));
                map10.put("hrv", new androidx.room.util.TableInfo.Column("hrv", "REAL", true, 0, null, 1));
                map10.put("shouldSend", new androidx.room.util.TableInfo.Column("shouldSend", "INTEGER", true, 0, null, 1));
                map10.put("bmrCalories", new androidx.room.util.TableInfo.Column("bmrCalories", "INTEGER", true, 0, null, 1));
                map10.put("minHeartRate", new androidx.room.util.TableInfo.Column("minHeartRate", "INTEGER", true, 0, null, 1));
                map10.put("maxHeartRate", new androidx.room.util.TableInfo.Column("maxHeartRate", "INTEGER", true, 0, null, 1));
                map10.put("email", new androidx.room.util.TableInfo.Column("email", "TEXT", true, 0, null, 1));
                androidx.room.util.TableInfo tableInfo19 = new androidx.room.util.TableInfo("RestingLog", map10, new java.util.HashSet(0), new java.util.HashSet(0));
                androidx.room.util.TableInfo tableInfo20 = androidx.room.util.TableInfo.read(_db, "RestingLog");
                if (!tableInfo19.equals(tableInfo20)) {
                    return new androidx.room.RoomOpenHelper.ValidationResult(false, "RestingLog(powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.RestingLog).\n Expected:\n" + tableInfo19 + "\n Found:\n" + tableInfo20);
                }
                java.util.HashMap map11 = new java.util.HashMap(17);
                map11.put("id", new androidx.room.util.TableInfo.Column("id", "TEXT", true, 1, null, 1));
                map11.put(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME, new androidx.room.util.TableInfo.Column(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME, "TEXT", true, 0, null, 1));
                map11.put("activityType", new androidx.room.util.TableInfo.Column("activityType", "TEXT", true, 0, null, 1));
                map11.put("locationName", new androidx.room.util.TableInfo.Column("locationName", "TEXT", true, 0, null, 1));
                map11.put("distance", new androidx.room.util.TableInfo.Column("distance", "REAL", true, 0, null, 1));
                map11.put("steps", new androidx.room.util.TableInfo.Column("steps", "INTEGER", true, 0, null, 1));
                map11.put("startTime", new androidx.room.util.TableInfo.Column("startTime", "INTEGER", true, 0, null, 1));
                map11.put("endTime", new androidx.room.util.TableInfo.Column("endTime", "INTEGER", true, 0, null, 1));
                map11.put("pace", new androidx.room.util.TableInfo.Column("pace", "REAL", true, 0, null, 1));
                map11.put("activeCalories", new androidx.room.util.TableInfo.Column("activeCalories", "INTEGER", true, 0, null, 1));
                map11.put("bmrCalories", new androidx.room.util.TableInfo.Column("bmrCalories", "INTEGER", true, 0, null, 1));
                map11.put("splits", new androidx.room.util.TableInfo.Column("splits", "TEXT", true, 0, null, 1));
                map11.put("gpsPositions", new androidx.room.util.TableInfo.Column("gpsPositions", "TEXT", true, 0, null, 1));
                map11.put("heartRates", new androidx.room.util.TableInfo.Column("heartRates", "TEXT", true, 0, null, 1));
                map11.put("notes", new androidx.room.util.TableInfo.Column("notes", "TEXT", true, 0, null, 1));
                map11.put("shouldSend", new androidx.room.util.TableInfo.Column("shouldSend", "INTEGER", true, 0, null, 1));
                map11.put("email", new androidx.room.util.TableInfo.Column("email", "TEXT", true, 0, null, 1));
                androidx.room.util.TableInfo tableInfo21 = new androidx.room.util.TableInfo("UserActivitySession", map11, new java.util.HashSet(0), new java.util.HashSet(0));
                androidx.room.util.TableInfo tableInfo22 = androidx.room.util.TableInfo.read(_db, "UserActivitySession");
                if (!tableInfo21.equals(tableInfo22)) {
                    return new androidx.room.RoomOpenHelper.ValidationResult(false, "UserActivitySession(powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession).\n Expected:\n" + tableInfo21 + "\n Found:\n" + tableInfo22);
                }
                java.util.HashMap map12 = new java.util.HashMap(3);
                map12.put("uid", new androidx.room.util.TableInfo.Column("uid", "INTEGER", true, 1, null, 1));
                map12.put("bluetoothAddress", new androidx.room.util.TableInfo.Column("bluetoothAddress", "TEXT", true, 0, null, 1));
                map12.put("serialNumber", new androidx.room.util.TableInfo.Column("serialNumber", "TEXT", true, 0, null, 1));
                androidx.room.util.TableInfo tableInfo23 = new androidx.room.util.TableInfo("DefaultPhoneWatch", map12, new java.util.HashSet(0), new java.util.HashSet(0));
                androidx.room.util.TableInfo tableInfo24 = androidx.room.util.TableInfo.read(_db, "DefaultPhoneWatch");
                if (!tableInfo23.equals(tableInfo24)) {
                    return new androidx.room.RoomOpenHelper.ValidationResult(false, "DefaultPhoneWatch(powerwatch.matrix.com.pwgen2android.shared.data.models.DefaultPhoneWatch).\n Expected:\n" + tableInfo23 + "\n Found:\n" + tableInfo24);
                }
                java.util.HashMap map13 = new java.util.HashMap(9);
                map13.put("uid", new androidx.room.util.TableInfo.Column("uid", "INTEGER", true, 1, null, 1));
                map13.put("pid", new androidx.room.util.TableInfo.Column("pid", "INTEGER", true, 0, null, 1));
                map13.put("releaseNotes", new androidx.room.util.TableInfo.Column("releaseNotes", "TEXT", true, 0, null, 1));
                map13.put("language", new androidx.room.util.TableInfo.Column("language", "TEXT", true, 0, null, 1));
                map13.put("releaseVersion", new androidx.room.util.TableInfo.Column("releaseVersion", "TEXT", true, 0, null, 1));
                map13.put("downloadUrl", new androidx.room.util.TableInfo.Column("downloadUrl", "TEXT", true, 0, null, 1));
                map13.put("mandatory", new androidx.room.util.TableInfo.Column("mandatory", "INTEGER", true, 0, null, 1));
                map13.put("forced", new androidx.room.util.TableInfo.Column("forced", "INTEGER", true, 0, null, 1));
                map13.put("releaseDate", new androidx.room.util.TableInfo.Column("releaseDate", "TEXT", false, 0, null, 1));
                androidx.room.util.TableInfo tableInfo25 = new androidx.room.util.TableInfo("UpdateInfo", map13, new java.util.HashSet(0), new java.util.HashSet(0));
                androidx.room.util.TableInfo tableInfo26 = androidx.room.util.TableInfo.read(_db, "UpdateInfo");
                if (!tableInfo25.equals(tableInfo26)) {
                    return new androidx.room.RoomOpenHelper.ValidationResult(false, "UpdateInfo(powerwatch.matrix.com.pwgen2android.shared.data.models.UpdateInfo).\n Expected:\n" + tableInfo25 + "\n Found:\n" + tableInfo26);
                }
                java.util.HashMap map14 = new java.util.HashMap(1);
                map14.put("startTime", new androidx.room.util.TableInfo.Column("startTime", "INTEGER", true, 1, null, 1));
                androidx.room.util.TableInfo tableInfo27 = new androidx.room.util.TableInfo("UserActivityDate", map14, new java.util.HashSet(0), new java.util.HashSet(0));
                androidx.room.util.TableInfo tableInfo28 = androidx.room.util.TableInfo.read(_db, "UserActivityDate");
                if (!tableInfo27.equals(tableInfo28)) {
                    return new androidx.room.RoomOpenHelper.ValidationResult(false, "UserActivityDate(powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivityDate).\n Expected:\n" + tableInfo27 + "\n Found:\n" + tableInfo28);
                }
                return new androidx.room.RoomOpenHelper.ValidationResult(true, null);
            }
        }, "7eea0e60d59cd2ba54d78e05b0b90fa3", "a63635e5b06ca08d14da0823e8bcc47c")).build());
    }

    @Override // androidx.room.RoomDatabase
    protected androidx.room.InvalidationTracker createInvalidationTracker() {
        return new androidx.room.InvalidationTracker(this, new java.util.HashMap(0), new java.util.HashMap(0), "PasswordCredentials", "User", "Device", "WalkingHourPeriod", "RestingHourPeriod", "SleepHourPeriod", "GoalConfiguration", "WalkingLog", "SleepLog", "RestingLog", "UserActivitySession", "DefaultPhoneWatch", "UpdateInfo", "UserActivityDate");
    }

    @Override // androidx.room.RoomDatabase
    public void clearAllTables() {
        super.assertNotMainThread();
        androidx.sqlite.db.SupportSQLiteDatabase writableDatabase = super.getOpenHelper().getWritableDatabase();
        try {
            super.beginTransaction();
            writableDatabase.execSQL("DELETE FROM `PasswordCredentials`");
            writableDatabase.execSQL("DELETE FROM `User`");
            writableDatabase.execSQL("DELETE FROM `Device`");
            writableDatabase.execSQL("DELETE FROM `WalkingHourPeriod`");
            writableDatabase.execSQL("DELETE FROM `RestingHourPeriod`");
            writableDatabase.execSQL("DELETE FROM `SleepHourPeriod`");
            writableDatabase.execSQL("DELETE FROM `GoalConfiguration`");
            writableDatabase.execSQL("DELETE FROM `WalkingLog`");
            writableDatabase.execSQL("DELETE FROM `SleepLog`");
            writableDatabase.execSQL("DELETE FROM `RestingLog`");
            writableDatabase.execSQL("DELETE FROM `UserActivitySession`");
            writableDatabase.execSQL("DELETE FROM `DefaultPhoneWatch`");
            writableDatabase.execSQL("DELETE FROM `UpdateInfo`");
            writableDatabase.execSQL("DELETE FROM `UserActivityDate`");
            super.setTransactionSuccessful();
        } finally {
            super.endTransaction();
            writableDatabase.query("PRAGMA wal_checkpoint(FULL)").close();
            if (!writableDatabase.inTransaction()) {
                writableDatabase.execSQL("VACUUM");
            }
        }
    }

    @Override // androidx.room.RoomDatabase
    protected java.util.Map<java.lang.Class<?>, java.util.List<java.lang.Class<?>>> getRequiredTypeConverters() {
        java.util.HashMap map = new java.util.HashMap();
        map.put(powerwatch.matrix.com.pwgen2android.shared.cloud.auth.TokenStorage.class, powerwatch.matrix.com.pwgen2android.shared.cloud.auth.TokenStorage_Impl.getRequiredConverters());
        map.put(powerwatch.matrix.com.pwgen2android.shared.data.db.UserDao.class, powerwatch.matrix.com.pwgen2android.shared.data.db.UserDao_Impl.getRequiredConverters());
        map.put(powerwatch.matrix.com.pwgen2android.shared.data.db.DeviceDao.class, powerwatch.matrix.com.pwgen2android.shared.data.db.DeviceDao_Impl.getRequiredConverters());
        map.put(powerwatch.matrix.com.pwgen2android.shared.data.db.activityPeriods.WalkingHourPeriodDao.class, powerwatch.matrix.com.pwgen2android.shared.data.db.activityPeriods.WalkingHourPeriodDao_Impl.getRequiredConverters());
        map.put(powerwatch.matrix.com.pwgen2android.shared.data.db.activityPeriods.RestingHourPeriodDao.class, powerwatch.matrix.com.pwgen2android.shared.data.db.activityPeriods.RestingHourPeriodDao_Impl.getRequiredConverters());
        map.put(powerwatch.matrix.com.pwgen2android.shared.data.db.activityPeriods.SleepHourPeriodDao.class, powerwatch.matrix.com.pwgen2android.shared.data.db.activityPeriods.SleepHourPeriodDao_Impl.getRequiredConverters());
        map.put(powerwatch.matrix.com.pwgen2android.shared.data.db.GoalConfigurationDao.class, powerwatch.matrix.com.pwgen2android.shared.data.db.GoalConfigurationDao_Impl.getRequiredConverters());
        map.put(powerwatch.matrix.com.pwgen2android.shared.data.db.activityLogs.WalkingLogDao.class, powerwatch.matrix.com.pwgen2android.shared.data.db.activityLogs.WalkingLogDao_Impl.getRequiredConverters());
        map.put(powerwatch.matrix.com.pwgen2android.shared.data.db.activityLogs.SleepLogDao.class, powerwatch.matrix.com.pwgen2android.shared.data.db.activityLogs.SleepLogDao_Impl.getRequiredConverters());
        map.put(powerwatch.matrix.com.pwgen2android.shared.data.db.activityLogs.RestingLogDao.class, powerwatch.matrix.com.pwgen2android.shared.data.db.activityLogs.RestingLogDao_Impl.getRequiredConverters());
        map.put(powerwatch.matrix.com.pwgen2android.shared.data.db.activitySessions.UserActivitySessionDao.class, powerwatch.matrix.com.pwgen2android.shared.data.db.activitySessions.UserActivitySessionDao_Impl.getRequiredConverters());
        map.put(powerwatch.matrix.com.pwgen2android.shared.data.db.DefaultPhoneWatchDao.class, powerwatch.matrix.com.pwgen2android.shared.data.db.DefaultPhoneWatchDao_Impl.getRequiredConverters());
        map.put(powerwatch.matrix.com.pwgen2android.shared.data.db.UpdateInfoDao.class, powerwatch.matrix.com.pwgen2android.shared.data.db.UpdateInfoDao_Impl.getRequiredConverters());
        return map;
    }

    @Override // androidx.room.RoomDatabase
    public java.util.Set<java.lang.Class<? extends androidx.room.migration.AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
        return new java.util.HashSet();
    }

    @Override // androidx.room.RoomDatabase
    public java.util.List<androidx.room.migration.Migration> getAutoMigrations(java.util.Map<java.lang.Class<? extends androidx.room.migration.AutoMigrationSpec>, androidx.room.migration.AutoMigrationSpec> autoMigrationSpecsMap) {
        return java.util.Arrays.asList(new androidx.room.migration.Migration[0]);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.db.RoomDB
    public powerwatch.matrix.com.pwgen2android.shared.cloud.auth.TokenStorage tokenStorage() {
        powerwatch.matrix.com.pwgen2android.shared.cloud.auth.TokenStorage tokenStorage;
        if (this._tokenStorage != null) {
            return this._tokenStorage;
        }
        synchronized (this) {
            if (this._tokenStorage == null) {
                this._tokenStorage = new powerwatch.matrix.com.pwgen2android.shared.cloud.auth.TokenStorage_Impl(this);
            }
            tokenStorage = this._tokenStorage;
        }
        return tokenStorage;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.db.RoomDB
    public powerwatch.matrix.com.pwgen2android.shared.data.db.UserDao userDao() {
        powerwatch.matrix.com.pwgen2android.shared.data.db.UserDao userDao;
        if (this._userDao != null) {
            return this._userDao;
        }
        synchronized (this) {
            if (this._userDao == null) {
                this._userDao = new powerwatch.matrix.com.pwgen2android.shared.data.db.UserDao_Impl(this);
            }
            userDao = this._userDao;
        }
        return userDao;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.db.RoomDB
    public powerwatch.matrix.com.pwgen2android.shared.data.db.DeviceDao deviceDao() {
        powerwatch.matrix.com.pwgen2android.shared.data.db.DeviceDao deviceDao;
        if (this._deviceDao != null) {
            return this._deviceDao;
        }
        synchronized (this) {
            if (this._deviceDao == null) {
                this._deviceDao = new powerwatch.matrix.com.pwgen2android.shared.data.db.DeviceDao_Impl(this);
            }
            deviceDao = this._deviceDao;
        }
        return deviceDao;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.db.RoomDB
    public powerwatch.matrix.com.pwgen2android.shared.data.db.activityPeriods.WalkingHourPeriodDao walkingHourPeriodDao() {
        powerwatch.matrix.com.pwgen2android.shared.data.db.activityPeriods.WalkingHourPeriodDao walkingHourPeriodDao;
        if (this._walkingHourPeriodDao != null) {
            return this._walkingHourPeriodDao;
        }
        synchronized (this) {
            if (this._walkingHourPeriodDao == null) {
                this._walkingHourPeriodDao = new powerwatch.matrix.com.pwgen2android.shared.data.db.activityPeriods.WalkingHourPeriodDao_Impl(this);
            }
            walkingHourPeriodDao = this._walkingHourPeriodDao;
        }
        return walkingHourPeriodDao;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.db.RoomDB
    public powerwatch.matrix.com.pwgen2android.shared.data.db.activityPeriods.RestingHourPeriodDao restingHourPeriodDao() {
        powerwatch.matrix.com.pwgen2android.shared.data.db.activityPeriods.RestingHourPeriodDao restingHourPeriodDao;
        if (this._restingHourPeriodDao != null) {
            return this._restingHourPeriodDao;
        }
        synchronized (this) {
            if (this._restingHourPeriodDao == null) {
                this._restingHourPeriodDao = new powerwatch.matrix.com.pwgen2android.shared.data.db.activityPeriods.RestingHourPeriodDao_Impl(this);
            }
            restingHourPeriodDao = this._restingHourPeriodDao;
        }
        return restingHourPeriodDao;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.db.RoomDB
    public powerwatch.matrix.com.pwgen2android.shared.data.db.activityPeriods.SleepHourPeriodDao sleepHourPeriodDao() {
        powerwatch.matrix.com.pwgen2android.shared.data.db.activityPeriods.SleepHourPeriodDao sleepHourPeriodDao;
        if (this._sleepHourPeriodDao != null) {
            return this._sleepHourPeriodDao;
        }
        synchronized (this) {
            if (this._sleepHourPeriodDao == null) {
                this._sleepHourPeriodDao = new powerwatch.matrix.com.pwgen2android.shared.data.db.activityPeriods.SleepHourPeriodDao_Impl(this);
            }
            sleepHourPeriodDao = this._sleepHourPeriodDao;
        }
        return sleepHourPeriodDao;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.db.RoomDB
    public powerwatch.matrix.com.pwgen2android.shared.data.db.GoalConfigurationDao goalConfigurationDao() {
        powerwatch.matrix.com.pwgen2android.shared.data.db.GoalConfigurationDao goalConfigurationDao;
        if (this._goalConfigurationDao != null) {
            return this._goalConfigurationDao;
        }
        synchronized (this) {
            if (this._goalConfigurationDao == null) {
                this._goalConfigurationDao = new powerwatch.matrix.com.pwgen2android.shared.data.db.GoalConfigurationDao_Impl(this);
            }
            goalConfigurationDao = this._goalConfigurationDao;
        }
        return goalConfigurationDao;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.db.RoomDB
    public powerwatch.matrix.com.pwgen2android.shared.data.db.activityLogs.WalkingLogDao walkingLogDao() {
        powerwatch.matrix.com.pwgen2android.shared.data.db.activityLogs.WalkingLogDao walkingLogDao;
        if (this._walkingLogDao != null) {
            return this._walkingLogDao;
        }
        synchronized (this) {
            if (this._walkingLogDao == null) {
                this._walkingLogDao = new powerwatch.matrix.com.pwgen2android.shared.data.db.activityLogs.WalkingLogDao_Impl(this);
            }
            walkingLogDao = this._walkingLogDao;
        }
        return walkingLogDao;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.db.RoomDB
    public powerwatch.matrix.com.pwgen2android.shared.data.db.activityLogs.SleepLogDao sleepLogDao() {
        powerwatch.matrix.com.pwgen2android.shared.data.db.activityLogs.SleepLogDao sleepLogDao;
        if (this._sleepLogDao != null) {
            return this._sleepLogDao;
        }
        synchronized (this) {
            if (this._sleepLogDao == null) {
                this._sleepLogDao = new powerwatch.matrix.com.pwgen2android.shared.data.db.activityLogs.SleepLogDao_Impl(this);
            }
            sleepLogDao = this._sleepLogDao;
        }
        return sleepLogDao;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.db.RoomDB
    public powerwatch.matrix.com.pwgen2android.shared.data.db.activityLogs.RestingLogDao restingLogDao() {
        powerwatch.matrix.com.pwgen2android.shared.data.db.activityLogs.RestingLogDao restingLogDao;
        if (this._restingLogDao != null) {
            return this._restingLogDao;
        }
        synchronized (this) {
            if (this._restingLogDao == null) {
                this._restingLogDao = new powerwatch.matrix.com.pwgen2android.shared.data.db.activityLogs.RestingLogDao_Impl(this);
            }
            restingLogDao = this._restingLogDao;
        }
        return restingLogDao;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.db.RoomDB
    public powerwatch.matrix.com.pwgen2android.shared.data.db.activitySessions.UserActivitySessionDao userActivitySessionDao() {
        powerwatch.matrix.com.pwgen2android.shared.data.db.activitySessions.UserActivitySessionDao userActivitySessionDao;
        if (this._userActivitySessionDao != null) {
            return this._userActivitySessionDao;
        }
        synchronized (this) {
            if (this._userActivitySessionDao == null) {
                this._userActivitySessionDao = new powerwatch.matrix.com.pwgen2android.shared.data.db.activitySessions.UserActivitySessionDao_Impl(this);
            }
            userActivitySessionDao = this._userActivitySessionDao;
        }
        return userActivitySessionDao;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.db.RoomDB
    public powerwatch.matrix.com.pwgen2android.shared.data.db.DefaultPhoneWatchDao defaultPhoneWatchDao() {
        powerwatch.matrix.com.pwgen2android.shared.data.db.DefaultPhoneWatchDao defaultPhoneWatchDao;
        if (this._defaultPhoneWatchDao != null) {
            return this._defaultPhoneWatchDao;
        }
        synchronized (this) {
            if (this._defaultPhoneWatchDao == null) {
                this._defaultPhoneWatchDao = new powerwatch.matrix.com.pwgen2android.shared.data.db.DefaultPhoneWatchDao_Impl(this);
            }
            defaultPhoneWatchDao = this._defaultPhoneWatchDao;
        }
        return defaultPhoneWatchDao;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.db.RoomDB
    public powerwatch.matrix.com.pwgen2android.shared.data.db.UpdateInfoDao updateInfoDao() {
        powerwatch.matrix.com.pwgen2android.shared.data.db.UpdateInfoDao updateInfoDao;
        if (this._updateInfoDao != null) {
            return this._updateInfoDao;
        }
        synchronized (this) {
            if (this._updateInfoDao == null) {
                this._updateInfoDao = new powerwatch.matrix.com.pwgen2android.shared.data.db.UpdateInfoDao_Impl(this);
            }
            updateInfoDao = this._updateInfoDao;
        }
        return updateInfoDao;
    }
}
