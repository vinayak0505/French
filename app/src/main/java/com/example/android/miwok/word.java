package com.example.android.miwok;


public class word {

    private String mDefaultTranslation;

    private String mFrenchTranslation;

    private int mImage;

    public word(String FrenchTranslation, String defaultTranslation) {

        mDefaultTranslation = defaultTranslation;
        mFrenchTranslation = FrenchTranslation;
    }

    public word(String FrenchTranslation, String defaultTranslation, int Image) {

        mDefaultTranslation = defaultTranslation;
        mFrenchTranslation = FrenchTranslation;
        mImage = Image;
    }

    public String getDefaultTranslation() {

        return mDefaultTranslation;
    }

    public String getFrenchTranslation() {

        return mFrenchTranslation;
    }

    public int getImage() {
        return mImage;
    }
}
