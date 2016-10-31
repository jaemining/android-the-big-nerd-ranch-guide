package com.jaemin.android.criminalintent;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by Jaemin on 2016. 10. 30..
 */

//  Crime 객체들을 저장하는 데이터 저장소

public class CrimeLab {

    private static CrimeLab sCrimeLab; // static 변수의 접두사로 s를 사용

    // List<E>는 지정된 타입의 객체가 저장된 순차 리스트를 지원하는 인터페이스.
    // 이 인터페이스에는 저장된 요소(객체)를 읽거나 추가 또는 삭제하는 메서드가 정의되어 있다
    // List 인터페이스는 주로 자바의 배열을 사용해서 리스트 요소를 저장하는 ArrayList로 구현된다
    private List<Crime> mCrimes;

    public static CrimeLab get(Context context) {
        if (sCrimeLab == null) {
            sCrimeLab = new CrimeLab(context);
        }
        return sCrimeLab;
    }

    private CrimeLab(Context context) {
        mCrimes = new ArrayList<>();

        for (int i=0; i<100; i++) { // 데이터 100개 생성
            Crime crime = new Crime();
            crime.setTitle("범죄 #" + i);
            crime.setSolved(i%2 == 0); // 짝수 번째 요소에는 true를 임의 설정한다
            mCrimes.add(crime);
        }
    }

    public List<Crime> getCrimes() { // 생성된 List를 반환
        return mCrimes;
    }

    public Crime getCrime(UUID id) { // 지정된 ID를 갖는 Crime 객체를 반환
        for (Crime crime : mCrimes) {
            if (crime.getId().equals(id)) {
                return crime;
            }
        }
        return null;
    }
}
