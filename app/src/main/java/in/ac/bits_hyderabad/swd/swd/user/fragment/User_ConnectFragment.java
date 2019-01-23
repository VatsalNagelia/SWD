package in.ac.bits_hyderabad.swd.swd.user.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

import in.ac.bits_hyderabad.swd.swd.R;

public class User_ConnectFragment extends Fragment {

    private String num;
    private ListView listView;
    private User_contact_adapter cAdapter;

    private ArrayList<User_contact_list> list = new ArrayList<>();

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState) {
        // Defines the xml file for the fragment
        View mView = inflater.inflate(R.layout.resp_list, parent, false);
        Button mButton;
        mButton=(Button) mView.findViewById(R.id.resp_call);

        list.add(new User_contact_list("SSD", "9427109837", "Associate Dean"));



        View view = inflater.inflate(R.layout.connect_fragment, parent, false);
        return view;

    }
}
