package bargames.android.app;

import com.google.android.maps.MapActivity;

import android.app.Activity;
import android.os.Bundle;

public class BarGamesActivity extends MapActivity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        initDB();
    }

    protected void initDB(){
        openOrCreateDatabase(LFnC.localDBName, MODE_PRIVATE, null);

    }
    @Override
    protected boolean isRouteDisplayed() {
        // TODO Auto-generated method stub
        return false;
    }
}
