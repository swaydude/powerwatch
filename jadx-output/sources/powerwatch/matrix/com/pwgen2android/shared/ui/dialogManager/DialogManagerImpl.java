package powerwatch.matrix.com.pwgen2android.shared.ui.dialogManager;

/* JADX INFO: compiled from: DialogManager.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J>\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u00050\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0016J*\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\u000f0\u0004\"\u0004\b\u0000\u0010\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u000f0\u0013H\u0016¨\u0006\u0014"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/ui/dialogManager/DialogManagerImpl;", "Lpowerwatch/matrix/com/pwgen2android/shared/ui/dialogManager/DialogManager;", "()V", "openAlertDialog", "Lio/reactivex/Single;", "", "kotlin.jvm.PlatformType", "context", "Landroid/content/Context;", io.fabric.sdk.android.services.settings.SettingsJsonConstants.PROMPT_TITLE_KEY, "", io.fabric.sdk.android.services.settings.SettingsJsonConstants.PROMPT_MESSAGE_KEY, "positiveButtonText", "negativeButtonText", "openCustomDialog", "DATA", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "dialogFragment", "Lpowerwatch/matrix/com/pwgen2android/shared/ui/dialogManager/dialogs/BaseDialog;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class DialogManagerImpl implements powerwatch.matrix.com.pwgen2android.shared.ui.dialogManager.DialogManager {
    @Override // powerwatch.matrix.com.pwgen2android.shared.ui.dialogManager.DialogManager
    public <DATA> io.reactivex.Single<DATA> openCustomDialog(final androidx.fragment.app.FragmentManager fragmentManager, final powerwatch.matrix.com.pwgen2android.shared.ui.dialogManager.dialogs.BaseDialog<DATA> dialogFragment) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dialogFragment, "dialogFragment");
        io.reactivex.Single<DATA> singleDefer = io.reactivex.Single.defer(new java.util.concurrent.Callable() { // from class: powerwatch.matrix.com.pwgen2android.shared.ui.dialogManager.-$$Lambda$DialogManagerImpl$k6BAc3okT38e7tKlSzeKQ2MagQs
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return powerwatch.matrix.com.pwgen2android.shared.ui.dialogManager.DialogManagerImpl.m3472openCustomDialog$lambda2(dialogFragment, fragmentManager);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(singleDefer, "defer {\n\n            Single.create<DATA> {\n\n                dialogFragment.show(fragmentManager, dialogFragment::class.simpleName)\n            }.doOnDispose {\n                dialogFragment.dismissAllowingStateLoss()\n            }\n        }");
        return singleDefer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: openCustomDialog$lambda-2, reason: not valid java name */
    public static final io.reactivex.SingleSource m3472openCustomDialog$lambda2(final powerwatch.matrix.com.pwgen2android.shared.ui.dialogManager.dialogs.BaseDialog dialogFragment, final androidx.fragment.app.FragmentManager fragmentManager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dialogFragment, "$dialogFragment");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragmentManager, "$fragmentManager");
        return io.reactivex.Single.create(new io.reactivex.SingleOnSubscribe() { // from class: powerwatch.matrix.com.pwgen2android.shared.ui.dialogManager.-$$Lambda$DialogManagerImpl$iyaxUeSFxL8Zq3niTmqR0-_WW2U
            @Override // io.reactivex.SingleOnSubscribe
            public final void subscribe(io.reactivex.SingleEmitter singleEmitter) {
                powerwatch.matrix.com.pwgen2android.shared.ui.dialogManager.DialogManagerImpl.m3473openCustomDialog$lambda2$lambda0(dialogFragment, fragmentManager, singleEmitter);
            }
        }).doOnDispose(new io.reactivex.functions.Action() { // from class: powerwatch.matrix.com.pwgen2android.shared.ui.dialogManager.-$$Lambda$DialogManagerImpl$xu37WseYmmz2k0wZRZdkCa0byAI
            @Override // io.reactivex.functions.Action
            public final void run() {
                powerwatch.matrix.com.pwgen2android.shared.ui.dialogManager.DialogManagerImpl.m3474openCustomDialog$lambda2$lambda1(dialogFragment);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: openCustomDialog$lambda-2$lambda-0, reason: not valid java name */
    public static final void m3473openCustomDialog$lambda2$lambda0(powerwatch.matrix.com.pwgen2android.shared.ui.dialogManager.dialogs.BaseDialog dialogFragment, androidx.fragment.app.FragmentManager fragmentManager, io.reactivex.SingleEmitter it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dialogFragment, "$dialogFragment");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragmentManager, "$fragmentManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        dialogFragment.show(fragmentManager, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(dialogFragment.getClass()).getSimpleName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: openCustomDialog$lambda-2$lambda-1, reason: not valid java name */
    public static final void m3474openCustomDialog$lambda2$lambda1(powerwatch.matrix.com.pwgen2android.shared.ui.dialogManager.dialogs.BaseDialog dialogFragment) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dialogFragment, "$dialogFragment");
        dialogFragment.dismissAllowingStateLoss();
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.ui.dialogManager.DialogManager
    public io.reactivex.Single<java.lang.Boolean> openAlertDialog(final android.content.Context context, final int title, final int message, final int positiveButtonText, int negativeButtonText) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        io.reactivex.Single<java.lang.Boolean> singleDefer = io.reactivex.Single.defer(new java.util.concurrent.Callable() { // from class: powerwatch.matrix.com.pwgen2android.shared.ui.dialogManager.-$$Lambda$DialogManagerImpl$oJfMnX_kRJIsP43KoBzNkCmYTQc
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return powerwatch.matrix.com.pwgen2android.shared.ui.dialogManager.DialogManagerImpl.m3467openAlertDialog$lambda7(context, title, message, positiveButtonText);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(singleDefer, "defer<Boolean> {\n\n        val builder = AlertDialog.Builder(context)\n        builder.setTitle(title)\n        builder.setCancelable(false)\n        builder.setMessage(message)\n\n        var dialogInstance: AlertDialog? = null\n        Single.create<Boolean> {\n            builder.setPositiveButton(positiveButtonText) { _, _ ->\n                it.onSuccess(true)\n            }\n            builder.setNegativeButton(R.string.button_cancel) { _, _ ->\n                it.onSuccess(false)\n            }\n            dialogInstance = builder.show()\n        }.doOnDispose {\n            dialogInstance?.cancel()\n        }\n    }");
        return singleDefer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: openAlertDialog$lambda-7, reason: not valid java name */
    public static final io.reactivex.SingleSource m3467openAlertDialog$lambda7(android.content.Context context, int i, int i2, final int i3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "$context");
        final android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(context);
        builder.setTitle(i);
        builder.setCancelable(false);
        builder.setMessage(i2);
        final kotlin.jvm.internal.Ref.ObjectRef objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
        return io.reactivex.Single.create(new io.reactivex.SingleOnSubscribe() { // from class: powerwatch.matrix.com.pwgen2android.shared.ui.dialogManager.-$$Lambda$DialogManagerImpl$vpmMohCHyedwVhIe8kEUeU6E1UY
            @Override // io.reactivex.SingleOnSubscribe
            public final void subscribe(io.reactivex.SingleEmitter singleEmitter) {
                powerwatch.matrix.com.pwgen2android.shared.ui.dialogManager.DialogManagerImpl.m3468openAlertDialog$lambda7$lambda5(builder, i3, objectRef, singleEmitter);
            }
        }).doOnDispose(new io.reactivex.functions.Action() { // from class: powerwatch.matrix.com.pwgen2android.shared.ui.dialogManager.-$$Lambda$DialogManagerImpl$zzbbI_wXzNlgqzGYxpx9RiKuqcE
            @Override // io.reactivex.functions.Action
            public final void run() {
                powerwatch.matrix.com.pwgen2android.shared.ui.dialogManager.DialogManagerImpl.m3471openAlertDialog$lambda7$lambda6(objectRef);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, android.app.AlertDialog] */
    /* JADX INFO: renamed from: openAlertDialog$lambda-7$lambda-5, reason: not valid java name */
    public static final void m3468openAlertDialog$lambda7$lambda5(android.app.AlertDialog.Builder builder, int i, kotlin.jvm.internal.Ref.ObjectRef dialogInstance, final io.reactivex.SingleEmitter it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "$builder");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dialogInstance, "$dialogInstance");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        builder.setPositiveButton(i, new android.content.DialogInterface.OnClickListener() { // from class: powerwatch.matrix.com.pwgen2android.shared.ui.dialogManager.-$$Lambda$DialogManagerImpl$K0Tpvf_0WAt1hvajs7ecgpbF0mc
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(android.content.DialogInterface dialogInterface, int i2) {
                powerwatch.matrix.com.pwgen2android.shared.ui.dialogManager.DialogManagerImpl.m3469openAlertDialog$lambda7$lambda5$lambda3(it, dialogInterface, i2);
            }
        });
        builder.setNegativeButton(powerwatch.matrix.com.pwgen2android.R.string.button_cancel, new android.content.DialogInterface.OnClickListener() { // from class: powerwatch.matrix.com.pwgen2android.shared.ui.dialogManager.-$$Lambda$DialogManagerImpl$DYP_MQRmUmp764Ma9HHXkG7HCzs
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(android.content.DialogInterface dialogInterface, int i2) {
                powerwatch.matrix.com.pwgen2android.shared.ui.dialogManager.DialogManagerImpl.m3470openAlertDialog$lambda7$lambda5$lambda4(it, dialogInterface, i2);
            }
        });
        dialogInstance.element = builder.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: openAlertDialog$lambda-7$lambda-5$lambda-3, reason: not valid java name */
    public static final void m3469openAlertDialog$lambda7$lambda5$lambda3(io.reactivex.SingleEmitter it, android.content.DialogInterface dialogInterface, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "$it");
        it.onSuccess(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: openAlertDialog$lambda-7$lambda-5$lambda-4, reason: not valid java name */
    public static final void m3470openAlertDialog$lambda7$lambda5$lambda4(io.reactivex.SingleEmitter it, android.content.DialogInterface dialogInterface, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "$it");
        it.onSuccess(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: openAlertDialog$lambda-7$lambda-6, reason: not valid java name */
    public static final void m3471openAlertDialog$lambda7$lambda6(kotlin.jvm.internal.Ref.ObjectRef dialogInstance) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dialogInstance, "$dialogInstance");
        android.app.AlertDialog alertDialog = (android.app.AlertDialog) dialogInstance.element;
        if (alertDialog == null) {
            return;
        }
        alertDialog.cancel();
    }
}
