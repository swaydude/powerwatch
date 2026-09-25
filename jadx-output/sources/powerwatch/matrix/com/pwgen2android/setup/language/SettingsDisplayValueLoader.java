package powerwatch.matrix.com.pwgen2android.setup.language;

/* JADX INFO: compiled from: SettingsDisplayValueLoader.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u0006¨\u0006\u000f"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/setup/language/SettingsDisplayValueLoader;", "", "()V", "getDisplayValue", "", "value", "", "type", "Lpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType;", "activityContext", "Landroid/content/Context;", "loadItems", "", "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/chooseActityType/UIChooseItemView;", "activeValue", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class SettingsDisplayValueLoader {
    public final java.lang.String getDisplayValue(byte value, powerwatch.matrix.com.pwgen2android.setup.language.SupportedType type, android.content.Context activityContext) {
        java.lang.String string;
        java.lang.String string2;
        java.lang.String string3;
        java.lang.String string4;
        java.lang.String string5;
        java.lang.String string6;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "type");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityContext, "activityContext");
        java.lang.String string7 = "";
        if (kotlin.jvm.internal.Intrinsics.areEqual(type, powerwatch.matrix.com.pwgen2android.setup.language.SupportedType.DND.INSTANCE)) {
            if (value == powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.DNDMode.OFF.INSTANCE.getMode()) {
                string7 = activityContext.getString(powerwatch.matrix.com.pwgen2android.R.string.off);
            } else if (value == powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.DNDMode.ON.INSTANCE.getMode()) {
                string7 = activityContext.getString(powerwatch.matrix.com.pwgen2android.R.string.on);
            } else if (value == powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.DNDMode.AUTO.INSTANCE.getMode()) {
                string7 = activityContext.getString(powerwatch.matrix.com.pwgen2android.R.string.auto);
            }
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string7, "when (value) {\n                    DNDMode.OFF.mode -> activityContext!!.getString(R.string.off)\n                    DNDMode.ON.mode -> activityContext!!.getString(R.string.on)\n                    DNDMode.AUTO.mode -> activityContext!!.getString(R.string.auto)\n                    else -> \"\"\n                }");
            return string7;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(type, powerwatch.matrix.com.pwgen2android.setup.language.SupportedType.BackLight.INSTANCE)) {
            if (value == powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.BackLightMode.Off.INSTANCE.getMode()) {
                string6 = activityContext.getString(powerwatch.matrix.com.pwgen2android.R.string.off);
            } else if (value == powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.BackLightMode.DoubleTap.INSTANCE.getMode()) {
                string6 = activityContext.getString(powerwatch.matrix.com.pwgen2android.R.string.backlight_double_tap);
            } else {
                if (value != powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.BackLightMode.WristTilt.INSTANCE.getMode()) {
                    if (value == powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.BackLightMode.WristShake.INSTANCE.getMode()) {
                        string6 = activityContext.getString(powerwatch.matrix.com.pwgen2android.R.string.backlight_shake);
                    }
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string7, "{\n                when (value) {\n                    BackLightMode.Off.mode -> activityContext!!.getString(R.string.off)\n                    BackLightMode.DoubleTap.mode -> activityContext!!.getString(R.string.backlight_double_tap)\n                    BackLightMode.WristTilt.mode -> activityContext!!.getString(R.string.backlight_tilt)\n                    BackLightMode.WristShake.mode -> activityContext!!.getString(R.string.backlight_shake)\n                    else -> \"\"\n                }\n            }");
                    return string7;
                }
                string6 = activityContext.getString(powerwatch.matrix.com.pwgen2android.R.string.backlight_tilt);
            }
            string7 = string6;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string7, "{\n                when (value) {\n                    BackLightMode.Off.mode -> activityContext!!.getString(R.string.off)\n                    BackLightMode.DoubleTap.mode -> activityContext!!.getString(R.string.backlight_double_tap)\n                    BackLightMode.WristTilt.mode -> activityContext!!.getString(R.string.backlight_tilt)\n                    BackLightMode.WristShake.mode -> activityContext!!.getString(R.string.backlight_shake)\n                    else -> \"\"\n                }\n            }");
            return string7;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(type, powerwatch.matrix.com.pwgen2android.setup.language.SupportedType.BackLightDuration.INSTANCE)) {
            if (value == powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.BackLightDuration.timed2Sec.INSTANCE.getDuration()) {
                kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
                java.lang.String string8 = activityContext.getString(powerwatch.matrix.com.pwgen2android.R.string.duration_time);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string8, "activityContext.getString(R.string.duration_time)");
                java.lang.String str = java.lang.String.format(string8, java.util.Arrays.copyOf(new java.lang.Object[]{"2"}, 1));
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "java.lang.String.format(format, *args)");
                return str;
            }
            if (value == powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.BackLightDuration.timed5Sec.INSTANCE.getDuration()) {
                kotlin.jvm.internal.StringCompanionObject stringCompanionObject2 = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
                java.lang.String string9 = activityContext.getString(powerwatch.matrix.com.pwgen2android.R.string.duration_time);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string9, "activityContext.getString(R.string.duration_time)");
                java.lang.String str2 = java.lang.String.format(string9, java.util.Arrays.copyOf(new java.lang.Object[]{"5"}, 1));
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "java.lang.String.format(format, *args)");
                return str2;
            }
            if (value != powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.BackLightDuration.timed10Sec.INSTANCE.getDuration()) {
                return "";
            }
            kotlin.jvm.internal.StringCompanionObject stringCompanionObject3 = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
            java.lang.String string10 = activityContext.getString(powerwatch.matrix.com.pwgen2android.R.string.duration_time);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string10, "activityContext.getString(R.string.duration_time)");
            java.lang.String str3 = java.lang.String.format(string10, java.util.Arrays.copyOf(new java.lang.Object[]{"10"}, 1));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str3, "java.lang.String.format(format, *args)");
            return str3;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(type, powerwatch.matrix.com.pwgen2android.setup.language.SupportedType.PopUpDuration.INSTANCE)) {
            if (value == powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.PopupDuration.Timed5Sec.INSTANCE.getMode()) {
                kotlin.jvm.internal.StringCompanionObject stringCompanionObject4 = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
                java.lang.String string11 = activityContext.getString(powerwatch.matrix.com.pwgen2android.R.string.duration_time);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string11, "activityContext.getString(R.string.duration_time)");
                java.lang.String str4 = java.lang.String.format(string11, java.util.Arrays.copyOf(new java.lang.Object[]{"5"}, 1));
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str4, "java.lang.String.format(format, *args)");
                return str4;
            }
            if (value == powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.PopupDuration.Timed10Sec.INSTANCE.getMode()) {
                kotlin.jvm.internal.StringCompanionObject stringCompanionObject5 = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
                java.lang.String string12 = activityContext.getString(powerwatch.matrix.com.pwgen2android.R.string.duration_time);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string12, "activityContext.getString(R.string.duration_time)");
                java.lang.String str5 = java.lang.String.format(string12, java.util.Arrays.copyOf(new java.lang.Object[]{"10"}, 1));
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str5, "java.lang.String.format(format, *args)");
                return str5;
            }
            if (value != powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.PopupDuration.Timed15Sec.INSTANCE.getMode()) {
                return "";
            }
            kotlin.jvm.internal.StringCompanionObject stringCompanionObject6 = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
            java.lang.String string13 = activityContext.getString(powerwatch.matrix.com.pwgen2android.R.string.duration_time);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string13, "activityContext.getString(R.string.duration_time)");
            java.lang.String str6 = java.lang.String.format(string13, java.util.Arrays.copyOf(new java.lang.Object[]{"15"}, 1));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str6, "java.lang.String.format(format, *args)");
            return str6;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(type, powerwatch.matrix.com.pwgen2android.setup.language.SupportedType.GPSUpdateRate.INSTANCE)) {
            if (value == powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.GPSUpdateRate.Timed1Sec.INSTANCE.getRate()) {
                kotlin.jvm.internal.StringCompanionObject stringCompanionObject7 = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
                java.lang.String string14 = activityContext.getString(powerwatch.matrix.com.pwgen2android.R.string.duration_time);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string14, "activityContext.getString(R.string.duration_time)");
                java.lang.String str7 = java.lang.String.format(string14, java.util.Arrays.copyOf(new java.lang.Object[]{"1"}, 1));
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str7, "java.lang.String.format(format, *args)");
                return str7;
            }
            if (value == powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.GPSUpdateRate.Timed2Sec.INSTANCE.getRate()) {
                kotlin.jvm.internal.StringCompanionObject stringCompanionObject8 = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
                java.lang.String string15 = activityContext.getString(powerwatch.matrix.com.pwgen2android.R.string.duration_time);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string15, "activityContext.getString(R.string.duration_time)");
                java.lang.String str8 = java.lang.String.format(string15, java.util.Arrays.copyOf(new java.lang.Object[]{"2"}, 1));
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str8, "java.lang.String.format(format, *args)");
                return str8;
            }
            if (value == powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.GPSUpdateRate.Timed5Sec.INSTANCE.getRate()) {
                kotlin.jvm.internal.StringCompanionObject stringCompanionObject9 = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
                java.lang.String string16 = activityContext.getString(powerwatch.matrix.com.pwgen2android.R.string.duration_time);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string16, "activityContext.getString(R.string.duration_time)");
                java.lang.String str9 = java.lang.String.format(string16, java.util.Arrays.copyOf(new java.lang.Object[]{"5"}, 1));
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str9, "java.lang.String.format(format, *args)");
                return str9;
            }
            if (value != powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.GPSUpdateRate.Timed10Sec.INSTANCE.getRate()) {
                if (value != powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.GPSUpdateRate.Auto.INSTANCE.getRate()) {
                    return "";
                }
                java.lang.String string17 = activityContext.getString(powerwatch.matrix.com.pwgen2android.R.string.auto);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string17, "activityContext.getString(R.string.auto)");
                return string17;
            }
            kotlin.jvm.internal.StringCompanionObject stringCompanionObject10 = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
            java.lang.String string18 = activityContext.getString(powerwatch.matrix.com.pwgen2android.R.string.duration_time);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string18, "activityContext.getString(R.string.duration_time)");
            java.lang.String str10 = java.lang.String.format(string18, java.util.Arrays.copyOf(new java.lang.Object[]{"10"}, 1));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str10, "java.lang.String.format(format, *args)");
            return str10;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(type, powerwatch.matrix.com.pwgen2android.setup.language.SupportedType.HomeScreen.INSTANCE)) {
            if (value == powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.HomeScreenMode.StepsCalories.INSTANCE.getMode()) {
                kotlin.jvm.internal.StringCompanionObject stringCompanionObject11 = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
                java.lang.String string19 = activityContext.getString(powerwatch.matrix.com.pwgen2android.R.string.steps_calories);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string19, "activityContext.getString(R.string.steps_calories)");
                java.lang.String str11 = java.lang.String.format(string19, java.util.Arrays.copyOf(new java.lang.Object[0], 0));
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str11, "java.lang.String.format(format, *args)");
                return str11;
            }
            if (value == powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.HomeScreenMode.SleepHR.INSTANCE.getMode()) {
                kotlin.jvm.internal.StringCompanionObject stringCompanionObject12 = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
                java.lang.String string20 = activityContext.getString(powerwatch.matrix.com.pwgen2android.R.string.sleep_heartrate);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string20, "activityContext.getString(R.string.sleep_heartrate)");
                java.lang.String str12 = java.lang.String.format(string20, java.util.Arrays.copyOf(new java.lang.Object[0], 0));
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str12, "java.lang.String.format(format, *args)");
                return str12;
            }
            if (value == powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.HomeScreenMode.Power.INSTANCE.getMode()) {
                kotlin.jvm.internal.StringCompanionObject stringCompanionObject13 = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
                java.lang.String string21 = activityContext.getString(powerwatch.matrix.com.pwgen2android.R.string.power_body_solar);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string21, "activityContext.getString(R.string.power_body_solar)");
                java.lang.String str13 = java.lang.String.format(string21, java.util.Arrays.copyOf(new java.lang.Object[0], 0));
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str13, "java.lang.String.format(format, *args)");
                return str13;
            }
            if (value != powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.HomeScreenMode.Temperature.INSTANCE.getMode()) {
                return "";
            }
            kotlin.jvm.internal.StringCompanionObject stringCompanionObject14 = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
            java.lang.String string22 = activityContext.getString(powerwatch.matrix.com.pwgen2android.R.string.temperature);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string22, "activityContext.getString(R.string.temperature)");
            java.lang.String str14 = java.lang.String.format(string22, java.util.Arrays.copyOf(new java.lang.Object[0], 0));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str14, "java.lang.String.format(format, *args)");
            return str14;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(type, powerwatch.matrix.com.pwgen2android.setup.language.SupportedType.BLEDisconnection.INSTANCE)) {
            if (value == powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.BLEAlertMode.VibeAudio.INSTANCE.getMode()) {
                string5 = activityContext.getString(powerwatch.matrix.com.pwgen2android.R.string.vibe_audio);
            } else if (value == powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.BLEAlertMode.Audio.INSTANCE.getMode()) {
                string5 = activityContext.getString(powerwatch.matrix.com.pwgen2android.R.string.audio);
            } else {
                if (value != powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.BLEAlertMode.Vibrate.INSTANCE.getMode()) {
                    if (value == powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.BLEAlertMode.Off.INSTANCE.getMode()) {
                        string5 = activityContext.getString(powerwatch.matrix.com.pwgen2android.R.string.off);
                    }
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string7, "{\n                when (value) {\n                    BLEAlertMode.VibeAudio.mode -> activityContext.getString(R.string.vibe_audio)\n                    BLEAlertMode.Audio.mode -> activityContext.getString(R.string.audio)\n                    BLEAlertMode.Vibrate.mode -> activityContext.getString(R.string.vibrate)\n                    BLEAlertMode.Off.mode -> activityContext.getString(R.string.off)\n                    else -> \"\"\n                }\n            }");
                    return string7;
                }
                string5 = activityContext.getString(powerwatch.matrix.com.pwgen2android.R.string.vibrate);
            }
            string7 = string5;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string7, "{\n                when (value) {\n                    BLEAlertMode.VibeAudio.mode -> activityContext.getString(R.string.vibe_audio)\n                    BLEAlertMode.Audio.mode -> activityContext.getString(R.string.audio)\n                    BLEAlertMode.Vibrate.mode -> activityContext.getString(R.string.vibrate)\n                    BLEAlertMode.Off.mode -> activityContext.getString(R.string.off)\n                    else -> \"\"\n                }\n            }");
            return string7;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(type, powerwatch.matrix.com.pwgen2android.setup.language.SupportedType.Ringtone.INSTANCE)) {
            if (value == powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.RingtoneMode.Single.INSTANCE.getMode()) {
                string4 = activityContext.getString(powerwatch.matrix.com.pwgen2android.R.string.single);
            } else {
                if (value != powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.RingtoneMode.Double.INSTANCE.getMode()) {
                    if (value == powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.RingtoneMode.Triple.INSTANCE.getMode()) {
                        string4 = activityContext.getString(powerwatch.matrix.com.pwgen2android.R.string.triple);
                    }
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string7, "{\n                when (value) {\n                    RingtoneMode.Single.mode -> activityContext.getString(R.string.single)\n                    RingtoneMode.Double.mode -> activityContext.getString(R.string.double_tone)\n                    RingtoneMode.Triple.mode -> activityContext.getString(R.string.triple)\n                    else -> \"\"\n                }\n            }");
                    return string7;
                }
                string4 = activityContext.getString(powerwatch.matrix.com.pwgen2android.R.string.double_tone);
            }
            string7 = string4;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string7, "{\n                when (value) {\n                    RingtoneMode.Single.mode -> activityContext.getString(R.string.single)\n                    RingtoneMode.Double.mode -> activityContext.getString(R.string.double_tone)\n                    RingtoneMode.Triple.mode -> activityContext.getString(R.string.triple)\n                    else -> \"\"\n                }\n            }");
            return string7;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(type, powerwatch.matrix.com.pwgen2android.setup.language.SupportedType.Alert.INSTANCE)) {
            if (value == powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.AlertMode.VibeAudio.INSTANCE.getMode()) {
                string3 = activityContext.getString(powerwatch.matrix.com.pwgen2android.R.string.vibe_audio);
            } else {
                if (value != powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.AlertMode.Audio.INSTANCE.getMode()) {
                    if (value == powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.AlertMode.Vibrate.INSTANCE.getMode()) {
                        string3 = activityContext.getString(powerwatch.matrix.com.pwgen2android.R.string.vibrate);
                    }
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string7, "{\n                when (value) {\n                    AlertMode.VibeAudio.mode -> activityContext.getString(R.string.vibe_audio)\n                    AlertMode.Audio.mode -> activityContext.getString(R.string.audio)\n                    AlertMode.Vibrate.mode -> activityContext.getString(R.string.vibrate)\n                    else -> \"\"\n                }\n\n            }");
                    return string7;
                }
                string3 = activityContext.getString(powerwatch.matrix.com.pwgen2android.R.string.audio);
            }
            string7 = string3;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string7, "{\n                when (value) {\n                    AlertMode.VibeAudio.mode -> activityContext.getString(R.string.vibe_audio)\n                    AlertMode.Audio.mode -> activityContext.getString(R.string.audio)\n                    AlertMode.Vibrate.mode -> activityContext.getString(R.string.vibrate)\n                    else -> \"\"\n                }\n\n            }");
            return string7;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(type, powerwatch.matrix.com.pwgen2android.setup.language.SupportedType.AlarmRepeatMode.INSTANCE)) {
            if (value == powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.DaySelection.EveryDay.INSTANCE.getMode()) {
                string2 = activityContext.getString(powerwatch.matrix.com.pwgen2android.R.string.every_day);
            } else {
                if (value != powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.DaySelection.EveryWeekend.INSTANCE.getMode()) {
                    if (value == powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.DaySelection.EveryWeekDay.INSTANCE.getMode()) {
                        string2 = activityContext.getString(powerwatch.matrix.com.pwgen2android.R.string.every_week_day);
                    }
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string7, "{\n                when (value) {\n                    DaySelection.EveryDay.mode -> activityContext.getString(R.string.every_day)\n                    DaySelection.EveryWeekend.mode -> activityContext.getString(R.string.every_weekend)\n                    DaySelection.EveryWeekDay.mode -> activityContext.getString(R.string.every_week_day)\n                    else -> \"\"\n                }\n            }");
                    return string7;
                }
                string2 = activityContext.getString(powerwatch.matrix.com.pwgen2android.R.string.every_weekend);
            }
            string7 = string2;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string7, "{\n                when (value) {\n                    DaySelection.EveryDay.mode -> activityContext.getString(R.string.every_day)\n                    DaySelection.EveryWeekend.mode -> activityContext.getString(R.string.every_weekend)\n                    DaySelection.EveryWeekDay.mode -> activityContext.getString(R.string.every_week_day)\n                    else -> \"\"\n                }\n            }");
            return string7;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(type, powerwatch.matrix.com.pwgen2android.setup.language.SupportedType.AlarmActivation.INSTANCE)) {
            if (value == powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.AlarmControl.Off.INSTANCE.getMode()) {
                string = activityContext.getString(powerwatch.matrix.com.pwgen2android.R.string.off);
            } else {
                if (value != powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.AlarmControl.On.INSTANCE.getMode()) {
                    if (value == powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.AlarmControl.Once.INSTANCE.getMode()) {
                        string = activityContext.getString(powerwatch.matrix.com.pwgen2android.R.string.once);
                    }
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string7, "{\n                when (value) {\n                    AlarmControl.Off.mode -> activityContext.getString(R.string.off)\n                    AlarmControl.On.mode -> activityContext.getString(R.string.on)\n                    AlarmControl.Once.mode -> activityContext.getString(R.string.once)\n                    else -> \"\"\n                }\n            }");
                    return string7;
                }
                string = activityContext.getString(powerwatch.matrix.com.pwgen2android.R.string.on);
            }
            string7 = string;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string7, "{\n                when (value) {\n                    AlarmControl.Off.mode -> activityContext.getString(R.string.off)\n                    AlarmControl.On.mode -> activityContext.getString(R.string.on)\n                    AlarmControl.Once.mode -> activityContext.getString(R.string.once)\n                    else -> \"\"\n                }\n            }");
            return string7;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(type, powerwatch.matrix.com.pwgen2android.setup.language.SupportedType.UNKNOWN.INSTANCE)) {
            return "";
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    public final java.util.List<powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.chooseActityType.UIChooseItemView> loadItems(android.content.Context activityContext, powerwatch.matrix.com.pwgen2android.setup.language.SupportedType type, byte activeValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "type");
        if (kotlin.jvm.internal.Intrinsics.areEqual(type, powerwatch.matrix.com.pwgen2android.setup.language.SupportedType.DND.INSTANCE)) {
            powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.chooseActityType.UIChooseItemView[] uIChooseItemViewArr = new powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.chooseActityType.UIChooseItemView[3];
            kotlin.jvm.internal.Intrinsics.checkNotNull(activityContext);
            java.lang.String string = activityContext.getString(powerwatch.matrix.com.pwgen2android.R.string.off);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "!!.getString(R.string.off)");
            uIChooseItemViewArr[0] = new powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.chooseActityType.UIChooseItemView(string, activeValue == powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.DNDMode.OFF.INSTANCE.getMode());
            java.lang.String string2 = activityContext.getString(powerwatch.matrix.com.pwgen2android.R.string.on);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "activityContext.getString(R.string.on)");
            uIChooseItemViewArr[1] = new powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.chooseActityType.UIChooseItemView(string2, activeValue == powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.DNDMode.ON.INSTANCE.getMode());
            java.lang.String string3 = activityContext.getString(powerwatch.matrix.com.pwgen2android.R.string.auto);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string3, "activityContext.getString(R.string.auto)");
            uIChooseItemViewArr[2] = new powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.chooseActityType.UIChooseItemView(string3, activeValue == powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.DNDMode.AUTO.INSTANCE.getMode());
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) uIChooseItemViewArr);
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(type, powerwatch.matrix.com.pwgen2android.setup.language.SupportedType.BackLight.INSTANCE)) {
            powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.chooseActityType.UIChooseItemView[] uIChooseItemViewArr2 = new powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.chooseActityType.UIChooseItemView[4];
            kotlin.jvm.internal.Intrinsics.checkNotNull(activityContext);
            java.lang.String string4 = activityContext.getString(powerwatch.matrix.com.pwgen2android.R.string.off);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string4, "!!.getString(R.string.off)");
            uIChooseItemViewArr2[0] = new powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.chooseActityType.UIChooseItemView(string4, activeValue == powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.BackLightMode.Off.INSTANCE.getMode());
            java.lang.String string5 = activityContext.getString(powerwatch.matrix.com.pwgen2android.R.string.backlight_double_tap);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string5, "activityContext.getString(R.string.backlight_double_tap)");
            uIChooseItemViewArr2[1] = new powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.chooseActityType.UIChooseItemView(string5, activeValue == powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.BackLightMode.DoubleTap.INSTANCE.getMode());
            java.lang.String string6 = activityContext.getString(powerwatch.matrix.com.pwgen2android.R.string.backlight_tilt);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string6, "activityContext.getString(R.string.backlight_tilt)");
            uIChooseItemViewArr2[2] = new powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.chooseActityType.UIChooseItemView(string6, activeValue == powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.BackLightMode.WristTilt.INSTANCE.getMode());
            java.lang.String string7 = activityContext.getString(powerwatch.matrix.com.pwgen2android.R.string.backlight_shake);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string7, "activityContext.getString(R.string.backlight_shake)");
            uIChooseItemViewArr2[3] = new powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.chooseActityType.UIChooseItemView(string7, activeValue == powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.BackLightMode.WristShake.INSTANCE.getMode());
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) uIChooseItemViewArr2);
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(type, powerwatch.matrix.com.pwgen2android.setup.language.SupportedType.BackLightDuration.INSTANCE)) {
            powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.chooseActityType.UIChooseItemView[] uIChooseItemViewArr3 = new powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.chooseActityType.UIChooseItemView[3];
            kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
            kotlin.jvm.internal.Intrinsics.checkNotNull(activityContext);
            java.lang.String string8 = activityContext.getString(powerwatch.matrix.com.pwgen2android.R.string.duration_time);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string8, "!!.getString(R.string.duration_time)");
            java.lang.String str = java.lang.String.format(string8, java.util.Arrays.copyOf(new java.lang.Object[]{"2"}, 1));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "java.lang.String.format(format, *args)");
            uIChooseItemViewArr3[0] = new powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.chooseActityType.UIChooseItemView(str, activeValue == powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.BackLightDuration.timed2Sec.INSTANCE.getDuration());
            kotlin.jvm.internal.StringCompanionObject stringCompanionObject2 = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
            java.lang.String string9 = activityContext.getString(powerwatch.matrix.com.pwgen2android.R.string.duration_time);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string9, "activityContext.getString(R.string.duration_time)");
            java.lang.String str2 = java.lang.String.format(string9, java.util.Arrays.copyOf(new java.lang.Object[]{"5"}, 1));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "java.lang.String.format(format, *args)");
            uIChooseItemViewArr3[1] = new powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.chooseActityType.UIChooseItemView(str2, activeValue == powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.BackLightDuration.timed5Sec.INSTANCE.getDuration());
            kotlin.jvm.internal.StringCompanionObject stringCompanionObject3 = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
            java.lang.String string10 = activityContext.getString(powerwatch.matrix.com.pwgen2android.R.string.duration_time);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string10, "activityContext.getString(R.string.duration_time)");
            java.lang.String str3 = java.lang.String.format(string10, java.util.Arrays.copyOf(new java.lang.Object[]{"10"}, 1));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str3, "java.lang.String.format(format, *args)");
            uIChooseItemViewArr3[2] = new powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.chooseActityType.UIChooseItemView(str3, activeValue == powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.BackLightDuration.timed10Sec.INSTANCE.getDuration());
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) uIChooseItemViewArr3);
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(type, powerwatch.matrix.com.pwgen2android.setup.language.SupportedType.PopUpDuration.INSTANCE)) {
            powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.chooseActityType.UIChooseItemView[] uIChooseItemViewArr4 = new powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.chooseActityType.UIChooseItemView[3];
            kotlin.jvm.internal.StringCompanionObject stringCompanionObject4 = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
            kotlin.jvm.internal.Intrinsics.checkNotNull(activityContext);
            java.lang.String string11 = activityContext.getString(powerwatch.matrix.com.pwgen2android.R.string.duration_time);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string11, "!!.getString(R.string.duration_time)");
            java.lang.String str4 = java.lang.String.format(string11, java.util.Arrays.copyOf(new java.lang.Object[]{"5"}, 1));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str4, "java.lang.String.format(format, *args)");
            uIChooseItemViewArr4[0] = new powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.chooseActityType.UIChooseItemView(str4, activeValue == powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.PopupDuration.Timed5Sec.INSTANCE.getMode());
            kotlin.jvm.internal.StringCompanionObject stringCompanionObject5 = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
            java.lang.String string12 = activityContext.getString(powerwatch.matrix.com.pwgen2android.R.string.duration_time);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string12, "activityContext.getString(R.string.duration_time)");
            java.lang.String str5 = java.lang.String.format(string12, java.util.Arrays.copyOf(new java.lang.Object[]{"10"}, 1));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str5, "java.lang.String.format(format, *args)");
            uIChooseItemViewArr4[1] = new powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.chooseActityType.UIChooseItemView(str5, activeValue == powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.PopupDuration.Timed10Sec.INSTANCE.getMode());
            kotlin.jvm.internal.StringCompanionObject stringCompanionObject6 = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
            java.lang.String string13 = activityContext.getString(powerwatch.matrix.com.pwgen2android.R.string.duration_time);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string13, "activityContext.getString(R.string.duration_time)");
            java.lang.String str6 = java.lang.String.format(string13, java.util.Arrays.copyOf(new java.lang.Object[]{"15"}, 1));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str6, "java.lang.String.format(format, *args)");
            uIChooseItemViewArr4[2] = new powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.chooseActityType.UIChooseItemView(str6, activeValue == powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.PopupDuration.Timed15Sec.INSTANCE.getMode());
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) uIChooseItemViewArr4);
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(type, powerwatch.matrix.com.pwgen2android.setup.language.SupportedType.GPSUpdateRate.INSTANCE)) {
            powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.chooseActityType.UIChooseItemView[] uIChooseItemViewArr5 = new powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.chooseActityType.UIChooseItemView[5];
            kotlin.jvm.internal.Intrinsics.checkNotNull(activityContext);
            java.lang.String string14 = activityContext.getString(powerwatch.matrix.com.pwgen2android.R.string.auto);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string14, "!!.getString(R.string.auto)");
            uIChooseItemViewArr5[0] = new powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.chooseActityType.UIChooseItemView(string14, activeValue == powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.GPSUpdateRate.Auto.INSTANCE.getRate());
            kotlin.jvm.internal.StringCompanionObject stringCompanionObject7 = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
            java.lang.String string15 = activityContext.getString(powerwatch.matrix.com.pwgen2android.R.string.duration_time);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string15, "!!.getString(R.string.duration_time)");
            java.lang.String str7 = java.lang.String.format(string15, java.util.Arrays.copyOf(new java.lang.Object[]{"1"}, 1));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str7, "java.lang.String.format(format, *args)");
            uIChooseItemViewArr5[1] = new powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.chooseActityType.UIChooseItemView(str7, activeValue == powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.GPSUpdateRate.Timed1Sec.INSTANCE.getRate());
            kotlin.jvm.internal.StringCompanionObject stringCompanionObject8 = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
            java.lang.String string16 = activityContext.getString(powerwatch.matrix.com.pwgen2android.R.string.duration_time);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string16, "activityContext.getString(R.string.duration_time)");
            java.lang.String str8 = java.lang.String.format(string16, java.util.Arrays.copyOf(new java.lang.Object[]{"2"}, 1));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str8, "java.lang.String.format(format, *args)");
            uIChooseItemViewArr5[2] = new powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.chooseActityType.UIChooseItemView(str8, activeValue == powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.GPSUpdateRate.Timed2Sec.INSTANCE.getRate());
            kotlin.jvm.internal.StringCompanionObject stringCompanionObject9 = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
            java.lang.String string17 = activityContext.getString(powerwatch.matrix.com.pwgen2android.R.string.duration_time);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string17, "activityContext.getString(R.string.duration_time)");
            java.lang.String str9 = java.lang.String.format(string17, java.util.Arrays.copyOf(new java.lang.Object[]{"5"}, 1));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str9, "java.lang.String.format(format, *args)");
            uIChooseItemViewArr5[3] = new powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.chooseActityType.UIChooseItemView(str9, activeValue == powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.GPSUpdateRate.Timed5Sec.INSTANCE.getRate());
            kotlin.jvm.internal.StringCompanionObject stringCompanionObject10 = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
            java.lang.String string18 = activityContext.getString(powerwatch.matrix.com.pwgen2android.R.string.duration_time);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string18, "activityContext.getString(R.string.duration_time)");
            java.lang.String str10 = java.lang.String.format(string18, java.util.Arrays.copyOf(new java.lang.Object[]{"10"}, 1));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str10, "java.lang.String.format(format, *args)");
            uIChooseItemViewArr5[4] = new powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.chooseActityType.UIChooseItemView(str10, activeValue == powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.GPSUpdateRate.Timed10Sec.INSTANCE.getRate());
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) uIChooseItemViewArr5);
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(type, powerwatch.matrix.com.pwgen2android.setup.language.SupportedType.HomeScreen.INSTANCE)) {
            powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.chooseActityType.UIChooseItemView[] uIChooseItemViewArr6 = new powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.chooseActityType.UIChooseItemView[4];
            kotlin.jvm.internal.Intrinsics.checkNotNull(activityContext);
            java.lang.String string19 = activityContext.getString(powerwatch.matrix.com.pwgen2android.R.string.steps_calories);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string19, "!!.getString(R.string.steps_calories)");
            uIChooseItemViewArr6[0] = new powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.chooseActityType.UIChooseItemView(string19, activeValue == powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.HomeScreenMode.StepsCalories.INSTANCE.getMode());
            java.lang.String string20 = activityContext.getString(powerwatch.matrix.com.pwgen2android.R.string.sleep_heartrate);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string20, "activityContext.getString(R.string.sleep_heartrate)");
            uIChooseItemViewArr6[1] = new powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.chooseActityType.UIChooseItemView(string20, activeValue == powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.HomeScreenMode.SleepHR.INSTANCE.getMode());
            java.lang.String string21 = activityContext.getString(powerwatch.matrix.com.pwgen2android.R.string.temperature);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string21, "activityContext.getString(R.string.temperature)");
            uIChooseItemViewArr6[2] = new powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.chooseActityType.UIChooseItemView(string21, activeValue == powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.HomeScreenMode.Temperature.INSTANCE.getMode());
            java.lang.String string22 = activityContext.getString(powerwatch.matrix.com.pwgen2android.R.string.power_body_solar);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string22, "activityContext.getString(R.string.power_body_solar)");
            uIChooseItemViewArr6[3] = new powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.chooseActityType.UIChooseItemView(string22, activeValue == powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.HomeScreenMode.Power.INSTANCE.getMode());
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) uIChooseItemViewArr6);
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(type, powerwatch.matrix.com.pwgen2android.setup.language.SupportedType.BLEDisconnection.INSTANCE)) {
            powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.chooseActityType.UIChooseItemView[] uIChooseItemViewArr7 = new powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.chooseActityType.UIChooseItemView[4];
            kotlin.jvm.internal.Intrinsics.checkNotNull(activityContext);
            java.lang.String string23 = activityContext.getString(powerwatch.matrix.com.pwgen2android.R.string.off);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string23, "!!.getString(R.string.off)");
            uIChooseItemViewArr7[0] = new powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.chooseActityType.UIChooseItemView(string23, activeValue == powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.BLEAlertMode.Off.INSTANCE.getMode());
            java.lang.String string24 = activityContext.getString(powerwatch.matrix.com.pwgen2android.R.string.vibrate);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string24, "activityContext.getString(R.string.vibrate)");
            uIChooseItemViewArr7[1] = new powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.chooseActityType.UIChooseItemView(string24, activeValue == powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.BLEAlertMode.Vibrate.INSTANCE.getMode());
            java.lang.String string25 = activityContext.getString(powerwatch.matrix.com.pwgen2android.R.string.audio);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string25, "activityContext.getString(R.string.audio)");
            uIChooseItemViewArr7[2] = new powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.chooseActityType.UIChooseItemView(string25, activeValue == powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.BLEAlertMode.Audio.INSTANCE.getMode());
            java.lang.String string26 = activityContext.getString(powerwatch.matrix.com.pwgen2android.R.string.vibe_audio);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string26, "activityContext.getString(R.string.vibe_audio)");
            uIChooseItemViewArr7[3] = new powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.chooseActityType.UIChooseItemView(string26, activeValue == powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.BLEAlertMode.VibeAudio.INSTANCE.getMode());
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) uIChooseItemViewArr7);
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(type, powerwatch.matrix.com.pwgen2android.setup.language.SupportedType.Ringtone.INSTANCE)) {
            powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.chooseActityType.UIChooseItemView[] uIChooseItemViewArr8 = new powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.chooseActityType.UIChooseItemView[3];
            kotlin.jvm.internal.Intrinsics.checkNotNull(activityContext);
            java.lang.String string27 = activityContext.getString(powerwatch.matrix.com.pwgen2android.R.string.single);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string27, "!!.getString(R.string.single)");
            uIChooseItemViewArr8[0] = new powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.chooseActityType.UIChooseItemView(string27, activeValue == powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.RingtoneMode.Single.INSTANCE.getMode());
            java.lang.String string28 = activityContext.getString(powerwatch.matrix.com.pwgen2android.R.string.double_tone);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string28, "activityContext.getString(R.string.double_tone)");
            uIChooseItemViewArr8[1] = new powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.chooseActityType.UIChooseItemView(string28, activeValue == powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.RingtoneMode.Double.INSTANCE.getMode());
            java.lang.String string29 = activityContext.getString(powerwatch.matrix.com.pwgen2android.R.string.triple);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string29, "activityContext.getString(R.string.triple)");
            uIChooseItemViewArr8[2] = new powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.chooseActityType.UIChooseItemView(string29, activeValue == powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.RingtoneMode.Triple.INSTANCE.getMode());
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) uIChooseItemViewArr8);
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(type, powerwatch.matrix.com.pwgen2android.setup.language.SupportedType.Alert.INSTANCE)) {
            powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.chooseActityType.UIChooseItemView[] uIChooseItemViewArr9 = new powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.chooseActityType.UIChooseItemView[3];
            kotlin.jvm.internal.Intrinsics.checkNotNull(activityContext);
            java.lang.String string30 = activityContext.getString(powerwatch.matrix.com.pwgen2android.R.string.vibe_audio);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string30, "!!.getString(R.string.vibe_audio)");
            uIChooseItemViewArr9[0] = new powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.chooseActityType.UIChooseItemView(string30, activeValue == powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.AlertMode.VibeAudio.INSTANCE.getMode());
            java.lang.String string31 = activityContext.getString(powerwatch.matrix.com.pwgen2android.R.string.vibrate);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string31, "activityContext.getString(R.string.vibrate)");
            uIChooseItemViewArr9[1] = new powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.chooseActityType.UIChooseItemView(string31, activeValue == powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.AlertMode.Vibrate.INSTANCE.getMode());
            java.lang.String string32 = activityContext.getString(powerwatch.matrix.com.pwgen2android.R.string.audio);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string32, "activityContext.getString(R.string.audio)");
            uIChooseItemViewArr9[2] = new powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.chooseActityType.UIChooseItemView(string32, activeValue == powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.AlertMode.Audio.INSTANCE.getMode());
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) uIChooseItemViewArr9);
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(type, powerwatch.matrix.com.pwgen2android.setup.language.SupportedType.AlarmRepeatMode.INSTANCE)) {
            powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.chooseActityType.UIChooseItemView[] uIChooseItemViewArr10 = new powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.chooseActityType.UIChooseItemView[3];
            kotlin.jvm.internal.Intrinsics.checkNotNull(activityContext);
            java.lang.String string33 = activityContext.getString(powerwatch.matrix.com.pwgen2android.R.string.every_day);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string33, "!!.getString(R.string.every_day)");
            uIChooseItemViewArr10[0] = new powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.chooseActityType.UIChooseItemView(string33, activeValue == powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.DaySelection.EveryDay.INSTANCE.getMode());
            java.lang.String string34 = activityContext.getString(powerwatch.matrix.com.pwgen2android.R.string.every_week_day);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string34, "activityContext.getString(R.string.every_week_day)");
            uIChooseItemViewArr10[1] = new powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.chooseActityType.UIChooseItemView(string34, activeValue == powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.DaySelection.EveryWeekDay.INSTANCE.getMode());
            java.lang.String string35 = activityContext.getString(powerwatch.matrix.com.pwgen2android.R.string.every_weekend);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string35, "activityContext.getString(R.string.every_weekend)");
            uIChooseItemViewArr10[2] = new powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.chooseActityType.UIChooseItemView(string35, activeValue == powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.DaySelection.EveryWeekend.INSTANCE.getMode());
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) uIChooseItemViewArr10);
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(type, powerwatch.matrix.com.pwgen2android.setup.language.SupportedType.AlarmActivation.INSTANCE)) {
            powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.chooseActityType.UIChooseItemView[] uIChooseItemViewArr11 = new powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.chooseActityType.UIChooseItemView[3];
            kotlin.jvm.internal.Intrinsics.checkNotNull(activityContext);
            java.lang.String string36 = activityContext.getString(powerwatch.matrix.com.pwgen2android.R.string.off);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string36, "!!.getString(R.string.off)");
            uIChooseItemViewArr11[0] = new powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.chooseActityType.UIChooseItemView(string36, activeValue == powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.AlarmControl.Off.INSTANCE.getMode());
            java.lang.String string37 = activityContext.getString(powerwatch.matrix.com.pwgen2android.R.string.on);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string37, "activityContext.getString(R.string.on)");
            uIChooseItemViewArr11[1] = new powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.chooseActityType.UIChooseItemView(string37, activeValue == powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.AlarmControl.On.INSTANCE.getMode());
            java.lang.String string38 = activityContext.getString(powerwatch.matrix.com.pwgen2android.R.string.once);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string38, "activityContext.getString(R.string.once)");
            uIChooseItemViewArr11[2] = new powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.chooseActityType.UIChooseItemView(string38, activeValue == powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.AlarmControl.Once.INSTANCE.getMode());
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) uIChooseItemViewArr11);
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(type, powerwatch.matrix.com.pwgen2android.setup.language.SupportedType.UNKNOWN.INSTANCE)) {
            return kotlin.collections.CollectionsKt.emptyList();
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }
}
