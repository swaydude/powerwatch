package powerwatch.matrix.com.pwgen2android.shared.data.models;

/* JADX INFO: compiled from: ActivityPeriodsModels.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0001\u001a\n\u0010\u0002\u001a\u00020\u0003*\u00020\u0004¨\u0006\u0005"}, d2 = {"toGPS", "Lcom/baidu/mapapi/model/LatLng;", "toLocation", "Landroid/location/Location;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GPSPosition;", "app_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
public final class ActivityPeriodsModelsKt {
    public static final android.location.Location toLocation(powerwatch.matrix.com.pwgen2android.shared.data.models.GPSPosition gPSPosition) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gPSPosition, "<this>");
        android.location.Location location = new android.location.Location("");
        location.setAltitude(gPSPosition.getAltitude());
        location.setLongitude(gPSPosition.getLongitude());
        location.setLatitude(gPSPosition.getLatitude());
        return location;
    }

    public static final com.baidu.mapapi.model.LatLng toGPS(com.baidu.mapapi.model.LatLng latLng) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(latLng, "<this>");
        com.baidu.mapapi.utils.CoordinateConverter coordinateConverter = new com.baidu.mapapi.utils.CoordinateConverter();
        coordinateConverter.from(com.baidu.mapapi.utils.CoordinateConverter.CoordType.GPS);
        coordinateConverter.coord(latLng);
        com.baidu.mapapi.model.LatLng latLngConvert = coordinateConverter.convert();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(latLngConvert, "converter.convert()");
        return latLngConvert;
    }
}
