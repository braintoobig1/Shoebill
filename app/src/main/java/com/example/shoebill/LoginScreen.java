package com.example.shoebill;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link LoginScreen#newInstance} factory method to
 * create an instance of this fragment.
 */
public class LoginScreen extends Fragment {
    

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters

    public LoginScreen() {
        // Required empty public constructor
    }
    Button button;


    // TODO: Rename and change types and number of parameters
    public static LoginScreen newInstance() {
        LoginScreen fragment = new LoginScreen();
        Bundle args = new Bundle();
        //args.putString(ARG_PARAM1, param1);
        //args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_login_screen, container, false);
        button = view.findViewById(R.id.button);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loginListener.successfulLogin();
            }
        });

        return view;
    }



    ILoginListener loginListener;


    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);

        if (context instanceof ILoginListener) {
            loginListener = (ILoginListener) context;
        } else {
            throw new RuntimeException(context.toString() + " must implement ICreateCharacterStage1Listener");
        }
    }


    public interface ILoginListener{
        void successfulLogin();
    }
}
