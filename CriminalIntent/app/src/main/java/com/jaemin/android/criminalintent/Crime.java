package com.jaemin.android.criminalintent;

import java.util.Date;
import java.util.UUID;

/**
 * Created by Jaemin on 2016. 10. 26..
 */

public class Crime {

    private UUID mId; // 고유한 식별값
    private String mTitle; // 범죄 타이틀
    private Date mDate; // 범죄가 발생한 날짜
    private boolean mSolved; // 범죄가 해결되었는지의 여부
    private String mSuspect; // 용의자 이름

    public Crime() {
        this(UUID.randomUUID());
    }

    public Crime(UUID id) {
        mId = id;
        mDate = new Date();
    }

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date date) {
        mDate = date;
    }

    public boolean isSolved() {
        return mSolved;
    }

    public void setSolved(boolean solved) {
        mSolved = solved;
    }

    public String getSuspect() {
        return mSuspect;
    }

    public void setSuspect(String suspect) {
        mSuspect = suspect;
    }

}
