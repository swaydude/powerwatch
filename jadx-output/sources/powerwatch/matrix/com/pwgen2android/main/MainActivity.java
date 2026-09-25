package powerwatch.matrix.com.pwgen2android.main;

/* JADX INFO: compiled from: MainActivity.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u00017B\u0005¢\u0006\u0002\u0010\u0005J\b\u0010\u0018\u001a\u00020\u0015H\u0014J\b\u0010\u0019\u001a\u00020\u0015H\u0014J\b\u0010\u001a\u001a\u00020\u0003H\u0014J\u000e\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0015J\u0010\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u0016\u001a\u00020\u001fH\u0002J\"\u0010 \u001a\u00020\u001c2\u0006\u0010!\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u00152\b\u0010#\u001a\u0004\u0018\u00010$H\u0014J\b\u0010%\u001a\u00020\u001cH\u0016J\u0012\u0010&\u001a\u00020\u001c2\b\u0010'\u001a\u0004\u0018\u00010(H\u0014J\u0012\u0010)\u001a\u00020\u001c2\b\u0010*\u001a\u0004\u0018\u00010$H\u0014J\b\u0010+\u001a\u00020\u001cH\u0015J\u0010\u0010,\u001a\u00020\u001c2\u0006\u0010\u0016\u001a\u00020\u001fH\u0002J\b\u0010-\u001a\u00020\u001cH\u0002J\u0010\u0010.\u001a\u00020\u001c2\u0006\u0010/\u001a\u000200H\u0002J\u0018\u0010.\u001a\u00020\u001c2\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u000202H\u0002J\u000e\u00104\u001a\u00020\u001c2\u0006\u00105\u001a\u000206R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.¢\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\u00038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082.¢\u0006\u0002\n\u0000¨\u00068"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/MainActivity;", "Lpowerwatch/matrix/com/pwgen2android/shared/BaseActivity;", "Lpowerwatch/matrix/com/pwgen2android/databinding/ActivityMainBinding;", "Lpowerwatch/matrix/com/pwgen2android/main/MainActivityViewModel;", "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;", "()V", "appUpdateController", "Lpowerwatch/matrix/com/pwgen2android/main/appupdate/AppUpdateController;", "mainActivityViewModel", "getMainActivityViewModel", "()Lpowerwatch/matrix/com/pwgen2android/main/MainActivityViewModel;", "mainActivityViewModel$delegate", "Lkotlin/Lazy;", "pagerAdapter", "Lpowerwatch/matrix/com/pwgen2android/main/MainActivity$PagerAdapter;", "getPagerAdapter", "()Lpowerwatch/matrix/com/pwgen2android/main/MainActivity$PagerAdapter;", "pagerAdapter$delegate", "tabLayout", "Lcom/google/android/material/tabs/TabLayout;", "updateCode", "", "viewPager", "Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/LockableViewPager;", "getBindingVariable", "getLayoutId", "getViewModel", "goToTab", "", "i", "initTabControl", "Landroidx/viewpager/widget/ViewPager;", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onNewIntent", "intent", "onResume", "setUpPager", "setUpTabTitles", "showDialog", "updateInfo", "Lcom/google/android/play/core/appupdate/AppUpdateInfo;", io.fabric.sdk.android.services.settings.SettingsJsonConstants.PROMPT_TITLE_KEY, "", "body", "showTab", "show", "", "PagerAdapter", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class MainActivity extends powerwatch.matrix.com.pwgen2android.shared.BaseActivity<powerwatch.matrix.com.pwgen2android.databinding.ActivityMainBinding, powerwatch.matrix.com.pwgen2android.main.MainActivityViewModel> implements powerwatch.matrix.com.pwgen2android.shared.logger.Loggable {
    private powerwatch.matrix.com.pwgen2android.main.appupdate.AppUpdateController appUpdateController;

    /* JADX INFO: renamed from: mainActivityViewModel$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy mainActivityViewModel;
    private com.google.android.material.tabs.TabLayout tabLayout;
    private powerwatch.matrix.com.pwgen2android.shared.ui.views.LockableViewPager viewPager;
    private final int updateCode = 1111;

    /* JADX INFO: renamed from: pagerAdapter$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy pagerAdapter = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.NONE, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<powerwatch.matrix.com.pwgen2android.main.MainActivity.PagerAdapter>() { // from class: powerwatch.matrix.com.pwgen2android.main.MainActivity$pagerAdapter$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final powerwatch.matrix.com.pwgen2android.main.MainActivity.PagerAdapter invoke() {
            androidx.fragment.app.FragmentManager supportFragmentManager = this.this$0.getSupportFragmentManager();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "supportFragmentManager");
            return new powerwatch.matrix.com.pwgen2android.main.MainActivity.PagerAdapter(supportFragmentManager, this.this$0);
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: showDialog$lambda-2$lambda-0, reason: not valid java name */
    public static final void m1578showDialog$lambda2$lambda0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: showDialog$lambda-2$lambda-1, reason: not valid java name */
    public static final void m1579showDialog$lambda2$lambda1(java.lang.Throwable th) {
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseActivity
    public void _$_clearFindViewByIdCache() {
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseActivity
    protected int getBindingVariable() {
        return 1;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseActivity
    protected int getLayoutId() {
        return powerwatch.matrix.com.pwgen2android.R.layout.activity_main;
    }

    public MainActivity() {
        final powerwatch.matrix.com.pwgen2android.main.MainActivity mainActivity = this;
        final kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function0 = new kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters>() { // from class: powerwatch.matrix.com.pwgen2android.main.MainActivity$mainActivityViewModel$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final org.koin.core.parameter.DefinitionParameters invoke() {
                powerwatch.matrix.com.pwgen2android.main.MainActivity mainActivity2 = this.this$0;
                return org.koin.core.parameter.DefinitionParametersKt.parametersOf(mainActivity2, mainActivity2.getSupportFragmentManager());
            }
        };
        final org.koin.core.qualifier.Qualifier qualifier = (org.koin.core.qualifier.Qualifier) null;
        this.mainActivityViewModel = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<powerwatch.matrix.com.pwgen2android.main.MainActivityViewModel>() { // from class: powerwatch.matrix.com.pwgen2android.main.MainActivity$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, powerwatch.matrix.com.pwgen2android.main.MainActivityViewModel] */
            @Override // kotlin.jvm.functions.Function0
            public final powerwatch.matrix.com.pwgen2android.main.MainActivityViewModel invoke() {
                return org.koin.androidx.viewmodel.ext.android.LifecycleOwnerExtKt.getViewModel(mainActivity, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.main.MainActivityViewModel.class), qualifier, function0);
            }
        });
    }

    @Override // org.koin.core.KoinComponent
    public org.koin.core.Koin getKoin() {
        return powerwatch.matrix.com.pwgen2android.shared.logger.Loggable.DefaultImpls.getKoin(this);
    }

    private final powerwatch.matrix.com.pwgen2android.main.MainActivity.PagerAdapter getPagerAdapter() {
        return (powerwatch.matrix.com.pwgen2android.main.MainActivity.PagerAdapter) this.pagerAdapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final powerwatch.matrix.com.pwgen2android.main.MainActivityViewModel getMainActivityViewModel() {
        return (powerwatch.matrix.com.pwgen2android.main.MainActivityViewModel) this.mainActivityViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseActivity
    public powerwatch.matrix.com.pwgen2android.main.MainActivityViewModel getViewModel() {
        return getMainActivityViewModel();
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(android.os.Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        java.lang.String string = getString(powerwatch.matrix.com.pwgen2android.R.string.steps);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.steps)");
        powerwatch.matrix.com.pwgen2android.shared.localNotifications.NotificationManagerKt.setSteps(string);
        setContentView(powerwatch.matrix.com.pwgen2android.R.layout.activity_main);
        this.appUpdateController = new powerwatch.matrix.com.pwgen2android.main.appupdate.AppUpdateController();
        getMainActivityViewModel().getFirebaseField().addOnPropertyChangedCallback(new androidx.databinding.Observable.OnPropertyChangedCallback() { // from class: powerwatch.matrix.com.pwgen2android.main.MainActivity.onCreate.1
            @Override // androidx.databinding.Observable.OnPropertyChangedCallback
            public void onPropertyChanged(androidx.databinding.Observable sender, int propertyId) {
                kotlin.Pair<java.lang.String, java.lang.String> pair = powerwatch.matrix.com.pwgen2android.main.MainActivity.this.getMainActivityViewModel().getFirebaseField().get();
                java.lang.String first = pair == null ? null : pair.getFirst();
                kotlin.Pair<java.lang.String, java.lang.String> pair2 = powerwatch.matrix.com.pwgen2android.main.MainActivity.this.getMainActivityViewModel().getFirebaseField().get();
                java.lang.String second = pair2 != null ? pair2.getSecond() : null;
                java.lang.String str = first;
                if (str == null || str.length() == 0) {
                    return;
                }
                java.lang.String str2 = second;
                if (str2 == null || str2.length() == 0) {
                    return;
                }
                powerwatch.matrix.com.pwgen2android.main.MainActivity.this.showDialog(first, second);
            }
        });
        getMainActivityViewModel().onCreateView(this);
        android.view.View viewFindViewById = findViewById(powerwatch.matrix.com.pwgen2android.R.id.viewPager);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(R.id.viewPager)");
        this.viewPager = (powerwatch.matrix.com.pwgen2android.shared.ui.views.LockableViewPager) viewFindViewById;
        android.view.View viewFindViewById2 = findViewById(powerwatch.matrix.com.pwgen2android.R.id.tabs);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(R.id.tabs)");
        this.tabLayout = (com.google.android.material.tabs.TabLayout) viewFindViewById2;
        powerwatch.matrix.com.pwgen2android.shared.ui.views.LockableViewPager lockableViewPager = this.viewPager;
        if (lockableViewPager != null) {
            initTabControl(lockableViewPager);
        } else {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("viewPager");
            throw null;
        }
    }

    private final void showDialog(final com.google.android.play.core.appupdate.AppUpdateInfo updateInfo) {
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(this);
        builder.setMessage("New update is available. Please, update to latest version to continue using the app.").setTitle("App Update").setPositiveButton("OK", new android.content.DialogInterface.OnClickListener() { // from class: powerwatch.matrix.com.pwgen2android.main.-$$Lambda$MainActivity$mwl4hPxVbhBbznwtlefWKmsD8B4
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(android.content.DialogInterface dialogInterface, int i) {
                powerwatch.matrix.com.pwgen2android.main.MainActivity.m1577showDialog$lambda2(this.f$0, updateInfo, dialogInterface, i);
            }
        }).setNegativeButton("Cancel", new android.content.DialogInterface.OnClickListener() { // from class: powerwatch.matrix.com.pwgen2android.main.-$$Lambda$MainActivity$pHw45vXzQdCLgF9fKhZlxgHKSWE
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(android.content.DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });
        builder.create().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: showDialog$lambda-2, reason: not valid java name */
    public static final void m1577showDialog$lambda2(powerwatch.matrix.com.pwgen2android.main.MainActivity this$0, com.google.android.play.core.appupdate.AppUpdateInfo updateInfo, android.content.DialogInterface dialogInterface, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updateInfo, "$updateInfo");
        powerwatch.matrix.com.pwgen2android.main.appupdate.AppUpdateController appUpdateController = this$0.appUpdateController;
        if (appUpdateController == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("appUpdateController");
            throw null;
        }
        appUpdateController.startUpdate(this$0, updateInfo, this$0.updateCode).subscribe(new io.reactivex.functions.Action() { // from class: powerwatch.matrix.com.pwgen2android.main.-$$Lambda$MainActivity$6PsRwSrww_xZORn_Z7oMbj5lbNE
            @Override // io.reactivex.functions.Action
            public final void run() {
                powerwatch.matrix.com.pwgen2android.main.MainActivity.m1578showDialog$lambda2$lambda0();
            }
        }, new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.main.-$$Lambda$MainActivity$wci5VZOIZaY2B5Y8umo9ArYXFKo
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.main.MainActivity.m1579showDialog$lambda2$lambda1((java.lang.Throwable) obj);
            }
        });
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showDialog(java.lang.String title, java.lang.String body) {
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(this);
        builder.setMessage(body).setTitle(title).setPositiveButton("OK", new android.content.DialogInterface.OnClickListener() { // from class: powerwatch.matrix.com.pwgen2android.main.-$$Lambda$MainActivity$meLm0nXHlLDdEpHVoHAcyH0cVTA
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(android.content.DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        }).setNegativeButton("Cancel", new android.content.DialogInterface.OnClickListener() { // from class: powerwatch.matrix.com.pwgen2android.main.-$$Lambda$MainActivity$vsLoHtjLZ04Yw_iL-8SNww4kdgk
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(android.content.DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });
        builder.create().show();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        getMainActivityViewModel().onResume();
        powerwatch.matrix.com.pwgen2android.main.appupdate.AppUpdateController appUpdateController = this.appUpdateController;
        if (appUpdateController == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("appUpdateController");
            throw null;
        }
        appUpdateController.onResume(this, this.updateCode).subscribe(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.main.-$$Lambda$MainActivity$bTsgFIDOgZ_l8xCAeCjWFQX9IcI
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.main.MainActivity.m1575onResume$lambda6(this.f$0, (powerwatch.matrix.com.pwgen2android.main.appupdate.UpdateState) obj);
            }
        }, new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.main.-$$Lambda$MainActivity$Ggl0bsRQ6haxzAWNMt0_I8DN7XQ
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                ((java.lang.Throwable) obj).printStackTrace();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onResume$lambda-6, reason: not valid java name */
    public static final void m1575onResume$lambda6(powerwatch.matrix.com.pwgen2android.main.MainActivity this$0, powerwatch.matrix.com.pwgen2android.main.appupdate.UpdateState updateState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this$0, kotlin.jvm.internal.Intrinsics.stringPlus("AppUpdateInfo: update available type - ", updateState.getStatus()), null, 2, null);
        if (updateState instanceof powerwatch.matrix.com.pwgen2android.main.appupdate.UpdateState.Available) {
            com.google.android.play.core.appupdate.AppUpdateInfo updateInfo = updateState.getUpdateInfo();
            kotlin.jvm.internal.Intrinsics.checkNotNull(updateInfo);
            this$0.showDialog(updateInfo);
        }
    }

    private final void initTabControl(androidx.viewpager.widget.ViewPager viewPager) {
        com.google.android.material.tabs.TabLayout tabLayout = this.tabLayout;
        if (tabLayout == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("tabLayout");
            throw null;
        }
        tabLayout.setupWithViewPager(viewPager);
        setUpPager(viewPager);
        setUpTabTitles();
        com.google.android.material.tabs.TabLayout tabLayout2 = this.tabLayout;
        if (tabLayout2 != null) {
            tabLayout2.addOnTabSelectedListener(new com.google.android.material.tabs.TabLayout.OnTabSelectedListener() { // from class: powerwatch.matrix.com.pwgen2android.main.MainActivity.initTabControl.1
                @Override // com.google.android.material.tabs.TabLayout.OnTabSelectedListener
                public void onTabSelected(com.google.android.material.tabs.TabLayout.Tab tab) {
                }

                @Override // com.google.android.material.tabs.TabLayout.OnTabSelectedListener
                public void onTabUnselected(com.google.android.material.tabs.TabLayout.Tab tab) {
                }

                @Override // com.google.android.material.tabs.TabLayout.OnTabSelectedListener
                public void onTabReselected(com.google.android.material.tabs.TabLayout.Tab tab) {
                    powerwatch.matrix.com.pwgen2android.main.MainActivity.this.getViewModel().onTabReselected();
                }
            });
        } else {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("tabLayout");
            throw null;
        }
    }

    private final void setUpPager(androidx.viewpager.widget.ViewPager viewPager) {
        viewPager.setAdapter(getPagerAdapter());
        viewPager.setOffscreenPageLimit(2);
    }

    private final void setUpTabTitles() {
        com.google.android.material.tabs.TabLayout tabLayout = this.tabLayout;
        if (tabLayout == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("tabLayout");
            throw null;
        }
        int tabCount = tabLayout.getTabCount();
        if (tabCount > 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                com.google.android.material.tabs.TabLayout tabLayout2 = this.tabLayout;
                if (tabLayout2 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("tabLayout");
                    throw null;
                }
                com.google.android.material.tabs.TabLayout.Tab tabAt = tabLayout2.getTabAt(i);
                if (tabAt != null) {
                    tabAt.setText(getPagerAdapter().getScreens().get(i).getSecond());
                }
                if (tabAt != null) {
                    tabAt.setIcon(getPagerAdapter().getScreens().get(i).getThird().intValue());
                }
                if (i2 >= tabCount) {
                    break;
                } else {
                    i = i2;
                }
            }
        }
        com.google.android.material.tabs.TabLayout tabLayout3 = this.tabLayout;
        if (tabLayout3 != null) {
            powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextViewKt.setCustomFont(tabLayout3, "proTextRegular");
        } else {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("tabLayout");
            throw null;
        }
    }

    public final void goToTab(int i) {
        com.google.android.material.tabs.TabLayout tabLayout = this.tabLayout;
        if (tabLayout == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("tabLayout");
            throw null;
        }
        com.google.android.material.tabs.TabLayout.Tab tabAt = tabLayout.getTabAt(i);
        if (tabAt == null) {
            return;
        }
        tabAt.select();
    }

    public final void showTab(boolean show) {
        com.google.android.material.tabs.TabLayout tabLayout = this.tabLayout;
        if (tabLayout != null) {
            int i = 0;
            if (show) {
                powerwatch.matrix.com.pwgen2android.shared.ui.views.LockableViewPager lockableViewPager = this.viewPager;
                if (lockableViewPager == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("viewPager");
                    throw null;
                }
                lockableViewPager.setSwipeLocked(false);
            } else {
                powerwatch.matrix.com.pwgen2android.shared.ui.views.LockableViewPager lockableViewPager2 = this.viewPager;
                if (lockableViewPager2 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("viewPager");
                    throw null;
                }
                lockableViewPager2.setSwipeLocked(true);
                i = 8;
            }
            tabLayout.setVisibility(i);
            return;
        }
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("tabLayout");
        throw null;
    }

    /* JADX INFO: compiled from: MainActivity.kt */
    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0010\u001a\u00020\nH\u0016J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\nH\u0016R2\u0010\u0007\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\n0\t0\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0015"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/MainActivity$PagerAdapter;", "Landroidx/fragment/app/FragmentStatePagerAdapter;", "fm", "Landroidx/fragment/app/FragmentManager;", "context", "Landroid/content/Context;", "(Landroidx/fragment/app/FragmentManager;Landroid/content/Context;)V", "screens", "", "Lkotlin/Triple;", "", "", "getScreens", "()Ljava/util/List;", "setScreens", "(Ljava/util/List;)V", "getCount", "getItem", "Landroidx/fragment/app/Fragment;", "position", "Companion", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class PagerAdapter extends androidx.fragment.app.FragmentStatePagerAdapter {
        public static final int DASHBOARD_FRAGMENT = 0;
        public static final int PROFILE_FRAGMENT = 1;
        private java.util.List<kotlin.Triple<java.lang.Integer, java.lang.String, java.lang.Integer>> screens;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PagerAdapter(androidx.fragment.app.FragmentManager fm, android.content.Context context) {
            super(fm, 1);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fm, "fm");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
            this.screens = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new kotlin.Triple[]{new kotlin.Triple(0, context.getString(powerwatch.matrix.com.pwgen2android.R.string.dashboard), java.lang.Integer.valueOf(powerwatch.matrix.com.pwgen2android.R.mipmap.dashboard_tab)), new kotlin.Triple(1, context.getString(powerwatch.matrix.com.pwgen2android.R.string.my_powerwatch_title), java.lang.Integer.valueOf(powerwatch.matrix.com.pwgen2android.R.mipmap.watch_tab))});
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
            return this.screens.size();
        }

        public final java.util.List<kotlin.Triple<java.lang.Integer, java.lang.String, java.lang.Integer>> getScreens() {
            return this.screens;
        }

        public final void setScreens(java.util.List<kotlin.Triple<java.lang.Integer, java.lang.String, java.lang.Integer>> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "<set-?>");
            this.screens = list;
        }

        @Override // androidx.fragment.app.FragmentStatePagerAdapter
        public androidx.fragment.app.Fragment getItem(int position) {
            powerwatch.matrix.com.pwgen2android.main.dashboard.DashboardContainerFragment dashboardContainerFragmentNewInstance;
            int iIntValue = this.screens.get(position).getFirst().intValue();
            if (iIntValue == 0) {
                dashboardContainerFragmentNewInstance = powerwatch.matrix.com.pwgen2android.main.dashboard.DashboardContainerFragment.INSTANCE.newInstance();
            } else {
                dashboardContainerFragmentNewInstance = iIntValue != 1 ? null : powerwatch.matrix.com.pwgen2android.main.watch.WatchContainerFragment.INSTANCE.newInstance();
            }
            kotlin.jvm.internal.Intrinsics.checkNotNull(dashboardContainerFragmentNewInstance);
            return dashboardContainerFragmentNewInstance;
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == powerwatch.matrix.com.pwgen2android.main.MainActivityViewModelKt.getREQUEST_ID()) {
            if (resultCode == -1) {
                powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug(this, "App registered", "call_service");
            } else {
                powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug(this, "App not registered", "call_service");
            }
        }
        if (resultCode == -1 && requestCode == 12345) {
            powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this, "Access to fit granted", null, 2, null);
            return;
        }
        if (resultCode == this.updateCode) {
            if (resultCode == -1) {
                android.util.Log.d("AppUpdateInfo", "User accepted app update");
            } else if (resultCode == 0) {
                android.util.Log.d("AppUpdateInfo", "User canceled app update");
            } else {
                if (resultCode != 1) {
                    return;
                }
                android.util.Log.d("AppUpdateInfo", "App update failed");
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0038  */
    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        androidx.fragment.app.Fragment item;
        powerwatch.matrix.com.pwgen2android.shared.ui.views.LockableViewPager lockableViewPager = this.viewPager;
        java.lang.Object obj = null;
        if (lockableViewPager == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("viewPager");
            throw null;
        }
        if (lockableViewPager.getCurrentItem() >= getPagerAdapter().getCount()) {
            item = null;
        } else {
            powerwatch.matrix.com.pwgen2android.shared.ui.views.LockableViewPager lockableViewPager2 = this.viewPager;
            if (lockableViewPager2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("viewPager");
                throw null;
            }
            if (lockableViewPager2.getCurrentItem() >= 0) {
                powerwatch.matrix.com.pwgen2android.main.MainActivity.PagerAdapter pagerAdapter = getPagerAdapter();
                powerwatch.matrix.com.pwgen2android.shared.ui.views.LockableViewPager lockableViewPager3 = this.viewPager;
                if (lockableViewPager3 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("viewPager");
                    throw null;
                }
                item = pagerAdapter.getItem(lockableViewPager3.getCurrentItem());
            } else {
                item = null;
            }
        }
        if (item == null) {
            super.onBackPressed();
            return;
        }
        java.util.List<androidx.fragment.app.Fragment> fragments = getSupportFragmentManager().getFragments();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(fragments, "this.supportFragmentManager.fragments");
        for (java.lang.Object obj2 : fragments) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(((androidx.fragment.app.Fragment) obj2).getClass(), item.getClass())) {
                obj = obj2;
                break;
            }
        }
        androidx.fragment.app.Fragment fragment = (androidx.fragment.app.Fragment) obj;
        if ((fragment instanceof powerwatch.matrix.com.pwgen2android.shared.BaseContainerFragment) && ((powerwatch.matrix.com.pwgen2android.shared.BaseContainerFragment) fragment).onBackPressed()) {
            return;
        }
        super.onBackPressed();
    }
}
