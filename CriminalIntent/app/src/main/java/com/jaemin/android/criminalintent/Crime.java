package com.jaemin.android.criminalintent;

import java.util.UUID;

/**
 * Created by Jaemin on 2016. 10. 26..
 */

public class Crime {

    private UUID mId;
    private String mTitle;

    public Crime() {
        // 고유한 식별자를 생성한다
        mId = UUID.randomUUID();
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
}
