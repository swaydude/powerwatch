package powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.share;

/* JADX INFO: compiled from: ShareActivityFragment.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\"\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u00152\b\b\u0002\u0010\u001e\u001a\u00020\u0015H\u0002J(\u0010\u001f\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u00152\u0006\u0010!\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0002J\n\u0010&\u001a\u00020\u000f*\u00020'J\n\u0010(\u001a\u00020\u000f*\u00020'J\n\u0010)\u001a\u00020\u000f*\u00020'R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0010\u0012\f\u0012\n \u000b*\u0004\u0018\u00010\u00050\u00050\nX\u0082\u0004¢\u0006\u0002\n\u0000R*\u0010\f\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/share/ShareViewModel;", "Landroidx/lifecycle/ViewModel;", "userActivitySessionDataProvider", "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/UserActivitySessionDataProvider;", "activityContext", "Landroid/content/Context;", "(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/UserActivitySessionDataProvider;Landroid/content/Context;)V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "contextWeakReference", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "dialogClose", "Lkotlin/Function1;", "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/share/SharedActivity;", "", "getDialogClose", "()Lkotlin/jvm/functions/Function1;", "setDialogClose", "(Lkotlin/jvm/functions/Function1;)V", "sessionId", "", "getSessionId", "()Ljava/lang/String;", "setSessionId", "(Ljava/lang/String;)V", "createFile", "Ljava/io/File;", "context", "logsString", "extension", "shareActivity", "activityData", "sharedActivity", "activityType", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityType;", "startTime", "", "onCancelClicked", "Landroid/view/View;", "onGPXClicked", "onTCXClicked", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class ShareViewModel extends androidx.lifecycle.ViewModel {
    private final io.reactivex.disposables.CompositeDisposable compositeDisposable;
    private final java.lang.ref.WeakReference<android.content.Context> contextWeakReference;
    private kotlin.jvm.functions.Function1<? super powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.share.SharedActivity, kotlin.Unit> dialogClose;
    private java.lang.String sessionId;
    private final powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.UserActivitySessionDataProvider userActivitySessionDataProvider;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onGPXClicked$lambda-3, reason: not valid java name */
    public static final void m1893onGPXClicked$lambda3(java.lang.Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onTCXClicked$lambda-1, reason: not valid java name */
    public static final void m1895onTCXClicked$lambda1(java.lang.Throwable th) {
    }

    public ShareViewModel(powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.UserActivitySessionDataProvider userActivitySessionDataProvider, android.content.Context activityContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userActivitySessionDataProvider, "userActivitySessionDataProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityContext, "activityContext");
        this.userActivitySessionDataProvider = userActivitySessionDataProvider;
        this.compositeDisposable = new io.reactivex.disposables.CompositeDisposable();
        this.contextWeakReference = new java.lang.ref.WeakReference<>(activityContext);
    }

    public final java.lang.String getSessionId() {
        return this.sessionId;
    }

    public final void setSessionId(java.lang.String str) {
        this.sessionId = str;
    }

    public final kotlin.jvm.functions.Function1<powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.share.SharedActivity, kotlin.Unit> getDialogClose() {
        return this.dialogClose;
    }

    public final void setDialogClose(kotlin.jvm.functions.Function1<? super powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.share.SharedActivity, kotlin.Unit> function1) {
        this.dialogClose = function1;
    }

    public final void onTCXClicked(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<this>");
        java.lang.String str = this.sessionId;
        if (str != null) {
            io.reactivex.disposables.CompositeDisposable compositeDisposable = this.compositeDisposable;
            powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.UserActivitySessionDataProvider userActivitySessionDataProvider = this.userActivitySessionDataProvider;
            kotlin.jvm.internal.Intrinsics.checkNotNull(str);
            compositeDisposable.add(userActivitySessionDataProvider.loadSessionById(str).subscribe(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.share.-$$Lambda$ShareViewModel$fK7p4Z6bd9z3iPexDl4xUFDazco
                @Override // io.reactivex.functions.Consumer
                public final void accept(java.lang.Object obj) throws java.lang.Throwable {
                    powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.share.ShareViewModel.m1894onTCXClicked$lambda0(this.f$0, (powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession) obj);
                }
            }, new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.share.-$$Lambda$ShareViewModel$AubuT45aCPsJ_1JXJKmki3NlToY
                @Override // io.reactivex.functions.Consumer
                public final void accept(java.lang.Object obj) {
                    powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.share.ShareViewModel.m1895onTCXClicked$lambda1((java.lang.Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onTCXClicked$lambda-0, reason: not valid java name */
    public static final void m1894onTCXClicked$lambda0(powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.share.ShareViewModel this$0, powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession it) throws java.lang.Throwable {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.shared.cloud.strava.api.TCXWriter tCXWriter = new powerwatch.matrix.com.pwgen2android.shared.cloud.strava.api.TCXWriter();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(it, "it");
        this$0.shareActivity(tCXWriter.write(tCXWriter.mapToTCXActivity(it)), powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.share.SharedActivity.TCX.INSTANCE, it.getActivityType(), it.getStartTime());
        kotlin.jvm.functions.Function1<powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.share.SharedActivity, kotlin.Unit> dialogClose = this$0.getDialogClose();
        if (dialogClose == null) {
            return;
        }
        dialogClose.invoke(powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.share.SharedActivity.TCX.INSTANCE);
    }

    public final void onGPXClicked(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<this>");
        java.lang.String str = this.sessionId;
        if (str != null) {
            io.reactivex.disposables.CompositeDisposable compositeDisposable = this.compositeDisposable;
            powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.UserActivitySessionDataProvider userActivitySessionDataProvider = this.userActivitySessionDataProvider;
            kotlin.jvm.internal.Intrinsics.checkNotNull(str);
            compositeDisposable.add(userActivitySessionDataProvider.loadSessionById(str).subscribe(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.share.-$$Lambda$ShareViewModel$My89bgvZiksDzRQhS46S9XVXavU
                @Override // io.reactivex.functions.Consumer
                public final void accept(java.lang.Object obj) throws java.lang.Throwable {
                    powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.share.ShareViewModel.m1892onGPXClicked$lambda2(this.f$0, (powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession) obj);
                }
            }, new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.share.-$$Lambda$ShareViewModel$ghhRrmarSuyhxeHSA9n_mCzZIdg
                @Override // io.reactivex.functions.Consumer
                public final void accept(java.lang.Object obj) {
                    powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.share.ShareViewModel.m1893onGPXClicked$lambda3((java.lang.Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onGPXClicked$lambda-2, reason: not valid java name */
    public static final void m1892onGPXClicked$lambda2(powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.share.ShareViewModel this$0, powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession it) throws java.lang.Throwable {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.shared.cloud.strava.api.GPXXMLWriter gPXXMLWriter = new powerwatch.matrix.com.pwgen2android.shared.cloud.strava.api.GPXXMLWriter();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(it, "it");
        this$0.shareActivity(gPXXMLWriter.writeGPX(gPXXMLWriter.mapActivityToGPX(it)), powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.share.SharedActivity.GPX.INSTANCE, it.getActivityType(), it.getStartTime());
        kotlin.jvm.functions.Function1<powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.share.SharedActivity, kotlin.Unit> dialogClose = this$0.getDialogClose();
        if (dialogClose == null) {
            return;
        }
        dialogClose.invoke(powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.share.SharedActivity.GPX.INSTANCE);
    }

    public final void onCancelClicked(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<this>");
        kotlin.jvm.functions.Function1<? super powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.share.SharedActivity, kotlin.Unit> function1 = this.dialogClose;
        if (function1 == null) {
            return;
        }
        function1.invoke(null);
    }

    private final void shareActivity(java.lang.String activityData, powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.share.SharedActivity sharedActivity, powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivityType activityType, long startTime) throws java.lang.Throwable {
        java.lang.String str;
        android.content.Context context = this.contextWeakReference.get();
        if (context != null) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(sharedActivity, powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.share.SharedActivity.TCX.INSTANCE)) {
                str = ".tcx";
            } else {
                if (!kotlin.jvm.internal.Intrinsics.areEqual(sharedActivity, powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.share.SharedActivity.GPX.INSTANCE)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                str = ".gpx";
            }
            java.io.File fileCreateFile = createFile(context, activityData, str);
            java.lang.String str2 = activityType.name() + '_' + powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.activityShareDateFormat(startTime);
            android.content.Intent intent = new android.content.Intent("android.intent.action.SEND");
            intent.putExtra("android.intent.extra.SUBJECT", kotlin.jvm.internal.Intrinsics.stringPlus(str2, str));
            intent.setType("*/txt");
            intent.putExtra("android.intent.extra.STREAM", androidx.core.content.FileProvider.getUriForFile(context, context.getApplicationContext().getPackageName(), fileCreateFile));
            android.content.Context context2 = this.contextWeakReference.get();
            kotlin.jvm.internal.Intrinsics.checkNotNull(context2);
            context2.startActivity(android.content.Intent.createChooser(intent, str2));
        }
    }

    static /* synthetic */ java.io.File createFile$default(powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.share.ShareViewModel shareViewModel, android.content.Context context, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            str2 = ".tcx";
        }
        return shareViewModel.createFile(context, str, str2);
    }

    private final java.io.File createFile(android.content.Context context, java.lang.String logsString, java.lang.String extension) throws java.lang.Throwable {
        java.io.File file = java.io.File.createTempFile("activity", extension, context.getCacheDir());
        java.io.BufferedWriter bufferedWriter = null;
        try {
            java.io.BufferedWriter bufferedWriter2 = new java.io.BufferedWriter(new java.io.FileWriter(file));
            try {
                bufferedWriter2.write(logsString);
                bufferedWriter2.close();
                bufferedWriter2.close();
            } catch (java.io.IOException unused) {
                bufferedWriter = bufferedWriter2;
                if (bufferedWriter != null) {
                    bufferedWriter.close();
                }
            } catch (java.lang.Throwable th) {
                th = th;
                bufferedWriter = bufferedWriter2;
                if (bufferedWriter != null) {
                    bufferedWriter.close();
                }
                throw th;
            }
        } catch (java.io.IOException unused2) {
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(file, "file");
        return file;
    }
}
