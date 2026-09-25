package powerwatch.matrix.com.pwgen2android.utils;

/* JADX INFO: compiled from: LoginValidator.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/utils/EmailValidator;", "", "()V", "isEmailValid", "", "email", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class EmailValidator {
    public final boolean isEmailValid(java.lang.String email) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(email, "email");
        java.util.regex.Pattern patternCompile = java.util.regex.Pattern.compile("[A-Z0-9a-z._%+-]+@([A-Za-z0-9.-]{2,64})+\\.[A-Za-z]{2,64}", 2);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(patternCompile, "compile(emailPattern, Pattern.CASE_INSENSITIVE)");
        java.util.regex.Matcher matcher = patternCompile.matcher(email);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(matcher, "pattern.matcher(email)");
        return matcher.matches();
    }
}
