package ar.com.juanek;


import org.apache.wicket.spring.injection.annot.SpringComponentInjector;
import org.apache.wicket.spring.test.ApplicationContextMock;
import org.apache.wicket.util.tester.WicketTester;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;

/**
 * Simple test using the WicketTester
 */
public class TestHomePage
{

	protected WicketTester tester;

	protected ApplicationContextMock ctx;

	protected WicketApplication application;

	@Before
	public void setUp()
	{
		tester = new WicketTester();
		ctx = new ApplicationContextMock();

		SpringComponentInjector springInjector = new SpringComponentInjector(
				tester.getApplication(), ctx);

		tester.getApplication().getComponentInstantiationListeners().add(springInjector);

	}

	@Test
	public void homepageRendersSuccessfully()
	{
		ctx.putBean(new Service());
		ctx.putBean(new ISessionBean() {
			@Override
			public String getHttpSessionId() {
				return "12345";
			}
		});

		//start and render the test page
		tester.startPage(HomePage.class);

		//assert rendered page class
		tester.assertRenderedPage(HomePage.class);
	}
}
