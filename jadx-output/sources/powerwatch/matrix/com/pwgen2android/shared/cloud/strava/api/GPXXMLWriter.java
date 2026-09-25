package powerwatch.matrix.com.pwgen2android.shared.cloud.strava.api;

/* JADX INFO: compiled from: GPXXMLWriter.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0004J\u000e\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u0004¨\u0006\u0010"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/GPXXMLWriter;", "", "()V", "mapActivityToGPX", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/GPXData;", "userActivitySession", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;", "read", "", "byteData", "", "write", "", "writeGPX", "data", "writeGPXAndZip", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class GPXXMLWriter {
    public final powerwatch.matrix.com.pwgen2android.shared.cloud.strava.api.GPXData mapActivityToGPX(powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession userActivitySession) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userActivitySession, "userActivitySession");
        userActivitySession.getName();
        java.util.List<kotlin.Pair> listZip = kotlin.collections.CollectionsKt.zip(userActivitySession.getGpsPositions(), userActivitySession.getHeartRates());
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(listZip, 10));
        for (kotlin.Pair pair : listZip) {
            powerwatch.matrix.com.pwgen2android.shared.data.models.GPSPosition gPSPosition = (powerwatch.matrix.com.pwgen2android.shared.data.models.GPSPosition) pair.getFirst();
            arrayList.add(new powerwatch.matrix.com.pwgen2android.shared.cloud.strava.api.GPXPoint(gPSPosition.getLatitude(), gPSPosition.getLongitude(), ((powerwatch.matrix.com.pwgen2android.shared.data.models.HeartRate) pair.getSecond()).getValue(), gPSPosition.getTimestamp()));
        }
        return new powerwatch.matrix.com.pwgen2android.shared.cloud.strava.api.GPXData(arrayList);
    }

    public final byte[] writeGPXAndZip(powerwatch.matrix.com.pwgen2android.shared.cloud.strava.api.GPXData data) throws javax.xml.transform.TransformerException, java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "data");
        java.lang.String strWriteGPX = writeGPX(data);
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        java.util.zip.ZipOutputStream zipOutputStream = new java.util.zip.ZipOutputStream(byteArrayOutputStream);
        java.nio.charset.Charset charset = kotlin.text.Charsets.UTF_8;
        java.util.Objects.requireNonNull(strWriteGPX, "null cannot be cast to non-null type java.lang.String");
        byte[] bytes = strWriteGPX.getBytes(charset);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
        java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(bytes);
        zipOutputStream.putNextEntry(new java.util.zip.ZipEntry(""));
        byte[] bArr = new byte[100];
        int i = 0;
        while (i != -1 && (i = byteArrayInputStream.read(bArr, 0, 100)) != -1) {
            java.lang.System.out.println((java.lang.Object) ("Read: " + i + ", data: " + powerwatch.matrix.com.pwgen2android.shared.extensions.BluetoothExtensionsKt.formatToString$default(bArr, false, 1, null)));
            zipOutputStream.write(bArr, 0, i);
        }
        byteArrayInputStream.close();
        zipOutputStream.closeEntry();
        zipOutputStream.close();
        zipOutputStream.flush();
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(byteArray, "outputStream.toByteArray()");
        return byteArray;
    }

    public final void read(byte[] byteData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteData, "byteData");
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        try {
            byte[] bArr = new byte[100];
            java.util.zip.ZipInputStream zipInputStream = new java.util.zip.ZipInputStream(new java.io.ByteArrayInputStream(byteData));
            if (zipInputStream.getNextEntry() != null) {
                int i = 0;
                while (i != -1 && (i = zipInputStream.read(bArr)) != -1) {
                    byteArrayOutputStream.write(bArr, 0, i);
                }
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(byteArray, "resultOutputStream.toByteArray()");
        java.lang.System.out.println((java.lang.Object) powerwatch.matrix.com.pwgen2android.shared.extensions.BluetoothExtensionsKt.formatToString$default(byteArray, false, 1, null));
    }

    public final java.lang.String writeGPX(powerwatch.matrix.com.pwgen2android.shared.cloud.strava.api.GPXData data) throws javax.xml.transform.TransformerException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "data");
        org.w3c.dom.Document documentNewDocument = javax.xml.parsers.DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        org.w3c.dom.Element elementCreateElement = documentNewDocument.createElement("gpx");
        elementCreateElement.setAttribute("creator", "MATRIX Powerwatch 2");
        org.w3c.dom.Element elementCreateElement2 = documentNewDocument.createElement("trk");
        org.w3c.dom.Element elementCreateElement3 = documentNewDocument.createElement("trkseg");
        java.util.List<powerwatch.matrix.com.pwgen2android.shared.cloud.strava.api.GPXPoint> points = data.getPoints();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(points, 10));
        for (powerwatch.matrix.com.pwgen2android.shared.cloud.strava.api.GPXPoint gPXPoint : points) {
            org.w3c.dom.Element elementCreateElement4 = documentNewDocument.createElement("trkpt");
            if (!(gPXPoint.getLat() == 0.0d)) {
                elementCreateElement4.setAttribute("lat", java.lang.String.valueOf(gPXPoint.getLat()));
            }
            if (!(gPXPoint.getLong() == 0.0d)) {
                elementCreateElement4.setAttribute("lon", java.lang.String.valueOf(gPXPoint.getLong()));
            }
            org.w3c.dom.Element elementCreateElement5 = documentNewDocument.createElement("time");
            elementCreateElement5.appendChild(documentNewDocument.createTextNode(powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.gpxTimeFormat(gPXPoint.getTime())));
            elementCreateElement4.appendChild(elementCreateElement5);
            org.w3c.dom.Element elementCreateElement6 = documentNewDocument.createElement("extensions");
            org.w3c.dom.Element elementCreateElement7 = documentNewDocument.createElement("gpxtpx:TrackPointExtension");
            org.w3c.dom.Element elementCreateElement8 = documentNewDocument.createElement("gpxtpx:hr");
            elementCreateElement8.appendChild(documentNewDocument.createTextNode(java.lang.String.valueOf(gPXPoint.getHeartRate())));
            elementCreateElement7.appendChild(elementCreateElement8);
            elementCreateElement6.appendChild(elementCreateElement7);
            elementCreateElement4.appendChild(elementCreateElement6);
            arrayList.add(elementCreateElement4);
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            elementCreateElement3.appendChild((org.w3c.dom.Element) it.next());
        }
        elementCreateElement2.appendChild(elementCreateElement3);
        elementCreateElement.appendChild(elementCreateElement2);
        documentNewDocument.appendChild(elementCreateElement);
        javax.xml.transform.Transformer transformerNewTransformer = javax.xml.transform.TransformerFactory.newInstance().newTransformer();
        transformerNewTransformer.setOutputProperty("indent", "yes");
        transformerNewTransformer.setOutputProperty(com.google.firebase.analytics.FirebaseAnalytics.Param.METHOD, "xml");
        transformerNewTransformer.setOutputProperty("encoding", io.fabric.sdk.android.services.network.HttpRequest.CHARSET_UTF8);
        transformerNewTransformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        transformerNewTransformer.transform(new javax.xml.transform.dom.DOMSource(documentNewDocument), new javax.xml.transform.stream.StreamResult(byteArrayOutputStream));
        java.lang.String string = byteArrayOutputStream.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "out.toString()");
        return string;
    }

    public final java.lang.String write() throws javax.xml.transform.TransformerException {
        org.w3c.dom.Document documentNewDocument = javax.xml.parsers.DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        org.w3c.dom.Element elementCreateElement = documentNewDocument.createElement("roles");
        org.w3c.dom.Element elementCreateElement2 = documentNewDocument.createElement("outer");
        org.w3c.dom.Text textCreateTextNode = documentNewDocument.createTextNode("inner_text");
        org.w3c.dom.Element elementCreateElement3 = documentNewDocument.createElement("inner");
        elementCreateElement3.appendChild(textCreateTextNode);
        elementCreateElement2.appendChild(elementCreateElement3);
        elementCreateElement.appendChild(elementCreateElement2);
        documentNewDocument.appendChild(elementCreateElement);
        javax.xml.transform.Transformer transformerNewTransformer = javax.xml.transform.TransformerFactory.newInstance().newTransformer();
        transformerNewTransformer.setOutputProperty("indent", "yes");
        transformerNewTransformer.setOutputProperty(com.google.firebase.analytics.FirebaseAnalytics.Param.METHOD, "xml");
        transformerNewTransformer.setOutputProperty("encoding", io.fabric.sdk.android.services.network.HttpRequest.CHARSET_UTF8);
        transformerNewTransformer.setOutputProperty("doctype-system", "roles.dtd");
        transformerNewTransformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        transformerNewTransformer.transform(new javax.xml.transform.dom.DOMSource(documentNewDocument), new javax.xml.transform.stream.StreamResult(byteArrayOutputStream));
        java.lang.String string = byteArrayOutputStream.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "out.toString()");
        return string;
    }
}
