package edu.nku.parking;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class LoginFragment extends Fragment
{



    @Override
    public void onAttach( Activity activity )
    {
        super.onAttach( activity ) ;

    }

    @Override
    public void onCreate( Bundle state )
    {
        super.onCreate( state ) ;

    }
    @Override
    public View onCreateView( LayoutInflater inflater, ViewGroup container, Bundle state )
    {
        System.out.println( "onCreateView fired" ) ;

        View v = inflater.inflate( R.layout.fragment_login, container ) ;


        return v ;
    }


    public void onActivityCreated( Bundle state )
    {
        super.onActivityCreated( state ) ;
    }

    @Override
    public void onStart( )
    {
        super.onStart( ) ;
    }

    @Override
    public void onResume( )
    {
        super.onResume() ;
    }

    @Override
    public void onPause( )
    {
        super.onPause( ) ;
    }
    @Override
    public void onSaveInstanceState( Bundle state )
    {
        super.onSaveInstanceState( state ) ;
    }
    @Override
    public void onStop( )
    {
        super.onStop() ;
    }

    @Override
    public void onDestroyView( )
    {
        super.onDestroyView( ) ;
    }

    @Override
    public void onDestroy( )
    {
        super.onDestroy( ) ;
    }

    @Override
    public void onDetach( )
    {
        super.onDetach( ) ;
    }


}