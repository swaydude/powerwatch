package powerwatch.matrix.com.pwgen2android.sdk.technologies;

/* JADX INFO: compiled from: Technology.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0006H\u0016J\u0010\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005H\u0016J\b\u0010\u0014\u001a\u00020\u0010H\u0016J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u0005H\u0016R*\u0010\u0003\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006`\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\u0010\u0012\f\u0012\n \u000e*\u0004\u0018\u00010\u00060\u00060\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/AccessoryProviderImpl;", "Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/AccessoryProvider;", "()V", "accessories", "Ljava/util/HashMap;", "", "Lpowerwatch/matrix/com/pwgen2android/sdk/model/Accessory;", "Lkotlin/collections/HashMap;", "accessoryChange", "Lio/reactivex/Observable;", "getAccessoryChange", "()Lio/reactivex/Observable;", "accessorySubject", "Lio/reactivex/subjects/PublishSubject;", "kotlin.jvm.PlatformType", "add", "", "accessoryID", "accessory", "clear", "clearAll", "contains", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class AccessoryProviderImpl implements powerwatch.matrix.com.pwgen2android.sdk.technologies.AccessoryProvider {
    private final java.util.HashMap<java.lang.String, powerwatch.matrix.com.pwgen2android.sdk.model.Accessory> accessories;
    private final io.reactivex.subjects.PublishSubject<powerwatch.matrix.com.pwgen2android.sdk.model.Accessory> accessorySubject;

    public AccessoryProviderImpl() {
        io.reactivex.subjects.PublishSubject<powerwatch.matrix.com.pwgen2android.sdk.model.Accessory> publishSubjectCreate = io.reactivex.subjects.PublishSubject.create();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(publishSubjectCreate, "create<Accessory>()");
        this.accessorySubject = publishSubjectCreate;
        this.accessories = new java.util.HashMap<>();
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.technologies.AccessoryProvider
    public io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.sdk.model.Accessory> getAccessoryChange() {
        return this.accessorySubject;
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.technologies.AccessoryProvider
    public void clearAll() {
        for (java.util.Map.Entry<java.lang.String, powerwatch.matrix.com.pwgen2android.sdk.model.Accessory> entry : this.accessories.entrySet()) {
            java.util.Iterator<T> it = entry.getValue().getConnections().iterator();
            while (it.hasNext()) {
                ((powerwatch.matrix.com.pwgen2android.sdk.connection.Connection) it.next()).close().subscribe();
            }
            this.accessorySubject.onNext(powerwatch.matrix.com.pwgen2android.sdk.model.Accessory.copy$default(entry.getValue(), null, kotlin.collections.CollectionsKt.emptyList(), null, 5, null));
        }
        this.accessories.clear();
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.technologies.AccessoryProvider
    public void clear(java.lang.String accessoryID) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accessoryID, "accessoryID");
        powerwatch.matrix.com.pwgen2android.sdk.model.Accessory accessory = this.accessories.get(accessoryID);
        if (accessory != null) {
            java.util.Iterator<T> it = accessory.getConnections().iterator();
            while (it.hasNext()) {
                ((powerwatch.matrix.com.pwgen2android.sdk.connection.Connection) it.next()).close().subscribe();
            }
            this.accessories.remove(accessoryID);
            this.accessorySubject.onNext(powerwatch.matrix.com.pwgen2android.sdk.model.Accessory.copy$default(accessory, null, kotlin.collections.CollectionsKt.emptyList(), null, 5, null));
        }
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.technologies.AccessoryProvider
    public void add(java.lang.String accessoryID, powerwatch.matrix.com.pwgen2android.sdk.model.Accessory accessory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accessoryID, "accessoryID");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accessory, "accessory");
        this.accessories.put(accessoryID, accessory);
        this.accessorySubject.onNext(powerwatch.matrix.com.pwgen2android.sdk.model.Accessory.copy$default(accessory, null, null, null, 7, null));
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.technologies.AccessoryProvider
    public boolean contains(java.lang.String accessoryID) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accessoryID, "accessoryID");
        return this.accessories.containsKey(accessoryID);
    }
}
