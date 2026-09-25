package com.google.firebase.installations;

/* JADX INFO: loaded from: classes2.dex */
interface StateListener {
    boolean onException(com.google.firebase.installations.local.PersistedInstallationEntry persistedInstallationEntry, java.lang.Exception exc);

    boolean onStateReached(com.google.firebase.installations.local.PersistedInstallationEntry persistedInstallationEntry);
}
