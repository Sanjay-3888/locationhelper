package `in`.eightfolds.mylocationhelper

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class LibActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lib)
        findViewById<Button>(R.id.libButton).setOnClickListener {
            Toast.makeText(this, "Lib button clicked", Toast.LENGTH_LONG).show()
        }
    }
}