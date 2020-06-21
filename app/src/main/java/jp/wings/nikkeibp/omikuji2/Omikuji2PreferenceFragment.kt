package jp.wings.nikkeibp.omikuji2

import android.os.Bundle
import android.preference.PreferenceFragment

class Omikuji2PreferenceFragment: PreferenceFragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        addPreferencesFromResource(R.xml.preference)
    }
}