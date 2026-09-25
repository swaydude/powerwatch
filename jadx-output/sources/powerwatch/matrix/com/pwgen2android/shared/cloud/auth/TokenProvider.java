package powerwatch.matrix.com.pwgen2android.shared.cloud.auth;

/* JADX INFO: compiled from: TokenStorage.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\bJ\u0006\u0010\r\u001a\u00020\u000bJ\u0012\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u000fJ\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010\u0005\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\b \t*\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00070\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenProvider;", "", "tokenStorage", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenStorage;", "(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenStorage;)V", "tokenSubject", "Lio/reactivex/subjects/BehaviorSubject;", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/Optional;", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;", "kotlin.jvm.PlatformType", "add", "Lio/reactivex/Completable;", "passwordCredentials", "deleteToken", "get", "Lio/reactivex/Observable;", "hasToken", "", "updatePassword", "password", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class TokenProvider {
    private final powerwatch.matrix.com.pwgen2android.shared.cloud.auth.TokenStorage tokenStorage;
    private final io.reactivex.subjects.BehaviorSubject<powerwatch.matrix.com.pwgen2android.shared.cloud.Optional<powerwatch.matrix.com.pwgen2android.shared.cloud.auth.PasswordCredentials>> tokenSubject;

    public TokenProvider(powerwatch.matrix.com.pwgen2android.shared.cloud.auth.TokenStorage tokenStorage) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tokenStorage, "tokenStorage");
        this.tokenStorage = tokenStorage;
        io.reactivex.subjects.BehaviorSubject<powerwatch.matrix.com.pwgen2android.shared.cloud.Optional<powerwatch.matrix.com.pwgen2android.shared.cloud.auth.PasswordCredentials>> behaviorSubjectCreate = io.reactivex.subjects.BehaviorSubject.create();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(behaviorSubjectCreate, "create<Optional<PasswordCredentials>>()");
        this.tokenSubject = behaviorSubjectCreate;
        behaviorSubjectCreate.onNext(new powerwatch.matrix.com.pwgen2android.shared.cloud.Optional<>(tokenStorage.get()));
    }

    public final boolean hasToken() {
        powerwatch.matrix.com.pwgen2android.shared.cloud.Optional<powerwatch.matrix.com.pwgen2android.shared.cloud.auth.PasswordCredentials> value = this.tokenSubject.getValue();
        return (value == null ? null : value.getElement()) != null;
    }

    public final io.reactivex.Completable updatePassword(final java.lang.String password) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(password, "password");
        io.reactivex.Completable completableFromAction = io.reactivex.Completable.fromAction(new io.reactivex.functions.Action() { // from class: powerwatch.matrix.com.pwgen2android.shared.cloud.auth.-$$Lambda$TokenProvider$H__MWJYbydr_7HqBT6Weyb1YZIE
            @Override // io.reactivex.functions.Action
            public final void run() {
                powerwatch.matrix.com.pwgen2android.shared.cloud.auth.TokenProvider.m3027updatePassword$lambda1(this.f$0, password);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(completableFromAction, "fromAction {\n        val passCred = tokenStorage.get()\n        passCred?.let {\n            val updated = it.copy(password = password)\n            tokenStorage.add(updated)\n            tokenSubject.onNext(Optional(updated))\n        }\n\n    }");
        return completableFromAction;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: updatePassword$lambda-1, reason: not valid java name */
    public static final void m3027updatePassword$lambda1(powerwatch.matrix.com.pwgen2android.shared.cloud.auth.TokenProvider this$0, java.lang.String password) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(password, "$password");
        powerwatch.matrix.com.pwgen2android.shared.cloud.auth.PasswordCredentials passwordCredentials = this$0.tokenStorage.get();
        if (passwordCredentials == null) {
            return;
        }
        powerwatch.matrix.com.pwgen2android.shared.cloud.auth.PasswordCredentials passwordCredentialsCopy = passwordCredentials.copy((kotlinx.coroutines.scheduling.WorkQueueKt.MASK & 1) != 0 ? passwordCredentials.uid : 0, (kotlinx.coroutines.scheduling.WorkQueueKt.MASK & 2) != 0 ? passwordCredentials.accessToken : null, (kotlinx.coroutines.scheduling.WorkQueueKt.MASK & 4) != 0 ? passwordCredentials.tokenType : null, (kotlinx.coroutines.scheduling.WorkQueueKt.MASK & 8) != 0 ? passwordCredentials.refreshToken : null, (kotlinx.coroutines.scheduling.WorkQueueKt.MASK & 16) != 0 ? passwordCredentials.expiresIn : 0L, (kotlinx.coroutines.scheduling.WorkQueueKt.MASK & 32) != 0 ? passwordCredentials.scope : null, (kotlinx.coroutines.scheduling.WorkQueueKt.MASK & 64) != 0 ? passwordCredentials.tokenValidUntil : 0L, (kotlinx.coroutines.scheduling.WorkQueueKt.MASK & 128) != 0 ? passwordCredentials.email : null, (kotlinx.coroutines.scheduling.WorkQueueKt.MASK & 256) != 0 ? passwordCredentials.password : password);
        this$0.tokenStorage.add(passwordCredentialsCopy);
        this$0.tokenSubject.onNext(new powerwatch.matrix.com.pwgen2android.shared.cloud.Optional<>(passwordCredentialsCopy));
    }

    public final io.reactivex.Completable add(final powerwatch.matrix.com.pwgen2android.shared.cloud.auth.PasswordCredentials passwordCredentials) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(passwordCredentials, "passwordCredentials");
        io.reactivex.Completable completableFromAction = io.reactivex.Completable.fromAction(new io.reactivex.functions.Action() { // from class: powerwatch.matrix.com.pwgen2android.shared.cloud.auth.-$$Lambda$TokenProvider$f5XM1pChjlgXzAufjiT5GtUkSOs
            @Override // io.reactivex.functions.Action
            public final void run() {
                powerwatch.matrix.com.pwgen2android.shared.cloud.auth.TokenProvider.m3025add$lambda2(passwordCredentials, this);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(completableFromAction, "fromAction {\n        passwordCredentials.tokenValidUntil = System.currentTimeMillis() + passwordCredentials.expiresIn * 1000\n        tokenStorage.add(passwordCredentials)\n        tokenSubject.onNext(Optional(passwordCredentials))\n    }");
        return completableFromAction;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: add$lambda-2, reason: not valid java name */
    public static final void m3025add$lambda2(powerwatch.matrix.com.pwgen2android.shared.cloud.auth.PasswordCredentials passwordCredentials, powerwatch.matrix.com.pwgen2android.shared.cloud.auth.TokenProvider this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(passwordCredentials, "$passwordCredentials");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        passwordCredentials.setTokenValidUntil(java.lang.System.currentTimeMillis() + (passwordCredentials.getExpiresIn() * ((long) 1000)));
        this$0.tokenStorage.add(passwordCredentials);
        this$0.tokenSubject.onNext(new powerwatch.matrix.com.pwgen2android.shared.cloud.Optional<>(passwordCredentials));
    }

    public final io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.shared.cloud.Optional<powerwatch.matrix.com.pwgen2android.shared.cloud.auth.PasswordCredentials>> get() {
        return this.tokenSubject;
    }

    public final io.reactivex.Completable deleteToken() {
        io.reactivex.Completable completableFromAction = io.reactivex.Completable.fromAction(new io.reactivex.functions.Action() { // from class: powerwatch.matrix.com.pwgen2android.shared.cloud.auth.-$$Lambda$TokenProvider$EQqMhoShQoZiATlJizVKK_cNAWc
            @Override // io.reactivex.functions.Action
            public final void run() {
                powerwatch.matrix.com.pwgen2android.shared.cloud.auth.TokenProvider.m3026deleteToken$lambda3(this.f$0);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(completableFromAction, "fromAction {\n            tokenStorage.delete()\n            tokenSubject.onNext(Optional(null))\n        }");
        return completableFromAction;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: deleteToken$lambda-3, reason: not valid java name */
    public static final void m3026deleteToken$lambda3(powerwatch.matrix.com.pwgen2android.shared.cloud.auth.TokenProvider this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.tokenStorage.delete();
        this$0.tokenSubject.onNext(new powerwatch.matrix.com.pwgen2android.shared.cloud.Optional<>(null));
    }
}
