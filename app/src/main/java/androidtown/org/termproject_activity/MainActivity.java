package androidtown.org.termproject_activity;

import android.content.Intent;
import android.os.Bundle;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.Toast;
import android.widget.TextView;
import android.view.View;
import android.widget.Button;



import androidx.appcompat.app.AppCompatActivity;

import java.util.Locale;

import static java.sql.DriverManager.println;


public class MainActivity  extends AppCompatActivity{

    Button home;
    Button refrigerator;
    Button recipe;
    Button setting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.InitializeView();
        this.SetListener();
    }

    private void InitializeView() {
        home = (Button) findViewById(R.id.home_button);
        refrigerator = (Button) findViewById(R.id.refrigerator_button);
        recipe = (Button) findViewById(R.id.recipe_button);
        setting = (Button) findViewById(R.id.setting_button);
    }

    private void SetListener() {
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });

        refrigerator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Refrigerator.class);
                startActivity(intent);
            }
        });

        recipe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), RecipeActivity.class);
                startActivity(intent);
            }
        });

        setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SettingActivity.class);
                startActivity(intent);
            }
        });
    }
}