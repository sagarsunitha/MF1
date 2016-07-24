package com.MatchesF.project;


import com.MatchesF.Project.DriverManager;

import java.io.IOException;

/**
 * Created by NSAI on 19/05/2016.
 */
public class Hooks {

    DriverManager dm = new DriverManager();

    //@Before
    public void setup()throws IOException {
        dm.openBrowser();
    }

    //@After
    public void teardown() throws IOException(){

    }
}
