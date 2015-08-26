package com.virtualspace.database.model;

public class UserFavorite extends UserFavoriteKey {
    private String favoriteType;

    public String getFavoriteType() {
        return favoriteType;
    }

    public void setFavoriteType(String favoriteType) {
        this.favoriteType = favoriteType == null ? null : favoriteType.trim();
    }
}