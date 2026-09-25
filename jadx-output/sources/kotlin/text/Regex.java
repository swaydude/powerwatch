package kotlin.text;

/* JADX INFO: compiled from: Regex.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 ,2\u00060\u0001j\u0002`\u0002:\u0002,-B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005B\u0017\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB\u001d\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\n¢\u0006\u0002\u0010\u000bB\u000f\b\u0001\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017J\u001a\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u001bJ\u001e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00190\u001d2\u0006\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u001bJ\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0016\u001a\u00020\u0017J\u0011\u0010\u001f\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0086\u0004J\"\u0010 \u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00172\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00170\"J\u0016\u0010 \u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\u0004J\u0016\u0010$\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\u0004J\u001e\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00040&2\u0006\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010'\u001a\u00020\u001bJ\u0006\u0010(\u001a\u00020\rJ\b\u0010)\u001a\u00020\u0004H\u0016J\b\u0010*\u001a\u00020+H\u0002R\u0016\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\n8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006."}, d2 = {"Lkotlin/text/Regex;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "pattern", "", "(Ljava/lang/String;)V", "option", "Lkotlin/text/RegexOption;", "(Ljava/lang/String;Lkotlin/text/RegexOption;)V", "options", "", "(Ljava/lang/String;Ljava/util/Set;)V", "nativePattern", "Ljava/util/regex/Pattern;", "(Ljava/util/regex/Pattern;)V", "_options", "getOptions", "()Ljava/util/Set;", "getPattern", "()Ljava/lang/String;", "containsMatchIn", "", "input", "", "find", "Lkotlin/text/MatchResult;", "startIndex", "", "findAll", "Lkotlin/sequences/Sequence;", "matchEntire", "matches", "replace", "transform", "Lkotlin/Function1;", "replacement", "replaceFirst", "split", "", "limit", "toPattern", "toString", "writeReplace", "", "Companion", "Serialized", "kotlin-stdlib"}, k = 1, mv = {1, 5, 1})
public final class Regex implements java.io.Serializable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final kotlin.text.Regex.Companion INSTANCE = new kotlin.text.Regex.Companion(null);
    private java.util.Set<? extends kotlin.text.RegexOption> _options;
    private final java.util.regex.Pattern nativePattern;

    public Regex(java.util.regex.Pattern nativePattern) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nativePattern, "nativePattern");
        this.nativePattern = nativePattern;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Regex(java.lang.String pattern) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pattern, "pattern");
        java.util.regex.Pattern patternCompile = java.util.regex.Pattern.compile(pattern);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(patternCompile, "Pattern.compile(pattern)");
        this(patternCompile);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Regex(java.lang.String pattern, kotlin.text.RegexOption option) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pattern, "pattern");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(option, "option");
        java.util.regex.Pattern patternCompile = java.util.regex.Pattern.compile(pattern, INSTANCE.ensureUnicodeCase(option.getValue()));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(patternCompile, "Pattern.compile(pattern,…nicodeCase(option.value))");
        this(patternCompile);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Regex(java.lang.String pattern, java.util.Set<? extends kotlin.text.RegexOption> options) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pattern, "pattern");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(options, "options");
        java.util.regex.Pattern patternCompile = java.util.regex.Pattern.compile(pattern, INSTANCE.ensureUnicodeCase(kotlin.text.RegexKt.toInt(options)));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(patternCompile, "Pattern.compile(pattern,…odeCase(options.toInt()))");
        this(patternCompile);
    }

    public final java.lang.String getPattern() {
        java.lang.String strPattern = this.nativePattern.pattern();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(strPattern, "nativePattern.pattern()");
        return strPattern;
    }

    public final java.util.Set<kotlin.text.RegexOption> getOptions() {
        java.util.Set set = this._options;
        if (set != null) {
            return set;
        }
        final int iFlags = this.nativePattern.flags();
        java.util.EnumSet enumSetAllOf = java.util.EnumSet.allOf(kotlin.text.RegexOption.class);
        kotlin.collections.CollectionsKt.retainAll(enumSetAllOf, new kotlin.jvm.functions.Function1<T, java.lang.Boolean>() { // from class: kotlin.text.Regex$fromInt$$inlined$apply$lambda$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ java.lang.Boolean invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(invoke((java.lang.Enum) obj));
            }

            /* JADX WARN: Incorrect types in method signature: (TT;)Z */
            /* JADX WARN: Multi-variable type inference failed */
            public final boolean invoke(java.lang.Enum r3) {
                kotlin.text.FlagEnum flagEnum = (kotlin.text.FlagEnum) r3;
                return (iFlags & flagEnum.getMask()) == flagEnum.getValue();
            }
        });
        java.util.Set<kotlin.text.RegexOption> setUnmodifiableSet = java.util.Collections.unmodifiableSet(enumSetAllOf);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(setUnmodifiableSet, "Collections.unmodifiable…mask == it.value }\n    })");
        this._options = setUnmodifiableSet;
        return setUnmodifiableSet;
    }

    public final boolean matches(java.lang.CharSequence input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "input");
        return this.nativePattern.matcher(input).matches();
    }

    public final boolean containsMatchIn(java.lang.CharSequence input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "input");
        return this.nativePattern.matcher(input).find();
    }

    public static /* synthetic */ kotlin.text.MatchResult find$default(kotlin.text.Regex regex, java.lang.CharSequence charSequence, int i, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return regex.find(charSequence, i);
    }

    public final kotlin.text.MatchResult find(java.lang.CharSequence input, int startIndex) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "input");
        java.util.regex.Matcher matcher = this.nativePattern.matcher(input);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(matcher, "nativePattern.matcher(input)");
        return kotlin.text.RegexKt.findNext(matcher, startIndex, input);
    }

    public static /* synthetic */ kotlin.sequences.Sequence findAll$default(kotlin.text.Regex regex, java.lang.CharSequence charSequence, int i, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return regex.findAll(charSequence, i);
    }

    public final kotlin.sequences.Sequence<kotlin.text.MatchResult> findAll(final java.lang.CharSequence input, final int startIndex) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "input");
        if (startIndex < 0 || startIndex > input.length()) {
            throw new java.lang.IndexOutOfBoundsException("Start index out of bounds: " + startIndex + ", input length: " + input.length());
        }
        return kotlin.sequences.SequencesKt.generateSequence((kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<kotlin.text.MatchResult>() { // from class: kotlin.text.Regex.findAll.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final kotlin.text.MatchResult invoke() {
                return kotlin.text.Regex.this.find(input, startIndex);
            }
        }, (kotlin.jvm.functions.Function1) kotlin.text.Regex.AnonymousClass2.INSTANCE);
    }

    /* JADX INFO: renamed from: kotlin.text.Regex$findAll$2, reason: invalid class name */
    /* JADX INFO: compiled from: Regex.kt */
    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lkotlin/text/MatchResult;", "p1", "invoke"}, k = 3, mv = {1, 5, 1})
    static final /* synthetic */ class AnonymousClass2 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<kotlin.text.MatchResult, kotlin.text.MatchResult> {
        public static final kotlin.text.Regex.AnonymousClass2 INSTANCE = new kotlin.text.Regex.AnonymousClass2();

        AnonymousClass2() {
            super(1, kotlin.text.MatchResult.class, "next", "next()Lkotlin/text/MatchResult;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final kotlin.text.MatchResult invoke(kotlin.text.MatchResult p1) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "p1");
            return p1.next();
        }
    }

    public final kotlin.text.MatchResult matchEntire(java.lang.CharSequence input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "input");
        java.util.regex.Matcher matcher = this.nativePattern.matcher(input);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(matcher, "nativePattern.matcher(input)");
        return kotlin.text.RegexKt.matchEntire(matcher, input);
    }

    public final java.lang.String replace(java.lang.CharSequence input, java.lang.String replacement) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "input");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(replacement, "replacement");
        java.lang.String strReplaceAll = this.nativePattern.matcher(input).replaceAll(replacement);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(strReplaceAll, "nativePattern.matcher(in…).replaceAll(replacement)");
        return strReplaceAll;
    }

    public final java.lang.String replace(java.lang.CharSequence input, kotlin.jvm.functions.Function1<? super kotlin.text.MatchResult, ? extends java.lang.CharSequence> transform) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "input");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transform, "transform");
        int iIntValue = 0;
        kotlin.text.MatchResult matchResultFind$default = find$default(this, input, 0, 2, null);
        if (matchResultFind$default == null) {
            return input.toString();
        }
        int length = input.length();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length);
        do {
            kotlin.jvm.internal.Intrinsics.checkNotNull(matchResultFind$default);
            sb.append(input, iIntValue, matchResultFind$default.getRange().getStart().intValue());
            sb.append(transform.invoke(matchResultFind$default));
            iIntValue = matchResultFind$default.getRange().getEndInclusive().intValue() + 1;
            matchResultFind$default = matchResultFind$default.next();
            if (iIntValue >= length) {
                break;
            }
        } while (matchResultFind$default != null);
        if (iIntValue < length) {
            sb.append(input, iIntValue, length);
        }
        java.lang.String string = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "sb.toString()");
        return string;
    }

    public final java.lang.String replaceFirst(java.lang.CharSequence input, java.lang.String replacement) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "input");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(replacement, "replacement");
        java.lang.String strReplaceFirst = this.nativePattern.matcher(input).replaceFirst(replacement);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(strReplaceFirst, "nativePattern.matcher(in…replaceFirst(replacement)");
        return strReplaceFirst;
    }

    public static /* synthetic */ java.util.List split$default(kotlin.text.Regex regex, java.lang.CharSequence charSequence, int i, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return regex.split(charSequence, i);
    }

    public final java.util.List<java.lang.String> split(java.lang.CharSequence input, int limit) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "input");
        int iEnd = 0;
        if (!(limit >= 0)) {
            throw new java.lang.IllegalArgumentException(("Limit must be non-negative, but was " + limit + '.').toString());
        }
        java.util.regex.Matcher matcher = this.nativePattern.matcher(input);
        if (!matcher.find() || limit == 1) {
            return kotlin.collections.CollectionsKt.listOf(input.toString());
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(limit > 0 ? kotlin.ranges.RangesKt.coerceAtMost(limit, 10) : 10);
        int i = limit - 1;
        do {
            arrayList.add(input.subSequence(iEnd, matcher.start()).toString());
            iEnd = matcher.end();
            if (i >= 0 && arrayList.size() == i) {
                break;
            }
        } while (matcher.find());
        arrayList.add(input.subSequence(iEnd, input.length()).toString());
        return arrayList;
    }

    public java.lang.String toString() {
        java.lang.String string = this.nativePattern.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "nativePattern.toString()");
        return string;
    }

    /* JADX INFO: renamed from: toPattern, reason: from getter */
    public final java.util.regex.Pattern getNativePattern() {
        return this.nativePattern;
    }

    private final java.lang.Object writeReplace() {
        java.lang.String strPattern = this.nativePattern.pattern();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(strPattern, "nativePattern.pattern()");
        return new kotlin.text.Regex.Serialized(strPattern, this.nativePattern.flags());
    }

    /* JADX INFO: compiled from: Regex.kt */
    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0002\u0018\u0000 \u000e2\u00060\u0001j\u0002`\u0002:\u0001\u000eB\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\f\u001a\u00020\rH\u0002R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lkotlin/text/Regex$Serialized;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "pattern", "", "flags", "", "(Ljava/lang/String;I)V", "getFlags", "()I", "getPattern", "()Ljava/lang/String;", "readResolve", "", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 5, 1})
    private static final class Serialized implements java.io.Serializable {
        private static final long serialVersionUID = 0;
        private final int flags;
        private final java.lang.String pattern;

        public Serialized(java.lang.String pattern, int i) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pattern, "pattern");
            this.pattern = pattern;
            this.flags = i;
        }

        public final int getFlags() {
            return this.flags;
        }

        public final java.lang.String getPattern() {
            return this.pattern;
        }

        private final java.lang.Object readResolve() {
            java.util.regex.Pattern patternCompile = java.util.regex.Pattern.compile(this.pattern, this.flags);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(patternCompile, "Pattern.compile(pattern, flags)");
            return new kotlin.text.Regex(patternCompile);
        }
    }

    /* JADX INFO: compiled from: Regex.kt */
    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\t\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0007¨\u0006\f"}, d2 = {"Lkotlin/text/Regex$Companion;", "", "()V", "ensureUnicodeCase", "", "flags", "escape", "", "literal", "escapeReplacement", "fromLiteral", "Lkotlin/text/Regex;", "kotlin-stdlib"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        /* JADX INFO: Access modifiers changed from: private */
        public final int ensureUnicodeCase(int flags) {
            return (flags & 2) != 0 ? flags | 64 : flags;
        }

        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final kotlin.text.Regex fromLiteral(java.lang.String literal) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(literal, "literal");
            return new kotlin.text.Regex(literal, kotlin.text.RegexOption.LITERAL);
        }

        public final java.lang.String escape(java.lang.String literal) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(literal, "literal");
            java.lang.String strQuote = java.util.regex.Pattern.quote(literal);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(strQuote, "Pattern.quote(literal)");
            return strQuote;
        }

        public final java.lang.String escapeReplacement(java.lang.String literal) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(literal, "literal");
            java.lang.String strQuoteReplacement = java.util.regex.Matcher.quoteReplacement(literal);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(strQuoteReplacement, "Matcher.quoteReplacement(literal)");
            return strQuoteReplacement;
        }
    }
}
