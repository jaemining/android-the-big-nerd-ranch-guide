package com.jaemin.android.criminalintent;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;

/**
 * Created by Jaemin on 2016. 10. 31..
 */

public abstract class SingleFragmentActivity extends FragmentActivity {

    // fragment 인스턴스에 사용되는 메서드
    // SingleFragmentActivity의 서브 클래스에서는 이 메서드를 구현하여 액티비티가 호스팅하는 fragment 인스턴스를 반환해야 한다
    protected abstract Fragment createFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);

        FragmentManager fm = getSupportFragmentManager();
        Fragment fragment = fm.findFragmentById(R.id.fragment_container);

        if (fragment == null) {
            fragment = createFragment();
            fm.beginTransaction()
                    .add(R.id.fragment_container, fragment)
                    .commit();
        }

    }
}
