package com.google.android.play.core.tasks;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Task<ResultT> {
    public abstract com.google.android.play.core.tasks.Task<ResultT> addOnCompleteListener(com.google.android.play.core.tasks.OnCompleteListener<ResultT> onCompleteListener);

    public abstract com.google.android.play.core.tasks.Task<ResultT> addOnCompleteListener(java.util.concurrent.Executor executor, com.google.android.play.core.tasks.OnCompleteListener<ResultT> onCompleteListener);

    public abstract com.google.android.play.core.tasks.Task<ResultT> addOnFailureListener(com.google.android.play.core.tasks.OnFailureListener onFailureListener);

    public abstract com.google.android.play.core.tasks.Task<ResultT> addOnFailureListener(java.util.concurrent.Executor executor, com.google.android.play.core.tasks.OnFailureListener onFailureListener);

    public abstract com.google.android.play.core.tasks.Task<ResultT> addOnSuccessListener(com.google.android.play.core.tasks.OnSuccessListener<? super ResultT> onSuccessListener);

    public abstract com.google.android.play.core.tasks.Task<ResultT> addOnSuccessListener(java.util.concurrent.Executor executor, com.google.android.play.core.tasks.OnSuccessListener<? super ResultT> onSuccessListener);

    public abstract java.lang.Exception getException();

    public abstract ResultT getResult();

    public abstract <X extends java.lang.Throwable> ResultT getResult(java.lang.Class<X> cls) throws java.lang.Throwable;

    public abstract boolean isComplete();

    public abstract boolean isSuccessful();
}
