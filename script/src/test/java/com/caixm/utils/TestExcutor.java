package com.caixm.utils;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.caixm.script.Login;
import com.caixm.script.PrintTest;
import com.caixm.script.StartApp;

@RunWith(Suite.class)
@SuiteClasses({StartApp.class,Login.class,PrintTest.class})
//@SuiteClasses({PrintTest.class})
//T1mini测试case
public class TestExcutor {

}

