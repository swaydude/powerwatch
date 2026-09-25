package kotlin.text;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: StringsJVM.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000~\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0019\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\n\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0010\f\n\u0002\b\u0011\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\u001a\u0011\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\tH\u0087\b\u001a\u0011\u0010\u0007\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000bH\u0087\b\u001a\u0011\u0010\u0007\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\rH\u0087\b\u001a\u0019\u0010\u0007\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0087\b\u001a!\u0010\u0007\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0087\b\u001a)\u0010\u0007\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u000fH\u0087\b\u001a\u0011\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0014H\u0087\b\u001a!\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0087\b\u001a!\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0087\b\u001a\f\u0010\u0017\u001a\u00020\u0002*\u00020\u0002H\u0007\u001a\u0014\u0010\u0017\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0019H\u0007\u001a\u0015\u0010\u001a\u001a\u00020\u0011*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0011H\u0087\b\u001a\u0015\u0010\u001c\u001a\u00020\u0011*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0011H\u0087\b\u001a\u001d\u0010\u001d\u001a\u00020\u0011*\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u0011H\u0087\b\u001a\u001c\u0010 \u001a\u00020\u0011*\u00020\u00022\u0006\u0010!\u001a\u00020\u00022\b\b\u0002\u0010\"\u001a\u00020#\u001a\f\u0010$\u001a\u00020\u0002*\u00020\u0014H\u0007\u001a \u0010$\u001a\u00020\u0002*\u00020\u00142\b\b\u0002\u0010%\u001a\u00020\u00112\b\b\u0002\u0010\u001f\u001a\u00020\u0011H\u0007\u001a\u0019\u0010&\u001a\u00020#*\u0004\u0018\u00010'2\b\u0010!\u001a\u0004\u0018\u00010'H\u0087\u0004\u001a \u0010&\u001a\u00020#*\u0004\u0018\u00010'2\b\u0010!\u001a\u0004\u0018\u00010'2\u0006\u0010\"\u001a\u00020#H\u0007\u001a\u0015\u0010&\u001a\u00020#*\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0087\b\u001a\u0015\u0010&\u001a\u00020#*\u00020\u00022\u0006\u0010(\u001a\u00020'H\u0087\b\u001a\f\u0010)\u001a\u00020\u0002*\u00020\u0002H\u0007\u001a\u0014\u0010)\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0019H\u0007\u001a\f\u0010*\u001a\u00020\u0002*\u00020\rH\u0007\u001a*\u0010*\u001a\u00020\u0002*\u00020\r2\b\b\u0002\u0010%\u001a\u00020\u00112\b\b\u0002\u0010\u001f\u001a\u00020\u00112\b\b\u0002\u0010+\u001a\u00020#H\u0007\u001a\f\u0010,\u001a\u00020\r*\u00020\u0002H\u0007\u001a*\u0010,\u001a\u00020\r*\u00020\u00022\b\b\u0002\u0010%\u001a\u00020\u00112\b\b\u0002\u0010\u001f\u001a\u00020\u00112\b\b\u0002\u0010+\u001a\u00020#H\u0007\u001a\u001c\u0010-\u001a\u00020#*\u00020\u00022\u0006\u0010.\u001a\u00020\u00022\b\b\u0002\u0010\"\u001a\u00020#\u001a \u0010/\u001a\u00020#*\u0004\u0018\u00010\u00022\b\u0010!\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\"\u001a\u00020#\u001a2\u00100\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00192\u0016\u00101\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010302\"\u0004\u0018\u000103H\u0087\b¢\u0006\u0002\u00104\u001a6\u00100\u001a\u00020\u0002*\u00020\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0016\u00101\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010302\"\u0004\u0018\u000103H\u0087\b¢\u0006\u0004\b5\u00104\u001a*\u00100\u001a\u00020\u0002*\u00020\u00022\u0016\u00101\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010302\"\u0004\u0018\u000103H\u0087\b¢\u0006\u0002\u00106\u001a:\u00100\u001a\u00020\u0002*\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u00100\u001a\u00020\u00022\u0016\u00101\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010302\"\u0004\u0018\u000103H\u0087\b¢\u0006\u0002\u00107\u001a>\u00100\u001a\u00020\u0002*\u00020\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u00100\u001a\u00020\u00022\u0016\u00101\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010302\"\u0004\u0018\u000103H\u0087\b¢\u0006\u0004\b5\u00107\u001a2\u00100\u001a\u00020\u0002*\u00020\u00042\u0006\u00100\u001a\u00020\u00022\u0016\u00101\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010302\"\u0004\u0018\u000103H\u0087\b¢\u0006\u0002\u00108\u001a\r\u00109\u001a\u00020\u0002*\u00020\u0002H\u0087\b\u001a\n\u0010:\u001a\u00020#*\u00020'\u001a\r\u0010;\u001a\u00020\u0002*\u00020\u0002H\u0087\b\u001a\u0015\u0010;\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0019H\u0087\b\u001a\u001d\u0010<\u001a\u00020\u0011*\u00020\u00022\u0006\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020\u0011H\u0081\b\u001a\u001d\u0010<\u001a\u00020\u0011*\u00020\u00022\u0006\u0010@\u001a\u00020\u00022\u0006\u0010?\u001a\u00020\u0011H\u0081\b\u001a\u001d\u0010A\u001a\u00020\u0011*\u00020\u00022\u0006\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020\u0011H\u0081\b\u001a\u001d\u0010A\u001a\u00020\u0011*\u00020\u00022\u0006\u0010@\u001a\u00020\u00022\u0006\u0010?\u001a\u00020\u0011H\u0081\b\u001a\u001d\u0010B\u001a\u00020\u0011*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u00112\u0006\u0010C\u001a\u00020\u0011H\u0087\b\u001a4\u0010D\u001a\u00020#*\u00020'2\u0006\u0010E\u001a\u00020\u00112\u0006\u0010!\u001a\u00020'2\u0006\u0010F\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\"\u001a\u00020#\u001a4\u0010D\u001a\u00020#*\u00020\u00022\u0006\u0010E\u001a\u00020\u00112\u0006\u0010!\u001a\u00020\u00022\u0006\u0010F\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\"\u001a\u00020#\u001a\u0012\u0010G\u001a\u00020\u0002*\u00020'2\u0006\u0010H\u001a\u00020\u0011\u001a$\u0010I\u001a\u00020\u0002*\u00020\u00022\u0006\u0010J\u001a\u00020>2\u0006\u0010K\u001a\u00020>2\b\b\u0002\u0010\"\u001a\u00020#\u001a$\u0010I\u001a\u00020\u0002*\u00020\u00022\u0006\u0010L\u001a\u00020\u00022\u0006\u0010M\u001a\u00020\u00022\b\b\u0002\u0010\"\u001a\u00020#\u001a$\u0010N\u001a\u00020\u0002*\u00020\u00022\u0006\u0010J\u001a\u00020>2\u0006\u0010K\u001a\u00020>2\b\b\u0002\u0010\"\u001a\u00020#\u001a$\u0010N\u001a\u00020\u0002*\u00020\u00022\u0006\u0010L\u001a\u00020\u00022\u0006\u0010M\u001a\u00020\u00022\b\b\u0002\u0010\"\u001a\u00020#\u001a\"\u0010O\u001a\b\u0012\u0004\u0012\u00020\u00020P*\u00020'2\u0006\u0010Q\u001a\u00020R2\b\b\u0002\u0010S\u001a\u00020\u0011\u001a\u001c\u0010T\u001a\u00020#*\u00020\u00022\u0006\u0010U\u001a\u00020\u00022\b\b\u0002\u0010\"\u001a\u00020#\u001a$\u0010T\u001a\u00020#*\u00020\u00022\u0006\u0010U\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\u00112\b\b\u0002\u0010\"\u001a\u00020#\u001a\u0015\u0010V\u001a\u00020\u0002*\u00020\u00022\u0006\u0010%\u001a\u00020\u0011H\u0087\b\u001a\u001d\u0010V\u001a\u00020\u0002*\u00020\u00022\u0006\u0010%\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u0011H\u0087\b\u001a\u0017\u0010W\u001a\u00020\r*\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0087\b\u001a\r\u0010X\u001a\u00020\u0014*\u00020\u0002H\u0087\b\u001a3\u0010X\u001a\u00020\u0014*\u00020\u00022\u0006\u0010Y\u001a\u00020\u00142\b\b\u0002\u0010Z\u001a\u00020\u00112\b\b\u0002\u0010%\u001a\u00020\u00112\b\b\u0002\u0010\u001f\u001a\u00020\u0011H\u0087\b\u001a \u0010X\u001a\u00020\u0014*\u00020\u00022\b\b\u0002\u0010%\u001a\u00020\u00112\b\b\u0002\u0010\u001f\u001a\u00020\u0011H\u0007\u001a\r\u0010[\u001a\u00020\u0002*\u00020\u0002H\u0087\b\u001a\u0015\u0010[\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0019H\u0087\b\u001a\u0017\u0010\\\u001a\u00020R*\u00020\u00022\b\b\u0002\u0010]\u001a\u00020\u0011H\u0087\b\u001a\r\u0010^\u001a\u00020\u0002*\u00020\u0002H\u0087\b\u001a\u0015\u0010^\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0019H\u0087\b\u001a\r\u0010_\u001a\u00020\u0002*\u00020\u0002H\u0087\b\u001a\u0015\u0010_\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0019H\u0087\b\"%\u0010\u0000\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006`"}, d2 = {"CASE_INSENSITIVE_ORDER", "Ljava/util/Comparator;", "", "Lkotlin/Comparator;", "Lkotlin/String$Companion;", "getCASE_INSENSITIVE_ORDER", "(Lkotlin/jvm/internal/StringCompanionObject;)Ljava/util/Comparator;", "String", "stringBuffer", "Ljava/lang/StringBuffer;", "stringBuilder", "Ljava/lang/StringBuilder;", "bytes", "", io.fabric.sdk.android.services.network.HttpRequest.PARAM_CHARSET, "Ljava/nio/charset/Charset;", "offset", "", "length", "chars", "", "codePoints", "", "capitalize", "locale", "Ljava/util/Locale;", "codePointAt", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "codePointBefore", "codePointCount", "beginIndex", "endIndex", "compareTo", com.google.android.gms.fitness.FitnessActivities.OTHER, "ignoreCase", "", "concatToString", "startIndex", "contentEquals", "", "charSequence", "decapitalize", "decodeToString", "throwOnInvalidSequence", "encodeToByteArray", "endsWith", "suffix", "equals", "format", "args", "", "", "(Ljava/lang/String;Ljava/util/Locale;[Ljava/lang/Object;)Ljava/lang/String;", "formatNullable", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", "(Lkotlin/jvm/internal/StringCompanionObject;Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", "(Lkotlin/jvm/internal/StringCompanionObject;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", "intern", "isBlank", "lowercase", "nativeIndexOf", "ch", "", "fromIndex", "str", "nativeLastIndexOf", "offsetByCodePoints", "codePointOffset", "regionMatches", "thisOffset", "otherOffset", "repeat", "n", "replace", "oldChar", "newChar", "oldValue", "newValue", "replaceFirst", "split", "", "regex", "Ljava/util/regex/Pattern;", "limit", "startsWith", "prefix", "substring", "toByteArray", "toCharArray", com.google.firebase.analytics.FirebaseAnalytics.Param.DESTINATION, "destinationOffset", "toLowerCase", "toPattern", "flags", "toUpperCase", "uppercase", "kotlin-stdlib"}, k = 5, mv = {1, 5, 1}, xi = 1, xs = "kotlin/text/StringsKt")
public class StringsKt__StringsJVMKt extends kotlin.text.StringsKt__StringNumberConversionsKt {
    private static final int nativeIndexOf(java.lang.String str, char c, int i) {
        java.util.Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
        return str.indexOf(c, i);
    }

    private static final int nativeIndexOf(java.lang.String str, java.lang.String str2, int i) {
        java.util.Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
        return str.indexOf(str2, i);
    }

    private static final int nativeLastIndexOf(java.lang.String str, char c, int i) {
        java.util.Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
        return str.lastIndexOf(c, i);
    }

    private static final int nativeLastIndexOf(java.lang.String str, java.lang.String str2, int i) {
        java.util.Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
        return str.lastIndexOf(str2, i);
    }

    public static /* synthetic */ boolean equals$default(java.lang.String str, java.lang.String str2, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return kotlin.text.StringsKt.equals(str, str2, z);
    }

    public static final boolean equals(java.lang.String str, java.lang.String str2, boolean z) {
        if (str == null) {
            return str2 == null;
        }
        if (!z) {
            return str.equals(str2);
        }
        return str.equalsIgnoreCase(str2);
    }

    public static /* synthetic */ java.lang.String replace$default(java.lang.String str, char c, char c2, boolean z, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return kotlin.text.StringsKt.replace(str, c, c2, z);
    }

    public static final java.lang.String replace(java.lang.String replace, char c, char c2, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(replace, "$this$replace");
        if (!z) {
            java.lang.String strReplace = replace.replace(c, c2);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(strReplace, "(this as java.lang.Strin…replace(oldChar, newChar)");
            return strReplace;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(replace.length());
        java.lang.String str = replace;
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (kotlin.text.CharsKt.equals(cCharAt, c, z)) {
                cCharAt = c2;
            }
            sb.append(cCharAt);
        }
        java.lang.String string = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }

    public static /* synthetic */ java.lang.String replace$default(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return kotlin.text.StringsKt.replace(str, str2, str3, z);
    }

    public static final java.lang.String replace(java.lang.String replace, java.lang.String oldValue, java.lang.String newValue, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(replace, "$this$replace");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(oldValue, "oldValue");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(newValue, "newValue");
        java.lang.String str = replace;
        int i = 0;
        int iIndexOf = kotlin.text.StringsKt.indexOf(str, oldValue, 0, z);
        if (iIndexOf < 0) {
            return replace;
        }
        int length = oldValue.length();
        int iCoerceAtLeast = kotlin.ranges.RangesKt.coerceAtLeast(length, 1);
        int length2 = (replace.length() - length) + newValue.length();
        if (length2 < 0) {
            throw new java.lang.OutOfMemoryError();
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length2);
        do {
            sb.append((java.lang.CharSequence) str, i, iIndexOf);
            sb.append(newValue);
            i = iIndexOf + length;
            if (iIndexOf >= replace.length()) {
                break;
            }
            iIndexOf = kotlin.text.StringsKt.indexOf(str, oldValue, iIndexOf + iCoerceAtLeast, z);
        } while (iIndexOf > 0);
        sb.append((java.lang.CharSequence) str, i, replace.length());
        java.lang.String string = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "stringBuilder.append(this, i, length).toString()");
        return string;
    }

    public static /* synthetic */ java.lang.String replaceFirst$default(java.lang.String str, char c, char c2, boolean z, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return kotlin.text.StringsKt.replaceFirst(str, c, c2, z);
    }

    public static final java.lang.String replaceFirst(java.lang.String replaceFirst, char c, char c2, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(replaceFirst, "$this$replaceFirst");
        java.lang.String str = replaceFirst;
        int iIndexOf$default = kotlin.text.StringsKt.indexOf$default(str, c, 0, z, 2, (java.lang.Object) null);
        return iIndexOf$default < 0 ? replaceFirst : kotlin.text.StringsKt.replaceRange((java.lang.CharSequence) str, iIndexOf$default, iIndexOf$default + 1, (java.lang.CharSequence) java.lang.String.valueOf(c2)).toString();
    }

    public static /* synthetic */ java.lang.String replaceFirst$default(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return kotlin.text.StringsKt.replaceFirst(str, str2, str3, z);
    }

    public static final java.lang.String replaceFirst(java.lang.String replaceFirst, java.lang.String oldValue, java.lang.String newValue, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(replaceFirst, "$this$replaceFirst");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(oldValue, "oldValue");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(newValue, "newValue");
        java.lang.String str = replaceFirst;
        int iIndexOf$default = kotlin.text.StringsKt.indexOf$default(str, oldValue, 0, z, 2, (java.lang.Object) null);
        return iIndexOf$default < 0 ? replaceFirst : kotlin.text.StringsKt.replaceRange((java.lang.CharSequence) str, iIndexOf$default, oldValue.length() + iIndexOf$default, (java.lang.CharSequence) newValue).toString();
    }

    @kotlin.Deprecated(message = "Use uppercase() instead.", replaceWith = @kotlin.ReplaceWith(expression = "uppercase(Locale.getDefault())", imports = {"java.util.Locale"}))
    @kotlin.DeprecatedSinceKotlin(warningSince = "1.5")
    private static final java.lang.String toUpperCase(java.lang.String str) {
        java.util.Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
        java.lang.String upperCase = str.toUpperCase();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase, "(this as java.lang.String).toUpperCase()");
        return upperCase;
    }

    private static final java.lang.String uppercase(java.lang.String str) {
        java.util.Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
        java.lang.String upperCase = str.toUpperCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase, "(this as java.lang.Strin….toUpperCase(Locale.ROOT)");
        return upperCase;
    }

    @kotlin.Deprecated(message = "Use lowercase() instead.", replaceWith = @kotlin.ReplaceWith(expression = "lowercase(Locale.getDefault())", imports = {"java.util.Locale"}))
    @kotlin.DeprecatedSinceKotlin(warningSince = "1.5")
    private static final java.lang.String toLowerCase(java.lang.String str) {
        java.util.Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
        java.lang.String lowerCase = str.toLowerCase();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase()");
        return lowerCase;
    }

    private static final java.lang.String lowercase(java.lang.String str) {
        java.util.Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
        java.lang.String lowerCase = str.toLowerCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.Strin….toLowerCase(Locale.ROOT)");
        return lowerCase;
    }

    public static final java.lang.String concatToString(char[] concatToString) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(concatToString, "$this$concatToString");
        return new java.lang.String(concatToString);
    }

    public static /* synthetic */ java.lang.String concatToString$default(char[] cArr, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = cArr.length;
        }
        return kotlin.text.StringsKt.concatToString(cArr, i, i2);
    }

    public static final java.lang.String concatToString(char[] concatToString, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(concatToString, "$this$concatToString");
        kotlin.collections.AbstractList.INSTANCE.checkBoundsIndexes$kotlin_stdlib(i, i2, concatToString.length);
        return new java.lang.String(concatToString, i, i2 - i);
    }

    public static /* synthetic */ char[] toCharArray$default(java.lang.String str, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        return kotlin.text.StringsKt.toCharArray(str, i, i2);
    }

    public static final char[] toCharArray(java.lang.String toCharArray, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(toCharArray, "$this$toCharArray");
        kotlin.collections.AbstractList.INSTANCE.checkBoundsIndexes$kotlin_stdlib(i, i2, toCharArray.length());
        char[] cArr = new char[i2 - i];
        toCharArray.getChars(i, i2, cArr, 0);
        return cArr;
    }

    public static final java.lang.String decodeToString(byte[] decodeToString) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decodeToString, "$this$decodeToString");
        return new java.lang.String(decodeToString, kotlin.text.Charsets.UTF_8);
    }

    public static /* synthetic */ java.lang.String decodeToString$default(byte[] bArr, int i, int i2, boolean z, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = bArr.length;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        return kotlin.text.StringsKt.decodeToString(bArr, i, i2, z);
    }

    public static final java.lang.String decodeToString(byte[] decodeToString, int i, int i2, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decodeToString, "$this$decodeToString");
        kotlin.collections.AbstractList.INSTANCE.checkBoundsIndexes$kotlin_stdlib(i, i2, decodeToString.length);
        if (!z) {
            return new java.lang.String(decodeToString, i, i2 - i, kotlin.text.Charsets.UTF_8);
        }
        java.lang.String string = kotlin.text.Charsets.UTF_8.newDecoder().onMalformedInput(java.nio.charset.CodingErrorAction.REPORT).onUnmappableCharacter(java.nio.charset.CodingErrorAction.REPORT).decode(java.nio.ByteBuffer.wrap(decodeToString, i, i2 - i)).toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "decoder.decode(ByteBuffe…- startIndex)).toString()");
        return string;
    }

    public static final byte[] encodeToByteArray(java.lang.String encodeToByteArray) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encodeToByteArray, "$this$encodeToByteArray");
        byte[] bytes = encodeToByteArray.getBytes(kotlin.text.Charsets.UTF_8);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    public static /* synthetic */ byte[] encodeToByteArray$default(java.lang.String str, int i, int i2, boolean z, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        return kotlin.text.StringsKt.encodeToByteArray(str, i, i2, z);
    }

    public static final byte[] encodeToByteArray(java.lang.String encodeToByteArray, int i, int i2, boolean z) throws java.nio.charset.CharacterCodingException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encodeToByteArray, "$this$encodeToByteArray");
        kotlin.collections.AbstractList.INSTANCE.checkBoundsIndexes$kotlin_stdlib(i, i2, encodeToByteArray.length());
        if (!z) {
            java.lang.String strSubstring = encodeToByteArray.substring(i, i2);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            java.nio.charset.Charset charset = kotlin.text.Charsets.UTF_8;
            java.util.Objects.requireNonNull(strSubstring, "null cannot be cast to non-null type java.lang.String");
            byte[] bytes = strSubstring.getBytes(charset);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
            return bytes;
        }
        java.nio.ByteBuffer byteBufferEncode = kotlin.text.Charsets.UTF_8.newEncoder().onMalformedInput(java.nio.charset.CodingErrorAction.REPORT).onUnmappableCharacter(java.nio.charset.CodingErrorAction.REPORT).encode(java.nio.CharBuffer.wrap(encodeToByteArray, i, i2));
        if (byteBufferEncode.hasArray() && byteBufferEncode.arrayOffset() == 0) {
            int iRemaining = byteBufferEncode.remaining();
            byte[] bArrArray = byteBufferEncode.array();
            kotlin.jvm.internal.Intrinsics.checkNotNull(bArrArray);
            if (iRemaining == bArrArray.length) {
                byte[] bArrArray2 = byteBufferEncode.array();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bArrArray2, "byteBuffer.array()");
                return bArrArray2;
            }
        }
        byte[] bArr = new byte[byteBufferEncode.remaining()];
        byteBufferEncode.get(bArr);
        return bArr;
    }

    private static final char[] toCharArray(java.lang.String str) {
        java.util.Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
        char[] charArray = str.toCharArray();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(charArray, "(this as java.lang.String).toCharArray()");
        return charArray;
    }

    static /* synthetic */ char[] toCharArray$default(java.lang.String str, char[] cArr, int i, int i2, int i3, int i4, java.lang.Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = str.length();
        }
        java.util.Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
        str.getChars(i2, i3, cArr, i);
        return cArr;
    }

    private static final char[] toCharArray(java.lang.String str, char[] cArr, int i, int i2, int i3) {
        java.util.Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
        str.getChars(i2, i3, cArr, i);
        return cArr;
    }

    private static final java.lang.String format(java.lang.String str, java.lang.Object... objArr) {
        java.lang.String str2 = java.lang.String.format(str, java.util.Arrays.copyOf(objArr, objArr.length));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "java.lang.String.format(this, *args)");
        return str2;
    }

    private static final java.lang.String format(kotlin.jvm.internal.StringCompanionObject stringCompanionObject, java.lang.String str, java.lang.Object... objArr) {
        java.lang.String str2 = java.lang.String.format(str, java.util.Arrays.copyOf(objArr, objArr.length));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "java.lang.String.format(format, *args)");
        return str2;
    }

    @kotlin.Deprecated(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @kotlin.DeprecatedSinceKotlin(hiddenSince = "1.4")
    private static final /* synthetic */ java.lang.String format(java.lang.String str, java.util.Locale locale, java.lang.Object... objArr) {
        java.lang.String str2 = java.lang.String.format(locale, str, java.util.Arrays.copyOf(objArr, objArr.length));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "java.lang.String.format(locale, this, *args)");
        return str2;
    }

    private static final java.lang.String formatNullable(java.lang.String str, java.util.Locale locale, java.lang.Object... objArr) {
        java.lang.String str2 = java.lang.String.format(locale, str, java.util.Arrays.copyOf(objArr, objArr.length));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "java.lang.String.format(locale, this, *args)");
        return str2;
    }

    @kotlin.Deprecated(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @kotlin.DeprecatedSinceKotlin(hiddenSince = "1.4")
    private static final /* synthetic */ java.lang.String format(kotlin.jvm.internal.StringCompanionObject stringCompanionObject, java.util.Locale locale, java.lang.String str, java.lang.Object... objArr) {
        java.lang.String str2 = java.lang.String.format(locale, str, java.util.Arrays.copyOf(objArr, objArr.length));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "java.lang.String.format(locale, format, *args)");
        return str2;
    }

    private static final java.lang.String formatNullable(kotlin.jvm.internal.StringCompanionObject stringCompanionObject, java.util.Locale locale, java.lang.String str, java.lang.Object... objArr) {
        java.lang.String str2 = java.lang.String.format(locale, str, java.util.Arrays.copyOf(objArr, objArr.length));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "java.lang.String.format(locale, format, *args)");
        return str2;
    }

    public static /* synthetic */ java.util.List split$default(java.lang.CharSequence charSequence, java.util.regex.Pattern pattern, int i, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return kotlin.text.StringsKt.split(charSequence, pattern, i);
    }

    public static final java.util.List<java.lang.String> split(java.lang.CharSequence split, java.util.regex.Pattern regex, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(split, "$this$split");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(regex, "regex");
        if (!(i >= 0)) {
            throw new java.lang.IllegalArgumentException(("Limit must be non-negative, but was " + i + '.').toString());
        }
        if (i == 0) {
            i = -1;
        }
        java.lang.String[] strArrSplit = regex.split(split, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(strArrSplit, "regex.split(this, if (limit == 0) -1 else limit)");
        return kotlin.collections.ArraysKt.asList(strArrSplit);
    }

    private static final java.lang.String substring(java.lang.String str, int i) {
        java.util.Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
        java.lang.String strSubstring = str.substring(i);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(strSubstring, "(this as java.lang.String).substring(startIndex)");
        return strSubstring;
    }

    private static final java.lang.String substring(java.lang.String str, int i, int i2) {
        java.util.Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
        java.lang.String strSubstring = str.substring(i, i2);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public static /* synthetic */ boolean startsWith$default(java.lang.String str, java.lang.String str2, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return kotlin.text.StringsKt.startsWith(str, str2, z);
    }

    public static final boolean startsWith(java.lang.String startsWith, java.lang.String prefix, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(startsWith, "$this$startsWith");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(prefix, "prefix");
        if (!z) {
            return startsWith.startsWith(prefix);
        }
        return kotlin.text.StringsKt.regionMatches(startsWith, 0, prefix, 0, prefix.length(), z);
    }

    public static /* synthetic */ boolean startsWith$default(java.lang.String str, java.lang.String str2, int i, boolean z, int i2, java.lang.Object obj) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        return kotlin.text.StringsKt.startsWith(str, str2, i, z);
    }

    public static final boolean startsWith(java.lang.String startsWith, java.lang.String prefix, int i, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(startsWith, "$this$startsWith");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(prefix, "prefix");
        if (!z) {
            return startsWith.startsWith(prefix, i);
        }
        return kotlin.text.StringsKt.regionMatches(startsWith, i, prefix, 0, prefix.length(), z);
    }

    public static /* synthetic */ boolean endsWith$default(java.lang.String str, java.lang.String str2, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return kotlin.text.StringsKt.endsWith(str, str2, z);
    }

    public static final boolean endsWith(java.lang.String endsWith, java.lang.String suffix, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(endsWith, "$this$endsWith");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(suffix, "suffix");
        if (!z) {
            return endsWith.endsWith(suffix);
        }
        return kotlin.text.StringsKt.regionMatches(endsWith, endsWith.length() - suffix.length(), suffix, 0, suffix.length(), true);
    }

    private static final java.lang.String String(byte[] bArr, int i, int i2, java.nio.charset.Charset charset) {
        return new java.lang.String(bArr, i, i2, charset);
    }

    private static final java.lang.String String(byte[] bArr, java.nio.charset.Charset charset) {
        return new java.lang.String(bArr, charset);
    }

    private static final java.lang.String String(byte[] bArr, int i, int i2) {
        return new java.lang.String(bArr, i, i2, kotlin.text.Charsets.UTF_8);
    }

    private static final java.lang.String String(byte[] bArr) {
        return new java.lang.String(bArr, kotlin.text.Charsets.UTF_8);
    }

    private static final java.lang.String String(char[] cArr) {
        return new java.lang.String(cArr);
    }

    private static final java.lang.String String(char[] cArr, int i, int i2) {
        return new java.lang.String(cArr, i, i2);
    }

    private static final java.lang.String String(int[] iArr, int i, int i2) {
        return new java.lang.String(iArr, i, i2);
    }

    private static final java.lang.String String(java.lang.StringBuffer stringBuffer) {
        return new java.lang.String(stringBuffer);
    }

    private static final java.lang.String String(java.lang.StringBuilder sb) {
        return new java.lang.String(sb);
    }

    private static final int codePointAt(java.lang.String str, int i) {
        java.util.Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
        return str.codePointAt(i);
    }

    private static final int codePointBefore(java.lang.String str, int i) {
        java.util.Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
        return str.codePointBefore(i);
    }

    private static final int codePointCount(java.lang.String str, int i, int i2) {
        java.util.Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
        return str.codePointCount(i, i2);
    }

    public static /* synthetic */ int compareTo$default(java.lang.String str, java.lang.String str2, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return kotlin.text.StringsKt.compareTo(str, str2, z);
    }

    public static final int compareTo(java.lang.String compareTo, java.lang.String other, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(compareTo, "$this$compareTo");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "other");
        if (z) {
            return compareTo.compareToIgnoreCase(other);
        }
        return compareTo.compareTo(other);
    }

    private static final boolean contentEquals(java.lang.String str, java.lang.CharSequence charSequence) {
        java.util.Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
        return str.contentEquals(charSequence);
    }

    private static final boolean contentEquals(java.lang.String str, java.lang.StringBuffer stringBuffer) {
        java.util.Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
        return str.contentEquals(stringBuffer);
    }

    public static final boolean contentEquals(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2) {
        if ((charSequence instanceof java.lang.String) && charSequence2 != null) {
            return ((java.lang.String) charSequence).contentEquals(charSequence2);
        }
        return kotlin.text.StringsKt.contentEqualsImpl(charSequence, charSequence2);
    }

    public static final boolean contentEquals(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, boolean z) {
        if (z) {
            return kotlin.text.StringsKt.contentEqualsIgnoreCaseImpl(charSequence, charSequence2);
        }
        return kotlin.text.StringsKt.contentEquals(charSequence, charSequence2);
    }

    private static final java.lang.String intern(java.lang.String str) {
        java.util.Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
        java.lang.String strIntern = str.intern();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(strIntern, "(this as java.lang.String).intern()");
        return strIntern;
    }

    public static final boolean isBlank(java.lang.CharSequence isBlank) {
        boolean z;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(isBlank, "$this$isBlank");
        if (isBlank.length() != 0) {
            java.lang.Iterable indices = kotlin.text.StringsKt.getIndices(isBlank);
            if ((indices instanceof java.util.Collection) && ((java.util.Collection) indices).isEmpty()) {
                z = true;
            } else {
                java.util.Iterator it = indices.iterator();
                while (it.hasNext()) {
                    if (!kotlin.text.CharsKt.isWhitespace(isBlank.charAt(((kotlin.collections.IntIterator) it).nextInt()))) {
                        z = false;
                    }
                }
                z = true;
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }

    private static final int offsetByCodePoints(java.lang.String str, int i, int i2) {
        java.util.Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
        return str.offsetByCodePoints(i, i2);
    }

    public static final boolean regionMatches(java.lang.CharSequence regionMatches, int i, java.lang.CharSequence other, int i2, int i3, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(regionMatches, "$this$regionMatches");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "other");
        if ((regionMatches instanceof java.lang.String) && (other instanceof java.lang.String)) {
            return kotlin.text.StringsKt.regionMatches((java.lang.String) regionMatches, i, (java.lang.String) other, i2, i3, z);
        }
        return kotlin.text.StringsKt.regionMatchesImpl(regionMatches, i, other, i2, i3, z);
    }

    public static final boolean regionMatches(java.lang.String regionMatches, int i, java.lang.String other, int i2, int i3, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(regionMatches, "$this$regionMatches");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "other");
        if (!z) {
            return regionMatches.regionMatches(i, other, i2, i3);
        }
        return regionMatches.regionMatches(z, i, other, i2, i3);
    }

    @kotlin.Deprecated(message = "Use lowercase() instead.", replaceWith = @kotlin.ReplaceWith(expression = "lowercase(locale)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(warningSince = "1.5")
    private static final java.lang.String toLowerCase(java.lang.String str, java.util.Locale locale) {
        java.util.Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
        java.lang.String lowerCase = str.toLowerCase(locale);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
        return lowerCase;
    }

    private static final java.lang.String lowercase(java.lang.String str, java.util.Locale locale) {
        java.util.Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
        java.lang.String lowerCase = str.toLowerCase(locale);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
        return lowerCase;
    }

    @kotlin.Deprecated(message = "Use uppercase() instead.", replaceWith = @kotlin.ReplaceWith(expression = "uppercase(locale)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(warningSince = "1.5")
    private static final java.lang.String toUpperCase(java.lang.String str, java.util.Locale locale) {
        java.util.Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
        java.lang.String upperCase = str.toUpperCase(locale);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase, "(this as java.lang.String).toUpperCase(locale)");
        return upperCase;
    }

    private static final java.lang.String uppercase(java.lang.String str, java.util.Locale locale) {
        java.util.Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
        java.lang.String upperCase = str.toUpperCase(locale);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase, "(this as java.lang.String).toUpperCase(locale)");
        return upperCase;
    }

    private static final byte[] toByteArray(java.lang.String str, java.nio.charset.Charset charset) {
        java.util.Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
        byte[] bytes = str.getBytes(charset);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    static /* synthetic */ byte[] toByteArray$default(java.lang.String str, java.nio.charset.Charset charset, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            charset = kotlin.text.Charsets.UTF_8;
        }
        java.util.Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
        byte[] bytes = str.getBytes(charset);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    private static final java.util.regex.Pattern toPattern(java.lang.String str, int i) {
        java.util.regex.Pattern patternCompile = java.util.regex.Pattern.compile(str, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(patternCompile, "java.util.regex.Pattern.compile(this, flags)");
        return patternCompile;
    }

    static /* synthetic */ java.util.regex.Pattern toPattern$default(java.lang.String str, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        java.util.regex.Pattern patternCompile = java.util.regex.Pattern.compile(str, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(patternCompile, "java.util.regex.Pattern.compile(this, flags)");
        return patternCompile;
    }

    @kotlin.Deprecated(message = "Use replaceFirstChar instead.", replaceWith = @kotlin.ReplaceWith(expression = "replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }", imports = {"java.util.Locale"}))
    @kotlin.DeprecatedSinceKotlin(warningSince = "1.5")
    public static final java.lang.String capitalize(java.lang.String capitalize) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(capitalize, "$this$capitalize");
        java.util.Locale locale = java.util.Locale.getDefault();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale, "Locale.getDefault()");
        return kotlin.text.StringsKt.capitalize(capitalize, locale);
    }

    @kotlin.Deprecated(message = "Use replaceFirstChar instead.", replaceWith = @kotlin.ReplaceWith(expression = "replaceFirstChar { if (it.isLowerCase()) it.titlecase(locale) else it.toString() }", imports = {}))
    @kotlin.DeprecatedSinceKotlin(warningSince = "1.5")
    public static final java.lang.String capitalize(java.lang.String capitalize, java.util.Locale locale) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(capitalize, "$this$capitalize");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(locale, "locale");
        if (!(capitalize.length() > 0)) {
            return capitalize;
        }
        char cCharAt = capitalize.charAt(0);
        if (!java.lang.Character.isLowerCase(cCharAt)) {
            return capitalize;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        char titleCase = java.lang.Character.toTitleCase(cCharAt);
        if (titleCase != java.lang.Character.toUpperCase(cCharAt)) {
            sb.append(titleCase);
        } else {
            java.lang.String strSubstring = capitalize.substring(0, 1);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            java.util.Objects.requireNonNull(strSubstring, "null cannot be cast to non-null type java.lang.String");
            java.lang.String upperCase = strSubstring.toUpperCase(locale);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase, "(this as java.lang.String).toUpperCase(locale)");
            sb.append(upperCase);
        }
        java.lang.String strSubstring2 = capitalize.substring(1);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(strSubstring2, "(this as java.lang.String).substring(startIndex)");
        sb.append(strSubstring2);
        java.lang.String string = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    @kotlin.Deprecated(message = "Use replaceFirstChar instead.", replaceWith = @kotlin.ReplaceWith(expression = "replaceFirstChar { it.lowercase(Locale.getDefault()) }", imports = {"java.util.Locale"}))
    @kotlin.DeprecatedSinceKotlin(warningSince = "1.5")
    public static final java.lang.String decapitalize(java.lang.String decapitalize) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decapitalize, "$this$decapitalize");
        if (!(decapitalize.length() > 0) || java.lang.Character.isLowerCase(decapitalize.charAt(0))) {
            return decapitalize;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.String strSubstring = decapitalize.substring(0, 1);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        java.util.Objects.requireNonNull(strSubstring, "null cannot be cast to non-null type java.lang.String");
        java.lang.String lowerCase = strSubstring.toLowerCase();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase()");
        sb.append(lowerCase);
        java.lang.String strSubstring2 = decapitalize.substring(1);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(strSubstring2, "(this as java.lang.String).substring(startIndex)");
        sb.append(strSubstring2);
        return sb.toString();
    }

    @kotlin.Deprecated(message = "Use replaceFirstChar instead.", replaceWith = @kotlin.ReplaceWith(expression = "replaceFirstChar { it.lowercase(locale) }", imports = {}))
    @kotlin.DeprecatedSinceKotlin(warningSince = "1.5")
    public static final java.lang.String decapitalize(java.lang.String decapitalize, java.util.Locale locale) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decapitalize, "$this$decapitalize");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(locale, "locale");
        if (!(decapitalize.length() > 0) || java.lang.Character.isLowerCase(decapitalize.charAt(0))) {
            return decapitalize;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.String strSubstring = decapitalize.substring(0, 1);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        java.util.Objects.requireNonNull(strSubstring, "null cannot be cast to non-null type java.lang.String");
        java.lang.String lowerCase = strSubstring.toLowerCase(locale);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
        sb.append(lowerCase);
        java.lang.String strSubstring2 = decapitalize.substring(1);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(strSubstring2, "(this as java.lang.String).substring(startIndex)");
        sb.append(strSubstring2);
        return sb.toString();
    }

    public static final java.lang.String repeat(java.lang.CharSequence repeat, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(repeat, "$this$repeat");
        int i2 = 1;
        if (!(i >= 0)) {
            throw new java.lang.IllegalArgumentException(("Count 'n' must be non-negative, but was " + i + '.').toString());
        }
        if (i == 0) {
            return "";
        }
        if (i == 1) {
            return repeat.toString();
        }
        int length = repeat.length();
        if (length == 0) {
            return "";
        }
        if (length == 1) {
            char cCharAt = repeat.charAt(0);
            char[] cArr = new char[i];
            for (int i3 = 0; i3 < i; i3++) {
                cArr[i3] = cCharAt;
            }
            return new java.lang.String(cArr);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(repeat.length() * i);
        if (1 <= i) {
            while (true) {
                sb.append(repeat);
                if (i2 == i) {
                    break;
                }
                i2++;
            }
        }
        java.lang.String string = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "sb.toString()");
        return string;
    }

    public static final java.util.Comparator<java.lang.String> getCASE_INSENSITIVE_ORDER(kotlin.jvm.internal.StringCompanionObject CASE_INSENSITIVE_ORDER) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(CASE_INSENSITIVE_ORDER, "$this$CASE_INSENSITIVE_ORDER");
        java.util.Comparator<java.lang.String> comparator = java.lang.String.CASE_INSENSITIVE_ORDER;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(comparator, "java.lang.String.CASE_INSENSITIVE_ORDER");
        return comparator;
    }
}
