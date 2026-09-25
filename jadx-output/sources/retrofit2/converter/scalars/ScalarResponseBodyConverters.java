package retrofit2.converter.scalars;

/* JADX INFO: loaded from: classes3.dex */
final class ScalarResponseBodyConverters {
    private ScalarResponseBodyConverters() {
    }

    static final class StringResponseBodyConverter implements retrofit2.Converter<okhttp3.ResponseBody, java.lang.String> {
        static final retrofit2.converter.scalars.ScalarResponseBodyConverters.StringResponseBodyConverter INSTANCE = new retrofit2.converter.scalars.ScalarResponseBodyConverters.StringResponseBodyConverter();

        StringResponseBodyConverter() {
        }

        @Override // retrofit2.Converter
        public java.lang.String convert(okhttp3.ResponseBody responseBody) throws java.io.IOException {
            return responseBody.string();
        }
    }

    static final class BooleanResponseBodyConverter implements retrofit2.Converter<okhttp3.ResponseBody, java.lang.Boolean> {
        static final retrofit2.converter.scalars.ScalarResponseBodyConverters.BooleanResponseBodyConverter INSTANCE = new retrofit2.converter.scalars.ScalarResponseBodyConverters.BooleanResponseBodyConverter();

        BooleanResponseBodyConverter() {
        }

        @Override // retrofit2.Converter
        public java.lang.Boolean convert(okhttp3.ResponseBody responseBody) throws java.io.IOException {
            return java.lang.Boolean.valueOf(responseBody.string());
        }
    }

    static final class ByteResponseBodyConverter implements retrofit2.Converter<okhttp3.ResponseBody, java.lang.Byte> {
        static final retrofit2.converter.scalars.ScalarResponseBodyConverters.ByteResponseBodyConverter INSTANCE = new retrofit2.converter.scalars.ScalarResponseBodyConverters.ByteResponseBodyConverter();

        ByteResponseBodyConverter() {
        }

        @Override // retrofit2.Converter
        public java.lang.Byte convert(okhttp3.ResponseBody responseBody) throws java.io.IOException {
            return java.lang.Byte.valueOf(responseBody.string());
        }
    }

    static final class CharacterResponseBodyConverter implements retrofit2.Converter<okhttp3.ResponseBody, java.lang.Character> {
        static final retrofit2.converter.scalars.ScalarResponseBodyConverters.CharacterResponseBodyConverter INSTANCE = new retrofit2.converter.scalars.ScalarResponseBodyConverters.CharacterResponseBodyConverter();

        CharacterResponseBodyConverter() {
        }

        @Override // retrofit2.Converter
        public java.lang.Character convert(okhttp3.ResponseBody responseBody) throws java.io.IOException {
            java.lang.String strString = responseBody.string();
            if (strString.length() != 1) {
                throw new java.io.IOException("Expected body of length 1 for Character conversion but was " + strString.length());
            }
            return java.lang.Character.valueOf(strString.charAt(0));
        }
    }

    static final class DoubleResponseBodyConverter implements retrofit2.Converter<okhttp3.ResponseBody, java.lang.Double> {
        static final retrofit2.converter.scalars.ScalarResponseBodyConverters.DoubleResponseBodyConverter INSTANCE = new retrofit2.converter.scalars.ScalarResponseBodyConverters.DoubleResponseBodyConverter();

        DoubleResponseBodyConverter() {
        }

        @Override // retrofit2.Converter
        public java.lang.Double convert(okhttp3.ResponseBody responseBody) throws java.io.IOException {
            return java.lang.Double.valueOf(responseBody.string());
        }
    }

    static final class FloatResponseBodyConverter implements retrofit2.Converter<okhttp3.ResponseBody, java.lang.Float> {
        static final retrofit2.converter.scalars.ScalarResponseBodyConverters.FloatResponseBodyConverter INSTANCE = new retrofit2.converter.scalars.ScalarResponseBodyConverters.FloatResponseBodyConverter();

        FloatResponseBodyConverter() {
        }

        @Override // retrofit2.Converter
        public java.lang.Float convert(okhttp3.ResponseBody responseBody) throws java.io.IOException {
            return java.lang.Float.valueOf(responseBody.string());
        }
    }

    static final class IntegerResponseBodyConverter implements retrofit2.Converter<okhttp3.ResponseBody, java.lang.Integer> {
        static final retrofit2.converter.scalars.ScalarResponseBodyConverters.IntegerResponseBodyConverter INSTANCE = new retrofit2.converter.scalars.ScalarResponseBodyConverters.IntegerResponseBodyConverter();

        IntegerResponseBodyConverter() {
        }

        @Override // retrofit2.Converter
        public java.lang.Integer convert(okhttp3.ResponseBody responseBody) throws java.io.IOException {
            return java.lang.Integer.valueOf(responseBody.string());
        }
    }

    static final class LongResponseBodyConverter implements retrofit2.Converter<okhttp3.ResponseBody, java.lang.Long> {
        static final retrofit2.converter.scalars.ScalarResponseBodyConverters.LongResponseBodyConverter INSTANCE = new retrofit2.converter.scalars.ScalarResponseBodyConverters.LongResponseBodyConverter();

        LongResponseBodyConverter() {
        }

        @Override // retrofit2.Converter
        public java.lang.Long convert(okhttp3.ResponseBody responseBody) throws java.io.IOException {
            return java.lang.Long.valueOf(responseBody.string());
        }
    }

    static final class ShortResponseBodyConverter implements retrofit2.Converter<okhttp3.ResponseBody, java.lang.Short> {
        static final retrofit2.converter.scalars.ScalarResponseBodyConverters.ShortResponseBodyConverter INSTANCE = new retrofit2.converter.scalars.ScalarResponseBodyConverters.ShortResponseBodyConverter();

        ShortResponseBodyConverter() {
        }

        @Override // retrofit2.Converter
        public java.lang.Short convert(okhttp3.ResponseBody responseBody) throws java.io.IOException {
            return java.lang.Short.valueOf(responseBody.string());
        }
    }
}
