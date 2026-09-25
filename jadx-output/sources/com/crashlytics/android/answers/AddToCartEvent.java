package com.crashlytics.android.answers;

/* JADX INFO: loaded from: classes.dex */
public class AddToCartEvent extends com.crashlytics.android.answers.PredefinedEvent<com.crashlytics.android.answers.AddToCartEvent> {
    static final java.lang.String CURRENCY_ATTRIBUTE = "currency";
    static final java.lang.String ITEM_ID_ATTRIBUTE = "itemId";
    static final java.lang.String ITEM_NAME_ATTRIBUTE = "itemName";
    static final java.lang.String ITEM_PRICE_ATTRIBUTE = "itemPrice";
    static final java.lang.String ITEM_TYPE_ATTRIBUTE = "itemType";
    static final java.math.BigDecimal MICRO_CONSTANT = java.math.BigDecimal.valueOf(1000000L);
    static final java.lang.String TYPE = "addToCart";

    @Override // com.crashlytics.android.answers.PredefinedEvent
    java.lang.String getPredefinedType() {
        return TYPE;
    }

    public com.crashlytics.android.answers.AddToCartEvent putItemId(java.lang.String str) {
        this.predefinedAttributes.put(ITEM_ID_ATTRIBUTE, str);
        return this;
    }

    public com.crashlytics.android.answers.AddToCartEvent putItemName(java.lang.String str) {
        this.predefinedAttributes.put(ITEM_NAME_ATTRIBUTE, str);
        return this;
    }

    public com.crashlytics.android.answers.AddToCartEvent putItemType(java.lang.String str) {
        this.predefinedAttributes.put(ITEM_TYPE_ATTRIBUTE, str);
        return this;
    }

    public com.crashlytics.android.answers.AddToCartEvent putItemPrice(java.math.BigDecimal bigDecimal) {
        if (!this.validator.isNull(bigDecimal, ITEM_PRICE_ATTRIBUTE)) {
            this.predefinedAttributes.put(ITEM_PRICE_ATTRIBUTE, java.lang.Long.valueOf(priceToMicros(bigDecimal)));
        }
        return this;
    }

    public com.crashlytics.android.answers.AddToCartEvent putCurrency(java.util.Currency currency) {
        if (!this.validator.isNull(currency, "currency")) {
            this.predefinedAttributes.put("currency", currency.getCurrencyCode());
        }
        return this;
    }

    long priceToMicros(java.math.BigDecimal bigDecimal) {
        return MICRO_CONSTANT.multiply(bigDecimal).longValue();
    }
}
