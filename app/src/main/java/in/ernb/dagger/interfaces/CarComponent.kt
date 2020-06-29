package `in`.ernb.dagger.interfaces

import `in`.ernb.dagger.carParts.Car
import `in`.ernb.dagger.MainActivity
import `in`.ernb.dagger.degger.modules.DieselEngineModule
import `in`.ernb.dagger.degger.modules.PetrolEngineModule
import `in`.ernb.dagger.degger.modules.WheelsModule
import dagger.Binds
import dagger.BindsInstance
import dagger.Component
import javax.inject.Named

/**
 * Author Nadeem Bhat ,
 * Created by Nadeem Bhat on Wednesday, Jun, 2020.
 * Copy Right (c) 8:48 PM.
 * Srinagar,Kashmir
 * ennennbee@gmail.com
 * Dagger
 */

@Component (modules = arrayOf(
   WheelsModule::class,
   PetrolEngineModule::class))
interface CarComponent {

   fun getCar(): Car

   fun injectClass(activityClass: MainActivity)

   @Component.Builder
   interface Builder{

      @BindsInstance
      fun horsepower(@Named("Horse Power") horsePower:Int):Builder

      @BindsInstance
      fun engineCapacity(@Named("Engine Capacity") engineCapacity:Int):Builder

      fun build():CarComponent
   }
}