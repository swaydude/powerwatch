package kotlinx.coroutines.channels;

/* JADX INFO: compiled from: Channel.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u001a\u001c\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Channel", "Lkotlinx/coroutines/channels/Channel;", "E", "capacity", "", "kotlinx-coroutines-core"}, k = 2, mv = {1, 1, 13})
public final class ChannelKt {
    public static /* synthetic */ kotlinx.coroutines.channels.Channel Channel$default(int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return Channel(i);
    }

    public static final <E> kotlinx.coroutines.channels.Channel<E> Channel(int i) {
        if (i == -1) {
            return new kotlinx.coroutines.channels.ConflatedChannel();
        }
        if (i == 0) {
            return new kotlinx.coroutines.channels.RendezvousChannel();
        }
        if (i == Integer.MAX_VALUE) {
            return new kotlinx.coroutines.channels.LinkedListChannel();
        }
        return new kotlinx.coroutines.channels.ArrayChannel(i);
    }
}
