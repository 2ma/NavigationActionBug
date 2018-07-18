package hu.am2.navigationactionbug

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.NavHostFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val host = supportFragmentManager.findFragmentById(R.id.navHostFragment) as NavHostFragment
        val navController = host.navController
        actionOneBtn.setOnClickListener { navController.navigate(ArgFragmentDirections.actionOne())}
        actionTwoBtn.setOnClickListener { navController.navigate(ArgFragmentDirections.actionTwo(2))}
        actionThreeBtn.setOnClickListener { navController.navigate(NavigationDirections.globalAction())}
    }
}
