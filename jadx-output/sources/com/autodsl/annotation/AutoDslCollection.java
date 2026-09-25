package com.autodsl.annotation;

/* JADX INFO: compiled from: AutoDslCollection.kt */
/* JADX INFO: loaded from: classes.dex */
@java.lang.annotation.Target({java.lang.annotation.ElementType.PARAMETER})
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0016\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005R\u0013\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0006R\u000f\u0010\u0004\u001a\u00020\u0005¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/autodsl/annotation/AutoDslCollection;", "", "concreteType", "Lkotlin/reflect/KClass;", "inline", "", "()Ljava/lang/Class;", "()Z", "annotation"}, k = 1, mv = {1, 1, 13})
@kotlin.annotation.Target(allowedTargets = {kotlin.annotation.AnnotationTarget.VALUE_PARAMETER})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
@kotlin.annotation.Retention(kotlin.annotation.AnnotationRetention.SOURCE)
public @interface AutoDslCollection {
    java.lang.Class<?> concreteType();

    boolean inline() default false;
}
