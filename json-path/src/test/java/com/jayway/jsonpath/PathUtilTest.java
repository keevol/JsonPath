package com.jayway.jsonpath;

import org.junit.Test;

import static org.junit.Assert.assertFalse;

/**
 * Created by IntelliJ IDEA.
 * User: kallestenflo
 * Date: 2/3/11
 * Time: 9:58 PM
 */
public class PathUtilTest {


    @Test
    public void wildcard_is_not_definite() throws Exception {
        assertFalse(PathUtil.isPathDefinite("$..book[0]"));
    }


}
