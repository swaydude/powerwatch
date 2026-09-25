package kotlin.ranges;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: _Ranges.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000n\n\u0002\b\u0002\n\u0002\u0010\u000f\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\u0010\u0006\n\u0002\u0010\u0007\n\u0002\u0010\b\n\u0002\u0010\t\n\u0002\u0010\n\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\f\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\u001a'\u0010\u0000\u001a\u0002H\u0001\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002*\u0002H\u00012\u0006\u0010\u0003\u001a\u0002H\u0001¢\u0006\u0002\u0010\u0004\u001a\u0012\u0010\u0000\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0005\u001a\u0012\u0010\u0000\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0006\u001a\u0012\u0010\u0000\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0007\u001a\u0012\u0010\u0000\u001a\u00020\b*\u00020\b2\u0006\u0010\u0003\u001a\u00020\b\u001a\u0012\u0010\u0000\u001a\u00020\t*\u00020\t2\u0006\u0010\u0003\u001a\u00020\t\u001a\u0012\u0010\u0000\u001a\u00020\n*\u00020\n2\u0006\u0010\u0003\u001a\u00020\n\u001a'\u0010\u000b\u001a\u0002H\u0001\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002*\u0002H\u00012\u0006\u0010\f\u001a\u0002H\u0001¢\u0006\u0002\u0010\u0004\u001a\u0012\u0010\u000b\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\f\u001a\u00020\u0005\u001a\u0012\u0010\u000b\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006\u001a\u0012\u0010\u000b\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\f\u001a\u00020\u0007\u001a\u0012\u0010\u000b\u001a\u00020\b*\u00020\b2\u0006\u0010\f\u001a\u00020\b\u001a\u0012\u0010\u000b\u001a\u00020\t*\u00020\t2\u0006\u0010\f\u001a\u00020\t\u001a\u0012\u0010\u000b\u001a\u00020\n*\u00020\n2\u0006\u0010\f\u001a\u00020\n\u001a3\u0010\r\u001a\u0002H\u0001\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002*\u0002H\u00012\b\u0010\u0003\u001a\u0004\u0018\u0001H\u00012\b\u0010\f\u001a\u0004\u0018\u0001H\u0001¢\u0006\u0002\u0010\u000e\u001a/\u0010\r\u001a\u0002H\u0001\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002*\u0002H\u00012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0010H\u0007¢\u0006\u0002\u0010\u0011\u001a-\u0010\r\u001a\u0002H\u0001\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002*\u0002H\u00012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0012¢\u0006\u0002\u0010\u0013\u001a\u001a\u0010\r\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0005\u001a\u001a\u0010\r\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006\u001a\u001a\u0010\r\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0007\u001a\u001a\u0010\r\u001a\u00020\b*\u00020\b2\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b\u001a\u0018\u0010\r\u001a\u00020\b*\u00020\b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u0012\u001a\u001a\u0010\r\u001a\u00020\t*\u00020\t2\u0006\u0010\u0003\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t\u001a\u0018\u0010\r\u001a\u00020\t*\u00020\t2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\u0012\u001a\u001a\u0010\r\u001a\u00020\n*\u00020\n2\u0006\u0010\u0003\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n\u001a\u001c\u0010\u0014\u001a\u00020\u0015*\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0087\n¢\u0006\u0002\u0010\u0019\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00050\u00122\u0006\u0010\u001a\u001a\u00020\u0006H\u0087\u0002¢\u0006\u0002\b\u001b\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00050\u00122\u0006\u0010\u001a\u001a\u00020\u0007H\u0087\u0002¢\u0006\u0002\b\u001b\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00050\u00122\u0006\u0010\u001a\u001a\u00020\bH\u0087\u0002¢\u0006\u0002\b\u001b\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00050\u00122\u0006\u0010\u001a\u001a\u00020\tH\u0087\u0002¢\u0006\u0002\b\u001b\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00050\u00122\u0006\u0010\u001a\u001a\u00020\nH\u0087\u0002¢\u0006\u0002\b\u001b\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00060\u00122\u0006\u0010\u001a\u001a\u00020\u0005H\u0087\u0002¢\u0006\u0002\b\u001c\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00060\u00122\u0006\u0010\u001a\u001a\u00020\u0007H\u0087\u0002¢\u0006\u0002\b\u001c\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00060\u00122\u0006\u0010\u001a\u001a\u00020\bH\u0087\u0002¢\u0006\u0002\b\u001c\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00060\u00122\u0006\u0010\u001a\u001a\u00020\tH\u0087\u0002¢\u0006\u0002\b\u001c\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00060\u00122\u0006\u0010\u001a\u001a\u00020\nH\u0087\u0002¢\u0006\u0002\b\u001c\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00070\u00122\u0006\u0010\u001a\u001a\u00020\u0005H\u0087\u0002¢\u0006\u0002\b\u001d\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00070\u00122\u0006\u0010\u001a\u001a\u00020\u0006H\u0087\u0002¢\u0006\u0002\b\u001d\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00070\u00122\u0006\u0010\u001a\u001a\u00020\bH\u0087\u0002¢\u0006\u0002\b\u001d\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00070\u00122\u0006\u0010\u001a\u001a\u00020\tH\u0087\u0002¢\u0006\u0002\b\u001d\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00070\u00122\u0006\u0010\u001a\u001a\u00020\nH\u0087\u0002¢\u0006\u0002\b\u001d\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\b0\u00122\u0006\u0010\u001a\u001a\u00020\u0005H\u0087\u0002¢\u0006\u0002\b\u001e\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\b0\u00122\u0006\u0010\u001a\u001a\u00020\u0006H\u0087\u0002¢\u0006\u0002\b\u001e\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\b0\u00122\u0006\u0010\u001a\u001a\u00020\u0007H\u0087\u0002¢\u0006\u0002\b\u001e\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\b0\u00122\u0006\u0010\u001a\u001a\u00020\tH\u0087\u0002¢\u0006\u0002\b\u001e\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\b0\u00122\u0006\u0010\u001a\u001a\u00020\nH\u0087\u0002¢\u0006\u0002\b\u001e\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\t0\u00122\u0006\u0010\u001a\u001a\u00020\u0005H\u0087\u0002¢\u0006\u0002\b\u001f\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\t0\u00122\u0006\u0010\u001a\u001a\u00020\u0006H\u0087\u0002¢\u0006\u0002\b\u001f\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\t0\u00122\u0006\u0010\u001a\u001a\u00020\u0007H\u0087\u0002¢\u0006\u0002\b\u001f\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\t0\u00122\u0006\u0010\u001a\u001a\u00020\bH\u0087\u0002¢\u0006\u0002\b\u001f\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\t0\u00122\u0006\u0010\u001a\u001a\u00020\nH\u0087\u0002¢\u0006\u0002\b\u001f\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\n0\u00122\u0006\u0010\u001a\u001a\u00020\u0005H\u0087\u0002¢\u0006\u0002\b \u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\n0\u00122\u0006\u0010\u001a\u001a\u00020\u0006H\u0087\u0002¢\u0006\u0002\b \u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\n0\u00122\u0006\u0010\u001a\u001a\u00020\u0007H\u0087\u0002¢\u0006\u0002\b \u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\n0\u00122\u0006\u0010\u001a\u001a\u00020\bH\u0087\u0002¢\u0006\u0002\b \u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\n0\u00122\u0006\u0010\u001a\u001a\u00020\tH\u0087\u0002¢\u0006\u0002\b \u001a\u001c\u0010\u0014\u001a\u00020\u0015*\u00020!2\b\u0010\u0017\u001a\u0004\u0018\u00010\bH\u0087\n¢\u0006\u0002\u0010\"\u001a\u001c\u0010\u0014\u001a\u00020\u0015*\u00020#2\b\u0010\u0017\u001a\u0004\u0018\u00010\tH\u0087\n¢\u0006\u0002\u0010$\u001a\u0015\u0010%\u001a\u00020&*\u00020\u00052\u0006\u0010'\u001a\u00020\u0005H\u0086\u0004\u001a\u0015\u0010%\u001a\u00020&*\u00020\u00052\u0006\u0010'\u001a\u00020\bH\u0086\u0004\u001a\u0015\u0010%\u001a\u00020(*\u00020\u00052\u0006\u0010'\u001a\u00020\tH\u0086\u0004\u001a\u0015\u0010%\u001a\u00020&*\u00020\u00052\u0006\u0010'\u001a\u00020\nH\u0086\u0004\u001a\u0015\u0010%\u001a\u00020)*\u00020\u00182\u0006\u0010'\u001a\u00020\u0018H\u0086\u0004\u001a\u0015\u0010%\u001a\u00020&*\u00020\b2\u0006\u0010'\u001a\u00020\u0005H\u0086\u0004\u001a\u0015\u0010%\u001a\u00020&*\u00020\b2\u0006\u0010'\u001a\u00020\bH\u0086\u0004\u001a\u0015\u0010%\u001a\u00020(*\u00020\b2\u0006\u0010'\u001a\u00020\tH\u0086\u0004\u001a\u0015\u0010%\u001a\u00020&*\u00020\b2\u0006\u0010'\u001a\u00020\nH\u0086\u0004\u001a\u0015\u0010%\u001a\u00020(*\u00020\t2\u0006\u0010'\u001a\u00020\u0005H\u0086\u0004\u001a\u0015\u0010%\u001a\u00020(*\u00020\t2\u0006\u0010'\u001a\u00020\bH\u0086\u0004\u001a\u0015\u0010%\u001a\u00020(*\u00020\t2\u0006\u0010'\u001a\u00020\tH\u0086\u0004\u001a\u0015\u0010%\u001a\u00020(*\u00020\t2\u0006\u0010'\u001a\u00020\nH\u0086\u0004\u001a\u0015\u0010%\u001a\u00020&*\u00020\n2\u0006\u0010'\u001a\u00020\u0005H\u0086\u0004\u001a\u0015\u0010%\u001a\u00020&*\u00020\n2\u0006\u0010'\u001a\u00020\bH\u0086\u0004\u001a\u0015\u0010%\u001a\u00020(*\u00020\n2\u0006\u0010'\u001a\u00020\tH\u0086\u0004\u001a\u0015\u0010%\u001a\u00020&*\u00020\n2\u0006\u0010'\u001a\u00020\nH\u0086\u0004\u001a\r\u0010*\u001a\u00020\u0018*\u00020\u0016H\u0087\b\u001a\u0014\u0010*\u001a\u00020\u0018*\u00020\u00162\u0006\u0010*\u001a\u00020+H\u0007\u001a\r\u0010*\u001a\u00020\b*\u00020!H\u0087\b\u001a\u0014\u0010*\u001a\u00020\b*\u00020!2\u0006\u0010*\u001a\u00020+H\u0007\u001a\r\u0010*\u001a\u00020\t*\u00020#H\u0087\b\u001a\u0014\u0010*\u001a\u00020\t*\u00020#2\u0006\u0010*\u001a\u00020+H\u0007\u001a\u0014\u0010,\u001a\u0004\u0018\u00010\u0018*\u00020\u0016H\u0087\b¢\u0006\u0002\u0010-\u001a\u001b\u0010,\u001a\u0004\u0018\u00010\u0018*\u00020\u00162\u0006\u0010*\u001a\u00020+H\u0007¢\u0006\u0002\u0010.\u001a\u0014\u0010,\u001a\u0004\u0018\u00010\b*\u00020!H\u0087\b¢\u0006\u0002\u0010/\u001a\u001b\u0010,\u001a\u0004\u0018\u00010\b*\u00020!2\u0006\u0010*\u001a\u00020+H\u0007¢\u0006\u0002\u00100\u001a\u0014\u0010,\u001a\u0004\u0018\u00010\t*\u00020#H\u0087\b¢\u0006\u0002\u00101\u001a\u001b\u0010,\u001a\u0004\u0018\u00010\t*\u00020#2\u0006\u0010*\u001a\u00020+H\u0007¢\u0006\u0002\u00102\u001a\n\u00103\u001a\u00020)*\u00020)\u001a\n\u00103\u001a\u00020&*\u00020&\u001a\n\u00103\u001a\u00020(*\u00020(\u001a\u0015\u00104\u001a\u00020)*\u00020)2\u0006\u00104\u001a\u00020\bH\u0086\u0004\u001a\u0015\u00104\u001a\u00020&*\u00020&2\u0006\u00104\u001a\u00020\bH\u0086\u0004\u001a\u0015\u00104\u001a\u00020(*\u00020(2\u0006\u00104\u001a\u00020\tH\u0086\u0004\u001a\u0013\u00105\u001a\u0004\u0018\u00010\u0005*\u00020\u0006H\u0000¢\u0006\u0002\u00106\u001a\u0013\u00105\u001a\u0004\u0018\u00010\u0005*\u00020\u0007H\u0000¢\u0006\u0002\u00107\u001a\u0013\u00105\u001a\u0004\u0018\u00010\u0005*\u00020\bH\u0000¢\u0006\u0002\u00108\u001a\u0013\u00105\u001a\u0004\u0018\u00010\u0005*\u00020\tH\u0000¢\u0006\u0002\u00109\u001a\u0013\u00105\u001a\u0004\u0018\u00010\u0005*\u00020\nH\u0000¢\u0006\u0002\u0010:\u001a\u0013\u0010;\u001a\u0004\u0018\u00010\b*\u00020\u0006H\u0000¢\u0006\u0002\u0010<\u001a\u0013\u0010;\u001a\u0004\u0018\u00010\b*\u00020\u0007H\u0000¢\u0006\u0002\u0010=\u001a\u0013\u0010;\u001a\u0004\u0018\u00010\b*\u00020\tH\u0000¢\u0006\u0002\u0010>\u001a\u0013\u0010?\u001a\u0004\u0018\u00010\t*\u00020\u0006H\u0000¢\u0006\u0002\u0010@\u001a\u0013\u0010?\u001a\u0004\u0018\u00010\t*\u00020\u0007H\u0000¢\u0006\u0002\u0010A\u001a\u0013\u0010B\u001a\u0004\u0018\u00010\n*\u00020\u0006H\u0000¢\u0006\u0002\u0010C\u001a\u0013\u0010B\u001a\u0004\u0018\u00010\n*\u00020\u0007H\u0000¢\u0006\u0002\u0010D\u001a\u0013\u0010B\u001a\u0004\u0018\u00010\n*\u00020\bH\u0000¢\u0006\u0002\u0010E\u001a\u0013\u0010B\u001a\u0004\u0018\u00010\n*\u00020\tH\u0000¢\u0006\u0002\u0010F\u001a\u0015\u0010G\u001a\u00020!*\u00020\u00052\u0006\u0010'\u001a\u00020\u0005H\u0086\u0004\u001a\u0015\u0010G\u001a\u00020!*\u00020\u00052\u0006\u0010'\u001a\u00020\bH\u0086\u0004\u001a\u0015\u0010G\u001a\u00020#*\u00020\u00052\u0006\u0010'\u001a\u00020\tH\u0086\u0004\u001a\u0015\u0010G\u001a\u00020!*\u00020\u00052\u0006\u0010'\u001a\u00020\nH\u0086\u0004\u001a\u0015\u0010G\u001a\u00020\u0016*\u00020\u00182\u0006\u0010'\u001a\u00020\u0018H\u0086\u0004\u001a\u0015\u0010G\u001a\u00020!*\u00020\b2\u0006\u0010'\u001a\u00020\u0005H\u0086\u0004\u001a\u0015\u0010G\u001a\u00020!*\u00020\b2\u0006\u0010'\u001a\u00020\bH\u0086\u0004\u001a\u0015\u0010G\u001a\u00020#*\u00020\b2\u0006\u0010'\u001a\u00020\tH\u0086\u0004\u001a\u0015\u0010G\u001a\u00020!*\u00020\b2\u0006\u0010'\u001a\u00020\nH\u0086\u0004\u001a\u0015\u0010G\u001a\u00020#*\u00020\t2\u0006\u0010'\u001a\u00020\u0005H\u0086\u0004\u001a\u0015\u0010G\u001a\u00020#*\u00020\t2\u0006\u0010'\u001a\u00020\bH\u0086\u0004\u001a\u0015\u0010G\u001a\u00020#*\u00020\t2\u0006\u0010'\u001a\u00020\tH\u0086\u0004\u001a\u0015\u0010G\u001a\u00020#*\u00020\t2\u0006\u0010'\u001a\u00020\nH\u0086\u0004\u001a\u0015\u0010G\u001a\u00020!*\u00020\n2\u0006\u0010'\u001a\u00020\u0005H\u0086\u0004\u001a\u0015\u0010G\u001a\u00020!*\u00020\n2\u0006\u0010'\u001a\u00020\bH\u0086\u0004\u001a\u0015\u0010G\u001a\u00020#*\u00020\n2\u0006\u0010'\u001a\u00020\tH\u0086\u0004\u001a\u0015\u0010G\u001a\u00020!*\u00020\n2\u0006\u0010'\u001a\u00020\nH\u0086\u0004¨\u0006H"}, d2 = {"coerceAtLeast", "T", "", "minimumValue", "(Ljava/lang/Comparable;Ljava/lang/Comparable;)Ljava/lang/Comparable;", "", "", "", "", "", "", "coerceAtMost", "maximumValue", "coerceIn", "(Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/Comparable;)Ljava/lang/Comparable;", "range", "Lkotlin/ranges/ClosedFloatingPointRange;", "(Ljava/lang/Comparable;Lkotlin/ranges/ClosedFloatingPointRange;)Ljava/lang/Comparable;", "Lkotlin/ranges/ClosedRange;", "(Ljava/lang/Comparable;Lkotlin/ranges/ClosedRange;)Ljava/lang/Comparable;", "contains", "", "Lkotlin/ranges/CharRange;", "element", "", "(Lkotlin/ranges/CharRange;Ljava/lang/Character;)Z", "value", "byteRangeContains", "doubleRangeContains", "floatRangeContains", "intRangeContains", "longRangeContains", "shortRangeContains", "Lkotlin/ranges/IntRange;", "(Lkotlin/ranges/IntRange;Ljava/lang/Integer;)Z", "Lkotlin/ranges/LongRange;", "(Lkotlin/ranges/LongRange;Ljava/lang/Long;)Z", "downTo", "Lkotlin/ranges/IntProgression;", "to", "Lkotlin/ranges/LongProgression;", "Lkotlin/ranges/CharProgression;", "random", "Lkotlin/random/Random;", "randomOrNull", "(Lkotlin/ranges/CharRange;)Ljava/lang/Character;", "(Lkotlin/ranges/CharRange;Lkotlin/random/Random;)Ljava/lang/Character;", "(Lkotlin/ranges/IntRange;)Ljava/lang/Integer;", "(Lkotlin/ranges/IntRange;Lkotlin/random/Random;)Ljava/lang/Integer;", "(Lkotlin/ranges/LongRange;)Ljava/lang/Long;", "(Lkotlin/ranges/LongRange;Lkotlin/random/Random;)Ljava/lang/Long;", "reversed", "step", "toByteExactOrNull", "(D)Ljava/lang/Byte;", "(F)Ljava/lang/Byte;", "(I)Ljava/lang/Byte;", "(J)Ljava/lang/Byte;", "(S)Ljava/lang/Byte;", "toIntExactOrNull", "(D)Ljava/lang/Integer;", "(F)Ljava/lang/Integer;", "(J)Ljava/lang/Integer;", "toLongExactOrNull", "(D)Ljava/lang/Long;", "(F)Ljava/lang/Long;", "toShortExactOrNull", "(D)Ljava/lang/Short;", "(F)Ljava/lang/Short;", "(I)Ljava/lang/Short;", "(J)Ljava/lang/Short;", "until", "kotlin-stdlib"}, k = 5, mv = {1, 5, 1}, xi = 1, xs = "kotlin/ranges/RangesKt")
public class RangesKt___RangesKt extends kotlin.ranges.RangesKt__RangesKt {
    public static final byte coerceAtLeast(byte b, byte b2) {
        return b < b2 ? b2 : b;
    }

