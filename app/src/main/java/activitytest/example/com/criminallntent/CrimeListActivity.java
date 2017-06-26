package activitytest.example.com.criminallntent;

import android.support.v4.app.Fragment;

/**
 * Created by Administrator on 2017/6/26 0026.
 */

public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
