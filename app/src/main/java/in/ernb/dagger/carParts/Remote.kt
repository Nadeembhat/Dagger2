package `in`.ernb.dagger.carParts

import `in`.ernb.dagger.carParts.Car
import android.util.Log
import javax.inject.Inject

/**
 * Author Nadeem Bhat ,
 * Created by Nadeem Bhat on Wednesday, Jun, 2020.
 * Copy Right (c) 9:18 PM.
 * Srinagar,Kashmir
 * ennennbee@gmail.com
 * Dagger
 */


class Remote @Inject constructor() {

    fun setListner(car: Car){
        Log.e("Car\t","Remote Connected")
    }
}