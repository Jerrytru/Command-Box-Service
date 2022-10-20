package com.wellsFargo.CommBo.intent.enums;

public enum NLU_INTENTS {
    openUserProfile("getNavigateLocation", "NAVIGATE"),
    getUserBalance("getUserBalance", "GET"),
    transferUserBalance("transferUserBalance", "UPDATE"),
    ;

    NLU_INTENTS(String method, String actionType) {
    }
}
