package `in`.ernb.dagger.degger.modules

import `in`.ernb.dagger.interfaces.Engine
import `in`.ernb.dagger.degger.PetrolEngine
import dagger.Binds
import dagger.Module

/**
 * Author Nadeem Bhat ,
 * Created by Nadeem Bhat on Saturday, Jun, 2020.
 * Copy Right (c) 12:58 PM.
 * Srinagar,Kashmir
 * ennennbee@gmail.com
 * Dagger
 */
@Module
abstract class PetrolEngineModule {

    @Binds
   abstract fun provideEngine(petrolEngine: PetrolEngine): Engine
}

