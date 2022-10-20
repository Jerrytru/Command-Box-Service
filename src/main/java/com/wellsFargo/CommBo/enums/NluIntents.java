package com.wellsFargo.CommBo.enums;

public enum NluIntents {
    openUserProfile("getNavigateLocation", ActionTypes.NAVIGATE),
    getUserBalance("getUserBalance", ActionTypes.READ),
    transferUserBalance("transferUserBalance", ActionTypes.UPDATE) //NAVIGATE
    ;

    NluIntents(String method, ActionTypes actionType) {
    }

}