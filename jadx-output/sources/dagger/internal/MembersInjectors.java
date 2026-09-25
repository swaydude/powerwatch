package dagger.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class MembersInjectors {
    public static <T> dagger.MembersInjector<T> noOp() {
        return dagger.internal.MembersInjectors.NoOpMembersInjector.INSTANCE;
    }

    private enum NoOpMembersInjector implements dagger.MembersInjector<java.lang.Object> {
        INSTANCE;

        @Override // dagger.MembersInjector
        public void injectMembers(java.lang.Object obj) {
            dagger.internal.Preconditions.checkNotNull(obj, "Cannot inject members into a null reference");
        }
    }

    private MembersInjectors() {
    }
}
