package com.google.gson.stream;

/* JADX INFO: loaded from: classes2.dex */
public class JsonWriter implements java.io.Closeable, java.io.Flushable {
    private static final java.lang.String[] HTML_SAFE_REPLACEMENT_CHARS;
    private static final java.lang.String[] REPLACEMENT_CHARS = new java.lang.String[128];
    private java.lang.String deferredName;
    private boolean htmlSafe;
    private java.lang.String indent;
    private boolean lenient;
    private final java.io.Writer out;
    private java.lang.String separator;
    private boolean serializeNulls;
    private int[] stack = new int[32];
    private int stackSize = 0;

    static {
        for (int i = 0; i <= 31; i++) {
            REPLACEMENT_CHARS[i] = java.lang.String.format("\\u%04x", java.lang.Integer.valueOf(i));
        }
        java.lang.String[] strArr = REPLACEMENT_CHARS;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        java.lang.String[] strArr2 = (java.lang.String[]) strArr.clone();
        HTML_SAFE_REPLACEMENT_CHARS = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public JsonWriter(java.io.Writer writer) {
        push(6);
        this.separator = ":";
        this.serializeNulls = true;
        java.util.Objects.requireNonNull(writer, "out == null");
        this.out = writer;
    }

    public final void setIndent(java.lang.String str) {
        if (str.length() == 0) {
            this.indent = null;
            this.separator = ":";
        } else {
            this.indent = str;
            this.separator = ": ";
        }
    }

    public final void setLenient(boolean z) {
        this.lenient = z;
    }

    public boolean isLenient() {
        return this.lenient;
    }

    public final void setHtmlSafe(boolean z) {
        this.htmlSafe = z;
    }

    public final boolean isHtmlSafe() {
        return this.htmlSafe;
    }

    public final void setSerializeNulls(boolean z) {
        this.serializeNulls = z;
    }

    public final boolean getSerializeNulls() {
        return this.serializeNulls;
    }

    public com.google.gson.stream.JsonWriter beginArray() throws java.io.IOException {
        writeDeferredName();
        return open(1, "[");
    }

    public com.google.gson.stream.JsonWriter endArray() throws java.io.IOException {
        return close(1, 2, "]");
    }

    public com.google.gson.stream.JsonWriter beginObject() throws java.io.IOException {
        writeDeferredName();
        return open(3, "{");
    }

    public com.google.gson.stream.JsonWriter endObject() throws java.io.IOException {
        return close(3, 5, "}");
    }

    private com.google.gson.stream.JsonWriter open(int i, java.lang.String str) throws java.io.IOException {
        beforeValue();
        push(i);
        this.out.write(str);
        return this;
    }

    private com.google.gson.stream.JsonWriter close(int i, int i2, java.lang.String str) throws java.io.IOException {
        int iPeek = peek();
        if (iPeek != i2 && iPeek != i) {
            throw new java.lang.IllegalStateException("Nesting problem.");
        }
        if (this.deferredName != null) {
            throw new java.lang.IllegalStateException("Dangling name: " + this.deferredName);
        }
        this.stackSize--;
        if (iPeek == i2) {
            newline();
        }
        this.out.write(str);
        return this;
    }

    private void push(int i) {
        int i2 = this.stackSize;
        int[] iArr = this.stack;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[i2 * 2];
            java.lang.System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.stack = iArr2;
        }
        int[] iArr3 = this.stack;
        int i3 = this.stackSize;
        this.stackSize = i3 + 1;
        iArr3[i3] = i;
    }

    private int peek() {
        int i = this.stackSize;
        if (i == 0) {
            throw new java.lang.IllegalStateException("JsonWriter is closed.");
        }
        return this.stack[i - 1];
    }

    private void replaceTop(int i) {
        this.stack[this.stackSize - 1] = i;
    }

    public com.google.gson.stream.JsonWriter name(java.lang.String str) throws java.io.IOException {
        java.util.Objects.requireNonNull(str, "name == null");
        if (this.deferredName != null) {
            throw new java.lang.IllegalStateException();
        }
        if (this.stackSize == 0) {
            throw new java.lang.IllegalStateException("JsonWriter is closed.");
        }
        this.deferredName = str;
        return this;
    }

    private void writeDeferredName() throws java.io.IOException {
        if (this.deferredName != null) {
            beforeName();
            string(this.deferredName);
            this.deferredName = null;
        }
    }

    public com.google.gson.stream.JsonWriter value(java.lang.String str) throws java.io.IOException {
        if (str == null) {
            return nullValue();
        }
        writeDeferredName();
        beforeValue();
        string(str);
        return this;
    }

