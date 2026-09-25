package powerwatch.matrix.com.pwgen2android;

/* JADX INFO: loaded from: classes2.dex */
public class DataBinderMapperImpl extends androidx.databinding.DataBinderMapper {
    private static final android.util.SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP;
    private static final int LAYOUT_ACTIVITYMAIN = 1;
    private static final int LAYOUT_ACTIVITYPAIRING = 2;
    private static final int LAYOUT_ACTIVITYSETUP = 3;
    private static final int LAYOUT_ACTIVITYSPLASHSCREEN = 4;
    private static final int LAYOUT_DIALOGBADPLACEMENT = 5;
    private static final int LAYOUT_FRAGEMENTBIOMETRICS = 6;
    private static final int LAYOUT_FRAGMENTACTIVITYPERIODITEM = 7;
    private static final int LAYOUT_FRAGMENTACTIVITYPERIODS = 8;
    private static final int LAYOUT_FRAGMENTBAIDUMAPS = 9;
    private static final int LAYOUT_FRAGMENTCALENDAR = 10;
    private static final int LAYOUT_FRAGMENTCHANGEPASSWORD = 11;
    private static final int LAYOUT_FRAGMENTCHOOSEHOURFORMAT = 12;
    private static final int LAYOUT_FRAGMENTCHOOSELANGUAGE = 13;
    private static final int LAYOUT_FRAGMENTCHOOSEPRODUCT = 14;
    private static final int LAYOUT_FRAGMENTCHOOSEUNITS = 15;
    private static final int LAYOUT_FRAGMENTCONTROLVIEW = 16;
    private static final int LAYOUT_FRAGMENTCREATEACCOUNT = 17;
    private static final int LAYOUT_FRAGMENTDAILYGOALSSETTINGS = 18;
    private static final int LAYOUT_FRAGMENTDASHBOARDCONTAINER = 19;
    private static final int LAYOUT_FRAGMENTDEVICEBANNER = 20;
    private static final int LAYOUT_FRAGMENTEDITBIOMETRICS = 21;
    private static final int LAYOUT_FRAGMENTEDITUSERACTIVITY = 22;
    private static final int LAYOUT_FRAGMENTENTERPINCODE = 23;
    private static final int LAYOUT_FRAGMENTFIRMWAREAVAILABLE = 24;
    private static final int LAYOUT_FRAGMENTFORGOTPASSWORD = 25;
    private static final int LAYOUT_FRAGMENTGEN1PAIRING = 26;
    private static final int LAYOUT_FRAGMENTGEN2PAIRINGPROGRESS = 27;
    private static final int LAYOUT_FRAGMENTGETSTARTEDSCREEN = 28;
    private static final int LAYOUT_FRAGMENTGETTINGSTARTED = 29;
    private static final int LAYOUT_FRAGMENTHEARTRATECHART = 30;
    private static final int LAYOUT_FRAGMENTINTERNALLOGGER = 31;
    private static final int LAYOUT_FRAGMENTLICENCEPAGE = 32;
    private static final int LAYOUT_FRAGMENTMAINDASHBOARD = 33;
    private static final int LAYOUT_FRAGMENTMAINUSERACTIVITY = 34;
    private static final int LAYOUT_FRAGMENTMAPS = 35;
    private static final int LAYOUT_FRAGMENTMYPOWERWATCH = 36;
    private static final int LAYOUT_FRAGMENTNOTIFICATIONLOGGER = 37;
    private static final int LAYOUT_FRAGMENTNOTIFICATIONS = 39;
    private static final int LAYOUT_FRAGMENTNOTIFICATIONSETTINGS = 38;
    private static final int LAYOUT_FRAGMENTOTATRACK = 40;
    private static final int LAYOUT_FRAGMENTPAIRFAILED = 41;
    private static final int LAYOUT_FRAGMENTPAIRINGPROGRESS = 43;
    private static final int LAYOUT_FRAGMENTPAIRSUCCESS = 42;
    private static final int LAYOUT_FRAGMENTPERMISSIONINFO = 44;
    private static final int LAYOUT_FRAGMENTPERSONALSETTINGS = 45;
    private static final int LAYOUT_FRAGMENTQRCODETUTORIAL = 46;
    private static final int LAYOUT_FRAGMENTREALTIME = 47;
    private static final int LAYOUT_FRAGMENTSCAN = 48;
    private static final int LAYOUT_FRAGMENTSELECTITEMS = 49;
    private static final int LAYOUT_FRAGMENTSETGOALS = 50;
    private static final int LAYOUT_FRAGMENTSHAREACTIVITY = 51;
    private static final int LAYOUT_FRAGMENTSIGNIN = 52;
    private static final int LAYOUT_FRAGMENTSINGLEBIOMETRICS = 53;
    private static final int LAYOUT_FRAGMENTSINGLEGOALEDIT = 54;
    private static final int LAYOUT_FRAGMENTSYNC = 55;
    private static final int LAYOUT_FRAGMENTTHIRDPARTYPERMISSION = 56;
    private static final int LAYOUT_FRAGMENTTIMERSETTINGS = 57;
    private static final int LAYOUT_FRAGMENTUNPAIRWATCH = 58;
    private static final int LAYOUT_FRAGMENTUSERACTIVITY = 59;
    private static final int LAYOUT_FRAGMENTVERIFYACCOUNT = 60;
    private static final int LAYOUT_FRAGMENTWATCHALARM = 61;
    private static final int LAYOUT_FRAGMENTWATCHCONTAINER = 62;
    private static final int LAYOUT_FRAGMENTWATCHSETTINGS = 63;
    private static final int LAYOUT_FRAGMENTWELCOMESCREEN = 64;
    private static final int LAYOUT_SECRETSCREENFRAGMENT = 65;
    private static final int LAYOUT_WEBVIEWCONTAINER = 66;

