package com.crashlytics.android.answers;

/* JADX INFO: loaded from: classes.dex */
public class StartCheckoutEvent extends com.crashlytics.android.answers.PredefinedEvent<com.crashlytics.android.answers.StartCheckoutEvent> {
    static final java.lang.String CURRENCY_ATTRIBUTE = "currency";
    static final java.lang.String ITEM_COUNT_ATTRIBUTE = "itemCount";
    static final java.math.BigDecimal MICRO_CONSTANT = java.math.BigDecimal.valueOf(1000000L);
    static final java.lang.String TOTAL_PRICE_ATTRIBUTE = "totalPrice";
    static final java.lang.String TYPE = "startCheckout";

    @Override // com.crashlytics.android.answers.PredefinedEvent
    java.lang.String getPredefinedType() {
        return TYPE;
    }

    public com.crashlytics.android.answers.StartCheckoutEvent putItemCount(int i) {
        this.predefinedAttributes.put(ITEM_COUNT_ATTRIBUTE, java.lang.Integer.valueOf(i));
        return this;
    }

    public com.crashlytics.android.answers.StartCheckoutEvent putTotalPrice(java.math.BigDecimal bigDecimal) {
        if (!this.validator.isNull(bigDecimal, TOTAL_PRICE_ATTRIBUTE)) {
            this.predefinedAttributes.put(TOTAL_PRICE_ATTRIBUTE, java.lang.Long.valueOf(priceToMicros(bigDecimal)));
        }
        return this;
    }

    public com.crashlytics.android.answers.StartCheckoutEvent putCurrency(java.util.Currency currency) {
        if (!this.validator.isNull(currency, "currency")) {
            this.predefinedAttributes.put("currency", currency.getCurrencyCode());
        }
        return this;
    }

    long priceToMicros(java.math.BigDecimal bigDecimal) {
        return MICRO_CONSTANT.multiply(bigDecimal).longValue();
    }
}
