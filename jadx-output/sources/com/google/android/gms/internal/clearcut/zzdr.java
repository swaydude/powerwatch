package com.google.android.gms.internal.clearcut;

/* JADX INFO: loaded from: classes.dex */
final class zzdr {
    static java.lang.String zza(com.google.android.gms.internal.clearcut.zzdo zzdoVar, java.lang.String str) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("# ");
        sb.append(str);
        zza(zzdoVar, sb, 0);
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:80:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:81:0x01f6  */
    private static void zza(com.google.android.gms.internal.clearcut.zzdo zzdoVar, java.lang.StringBuilder sb, int i) {
        boolean zEquals;
        java.util.HashMap map = new java.util.HashMap();
        java.util.HashMap map2 = new java.util.HashMap();
        java.util.TreeSet<java.lang.String> treeSet = new java.util.TreeSet();
        for (java.lang.reflect.Method method : zzdoVar.getClass().getDeclaredMethods()) {
            map2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                map.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        for (java.lang.String str : treeSet) {
            java.lang.Object obj = "";
            java.lang.String strReplaceFirst = str.replaceFirst("get", "");
            boolean zBooleanValue = true;
            if (strReplaceFirst.endsWith("List") && !strReplaceFirst.endsWith("OrBuilderList") && !strReplaceFirst.equals("List")) {
                java.lang.String strValueOf = java.lang.String.valueOf(strReplaceFirst.substring(0, 1).toLowerCase());
                java.lang.String strValueOf2 = java.lang.String.valueOf(strReplaceFirst.substring(1, strReplaceFirst.length() - 4));
                java.lang.String strConcat = strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new java.lang.String(strValueOf);
                java.lang.reflect.Method method2 = (java.lang.reflect.Method) map.get(str);
                if (method2 != null && method2.getReturnType().equals(java.util.List.class)) {
                    zza(sb, i, zzj(strConcat), com.google.android.gms.internal.clearcut.zzcg.zza(method2, zzdoVar, new java.lang.Object[0]));
                }
            }
            if (strReplaceFirst.endsWith("Map") && !strReplaceFirst.equals("Map")) {
                java.lang.String strValueOf3 = java.lang.String.valueOf(strReplaceFirst.substring(0, 1).toLowerCase());
                java.lang.String strValueOf4 = java.lang.String.valueOf(strReplaceFirst.substring(1, strReplaceFirst.length() - 3));
                java.lang.String strConcat2 = strValueOf4.length() != 0 ? strValueOf3.concat(strValueOf4) : new java.lang.String(strValueOf3);
                java.lang.reflect.Method method3 = (java.lang.reflect.Method) map.get(str);
                if (method3 != null && method3.getReturnType().equals(java.util.Map.class) && !method3.isAnnotationPresent(java.lang.Deprecated.class) && java.lang.reflect.Modifier.isPublic(method3.getModifiers())) {
                    zza(sb, i, zzj(strConcat2), com.google.android.gms.internal.clearcut.zzcg.zza(method3, zzdoVar, new java.lang.Object[0]));
                }
            }
            java.lang.String strValueOf5 = java.lang.String.valueOf(strReplaceFirst);
            if (((java.lang.reflect.Method) map2.get(strValueOf5.length() != 0 ? "set".concat(strValueOf5) : new java.lang.String("set"))) != null) {
                if (strReplaceFirst.endsWith("Bytes")) {
                    java.lang.String strValueOf6 = java.lang.String.valueOf(strReplaceFirst.substring(0, strReplaceFirst.length() - 5));
                    if (!map.containsKey(strValueOf6.length() != 0 ? "get".concat(strValueOf6) : new java.lang.String("get"))) {
                    }
                }
                java.lang.String strValueOf7 = java.lang.String.valueOf(strReplaceFirst.substring(0, 1).toLowerCase());
                java.lang.String strValueOf8 = java.lang.String.valueOf(strReplaceFirst.substring(1));
                java.lang.String strConcat3 = strValueOf8.length() != 0 ? strValueOf7.concat(strValueOf8) : new java.lang.String(strValueOf7);
                java.lang.String strValueOf9 = java.lang.String.valueOf(strReplaceFirst);
                java.lang.reflect.Method method4 = (java.lang.reflect.Method) map.get(strValueOf9.length() != 0 ? "get".concat(strValueOf9) : new java.lang.String("get"));
                java.lang.String strValueOf10 = java.lang.String.valueOf(strReplaceFirst);
                java.lang.reflect.Method method5 = (java.lang.reflect.Method) map.get(strValueOf10.length() != 0 ? "has".concat(strValueOf10) : new java.lang.String("has"));
                if (method4 != null) {
                    java.lang.Object objZza = com.google.android.gms.internal.clearcut.zzcg.zza(method4, zzdoVar, new java.lang.Object[0]);
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
                        } else if (!(objZza instanceof java.lang.Double)) {
                            if (!(objZza instanceof java.lang.String)) {
                                if (objZza instanceof com.google.android.gms.internal.clearcut.zzbb) {
                                    obj = com.google.android.gms.internal.clearcut.zzbb.zzfi;
                                } else if (!(objZza instanceof com.google.android.gms.internal.clearcut.zzdo) ? !((objZza instanceof java.lang.Enum) && ((java.lang.Enum) objZza).ordinal() == 0) : objZza != ((com.google.android.gms.internal.clearcut.zzdo) objZza).zzbe()) {
                                    zEquals = false;
                                } else {
                                    zEquals = true;
                                }
                            }
                            zEquals = objZza.equals(obj);
                        } else if (((java.lang.Double) objZza).doubleValue() == 0.0d) {
                            zEquals = true;
                        } else {
                            zEquals = false;
                        }
                        if (zEquals) {
                            zBooleanValue = false;
                        }
                    } else {
                        zBooleanValue = ((java.lang.Boolean) com.google.android.gms.internal.clearcut.zzcg.zza(method5, zzdoVar, new java.lang.Object[0])).booleanValue();
                    }
                    if (zBooleanValue) {
                        zza(sb, i, zzj(strConcat3), objZza);
                    }
                }
            }
        }
        if (zzdoVar instanceof com.google.android.gms.internal.clearcut.zzcg.zzd) {
            java.util.Iterator<java.util.Map.Entry<FieldDescriptorType, java.lang.Object>> it = ((com.google.android.gms.internal.clearcut.zzcg.zzd) zzdoVar).zzjv.iterator();
            while (it.hasNext()) {
                java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                int i2 = ((com.google.android.gms.internal.clearcut.zzcg.zze) entry.getKey()).number;
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder(13);
                sb2.append("[");
                sb2.append(i2);
                sb2.append("]");
                zza(sb, i, sb2.toString(), entry.getValue());
            }
        }
        com.google.android.gms.internal.clearcut.zzcg zzcgVar = (com.google.android.gms.internal.clearcut.zzcg) zzdoVar;
        if (zzcgVar.zzjp != null) {
            zzcgVar.zzjp.zza(sb, i);
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
            sb.append(com.google.android.gms.internal.clearcut.zzet.zzc(com.google.android.gms.internal.clearcut.zzbb.zzf((java.lang.String) obj)));
            sb.append(kotlin.text.Typography.quote);
            return;
        }
        if (obj instanceof com.google.android.gms.internal.clearcut.zzbb) {
            sb.append(": \"");
            sb.append(com.google.android.gms.internal.clearcut.zzet.zzc((com.google.android.gms.internal.clearcut.zzbb) obj));
            sb.append(kotlin.text.Typography.quote);
            return;
        }
        if (obj instanceof com.google.android.gms.internal.clearcut.zzcg) {
            sb.append(" {");
            zza((com.google.android.gms.internal.clearcut.zzcg) obj, sb, i + 2);
            sb.append("\n");
            while (i2 < i) {
                sb.append(' ');
                i2++;
            }
            sb.append("}");
            return;
        }
        if (!(obj instanceof java.util.Map.Entry)) {
            sb.append(": ");
            sb.append(obj.toString());
            return;
        }
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
    }

    private static final java.lang.String zzj(java.lang.String str) {
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
