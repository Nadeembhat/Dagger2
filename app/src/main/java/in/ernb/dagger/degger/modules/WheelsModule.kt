package `in`.ernb.dagger.degger.modules

import `in`.ernb.dagger.carParts.Rims
import `in`.ernb.dagger.carParts.Tyres
import `in`.ernb.dagger.carParts.Wheels
import dagger.Module
import dagger.Provides

/**
 * Author Nadeem Bhat ,
 * Created by Nadeem Bhat on Wednesday, Jun, 2020.
 * Copy Right (c) 9:37 PM.
 * Srinagar,Kashmir
 * ennennbee@gmail.com
 * Dagger
 */

@Module //modules are classes that contributes to the object graph
abstract class WheelsModule {


    companion object {
        @JvmStatic
        @Provides
        fun provideRims(): Rims {
            return Rims()
        }

        @Provides
        fun provideTyres(): Tyres {
            val tyres = Tyres()
            tyres.inflate()
            return tyres
        }

        @Provides
        fun provideWheels(rims: Rims, tyres: Tyres): Wheels {
            return Wheels(rims, tyres)
        }
    }
}