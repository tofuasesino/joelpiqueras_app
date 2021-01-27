package cat.copernic.finai.joel.joelpiqueras_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.widget.Toolbar
import androidx.navigation.Navigation.findNavController
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration

class MainActivity : AppCompatActivity() {


    lateinit var toolbar: Toolbar
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        toolbar = findViewById<Toolbar>(R.id.myToolbar)
        setSupportActionBar(toolbar)
        val Ab  = supportActionBar
        //establecer el UpButton como visible y activo
        Ab?.setDisplayHomeAsUpEnabled(true)
        Ab?.setDisplayShowHomeEnabled(true)



    }
    //Funcion para que funcione el upButton de la Toolbar
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

    //Aquí inflo el menú para que aparezcan las opciones como los tres puntitos
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater: MenuInflater = menuInflater
        menuInflater.inflate(R.menu.menu_items, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item.itemId //cojo id del item para asegurar

        if (id == R.id.toast) { //hago el toast que muestra cuando se clicka el texto y lo devuelvo.
            Toast.makeText(this, "Joel Piqueras García el crack de la informática", Toast.LENGTH_LONG).show()

        }

        return super.onOptionsItemSelected(item)
    }
}