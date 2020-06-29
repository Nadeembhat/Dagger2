package `in`.ernb.dagger

import `in`.ernb.dagger.carParts.Car
import `in`.ernb.dagger.degger.DieselEngine
import `in`.ernb.dagger.degger.modules.DieselEngineModule
import `in`.ernb.dagger.interfaces.DaggerCarComponent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

  @Inject  lateinit var car: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val component = DaggerCarComponent.builder().horsepower(1500).engineCapacity(1400) .build()
        component.injectClass(this)
        car.drive()

    }
}
