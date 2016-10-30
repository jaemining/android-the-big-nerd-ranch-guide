package com.jaemin.android.criminalintent;

import android.content.Context;

/**
 * Created by Jaemin on 2016. 10. 30..
 */

public class CrimeLab {
    private static CrimeLab sCrimeLab;
    public static CrimeLab get(Context context) {
        if (sCrimeLab == null) {
            sCrimeLab = new CrimeLab(context);
        }
        return sCrimeLab;
    }

    private CrimeLab(Context context) {
    }
}
