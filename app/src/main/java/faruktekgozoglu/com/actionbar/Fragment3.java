package faruktekgozoglu.com.actionbar;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.Toast;

/**
 * Created by OmerFaruk on 4/18/2018.
 */

public class Fragment3 extends Fragment {
    private static final String TAG = "Fragment1";

    private ImageButton imageViewButtonHome;
    private ImageButton imageViewButtonCities;
    private ImageButton imageViewButtonCalender;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_calender,container,false);

        imageViewButtonHome = (ImageButton) view.findViewById(R.id.imageViewBtnHome);
        imageViewButtonCities = (ImageButton) view.findViewById(R.id.imageViewBtnLibrary);
        imageViewButtonCalender = (ImageButton) view.findViewById(R.id.imageViewBtnFood);

        Log.d(TAG, "onCreateView: Started Food Fragment");

        imageViewButtonHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(),"Going to Home Fragment",Toast.LENGTH_SHORT).show();
                ((MainActivity)getActivity()).setViewPager(0);
            }
        });

        imageViewButtonCities.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(),"Going to Library Fragment",Toast.LENGTH_SHORT).show();
                ((MainActivity)getActivity()).setViewPager(1);
            }
        });

        imageViewButtonCalender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(),"Going to Food Fragment",Toast.LENGTH_SHORT).show();
                ((MainActivity)getActivity()).setViewPager(2);
            }
        });

        return view;
    }
}
