# Learn_Service


https://user-images.githubusercontent.com/77660268/176121877-a13512c6-4008-401f-9492-52eb19dc0d1b.mp4


---
code for Service Activity
---

```java
public class MainActivity extends Service {


    MediaPlayer player;

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {

        player = MediaPlayer.create(this, Settings.System.DEFAULT_RINGTONE_URI);


        player.setLooping(true);

        player.start();

        // return the status of the program

        return  START_STICKY;
    }

    @Override
    public void onDestroy() {
        player.stop();
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
```

Code for MainActivity.java
---

```java
public class ServiceMain extends AppCompatActivity {

    RelativeLayout start;
    RelativeLayout stop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service_main);

        start = (RelativeLayout) findViewById(R.id.StartButton);
        stop = (RelativeLayout)findViewById(R.id.StopButton);


        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startService(new Intent(ServiceMain.this,MainActivity.class));

            }
        });

        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopService(new Intent(ServiceMain.this,MainActivity.class));
            }
        });
    }
}
---
