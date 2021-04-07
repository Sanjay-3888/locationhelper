package `in`.eightfolds.mylocationhelper

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class LibActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lib)
        val name=intent.getStringExtra("Name").toString()
        val gender=intent.getStringExtra("Gender").toString()
        val age=intent.getStringExtra("Age").toString()
        findViewById<TextView>(R.id.nameTV).text="Name: $name"
        findViewById<TextView>(R.id.genderTV).text="Gender: $gender"
        findViewById<TextView>(R.id.ageTV).text="Age: $age"
        findViewById<Button>(R.id.libButton).setOnClickListener {
            Toast.makeText(this, "Lib button clicked", Toast.LENGTH_LONG).show()
        }
    }
}