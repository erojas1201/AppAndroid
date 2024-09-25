import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) // Asegúrate de que el nombre del layout sea correcto
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.option1 -> {
                // Acción para Opción 1
                true
            }
            R.id.option2 -> {
                // Acción para Opción 2
                true
            }
            R.id.option3 -> {
                // Acción para Opción 3
                true
            }
            R.id.option4 -> {
                // Acción para Opción 4
                true
            }
            R.id.option5 -> {
                // Acción para Opción 5
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}
