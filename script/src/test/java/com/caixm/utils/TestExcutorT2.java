package com.caixm.utils;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.caixm.scriptT2.LoginT2;
import com.caixm.scriptT2.PrintTestT2;
import com.caixm.scriptT2.StartAppT2;

@RunWith(Suite.class)
@SuiteClasses({StartAppT2.class,LoginT2.class,PrintTestT2.class})
public class TestExcutorT2 {

}
