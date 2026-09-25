package com.google.maps.android;

/* JADX INFO: loaded from: classes2.dex */
public class PolyUtil {
    private static final double DEFAULT_TOLERANCE = 0.1d;

    private PolyUtil() {
    }

    private static double tanLatGC(double d, double d2, double d3, double d4) {
        return ((java.lang.Math.tan(d) * java.lang.Math.sin(d3 - d4)) + (java.lang.Math.tan(d2) * java.lang.Math.sin(d4))) / java.lang.Math.sin(d3);
    }

    private static double mercatorLatRhumb(double d, double d2, double d3, double d4) {
        return ((com.google.maps.android.MathUtil.mercator(d) * (d3 - d4)) + (com.google.maps.android.MathUtil.mercator(d2) * d4)) / d3;
    }

    private static boolean intersects(double d, double d2, double d3, double d4, double d5, boolean z) {
        if ((d5 >= 0.0d && d5 >= d3) || ((d5 < 0.0d && d5 < d3) || d4 <= -1.5707963267948966d || d <= -1.5707963267948966d || d2 <= -1.5707963267948966d || d >= 1.5707963267948966d || d2 >= 1.5707963267948966d || d3 <= -3.141592653589793d)) {
            return false;
        }
        double d6 = (((d3 - d5) * d) + (d2 * d5)) / d3;
        if (d >= 0.0d && d2 >= 0.0d && d4 < d6) {
            return false;
        }
        if ((d <= 0.0d && d2 <= 0.0d && d4 >= d6) || d4 >= 1.5707963267948966d) {
            return true;
        }
        if (z) {
            if (java.lang.Math.tan(d4) < tanLatGC(d, d2, d3, d5)) {
                return false;
            }
        } else if (com.google.maps.android.MathUtil.mercator(d4) < mercatorLatRhumb(d, d2, d3, d5)) {
            return false;
        }
        return true;
    }

    public static boolean containsLocation(com.google.android.gms.maps.model.LatLng latLng, java.util.List<com.google.android.gms.maps.model.LatLng> list, boolean z) {
        return containsLocation(latLng.latitude, latLng.longitude, list, z);
    }

