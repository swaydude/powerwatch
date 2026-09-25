package powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity;

/* JADX INFO: compiled from: EditUserActivityViewModel.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B-\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\u000e\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0016J\u0006\u0010#\u001a\u00020!J\b\u0010$\u001a\u00020!H\u0016J\b\u0010%\u001a\u00020!H\u0002J\b\u0010&\u001a\u00020!H\u0002J\n\u0010'\u001a\u00020!*\u00020(J\n\u0010)\u001a\u00020!*\u00020(R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u000e\u001a\u0010\u0012\f\u0012\n \u0010*\u0004\u0018\u00010\n0\n0\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\u0011\u001a\u0010\u0012\f\u0012\n \u0010*\u0004\u0018\u00010\u00130\u00130\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0014R\u001f\u0010\u0015\u001a\u0010\u0012\f\u0012\n \u0010*\u0004\u0018\u00010\u00160\u00160\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u001f\u0010\u0018\u001a\u0010\u0012\f\u0012\n \u0010*\u0004\u0018\u00010\u00160\u00160\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u001f\u0010\u001a\u001a\u0010\u0012\f\u0012\n \u0010*\u0004\u0018\u00010\u00160\u00160\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R\u001c\u0010\u001c\u001a\u0010\u0012\f\u0012\n \u0010*\u0004\u0018\u00010\f0\f0\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u001f\u0010\u001e\u001a\u0010\u0012\f\u0012\n \u0010*\u0004\u0018\u00010\u00160\u00160\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/EditUserActivityViewModel;", "Lpowerwatch/matrix/com/pwgen2android/main/MainDeepBaseViewModel;", "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;", "userActivitySessionDataProvider", "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/UserActivitySessionDataProvider;", "userActivitySessionRepository", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepository;", "dialogManager", "Lpowerwatch/matrix/com/pwgen2android/shared/ui/dialogManager/DialogManager;", "activity", "Landroid/app/Activity;", "parentFragmentManager", "Landroidx/fragment/app/FragmentManager;", "(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/UserActivitySessionDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepository;Lpowerwatch/matrix/com/pwgen2android/shared/ui/dialogManager/DialogManager;Landroid/app/Activity;Landroidx/fragment/app/FragmentManager;)V", "contextWeakReference", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "isProgressVisible", "Landroidx/databinding/ObservableField;", "", "()Landroidx/databinding/ObservableField;", "locationField", "", "getLocationField", "nameField", "getNameField", "notesField", "getNotesField", "parentFragmentManagerWeakReference", "sessionID", "typeField", "getTypeField", "loadActivitySession", "", "sessionId", "onBackButtonClicked", "onBackClicked", "onDeleteConfirmed", "onSaveChangesClicked", "onActivityTypeClicked", "Landroid/view/View;", "onDeleteClicked", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class EditUserActivityViewModel extends powerwatch.matrix.com.pwgen2android.main.MainDeepBaseViewModel implements powerwatch.matrix.com.pwgen2android.shared.logger.Loggable {
    private final android.app.Activity activity;
    private final java.lang.ref.WeakReference<android.app.Activity> contextWeakReference;
    private final powerwatch.matrix.com.pwgen2android.shared.ui.dialogManager.DialogManager dialogManager;
    private final androidx.databinding.ObservableField<java.lang.Boolean> isProgressVisible;
    private final androidx.databinding.ObservableField<java.lang.String> locationField;
    private final androidx.databinding.ObservableField<java.lang.String> nameField;
    private final androidx.databinding.ObservableField<java.lang.String> notesField;
    private final java.lang.ref.WeakReference<androidx.fragment.app.FragmentManager> parentFragmentManagerWeakReference;
    private java.lang.String sessionID;
    private final androidx.databinding.ObservableField<java.lang.String> typeField;
    private final powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.UserActivitySessionDataProvider userActivitySessionDataProvider;
    private final powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserActivitySessionRepository userActivitySessionRepository;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onDeleteClicked$lambda-8, reason: not valid java name */
    public static final void m1881onDeleteClicked$lambda8(java.lang.Throwable th) {
    }

    @Override // org.koin.core.KoinComponent
    public org.koin.core.Koin getKoin() {
        return powerwatch.matrix.com.pwgen2android.shared.logger.Loggable.DefaultImpls.getKoin(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditUserActivityViewModel(powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.UserActivitySessionDataProvider userActivitySessionDataProvider, powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserActivitySessionRepository userActivitySessionRepository, powerwatch.matrix.com.pwgen2android.shared.ui.dialogManager.DialogManager dialogManager, android.app.Activity activity, androidx.fragment.app.FragmentManager parentFragmentManager) {
        super(null, null, 2, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userActivitySessionDataProvider, "userActivitySessionDataProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userActivitySessionRepository, "userActivitySessionRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dialogManager, "dialogManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parentFragmentManager, "parentFragmentManager");
        this.userActivitySessionDataProvider = userActivitySessionDataProvider;
        this.userActivitySessionRepository = userActivitySessionRepository;
        this.dialogManager = dialogManager;
        this.activity = activity;
        this.parentFragmentManagerWeakReference = new java.lang.ref.WeakReference<>(parentFragmentManager);
        this.contextWeakReference = new java.lang.ref.WeakReference<>(activity);
        this.nameField = new androidx.databinding.ObservableField<>("");
        this.typeField = new androidx.databinding.ObservableField<>("");
        this.locationField = new androidx.databinding.ObservableField<>("");
        this.notesField = new androidx.databinding.ObservableField<>("");
        this.isProgressVisible = new androidx.databinding.ObservableField<>(false);
    }

    public final androidx.databinding.ObservableField<java.lang.String> getNameField() {
        return this.nameField;
    }

    public final androidx.databinding.ObservableField<java.lang.String> getTypeField() {
        return this.typeField;
    }

    public final androidx.databinding.ObservableField<java.lang.String> getLocationField() {
        return this.locationField;
    }

    public final androidx.databinding.ObservableField<java.lang.String> getNotesField() {
        return this.notesField;
    }

    public final androidx.databinding.ObservableField<java.lang.Boolean> isProgressVisible() {
        return this.isProgressVisible;
    }

    public final void loadActivitySession(java.lang.String sessionId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        this.sessionID = sessionId;
        getCompositeDisposable().add(this.userActivitySessionDataProvider.loadSessionById(sessionId).map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.-$$Lambda$EditUserActivityViewModel$1VM_h2HCaQdybRhO6-0PGuACfYc
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.EditUserActivityViewModel.m1877loadActivitySession$lambda0(this.f$0, (powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession) obj);
            }
        }).subscribe(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.-$$Lambda$EditUserActivityViewModel$uQYuCpRRdmcVHoCA0n4Su5TYgkI
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.EditUserActivityViewModel.m1878loadActivitySession$lambda1(this.f$0, (powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.EditActivityView) obj);
            }
        }, new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.-$$Lambda$EditUserActivityViewModel$E4vqwDI9hvq6w1dkjwboBfyaceA
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.EditUserActivityViewModel.m1879loadActivitySession$lambda2(this.f$0, (java.lang.Throwable) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: loadActivitySession$lambda-0, reason: not valid java name */
    public static final powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.EditActivityView m1877loadActivitySession$lambda0(powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.EditUserActivityViewModel this$0, powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return new powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.EditActivityView(it.getName(), powerwatch.matrix.com.pwgen2android.shared.extensions.ActivityPeriodsExtensionsKt.mapActivityTypeToName(it.getActivityType(), this$0.activity), it.getLocationName(), it.getNotes());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: loadActivitySession$lambda-1, reason: not valid java name */
    public static final void m1878loadActivitySession$lambda1(powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.EditUserActivityViewModel this$0, powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.EditActivityView editActivityView) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.info$default(this$0, kotlin.jvm.internal.Intrinsics.stringPlus("Edit Activity data retrieved: ", editActivityView), null, 2, null);
        this$0.getNameField().set(editActivityView.getName());
        this$0.getNotesField().set(editActivityView.getNotes());
        this$0.getLocationField().set(editActivityView.getLocation());
        java.lang.String str = this$0.getTypeField().get();
        if (str == null || str.length() == 0) {
            this$0.getTypeField().set(editActivityView.getType());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: loadActivitySession$lambda-2, reason: not valid java name */
    public static final void m1879loadActivitySession$lambda2(powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.EditUserActivityViewModel this$0, java.lang.Throwable th) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.error$default(this$0, "Error while retrieving user activity from cache.", th, null, 4, null);
    }

    private final void onSaveChangesClicked() {
        if (this.sessionID != null) {
            this.isProgressVisible.set(true);
            io.reactivex.disposables.CompositeDisposable compositeDisposable = getCompositeDisposable();
            powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserActivitySessionRepository userActivitySessionRepository = this.userActivitySessionRepository;
            java.lang.String str = this.sessionID;
            kotlin.jvm.internal.Intrinsics.checkNotNull(str);
            compositeDisposable.add(powerwatch.matrix.com.pwgen2android.shared.data.repositories.GetOneRepository.DefaultImpls.getOne$default(userActivitySessionRepository, str, false, 2, null).map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.-$$Lambda$EditUserActivityViewModel$NmC0g6QNYvBjv5qtwUXBlj8gHB8
                @Override // io.reactivex.functions.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.EditUserActivityViewModel.m1885onSaveChangesClicked$lambda3(this.f$0, (powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession) obj);
                }
            }).flatMapCompletable(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.-$$Lambda$EditUserActivityViewModel$4lm3toCIyx1CjaGubBu-Iox6bcU
                @Override // io.reactivex.functions.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.EditUserActivityViewModel.m1886onSaveChangesClicked$lambda4(this.f$0, (powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession) obj);
                }
            }).subscribe(new io.reactivex.functions.Action() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.-$$Lambda$EditUserActivityViewModel$5XXHt9BflEUQ7TNOOi9FTqX5oHE
                @Override // io.reactivex.functions.Action
                public final void run() {
                    powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.EditUserActivityViewModel.m1887onSaveChangesClicked$lambda5(this.f$0);
                }
            }, new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.-$$Lambda$EditUserActivityViewModel$VbVdP-ipOLR9-jtrbkGYLbfNTrk
                @Override // io.reactivex.functions.Consumer
                public final void accept(java.lang.Object obj) {
                    powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.EditUserActivityViewModel.m1888onSaveChangesClicked$lambda6(this.f$0, (java.lang.Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onSaveChangesClicked$lambda-3, reason: not valid java name */
    public static final powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession m1885onSaveChangesClicked$lambda3(powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.EditUserActivityViewModel this$0, powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        java.lang.String str = this$0.getNameField().get();
        kotlin.jvm.internal.Intrinsics.checkNotNull(str);
        java.lang.String str2 = this$0.getLocationField().get();
        kotlin.jvm.internal.Intrinsics.checkNotNull(str2);
        java.lang.String str3 = this$0.getTypeField().get();
        kotlin.jvm.internal.Intrinsics.checkNotNull(str3);
        android.app.Activity activity = this$0.contextWeakReference.get();
        kotlin.jvm.internal.Intrinsics.checkNotNull(activity);
        powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivityType userActivityTypeMapActivityNameToActivityType = powerwatch.matrix.com.pwgen2android.shared.extensions.ActivityPeriodsExtensionsKt.mapActivityNameToActivityType(str3, activity);
        java.lang.String str4 = this$0.getNotesField().get();
        kotlin.jvm.internal.Intrinsics.checkNotNull(str4);
        return it.copy((114673 & 1) != 0 ? it.id : null, (114673 & 2) != 0 ? it.name : str, (114673 & 4) != 0 ? it.activityType : userActivityTypeMapActivityNameToActivityType, (114673 & 8) != 0 ? it.locationName : str2, (114673 & 16) != 0 ? it.distance : 0.0f, (114673 & 32) != 0 ? it.steps : 0, (114673 & 64) != 0 ? it.startTime : 0L, (114673 & 128) != 0 ? it.endTime : 0L, (114673 & 256) != 0 ? it.pace : 0.0f, (114673 & 512) != 0 ? it.activeCalories : 0, (114673 & 1024) != 0 ? it.bmrCalories : 0, (114673 & 2048) != 0 ? it.splits : null, (114673 & 4096) != 0 ? it.gpsPositions : null, (114673 & 8192) != 0 ? it.heartRates : null, (114673 & 16384) != 0 ? it.notes : str4, (114673 & 32768) != 0 ? it.getShouldSend() : false, (114673 & 65536) != 0 ? it.getEmail() : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onSaveChangesClicked$lambda-4, reason: not valid java name */
    public static final io.reactivex.CompletableSource m1886onSaveChangesClicked$lambda4(powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.EditUserActivityViewModel this$0, powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return this$0.userActivitySessionRepository.update(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onSaveChangesClicked$lambda-5, reason: not valid java name */
    public static final void m1887onSaveChangesClicked$lambda5(powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.EditUserActivityViewModel this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.info$default(this$0, "Activity successfully saved.", null, 2, null);
        androidx.fragment.app.FragmentManager fragmentManager = this$0.parentFragmentManagerWeakReference.get();
        if (fragmentManager == null) {
            return;
        }
        fragmentManager.popBackStack();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onSaveChangesClicked$lambda-6, reason: not valid java name */
    public static final void m1888onSaveChangesClicked$lambda6(powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.EditUserActivityViewModel this$0, java.lang.Throwable th) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.isProgressVisible().set(false);
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.error$default(this$0, "Activity saving failed.", th, null, 4, null);
    }

    public final void onBackButtonClicked() {
        androidx.fragment.app.FragmentManager fragmentManager = this.parentFragmentManagerWeakReference.get();
        if (fragmentManager == null) {
            return;
        }
        fragmentManager.popBackStack();
    }

    @Override // powerwatch.matrix.com.pwgen2android.main.MainDeepBaseViewModel
    public void onBackClicked() {
        super.onBackClicked();
        onSaveChangesClicked();
    }

    public final void onDeleteClicked(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<this>");
        io.reactivex.disposables.CompositeDisposable compositeDisposable = getCompositeDisposable();
        powerwatch.matrix.com.pwgen2android.shared.ui.dialogManager.DialogManager dialogManager = this.dialogManager;
        android.content.Context context = view.getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context, "context");
        compositeDisposable.add(powerwatch.matrix.com.pwgen2android.shared.ui.dialogManager.DialogManager.DefaultImpls.openAlertDialog$default(dialogManager, context, powerwatch.matrix.com.pwgen2android.R.string.information_dialog_title, powerwatch.matrix.com.pwgen2android.R.string.delete_activity_dialog_text, 0, 0, 24, null).subscribe(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.-$$Lambda$EditUserActivityViewModel$nInWuYGopGBSNtVKa6IDBg3RgTk
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.EditUserActivityViewModel.m1880onDeleteClicked$lambda7(this.f$0, (java.lang.Boolean) obj);
            }
        }, new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.-$$Lambda$EditUserActivityViewModel$opeyawYZMtGZFru8gwVhPCaQYgA
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.EditUserActivityViewModel.m1881onDeleteClicked$lambda8((java.lang.Throwable) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onDeleteClicked$lambda-7, reason: not valid java name */
    public static final void m1880onDeleteClicked$lambda7(powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.EditUserActivityViewModel this$0, java.lang.Boolean it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(it, "it");
        if (it.booleanValue()) {
            this$0.onDeleteConfirmed();
        }
    }

    public final void onActivityTypeClicked(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<this>");
        java.lang.String str = this.typeField.get();
        kotlin.jvm.internal.Intrinsics.checkNotNull(str);
        powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivityType[] userActivityTypeArrValuesCustom = powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivityType.valuesCustom();
        java.util.ArrayList arrayList = new java.util.ArrayList(userActivityTypeArrValuesCustom.length);
        for (powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivityType userActivityType : userActivityTypeArrValuesCustom) {
            android.content.Context context = view.getContext();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context, "context");
            java.lang.String strMapActivityTypeToName = powerwatch.matrix.com.pwgen2android.shared.extensions.ActivityPeriodsExtensionsKt.mapActivityTypeToName(userActivityType, context);
            arrayList.add(new powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.chooseActityType.UIChooseItemView(strMapActivityTypeToName, kotlin.jvm.internal.Intrinsics.areEqual(str, strMapActivityTypeToName)));
        }
        java.lang.Object[] array = arrayList.toArray(new powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.chooseActityType.UIChooseItemView[0]);
        java.util.Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.chooseActityType.UIChooseItemView[] uIChooseItemViewArr = (powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.chooseActityType.UIChooseItemView[]) array;
        androidx.fragment.app.FragmentManager fragmentManager = this.parentFragmentManagerWeakReference.get();
        if (fragmentManager == null) {
            return;
        }
        powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationExtensionsKt.addFragment$default(fragmentManager, powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.chooseActityType.ChooseActivityTypeFragment.INSTANCE.newInstance(kotlin.collections.CollectionsKt.arrayListOf(java.util.Arrays.copyOf(uIChooseItemViewArr, uIChooseItemViewArr.length))), powerwatch.matrix.com.pwgen2android.R.id.dashboard_fragment_container, false, null, 12, null);
    }

    private final void onDeleteConfirmed() {
        if (this.sessionID != null) {
            this.isProgressVisible.set(true);
            io.reactivex.disposables.CompositeDisposable compositeDisposable = getCompositeDisposable();
            powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserActivitySessionRepository userActivitySessionRepository = this.userActivitySessionRepository;
            java.lang.String str = this.sessionID;
            kotlin.jvm.internal.Intrinsics.checkNotNull(str);
            compositeDisposable.add(powerwatch.matrix.com.pwgen2android.shared.data.repositories.GetOneRepository.DefaultImpls.getOne$default(userActivitySessionRepository, str, false, 2, null).flatMapCompletable(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.-$$Lambda$EditUserActivityViewModel$Miz2kLbNcZdaoF-ScObviuaiaps
                @Override // io.reactivex.functions.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.EditUserActivityViewModel.m1882onDeleteConfirmed$lambda10(this.f$0, (powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession) obj);
                }
            }).subscribe(new io.reactivex.functions.Action() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.-$$Lambda$EditUserActivityViewModel$JIPoRs9bkHB-aNQiVUYbD1uB650
                @Override // io.reactivex.functions.Action
                public final void run() {
                    powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.EditUserActivityViewModel.m1883onDeleteConfirmed$lambda11(this.f$0);
                }
            }, new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.-$$Lambda$EditUserActivityViewModel$JcEjGwLaXYUpc6B9odaUOn0NqS4
                @Override // io.reactivex.functions.Consumer
                public final void accept(java.lang.Object obj) {
                    powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.EditUserActivityViewModel.m1884onDeleteConfirmed$lambda12(this.f$0, (java.lang.Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onDeleteConfirmed$lambda-10, reason: not valid java name */
    public static final io.reactivex.CompletableSource m1882onDeleteConfirmed$lambda10(powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.EditUserActivityViewModel this$0, powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return this$0.userActivitySessionRepository.delete(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onDeleteConfirmed$lambda-11, reason: not valid java name */
    public static final void m1883onDeleteConfirmed$lambda11(powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.EditUserActivityViewModel this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.info$default(this$0, "Activity successfully saved.", null, 2, null);
        androidx.fragment.app.FragmentManager fragmentManager = this$0.parentFragmentManagerWeakReference.get();
        if (fragmentManager != null) {
            fragmentManager.popBackStack();
        }
        androidx.fragment.app.FragmentManager fragmentManager2 = this$0.parentFragmentManagerWeakReference.get();
        if (fragmentManager2 == null) {
            return;
        }
        fragmentManager2.popBackStack();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onDeleteConfirmed$lambda-12, reason: not valid java name */
    public static final void m1884onDeleteConfirmed$lambda12(powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.EditUserActivityViewModel this$0, java.lang.Throwable th) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.isProgressVisible().set(false);
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.error$default(this$0, "Activity deleting failed.", th, null, 4, null);
    }
}
