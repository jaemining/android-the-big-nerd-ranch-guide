package com.jaemin.android.criminalintent.database;

import android.database.Cursor;
import android.database.CursorWrapper;

import com.jaemin.android.criminalintent.database.CrimeDbSchema.CrimeTable;

import com.jaemin.android.criminalintent.Crime;

/**
 * Created by Jaemin on 2017. 2. 22..
 */

public class CrimeCursorWrapper extends CursorWrapper {
    public CrimeCursorWrapper(Cursor cursor) {
        super(cursor);
    }

    public Crime getCrime() {
        String uuidString = getString(getColumnIndex(CrimeTable.Cols.UUID));
        String title = getString(getColumnIndex(CrimeTable.Cols.TITLE));
        long date = getLong(getColumnIndex(CrimeTable.Cols.DATE));
        int isSolved = getInt(getColumnIndex(CrimeTable.Cols.SOLVED));
        return null;
    }
}
