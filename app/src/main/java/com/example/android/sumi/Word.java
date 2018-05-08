package com.example.android.sumi;

import android.widget.ImageView;

/**
 * Created by android on 17-02-2018.
 */

public class Word {
    /** Default translation for the word */
    private String mDefaultTranslation;

    /** Miwok translation for the word */
    private String mSumiTranslation;
    private int mAudioResourceId;
    //image resource id
    private int mImageResourceID = NO_IMAGE_PREVIEW;
    private static final int NO_IMAGE_PREVIEW =-1;
    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param sumiTranslation is the word in the Sumi language
     */
    public Word(String defaultTranslation, String sumiTranslation, int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mSumiTranslation = sumiTranslation;
        mAudioResourceId = audioResourceId;
    }
    public Word(String defaultTranslation, String sumiTranslation , int ImageResourceID, int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mSumiTranslation = sumiTranslation;
        mImageResourceID = ImageResourceID;
        mAudioResourceId = audioResourceId;
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

    public int getmImageResourceID(){
        return mImageResourceID;
    }

    public boolean hasImage(){

        return mImageResourceID != NO_IMAGE_PREVIEW;
    }
    public int getmAudioResourceId(){
        return mAudioResourceId;
    }

}
