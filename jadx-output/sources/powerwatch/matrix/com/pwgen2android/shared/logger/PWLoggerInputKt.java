package powerwatch.matrix.com.pwgen2android.shared.logger;

/* JADX INFO: compiled from: PWLoggerInput.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\u001a\u000e\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0006\u001a\u001c\u0010\u0007\u001a\u00020\b*\u00020\t2\u0006\u0010\n\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u001a&\u0010\u000b\u001a\u00020\b*\u00020\t2\u0006\u0010\n\u001a\u00020\u00012\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u001a\u001c\u0010\r\u001a\u00020\b*\u00020\t2\u0006\u0010\n\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u001a\u001c\u0010\u000e\u001a\u00020\b*\u00020\t2\u0006\u0010\n\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u001a\u001e\u0010\u000f\u001a\u00020\b*\u00020\t2\u0006\u0010\n\u001a\u00020\u00012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0010²\u0006\n\u0010\u0011\u001a\u00020\u0012X\u008a\u0084\u0002²\u0006\n\u0010\u0011\u001a\u00020\u0012X\u008a\u0084\u0002²\u0006\n\u0010\u0011\u001a\u00020\u0012X\u008a\u0084\u0002²\u0006\n\u0010\u0011\u001a\u00020\u0012X\u008a\u0084\u0002²\u0006\n\u0010\u0011\u001a\u00020\u0012X\u008a\u0084\u0002"}, d2 = {"INTERNAL_TAG", "", "getINTERNAL_TAG", "()Ljava/lang/String;", "createTag", "tag", "", "debug", "", "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;", io.fabric.sdk.android.services.settings.SettingsJsonConstants.PROMPT_MESSAGE_KEY, "error", "", "info", "warn", "wtfError", "app_release", "logger", "Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInput;"}, k = 2, mv = {1, 5, 1}, xi = 48)
public final class PWLoggerInputKt {
    private static final java.lang.String INTERNAL_TAG = "INTERNAL";

    public static final java.lang.String getINTERNAL_TAG() {
        return INTERNAL_TAG;
    }

    public static /* synthetic */ void info$default(powerwatch.matrix.com.pwgen2android.shared.logger.Loggable loggable, java.lang.String str, java.lang.Object obj, int i, java.lang.Object obj2) {
        if ((i & 2) != 0) {
            obj = loggable;
        }
        info(loggable, str, obj);
    }

    public static final void info(powerwatch.matrix.com.pwgen2android.shared.logger.Loggable loggable, java.lang.String message, java.lang.Object tag) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loggable, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tag, "tag");
        final org.koin.core.qualifier.Qualifier qualifier = (org.koin.core.qualifier.Qualifier) null;
        final kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) null;
        final org.koin.core.scope.Scope rootScope = loggable.getKoin().getRootScope();
        m3341info$lambda0(kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInput>() { // from class: powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt$info$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInput] */
            @Override // kotlin.jvm.functions.Function0
            public final powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInput invoke() {
                return rootScope.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInput.class), qualifier, function0);
            }
        })).info(message, tag);
    }

    /* JADX INFO: renamed from: info$lambda-0, reason: not valid java name */
    private static final powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInput m3341info$lambda0(kotlin.Lazy<? extends powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInput> lazy) {
        return lazy.getValue();
    }

    public static /* synthetic */ void warn$default(powerwatch.matrix.com.pwgen2android.shared.logger.Loggable loggable, java.lang.String str, java.lang.Object obj, int i, java.lang.Object obj2) {
        if ((i & 2) != 0) {
            obj = loggable;
        }
        warn(loggable, str, obj);
    }

    public static final void warn(powerwatch.matrix.com.pwgen2android.shared.logger.Loggable loggable, java.lang.String message, java.lang.Object tag) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loggable, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tag, "tag");
        final org.koin.core.qualifier.Qualifier qualifier = (org.koin.core.qualifier.Qualifier) null;
        final kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) null;
        final org.koin.core.scope.Scope rootScope = loggable.getKoin().getRootScope();
        m3342warn$lambda1(kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInput>() { // from class: powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt$warn$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInput] */
            @Override // kotlin.jvm.functions.Function0
            public final powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInput invoke() {
                return rootScope.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInput.class), qualifier, function0);
            }
        })).warn(message, tag);
    }

    /* JADX INFO: renamed from: warn$lambda-1, reason: not valid java name */
    private static final powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInput m3342warn$lambda1(kotlin.Lazy<? extends powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInput> lazy) {
        return lazy.getValue();
    }

    public static /* synthetic */ void debug$default(powerwatch.matrix.com.pwgen2android.shared.logger.Loggable loggable, java.lang.String str, java.lang.Object obj, int i, java.lang.Object obj2) {
        if ((i & 2) != 0) {
            obj = loggable;
        }
        debug(loggable, str, obj);
    }

    public static final void debug(powerwatch.matrix.com.pwgen2android.shared.logger.Loggable loggable, java.lang.String message, java.lang.Object tag) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loggable, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tag, "tag");
        final org.koin.core.qualifier.Qualifier qualifier = (org.koin.core.qualifier.Qualifier) null;
        final kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) null;
        final org.koin.core.scope.Scope rootScope = loggable.getKoin().getRootScope();
        m3339debug$lambda2(kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInput>() { // from class: powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt$debug$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInput] */
            @Override // kotlin.jvm.functions.Function0
            public final powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInput invoke() {
                return rootScope.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInput.class), qualifier, function0);
            }
        })).debug(message, tag);
    }

    /* JADX INFO: renamed from: debug$lambda-2, reason: not valid java name */
    private static final powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInput m3339debug$lambda2(kotlin.Lazy<? extends powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInput> lazy) {
        return lazy.getValue();
    }

    public static /* synthetic */ void error$default(powerwatch.matrix.com.pwgen2android.shared.logger.Loggable loggable, java.lang.String str, java.lang.Throwable th, java.lang.Object obj, int i, java.lang.Object obj2) {
        if ((i & 4) != 0) {
            obj = loggable;
        }
        error(loggable, str, th, obj);
    }

    public static final void error(powerwatch.matrix.com.pwgen2android.shared.logger.Loggable loggable, java.lang.String message, java.lang.Throwable th, java.lang.Object tag) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loggable, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tag, "tag");
        final org.koin.core.qualifier.Qualifier qualifier = (org.koin.core.qualifier.Qualifier) null;
        final kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) null;
        final org.koin.core.scope.Scope rootScope = loggable.getKoin().getRootScope();
        m3340error$lambda3(kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInput>() { // from class: powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt$error$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInput] */
            @Override // kotlin.jvm.functions.Function0
            public final powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInput invoke() {
                return rootScope.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInput.class), qualifier, function0);
            }
        })).error(message, tag, th);
    }

    /* JADX INFO: renamed from: error$lambda-3, reason: not valid java name */
    private static final powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInput m3340error$lambda3(kotlin.Lazy<? extends powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInput> lazy) {
        return lazy.getValue();
    }

    public static /* synthetic */ void wtfError$default(powerwatch.matrix.com.pwgen2android.shared.logger.Loggable loggable, java.lang.String str, java.lang.Throwable th, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        wtfError(loggable, str, th);
    }

    public static final void wtfError(powerwatch.matrix.com.pwgen2android.shared.logger.Loggable loggable, java.lang.String message, java.lang.Throwable th) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loggable, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        final org.koin.core.qualifier.Qualifier qualifier = (org.koin.core.qualifier.Qualifier) null;
        final kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) null;
        final org.koin.core.scope.Scope rootScope = loggable.getKoin().getRootScope();
        m3343wtfError$lambda4(kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInput>() { // from class: powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt$wtfError$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInput] */
            @Override // kotlin.jvm.functions.Function0
            public final powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInput invoke() {
                return rootScope.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInput.class), qualifier, function0);
            }
        })).wtfError(message, loggable, th);
    }

    /* JADX INFO: renamed from: wtfError$lambda-4, reason: not valid java name */
    private static final powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInput m3343wtfError$lambda4(kotlin.Lazy<? extends powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInput> lazy) {
        return lazy.getValue();
    }

    public static final java.lang.String createTag(java.lang.Object tag) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tag, "tag");
        if (tag instanceof java.lang.String) {
            return (java.lang.String) tag;
        }
        java.lang.String simpleName = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(tag.getClass()).getSimpleName();
        return simpleName == null ? "" : simpleName;
    }
}