    public static boolean containsLocation(double d, double d2, java.util.List<com.google.android.gms.maps.model.LatLng> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return false;
        }
        double radians = java.lang.Math.toRadians(d);
        double radians2 = java.lang.Math.toRadians(d2);
        com.google.android.gms.maps.model.LatLng latLng = list.get(size - 1);
        double radians3 = java.lang.Math.toRadians(latLng.latitude);
        double radians4 = java.lang.Math.toRadians(latLng.longitude);
        double d3 = radians3;
        int i = 0;
        for (com.google.android.gms.maps.model.LatLng latLng2 : list) {
            double dWrap = com.google.maps.android.MathUtil.wrap(radians2 - radians4, -3.141592653589793d, 3.141592653589793d);
            if (radians == d3 && dWrap == 0.0d) {
                return true;
            }
            double radians5 = java.lang.Math.toRadians(latLng2.latitude);
            double radians6 = java.lang.Math.toRadians(latLng2.longitude);
            if (intersects(d3, radians5, com.google.maps.android.MathUtil.wrap(radians6 - radians4, -3.141592653589793d, 3.141592653589793d), radians, dWrap, z)) {
                i++;
            }
            d3 = radians5;
            radians4 = radians6;
        }
        return (i & 1) != 0;
    }

    public static boolean isLocationOnEdge(com.google.android.gms.maps.model.LatLng latLng, java.util.List<com.google.android.gms.maps.model.LatLng> list, boolean z, double d) {
        return isLocationOnEdgeOrPath(latLng, list, true, z, d);
    }

    public static boolean isLocationOnEdge(com.google.android.gms.maps.model.LatLng latLng, java.util.List<com.google.android.gms.maps.model.LatLng> list, boolean z) {
        return isLocationOnEdge(latLng, list, z, DEFAULT_TOLERANCE);
    }

    public static boolean isLocationOnPath(com.google.android.gms.maps.model.LatLng latLng, java.util.List<com.google.android.gms.maps.model.LatLng> list, boolean z, double d) {
        return isLocationOnEdgeOrPath(latLng, list, false, z, d);
    }

    public static boolean isLocationOnPath(com.google.android.gms.maps.model.LatLng latLng, java.util.List<com.google.android.gms.maps.model.LatLng> list, boolean z) {
        return isLocationOnPath(latLng, list, z, DEFAULT_TOLERANCE);
    }

    private static boolean isLocationOnEdgeOrPath(com.google.android.gms.maps.model.LatLng latLng, java.util.List<com.google.android.gms.maps.model.LatLng> list, boolean z, boolean z2, double d) {
        int size = list.size();
        if (size == 0) {
            return false;
        }
        double d2 = d / 6371009.0d;
        double dHav = com.google.maps.android.MathUtil.hav(d2);
        double radians = java.lang.Math.toRadians(latLng.latitude);
        double radians2 = java.lang.Math.toRadians(latLng.longitude);
        com.google.android.gms.maps.model.LatLng latLng2 = list.get(z ? size - 1 : 0);
        double radians3 = java.lang.Math.toRadians(latLng2.latitude);
        double radians4 = java.lang.Math.toRadians(latLng2.longitude);
        if (z2) {
            double d3 = radians3;
            double d4 = radians4;
            for (com.google.android.gms.maps.model.LatLng latLng3 : list) {
                double radians5 = java.lang.Math.toRadians(latLng3.latitude);
                double radians6 = java.lang.Math.toRadians(latLng3.longitude);
                if (isOnSegmentGC(d3, d4, radians5, radians6, radians, radians2, dHav)) {
                    return true;
                }
                d4 = radians6;
                d3 = radians5;
            }
            return false;
        }
        double d5 = radians - d2;
        double d6 = radians + d2;
        double dMercator = com.google.maps.android.MathUtil.mercator(radians3);
        double dMercator2 = com.google.maps.android.MathUtil.mercator(radians);
        double[] dArr = new double[3];
        java.util.Iterator<com.google.android.gms.maps.model.LatLng> it = list.iterator();
        while (it.hasNext()) {
            com.google.android.gms.maps.model.LatLng next = it.next();
            double d7 = d6;
            double radians7 = java.lang.Math.toRadians(next.latitude);
            double dMercator3 = com.google.maps.android.MathUtil.mercator(radians7);
            java.util.Iterator<com.google.android.gms.maps.model.LatLng> it2 = it;
            double radians8 = java.lang.Math.toRadians(next.longitude);
            if (java.lang.Math.max(radians3, radians7) >= d5 && java.lang.Math.min(radians3, radians7) <= d7) {
                double dWrap = com.google.maps.android.MathUtil.wrap(radians8 - radians4, -3.141592653589793d, 3.141592653589793d);
                double dWrap2 = com.google.maps.android.MathUtil.wrap(radians2 - radians4, -3.141592653589793d, 3.141592653589793d);
                dArr[0] = dWrap2;
                dArr[1] = dWrap2 + 6.283185307179586d;
                dArr[2] = dWrap2 - 6.283185307179586d;
                for (int i = 0; i < 3; i++) {
                    double d8 = dArr[i];
                    double d9 = dMercator3 - dMercator;
                    double d10 = (dWrap * dWrap) + (d9 * d9);
                    double dClamp = d10 > 0.0d ? com.google.maps.android.MathUtil.clamp(((d8 * dWrap) + ((dMercator2 - dMercator) * d9)) / d10, 0.0d, 1.0d) : 0.0d;
                    if (com.google.maps.android.MathUtil.havDistance(radians, com.google.maps.android.MathUtil.inverseMercator(dMercator + (dClamp * d9)), d8 - (dClamp * dWrap)) < dHav) {
                        return true;
                    }
                }
            }
            radians3 = radians7;
            radians4 = radians8;
            d6 = d7;
            dMercator = dMercator3;
            it = it2;
        }
        return false;
    }

    private static double sinDeltaBearing(double d, double d2, double d3, double d4, double d5, double d6) {
        double dSin = java.lang.Math.sin(d);
        double dCos = java.lang.Math.cos(d3);
        double dCos2 = java.lang.Math.cos(d5);
        double d7 = d6 - d2;
        double d8 = d4 - d2;
        double dSin2 = java.lang.Math.sin(d7) * dCos2;
        double dSin3 = java.lang.Math.sin(d8) * dCos;
        double d9 = dSin * 2.0d;
        double dSin4 = java.lang.Math.sin(d5 - d) + (dCos2 * d9 * com.google.maps.android.MathUtil.hav(d7));
        double dSin5 = java.lang.Math.sin(d3 - d) + (d9 * dCos * com.google.maps.android.MathUtil.hav(d8));
        double d10 = ((dSin2 * dSin2) + (dSin4 * dSin4)) * ((dSin3 * dSin3) + (dSin5 * dSin5));
        if (d10 <= 0.0d) {
            return 1.0d;
        }
        return ((dSin2 * dSin5) - (dSin4 * dSin3)) / java.lang.Math.sqrt(d10);
    }

    private static boolean isOnSegmentGC(double d, double d2, double d3, double d4, double d5, double d6, double d7) {
        double dHavDistance = com.google.maps.android.MathUtil.havDistance(d, d5, d2 - d6);
        if (dHavDistance <= d7) {
            return true;
        }
        double dHavDistance2 = com.google.maps.android.MathUtil.havDistance(d3, d5, d4 - d6);
        if (dHavDistance2 <= d7) {
            return true;
        }
        double dHavFromSin = com.google.maps.android.MathUtil.havFromSin(com.google.maps.android.MathUtil.sinFromHav(dHavDistance) * sinDeltaBearing(d, d2, d3, d4, d5, d6));
        if (dHavFromSin > d7) {
            return false;
        }
        double dHavDistance3 = com.google.maps.android.MathUtil.havDistance(d, d3, d2 - d4);
        double d8 = ((1.0d - (dHavDistance3 * 2.0d)) * dHavFromSin) + dHavDistance3;
        if (dHavDistance > d8 || dHavDistance2 > d8) {
            return false;
        }
        if (dHavDistance3 < 0.74d) {
            return true;
        }
        double d9 = 1.0d - (2.0d * dHavFromSin);
        return com.google.maps.android.MathUtil.sinSumFromHav((dHavDistance - dHavFromSin) / d9, (dHavDistance2 - dHavFromSin) / d9) > 0.0d;
    }

    public static java.util.List<com.google.android.gms.maps.model.LatLng> simplify(java.util.List<com.google.android.gms.maps.model.LatLng> list, double d) {
        int size = list.size();
        if (size < 1) {
            throw new java.lang.IllegalArgumentException("Polyline must have at least 1 point");
        }
        double d2 = 0.0d;
        if (d <= 0.0d) {
            throw new java.lang.IllegalArgumentException("Tolerance must be greater than zero");
        }
        boolean zIsClosedPolygon = isClosedPolygon(list);
        com.google.android.gms.maps.model.LatLng latLng = null;
        if (zIsClosedPolygon) {
            latLng = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            list.add(new com.google.android.gms.maps.model.LatLng(latLng.latitude + 1.0E-11d, latLng.longitude + 1.0E-11d));
        }
        java.util.Stack stack = new java.util.Stack();
        double[] dArr = new double[size];
        int i = 0;
        dArr[0] = 1.0d;
        int i2 = size - 1;
        dArr[i2] = 1.0d;
        if (size > 2) {
            stack.push(new int[]{0, i2});
            int i3 = 0;
            while (stack.size() > 0) {
                int[] iArr = (int[]) stack.pop();
                double d3 = d2;
                for (int i4 = iArr[0] + 1; i4 < iArr[1]; i4++) {
                    double dDistanceToLine = distanceToLine(list.get(i4), list.get(iArr[0]), list.get(iArr[1]));
                    if (dDistanceToLine > d3) {
                        d3 = dDistanceToLine;
                        i3 = i4;
                    }
                }
                if (d3 > d) {
                    dArr[i3] = d3;
                    stack.push(new int[]{iArr[0], i3});
                    stack.push(new int[]{i3, iArr[1]});
                }
                d2 = 0.0d;
            }
        }
        if (zIsClosedPolygon) {
            list.remove(list.size() - 1);
            list.add(latLng);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.google.android.gms.maps.model.LatLng latLng2 : list) {
            if (dArr[i] != 0.0d) {
                arrayList.add(latLng2);
            }
            i++;
        }
        return arrayList;
    }

    public static boolean isClosedPolygon(java.util.List<com.google.android.gms.maps.model.LatLng> list) {
        return list.get(0).equals(list.get(list.size() - 1));
    }

    public static double distanceToLine(com.google.android.gms.maps.model.LatLng latLng, com.google.android.gms.maps.model.LatLng latLng2, com.google.android.gms.maps.model.LatLng latLng3) {
        if (latLng2.equals(latLng3)) {
            return com.google.maps.android.SphericalUtil.computeDistanceBetween(latLng3, latLng);
        }
        double radians = java.lang.Math.toRadians(latLng.latitude);
        double radians2 = java.lang.Math.toRadians(latLng.longitude);
        double radians3 = java.lang.Math.toRadians(latLng2.latitude);
        double radians4 = java.lang.Math.toRadians(latLng2.longitude);
        double radians5 = java.lang.Math.toRadians(latLng3.latitude) - radians3;
        double radians6 = java.lang.Math.toRadians(latLng3.longitude) - radians4;
        double d = (((radians - radians3) * radians5) + ((radians2 - radians4) * radians6)) / ((radians5 * radians5) + (radians6 * radians6));
        if (d <= 0.0d) {
            return com.google.maps.android.SphericalUtil.computeDistanceBetween(latLng, latLng2);
        }
        if (d >= 1.0d) {
            return com.google.maps.android.SphericalUtil.computeDistanceBetween(latLng, latLng3);
        }
        return com.google.maps.android.SphericalUtil.computeDistanceBetween(new com.google.android.gms.maps.model.LatLng(latLng.latitude - latLng2.latitude, latLng.longitude - latLng2.longitude), new com.google.android.gms.maps.model.LatLng((latLng3.latitude - latLng2.latitude) * d, d * (latLng3.longitude - latLng2.longitude)));
    }

    public static java.util.List<com.google.android.gms.maps.model.LatLng> decode(java.lang.String str) {
        int i;
        int i2;
        int length = str.length();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i3 < length) {
            int i6 = 1;
            int i7 = 0;
            while (true) {
                i = i3 + 1;
                int iCharAt = (str.charAt(i3) - '?') - 1;
                i6 += iCharAt << i7;
                i7 += 5;
                if (iCharAt < 31) {
                    break;
                }
                i3 = i;
            }
            int i8 = ((i6 & 1) != 0 ? ~(i6 >> 1) : i6 >> 1) + i4;
            int i9 = 1;
            int i10 = 0;
            while (true) {
                i2 = i + 1;
                int iCharAt2 = (str.charAt(i) - '?') - 1;
                i9 += iCharAt2 << i10;
                i10 += 5;
                if (iCharAt2 < 31) {
                    break;
                }
                i = i2;
            }
            int i11 = i9 & 1;
            int i12 = i9 >> 1;
            if (i11 != 0) {
                i12 = ~i12;
            }
            i5 += i12;
            arrayList.add(new com.google.android.gms.maps.model.LatLng(((double) i8) * 1.0E-5d, ((double) i5) * 1.0E-5d));
            i4 = i8;
            i3 = i2;
        }
        return arrayList;
    }

    public static java.lang.String encode(java.util.List<com.google.android.gms.maps.model.LatLng> list) {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        long j = 0;
        long j2 = 0;
        for (com.google.android.gms.maps.model.LatLng latLng : list) {
            long jRound = java.lang.Math.round(latLng.latitude * 100000.0d);
            long jRound2 = java.lang.Math.round(latLng.longitude * 100000.0d);
            encode(jRound - j, stringBuffer);
            encode(jRound2 - j2, stringBuffer);
            j = jRound;
            j2 = jRound2;
        }
        return stringBuffer.toString();
    }

    private static void encode(long j, java.lang.StringBuffer stringBuffer) {
        long j2 = j << 1;
        if (j < 0) {
            j2 = ~j2;
        }
        while (j2 >= 32) {
            stringBuffer.append(java.lang.Character.toChars((int) ((32 | (31 & j2)) + 63)));
            j2 >>= 5;
        }
        stringBuffer.append(java.lang.Character.toChars((int) (j2 + 63)));
    }
}
