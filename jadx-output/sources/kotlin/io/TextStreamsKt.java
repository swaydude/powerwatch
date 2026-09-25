package kotlin.io;

/* JADX INFO: compiled from: ReadWrite.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000X\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0017\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a\u0017\u0010\u0000\u001a\u00020\u0005*\u00020\u00062\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a\u001c\u0010\u0007\u001a\u00020\b*\u00020\u00022\u0006\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u001a\u001e\u0010\n\u001a\u00020\u000b*\u00020\u00022\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b0\r\u001a\u0010\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0010*\u00020\u0001\u001a\n\u0010\u0011\u001a\u00020\u0012*\u00020\u0013\u001a\u0010\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0015*\u00020\u0002\u001a\n\u0010\u0016\u001a\u00020\u000e*\u00020\u0002\u001a\u0017\u0010\u0016\u001a\u00020\u000e*\u00020\u00132\b\b\u0002\u0010\u0017\u001a\u00020\u0018H\u0087\b\u001a\r\u0010\u0019\u001a\u00020\u001a*\u00020\u000eH\u0087\b\u001a8\u0010\u001b\u001a\u0002H\u001c\"\u0004\b\u0000\u0010\u001c*\u00020\u00022\u0018\u0010\u001d\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u0010\u0012\u0004\u0012\u0002H\u001c0\rH\u0086\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0002\u0010\u001f\u0082\u0002\u000f\n\u0006\b\u0011(\u001e0\u0001\n\u0005\b\u009920\u0001¨\u0006 "}, d2 = {"buffered", "Ljava/io/BufferedReader;", "Ljava/io/Reader;", "bufferSize", "", "Ljava/io/BufferedWriter;", "Ljava/io/Writer;", "copyTo", "", "out", "forEachLine", "", "action", "Lkotlin/Function1;", "", "lineSequence", "Lkotlin/sequences/Sequence;", "readBytes", "", "Ljava/net/URL;", "readLines", "", "readText", io.fabric.sdk.android.services.network.HttpRequest.PARAM_CHARSET, "Ljava/nio/charset/Charset;", "reader", "Ljava/io/StringReader;", "useLines", "T", "block", "Requires newer compiler version to be inlined correctly.", "(Ljava/io/Reader;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "kotlin-stdlib"}, k = 2, mv = {1, 5, 1})
public final class TextStreamsKt {
    private static final java.io.BufferedReader buffered(java.io.Reader reader, int i) {
        return reader instanceof java.io.BufferedReader ? (java.io.BufferedReader) reader : new java.io.BufferedReader(reader, i);
    }

    static /* synthetic */ java.io.BufferedReader buffered$default(java.io.Reader reader, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = 8192;
        }
        return reader instanceof java.io.BufferedReader ? (java.io.BufferedReader) reader : new java.io.BufferedReader(reader, i);
    }

    private static final java.io.BufferedWriter buffered(java.io.Writer writer, int i) {
        return writer instanceof java.io.BufferedWriter ? (java.io.BufferedWriter) writer : new java.io.BufferedWriter(writer, i);
    }

    static /* synthetic */ java.io.BufferedWriter buffered$default(java.io.Writer writer, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = 8192;
        }
        return writer instanceof java.io.BufferedWriter ? (java.io.BufferedWriter) writer : new java.io.BufferedWriter(writer, i);
    }

    public static final java.util.List<java.lang.String> readLines(java.io.Reader readLines) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(readLines, "$this$readLines");
        final java.util.ArrayList arrayList = new java.util.ArrayList();
        forEachLine(readLines, new kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit>() { // from class: kotlin.io.TextStreamsKt.readLines.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.String str) {
                invoke2(str);
                return kotlin.Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(java.lang.String it) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                arrayList.add(it);
            }
        });
        return arrayList;
    }

    public static final <T> T useLines(java.io.Reader useLines, kotlin.jvm.functions.Function1<? super kotlin.sequences.Sequence<java.lang.String>, ? extends T> block) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(useLines, "$this$useLines");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        java.io.BufferedReader bufferedReader = useLines instanceof java.io.BufferedReader ? (java.io.BufferedReader) useLines : new java.io.BufferedReader(useLines, 8192);
        java.lang.Throwable th = (java.lang.Throwable) null;
        try {
            T tInvoke = block.invoke(lineSequence(bufferedReader));
            kotlin.jvm.internal.InlineMarker.finallyStart(1);
            if (kotlin.internal.PlatformImplementationsKt.apiVersionIsAtLeast(1, 1, 0)) {
                kotlin.io.CloseableKt.closeFinally(bufferedReader, th);
            } else {
                bufferedReader.close();
            }
            kotlin.jvm.internal.InlineMarker.finallyEnd(1);
            return tInvoke;
        } catch (java.lang.Throwable th2) {
            try {
                throw th2;
            } catch (java.lang.Throwable th3) {
                kotlin.jvm.internal.InlineMarker.finallyStart(1);
                if (kotlin.internal.PlatformImplementationsKt.apiVersionIsAtLeast(1, 1, 0)) {
                    kotlin.io.CloseableKt.closeFinally(bufferedReader, th2);
                } else {
                    try {
                        bufferedReader.close();
                    } catch (java.lang.Throwable unused) {
                    }
                }
                kotlin.jvm.internal.InlineMarker.finallyEnd(1);
                throw th3;
            }
        }
    }

    private static final java.io.StringReader reader(java.lang.String str) {
        return new java.io.StringReader(str);
    }

    public static final kotlin.sequences.Sequence<java.lang.String> lineSequence(java.io.BufferedReader lineSequence) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lineSequence, "$this$lineSequence");
        return kotlin.sequences.SequencesKt.constrainOnce(new kotlin.io.LinesSequence(lineSequence));
    }

    public static final java.lang.String readText(java.io.Reader readText) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(readText, "$this$readText");
        java.io.StringWriter stringWriter = new java.io.StringWriter();
        copyTo$default(readText, stringWriter, 0, 2, null);
        java.lang.String string = stringWriter.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "buffer.toString()");
        return string;
    }

    public static /* synthetic */ long copyTo$default(java.io.Reader reader, java.io.Writer writer, int i, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = 8192;
        }
        return copyTo(reader, writer, i);
    }

    public static final long copyTo(java.io.Reader copyTo, java.io.Writer out, int i) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(copyTo, "$this$copyTo");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(out, "out");
        char[] cArr = new char[i];
        int i2 = copyTo.read(cArr);
        long j = 0;
        while (i2 >= 0) {
            out.write(cArr, 0, i2);
            j += (long) i2;
            i2 = copyTo.read(cArr);
        }
        return j;
    }

    private static final java.lang.String readText(java.net.URL url, java.nio.charset.Charset charset) {
        return new java.lang.String(readBytes(url), charset);
    }

    static /* synthetic */ java.lang.String readText$default(java.net.URL url, java.nio.charset.Charset charset, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            charset = kotlin.text.Charsets.UTF_8;
        }
        return new java.lang.String(readBytes(url), charset);
    }

    public static final byte[] readBytes(java.net.URL readBytes) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(readBytes, "$this$readBytes");
        java.io.InputStream inputStreamOpenStream = readBytes.openStream();
        java.lang.Throwable th = (java.lang.Throwable) null;
        try {
            java.io.InputStream it = inputStreamOpenStream;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(it, "it");
            byte[] bytes = kotlin.io.ByteStreamsKt.readBytes(it);
            kotlin.io.CloseableKt.closeFinally(inputStreamOpenStream, th);
            return bytes;
        } catch (java.lang.Throwable th2) {
            try {
                throw th2;
            } catch (java.lang.Throwable th3) {
                kotlin.io.CloseableKt.closeFinally(inputStreamOpenStream, th2);
                throw th3;
            }
        }
    }

    public static final void forEachLine(java.io.Reader forEachLine, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> action) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(forEachLine, "$this$forEachLine");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "action");
        java.io.BufferedReader bufferedReader = forEachLine instanceof java.io.BufferedReader ? (java.io.BufferedReader) forEachLine : new java.io.BufferedReader(forEachLine, 8192);
        java.lang.Throwable th = (java.lang.Throwable) null;
        try {
            java.util.Iterator<java.lang.String> it = lineSequence(bufferedReader).iterator();
            while (it.hasNext()) {
                action.invoke(it.next());
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            kotlin.io.CloseableKt.closeFinally(bufferedReader, th);
        } catch (java.lang.Throwable th2) {
            try {
                throw th2;
            } catch (java.lang.Throwable th3) {
                kotlin.io.CloseableKt.closeFinally(bufferedReader, th2);
                throw th3;
            }
        }
    }
}
