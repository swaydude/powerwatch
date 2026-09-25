package powerwatch.matrix.com.pwgen2android.main.watch;

/* JADX INFO: compiled from: BannerViewModel.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010\u0017\u001a\u00020\u0018J\u0010\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u0004\u001a\u00020\u0005H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0010\u0012\f\u0012\n \u000b*\u0004\u0018\u00010\u00030\u00030\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/watch/BannerViewModel;", "Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "context", "Landroid/content/Context;", "userPrefsUtils", "Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;", "(Landroidx/fragment/app/FragmentManager;Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;)V", "fragmentManagerWeakReference", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "imageField", "Landroidx/databinding/ObservableField;", "", "getImageField", "()Landroidx/databinding/ObservableField;", "languageInfo", "Lpowerwatch/matrix/com/pwgen2android/utils/LanguageInfo;", "getLanguageInfo", "()Lpowerwatch/matrix/com/pwgen2android/utils/LanguageInfo;", "setLanguageInfo", "(Lpowerwatch/matrix/com/pwgen2android/utils/LanguageInfo;)V", "onClick", "", "onCreateView", "onDestroyView", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class BannerViewModel extends powerwatch.matrix.com.pwgen2android.shared.BaseViewModel {
    private final android.content.Context context;
    private final java.lang.ref.WeakReference<androidx.fragment.app.FragmentManager> fragmentManagerWeakReference;
    private final androidx.databinding.ObservableField<java.lang.Integer> imageField;
    private powerwatch.matrix.com.pwgen2android.utils.LanguageInfo languageInfo;
    private final powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtils userPrefsUtils;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreateView$lambda-1, reason: not valid java name */
    public static final void m1918onCreateView$lambda1(java.lang.Throwable th) {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BannerViewModel(androidx.fragment.app.FragmentManager fragmentManager, android.content.Context context, powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtils userPrefsUtils) {
        super(null, null, 3, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userPrefsUtils, "userPrefsUtils");
        this.context = context;
        this.userPrefsUtils = userPrefsUtils;
        this.fragmentManagerWeakReference = new java.lang.ref.WeakReference<>(fragmentManager);
        this.imageField = new androidx.databinding.ObservableField<>(java.lang.Integer.valueOf(powerwatch.matrix.com.pwgen2android.R.drawable.device_banner_v2));
    }

    public final androidx.databinding.ObservableField<java.lang.Integer> getImageField() {
        return this.imageField;
    }

    public final powerwatch.matrix.com.pwgen2android.utils.LanguageInfo getLanguageInfo() {
        return this.languageInfo;
    }

    public final void setLanguageInfo(powerwatch.matrix.com.pwgen2android.utils.LanguageInfo languageInfo) {
        this.languageInfo = languageInfo;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseViewModel
    public void onCreateView(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        super.onCreateView(context);
        getCompositeDisposable().add(this.userPrefsUtils.getLanguage().subscribe(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.main.watch.-$$Lambda$BannerViewModel$aL1lRNdy4MIK64ddkXLTt-T5rmM
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.main.watch.BannerViewModel.m1917onCreateView$lambda0(this.f$0, (powerwatch.matrix.com.pwgen2android.utils.LanguageInfo) obj);
            }
        }, new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.main.watch.-$$Lambda$BannerViewModel$uTKgkH_BOTHpKcyHCiVbSsU2wm4
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.main.watch.BannerViewModel.m1918onCreateView$lambda1((java.lang.Throwable) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:61:0x00be  */
    /* JADX INFO: renamed from: onCreateView$lambda-0, reason: not valid java name */
    public static final void m1917onCreateView$lambda0(powerwatch.matrix.com.pwgen2android.main.watch.BannerViewModel this$0, powerwatch.matrix.com.pwgen2android.utils.LanguageInfo languageInfo) {
        int i;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.setLanguageInfo(languageInfo);
        java.lang.String languageKey = languageInfo.getLanguageKey();
        int iHashCode = languageKey.hashCode();
        if (iHashCode != 3201) {
            if (iHashCode != 3246) {
                if (iHashCode != 3276) {
                    if (iHashCode != 3371) {
                        if (iHashCode != 3383) {
                            if (iHashCode != 3428) {
                                if (iHashCode != 3588) {
                                    if (iHashCode != 3651) {
                                        if (iHashCode != 115861276) {
                                            if (iHashCode == 115861812 && languageKey.equals("zh_TW")) {
                                                i = powerwatch.matrix.com.pwgen2android.R.drawable.watch_image_zh_tw;
                                            } else {
                                                i = powerwatch.matrix.com.pwgen2android.R.drawable.device_banner_v2;
                                            }
                                        } else if (languageKey.equals("zh_CN")) {
                                            i = powerwatch.matrix.com.pwgen2android.R.drawable.watch_image_zh_cn;
                                        } else {
                                            i = powerwatch.matrix.com.pwgen2android.R.drawable.device_banner_v2;
                                        }
                                    } else if (languageKey.equals("ru")) {
                                        i = powerwatch.matrix.com.pwgen2android.R.drawable.watch_image_ru;
                                    } else {
                                        i = powerwatch.matrix.com.pwgen2android.R.drawable.device_banner_v2;
                                    }
                                } else if (languageKey.equals("pt")) {
                                    i = powerwatch.matrix.com.pwgen2android.R.drawable.watch_image_pt;
                                } else {
                                    i = powerwatch.matrix.com.pwgen2android.R.drawable.device_banner_v2;
                                }
                            } else if (languageKey.equals("ko")) {
                                i = powerwatch.matrix.com.pwgen2android.R.drawable.watch_image_ko;
                            } else {
                                i = powerwatch.matrix.com.pwgen2android.R.drawable.device_banner_v2;
                            }
                        } else if (languageKey.equals("ja")) {
                            i = powerwatch.matrix.com.pwgen2android.R.drawable.watch_image_ja;
                        } else {
                            i = powerwatch.matrix.com.pwgen2android.R.drawable.device_banner_v2;
                        }
                    } else if (languageKey.equals("it")) {
                        i = powerwatch.matrix.com.pwgen2android.R.drawable.watch_image_it;
                    } else {
                        i = powerwatch.matrix.com.pwgen2android.R.drawable.device_banner_v2;
                    }
                } else if (languageKey.equals("fr")) {
                    i = powerwatch.matrix.com.pwgen2android.R.drawable.watch_image_fr;
                } else {
                    i = powerwatch.matrix.com.pwgen2android.R.drawable.device_banner_v2;
                }
            } else if (languageKey.equals("es")) {
                i = powerwatch.matrix.com.pwgen2android.R.drawable.watch_image_es;
            } else {
                i = powerwatch.matrix.com.pwgen2android.R.drawable.device_banner_v2;
            }
        } else if (languageKey.equals("de")) {
            i = powerwatch.matrix.com.pwgen2android.R.drawable.watch_image_de;
        } else {
            i = powerwatch.matrix.com.pwgen2android.R.drawable.device_banner_v2;
        }
        this$0.getImageField().set(java.lang.Integer.valueOf(i));
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseViewModel
    public void onDestroyView(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        super.onDestroyView(context);
        getCompositeDisposable().clear();
    }

    public final void onClick() {
        java.lang.String userManual;
        android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW");
        intent.setFlags(1);
        powerwatch.matrix.com.pwgen2android.utils.LanguageInfo languageInfo = this.languageInfo;
        java.lang.String str = powerwatch.matrix.com.pwgen2android.utils.LanguageControllerKt.defaultLanguageUserManual;
        if (languageInfo != null && (userManual = languageInfo.getUserManual()) != null) {
            str = userManual;
        }
        java.io.File fileCreateFromAssets = powerwatch.matrix.com.pwgen2android.shared.extensions.FileExtensionsKt.createFromAssets(this.context, str, "manual.pdf");
        if (fileCreateFromAssets == null) {
            return;
        }
        intent.setDataAndType(androidx.core.content.FileProvider.getUriForFile(this.context, "powerwatch.matrix.com.pwgen2android", fileCreateFromAssets), "application/pdf");
        if (intent.resolveActivity(this.context.getPackageManager()) != null) {
            this.context.startActivity(intent);
        }
    }
}
