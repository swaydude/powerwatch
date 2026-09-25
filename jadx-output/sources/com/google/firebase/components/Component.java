package com.google.firebase.components;

/* JADX INFO: compiled from: com.google.firebase:firebase-components@@16.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class Component<T> {
    private final java.util.Set<com.google.firebase.components.Dependency> dependencies;
    private final com.google.firebase.components.ComponentFactory<T> factory;
    private final int instantiation;
    private final java.util.Set<java.lang.Class<? super T>> providedInterfaces;
    private final java.util.Set<java.lang.Class<?>> publishedEvents;
    private final int type;

    static /* synthetic */ java.lang.Object lambda$intoSet$2(java.lang.Object obj, com.google.firebase.components.ComponentContainer componentContainer) {
        return obj;
    }

    static /* synthetic */ java.lang.Object lambda$of$0(java.lang.Object obj, com.google.firebase.components.ComponentContainer componentContainer) {
        return obj;
    }

    static /* synthetic */ java.lang.Object lambda$of$1(java.lang.Object obj, com.google.firebase.components.ComponentContainer componentContainer) {
        return obj;
    }

    private Component(java.util.Set<java.lang.Class<? super T>> set, java.util.Set<com.google.firebase.components.Dependency> set2, int i, int i2, com.google.firebase.components.ComponentFactory<T> componentFactory, java.util.Set<java.lang.Class<?>> set3) {
        this.providedInterfaces = java.util.Collections.unmodifiableSet(set);
        this.dependencies = java.util.Collections.unmodifiableSet(set2);
        this.instantiation = i;
        this.type = i2;
        this.factory = componentFactory;
        this.publishedEvents = java.util.Collections.unmodifiableSet(set3);
    }

    public java.util.Set<java.lang.Class<? super T>> getProvidedInterfaces() {
        return this.providedInterfaces;
    }

    public java.util.Set<com.google.firebase.components.Dependency> getDependencies() {
        return this.dependencies;
    }

    public com.google.firebase.components.ComponentFactory<T> getFactory() {
        return this.factory;
    }

    public java.util.Set<java.lang.Class<?>> getPublishedEvents() {
        return this.publishedEvents;
    }

    public boolean isLazy() {
        return this.instantiation == 0;
    }

    public boolean isAlwaysEager() {
        return this.instantiation == 1;
    }

    public boolean isEagerInDefaultApp() {
        return this.instantiation == 2;
    }

    public boolean isValue() {
        return this.type == 0;
    }

    public java.lang.String toString() {
        return "Component<" + java.util.Arrays.toString(this.providedInterfaces.toArray()) + ">{" + this.instantiation + ", type=" + this.type + ", deps=" + java.util.Arrays.toString(this.dependencies.toArray()) + "}";
    }

    public static <T> com.google.firebase.components.Component.Builder<T> builder(java.lang.Class<T> cls) {
        return new com.google.firebase.components.Component.Builder<>(cls, new java.lang.Class[0]);
    }

    @java.lang.SafeVarargs
    public static <T> com.google.firebase.components.Component.Builder<T> builder(java.lang.Class<T> cls, java.lang.Class<? super T>... clsArr) {
        return new com.google.firebase.components.Component.Builder<>(cls, clsArr);
    }

    @java.lang.Deprecated
    public static <T> com.google.firebase.components.Component<T> of(java.lang.Class<T> cls, T t) {
        return builder(cls).factory(com.google.firebase.components.Component$$Lambda$1.lambdaFactory$(t)).build();
    }

    @java.lang.SafeVarargs
    public static <T> com.google.firebase.components.Component<T> of(T t, java.lang.Class<T> cls, java.lang.Class<? super T>... clsArr) {
        return builder(cls, clsArr).factory(com.google.firebase.components.Component$$Lambda$2.lambdaFactory$(t)).build();
    }

    public static <T> com.google.firebase.components.Component.Builder<T> intoSetBuilder(java.lang.Class<T> cls) {
        return builder(cls).intoSet();
    }

    public static <T> com.google.firebase.components.Component<T> intoSet(T t, java.lang.Class<T> cls) {
        return intoSetBuilder(cls).factory(com.google.firebase.components.Component$$Lambda$3.lambdaFactory$(t)).build();
    }

    /* JADX INFO: compiled from: com.google.firebase:firebase-components@@16.0.0 */
    public static class Builder<T> {
        private final java.util.Set<com.google.firebase.components.Dependency> dependencies;
        private com.google.firebase.components.ComponentFactory<T> factory;
        private int instantiation;
        private final java.util.Set<java.lang.Class<? super T>> providedInterfaces;
        private java.util.Set<java.lang.Class<?>> publishedEvents;
        private int type;

        @java.lang.SafeVarargs
        private Builder(java.lang.Class<T> cls, java.lang.Class<? super T>... clsArr) {
            java.util.HashSet hashSet = new java.util.HashSet();
            this.providedInterfaces = hashSet;
            this.dependencies = new java.util.HashSet();
            this.instantiation = 0;
            this.type = 0;
            this.publishedEvents = new java.util.HashSet();
            com.google.firebase.components.Preconditions.checkNotNull(cls, "Null interface");
            hashSet.add(cls);
            for (java.lang.Class<? super T> cls2 : clsArr) {
                com.google.firebase.components.Preconditions.checkNotNull(cls2, "Null interface");
            }
            java.util.Collections.addAll(this.providedInterfaces, clsArr);
        }

        public com.google.firebase.components.Component.Builder<T> add(com.google.firebase.components.Dependency dependency) {
            com.google.firebase.components.Preconditions.checkNotNull(dependency, "Null dependency");
            validateInterface(dependency.getInterface());
            this.dependencies.add(dependency);
            return this;
        }

        public com.google.firebase.components.Component.Builder<T> alwaysEager() {
            return setInstantiation(1);
        }

        public com.google.firebase.components.Component.Builder<T> eagerInDefaultApp() {
            return setInstantiation(2);
        }

        public com.google.firebase.components.Component.Builder<T> publishes(java.lang.Class<?> cls) {
            this.publishedEvents.add(cls);
            return this;
        }

        private com.google.firebase.components.Component.Builder<T> setInstantiation(int i) {
            com.google.firebase.components.Preconditions.checkState(this.instantiation == 0, "Instantiation type has already been set.");
            this.instantiation = i;
            return this;
        }

        private void validateInterface(java.lang.Class<?> cls) {
            com.google.firebase.components.Preconditions.checkArgument(!this.providedInterfaces.contains(cls), "Components are not allowed to depend on interfaces they themselves provide.");
        }

        public com.google.firebase.components.Component.Builder<T> factory(com.google.firebase.components.ComponentFactory<T> componentFactory) {
            this.factory = (com.google.firebase.components.ComponentFactory) com.google.firebase.components.Preconditions.checkNotNull(componentFactory, "Null factory");
            return this;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public com.google.firebase.components.Component.Builder<T> intoSet() {
            this.type = 1;
            return this;
        }

        public com.google.firebase.components.Component<T> build() {
            com.google.firebase.components.Preconditions.checkState(this.factory != null, "Missing required property: factory.");
            return new com.google.firebase.components.Component<>(new java.util.HashSet(this.providedInterfaces), new java.util.HashSet(this.dependencies), this.instantiation, this.type, this.factory, this.publishedEvents);
        }
    }
}
