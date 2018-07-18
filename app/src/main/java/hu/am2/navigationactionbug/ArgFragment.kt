package hu.am2.navigationactionbug


import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment


class ArgFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val v = inflater.inflate(R.layout.fragment_arg, container, false)

        /*val a = arguments?.let {
            val safeArg = ArgFragmentArgs.fromBundle(it)
            safeArg.type
        }*/
        val a = arguments?.get("type")

        v.findViewById<TextView>(R.id.argumentsText).text = "$a"
        Log.d(TAG, "$a")
        return v
    }
}

private const val TAG = "ArgFragment"
