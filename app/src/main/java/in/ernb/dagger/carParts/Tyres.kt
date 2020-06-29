package `in`.ernb.dagger.carParts

import android.util.Log
import javax.inject.Inject

/**
 * Author Nadeem Bhat ,
 * Created by Nadeem Bhat on Wednesday, Jun, 2020.
 * Copy Right (c) 8:35 PM.
 * Srinagar,Kashmir
 * ennennbee@gmail.com
 * Dagger
 */


class Tyres @Inject constructor() {

    fun inflate(){
        Log.e("Car\t","Tyres Inflated")
    }
}