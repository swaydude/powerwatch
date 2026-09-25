package bleshadow.dagger.internal;

/* JADX INFO: loaded from: classes.dex */
public final class MembersInjectors {
    public static <T> bleshadow.dagger.MembersInjector<T> noOp() {
        return bleshadow.dagger.internal.MembersInjectors.NoOpMembersInjector.INSTANCE;
    }

    private enum NoOpMembersInjector implements bleshadow.dagger.MembersInjector<java.lang.Object> {
        INSTANCE;

        @Override // bleshadow.dagger.MembersInjector
        public void injectMembers(java.lang.Object instance) {
            bleshadow.dagger.internal.Preconditions.checkNotNull(instance, "Cannot inject members into a null reference");
        }
    }

    private MembersInjectors() {
    }
}
