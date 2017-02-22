package com.jaemin.android.criminalintent;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.jaemin.android.criminalintent.database.CrimeBaseHelper;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by Jaemin on 2016. 10. 30..
 */

//  Crime 객체들을 저장하는 데이터 저장소

public class CrimeLab {

    private static CrimeLab sCrimeLab; // static 변수의 접두사로 s를 사용

    private Context mContext;
    private SQLiteDatabase mDatabase;

    public static CrimeLab get(Context context) {
        if (sCrimeLab == null) {
            sCrimeLab = new CrimeLab(context);
        }
        return sCrimeLab;
    }

    private CrimeLab(Context context) {
        // SQLiteDatabase 열기
        mContext = context.getApplicationContext();
        mDatabase = new CrimeBaseHelper(mContext).getWritableDatabase();
    }

    public void addCrime(Crime c) { // 새로운 범죄를 리스트에 추가하기위해 addCrime() 추가
    }

    public List<Crime> getCrimes() { // 생성된 List를 반환
        return new ArrayList<>();
    }

    public Crime getCrime(UUID id) {
        return null;
    }
}
