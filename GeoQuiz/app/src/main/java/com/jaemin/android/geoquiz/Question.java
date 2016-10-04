package com.jaemin.android.geoquiz;

/**
 * Created by Jaemin on 2016. 9. 27..
 */
public class Question {

    private int mTextRedId;
    private boolean mAnswerTrue;

    public int getTextRedId() {
        return mTextRedId;
    }

    public void setTextRedId(int textRedId) {
        mTextRedId = textRedId;
    }

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }

    public Question(int textResId, boolean answerTrue) {
        mTextRedId = textResId;
        mAnswerTrue = answerTrue;


    }
}
