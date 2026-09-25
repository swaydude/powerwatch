package kotlin.text;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: StringBuilder.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0010\f\n\u0002\u0010\u0019\n\u0002\u0010\r\n\u0000\u001a>\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u001b\u0010\u0004\u001a\u0017\u0012\b\u0012\u00060\u0006j\u0002`\u0007\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\u0002\b\tH\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001\u001a6\u0010\u0000\u001a\u00020\u00012\u001b\u0010\u0004\u001a\u0017\u0012\b\u0012\u00060\u0006j\u0002`\u0007\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\u0002\b\tH\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001\u001a\u001f\u0010\n\u001a\u00060\u0006j\u0002`\u0007*\u00060\u0006j\u0002`\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0087\b\u001a/\u0010\n\u001a\u00060\u0006j\u0002`\u0007*\u00060\u0006j\u0002`\u00072\u0016\u0010\r\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\f0\u000e\"\u0004\u0018\u00010\f¢\u0006\u0002\u0010\u000f\u001a/\u0010\n\u001a\u00060\u0006j\u0002`\u0007*\u00060\u0006j\u0002`\u00072\u0016\u0010\r\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u000e\"\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\u0010\u001a\u0015\u0010\u0011\u001a\u00060\u0006j\u0002`\u0007*\u00060\u0006j\u0002`\u0007H\u0087\b\u001a\u001f\u0010\u0011\u001a\u00060\u0006j\u0002`\u0007*\u00060\u0006j\u0002`\u00072\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0087\b\u001a\u001d\u0010\u0011\u001a\u00060\u0006j\u0002`\u0007*\u00060\u0006j\u0002`\u00072\u0006\u0010\r\u001a\u00020\u0012H\u0087\b\u001a\u001d\u0010\u0011\u001a\u00060\u0006j\u0002`\u0007*\u00060\u0006j\u0002`\u00072\u0006\u0010\r\u001a\u00020\u0013H\u0087\b\u001a\u001d\u0010\u0011\u001a\u00060\u0006j\u0002`\u0007*\u00060\u0006j\u0002`\u00072\u0006\u0010\r\u001a\u00020\u0014H\u0087\b\u001a\u001f\u0010\u0011\u001a\u00060\u0006j\u0002`\u0007*\u00060\u0006j\u0002`\u00072\b\u0010\r\u001a\u0004\u0018\u00010\u0015H\u0087\b\u001a\u001f\u0010\u0011\u001a\u00060\u0006j\u0002`\u0007*\u00060\u0006j\u0002`\u00072\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u0087\b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0016"}, d2 = {"buildString", "", "capacity", "", "builderAction", "Lkotlin/Function1;", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "", "Lkotlin/ExtensionFunctionType;", "append", "obj", "", "value", "", "(Ljava/lang/StringBuilder;[Ljava/lang/Object;)Ljava/lang/StringBuilder;", "(Ljava/lang/StringBuilder;[Ljava/lang/String;)Ljava/lang/StringBuilder;", "appendLine", "", "", "", "", "kotlin-stdlib"}, k = 5, mv = {1, 5, 1}, xi = 1, xs = "kotlin/text/StringsKt")
public class StringsKt__StringBuilderKt extends kotlin.text.StringsKt__StringBuilderJVMKt {
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Use append(value: Any?) instead", replaceWith = @kotlin.ReplaceWith(expression = "append(value = obj)", imports = {}))
    private static final java.lang.StringBuilder append(java.lang.StringBuilder sb, java.lang.Object obj) {
        sb.append(obj);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb, "this.append(obj)");
        return sb;
    }

    private static final java.lang.String buildString(kotlin.jvm.functions.Function1<? super java.lang.StringBuilder, kotlin.Unit> function1) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        function1.invoke(sb);
        java.lang.String string = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    private static final java.lang.String buildString(int i, kotlin.jvm.functions.Function1<? super java.lang.StringBuilder, kotlin.Unit> function1) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(i);
        function1.invoke(sb);
        java.lang.String string = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }

    public static final java.lang.StringBuilder append(java.lang.StringBuilder append, java.lang.String... value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(append, "$this$append");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
        for (java.lang.String str : value) {
            append.append(str);
        }
        return append;
    }

    public static final java.lang.StringBuilder append(java.lang.StringBuilder append, java.lang.Object... value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(append, "$this$append");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
        for (java.lang.Object obj : value) {
            append.append(obj);
        }
        return append;
    }

    private static final java.lang.StringBuilder appendLine(java.lang.StringBuilder sb) {
        sb.append('\n');
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb, "append('\\n')");
        return sb;
    }

    private static final java.lang.StringBuilder appendLine(java.lang.StringBuilder sb, java.lang.CharSequence charSequence) {
        sb.append(charSequence);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb, "append(value)");
        sb.append('\n');
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb, "append('\\n')");
        return sb;
    }

    private static final java.lang.StringBuilder appendLine(java.lang.StringBuilder sb, java.lang.String str) {
        sb.append(str);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb, "append(value)");
        sb.append('\n');
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb, "append('\\n')");
        return sb;
    }

    private static final java.lang.StringBuilder appendLine(java.lang.StringBuilder sb, java.lang.Object obj) {
        sb.append(obj);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb, "append(value)");
        sb.append('\n');
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb, "append('\\n')");
        return sb;
    }

    private static final java.lang.StringBuilder appendLine(java.lang.StringBuilder sb, char[] cArr) {
        sb.append(cArr);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb, "append(value)");
        sb.append('\n');
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb, "append('\\n')");
        return sb;
    }

    private static final java.lang.StringBuilder appendLine(java.lang.StringBuilder sb, char c) {
        sb.append(c);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb, "append(value)");
        sb.append('\n');
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb, "append('\\n')");
        return sb;
    }

    private static final java.lang.StringBuilder appendLine(java.lang.StringBuilder sb, boolean z) {
        sb.append(z);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb, "append(value)");
        sb.append('\n');
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb, "append('\\n')");
        return sb;
    }
}
