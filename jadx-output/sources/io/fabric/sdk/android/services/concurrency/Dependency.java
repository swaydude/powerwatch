package io.fabric.sdk.android.services.concurrency;

/* JADX INFO: loaded from: classes2.dex */
public interface Dependency<T> {
    void addDependency(T t);

    boolean areDependenciesMet();

    java.util.Collection<T> getDependencies();
}
