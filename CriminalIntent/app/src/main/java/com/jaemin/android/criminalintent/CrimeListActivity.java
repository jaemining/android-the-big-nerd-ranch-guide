package com.jaemin.android.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by Jaemin on 2016. 10. 31..
 */

public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
