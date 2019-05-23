package com.adfaro9.uts_akb_10116315;

/*
Dibuat Oleh : Muhammad Adityo Fathur Rahim (10116315)
Kelas       : IF-7/AKB-7
Pada tanggal: 23/05/2019
 */

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.adfaro9.uts_akb_10116315.view.ContactFragment;
import com.adfaro9.uts_akb_10116315.view.ListFragment;
import com.adfaro9.uts_akb_10116315.view.ProfileFragment;

public class PagerAdapter extends FragmentStatePagerAdapter {

    int mNoOfTabs;

    public PagerAdapter(FragmentManager fm, int NumberOfTabs){
        super(fm);
        this.mNoOfTabs = NumberOfTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch(position) {

            case 0:
                ProfileFragment profileFragment = new ProfileFragment();
                return profileFragment;
            case 1:
                ContactFragment contactFragment = new ContactFragment();
                return contactFragment;
            case 2:
                ListFragment listFragment = new ListFragment();
                return listFragment;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNoOfTabs;
    }
}
