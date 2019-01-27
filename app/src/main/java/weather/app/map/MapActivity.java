package weather.app.map;

import android.os.Bundle;
import weather.app.R;
import weather.app.base.BaseActivity;

public class MapActivity extends BaseActivity implements MapMvpView {

  private MapMvpPresenter<MapMvpView> presenter;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
  }
}
