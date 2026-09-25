package org.koin.core;

/* JADX INFO: compiled from: KoinComponent.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"Lorg/koin/core/KoinComponent;", "", "getKoin", "Lorg/koin/core/Koin;", "koin-core"}, k = 1, mv = {1, 1, 15})
public interface KoinComponent {
    org.koin.core.Koin getKoin();

    /* JADX INFO: compiled from: KoinComponent.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 15})
    public static final class DefaultImpls {
        public static org.koin.core.Koin getKoin(org.koin.core.KoinComponent koinComponent) {
            return org.koin.core.context.GlobalContext.get().getKoin();
        }
    }
}
