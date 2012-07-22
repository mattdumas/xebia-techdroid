package fr.xebia.xke.techdroid.test;

import android.test.ActivityInstrumentationTestCase2;

import com.jayway.android.robotium.solo.Solo;

import fr.xebia.xke.techdroid.app.DashboardActivity;

public class DashBoardActivityTest extends ActivityInstrumentationTestCase2<DashboardActivity> {

  private Solo mSolo;

  public DashBoardActivityTest() {
    super(DashboardActivity.class);
  }

  @Override
  protected void setUp() throws Exception {
    super.setUp();
    mSolo = new Solo(getInstrumentation(), getActivity());
  }

  @Override
  protected void tearDown() throws Exception {
    try {
      mSolo.finalize();
    } catch (final Throwable e) {
      e.printStackTrace();
    }
    getActivity().finish();
    super.tearDown();
  }

  public void testHomeActivity() {
    assertNotNull(getActivity());
    assertTrue(mSolo.searchText("Hello world!"));
  }
}
