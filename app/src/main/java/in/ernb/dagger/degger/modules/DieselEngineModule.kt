package `in`.ernb.dagger.degger.modules


import `in`.ernb.dagger.degger.DieselEngine
import `in`.ernb.dagger.interfaces.Engine
import dagger.Module
import dagger.Provides
import javax.inject.Inject

/**
 * Author Nadeem Bhat ,
 * Created by Nadeem Bhat on Saturday, Jun, 2020.
 * Copy Right (c) 12:58 PM.
 * Srinagar,Kashmir
 * ennennbee@gmail.com
 * Dagger
 */
@Module
 class DieselEngineModule (var horsePower:Int) {

    @Provides
    fun provideHorsePower():Int{
        return horsePower
    }


    @Provides
    fun provideEngine(dieselEngine: DieselEngine): Engine{
        return dieselEngine
    }
}