    public com.google.gson.stream.JsonWriter jsonValue(java.lang.String str) throws java.io.IOException {
        if (str == null) {
            return nullValue();
        }
        writeDeferredName();
        beforeValue();
        this.out.append((java.lang.CharSequence) str);
        return this;
    }

    public com.google.gson.stream.JsonWriter nullValue() throws java.io.IOException {
        if (this.deferredName != null) {
            if (this.serializeNulls) {
                writeDeferredName();
            } else {
                this.deferredName = null;
                return this;
            }
        }
        beforeValue();
        this.out.write("null");
        return this;
    }

    public com.google.gson.stream.JsonWriter value(boolean z) throws java.io.IOException {
        writeDeferredName();
        beforeValue();
        this.out.write(z ? "true" : "false");
        return this;
    }

    public com.google.gson.stream.JsonWriter value(java.lang.Boolean bool) throws java.io.IOException {
        if (bool == null) {
            return nullValue();
        }
        writeDeferredName();
        beforeValue();
        this.out.write(bool.booleanValue() ? "true" : "false");
        return this;
    }

    public com.google.gson.stream.JsonWriter value(double d) throws java.io.IOException {
        writeDeferredName();
        if (!this.lenient && (java.lang.Double.isNaN(d) || java.lang.Double.isInfinite(d))) {
            throw new java.lang.IllegalArgumentException("Numeric values must be finite, but was " + d);
        }
        beforeValue();
        this.out.append((java.lang.CharSequence) java.lang.Double.toString(d));
        return this;
    }

    public com.google.gson.stream.JsonWriter value(long j) throws java.io.IOException {
        writeDeferredName();
        beforeValue();
        this.out.write(java.lang.Long.toString(j));
        return this;
    }

    public com.google.gson.stream.JsonWriter value(java.lang.Number number) throws java.io.IOException {
        if (number == null) {
            return nullValue();
        }
        writeDeferredName();
        java.lang.String string = number.toString();
        if (!this.lenient && (string.equals("-Infinity") || string.equals("Infinity") || string.equals("NaN"))) {
            throw new java.lang.IllegalArgumentException("Numeric values must be finite, but was " + number);
        }
        beforeValue();
        this.out.append((java.lang.CharSequence) string);
        return this;
    }

    public void flush() throws java.io.IOException {
        if (this.stackSize == 0) {
            throw new java.lang.IllegalStateException("JsonWriter is closed.");
        }
        this.out.flush();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
        this.out.close();
        int i = this.stackSize;
        if (i > 1 || (i == 1 && this.stack[i - 1] != 7)) {
            throw new java.io.IOException("Incomplete document");
        }
        this.stackSize = 0;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0034  */
    private void string(java.lang.String str) throws java.io.IOException {
        java.lang.String str2;
        java.lang.String[] strArr = this.htmlSafe ? HTML_SAFE_REPLACEMENT_CHARS : REPLACEMENT_CHARS;
        this.out.write("\"");
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt < 128) {
                str2 = strArr[cCharAt];
                if (str2 != null) {
                    if (i < i2) {
                        this.out.write(str, i, i2 - i);
                    }
                    this.out.write(str2);
                    i = i2 + 1;
                }
            } else {
                if (cCharAt == 8232) {
                    str2 = "\\u2028";
                } else if (cCharAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i < i2) {
                    this.out.write(str, i, i2 - i);
                }
                this.out.write(str2);
                i = i2 + 1;
            }
        }
        if (i < length) {
            this.out.write(str, i, length - i);
        }
        this.out.write("\"");
    }

    private void newline() throws java.io.IOException {
        if (this.indent == null) {
            return;
        }
        this.out.write("\n");
        int i = this.stackSize;
        for (int i2 = 1; i2 < i; i2++) {
            this.out.write(this.indent);
        }
    }

    private void beforeName() throws java.io.IOException {
        int iPeek = peek();
        if (iPeek == 5) {
            this.out.write(44);
        } else if (iPeek != 3) {
            throw new java.lang.IllegalStateException("Nesting problem.");
        }
        newline();
        replaceTop(4);
    }

    private void beforeValue() throws java.io.IOException {
        int iPeek = peek();
        if (iPeek == 1) {
            replaceTop(2);
            newline();
            return;
        }
        if (iPeek == 2) {
            this.out.append(',');
            newline();
        } else {
            if (iPeek != 4) {
                if (iPeek != 6) {
                    if (iPeek == 7) {
                        if (!this.lenient) {
                            throw new java.lang.IllegalStateException("JSON must have only one top-level value.");
                        }
                    } else {
                        throw new java.lang.IllegalStateException("Nesting problem.");
                    }
                }
                replaceTop(7);
                return;
            }
            this.out.append((java.lang.CharSequence) this.separator);
            replaceTop(5);
        }
    }
}
