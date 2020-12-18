package tests;

import com.sun.jna.platform.win32.WinDef;
import org.sikuli.script.*;
import reports.TestNGListener;
import ie.curiositysoftware.testmodeller.TestModellerPath;
import ie.curiositysoftware.testmodeller.TestModellerSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import ie.curiositysoftware.allocation.dto.ResultMergeMethod;
import ie.curiositysoftware.allocation.dto.DataAllocationRow;
import ie.curiositysoftware.allocation.dto.DataAllocationResult;
import ie.curiositysoftware.allocation.engine.DataAllocation;

import utilities.testmodeller.TestModellerLogger;

//http://modeller.dev.testinsights.io/app/#!/model-engine/guid/25f69afd-2cc9-416b-a47f-e83004e7d354
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 285, profileId = 101033)
public class Register_DefaultProfile extends TestBase
{
    @Test
    public void exampleTest()
    {
        Screen s = new Screen();

        try{
            s.wait("windowsIcon.png");
            s.click("windowsIcon.png");

            s.click("search.png");

            s.type("Start or Configure Sessions");

            s.click("openIBM.png");


            if (s.exists("openDB2.png") == null) {
                s.click("openIbmWindow.png");
            }

            s.doubleClick("openDB2");

            s.wait("login.png", 1000);

            s.type("IDSGCP23" + Key.ENTER);

            if (s.exists("wrongSystemError.PNG") != null) {
                System.out.println("error");
            }

            System.out.println(s.text());

            if (s.text().contains("DEBUG TOOL")) {
                System.out.println("here");
            }

            s.type("T3 James" + Key.ENTER);

            s.wait("logonScreen.PNG");

            s.type("jamesW01" + Key.ENTER);
        }

        catch(FindFailed e){
            e.printStackTrace();
        }
    }

    @Test
    public void GeorgeexampleTest() {
        Screen s = new Screen();

        try {
           // s.wait("G-WindowsIcon.png");
            s.click("G-WindowsIcon.png");

            s.click("G-search.png");

            s.type("Start or Configure Sessions");

            s.click("G-openIBM.png");

            s.click("G-startIBM");

            s.type("d", KeyModifier.WIN);

            s.wait("G-AS400Shortcut.png");

            s.doubleClick("G-AS400Shortcut.png");

            s.wait("G-AS400okay.png");

            s.click("G-AS400okay.png");

        } catch (FindFailed e) {
            e.printStackTrace();
        }

    }





}
