/*
 * The MIT License
 *
 * Copyright 2016 oliviagraham.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.livgrhm.kansas.core;

/**
 *
 * @author oliviagraham
 */
public class Test {
    private int testId;
    private String testContent;
    
    public Test () { }
    
    public Test(int testId, String testContent) {
        this.testId = testId;
        this.testContent = testContent;
    }

    /**
     * @return the testId
     */
    public int getTestId() {
        return testId;
    }

    /**
     * @param testId the testId to set
     */
    public void setTestId(int testId) {
        this.testId = testId;
    }

    /**
     * @return the testContent
     */
    public String getTestContent() {
        return testContent;
    }

    /**
     * @param testContent the testContent to set
     */
    public void setTestContent(String testContent) {
        this.testContent = testContent;
    }   
}