    public static final double coerceAtLeast(double d, double d2) {
        return d < d2 ? d2 : d;
    }

    public static final float coerceAtLeast(float f, float f2) {
        return f < f2 ? f2 : f;
    }

    public static final int coerceAtLeast(int i, int i2) {
        return i < i2 ? i2 : i;
    }

    public static final long coerceAtLeast(long j, long j2) {
        return j < j2 ? j2 : j;
    }

    public static final short coerceAtLeast(short s, short s2) {
        return s < s2 ? s2 : s;
    }

    public static final byte coerceAtMost(byte b, byte b2) {
        return b > b2 ? b2 : b;
    }

    public static final double coerceAtMost(double d, double d2) {
        return d > d2 ? d2 : d;
    }

    public static final float coerceAtMost(float f, float f2) {
        return f > f2 ? f2 : f;
    }

    public static final int coerceAtMost(int i, int i2) {
        return i > i2 ? i2 : i;
    }

    public static final long coerceAtMost(long j, long j2) {
        return j > j2 ? j2 : j;
    }

    public static final short coerceAtMost(short s, short s2) {
        return s > s2 ? s2 : s;
    }

    private static final int random(kotlin.ranges.IntRange intRange) {
        return kotlin.ranges.RangesKt.random(intRange, kotlin.random.Random.INSTANCE);
    }

