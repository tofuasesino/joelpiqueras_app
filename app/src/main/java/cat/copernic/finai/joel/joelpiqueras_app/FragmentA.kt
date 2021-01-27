package cat.copernic.finai.joel.joelpiqueras_app

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController

class FragmentA : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_a3, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val button1 = view.findViewById<Button>(R.id.btn1) //estas dos variables me encuentran por id los botones 1 y 2, para ir a los fragmentos b y c
        val button2 = view.findViewById<Button>(R.id.btn2)
        button1.setOnClickListener { //aqui hago un listener que escucha hasta que detecta una accion en el boton 1
            findNavController().navigate(R.id.action_fragmentA_to_fragmentB)
        }

        button2.setOnClickListener { //lo mismo que en el 1 pero en el 2
            findNavController().navigate(R.id.action_fragmentA_to_fragmentC)
        }
    }

}