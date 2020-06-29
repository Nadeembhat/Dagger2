package `in`.ernb.dagger.degger

import `in`.ernb.dagger.interfaces.Engine
import android.util.Log
import javax.inject.Inject
import javax.inject.Named

/**
 * Author Nadeem Bhat ,
 * Created by Nadeem Bhat on Saturday, Jun, 2020.
 * Copy Right (c) 12:50 PM.
 * Srinagar,Kashmir
 * ennennbee@gmail.com
 * Dagger
 */


class PetrolEngine @Inject constructor(@Named("Horse Power")var horsepower:Int,@Named("Engine Capacity") var enginecapacity :Int) : Engine {
        private val TAG:String="Car"
    override fun start() {
        Log.e(TAG+"\t","Petrol Engine Started and with HorsePOwer :\t"+horsepower+"\t Engine Capacity\t"+enginecapacity)
    }
}