    private static final long random(kotlin.ranges.LongRange longRange) {
        return kotlin.ranges.RangesKt.random(longRange, kotlin.random.Random.INSTANCE);
    }

    private static final char random(kotlin.ranges.CharRange charRange) {
        return kotlin.ranges.RangesKt.random(charRange, kotlin.random.Random.INSTANCE);
    }

    public static final int random(kotlin.ranges.IntRange random, kotlin.random.Random random2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(random, "$this$random");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(random2, "random");
        try {
            return kotlin.random.RandomKt.nextInt(random2, random);
        } catch (java.lang.IllegalArgumentException e) {
            throw new java.util.NoSuchElementException(e.getMessage());
        }
    }

    public static final long random(kotlin.ranges.LongRange random, kotlin.random.Random random2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(random, "$this$random");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(random2, "random");
        try {
            return kotlin.random.RandomKt.nextLong(random2, random);
        } catch (java.lang.IllegalArgumentException e) {
            throw new java.util.NoSuchElementException(e.getMessage());
        }
    }

    public static final char random(kotlin.ranges.CharRange random, kotlin.random.Random random2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(random, "$this$random");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(random2, "random");
        try {
            return (char) random2.nextInt(random.getFirst(), random.getLast() + 1);
        } catch (java.lang.IllegalArgumentException e) {
            throw new java.util.NoSuchElementException(e.getMessage());
        }
    }