    static {
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray(66);
        INTERNAL_LAYOUT_ID_LOOKUP = sparseIntArray;
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.layout.activity_main, 1);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.layout.activity_pairing, 2);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.layout.activity_setup, 3);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.layout.activity_splash_screen, 4);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.layout.dialog_bad_placement, 5);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.layout.fragement_biometrics, 6);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.layout.fragment_activity_period_item, 7);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.layout.fragment_activity_periods, 8);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.layout.fragment_baidu_maps, 9);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.layout.fragment_calendar, 10);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.layout.fragment_change_password, 11);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.layout.fragment_choose_hour_format, 12);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.layout.fragment_choose_language, 13);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.layout.fragment_choose_product, 14);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.layout.fragment_choose_units, 15);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.layout.fragment_control_view, 16);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.layout.fragment_create_account, 17);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.layout.fragment_daily_goals_settings, 18);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.layout.fragment_dashboard_container, 19);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.layout.fragment_device_banner, 20);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.layout.fragment_edit_biometrics, 21);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.layout.fragment_edit_user_activity, 22);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.layout.fragment_enter_pin_code, 23);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.layout.fragment_firmware_available, 24);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.layout.fragment_forgot_password, 25);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.layout.fragment_gen1_pairing, 26);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.layout.fragment_gen2_pairing_progress, 27);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.layout.fragment_get_started_screen, 28);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.layout.fragment_getting_started, 29);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.layout.fragment_heart_rate_chart, 30);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.layout.fragment_internal_logger, 31);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.layout.fragment_licence_page, 32);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.layout.fragment_main_dashboard, 33);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.layout.fragment_main_user_activity, 34);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.layout.fragment_maps, 35);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.layout.fragment_my_powerwatch, 36);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.layout.fragment_notification_logger, 37);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.layout.fragment_notification_settings, 38);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.layout.fragment_notifications, 39);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.layout.fragment_ota_track, 40);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.layout.fragment_pair_failed, 41);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.layout.fragment_pair_success, 42);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.layout.fragment_pairing_progress, 43);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.layout.fragment_permission_info, 44);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.layout.fragment_personal_settings, 45);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.layout.fragment_qr_code_tutorial, 46);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.layout.fragment_realtime, 47);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.layout.fragment_scan, 48);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.layout.fragment_select_items, 49);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.layout.fragment_set_goals, 50);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.layout.fragment_share_activity, 51);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.layout.fragment_sign_in, 52);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.layout.fragment_single_biometrics, 53);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.layout.fragment_single_goal_edit, 54);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.layout.fragment_sync, 55);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.layout.fragment_third_party_permission, 56);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.layout.fragment_timer_settings, 57);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.layout.fragment_unpair_watch, 58);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.layout.fragment_user_activity, 59);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.layout.fragment_verify_account, 60);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.layout.fragment_watch_alarm, 61);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.layout.fragment_watch_container, 62);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.layout.fragment_watch_settings, 63);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.layout.fragment_welcome_screen, 64);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.layout.secret_screen_fragment, 65);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.layout.web_view_container, 66);
    }

    private final androidx.databinding.ViewDataBinding internalGetViewDataBinding0(androidx.databinding.DataBindingComponent component, android.view.View view, int internalId, java.lang.Object tag) {
        switch (internalId) {
            case 1:
                if ("layout/activity_main_0".equals(tag)) {
                    return new powerwatch.matrix.com.pwgen2android.databinding.ActivityMainBindingImpl(component, view);
                }
                throw new java.lang.IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
            case 2:
                if ("layout/activity_pairing_0".equals(tag)) {
                    return new powerwatch.matrix.com.pwgen2android.databinding.ActivityPairingBindingImpl(component, view);
                }
                throw new java.lang.IllegalArgumentException("The tag for activity_pairing is invalid. Received: " + tag);
            case 3:
                if ("layout/activity_setup_0".equals(tag)) {
                    return new powerwatch.matrix.com.pwgen2android.databinding.ActivitySetupBindingImpl(component, view);
                }
                throw new java.lang.IllegalArgumentException("The tag for activity_setup is invalid. Received: " + tag);
            case 4:
                if ("layout/activity_splash_screen_0".equals(tag)) {
                    return new powerwatch.matrix.com.pwgen2android.databinding.ActivitySplashScreenBindingImpl(component, view);
                }
                throw new java.lang.IllegalArgumentException("The tag for activity_splash_screen is invalid. Received: " + tag);
            case 5:
                if ("layout/dialog_bad_placement_0".equals(tag)) {
                    return new powerwatch.matrix.com.pwgen2android.databinding.DialogBadPlacementBindingImpl(component, view);
                }
                throw new java.lang.IllegalArgumentException("The tag for dialog_bad_placement is invalid. Received: " + tag);
            case 6:
                if ("layout/fragement_biometrics_0".equals(tag)) {
                    return new powerwatch.matrix.com.pwgen2android.databinding.FragementBiometricsBindingImpl(component, view);
                }
                throw new java.lang.IllegalArgumentException("The tag for fragement_biometrics is invalid. Received: " + tag);
            case 7:
                if ("layout/fragment_activity_period_item_0".equals(tag)) {
                    return new powerwatch.matrix.com.pwgen2android.databinding.FragmentActivityPeriodItemBindingImpl(component, view);
                }
                throw new java.lang.IllegalArgumentException("The tag for fragment_activity_period_item is invalid. Received: " + tag);
            case 8:
                if ("layout/fragment_activity_periods_0".equals(tag)) {
                    return new powerwatch.matrix.com.pwgen2android.databinding.FragmentActivityPeriodsBindingImpl(component, view);
                }
                throw new java.lang.IllegalArgumentException("The tag for fragment_activity_periods is invalid. Received: " + tag);
            case 9:
                if ("layout/fragment_baidu_maps_0".equals(tag)) {
                    return new powerwatch.matrix.com.pwgen2android.databinding.FragmentBaiduMapsBindingImpl(component, view);
                }
                throw new java.lang.IllegalArgumentException("The tag for fragment_baidu_maps is invalid. Received: " + tag);
            case 10:
                if ("layout/fragment_calendar_0".equals(tag)) {
                    return new powerwatch.matrix.com.pwgen2android.databinding.FragmentCalendarBindingImpl(component, view);
                }
                throw new java.lang.IllegalArgumentException("The tag for fragment_calendar is invalid. Received: " + tag);
            case 11:
                if ("layout/fragment_change_password_0".equals(tag)) {
                    return new powerwatch.matrix.com.pwgen2android.databinding.FragmentChangePasswordBindingImpl(component, view);
                }
                throw new java.lang.IllegalArgumentException("The tag for fragment_change_password is invalid. Received: " + tag);
            case 12:
                if ("layout/fragment_choose_hour_format_0".equals(tag)) {
                    return new powerwatch.matrix.com.pwgen2android.databinding.FragmentChooseHourFormatBindingImpl(component, view);
                }
                throw new java.lang.IllegalArgumentException("The tag for fragment_choose_hour_format is invalid. Received: " + tag);
            case 13:
                if ("layout/fragment_choose_language_0".equals(tag)) {
                    return new powerwatch.matrix.com.pwgen2android.databinding.FragmentChooseLanguageBindingImpl(component, view);
                }
                throw new java.lang.IllegalArgumentException("The tag for fragment_choose_language is invalid. Received: " + tag);
            case 14:
                if ("layout/fragment_choose_product_0".equals(tag)) {
                    return new powerwatch.matrix.com.pwgen2android.databinding.FragmentChooseProductBindingImpl(component, view);
                }
                throw new java.lang.IllegalArgumentException("The tag for fragment_choose_product is invalid. Received: " + tag);
            case 15:
                if ("layout/fragment_choose_units_0".equals(tag)) {
                    return new powerwatch.matrix.com.pwgen2android.databinding.FragmentChooseUnitsBindingImpl(component, view);
                }
                throw new java.lang.IllegalArgumentException("The tag for fragment_choose_units is invalid. Received: " + tag);
            case 16:
                if ("layout/fragment_control_view_0".equals(tag)) {
                    return new powerwatch.matrix.com.pwgen2android.databinding.FragmentControlViewBindingImpl(component, view);
                }
                throw new java.lang.IllegalArgumentException("The tag for fragment_control_view is invalid. Received: " + tag);
            case 17:
                if ("layout/fragment_create_account_0".equals(tag)) {
                    return new powerwatch.matrix.com.pwgen2android.databinding.FragmentCreateAccountBindingImpl(component, view);
                }
                throw new java.lang.IllegalArgumentException("The tag for fragment_create_account is invalid. Received: " + tag);
            case 18:
                if ("layout/fragment_daily_goals_settings_0".equals(tag)) {
                    return new powerwatch.matrix.com.pwgen2android.databinding.FragmentDailyGoalsSettingsBindingImpl(component, view);
                }
                throw new java.lang.IllegalArgumentException("The tag for fragment_daily_goals_settings is invalid. Received: " + tag);
            case 19:
                if ("layout/fragment_dashboard_container_0".equals(tag)) {
                    return new powerwatch.matrix.com.pwgen2android.databinding.FragmentDashboardContainerBindingImpl(component, view);
                }
                throw new java.lang.IllegalArgumentException("The tag for fragment_dashboard_container is invalid. Received: " + tag);
            case 20:
                if ("layout/fragment_device_banner_0".equals(tag)) {
                    return new powerwatch.matrix.com.pwgen2android.databinding.FragmentDeviceBannerBindingImpl(component, view);
                }
                throw new java.lang.IllegalArgumentException("The tag for fragment_device_banner is invalid. Received: " + tag);
            case 21:
                if ("layout/fragment_edit_biometrics_0".equals(tag)) {
                    return new powerwatch.matrix.com.pwgen2android.databinding.FragmentEditBiometricsBindingImpl(component, view);
                }
                throw new java.lang.IllegalArgumentException("The tag for fragment_edit_biometrics is invalid. Received: " + tag);
            case 22:
                if ("layout/fragment_edit_user_activity_0".equals(tag)) {
                    return new powerwatch.matrix.com.pwgen2android.databinding.FragmentEditUserActivityBindingImpl(component, view);
                }
                throw new java.lang.IllegalArgumentException("The tag for fragment_edit_user_activity is invalid. Received: " + tag);
            case 23:
                if ("layout/fragment_enter_pin_code_0".equals(tag)) {
                    return new powerwatch.matrix.com.pwgen2android.databinding.FragmentEnterPinCodeBindingImpl(component, view);
                }
                throw new java.lang.IllegalArgumentException("The tag for fragment_enter_pin_code is invalid. Received: " + tag);
            case 24:
                if ("layout/fragment_firmware_available_0".equals(tag)) {
                    return new powerwatch.matrix.com.pwgen2android.databinding.FragmentFirmwareAvailableBindingImpl(component, view);
                }
                throw new java.lang.IllegalArgumentException("The tag for fragment_firmware_available is invalid. Received: " + tag);
            case 25:
                if ("layout/fragment_forgot_password_0".equals(tag)) {
                    return new powerwatch.matrix.com.pwgen2android.databinding.FragmentForgotPasswordBindingImpl(component, view);
                }
                throw new java.lang.IllegalArgumentException("The tag for fragment_forgot_password is invalid. Received: " + tag);
            case 26:
                if ("layout/fragment_gen1_pairing_0".equals(tag)) {
                    return new powerwatch.matrix.com.pwgen2android.databinding.FragmentGen1PairingBindingImpl(component, view);
                }
                throw new java.lang.IllegalArgumentException("The tag for fragment_gen1_pairing is invalid. Received: " + tag);
            case 27:
                if ("layout/fragment_gen2_pairing_progress_0".equals(tag)) {
                    return new powerwatch.matrix.com.pwgen2android.databinding.FragmentGen2PairingProgressBindingImpl(component, view);
                }
                throw new java.lang.IllegalArgumentException("The tag for fragment_gen2_pairing_progress is invalid. Received: " + tag);
            case 28:
                if ("layout/fragment_get_started_screen_0".equals(tag)) {
                    return new powerwatch.matrix.com.pwgen2android.databinding.FragmentGetStartedScreenBindingImpl(component, view);
                }
                throw new java.lang.IllegalArgumentException("The tag for fragment_get_started_screen is invalid. Received: " + tag);
            case 29:
                if ("layout/fragment_getting_started_0".equals(tag)) {
                    return new powerwatch.matrix.com.pwgen2android.databinding.FragmentGettingStartedBindingImpl(component, view);
                }
                throw new java.lang.IllegalArgumentException("The tag for fragment_getting_started is invalid. Received: " + tag);
            case 30:
                if ("layout/fragment_heart_rate_chart_0".equals(tag)) {
                    return new powerwatch.matrix.com.pwgen2android.databinding.FragmentHeartRateChartBindingImpl(component, view);
                }
                throw new java.lang.IllegalArgumentException("The tag for fragment_heart_rate_chart is invalid. Received: " + tag);
            case 31:
                if ("layout/fragment_internal_logger_0".equals(tag)) {
                    return new powerwatch.matrix.com.pwgen2android.databinding.FragmentInternalLoggerBindingImpl(component, view);
                }
                throw new java.lang.IllegalArgumentException("The tag for fragment_internal_logger is invalid. Received: " + tag);
            case 32:
                if ("layout/fragment_licence_page_0".equals(tag)) {
                    return new powerwatch.matrix.com.pwgen2android.databinding.FragmentLicencePageBindingImpl(component, view);
                }
                throw new java.lang.IllegalArgumentException("The tag for fragment_licence_page is invalid. Received: " + tag);
            case 33:
                if ("layout/fragment_main_dashboard_0".equals(tag)) {
                    return new powerwatch.matrix.com.pwgen2android.databinding.FragmentMainDashboardBindingImpl(component, view);
                }
                throw new java.lang.IllegalArgumentException("The tag for fragment_main_dashboard is invalid. Received: " + tag);
            case 34:
                if ("layout/fragment_main_user_activity_0".equals(tag)) {
                    return new powerwatch.matrix.com.pwgen2android.databinding.FragmentMainUserActivityBindingImpl(component, view);
                }
                throw new java.lang.IllegalArgumentException("The tag for fragment_main_user_activity is invalid. Received: " + tag);
            case 35:
                if ("layout/fragment_maps_0".equals(tag)) {
                    return new powerwatch.matrix.com.pwgen2android.databinding.FragmentMapsBindingImpl(component, view);
                }
                throw new java.lang.IllegalArgumentException("The tag for fragment_maps is invalid. Received: " + tag);
            case 36:
                if ("layout/fragment_my_powerwatch_0".equals(tag)) {
                    return new powerwatch.matrix.com.pwgen2android.databinding.FragmentMyPowerwatchBindingImpl(component, view);
                }
                throw new java.lang.IllegalArgumentException("The tag for fragment_my_powerwatch is invalid. Received: " + tag);
            case 37:
                if ("layout/fragment_notification_logger_0".equals(tag)) {
                    return new powerwatch.matrix.com.pwgen2android.databinding.FragmentNotificationLoggerBindingImpl(component, view);
                }
                throw new java.lang.IllegalArgumentException("The tag for fragment_notification_logger is invalid. Received: " + tag);
            case 38:
                if ("layout/fragment_notification_settings_0".equals(tag)) {
                    return new powerwatch.matrix.com.pwgen2android.databinding.FragmentNotificationSettingsBindingImpl(component, view);
                }
                throw new java.lang.IllegalArgumentException("The tag for fragment_notification_settings is invalid. Received: " + tag);
            case 39:
                if ("layout/fragment_notifications_0".equals(tag)) {
                    return new powerwatch.matrix.com.pwgen2android.databinding.FragmentNotificationsBindingImpl(component, view);
                }
                throw new java.lang.IllegalArgumentException("The tag for fragment_notifications is invalid. Received: " + tag);
            case 40:
                if ("layout/fragment_ota_track_0".equals(tag)) {
                    return new powerwatch.matrix.com.pwgen2android.databinding.FragmentOtaTrackBindingImpl(component, view);
                }
                throw new java.lang.IllegalArgumentException("The tag for fragment_ota_track is invalid. Received: " + tag);
            case 41:
                if ("layout/fragment_pair_failed_0".equals(tag)) {
                    return new powerwatch.matrix.com.pwgen2android.databinding.FragmentPairFailedBindingImpl(component, view);
                }
                throw new java.lang.IllegalArgumentException("The tag for fragment_pair_failed is invalid. Received: " + tag);
            case 42:
                if ("layout/fragment_pair_success_0".equals(tag)) {
                    return new powerwatch.matrix.com.pwgen2android.databinding.FragmentPairSuccessBindingImpl(component, view);
                }
                throw new java.lang.IllegalArgumentException("The tag for fragment_pair_success is invalid. Received: " + tag);
            case 43:
                if ("layout/fragment_pairing_progress_0".equals(tag)) {
                    return new powerwatch.matrix.com.pwgen2android.databinding.FragmentPairingProgressBindingImpl(component, view);
                }
                throw new java.lang.IllegalArgumentException("The tag for fragment_pairing_progress is invalid. Received: " + tag);
            case 44:
                if ("layout/fragment_permission_info_0".equals(tag)) {
                    return new powerwatch.matrix.com.pwgen2android.databinding.FragmentPermissionInfoBindingImpl(component, view);
                }
                throw new java.lang.IllegalArgumentException("The tag for fragment_permission_info is invalid. Received: " + tag);
            case 45:
                if ("layout/fragment_personal_settings_0".equals(tag)) {
                    return new powerwatch.matrix.com.pwgen2android.databinding.FragmentPersonalSettingsBindingImpl(component, view);
                }
                throw new java.lang.IllegalArgumentException("The tag for fragment_personal_settings is invalid. Received: " + tag);
            case 46:
                if ("layout/fragment_qr_code_tutorial_0".equals(tag)) {
                    return new powerwatch.matrix.com.pwgen2android.databinding.FragmentQrCodeTutorialBindingImpl(component, view);
                }
                throw new java.lang.IllegalArgumentException("The tag for fragment_qr_code_tutorial is invalid. Received: " + tag);
            case 47:
                if ("layout/fragment_realtime_0".equals(tag)) {
                    return new powerwatch.matrix.com.pwgen2android.databinding.FragmentRealtimeBindingImpl(component, view);
                }
                throw new java.lang.IllegalArgumentException("The tag for fragment_realtime is invalid. Received: " + tag);
            case 48:
                if ("layout/fragment_scan_0".equals(tag)) {
                    return new powerwatch.matrix.com.pwgen2android.databinding.FragmentScanBindingImpl(component, view);
                }
                throw new java.lang.IllegalArgumentException("The tag for fragment_scan is invalid. Received: " + tag);
            case 49:
                if ("layout/fragment_select_items_0".equals(tag)) {
                    return new powerwatch.matrix.com.pwgen2android.databinding.FragmentSelectItemsBindingImpl(component, view);
                }
                throw new java.lang.IllegalArgumentException("The tag for fragment_select_items is invalid. Received: " + tag);
            case 50:
                if ("layout/fragment_set_goals_0".equals(tag)) {
                    return new powerwatch.matrix.com.pwgen2android.databinding.FragmentSetGoalsBindingImpl(component, view);
                }
                throw new java.lang.IllegalArgumentException("The tag for fragment_set_goals is invalid. Received: " + tag);
            default:
                return null;
        }
    }

    private final androidx.databinding.ViewDataBinding internalGetViewDataBinding1(androidx.databinding.DataBindingComponent component, android.view.View view, int internalId, java.lang.Object tag) {
        switch (internalId) {
            case 51:
                if ("layout/fragment_share_activity_0".equals(tag)) {
                    return new powerwatch.matrix.com.pwgen2android.databinding.FragmentShareActivityBindingImpl(component, view);
                }
                throw new java.lang.IllegalArgumentException("The tag for fragment_share_activity is invalid. Received: " + tag);
            case 52:
                if ("layout/fragment_sign_in_0".equals(tag)) {
                    return new powerwatch.matrix.com.pwgen2android.databinding.FragmentSignInBindingImpl(component, view);
                }
                throw new java.lang.IllegalArgumentException("The tag for fragment_sign_in is invalid. Received: " + tag);
            case 53:
                if ("layout/fragment_single_biometrics_0".equals(tag)) {
                    return new powerwatch.matrix.com.pwgen2android.databinding.FragmentSingleBiometricsBindingImpl(component, view);
                }
                throw new java.lang.IllegalArgumentException("The tag for fragment_single_biometrics is invalid. Received: " + tag);
            case 54:
                if ("layout/fragment_single_goal_edit_0".equals(tag)) {
                    return new powerwatch.matrix.com.pwgen2android.databinding.FragmentSingleGoalEditBindingImpl(component, view);
                }
                throw new java.lang.IllegalArgumentException("The tag for fragment_single_goal_edit is invalid. Received: " + tag);
            case 55:
                if ("layout/fragment_sync_0".equals(tag)) {
                    return new powerwatch.matrix.com.pwgen2android.databinding.FragmentSyncBindingImpl(component, view);
                }
                throw new java.lang.IllegalArgumentException("The tag for fragment_sync is invalid. Received: " + tag);
            case 56:
                if ("layout/fragment_third_party_permission_0".equals(tag)) {
                    return new powerwatch.matrix.com.pwgen2android.databinding.FragmentThirdPartyPermissionBindingImpl(component, view);
                }
                throw new java.lang.IllegalArgumentException("The tag for fragment_third_party_permission is invalid. Received: " + tag);
            case 57:
                if ("layout/fragment_timer_settings_0".equals(tag)) {
                    return new powerwatch.matrix.com.pwgen2android.databinding.FragmentTimerSettingsBindingImpl(component, view);
                }
                throw new java.lang.IllegalArgumentException("The tag for fragment_timer_settings is invalid. Received: " + tag);
            case 58:
                if ("layout/fragment_unpair_watch_0".equals(tag)) {
                    return new powerwatch.matrix.com.pwgen2android.databinding.FragmentUnpairWatchBindingImpl(component, view);
                }
                throw new java.lang.IllegalArgumentException("The tag for fragment_unpair_watch is invalid. Received: " + tag);
            case 59:
                if ("layout/fragment_user_activity_0".equals(tag)) {
                    return new powerwatch.matrix.com.pwgen2android.databinding.FragmentUserActivityBindingImpl(component, view);
                }
                throw new java.lang.IllegalArgumentException("The tag for fragment_user_activity is invalid. Received: " + tag);
            case 60:
                if ("layout/fragment_verify_account_0".equals(tag)) {
                    return new powerwatch.matrix.com.pwgen2android.databinding.FragmentVerifyAccountBindingImpl(component, view);
                }
                throw new java.lang.IllegalArgumentException("The tag for fragment_verify_account is invalid. Received: " + tag);
            case 61:
                if ("layout/fragment_watch_alarm_0".equals(tag)) {
                    return new powerwatch.matrix.com.pwgen2android.databinding.FragmentWatchAlarmBindingImpl(component, view);
                }
                throw new java.lang.IllegalArgumentException("The tag for fragment_watch_alarm is invalid. Received: " + tag);
            case 62:
                if ("layout/fragment_watch_container_0".equals(tag)) {
                    return new powerwatch.matrix.com.pwgen2android.databinding.FragmentWatchContainerBindingImpl(component, view);
                }
                throw new java.lang.IllegalArgumentException("The tag for fragment_watch_container is invalid. Received: " + tag);
            case 63:
                if ("layout/fragment_watch_settings_0".equals(tag)) {
                    return new powerwatch.matrix.com.pwgen2android.databinding.FragmentWatchSettingsBindingImpl(component, view);
                }
                throw new java.lang.IllegalArgumentException("The tag for fragment_watch_settings is invalid. Received: " + tag);
            case 64:
                if ("layout/fragment_welcome_screen_0".equals(tag)) {
                    return new powerwatch.matrix.com.pwgen2android.databinding.FragmentWelcomeScreenBindingImpl(component, view);
                }
                throw new java.lang.IllegalArgumentException("The tag for fragment_welcome_screen is invalid. Received: " + tag);
            case 65:
                if ("layout/secret_screen_fragment_0".equals(tag)) {
                    return new powerwatch.matrix.com.pwgen2android.databinding.SecretScreenFragmentBindingImpl(component, view);
                }
                throw new java.lang.IllegalArgumentException("The tag for secret_screen_fragment is invalid. Received: " + tag);
            case 66:
                if ("layout/web_view_container_0".equals(tag)) {
                    return new powerwatch.matrix.com.pwgen2android.databinding.WebViewContainerBindingImpl(component, view);
                }
                throw new java.lang.IllegalArgumentException("The tag for web_view_container is invalid. Received: " + tag);
            default:
                return null;
        }
    }

    @Override // androidx.databinding.DataBinderMapper
    public androidx.databinding.ViewDataBinding getDataBinder(androidx.databinding.DataBindingComponent component, android.view.View view, int layoutId) {
        int i = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
        if (i <= 0) {
            return null;
        }
        java.lang.Object tag = view.getTag();
        if (tag == null) {
            throw new java.lang.RuntimeException("view must have a tag");
        }
        int i2 = (i - 1) / 50;
        if (i2 == 0) {
            return internalGetViewDataBinding0(component, view, i, tag);
        }
        if (i2 != 1) {
            return null;
        }
        return internalGetViewDataBinding1(component, view, i, tag);
    }

    @Override // androidx.databinding.DataBinderMapper
    public androidx.databinding.ViewDataBinding getDataBinder(androidx.databinding.DataBindingComponent component, android.view.View[] views, int layoutId) {
        if (views == null || views.length == 0 || INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId) <= 0 || views[0].getTag() != null) {
            return null;
        }
        throw new java.lang.RuntimeException("view must have a tag");
    }

    @Override // androidx.databinding.DataBinderMapper
    public int getLayoutId(java.lang.String tag) {
        java.lang.Integer num;
        if (tag == null || (num = powerwatch.matrix.com.pwgen2android.DataBinderMapperImpl.InnerLayoutIdLookup.sKeys.get(tag)) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // androidx.databinding.DataBinderMapper
    public java.lang.String convertBrIdToString(int localId) {
        return powerwatch.matrix.com.pwgen2android.DataBinderMapperImpl.InnerBrLookup.sKeys.get(localId);
    }

    @Override // androidx.databinding.DataBinderMapper
    public java.util.List<androidx.databinding.DataBinderMapper> collectDependencies() {
        java.util.ArrayList arrayList = new java.util.ArrayList(1);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        return arrayList;
    }

    private static class InnerBrLookup {
        static final android.util.SparseArray<java.lang.String> sKeys;

        private InnerBrLookup() {
        }

        static {
            android.util.SparseArray<java.lang.String> sparseArray = new android.util.SparseArray<>(2);
            sKeys = sparseArray;
            sparseArray.put(0, "_all");
            sparseArray.put(1, "viewModel");
        }
    }

    private static class InnerLayoutIdLookup {
        static final java.util.HashMap<java.lang.String, java.lang.Integer> sKeys;

        private InnerLayoutIdLookup() {
        }

        static {
            java.util.HashMap<java.lang.String, java.lang.Integer> map = new java.util.HashMap<>(66);
            sKeys = map;
            map.put("layout/activity_main_0", java.lang.Integer.valueOf(powerwatch.matrix.com.pwgen2android.R.layout.activity_main));
            map.put("layout/activity_pairing_0", java.lang.Integer.valueOf(powerwatch.matrix.com.pwgen2android.R.layout.activity_pairing));
            map.put("layout/activity_setup_0", java.lang.Integer.valueOf(powerwatch.matrix.com.pwgen2android.R.layout.activity_setup));
            map.put("layout/activity_splash_screen_0", java.lang.Integer.valueOf(powerwatch.matrix.com.pwgen2android.R.layout.activity_splash_screen));
            map.put("layout/dialog_bad_placement_0", java.lang.Integer.valueOf(powerwatch.matrix.com.pwgen2android.R.layout.dialog_bad_placement));
            map.put("layout/fragement_biometrics_0", java.lang.Integer.valueOf(powerwatch.matrix.com.pwgen2android.R.layout.fragement_biometrics));
            map.put("layout/fragment_activity_period_item_0", java.lang.Integer.valueOf(powerwatch.matrix.com.pwgen2android.R.layout.fragment_activity_period_item));
            map.put("layout/fragment_activity_periods_0", java.lang.Integer.valueOf(powerwatch.matrix.com.pwgen2android.R.layout.fragment_activity_periods));
            map.put("layout/fragment_baidu_maps_0", java.lang.Integer.valueOf(powerwatch.matrix.com.pwgen2android.R.layout.fragment_baidu_maps));
            map.put("layout/fragment_calendar_0", java.lang.Integer.valueOf(powerwatch.matrix.com.pwgen2android.R.layout.fragment_calendar));
            map.put("layout/fragment_change_password_0", java.lang.Integer.valueOf(powerwatch.matrix.com.pwgen2android.R.layout.fragment_change_password));
            map.put("layout/fragment_choose_hour_format_0", java.lang.Integer.valueOf(powerwatch.matrix.com.pwgen2android.R.layout.fragment_choose_hour_format));
            map.put("layout/fragment_choose_language_0", java.lang.Integer.valueOf(powerwatch.matrix.com.pwgen2android.R.layout.fragment_choose_language));
            map.put("layout/fragment_choose_product_0", java.lang.Integer.valueOf(powerwatch.matrix.com.pwgen2android.R.layout.fragment_choose_product));
            map.put("layout/fragment_choose_units_0", java.lang.Integer.valueOf(powerwatch.matrix.com.pwgen2android.R.layout.fragment_choose_units));
            map.put("layout/fragment_control_view_0", java.lang.Integer.valueOf(powerwatch.matrix.com.pwgen2android.R.layout.fragment_control_view));
            map.put("layout/fragment_create_account_0", java.lang.Integer.valueOf(powerwatch.matrix.com.pwgen2android.R.layout.fragment_create_account));
            map.put("layout/fragment_daily_goals_settings_0", java.lang.Integer.valueOf(powerwatch.matrix.com.pwgen2android.R.layout.fragment_daily_goals_settings));
            map.put("layout/fragment_dashboard_container_0", java.lang.Integer.valueOf(powerwatch.matrix.com.pwgen2android.R.layout.fragment_dashboard_container));
            map.put("layout/fragment_device_banner_0", java.lang.Integer.valueOf(powerwatch.matrix.com.pwgen2android.R.layout.fragment_device_banner));
            map.put("layout/fragment_edit_biometrics_0", java.lang.Integer.valueOf(powerwatch.matrix.com.pwgen2android.R.layout.fragment_edit_biometrics));
            map.put("layout/fragment_edit_user_activity_0", java.lang.Integer.valueOf(powerwatch.matrix.com.pwgen2android.R.layout.fragment_edit_user_activity));
            map.put("layout/fragment_enter_pin_code_0", java.lang.Integer.valueOf(powerwatch.matrix.com.pwgen2android.R.layout.fragment_enter_pin_code));
            map.put("layout/fragment_firmware_available_0", java.lang.Integer.valueOf(powerwatch.matrix.com.pwgen2android.R.layout.fragment_firmware_available));
            map.put("layout/fragment_forgot_password_0", java.lang.Integer.valueOf(powerwatch.matrix.com.pwgen2android.R.layout.fragment_forgot_password));
            map.put("layout/fragment_gen1_pairing_0", java.lang.Integer.valueOf(powerwatch.matrix.com.pwgen2android.R.layout.fragment_gen1_pairing));
            map.put("layout/fragment_gen2_pairing_progress_0", java.lang.Integer.valueOf(powerwatch.matrix.com.pwgen2android.R.layout.fragment_gen2_pairing_progress));
            map.put("layout/fragment_get_started_screen_0", java.lang.Integer.valueOf(powerwatch.matrix.com.pwgen2android.R.layout.fragment_get_started_screen));
            map.put("layout/fragment_getting_started_0", java.lang.Integer.valueOf(powerwatch.matrix.com.pwgen2android.R.layout.fragment_getting_started));
            map.put("layout/fragment_heart_rate_chart_0", java.lang.Integer.valueOf(powerwatch.matrix.com.pwgen2android.R.layout.fragment_heart_rate_chart));
            map.put("layout/fragment_internal_logger_0", java.lang.Integer.valueOf(powerwatch.matrix.com.pwgen2android.R.layout.fragment_internal_logger));
            map.put("layout/fragment_licence_page_0", java.lang.Integer.valueOf(powerwatch.matrix.com.pwgen2android.R.layout.fragment_licence_page));
            map.put("layout/fragment_main_dashboard_0", java.lang.Integer.valueOf(powerwatch.matrix.com.pwgen2android.R.layout.fragment_main_dashboard));
            map.put("layout/fragment_main_user_activity_0", java.lang.Integer.valueOf(powerwatch.matrix.com.pwgen2android.R.layout.fragment_main_user_activity));
            map.put("layout/fragment_maps_0", java.lang.Integer.valueOf(powerwatch.matrix.com.pwgen2android.R.layout.fragment_maps));
            map.put("layout/fragment_my_powerwatch_0", java.lang.Integer.valueOf(powerwatch.matrix.com.pwgen2android.R.layout.fragment_my_powerwatch));
            map.put("layout/fragment_notification_logger_0", java.lang.Integer.valueOf(powerwatch.matrix.com.pwgen2android.R.layout.fragment_notification_logger));
            map.put("layout/fragment_notification_settings_0", java.lang.Integer.valueOf(powerwatch.matrix.com.pwgen2android.R.layout.fragment_notification_settings));
            map.put("layout/fragment_notifications_0", java.lang.Integer.valueOf(powerwatch.matrix.com.pwgen2android.R.layout.fragment_notifications));
            map.put("layout/fragment_ota_track_0", java.lang.Integer.valueOf(powerwatch.matrix.com.pwgen2android.R.layout.fragment_ota_track));
            map.put("layout/fragment_pair_failed_0", java.lang.Integer.valueOf(powerwatch.matrix.com.pwgen2android.R.layout.fragment_pair_failed));
            map.put("layout/fragment_pair_success_0", java.lang.Integer.valueOf(powerwatch.matrix.com.pwgen2android.R.layout.fragment_pair_success));
            map.put("layout/fragment_pairing_progress_0", java.lang.Integer.valueOf(powerwatch.matrix.com.pwgen2android.R.layout.fragment_pairing_progress));
            map.put("layout/fragment_permission_info_0", java.lang.Integer.valueOf(powerwatch.matrix.com.pwgen2android.R.layout.fragment_permission_info));
            map.put("layout/fragment_personal_settings_0", java.lang.Integer.valueOf(powerwatch.matrix.com.pwgen2android.R.layout.fragment_personal_settings));
            map.put("layout/fragment_qr_code_tutorial_0", java.lang.Integer.valueOf(powerwatch.matrix.com.pwgen2android.R.layout.fragment_qr_code_tutorial));
            map.put("layout/fragment_realtime_0", java.lang.Integer.valueOf(powerwatch.matrix.com.pwgen2android.R.layout.fragment_realtime));
            map.put("layout/fragment_scan_0", java.lang.Integer.valueOf(powerwatch.matrix.com.pwgen2android.R.layout.fragment_scan));
            map.put("layout/fragment_select_items_0", java.lang.Integer.valueOf(powerwatch.matrix.com.pwgen2android.R.layout.fragment_select_items));
            map.put("layout/fragment_set_goals_0", java.lang.Integer.valueOf(powerwatch.matrix.com.pwgen2android.R.layout.fragment_set_goals));
            map.put("layout/fragment_share_activity_0", java.lang.Integer.valueOf(powerwatch.matrix.com.pwgen2android.R.layout.fragment_share_activity));
            map.put("layout/fragment_sign_in_0", java.lang.Integer.valueOf(powerwatch.matrix.com.pwgen2android.R.layout.fragment_sign_in));
            map.put("layout/fragment_single_biometrics_0", java.lang.Integer.valueOf(powerwatch.matrix.com.pwgen2android.R.layout.fragment_single_biometrics));
            map.put("layout/fragment_single_goal_edit_0", java.lang.Integer.valueOf(powerwatch.matrix.com.pwgen2android.R.layout.fragment_single_goal_edit));
            map.put("layout/fragment_sync_0", java.lang.Integer.valueOf(powerwatch.matrix.com.pwgen2android.R.layout.fragment_sync));
            map.put("layout/fragment_third_party_permission_0", java.lang.Integer.valueOf(powerwatch.matrix.com.pwgen2android.R.layout.fragment_third_party_permission));
            map.put("layout/fragment_timer_settings_0", java.lang.Integer.valueOf(powerwatch.matrix.com.pwgen2android.R.layout.fragment_timer_settings));
            map.put("layout/fragment_unpair_watch_0", java.lang.Integer.valueOf(powerwatch.matrix.com.pwgen2android.R.layout.fragment_unpair_watch));
            map.put("layout/fragment_user_activity_0", java.lang.Integer.valueOf(powerwatch.matrix.com.pwgen2android.R.layout.fragment_user_activity));
            map.put("layout/fragment_verify_account_0", java.lang.Integer.valueOf(powerwatch.matrix.com.pwgen2android.R.layout.fragment_verify_account));
            map.put("layout/fragment_watch_alarm_0", java.lang.Integer.valueOf(powerwatch.matrix.com.pwgen2android.R.layout.fragment_watch_alarm));
            map.put("layout/fragment_watch_container_0", java.lang.Integer.valueOf(powerwatch.matrix.com.pwgen2android.R.layout.fragment_watch_container));
            map.put("layout/fragment_watch_settings_0", java.lang.Integer.valueOf(powerwatch.matrix.com.pwgen2android.R.layout.fragment_watch_settings));
            map.put("layout/fragment_welcome_screen_0", java.lang.Integer.valueOf(powerwatch.matrix.com.pwgen2android.R.layout.fragment_welcome_screen));
            map.put("layout/secret_screen_fragment_0", java.lang.Integer.valueOf(powerwatch.matrix.com.pwgen2android.R.layout.secret_screen_fragment));
            map.put("layout/web_view_container_0", java.lang.Integer.valueOf(powerwatch.matrix.com.pwgen2android.R.layout.web_view_container));
        }
    }
}
