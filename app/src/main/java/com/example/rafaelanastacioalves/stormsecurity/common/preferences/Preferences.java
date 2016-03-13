package com.example.rafaelanastacioalves.stormsecurity.common.preferences;

import org.androidannotations.annotations.sharedpreferences.DefaultString;
import org.androidannotations.annotations.sharedpreferences.SharedPref;


@SharedPref(value = SharedPref.Scope.UNIQUE)
public interface Preferences {

    @DefaultString("")
    String news();

}