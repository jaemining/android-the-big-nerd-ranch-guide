package com.jaemin.android.criminalintent;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;

public class CrimeActivity extends SingleFragmentActivity { // 추상클래스 사용하기

    @Override
    protected Fragment createFragment() {
        return new CrimeFragment();
    }
}
