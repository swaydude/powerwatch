package powerwatch.matrix.com.pwgen2android.main.battery;

/* JADX INFO: compiled from: Resources.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010$\n\u0002\b\u0003\u001a\u000e\u0010\u0002\u001a\u00020\u00012\u0006\u0010.\u001a\u00020\u0001\u001a\u000e\u0010\f\u001a\u00020\u00012\u0006\u0010.\u001a\u00020\u0001\u001a\"\u0010/\u001a\u00020\u00012\u0006\u0010.\u001a\u00020\u00012\u0012\u00100\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u000101\u001a\u000e\u0010\u0011\u001a\u00020\u00012\u0006\u0010.\u001a\u00020\u0001\u001a\u000e\u00102\u001a\u00020\u00162\u0006\u0010.\u001a\u00020\u0001\u001a\u000e\u0010\u001e\u001a\u00020\u00012\u0006\u0010.\u001a\u00020\u0001\u001a:\u00103\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010!2\u0006\u0010.\u001a\u00020\u00012\u001e\u00100\u001a\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010!01\u001a\u000e\u0010$\u001a\u00020\u00012\u0006\u0010.\u001a\u00020\u0001\u001a\u000e\u0010'\u001a\u00020\u00012\u0006\u0010.\u001a\u00020\u0001\u001a\u000e\u0010,\u001a\u00020\u00012\u0006\u0010.\u001a\u00020\u0001\"\u001a\u0010\u0000\u001a\u00020\u0001X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0004\b\u0004\u0010\u0005\"-\u0010\u0006\u001a\u001e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0007j\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001`\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\"\u001a\u0010\u000b\u001a\u00020\u0001X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u0003\"\u0004\b\r\u0010\u0005\"-\u0010\u000e\u001a\u001e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0007j\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001`\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\n\"\u001a\u0010\u0010\u001a\u00020\u0001X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0003\"\u0004\b\u0012\u0010\u0005\"-\u0010\u0013\u001a\u001e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0007j\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001`\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\n\"\u001a\u0010\u0015\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a\"-\u0010\u001b\u001a\u001e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00160\u0007j\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0016`\b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\n\"\u001a\u0010\u001d\u001a\u00020\u0001X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0003\"\u0004\b\u001f\u0010\u0005\"E\u0010 \u001a6\u0012\u0004\u0012\u00020\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010!0\u0007j\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010!`\b¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\n\"\u001a\u0010#\u001a\u00020\u0001X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0003\"\u0004\b%\u0010\u0005\"\u001a\u0010&\u001a\u00020\u0001X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u0003\"\u0004\b(\u0010\u0005\"E\u0010)\u001a6\u0012\u0004\u0012\u00020\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010!0\u0007j\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010!`\b¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\n\"\u001a\u0010+\u001a\u00020\u0001X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u0003\"\u0004\b-\u0010\u0005¨\u00064"}, d2 = {"batteryCriticalMessage", "", "getBatteryCriticalMessage", "()Ljava/lang/String;", "setBatteryCriticalMessage", "(Ljava/lang/String;)V", "batteryCriticalMessageMap", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "getBatteryCriticalMessageMap", "()Ljava/util/HashMap;", "batteryLowMessage", "getBatteryLowMessage", "setBatteryLowMessage", "batteryLowMessageMap", "getBatteryLowMessageMap", "batteryTitle", "getBatteryTitle", "setBatteryTitle", "batteryTitleMap", "getBatteryTitleMap", "goalsAchievedResource", "Lpowerwatch/matrix/com/pwgen2android/main/battery/GoalResource;", "getGoalsAchievedResource", "()Lpowerwatch/matrix/com/pwgen2android/main/battery/GoalResource;", "setGoalsAchievedResource", "(Lpowerwatch/matrix/com/pwgen2android/main/battery/GoalResource;)V", "resourceMap", "getResourceMap", "watchConnectedBody", "getWatchConnectedBody", "setWatchConnectedBody", "watchConnectedMessagesMap", "Lkotlin/Pair;", "getWatchConnectedMessagesMap", "watchConnectedTitle", "getWatchConnectedTitle", "setWatchConnectedTitle", "watchDisconnectedBody", "getWatchDisconnectedBody", "setWatchDisconnectedBody", "watchDisconnectedMessagesMap", "getWatchDisconnectedMessagesMap", "watchDisconnectedTitle", "getWatchDisconnectedTitle", "setWatchDisconnectedTitle", "languageKey", "getBatteryMessage", "map", "", "getGoalMessage", "getWatchConnectedMessage", "app_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
public final class ResourcesKt {
    private static java.lang.String batteryCriticalMessage = "";
    private static final java.util.HashMap<java.lang.String, java.lang.String> batteryCriticalMessageMap;
    private static java.lang.String batteryLowMessage = "";
    private static final java.util.HashMap<java.lang.String, java.lang.String> batteryLowMessageMap;
    private static java.lang.String batteryTitle = "";
    private static final java.util.HashMap<java.lang.String, java.lang.String> batteryTitleMap;
    private static powerwatch.matrix.com.pwgen2android.main.battery.GoalResource goalsAchievedResource;
    private static final java.util.HashMap<java.lang.String, powerwatch.matrix.com.pwgen2android.main.battery.GoalResource> resourceMap;
    private static java.lang.String watchConnectedBody;
    private static final java.util.HashMap<java.lang.String, kotlin.Pair<java.lang.String, java.lang.String>> watchConnectedMessagesMap;
    private static java.lang.String watchConnectedTitle;
    private static java.lang.String watchDisconnectedBody;
    private static final java.util.HashMap<java.lang.String, kotlin.Pair<java.lang.String, java.lang.String>> watchDisconnectedMessagesMap;
    private static java.lang.String watchDisconnectedTitle;

    public static final java.lang.String getBatteryTitle() {
        return batteryTitle;
    }

    public static final void setBatteryTitle(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<set-?>");
        batteryTitle = str;
    }

    public static final java.lang.String getBatteryLowMessage() {
        return batteryLowMessage;
    }

    public static final void setBatteryLowMessage(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<set-?>");
        batteryLowMessage = str;
    }

    public static final java.lang.String getBatteryCriticalMessage() {
        return batteryCriticalMessage;
    }

    public static final void setBatteryCriticalMessage(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<set-?>");
        batteryCriticalMessage = str;
    }

    public static final java.lang.String getBatteryTitle(java.lang.String languageKey) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(languageKey, "languageKey");
        return getBatteryMessage(languageKey, batteryTitleMap);
    }

    public static final java.lang.String getBatteryLowMessage(java.lang.String languageKey) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(languageKey, "languageKey");
        return getBatteryMessage(languageKey, batteryLowMessageMap);
    }

    public static final java.lang.String getBatteryCriticalMessage(java.lang.String languageKey) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(languageKey, "languageKey");
        return getBatteryMessage(languageKey, batteryCriticalMessageMap);
    }

    public static final java.lang.String getBatteryMessage(java.lang.String languageKey, java.util.Map<java.lang.String, java.lang.String> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(languageKey, "languageKey");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "map");
        java.lang.String str = map.containsKey(languageKey) ? map.get(languageKey) : null;
        return str == null ? java.lang.String.valueOf(map.get("en")) : str;
    }

    static {
        java.util.HashMap<java.lang.String, java.lang.String> map = new java.util.HashMap<>();
        java.util.HashMap<java.lang.String, java.lang.String> map2 = map;
        map2.put("en", "Battery Status");
        map2.put("de", "Batterie Status");
        map2.put("ru", "Состояние батареи");
        map2.put("ja", "バッテリーレベル");
        map2.put("cs", "Stav baterie");
        map2.put("es", "Estado de la Bateria");
        map2.put("pl", "Stan Baterii");
        map2.put("fr", "État de la batterie");
        map2.put("it", "Stato della batteria");
        batteryTitleMap = map;
        java.util.HashMap<java.lang.String, java.lang.String> map3 = new java.util.HashMap<>();
        java.util.HashMap<java.lang.String, java.lang.String> map4 = map3;
        map4.put("en", "Your PowerWatch 2 battery is low - %s%%");
        map4.put("cs", "Nízký stav baterie PowerWatch 2 - %s%%");
        map4.put("es", "La Batería de tu Powerwatch 2 esta vacia -%s%%");
        map4.put("ja", "残り充電は少ない - %s%%");
        map4.put("pl", "Stan naładowania baterii w twoim Powerwatch 2 jest niski - %s%%");
        map4.put("fr", "La batterie de votre Powerwatch2 est basse - %s%%");
        map4.put("de", "Die Batterie der PowerWatch ist schwach - %s%%");
        map4.put("ru", "Низкий заряд батареи PowerWatch 2 - %s%%");
        map4.put("it", "La batteria del tuo PowerWatch 2 è scarica - %s%%");
        batteryLowMessageMap = map3;
        java.util.HashMap<java.lang.String, java.lang.String> map5 = new java.util.HashMap<>();
        java.util.HashMap<java.lang.String, java.lang.String> map6 = map5;
        map6.put("en", "Your PowerWatch 2 battery is critical - %s%%");
        map6.put("cs", "Kritický stav baterie PowerWatch 2 - %s%%");
        map6.put("de", "Die Batteriekapazität der PowerWatch ist kritisch - %s%%");
        map6.put("es", "La Batería de tu Powerwatch 2 esta muy baja %s%%");
        map6.put("ja", "残りの充電量がわずか - %s%%");
        map6.put("pl", "Stan naładowania baterii w twoim Powerwatch 2 jest krytyczny - %s%%");
        map6.put("fr", "La batterie de votre Powerwatch 2 est critique - %s%%");
        map6.put("ru", "Критически низкий заряд батареи PowerWatch 2 - %s%%");
        map6.put("it", "La batteria del tuo PowerWatch 2 è completamente scarica - %s%%");
        batteryCriticalMessageMap = map5;
        watchConnectedTitle = "";
        watchConnectedBody = "";
        watchDisconnectedTitle = "";
        watchDisconnectedBody = "";
        java.util.HashMap<java.lang.String, kotlin.Pair<java.lang.String, java.lang.String>> map7 = new java.util.HashMap<>();
        java.util.HashMap<java.lang.String, kotlin.Pair<java.lang.String, java.lang.String>> map8 = map7;
        map8.put("en", new kotlin.Pair<>("Connected", "Your watch is now connected. Enjoy your PW2!"));
        map8.put("de", new kotlin.Pair<>("Verbunden", "Deine Uhr ist nun verbunden. Viel Spaß mit Deiner PowerWatch!"));
        map8.put("ru", new kotlin.Pair<>("Подключен", "Ваши часы теперь подключены. Наслаждайтесь вашим PW2!"));
        map8.put("es", new kotlin.Pair<>("Conectado", "Tu reloj esta ahora conectado. Disfruta tu PW2"));
        map8.put("cs", new kotlin.Pair<>("Připojeno", "Hodinky jsou připojeny. Užijte si PW2!"));
        map8.put("ja", new kotlin.Pair<>("接続済", "接続完了。PW2を楽しんでください"));
        map8.put("fr", new kotlin.Pair<>("Connecté", "Votre montre est connectée. Profitez de votre PW2!"));
        map8.put("pl", new kotlin.Pair<>("Połączony", "Twój zegarek jest połączony. Ciesz się swoim PW2!"));
        map8.put("pl", new kotlin.Pair<>("Collegato", "Il tuo orologio è ora collegato. Trai il massimo dal tuo PW2!"));
        watchConnectedMessagesMap = map7;
        java.util.HashMap<java.lang.String, kotlin.Pair<java.lang.String, java.lang.String>> map9 = new java.util.HashMap<>();
        java.util.HashMap<java.lang.String, kotlin.Pair<java.lang.String, java.lang.String>> map10 = map9;
        map10.put("en", new kotlin.Pair<>("Disconnected", "Your watch has been disconnected. Please check airplane mode on your watch and Bluetooth status on your phone"));
        map10.put("es", new kotlin.Pair<>("Desconectado", "Tu reloj se ha desconectado. Verifique el modo avion en su reloj y el estado del Bluetooth en su phone"));
        map10.put("ja", new kotlin.Pair<>("未接続", "時計の接続が切れております。 時計の飛行機モードとスマホのブルートゥース状況を確認してください"));
        map10.put("de", new kotlin.Pair<>("Nicht verbunden ", "Deine Uhr ist nicht verbunden. Prüfe den Flugmodus auf der Uhr und den Bluetooth Status des Telefons"));
        map10.put("ru", new kotlin.Pair<>("Отключен", "Ваши часы были отключены. Пожалуйста, проверьте режим полета на ваших часах и статус Bluetooth на вашем телефоне"));
        map10.put("cs", new kotlin.Pair<>("Odpojeno", "Hodinky jsou odpojeny. Prosím zkontrolujte mód letadlo na hodinkách a stav Bluetooth v mobilu"));
        map10.put("fr", new kotlin.Pair<>("Déconnecté", "Votre montre a été déconnectée. Vérifier si votre montre est en mode avion et la connectivité bluetooth de votre téléphone."));
        map10.put("pl", new kotlin.Pair<>("Rozłączony", "Twój zegarek został odłączony. Sprawdź tryb samolotowy na zegarku i stan Bluetooth w telefonie"));
        map10.put("it", new kotlin.Pair<>("Scollegato", "Il tuo orologio è scollegato. Per favore verifica che non sia in modalità aereo e che il bluetooth del telefono sia acceso"));
        watchDisconnectedMessagesMap = map9;
        java.util.HashMap<java.lang.String, powerwatch.matrix.com.pwgen2android.main.battery.GoalResource> map11 = new java.util.HashMap<>();
        java.util.HashMap<java.lang.String, powerwatch.matrix.com.pwgen2android.main.battery.GoalResource> map12 = map11;
        map12.put("en", new powerwatch.matrix.com.pwgen2android.main.battery.GoalResource("Goal achieved!", "Daily target of %d steps reached!", "Daily target of %s reached!", "Daily target of %s sleep reached!", "Daily target of %dµWh reached!"));
        map12.put("cs", new powerwatch.matrix.com.pwgen2android.main.battery.GoalResource("Dosažení cíle!", "Denní cíl %d kroků dosažen!", "Denní cíl %s dosažen!!", "Denní cíl %s spánku dosažen!", "Denní cíl %dµWh dosažen!"));
        map12.put("ja", new powerwatch.matrix.com.pwgen2android.main.battery.GoalResource("目標達成！", "一日の歩数目標達成！", "1日のカロリー目標達成！", "睡眠の目標達成！", "1日の充電量目標達成！"));
        map12.put("ko", new powerwatch.matrix.com.pwgen2android.main.battery.GoalResource("목표 달성!", "일 목표 %d 걸음 도달!", "일 목표 %s 도달!", "일 목표 %s 수면 도달!", "일 목표 %dµWh 도달!"));
        map12.put("pl", new powerwatch.matrix.com.pwgen2android.main.battery.GoalResource("Cel osiągnięty!", "Dzienny cel %d kroków osiągnięty!", "Dzienny cel %s osiągnięty!", "Dzienny cel %s snu osiągnięty!", "Dzienny cel %dµWh osiągnięty!"));
        map12.put("ru", new powerwatch.matrix.com.pwgen2android.main.battery.GoalResource("Цель достигнута!", "Ежедневная цель %d шагов достигнута!", "Ежедневная цель %s калорий достигнута!", "Ежедневная цель %s сна достигнута!", "Ежедневная цель %d мкВт*ч достигнута!"));
        map12.put("de", new powerwatch.matrix.com.pwgen2android.main.battery.GoalResource("Ziel erreicht!", "Ziel von %d Schritten erreicht!", "Ziel von %s erreicht!", "Ziel von %s Schlaf erreicht!", "Ziel von %dµWh erreicht!"));
        map12.put("fr", new powerwatch.matrix.com.pwgen2android.main.battery.GoalResource("Objectif atteint!", "Objectif journalier de %d pas atteint !", "Objectif journalier de %s atteint !", "Objectif journalier de %s de sommeil atteint !", "Objectif journalier de %dµWh atteint !"));
        map12.put("it", new powerwatch.matrix.com.pwgen2android.main.battery.GoalResource("Obiettivo raggiunto!", "Obiettivo giornaliero di %d passi raggiunto!", "Obiettivo giornaliero di %s raggiunto!", "Obiettivo di %s sonno raggiunto!", "Obiettivo di %dµWh raggiunto!"));
        map12.put("es", new powerwatch.matrix.com.pwgen2android.main.battery.GoalResource("Objetivo alcanzado!", "Objetivo diario de %d pasos alcanzado!", "Objetivo diario de %s alcanzado!", "Objetivo diario de  %s de sueño alcanzado!", "Objetivo diario de %dµWh alcanzado!"));
        resourceMap = map11;
        powerwatch.matrix.com.pwgen2android.main.battery.GoalResource goalResource = map11.get("en");
        kotlin.jvm.internal.Intrinsics.checkNotNull(goalResource);
        goalsAchievedResource = goalResource;
    }

    public static final java.util.HashMap<java.lang.String, java.lang.String> getBatteryTitleMap() {
        return batteryTitleMap;
    }

    public static final java.util.HashMap<java.lang.String, java.lang.String> getBatteryLowMessageMap() {
        return batteryLowMessageMap;
    }

    public static final java.util.HashMap<java.lang.String, java.lang.String> getBatteryCriticalMessageMap() {
        return batteryCriticalMessageMap;
    }

    public static final java.lang.String getWatchConnectedTitle() {
        return watchConnectedTitle;
    }

    public static final void setWatchConnectedTitle(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<set-?>");
        watchConnectedTitle = str;
    }

    public static final java.lang.String getWatchConnectedBody() {
        return watchConnectedBody;
    }

    public static final void setWatchConnectedBody(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<set-?>");
        watchConnectedBody = str;
    }

    public static final java.lang.String getWatchDisconnectedTitle() {
        return watchDisconnectedTitle;
    }

    public static final void setWatchDisconnectedTitle(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<set-?>");
        watchDisconnectedTitle = str;
    }

    public static final java.lang.String getWatchDisconnectedBody() {
        return watchDisconnectedBody;
    }

    public static final void setWatchDisconnectedBody(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<set-?>");
        watchDisconnectedBody = str;
    }

    public static final java.util.HashMap<java.lang.String, kotlin.Pair<java.lang.String, java.lang.String>> getWatchConnectedMessagesMap() {
        return watchConnectedMessagesMap;
    }

    public static final java.util.HashMap<java.lang.String, kotlin.Pair<java.lang.String, java.lang.String>> getWatchDisconnectedMessagesMap() {
        return watchDisconnectedMessagesMap;
    }

    public static final kotlin.Pair<java.lang.String, java.lang.String> getWatchConnectedMessage(java.lang.String languageKey, java.util.Map<java.lang.String, kotlin.Pair<java.lang.String, java.lang.String>> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(languageKey, "languageKey");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "map");
        kotlin.Pair<java.lang.String, java.lang.String> pair = map.containsKey(languageKey) ? map.get(languageKey) : null;
        if (pair != null) {
            return pair;
        }
        kotlin.Pair<java.lang.String, java.lang.String> pair2 = map.get("en");
        kotlin.jvm.internal.Intrinsics.checkNotNull(pair2);
        return pair2;
    }

    public static final java.lang.String getWatchConnectedTitle(java.lang.String languageKey) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(languageKey, "languageKey");
        return getWatchConnectedMessage(languageKey, watchConnectedMessagesMap).getFirst();
    }

    public static final java.lang.String getWatchConnectedBody(java.lang.String languageKey) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(languageKey, "languageKey");
        return getWatchConnectedMessage(languageKey, watchConnectedMessagesMap).getSecond();
    }

    public static final java.lang.String getWatchDisconnectedTitle(java.lang.String languageKey) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(languageKey, "languageKey");
        return getWatchConnectedMessage(languageKey, watchDisconnectedMessagesMap).getFirst();
    }

    public static final java.lang.String getWatchDisconnectedBody(java.lang.String languageKey) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(languageKey, "languageKey");
        return getWatchConnectedMessage(languageKey, watchDisconnectedMessagesMap).getSecond();
    }

    public static final java.util.HashMap<java.lang.String, powerwatch.matrix.com.pwgen2android.main.battery.GoalResource> getResourceMap() {
        return resourceMap;
    }

    public static final powerwatch.matrix.com.pwgen2android.main.battery.GoalResource getGoalsAchievedResource() {
        return goalsAchievedResource;
    }

    public static final void setGoalsAchievedResource(powerwatch.matrix.com.pwgen2android.main.battery.GoalResource goalResource) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(goalResource, "<set-?>");
        goalsAchievedResource = goalResource;
    }

    public static final powerwatch.matrix.com.pwgen2android.main.battery.GoalResource getGoalMessage(java.lang.String languageKey) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(languageKey, "languageKey");
        java.util.HashMap<java.lang.String, powerwatch.matrix.com.pwgen2android.main.battery.GoalResource> map = resourceMap;
        powerwatch.matrix.com.pwgen2android.main.battery.GoalResource goalResource = map.containsKey(languageKey) ? map.get(languageKey) : null;
        if (goalResource != null) {
            return goalResource;
        }
        powerwatch.matrix.com.pwgen2android.main.battery.GoalResource goalResource2 = map.get("en");
        kotlin.jvm.internal.Intrinsics.checkNotNull(goalResource2);
        return goalResource2;
    }
}
