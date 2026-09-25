package com.google.firebase.components;

/* JADX INFO: compiled from: com.google.firebase:firebase-components@@16.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class RestrictedComponentContainer extends com.google.firebase.components.AbstractComponentContainer {
    private final java.util.Set<java.lang.Class<?>> allowedDirectInterfaces;
    private final java.util.Set<java.lang.Class<?>> allowedProviderInterfaces;
    private final java.util.Set<java.lang.Class<?>> allowedPublishedEvents;
    private final java.util.Set<java.lang.Class<?>> allowedSetDirectInterfaces;
    private final java.util.Set<java.lang.Class<?>> allowedSetProviderInterfaces;
    private final com.google.firebase.components.ComponentContainer delegateContainer;

    RestrictedComponentContainer(com.google.firebase.components.Component<?> component, com.google.firebase.components.ComponentContainer componentContainer) {
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.HashSet hashSet2 = new java.util.HashSet();
        java.util.HashSet hashSet3 = new java.util.HashSet();
        java.util.HashSet hashSet4 = new java.util.HashSet();
        for (com.google.firebase.components.Dependency dependency : component.getDependencies()) {
            if (dependency.isDirectInjection()) {
                if (dependency.isSet()) {
                    hashSet3.add(dependency.getInterface());
                } else {
                    hashSet.add(dependency.getInterface());
                }
            } else if (dependency.isSet()) {
                hashSet4.add(dependency.getInterface());
            } else {
                hashSet2.add(dependency.getInterface());
            }
        }
        if (!component.getPublishedEvents().isEmpty()) {
            hashSet.add(com.google.firebase.events.Publisher.class);
        }
        this.allowedDirectInterfaces = java.util.Collections.unmodifiableSet(hashSet);
        this.allowedProviderInterfaces = java.util.Collections.unmodifiableSet(hashSet2);
        this.allowedSetDirectInterfaces = java.util.Collections.unmodifiableSet(hashSet3);
        this.allowedSetProviderInterfaces = java.util.Collections.unmodifiableSet(hashSet4);
        this.allowedPublishedEvents = component.getPublishedEvents();
        this.delegateContainer = componentContainer;
    }

    @Override // com.google.firebase.components.AbstractComponentContainer, com.google.firebase.components.ComponentContainer
    public <T> T get(java.lang.Class<T> cls) {
        if (!this.allowedDirectInterfaces.contains(cls)) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Attempting to request an undeclared dependency %s.", cls));
        }
        T t = (T) this.delegateContainer.get(cls);
        return !cls.equals(com.google.firebase.events.Publisher.class) ? t : (T) new com.google.firebase.components.RestrictedComponentContainer.RestrictedPublisher(this.allowedPublishedEvents, (com.google.firebase.events.Publisher) t);
    }

    @Override // com.google.firebase.components.ComponentContainer
    public <T> com.google.firebase.inject.Provider<T> getProvider(java.lang.Class<T> cls) {
        if (!this.allowedProviderInterfaces.contains(cls)) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Attempting to request an undeclared dependency Provider<%s>.", cls));
        }
        return this.delegateContainer.getProvider(cls);
    }

    @Override // com.google.firebase.components.ComponentContainer
    public <T> com.google.firebase.inject.Provider<java.util.Set<T>> setOfProvider(java.lang.Class<T> cls) {
        if (!this.allowedSetProviderInterfaces.contains(cls)) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", cls));
        }
        return this.delegateContainer.setOfProvider(cls);
    }

    @Override // com.google.firebase.components.AbstractComponentContainer, com.google.firebase.components.ComponentContainer
    public <T> java.util.Set<T> setOf(java.lang.Class<T> cls) {
        if (!this.allowedSetDirectInterfaces.contains(cls)) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Attempting to request an undeclared dependency Set<%s>.", cls));
        }
        return this.delegateContainer.setOf(cls);
    }

    /* JADX INFO: compiled from: com.google.firebase:firebase-components@@16.0.0 */
    private static class RestrictedPublisher implements com.google.firebase.events.Publisher {
        private final java.util.Set<java.lang.Class<?>> allowedPublishedEvents;
        private final com.google.firebase.events.Publisher delegate;

        public RestrictedPublisher(java.util.Set<java.lang.Class<?>> set, com.google.firebase.events.Publisher publisher) {
            this.allowedPublishedEvents = set;
            this.delegate = publisher;
        }

        @Override // com.google.firebase.events.Publisher
        public void publish(com.google.firebase.events.Event<?> event) {
            if (!this.allowedPublishedEvents.contains(event.getType())) {
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Attempting to publish an undeclared event %s.", event));
            }
            this.delegate.publish(event);
        }
    }
}
