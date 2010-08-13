/*
 * @(#)Test.java
 *
 * Project:		JHotdraw - a GUI framework for technical drawings
 *				http://www.jhotdraw.org
 *				http://jhotdraw.sourceforge.net
 * Copyright:	(c) by the original author(s) and all contributors
 * License:		Lesser GNU Public License (LGPL)
 *				http://www.opensource.org/licenses/lgpl-license.html
 */
package org.jhotdraw.test.contrib;

// JUnitDoclet begin import
import org.jhotdraw.contrib.JPanelDesktop;
import org.jhotdraw.test.JHDTestCase;
// JUnitDoclet end import

/*
 * Generated by JUnitDoclet, a tool provided by
 * ObjectFab GmbH under LGPL.
 * Please see www.junitdoclet.org, www.gnu.org
 * and www.objectfab.de for informations about
 * the tool, the licence and the authors.
 */

// JUnitDoclet begin javadoc_class
/**
 * TestCase JPanelDesktopTest is generated by
 * JUnitDoclet to hold the tests for JPanelDesktop.
 * @see org.jhotdraw.contrib.JPanelDesktop
 */
// JUnitDoclet end javadoc_class
public class JPanelDesktopTest
// JUnitDoclet begin extends_implements
extends JHDTestCase
// JUnitDoclet end extends_implements
{
	// JUnitDoclet begin class
	// instance variables, helper methods, ... put them in this marker
	private JPanelDesktop jpaneldesktop;
	// JUnitDoclet end class

	/**
	 * Constructor JPanelDesktopTest is
	 * basically calling the inherited constructor to
	 * initiate the TestCase for use by the Framework.
	 */
	public JPanelDesktopTest(String name) {
		// JUnitDoclet begin method JPanelDesktopTest
		super(name);
		// JUnitDoclet end method JPanelDesktopTest
	}

	/**
	 * Factory method for instances of the class to be tested.
	 */
	public JPanelDesktop createInstance() throws Exception {
		// JUnitDoclet begin method testcase.createInstance
		return new JPanelDesktop(getDrawingEditor());
		// JUnitDoclet end method testcase.createInstance
	}

	/**
	 * Method setUp is overwriting the framework method to
	 * prepare an instance of this TestCase for a single test.
	 * It's called from the JUnit framework only.
	 */
	protected void setUp() throws Exception {
		// JUnitDoclet begin method testcase.setUp
		super.setUp();
		jpaneldesktop = createInstance();
		// JUnitDoclet end method testcase.setUp
	}

	/**
	 * Method tearDown is overwriting the framework method to
	 * clean up after each single test of this TestCase.
	 * It's called from the JUnit framework only.
	 */
	protected void tearDown() throws Exception {
		// JUnitDoclet begin method testcase.tearDown
		jpaneldesktop = null;
		super.tearDown();
		// JUnitDoclet end method testcase.tearDown
	}

	// JUnitDoclet begin javadoc_method getActiveDrawingView()
	/**
	 * Method testGetActiveDrawingView is testing getActiveDrawingView
	 * @see org.jhotdraw.contrib.JPanelDesktop#getActiveDrawingView()
	 */
	// JUnitDoclet end javadoc_method getActiveDrawingView()
	public void testGetActiveDrawingView() throws Exception {
		// JUnitDoclet begin method getActiveDrawingView
		// JUnitDoclet end method getActiveDrawingView
	}

	// JUnitDoclet begin javadoc_method addToDesktop()
	/**
	 * Method testAddToDesktop is testing addToDesktop
	 * @see org.jhotdraw.contrib.JPanelDesktop#addToDesktop(org.jhotdraw.framework.DrawingView, int)
	 */
	// JUnitDoclet end javadoc_method addToDesktop()
	public void testAddToDesktop() throws Exception {
		// JUnitDoclet begin method addToDesktop
		// JUnitDoclet end method addToDesktop
	}

	// JUnitDoclet begin javadoc_method removeFromDesktop()
	/**
	 * Method testRemoveFromDesktop is testing removeFromDesktop
	 * @see org.jhotdraw.contrib.JPanelDesktop#removeFromDesktop(org.jhotdraw.framework.DrawingView, int)
	 */
	// JUnitDoclet end javadoc_method removeFromDesktop()
	public void testRemoveFromDesktop() throws Exception {
		// JUnitDoclet begin method removeFromDesktop
		// JUnitDoclet end method removeFromDesktop
	}

	// JUnitDoclet begin javadoc_method removeAllFromDesktop()
	/**
	 * Method testRemoveAllFromDesktop is testing removeAllFromDesktop
	 * @see org.jhotdraw.contrib.JPanelDesktop#removeAllFromDesktop(int)
	 */
	// JUnitDoclet end javadoc_method removeAllFromDesktop()
	public void testRemoveAllFromDesktop() throws Exception {
		// JUnitDoclet begin method removeAllFromDesktop
		// JUnitDoclet end method removeAllFromDesktop
	}

	// JUnitDoclet begin javadoc_method getAllFromDesktop()
	/**
	 * Method testGetAllFromDesktop is testing getAllFromDesktop
	 * @see org.jhotdraw.contrib.JPanelDesktop#getAllFromDesktop(int)
	 */
	// JUnitDoclet end javadoc_method getAllFromDesktop()
	public void testGetAllFromDesktop() throws Exception {
		// JUnitDoclet begin method getAllFromDesktop
		// JUnitDoclet end method getAllFromDesktop
	}

	// JUnitDoclet begin javadoc_method addDesktopListener()
	/**
	 * Method testAddDesktopListener is testing addDesktopListener
	 * @see org.jhotdraw.contrib.JPanelDesktop#addDesktopListener(org.jhotdraw.contrib.DesktopListener)
	 */
	// JUnitDoclet end javadoc_method addDesktopListener()
	public void testAddDesktopListener() throws Exception {
		// JUnitDoclet begin method addDesktopListener
		// JUnitDoclet end method addDesktopListener
	}

	// JUnitDoclet begin javadoc_method removeDesktopListener()
	/**
	 * Method testRemoveDesktopListener is testing removeDesktopListener
	 * @see org.jhotdraw.contrib.JPanelDesktop#removeDesktopListener(org.jhotdraw.contrib.DesktopListener)
	 */
	// JUnitDoclet end javadoc_method removeDesktopListener()
	public void testRemoveDesktopListener() throws Exception {
		// JUnitDoclet begin method removeDesktopListener
		// JUnitDoclet end method removeDesktopListener
	}

	// JUnitDoclet begin javadoc_method testVault
	/**
	 * JUnitDoclet moves marker to this method, if there is not match
	 * for them in the regenerated code and if the marker is not empty.
	 * This way, no test gets lost when regenerating after renaming.
	 * <b>Method testVault is supposed to be empty.</b>
	 */
	// JUnitDoclet end javadoc_method testVault
	public void testVault() throws Exception {
		// JUnitDoclet begin method testcase.testVault
		// JUnitDoclet end method testcase.testVault
	}

}