    private static final java.lang.Integer randomOrNull(kotlin.ranges.IntRange intRange) {
        return kotlin.ranges.RangesKt.randomOrNull(intRange, kotlin.random.Random.INSTANCE);
    }

    private static final java.lang.Long randomOrNull(kotlin.ranges.LongRange longRange) {
        return kotlin.ranges.RangesKt.randomOrNull(longRange, kotlin.random.Random.INSTANCE);
    }

    private static final java.lang.Character randomOrNull(kotlin.ranges.CharRange charRange) {
        return kotlin.ranges.RangesKt.randomOrNull(charRange, kotlin.random.Random.INSTANCE);
    }

    public static final java.lang.Integer randomOrNull(kotlin.ranges.IntRange randomOrNull, kotlin.random.Random random) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(randomOrNull, "$this$randomOrNull");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(random, "random");
        if (randomOrNull.isEmpty()) {
            return null;
        }
        return java.lang.Integer.valueOf(kotlin.random.RandomKt.nextInt(random, randomOrNull));
    }

    public static final java.lang.Long randomOrNull(kotlin.ranges.LongRange randomOrNull, kotlin.random.Random random) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(randomOrNull, "$this$randomOrNull");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(random, "random");
        if (randomOrNull.isEmpty()) {
            return null;
        }
        return java.lang.Long.valueOf(kotlin.random.RandomKt.nextLong(random, randomOrNull));
    }

    public static final java.lang.Character randomOrNull(kotlin.ranges.CharRange randomOrNull, kotlin.random.Random random) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(randomOrNull, "$this$randomOrNull");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(random, "random");
        if (randomOrNull.isEmpty()) {
            return null;
        }
        return java.lang.Character.valueOf((char) random.nextInt(randomOrNull.getFirst(), randomOrNull.getLast() + 1));
    }

    private static final boolean contains(kotlin.ranges.IntRange contains, java.lang.Integer num) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contains, "$this$contains");
        return num != null && contains.contains(num.intValue());
    }

    private static final boolean contains(kotlin.ranges.LongRange contains, java.lang.Long l) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contains, "$this$contains");
        return l != null && contains.contains(l.longValue());
    }

    private static final boolean contains(kotlin.ranges.CharRange contains, java.lang.Character ch) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contains, "$this$contains");
        return ch != null && contains.contains(ch.charValue());
    }

    public static final boolean intRangeContains(kotlin.ranges.ClosedRange<java.lang.Integer> contains, byte b) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contains, "$this$contains");
        return contains.contains(java.lang.Integer.valueOf(b));
    }

    public static final boolean longRangeContains(kotlin.ranges.ClosedRange<java.lang.Long> contains, byte b) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contains, "$this$contains");
        return contains.contains(java.lang.Long.valueOf(b));
    }

    public static final boolean shortRangeContains(kotlin.ranges.ClosedRange<java.lang.Short> contains, byte b) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contains, "$this$contains");
        return contains.contains(java.lang.Short.valueOf(b));
    }

    @kotlin.Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean doubleRangeContains(kotlin.ranges.ClosedRange<java.lang.Double> contains, byte b) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contains, "$this$contains");
        return contains.contains(java.lang.Double.valueOf(b));
    }

    @kotlin.Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean floatRangeContains(kotlin.ranges.ClosedRange<java.lang.Float> contains, byte b) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contains, "$this$contains");
        return contains.contains(java.lang.Float.valueOf(b));
    }

    @kotlin.Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean intRangeContains(kotlin.ranges.ClosedRange<java.lang.Integer> contains, double d) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contains, "$this$contains");
        java.lang.Integer intExactOrNull = kotlin.ranges.RangesKt.toIntExactOrNull(d);
        if (intExactOrNull != null) {
            return contains.contains(intExactOrNull);
        }
        return false;
    }

    @kotlin.Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean longRangeContains(kotlin.ranges.ClosedRange<java.lang.Long> contains, double d) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contains, "$this$contains");
        java.lang.Long longExactOrNull = kotlin.ranges.RangesKt.toLongExactOrNull(d);
        if (longExactOrNull != null) {
            return contains.contains(longExactOrNull);
        }
        return false;
    }

    @kotlin.Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean byteRangeContains(kotlin.ranges.ClosedRange<java.lang.Byte> contains, double d) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contains, "$this$contains");
        java.lang.Byte byteExactOrNull = kotlin.ranges.RangesKt.toByteExactOrNull(d);
        if (byteExactOrNull != null) {
            return contains.contains(byteExactOrNull);
        }
        return false;
    }

    @kotlin.Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean shortRangeContains(kotlin.ranges.ClosedRange<java.lang.Short> contains, double d) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contains, "$this$contains");
        java.lang.Short shortExactOrNull = kotlin.ranges.RangesKt.toShortExactOrNull(d);
        if (shortExactOrNull != null) {
            return contains.contains(shortExactOrNull);
        }
        return false;
    }

    public static final boolean floatRangeContains(kotlin.ranges.ClosedRange<java.lang.Float> contains, double d) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contains, "$this$contains");
        return contains.contains(java.lang.Float.valueOf((float) d));
    }

    @kotlin.Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean intRangeContains(kotlin.ranges.ClosedRange<java.lang.Integer> contains, float f) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contains, "$this$contains");
        java.lang.Integer intExactOrNull = kotlin.ranges.RangesKt.toIntExactOrNull(f);
        if (intExactOrNull != null) {
            return contains.contains(intExactOrNull);
        }
        return false;
    }

    @kotlin.Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean longRangeContains(kotlin.ranges.ClosedRange<java.lang.Long> contains, float f) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contains, "$this$contains");
        java.lang.Long longExactOrNull = kotlin.ranges.RangesKt.toLongExactOrNull(f);
        if (longExactOrNull != null) {
            return contains.contains(longExactOrNull);
        }
        return false;
    }

    @kotlin.Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean byteRangeContains(kotlin.ranges.ClosedRange<java.lang.Byte> contains, float f) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contains, "$this$contains");
        java.lang.Byte byteExactOrNull = kotlin.ranges.RangesKt.toByteExactOrNull(f);
        if (byteExactOrNull != null) {
            return contains.contains(byteExactOrNull);
        }
        return false;
    }

    @kotlin.Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean shortRangeContains(kotlin.ranges.ClosedRange<java.lang.Short> contains, float f) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contains, "$this$contains");
        java.lang.Short shortExactOrNull = kotlin.ranges.RangesKt.toShortExactOrNull(f);
        if (shortExactOrNull != null) {
            return contains.contains(shortExactOrNull);
        }
        return false;
    }

    public static final boolean doubleRangeContains(kotlin.ranges.ClosedRange<java.lang.Double> contains, float f) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contains, "$this$contains");
        return contains.contains(java.lang.Double.valueOf(f));
    }

    public static final boolean longRangeContains(kotlin.ranges.ClosedRange<java.lang.Long> contains, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contains, "$this$contains");
        return contains.contains(java.lang.Long.valueOf(i));
    }

    public static final boolean byteRangeContains(kotlin.ranges.ClosedRange<java.lang.Byte> contains, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contains, "$this$contains");
        java.lang.Byte byteExactOrNull = kotlin.ranges.RangesKt.toByteExactOrNull(i);
        if (byteExactOrNull != null) {
            return contains.contains(byteExactOrNull);
        }
        return false;
    }

    public static final boolean shortRangeContains(kotlin.ranges.ClosedRange<java.lang.Short> contains, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contains, "$this$contains");
        java.lang.Short shortExactOrNull = kotlin.ranges.RangesKt.toShortExactOrNull(i);
        if (shortExactOrNull != null) {
            return contains.contains(shortExactOrNull);
        }
        return false;
    }

    @kotlin.Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean doubleRangeContains(kotlin.ranges.ClosedRange<java.lang.Double> contains, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contains, "$this$contains");
        return contains.contains(java.lang.Double.valueOf(i));
    }

    @kotlin.Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean floatRangeContains(kotlin.ranges.ClosedRange<java.lang.Float> contains, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contains, "$this$contains");
        return contains.contains(java.lang.Float.valueOf(i));
    }

    public static final boolean intRangeContains(kotlin.ranges.ClosedRange<java.lang.Integer> contains, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contains, "$this$contains");
        java.lang.Integer intExactOrNull = kotlin.ranges.RangesKt.toIntExactOrNull(j);
        if (intExactOrNull != null) {
            return contains.contains(intExactOrNull);
        }
        return false;
    }

    public static final boolean byteRangeContains(kotlin.ranges.ClosedRange<java.lang.Byte> contains, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contains, "$this$contains");
        java.lang.Byte byteExactOrNull = kotlin.ranges.RangesKt.toByteExactOrNull(j);
        if (byteExactOrNull != null) {
            return contains.contains(byteExactOrNull);
        }
        return false;
    }

    public static final boolean shortRangeContains(kotlin.ranges.ClosedRange<java.lang.Short> contains, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contains, "$this$contains");
        java.lang.Short shortExactOrNull = kotlin.ranges.RangesKt.toShortExactOrNull(j);
        if (shortExactOrNull != null) {
            return contains.contains(shortExactOrNull);
        }
        return false;
    }

    @kotlin.Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean doubleRangeContains(kotlin.ranges.ClosedRange<java.lang.Double> contains, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contains, "$this$contains");
        return contains.contains(java.lang.Double.valueOf(j));
    }

    @kotlin.Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean floatRangeContains(kotlin.ranges.ClosedRange<java.lang.Float> contains, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contains, "$this$contains");
        return contains.contains(java.lang.Float.valueOf(j));
    }

    public static final boolean intRangeContains(kotlin.ranges.ClosedRange<java.lang.Integer> contains, short s) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contains, "$this$contains");
        return contains.contains(java.lang.Integer.valueOf(s));
    }

    public static final boolean longRangeContains(kotlin.ranges.ClosedRange<java.lang.Long> contains, short s) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contains, "$this$contains");
        return contains.contains(java.lang.Long.valueOf(s));
    }

    public static final boolean byteRangeContains(kotlin.ranges.ClosedRange<java.lang.Byte> contains, short s) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contains, "$this$contains");
        java.lang.Byte byteExactOrNull = kotlin.ranges.RangesKt.toByteExactOrNull(s);
        if (byteExactOrNull != null) {
            return contains.contains(byteExactOrNull);
        }
        return false;
    }

    @kotlin.Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean doubleRangeContains(kotlin.ranges.ClosedRange<java.lang.Double> contains, short s) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contains, "$this$contains");
        return contains.contains(java.lang.Double.valueOf(s));
    }

    @kotlin.Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean floatRangeContains(kotlin.ranges.ClosedRange<java.lang.Float> contains, short s) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contains, "$this$contains");
        return contains.contains(java.lang.Float.valueOf(s));
    }

    public static final kotlin.ranges.IntProgression downTo(int i, byte b) {
        return kotlin.ranges.IntProgression.INSTANCE.fromClosedRange(i, b, -1);
    }

    public static final kotlin.ranges.LongProgression downTo(long j, byte b) {
        return kotlin.ranges.LongProgression.INSTANCE.fromClosedRange(j, b, -1L);
    }

    public static final kotlin.ranges.IntProgression downTo(byte b, byte b2) {
        return kotlin.ranges.IntProgression.INSTANCE.fromClosedRange(b, b2, -1);
    }

    public static final kotlin.ranges.IntProgression downTo(short s, byte b) {
        return kotlin.ranges.IntProgression.INSTANCE.fromClosedRange(s, b, -1);
    }

    public static final kotlin.ranges.CharProgression downTo(char c, char c2) {
        return kotlin.ranges.CharProgression.INSTANCE.fromClosedRange(c, c2, -1);
    }

    public static final kotlin.ranges.IntProgression downTo(int i, int i2) {
        return kotlin.ranges.IntProgression.INSTANCE.fromClosedRange(i, i2, -1);
    }

    public static final kotlin.ranges.LongProgression downTo(long j, int i) {
        return kotlin.ranges.LongProgression.INSTANCE.fromClosedRange(j, i, -1L);
    }

    public static final kotlin.ranges.IntProgression downTo(byte b, int i) {
        return kotlin.ranges.IntProgression.INSTANCE.fromClosedRange(b, i, -1);
    }

    public static final kotlin.ranges.IntProgression downTo(short s, int i) {
        return kotlin.ranges.IntProgression.INSTANCE.fromClosedRange(s, i, -1);
    }

    public static final kotlin.ranges.LongProgression downTo(int i, long j) {
        return kotlin.ranges.LongProgression.INSTANCE.fromClosedRange(i, j, -1L);
    }

    public static final kotlin.ranges.LongProgression downTo(long j, long j2) {
        return kotlin.ranges.LongProgression.INSTANCE.fromClosedRange(j, j2, -1L);
    }

    public static final kotlin.ranges.LongProgression downTo(byte b, long j) {
        return kotlin.ranges.LongProgression.INSTANCE.fromClosedRange(b, j, -1L);
    }

    public static final kotlin.ranges.LongProgression downTo(short s, long j) {
        return kotlin.ranges.LongProgression.INSTANCE.fromClosedRange(s, j, -1L);
    }

    public static final kotlin.ranges.IntProgression downTo(int i, short s) {
        return kotlin.ranges.IntProgression.INSTANCE.fromClosedRange(i, s, -1);
    }

    public static final kotlin.ranges.LongProgression downTo(long j, short s) {
        return kotlin.ranges.LongProgression.INSTANCE.fromClosedRange(j, s, -1L);
    }

    public static final kotlin.ranges.IntProgression downTo(byte b, short s) {
        return kotlin.ranges.IntProgression.INSTANCE.fromClosedRange(b, s, -1);
    }

    public static final kotlin.ranges.IntProgression downTo(short s, short s2) {
        return kotlin.ranges.IntProgression.INSTANCE.fromClosedRange(s, s2, -1);
    }

    public static final kotlin.ranges.IntProgression reversed(kotlin.ranges.IntProgression reversed) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reversed, "$this$reversed");
        return kotlin.ranges.IntProgression.INSTANCE.fromClosedRange(reversed.getLast(), reversed.getFirst(), -reversed.getStep());
    }

    public static final kotlin.ranges.LongProgression reversed(kotlin.ranges.LongProgression reversed) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reversed, "$this$reversed");
        return kotlin.ranges.LongProgression.INSTANCE.fromClosedRange(reversed.getLast(), reversed.getFirst(), -reversed.getStep());
    }

    public static final kotlin.ranges.CharProgression reversed(kotlin.ranges.CharProgression reversed) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reversed, "$this$reversed");
        return kotlin.ranges.CharProgression.INSTANCE.fromClosedRange(reversed.getLast(), reversed.getFirst(), -reversed.getStep());
    }

    public static final kotlin.ranges.IntProgression step(kotlin.ranges.IntProgression step, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(step, "$this$step");
        kotlin.ranges.RangesKt.checkStepIsPositive(i > 0, java.lang.Integer.valueOf(i));
        kotlin.ranges.IntProgression.Companion companion = kotlin.ranges.IntProgression.INSTANCE;
        int first = step.getFirst();
        int last = step.getLast();
        if (step.getStep() <= 0) {
            i = -i;
        }
        return companion.fromClosedRange(first, last, i);
    }

    public static final kotlin.ranges.LongProgression step(kotlin.ranges.LongProgression step, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(step, "$this$step");
        kotlin.ranges.RangesKt.checkStepIsPositive(j > 0, java.lang.Long.valueOf(j));
        kotlin.ranges.LongProgression.Companion companion = kotlin.ranges.LongProgression.INSTANCE;
        long first = step.getFirst();
        long last = step.getLast();
        if (step.getStep() <= 0) {
            j = -j;
        }
        return companion.fromClosedRange(first, last, j);
    }

    public static final kotlin.ranges.CharProgression step(kotlin.ranges.CharProgression step, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(step, "$this$step");
        kotlin.ranges.RangesKt.checkStepIsPositive(i > 0, java.lang.Integer.valueOf(i));
        kotlin.ranges.CharProgression.Companion companion = kotlin.ranges.CharProgression.INSTANCE;
        char first = step.getFirst();
        char last = step.getLast();
        if (step.getStep() <= 0) {
            i = -i;
        }
        return companion.fromClosedRange(first, last, i);
    }

    public static final java.lang.Byte toByteExactOrNull(int i) {
        if (-128 <= i && 127 >= i) {
            return java.lang.Byte.valueOf((byte) i);
        }
        return null;
    }

    public static final java.lang.Byte toByteExactOrNull(long j) {
        long j2 = -128;
        long j3 = kotlinx.coroutines.scheduling.WorkQueueKt.MASK;
        if (j2 <= j && j3 >= j) {
            return java.lang.Byte.valueOf((byte) j);
        }
        return null;
    }

    public static final java.lang.Byte toByteExactOrNull(short s) {
        short s2 = (short) (-128);
        short s3 = (short) kotlinx.coroutines.scheduling.WorkQueueKt.MASK;
        if (s2 <= s && s3 >= s) {
            return java.lang.Byte.valueOf((byte) s);
        }
        return null;
    }

    public static final java.lang.Byte toByteExactOrNull(double d) {
        double d2 = -128;
        double d3 = kotlinx.coroutines.scheduling.WorkQueueKt.MASK;
        if (d < d2 || d > d3) {
            return null;
        }
        return java.lang.Byte.valueOf((byte) d);
    }

    public static final java.lang.Byte toByteExactOrNull(float f) {
        float f2 = -128;
        float f3 = kotlinx.coroutines.scheduling.WorkQueueKt.MASK;
        if (f < f2 || f > f3) {
            return null;
        }
        return java.lang.Byte.valueOf((byte) f);
    }

    public static final java.lang.Integer toIntExactOrNull(long j) {
        long j2 = Integer.MAX_VALUE;
        if (Integer.MIN_VALUE <= j && j2 >= j) {
            return java.lang.Integer.valueOf((int) j);
        }
        return null;
    }

    public static final java.lang.Integer toIntExactOrNull(double d) {
        double d2 = Integer.MAX_VALUE;
        if (d < Integer.MIN_VALUE || d > d2) {
            return null;
        }
        return java.lang.Integer.valueOf((int) d);
    }

    public static final java.lang.Integer toIntExactOrNull(float f) {
        float f2 = Integer.MAX_VALUE;
        if (f < Integer.MIN_VALUE || f > f2) {
            return null;
        }
        return java.lang.Integer.valueOf((int) f);
    }

    public static final java.lang.Long toLongExactOrNull(double d) {
        double d2 = Long.MIN_VALUE;
        double d3 = kotlin.jvm.internal.LongCompanionObject.MAX_VALUE;
        if (d < d2 || d > d3) {
            return null;
        }
        return java.lang.Long.valueOf((long) d);
    }

    public static final java.lang.Long toLongExactOrNull(float f) {
        float f2 = Long.MIN_VALUE;
        float f3 = kotlin.jvm.internal.LongCompanionObject.MAX_VALUE;
        if (f < f2 || f > f3) {
            return null;
        }
        return java.lang.Long.valueOf((long) f);
    }

    public static final java.lang.Short toShortExactOrNull(int i) {
        if (-32768 <= i && 32767 >= i) {
            return java.lang.Short.valueOf((short) i);
        }
        return null;
    }

    public static final java.lang.Short toShortExactOrNull(long j) {
        long j2 = 32767;
        if (-32768 <= j && j2 >= j) {
            return java.lang.Short.valueOf((short) j);
        }
        return null;
    }

    public static final java.lang.Short toShortExactOrNull(double d) {
        double d2 = 32767;
        if (d < -32768 || d > d2) {
            return null;
        }
        return java.lang.Short.valueOf((short) d);
    }

    public static final java.lang.Short toShortExactOrNull(float f) {
        float f2 = 32767;
        if (f < -32768 || f > f2) {
            return null;
        }
        return java.lang.Short.valueOf((short) f);
    }

    public static final kotlin.ranges.IntRange until(int i, byte b) {
        return new kotlin.ranges.IntRange(i, b - 1);
    }

    public static final kotlin.ranges.LongRange until(long j, byte b) {
        return new kotlin.ranges.LongRange(j, ((long) b) - 1);
    }

    public static final kotlin.ranges.IntRange until(byte b, byte b2) {
        return new kotlin.ranges.IntRange(b, b2 - 1);
    }

    public static final kotlin.ranges.IntRange until(short s, byte b) {
        return new kotlin.ranges.IntRange(s, b - 1);
    }

    public static final kotlin.ranges.CharRange until(char c, char c2) {
        return kotlin.jvm.internal.Intrinsics.compare((int) c2, 0) <= 0 ? kotlin.ranges.CharRange.INSTANCE.getEMPTY() : new kotlin.ranges.CharRange(c, (char) (c2 - 1));
    }

    public static final kotlin.ranges.IntRange until(int i, int i2) {
        if (i2 <= Integer.MIN_VALUE) {
            return kotlin.ranges.IntRange.INSTANCE.getEMPTY();
        }
        return new kotlin.ranges.IntRange(i, i2 - 1);
    }

    public static final kotlin.ranges.LongRange until(long j, int i) {
        return new kotlin.ranges.LongRange(j, ((long) i) - 1);
    }

    public static final kotlin.ranges.IntRange until(byte b, int i) {
        if (i <= Integer.MIN_VALUE) {
            return kotlin.ranges.IntRange.INSTANCE.getEMPTY();
        }
        return new kotlin.ranges.IntRange(b, i - 1);
    }

    public static final kotlin.ranges.IntRange until(short s, int i) {
        if (i <= Integer.MIN_VALUE) {
            return kotlin.ranges.IntRange.INSTANCE.getEMPTY();
        }
        return new kotlin.ranges.IntRange(s, i - 1);
    }

    public static final kotlin.ranges.LongRange until(int i, long j) {
        if (j <= Long.MIN_VALUE) {
            return kotlin.ranges.LongRange.INSTANCE.getEMPTY();
        }
        return new kotlin.ranges.LongRange(i, j - 1);
    }

    public static final kotlin.ranges.LongRange until(long j, long j2) {
        if (j2 <= Long.MIN_VALUE) {
            return kotlin.ranges.LongRange.INSTANCE.getEMPTY();
        }
        return new kotlin.ranges.LongRange(j, j2 - 1);
    }

    public static final kotlin.ranges.LongRange until(byte b, long j) {
        if (j <= Long.MIN_VALUE) {
            return kotlin.ranges.LongRange.INSTANCE.getEMPTY();
        }
        return new kotlin.ranges.LongRange(b, j - 1);
    }

    public static final kotlin.ranges.LongRange until(short s, long j) {
        if (j <= Long.MIN_VALUE) {
            return kotlin.ranges.LongRange.INSTANCE.getEMPTY();
        }
        return new kotlin.ranges.LongRange(s, j - 1);
    }

    public static final kotlin.ranges.IntRange until(int i, short s) {
        return new kotlin.ranges.IntRange(i, s - 1);
    }

    public static final kotlin.ranges.LongRange until(long j, short s) {
        return new kotlin.ranges.LongRange(j, ((long) s) - 1);
    }

    public static final kotlin.ranges.IntRange until(byte b, short s) {
        return new kotlin.ranges.IntRange(b, s - 1);
    }

    public static final kotlin.ranges.IntRange until(short s, short s2) {
        return new kotlin.ranges.IntRange(s, s2 - 1);
    }

    public static final <T extends java.lang.Comparable<? super T>> T coerceAtLeast(T coerceAtLeast, T minimumValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coerceAtLeast, "$this$coerceAtLeast");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(minimumValue, "minimumValue");
        return coerceAtLeast.compareTo(minimumValue) < 0 ? minimumValue : coerceAtLeast;
    }

    public static final <T extends java.lang.Comparable<? super T>> T coerceAtMost(T coerceAtMost, T maximumValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coerceAtMost, "$this$coerceAtMost");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(maximumValue, "maximumValue");
        return coerceAtMost.compareTo(maximumValue) > 0 ? maximumValue : coerceAtMost;
    }

    public static final <T extends java.lang.Comparable<? super T>> T coerceIn(T coerceIn, T t, T t2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coerceIn, "$this$coerceIn");
        if (t != null && t2 != null) {
            if (t.compareTo(t2) > 0) {
                throw new java.lang.IllegalArgumentException("Cannot coerce value to an empty range: maximum " + t2 + " is less than minimum " + t + '.');
            }
            if (coerceIn.compareTo(t) < 0) {
                return t;
            }
            if (coerceIn.compareTo(t2) > 0) {
                return t2;
            }
        } else {
            if (t != null && coerceIn.compareTo(t) < 0) {
                return t;
            }
            if (t2 != null && coerceIn.compareTo(t2) > 0) {
                return t2;
            }
        }
        return coerceIn;
    }

    public static final byte coerceIn(byte b, byte b2, byte b3) {
        if (b2 <= b3) {
            if (b < b2) {
                return b2;
            }
            return b > b3 ? b3 : b;
        }
        throw new java.lang.IllegalArgumentException("Cannot coerce value to an empty range: maximum " + ((int) b3) + " is less than minimum " + ((int) b2) + '.');
    }

    public static final short coerceIn(short s, short s2, short s3) {
        if (s2 <= s3) {
            if (s < s2) {
                return s2;
            }
            return s > s3 ? s3 : s;
        }
        throw new java.lang.IllegalArgumentException("Cannot coerce value to an empty range: maximum " + ((int) s3) + " is less than minimum " + ((int) s2) + '.');
    }

    public static final int coerceIn(int i, int i2, int i3) {
        if (i2 <= i3) {
            if (i < i2) {
                return i2;
            }
            return i > i3 ? i3 : i;
        }
        throw new java.lang.IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i3 + " is less than minimum " + i2 + '.');
    }

    public static final long coerceIn(long j, long j2, long j3) {
        if (j2 <= j3) {
            if (j < j2) {
                return j2;
            }
            return j > j3 ? j3 : j;
        }
        throw new java.lang.IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j3 + " is less than minimum " + j2 + '.');
    }

    public static final float coerceIn(float f, float f2, float f3) {
        if (f2 <= f3) {
            if (f < f2) {
                return f2;
            }
            return f > f3 ? f3 : f;
        }
        throw new java.lang.IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f3 + " is less than minimum " + f2 + '.');
    }

    public static final double coerceIn(double d, double d2, double d3) {
        if (d2 <= d3) {
            if (d < d2) {
                return d2;
            }
            return d > d3 ? d3 : d;
        }
        throw new java.lang.IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d3 + " is less than minimum " + d2 + '.');
    }

    public static final <T extends java.lang.Comparable<? super T>> T coerceIn(T coerceIn, kotlin.ranges.ClosedFloatingPointRange<T> range) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coerceIn, "$this$coerceIn");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(range, "range");
        if (range.isEmpty()) {
            throw new java.lang.IllegalArgumentException("Cannot coerce value to an empty range: " + range + '.');
        }
        if (!range.lessThanOrEquals(coerceIn, range.getStart()) || range.lessThanOrEquals(range.getStart(), coerceIn)) {
            return (!range.lessThanOrEquals(range.getEndInclusive(), coerceIn) || range.lessThanOrEquals(coerceIn, range.getEndInclusive())) ? coerceIn : range.getEndInclusive();
        }
        return range.getStart();
    }

    public static final <T extends java.lang.Comparable<? super T>> T coerceIn(T coerceIn, kotlin.ranges.ClosedRange<T> range) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coerceIn, "$this$coerceIn");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(range, "range");
        if (range instanceof kotlin.ranges.ClosedFloatingPointRange) {
            return (T) kotlin.ranges.RangesKt.coerceIn((java.lang.Comparable) coerceIn, (kotlin.ranges.ClosedFloatingPointRange) range);
        }
        if (range.isEmpty()) {
            throw new java.lang.IllegalArgumentException("Cannot coerce value to an empty range: " + range + '.');
        }
        if (coerceIn.compareTo(range.getStart()) < 0) {
            return (T) range.getStart();
        }
        return coerceIn.compareTo(range.getEndInclusive()) > 0 ? (T) range.getEndInclusive() : coerceIn;
    }

    public static final int coerceIn(int i, kotlin.ranges.ClosedRange<java.lang.Integer> range) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(range, "range");
        if (range instanceof kotlin.ranges.ClosedFloatingPointRange) {
            return ((java.lang.Number) kotlin.ranges.RangesKt.coerceIn(java.lang.Integer.valueOf(i), (kotlin.ranges.ClosedFloatingPointRange<java.lang.Integer>) range)).intValue();
        }
        if (range.isEmpty()) {
            throw new java.lang.IllegalArgumentException("Cannot coerce value to an empty range: " + range + '.');
        }
        if (i < ((java.lang.Number) range.getStart()).intValue()) {
            return ((java.lang.Number) range.getStart()).intValue();
        }
        return i > ((java.lang.Number) range.getEndInclusive()).intValue() ? ((java.lang.Number) range.getEndInclusive()).intValue() : i;
    }

    public static final long coerceIn(long j, kotlin.ranges.ClosedRange<java.lang.Long> range) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(range, "range");
        if (range instanceof kotlin.ranges.ClosedFloatingPointRange) {
            return ((java.lang.Number) kotlin.ranges.RangesKt.coerceIn(java.lang.Long.valueOf(j), (kotlin.ranges.ClosedFloatingPointRange<java.lang.Long>) range)).longValue();
        }
        if (!range.isEmpty()) {
            if (j < ((java.lang.Number) range.getStart()).longValue()) {
                return ((java.lang.Number) range.getStart()).longValue();
            }
            return j > ((java.lang.Number) range.getEndInclusive()).longValue() ? ((java.lang.Number) range.getEndInclusive()).longValue() : j;
        }
        throw new java.lang.IllegalArgumentException("Cannot coerce value to an empty range: " + range + '.');
    }
}
