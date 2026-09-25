package kotlin.reflect.jvm.internal.impl.renderer;

/* JADX INFO: compiled from: RenderingUtils.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class RenderingUtilsKt {
    public static final java.lang.String render(kotlin.reflect.jvm.internal.impl.name.Name render) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(render, "$this$render");
        if (!shouldBeEscaped(render)) {
            java.lang.String strAsString = render.asString();
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(strAsString, "asString()");
            return strAsString;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.String strAsString2 = render.asString();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(strAsString2, "asString()");
        sb.append(java.lang.String.valueOf('`') + strAsString2);
        sb.append('`');
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:25:? A[RETURN, SYNTHETIC] */
    private static final boolean shouldBeEscaped(kotlin.reflect.jvm.internal.impl.name.Name name) {
        boolean z;
        if (name.isSpecial()) {
            return false;
        }
        java.lang.String strAsString = name.asString();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(strAsString, "asString()");
        if (!kotlin.reflect.jvm.internal.impl.renderer.KeywordStringsGenerated.KEYWORDS.contains(strAsString)) {
            java.lang.String str = strAsString;
            for (int i = 0; i < str.length(); i++) {
                char cCharAt = str.charAt(i);
                if ((java.lang.Character.isLetterOrDigit(cCharAt) || cCharAt == '_') ? false : true) {
                    z = true;
                    if (z) {
                        return false;
                    }
                }
            }
            z = false;
            if (z) {
                return false;
            }
        }
        return true;
    }

    public static final java.lang.String render(kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe render) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(render, "$this$render");
        java.util.List<kotlin.reflect.jvm.internal.impl.name.Name> listPathSegments = render.pathSegments();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(listPathSegments, "pathSegments()");
        return renderFqName(listPathSegments);
    }

    public static final java.lang.String renderFqName(java.util.List<kotlin.reflect.jvm.internal.impl.name.Name> pathSegments) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(pathSegments, "pathSegments");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (kotlin.reflect.jvm.internal.impl.name.Name name : pathSegments) {
            if (sb.length() > 0) {
                sb.append(".");
            }
            sb.append(render(name));
        }
        java.lang.String string = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
