package hu.am2.navigationactionbug

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.os.bundleOf
import androidx.navigation.fragment.NavHostFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val host = supportFragmentManager.findFragmentById(R.id.navHostFragment) as NavHostFragment
        val navController = host.navController
        val bundle2 = bundleOf("type" to 2)
        actionOneBtn.setOnClickListener { navController.navigate(R.id.action_one)}
        actionTwoBtn.setOnClickListener { navController.navigate(R.id.action_two, bundle2)}
        actionThreeBtn.setOnClickListener { navController.navigate(R.id.global_action)}
    }
}
