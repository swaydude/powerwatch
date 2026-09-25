package com.google.android.gms.common.server.response;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public class FastParser<T extends com.google.android.gms.common.server.response.FastJsonResponse> {
    private static final char[] zaqu = {'u', 'l', 'l'};
    private static final char[] zaqv = {'r', 'u', 'e'};
    private static final char[] zaqw = {'r', 'u', 'e', kotlin.text.Typography.quote};
    private static final char[] zaqx = {'a', 'l', 's', 'e'};
    private static final char[] zaqy = {'a', 'l', 's', 'e', kotlin.text.Typography.quote};
    private static final char[] zaqz = {'\n'};
    private static final com.google.android.gms.common.server.response.FastParser.zaa<java.lang.Integer> zarb = new com.google.android.gms.common.server.response.zab();
    private static final com.google.android.gms.common.server.response.FastParser.zaa<java.lang.Long> zarc = new com.google.android.gms.common.server.response.zaa();
    private static final com.google.android.gms.common.server.response.FastParser.zaa<java.lang.Float> zard = new com.google.android.gms.common.server.response.zad();
    private static final com.google.android.gms.common.server.response.FastParser.zaa<java.lang.Double> zare = new com.google.android.gms.common.server.response.zac();
    private static final com.google.android.gms.common.server.response.FastParser.zaa<java.lang.Boolean> zarf = new com.google.android.gms.common.server.response.zaf();
    private static final com.google.android.gms.common.server.response.FastParser.zaa<java.lang.String> zarg = new com.google.android.gms.common.server.response.zae();
    private static final com.google.android.gms.common.server.response.FastParser.zaa<java.math.BigInteger> zarh = new com.google.android.gms.common.server.response.zah();
    private static final com.google.android.gms.common.server.response.FastParser.zaa<java.math.BigDecimal> zari = new com.google.android.gms.common.server.response.zag();
    private final char[] zaqp = new char[1];
    private final char[] zaqq = new char[32];
    private final char[] zaqr = new char[1024];
    private final java.lang.StringBuilder zaqs = new java.lang.StringBuilder(32);
    private final java.lang.StringBuilder zaqt = new java.lang.StringBuilder(1024);
    private final java.util.Stack<java.lang.Integer> zara = new java.util.Stack<>();

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    interface zaa<O> {
        O zah(com.google.android.gms.common.server.response.FastParser fastParser, java.io.BufferedReader bufferedReader) throws com.google.android.gms.common.server.response.FastParser.ParseException, java.io.IOException;
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    public static class ParseException extends java.lang.Exception {
        public ParseException(java.lang.String str) {
            super(str);
        }

        public ParseException(java.lang.String str, java.lang.Throwable th) {
            super(str, th);
        }

        public ParseException(java.lang.Throwable th) {
            super(th);
        }
    }

    public void parse(java.io.InputStream inputStream, T t) throws com.google.android.gms.common.server.response.FastParser.ParseException {
        java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(inputStream), 1024);
        try {
            try {
                this.zara.push(0);
                char cZaj = zaj(bufferedReader);
                if (cZaj == 0) {
                    throw new com.google.android.gms.common.server.response.FastParser.ParseException("No data to parse");
                }
                if (cZaj == '[') {
                    this.zara.push(5);
                    java.util.Map<java.lang.String, com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?>> fieldMappings = t.getFieldMappings();
                    if (fieldMappings.size() != 1) {
                        throw new com.google.android.gms.common.server.response.FastParser.ParseException("Object array response class must have a single Field");
                    }
                    com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?> value = fieldMappings.entrySet().iterator().next().getValue();
                    t.addConcreteTypeArrayInternal(value, value.zaqj, zaa(bufferedReader, value));
                } else if (cZaj == '{') {
                    this.zara.push(1);
                    zaa(bufferedReader, t);
                } else {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder(19);
                    sb.append("Unexpected token: ");
                    sb.append(cZaj);
                    throw new com.google.android.gms.common.server.response.FastParser.ParseException(sb.toString());
                }
                zak(0);
                try {
                    bufferedReader.close();
                } catch (java.io.IOException unused) {
                    android.util.Log.w("FastParser", "Failed to close reader while parsing.");
                }
            } catch (java.io.IOException e) {
                throw new com.google.android.gms.common.server.response.FastParser.ParseException(e);
            }
        } catch (java.lang.Throwable th) {
            try {
                bufferedReader.close();
            } catch (java.io.IOException unused2) {
                android.util.Log.w("FastParser", "Failed to close reader while parsing.");
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:119:0x027f  */
    /* JADX WARN: Code duplicated, block: B:138:0x029b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:139:0x0282 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:140:0x027d A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    private final boolean zaa(java.io.BufferedReader bufferedReader, com.google.android.gms.common.server.response.FastJsonResponse fastJsonResponse) throws com.google.android.gms.common.server.response.FastParser.ParseException, java.io.IOException {
        int i;
        java.util.HashMap map;
        char cZaj;
        java.util.Map<java.lang.String, com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?>> fieldMappings = fastJsonResponse.getFieldMappings();
        java.lang.String strZaa = zaa(bufferedReader);
        if (strZaa == null) {
            zak(1);
            return false;
        }
        while (strZaa != null) {
            com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?> field = fieldMappings.get(strZaa);
            if (field == null) {
                strZaa = zab(bufferedReader);
            } else {
                this.zara.push(4);
                switch (field.zaqf) {
                    case 0:
                        if (field.zaqg) {
                            fastJsonResponse.zaa((com.google.android.gms.common.server.response.FastJsonResponse.Field) field, (java.util.ArrayList<java.lang.Integer>) zaa(bufferedReader, zarb));
                        } else {
                            fastJsonResponse.zaa((com.google.android.gms.common.server.response.FastJsonResponse.Field) field, zad(bufferedReader));
                        }
                        i = 4;
                        zak(i);
                        zak(2);
                        cZaj = zaj(bufferedReader);
                        if (cZaj != ',') {
                            strZaa = zaa(bufferedReader);
                        } else {
                            if (cZaj == '}') {
                                java.lang.StringBuilder sb = new java.lang.StringBuilder(55);
                                sb.append("Expected end of object or field separator, but found: ");
                                sb.append(cZaj);
                                throw new com.google.android.gms.common.server.response.FastParser.ParseException(sb.toString());
                            }
                            strZaa = null;
                        }
                        break;
                    case 1:
                        if (field.zaqg) {
                            fastJsonResponse.zab((com.google.android.gms.common.server.response.FastJsonResponse.Field) field, (java.util.ArrayList<java.math.BigInteger>) zaa(bufferedReader, zarh));
                        } else {
                            fastJsonResponse.zaa((com.google.android.gms.common.server.response.FastJsonResponse.Field) field, zaf(bufferedReader));
                        }
                        i = 4;
                        zak(i);
                        zak(2);
                        cZaj = zaj(bufferedReader);
                        if (cZaj != ',') {
                            strZaa = zaa(bufferedReader);
                        } else {
                            if (cZaj == '}') {
                                java.lang.StringBuilder sb2 = new java.lang.StringBuilder(55);
                                sb2.append("Expected end of object or field separator, but found: ");
                                sb2.append(cZaj);
                                throw new com.google.android.gms.common.server.response.FastParser.ParseException(sb2.toString());
                            }
                            strZaa = null;
                        }
                        break;
                    case 2:
                        if (field.zaqg) {
                            fastJsonResponse.zac(field, zaa(bufferedReader, zarc));
                        } else {
                            fastJsonResponse.zaa((com.google.android.gms.common.server.response.FastJsonResponse.Field) field, zae(bufferedReader));
                        }
                        i = 4;
                        zak(i);
                        zak(2);
                        cZaj = zaj(bufferedReader);
                        if (cZaj != ',') {
                            strZaa = zaa(bufferedReader);
                        } else {
                            if (cZaj == '}') {
                                java.lang.StringBuilder sb3 = new java.lang.StringBuilder(55);
                                sb3.append("Expected end of object or field separator, but found: ");
                                sb3.append(cZaj);
                                throw new com.google.android.gms.common.server.response.FastParser.ParseException(sb3.toString());
                            }
                            strZaa = null;
                        }
                        break;
                    case 3:
                        if (field.zaqg) {
                            fastJsonResponse.zad(field, zaa(bufferedReader, zard));
                        } else {
                            fastJsonResponse.zaa((com.google.android.gms.common.server.response.FastJsonResponse.Field) field, zag(bufferedReader));
                        }
                        i = 4;
                        zak(i);
                        zak(2);
                        cZaj = zaj(bufferedReader);
                        if (cZaj != ',') {
                            strZaa = zaa(bufferedReader);
                        } else {
                            if (cZaj == '}') {
                                java.lang.StringBuilder sb4 = new java.lang.StringBuilder(55);
                                sb4.append("Expected end of object or field separator, but found: ");
                                sb4.append(cZaj);
                                throw new com.google.android.gms.common.server.response.FastParser.ParseException(sb4.toString());
                            }
                            strZaa = null;
                        }
                        break;
                    case 4:
                        if (field.zaqg) {
                            fastJsonResponse.zae(field, zaa(bufferedReader, zare));
                        } else {
                            fastJsonResponse.zaa(field, zah(bufferedReader));
                        }
                        i = 4;
                        zak(i);
                        zak(2);
                        cZaj = zaj(bufferedReader);
                        if (cZaj != ',') {
                            strZaa = zaa(bufferedReader);
                        } else {
                            if (cZaj == '}') {
                                java.lang.StringBuilder sb5 = new java.lang.StringBuilder(55);
                                sb5.append("Expected end of object or field separator, but found: ");
                                sb5.append(cZaj);
                                throw new com.google.android.gms.common.server.response.FastParser.ParseException(sb5.toString());
                            }
                            strZaa = null;
                        }
                        break;
                    case 5:
                        if (field.zaqg) {
                            fastJsonResponse.zaf(field, zaa(bufferedReader, zari));
                        } else {
                            fastJsonResponse.zaa((com.google.android.gms.common.server.response.FastJsonResponse.Field) field, zai(bufferedReader));
                        }
                        i = 4;
                        zak(i);
                        zak(2);
                        cZaj = zaj(bufferedReader);
                        if (cZaj != ',') {
                            strZaa = zaa(bufferedReader);
                        } else {
                            if (cZaj == '}') {
                                java.lang.StringBuilder sb6 = new java.lang.StringBuilder(55);
                                sb6.append("Expected end of object or field separator, but found: ");
                                sb6.append(cZaj);
                                throw new com.google.android.gms.common.server.response.FastParser.ParseException(sb6.toString());
                            }
                            strZaa = null;
                        }
                        break;
                    case 6:
                        if (field.zaqg) {
                            fastJsonResponse.zag(field, zaa(bufferedReader, zarf));
                            i = 4;
                            zak(i);
                            zak(2);
                            cZaj = zaj(bufferedReader);
                            if (cZaj != ',') {
                                strZaa = zaa(bufferedReader);
                            } else {
                                if (cZaj == '}') {
                                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder(55);
                                    sb7.append("Expected end of object or field separator, but found: ");
                                    sb7.append(cZaj);
                                    throw new com.google.android.gms.common.server.response.FastParser.ParseException(sb7.toString());
                                }
                                strZaa = null;
                            }
                        } else {
                            fastJsonResponse.zaa(field, zaa(bufferedReader, false));
                            i = 4;
                            zak(i);
                            zak(2);
                            cZaj = zaj(bufferedReader);
                            if (cZaj != ',') {
                                strZaa = zaa(bufferedReader);
                            } else {
                                if (cZaj == '}') {
                                    java.lang.StringBuilder sb8 = new java.lang.StringBuilder(55);
                                    sb8.append("Expected end of object or field separator, but found: ");
                                    sb8.append(cZaj);
                                    throw new com.google.android.gms.common.server.response.FastParser.ParseException(sb8.toString());
                                }
                                strZaa = null;
                            }
                        }
                        break;
                    case 7:
                        if (field.zaqg) {
                            fastJsonResponse.zah(field, zaa(bufferedReader, zarg));
                        } else {
                            fastJsonResponse.zaa((com.google.android.gms.common.server.response.FastJsonResponse.Field) field, zac(bufferedReader));
                        }
                        i = 4;
                        zak(i);
                        zak(2);
                        cZaj = zaj(bufferedReader);
                        if (cZaj != ',') {
                            strZaa = zaa(bufferedReader);
                        } else {
                            if (cZaj == '}') {
                                java.lang.StringBuilder sb9 = new java.lang.StringBuilder(55);
                                sb9.append("Expected end of object or field separator, but found: ");
                                sb9.append(cZaj);
                                throw new com.google.android.gms.common.server.response.FastParser.ParseException(sb9.toString());
                            }
                            strZaa = null;
                        }
                        break;
                    case 8:
                        fastJsonResponse.zaa((com.google.android.gms.common.server.response.FastJsonResponse.Field) field, com.google.android.gms.common.util.Base64Utils.decode(zaa(bufferedReader, this.zaqr, this.zaqt, zaqz)));
                        i = 4;
                        zak(i);
                        zak(2);
                        cZaj = zaj(bufferedReader);
                        if (cZaj != ',') {
                            strZaa = zaa(bufferedReader);
                        } else {
                            if (cZaj == '}') {
                                java.lang.StringBuilder sb10 = new java.lang.StringBuilder(55);
                                sb10.append("Expected end of object or field separator, but found: ");
                                sb10.append(cZaj);
                                throw new com.google.android.gms.common.server.response.FastParser.ParseException(sb10.toString());
                            }
                            strZaa = null;
                        }
                        break;
                    case 9:
                        fastJsonResponse.zaa((com.google.android.gms.common.server.response.FastJsonResponse.Field) field, com.google.android.gms.common.util.Base64Utils.decodeUrlSafe(zaa(bufferedReader, this.zaqr, this.zaqt, zaqz)));
                        i = 4;
                        zak(i);
                        zak(2);
                        cZaj = zaj(bufferedReader);
                        if (cZaj != ',') {
                            strZaa = zaa(bufferedReader);
                        } else {
                            if (cZaj == '}') {
                                java.lang.StringBuilder sb11 = new java.lang.StringBuilder(55);
                                sb11.append("Expected end of object or field separator, but found: ");
                                sb11.append(cZaj);
                                throw new com.google.android.gms.common.server.response.FastParser.ParseException(sb11.toString());
                            }
                            strZaa = null;
                        }
                        break;
                    case 10:
                        char cZaj2 = zaj(bufferedReader);
                        if (cZaj2 == 'n') {
                            zab(bufferedReader, zaqu);
                            map = null;
                        } else {
                            if (cZaj2 != '{') {
                                throw new com.google.android.gms.common.server.response.FastParser.ParseException("Expected start of a map object");
                            }
                            this.zara.push(1);
                            map = new java.util.HashMap();
                            while (true) {
                                char cZaj3 = zaj(bufferedReader);
                                if (cZaj3 == 0) {
                                    throw new com.google.android.gms.common.server.response.FastParser.ParseException("Unexpected EOF");
                                }
                                if (cZaj3 == '\"') {
                                    java.lang.String strZab = zab(bufferedReader, this.zaqq, this.zaqs, null);
                                    if (zaj(bufferedReader) != ':') {
                                        java.lang.String strValueOf = java.lang.String.valueOf(strZab);
                                        throw new com.google.android.gms.common.server.response.FastParser.ParseException(strValueOf.length() != 0 ? "No map value found for key ".concat(strValueOf) : new java.lang.String("No map value found for key "));
                                    }
                                    if (zaj(bufferedReader) != '\"') {
                                        java.lang.String strValueOf2 = java.lang.String.valueOf(strZab);
                                        throw new com.google.android.gms.common.server.response.FastParser.ParseException(strValueOf2.length() != 0 ? "Expected String value for key ".concat(strValueOf2) : new java.lang.String("Expected String value for key "));
                                    }
                                    map.put(strZab, zab(bufferedReader, this.zaqq, this.zaqs, null));
                                    char cZaj4 = zaj(bufferedReader);
                                    if (cZaj4 != ',') {
                                        if (cZaj4 == '}') {
                                            zak(1);
                                        } else {
                                            java.lang.StringBuilder sb12 = new java.lang.StringBuilder(48);
                                            sb12.append("Unexpected character while parsing string map: ");
                                            sb12.append(cZaj4);
                                            throw new com.google.android.gms.common.server.response.FastParser.ParseException(sb12.toString());
                                        }
                                    }
                                } else if (cZaj3 == '}') {
                                    zak(1);
                                }
                                i = 4;
                                zak(i);
                                zak(2);
                                cZaj = zaj(bufferedReader);
                                if (cZaj != ',') {
                                    strZaa = zaa(bufferedReader);
                                } else {
                                    if (cZaj == '}') {
                                        java.lang.StringBuilder sb13 = new java.lang.StringBuilder(55);
                                        sb13.append("Expected end of object or field separator, but found: ");
                                        sb13.append(cZaj);
                                        throw new com.google.android.gms.common.server.response.FastParser.ParseException(sb13.toString());
                                    }
                                    strZaa = null;
                                }
                            }
                        }
                        fastJsonResponse.zaa((com.google.android.gms.common.server.response.FastJsonResponse.Field) field, (java.util.Map<java.lang.String, java.lang.String>) map);
                        i = 4;
                        zak(i);
                        zak(2);
                        cZaj = zaj(bufferedReader);
                        if (cZaj != ',') {
                            strZaa = zaa(bufferedReader);
                        } else {
                            if (cZaj == '}') {
                                java.lang.StringBuilder sb14 = new java.lang.StringBuilder(55);
                                sb14.append("Expected end of object or field separator, but found: ");
                                sb14.append(cZaj);
                                throw new com.google.android.gms.common.server.response.FastParser.ParseException(sb14.toString());
                            }
                            strZaa = null;
                        }
                        break;
                    case 11:
                        if (field.zaqg) {
                            char cZaj5 = zaj(bufferedReader);
                            if (cZaj5 == 'n') {
                                zab(bufferedReader, zaqu);
                                fastJsonResponse.addConcreteTypeArrayInternal(field, field.zaqj, null);
                            } else {
                                this.zara.push(5);
                                if (cZaj5 != '[') {
                                    throw new com.google.android.gms.common.server.response.FastParser.ParseException("Expected array start");
                                }
                                fastJsonResponse.addConcreteTypeArrayInternal(field, field.zaqj, zaa(bufferedReader, field));
                            }
                        } else {
                            char cZaj6 = zaj(bufferedReader);
                            if (cZaj6 != 'n') {
                                this.zara.push(1);
                                if (cZaj6 != '{') {
                                    throw new com.google.android.gms.common.server.response.FastParser.ParseException("Expected start of object");
                                }
                                try {
                                    com.google.android.gms.common.server.response.FastJsonResponse fastJsonResponseZacn = field.zacn();
                                    zaa(bufferedReader, fastJsonResponseZacn);
                                    fastJsonResponse.addConcreteTypeInternal(field, field.zaqj, fastJsonResponseZacn);
                                } catch (java.lang.IllegalAccessException e) {
                                    throw new com.google.android.gms.common.server.response.FastParser.ParseException("Error instantiating inner object", e);
                                } catch (java.lang.InstantiationException e2) {
                                    throw new com.google.android.gms.common.server.response.FastParser.ParseException("Error instantiating inner object", e2);
                                }
                            } else {
                                zab(bufferedReader, zaqu);
                                fastJsonResponse.addConcreteTypeInternal(field, field.zaqj, null);
                            }
                            break;
                        }
                        i = 4;
                        zak(i);
                        zak(2);
                        cZaj = zaj(bufferedReader);
                        if (cZaj != ',') {
                            strZaa = zaa(bufferedReader);
                        } else {
                            if (cZaj == '}') {
                                java.lang.StringBuilder sb15 = new java.lang.StringBuilder(55);
                                sb15.append("Expected end of object or field separator, but found: ");
                                sb15.append(cZaj);
                                throw new com.google.android.gms.common.server.response.FastParser.ParseException(sb15.toString());
                            }
                            strZaa = null;
                        }
                        break;
                    default:
                        int i2 = field.zaqf;
                        java.lang.StringBuilder sb16 = new java.lang.StringBuilder(30);
                        sb16.append("Invalid field type ");
                        sb16.append(i2);
                        throw new com.google.android.gms.common.server.response.FastParser.ParseException(sb16.toString());
                }
            }
        }
        zak(1);
        return true;
    }

    private final java.lang.String zaa(java.io.BufferedReader bufferedReader) throws com.google.android.gms.common.server.response.FastParser.ParseException, java.io.IOException {
        this.zara.push(2);
        char cZaj = zaj(bufferedReader);
        if (cZaj == '\"') {
            this.zara.push(3);
            java.lang.String strZab = zab(bufferedReader, this.zaqq, this.zaqs, null);
            zak(3);
            if (zaj(bufferedReader) == ':') {
                return strZab;
            }
            throw new com.google.android.gms.common.server.response.FastParser.ParseException("Expected key/value separator");
        }
        if (cZaj == ']') {
            zak(2);
            zak(1);
            zak(5);
            return null;
        }
        if (cZaj == '}') {
            zak(2);
            return null;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(19);
        sb.append("Unexpected token: ");
        sb.append(cZaj);
        throw new com.google.android.gms.common.server.response.FastParser.ParseException(sb.toString());
    }

    private final java.lang.String zab(java.io.BufferedReader bufferedReader) throws com.google.android.gms.common.server.response.FastParser.ParseException, java.io.IOException {
        bufferedReader.mark(1024);
        char cZaj = zaj(bufferedReader);
        if (cZaj != '\"') {
            if (cZaj == ',') {
                throw new com.google.android.gms.common.server.response.FastParser.ParseException("Missing value");
            }
            int i = 1;
            if (cZaj == '[') {
                this.zara.push(5);
                bufferedReader.mark(32);
                if (zaj(bufferedReader) == ']') {
                    zak(5);
                } else {
                    bufferedReader.reset();
                    boolean z = false;
                    boolean z2 = false;
                    while (i > 0) {
                        char cZaj2 = zaj(bufferedReader);
                        if (cZaj2 == 0) {
                            throw new com.google.android.gms.common.server.response.FastParser.ParseException("Unexpected EOF while parsing array");
                        }
                        if (java.lang.Character.isISOControl(cZaj2)) {
                            throw new com.google.android.gms.common.server.response.FastParser.ParseException("Unexpected control character while reading array");
                        }
                        if (cZaj2 == '\"' && !z) {
                            z2 = !z2;
                        }
                        if (cZaj2 == '[' && !z2) {
                            i++;
                        }
                        if (cZaj2 == ']' && !z2) {
                            i--;
                        }
                        z = (cZaj2 == '\\' && z2) ? !z : false;
                    }
                    zak(5);
                }
            } else if (cZaj == '{') {
                this.zara.push(1);
                bufferedReader.mark(32);
                char cZaj3 = zaj(bufferedReader);
                if (cZaj3 == '}') {
                    zak(1);
                } else if (cZaj3 == '\"') {
                    bufferedReader.reset();
                    zaa(bufferedReader);
                    while (zab(bufferedReader) != null) {
                    }
                    zak(1);
                } else {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder(18);
                    sb.append("Unexpected token ");
                    sb.append(cZaj3);
                    throw new com.google.android.gms.common.server.response.FastParser.ParseException(sb.toString());
                }
            } else {
                bufferedReader.reset();
                zaa(bufferedReader, this.zaqr);
            }
        } else {
            if (bufferedReader.read(this.zaqp) == -1) {
                throw new com.google.android.gms.common.server.response.FastParser.ParseException("Unexpected EOF while parsing string");
            }
            char c = this.zaqp[0];
            boolean z3 = false;
            while (true) {
                if (c == '\"' && !z3) {
                    break;
                }
                z3 = c == '\\' ? !z3 : false;
                if (bufferedReader.read(this.zaqp) == -1) {
                    throw new com.google.android.gms.common.server.response.FastParser.ParseException("Unexpected EOF while parsing string");
                }
                c = this.zaqp[0];
                if (java.lang.Character.isISOControl(c)) {
                    throw new com.google.android.gms.common.server.response.FastParser.ParseException("Unexpected control character while reading string");
                }
            }
        }
        char cZaj4 = zaj(bufferedReader);
        if (cZaj4 == ',') {
            zak(2);
            return zaa(bufferedReader);
        }
        if (cZaj4 == '}') {
            zak(2);
            return null;
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder(18);
        sb2.append("Unexpected token ");
        sb2.append(cZaj4);
        throw new com.google.android.gms.common.server.response.FastParser.ParseException(sb2.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.String zac(java.io.BufferedReader bufferedReader) throws com.google.android.gms.common.server.response.FastParser.ParseException, java.io.IOException {
        return zaa(bufferedReader, this.zaqq, this.zaqs, null);
    }

    private final <O> java.util.ArrayList<O> zaa(java.io.BufferedReader bufferedReader, com.google.android.gms.common.server.response.FastParser.zaa<O> zaaVar) throws com.google.android.gms.common.server.response.FastParser.ParseException, java.io.IOException {
        char cZaj = zaj(bufferedReader);
        if (cZaj == 'n') {
            zab(bufferedReader, zaqu);
            return null;
        }
        if (cZaj != '[') {
            throw new com.google.android.gms.common.server.response.FastParser.ParseException("Expected start of array");
        }
        this.zara.push(5);
        java.util.ArrayList<O> arrayList = new java.util.ArrayList<>();
        while (true) {
            bufferedReader.mark(1024);
            char cZaj2 = zaj(bufferedReader);
            if (cZaj2 == 0) {
                throw new com.google.android.gms.common.server.response.FastParser.ParseException("Unexpected EOF");
            }
            if (cZaj2 != ',') {
                if (cZaj2 == ']') {
                    zak(5);
                    return arrayList;
                }
                bufferedReader.reset();
                arrayList.add(zaaVar.zah(this, bufferedReader));
            }
        }
    }

    private final java.lang.String zaa(java.io.BufferedReader bufferedReader, char[] cArr, java.lang.StringBuilder sb, char[] cArr2) throws com.google.android.gms.common.server.response.FastParser.ParseException, java.io.IOException {
        char cZaj = zaj(bufferedReader);
        if (cZaj == '\"') {
            return zab(bufferedReader, cArr, sb, cArr2);
        }
        if (cZaj == 'n') {
            zab(bufferedReader, zaqu);
            return null;
        }
        throw new com.google.android.gms.common.server.response.FastParser.ParseException("Expected string");
    }

    private static java.lang.String zab(java.io.BufferedReader bufferedReader, char[] cArr, java.lang.StringBuilder sb, char[] cArr2) throws com.google.android.gms.common.server.response.FastParser.ParseException, java.io.IOException {
        boolean z;
        sb.setLength(0);
        bufferedReader.mark(cArr.length);
        boolean z2 = false;
        boolean z3 = false;
        while (true) {
            int i = bufferedReader.read(cArr);
            if (i != -1) {
                for (int i2 = 0; i2 < i; i2++) {
                    char c = cArr[i2];
                    if (java.lang.Character.isISOControl(c)) {
                        if (cArr2 == null) {
                            z = false;
                            break;
                        }
                        int i3 = 0;
                        while (true) {
                            if (i3 >= cArr2.length) {
                                z = false;
                                break;
                            }
                            if (cArr2[i3] == c) {
                                z = true;
                                break;
                            }
                            i3++;
                        }
                        if (!z) {
                            throw new com.google.android.gms.common.server.response.FastParser.ParseException("Unexpected control character while reading string");
                        }
                    }
                    if (c == '\"' && !z2) {
                        sb.append(cArr, 0, i2);
                        bufferedReader.reset();
                        bufferedReader.skip(i2 + 1);
                        if (z3) {
                            return com.google.android.gms.common.util.JsonUtils.unescapeString(sb.toString());
                        }
                        return sb.toString();
                    }
                    if (c == '\\') {
                        z2 = !z2;
                        z3 = true;
                    } else {
                        z2 = false;
                    }
                }
                sb.append(cArr, 0, i);
                bufferedReader.mark(cArr.length);
            } else {
                throw new com.google.android.gms.common.server.response.FastParser.ParseException("Unexpected EOF while parsing string");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int zad(java.io.BufferedReader bufferedReader) throws com.google.android.gms.common.server.response.FastParser.ParseException, java.io.IOException {
        int i;
        int i2;
        boolean z;
        int iZaa = zaa(bufferedReader, this.zaqr);
        int i3 = 0;
        if (iZaa == 0) {
            return 0;
        }
        char[] cArr = this.zaqr;
        if (iZaa > 0) {
            if (cArr[0] == '-') {
                i = Integer.MIN_VALUE;
                i2 = 1;
                z = true;
            } else {
                i = -2147483647;
                i2 = 0;
                z = false;
            }
            if (i2 < iZaa) {
                int i4 = i2 + 1;
                int iDigit = java.lang.Character.digit(cArr[i2], 10);
                if (iDigit < 0) {
                    throw new com.google.android.gms.common.server.response.FastParser.ParseException("Unexpected non-digit character");
                }
                int i5 = -iDigit;
                i2 = i4;
                i3 = i5;
            }
            while (i2 < iZaa) {
                int i6 = i2 + 1;
                int iDigit2 = java.lang.Character.digit(cArr[i2], 10);
                if (iDigit2 < 0) {
                    throw new com.google.android.gms.common.server.response.FastParser.ParseException("Unexpected non-digit character");
                }
                if (i3 < -214748364) {
                    throw new com.google.android.gms.common.server.response.FastParser.ParseException("Number too large");
                }
                int i7 = i3 * 10;
                if (i7 < i + iDigit2) {
                    throw new com.google.android.gms.common.server.response.FastParser.ParseException("Number too large");
                }
                i3 = i7 - iDigit2;
                i2 = i6;
            }
            if (!z) {
                return -i3;
            }
            if (i2 > 1) {
                return i3;
            }
            throw new com.google.android.gms.common.server.response.FastParser.ParseException("No digits to parse");
        }
        throw new com.google.android.gms.common.server.response.FastParser.ParseException("No number to parse");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long zae(java.io.BufferedReader bufferedReader) throws com.google.android.gms.common.server.response.FastParser.ParseException, java.io.IOException {
        long j;
        boolean z;
        int iZaa = zaa(bufferedReader, this.zaqr);
        long j2 = 0;
        if (iZaa == 0) {
            return 0L;
        }
        char[] cArr = this.zaqr;
        if (iZaa > 0) {
            int i = 0;
            if (cArr[0] == '-') {
                j = Long.MIN_VALUE;
                i = 1;
                z = true;
            } else {
                j = -9223372036854775807L;
                z = false;
            }
            if (i < iZaa) {
                int i2 = i + 1;
                int iDigit = java.lang.Character.digit(cArr[i], 10);
                if (iDigit < 0) {
                    throw new com.google.android.gms.common.server.response.FastParser.ParseException("Unexpected non-digit character");
                }
                i = i2;
                j2 = -iDigit;
            }
            while (i < iZaa) {
                int i3 = i + 1;
                int iDigit2 = java.lang.Character.digit(cArr[i], 10);
                if (iDigit2 < 0) {
                    throw new com.google.android.gms.common.server.response.FastParser.ParseException("Unexpected non-digit character");
                }
                if (j2 < -922337203685477580L) {
                    throw new com.google.android.gms.common.server.response.FastParser.ParseException("Number too large");
                }
                long j3 = j2 * 10;
                long j4 = iDigit2;
                if (j3 < j + j4) {
                    throw new com.google.android.gms.common.server.response.FastParser.ParseException("Number too large");
                }
                j2 = j3 - j4;
                i = i3;
            }
            if (!z) {
                return -j2;
            }
            if (i > 1) {
                return j2;
            }
            throw new com.google.android.gms.common.server.response.FastParser.ParseException("No digits to parse");
        }
        throw new com.google.android.gms.common.server.response.FastParser.ParseException("No number to parse");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.math.BigInteger zaf(java.io.BufferedReader bufferedReader) throws com.google.android.gms.common.server.response.FastParser.ParseException, java.io.IOException {
        int iZaa = zaa(bufferedReader, this.zaqr);
        if (iZaa == 0) {
            return null;
        }
        return new java.math.BigInteger(new java.lang.String(this.zaqr, 0, iZaa));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean zaa(java.io.BufferedReader bufferedReader, boolean z) throws com.google.android.gms.common.server.response.FastParser.ParseException, java.io.IOException {
        while (true) {
            char cZaj = zaj(bufferedReader);
            if (cZaj != '\"') {
                if (cZaj == 'f') {
                    zab(bufferedReader, z ? zaqy : zaqx);
                    return false;
                }
                if (cZaj == 'n') {
                    zab(bufferedReader, zaqu);
                    return false;
                }
                if (cZaj == 't') {
                    zab(bufferedReader, z ? zaqw : zaqv);
                    return true;
                }
                java.lang.StringBuilder sb = new java.lang.StringBuilder(19);
                sb.append("Unexpected token: ");
                sb.append(cZaj);
                throw new com.google.android.gms.common.server.response.FastParser.ParseException(sb.toString());
            }
            if (z) {
                throw new com.google.android.gms.common.server.response.FastParser.ParseException("No boolean value found in string");
            }
            z = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float zag(java.io.BufferedReader bufferedReader) throws com.google.android.gms.common.server.response.FastParser.ParseException, java.io.IOException {
        int iZaa = zaa(bufferedReader, this.zaqr);
        if (iZaa == 0) {
            return 0.0f;
        }
        return java.lang.Float.parseFloat(new java.lang.String(this.zaqr, 0, iZaa));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final double zah(java.io.BufferedReader bufferedReader) throws com.google.android.gms.common.server.response.FastParser.ParseException, java.io.IOException {
        int iZaa = zaa(bufferedReader, this.zaqr);
        if (iZaa == 0) {
            return 0.0d;
        }
        return java.lang.Double.parseDouble(new java.lang.String(this.zaqr, 0, iZaa));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.math.BigDecimal zai(java.io.BufferedReader bufferedReader) throws com.google.android.gms.common.server.response.FastParser.ParseException, java.io.IOException {
        int iZaa = zaa(bufferedReader, this.zaqr);
        if (iZaa == 0) {
            return null;
        }
        return new java.math.BigDecimal(new java.lang.String(this.zaqr, 0, iZaa));
    }

    private final <T extends com.google.android.gms.common.server.response.FastJsonResponse> java.util.ArrayList<T> zaa(java.io.BufferedReader bufferedReader, com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?> field) throws com.google.android.gms.common.server.response.FastParser.ParseException, java.io.IOException {
        kotlin.reflect.jvm.internal.impl.types.model.ArgumentList argumentList = (java.util.ArrayList<T>) new java.util.ArrayList();
        char cZaj = zaj(bufferedReader);
        if (cZaj == ']') {
            zak(5);
            return argumentList;
        }
        if (cZaj == 'n') {
            zab(bufferedReader, zaqu);
            zak(5);
            return null;
        }
        if (cZaj == '{') {
            this.zara.push(1);
            while (true) {
                try {
                    com.google.android.gms.common.server.response.FastJsonResponse fastJsonResponseZacn = field.zacn();
                    if (!zaa(bufferedReader, fastJsonResponseZacn)) {
                        return argumentList;
                    }
                    argumentList.add(fastJsonResponseZacn);
                    char cZaj2 = zaj(bufferedReader);
                    if (cZaj2 != ',') {
                        if (cZaj2 == ']') {
                            zak(5);
                            return argumentList;
                        }
                        java.lang.StringBuilder sb = new java.lang.StringBuilder(19);
                        sb.append("Unexpected token: ");
                        sb.append(cZaj2);
                        throw new com.google.android.gms.common.server.response.FastParser.ParseException(sb.toString());
                    }
                    if (zaj(bufferedReader) != '{') {
                        throw new com.google.android.gms.common.server.response.FastParser.ParseException("Expected start of next object in array");
                    }
                    this.zara.push(1);
                } catch (java.lang.IllegalAccessException e) {
                    throw new com.google.android.gms.common.server.response.FastParser.ParseException("Error instantiating inner object", e);
                } catch (java.lang.InstantiationException e2) {
                    throw new com.google.android.gms.common.server.response.FastParser.ParseException("Error instantiating inner object", e2);
                }
            }
        } else {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder(19);
            sb2.append("Unexpected token: ");
            sb2.append(cZaj);
            throw new com.google.android.gms.common.server.response.FastParser.ParseException(sb2.toString());
        }
    }

    private final char zaj(java.io.BufferedReader bufferedReader) throws com.google.android.gms.common.server.response.FastParser.ParseException, java.io.IOException {
        if (bufferedReader.read(this.zaqp) == -1) {
            return (char) 0;
        }
        while (java.lang.Character.isWhitespace(this.zaqp[0])) {
            if (bufferedReader.read(this.zaqp) == -1) {
                return (char) 0;
            }
        }
        return this.zaqp[0];
    }

    private final int zaa(java.io.BufferedReader bufferedReader, char[] cArr) throws com.google.android.gms.common.server.response.FastParser.ParseException, java.io.IOException {
        int i;
        char cZaj = zaj(bufferedReader);
        if (cZaj == 0) {
            throw new com.google.android.gms.common.server.response.FastParser.ParseException("Unexpected EOF");
        }
        if (cZaj == ',') {
            throw new com.google.android.gms.common.server.response.FastParser.ParseException("Missing value");
        }
        if (cZaj == 'n') {
            zab(bufferedReader, zaqu);
            return 0;
        }
        bufferedReader.mark(1024);
        if (cZaj == '\"') {
            i = 0;
            boolean z = false;
            while (i < cArr.length && bufferedReader.read(cArr, i, 1) != -1) {
                char c = cArr[i];
                if (java.lang.Character.isISOControl(c)) {
                    throw new com.google.android.gms.common.server.response.FastParser.ParseException("Unexpected control character while reading string");
                }
                if (c == '\"' && !z) {
                    bufferedReader.reset();
                    bufferedReader.skip(i + 1);
                    return i;
                }
                z = c == '\\' ? !z : false;
                i++;
            }
        } else {
            cArr[0] = cZaj;
            i = 1;
            while (i < cArr.length && bufferedReader.read(cArr, i, 1) != -1) {
                if (cArr[i] == '}' || cArr[i] == ',' || java.lang.Character.isWhitespace(cArr[i]) || cArr[i] == ']') {
                    bufferedReader.reset();
                    bufferedReader.skip(i - 1);
                    cArr[i] = 0;
                    return i;
                }
                i++;
            }
        }
        if (i == cArr.length) {
            throw new com.google.android.gms.common.server.response.FastParser.ParseException("Absurdly long value");
        }
        throw new com.google.android.gms.common.server.response.FastParser.ParseException("Unexpected EOF");
    }

    private final void zab(java.io.BufferedReader bufferedReader, char[] cArr) throws com.google.android.gms.common.server.response.FastParser.ParseException, java.io.IOException {
        int i = 0;
        while (i < cArr.length) {
            int i2 = bufferedReader.read(this.zaqq, 0, cArr.length - i);
            if (i2 == -1) {
                throw new com.google.android.gms.common.server.response.FastParser.ParseException("Unexpected EOF");
            }
            for (int i3 = 0; i3 < i2; i3++) {
                if (cArr[i3 + i] != this.zaqq[i3]) {
                    throw new com.google.android.gms.common.server.response.FastParser.ParseException("Unexpected character");
                }
            }
            i += i2;
        }
    }

    private final void zak(int i) throws com.google.android.gms.common.server.response.FastParser.ParseException {
        if (this.zara.isEmpty()) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(46);
            sb.append("Expected state ");
            sb.append(i);
            sb.append(" but had empty stack");
            throw new com.google.android.gms.common.server.response.FastParser.ParseException(sb.toString());
        }
        int iIntValue = this.zara.pop().intValue();
        if (iIntValue == i) {
            return;
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder(46);
        sb2.append("Expected state ");
        sb2.append(i);
        sb2.append(" but had ");
        sb2.append(iIntValue);
        throw new com.google.android.gms.common.server.response.FastParser.ParseException(sb2.toString());
    }
}
