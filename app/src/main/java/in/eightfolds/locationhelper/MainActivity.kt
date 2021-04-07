package `in`.eightfolds.locationhelper

//import `in`.eightfolds.mylocationhelper.LibActivity
//import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        val inKM=LocationHelper.getDistanceInKM(5000f)
//        Log.d("KM",inKM.toString());

        findViewById<Button>(R.id.mainButton).setOnClickListener {
//            val intent=Intent(this,LibActivity::class.java)
//            startActivity(intent)
        }
    }
}