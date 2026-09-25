package com.google.maps.android;

/* JADX INFO: loaded from: classes2.dex */
public class SphericalUtil {
    private SphericalUtil() {
    }

    public static double computeHeading(com.google.android.gms.maps.model.LatLng latLng, com.google.android.gms.maps.model.LatLng latLng2) {
        double radians = java.lang.Math.toRadians(latLng.latitude);
        double radians2 = java.lang.Math.toRadians(latLng.longitude);
        double radians3 = java.lang.Math.toRadians(latLng2.latitude);
        double radians4 = java.lang.Math.toRadians(latLng2.longitude) - radians2;
        return com.google.maps.android.MathUtil.wrap(java.lang.Math.toDegrees(java.lang.Math.atan2(java.lang.Math.sin(radians4) * java.lang.Math.cos(radians3), (java.lang.Math.cos(radians) * java.lang.Math.sin(radians3)) - ((java.lang.Math.sin(radians) * java.lang.Math.cos(radians3)) * java.lang.Math.cos(radians4)))), -180.0d, 180.0d);
    }

    public static com.google.android.gms.maps.model.LatLng computeOffset(com.google.android.gms.maps.model.LatLng latLng, double d, double d2) {
        double d3 = d / 6371009.0d;
        double radians = java.lang.Math.toRadians(d2);
        double radians2 = java.lang.Math.toRadians(latLng.latitude);
        double radians3 = java.lang.Math.toRadians(latLng.longitude);
        double dCos = java.lang.Math.cos(d3);
        double dSin = java.lang.Math.sin(d3);
        double dSin2 = java.lang.Math.sin(radians2);
        double dCos2 = dSin * java.lang.Math.cos(radians2);
        double dCos3 = (dCos * dSin2) + (java.lang.Math.cos(radians) * dCos2);
        return new com.google.android.gms.maps.model.LatLng(java.lang.Math.toDegrees(java.lang.Math.asin(dCos3)), java.lang.Math.toDegrees(radians3 + java.lang.Math.atan2(dCos2 * java.lang.Math.sin(radians), dCos - (dSin2 * dCos3))));
    }

    public static com.google.android.gms.maps.model.LatLng computeOffsetOrigin(com.google.android.gms.maps.model.LatLng latLng, double d, double d2) {
        double radians = java.lang.Math.toRadians(d2);
        double d3 = d / 6371009.0d;
        double dCos = java.lang.Math.cos(d3);
        double dSin = java.lang.Math.sin(d3) * java.lang.Math.cos(radians);
        double dSin2 = java.lang.Math.sin(d3) * java.lang.Math.sin(radians);
        double dSin3 = java.lang.Math.sin(java.lang.Math.toRadians(latLng.latitude));
        double d4 = dCos * dCos;
        double d5 = dSin * dSin;
        double d6 = ((d5 * d4) + (d4 * d4)) - ((d4 * dSin3) * dSin3);
        if (d6 < 0.0d) {
            return null;
        }
        double d7 = dSin * dSin3;
        double d8 = d4 + d5;
        double dSqrt = (d7 + java.lang.Math.sqrt(d6)) / d8;
        double d9 = (dSin3 - (dSin * dSqrt)) / dCos;
        double dAtan2 = java.lang.Math.atan2(d9, dSqrt);
        if (dAtan2 < -1.5707963267948966d || dAtan2 > 1.5707963267948966d) {
            dAtan2 = java.lang.Math.atan2(d9, (d7 - java.lang.Math.sqrt(d6)) / d8);
        }
        if (dAtan2 < -1.5707963267948966d || dAtan2 > 1.5707963267948966d) {
            return null;
        }
        return new com.google.android.gms.maps.model.LatLng(java.lang.Math.toDegrees(dAtan2), java.lang.Math.toDegrees(java.lang.Math.toRadians(latLng.longitude) - java.lang.Math.atan2(dSin2, (dCos * java.lang.Math.cos(dAtan2)) - (dSin * java.lang.Math.sin(dAtan2)))));
    }

