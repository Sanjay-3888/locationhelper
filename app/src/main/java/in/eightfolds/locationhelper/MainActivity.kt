package `in`.eightfolds.locationhelper

//import `in`.eightfolds.mylocationhelper.LibActivity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        val inKM=LocationHelper.getDistanceInKM(5000f)
//        Log.d("KM",inKM.toString());

//        findViewById<Button>(R.id.mainButton).setOnClickListener {
//            val intent=Intent(this,LibActivity::class.java)
//            intent.putExtra("Name",findViewById<EditText>(R.id.nameET).text.toString())
//            intent.putExtra("Gender",findViewById<EditText>(R.id.genderET).text.toString())
//            intent.putExtra("Age",findViewById<EditText>(R.id.ageET).text.toString())
//            startActivity(intent)
//        }
    }
}