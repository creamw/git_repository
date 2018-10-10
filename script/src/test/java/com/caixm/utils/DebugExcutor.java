package com.caixm.utils;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.caixm.scriptT1.LoginT1;
import com.caixm.scriptT1.PrintTestT1;
import com.caixm.scriptT1.StartAppT1;

@RunWith(Suite.class)
@SuiteClasses({StartAppT1.class,LoginT1.class,PrintTestT1.class})
public class DebugExcutor {

}
