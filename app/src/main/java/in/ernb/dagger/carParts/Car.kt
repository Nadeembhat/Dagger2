package `in`.ernb.dagger.carParts

import `in`.ernb.dagger.interfaces.Engine
import android.util.Log
import javax.inject.Inject

/**
 * Author Nadeem Bhat ,
 * Created by Nadeem Bhat on Wednesday, Jun, 2020.
 * Copy Right (c) 7:23 PM.
 * Srinagar,Kashmir
 * ennennbee@gmail.com
 * Dagger
 */


class Car @Inject constructor(var engine: Engine, var wheels: Wheels) {
    private val TAG:String = "Car"

 fun drive(){
     Log.e(TAG+"\t","Driving...")
 }

    @Inject
    fun enableRemote(remote: Remote){
        remote.setListner(this)
        engine.start()
    }

}