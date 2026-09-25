package com.google.android.play.core.install;

/* JADX INFO: loaded from: classes2.dex */
public class InstallException extends com.google.android.play.core.tasks.j {
    private final int a;

    public InstallException(int i) {
        super(java.lang.String.format("Install Error(%d): %s", java.lang.Integer.valueOf(i), com.google.android.play.core.install.model.a.a(i)));
        if (i == 0) {
            throw new java.lang.IllegalArgumentException("errorCode should not be 0.");
        }
        this.a = i;
    }

    @Override // com.google.android.play.core.tasks.j
    public int getErrorCode() {
        return this.a;
    }
}
