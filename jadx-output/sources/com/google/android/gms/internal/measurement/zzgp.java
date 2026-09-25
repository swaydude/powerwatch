package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzgp {
    static java.lang.String zza(com.google.android.gms.internal.measurement.zzgo zzgoVar, java.lang.String str) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("# ");
        sb.append(str);
        zza(zzgoVar, sb, 0);
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:84:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:85:0x01f6  */
    private static void zza(com.google.android.gms.internal.measurement.zzgo zzgoVar, java.lang.StringBuilder sb, int i) {
        boolean zEquals;
        java.util.HashMap map = new java.util.HashMap();
        java.util.HashMap map2 = new java.util.HashMap();
        java.util.TreeSet<java.lang.String> treeSet = new java.util.TreeSet();
        for (java.lang.reflect.Method method : zzgoVar.getClass().getDeclaredMethods()) {
            map2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                map.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        for (java.lang.String str : treeSet) {
            java.lang.String strSubstring = str.startsWith("get") ? str.substring(3) : str;
            boolean zBooleanValue = true;
            if (strSubstring.endsWith("List") && !strSubstring.endsWith("OrBuilderList") && !strSubstring.equals("List")) {
                java.lang.String strValueOf = java.lang.String.valueOf(strSubstring.substring(0, 1).toLowerCase());
                java.lang.String strValueOf2 = java.lang.String.valueOf(strSubstring.substring(1, strSubstring.length() - 4));
                java.lang.String strConcat = strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new java.lang.String(strValueOf);
                java.lang.reflect.Method method2 = (java.lang.reflect.Method) map.get(str);
                if (method2 != null && method2.getReturnType().equals(java.util.List.class)) {
                    zza(sb, i, zza(strConcat), com.google.android.gms.internal.measurement.zzfd.zza(method2, zzgoVar, new java.lang.Object[0]));
                }
            }
            if (strSubstring.endsWith("Map") && !strSubstring.equals("Map")) {
                java.lang.String strValueOf3 = java.lang.String.valueOf(strSubstring.substring(0, 1).toLowerCase());
                java.lang.String strValueOf4 = java.lang.String.valueOf(strSubstring.substring(1, strSubstring.length() - 3));
                java.lang.String strConcat2 = strValueOf4.length() != 0 ? strValueOf3.concat(strValueOf4) : new java.lang.String(strValueOf3);
                java.lang.reflect.Method method3 = (java.lang.reflect.Method) map.get(str);
                if (method3 != null && method3.getReturnType().equals(java.util.Map.class) && !method3.isAnnotationPresent(java.lang.Deprecated.class) && java.lang.reflect.Modifier.isPublic(method3.getModifiers())) {
                    zza(sb, i, zza(strConcat2), com.google.android.gms.internal.measurement.zzfd.zza(method3, zzgoVar, new java.lang.Object[0]));
                }
            }
            java.lang.String strValueOf5 = java.lang.String.valueOf(strSubstring);
            if (((java.lang.reflect.Method) map2.get(strValueOf5.length() != 0 ? "set".concat(strValueOf5) : new java.lang.String("set"))) != null) {
                if (strSubstring.endsWith("Bytes")) {
                    java.lang.String strValueOf6 = java.lang.String.valueOf(strSubstring.substring(0, strSubstring.length() - 5));
                    if (!map.containsKey(strValueOf6.length() != 0 ? "get".concat(strValueOf6) : new java.lang.String("get"))) {
                    }
                }
                java.lang.String strValueOf7 = java.lang.String.valueOf(strSubstring.substring(0, 1).toLowerCase());
                java.lang.String strValueOf8 = java.lang.String.valueOf(strSubstring.substring(1));
                java.lang.String strConcat3 = strValueOf8.length() != 0 ? strValueOf7.concat(strValueOf8) : new java.lang.String(strValueOf7);
                java.lang.String strValueOf9 = java.lang.String.valueOf(strSubstring);
                java.lang.reflect.Method method4 = (java.lang.reflect.Method) map.get(strValueOf9.length() != 0 ? "get".concat(strValueOf9) : new java.lang.String("get"));
                java.lang.String strValueOf10 = java.lang.String.valueOf(strSubstring);
                java.lang.reflect.Method method5 = (java.lang.reflect.Method) map.get(strValueOf10.length() != 0 ? "has".concat(strValueOf10) : new java.lang.String("has"));
                if (method4 != null) {
                    java.lang.Object objZza = com.google.android.gms.internal.measurement.zzfd.zza(method4, zzgoVar, new java.lang.Object[0]);
                    if (method5 == null) {
                        if (objZza instanceof java.lang.Boolean) {
                            if (((java.lang.Boolean) objZza).booleanValue()) {
                                zEquals = false;
                            } else {
                                zEquals = true;
                            }
                        } else if (objZza instanceof java.lang.Integer) {
                            if (((java.lang.Integer) objZza).intValue() == 0) {
                                zEquals = true;
                            } else {
                                zEquals = false;
                            }
                        } else if (objZza instanceof java.lang.Float) {
                            if (((java.lang.Float) objZza).floatValue() == 0.0f) {
                                zEquals = true;
                            } else {
                                zEquals = false;
                            }
                        } else if (objZza instanceof java.lang.Double) {
                            if (((java.lang.Double) objZza).doubleValue() == 0.0d) {
                                zEquals = true;
                            } else {
                                zEquals = false;
                            }
                        } else if (objZza instanceof java.lang.String) {
                            zEquals = objZza.equals("");
                        } else if (objZza instanceof com.google.android.gms.internal.measurement.zzdu) {
                            zEquals = objZza.equals(com.google.android.gms.internal.measurement.zzdu.zza);
                        } else if (!(objZza instanceof com.google.android.gms.internal.measurement.zzgo) ? !((objZza instanceof java.lang.Enum) && ((java.lang.Enum) objZza).ordinal() == 0) : objZza != ((com.google.android.gms.internal.measurement.zzgo) objZza).zzbt()) {
                            zEquals = false;
                        } else {
                            zEquals = true;
                        }
                        if (zEquals) {
                            zBooleanValue = false;
                        }
                    } else {
                        zBooleanValue = ((java.lang.Boolean) com.google.android.gms.internal.measurement.zzfd.zza(method5, zzgoVar, new java.lang.Object[0])).booleanValue();
                    }
                    if (zBooleanValue) {
                        zza(sb, i, zza(strConcat3), objZza);
                    }
                }
            }
        }
        if (zzgoVar instanceof com.google.android.gms.internal.measurement.zzfd.zzd) {
            java.util.Iterator<java.util.Map.Entry<T, java.lang.Object>> itZzd = ((com.google.android.gms.internal.measurement.zzfd.zzd) zzgoVar).zzc.zzd();
            if (itZzd.hasNext()) {
                throw new java.lang.NoSuchMethodError();
            }
        }
        com.google.android.gms.internal.measurement.zzfd zzfdVar = (com.google.android.gms.internal.measurement.zzfd) zzgoVar;
        if (zzfdVar.zzb != null) {
            zzfdVar.zzb.zza(sb, i);
        }
    }

    static final void zza(java.lang.StringBuilder sb, int i, java.lang.String str, java.lang.Object obj) {
        if (obj instanceof java.util.List) {
            java.util.Iterator it = ((java.util.List) obj).iterator();
            while (it.hasNext()) {
                zza(sb, i, str, it.next());
            }
            return;
        }
        if (obj instanceof java.util.Map) {
            java.util.Iterator it2 = ((java.util.Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                zza(sb, i, str, (java.util.Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            sb.append(' ');
        }
        sb.append(str);
        if (obj instanceof java.lang.String) {
            sb.append(": \"");
            sb.append(com.google.android.gms.internal.measurement.zzhr.zza(com.google.android.gms.internal.measurement.zzdu.zza((java.lang.String) obj)));
            sb.append(kotlin.text.Typography.quote);
            return;
        }
        if (obj instanceof com.google.android.gms.internal.measurement.zzdu) {
            sb.append(": \"");
            sb.append(com.google.android.gms.internal.measurement.zzhr.zza((com.google.android.gms.internal.measurement.zzdu) obj));
            sb.append(kotlin.text.Typography.quote);
            return;
        }
        if (obj instanceof com.google.android.gms.internal.measurement.zzfd) {
            sb.append(" {");
            zza((com.google.android.gms.internal.measurement.zzfd) obj, sb, i + 2);
            sb.append("\n");
            while (i2 < i) {
                sb.append(' ');
                i2++;
            }
            sb.append("}");
            return;
        }
        if (obj instanceof java.util.Map.Entry) {
            sb.append(" {");
            java.util.Map.Entry entry = (java.util.Map.Entry) obj;
            int i4 = i + 2;
            zza(sb, i4, "key", entry.getKey());
            zza(sb, i4, "value", entry.getValue());
            sb.append("\n");
            while (i2 < i) {
                sb.append(' ');
                i2++;
            }
            sb.append("}");
            return;
        }
        sb.append(": ");
        sb.append(obj.toString());
    }

    private static final java.lang.String zza(java.lang.String str) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (java.lang.Character.isUpperCase(cCharAt)) {
                sb.append(io.fabric.sdk.android.services.events.EventsFilesManager.ROLL_OVER_FILE_NAME_SEPARATOR);
            }
            sb.append(java.lang.Character.toLowerCase(cCharAt));
        }
        return sb.toString();
    }
}
