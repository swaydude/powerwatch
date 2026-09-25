.class public final Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/AccessoryProviderImpl;
.super Ljava/lang/Object;
.source "Technology.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/AccessoryProvider;


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nTechnology.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Technology.kt\npowerwatch/matrix/com/pwgen2android/sdk/technologies/AccessoryProviderImpl\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,100:1\n211#2:101\n212#2:104\n1849#3,2:102\n1849#3,2:105\n*S KotlinDebug\n*F\n+ 1 Technology.kt\npowerwatch/matrix/com/pwgen2android/sdk/technologies/AccessoryProviderImpl\n*L\n69#1:101\n69#1:104\n70#1:102,2\n81#1:105,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0006H\u0016J\u0010\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005H\u0016J\u0008\u0010\u0014\u001a\u00020\u0010H\u0016J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u0005H\u0016R*\u0010\u0003\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006`\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00060\t8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\n\u0010\u000bR\u001c\u0010\u000c\u001a\u0010\u0012\u000c\u0012\n \u000e*\u0004\u0018\u00010\u00060\u00060\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/AccessoryProviderImpl;",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/AccessoryProvider;",
        "()V",
        "accessories",
        "Ljava/util/HashMap;",
        "",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/model/Accessory;",
        "Lkotlin/collections/HashMap;",
        "accessoryChange",
        "Lio/reactivex/Observable;",
        "getAccessoryChange",
        "()Lio/reactivex/Observable;",
        "accessorySubject",
        "Lio/reactivex/subjects/PublishSubject;",
        "kotlin.jvm.PlatformType",
        "add",
        "",
        "accessoryID",
        "accessory",
        "clear",
        "clearAll",
        "contains",
        "",
        "app_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x5,
        0x1
    }
    xi = 0x30
.end annotation


# instance fields
.field private final accessories:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/model/Accessory;",
            ">;"
        }
    .end annotation
.end field

.field private final accessorySubject:Lio/reactivex/subjects/PublishSubject;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/subjects/PublishSubject<",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/model/Accessory;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 56
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 58
    invoke-static {}, Lio/reactivex/subjects/PublishSubject;->create()Lio/reactivex/subjects/PublishSubject;

    move-result-object v0

    const-string v1, "create<Accessory>()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/AccessoryProviderImpl;->accessorySubject:Lio/reactivex/subjects/PublishSubject;

    .line 65
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/AccessoryProviderImpl;->accessories:Ljava/util/HashMap;

    return-void
.end method


# virtual methods
.method public add(Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/model/Accessory;)V
    .locals 6

    const-string v0, "accessoryID"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "accessory"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 92
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/AccessoryProviderImpl;->accessories:Ljava/util/HashMap;

    check-cast v0, Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/AccessoryProviderImpl;->accessorySubject:Lio/reactivex/subjects/PublishSubject;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x7

    const/4 v5, 0x0

    move-object v0, p2

    invoke-static/range {v0 .. v5}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/Accessory;->copy$default(Lpowerwatch/matrix/com/pwgen2android/sdk/model/Accessory;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;Ljava/util/List;Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;ILjava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/sdk/model/Accessory;

    move-result-object p2

    invoke-virtual {p1, p2}, Lio/reactivex/subjects/PublishSubject;->onNext(Ljava/lang/Object;)V

    return-void
.end method

.method public clear(Ljava/lang/String;)V
    .locals 7

    const-string v0, "accessoryID"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 79
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/AccessoryProviderImpl;->accessories:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/sdk/model/Accessory;

    if-eqz v1, :cond_1

    .line 81
    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/Accessory;->getConnections()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .line 105
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/sdk/connection/Connection;

    .line 82
    invoke-interface {v2}, Lpowerwatch/matrix/com/pwgen2android/sdk/connection/Connection;->close()Lio/reactivex/Completable;

    move-result-object v2

    invoke-virtual {v2}, Lio/reactivex/Completable;->subscribe()Lio/reactivex/disposables/Disposable;

    goto :goto_0

    .line 84
    :cond_0
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/AccessoryProviderImpl;->accessories:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/AccessoryProviderImpl;->accessorySubject:Lio/reactivex/subjects/PublishSubject;

    const/4 v2, 0x0

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v3

    const/4 v4, 0x0

    const/4 v5, 0x5

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/Accessory;->copy$default(Lpowerwatch/matrix/com/pwgen2android/sdk/model/Accessory;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;Ljava/util/List;Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;ILjava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/sdk/model/Accessory;

    move-result-object v0

    invoke-virtual {p1, v0}, Lio/reactivex/subjects/PublishSubject;->onNext(Ljava/lang/Object;)V

    :cond_1
    return-void
.end method

.method public clearAll()V
    .locals 9

    .line 69
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/AccessoryProviderImpl;->accessories:Ljava/util/HashMap;

    check-cast v0, Ljava/util/Map;

    .line 101
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 70
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/sdk/model/Accessory;

    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/Accessory;->getConnections()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    .line 102
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lpowerwatch/matrix/com/pwgen2android/sdk/connection/Connection;

    .line 71
    invoke-interface {v3}, Lpowerwatch/matrix/com/pwgen2android/sdk/connection/Connection;->close()Lio/reactivex/Completable;

    move-result-object v3

    invoke-virtual {v3}, Lio/reactivex/Completable;->subscribe()Lio/reactivex/disposables/Disposable;

    goto :goto_1

    .line 73
    :cond_0
    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/AccessoryProviderImpl;->accessorySubject:Lio/reactivex/subjects/PublishSubject;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Lpowerwatch/matrix/com/pwgen2android/sdk/model/Accessory;

    const/4 v4, 0x0

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v5

    const/4 v6, 0x0

    const/4 v7, 0x5

    const/4 v8, 0x0

    invoke-static/range {v3 .. v8}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/Accessory;->copy$default(Lpowerwatch/matrix/com/pwgen2android/sdk/model/Accessory;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;Ljava/util/List;Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;ILjava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/sdk/model/Accessory;

    move-result-object v1

    invoke-virtual {v2, v1}, Lio/reactivex/subjects/PublishSubject;->onNext(Ljava/lang/Object;)V

    goto :goto_0

    .line 75
    :cond_1
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/AccessoryProviderImpl;->accessories:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    return-void
.end method

.method public contains(Ljava/lang/String;)Z
    .locals 1

    const-string v0, "accessoryID"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 97
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/AccessoryProviderImpl;->accessories:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public getAccessoryChange()Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/model/Accessory;",
            ">;"
        }
    .end annotation

    .line 62
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/AccessoryProviderImpl;->accessorySubject:Lio/reactivex/subjects/PublishSubject;

    check-cast v0, Lio/reactivex/Observable;

    return-object v0
.end method
