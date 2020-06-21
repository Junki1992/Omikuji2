package jp.wings.nikkeibp.omikuji2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class Omikuji2PreferenceActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(android.R.id.content, Omikuji2PreferenceFragment())
        fragmentTransaction.commit()
    }
}