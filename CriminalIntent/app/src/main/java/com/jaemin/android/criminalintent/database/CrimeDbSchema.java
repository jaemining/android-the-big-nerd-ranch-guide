package com.jaemin.android.criminalintent.database;

/**
 * Created by Jaemin on 2016. 11. 20..
 */

public class CrimeDbSchema {
    public static final class CrimeTable { // 내부 클래스
        public static final String NAME = "crimes";

        public static final class Cols { // 테이블의 열 정의 
            public static final String UUID = "uuid";
            public static final String TITLE = "title";
            public static final String DATE = "date";
            public static final String SOLVED = "solved";
            public static final String SUSPECT = "suspect";
        }
    }
}
