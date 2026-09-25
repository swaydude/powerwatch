package powerwatch.matrix.com.pwgen2android.sdk.protocol;

/* JADX INFO: compiled from: ProtocolCreator.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolCreatorImpl;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolCreator;", "()V", "createProtocols", "", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Protocol;", "technologyType", "Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;", "bleCreatorConfig", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/BleCreatorConfig;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class ProtocolCreatorImpl implements powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolCreator {
    @Override // powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolCreator
    public java.util.List<powerwatch.matrix.com.pwgen2android.sdk.protocol.Protocol> createProtocols(powerwatch.matrix.com.pwgen2android.sdk.technologies.TechnologyType technologyType, powerwatch.matrix.com.pwgen2android.sdk.protocol.BleCreatorConfig bleCreatorConfig) {
        java.lang.Object next;
        java.lang.Object next2;
        java.lang.Object next3;
        java.util.UUID uuid;
        java.lang.String string;
        java.lang.String string2;
        java.lang.Object next4;
        java.util.UUID uuid2;
        java.lang.String string3;
        java.lang.Object next5;
        java.util.UUID uuid3;
        java.lang.String string4;
        java.lang.Object next6;
        java.util.UUID uuid4;
        java.lang.String string5;
        java.lang.String string6;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(technologyType, "technologyType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bleCreatorConfig, "bleCreatorConfig");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Set<java.util.UUID> set = bleCreatorConfig.getServices().get(powerwatch.matrix.com.pwgen2android.sdk.protocol.BLEService.OtaService.INSTANCE.getService());
        if (set != null) {
            arrayList.add(new powerwatch.matrix.com.pwgen2android.sdk.protocol.OTAProtocol(null, 1, null));
        }
        java.util.Set<java.util.UUID> set2 = bleCreatorConfig.getServices().get(powerwatch.matrix.com.pwgen2android.sdk.protocol.BLEService.DtpService.INSTANCE.getService());
        if (set2 != null) {
            if (set == null) {
                if (set2.contains(java.util.UUID.fromString(powerwatch.matrix.com.pwgen2android.sdk.protocol.BLEServicesKt.BASIC_DTP_SERVICE_PWX_RX))) {
                    arrayList.add(new powerwatch.matrix.com.pwgen2android.sdk.protocol.DTPXProtocol(null, 1, null));
                } else {
                    arrayList.add(new powerwatch.matrix.com.pwgen2android.sdk.protocol.DTPProtocol(null, 1, null));
                }
            } else {
                java.util.Iterator<T> it = bleCreatorConfig.getServices().keySet().iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    string6 = ((java.util.UUID) next).toString();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string6, "it.toString()");
                } while (!kotlin.text.StringsKt.contains((java.lang.CharSequence) kotlin.text.StringsKt.split$default((java.lang.CharSequence) string6, new java.lang.String[]{"-"}, false, 0, 6, (java.lang.Object) null).get(0), (java.lang.CharSequence) powerwatch.matrix.com.pwgen2android.sdk.protocol.BLEServicesKt.GEN2_DEVICE_INFO, true));
                java.util.UUID uuid5 = (java.util.UUID) next;
                if (uuid5 != null) {
                    java.util.Set<java.util.UUID> set3 = bleCreatorConfig.getServices().get(uuid5);
                    if (set3 == null) {
                        uuid2 = null;
                    } else {
                        java.util.Iterator<T> it2 = set3.iterator();
                        do {
                            if (!it2.hasNext()) {
                                next4 = null;
                                break;
                            }
                            next4 = it2.next();
                            string3 = ((java.util.UUID) next4).toString();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string3, "char.toString()");
                        } while (!kotlin.text.StringsKt.contains((java.lang.CharSequence) string3, (java.lang.CharSequence) powerwatch.matrix.com.pwgen2android.sdk.protocol.BLEServicesKt.GEN2_FIRMWARE_INFO, true));
                        uuid2 = (java.util.UUID) next4;
                    }
                    java.util.Set<java.util.UUID> set4 = bleCreatorConfig.getServices().get(uuid5);
                    if (set4 == null) {
                        uuid3 = null;
                    } else {
                        java.util.Iterator<T> it3 = set4.iterator();
                        do {
                            if (!it3.hasNext()) {
                                next5 = null;
                                break;
                            }
                            next5 = it3.next();
                            string4 = ((java.util.UUID) next5).toString();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string4, "char.toString()");
                        } while (!kotlin.text.StringsKt.contains((java.lang.CharSequence) string4, (java.lang.CharSequence) powerwatch.matrix.com.pwgen2android.sdk.protocol.BLEServicesKt.GEN2_SERIAL_INFO, true));
                        uuid3 = (java.util.UUID) next5;
                    }
                    java.util.Set<java.util.UUID> set5 = bleCreatorConfig.getServices().get(uuid5);
                    if (set5 == null) {
                        uuid4 = null;
                    } else {
                        java.util.Iterator<T> it4 = set5.iterator();
                        do {
                            if (!it4.hasNext()) {
                                next6 = null;
                                break;
                            }
                            next6 = it4.next();
                            string5 = ((java.util.UUID) next6).toString();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string5, "char.toString()");
                        } while (!kotlin.text.StringsKt.contains((java.lang.CharSequence) string5, (java.lang.CharSequence) powerwatch.matrix.com.pwgen2android.sdk.protocol.BLEServicesKt.GEN2_SETTINGS_INFO, true));
                        uuid4 = (java.util.UUID) next6;
                    }
                    if (uuid2 != null) {
                        arrayList.add(new powerwatch.matrix.com.pwgen2android.sdk.protocol.Gen2Protocol(kotlin.collections.MapsKt.mapOf(new kotlin.Pair(powerwatch.matrix.com.pwgen2android.sdk.channels.CharacteristicType.FIRMWARE, uuid2.toString())), new powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolParserImpl()));
                        java.util.Map mapMutableMapOf = kotlin.collections.MapsKt.mutableMapOf(new kotlin.Pair(powerwatch.matrix.com.pwgen2android.sdk.channels.CharacteristicType.FIRMWARE, uuid2.toString()));
                        if (uuid3 != null) {
                            powerwatch.matrix.com.pwgen2android.sdk.channels.CharacteristicType characteristicType = powerwatch.matrix.com.pwgen2android.sdk.channels.CharacteristicType.SERIAL;
                            java.lang.String string7 = uuid3.toString();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string7, "serialChar.toString()");
                            mapMutableMapOf.put(characteristicType, string7);
                        }
                        if (uuid4 != null) {
                            powerwatch.matrix.com.pwgen2android.sdk.channels.CharacteristicType characteristicType2 = powerwatch.matrix.com.pwgen2android.sdk.channels.CharacteristicType.SETTINGS_INFO;
                            java.lang.String string8 = uuid4.toString();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string8, "settingsInfoChar.toString()");
                            mapMutableMapOf.put(characteristicType2, string8);
                        }
                        arrayList.add(new powerwatch.matrix.com.pwgen2android.sdk.protocol.Gen2ProtocolBasics(mapMutableMapOf, new powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolParserImpl()));
                    }
                }
                java.util.Iterator<T> it5 = bleCreatorConfig.getServices().keySet().iterator();
                do {
                    if (!it5.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it5.next();
                    string2 = ((java.util.UUID) next2).toString();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "it.toString()");
                } while (!kotlin.text.StringsKt.contains((java.lang.CharSequence) kotlin.text.StringsKt.split$default((java.lang.CharSequence) string2, new java.lang.String[]{"-"}, false, 0, 6, (java.lang.Object) null).get(0), (java.lang.CharSequence) powerwatch.matrix.com.pwgen2android.sdk.protocol.BLEServicesKt.GEN2_HEART_RATE_SERVICE, true));
                java.util.UUID uuid6 = (java.util.UUID) next2;
                if (uuid6 != null) {
                    java.util.Set<java.util.UUID> set6 = bleCreatorConfig.getServices().get(uuid6);
                    if (set6 == null) {
                        uuid = null;
                    } else {
                        java.util.Iterator<T> it6 = set6.iterator();
                        do {
                            if (!it6.hasNext()) {
                                next3 = null;
                                break;
                            }
                            next3 = it6.next();
                            string = ((java.util.UUID) next3).toString();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "char.toString()");
                        } while (!kotlin.text.StringsKt.contains((java.lang.CharSequence) string, (java.lang.CharSequence) powerwatch.matrix.com.pwgen2android.sdk.protocol.BLEServicesKt.GEN2_HEART_RATE_INFO, true));
                        uuid = (java.util.UUID) next3;
                    }
                    if (uuid != null) {
                        arrayList.add(new powerwatch.matrix.com.pwgen2android.sdk.protocol.Gen2HeartRateProtocol(uuid, null, 2, null));
                    }
                }
            }
        }
        return arrayList;
    }
}
