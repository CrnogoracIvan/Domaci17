package com.example.ivancrnogorac.domacizadatak15.aktivnosti;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.widget.Toast;

import com.example.ivancrnogorac.domacizadatak15.R;
import com.example.ivancrnogorac.domacizadatak15.aktivnosti.fragments.DetailedFragment;
import com.example.ivancrnogorac.domacizadatak15.aktivnosti.fragments.FragmentsListe;


/**
 * Created by Ivan Crnogorac on 2/5/2017.
 */

public class SecondActivity extends Activity implements FragmentsListe.OnItemSelectedListener {

    boolean landscape = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        // setContentView method draws UI
        setContentView(R.layout.list_fragment_layaout);

        // Draws layout
        setContentView(R.layout.second_activity);


        // If the activity is started for the first time create master fragment
        if (savedInstanceState == null) {
            // FragmentTransaction is a set of changes (e.g. adding, removing and replacing fragments) that you want to perform at the same time.
            FragmentTransaction ft = getFragmentManager().beginTransaction();
            FragmentsListe masterFragment = new FragmentsListe();
            ft.add(R.id.listaJela, masterFragment,  "Master_Fragment_1");
            ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
            ft.commit();
        }

        // If the device is in the landscape mode and the detail fragment is null create detail fragment
        if (findViewById(R.id.fragment_detailed_layout) != null) {
            landscape = true;
            getFragmentManager().popBackStack();

            FragmentsListe detailFragment = (FragmentsListe) getFragmentManager().findFragmentById(R.id.list_fragment_layaout);
            if (detailFragment == null) {
                FragmentTransaction ft = getFragmentManager().beginTransaction();
                detailFragment = new FragmentsListe();
                ft.replace(R.id.fragment_detailed_layout, detailFragment, "Detail_Fragment_1");
                ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
                ft.commit();
            }
        }


    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    public void onItemSelected(int position) {
        // Shows a toast message (a pop-up message)
        Toast.makeText(getBaseContext(), "SecondActivity.onItemSelected()", Toast.LENGTH_SHORT).show();

        if (landscape) {
            // If the device is in the landscape mode updates detail fragment's content.
            DetailedFragment detailFragment = (DetailedFragment) getFragmentManager().findFragmentById(R.id.fragment_detailed_layout);
            detailFragment.updateContent(position);
        } else {
            // If the device is in the portrait mode sets detail fragment's content and replaces master fragment with detail fragment in a fragment transaction.
            DetailedFragment detailFragment = new DetailedFragment();
            detailFragment.setContent(position);
            FragmentTransaction ft = getFragmentManager().beginTransaction();
            ft.replace(R.id.list_fragment_layaout, detailFragment, "Detail_Fragment_2");
            ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
            ft.addToBackStack(null);
            ft.commit();
        }
    }

}
