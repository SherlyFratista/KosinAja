package com.example.kosinaja;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class ViewPager extends FragmentStateAdapter {
    public ViewPager(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }
    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
            return new TabFragment1();
            case 1:
                return new TabFragment2();
                default:
                    return null;

        }
    }

    @Override
    public int getItemCount() {
        return 2;
    }

}
