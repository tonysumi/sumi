package com.example.android.sumi;

/**
 * Created by android on 17-02-2017.
 */

public class Word {
    /** Default translation for the word */
    private String mDefaultTranslation;

    /** Miwok translation for the word */
    private String mSumiTranslation;

    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param sumiTranslation is the word in the Sumi language
     */
    public Word(String defaultTranslation, String sumiTranslation) {
        mDefaultTranslation = defaultTranslation;
        mSumiTranslation = sumiTranslation;
    }

    /**
     * Get the default translation of the word.
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * Get the Sumi translation of the word.
     */
    public String getSumiTranslation() {
        return mSumiTranslation;
    }
}
