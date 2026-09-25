package kotlin.io;

/* JADX INFO: compiled from: FileReadWrite.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000z\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u001c\u0010\u0005\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t\u001a!\u0010\n\u001a\u00020\u000b*\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\rH\u0087\b\u001a!\u0010\u000e\u001a\u00020\u000f*\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\rH\u0087\b\u001aB\u0010\u0010\u001a\u00020\u0001*\u00020\u000226\u0010\u0011\u001a2\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u00010\u0012\u001aJ\u0010\u0010\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0017\u001a\u00020\r26\u0010\u0011\u001a2\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u00010\u0012\u001a7\u0010\u0018\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\t2!\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\u00010\u0019\u001a\r\u0010\u001b\u001a\u00020\u001c*\u00020\u0002H\u0087\b\u001a\r\u0010\u001d\u001a\u00020\u001e*\u00020\u0002H\u0087\b\u001a\u0017\u0010\u001f\u001a\u00020 *\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\tH\u0087\b\u001a\n\u0010!\u001a\u00020\u0004*\u00020\u0002\u001a\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00070#*\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\t\u001a\u0014\u0010$\u001a\u00020\u0007*\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\t\u001a\u0017\u0010%\u001a\u00020&*\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\tH\u0087\b\u001aB\u0010'\u001a\u0002H(\"\u0004\b\u0000\u0010(*\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\t2\u0018\u0010)\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070*\u0012\u0004\u0012\u0002H(0\u0019H\u0086\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0002\u0010,\u001a\u0012\u0010-\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u001c\u0010.\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t\u001a\u0017\u0010/\u001a\u000200*\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\tH\u0087\b\u0082\u0002\u000f\n\u0006\b\u0011(+0\u0001\n\u0005\b\u009920\u0001¨\u00061"}, d2 = {"appendBytes", "", "Ljava/io/File;", "array", "", "appendText", "text", "", io.fabric.sdk.android.services.network.HttpRequest.PARAM_CHARSET, "Ljava/nio/charset/Charset;", "bufferedReader", "Ljava/io/BufferedReader;", "bufferSize", "", "bufferedWriter", "Ljava/io/BufferedWriter;", "forEachBlock", "action", "Lkotlin/Function2;", "Lkotlin/ParameterName;", com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME, "buffer", "bytesRead", "blockSize", "forEachLine", "Lkotlin/Function1;", "line", "inputStream", "Ljava/io/FileInputStream;", "outputStream", "Ljava/io/FileOutputStream;", "printWriter", "Ljava/io/PrintWriter;", "readBytes", "readLines", "", "readText", "reader", "Ljava/io/InputStreamReader;", "useLines", "T", "block", "Lkotlin/sequences/Sequence;", "Requires newer compiler version to be inlined correctly.", "(Ljava/io/File;Ljava/nio/charset/Charset;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "writeBytes", "writeText", "writer", "Ljava/io/OutputStreamWriter;", "kotlin-stdlib"}, k = 5, mv = {1, 5, 1}, xi = 1, xs = "kotlin/io/FilesKt")
class FilesKt__FileReadWriteKt extends kotlin.io.FilesKt__FilePathComponentsKt {
    static /* synthetic */ java.io.InputStreamReader reader$default(java.io.File file, java.nio.charset.Charset charset, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            charset = kotlin.text.Charsets.UTF_8;
        }
        return new java.io.InputStreamReader(new java.io.FileInputStream(file), charset);
    }

    private static final java.io.InputStreamReader reader(java.io.File file, java.nio.charset.Charset charset) {
        return new java.io.InputStreamReader(new java.io.FileInputStream(file), charset);
    }

    static /* synthetic */ java.io.BufferedReader bufferedReader$default(java.io.File file, java.nio.charset.Charset charset, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            charset = kotlin.text.Charsets.UTF_8;
        }
        if ((i2 & 2) != 0) {
            i = 8192;
        }
        java.io.Reader inputStreamReader = new java.io.InputStreamReader(new java.io.FileInputStream(file), charset);
        return inputStreamReader instanceof java.io.BufferedReader ? (java.io.BufferedReader) inputStreamReader : new java.io.BufferedReader(inputStreamReader, i);
    }

    private static final java.io.BufferedReader bufferedReader(java.io.File file, java.nio.charset.Charset charset, int i) {
        java.io.Reader inputStreamReader = new java.io.InputStreamReader(new java.io.FileInputStream(file), charset);
        return inputStreamReader instanceof java.io.BufferedReader ? (java.io.BufferedReader) inputStreamReader : new java.io.BufferedReader(inputStreamReader, i);
    }

    static /* synthetic */ java.io.OutputStreamWriter writer$default(java.io.File file, java.nio.charset.Charset charset, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            charset = kotlin.text.Charsets.UTF_8;
        }
        return new java.io.OutputStreamWriter(new java.io.FileOutputStream(file), charset);
    }

    private static final java.io.OutputStreamWriter writer(java.io.File file, java.nio.charset.Charset charset) {
        return new java.io.OutputStreamWriter(new java.io.FileOutputStream(file), charset);
    }

    static /* synthetic */ java.io.BufferedWriter bufferedWriter$default(java.io.File file, java.nio.charset.Charset charset, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            charset = kotlin.text.Charsets.UTF_8;
        }
        if ((i2 & 2) != 0) {
            i = 8192;
        }
        java.io.Writer outputStreamWriter = new java.io.OutputStreamWriter(new java.io.FileOutputStream(file), charset);
        return outputStreamWriter instanceof java.io.BufferedWriter ? (java.io.BufferedWriter) outputStreamWriter : new java.io.BufferedWriter(outputStreamWriter, i);
    }

    private static final java.io.BufferedWriter bufferedWriter(java.io.File file, java.nio.charset.Charset charset, int i) {
        java.io.Writer outputStreamWriter = new java.io.OutputStreamWriter(new java.io.FileOutputStream(file), charset);
        return outputStreamWriter instanceof java.io.BufferedWriter ? (java.io.BufferedWriter) outputStreamWriter : new java.io.BufferedWriter(outputStreamWriter, i);
    }

    static /* synthetic */ java.io.PrintWriter printWriter$default(java.io.File file, java.nio.charset.Charset charset, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            charset = kotlin.text.Charsets.UTF_8;
        }
        java.io.Writer outputStreamWriter = new java.io.OutputStreamWriter(new java.io.FileOutputStream(file), charset);
        return new java.io.PrintWriter(outputStreamWriter instanceof java.io.BufferedWriter ? (java.io.BufferedWriter) outputStreamWriter : new java.io.BufferedWriter(outputStreamWriter, 8192));
    }

    private static final java.io.PrintWriter printWriter(java.io.File file, java.nio.charset.Charset charset) {
        java.io.Writer outputStreamWriter = new java.io.OutputStreamWriter(new java.io.FileOutputStream(file), charset);
        return new java.io.PrintWriter(outputStreamWriter instanceof java.io.BufferedWriter ? (java.io.BufferedWriter) outputStreamWriter : new java.io.BufferedWriter(outputStreamWriter, 8192));
    }

    public static final byte[] readBytes(java.io.File readBytes) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(readBytes, "$this$readBytes");
        java.io.FileInputStream fileInputStream = new java.io.FileInputStream(readBytes);
        java.lang.Throwable th = (java.lang.Throwable) null;
        try {
            java.io.FileInputStream fileInputStream2 = fileInputStream;
            long length = readBytes.length();
            if (length > Integer.MAX_VALUE) {
                throw new java.lang.OutOfMemoryError("File " + readBytes + " is too big (" + length + " bytes) to fit in memory.");
            }
            int i = (int) length;
            byte[] bArrCopyInto = new byte[i];
            int i2 = i;
            int i3 = 0;
            while (i2 > 0) {
                int i4 = fileInputStream2.read(bArrCopyInto, i3, i2);
                if (i4 < 0) {
                    break;
                }
                i2 -= i4;
                i3 += i4;
            }
            if (i2 > 0) {
                bArrCopyInto = java.util.Arrays.copyOf(bArrCopyInto, i3);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bArrCopyInto, "java.util.Arrays.copyOf(this, newSize)");
            } else {
                int i5 = fileInputStream2.read();
                if (i5 != -1) {
                    kotlin.io.ExposingBufferByteArrayOutputStream exposingBufferByteArrayOutputStream = new kotlin.io.ExposingBufferByteArrayOutputStream(com.baidu.mapapi.UIMsg.k_event.V_WM_ROTATE);
                    exposingBufferByteArrayOutputStream.write(i5);
                    kotlin.io.ByteStreamsKt.copyTo$default(fileInputStream2, exposingBufferByteArrayOutputStream, 0, 2, null);
                    int size = exposingBufferByteArrayOutputStream.size() + i;
                    if (size < 0) {
                        throw new java.lang.OutOfMemoryError("File " + readBytes + " is too big to fit in memory.");
                    }
                    byte[] buffer = exposingBufferByteArrayOutputStream.getBuffer();
                    byte[] bArrCopyOf = java.util.Arrays.copyOf(bArrCopyInto, size);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "java.util.Arrays.copyOf(this, newSize)");
                    bArrCopyInto = kotlin.collections.ArraysKt.copyInto(buffer, bArrCopyOf, i, 0, exposingBufferByteArrayOutputStream.size());
                }
            }
            kotlin.io.CloseableKt.closeFinally(fileInputStream, th);
            return bArrCopyInto;
        } catch (java.lang.Throwable th2) {
            try {
                throw th2;
            } catch (java.lang.Throwable th3) {
                kotlin.io.CloseableKt.closeFinally(fileInputStream, th2);
                throw th3;
            }
        }
    }

    public static final void writeBytes(java.io.File writeBytes, byte[] array) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writeBytes, "$this$writeBytes");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(array, "array");
        java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(writeBytes);
        java.lang.Throwable th = (java.lang.Throwable) null;
        try {
            fileOutputStream.write(array);
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            kotlin.io.CloseableKt.closeFinally(fileOutputStream, th);
        } catch (java.lang.Throwable th2) {
            try {
                throw th2;
            } catch (java.lang.Throwable th3) {
                kotlin.io.CloseableKt.closeFinally(fileOutputStream, th2);
                throw th3;
            }
        }
    }

    public static final void appendBytes(java.io.File appendBytes, byte[] array) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appendBytes, "$this$appendBytes");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(array, "array");
        java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(appendBytes, true);
        java.lang.Throwable th = (java.lang.Throwable) null;
        try {
            fileOutputStream.write(array);
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            kotlin.io.CloseableKt.closeFinally(fileOutputStream, th);
        } catch (java.lang.Throwable th2) {
            try {
                throw th2;
            } catch (java.lang.Throwable th3) {
                kotlin.io.CloseableKt.closeFinally(fileOutputStream, th2);
                throw th3;
            }
        }
    }

    public static final java.lang.String readText(java.io.File readText, java.nio.charset.Charset charset) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(readText, "$this$readText");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charset, "charset");
        java.io.InputStreamReader inputStreamReader = new java.io.InputStreamReader(new java.io.FileInputStream(readText), charset);
        java.lang.Throwable th = (java.lang.Throwable) null;
        try {
            java.lang.String text = kotlin.io.TextStreamsKt.readText(inputStreamReader);
            kotlin.io.CloseableKt.closeFinally(inputStreamReader, th);
            return text;
        } catch (java.lang.Throwable th2) {
            try {
                throw th2;
            } catch (java.lang.Throwable th3) {
                kotlin.io.CloseableKt.closeFinally(inputStreamReader, th2);
                throw th3;
            }
        }
    }

    public static /* synthetic */ java.lang.String readText$default(java.io.File file, java.nio.charset.Charset charset, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            charset = kotlin.text.Charsets.UTF_8;
        }
        return kotlin.io.FilesKt.readText(file, charset);
    }

    public static final void writeText(java.io.File writeText, java.lang.String text, java.nio.charset.Charset charset) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writeText, "$this$writeText");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(text, "text");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charset, "charset");
        byte[] bytes = text.getBytes(charset);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
        kotlin.io.FilesKt.writeBytes(writeText, bytes);
    }

    public static /* synthetic */ void writeText$default(java.io.File file, java.lang.String str, java.nio.charset.Charset charset, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            charset = kotlin.text.Charsets.UTF_8;
        }
        kotlin.io.FilesKt.writeText(file, str, charset);
    }

    public static final void appendText(java.io.File appendText, java.lang.String text, java.nio.charset.Charset charset) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appendText, "$this$appendText");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(text, "text");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charset, "charset");
        byte[] bytes = text.getBytes(charset);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
        kotlin.io.FilesKt.appendBytes(appendText, bytes);
    }

    public static /* synthetic */ void appendText$default(java.io.File file, java.lang.String str, java.nio.charset.Charset charset, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            charset = kotlin.text.Charsets.UTF_8;
        }
        kotlin.io.FilesKt.appendText(file, str, charset);
    }

    public static final void forEachBlock(java.io.File forEachBlock, kotlin.jvm.functions.Function2<? super byte[], ? super java.lang.Integer, kotlin.Unit> action) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(forEachBlock, "$this$forEachBlock");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "action");
        kotlin.io.FilesKt.forEachBlock(forEachBlock, 4096, action);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [byte[], java.lang.Object] */
    public static final void forEachBlock(java.io.File forEachBlock, int i, kotlin.jvm.functions.Function2<? super byte[], ? super java.lang.Integer, kotlin.Unit> action) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(forEachBlock, "$this$forEachBlock");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "action");
        ?? r4 = new byte[kotlin.ranges.RangesKt.coerceAtLeast(i, 512)];
        java.io.FileInputStream fileInputStream = new java.io.FileInputStream(forEachBlock);
        java.lang.Throwable th = (java.lang.Throwable) null;
        try {
            java.io.FileInputStream fileInputStream2 = fileInputStream;
            while (true) {
                int i2 = fileInputStream2.read(r4);
                if (i2 > 0) {
                    action.invoke(r4, java.lang.Integer.valueOf(i2));
                } else {
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    kotlin.io.CloseableKt.closeFinally(fileInputStream, th);
                    return;
                }
            }
        } catch (java.lang.Throwable th2) {
            try {
                throw th2;
            } catch (java.lang.Throwable th3) {
                kotlin.io.CloseableKt.closeFinally(fileInputStream, th2);
                throw th3;
            }
        }
    }

    public static /* synthetic */ void forEachLine$default(java.io.File file, java.nio.charset.Charset charset, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            charset = kotlin.text.Charsets.UTF_8;
        }
        kotlin.io.FilesKt.forEachLine(file, charset, function1);
    }

    public static final void forEachLine(java.io.File forEachLine, java.nio.charset.Charset charset, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> action) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(forEachLine, "$this$forEachLine");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charset, "charset");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "action");
        kotlin.io.TextStreamsKt.forEachLine(new java.io.BufferedReader(new java.io.InputStreamReader(new java.io.FileInputStream(forEachLine), charset)), action);
    }

    private static final java.io.FileInputStream inputStream(java.io.File file) {
        return new java.io.FileInputStream(file);
    }

    private static final java.io.FileOutputStream outputStream(java.io.File file) {
        return new java.io.FileOutputStream(file);
    }

    public static /* synthetic */ java.util.List readLines$default(java.io.File file, java.nio.charset.Charset charset, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            charset = kotlin.text.Charsets.UTF_8;
        }
        return kotlin.io.FilesKt.readLines(file, charset);
    }

    public static final java.util.List<java.lang.String> readLines(java.io.File readLines, java.nio.charset.Charset charset) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(readLines, "$this$readLines");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charset, "charset");
        final java.util.ArrayList arrayList = new java.util.ArrayList();
        kotlin.io.FilesKt.forEachLine(readLines, charset, new kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit>() { // from class: kotlin.io.FilesKt__FileReadWriteKt.readLines.1
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

    public static /* synthetic */ java.lang.Object useLines$default(java.io.File useLines, java.nio.charset.Charset charset, kotlin.jvm.functions.Function1 block, int i, java.lang.Object obj) throws java.io.IOException {
        if ((i & 1) != 0) {
            charset = kotlin.text.Charsets.UTF_8;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(useLines, "$this$useLines");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charset, "charset");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        java.io.Reader inputStreamReader = new java.io.InputStreamReader(new java.io.FileInputStream(useLines), charset);
        java.io.BufferedReader bufferedReader = inputStreamReader instanceof java.io.BufferedReader ? (java.io.BufferedReader) inputStreamReader : new java.io.BufferedReader(inputStreamReader, 8192);
        java.lang.Throwable th = (java.lang.Throwable) null;
        try {
            java.lang.Object objInvoke = block.invoke(kotlin.io.TextStreamsKt.lineSequence(bufferedReader));
            kotlin.jvm.internal.InlineMarker.finallyStart(1);
            if (kotlin.internal.PlatformImplementationsKt.apiVersionIsAtLeast(1, 1, 0)) {
                kotlin.io.CloseableKt.closeFinally(bufferedReader, th);
            } else {
                bufferedReader.close();
            }
            kotlin.jvm.internal.InlineMarker.finallyEnd(1);
            return objInvoke;
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

    public static final <T> T useLines(java.io.File useLines, java.nio.charset.Charset charset, kotlin.jvm.functions.Function1<? super kotlin.sequences.Sequence<java.lang.String>, ? extends T> block) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(useLines, "$this$useLines");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charset, "charset");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        java.io.Reader inputStreamReader = new java.io.InputStreamReader(new java.io.FileInputStream(useLines), charset);
        java.io.BufferedReader bufferedReader = inputStreamReader instanceof java.io.BufferedReader ? (java.io.BufferedReader) inputStreamReader : new java.io.BufferedReader(inputStreamReader, 8192);
        java.lang.Throwable th = (java.lang.Throwable) null;
        try {
            T tInvoke = block.invoke(kotlin.io.TextStreamsKt.lineSequence(bufferedReader));
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
}
