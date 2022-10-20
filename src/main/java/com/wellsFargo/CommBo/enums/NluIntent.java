package com.wellsFargo.CommBo.enums;

public enum NluIntent {
    openUserProfile("getNavigateLocation", ActionType.NAVIGATE),
    getUserBalance("getUserBalance", ActionType.READ),
    transferUserBalance("transferUserBalance", ActionType.UPDATE) //NAVIGATE
    ;

    NluIntent(String method, ActionType actionType) {
    }

}