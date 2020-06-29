package `in`.ernb.dagger.degger

import `in`.ernb.dagger.interfaces.Engine
import android.util.Log
import javax.inject.Inject

/**
 * Author Nadeem Bhat ,
 * Created by Nadeem Bhat on Saturday, Jun, 2020.
 * Copy Right (c) 3:36 PM.
 * Srinagar,Kashmir
 * ennennbee@gmail.com
 * Dagger
 */


class DieselEngine @Inject constructor(var horsepower: Int) : Engine {
    private val TAG: String = "Car"

    override fun start() {
        Log.e(TAG + "\t", "Diesel Engine Started and HorsePower is:"+horsepower)
    }
}