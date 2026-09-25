package com.google.android.play.core.splitinstall;

/* JADX INFO: loaded from: classes2.dex */
public class SplitInstallRequest {
    private final java.util.List<java.lang.String> a;
    private final java.util.List<java.util.Locale> b;

    public static class Builder {
        private final java.util.List<java.lang.String> a;
        private final java.util.List<java.util.Locale> b;

        private Builder() {
            this.a = new java.util.ArrayList();
            this.b = new java.util.ArrayList();
        }

        /* synthetic */ Builder(byte b) {
            this();
        }

        public com.google.android.play.core.splitinstall.SplitInstallRequest.Builder addLanguage(java.util.Locale locale) {
            this.b.add(locale);
            return this;
        }

        public com.google.android.play.core.splitinstall.SplitInstallRequest.Builder addModule(java.lang.String str) {
            this.a.add(str);
            return this;
        }

        public com.google.android.play.core.splitinstall.SplitInstallRequest build() {
            return new com.google.android.play.core.splitinstall.SplitInstallRequest(this, (byte) 0);
        }
    }

    private SplitInstallRequest(com.google.android.play.core.splitinstall.SplitInstallRequest.Builder builder) {
        this.a = new java.util.ArrayList(builder.a);
        this.b = new java.util.ArrayList(builder.b);
    }

    /* synthetic */ SplitInstallRequest(com.google.android.play.core.splitinstall.SplitInstallRequest.Builder builder, byte b) {
        this(builder);
    }

    public static com.google.android.play.core.splitinstall.SplitInstallRequest.Builder newBuilder() {
        return new com.google.android.play.core.splitinstall.SplitInstallRequest.Builder((byte) 0);
    }

    public java.util.List<java.util.Locale> getLanguages() {
        return this.b;
    }

    public java.util.List<java.lang.String> getModuleNames() {
        return this.a;
    }

    public java.lang.String toString() {
        return java.lang.String.format("SplitInstallRequest{modulesNames=%s,languages=%s}", this.a, this.b);
    }
}
