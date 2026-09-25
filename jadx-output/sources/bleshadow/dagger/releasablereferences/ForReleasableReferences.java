package bleshadow.dagger.releasablereferences;

/* JADX INFO: loaded from: classes.dex */
@bleshadow.javax.inject.Qualifier
@java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.METHOD})
@java.lang.annotation.Documented
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
public @interface ForReleasableReferences {
    java.lang.Class<? extends java.lang.annotation.Annotation> value();
}