    public static com.google.android.gms.maps.model.LatLng interpolate(com.google.android.gms.maps.model.LatLng latLng, com.google.android.gms.maps.model.LatLng latLng2, double d) {
        double radians = java.lang.Math.toRadians(latLng.latitude);
        double radians2 = java.lang.Math.toRadians(latLng.longitude);
        double radians3 = java.lang.Math.toRadians(latLng2.latitude);
        double radians4 = java.lang.Math.toRadians(latLng2.longitude);
        double dCos = java.lang.Math.cos(radians);
        double dCos2 = java.lang.Math.cos(radians3);
        double dComputeAngleBetween = computeAngleBetween(latLng, latLng2);
        double dSin = java.lang.Math.sin(dComputeAngleBetween);
        if (dSin < 1.0E-6d) {
            return latLng;
        }
        double dSin2 = java.lang.Math.sin((1.0d - d) * dComputeAngleBetween) / dSin;
        double dSin3 = java.lang.Math.sin(dComputeAngleBetween * d) / dSin;
        double d2 = dCos * dSin2;
        double d3 = dCos2 * dSin3;
        double dCos3 = (java.lang.Math.cos(radians2) * d2) + (java.lang.Math.cos(radians4) * d3);
        double dSin4 = (d2 * java.lang.Math.sin(radians2)) + (d3 * java.lang.Math.sin(radians4));
        return new com.google.android.gms.maps.model.LatLng(java.lang.Math.toDegrees(java.lang.Math.atan2((dSin2 * java.lang.Math.sin(radians)) + (java.lang.Math.sin(radians3) * dSin3), java.lang.Math.sqrt((dCos3 * dCos3) + (dSin4 * dSin4)))), java.lang.Math.toDegrees(java.lang.Math.atan2(dSin4, dCos3)));
    }

    private static double distanceRadians(double d, double d2, double d3, double d4) {
        return com.google.maps.android.MathUtil.arcHav(com.google.maps.android.MathUtil.havDistance(d, d3, d2 - d4));
    }

    static double computeAngleBetween(com.google.android.gms.maps.model.LatLng latLng, com.google.android.gms.maps.model.LatLng latLng2) {
        return distanceRadians(java.lang.Math.toRadians(latLng.latitude), java.lang.Math.toRadians(latLng.longitude), java.lang.Math.toRadians(latLng2.latitude), java.lang.Math.toRadians(latLng2.longitude));
    }

    public static double computeDistanceBetween(com.google.android.gms.maps.model.LatLng latLng, com.google.android.gms.maps.model.LatLng latLng2) {
        return computeAngleBetween(latLng, latLng2) * 6371009.0d;
    }

    public static double computeLength(java.util.List<com.google.android.gms.maps.model.LatLng> list) {
        double dDistanceRadians = 0.0d;
        if (list.size() < 2) {
            return 0.0d;
        }
        com.google.android.gms.maps.model.LatLng latLng = list.get(0);
        double radians = java.lang.Math.toRadians(latLng.latitude);
        double radians2 = java.lang.Math.toRadians(latLng.longitude);
        for (com.google.android.gms.maps.model.LatLng latLng2 : list) {
            double radians3 = java.lang.Math.toRadians(latLng2.latitude);
            double radians4 = java.lang.Math.toRadians(latLng2.longitude);
            dDistanceRadians += distanceRadians(radians, radians2, radians3, radians4);
            radians = radians3;
            radians2 = radians4;
        }
        return dDistanceRadians * 6371009.0d;
    }

    public static double computeArea(java.util.List<com.google.android.gms.maps.model.LatLng> list) {
        return java.lang.Math.abs(computeSignedArea(list));
    }

    public static double computeSignedArea(java.util.List<com.google.android.gms.maps.model.LatLng> list) {
        return computeSignedArea(list, 6371009.0d);
    }

    static double computeSignedArea(java.util.List<com.google.android.gms.maps.model.LatLng> list, double d) {
        int size = list.size();
        double dPolarTriangleArea = 0.0d;
        if (size < 3) {
            return 0.0d;
        }
        com.google.android.gms.maps.model.LatLng latLng = list.get(size - 1);
        double dTan = java.lang.Math.tan((1.5707963267948966d - java.lang.Math.toRadians(latLng.latitude)) / 2.0d);
        double radians = java.lang.Math.toRadians(latLng.longitude);
        double d2 = dTan;
        double d3 = radians;
        for (com.google.android.gms.maps.model.LatLng latLng2 : list) {
            double dTan2 = java.lang.Math.tan((1.5707963267948966d - java.lang.Math.toRadians(latLng2.latitude)) / 2.0d);
            double radians2 = java.lang.Math.toRadians(latLng2.longitude);
            dPolarTriangleArea += polarTriangleArea(dTan2, radians2, d2, d3);
            d2 = dTan2;
            d3 = radians2;
        }
        return dPolarTriangleArea * d * d;
    }

    private static double polarTriangleArea(double d, double d2, double d3, double d4) {
        double d5 = d2 - d4;
        double d6 = d * d3;
        return java.lang.Math.atan2(java.lang.Math.sin(d5) * d6, (d6 * java.lang.Math.cos(d5)) + 1.0d) * 2.0d;
    }
}
